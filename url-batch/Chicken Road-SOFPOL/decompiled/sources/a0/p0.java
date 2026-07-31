package a0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f131h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f132j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj, g6.c cVar, int i) {
        super(2, cVar);
        this.f131h = i;
        this.f132j = obj;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f131h) {
            case 0:
                return ((p0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case 1:
                return ((p0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((p0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return ((p0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return ((p0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case 5:
                return ((p0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case 6:
                return ((p0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((p0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            default:
                p0 p0Var = (p0) l((g6.c) obj2, (u.l0) obj);
                c6.m mVar = c6.m.f1757a;
                p0Var.p(mVar);
                return mVar;
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f131h) {
            case 0:
                return new p0((a0) this.f132j, cVar, 0);
            case 1:
                return new p0((m0.z0) this.f132j, cVar, 1);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new p0((b6.w) this.f132j, cVar, 2);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return new p0((q1.s) this.f132j, cVar, 3);
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return new p0((r.s0) this.f132j, cVar, 4);
            case 5:
                return new p0((t.x) this.f132j, cVar, 5);
            case 6:
                return new p0((t.c0) this.f132j, cVar, 6);
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new p0((u.i0) this.f132j, cVar, 7);
            default:
                return new p0((z.p) this.f132j, this.i, cVar);
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f131h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    s6.a.K(obj);
                    r.k kVar = (r.k) ((a0) this.f132j).f12f;
                    Float f6 = new Float(0.0f);
                    r.u0 l3 = r.d.l(0.0f, 400.0f, new Float(0.5f), 1);
                    this.i = 1;
                    Object e8 = r.d.e(kVar, f6, l3, new j0.l(17), this);
                    h6.a aVar = h6.a.f3204d;
                    if (e8 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            case 1:
                int i8 = this.i;
                if (i8 == 0) {
                    s6.a.K(obj);
                    this.i = 1;
                    Object c8 = a7.x.c(500L, this);
                    h6.a aVar2 = h6.a.f3204d;
                    if (c8 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                ((m0.z0) this.f132j).setValue(Boolean.FALSE);
                return c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                int i9 = this.i;
                c6.m mVar = c6.m.f1757a;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return mVar;
                }
                s6.a.K(obj);
                b6.w wVar = (b6.w) this.f132j;
                this.i = 1;
                Object h8 = b6.x.a(wVar.f1488a).h(new b4.b(new b6.m(2, 0, null), null, 1), this);
                h6.a aVar3 = h6.a.f3204d;
                if (h8 != aVar3) {
                    h8 = mVar;
                }
                return h8 == aVar3 ? aVar3 : mVar;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                q1.s sVar = (q1.s) this.f132j;
                int i10 = this.i;
                if (i10 == 0) {
                    s6.a.K(obj);
                    PointerInputEventHandler pointerInputEventHandler = sVar.f6030t;
                    this.i = 2;
                    Object invoke = pointerInputEventHandler.invoke(sVar, this);
                    h6.a aVar4 = h6.a.f3204d;
                    if (invoke == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i10 != 1 && i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                int i11 = this.i;
                if (i11 == 0) {
                    s6.a.K(obj);
                    r.s0 s0Var = (r.s0) this.f132j;
                    this.i = 1;
                    Object h9 = r.s0.h(s0Var, this);
                    h6.a aVar5 = h6.a.f3204d;
                    if (h9 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            case 5:
                t.x xVar = (t.x) this.f132j;
                int i12 = this.i;
                if (i12 == 0) {
                    s6.a.K(obj);
                    q6.q qVar = new q6.q();
                    q6.q qVar2 = new q6.q();
                    q6.q qVar3 = new q6.q();
                    d7.f a8 = xVar.f6885r.a();
                    e7.j jVar = new e7.j(qVar, qVar2, qVar3, xVar, 1);
                    this.i = 1;
                    Object c9 = a8.c(jVar, this);
                    h6.a aVar6 = h6.a.f3204d;
                    if (c9 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            case 6:
                int i13 = this.i;
                if (i13 == 0) {
                    s6.a.K(obj);
                    t.c0 c0Var = (t.c0) this.f132j;
                    this.i = 1;
                    Object g3 = s6.a.g(c0Var, null, this);
                    h6.a aVar7 = h6.a.f3204d;
                    if (g3 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                int i14 = this.i;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return obj;
                }
                s6.a.K(obj);
                c7.c cVar = (c7.c) ((u.i0) this.f132j).f7020f;
                this.i = 1;
                Object b8 = a7.x.b(new b0.d(cVar, (g6.c) null, 11), this);
                h6.a aVar8 = h6.a.f3204d;
                return b8 == aVar8 ? aVar8 : b8;
            default:
                s6.a.K(obj);
                z.p pVar = (z.p) this.f132j;
                int i15 = this.i;
                i0.h hVar = pVar.f9081e;
                if (((m0.e1) hVar.f3283b).g() != i15 || ((m0.e1) hVar.f3284c).g() != 0) {
                    androidx.compose.foundation.lazy.layout.b bVar = pVar.f9089n;
                    bVar.c();
                    bVar.f514b = null;
                }
                hVar.b(i15, 0);
                hVar.f3285d = null;
                w1.f0 f0Var = pVar.f9086k;
                if (f0Var != null) {
                    f0Var.k();
                }
                return c6.m.f1757a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(z.p pVar, int i, g6.c cVar) {
        super(2, cVar);
        this.f131h = 8;
        this.f132j = pVar;
        this.i = i;
    }
}
