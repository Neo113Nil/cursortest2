package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.gms.internal.ads.zzbyi;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzay {
    private final String zza;
    private final String zzb;
    private final zzbyi zzc;

    /* synthetic */ zzay(zzax zzaxVar, byte[] bArr) {
        this.zza = zzaxVar.zzd();
        this.zzb = zzaxVar.zze();
        this.zzc = zzaxVar.zzf();
    }

    public final Set zza() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }

    public final String zzb() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final zzbbn.zza.EnumC0009zza zzc() {
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return zzbbn.zza.EnumC0009zza.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    return zzbbn.zza.EnumC0009zza.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return zzbbn.zza.EnumC0009zza.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    return zzbbn.zza.EnumC0009zza.BANNER;
                }
                break;
        }
        return zzbbn.zza.EnumC0009zza.AD_INITIATER_UNSPECIFIED;
    }

    final String zzd() {
        return this.zzb;
    }

    final zzbyi zze() {
        return this.zzc;
    }
}
