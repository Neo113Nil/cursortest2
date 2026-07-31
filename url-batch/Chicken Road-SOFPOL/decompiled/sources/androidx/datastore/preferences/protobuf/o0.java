package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 implements x0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f737n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f738o = k1.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f739a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f740b;

    /* renamed from: c, reason: collision with root package name */
    public final int f741c;

    /* renamed from: d, reason: collision with root package name */
    public final int f742d;

    /* renamed from: e, reason: collision with root package name */
    public final a f743e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f744f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f745g;

    /* renamed from: h, reason: collision with root package name */
    public final int f746h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f747j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f748k;

    /* renamed from: l, reason: collision with root package name */
    public final f1 f749l;

    /* renamed from: m, reason: collision with root package name */
    public final k0 f750m;

    public o0(int[] iArr, Object[] objArr, int i, int i8, a aVar, int[] iArr2, int i9, int i10, q0 q0Var, d0 d0Var, f1 f1Var, p pVar, k0 k0Var) {
        this.f739a = iArr;
        this.f740b = objArr;
        this.f741c = i;
        this.f742d = i8;
        this.f744f = aVar instanceof w;
        this.f745g = iArr2;
        this.f746h = i9;
        this.i = i10;
        this.f747j = q0Var;
        this.f748k = d0Var;
        this.f749l = f1Var;
        this.f743e = aVar;
        this.f750m = k0Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w) {
            return ((w) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o0 w(w0 w0Var, q0 q0Var, d0 d0Var, f1 f1Var, p pVar, k0 k0Var) {
        int i;
        int charAt;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt2;
        int i15;
        char charAt3;
        int i16;
        char charAt4;
        int i17;
        char charAt5;
        int i18;
        char charAt6;
        int i19;
        char charAt7;
        int i20;
        char charAt8;
        int i21;
        char charAt9;
        int i22;
        int i23;
        int i24;
        Class<?> cls;
        int i25;
        int objectFieldOffset;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Field F;
        char charAt10;
        int i31;
        int i32;
        Object obj;
        Field F2;
        Object obj2;
        Field F3;
        int i33;
        char charAt11;
        int i34;
        char charAt12;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        String str = w0Var.f791b;
        int length = str.length();
        int i37 = 55296;
        if (str.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i = i38 + 1;
                if (str.charAt(i38) < 55296) {
                    break;
                }
                i38 = i;
            }
        } else {
            i = 1;
        }
        int i39 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i40 = charAt15 & 8191;
            int i41 = 13;
            while (true) {
                i36 = i39 + 1;
                charAt14 = str.charAt(i39);
                if (charAt14 < 55296) {
                    break;
                }
                i40 |= (charAt14 & 8191) << i41;
                i41 += 13;
                i39 = i36;
            }
            charAt15 = i40 | (charAt14 << i41);
            i39 = i36;
        }
        if (charAt15 == 0) {
            i9 = 0;
            i12 = 0;
            charAt = 0;
            i8 = 0;
            i11 = 0;
            i13 = 0;
            iArr = f737n;
            i10 = 0;
        } else {
            int i42 = i39 + 1;
            int charAt16 = str.charAt(i39);
            if (charAt16 >= 55296) {
                int i43 = charAt16 & 8191;
                int i44 = 13;
                while (true) {
                    i21 = i42 + 1;
                    charAt9 = str.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i21;
                }
                charAt16 = i43 | (charAt9 << i44);
                i42 = i21;
            }
            int i45 = i42 + 1;
            int charAt17 = str.charAt(i42);
            if (charAt17 >= 55296) {
                int i46 = charAt17 & 8191;
                int i47 = 13;
                while (true) {
                    i20 = i45 + 1;
                    charAt8 = str.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i20;
                }
                charAt17 = i46 | (charAt8 << i47);
                i45 = i20;
            }
            int i48 = i45 + 1;
            int charAt18 = str.charAt(i45);
            if (charAt18 >= 55296) {
                int i49 = charAt18 & 8191;
                int i50 = 13;
                while (true) {
                    i19 = i48 + 1;
                    charAt7 = str.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i19;
                }
                charAt18 = i49 | (charAt7 << i50);
                i48 = i19;
            }
            int i51 = i48 + 1;
            int charAt19 = str.charAt(i48);
            if (charAt19 >= 55296) {
                int i52 = charAt19 & 8191;
                int i53 = 13;
                while (true) {
                    i18 = i51 + 1;
                    charAt6 = str.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i18;
                }
                charAt19 = i52 | (charAt6 << i53);
                i51 = i18;
            }
            int i54 = i51 + 1;
            charAt = str.charAt(i51);
            if (charAt >= 55296) {
                int i55 = charAt & 8191;
                int i56 = 13;
                while (true) {
                    i17 = i54 + 1;
                    charAt5 = str.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i17;
                }
                charAt = i55 | (charAt5 << i56);
                i54 = i17;
            }
            int i57 = i54 + 1;
            int charAt20 = str.charAt(i54);
            if (charAt20 >= 55296) {
                int i58 = charAt20 & 8191;
                int i59 = 13;
                while (true) {
                    i16 = i57 + 1;
                    charAt4 = str.charAt(i57);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i16;
                }
                charAt20 = i58 | (charAt4 << i59);
                i57 = i16;
            }
            int i60 = i57 + 1;
            int charAt21 = str.charAt(i57);
            if (charAt21 >= 55296) {
                int i61 = charAt21 & 8191;
                int i62 = 13;
                while (true) {
                    i15 = i60 + 1;
                    charAt3 = str.charAt(i60);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i61 |= (charAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i15;
                }
                charAt21 = i61 | (charAt3 << i62);
                i60 = i15;
            }
            int i63 = i60 + 1;
            int charAt22 = str.charAt(i60);
            if (charAt22 >= 55296) {
                int i64 = charAt22 & 8191;
                int i65 = 13;
                while (true) {
                    i14 = i63 + 1;
                    charAt2 = str.charAt(i63);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i64 |= (charAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i14;
                }
                charAt22 = i64 | (charAt2 << i65);
                i63 = i14;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i66 = (charAt16 * 2) + charAt17;
            int i67 = charAt20;
            i8 = charAt18;
            i9 = i67;
            i10 = charAt16;
            i39 = i63;
            iArr = iArr2;
            i11 = charAt19;
            i12 = i66;
            i13 = charAt22;
        }
        Unsafe unsafe = f738o;
        Object[] objArr = w0Var.f792c;
        Class<?> cls2 = w0Var.f790a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i68 = i13 + i9;
        int i69 = i68;
        int i70 = i13;
        int i71 = 0;
        int i72 = 0;
        while (i39 < length) {
            int i73 = i39 + 1;
            int charAt23 = str.charAt(i39);
            if (charAt23 >= i37) {
                int i74 = charAt23 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i35 = i75 + 1;
                    charAt13 = str.charAt(i75);
                    i22 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i74 |= (charAt13 & 8191) << i76;
                    i76 += 13;
                    i75 = i35;
                    length = i22;
                }
                charAt23 = i74 | (charAt13 << i76);
                i23 = i35;
            } else {
                i22 = length;
                i23 = i73;
            }
            int i77 = i23 + 1;
            int charAt24 = str.charAt(i23);
            Object[] objArr3 = objArr;
            char c8 = 55296;
            if (charAt24 >= 55296) {
                int i78 = charAt24 & 8191;
                int i79 = 13;
                while (true) {
                    i34 = i77 + 1;
                    charAt12 = str.charAt(i77);
                    if (charAt12 < c8) {
                        break;
                    }
                    i78 |= (charAt12 & 8191) << i79;
                    i79 += 13;
                    i77 = i34;
                    c8 = 55296;
                }
                charAt24 = i78 | (charAt12 << i79);
                i77 = i34;
            }
            int i80 = charAt24 & 255;
            int i81 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int[] iArr4 = iArr3;
            if (i80 >= 51) {
                int i82 = i77 + 1;
                int charAt25 = str.charAt(i77);
                char c9 = 55296;
                if (charAt25 >= 55296) {
                    int i83 = charAt25 & 8191;
                    int i84 = 13;
                    while (true) {
                        i33 = i82 + 1;
                        charAt11 = str.charAt(i82);
                        if (charAt11 < c9) {
                            break;
                        }
                        i83 |= (charAt11 & 8191) << i84;
                        i84 += 13;
                        i82 = i33;
                        c9 = 55296;
                    }
                    charAt25 = i83 | (charAt11 << i84);
                    i82 = i33;
                }
                int i85 = i80 - 51;
                int i86 = i82;
                if (i85 == 9 || i85 == 17) {
                    i32 = i12 + 1;
                    objArr2[((i72 / 3) * 2) + 1] = objArr3[i12];
                } else {
                    if (i85 == 12) {
                        int a8 = w0Var.a();
                        if (a8 == 0) {
                            throw null;
                        }
                        if ((a8 == 1) || (charAt24 & 2048) != 0) {
                            i32 = i12 + 1;
                            objArr2[((i72 / 3) * 2) + 1] = objArr3[i12];
                        }
                    }
                    int i87 = charAt25 * 2;
                    obj = objArr3[i87];
                    if (obj instanceof Field) {
                        F2 = F(cls2, (String) obj);
                        objArr3[i87] = F2;
                    } else {
                        F2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F2);
                    int i88 = i87 + 1;
                    obj2 = objArr3[i88];
                    if (obj2 instanceof Field) {
                        F3 = F(cls2, (String) obj2);
                        objArr3[i88] = F3;
                    } else {
                        F3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F3);
                    int i89 = i10;
                    i26 = objectFieldOffset3;
                    i30 = objectFieldOffset2;
                    i24 = i89;
                    i29 = i12;
                    i27 = i86;
                    i28 = 0;
                    cls = cls2;
                }
                i12 = i32;
                int i872 = charAt25 * 2;
                obj = objArr3[i872];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(F2);
                int i882 = i872 + 1;
                obj2 = objArr3[i882];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(F3);
                int i892 = i10;
                i26 = objectFieldOffset32;
                i30 = objectFieldOffset22;
                i24 = i892;
                i29 = i12;
                i27 = i86;
                i28 = 0;
                cls = cls2;
            } else {
                int i90 = i12 + 1;
                Field F4 = F(cls2, (String) objArr3[i12]);
                if (i80 == 9 || i80 == 17) {
                    i24 = i10;
                    objArr2[((i72 / 3) * 2) + 1] = F4.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        i24 = i10;
                        i31 = i12 + 2;
                        objArr2[((i72 / 3) * 2) + 1] = objArr3[i90];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        i24 = i10;
                        if (w0Var.a() == 1 || (charAt24 & 2048) != 0) {
                            i31 = i12 + 2;
                            objArr2[((i72 / 3) * 2) + 1] = objArr3[i90];
                        }
                    } else if (i80 == 50) {
                        int i91 = i70 + 1;
                        iArr[i70] = i72;
                        int i92 = (i72 / 3) * 2;
                        int i93 = i12 + 2;
                        objArr2[i92] = objArr3[i90];
                        if ((charAt24 & 2048) != 0) {
                            i25 = i12 + 3;
                            objArr2[i92 + 1] = objArr3[i93];
                            i24 = i10;
                            cls = cls2;
                            i70 = i91;
                        } else {
                            cls = cls2;
                            i25 = i93;
                            i70 = i91;
                            i24 = i10;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                        if ((charAt24 & 4096) != 0 || i80 > 17) {
                            i26 = 1048575;
                            i27 = i77;
                            i28 = 0;
                        } else {
                            int i94 = i77 + 1;
                            int charAt26 = str.charAt(i77);
                            if (charAt26 >= 55296) {
                                int i95 = charAt26 & 8191;
                                int i96 = 13;
                                while (true) {
                                    i27 = i94 + 1;
                                    charAt10 = str.charAt(i94);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i95 |= (charAt10 & 8191) << i96;
                                    i96 += 13;
                                    i94 = i27;
                                }
                                charAt26 = i95 | (charAt10 << i96);
                            } else {
                                i27 = i94;
                            }
                            int i97 = (charAt26 / 32) + (i24 * 2);
                            Object obj3 = objArr3[i97];
                            if (obj3 instanceof Field) {
                                F = (Field) obj3;
                            } else {
                                F = F(cls, (String) obj3);
                                objArr3[i97] = F;
                            }
                            i26 = (int) unsafe.objectFieldOffset(F);
                            i28 = charAt26 % 32;
                        }
                        if (i80 >= 18 || i80 > 49) {
                            i29 = i25;
                            i30 = objectFieldOffset;
                        } else {
                            iArr[i69] = objectFieldOffset;
                            i29 = i25;
                            i30 = objectFieldOffset;
                            i69++;
                        }
                    } else {
                        i24 = i10;
                    }
                    i25 = i31;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i26 = 1048575;
                    i27 = i77;
                    i28 = 0;
                    if (i80 >= 18) {
                    }
                    i29 = i25;
                    i30 = objectFieldOffset;
                }
                cls = cls2;
                i25 = i90;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                if ((charAt24 & 4096) != 0) {
                }
                i26 = 1048575;
                i27 = i77;
                i28 = 0;
                if (i80 >= 18) {
                }
                i29 = i25;
                i30 = objectFieldOffset;
            }
            int i98 = i72 + 1;
            iArr4[i72] = i81;
            int i99 = i72 + 2;
            String str2 = str;
            iArr4[i98] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20) | i30;
            i72 += 3;
            iArr4[i99] = (i28 << 20) | i26;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i22;
            i10 = i24;
            i39 = i27;
            i37 = 55296;
            i12 = i29;
            iArr3 = iArr4;
        }
        return new o0(iArr3, objArr2, i8, i11, w0Var.f790a, iArr, i13, i68, q0Var, d0Var, f1Var, pVar, k0Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j7, Object obj) {
        return ((Integer) k1.f717c.h(j7, obj)).intValue();
    }

    public static long z(long j7, Object obj) {
        return ((Long) k1.f717c.h(j7, obj)).longValue();
    }

    public final int A(int i) {
        if (i >= this.f741c && i <= this.f742d) {
            int[] iArr = this.f739a;
            int length = (iArr.length / 3) - 1;
            int i8 = 0;
            while (i8 <= length) {
                int i9 = (length + i8) >>> 1;
                int i10 = i9 * 3;
                int i11 = iArr[i10];
                if (i == i11) {
                    return i10;
                }
                if (i < i11) {
                    length = i9 - 1;
                } else {
                    i8 = i9 + 1;
                }
            }
        }
        return -1;
    }

    public final void B(Object obj, long j7, k kVar, x0 x0Var, o oVar) {
        int z3;
        this.f748k.getClass();
        x a8 = d0.a(j7, obj);
        j jVar = (j) kVar.f714d;
        int i = kVar.f711a;
        if ((i & 7) != 3) {
            throw a0.b();
        }
        do {
            w i8 = x0Var.i();
            kVar.d(i8, x0Var, oVar);
            x0Var.d(i8);
            ((v0) a8).add(i8);
            if (jVar.c() || kVar.f713c != 0) {
                return;
            } else {
                z3 = jVar.z();
            }
        } while (z3 == i);
        kVar.f713c = z3;
    }

    public final void C(Object obj, int i, k kVar, x0 x0Var, o oVar) {
        int z3;
        this.f748k.getClass();
        x a8 = d0.a(i & 1048575, obj);
        j jVar = (j) kVar.f714d;
        int i8 = kVar.f711a;
        if ((i8 & 7) != 2) {
            throw a0.b();
        }
        do {
            w i9 = x0Var.i();
            kVar.e(i9, x0Var, oVar);
            x0Var.d(i9);
            ((v0) a8).add(i9);
            if (jVar.c() || kVar.f713c != 0) {
                return;
            } else {
                z3 = jVar.z();
            }
        } while (z3 == i8);
        kVar.f713c = z3;
    }

    public final void D(int i, k kVar, Object obj) {
        if ((536870912 & i) != 0) {
            kVar.y(2);
            k1.o(obj, i & 1048575, ((j) kVar.f714d).y());
        } else if (!this.f744f) {
            k1.o(obj, i & 1048575, kVar.g());
        } else {
            kVar.y(2);
            k1.o(obj, i & 1048575, ((j) kVar.f714d).x());
        }
    }

    public final void E(int i, k kVar, Object obj) {
        int i8 = 536870912 & i;
        d0 d0Var = this.f748k;
        if (i8 != 0) {
            d0Var.getClass();
            kVar.u(d0.a(i & 1048575, obj), true);
        } else {
            d0Var.getClass();
            kVar.u(d0.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i8 = this.f739a[i + 2];
        long j7 = 1048575 & i8;
        if (j7 == 1048575) {
            return;
        }
        k1.m(obj, j7, (1 << (i8 >>> 20)) | k1.f717c.f(j7, obj));
    }

    public final void H(int i, int i8, Object obj) {
        k1.m(obj, this.f739a[i8 + 2] & 1048575, i);
    }

    public final void I(Object obj, int i, a aVar) {
        f738o.putObject(obj, L(i) & 1048575, aVar);
        G(i, obj);
    }

    public final void J(Object obj, int i, int i8, a aVar) {
        f738o.putObject(obj, L(i8) & 1048575, aVar);
        H(i, i8, obj);
    }

    public final int L(int i) {
        return this.f739a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, g0 g0Var) {
        int i;
        int i8;
        int i9;
        int i10;
        boolean z3;
        o0 o0Var = this;
        int[] iArr = o0Var.f739a;
        int length = iArr.length;
        Unsafe unsafe = f738o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            int L = o0Var.L(i13);
            int i15 = iArr[i13];
            int K = K(L);
            if (K <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i = L;
                i8 = 1 << (i16 >>> 20);
            } else {
                i = L;
                i8 = 0;
            }
            long j7 = i & i11;
            switch (K) {
                case 0:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        double d8 = k1.f717c.d(j7, obj);
                        m mVar = (m) g0Var.f687a;
                        mVar.getClass();
                        mVar.X(i15, Double.doubleToRawLongBits(d8));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        float e8 = k1.f717c.e(j7, obj);
                        m mVar2 = (m) g0Var.f687a;
                        mVar2.getClass();
                        mVar2.V(i15, Float.floatToRawIntBits(e8));
                    }
                    o0Var = this;
                    break;
                case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).h0(i15, unsafe.getLong(obj, j7));
                    }
                    o0Var = this;
                    break;
                case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).h0(i15, unsafe.getLong(obj, j7));
                    }
                    o0Var = this;
                    break;
                case a4.i.LONG_FIELD_NUMBER /* 4 */:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).Z(i15, unsafe.getInt(obj, j7));
                    }
                    o0Var = this;
                    break;
                case 5:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).X(i15, unsafe.getLong(obj, j7));
                    }
                    o0Var = this;
                    break;
                case 6:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).V(i15, unsafe.getInt(obj, j7));
                    }
                    o0Var = this;
                    break;
                case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).S(i15, k1.f717c.c(j7, obj));
                    }
                    o0Var = this;
                    break;
                case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        Object object = unsafe.getObject(obj, j7);
                        if (object instanceof String) {
                            ((m) g0Var.f687a).c0((String) object, i15);
                        } else {
                            ((m) g0Var.f687a).T(i15, (g) object);
                        }
                    }
                    o0Var = this;
                    break;
                case x.v0.f8304b /* 9 */:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).b0(i15, (a) unsafe.getObject(obj, j7), o0Var.m(i13));
                        break;
                    } else {
                        break;
                    }
                case x.v0.f8306d /* 10 */:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).T(i15, (g) unsafe.getObject(obj, j7));
                    }
                    o0Var = this;
                    break;
                case 11:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).f0(i15, unsafe.getInt(obj, j7));
                    }
                    o0Var = this;
                    break;
                case 12:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).Z(i15, unsafe.getInt(obj, j7));
                    }
                    o0Var = this;
                    break;
                case 13:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).V(i15, unsafe.getInt(obj, j7));
                    }
                    o0Var = this;
                    break;
                case 14:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        ((m) g0Var.f687a).X(i15, unsafe.getLong(obj, j7));
                    }
                    o0Var = this;
                    break;
                case x.v0.f8308f /* 15 */:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        int i18 = unsafe.getInt(obj, j7);
                        ((m) g0Var.f687a).f0(i15, (i18 >> 31) ^ (i18 << 1));
                    }
                    o0Var = this;
                    break;
                case 16:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        long j8 = unsafe.getLong(obj, j7);
                        ((m) g0Var.f687a).h0(i15, (j8 >> 63) ^ (j8 << 1));
                    }
                    o0Var = this;
                    break;
                case 17:
                    if (o0Var.o(obj, i13, i12, i14, i8)) {
                        g0Var.a(i15, unsafe.getObject(obj, j7), o0Var.m(i13));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i9 = i12;
                    y0.n(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 19:
                    i9 = i12;
                    y0.r(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 20:
                    i9 = i12;
                    y0.t(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 21:
                    i9 = i12;
                    y0.z(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 22:
                    i9 = i12;
                    y0.s(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 23:
                    i9 = i12;
                    y0.q(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 24:
                    i9 = i12;
                    y0.p(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 25:
                    i9 = i12;
                    y0.m(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 26:
                    i10 = i12;
                    int i19 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j7);
                    Class cls = y0.f796a;
                    if (list != null && !list.isEmpty()) {
                        g0Var.getClass();
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            ((m) g0Var.f687a).c0((String) list.get(i20), i19);
                        }
                    }
                    i12 = i10;
                    break;
                case 27:
                    i10 = i12;
                    int i21 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j7);
                    x0 m7 = o0Var.m(i13);
                    Class cls2 = y0.f796a;
                    if (list2 != null && !list2.isEmpty()) {
                        g0Var.getClass();
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((m) g0Var.f687a).b0(i21, (a) list2.get(i22), m7);
                        }
                    }
                    i12 = i10;
                    break;
                case 28:
                    i10 = i12;
                    int i23 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j7);
                    Class cls3 = y0.f796a;
                    if (list3 != null && !list3.isEmpty()) {
                        g0Var.getClass();
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            ((m) g0Var.f687a).T(i23, (g) list3.get(i24));
                        }
                    }
                    i12 = i10;
                    break;
                case 29:
                    i9 = i12;
                    z3 = false;
                    y0.y(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 30:
                    i9 = i12;
                    z3 = false;
                    y0.o(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 31:
                    i9 = i12;
                    z3 = false;
                    y0.u(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 32:
                    i9 = i12;
                    z3 = false;
                    y0.v(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 33:
                    i9 = i12;
                    z3 = false;
                    y0.w(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 34:
                    i9 = i12;
                    z3 = false;
                    y0.x(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, false);
                    i12 = i9;
                    break;
                case 35:
                    i10 = i12;
                    y0.n(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 36:
                    i10 = i12;
                    y0.r(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 37:
                    i10 = i12;
                    y0.t(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 38:
                    i10 = i12;
                    y0.z(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 39:
                    i10 = i12;
                    y0.s(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 40:
                    i10 = i12;
                    y0.q(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 41:
                    i10 = i12;
                    y0.p(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 42:
                    i10 = i12;
                    y0.m(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 43:
                    i10 = i12;
                    y0.y(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 44:
                    i10 = i12;
                    y0.o(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 45:
                    i10 = i12;
                    y0.u(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 46:
                    i10 = i12;
                    y0.v(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 47:
                    i10 = i12;
                    y0.w(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 48:
                    i10 = i12;
                    y0.x(iArr[i13], (List) unsafe.getObject(obj, j7), g0Var, true);
                    i12 = i10;
                    break;
                case 49:
                    i10 = i12;
                    int i25 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j7);
                    x0 m8 = o0Var.m(i13);
                    Class cls4 = y0.f796a;
                    if (list4 != null && !list4.isEmpty()) {
                        g0Var.getClass();
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            g0Var.a(i25, list4.get(i26), m8);
                        }
                    }
                    i12 = i10;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j7);
                    if (object2 != null) {
                        int i27 = 2;
                        Object obj2 = o0Var.f740b[(i13 / 3) * 2];
                        o0Var.f750m.getClass();
                        h0 h0Var = ((i0) obj2).f705a;
                        m mVar3 = (m) g0Var.f687a;
                        mVar3.getClass();
                        for (Map.Entry entry : ((j0) object2).entrySet()) {
                            mVar3.e0(i15, i27);
                            mVar3.g0(i0.a(h0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            r.b(mVar3, h0Var.f694a, 1, key);
                            i27 = 2;
                            r.b(mVar3, h0Var.f695b, 2, value);
                            i12 = i12;
                        }
                    }
                    i10 = i12;
                    i12 = i10;
                    break;
                case 51:
                    if (o0Var.q(i15, i13, obj)) {
                        double doubleValue = ((Double) k1.f717c.h(j7, obj)).doubleValue();
                        m mVar4 = (m) g0Var.f687a;
                        mVar4.getClass();
                        mVar4.X(i15, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case 52:
                    if (o0Var.q(i15, i13, obj)) {
                        float floatValue = ((Float) k1.f717c.h(j7, obj)).floatValue();
                        m mVar5 = (m) g0Var.f687a;
                        mVar5.getClass();
                        mVar5.V(i15, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).h0(i15, z(j7, obj));
                    }
                    break;
                case 54:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).h0(i15, z(j7, obj));
                    }
                    break;
                case 55:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).Z(i15, y(j7, obj));
                    }
                    break;
                case 56:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).X(i15, z(j7, obj));
                    }
                    break;
                case 57:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).V(i15, y(j7, obj));
                    }
                    break;
                case 58:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).S(i15, ((Boolean) k1.f717c.h(j7, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (o0Var.q(i15, i13, obj)) {
                        Object object3 = unsafe.getObject(obj, j7);
                        if (object3 instanceof String) {
                            ((m) g0Var.f687a).c0((String) object3, i15);
                        } else {
                            ((m) g0Var.f687a).T(i15, (g) object3);
                        }
                    }
                    break;
                case 60:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).b0(i15, (a) unsafe.getObject(obj, j7), o0Var.m(i13));
                    }
                    break;
                case 61:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).T(i15, (g) unsafe.getObject(obj, j7));
                    }
                    break;
                case 62:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).f0(i15, y(j7, obj));
                    }
                    break;
                case 63:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).Z(i15, y(j7, obj));
                    }
                    break;
                case 64:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).V(i15, y(j7, obj));
                    }
                    break;
                case 65:
                    if (o0Var.q(i15, i13, obj)) {
                        ((m) g0Var.f687a).X(i15, z(j7, obj));
                    }
                    break;
                case 66:
                    if (o0Var.q(i15, i13, obj)) {
                        int y7 = y(j7, obj);
                        ((m) g0Var.f687a).f0(i15, (y7 >> 31) ^ (y7 << 1));
                    }
                    break;
                case 67:
                    if (o0Var.q(i15, i13, obj)) {
                        long z7 = z(j7, obj);
                        ((m) g0Var.f687a).h0(i15, (z7 << 1) ^ (z7 >> 63));
                    }
                    break;
                case 68:
                    if (o0Var.q(i15, i13, obj)) {
                        g0Var.a(i15, unsafe.getObject(obj, j7), o0Var.m(i13));
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
        o0Var.f749l.getClass();
        ((w) obj).unknownFields.d(g0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.x0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f739a;
            if (i >= iArr.length) {
                y0.k(this.f749l, obj, obj2);
                return;
            }
            int L = L(i);
            long j7 = 1048575 & L;
            int i8 = iArr[i];
            switch (K(L)) {
                case 0:
                    if (n(i, obj2)) {
                        j1 j1Var = k1.f717c;
                        obj3 = obj;
                        j1Var.l(obj3, j7, j1Var.d(j7, obj2));
                        G(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i, obj2)) {
                        j1 j1Var2 = k1.f717c;
                        j1Var2.m(obj, j7, j1Var2.e(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if (n(i, obj2)) {
                        k1.n(obj, j7, k1.f717c.g(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (n(i, obj2)) {
                        k1.n(obj, j7, k1.f717c.g(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.i.LONG_FIELD_NUMBER /* 4 */:
                    if (n(i, obj2)) {
                        k1.m(obj, j7, k1.f717c.f(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        k1.n(obj, j7, k1.f717c.g(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        k1.m(obj, j7, k1.f717c.f(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i, obj2)) {
                        j1 j1Var3 = k1.f717c;
                        j1Var3.j(obj, j7, j1Var3.c(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(i, obj2)) {
                        k1.o(obj, j7, k1.f717c.h(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case x.v0.f8304b /* 9 */:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case x.v0.f8306d /* 10 */:
                    if (n(i, obj2)) {
                        k1.o(obj, j7, k1.f717c.h(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        k1.m(obj, j7, k1.f717c.f(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        k1.m(obj, j7, k1.f717c.f(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        k1.m(obj, j7, k1.f717c.f(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        k1.n(obj, j7, k1.f717c.g(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case x.v0.f8308f /* 15 */:
                    if (n(i, obj2)) {
                        k1.m(obj, j7, k1.f717c.f(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        k1.n(obj, j7, k1.f717c.g(j7, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f748k.getClass();
                    j1 j1Var4 = k1.f717c;
                    x xVar = (x) j1Var4.h(j7, obj);
                    x xVar2 = (x) j1Var4.h(j7, obj2);
                    v0 v0Var = (v0) xVar;
                    int i9 = v0Var.f789f;
                    int i10 = ((v0) xVar2).f789f;
                    if (i9 > 0 && i10 > 0) {
                        if (!((b) xVar).f649d) {
                            xVar = v0Var.c(i10 + i9);
                        }
                        ((b) xVar).addAll(xVar2);
                    }
                    if (i9 > 0) {
                        xVar2 = xVar;
                    }
                    k1.o(obj, j7, xVar2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = y0.f796a;
                    j1 j1Var5 = k1.f717c;
                    Object h8 = j1Var5.h(j7, obj);
                    Object h9 = j1Var5.h(j7, obj2);
                    this.f750m.getClass();
                    k1.o(obj, j7, k0.a(h8, h9));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(i8, i, obj2)) {
                        k1.o(obj, j7, k1.f717c.h(j7, obj2));
                        H(i8, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i8, i, obj2)) {
                        k1.o(obj, j7, k1.f717c.h(j7, obj2));
                        H(i8, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void b(Object obj, g0 g0Var) {
        g0Var.getClass();
        M(obj, g0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(w wVar) {
        int i;
        int b8;
        int i8;
        int[] iArr = this.f739a;
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int L = L(i10);
            int i11 = iArr[i10];
            long j7 = 1048575 & L;
            int i12 = 1237;
            int i13 = 37;
            switch (K(L)) {
                case 0:
                    i = i9 * 53;
                    b8 = y.b(Double.doubleToLongBits(k1.f717c.d(j7, wVar)));
                    i9 = b8 + i;
                    break;
                case 1:
                    i = i9 * 53;
                    b8 = Float.floatToIntBits(k1.f717c.e(j7, wVar));
                    i9 = b8 + i;
                    break;
                case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                    i = i9 * 53;
                    b8 = y.b(k1.f717c.g(j7, wVar));
                    i9 = b8 + i;
                    break;
                case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                    i = i9 * 53;
                    b8 = y.b(k1.f717c.g(j7, wVar));
                    i9 = b8 + i;
                    break;
                case a4.i.LONG_FIELD_NUMBER /* 4 */:
                    i = i9 * 53;
                    b8 = k1.f717c.f(j7, wVar);
                    i9 = b8 + i;
                    break;
                case 5:
                    i = i9 * 53;
                    b8 = y.b(k1.f717c.g(j7, wVar));
                    i9 = b8 + i;
                    break;
                case 6:
                    i = i9 * 53;
                    b8 = k1.f717c.f(j7, wVar);
                    i9 = b8 + i;
                    break;
                case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    i8 = i9 * 53;
                    boolean c8 = k1.f717c.c(j7, wVar);
                    Charset charset = y.f794a;
                    break;
                case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                    i = i9 * 53;
                    b8 = ((String) k1.f717c.h(j7, wVar)).hashCode();
                    i9 = b8 + i;
                    break;
                case x.v0.f8304b /* 9 */:
                    Object h8 = k1.f717c.h(j7, wVar);
                    if (h8 != null) {
                        i13 = h8.hashCode();
                    }
                    i9 = (i9 * 53) + i13;
                    break;
                case x.v0.f8306d /* 10 */:
                    i = i9 * 53;
                    b8 = k1.f717c.h(j7, wVar).hashCode();
                    i9 = b8 + i;
                    break;
                case 11:
                    i = i9 * 53;
                    b8 = k1.f717c.f(j7, wVar);
                    i9 = b8 + i;
                    break;
                case 12:
                    i = i9 * 53;
                    b8 = k1.f717c.f(j7, wVar);
                    i9 = b8 + i;
                    break;
                case 13:
                    i = i9 * 53;
                    b8 = k1.f717c.f(j7, wVar);
                    i9 = b8 + i;
                    break;
                case 14:
                    i = i9 * 53;
                    b8 = y.b(k1.f717c.g(j7, wVar));
                    i9 = b8 + i;
                    break;
                case x.v0.f8308f /* 15 */:
                    i = i9 * 53;
                    b8 = k1.f717c.f(j7, wVar);
                    i9 = b8 + i;
                    break;
                case 16:
                    i = i9 * 53;
                    b8 = y.b(k1.f717c.g(j7, wVar));
                    i9 = b8 + i;
                    break;
                case 17:
                    Object h9 = k1.f717c.h(j7, wVar);
                    if (h9 != null) {
                        i13 = h9.hashCode();
                    }
                    i9 = (i9 * 53) + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i9 * 53;
                    b8 = k1.f717c.h(j7, wVar).hashCode();
                    i9 = b8 + i;
                    break;
                case 50:
                    i = i9 * 53;
                    b8 = k1.f717c.h(j7, wVar).hashCode();
                    i9 = b8 + i;
                    break;
                case 51:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y.b(Double.doubleToLongBits(((Double) k1.f717c.h(j7, wVar)).doubleValue()));
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = Float.floatToIntBits(((Float) k1.f717c.h(j7, wVar)).floatValue());
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y.b(z(j7, wVar));
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y.b(z(j7, wVar));
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y(j7, wVar);
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y.b(z(j7, wVar));
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y(j7, wVar);
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i11, i10, wVar)) {
                        i8 = i9 * 53;
                        boolean booleanValue = ((Boolean) k1.f717c.h(j7, wVar)).booleanValue();
                        Charset charset2 = y.f794a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = ((String) k1.f717c.h(j7, wVar)).hashCode();
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = k1.f717c.h(j7, wVar).hashCode();
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = k1.f717c.h(j7, wVar).hashCode();
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y(j7, wVar);
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y(j7, wVar);
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y(j7, wVar);
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y.b(z(j7, wVar));
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y(j7, wVar);
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = y.b(z(j7, wVar));
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i11, i10, wVar)) {
                        i = i9 * 53;
                        b8 = k1.f717c.h(j7, wVar).hashCode();
                        i9 = b8 + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f749l.getClass();
        return wVar.unknownFields.hashCode() + (i9 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void d(Object obj) {
        if (p(obj)) {
            if (obj instanceof w) {
                w wVar = (w) obj;
                wVar.k(Integer.MAX_VALUE);
                wVar.memoizedHashCode = 0;
                wVar.h();
            }
            int[] iArr = this.f739a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int L = L(i);
                long j7 = 1048575 & L;
                int K = K(L);
                if (K != 9) {
                    if (K != 60 && K != 68) {
                        switch (K) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f748k.getClass();
                                b bVar = (b) ((x) k1.f717c.h(j7, obj));
                                if (bVar.f649d) {
                                    bVar.f649d = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = f738o;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    this.f750m.getClass();
                                    ((j0) object).f709d = false;
                                    unsafe.putObject(obj, j7, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).d(f738o.getObject(obj, j7));
                    }
                }
                if (n(i, obj)) {
                    m(i).d(f738o.getObject(obj, j7));
                }
            }
            this.f749l.getClass();
            e1 e1Var = ((w) obj).unknownFields;
            if (e1Var.f679e) {
                e1Var.f679e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean e(Object obj) {
        int i;
        int i8;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f746h) {
            int i13 = this.f745g[i12];
            int[] iArr = this.f739a;
            int i14 = iArr[i13];
            int L = L(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f738o.getInt(obj, i16);
                }
                i8 = i13;
                i9 = i11;
                i = i16;
            } else {
                int i18 = i11;
                i = i10;
                i8 = i13;
                i9 = i18;
            }
            if ((268435456 & L) == 0 || o(obj, i8, i, i9, i17)) {
                int K = K(L);
                if (K == 9 || K == 17) {
                    if (o(obj, i8, i, i9, i17)) {
                        if (!m(i8).e(k1.f717c.h(L & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i12++;
                    i10 = i;
                    i11 = i9;
                } else {
                    if (K != 27) {
                        if (K == 60 || K == 68) {
                            if (q(i14, i8, obj)) {
                                if (!m(i8).e(k1.f717c.h(L & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i12++;
                            i10 = i;
                            i11 = i9;
                        } else if (K != 49) {
                            if (K != 50) {
                                continue;
                            } else {
                                Object h8 = k1.f717c.h(L & 1048575, obj);
                                this.f750m.getClass();
                                j0 j0Var = (j0) h8;
                                if (j0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((i0) this.f740b[(i8 / 3) * 2]).f705a.f695b.f769d != t1.f780l) {
                                        continue;
                                    } else {
                                        x0 x0Var = null;
                                        for (Object obj2 : j0Var.values()) {
                                            if (x0Var == null) {
                                                x0Var = u0.f784c.a(obj2.getClass());
                                            }
                                            if (!x0Var.e(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            i10 = i;
                            i11 = i9;
                        }
                    }
                    List list = (List) k1.f717c.h(L & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        x0 m7 = m(i8);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (m7.e(list.get(i19))) {
                            }
                        }
                    }
                    i12++;
                    i10 = i;
                    i11 = i9;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.y0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.y0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.y0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.y0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.y0.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(w wVar, w wVar2) {
        int[] iArr = this.f739a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i < length) {
                int L = L(i);
                long j7 = L & 1048575;
                switch (K(L)) {
                    case 0:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 1:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var2 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var3 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var4 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var5 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 5:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var6 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 6:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var7 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var8 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var9 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case x.v0.f8304b /* 9 */:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var10 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case x.v0.f8306d /* 10 */:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var11 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 11:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var12 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 12:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var13 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 13:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var14 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 14:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var15 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case x.v0.f8308f /* 15 */:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var16 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 16:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var17 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 17:
                        if (j(wVar, wVar2, i)) {
                            j1 j1Var18 = k1.f717c;
                            break;
                        }
                        z3 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        j1 j1Var19 = k1.f717c;
                        z3 = y0.l(j1Var19.h(j7, wVar), j1Var19.h(j7, wVar2));
                        break;
                    case 50:
                        j1 j1Var20 = k1.f717c;
                        z3 = y0.l(j1Var20.h(j7, wVar), j1Var20.h(j7, wVar2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j8 = iArr[i + 2] & 1048575;
                        j1 j1Var21 = k1.f717c;
                        if (j1Var21.f(j8, wVar) == j1Var21.f(j8, wVar2)) {
                            break;
                        }
                        z3 = false;
                        break;
                }
                if (z3) {
                    i += 3;
                }
            } else {
                this.f749l.getClass();
                if (wVar.unknownFields.equals(wVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.x0
    public final void g(java.lang.Object r19, androidx.datastore.preferences.protobuf.k r20, androidx.datastore.preferences.protobuf.o r21) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o0.g(java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.o):void");
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final int h(w wVar) {
        int i;
        int L;
        int L2;
        int L3;
        int N;
        int L4;
        int N2;
        int L5;
        int L6;
        int J;
        int L7;
        int a8;
        int c8;
        int L8;
        int size;
        int i8;
        int L9;
        int L10;
        int size2;
        int L11;
        int M;
        int i9;
        int i10;
        int L12;
        int M2;
        o0 o0Var = this;
        w wVar2 = wVar;
        Unsafe unsafe = f738o;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = o0Var.f739a;
            if (i12 >= iArr.length) {
                o0Var.f749l.getClass();
                return wVar2.unknownFields.b() + i14;
            }
            int L13 = o0Var.L(i12);
            int K = K(L13);
            int i15 = iArr[i12];
            int i16 = iArr[i12 + 2];
            int i17 = i16 & 1048575;
            if (K <= 17) {
                if (i17 != i11) {
                    i13 = i17 == 1048575 ? 0 : unsafe.getInt(wVar2, i17);
                    i11 = i17;
                }
                i = 1 << (i16 >>> 20);
            } else {
                i = 0;
            }
            long j7 = L13 & 1048575;
            if (K >= s.f761e.f765d) {
                int i18 = s.f762f.f765d;
            }
            switch (K) {
                case 0:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        L = m.L(i15);
                        c8 = L + 8;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        L2 = m.L(i15);
                        L6 = L2 + 4;
                        i14 += L6;
                    }
                    o0Var = this;
                    wVar2 = wVar;
                    break;
                case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        long j8 = unsafe.getLong(wVar2, j7);
                        L3 = m.L(i15);
                        N = m.N(j8);
                        i14 += N + L3;
                    }
                    o0Var = this;
                    break;
                case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        long j9 = unsafe.getLong(wVar2, j7);
                        L3 = m.L(i15);
                        N = m.N(j9);
                        i14 += N + L3;
                    }
                    o0Var = this;
                    break;
                case a4.i.LONG_FIELD_NUMBER /* 4 */:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        int i19 = unsafe.getInt(wVar2, j7);
                        L4 = m.L(i15);
                        N2 = m.N(i19);
                        J = N2 + L4;
                        i14 += J;
                    }
                    o0Var = this;
                    break;
                case 5:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        L5 = m.L(i15);
                        L6 = L5 + 8;
                        i14 += L6;
                    }
                    o0Var = this;
                    wVar2 = wVar;
                    break;
                case 6:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        L2 = m.L(i15);
                        L6 = L2 + 4;
                        i14 += L6;
                    }
                    o0Var = this;
                    wVar2 = wVar;
                    break;
                case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        L6 = m.L(i15) + 1;
                        i14 += L6;
                    }
                    o0Var = this;
                    wVar2 = wVar;
                    break;
                case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        Object object = unsafe.getObject(wVar2, j7);
                        i14 = (object instanceof g ? m.J(i15, (g) object) : m.K((String) object) + m.L(i15)) + i14;
                    }
                    o0Var = this;
                    break;
                case x.v0.f8304b /* 9 */:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        Object object2 = unsafe.getObject(wVar2, j7);
                        x0 m7 = o0Var.m(i12);
                        Class cls = y0.f796a;
                        int L14 = m.L(i15);
                        int a9 = ((a) object2).a(m7);
                        i14 += m.M(a9) + a9 + L14;
                        break;
                    } else {
                        break;
                    }
                case x.v0.f8306d /* 10 */:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        J = m.J(i15, (g) unsafe.getObject(wVar2, j7));
                        i14 += J;
                    }
                    o0Var = this;
                    break;
                case 11:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        int i20 = unsafe.getInt(wVar2, j7);
                        L4 = m.L(i15);
                        N2 = m.M(i20);
                        J = N2 + L4;
                        i14 += J;
                    }
                    o0Var = this;
                    break;
                case 12:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        int i21 = unsafe.getInt(wVar2, j7);
                        L4 = m.L(i15);
                        N2 = m.N(i21);
                        J = N2 + L4;
                        i14 += J;
                    }
                    o0Var = this;
                    break;
                case 13:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        L2 = m.L(i15);
                        L6 = L2 + 4;
                        i14 += L6;
                    }
                    o0Var = this;
                    wVar2 = wVar;
                    break;
                case 14:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        L5 = m.L(i15);
                        L6 = L5 + 8;
                        i14 += L6;
                    }
                    o0Var = this;
                    wVar2 = wVar;
                    break;
                case x.v0.f8308f /* 15 */:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        int i22 = unsafe.getInt(wVar2, j7);
                        L4 = m.L(i15);
                        N2 = m.M((i22 >> 31) ^ (i22 << 1));
                        J = N2 + L4;
                        i14 += J;
                    }
                    o0Var = this;
                    break;
                case 16:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        long j10 = unsafe.getLong(wVar2, j7);
                        L3 = m.L(i15);
                        N = m.N((j10 << 1) ^ (j10 >> 63));
                        i14 += N + L3;
                    }
                    o0Var = this;
                    break;
                case 17:
                    if (o0Var.o(wVar2, i12, i11, i13, i)) {
                        a aVar = (a) unsafe.getObject(wVar2, j7);
                        x0 m8 = o0Var.m(i12);
                        L7 = m.L(i15) * 2;
                        a8 = aVar.a(m8);
                        c8 = a8 + L7;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c8 = y0.c(i15, (List) unsafe.getObject(wVar2, j7));
                    i14 += c8;
                    break;
                case 19:
                    c8 = y0.b(i15, (List) unsafe.getObject(wVar2, j7));
                    i14 += c8;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(wVar2, j7);
                    Class cls2 = y0.f796a;
                    if (list.size() != 0) {
                        L8 = (m.L(i15) * list.size()) + y0.e(list);
                        i14 += L8;
                        break;
                    }
                    L8 = 0;
                    i14 += L8;
                case 21:
                    List list2 = (List) unsafe.getObject(wVar2, j7);
                    Class cls3 = y0.f796a;
                    size = list2.size();
                    if (size != 0) {
                        i8 = y0.i(list2);
                        L9 = m.L(i15);
                        L8 = (L9 * size) + i8;
                        i14 += L8;
                        break;
                    }
                    L8 = 0;
                    i14 += L8;
                case 22:
                    List list3 = (List) unsafe.getObject(wVar2, j7);
                    Class cls4 = y0.f796a;
                    size = list3.size();
                    if (size != 0) {
                        i8 = y0.d(list3);
                        L9 = m.L(i15);
                        L8 = (L9 * size) + i8;
                        i14 += L8;
                        break;
                    }
                    L8 = 0;
                    i14 += L8;
                case 23:
                    c8 = y0.c(i15, (List) unsafe.getObject(wVar2, j7));
                    i14 += c8;
                    break;
                case 24:
                    c8 = y0.b(i15, (List) unsafe.getObject(wVar2, j7));
                    i14 += c8;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(wVar2, j7);
                    Class cls5 = y0.f796a;
                    int size3 = list4.size();
                    i14 += size3 == 0 ? 0 : (m.L(i15) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(wVar2, j7);
                    Class cls6 = y0.f796a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        L8 = m.L(i15) * size4;
                        for (int i23 = 0; i23 < size4; i23++) {
                            Object obj = list5.get(i23);
                            if (obj instanceof g) {
                                int size5 = ((g) obj).size();
                                L8 = m.M(size5) + size5 + L8;
                            } else {
                                L8 = m.K((String) obj) + L8;
                            }
                        }
                        i14 += L8;
                        break;
                    }
                    L8 = 0;
                    i14 += L8;
                case 27:
                    List list6 = (List) unsafe.getObject(wVar2, j7);
                    x0 m9 = o0Var.m(i12);
                    Class cls7 = y0.f796a;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        L10 = m.L(i15) * size6;
                        for (int i24 = 0; i24 < size6; i24++) {
                            int a10 = ((a) list6.get(i24)).a(m9);
                            L10 += m.M(a10) + a10;
                        }
                        i14 += L10;
                        break;
                    }
                    L10 = 0;
                    i14 += L10;
                case 28:
                    List list7 = (List) unsafe.getObject(wVar2, j7);
                    Class cls8 = y0.f796a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        L8 = m.L(i15) * size7;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int size8 = ((g) list7.get(i25)).size();
                            L8 += m.M(size8) + size8;
                        }
                        i14 += L8;
                        break;
                    }
                    L8 = 0;
                    i14 += L8;
                case 29:
                    List list8 = (List) unsafe.getObject(wVar2, j7);
                    Class cls9 = y0.f796a;
                    size = list8.size();
                    if (size != 0) {
                        i8 = y0.h(list8);
                        L9 = m.L(i15);
                        L8 = (L9 * size) + i8;
                        i14 += L8;
                        break;
                    }
                    L8 = 0;
                    i14 += L8;
                case 30:
                    List list9 = (List) unsafe.getObject(wVar2, j7);
                    Class cls10 = y0.f796a;
                    size = list9.size();
                    if (size != 0) {
                        i8 = y0.a(list9);
                        L9 = m.L(i15);
                        L8 = (L9 * size) + i8;
                        i14 += L8;
                        break;
                    }
                    L8 = 0;
                    i14 += L8;
                case 31:
                    c8 = y0.b(i15, (List) unsafe.getObject(wVar2, j7));
                    i14 += c8;
                    break;
                case 32:
                    c8 = y0.c(i15, (List) unsafe.getObject(wVar2, j7));
                    i14 += c8;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(wVar2, j7);
                    Class cls11 = y0.f796a;
                    size = list10.size();
                    if (size != 0) {
                        i8 = y0.f(list10);
                        L9 = m.L(i15);
                        L8 = (L9 * size) + i8;
                        i14 += L8;
                        break;
                    }
                    L8 = 0;
                    i14 += L8;
                case 34:
                    List list11 = (List) unsafe.getObject(wVar2, j7);
                    Class cls12 = y0.f796a;
                    size = list11.size();
                    if (size != 0) {
                        i8 = y0.g(list11);
                        L9 = m.L(i15);
                        L8 = (L9 * size) + i8;
                        i14 += L8;
                        break;
                    }
                    L8 = 0;
                    i14 += L8;
                case 35:
                    List list12 = (List) unsafe.getObject(wVar2, j7);
                    Class cls13 = y0.f796a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(wVar2, j7);
                    Class cls14 = y0.f796a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = y0.e((List) unsafe.getObject(wVar2, j7));
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = y0.i((List) unsafe.getObject(wVar2, j7));
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = y0.d((List) unsafe.getObject(wVar2, j7));
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(wVar2, j7);
                    Class cls15 = y0.f796a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(wVar2, j7);
                    Class cls16 = y0.f796a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(wVar2, j7);
                    Class cls17 = y0.f796a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = y0.h((List) unsafe.getObject(wVar2, j7));
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = y0.a((List) unsafe.getObject(wVar2, j7));
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(wVar2, j7);
                    Class cls18 = y0.f796a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(wVar2, j7);
                    Class cls19 = y0.f796a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = y0.f((List) unsafe.getObject(wVar2, j7));
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = y0.g((List) unsafe.getObject(wVar2, j7));
                    if (size2 > 0) {
                        L11 = m.L(i15);
                        M = m.M(size2);
                        i9 = M + L11;
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(wVar2, j7);
                    x0 m10 = o0Var.m(i12);
                    Class cls20 = y0.f796a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        for (int i26 = 0; i26 < size9; i26++) {
                            i10 += ((a) list19.get(i26)).a(m10) + (m.L(i15) * 2);
                        }
                    }
                    i14 += i10;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(wVar2, j7);
                    Object obj2 = o0Var.f740b[(i12 / 3) * 2];
                    o0Var.f750m.getClass();
                    j0 j0Var = (j0) object3;
                    i0 i0Var = (i0) obj2;
                    if (!j0Var.isEmpty()) {
                        L10 = 0;
                        for (Map.Entry entry : j0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            i0Var.getClass();
                            int L15 = m.L(i15);
                            int a11 = i0.a(i0Var.f705a, key, value);
                            L10 += m.M(a11) + a11 + L15;
                        }
                        i14 += L10;
                        break;
                    }
                    L10 = 0;
                    i14 += L10;
                case 51:
                    if (o0Var.q(i15, i12, wVar2)) {
                        L = m.L(i15);
                        c8 = L + 8;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (o0Var.q(i15, i12, wVar2)) {
                        L12 = m.L(i15);
                        c8 = L12 + 4;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (o0Var.q(i15, i12, wVar2)) {
                        long z3 = z(j7, wVar2);
                        size2 = m.L(i15);
                        i9 = m.N(z3);
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (o0Var.q(i15, i12, wVar2)) {
                        long z7 = z(j7, wVar2);
                        size2 = m.L(i15);
                        i9 = m.N(z7);
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (o0Var.q(i15, i12, wVar2)) {
                        int y7 = y(j7, wVar2);
                        L7 = m.L(i15);
                        a8 = m.N(y7);
                        c8 = a8 + L7;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (o0Var.q(i15, i12, wVar2)) {
                        L = m.L(i15);
                        c8 = L + 8;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (o0Var.q(i15, i12, wVar2)) {
                        L12 = m.L(i15);
                        c8 = L12 + 4;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (o0Var.q(i15, i12, wVar2)) {
                        c8 = m.L(i15) + 1;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (o0Var.q(i15, i12, wVar2)) {
                        Object object4 = unsafe.getObject(wVar2, j7);
                        i14 = (object4 instanceof g ? m.J(i15, (g) object4) : m.K((String) object4) + m.L(i15)) + i14;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (o0Var.q(i15, i12, wVar2)) {
                        Object object5 = unsafe.getObject(wVar2, j7);
                        x0 m11 = o0Var.m(i12);
                        Class cls21 = y0.f796a;
                        int L16 = m.L(i15);
                        int a12 = ((a) object5).a(m11);
                        M2 = m.M(a12) + a12 + L16;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (o0Var.q(i15, i12, wVar2)) {
                        c8 = m.J(i15, (g) unsafe.getObject(wVar2, j7));
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (o0Var.q(i15, i12, wVar2)) {
                        int y8 = y(j7, wVar2);
                        L7 = m.L(i15);
                        a8 = m.M(y8);
                        c8 = a8 + L7;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (o0Var.q(i15, i12, wVar2)) {
                        int y9 = y(j7, wVar2);
                        L7 = m.L(i15);
                        a8 = m.N(y9);
                        c8 = a8 + L7;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (o0Var.q(i15, i12, wVar2)) {
                        L12 = m.L(i15);
                        c8 = L12 + 4;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (o0Var.q(i15, i12, wVar2)) {
                        L = m.L(i15);
                        c8 = L + 8;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (o0Var.q(i15, i12, wVar2)) {
                        int y10 = y(j7, wVar2);
                        L7 = m.L(i15);
                        a8 = m.M((y10 >> 31) ^ (y10 << 1));
                        c8 = a8 + L7;
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (o0Var.q(i15, i12, wVar2)) {
                        long z8 = z(j7, wVar2);
                        size2 = m.L(i15);
                        i9 = m.N((z8 << 1) ^ (z8 >> 63));
                        M2 = i9 + size2;
                        i14 += M2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (o0Var.q(i15, i12, wVar2)) {
                        c8 = ((a) unsafe.getObject(wVar2, j7)).a(o0Var.m(i12)) + (m.L(i15) * 2);
                        i14 += c8;
                        break;
                    } else {
                        break;
                    }
            }
            i12 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final w i() {
        this.f747j.getClass();
        return ((w) this.f743e).i();
    }

    public final boolean j(w wVar, w wVar2, int i) {
        return n(i, wVar) == n(i, wVar2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i8 = this.f739a[i];
        if (k1.f717c.h(L(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.f740b[((i / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final x0 m(int i) {
        int i8 = (i / 3) * 2;
        Object[] objArr = this.f740b;
        x0 x0Var = (x0) objArr[i8];
        if (x0Var != null) {
            return x0Var;
        }
        x0 a8 = u0.f784c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a8;
        return a8;
    }

    public final boolean n(int i, Object obj) {
        int i8 = this.f739a[i + 2];
        long j7 = i8 & 1048575;
        if (j7 == 1048575) {
            int L = L(i);
            long j8 = L & 1048575;
            switch (K(L)) {
                case 0:
                    if (Double.doubleToRawLongBits(k1.f717c.d(j8, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(k1.f717c.e(j8, obj)) == 0) {
                        return false;
                    }
                    break;
                case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if (k1.f717c.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (k1.f717c.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.i.LONG_FIELD_NUMBER /* 4 */:
                    if (k1.f717c.f(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (k1.f717c.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (k1.f717c.f(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    return k1.f717c.c(j8, obj);
                case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                    Object h8 = k1.f717c.h(j8, obj);
                    if (h8 instanceof String) {
                        return !((String) h8).isEmpty();
                    }
                    if (h8 instanceof g) {
                        return !g.f682f.equals(h8);
                    }
                    throw new IllegalArgumentException();
                case x.v0.f8304b /* 9 */:
                    if (k1.f717c.h(j8, obj) == null) {
                        return false;
                    }
                    break;
                case x.v0.f8306d /* 10 */:
                    return !g.f682f.equals(k1.f717c.h(j8, obj));
                case 11:
                    if (k1.f717c.f(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (k1.f717c.f(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (k1.f717c.f(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (k1.f717c.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case x.v0.f8308f /* 15 */:
                    if (k1.f717c.f(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (k1.f717c.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (k1.f717c.h(j8, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i8 >>> 20)) & k1.f717c.f(j7, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i, int i8, int i9, int i10) {
        return i8 == 1048575 ? n(i, obj) : (i9 & i10) != 0;
    }

    public final boolean q(int i, int i8, Object obj) {
        return k1.f717c.f((long) (this.f739a[i8 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i, Object obj2, o oVar, k kVar) {
        long L = L(i) & 1048575;
        Object h8 = k1.f717c.h(L, obj);
        k0 k0Var = this.f750m;
        if (h8 == null) {
            k0Var.getClass();
            h8 = j0.f708e.b();
            k1.o(obj, L, h8);
        } else {
            k0Var.getClass();
            if (!((j0) h8).f709d) {
                j0 b8 = j0.f708e.b();
                k0.a(b8, h8);
                k1.o(obj, L, b8);
                h8 = b8;
            }
        }
        k0Var.getClass();
        j0 j0Var = (j0) h8;
        h0 h0Var = ((i0) obj2).f705a;
        kVar.y(2);
        j jVar = (j) kVar.f714d;
        int i8 = jVar.i(jVar.A());
        Object obj3 = h0Var.f696c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a8 = kVar.a();
                if (a8 == Integer.MAX_VALUE || jVar.c()) {
                    break;
                }
                if (a8 == 1) {
                    obj4 = kVar.k(h0Var.f694a, null, null);
                } else if (a8 != 2) {
                    try {
                        if (!kVar.z()) {
                            throw new a0("Unable to parse map entry.");
                        }
                    } catch (z unused) {
                        if (!kVar.z()) {
                            throw new a0("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = kVar.k(h0Var.f695b, obj3.getClass(), oVar);
                }
            } catch (Throwable th) {
                jVar.h(i8);
                throw th;
            }
        }
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long L = L(i) & 1048575;
            Unsafe unsafe = f738o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f739a[i] + " is present but null: " + obj2);
            }
            x0 m7 = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    w i8 = m7.i();
                    m7.a(i8, object);
                    unsafe.putObject(obj, L, i8);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                w i9 = m7.i();
                m7.a(i9, object2);
                unsafe.putObject(obj, L, i9);
                object2 = i9;
            }
            m7.a(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.f739a;
        int i8 = iArr[i];
        if (q(i8, i, obj2)) {
            long L = L(i) & 1048575;
            Unsafe unsafe = f738o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            x0 m7 = m(i);
            if (!q(i8, i, obj)) {
                if (p(object)) {
                    w i9 = m7.i();
                    m7.a(i9, object);
                    unsafe.putObject(obj, L, i9);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                H(i8, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                w i10 = m7.i();
                m7.a(i10, object2);
                unsafe.putObject(obj, L, i10);
                object2 = i10;
            }
            m7.a(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        x0 m7 = m(i);
        long L = L(i) & 1048575;
        if (!n(i, obj)) {
            return m7.i();
        }
        Object object = f738o.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        w i8 = m7.i();
        if (object != null) {
            m7.a(i8, object);
        }
        return i8;
    }

    public final Object v(int i, int i8, Object obj) {
        x0 m7 = m(i8);
        if (!q(i, i8, obj)) {
            return m7.i();
        }
        Object object = f738o.getObject(obj, L(i8) & 1048575);
        if (p(object)) {
            return object;
        }
        w i9 = m7.i();
        if (object != null) {
            m7.a(i9, object);
        }
        return i9;
    }
}
