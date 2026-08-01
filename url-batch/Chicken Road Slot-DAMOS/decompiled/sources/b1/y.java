package b1;

import ge.c1;
import ge.k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.e2;
import n0.s1;
import n0.v1;
import n0.y0;
import n0.z1;
import s.q0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1045e;

    public /* synthetic */ y(int i3, int i10, Object obj) {
        this.f1044d = i10;
        this.f1045e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x02d4, code lost:
    
        if (r3 == null) goto L173;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02db  */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.Collection] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        char c10;
        char c11;
        char c12 = 7;
        c1 c1Var = null;
        r12 = null;
        r12 = null;
        r12 = null;
        ie.o oVar = null;
        ge.f fVar = null;
        switch (this.f1044d) {
            case 0:
                b0 b0Var = (b0) this.f1045e;
                Set set = (Set) obj;
                AtomicReference atomicReference = b0Var.f946b;
                while (true) {
                    Object obj3 = atomicReference.get();
                    if (obj3 == null) {
                        arrayList = set;
                    } else if (obj3 instanceof Set) {
                        arrayList = kotlin.collections.y.f(new Set[]{obj3, set});
                    } else {
                        if (!(obj3 instanceof List)) {
                            n0.m.b("Unexpected notification");
                            throw new hd.d();
                        }
                        arrayList = CollectionsKt.G((Collection) obj3, kotlin.collections.x.c(set));
                    }
                    while (!atomicReference.compareAndSet(obj3, arrayList)) {
                        if (atomicReference.get() != obj3) {
                            break;
                        }
                    }
                    if (b0Var.b()) {
                        b0Var.f945a.invoke(new a1.b(3, b0Var));
                    }
                    return Unit.f5554a;
                    break;
                }
            case 1:
                ke.q qVar = (ke.q) this.f1045e;
                int intValue = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                kotlin.coroutines.f key = element.getKey();
                CoroutineContext.Element m10 = qVar.f5543e.m(key);
                if (key != ge.u.f4403e) {
                    if (element != m10) {
                        intValue = Integer.MIN_VALUE;
                    }
                    intValue++;
                } else {
                    c1 c1Var2 = (c1) m10;
                    c1 c1Var3 = (c1) element;
                    while (c1Var3 != null) {
                        if (c1Var3 != c1Var2 && (c1Var3 instanceof le.r)) {
                            ge.k kVar = (ge.k) k1.f4375e.get((le.r) c1Var3);
                            c1Var3 = kVar != null ? kVar.getParent() : null;
                        } else {
                            c1Var = c1Var3;
                            if (c1Var == c1Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + c1Var + ", expected child of " + c1Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (c1Var == c1Var2) {
                    }
                }
                return Integer.valueOf(intValue);
            case 2:
                c6.q qVar2 = (c6.q) this.f1045e;
                ((Integer) obj).getClass();
                if (obj2 instanceof n0.i) {
                    n0.i iVar = (n0.i) obj2;
                    s.i0 i0Var = (s.i0) qVar2.f1863h;
                    if (i0Var == null) {
                        int i3 = q0.f8360a;
                        i0Var = new s.i0();
                        qVar2.f1863h = i0Var;
                    }
                    i0Var.i(iVar);
                    ((o0.e) qVar2.f1862f).b(iVar);
                }
                if (obj2 instanceof n0.l0) {
                    qVar2.d((n0.l0) obj2);
                }
                if (obj2 instanceof s1) {
                    ((s1) obj2).c();
                }
                return Unit.f5554a;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                n0.i0 i0Var2 = (n0.i0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (i0Var2.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    throw null;
                }
                i0Var2.R();
                return Unit.f5554a;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                y0 y0Var = (y0) this.f1045e;
                Set set2 = (Set) obj;
                synchronized (y0Var.f1478d) {
                    try {
                        s.h0 h0Var = y0Var.f6855e;
                        b0.l0 l0Var = new b0.l0(9, set2, y0Var);
                        wd.g0.c(1, l0Var);
                        Object[] objArr = h0Var.f8313b;
                        long[] jArr = h0Var.f8312a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j = jArr[i10];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((j & 255) < 128) {
                                            l0Var.invoke(objArr[(i10 << 3) + i12]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i11 != 8) {
                                    }
                                }
                                if (i10 != length) {
                                    i10++;
                                }
                            }
                        }
                        s.i0 i0Var3 = y0Var.f6857r;
                        Object[] objArr2 = i0Var3.f8320b;
                        long[] jArr2 = i0Var3.f8319a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j3 = jArr2[i13];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        if ((j3 & 255) < 128) {
                                            ((ie.o) objArr2[(i13 << 3) + i15]).b(Unit.f5554a);
                                        }
                                        j3 >>= 8;
                                    }
                                    if (i14 != 8) {
                                    }
                                }
                                if (i13 != length2) {
                                    i13++;
                                }
                            }
                        }
                        y0Var.f6857r.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                z1 z1Var = (z1) this.f1045e;
                Set set3 = (Set) obj;
                synchronized (z1Var.f6877c) {
                    try {
                        if (((v1) z1Var.f6893u.getValue()).compareTo(v1.f6828s) >= 0) {
                            s.i0 i0Var4 = z1Var.f6881h;
                            if (set3 instanceof o0.h) {
                                s.i0 i0Var5 = ((o0.h) set3).f7331d;
                                Object[] objArr3 = i0Var5.f8320b;
                                long[] jArr3 = i0Var5.f8319a;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i16 = 0;
                                    while (true) {
                                        long j10 = jArr3[i16];
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                            for (int i18 = 0; i18 < i17; i18++) {
                                                if ((j10 & 255) < 128) {
                                                    Object obj4 = objArr3[(i16 << 3) + i18];
                                                    if (!(obj4 instanceof g0) || ((g0) obj4).f(1)) {
                                                        i0Var4.a(obj4);
                                                    }
                                                }
                                                j10 >>= 8;
                                            }
                                            if (i17 == 8) {
                                            }
                                        }
                                        if (i16 != length3) {
                                            i16++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set3) {
                                    if (!(obj5 instanceof g0) || ((g0) obj5).f(1)) {
                                        i0Var4.a(obj5);
                                    }
                                }
                            }
                            fVar = z1Var.v();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (fVar != null) {
                    hd.l lVar = hd.n.f4511e;
                    ((ge.h) fVar).resumeWith(Unit.f5554a);
                }
                return Unit.f5554a;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                e2 e2Var = (e2) this.f1045e;
                Set set4 = (Set) obj;
                synchronized (e2Var.f1478d) {
                    try {
                        s.i0 i0Var6 = e2Var.f6672r;
                        if (i0Var6 != null) {
                            Object[] objArr4 = i0Var6.f8320b;
                            long[] jArr4 = i0Var6.f8319a;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i19 = 0;
                                while (true) {
                                    long j11 = jArr4[i19];
                                    if ((((~j11) << c12) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i20 = 8 - ((~(i19 - length4)) >>> 31);
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 < i20) {
                                                if ((j11 & 255) < 128) {
                                                    c11 = c12;
                                                    if (set4.contains(objArr4[(i19 << 3) + i21])) {
                                                        oVar = e2Var.f6674t;
                                                    }
                                                } else {
                                                    c11 = c12;
                                                }
                                                j11 >>= 8;
                                                i21++;
                                                c12 = c11;
                                            } else {
                                                c10 = c12;
                                                if (i20 != 8) {
                                                }
                                            }
                                        }
                                    } else {
                                        c10 = c12;
                                    }
                                    if (i19 != length4) {
                                        i19++;
                                        c12 = c10;
                                    }
                                }
                            }
                        } else if (CollectionsKt.u(set4, e2Var.f6670e)) {
                            oVar = e2Var.f6674t;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (oVar != null) {
                    oVar.b(Unit.f5554a);
                }
                return Unit.f5554a;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Function1) this.f1045e).invoke(obj);
                return Unit.f5554a;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                ((Integer) obj2).getClass();
                z4.w.b((o4.o) this.f1045e, (n0.i0) obj, n0.h.z(1));
                return Unit.f5554a;
            case 9:
                ((Integer) obj2).getClass();
                cf.c.d((q9.a) this.f1045e, (n0.i0) obj, n0.h.z(1));
                return Unit.f5554a;
            default:
                ((Integer) obj2).getClass();
                c6.f.b((Function0) this.f1045e, (n0.i0) obj, n0.h.z(1));
                return Unit.f5554a;
        }
    }

    public /* synthetic */ y(int i3, Object obj) {
        this.f1044d = i3;
        this.f1045e = obj;
    }
}
