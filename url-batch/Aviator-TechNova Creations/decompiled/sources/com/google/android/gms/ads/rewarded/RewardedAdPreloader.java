package com.google.android.gms.ads.rewarded;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
public final class RewardedAdPreloader {
    private RewardedAdPreloader() {
    }

    public static boolean destroy(String str) {
        zzfb zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzf(str);
    }

    public static void destroyAll() {
        zzfb zza = zza();
        if (zza != null) {
            zza.zzg();
        }
    }

    @Deprecated
    public static PreloadConfiguration getConfiguration(String str) {
        zzfb zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zzi(str);
    }

    @Deprecated
    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzfb zza = zza();
        return zza == null ? new HashMap() : zza.zzh();
    }

    public static int getNumAdsAvailable(String str) {
        zzfb zza = zza();
        if (zza == null) {
            return 0;
        }
        return zza.zze(str);
    }

    public static boolean isAdAvailable(String str) {
        zzfb zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzd(str);
    }

    public static RewardedAd pollAd(String str) {
        zzfb zza = zza();
        if (zza == null) {
            return null;
        }
        return zza.zza(str);
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration) {
        zzfb zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzc(str, preloadConfiguration);
    }

    private static zzfb zza() {
        zzfb zzfbVar = (zzfb) zzex.zzb().zza(AdFormat.REWARDED);
        if (zzfbVar == null) {
            zzo.zzl("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.", null);
        }
        return zzfbVar;
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        zzfb zza = zza();
        if (zza == null) {
            return false;
        }
        return zza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
