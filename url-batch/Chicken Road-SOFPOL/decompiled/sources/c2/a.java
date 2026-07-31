package c2;

import a0.d0;
import a7.u;
import a7.x;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import c6.m;
import d7.e0;
import d7.g0;
import d7.h0;
import d7.j0;
import d7.k0;
import d7.n0;
import d7.r;
import d7.s;
import d7.z;
import e7.v;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import m0.d1;
import m0.h1;
import m0.r2;
import m0.v1;
import m0.z0;
import q6.p;
import r.b0;
import r.c0;
import r.l1;
import r.m0;
import r.q1;
import r.s0;
import r.u0;
import u.e1;
import x1.k1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1575h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1576j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f1577k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1578l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1579m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Object obj3, g6.c cVar, int i) {
        super(2, cVar);
        this.f1575h = i;
        this.f1577k = obj;
        this.f1578l = obj2;
        this.f1579m = obj3;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1575h) {
            case 0:
                return ((a) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 1:
                return ((a) l((g6.c) obj2, (g0) obj)).p(m.f1757a);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((a) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return ((a) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return ((a) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            case 5:
                ((a) l((g6.c) obj2, (u) obj)).p(m.f1757a);
                return h6.a.f3204d;
            default:
                return ((a) l((g6.c) obj2, (u) obj)).p(m.f1757a);
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f1575h) {
            case 0:
                return new a((e) this.f1576j, (ScrollCaptureSession) this.f1577k, (Rect) this.f1578l, (Consumer) this.f1579m, cVar, 0);
            case 1:
                a aVar = new a((d7.f) this.f1577k, (n0) this.f1578l, (Float) this.f1579m, cVar, 1);
                aVar.f1576j = obj;
                return aVar;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new a((k0) this.f1576j, (d7.f) this.f1577k, (n0) this.f1578l, (Float) this.f1579m, cVar, 2);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                a aVar2 = new a((s0) this.f1577k, (o4.d) this.f1578l, (l1) this.f1579m, cVar, 3);
                aVar2.f1576j = obj;
                return aVar2;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return new a(this.f1576j, (r.c) this.f1577k, (z0) this.f1578l, (z0) this.f1579m, cVar, 4);
            case 5:
                a aVar3 = new a((z0) this.f1578l, (c0) this.f1579m, cVar);
                aVar3.f1577k = obj;
                return aVar3;
            default:
                a aVar4 = new a((u.g) this.f1577k, (u.l1) this.f1578l, (u.c) this.f1579m, cVar, 6);
                aVar4.f1576j = obj;
                return aVar4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x023c, code lost:
    
        if (d7.e0.h(r2, r3, r25) == r10) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        if (m0.b.o(f()).d(r12, r25) == r10) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r16 = r0;
     */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        Object a8;
        Object obj2;
        u uVar;
        p pVar;
        u uVar2;
        int i = this.f1575h;
        int i8 = 3;
        m mVar = m.f1757a;
        Object obj3 = this.f1579m;
        Object obj4 = this.f1578l;
        h6.a aVar = h6.a.f3204d;
        int i9 = 1;
        switch (i) {
            case 0:
                int i10 = this.i;
                if (i10 == 0) {
                    s6.a.K(obj);
                    e eVar = (e) this.f1576j;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.f1577k;
                    Rect rect = (Rect) obj4;
                    r2.j jVar = new r2.j(rect.left, rect.top, rect.right, rect.bottom);
                    this.i = 1;
                    a8 = e.a(eVar, scrollCaptureSession, jVar, this);
                    if (a8 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    a8 = obj;
                }
                ((Consumer) obj3).accept(f1.p.t((r2.j) a8));
                return mVar;
            case 1:
                n0 n0Var = (n0) obj4;
                int i11 = this.i;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return mVar;
                }
                s6.a.K(obj);
                int ordinal = ((g0) this.f1576j).ordinal();
                if (ordinal == 0) {
                    d7.f fVar = (d7.f) this.f1577k;
                    this.i = 1;
                    return fVar.c(n0Var, this) == aVar ? aVar : mVar;
                }
                if (ordinal == 1) {
                    return mVar;
                }
                if (ordinal != 2) {
                    throw new a5.c();
                }
                Float f6 = (Float) obj3;
                if (f6 == e0.f2355a) {
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                n0Var.j(null, f6);
                return mVar;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                d7.f fVar2 = (d7.f) this.f1577k;
                n0 n0Var2 = (n0) obj4;
                int i12 = this.i;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            s6.a.K(obj);
                        } else if (i12 != 3 && i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    s6.a.K(obj);
                    return mVar;
                }
                s6.a.K(obj);
                k0 k0Var = (k0) this.f1576j;
                if (k0Var == h0.f2369a) {
                    this.i = 1;
                    if (fVar2.c(n0Var2, this) != aVar) {
                        return mVar;
                    }
                } else {
                    g6.c cVar = null;
                    if (k0Var == h0.f2370b) {
                        v h8 = n0Var2.h();
                        d7.v vVar = new d7.v(2, null);
                        this.i = 2;
                        break;
                    } else {
                        v h9 = n0Var2.h();
                        j0 j0Var = new j0(k0Var, null);
                        int i13 = s.f2419a;
                        g6.i iVar = g6.i.f3046d;
                        c7.a aVar2 = c7.a.f1760d;
                        d7.f f8 = e0.f(e0.f(new d7.m(new e7.k(j0Var, h9, iVar, -2, aVar2), new b6.m(2, i9, cVar))));
                        a aVar3 = new a(fVar2, n0Var2, (Float) obj3, cVar, 1);
                        this.i = 4;
                        Object c8 = e0.e(new e7.k(new r(aVar3, null), f8, iVar, -2, aVar2), 0).c(e7.p.f2567d, this);
                        if (c8 != aVar) {
                            c8 = mVar;
                        }
                        if (c8 != aVar) {
                            c8 = mVar;
                        }
                        if (c8 != aVar) {
                            return mVar;
                        }
                    }
                }
                return aVar;
                this.i = 3;
                if (fVar2.c(n0Var2, this) != aVar) {
                    return mVar;
                }
                return aVar;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                o4.d dVar = (o4.d) obj4;
                s0 s0Var = (s0) this.f1577k;
                int i14 = this.i;
                if (i14 != 0) {
                    if (i14 != 1 && i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return mVar;
                }
                s6.a.K(obj);
                u uVar3 = (u) this.f1576j;
                h1 h1Var = s0Var.f6419c;
                d1 d1Var = s0Var.f6424h;
                if (q6.i.a(h1Var.getValue(), dVar)) {
                    long longValue = ((Number) ((l1) obj3).f6356l.getValue()).longValue() / 1000000;
                    float g3 = d1Var.g();
                    q1 m7 = r.d.m((int) (d1Var.g() * longValue), 6, null);
                    b6.c cVar2 = new b6.c(uVar3, s0Var, dVar, i8);
                    this.i = 2;
                    if (r.d.c(g3, 0.0f, m7, cVar2, this, 4) != aVar) {
                        return mVar;
                    }
                } else {
                    this.i = 1;
                    l1 l1Var = s0Var.f6421e;
                    if (l1Var == null || (obj2 = r.h0.a(s0Var.f6426k, new m0(l1Var, s0Var, dVar, (g6.c) null), this)) != aVar) {
                        obj2 = mVar;
                    }
                    if (obj2 != aVar) {
                        return mVar;
                    }
                }
                return aVar;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                r.c cVar3 = (r.c) this.f1577k;
                int i15 = this.i;
                if (i15 == 0) {
                    s6.a.K(obj);
                    if (q6.i.a(this.f1576j, cVar3.f6237e.getValue())) {
                        return mVar;
                    }
                    r.c cVar4 = (r.c) this.f1577k;
                    Object obj5 = this.f1576j;
                    u0 u0Var = r.f.f6289a;
                    r.j jVar2 = (r.j) ((z0) obj4).getValue();
                    this.i = 1;
                    if (r.c.c(cVar4, obj5, jVar2, null, this, 12) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                u0 u0Var2 = r.f.f6289a;
                p6.c cVar5 = (p6.c) ((z0) obj3).getValue();
                if (cVar5 == null) {
                    return mVar;
                }
                cVar5.i(cVar3.d());
                return mVar;
            case 5:
                int i16 = this.i;
                if (i16 == 0) {
                    s6.a.K(obj);
                    u uVar4 = (u) this.f1577k;
                    p pVar2 = new p();
                    pVar2.f6202d = 1.0f;
                    uVar = uVar4;
                    pVar = pVar2;
                } else if (i16 == 1) {
                    p pVar3 = (p) this.f1576j;
                    u uVar5 = (u) this.f1577k;
                    s6.a.K(obj);
                    pVar = pVar3;
                    uVar2 = uVar5;
                    if (pVar.f6202d == 0.0f) {
                        z zVar = new z(new r2(new androidx.lifecycle.m0(10, uVar2), null));
                        b0 b0Var = new b0(2, null);
                        this.f1577k = uVar2;
                        this.f1576j = pVar;
                        this.i = 2;
                        if (e0.h(zVar, b0Var, this) != aVar) {
                        }
                        return aVar;
                    }
                    uVar = uVar2;
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p pVar4 = (p) this.f1576j;
                    u uVar6 = (u) this.f1577k;
                    s6.a.K(obj);
                    pVar = pVar4;
                    uVar = uVar6;
                }
                d0 d0Var = new d0((z0) obj4, (c0) obj3, pVar, uVar, 2);
                uVar2 = uVar;
                this.f1577k = uVar2;
                this.f1576j = pVar;
                this.i = 1;
                if (f().l(k1.f8492d) == null) {
                    break;
                } else {
                    throw new ClassCastException();
                }
                break;
            default:
                u.g gVar = (u.g) this.f1577k;
                a0.l lVar = gVar.f6990u;
                int i17 = this.i;
                try {
                    try {
                        if (i17 == 0) {
                            s6.a.K(obj);
                            a7.s0 h10 = x.h(((u) this.f1576j).h());
                            gVar.f6995z = true;
                            e1 e1Var = gVar.f6988s;
                            t.j0 j0Var2 = t.j0.f6794d;
                            v1 v1Var = new v1((u.l1) obj4, gVar, (u.c) obj3, h10, null, 3);
                            this.i = 1;
                            if (e1Var.f(j0Var2, v1Var, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj);
                        }
                        lVar.b();
                        return mVar;
                    } catch (CancellationException e8) {
                        throw e8;
                    }
                } finally {
                    gVar.f6995z = false;
                    lVar.a(null);
                    gVar.f6992w = false;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, g6.c cVar, int i) {
        super(2, cVar);
        this.f1575h = i;
        this.f1576j = obj;
        this.f1577k = obj2;
        this.f1578l = obj3;
        this.f1579m = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z0 z0Var, c0 c0Var, g6.c cVar) {
        super(2, cVar);
        this.f1575h = 5;
        this.f1578l = z0Var;
        this.f1579m = c0Var;
    }
}
