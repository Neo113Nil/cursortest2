package androidx.work.impl.background.systemjob;

import G0.s;
import H0.c;
import H0.f;
import H0.p;
import K0.d;
import P0.e;
import P0.j;
import Q0.n;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: l, reason: collision with root package name */
    public static final String f4112l = s.f("SystemJobService");

    /* renamed from: d, reason: collision with root package name */
    public p f4113d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f4114e = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final e f4115i = new e(1);

    public static j a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // H0.c
    public final void c(j jVar, boolean z7) {
        JobParameters jobParameters;
        s.d().a(f4112l, jVar.f2204a + " executed on JobScheduler");
        synchronized (this.f4114e) {
            jobParameters = (JobParameters) this.f4114e.remove(jVar);
        }
        this.f4115i.v(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z7);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            p a7 = p.a(getApplicationContext());
            this.f4113d = a7;
            a7.f923f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            s.d().g(f4112l, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        p pVar = this.f4113d;
        if (pVar != null) {
            pVar.f923f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f4113d == null) {
            s.d().a(f4112l, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j a7 = a(jobParameters);
        if (a7 == null) {
            s.d().b(f4112l, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f4114e) {
            try {
                if (this.f4114e.containsKey(a7)) {
                    s.d().a(f4112l, "Job is already being executed by SystemJobService: " + a7);
                    return false;
                }
                s.d().a(f4112l, "onStartJob for " + a7);
                this.f4114e.put(a7, jobParameters);
                int i2 = Build.VERSION.SDK_INT;
                D0.j jVar = new D0.j(2);
                if (K0.c.b(jobParameters) != null) {
                    jVar.f331i = Arrays.asList(K0.c.b(jobParameters));
                }
                if (K0.c.a(jobParameters) != null) {
                    jVar.f330e = Arrays.asList(K0.c.a(jobParameters));
                }
                if (i2 >= 28) {
                    jVar.f332l = d.a(jobParameters);
                }
                this.f4113d.e(this.f4115i.x(a7), jVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f4113d == null) {
            s.d().a(f4112l, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j a7 = a(jobParameters);
        if (a7 == null) {
            s.d().b(f4112l, "WorkSpec id not found!");
            return false;
        }
        s.d().a(f4112l, "onStopJob for " + a7);
        synchronized (this.f4114e) {
            this.f4114e.remove(a7);
        }
        H0.j v7 = this.f4115i.v(a7);
        if (v7 != null) {
            p pVar = this.f4113d;
            pVar.f921d.r(new n(pVar, v7, false));
        }
        f fVar = this.f4113d.f923f;
        String str = a7.f2204a;
        synchronized (fVar.f898t) {
            contains = fVar.f896r.contains(str);
        }
        return !contains;
    }
}
