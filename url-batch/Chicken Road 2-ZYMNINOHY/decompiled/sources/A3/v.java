package A3;

import c3.C0297i;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x3.C1546f;
import x3.C1559t;
import x3.T;
import x3.d0;

/* loaded from: classes.dex */
public final class v extends B3.b implements s, d, B3.i {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f139e = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public int f140d;

    public v(Object obj) {
        this._state$volatile = obj;
    }

    public final boolean a(Object obj, Object obj2) {
        int i4;
        x[] xVarArr;
        C3.v vVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f139e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.i.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i5 = this.f140d;
            if ((i5 & 1) != 0) {
                this.f140d = i5 + 2;
                return true;
            }
            int i6 = i5 + 1;
            this.f140d = i6;
            x[] xVarArr2 = this.f219a;
            while (true) {
                if (xVarArr2 != null) {
                    for (x xVar : xVarArr2) {
                        if (xVar != null) {
                            AtomicReference atomicReference = xVar.f143a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (vVar = w.f142b)) {
                                    C3.v vVar2 = w.f141a;
                                    if (obj4 != vVar2) {
                                        while (!atomicReference.compareAndSet(obj4, vVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C1546f) obj4).resumeWith(C0297i.f5732a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, vVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i4 = this.f140d;
                    if (i4 == i6) {
                        this.f140d = i6 + 1;
                        return true;
                    }
                    xVarArr = this.f219a;
                }
                xVarArr2 = xVarArr;
                i6 = i4;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e2, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0144, code lost:
    
        if (r5 == r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0147, code lost:
    
        if (r4 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00c6, B:18:0x00ce, B:21:0x00d5, B:22:0x00db, B:26:0x00de, B:28:0x00ff, B:31:0x010f, B:32:0x012b, B:39:0x013b, B:34:0x0132, B:38:0x0138, B:47:0x00e4, B:50:0x00eb, B:58:0x0054, B:60:0x005f, B:61:0x00b7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010f A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00c6, B:18:0x00ce, B:21:0x00d5, B:22:0x00db, B:26:0x00de, B:28:0x00ff, B:31:0x010f, B:32:0x012b, B:39:0x013b, B:34:0x0132, B:38:0x0138, B:47:0x00e4, B:50:0x00eb, B:58:0x0054, B:60:0x005f, B:61:0x00b7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x010e -> B:16:0x00c6). Please report as a decompilation issue!!! */
    @Override // A3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(e eVar, InterfaceC0425c interfaceC0425c) {
        u uVar;
        EnumC0441a enumC0441a;
        int i4;
        x xVar;
        AtomicReference atomicReference;
        e eVar2;
        v vVar;
        x xVar2;
        T t4;
        e eVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (interfaceC0425c instanceof u) {
                uVar = (u) interfaceC0425c;
                int i5 = uVar.f138h;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    uVar.f138h = i5 - Integer.MIN_VALUE;
                    Object obj4 = uVar.f136f;
                    enumC0441a = EnumC0441a.f9038a;
                    i4 = uVar.f138h;
                    int i6 = 3;
                    int i7 = 2;
                    if (i4 != 0) {
                        O3.l.w(obj4);
                        synchronized (this) {
                            try {
                                x[] xVarArr = this.f219a;
                                if (xVarArr == null) {
                                    xVarArr = new x[2];
                                    this.f219a = xVarArr;
                                } else if (this.f220b >= xVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(xVarArr, xVarArr.length * 2);
                                    kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
                                    this.f219a = (x[]) copyOf;
                                    xVarArr = (x[]) copyOf;
                                }
                                int i8 = this.f221c;
                                do {
                                    xVar = xVarArr[i8];
                                    if (xVar == null) {
                                        xVar = new x();
                                        xVarArr[i8] = xVar;
                                    }
                                    i8++;
                                    if (i8 >= xVarArr.length) {
                                        i8 = 0;
                                    }
                                    atomicReference = xVar.f143a;
                                } while (atomicReference.get() != null);
                                atomicReference.set(w.f141a);
                                this.f221c = i8;
                                this.f220b++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        eVar2 = eVar;
                        vVar = this;
                        xVar2 = xVar;
                    } else if (i4 == 1) {
                        xVar2 = uVar.f133c;
                        eVar2 = uVar.f132b;
                        vVar = uVar.f131a;
                        O3.l.w(obj4);
                    } else if (i4 == 2) {
                        obj2 = uVar.f135e;
                        t4 = uVar.f134d;
                        xVar2 = uVar.f133c;
                        eVar3 = uVar.f132b;
                        vVar = uVar.f131a;
                        O3.l.w(obj4);
                        obj = obj2;
                        AtomicReference atomicReference2 = xVar2.f143a;
                        C3.v vVar2 = w.f141a;
                        andSet = atomicReference2.getAndSet(vVar2);
                        kotlin.jvm.internal.i.b(andSet);
                        if (andSet == w.f142b) {
                        }
                    } else {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = uVar.f135e;
                        t4 = uVar.f134d;
                        xVar2 = uVar.f133c;
                        eVar3 = uVar.f132b;
                        vVar = uVar.f131a;
                        O3.l.w(obj4);
                        obj = obj5;
                        i6 = 3;
                        i7 = 2;
                        obj2 = f139e.get(vVar);
                        if (t4 != null && !t4.a()) {
                            throw ((d0) t4).w();
                        }
                        obj3 = obj2 != B3.k.f239a ? null : obj2;
                        uVar.f131a = vVar;
                        uVar.f132b = eVar3;
                        uVar.f133c = xVar2;
                        uVar.f134d = t4;
                        uVar.f135e = obj2;
                        uVar.f138h = i7;
                        if (eVar3.emit(obj3, uVar) == enumC0441a) {
                            return enumC0441a;
                        }
                        obj = obj2;
                        AtomicReference atomicReference22 = xVar2.f143a;
                        C3.v vVar22 = w.f141a;
                        andSet = atomicReference22.getAndSet(vVar22);
                        kotlin.jvm.internal.i.b(andSet);
                        if (andSet == w.f142b) {
                            obj2 = f139e.get(vVar);
                            if (t4 != null) {
                                throw ((d0) t4).w();
                            }
                            if (obj2 != B3.k.f239a) {
                            }
                            uVar.f131a = vVar;
                            uVar.f132b = eVar3;
                            uVar.f133c = xVar2;
                            uVar.f134d = t4;
                            uVar.f135e = obj2;
                            uVar.f138h = i7;
                            if (eVar3.emit(obj3, uVar) == enumC0441a) {
                            }
                            obj = obj2;
                            AtomicReference atomicReference222 = xVar2.f143a;
                            C3.v vVar222 = w.f141a;
                            andSet = atomicReference222.getAndSet(vVar222);
                            kotlin.jvm.internal.i.b(andSet);
                            if (andSet == w.f142b) {
                                uVar.f131a = vVar;
                                uVar.f132b = eVar3;
                                uVar.f133c = xVar2;
                                uVar.f134d = t4;
                                uVar.f135e = obj;
                                uVar.f138h = i6;
                                C0297i c0297i = C0297i.f5732a;
                                C1546f c1546f = new C1546f(1, AbstractC0347t0.m(uVar));
                                c1546f.r();
                                AtomicReference atomicReference3 = xVar2.f143a;
                                while (true) {
                                    if (atomicReference3.compareAndSet(vVar222, c1546f)) {
                                        break;
                                    }
                                    if (atomicReference3.get() != vVar222) {
                                        c1546f.resumeWith(c0297i);
                                        break;
                                    }
                                }
                                Object q4 = c1546f.q();
                                if (q4 == EnumC0441a.f9038a) {
                                }
                            }
                        }
                    }
                    t4 = (T) uVar.getContext().n(C1559t.f16059b);
                    eVar3 = eVar2;
                    obj = null;
                    obj2 = f139e.get(vVar);
                    if (t4 != null) {
                    }
                    if (obj2 != B3.k.f239a) {
                    }
                    uVar.f131a = vVar;
                    uVar.f132b = eVar3;
                    uVar.f133c = xVar2;
                    uVar.f134d = t4;
                    uVar.f135e = obj2;
                    uVar.f138h = i7;
                    if (eVar3.emit(obj3, uVar) == enumC0441a) {
                    }
                    obj = obj2;
                    AtomicReference atomicReference2222 = xVar2.f143a;
                    C3.v vVar2222 = w.f141a;
                    andSet = atomicReference2222.getAndSet(vVar2222);
                    kotlin.jvm.internal.i.b(andSet);
                    if (andSet == w.f142b) {
                    }
                }
            }
            if (i4 != 0) {
            }
            t4 = (T) uVar.getContext().n(C1559t.f16059b);
            eVar3 = eVar2;
            obj = null;
            obj2 = f139e.get(vVar);
            if (t4 != null) {
            }
            if (obj2 != B3.k.f239a) {
            }
            uVar.f131a = vVar;
            uVar.f132b = eVar3;
            uVar.f133c = xVar2;
            uVar.f134d = t4;
            uVar.f135e = obj2;
            uVar.f138h = i7;
            if (eVar3.emit(obj3, uVar) == enumC0441a) {
            }
            obj = obj2;
            AtomicReference atomicReference22222 = xVar2.f143a;
            C3.v vVar22222 = w.f141a;
            andSet = atomicReference22222.getAndSet(vVar22222);
            kotlin.jvm.internal.i.b(andSet);
            if (andSet == w.f142b) {
            }
        } catch (Throwable th2) {
            synchronized (vVar) {
                try {
                    int i9 = vVar.f220b - 1;
                    vVar.f220b = i9;
                    if (i9 == 0) {
                        vVar.f221c = 0;
                    }
                    kotlin.jvm.internal.i.c(xVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    xVar2.f143a.set(null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        uVar = new u(this, interfaceC0425c);
        Object obj42 = uVar.f136f;
        enumC0441a = EnumC0441a.f9038a;
        i4 = uVar.f138h;
        int i62 = 3;
        int i72 = 2;
    }

    @Override // A3.e
    public final Object emit(Object obj, InterfaceC0425c interfaceC0425c) {
        if (obj == null) {
            obj = B3.k.f239a;
        }
        a(null, obj);
        return C0297i.f5732a;
    }
}
