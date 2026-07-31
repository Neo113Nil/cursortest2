package p0;

import N.p;
import V.i;
import V5.g;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import l0.C0489c;
import l0.q;
import m0.h;
import m0.o;
import u0.C0674d;
import u0.C0677g;
import u0.C0678h;
import u0.C0679i;
import u0.C0680j;
import u0.C0686p;
import u0.C0687q;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: j, reason: collision with root package name */
    public static final String f5655j = q.f("SystemJobScheduler");

    /* renamed from: f, reason: collision with root package name */
    public final Context f5656f;

    /* renamed from: g, reason: collision with root package name */
    public final JobScheduler f5657g;

    /* renamed from: h, reason: collision with root package name */
    public final o f5658h;

    /* renamed from: i, reason: collision with root package name */
    public final C0575a f5659i;

    public b(Context context, o oVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C0575a c0575a = new C0575a(context);
        this.f5656f = context;
        this.f5658h = oVar;
        this.f5657g = jobScheduler;
        this.f5659i = c0575a;
    }

    public static void c(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th) {
            q.d().c(f5655j, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            q.d().c(f5655j, "getAllPendingJobs() is not reliable on this device.", th);
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

    public static C0680j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C0680j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // m0.h
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.f5656f;
        JobScheduler jobScheduler = this.f5657g;
        ArrayList d7 = d(context, jobScheduler);
        int i7 = 0;
        if (d7 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = d7.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = d7.get(i8);
                i8++;
                JobInfo jobInfo = (JobInfo) obj;
                C0680j f7 = f(jobInfo);
                if (f7 != null && str.equals(f7.f5985a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            c(jobScheduler, ((Integer) obj2).intValue());
        }
        C0679i p4 = this.f5658h.f5375c.p();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p4.f5981f;
        workDatabase_Impl.b();
        C0678h c0678h = (C0678h) p4.f5984i;
        i a7 = c0678h.a();
        if (str == null) {
            a7.o(1);
        } else {
            a7.B(str, 1);
        }
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            c0678h.n(a7);
        }
    }

    @Override // m0.h
    public final void b(C0686p... c0686pArr) {
        int intValue;
        o oVar = this.f5658h;
        WorkDatabase workDatabase = oVar.f5375c;
        final g gVar = new g(workDatabase);
        for (C0686p c0686p : c0686pArr) {
            workDatabase.c();
            try {
                C0687q t6 = workDatabase.t();
                String str = c0686p.f6000a;
                C0686p g7 = t6.g(str);
                String str2 = f5655j;
                if (g7 == null) {
                    q.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (g7.f6001b != 1) {
                    q.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    C0680j n7 = i6.g.n(c0686p);
                    C0677g b7 = workDatabase.p().b(n7);
                    if (b7 != null) {
                        intValue = b7.f5979c;
                    } else {
                        oVar.f5374b.getClass();
                        final int i7 = oVar.f5374b.f5250g;
                        Object n8 = ((WorkDatabase) gVar.f2734g).n(new Callable() { // from class: v0.e
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = (WorkDatabase) V5.g.this.f2734g;
                                Long e4 = workDatabase2.l().e("next_job_scheduler_id");
                                int i8 = 0;
                                int longValue = e4 != null ? (int) e4.longValue() : 0;
                                workDatabase2.l().f(new C0674d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                                if (longValue < 0 || longValue > i7) {
                                    workDatabase2.l().f(new C0674d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i8 = longValue;
                                }
                                return Integer.valueOf(i8);
                            }
                        });
                        kotlin.jvm.internal.i.d(n8, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) n8).intValue();
                    }
                    if (b7 == null) {
                        oVar.f5375c.p().d(new C0677g(n7.f5985a, n7.f5986b, intValue));
                    }
                    g(c0686p, intValue);
                    workDatabase.o();
                }
            } finally {
                workDatabase.k();
            }
        }
    }

    @Override // m0.h
    public final boolean e() {
        return true;
    }

    public final void g(C0686p c0686p, int i7) {
        int i8;
        int i9;
        JobScheduler jobScheduler = this.f5657g;
        C0575a c0575a = this.f5659i;
        c0575a.getClass();
        l0.d dVar = c0686p.f6009j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = c0686p.f6000a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c0686p.f6019t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c0686p.c());
        JobInfo.Builder builder = new JobInfo.Builder(i7, c0575a.f5654a);
        boolean z5 = dVar.f5256b;
        Set<C0489c> set = dVar.f5262h;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z5);
        boolean z6 = dVar.f5257c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z6).setExtras(persistableBundle);
        int i10 = dVar.f5255a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 || i10 != 6) {
            int c7 = p.c(i10);
            if (c7 != 0) {
                if (c7 != 1) {
                    if (c7 != 2) {
                        i8 = 3;
                        if (c7 != 3) {
                            i8 = 4;
                            if (c7 != 4 || i11 < 26) {
                                q.d().a(C0575a.f5653b, "API version too low. Cannot convert network type value ".concat(W4.o.g(i10)));
                            }
                        }
                    } else {
                        i8 = 2;
                    }
                }
                i8 = 1;
            } else {
                i8 = 0;
            }
            extras.setRequiredNetworkType(i8);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z6) {
            extras.setBackoffCriteria(c0686p.f6012m, c0686p.f6011l == 2 ? 0 : 1);
        }
        long max = Math.max(c0686p.a() - System.currentTimeMillis(), 0L);
        if (i11 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!c0686p.f6016q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (C0489c c0489c : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(c0489c.f5252a, c0489c.f5253b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.f5260f);
            extras.setTriggerContentMaxDelay(dVar.f5261g);
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            extras.setRequiresBatteryNotLow(dVar.f5258d);
            extras.setRequiresStorageNotLow(dVar.f5259e);
        }
        boolean z7 = c0686p.f6010k > 0;
        boolean z8 = max > 0;
        if (i12 >= 31 && c0686p.f6016q && !z7 && !z8) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f5655j;
        q.d().a(str2, "Scheduling work ID " + str + "Job ID " + i7);
        try {
            try {
                if (jobScheduler.schedule(build) == 0) {
                    q.d().g(str2, "Unable to schedule work ID " + str);
                    if (c0686p.f6016q) {
                        if (c0686p.f6017r == 1) {
                            i9 = 0;
                            try {
                                c0686p.f6016q = false;
                                q.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                                g(c0686p, i7);
                            } catch (IllegalStateException e4) {
                                e = e4;
                                ArrayList d7 = d(this.f5656f, jobScheduler);
                                int size = d7 != null ? d7.size() : i9;
                                Locale locale = Locale.getDefault();
                                Integer valueOf = Integer.valueOf(size);
                                o oVar = this.f5658h;
                                String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(oVar.f5375c.t().d().size()), Integer.valueOf(oVar.f5374b.f5251h));
                                q.d().b(str2, format);
                                IllegalStateException illegalStateException = new IllegalStateException(format, e);
                                oVar.f5374b.getClass();
                                throw illegalStateException;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                q.d().c(str2, "Unable to schedule " + c0686p, th);
            }
        } catch (IllegalStateException e7) {
            e = e7;
            i9 = 0;
        }
    }
}
