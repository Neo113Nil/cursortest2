package v0;

import a0.g1;
import d6.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.j0;
import o.r0;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: d, reason: collision with root package name */
    public final p6.c f7439d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f7440e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f7441f;

    public f(Map map, p6.c cVar) {
        j0 j0Var;
        this.f7439d = cVar;
        if (map == null || map.isEmpty()) {
            j0Var = null;
        } else {
            j0Var = new j0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                j0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f7440e = j0Var;
    }

    @Override // v0.e
    public final boolean c(Object obj) {
        return ((Boolean) this.f7439d.i(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    @Override // v0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map d() {
        char c8;
        long j7;
        long j8;
        long j9;
        j0 j0Var;
        long[] jArr;
        int i;
        long[] jArr2;
        int i8;
        char c9;
        long j10;
        j0 j0Var2 = this.f7440e;
        if (j0Var2 == null && this.f7441f == null) {
            return v.f2327d;
        }
        int i9 = 0;
        int i10 = j0Var2 != null ? j0Var2.f5486e : 0;
        j0 j0Var3 = this.f7441f;
        HashMap hashMap = new HashMap(i10 + (j0Var3 != null ? j0Var3.f5486e : 0));
        char c10 = 7;
        long j11 = -9187201950435737472L;
        int i11 = 8;
        if (j0Var2 != null) {
            Object[] objArr = j0Var2.f5483b;
            Object[] objArr2 = j0Var2.f5484c;
            long[] jArr3 = j0Var2.f5482a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i12 = 0;
                j8 = 128;
                while (true) {
                    long j12 = jArr3[i12];
                    j9 = 255;
                    if ((((~j12) << c10) & j12 & j11) != j11) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j12 & 255) < 128) {
                                int i15 = (i12 << 3) + i14;
                                c9 = c10;
                                j10 = j11;
                                hashMap.put((String) objArr[i15], (List) objArr2[i15]);
                            } else {
                                c9 = c10;
                                j10 = j11;
                            }
                            j12 >>= 8;
                            i14++;
                            c10 = c9;
                            j11 = j10;
                        }
                        c8 = c10;
                        j7 = j11;
                        if (i13 != 8) {
                            break;
                        }
                    } else {
                        c8 = c10;
                        j7 = j11;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    c10 = c8;
                    j11 = j7;
                }
                j0Var = this.f7441f;
                if (j0Var != null) {
                    Object[] objArr3 = j0Var.f5483b;
                    Object[] objArr4 = j0Var.f5484c;
                    long[] jArr4 = j0Var.f5482a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j13 = jArr4[i16];
                            if ((((~j13) << c8) & j13 & j7) != j7) {
                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                int i18 = i9;
                                while (i18 < i17) {
                                    if ((j13 & j9) < j8) {
                                        int i19 = (i16 << 3) + i18;
                                        Object obj = objArr3[i19];
                                        List list = (List) objArr4[i19];
                                        String str = (String) obj;
                                        i8 = i11;
                                        if (list.size() == 1) {
                                            Object b8 = ((p6.a) list.get(i9)).b();
                                            if (b8 != null) {
                                                if (!c(b8)) {
                                                    throw new IllegalStateException(j.a(b8).toString());
                                                }
                                                hashMap.put(str, s6.a.f(b8));
                                            }
                                            jArr2 = jArr4;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            while (i9 < size) {
                                                long[] jArr5 = jArr4;
                                                Object b9 = ((p6.a) list.get(i9)).b();
                                                if (b9 != null && !c(b9)) {
                                                    throw new IllegalStateException(j.a(b9).toString());
                                                }
                                                arrayList.add(b9);
                                                i9++;
                                                jArr4 = jArr5;
                                            }
                                            jArr2 = jArr4;
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        i8 = i11;
                                    }
                                    j13 >>= i8;
                                    i18++;
                                    i11 = i8;
                                    jArr4 = jArr2;
                                    i9 = 0;
                                }
                                jArr = jArr4;
                                i = i11;
                                if (i17 != i) {
                                    break;
                                }
                            } else {
                                jArr = jArr4;
                                i = i11;
                            }
                            if (i16 == length2) {
                                break;
                            }
                            i16++;
                            i11 = i;
                            jArr4 = jArr;
                            i9 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        c8 = 7;
        j7 = -9187201950435737472L;
        j8 = 128;
        j9 = 255;
        j0Var = this.f7441f;
        if (j0Var != null) {
        }
        return hashMap;
    }

    @Override // v0.e
    public final Object e(String str) {
        j0 j0Var = this.f7440e;
        List list = j0Var != null ? (List) j0Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && j0Var != null) {
            List subList = list.subList(1, list.size());
            int f6 = j0Var.f(str);
            if (f6 < 0) {
                f6 = ~f6;
            }
            Object[] objArr = j0Var.f5484c;
            Object obj = objArr[f6];
            j0Var.f5483b[f6] = str;
            objArr[f6] = subList;
        }
        return list.get(0);
    }

    @Override // v0.e
    public final g1 f(String str, p6.a aVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!o.X(str.charAt(i))) {
                j0 j0Var = this.f7441f;
                if (j0Var == null) {
                    long[] jArr = r0.f5528a;
                    j0Var = new j0();
                    this.f7441f = j0Var;
                }
                Object g3 = j0Var.g(str);
                if (g3 == null) {
                    g3 = new ArrayList();
                    j0Var.m(str, g3);
                }
                ((List) g3).add(aVar);
                return new g1(j0Var, str, aVar, 11);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
