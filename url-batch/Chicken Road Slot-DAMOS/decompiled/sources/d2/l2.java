package d2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l2 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3469d;

    /* renamed from: e, reason: collision with root package name */
    public int f3470e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3471i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3472r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f3473s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3474t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(Object obj, Object obj2, Object obj3, Object obj4, ld.a aVar, int i3) {
        super(2, aVar);
        this.f3469d = i3;
        this.f3471i = obj;
        this.f3472r = obj2;
        this.f3473s = obj3;
        this.f3474t = obj4;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f3469d) {
            case 0:
                return new l2((wd.b0) this.f3471i, (n0.z1) this.f3472r, (androidx.lifecycle.u) this.f3473s, (m2) this.f3474t, aVar, 0);
            case 1:
                l2 l2Var = new l2((je.e) this.f3472r, (je.l0) this.f3473s, (Float) this.f3474t, aVar, 1);
                l2Var.f3471i = obj;
                return l2Var;
            case 2:
                return new l2((je.i0) this.f3471i, (je.e) this.f3472r, (je.l0) this.f3473s, (Float) this.f3474t, aVar, 2);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                l2 l2Var2 = new l2((v.h0) this.f3472r, (n4.h) this.f3473s, (v.z0) this.f3474t, aVar, 3);
                l2Var2.f3471i = obj;
                return l2Var2;
            default:
                l2 l2Var3 = new l2((z4.u) this.f3472r, (ge.h) this.f3473s, (a3.t) this.f3474t, aVar, 4);
                l2Var3.f3471i = obj;
                return l2Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3469d) {
        }
        return ((l2) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (r0 == r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        if (r0 == r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0192, code lost:
    
        if (r10.c(r11, r23) == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0170, code lost:
    
        if (r10.c(r11, r23) == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
    
        if (je.b0.i(r2, r3, r23) == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f2, code lost:
    
        if (r1 == r0) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a9;
        Object B;
        ld.a aVar;
        int i3 = this.f3469d;
        int i10 = 2;
        Object obj2 = this.f3474t;
        Object obj3 = this.f3473s;
        Object obj4 = this.f3472r;
        switch (i3) {
            case 0:
                m2 m2Var = (m2) obj2;
                androidx.lifecycle.u uVar = (androidx.lifecycle.u) obj3;
                n0.z1 z1Var = (n0.z1) obj4;
                Object obj5 = md.a.f6622d;
                int i11 = this.f3470e;
                try {
                    if (i11 == 0) {
                        cf.c.M(obj);
                        s1 s1Var = (s1) ((wd.b0) this.f3471i).f10141d;
                        if (s1Var != null) {
                            s1Var.f3532e = ge.a0.b(z1Var.f6895w);
                        }
                        this.f3470e = 1;
                        Object B2 = ge.a0.B(z1Var.f6875a, new n0.w1(z1Var, new n0.y1(z1Var, null), n0.h.q(getContext()), (ld.a) null), this);
                        if (B2 != obj5) {
                            B2 = Unit.f5554a;
                        }
                        if (B2 != obj5) {
                            B2 = Unit.f5554a;
                        }
                        if (B2 == obj5) {
                            return obj5;
                        }
                    } else {
                        if (i11 != 1) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        cf.c.M(obj);
                    }
                    uVar.g().f(m2Var);
                    return Unit.f5554a;
                } catch (Throwable th) {
                    uVar.g().f(m2Var);
                    throw th;
                }
            case 1:
                je.l0 l0Var = (je.l0) obj3;
                je.d0 d0Var = (je.d0) this.f3471i;
                md.a aVar2 = md.a.f6622d;
                int i12 = this.f3470e;
                if (i12 == 0) {
                    cf.c.M(obj);
                    int ordinal = d0Var.ordinal();
                    if (ordinal == 0) {
                        this.f3471i = null;
                        this.f3470e = 1;
                        if (((je.e) obj4).c(l0Var, this) == aVar2) {
                            return aVar2;
                        }
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            a2.r.p();
                            return null;
                        }
                        Float f3 = (Float) obj2;
                        if (f3 == je.b0.f5141a) {
                            a2.r.r("MutableStateFlow.resetReplayCache is not supported");
                            return null;
                        }
                        l0Var.k(null, f3);
                    }
                } else {
                    if (i12 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 2:
                je.e eVar = (je.e) obj4;
                je.l0 l0Var2 = (je.l0) obj3;
                md.a aVar3 = md.a.f6622d;
                int i13 = this.f3470e;
                if (i13 == 0) {
                    cf.c.M(obj);
                    je.i0 i0Var = (je.i0) this.f3471i;
                    if (i0Var != je.e0.f5154a) {
                        int i14 = 0;
                        ld.a aVar4 = null;
                        if (i0Var != je.e0.f5155b) {
                            ke.v h10 = l0Var2.h();
                            je.g0 g0Var = new je.g0(i0Var, null);
                            int i15 = je.r.f5224a;
                            kotlin.coroutines.g gVar = kotlin.coroutines.g.f5592d;
                            ie.a aVar5 = ie.a.f4712d;
                            je.e g = je.b0.g(je.b0.g(new je.j(new ke.l(g0Var, h10, gVar, -2, aVar5), new je.h0(i10, i14, aVar4))));
                            l2 l2Var = new l2(eVar, l0Var2, (Float) obj2, aVar4, 1);
                            this.f3470e = 4;
                            Object c10 = je.b0.f(new ke.l(new je.q(l2Var, null), g, gVar, -2, aVar5), 0).c(ke.p.f5541d, this);
                            if (c10 != aVar3) {
                                c10 = Unit.f5554a;
                            }
                            if (c10 != aVar3) {
                                c10 = Unit.f5554a;
                                break;
                            }
                        } else {
                            ke.v h11 = l0Var2.h();
                            je.v vVar = new je.v(2, 0, null);
                            this.f3470e = 2;
                            break;
                        }
                    } else {
                        this.f3470e = 1;
                        break;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            cf.c.M(obj);
                            this.f3470e = 3;
                            break;
                        } else if (i13 != 3 && i13 != 4) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    cf.c.M(obj);
                    return Unit.f5554a;
                }
                return aVar3;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                n4.h hVar = (n4.h) obj3;
                v.h0 h0Var = (v.h0) obj4;
                Object obj6 = md.a.f6622d;
                int i16 = this.f3470e;
                if (i16 == 0) {
                    cf.c.M(obj);
                    ge.x xVar = (ge.x) this.f3471i;
                    n0.j1 j1Var = h0Var.f9809i;
                    n0.f1 f1Var = h0Var.f9815w;
                    if (!Intrinsics.a(j1Var.getValue(), hVar)) {
                        this.f3470e = 1;
                        v.z0 z0Var = h0Var.f9811s;
                        if (z0Var != null) {
                            a9 = v.x.a(h0Var.f9818z, new v.b0(z0Var, h0Var, hVar, (ld.a) null), this);
                            if (a9 != obj6) {
                                a9 = Unit.f5554a;
                                break;
                            }
                        } else {
                            a9 = Unit.f5554a;
                            break;
                        }
                    } else {
                        long longValue = ((Number) ((v.z0) obj2).f9926l.getValue()).longValue() / 1000000;
                        float h12 = f1Var.h();
                        v.a1 h13 = v.c.h((int) (f1Var.h() * longValue), 6, null);
                        n9.l lVar = new n9.l(xVar, h0Var, hVar);
                        this.f3470e = 2;
                        c6.s sVar = v.c.f9754k;
                        Float f10 = new Float(h12);
                        Float f11 = new Float(0.0f);
                        Float f12 = new Float(0.0f);
                        Function1 function1 = (Function1) sVar.f1868d;
                        v.l lVar2 = (v.l) function1.invoke(f12);
                        if (lVar2 == null) {
                            lVar2 = ((v.l) function1.invoke(f10)).c();
                        }
                        v.l lVar3 = lVar2;
                        Object a10 = v.c.a(new v.g(f10, lVar3, 56), new v.q0(h13, sVar, f10, f11, lVar3), Long.MIN_VALUE, new a1.d(19, lVar), this);
                        if (a10 != obj6) {
                            a10 = Unit.f5554a;
                        }
                        if (a10 != obj6) {
                            a10 = Unit.f5554a;
                            break;
                        }
                    }
                } else {
                    if (i16 != 1 && i16 != 2) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            default:
                md.a aVar6 = md.a.f6622d;
                int i17 = this.f3470e;
                if (i17 == 0) {
                    cf.c.M(obj);
                    CoroutineContext.Element m10 = ((ge.x) this.f3471i).h().m(kotlin.coroutines.d.f5591n);
                    m10.getClass();
                    kotlin.coroutines.d dVar = (kotlin.coroutines.d) m10;
                    CoroutineContext c11 = kotlin.coroutines.e.c((kotlin.coroutines.a) dVar, new z4.c0(dVar));
                    CoroutineContext p4 = c11.p(new le.w(c11, ((z4.u) obj4).f10841i));
                    ge.h hVar2 = (ge.h) obj3;
                    hd.l lVar4 = hd.n.f4511e;
                    this.f3471i = hVar2;
                    this.f3470e = 1;
                    B = ge.a0.B(p4, (a3.t) obj2, this);
                    if (B == aVar6) {
                        return aVar6;
                    }
                    aVar = hVar2;
                } else {
                    if (i17 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (ld.a) this.f3471i;
                    cf.c.M(obj);
                    B = obj;
                }
                hd.l lVar5 = hd.n.f4511e;
                aVar.resumeWith(B);
                return Unit.f5554a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(Object obj, Object obj2, Object obj3, ld.a aVar, int i3) {
        super(2, aVar);
        this.f3469d = i3;
        this.f3472r = obj;
        this.f3473s = obj2;
        this.f3474t = obj3;
    }
}
