package androidx.datastore.preferences.protobuf;

import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class M implements V {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f3435n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f3436o = i0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3437a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3439c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3440d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0185a f3441e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3442f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f3443g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3444h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3445i;
    public final O j;

    /* renamed from: k, reason: collision with root package name */
    public final B f3446k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f3447l;

    /* renamed from: m, reason: collision with root package name */
    public final I f3448m;

    public M(int[] iArr, Object[] objArr, int i2, int i5, AbstractC0185a abstractC0185a, int[] iArr2, int i7, int i8, O o7, B b7, d0 d0Var, C0199o c0199o, I i9) {
        this.f3437a = iArr;
        this.f3438b = objArr;
        this.f3439c = i2;
        this.f3440d = i5;
        this.f3442f = abstractC0185a instanceof AbstractC0205v;
        this.f3443g = iArr2;
        this.f3444h = i7;
        this.f3445i = i8;
        this.j = o7;
        this.f3446k = b7;
        this.f3447l = d0Var;
        this.f3441e = abstractC0185a;
        this.f3448m = i9;
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

    public static int K(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0205v) {
            return ((AbstractC0205v) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static M w(U u7, O o7, B b7, d0 d0Var, C0199o c0199o, I i2) {
        int i5;
        int charAt;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        char charAt2;
        int i14;
        char charAt3;
        int i15;
        char charAt4;
        int i16;
        char charAt5;
        int i17;
        char charAt6;
        int i18;
        char charAt7;
        int i19;
        char charAt8;
        int i20;
        char charAt9;
        int i21;
        int i22;
        int i23;
        Class<?> cls;
        int i24;
        int objectFieldOffset;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Field F4;
        char charAt10;
        int i30;
        int i31;
        Object obj;
        Field F7;
        Object obj2;
        Field F8;
        int i32;
        char charAt11;
        int i33;
        char charAt12;
        int i34;
        char charAt13;
        int i35;
        char charAt14;
        String str = u7.f3461b;
        int length = str.length();
        int i36 = 55296;
        if (str.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i5 = i37 + 1;
                if (str.charAt(i37) < 55296) {
                    break;
                }
                i37 = i5;
            }
        } else {
            i5 = 1;
        }
        int i38 = i5 + 1;
        int charAt15 = str.charAt(i5);
        if (charAt15 >= 55296) {
            int i39 = charAt15 & 8191;
            int i40 = 13;
            while (true) {
                i35 = i38 + 1;
                charAt14 = str.charAt(i38);
                if (charAt14 < 55296) {
                    break;
                }
                i39 |= (charAt14 & 8191) << i40;
                i40 += 13;
                i38 = i35;
            }
            charAt15 = i39 | (charAt14 << i40);
            i38 = i35;
        }
        if (charAt15 == 0) {
            i8 = 0;
            i11 = 0;
            charAt = 0;
            i7 = 0;
            i10 = 0;
            i12 = 0;
            iArr = f3435n;
            i9 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt16 = str.charAt(i38);
            if (charAt16 >= 55296) {
                int i42 = charAt16 & 8191;
                int i43 = 13;
                while (true) {
                    i20 = i41 + 1;
                    charAt9 = str.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i20;
                }
                charAt16 = i42 | (charAt9 << i43);
                i41 = i20;
            }
            int i44 = i41 + 1;
            int charAt17 = str.charAt(i41);
            if (charAt17 >= 55296) {
                int i45 = charAt17 & 8191;
                int i46 = 13;
                while (true) {
                    i19 = i44 + 1;
                    charAt8 = str.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i19;
                }
                charAt17 = i45 | (charAt8 << i46);
                i44 = i19;
            }
            int i47 = i44 + 1;
            int charAt18 = str.charAt(i44);
            if (charAt18 >= 55296) {
                int i48 = charAt18 & 8191;
                int i49 = 13;
                while (true) {
                    i18 = i47 + 1;
                    charAt7 = str.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i18;
                }
                charAt18 = i48 | (charAt7 << i49);
                i47 = i18;
            }
            int i50 = i47 + 1;
            int charAt19 = str.charAt(i47);
            if (charAt19 >= 55296) {
                int i51 = charAt19 & 8191;
                int i52 = 13;
                while (true) {
                    i17 = i50 + 1;
                    charAt6 = str.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i17;
                }
                charAt19 = i51 | (charAt6 << i52);
                i50 = i17;
            }
            int i53 = i50 + 1;
            charAt = str.charAt(i50);
            if (charAt >= 55296) {
                int i54 = charAt & 8191;
                int i55 = 13;
                while (true) {
                    i16 = i53 + 1;
                    charAt5 = str.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i16;
                }
                charAt = i54 | (charAt5 << i55);
                i53 = i16;
            }
            int i56 = i53 + 1;
            int charAt20 = str.charAt(i53);
            if (charAt20 >= 55296) {
                int i57 = charAt20 & 8191;
                int i58 = 13;
                while (true) {
                    i15 = i56 + 1;
                    charAt4 = str.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i15;
                }
                charAt20 = i57 | (charAt4 << i58);
                i56 = i15;
            }
            int i59 = i56 + 1;
            int charAt21 = str.charAt(i56);
            if (charAt21 >= 55296) {
                int i60 = charAt21 & 8191;
                int i61 = 13;
                while (true) {
                    i14 = i59 + 1;
                    charAt3 = str.charAt(i59);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i60 |= (charAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i14;
                }
                charAt21 = i60 | (charAt3 << i61);
                i59 = i14;
            }
            int i62 = i59 + 1;
            int charAt22 = str.charAt(i59);
            if (charAt22 >= 55296) {
                int i63 = charAt22 & 8191;
                int i64 = 13;
                while (true) {
                    i13 = i62 + 1;
                    charAt2 = str.charAt(i62);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i63 |= (charAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i13;
                }
                charAt22 = i63 | (charAt2 << i64);
                i62 = i13;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i65 = (charAt16 * 2) + charAt17;
            int i66 = charAt20;
            i7 = charAt18;
            i8 = i66;
            i9 = charAt16;
            i38 = i62;
            iArr = iArr2;
            i10 = charAt19;
            i11 = i65;
            i12 = charAt22;
        }
        Unsafe unsafe = f3436o;
        Object[] objArr = u7.f3462c;
        Class<?> cls2 = u7.f3460a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i67 = i12 + i8;
        int i68 = i67;
        int i69 = i12;
        int i70 = 0;
        int i71 = 0;
        while (i38 < length) {
            int i72 = i38 + 1;
            int charAt23 = str.charAt(i38);
            if (charAt23 >= i36) {
                int i73 = charAt23 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i34 = i74 + 1;
                    charAt13 = str.charAt(i74);
                    i21 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i73 |= (charAt13 & 8191) << i75;
                    i75 += 13;
                    i74 = i34;
                    length = i21;
                }
                charAt23 = i73 | (charAt13 << i75);
                i22 = i34;
            } else {
                i21 = length;
                i22 = i72;
            }
            int i76 = i22 + 1;
            int charAt24 = str.charAt(i22);
            Object[] objArr3 = objArr;
            char c7 = 55296;
            if (charAt24 >= 55296) {
                int i77 = charAt24 & 8191;
                int i78 = 13;
                while (true) {
                    i33 = i76 + 1;
                    charAt12 = str.charAt(i76);
                    if (charAt12 < c7) {
                        break;
                    }
                    i77 |= (charAt12 & 8191) << i78;
                    i78 += 13;
                    i76 = i33;
                    c7 = 55296;
                }
                charAt24 = i77 | (charAt12 << i78);
                i76 = i33;
            }
            int i79 = charAt24 & 255;
            int i80 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i70] = i71;
                i70++;
            }
            int[] iArr4 = iArr3;
            if (i79 >= 51) {
                int i81 = i76 + 1;
                int charAt25 = str.charAt(i76);
                char c8 = 55296;
                if (charAt25 >= 55296) {
                    int i82 = charAt25 & 8191;
                    int i83 = 13;
                    while (true) {
                        i32 = i81 + 1;
                        charAt11 = str.charAt(i81);
                        if (charAt11 < c8) {
                            break;
                        }
                        i82 |= (charAt11 & 8191) << i83;
                        i83 += 13;
                        i81 = i32;
                        c8 = 55296;
                    }
                    charAt25 = i82 | (charAt11 << i83);
                    i81 = i32;
                }
                int i84 = i79 - 51;
                int i85 = i81;
                if (i84 == 9 || i84 == 17) {
                    i31 = i11 + 1;
                    objArr2[((i71 / 3) * 2) + 1] = objArr3[i11];
                } else {
                    if (i84 == 12 && (S.i.a(u7.a(), 1) || (charAt24 & 2048) != 0)) {
                        i31 = i11 + 1;
                        objArr2[((i71 / 3) * 2) + 1] = objArr3[i11];
                    }
                    int i86 = charAt25 * 2;
                    obj = objArr3[i86];
                    if (obj instanceof Field) {
                        F7 = F(cls2, (String) obj);
                        objArr3[i86] = F7;
                    } else {
                        F7 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F7);
                    int i87 = i86 + 1;
                    obj2 = objArr3[i87];
                    if (obj2 instanceof Field) {
                        F8 = F(cls2, (String) obj2);
                        objArr3[i87] = F8;
                    } else {
                        F8 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F8);
                    int i88 = i9;
                    i25 = objectFieldOffset3;
                    i29 = objectFieldOffset2;
                    i23 = i88;
                    i28 = i11;
                    i26 = i85;
                    i27 = 0;
                    cls = cls2;
                }
                i11 = i31;
                int i862 = charAt25 * 2;
                obj = objArr3[i862];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(F7);
                int i872 = i862 + 1;
                obj2 = objArr3[i872];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(F8);
                int i882 = i9;
                i25 = objectFieldOffset32;
                i29 = objectFieldOffset22;
                i23 = i882;
                i28 = i11;
                i26 = i85;
                i27 = 0;
                cls = cls2;
            } else {
                int i89 = i11 + 1;
                Field F9 = F(cls2, (String) objArr3[i11]);
                if (i79 == 9 || i79 == 17) {
                    i23 = i9;
                    objArr2[((i71 / 3) * 2) + 1] = F9.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i23 = i9;
                        i30 = i11 + 2;
                        objArr2[((i71 / 3) * 2) + 1] = objArr3[i89];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i23 = i9;
                        if (u7.a() == 1 || (charAt24 & 2048) != 0) {
                            i30 = i11 + 2;
                            objArr2[((i71 / 3) * 2) + 1] = objArr3[i89];
                        }
                    } else if (i79 == 50) {
                        int i90 = i69 + 1;
                        iArr[i69] = i71;
                        int i91 = (i71 / 3) * 2;
                        int i92 = i11 + 2;
                        objArr2[i91] = objArr3[i89];
                        if ((charAt24 & 2048) != 0) {
                            i24 = i11 + 3;
                            objArr2[i91 + 1] = objArr3[i92];
                            i23 = i9;
                            cls = cls2;
                            i69 = i90;
                        } else {
                            cls = cls2;
                            i24 = i92;
                            i69 = i90;
                            i23 = i9;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F9);
                        if ((charAt24 & 4096) != 0 || i79 > 17) {
                            i25 = 1048575;
                            i26 = i76;
                            i27 = 0;
                        } else {
                            int i93 = i76 + 1;
                            int charAt26 = str.charAt(i76);
                            if (charAt26 >= 55296) {
                                int i94 = charAt26 & 8191;
                                int i95 = 13;
                                while (true) {
                                    i26 = i93 + 1;
                                    charAt10 = str.charAt(i93);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i94 |= (charAt10 & 8191) << i95;
                                    i95 += 13;
                                    i93 = i26;
                                }
                                charAt26 = i94 | (charAt10 << i95);
                            } else {
                                i26 = i93;
                            }
                            int i96 = (charAt26 / 32) + (i23 * 2);
                            Object obj3 = objArr3[i96];
                            if (obj3 instanceof Field) {
                                F4 = (Field) obj3;
                            } else {
                                F4 = F(cls, (String) obj3);
                                objArr3[i96] = F4;
                            }
                            i25 = (int) unsafe.objectFieldOffset(F4);
                            i27 = charAt26 % 32;
                        }
                        if (i79 >= 18 || i79 > 49) {
                            i28 = i24;
                            i29 = objectFieldOffset;
                        } else {
                            iArr[i68] = objectFieldOffset;
                            i28 = i24;
                            i29 = objectFieldOffset;
                            i68++;
                        }
                    } else {
                        i23 = i9;
                    }
                    i24 = i30;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F9);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i25 = 1048575;
                    i26 = i76;
                    i27 = 0;
                    if (i79 >= 18) {
                    }
                    i28 = i24;
                    i29 = objectFieldOffset;
                }
                cls = cls2;
                i24 = i89;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F9);
                if ((charAt24 & 4096) != 0) {
                }
                i25 = 1048575;
                i26 = i76;
                i27 = 0;
                if (i79 >= 18) {
                }
                i28 = i24;
                i29 = objectFieldOffset;
            }
            int i97 = i71 + 1;
            iArr4[i71] = i80;
            int i98 = i71 + 2;
            String str2 = str;
            iArr4[i97] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i79 << 20) | i29;
            i71 += 3;
            iArr4[i98] = (i27 << 20) | i25;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i21;
            i9 = i23;
            i38 = i26;
            i36 = 55296;
            i11 = i28;
            iArr3 = iArr4;
        }
        return new M(iArr3, objArr2, i7, i10, u7.f3460a, iArr, i12, i67, o7, b7, d0Var, c0199o, i2);
    }

    public static long x(int i2) {
        return i2 & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) i0.f3519c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) i0.f3519c.h(j, obj)).longValue();
    }

    public final int A(int i2) {
        if (i2 >= this.f3439c && i2 <= this.f3440d) {
            int[] iArr = this.f3437a;
            int length = (iArr.length / 3) - 1;
            int i5 = 0;
            while (i5 <= length) {
                int i7 = (length + i5) >>> 1;
                int i8 = i7 * 3;
                int i9 = iArr[i8];
                if (i2 == i9) {
                    return i8;
                }
                if (i2 < i9) {
                    length = i7 - 1;
                } else {
                    i5 = i7 + 1;
                }
            }
        }
        return -1;
    }

    public final void B(Object obj, long j, C0194j c0194j, V v7, C0198n c0198n) {
        int u7;
        this.f3446k.getClass();
        InterfaceC0206w a7 = B.a(j, obj);
        B6.c cVar = (B6.c) c0194j.f3527d;
        int i2 = c0194j.f3524a;
        if ((i2 & 7) != 3) {
            throw C0209z.b();
        }
        do {
            AbstractC0205v i5 = v7.i();
            c0194j.b(i5, v7, c0198n);
            v7.d(i5);
            ((T) a7).add(i5);
            if (cVar.c() || c0194j.f3526c != 0) {
                return;
            } else {
                u7 = cVar.u();
            }
        } while (u7 == i2);
        c0194j.f3526c = u7;
    }

    public final void C(Object obj, int i2, C0194j c0194j, V v7, C0198n c0198n) {
        int u7;
        this.f3446k.getClass();
        InterfaceC0206w a7 = B.a(i2 & 1048575, obj);
        B6.c cVar = (B6.c) c0194j.f3527d;
        int i5 = c0194j.f3524a;
        if ((i5 & 7) != 2) {
            throw C0209z.b();
        }
        do {
            AbstractC0205v i7 = v7.i();
            c0194j.c(i7, v7, c0198n);
            v7.d(i7);
            ((T) a7).add(i7);
            if (cVar.c() || c0194j.f3526c != 0) {
                return;
            } else {
                u7 = cVar.u();
            }
        } while (u7 == i5);
        c0194j.f3526c = u7;
    }

    public final void D(int i2, C0194j c0194j, Object obj) {
        B6.c cVar = (B6.c) c0194j.f3527d;
        if ((536870912 & i2) != 0) {
            c0194j.x(2);
            i0.o(i2 & 1048575, obj, cVar.t());
        } else if (!this.f3442f) {
            i0.o(i2 & 1048575, obj, c0194j.e());
        } else {
            c0194j.x(2);
            i0.o(i2 & 1048575, obj, cVar.s());
        }
    }

    public final void E(int i2, C0194j c0194j, Object obj) {
        int i5 = 536870912 & i2;
        B b7 = this.f3446k;
        if (i5 != 0) {
            b7.getClass();
            c0194j.t(B.a(i2 & 1048575, obj), true);
        } else {
            b7.getClass();
            c0194j.t(B.a(i2 & 1048575, obj), false);
        }
    }

    public final void G(int i2, Object obj) {
        int i5 = this.f3437a[i2 + 2];
        long j = 1048575 & i5;
        if (j == 1048575) {
            return;
        }
        i0.m(obj, j, (1 << (i5 >>> 20)) | i0.f3519c.f(j, obj));
    }

    public final void H(Object obj, int i2, int i5) {
        i0.m(obj, this.f3437a[i5 + 2] & 1048575, i2);
    }

    public final void I(Object obj, int i2, AbstractC0185a abstractC0185a) {
        f3436o.putObject(obj, L(i2) & 1048575, abstractC0185a);
        G(i2, obj);
    }

    public final void J(Object obj, int i2, int i5, AbstractC0185a abstractC0185a) {
        f3436o.putObject(obj, L(i5) & 1048575, abstractC0185a);
        H(obj, i2, i5);
    }

    public final int L(int i2) {
        return this.f3437a[i2 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, E e7) {
        int i2;
        int i5;
        int i7;
        int i8;
        boolean z7;
        M m2 = this;
        int[] iArr = m2.f3437a;
        int length = iArr.length;
        Unsafe unsafe = f3436o;
        int i9 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int L7 = m2.L(i11);
            int i13 = iArr[i11];
            int K7 = K(L7);
            if (K7 <= 17) {
                int i14 = iArr[i11 + 2];
                int i15 = i14 & i9;
                if (i15 != i10) {
                    i12 = i15 == i9 ? 0 : unsafe.getInt(obj, i15);
                    i10 = i15;
                }
                i2 = L7;
                i5 = 1 << (i14 >>> 20);
            } else {
                i2 = L7;
                i5 = 0;
            }
            long j = i2 & i9;
            switch (K7) {
                case 0:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        double d7 = i0.f3519c.d(j, obj);
                        C0196l c0196l = (C0196l) e7.f3424a;
                        c0196l.getClass();
                        c0196l.m0(Double.doubleToRawLongBits(d7), i13);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        float e8 = i0.f3519c.e(j, obj);
                        C0196l c0196l2 = (C0196l) e7.f3424a;
                        c0196l2.getClass();
                        c0196l2.k0(i13, Float.floatToRawIntBits(e8));
                    }
                    m2 = this;
                    break;
                case 2:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).w0(unsafe.getLong(obj, j), i13);
                    }
                    m2 = this;
                    break;
                case 3:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).w0(unsafe.getLong(obj, j), i13);
                    }
                    m2 = this;
                    break;
                case 4:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).o0(i13, unsafe.getInt(obj, j));
                    }
                    m2 = this;
                    break;
                case 5:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).m0(unsafe.getLong(obj, j), i13);
                    }
                    m2 = this;
                    break;
                case 6:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).k0(i13, unsafe.getInt(obj, j));
                    }
                    m2 = this;
                    break;
                case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).h0(i13, i0.f3519c.c(j, obj));
                    }
                    m2 = this;
                    break;
                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C0196l) e7.f3424a).r0(i13, (String) object);
                        } else {
                            ((C0196l) e7.f3424a).i0(i13, (C0191g) object);
                        }
                    }
                    m2 = this;
                    break;
                case 9:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).q0(i13, (AbstractC0185a) unsafe.getObject(obj, j), m2.m(i11));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).i0(i13, (C0191g) unsafe.getObject(obj, j));
                    }
                    m2 = this;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).u0(i13, unsafe.getInt(obj, j));
                    }
                    m2 = this;
                    break;
                case 12:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).o0(i13, unsafe.getInt(obj, j));
                    }
                    m2 = this;
                    break;
                case 13:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).k0(i13, unsafe.getInt(obj, j));
                    }
                    m2 = this;
                    break;
                case 14:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        ((C0196l) e7.f3424a).m0(unsafe.getLong(obj, j), i13);
                    }
                    m2 = this;
                    break;
                case 15:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        int i16 = unsafe.getInt(obj, j);
                        ((C0196l) e7.f3424a).u0(i13, (i16 >> 31) ^ (i16 << 1));
                    }
                    m2 = this;
                    break;
                case 16:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        long j7 = unsafe.getLong(obj, j);
                        ((C0196l) e7.f3424a).w0((j7 >> 63) ^ (j7 << 1), i13);
                    }
                    m2 = this;
                    break;
                case 17:
                    if (m2.o(obj, i11, i10, i12, i5)) {
                        e7.a(i13, unsafe.getObject(obj, j), m2.m(i11));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i7 = i10;
                    W.n(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 19:
                    i7 = i10;
                    W.r(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 20:
                    i7 = i10;
                    W.t(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 21:
                    i7 = i10;
                    W.z(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 22:
                    i7 = i10;
                    W.s(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 23:
                    i7 = i10;
                    W.q(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 24:
                    i7 = i10;
                    W.p(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 25:
                    i7 = i10;
                    W.m(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                    i8 = i10;
                    int i17 = iArr[i11];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = W.f3464a;
                    if (list != null && !list.isEmpty()) {
                        e7.getClass();
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            ((C0196l) e7.f3424a).r0(i17, (String) list.get(i18));
                        }
                    }
                    i10 = i8;
                    break;
                case 27:
                    i8 = i10;
                    int i19 = iArr[i11];
                    List list2 = (List) unsafe.getObject(obj, j);
                    V m7 = m2.m(i11);
                    Class cls2 = W.f3464a;
                    if (list2 != null && !list2.isEmpty()) {
                        e7.getClass();
                        for (int i20 = 0; i20 < list2.size(); i20++) {
                            ((C0196l) e7.f3424a).q0(i19, (AbstractC0185a) list2.get(i20), m7);
                        }
                    }
                    i10 = i8;
                    break;
                case 28:
                    i8 = i10;
                    int i21 = iArr[i11];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = W.f3464a;
                    if (list3 != null && !list3.isEmpty()) {
                        e7.getClass();
                        for (int i22 = 0; i22 < list3.size(); i22++) {
                            ((C0196l) e7.f3424a).i0(i21, (C0191g) list3.get(i22));
                        }
                    }
                    i10 = i8;
                    break;
                case 29:
                    i7 = i10;
                    z7 = false;
                    W.y(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 30:
                    i7 = i10;
                    z7 = false;
                    W.o(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 31:
                    i7 = i10;
                    z7 = false;
                    W.u(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 32:
                    i7 = i10;
                    z7 = false;
                    W.v(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 33:
                    i7 = i10;
                    z7 = false;
                    W.w(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 34:
                    i7 = i10;
                    z7 = false;
                    W.x(iArr[i11], (List) unsafe.getObject(obj, j), e7, false);
                    i10 = i7;
                    break;
                case 35:
                    i8 = i10;
                    W.n(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 36:
                    i8 = i10;
                    W.r(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 37:
                    i8 = i10;
                    W.t(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 38:
                    i8 = i10;
                    W.z(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 39:
                    i8 = i10;
                    W.s(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    i8 = i10;
                    W.q(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i8 = i10;
                    W.p(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 42:
                    i8 = i10;
                    W.m(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 43:
                    i8 = i10;
                    W.y(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 44:
                    i8 = i10;
                    W.o(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 45:
                    i8 = i10;
                    W.u(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 46:
                    i8 = i10;
                    W.v(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 47:
                    i8 = i10;
                    W.w(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 48:
                    i8 = i10;
                    W.x(iArr[i11], (List) unsafe.getObject(obj, j), e7, true);
                    i10 = i8;
                    break;
                case 49:
                    i8 = i10;
                    int i23 = iArr[i11];
                    List list4 = (List) unsafe.getObject(obj, j);
                    V m8 = m2.m(i11);
                    Class cls4 = W.f3464a;
                    if (list4 != null && !list4.isEmpty()) {
                        e7.getClass();
                        for (int i24 = 0; i24 < list4.size(); i24++) {
                            e7.a(i23, list4.get(i24), m8);
                        }
                    }
                    i10 = i8;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i25 = 2;
                        Object obj2 = m2.f3438b[(i11 / 3) * 2];
                        m2.f3448m.getClass();
                        F f7 = ((G) obj2).f3428a;
                        C0196l c0196l3 = (C0196l) e7.f3424a;
                        c0196l3.getClass();
                        for (Map.Entry entry : ((H) object2).entrySet()) {
                            c0196l3.t0(i13, i25);
                            c0196l3.v0(G.a(f7, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0201q.b(c0196l3, f7.f3425a, 1, key);
                            i25 = 2;
                            C0201q.b(c0196l3, f7.f3426b, 2, value);
                            i10 = i10;
                        }
                    }
                    i8 = i10;
                    i10 = i8;
                    break;
                case 51:
                    if (m2.q(obj, i13, i11)) {
                        double doubleValue = ((Double) i0.f3519c.h(j, obj)).doubleValue();
                        C0196l c0196l4 = (C0196l) e7.f3424a;
                        c0196l4.getClass();
                        c0196l4.m0(Double.doubleToRawLongBits(doubleValue), i13);
                    }
                    break;
                case 52:
                    if (m2.q(obj, i13, i11)) {
                        float floatValue = ((Float) i0.f3519c.h(j, obj)).floatValue();
                        C0196l c0196l5 = (C0196l) e7.f3424a;
                        c0196l5.getClass();
                        c0196l5.k0(i13, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).w0(z(j, obj), i13);
                    }
                    break;
                case 54:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).w0(z(j, obj), i13);
                    }
                    break;
                case 55:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).o0(i13, y(j, obj));
                    }
                    break;
                case 56:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).m0(z(j, obj), i13);
                    }
                    break;
                case 57:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).k0(i13, y(j, obj));
                    }
                    break;
                case 58:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).h0(i13, ((Boolean) i0.f3519c.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (m2.q(obj, i13, i11)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((C0196l) e7.f3424a).r0(i13, (String) object3);
                        } else {
                            ((C0196l) e7.f3424a).i0(i13, (C0191g) object3);
                        }
                    }
                    break;
                case 60:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).q0(i13, (AbstractC0185a) unsafe.getObject(obj, j), m2.m(i11));
                    }
                    break;
                case 61:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).i0(i13, (C0191g) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).u0(i13, y(j, obj));
                    }
                    break;
                case 63:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).o0(i13, y(j, obj));
                    }
                    break;
                case 64:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).k0(i13, y(j, obj));
                    }
                    break;
                case 65:
                    if (m2.q(obj, i13, i11)) {
                        ((C0196l) e7.f3424a).m0(z(j, obj), i13);
                    }
                    break;
                case 66:
                    if (m2.q(obj, i13, i11)) {
                        int y7 = y(j, obj);
                        ((C0196l) e7.f3424a).u0(i13, (y7 >> 31) ^ (y7 << 1));
                    }
                    break;
                case 67:
                    if (m2.q(obj, i13, i11)) {
                        long z8 = z(j, obj);
                        ((C0196l) e7.f3424a).w0((z8 << 1) ^ (z8 >> 63), i13);
                    }
                    break;
                case 68:
                    if (m2.q(obj, i13, i11)) {
                        e7.a(i13, unsafe.getObject(obj, j), m2.m(i11));
                    }
                    break;
            }
            i11 += 3;
            i9 = 1048575;
        }
        m2.f3447l.getClass();
        ((AbstractC0205v) obj).unknownFields.d(e7);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.V
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f3437a;
            if (i2 >= iArr.length) {
                W.k(this.f3447l, obj, obj2);
                return;
            }
            int L7 = L(i2);
            long j = 1048575 & L7;
            int i5 = iArr[i2];
            switch (K(L7)) {
                case 0:
                    if (n(i2, obj2)) {
                        h0 h0Var = i0.f3519c;
                        obj3 = obj;
                        h0Var.l(obj3, j, h0Var.d(j, obj2));
                        G(i2, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i2, obj2)) {
                        h0 h0Var2 = i0.f3519c;
                        h0Var2.m(obj, j, h0Var2.e(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i2, obj2)) {
                        i0.n(obj, j, i0.f3519c.g(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i2, obj2)) {
                        i0.n(obj, j, i0.f3519c.g(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i2, obj2)) {
                        i0.m(obj, j, i0.f3519c.f(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i2, obj2)) {
                        i0.n(obj, j, i0.f3519c.g(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i2, obj2)) {
                        i0.m(obj, j, i0.f3519c.f(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i2, obj2)) {
                        h0 h0Var3 = i0.f3519c;
                        h0Var3.j(obj, j, h0Var3.c(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(i2, obj2)) {
                        i0.o(j, obj, i0.f3519c.h(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(obj, i2, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i2, obj2)) {
                        i0.o(j, obj, i0.f3519c.h(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (n(i2, obj2)) {
                        i0.m(obj, j, i0.f3519c.f(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i2, obj2)) {
                        i0.m(obj, j, i0.f3519c.f(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i2, obj2)) {
                        i0.m(obj, j, i0.f3519c.f(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i2, obj2)) {
                        i0.n(obj, j, i0.f3519c.g(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i2, obj2)) {
                        i0.m(obj, j, i0.f3519c.f(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i2, obj2)) {
                        i0.n(obj, j, i0.f3519c.g(j, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(obj, i2, obj2);
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
                case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
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
                    this.f3446k.getClass();
                    h0 h0Var4 = i0.f3519c;
                    InterfaceC0206w interfaceC0206w = (InterfaceC0206w) h0Var4.h(j, obj);
                    InterfaceC0206w interfaceC0206w2 = (InterfaceC0206w) h0Var4.h(j, obj2);
                    T t6 = (T) interfaceC0206w;
                    int i7 = t6.f3459i;
                    int i8 = ((T) interfaceC0206w2).f3459i;
                    if (i7 > 0 && i8 > 0) {
                        if (!((AbstractC0186b) interfaceC0206w).f3482d) {
                            interfaceC0206w = t6.c(i8 + i7);
                        }
                        ((AbstractC0186b) interfaceC0206w).addAll(interfaceC0206w2);
                    }
                    if (i7 > 0) {
                        interfaceC0206w2 = interfaceC0206w;
                    }
                    i0.o(j, obj, interfaceC0206w2);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = W.f3464a;
                    h0 h0Var5 = i0.f3519c;
                    Object h7 = h0Var5.h(j, obj);
                    Object h8 = h0Var5.h(j, obj2);
                    this.f3448m.getClass();
                    i0.o(j, obj, I.a(h7, h8));
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
                    if (q(obj2, i5, i2)) {
                        i0.o(j, obj, i0.f3519c.h(j, obj2));
                        H(obj, i5, i2);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(obj, i2, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(obj2, i5, i2)) {
                        i0.o(j, obj, i0.f3519c.h(j, obj2));
                        H(obj, i5, i2);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(obj, i2, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i2 += 3;
            obj = obj3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, E e7) {
        e7.getClass();
        M(obj, e7);
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
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(AbstractC0205v abstractC0205v) {
        int i2;
        int b7;
        int i5;
        int[] iArr = this.f3437a;
        int length = iArr.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int L7 = L(i8);
            int i9 = iArr[i8];
            long j = 1048575 & L7;
            int i10 = 1237;
            int i11 = 37;
            switch (K(L7)) {
                case 0:
                    i2 = i7 * 53;
                    b7 = AbstractC0207x.b(Double.doubleToLongBits(i0.f3519c.d(j, abstractC0205v)));
                    i7 = b7 + i2;
                    break;
                case 1:
                    i2 = i7 * 53;
                    b7 = Float.floatToIntBits(i0.f3519c.e(j, abstractC0205v));
                    i7 = b7 + i2;
                    break;
                case 2:
                    i2 = i7 * 53;
                    b7 = AbstractC0207x.b(i0.f3519c.g(j, abstractC0205v));
                    i7 = b7 + i2;
                    break;
                case 3:
                    i2 = i7 * 53;
                    b7 = AbstractC0207x.b(i0.f3519c.g(j, abstractC0205v));
                    i7 = b7 + i2;
                    break;
                case 4:
                    i2 = i7 * 53;
                    b7 = i0.f3519c.f(j, abstractC0205v);
                    i7 = b7 + i2;
                    break;
                case 5:
                    i2 = i7 * 53;
                    b7 = AbstractC0207x.b(i0.f3519c.g(j, abstractC0205v));
                    i7 = b7 + i2;
                    break;
                case 6:
                    i2 = i7 * 53;
                    b7 = i0.f3519c.f(j, abstractC0205v);
                    i7 = b7 + i2;
                    break;
                case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    i5 = i7 * 53;
                    boolean c7 = i0.f3519c.c(j, abstractC0205v);
                    Charset charset = AbstractC0207x.f3571a;
                    break;
                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                    i2 = i7 * 53;
                    b7 = ((String) i0.f3519c.h(j, abstractC0205v)).hashCode();
                    i7 = b7 + i2;
                    break;
                case 9:
                    Object h7 = i0.f3519c.h(j, abstractC0205v);
                    if (h7 != null) {
                        i11 = h7.hashCode();
                    }
                    i7 = (i7 * 53) + i11;
                    break;
                case 10:
                    i2 = i7 * 53;
                    b7 = i0.f3519c.h(j, abstractC0205v).hashCode();
                    i7 = b7 + i2;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    i2 = i7 * 53;
                    b7 = i0.f3519c.f(j, abstractC0205v);
                    i7 = b7 + i2;
                    break;
                case 12:
                    i2 = i7 * 53;
                    b7 = i0.f3519c.f(j, abstractC0205v);
                    i7 = b7 + i2;
                    break;
                case 13:
                    i2 = i7 * 53;
                    b7 = i0.f3519c.f(j, abstractC0205v);
                    i7 = b7 + i2;
                    break;
                case 14:
                    i2 = i7 * 53;
                    b7 = AbstractC0207x.b(i0.f3519c.g(j, abstractC0205v));
                    i7 = b7 + i2;
                    break;
                case 15:
                    i2 = i7 * 53;
                    b7 = i0.f3519c.f(j, abstractC0205v);
                    i7 = b7 + i2;
                    break;
                case 16:
                    i2 = i7 * 53;
                    b7 = AbstractC0207x.b(i0.f3519c.g(j, abstractC0205v));
                    i7 = b7 + i2;
                    break;
                case 17:
                    Object h8 = i0.f3519c.h(j, abstractC0205v);
                    if (h8 != null) {
                        i11 = h8.hashCode();
                    }
                    i7 = (i7 * 53) + i11;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
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
                    i2 = i7 * 53;
                    b7 = i0.f3519c.h(j, abstractC0205v).hashCode();
                    i7 = b7 + i2;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i2 = i7 * 53;
                    b7 = i0.f3519c.h(j, abstractC0205v).hashCode();
                    i7 = b7 + i2;
                    break;
                case 51:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = AbstractC0207x.b(Double.doubleToLongBits(((Double) i0.f3519c.h(j, abstractC0205v)).doubleValue()));
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = Float.floatToIntBits(((Float) i0.f3519c.h(j, abstractC0205v)).floatValue());
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = AbstractC0207x.b(z(j, abstractC0205v));
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = AbstractC0207x.b(z(j, abstractC0205v));
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = y(j, abstractC0205v);
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = AbstractC0207x.b(z(j, abstractC0205v));
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = y(j, abstractC0205v);
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(abstractC0205v, i9, i8)) {
                        i5 = i7 * 53;
                        boolean booleanValue = ((Boolean) i0.f3519c.h(j, abstractC0205v)).booleanValue();
                        Charset charset2 = AbstractC0207x.f3571a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = ((String) i0.f3519c.h(j, abstractC0205v)).hashCode();
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = i0.f3519c.h(j, abstractC0205v).hashCode();
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = i0.f3519c.h(j, abstractC0205v).hashCode();
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = y(j, abstractC0205v);
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = y(j, abstractC0205v);
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = y(j, abstractC0205v);
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = AbstractC0207x.b(z(j, abstractC0205v));
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = y(j, abstractC0205v);
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = AbstractC0207x.b(z(j, abstractC0205v));
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(abstractC0205v, i9, i8)) {
                        i2 = i7 * 53;
                        b7 = i0.f3519c.h(j, abstractC0205v).hashCode();
                        i7 = b7 + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f3447l.getClass();
        return abstractC0205v.unknownFields.hashCode() + (i7 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0205v) {
                AbstractC0205v abstractC0205v = (AbstractC0205v) obj;
                abstractC0205v.k(Integer.MAX_VALUE);
                abstractC0205v.memoizedHashCode = 0;
                abstractC0205v.h();
            }
            int[] iArr = this.f3437a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int L7 = L(i2);
                long j = 1048575 & L7;
                int K7 = K(L7);
                if (K7 != 9) {
                    if (K7 != 60 && K7 != 68) {
                        switch (K7) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
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
                                this.f3446k.getClass();
                                AbstractC0186b abstractC0186b = (AbstractC0186b) ((InterfaceC0206w) i0.f3519c.h(j, obj));
                                if (abstractC0186b.f3482d) {
                                    abstractC0186b.f3482d = false;
                                    break;
                                } else {
                                    break;
                                }
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f3436o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f3448m.getClass();
                                    ((H) object).f3431d = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(obj, iArr[i2], i2)) {
                        m(i2).d(f3436o.getObject(obj, j));
                    }
                }
                if (n(i2, obj)) {
                    m(i2).d(f3436o.getObject(obj, j));
                }
            }
            this.f3447l.getClass();
            c0 c0Var = ((AbstractC0205v) obj).unknownFields;
            if (c0Var.f3490e) {
                c0Var.f3490e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean e(Object obj) {
        int i2;
        int i5;
        int i7;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i10 < this.f3444h) {
            int i11 = this.f3443g[i10];
            int[] iArr = this.f3437a;
            int i12 = iArr[i11];
            int L7 = L(i11);
            int i13 = iArr[i11 + 2];
            int i14 = i13 & 1048575;
            int i15 = 1 << (i13 >>> 20);
            if (i14 != i8) {
                if (i14 != 1048575) {
                    i9 = f3436o.getInt(obj, i14);
                }
                i5 = i11;
                i7 = i9;
                i2 = i14;
            } else {
                int i16 = i9;
                i2 = i8;
                i5 = i11;
                i7 = i16;
            }
            if ((268435456 & L7) == 0 || o(obj, i5, i2, i7, i15)) {
                int K7 = K(L7);
                if (K7 == 9 || K7 == 17) {
                    if (o(obj, i5, i2, i7, i15)) {
                        if (!m(i5).e(i0.f3519c.h(L7 & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i10++;
                    i8 = i2;
                    i9 = i7;
                } else {
                    if (K7 != 27) {
                        if (K7 == 60 || K7 == 68) {
                            if (q(obj, i12, i5)) {
                                if (!m(i5).e(i0.f3519c.h(L7 & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i10++;
                            i8 = i2;
                            i9 = i7;
                        } else if (K7 != 49) {
                            if (K7 != 50) {
                                continue;
                            } else {
                                Object h7 = i0.f3519c.h(L7 & 1048575, obj);
                                this.f3448m.getClass();
                                H h8 = (H) h7;
                                if (h8.isEmpty()) {
                                    continue;
                                } else {
                                    if (((G) this.f3438b[(i5 / 3) * 2]).f3428a.f3426b.f3549d != r0.MESSAGE) {
                                        continue;
                                    } else {
                                        V v7 = null;
                                        for (Object obj2 : h8.values()) {
                                            if (v7 == null) {
                                                v7 = S.f3454c.a(obj2.getClass());
                                            }
                                            if (!v7.e(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i10++;
                            i8 = i2;
                            i9 = i7;
                        }
                    }
                    List list = (List) i0.f3519c.h(L7 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        V m2 = m(i5);
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            if (m2.e(list.get(i17))) {
                            }
                        }
                    }
                    i10++;
                    i8 = i2;
                    i9 = i7;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.W.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.W.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(AbstractC0205v abstractC0205v, AbstractC0205v abstractC0205v2) {
        int[] iArr = this.f3437a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean z7 = true;
            if (i2 < length) {
                int L7 = L(i2);
                long j = L7 & 1048575;
                switch (K(L7)) {
                    case 0:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 1:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var2 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 2:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var3 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 3:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var4 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 4:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var5 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 5:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var6 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 6:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var7 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var8 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case S.j.BYTES_FIELD_NUMBER /* 8 */:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var9 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 9:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var10 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 10:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var11 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var12 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 12:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var13 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 13:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var14 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 14:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var15 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 15:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var16 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 16:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var17 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 17:
                        if (j(abstractC0205v, abstractC0205v2, i2)) {
                            h0 h0Var18 = i0.f3519c;
                            break;
                        }
                        z7 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
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
                        h0 h0Var19 = i0.f3519c;
                        z7 = W.l(h0Var19.h(j, abstractC0205v), h0Var19.h(j, abstractC0205v2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        h0 h0Var20 = i0.f3519c;
                        z7 = W.l(h0Var20.h(j, abstractC0205v), h0Var20.h(j, abstractC0205v2));
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
                        long j7 = iArr[i2 + 2] & 1048575;
                        h0 h0Var21 = i0.f3519c;
                        if (h0Var21.f(j7, abstractC0205v) == h0Var21.f(j7, abstractC0205v2)) {
                            break;
                        }
                        z7 = false;
                        break;
                }
                if (z7) {
                    i2 += 3;
                }
            } else {
                this.f3447l.getClass();
                if (abstractC0205v.unknownFields.equals(abstractC0205v2.unknownFields)) {
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
    @Override // androidx.datastore.preferences.protobuf.V
    public final void g(java.lang.Object r19, androidx.datastore.preferences.protobuf.C0194j r20, androidx.datastore.preferences.protobuf.C0198n r21) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.g(java.lang.Object, androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.n):void");
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0205v abstractC0205v) {
        int i2;
        int a02;
        int a03;
        int a04;
        int c02;
        int a05;
        int c03;
        int a06;
        int a07;
        int Y6;
        int a08;
        int a7;
        int c7;
        int a09;
        int size;
        int i5;
        int a010;
        int a011;
        int size2;
        int a012;
        int b02;
        int i7;
        int i8;
        int a013;
        int b03;
        M m2 = this;
        AbstractC0205v abstractC0205v2 = abstractC0205v;
        Unsafe unsafe = f3436o;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = m2.f3437a;
            if (i10 >= iArr.length) {
                m2.f3447l.getClass();
                return abstractC0205v2.unknownFields.b() + i12;
            }
            int L7 = m2.L(i10);
            int K7 = K(L7);
            int i13 = iArr[i10];
            int i14 = iArr[i10 + 2];
            int i15 = i14 & 1048575;
            if (K7 <= 17) {
                if (i15 != i9) {
                    i11 = i15 == 1048575 ? 0 : unsafe.getInt(abstractC0205v2, i15);
                    i9 = i15;
                }
                i2 = 1 << (i14 >>> 20);
            } else {
                i2 = 0;
            }
            long j = L7 & 1048575;
            if (K7 >= r.f3551e.f3555d) {
                int i16 = r.f3552i.f3555d;
            }
            switch (K7) {
                case 0:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        a02 = C0196l.a0(i13);
                        c7 = a02 + 8;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        a03 = C0196l.a0(i13);
                        a07 = a03 + 4;
                        i12 += a07;
                    }
                    m2 = this;
                    abstractC0205v2 = abstractC0205v;
                    break;
                case 2:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        long j7 = unsafe.getLong(abstractC0205v2, j);
                        a04 = C0196l.a0(i13);
                        c02 = C0196l.c0(j7);
                        i12 += c02 + a04;
                    }
                    m2 = this;
                    break;
                case 3:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        long j8 = unsafe.getLong(abstractC0205v2, j);
                        a04 = C0196l.a0(i13);
                        c02 = C0196l.c0(j8);
                        i12 += c02 + a04;
                    }
                    m2 = this;
                    break;
                case 4:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        int i17 = unsafe.getInt(abstractC0205v2, j);
                        a05 = C0196l.a0(i13);
                        c03 = C0196l.c0(i17);
                        Y6 = c03 + a05;
                        i12 += Y6;
                    }
                    m2 = this;
                    break;
                case 5:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        a06 = C0196l.a0(i13);
                        a07 = a06 + 8;
                        i12 += a07;
                    }
                    m2 = this;
                    abstractC0205v2 = abstractC0205v;
                    break;
                case 6:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        a03 = C0196l.a0(i13);
                        a07 = a03 + 4;
                        i12 += a07;
                    }
                    m2 = this;
                    abstractC0205v2 = abstractC0205v;
                    break;
                case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        a07 = C0196l.a0(i13) + 1;
                        i12 += a07;
                    }
                    m2 = this;
                    abstractC0205v2 = abstractC0205v;
                    break;
                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        Object object = unsafe.getObject(abstractC0205v2, j);
                        i12 = (object instanceof C0191g ? C0196l.Y(i13, (C0191g) object) : C0196l.Z((String) object) + C0196l.a0(i13)) + i12;
                    }
                    m2 = this;
                    break;
                case 9:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        Object object2 = unsafe.getObject(abstractC0205v2, j);
                        V m7 = m2.m(i10);
                        Class cls = W.f3464a;
                        int a014 = C0196l.a0(i13);
                        int a8 = ((AbstractC0185a) object2).a(m7);
                        i12 += C0196l.b0(a8) + a8 + a014;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        Y6 = C0196l.Y(i13, (C0191g) unsafe.getObject(abstractC0205v2, j));
                        i12 += Y6;
                    }
                    m2 = this;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        int i18 = unsafe.getInt(abstractC0205v2, j);
                        a05 = C0196l.a0(i13);
                        c03 = C0196l.b0(i18);
                        Y6 = c03 + a05;
                        i12 += Y6;
                    }
                    m2 = this;
                    break;
                case 12:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        int i19 = unsafe.getInt(abstractC0205v2, j);
                        a05 = C0196l.a0(i13);
                        c03 = C0196l.c0(i19);
                        Y6 = c03 + a05;
                        i12 += Y6;
                    }
                    m2 = this;
                    break;
                case 13:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        a03 = C0196l.a0(i13);
                        a07 = a03 + 4;
                        i12 += a07;
                    }
                    m2 = this;
                    abstractC0205v2 = abstractC0205v;
                    break;
                case 14:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        a06 = C0196l.a0(i13);
                        a07 = a06 + 8;
                        i12 += a07;
                    }
                    m2 = this;
                    abstractC0205v2 = abstractC0205v;
                    break;
                case 15:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        int i20 = unsafe.getInt(abstractC0205v2, j);
                        a05 = C0196l.a0(i13);
                        c03 = C0196l.b0((i20 >> 31) ^ (i20 << 1));
                        Y6 = c03 + a05;
                        i12 += Y6;
                    }
                    m2 = this;
                    break;
                case 16:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        long j9 = unsafe.getLong(abstractC0205v2, j);
                        a04 = C0196l.a0(i13);
                        c02 = C0196l.c0((j9 << 1) ^ (j9 >> 63));
                        i12 += c02 + a04;
                    }
                    m2 = this;
                    break;
                case 17:
                    if (m2.o(abstractC0205v2, i10, i9, i11, i2)) {
                        AbstractC0185a abstractC0185a = (AbstractC0185a) unsafe.getObject(abstractC0205v2, j);
                        V m8 = m2.m(i10);
                        a08 = C0196l.a0(i13) * 2;
                        a7 = abstractC0185a.a(m8);
                        c7 = a7 + a08;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c7 = W.c(i13, (List) unsafe.getObject(abstractC0205v2, j));
                    i12 += c7;
                    break;
                case 19:
                    c7 = W.b(i13, (List) unsafe.getObject(abstractC0205v2, j));
                    i12 += c7;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls2 = W.f3464a;
                    if (list.size() != 0) {
                        a09 = (C0196l.a0(i13) * list.size()) + W.e(list);
                        i12 += a09;
                        break;
                    }
                    a09 = 0;
                    i12 += a09;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls3 = W.f3464a;
                    size = list2.size();
                    if (size != 0) {
                        i5 = W.i(list2);
                        a010 = C0196l.a0(i13);
                        a09 = (a010 * size) + i5;
                        i12 += a09;
                        break;
                    }
                    a09 = 0;
                    i12 += a09;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls4 = W.f3464a;
                    size = list3.size();
                    if (size != 0) {
                        i5 = W.d(list3);
                        a010 = C0196l.a0(i13);
                        a09 = (a010 * size) + i5;
                        i12 += a09;
                        break;
                    }
                    a09 = 0;
                    i12 += a09;
                case 23:
                    c7 = W.c(i13, (List) unsafe.getObject(abstractC0205v2, j));
                    i12 += c7;
                    break;
                case 24:
                    c7 = W.b(i13, (List) unsafe.getObject(abstractC0205v2, j));
                    i12 += c7;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls5 = W.f3464a;
                    int size3 = list4.size();
                    i12 += size3 == 0 ? 0 : (C0196l.a0(i13) + 1) * size3;
                    break;
                case com.onesignal.debug.internal.crash.f.MIN_SDK_VERSION /* 26 */:
                    List list5 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls6 = W.f3464a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        a09 = C0196l.a0(i13) * size4;
                        for (int i21 = 0; i21 < size4; i21++) {
                            Object obj = list5.get(i21);
                            if (obj instanceof C0191g) {
                                int size5 = ((C0191g) obj).size();
                                a09 = C0196l.b0(size5) + size5 + a09;
                            } else {
                                a09 = C0196l.Z((String) obj) + a09;
                            }
                        }
                        i12 += a09;
                        break;
                    }
                    a09 = 0;
                    i12 += a09;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC0205v2, j);
                    V m9 = m2.m(i10);
                    Class cls7 = W.f3464a;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        a011 = C0196l.a0(i13) * size6;
                        for (int i22 = 0; i22 < size6; i22++) {
                            int a9 = ((AbstractC0185a) list6.get(i22)).a(m9);
                            a011 += C0196l.b0(a9) + a9;
                        }
                        i12 += a011;
                        break;
                    }
                    a011 = 0;
                    i12 += a011;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls8 = W.f3464a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        a09 = C0196l.a0(i13) * size7;
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int size8 = ((C0191g) list7.get(i23)).size();
                            a09 += C0196l.b0(size8) + size8;
                        }
                        i12 += a09;
                        break;
                    }
                    a09 = 0;
                    i12 += a09;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls9 = W.f3464a;
                    size = list8.size();
                    if (size != 0) {
                        i5 = W.h(list8);
                        a010 = C0196l.a0(i13);
                        a09 = (a010 * size) + i5;
                        i12 += a09;
                        break;
                    }
                    a09 = 0;
                    i12 += a09;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls10 = W.f3464a;
                    size = list9.size();
                    if (size != 0) {
                        i5 = W.a(list9);
                        a010 = C0196l.a0(i13);
                        a09 = (a010 * size) + i5;
                        i12 += a09;
                        break;
                    }
                    a09 = 0;
                    i12 += a09;
                case 31:
                    c7 = W.b(i13, (List) unsafe.getObject(abstractC0205v2, j));
                    i12 += c7;
                    break;
                case 32:
                    c7 = W.c(i13, (List) unsafe.getObject(abstractC0205v2, j));
                    i12 += c7;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls11 = W.f3464a;
                    size = list10.size();
                    if (size != 0) {
                        i5 = W.f(list10);
                        a010 = C0196l.a0(i13);
                        a09 = (a010 * size) + i5;
                        i12 += a09;
                        break;
                    }
                    a09 = 0;
                    i12 += a09;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls12 = W.f3464a;
                    size = list11.size();
                    if (size != 0) {
                        i5 = W.g(list11);
                        a010 = C0196l.a0(i13);
                        a09 = (a010 * size) + i5;
                        i12 += a09;
                        break;
                    }
                    a09 = 0;
                    i12 += a09;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls13 = W.f3464a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls14 = W.f3464a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = W.e((List) unsafe.getObject(abstractC0205v2, j));
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = W.i((List) unsafe.getObject(abstractC0205v2, j));
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = W.d((List) unsafe.getObject(abstractC0205v2, j));
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NETWORK_FAILURE /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls15 = W.f3464a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    List list15 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls16 = W.f3464a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls17 = W.f3464a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = W.h((List) unsafe.getObject(abstractC0205v2, j));
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = W.a((List) unsafe.getObject(abstractC0205v2, j));
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls18 = W.f3464a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0205v2, j);
                    Class cls19 = W.f3464a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = W.f((List) unsafe.getObject(abstractC0205v2, j));
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = W.g((List) unsafe.getObject(abstractC0205v2, j));
                    if (size2 > 0) {
                        a012 = C0196l.a0(i13);
                        b02 = C0196l.b0(size2);
                        i7 = b02 + a012;
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0205v2, j);
                    V m10 = m2.m(i10);
                    Class cls20 = W.f3464a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i8 = 0;
                    } else {
                        i8 = 0;
                        for (int i24 = 0; i24 < size9; i24++) {
                            i8 += ((AbstractC0185a) list19.get(i24)).a(m10) + (C0196l.a0(i13) * 2);
                        }
                    }
                    i12 += i8;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(abstractC0205v2, j);
                    Object obj2 = m2.f3438b[(i10 / 3) * 2];
                    m2.f3448m.getClass();
                    H h7 = (H) object3;
                    G g7 = (G) obj2;
                    if (!h7.isEmpty()) {
                        a011 = 0;
                        for (Map.Entry entry : h7.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            g7.getClass();
                            int a015 = C0196l.a0(i13);
                            int a10 = G.a(g7.f3428a, key, value);
                            a011 += C0196l.b0(a10) + a10 + a015;
                        }
                        i12 += a011;
                        break;
                    }
                    a011 = 0;
                    i12 += a011;
                case 51:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        a02 = C0196l.a0(i13);
                        c7 = a02 + 8;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        a013 = C0196l.a0(i13);
                        c7 = a013 + 4;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        long z7 = z(j, abstractC0205v2);
                        size2 = C0196l.a0(i13);
                        i7 = C0196l.c0(z7);
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        long z8 = z(j, abstractC0205v2);
                        size2 = C0196l.a0(i13);
                        i7 = C0196l.c0(z8);
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        int y7 = y(j, abstractC0205v2);
                        a08 = C0196l.a0(i13);
                        a7 = C0196l.c0(y7);
                        c7 = a7 + a08;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        a02 = C0196l.a0(i13);
                        c7 = a02 + 8;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        a013 = C0196l.a0(i13);
                        c7 = a013 + 4;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        c7 = C0196l.a0(i13) + 1;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        Object object4 = unsafe.getObject(abstractC0205v2, j);
                        i12 = (object4 instanceof C0191g ? C0196l.Y(i13, (C0191g) object4) : C0196l.Z((String) object4) + C0196l.a0(i13)) + i12;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        Object object5 = unsafe.getObject(abstractC0205v2, j);
                        V m11 = m2.m(i10);
                        Class cls21 = W.f3464a;
                        int a016 = C0196l.a0(i13);
                        int a11 = ((AbstractC0185a) object5).a(m11);
                        b03 = C0196l.b0(a11) + a11 + a016;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        c7 = C0196l.Y(i13, (C0191g) unsafe.getObject(abstractC0205v2, j));
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        int y8 = y(j, abstractC0205v2);
                        a08 = C0196l.a0(i13);
                        a7 = C0196l.b0(y8);
                        c7 = a7 + a08;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        int y9 = y(j, abstractC0205v2);
                        a08 = C0196l.a0(i13);
                        a7 = C0196l.c0(y9);
                        c7 = a7 + a08;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        a013 = C0196l.a0(i13);
                        c7 = a013 + 4;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        a02 = C0196l.a0(i13);
                        c7 = a02 + 8;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        int y10 = y(j, abstractC0205v2);
                        a08 = C0196l.a0(i13);
                        a7 = C0196l.b0((y10 >> 31) ^ (y10 << 1));
                        c7 = a7 + a08;
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        long z9 = z(j, abstractC0205v2);
                        size2 = C0196l.a0(i13);
                        i7 = C0196l.c0((z9 << 1) ^ (z9 >> 63));
                        b03 = i7 + size2;
                        i12 += b03;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m2.q(abstractC0205v2, i13, i10)) {
                        c7 = ((AbstractC0185a) unsafe.getObject(abstractC0205v2, j)).a(m2.m(i10)) + (C0196l.a0(i13) * 2);
                        i12 += c7;
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0205v i() {
        this.j.getClass();
        return ((AbstractC0205v) this.f3441e).i();
    }

    public final boolean j(AbstractC0205v abstractC0205v, AbstractC0205v abstractC0205v2, int i2) {
        return n(i2, abstractC0205v) == n(i2, abstractC0205v2);
    }

    public final void k(Object obj, int i2, Object obj2) {
        int i5 = this.f3437a[i2];
        if (i0.f3519c.h(L(i2) & 1048575, obj) == null) {
            return;
        }
        l(i2);
    }

    public final void l(int i2) {
        if (this.f3438b[((i2 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final V m(int i2) {
        int i5 = (i2 / 3) * 2;
        Object[] objArr = this.f3438b;
        V v7 = (V) objArr[i5];
        if (v7 != null) {
            return v7;
        }
        V a7 = S.f3454c.a((Class) objArr[i5 + 1]);
        objArr[i5] = a7;
        return a7;
    }

    public final boolean n(int i2, Object obj) {
        int i5 = this.f3437a[i2 + 2];
        long j = i5 & 1048575;
        if (j == 1048575) {
            int L7 = L(i2);
            long j7 = L7 & 1048575;
            switch (K(L7)) {
                case 0:
                    if (Double.doubleToRawLongBits(i0.f3519c.d(j7, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(i0.f3519c.e(j7, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (i0.f3519c.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (i0.f3519c.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (i0.f3519c.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (i0.f3519c.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (i0.f3519c.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    return i0.f3519c.c(j7, obj);
                case S.j.BYTES_FIELD_NUMBER /* 8 */:
                    Object h7 = i0.f3519c.h(j7, obj);
                    if (h7 instanceof String) {
                        return !((String) h7).isEmpty();
                    }
                    if (h7 instanceof C0191g) {
                        return !C0191g.f3498i.equals(h7);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (i0.f3519c.h(j7, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0191g.f3498i.equals(i0.f3519c.h(j7, obj));
                case RequestError.STOP_TRACKING /* 11 */:
                    if (i0.f3519c.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (i0.f3519c.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (i0.f3519c.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (i0.f3519c.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (i0.f3519c.f(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (i0.f3519c.g(j7, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (i0.f3519c.h(j7, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & i0.f3519c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i2, int i5, int i7, int i8) {
        return i5 == 1048575 ? n(i2, obj) : (i7 & i8) != 0;
    }

    public final boolean q(Object obj, int i2, int i5) {
        return i0.f3519c.f((long) (this.f3437a[i5 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i2, Object obj2, C0198n c0198n, C0194j c0194j) {
        long L7 = L(i2) & 1048575;
        Object h7 = i0.f3519c.h(L7, obj);
        I i5 = this.f3448m;
        if (h7 == null) {
            i5.getClass();
            h7 = H.f3430e.b();
            i0.o(L7, obj, h7);
        } else {
            i5.getClass();
            if (!((H) h7).f3431d) {
                H b7 = H.f3430e.b();
                I.a(b7, h7);
                i0.o(L7, obj, b7);
                h7 = b7;
            }
        }
        i5.getClass();
        H h8 = (H) h7;
        F f7 = ((G) obj2).f3428a;
        c0194j.x(2);
        B6.c cVar = (B6.c) c0194j.f3527d;
        int e7 = cVar.e(cVar.v());
        Object obj3 = f7.f3427c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a7 = c0194j.a();
                if (a7 == Integer.MAX_VALUE || cVar.c()) {
                    break;
                }
                if (a7 == 1) {
                    obj4 = c0194j.i(f7.f3425a, null, null);
                } else if (a7 != 2) {
                    try {
                        if (!c0194j.y()) {
                            throw new C0209z("Unable to parse map entry.");
                        }
                    } catch (C0208y unused) {
                        if (!c0194j.y()) {
                            throw new C0209z("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = c0194j.i(f7.f3426b, obj3.getClass(), c0198n);
                }
            } catch (Throwable th) {
                cVar.d(e7);
                throw th;
            }
        }
    }

    public final void s(Object obj, int i2, Object obj2) {
        if (n(i2, obj2)) {
            long L7 = L(i2) & 1048575;
            Unsafe unsafe = f3436o;
            Object object = unsafe.getObject(obj2, L7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f3437a[i2] + " is present but null: " + obj2);
            }
            V m2 = m(i2);
            if (!n(i2, obj)) {
                if (p(object)) {
                    AbstractC0205v i5 = m2.i();
                    m2.a(i5, object);
                    unsafe.putObject(obj, L7, i5);
                } else {
                    unsafe.putObject(obj, L7, object);
                }
                G(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L7);
            if (!p(object2)) {
                AbstractC0205v i7 = m2.i();
                m2.a(i7, object2);
                unsafe.putObject(obj, L7, i7);
                object2 = i7;
            }
            m2.a(object2, object);
        }
    }

    public final void t(Object obj, int i2, Object obj2) {
        int[] iArr = this.f3437a;
        int i5 = iArr[i2];
        if (q(obj2, i5, i2)) {
            long L7 = L(i2) & 1048575;
            Unsafe unsafe = f3436o;
            Object object = unsafe.getObject(obj2, L7);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2);
            }
            V m2 = m(i2);
            if (!q(obj, i5, i2)) {
                if (p(object)) {
                    AbstractC0205v i7 = m2.i();
                    m2.a(i7, object);
                    unsafe.putObject(obj, L7, i7);
                } else {
                    unsafe.putObject(obj, L7, object);
                }
                H(obj, i5, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, L7);
            if (!p(object2)) {
                AbstractC0205v i8 = m2.i();
                m2.a(i8, object2);
                unsafe.putObject(obj, L7, i8);
                object2 = i8;
            }
            m2.a(object2, object);
        }
    }

    public final Object u(int i2, Object obj) {
        V m2 = m(i2);
        long L7 = L(i2) & 1048575;
        if (!n(i2, obj)) {
            return m2.i();
        }
        Object object = f3436o.getObject(obj, L7);
        if (p(object)) {
            return object;
        }
        AbstractC0205v i5 = m2.i();
        if (object != null) {
            m2.a(i5, object);
        }
        return i5;
    }

    public final Object v(Object obj, int i2, int i5) {
        V m2 = m(i5);
        if (!q(obj, i2, i5)) {
            return m2.i();
        }
        Object object = f3436o.getObject(obj, L(i5) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0205v i7 = m2.i();
        if (object != null) {
            m2.a(i7, object);
        }
        return i7;
    }
}
