package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j7 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        int i = 0;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l7 l7Var = (l7) this.e;
                q7 q7Var = (q7) this.g;
                Function1 function1 = (Function1) this.h;
                v11 v11Var = (v11) this.i;
                o7 o7Var = (o7) obj;
                ka0.K(o7Var, (q7) l7Var.d);
                av0 av0Var = o7Var.e;
                Object value = av0Var.getValue();
                c51 c51Var = (c51) l7Var.b;
                v7 v7Var = (v7) l7Var.k;
                v7 v7Var2 = (v7) l7Var.j;
                if (!Intrinsics.a(v7Var2, (v7) l7Var.h) || !Intrinsics.a(v7Var, (v7) l7Var.i)) {
                    v7 v7Var3 = (v7) ((Function1) c51Var.e).invoke(value);
                    int b = v7Var3.b();
                    boolean z = false;
                    while (i < b) {
                        if (v7Var3.a(i) < v7Var2.a(i) || v7Var3.a(i) > v7Var.a(i)) {
                            v7Var3.e(b11.b(v7Var3.a(i), v7Var2.a(i), v7Var.a(i)), i);
                            z = true;
                        }
                        i++;
                    }
                    if (z) {
                        value = ((Function1) c51Var.g).invoke(v7Var3);
                    }
                }
                if (!Intrinsics.a(value, av0Var.getValue())) {
                    ((q7) l7Var.d).e.setValue(value);
                    q7Var.e.setValue(value);
                    if (function1 != null) {
                        function1.invoke(l7Var);
                    }
                    o7Var.i.setValue(Boolean.FALSE);
                    o7Var.d.invoke();
                    v11Var.d = true;
                } else if (function1 != null) {
                    function1.invoke(l7Var);
                }
                return Unit.a;
            case 1:
                w11 w11Var = (w11) this.e;
                z71 z71Var = (z71) this.g;
                w11 w11Var2 = (w11) this.h;
                xp xpVar = (xp) this.i;
                o7 o7Var2 = (o7) obj;
                float floatValue = ((Number) o7Var2.e.getValue()).floatValue() - w11Var.d;
                float a = z71Var.a(floatValue);
                w11Var.d = ((Number) o7Var2.e.getValue()).floatValue();
                w11Var2.d = ((Number) ((Function1) o7Var2.a.g).invoke(o7Var2.f)).floatValue();
                if (Math.abs(floatValue - a) > 0.5f) {
                    o7Var2.i.setValue(Boolean.FALSE);
                    o7Var2.d.invoke();
                }
                xpVar.getClass();
                return Unit.a;
            case 2:
                d60 d60Var = (d60) this.e;
                String str = (String) this.g;
                String str2 = (String) this.h;
                hy0 hy0Var = (hy0) this.i;
                qn0 qn0Var = (qn0) obj;
                if (((String) gb0.w(qn0Var, d60.d, "")).equals(str)) {
                    hy0 c = d60Var.c(qn0Var, str);
                    if (c != null && !c.a.equals(str2)) {
                        synchronized (d60Var) {
                            d60Var.d(qn0Var, str);
                            HashSet hashSet = new HashSet((Collection) gb0.w(qn0Var, hy0Var, new HashSet()));
                            hashSet.add(str);
                            qn0Var.e(hy0Var, hashSet);
                        }
                    }
                    return null;
                }
                hy0 hy0Var2 = d60.c;
                long longValue = ((Long) gb0.w(qn0Var, hy0Var2, 0L)).longValue();
                if (longValue + 1 == 30) {
                    synchronized (d60Var) {
                        try {
                            long longValue2 = ((Long) gb0.w(qn0Var, hy0Var2, 0L)).longValue();
                            String str3 = "";
                            Set hashSet2 = new HashSet();
                            String str4 = null;
                            for (Map.Entry entry : qn0Var.a().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    Set<String> set = (Set) entry.getValue();
                                    for (String str5 : set) {
                                        if (str4 != null && str4.compareTo(str5) <= 0) {
                                        }
                                        str3 = ((hy0) entry.getKey()).a;
                                        str4 = str5;
                                        hashSet2 = set;
                                    }
                                }
                            }
                            obj2 = null;
                            HashSet hashSet3 = new HashSet(hashSet2);
                            hashSet3.remove(str4);
                            str3.getClass();
                            qn0Var.e(new hy0(str3), hashSet3);
                            longValue = longValue2 - 1;
                            qn0Var.d(d60.c, Long.valueOf(longValue));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) gb0.w(qn0Var, hy0Var, new HashSet()));
                hashSet4.add(str);
                qn0Var.e(hy0Var, hashSet4);
                qn0Var.d(d60.c, Long.valueOf(longValue + 1));
                qn0Var.d(d60.d, str);
                return obj2;
            case 3:
                ao0 ao0Var = (ao0) this.e;
                j80 j80Var = (j80) this.g;
                w11 w11Var3 = (w11) this.h;
                sn snVar = (sn) this.i;
                long longValue3 = ((Long) obj).longValue();
                yd1 yd1Var = (yd1) ao0Var.getValue();
                long longValue4 = yd1Var != null ? ((Number) yd1Var.getValue()).longValue() : longValue3;
                long j = j80Var.c;
                eo0 eo0Var = j80Var.a;
                if (j == Long.MIN_VALUE || w11Var3.d != ka0.q(snVar.f())) {
                    j80Var.c = longValue3;
                    Object[] objArr = eo0Var.d;
                    int i2 = eo0Var.g;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((h80) objArr[i3]).j = true;
                    }
                    w11Var3.d = ka0.q(snVar.f());
                }
                float f = w11Var3.d;
                if (f == 0.0f) {
                    Object[] objArr2 = eo0Var.d;
                    int i4 = eo0Var.g;
                    while (i < i4) {
                        h80 h80Var = (h80) objArr2[i];
                        h80Var.g.setValue(h80Var.h.c);
                        h80Var.j = true;
                        i++;
                    }
                } else {
                    long j2 = (long) ((longValue4 - j80Var.c) / f);
                    Object[] objArr3 = eo0Var.d;
                    int i5 = eo0Var.g;
                    boolean z2 = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        h80 h80Var2 = (h80) objArr3[i6];
                        if (!h80Var2.i) {
                            h80Var2.l.b.setValue(Boolean.FALSE);
                            if (h80Var2.j) {
                                h80Var2.j = false;
                                h80Var2.k = j2;
                            }
                            long j3 = j2 - h80Var2.k;
                            h80Var2.g.setValue(h80Var2.h.b(j3));
                            h80Var2.i = h80Var2.h.g(j3);
                        }
                        if (!h80Var2.i) {
                            z2 = false;
                        }
                    }
                    j80Var.d.setValue(Boolean.valueOf(!z2));
                }
                return Unit.a;
            case 4:
                bf0 bf0Var = (bf0) this.e;
                bf0Var.c = new nz((pe0) this.g, (df1) this.h, (uy0) this.i);
                return new n2(5, bf0Var);
            default:
                w11 w11Var4 = (w11) this.e;
                zr zrVar = (zr) this.g;
                b81 b81Var = (b81) this.h;
                sm0 sm0Var = (sm0) this.i;
                o7 o7Var3 = (o7) obj;
                av0 av0Var2 = o7Var3.e;
                Function0 function0 = o7Var3.d;
                av0 av0Var3 = o7Var3.i;
                float floatValue2 = ((Number) av0Var2.getValue()).floatValue() - w11Var4.d;
                if (!y90.b(floatValue2)) {
                    if (!y90.b(floatValue2 - zrVar.c(b81Var, floatValue2))) {
                        av0Var3.setValue(Boolean.FALSE);
                        function0.invoke();
                        return Unit.a;
                    }
                    w11Var4.d += floatValue2;
                }
                if (((Boolean) sm0Var.invoke(Float.valueOf(w11Var4.d))).booleanValue()) {
                    av0Var3.setValue(Boolean.FALSE);
                    function0.invoke();
                }
                return Unit.a;
        }
    }
}
