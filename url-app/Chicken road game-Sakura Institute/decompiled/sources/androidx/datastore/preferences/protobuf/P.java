package androidx.datastore.preferences.protobuf;

import A.AbstractC0017m;
import A.C0020p;
import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import q.AbstractC1024c;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class P implements Z {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f5282o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f5283p = s0.m();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5284a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5285b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5286c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5287d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0434a f5288e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5289f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5290g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f5291h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5292i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5293j;

    /* renamed from: k, reason: collision with root package name */
    public final S f5294k;

    /* renamed from: l, reason: collision with root package name */
    public final F f5295l;

    /* renamed from: m, reason: collision with root package name */
    public final k0 f5296m;

    /* renamed from: n, reason: collision with root package name */
    public final L f5297n;

    public P(int[] iArr, Object[] objArr, int i2, int i4, AbstractC0434a abstractC0434a, boolean z4, int[] iArr2, int i5, int i6, S s4, F f4, k0 k0Var, C0450o c0450o, L l4) {
        this.f5284a = iArr;
        this.f5285b = objArr;
        this.f5286c = i2;
        this.f5287d = i4;
        this.f5289f = abstractC0434a instanceof AbstractC0456v;
        this.f5290g = z4;
        this.f5291h = iArr2;
        this.f5292i = i5;
        this.f5293j = i6;
        this.f5294k = s4;
        this.f5295l = f4;
        this.f5296m = k0Var;
        this.f5288e = abstractC0434a;
        this.f5297n = l4;
    }

    public static P A(Y y4, S s4, F f4, k0 k0Var, C0450o c0450o, L l4) {
        int i2;
        int charAt;
        int charAt2;
        int charAt3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        char charAt4;
        int i8;
        char charAt5;
        int i9;
        char charAt6;
        int i10;
        char charAt7;
        int i11;
        char charAt8;
        int i12;
        char charAt9;
        int i13;
        char charAt10;
        int i14;
        char charAt11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Field J3;
        char charAt12;
        int i26;
        int i27;
        int i28;
        Field J4;
        Field J5;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        int i32;
        char charAt16;
        int i33 = 0;
        boolean z4 = y4.d() == 2;
        String c4 = y4.c();
        int length = c4.length();
        if (c4.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i2 = i34 + 1;
                if (c4.charAt(i34) < 55296) {
                    break;
                }
                i34 = i2;
            }
        } else {
            i2 = 1;
        }
        int i35 = i2 + 1;
        int charAt17 = c4.charAt(i2);
        if (charAt17 >= 55296) {
            int i36 = charAt17 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                charAt16 = c4.charAt(i35);
                if (charAt16 < 55296) {
                    break;
                }
                i36 |= (charAt16 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            charAt17 = i36 | (charAt16 << i37);
            i35 = i32;
        }
        if (charAt17 == 0) {
            i6 = 0;
            charAt = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            iArr = f5282o;
            i5 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt18 = c4.charAt(i35);
            if (charAt18 >= 55296) {
                int i39 = charAt18 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    charAt11 = c4.charAt(i38);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i39 |= (charAt11 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                charAt18 = i39 | (charAt11 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int charAt19 = c4.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    charAt10 = c4.charAt(i41);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i42 |= (charAt10 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                charAt19 = i42 | (charAt10 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int charAt20 = c4.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    charAt9 = c4.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                charAt20 = i45 | (charAt9 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            charAt = c4.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    charAt8 = c4.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                charAt = i48 | (charAt8 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            int charAt21 = c4.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    charAt7 = c4.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                charAt21 = i51 | (charAt7 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            charAt2 = c4.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    charAt6 = c4.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                charAt2 = i54 | (charAt6 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int charAt22 = c4.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt5 = c4.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                charAt22 = i57 | (charAt5 << i58);
                i56 = i8;
            }
            int i59 = i56 + 1;
            charAt3 = c4.charAt(i56);
            if (charAt3 >= 55296) {
                int i60 = charAt3 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i7 = i61 + 1;
                    charAt4 = c4.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i61 = i7;
                }
                charAt3 = i60 | (charAt4 << i62);
                i59 = i7;
            }
            int[] iArr2 = new int[charAt3 + charAt2 + charAt22];
            i4 = (charAt18 * 2) + charAt19;
            i5 = charAt20;
            i6 = charAt21;
            iArr = iArr2;
            i33 = charAt18;
            i35 = i59;
        }
        Unsafe unsafe = f5283p;
        Object[] b4 = y4.b();
        Class<?> cls = y4.a().getClass();
        int[] iArr3 = new int[i6 * 3];
        Object[] objArr = new Object[i6 * 2];
        int i63 = charAt2 + charAt3;
        int i64 = i63;
        int i65 = charAt3;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int charAt23 = c4.charAt(i35);
            if (charAt23 >= 55296) {
                int i69 = charAt23 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    charAt15 = c4.charAt(i70);
                    i15 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i69 |= (charAt15 & 8191) << i71;
                    i71 += 13;
                    i70 = i31;
                    length = i15;
                }
                charAt23 = i69 | (charAt15 << i71);
                i16 = i31;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = i16 + 1;
            int charAt24 = c4.charAt(i16);
            if (charAt24 >= 55296) {
                int i73 = charAt24 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i30 = i74 + 1;
                    charAt14 = c4.charAt(i74);
                    i17 = i63;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i73 |= (charAt14 & 8191) << i75;
                    i75 += 13;
                    i74 = i30;
                    i63 = i17;
                }
                charAt24 = i73 | (charAt14 << i75);
                i18 = i30;
            } else {
                i17 = i63;
                i18 = i72;
            }
            int i76 = charAt24 & 255;
            int i77 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            if (i76 >= 51) {
                int i78 = i18 + 1;
                int charAt25 = c4.charAt(i18);
                if (charAt25 >= 55296) {
                    int i79 = charAt25 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i29 = i80 + 1;
                        charAt13 = c4.charAt(i80);
                        i19 = charAt;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i79 |= (charAt13 & 8191) << i81;
                        i81 += 13;
                        i80 = i29;
                        charAt = i19;
                    }
                    charAt25 = i79 | (charAt13 << i81);
                    i27 = i29;
                } else {
                    i19 = charAt;
                    i27 = i78;
                }
                int i82 = i76 - 51;
                int i83 = i27;
                if (i82 == 9 || i82 == 17) {
                    i28 = 2;
                    objArr[((i67 / 3) * 2) + 1] = b4[i4];
                    i4++;
                } else {
                    if (i82 == 12 && !z4) {
                        objArr[((i67 / 3) * 2) + 1] = b4[i4];
                        i4++;
                    }
                    i28 = 2;
                }
                int i84 = charAt25 * i28;
                Object obj = b4[i84];
                if (obj instanceof Field) {
                    J4 = (Field) obj;
                } else {
                    J4 = J(cls, (String) obj);
                    b4[i84] = J4;
                }
                int i85 = i4;
                i24 = (int) unsafe.objectFieldOffset(J4);
                int i86 = i84 + 1;
                Object obj2 = b4[i86];
                if (obj2 instanceof Field) {
                    J5 = (Field) obj2;
                } else {
                    J5 = J(cls, (String) obj2);
                    b4[i86] = J5;
                }
                i21 = (int) unsafe.objectFieldOffset(J5);
                i23 = 0;
                i20 = i5;
                i25 = i85;
                i22 = i83;
            } else {
                i19 = charAt;
                int i87 = i4 + 1;
                Field J6 = J(cls, (String) b4[i4]);
                i20 = i5;
                if (i76 == 9 || i76 == 17) {
                    objArr[((i67 / 3) * 2) + 1] = J6.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        i26 = i4 + 2;
                        objArr[((i67 / 3) * 2) + 1] = b4[i87];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        if (!z4) {
                            i26 = i4 + 2;
                            objArr[((i67 / 3) * 2) + 1] = b4[i87];
                        }
                    } else if (i76 == 50) {
                        int i88 = i65 + 1;
                        iArr[i65] = i67;
                        int i89 = (i67 / 3) * 2;
                        int i90 = i4 + 2;
                        objArr[i89] = b4[i87];
                        if ((charAt24 & 2048) != 0) {
                            i87 = i4 + 3;
                            objArr[i89 + 1] = b4[i90];
                            i65 = i88;
                        } else {
                            i65 = i88;
                            i87 = i90;
                        }
                    }
                    i87 = i26;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(J6);
                if ((charAt24 & 4096) != 4096 || i76 > 17) {
                    i21 = 1048575;
                    i22 = i18;
                    i23 = 0;
                } else {
                    int i91 = i18 + 1;
                    int charAt26 = c4.charAt(i18);
                    if (charAt26 >= 55296) {
                        int i92 = charAt26 & 8191;
                        int i93 = 13;
                        while (true) {
                            i22 = i91 + 1;
                            charAt12 = c4.charAt(i91);
                            if (charAt12 < 55296) {
                                break;
                            }
                            i92 |= (charAt12 & 8191) << i93;
                            i93 += 13;
                            i91 = i22;
                        }
                        charAt26 = i92 | (charAt12 << i93);
                    } else {
                        i22 = i91;
                    }
                    int i94 = (charAt26 / 32) + (i33 * 2);
                    Object obj3 = b4[i94];
                    if (obj3 instanceof Field) {
                        J3 = (Field) obj3;
                    } else {
                        J3 = J(cls, (String) obj3);
                        b4[i94] = J3;
                    }
                    i21 = (int) unsafe.objectFieldOffset(J3);
                    i23 = charAt26 % 32;
                }
                if (i76 >= 18 && i76 <= 49) {
                    iArr[i64] = objectFieldOffset;
                    i64++;
                }
                int i95 = i87;
                i24 = objectFieldOffset;
                i25 = i95;
            }
            int i96 = i67 + 1;
            iArr3[i67] = charAt23;
            int i97 = i67 + 2;
            String str = c4;
            iArr3[i96] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i76 << 20) | i24;
            i67 += 3;
            iArr3[i97] = (i23 << 20) | i21;
            i4 = i25;
            charAt3 = i77;
            c4 = str;
            i5 = i20;
            length = i15;
            i63 = i17;
            i35 = i22;
            charAt = i19;
        }
        return new P(iArr3, objArr, i5, charAt, y4.a(), z4, iArr, charAt3, i63, s4, f4, k0Var, c0450o, l4);
    }

    public static long B(int i2) {
        return i2 & 1048575;
    }

    public static int C(long j4, Object obj) {
        return ((Integer) s0.f5400c.i(j4, obj)).intValue();
    }

    public static long D(long j4, Object obj) {
        return ((Long) s0.f5400c.i(j4, obj)).longValue();
    }

    public static Field J(Class cls, String str) {
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

    public static int O(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static void S(int i2, Object obj, H h4) {
        if (!(obj instanceof String)) {
            h4.b(i2, (C0442g) obj);
        } else {
            ((C0447l) h4.f5272a).V(i2, (String) obj);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0456v) {
            return ((AbstractC0456v) obj).i();
        }
        return true;
    }

    public static List t(AbstractC0456v abstractC0456v, long j4) {
        return (List) s0.f5400c.i(j4, abstractC0456v);
    }

    public static P z(Y y4, S s4, F f4, k0 k0Var, C0450o c0450o, L l4) {
        if (y4 instanceof Y) {
            return A(y4, s4, f4, k0Var, c0450o, l4);
        }
        y4.getClass();
        throw new ClassCastException();
    }

    public final int E(int i2) {
        if (i2 < this.f5286c || i2 > this.f5287d) {
            return -1;
        }
        int[] iArr = this.f5284a;
        int length = (iArr.length / 3) - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int i7 = iArr[i6];
            if (i2 == i7) {
                return i6;
            }
            if (i2 < i7) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    public final void F(Object obj, long j4, C0020p c0020p, Z z4, C0449n c0449n) {
        int u4;
        List c4 = this.f5295l.c(j4, obj);
        int i2 = c0020p.f172b;
        if ((i2 & 7) != 3) {
            throw C0460z.b();
        }
        do {
            AbstractC0456v g4 = z4.g();
            c0020p.f(g4, z4, c0449n);
            z4.h(g4);
            c4.add(g4);
            AbstractC0445j abstractC0445j = (AbstractC0445j) c0020p.f175e;
            if (abstractC0445j.c() || c0020p.f174d != 0) {
                return;
            } else {
                u4 = abstractC0445j.u();
            }
        } while (u4 == i2);
        c0020p.f174d = u4;
    }

    public final void G(Object obj, int i2, C0020p c0020p, Z z4, C0449n c0449n) {
        int u4;
        List c4 = this.f5295l.c(i2 & 1048575, obj);
        int i4 = c0020p.f172b;
        if ((i4 & 7) != 2) {
            throw C0460z.b();
        }
        do {
            AbstractC0456v g4 = z4.g();
            c0020p.g(g4, z4, c0449n);
            z4.h(g4);
            c4.add(g4);
            AbstractC0445j abstractC0445j = (AbstractC0445j) c0020p.f175e;
            if (abstractC0445j.c() || c0020p.f174d != 0) {
                return;
            } else {
                u4 = abstractC0445j.u();
            }
        } while (u4 == i4);
        c0020p.f174d = u4;
    }

    public final void H(Object obj, int i2, C0020p c0020p) {
        if ((536870912 & i2) != 0) {
            c0020p.A(2);
            s0.s(i2 & 1048575, obj, ((AbstractC0445j) c0020p.f175e).t());
        } else if (!this.f5289f) {
            s0.s(i2 & 1048575, obj, c0020p.i());
        } else {
            c0020p.A(2);
            s0.s(i2 & 1048575, obj, ((AbstractC0445j) c0020p.f175e).s());
        }
    }

    public final void I(Object obj, int i2, C0020p c0020p) {
        boolean z4 = (536870912 & i2) != 0;
        F f4 = this.f5295l;
        if (z4) {
            c0020p.w(f4.c(i2 & 1048575, obj), true);
        } else {
            c0020p.w(f4.c(i2 & 1048575, obj), false);
        }
    }

    public final void K(int i2, Object obj) {
        int i4 = this.f5284a[i2 + 2];
        long j4 = 1048575 & i4;
        if (j4 == 1048575) {
            return;
        }
        s0.q((1 << (i4 >>> 20)) | s0.f5400c.g(j4, obj), j4, obj);
    }

    public final void L(int i2, int i4, Object obj) {
        s0.q(i2, this.f5284a[i4 + 2] & 1048575, obj);
    }

    public final void M(Object obj, int i2, AbstractC0434a abstractC0434a) {
        f5283p.putObject(obj, P(i2) & 1048575, abstractC0434a);
        K(i2, obj);
    }

    public final void N(Object obj, int i2, int i4, AbstractC0434a abstractC0434a) {
        f5283p.putObject(obj, P(i4) & 1048575, abstractC0434a);
        L(i2, i4, obj);
    }

    public final int P(int i2) {
        return this.f5284a[i2 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Q(Object obj, H h4) {
        int i2;
        boolean z4;
        int[] iArr = this.f5284a;
        int length = iArr.length;
        Unsafe unsafe = f5283p;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int P3 = P(i6);
            int i8 = iArr[i6];
            int O3 = O(P3);
            if (O3 <= 17) {
                int i9 = iArr[i6 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i2 = 1 << (i9 >>> 20);
            } else {
                i2 = 0;
            }
            int i11 = i2;
            long j4 = P3 & i4;
            switch (O3) {
                case 0:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.c(s0.f5400c.e(j4, obj), i8);
                        break;
                    }
                case 1:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.g(s0.f5400c.f(j4, obj), i8);
                        break;
                    }
                case 2:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.j(unsafe.getLong(obj, j4), i8);
                        break;
                    }
                case 3:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.q(unsafe.getLong(obj, j4), i8);
                        break;
                    }
                case 4:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.i(i8, unsafe.getInt(obj, j4));
                        break;
                    }
                case 5:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.f(unsafe.getLong(obj, j4), i8);
                        break;
                    }
                case 6:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.e(i8, unsafe.getInt(obj, j4));
                        break;
                    }
                case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.a(i8, s0.f5400c.c(j4, obj));
                        break;
                    }
                case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        S(i8, unsafe.getObject(obj, j4), h4);
                        break;
                    }
                case AbstractC1024c.f9242c /* 9 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.k(i8, unsafe.getObject(obj, j4), n(i6));
                        break;
                    }
                case 10:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.b(i8, (C0442g) unsafe.getObject(obj, j4));
                        break;
                    }
                case RequestError.STOP_TRACKING /* 11 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.p(i8, unsafe.getInt(obj, j4));
                        break;
                    }
                case 12:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.d(i8, unsafe.getInt(obj, j4));
                        break;
                    }
                case 13:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.l(i8, unsafe.getInt(obj, j4));
                        break;
                    }
                case 14:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.m(unsafe.getLong(obj, j4), i8);
                        break;
                    }
                case AbstractC1024c.f9246g /* 15 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.n(i8, unsafe.getInt(obj, j4));
                        break;
                    }
                case 16:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.o(unsafe.getLong(obj, j4), i8);
                        break;
                    }
                case 17:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h4.h(i8, unsafe.getObject(obj, j4), n(i6));
                        break;
                    }
                case 18:
                    AbstractC0435a0.F(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 19:
                    AbstractC0435a0.J(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 20:
                    AbstractC0435a0.M(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 21:
                    AbstractC0435a0.U(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 22:
                    AbstractC0435a0.L(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 23:
                    AbstractC0435a0.I(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 24:
                    AbstractC0435a0.H(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 25:
                    AbstractC0435a0.D(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 26:
                    AbstractC0435a0.S(iArr[i6], (List) unsafe.getObject(obj, j4), h4);
                    break;
                case 27:
                    AbstractC0435a0.N(iArr[i6], (List) unsafe.getObject(obj, j4), h4, n(i6));
                    break;
                case 28:
                    AbstractC0435a0.E(iArr[i6], (List) unsafe.getObject(obj, j4), h4);
                    break;
                case 29:
                    z4 = false;
                    AbstractC0435a0.T(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 30:
                    z4 = false;
                    AbstractC0435a0.G(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 31:
                    z4 = false;
                    AbstractC0435a0.O(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 32:
                    z4 = false;
                    AbstractC0435a0.P(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 33:
                    z4 = false;
                    AbstractC0435a0.Q(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 34:
                    z4 = false;
                    AbstractC0435a0.R(iArr[i6], (List) unsafe.getObject(obj, j4), h4, false);
                    break;
                case 35:
                    AbstractC0435a0.F(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 36:
                    AbstractC0435a0.J(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 37:
                    AbstractC0435a0.M(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 38:
                    AbstractC0435a0.U(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 39:
                    AbstractC0435a0.L(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    AbstractC0435a0.I(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    AbstractC0435a0.H(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 42:
                    AbstractC0435a0.D(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 43:
                    AbstractC0435a0.T(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 44:
                    AbstractC0435a0.G(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 45:
                    AbstractC0435a0.O(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 46:
                    AbstractC0435a0.P(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 47:
                    AbstractC0435a0.Q(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 48:
                    AbstractC0435a0.R(iArr[i6], (List) unsafe.getObject(obj, j4), h4, true);
                    break;
                case 49:
                    AbstractC0435a0.K(iArr[i6], (List) unsafe.getObject(obj, j4), h4, n(i6));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    R(h4, i8, unsafe.getObject(obj, j4), i6);
                    break;
                case 51:
                    if (s(i8, i6, obj)) {
                        h4.c(((Double) s0.f5400c.i(j4, obj)).doubleValue(), i8);
                    }
                    break;
                case 52:
                    if (s(i8, i6, obj)) {
                        h4.g(((Float) s0.f5400c.i(j4, obj)).floatValue(), i8);
                    }
                    break;
                case 53:
                    if (s(i8, i6, obj)) {
                        h4.j(D(j4, obj), i8);
                    }
                    break;
                case 54:
                    if (s(i8, i6, obj)) {
                        h4.q(D(j4, obj), i8);
                    }
                    break;
                case 55:
                    if (s(i8, i6, obj)) {
                        h4.i(i8, C(j4, obj));
                    }
                    break;
                case 56:
                    if (s(i8, i6, obj)) {
                        h4.f(D(j4, obj), i8);
                    }
                    break;
                case 57:
                    if (s(i8, i6, obj)) {
                        h4.e(i8, C(j4, obj));
                    }
                    break;
                case 58:
                    if (s(i8, i6, obj)) {
                        h4.a(i8, ((Boolean) s0.f5400c.i(j4, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (s(i8, i6, obj)) {
                        S(i8, unsafe.getObject(obj, j4), h4);
                    }
                    break;
                case 60:
                    if (s(i8, i6, obj)) {
                        h4.k(i8, unsafe.getObject(obj, j4), n(i6));
                    }
                    break;
                case 61:
                    if (s(i8, i6, obj)) {
                        h4.b(i8, (C0442g) unsafe.getObject(obj, j4));
                    }
                    break;
                case 62:
                    if (s(i8, i6, obj)) {
                        h4.p(i8, C(j4, obj));
                    }
                    break;
                case 63:
                    if (s(i8, i6, obj)) {
                        h4.d(i8, C(j4, obj));
                    }
                    break;
                case 64:
                    if (s(i8, i6, obj)) {
                        h4.l(i8, C(j4, obj));
                    }
                    break;
                case 65:
                    if (s(i8, i6, obj)) {
                        h4.m(D(j4, obj), i8);
                    }
                    break;
                case 66:
                    if (s(i8, i6, obj)) {
                        h4.n(i8, C(j4, obj));
                    }
                    break;
                case 67:
                    if (s(i8, i6, obj)) {
                        h4.o(D(j4, obj), i8);
                    }
                    break;
                case 68:
                    if (s(i8, i6, obj)) {
                        h4.h(i8, unsafe.getObject(obj, j4), n(i6));
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        this.f5296m.getClass();
        ((AbstractC0456v) obj).unknownFields.d(h4);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(H h4, int i2, Object obj, int i4) {
        int H3;
        int a4;
        int F3;
        y0 y0Var;
        int a5;
        int F4;
        int i5 = 2;
        if (obj != null) {
            Object m4 = m(i4);
            this.f5297n.getClass();
            I i6 = ((J) m4).f5276a;
            C0447l c0447l = (C0447l) h4.f5272a;
            c0447l.getClass();
            for (Map.Entry entry : ((K) obj).entrySet()) {
                c0447l.X(i2, i5);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i7 = C0452q.f5387c;
                int D3 = C0447l.D(1);
                x0 x0Var = A0.f5251j;
                w0 w0Var = i6.f5273a;
                if (w0Var == x0Var) {
                    D3 *= i5;
                }
                int i8 = 8;
                switch (w0Var.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        H3 = 8;
                        int i9 = H3 + D3;
                        int D4 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                            D4 *= 2;
                        }
                        switch (y0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0447l.Z(i8 + D4 + i9);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key2);
                                C0452q.b(c0447l, y0Var, 2, value2);
                                i5 = 2;
                            case 1:
                                ((Float) value).getClass();
                                i8 = 4;
                                c0447l.Z(i8 + D4 + i9);
                                Object key22 = entry.getKey();
                                Object value22 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key22);
                                C0452q.b(c0447l, y0Var, 2, value22);
                                i5 = 2;
                            case 2:
                                i8 = C0447l.H(((Long) value).longValue());
                                c0447l.Z(i8 + D4 + i9);
                                Object key222 = entry.getKey();
                                Object value222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key222);
                                C0452q.b(c0447l, y0Var, 2, value222);
                                i5 = 2;
                            case 3:
                                i8 = C0447l.H(((Long) value).longValue());
                                c0447l.Z(i8 + D4 + i9);
                                Object key2222 = entry.getKey();
                                Object value2222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key2222);
                                C0452q.b(c0447l, y0Var, 2, value2222);
                                i5 = 2;
                            case 4:
                                i8 = C0447l.v(((Integer) value).intValue());
                                c0447l.Z(i8 + D4 + i9);
                                Object key22222 = entry.getKey();
                                Object value22222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key22222);
                                C0452q.b(c0447l, y0Var, 2, value22222);
                                i5 = 2;
                            case 5:
                                ((Long) value).getClass();
                                c0447l.Z(i8 + D4 + i9);
                                Object key222222 = entry.getKey();
                                Object value222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key222222);
                                C0452q.b(c0447l, y0Var, 2, value222222);
                                i5 = 2;
                            case 6:
                                ((Integer) value).getClass();
                                i8 = 4;
                                c0447l.Z(i8 + D4 + i9);
                                Object key2222222 = entry.getKey();
                                Object value2222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key2222222);
                                C0452q.b(c0447l, y0Var, 2, value2222222);
                                i5 = 2;
                            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                ((Boolean) value).getClass();
                                i8 = 1;
                                c0447l.Z(i8 + D4 + i9);
                                Object key22222222 = entry.getKey();
                                Object value22222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key22222222);
                                C0452q.b(c0447l, y0Var, 2, value22222222);
                                i5 = 2;
                            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                                i8 = value instanceof C0442g ? C0447l.n((C0442g) value) : C0447l.C((String) value);
                                c0447l.Z(i8 + D4 + i9);
                                Object key222222222 = entry.getKey();
                                Object value222222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key222222222);
                                C0452q.b(c0447l, y0Var, 2, value222222222);
                                i5 = 2;
                            case AbstractC1024c.f9242c /* 9 */:
                                i8 = ((AbstractC0456v) ((AbstractC0434a) value)).a(null);
                                c0447l.Z(i8 + D4 + i9);
                                Object key2222222222 = entry.getKey();
                                Object value2222222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key2222222222);
                                C0452q.b(c0447l, y0Var, 2, value2222222222);
                                i5 = 2;
                            case 10:
                                a5 = ((AbstractC0456v) ((AbstractC0434a) value)).a(null);
                                F4 = C0447l.F(a5);
                                i8 = F4 + a5;
                                c0447l.Z(i8 + D4 + i9);
                                Object key22222222222 = entry.getKey();
                                Object value22222222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key22222222222);
                                C0452q.b(c0447l, y0Var, 2, value22222222222);
                                i5 = 2;
                            case RequestError.STOP_TRACKING /* 11 */:
                                if (value instanceof C0442g) {
                                    i8 = C0447l.n((C0442g) value);
                                    c0447l.Z(i8 + D4 + i9);
                                    Object key222222222222 = entry.getKey();
                                    Object value222222222222 = entry.getValue();
                                    C0452q.b(c0447l, w0Var, 1, key222222222222);
                                    C0452q.b(c0447l, y0Var, 2, value222222222222);
                                    i5 = 2;
                                } else {
                                    a5 = ((byte[]) value).length;
                                    F4 = C0447l.F(a5);
                                    i8 = F4 + a5;
                                    c0447l.Z(i8 + D4 + i9);
                                    Object key2222222222222 = entry.getKey();
                                    Object value2222222222222 = entry.getValue();
                                    C0452q.b(c0447l, w0Var, 1, key2222222222222);
                                    C0452q.b(c0447l, y0Var, 2, value2222222222222);
                                    i5 = 2;
                                }
                            case 12:
                                i8 = C0447l.F(((Integer) value).intValue());
                                c0447l.Z(i8 + D4 + i9);
                                Object key22222222222222 = entry.getKey();
                                Object value22222222222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key22222222222222);
                                C0452q.b(c0447l, y0Var, 2, value22222222222222);
                                i5 = 2;
                            case 13:
                                i8 = C0447l.v(((Integer) value).intValue());
                                c0447l.Z(i8 + D4 + i9);
                                Object key222222222222222 = entry.getKey();
                                Object value222222222222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key222222222222222);
                                C0452q.b(c0447l, y0Var, 2, value222222222222222);
                                i5 = 2;
                            case 14:
                                ((Integer) value).getClass();
                                i8 = 4;
                                c0447l.Z(i8 + D4 + i9);
                                Object key2222222222222222 = entry.getKey();
                                Object value2222222222222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key2222222222222222);
                                C0452q.b(c0447l, y0Var, 2, value2222222222222222);
                                i5 = 2;
                            case AbstractC1024c.f9246g /* 15 */:
                                ((Long) value).getClass();
                                c0447l.Z(i8 + D4 + i9);
                                Object key22222222222222222 = entry.getKey();
                                Object value22222222222222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key22222222222222222);
                                C0452q.b(c0447l, y0Var, 2, value22222222222222222);
                                i5 = 2;
                            case 16:
                                int intValue = ((Integer) value).intValue();
                                i8 = C0447l.F((intValue >> 31) ^ (intValue << 1));
                                c0447l.Z(i8 + D4 + i9);
                                Object key222222222222222222 = entry.getKey();
                                Object value222222222222222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key222222222222222222);
                                C0452q.b(c0447l, y0Var, 2, value222222222222222222);
                                i5 = 2;
                            case 17:
                                long longValue = ((Long) value).longValue();
                                i8 = C0447l.H((longValue >> 63) ^ (longValue << 1));
                                c0447l.Z(i8 + D4 + i9);
                                Object key2222222222222222222 = entry.getKey();
                                Object value2222222222222222222 = entry.getValue();
                                C0452q.b(c0447l, w0Var, 1, key2222222222222222222);
                                C0452q.b(c0447l, y0Var, 2, value2222222222222222222);
                                i5 = 2;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    case 1:
                        ((Float) key).getClass();
                        H3 = 4;
                        int i92 = H3 + D3;
                        int D42 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 2:
                        H3 = C0447l.H(((Long) key).longValue());
                        int i922 = H3 + D3;
                        int D422 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 3:
                        H3 = C0447l.H(((Long) key).longValue());
                        int i9222 = H3 + D3;
                        int D4222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 4:
                        H3 = C0447l.v(((Integer) key).intValue());
                        int i92222 = H3 + D3;
                        int D42222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 5:
                        ((Long) key).getClass();
                        H3 = 8;
                        int i922222 = H3 + D3;
                        int D422222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 6:
                        ((Integer) key).getClass();
                        H3 = 4;
                        int i9222222 = H3 + D3;
                        int D4222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) key).getClass();
                        H3 = 1;
                        int i92222222 = H3 + D3;
                        int D42222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                        H3 = key instanceof C0442g ? C0447l.n((C0442g) key) : C0447l.C((String) key);
                        int i922222222 = H3 + D3;
                        int D422222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case AbstractC1024c.f9242c /* 9 */:
                        H3 = ((AbstractC0456v) ((AbstractC0434a) key)).a(null);
                        int i9222222222 = H3 + D3;
                        int D4222222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 10:
                        a4 = ((AbstractC0456v) ((AbstractC0434a) key)).a(null);
                        F3 = C0447l.F(a4);
                        H3 = a4 + F3;
                        int i92222222222 = H3 + D3;
                        int D42222222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (key instanceof C0442g) {
                            H3 = C0447l.n((C0442g) key);
                            int i922222222222 = H3 + D3;
                            int D422222222222 = C0447l.D(2);
                            y0Var = i6.f5274b;
                            if (y0Var == x0Var) {
                            }
                            switch (y0Var.ordinal()) {
                            }
                        } else {
                            a4 = ((byte[]) key).length;
                            F3 = C0447l.F(a4);
                            H3 = a4 + F3;
                            int i9222222222222 = H3 + D3;
                            int D4222222222222 = C0447l.D(2);
                            y0Var = i6.f5274b;
                            if (y0Var == x0Var) {
                            }
                            switch (y0Var.ordinal()) {
                            }
                        }
                    case 12:
                        H3 = C0447l.F(((Integer) key).intValue());
                        int i92222222222222 = H3 + D3;
                        int D42222222222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 13:
                        H3 = C0447l.v(((Integer) key).intValue());
                        int i922222222222222 = H3 + D3;
                        int D422222222222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 14:
                        ((Integer) key).getClass();
                        H3 = 4;
                        int i9222222222222222 = H3 + D3;
                        int D4222222222222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case AbstractC1024c.f9246g /* 15 */:
                        ((Long) key).getClass();
                        H3 = 8;
                        int i92222222222222222 = H3 + D3;
                        int D42222222222222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 16:
                        int intValue2 = ((Integer) key).intValue();
                        H3 = C0447l.F((intValue2 >> 31) ^ (intValue2 << 1));
                        int i922222222222222222 = H3 + D3;
                        int D422222222222222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 17:
                        long longValue2 = ((Long) key).longValue();
                        H3 = C0447l.H((longValue2 << 1) ^ (longValue2 >> 63));
                        int i9222222222222222222 = H3 + D3;
                        int D4222222222222222222 = C0447l.D(2);
                        y0Var = i6.f5274b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final boolean a(Object obj) {
        int i2 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z4 = true;
            if (i4 >= this.f5292i) {
                return true;
            }
            int i6 = this.f5291h[i4];
            int[] iArr = this.f5284a;
            int i7 = iArr[i6];
            int P3 = P(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i2) {
                if (i9 != 1048575) {
                    i5 = f5283p.getInt(obj, i9);
                }
                i2 = i9;
            }
            if ((268435456 & P3) != 0) {
                if (!(i2 == 1048575 ? q(i6, obj) : (i5 & i10) != 0)) {
                    return false;
                }
            }
            int O3 = O(P3);
            if (O3 == 9 || O3 == 17) {
                if (i2 == 1048575) {
                    z4 = q(i6, obj);
                } else if ((i10 & i5) == 0) {
                    z4 = false;
                }
                if (z4) {
                    if (!n(i6).a(s0.f5400c.i(P3 & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                if (O3 != 27) {
                    if (O3 == 60 || O3 == 68) {
                        if (s(i7, i6, obj)) {
                            if (!n(i6).a(s0.f5400c.i(P3 & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (O3 != 49) {
                        if (O3 != 50) {
                            continue;
                        } else {
                            Object i11 = s0.f5400c.i(P3 & 1048575, obj);
                            this.f5297n.getClass();
                            K k4 = (K) i11;
                            if (!k4.isEmpty() && ((J) m(i6)).f5276a.f5274b.f5254d == B0.MESSAGE) {
                                Z z5 = null;
                                for (Object obj2 : k4.values()) {
                                    if (z5 == null) {
                                        z5 = W.f5303c.a(obj2.getClass());
                                    }
                                    if (!z5.a(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) s0.f5400c.i(P3 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    Z n2 = n(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!n2.a(list.get(i12))) {
                            return false;
                        }
                    }
                }
            }
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void b(Object obj, Object obj2) {
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f5284a;
            if (i2 >= iArr.length) {
                AbstractC0435a0.B(this.f5296m, obj, obj2);
                return;
            }
            int P3 = P(i2);
            long j4 = 1048575 & P3;
            int i4 = iArr[i2];
            switch (O(P3)) {
                case 0:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        r0 r0Var = s0.f5400c;
                        r0Var.m(obj, j4, r0Var.e(j4, obj2));
                        K(i2, obj);
                        break;
                    }
                case 1:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        r0 r0Var2 = s0.f5400c;
                        r0Var2.n(obj, j4, r0Var2.f(j4, obj2));
                        K(i2, obj);
                        break;
                    }
                case 2:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.r(obj, j4, s0.f5400c.h(j4, obj2));
                        K(i2, obj);
                        break;
                    }
                case 3:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.r(obj, j4, s0.f5400c.h(j4, obj2));
                        K(i2, obj);
                        break;
                    }
                case 4:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5400c.g(j4, obj2), j4, obj);
                        K(i2, obj);
                        break;
                    }
                case 5:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.r(obj, j4, s0.f5400c.h(j4, obj2));
                        K(i2, obj);
                        break;
                    }
                case 6:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5400c.g(j4, obj2), j4, obj);
                        K(i2, obj);
                        break;
                    }
                case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        r0 r0Var3 = s0.f5400c;
                        r0Var3.k(obj, j4, r0Var3.c(j4, obj2));
                        K(i2, obj);
                        break;
                    }
                case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.s(j4, obj, s0.f5400c.i(j4, obj2));
                        K(i2, obj);
                        break;
                    }
                case AbstractC1024c.f9242c /* 9 */:
                    v(obj, i2, obj2);
                    break;
                case 10:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.s(j4, obj, s0.f5400c.i(j4, obj2));
                        K(i2, obj);
                        break;
                    }
                case RequestError.STOP_TRACKING /* 11 */:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5400c.g(j4, obj2), j4, obj);
                        K(i2, obj);
                        break;
                    }
                case 12:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5400c.g(j4, obj2), j4, obj);
                        K(i2, obj);
                        break;
                    }
                case 13:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5400c.g(j4, obj2), j4, obj);
                        K(i2, obj);
                        break;
                    }
                case 14:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.r(obj, j4, s0.f5400c.h(j4, obj2));
                        K(i2, obj);
                        break;
                    }
                case AbstractC1024c.f9246g /* 15 */:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5400c.g(j4, obj2), j4, obj);
                        K(i2, obj);
                        break;
                    }
                case 16:
                    if (!q(i2, obj2)) {
                        break;
                    } else {
                        s0.r(obj, j4, s0.f5400c.h(j4, obj2));
                        K(i2, obj);
                        break;
                    }
                case 17:
                    v(obj, i2, obj2);
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
                    this.f5295l.b(j4, obj, obj2);
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = AbstractC0435a0.f5313a;
                    r0 r0Var4 = s0.f5400c;
                    Object i5 = r0Var4.i(j4, obj);
                    Object i6 = r0Var4.i(j4, obj2);
                    this.f5297n.getClass();
                    s0.s(j4, obj, L.b(i5, i6));
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
                    if (!s(i4, i2, obj2)) {
                        break;
                    } else {
                        s0.s(j4, obj, s0.f5400c.i(j4, obj2));
                        L(i4, i2, obj);
                        break;
                    }
                case 60:
                    w(obj, i2, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!s(i4, i2, obj2)) {
                        break;
                    } else {
                        s0.s(j4, obj, s0.f5400c.i(j4, obj2));
                        L(i4, i2, obj);
                        break;
                    }
                case 68:
                    w(obj, i2, obj2);
                    break;
            }
            i2 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void c(Object obj, H h4) {
        h4.getClass();
        if (!this.f5290g) {
            Q(obj, h4);
            return;
        }
        int[] iArr = this.f5284a;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int P3 = P(i2);
            int i4 = iArr[i2];
            switch (O(P3)) {
                case 0:
                    if (q(i2, obj)) {
                        h4.c(s0.f5400c.e(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i2, obj)) {
                        h4.g(s0.f5400c.f(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i2, obj)) {
                        h4.j(s0.f5400c.h(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i2, obj)) {
                        h4.q(s0.f5400c.h(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i2, obj)) {
                        h4.i(i4, s0.f5400c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i2, obj)) {
                        h4.f(s0.f5400c.h(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i2, obj)) {
                        h4.e(i4, s0.f5400c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (q(i2, obj)) {
                        h4.a(i4, s0.f5400c.c(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (q(i2, obj)) {
                        S(i4, s0.f5400c.i(P3 & 1048575, obj), h4);
                        break;
                    } else {
                        break;
                    }
                case AbstractC1024c.f9242c /* 9 */:
                    if (q(i2, obj)) {
                        h4.k(i4, s0.f5400c.i(P3 & 1048575, obj), n(i2));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(i2, obj)) {
                        h4.b(i4, (C0442g) s0.f5400c.i(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case RequestError.STOP_TRACKING /* 11 */:
                    if (q(i2, obj)) {
                        h4.p(i4, s0.f5400c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i2, obj)) {
                        h4.d(i4, s0.f5400c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i2, obj)) {
                        h4.l(i4, s0.f5400c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i2, obj)) {
                        h4.m(s0.f5400c.h(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case AbstractC1024c.f9246g /* 15 */:
                    if (q(i2, obj)) {
                        h4.n(i4, s0.f5400c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i2, obj)) {
                        h4.o(s0.f5400c.h(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i2, obj)) {
                        h4.h(i4, s0.f5400c.i(P3 & 1048575, obj), n(i2));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    AbstractC0435a0.F(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 19:
                    AbstractC0435a0.J(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 20:
                    AbstractC0435a0.M(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 21:
                    AbstractC0435a0.U(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 22:
                    AbstractC0435a0.L(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 23:
                    AbstractC0435a0.I(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 24:
                    AbstractC0435a0.H(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 25:
                    AbstractC0435a0.D(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 26:
                    AbstractC0435a0.S(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4);
                    break;
                case 27:
                    AbstractC0435a0.N(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, n(i2));
                    break;
                case 28:
                    AbstractC0435a0.E(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4);
                    break;
                case 29:
                    AbstractC0435a0.T(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 30:
                    AbstractC0435a0.G(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 31:
                    AbstractC0435a0.O(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 32:
                    AbstractC0435a0.P(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 33:
                    AbstractC0435a0.Q(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 34:
                    AbstractC0435a0.R(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, false);
                    break;
                case 35:
                    AbstractC0435a0.F(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 36:
                    AbstractC0435a0.J(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 37:
                    AbstractC0435a0.M(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 38:
                    AbstractC0435a0.U(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 39:
                    AbstractC0435a0.L(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    AbstractC0435a0.I(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    AbstractC0435a0.H(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 42:
                    AbstractC0435a0.D(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 43:
                    AbstractC0435a0.T(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 44:
                    AbstractC0435a0.G(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 45:
                    AbstractC0435a0.O(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 46:
                    AbstractC0435a0.P(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 47:
                    AbstractC0435a0.Q(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 48:
                    AbstractC0435a0.R(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, true);
                    break;
                case 49:
                    AbstractC0435a0.K(iArr[i2], (List) s0.f5400c.i(P3 & 1048575, obj), h4, n(i2));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    R(h4, i4, s0.f5400c.i(P3 & 1048575, obj), i2);
                    break;
                case 51:
                    if (s(i4, i2, obj)) {
                        h4.c(((Double) s0.f5400c.i(P3 & 1048575, obj)).doubleValue(), i4);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i4, i2, obj)) {
                        h4.g(((Float) s0.f5400c.i(P3 & 1048575, obj)).floatValue(), i4);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i4, i2, obj)) {
                        h4.j(D(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i4, i2, obj)) {
                        h4.q(D(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i4, i2, obj)) {
                        h4.i(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i4, i2, obj)) {
                        h4.f(D(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i4, i2, obj)) {
                        h4.e(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i4, i2, obj)) {
                        h4.a(i4, ((Boolean) s0.f5400c.i(P3 & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i4, i2, obj)) {
                        S(i4, s0.f5400c.i(P3 & 1048575, obj), h4);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(i4, i2, obj)) {
                        h4.k(i4, s0.f5400c.i(P3 & 1048575, obj), n(i2));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i4, i2, obj)) {
                        h4.b(i4, (C0442g) s0.f5400c.i(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i4, i2, obj)) {
                        h4.p(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i4, i2, obj)) {
                        h4.d(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i4, i2, obj)) {
                        h4.l(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i4, i2, obj)) {
                        h4.m(D(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i4, i2, obj)) {
                        h4.n(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i4, i2, obj)) {
                        h4.o(D(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i4, i2, obj)) {
                        h4.h(i4, s0.f5400c.i(P3 & 1048575, obj), n(i2));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f5296m.getClass();
        ((AbstractC0456v) obj).unknownFields.d(h4);
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
    @Override // androidx.datastore.preferences.protobuf.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(AbstractC0456v abstractC0456v) {
        int i2;
        int b4;
        int i4;
        int[] iArr = this.f5284a;
        int length = iArr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int P3 = P(i6);
            int i7 = iArr[i6];
            long j4 = 1048575 & P3;
            int i8 = 1237;
            int i9 = 37;
            switch (O(P3)) {
                case 0:
                    i2 = i5 * 53;
                    b4 = AbstractC0458x.b(Double.doubleToLongBits(s0.f5400c.e(j4, abstractC0456v)));
                    i5 = b4 + i2;
                    break;
                case 1:
                    i2 = i5 * 53;
                    b4 = Float.floatToIntBits(s0.f5400c.f(j4, abstractC0456v));
                    i5 = b4 + i2;
                    break;
                case 2:
                    i2 = i5 * 53;
                    b4 = AbstractC0458x.b(s0.f5400c.h(j4, abstractC0456v));
                    i5 = b4 + i2;
                    break;
                case 3:
                    i2 = i5 * 53;
                    b4 = AbstractC0458x.b(s0.f5400c.h(j4, abstractC0456v));
                    i5 = b4 + i2;
                    break;
                case 4:
                    i2 = i5 * 53;
                    b4 = s0.f5400c.g(j4, abstractC0456v);
                    i5 = b4 + i2;
                    break;
                case 5:
                    i2 = i5 * 53;
                    b4 = AbstractC0458x.b(s0.f5400c.h(j4, abstractC0456v));
                    i5 = b4 + i2;
                    break;
                case 6:
                    i2 = i5 * 53;
                    b4 = s0.f5400c.g(j4, abstractC0456v);
                    i5 = b4 + i2;
                    break;
                case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    i4 = i5 * 53;
                    boolean c4 = s0.f5400c.c(j4, abstractC0456v);
                    Charset charset = AbstractC0458x.f5409a;
                    break;
                case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                    i2 = i5 * 53;
                    b4 = ((String) s0.f5400c.i(j4, abstractC0456v)).hashCode();
                    i5 = b4 + i2;
                    break;
                case AbstractC1024c.f9242c /* 9 */:
                    Object i10 = s0.f5400c.i(j4, abstractC0456v);
                    if (i10 != null) {
                        i9 = i10.hashCode();
                    }
                    i5 = (i5 * 53) + i9;
                    break;
                case 10:
                    i2 = i5 * 53;
                    b4 = s0.f5400c.i(j4, abstractC0456v).hashCode();
                    i5 = b4 + i2;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    i2 = i5 * 53;
                    b4 = s0.f5400c.g(j4, abstractC0456v);
                    i5 = b4 + i2;
                    break;
                case 12:
                    i2 = i5 * 53;
                    b4 = s0.f5400c.g(j4, abstractC0456v);
                    i5 = b4 + i2;
                    break;
                case 13:
                    i2 = i5 * 53;
                    b4 = s0.f5400c.g(j4, abstractC0456v);
                    i5 = b4 + i2;
                    break;
                case 14:
                    i2 = i5 * 53;
                    b4 = AbstractC0458x.b(s0.f5400c.h(j4, abstractC0456v));
                    i5 = b4 + i2;
                    break;
                case AbstractC1024c.f9246g /* 15 */:
                    i2 = i5 * 53;
                    b4 = s0.f5400c.g(j4, abstractC0456v);
                    i5 = b4 + i2;
                    break;
                case 16:
                    i2 = i5 * 53;
                    b4 = AbstractC0458x.b(s0.f5400c.h(j4, abstractC0456v));
                    i5 = b4 + i2;
                    break;
                case 17:
                    Object i11 = s0.f5400c.i(j4, abstractC0456v);
                    if (i11 != null) {
                        i9 = i11.hashCode();
                    }
                    i5 = (i5 * 53) + i9;
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
                    i2 = i5 * 53;
                    b4 = s0.f5400c.i(j4, abstractC0456v).hashCode();
                    i5 = b4 + i2;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i2 = i5 * 53;
                    b4 = s0.f5400c.i(j4, abstractC0456v).hashCode();
                    i5 = b4 + i2;
                    break;
                case 51:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = AbstractC0458x.b(Double.doubleToLongBits(((Double) s0.f5400c.i(j4, abstractC0456v)).doubleValue()));
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = Float.floatToIntBits(((Float) s0.f5400c.i(j4, abstractC0456v)).floatValue());
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = AbstractC0458x.b(D(j4, abstractC0456v));
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = AbstractC0458x.b(D(j4, abstractC0456v));
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = C(j4, abstractC0456v);
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = AbstractC0458x.b(D(j4, abstractC0456v));
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = C(j4, abstractC0456v);
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i7, i6, abstractC0456v)) {
                        i4 = i5 * 53;
                        boolean booleanValue = ((Boolean) s0.f5400c.i(j4, abstractC0456v)).booleanValue();
                        Charset charset2 = AbstractC0458x.f5409a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = ((String) s0.f5400c.i(j4, abstractC0456v)).hashCode();
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = s0.f5400c.i(j4, abstractC0456v).hashCode();
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = s0.f5400c.i(j4, abstractC0456v).hashCode();
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = C(j4, abstractC0456v);
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = C(j4, abstractC0456v);
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = C(j4, abstractC0456v);
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = AbstractC0458x.b(D(j4, abstractC0456v));
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = C(j4, abstractC0456v);
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = AbstractC0458x.b(D(j4, abstractC0456v));
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i7, i6, abstractC0456v)) {
                        i2 = i5 * 53;
                        b4 = s0.f5400c.i(j4, abstractC0456v).hashCode();
                        i5 = b4 + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f5296m.getClass();
        return abstractC0456v.unknownFields.hashCode() + (i5 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void e(Object obj, C0020p c0020p, C0449n c0449n) {
        int O3;
        AbstractC0445j abstractC0445j;
        F f4;
        c0449n.getClass();
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        k0 k0Var = this.f5296m;
        int[] iArr = this.f5291h;
        int i2 = this.f5293j;
        int i4 = this.f5292i;
        j0 j0Var = null;
        while (true) {
            try {
                int c4 = c0020p.c();
                int E3 = E(c4);
                if (E3 >= 0) {
                    int P3 = P(E3);
                    try {
                        O3 = O(P3);
                        abstractC0445j = (AbstractC0445j) c0020p.f175e;
                        f4 = this.f5295l;
                    } catch (C0459y unused) {
                        k0Var.getClass();
                        if (j0Var == null) {
                            j0Var = k0.a(obj);
                        }
                        if (!k0.c(j0Var, c0020p)) {
                            while (i4 < i2) {
                                k(obj, iArr[i4], j0Var);
                                i4++;
                            }
                            if (j0Var == null) {
                                return;
                            }
                            ((AbstractC0456v) obj).unknownFields = j0Var;
                            return;
                        }
                    }
                    switch (O3) {
                        case 0:
                            long B = B(P3);
                            c0020p.A(1);
                            s0.f5400c.m(obj, B, abstractC0445j.h());
                            K(E3, obj);
                            continue;
                        case 1:
                            long B3 = B(P3);
                            c0020p.A(5);
                            s0.f5400c.n(obj, B3, abstractC0445j.l());
                            K(E3, obj);
                            continue;
                        case 2:
                            long B4 = B(P3);
                            c0020p.A(0);
                            s0.r(obj, B4, abstractC0445j.n());
                            K(E3, obj);
                            continue;
                        case 3:
                            long B5 = B(P3);
                            c0020p.A(0);
                            s0.r(obj, B5, abstractC0445j.w());
                            K(E3, obj);
                            continue;
                        case 4:
                            long B6 = B(P3);
                            c0020p.A(0);
                            s0.q(abstractC0445j.m(), B6, obj);
                            K(E3, obj);
                            continue;
                        case 5:
                            long B7 = B(P3);
                            c0020p.A(1);
                            s0.r(obj, B7, abstractC0445j.k());
                            K(E3, obj);
                            continue;
                        case 6:
                            long B8 = B(P3);
                            c0020p.A(5);
                            s0.q(abstractC0445j.j(), B8, obj);
                            K(E3, obj);
                            continue;
                        case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            long B9 = B(P3);
                            c0020p.A(0);
                            s0.f5400c.k(obj, B9, abstractC0445j.f());
                            K(E3, obj);
                            continue;
                        case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                            H(obj, P3, c0020p);
                            K(E3, obj);
                            continue;
                        case AbstractC1024c.f9242c /* 9 */:
                            AbstractC0434a abstractC0434a = (AbstractC0434a) x(E3, obj);
                            Z n2 = n(E3);
                            c0020p.A(2);
                            c0020p.g(abstractC0434a, n2, c0449n);
                            M(obj, E3, abstractC0434a);
                            continue;
                        case 10:
                            s0.s(B(P3), obj, c0020p.i());
                            K(E3, obj);
                            continue;
                        case RequestError.STOP_TRACKING /* 11 */:
                            long B10 = B(P3);
                            c0020p.A(0);
                            s0.q(abstractC0445j.v(), B10, obj);
                            K(E3, obj);
                            continue;
                        case 12:
                            c0020p.A(0);
                            int i5 = abstractC0445j.i();
                            l(E3);
                            s0.q(i5, B(P3), obj);
                            K(E3, obj);
                            continue;
                        case 13:
                            long B11 = B(P3);
                            c0020p.A(5);
                            s0.q(abstractC0445j.o(), B11, obj);
                            K(E3, obj);
                            continue;
                        case 14:
                            long B12 = B(P3);
                            c0020p.A(1);
                            s0.r(obj, B12, abstractC0445j.p());
                            K(E3, obj);
                            continue;
                        case AbstractC1024c.f9246g /* 15 */:
                            long B13 = B(P3);
                            c0020p.A(0);
                            s0.q(abstractC0445j.q(), B13, obj);
                            K(E3, obj);
                            continue;
                        case 16:
                            long B14 = B(P3);
                            c0020p.A(0);
                            s0.r(obj, B14, abstractC0445j.r());
                            K(E3, obj);
                            continue;
                        case 17:
                            AbstractC0434a abstractC0434a2 = (AbstractC0434a) x(E3, obj);
                            Z n4 = n(E3);
                            c0020p.A(3);
                            c0020p.f(abstractC0434a2, n4, c0449n);
                            M(obj, E3, abstractC0434a2);
                            continue;
                        case 18:
                            c0020p.k(f4.c(B(P3), obj));
                            continue;
                        case 19:
                            c0020p.p(f4.c(B(P3), obj));
                            continue;
                        case 20:
                            c0020p.r(f4.c(B(P3), obj));
                            continue;
                        case 21:
                            c0020p.y(f4.c(B(P3), obj));
                            continue;
                        case 22:
                            c0020p.q(f4.c(B(P3), obj));
                            continue;
                        case 23:
                            c0020p.o(f4.c(B(P3), obj));
                            continue;
                        case 24:
                            c0020p.n(f4.c(B(P3), obj));
                            continue;
                        case 25:
                            c0020p.h(f4.c(B(P3), obj));
                            continue;
                        case 26:
                            I(obj, P3, c0020p);
                            continue;
                        case 27:
                            G(obj, P3, c0020p, n(E3), c0449n);
                            continue;
                        case 28:
                            c0020p.j(f4.c(B(P3), obj));
                            continue;
                        case 29:
                            c0020p.x(f4.c(B(P3), obj));
                            continue;
                        case 30:
                            List c5 = f4.c(B(P3), obj);
                            c0020p.l(c5);
                            l(E3);
                            AbstractC0435a0.z(obj, c4, c5, j0Var, k0Var);
                            continue;
                        case 31:
                            c0020p.s(f4.c(B(P3), obj));
                            continue;
                        case 32:
                            c0020p.t(f4.c(B(P3), obj));
                            continue;
                        case 33:
                            c0020p.u(f4.c(B(P3), obj));
                            continue;
                        case 34:
                            c0020p.v(f4.c(B(P3), obj));
                            continue;
                        case 35:
                            c0020p.k(f4.c(B(P3), obj));
                            continue;
                        case 36:
                            c0020p.p(f4.c(B(P3), obj));
                            continue;
                        case 37:
                            c0020p.r(f4.c(B(P3), obj));
                            continue;
                        case 38:
                            c0020p.y(f4.c(B(P3), obj));
                            continue;
                        case 39:
                            c0020p.q(f4.c(B(P3), obj));
                            continue;
                        case RequestError.NETWORK_FAILURE /* 40 */:
                            c0020p.o(f4.c(B(P3), obj));
                            continue;
                        case RequestError.NO_DEV_KEY /* 41 */:
                            c0020p.n(f4.c(B(P3), obj));
                            continue;
                        case 42:
                            c0020p.h(f4.c(B(P3), obj));
                            continue;
                        case 43:
                            c0020p.x(f4.c(B(P3), obj));
                            continue;
                        case 44:
                            List c6 = f4.c(B(P3), obj);
                            c0020p.l(c6);
                            l(E3);
                            AbstractC0435a0.z(obj, c4, c6, j0Var, k0Var);
                            continue;
                        case 45:
                            c0020p.s(f4.c(B(P3), obj));
                            continue;
                        case 46:
                            c0020p.t(f4.c(B(P3), obj));
                            continue;
                        case 47:
                            c0020p.u(f4.c(B(P3), obj));
                            continue;
                        case 48:
                            c0020p.v(f4.c(B(P3), obj));
                            continue;
                        case 49:
                            F(obj, B(P3), c0020p, n(E3), c0449n);
                            continue;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            u(obj, E3, m(E3), c0449n, c0020p);
                            continue;
                        case 51:
                            long B15 = B(P3);
                            c0020p.A(1);
                            s0.s(B15, obj, Double.valueOf(abstractC0445j.h()));
                            L(c4, E3, obj);
                            continue;
                        case 52:
                            long B16 = B(P3);
                            c0020p.A(5);
                            s0.s(B16, obj, Float.valueOf(abstractC0445j.l()));
                            L(c4, E3, obj);
                            continue;
                        case 53:
                            long B17 = B(P3);
                            c0020p.A(0);
                            s0.s(B17, obj, Long.valueOf(abstractC0445j.n()));
                            L(c4, E3, obj);
                            continue;
                        case 54:
                            long B18 = B(P3);
                            c0020p.A(0);
                            s0.s(B18, obj, Long.valueOf(abstractC0445j.w()));
                            L(c4, E3, obj);
                            continue;
                        case 55:
                            long B19 = B(P3);
                            c0020p.A(0);
                            s0.s(B19, obj, Integer.valueOf(abstractC0445j.m()));
                            L(c4, E3, obj);
                            continue;
                        case 56:
                            long B20 = B(P3);
                            c0020p.A(1);
                            s0.s(B20, obj, Long.valueOf(abstractC0445j.k()));
                            L(c4, E3, obj);
                            continue;
                        case 57:
                            long B21 = B(P3);
                            c0020p.A(5);
                            s0.s(B21, obj, Integer.valueOf(abstractC0445j.j()));
                            L(c4, E3, obj);
                            continue;
                        case 58:
                            long B22 = B(P3);
                            c0020p.A(0);
                            s0.s(B22, obj, Boolean.valueOf(abstractC0445j.f()));
                            L(c4, E3, obj);
                            continue;
                        case 59:
                            H(obj, P3, c0020p);
                            L(c4, E3, obj);
                            continue;
                        case 60:
                            AbstractC0434a abstractC0434a3 = (AbstractC0434a) y(c4, E3, obj);
                            Z n5 = n(E3);
                            c0020p.A(2);
                            c0020p.g(abstractC0434a3, n5, c0449n);
                            N(obj, c4, E3, abstractC0434a3);
                            continue;
                        case 61:
                            s0.s(B(P3), obj, c0020p.i());
                            L(c4, E3, obj);
                            continue;
                        case 62:
                            long B23 = B(P3);
                            c0020p.A(0);
                            s0.s(B23, obj, Integer.valueOf(abstractC0445j.v()));
                            L(c4, E3, obj);
                            continue;
                        case 63:
                            c0020p.A(0);
                            int i6 = abstractC0445j.i();
                            l(E3);
                            s0.s(B(P3), obj, Integer.valueOf(i6));
                            L(c4, E3, obj);
                            continue;
                        case 64:
                            long B24 = B(P3);
                            c0020p.A(5);
                            s0.s(B24, obj, Integer.valueOf(abstractC0445j.o()));
                            L(c4, E3, obj);
                            continue;
                        case 65:
                            long B25 = B(P3);
                            c0020p.A(1);
                            s0.s(B25, obj, Long.valueOf(abstractC0445j.p()));
                            L(c4, E3, obj);
                            continue;
                        case 66:
                            long B26 = B(P3);
                            c0020p.A(0);
                            s0.s(B26, obj, Integer.valueOf(abstractC0445j.q()));
                            L(c4, E3, obj);
                            continue;
                        case 67:
                            long B27 = B(P3);
                            c0020p.A(0);
                            s0.s(B27, obj, Long.valueOf(abstractC0445j.r()));
                            L(c4, E3, obj);
                            continue;
                        case 68:
                            AbstractC0434a abstractC0434a4 = (AbstractC0434a) y(c4, E3, obj);
                            Z n6 = n(E3);
                            c0020p.A(3);
                            c0020p.f(abstractC0434a4, n6, c0449n);
                            N(obj, c4, E3, abstractC0434a4);
                            continue;
                        default:
                            if (j0Var == null) {
                                k0Var.getClass();
                                j0Var = k0.a(obj);
                            }
                            k0Var.getClass();
                            if (!k0.c(j0Var, c0020p)) {
                                while (i4 < i2) {
                                    k(obj, iArr[i4], j0Var);
                                    i4++;
                                }
                                if (j0Var == null) {
                                    return;
                                }
                            }
                            break;
                    }
                } else if (c4 == Integer.MAX_VALUE) {
                    while (i4 < i2) {
                        k(obj, iArr[i4], j0Var);
                        i4++;
                    }
                    if (j0Var == null) {
                        return;
                    } else {
                        k0Var.getClass();
                    }
                } else {
                    k0Var.getClass();
                    if (j0Var == null) {
                        j0Var = k0.a(obj);
                    }
                    if (!k0.c(j0Var, c0020p)) {
                        while (i4 < i2) {
                            k(obj, iArr[i4], j0Var);
                            i4++;
                        }
                        if (j0Var == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i4 < i2) {
                    k(obj, iArr[i4], j0Var);
                    i4++;
                }
                if (j0Var != null) {
                    k0Var.getClass();
                    ((AbstractC0456v) obj).unknownFields = j0Var;
                }
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final int f(AbstractC0456v abstractC0456v) {
        return this.f5290g ? p(abstractC0456v) : o(abstractC0456v);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final AbstractC0456v g() {
        this.f5294k.getClass();
        return ((AbstractC0456v) this.f5288e).k();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void h(Object obj) {
        if (r(obj)) {
            if (obj instanceof AbstractC0456v) {
                AbstractC0456v abstractC0456v = (AbstractC0456v) obj;
                abstractC0456v.d();
                abstractC0456v.c();
                abstractC0456v.j();
            }
            int[] iArr = this.f5284a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int P3 = P(i2);
                long j4 = 1048575 & P3;
                int O3 = O(P3);
                if (O3 != 9) {
                    if (O3 != 60 && O3 != 68) {
                        switch (O3) {
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
                                this.f5295l.a(j4, obj);
                                break;
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f5283p;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    this.f5297n.getClass();
                                    L.c(object);
                                    unsafe.putObject(obj, j4, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (s(iArr[i2], i2, obj)) {
                        n(i2).h(f5283p.getObject(obj, j4));
                    }
                }
                if (q(i2, obj)) {
                    n(i2).h(f5283p.getObject(obj, j4));
                }
            }
            this.f5296m.getClass();
            k0.b(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC0435a0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC0435a0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC0435a0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC0435a0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r7, r12)) == java.lang.Float.floatToIntBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC0435a0.C(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(AbstractC0456v abstractC0456v, Object obj) {
        int[] iArr = this.f5284a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean z4 = true;
            if (i2 >= length) {
                this.f5296m.getClass();
                return abstractC0456v.unknownFields.equals(((AbstractC0456v) obj).unknownFields);
            }
            int P3 = P(i2);
            long j4 = P3 & 1048575;
            switch (O(P3)) {
                case 0:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 1:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var2 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 2:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var3 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 3:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var4 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 4:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var5 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 5:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var6 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 6:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var7 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var8 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var9 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case AbstractC1024c.f9242c /* 9 */:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var10 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 10:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var11 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var12 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 12:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var13 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 13:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var14 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 14:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var15 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case AbstractC1024c.f9246g /* 15 */:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var16 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 16:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var17 = s0.f5400c;
                        break;
                    }
                    z4 = false;
                    break;
                case 17:
                    if (j(abstractC0456v, obj, i2)) {
                        r0 r0Var18 = s0.f5400c;
                        break;
                    }
                    z4 = false;
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
                    r0 r0Var19 = s0.f5400c;
                    z4 = AbstractC0435a0.C(r0Var19.i(j4, abstractC0456v), r0Var19.i(j4, obj));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    r0 r0Var20 = s0.f5400c;
                    z4 = AbstractC0435a0.C(r0Var20.i(j4, abstractC0456v), r0Var20.i(j4, obj));
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
                    long j5 = iArr[i2 + 2] & 1048575;
                    r0 r0Var21 = s0.f5400c;
                    if (r0Var21.g(j5, abstractC0456v) == r0Var21.g(j5, obj)) {
                        break;
                    }
                    z4 = false;
                    break;
            }
            if (!z4) {
                return false;
            }
            i2 += 3;
        }
    }

    public final boolean j(AbstractC0456v abstractC0456v, Object obj, int i2) {
        return q(i2, abstractC0456v) == q(i2, obj);
    }

    public final void k(Object obj, int i2, Object obj2) {
        int i4 = this.f5284a[i2];
        if (s0.f5400c.i(P(i2) & 1048575, obj) == null) {
            return;
        }
        l(i2);
    }

    public final void l(int i2) {
        if (this.f5285b[((i2 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i2) {
        return this.f5285b[(i2 / 3) * 2];
    }

    public final Z n(int i2) {
        int i4 = (i2 / 3) * 2;
        Object[] objArr = this.f5285b;
        Z z4 = (Z) objArr[i4];
        if (z4 != null) {
            return z4;
        }
        Z a4 = W.f5303c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a4;
        return a4;
    }

    public final int o(AbstractC0456v abstractC0456v) {
        int i2;
        int o4;
        int m4;
        Unsafe unsafe = f5283p;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = this.f5284a;
            if (i4 >= iArr.length) {
                this.f5296m.getClass();
                return abstractC0456v.unknownFields.b() + i5;
            }
            int P3 = P(i4);
            int i8 = iArr[i4];
            int O3 = O(P3);
            if (O3 <= 17) {
                int i9 = iArr[i4 + 2];
                int i10 = i9 & 1048575;
                i2 = 1 << (i9 >>> 20);
                if (i10 != i7) {
                    i6 = unsafe.getInt(abstractC0456v, i10);
                    i7 = i10;
                }
            } else {
                i2 = 0;
            }
            long j4 = P3 & 1048575;
            switch (O3) {
                case 0:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.o(i8);
                        i5 += o4;
                        break;
                    }
                case 1:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.s(i8);
                        i5 += o4;
                        break;
                    }
                case 2:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.w(unsafe.getLong(abstractC0456v, j4), i8);
                        i5 += o4;
                        break;
                    }
                case 3:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.G(unsafe.getLong(abstractC0456v, j4), i8);
                        i5 += o4;
                        break;
                    }
                case 4:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.u(i8, unsafe.getInt(abstractC0456v, j4));
                        i5 += o4;
                        break;
                    }
                case 5:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.r(i8);
                        i5 += o4;
                        break;
                    }
                case 6:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.q(i8);
                        i5 += o4;
                        break;
                    }
                case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.l(i8);
                        i5 += o4;
                        break;
                    }
                case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0456v, j4);
                        m4 = object instanceof C0442g ? C0447l.m(i8, (C0442g) object) : C0447l.B(i8, (String) object);
                        i5 = m4 + i5;
                        break;
                    }
                case AbstractC1024c.f9242c /* 9 */:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = AbstractC0435a0.o(i8, unsafe.getObject(abstractC0456v, j4), n(i4));
                        i5 += o4;
                        break;
                    }
                case 10:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.m(i8, (C0442g) unsafe.getObject(abstractC0456v, j4));
                        i5 += o4;
                        break;
                    }
                case RequestError.STOP_TRACKING /* 11 */:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.E(i8, unsafe.getInt(abstractC0456v, j4));
                        i5 += o4;
                        break;
                    }
                case 12:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.p(i8, unsafe.getInt(abstractC0456v, j4));
                        i5 += o4;
                        break;
                    }
                case 13:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.x(i8);
                        i5 += o4;
                        break;
                    }
                case 14:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.y(i8);
                        i5 += o4;
                        break;
                    }
                case AbstractC1024c.f9246g /* 15 */:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.z(i8, unsafe.getInt(abstractC0456v, j4));
                        i5 += o4;
                        break;
                    }
                case 16:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.A(unsafe.getLong(abstractC0456v, j4), i8);
                        i5 += o4;
                        break;
                    }
                case 17:
                    if ((i2 & i6) == 0) {
                        break;
                    } else {
                        o4 = C0447l.t(i8, (AbstractC0434a) unsafe.getObject(abstractC0456v, j4), n(i4));
                        i5 += o4;
                        break;
                    }
                case 18:
                    o4 = AbstractC0435a0.h(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 19:
                    o4 = AbstractC0435a0.f(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 20:
                    o4 = AbstractC0435a0.m(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 21:
                    o4 = AbstractC0435a0.x(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 22:
                    o4 = AbstractC0435a0.k(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 23:
                    o4 = AbstractC0435a0.h(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 24:
                    o4 = AbstractC0435a0.f(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 25:
                    o4 = AbstractC0435a0.a(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 26:
                    o4 = AbstractC0435a0.u(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 27:
                    o4 = AbstractC0435a0.p(i8, (List) unsafe.getObject(abstractC0456v, j4), n(i4));
                    i5 += o4;
                    break;
                case 28:
                    o4 = AbstractC0435a0.c(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 29:
                    o4 = AbstractC0435a0.v(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 30:
                    o4 = AbstractC0435a0.d(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 31:
                    o4 = AbstractC0435a0.f(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 32:
                    o4 = AbstractC0435a0.h(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 33:
                    o4 = AbstractC0435a0.q(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 34:
                    o4 = AbstractC0435a0.s(i8, (List) unsafe.getObject(abstractC0456v, j4));
                    i5 += o4;
                    break;
                case 35:
                    int i11 = AbstractC0435a0.i((List) unsafe.getObject(abstractC0456v, j4));
                    if (i11 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(i11, C0447l.D(i8), i11, i5);
                        break;
                    }
                case 36:
                    int g4 = AbstractC0435a0.g((List) unsafe.getObject(abstractC0456v, j4));
                    if (g4 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(g4, C0447l.D(i8), g4, i5);
                        break;
                    }
                case 37:
                    int n2 = AbstractC0435a0.n((List) unsafe.getObject(abstractC0456v, j4));
                    if (n2 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(n2, C0447l.D(i8), n2, i5);
                        break;
                    }
                case 38:
                    int y4 = AbstractC0435a0.y((List) unsafe.getObject(abstractC0456v, j4));
                    if (y4 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(y4, C0447l.D(i8), y4, i5);
                        break;
                    }
                case 39:
                    int l4 = AbstractC0435a0.l((List) unsafe.getObject(abstractC0456v, j4));
                    if (l4 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(l4, C0447l.D(i8), l4, i5);
                        break;
                    }
                case RequestError.NETWORK_FAILURE /* 40 */:
                    int i12 = AbstractC0435a0.i((List) unsafe.getObject(abstractC0456v, j4));
                    if (i12 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(i12, C0447l.D(i8), i12, i5);
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    int g5 = AbstractC0435a0.g((List) unsafe.getObject(abstractC0456v, j4));
                    if (g5 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(g5, C0447l.D(i8), g5, i5);
                        break;
                    }
                case 42:
                    int b4 = AbstractC0435a0.b((List) unsafe.getObject(abstractC0456v, j4));
                    if (b4 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(b4, C0447l.D(i8), b4, i5);
                        break;
                    }
                case 43:
                    int w4 = AbstractC0435a0.w((List) unsafe.getObject(abstractC0456v, j4));
                    if (w4 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(w4, C0447l.D(i8), w4, i5);
                        break;
                    }
                case 44:
                    int e4 = AbstractC0435a0.e((List) unsafe.getObject(abstractC0456v, j4));
                    if (e4 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(e4, C0447l.D(i8), e4, i5);
                        break;
                    }
                case 45:
                    int g6 = AbstractC0435a0.g((List) unsafe.getObject(abstractC0456v, j4));
                    if (g6 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(g6, C0447l.D(i8), g6, i5);
                        break;
                    }
                case 46:
                    int i13 = AbstractC0435a0.i((List) unsafe.getObject(abstractC0456v, j4));
                    if (i13 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(i13, C0447l.D(i8), i13, i5);
                        break;
                    }
                case 47:
                    int r2 = AbstractC0435a0.r((List) unsafe.getObject(abstractC0456v, j4));
                    if (r2 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(r2, C0447l.D(i8), r2, i5);
                        break;
                    }
                case 48:
                    int t4 = AbstractC0435a0.t((List) unsafe.getObject(abstractC0456v, j4));
                    if (t4 <= 0) {
                        break;
                    } else {
                        i5 = AbstractC0017m.b(t4, C0447l.D(i8), t4, i5);
                        break;
                    }
                case 49:
                    o4 = AbstractC0435a0.j(i8, (List) unsafe.getObject(abstractC0456v, j4), n(i4));
                    i5 += o4;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(abstractC0456v, j4);
                    Object m5 = m(i4);
                    this.f5297n.getClass();
                    o4 = L.a(object2, i8, m5);
                    i5 += o4;
                    break;
                case 51:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.o(i8);
                        i5 += o4;
                        break;
                    }
                case 52:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.s(i8);
                        i5 += o4;
                        break;
                    }
                case 53:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.w(D(j4, abstractC0456v), i8);
                        i5 += o4;
                        break;
                    }
                case 54:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.G(D(j4, abstractC0456v), i8);
                        i5 += o4;
                        break;
                    }
                case 55:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.u(i8, C(j4, abstractC0456v));
                        i5 += o4;
                        break;
                    }
                case 56:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.r(i8);
                        i5 += o4;
                        break;
                    }
                case 57:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.q(i8);
                        i5 += o4;
                        break;
                    }
                case 58:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.l(i8);
                        i5 += o4;
                        break;
                    }
                case 59:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0456v, j4);
                        m4 = object3 instanceof C0442g ? C0447l.m(i8, (C0442g) object3) : C0447l.B(i8, (String) object3);
                        i5 = m4 + i5;
                        break;
                    }
                case 60:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = AbstractC0435a0.o(i8, unsafe.getObject(abstractC0456v, j4), n(i4));
                        i5 += o4;
                        break;
                    }
                case 61:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.m(i8, (C0442g) unsafe.getObject(abstractC0456v, j4));
                        i5 += o4;
                        break;
                    }
                case 62:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.E(i8, C(j4, abstractC0456v));
                        i5 += o4;
                        break;
                    }
                case 63:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.p(i8, C(j4, abstractC0456v));
                        i5 += o4;
                        break;
                    }
                case 64:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.x(i8);
                        i5 += o4;
                        break;
                    }
                case 65:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.y(i8);
                        i5 += o4;
                        break;
                    }
                case 66:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.z(i8, C(j4, abstractC0456v));
                        i5 += o4;
                        break;
                    }
                case 67:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.A(D(j4, abstractC0456v), i8);
                        i5 += o4;
                        break;
                    }
                case 68:
                    if (!s(i8, i4, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.t(i8, (AbstractC0434a) unsafe.getObject(abstractC0456v, j4), n(i4));
                        i5 += o4;
                        break;
                    }
            }
            i4 += 3;
        }
    }

    public final int p(AbstractC0456v abstractC0456v) {
        int o4;
        Unsafe unsafe = f5283p;
        int i2 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f5284a;
            if (i2 >= iArr.length) {
                this.f5296m.getClass();
                return abstractC0456v.unknownFields.b() + i4;
            }
            int P3 = P(i2);
            int O3 = O(P3);
            int i5 = iArr[i2];
            long j4 = P3 & 1048575;
            if (O3 >= r.f5390e.a() && O3 <= r.f5391i.a()) {
                int i6 = iArr[i2 + 2];
            }
            switch (O3) {
                case 0:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.o(i5);
                        break;
                    }
                case 1:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.s(i5);
                        break;
                    }
                case 2:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.w(s0.k(abstractC0456v, j4), i5);
                        break;
                    }
                case 3:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.G(s0.k(abstractC0456v, j4), i5);
                        break;
                    }
                case 4:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.u(i5, s0.j(abstractC0456v, j4));
                        break;
                    }
                case 5:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.r(i5);
                        break;
                    }
                case 6:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.q(i5);
                        break;
                    }
                case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.l(i5);
                        break;
                    }
                case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        Object l4 = s0.l(abstractC0456v, j4);
                        if (!(l4 instanceof C0442g)) {
                            o4 = C0447l.B(i5, (String) l4);
                            break;
                        } else {
                            o4 = C0447l.m(i5, (C0442g) l4);
                            break;
                        }
                    }
                case AbstractC1024c.f9242c /* 9 */:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = AbstractC0435a0.o(i5, s0.l(abstractC0456v, j4), n(i2));
                        break;
                    }
                case 10:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.m(i5, (C0442g) s0.l(abstractC0456v, j4));
                        break;
                    }
                case RequestError.STOP_TRACKING /* 11 */:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.E(i5, s0.j(abstractC0456v, j4));
                        break;
                    }
                case 12:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.p(i5, s0.j(abstractC0456v, j4));
                        break;
                    }
                case 13:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.x(i5);
                        break;
                    }
                case 14:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.y(i5);
                        break;
                    }
                case AbstractC1024c.f9246g /* 15 */:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.z(i5, s0.j(abstractC0456v, j4));
                        break;
                    }
                case 16:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.A(s0.k(abstractC0456v, j4), i5);
                        break;
                    }
                case 17:
                    if (!q(i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.t(i5, (AbstractC0434a) s0.l(abstractC0456v, j4), n(i2));
                        break;
                    }
                case 18:
                    o4 = AbstractC0435a0.h(i5, t(abstractC0456v, j4));
                    break;
                case 19:
                    o4 = AbstractC0435a0.f(i5, t(abstractC0456v, j4));
                    break;
                case 20:
                    o4 = AbstractC0435a0.m(i5, t(abstractC0456v, j4));
                    break;
                case 21:
                    o4 = AbstractC0435a0.x(i5, t(abstractC0456v, j4));
                    break;
                case 22:
                    o4 = AbstractC0435a0.k(i5, t(abstractC0456v, j4));
                    break;
                case 23:
                    o4 = AbstractC0435a0.h(i5, t(abstractC0456v, j4));
                    break;
                case 24:
                    o4 = AbstractC0435a0.f(i5, t(abstractC0456v, j4));
                    break;
                case 25:
                    o4 = AbstractC0435a0.a(i5, t(abstractC0456v, j4));
                    break;
                case 26:
                    o4 = AbstractC0435a0.u(i5, t(abstractC0456v, j4));
                    break;
                case 27:
                    o4 = AbstractC0435a0.p(i5, t(abstractC0456v, j4), n(i2));
                    break;
                case 28:
                    o4 = AbstractC0435a0.c(i5, t(abstractC0456v, j4));
                    break;
                case 29:
                    o4 = AbstractC0435a0.v(i5, t(abstractC0456v, j4));
                    break;
                case 30:
                    o4 = AbstractC0435a0.d(i5, t(abstractC0456v, j4));
                    break;
                case 31:
                    o4 = AbstractC0435a0.f(i5, t(abstractC0456v, j4));
                    break;
                case 32:
                    o4 = AbstractC0435a0.h(i5, t(abstractC0456v, j4));
                    break;
                case 33:
                    o4 = AbstractC0435a0.q(i5, t(abstractC0456v, j4));
                    break;
                case 34:
                    o4 = AbstractC0435a0.s(i5, t(abstractC0456v, j4));
                    break;
                case 35:
                    int i7 = AbstractC0435a0.i((List) unsafe.getObject(abstractC0456v, j4));
                    if (i7 > 0) {
                        i4 = AbstractC0017m.b(i7, C0447l.D(i5), i7, i4);
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    int g4 = AbstractC0435a0.g((List) unsafe.getObject(abstractC0456v, j4));
                    if (g4 > 0) {
                        i4 = AbstractC0017m.b(g4, C0447l.D(i5), g4, i4);
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    int n2 = AbstractC0435a0.n((List) unsafe.getObject(abstractC0456v, j4));
                    if (n2 > 0) {
                        i4 = AbstractC0017m.b(n2, C0447l.D(i5), n2, i4);
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    int y4 = AbstractC0435a0.y((List) unsafe.getObject(abstractC0456v, j4));
                    if (y4 > 0) {
                        i4 = AbstractC0017m.b(y4, C0447l.D(i5), y4, i4);
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    int l5 = AbstractC0435a0.l((List) unsafe.getObject(abstractC0456v, j4));
                    if (l5 > 0) {
                        i4 = AbstractC0017m.b(l5, C0447l.D(i5), l5, i4);
                        break;
                    } else {
                        continue;
                    }
                case RequestError.NETWORK_FAILURE /* 40 */:
                    int i8 = AbstractC0435a0.i((List) unsafe.getObject(abstractC0456v, j4));
                    if (i8 > 0) {
                        i4 = AbstractC0017m.b(i8, C0447l.D(i5), i8, i4);
                        break;
                    } else {
                        continue;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    int g5 = AbstractC0435a0.g((List) unsafe.getObject(abstractC0456v, j4));
                    if (g5 > 0) {
                        i4 = AbstractC0017m.b(g5, C0447l.D(i5), g5, i4);
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int b4 = AbstractC0435a0.b((List) unsafe.getObject(abstractC0456v, j4));
                    if (b4 > 0) {
                        i4 = AbstractC0017m.b(b4, C0447l.D(i5), b4, i4);
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    int w4 = AbstractC0435a0.w((List) unsafe.getObject(abstractC0456v, j4));
                    if (w4 > 0) {
                        i4 = AbstractC0017m.b(w4, C0447l.D(i5), w4, i4);
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    int e4 = AbstractC0435a0.e((List) unsafe.getObject(abstractC0456v, j4));
                    if (e4 > 0) {
                        i4 = AbstractC0017m.b(e4, C0447l.D(i5), e4, i4);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    int g6 = AbstractC0435a0.g((List) unsafe.getObject(abstractC0456v, j4));
                    if (g6 > 0) {
                        i4 = AbstractC0017m.b(g6, C0447l.D(i5), g6, i4);
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    int i9 = AbstractC0435a0.i((List) unsafe.getObject(abstractC0456v, j4));
                    if (i9 > 0) {
                        i4 = AbstractC0017m.b(i9, C0447l.D(i5), i9, i4);
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    int r2 = AbstractC0435a0.r((List) unsafe.getObject(abstractC0456v, j4));
                    if (r2 > 0) {
                        i4 = AbstractC0017m.b(r2, C0447l.D(i5), r2, i4);
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    int t4 = AbstractC0435a0.t((List) unsafe.getObject(abstractC0456v, j4));
                    if (t4 > 0) {
                        i4 = AbstractC0017m.b(t4, C0447l.D(i5), t4, i4);
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    o4 = AbstractC0435a0.j(i5, t(abstractC0456v, j4), n(i2));
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object l6 = s0.l(abstractC0456v, j4);
                    Object m4 = m(i2);
                    this.f5297n.getClass();
                    o4 = L.a(l6, i5, m4);
                    break;
                case 51:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.o(i5);
                        break;
                    }
                case 52:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.s(i5);
                        break;
                    }
                case 53:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.w(D(j4, abstractC0456v), i5);
                        break;
                    }
                case 54:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.G(D(j4, abstractC0456v), i5);
                        break;
                    }
                case 55:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.u(i5, C(j4, abstractC0456v));
                        break;
                    }
                case 56:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.r(i5);
                        break;
                    }
                case 57:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.q(i5);
                        break;
                    }
                case 58:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.l(i5);
                        break;
                    }
                case 59:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        Object l7 = s0.l(abstractC0456v, j4);
                        if (!(l7 instanceof C0442g)) {
                            o4 = C0447l.B(i5, (String) l7);
                            break;
                        } else {
                            o4 = C0447l.m(i5, (C0442g) l7);
                            break;
                        }
                    }
                case 60:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = AbstractC0435a0.o(i5, s0.l(abstractC0456v, j4), n(i2));
                        break;
                    }
                case 61:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.m(i5, (C0442g) s0.l(abstractC0456v, j4));
                        break;
                    }
                case 62:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.E(i5, C(j4, abstractC0456v));
                        break;
                    }
                case 63:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.p(i5, C(j4, abstractC0456v));
                        break;
                    }
                case 64:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.x(i5);
                        break;
                    }
                case 65:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.y(i5);
                        break;
                    }
                case 66:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.z(i5, C(j4, abstractC0456v));
                        break;
                    }
                case 67:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.A(D(j4, abstractC0456v), i5);
                        break;
                    }
                case 68:
                    if (!s(i5, i2, abstractC0456v)) {
                        break;
                    } else {
                        o4 = C0447l.t(i5, (AbstractC0434a) s0.l(abstractC0456v, j4), n(i2));
                        break;
                    }
            }
            i4 = o4 + i4;
            i2 += 3;
        }
    }

    public final boolean q(int i2, Object obj) {
        int i4 = this.f5284a[i2 + 2];
        long j4 = i4 & 1048575;
        if (j4 != 1048575) {
            return ((1 << (i4 >>> 20)) & s0.f5400c.g(j4, obj)) != 0;
        }
        int P3 = P(i2);
        long j5 = P3 & 1048575;
        switch (O(P3)) {
            case 0:
                return Double.doubleToRawLongBits(s0.f5400c.e(j5, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(s0.f5400c.f(j5, obj)) != 0;
            case 2:
                return s0.f5400c.h(j5, obj) != 0;
            case 3:
                return s0.f5400c.h(j5, obj) != 0;
            case 4:
                return s0.f5400c.g(j5, obj) != 0;
            case 5:
                return s0.f5400c.h(j5, obj) != 0;
            case 6:
                return s0.f5400c.g(j5, obj) != 0;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return s0.f5400c.c(j5, obj);
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                Object i5 = s0.f5400c.i(j5, obj);
                if (i5 instanceof String) {
                    return !((String) i5).isEmpty();
                }
                if (i5 instanceof C0442g) {
                    return !C0442g.f5338i.equals(i5);
                }
                throw new IllegalArgumentException();
            case AbstractC1024c.f9242c /* 9 */:
                return s0.f5400c.i(j5, obj) != null;
            case 10:
                return !C0442g.f5338i.equals(s0.f5400c.i(j5, obj));
            case RequestError.STOP_TRACKING /* 11 */:
                return s0.f5400c.g(j5, obj) != 0;
            case 12:
                return s0.f5400c.g(j5, obj) != 0;
            case 13:
                return s0.f5400c.g(j5, obj) != 0;
            case 14:
                return s0.f5400c.h(j5, obj) != 0;
            case AbstractC1024c.f9246g /* 15 */:
                return s0.f5400c.g(j5, obj) != 0;
            case 16:
                return s0.f5400c.h(j5, obj) != 0;
            case 17:
                return s0.f5400c.i(j5, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(int i2, int i4, Object obj) {
        return s0.f5400c.g((long) (this.f5284a[i4 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r2, r4);
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
    public final void u(Object obj, int i2, Object obj2, C0449n c0449n, C0020p c0020p) {
        long P3 = P(i2) & 1048575;
        Object i4 = s0.f5400c.i(P3, obj);
        L l4 = this.f5297n;
        if (i4 == null) {
            l4.getClass();
            i4 = K.f5277e.c();
            s0.s(P3, obj, i4);
        } else {
            l4.getClass();
            if (!((K) i4).f5278d) {
                K c4 = K.f5277e.c();
                L.b(c4, i4);
                s0.s(P3, obj, c4);
                i4 = c4;
            }
        }
        l4.getClass();
        K k4 = (K) i4;
        I i5 = ((J) obj2).f5276a;
        c0020p.A(2);
        AbstractC0445j abstractC0445j = (AbstractC0445j) c0020p.f175e;
        int e4 = abstractC0445j.e(abstractC0445j.v());
        Object obj3 = "";
        i1.i iVar = i5.f5275c;
        Object obj4 = iVar;
        while (true) {
            try {
                int c5 = c0020p.c();
                if (c5 == Integer.MAX_VALUE || abstractC0445j.c()) {
                    break;
                }
                if (c5 == 1) {
                    obj3 = c0020p.m(i5.f5273a, null, null);
                } else if (c5 != 2) {
                    try {
                        if (!c0020p.B()) {
                            throw new C0460z("Unable to parse map entry.");
                        }
                    } catch (C0459y unused) {
                        if (!c0020p.B()) {
                            throw new C0460z("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj4 = c0020p.m(i5.f5274b, iVar.getClass(), c0449n);
                }
            } catch (Throwable th) {
                abstractC0445j.d(e4);
                throw th;
            }
        }
    }

    public final void v(Object obj, int i2, Object obj2) {
        if (q(i2, obj2)) {
            long P3 = P(i2) & 1048575;
            Unsafe unsafe = f5283p;
            Object object = unsafe.getObject(obj2, P3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5284a[i2] + " is present but null: " + obj2);
            }
            Z n2 = n(i2);
            if (!q(i2, obj)) {
                if (r(object)) {
                    AbstractC0456v g4 = n2.g();
                    n2.b(g4, object);
                    unsafe.putObject(obj, P3, g4);
                } else {
                    unsafe.putObject(obj, P3, object);
                }
                K(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, P3);
            if (!r(object2)) {
                AbstractC0456v g5 = n2.g();
                n2.b(g5, object2);
                unsafe.putObject(obj, P3, g5);
                object2 = g5;
            }
            n2.b(object2, object);
        }
    }

    public final void w(Object obj, int i2, Object obj2) {
        int[] iArr = this.f5284a;
        int i4 = iArr[i2];
        if (s(i4, i2, obj2)) {
            long P3 = P(i2) & 1048575;
            Unsafe unsafe = f5283p;
            Object object = unsafe.getObject(obj2, P3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2);
            }
            Z n2 = n(i2);
            if (!s(i4, i2, obj)) {
                if (r(object)) {
                    AbstractC0456v g4 = n2.g();
                    n2.b(g4, object);
                    unsafe.putObject(obj, P3, g4);
                } else {
                    unsafe.putObject(obj, P3, object);
                }
                L(i4, i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, P3);
            if (!r(object2)) {
                AbstractC0456v g5 = n2.g();
                n2.b(g5, object2);
                unsafe.putObject(obj, P3, g5);
                object2 = g5;
            }
            n2.b(object2, object);
        }
    }

    public final Object x(int i2, Object obj) {
        Z n2 = n(i2);
        long P3 = P(i2) & 1048575;
        if (!q(i2, obj)) {
            return n2.g();
        }
        Object object = f5283p.getObject(obj, P3);
        if (r(object)) {
            return object;
        }
        AbstractC0456v g4 = n2.g();
        if (object != null) {
            n2.b(g4, object);
        }
        return g4;
    }

    public final Object y(int i2, int i4, Object obj) {
        Z n2 = n(i4);
        if (!s(i2, i4, obj)) {
            return n2.g();
        }
        Object object = f5283p.getObject(obj, P(i4) & 1048575);
        if (r(object)) {
            return object;
        }
        AbstractC0456v g4 = n2.g();
        if (object != null) {
            n2.b(g4, object);
        }
        return g4;
    }
}
