package je;

import d2.l2;
import d2.r1;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a8.f f5141a = new a8.f("NO_VALUE", 3);

    /* renamed from: b, reason: collision with root package name */
    public static final a8.f f5142b = new a8.f("NONE", 3);

    /* renamed from: c, reason: collision with root package name */
    public static final a8.f f5143c = new a8.f("PENDING", 3);

    public static final a0 a(int i3, int i10, ie.a aVar) {
        if (i3 < 0) {
            a2.r.h(v4.a.j(i3, "replay cannot be negative, but was "));
            return null;
        }
        if (i10 < 0) {
            a2.r.h(v4.a.j(i10, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i3 <= 0 && i10 <= 0 && aVar != ie.a.f4712d) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i11 = i10 + i3;
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        return new a0(i3, i11, aVar);
    }

    public static final l0 b(Object obj) {
        if (obj == null) {
            obj = ke.c.f5511b;
        }
        return new l0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(n0 n0Var, vd.n nVar, Throwable th, nd.c cVar) {
        h hVar;
        int i3;
        try {
            if (cVar instanceof h) {
                hVar = (h) cVar;
                int i10 = hVar.f5169i;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    hVar.f5169i = i10 - Integer.MIN_VALUE;
                    Object obj = hVar.f5168e;
                    Object obj2 = md.a.f6622d;
                    i3 = hVar.f5169i;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        hVar.f5167d = th;
                        hVar.f5169i = 1;
                        if (nVar.a(n0Var, th, hVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i3 != 1) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = hVar.f5167d;
                        cf.c.M(obj);
                    }
                    return Unit.f5554a;
                }
            }
            if (i3 != 0) {
            }
            return Unit.f5554a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                hd.b.a(th2, th);
            }
            throw th2;
        }
        hVar = new h(cVar);
        Object obj3 = hVar.f5168e;
        Object obj22 = md.a.f6622d;
        i3 = hVar.f5169i;
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final w e(l0 l0Var) {
        return new w(l0Var, null);
    }

    public static e f(e eVar, int i3) {
        ie.a aVar = ie.a.f4712d;
        if (i3 < 0 && i3 != -2 && i3 != -1) {
            a2.r.h(v4.a.j(i3, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i3 == -1) {
            aVar = ie.a.f4713e;
            i3 = 0;
        }
        return eVar instanceof ke.n ? ((ke.n) eVar).a(kotlin.coroutines.g.f5592d, i3, aVar) : new ke.h(eVar, kotlin.coroutines.g.f5592d, i3, aVar);
    }

    public static final e g(e eVar) {
        return eVar instanceof j0 ? eVar : eVar instanceof d ? eVar : new d(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r2.b(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0055, B:20:0x006a, B:22:0x0072, B:32:0x0046, B:35:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0084 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(f fVar, ie.g gVar, boolean z10, ld.a aVar) {
        g gVar2;
        int i3;
        ie.b it;
        ie.b bVar;
        f fVar2;
        Object b10;
        try {
            if (aVar instanceof g) {
                gVar2 = (g) aVar;
                int i10 = gVar2.f5162t;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    gVar2.f5162t = i10 - Integer.MIN_VALUE;
                    Object obj = gVar2.f5161s;
                    md.a aVar2 = md.a.f6622d;
                    i3 = gVar2.f5162t;
                    CancellationException cancellationException = null;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        if (fVar instanceof n0) {
                            throw ((n0) fVar).f5209d;
                        }
                        it = gVar.iterator();
                        gVar2.f5157d = fVar;
                        gVar2.f5158e = gVar;
                        gVar2.f5159i = it;
                        gVar2.f5160r = z10;
                        gVar2.f5162t = 1;
                        b10 = it.b(gVar2);
                        if (b10 != aVar2) {
                        }
                    } else if (i3 == 1) {
                        z10 = gVar2.f5160r;
                        bVar = gVar2.f5159i;
                        gVar = gVar2.f5158e;
                        fVar2 = gVar2.f5157d;
                        cf.c.M(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i3 != 2) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z10 = gVar2.f5160r;
                        bVar = gVar2.f5159i;
                        gVar = gVar2.f5158e;
                        fVar2 = gVar2.f5157d;
                        cf.c.M(obj);
                        it = bVar;
                        fVar = fVar2;
                        gVar2.f5157d = fVar;
                        gVar2.f5158e = gVar;
                        gVar2.f5159i = it;
                        gVar2.f5160r = z10;
                        gVar2.f5162t = 1;
                        b10 = it.b(gVar2);
                        if (b10 != aVar2) {
                            return aVar2;
                        }
                        fVar2 = fVar;
                        bVar = it;
                        obj = b10;
                        if (((Boolean) obj).booleanValue()) {
                            if (z10) {
                                gVar.a(null);
                            }
                            return Unit.f5554a;
                        }
                        Object c10 = bVar.c();
                        gVar2.f5157d = fVar2;
                        gVar2.f5158e = gVar;
                        gVar2.f5159i = bVar;
                        gVar2.f5160r = z10;
                        gVar2.f5162t = 2;
                    }
                }
            }
            if (i3 != 0) {
            }
        } finally {
        }
        gVar2 = new g(aVar);
        Object obj2 = gVar2.f5161s;
        md.a aVar22 = md.a.f6622d;
        i3 = gVar2.f5162t;
        CancellationException cancellationException2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(e eVar, Function2 function2, nd.c cVar) {
        t tVar;
        int i3;
        wd.b0 b0Var;
        ke.a e2;
        i0.g gVar;
        Object obj;
        a8.f fVar = ke.c.f5511b;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.f5232r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f5232r = i10 - Integer.MIN_VALUE;
                Object obj2 = tVar.f5231i;
                Object obj3 = md.a.f6622d;
                i3 = tVar.f5232r;
                if (i3 != 0) {
                    cf.c.M(obj2);
                    wd.b0 b0Var2 = new wd.b0();
                    b0Var2.f10141d = fVar;
                    i0.g gVar2 = new i0.g(3, function2, b0Var2);
                    try {
                        tVar.f5229d = b0Var2;
                        tVar.f5230e = gVar2;
                        tVar.f5232r = 1;
                        if (eVar.c(gVar2, tVar) == obj3) {
                            return obj3;
                        }
                        b0Var = b0Var2;
                    } catch (ke.a e9) {
                        b0Var = b0Var2;
                        e2 = e9;
                        gVar = gVar2;
                        if (e2.f5505d == gVar) {
                        }
                    }
                } else {
                    if (i3 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gVar = tVar.f5230e;
                    b0Var = tVar.f5229d;
                    try {
                        cf.c.M(obj2);
                    } catch (ke.a e10) {
                        e2 = e10;
                        if (e2.f5505d == gVar) {
                            throw e2;
                        }
                        ge.a0.j(tVar.getContext());
                        obj = b0Var.f10141d;
                        if (obj != fVar) {
                        }
                    }
                }
                obj = b0Var.f10141d;
                if (obj != fVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate");
            }
        }
        tVar = new t(cVar);
        Object obj22 = tVar.f5231i;
        Object obj32 = md.a.f6622d;
        i3 = tVar.f5232r;
        if (i3 != 0) {
        }
        obj = b0Var.f10141d;
        if (obj != fVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(e eVar, nd.c cVar) {
        u uVar;
        int i3;
        wd.b0 b0Var;
        ke.a e2;
        r1 r1Var;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i10 = uVar.f5236r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.f5236r = i10 - Integer.MIN_VALUE;
                Object obj = uVar.f5235i;
                Object obj2 = md.a.f6622d;
                i3 = uVar.f5236r;
                if (i3 != 0) {
                    cf.c.M(obj);
                    wd.b0 b0Var2 = new wd.b0();
                    r1 r1Var2 = new r1(2, b0Var2);
                    try {
                        uVar.f5233d = b0Var2;
                        uVar.f5234e = r1Var2;
                        uVar.f5236r = 1;
                        if (eVar.c(r1Var2, uVar) == obj2) {
                            return obj2;
                        }
                        b0Var = b0Var2;
                    } catch (ke.a e9) {
                        b0Var = b0Var2;
                        e2 = e9;
                        r1Var = r1Var2;
                        if (e2.f5505d == r1Var) {
                        }
                    }
                } else {
                    if (i3 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r1Var = uVar.f5234e;
                    b0Var = uVar.f5233d;
                    try {
                        cf.c.M(obj);
                    } catch (ke.a e10) {
                        e2 = e10;
                        if (e2.f5505d == r1Var) {
                            throw e2;
                        }
                        ge.a0.j(uVar.getContext());
                        return b0Var.f10141d;
                    }
                }
                return b0Var.f10141d;
            }
        }
        uVar = new u(cVar);
        Object obj3 = uVar.f5235i;
        Object obj22 = md.a.f6622d;
        i3 = uVar.f5236r;
        if (i3 != 0) {
        }
        return b0Var.f10141d;
    }

    public static final w k(x xVar, le.d dVar, i0 i0Var, Float f3) {
        ie.g.f4749m.getClass();
        ie.f fVar = ie.f.f4747a;
        ie.a aVar = ie.a.f4712d;
        c6.c cVar = new c6.c(7, xVar, kotlin.coroutines.g.f5592d);
        l0 b10 = b(f3);
        return new w(b10, ge.a0.r(dVar, (CoroutineContext) cVar.f1810i, i0Var.equals(e0.f5154a) ? ge.y.f4417d : ge.y.f4420r, new l2(i0Var, (e) cVar.f1809e, b10, f3, null, 2)));
    }
}
