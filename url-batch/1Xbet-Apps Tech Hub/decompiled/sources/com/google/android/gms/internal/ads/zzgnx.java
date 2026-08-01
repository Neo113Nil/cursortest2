package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgnx implements zzgdl {
    private static final zzgnx zza = new zzgnx();
    private static final zzglg zzb = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzgnu
        @Override // com.google.android.gms.internal.ads.zzgle
        public final Object zza(zzgcp zzgcpVar) {
            return zzgom.zzb((zzgkg) zzgcpVar);
        }
    }, zzgkg.class, zzgdc.class);

    zzgnx() {
    }

    public static void zzd() throws GeneralSecurityException {
        zzgdo.zzf(zza);
        zzgkr.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final Class zza() {
        return zzgdc.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final Class zzb() {
        return zzgdc.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final /* bridge */ /* synthetic */ Object zzc(zzgdk zzgdkVar) throws GeneralSecurityException {
        Iterator it = zzgdkVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzgdg zzgdgVar : (List) it.next()) {
                if (zzgdgVar.zzb() instanceof zzgns) {
                    zzgns zzgnsVar = (zzgns) zzgdgVar.zzb();
                    zzguk zzb2 = zzguk.zzb(zzgdgVar.zzg());
                    if (!zzb2.equals(zzgnsVar.zzc())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(zzgnsVar.zzb()) + " has wrong output prefix (" + zzgnsVar.zzc().toString() + ") instead of (" + zzb2.toString() + ")");
                    }
                }
            }
        }
        return new zzgnw(zzgdkVar, null);
    }
}
