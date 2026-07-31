package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.hk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1979hk extends gy {

    /* renamed from: j, reason: collision with root package name */
    private long f26772j;

    /* renamed from: k, reason: collision with root package name */
    private int f26773k;

    /* renamed from: l, reason: collision with root package name */
    private int f26774l;

    public C1979hk() {
        super(2);
        this.f26774l = 32;
    }

    public final boolean a(gy gyVar) {
        ByteBuffer byteBuffer;
        if (gyVar.i()) {
            throw new IllegalArgumentException();
        }
        if (gyVar.d()) {
            throw new IllegalArgumentException();
        }
        if (gyVar.f()) {
            throw new IllegalArgumentException();
        }
        if (m()) {
            if (this.f26773k >= this.f26774l || gyVar.e() != e()) {
                return false;
            }
            ByteBuffer byteBuffer2 = gyVar.f26356d;
            if (byteBuffer2 != null && (byteBuffer = this.f26356d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i4 = this.f26773k;
        this.f26773k = i4 + 1;
        if (i4 == 0) {
            this.f26358f = gyVar.f26358f;
            if (gyVar.g()) {
                d(1);
            }
        }
        if (gyVar.e()) {
            d(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = gyVar.f26356d;
        if (byteBuffer3 != null) {
            e(byteBuffer3.remaining());
            this.f26356d.put(byteBuffer3);
        }
        this.f26772j = gyVar.f26358f;
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.gy, com.yandex.mobile.ads.impl.AbstractC2168pl
    public final void b() {
        super.b();
        this.f26773k = 0;
    }

    public final void f(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f26774l = i4;
    }

    public final long k() {
        return this.f26772j;
    }

    public final int l() {
        return this.f26773k;
    }

    public final boolean m() {
        return this.f26773k > 0;
    }
}
