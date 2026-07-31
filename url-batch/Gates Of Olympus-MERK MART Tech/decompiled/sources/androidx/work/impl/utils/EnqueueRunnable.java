package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class EnqueueRunnable {
    private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");

    private EnqueueRunnable() {
    }

    public static void enqueue(WorkContinuationImpl workContinuation) {
        if (workContinuation.hasCycles()) {
            throw new IllegalStateException("WorkContinuation has cycles (" + workContinuation + ")");
        }
        if (addToDatabase(workContinuation)) {
            scheduleWorkInBackground(workContinuation);
        }
    }

    public static boolean addToDatabase(WorkContinuationImpl workContinuation) {
        WorkManagerImpl workManagerImpl = workContinuation.getWorkManagerImpl();
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            EnqueueUtilsKt.checkContentUriTriggerWorkerLimits(workDatabase, workManagerImpl.getConfiguration(), workContinuation);
            boolean processContinuation = processContinuation(workContinuation);
            workDatabase.setTransactionSuccessful();
            return processContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public static void scheduleWorkInBackground(WorkContinuationImpl workContinuation) {
        WorkManagerImpl workManagerImpl = workContinuation.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static boolean processContinuation(WorkContinuationImpl workContinuation) {
        List<WorkContinuationImpl> parents = workContinuation.getParents();
        boolean z = false;
        if (parents != null) {
            for (WorkContinuationImpl workContinuationImpl : parents) {
                if (!workContinuationImpl.isEnqueued()) {
                    z |= processContinuation(workContinuationImpl);
                } else {
                    Logger.get().warning(TAG, "Already enqueued work ids (" + TextUtils.join(", ", workContinuationImpl.getIds()) + ")");
                }
            }
        }
        return enqueueContinuation(workContinuation) | z;
    }

    private static boolean enqueueContinuation(WorkContinuationImpl workContinuation) {
        boolean enqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuation.getWorkManagerImpl(), workContinuation.getWork(), (String[]) WorkContinuationImpl.prerequisitesFor(workContinuation).toArray(new String[0]), workContinuation.getName(), workContinuation.getExistingWorkPolicy());
        workContinuation.markEnqueued();
        return enqueueWorkWithPrerequisites;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean enqueueWorkWithPrerequisites(WorkManagerImpl workManagerImpl, List<? extends WorkRequest> workList, String[] prerequisiteIds, String name, ExistingWorkPolicy existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        WorkManagerImpl workManagerImpl2;
        WorkDatabase workDatabase;
        boolean z4;
        WorkDatabase workDatabase2;
        String[] strArr = prerequisiteIds;
        long currentTimeMillis = workManagerImpl.getConfiguration().getClock().currentTimeMillis();
        WorkDatabase workDatabase3 = workManagerImpl.getWorkDatabase();
        boolean z5 = strArr != null && strArr.length > 0;
        if (z5) {
            z = false;
            z2 = false;
            z3 = true;
            for (String str : strArr) {
                WorkSpec workSpec = workDatabase3.workSpecDao().getWorkSpec(str);
                if (workSpec == null) {
                    Logger.get().error(TAG, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    return false;
                }
                WorkInfo.State state = workSpec.state;
                z3 &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z2 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z = true;
                }
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(name);
        if (!isEmpty && !z5) {
            List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workDatabase3.workSpecDao().getWorkSpecIdAndStatesForName(name);
            if (!workSpecIdAndStatesForName.isEmpty()) {
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    workManagerImpl2 = workManagerImpl;
                    DependencyDao dependencyDao = workDatabase3.dependencyDao();
                    List arrayList = new ArrayList();
                    for (WorkSpec.IdAndState idAndState : workSpecIdAndStatesForName) {
                        if (dependencyDao.hasDependents(idAndState.id)) {
                            workDatabase2 = workDatabase3;
                        } else {
                            workDatabase2 = workDatabase3;
                            boolean z6 = (idAndState.state == WorkInfo.State.SUCCEEDED) & z3;
                            if (idAndState.state == WorkInfo.State.FAILED) {
                                z2 = true;
                            } else if (idAndState.state == WorkInfo.State.CANCELLED) {
                                z = true;
                            }
                            arrayList.add(idAndState.id);
                            z3 = z6;
                        }
                        workDatabase3 = workDatabase2;
                    }
                    workDatabase = workDatabase3;
                    if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z || z2)) {
                        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                        Iterator<WorkSpec.IdAndState> it = workSpecDao.getWorkSpecIdAndStatesForName(name).iterator();
                        while (it.hasNext()) {
                            workSpecDao.delete(it.next().id);
                        }
                        arrayList = Collections.emptyList();
                        z = false;
                        z2 = false;
                    }
                    strArr = (String[]) arrayList.toArray(strArr);
                    z5 = strArr.length > 0;
                    z4 = false;
                    for (WorkRequest workRequest : workList) {
                        WorkSpec workSpec2 = workRequest.getWorkSpec();
                        if (!z5 || z3) {
                            workSpec2.lastEnqueueTime = currentTimeMillis;
                        } else if (z2) {
                            workSpec2.state = WorkInfo.State.FAILED;
                        } else if (z) {
                            workSpec2.state = WorkInfo.State.CANCELLED;
                        } else {
                            workSpec2.state = WorkInfo.State.BLOCKED;
                        }
                        if (workSpec2.state == WorkInfo.State.ENQUEUED) {
                            z4 = true;
                        }
                        workDatabase.workSpecDao().insertWorkSpec(EnqueueUtilsKt.wrapWorkSpecIfNeeded(workManagerImpl2.getSchedulers(), workSpec2));
                        if (z5) {
                            int length = strArr.length;
                            int i = 0;
                            while (i < length) {
                                workDatabase.dependencyDao().insertDependency(new Dependency(workRequest.getStringId(), strArr[i]));
                                i++;
                                z4 = z4;
                                strArr = strArr;
                            }
                        }
                        String[] strArr2 = strArr;
                        boolean z7 = z4;
                        workDatabase.workTagDao().insertTags(workRequest.getStringId(), workRequest.getTags());
                        if (!isEmpty) {
                            workDatabase.workNameDao().insert(new WorkName(name, workRequest.getStringId()));
                        }
                        z4 = z7;
                        strArr = strArr2;
                    }
                    return z4;
                }
                if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                    for (WorkSpec.IdAndState idAndState2 : workSpecIdAndStatesForName) {
                        if (idAndState2.state == WorkInfo.State.ENQUEUED || idAndState2.state == WorkInfo.State.RUNNING) {
                            return false;
                        }
                    }
                }
                workManagerImpl2 = workManagerImpl;
                CancelWorkRunnable.forNameInline(name, workManagerImpl2);
                WorkSpecDao workSpecDao2 = workDatabase3.workSpecDao();
                Iterator<WorkSpec.IdAndState> it2 = workSpecIdAndStatesForName.iterator();
                while (it2.hasNext()) {
                    workSpecDao2.delete(it2.next().id);
                }
                workDatabase = workDatabase3;
                z4 = true;
                while (r5.hasNext()) {
                }
                return z4;
            }
        }
        workManagerImpl2 = workManagerImpl;
        workDatabase = workDatabase3;
        z4 = false;
        while (r5.hasNext()) {
        }
        return z4;
    }
}
