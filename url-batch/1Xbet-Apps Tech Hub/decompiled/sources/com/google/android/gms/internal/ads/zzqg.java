package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzqg {
    public static void zza(AudioTrack audioTrack, zzqi zzqiVar) {
        audioTrack.setPreferredDevice(zzqiVar == null ? null : zzqiVar.zza);
    }
}
