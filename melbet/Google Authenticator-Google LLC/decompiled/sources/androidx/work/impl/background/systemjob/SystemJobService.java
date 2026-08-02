package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.a;
import defpackage.asq;
import defpackage.atm;
import defpackage.atx;
import defpackage.auc;
import defpackage.auy;
import defpackage.axl;
import defpackage.brn;
import defpackage.brr;
import defpackage.zx;
import defpackage.zy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SystemJobService extends JobService implements atm {
    private static final String a = asq.b("SystemJobService");
    private auy b;
    private final Map c = new HashMap();
    private final auc d = zy.h(false);
    private brr e;

    private static axl b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new axl(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static void c(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a.Z(str, "Cannot invoke ", " on a background thread"));
        }
    }

    @Override // defpackage.atm
    public final void a(axl axlVar, boolean z) {
        c("onExecuted");
        JobParameters jobParameters = (JobParameters) this.c.remove(axlVar);
        this.d.c(axlVar);
        if (jobParameters != null) {
            asq.a();
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            auy i = auy.i(getApplicationContext());
            this.b = i;
            atx atxVar = i.f;
            this.e = new brr(atxVar, i.k);
            atxVar.c(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            asq.a().e(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        auy auyVar = this.b;
        if (auyVar != null) {
            auyVar.f.d(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Uri[] triggeredContentUris;
        String[] triggeredContentAuthorities;
        String[] triggeredContentAuthorities2;
        Uri[] triggeredContentUris2;
        c("onStartJob");
        if (this.b == null) {
            asq.a();
            jobFinished(jobParameters, true);
            return false;
        }
        axl b = b(jobParameters);
        if (b == null) {
            asq.a().c(a, "WorkSpec id not found!");
            return false;
        }
        Map map = this.c;
        if (map.containsKey(b)) {
            asq.a();
            Objects.toString(b);
            b.toString();
            return false;
        }
        asq.a();
        Objects.toString(b);
        b.toString();
        map.put(b, jobParameters);
        zx zxVar = new zx();
        triggeredContentUris = jobParameters.getTriggeredContentUris();
        if (triggeredContentUris != null) {
            triggeredContentUris2 = jobParameters.getTriggeredContentUris();
            Arrays.asList(triggeredContentUris2);
        }
        triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
        if (triggeredContentAuthorities != null) {
            triggeredContentAuthorities2 = jobParameters.getTriggeredContentAuthorities();
            Arrays.asList(triggeredContentAuthorities2);
        }
        jobParameters.getNetwork();
        this.e.H(this.d.d(b), zxVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int stopReason;
        c("onStopJob");
        if (this.b == null) {
            asq.a();
            return true;
        }
        axl b = b(jobParameters);
        if (b == null) {
            asq.a().c(a, "WorkSpec id not found!");
            return false;
        }
        asq.a();
        Objects.toString(b);
        b.toString();
        this.c.remove(b);
        brn c = this.d.c(b);
        if (c != null) {
            int i = -512;
            if (Build.VERSION.SDK_INT >= 31) {
                stopReason = jobParameters.getStopReason();
                switch (stopReason) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    case 15:
                        i = stopReason;
                        break;
                }
            }
            this.e.G(c, i);
        }
        atx atxVar = this.b.f;
        String str = b.a;
        synchronized (atxVar.k) {
            contains = atxVar.i.contains(str);
        }
        return !contains;
    }
}
