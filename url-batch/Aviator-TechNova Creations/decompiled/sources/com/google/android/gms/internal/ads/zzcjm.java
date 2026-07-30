package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzcjm implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcce zza;
    final /* synthetic */ zzcjw zzb;

    zzcjm(zzcjw zzcjwVar, zzcce zzcceVar) {
        this.zza = zzcceVar;
        Objects.requireNonNull(zzcjwVar);
        this.zzb = zzcjwVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
