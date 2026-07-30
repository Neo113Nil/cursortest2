package K0;

import B.f;
import G0.A;
import G0.C0104d;
import G0.EnumC0101a;
import G0.e;
import G0.s;
import G0.t;
import G0.z;
import H0.h;
import H0.p;
import P0.g;
import P0.i;
import P0.j;
import P0.q;
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
import kotlin.jvm.internal.Intrinsics;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: m, reason: collision with root package name */
    public static final String f1422m = s.f("SystemJobScheduler");

    /* renamed from: d, reason: collision with root package name */
    public final Context f1423d;

    /* renamed from: e, reason: collision with root package name */
    public final JobScheduler f1424e;

    /* renamed from: i, reason: collision with root package name */
    public final p f1425i;

    /* renamed from: l, reason: collision with root package name */
    public final a f1426l;

    public b(Context context, p pVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f1423d = context;
        this.f1425i = pVar;
        this.f1424e = jobScheduler;
        this.f1426l = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            s.d().c(f1422m, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            s.d().c(f1422m, "getAllPendingJobs() is not reliable on this device.", th);
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

    public static j d(JobInfo jobInfo) {
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

    @Override // H0.h
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.f1423d;
        JobScheduler jobScheduler = this.f1424e;
        ArrayList c7 = c(context, jobScheduler);
        int i2 = 0;
        if (c7 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = c7.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = c7.get(i5);
                i5++;
                JobInfo jobInfo = (JobInfo) obj;
                j d7 = d(jobInfo);
                if (d7 != null && str.equals(d7.f2204a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            b(jobScheduler, ((Integer) obj2).intValue());
        }
        i p7 = this.f1425i.f920c.p();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p7.f2200a;
        workDatabase_Impl.b();
        P0.h hVar = (P0.h) p7.f2203d;
        m0.j a7 = hVar.a();
        if (str == null) {
            a7.l(1);
        } else {
            a7.f(1, str);
        }
        workDatabase_Impl.c();
        try {
            a7.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.d(a7);
        }
    }

    @Override // H0.h
    public final void e(P0.p... pVarArr) {
        int intValue;
        p pVar = this.f1425i;
        WorkDatabase workDatabase = pVar.f920c;
        final f fVar = new f(workDatabase);
        for (P0.p pVar2 : pVarArr) {
            workDatabase.c();
            try {
                q t6 = workDatabase.t();
                String str = pVar2.f2220a;
                P0.p g7 = t6.g(str);
                String str2 = f1422m;
                if (g7 == null) {
                    s.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (g7.f2221b != A.f770d) {
                    s.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    j generationalId = AbstractC1053a.x(pVar2);
                    g h7 = workDatabase.p().h(generationalId);
                    if (h7 != null) {
                        intValue = h7.f2198c;
                    } else {
                        pVar.f919b.getClass();
                        final int i2 = pVar.f919b.f789g;
                        Object n7 = ((WorkDatabase) fVar.f152e).n(new Callable() { // from class: Q0.g
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                B.f this$0 = B.f.this;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                WorkDatabase workDatabase2 = (WorkDatabase) this$0.f152e;
                                Long r7 = workDatabase2.l().r("next_job_scheduler_id");
                                int i5 = 0;
                                int longValue = r7 != null ? (int) r7.longValue() : 0;
                                workDatabase2.l().t(new P0.d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                                if (longValue < 0 || longValue > i2) {
                                    workDatabase2.l().t(new P0.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i5 = longValue;
                                }
                                return Integer.valueOf(i5);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(n7, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) n7).intValue();
                    }
                    if (h7 == null) {
                        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
                        pVar.f920c.p().i(new g(generationalId.f2204a, generationalId.f2205b, intValue));
                    }
                    g(pVar2, intValue);
                    workDatabase.o();
                }
            } finally {
                workDatabase.k();
            }
        }
    }

    @Override // H0.h
    public final boolean f() {
        return true;
    }

    public final void g(P0.p pVar, int i2) {
        int i5;
        JobScheduler jobScheduler = this.f1424e;
        a aVar = this.f1426l;
        aVar.getClass();
        e eVar = pVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = pVar.f2220a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f2238t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i2, aVar.f1421a);
        boolean z7 = eVar.f795b;
        Set<C0104d> set = eVar.f801h;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z7);
        boolean z8 = eVar.f796c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z8).setExtras(persistableBundle);
        t tVar = eVar.f794a;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || tVar != t.f830n) {
            int ordinal = tVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    i5 = 2;
                    if (ordinal != 2) {
                        i5 = 3;
                        if (ordinal != 3) {
                            i5 = 4;
                            if (ordinal != 4 || i7 < 26) {
                                s.d().a(a.f1420b, "API version too low. Cannot convert network type value " + tVar);
                            }
                        }
                    }
                }
                i5 = 1;
            } else {
                i5 = 0;
            }
            extras.setRequiredNetworkType(i5);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z8) {
            extras.setBackoffCriteria(pVar.f2231m, pVar.f2230l == EnumC0101a.f779e ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i7 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f2235q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (C0104d c0104d : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(c0104d.f791a, c0104d.f792b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(eVar.f799f);
            extras.setTriggerContentMaxDelay(eVar.f800g);
        }
        extras.setPersisted(false);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            extras.setRequiresBatteryNotLow(eVar.f797d);
            extras.setRequiresStorageNotLow(eVar.f798e);
        }
        boolean z9 = pVar.f2229k > 0;
        boolean z10 = max > 0;
        if (i8 >= 31 && pVar.f2235q && !z9 && !z10) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f1422m;
        s.d().a(str2, "Scheduling work ID " + str + "Job ID " + i2);
        try {
            if (jobScheduler.schedule(build) == 0) {
                s.d().g(str2, "Unable to schedule work ID " + str);
                if (pVar.f2235q && pVar.f2236r == z.f838d) {
                    pVar.f2235q = false;
                    s.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(pVar, i2);
                }
            }
        } catch (IllegalStateException e7) {
            ArrayList c7 = c(this.f1423d, jobScheduler);
            int size = c7 != null ? c7.size() : 0;
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(size);
            p pVar2 = this.f1425i;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(pVar2.f920c.t().d().size()), Integer.valueOf(pVar2.f919b.f790h));
            s.d().b(str2, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e7);
            pVar2.f919b.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            s.d().c(str2, "Unable to schedule " + pVar, th);
        }
    }
}
