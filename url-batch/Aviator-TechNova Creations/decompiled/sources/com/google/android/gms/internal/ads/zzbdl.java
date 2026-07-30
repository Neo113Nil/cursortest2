package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbdl implements zzbdr {
    final /* synthetic */ Activity zza;

    zzbdl(zzbds zzbdsVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbdsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdr
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.zza);
    }
}
