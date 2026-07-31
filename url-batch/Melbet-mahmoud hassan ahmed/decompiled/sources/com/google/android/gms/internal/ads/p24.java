package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p24 implements w04 {

    /* renamed from: b, reason: collision with root package name */
    private int f10037b;

    /* renamed from: c, reason: collision with root package name */
    private float f10038c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f10039d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private u04 f10040e;

    /* renamed from: f, reason: collision with root package name */
    private u04 f10041f;

    /* renamed from: g, reason: collision with root package name */
    private u04 f10042g;

    /* renamed from: h, reason: collision with root package name */
    private u04 f10043h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10044i;

    /* renamed from: j, reason: collision with root package name */
    private o24 f10045j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f10046k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f10047l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f10048m;

    /* renamed from: n, reason: collision with root package name */
    private long f10049n;

    /* renamed from: o, reason: collision with root package name */
    private long f10050o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10051p;

    public p24() {
        u04 u04Var = u04.f12545e;
        this.f10040e = u04Var;
        this.f10041f = u04Var;
        this.f10042g = u04Var;
        this.f10043h = u04Var;
        ByteBuffer byteBuffer = w04.f13656a;
        this.f10046k = byteBuffer;
        this.f10047l = byteBuffer.asShortBuffer();
        this.f10048m = byteBuffer;
        this.f10037b = -1;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final ByteBuffer a() {
        int a7;
        o24 o24Var = this.f10045j;
        if (o24Var != null && (a7 = o24Var.a()) > 0) {
            if (this.f10046k.capacity() < a7) {
                ByteBuffer order = ByteBuffer.allocateDirect(a7).order(ByteOrder.nativeOrder());
                this.f10046k = order;
                this.f10047l = order.asShortBuffer();
            } else {
                this.f10046k.clear();
                this.f10047l.clear();
            }
            o24Var.d(this.f10047l);
            this.f10050o += a7;
            this.f10046k.limit(a7);
            this.f10048m = this.f10046k;
        }
        ByteBuffer byteBuffer = this.f10048m;
        this.f10048m = w04.f13656a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final u04 b(u04 u04Var) {
        if (u04Var.f12548c != 2) {
            throw new v04(u04Var);
        }
        int i7 = this.f10037b;
        if (i7 == -1) {
            i7 = u04Var.f12546a;
        }
        this.f10040e = u04Var;
        u04 u04Var2 = new u04(i7, u04Var.f12547b, 2);
        this.f10041f = u04Var2;
        this.f10044i = true;
        return u04Var2;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void c() {
        if (e()) {
            u04 u04Var = this.f10040e;
            this.f10042g = u04Var;
            u04 u04Var2 = this.f10041f;
            this.f10043h = u04Var2;
            if (this.f10044i) {
                this.f10045j = new o24(u04Var.f12546a, u04Var.f12547b, this.f10038c, this.f10039d, u04Var2.f12546a);
            } else {
                o24 o24Var = this.f10045j;
                if (o24Var != null) {
                    o24Var.c();
                }
            }
        }
        this.f10048m = w04.f13656a;
        this.f10049n = 0L;
        this.f10050o = 0L;
        this.f10051p = false;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void d() {
        this.f10038c = 1.0f;
        this.f10039d = 1.0f;
        u04 u04Var = u04.f12545e;
        this.f10040e = u04Var;
        this.f10041f = u04Var;
        this.f10042g = u04Var;
        this.f10043h = u04Var;
        ByteBuffer byteBuffer = w04.f13656a;
        this.f10046k = byteBuffer;
        this.f10047l = byteBuffer.asShortBuffer();
        this.f10048m = byteBuffer;
        this.f10037b = -1;
        this.f10044i = false;
        this.f10045j = null;
        this.f10049n = 0L;
        this.f10050o = 0L;
        this.f10051p = false;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final boolean e() {
        if (this.f10041f.f12546a != -1) {
            return Math.abs(this.f10038c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f10039d + (-1.0f)) >= 1.0E-4f || this.f10041f.f12546a != this.f10040e.f12546a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final boolean f() {
        o24 o24Var;
        return this.f10051p && ((o24Var = this.f10045j) == null || o24Var.a() == 0);
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void g() {
        o24 o24Var = this.f10045j;
        if (o24Var != null) {
            o24Var.e();
        }
        this.f10051p = true;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void h(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            o24 o24Var = this.f10045j;
            Objects.requireNonNull(o24Var);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f10049n += remaining;
            o24Var.f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final long i(long j7) {
        if (this.f10050o < 1024) {
            double d7 = this.f10038c;
            double d8 = j7;
            Double.isNaN(d7);
            Double.isNaN(d8);
            return (long) (d7 * d8);
        }
        long j8 = this.f10049n;
        Objects.requireNonNull(this.f10045j);
        long b7 = j8 - r3.b();
        int i7 = this.f10043h.f12546a;
        int i8 = this.f10042g.f12546a;
        return i7 == i8 ? n13.Z(j7, b7, this.f10050o) : n13.Z(j7, b7 * i7, this.f10050o * i8);
    }

    public final void j(float f7) {
        if (this.f10039d != f7) {
            this.f10039d = f7;
            this.f10044i = true;
        }
    }

    public final void k(float f7) {
        if (this.f10038c != f7) {
            this.f10038c = f7;
            this.f10044i = true;
        }
    }
}
