package m0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v1 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5137h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Object f5138j;

    /* renamed from: k, reason: collision with root package name */
    public Object f5139k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5140l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5141m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5142n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(Object obj, Object obj2, Object obj3, Object obj4, g6.c cVar, int i) {
        super(2, cVar);
        this.f5137h = i;
        this.f5139k = obj;
        this.f5140l = obj2;
        this.f5141m = obj3;
        this.f5142n = obj4;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f5137h) {
            case 0:
                return ((v1) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case 1:
                return ((v1) l((g6.c) obj2, (d7.f) obj)).p(c6.m.f1757a);
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((v1) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return ((v1) l((g6.c) obj2, (u.c1) obj)).p(c6.m.f1757a);
            default:
                return ((v1) l((g6.c) obj2, obj)).p(c6.m.f1757a);
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f5137h) {
            case 0:
                v1 v1Var = new v1((y1) this.f5140l, (x1) this.f5141m, (w0) this.f5142n, cVar);
                v1Var.f5138j = obj;
                return v1Var;
            case 1:
                v1 v1Var2 = new v1((p4.i) this.f5139k, (z0) this.f5140l, (d1) this.f5141m, (z0) this.f5142n, cVar, 1);
                v1Var2.f5138j = obj;
                return v1Var2;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return new v1((r.s0) this.f5141m, this.f5138j, (r.l1) this.f5142n, cVar);
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                v1 v1Var3 = new v1((u.l1) this.f5139k, (u.g) this.f5140l, (u.c) this.f5141m, (a7.s0) this.f5142n, cVar, 3);
                v1Var3.f5138j = obj;
                return v1Var3;
            default:
                v1 v1Var4 = new v1((List) this.f5141m, (ArrayList) this.f5142n, cVar);
                v1Var4.f5140l = obj;
                return v1Var4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0172, code lost:
    
        if (r5 == r15) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x017c, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017d, code lost:
    
        if (r5 != r15) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0179, code lost:
    
        if (r5 == r15) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0245, code lost:
    
        if (r.s0.i(r14, r22) == r15) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0238, code lost:
    
        if (r.s0.h(r14, r22) == r15) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0187, code lost:
    
        if (r.s0.j(r14, r22) == r15) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [b.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.Collection] */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        a7.s0 h8;
        d7.n0 n0Var;
        Object obj2;
        s0.b bVar;
        y1 y1Var;
        List z3;
        b.q qVar;
        o4.d dVar;
        i7.c cVar;
        r.s0 s0Var;
        Object k3;
        h1 h1Var;
        r.l0 l0Var;
        long j7;
        r.l lVar;
        Object obj3;
        List list;
        Iterator it;
        int i = 4;
        o4.d dVar2 = null;
        boolean z7 = false;
        switch (this.f5137h) {
            case 0:
                h6.a aVar = h6.a.f3204d;
                b.q qVar2 = this.i;
                try {
                    if (qVar2 == 0) {
                        s6.a.K(obj);
                        h8 = a7.x.h(((a7.u) this.f5138j).h());
                        y1 y1Var2 = (y1) this.f5140l;
                        synchronized (y1Var2.f5189b) {
                            Throwable th = y1Var2.f5191d;
                            if (th != null) {
                                throw th;
                            }
                            if (((u1) y1Var2.f5206t.getValue()).compareTo(u1.f5127e) <= 0) {
                                throw new IllegalStateException("Recomposer shut down");
                            }
                            if (y1Var2.f5190c != null) {
                                throw new IllegalStateException("Recomposer already running");
                            }
                            y1Var2.f5190c = h8;
                            y1Var2.w();
                        }
                        b6.j0 j0Var = new b6.j0(4, (y1) this.f5140l);
                        w0.m.f(w0.m.f7535a);
                        synchronized (w0.m.f7537c) {
                            w0.m.f7542h = d6.m.a0(w0.m.f7542h, j0Var);
                        }
                        qVar2 = new b.q(j0Var);
                        d7.n0 n0Var2 = y1.f5186y;
                        v0 v0Var = ((y1) this.f5140l).f5210x;
                        do {
                            n0Var = y1.f5186y;
                            obj2 = (p0.b) n0Var.getValue();
                            bVar = (s0.b) obj2;
                            t0.b bVar2 = t0.b.f6894a;
                            r0.b bVar3 = bVar.f6689f;
                            if (!bVar3.containsKey(v0Var)) {
                                if (bVar.isEmpty()) {
                                    bVar = new s0.b(v0Var, v0Var, bVar3.a(v0Var, new s0.a(bVar2, bVar2)));
                                } else {
                                    Object obj4 = bVar.f6688e;
                                    Object obj5 = bVar3.get(obj4);
                                    q6.i.b(obj5);
                                    bVar = new s0.b(bVar.f6687d, v0Var, bVar3.a(obj4, new s0.a(((s0.a) obj5).f6684a, v0Var)).a(v0Var, new s0.a(obj4, bVar2)));
                                }
                            }
                            if (obj2 != bVar) {
                                Object obj6 = e7.c.f2544b;
                                if (obj2 == null) {
                                    obj2 = obj6;
                                }
                            }
                            y1Var = (y1) this.f5140l;
                            synchronized (y1Var.f5189b) {
                                z3 = y1Var.z();
                            }
                            int size = z3.size();
                            for (int i8 = 0; i8 < size; i8++) {
                                ((y) z3.get(i8)).t();
                            }
                            b0.c cVar2 = new b0.c((x1) this.f5141m, (w0) this.f5142n, z7 ? 1 : 0, 5);
                            this.f5138j = h8;
                            this.f5139k = qVar2;
                            this.i = 1;
                            qVar = qVar2;
                            if (a7.x.b(cVar2, this) == aVar) {
                                return aVar;
                            }
                        } while (!n0Var.j(obj2, bVar));
                        y1Var = (y1) this.f5140l;
                        synchronized (y1Var.f5189b) {
                        }
                    } else {
                        if (qVar2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        b.q qVar3 = (b.q) this.f5139k;
                        h8 = (a7.s0) this.f5138j;
                        s6.a.K(obj);
                        qVar = qVar3;
                    }
                    qVar.a();
                    y1 y1Var3 = (y1) this.f5140l;
                    synchronized (y1Var3.f5189b) {
                        try {
                            if (y1Var3.f5190c == h8) {
                                y1Var3.f5190c = null;
                            }
                            y1Var3.w();
                        } finally {
                        }
                    }
                    d7.n0 n0Var3 = y1.f5186y;
                    v0.b(((y1) this.f5140l).f5210x);
                    return c6.m.f1757a;
                } catch (Throwable th2) {
                    qVar2.a();
                    y1 y1Var4 = (y1) this.f5140l;
                    synchronized (y1Var4.f5189b) {
                        try {
                            if (y1Var4.f5190c == h8) {
                                y1Var4.f5190c = null;
                            }
                            y1Var4.w();
                            d7.n0 n0Var4 = y1.f5186y;
                            v0.b(((y1) this.f5140l).f5210x);
                            throw th2;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            case 1:
                d1 d1Var = (d1) this.f5141m;
                z0 z0Var = (z0) this.f5142n;
                p4.i iVar = (p4.i) this.f5139k;
                z0 z0Var2 = (z0) this.f5140l;
                h6.a aVar2 = h6.a.f3204d;
                int i9 = this.i;
                try {
                    if (i9 == 0) {
                        s6.a.K(obj);
                        d7.f fVar = (d7.f) this.f5138j;
                        if (((List) z0Var2.getValue()).size() > 1) {
                            d1Var.h(0.0f);
                            dVar2 = (o4.d) d6.m.Y((List) z0Var2.getValue());
                            q6.i.b(dVar2);
                            iVar.g(dVar2);
                            iVar.g((o4.d) ((List) z0Var2.getValue()).get(((List) z0Var2.getValue()).size() - 2));
                        }
                        d7.o oVar = new d7.o(z0Var2, z0Var, d1Var, 2);
                        this.f5138j = dVar2;
                        this.i = 1;
                        if (fVar.c(oVar, this) == aVar2) {
                            return aVar2;
                        }
                        dVar = dVar2;
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = (o4.d) this.f5138j;
                        s6.a.K(obj);
                    }
                    if (((List) z0Var2.getValue()).size() > 1) {
                        z0Var.setValue(Boolean.FALSE);
                        q6.i.b(dVar);
                        iVar.e(dVar, false);
                    }
                } catch (CancellationException unused) {
                    if (((List) z0Var2.getValue()).size() > 1) {
                        z0Var.setValue(Boolean.FALSE);
                    }
                }
                return c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                r.l lVar2 = r.s0.f6417s;
                c6.m mVar = c6.m.f1757a;
                r.l1 l1Var = (r.l1) this.f5142n;
                r.l lVar3 = r.s0.f6416r;
                Object obj7 = this.f5138j;
                r.s0 s0Var2 = (r.s0) this.f5141m;
                h6.a aVar3 = h6.a.f3204d;
                int i10 = this.i;
                try {
                    if (i10 == 0) {
                        s6.a.K(obj);
                        Object value = s0Var2.f6418b.getValue();
                        if (!obj7.equals(value)) {
                            r.s0.g(s0Var2);
                            s0Var2.p(0.0f);
                            l1Var.p(obj7);
                            l1Var.n(0L);
                            s0Var2.d(value);
                            s0Var2.f6418b.setValue(obj7);
                        }
                        cVar = s0Var2.f6425j;
                        this.f5139k = cVar;
                        this.f5140l = s0Var2;
                        this.i = 1;
                        if (cVar.d(this) != aVar3) {
                            s0Var = s0Var2;
                        }
                        return aVar3;
                    }
                    if (i10 == 1) {
                        s0Var = (r.s0) this.f5140l;
                        cVar = (i7.c) this.f5139k;
                        s6.a.K(obj);
                    } else if (i10 == 2) {
                        s6.a.K(obj);
                        this.i = 3;
                        break;
                    } else if (i10 == 3) {
                        s6.a.K(obj);
                        h1Var = s0Var2.f6419c;
                        d1 d1Var2 = s0Var2.f6424h;
                        if (!q6.i.a(h1Var.getValue(), obj7)) {
                            return mVar;
                        }
                        if (d1Var2.g() < 1.0f && ((l0Var = s0Var2.f6429n) == null || !q6.i.a(null, l0Var.f6339b))) {
                            r.v1 v1Var = l0Var != null ? l0Var.f6339b : null;
                            if (v1Var != null) {
                                r.v1 v1Var2 = v1Var;
                                long j8 = l0Var.f6338a;
                                r.l lVar4 = lVar3;
                                r.l lVar5 = l0Var.f6342e;
                                j7 = 0;
                                r.l lVar6 = l0Var.f6343f;
                                if (lVar6 != null) {
                                    lVar4 = lVar6;
                                }
                                lVar = (r.l) v1Var2.l(j8, lVar5, lVar2, lVar4);
                            } else {
                                j7 = 0;
                                if (l0Var != null && l0Var.f6338a != 0) {
                                    long j9 = l0Var.f6344g;
                                    if (j9 == Long.MIN_VALUE) {
                                        j9 = s0Var2.f6422f;
                                    }
                                    float f6 = j9 / 1.0E9f;
                                    if (f6 > 0.0f) {
                                        lVar = new r.l(1.0f / f6);
                                    }
                                }
                                lVar = lVar3;
                            }
                            if (l0Var == null) {
                                l0Var = new r.l0();
                            }
                            r.l lVar7 = l0Var.f6342e;
                            l0Var.f6339b = null;
                            l0Var.f6340c = false;
                            l0Var.f6341d = d1Var2.g();
                            lVar7.e(0, d1Var2.g());
                            long j10 = s0Var2.f6422f;
                            l0Var.f6344g = j10;
                            l0Var.f6338a = j7;
                            l0Var.f6343f = lVar;
                            l0Var.f6345h = s6.a.C((1.0d - d1Var2.g()) * j10);
                            s0Var2.f6429n = l0Var;
                        }
                        this.f5139k = null;
                        this.f5140l = null;
                        this.i = 4;
                        break;
                    } else {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s6.a.K(obj);
                            s0Var2.p(0.0f);
                            return mVar;
                        }
                        s6.a.K(obj);
                        s0Var2.d(obj7);
                        this.i = 5;
                        break;
                    }
                    Object obj8 = s0Var.f6420d;
                    cVar.f(null);
                    if (!obj7.equals(obj8)) {
                        this.f5139k = null;
                        this.f5140l = null;
                        this.i = 2;
                        if (s0Var2.f6427l == Long.MIN_VALUE) {
                            k3 = b.o(f()).d(s0Var2.f6430o, this);
                            break;
                        } else {
                            k3 = s0Var2.k(this);
                            break;
                        }
                        s0Var2.p(0.0f);
                        return mVar;
                    }
                    h1Var = s0Var2.f6419c;
                    d1 d1Var22 = s0Var2.f6424h;
                    if (!q6.i.a(h1Var.getValue(), obj7)) {
                    }
                } catch (Throwable th4) {
                    cVar.f(null);
                    throw th4;
                }
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                u.c cVar3 = (u.c) this.f5141m;
                u.g gVar = (u.g) this.f5140l;
                u.l1 l1Var2 = (u.l1) this.f5139k;
                h6.a aVar4 = h6.a.f3204d;
                int i11 = this.i;
                if (i11 == 0) {
                    s6.a.K(obj);
                    u.c1 c1Var = (u.c1) this.f5138j;
                    l1Var2.f7045e = u.g.r0(gVar, cVar3);
                    b6.c0 c0Var = new b6.c0(gVar, l1Var2, (a7.s0) this.f5142n, c1Var);
                    b0.a aVar5 = new b0.a(gVar, l1Var2, cVar3, i);
                    this.i = 1;
                    if (l1Var2.a(c0Var, aVar5, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            default:
                int i12 = this.i;
                if (i12 == 0) {
                    s6.a.K(obj);
                    obj3 = this.f5140l;
                    List list2 = (List) this.f5141m;
                    list = (ArrayList) this.f5142n;
                    it = list2.iterator();
                } else if (i12 == 1) {
                    obj3 = this.f5138j;
                    it = (Iterator) this.f5139k;
                    list = (List) this.f5140l;
                    s6.a.K(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list.add(new y3.e(1, null));
                        this.f5140l = list;
                        this.f5139k = it;
                        this.f5138j = null;
                        this.i = 2;
                        throw null;
                    }
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Iterator it2 = (Iterator) this.f5139k;
                    List list3 = (List) this.f5140l;
                    s6.a.K(obj);
                    list = list3;
                    it = it2;
                    obj3 = obj;
                }
                if (!it.hasNext()) {
                    return obj3;
                }
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                this.f5140l = list;
                this.f5139k = it;
                this.f5138j = obj3;
                this.i = 1;
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(List list, ArrayList arrayList, g6.c cVar) {
        super(2, cVar);
        this.f5137h = 4;
        this.f5141m = list;
        this.f5142n = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(y1 y1Var, x1 x1Var, w0 w0Var, g6.c cVar) {
        super(2, cVar);
        this.f5137h = 0;
        this.f5140l = y1Var;
        this.f5141m = x1Var;
        this.f5142n = w0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(r.s0 s0Var, Object obj, r.l1 l1Var, g6.c cVar) {
        super(2, cVar);
        this.f5137h = 2;
        this.f5141m = s0Var;
        this.f5138j = obj;
        this.f5142n = l1Var;
    }
}
