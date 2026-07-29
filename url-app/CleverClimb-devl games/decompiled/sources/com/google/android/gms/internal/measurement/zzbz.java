package com.google.android.gms.internal.measurement;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.v4.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zzbz extends zzar {
    private boolean zzyb;
    private boolean zzyc;
    private final AlarmManager zzyd;
    private Integer zzye;

    protected zzbz(zzat zzatVar) {
        super(zzatVar);
        this.zzyd = (AlarmManager) getContext().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private final int getJobId() {
        if (this.zzye == null) {
            String valueOf = String.valueOf(getContext().getPackageName());
            this.zzye = Integer.valueOf((valueOf.length() != 0 ? "analytics".concat(valueOf) : new String("analytics")).hashCode());
        }
        return this.zzye.intValue();
    }

    private final PendingIntent zzek() {
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsReceiver"));
        return PendingIntent.getBroadcast(getContext(), 0, intent, 0);
    }

    public final void cancel() {
        this.zzyc = false;
        this.zzyd.cancel(zzek());
        if (Build.VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler = (JobScheduler) getContext().getSystemService("jobscheduler");
            zza("Cancelling job. JobID", Integer.valueOf(getJobId()));
            jobScheduler.cancel(getJobId());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        ActivityInfo receiverInfo;
        try {
            cancel();
            if (zzbu.zzdw() <= 0 || (receiverInfo = getContext().getPackageManager().getReceiverInfo(new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsReceiver"), 2)) == null || !receiverInfo.enabled) {
                return;
            }
            zzq("Receiver registered for local dispatch.");
            this.zzyb = true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean zzef() {
        return this.zzyc;
    }

    public final boolean zzei() {
        return this.zzyb;
    }

    public final void zzej() {
        zzch();
        Preconditions.checkState(this.zzyb, "Receiver not registered");
        long zzdw = zzbu.zzdw();
        if (zzdw > 0) {
            cancel();
            long elapsedRealtime = zzbt().elapsedRealtime() + zzdw;
            this.zzyc = true;
            if (Build.VERSION.SDK_INT < 24) {
                zzq("Scheduling upload with AlarmManager");
                this.zzyd.setInexactRepeating(2, elapsedRealtime, zzdw, zzek());
                return;
            }
            zzq("Scheduling upload with JobScheduler");
            ComponentName componentName = new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsJobService");
            JobScheduler jobScheduler = (JobScheduler) getContext().getSystemService("jobscheduler");
            JobInfo.Builder builder = new JobInfo.Builder(getJobId(), componentName);
            builder.setMinimumLatency(zzdw);
            builder.setOverrideDeadline(zzdw << 1);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            builder.setExtras(persistableBundle);
            JobInfo build = builder.build();
            zza("Scheduling job. JobID", Integer.valueOf(getJobId()));
            jobScheduler.schedule(build);
        }
    }
}
