package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;

/* loaded from: classes3.dex */
public final class tu {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f32690a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f32691b;

    /* renamed from: c, reason: collision with root package name */
    public int f32692c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f32693d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f32694e;

    /* renamed from: f, reason: collision with root package name */
    public int f32695f;

    /* renamed from: g, reason: collision with root package name */
    public int f32696g;

    /* renamed from: h, reason: collision with root package name */
    public int f32697h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f32698i;

    /* renamed from: j, reason: collision with root package name */
    private final a f32699j;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f32700a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f32701b;

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f32700a = cryptoInfo;
            this.f32701b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i4, int i5) {
            this.f32701b.set(i4, i5);
            this.f32700a.setPattern(this.f32701b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tu() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f32698i = cryptoInfo;
        this.f32699j = u82.f32873a >= 24 ? new a(cryptoInfo) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return this.f32698i;
    }

    public final void a(int i4) {
        if (i4 == 0) {
            return;
        }
        if (this.f32693d == null) {
            int[] iArr = new int[1];
            this.f32693d = iArr;
            this.f32698i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f32693d;
        iArr2[0] = iArr2[0] + i4;
    }

    public final void a(int i4, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i5, int i6, int i7) {
        this.f32695f = i4;
        this.f32693d = iArr;
        this.f32694e = iArr2;
        this.f32691b = bArr;
        this.f32690a = bArr2;
        this.f32692c = i5;
        this.f32696g = i6;
        this.f32697h = i7;
        MediaCodec.CryptoInfo cryptoInfo = this.f32698i;
        cryptoInfo.numSubSamples = i4;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i5;
        if (u82.f32873a >= 24) {
            a aVar = this.f32699j;
            aVar.getClass();
            aVar.a(i6, i7);
        }
    }
}
