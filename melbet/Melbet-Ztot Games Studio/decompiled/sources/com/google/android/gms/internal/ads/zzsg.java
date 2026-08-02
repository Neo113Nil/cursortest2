package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;
import kotlin.io.path.DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzsg {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        r6 = ((com.google.android.gms.internal.ads.zzsf) r4.get(r5)).zzd.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        kotlin.io.path.DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m$2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (zzb(r6, kotlin.io.path.DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m(1280, 720, 60)) != 1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints;
        Boolean bool;
        List supportedPerformancePoints2;
        Boolean bool2;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int zzb = zzb(supportedPerformancePoints, DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m(i, i2, (int) d));
        boolean z = true;
        if (zzb == 1) {
            bool = zzsh.zza;
            if (bool == null) {
                if (zzet.zza < 35) {
                    try {
                        zzad zzadVar = new zzad();
                        zzadVar.zzX("video/avc");
                        zzaf zzad = zzadVar.zzad();
                        if (zzad.zzm != null) {
                            List zzf = zztc.zzf(zzsq.zza, zzad, false, false);
                            int i3 = 0;
                            while (true) {
                                if (i3 < zzf.size()) {
                                    if (((zzsf) zzf.get(i3)).zzd != null && ((zzsf) zzf.get(i3)).zzd.getVideoCapabilities() != null && supportedPerformancePoints2 != null && !supportedPerformancePoints2.isEmpty()) {
                                        break;
                                    }
                                    i3++;
                                } else {
                                    break;
                                }
                            }
                        }
                    } catch (zzsw unused) {
                    }
                    zzsh.zza = Boolean.valueOf(z);
                    bool2 = zzsh.zza;
                    if (!bool2.booleanValue()) {
                        return 0;
                    }
                }
                z = false;
                zzsh.zza = Boolean.valueOf(z);
                bool2 = zzsh.zza;
                if (!bool2.booleanValue()) {
                }
            }
        }
        return zzb;
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i = 0; i < list.size(); i++) {
            covers = DefaultCopyActionContext$$ExternalSyntheticApiModelOutline0.m1590m(list.get(i)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
