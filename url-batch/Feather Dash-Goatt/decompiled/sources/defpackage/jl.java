package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.feathherdashh.dashgame.MainActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class jl implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jl(int i, int i2, Object obj) {
        this.d = i2;
        this.e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x018d, code lost:
    
        if (r6 == null) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0194  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        t51 t51Var;
        char c;
        long j;
        char c2;
        long j2;
        Collection u;
        char c3 = 7;
        long j3 = -9187201950435737472L;
        int i = 4;
        Object obj3 = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i21 i21Var = (i21) this.e;
                ((Integer) obj).getClass();
                if (obj2 instanceof mk) {
                    mk mkVar = (mk) obj2;
                    wn0 wn0Var = i21Var.h;
                    if (wn0Var == null) {
                        wn0 wn0Var2 = r61.a;
                        wn0Var = new wn0();
                        i21Var.h = wn0Var;
                    }
                    wn0Var.k(mkVar);
                    i21Var.f.b(mkVar);
                }
                if (obj2 instanceof k21) {
                    i21Var.e((k21) obj2);
                }
                if (obj2 instanceof i11) {
                    ((i11) obj2).c();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                ((j80) this.e).a(gb0.P(1), (hl) obj);
                return Unit.a;
            case 2:
                o51 o51Var = (o51) obj;
                List list = (List) ((e9) this.e).b(o51Var, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj4 = list.get(i2);
                    if (obj4 != null && (t51Var = o51Var.e) != null && !t51Var.b(obj4)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj4).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            case 3:
                final MainActivity mainActivity = (MainActivity) this.e;
                hl hlVar = (hl) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = MainActivity.x;
                if (hlVar.O(intValue & 1, (intValue & 3) != 2)) {
                    final av0 av0Var = mainActivity.w;
                    Object L = hlVar.L();
                    j41 j41Var = bl.a;
                    if (L == j41Var) {
                        Context applicationContext = mainActivity.getApplicationContext();
                        applicationContext.getClass();
                        L = new nd1(applicationContext);
                        hlVar.h0(L);
                    }
                    final nd1 nd1Var = (nd1) L;
                    Object L2 = hlVar.L();
                    if (L2 == j41Var) {
                        if (StringsKt.n("Y3QpwEjUs62TcwetHHmRJf")) {
                            L2 = new kv();
                        } else {
                            Context applicationContext2 = mainActivity.getApplicationContext();
                            applicationContext2.getClass();
                            L2 = new ax(applicationContext2);
                        }
                        hlVar.h0(L2);
                    }
                    final ka kaVar = (ka) L2;
                    Object L3 = hlVar.L();
                    if (L3 == j41Var) {
                        Context applicationContext3 = mainActivity.getApplicationContext();
                        applicationContext3.getClass();
                        L3 = new rz(applicationContext3);
                        hlVar.h0(L3);
                    }
                    final rz rzVar = (rz) L3;
                    Object L4 = hlVar.L();
                    if (L4 == j41Var) {
                        L4 = new ix();
                        hlVar.h0(L4);
                    }
                    final ix ixVar = (ix) L4;
                    zh1.a(false, false, m90.J(-1789774307, new Function2() { // from class: nj0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object b(Object obj5, Object obj6) {
                            hl hlVar2 = (hl) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            int i4 = MainActivity.x;
                            if (hlVar2.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                                final nd1 nd1Var2 = nd1.this;
                                final ka kaVar2 = kaVar;
                                final rz rzVar2 = rzVar;
                                final ix ixVar2 = ixVar;
                                final MainActivity mainActivity2 = mainActivity;
                                final ao0 ao0Var = av0Var;
                                yr1.o(m90.J(1127385421, new s30() { // from class: oj0
                                    @Override // defpackage.s30
                                    public final Object a(Object obj7, Object obj8, Object obj9) {
                                        hl hlVar3 = (hl) obj8;
                                        int intValue3 = ((Integer) obj9).intValue();
                                        int i5 = MainActivity.x;
                                        ((zd) obj7).getClass();
                                        int i6 = 1;
                                        if (hlVar3.O(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            Intent intent = (Intent) ao0Var.getValue();
                                            MainActivity mainActivity3 = mainActivity2;
                                            boolean h = hlVar3.h(mainActivity3);
                                            Object L5 = hlVar3.L();
                                            Object obj10 = bl.a;
                                            if (h || L5 == obj10) {
                                                L5 = new nj(mainActivity3, i6);
                                                hlVar3.h0(L5);
                                            }
                                            Function0 function0 = (Function0) L5;
                                            boolean h2 = hlVar3.h(mainActivity3);
                                            Object L6 = hlVar3.L();
                                            if (h2 || L6 == obj10) {
                                                Object v3Var = new v3(0, mainActivity3, MainActivity.class, "finishAndRemoveTask", "finishAndRemoveTask()V", 0, 8);
                                                hlVar3.h0(v3Var);
                                                L6 = v3Var;
                                            }
                                            gb0.c(nd1.this, kaVar2, rzVar2, ixVar2, intent, function0, (Function0) ((b40) L6), hlVar3, 3072);
                                        } else {
                                            hlVar3.R();
                                        }
                                        return Unit.a;
                                    }
                                }, hlVar2), hlVar2, 6);
                            } else {
                                hlVar2.R();
                            }
                            return Unit.a;
                        }
                    }, hlVar), hlVar, 384);
                } else {
                    hlVar.R();
                }
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                yr1.r((ia) this.e, (hl) obj, gb0.P(1));
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                s6 s6Var = (s6) this.e;
                hl hlVar2 = (hl) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (hlVar2.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    am0 a = xa1.a(xl0.a, 1.0f);
                    Object L5 = hlVar2.L();
                    j41 j41Var2 = bl.a;
                    if (L5 == j41Var2) {
                        L5 = new gn0();
                        hlVar2.h0(L5);
                    }
                    gn0 gn0Var = (gn0) L5;
                    boolean h = hlVar2.h(s6Var);
                    Object L6 = hlVar2.L();
                    if (h || L6 == j41Var2) {
                        L6 = new i6(i, s6Var);
                        hlVar2.h0(L6);
                    }
                    eh1.b("https://featherrdash.com/privacy-policy.html", yr1.R(p4.v(a, gn0Var, false, (Function0) L6, 28), 18.0f), la0.d(4278672347L), t80.x(16), x20.k, null, 0L, new tg1(3), 0L, 0, false, 0, 0, null, hlVar2, 1597830, 0, 261032);
                } else {
                    hlVar2.R();
                }
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                o11 o11Var = (o11) this.e;
                Set set = (Set) obj;
                synchronized (o11Var.c) {
                    try {
                        if (((k11) o11Var.u.getValue()).compareTo(k11.i) >= 0) {
                            wn0 wn0Var3 = o11Var.h;
                            if (set instanceof s61) {
                                wn0 wn0Var4 = ((s61) set).d;
                                Object[] objArr = wn0Var4.b;
                                long[] jArr = wn0Var4.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr[i4];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                                            for (int i6 = 0; i6 < i5; i6++) {
                                                if ((j4 & 255) < 128) {
                                                    Object obj5 = objArr[(i4 << 3) + i6];
                                                    if (!(obj5 instanceof he1) || ((he1) obj5).f(1)) {
                                                        wn0Var3.a(obj5);
                                                    }
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i5 != 8) {
                                            }
                                        }
                                        if (i4 != length) {
                                            i4++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj6 : set) {
                                    if (!(obj6 instanceof he1) || ((he1) obj6).f(1)) {
                                        wn0Var3.a(obj6);
                                    }
                                }
                            }
                            obj3 = o11Var.y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (obj3 != null) {
                    i31 i31Var = k31.d;
                    ((tf) obj3).l(Unit.a);
                }
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                d51 d51Var = (d51) this.e;
                int intValue3 = ((Integer) obj).intValue();
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                f key = element.getKey();
                Object d = d51Var.i.d(key);
                if (key != j41.m) {
                    if (element != d) {
                        intValue3 = Integer.MIN_VALUE;
                    }
                    intValue3++;
                } else {
                    Object obj7 = (jb0) d;
                    Object obj8 = (jb0) element;
                    while (obj8 != null) {
                        if (obj8 != obj7 && (obj8 instanceof y61)) {
                            tg Q = ((y61) obj8).Q();
                            obj8 = Q != null ? Q.getParent() : null;
                        } else {
                            obj3 = obj8;
                            if (obj3 == obj7) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + obj3 + ", expected child of " + obj7 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (obj3 == obj7) {
                    }
                }
                return Integer.valueOf(intValue3);
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                v71 v71Var = (v71) this.e;
                uq1.N(v71Var.n0(), null, new u71(v71Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case 9:
                we weVar = (we) this.e;
                Set set2 = (Set) obj;
                if (!(set2 instanceof s61)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj9 : set3) {
                            if ((obj9 instanceof he1) && !((he1) obj9).f(4)) {
                            }
                            weVar.s(set2);
                        }
                    }
                    return Unit.a;
                }
                wn0 wn0Var5 = ((s61) set2).d;
                Object[] objArr2 = wn0Var5.b;
                long[] jArr2 = wn0Var5.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j5 = jArr2[i7];
                        if ((((~j5) << c3) & j5 & j3) != j3) {
                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j5 & 255) < 128) {
                                    c2 = c3;
                                    Object obj10 = objArr2[(i7 << 3) + i9];
                                    j2 = j3;
                                    if ((obj10 instanceof he1) && !((he1) obj10).f(4)) {
                                    }
                                } else {
                                    c2 = c3;
                                    j2 = j3;
                                }
                                j5 >>= 8;
                                i9++;
                                c3 = c2;
                                j3 = j2;
                            }
                            c = c3;
                            j = j3;
                            if (i8 != 8) {
                            }
                        } else {
                            c = c3;
                            j = j3;
                        }
                        if (i7 != length2) {
                            i7++;
                            c3 = c;
                            j3 = j;
                        }
                    }
                }
                return Unit.a;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                cc1 cc1Var = (cc1) this.e;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = cc1Var.b;
                while (true) {
                    Object obj11 = atomicReference.get();
                    if (obj11 == null) {
                        u = collection;
                    } else if (obj11 instanceof Set) {
                        u = zh.e(obj11, collection);
                    } else {
                        if (!(obj11 instanceof List)) {
                            kl.b("Unexpected notification");
                            throw new kc0();
                        }
                        u = CollectionsKt.u((Collection) obj11, yh.b(collection));
                    }
                    while (!atomicReference.compareAndSet(obj11, u)) {
                        if (atomicReference.get() != obj11) {
                            break;
                        }
                    }
                    if (cc1Var.a()) {
                        cc1Var.a.invoke(new i6(12, cc1Var));
                    }
                    return Unit.a;
                    break;
                }
            case RequestError.STOP_TRACKING /* 11 */:
                ((Integer) obj2).getClass();
                op.g((Function0) this.e, (hl) obj, gb0.P(1));
                return Unit.a;
            default:
                ((Function1) this.e).invoke(obj);
                return Unit.a;
        }
    }

    public /* synthetic */ jl(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
