package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzsi {
    public final zzsn zza;
    public final MediaFormat zzb;
    public final zzam zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzsi(zzsn zzsnVar, MediaFormat mediaFormat, zzam zzamVar, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.zza = zzsnVar;
        this.zzb = mediaFormat;
        this.zzc = zzamVar;
        this.zzd = surface;
    }

    public static zzsi zza(zzsn zzsnVar, MediaFormat mediaFormat, zzam zzamVar, MediaCrypto mediaCrypto) {
        return new zzsi(zzsnVar, mediaFormat, zzamVar, null, null, 0);
    }

    public static zzsi zzb(zzsn zzsnVar, MediaFormat mediaFormat, zzam zzamVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzsi(zzsnVar, mediaFormat, zzamVar, surface, null, 0);
    }
}
