package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzffd {
    public zzffd() {
        try {
            zzgdt.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgvb zzt = zzgve.zzt();
        try {
            zzgci.zzb(zzgcz.zzc(zzgcs.zza(zzgkq.zzb().zza("AES128_GCM"))), zzgch.zzb(zzt));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzA(), 11);
        zzt.zzc();
        return encodeToString;
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdtk zzdtkVar) {
        zzgcz zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzgcf) zzc.zze(zzgls.zza(), zzgcf.class)).zza(bArr, bArr2);
            zzdtkVar.zza().put("ds", "1");
            return new String(zza, Key.STRING_CHARSET_NAME);
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CryptoUtils.decrypt");
            zzdtkVar.zza().put("dsf", e.toString());
            return null;
        }
    }

    @Nullable
    private static final zzgcz zzc(String str) {
        try {
            return zzgci.zza(zzgcg.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
