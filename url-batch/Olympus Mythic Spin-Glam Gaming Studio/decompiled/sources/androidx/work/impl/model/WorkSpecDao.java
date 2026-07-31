package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.room.Dao;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;

/* compiled from: WorkSpecDao.kt */
@Dao
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0014\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010!J\u0019\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH'¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\u0006\u0010+\u001a\u00020\u0007H'¢\u0006\u0004\b,\u0010\u0011J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b-\u0010\u0011J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b.\u0010\u0011J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010+\u001a\u00020\u0007H'¢\u0006\u0004\b/\u0010\u0011J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b0\u0010\u0011J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH'¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H'¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u001cH'¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0014H'¢\u0006\u0004\b9\u0010:J\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010;\u001a\u00020\u0014H'¢\u0006\u0004\b<\u0010=J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010>\u001a\u00020\u0014H'¢\u0006\u0004\b?\u0010=J\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b@\u00102J\u0015\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\bA\u00102J\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010B\u001a\u00020\u001cH'¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0004H'¢\u0006\u0004\bE\u0010F¨\u0006G"}, d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "insertWorkSpec", "(Landroidx/work/impl/model/WorkSpec;)V", "", "id", "delete", "(Ljava/lang/String;)V", "getWorkSpec", "(Ljava/lang/String;)Landroidx/work/impl/model/WorkSpec;", "name", "", "Landroidx/work/impl/model/WorkSpec$IdAndState;", "getWorkSpecIdAndStatesForName", "(Ljava/lang/String;)Ljava/util/List;", "Landroidx/work/WorkInfo$State;", "state", "", "setState", "(Landroidx/work/WorkInfo$State;Ljava/lang/String;)I", "incrementPeriodCount", "Landroidx/work/Data;", "output", "setOutput", "(Ljava/lang/String;Landroidx/work/Data;)V", "", "enqueueTime", "setLastEnqueuedTime", "(Ljava/lang/String;J)V", "incrementWorkSpecRunAttemptCount", "(Ljava/lang/String;)I", "resetWorkSpecRunAttemptCount", "getState", "(Ljava/lang/String;)Landroidx/work/WorkInfo$State;", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "getWorkStatusPojoForId", "(Ljava/lang/String;)Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "ids", "getWorkStatusPojoForIds", "(Ljava/util/List;)Ljava/util/List;", "tag", "getWorkStatusPojoForTag", "getWorkStatusPojoForName", "getInputsFromPrerequisites", "getUnfinishedWorkWithTag", "getUnfinishedWorkWithName", "getAllUnfinishedWork", "()Ljava/util/List;", "", "hasUnfinishedWork", "()Z", "startTime", "markWorkSpecScheduled", "(Ljava/lang/String;J)I", "resetScheduledState", "()I", "schedulerLimit", "getEligibleWorkForScheduling", "(I)Ljava/util/List;", "maxLimit", "getAllEligibleWorkSpecsForScheduling", "getScheduledWork", "getRunningWork", "startingAt", "getRecentlyCompletedWork", "(J)Ljava/util/List;", "pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@SuppressLint({"UnknownNullness"})
/* loaded from: classes10.dex */
public interface WorkSpecDao {
    void delete(String id);

    List getAllEligibleWorkSpecsForScheduling(int maxLimit);

    List getAllUnfinishedWork();

    List getEligibleWorkForScheduling(int schedulerLimit);

    List getInputsFromPrerequisites(String id);

    List getRecentlyCompletedWork(long startingAt);

    List getRunningWork();

    List getScheduledWork();

    WorkInfo.State getState(String id);

    List getUnfinishedWorkWithName(String name);

    List getUnfinishedWorkWithTag(String tag);

    WorkSpec getWorkSpec(String id);

    List getWorkSpecIdAndStatesForName(String name);

    WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String id);

    List getWorkStatusPojoForIds(List ids);

    List getWorkStatusPojoForName(String name);

    List getWorkStatusPojoForTag(String tag);

    boolean hasUnfinishedWork();

    void incrementPeriodCount(String id);

    int incrementWorkSpecRunAttemptCount(String id);

    void insertWorkSpec(WorkSpec workSpec);

    int markWorkSpecScheduled(String id, long startTime);

    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    int resetScheduledState();

    int resetWorkSpecRunAttemptCount(String id);

    void setLastEnqueuedTime(String id, long enqueueTime);

    void setOutput(String id, Data output);

    int setState(WorkInfo.State state, String id);
}
