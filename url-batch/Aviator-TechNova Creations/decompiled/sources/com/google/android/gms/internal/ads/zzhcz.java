package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzhcz implements zzhjb {
    static final /* synthetic */ zzhcz zza = new zzhcz();

    private /* synthetic */ zzhcz() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjb
    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) {
        zzhdd zzhddVar = (zzhdd) zzhbpVar;
        int i = zzhda.zza;
        if (zzhddVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhcw zzhcwVar = new zzhcw(null);
        zzhcwVar.zza(zzhddVar);
        zzhcwVar.zzc(num);
        zzhcwVar.zzb(zzhyg.zzb(zzhddVar.zzc()));
        return zzhcwVar.zzd();
    }
}
