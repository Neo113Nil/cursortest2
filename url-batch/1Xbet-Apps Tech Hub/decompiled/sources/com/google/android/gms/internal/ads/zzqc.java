package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzqc {
    public static zzpa zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzpa.zza;
        }
        zzoy zzoyVar = new zzoy();
        boolean z2 = false;
        if (zzfs.zza > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        }
        zzoyVar.zza(true);
        zzoyVar.zzb(z2);
        zzoyVar.zzc(z);
        return zzoyVar.zzd();
    }
}
