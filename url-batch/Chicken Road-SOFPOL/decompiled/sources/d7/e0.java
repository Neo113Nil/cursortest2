package d7;

import a7.b1;
import a7.h1;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d4.t f2355a = new d4.t("NO_VALUE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final d4.t f2356b = new d4.t("NONE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final d4.t f2357c = new d4.t("PENDING", 1);

    public static d0 a(int i) {
        int i8 = (i & 1) != 0 ? 0 : 1;
        int i9 = (i & 2) == 0 ? 16 : 0;
        if (i8 <= 0 && i9 <= 0) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + c7.a.f1761e).toString());
        }
        int i10 = i9 + i8;
        if (i10 < 0) {
            i10 = Integer.MAX_VALUE;
        }
        return new d0(i8, i10);
    }

    public static final n0 b(Object obj) {
        if (obj == null) {
            obj = e7.c.f2544b;
        }
        return new n0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(p0 p0Var, p6.f fVar, Throwable th, i6.c cVar) {
        i iVar;
        int i;
        try {
            if (cVar instanceof i) {
                iVar = (i) cVar;
                int i8 = iVar.i;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    iVar.i = i8 - Integer.MIN_VALUE;
                    Object obj = iVar.f2372h;
                    i = iVar.i;
                    if (i != 0) {
                        s6.a.K(obj);
                        iVar.f2371g = th;
                        iVar.i = 1;
                        Object d8 = fVar.d(p0Var, th, iVar);
                        Object obj2 = h6.a.f3204d;
                        if (d8 == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = iVar.f2371g;
                        s6.a.K(obj);
                    }
                    return c6.m.f1757a;
                }
            }
            if (i != 0) {
            }
            return c6.m.f1757a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                s6.a.e(th2, th);
            }
            throw th2;
        }
        iVar = new i(cVar);
        Object obj3 = iVar.f2372h;
        i = iVar.i;
    }

    public static final void d(Object[] objArr, long j7, Object obj) {
        objArr[((int) j7) & (objArr.length - 1)] = obj;
    }

    public static f e(f fVar, int i) {
        c7.a aVar;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(a0.q.h("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i).toString());
        }
        if (i == -1) {
            i = 0;
            aVar = c7.a.f1761e;
        } else {
            aVar = c7.a.f1760d;
        }
        boolean z3 = fVar instanceof e7.n;
        g6.i iVar = g6.i.f3046d;
        return z3 ? ((e7.n) fVar).b(iVar, i, aVar) : new e7.g(fVar, iVar, i, aVar);
    }

    public static final f f(f fVar) {
        return fVar instanceof l0 ? fVar : fVar instanceof e ? fVar : new e(fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r1.a(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0056, B:20:0x006b, B:22:0x0073, B:32:0x0047, B:35:0x0052), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0085 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(g gVar, c7.q qVar, boolean z3, g6.c cVar) {
        h hVar;
        int i;
        c7.b it;
        c7.b bVar;
        g gVar2;
        Object b8;
        try {
            if (cVar instanceof h) {
                hVar = (h) cVar;
                int i8 = hVar.f2368l;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    hVar.f2368l = i8 - Integer.MIN_VALUE;
                    Object obj = hVar.f2367k;
                    i = hVar.f2368l;
                    CancellationException cancellationException = null;
                    h6.a aVar = h6.a.f3204d;
                    if (i != 0) {
                        s6.a.K(obj);
                        if (gVar instanceof p0) {
                            throw ((p0) gVar).f2411d;
                        }
                        it = qVar.iterator();
                        hVar.f2364g = gVar;
                        hVar.f2365h = qVar;
                        hVar.i = it;
                        hVar.f2366j = z3;
                        hVar.f2368l = 1;
                        b8 = it.b(hVar);
                        if (b8 != aVar) {
                        }
                    } else if (i == 1) {
                        z3 = hVar.f2366j;
                        bVar = hVar.i;
                        qVar = hVar.f2365h;
                        gVar2 = hVar.f2364g;
                        s6.a.K(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = hVar.f2366j;
                        bVar = hVar.i;
                        qVar = hVar.f2365h;
                        gVar2 = hVar.f2364g;
                        s6.a.K(obj);
                        it = bVar;
                        gVar = gVar2;
                        hVar.f2364g = gVar;
                        hVar.f2365h = qVar;
                        hVar.i = it;
                        hVar.f2366j = z3;
                        hVar.f2368l = 1;
                        b8 = it.b(hVar);
                        if (b8 != aVar) {
                            return aVar;
                        }
                        gVar2 = gVar;
                        bVar = it;
                        obj = b8;
                        if (((Boolean) obj).booleanValue()) {
                            if (z3) {
                                qVar.a(null);
                            }
                            return c6.m.f1757a;
                        }
                        Object c8 = bVar.c();
                        hVar.f2364g = gVar2;
                        hVar.f2365h = qVar;
                        hVar.i = bVar;
                        hVar.f2366j = z3;
                        hVar.f2368l = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        hVar = new h(cVar);
        Object obj2 = hVar.f2367k;
        i = hVar.f2368l;
        CancellationException cancellationException2 = null;
        h6.a aVar2 = h6.a.f3204d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(f fVar, p6.e eVar, i6.c cVar) {
        u uVar;
        int i;
        p6.e eVar2;
        q6.s sVar;
        e7.a e8;
        d dVar;
        Object obj;
        d4.t tVar = e7.c.f2544b;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i8 = uVar.f2427k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                uVar.f2427k = i8 - Integer.MIN_VALUE;
                Object obj2 = uVar.f2426j;
                i = uVar.f2427k;
                if (i != 0) {
                    s6.a.K(obj2);
                    q6.s sVar2 = new q6.s();
                    sVar2.f6205d = tVar;
                    d dVar2 = new d(2, eVar, sVar2, false);
                    try {
                        uVar.f2424g = (i6.i) eVar;
                        uVar.f2425h = sVar2;
                        uVar.i = dVar2;
                        uVar.f2427k = 1;
                        Object c8 = fVar.c(dVar2, uVar);
                        Object obj3 = h6.a.f3204d;
                        if (c8 == obj3) {
                            return obj3;
                        }
                        eVar2 = eVar;
                        sVar = sVar2;
                    } catch (e7.a e9) {
                        eVar2 = eVar;
                        sVar = sVar2;
                        e8 = e9;
                        dVar = dVar2;
                        if (e8.f2538d != dVar) {
                        }
                        obj = sVar.f6205d;
                        if (obj == tVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = uVar.i;
                    sVar = uVar.f2425h;
                    eVar2 = (p6.e) uVar.f2424g;
                    try {
                        s6.a.K(obj2);
                    } catch (e7.a e10) {
                        e8 = e10;
                        if (e8.f2538d != dVar) {
                            throw e8;
                        }
                        obj = sVar.f6205d;
                        if (obj == tVar) {
                        }
                    }
                }
                obj = sVar.f6205d;
                if (obj == tVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + eVar2);
            }
        }
        uVar = new u(cVar);
        Object obj22 = uVar.f2426j;
        i = uVar.f2427k;
        if (i != 0) {
        }
        obj = sVar.f6205d;
        if (obj == tVar) {
        }
    }

    public static final f i(a0 a0Var, g6.h hVar, int i, c7.a aVar) {
        return ((i == 0 || i == -3) && aVar == c7.a.f1760d) ? a0Var : new e7.g(a0Var, hVar, i, aVar);
    }

    public static final y j(z zVar, f7.c cVar, k0 k0Var, Float f6) {
        c7.g.f1797a.getClass();
        c7.f fVar = c7.f.f1795a;
        a0.a0 a0Var = new a0.a0(6, zVar, g6.i.f3046d);
        n0 b8 = b(f6);
        g6.h hVar = (g6.h) a0Var.f12f;
        f fVar2 = (f) a0Var.f11e;
        a7.v vVar = k0Var.equals(h0.f2369a) ? a7.v.f303d : a7.v.f306g;
        c2.a aVar = new c2.a(k0Var, fVar2, b8, f6, null, 2);
        g6.h e8 = a7.x.e(cVar.h(), hVar, true);
        h7.e eVar = a7.d0.f249a;
        if (e8 != eVar && e8.l(g6.d.f3045d) == null) {
            e8 = e8.c(eVar);
        }
        a7.a b1Var = vVar == a7.v.f304e ? new b1(e8, aVar) : new h1(e8, true);
        b1Var.h0(vVar, b1Var, aVar);
        return new y(b8);
    }
}
