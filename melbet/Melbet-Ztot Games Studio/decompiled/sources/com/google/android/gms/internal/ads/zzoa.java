package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzoa {
    private static zzfxw<Integer> zzb() {
        zzfxv zzfxvVar = new zzfxv();
        zzfxvVar.zzg(8, 7);
        if (zzet.zza >= 31) {
            zzfxvVar.zzg(26, 27);
        }
        if (zzet.zza >= 33) {
            zzfxvVar.zzf((Object) 30);
        }
        return zzfxvVar.zzi();
    }

    public static boolean zza(AudioManager audioManager, zzon zzonVar) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        int type;
        if (zzonVar == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{zzonVar.zza};
        }
        zzfxw<Integer> zzb = zzb();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            type = audioDeviceInfo.getType();
            if (zzb.contains(Integer.valueOf(type))) {
                return true;
            }
        }
        return false;
    }
}
