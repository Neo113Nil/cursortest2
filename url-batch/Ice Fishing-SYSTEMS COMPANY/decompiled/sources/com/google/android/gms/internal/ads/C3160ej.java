package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.ej, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3160ej implements InterfaceC3050ci {

    /* renamed from: b, reason: collision with root package name */
    public int f30463b;

    /* renamed from: c, reason: collision with root package name */
    public float f30464c;

    /* renamed from: d, reason: collision with root package name */
    public float f30465d;

    /* renamed from: e, reason: collision with root package name */
    public C3751ph f30466e;

    /* renamed from: f, reason: collision with root package name */
    public C3751ph f30467f;

    /* renamed from: g, reason: collision with root package name */
    public C3751ph f30468g;

    /* renamed from: h, reason: collision with root package name */
    public C3751ph f30469h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public C2759Ri f30470j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f30471k;

    /* renamed from: l, reason: collision with root package name */
    public ByteBuffer f30472l;

    /* renamed from: m, reason: collision with root package name */
    public long f30473m;

    /* renamed from: n, reason: collision with root package name */
    public long f30474n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f30475o;

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C2759Ri c2759Ri = this.f30470j;
            c2759Ri.getClass();
            this.f30473m += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            InterfaceC4291zi interfaceC4291zi = c2759Ri.i;
            int a9 = remaining / (interfaceC4291zi.a() * c2759Ri.f27401b);
            interfaceC4291zi.d(a9);
            interfaceC4291zi.m(remaining, byteBuffer);
            c2759Ri.f27408j += a9;
            c2759Ri.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final C3751ph b(C3751ph c3751ph) {
        int i = c3751ph.f33433c;
        if (i != 2 && i != 4) {
            throw new C2894Zh("Unhandled input format:", c3751ph);
        }
        int i4 = this.f30463b;
        if (i4 == -1) {
            i4 = c3751ph.f33431a;
        }
        this.f30466e = c3751ph;
        C3751ph c3751ph2 = new C3751ph(i4, c3751ph.f33432b, i);
        this.f30467f = c3751ph2;
        this.i = true;
        return c3751ph2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final void c() {
        C2759Ri c2759Ri = this.f30470j;
        if (c2759Ri != null) {
            int i = c2759Ri.f27408j;
            int i4 = c2759Ri.f27413o;
            int i9 = c2759Ri.f27409k;
            float f6 = c2759Ri.f27402c;
            float f9 = c2759Ri.f27403d;
            int i10 = i9 + ((int) (((((((i - i4) / (f6 / f9)) + i4) + c2759Ri.f27415q) + c2759Ri.f27410l) / (c2759Ri.f27404e * f9)) + 0.5d));
            c2759Ri.f27415q = 0.0d;
            int i11 = c2759Ri.f27407h;
            int i12 = i11 + i11;
            InterfaceC4291zi interfaceC4291zi = c2759Ri.i;
            interfaceC4291zi.d(i + i12);
            interfaceC4291zi.o(i * c2759Ri.f27401b, i12);
            c2759Ri.f27408j += i12;
            c2759Ri.b();
            if (c2759Ri.f27409k > i10) {
                c2759Ri.f27409k = Math.max(i10, 0);
            }
            c2759Ri.f27408j = 0;
            c2759Ri.f27413o = 0;
            c2759Ri.f27410l = 0;
        }
        this.f30475o = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final long d(long j9) {
        if (this.f30474n < 1024) {
            return (long) (j9 / this.f30464c);
        }
        long j10 = this.f30473m;
        this.f30470j.getClass();
        long a9 = j10 - (r2.i.a() * (r2.f27408j * r2.f27401b));
        int i = this.f30469h.f33431a;
        int i4 = this.f30468g.f33431a;
        return i == i4 ? AbstractC3548lu.w(j9, this.f30474n, a9, RoundingMode.DOWN) : AbstractC3548lu.w(j9, this.f30474n * i4, a9 * i, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final boolean e() {
        if (this.f30475o) {
            C2759Ri c2759Ri = this.f30470j;
            if (c2759Ri != null) {
                PA.T(c2759Ri.f27409k >= 0);
                if (c2759Ri.i.a() * c2759Ri.f27409k * c2759Ri.f27401b != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final ByteBuffer f() {
        C2759Ri c2759Ri = this.f30470j;
        if (c2759Ri != null) {
            PA.T(c2759Ri.f27409k >= 0);
            int i = c2759Ri.f27409k;
            int i4 = c2759Ri.f27401b;
            InterfaceC4291zi interfaceC4291zi = c2759Ri.i;
            int a9 = interfaceC4291zi.a() * i * i4;
            if (a9 > 0) {
                if (this.f30471k.capacity() < a9) {
                    this.f30471k = ByteBuffer.allocateDirect(a9).order(ByteOrder.nativeOrder());
                } else {
                    this.f30471k.clear();
                }
                ByteBuffer byteBuffer = this.f30471k;
                PA.T(c2759Ri.f27409k >= 0);
                int min = Math.min(byteBuffer.remaining() / (interfaceC4291zi.a() * i4), c2759Ri.f27409k);
                interfaceC4291zi.q(min, byteBuffer);
                c2759Ri.f27409k -= min;
                System.arraycopy(interfaceC4291zi.n(), min * i4, interfaceC4291zi.n(), 0, c2759Ri.f27409k * i4);
                this.f30471k.flip();
                this.f30474n += a9;
                this.f30472l = this.f30471k;
            }
        }
        ByteBuffer byteBuffer2 = this.f30472l;
        this.f30472l = InterfaceC3050ci.f29732a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final void g(C2673Mh c2673Mh) {
        if (i()) {
            C3751ph c3751ph = this.f30466e;
            this.f30468g = c3751ph;
            C3751ph c3751ph2 = this.f30467f;
            this.f30469h = c3751ph2;
            if (this.i) {
                this.f30470j = new C2759Ri(c3751ph.f33431a, c3751ph.f33432b, this.f30464c, this.f30465d, c3751ph2.f33431a, c3751ph.f33433c == 4);
            } else {
                C2759Ri c2759Ri = this.f30470j;
                if (c2759Ri != null) {
                    c2759Ri.f27408j = 0;
                    c2759Ri.f27409k = 0;
                    c2759Ri.f27410l = 0;
                    c2759Ri.f27411m = 0;
                    c2759Ri.f27412n = 0;
                    c2759Ri.f27413o = 0;
                    c2759Ri.f27414p = 0;
                    c2759Ri.f27415q = 0.0d;
                    c2759Ri.i.e();
                }
            }
        }
        this.f30472l = InterfaceC3050ci.f29732a;
        this.f30473m = 0L;
        this.f30474n = 0L;
        this.f30475o = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final void h() {
        this.f30464c = 1.0f;
        this.f30465d = 1.0f;
        C3751ph c3751ph = C3751ph.f33430e;
        this.f30466e = c3751ph;
        this.f30467f = c3751ph;
        this.f30468g = c3751ph;
        this.f30469h = c3751ph;
        ByteBuffer byteBuffer = InterfaceC3050ci.f29732a;
        this.f30471k = byteBuffer;
        this.f30472l = byteBuffer;
        this.f30463b = -1;
        this.i = false;
        this.f30470j = null;
        this.f30473m = 0L;
        this.f30474n = 0L;
        this.f30475o = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3050ci
    public final boolean i() {
        if (this.f30467f.f33431a != -1) {
            return Math.abs(this.f30464c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f30465d + (-1.0f)) >= 1.0E-4f || this.f30467f.f33431a != this.f30466e.f33431a;
        }
        return false;
    }
}
