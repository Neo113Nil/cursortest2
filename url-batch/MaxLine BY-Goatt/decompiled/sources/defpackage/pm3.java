package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pm3 extends xg3 {
    public JobScheduler o;

    public final void A(long j) {
        pj3 pj3Var = (pj3) this.m;
        x();
        v();
        JobScheduler jobScheduler = this.o;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(pj3Var.m.getPackageName())).hashCode()) != null) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.z.b("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int B = B();
        if (B != 2) {
            vh3 vh3Var2 = pj3Var.r;
            pj3.m(vh3Var2);
            vh3Var2.z.c(in1.q(B), "[sgtm] Not eligible for Scion upload");
            return;
        }
        vh3 vh3Var3 = pj3Var.r;
        pj3.m(vh3Var3);
        vh3Var3.z.c(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(pj3Var.m.getPackageName())).hashCode(), new ComponentName(pj3Var.m, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.o;
        ll3.v(jobScheduler2);
        int schedule = jobScheduler2.schedule(build);
        vh3 vh3Var4 = pj3Var.r;
        pj3.m(vh3Var4);
        vh3Var4.z.c(schedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int B() {
        pj3 pj3Var = (pj3) this.m;
        x();
        v();
        if (this.o == null) {
            return 7;
        }
        Boolean I = pj3Var.p.I("google_analytics_sgtm_upload_enabled");
        if (!(I == null ? false : I.booleanValue())) {
            return 8;
        }
        if (pj3Var.r().v < 119000) {
            return 6;
        }
        if (zq3.P(pj3Var.m)) {
            return !pj3Var.p().D() ? 5 : 2;
        }
        return 3;
    }

    @Override // defpackage.xg3
    public final boolean z() {
        return true;
    }
}
