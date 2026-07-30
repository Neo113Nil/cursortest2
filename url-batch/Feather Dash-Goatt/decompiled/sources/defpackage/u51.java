package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u51 implements t51 {
    public final Function1 d;
    public final vn0 e;
    public vn0 g;

    public u51(Map map, Function1 function1) {
        vn0 vn0Var;
        this.d = function1;
        if (map == null || map.isEmpty()) {
            vn0Var = null;
        } else {
            vn0Var = new vn0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                vn0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.e = vn0Var;
    }

    @Override // defpackage.t51
    public final boolean b(Object obj) {
        return ((Boolean) this.d.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    @Override // defpackage.t51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map c() {
        char c;
        long j;
        long j2;
        long j3;
        vn0 vn0Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        vn0 vn0Var2 = this.e;
        if (vn0Var2 == null && this.g == null) {
            ov ovVar = ov.d;
            ovVar.getClass();
            return ovVar;
        }
        int i3 = 0;
        int i4 = vn0Var2 != null ? vn0Var2.e : 0;
        vn0 vn0Var3 = this.g;
        HashMap hashMap = new HashMap(i4 + (vn0Var3 != null ? vn0Var3.e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (vn0Var2 != null) {
            Object[] objArr = vn0Var2.b;
            Object[] objArr2 = vn0Var2.c;
            long[] jArr3 = vn0Var2.a;
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
                vn0Var = this.g;
                if (vn0Var != null) {
                    Object[] objArr3 = vn0Var.b;
                    Object[] objArr4 = vn0Var.c;
                    long[] jArr4 = vn0Var.a;
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
                                                if (!b(invoke)) {
                                                    throw new IllegalStateException(y90.q(invoke).toString());
                                                }
                                                hashMap.put(str, zh.c(invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i3 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((Function0) list.get(i3)).invoke();
                                                if (invoke2 != null && !b(invoke2)) {
                                                    throw new IllegalStateException(y90.q(invoke2).toString());
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
        vn0Var = this.g;
        if (vn0Var != null) {
        }
        return hashMap;
    }

    @Override // defpackage.t51
    public final Object d(String str) {
        vn0 vn0Var = this.e;
        List list = vn0Var != null ? (List) vn0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && vn0Var != null) {
            List subList = list.subList(1, list.size());
            int f = vn0Var.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = vn0Var.c;
            Object obj = objArr[f];
            vn0Var.b[f] = str;
            objArr[f] = subList;
        }
        return list.get(0);
    }

    @Override // defpackage.t51
    public final s51 e(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.a(str.charAt(i))) {
                vn0 vn0Var = this.g;
                if (vn0Var == null) {
                    long[] jArr = q61.a;
                    vn0Var = new vn0();
                    this.g = vn0Var;
                }
                Object g = vn0Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    vn0Var.m(str, g);
                }
                ((List) g).add(function0);
                return new i8(vn0Var, str, function0, 19);
            }
        }
        dd0.e("Registered key is empty or blank");
        return null;
    }
}
