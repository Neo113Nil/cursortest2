package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
final class n44 implements l44 {
    /* synthetic */ n44(m44 m44Var) {
    }

    @Override // com.google.android.gms.internal.ads.l44
    public final MediaCodecInfo F(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // com.google.android.gms.internal.ads.l44
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.l44
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.l44
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.l44
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
