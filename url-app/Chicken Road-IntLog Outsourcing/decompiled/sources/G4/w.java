package G4;

import D4.C0007g;
import D4.C0021v;
import D4.X;
import D4.g0;
import G0.C0051a;
import H4.AbstractC0071b;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class w extends AbstractC0071b implements s, d, H4.q {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1114e = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public int f1115d;

    public w(Object obj) {
        this._state = obj;
    }

    @Override // H4.q
    public final d a(InterfaceC1223i interfaceC1223i, int i2, int i3) {
        return x.e(this, interfaceC1223i, i2, i3);
    }

    @Override // G4.e
    public final Object b(Object obj, InterfaceC1218d interfaceC1218d) {
        if (obj == null) {
            obj = H4.t.f1201a;
        }
        c(null, obj);
        return f4.v.f5689a;
    }

    public final boolean c(Object obj, Object obj2) {
        int i2;
        H4.c[] cVarArr;
        C0051a c0051a;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1114e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.i.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f1115d;
            if ((i3 & 1) != 0) {
                this.f1115d = i3 + 2;
                return true;
            }
            int i6 = i3 + 1;
            this.f1115d = i6;
            H4.c[] cVarArr2 = this.f1162a;
            while (true) {
                y[] yVarArr = (y[]) cVarArr2;
                if (yVarArr != null) {
                    for (y yVar : yVarArr) {
                        if (yVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y.f1118a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(yVar);
                                if (obj4 != null && obj4 != (c0051a = x.f1117b)) {
                                    C0051a c0051a2 = x.f1116a;
                                    if (obj4 != c0051a2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(yVar, obj4, c0051a2)) {
                                            if (atomicReferenceFieldUpdater2.get(yVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0007g) obj4).resumeWith(f4.v.f5689a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(yVar, obj4, c0051a)) {
                                        if (atomicReferenceFieldUpdater2.get(yVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f1115d;
                    if (i2 == i6) {
                        this.f1115d = i6 + 1;
                        return true;
                    }
                    cVarArr = this.f1162a;
                }
                cVarArr2 = cVarArr;
                i6 = i2;
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
    @Override // G4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(e eVar, InterfaceC1218d interfaceC1218d) {
        v vVar;
        EnumC1260a enumC1260a;
        int i2;
        H4.c cVar;
        y yVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e eVar2;
        w wVar;
        y yVar2;
        X x5;
        e eVar3;
        Object obj;
        Object obj2;
        Object andSet;
        Object obj3;
        try {
            if (interfaceC1218d instanceof v) {
                vVar = (v) interfaceC1218d;
                int i3 = vVar.f1113h;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    vVar.f1113h = i3 - Integer.MIN_VALUE;
                    Object obj4 = vVar.f1111f;
                    enumC1260a = EnumC1260a.f11058a;
                    i2 = vVar.f1113h;
                    int i6 = 1;
                    if (i2 != 0) {
                        e5.g.y(obj4);
                        synchronized (this) {
                            try {
                                H4.c[] cVarArr = this.f1162a;
                                if (cVarArr == null) {
                                    cVarArr = new y[2];
                                    this.f1162a = cVarArr;
                                } else if (this.f1163b >= cVarArr.length) {
                                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                                    kotlin.jvm.internal.i.d(copyOf, "copyOf(this, newSize)");
                                    this.f1162a = (H4.c[]) copyOf;
                                    cVarArr = (H4.c[]) copyOf;
                                }
                                int i7 = this.f1164c;
                                do {
                                    cVar = cVarArr[i7];
                                    if (cVar == null) {
                                        cVar = new y();
                                        cVarArr[i7] = cVar;
                                    }
                                    i7++;
                                    if (i7 >= cVarArr.length) {
                                        i7 = 0;
                                    }
                                    yVar = (y) cVar;
                                    atomicReferenceFieldUpdater = y.f1118a;
                                } while (atomicReferenceFieldUpdater.get(yVar) != null);
                                atomicReferenceFieldUpdater.set(yVar, x.f1116a);
                                this.f1164c = i7;
                                this.f1163b++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        eVar2 = eVar;
                        wVar = this;
                        yVar2 = (y) cVar;
                    } else if (i2 == 1) {
                        yVar2 = vVar.f1108c;
                        eVar2 = vVar.f1107b;
                        wVar = vVar.f1106a;
                        e5.g.y(obj4);
                    } else if (i2 == 2) {
                        obj2 = vVar.f1110e;
                        x5 = vVar.f1109d;
                        yVar2 = vVar.f1108c;
                        eVar3 = vVar.f1107b;
                        wVar = vVar.f1106a;
                        e5.g.y(obj4);
                        obj = obj2;
                        yVar2.getClass();
                        C0051a c0051a = x.f1116a;
                        andSet = y.f1118a.getAndSet(yVar2, c0051a);
                        kotlin.jvm.internal.i.b(andSet);
                        if (andSet != x.f1117b) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj5 = vVar.f1110e;
                        x5 = vVar.f1109d;
                        yVar2 = vVar.f1108c;
                        eVar3 = vVar.f1107b;
                        wVar = vVar.f1106a;
                        e5.g.y(obj4);
                        obj = obj5;
                        i6 = 1;
                        obj2 = f1114e.get(wVar);
                        if (x5 != null && !x5.a()) {
                            throw ((g0) x5).x();
                        }
                        obj3 = obj2 == H4.t.f1201a ? null : obj2;
                        vVar.f1106a = wVar;
                        vVar.f1107b = eVar3;
                        vVar.f1108c = yVar2;
                        vVar.f1109d = x5;
                        vVar.f1110e = obj2;
                        vVar.f1113h = 2;
                        if (eVar3.b(obj3, vVar) == enumC1260a) {
                            return enumC1260a;
                        }
                        obj = obj2;
                        yVar2.getClass();
                        C0051a c0051a2 = x.f1116a;
                        andSet = y.f1118a.getAndSet(yVar2, c0051a2);
                        kotlin.jvm.internal.i.b(andSet);
                        if (andSet != x.f1117b) {
                            obj2 = f1114e.get(wVar);
                            if (x5 != null) {
                                throw ((g0) x5).x();
                            }
                            if (obj2 == H4.t.f1201a) {
                            }
                            vVar.f1106a = wVar;
                            vVar.f1107b = eVar3;
                            vVar.f1108c = yVar2;
                            vVar.f1109d = x5;
                            vVar.f1110e = obj2;
                            vVar.f1113h = 2;
                            if (eVar3.b(obj3, vVar) == enumC1260a) {
                            }
                            obj = obj2;
                            yVar2.getClass();
                            C0051a c0051a22 = x.f1116a;
                            andSet = y.f1118a.getAndSet(yVar2, c0051a22);
                            kotlin.jvm.internal.i.b(andSet);
                            if (andSet != x.f1117b) {
                                vVar.f1106a = wVar;
                                vVar.f1107b = eVar3;
                                vVar.f1108c = yVar2;
                                vVar.f1109d = x5;
                                vVar.f1110e = obj;
                                vVar.f1113h = 3;
                                C0007g c0007g = new C0007g(i6, B0.f.F(vVar));
                                c0007g.s();
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y.f1118a;
                                    boolean compareAndSet = atomicReferenceFieldUpdater2.compareAndSet(yVar2, c0051a22, c0007g);
                                    f4.v vVar2 = f4.v.f5689a;
                                    if (compareAndSet) {
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(yVar2) != c0051a22) {
                                        c0007g.resumeWith(vVar2);
                                        break;
                                    }
                                }
                                Object r5 = c0007g.r();
                                if (r5 == EnumC1260a.f11058a) {
                                }
                                if (r5 == enumC1260a) {
                                    return enumC1260a;
                                }
                                i6 = 1;
                                obj2 = f1114e.get(wVar);
                                if (x5 != null) {
                                }
                                if (obj2 == H4.t.f1201a) {
                                }
                                vVar.f1106a = wVar;
                                vVar.f1107b = eVar3;
                                vVar.f1108c = yVar2;
                                vVar.f1109d = x5;
                                vVar.f1110e = obj2;
                                vVar.f1113h = 2;
                                if (eVar3.b(obj3, vVar) == enumC1260a) {
                                }
                                obj = obj2;
                                yVar2.getClass();
                                C0051a c0051a222 = x.f1116a;
                                andSet = y.f1118a.getAndSet(yVar2, c0051a222);
                                kotlin.jvm.internal.i.b(andSet);
                                if (andSet != x.f1117b) {
                                }
                            }
                        }
                    }
                    x5 = (X) vVar.getContext().o(C0021v.f545b);
                    eVar3 = eVar2;
                    obj = null;
                    obj2 = f1114e.get(wVar);
                    if (x5 != null) {
                    }
                    if (obj2 == H4.t.f1201a) {
                    }
                    vVar.f1106a = wVar;
                    vVar.f1107b = eVar3;
                    vVar.f1108c = yVar2;
                    vVar.f1109d = x5;
                    vVar.f1110e = obj2;
                    vVar.f1113h = 2;
                    if (eVar3.b(obj3, vVar) == enumC1260a) {
                    }
                    obj = obj2;
                    yVar2.getClass();
                    C0051a c0051a2222 = x.f1116a;
                    andSet = y.f1118a.getAndSet(yVar2, c0051a2222);
                    kotlin.jvm.internal.i.b(andSet);
                    if (andSet != x.f1117b) {
                    }
                }
            }
            if (i2 != 0) {
            }
            x5 = (X) vVar.getContext().o(C0021v.f545b);
            eVar3 = eVar2;
            obj = null;
            obj2 = f1114e.get(wVar);
            if (x5 != null) {
            }
            if (obj2 == H4.t.f1201a) {
            }
            vVar.f1106a = wVar;
            vVar.f1107b = eVar3;
            vVar.f1108c = yVar2;
            vVar.f1109d = x5;
            vVar.f1110e = obj2;
            vVar.f1113h = 2;
            if (eVar3.b(obj3, vVar) == enumC1260a) {
            }
            obj = obj2;
            yVar2.getClass();
            C0051a c0051a22222 = x.f1116a;
            andSet = y.f1118a.getAndSet(yVar2, c0051a22222);
            kotlin.jvm.internal.i.b(andSet);
            if (andSet != x.f1117b) {
            }
        } catch (Throwable th2) {
            synchronized (wVar) {
                try {
                    int i8 = wVar.f1163b - 1;
                    wVar.f1163b = i8;
                    if (i8 == 0) {
                        wVar.f1164c = 0;
                    }
                    kotlin.jvm.internal.i.c(yVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                    y.f1118a.set(yVar2, null);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        vVar = new v(this, interfaceC1218d);
        Object obj42 = vVar.f1111f;
        enumC1260a = EnumC1260a.f11058a;
        i2 = vVar.f1113h;
        int i62 = 1;
    }
}
