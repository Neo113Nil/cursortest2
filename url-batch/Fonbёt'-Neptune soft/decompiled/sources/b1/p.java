package b1;

import Y0.C0112f;
import Y0.C0125t;
import Y0.P;
import Y0.Z;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class p extends c1.b implements d, e, c1.j {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1957i = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: h, reason: collision with root package name */
    public int f1958h;

    public p(Object obj) {
        this._state = obj;
    }

    @Override // b1.e
    public final Object a(Object obj, H0.d dVar) {
        if (obj == null) {
            obj = c1.l.f2019a;
        }
        c(null, obj);
        return F0.h.f469a;
    }

    public final boolean c(Object obj, Object obj2) {
        int i2;
        c1.c[] cVarArr;
        B.m mVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1957i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Q0.h.a(obj3, obj)) {
                return false;
            }
            if (Q0.h.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f1958h;
            if ((i3 & 1) != 0) {
                this.f1958h = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f1958h = i4;
            c1.c[] cVarArr2 = this.f1999e;
            while (true) {
                r[] rVarArr = (r[]) cVarArr2;
                if (rVarArr != null) {
                    for (r rVar : rVarArr) {
                        if (rVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r.f1961a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(rVar);
                                if (obj4 != null && obj4 != (mVar = q.f1960b)) {
                                    B.m mVar2 = q.f1959a;
                                    if (obj4 != mVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(rVar, obj4, mVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(rVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0112f) obj4).j(F0.h.f469a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(rVar, obj4, mVar)) {
                                        if (atomicReferenceFieldUpdater2.get(rVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f1958h;
                    if (i2 == i4) {
                        this.f1958h = i4 + 1;
                        return true;
                    }
                    cVarArr = this.f1999e;
                }
                cVarArr2 = cVarArr;
                i4 = i2;
            }
        }
    }

    @Override // c1.j
    public final d j(H0.i iVar, int i2, int i3) {
        return ((((i2 < 0 || i2 >= 2) && i2 != -2) || i3 != 2) && !((i2 == 0 || i2 == -3) && i3 == 1)) ? new c1.h(this, iVar, i2, i3) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0038, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0053, B:60:0x005e, B:61:0x00bc), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0038, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0053, B:60:0x005e, B:61:0x00bc), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0117 -> B:16:0x00cc). Please report as a decompilation issue!!! */
    @Override // b1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(e eVar, H0.d dVar) {
        o oVar;
        I0.a aVar;
        int i2;
        c1.c cVar;
        r rVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e eVar2;
        p pVar;
        r rVar2;
        P p2;
        e eVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (dVar instanceof o) {
                oVar = (o) dVar;
                int i3 = oVar.f1956o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    oVar.f1956o = i3 - Integer.MIN_VALUE;
                    Object obj4 = oVar.f1954m;
                    aVar = I0.a.f733e;
                    i2 = oVar.f1956o;
                    int i4 = 1;
                    if (i2 != 0) {
                        i1.a.G(obj4);
                        synchronized (this) {
                            try {
                                c1.c[] cVarArr = this.f1999e;
                                if (cVarArr == null) {
                                    cVarArr = new r[2];
                                    this.f1999e = cVarArr;
                                } else if (this.f2000f >= cVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                                    Q0.h.d(copyOf, "copyOf(this, newSize)");
                                    this.f1999e = (c1.c[]) copyOf;
                                    cVarArr = (c1.c[]) copyOf;
                                }
                                int i5 = this.f2001g;
                                do {
                                    cVar = cVarArr[i5];
                                    if (cVar == null) {
                                        cVar = new r();
                                        cVarArr[i5] = cVar;
                                    }
                                    i5++;
                                    if (i5 >= cVarArr.length) {
                                        i5 = 0;
                                    }
                                    rVar = (r) cVar;
                                    atomicReferenceFieldUpdater = r.f1961a;
                                } while (atomicReferenceFieldUpdater.get(rVar) != null);
                                atomicReferenceFieldUpdater.set(rVar, q.f1959a);
                                this.f2001g = i5;
                                this.f2000f++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        eVar2 = eVar;
                        pVar = this;
                        rVar2 = (r) cVar;
                    } else if (i2 == 1) {
                        rVar2 = oVar.f1951j;
                        eVar2 = oVar.f1950i;
                        pVar = oVar.f1949h;
                        i1.a.G(obj4);
                    } else if (i2 == 2) {
                        obj2 = oVar.f1953l;
                        p2 = oVar.f1952k;
                        rVar2 = oVar.f1951j;
                        eVar3 = oVar.f1950i;
                        pVar = oVar.f1949h;
                        i1.a.G(obj4);
                        obj = obj2;
                        rVar2.getClass();
                        B.m mVar = q.f1959a;
                        andSet = r.f1961a.getAndSet(rVar2, mVar);
                        Q0.h.b(andSet);
                        if (andSet != q.f1960b) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = oVar.f1953l;
                        p2 = oVar.f1952k;
                        rVar2 = oVar.f1951j;
                        eVar3 = oVar.f1950i;
                        pVar = oVar.f1949h;
                        i1.a.G(obj4);
                        obj = obj5;
                        i4 = 1;
                        obj2 = f1957i.get(pVar);
                        if (p2 != null && !p2.b()) {
                            throw ((Z) p2).A();
                        }
                        obj3 = obj2 == c1.l.f2019a ? null : obj2;
                        oVar.f1949h = pVar;
                        oVar.f1950i = eVar3;
                        oVar.f1951j = rVar2;
                        oVar.f1952k = p2;
                        oVar.f1953l = obj2;
                        oVar.f1956o = 2;
                        if (eVar3.a(obj3, oVar) == aVar) {
                            return aVar;
                        }
                        obj = obj2;
                        rVar2.getClass();
                        B.m mVar2 = q.f1959a;
                        andSet = r.f1961a.getAndSet(rVar2, mVar2);
                        Q0.h.b(andSet);
                        if (andSet != q.f1960b) {
                            obj2 = f1957i.get(pVar);
                            if (p2 != null) {
                                throw ((Z) p2).A();
                            }
                            if (obj2 == c1.l.f2019a) {
                            }
                            oVar.f1949h = pVar;
                            oVar.f1950i = eVar3;
                            oVar.f1951j = rVar2;
                            oVar.f1952k = p2;
                            oVar.f1953l = obj2;
                            oVar.f1956o = 2;
                            if (eVar3.a(obj3, oVar) == aVar) {
                            }
                            obj = obj2;
                            rVar2.getClass();
                            B.m mVar22 = q.f1959a;
                            andSet = r.f1961a.getAndSet(rVar2, mVar22);
                            Q0.h.b(andSet);
                            if (andSet != q.f1960b) {
                                oVar.f1949h = pVar;
                                oVar.f1950i = eVar3;
                                oVar.f1951j = rVar2;
                                oVar.f1952k = p2;
                                oVar.f1953l = obj;
                                oVar.f1956o = 3;
                                C0112f c0112f = new C0112f(i4, i1.a.t(oVar));
                                c0112f.v();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r.f1961a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(rVar2, mVar22, c0112f);
                                    F0.h hVar = F0.h.f469a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(rVar2) != mVar22) {
                                        c0112f.j(hVar);
                                        break;
                                    }
                                }
                                Object u2 = c0112f.u();
                                if (u2 == I0.a.f733e) {
                                }
                                if (u2 == aVar) {
                                    return aVar;
                                }
                                i4 = 1;
                                obj2 = f1957i.get(pVar);
                                if (p2 != null) {
                                }
                                if (obj2 == c1.l.f2019a) {
                                }
                                oVar.f1949h = pVar;
                                oVar.f1950i = eVar3;
                                oVar.f1951j = rVar2;
                                oVar.f1952k = p2;
                                oVar.f1953l = obj2;
                                oVar.f1956o = 2;
                                if (eVar3.a(obj3, oVar) == aVar) {
                                }
                                obj = obj2;
                                rVar2.getClass();
                                B.m mVar222 = q.f1959a;
                                andSet = r.f1961a.getAndSet(rVar2, mVar222);
                                Q0.h.b(andSet);
                                if (andSet != q.f1960b) {
                                }
                            }
                        }
                    }
                    H0.i iVar = oVar.f737f;
                    Q0.h.b(iVar);
                    p2 = (P) iVar.k(C0125t.f1230f);
                    eVar3 = eVar2;
                    obj = null;
                    obj2 = f1957i.get(pVar);
                    if (p2 != null) {
                    }
                    if (obj2 == c1.l.f2019a) {
                    }
                    oVar.f1949h = pVar;
                    oVar.f1950i = eVar3;
                    oVar.f1951j = rVar2;
                    oVar.f1952k = p2;
                    oVar.f1953l = obj2;
                    oVar.f1956o = 2;
                    if (eVar3.a(obj3, oVar) == aVar) {
                    }
                    obj = obj2;
                    rVar2.getClass();
                    B.m mVar2222 = q.f1959a;
                    andSet = r.f1961a.getAndSet(rVar2, mVar2222);
                    Q0.h.b(andSet);
                    if (andSet != q.f1960b) {
                    }
                }
            }
            if (i2 != 0) {
            }
            H0.i iVar2 = oVar.f737f;
            Q0.h.b(iVar2);
            p2 = (P) iVar2.k(C0125t.f1230f);
            eVar3 = eVar2;
            obj = null;
            obj2 = f1957i.get(pVar);
            if (p2 != null) {
            }
            if (obj2 == c1.l.f2019a) {
            }
            oVar.f1949h = pVar;
            oVar.f1950i = eVar3;
            oVar.f1951j = rVar2;
            oVar.f1952k = p2;
            oVar.f1953l = obj2;
            oVar.f1956o = 2;
            if (eVar3.a(obj3, oVar) == aVar) {
            }
            obj = obj2;
            rVar2.getClass();
            B.m mVar22222 = q.f1959a;
            andSet = r.f1961a.getAndSet(rVar2, mVar22222);
            Q0.h.b(andSet);
            if (andSet != q.f1960b) {
            }
        } catch (Throwable th2) {
            pVar.b(rVar2);
            throw th2;
        }
        oVar = new o(this, dVar);
        Object obj42 = oVar.f1954m;
        aVar = I0.a.f733e;
        i2 = oVar.f1956o;
        int i42 = 1;
    }
}
