package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class q34 extends z51 {

    /* renamed from: h, reason: collision with root package name */
    private long f10567h;

    /* renamed from: i, reason: collision with root package name */
    private int f10568i;

    /* renamed from: j, reason: collision with root package name */
    private int f10569j;

    public q34() {
        super(2, 0);
        this.f10569j = 32;
    }

    @Override // com.google.android.gms.internal.ads.z51, com.google.android.gms.internal.ads.sz0
    public final void b() {
        super.b();
        this.f10568i = 0;
    }

    public final int m() {
        return this.f10568i;
    }

    public final long n() {
        return this.f10567h;
    }

    public final void o(int i7) {
        this.f10569j = i7;
    }

    public final boolean p(z51 z51Var) {
        ByteBuffer byteBuffer;
        wu1.d(!z51Var.d(1073741824));
        wu1.d(!z51Var.d(268435456));
        wu1.d(!z51Var.d(4));
        if (q()) {
            if (this.f10568i >= this.f10569j || z51Var.d(Integer.MIN_VALUE) != d(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = z51Var.f14952c;
            if (byteBuffer2 != null && (byteBuffer = this.f14952c) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i7 = this.f10568i;
        this.f10568i = i7 + 1;
        if (i7 == 0) {
            this.f14954e = z51Var.f14954e;
            if (z51Var.d(1)) {
                c(1);
            }
        }
        if (z51Var.d(Integer.MIN_VALUE)) {
            c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = z51Var.f14952c;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.f14952c.put(byteBuffer3);
        }
        this.f10567h = z51Var.f14954e;
        return true;
    }

    public final boolean q() {
        return this.f10568i > 0;
    }
}
