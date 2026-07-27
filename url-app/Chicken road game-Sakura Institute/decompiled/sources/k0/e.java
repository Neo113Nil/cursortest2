package k0;

import B1.C0097d;
import H1.z;
import M0.o;
import S.n;
import W2.InterfaceC0302y;
import o.C0908r0;
import r0.AbstractC1065f;
import r0.q0;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class e extends n implements q0 {

    /* renamed from: t, reason: collision with root package name */
    public final z f7369t;

    /* renamed from: u, reason: collision with root package name */
    public final C0097d f7370u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7371v = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public e(z zVar, C0097d c0097d) {
        this.f7369t = zVar;
        this.f7370u = c0097d;
    }

    public final InterfaceC0302y B0() {
        e eVar = this.f3990s ? (e) AbstractC1065f.k(this) : null;
        if (eVar != null) {
            return eVar.B0();
        }
        InterfaceC0302y interfaceC0302y = (InterfaceC0302y) this.f7370u.f989j;
        if (interfaceC0302y != null) {
            return interfaceC0302y;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C0(long j4, long j5, E2.c cVar) {
        c cVar2;
        int i2;
        long j6;
        long j7;
        e eVar;
        e eVar2;
        long j8;
        long j9;
        long j10;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i4 = cVar2.f7363o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar2.f7363o = i4 - Integer.MIN_VALUE;
                Object obj = cVar2.f7361m;
                D2.a aVar = D2.a.f2163d;
                i2 = cVar2.f7363o;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    cVar2.f7358j = this;
                    j6 = j4;
                    cVar2.f7359k = j6;
                    j7 = j5;
                    cVar2.f7360l = j7;
                    cVar2.f7363o = 1;
                    obj = this.f7369t.a(j4, j5, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    eVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j10 = cVar2.f7359k;
                        AbstractC1343r.b(obj);
                        j9 = ((o) obj).f3563a;
                        j8 = j10;
                        return new o(o.e(j8, j9));
                    }
                    long j11 = cVar2.f7360l;
                    long j12 = cVar2.f7359k;
                    eVar = cVar2.f7358j;
                    AbstractC1343r.b(obj);
                    j7 = j11;
                    j6 = j12;
                }
                long j13 = ((o) obj).f3563a;
                boolean z4 = eVar.f3990s;
                eVar2 = (z4 || !z4) ? null : (e) AbstractC1065f.k(eVar);
                if (eVar2 != null) {
                    j8 = j13;
                    j9 = 0;
                    return new o(o.e(j8, j9));
                }
                long e4 = o.e(j6, j13);
                long d4 = o.d(j7, j13);
                cVar2.f7358j = null;
                cVar2.f7359k = j13;
                cVar2.f7363o = 2;
                obj = eVar2.C0(e4, d4, cVar2);
                if (obj == aVar) {
                    return aVar;
                }
                j10 = j13;
                j9 = ((o) obj).f3563a;
                j8 = j10;
                return new o(o.e(j8, j9));
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f7361m;
        D2.a aVar2 = D2.a.f2163d;
        i2 = cVar2.f7363o;
        if (i2 != 0) {
        }
        long j132 = ((o) obj2).f3563a;
        boolean z42 = eVar.f3990s;
        if (z42) {
        }
        if (eVar2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long D0(long j4, long j5, int i2) {
        long j6;
        boolean z4;
        e eVar;
        z zVar = this.f7369t;
        if (zVar.f3320a) {
            C0908r0 c0908r0 = (C0908r0) zVar.f3321b;
            if (!c0908r0.f8865a.d()) {
                j6 = c0908r0.g(c0908r0.c(c0908r0.f8865a.b(c0908r0.c(c0908r0.f(j5)))));
                z4 = this.f3990s;
                eVar = null;
                if (z4 && z4) {
                    eVar = (e) AbstractC1065f.k(this);
                }
                e eVar2 = eVar;
                return Y.c.h(j6, eVar2 != null ? eVar2.D0(Y.c.h(j4, j6), Y.c.g(j5, j6), i2) : 0L);
            }
        }
        j6 = 0;
        z4 = this.f3990s;
        eVar = null;
        if (z4) {
            eVar = (e) AbstractC1065f.k(this);
        }
        e eVar22 = eVar;
        return Y.c.h(j6, eVar22 != null ? eVar22.D0(Y.c.h(j4, j6), Y.c.g(j5, j6), i2) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E0(long j4, C2.a aVar) {
        d dVar;
        Object obj;
        D2.a aVar2;
        int i2;
        e eVar;
        long j5;
        long j6;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i4 = dVar.f7368n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.f7368n = i4 - Integer.MIN_VALUE;
                obj = dVar.f7366l;
                aVar2 = D2.a.f2163d;
                i2 = dVar.f7368n;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    boolean z4 = this.f3990s;
                    e eVar2 = (z4 && z4) ? (e) AbstractC1065f.k(this) : null;
                    if (eVar2 == null) {
                        eVar = this;
                        j5 = j4;
                        j6 = 0;
                        z zVar = eVar.f7369t;
                        o.d(j5, j6);
                        dVar.f7364j = null;
                        dVar.f7365k = j6;
                        dVar.f7368n = 2;
                        obj = new o(0L);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        return new o(o.e(j6, ((o) obj).f3563a));
                    }
                    dVar.f7364j = this;
                    dVar.f7365k = j4;
                    dVar.f7368n = 1;
                    obj = eVar2.E0(j4, dVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    eVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j6 = dVar.f7365k;
                        AbstractC1343r.b(obj);
                        return new o(o.e(j6, ((o) obj).f3563a));
                    }
                    j4 = dVar.f7365k;
                    eVar = dVar.f7364j;
                    AbstractC1343r.b(obj);
                }
                long j7 = j4;
                j6 = ((o) obj).f3563a;
                j5 = j7;
                z zVar2 = eVar.f7369t;
                o.d(j5, j6);
                dVar.f7364j = null;
                dVar.f7365k = j6;
                dVar.f7368n = 2;
                obj = new o(0L);
                if (obj == aVar2) {
                }
                return new o(o.e(j6, ((o) obj).f3563a));
            }
        }
        dVar = new d(this, (E2.c) aVar);
        obj = dVar.f7366l;
        aVar2 = D2.a.f2163d;
        i2 = dVar.f7368n;
        if (i2 != 0) {
        }
        long j72 = j4;
        j6 = ((o) obj).f3563a;
        j5 = j72;
        z zVar22 = eVar.f7369t;
        o.d(j5, j6);
        dVar.f7364j = null;
        dVar.f7365k = j6;
        dVar.f7368n = 2;
        obj = new o(0L);
        if (obj == aVar2) {
        }
        return new o(o.e(j6, ((o) obj).f3563a));
    }

    public final long F0(long j4, int i2) {
        boolean z4 = this.f3990s;
        e eVar = null;
        if (z4 && z4) {
            eVar = (e) AbstractC1065f.k(this);
        }
        long F02 = eVar != null ? eVar.F0(j4, i2) : 0L;
        Y.c.g(j4, F02);
        return Y.c.h(F02, 0L);
    }

    @Override // S.n
    public final void t0() {
        C0097d c0097d = this.f7370u;
        c0097d.f987e = this;
        c0097d.f988i = new A3.e(16, this);
        c0097d.f989j = p0();
    }

    @Override // r0.q0
    public final Object u() {
        return this.f7371v;
    }

    @Override // S.n
    public final void u0() {
        C0097d c0097d = this.f7370u;
        if (((e) c0097d.f987e) == this) {
            c0097d.f987e = null;
        }
    }
}
