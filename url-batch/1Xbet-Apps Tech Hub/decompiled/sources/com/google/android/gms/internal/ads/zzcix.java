package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcix implements zzhdp {
    private final zzcit zza;

    public zzcix(zzcit zzcitVar) {
        this.zza = zzcitVar;
    }

    public final WeakReference zza() {
        WeakReference zzf = this.zza.zzf();
        zzhdx.zzb(zzf);
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* synthetic */ Object zzb() {
        WeakReference zzf = this.zza.zzf();
        zzhdx.zzb(zzf);
        return zzf;
    }
}
