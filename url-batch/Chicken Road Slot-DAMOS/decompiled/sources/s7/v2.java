package s7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v2 extends g0 {

    /* renamed from: i, reason: collision with root package name */
    public JobScheduler f9061i;

    @Override // s7.g0
    public final boolean v() {
        return true;
    }

    public final void w(long j) {
        q1 q1Var = (q1) this.f1478d;
        t();
        s();
        JobScheduler jobScheduler = this.f9061i;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(q1Var.f8932d.getPackageName())).hashCode()) != null) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.B.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int x10 = x();
        if (x10 != 2) {
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.B.b(v4.a.y(x10), "[sgtm] Not eligible for Scion upload");
            return;
        }
        v0 v0Var3 = q1Var.f8937t;
        q1.l(v0Var3);
        v0Var3.B.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(q1Var.f8932d.getPackageName())).hashCode(), new ComponentName(q1Var.f8932d, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f9061i;
        c7.c0.g(jobScheduler2);
        int schedule = jobScheduler2.schedule(build);
        v0 v0Var4 = q1Var.f8937t;
        q1.l(v0Var4);
        v0Var4.B.b(schedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int x() {
        q1 q1Var = (q1) this.f1478d;
        t();
        s();
        if (this.f9061i == null) {
            return 7;
        }
        Boolean F = q1Var.f8935r.F("google_analytics_sgtm_upload_enabled");
        if (!(F == null ? false : F.booleanValue())) {
            return 8;
        }
        if (q1Var.q().f8838x < 119000) {
            return 6;
        }
        if (p4.N(q1Var.f8932d)) {
            return !q1Var.o().z() ? 5 : 2;
        }
        return 3;
    }
}
