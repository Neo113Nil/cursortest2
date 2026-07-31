package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class rg {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f11145a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f11146b;

    /* renamed from: c, reason: collision with root package name */
    public int f11147c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f11148d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f11149e;

    /* renamed from: f, reason: collision with root package name */
    public int f11150f;

    /* renamed from: g, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f11151g;

    /* renamed from: h, reason: collision with root package name */
    private final qg f11152h;

    public rg() {
        int i7 = zm.f15186a;
        MediaCodec.CryptoInfo cryptoInfo = i7 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f11151g = cryptoInfo;
        this.f11152h = i7 >= 24 ? new qg(cryptoInfo, null) : null;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo a() {
        return this.f11151g;
    }

    public final void b(int i7, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i8) {
        this.f11150f = i7;
        this.f11148d = iArr;
        this.f11149e = iArr2;
        this.f11146b = bArr;
        this.f11145a = bArr2;
        this.f11147c = 1;
        int i9 = zm.f15186a;
        if (i9 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f11151g;
            cryptoInfo.numSubSamples = i7;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i9 >= 24) {
                qg.a(this.f11152h, 0, 0);
            }
        }
    }
}
