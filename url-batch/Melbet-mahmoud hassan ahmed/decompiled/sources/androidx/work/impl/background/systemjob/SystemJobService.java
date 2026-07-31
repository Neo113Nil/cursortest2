package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import d0.j;
import e0.b;
import e0.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: h, reason: collision with root package name */
    private static final String f1516h = j.f("SystemJobService");

    /* renamed from: f, reason: collision with root package name */
    private i f1517f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, JobParameters> f1518g = new HashMap();

    private static String b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // e0.b
    public void a(String str, boolean z6) {
        JobParameters remove;
        j.c().a(f1516h, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f1518g) {
            remove = this.f1518g.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z6);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            i k7 = i.k(getApplicationContext());
            this.f1517f = k7;
            k7.m().d(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            j.c().h(f1516h, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        i iVar = this.f1517f;
        if (iVar != null) {
            iVar.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f1517f == null) {
            j.c().a(f1516h, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String b7 = b(jobParameters);
        if (TextUtils.isEmpty(b7)) {
            j.c().b(f1516h, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f1518g) {
            if (this.f1518g.containsKey(b7)) {
                j.c().a(f1516h, String.format("Job is already being executed by SystemJobService: %s", b7), new Throwable[0]);
                return false;
            }
            j.c().a(f1516h, String.format("onStartJob for %s", b7), new Throwable[0]);
            this.f1518g.put(b7, jobParameters);
            WorkerParameters.a aVar = null;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f1417b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.f1416a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i7 >= 28) {
                    aVar.f1418c = jobParameters.getNetwork();
                }
            }
            this.f1517f.v(b7, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f1517f == null) {
            j.c().a(f1516h, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String b7 = b(jobParameters);
        if (TextUtils.isEmpty(b7)) {
            j.c().b(f1516h, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        j.c().a(f1516h, String.format("onStopJob for %s", b7), new Throwable[0]);
        synchronized (this.f1518g) {
            this.f1518g.remove(b7);
        }
        this.f1517f.x(b7);
        return !this.f1517f.m().f(b7);
    }
}
