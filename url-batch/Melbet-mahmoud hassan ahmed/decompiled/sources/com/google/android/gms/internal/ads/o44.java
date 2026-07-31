package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
final class o44 implements l44 {

    /* renamed from: a, reason: collision with root package name */
    private final int f9507a;

    /* renamed from: b, reason: collision with root package name */
    private MediaCodecInfo[] f9508b;

    public o44(boolean z6, boolean z7) {
        int i7 = 1;
        if (!z6 && !z7) {
            i7 = 0;
        }
        this.f9507a = i7;
    }

    private final void d() {
        if (this.f9508b == null) {
            this.f9508b = new MediaCodecList(this.f9507a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.l44
    public final MediaCodecInfo F(int i7) {
        d();
        return this.f9508b[i7];
    }

    @Override // com.google.android.gms.internal.ads.l44
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.l44
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.l44
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.l44
    public final int zza() {
        d();
        return this.f9508b.length;
    }
}
