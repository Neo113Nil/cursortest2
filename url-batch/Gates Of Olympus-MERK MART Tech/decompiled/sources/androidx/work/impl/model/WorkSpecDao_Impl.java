package androidx.work.impl.model;

import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;

/* compiled from: WorkSpecDao_Impl.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00130\u0018H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00130\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J\"\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00130!2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010#\u001a\u00020\u0011H\u0016J\u001c\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00130!2\u0006\u0010#\u001a\u00020\u0011H\u0016J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00130\u00182\u0006\u0010#\u001a\u00020\u0011H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00130\u00182\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00130!2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010#\u001a\u00020\u0011H\u0016J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020/0!H\u0016J\u0018\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00182\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u00103\u001a\u000204H\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u00107\u001a\u000204H\u0016J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\b0\u00132\u0006\u0010;\u001a\u000201H\u0016J\b\u0010<\u001a\u000204H\u0016J\u0010\u0010=\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010>\u001a\u0002042\u0006\u0010?\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010@\u001a\u0002042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010A\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010B\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010C\u001a\u00020*H\u0016J\u0018\u0010D\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010E\u001a\u000201H\u0016J\u0010\u0010F\u001a\u0002042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010G\u001a\u0002042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010H\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010I\u001a\u000201H\u0016J\u0018\u0010J\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010K\u001a\u000204H\u0016J\u0018\u0010L\u001a\u0002042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010M\u001a\u000201H\u0016J\b\u0010N\u001a\u000204H\u0016J\b\u0010O\u001a\u00020\fH\u0016J\u0010\u0010P\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010Q\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010R\u001a\u000204H\u0016J*\u0010S\u001a\u00020\f2\u0006\u0010T\u001a\u00020U2\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110X0WH\u0002J*\u0010Y\u001a\u00020\f2\u0006\u0010T\u001a\u00020U2\u0018\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0X0WH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Landroidx/work/impl/model/WorkSpecDao_Impl;", "Landroidx/work/impl/model/WorkSpecDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfWorkSpec", "Landroidx/room/EntityInsertAdapter;", "Landroidx/work/impl/model/WorkSpec;", "__updateAdapterOfWorkSpec", "Landroidx/room/EntityDeleteOrUpdateAdapter;", "insertWorkSpec", "", "workSpec", "updateWorkSpec", "getWorkSpec", "id", "", "getWorkSpecIdAndStatesForName", "", "Landroidx/work/impl/model/WorkSpec$IdAndState;", "name", "getAllWorkSpecIds", "getAllWorkSpecIdsLiveData", "Landroidx/lifecycle/LiveData;", "getState", "Landroidx/work/WorkInfo$State;", "getWorkStatusPojoForId", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkStatusPojoForIds", "ids", "getWorkStatusPojoLiveDataForIds", "getWorkStatusPojoFlowDataForIds", "Lkotlinx/coroutines/flow/Flow;", "getWorkStatusPojoForTag", "tag", "getWorkStatusPojoFlowForTag", "getWorkStatusPojoLiveDataForTag", "getWorkStatusPojoForName", "getWorkStatusPojoLiveDataForName", "getWorkStatusPojoFlowForName", "getInputsFromPrerequisites", "Landroidx/work/Data;", "getUnfinishedWorkWithTag", "getUnfinishedWorkWithName", "getAllUnfinishedWork", "hasUnfinishedWorkFlow", "", "getScheduleRequestedAtLiveData", "", "getEligibleWorkForScheduling", "schedulerLimit", "", "getEligibleWorkForSchedulingWithContentUris", "getAllEligibleWorkSpecsForScheduling", "maxLimit", "getScheduledWork", "getRunningWork", "getRecentlyCompletedWork", "startingAt", "countNonFinishedContentUriTriggerWorkers", "delete", "setState", "state", "setCancelledState", "incrementPeriodCount", "setOutput", "output", "setLastEnqueueTime", "enqueueTime", "incrementWorkSpecRunAttemptCount", "resetWorkSpecRunAttemptCount", "setNextScheduleTimeOverride", "nextScheduleTimeOverrideMillis", "resetWorkSpecNextScheduleTimeOverride", "overrideGeneration", "markWorkSpecScheduled", "startTime", "resetScheduledState", "pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast", "incrementGeneration", "setStopReason", "stopReason", "__fetchRelationshipWorkTagAsjavaLangString", "_connection", "Landroidx/sqlite/SQLiteConnection;", "_map", "Landroidx/collection/ArrayMap;", "", "__fetchRelationshipWorkProgressAsandroidxWorkData", "Companion", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<WorkSpec> __insertAdapterOfWorkSpec;
    private final EntityDeleteOrUpdateAdapter<WorkSpec> __updateAdapterOfWorkSpec;

    public WorkSpecDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkSpec = new EntityInsertAdapter<WorkSpec>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, WorkSpec entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8890bindText(1, entity.id);
                statement.mo8888bindLong(2, WorkTypeConverters.stateToInt(entity.state));
                statement.mo8890bindText(3, entity.workerClassName);
                statement.mo8890bindText(4, entity.inputMergerClassName);
                statement.mo8886bindBlob(5, Data.INSTANCE.toByteArrayInternalV1(entity.input));
                statement.mo8886bindBlob(6, Data.INSTANCE.toByteArrayInternalV1(entity.output));
                statement.mo8888bindLong(7, entity.initialDelay);
                statement.mo8888bindLong(8, entity.intervalDuration);
                statement.mo8888bindLong(9, entity.flexDuration);
                statement.mo8888bindLong(10, entity.runAttemptCount);
                statement.mo8888bindLong(11, WorkTypeConverters.backoffPolicyToInt(entity.backoffPolicy));
                statement.mo8888bindLong(12, entity.backoffDelayDuration);
                statement.mo8888bindLong(13, entity.lastEnqueueTime);
                statement.mo8888bindLong(14, entity.minimumRetentionDuration);
                statement.mo8888bindLong(15, entity.scheduleRequestedAt);
                statement.mo8888bindLong(16, entity.expedited ? 1L : 0L);
                statement.mo8888bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(entity.outOfQuotaPolicy));
                statement.mo8888bindLong(18, entity.getPeriodCount());
                statement.mo8888bindLong(19, entity.getGeneration());
                statement.mo8888bindLong(20, entity.getNextScheduleTimeOverride());
                statement.mo8888bindLong(21, entity.getNextScheduleTimeOverrideGeneration());
                statement.mo8888bindLong(22, entity.getStopReason());
                String traceTag = entity.getTraceTag();
                if (traceTag == null) {
                    statement.mo8889bindNull(23);
                } else {
                    statement.mo8890bindText(23, traceTag);
                }
                Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
                if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
                    statement.mo8889bindNull(24);
                } else {
                    statement.mo8888bindLong(24, r3.intValue());
                }
                Constraints constraints = entity.constraints;
                statement.mo8888bindLong(25, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                statement.mo8886bindBlob(26, WorkTypeConverters.fromNetworkRequest$work_runtime_release(constraints.getRequiredNetworkRequestCompat()));
                statement.mo8888bindLong(27, constraints.getRequiresCharging() ? 1L : 0L);
                statement.mo8888bindLong(28, constraints.getRequiresDeviceIdle() ? 1L : 0L);
                statement.mo8888bindLong(29, constraints.getRequiresBatteryNotLow() ? 1L : 0L);
                statement.mo8888bindLong(30, constraints.getRequiresStorageNotLow() ? 1L : 0L);
                statement.mo8888bindLong(31, constraints.getContentTriggerUpdateDelayMillis());
                statement.mo8888bindLong(32, constraints.getContentTriggerMaxDelayMillis());
                statement.mo8886bindBlob(33, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
            }
        };
        this.__updateAdapterOfWorkSpec = new EntityDeleteOrUpdateAdapter<WorkSpec>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.2
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            protected String createQuery() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityDeleteOrUpdateAdapter
            public void bind(SQLiteStatement statement, WorkSpec entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo8890bindText(1, entity.id);
                statement.mo8888bindLong(2, WorkTypeConverters.stateToInt(entity.state));
                statement.mo8890bindText(3, entity.workerClassName);
                statement.mo8890bindText(4, entity.inputMergerClassName);
                statement.mo8886bindBlob(5, Data.INSTANCE.toByteArrayInternalV1(entity.input));
                statement.mo8886bindBlob(6, Data.INSTANCE.toByteArrayInternalV1(entity.output));
                statement.mo8888bindLong(7, entity.initialDelay);
                statement.mo8888bindLong(8, entity.intervalDuration);
                statement.mo8888bindLong(9, entity.flexDuration);
                statement.mo8888bindLong(10, entity.runAttemptCount);
                statement.mo8888bindLong(11, WorkTypeConverters.backoffPolicyToInt(entity.backoffPolicy));
                statement.mo8888bindLong(12, entity.backoffDelayDuration);
                statement.mo8888bindLong(13, entity.lastEnqueueTime);
                statement.mo8888bindLong(14, entity.minimumRetentionDuration);
                statement.mo8888bindLong(15, entity.scheduleRequestedAt);
                statement.mo8888bindLong(16, entity.expedited ? 1L : 0L);
                statement.mo8888bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(entity.outOfQuotaPolicy));
                statement.mo8888bindLong(18, entity.getPeriodCount());
                statement.mo8888bindLong(19, entity.getGeneration());
                statement.mo8888bindLong(20, entity.getNextScheduleTimeOverride());
                statement.mo8888bindLong(21, entity.getNextScheduleTimeOverrideGeneration());
                statement.mo8888bindLong(22, entity.getStopReason());
                String traceTag = entity.getTraceTag();
                if (traceTag == null) {
                    statement.mo8889bindNull(23);
                } else {
                    statement.mo8890bindText(23, traceTag);
                }
                Boolean backOffOnSystemInterruptions = entity.getBackOffOnSystemInterruptions();
                if ((backOffOnSystemInterruptions != null ? Integer.valueOf(backOffOnSystemInterruptions.booleanValue() ? 1 : 0) : null) == null) {
                    statement.mo8889bindNull(24);
                } else {
                    statement.mo8888bindLong(24, r4.intValue());
                }
                Constraints constraints = entity.constraints;
                statement.mo8888bindLong(25, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                statement.mo8886bindBlob(26, WorkTypeConverters.fromNetworkRequest$work_runtime_release(constraints.getRequiredNetworkRequestCompat()));
                statement.mo8888bindLong(27, constraints.getRequiresCharging() ? 1L : 0L);
                statement.mo8888bindLong(28, constraints.getRequiresDeviceIdle() ? 1L : 0L);
                statement.mo8888bindLong(29, constraints.getRequiresBatteryNotLow() ? 1L : 0L);
                statement.mo8888bindLong(30, constraints.getRequiresStorageNotLow() ? 1L : 0L);
                statement.mo8888bindLong(31, constraints.getContentTriggerUpdateDelayMillis());
                statement.mo8888bindLong(32, constraints.getContentTriggerMaxDelayMillis());
                statement.mo8886bindBlob(33, WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers()));
                statement.mo8890bindText(34, entity.id);
            }
        };
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(final WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit insertWorkSpec$lambda$0;
                insertWorkSpec$lambda$0 = WorkSpecDao_Impl.insertWorkSpec$lambda$0(WorkSpecDao_Impl.this, workSpec, (SQLiteConnection) obj);
                return insertWorkSpec$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertWorkSpec$lambda$0(WorkSpecDao_Impl workSpecDao_Impl, WorkSpec workSpec, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        workSpecDao_Impl.__insertAdapterOfWorkSpec.insert(_connection, (SQLiteConnection) workSpec);
        return Unit.INSTANCE;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void updateWorkSpec(final WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit updateWorkSpec$lambda$1;
                updateWorkSpec$lambda$1 = WorkSpecDao_Impl.updateWorkSpec$lambda$1(WorkSpecDao_Impl.this, workSpec, (SQLiteConnection) obj);
                return updateWorkSpec$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateWorkSpec$lambda$1(WorkSpecDao_Impl workSpecDao_Impl, WorkSpec workSpec, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        workSpecDao_Impl.__updateAdapterOfWorkSpec.handle(_connection, workSpec);
        return Unit.INSTANCE;
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "SELECT * FROM workspec WHERE id=?";
        return (WorkSpec) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                WorkSpec workSpec$lambda$3;
                workSpec$lambda$3 = WorkSpecDao_Impl.getWorkSpec$lambda$3(str, id, (SQLiteConnection) obj);
                return workSpec$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkSpec getWorkSpec$lambda$3(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "content_uri_triggers");
            WorkSpec workSpec = null;
            Boolean bool = null;
            if (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(columnIndexOrThrow2));
                String text2 = prepare.getText(columnIndexOrThrow3);
                String text3 = prepare.getText(columnIndexOrThrow4);
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow5));
                Data fromByteArray2 = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                long j = prepare.getLong(columnIndexOrThrow7);
                long j2 = prepare.getLong(columnIndexOrThrow8);
                long j3 = prepare.getLong(columnIndexOrThrow9);
                int i = (int) prepare.getLong(columnIndexOrThrow10);
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                long j4 = prepare.getLong(columnIndexOrThrow12);
                long j5 = prepare.getLong(columnIndexOrThrow13);
                long j6 = prepare.getLong(columnIndexOrThrow14);
                long j7 = prepare.getLong(columnIndexOrThrow15);
                boolean z = ((int) prepare.getLong(columnIndexOrThrow16)) != 0;
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) prepare.getLong(columnIndexOrThrow17));
                int i2 = (int) prepare.getLong(columnIndexOrThrow18);
                int i3 = (int) prepare.getLong(columnIndexOrThrow19);
                long j8 = prepare.getLong(columnIndexOrThrow20);
                int i4 = (int) prepare.getLong(columnIndexOrThrow21);
                int i5 = (int) prepare.getLong(columnIndexOrThrow22);
                String text4 = prepare.isNull(columnIndexOrThrow23) ? null : prepare.getText(columnIndexOrThrow23);
                Integer valueOf = prepare.isNull(columnIndexOrThrow24) ? null : Integer.valueOf((int) prepare.getLong(columnIndexOrThrow24));
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                workSpec = new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(columnIndexOrThrow26)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(columnIndexOrThrow25)), ((int) prepare.getLong(columnIndexOrThrow27)) != 0, ((int) prepare.getLong(columnIndexOrThrow28)) != 0, ((int) prepare.getLong(columnIndexOrThrow29)) != 0, ((int) prepare.getLong(columnIndexOrThrow30)) != 0, prepare.getLong(columnIndexOrThrow31), prepare.getLong(columnIndexOrThrow32), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(columnIndexOrThrow33))), i, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i2, i3, j8, i4, i5, text4, bool);
            }
            return workSpec;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workSpecIdAndStatesForName$lambda$4;
                workSpecIdAndStatesForName$lambda$4 = WorkSpecDao_Impl.getWorkSpecIdAndStatesForName$lambda$4(str, name, (SQLiteConnection) obj);
                return workSpecIdAndStatesForName$lambda$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkSpecIdAndStatesForName$lambda$4(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(new WorkSpec.IdAndState(prepare.getText(0), WorkTypeConverters.intToState((int) prepare.getLong(1))));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllWorkSpecIds() {
        final String str = "SELECT id FROM workspec";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List allWorkSpecIds$lambda$5;
                allWorkSpecIds$lambda$5 = WorkSpecDao_Impl.getAllWorkSpecIds$lambda$5(str, (SQLiteConnection) obj);
                return allWorkSpecIds$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllWorkSpecIds$lambda$5(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.getText(0));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<String>> getAllWorkSpecIdsLiveData() {
        final String str = "SELECT id FROM workspec";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List allWorkSpecIdsLiveData$lambda$6;
                allWorkSpecIdsLiveData$lambda$6 = WorkSpecDao_Impl.getAllWorkSpecIdsLiveData$lambda$6(str, (SQLiteConnection) obj);
                return allWorkSpecIdsLiveData$lambda$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllWorkSpecIdsLiveData$lambda$6(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.getText(0));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State getState(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "SELECT state FROM workspec WHERE id=?";
        return (WorkInfo.State) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                WorkInfo.State state$lambda$7;
                state$lambda$7 = WorkSpecDao_Impl.getState$lambda$7(str, id, (SQLiteConnection) obj);
                return state$lambda$7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkInfo.State getState$lambda$7(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            WorkInfo.State state = null;
            if (prepare.step()) {
                Integer valueOf = prepare.isNull(0) ? null : Integer.valueOf((int) prepare.getLong(0));
                if (valueOf != null) {
                    state = WorkTypeConverters.intToState(valueOf.intValue());
                }
            }
            return state;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?";
        return (WorkSpec.WorkInfoPojo) DBUtil.performBlocking(this.__db, true, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                WorkSpec.WorkInfoPojo workStatusPojoForId$lambda$8;
                workStatusPojoForId$lambda$8 = WorkSpecDao_Impl.getWorkStatusPojoForId$lambda$8(str, id, this, (SQLiteConnection) obj);
                return workStatusPojoForId$lambda$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkSpec.WorkInfoPojo getWorkStatusPojoForId$lambda$8(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection _connection) {
        WorkSpec.WorkInfoPojo workInfoPojo;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (prepare.step()) {
                String text = prepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = prepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            prepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap2);
            if (prepare.step()) {
                String text3 = prepare.getText(0);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(1));
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(2));
                int i = (int) prepare.getLong(3);
                int i2 = (int) prepare.getLong(4);
                long j = prepare.getLong(14);
                long j2 = prepare.getLong(15);
                long j3 = prepare.getLong(16);
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(17));
                long j4 = prepare.getLong(18);
                long j5 = prepare.getLong(19);
                int i3 = (int) prepare.getLong(20);
                long j6 = prepare.getLong(21);
                int i4 = (int) prepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                Object value = MapsKt.getValue(arrayMap, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                Object value2 = MapsKt.getValue(arrayMap2, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                workInfoPojo = new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i, intToBackoffPolicy, j4, j5, i3, i2, j6, i4, (List) value, (List) value2);
            } else {
                workInfoPojo = null;
            }
            return workInfoPojo;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(final List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        StringUtil.appendPlaceholders(sb, ids.size());
        sb.append(")");
        final String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return (List) DBUtil.performBlocking(this.__db, true, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workStatusPojoForIds$lambda$9;
                workStatusPojoForIds$lambda$9 = WorkSpecDao_Impl.getWorkStatusPojoForIds$lambda$9(sb2, ids, this, (SQLiteConnection) obj);
                return workStatusPojoForIds$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoForIds$lambda$9(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection _connection) {
        int i;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i2 = 1;
            int i3 = 1;
            while (it.hasNext()) {
                prepare.mo8890bindText(i3, (String) it.next());
                i3++;
            }
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!prepare.step()) {
                    break;
                }
                String text = prepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = prepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            prepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text3 = prepare.getText(i);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(i2));
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(2));
                int i4 = (int) prepare.getLong(3);
                int i5 = (int) prepare.getLong(4);
                long j = prepare.getLong(14);
                long j2 = prepare.getLong(15);
                long j3 = prepare.getLong(16);
                ArrayMap<String, List<Data>> arrayMap3 = arrayMap2;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(17));
                long j4 = prepare.getLong(18);
                long j5 = prepare.getLong(19);
                int i6 = (int) prepare.getLong(20);
                long j6 = prepare.getLong(21);
                int i7 = (int) prepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                Object value = MapsKt.getValue(arrayMap, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                List list2 = (List) value;
                Object value2 = MapsKt.getValue(arrayMap3, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i4, intToBackoffPolicy, j4, j5, i6, i5, j6, i7, list2, (List) value2));
                arrayMap2 = arrayMap3;
                i2 = 1;
                i = 0;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(final List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        StringUtil.appendPlaceholders(sb, ids.size());
        sb.append(")");
        final String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workStatusPojoLiveDataForIds$lambda$10;
                workStatusPojoLiveDataForIds$lambda$10 = WorkSpecDao_Impl.getWorkStatusPojoLiveDataForIds$lambda$10(sb2, ids, this, (SQLiteConnection) obj);
                return workStatusPojoLiveDataForIds$lambda$10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoLiveDataForIds$lambda$10(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection _connection) {
        int i;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i2 = 1;
            int i3 = 1;
            while (it.hasNext()) {
                prepare.mo8890bindText(i3, (String) it.next());
                i3++;
            }
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!prepare.step()) {
                    break;
                }
                String text = prepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = prepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            prepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text3 = prepare.getText(i);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(i2));
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(2));
                int i4 = (int) prepare.getLong(3);
                int i5 = (int) prepare.getLong(4);
                long j = prepare.getLong(14);
                long j2 = prepare.getLong(15);
                long j3 = prepare.getLong(16);
                ArrayMap<String, List<Data>> arrayMap3 = arrayMap2;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(17));
                long j4 = prepare.getLong(18);
                long j5 = prepare.getLong(19);
                int i6 = (int) prepare.getLong(20);
                long j6 = prepare.getLong(21);
                int i7 = (int) prepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                Object value = MapsKt.getValue(arrayMap, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                List list2 = (List) value;
                Object value2 = MapsKt.getValue(arrayMap3, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i4, intToBackoffPolicy, j4, j5, i6, i5, j6, i7, list2, (List) value2));
                arrayMap2 = arrayMap3;
                i2 = 1;
                i = 0;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowDataForIds(final List<String> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        StringUtil.appendPlaceholders(sb, ids.size());
        sb.append(")");
        final String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return FlowUtil.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workStatusPojoFlowDataForIds$lambda$11;
                workStatusPojoFlowDataForIds$lambda$11 = WorkSpecDao_Impl.getWorkStatusPojoFlowDataForIds$lambda$11(sb2, ids, this, (SQLiteConnection) obj);
                return workStatusPojoFlowDataForIds$lambda$11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoFlowDataForIds$lambda$11(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection _connection) {
        int i;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            Iterator it = list.iterator();
            int i2 = 1;
            int i3 = 1;
            while (it.hasNext()) {
                prepare.mo8890bindText(i3, (String) it.next());
                i3++;
            }
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!prepare.step()) {
                    break;
                }
                String text = prepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = prepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            prepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text3 = prepare.getText(i);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(i2));
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(2));
                int i4 = (int) prepare.getLong(3);
                int i5 = (int) prepare.getLong(4);
                long j = prepare.getLong(14);
                long j2 = prepare.getLong(15);
                long j3 = prepare.getLong(16);
                ArrayMap<String, List<Data>> arrayMap3 = arrayMap2;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(17));
                long j4 = prepare.getLong(18);
                long j5 = prepare.getLong(19);
                int i6 = (int) prepare.getLong(20);
                long j6 = prepare.getLong(21);
                int i7 = (int) prepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                Object value = MapsKt.getValue(arrayMap, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                List list2 = (List) value;
                Object value2 = MapsKt.getValue(arrayMap3, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i4, intToBackoffPolicy, j4, j5, i6, i5, j6, i7, list2, (List) value2));
                arrayMap2 = arrayMap3;
                i2 = 1;
                i = 0;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) DBUtil.performBlocking(this.__db, true, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workStatusPojoForTag$lambda$12;
                workStatusPojoForTag$lambda$12 = WorkSpecDao_Impl.getWorkStatusPojoForTag$lambda$12(str, tag, this, (SQLiteConnection) obj);
                return workStatusPojoForTag$lambda$12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoForTag$lambda$12(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection _connection) {
        int i;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        int i2 = 1;
        try {
            prepare.mo8890bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!prepare.step()) {
                    break;
                }
                String text = prepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = prepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            prepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text3 = prepare.getText(i);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(i2));
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(2));
                int i3 = (int) prepare.getLong(3);
                int i4 = (int) prepare.getLong(4);
                long j = prepare.getLong(14);
                long j2 = prepare.getLong(15);
                long j3 = prepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(17));
                long j4 = prepare.getLong(18);
                long j5 = prepare.getLong(19);
                int i5 = (int) prepare.getLong(20);
                long j6 = prepare.getLong(21);
                int i6 = (int) prepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                Object value = MapsKt.getValue(arrayMap3, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                List list = (List) value;
                Object value2 = MapsKt.getValue(arrayMap2, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i3, intToBackoffPolicy, j4, j5, i5, i4, j6, i6, list, (List) value2));
                arrayMap = arrayMap3;
                i2 = 1;
                i = 0;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForTag(final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return FlowUtil.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workStatusPojoFlowForTag$lambda$13;
                workStatusPojoFlowForTag$lambda$13 = WorkSpecDao_Impl.getWorkStatusPojoFlowForTag$lambda$13(str, tag, this, (SQLiteConnection) obj);
                return workStatusPojoFlowForTag$lambda$13;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoFlowForTag$lambda$13(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection _connection) {
        int i;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        int i2 = 1;
        try {
            prepare.mo8890bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!prepare.step()) {
                    break;
                }
                String text = prepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = prepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            prepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text3 = prepare.getText(i);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(i2));
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(2));
                int i3 = (int) prepare.getLong(3);
                int i4 = (int) prepare.getLong(4);
                long j = prepare.getLong(14);
                long j2 = prepare.getLong(15);
                long j3 = prepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(17));
                long j4 = prepare.getLong(18);
                long j5 = prepare.getLong(19);
                int i5 = (int) prepare.getLong(20);
                long j6 = prepare.getLong(21);
                int i6 = (int) prepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                Object value = MapsKt.getValue(arrayMap3, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                List list = (List) value;
                Object value2 = MapsKt.getValue(arrayMap2, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i3, intToBackoffPolicy, j4, j5, i5, i4, j6, i6, list, (List) value2));
                arrayMap = arrayMap3;
                i2 = 1;
                i = 0;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workStatusPojoLiveDataForTag$lambda$14;
                workStatusPojoLiveDataForTag$lambda$14 = WorkSpecDao_Impl.getWorkStatusPojoLiveDataForTag$lambda$14(str, tag, this, (SQLiteConnection) obj);
                return workStatusPojoLiveDataForTag$lambda$14;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoLiveDataForTag$lambda$14(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection _connection) {
        int i;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        int i2 = 1;
        try {
            prepare.mo8890bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!prepare.step()) {
                    break;
                }
                String text = prepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = prepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            prepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text3 = prepare.getText(i);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(i2));
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(2));
                int i3 = (int) prepare.getLong(3);
                int i4 = (int) prepare.getLong(4);
                long j = prepare.getLong(14);
                long j2 = prepare.getLong(15);
                long j3 = prepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(17));
                long j4 = prepare.getLong(18);
                long j5 = prepare.getLong(19);
                int i5 = (int) prepare.getLong(20);
                long j6 = prepare.getLong(21);
                int i6 = (int) prepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                Object value = MapsKt.getValue(arrayMap3, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                List list = (List) value;
                Object value2 = MapsKt.getValue(arrayMap2, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i3, intToBackoffPolicy, j4, j5, i5, i4, j6, i6, list, (List) value2));
                arrayMap = arrayMap3;
                i2 = 1;
                i = 0;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) DBUtil.performBlocking(this.__db, true, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workStatusPojoForName$lambda$15;
                workStatusPojoForName$lambda$15 = WorkSpecDao_Impl.getWorkStatusPojoForName$lambda$15(str, name, this, (SQLiteConnection) obj);
                return workStatusPojoForName$lambda$15;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoForName$lambda$15(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection _connection) {
        int i;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        int i2 = 1;
        try {
            prepare.mo8890bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!prepare.step()) {
                    break;
                }
                String text = prepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = prepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            prepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text3 = prepare.getText(i);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(i2));
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(2));
                int i3 = (int) prepare.getLong(3);
                int i4 = (int) prepare.getLong(4);
                long j = prepare.getLong(14);
                long j2 = prepare.getLong(15);
                long j3 = prepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(17));
                long j4 = prepare.getLong(18);
                long j5 = prepare.getLong(19);
                int i5 = (int) prepare.getLong(20);
                long j6 = prepare.getLong(21);
                int i6 = (int) prepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                Object value = MapsKt.getValue(arrayMap3, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                List list = (List) value;
                Object value2 = MapsKt.getValue(arrayMap2, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i3, intToBackoffPolicy, j4, j5, i5, i4, j6, i6, list, (List) value2));
                arrayMap = arrayMap3;
                i2 = 1;
                i = 0;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workStatusPojoLiveDataForName$lambda$16;
                workStatusPojoLiveDataForName$lambda$16 = WorkSpecDao_Impl.getWorkStatusPojoLiveDataForName$lambda$16(str, name, this, (SQLiteConnection) obj);
                return workStatusPojoLiveDataForName$lambda$16;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoLiveDataForName$lambda$16(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection _connection) {
        int i;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        int i2 = 1;
        try {
            prepare.mo8890bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!prepare.step()) {
                    break;
                }
                String text = prepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = prepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            prepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text3 = prepare.getText(i);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(i2));
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(2));
                int i3 = (int) prepare.getLong(3);
                int i4 = (int) prepare.getLong(4);
                long j = prepare.getLong(14);
                long j2 = prepare.getLong(15);
                long j3 = prepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(17));
                long j4 = prepare.getLong(18);
                long j5 = prepare.getLong(19);
                int i5 = (int) prepare.getLong(20);
                long j6 = prepare.getLong(21);
                int i6 = (int) prepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                Object value = MapsKt.getValue(arrayMap3, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                List list = (List) value;
                Object value2 = MapsKt.getValue(arrayMap2, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i3, intToBackoffPolicy, j4, j5, i5, i4, j6, i6, list, (List) value2));
                arrayMap = arrayMap3;
                i2 = 1;
                i = 0;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForName(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return FlowUtil.createFlow(this.__db, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workStatusPojoFlowForName$lambda$17;
                workStatusPojoFlowForName$lambda$17 = WorkSpecDao_Impl.getWorkStatusPojoFlowForName$lambda$17(str, name, this, (SQLiteConnection) obj);
                return workStatusPojoFlowForName$lambda$17;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkStatusPojoFlowForName$lambda$17(String str, String str2, WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection _connection) {
        int i;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        int i2 = 1;
        try {
            prepare.mo8890bindText(1, str2);
            ArrayMap<String, List<String>> arrayMap = new ArrayMap<>();
            ArrayMap<String, List<Data>> arrayMap2 = new ArrayMap<>();
            while (true) {
                i = 0;
                if (!prepare.step()) {
                    break;
                }
                String text = prepare.getText(0);
                if (!arrayMap.containsKey(text)) {
                    arrayMap.put(text, new ArrayList());
                }
                String text2 = prepare.getText(0);
                if (!arrayMap2.containsKey(text2)) {
                    arrayMap2.put(text2, new ArrayList());
                }
            }
            prepare.reset();
            workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap);
            workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text3 = prepare.getText(i);
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(i2));
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(2));
                int i3 = (int) prepare.getLong(3);
                int i4 = (int) prepare.getLong(4);
                long j = prepare.getLong(14);
                long j2 = prepare.getLong(15);
                long j3 = prepare.getLong(16);
                ArrayMap<String, List<String>> arrayMap3 = arrayMap;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(17));
                long j4 = prepare.getLong(18);
                long j5 = prepare.getLong(19);
                int i5 = (int) prepare.getLong(20);
                long j6 = prepare.getLong(21);
                int i6 = (int) prepare.getLong(22);
                Constraints constraints = new Constraints(WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(6)), WorkTypeConverters.intToNetworkType((int) prepare.getLong(5)), ((int) prepare.getLong(7)) != 0, ((int) prepare.getLong(8)) != 0, ((int) prepare.getLong(9)) != 0, ((int) prepare.getLong(10)) != 0, prepare.getLong(11), prepare.getLong(12), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(13)));
                Object value = MapsKt.getValue(arrayMap3, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                List list = (List) value;
                Object value2 = MapsKt.getValue(arrayMap2, prepare.getText(0));
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i3, intToBackoffPolicy, j4, j5, i5, i4, j6, i6, list, (List) value2));
                arrayMap = arrayMap3;
                i2 = 1;
                i = 0;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<Data> getInputsFromPrerequisites(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List inputsFromPrerequisites$lambda$18;
                inputsFromPrerequisites$lambda$18 = WorkSpecDao_Impl.getInputsFromPrerequisites$lambda$18(str, id, (SQLiteConnection) obj);
                return inputsFromPrerequisites$lambda$18;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getInputsFromPrerequisites$lambda$18(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(Data.INSTANCE.fromByteArray(prepare.getBlob(0)));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithTag(final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List unfinishedWorkWithTag$lambda$19;
                unfinishedWorkWithTag$lambda$19 = WorkSpecDao_Impl.getUnfinishedWorkWithTag$lambda$19(str, tag, (SQLiteConnection) obj);
                return unfinishedWorkWithTag$lambda$19;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getUnfinishedWorkWithTag$lambda$19(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.getText(0));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithName(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List unfinishedWorkWithName$lambda$20;
                unfinishedWorkWithName$lambda$20 = WorkSpecDao_Impl.getUnfinishedWorkWithName$lambda$20(str, name, (SQLiteConnection) obj);
                return unfinishedWorkWithName$lambda$20;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getUnfinishedWorkWithName$lambda$20(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.getText(0));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllUnfinishedWork() {
        final String str = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List allUnfinishedWork$lambda$21;
                allUnfinishedWork$lambda$21 = WorkSpecDao_Impl.getAllUnfinishedWork$lambda$21(str, (SQLiteConnection) obj);
                return allUnfinishedWork$lambda$21;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllUnfinishedWork$lambda$21(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                arrayList.add(prepare.getText(0));
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<Boolean> hasUnfinishedWorkFlow() {
        final String str = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1";
        return FlowUtil.createFlow(this.__db, false, new String[]{"workspec"}, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean hasUnfinishedWorkFlow$lambda$22;
                hasUnfinishedWorkFlow$lambda$22 = WorkSpecDao_Impl.hasUnfinishedWorkFlow$lambda$22(str, (SQLiteConnection) obj);
                return Boolean.valueOf(hasUnfinishedWorkFlow$lambda$22);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasUnfinishedWorkFlow$lambda$22(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            boolean z = false;
            if (prepare.step()) {
                if (((int) prepare.getLong(0)) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<Long> getScheduleRequestedAtLiveData(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "SELECT schedule_requested_at FROM workspec WHERE id=?";
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Long scheduleRequestedAtLiveData$lambda$23;
                scheduleRequestedAtLiveData$lambda$23 = WorkSpecDao_Impl.getScheduleRequestedAtLiveData$lambda$23(str, id, (SQLiteConnection) obj);
                return scheduleRequestedAtLiveData$lambda$23;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long getScheduleRequestedAtLiveData$lambda$23(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            Long l = null;
            if (prepare.step() && !prepare.isNull(0)) {
                l = Long.valueOf(prepare.getLong(0));
            }
            return l;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForScheduling(final int schedulerLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List eligibleWorkForScheduling$lambda$25;
                eligibleWorkForScheduling$lambda$25 = WorkSpecDao_Impl.getEligibleWorkForScheduling$lambda$25(str, schedulerLimit, (SQLiteConnection) obj);
                return eligibleWorkForScheduling$lambda$25;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getEligibleWorkForScheduling$lambda$25(String str, int i, SQLiteConnection _connection) {
        int i2;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                int i3 = columnIndexOrThrow13;
                int i4 = columnIndexOrThrow14;
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(columnIndexOrThrow2));
                String text2 = prepare.getText(columnIndexOrThrow3);
                String text3 = prepare.getText(columnIndexOrThrow4);
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow5));
                Data fromByteArray2 = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                long j = prepare.getLong(columnIndexOrThrow7);
                long j2 = prepare.getLong(columnIndexOrThrow8);
                long j3 = prepare.getLong(columnIndexOrThrow9);
                int i5 = (int) prepare.getLong(columnIndexOrThrow10);
                int i6 = columnIndexOrThrow;
                int i7 = columnIndexOrThrow2;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                long j4 = prepare.getLong(columnIndexOrThrow12);
                long j5 = prepare.getLong(i3);
                long j6 = prepare.getLong(i4);
                int i8 = columnIndexOrThrow15;
                long j7 = prepare.getLong(i8);
                columnIndexOrThrow15 = i8;
                int i9 = columnIndexOrThrow16;
                int i10 = columnIndexOrThrow3;
                boolean z = ((int) prepare.getLong(i9)) != 0;
                int i11 = columnIndexOrThrow17;
                int i12 = columnIndexOrThrow4;
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) prepare.getLong(i11));
                int i13 = columnIndexOrThrow18;
                int i14 = (int) prepare.getLong(i13);
                int i15 = columnIndexOrThrow19;
                int i16 = (int) prepare.getLong(i15);
                int i17 = columnIndexOrThrow20;
                long j8 = prepare.getLong(i17);
                int i18 = columnIndexOrThrow21;
                int i19 = (int) prepare.getLong(i18);
                columnIndexOrThrow21 = i18;
                int i20 = columnIndexOrThrow22;
                int i21 = (int) prepare.getLong(i20);
                int i22 = columnIndexOrThrow23;
                Boolean bool = null;
                String text4 = prepare.isNull(i22) ? null : prepare.getText(i22);
                int i23 = columnIndexOrThrow24;
                if (prepare.isNull(i23)) {
                    i2 = i22;
                    columnIndexOrThrow22 = i20;
                    valueOf = null;
                } else {
                    i2 = i22;
                    columnIndexOrThrow22 = i20;
                    valueOf = Integer.valueOf((int) prepare.getLong(i23));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i24 = columnIndexOrThrow25;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType((int) prepare.getLong(i24));
                int i25 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i25));
                int i26 = columnIndexOrThrow27;
                boolean z2 = ((int) prepare.getLong(i26)) != 0;
                int i27 = columnIndexOrThrow28;
                boolean z3 = ((int) prepare.getLong(i27)) != 0;
                int i28 = columnIndexOrThrow29;
                boolean z4 = ((int) prepare.getLong(i28)) != 0;
                columnIndexOrThrow29 = i28;
                int i29 = columnIndexOrThrow30;
                int i30 = columnIndexOrThrow31;
                int i31 = columnIndexOrThrow32;
                columnIndexOrThrow31 = i30;
                int i32 = columnIndexOrThrow33;
                arrayList.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i29)) != 0, prepare.getLong(i30), prepare.getLong(i31), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i32))), i5, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i14, i16, j8, i19, i21, text4, bool2));
                columnIndexOrThrow28 = i27;
                columnIndexOrThrow4 = i12;
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow19 = i15;
                columnIndexOrThrow20 = i17;
                columnIndexOrThrow23 = i2;
                columnIndexOrThrow24 = i23;
                columnIndexOrThrow25 = i24;
                columnIndexOrThrow26 = i25;
                columnIndexOrThrow27 = i26;
                columnIndexOrThrow33 = i32;
                columnIndexOrThrow32 = i31;
                columnIndexOrThrow30 = i29;
                columnIndexOrThrow = i6;
                columnIndexOrThrow13 = i3;
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow2 = i7;
                columnIndexOrThrow3 = i10;
                columnIndexOrThrow16 = i9;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForSchedulingWithContentUris() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List eligibleWorkForSchedulingWithContentUris$lambda$27;
                eligibleWorkForSchedulingWithContentUris$lambda$27 = WorkSpecDao_Impl.getEligibleWorkForSchedulingWithContentUris$lambda$27(str, (SQLiteConnection) obj);
                return eligibleWorkForSchedulingWithContentUris$lambda$27;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getEligibleWorkForSchedulingWithContentUris$lambda$27(String str, SQLiteConnection _connection) {
        int i;
        int i2;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(columnIndexOrThrow2));
                String text2 = prepare.getText(columnIndexOrThrow3);
                String text3 = prepare.getText(columnIndexOrThrow4);
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow5));
                Data fromByteArray2 = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                long j = prepare.getLong(columnIndexOrThrow7);
                long j2 = prepare.getLong(columnIndexOrThrow8);
                long j3 = prepare.getLong(columnIndexOrThrow9);
                int i4 = (int) prepare.getLong(columnIndexOrThrow10);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                long j4 = prepare.getLong(columnIndexOrThrow12);
                long j5 = prepare.getLong(columnIndexOrThrow13);
                long j6 = prepare.getLong(i3);
                int i7 = columnIndexOrThrow15;
                long j7 = prepare.getLong(i7);
                int i8 = columnIndexOrThrow;
                int i9 = columnIndexOrThrow16;
                boolean z = ((int) prepare.getLong(i9)) != 0;
                int i10 = columnIndexOrThrow17;
                int i11 = columnIndexOrThrow4;
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) prepare.getLong(i10));
                int i12 = columnIndexOrThrow18;
                int i13 = columnIndexOrThrow5;
                int i14 = (int) prepare.getLong(i12);
                int i15 = columnIndexOrThrow19;
                int i16 = (int) prepare.getLong(i15);
                int i17 = columnIndexOrThrow20;
                long j8 = prepare.getLong(i17);
                int i18 = columnIndexOrThrow21;
                int i19 = (int) prepare.getLong(i18);
                int i20 = columnIndexOrThrow22;
                int i21 = (int) prepare.getLong(i20);
                int i22 = columnIndexOrThrow23;
                Boolean bool = null;
                String text4 = prepare.isNull(i22) ? null : prepare.getText(i22);
                int i23 = columnIndexOrThrow24;
                if (prepare.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) prepare.getLong(i23));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i24 = columnIndexOrThrow25;
                Boolean bool2 = bool;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType((int) prepare.getLong(i24));
                int i25 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i25));
                columnIndexOrThrow25 = i24;
                columnIndexOrThrow26 = i25;
                int i26 = columnIndexOrThrow27;
                boolean z2 = ((int) prepare.getLong(i26)) != 0;
                columnIndexOrThrow27 = i26;
                int i27 = columnIndexOrThrow28;
                boolean z3 = ((int) prepare.getLong(i27)) != 0;
                int i28 = columnIndexOrThrow29;
                boolean z4 = ((int) prepare.getLong(i28)) != 0;
                columnIndexOrThrow29 = i28;
                int i29 = columnIndexOrThrow30;
                int i30 = columnIndexOrThrow31;
                int i31 = columnIndexOrThrow32;
                int i32 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i32;
                arrayList2.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i29)) != 0, prepare.getLong(i30), prepare.getLong(i31), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i32))), i4, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i14, i16, j8, i, i21, text4, bool2));
                columnIndexOrThrow30 = i29;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow17 = i10;
                columnIndexOrThrow19 = i15;
                columnIndexOrThrow22 = i2;
                columnIndexOrThrow24 = i23;
                columnIndexOrThrow31 = i30;
                columnIndexOrThrow32 = i31;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow14 = i3;
                columnIndexOrThrow3 = i6;
                arrayList = arrayList2;
                columnIndexOrThrow = i8;
                columnIndexOrThrow15 = i7;
                columnIndexOrThrow16 = i9;
                columnIndexOrThrow20 = i17;
                columnIndexOrThrow21 = i18;
                columnIndexOrThrow23 = i22;
                columnIndexOrThrow28 = i27;
                columnIndexOrThrow5 = i13;
                columnIndexOrThrow18 = i12;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(final int maxLimit) {
        final String str = "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List allEligibleWorkSpecsForScheduling$lambda$29;
                allEligibleWorkSpecsForScheduling$lambda$29 = WorkSpecDao_Impl.getAllEligibleWorkSpecsForScheduling$lambda$29(str, maxLimit, (SQLiteConnection) obj);
                return allEligibleWorkSpecsForScheduling$lambda$29;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllEligibleWorkSpecsForScheduling$lambda$29(String str, int i, SQLiteConnection _connection) {
        int i2;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                int i3 = columnIndexOrThrow13;
                int i4 = columnIndexOrThrow14;
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(columnIndexOrThrow2));
                String text2 = prepare.getText(columnIndexOrThrow3);
                String text3 = prepare.getText(columnIndexOrThrow4);
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow5));
                Data fromByteArray2 = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                long j = prepare.getLong(columnIndexOrThrow7);
                long j2 = prepare.getLong(columnIndexOrThrow8);
                long j3 = prepare.getLong(columnIndexOrThrow9);
                int i5 = (int) prepare.getLong(columnIndexOrThrow10);
                int i6 = columnIndexOrThrow;
                int i7 = columnIndexOrThrow2;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                long j4 = prepare.getLong(columnIndexOrThrow12);
                long j5 = prepare.getLong(i3);
                long j6 = prepare.getLong(i4);
                int i8 = columnIndexOrThrow15;
                long j7 = prepare.getLong(i8);
                columnIndexOrThrow15 = i8;
                int i9 = columnIndexOrThrow16;
                int i10 = columnIndexOrThrow3;
                boolean z = ((int) prepare.getLong(i9)) != 0;
                int i11 = columnIndexOrThrow17;
                int i12 = columnIndexOrThrow4;
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) prepare.getLong(i11));
                int i13 = columnIndexOrThrow18;
                int i14 = (int) prepare.getLong(i13);
                int i15 = columnIndexOrThrow19;
                int i16 = (int) prepare.getLong(i15);
                int i17 = columnIndexOrThrow20;
                long j8 = prepare.getLong(i17);
                int i18 = columnIndexOrThrow21;
                int i19 = (int) prepare.getLong(i18);
                columnIndexOrThrow21 = i18;
                int i20 = columnIndexOrThrow22;
                int i21 = (int) prepare.getLong(i20);
                int i22 = columnIndexOrThrow23;
                Boolean bool = null;
                String text4 = prepare.isNull(i22) ? null : prepare.getText(i22);
                int i23 = columnIndexOrThrow24;
                if (prepare.isNull(i23)) {
                    i2 = i22;
                    columnIndexOrThrow22 = i20;
                    valueOf = null;
                } else {
                    i2 = i22;
                    columnIndexOrThrow22 = i20;
                    valueOf = Integer.valueOf((int) prepare.getLong(i23));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i24 = columnIndexOrThrow25;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType((int) prepare.getLong(i24));
                int i25 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i25));
                int i26 = columnIndexOrThrow27;
                boolean z2 = ((int) prepare.getLong(i26)) != 0;
                int i27 = columnIndexOrThrow28;
                boolean z3 = ((int) prepare.getLong(i27)) != 0;
                int i28 = columnIndexOrThrow29;
                boolean z4 = ((int) prepare.getLong(i28)) != 0;
                columnIndexOrThrow29 = i28;
                int i29 = columnIndexOrThrow30;
                int i30 = columnIndexOrThrow31;
                int i31 = columnIndexOrThrow32;
                columnIndexOrThrow31 = i30;
                int i32 = columnIndexOrThrow33;
                arrayList.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i29)) != 0, prepare.getLong(i30), prepare.getLong(i31), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i32))), i5, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i14, i16, j8, i19, i21, text4, bool2));
                columnIndexOrThrow28 = i27;
                columnIndexOrThrow4 = i12;
                columnIndexOrThrow17 = i11;
                columnIndexOrThrow18 = i13;
                columnIndexOrThrow19 = i15;
                columnIndexOrThrow20 = i17;
                columnIndexOrThrow23 = i2;
                columnIndexOrThrow24 = i23;
                columnIndexOrThrow25 = i24;
                columnIndexOrThrow26 = i25;
                columnIndexOrThrow27 = i26;
                columnIndexOrThrow33 = i32;
                columnIndexOrThrow32 = i31;
                columnIndexOrThrow30 = i29;
                columnIndexOrThrow = i6;
                columnIndexOrThrow13 = i3;
                columnIndexOrThrow14 = i4;
                columnIndexOrThrow2 = i7;
                columnIndexOrThrow3 = i10;
                columnIndexOrThrow16 = i9;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWork() {
        final String str = "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List scheduledWork$lambda$31;
                scheduledWork$lambda$31 = WorkSpecDao_Impl.getScheduledWork$lambda$31(str, (SQLiteConnection) obj);
                return scheduledWork$lambda$31;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getScheduledWork$lambda$31(String str, SQLiteConnection _connection) {
        int i;
        int i2;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(columnIndexOrThrow2));
                String text2 = prepare.getText(columnIndexOrThrow3);
                String text3 = prepare.getText(columnIndexOrThrow4);
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow5));
                Data fromByteArray2 = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                long j = prepare.getLong(columnIndexOrThrow7);
                long j2 = prepare.getLong(columnIndexOrThrow8);
                long j3 = prepare.getLong(columnIndexOrThrow9);
                int i4 = (int) prepare.getLong(columnIndexOrThrow10);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                long j4 = prepare.getLong(columnIndexOrThrow12);
                long j5 = prepare.getLong(columnIndexOrThrow13);
                long j6 = prepare.getLong(i3);
                int i7 = columnIndexOrThrow15;
                long j7 = prepare.getLong(i7);
                int i8 = columnIndexOrThrow;
                int i9 = columnIndexOrThrow16;
                boolean z = ((int) prepare.getLong(i9)) != 0;
                int i10 = columnIndexOrThrow17;
                int i11 = columnIndexOrThrow4;
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) prepare.getLong(i10));
                int i12 = columnIndexOrThrow18;
                int i13 = columnIndexOrThrow5;
                int i14 = (int) prepare.getLong(i12);
                int i15 = columnIndexOrThrow19;
                int i16 = (int) prepare.getLong(i15);
                int i17 = columnIndexOrThrow20;
                long j8 = prepare.getLong(i17);
                int i18 = columnIndexOrThrow21;
                int i19 = (int) prepare.getLong(i18);
                int i20 = columnIndexOrThrow22;
                int i21 = (int) prepare.getLong(i20);
                int i22 = columnIndexOrThrow23;
                Boolean bool = null;
                String text4 = prepare.isNull(i22) ? null : prepare.getText(i22);
                int i23 = columnIndexOrThrow24;
                if (prepare.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) prepare.getLong(i23));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i24 = columnIndexOrThrow25;
                Boolean bool2 = bool;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType((int) prepare.getLong(i24));
                int i25 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i25));
                columnIndexOrThrow25 = i24;
                columnIndexOrThrow26 = i25;
                int i26 = columnIndexOrThrow27;
                boolean z2 = ((int) prepare.getLong(i26)) != 0;
                columnIndexOrThrow27 = i26;
                int i27 = columnIndexOrThrow28;
                boolean z3 = ((int) prepare.getLong(i27)) != 0;
                int i28 = columnIndexOrThrow29;
                boolean z4 = ((int) prepare.getLong(i28)) != 0;
                columnIndexOrThrow29 = i28;
                int i29 = columnIndexOrThrow30;
                int i30 = columnIndexOrThrow31;
                int i31 = columnIndexOrThrow32;
                int i32 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i32;
                arrayList2.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i29)) != 0, prepare.getLong(i30), prepare.getLong(i31), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i32))), i4, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i14, i16, j8, i, i21, text4, bool2));
                columnIndexOrThrow30 = i29;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow17 = i10;
                columnIndexOrThrow19 = i15;
                columnIndexOrThrow22 = i2;
                columnIndexOrThrow24 = i23;
                columnIndexOrThrow31 = i30;
                columnIndexOrThrow32 = i31;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow14 = i3;
                columnIndexOrThrow3 = i6;
                arrayList = arrayList2;
                columnIndexOrThrow = i8;
                columnIndexOrThrow15 = i7;
                columnIndexOrThrow16 = i9;
                columnIndexOrThrow20 = i17;
                columnIndexOrThrow21 = i18;
                columnIndexOrThrow23 = i22;
                columnIndexOrThrow28 = i27;
                columnIndexOrThrow5 = i13;
                columnIndexOrThrow18 = i12;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRunningWork() {
        final String str = "SELECT * FROM workspec WHERE state=1";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List runningWork$lambda$33;
                runningWork$lambda$33 = WorkSpecDao_Impl.getRunningWork$lambda$33(str, (SQLiteConnection) obj);
                return runningWork$lambda$33;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getRunningWork$lambda$33(String str, SQLiteConnection _connection) {
        int i;
        int i2;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                int i3 = columnIndexOrThrow14;
                ArrayList arrayList2 = arrayList;
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(columnIndexOrThrow2));
                String text2 = prepare.getText(columnIndexOrThrow3);
                String text3 = prepare.getText(columnIndexOrThrow4);
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow5));
                Data fromByteArray2 = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                long j = prepare.getLong(columnIndexOrThrow7);
                long j2 = prepare.getLong(columnIndexOrThrow8);
                long j3 = prepare.getLong(columnIndexOrThrow9);
                int i4 = (int) prepare.getLong(columnIndexOrThrow10);
                int i5 = columnIndexOrThrow2;
                int i6 = columnIndexOrThrow3;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                long j4 = prepare.getLong(columnIndexOrThrow12);
                long j5 = prepare.getLong(columnIndexOrThrow13);
                long j6 = prepare.getLong(i3);
                int i7 = columnIndexOrThrow15;
                long j7 = prepare.getLong(i7);
                int i8 = columnIndexOrThrow;
                int i9 = columnIndexOrThrow16;
                boolean z = ((int) prepare.getLong(i9)) != 0;
                int i10 = columnIndexOrThrow17;
                int i11 = columnIndexOrThrow4;
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) prepare.getLong(i10));
                int i12 = columnIndexOrThrow18;
                int i13 = columnIndexOrThrow5;
                int i14 = (int) prepare.getLong(i12);
                int i15 = columnIndexOrThrow19;
                int i16 = (int) prepare.getLong(i15);
                int i17 = columnIndexOrThrow20;
                long j8 = prepare.getLong(i17);
                int i18 = columnIndexOrThrow21;
                int i19 = (int) prepare.getLong(i18);
                int i20 = columnIndexOrThrow22;
                int i21 = (int) prepare.getLong(i20);
                int i22 = columnIndexOrThrow23;
                Boolean bool = null;
                String text4 = prepare.isNull(i22) ? null : prepare.getText(i22);
                int i23 = columnIndexOrThrow24;
                if (prepare.isNull(i23)) {
                    i = i19;
                    i2 = i20;
                    valueOf = null;
                } else {
                    i = i19;
                    i2 = i20;
                    valueOf = Integer.valueOf((int) prepare.getLong(i23));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                int i24 = columnIndexOrThrow25;
                Boolean bool2 = bool;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType((int) prepare.getLong(i24));
                int i25 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i25));
                columnIndexOrThrow25 = i24;
                columnIndexOrThrow26 = i25;
                int i26 = columnIndexOrThrow27;
                boolean z2 = ((int) prepare.getLong(i26)) != 0;
                columnIndexOrThrow27 = i26;
                int i27 = columnIndexOrThrow28;
                boolean z3 = ((int) prepare.getLong(i27)) != 0;
                int i28 = columnIndexOrThrow29;
                boolean z4 = ((int) prepare.getLong(i28)) != 0;
                columnIndexOrThrow29 = i28;
                int i29 = columnIndexOrThrow30;
                int i30 = columnIndexOrThrow31;
                int i31 = columnIndexOrThrow32;
                int i32 = columnIndexOrThrow33;
                columnIndexOrThrow33 = i32;
                arrayList2.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i29)) != 0, prepare.getLong(i30), prepare.getLong(i31), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i32))), i4, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i14, i16, j8, i, i21, text4, bool2));
                columnIndexOrThrow30 = i29;
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow17 = i10;
                columnIndexOrThrow19 = i15;
                columnIndexOrThrow22 = i2;
                columnIndexOrThrow24 = i23;
                columnIndexOrThrow31 = i30;
                columnIndexOrThrow32 = i31;
                columnIndexOrThrow2 = i5;
                columnIndexOrThrow14 = i3;
                columnIndexOrThrow3 = i6;
                arrayList = arrayList2;
                columnIndexOrThrow = i8;
                columnIndexOrThrow15 = i7;
                columnIndexOrThrow16 = i9;
                columnIndexOrThrow20 = i17;
                columnIndexOrThrow21 = i18;
                columnIndexOrThrow23 = i22;
                columnIndexOrThrow28 = i27;
                columnIndexOrThrow5 = i13;
                columnIndexOrThrow18 = i12;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRecentlyCompletedWork(final long startingAt) {
        final String str = "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List recentlyCompletedWork$lambda$35;
                recentlyCompletedWork$lambda$35 = WorkSpecDao_Impl.getRecentlyCompletedWork$lambda$35(str, startingAt, (SQLiteConnection) obj);
                return recentlyCompletedWork$lambda$35;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getRecentlyCompletedWork$lambda$35(String str, long j, SQLiteConnection _connection) {
        int i;
        Integer valueOf;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "state");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "worker_class_name");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input_merger_class_name");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "input");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "output");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "initial_delay");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "interval_duration");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "flex_duration");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_attempt_count");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_policy");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_delay_duration");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "last_enqueue_time");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "minimum_retention_duration");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "schedule_requested_at");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "run_in_foreground");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "out_of_quota_policy");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "period_count");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "generation");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "next_schedule_time_override_generation");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "stop_reason");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trace_tag");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "backoff_on_system_interruptions");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_type");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "required_network_request");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_charging");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_device_idle");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_battery_not_low");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "requires_storage_not_low");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_content_update_delay");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "trigger_max_content_delay");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(prepare, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                String text = prepare.getText(columnIndexOrThrow);
                int i2 = columnIndexOrThrow13;
                int i3 = columnIndexOrThrow14;
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(columnIndexOrThrow2));
                String text2 = prepare.getText(columnIndexOrThrow3);
                String text3 = prepare.getText(columnIndexOrThrow4);
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow5));
                Data fromByteArray2 = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndexOrThrow6));
                long j2 = prepare.getLong(columnIndexOrThrow7);
                long j3 = prepare.getLong(columnIndexOrThrow8);
                long j4 = prepare.getLong(columnIndexOrThrow9);
                int i4 = (int) prepare.getLong(columnIndexOrThrow10);
                int i5 = columnIndexOrThrow;
                int i6 = columnIndexOrThrow2;
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndexOrThrow11));
                long j5 = prepare.getLong(columnIndexOrThrow12);
                long j6 = prepare.getLong(i2);
                long j7 = prepare.getLong(i3);
                int i7 = columnIndexOrThrow15;
                long j8 = prepare.getLong(i7);
                columnIndexOrThrow15 = i7;
                int i8 = columnIndexOrThrow16;
                int i9 = columnIndexOrThrow3;
                boolean z = ((int) prepare.getLong(i8)) != 0;
                int i10 = columnIndexOrThrow17;
                int i11 = columnIndexOrThrow4;
                OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy((int) prepare.getLong(i10));
                int i12 = columnIndexOrThrow18;
                int i13 = (int) prepare.getLong(i12);
                int i14 = columnIndexOrThrow19;
                int i15 = (int) prepare.getLong(i14);
                int i16 = columnIndexOrThrow20;
                long j9 = prepare.getLong(i16);
                int i17 = columnIndexOrThrow21;
                int i18 = (int) prepare.getLong(i17);
                columnIndexOrThrow21 = i17;
                int i19 = columnIndexOrThrow22;
                int i20 = (int) prepare.getLong(i19);
                int i21 = columnIndexOrThrow23;
                Boolean bool = null;
                String text4 = prepare.isNull(i21) ? null : prepare.getText(i21);
                int i22 = columnIndexOrThrow24;
                if (prepare.isNull(i22)) {
                    i = i21;
                    columnIndexOrThrow22 = i19;
                    valueOf = null;
                } else {
                    i = i21;
                    columnIndexOrThrow22 = i19;
                    valueOf = Integer.valueOf((int) prepare.getLong(i22));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i23 = columnIndexOrThrow25;
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType((int) prepare.getLong(i23));
                int i24 = columnIndexOrThrow26;
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i24));
                int i25 = columnIndexOrThrow27;
                boolean z2 = ((int) prepare.getLong(i25)) != 0;
                int i26 = columnIndexOrThrow28;
                boolean z3 = ((int) prepare.getLong(i26)) != 0;
                int i27 = columnIndexOrThrow29;
                boolean z4 = ((int) prepare.getLong(i27)) != 0;
                columnIndexOrThrow29 = i27;
                int i28 = columnIndexOrThrow30;
                int i29 = columnIndexOrThrow31;
                int i30 = columnIndexOrThrow32;
                columnIndexOrThrow31 = i29;
                int i31 = columnIndexOrThrow33;
                arrayList.add(new WorkSpec(text, intToState, text2, text3, fromByteArray, fromByteArray2, j2, j3, j4, new Constraints(networkRequest$work_runtime_release, intToNetworkType, z2, z3, z4, ((int) prepare.getLong(i28)) != 0, prepare.getLong(i29), prepare.getLong(i30), WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i31))), i4, intToBackoffPolicy, j5, j6, j7, j8, z, intToOutOfQuotaPolicy, i13, i15, j9, i18, i20, text4, bool2));
                columnIndexOrThrow4 = i11;
                columnIndexOrThrow17 = i10;
                columnIndexOrThrow18 = i12;
                columnIndexOrThrow19 = i14;
                columnIndexOrThrow20 = i16;
                columnIndexOrThrow23 = i;
                columnIndexOrThrow24 = i22;
                columnIndexOrThrow25 = i23;
                columnIndexOrThrow26 = i24;
                columnIndexOrThrow27 = i25;
                columnIndexOrThrow28 = i26;
                columnIndexOrThrow33 = i31;
                columnIndexOrThrow32 = i30;
                columnIndexOrThrow30 = i28;
                columnIndexOrThrow = i5;
                columnIndexOrThrow13 = i2;
                columnIndexOrThrow14 = i3;
                columnIndexOrThrow2 = i6;
                columnIndexOrThrow3 = i9;
                columnIndexOrThrow16 = i8;
            }
            return arrayList;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int countNonFinishedContentUriTriggerWorkers() {
        final String str = "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)";
        return ((Number) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int countNonFinishedContentUriTriggerWorkers$lambda$36;
                countNonFinishedContentUriTriggerWorkers$lambda$36 = WorkSpecDao_Impl.countNonFinishedContentUriTriggerWorkers$lambda$36(str, (SQLiteConnection) obj);
                return Integer.valueOf(countNonFinishedContentUriTriggerWorkers$lambda$36);
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countNonFinishedContentUriTriggerWorkers$lambda$36(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            return prepare.step() ? (int) prepare.getLong(0) : 0;
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "DELETE FROM workspec WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit delete$lambda$37;
                delete$lambda$37 = WorkSpecDao_Impl.delete$lambda$37(str, id, (SQLiteConnection) obj);
                return delete$lambda$37;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit delete$lambda$37(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(final WorkInfo.State state, final String id) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET state=? WHERE id=?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int state$lambda$38;
                state$lambda$38 = WorkSpecDao_Impl.setState$lambda$38(str, state, id, (SQLiteConnection) obj);
                return Integer.valueOf(state$lambda$38);
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int setState$lambda$38(String str, WorkInfo.State state, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, WorkTypeConverters.stateToInt(state));
            prepare.mo8890bindText(2, str2);
            prepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(_connection);
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setCancelledState(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int cancelledState$lambda$39;
                cancelledState$lambda$39 = WorkSpecDao_Impl.setCancelledState$lambda$39(str, id, (SQLiteConnection) obj);
                return Integer.valueOf(cancelledState$lambda$39);
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int setCancelledState$lambda$39(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            prepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(_connection);
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementPeriodCount(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit incrementPeriodCount$lambda$40;
                incrementPeriodCount$lambda$40 = WorkSpecDao_Impl.incrementPeriodCount$lambda$40(str, id, (SQLiteConnection) obj);
                return incrementPeriodCount$lambda$40;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incrementPeriodCount$lambda$40(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(final String id, final Data output) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(output, "output");
        final String str = "UPDATE workspec SET output=? WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit output$lambda$41;
                output$lambda$41 = WorkSpecDao_Impl.setOutput$lambda$41(str, output, id, (SQLiteConnection) obj);
                return output$lambda$41;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOutput$lambda$41(String str, Data data, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8886bindBlob(1, Data.INSTANCE.toByteArrayInternalV1(data));
            prepare.mo8890bindText(2, str2);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setLastEnqueueTime(final String id, final long enqueueTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lastEnqueueTime$lambda$42;
                lastEnqueueTime$lambda$42 = WorkSpecDao_Impl.setLastEnqueueTime$lambda$42(str, enqueueTime, id, (SQLiteConnection) obj);
                return lastEnqueueTime$lambda$42;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLastEnqueueTime$lambda$42(String str, long j, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, j);
            prepare.mo8890bindText(2, str2);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int incrementWorkSpecRunAttemptCount$lambda$43;
                incrementWorkSpecRunAttemptCount$lambda$43 = WorkSpecDao_Impl.incrementWorkSpecRunAttemptCount$lambda$43(str, id, (SQLiteConnection) obj);
                return Integer.valueOf(incrementWorkSpecRunAttemptCount$lambda$43);
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int incrementWorkSpecRunAttemptCount$lambda$43(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            prepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(_connection);
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int resetWorkSpecRunAttemptCount$lambda$44;
                resetWorkSpecRunAttemptCount$lambda$44 = WorkSpecDao_Impl.resetWorkSpecRunAttemptCount$lambda$44(str, id, (SQLiteConnection) obj);
                return Integer.valueOf(resetWorkSpecRunAttemptCount$lambda$44);
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int resetWorkSpecRunAttemptCount$lambda$44(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            prepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(_connection);
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setNextScheduleTimeOverride(final String id, final long nextScheduleTimeOverrideMillis) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit nextScheduleTimeOverride$lambda$45;
                nextScheduleTimeOverride$lambda$45 = WorkSpecDao_Impl.setNextScheduleTimeOverride$lambda$45(str, nextScheduleTimeOverrideMillis, id, (SQLiteConnection) obj);
                return nextScheduleTimeOverride$lambda$45;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setNextScheduleTimeOverride$lambda$45(String str, long j, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, j);
            prepare.mo8890bindText(2, str2);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void resetWorkSpecNextScheduleTimeOverride(final String id, final int overrideGeneration) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit resetWorkSpecNextScheduleTimeOverride$lambda$46;
                resetWorkSpecNextScheduleTimeOverride$lambda$46 = WorkSpecDao_Impl.resetWorkSpecNextScheduleTimeOverride$lambda$46(str, id, overrideGeneration, (SQLiteConnection) obj);
                return resetWorkSpecNextScheduleTimeOverride$lambda$46;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetWorkSpecNextScheduleTimeOverride$lambda$46(String str, String str2, int i, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            prepare.mo8888bindLong(2, i);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(final String id, final long startTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int markWorkSpecScheduled$lambda$47;
                markWorkSpecScheduled$lambda$47 = WorkSpecDao_Impl.markWorkSpecScheduled$lambda$47(str, startTime, id, (SQLiteConnection) obj);
                return Integer.valueOf(markWorkSpecScheduled$lambda$47);
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int markWorkSpecScheduled$lambda$47(String str, long j, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, j);
            prepare.mo8890bindText(2, str2);
            prepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(_connection);
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        final String str = "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        return ((Number) DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int resetScheduledState$lambda$48;
                resetScheduledState$lambda$48 = WorkSpecDao_Impl.resetScheduledState$lambda$48(str, (SQLiteConnection) obj);
                return Integer.valueOf(resetScheduledState$lambda$48);
            }
        })).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int resetScheduledState$lambda$48(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.step();
            return SQLiteConnectionUtil.getTotalChangedRows(_connection);
        } finally {
            prepare.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        final String str = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$49;
                pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$49 = WorkSpecDao_Impl.pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$49(str, (SQLiteConnection) obj);
                return pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$49;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast$lambda$49(String str, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementGeneration(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET generation=generation+1 WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit incrementGeneration$lambda$50;
                incrementGeneration$lambda$50 = WorkSpecDao_Impl.incrementGeneration$lambda$50(str, id, (SQLiteConnection) obj);
                return incrementGeneration$lambda$50;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incrementGeneration$lambda$50(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8890bindText(1, str2);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setStopReason(final String id, final int stopReason) {
        Intrinsics.checkNotNullParameter(id, "id");
        final String str = "UPDATE workspec SET stop_reason=? WHERE id=?";
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit stopReason$lambda$51;
                stopReason$lambda$51 = WorkSpecDao_Impl.setStopReason$lambda$51(str, stopReason, id, (SQLiteConnection) obj);
                return stopReason$lambda$51;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setStopReason$lambda$51(String str, int i, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            prepare.mo8888bindLong(1, i);
            prepare.mo8890bindText(2, str2);
            prepare.step();
            prepare.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            prepare.close();
            throw th;
        }
    }

    private final void __fetchRelationshipWorkTagAsjavaLangString(final SQLiteConnection _connection, ArrayMap<String, List<String>> _map) {
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit __fetchRelationshipWorkTagAsjavaLangString$lambda$52;
                    __fetchRelationshipWorkTagAsjavaLangString$lambda$52 = WorkSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString$lambda$52(WorkSpecDao_Impl.this, _connection, (ArrayMap) obj);
                    return __fetchRelationshipWorkTagAsjavaLangString$lambda$52;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(sb, keySet.size());
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        SQLiteStatement prepare = _connection.prepare(sb2);
        Iterator<String> it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            prepare.mo8890bindText(i, it.next());
            i++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(prepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (prepare.step()) {
                List<String> list = _map.get(prepare.getText(columnIndex));
                if (list != null) {
                    list.add(prepare.getText(0));
                }
            }
        } finally {
            prepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit __fetchRelationshipWorkTagAsjavaLangString$lambda$52(WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        workSpecDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, _tmpMap);
        return Unit.INSTANCE;
    }

    private final void __fetchRelationshipWorkProgressAsandroidxWorkData(final SQLiteConnection _connection, ArrayMap<String, List<Data>> _map) {
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, true, new Function1() { // from class: androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$53;
                    __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$53 = WorkSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData$lambda$53(WorkSpecDao_Impl.this, _connection, (ArrayMap) obj);
                    return __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$53;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(sb, keySet.size());
        sb.append(")");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        SQLiteStatement prepare = _connection.prepare(sb2);
        Iterator<String> it = keySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            prepare.mo8890bindText(i, it.next());
            i++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(prepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (prepare.step()) {
                List<Data> list = _map.get(prepare.getText(columnIndex));
                if (list != null) {
                    list.add(Data.INSTANCE.fromByteArray(prepare.getBlob(0)));
                }
            }
        } finally {
            prepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$53(WorkSpecDao_Impl workSpecDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        workSpecDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, _tmpMap);
        return Unit.INSTANCE;
    }

    /* compiled from: WorkSpecDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
