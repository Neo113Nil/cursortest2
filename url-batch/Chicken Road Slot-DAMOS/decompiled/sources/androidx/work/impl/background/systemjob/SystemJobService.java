package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import c6.e;
import c6.j;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.collections.i0;
import t5.o;
import u5.c;
import u5.i;
import u5.m;
import x5.d;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements c {

    /* renamed from: r, reason: collision with root package name */
    public static final String f778r = o.f("SystemJobService");

    /* renamed from: d, reason: collision with root package name */
    public m f779d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f780e = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final e f781i = new e(13);

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

    @Override // u5.c
    public final void f(j jVar, boolean z10) {
        JobParameters jobParameters;
        o.d().a(f778r, jVar.f1824a + " executed on JobScheduler");
        synchronized (this.f780e) {
            jobParameters = (JobParameters) this.f780e.remove(jVar);
        }
        this.f781i.p(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            m a9 = m.a(getApplicationContext());
            this.f779d = a9;
            a9.f9654f.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                o.d().g(f778r, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                i0.l("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        m mVar = this.f779d;
        if (mVar != null) {
            mVar.f9654f.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f779d == null) {
            o.d().a(f778r, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j a9 = a(jobParameters);
        if (a9 == null) {
            o.d().b(f778r, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f780e) {
            try {
                if (this.f780e.containsKey(a9)) {
                    o.d().a(f778r, "Job is already being executed by SystemJobService: " + a9);
                    return false;
                }
                o.d().a(f778r, "onStartJob for " + a9);
                this.f780e.put(a9, jobParameters);
                p.e eVar = new p.e(14);
                if (x5.c.b(jobParameters) != null) {
                    eVar.f7589i = Arrays.asList(x5.c.b(jobParameters));
                }
                if (x5.c.a(jobParameters) != null) {
                    eVar.f7588e = Arrays.asList(x5.c.a(jobParameters));
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    eVar.f7590r = d.a(jobParameters);
                }
                this.f779d.e(this.f781i.r(a9), eVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f779d == null) {
            o.d().a(f778r, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j a9 = a(jobParameters);
        if (a9 == null) {
            o.d().b(f778r, "WorkSpec id not found!");
            return false;
        }
        o.d().a(f778r, "onStopJob for " + a9);
        synchronized (this.f780e) {
            this.f780e.remove(a9);
        }
        i p4 = this.f781i.p(a9);
        if (p4 != null) {
            m mVar = this.f779d;
            mVar.f9652d.a(new d6.m(mVar, p4, false));
        }
        u5.e eVar = this.f779d.f9654f;
        String str = a9.f1824a;
        synchronized (eVar.f9632z) {
            contains = eVar.f9630x.contains(str);
        }
        return !contains;
    }
}
