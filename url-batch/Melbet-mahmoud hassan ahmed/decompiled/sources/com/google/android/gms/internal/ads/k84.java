package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k84 extends o84 {

    /* renamed from: f, reason: collision with root package name */
    private static final s83<Integer> f7420f = s83.b(new Comparator() { // from class: com.google.android.gms.internal.ads.x74
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i7 = k84.f7422h;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* renamed from: g, reason: collision with root package name */
    private static final s83<Integer> f7421g = s83.b(new Comparator() { // from class: com.google.android.gms.internal.ads.y74
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i7 = k84.f7422h;
            return 0;
        }
    });

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f7422h = 0;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<d84> f7423d;

    /* renamed from: e, reason: collision with root package name */
    private final s74 f7424e;

    public k84(Context context) {
        s74 s74Var = new s74();
        d84 c7 = d84.c(context);
        this.f7424e = s74Var;
        this.f7423d = new AtomicReference<>(c7);
    }

    protected static int g(c0 c0Var, String str, boolean z6) {
        if (!TextUtils.isEmpty(str) && str.equals(c0Var.f3651c)) {
            return 4;
        }
        String k7 = k(str);
        String k8 = k(c0Var.f3651c);
        if (k8 == null || k7 == null) {
            return (z6 && k8 == null) ? 1 : 0;
        }
        if (k8.startsWith(k7) || k7.startsWith(k8)) {
            return 3;
        }
        return n13.E(k8, "-")[0].equals(n13.E(k7, "-")[0]) ? 2 : 0;
    }

    protected static String k(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static boolean m(int i7, boolean z6) {
        int i8 = i7 & 7;
        return i8 == 4 || (z6 && i8 == 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    @Override // com.google.android.gms.internal.ads.o84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Pair<zx3[], w74[]> f(n84 n84Var, int[][][] iArr, int[] iArr2, s54 s54Var, ei0 ei0Var) {
        int i7;
        int[] iArr3;
        int length;
        Pair create;
        int[][] iArr4;
        int[][] iArr5;
        int i8;
        int i9;
        l84 l84Var;
        Pair create2;
        int[] iArr6;
        gk0 gk0Var;
        n84 n84Var2;
        l84[] l84VarArr;
        int i10;
        boolean z6;
        l84[] l84VarArr2;
        int i11;
        boolean z7;
        int i12;
        l84[] l84VarArr3;
        int i13;
        int i14;
        boolean z8;
        int i15;
        int i16;
        Point point;
        int i17;
        int i18;
        n84 n84Var3 = n84Var;
        d84 d84Var = this.f7423d.get();
        int i19 = 2;
        l84[] l84VarArr4 = new l84[2];
        int i20 = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (true) {
            int i21 = 1;
            if (i20 >= i19) {
                break;
            }
            if (n84Var3.a(i20) == i19) {
                if (z9) {
                    l84VarArr = l84VarArr4;
                    z6 = z10;
                    n84Var2 = n84Var;
                    i10 = i20;
                } else {
                    hm0 c7 = n84Var3.c(i20);
                    int[][] iArr7 = iArr[i20];
                    int i22 = iArr2[i20];
                    boolean z11 = d84Var.f9297v;
                    for (int i23 = 0; i23 < c7.f6335a; i23++) {
                        gk0 b7 = c7.b(i23);
                        int[] iArr8 = iArr7[i23];
                        int i24 = b7.f5673a;
                    }
                    int i25 = 0;
                    gk0 gk0Var2 = null;
                    int i26 = -1;
                    j84 j84Var = null;
                    while (i25 < c7.f6335a) {
                        gk0 b8 = c7.b(i25);
                        int i27 = d84Var.f9284i;
                        int i28 = d84Var.f9285j;
                        boolean z12 = d84Var.f9286k;
                        hm0 hm0Var = c7;
                        int i29 = b8.f5673a;
                        ArrayList arrayList = new ArrayList(i21);
                        for (int i30 = 0; i30 <= 0; i30++) {
                            arrayList.add(Integer.valueOf(i30));
                        }
                        int i31 = Integer.MAX_VALUE;
                        if (i27 == Integer.MAX_VALUE || i28 == Integer.MAX_VALUE) {
                            l84VarArr2 = l84VarArr4;
                            i11 = i20;
                            z7 = z10;
                        } else {
                            int i32 = 0;
                            while (i32 <= 0) {
                                boolean z13 = z10;
                                c0 b9 = b8.b(i32);
                                int i33 = b9.f3665q;
                                if (i33 > 0) {
                                    l84VarArr3 = l84VarArr4;
                                    int i34 = b9.f3666r;
                                    if (i34 > 0) {
                                        if (z12) {
                                            z8 = z12;
                                            i12 = i27;
                                            if ((i33 > i34) != (i27 > i28)) {
                                                i16 = i28;
                                                i13 = i16;
                                                i15 = i12;
                                                int i35 = i33 * i15;
                                                i14 = i20;
                                                int i36 = i34 * i16;
                                                point = i35 < i36 ? new Point(i16, n13.K(i36, i33)) : new Point(n13.K(i35, i34), i15);
                                                i17 = b9.f3665q;
                                                int i37 = b9.f3666r;
                                                i18 = i17 * i37;
                                                if (i17 >= ((int) (point.x * 0.98f)) && i37 >= ((int) (point.y * 0.98f)) && i18 < i31) {
                                                    i31 = i18;
                                                }
                                                i32++;
                                                z10 = z13;
                                                l84VarArr4 = l84VarArr3;
                                                z12 = z8;
                                                i27 = i12;
                                                i28 = i13;
                                                i20 = i14;
                                            }
                                        } else {
                                            i12 = i27;
                                            z8 = z12;
                                        }
                                        i15 = i28;
                                        i13 = i15;
                                        i16 = i12;
                                        int i352 = i33 * i15;
                                        i14 = i20;
                                        int i362 = i34 * i16;
                                        if (i352 < i362) {
                                        }
                                        i17 = b9.f3665q;
                                        int i372 = b9.f3666r;
                                        i18 = i17 * i372;
                                        if (i17 >= ((int) (point.x * 0.98f))) {
                                            i31 = i18;
                                        }
                                        i32++;
                                        z10 = z13;
                                        l84VarArr4 = l84VarArr3;
                                        z12 = z8;
                                        i27 = i12;
                                        i28 = i13;
                                        i20 = i14;
                                    } else {
                                        i12 = i27;
                                    }
                                } else {
                                    i12 = i27;
                                    l84VarArr3 = l84VarArr4;
                                }
                                i13 = i28;
                                i14 = i20;
                                z8 = z12;
                                i32++;
                                z10 = z13;
                                l84VarArr4 = l84VarArr3;
                                z12 = z8;
                                i27 = i12;
                                i28 = i13;
                                i20 = i14;
                            }
                            l84VarArr2 = l84VarArr4;
                            i11 = i20;
                            z7 = z10;
                            if (i31 != Integer.MAX_VALUE) {
                                int i38 = -1;
                                int size = arrayList.size() - 1;
                                while (size >= 0) {
                                    int a7 = b8.b(((Integer) arrayList.get(size)).intValue()).a();
                                    if (a7 == i38 || a7 > i31) {
                                        arrayList.remove(size);
                                    }
                                    size--;
                                    i38 = -1;
                                }
                            }
                        }
                        int[] iArr9 = iArr7[i25];
                        j84 j84Var2 = j84Var;
                        for (int i39 = 0; i39 <= 0; i39++) {
                            c0 b10 = b8.b(i39);
                            int i40 = b10.f3653e;
                            if (m(iArr9[i39], d84Var.J)) {
                                j84 j84Var3 = new j84(b10, d84Var, iArr9[i39], arrayList.contains(Integer.valueOf(i39)));
                                if ((j84Var3.f7023f || d84Var.C) && (j84Var2 == null || j84Var3.b(j84Var2) > 0)) {
                                    i26 = i39;
                                    j84Var2 = j84Var3;
                                    gk0Var2 = b8;
                                }
                            }
                        }
                        i25++;
                        j84Var = j84Var2;
                        c7 = hm0Var;
                        z10 = z7;
                        l84VarArr4 = l84VarArr2;
                        i20 = i11;
                        i21 = 1;
                    }
                    l84VarArr = l84VarArr4;
                    int i41 = i20;
                    z6 = z10;
                    l84 l84Var2 = gk0Var2 == null ? null : new l84(gk0Var2, new int[]{i26}, 0);
                    l84VarArr[i41] = l84Var2;
                    n84Var2 = n84Var;
                    i10 = i41;
                    z9 = l84Var2 != null;
                }
                z10 = z6 | (n84Var2.c(i10).f6335a > 0);
            } else {
                n84Var2 = n84Var3;
                l84VarArr = l84VarArr4;
                i10 = i20;
            }
            i20 = i10 + 1;
            n84Var3 = n84Var2;
            l84VarArr4 = l84VarArr;
            i19 = 2;
        }
        n84 n84Var4 = n84Var3;
        l84[] l84VarArr5 = l84VarArr4;
        boolean z14 = z10;
        z74 z74Var = null;
        int i42 = -1;
        int i43 = 0;
        String str = null;
        while (true) {
            if (i43 >= 2) {
                break;
            }
            if (n84Var4.a(i43) == 1) {
                boolean z15 = d84Var.L || !z14;
                hm0 c8 = n84Var4.c(i43);
                int[][] iArr10 = iArr[i43];
                int i44 = iArr2[i43];
                z74 z74Var2 = null;
                int i45 = 0;
                int i46 = -1;
                int i47 = -1;
                while (i45 < c8.f6335a) {
                    gk0 b11 = c8.b(i45);
                    int[] iArr11 = iArr10[i45];
                    int i48 = i46;
                    int i49 = 0;
                    while (true) {
                        int i50 = b11.f5673a;
                        if (i49 <= 0) {
                            int i51 = i47;
                            if (m(iArr11[i49], d84Var.J)) {
                                gk0Var = b11;
                                z74 z74Var3 = new z74(b11.b(i49), d84Var, iArr11[i49]);
                                if (z74Var2 == null || z74Var3.b(z74Var2) > 0) {
                                    i48 = i45;
                                    z74Var2 = z74Var3;
                                    i47 = i49;
                                    i49++;
                                    b11 = gk0Var;
                                }
                            } else {
                                gk0Var = b11;
                            }
                            i47 = i51;
                            i49++;
                            b11 = gk0Var;
                        }
                    }
                    i45++;
                    i46 = i48;
                }
                if (i46 == -1) {
                    create2 = null;
                } else {
                    gk0 b12 = c8.b(i46);
                    if (z15) {
                        int[] iArr12 = iArr10[i46];
                        c0 b13 = b12.b(i47);
                        int[] iArr13 = new int[1];
                        int i52 = 0;
                        int i53 = 0;
                        while (i52 <= 0) {
                            if (i52 != i47) {
                                c0 b14 = b12.b(i52);
                                iArr6 = iArr12;
                                if (m(iArr12[i52], false)) {
                                    if (b14.f3656h != -1) {
                                        int i54 = b14.f3673y;
                                        if (i54 != -1) {
                                            if (i54 == b13.f3673y) {
                                                String str2 = b14.f3660l;
                                                if (str2 != null) {
                                                    if (TextUtils.equals(str2, b13.f3660l)) {
                                                        int i55 = b14.f3674z;
                                                        if (i55 != -1) {
                                                            if (i55 != b13.f3674z) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i52++;
                                iArr12 = iArr6;
                            } else {
                                iArr6 = iArr12;
                            }
                            iArr13[i53] = i52;
                            i53++;
                            i52++;
                            iArr12 = iArr6;
                        }
                        int[] copyOf = Arrays.copyOf(iArr13, i53);
                        i8 = 1;
                        if (copyOf.length > 1) {
                            i9 = 0;
                            l84Var = new l84(b12, copyOf, 0);
                            if (l84Var == null) {
                                int[] iArr14 = new int[i8];
                                iArr14[i9] = i47;
                                l84Var = new l84(b12, iArr14, i9);
                            }
                            Objects.requireNonNull(z74Var2);
                            create2 = Pair.create(l84Var, z74Var2);
                        }
                    } else {
                        i8 = 1;
                    }
                    i9 = 0;
                    l84Var = null;
                    if (l84Var == null) {
                    }
                    Objects.requireNonNull(z74Var2);
                    create2 = Pair.create(l84Var, z74Var2);
                }
                if (create2 != null && (z74Var == null || ((z74) create2.second).b(z74Var) > 0)) {
                    if (i42 != -1) {
                        l84VarArr5[i42] = null;
                    }
                    l84 l84Var3 = (l84) create2.first;
                    l84VarArr5[i43] = l84Var3;
                    str = l84Var3.f7872a.b(l84Var3.f7873b[0]).f3651c;
                    z74Var = (z74) create2.second;
                    i42 = i43;
                }
            }
            i43++;
        }
        i84 i84Var = null;
        int i56 = -1;
        int i57 = 0;
        for (i7 = 2; i57 < i7; i7 = 2) {
            int a8 = n84Var4.a(i57);
            if (a8 != 1 && a8 != i7) {
                if (a8 != 3) {
                    hm0 c9 = n84Var4.c(i57);
                    int[][] iArr15 = iArr[i57];
                    gk0 gk0Var3 = null;
                    a84 a84Var = null;
                    int i58 = 0;
                    for (int i59 = 0; i59 < c9.f6335a; i59++) {
                        gk0 b15 = c9.b(i59);
                        int[] iArr16 = iArr15[i59];
                        int i60 = 0;
                        while (true) {
                            int i61 = b15.f5673a;
                            if (i60 <= 0) {
                                hm0 hm0Var2 = c9;
                                if (m(iArr16[i60], d84Var.J)) {
                                    iArr5 = iArr15;
                                    a84 a84Var2 = new a84(b15.b(i60), iArr16[i60]);
                                    if (a84Var == null || a84Var2.compareTo(a84Var) > 0) {
                                        gk0Var3 = b15;
                                        i58 = i60;
                                        a84Var = a84Var2;
                                    }
                                } else {
                                    iArr5 = iArr15;
                                }
                                i60++;
                                c9 = hm0Var2;
                                iArr15 = iArr5;
                            }
                        }
                    }
                    l84VarArr5[i57] = gk0Var3 == null ? null : new l84(gk0Var3, new int[]{i58}, 0);
                } else {
                    hm0 c10 = n84Var4.c(i57);
                    int[][] iArr17 = iArr[i57];
                    gk0 gk0Var4 = null;
                    i84 i84Var2 = null;
                    int i62 = -1;
                    for (int i63 = 0; i63 < c10.f6335a; i63++) {
                        gk0 b16 = c10.b(i63);
                        int[] iArr18 = iArr17[i63];
                        int i64 = 0;
                        while (true) {
                            int i65 = b16.f5673a;
                            if (i64 <= 0) {
                                hm0 hm0Var3 = c10;
                                if (m(iArr18[i64], d84Var.J)) {
                                    iArr4 = iArr17;
                                    i84 i84Var3 = new i84(b16.b(i64), d84Var, iArr18[i64], str);
                                    if (i84Var3.f6566f && (i84Var2 == null || i84Var3.compareTo(i84Var2) > 0)) {
                                        gk0Var4 = b16;
                                        i62 = i64;
                                        i84Var2 = i84Var3;
                                    }
                                } else {
                                    iArr4 = iArr17;
                                }
                                i64++;
                                c10 = hm0Var3;
                                iArr17 = iArr4;
                            }
                        }
                    }
                    if (gk0Var4 == null) {
                        create = null;
                    } else {
                        l84 l84Var4 = new l84(gk0Var4, new int[]{i62}, 0);
                        Objects.requireNonNull(i84Var2);
                        create = Pair.create(l84Var4, i84Var2);
                    }
                    if (create != null && (i84Var == null || ((i84) create.second).compareTo(i84Var) > 0)) {
                        if (i56 != -1) {
                            l84VarArr5[i56] = null;
                        }
                        l84VarArr5[i57] = (l84) create.first;
                        i84Var = (i84) create.second;
                        i56 = i57;
                        i57++;
                    }
                }
            }
            i57++;
        }
        for (int i66 = 0; i66 < 2; i66++) {
            l84 l84Var5 = l84VarArr5[i66];
            int a9 = n84Var4.a(i66);
            if (d84Var.f(i66)) {
                l84Var5 = null;
            } else {
                if (!d84Var.f9299x.contains(Integer.valueOf(a9))) {
                    hm0 c11 = n84Var4.c(i66);
                    if (!d84Var.g(i66, c11)) {
                        int i67 = 0;
                        while (true) {
                            if (i67 >= c11.f6335a) {
                                break;
                            }
                            gk0 b17 = c11.b(i67);
                            mr0 mr0Var = d84Var.f9298w.get(b17);
                            if (mr0Var != null) {
                                Object[] array = mr0Var.f8692a.toArray();
                                int length2 = array.length;
                                int[] iArr19 = new int[length2];
                                for (int i68 = 0; i68 < length2; i68++) {
                                    Object obj = array[i68];
                                    Objects.requireNonNull(obj);
                                    iArr19[i68] = ((Number) obj).intValue();
                                }
                                l84Var5 = new l84(b17, iArr19, 0);
                            } else {
                                i67++;
                            }
                        }
                    } else if (d84Var.e(i66, c11) != null) {
                        l84Var5 = new l84(c11.b(0), null, 0);
                    }
                }
                l84Var5 = null;
            }
            l84VarArr5[i66] = l84Var5;
        }
        s74 s74Var = this.f7424e;
        a94 c12 = c();
        e73 e7 = t74.e(l84VarArr5);
        int i69 = 2;
        w74[] w74VarArr = new w74[2];
        int i70 = 0;
        while (i70 < i69) {
            l84 l84Var6 = l84VarArr5[i70];
            if (l84Var6 != null && (length = (iArr3 = l84Var6.f7873b).length) != 0) {
                w74VarArr[i70] = length == 1 ? new m84(l84Var6.f7872a, iArr3[0], 0, 0, null) : s74Var.a(l84Var6.f7872a, iArr3, 0, c12, (e73) e7.get(i70));
            }
            i70++;
            i69 = 2;
        }
        zx3[] zx3VarArr = new zx3[i69];
        for (int i71 = 0; i71 < i69; i71++) {
            zx3VarArr[i71] = (d84Var.f(i71) || d84Var.f9299x.contains(Integer.valueOf(n84Var4.a(i71))) || (n84Var4.a(i71) != -2 && w74VarArr[i71] == null)) ? null : zx3.f15305a;
        }
        boolean z16 = d84Var.K;
        return Pair.create(zx3VarArr, w74VarArr);
    }

    public final d84 h() {
        return this.f7423d.get();
    }

    public final void l(f84 f84Var) {
        d84 d84Var = new d84(f84Var);
        if (this.f7423d.getAndSet(d84Var).equals(d84Var)) {
            return;
        }
        e();
    }
}
