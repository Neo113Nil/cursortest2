package x5;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import c6.h;
import c6.i;
import c6.j;
import c6.p;
import c6.q;
import d6.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import k5.k;
import n0.l;
import t5.o;
import u5.g;
import u5.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: s, reason: collision with root package name */
    public static final String f10510s = o.f("SystemJobScheduler");

    /* renamed from: d, reason: collision with root package name */
    public final Context f10511d;

    /* renamed from: e, reason: collision with root package name */
    public final JobScheduler f10512e;

    /* renamed from: i, reason: collision with root package name */
    public final m f10513i;

    /* renamed from: r, reason: collision with root package name */
    public final a f10514r;

    public b(Context context, m mVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f10511d = context;
        this.f10513i = mVar;
        this.f10512e = jobScheduler;
        this.f10514r = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i3) {
        try {
            jobScheduler.cancel(i3);
        } catch (Throwable th) {
            o.d().c(f10510s, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i3)), th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o.d().c(f10510s, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // u5.g
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.f10511d;
        JobScheduler jobScheduler = this.f10512e;
        ArrayList c10 = c(context, jobScheduler);
        int i3 = 0;
        if (c10 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = c10.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = c10.get(i10);
                i10++;
                JobInfo jobInfo = (JobInfo) obj;
                j f3 = f(jobInfo);
                if (f3 != null && str.equals(f3.f1824a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            b(jobScheduler, ((Integer) obj2).intValue());
        }
        i y3 = this.f10513i.f9651c.y();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) y3.f1820a;
        workDatabase_Impl.b();
        h hVar = (h) y3.f1823d;
        k a9 = hVar.a();
        if (str == null) {
            a9.r(1);
        } else {
            a9.l(1, str);
        }
        workDatabase_Impl.c();
        try {
            a9.a();
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.h();
            hVar.c(a9);
        }
    }

    @Override // u5.g
    public final void d(p... pVarArr) {
        int intValue;
        m mVar = this.f10513i;
        WorkDatabase workDatabase = mVar.f9651c;
        final f fVar = new f(workDatabase, 0);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                q B = workDatabase.B();
                String str = pVar.f1839a;
                p k10 = B.k(str);
                String str2 = f10510s;
                if (k10 == null) {
                    o.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.u();
                } else if (k10.f1840b != 1) {
                    o.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.u();
                } else {
                    j A = g8.b.A(pVar);
                    c6.g f3 = workDatabase.y().f(A);
                    if (f3 != null) {
                        intValue = f3.f1818c;
                    } else {
                        mVar.f9650b.getClass();
                        final int i3 = mVar.f9650b.g;
                        Object t6 = fVar.f3635a.t(new Callable() { // from class: d6.e
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = f.this.f3635a;
                                Long j = workDatabase2.x().j("next_job_scheduler_id");
                                int i10 = 0;
                                int longValue = j != null ? (int) j.longValue() : 0;
                                workDatabase2.x().l(new c6.d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                                if (longValue < 0 || longValue > i3) {
                                    workDatabase2.x().l(new c6.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i10 = longValue;
                                }
                                return Integer.valueOf(i10);
                            }
                        });
                        t6.getClass();
                        intValue = ((Number) t6).intValue();
                    }
                    if (f3 == null) {
                        mVar.f9651c.y().g(new c6.g(A.f1824a, A.f1825b, intValue));
                    }
                    g(pVar, intValue);
                    workDatabase.u();
                }
            } finally {
                workDatabase.h();
            }
        }
    }

    @Override // u5.g
    public final boolean e() {
        return true;
    }

    public final void g(p pVar, int i3) {
        int i10;
        int i11;
        JobScheduler jobScheduler = this.f10512e;
        a aVar = this.f10514r;
        aVar.getClass();
        t5.d dVar = pVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = pVar.f1839a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f1856t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i3, aVar.f10509a);
        boolean z10 = dVar.f9294b;
        Set<t5.c> set = dVar.f9299h;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z10);
        boolean z11 = dVar.f9295c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z11).setExtras(persistableBundle);
        int i12 = dVar.f9293a;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 || i12 != 6) {
            int b10 = a4.i.b(i12);
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 2) {
                        i10 = 3;
                        if (b10 != 3) {
                            i10 = 4;
                            if (b10 != 4 || i13 < 26) {
                                o.d().a(a.f10508b, "API version too low. Cannot convert network type value ".concat(l.m(i12)));
                            }
                        }
                    } else {
                        i10 = 2;
                    }
                }
                i10 = 1;
            } else {
                i10 = 0;
            }
            extras.setRequiredNetworkType(i10);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z11) {
            extras.setBackoffCriteria(pVar.f1849m, pVar.f1848l == 2 ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i13 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f1853q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (t5.c cVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f9290a, cVar.f9291b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.f9298f);
            extras.setTriggerContentMaxDelay(dVar.g);
        }
        extras.setPersisted(false);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26) {
            extras.setRequiresBatteryNotLow(dVar.f9296d);
            extras.setRequiresStorageNotLow(dVar.f9297e);
        }
        boolean z12 = pVar.f1847k > 0;
        boolean z13 = max > 0;
        if (i14 >= 31 && pVar.f1853q && !z12 && !z13) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f10510s;
        o.d().a(str2, "Scheduling work ID " + str + "Job ID " + i3);
        try {
            try {
                if (jobScheduler.schedule(build) == 0) {
                    o.d().g(str2, "Unable to schedule work ID " + str);
                    if (pVar.f1853q) {
                        if (pVar.f1854r == 1) {
                            i11 = 0;
                            try {
                                pVar.f1853q = false;
                                o.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                                g(pVar, i3);
                            } catch (IllegalStateException e2) {
                                e = e2;
                                ArrayList c10 = c(this.f10511d, jobScheduler);
                                int size = c10 != null ? c10.size() : i11;
                                Locale locale = Locale.getDefault();
                                Integer valueOf = Integer.valueOf(size);
                                m mVar = this.f10513i;
                                String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(mVar.f9651c.B().h().size()), Integer.valueOf(mVar.f9650b.f9289h));
                                o.d().b(str2, format);
                                IllegalStateException illegalStateException = new IllegalStateException(format, e);
                                mVar.f9650b.getClass();
                                throw illegalStateException;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                o.d().c(str2, "Unable to schedule " + pVar, th);
            }
        } catch (IllegalStateException e9) {
            e = e9;
            i11 = 0;
        }
    }
}
