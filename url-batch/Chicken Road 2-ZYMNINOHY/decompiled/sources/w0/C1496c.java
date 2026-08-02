package w0;

import T.C0096n;
import T.C0097o;
import T.e0;
import a.AbstractC0124a;
import a0.C0146l;
import android.view.Surface;
import d2.C0389g;
import io.appmetrica.analytics.impl.ap;
import j1.ExecutorC1174c;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import z2.EnumC1582a;

/* renamed from: w0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496c implements InterfaceC1493H {

    /* renamed from: a, reason: collision with root package name */
    public final u f15775a;

    /* renamed from: b, reason: collision with root package name */
    public final v f15776b;

    /* renamed from: c, reason: collision with root package name */
    public final C1487B f15777c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f15778d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f15779e;

    /* renamed from: f, reason: collision with root package name */
    public C0097o f15780f;

    /* renamed from: g, reason: collision with root package name */
    public long f15781g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1491F f15782h;

    /* renamed from: i, reason: collision with root package name */
    public Executor f15783i;

    /* renamed from: j, reason: collision with root package name */
    public t f15784j;

    public C1496c(u uVar, v vVar, W.D d4) {
        this.f15775a = uVar;
        this.f15776b = vVar;
        uVar.f15907l = d4;
        this.f15777c = new C1487B(new C0389g(this), uVar, vVar);
        this.f15778d = new ArrayDeque();
        this.f15780f = new C0097o(new C0096n());
        this.f15781g = -9223372036854775807L;
        this.f15782h = InterfaceC1491F.f15771a;
        this.f15783i = new ExecutorC1174c(1);
        this.f15784j = new C1494a();
    }

    @Override // w0.InterfaceC1493H
    public final Surface a() {
        Surface surface = this.f15779e;
        surface.getClass();
        return surface;
    }

    @Override // w0.InterfaceC1493H
    public final boolean b() {
        C1487B c1487b = this.f15777c;
        long j4 = c1487b.f15763j;
        return j4 != -9223372036854775807L && c1487b.f15762i == j4;
    }

    @Override // w0.InterfaceC1493H
    public final void c() {
        this.f15776b.b();
        u uVar = this.f15775a;
        uVar.f15899d = false;
        uVar.f15904i = -9223372036854775807L;
        C1486A c1486a = uVar.f15897b;
        c1486a.f15740d = false;
        w wVar = c1486a.f15739c;
        if (wVar != null) {
            wVar.b();
        }
        c1486a.a();
    }

    @Override // w0.InterfaceC1493H
    public final void d() {
        this.f15776b.b();
        this.f15775a.d();
    }

    @Override // w0.InterfaceC1493H
    public final void e(Surface surface, W.v vVar) {
        this.f15779e = surface;
        this.f15775a.g(surface);
    }

    @Override // w0.InterfaceC1493H
    public final void f(long j4) {
        throw new UnsupportedOperationException();
    }

    @Override // w0.InterfaceC1493H
    public final void g(C0097o c0097o, long j4, int i4, List list) {
        AbstractC0124a.t(list.isEmpty());
        int i5 = c0097o.f2874u;
        int i6 = c0097o.v;
        C0097o c0097o2 = this.f15780f;
        int i7 = c0097o2.f2874u;
        C1487B c1487b = this.f15777c;
        if (i5 != i7 || i6 != c0097o2.v) {
            S0.g gVar = c1487b.f15757d;
            long j5 = c1487b.f15761h;
            gVar.a(j5 == -9223372036854775807L ? 0L : j5 + 1, new e0(i5, i6));
        }
        float f4 = c0097o.f2877y;
        if (f4 != this.f15780f.f2877y) {
            this.f15775a.f(f4);
        }
        this.f15780f = c0097o;
        if (j4 != this.f15781g) {
            if (c1487b.f15759f.f2420c == 0) {
                c1487b.f15755b.e(i4);
                c1487b.f15765l = j4;
            } else {
                S0.g gVar2 = c1487b.f15758e;
                long j6 = c1487b.f15761h;
                gVar2.a(j6 == -9223372036854775807L ? -4611686018427387904L : j6 + 1, Long.valueOf(j4));
            }
            this.f15781g = j4;
        }
    }

    @Override // w0.InterfaceC1493H
    public final void h() {
        C1487B c1487b = this.f15777c;
        if (c1487b.f15761h == -9223372036854775807L) {
            c1487b.f15761h = Long.MIN_VALUE;
            c1487b.f15762i = Long.MIN_VALUE;
        }
        c1487b.f15763j = c1487b.f15761h;
    }

    @Override // w0.InterfaceC1493H
    public final void i(int i4) {
        C1486A c1486a = this.f15775a.f15897b;
        if (c1486a.f15746j == i4) {
            return;
        }
        c1486a.f15746j = i4;
        c1486a.d(true);
    }

    @Override // w0.InterfaceC1493H
    public final void j(float f4) {
        this.f15775a.h(f4);
    }

    @Override // w0.InterfaceC1493H
    public final void k() {
        this.f15779e = null;
        this.f15775a.g(null);
    }

    @Override // w0.InterfaceC1493H
    public final void l(boolean z) {
        if (z) {
            u uVar = this.f15775a;
            uVar.f15897b.b();
            uVar.f15903h = -9223372036854775807L;
            uVar.f15901f = -9223372036854775807L;
            uVar.f15900e = Math.min(uVar.f15900e, 1);
            uVar.f15904i = -9223372036854775807L;
        }
        this.f15776b.b();
        C1487B c1487b = this.f15777c;
        S0.g gVar = c1487b.f15757d;
        S0.h hVar = c1487b.f15759f;
        hVar.f2418a = 0;
        hVar.f2419b = -1;
        hVar.f2420c = 0;
        c1487b.f15761h = -9223372036854775807L;
        c1487b.f15762i = -9223372036854775807L;
        c1487b.f15763j = -9223372036854775807L;
        S0.g gVar2 = c1487b.f15758e;
        if (gVar2.f() > 0) {
            AbstractC0124a.h(gVar2.f() > 0);
            while (gVar2.f() > 1) {
                gVar2.c();
            }
            Object c4 = gVar2.c();
            c4.getClass();
            c1487b.f15765l = ((Long) c4).longValue();
        }
        if (gVar.f() > 0) {
            AbstractC0124a.h(gVar.f() > 0);
            while (gVar.f() > 1) {
                gVar.c();
            }
            Object c5 = gVar.c();
            c5.getClass();
            gVar.a(0L, (e0) c5);
        }
        this.f15778d.clear();
    }

    @Override // w0.InterfaceC1493H
    public final void m(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // w0.InterfaceC1493H
    public final void n(t tVar) {
        this.f15784j = tVar;
    }

    @Override // w0.InterfaceC1493H
    public final void o(long j4, long j5) {
        try {
            this.f15777c.a(j4, j5);
        } catch (C0146l e4) {
            throw new C1492G(e4, this.f15780f);
        }
    }

    @Override // w0.InterfaceC1493H
    public final void p(C1500g c1500g) {
        this.f15782h = c1500g;
        this.f15783i = EnumC1582a.f16288a;
    }

    @Override // w0.InterfaceC1493H
    public final boolean q(long j4, C1501h c1501h) {
        this.f15778d.add(c1501h);
        C1487B c1487b = this.f15777c;
        S0.h hVar = c1487b.f15759f;
        int i4 = hVar.f2420c;
        long[] jArr = (long[]) hVar.f2422e;
        if (i4 == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i5 = hVar.f2418a;
            int i6 = length2 - i5;
            System.arraycopy(jArr, i5, jArr2, 0, i6);
            System.arraycopy((long[]) hVar.f2422e, 0, jArr2, i6, i5);
            hVar.f2418a = 0;
            hVar.f2419b = hVar.f2420c - 1;
            hVar.f2422e = jArr2;
            hVar.f2421d = length - 1;
        }
        int i7 = (hVar.f2419b + 1) & hVar.f2421d;
        hVar.f2419b = i7;
        ((long[]) hVar.f2422e)[i7] = j4;
        hVar.f2420c++;
        c1487b.f15761h = j4;
        c1487b.f15763j = -9223372036854775807L;
        this.f15783i.execute(new ap(6, this));
        return true;
    }

    @Override // w0.InterfaceC1493H
    public final void r(boolean z) {
        this.f15775a.c(z);
    }

    @Override // w0.InterfaceC1493H
    public final boolean s(boolean z) {
        return this.f15775a.b(z);
    }

    @Override // w0.InterfaceC1493H
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override // w0.InterfaceC1493H
    public final boolean u(C0097o c0097o) {
        return true;
    }

    @Override // w0.InterfaceC1493H
    public final boolean v() {
        return true;
    }

    @Override // w0.InterfaceC1493H
    public final void w() {
        u uVar = this.f15775a;
        if (uVar.f15900e == 0) {
            uVar.f15900e = 1;
        }
    }

    @Override // w0.InterfaceC1493H
    public final void release() {
    }
}
