package f7;

import c7.g1;
import c7.m1;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h7.s f3469a = new h7.s("NO_VALUE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final h7.s f3470b = new h7.s("NONE", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final h7.s f3471c = new h7.s("PENDING", 0);

    public static final e0 a(int i7, int i8, e7.a aVar) {
        if (i7 < 0) {
            throw new IllegalArgumentException(a0.m.i("replay cannot be negative, but was ", i7).toString());
        }
        if (i8 < 0) {
            throw new IllegalArgumentException(a0.m.i("extraBufferCapacity cannot be negative, but was ", i8).toString());
        }
        if (i7 <= 0 && i8 <= 0 && aVar != e7.a.f2833f) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i9 = i8 + i7;
        if (i9 < 0) {
            i9 = Integer.MAX_VALUE;
        }
        return new e0(i7, i9, aVar);
    }

    public static final q0 c(Object obj) {
        if (obj == null) {
            obj = g7.c.f4481b;
        }
        return new q0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(s0 s0Var, q6.f fVar, Throwable th, j6.c cVar) {
        i iVar;
        int i7;
        try {
            if (cVar instanceof i) {
                iVar = (i) cVar;
                int i8 = iVar.f3486h;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    iVar.f3486h = i8 - Integer.MIN_VALUE;
                    Object obj = iVar.f3485g;
                    i7 = iVar.f3486h;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        iVar.f3484f = th;
                        iVar.f3486h = 1;
                        Object c4 = fVar.c(s0Var, th, iVar);
                        Object obj2 = i6.a.f4956f;
                        if (c4 == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = iVar.f3484f;
                        d6.a.e(obj);
                    }
                    return d6.z.f2639a;
                }
            }
            if (i7 != 0) {
            }
            return d6.z.f2639a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                d6.a.a(th2, th);
            }
            throw th2;
        }
        iVar = new i(cVar);
        Object obj3 = iVar.f3485g;
        i7 = iVar.f3486h;
    }

    public static final void e(Object[] objArr, long j8, Object obj) {
        objArr[((int) j8) & (objArr.length - 1)] = obj;
    }

    public static f f(f fVar, int i7) {
        e7.a aVar;
        if (i7 < 0 && i7 != -2 && i7 != -1) {
            throw new IllegalArgumentException(a0.m.i("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i7).toString());
        }
        if (i7 == -1) {
            i7 = 0;
            aVar = e7.a.f2834g;
        } else {
            aVar = e7.a.f2833f;
        }
        boolean z8 = fVar instanceof g7.s;
        h6.j jVar = h6.j.f4661f;
        return z8 ? ((g7.s) fVar).a(jVar, i7, aVar) : new g7.g(i7, aVar, fVar, jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r5 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final i0 g(f fVar, int i7) {
        e7.i.f2878a.getClass();
        int i8 = e7.h.f2877b;
        if (i7 >= i8) {
            i8 = i7;
        }
        int i9 = i8 - i7;
        boolean z8 = fVar instanceof g7.e;
        e7.a aVar = e7.a.f2833f;
        if (z8) {
            g7.e eVar = (g7.e) fVar;
            e7.a aVar2 = eVar.f4485h;
            f f9 = eVar.f();
            if (f9 != null) {
                int i10 = eVar.f4484g;
                if (i10 != -3 && i10 != -2 && i10 != 0) {
                    i9 = i10;
                } else if (aVar2 != aVar) {
                    if (i7 == 0) {
                        i9 = 1;
                    }
                    i9 = 0;
                }
                return new i0(i9, aVar2, f9, eVar.f4483f);
            }
        }
        return new i0(i9, aVar, fVar, h6.j.f4661f);
    }

    public static final f h(f fVar) {
        return fVar instanceof o0 ? fVar : fVar instanceof e ? fVar : new e(fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r1.k(r10, r0) == r5) goto L33;
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
    public static final Object i(g gVar, e7.t tVar, boolean z8, h6.d dVar) {
        h hVar;
        int i7;
        e7.b it;
        e7.b bVar;
        g gVar2;
        Object b9;
        try {
            if (dVar instanceof h) {
                hVar = (h) dVar;
                int i8 = hVar.f3479k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    hVar.f3479k = i8 - Integer.MIN_VALUE;
                    Object obj = hVar.f3478j;
                    i7 = hVar.f3479k;
                    CancellationException cancellationException = null;
                    i6.a aVar = i6.a.f4956f;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        if (gVar instanceof s0) {
                            throw ((s0) gVar).f3555f;
                        }
                        it = tVar.iterator();
                        hVar.f3474f = gVar;
                        hVar.f3475g = tVar;
                        hVar.f3476h = it;
                        hVar.f3477i = z8;
                        hVar.f3479k = 1;
                        b9 = it.b(hVar);
                        if (b9 != aVar) {
                        }
                    } else if (i7 == 1) {
                        z8 = hVar.f3477i;
                        bVar = hVar.f3476h;
                        tVar = hVar.f3475g;
                        gVar2 = hVar.f3474f;
                        d6.a.e(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z8 = hVar.f3477i;
                        bVar = hVar.f3476h;
                        tVar = hVar.f3475g;
                        gVar2 = hVar.f3474f;
                        d6.a.e(obj);
                        it = bVar;
                        gVar = gVar2;
                        hVar.f3474f = gVar;
                        hVar.f3475g = tVar;
                        hVar.f3476h = it;
                        hVar.f3477i = z8;
                        hVar.f3479k = 1;
                        b9 = it.b(hVar);
                        if (b9 != aVar) {
                            return aVar;
                        }
                        gVar2 = gVar;
                        bVar = it;
                        obj = b9;
                        if (((Boolean) obj).booleanValue()) {
                            if (z8) {
                                tVar.c(null);
                            }
                            return d6.z.f2639a;
                        }
                        Object c4 = bVar.c();
                        hVar.f3474f = gVar2;
                        hVar.f3475g = tVar;
                        hVar.f3476h = bVar;
                        hVar.f3477i = z8;
                        hVar.f3479k = 2;
                    }
                }
            }
            if (i7 != 0) {
            }
        } finally {
        }
        hVar = new h(dVar);
        Object obj2 = hVar.f3478j;
        i7 = hVar.f3479k;
        CancellationException cancellationException2 = null;
        i6.a aVar2 = i6.a.f4956f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(f fVar, j6.c cVar) {
        s sVar;
        int i7;
        r6.v vVar;
        g7.a e9;
        d0.y yVar;
        Object obj;
        h7.s sVar2 = g7.c.f4481b;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i8 = sVar.f3554i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                sVar.f3554i = i8 - Integer.MIN_VALUE;
                Object obj2 = sVar.f3553h;
                i7 = sVar.f3554i;
                if (i7 != 0) {
                    d6.a.e(obj2);
                    r6.v vVar2 = new r6.v();
                    vVar2.f7968f = sVar2;
                    d0.y yVar2 = new d0.y(1, vVar2);
                    try {
                        sVar.f3551f = vVar2;
                        sVar.f3552g = yVar2;
                        sVar.f3554i = 1;
                        Object b9 = fVar.b(yVar2, sVar);
                        Object obj3 = i6.a.f4956f;
                        if (b9 == obj3) {
                            return obj3;
                        }
                        vVar = vVar2;
                    } catch (g7.a e10) {
                        vVar = vVar2;
                        e9 = e10;
                        yVar = yVar2;
                        if (e9.f4475f != yVar) {
                            throw e9;
                        }
                        obj = vVar.f7968f;
                        if (obj == sVar2) {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = sVar.f3552g;
                    vVar = sVar.f3551f;
                    try {
                        d6.a.e(obj2);
                    } catch (g7.a e11) {
                        e9 = e11;
                        if (e9.f4475f != yVar) {
                        }
                        obj = vVar.f7968f;
                        if (obj == sVar2) {
                        }
                    }
                }
                obj = vVar.f7968f;
                if (obj == sVar2) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        sVar = new s(cVar);
        Object obj22 = sVar.f3553h;
        i7 = sVar.f3554i;
        if (i7 != 0) {
        }
        obj = vVar.f7968f;
        if (obj == sVar2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(f fVar, q6.e eVar, j6.c cVar) {
        t tVar;
        int i7;
        q6.e eVar2;
        r6.v vVar;
        g7.a e9;
        a0.l0 l0Var;
        Object obj;
        h7.s sVar = g7.c.f4481b;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i8 = tVar.f3560j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                tVar.f3560j = i8 - Integer.MIN_VALUE;
                Object obj2 = tVar.f3559i;
                i7 = tVar.f3560j;
                if (i7 != 0) {
                    d6.a.e(obj2);
                    r6.v vVar2 = new r6.v();
                    vVar2.f7968f = sVar;
                    a0.l0 l0Var2 = new a0.l0(eVar, 6, vVar2);
                    try {
                        tVar.f3556f = (j6.i) eVar;
                        tVar.f3557g = vVar2;
                        tVar.f3558h = l0Var2;
                        tVar.f3560j = 1;
                        Object b9 = fVar.b(l0Var2, tVar);
                        Object obj3 = i6.a.f4956f;
                        if (b9 == obj3) {
                            return obj3;
                        }
                        eVar2 = eVar;
                        vVar = vVar2;
                    } catch (g7.a e10) {
                        eVar2 = eVar;
                        vVar = vVar2;
                        e9 = e10;
                        l0Var = l0Var2;
                        if (e9.f4475f != l0Var) {
                            throw e9;
                        }
                        obj = vVar.f7968f;
                        if (obj == sVar) {
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l0Var = tVar.f3558h;
                    vVar = tVar.f3557g;
                    eVar2 = (q6.e) tVar.f3556f;
                    try {
                        d6.a.e(obj2);
                    } catch (g7.a e11) {
                        e9 = e11;
                        if (e9.f4475f != l0Var) {
                        }
                        obj = vVar.f7968f;
                        if (obj == sVar) {
                        }
                    }
                }
                obj = vVar.f7968f;
                if (obj == sVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + eVar2);
            }
        }
        tVar = new t(cVar);
        Object obj22 = tVar.f3559i;
        i7 = tVar.f3560j;
        if (i7 != 0) {
        }
        obj = vVar.f7968f;
        if (obj == sVar) {
        }
    }

    public static final f l(b0 b0Var, h6.i iVar, int i7, e7.a aVar) {
        return ((i7 == 0 || i7 == -3) && aVar == e7.a.f2833f) ? b0Var : new g7.g(i7, aVar, b0Var, iVar);
    }

    public static final z m(f fVar, c7.x xVar, n0 n0Var, Object obj) {
        i0 g9 = g(fVar, 1);
        q0 c4 = c(obj);
        h6.i iVar = (h6.i) g9.f3490d;
        f fVar2 = (f) g9.f3488b;
        c7.y yVar = n0Var.equals(j0.f3496a) ? c7.y.f1756f : c7.y.f1759i;
        androidx.lifecycle.g0 g0Var = new androidx.lifecycle.g0(n0Var, fVar2, c4, obj, (h6.d) null);
        h6.i g10 = c7.a0.g(xVar.k(), iVar, true);
        j7.e eVar = c7.g0.f1696a;
        if (g10 != eVar && g10.u(h6.e.f4660f) == null) {
            g10 = g10.z(eVar);
        }
        c7.a g1Var = yVar == c7.y.f1757g ? new g1(g10, g0Var) : new m1(g10, true);
        g1Var.f0(yVar, g1Var, g0Var);
        return new z(c4);
    }
}
