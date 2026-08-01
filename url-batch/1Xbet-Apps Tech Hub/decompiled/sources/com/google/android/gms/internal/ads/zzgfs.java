package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgfs extends zzgkd {
    final /* synthetic */ zzgft zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgfs(zzgft zzgftVar, Class cls) {
        super(cls);
        this.zza = zzgftVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* bridge */ /* synthetic */ zzgxw zza(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgqg zzc = zzgqh.zzc();
        byte[] zzb = zzglr.zzb(((zzgqk) zzgxwVar).zza());
        zzc.zza(zzgve.zzv(zzb, 0, zzb.length));
        zzc.zzb(0);
        return (zzgqh) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* synthetic */ zzgxw zzb(zzgve zzgveVar) throws zzgwy {
        return zzgqk.zzf(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* synthetic */ void zzc(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgui.zza(((zzgqk) zzgxwVar).zza());
    }
}
