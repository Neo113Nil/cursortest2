package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzavg implements zzavl {
    final /* synthetic */ Activity zza;

    zzavg(zzavm zzavmVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzavmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavl
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.zza);
    }
}
