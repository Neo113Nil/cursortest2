package androidx.work.impl.model;

import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import com.google.android.gms.actions.SearchIntents;
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

/* compiled from: RawWorkInfoDao_Impl.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00160\u0014H\u0002J*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00160\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao_Impl;", "Landroidx/work/impl/model/RawWorkInfoDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "getWorkInfoPojos", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", SearchIntents.EXTRA_QUERY, "Landroidx/sqlite/db/SupportSQLiteQuery;", "getWorkInfoPojosLiveData", "Landroidx/lifecycle/LiveData;", "getWorkInfoPojosFlow", "Lkotlinx/coroutines/flow/Flow;", "__fetchRelationshipWorkTagAsjavaLangString", "", "_connection", "Landroidx/sqlite/SQLiteConnection;", "_map", "Landroidx/collection/ArrayMap;", "", "", "__fetchRelationshipWorkProgressAsandroidxWorkData", "Landroidx/work/Data;", "Companion", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.INSTANCE.copyFrom(query).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workInfoPojos$lambda$0;
                workInfoPojos$lambda$0 = RawWorkInfoDao_Impl.getWorkInfoPojos$lambda$0(sql, roomRawQuery, this, (SQLiteConnection) obj);
                return workInfoPojos$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkInfoPojos$lambda$0(String str, RoomRawQuery roomRawQuery, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection _connection) {
        SQLiteStatement sQLiteStatement;
        ArrayMap<String, List<String>> arrayMap;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        boolean z2;
        int i13;
        boolean z3;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke(prepare);
            int columnIndex = SQLiteStatementUtil.getColumnIndex(prepare, "id");
            int columnIndex2 = SQLiteStatementUtil.getColumnIndex(prepare, "state");
            int columnIndex3 = SQLiteStatementUtil.getColumnIndex(prepare, "output");
            int columnIndex4 = SQLiteStatementUtil.getColumnIndex(prepare, "initial_delay");
            int columnIndex5 = SQLiteStatementUtil.getColumnIndex(prepare, "interval_duration");
            int columnIndex6 = SQLiteStatementUtil.getColumnIndex(prepare, "flex_duration");
            int columnIndex7 = SQLiteStatementUtil.getColumnIndex(prepare, "run_attempt_count");
            int columnIndex8 = SQLiteStatementUtil.getColumnIndex(prepare, "backoff_policy");
            int columnIndex9 = SQLiteStatementUtil.getColumnIndex(prepare, "backoff_delay_duration");
            int columnIndex10 = SQLiteStatementUtil.getColumnIndex(prepare, "last_enqueue_time");
            int columnIndex11 = SQLiteStatementUtil.getColumnIndex(prepare, "period_count");
            int columnIndex12 = SQLiteStatementUtil.getColumnIndex(prepare, "generation");
            String str2 = "getValue(...)";
            int columnIndex13 = SQLiteStatementUtil.getColumnIndex(prepare, "next_schedule_time_override");
            int columnIndex14 = SQLiteStatementUtil.getColumnIndex(prepare, "stop_reason");
            int columnIndex15 = SQLiteStatementUtil.getColumnIndex(prepare, "required_network_type");
            int columnIndex16 = SQLiteStatementUtil.getColumnIndex(prepare, "required_network_request");
            int columnIndex17 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_charging");
            int columnIndex18 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_device_idle");
            int columnIndex19 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_battery_not_low");
            int columnIndex20 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_storage_not_low");
            int columnIndex21 = SQLiteStatementUtil.getColumnIndex(prepare, "trigger_content_update_delay");
            int columnIndex22 = SQLiteStatementUtil.getColumnIndex(prepare, "trigger_max_content_delay");
            int columnIndex23 = SQLiteStatementUtil.getColumnIndex(prepare, "content_uri_triggers");
            ArrayMap<String, List<String>> arrayMap2 = new ArrayMap<>();
            int i16 = columnIndex12;
            ArrayMap<String, List<Data>> arrayMap3 = new ArrayMap<>();
            while (prepare.step()) {
                int i17 = columnIndex11;
                String text = prepare.getText(columnIndex);
                if (arrayMap2.containsKey(text)) {
                    i15 = columnIndex10;
                } else {
                    i15 = columnIndex10;
                    arrayMap2.put(text, new ArrayList());
                }
                String text2 = prepare.getText(columnIndex);
                if (!arrayMap3.containsKey(text2)) {
                    arrayMap3.put(text2, new ArrayList());
                }
                columnIndex11 = i17;
                columnIndex10 = i15;
            }
            int i18 = columnIndex10;
            int i19 = columnIndex11;
            prepare.reset();
            rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap2);
            rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap3);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                if (columnIndex == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.".toString());
                }
                String text3 = prepare.getText(columnIndex);
                if (columnIndex2 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.".toString());
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(columnIndex2));
                if (columnIndex3 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.".toString());
                }
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndex3));
                long j = columnIndex4 == -1 ? 0L : prepare.getLong(columnIndex4);
                long j2 = columnIndex5 == -1 ? 0L : prepare.getLong(columnIndex5);
                long j3 = columnIndex6 == -1 ? 0L : prepare.getLong(columnIndex6);
                boolean z4 = false;
                int i20 = columnIndex7 == -1 ? 0 : (int) prepare.getLong(columnIndex7);
                if (columnIndex8 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.".toString());
                }
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndex8));
                long j4 = columnIndex9 == -1 ? 0L : prepare.getLong(columnIndex9);
                int i21 = i18;
                long j5 = i21 == -1 ? 0L : prepare.getLong(i21);
                int i22 = i19;
                if (i22 == -1) {
                    arrayMap = arrayMap2;
                    i = 0;
                    i2 = -1;
                } else {
                    arrayMap = arrayMap2;
                    i = (int) prepare.getLong(i22);
                    i2 = -1;
                }
                int i23 = i16;
                if (i23 == i2) {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i5 = 0;
                } else {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i5 = (int) prepare.getLong(i23);
                }
                int i24 = columnIndex13;
                long j6 = i24 == i2 ? 0L : prepare.getLong(i24);
                int i25 = columnIndex14;
                if (i25 == i2) {
                    i6 = columnIndex4;
                    i7 = columnIndex5;
                    i8 = 0;
                } else {
                    i6 = columnIndex4;
                    i7 = columnIndex5;
                    i8 = (int) prepare.getLong(i25);
                }
                int i26 = columnIndex15;
                if (i26 == i2) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.".toString());
                }
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType((int) prepare.getLong(i26));
                int i27 = columnIndex16;
                if (i27 == i2) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.".toString());
                }
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i27));
                int i28 = columnIndex17;
                if (i28 == i2) {
                    i9 = i26;
                    i10 = i24;
                    z = false;
                } else {
                    i9 = i26;
                    i10 = i24;
                    z = ((int) prepare.getLong(i28)) != 0;
                }
                int i29 = columnIndex18;
                if (i29 == i2) {
                    i11 = i27;
                    i12 = i28;
                    z2 = false;
                } else {
                    i11 = i27;
                    i12 = i28;
                    z2 = ((int) prepare.getLong(i29)) != 0;
                }
                int i30 = columnIndex19;
                if (i30 == i2) {
                    i13 = i29;
                    z3 = false;
                } else {
                    i13 = i29;
                    z3 = ((int) prepare.getLong(i30)) != 0;
                }
                int i31 = columnIndex20;
                if (i31 == i2) {
                    i14 = i11;
                } else {
                    i14 = i11;
                    if (((int) prepare.getLong(i31)) != 0) {
                        z4 = true;
                    }
                }
                int i32 = columnIndex21;
                boolean z5 = z4;
                long j7 = i32 == i2 ? 0L : prepare.getLong(i32);
                int i33 = columnIndex22;
                long j8 = i33 == i2 ? 0L : prepare.getLong(i33);
                int i34 = columnIndex23;
                if (i34 == i2) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.".toString());
                }
                Constraints constraints = new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z5, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i34)));
                columnIndex23 = i34;
                Object value = MapsKt.getValue(arrayMap, prepare.getText(columnIndex));
                String str3 = str2;
                Intrinsics.checkNotNullExpressionValue(value, str3);
                List list = (List) value;
                sQLiteStatement = prepare;
                try {
                    Object value2 = MapsKt.getValue(arrayMap3, prepare.getText(columnIndex));
                    Intrinsics.checkNotNullExpressionValue(value2, str3);
                    arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i20, intToBackoffPolicy, j4, j5, i, i5, j6, i8, list, (List) value2));
                    columnIndex21 = i32;
                    columnIndex22 = i33;
                    prepare = sQLiteStatement;
                    columnIndex4 = i6;
                    columnIndex5 = i7;
                    str2 = str3;
                    columnIndex14 = i25;
                    columnIndex15 = i9;
                    columnIndex17 = i12;
                    columnIndex18 = i13;
                    arrayMap2 = arrayMap;
                    columnIndex13 = i10;
                    columnIndex19 = i30;
                    i19 = i22;
                    columnIndex2 = i3;
                    i16 = i23;
                    columnIndex16 = i14;
                    columnIndex20 = i31;
                    columnIndex3 = i4;
                    i18 = i21;
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatement.close();
                    throw th;
                }
            }
            prepare.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            sQLiteStatement = prepare;
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.INSTANCE.copyFrom(query).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workInfoPojosLiveData$lambda$1;
                workInfoPojosLiveData$lambda$1 = RawWorkInfoDao_Impl.getWorkInfoPojosLiveData$lambda$1(sql, roomRawQuery, this, (SQLiteConnection) obj);
                return workInfoPojosLiveData$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkInfoPojosLiveData$lambda$1(String str, RoomRawQuery roomRawQuery, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection _connection) {
        SQLiteStatement sQLiteStatement;
        ArrayMap<String, List<String>> arrayMap;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        boolean z2;
        int i13;
        boolean z3;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke(prepare);
            int columnIndex = SQLiteStatementUtil.getColumnIndex(prepare, "id");
            int columnIndex2 = SQLiteStatementUtil.getColumnIndex(prepare, "state");
            int columnIndex3 = SQLiteStatementUtil.getColumnIndex(prepare, "output");
            int columnIndex4 = SQLiteStatementUtil.getColumnIndex(prepare, "initial_delay");
            int columnIndex5 = SQLiteStatementUtil.getColumnIndex(prepare, "interval_duration");
            int columnIndex6 = SQLiteStatementUtil.getColumnIndex(prepare, "flex_duration");
            int columnIndex7 = SQLiteStatementUtil.getColumnIndex(prepare, "run_attempt_count");
            int columnIndex8 = SQLiteStatementUtil.getColumnIndex(prepare, "backoff_policy");
            int columnIndex9 = SQLiteStatementUtil.getColumnIndex(prepare, "backoff_delay_duration");
            int columnIndex10 = SQLiteStatementUtil.getColumnIndex(prepare, "last_enqueue_time");
            int columnIndex11 = SQLiteStatementUtil.getColumnIndex(prepare, "period_count");
            int columnIndex12 = SQLiteStatementUtil.getColumnIndex(prepare, "generation");
            String str2 = "getValue(...)";
            int columnIndex13 = SQLiteStatementUtil.getColumnIndex(prepare, "next_schedule_time_override");
            int columnIndex14 = SQLiteStatementUtil.getColumnIndex(prepare, "stop_reason");
            int columnIndex15 = SQLiteStatementUtil.getColumnIndex(prepare, "required_network_type");
            int columnIndex16 = SQLiteStatementUtil.getColumnIndex(prepare, "required_network_request");
            int columnIndex17 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_charging");
            int columnIndex18 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_device_idle");
            int columnIndex19 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_battery_not_low");
            int columnIndex20 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_storage_not_low");
            int columnIndex21 = SQLiteStatementUtil.getColumnIndex(prepare, "trigger_content_update_delay");
            int columnIndex22 = SQLiteStatementUtil.getColumnIndex(prepare, "trigger_max_content_delay");
            int columnIndex23 = SQLiteStatementUtil.getColumnIndex(prepare, "content_uri_triggers");
            ArrayMap<String, List<String>> arrayMap2 = new ArrayMap<>();
            int i16 = columnIndex12;
            ArrayMap<String, List<Data>> arrayMap3 = new ArrayMap<>();
            while (prepare.step()) {
                int i17 = columnIndex11;
                String text = prepare.getText(columnIndex);
                if (arrayMap2.containsKey(text)) {
                    i15 = columnIndex10;
                } else {
                    i15 = columnIndex10;
                    arrayMap2.put(text, new ArrayList());
                }
                String text2 = prepare.getText(columnIndex);
                if (!arrayMap3.containsKey(text2)) {
                    arrayMap3.put(text2, new ArrayList());
                }
                columnIndex11 = i17;
                columnIndex10 = i15;
            }
            int i18 = columnIndex10;
            int i19 = columnIndex11;
            prepare.reset();
            rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap2);
            rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap3);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                if (columnIndex == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.".toString());
                }
                String text3 = prepare.getText(columnIndex);
                if (columnIndex2 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.".toString());
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(columnIndex2));
                if (columnIndex3 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.".toString());
                }
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndex3));
                long j = columnIndex4 == -1 ? 0L : prepare.getLong(columnIndex4);
                long j2 = columnIndex5 == -1 ? 0L : prepare.getLong(columnIndex5);
                long j3 = columnIndex6 == -1 ? 0L : prepare.getLong(columnIndex6);
                boolean z4 = false;
                int i20 = columnIndex7 == -1 ? 0 : (int) prepare.getLong(columnIndex7);
                if (columnIndex8 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.".toString());
                }
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndex8));
                long j4 = columnIndex9 == -1 ? 0L : prepare.getLong(columnIndex9);
                int i21 = i18;
                long j5 = i21 == -1 ? 0L : prepare.getLong(i21);
                int i22 = i19;
                if (i22 == -1) {
                    arrayMap = arrayMap2;
                    i = 0;
                    i2 = -1;
                } else {
                    arrayMap = arrayMap2;
                    i = (int) prepare.getLong(i22);
                    i2 = -1;
                }
                int i23 = i16;
                if (i23 == i2) {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i5 = 0;
                } else {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i5 = (int) prepare.getLong(i23);
                }
                int i24 = columnIndex13;
                long j6 = i24 == i2 ? 0L : prepare.getLong(i24);
                int i25 = columnIndex14;
                if (i25 == i2) {
                    i6 = columnIndex4;
                    i7 = columnIndex5;
                    i8 = 0;
                } else {
                    i6 = columnIndex4;
                    i7 = columnIndex5;
                    i8 = (int) prepare.getLong(i25);
                }
                int i26 = columnIndex15;
                if (i26 == i2) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.".toString());
                }
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType((int) prepare.getLong(i26));
                int i27 = columnIndex16;
                if (i27 == i2) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.".toString());
                }
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i27));
                int i28 = columnIndex17;
                if (i28 == i2) {
                    i9 = i26;
                    i10 = i24;
                    z = false;
                } else {
                    i9 = i26;
                    i10 = i24;
                    z = ((int) prepare.getLong(i28)) != 0;
                }
                int i29 = columnIndex18;
                if (i29 == i2) {
                    i11 = i27;
                    i12 = i28;
                    z2 = false;
                } else {
                    i11 = i27;
                    i12 = i28;
                    z2 = ((int) prepare.getLong(i29)) != 0;
                }
                int i30 = columnIndex19;
                if (i30 == i2) {
                    i13 = i29;
                    z3 = false;
                } else {
                    i13 = i29;
                    z3 = ((int) prepare.getLong(i30)) != 0;
                }
                int i31 = columnIndex20;
                if (i31 == i2) {
                    i14 = i11;
                } else {
                    i14 = i11;
                    if (((int) prepare.getLong(i31)) != 0) {
                        z4 = true;
                    }
                }
                int i32 = columnIndex21;
                boolean z5 = z4;
                long j7 = i32 == i2 ? 0L : prepare.getLong(i32);
                int i33 = columnIndex22;
                long j8 = i33 == i2 ? 0L : prepare.getLong(i33);
                int i34 = columnIndex23;
                if (i34 == i2) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.".toString());
                }
                Constraints constraints = new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z5, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i34)));
                columnIndex23 = i34;
                Object value = MapsKt.getValue(arrayMap, prepare.getText(columnIndex));
                String str3 = str2;
                Intrinsics.checkNotNullExpressionValue(value, str3);
                List list = (List) value;
                sQLiteStatement = prepare;
                try {
                    Object value2 = MapsKt.getValue(arrayMap3, prepare.getText(columnIndex));
                    Intrinsics.checkNotNullExpressionValue(value2, str3);
                    arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i20, intToBackoffPolicy, j4, j5, i, i5, j6, i8, list, (List) value2));
                    columnIndex21 = i32;
                    columnIndex22 = i33;
                    prepare = sQLiteStatement;
                    columnIndex4 = i6;
                    columnIndex5 = i7;
                    str2 = str3;
                    columnIndex14 = i25;
                    columnIndex15 = i9;
                    columnIndex17 = i12;
                    columnIndex18 = i13;
                    arrayMap2 = arrayMap;
                    columnIndex13 = i10;
                    columnIndex19 = i30;
                    i19 = i22;
                    columnIndex2 = i3;
                    i16 = i23;
                    columnIndex16 = i14;
                    columnIndex20 = i31;
                    columnIndex3 = i4;
                    i18 = i21;
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatement.close();
                    throw th;
                }
            }
            prepare.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            sQLiteStatement = prepare;
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.INSTANCE.copyFrom(query).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return FlowUtil.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List workInfoPojosFlow$lambda$2;
                workInfoPojosFlow$lambda$2 = RawWorkInfoDao_Impl.getWorkInfoPojosFlow$lambda$2(sql, roomRawQuery, this, (SQLiteConnection) obj);
                return workInfoPojosFlow$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkInfoPojosFlow$lambda$2(String str, RoomRawQuery roomRawQuery, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection _connection) {
        SQLiteStatement sQLiteStatement;
        ArrayMap<String, List<String>> arrayMap;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        boolean z2;
        int i13;
        boolean z3;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement prepare = _connection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke(prepare);
            int columnIndex = SQLiteStatementUtil.getColumnIndex(prepare, "id");
            int columnIndex2 = SQLiteStatementUtil.getColumnIndex(prepare, "state");
            int columnIndex3 = SQLiteStatementUtil.getColumnIndex(prepare, "output");
            int columnIndex4 = SQLiteStatementUtil.getColumnIndex(prepare, "initial_delay");
            int columnIndex5 = SQLiteStatementUtil.getColumnIndex(prepare, "interval_duration");
            int columnIndex6 = SQLiteStatementUtil.getColumnIndex(prepare, "flex_duration");
            int columnIndex7 = SQLiteStatementUtil.getColumnIndex(prepare, "run_attempt_count");
            int columnIndex8 = SQLiteStatementUtil.getColumnIndex(prepare, "backoff_policy");
            int columnIndex9 = SQLiteStatementUtil.getColumnIndex(prepare, "backoff_delay_duration");
            int columnIndex10 = SQLiteStatementUtil.getColumnIndex(prepare, "last_enqueue_time");
            int columnIndex11 = SQLiteStatementUtil.getColumnIndex(prepare, "period_count");
            int columnIndex12 = SQLiteStatementUtil.getColumnIndex(prepare, "generation");
            String str2 = "getValue(...)";
            int columnIndex13 = SQLiteStatementUtil.getColumnIndex(prepare, "next_schedule_time_override");
            int columnIndex14 = SQLiteStatementUtil.getColumnIndex(prepare, "stop_reason");
            int columnIndex15 = SQLiteStatementUtil.getColumnIndex(prepare, "required_network_type");
            int columnIndex16 = SQLiteStatementUtil.getColumnIndex(prepare, "required_network_request");
            int columnIndex17 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_charging");
            int columnIndex18 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_device_idle");
            int columnIndex19 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_battery_not_low");
            int columnIndex20 = SQLiteStatementUtil.getColumnIndex(prepare, "requires_storage_not_low");
            int columnIndex21 = SQLiteStatementUtil.getColumnIndex(prepare, "trigger_content_update_delay");
            int columnIndex22 = SQLiteStatementUtil.getColumnIndex(prepare, "trigger_max_content_delay");
            int columnIndex23 = SQLiteStatementUtil.getColumnIndex(prepare, "content_uri_triggers");
            ArrayMap<String, List<String>> arrayMap2 = new ArrayMap<>();
            int i16 = columnIndex12;
            ArrayMap<String, List<Data>> arrayMap3 = new ArrayMap<>();
            while (prepare.step()) {
                int i17 = columnIndex11;
                String text = prepare.getText(columnIndex);
                if (arrayMap2.containsKey(text)) {
                    i15 = columnIndex10;
                } else {
                    i15 = columnIndex10;
                    arrayMap2.put(text, new ArrayList());
                }
                String text2 = prepare.getText(columnIndex);
                if (!arrayMap3.containsKey(text2)) {
                    arrayMap3.put(text2, new ArrayList());
                }
                columnIndex11 = i17;
                columnIndex10 = i15;
            }
            int i18 = columnIndex10;
            int i19 = columnIndex11;
            prepare.reset();
            rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap2);
            rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap3);
            ArrayList arrayList = new ArrayList();
            while (prepare.step()) {
                if (columnIndex == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.".toString());
                }
                String text3 = prepare.getText(columnIndex);
                if (columnIndex2 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.".toString());
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState((int) prepare.getLong(columnIndex2));
                if (columnIndex3 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.".toString());
                }
                Data fromByteArray = Data.INSTANCE.fromByteArray(prepare.getBlob(columnIndex3));
                long j = columnIndex4 == -1 ? 0L : prepare.getLong(columnIndex4);
                long j2 = columnIndex5 == -1 ? 0L : prepare.getLong(columnIndex5);
                long j3 = columnIndex6 == -1 ? 0L : prepare.getLong(columnIndex6);
                boolean z4 = false;
                int i20 = columnIndex7 == -1 ? 0 : (int) prepare.getLong(columnIndex7);
                if (columnIndex8 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.".toString());
                }
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) prepare.getLong(columnIndex8));
                long j4 = columnIndex9 == -1 ? 0L : prepare.getLong(columnIndex9);
                int i21 = i18;
                long j5 = i21 == -1 ? 0L : prepare.getLong(i21);
                int i22 = i19;
                if (i22 == -1) {
                    arrayMap = arrayMap2;
                    i = 0;
                    i2 = -1;
                } else {
                    arrayMap = arrayMap2;
                    i = (int) prepare.getLong(i22);
                    i2 = -1;
                }
                int i23 = i16;
                if (i23 == i2) {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i5 = 0;
                } else {
                    i3 = columnIndex2;
                    i4 = columnIndex3;
                    i5 = (int) prepare.getLong(i23);
                }
                int i24 = columnIndex13;
                long j6 = i24 == i2 ? 0L : prepare.getLong(i24);
                int i25 = columnIndex14;
                if (i25 == i2) {
                    i6 = columnIndex4;
                    i7 = columnIndex5;
                    i8 = 0;
                } else {
                    i6 = columnIndex4;
                    i7 = columnIndex5;
                    i8 = (int) prepare.getLong(i25);
                }
                int i26 = columnIndex15;
                if (i26 == i2) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.".toString());
                }
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType((int) prepare.getLong(i26));
                int i27 = columnIndex16;
                if (i27 == i2) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.".toString());
                }
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(prepare.getBlob(i27));
                int i28 = columnIndex17;
                if (i28 == i2) {
                    i9 = i26;
                    i10 = i24;
                    z = false;
                } else {
                    i9 = i26;
                    i10 = i24;
                    z = ((int) prepare.getLong(i28)) != 0;
                }
                int i29 = columnIndex18;
                if (i29 == i2) {
                    i11 = i27;
                    i12 = i28;
                    z2 = false;
                } else {
                    i11 = i27;
                    i12 = i28;
                    z2 = ((int) prepare.getLong(i29)) != 0;
                }
                int i30 = columnIndex19;
                if (i30 == i2) {
                    i13 = i29;
                    z3 = false;
                } else {
                    i13 = i29;
                    z3 = ((int) prepare.getLong(i30)) != 0;
                }
                int i31 = columnIndex20;
                if (i31 == i2) {
                    i14 = i11;
                } else {
                    i14 = i11;
                    if (((int) prepare.getLong(i31)) != 0) {
                        z4 = true;
                    }
                }
                int i32 = columnIndex21;
                boolean z5 = z4;
                long j7 = i32 == i2 ? 0L : prepare.getLong(i32);
                int i33 = columnIndex22;
                long j8 = i33 == i2 ? 0L : prepare.getLong(i33);
                int i34 = columnIndex23;
                if (i34 == i2) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.".toString());
                }
                Constraints constraints = new Constraints(networkRequest$work_runtime_release, intToNetworkType, z, z2, z3, z5, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(prepare.getBlob(i34)));
                columnIndex23 = i34;
                Object value = MapsKt.getValue(arrayMap, prepare.getText(columnIndex));
                String str3 = str2;
                Intrinsics.checkNotNullExpressionValue(value, str3);
                List list = (List) value;
                sQLiteStatement = prepare;
                try {
                    Object value2 = MapsKt.getValue(arrayMap3, prepare.getText(columnIndex));
                    Intrinsics.checkNotNullExpressionValue(value2, str3);
                    arrayList.add(new WorkSpec.WorkInfoPojo(text3, intToState, fromByteArray, j, j2, j3, constraints, i20, intToBackoffPolicy, j4, j5, i, i5, j6, i8, list, (List) value2));
                    columnIndex21 = i32;
                    columnIndex22 = i33;
                    prepare = sQLiteStatement;
                    columnIndex4 = i6;
                    columnIndex5 = i7;
                    str2 = str3;
                    columnIndex14 = i25;
                    columnIndex15 = i9;
                    columnIndex17 = i12;
                    columnIndex18 = i13;
                    arrayMap2 = arrayMap;
                    columnIndex13 = i10;
                    columnIndex19 = i30;
                    i19 = i22;
                    columnIndex2 = i3;
                    i16 = i23;
                    columnIndex16 = i14;
                    columnIndex20 = i31;
                    columnIndex3 = i4;
                    i18 = i21;
                } catch (Throwable th) {
                    th = th;
                    sQLiteStatement.close();
                    throw th;
                }
            }
            prepare.close();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            sQLiteStatement = prepare;
        }
    }

    private final void __fetchRelationshipWorkTagAsjavaLangString(final SQLiteConnection _connection, ArrayMap<String, List<String>> _map) {
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, true, new Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit __fetchRelationshipWorkTagAsjavaLangString$lambda$3;
                    __fetchRelationshipWorkTagAsjavaLangString$lambda$3 = RawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString$lambda$3(RawWorkInfoDao_Impl.this, _connection, (ArrayMap) obj);
                    return __fetchRelationshipWorkTagAsjavaLangString$lambda$3;
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
    public static final Unit __fetchRelationshipWorkTagAsjavaLangString$lambda$3(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, _tmpMap);
        return Unit.INSTANCE;
    }

    private final void __fetchRelationshipWorkProgressAsandroidxWorkData(final SQLiteConnection _connection, ArrayMap<String, List<Data>> _map) {
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, true, new Function1() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4;
                    __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4 = RawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4(RawWorkInfoDao_Impl.this, _connection, (ArrayMap) obj);
                    return __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4;
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
    public static final Unit __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, _tmpMap);
        return Unit.INSTANCE;
    }

    /* compiled from: RawWorkInfoDao_Impl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
