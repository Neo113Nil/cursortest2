package g3;

import c7.g1;
import c7.m1;
import com.android.installreferrer.api.InstallReferrerClient;
import f7.n0;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements f {

    /* renamed from: f, reason: collision with root package name */
    public final i3.f f4089f;

    /* renamed from: g, reason: collision with root package name */
    public final j4.i f4090g;

    /* renamed from: h, reason: collision with root package name */
    public final c7.x f4091h;

    /* renamed from: i, reason: collision with root package name */
    public final f7.y f4092i;

    /* renamed from: j, reason: collision with root package name */
    public final f7.a0 f4093j;

    /* renamed from: k, reason: collision with root package name */
    public final f7.c f4094k;

    /* renamed from: l, reason: collision with root package name */
    public final b6.c f4095l;

    /* renamed from: m, reason: collision with root package name */
    public final k f4096m;

    /* renamed from: n, reason: collision with root package name */
    public final d6.o f4097n;

    /* renamed from: o, reason: collision with root package name */
    public final d6.o f4098o;

    /* renamed from: p, reason: collision with root package name */
    public final k f4099p;

    public a0(i3.f fVar, List list, j4.i iVar, c7.x xVar) {
        this.f4089f = fVar;
        this.f4090g = iVar;
        this.f4091h = xVar;
        h6.d dVar = null;
        f7.a0 a0Var = new f7.a0(new n(this, dVar, 2));
        int i7 = a7.a.f526i;
        int i8 = 1;
        int i9 = ((int) 0) & 1;
        n0 n0Var = new n0((i9 != 1 || a7.a.g(0L)) ? a7.a.l(0L, a7.c.MILLISECONDS) : 0L, (i9 != 1 || a7.a.g(0L)) ? a7.a.l(0L, a7.c.MILLISECONDS) : 0L);
        int i10 = 0;
        f7.i0 g9 = f7.f0.g(a0Var, 0);
        f7.e0 a3 = f7.f0.a(0, g9.f3487a, (e7.a) g9.f3489c);
        h6.i iVar2 = (h6.i) g9.f3490d;
        f7.f fVar2 = (f7.f) g9.f3488b;
        h7.s sVar = f7.f0.f3469a;
        c7.y yVar = n0Var.equals(f7.j0.f3496a) ? c7.y.f1756f : c7.y.f1759i;
        androidx.lifecycle.g0 g0Var = new androidx.lifecycle.g0(n0Var, fVar2, a3, sVar, (h6.d) null);
        h6.i g10 = c7.a0.g(xVar.k(), iVar2, true);
        j7.e eVar = c7.g0.f1696a;
        if (g10 != eVar && g10.u(h6.e.f4660f) == null) {
            g10 = g10.z(eVar);
        }
        c7.a g1Var = yVar == c7.y.f1757g ? new g1(g10, g0Var) : new m1(g10, true);
        g1Var.f0(yVar, g1Var, g0Var);
        this.f4092i = new f7.y(a3);
        this.f4093j = new f7.a0(new a0.a0(this, dVar, 8));
        this.f4094k = new f7.c(new o(this, dVar, i10), h6.j.f4661f, -2, e7.a.f2833f);
        this.f4095l = new b6.c(18);
        this.f4096m = new k(this, list);
        this.f4097n = d6.a.d(new l(this, i8));
        this.f4098o = d6.a.d(new l(this, i10));
        this.f4099p = new k(xVar, new c1.a(11, this), new o(this, dVar, i8));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(8:55|(1:(1:(2:59|60))(3:61|62|63))|64|65|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|67|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        if (r9 != r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    /* JADX WARN: Type inference failed for: r1v3, types: [j6.i, q6.e] */
    /* JADX WARN: Type inference failed for: r1v9, types: [j6.i, q6.e] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a0 a0Var, c0 c0Var, j6.c cVar) {
        q qVar;
        int i7;
        c7.n nVar;
        a0 a0Var2;
        Object b9;
        c7.m mVar;
        Throwable a3;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i8 = qVar.f4185k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                qVar.f4185k = i8 - Integer.MIN_VALUE;
                Object obj = qVar.f4183i;
                i7 = qVar.f4185k;
                boolean z8 = true;
                i6.a aVar = i6.a.f4956f;
                if (i7 == 0) {
                    try {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                c7.n nVar2 = qVar.f4182h;
                                a0 a0Var3 = qVar.f4181g;
                                c0 c0Var2 = (c0) qVar.f4180f;
                                d6.a.e(obj);
                                nVar = nVar2;
                                a0Var2 = a0Var3;
                                c0Var = c0Var2;
                            } else if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        c7.m mVar2 = (c7.m) qVar.f4180f;
                        d6.a.e(obj);
                        mVar = mVar2;
                    } catch (Throwable th) {
                        th = th;
                        obj = d6.a.b(th);
                        mVar = a0Var;
                        a3 = d6.m.a(obj);
                        c7.n nVar3 = (c7.n) mVar;
                        if (a3 == null) {
                        }
                        return d6.z.f2639a;
                    }
                    a3 = d6.m.a(obj);
                    c7.n nVar32 = (c7.n) mVar;
                    if (a3 == null) {
                        nVar32.O(obj);
                    } else {
                        nVar32.getClass();
                        nVar32.O(new c7.p(a3, false));
                    }
                    return d6.z.f2639a;
                }
                d6.a.e(obj);
                nVar = c0Var.f4104b;
                try {
                    i0 p6 = a0Var.f4095l.p();
                    if (p6 instanceof c) {
                        ?? r12 = c0Var.f4103a;
                        h6.i iVar = c0Var.f4106d;
                        qVar.f4180f = nVar;
                        qVar.f4185k = 1;
                        try {
                            b9 = a0Var.e().b(new x(a0Var, iVar, (q6.e) r12, (h6.d) null), qVar);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            a0Var = nVar;
                            obj = d6.a.b(th);
                            mVar = a0Var;
                            a3 = d6.m.a(obj);
                            c7.n nVar322 = (c7.n) mVar;
                            if (a3 == null) {
                            }
                            return d6.z.f2639a;
                        }
                    } else {
                        if (!(p6 instanceof d0)) {
                            z8 = p6 instanceof k0;
                        }
                        if (!z8) {
                            if (p6 instanceof b0) {
                                throw ((b0) p6).f4100b;
                            }
                            throw new b4.c();
                        }
                        if (p6 != c0Var.f4105c) {
                            r6.k.d(p6, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$0>");
                            throw ((d0) p6).f4111b;
                        }
                        qVar.f4180f = c0Var;
                        qVar.f4181g = a0Var;
                        qVar.f4182h = nVar;
                        qVar.f4185k = 2;
                        Object f9 = a0Var.f(qVar);
                        a0Var2 = a0Var;
                        if (f9 == aVar) {
                        }
                    }
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    a0Var = nVar;
                    obj = d6.a.b(th);
                    mVar = a0Var;
                    a3 = d6.m.a(obj);
                    c7.n nVar3222 = (c7.n) mVar;
                    if (a3 == null) {
                    }
                    return d6.z.f2639a;
                }
                ?? r13 = c0Var.f4103a;
                h6.i iVar2 = c0Var.f4106d;
                qVar.f4180f = nVar;
                qVar.f4181g = null;
                qVar.f4182h = null;
                qVar.f4185k = 3;
                b9 = a0Var2.e().b(new x(a0Var2, iVar2, (q6.e) r13, (h6.d) null), qVar);
            }
        }
        qVar = new q(a0Var, cVar);
        Object obj2 = qVar.f4183i;
        i7 = qVar.f4185k;
        boolean z82 = true;
        i6.a aVar2 = i6.a.f4956f;
        if (i7 == 0) {
        }
        ?? r132 = c0Var.f4103a;
        h6.i iVar22 = c0Var.f4106d;
        qVar.f4180f = nVar;
        qVar.f4181g = null;
        qVar.f4182h = null;
        qVar.f4185k = 3;
        b9 = a0Var2.e().b(new x(a0Var2, iVar22, (q6.e) r132, (h6.d) null), qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a0 a0Var, boolean z8, h6.d dVar) {
        t tVar;
        int i7;
        i6.a aVar;
        a0 a0Var2;
        i0 i0Var;
        boolean z9;
        a0 a0Var3;
        d6.j jVar;
        if (dVar instanceof t) {
            tVar = (t) dVar;
            int i8 = tVar.f4199k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                tVar.f4199k = i8 - Integer.MIN_VALUE;
                Object obj = tVar.f4197i;
                i7 = tVar.f4199k;
                aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    i0 p6 = a0Var.f4095l.p();
                    if (p6 instanceof k0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    h0 e9 = a0Var.e();
                    tVar.f4194f = a0Var;
                    tVar.f4195g = p6;
                    tVar.f4196h = z8;
                    tVar.f4199k = 1;
                    Integer a3 = e9.a();
                    if (a3 != aVar) {
                        a0Var2 = a0Var;
                        i0Var = p6;
                        obj = a3;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        a0Var3 = tVar.f4194f;
                        d6.a.e(obj);
                        jVar = (d6.j) obj;
                        i0 i0Var2 = (i0) jVar.f2618f;
                        if (((Boolean) jVar.f2619g).booleanValue()) {
                        }
                        return i0Var2;
                    }
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var3 = tVar.f4194f;
                    d6.a.e(obj);
                    jVar = (d6.j) obj;
                    i0 i0Var22 = (i0) jVar.f2618f;
                    if (((Boolean) jVar.f2619g).booleanValue()) {
                        a0Var3.f4095l.C(i0Var22);
                    }
                    return i0Var22;
                }
                z8 = tVar.f4196h;
                i0Var = tVar.f4195g;
                a0Var2 = tVar.f4194f;
                d6.a.e(obj);
                int intValue = ((Number) obj).intValue();
                z9 = i0Var instanceof c;
                int i9 = !z9 ? i0Var.f4147a : -1;
                if (!z9 && intValue == i9) {
                    return i0Var;
                }
                h6.d dVar2 = null;
                if (z8) {
                    h0 e10 = a0Var2.e();
                    v vVar = new v(a0Var2, i9, dVar2, 0);
                    tVar.f4194f = a0Var2;
                    tVar.f4195g = null;
                    tVar.f4199k = 3;
                    obj = e10.c(vVar, tVar);
                    if (obj != aVar) {
                        a0Var3 = a0Var2;
                        jVar = (d6.j) obj;
                        i0 i0Var222 = (i0) jVar.f2618f;
                        if (((Boolean) jVar.f2619g).booleanValue()) {
                        }
                        return i0Var222;
                    }
                } else {
                    h0 e11 = a0Var2.e();
                    u uVar = new u(a0Var2, null);
                    tVar.f4194f = a0Var2;
                    tVar.f4195g = null;
                    tVar.f4199k = 2;
                    obj = e11.b(uVar, tVar);
                    if (obj != aVar) {
                        a0Var3 = a0Var2;
                        jVar = (d6.j) obj;
                        i0 i0Var2222 = (i0) jVar.f2618f;
                        if (((Boolean) jVar.f2619g).booleanValue()) {
                        }
                        return i0Var2222;
                    }
                }
                return aVar;
            }
        }
        tVar = new t(a0Var, dVar);
        Object obj2 = tVar.f4197i;
        i7 = tVar.f4199k;
        aVar = i6.a.f4956f;
        if (i7 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z9 = i0Var instanceof c;
        if (!z9) {
        }
        if (!z9) {
        }
        h6.d dVar22 = null;
        if (z8) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x013f, code lost:
    
        if (r11 != r4) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6 A[Catch: b -> 0x00a7, TryCatch #2 {b -> 0x00a7, blocks: (B:36:0x00a2, B:37:0x0142, B:40:0x00b0, B:41:0x0124, B:54:0x00cd, B:56:0x00e6, B:57:0x00ea, B:62:0x00d6, B:65:0x0112), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a0 a0Var, boolean z8, j6.c cVar) {
        w wVar;
        int i7;
        Integer a3;
        a0 a0Var2;
        int i8;
        Object obj;
        b bVar;
        Object b9;
        r6.t tVar;
        r6.v vVar;
        try {
            if (cVar instanceof w) {
                wVar = (w) cVar;
                int i9 = wVar.f4217n;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    wVar.f4217n = i9 - Integer.MIN_VALUE;
                    Object obj2 = wVar.f4215l;
                    i7 = wVar.f4217n;
                    h6.d dVar = null;
                    i6.a aVar = i6.a.f4956f;
                    switch (i7) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            d6.a.e(obj2);
                            if (!z8) {
                                h0 e9 = a0Var.e();
                                wVar.f4209f = a0Var;
                                wVar.f4213j = z8;
                                wVar.f4217n = 3;
                                obj2 = e9.a();
                                if (obj2 == aVar) {
                                }
                                int intValue = ((Number) obj2).intValue();
                                h0 e10 = a0Var.e();
                                v vVar2 = new v(a0Var, intValue, dVar, 1);
                                wVar.f4209f = a0Var;
                                wVar.f4213j = z8;
                                wVar.f4217n = 4;
                                obj2 = e10.c(vVar2, wVar);
                                break;
                            } else {
                                wVar.f4209f = a0Var;
                                wVar.f4213j = z8;
                                wVar.f4217n = 1;
                                obj2 = a0Var.g(wVar);
                                if (obj2 == aVar) {
                                }
                                int hashCode = obj2 != null ? obj2.hashCode() : 0;
                                h0 e11 = a0Var.e();
                                wVar.f4209f = a0Var;
                                wVar.f4210g = obj2;
                                wVar.f4213j = z8;
                                wVar.f4214k = hashCode;
                                wVar.f4217n = 2;
                                a3 = e11.a();
                                if (a3 != aVar) {
                                    int i10 = hashCode;
                                    a0Var2 = a0Var;
                                    i8 = i10;
                                    obj = obj2;
                                    obj2 = a3;
                                    return new c(i8, ((Number) obj2).intValue(), obj);
                                }
                            }
                            return aVar;
                        case 1:
                            z8 = wVar.f4213j;
                            a0Var = (a0) wVar.f4209f;
                            d6.a.e(obj2);
                            if (obj2 != null) {
                            }
                            h0 e112 = a0Var.e();
                            wVar.f4209f = a0Var;
                            wVar.f4210g = obj2;
                            wVar.f4213j = z8;
                            wVar.f4214k = hashCode;
                            wVar.f4217n = 2;
                            a3 = e112.a();
                            if (a3 != aVar) {
                            }
                            return aVar;
                        case 2:
                            i8 = wVar.f4214k;
                            z8 = wVar.f4213j;
                            obj = wVar.f4210g;
                            a0Var2 = (a0) wVar.f4209f;
                            try {
                                d6.a.e(obj2);
                                return new c(i8, ((Number) obj2).intValue(), obj);
                            } catch (b e12) {
                                e = e12;
                                a0Var = a0Var2;
                                r6.v vVar3 = new r6.v();
                                j4.i iVar = a0Var.f4090g;
                                wVar.f4209f = a0Var;
                                wVar.f4210g = e;
                                wVar.f4211h = vVar3;
                                wVar.f4212i = vVar3;
                                wVar.f4213j = z8;
                                wVar.f4217n = 5;
                                throw e;
                            }
                        case 3:
                            z8 = wVar.f4213j;
                            a0Var = (a0) wVar.f4209f;
                            d6.a.e(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            h0 e102 = a0Var.e();
                            v vVar22 = new v(a0Var, intValue2, dVar, 1);
                            wVar.f4209f = a0Var;
                            wVar.f4213j = z8;
                            wVar.f4217n = 4;
                            obj2 = e102.c(vVar22, wVar);
                            break;
                        case 4:
                            boolean z9 = wVar.f4213j;
                            d6.a.e(obj2);
                            return (c) obj2;
                        case 5:
                            boolean z10 = wVar.f4213j;
                            r6.v vVar4 = wVar.f4212i;
                            r6.v vVar5 = (r6.v) wVar.f4211h;
                            b bVar2 = (b) wVar.f4210g;
                            a0 a0Var3 = (a0) wVar.f4209f;
                            d6.a.e(obj2);
                            vVar4.f7968f = obj2;
                            r6.t tVar2 = new r6.t();
                            try {
                                x xVar = new x(vVar5, a0Var3, tVar2, (h6.d) null);
                                wVar.f4209f = bVar2;
                                wVar.f4210g = vVar5;
                                wVar.f4211h = tVar2;
                                wVar.f4212i = null;
                                wVar.f4217n = 6;
                                if (z10) {
                                    a0Var3.getClass();
                                    b9 = xVar.f(wVar);
                                } else {
                                    b9 = a0Var3.e().b(new p(xVar, null), wVar);
                                }
                                if (b9 != aVar) {
                                    tVar = tVar2;
                                    vVar = vVar5;
                                    Object obj3 = vVar.f7968f;
                                    return new c(obj3 != null ? obj3.hashCode() : 0, tVar.f7966f, obj3);
                                }
                                return aVar;
                            } catch (Throwable th) {
                                th = th;
                                bVar = bVar2;
                                d6.a.a(bVar, th);
                                throw bVar;
                            }
                        case 6:
                            tVar = (r6.t) wVar.f4211h;
                            vVar = (r6.v) wVar.f4210g;
                            bVar = (b) wVar.f4209f;
                            try {
                                d6.a.e(obj2);
                                Object obj32 = vVar.f7968f;
                                return new c(obj32 != null ? obj32.hashCode() : 0, tVar.f7966f, obj32);
                            } catch (Throwable th2) {
                                th = th2;
                                d6.a.a(bVar, th);
                                throw bVar;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (i7) {
            }
        } catch (b e13) {
            e = e13;
        }
        wVar = new w(a0Var, cVar);
        Object obj22 = wVar.f4215l;
        i7 = wVar.f4217n;
        h6.d dVar2 = null;
        i6.a aVar2 = i6.a.f4956f;
    }

    @Override // g3.f
    public final Object d(q6.e eVar, j6.c cVar) {
        m0 m0Var = (m0) cVar.getContext().u(l0.f4167f);
        if (m0Var != null) {
            m0Var.a(this);
        }
        return c7.a0.x(new m0(m0Var, this), new a0.a0(this, eVar, (h6.d) null), cVar);
    }

    public final h0 e() {
        return (h0) this.f4098o.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r3.w(r0) != r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(j6.c cVar) {
        s sVar;
        int i7;
        a0 a0Var;
        int intValue;
        int i8;
        Throwable th;
        a0 a0Var2;
        try {
            if (cVar instanceof s) {
                sVar = (s) cVar;
                int i9 = sVar.f4193j;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    sVar.f4193j = i9 - Integer.MIN_VALUE;
                    Object obj = sVar.f4191h;
                    i7 = sVar.f4193j;
                    Object obj2 = i6.a.f4956f;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        h0 e9 = e();
                        sVar.f4189f = this;
                        sVar.f4193j = 1;
                        obj = e9.a();
                        if (obj != obj2) {
                            a0Var = this;
                        }
                        return obj2;
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i8 = sVar.f4190g;
                        a0Var2 = sVar.f4189f;
                        try {
                            d6.a.e(obj);
                            return d6.z.f2639a;
                        } catch (Throwable th2) {
                            th = th2;
                            a0Var2.f4095l.C(new d0(i8, th));
                            throw th;
                        }
                    }
                    a0Var = sVar.f4189f;
                    d6.a.e(obj);
                    intValue = ((Number) obj).intValue();
                    k kVar = a0Var.f4096m;
                    sVar.f4189f = a0Var;
                    sVar.f4190g = intValue;
                    sVar.f4193j = 2;
                }
            }
            k kVar2 = a0Var.f4096m;
            sVar.f4189f = a0Var;
            sVar.f4190g = intValue;
            sVar.f4193j = 2;
        } catch (Throwable th3) {
            a0 a0Var3 = a0Var;
            i8 = intValue;
            th = th3;
            a0Var2 = a0Var3;
            a0Var2.f4095l.C(new d0(i8, th));
            throw th;
        }
        sVar = new s(this, cVar);
        Object obj3 = sVar.f4191h;
        i7 = sVar.f4193j;
        Object obj22 = i6.a.f4956f;
        if (i7 != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object g(j6.c cVar) {
        return ((i3.i) this.f4097n.getValue()).a(new j0(3, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, boolean z8, j6.c cVar) {
        y yVar;
        int i7;
        r6.t tVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i8 = yVar.f4227i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                yVar.f4227i = i8 - Integer.MIN_VALUE;
                Object obj2 = yVar.f4225g;
                i7 = yVar.f4227i;
                if (i7 != 0) {
                    d6.a.e(obj2);
                    r6.t tVar2 = new r6.t();
                    i3.i iVar = (i3.i) this.f4097n.getValue();
                    z zVar = new z(tVar2, this, obj, z8, null);
                    yVar.f4224f = tVar2;
                    yVar.f4227i = 1;
                    Object b9 = iVar.b(zVar, yVar);
                    i6.a aVar = i6.a.f4956f;
                    if (b9 == aVar) {
                        return aVar;
                    }
                    tVar = tVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = yVar.f4224f;
                    d6.a.e(obj2);
                }
                return new Integer(tVar.f7966f);
            }
        }
        yVar = new y(this, cVar);
        Object obj22 = yVar.f4225g;
        i7 = yVar.f4227i;
        if (i7 != 0) {
        }
        return new Integer(tVar.f7966f);
    }

    @Override // g3.f
    public final f7.f i() {
        return this.f4094k;
    }
}
