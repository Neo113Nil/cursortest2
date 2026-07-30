package P0;

import M0.C0048f;
import M0.C0061t;
import M0.P;
import M0.Z;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u0.C0247g;

/* loaded from: classes.dex */
public final class q extends Q0.b implements d, e, Q0.j {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f824i = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: h, reason: collision with root package name */
    public int f825h;

    public q(Object obj) {
        this._state = obj;
    }

    @Override // P0.e
    public final Object a(Object obj, w0.d dVar) {
        if (obj == null) {
            obj = Q0.l.f852a;
        }
        b(null, obj);
        return C0247g.f3005a;
    }

    public final boolean b(Object obj, Object obj2) {
        int i2;
        Q0.c[] cVarArr;
        A.j jVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f824i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !F0.i.a(obj3, obj)) {
                return false;
            }
            if (F0.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f825h;
            if ((i3 & 1) != 0) {
                this.f825h = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f825h = i4;
            Q0.c[] cVarArr2 = this.f832e;
            while (true) {
                s[] sVarArr = (s[]) cVarArr2;
                if (sVarArr != null) {
                    for (s sVar : sVarArr) {
                        if (sVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s.f828a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(sVar);
                                if (obj4 != null && obj4 != (jVar = r.f827b)) {
                                    A.j jVar2 = r.f826a;
                                    if (obj4 != jVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, jVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(sVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0048f) obj4).resumeWith(C0247g.f3005a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, jVar)) {
                                        if (atomicReferenceFieldUpdater2.get(sVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f825h;
                    if (i2 == i4) {
                        this.f825h = i4 + 1;
                        return true;
                    }
                    cVarArr = this.f832e;
                }
                cVarArr2 = cVarArr;
                i4 = i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e8, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0150, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cc, B:18:0x00d4, B:21:0x00db, B:22:0x00e1, B:26:0x00e4, B:28:0x0105, B:31:0x0118, B:32:0x0130, B:39:0x0144, B:34:0x013b, B:38:0x0141, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0117 -> B:16:0x00cc). Please report as a decompilation issue!!! */
    @Override // P0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(e eVar, w0.d dVar) {
        p pVar;
        x0.a aVar;
        int i2;
        Q0.c cVar;
        s sVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e eVar2;
        q qVar;
        s sVar2;
        P p2;
        e eVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (dVar instanceof p) {
                pVar = (p) dVar;
                int i3 = pVar.f823o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    pVar.f823o = i3 - Integer.MIN_VALUE;
                    Object obj4 = pVar.f821m;
                    aVar = x0.a.f3094e;
                    i2 = pVar.f823o;
                    int i4 = 1;
                    if (i2 != 0) {
                        o.g.z(obj4);
                        synchronized (this) {
                            try {
                                Q0.c[] cVarArr = this.f832e;
                                if (cVarArr == null) {
                                    cVarArr = new s[2];
                                    this.f832e = cVarArr;
                                } else if (this.f833f >= cVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                                    F0.i.d(copyOf, "copyOf(this, newSize)");
                                    this.f832e = (Q0.c[]) copyOf;
                                    cVarArr = (Q0.c[]) copyOf;
                                }
                                int i5 = this.f834g;
                                do {
                                    cVar = cVarArr[i5];
                                    if (cVar == null) {
                                        cVar = new s();
                                        cVarArr[i5] = cVar;
                                    }
                                    i5++;
                                    if (i5 >= cVarArr.length) {
                                        i5 = 0;
                                    }
                                    sVar = (s) cVar;
                                    atomicReferenceFieldUpdater = s.f828a;
                                } while (atomicReferenceFieldUpdater.get(sVar) != null);
                                atomicReferenceFieldUpdater.set(sVar, r.f826a);
                                this.f834g = i5;
                                this.f833f++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        eVar2 = eVar;
                        qVar = this;
                        sVar2 = (s) cVar;
                    } else if (i2 == 1) {
                        sVar2 = pVar.f818j;
                        eVar2 = pVar.f817i;
                        qVar = pVar.f816h;
                        o.g.z(obj4);
                    } else if (i2 == 2) {
                        obj2 = pVar.f820l;
                        p2 = pVar.f819k;
                        sVar2 = pVar.f818j;
                        eVar3 = pVar.f817i;
                        qVar = pVar.f816h;
                        o.g.z(obj4);
                        obj = obj2;
                        sVar2.getClass();
                        A.j jVar = r.f826a;
                        andSet = s.f828a.getAndSet(sVar2, jVar);
                        F0.i.b(andSet);
                        if (andSet != r.f827b) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = pVar.f820l;
                        p2 = pVar.f819k;
                        sVar2 = pVar.f818j;
                        eVar3 = pVar.f817i;
                        qVar = pVar.f816h;
                        o.g.z(obj4);
                        obj = obj5;
                        i4 = 1;
                        obj2 = f824i.get(qVar);
                        if (p2 != null && !p2.b()) {
                            throw ((Z) p2).y();
                        }
                        obj3 = obj2 == Q0.l.f852a ? null : obj2;
                        pVar.f816h = qVar;
                        pVar.f817i = eVar3;
                        pVar.f818j = sVar2;
                        pVar.f819k = p2;
                        pVar.f820l = obj2;
                        pVar.f823o = 2;
                        if (eVar3.a(obj3, pVar) == aVar) {
                            return aVar;
                        }
                        obj = obj2;
                        sVar2.getClass();
                        A.j jVar2 = r.f826a;
                        andSet = s.f828a.getAndSet(sVar2, jVar2);
                        F0.i.b(andSet);
                        if (andSet != r.f827b) {
                            obj2 = f824i.get(qVar);
                            if (p2 != null) {
                                throw ((Z) p2).y();
                            }
                            if (obj2 == Q0.l.f852a) {
                            }
                            pVar.f816h = qVar;
                            pVar.f817i = eVar3;
                            pVar.f818j = sVar2;
                            pVar.f819k = p2;
                            pVar.f820l = obj2;
                            pVar.f823o = 2;
                            if (eVar3.a(obj3, pVar) == aVar) {
                            }
                            obj = obj2;
                            sVar2.getClass();
                            A.j jVar22 = r.f826a;
                            andSet = s.f828a.getAndSet(sVar2, jVar22);
                            F0.i.b(andSet);
                            if (andSet != r.f827b) {
                                pVar.f816h = qVar;
                                pVar.f817i = eVar3;
                                pVar.f818j = sVar2;
                                pVar.f819k = p2;
                                pVar.f820l = obj;
                                pVar.f823o = 3;
                                C0048f c0048f = new C0048f(i4, o.g.r(pVar));
                                c0048f.t();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s.f828a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(sVar2, jVar22, c0048f);
                                    C0247g c0247g = C0247g.f3005a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(sVar2) != jVar22) {
                                        c0048f.resumeWith(c0247g);
                                        break;
                                    }
                                }
                                Object s2 = c0048f.s();
                                if (s2 == x0.a.f3094e) {
                                }
                                if (s2 == aVar) {
                                    return aVar;
                                }
                                i4 = 1;
                                obj2 = f824i.get(qVar);
                                if (p2 != null) {
                                }
                                if (obj2 == Q0.l.f852a) {
                                }
                                pVar.f816h = qVar;
                                pVar.f817i = eVar3;
                                pVar.f818j = sVar2;
                                pVar.f819k = p2;
                                pVar.f820l = obj2;
                                pVar.f823o = 2;
                                if (eVar3.a(obj3, pVar) == aVar) {
                                }
                                obj = obj2;
                                sVar2.getClass();
                                A.j jVar222 = r.f826a;
                                andSet = s.f828a.getAndSet(sVar2, jVar222);
                                F0.i.b(andSet);
                                if (andSet != r.f827b) {
                                }
                            }
                        }
                    }
                    w0.i iVar = pVar.f3098f;
                    F0.i.b(iVar);
                    p2 = (P) iVar.f(C0061t.f687f);
                    eVar3 = eVar2;
                    obj = null;
                    obj2 = f824i.get(qVar);
                    if (p2 != null) {
                    }
                    if (obj2 == Q0.l.f852a) {
                    }
                    pVar.f816h = qVar;
                    pVar.f817i = eVar3;
                    pVar.f818j = sVar2;
                    pVar.f819k = p2;
                    pVar.f820l = obj2;
                    pVar.f823o = 2;
                    if (eVar3.a(obj3, pVar) == aVar) {
                    }
                    obj = obj2;
                    sVar2.getClass();
                    A.j jVar2222 = r.f826a;
                    andSet = s.f828a.getAndSet(sVar2, jVar2222);
                    F0.i.b(andSet);
                    if (andSet != r.f827b) {
                    }
                }
            }
            if (i2 != 0) {
            }
            w0.i iVar2 = pVar.f3098f;
            F0.i.b(iVar2);
            p2 = (P) iVar2.f(C0061t.f687f);
            eVar3 = eVar2;
            obj = null;
            obj2 = f824i.get(qVar);
            if (p2 != null) {
            }
            if (obj2 == Q0.l.f852a) {
            }
            pVar.f816h = qVar;
            pVar.f817i = eVar3;
            pVar.f818j = sVar2;
            pVar.f819k = p2;
            pVar.f820l = obj2;
            pVar.f823o = 2;
            if (eVar3.a(obj3, pVar) == aVar) {
            }
            obj = obj2;
            sVar2.getClass();
            A.j jVar22222 = r.f826a;
            andSet = s.f828a.getAndSet(sVar2, jVar22222);
            F0.i.b(andSet);
            if (andSet != r.f827b) {
            }
        } catch (Throwable th2) {
            synchronized (qVar) {
                try {
                    int i6 = qVar.f833f - 1;
                    qVar.f833f = i6;
                    if (i6 == 0) {
                        qVar.f834g = 0;
                    }
                    F0.i.c(sVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    s.f828a.set(sVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        pVar = new p(this, dVar);
        Object obj42 = pVar.f821m;
        aVar = x0.a.f3094e;
        i2 = pVar.f823o;
        int i42 = 1;
    }

    @Override // Q0.j
    public final d k(w0.i iVar, int i2, int i3) {
        return ((((i2 < 0 || i2 >= 2) && i2 != -2) || i3 != 2) && !((i2 == 0 || i2 == -3) && i3 == 1)) ? new Q0.h(this, iVar, i2, i3) : this;
    }
}
