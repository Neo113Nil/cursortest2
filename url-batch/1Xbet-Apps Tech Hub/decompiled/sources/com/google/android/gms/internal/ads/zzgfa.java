package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgfa extends zzgkd {
    final /* synthetic */ zzgfb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgfa(zzgfb zzgfbVar, Class cls) {
        super(cls);
        this.zza = zzgfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* bridge */ /* synthetic */ zzgxw zza(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgqb zzgqbVar = (zzgqb) zzgxwVar;
        zzgpx zzc = zzgpy.zzc();
        byte[] zzb = zzglr.zzb(zzgqbVar.zza());
        zzc.zza(zzgve.zzv(zzb, 0, zzb.length));
        zzc.zzb(zzgqbVar.zzf());
        zzc.zzc(0);
        return (zzgpy) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* synthetic */ zzgxw zzb(zzgve zzgveVar) throws zzgwy {
        return zzgqb.zze(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* bridge */ /* synthetic */ void zzc(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgqb zzgqbVar = (zzgqb) zzgxwVar;
        zzgui.zza(zzgqbVar.zza());
        if (zzgqbVar.zzf().zza() != 12 && zzgqbVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
