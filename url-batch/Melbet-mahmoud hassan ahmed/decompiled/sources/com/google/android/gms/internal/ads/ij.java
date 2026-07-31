package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* loaded from: classes.dex */
final class ij implements fj {

    /* renamed from: a, reason: collision with root package name */
    private final int f6661a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f6662b;

    public ij(boolean z6) {
        this.f6661a = z6 ? 1 : 0;
    }

    private final void a() {
        if (this.f6662b == null) {
            this.f6662b = new MediaCodecList(this.f6661a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.fj
    public final MediaCodecInfo F(int i7) {
        a();
        return this.f6662b[i7];
    }

    @Override // com.google.android.gms.internal.ads.fj
    public final boolean G(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.google.android.gms.internal.ads.fj
    public final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fj
    public final int zza() {
        a();
        return this.f6662b.length;
    }
}
