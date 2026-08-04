package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzsj implements LoudnessCodecController.OnLoudnessCodecUpdateListener {
    zzsj(zzsm zzsmVar) {
        Objects.requireNonNull(zzsmVar);
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        return bundle;
    }
}
