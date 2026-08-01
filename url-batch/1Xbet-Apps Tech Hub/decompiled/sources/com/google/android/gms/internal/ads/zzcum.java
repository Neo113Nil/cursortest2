package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcum implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzczo zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcum(zzczo zzczoVar) {
        this.zza = zzczoVar;
    }

    private final void zzh() {
        if (this.zzc.get()) {
            return;
        }
        this.zzc.set(true);
        this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzh();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbw() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbz(int i) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
