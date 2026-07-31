package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class hy1 implements xz0 {
    @Override // com.yandex.mobile.ads.impl.xz0
    public final wz0 a(zz0 zz0Var) {
        ByteBuffer byteBuffer = zz0Var.f26356d;
        byteBuffer.getClass();
        if (byteBuffer.position() != 0 || !byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            throw new IllegalArgumentException();
        }
        if (zz0Var.e()) {
            return null;
        }
        return a(zz0Var, byteBuffer);
    }

    protected abstract wz0 a(zz0 zz0Var, ByteBuffer byteBuffer);
}
