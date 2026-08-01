package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzcgz implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbyo zza;
    final /* synthetic */ zzchc zzb;

    zzcgz(zzchc zzchcVar, zzbyo zzbyoVar) {
        this.zzb = zzchcVar;
        this.zza = zzbyoVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzR(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
