package a1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.k0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;
import s.h0;
import s.p0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o implements m {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f43d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f44e;

    /* renamed from: i, reason: collision with root package name */
    public h0 f45i;

    public o(Map map, Function1 function1) {
        h0 h0Var;
        this.f43d = function1;
        if (map == null || map.isEmpty()) {
            h0Var = null;
        } else {
            h0Var = new h0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                h0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f44e = h0Var;
    }

    @Override // a1.m
    public final boolean c(Object obj) {
        return ((Boolean) this.f43d.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    @Override // a1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map d() {
        char c10;
        long j;
        long j3;
        long j10;
        h0 h0Var;
        long[] jArr;
        int i3;
        long[] jArr2;
        int i10;
        char c11;
        long j11;
        h0 h0Var2 = this.f44e;
        if (h0Var2 == null && this.f45i == null) {
            k0 k0Var = k0.f5575d;
            k0Var.getClass();
            return k0Var;
        }
        int i11 = 0;
        int i12 = h0Var2 != null ? h0Var2.f8316e : 0;
        h0 h0Var3 = this.f45i;
        HashMap hashMap = new HashMap(i12 + (h0Var3 != null ? h0Var3.f8316e : 0));
        char c12 = 7;
        long j12 = -9187201950435737472L;
        int i13 = 8;
        if (h0Var2 != null) {
            Object[] objArr = h0Var2.f8313b;
            Object[] objArr2 = h0Var2.f8314c;
            long[] jArr3 = h0Var2.f8312a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i14 = 0;
                j3 = 128;
                while (true) {
                    long j13 = jArr3[i14];
                    j10 = 255;
                    if ((((~j13) << c12) & j13 & j12) != j12) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j13 & 255) < 128) {
                                int i17 = (i14 << 3) + i16;
                                c11 = c12;
                                j11 = j12;
                                hashMap.put((String) objArr[i17], (List) objArr2[i17]);
                            } else {
                                c11 = c12;
                                j11 = j12;
                            }
                            j13 >>= 8;
                            i16++;
                            c12 = c11;
                            j12 = j11;
                        }
                        c10 = c12;
                        j = j12;
                        if (i15 != 8) {
                            break;
                        }
                    } else {
                        c10 = c12;
                        j = j12;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    c12 = c10;
                    j12 = j;
                }
                h0Var = this.f45i;
                if (h0Var != null) {
                    Object[] objArr3 = h0Var.f8313b;
                    Object[] objArr4 = h0Var.f8314c;
                    long[] jArr4 = h0Var.f8312a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i18 = 0;
                        while (true) {
                            long j14 = jArr4[i18];
                            if ((((~j14) << c10) & j14 & j) != j) {
                                int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                int i20 = i11;
                                while (i20 < i19) {
                                    if ((j14 & j10) < j3) {
                                        int i21 = (i18 << 3) + i20;
                                        Object obj = objArr3[i21];
                                        List list = (List) objArr4[i21];
                                        String str = (String) obj;
                                        i10 = i13;
                                        if (list.size() == 1) {
                                            Object invoke = ((Function0) list.get(i11)).invoke();
                                            if (invoke != null) {
                                                if (!c(invoke)) {
                                                    throw new IllegalStateException(s.a(invoke).toString());
                                                }
                                                hashMap.put(str, y.d(invoke));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i11 < size) {
                                                long[] jArr5 = jArr4;
                                                Object invoke2 = ((Function0) list.get(i11)).invoke();
                                                if (invoke2 != null && !c(invoke2)) {
                                                    throw new IllegalStateException(s.a(invoke2).toString());
                                                }
                                                arrayList.add(invoke2);
                                                i11++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i10 = i13;
                                    }
                                    j14 >>= i10;
                                    i20++;
                                    i13 = i10;
                                    jArr4 = jArr2;
                                    i11 = 0;
                                }
                                jArr = jArr4;
                                i3 = i13;
                                if (i19 != i3) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i3 = i13;
                            }
                            if (i18 == length2) {
                                break;
                            }
                            i18++;
                            i13 = i3;
                            jArr4 = jArr;
                            i11 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c10 = 7;
        j = -9187201950435737472L;
        j3 = 128;
        j10 = 255;
        h0Var = this.f45i;
        if (h0Var != null) {
        }
        return hashMap;
    }

    @Override // a1.m
    public final Object e(String str) {
        h0 h0Var = this.f44e;
        List list = h0Var != null ? (List) h0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && h0Var != null) {
            List subList = list.subList(1, list.size());
            int f3 = h0Var.f(str);
            if (f3 < 0) {
                f3 = ~f3;
            }
            Object[] objArr = h0Var.f8314c;
            Object obj = objArr[f3];
            h0Var.f8313b[f3] = str;
            objArr[f3] = subList;
        }
        return list.get(0);
    }

    @Override // a1.m
    public final l f(String str, Function0 function0) {
        int length = str.length();
        int i3 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (!CharsKt.a(str.charAt(i10))) {
                h0 h0Var = this.f45i;
                if (h0Var == null) {
                    long[] jArr = p0.f8356a;
                    h0Var = new h0();
                    this.f45i = h0Var;
                }
                Object g = h0Var.g(str);
                if (g == null) {
                    g = new ArrayList();
                    h0Var.m(str, g);
                }
                ((List) g).add(function0);
                return new n(h0Var, str, function0, i3);
            }
        }
        a1.e("Registered key is empty or blank");
        return null;
    }
}
