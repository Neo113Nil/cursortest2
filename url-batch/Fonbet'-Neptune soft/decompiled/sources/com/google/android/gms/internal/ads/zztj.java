package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.google.firebase.Timestamp$$ExternalSyntheticApiModelOutline0;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
final class zztj {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints;
        Boolean bool;
        Boolean bool2;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int zzc = zzc(supportedPerformancePoints, Timestamp$$ExternalSyntheticApiModelOutline0.m(i, i2, (int) d));
        boolean z = true;
        if (zzc == 1) {
            bool = zztk.zza;
            if (bool == null) {
                if (Build.VERSION.SDK_INT < 35) {
                    int zzb = zzb(false);
                    int zzb2 = zzb(true);
                    if (zzb != 0) {
                        if (zzb2 == 0) {
                        }
                    }
                    zztk.zza = Boolean.valueOf(z);
                    bool2 = zztk.zza;
                    if (!bool2.booleanValue()) {
                        return 0;
                    }
                }
                z = false;
                zztk.zza = Boolean.valueOf(z);
                bool2 = zztk.zza;
                if (!bool2.booleanValue()) {
                }
            }
        }
        return zzc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r2 = r2.getSupportedPerformancePoints();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzb(boolean z) {
        List supportedPerformancePoints;
        try {
            zzx zzxVar = new zzx();
            zzxVar.zzah("video/avc");
            zzz zzan = zzxVar.zzan();
            if (zzan.zzo != null) {
                List zze = zzuc.zze(zztr.zza, zzan, z, false);
                for (int i = 0; i < zze.size(); i++) {
                    if (((zzti) zze.get(i)).zzd != null && (r2 = ((zzti) zze.get(i)).zzd.getVideoCapabilities()) != null && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                        Timestamp$$ExternalSyntheticApiModelOutline0.m$1();
                        return zzc(supportedPerformancePoints, Timestamp$$ExternalSyntheticApiModelOutline0.m(1280, 720, 60));
                    }
                }
            }
        } catch (zztw unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i = 0; i < list.size(); i++) {
            covers = Timestamp$$ExternalSyntheticApiModelOutline0.m437m(list.get(i)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
