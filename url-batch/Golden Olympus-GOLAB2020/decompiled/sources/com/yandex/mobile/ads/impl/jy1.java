package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class jy1 extends ey1<g32, h32, e32> implements d32 {
    protected jy1() {
        super(new g32[2], new h32[2]);
        f();
    }

    protected abstract c32 a(byte[] bArr, int i4, boolean z4);

    @Override // com.yandex.mobile.ads.impl.d32
    public final void a(long j4) {
    }

    @Override // com.yandex.mobile.ads.impl.ey1
    protected final g32 c() {
        return new g32();
    }

    @Override // com.yandex.mobile.ads.impl.ey1
    protected final h32 d() {
        return new iy1(this);
    }

    @Override // com.yandex.mobile.ads.impl.ey1
    protected final e32 a(gy gyVar, hy hyVar, boolean z4) {
        g32 g32Var = (g32) gyVar;
        h32 h32Var = (h32) hyVar;
        try {
            ByteBuffer byteBuffer = g32Var.f26356d;
            byteBuffer.getClass();
            h32Var.a(g32Var.f26358f, a(byteBuffer.array(), byteBuffer.limit(), z4), g32Var.f25996j);
            h32Var.c();
            return null;
        } catch (e32 e4) {
            return e4;
        }
    }
}
