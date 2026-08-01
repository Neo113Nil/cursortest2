package u1;

import H1.l;
import V.q;
import W0.i;
import b1.EnumC0098a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r1.C0355e;
import r1.C0367q;
import r1.N;
import r1.V;

/* loaded from: classes.dex */
public final class f extends v1.a implements b, c {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public int f4395d;

    public f(Object obj) {
        this._state = obj;
    }

    public final void a(Object obj) {
        int i;
        v1.b[] bVarArr;
        q qVar;
        if (obj == null) {
            obj = v1.e.f4450a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (j1.h.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.f4395d;
            if ((i2 & 1) != 0) {
                this.f4395d = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.f4395d = i3;
            v1.b[] bVarArr2 = this.f4444a;
            while (true) {
                h[] hVarArr = (h[]) bVarArr2;
                if (hVarArr != null) {
                    for (h hVar : hVarArr) {
                        if (hVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h.f4398a;
                                Object obj2 = atomicReferenceFieldUpdater2.get(hVar);
                                if (obj2 != null && obj2 != (qVar = g.f4397b)) {
                                    q qVar2 = g.f4396a;
                                    if (obj2 != qVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(hVar, obj2, qVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(hVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0355e) obj2).resumeWith(i.f1345a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(hVar, obj2, qVar)) {
                                        if (atomicReferenceFieldUpdater2.get(hVar) != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f4395d;
                    if (i == i3) {
                        this.f4395d = i3 + 1;
                        return;
                    }
                    bVarArr = this.f4444a;
                }
                bVarArr2 = bVarArr;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e7, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014f, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d3 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cb, B:18:0x00d3, B:21:0x00da, B:22:0x00e0, B:26:0x00e3, B:28:0x0104, B:31:0x0117, B:32:0x012f, B:39:0x0143, B:34:0x013a, B:38:0x0140, B:47:0x00e9, B:50:0x00f0, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0117 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00cb, B:18:0x00d3, B:21:0x00da, B:22:0x00e0, B:26:0x00e3, B:28:0x0104, B:31:0x0117, B:32:0x012f, B:39:0x0143, B:34:0x013a, B:38:0x0140, B:47:0x00e9, B:50:0x00f0, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0116 -> B:16:0x00cb). Please report as a decompilation issue!!! */
    @Override // u1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(c cVar, a1.d dVar) {
        e eVar;
        EnumC0098a enumC0098a;
        int i;
        v1.b bVar;
        h hVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2;
        f fVar;
        h hVar2;
        N n2;
        c cVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (dVar instanceof e) {
                eVar = (e) dVar;
                int i2 = eVar.f4394h;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.f4394h = i2 - Integer.MIN_VALUE;
                    Object obj4 = eVar.f4392f;
                    enumC0098a = EnumC0098a.f2223a;
                    i = eVar.f4394h;
                    int i3 = 1;
                    if (i != 0) {
                        H1.d.i0(obj4);
                        synchronized (this) {
                            try {
                                v1.b[] bVarArr = this.f4444a;
                                if (bVarArr == null) {
                                    bVarArr = new h[2];
                                    this.f4444a = bVarArr;
                                } else if (this.f4445b >= bVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length * 2);
                                    j1.h.d(copyOf, "copyOf(this, newSize)");
                                    this.f4444a = (v1.b[]) copyOf;
                                    bVarArr = (v1.b[]) copyOf;
                                }
                                int i4 = this.f4446c;
                                do {
                                    bVar = bVarArr[i4];
                                    if (bVar == null) {
                                        bVar = new h();
                                        bVarArr[i4] = bVar;
                                    }
                                    i4++;
                                    if (i4 >= bVarArr.length) {
                                        i4 = 0;
                                    }
                                    hVar = (h) bVar;
                                    atomicReferenceFieldUpdater = h.f4398a;
                                } while (atomicReferenceFieldUpdater.get(hVar) != null);
                                atomicReferenceFieldUpdater.set(hVar, g.f4396a);
                                this.f4446c = i4;
                                this.f4445b++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        cVar2 = cVar;
                        fVar = this;
                        hVar2 = (h) bVar;
                    } else if (i == 1) {
                        hVar2 = eVar.f4390c;
                        cVar2 = eVar.f4389b;
                        fVar = eVar.f4388a;
                        H1.d.i0(obj4);
                    } else if (i == 2) {
                        obj2 = eVar.e;
                        n2 = eVar.f4391d;
                        hVar2 = eVar.f4390c;
                        cVar3 = eVar.f4389b;
                        fVar = eVar.f4388a;
                        H1.d.i0(obj4);
                        obj = obj2;
                        hVar2.getClass();
                        q qVar = g.f4396a;
                        andSet = h.f4398a.getAndSet(hVar2, qVar);
                        j1.h.b(andSet);
                        if (andSet != g.f4397b) {
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = eVar.e;
                        n2 = eVar.f4391d;
                        hVar2 = eVar.f4390c;
                        cVar3 = eVar.f4389b;
                        fVar = eVar.f4388a;
                        H1.d.i0(obj4);
                        obj = obj5;
                        i3 = 1;
                        obj2 = e.get(fVar);
                        if (n2 != null && !n2.a()) {
                            throw ((V) n2).o();
                        }
                        obj3 = obj2 == v1.e.f4450a ? null : obj2;
                        eVar.f4388a = fVar;
                        eVar.f4389b = cVar3;
                        eVar.f4390c = hVar2;
                        eVar.f4391d = n2;
                        eVar.e = obj2;
                        eVar.f4394h = 2;
                        if (cVar3.emit(obj3, eVar) == enumC0098a) {
                            return enumC0098a;
                        }
                        obj = obj2;
                        hVar2.getClass();
                        q qVar2 = g.f4396a;
                        andSet = h.f4398a.getAndSet(hVar2, qVar2);
                        j1.h.b(andSet);
                        if (andSet != g.f4397b) {
                            obj2 = e.get(fVar);
                            if (n2 != null) {
                                throw ((V) n2).o();
                            }
                            if (obj2 == v1.e.f4450a) {
                            }
                            eVar.f4388a = fVar;
                            eVar.f4389b = cVar3;
                            eVar.f4390c = hVar2;
                            eVar.f4391d = n2;
                            eVar.e = obj2;
                            eVar.f4394h = 2;
                            if (cVar3.emit(obj3, eVar) == enumC0098a) {
                            }
                            obj = obj2;
                            hVar2.getClass();
                            q qVar22 = g.f4396a;
                            andSet = h.f4398a.getAndSet(hVar2, qVar22);
                            j1.h.b(andSet);
                            if (andSet != g.f4397b) {
                                eVar.f4388a = fVar;
                                eVar.f4389b = cVar3;
                                eVar.f4390c = hVar2;
                                eVar.f4391d = n2;
                                eVar.e = obj;
                                eVar.f4394h = 3;
                                C0355e c0355e = new C0355e(l.C(eVar), i3);
                                c0355e.o();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h.f4398a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(hVar2, qVar22, c0355e);
                                    i iVar = i.f1345a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(hVar2) != qVar22) {
                                        c0355e.resumeWith(iVar);
                                        break;
                                    }
                                }
                                Object n3 = c0355e.n();
                                if (n3 == EnumC0098a.f2223a) {
                                }
                                if (n3 == enumC0098a) {
                                    return enumC0098a;
                                }
                                i3 = 1;
                                obj2 = e.get(fVar);
                                if (n2 != null) {
                                }
                                if (obj2 == v1.e.f4450a) {
                                }
                                eVar.f4388a = fVar;
                                eVar.f4389b = cVar3;
                                eVar.f4390c = hVar2;
                                eVar.f4391d = n2;
                                eVar.e = obj2;
                                eVar.f4394h = 2;
                                if (cVar3.emit(obj3, eVar) == enumC0098a) {
                                }
                                obj = obj2;
                                hVar2.getClass();
                                q qVar222 = g.f4396a;
                                andSet = h.f4398a.getAndSet(hVar2, qVar222);
                                j1.h.b(andSet);
                                if (andSet != g.f4397b) {
                                }
                            }
                        }
                    }
                    n2 = (N) eVar.getContext().d(C0367q.f4090b);
                    cVar3 = cVar2;
                    obj = null;
                    obj2 = e.get(fVar);
                    if (n2 != null) {
                    }
                    if (obj2 == v1.e.f4450a) {
                    }
                    eVar.f4388a = fVar;
                    eVar.f4389b = cVar3;
                    eVar.f4390c = hVar2;
                    eVar.f4391d = n2;
                    eVar.e = obj2;
                    eVar.f4394h = 2;
                    if (cVar3.emit(obj3, eVar) == enumC0098a) {
                    }
                    obj = obj2;
                    hVar2.getClass();
                    q qVar2222 = g.f4396a;
                    andSet = h.f4398a.getAndSet(hVar2, qVar2222);
                    j1.h.b(andSet);
                    if (andSet != g.f4397b) {
                    }
                }
            }
            if (i != 0) {
            }
            n2 = (N) eVar.getContext().d(C0367q.f4090b);
            cVar3 = cVar2;
            obj = null;
            obj2 = e.get(fVar);
            if (n2 != null) {
            }
            if (obj2 == v1.e.f4450a) {
            }
            eVar.f4388a = fVar;
            eVar.f4389b = cVar3;
            eVar.f4390c = hVar2;
            eVar.f4391d = n2;
            eVar.e = obj2;
            eVar.f4394h = 2;
            if (cVar3.emit(obj3, eVar) == enumC0098a) {
            }
            obj = obj2;
            hVar2.getClass();
            q qVar22222 = g.f4396a;
            andSet = h.f4398a.getAndSet(hVar2, qVar22222);
            j1.h.b(andSet);
            if (andSet != g.f4397b) {
            }
        } catch (Throwable th2) {
            synchronized (fVar) {
                try {
                    int i5 = fVar.f4445b - 1;
                    fVar.f4445b = i5;
                    if (i5 == 0) {
                        fVar.f4446c = 0;
                    }
                    j1.h.c(hVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    h.f4398a.set(hVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        eVar = new e(this, dVar);
        Object obj42 = eVar.f4392f;
        enumC0098a = EnumC0098a.f2223a;
        i = eVar.f4394h;
        int i32 = 1;
    }

    @Override // u1.c
    public final Object emit(Object obj, a1.d dVar) {
        a(obj);
        return i.f1345a;
    }
}
