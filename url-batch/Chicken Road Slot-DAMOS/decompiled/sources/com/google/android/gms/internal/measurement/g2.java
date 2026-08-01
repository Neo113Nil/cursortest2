package com.google.android.gms.internal.measurement;

import com.appsflyer.attribution.RequestError;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g2 implements o2 {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f2312k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f2313l = z2.l();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2314a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2315b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2316c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2317d;

    /* renamed from: e, reason: collision with root package name */
    public final o0 f2318e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2319f;
    public final int[] g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2320h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2321i;
    public final h1 j;

    public g2(int[] iArr, Object[] objArr, int i3, int i10, o0 o0Var, int[] iArr2, int i11, int i12, h1 h1Var, h1 h1Var2) {
        this.f2314a = iArr;
        this.f2315b = objArr;
        this.f2316c = i3;
        this.f2317d = i10;
        this.f2319f = o0Var instanceof k1;
        this.g = iArr2;
        this.f2320h = i11;
        this.f2321i = i12;
        this.j = h1Var;
        this.f2318e = o0Var;
    }

    public static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            n0.l.l(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(v4.a.o(sb2, " not found. Known fields are ", arrays), e2);
        }
    }

    public static int l(int i3) {
        return (i3 >>> 20) & 255;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof k1) {
            return ((k1) obj).g();
        }
        return true;
    }

    public static void n(Object obj) {
        if (m(obj)) {
            return;
        }
        te.a1.e("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int o(long j, Object obj) {
        return ((Integer) z2.i(j, obj)).intValue();
    }

    public static long p(long j, Object obj) {
        return ((Long) z2.i(j, obj)).longValue();
    }

    public static final int x(byte[] bArr, int i3, int i10, c3 c3Var, Class cls, r0 r0Var) {
        c3 c3Var2 = c3.f2183i;
        switch (c3Var.ordinal()) {
            case 0:
                int i11 = i3 + 8;
                r0Var.f2722c = Double.valueOf(Double.longBitsToDouble(ia.l(i3, bArr)));
                return i11;
            case 1:
                int i12 = i3 + 4;
                r0Var.f2722c = Float.valueOf(Float.intBitsToFloat(ia.i(i3, bArr)));
                return i12;
            case 2:
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                int g = ia.g(bArr, i3, r0Var);
                r0Var.f2722c = Long.valueOf(r0Var.f2721b);
                return g;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
            case 12:
            case 13:
                int a9 = ia.a(bArr, i3, r0Var);
                r0Var.f2722c = Integer.valueOf(r0Var.f2720a);
                return a9;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
            case 15:
                int i13 = i3 + 8;
                r0Var.f2722c = Long.valueOf(ia.l(i3, bArr));
                return i13;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case 14:
                int i14 = i3 + 4;
                r0Var.f2722c = Integer.valueOf(ia.i(i3, bArr));
                return i14;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int g2 = ia.g(bArr, i3, r0Var);
                r0Var.f2722c = Boolean.valueOf(r0Var.f2721b != 0);
                return g2;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return ia.n(bArr, i3, r0Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                o2 a10 = l2.f2493c.a(cls);
                k1 a11 = a10.a();
                int t6 = ia.t(a11, a10, bArr, i3, i10, r0Var);
                a10.h(a11);
                r0Var.f2722c = a11;
                return t6;
            case RequestError.STOP_TRACKING /* 11 */:
                return ia.q(bArr, i3, r0Var);
            case 16:
                int a12 = ia.a(bArr, i3, r0Var);
                r0Var.f2722c = Integer.valueOf(y0.j(r0Var.f2720a));
                return a12;
            case 17:
                int g10 = ia.g(bArr, i3, r0Var);
                r0Var.f2722c = Long.valueOf(y0.k(r0Var.f2721b));
                return g10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g2 z(n2 n2Var, h1 h1Var, h1 h1Var2) {
        int i3;
        int charAt;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt2;
        int i17;
        int i18;
        char charAt3;
        int i19;
        char charAt4;
        int i20;
        char charAt5;
        int i21;
        char charAt6;
        int i22;
        char charAt7;
        int i23;
        char charAt8;
        int i24;
        int i25;
        Object[] objArr;
        int i26;
        Class<?> cls;
        int objectFieldOffset;
        int i27;
        String str;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Field A;
        int i33;
        char charAt9;
        int i34;
        int i35;
        int i36;
        int i37;
        Object obj;
        Field A2;
        Object obj2;
        Field A3;
        int i38;
        char charAt10;
        int i39;
        char charAt11;
        int i40;
        char charAt12;
        int i41;
        char charAt13;
        if (!(n2Var instanceof n2)) {
            n2Var.getClass();
            kotlin.collections.i0.j();
            return null;
        }
        String str2 = n2Var.f2560b;
        int length = str2.length();
        int i42 = 55296;
        if (str2.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i3 = i43 + 1;
                if (str2.charAt(i43) < 55296) {
                    break;
                }
                i43 = i3;
            }
        } else {
            i3 = 1;
        }
        int i44 = i3 + 1;
        int charAt14 = str2.charAt(i3);
        if (charAt14 >= 55296) {
            int i45 = charAt14 & 8191;
            int i46 = 13;
            while (true) {
                i41 = i44 + 1;
                charAt13 = str2.charAt(i44);
                if (charAt13 < 55296) {
                    break;
                }
                i45 |= (charAt13 & 8191) << i46;
                i46 += 13;
                i44 = i41;
            }
            charAt14 = i45 | (charAt13 << i46);
            i44 = i41;
        }
        if (charAt14 == 0) {
            i11 = 0;
            i14 = 0;
            charAt = 0;
            i10 = 0;
            i13 = 0;
            i15 = 0;
            iArr = f2312k;
            i12 = 0;
        } else {
            int i47 = i44 + 1;
            int charAt15 = str2.charAt(i44);
            if (charAt15 >= 55296) {
                int i48 = charAt15 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    charAt8 = str2.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                charAt15 = i48 | (charAt8 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int charAt16 = str2.charAt(i47);
            if (charAt16 >= 55296) {
                int i51 = charAt16 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    charAt7 = str2.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                charAt16 = i51 | (charAt7 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int charAt17 = str2.charAt(i50);
            if (charAt17 >= 55296) {
                int i54 = charAt17 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    charAt6 = str2.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                charAt17 = i54 | (charAt6 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            int charAt18 = str2.charAt(i53);
            if (charAt18 >= 55296) {
                int i57 = charAt18 & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    charAt5 = str2.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                charAt18 = i57 | (charAt5 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            charAt = str2.charAt(i56);
            if (charAt >= 55296) {
                int i60 = charAt & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    charAt4 = str2.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                charAt = i60 | (charAt4 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            int charAt19 = str2.charAt(i59);
            if (charAt19 >= 55296) {
                int i63 = charAt19 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    charAt3 = str2.charAt(i62);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                charAt19 = i63 | (charAt3 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            if (str2.charAt(i62) >= 55296) {
                while (true) {
                    i17 = i65 + 1;
                    if (str2.charAt(i65) < 55296) {
                        break;
                    }
                    i65 = i17;
                }
                i65 = i17;
            }
            int i66 = i65 + 1;
            int charAt20 = str2.charAt(i65);
            if (charAt20 >= 55296) {
                int i67 = charAt20 & 8191;
                int i68 = 13;
                while (true) {
                    i16 = i66 + 1;
                    charAt2 = str2.charAt(i66);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i67 |= (charAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i16;
                }
                charAt20 = i67 | (charAt2 << i68);
                i66 = i16;
            }
            int i69 = charAt15 + charAt15 + charAt16;
            int[] iArr2 = new int[charAt20 + charAt19 + charAt15];
            int i70 = charAt19;
            i10 = charAt17;
            i11 = i70;
            iArr = iArr2;
            i12 = charAt15;
            i44 = i66;
            i13 = charAt18;
            i14 = i69;
            i15 = charAt20;
        }
        Unsafe unsafe = f2313l;
        Object[] objArr2 = n2Var.f2561c;
        Class<?> cls2 = n2Var.f2559a.getClass();
        int i71 = i15 + i11;
        int i72 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr3 = new Object[i72];
        int i73 = i71;
        int i74 = i15;
        int i75 = 0;
        int i76 = 0;
        while (i44 < length) {
            int i77 = i44 + 1;
            int charAt21 = str2.charAt(i44);
            if (charAt21 >= i42) {
                int i78 = charAt21 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i40 = i79 + 1;
                    charAt12 = str2.charAt(i79);
                    i24 = length;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i78 |= (charAt12 & 8191) << i80;
                    i80 += 13;
                    i79 = i40;
                    length = i24;
                }
                charAt21 = i78 | (charAt12 << i80);
                i25 = i40;
            } else {
                i24 = length;
                i25 = i77;
            }
            int i81 = i25 + 1;
            int charAt22 = str2.charAt(i25);
            Object[] objArr4 = objArr2;
            char c10 = 55296;
            if (charAt22 >= 55296) {
                int i82 = charAt22 & 8191;
                int i83 = 13;
                while (true) {
                    i39 = i81 + 1;
                    charAt11 = str2.charAt(i81);
                    if (charAt11 < c10) {
                        break;
                    }
                    i82 |= (charAt11 & 8191) << i83;
                    i83 += 13;
                    i81 = i39;
                    c10 = 55296;
                }
                charAt22 = i82 | (charAt11 << i83);
                i81 = i39;
            }
            if ((charAt22 & 1024) != 0) {
                iArr[i75] = i76;
                i75++;
            }
            int i84 = charAt22 & 255;
            int i85 = charAt21;
            int i86 = charAt22 & 2048;
            if (i84 >= 51) {
                int i87 = i81 + 1;
                int charAt23 = str2.charAt(i81);
                char c11 = 55296;
                if (charAt23 >= 55296) {
                    int i88 = charAt23 & 8191;
                    int i89 = i87;
                    int i90 = 13;
                    while (true) {
                        i38 = i89 + 1;
                        charAt10 = str2.charAt(i89);
                        if (charAt10 < c11) {
                            break;
                        }
                        i88 |= (charAt10 & 8191) << i90;
                        i90 += 13;
                        i89 = i38;
                        c11 = 55296;
                    }
                    charAt23 = i88 | (charAt10 << i90);
                    i35 = i38;
                } else {
                    i35 = i87;
                }
                int i91 = i35;
                int i92 = i84 - 51;
                int i93 = charAt23;
                if (i92 == 9 || i92 == 17) {
                    i36 = i14 + 1;
                    int i94 = i76 / 3;
                    objArr3[i94 + i94 + 1] = objArr4[i14];
                } else {
                    if (i92 == 12) {
                        if (n2Var.a() == 1 || i86 != 0) {
                            i36 = i14 + 1;
                            int i95 = i76 / 3;
                            objArr3[i95 + i95 + 1] = objArr4[i14];
                        } else {
                            i37 = 0;
                            int i96 = i93 + i93;
                            int i97 = i37;
                            obj = objArr4[i96];
                            if (obj instanceof Field) {
                                A2 = (Field) obj;
                            } else {
                                A2 = A(cls2, (String) obj);
                                objArr4[i96] = A2;
                                iArr[i73] = i76;
                                i73++;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(A2);
                            int i98 = i96 + 1;
                            obj2 = objArr4[i98];
                            if (obj2 instanceof Field) {
                                A3 = (Field) obj2;
                            } else {
                                A3 = A(cls2, (String) obj2);
                                objArr4[i98] = A3;
                            }
                            str = str2;
                            i28 = i84;
                            i81 = i91;
                            i29 = objectFieldOffset2;
                            i32 = 0;
                            i30 = 55296;
                            objArr = objArr3;
                            i26 = i12;
                            cls = cls2;
                            i27 = (int) unsafe.objectFieldOffset(A3);
                            i31 = i97;
                        }
                    }
                    i37 = i86;
                    int i962 = i93 + i93;
                    int i972 = i37;
                    obj = objArr4[i962];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(A2);
                    int i982 = i962 + 1;
                    obj2 = objArr4[i982];
                    if (obj2 instanceof Field) {
                    }
                    str = str2;
                    i28 = i84;
                    i81 = i91;
                    i29 = objectFieldOffset22;
                    i32 = 0;
                    i30 = 55296;
                    objArr = objArr3;
                    i26 = i12;
                    cls = cls2;
                    i27 = (int) unsafe.objectFieldOffset(A3);
                    i31 = i972;
                }
                i14 = i36;
                i37 = i86;
                int i9622 = i93 + i93;
                int i9722 = i37;
                obj = objArr4[i9622];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(A2);
                int i9822 = i9622 + 1;
                obj2 = objArr4[i9822];
                if (obj2 instanceof Field) {
                }
                str = str2;
                i28 = i84;
                i81 = i91;
                i29 = objectFieldOffset222;
                i32 = 0;
                i30 = 55296;
                objArr = objArr3;
                i26 = i12;
                cls = cls2;
                i27 = (int) unsafe.objectFieldOffset(A3);
                i31 = i9722;
            } else {
                int i99 = i14 + 1;
                Field A4 = A(cls2, (String) objArr4[i14]);
                objArr = objArr3;
                if (i84 == 9 || i84 == 17) {
                    i26 = i12;
                    int i100 = i76 / 3;
                    objArr[i100 + i100 + 1] = A4.getType();
                } else {
                    if (i84 == 27) {
                        i26 = i12;
                        i34 = 1;
                        i14 += 2;
                    } else if (i84 == 49) {
                        i14 += 2;
                        i26 = i12;
                        i34 = 1;
                    } else {
                        if (i84 == 12 || i84 == 30 || i84 == 44) {
                            i26 = i12;
                            if (n2Var.a() == 1 || i86 != 0) {
                                i14 += 2;
                                int i101 = i76 / 3;
                                objArr[i101 + i101 + 1] = objArr4[i99];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i14 = i99;
                                i86 = 0;
                            }
                        } else if (i84 == 50) {
                            int i102 = i14 + 2;
                            int i103 = i74 + 1;
                            iArr[i74] = i76;
                            int i104 = i76 / 3;
                            int i105 = i104 + i104;
                            objArr[i105] = objArr4[i99];
                            if (i86 != 0) {
                                i14 += 3;
                                objArr[i105 + 1] = objArr4[i102];
                                cls = cls2;
                                i74 = i103;
                            } else {
                                i14 = i102;
                                cls = cls2;
                                i74 = i103;
                                i86 = 0;
                            }
                            i26 = i12;
                        } else {
                            i26 = i12;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(A4);
                        i27 = 1048575;
                        if ((charAt22 & 4096) != 0 || i84 > 17) {
                            str = str2;
                            i28 = i84;
                            i29 = objectFieldOffset;
                            i30 = 55296;
                            i31 = i86;
                            i32 = 0;
                        } else {
                            int i106 = i81 + 1;
                            int charAt24 = str2.charAt(i81);
                            if (charAt24 >= 55296) {
                                int i107 = charAt24 & 8191;
                                int i108 = 13;
                                while (true) {
                                    i33 = i106 + 1;
                                    charAt9 = str2.charAt(i106);
                                    if (charAt9 < 55296) {
                                        break;
                                    }
                                    i107 |= (charAt9 & 8191) << i108;
                                    i108 += 13;
                                    i106 = i33;
                                }
                                charAt24 = i107 | (charAt9 << i108);
                                i106 = i33;
                            }
                            int i109 = (charAt24 / 32) + i26 + i26;
                            Object obj3 = objArr4[i109];
                            str = str2;
                            if (obj3 instanceof Field) {
                                A = (Field) obj3;
                            } else {
                                A = A(cls, (String) obj3);
                                objArr4[i109] = A;
                            }
                            i28 = i84;
                            i29 = objectFieldOffset;
                            i27 = (int) unsafe.objectFieldOffset(A);
                            i32 = charAt24 % 32;
                            i81 = i106;
                            i31 = i86;
                            i30 = 55296;
                        }
                    }
                    int i110 = i76 / 3;
                    objArr[i110 + i110 + i34] = objArr4[i99];
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(A4);
                    i27 = 1048575;
                    if ((charAt22 & 4096) != 0) {
                    }
                    str = str2;
                    i28 = i84;
                    i29 = objectFieldOffset;
                    i30 = 55296;
                    i31 = i86;
                    i32 = 0;
                }
                cls = cls2;
                i14 = i99;
                objectFieldOffset = (int) unsafe.objectFieldOffset(A4);
                i27 = 1048575;
                if ((charAt22 & 4096) != 0) {
                }
                str = str2;
                i28 = i84;
                i29 = objectFieldOffset;
                i30 = 55296;
                i31 = i86;
                i32 = 0;
            }
            int i111 = i76 + 1;
            iArr3[i76] = i85;
            int i112 = i76 + 2;
            iArr3[i111] = ((charAt22 & 512) != 0 ? 536870912 : 0) | ((charAt22 & 256) != 0 ? 268435456 : 0) | (i31 != 0 ? Integer.MIN_VALUE : 0) | (i28 << 20) | i29;
            i76 += 3;
            iArr3[i112] = (i32 << 20) | i27;
            i44 = i81;
            cls2 = cls;
            objArr2 = objArr4;
            i42 = i30;
            length = i24;
            objArr3 = objArr;
            i12 = i26;
            str2 = str;
        }
        return new g2(iArr3, objArr3, i10, i13, n2Var.f2559a, iArr, i15, i71, h1Var, h1Var2);
    }

    public final void B(int i3, Object obj, Object obj2) {
        if (s(i3, obj2)) {
            int k10 = k(i3) & 1048575;
            Unsafe unsafe = f2313l;
            long j = k10;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i10 = this.f2314a[i3];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i10);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            o2 D = D(i3);
            if (!s(i3, obj)) {
                if (m(object)) {
                    k1 a9 = D.a();
                    D.d(a9, object);
                    unsafe.putObject(obj, j, a9);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                t(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                k1 a10 = D.a();
                D.d(a10, object2);
                unsafe.putObject(obj, j, a10);
                object2 = a10;
            }
            D.d(object2, object);
        }
    }

    public final void C(int i3, Object obj, Object obj2) {
        int[] iArr = this.f2314a;
        int i10 = iArr[i3];
        if (u(i10, i3, obj2)) {
            int k10 = k(i3) & 1048575;
            Unsafe unsafe = f2313l;
            long j = k10;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i11 = iArr[i3];
                String obj3 = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + obj3.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(obj3);
                throw new IllegalStateException(sb2.toString());
            }
            o2 D = D(i3);
            if (!u(i10, i3, obj)) {
                if (m(object)) {
                    k1 a9 = D.a();
                    D.d(a9, object);
                    unsafe.putObject(obj, j, a9);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                v(i10, i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!m(object2)) {
                k1 a10 = D.a();
                D.d(a10, object2);
                unsafe.putObject(obj, j, a10);
                object2 = a10;
            }
            D.d(object2, object);
        }
    }

    public final o2 D(int i3) {
        int i10 = i3 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f2315b;
        o2 o2Var = (o2) objArr[i11];
        if (o2Var != null) {
            return o2Var;
        }
        o2 a9 = l2.f2493c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a9;
        return a9;
    }

    public final Object E(int i3) {
        int i10 = i3 / 3;
        return this.f2315b[i10 + i10];
    }

    public final l0 F(int i3) {
        int i10 = i3 / 3;
        return (l0) this.f2315b[i10 + i10 + 1];
    }

    public final Object G(int i3, Object obj) {
        o2 D = D(i3);
        int k10 = k(i3) & 1048575;
        if (!s(i3, obj)) {
            return D.a();
        }
        Object object = f2313l.getObject(obj, k10);
        if (m(object)) {
            return object;
        }
        k1 a9 = D.a();
        if (object != null) {
            D.d(a9, object);
        }
        return a9;
    }

    public final void H(int i3, Object obj, Object obj2) {
        f2313l.putObject(obj, k(i3) & 1048575, obj2);
        t(i3, obj);
    }

    public final Object I(int i3, int i10, Object obj) {
        o2 D = D(i10);
        if (!u(i3, i10, obj)) {
            return D.a();
        }
        Object object = f2313l.getObject(obj, k(i10) & 1048575);
        if (m(object)) {
            return object;
        }
        k1 a9 = D.a();
        if (object != null) {
            D.d(a9, object);
        }
        return a9;
    }

    public final void J(int i3, int i10, Object obj, Object obj2) {
        f2313l.putObject(obj, k(i10) & 1048575, obj2);
        v(i3, i10, obj);
    }

    public final Object K(Object obj, int i3, Object obj2, h1 h1Var, Object obj3) {
        l0 F;
        int i10 = this.f2314a[i3];
        Object i11 = z2.i(k(i3) & 1048575, obj);
        if (i11 == null || (F = F(i3)) == null) {
            return obj2;
        }
        a1.n nVar = ((a2) E(i3)).f2131a;
        Iterator it = ((b2) i11).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!F.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    h1Var.getClass();
                    obj2 = h1.g(obj3);
                }
                int b10 = a2.b(nVar, entry.getKey(), entry.getValue());
                u0 u0Var = v0.f2860e;
                byte[] bArr = new byte[b10];
                boolean z10 = b1.f2157b;
                z0 z0Var = new z0(b10, bArr);
                try {
                    a2.a(z0Var, nVar, entry.getKey(), entry.getValue());
                    if (z0Var.x() > 0) {
                        kotlin.collections.i0.l("Did not write as much data as expected.");
                        return null;
                    }
                    if (z0Var.x() < 0) {
                        kotlin.collections.i0.l("Wrote more data than expected.");
                        return null;
                    }
                    u0 u0Var2 = new u0(bArr);
                    h1Var.getClass();
                    ((u2) obj2).d((i10 << 3) | 2, u0Var2);
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return obj2;
    }

    public final void L(int i3, androidx.datastore.preferences.protobuf.j jVar, Object obj) {
        y0 y0Var = (y0) jVar.f567d;
        long j = i3 & 1048575;
        if ((536870912 & i3) != 0) {
            jVar.Q(2);
            z2.j(j, obj, y0Var.x());
        } else if (!this.f2319f) {
            z2.j(j, obj, jVar.Y());
        } else {
            jVar.Q(2);
            z2.j(j, obj, y0Var.w());
        }
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final k1 a() {
        return ((k1) this.f2318e).i();
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final int b(o0 o0Var) {
        int i3;
        int a9;
        int b10;
        int i10;
        int i11;
        int c10;
        int a10;
        int size;
        int s3;
        int a11;
        int a12;
        int a13;
        int i12;
        int a14;
        int b11;
        g2 g2Var = this;
        o0 o0Var2 = o0Var;
        Unsafe unsafe = f2313l;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int[] iArr = g2Var.f2314a;
            if (i15 >= iArr.length) {
                return ((k1) o0Var).zzc.c() + i17;
            }
            int k10 = g2Var.k(i15);
            int l10 = l(k10);
            int i18 = iArr[i15];
            int i19 = iArr[i15 + 2];
            int i20 = i19 & i13;
            if (l10 <= 17) {
                if (i20 != i14) {
                    i16 = i20 == i13 ? 0 : unsafe.getInt(o0Var2, i20);
                    i14 = i20;
                }
                i3 = 1 << (i19 >>> 20);
            } else {
                i3 = 0;
            }
            int i21 = k10 & i13;
            if (l10 >= f1.f2270e.f2274d) {
                f1.f2271i.getClass();
            }
            long j = i21;
            switch (l10) {
                case 0:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        i17 = v4.a.d(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        i17 = v4.a.d(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        long j3 = unsafe.getLong(o0Var2, j);
                        a9 = b1.a(i18 << 3);
                        b10 = b1.b(j3);
                        i10 = b10 + a9;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        long j10 = unsafe.getLong(o0Var2, j);
                        a9 = b1.a(i18 << 3);
                        b10 = b1.b(j10);
                        i10 = b10 + a9;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        long j11 = unsafe.getInt(o0Var2, j);
                        a9 = b1.a(i18 << 3);
                        b10 = b1.b(j11);
                        i10 = b10 + a9;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        i17 = v4.a.d(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        i17 = v4.a.d(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        i17 = v4.a.d(i18 << 3, 1, i17);
                        break;
                    } else {
                        break;
                    }
                case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        int i22 = i18 << 3;
                        Object object = unsafe.getObject(o0Var2, j);
                        if (object instanceof v0) {
                            int a15 = b1.a(i22);
                            int c11 = ((v0) object).c();
                            i17 = v4.a.e(c11, c11, a15, i17);
                            break;
                        } else {
                            int a16 = b1.a(i22);
                            int b12 = b3.b((String) object);
                            i17 = v4.a.e(b12, b12, a16, i17);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        Object object2 = unsafe.getObject(o0Var2, j);
                        o2 D = g2Var.D(i15);
                        h1 h1Var = p2.f2660a;
                        int a17 = b1.a(i18 << 3);
                        int c12 = ((o0) object2).c(D);
                        i17 = v4.a.e(c12, c12, a17, i17);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        v0 v0Var = (v0) unsafe.getObject(o0Var2, j);
                        int a18 = b1.a(i18 << 3);
                        int c13 = v0Var.c();
                        i17 = v4.a.e(c13, c13, a18, i17);
                        break;
                    } else {
                        break;
                    }
                case RequestError.STOP_TRACKING /* 11 */:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        i17 = v4.a.d(unsafe.getInt(o0Var2, j), b1.a(i18 << 3), i17);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        long j12 = unsafe.getInt(o0Var2, j);
                        a9 = b1.a(i18 << 3);
                        b10 = b1.b(j12);
                        i10 = b10 + a9;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        i17 = v4.a.d(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        i17 = v4.a.d(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        int i23 = unsafe.getInt(o0Var2, j);
                        i17 = v4.a.d((i23 >> 31) ^ (i23 + i23), b1.a(i18 << 3), i17);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        long j13 = unsafe.getLong(o0Var2, j);
                        a9 = b1.a(i18 << 3);
                        b10 = b1.b((j13 >> 63) ^ (j13 + j13));
                        i10 = b10 + a9;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (g2Var.r(o0Var2, i15, i14, i16, i3)) {
                        o0 o0Var3 = (o0) unsafe.getObject(o0Var2, j);
                        o2 D2 = g2Var.D(i15);
                        h1 h1Var2 = p2.f2660a;
                        int a19 = b1.a(i18 << 3);
                        i11 = a19 + a19;
                        c10 = o0Var3.c(D2);
                        i10 = c10 + i11;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i10 = p2.z(i18, (List) unsafe.getObject(o0Var2, j));
                    i17 += i10;
                    break;
                case 19:
                    i10 = p2.y(i18, (List) unsafe.getObject(o0Var2, j));
                    i17 += i10;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var3 = p2.f2660a;
                    if (list.size() != 0) {
                        a10 = (b1.a(i18 << 3) * list.size()) + p2.r(list);
                        i17 += a10;
                        break;
                    }
                    a10 = 0;
                    i17 += a10;
                case 21:
                    List list2 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var4 = p2.f2660a;
                    size = list2.size();
                    if (size != 0) {
                        s3 = p2.s(list2);
                        a11 = b1.a(i18 << 3);
                        a12 = (a11 * size) + s3;
                        i17 += a12;
                        break;
                    }
                    a12 = 0;
                    i17 += a12;
                case 22:
                    List list3 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var5 = p2.f2660a;
                    size = list3.size();
                    if (size != 0) {
                        s3 = p2.v(list3);
                        a11 = b1.a(i18 << 3);
                        a12 = (a11 * size) + s3;
                        i17 += a12;
                        break;
                    }
                    a12 = 0;
                    i17 += a12;
                case 23:
                    i10 = p2.z(i18, (List) unsafe.getObject(o0Var2, j));
                    i17 += i10;
                    break;
                case 24:
                    i10 = p2.y(i18, (List) unsafe.getObject(o0Var2, j));
                    i17 += i10;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var6 = p2.f2660a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        a10 = (b1.a(i18 << 3) + 1) * size2;
                        i17 += a10;
                        break;
                    }
                    a10 = 0;
                    i17 += a10;
                case 26:
                    List list5 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var7 = p2.f2660a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        a12 = b1.a(i18 << 3) * size3;
                        for (int i24 = 0; i24 < size3; i24++) {
                            Object obj = list5.get(i24);
                            if (obj instanceof v0) {
                                int c14 = ((v0) obj).c();
                                a12 = v4.a.d(c14, c14, a12);
                            } else {
                                int b13 = b3.b((String) obj);
                                a12 = v4.a.d(b13, b13, a12);
                            }
                        }
                        i17 += a12;
                        break;
                    }
                    a12 = 0;
                    i17 += a12;
                case 27:
                    List list6 = (List) unsafe.getObject(o0Var2, j);
                    o2 D3 = g2Var.D(i15);
                    h1 h1Var8 = p2.f2660a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        a13 = 0;
                    } else {
                        a13 = b1.a(i18 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            int c15 = ((o0) list6.get(i25)).c(D3);
                            a13 = v4.a.d(c15, c15, a13);
                        }
                    }
                    i17 += a13;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var9 = p2.f2660a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        a12 = b1.a(i18 << 3) * size5;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int c16 = ((v0) list7.get(i26)).c();
                            a12 = v4.a.d(c16, c16, a12);
                        }
                        i17 += a12;
                        break;
                    }
                    a12 = 0;
                    i17 += a12;
                case 29:
                    List list8 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var10 = p2.f2660a;
                    size = list8.size();
                    if (size != 0) {
                        s3 = p2.w(list8);
                        a11 = b1.a(i18 << 3);
                        a12 = (a11 * size) + s3;
                        i17 += a12;
                        break;
                    }
                    a12 = 0;
                    i17 += a12;
                case 30:
                    List list9 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var11 = p2.f2660a;
                    size = list9.size();
                    if (size != 0) {
                        s3 = p2.u(list9);
                        a11 = b1.a(i18 << 3);
                        a12 = (a11 * size) + s3;
                        i17 += a12;
                        break;
                    }
                    a12 = 0;
                    i17 += a12;
                case 31:
                    i10 = p2.y(i18, (List) unsafe.getObject(o0Var2, j));
                    i17 += i10;
                    break;
                case 32:
                    i10 = p2.z(i18, (List) unsafe.getObject(o0Var2, j));
                    i17 += i10;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var12 = p2.f2660a;
                    size = list10.size();
                    if (size != 0) {
                        s3 = p2.x(list10);
                        a11 = b1.a(i18 << 3);
                        a12 = (a11 * size) + s3;
                        i17 += a12;
                        break;
                    }
                    a12 = 0;
                    i17 += a12;
                case 34:
                    List list11 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var13 = p2.f2660a;
                    size = list11.size();
                    if (size != 0) {
                        s3 = p2.t(list11);
                        a11 = b1.a(i18 << 3);
                        a12 = (a11 * size) + s3;
                        i17 += a12;
                        break;
                    }
                    a12 = 0;
                    i17 += a12;
                case 35:
                    List list12 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var14 = p2.f2660a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i17 = v4.a.e(size6, b1.a(i18 << 3), size6, i17);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var15 = p2.f2660a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i17 = v4.a.e(size7, b1.a(i18 << 3), size7, i17);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int r9 = p2.r((List) unsafe.getObject(o0Var2, j));
                    if (r9 > 0) {
                        i17 = v4.a.e(r9, b1.a(i18 << 3), r9, i17);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int s10 = p2.s((List) unsafe.getObject(o0Var2, j));
                    if (s10 > 0) {
                        i17 = v4.a.e(s10, b1.a(i18 << 3), s10, i17);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int v10 = p2.v((List) unsafe.getObject(o0Var2, j));
                    if (v10 > 0) {
                        i17 = v4.a.e(v10, b1.a(i18 << 3), v10, i17);
                        break;
                    } else {
                        break;
                    }
                case RequestError.NETWORK_FAILURE /* 40 */:
                    List list14 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var16 = p2.f2660a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i17 = v4.a.e(size8, b1.a(i18 << 3), size8, i17);
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    List list15 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var17 = p2.f2660a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i17 = v4.a.e(size9, b1.a(i18 << 3), size9, i17);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var18 = p2.f2660a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i17 = v4.a.e(size10, b1.a(i18 << 3), size10, i17);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int w6 = p2.w((List) unsafe.getObject(o0Var2, j));
                    if (w6 > 0) {
                        i17 = v4.a.e(w6, b1.a(i18 << 3), w6, i17);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int u2 = p2.u((List) unsafe.getObject(o0Var2, j));
                    if (u2 > 0) {
                        i17 = v4.a.e(u2, b1.a(i18 << 3), u2, i17);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var19 = p2.f2660a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i17 = v4.a.e(size11, b1.a(i18 << 3), size11, i17);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(o0Var2, j);
                    h1 h1Var20 = p2.f2660a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i17 = v4.a.e(size12, b1.a(i18 << 3), size12, i17);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int x10 = p2.x((List) unsafe.getObject(o0Var2, j));
                    if (x10 > 0) {
                        i17 = v4.a.e(x10, b1.a(i18 << 3), x10, i17);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int t6 = p2.t((List) unsafe.getObject(o0Var2, j));
                    if (t6 > 0) {
                        i17 = v4.a.e(t6, b1.a(i18 << 3), t6, i17);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(o0Var2, j);
                    o2 D4 = g2Var.D(i15);
                    h1 h1Var21 = p2.f2660a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (int i27 = 0; i27 < size13; i27++) {
                            o0 o0Var4 = (o0) list19.get(i27);
                            int a20 = b1.a(i18 << 3);
                            i12 += o0Var4.c(D4) + a20 + a20;
                        }
                    }
                    i17 += i12;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    b2 b2Var = (b2) unsafe.getObject(o0Var2, j);
                    a2 a2Var = (a2) g2Var.E(i15);
                    if (!b2Var.isEmpty()) {
                        a12 = 0;
                        for (Map.Entry entry : b2Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            a1.n nVar = a2Var.f2131a;
                            int a21 = b1.a(i18 << 3);
                            int b14 = a2.b(nVar, key, value);
                            a12 = v4.a.e(b14, b14, a21, a12);
                        }
                        i17 += a12;
                        break;
                    }
                    a12 = 0;
                    i17 += a12;
                case 51:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        i17 = v4.a.d(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        i17 = v4.a.d(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        long p4 = p(j, o0Var2);
                        a14 = b1.a(i18 << 3);
                        b11 = b1.b(p4);
                        i17 += b11 + a14;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        long p10 = p(j, o0Var2);
                        a14 = b1.a(i18 << 3);
                        b11 = b1.b(p10);
                        i17 += b11 + a14;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        long o6 = o(j, o0Var2);
                        a14 = b1.a(i18 << 3);
                        b11 = b1.b(o6);
                        i17 += b11 + a14;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        i17 = v4.a.d(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        i17 = v4.a.d(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        i17 = v4.a.d(i18 << 3, 1, i17);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        int i28 = i18 << 3;
                        Object object3 = unsafe.getObject(o0Var2, j);
                        if (object3 instanceof v0) {
                            int a22 = b1.a(i28);
                            int c17 = ((v0) object3).c();
                            i17 = v4.a.e(c17, c17, a22, i17);
                            break;
                        } else {
                            int a23 = b1.a(i28);
                            int b15 = b3.b((String) object3);
                            i17 = v4.a.e(b15, b15, a23, i17);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        Object object4 = unsafe.getObject(o0Var2, j);
                        o2 D5 = g2Var.D(i15);
                        h1 h1Var22 = p2.f2660a;
                        int a24 = b1.a(i18 << 3);
                        int c18 = ((o0) object4).c(D5);
                        i17 = v4.a.e(c18, c18, a24, i17);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        v0 v0Var2 = (v0) unsafe.getObject(o0Var2, j);
                        int a25 = b1.a(i18 << 3);
                        int c19 = v0Var2.c();
                        i17 = v4.a.e(c19, c19, a25, i17);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        i17 = v4.a.d(o(j, o0Var2), b1.a(i18 << 3), i17);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        long o10 = o(j, o0Var2);
                        a14 = b1.a(i18 << 3);
                        b11 = b1.b(o10);
                        i17 += b11 + a14;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        i17 = v4.a.d(i18 << 3, 4, i17);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        i17 = v4.a.d(i18 << 3, 8, i17);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        int o11 = o(j, o0Var2);
                        i17 = v4.a.d((o11 >> 31) ^ (o11 + o11), b1.a(i18 << 3), i17);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        long p11 = p(j, o0Var2);
                        a14 = b1.a(i18 << 3);
                        b11 = b1.b((p11 >> 63) ^ (p11 + p11));
                        i17 += b11 + a14;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (g2Var.u(i18, i15, o0Var2)) {
                        o0 o0Var5 = (o0) unsafe.getObject(o0Var2, j);
                        o2 D6 = g2Var.D(i15);
                        h1 h1Var23 = p2.f2660a;
                        int a26 = b1.a(i18 << 3);
                        i11 = a26 + a26;
                        c10 = o0Var5.c(D6);
                        i10 = c10 + i11;
                        i17 += i10;
                        break;
                    } else {
                        break;
                    }
            }
            i15 += 3;
            g2Var = this;
            o0Var2 = o0Var;
            i13 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void c(Object obj, byte[] bArr, int i3, int i10, r0 r0Var) {
        y(obj, bArr, i3, i10, 0, r0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.o2
    public final void d(Object obj, Object obj2) {
        Object obj3;
        n(obj);
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f2314a;
            if (i3 >= iArr.length) {
                p2.b(obj, obj2);
                return;
            }
            int k10 = k(i3);
            int i10 = 1048575 & k10;
            int l10 = l(k10);
            int i11 = iArr[i3];
            long j = i10;
            switch (l10) {
                case 0:
                    if (s(i3, obj2)) {
                        y2 y2Var = z2.f3035c;
                        obj3 = obj;
                        y2Var.l(obj3, j, y2Var.k(j, obj2));
                        t(i3, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (s(i3, obj2)) {
                        y2 y2Var2 = z2.f3035c;
                        y2Var2.j(obj, j, y2Var2.h(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i3, obj2)) {
                        z2.h(obj, j, z2.g(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (s(i3, obj2)) {
                        z2.h(obj, j, z2.g(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                    if (s(i3, obj2)) {
                        z2.f(obj, j, z2.e(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (s(i3, obj2)) {
                        z2.h(obj, j, z2.g(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (s(i3, obj2)) {
                        z2.f(obj, j, z2.e(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (s(i3, obj2)) {
                        y2 y2Var3 = z2.f3035c;
                        y2Var3.g(obj, j, y2Var3.d(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (s(i3, obj2)) {
                        z2.j(j, obj, z2.i(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    B(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i3, obj2)) {
                        z2.j(j, obj, z2.i(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (s(i3, obj2)) {
                        z2.f(obj, j, z2.e(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i3, obj2)) {
                        z2.f(obj, j, z2.e(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i3, obj2)) {
                        z2.f(obj, j, z2.e(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i3, obj2)) {
                        z2.h(obj, j, z2.g(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i3, obj2)) {
                        z2.f(obj, j, z2.e(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i3, obj2)) {
                        z2.h(obj, j, z2.g(j, obj2));
                        t(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    B(i3, obj, obj2);
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
                case RequestError.NETWORK_FAILURE /* 40 */:
                case RequestError.NO_DEV_KEY /* 41 */:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    t1 t1Var = (t1) z2.i(j, obj);
                    t1 t1Var2 = (t1) z2.i(j, obj2);
                    int size = t1Var.size();
                    int size2 = t1Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((p0) t1Var).f2659d) {
                            t1Var = t1Var.j(size2 + size);
                        }
                        t1Var.addAll(t1Var2);
                    }
                    if (size > 0) {
                        t1Var2 = t1Var;
                    }
                    z2.j(j, obj, t1Var2);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    h1 h1Var = p2.f2660a;
                    z2.j(j, obj, h1.e(z2.i(j, obj), z2.i(j, obj2)));
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
                    if (u(i11, i3, obj2)) {
                        z2.j(j, obj, z2.i(j, obj2));
                        v(i11, i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    C(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(i11, i3, obj2)) {
                        z2.j(j, obj, z2.i(j, obj2));
                        v(i11, i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    C(i3, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i3 += 3;
            obj = obj3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void e(Object obj, v5 v5Var) {
        int[] iArr;
        int i3;
        g2 g2Var = this;
        b1 b1Var = (b1) v5Var.f2870e;
        Unsafe unsafe = f2313l;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr2 = g2Var.f2314a;
            if (i12 >= iArr2.length) {
                ((k1) obj).zzc.b(v5Var);
                return;
            }
            int k10 = g2Var.k(i12);
            int l10 = l(k10);
            int i14 = iArr2[i12];
            if (l10 <= 17) {
                int i15 = iArr2[i12 + 2];
                int i16 = i15 & i10;
                if (i16 != i11) {
                    i13 = i16 == i10 ? 0 : unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                iArr = iArr2;
                i3 = 1 << (i15 >>> 20);
            } else {
                iArr = iArr2;
                i3 = 0;
            }
            long j = k10 & i10;
            switch (l10) {
                case 0:
                    if (!g2Var.r(obj, i12, i11, i13, i3)) {
                        break;
                    } else {
                        b1Var.i(i14, Double.doubleToRawLongBits(z2.f3035c.k(j, obj)));
                        continue;
                    }
                case 1:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.g(i14, Float.floatToRawIntBits(z2.f3035c.h(j, obj)));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.h(i14, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.h(i14, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.e(i14, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.i(i14, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.g(i14, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.j(i14, z2.f3035c.d(j, obj));
                        break;
                    } else {
                        continue;
                    }
                case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            b1Var.k(i14, (String) object);
                            break;
                        } else {
                            b1Var.l(i14, (v0) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        v5Var.e(i14, unsafe.getObject(obj, j), g2Var.D(i12));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.l(i14, (v0) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case RequestError.STOP_TRACKING /* 11 */:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.f(i14, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.e(i14, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.g(i14, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        b1Var.i(i14, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        int i17 = unsafe.getInt(obj, j);
                        b1Var.f(i14, (i17 >> 31) ^ (i17 + i17));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        b1Var.h(i14, (j3 >> 63) ^ (j3 + j3));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (g2Var.r(obj, i12, i11, i13, i3)) {
                        Object object2 = unsafe.getObject(obj, j);
                        b1Var.d(i14, 3);
                        g2Var.D(i12).e((o0) object2, v5Var);
                        b1Var.d(i14, 4);
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    p2.d(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 19:
                    p2.e(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 20:
                    p2.f(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 21:
                    p2.g(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 22:
                    p2.k(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 23:
                    p2.i(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 24:
                    p2.n(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 25:
                    p2.q(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 26:
                    int i18 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j);
                    h1 h1Var = p2.f2660a;
                    if (list != null && !list.isEmpty()) {
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            b1Var.k(i18, (String) list.get(i19));
                        }
                        break;
                    }
                    break;
                case 27:
                    int i20 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j);
                    o2 D = g2Var.D(i12);
                    h1 h1Var2 = p2.f2660a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i21 = 0; i21 < list2.size(); i21++) {
                            v5Var.e(i20, list2.get(i21), D);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i22 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j);
                    h1 h1Var3 = p2.f2660a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            b1Var.l(i22, (v0) list3.get(i23));
                        }
                        break;
                    }
                    break;
                case 29:
                    p2.l(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 30:
                    p2.p(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 31:
                    p2.o(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 32:
                    p2.j(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 33:
                    p2.m(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 34:
                    p2.h(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, false);
                    continue;
                case 35:
                    p2.d(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 36:
                    p2.e(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 37:
                    p2.f(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 38:
                    p2.g(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 39:
                    p2.k(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    p2.i(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    p2.n(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 42:
                    p2.q(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 43:
                    p2.l(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 44:
                    p2.p(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 45:
                    p2.o(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 46:
                    p2.j(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 47:
                    p2.m(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 48:
                    p2.h(iArr[i12], (List) unsafe.getObject(obj, j), v5Var, true);
                    break;
                case 49:
                    int i24 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j);
                    o2 D2 = g2Var.D(i12);
                    h1 h1Var4 = p2.f2660a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i25 = 0; i25 < list4.size(); i25++) {
                            o0 o0Var = (o0) list4.get(i25);
                            b1Var.d(i24, 3);
                            D2.e(o0Var, v5Var);
                            b1Var.d(i24, 4);
                        }
                        break;
                    }
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        a1.n nVar = ((a2) g2Var.E(i12)).f2131a;
                        for (Map.Entry entry : ((b2) object3).entrySet()) {
                            b1Var.d(i14, 2);
                            b1Var.r(a2.b(nVar, entry.getKey(), entry.getValue()));
                            a2.a(b1Var, nVar, entry.getKey(), entry.getValue());
                        }
                        break;
                    }
                    break;
                case 51:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.i(i14, Double.doubleToRawLongBits(((Double) z2.i(j, obj)).doubleValue()));
                        break;
                    }
                    break;
                case 52:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.g(i14, Float.floatToRawIntBits(((Float) z2.i(j, obj)).floatValue()));
                        break;
                    }
                    break;
                case 53:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.h(i14, p(j, obj));
                        break;
                    }
                    break;
                case 54:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.h(i14, p(j, obj));
                        break;
                    }
                    break;
                case 55:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.e(i14, o(j, obj));
                        break;
                    }
                    break;
                case 56:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.i(i14, p(j, obj));
                        break;
                    }
                    break;
                case 57:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.g(i14, o(j, obj));
                        break;
                    }
                    break;
                case 58:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.j(i14, ((Boolean) z2.i(j, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (g2Var.u(i14, i12, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            b1Var.k(i14, (String) object4);
                            break;
                        } else {
                            b1Var.l(i14, (v0) object4);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (g2Var.u(i14, i12, obj)) {
                        v5Var.e(i14, unsafe.getObject(obj, j), g2Var.D(i12));
                        break;
                    }
                    break;
                case 61:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.l(i14, (v0) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.f(i14, o(j, obj));
                        break;
                    }
                    break;
                case 63:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.e(i14, o(j, obj));
                        break;
                    }
                    break;
                case 64:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.g(i14, o(j, obj));
                        break;
                    }
                    break;
                case 65:
                    if (g2Var.u(i14, i12, obj)) {
                        b1Var.i(i14, p(j, obj));
                        break;
                    }
                    break;
                case 66:
                    if (g2Var.u(i14, i12, obj)) {
                        int o6 = o(j, obj);
                        b1Var.f(i14, (o6 >> 31) ^ (o6 + o6));
                        break;
                    }
                    break;
                case 67:
                    if (g2Var.u(i14, i12, obj)) {
                        long p4 = p(j, obj);
                        b1Var.h(i14, (p4 >> 63) ^ (p4 + p4));
                        break;
                    }
                    break;
                case 68:
                    if (g2Var.u(i14, i12, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        b1Var.d(i14, 3);
                        g2Var.D(i12).e((o0) object5, v5Var);
                        b1Var.d(i14, 4);
                        break;
                    }
                    break;
            }
            i12 += 3;
            i10 = 1048575;
            g2Var = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x07f3 A[LOOP:1: B:166:0x07f1->B:167:0x07f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x07b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, androidx.datastore.preferences.protobuf.j jVar, c1 c1Var) {
        Object obj2;
        Object obj3;
        Object obj4;
        g2 g2Var;
        h1 h1Var;
        Object obj5;
        g2 g2Var2;
        Object obj6;
        Object obj7;
        g2 g2Var3 = this;
        y0 y0Var = (y0) jVar.f567d;
        int[] iArr = g2Var3.g;
        int i3 = g2Var3.f2321i;
        int i10 = g2Var3.f2320h;
        c1Var.getClass();
        n(obj);
        h1 h1Var2 = g2Var3.j;
        Object obj8 = null;
        while (true) {
            try {
                int X = jVar.X();
                int w6 = (X < g2Var3.f2316c || X > g2Var3.f2317d) ? -1 : g2Var3.w(X, 0);
                if (w6 >= 0) {
                    int k10 = g2Var3.k(w6);
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            obj2 = obj8;
                        }
                    } catch (u1 unused) {
                        g2Var = g2Var3;
                        obj2 = obj8;
                        h1Var = h1Var2;
                        obj5 = obj;
                    }
                    switch (l(k10)) {
                        case 0:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2 g2Var4 = g2Var3;
                            int i11 = k10 & 1048575;
                            try {
                                jVar.Q(1);
                                g2Var = g2Var4;
                                z2.f3035c.l(obj, i11, y0Var.o());
                                g2Var.t(w6, obj);
                                g2Var3 = g2Var;
                                h1Var2 = h1Var;
                                obj8 = obj2;
                            } catch (Throwable th2) {
                                th = th2;
                                h1Var2 = h1Var;
                                obj8 = obj2;
                                obj3 = obj8;
                                while (i10 < i3) {
                                    obj3 = K(obj, iArr[i10], obj3, h1Var2, obj);
                                    i10++;
                                }
                                if (obj3 != null) {
                                    h1Var2.getClass();
                                    ((k1) obj).zzc = (u2) obj3;
                                }
                                throw th;
                            }
                        case 1:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(5);
                            z2.f3035c.j(obj, k10 & 1048575, y0Var.p());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 2:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(0);
                            z2.h(obj, k10 & 1048575, y0Var.r());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(0);
                            z2.h(obj, k10 & 1048575, y0Var.q());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(0);
                            z2.f(obj, k10 & 1048575, y0Var.s());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(1);
                            z2.h(obj, k10 & 1048575, y0Var.t());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(5);
                            z2.f(obj, k10 & 1048575, y0Var.u());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(0);
                            z2.f3035c.g(obj, k10 & 1048575, y0Var.v());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            g2Var2.L(k10, jVar, obj);
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 9:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            o0 o0Var = (o0) g2Var2.G(w6, obj);
                            o2 D = g2Var2.D(w6);
                            jVar.Q(2);
                            jVar.R(o0Var, D, c1Var);
                            g2Var2.H(w6, obj, o0Var);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 10:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            z2.j(k10 & 1048575, obj, jVar.Y());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case RequestError.STOP_TRACKING /* 11 */:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(0);
                            z2.f(obj, k10 & 1048575, y0Var.A());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 12:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(0);
                            int B = y0Var.B();
                            l0 F = g2Var2.F(w6);
                            if (F != null && !F.a(B)) {
                                h1 h1Var3 = p2.f2660a;
                                if (obj2 == null) {
                                    h1Var.getClass();
                                    obj6 = h1.g(obj);
                                } else {
                                    obj6 = obj2;
                                }
                                h1Var.getClass();
                                ((u2) obj6).d(X << 3, Long.valueOf(B));
                                g2Var3 = g2Var2;
                                obj8 = obj6;
                                h1Var2 = h1Var;
                            }
                            z2.f(obj, k10 & 1048575, B);
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                            break;
                        case 13:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(5);
                            z2.f(obj, k10 & 1048575, y0Var.C());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 14:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(1);
                            z2.h(obj, k10 & 1048575, y0Var.D());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 15:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(0);
                            z2.f(obj, k10 & 1048575, y0Var.E());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 16:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            jVar.Q(0);
                            z2.h(obj, k10 & 1048575, y0Var.F());
                            g2Var2.t(w6, obj);
                            g2Var = g2Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 17:
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var2 = g2Var3;
                            obj5 = obj;
                            try {
                                o0 o0Var2 = (o0) g2Var2.G(w6, obj5);
                                o2 D2 = g2Var2.D(w6);
                                jVar.Q(3);
                                jVar.S(o0Var2, D2, c1Var);
                                g2Var2.H(w6, obj5, o0Var2);
                                g2Var = g2Var2;
                                g2Var3 = g2Var;
                                h1Var2 = h1Var;
                                obj8 = obj2;
                            } catch (u1 unused2) {
                                g2Var = g2Var2;
                                obj8 = obj2;
                                if (obj8 == null) {
                                }
                                h1Var.getClass();
                                if (h1.h(0, jVar, obj8)) {
                                }
                            }
                            break;
                        case 18:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            jVar.Z(h1.c(k10 & 1048575, obj));
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 19:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            jVar.a0(h1.c(k10 & 1048575, obj));
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 20:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            jVar.A(h1.c(k10 & 1048575, obj));
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 21:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            jVar.b0(h1.c(k10 & 1048575, obj));
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 22:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            jVar.B(h1.c(k10 & 1048575, obj));
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 23:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            jVar.C(h1.c(k10 & 1048575, obj));
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 24:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            jVar.D(h1.c(k10 & 1048575, obj));
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 25:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            jVar.E(h1.c(k10 & 1048575, obj));
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 26:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            if ((536870912 & k10) != 0) {
                                jVar.F(h1.c(k10 & 1048575, obj), true);
                            } else {
                                jVar.F(h1.c(k10 & 1048575, obj), false);
                            }
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 27:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            jVar.G(h1.c(k10 & 1048575, obj), g2Var.D(w6), c1Var);
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 28:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            jVar.I(h1.c(k10 & 1048575, obj));
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 29:
                            g2Var = g2Var3;
                            obj2 = obj8;
                            h1Var = h1Var2;
                            obj5 = obj;
                            try {
                                try {
                                    jVar.J(h1.c(k10 & 1048575, obj5));
                                    g2Var3 = g2Var;
                                    h1Var2 = h1Var;
                                    obj8 = obj2;
                                } catch (u1 unused3) {
                                    obj8 = obj2;
                                    if (obj8 == null) {
                                        try {
                                            h1Var.getClass();
                                            obj8 = h1.g(obj5);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            h1Var2 = h1Var;
                                            obj3 = obj8;
                                            while (i10 < i3) {
                                            }
                                            if (obj3 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    h1Var.getClass();
                                    if (h1.h(0, jVar, obj8)) {
                                        g2Var3 = this;
                                        h1Var2 = h1Var;
                                    } else {
                                        obj4 = obj8;
                                        while (i10 < i3) {
                                            obj4 = g2Var.K(obj5, iArr[i10], obj4, h1Var, obj);
                                            i10++;
                                            g2Var = this;
                                            obj5 = obj;
                                        }
                                        h1Var2 = h1Var;
                                        if (obj4 == null) {
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                h1Var2 = h1Var;
                                obj8 = obj2;
                                obj3 = obj8;
                                while (i10 < i3) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                            break;
                        case 30:
                            g2Var = g2Var3;
                            h1Var = h1Var2;
                            obj5 = obj;
                            Object obj9 = obj8;
                            try {
                                t1 c10 = h1.c(k10 & 1048575, obj5);
                                jVar.K(c10);
                                try {
                                    obj8 = p2.c(obj5, X, c10, g2Var.F(w6), obj9, h1Var);
                                    h1Var = h1Var;
                                    g2Var3 = g2Var;
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj2 = obj9;
                                    h1Var = h1Var;
                                    h1Var2 = h1Var;
                                    obj8 = obj2;
                                    obj3 = obj8;
                                    while (i10 < i3) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                            } catch (u1 unused4) {
                                obj2 = obj9;
                                obj8 = obj2;
                                if (obj8 == null) {
                                }
                                h1Var.getClass();
                                if (h1.h(0, jVar, obj8)) {
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj2 = obj9;
                            }
                            h1Var2 = h1Var;
                            break;
                        case 31:
                            g2Var = g2Var3;
                            jVar.L(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 32:
                            g2Var = g2Var3;
                            jVar.M(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 33:
                            g2Var = g2Var3;
                            jVar.N(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 34:
                            g2Var = g2Var3;
                            jVar.O(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 35:
                            g2Var = g2Var3;
                            jVar.Z(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 36:
                            g2Var = g2Var3;
                            jVar.a0(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 37:
                            g2Var = g2Var3;
                            jVar.A(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 38:
                            g2Var = g2Var3;
                            jVar.b0(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 39:
                            g2Var = g2Var3;
                            jVar.B(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            g2Var = g2Var3;
                            jVar.C(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            g2Var = g2Var3;
                            jVar.D(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 42:
                            g2Var = g2Var3;
                            jVar.E(h1.c(k10 & 1048575, obj));
                            obj2 = obj8;
                            h1Var = h1Var2;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 43:
                            g2Var = g2Var3;
                            obj5 = obj;
                            try {
                                jVar.J(h1.c(k10 & 1048575, obj5));
                                obj2 = obj8;
                                h1Var = h1Var2;
                                g2Var3 = g2Var;
                                h1Var2 = h1Var;
                                obj8 = obj2;
                            } catch (u1 unused5) {
                                obj2 = obj8;
                                h1Var = h1Var2;
                                obj8 = obj2;
                                if (obj8 == null) {
                                }
                                h1Var.getClass();
                                if (h1.h(0, jVar, obj8)) {
                                }
                            }
                            break;
                        case 44:
                            h1Var = h1Var2;
                            try {
                                t1 c11 = h1.c(k10 & 1048575, obj);
                                jVar.K(c11);
                                l0 F2 = g2Var3.F(w6);
                                g2Var = g2Var3;
                                obj5 = obj;
                                Object obj10 = obj8;
                                try {
                                    try {
                                        obj8 = p2.c(obj5, X, c11, F2, obj10, h1Var);
                                        h1Var2 = h1Var;
                                        g2Var3 = g2Var;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        obj8 = obj10;
                                        h1Var2 = h1Var;
                                        obj2 = obj8;
                                        obj8 = obj2;
                                        obj3 = obj8;
                                        while (i10 < i3) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (u1 unused6) {
                                    obj2 = obj10;
                                    h1Var = h1Var;
                                    obj8 = obj2;
                                    if (obj8 == null) {
                                    }
                                    h1Var.getClass();
                                    if (h1.h(0, jVar, obj8)) {
                                    }
                                }
                            } catch (u1 unused7) {
                                g2Var = g2Var3;
                                obj5 = obj;
                                obj2 = obj8;
                            } catch (Throwable th8) {
                                th = th8;
                                h1Var2 = h1Var;
                            }
                            break;
                        case 45:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.L(h1.c(k10 & 1048575, obj7));
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 46:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.M(h1.c(k10 & 1048575, obj7));
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 47:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.N(h1.c(k10 & 1048575, obj7));
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 48:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.O(h1.c(k10 & 1048575, obj7));
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 49:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.H(h1.c(k10 & 1048575, obj7), g2Var3.D(w6), c1Var);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            h1Var = h1Var2;
                            obj7 = obj;
                            Object E = g2Var3.E(w6);
                            long k11 = g2Var3.k(w6) & 1048575;
                            Object i12 = z2.i(k11, obj7);
                            if (i12 == null) {
                                i12 = b2.f2159e.a();
                                z2.j(k11, obj7, i12);
                            } else if (!((b2) i12).f2160d) {
                                Object a9 = b2.f2159e.a();
                                h1.e(a9, i12);
                                z2.j(k11, obj7, a9);
                                i12 = a9;
                            }
                            jVar.P((b2) i12, ((a2) E).c(), c1Var);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 51:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(1);
                            z2.j(k10 & 1048575, obj7, Double.valueOf(y0Var.o()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 52:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(5);
                            z2.j(k10 & 1048575, obj7, Float.valueOf(y0Var.p()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 53:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(0);
                            z2.j(k10 & 1048575, obj7, Long.valueOf(y0Var.r()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 54:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(0);
                            z2.j(k10 & 1048575, obj7, Long.valueOf(y0Var.q()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 55:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(0);
                            z2.j(k10 & 1048575, obj7, Integer.valueOf(y0Var.s()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 56:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(1);
                            z2.j(k10 & 1048575, obj7, Long.valueOf(y0Var.t()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 57:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(5);
                            z2.j(k10 & 1048575, obj7, Integer.valueOf(y0Var.u()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 58:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(0);
                            z2.j(k10 & 1048575, obj7, Boolean.valueOf(y0Var.v()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 59:
                            h1Var = h1Var2;
                            obj7 = obj;
                            g2Var3.L(k10, jVar, obj7);
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 60:
                            h1Var = h1Var2;
                            obj7 = obj;
                            o0 o0Var3 = (o0) g2Var3.I(X, w6, obj7);
                            o2 D3 = g2Var3.D(w6);
                            jVar.Q(2);
                            jVar.R(o0Var3, D3, c1Var);
                            g2Var3.J(X, w6, obj7, o0Var3);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 61:
                            h1Var = h1Var2;
                            obj7 = obj;
                            z2.j(k10 & 1048575, obj7, jVar.Y());
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 62:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(0);
                            z2.j(k10 & 1048575, obj7, Integer.valueOf(y0Var.A()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 63:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(0);
                            int B2 = y0Var.B();
                            l0 F3 = g2Var3.F(w6);
                            if (F3 != null && !F3.a(B2)) {
                                h1 h1Var4 = p2.f2660a;
                                if (obj8 == null) {
                                    h1Var.getClass();
                                    obj6 = h1.g(obj7);
                                } else {
                                    obj6 = obj8;
                                }
                                h1Var.getClass();
                                ((u2) obj6).d(X << 3, Long.valueOf(B2));
                                obj8 = obj6;
                                h1Var2 = h1Var;
                            }
                            z2.j(k10 & 1048575, obj7, Integer.valueOf(B2));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                            break;
                        case 64:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(5);
                            z2.j(k10 & 1048575, obj7, Integer.valueOf(y0Var.C()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 65:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(1);
                            z2.j(k10 & 1048575, obj7, Long.valueOf(y0Var.D()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 66:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(0);
                            z2.j(k10 & 1048575, obj7, Integer.valueOf(y0Var.E()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 67:
                            h1Var = h1Var2;
                            obj7 = obj;
                            jVar.Q(0);
                            z2.j(k10 & 1048575, obj7, Long.valueOf(y0Var.F()));
                            g2Var3.v(X, w6, obj7);
                            g2Var = g2Var3;
                            obj2 = obj8;
                            g2Var3 = g2Var;
                            h1Var2 = h1Var;
                            obj8 = obj2;
                        case 68:
                            h1Var = h1Var2;
                            obj7 = obj;
                            try {
                                o0 o0Var4 = (o0) g2Var3.I(X, w6, obj7);
                                o2 D4 = g2Var3.D(w6);
                                jVar.Q(3);
                                jVar.S(o0Var4, D4, c1Var);
                                g2Var3.J(X, w6, obj7, o0Var4);
                                g2Var = g2Var3;
                                obj2 = obj8;
                                g2Var3 = g2Var;
                                h1Var2 = h1Var;
                                obj8 = obj2;
                            } catch (u1 unused8) {
                                g2Var = g2Var3;
                                obj2 = obj8;
                                obj5 = obj7;
                                obj8 = obj2;
                                if (obj8 == null) {
                                }
                                h1Var.getClass();
                                if (h1.h(0, jVar, obj8)) {
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj8;
                                h1Var2 = h1Var;
                                obj8 = obj2;
                                obj3 = obj8;
                                while (i10 < i3) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                            break;
                        default:
                            if (obj8 == null) {
                                h1Var2.getClass();
                                obj8 = h1.g(obj);
                            }
                            try {
                                h1Var2.getClass();
                            } catch (u1 unused9) {
                                h1Var = h1Var2;
                                g2Var = g2Var3;
                                obj5 = obj;
                                if (obj8 == null) {
                                }
                                h1Var.getClass();
                                if (h1.h(0, jVar, obj8)) {
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                h1Var = h1Var2;
                                h1Var2 = h1Var;
                                obj3 = obj8;
                                while (i10 < i3) {
                                }
                                if (obj3 != null) {
                                }
                                throw th;
                            }
                            if (!h1.h(0, jVar, obj8)) {
                                obj4 = obj8;
                                while (i10 < i3) {
                                    obj4 = g2Var3.K(obj, iArr[i10], obj4, h1Var2, obj);
                                    i10++;
                                    h1Var2 = h1Var2;
                                }
                                h1Var = h1Var2;
                                break;
                            } else {
                                h1Var = h1Var2;
                                h1Var2 = h1Var;
                            }
                            break;
                    }
                } else if (X == Integer.MAX_VALUE) {
                    obj4 = obj8;
                    while (i10 < i3) {
                        obj4 = g2Var3.K(obj, iArr[i10], obj4, h1Var2, obj);
                        i10++;
                        g2Var3 = this;
                    }
                } else {
                    if (obj8 == null) {
                        h1Var2.getClass();
                        obj8 = h1.g(obj);
                    }
                    try {
                        h1Var2.getClass();
                        if (h1.h(0, jVar, obj8)) {
                            g2Var3 = this;
                        } else {
                            obj4 = obj8;
                            while (i10 < i3) {
                                obj4 = K(obj, iArr[i10], obj4, h1Var2, obj);
                                i10++;
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        obj3 = obj8;
                        while (i10 < i3) {
                        }
                        if (obj3 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        }
        h1Var2 = h1Var;
        if (obj4 == null) {
            h1Var2.getClass();
            ((k1) obj).zzc = (u2) obj4;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final boolean g(Object obj) {
        int i3;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i11 < this.f2320h) {
            int i14 = this.g[i11];
            int k10 = k(i14);
            int[] iArr = this.f2314a;
            int i15 = iArr[i14 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i13) {
                if (i16 != 1048575) {
                    i12 = f2313l.getInt(obj, i16);
                }
                i10 = i12;
                i3 = i16;
            } else {
                i3 = i13;
                i10 = i12;
            }
            Object obj2 = obj;
            if ((268435456 & k10) == 0 || r(obj2, i14, i3, i10, i17)) {
                int l10 = l(k10);
                if (l10 == 9 || l10 == 17) {
                    if (r(obj2, i14, i3, i10, i17) && !D(i14).g(z2.i(k10 & 1048575, obj2))) {
                    }
                    i11++;
                    obj = obj2;
                    i13 = i3;
                    i12 = i10;
                } else {
                    if (l10 != 27) {
                        if (l10 == 60 || l10 == 68) {
                            if (u(iArr[i14], i14, obj2) && !D(i14).g(z2.i(k10 & 1048575, obj2))) {
                            }
                            i11++;
                            obj = obj2;
                            i13 = i3;
                            i12 = i10;
                        } else if (l10 != 49) {
                            if (l10 != 50) {
                                continue;
                            } else {
                                b2 b2Var = (b2) z2.i(k10 & 1048575, obj2);
                                if (!b2Var.isEmpty() && ((c3) ((a2) E(i14)).f2131a.f40e).f2187d == d3.f2221w) {
                                    o2 o2Var = null;
                                    for (Object obj3 : b2Var.values()) {
                                        if (o2Var == null) {
                                            o2Var = l2.f2493c.a(obj3.getClass());
                                        }
                                        if (!o2Var.g(obj3)) {
                                        }
                                    }
                                }
                            }
                            i11++;
                            obj = obj2;
                            i13 = i3;
                            i12 = i10;
                        }
                    }
                    List list = (List) z2.i(k10 & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        o2 D = D(i14);
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            if (D.g(list.get(i18))) {
                            }
                        }
                    }
                    i11++;
                    obj = obj2;
                    i13 = i3;
                    i12 = i10;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void h(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            k1Var.l();
            k1Var.zza = 0;
            k1Var.h();
        }
        int i3 = 0;
        while (true) {
            int[] iArr = this.f2314a;
            if (i3 >= iArr.length) {
                this.j.getClass();
                u2 u2Var = ((k1) obj).zzc;
                if (u2Var.f2842e) {
                    u2Var.f2842e = false;
                    return;
                }
                return;
            }
            int k10 = k(i3);
            int i10 = 1048575 & k10;
            int l10 = l(k10);
            long j = i10;
            if (l10 != 9) {
                if (l10 != 60 && l10 != 68) {
                    switch (l10) {
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
                        case RequestError.NETWORK_FAILURE /* 40 */:
                        case RequestError.NO_DEV_KEY /* 41 */:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            p0 p0Var = (p0) ((t1) z2.i(j, obj));
                            if (!p0Var.f2659d) {
                                break;
                            } else {
                                p0Var.f2659d = false;
                                break;
                            }
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            Unsafe unsafe = f2313l;
                            Object object = unsafe.getObject(obj, j);
                            if (object == null) {
                                break;
                            } else {
                                ((b2) object).f2160d = false;
                                unsafe.putObject(obj, j, object);
                                break;
                            }
                    }
                } else if (u(iArr[i3], i3, obj)) {
                    D(i3).h(f2313l.getObject(obj, j));
                }
                i3 += 3;
            }
            if (s(i3, obj)) {
                D(i3).h(f2313l.getObject(obj, j));
            }
            i3 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d1, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(k1 k1Var, k1 k1Var2) {
        boolean a9;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f2314a;
            if (i3 < iArr.length) {
                int k10 = k(i3);
                int l10 = l(k10);
                if (l10 <= 50 || l10 >= 69) {
                    long j = k10 & 1048575;
                    switch (l10) {
                        case 0:
                            if (!q(k1Var, k1Var2, i3)) {
                                break;
                            } else {
                                y2 y2Var = z2.f3035c;
                                if (Double.doubleToLongBits(y2Var.k(j, k1Var)) != Double.doubleToLongBits(y2Var.k(j, k1Var2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 1:
                            if (!q(k1Var, k1Var2, i3)) {
                                break;
                            } else {
                                y2 y2Var2 = z2.f3035c;
                                if (Float.floatToIntBits(y2Var2.h(j, k1Var)) != Float.floatToIntBits(y2Var2.h(j, k1Var2))) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case 2:
                            if (q(k1Var, k1Var2, i3) && z2.g(j, k1Var) == z2.g(j, k1Var2)) {
                                break;
                            }
                            break;
                        case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                            if (q(k1Var, k1Var2, i3) && z2.g(j, k1Var) == z2.g(j, k1Var2)) {
                                break;
                            }
                            break;
                        case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            if (q(k1Var, k1Var2, i3) && z2.e(j, k1Var) == z2.e(j, k1Var2)) {
                                break;
                            }
                            break;
                        case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            if (q(k1Var, k1Var2, i3) && z2.g(j, k1Var) == z2.g(j, k1Var2)) {
                                break;
                            }
                            break;
                        case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (q(k1Var, k1Var2, i3) && z2.e(j, k1Var) == z2.e(j, k1Var2)) {
                                break;
                            }
                            break;
                        case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (!q(k1Var, k1Var2, i3)) {
                                break;
                            } else {
                                y2 y2Var3 = z2.f3035c;
                                if (y2Var3.d(j, k1Var) != y2Var3.d(j, k1Var2)) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                            if (q(k1Var, k1Var2, i3) && p2.a(z2.i(j, k1Var), z2.i(j, k1Var2))) {
                                break;
                            }
                            break;
                        case 9:
                            if (q(k1Var, k1Var2, i3) && p2.a(z2.i(j, k1Var), z2.i(j, k1Var2))) {
                                break;
                            }
                            break;
                        case 10:
                            if (q(k1Var, k1Var2, i3) && p2.a(z2.i(j, k1Var), z2.i(j, k1Var2))) {
                                break;
                            }
                            break;
                        case RequestError.STOP_TRACKING /* 11 */:
                            if (q(k1Var, k1Var2, i3) && z2.e(j, k1Var) == z2.e(j, k1Var2)) {
                                break;
                            }
                            break;
                        case 12:
                            if (q(k1Var, k1Var2, i3) && z2.e(j, k1Var) == z2.e(j, k1Var2)) {
                                break;
                            }
                            break;
                        case 13:
                            if (q(k1Var, k1Var2, i3) && z2.e(j, k1Var) == z2.e(j, k1Var2)) {
                                break;
                            }
                            break;
                        case 14:
                            if (q(k1Var, k1Var2, i3) && z2.g(j, k1Var) == z2.g(j, k1Var2)) {
                                break;
                            }
                            break;
                        case 15:
                            if (q(k1Var, k1Var2, i3) && z2.e(j, k1Var) == z2.e(j, k1Var2)) {
                                break;
                            }
                            break;
                        case 16:
                            if (q(k1Var, k1Var2, i3) && z2.g(j, k1Var) == z2.g(j, k1Var2)) {
                                break;
                            }
                            break;
                        case 17:
                            if (q(k1Var, k1Var2, i3) && p2.a(z2.i(j, k1Var), z2.i(j, k1Var2))) {
                                break;
                            }
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
                        case RequestError.NETWORK_FAILURE /* 40 */:
                        case RequestError.NO_DEV_KEY /* 41 */:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            a9 = p2.a(z2.i(j, k1Var), z2.i(j, k1Var2));
                            if (!a9) {
                                break;
                            } else {
                                break;
                            }
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            a9 = p2.a(z2.i(j, k1Var), z2.i(j, k1Var2));
                            if (!a9) {
                            }
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
                            long j3 = iArr[i3 + 2] & 1048575;
                            if (z2.e(j3, k1Var) == z2.e(j3, k1Var2) && p2.a(z2.i(j, k1Var), z2.i(j, k1Var2))) {
                                break;
                            }
                            break;
                    }
                    return false;
                }
                i3 += 3;
            } else {
                int i10 = this.f2321i;
                while (true) {
                    int[] iArr2 = this.g;
                    if (i10 < iArr2.length) {
                        int i11 = iArr2[i10];
                        long j10 = iArr[i11 + 2] & 1048575;
                        if (z2.e(j10, k1Var) == z2.e(j10, k1Var2)) {
                            if (!u(0, i11, k1Var)) {
                                long k11 = k(i11) & 1048575;
                                if (!p2.a(z2.i(k11, k1Var), z2.i(k11, k1Var2))) {
                                }
                            }
                            i10++;
                        }
                    } else if (k1Var.zzc.equals(k1Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final int j(k1 k1Var) {
        int i3;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int i11;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f2314a.length; i14 += 3) {
            int k10 = k(i14);
            int l10 = l(k10);
            if (l10 <= 50 || l10 >= 69) {
                long j = k10 & 1048575;
                int i15 = 37;
                switch (l10) {
                    case 0:
                        i3 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(z2.f3035c.k(j, k1Var));
                        byte[] bArr = r1.f2724a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i3 + i11;
                        break;
                    case 1:
                        i10 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(z2.f3035c.h(j, k1Var));
                        i13 = i10 + floatToIntBits;
                        break;
                    case 2:
                        i3 = i13 * 53;
                        doubleToLongBits = z2.g(j, k1Var);
                        byte[] bArr2 = r1.f2724a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i3 + i11;
                        break;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        i3 = i13 * 53;
                        doubleToLongBits = z2.g(j, k1Var);
                        byte[] bArr3 = r1.f2724a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i3 + i11;
                        break;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        i10 = i13 * 53;
                        floatToIntBits = z2.e(j, k1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        i3 = i13 * 53;
                        doubleToLongBits = z2.g(j, k1Var);
                        byte[] bArr4 = r1.f2724a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i3 + i11;
                        break;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        i10 = i13 * 53;
                        floatToIntBits = z2.e(j, k1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        i3 = i13 * 53;
                        boolean d10 = z2.f3035c.d(j, k1Var);
                        byte[] bArr5 = r1.f2724a;
                        i11 = d10 ? 1231 : 1237;
                        i13 = i3 + i11;
                        break;
                    case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                        i10 = i13 * 53;
                        floatToIntBits = ((String) z2.i(j, k1Var)).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    case 9:
                        i12 = i13 * 53;
                        Object i16 = z2.i(j, k1Var);
                        if (i16 != null) {
                            i15 = i16.hashCode();
                        }
                        i13 = i12 + i15;
                        break;
                    case 10:
                        i10 = i13 * 53;
                        floatToIntBits = z2.i(j, k1Var).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        i10 = i13 * 53;
                        floatToIntBits = z2.e(j, k1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case 12:
                        i10 = i13 * 53;
                        floatToIntBits = z2.e(j, k1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case 13:
                        i10 = i13 * 53;
                        floatToIntBits = z2.e(j, k1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case 14:
                        i3 = i13 * 53;
                        doubleToLongBits = z2.g(j, k1Var);
                        byte[] bArr6 = r1.f2724a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i3 + i11;
                        break;
                    case 15:
                        i10 = i13 * 53;
                        floatToIntBits = z2.e(j, k1Var);
                        i13 = i10 + floatToIntBits;
                        break;
                    case 16:
                        i3 = i13 * 53;
                        doubleToLongBits = z2.g(j, k1Var);
                        byte[] bArr7 = r1.f2724a;
                        i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i3 + i11;
                        break;
                    case 17:
                        i12 = i13 * 53;
                        Object i17 = z2.i(j, k1Var);
                        if (i17 != null) {
                            i15 = i17.hashCode();
                        }
                        i13 = i12 + i15;
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
                    case RequestError.NETWORK_FAILURE /* 40 */:
                    case RequestError.NO_DEV_KEY /* 41 */:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i10 = i13 * 53;
                        floatToIntBits = z2.i(j, k1Var).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        i10 = i13 * 53;
                        floatToIntBits = z2.i(j, k1Var).hashCode();
                        i13 = i10 + floatToIntBits;
                        break;
                }
            }
        }
        int i18 = this.f2321i;
        while (true) {
            int[] iArr = this.g;
            if (i18 >= iArr.length) {
                return k1Var.zzc.hashCode() + (i13 * 53);
            }
            if (!u(0, iArr[i18], k1Var)) {
                i13 = z2.i(k(r3) & 1048575, k1Var).hashCode() + (i13 * 53);
            }
            i18++;
        }
    }

    public final int k(int i3) {
        return this.f2314a[i3 + 1];
    }

    public final boolean q(k1 k1Var, k1 k1Var2, int i3) {
        return s(i3, k1Var) == s(i3, k1Var2);
    }

    public final boolean r(Object obj, int i3, int i10, int i11, int i12) {
        return i10 == 1048575 ? s(i3, obj) : (i11 & i12) != 0;
    }

    public final boolean s(int i3, Object obj) {
        int i10 = this.f2314a[i3 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int k10 = k(i3);
            long j3 = k10 & 1048575;
            switch (l(k10)) {
                case 0:
                    if (Double.doubleToRawLongBits(z2.f3035c.k(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(z2.f3035c.h(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (z2.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (z2.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                    if (z2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (z2.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (z2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    return z2.f3035c.d(j3, obj);
                case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                    Object i11 = z2.i(j3, obj);
                    if (i11 instanceof String) {
                        if (((String) i11).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(i11 instanceof v0)) {
                            throw new IllegalArgumentException();
                        }
                        if (v0.f2860e.equals(i11)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (z2.i(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (v0.f2860e.equals(z2.i(j3, obj))) {
                        return false;
                    }
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (z2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (z2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (z2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (z2.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (z2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (z2.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (z2.i(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & z2.e(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void t(int i3, Object obj) {
        int i10 = this.f2314a[i3 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        z2.f(obj, j, (1 << (i10 >>> 20)) | z2.e(j, obj));
    }

    public final boolean u(int i3, int i10, Object obj) {
        return z2.e((long) (this.f2314a[i10 + 2] & 1048575), obj) == i3;
    }

    public final void v(int i3, int i10, Object obj) {
        z2.f(obj, this.f2314a[i10 + 2] & 1048575, i3);
    }

    public final int w(int i3, int i10) {
        int[] iArr = this.f2314a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i3 == i13) {
                return i12;
            }
            if (i3 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0b1d, code lost:
    
        a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0d76, code lost:
    
        r0 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0dad, code lost:
    
        if (r0 == 1048575) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0daf, code lost:
    
        r1.putInt(r9, r0, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0db3, code lost:
    
        r10 = r40.f2320h;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0dbc, code lost:
    
        if (r10 >= r40.f2321i) goto L642;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0dbe, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.u2) K(r9, r40.g[r10], r3, r40.j, r41);
        r10 = r10 + 1;
        r9 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0dd3, code lost:
    
        if (r3 == null) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0dd5, code lost:
    
        r40.j.getClass();
        ((com.google.android.gms.internal.measurement.k1) r41).zzc = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0de0, code lost:
    
        if (r7 != 0) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0de2, code lost:
    
        if (r8 != r6) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0de5, code lost:
    
        a2.r.o("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0dee, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0dea, code lost:
    
        if (r8 > r6) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0dec, code lost:
    
        if (r15 != r7) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0def, code lost:
    
        a2.r.o("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:225:0x09d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x09dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0d54 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0d66 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int y(Object obj, byte[] bArr, int i3, int i10, int i11, r0 r0Var) {
        int i12;
        int i13;
        int i14;
        Object obj2;
        int i15;
        int i16;
        int i17;
        u2 u2Var;
        int i18;
        int i19;
        Unsafe unsafe;
        byte[] bArr2;
        int i20;
        int i21;
        int i22;
        byte[] bArr3;
        int i23;
        int i24;
        Unsafe unsafe2;
        Object obj3;
        int i25;
        int i26;
        int i27;
        r0 r0Var2;
        Unsafe unsafe3;
        byte[] bArr4;
        Object obj4;
        r0 r0Var3;
        Unsafe unsafe4;
        byte[] bArr5;
        int i28;
        int i29;
        r0 r0Var4;
        int i30;
        int i31;
        u2 u2Var2;
        t1 t1Var;
        byte[] bArr6;
        r0 r0Var5;
        int i32;
        u2 u2Var3;
        int i33;
        int g;
        int i34;
        int i35;
        r0 r0Var6;
        int i36;
        int i37;
        byte[] bArr7;
        int a9;
        String str;
        int i38;
        int i39;
        r0 r0Var7;
        int i40;
        int i41;
        byte[] bArr8;
        t1 t1Var2;
        int x10;
        byte[] bArr9;
        r0 r0Var8;
        int i42;
        int i43;
        int i44;
        byte[] bArr10;
        int i45;
        r0 r0Var9;
        int i46;
        Object obj5;
        int i47;
        int i48;
        int i49;
        u2 u2Var4;
        u2 u2Var5;
        int q3;
        int a10;
        g2 g2Var = this;
        Object obj6 = obj;
        byte[] bArr11 = bArr;
        int i50 = i10;
        r0 r0Var10 = r0Var;
        n(obj6);
        Unsafe unsafe5 = f2313l;
        int i51 = i3;
        int i52 = -1;
        int i53 = 0;
        int i54 = 1048575;
        int i55 = 0;
        int i56 = 0;
        while (true) {
            if (i51 < i50) {
                int i57 = i51 + 1;
                int i58 = bArr11[i51];
                if (i58 < 0) {
                    i57 = ia.e(i58, bArr11, i57, r0Var10);
                    i58 = r0Var10.f2720a;
                }
                int i59 = i57;
                i56 = i58;
                int i60 = i56 >>> 3;
                int i61 = g2Var.f2317d;
                int i62 = g2Var.f2316c;
                if (i60 > i52) {
                    i17 = (i60 < i62 || i60 > i61) ? -1 : g2Var.w(i60, i53 / 3);
                    i16 = 0;
                } else if (i60 < i62 || i60 > i61) {
                    i16 = 0;
                    i17 = -1;
                } else {
                    i16 = 0;
                    i17 = g2Var.w(i60, 0);
                }
                int i63 = i17;
                u2 u2Var6 = u2.f2837f;
                if (i63 != -1) {
                    int i64 = i56 & 7;
                    int[] iArr = g2Var.f2314a;
                    int i65 = iArr[i63 + 1];
                    int l10 = l(i65);
                    long j = i65 & 1048575;
                    if (l10 > 17) {
                        Object obj7 = obj6;
                        Unsafe unsafe6 = unsafe5;
                        int i66 = i55;
                        i14 = i54;
                        if (l10 != 27) {
                            unsafe = unsafe6;
                            if (l10 > 49) {
                                byte[] bArr12 = bArr;
                                obj2 = obj7;
                                i18 = i60;
                                int i67 = i56;
                                u2Var2 = u2Var6;
                                int i68 = i59;
                                int i69 = i10;
                                Object obj8 = "";
                                r0 r0Var11 = r0Var;
                                if (l10 != 50) {
                                    bArr2 = bArr12;
                                    long j3 = iArr[i63 + 2] & 1048575;
                                    switch (l10) {
                                        case 51:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            if (i64 == 1) {
                                                i49 = i47 + 8;
                                                unsafe.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(ia.l(i47, bArr2))));
                                                unsafe.putInt(obj2, j3, i18);
                                                if (i49 != i47) {
                                                    i12 = i11;
                                                    i20 = i49;
                                                    i53 = i48;
                                                    i55 = i66;
                                                    break;
                                                } else {
                                                    i50 = i10;
                                                    i51 = i49;
                                                    bArr11 = bArr2;
                                                    obj6 = obj2;
                                                    i52 = i18;
                                                    unsafe5 = unsafe;
                                                    i53 = i48;
                                                    i55 = i66;
                                                    i54 = i14;
                                                    g2Var = this;
                                                    i56 = i19;
                                                    break;
                                                }
                                            }
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                        case 52:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            if (i64 == 5) {
                                                i49 = i47 + 4;
                                                unsafe.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(ia.i(i47, bArr2))));
                                                unsafe.putInt(obj2, j3, i18);
                                                if (i49 != i47) {
                                                }
                                            }
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            if (i64 == 0) {
                                                i49 = ia.g(bArr2, i47, r0Var10);
                                                unsafe.putObject(obj2, j, Long.valueOf(r0Var10.f2721b));
                                                unsafe.putInt(obj2, j3, i18);
                                                if (i49 != i47) {
                                                }
                                            }
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            if (i64 == 0) {
                                                i49 = ia.a(bArr2, i47, r0Var10);
                                                unsafe.putObject(obj2, j, Integer.valueOf(r0Var10.f2720a));
                                                unsafe.putInt(obj2, j3, i18);
                                                if (i49 != i47) {
                                                }
                                            }
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            if (i64 == 1) {
                                                i49 = i47 + 8;
                                                unsafe.putObject(obj2, j, Long.valueOf(ia.l(i47, bArr2)));
                                                unsafe.putInt(obj2, j3, i18);
                                                if (i49 != i47) {
                                                }
                                            }
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            if (i64 == 5) {
                                                i49 = i47 + 4;
                                                unsafe.putObject(obj2, j, Integer.valueOf(ia.i(i47, bArr2)));
                                                unsafe.putInt(obj2, j3, i18);
                                                if (i49 != i47) {
                                                }
                                            }
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 58:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var4 = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            if (i64 == 0) {
                                                i49 = ia.g(bArr2, i47, r0Var10);
                                                u2Var = u2Var4;
                                                unsafe.putObject(obj2, j, Boolean.valueOf(r0Var10.f2721b != 0));
                                                unsafe.putInt(obj2, j3, i18);
                                                if (i49 != i47) {
                                                }
                                            }
                                            u2Var = u2Var4;
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 59:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var4 = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            if (i64 == 2) {
                                                int a11 = ia.a(bArr2, i47, r0Var10);
                                                int i70 = r0Var10.f2720a;
                                                if (i70 == 0) {
                                                    unsafe.putObject(obj2, j, obj8);
                                                } else {
                                                    int i71 = a11 + i70;
                                                    if ((i65 & 536870912) != 0 && !b3.a(bArr2, a11, i71)) {
                                                        a2.r.o("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    unsafe.putObject(obj2, j, new String(bArr2, a11, i70, StandardCharsets.UTF_8));
                                                    a11 = i71;
                                                }
                                                unsafe.putInt(obj2, j3, i18);
                                                i49 = a11;
                                                u2Var = u2Var4;
                                                if (i49 != i47) {
                                                }
                                            }
                                            u2Var = u2Var4;
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 60:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var5 = u2Var2;
                                            i19 = i67;
                                            if (i64 == 2) {
                                                Object I = g2Var.I(i18, i63, obj2);
                                                int t6 = ia.t(I, g2Var.D(i63), bArr, i47, i10, r0Var10);
                                                bArr2 = bArr;
                                                g2Var.J(i18, i63, obj2, I);
                                                i49 = t6;
                                                u2Var = u2Var5;
                                                i48 = i63;
                                                if (i49 != i47) {
                                                }
                                            }
                                            u2Var = u2Var5;
                                            i48 = i63;
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 61:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var5 = u2Var2;
                                            i19 = i67;
                                            if (i64 == 2) {
                                                q3 = ia.q(bArr2, i47, r0Var10);
                                                unsafe.putObject(obj2, j, r0Var10.f2722c);
                                                unsafe.putInt(obj2, j3, i18);
                                                i49 = q3;
                                                u2Var = u2Var5;
                                                i48 = i63;
                                                if (i49 != i47) {
                                                }
                                            }
                                            u2Var = u2Var5;
                                            i48 = i63;
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 63:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            if (i64 == 0) {
                                                q3 = ia.a(bArr2, i47, r0Var10);
                                                int i72 = r0Var10.f2720a;
                                                l0 F = g2Var.F(i63);
                                                if (F == null || F.a(i72)) {
                                                    u2Var5 = u2Var2;
                                                    i19 = i67;
                                                    unsafe.putObject(obj2, j, Integer.valueOf(i72));
                                                    unsafe.putInt(obj2, j3, i18);
                                                } else {
                                                    k1 k1Var = (k1) obj2;
                                                    u2 u2Var7 = k1Var.zzc;
                                                    u2Var5 = u2Var2;
                                                    if (u2Var7 == u2Var5) {
                                                        u2Var7 = u2.a();
                                                        k1Var.zzc = u2Var7;
                                                    }
                                                    i19 = i67;
                                                    u2Var7.d(i19, Long.valueOf(i72));
                                                }
                                                i49 = q3;
                                                u2Var = u2Var5;
                                                i48 = i63;
                                                if (i49 != i47) {
                                                }
                                            } else {
                                                i19 = i67;
                                                u2Var = u2Var2;
                                                i48 = i63;
                                                i49 = i47;
                                                if (i49 != i47) {
                                                }
                                            }
                                            break;
                                        case 66:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            if (i64 == 0) {
                                                a10 = ia.a(bArr2, i47, r0Var10);
                                                unsafe.putObject(obj2, j, Integer.valueOf(y0.j(r0Var10.f2720a)));
                                                unsafe.putInt(obj2, j3, i18);
                                                i49 = a10;
                                                u2Var = u2Var2;
                                                i19 = i67;
                                                i48 = i63;
                                                if (i49 != i47) {
                                                }
                                            }
                                            u2Var = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 67:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            if (i64 == 0) {
                                                a10 = ia.g(bArr2, i47, r0Var10);
                                                unsafe.putObject(obj2, j, Long.valueOf(y0.k(r0Var10.f2721b)));
                                                unsafe.putInt(obj2, j3, i18);
                                                i49 = a10;
                                                u2Var = u2Var2;
                                                i19 = i67;
                                                i48 = i63;
                                                if (i49 != i47) {
                                                }
                                            }
                                            u2Var = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                        case 68:
                                            if (i64 == 3) {
                                                Object I2 = g2Var.I(i18, i63, obj2);
                                                i47 = i68;
                                                int v10 = ia.v(I2, g2Var.D(i63), bArr, i47, i10, (i67 & (-8)) | 4, r0Var);
                                                bArr2 = bArr;
                                                r0Var10 = r0Var;
                                                g2Var.J(i18, i63, obj2, I2);
                                                i49 = v10;
                                                u2Var = u2Var2;
                                                i19 = i67;
                                                i48 = i63;
                                                if (i49 != i47) {
                                                }
                                            }
                                            break;
                                        default:
                                            r0Var10 = r0Var;
                                            i47 = i68;
                                            u2Var = u2Var2;
                                            i19 = i67;
                                            i48 = i63;
                                            i49 = i47;
                                            if (i49 != i47) {
                                            }
                                            break;
                                    }
                                } else if (i64 == 2) {
                                    Object E = g2Var.E(i63);
                                    Object object = unsafe.getObject(obj2, j);
                                    if (!((b2) object).f2160d) {
                                        b2 a12 = b2.f2159e.a();
                                        h1.e(a12, object);
                                        unsafe.putObject(obj2, j, a12);
                                        object = a12;
                                    }
                                    a1.n nVar = ((a2) E).f2131a;
                                    b2 b2Var = (b2) object;
                                    int a13 = ia.a(bArr12, i68, r0Var11);
                                    int i73 = r0Var11.f2720a;
                                    if (i73 >= 0 && i73 <= i69 - a13) {
                                        int i74 = a13 + i73;
                                        Object obj9 = nVar.f42r;
                                        Object obj10 = obj9;
                                        while (a13 < i74) {
                                            int i75 = i68;
                                            int i76 = a13 + 1;
                                            int i77 = bArr12[a13];
                                            if (i77 < 0) {
                                                i76 = ia.e(i77, bArr12, i76, r0Var11);
                                                i77 = r0Var11.f2720a;
                                            }
                                            int i78 = i76;
                                            int i79 = i77 >>> 3;
                                            int i80 = i77 & 7;
                                            Object obj11 = obj9;
                                            if (i79 == 1) {
                                                i43 = i67;
                                                i44 = i75;
                                                obj5 = obj8;
                                                c3 c3Var = (c3) nVar.f41i;
                                                if (i80 == c3Var.f2188e) {
                                                    int x11 = x(bArr, i78, i10, c3Var, null, r0Var11);
                                                    r0 r0Var12 = r0Var11;
                                                    obj8 = r0Var12.f2722c;
                                                    a13 = x11;
                                                    i69 = i10;
                                                    bArr12 = bArr;
                                                    r0Var11 = r0Var12;
                                                    i68 = i44;
                                                    obj9 = obj11;
                                                    i67 = i43;
                                                } else {
                                                    i45 = i78;
                                                    r0Var9 = r0Var11;
                                                    bArr10 = bArr;
                                                    i46 = i10;
                                                }
                                            } else if (i79 != 2) {
                                                i43 = i67;
                                                i44 = i75;
                                                bArr10 = bArr;
                                                i45 = i78;
                                                r0Var9 = r0Var11;
                                                i46 = i69;
                                                obj5 = obj8;
                                            } else {
                                                c3 c3Var2 = (c3) nVar.f40e;
                                                if (i80 == c3Var2.f2188e) {
                                                    int x12 = x(bArr, i78, i69, c3Var2, obj11.getClass(), r0Var11);
                                                    obj10 = r0Var11.f2722c;
                                                    a13 = x12;
                                                    obj8 = obj8;
                                                    i68 = i75;
                                                    obj9 = obj11;
                                                    i67 = i67;
                                                    bArr12 = bArr;
                                                    i69 = i10;
                                                } else {
                                                    i43 = i67;
                                                    i44 = i75;
                                                    obj5 = obj8;
                                                    bArr10 = bArr;
                                                    i45 = i78;
                                                    r0Var9 = r0Var11;
                                                    i46 = i10;
                                                }
                                            }
                                            a13 = ia.C(i77, bArr10, i45, i46, r0Var9);
                                            bArr12 = bArr10;
                                            obj8 = obj5;
                                            i68 = i44;
                                            i67 = i43;
                                            i69 = i46;
                                            r0Var11 = r0Var9;
                                            obj9 = obj11;
                                        }
                                        r0 r0Var13 = r0Var11;
                                        int i81 = i69;
                                        i30 = i67;
                                        int i82 = i68;
                                        bArr2 = bArr12;
                                        Object obj12 = obj8;
                                        if (a13 != i74) {
                                            a2.r.o("Failed to parse the message.");
                                            return 0;
                                        }
                                        b2Var.put(obj12, obj10);
                                        if (i74 != i82) {
                                            bArr11 = bArr2;
                                            i50 = i81;
                                            obj6 = obj2;
                                            i52 = i18;
                                            i53 = i63;
                                            unsafe5 = unsafe;
                                            i54 = i14;
                                            i56 = i30;
                                            r0Var10 = r0Var13;
                                            i51 = i74;
                                            i55 = i66;
                                        } else {
                                            i12 = i11;
                                            r0Var10 = r0Var13;
                                            i53 = i63;
                                            i20 = i74;
                                            u2Var = u2Var2;
                                            i55 = i66;
                                            i19 = i30;
                                        }
                                    }
                                } else {
                                    r0Var4 = r0Var11;
                                    i30 = i67;
                                    i31 = i68;
                                    bArr2 = bArr12;
                                    i12 = i11;
                                    r0Var10 = r0Var4;
                                    i20 = i31;
                                    i53 = i63;
                                    u2Var = u2Var2;
                                    i55 = i66;
                                    i19 = i30;
                                }
                            } else {
                                long j10 = i65;
                                t1 t1Var3 = (t1) unsafe.getObject(obj7, j);
                                if (((p0) t1Var3).f2659d) {
                                    t1Var = t1Var3;
                                } else {
                                    t1Var = v4.a.g(t1Var3);
                                    unsafe.putObject(obj7, j, t1Var);
                                }
                                switch (l10) {
                                    case 18:
                                    case 35:
                                        bArr6 = bArr;
                                        r0Var5 = r0Var;
                                        t1 t1Var4 = t1Var;
                                        obj2 = obj7;
                                        i18 = i60;
                                        i32 = i59;
                                        i19 = i56;
                                        u2Var3 = u2Var6;
                                        i33 = i10;
                                        if (i64 != 2) {
                                            if (i64 == 1) {
                                                if (t1Var4 != null) {
                                                    kotlin.collections.i0.j();
                                                    return 0;
                                                }
                                                Double.longBitsToDouble(ia.l(i32, bArr6));
                                                throw null;
                                            }
                                            i34 = i32;
                                            if (i34 != i32) {
                                                i12 = i11;
                                                r0Var10 = r0Var5;
                                                i53 = i63;
                                                u2Var = u2Var3;
                                                i55 = i66;
                                                i20 = i34;
                                                bArr2 = bArr6;
                                                break;
                                            } else {
                                                i51 = i34;
                                                r0Var10 = r0Var5;
                                                i50 = i33;
                                                i52 = i18;
                                                i53 = i63;
                                                unsafe5 = unsafe;
                                                i55 = i66;
                                                bArr11 = bArr6;
                                                obj6 = obj2;
                                                i56 = i19;
                                                i54 = i14;
                                            }
                                        } else {
                                            if (t1Var4 != null) {
                                                kotlin.collections.i0.j();
                                                return 0;
                                            }
                                            if (ia.a(bArr6, i32, r0Var5) + r0Var5.f2720a <= bArr6.length) {
                                                throw null;
                                            }
                                            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            return 0;
                                        }
                                    case 19:
                                    case 36:
                                        bArr6 = bArr;
                                        r0Var5 = r0Var;
                                        t1 t1Var5 = t1Var;
                                        obj2 = obj7;
                                        i18 = i60;
                                        i32 = i59;
                                        i19 = i56;
                                        u2Var3 = u2Var6;
                                        i33 = i10;
                                        if (i64 == 2) {
                                            if (t1Var5 != null) {
                                                kotlin.collections.i0.j();
                                                return 0;
                                            }
                                            if (ia.a(bArr6, i32, r0Var5) + r0Var5.f2720a <= bArr6.length) {
                                                throw null;
                                            }
                                            a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            return 0;
                                        }
                                        if (i64 == 5) {
                                            if (t1Var5 != null) {
                                                kotlin.collections.i0.j();
                                                return 0;
                                            }
                                            Float.intBitsToFloat(ia.i(i32, bArr6));
                                            throw null;
                                        }
                                        i34 = i32;
                                        if (i34 != i32) {
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        bArr6 = bArr;
                                        r0Var5 = r0Var;
                                        t1 t1Var6 = t1Var;
                                        obj2 = obj7;
                                        i18 = i60;
                                        i32 = i59;
                                        i19 = i56;
                                        u2Var3 = u2Var6;
                                        i33 = i10;
                                        if (i64 == 2) {
                                            z1 z1Var = (z1) t1Var6;
                                            g = ia.a(bArr6, i32, r0Var5);
                                            int i83 = r0Var5.f2720a + g;
                                            while (g < i83) {
                                                g = ia.g(bArr6, g, r0Var5);
                                                z1Var.f(r0Var5.f2721b);
                                            }
                                            if (g != i83) {
                                                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        } else {
                                            if (i64 == 0) {
                                                z1 z1Var2 = (z1) t1Var6;
                                                g = ia.g(bArr6, i32, r0Var5);
                                                z1Var2.f(r0Var5.f2721b);
                                                while (g < i33) {
                                                    int a14 = ia.a(bArr6, g, r0Var5);
                                                    if (i19 == r0Var5.f2720a) {
                                                        g = ia.g(bArr6, a14, r0Var5);
                                                        z1Var2.f(r0Var5.f2721b);
                                                    }
                                                }
                                            }
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        i34 = g;
                                        if (i34 != i32) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i35 = i10;
                                        r0Var6 = r0Var;
                                        i36 = i56;
                                        t1 t1Var7 = t1Var;
                                        obj2 = obj7;
                                        i18 = i60;
                                        i37 = i59;
                                        bArr7 = bArr;
                                        u2Var3 = u2Var6;
                                        if (i64 == 2) {
                                            i34 = ia.z(bArr7, i37, t1Var7, r0Var6);
                                            i33 = i35;
                                            r0Var5 = r0Var6;
                                            i32 = i37;
                                            bArr6 = bArr7;
                                            i19 = i36;
                                            if (i34 != i32) {
                                            }
                                        } else {
                                            if (i64 == 0) {
                                                bArr6 = bArr7;
                                                g = ia.x(i36, bArr6, i37, i35, t1Var7, r0Var6);
                                                i19 = i36;
                                                i33 = i35;
                                                i32 = i37;
                                                r0Var5 = r0Var6;
                                                i34 = g;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i33 = i35;
                                            r0Var5 = r0Var6;
                                            i32 = i37;
                                            bArr6 = bArr7;
                                            i19 = i36;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case RequestError.NETWORK_FAILURE /* 40 */:
                                    case 46:
                                        i35 = i10;
                                        r0Var6 = r0Var;
                                        i36 = i56;
                                        t1 t1Var8 = t1Var;
                                        obj2 = obj7;
                                        i18 = i60;
                                        i37 = i59;
                                        bArr7 = bArr;
                                        u2Var3 = u2Var6;
                                        if (i64 == 2) {
                                            z1 z1Var3 = (z1) t1Var8;
                                            a9 = ia.a(bArr7, i37, r0Var6);
                                            int i84 = r0Var6.f2720a;
                                            int i85 = a9 + i84;
                                            if (i85 > bArr7.length) {
                                                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i86 = (i84 / 8) + z1Var3.f3032i;
                                            int length = z1Var3.f3031e.length;
                                            if (i86 > length) {
                                                if (length != 0) {
                                                    while (length < i86) {
                                                        length = Math.max(((length * 3) / 2) + 1, 10);
                                                    }
                                                    z1Var3.f3031e = Arrays.copyOf(z1Var3.f3031e, length);
                                                } else {
                                                    z1Var3.f3031e = new long[Math.max(i86, 10)];
                                                }
                                            }
                                            while (a9 < i85) {
                                                z1Var3.f(ia.l(a9, bArr7));
                                                a9 += 8;
                                            }
                                            if (a9 != i85) {
                                                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            i34 = a9;
                                            i33 = i35;
                                            r0Var5 = r0Var6;
                                            i32 = i37;
                                            bArr6 = bArr7;
                                            i19 = i36;
                                            if (i34 != i32) {
                                            }
                                        } else {
                                            if (i64 == 1) {
                                                i34 = i37 + 8;
                                                z1 z1Var4 = (z1) t1Var8;
                                                z1Var4.f(ia.l(i37, bArr7));
                                                while (i34 < i35) {
                                                    int a15 = ia.a(bArr7, i34, r0Var6);
                                                    if (i36 == r0Var6.f2720a) {
                                                        z1Var4.f(ia.l(a15, bArr7));
                                                        i34 = a15 + 8;
                                                    } else {
                                                        i33 = i35;
                                                        r0Var5 = r0Var6;
                                                        i32 = i37;
                                                        bArr6 = bArr7;
                                                        i19 = i36;
                                                        if (i34 != i32) {
                                                        }
                                                    }
                                                }
                                                i33 = i35;
                                                r0Var5 = r0Var6;
                                                i32 = i37;
                                                bArr6 = bArr7;
                                                i19 = i36;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i33 = i35;
                                            r0Var5 = r0Var6;
                                            i32 = i37;
                                            bArr6 = bArr7;
                                            i19 = i36;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case RequestError.NO_DEV_KEY /* 41 */:
                                    case 45:
                                        i35 = i10;
                                        r0Var6 = r0Var;
                                        i36 = i56;
                                        t1 t1Var9 = t1Var;
                                        obj2 = obj7;
                                        i18 = i60;
                                        i37 = i59;
                                        bArr7 = bArr;
                                        u2Var3 = u2Var6;
                                        if (i64 == 2) {
                                            l1 l1Var = (l1) t1Var9;
                                            a9 = ia.a(bArr7, i37, r0Var6);
                                            int i87 = r0Var6.f2720a;
                                            int i88 = a9 + i87;
                                            if (i88 > bArr7.length) {
                                                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i89 = (i87 / 4) + l1Var.f2492i;
                                            int length2 = l1Var.f2491e.length;
                                            if (i89 > length2) {
                                                if (length2 != 0) {
                                                    while (length2 < i89) {
                                                        length2 = Math.max(((length2 * 3) / 2) + 1, 10);
                                                    }
                                                    l1Var.f2491e = Arrays.copyOf(l1Var.f2491e, length2);
                                                } else {
                                                    l1Var.f2491e = new int[Math.max(i89, 10)];
                                                }
                                            }
                                            while (a9 < i88) {
                                                l1Var.f(ia.i(a9, bArr7));
                                                a9 += 4;
                                            }
                                            if (a9 != i88) {
                                                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            i34 = a9;
                                            i33 = i35;
                                            r0Var5 = r0Var6;
                                            i32 = i37;
                                            bArr6 = bArr7;
                                            i19 = i36;
                                            if (i34 != i32) {
                                            }
                                        } else {
                                            if (i64 == 5) {
                                                i34 = i37 + 4;
                                                l1 l1Var2 = (l1) t1Var9;
                                                l1Var2.f(ia.i(i37, bArr7));
                                                while (i34 < i35) {
                                                    int a16 = ia.a(bArr7, i34, r0Var6);
                                                    if (i36 == r0Var6.f2720a) {
                                                        l1Var2.f(ia.i(a16, bArr7));
                                                        i34 = a16 + 4;
                                                    } else {
                                                        i33 = i35;
                                                        r0Var5 = r0Var6;
                                                        i32 = i37;
                                                        bArr6 = bArr7;
                                                        i19 = i36;
                                                        if (i34 != i32) {
                                                        }
                                                    }
                                                }
                                                i33 = i35;
                                                r0Var5 = r0Var6;
                                                i32 = i37;
                                                bArr6 = bArr7;
                                                i19 = i36;
                                                if (i34 != i32) {
                                                }
                                            }
                                            i33 = i35;
                                            r0Var5 = r0Var6;
                                            i32 = i37;
                                            bArr6 = bArr7;
                                            i19 = i36;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i35 = i10;
                                        r0Var6 = r0Var;
                                        i36 = i56;
                                        t1 t1Var10 = t1Var;
                                        obj2 = obj7;
                                        i18 = i60;
                                        i37 = i59;
                                        bArr7 = bArr;
                                        u2Var3 = u2Var6;
                                        if (i64 != 2) {
                                            if (i64 == 0) {
                                                if (t1Var10 != null) {
                                                    kotlin.collections.i0.j();
                                                    return 0;
                                                }
                                                ia.g(bArr7, i37, r0Var6);
                                                throw null;
                                            }
                                            i33 = i35;
                                            r0Var5 = r0Var6;
                                            i32 = i37;
                                            bArr6 = bArr7;
                                            i19 = i36;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        } else {
                                            if (t1Var10 != null) {
                                                kotlin.collections.i0.j();
                                                return 0;
                                            }
                                            i34 = ia.a(bArr7, i37, r0Var6);
                                            int i90 = r0Var6.f2720a + i34;
                                            if (i34 < i90) {
                                                ia.g(bArr7, i34, r0Var6);
                                                throw null;
                                            }
                                            if (i34 != i90) {
                                                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            i33 = i35;
                                            r0Var5 = r0Var6;
                                            i32 = i37;
                                            bArr6 = bArr7;
                                            i19 = i36;
                                            if (i34 != i32) {
                                            }
                                        }
                                        break;
                                    case 26:
                                        i35 = i10;
                                        r0Var6 = r0Var;
                                        i36 = i56;
                                        t1 t1Var11 = t1Var;
                                        obj2 = obj7;
                                        i18 = i60;
                                        i37 = i59;
                                        bArr7 = bArr;
                                        if (i64 == 2) {
                                            if ((j10 & 536870912) == 0) {
                                                i34 = ia.a(bArr7, i37, r0Var6);
                                                int i91 = r0Var6.f2720a;
                                                if (i91 < 0) {
                                                    a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i91 == 0) {
                                                    t1Var11.add("");
                                                    u2Var3 = u2Var6;
                                                } else {
                                                    u2Var3 = u2Var6;
                                                    t1Var11.add(new String(bArr7, i34, i91, StandardCharsets.UTF_8));
                                                    i34 += i91;
                                                }
                                                while (i34 < i35) {
                                                    int a17 = ia.a(bArr7, i34, r0Var6);
                                                    if (i36 == r0Var6.f2720a) {
                                                        i34 = ia.a(bArr7, a17, r0Var6);
                                                        int i92 = r0Var6.f2720a;
                                                        if (i92 < 0) {
                                                            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i92 == 0) {
                                                            t1Var11.add("");
                                                        } else {
                                                            t1Var11.add(new String(bArr7, i34, i92, StandardCharsets.UTF_8));
                                                            i34 += i92;
                                                        }
                                                    }
                                                }
                                            } else {
                                                u2Var3 = u2Var6;
                                                i34 = ia.a(bArr7, i37, r0Var6);
                                                int i93 = r0Var6.f2720a;
                                                if (i93 < 0) {
                                                    a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i93 == 0) {
                                                    t1Var11.add("");
                                                    str = "Protocol message had invalid UTF-8.";
                                                } else {
                                                    int i94 = i34 + i93;
                                                    if (!b3.a(bArr7, i34, i94)) {
                                                        a2.r.o("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    str = "Protocol message had invalid UTF-8.";
                                                    t1Var11.add(new String(bArr7, i34, i93, StandardCharsets.UTF_8));
                                                    i34 = i94;
                                                }
                                                while (i34 < i35) {
                                                    int a18 = ia.a(bArr7, i34, r0Var6);
                                                    if (i36 == r0Var6.f2720a) {
                                                        i34 = ia.a(bArr7, a18, r0Var6);
                                                        int i95 = r0Var6.f2720a;
                                                        if (i95 < 0) {
                                                            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i95 == 0) {
                                                            t1Var11.add("");
                                                        } else {
                                                            int i96 = i34 + i95;
                                                            if (!b3.a(bArr7, i34, i96)) {
                                                                a2.r.o(str);
                                                                return 0;
                                                            }
                                                            t1Var11.add(new String(bArr7, i34, i95, StandardCharsets.UTF_8));
                                                            i34 = i96;
                                                        }
                                                    }
                                                }
                                            }
                                            i33 = i35;
                                            r0Var5 = r0Var6;
                                            i32 = i37;
                                            bArr6 = bArr7;
                                            i19 = i36;
                                            if (i34 != i32) {
                                            }
                                        } else {
                                            u2Var3 = u2Var6;
                                            i33 = i35;
                                            r0Var5 = r0Var6;
                                            i32 = i37;
                                            bArr6 = bArr7;
                                            i19 = i36;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        break;
                                    case 27:
                                        i19 = i56;
                                        t1 t1Var12 = t1Var;
                                        if (i64 == 2) {
                                            i38 = i10;
                                            i32 = i59;
                                            obj2 = obj;
                                            i18 = i60;
                                            i34 = ia.A(g2Var.D(i63), i19, bArr, i32, i38, t1Var12, r0Var);
                                            bArr6 = bArr;
                                            r0Var5 = r0Var;
                                            u2Var3 = u2Var6;
                                            i33 = i38;
                                            if (i34 != i32) {
                                            }
                                        } else {
                                            i18 = i60;
                                            obj2 = obj;
                                            u2Var3 = u2Var6;
                                            bArr6 = bArr;
                                            r0Var5 = r0Var;
                                            i19 = i19;
                                            i33 = i10;
                                            i32 = i59;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        i39 = i10;
                                        r0Var7 = r0Var;
                                        i19 = i56;
                                        t1 t1Var13 = t1Var;
                                        i40 = i60;
                                        i41 = i59;
                                        bArr8 = bArr;
                                        if (i64 == 2) {
                                            i34 = ia.a(bArr8, i41, r0Var7);
                                            int i97 = r0Var7.f2720a;
                                            if (i97 < 0) {
                                                a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i97 > bArr8.length - i34) {
                                                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i97 == 0) {
                                                t1Var13.add(v0.f2860e);
                                            } else {
                                                t1Var13.add(v0.k(bArr8, i34, i97));
                                                i34 += i97;
                                            }
                                            while (i34 < i39) {
                                                int a19 = ia.a(bArr8, i34, r0Var7);
                                                if (i19 == r0Var7.f2720a) {
                                                    i34 = ia.a(bArr8, a19, r0Var7);
                                                    int i98 = r0Var7.f2720a;
                                                    if (i98 < 0) {
                                                        a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i98 > bArr8.length - i34) {
                                                        a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i98 == 0) {
                                                        t1Var13.add(v0.f2860e);
                                                    } else {
                                                        t1Var13.add(v0.k(bArr8, i34, i98));
                                                        i34 += i98;
                                                    }
                                                } else {
                                                    u2Var3 = u2Var6;
                                                    i33 = i39;
                                                    r0Var5 = r0Var7;
                                                    i32 = i41;
                                                    i18 = i40;
                                                    bArr6 = bArr8;
                                                    obj2 = obj;
                                                    if (i34 != i32) {
                                                    }
                                                }
                                            }
                                            u2Var3 = u2Var6;
                                            i33 = i39;
                                            r0Var5 = r0Var7;
                                            i32 = i41;
                                            i18 = i40;
                                            bArr6 = bArr8;
                                            obj2 = obj;
                                            if (i34 != i32) {
                                            }
                                        } else {
                                            u2Var3 = u2Var6;
                                            i33 = i39;
                                            r0Var5 = r0Var7;
                                            i32 = i41;
                                            i18 = i40;
                                            bArr6 = bArr8;
                                            obj2 = obj;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i38 = i10;
                                        i32 = i59;
                                        if (i64 == 2) {
                                            x10 = ia.z(bArr, i32, t1Var, r0Var);
                                            i41 = i32;
                                            i39 = i38;
                                            t1Var2 = t1Var;
                                            i19 = i56;
                                            bArr8 = bArr;
                                        } else if (i64 == 0) {
                                            t1Var2 = t1Var;
                                            x10 = ia.x(i56, bArr, i32, i38, t1Var2, r0Var);
                                            i19 = i56;
                                            bArr8 = bArr;
                                            i41 = i32;
                                            i39 = i38;
                                        } else {
                                            i19 = i56;
                                            obj2 = obj;
                                            bArr6 = bArr;
                                            r0Var5 = r0Var;
                                            i18 = i60;
                                            u2Var3 = u2Var6;
                                            i33 = i38;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        r0Var7 = r0Var;
                                        i40 = i60;
                                        p2.c(obj, i40, t1Var2, g2Var.F(i63), null, g2Var.j);
                                        i34 = x10;
                                        u2Var3 = u2Var6;
                                        i33 = i39;
                                        r0Var5 = r0Var7;
                                        i32 = i41;
                                        i18 = i40;
                                        bArr6 = bArr8;
                                        obj2 = obj;
                                        if (i34 != i32) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        bArr9 = bArr;
                                        i38 = i10;
                                        r0Var8 = r0Var;
                                        i42 = i56;
                                        i32 = i59;
                                        if (i64 == 2) {
                                            l1 l1Var3 = (l1) t1Var;
                                            i34 = ia.a(bArr9, i32, r0Var8);
                                            int i99 = r0Var8.f2720a + i34;
                                            while (i34 < i99) {
                                                i34 = ia.a(bArr9, i34, r0Var8);
                                                l1Var3.f(y0.j(r0Var8.f2720a));
                                            }
                                            if (i34 != i99) {
                                                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        } else {
                                            if (i64 == 0) {
                                                l1 l1Var4 = (l1) t1Var;
                                                i34 = ia.a(bArr9, i32, r0Var8);
                                                l1Var4.f(y0.j(r0Var8.f2720a));
                                                while (i34 < i38) {
                                                    int a20 = ia.a(bArr9, i34, r0Var8);
                                                    if (i42 == r0Var8.f2720a) {
                                                        i34 = ia.a(bArr9, a20, r0Var8);
                                                        l1Var4.f(y0.j(r0Var8.f2720a));
                                                    }
                                                }
                                            }
                                            obj2 = obj;
                                            bArr6 = bArr9;
                                            r0Var5 = r0Var8;
                                            i19 = i42;
                                            i18 = i60;
                                            u2Var3 = u2Var6;
                                            i33 = i38;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        obj2 = obj;
                                        bArr6 = bArr9;
                                        r0Var5 = r0Var8;
                                        i19 = i42;
                                        i18 = i60;
                                        u2Var3 = u2Var6;
                                        i33 = i38;
                                        if (i34 != i32) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        bArr9 = bArr;
                                        i38 = i10;
                                        r0Var8 = r0Var;
                                        i42 = i56;
                                        i32 = i59;
                                        if (i64 == 2) {
                                            z1 z1Var5 = (z1) t1Var;
                                            i34 = ia.a(bArr9, i32, r0Var8);
                                            int i100 = r0Var8.f2720a + i34;
                                            while (i34 < i100) {
                                                i34 = ia.g(bArr9, i34, r0Var8);
                                                z1Var5.f(y0.k(r0Var8.f2721b));
                                            }
                                            if (i34 != i100) {
                                                a2.r.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        } else {
                                            if (i64 == 0) {
                                                z1 z1Var6 = (z1) t1Var;
                                                i34 = ia.g(bArr9, i32, r0Var8);
                                                z1Var6.f(y0.k(r0Var8.f2721b));
                                                while (i34 < i38) {
                                                    int a21 = ia.a(bArr9, i34, r0Var8);
                                                    if (i42 == r0Var8.f2720a) {
                                                        i34 = ia.g(bArr9, a21, r0Var8);
                                                        z1Var6.f(y0.k(r0Var8.f2721b));
                                                    }
                                                }
                                            }
                                            obj2 = obj;
                                            bArr6 = bArr9;
                                            r0Var5 = r0Var8;
                                            i19 = i42;
                                            i18 = i60;
                                            u2Var3 = u2Var6;
                                            i33 = i38;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        obj2 = obj;
                                        bArr6 = bArr9;
                                        r0Var5 = r0Var8;
                                        i19 = i42;
                                        i18 = i60;
                                        u2Var3 = u2Var6;
                                        i33 = i38;
                                        if (i34 != i32) {
                                        }
                                        break;
                                    default:
                                        if (i64 == 3) {
                                            int i101 = (i56 & (-8)) | 4;
                                            o2 D = g2Var.D(i63);
                                            k1 a22 = D.a();
                                            i38 = i10;
                                            i32 = i59;
                                            int v11 = ia.v(a22, D, bArr, i32, i38, i101, r0Var);
                                            int i102 = i101;
                                            r0 r0Var14 = r0Var;
                                            D.h(a22);
                                            r0Var14.f2722c = a22;
                                            t1Var.add(a22);
                                            while (true) {
                                                if (v11 < i38) {
                                                    int i103 = i32;
                                                    int a23 = ia.a(bArr, v11, r0Var14);
                                                    if (i56 == r0Var14.f2720a) {
                                                        int i104 = i102;
                                                        k1 a24 = D.a();
                                                        v11 = ia.v(a24, D, bArr, a23, i38, i104, r0Var);
                                                        i102 = i104;
                                                        r0Var14 = r0Var;
                                                        D.h(a24);
                                                        r0Var14.f2722c = a24;
                                                        t1Var.add(a24);
                                                        i32 = i103;
                                                    } else {
                                                        i32 = i103;
                                                    }
                                                }
                                            }
                                            bArr6 = bArr;
                                            r0Var5 = r0Var14;
                                            obj2 = obj7;
                                            i19 = i56;
                                            i34 = v11;
                                            i18 = i60;
                                            u2Var3 = u2Var6;
                                            i33 = i38;
                                            if (i34 != i32) {
                                            }
                                        } else {
                                            bArr6 = bArr;
                                            r0Var5 = r0Var;
                                            obj2 = obj7;
                                            i18 = i60;
                                            i32 = i59;
                                            i19 = i56;
                                            u2Var3 = u2Var6;
                                            i33 = i10;
                                            i34 = i32;
                                            if (i34 != i32) {
                                            }
                                        }
                                        break;
                                }
                            }
                        } else if (i64 == 2) {
                            t1 t1Var14 = (t1) unsafe6.getObject(obj7, j);
                            if (!((p0) t1Var14).f2659d) {
                                int size = t1Var14.size();
                                t1Var14 = t1Var14.j(size == 0 ? 10 : size + size);
                                unsafe6.putObject(obj7, j, t1Var14);
                            }
                            i50 = i10;
                            i51 = ia.A(g2Var.D(i63), i56, bArr, i59, i50, t1Var14, r0Var);
                            i56 = i56;
                            unsafe5 = unsafe6;
                            bArr11 = bArr;
                            r0Var10 = r0Var;
                            obj6 = obj;
                            i53 = i63;
                            i52 = i60;
                            i55 = i66;
                            i54 = i14;
                        } else {
                            unsafe = unsafe6;
                            r0Var4 = r0Var;
                            i30 = i56;
                            obj2 = obj7;
                            i18 = i60;
                            i31 = i59;
                            bArr2 = bArr;
                            u2Var2 = u2Var6;
                            i12 = i11;
                            r0Var10 = r0Var4;
                            i20 = i31;
                            i53 = i63;
                            u2Var = u2Var2;
                            i55 = i66;
                            i19 = i30;
                        }
                    } else {
                        int i105 = iArr[i63 + 2];
                        int i106 = 1 << (i105 >>> 20);
                        int i107 = i105 & 1048575;
                        if (i107 != i54) {
                            int i108 = 1048575;
                            i21 = i63;
                            if (i54 != 1048575) {
                                unsafe5.putInt(obj6, i54, i55);
                                i108 = 1048575;
                            }
                            int i109 = i107 == i108 ? 0 : unsafe5.getInt(obj6, i107);
                            i22 = i107;
                            i55 = i109;
                        } else {
                            i21 = i63;
                            i22 = i54;
                        }
                        switch (l10) {
                            case 0:
                                unsafe3 = unsafe5;
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                i25 = i22;
                                i26 = i60;
                                bArr4 = bArr;
                                r0Var2 = r0Var;
                                if (i64 != 1) {
                                    obj3 = obj6;
                                    Unsafe unsafe7 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe7;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    i55 = i27 | i106;
                                    z2.f3035c.l(obj6, j, Double.longBitsToDouble(ia.l(i23, bArr4)));
                                    i50 = i10;
                                    i51 = i23 + 8;
                                    unsafe5 = unsafe3;
                                    bArr11 = bArr4;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i52 = i26;
                                    i54 = i25;
                                }
                            case 1:
                                unsafe3 = unsafe5;
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                i25 = i22;
                                i26 = i60;
                                bArr4 = bArr;
                                r0Var2 = r0Var;
                                if (i64 != 5) {
                                    obj3 = obj6;
                                    Unsafe unsafe72 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe72;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    i55 = i27 | i106;
                                    z2.f3035c.j(obj6, j, Float.intBitsToFloat(ia.i(i23, bArr4)));
                                    i50 = i10;
                                    i51 = i23 + 4;
                                    unsafe5 = unsafe3;
                                    bArr11 = bArr4;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i52 = i26;
                                    i54 = i25;
                                }
                            case 2:
                            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                i25 = i22;
                                i26 = i60;
                                bArr4 = bArr;
                                r0Var2 = r0Var;
                                if (i64 != 0) {
                                    unsafe3 = unsafe5;
                                    obj3 = obj6;
                                    Unsafe unsafe722 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe722;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    i55 = i27 | i106;
                                    int g2 = ia.g(bArr4, i23, r0Var2);
                                    unsafe5.putLong(obj6, j, r0Var2.f2721b);
                                    i50 = i10;
                                    i51 = g2;
                                    bArr11 = bArr4;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i52 = i26;
                                    i54 = i25;
                                }
                            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                            case RequestError.STOP_TRACKING /* 11 */:
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                i25 = i22;
                                i26 = i60;
                                bArr4 = bArr;
                                r0Var2 = r0Var;
                                if (i64 != 0) {
                                    unsafe3 = unsafe5;
                                    obj3 = obj6;
                                    Unsafe unsafe7222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe7222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    i55 = i27 | i106;
                                    i51 = ia.a(bArr4, i23, r0Var2);
                                    unsafe5.putInt(obj6, j, r0Var2.f2720a);
                                    i50 = i10;
                                    bArr11 = bArr4;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i52 = i26;
                                    i54 = i25;
                                }
                            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                            case 14:
                                Object obj13 = obj6;
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                i26 = i60;
                                i25 = i22;
                                Unsafe unsafe8 = unsafe5;
                                if (i64 != 1) {
                                    bArr4 = bArr;
                                    r0Var2 = r0Var;
                                    unsafe3 = unsafe8;
                                    obj3 = obj13;
                                    Unsafe unsafe72222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe72222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    bArr4 = bArr;
                                    unsafe5 = unsafe8;
                                    r0Var2 = r0Var;
                                    obj6 = obj13;
                                    unsafe5.putLong(obj6, j, ia.l(i23, bArr));
                                    i50 = i10;
                                    i51 = i23 + 8;
                                    i55 = i27 | i106;
                                    bArr11 = bArr4;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i52 = i26;
                                    i54 = i25;
                                }
                            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            case 13:
                                obj4 = obj6;
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                r0Var3 = r0Var;
                                i26 = i60;
                                i25 = i22;
                                unsafe4 = unsafe5;
                                bArr5 = bArr;
                                if (i64 != 5) {
                                    Unsafe unsafe9 = unsafe4;
                                    bArr4 = bArr5;
                                    obj3 = obj4;
                                    unsafe3 = unsafe9;
                                    r0Var2 = r0Var3;
                                    Unsafe unsafe722222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe722222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    unsafe4.putInt(obj4, j, ia.i(i23, bArr5));
                                    r0Var10 = r0Var3;
                                    i51 = i23 + 4;
                                    i55 = i27 | i106;
                                    obj6 = obj4;
                                    i53 = i24;
                                    i52 = i26;
                                    i54 = i25;
                                    i50 = i10;
                                    bArr11 = bArr5;
                                    unsafe5 = unsafe4;
                                }
                            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                obj4 = obj6;
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                r0Var3 = r0Var;
                                i26 = i60;
                                i25 = i22;
                                unsafe4 = unsafe5;
                                bArr5 = bArr;
                                if (i64 != 0) {
                                    Unsafe unsafe92 = unsafe4;
                                    bArr4 = bArr5;
                                    obj3 = obj4;
                                    unsafe3 = unsafe92;
                                    r0Var2 = r0Var3;
                                    Unsafe unsafe7222222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe7222222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    int i110 = i27 | i106;
                                    i51 = ia.g(bArr5, i23, r0Var3);
                                    z2.f3035c.g(obj4, j, r0Var3.f2721b != 0);
                                    i50 = i10;
                                    r0Var10 = r0Var3;
                                    i55 = i110;
                                    obj6 = obj4;
                                    i53 = i24;
                                    i52 = i26;
                                    i54 = i25;
                                    bArr11 = bArr5;
                                    unsafe5 = unsafe4;
                                }
                            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                                obj4 = obj6;
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                r0Var3 = r0Var;
                                i26 = i60;
                                i25 = i22;
                                unsafe4 = unsafe5;
                                bArr5 = bArr;
                                if (i64 != 2) {
                                    Unsafe unsafe922 = unsafe4;
                                    bArr4 = bArr5;
                                    obj3 = obj4;
                                    unsafe3 = unsafe922;
                                    r0Var2 = r0Var3;
                                    Unsafe unsafe72222222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe72222222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    if ((i65 & 536870912) != 0) {
                                        i51 = ia.n(bArr5, i23, r0Var3);
                                        i28 = i27 | i106;
                                    } else {
                                        int a25 = ia.a(bArr5, i23, r0Var3);
                                        int i111 = r0Var3.f2720a;
                                        if (i111 < 0) {
                                            a2.r.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        i28 = i27 | i106;
                                        if (i111 == 0) {
                                            r0Var3.f2722c = "";
                                        } else {
                                            r0Var3.f2722c = new String(bArr5, a25, i111, StandardCharsets.UTF_8);
                                            a25 += i111;
                                        }
                                        i51 = a25;
                                    }
                                    unsafe4.putObject(obj4, j, r0Var3.f2722c);
                                    bArr11 = bArr5;
                                    r0Var10 = r0Var3;
                                    i55 = i28;
                                    obj6 = obj4;
                                    unsafe5 = unsafe4;
                                    i53 = i24;
                                    i52 = i26;
                                    i54 = i25;
                                    i50 = i10;
                                }
                            case 9:
                                Object obj14 = obj6;
                                Unsafe unsafe10 = unsafe5;
                                r0Var10 = r0Var;
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                i26 = i60;
                                if (i64 != 2) {
                                    r0Var2 = r0Var10;
                                    i25 = i22;
                                    bArr4 = bArr;
                                    obj3 = obj14;
                                    unsafe3 = unsafe10;
                                    Unsafe unsafe722222222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe722222222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    i55 = i27 | i106;
                                    Object G = g2Var.G(i24, obj14);
                                    i50 = i10;
                                    i51 = ia.t(G, g2Var.D(i24), bArr, i23, i50, r0Var10);
                                    g2Var.H(i24, obj14, G);
                                    bArr11 = bArr;
                                    unsafe5 = unsafe10;
                                    obj6 = obj14;
                                    i54 = i22;
                                    i53 = i24;
                                    i52 = i26;
                                }
                            case 10:
                                Object obj15 = obj6;
                                unsafe2 = unsafe5;
                                obj3 = obj15;
                                bArr3 = bArr;
                                r0Var10 = r0Var;
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                i26 = i60;
                                if (i64 != 2) {
                                    r0Var2 = r0Var10;
                                    i25 = i22;
                                    bArr4 = bArr3;
                                    unsafe3 = unsafe2;
                                    Unsafe unsafe7222222222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe7222222222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    i29 = i27 | i106;
                                    i51 = ia.q(bArr3, i23, r0Var10);
                                    unsafe2.putObject(obj3, j, r0Var10.f2722c);
                                    Unsafe unsafe11 = unsafe2;
                                    obj6 = obj3;
                                    unsafe5 = unsafe11;
                                    i50 = i10;
                                    i55 = i29;
                                    bArr11 = bArr3;
                                    i54 = i22;
                                    i53 = i24;
                                    i52 = i26;
                                }
                            case 12:
                                Object obj16 = obj6;
                                unsafe2 = unsafe5;
                                obj3 = obj16;
                                bArr3 = bArr;
                                r0Var10 = r0Var;
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                i26 = i60;
                                if (i64 != 0) {
                                    r0Var2 = r0Var10;
                                    i25 = i22;
                                    bArr4 = bArr3;
                                    unsafe3 = unsafe2;
                                    Unsafe unsafe72222222222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe72222222222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    i51 = ia.a(bArr3, i23, r0Var10);
                                    int i112 = r0Var10.f2720a;
                                    l0 F2 = g2Var.F(i24);
                                    if ((i65 & Integer.MIN_VALUE) == 0 || F2 == null || F2.a(i112)) {
                                        i29 = i27 | i106;
                                        unsafe2.putInt(obj3, j, i112);
                                        Unsafe unsafe112 = unsafe2;
                                        obj6 = obj3;
                                        unsafe5 = unsafe112;
                                        i50 = i10;
                                        i55 = i29;
                                        bArr11 = bArr3;
                                        i54 = i22;
                                        i53 = i24;
                                        i52 = i26;
                                    } else {
                                        k1 k1Var2 = (k1) obj3;
                                        u2 u2Var8 = k1Var2.zzc;
                                        if (u2Var8 == u2Var6) {
                                            u2Var8 = u2.a();
                                            k1Var2.zzc = u2Var8;
                                        }
                                        u2Var8.d(i56, Long.valueOf(i112));
                                        obj6 = obj3;
                                        unsafe5 = unsafe2;
                                        i55 = i27;
                                        i50 = i10;
                                        bArr11 = bArr3;
                                        i54 = i22;
                                        i53 = i24;
                                        i52 = i26;
                                    }
                                }
                            case 15:
                                Object obj17 = obj6;
                                unsafe2 = unsafe5;
                                obj3 = obj17;
                                bArr3 = bArr;
                                r0Var10 = r0Var;
                                i27 = i55;
                                i23 = i59;
                                i24 = i21;
                                i26 = i60;
                                if (i64 != 0) {
                                    r0Var2 = r0Var10;
                                    i25 = i22;
                                    bArr4 = bArr3;
                                    unsafe3 = unsafe2;
                                    Unsafe unsafe722222222222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe722222222222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    i29 = i27 | i106;
                                    i51 = ia.a(bArr3, i23, r0Var10);
                                    unsafe2.putInt(obj3, j, y0.j(r0Var10.f2720a));
                                    Unsafe unsafe1122 = unsafe2;
                                    obj6 = obj3;
                                    unsafe5 = unsafe1122;
                                    i50 = i10;
                                    i55 = i29;
                                    bArr11 = bArr3;
                                    i54 = i22;
                                    i53 = i24;
                                    i52 = i26;
                                }
                            case 16:
                                bArr3 = bArr;
                                i23 = i59;
                                i24 = i21;
                                if (i64 != 0) {
                                    Object obj18 = obj6;
                                    unsafe2 = unsafe5;
                                    obj3 = obj18;
                                    i25 = i22;
                                    i26 = i60;
                                    i27 = i55;
                                    r0Var2 = r0Var;
                                    bArr4 = bArr3;
                                    unsafe3 = unsafe2;
                                    Unsafe unsafe7222222222222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe7222222222222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    i55 |= i106;
                                    int g10 = ia.g(bArr3, i23, r0Var);
                                    unsafe5.putLong(obj6, j, y0.k(r0Var.f2721b));
                                    obj6 = obj6;
                                    unsafe5 = unsafe5;
                                    i50 = i10;
                                    r0Var10 = r0Var;
                                    i51 = g10;
                                    bArr11 = bArr3;
                                    i54 = i22;
                                    i53 = i24;
                                    i52 = i60;
                                }
                            default:
                                if (i64 != 3) {
                                    i24 = i21;
                                    unsafe3 = unsafe5;
                                    obj3 = obj6;
                                    i25 = i22;
                                    i27 = i55;
                                    i23 = i59;
                                    bArr4 = bArr;
                                    i26 = i60;
                                    r0Var2 = r0Var;
                                    Unsafe unsafe72222222222222 = unsafe3;
                                    obj2 = obj3;
                                    bArr2 = bArr4;
                                    i19 = i56;
                                    unsafe = unsafe72222222222222;
                                    i55 = i27;
                                    i12 = i11;
                                    i20 = i23;
                                    u2Var = u2Var6;
                                    i53 = i24;
                                    r0Var10 = r0Var2;
                                    i18 = i26;
                                    i14 = i25;
                                    break;
                                } else {
                                    i55 |= i106;
                                    i24 = i21;
                                    Object G2 = g2Var.G(i24, obj6);
                                    i51 = ia.v(G2, g2Var.D(i24), bArr, i59, i10, (i60 << 3) | 4, r0Var);
                                    bArr3 = bArr;
                                    g2Var.H(i24, obj6, G2);
                                    i50 = i10;
                                    r0Var10 = r0Var;
                                    bArr11 = bArr3;
                                    i54 = i22;
                                    i53 = i24;
                                    i52 = i60;
                                }
                        }
                    }
                } else {
                    u2Var = u2Var6;
                    i14 = i54;
                    i53 = i16;
                    i18 = i60;
                    i19 = i56;
                    i12 = i11;
                    unsafe = unsafe5;
                    obj2 = obj6;
                    bArr2 = bArr11;
                    i20 = i59;
                }
                if (i19 != i12 || i12 == 0) {
                    k1 k1Var3 = (k1) obj2;
                    u2 u2Var9 = k1Var3.zzc;
                    if (u2Var9 == u2Var) {
                        u2Var9 = u2.a();
                        k1Var3.zzc = u2Var9;
                    }
                    u2 u2Var10 = u2Var9;
                    byte[] bArr13 = bArr2;
                    int i113 = i19;
                    int B = ia.B(i113, bArr13, i20, i10, u2Var10, r0Var10);
                    Unsafe unsafe12 = unsafe;
                    i56 = i113;
                    unsafe5 = unsafe12;
                    bArr11 = bArr;
                    r0Var10 = r0Var;
                    i50 = i10;
                    obj6 = obj2;
                    i52 = i18;
                    i54 = i14;
                    i51 = B;
                    g2Var = this;
                } else {
                    i13 = i10;
                    i15 = i20;
                    unsafe5 = unsafe;
                    i56 = i19;
                }
            } else {
                i12 = i11;
                i13 = i50;
                i14 = i54;
                obj2 = obj6;
                i15 = i51;
            }
        }
    }
}
