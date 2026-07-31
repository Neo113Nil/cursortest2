package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v21 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13081a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f13082b;

    /* renamed from: c, reason: collision with root package name */
    public int f13083c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f13084d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f13085e;

    /* renamed from: f, reason: collision with root package name */
    public int f13086f;

    /* renamed from: g, reason: collision with root package name */
    public int f13087g;

    /* renamed from: h, reason: collision with root package name */
    public int f13088h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f13089i;

    /* renamed from: j, reason: collision with root package name */
    private final u11 f13090j;

    public v21() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f13089i = cryptoInfo;
        this.f13090j = n13.f8865a >= 24 ? new u11(cryptoInfo, null) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return this.f13089i;
    }

    public final void b(int i7) {
        if (i7 == 0) {
            return;
        }
        if (this.f13084d == null) {
            int[] iArr = new int[1];
            this.f13084d = iArr;
            this.f13089i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f13084d;
        iArr2[0] = iArr2[0] + i7;
    }

    public final void c(int i7, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i8, int i9, int i10) {
        this.f13086f = i7;
        this.f13084d = iArr;
        this.f13085e = iArr2;
        this.f13082b = bArr;
        this.f13081a = bArr2;
        this.f13083c = i8;
        this.f13087g = i9;
        this.f13088h = i10;
        MediaCodec.CryptoInfo cryptoInfo = this.f13089i;
        cryptoInfo.numSubSamples = i7;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i8;
        if (n13.f8865a >= 24) {
            u11 u11Var = this.f13090j;
            Objects.requireNonNull(u11Var);
            u11.a(u11Var, i9, i10);
        }
    }
}
