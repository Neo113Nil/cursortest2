package s7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.x5;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y3 extends d4 {

    /* renamed from: r, reason: collision with root package name */
    public final AlarmManager f9132r;

    /* renamed from: s, reason: collision with root package name */
    public r3 f9133s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f9134t;

    public y3(j4 j4Var) {
        super(j4Var);
        this.f9132r = (AlarmManager) ((q1) this.f1478d).f8932d.getSystemService("alarm");
    }

    @Override // s7.d4
    public final void v() {
        AlarmManager alarmManager = this.f9132r;
        if (alarmManager != null) {
            Context context = ((q1) this.f1478d).f8932d;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), x5.f2971a));
        }
        y();
    }

    public final n w() {
        if (this.f9133s == null) {
            this.f9133s = new r3(this, this.f9150e.f8771z, 1);
        }
        return this.f9133s;
    }

    public final void x() {
        t();
        q1 q1Var = (q1) this.f1478d;
        v0 v0Var = q1Var.f8937t;
        q1.l(v0Var);
        v0Var.B.a("Unscheduling upload");
        AlarmManager alarmManager = this.f9132r;
        if (alarmManager != null) {
            Context context = q1Var.f8932d;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), x5.f2971a));
        }
        w().c();
        y();
    }

    public final void y() {
        JobScheduler jobScheduler = (JobScheduler) ((q1) this.f1478d).f8932d.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(z());
        }
    }

    public final int z() {
        if (this.f9134t == null) {
            this.f9134t = Integer.valueOf("measurement".concat(String.valueOf(((q1) this.f1478d).f8932d.getPackageName())).hashCode());
        }
        return this.f9134t.intValue();
    }
}
