package n0;

import a.AbstractC0016a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.C0044e;
import k0.C0056q;
import k0.K;
import k0.T;

/* loaded from: classes.dex */
public final class g extends o0.a implements c, d {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1105f = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: e, reason: collision with root package name */
    public int f1106e;

    public g(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0152, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d6 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003b, B:16:0x00ce, B:18:0x00d6, B:21:0x00dd, B:22:0x00e3, B:26:0x00e6, B:28:0x0107, B:31:0x011a, B:32:0x0132, B:39:0x0146, B:34:0x013d, B:38:0x0143, B:47:0x00ec, B:50:0x00f3, B:58:0x0056, B:60:0x0061, B:61:0x00be), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003b, B:16:0x00ce, B:18:0x00d6, B:21:0x00dd, B:22:0x00e3, B:26:0x00e6, B:28:0x0107, B:31:0x011a, B:32:0x0132, B:39:0x0146, B:34:0x013d, B:38:0x0143, B:47:0x00ec, B:50:0x00f3, B:58:0x0056, B:60:0x0061, B:61:0x00be), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0119 -> B:16:0x00ce). Please report as a decompilation issue!!! */
    @Override // n0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d dVar, W.d dVar2) {
        f fVar;
        X.a aVar;
        int i2;
        o0.b bVar;
        i iVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d dVar3;
        g gVar;
        i iVar2;
        K k2;
        d dVar4;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (dVar2 instanceof f) {
                fVar = (f) dVar2;
                int i3 = fVar.f1104l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.f1104l = i3 - Integer.MIN_VALUE;
                    Object obj4 = fVar.f1102j;
                    aVar = X.a.f450b;
                    i2 = fVar.f1104l;
                    int i4 = 1;
                    if (i2 != 0) {
                        AbstractC0016a.D(obj4);
                        synchronized (this) {
                            try {
                                o0.b[] bVarArr = this.f1110b;
                                if (bVarArr == null) {
                                    bVarArr = new i[2];
                                    this.f1110b = bVarArr;
                                } else if (this.f1111c >= bVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(bVarArr, bVarArr.length * 2);
                                    e0.h.d(copyOf, "copyOf(this, newSize)");
                                    this.f1110b = (o0.b[]) copyOf;
                                    bVarArr = (o0.b[]) copyOf;
                                }
                                int i5 = this.f1112d;
                                do {
                                    bVar = bVarArr[i5];
                                    if (bVar == null) {
                                        bVar = new i();
                                        bVarArr[i5] = bVar;
                                    }
                                    i5++;
                                    if (i5 >= bVarArr.length) {
                                        i5 = 0;
                                    }
                                    iVar = (i) bVar;
                                    atomicReferenceFieldUpdater = i.f1109a;
                                } while (atomicReferenceFieldUpdater.get(iVar) != null);
                                atomicReferenceFieldUpdater.set(iVar, h.f1107a);
                                this.f1112d = i5;
                                this.f1111c++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        dVar3 = dVar;
                        gVar = this;
                        iVar2 = (i) bVar;
                    } else if (i2 == 1) {
                        iVar2 = fVar.f1099g;
                        dVar3 = fVar.f1098f;
                        gVar = fVar.f1097e;
                        AbstractC0016a.D(obj4);
                    } else if (i2 == 2) {
                        obj2 = fVar.f1101i;
                        k2 = fVar.f1100h;
                        iVar2 = fVar.f1099g;
                        dVar4 = fVar.f1098f;
                        gVar = fVar.f1097e;
                        AbstractC0016a.D(obj4);
                        obj = obj2;
                        iVar2.getClass();
                        io.flutter.plugin.editing.a aVar2 = h.f1107a;
                        andSet = i.f1109a.getAndSet(iVar2, aVar2);
                        e0.h.b(andSet);
                        if (andSet != h.f1108b) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = fVar.f1101i;
                        k2 = fVar.f1100h;
                        iVar2 = fVar.f1099g;
                        dVar4 = fVar.f1098f;
                        gVar = fVar.f1097e;
                        AbstractC0016a.D(obj4);
                        obj = obj5;
                        i4 = 1;
                        obj2 = f1105f.get(gVar);
                        if (k2 != null && !k2.b()) {
                            throw ((T) k2).v();
                        }
                        obj3 = obj2 == o0.e.f1120a ? null : obj2;
                        fVar.f1097e = gVar;
                        fVar.f1098f = dVar4;
                        fVar.f1099g = iVar2;
                        fVar.f1100h = k2;
                        fVar.f1101i = obj2;
                        fVar.f1104l = 2;
                        if (dVar4.b(obj3, fVar) == aVar) {
                            return aVar;
                        }
                        obj = obj2;
                        iVar2.getClass();
                        io.flutter.plugin.editing.a aVar22 = h.f1107a;
                        andSet = i.f1109a.getAndSet(iVar2, aVar22);
                        e0.h.b(andSet);
                        if (andSet != h.f1108b) {
                            obj2 = f1105f.get(gVar);
                            if (k2 != null) {
                                throw ((T) k2).v();
                            }
                            if (obj2 == o0.e.f1120a) {
                            }
                            fVar.f1097e = gVar;
                            fVar.f1098f = dVar4;
                            fVar.f1099g = iVar2;
                            fVar.f1100h = k2;
                            fVar.f1101i = obj2;
                            fVar.f1104l = 2;
                            if (dVar4.b(obj3, fVar) == aVar) {
                            }
                            obj = obj2;
                            iVar2.getClass();
                            io.flutter.plugin.editing.a aVar222 = h.f1107a;
                            andSet = i.f1109a.getAndSet(iVar2, aVar222);
                            e0.h.b(andSet);
                            if (andSet != h.f1108b) {
                                fVar.f1097e = gVar;
                                fVar.f1098f = dVar4;
                                fVar.f1099g = iVar2;
                                fVar.f1100h = k2;
                                fVar.f1101i = obj;
                                fVar.f1104l = 3;
                                C0044e c0044e = new C0044e(AbstractC0016a.t(fVar), i4);
                                c0044e.q();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f1109a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(iVar2, aVar222, c0044e);
                                    U.g gVar2 = U.g.f433a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(iVar2) != aVar222) {
                                        c0044e.d(gVar2);
                                        break;
                                    }
                                }
                                Object p2 = c0044e.p();
                                if (p2 == X.a.f450b) {
                                }
                                if (p2 == aVar) {
                                    return aVar;
                                }
                                i4 = 1;
                                obj2 = f1105f.get(gVar);
                                if (k2 != null) {
                                }
                                if (obj2 == o0.e.f1120a) {
                                }
                                fVar.f1097e = gVar;
                                fVar.f1098f = dVar4;
                                fVar.f1099g = iVar2;
                                fVar.f1100h = k2;
                                fVar.f1101i = obj2;
                                fVar.f1104l = 2;
                                if (dVar4.b(obj3, fVar) == aVar) {
                                }
                                obj = obj2;
                                iVar2.getClass();
                                io.flutter.plugin.editing.a aVar2222 = h.f1107a;
                                andSet = i.f1109a.getAndSet(iVar2, aVar2222);
                                e0.h.b(andSet);
                                if (andSet != h.f1108b) {
                                }
                            }
                        }
                    }
                    W.i iVar3 = fVar.f454c;
                    e0.h.b(iVar3);
                    k2 = (K) iVar3.k(C0056q.f936c);
                    dVar4 = dVar3;
                    obj = null;
                    obj2 = f1105f.get(gVar);
                    if (k2 != null) {
                    }
                    if (obj2 == o0.e.f1120a) {
                    }
                    fVar.f1097e = gVar;
                    fVar.f1098f = dVar4;
                    fVar.f1099g = iVar2;
                    fVar.f1100h = k2;
                    fVar.f1101i = obj2;
                    fVar.f1104l = 2;
                    if (dVar4.b(obj3, fVar) == aVar) {
                    }
                    obj = obj2;
                    iVar2.getClass();
                    io.flutter.plugin.editing.a aVar22222 = h.f1107a;
                    andSet = i.f1109a.getAndSet(iVar2, aVar22222);
                    e0.h.b(andSet);
                    if (andSet != h.f1108b) {
                    }
                }
            }
            if (i2 != 0) {
            }
            W.i iVar32 = fVar.f454c;
            e0.h.b(iVar32);
            k2 = (K) iVar32.k(C0056q.f936c);
            dVar4 = dVar3;
            obj = null;
            obj2 = f1105f.get(gVar);
            if (k2 != null) {
            }
            if (obj2 == o0.e.f1120a) {
            }
            fVar.f1097e = gVar;
            fVar.f1098f = dVar4;
            fVar.f1099g = iVar2;
            fVar.f1100h = k2;
            fVar.f1101i = obj2;
            fVar.f1104l = 2;
            if (dVar4.b(obj3, fVar) == aVar) {
            }
            obj = obj2;
            iVar2.getClass();
            io.flutter.plugin.editing.a aVar222222 = h.f1107a;
            andSet = i.f1109a.getAndSet(iVar2, aVar222222);
            e0.h.b(andSet);
            if (andSet != h.f1108b) {
            }
        } catch (Throwable th2) {
            synchronized (gVar) {
                try {
                    int i6 = gVar.f1111c - 1;
                    gVar.f1111c = i6;
                    if (i6 == 0) {
                        gVar.f1112d = 0;
                    }
                    e0.h.c(iVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    i.f1109a.set(iVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        fVar = new f(this, (Y.b) dVar2);
        Object obj42 = fVar.f1102j;
        aVar = X.a.f450b;
        i2 = fVar.f1104l;
        int i42 = 1;
    }

    @Override // n0.d
    public final Object b(Object obj, Y.b bVar) {
        c(obj);
        return U.g.f433a;
    }

    public final void c(Object obj) {
        int i2;
        o0.b[] bVarArr;
        io.flutter.plugin.editing.a aVar;
        if (obj == null) {
            obj = o0.e.f1120a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1105f;
            if (e0.h.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i3 = this.f1106e;
            if ((i3 & 1) != 0) {
                this.f1106e = i3 + 2;
                return;
            }
            int i4 = i3 + 1;
            this.f1106e = i4;
            o0.b[] bVarArr2 = this.f1110b;
            while (true) {
                i[] iVarArr = (i[]) bVarArr2;
                if (iVarArr != null) {
                    for (i iVar : iVarArr) {
                        if (iVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f1109a;
                                Object obj2 = atomicReferenceFieldUpdater2.get(iVar);
                                if (obj2 != null && obj2 != (aVar = h.f1108b)) {
                                    io.flutter.plugin.editing.a aVar2 = h.f1107a;
                                    if (obj2 != aVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(iVar, obj2, aVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(iVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0044e) obj2).d(U.g.f433a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(iVar, obj2, aVar)) {
                                        if (atomicReferenceFieldUpdater2.get(iVar) != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f1106e;
                    if (i2 == i4) {
                        this.f1106e = i4 + 1;
                        return;
                    }
                    bVarArr = this.f1110b;
                }
                bVarArr2 = bVarArr;
                i4 = i2;
            }
        }
    }
}
