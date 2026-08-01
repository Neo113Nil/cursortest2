package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzhx {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    static /* bridge */ /* synthetic */ void zza(zzhx zzhxVar, int i, int i2) {
        zzhxVar.zzb.set(i, i2);
        zzhxVar.zza.setPattern(zzhxVar.zzb);
    }
}
