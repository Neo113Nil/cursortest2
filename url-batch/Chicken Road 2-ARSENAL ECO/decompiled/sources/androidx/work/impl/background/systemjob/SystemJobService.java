package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import l0.q;
import m0.c;
import m0.f;
import m0.j;
import m0.o;
import p0.d;
import u0.C0673c;
import u0.C0680j;
import v0.l;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f3583i = q.f("SystemJobService");

    /* renamed from: f, reason: collision with root package name */
    public o f3584f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f3585g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final C0673c f3586h = new C0673c(12);

    public static C0680j a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C0680j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // m0.c
    public final void f(C0680j c0680j, boolean z5) {
        JobParameters jobParameters;
        q.d().a(f3583i, c0680j.f5985a + " executed on JobScheduler");
        synchronized (this.f3585g) {
            jobParameters = (JobParameters) this.f3585g.remove(c0680j);
        }
        this.f3586h.k(c0680j);
        if (jobParameters != null) {
            jobFinished(jobParameters, z5);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            o a7 = o.a(getApplicationContext());
            this.f3584f = a7;
            a7.f5378f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            q.d().g(f3583i, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o oVar = this.f3584f;
        if (oVar != null) {
            oVar.f5378f.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f3584f == null) {
            q.d().a(f3583i, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C0680j a7 = a(jobParameters);
        if (a7 == null) {
            q.d().b(f3583i, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f3585g) {
            try {
                if (this.f3585g.containsKey(a7)) {
                    q.d().a(f3583i, "Job is already being executed by SystemJobService: " + a7);
                    return false;
                }
                q.d().a(f3583i, "onStartJob for " + a7);
                this.f3585g.put(a7, jobParameters);
                int i7 = Build.VERSION.SDK_INT;
                B0.c cVar = new B0.c(21);
                if (p0.c.b(jobParameters) != null) {
                    cVar.f73i = Arrays.asList(p0.c.b(jobParameters));
                }
                if (p0.c.a(jobParameters) != null) {
                    cVar.f72h = Arrays.asList(p0.c.a(jobParameters));
                }
                if (i7 >= 28) {
                    cVar.f71g = d.a(jobParameters);
                }
                this.f3584f.e(this.f3586h.l(a7), cVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f3584f == null) {
            q.d().a(f3583i, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C0680j a7 = a(jobParameters);
        if (a7 == null) {
            q.d().b(f3583i, "WorkSpec id not found!");
            return false;
        }
        q.d().a(f3583i, "onStopJob for " + a7);
        synchronized (this.f3585g) {
            this.f3585g.remove(a7);
        }
        j k4 = this.f3586h.k(a7);
        if (k4 != null) {
            o oVar = this.f3584f;
            oVar.f5376d.a(new l(oVar, k4, false));
        }
        f fVar = this.f3584f.f5378f;
        String str = a7.f5985a;
        synchronized (fVar.f5354q) {
            contains = fVar.f5352o.contains(str);
        }
        return !contains;
    }
}
