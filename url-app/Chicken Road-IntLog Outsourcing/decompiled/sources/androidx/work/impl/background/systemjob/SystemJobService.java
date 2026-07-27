package androidx.work.impl.background.systemjob;

import B0.j;
import B4.i;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.HashMap;
import s0.s;
import t0.InterfaceC1425d;
import t0.f;
import t0.o;
import w0.AbstractC1507c;
import w0.AbstractC1508d;
import x1.e;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1425d {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4741d = s.f("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public o f4742a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4743b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final e f4744c = new e();

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

    @Override // t0.InterfaceC1425d
    public final void d(j jVar, boolean z) {
        JobParameters jobParameters;
        s.d().a(f4741d, jVar.f157a + " executed on JobScheduler");
        synchronized (this.f4743b) {
            jobParameters = (JobParameters) this.f4743b.remove(jVar);
        }
        this.f4744c.t(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            o a6 = o.a(getApplicationContext());
            this.f4742a = a6;
            a6.f11887f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            s.d().g(f4741d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o oVar = this.f4742a;
        if (oVar != null) {
            oVar.f11887f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f4742a == null) {
            s.d().a(f4741d, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j a6 = a(jobParameters);
        if (a6 == null) {
            s.d().b(f4741d, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f4743b) {
            try {
                if (this.f4743b.containsKey(a6)) {
                    s.d().a(f4741d, "Job is already being executed by SystemJobService: " + a6);
                    return false;
                }
                s.d().a(f4741d, "onStartJob for " + a6);
                this.f4743b.put(a6, jobParameters);
                int i2 = Build.VERSION.SDK_INT;
                i iVar = new i(27);
                if (AbstractC1507c.b(jobParameters) != null) {
                    iVar.f312c = Arrays.asList(AbstractC1507c.b(jobParameters));
                }
                if (AbstractC1507c.a(jobParameters) != null) {
                    iVar.f311b = Arrays.asList(AbstractC1507c.a(jobParameters));
                }
                if (i2 >= 28) {
                    iVar.f313d = AbstractC1508d.a(jobParameters);
                }
                this.f4742a.e(this.f4744c.u(a6), iVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f4742a == null) {
            s.d().a(f4741d, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j a6 = a(jobParameters);
        if (a6 == null) {
            s.d().b(f4741d, "WorkSpec id not found!");
            return false;
        }
        s.d().a(f4741d, "onStopJob for " + a6);
        synchronized (this.f4743b) {
            this.f4743b.remove(a6);
        }
        t0.j t5 = this.f4744c.t(a6);
        if (t5 != null) {
            o oVar = this.f4742a;
            oVar.f11885d.o(new C0.o(oVar, t5, false));
        }
        f fVar = this.f4742a.f11887f;
        String str = a6.f157a;
        synchronized (fVar.f11863l) {
            contains = fVar.f11861j.contains(str);
        }
        return !contains;
    }
}
