package defpackage;

import android.graphics.RectF;
import defpackage.aa2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ia implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ia(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b5, code lost:
    
        if (r3 == null) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bc  */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.Collection] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        boolean e;
        ld2 ld2Var;
        char c;
        long j;
        char c2;
        long j2;
        ArrayList arrayList;
        char c3 = 7;
        long j3 = -9187201950435737472L;
        Object obj3 = null;
        switch (this.m) {
            case 0:
                ch2 ch2Var = (ch2) this.n;
                w72 L = bd3.L((RectF) obj);
                w72 L2 = bd3.L((RectF) obj2);
                switch (ch2Var.m) {
                    case 6:
                        e = L.e(L2);
                        break;
                    default:
                        long a = L.a();
                        float intBitsToFloat = Float.intBitsToFloat((int) (a >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (a & 4294967295L));
                        e = ((((((intBitsToFloat > L2.c ? 1 : (intBitsToFloat == L2.c ? 0 : -1)) < 0 ? (char) 1 : (char) 0) & ((intBitsToFloat > L2.a ? 1 : (intBitsToFloat == L2.a ? 0 : -1)) >= 0 ? (char) 1 : (char) 0)) == true ? 1 : 0) & ((intBitsToFloat2 > L2.b ? 1 : (intBitsToFloat2 == L2.b ? 0 : -1)) >= 0 ? (char) 1 : (char) 0)) == true ? 1 : 0) & (intBitsToFloat2 < L2.d);
                        break;
                }
                return Boolean.valueOf(e);
            case 1:
                q82 q82Var = (q82) this.n;
                ((Integer) obj).getClass();
                if (obj2 instanceof gz) {
                    gz gzVar = (gz) obj2;
                    un1 un1Var = q82Var.h;
                    if (un1Var == null) {
                        int i = pe2.a;
                        un1Var = new un1();
                        q82Var.h = un1Var;
                    }
                    un1Var.j(gzVar);
                    q82Var.f.b(gzVar);
                }
                if (obj2 instanceof s82) {
                    q82Var.d((s82) obj2);
                }
                if (obj2 instanceof n72) {
                    ((n72) obj2).c();
                }
                return Unit.a;
            case 2:
                ik ikVar = (ik) this.n;
                a00 a00Var = (a00) obj;
                int intValue = ((Integer) obj2).intValue();
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    bd3.a(zv.A(ikVar.v, " · ", null, null, null, 62), a00Var, 0);
                } else {
                    a00Var.S();
                }
                return Unit.a;
            case 3:
                id2 id2Var = (id2) obj;
                List list = (List) ((Function2) this.n).invoke(id2Var, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj4 = list.get(i2);
                    if (obj4 != null && (ld2Var = id2Var.n) != null && !ld2Var.a(obj4)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj4).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 4:
                r72 r72Var = (r72) this.n;
                Set set = (Set) obj;
                synchronized (r72Var.b) {
                    try {
                        if (((o72) r72Var.t.getValue()).compareTo(o72.q) >= 0) {
                            un1 un1Var2 = r72Var.g;
                            if (set instanceof qe2) {
                                un1 un1Var3 = ((qe2) set).m;
                                Object[] objArr = un1Var3.b;
                                long[] jArr = un1Var3.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    Object obj5 = objArr[(i3 << 3) + i5];
                                                    if (!(obj5 instanceof zo2) || ((zo2) obj5).f(1)) {
                                                        un1Var2.a(obj5);
                                                    }
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i4 != 8) {
                                            }
                                        }
                                        if (i3 != length) {
                                            i3++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj6 : set) {
                                    if (!(obj6 instanceof zo2) || ((zo2) obj6).f(1)) {
                                        un1Var2.a(obj6);
                                    }
                                }
                            }
                            obj3 = r72Var.t();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (obj3 != null) {
                    aa2.a aVar = aa2.m;
                    ((fs) obj3).resumeWith(Unit.a);
                }
                return Unit.a;
            case 5:
                vc2 vc2Var = (vc2) this.n;
                int intValue2 = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                g key = element.getKey();
                CoroutineContext.Element m = vc2Var.n.m(key);
                if (key != qb2.U) {
                    if (element != m) {
                        intValue2 = Integer.MIN_VALUE;
                    }
                    intValue2++;
                } else {
                    g61 g61Var = (g61) m;
                    g61 g61Var2 = (g61) element;
                    while (g61Var2 != null) {
                        if (g61Var2 != g61Var && (g61Var2 instanceof we2)) {
                            bu N = ((we2) g61Var2).N();
                            g61Var2 = N != null ? N.getParent() : null;
                        } else {
                            obj3 = g61Var2;
                            if (obj3 == g61Var) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + obj3 + ", expected child of " + g61Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (obj3 == g61Var) {
                    }
                }
                return Integer.valueOf(intValue2);
            case 6:
                zn1 zn1Var = (zn1) this.n;
                a00 a00Var2 = (a00) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (a00Var2.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object M = a00Var2.M();
                    if (M == sz.a) {
                        M = new wj2(zn1Var, 2);
                        a00Var2.i0(M);
                    }
                    s93.q((Function0) M, null, false, null, null, null, s93.g, a00Var2, 805306374);
                } else {
                    a00Var2.S();
                }
                return Unit.a;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                lq lqVar = (lq) this.n;
                Set set2 = (Set) obj;
                if (!(set2 instanceof qe2)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj7 : set3) {
                            if ((obj7 instanceof zo2) && !((zo2) obj7).f(4)) {
                            }
                            lqVar.d(set2);
                        }
                    }
                    return Unit.a;
                }
                un1 un1Var4 = ((qe2) set2).m;
                Object[] objArr2 = un1Var4.b;
                long[] jArr2 = un1Var4.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j5 = jArr2[i6];
                        if ((((~j5) << c3) & j5 & j3) != j3) {
                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j5 & 255) < 128) {
                                    c2 = c3;
                                    Object obj8 = objArr2[(i6 << 3) + i8];
                                    j2 = j3;
                                    if ((obj8 instanceof zo2) && !((zo2) obj8).f(4)) {
                                    }
                                } else {
                                    c2 = c3;
                                    j2 = j3;
                                }
                                j5 >>= 8;
                                i8++;
                                c3 = c2;
                                j3 = j2;
                            }
                            c = c3;
                            j = j3;
                            if (i7 != 8) {
                            }
                        } else {
                            c = c3;
                            j = j3;
                        }
                        if (i6 != length2) {
                            i6++;
                            c3 = c;
                            j3 = j;
                        }
                    }
                }
                return Unit.a;
            case 8:
                hn2 hn2Var = (hn2) this.n;
                Set set4 = (Set) obj;
                AtomicReference atomicReference = hn2Var.b;
                while (true) {
                    Object obj9 = atomicReference.get();
                    if (obj9 == null) {
                        arrayList = set4;
                    } else if (obj9 instanceof Set) {
                        arrayList = qv.g(new Set[]{obj9, set4});
                    } else {
                        if (!(obj9 instanceof List)) {
                            b00.d("Unexpected notification");
                            throw new k81();
                        }
                        arrayList = zv.E((Collection) obj9, pv.c(set4));
                    }
                    while (!atomicReference.compareAndSet(obj9, arrayList)) {
                        if (atomicReference.get() != obj9) {
                            break;
                        }
                    }
                    if (hn2Var.b()) {
                        hn2Var.a.invoke(new dj(15, hn2Var));
                    }
                    return Unit.a;
                    break;
                }
            default:
                char[] cArr = (char[]) this.n;
                CharSequence charSequence = (CharSequence) obj;
                int intValue4 = ((Integer) obj2).intValue();
                charSequence.getClass();
                int x = up2.x(charSequence, cArr, intValue4, false);
                if (x < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(x), 1);
        }
    }
}
