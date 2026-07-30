package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public final class FN {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f24951a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f24952b;

    /* renamed from: c, reason: collision with root package name */
    public int f24953c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f24954d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f24955e;

    /* renamed from: f, reason: collision with root package name */
    public int f24956f;

    /* renamed from: g, reason: collision with root package name */
    public int f24957g;

    /* renamed from: h, reason: collision with root package name */
    public int f24958h;
    public final MediaCodec.CryptoInfo i;

    /* renamed from: j, reason: collision with root package name */
    public final C4164xG f24959j;

    public FN() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.f24959j = new C4164xG(cryptoInfo);
    }

    public final void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.f24954d == null) {
            int[] iArr = new int[1];
            this.f24954d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f24954d;
        iArr2[0] = iArr2[0] + i;
    }
}
