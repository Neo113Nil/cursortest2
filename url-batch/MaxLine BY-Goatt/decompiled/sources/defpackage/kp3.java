package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kp3 extends vp3 {
    public final AlarmManager p;
    public zo3 q;
    public Integer r;

    public kp3(oq3 oq3Var) {
        super(oq3Var);
        this.p = (AlarmManager) ((pj3) this.m).m.getSystemService("alarm");
    }

    public final void A() {
        x();
        pj3 pj3Var = (pj3) this.m;
        vh3 vh3Var = pj3Var.r;
        pj3.m(vh3Var);
        vh3Var.z.b("Unscheduling upload");
        AlarmManager alarmManager = this.p;
        if (alarmManager != null) {
            Context context = pj3Var.m;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), ce3.a));
        }
        B().c();
        C();
    }

    public final uc3 B() {
        if (this.q == null) {
            this.q = new zo3(this, this.n.x, 1);
        }
        return this.q;
    }

    public final void C() {
        JobScheduler jobScheduler = (JobScheduler) ((pj3) this.m).m.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(D());
        }
    }

    public final int D() {
        if (this.r == null) {
            this.r = Integer.valueOf("measurement".concat(String.valueOf(((pj3) this.m).m.getPackageName())).hashCode());
        }
        return this.r.intValue();
    }

    @Override // defpackage.vp3
    public final void z() {
        AlarmManager alarmManager = this.p;
        if (alarmManager != null) {
            Context context = ((pj3) this.m).m;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), ce3.a));
        }
        C();
    }
}
