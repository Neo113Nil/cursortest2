package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzow {
    private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int zza(int i, int i2) {
        for (int i3 = 10; i3 > 0; i3--) {
            int zzg = zzfs.zzg(i3);
            if (zzg != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(zzg).build(), zza)) {
                return i3;
            }
        }
        return 0;
    }

    public static zzfwu<Integer> zzb() {
        zzfwx zzfwxVar;
        zzfwr zzfwrVar = new zzfwr();
        zzfwxVar = zzox.zzc;
        zzfyu it = zzfwxVar.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (zzfs.zza >= zzfs.zzf(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zza)) {
                zzfwrVar.zzf(Integer.valueOf(intValue));
            }
        }
        zzfwrVar.zzf((Object) 2);
        return zzfwrVar.zzi();
    }
}
