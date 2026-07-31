package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class ng implements mf {

    /* renamed from: d, reason: collision with root package name */
    private mg f9082d;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f9085g;

    /* renamed from: h, reason: collision with root package name */
    private ShortBuffer f9086h;

    /* renamed from: i, reason: collision with root package name */
    private ByteBuffer f9087i;

    /* renamed from: j, reason: collision with root package name */
    private long f9088j;

    /* renamed from: k, reason: collision with root package name */
    private long f9089k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9090l;

    /* renamed from: e, reason: collision with root package name */
    private float f9083e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f9084f = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    private int f9080b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f9081c = -1;

    public ng() {
        ByteBuffer byteBuffer = mf.f8510a;
        this.f9085g = byteBuffer;
        this.f9086h = byteBuffer.asShortBuffer();
        this.f9087i = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final int a() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void b() {
        this.f9082d.c();
        this.f9090l = true;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final ByteBuffer c() {
        ByteBuffer byteBuffer = this.f9087i;
        this.f9087i = mf.f8510a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f9088j += remaining;
            this.f9082d.d(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int a7 = this.f9082d.a() * this.f9080b;
        int i7 = a7 + a7;
        if (i7 > 0) {
            if (this.f9085g.capacity() < i7) {
                ByteBuffer order = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
                this.f9085g = order;
                this.f9086h = order.asShortBuffer();
            } else {
                this.f9085g.clear();
                this.f9086h.clear();
            }
            this.f9082d.b(this.f9086h);
            this.f9089k += i7;
            this.f9085g.limit(i7);
            this.f9087i = this.f9085g;
        }
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void e() {
        this.f9082d = null;
        ByteBuffer byteBuffer = mf.f8510a;
        this.f9085g = byteBuffer;
        this.f9086h = byteBuffer.asShortBuffer();
        this.f9087i = byteBuffer;
        this.f9080b = -1;
        this.f9081c = -1;
        this.f9088j = 0L;
        this.f9089k = 0L;
        this.f9090l = false;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final boolean f(int i7, int i8, int i9) {
        if (i9 != 2) {
            throw new lf(i7, i8, i9);
        }
        if (this.f9081c == i7 && this.f9080b == i8) {
            return false;
        }
        this.f9081c = i7;
        this.f9080b = i8;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void g() {
        mg mgVar = new mg(this.f9081c, this.f9080b);
        this.f9082d = mgVar;
        mgVar.f(this.f9083e);
        this.f9082d.e(this.f9084f);
        this.f9087i = mf.f8510a;
        this.f9088j = 0L;
        this.f9089k = 0L;
        this.f9090l = false;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final boolean h() {
        return Math.abs(this.f9083e + (-1.0f)) >= 0.01f || Math.abs(this.f9084f + (-1.0f)) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final boolean i() {
        mg mgVar;
        return this.f9090l && ((mgVar = this.f9082d) == null || mgVar.a() == 0);
    }

    public final float j(float f7) {
        this.f9084f = zm.a(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    public final float k(float f7) {
        float a7 = zm.a(f7, 0.1f, 8.0f);
        this.f9083e = a7;
        return a7;
    }

    public final long l() {
        return this.f9088j;
    }

    public final long m() {
        return this.f9089k;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final int zza() {
        return this.f9080b;
    }
}
