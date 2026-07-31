package y3;

import a7.h1;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b0 implements f {

    /* renamed from: d, reason: collision with root package name */
    public final e0 f8840d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.u f8841e;

    /* renamed from: f, reason: collision with root package name */
    public final d7.z f8842f;

    /* renamed from: h, reason: collision with root package name */
    public int f8844h;
    public h1 i;

    /* renamed from: k, reason: collision with root package name */
    public final c5.x f8846k;

    /* renamed from: l, reason: collision with root package name */
    public final c6.k f8847l;

    /* renamed from: m, reason: collision with root package name */
    public final c6.k f8848m;

    /* renamed from: n, reason: collision with root package name */
    public final c5.x f8849n;

    /* renamed from: g, reason: collision with root package name */
    public final i7.c f8843g = new i7.c();

    /* renamed from: j, reason: collision with root package name */
    public final q3.k f8845j = new q3.k(17);

    public b0(e0 e0Var, List list, p.b bVar, a7.u uVar) {
        this.f8840d = e0Var;
        this.f8841e = uVar;
        g6.c cVar = null;
        this.f8842f = new d7.z(new b0.c(this, cVar, 17));
        c5.x xVar = new c5.x();
        xVar.f1740g = this;
        xVar.f1737d = new i7.c();
        a7.m mVar = new a7.m(true);
        mVar.P(null);
        xVar.f1738e = mVar;
        xVar.f1739f = d6.m.g0(list);
        this.f8846k = xVar;
        final int i = 0;
        this.f8847l = a.a.r(new p6.a(this) { // from class: y3.g

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b0 f8868e;

            {
                this.f8868e = this;
            }

            @Override // p6.a
            public final Object b() {
                switch (i) {
                    case 0:
                        e0 e0Var2 = this.f8868e.f8840d;
                        File canonicalFile = ((File) e0Var2.f8862b.b()).getCanonicalFile();
                        synchronized (e0.f8860d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = e0.f8859c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            q6.i.b(absolutePath);
                            linkedHashSet.add(absolutePath);
                        }
                        return new h0(canonicalFile, (r0) e0Var2.f8861a.i(canonicalFile), new androidx.lifecycle.m0(20, canonicalFile));
                    default:
                        return ((h0) this.f8868e.f8847l.getValue()).f8877b;
                }
            }
        });
        final int i8 = 1;
        this.f8848m = a.a.r(new p6.a(this) { // from class: y3.g

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b0 f8868e;

            {
                this.f8868e = this;
            }

            @Override // p6.a
            public final Object b() {
                switch (i8) {
                    case 0:
                        e0 e0Var2 = this.f8868e.f8840d;
                        File canonicalFile = ((File) e0Var2.f8862b.b()).getCanonicalFile();
                        synchronized (e0.f8860d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = e0.f8859c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            q6.i.b(absolutePath);
                            linkedHashSet.add(absolutePath);
                        }
                        return new h0(canonicalFile, (r0) e0Var2.f8861a.i(canonicalFile), new androidx.lifecycle.m0(20, canonicalFile));
                    default:
                        return ((h0) this.f8868e.f8847l.getValue()).f8877b;
                }
            }
        });
        a0.t tVar = new a0.t(27, this);
        g2.v vVar = new g2.v(15);
        b0.d dVar = new b0.d(this, cVar, 19);
        c5.x xVar2 = new c5.x();
        xVar2.f1737d = uVar;
        xVar2.f1738e = dVar;
        xVar2.f1739f = c7.j.a(Integer.MAX_VALUE, null, 6);
        xVar2.f1740g = new q3.k(16);
        a7.s0 s0Var = (a7.s0) uVar.h().l(a7.r.f297e);
        if (s0Var != null) {
            s0Var.w(new b6.c0(tVar, xVar2, vVar, 8));
        }
        this.f8849n = xVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:12:0x0043, B:14:0x004b, B:16:0x004f, B:17:0x0055), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b0 b0Var, i6.c cVar) {
        p pVar;
        int i;
        i7.c cVar2;
        int i8;
        try {
            if (cVar instanceof p) {
                pVar = (p) cVar;
                int i9 = pVar.f8920j;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    pVar.f8920j = i9 - Integer.MIN_VALUE;
                    Object obj = pVar.f8919h;
                    i = pVar.f8920j;
                    if (i != 0) {
                        s6.a.K(obj);
                        i7.c cVar3 = b0Var.f8843g;
                        pVar.f8918g = cVar3;
                        pVar.f8920j = 1;
                        Object d8 = cVar3.d(pVar);
                        h6.a aVar = h6.a.f3204d;
                        if (d8 == aVar) {
                            return aVar;
                        }
                        cVar2 = cVar3;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar2 = pVar.f8918g;
                        s6.a.K(obj);
                    }
                    i8 = b0Var.f8844h - 1;
                    b0Var.f8844h = i8;
                    if (i8 == 0) {
                        h1 h1Var = b0Var.i;
                        if (h1Var != null) {
                            h1Var.a(null);
                        }
                        b0Var.i = null;
                    }
                    cVar2.f(null);
                    return c6.m.f1757a;
                }
            }
            i8 = b0Var.f8844h - 1;
            b0Var.f8844h = i8;
            if (i8 == 0) {
            }
            cVar2.f(null);
            return c6.m.f1757a;
        } catch (Throwable th) {
            cVar2.f(null);
            throw th;
        }
        pVar = new p(b0Var, cVar);
        Object obj2 = pVar.f8919h;
        i = pVar.f8920j;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b0 b0Var, l0 l0Var, i6.c cVar) {
        r rVar;
        int i;
        a7.m mVar;
        g6.h hVar;
        Throwable a8;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i8 = rVar.f8932j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                rVar.f8932j = i8 - Integer.MIN_VALUE;
                Object obj = rVar.f8931h;
                i = rVar.f8932j;
                if (i != 0) {
                    s6.a.K(obj);
                    a7.m mVar2 = l0Var.f8906b;
                    try {
                        hVar = l0Var.f8908d;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        g6.h hVar2 = rVar.f3460e;
                        q6.i.b(hVar2);
                        g6.h c8 = hVar.c(hVar2);
                        b0.d dVar = new b0.d(b0Var, l0Var, null, 17);
                        rVar.f8930g = mVar2;
                        rVar.f8932j = 1;
                        Object u7 = a7.x.u(c8, dVar, rVar);
                        h6.a aVar = h6.a.f3204d;
                        if (u7 == aVar) {
                            return aVar;
                        }
                        obj = u7;
                        mVar = mVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        mVar = mVar2;
                        obj = s6.a.l(th);
                        a8 = c6.i.a(obj);
                        if (a8 != null) {
                        }
                        return c6.m.f1757a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar = rVar.f8930g;
                    try {
                        s6.a.K(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        obj = s6.a.l(th);
                        a8 = c6.i.a(obj);
                        if (a8 != null) {
                        }
                        return c6.m.f1757a;
                    }
                }
                a8 = c6.i.a(obj);
                if (a8 != null) {
                    mVar.S(obj);
                } else {
                    mVar.getClass();
                    mVar.S(new a7.o(a8, false));
                }
                return c6.m.f1757a;
            }
        }
        rVar = new r(b0Var, cVar);
        Object obj2 = rVar.f8931h;
        i = rVar.f8932j;
        if (i != 0) {
        }
        a8 = c6.i.a(obj2);
        if (a8 != null) {
        }
        return c6.m.f1757a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:12:0x0043, B:14:0x004a), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b0 b0Var, i6.c cVar) {
        s sVar;
        int i;
        i7.c cVar2;
        int i8;
        try {
            if (cVar instanceof s) {
                sVar = (s) cVar;
                int i9 = sVar.f8938j;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    sVar.f8938j = i9 - Integer.MIN_VALUE;
                    Object obj = sVar.f8937h;
                    i = sVar.f8938j;
                    if (i != 0) {
                        s6.a.K(obj);
                        i7.c cVar3 = b0Var.f8843g;
                        sVar.f8936g = cVar3;
                        sVar.f8938j = 1;
                        Object d8 = cVar3.d(sVar);
                        h6.a aVar = h6.a.f3204d;
                        if (d8 == aVar) {
                            return aVar;
                        }
                        cVar2 = cVar3;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar2 = sVar.f8936g;
                        s6.a.K(obj);
                    }
                    g6.c cVar4 = null;
                    i8 = b0Var.f8844h + 1;
                    b0Var.f8844h = i8;
                    if (i8 == 1) {
                        b0Var.i = a7.x.n(b0Var.f8841e, null, new l(b0Var, cVar4, 1), 3);
                    }
                    cVar2.f(null);
                    return c6.m.f1757a;
                }
            }
            i8 = b0Var.f8844h + 1;
            b0Var.f8844h = i8;
            if (i8 == 1) {
            }
            cVar2.f(null);
            return c6.m.f1757a;
        } catch (Throwable th) {
            cVar2.f(null);
            throw th;
        }
        sVar = new s(b0Var, cVar);
        Object obj2 = sVar.f8937h;
        i = sVar.f8938j;
        if (i != 0) {
        }
        g6.c cVar42 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r1.p(r0) != r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:
    
        if (r7 == r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(b0 b0Var, i6.c cVar) {
        t tVar;
        int i;
        int intValue;
        int i8;
        Throwable th;
        try {
            if (cVar instanceof t) {
                tVar = (t) cVar;
                int i9 = tVar.f8942j;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    tVar.f8942j = i9 - Integer.MIN_VALUE;
                    Object obj = tVar.f8941h;
                    i = tVar.f8942j;
                    Object obj2 = h6.a.f3204d;
                    if (i != 0) {
                        s6.a.K(obj);
                        r0 g3 = b0Var.g();
                        tVar.f8942j = 1;
                        obj = g3.a();
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i8 = tVar.f8940g;
                            try {
                                s6.a.K(obj);
                                return c6.m.f1757a;
                            } catch (Throwable th2) {
                                th = th2;
                                b0Var.f8845j.s(new n0(th, i8));
                                throw th;
                            }
                        }
                        s6.a.K(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    c5.x xVar = b0Var.f8846k;
                    tVar.f8940g = intValue;
                    tVar.f8942j = 2;
                }
            }
            c5.x xVar2 = b0Var.f8846k;
            tVar.f8940g = intValue;
            tVar.f8942j = 2;
        } catch (Throwable th3) {
            i8 = intValue;
            th = th3;
            b0Var.f8845j.s(new n0(th, i8));
            throw th;
        }
        tVar = new t(b0Var, cVar);
        Object obj3 = tVar.f8941h;
        i = tVar.f8942j;
        Object obj22 = h6.a.f3204d;
        if (i != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008b, code lost:
    
        if (r10 == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r10 == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        if (r10 == r6) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(b0 b0Var, boolean z3, g6.c cVar) {
        u uVar;
        int i;
        s0 i8;
        boolean z7;
        c6.f fVar;
        q3.k kVar = b0Var.f8845j;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i9 = uVar.f8947k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                uVar.f8947k = i9 - Integer.MIN_VALUE;
                Object obj = uVar.i;
                i = uVar.f8947k;
                h6.a aVar = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj);
                    i8 = kVar.i();
                    if (i8 instanceof t0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    r0 g3 = b0Var.g();
                    uVar.f8945h = i8;
                    uVar.f8944g = z3;
                    uVar.f8947k = 1;
                    obj = g3.a();
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            s6.a.K(obj);
                            fVar = (c6.f) obj;
                            s0 s0Var = (s0) fVar.f1747d;
                            if (((Boolean) fVar.f1748e).booleanValue()) {
                            }
                            return s0Var;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s6.a.K(obj);
                        fVar = (c6.f) obj;
                        s0 s0Var2 = (s0) fVar.f1747d;
                        if (((Boolean) fVar.f1748e).booleanValue()) {
                            kVar.s(s0Var2);
                        }
                        return s0Var2;
                    }
                    z3 = uVar.f8944g;
                    i8 = uVar.f8945h;
                    s6.a.K(obj);
                }
                int intValue = ((Number) obj).intValue();
                z7 = i8 instanceof c;
                int i10 = !z7 ? ((c) i8).f8939a : -1;
                if (!z7 && intValue == i10) {
                    return i8;
                }
                g6.c cVar2 = null;
                if (z3) {
                    r0 g7 = b0Var.g();
                    w wVar = new w(b0Var, i10, cVar2, 0);
                    uVar.f8945h = null;
                    uVar.f8947k = 3;
                    obj = g7.c(wVar, uVar);
                } else {
                    r0 g8 = b0Var.g();
                    v vVar = new v(b0Var, cVar2, 0);
                    uVar.f8945h = null;
                    uVar.f8947k = 2;
                    obj = g8.b(vVar, uVar);
                }
                return aVar;
            }
        }
        uVar = new u(b0Var, cVar);
        Object obj2 = uVar.i;
        i = uVar.f8947k;
        h6.a aVar2 = h6.a.f3204d;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z7 = i8 instanceof c;
        if (!z7) {
        }
        if (!z7) {
        }
        g6.c cVar22 = null;
        if (z3) {
        }
        return aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0114, code lost:
    
        if (r10 != r4) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4 A[Catch: b -> 0x0098, TryCatch #2 {b -> 0x0098, blocks: (B:36:0x0093, B:37:0x0117, B:40:0x009d, B:41:0x00fb, B:44:0x00a7, B:45:0x00df, B:48:0x00ad, B:50:0x00c4, B:51:0x00c8, B:57:0x00b6, B:60:0x00eb), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(b0 b0Var, boolean z3, i6.c cVar) {
        x xVar;
        int i;
        Object a8;
        Object obj;
        int i8;
        b bVar;
        q6.q qVar;
        q6.s sVar;
        try {
            if (cVar instanceof x) {
                xVar = (x) cVar;
                int i9 = xVar.f8966n;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    xVar.f8966n = i9 - Integer.MIN_VALUE;
                    Object obj2 = xVar.f8964l;
                    i = xVar.f8966n;
                    g6.c cVar2 = null;
                    Object obj3 = h6.a.f3204d;
                    switch (i) {
                        case 0:
                            s6.a.K(obj2);
                            if (!z3) {
                                r0 g3 = b0Var.g();
                                xVar.f8960g = z3;
                                xVar.f8966n = 3;
                                obj2 = g3.a();
                                if (obj2 == obj3) {
                                }
                                int intValue = ((Number) obj2).intValue();
                                r0 g7 = b0Var.g();
                                p6.e wVar = new w(b0Var, intValue, cVar2, 1);
                                xVar.f8960g = z3;
                                xVar.f8966n = 4;
                                obj2 = g7.c(wVar, xVar);
                                break;
                            } else {
                                xVar.f8960g = z3;
                                xVar.f8966n = 1;
                                obj2 = b0Var.i(xVar);
                                if (obj2 == obj3) {
                                }
                                int hashCode = obj2 != null ? obj2.hashCode() : 0;
                                r0 g8 = b0Var.g();
                                xVar.f8961h = obj2;
                                xVar.f8960g = z3;
                                xVar.f8963k = hashCode;
                                xVar.f8966n = 2;
                                a8 = g8.a();
                                if (a8 == obj3) {
                                    obj = obj2;
                                    obj2 = a8;
                                    i8 = hashCode;
                                    return new c(i8, ((Number) obj2).intValue(), obj);
                                }
                            }
                            return obj3;
                        case 1:
                            z3 = xVar.f8960g;
                            s6.a.K(obj2);
                            if (obj2 != null) {
                            }
                            r0 g82 = b0Var.g();
                            xVar.f8961h = obj2;
                            xVar.f8960g = z3;
                            xVar.f8963k = hashCode;
                            xVar.f8966n = 2;
                            a8 = g82.a();
                            if (a8 == obj3) {
                            }
                            break;
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            i8 = xVar.f8963k;
                            boolean z7 = xVar.f8960g;
                            obj = xVar.f8961h;
                            s6.a.K(obj2);
                            return new c(i8, ((Number) obj2).intValue(), obj);
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            z3 = xVar.f8960g;
                            s6.a.K(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            r0 g72 = b0Var.g();
                            p6.e wVar2 = new w(b0Var, intValue2, cVar2, 1);
                            xVar.f8960g = z3;
                            xVar.f8966n = 4;
                            obj2 = g72.c(wVar2, xVar);
                            break;
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            boolean z8 = xVar.f8960g;
                            s6.a.K(obj2);
                            return (c) obj2;
                        case 5:
                            boolean z9 = xVar.f8960g;
                            q6.s sVar2 = (q6.s) xVar.f8962j;
                            q6.s sVar3 = xVar.i;
                            b bVar2 = (b) xVar.f8961h;
                            s6.a.K(obj2);
                            sVar2.f6205d = obj2;
                            q6.q qVar2 = new q6.q();
                            try {
                                y yVar = new y(sVar3, b0Var, qVar2, (g6.c) null);
                                xVar.f8961h = bVar2;
                                xVar.i = sVar3;
                                xVar.f8962j = qVar2;
                                xVar.f8966n = 6;
                                if ((z9 ? yVar.i(xVar) : b0Var.g().b(new q(yVar, null), xVar)) != obj3) {
                                    qVar = qVar2;
                                    sVar = sVar3;
                                    Object obj4 = sVar.f6205d;
                                    return new c(obj4 != null ? obj4.hashCode() : 0, qVar.f6203d, obj4);
                                }
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                bVar = bVar2;
                                s6.a.e(bVar, th);
                                throw bVar;
                            }
                        case 6:
                            qVar = (q6.q) xVar.f8962j;
                            sVar = xVar.i;
                            bVar = (b) xVar.f8961h;
                            try {
                                s6.a.K(obj2);
                                Object obj42 = sVar.f6205d;
                                return new c(obj42 != null ? obj42.hashCode() : 0, qVar.f6203d, obj42);
                            } catch (Throwable th2) {
                                th = th2;
                                s6.a.e(bVar, th);
                                throw bVar;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (i) {
            }
        } catch (b e8) {
            q6.s sVar4 = new q6.s();
            xVar.f8961h = e8;
            xVar.i = sVar4;
            xVar.f8962j = sVar4;
            xVar.f8960g = z3;
            xVar.f8966n = 5;
            throw e8;
        }
        xVar = new x(b0Var, cVar);
        Object obj22 = xVar.f8964l;
        i = xVar.f8966n;
        g6.c cVar22 = null;
        Object obj32 = h6.a.f3204d;
    }

    public final r0 g() {
        return (r0) this.f8848m.getValue();
    }

    @Override // y3.f
    public final Object h(p6.e eVar, i6.i iVar) {
        g6.h hVar = iVar.f3460e;
        q6.i.b(hVar);
        w0 w0Var = (w0) hVar.l(v0.f8952d);
        if (w0Var != null) {
            w0Var.e(this);
        }
        return a7.x.u(new w0(w0Var, this), new b0.c(this, eVar, (g6.c) null), iVar);
    }

    public final Object i(i6.c cVar) {
        return ((h0) this.f8847l.getValue()).a(new n(3, (g6.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z3, i6.c cVar) {
        z zVar;
        int i;
        q6.q qVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i8 = zVar.f8974j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                zVar.f8974j = i8 - Integer.MIN_VALUE;
                Object obj2 = zVar.f8973h;
                i = zVar.f8974j;
                if (i != 0) {
                    s6.a.K(obj2);
                    q6.q qVar2 = new q6.q();
                    h0 h0Var = (h0) this.f8847l.getValue();
                    a0 a0Var = new a0(qVar2, this, obj, z3, null);
                    zVar.f8972g = qVar2;
                    zVar.f8974j = 1;
                    Object b8 = h0Var.b(a0Var, zVar);
                    h6.a aVar = h6.a.f3204d;
                    if (b8 == aVar) {
                        return aVar;
                    }
                    qVar = qVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = zVar.f8972g;
                    s6.a.K(obj2);
                }
                return new Integer(qVar.f6203d);
            }
        }
        zVar = new z(this, cVar);
        Object obj22 = zVar.f8973h;
        i = zVar.f8974j;
        if (i != 0) {
        }
        return new Integer(qVar.f6203d);
    }

    @Override // y3.f
    public final d7.f p() {
        return this.f8842f;
    }
}
