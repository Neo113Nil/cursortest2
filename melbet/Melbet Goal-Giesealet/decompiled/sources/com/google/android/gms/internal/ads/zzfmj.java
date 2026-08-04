package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public class zzfmj implements Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private zzfmi zzc;

    private final boolean zza() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || zzb();
    }

    private final void zzh(boolean z) {
        if (this.zza != z) {
            this.zza = z;
            if (this.zzb) {
                zzc(z);
                zzfmi zzfmiVar = this.zzc;
                if (zzfmiVar != null) {
                    zzfmiVar.zzd(z);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzh(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzh(zza());
    }

    protected boolean zzb() {
        return false;
    }

    protected void zzc(boolean z) {
    }

    public final void zzd(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void zze() {
        this.zzb = true;
        boolean zza = zza();
        this.zza = zza;
        zzc(zza);
    }

    public final void zzf() {
        this.zzb = false;
        this.zzc = null;
    }

    public final void zzg(zzfmi zzfmiVar) {
        this.zzc = zzfmiVar;
    }
}
