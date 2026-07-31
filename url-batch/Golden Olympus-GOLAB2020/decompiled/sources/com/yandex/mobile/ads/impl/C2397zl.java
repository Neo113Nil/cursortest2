package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.zl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2397zl {

    /* renamed from: a, reason: collision with root package name */
    private long f35615a;

    /* renamed from: b, reason: collision with root package name */
    private long f35616b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f35617c;

    C2397zl() {
    }

    public final long a(yb0 yb0Var) {
        return Math.max(0L, ((this.f35616b - 529) * 1000000) / yb0Var.f34973A) + this.f35615a;
    }

    public final void a() {
        this.f35615a = 0L;
        this.f35616b = 0L;
        this.f35617c = false;
    }

    public final long a(yb0 yb0Var, gy gyVar) {
        if (this.f35616b == 0) {
            this.f35615a = gyVar.f26358f;
        }
        if (this.f35617c) {
            return gyVar.f26358f;
        }
        ByteBuffer byteBuffer = gyVar.f26356d;
        byteBuffer.getClass();
        int i4 = 0;
        for (int i5 = 0; i5 < 4; i5++) {
            i4 = (i4 << 8) | (byteBuffer.get(i5) & 255);
        }
        int b4 = s11.b(i4);
        if (b4 == -1) {
            this.f35617c = true;
            this.f35616b = 0L;
            this.f35615a = gyVar.f26358f;
            ms0.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gyVar.f26358f;
        }
        long max = Math.max(0L, ((this.f35616b - 529) * 1000000) / yb0Var.f34973A) + this.f35615a;
        this.f35616b += b4;
        return max;
    }
}
