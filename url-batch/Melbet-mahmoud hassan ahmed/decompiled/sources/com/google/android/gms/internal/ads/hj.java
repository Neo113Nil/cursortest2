package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
final class hj implements fj {
    /* synthetic */ hj(gj gjVar) {
    }

    @Override // com.google.android.gms.internal.ads.fj
    public final MediaCodecInfo F(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // com.google.android.gms.internal.ads.fj
    public final boolean G(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // com.google.android.gms.internal.ads.fj
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fj
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
