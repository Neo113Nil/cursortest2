package i0;

import ge.c1;
import ge.u;
import ge.x;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.h1;
import n0.j1;
import v.b0;
import v.h0;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4575d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f4576e;

    /* renamed from: i, reason: collision with root package name */
    public float f4577i;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4578r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4579s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(float f3, h0 h0Var, n4.h hVar, ld.a aVar) {
        super(2, aVar);
        this.f4577i = f3;
        this.f4578r = h0Var;
        this.f4579s = hVar;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f4575d) {
            case 0:
                return new h((b7.h) this.f4578r, this.f4577i, (v.f) this.f4579s, aVar);
            case 1:
                return new h(this.f4577i, (h0) this.f4578r, (n4.h) this.f4579s, aVar);
            default:
                h hVar = new h((z0) this.f4579s, aVar);
                hVar.f4578r = obj;
                return hVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        ld.a aVar = (ld.a) obj2;
        switch (this.f4575d) {
        }
        return ((h) create(xVar, aVar)).invokeSuspend(Unit.f5554a);
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        Object a9;
        final float f3;
        x xVar;
        Function1 function1;
        switch (this.f4575d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f4576e;
                if (i3 == 0) {
                    cf.c.M(obj);
                    v.b bVar = (v.b) ((b7.h) this.f4578r).f1294c;
                    Float f10 = new Float(this.f4577i);
                    v.f fVar = (v.f) this.f4579s;
                    this.f4576e = 1;
                    if (v.b.a(bVar, f10, fVar, this) == aVar) {
                    }
                } else if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                }
                break;
            case 1:
                h0 h0Var = (h0) this.f4578r;
                float f11 = this.f4577i;
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f4576e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    if (f11 > 0.0f) {
                        this.f4576e = 1;
                        if (h0Var.A(f11, h0Var.f9808e.getValue(), this) == aVar2) {
                        }
                    }
                } else if (i10 == 1) {
                    cf.c.M(obj);
                } else if (i10 != 2) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    cf.c.M(obj);
                    break;
                }
                if (f11 == 0.0f) {
                    n4.h hVar = (n4.h) this.f4579s;
                    this.f4576e = 2;
                    z0 z0Var = h0Var.f9811s;
                    if (z0Var == null) {
                        a9 = Unit.f5554a;
                    } else if (Intrinsics.a(h0Var.f9809i.getValue(), hVar) && Intrinsics.a(h0Var.f9808e.getValue(), hVar)) {
                        a9 = Unit.f5554a;
                    } else {
                        a9 = v.x.a(h0Var.f9818z, new b0(h0Var, hVar, z0Var, (ld.a) null), this);
                        if (a9 != aVar2) {
                            a9 = Unit.f5554a;
                        }
                    }
                    if (a9 == aVar2) {
                    }
                }
                break;
            default:
                md.a aVar3 = md.a.f6622d;
                int i11 = this.f4576e;
                if (i11 == 0) {
                    cf.c.M(obj);
                    x xVar2 = (x) this.f4578r;
                    f3 = v.c.f(xVar2.h());
                    xVar = xVar2;
                } else if (i11 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    f3 = this.f4577i;
                    xVar = (x) this.f4578r;
                    cf.c.M(obj);
                }
                do {
                    c1 c1Var = (c1) xVar.h().m(u.f4403e);
                    if (!(c1Var != null ? c1Var.d() : true)) {
                        break;
                    } else {
                        final z0 z0Var2 = (z0) this.f4579s;
                        function1 = new Function1() { // from class: v.x0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                long longValue = ((Long) obj2).longValue();
                                z0 z0Var3 = z0.this;
                                boolean g = z0Var3.g();
                                h1 h1Var = z0Var3.g;
                                if (!g) {
                                    if (h1Var.h() == Long.MIN_VALUE) {
                                        h1Var.i(longValue);
                                        ((j1) z0Var3.f9917a.f1478d).setValue(Boolean.TRUE);
                                    }
                                    long h10 = longValue - h1Var.h();
                                    float f12 = f3;
                                    if (f12 != 0.0f) {
                                        h10 = yd.c.b(h10 / f12);
                                    }
                                    z0Var3.n(h10);
                                    z0Var3.h(f12 == 0.0f, h10);
                                }
                                return Unit.f5554a;
                            }
                        };
                        this.f4578r = xVar;
                        this.f4577i = f3;
                        this.f4576e = 1;
                    }
                } while (n0.h.q(getContext()).s(function1, this) != aVar3);
        }
        return Unit.f5554a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b7.h hVar, float f3, v.f fVar, ld.a aVar) {
        super(2, aVar);
        this.f4578r = hVar;
        this.f4577i = f3;
        this.f4579s = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z0 z0Var, ld.a aVar) {
        super(2, aVar);
        this.f4579s = z0Var;
    }
}
