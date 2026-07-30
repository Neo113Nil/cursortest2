package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class md2 implements ld2 {
    public final Function1 m;
    public final tn1 n;
    public tn1 o;

    public md2(Map map, Function1 function1) {
        tn1 tn1Var;
        this.m = function1;
        if (map == null || map.isEmpty()) {
            tn1Var = null;
        } else {
            tn1Var = new tn1(map.size());
            for (Map.Entry entry : map.entrySet()) {
                tn1Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.n = tn1Var;
    }

    @Override // defpackage.ld2
    public final boolean a(Object obj) {
        return ((Boolean) this.m.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    @Override // defpackage.ld2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map b() {
        char c;
        long j;
        long j2;
        long j3;
        tn1 tn1Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        tn1 tn1Var2 = this.n;
        if (tn1Var2 == null && this.o == null) {
            return mi1.c();
        }
        int i3 = 0;
        int i4 = tn1Var2 != null ? tn1Var2.e : 0;
        tn1 tn1Var3 = this.o;
        HashMap hashMap = new HashMap(i4 + (tn1Var3 != null ? tn1Var3.e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (tn1Var2 != null) {
            Object[] objArr = tn1Var2.b;
            Object[] objArr2 = tn1Var2.c;
            long[] jArr3 = tn1Var2.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                hashMap.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
                tn1Var = this.o;
                if (tn1Var != null) {
                    Object[] objArr3 = tn1Var.b;
                    Object[] objArr4 = tn1Var.c;
                    long[] jArr4 = tn1Var.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr4[i10];
                            if ((((~j7) << c) & j7 & j) != j) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                int i12 = i3;
                                while (i12 < i11) {
                                    if ((j7 & j3) < j2) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr3[i13];
                                        List list = (List) objArr4[i13];
                                        String str = (String) obj;
                                        i2 = i5;
                                        if (list.size() == 1) {
                                            Object invoke = ((Function0) list.get(i3)).invoke();
                                            if (invoke != null) {
                                                if (!a(invoke)) {
                                                    b71.h(ll3.D(invoke));
                                                    return null;
                                                }
                                                hashMap.put(str, qv.d(invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((Function0) list.get(i3)).invoke();
                                                if (invoke2 != null && !a(invoke2)) {
                                                    b71.h(ll3.D(invoke2));
                                                    return null;
                                                }
                                                arrayList.add(invoke2);
                                                i3++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i2 = i5;
                                    }
                                    j7 >>= i2;
                                    i12++;
                                    i5 = i2;
                                    jArr4 = jArr2;
                                    i3 = 0;
                                }
                                jArr = jArr4;
                                i = i5;
                                if (i11 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i5;
                            }
                            if (i10 == length2) {
                                break;
                            }
                            i10++;
                            i5 = i;
                            jArr4 = jArr;
                            i3 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 128;
        j3 = 255;
        tn1Var = this.o;
        if (tn1Var != null) {
        }
        return hashMap;
    }

    @Override // defpackage.ld2
    public final Object c(String str) {
        tn1 tn1Var = this.n;
        List list = tn1Var != null ? (List) tn1Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && tn1Var != null) {
            List subList = list.subList(1, list.size());
            int f = tn1Var.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = tn1Var.c;
            Object obj = objArr[f];
            tn1Var.b[f] = str;
            objArr[f] = subList;
        }
        return list.get(0);
    }

    @Override // defpackage.ld2
    public final mh d(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.b(str.charAt(i))) {
                tn1 tn1Var = this.o;
                if (tn1Var == null) {
                    long[] jArr = oe2.a;
                    tn1Var = new tn1();
                    this.o = tn1Var;
                }
                Object g = tn1Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    tn1Var.m(str, g);
                }
                ((List) g).add(function0);
                return new mh(tn1Var, str, function0, 21);
            }
        }
        lh.e("Registered key is empty or blank");
        return null;
    }
}
