package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.PackageManagerHelper;
import java.util.Iterator;
import java.util.List;

@RestrictTo
/* loaded from: classes14.dex */
public class Schedulers {
    private static final String TAG = Logger.tagWithPrefix("Schedulers");

    public static void schedule(Configuration configuration, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            List eligibleWorkForScheduling = workSpecDao.getEligibleWorkForScheduling(configuration.getMaxSchedulerLimit());
            List allEligibleWorkSpecsForScheduling = workSpecDao.getAllEligibleWorkSpecsForScheduling(200);
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = eligibleWorkForScheduling.iterator();
                while (it.hasNext()) {
                    workSpecDao.markWorkSpecScheduled(((WorkSpec) it.next()).id, currentTimeMillis);
                }
            }
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (eligibleWorkForScheduling != null && eligibleWorkForScheduling.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) eligibleWorkForScheduling.toArray(new WorkSpec[eligibleWorkForScheduling.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Scheduler scheduler = (Scheduler) it2.next();
                    if (scheduler.hasLimitedSchedulingSlots()) {
                        scheduler.schedule(workSpecArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling == null || allEligibleWorkSpecsForScheduling.size() <= 0) {
                return;
            }
            WorkSpec[] workSpecArr2 = (WorkSpec[]) allEligibleWorkSpecsForScheduling.toArray(new WorkSpec[allEligibleWorkSpecsForScheduling.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Scheduler scheduler2 = (Scheduler) it3.next();
                if (!scheduler2.hasLimitedSchedulingSlots()) {
                    scheduler2.schedule(workSpecArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    static Scheduler createBestAvailableBackgroundScheduler(Context context, WorkManagerImpl workManagerImpl) {
        SystemJobScheduler systemJobScheduler = new SystemJobScheduler(context, workManagerImpl);
        PackageManagerHelper.setComponentEnabled(context, SystemJobService.class, true);
        Logger.get().debug(TAG, "Created SystemJobScheduler and enabled SystemJobService");
        return systemJobScheduler;
    }
}
