package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzqb {
    public static zzpa zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return zzpa.zza;
        }
        zzoy zzoyVar = new zzoy();
        zzoyVar.zza(true);
        zzoyVar.zzc(z);
        return zzoyVar.zzd();
    }
}
