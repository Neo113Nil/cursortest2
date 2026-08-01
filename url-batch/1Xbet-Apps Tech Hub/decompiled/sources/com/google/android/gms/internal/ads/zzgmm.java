package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgmm extends zzgke {
    private static final zzglg zza = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzgmi
        @Override // com.google.android.gms.internal.ads.zzgle
        public final Object zza(zzgcp zzgcpVar) {
            return new zzgof((zzgmh) zzgcpVar);
        }
    }, zzgmh.class, zzgmx.class);
    private static final zzglg zzb = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzgmj
        @Override // com.google.android.gms.internal.ads.zzgle
        public final Object zza(zzgcp zzgcpVar) {
            return zzgug.zzb((zzgmh) zzgcpVar);
        }
    }, zzgmh.class, zzgdc.class);

    zzgmm() {
        super(zzgpa.class, new zzgmk(zzgdc.class));
    }

    public static void zzm(boolean z) throws GeneralSecurityException {
        zzgdo.zze(new zzgmm(), true);
        int i = zzgmw.zza;
        zzgmw.zzc(zzgku.zzc());
        zzgkr.zza().zze(zza);
        zzgkr.zza().zze(zzb);
        zzgkq zzb2 = zzgkq.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("AES_CMAC", zzgod.zze);
        hashMap.put("AES256_CMAC", zzgod.zze);
        zzgmo zzgmoVar = new zzgmo(null);
        zzgmoVar.zza(32);
        zzgmoVar.zzb(16);
        zzgmoVar.zzc(zzgmp.zzd);
        hashMap.put("AES256_CMAC_RAW", zzgmoVar.zzd());
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzgpg zzgpgVar) throws GeneralSecurityException {
        if (zzgpgVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzgpgVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgkd zza() {
        return new zzgml(this, zzgpd.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgrl zzb() {
        return zzgrl.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* synthetic */ zzgxw zzc(zzgve zzgveVar) throws zzgwy {
        return zzgpa.zze(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* bridge */ /* synthetic */ void zzf(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgpa zzgpaVar = (zzgpa) zzgxwVar;
        zzgui.zzb(zzgpaVar.zza(), 0);
        zzo(zzgpaVar.zzg().zzd());
        zzn(zzgpaVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final int zzg() {
        return 1;
    }
}
