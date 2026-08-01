package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzggl extends zzgke {
    private static final zzgkl zza = new zzgkl() { // from class: com.google.android.gms.internal.ads.zzggi
    };

    zzggl() {
        super(zzgqn.class, new zzggj(zzgcf.class));
    }

    public static void zze(boolean z) throws GeneralSecurityException {
        if (zzh()) {
            zzgdo.zze(new zzggl(), true);
            int i = zzggv.zza;
            zzggv.zzc(zzgku.zzc());
            zzgkq zzb = zzgkq.zzb();
            HashMap hashMap = new HashMap();
            zzggn zzggnVar = new zzggn(null);
            zzggnVar.zza(16);
            zzggnVar.zzb(zzggo.zza);
            hashMap.put("AES128_GCM_SIV", zzggnVar.zzc());
            zzggn zzggnVar2 = new zzggn(null);
            zzggnVar2.zza(16);
            zzggnVar2.zzb(zzggo.zzc);
            hashMap.put("AES128_GCM_SIV_RAW", zzggnVar2.zzc());
            zzggn zzggnVar3 = new zzggn(null);
            zzggnVar3.zza(32);
            zzggnVar3.zzb(zzggo.zza);
            hashMap.put("AES256_GCM_SIV", zzggnVar3.zzc());
            zzggn zzggnVar4 = new zzggn(null);
            zzggnVar4.zza(32);
            zzggnVar4.zzb(zzggo.zzc);
            hashMap.put("AES256_GCM_SIV_RAW", zzggnVar4.zzc());
            zzb.zzd(Collections.unmodifiableMap(hashMap));
            zzgkm.zza().zzb(zza, zzggq.class);
        }
    }

    private static boolean zzh() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgkd zza() {
        return new zzggk(this, zzgqq.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgrl zzb() {
        return zzgrl.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* synthetic */ zzgxw zzc(zzgve zzgveVar) throws zzgwy {
        return zzgqn.zze(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* bridge */ /* synthetic */ void zzf(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgqn zzgqnVar = (zzgqn) zzgxwVar;
        zzgui.zzb(zzgqnVar.zza(), 0);
        zzgui.zza(zzgqnVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final int zzg() {
        return 1;
    }
}
