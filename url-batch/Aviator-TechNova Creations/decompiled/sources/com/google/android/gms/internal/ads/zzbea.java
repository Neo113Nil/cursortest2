package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzbea implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbee zzb;

    zzbea(zzbee zzbeeVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbeeVar);
        this.zzb = zzbeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
