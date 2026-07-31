package androidx.datastore.preferences.protobuf;

import B.C0014o;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import r.AbstractC0856c;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class P implements Z {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f5008o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f5009p = s0.m();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5010a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5011b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5012c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5013d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0245a f5014e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5015f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5016g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f5017h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5018i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5019j;

    /* renamed from: k, reason: collision with root package name */
    public final S f5020k;

    /* renamed from: l, reason: collision with root package name */
    public final F f5021l;

    /* renamed from: m, reason: collision with root package name */
    public final k0 f5022m;

    /* renamed from: n, reason: collision with root package name */
    public final L f5023n;

    public P(int[] iArr, Object[] objArr, int i3, int i4, AbstractC0245a abstractC0245a, boolean z3, int[] iArr2, int i5, int i6, S s3, F f3, k0 k0Var, C0261o c0261o, L l3) {
        this.f5010a = iArr;
        this.f5011b = objArr;
        this.f5012c = i3;
        this.f5013d = i4;
        this.f5015f = abstractC0245a instanceof AbstractC0267v;
        this.f5016g = z3;
        this.f5017h = iArr2;
        this.f5018i = i5;
        this.f5019j = i6;
        this.f5020k = s3;
        this.f5021l = f3;
        this.f5022m = k0Var;
        this.f5014e = abstractC0245a;
        this.f5023n = l3;
    }

    public static P A(Y y3, S s3, F f3, k0 k0Var, C0261o c0261o, L l3) {
        int i3;
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
        boolean z3 = y3.d() == 2;
        String c2 = y3.c();
        int length = c2.length();
        if (c2.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i3 = i34 + 1;
                if (c2.charAt(i34) < 55296) {
                    break;
                }
                i34 = i3;
            }
        } else {
            i3 = 1;
        }
        int i35 = i3 + 1;
        int charAt17 = c2.charAt(i3);
        if (charAt17 >= 55296) {
            int i36 = charAt17 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                charAt16 = c2.charAt(i35);
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
            iArr = f5008o;
            i5 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt18 = c2.charAt(i35);
            if (charAt18 >= 55296) {
                int i39 = charAt18 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    charAt11 = c2.charAt(i38);
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
            int charAt19 = c2.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    charAt10 = c2.charAt(i41);
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
            int charAt20 = c2.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    charAt9 = c2.charAt(i44);
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
            charAt = c2.charAt(i44);
            if (charAt >= 55296) {
                int i48 = charAt & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    charAt8 = c2.charAt(i47);
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
            int charAt21 = c2.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    charAt7 = c2.charAt(i50);
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
            charAt2 = c2.charAt(i50);
            if (charAt2 >= 55296) {
                int i54 = charAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    charAt6 = c2.charAt(i53);
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
            int charAt22 = c2.charAt(i53);
            if (charAt22 >= 55296) {
                int i57 = charAt22 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    charAt5 = c2.charAt(i56);
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
            charAt3 = c2.charAt(i56);
            if (charAt3 >= 55296) {
                int i60 = charAt3 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i7 = i61 + 1;
                    charAt4 = c2.charAt(i61);
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
        Unsafe unsafe = f5009p;
        Object[] b3 = y3.b();
        Class<?> cls = y3.a().getClass();
        int[] iArr3 = new int[i6 * 3];
        Object[] objArr = new Object[i6 * 2];
        int i63 = charAt2 + charAt3;
        int i64 = i63;
        int i65 = charAt3;
        int i66 = 0;
        int i67 = 0;
        while (i35 < length) {
            int i68 = i35 + 1;
            int charAt23 = c2.charAt(i35);
            if (charAt23 >= 55296) {
                int i69 = charAt23 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i31 = i70 + 1;
                    charAt15 = c2.charAt(i70);
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
            int charAt24 = c2.charAt(i16);
            if (charAt24 >= 55296) {
                int i73 = charAt24 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i30 = i74 + 1;
                    charAt14 = c2.charAt(i74);
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
                int charAt25 = c2.charAt(i18);
                if (charAt25 >= 55296) {
                    int i79 = charAt25 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i29 = i80 + 1;
                        charAt13 = c2.charAt(i80);
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
                    objArr[((i67 / 3) * 2) + 1] = b3[i4];
                    i4++;
                } else {
                    if (i82 == 12 && !z3) {
                        objArr[((i67 / 3) * 2) + 1] = b3[i4];
                        i4++;
                    }
                    i28 = 2;
                }
                int i84 = charAt25 * i28;
                Object obj = b3[i84];
                if (obj instanceof Field) {
                    J4 = (Field) obj;
                } else {
                    J4 = J(cls, (String) obj);
                    b3[i84] = J4;
                }
                int i85 = i4;
                i24 = (int) unsafe.objectFieldOffset(J4);
                int i86 = i84 + 1;
                Object obj2 = b3[i86];
                if (obj2 instanceof Field) {
                    J5 = (Field) obj2;
                } else {
                    J5 = J(cls, (String) obj2);
                    b3[i86] = J5;
                }
                i21 = (int) unsafe.objectFieldOffset(J5);
                i23 = 0;
                i20 = i5;
                i25 = i85;
                i22 = i83;
            } else {
                i19 = charAt;
                int i87 = i4 + 1;
                Field J6 = J(cls, (String) b3[i4]);
                i20 = i5;
                if (i76 == 9 || i76 == 17) {
                    objArr[((i67 / 3) * 2) + 1] = J6.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        i26 = i4 + 2;
                        objArr[((i67 / 3) * 2) + 1] = b3[i87];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        if (!z3) {
                            i26 = i4 + 2;
                            objArr[((i67 / 3) * 2) + 1] = b3[i87];
                        }
                    } else if (i76 == 50) {
                        int i88 = i65 + 1;
                        iArr[i65] = i67;
                        int i89 = (i67 / 3) * 2;
                        int i90 = i4 + 2;
                        objArr[i89] = b3[i87];
                        if ((charAt24 & 2048) != 0) {
                            i87 = i4 + 3;
                            objArr[i89 + 1] = b3[i90];
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
                    int charAt26 = c2.charAt(i18);
                    if (charAt26 >= 55296) {
                        int i92 = charAt26 & 8191;
                        int i93 = 13;
                        while (true) {
                            i22 = i91 + 1;
                            charAt12 = c2.charAt(i91);
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
                    Object obj3 = b3[i94];
                    if (obj3 instanceof Field) {
                        J3 = (Field) obj3;
                    } else {
                        J3 = J(cls, (String) obj3);
                        b3[i94] = J3;
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
            String str = c2;
            iArr3[i96] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i76 << 20) | i24;
            i67 += 3;
            iArr3[i97] = (i23 << 20) | i21;
            i4 = i25;
            charAt3 = i77;
            c2 = str;
            i5 = i20;
            length = i15;
            i63 = i17;
            i35 = i22;
            charAt = i19;
        }
        return new P(iArr3, objArr, i5, charAt, y3.a(), z3, iArr, charAt3, i63, s3, f3, k0Var, c0261o, l3);
    }

    public static long B(int i3) {
        return i3 & 1048575;
    }

    public static int C(long j3, Object obj) {
        return ((Integer) s0.f5126c.i(j3, obj)).intValue();
    }

    public static long D(long j3, Object obj) {
        return ((Long) s0.f5126c.i(j3, obj)).longValue();
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

    public static int O(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static void S(int i3, Object obj, H h3) {
        if (!(obj instanceof String)) {
            h3.b(i3, (C0253g) obj);
        } else {
            ((C0258l) h3.f4998a).V((String) obj, i3);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0267v) {
            return ((AbstractC0267v) obj).i();
        }
        return true;
    }

    public static List t(AbstractC0267v abstractC0267v, long j3) {
        return (List) s0.f5126c.i(j3, abstractC0267v);
    }

    public static P z(Y y3, S s3, F f3, k0 k0Var, C0261o c0261o, L l3) {
        if (y3 instanceof Y) {
            return A(y3, s3, f3, k0Var, c0261o, l3);
        }
        y3.getClass();
        throw new ClassCastException();
    }

    public final int E(int i3) {
        if (i3 < this.f5012c || i3 > this.f5013d) {
            return -1;
        }
        int[] iArr = this.f5010a;
        int length = (iArr.length / 3) - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int i7 = iArr[i6];
            if (i3 == i7) {
                return i6;
            }
            if (i3 < i7) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    public final void F(Object obj, long j3, C0014o c0014o, Z z3, C0260n c0260n) {
        int u3;
        List c2 = this.f5021l.c(j3, obj);
        int i3 = c0014o.f428b;
        if ((i3 & 7) != 3) {
            throw C0271z.b();
        }
        do {
            AbstractC0267v g3 = z3.g();
            c0014o.f(g3, z3, c0260n);
            z3.h(g3);
            c2.add(g3);
            AbstractC0256j abstractC0256j = (AbstractC0256j) c0014o.f431e;
            if (abstractC0256j.c() || c0014o.f430d != 0) {
                return;
            } else {
                u3 = abstractC0256j.u();
            }
        } while (u3 == i3);
        c0014o.f430d = u3;
    }

    public final void G(Object obj, int i3, C0014o c0014o, Z z3, C0260n c0260n) {
        int u3;
        List c2 = this.f5021l.c(i3 & 1048575, obj);
        int i4 = c0014o.f428b;
        if ((i4 & 7) != 2) {
            throw C0271z.b();
        }
        do {
            AbstractC0267v g3 = z3.g();
            c0014o.g(g3, z3, c0260n);
            z3.h(g3);
            c2.add(g3);
            AbstractC0256j abstractC0256j = (AbstractC0256j) c0014o.f431e;
            if (abstractC0256j.c() || c0014o.f430d != 0) {
                return;
            } else {
                u3 = abstractC0256j.u();
            }
        } while (u3 == i4);
        c0014o.f430d = u3;
    }

    public final void H(Object obj, int i3, C0014o c0014o) {
        if ((536870912 & i3) != 0) {
            c0014o.A(2);
            s0.s(i3 & 1048575, obj, ((AbstractC0256j) c0014o.f431e).t());
        } else if (!this.f5015f) {
            s0.s(i3 & 1048575, obj, c0014o.i());
        } else {
            c0014o.A(2);
            s0.s(i3 & 1048575, obj, ((AbstractC0256j) c0014o.f431e).s());
        }
    }

    public final void I(Object obj, int i3, C0014o c0014o) {
        boolean z3 = (536870912 & i3) != 0;
        F f3 = this.f5021l;
        if (z3) {
            c0014o.w(f3.c(i3 & 1048575, obj), true);
        } else {
            c0014o.w(f3.c(i3 & 1048575, obj), false);
        }
    }

    public final void K(int i3, Object obj) {
        int i4 = this.f5010a[i3 + 2];
        long j3 = 1048575 & i4;
        if (j3 == 1048575) {
            return;
        }
        s0.q((1 << (i4 >>> 20)) | s0.f5126c.g(j3, obj), j3, obj);
    }

    public final void L(int i3, int i4, Object obj) {
        s0.q(i3, this.f5010a[i4 + 2] & 1048575, obj);
    }

    public final void M(Object obj, int i3, AbstractC0245a abstractC0245a) {
        f5009p.putObject(obj, P(i3) & 1048575, abstractC0245a);
        K(i3, obj);
    }

    public final void N(Object obj, int i3, int i4, AbstractC0245a abstractC0245a) {
        f5009p.putObject(obj, P(i4) & 1048575, abstractC0245a);
        L(i3, i4, obj);
    }

    public final int P(int i3) {
        return this.f5010a[i3 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Q(Object obj, H h3) {
        int i3;
        boolean z3;
        int[] iArr = this.f5010a;
        int length = iArr.length;
        Unsafe unsafe = f5009p;
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
                i3 = 1 << (i9 >>> 20);
            } else {
                i3 = 0;
            }
            int i11 = i3;
            long j3 = P3 & i4;
            switch (O3) {
                case 0:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.c(s0.f5126c.e(j3, obj), i8);
                        break;
                    }
                case 1:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.g(s0.f5126c.f(j3, obj), i8);
                        break;
                    }
                case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.j(unsafe.getLong(obj, j3), i8);
                        break;
                    }
                case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.q(unsafe.getLong(obj, j3), i8);
                        break;
                    }
                case k1.i.LONG_FIELD_NUMBER /* 4 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.i(i8, unsafe.getInt(obj, j3));
                        break;
                    }
                case 5:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.f(unsafe.getLong(obj, j3), i8);
                        break;
                    }
                case 6:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.e(i8, unsafe.getInt(obj, j3));
                        break;
                    }
                case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.a(i8, s0.f5126c.c(j3, obj));
                        break;
                    }
                case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        S(i8, unsafe.getObject(obj, j3), h3);
                        break;
                    }
                case AbstractC0856c.f8037c /* 9 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.k(i8, unsafe.getObject(obj, j3), n(i6));
                        break;
                    }
                case AbstractC0856c.f8039e /* 10 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.b(i8, (C0253g) unsafe.getObject(obj, j3));
                        break;
                    }
                case 11:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.p(i8, unsafe.getInt(obj, j3));
                        break;
                    }
                case 12:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.d(i8, unsafe.getInt(obj, j3));
                        break;
                    }
                case 13:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.l(i8, unsafe.getInt(obj, j3));
                        break;
                    }
                case 14:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.m(unsafe.getLong(obj, j3), i8);
                        break;
                    }
                case AbstractC0856c.f8041g /* 15 */:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.n(i8, unsafe.getInt(obj, j3));
                        break;
                    }
                case 16:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.o(unsafe.getLong(obj, j3), i8);
                        break;
                    }
                case 17:
                    if ((i7 & i11) == 0) {
                        break;
                    } else {
                        h3.h(i8, unsafe.getObject(obj, j3), n(i6));
                        break;
                    }
                case 18:
                    AbstractC0246a0.F(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 19:
                    AbstractC0246a0.J(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 20:
                    AbstractC0246a0.M(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 21:
                    AbstractC0246a0.U(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 22:
                    AbstractC0246a0.L(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 23:
                    AbstractC0246a0.I(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 24:
                    AbstractC0246a0.H(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 25:
                    AbstractC0246a0.D(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 26:
                    AbstractC0246a0.S(iArr[i6], (List) unsafe.getObject(obj, j3), h3);
                    break;
                case 27:
                    AbstractC0246a0.N(iArr[i6], (List) unsafe.getObject(obj, j3), h3, n(i6));
                    break;
                case 28:
                    AbstractC0246a0.E(iArr[i6], (List) unsafe.getObject(obj, j3), h3);
                    break;
                case 29:
                    z3 = false;
                    AbstractC0246a0.T(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 30:
                    z3 = false;
                    AbstractC0246a0.G(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 31:
                    z3 = false;
                    AbstractC0246a0.O(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 32:
                    z3 = false;
                    AbstractC0246a0.P(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 33:
                    z3 = false;
                    AbstractC0246a0.Q(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 34:
                    z3 = false;
                    AbstractC0246a0.R(iArr[i6], (List) unsafe.getObject(obj, j3), h3, false);
                    break;
                case 35:
                    AbstractC0246a0.F(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 36:
                    AbstractC0246a0.J(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 37:
                    AbstractC0246a0.M(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 38:
                    AbstractC0246a0.U(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 39:
                    AbstractC0246a0.L(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 40:
                    AbstractC0246a0.I(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 41:
                    AbstractC0246a0.H(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 42:
                    AbstractC0246a0.D(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 43:
                    AbstractC0246a0.T(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 44:
                    AbstractC0246a0.G(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 45:
                    AbstractC0246a0.O(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 46:
                    AbstractC0246a0.P(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 47:
                    AbstractC0246a0.Q(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 48:
                    AbstractC0246a0.R(iArr[i6], (List) unsafe.getObject(obj, j3), h3, true);
                    break;
                case 49:
                    AbstractC0246a0.K(iArr[i6], (List) unsafe.getObject(obj, j3), h3, n(i6));
                    break;
                case 50:
                    R(h3, i8, unsafe.getObject(obj, j3), i6);
                    break;
                case 51:
                    if (s(i8, i6, obj)) {
                        h3.c(((Double) s0.f5126c.i(j3, obj)).doubleValue(), i8);
                    }
                    break;
                case 52:
                    if (s(i8, i6, obj)) {
                        h3.g(((Float) s0.f5126c.i(j3, obj)).floatValue(), i8);
                    }
                    break;
                case 53:
                    if (s(i8, i6, obj)) {
                        h3.j(D(j3, obj), i8);
                    }
                    break;
                case 54:
                    if (s(i8, i6, obj)) {
                        h3.q(D(j3, obj), i8);
                    }
                    break;
                case 55:
                    if (s(i8, i6, obj)) {
                        h3.i(i8, C(j3, obj));
                    }
                    break;
                case 56:
                    if (s(i8, i6, obj)) {
                        h3.f(D(j3, obj), i8);
                    }
                    break;
                case 57:
                    if (s(i8, i6, obj)) {
                        h3.e(i8, C(j3, obj));
                    }
                    break;
                case 58:
                    if (s(i8, i6, obj)) {
                        h3.a(i8, ((Boolean) s0.f5126c.i(j3, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (s(i8, i6, obj)) {
                        S(i8, unsafe.getObject(obj, j3), h3);
                    }
                    break;
                case 60:
                    if (s(i8, i6, obj)) {
                        h3.k(i8, unsafe.getObject(obj, j3), n(i6));
                    }
                    break;
                case 61:
                    if (s(i8, i6, obj)) {
                        h3.b(i8, (C0253g) unsafe.getObject(obj, j3));
                    }
                    break;
                case 62:
                    if (s(i8, i6, obj)) {
                        h3.p(i8, C(j3, obj));
                    }
                    break;
                case 63:
                    if (s(i8, i6, obj)) {
                        h3.d(i8, C(j3, obj));
                    }
                    break;
                case 64:
                    if (s(i8, i6, obj)) {
                        h3.l(i8, C(j3, obj));
                    }
                    break;
                case 65:
                    if (s(i8, i6, obj)) {
                        h3.m(D(j3, obj), i8);
                    }
                    break;
                case 66:
                    if (s(i8, i6, obj)) {
                        h3.n(i8, C(j3, obj));
                    }
                    break;
                case 67:
                    if (s(i8, i6, obj)) {
                        h3.o(D(j3, obj), i8);
                    }
                    break;
                case 68:
                    if (s(i8, i6, obj)) {
                        h3.h(i8, unsafe.getObject(obj, j3), n(i6));
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        this.f5022m.getClass();
        ((AbstractC0267v) obj).unknownFields.d(h3);
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
    public final void R(H h3, int i3, Object obj, int i4) {
        int H3;
        int a3;
        int F3;
        y0 y0Var;
        int a4;
        int F4;
        int i5 = 2;
        if (obj != null) {
            Object m3 = m(i4);
            this.f5023n.getClass();
            I i6 = ((J) m3).f5002a;
            C0258l c0258l = (C0258l) h3.f4998a;
            c0258l.getClass();
            for (Map.Entry entry : ((K) obj).entrySet()) {
                c0258l.X(i3, i5);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i7 = C0263q.f5113c;
                int D = C0258l.D(1);
                x0 x0Var = A0.f4977g;
                w0 w0Var = i6.f4999a;
                if (w0Var == x0Var) {
                    D *= i5;
                }
                int i8 = 8;
                switch (w0Var.ordinal()) {
                    case 0:
                        ((Double) key).getClass();
                        H3 = 8;
                        int i9 = H3 + D;
                        int D3 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                            D3 *= 2;
                        }
                        switch (y0Var.ordinal()) {
                            case 0:
                                ((Double) value).getClass();
                                c0258l.Z(i8 + D3 + i9);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key2);
                                C0263q.b(c0258l, y0Var, 2, value2);
                                i5 = 2;
                            case 1:
                                ((Float) value).getClass();
                                i8 = 4;
                                c0258l.Z(i8 + D3 + i9);
                                Object key22 = entry.getKey();
                                Object value22 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key22);
                                C0263q.b(c0258l, y0Var, 2, value22);
                                i5 = 2;
                            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                                i8 = C0258l.H(((Long) value).longValue());
                                c0258l.Z(i8 + D3 + i9);
                                Object key222 = entry.getKey();
                                Object value222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key222);
                                C0263q.b(c0258l, y0Var, 2, value222);
                                i5 = 2;
                            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                                i8 = C0258l.H(((Long) value).longValue());
                                c0258l.Z(i8 + D3 + i9);
                                Object key2222 = entry.getKey();
                                Object value2222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key2222);
                                C0263q.b(c0258l, y0Var, 2, value2222);
                                i5 = 2;
                            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                                i8 = C0258l.v(((Integer) value).intValue());
                                c0258l.Z(i8 + D3 + i9);
                                Object key22222 = entry.getKey();
                                Object value22222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key22222);
                                C0263q.b(c0258l, y0Var, 2, value22222);
                                i5 = 2;
                            case 5:
                                ((Long) value).getClass();
                                c0258l.Z(i8 + D3 + i9);
                                Object key222222 = entry.getKey();
                                Object value222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key222222);
                                C0263q.b(c0258l, y0Var, 2, value222222);
                                i5 = 2;
                            case 6:
                                ((Integer) value).getClass();
                                i8 = 4;
                                c0258l.Z(i8 + D3 + i9);
                                Object key2222222 = entry.getKey();
                                Object value2222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key2222222);
                                C0263q.b(c0258l, y0Var, 2, value2222222);
                                i5 = 2;
                            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                ((Boolean) value).getClass();
                                i8 = 1;
                                c0258l.Z(i8 + D3 + i9);
                                Object key22222222 = entry.getKey();
                                Object value22222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key22222222);
                                C0263q.b(c0258l, y0Var, 2, value22222222);
                                i5 = 2;
                            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                                i8 = value instanceof C0253g ? C0258l.n((C0253g) value) : C0258l.C((String) value);
                                c0258l.Z(i8 + D3 + i9);
                                Object key222222222 = entry.getKey();
                                Object value222222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key222222222);
                                C0263q.b(c0258l, y0Var, 2, value222222222);
                                i5 = 2;
                            case AbstractC0856c.f8037c /* 9 */:
                                i8 = ((AbstractC0267v) ((AbstractC0245a) value)).a(null);
                                c0258l.Z(i8 + D3 + i9);
                                Object key2222222222 = entry.getKey();
                                Object value2222222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key2222222222);
                                C0263q.b(c0258l, y0Var, 2, value2222222222);
                                i5 = 2;
                            case AbstractC0856c.f8039e /* 10 */:
                                a4 = ((AbstractC0267v) ((AbstractC0245a) value)).a(null);
                                F4 = C0258l.F(a4);
                                i8 = F4 + a4;
                                c0258l.Z(i8 + D3 + i9);
                                Object key22222222222 = entry.getKey();
                                Object value22222222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key22222222222);
                                C0263q.b(c0258l, y0Var, 2, value22222222222);
                                i5 = 2;
                            case 11:
                                if (value instanceof C0253g) {
                                    i8 = C0258l.n((C0253g) value);
                                    c0258l.Z(i8 + D3 + i9);
                                    Object key222222222222 = entry.getKey();
                                    Object value222222222222 = entry.getValue();
                                    C0263q.b(c0258l, w0Var, 1, key222222222222);
                                    C0263q.b(c0258l, y0Var, 2, value222222222222);
                                    i5 = 2;
                                } else {
                                    a4 = ((byte[]) value).length;
                                    F4 = C0258l.F(a4);
                                    i8 = F4 + a4;
                                    c0258l.Z(i8 + D3 + i9);
                                    Object key2222222222222 = entry.getKey();
                                    Object value2222222222222 = entry.getValue();
                                    C0263q.b(c0258l, w0Var, 1, key2222222222222);
                                    C0263q.b(c0258l, y0Var, 2, value2222222222222);
                                    i5 = 2;
                                }
                            case 12:
                                i8 = C0258l.F(((Integer) value).intValue());
                                c0258l.Z(i8 + D3 + i9);
                                Object key22222222222222 = entry.getKey();
                                Object value22222222222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key22222222222222);
                                C0263q.b(c0258l, y0Var, 2, value22222222222222);
                                i5 = 2;
                            case 13:
                                i8 = C0258l.v(((Integer) value).intValue());
                                c0258l.Z(i8 + D3 + i9);
                                Object key222222222222222 = entry.getKey();
                                Object value222222222222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key222222222222222);
                                C0263q.b(c0258l, y0Var, 2, value222222222222222);
                                i5 = 2;
                            case 14:
                                ((Integer) value).getClass();
                                i8 = 4;
                                c0258l.Z(i8 + D3 + i9);
                                Object key2222222222222222 = entry.getKey();
                                Object value2222222222222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key2222222222222222);
                                C0263q.b(c0258l, y0Var, 2, value2222222222222222);
                                i5 = 2;
                            case AbstractC0856c.f8041g /* 15 */:
                                ((Long) value).getClass();
                                c0258l.Z(i8 + D3 + i9);
                                Object key22222222222222222 = entry.getKey();
                                Object value22222222222222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key22222222222222222);
                                C0263q.b(c0258l, y0Var, 2, value22222222222222222);
                                i5 = 2;
                            case 16:
                                int intValue = ((Integer) value).intValue();
                                i8 = C0258l.F((intValue >> 31) ^ (intValue << 1));
                                c0258l.Z(i8 + D3 + i9);
                                Object key222222222222222222 = entry.getKey();
                                Object value222222222222222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key222222222222222222);
                                C0263q.b(c0258l, y0Var, 2, value222222222222222222);
                                i5 = 2;
                            case 17:
                                long longValue = ((Long) value).longValue();
                                i8 = C0258l.H((longValue >> 63) ^ (longValue << 1));
                                c0258l.Z(i8 + D3 + i9);
                                Object key2222222222222222222 = entry.getKey();
                                Object value2222222222222222222 = entry.getValue();
                                C0263q.b(c0258l, w0Var, 1, key2222222222222222222);
                                C0263q.b(c0258l, y0Var, 2, value2222222222222222222);
                                i5 = 2;
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    case 1:
                        ((Float) key).getClass();
                        H3 = 4;
                        int i92 = H3 + D;
                        int D32 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                        H3 = C0258l.H(((Long) key).longValue());
                        int i922 = H3 + D;
                        int D322 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                        H3 = C0258l.H(((Long) key).longValue());
                        int i9222 = H3 + D;
                        int D3222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case k1.i.LONG_FIELD_NUMBER /* 4 */:
                        H3 = C0258l.v(((Integer) key).intValue());
                        int i92222 = H3 + D;
                        int D32222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 5:
                        ((Long) key).getClass();
                        H3 = 8;
                        int i922222 = H3 + D;
                        int D322222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 6:
                        ((Integer) key).getClass();
                        H3 = 4;
                        int i9222222 = H3 + D;
                        int D3222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) key).getClass();
                        H3 = 1;
                        int i92222222 = H3 + D;
                        int D32222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                        H3 = key instanceof C0253g ? C0258l.n((C0253g) key) : C0258l.C((String) key);
                        int i922222222 = H3 + D;
                        int D322222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case AbstractC0856c.f8037c /* 9 */:
                        H3 = ((AbstractC0267v) ((AbstractC0245a) key)).a(null);
                        int i9222222222 = H3 + D;
                        int D3222222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case AbstractC0856c.f8039e /* 10 */:
                        a3 = ((AbstractC0267v) ((AbstractC0245a) key)).a(null);
                        F3 = C0258l.F(a3);
                        H3 = a3 + F3;
                        int i92222222222 = H3 + D;
                        int D32222222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 11:
                        if (key instanceof C0253g) {
                            H3 = C0258l.n((C0253g) key);
                            int i922222222222 = H3 + D;
                            int D322222222222 = C0258l.D(2);
                            y0Var = i6.f5000b;
                            if (y0Var == x0Var) {
                            }
                            switch (y0Var.ordinal()) {
                            }
                        } else {
                            a3 = ((byte[]) key).length;
                            F3 = C0258l.F(a3);
                            H3 = a3 + F3;
                            int i9222222222222 = H3 + D;
                            int D3222222222222 = C0258l.D(2);
                            y0Var = i6.f5000b;
                            if (y0Var == x0Var) {
                            }
                            switch (y0Var.ordinal()) {
                            }
                        }
                    case 12:
                        H3 = C0258l.F(((Integer) key).intValue());
                        int i92222222222222 = H3 + D;
                        int D32222222222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 13:
                        H3 = C0258l.v(((Integer) key).intValue());
                        int i922222222222222 = H3 + D;
                        int D322222222222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 14:
                        ((Integer) key).getClass();
                        H3 = 4;
                        int i9222222222222222 = H3 + D;
                        int D3222222222222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case AbstractC0856c.f8041g /* 15 */:
                        ((Long) key).getClass();
                        H3 = 8;
                        int i92222222222222222 = H3 + D;
                        int D32222222222222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 16:
                        int intValue2 = ((Integer) key).intValue();
                        H3 = C0258l.F((intValue2 >> 31) ^ (intValue2 << 1));
                        int i922222222222222222 = H3 + D;
                        int D322222222222222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
                        if (y0Var == x0Var) {
                        }
                        switch (y0Var.ordinal()) {
                        }
                    case 17:
                        long longValue2 = ((Long) key).longValue();
                        H3 = C0258l.H((longValue2 << 1) ^ (longValue2 >> 63));
                        int i9222222222222222222 = H3 + D;
                        int D3222222222222222222 = C0258l.D(2);
                        y0Var = i6.f5000b;
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
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z3 = true;
            if (i4 >= this.f5018i) {
                return true;
            }
            int i6 = this.f5017h[i4];
            int[] iArr = this.f5010a;
            int i7 = iArr[i6];
            int P3 = P(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i5 = f5009p.getInt(obj, i9);
                }
                i3 = i9;
            }
            if ((268435456 & P3) != 0) {
                if (!(i3 == 1048575 ? q(i6, obj) : (i5 & i10) != 0)) {
                    return false;
                }
            }
            int O3 = O(P3);
            if (O3 == 9 || O3 == 17) {
                if (i3 == 1048575) {
                    z3 = q(i6, obj);
                } else if ((i10 & i5) == 0) {
                    z3 = false;
                }
                if (z3) {
                    if (!n(i6).a(s0.f5126c.i(P3 & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else {
                if (O3 != 27) {
                    if (O3 == 60 || O3 == 68) {
                        if (s(i7, i6, obj)) {
                            if (!n(i6).a(s0.f5126c.i(P3 & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (O3 != 49) {
                        if (O3 != 50) {
                            continue;
                        } else {
                            Object i11 = s0.f5126c.i(P3 & 1048575, obj);
                            this.f5023n.getClass();
                            K k3 = (K) i11;
                            if (!k3.isEmpty() && ((J) m(i6)).f5002a.f5000b.f4980d == B0.MESSAGE) {
                                Z z4 = null;
                                for (Object obj2 : k3.values()) {
                                    if (z4 == null) {
                                        z4 = W.f5029c.a(obj2.getClass());
                                    }
                                    if (!z4.a(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) s0.f5126c.i(P3 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    Z n3 = n(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!n3.a(list.get(i12))) {
                            return false;
                        }
                    }
                }
            }
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void b(Object obj, C0014o c0014o, C0260n c0260n) {
        int O3;
        AbstractC0256j abstractC0256j;
        F f3;
        c0260n.getClass();
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        k0 k0Var = this.f5022m;
        int[] iArr = this.f5017h;
        int i3 = this.f5019j;
        int i4 = this.f5018i;
        j0 j0Var = null;
        while (true) {
            try {
                int c2 = c0014o.c();
                int E3 = E(c2);
                if (E3 >= 0) {
                    int P3 = P(E3);
                    try {
                        O3 = O(P3);
                        abstractC0256j = (AbstractC0256j) c0014o.f431e;
                        f3 = this.f5021l;
                    } catch (C0270y unused) {
                        k0Var.getClass();
                        if (j0Var == null) {
                            j0Var = k0.a(obj);
                        }
                        if (!k0.c(j0Var, c0014o)) {
                            while (i4 < i3) {
                                k(obj, iArr[i4], j0Var);
                                i4++;
                            }
                            if (j0Var == null) {
                                return;
                            }
                            ((AbstractC0267v) obj).unknownFields = j0Var;
                            return;
                        }
                    }
                    switch (O3) {
                        case 0:
                            long B3 = B(P3);
                            c0014o.A(1);
                            s0.f5126c.m(obj, B3, abstractC0256j.h());
                            K(E3, obj);
                            continue;
                        case 1:
                            long B4 = B(P3);
                            c0014o.A(5);
                            s0.f5126c.n(obj, B4, abstractC0256j.l());
                            K(E3, obj);
                            continue;
                        case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                            long B5 = B(P3);
                            c0014o.A(0);
                            s0.r(obj, B5, abstractC0256j.n());
                            K(E3, obj);
                            continue;
                        case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                            long B6 = B(P3);
                            c0014o.A(0);
                            s0.r(obj, B6, abstractC0256j.w());
                            K(E3, obj);
                            continue;
                        case k1.i.LONG_FIELD_NUMBER /* 4 */:
                            long B7 = B(P3);
                            c0014o.A(0);
                            s0.q(abstractC0256j.m(), B7, obj);
                            K(E3, obj);
                            continue;
                        case 5:
                            long B8 = B(P3);
                            c0014o.A(1);
                            s0.r(obj, B8, abstractC0256j.k());
                            K(E3, obj);
                            continue;
                        case 6:
                            long B9 = B(P3);
                            c0014o.A(5);
                            s0.q(abstractC0256j.j(), B9, obj);
                            K(E3, obj);
                            continue;
                        case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            long B10 = B(P3);
                            c0014o.A(0);
                            s0.f5126c.k(obj, B10, abstractC0256j.f());
                            K(E3, obj);
                            continue;
                        case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                            H(obj, P3, c0014o);
                            K(E3, obj);
                            continue;
                        case AbstractC0856c.f8037c /* 9 */:
                            AbstractC0245a abstractC0245a = (AbstractC0245a) x(E3, obj);
                            Z n3 = n(E3);
                            c0014o.A(2);
                            c0014o.g(abstractC0245a, n3, c0260n);
                            M(obj, E3, abstractC0245a);
                            continue;
                        case AbstractC0856c.f8039e /* 10 */:
                            s0.s(B(P3), obj, c0014o.i());
                            K(E3, obj);
                            continue;
                        case 11:
                            long B11 = B(P3);
                            c0014o.A(0);
                            s0.q(abstractC0256j.v(), B11, obj);
                            K(E3, obj);
                            continue;
                        case 12:
                            c0014o.A(0);
                            int i5 = abstractC0256j.i();
                            l(E3);
                            s0.q(i5, B(P3), obj);
                            K(E3, obj);
                            continue;
                        case 13:
                            long B12 = B(P3);
                            c0014o.A(5);
                            s0.q(abstractC0256j.o(), B12, obj);
                            K(E3, obj);
                            continue;
                        case 14:
                            long B13 = B(P3);
                            c0014o.A(1);
                            s0.r(obj, B13, abstractC0256j.p());
                            K(E3, obj);
                            continue;
                        case AbstractC0856c.f8041g /* 15 */:
                            long B14 = B(P3);
                            c0014o.A(0);
                            s0.q(abstractC0256j.q(), B14, obj);
                            K(E3, obj);
                            continue;
                        case 16:
                            long B15 = B(P3);
                            c0014o.A(0);
                            s0.r(obj, B15, abstractC0256j.r());
                            K(E3, obj);
                            continue;
                        case 17:
                            AbstractC0245a abstractC0245a2 = (AbstractC0245a) x(E3, obj);
                            Z n4 = n(E3);
                            c0014o.A(3);
                            c0014o.f(abstractC0245a2, n4, c0260n);
                            M(obj, E3, abstractC0245a2);
                            continue;
                        case 18:
                            c0014o.k(f3.c(B(P3), obj));
                            continue;
                        case 19:
                            c0014o.p(f3.c(B(P3), obj));
                            continue;
                        case 20:
                            c0014o.r(f3.c(B(P3), obj));
                            continue;
                        case 21:
                            c0014o.y(f3.c(B(P3), obj));
                            continue;
                        case 22:
                            c0014o.q(f3.c(B(P3), obj));
                            continue;
                        case 23:
                            c0014o.o(f3.c(B(P3), obj));
                            continue;
                        case 24:
                            c0014o.n(f3.c(B(P3), obj));
                            continue;
                        case 25:
                            c0014o.h(f3.c(B(P3), obj));
                            continue;
                        case 26:
                            I(obj, P3, c0014o);
                            continue;
                        case 27:
                            G(obj, P3, c0014o, n(E3), c0260n);
                            continue;
                        case 28:
                            c0014o.j(f3.c(B(P3), obj));
                            continue;
                        case 29:
                            c0014o.x(f3.c(B(P3), obj));
                            continue;
                        case 30:
                            List c3 = f3.c(B(P3), obj);
                            c0014o.l(c3);
                            l(E3);
                            AbstractC0246a0.z(obj, c2, c3, j0Var, k0Var);
                            continue;
                        case 31:
                            c0014o.s(f3.c(B(P3), obj));
                            continue;
                        case 32:
                            c0014o.t(f3.c(B(P3), obj));
                            continue;
                        case 33:
                            c0014o.u(f3.c(B(P3), obj));
                            continue;
                        case 34:
                            c0014o.v(f3.c(B(P3), obj));
                            continue;
                        case 35:
                            c0014o.k(f3.c(B(P3), obj));
                            continue;
                        case 36:
                            c0014o.p(f3.c(B(P3), obj));
                            continue;
                        case 37:
                            c0014o.r(f3.c(B(P3), obj));
                            continue;
                        case 38:
                            c0014o.y(f3.c(B(P3), obj));
                            continue;
                        case 39:
                            c0014o.q(f3.c(B(P3), obj));
                            continue;
                        case 40:
                            c0014o.o(f3.c(B(P3), obj));
                            continue;
                        case 41:
                            c0014o.n(f3.c(B(P3), obj));
                            continue;
                        case 42:
                            c0014o.h(f3.c(B(P3), obj));
                            continue;
                        case 43:
                            c0014o.x(f3.c(B(P3), obj));
                            continue;
                        case 44:
                            List c4 = f3.c(B(P3), obj);
                            c0014o.l(c4);
                            l(E3);
                            AbstractC0246a0.z(obj, c2, c4, j0Var, k0Var);
                            continue;
                        case 45:
                            c0014o.s(f3.c(B(P3), obj));
                            continue;
                        case 46:
                            c0014o.t(f3.c(B(P3), obj));
                            continue;
                        case 47:
                            c0014o.u(f3.c(B(P3), obj));
                            continue;
                        case 48:
                            c0014o.v(f3.c(B(P3), obj));
                            continue;
                        case 49:
                            F(obj, B(P3), c0014o, n(E3), c0260n);
                            continue;
                        case 50:
                            u(obj, E3, m(E3), c0260n, c0014o);
                            continue;
                        case 51:
                            long B16 = B(P3);
                            c0014o.A(1);
                            s0.s(B16, obj, Double.valueOf(abstractC0256j.h()));
                            L(c2, E3, obj);
                            continue;
                        case 52:
                            long B17 = B(P3);
                            c0014o.A(5);
                            s0.s(B17, obj, Float.valueOf(abstractC0256j.l()));
                            L(c2, E3, obj);
                            continue;
                        case 53:
                            long B18 = B(P3);
                            c0014o.A(0);
                            s0.s(B18, obj, Long.valueOf(abstractC0256j.n()));
                            L(c2, E3, obj);
                            continue;
                        case 54:
                            long B19 = B(P3);
                            c0014o.A(0);
                            s0.s(B19, obj, Long.valueOf(abstractC0256j.w()));
                            L(c2, E3, obj);
                            continue;
                        case 55:
                            long B20 = B(P3);
                            c0014o.A(0);
                            s0.s(B20, obj, Integer.valueOf(abstractC0256j.m()));
                            L(c2, E3, obj);
                            continue;
                        case 56:
                            long B21 = B(P3);
                            c0014o.A(1);
                            s0.s(B21, obj, Long.valueOf(abstractC0256j.k()));
                            L(c2, E3, obj);
                            continue;
                        case 57:
                            long B22 = B(P3);
                            c0014o.A(5);
                            s0.s(B22, obj, Integer.valueOf(abstractC0256j.j()));
                            L(c2, E3, obj);
                            continue;
                        case 58:
                            long B23 = B(P3);
                            c0014o.A(0);
                            s0.s(B23, obj, Boolean.valueOf(abstractC0256j.f()));
                            L(c2, E3, obj);
                            continue;
                        case 59:
                            H(obj, P3, c0014o);
                            L(c2, E3, obj);
                            continue;
                        case 60:
                            AbstractC0245a abstractC0245a3 = (AbstractC0245a) y(c2, E3, obj);
                            Z n5 = n(E3);
                            c0014o.A(2);
                            c0014o.g(abstractC0245a3, n5, c0260n);
                            N(obj, c2, E3, abstractC0245a3);
                            continue;
                        case 61:
                            s0.s(B(P3), obj, c0014o.i());
                            L(c2, E3, obj);
                            continue;
                        case 62:
                            long B24 = B(P3);
                            c0014o.A(0);
                            s0.s(B24, obj, Integer.valueOf(abstractC0256j.v()));
                            L(c2, E3, obj);
                            continue;
                        case 63:
                            c0014o.A(0);
                            int i6 = abstractC0256j.i();
                            l(E3);
                            s0.s(B(P3), obj, Integer.valueOf(i6));
                            L(c2, E3, obj);
                            continue;
                        case 64:
                            long B25 = B(P3);
                            c0014o.A(5);
                            s0.s(B25, obj, Integer.valueOf(abstractC0256j.o()));
                            L(c2, E3, obj);
                            continue;
                        case 65:
                            long B26 = B(P3);
                            c0014o.A(1);
                            s0.s(B26, obj, Long.valueOf(abstractC0256j.p()));
                            L(c2, E3, obj);
                            continue;
                        case 66:
                            long B27 = B(P3);
                            c0014o.A(0);
                            s0.s(B27, obj, Integer.valueOf(abstractC0256j.q()));
                            L(c2, E3, obj);
                            continue;
                        case 67:
                            long B28 = B(P3);
                            c0014o.A(0);
                            s0.s(B28, obj, Long.valueOf(abstractC0256j.r()));
                            L(c2, E3, obj);
                            continue;
                        case 68:
                            AbstractC0245a abstractC0245a4 = (AbstractC0245a) y(c2, E3, obj);
                            Z n6 = n(E3);
                            c0014o.A(3);
                            c0014o.f(abstractC0245a4, n6, c0260n);
                            N(obj, c2, E3, abstractC0245a4);
                            continue;
                        default:
                            if (j0Var == null) {
                                k0Var.getClass();
                                j0Var = k0.a(obj);
                            }
                            k0Var.getClass();
                            if (!k0.c(j0Var, c0014o)) {
                                while (i4 < i3) {
                                    k(obj, iArr[i4], j0Var);
                                    i4++;
                                }
                                if (j0Var == null) {
                                    return;
                                }
                            }
                            break;
                    }
                } else if (c2 == Integer.MAX_VALUE) {
                    while (i4 < i3) {
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
                    if (!k0.c(j0Var, c0014o)) {
                        while (i4 < i3) {
                            k(obj, iArr[i4], j0Var);
                            i4++;
                        }
                        if (j0Var == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i4 < i3) {
                    k(obj, iArr[i4], j0Var);
                    i4++;
                }
                if (j0Var != null) {
                    k0Var.getClass();
                    ((AbstractC0267v) obj).unknownFields = j0Var;
                }
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void c(Object obj, Object obj2) {
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f5010a;
            if (i3 >= iArr.length) {
                AbstractC0246a0.B(this.f5022m, obj, obj2);
                return;
            }
            int P3 = P(i3);
            long j3 = 1048575 & P3;
            int i4 = iArr[i3];
            switch (O(P3)) {
                case 0:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        r0 r0Var = s0.f5126c;
                        r0Var.m(obj, j3, r0Var.e(j3, obj2));
                        K(i3, obj);
                        break;
                    }
                case 1:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        r0 r0Var2 = s0.f5126c;
                        r0Var2.n(obj, j3, r0Var2.f(j3, obj2));
                        K(i3, obj);
                        break;
                    }
                case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.r(obj, j3, s0.f5126c.h(j3, obj2));
                        K(i3, obj);
                        break;
                    }
                case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.r(obj, j3, s0.f5126c.h(j3, obj2));
                        K(i3, obj);
                        break;
                    }
                case k1.i.LONG_FIELD_NUMBER /* 4 */:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5126c.g(j3, obj2), j3, obj);
                        K(i3, obj);
                        break;
                    }
                case 5:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.r(obj, j3, s0.f5126c.h(j3, obj2));
                        K(i3, obj);
                        break;
                    }
                case 6:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5126c.g(j3, obj2), j3, obj);
                        K(i3, obj);
                        break;
                    }
                case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        r0 r0Var3 = s0.f5126c;
                        r0Var3.k(obj, j3, r0Var3.c(j3, obj2));
                        K(i3, obj);
                        break;
                    }
                case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.s(j3, obj, s0.f5126c.i(j3, obj2));
                        K(i3, obj);
                        break;
                    }
                case AbstractC0856c.f8037c /* 9 */:
                    v(obj, i3, obj2);
                    break;
                case AbstractC0856c.f8039e /* 10 */:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.s(j3, obj, s0.f5126c.i(j3, obj2));
                        K(i3, obj);
                        break;
                    }
                case 11:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5126c.g(j3, obj2), j3, obj);
                        K(i3, obj);
                        break;
                    }
                case 12:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5126c.g(j3, obj2), j3, obj);
                        K(i3, obj);
                        break;
                    }
                case 13:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5126c.g(j3, obj2), j3, obj);
                        K(i3, obj);
                        break;
                    }
                case 14:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.r(obj, j3, s0.f5126c.h(j3, obj2));
                        K(i3, obj);
                        break;
                    }
                case AbstractC0856c.f8041g /* 15 */:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.q(s0.f5126c.g(j3, obj2), j3, obj);
                        K(i3, obj);
                        break;
                    }
                case 16:
                    if (!q(i3, obj2)) {
                        break;
                    } else {
                        s0.r(obj, j3, s0.f5126c.h(j3, obj2));
                        K(i3, obj);
                        break;
                    }
                case 17:
                    v(obj, i3, obj2);
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
                    this.f5021l.b(j3, obj, obj2);
                    break;
                case 50:
                    Class cls = AbstractC0246a0.f5039a;
                    r0 r0Var4 = s0.f5126c;
                    Object i5 = r0Var4.i(j3, obj);
                    Object i6 = r0Var4.i(j3, obj2);
                    this.f5023n.getClass();
                    s0.s(j3, obj, L.b(i5, i6));
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
                    if (!s(i4, i3, obj2)) {
                        break;
                    } else {
                        s0.s(j3, obj, s0.f5126c.i(j3, obj2));
                        L(i4, i3, obj);
                        break;
                    }
                case 60:
                    w(obj, i3, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!s(i4, i3, obj2)) {
                        break;
                    } else {
                        s0.s(j3, obj, s0.f5126c.i(j3, obj2));
                        L(i4, i3, obj);
                        break;
                    }
                case 68:
                    w(obj, i3, obj2);
                    break;
            }
            i3 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void d(Object obj, H h3) {
        h3.getClass();
        if (!this.f5016g) {
            Q(obj, h3);
            return;
        }
        int[] iArr = this.f5010a;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int P3 = P(i3);
            int i4 = iArr[i3];
            switch (O(P3)) {
                case 0:
                    if (q(i3, obj)) {
                        h3.c(s0.f5126c.e(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i3, obj)) {
                        h3.g(s0.f5126c.f(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if (q(i3, obj)) {
                        h3.j(s0.f5126c.h(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (q(i3, obj)) {
                        h3.q(s0.f5126c.h(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case k1.i.LONG_FIELD_NUMBER /* 4 */:
                    if (q(i3, obj)) {
                        h3.i(i4, s0.f5126c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i3, obj)) {
                        h3.f(s0.f5126c.h(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i3, obj)) {
                        h3.e(i4, s0.f5126c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (q(i3, obj)) {
                        h3.a(i4, s0.f5126c.c(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (q(i3, obj)) {
                        S(i4, s0.f5126c.i(P3 & 1048575, obj), h3);
                        break;
                    } else {
                        break;
                    }
                case AbstractC0856c.f8037c /* 9 */:
                    if (q(i3, obj)) {
                        h3.k(i4, s0.f5126c.i(P3 & 1048575, obj), n(i3));
                        break;
                    } else {
                        break;
                    }
                case AbstractC0856c.f8039e /* 10 */:
                    if (q(i3, obj)) {
                        h3.b(i4, (C0253g) s0.f5126c.i(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i3, obj)) {
                        h3.p(i4, s0.f5126c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i3, obj)) {
                        h3.d(i4, s0.f5126c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i3, obj)) {
                        h3.l(i4, s0.f5126c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i3, obj)) {
                        h3.m(s0.f5126c.h(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case AbstractC0856c.f8041g /* 15 */:
                    if (q(i3, obj)) {
                        h3.n(i4, s0.f5126c.g(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i3, obj)) {
                        h3.o(s0.f5126c.h(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i3, obj)) {
                        h3.h(i4, s0.f5126c.i(P3 & 1048575, obj), n(i3));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    AbstractC0246a0.F(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 19:
                    AbstractC0246a0.J(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 20:
                    AbstractC0246a0.M(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 21:
                    AbstractC0246a0.U(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 22:
                    AbstractC0246a0.L(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 23:
                    AbstractC0246a0.I(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 24:
                    AbstractC0246a0.H(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 25:
                    AbstractC0246a0.D(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 26:
                    AbstractC0246a0.S(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3);
                    break;
                case 27:
                    AbstractC0246a0.N(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, n(i3));
                    break;
                case 28:
                    AbstractC0246a0.E(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3);
                    break;
                case 29:
                    AbstractC0246a0.T(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 30:
                    AbstractC0246a0.G(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 31:
                    AbstractC0246a0.O(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 32:
                    AbstractC0246a0.P(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 33:
                    AbstractC0246a0.Q(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 34:
                    AbstractC0246a0.R(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, false);
                    break;
                case 35:
                    AbstractC0246a0.F(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 36:
                    AbstractC0246a0.J(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 37:
                    AbstractC0246a0.M(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 38:
                    AbstractC0246a0.U(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 39:
                    AbstractC0246a0.L(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 40:
                    AbstractC0246a0.I(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 41:
                    AbstractC0246a0.H(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 42:
                    AbstractC0246a0.D(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 43:
                    AbstractC0246a0.T(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 44:
                    AbstractC0246a0.G(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 45:
                    AbstractC0246a0.O(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 46:
                    AbstractC0246a0.P(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 47:
                    AbstractC0246a0.Q(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 48:
                    AbstractC0246a0.R(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, true);
                    break;
                case 49:
                    AbstractC0246a0.K(iArr[i3], (List) s0.f5126c.i(P3 & 1048575, obj), h3, n(i3));
                    break;
                case 50:
                    R(h3, i4, s0.f5126c.i(P3 & 1048575, obj), i3);
                    break;
                case 51:
                    if (s(i4, i3, obj)) {
                        h3.c(((Double) s0.f5126c.i(P3 & 1048575, obj)).doubleValue(), i4);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i4, i3, obj)) {
                        h3.g(((Float) s0.f5126c.i(P3 & 1048575, obj)).floatValue(), i4);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i4, i3, obj)) {
                        h3.j(D(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i4, i3, obj)) {
                        h3.q(D(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i4, i3, obj)) {
                        h3.i(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i4, i3, obj)) {
                        h3.f(D(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i4, i3, obj)) {
                        h3.e(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i4, i3, obj)) {
                        h3.a(i4, ((Boolean) s0.f5126c.i(P3 & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i4, i3, obj)) {
                        S(i4, s0.f5126c.i(P3 & 1048575, obj), h3);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(i4, i3, obj)) {
                        h3.k(i4, s0.f5126c.i(P3 & 1048575, obj), n(i3));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i4, i3, obj)) {
                        h3.b(i4, (C0253g) s0.f5126c.i(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i4, i3, obj)) {
                        h3.p(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i4, i3, obj)) {
                        h3.d(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i4, i3, obj)) {
                        h3.l(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i4, i3, obj)) {
                        h3.m(D(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i4, i3, obj)) {
                        h3.n(i4, C(P3 & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i4, i3, obj)) {
                        h3.o(D(P3 & 1048575, obj), i4);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i4, i3, obj)) {
                        h3.h(i4, s0.f5126c.i(P3 & 1048575, obj), n(i3));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f5022m.getClass();
        ((AbstractC0267v) obj).unknownFields.d(h3);
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
    public final int e(AbstractC0267v abstractC0267v) {
        int i3;
        int b3;
        int i4;
        int[] iArr = this.f5010a;
        int length = iArr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int P3 = P(i6);
            int i7 = iArr[i6];
            long j3 = 1048575 & P3;
            int i8 = 1237;
            int i9 = 37;
            switch (O(P3)) {
                case 0:
                    i3 = i5 * 53;
                    b3 = AbstractC0269x.b(Double.doubleToLongBits(s0.f5126c.e(j3, abstractC0267v)));
                    i5 = b3 + i3;
                    break;
                case 1:
                    i3 = i5 * 53;
                    b3 = Float.floatToIntBits(s0.f5126c.f(j3, abstractC0267v));
                    i5 = b3 + i3;
                    break;
                case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                    i3 = i5 * 53;
                    b3 = AbstractC0269x.b(s0.f5126c.h(j3, abstractC0267v));
                    i5 = b3 + i3;
                    break;
                case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                    i3 = i5 * 53;
                    b3 = AbstractC0269x.b(s0.f5126c.h(j3, abstractC0267v));
                    i5 = b3 + i3;
                    break;
                case k1.i.LONG_FIELD_NUMBER /* 4 */:
                    i3 = i5 * 53;
                    b3 = s0.f5126c.g(j3, abstractC0267v);
                    i5 = b3 + i3;
                    break;
                case 5:
                    i3 = i5 * 53;
                    b3 = AbstractC0269x.b(s0.f5126c.h(j3, abstractC0267v));
                    i5 = b3 + i3;
                    break;
                case 6:
                    i3 = i5 * 53;
                    b3 = s0.f5126c.g(j3, abstractC0267v);
                    i5 = b3 + i3;
                    break;
                case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    i4 = i5 * 53;
                    boolean c2 = s0.f5126c.c(j3, abstractC0267v);
                    Charset charset = AbstractC0269x.f5135a;
                    break;
                case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                    i3 = i5 * 53;
                    b3 = ((String) s0.f5126c.i(j3, abstractC0267v)).hashCode();
                    i5 = b3 + i3;
                    break;
                case AbstractC0856c.f8037c /* 9 */:
                    Object i10 = s0.f5126c.i(j3, abstractC0267v);
                    if (i10 != null) {
                        i9 = i10.hashCode();
                    }
                    i5 = (i5 * 53) + i9;
                    break;
                case AbstractC0856c.f8039e /* 10 */:
                    i3 = i5 * 53;
                    b3 = s0.f5126c.i(j3, abstractC0267v).hashCode();
                    i5 = b3 + i3;
                    break;
                case 11:
                    i3 = i5 * 53;
                    b3 = s0.f5126c.g(j3, abstractC0267v);
                    i5 = b3 + i3;
                    break;
                case 12:
                    i3 = i5 * 53;
                    b3 = s0.f5126c.g(j3, abstractC0267v);
                    i5 = b3 + i3;
                    break;
                case 13:
                    i3 = i5 * 53;
                    b3 = s0.f5126c.g(j3, abstractC0267v);
                    i5 = b3 + i3;
                    break;
                case 14:
                    i3 = i5 * 53;
                    b3 = AbstractC0269x.b(s0.f5126c.h(j3, abstractC0267v));
                    i5 = b3 + i3;
                    break;
                case AbstractC0856c.f8041g /* 15 */:
                    i3 = i5 * 53;
                    b3 = s0.f5126c.g(j3, abstractC0267v);
                    i5 = b3 + i3;
                    break;
                case 16:
                    i3 = i5 * 53;
                    b3 = AbstractC0269x.b(s0.f5126c.h(j3, abstractC0267v));
                    i5 = b3 + i3;
                    break;
                case 17:
                    Object i11 = s0.f5126c.i(j3, abstractC0267v);
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
                    i3 = i5 * 53;
                    b3 = s0.f5126c.i(j3, abstractC0267v).hashCode();
                    i5 = b3 + i3;
                    break;
                case 50:
                    i3 = i5 * 53;
                    b3 = s0.f5126c.i(j3, abstractC0267v).hashCode();
                    i5 = b3 + i3;
                    break;
                case 51:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0269x.b(Double.doubleToLongBits(((Double) s0.f5126c.i(j3, abstractC0267v)).doubleValue()));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = Float.floatToIntBits(((Float) s0.f5126c.i(j3, abstractC0267v)).floatValue());
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0269x.b(D(j3, abstractC0267v));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0269x.b(D(j3, abstractC0267v));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = C(j3, abstractC0267v);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0269x.b(D(j3, abstractC0267v));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = C(j3, abstractC0267v);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i7, i6, abstractC0267v)) {
                        i4 = i5 * 53;
                        boolean booleanValue = ((Boolean) s0.f5126c.i(j3, abstractC0267v)).booleanValue();
                        Charset charset2 = AbstractC0269x.f5135a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = ((String) s0.f5126c.i(j3, abstractC0267v)).hashCode();
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = s0.f5126c.i(j3, abstractC0267v).hashCode();
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = s0.f5126c.i(j3, abstractC0267v).hashCode();
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = C(j3, abstractC0267v);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = C(j3, abstractC0267v);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = C(j3, abstractC0267v);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0269x.b(D(j3, abstractC0267v));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = C(j3, abstractC0267v);
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = AbstractC0269x.b(D(j3, abstractC0267v));
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i7, i6, abstractC0267v)) {
                        i3 = i5 * 53;
                        b3 = s0.f5126c.i(j3, abstractC0267v).hashCode();
                        i5 = b3 + i3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f5022m.getClass();
        return abstractC0267v.unknownFields.hashCode() + (i5 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final int f(AbstractC0267v abstractC0267v) {
        return this.f5016g ? p(abstractC0267v) : o(abstractC0267v);
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final AbstractC0267v g() {
        this.f5020k.getClass();
        return ((AbstractC0267v) this.f5014e).k();
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public final void h(Object obj) {
        if (r(obj)) {
            if (obj instanceof AbstractC0267v) {
                AbstractC0267v abstractC0267v = (AbstractC0267v) obj;
                abstractC0267v.d();
                abstractC0267v.c();
                abstractC0267v.j();
            }
            int[] iArr = this.f5010a;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int P3 = P(i3);
                long j3 = 1048575 & P3;
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
                                this.f5021l.a(j3, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f5009p;
                                Object object = unsafe.getObject(obj, j3);
                                if (object != null) {
                                    this.f5023n.getClass();
                                    L.c(object);
                                    unsafe.putObject(obj, j3, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (s(iArr[i3], i3, obj)) {
                        n(i3).h(f5009p.getObject(obj, j3));
                    }
                }
                if (q(i3, obj)) {
                    n(i3).h(f5009p.getObject(obj, j3));
                }
            }
            this.f5022m.getClass();
            k0.b(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC0246a0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.AbstractC0246a0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC0246a0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.AbstractC0246a0.C(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.AbstractC0246a0.C(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(AbstractC0267v abstractC0267v, Object obj) {
        int[] iArr = this.f5010a;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 >= length) {
                this.f5022m.getClass();
                return abstractC0267v.unknownFields.equals(((AbstractC0267v) obj).unknownFields);
            }
            int P3 = P(i3);
            long j3 = P3 & 1048575;
            switch (O(P3)) {
                case 0:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case 1:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var2 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var3 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var4 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case k1.i.LONG_FIELD_NUMBER /* 4 */:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var5 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case 5:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var6 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case 6:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var7 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var8 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var9 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case AbstractC0856c.f8037c /* 9 */:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var10 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case AbstractC0856c.f8039e /* 10 */:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var11 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case 11:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var12 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case 12:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var13 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case 13:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var14 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case 14:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var15 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case AbstractC0856c.f8041g /* 15 */:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var16 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case 16:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var17 = s0.f5126c;
                        break;
                    }
                    z3 = false;
                    break;
                case 17:
                    if (j(abstractC0267v, obj, i3)) {
                        r0 r0Var18 = s0.f5126c;
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
                    r0 r0Var19 = s0.f5126c;
                    z3 = AbstractC0246a0.C(r0Var19.i(j3, abstractC0267v), r0Var19.i(j3, obj));
                    break;
                case 50:
                    r0 r0Var20 = s0.f5126c;
                    z3 = AbstractC0246a0.C(r0Var20.i(j3, abstractC0267v), r0Var20.i(j3, obj));
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
                    long j4 = iArr[i3 + 2] & 1048575;
                    r0 r0Var21 = s0.f5126c;
                    if (r0Var21.g(j4, abstractC0267v) == r0Var21.g(j4, obj)) {
                        break;
                    }
                    z3 = false;
                    break;
            }
            if (!z3) {
                return false;
            }
            i3 += 3;
        }
    }

    public final boolean j(AbstractC0267v abstractC0267v, Object obj, int i3) {
        return q(i3, abstractC0267v) == q(i3, obj);
    }

    public final void k(Object obj, int i3, Object obj2) {
        int i4 = this.f5010a[i3];
        if (s0.f5126c.i(P(i3) & 1048575, obj) == null) {
            return;
        }
        l(i3);
    }

    public final void l(int i3) {
        if (this.f5011b[((i3 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i3) {
        return this.f5011b[(i3 / 3) * 2];
    }

    public final Z n(int i3) {
        int i4 = (i3 / 3) * 2;
        Object[] objArr = this.f5011b;
        Z z3 = (Z) objArr[i4];
        if (z3 != null) {
            return z3;
        }
        Z a3 = W.f5029c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a3;
        return a3;
    }

    public final int o(AbstractC0267v abstractC0267v) {
        int i3;
        int o3;
        int m3;
        Unsafe unsafe = f5009p;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = this.f5010a;
            if (i4 >= iArr.length) {
                this.f5022m.getClass();
                return abstractC0267v.unknownFields.b() + i5;
            }
            int P3 = P(i4);
            int i8 = iArr[i4];
            int O3 = O(P3);
            if (O3 <= 17) {
                int i9 = iArr[i4 + 2];
                int i10 = i9 & 1048575;
                i3 = 1 << (i9 >>> 20);
                if (i10 != i7) {
                    i6 = unsafe.getInt(abstractC0267v, i10);
                    i7 = i10;
                }
            } else {
                i3 = 0;
            }
            long j3 = P3 & 1048575;
            switch (O3) {
                case 0:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.o(i8);
                        i5 += o3;
                        break;
                    }
                case 1:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.s(i8);
                        i5 += o3;
                        break;
                    }
                case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.w(unsafe.getLong(abstractC0267v, j3), i8);
                        i5 += o3;
                        break;
                    }
                case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.G(unsafe.getLong(abstractC0267v, j3), i8);
                        i5 += o3;
                        break;
                    }
                case k1.i.LONG_FIELD_NUMBER /* 4 */:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.u(i8, unsafe.getInt(abstractC0267v, j3));
                        i5 += o3;
                        break;
                    }
                case 5:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.r(i8);
                        i5 += o3;
                        break;
                    }
                case 6:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.q(i8);
                        i5 += o3;
                        break;
                    }
                case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.l(i8);
                        i5 += o3;
                        break;
                    }
                case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0267v, j3);
                        m3 = object instanceof C0253g ? C0258l.m(i8, (C0253g) object) : C0258l.B((String) object, i8);
                        i5 = m3 + i5;
                        break;
                    }
                case AbstractC0856c.f8037c /* 9 */:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = AbstractC0246a0.o(i8, unsafe.getObject(abstractC0267v, j3), n(i4));
                        i5 += o3;
                        break;
                    }
                case AbstractC0856c.f8039e /* 10 */:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.m(i8, (C0253g) unsafe.getObject(abstractC0267v, j3));
                        i5 += o3;
                        break;
                    }
                case 11:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.E(i8, unsafe.getInt(abstractC0267v, j3));
                        i5 += o3;
                        break;
                    }
                case 12:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.p(i8, unsafe.getInt(abstractC0267v, j3));
                        i5 += o3;
                        break;
                    }
                case 13:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.x(i8);
                        i5 += o3;
                        break;
                    }
                case 14:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.y(i8);
                        i5 += o3;
                        break;
                    }
                case AbstractC0856c.f8041g /* 15 */:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.z(i8, unsafe.getInt(abstractC0267v, j3));
                        i5 += o3;
                        break;
                    }
                case 16:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.A(unsafe.getLong(abstractC0267v, j3), i8);
                        i5 += o3;
                        break;
                    }
                case 17:
                    if ((i3 & i6) == 0) {
                        break;
                    } else {
                        o3 = C0258l.t(i8, (AbstractC0245a) unsafe.getObject(abstractC0267v, j3), n(i4));
                        i5 += o3;
                        break;
                    }
                case 18:
                    o3 = AbstractC0246a0.h(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 19:
                    o3 = AbstractC0246a0.f(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 20:
                    o3 = AbstractC0246a0.m(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 21:
                    o3 = AbstractC0246a0.x(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 22:
                    o3 = AbstractC0246a0.k(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 23:
                    o3 = AbstractC0246a0.h(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 24:
                    o3 = AbstractC0246a0.f(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 25:
                    o3 = AbstractC0246a0.a(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 26:
                    o3 = AbstractC0246a0.u(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 27:
                    o3 = AbstractC0246a0.p(i8, (List) unsafe.getObject(abstractC0267v, j3), n(i4));
                    i5 += o3;
                    break;
                case 28:
                    o3 = AbstractC0246a0.c(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 29:
                    o3 = AbstractC0246a0.v(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 30:
                    o3 = AbstractC0246a0.d(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 31:
                    o3 = AbstractC0246a0.f(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 32:
                    o3 = AbstractC0246a0.h(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 33:
                    o3 = AbstractC0246a0.q(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 34:
                    o3 = AbstractC0246a0.s(i8, (List) unsafe.getObject(abstractC0267v, j3));
                    i5 += o3;
                    break;
                case 35:
                    int i11 = AbstractC0246a0.i((List) unsafe.getObject(abstractC0267v, j3));
                    if (i11 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(i11, C0258l.D(i8), i11, i5);
                        break;
                    }
                case 36:
                    int g3 = AbstractC0246a0.g((List) unsafe.getObject(abstractC0267v, j3));
                    if (g3 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(g3, C0258l.D(i8), g3, i5);
                        break;
                    }
                case 37:
                    int n3 = AbstractC0246a0.n((List) unsafe.getObject(abstractC0267v, j3));
                    if (n3 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(n3, C0258l.D(i8), n3, i5);
                        break;
                    }
                case 38:
                    int y3 = AbstractC0246a0.y((List) unsafe.getObject(abstractC0267v, j3));
                    if (y3 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(y3, C0258l.D(i8), y3, i5);
                        break;
                    }
                case 39:
                    int l3 = AbstractC0246a0.l((List) unsafe.getObject(abstractC0267v, j3));
                    if (l3 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(l3, C0258l.D(i8), l3, i5);
                        break;
                    }
                case 40:
                    int i12 = AbstractC0246a0.i((List) unsafe.getObject(abstractC0267v, j3));
                    if (i12 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(i12, C0258l.D(i8), i12, i5);
                        break;
                    }
                case 41:
                    int g4 = AbstractC0246a0.g((List) unsafe.getObject(abstractC0267v, j3));
                    if (g4 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(g4, C0258l.D(i8), g4, i5);
                        break;
                    }
                case 42:
                    int b3 = AbstractC0246a0.b((List) unsafe.getObject(abstractC0267v, j3));
                    if (b3 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(b3, C0258l.D(i8), b3, i5);
                        break;
                    }
                case 43:
                    int w2 = AbstractC0246a0.w((List) unsafe.getObject(abstractC0267v, j3));
                    if (w2 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(w2, C0258l.D(i8), w2, i5);
                        break;
                    }
                case 44:
                    int e3 = AbstractC0246a0.e((List) unsafe.getObject(abstractC0267v, j3));
                    if (e3 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(e3, C0258l.D(i8), e3, i5);
                        break;
                    }
                case 45:
                    int g5 = AbstractC0246a0.g((List) unsafe.getObject(abstractC0267v, j3));
                    if (g5 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(g5, C0258l.D(i8), g5, i5);
                        break;
                    }
                case 46:
                    int i13 = AbstractC0246a0.i((List) unsafe.getObject(abstractC0267v, j3));
                    if (i13 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(i13, C0258l.D(i8), i13, i5);
                        break;
                    }
                case 47:
                    int r3 = AbstractC0246a0.r((List) unsafe.getObject(abstractC0267v, j3));
                    if (r3 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(r3, C0258l.D(i8), r3, i5);
                        break;
                    }
                case 48:
                    int t3 = AbstractC0246a0.t((List) unsafe.getObject(abstractC0267v, j3));
                    if (t3 <= 0) {
                        break;
                    } else {
                        i5 = A.k.b(t3, C0258l.D(i8), t3, i5);
                        break;
                    }
                case 49:
                    o3 = AbstractC0246a0.j(i8, (List) unsafe.getObject(abstractC0267v, j3), n(i4));
                    i5 += o3;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0267v, j3);
                    Object m4 = m(i4);
                    this.f5023n.getClass();
                    o3 = L.a(object2, i8, m4);
                    i5 += o3;
                    break;
                case 51:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.o(i8);
                        i5 += o3;
                        break;
                    }
                case 52:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.s(i8);
                        i5 += o3;
                        break;
                    }
                case 53:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.w(D(j3, abstractC0267v), i8);
                        i5 += o3;
                        break;
                    }
                case 54:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.G(D(j3, abstractC0267v), i8);
                        i5 += o3;
                        break;
                    }
                case 55:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.u(i8, C(j3, abstractC0267v));
                        i5 += o3;
                        break;
                    }
                case 56:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.r(i8);
                        i5 += o3;
                        break;
                    }
                case 57:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.q(i8);
                        i5 += o3;
                        break;
                    }
                case 58:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.l(i8);
                        i5 += o3;
                        break;
                    }
                case 59:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0267v, j3);
                        m3 = object3 instanceof C0253g ? C0258l.m(i8, (C0253g) object3) : C0258l.B((String) object3, i8);
                        i5 = m3 + i5;
                        break;
                    }
                case 60:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = AbstractC0246a0.o(i8, unsafe.getObject(abstractC0267v, j3), n(i4));
                        i5 += o3;
                        break;
                    }
                case 61:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.m(i8, (C0253g) unsafe.getObject(abstractC0267v, j3));
                        i5 += o3;
                        break;
                    }
                case 62:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.E(i8, C(j3, abstractC0267v));
                        i5 += o3;
                        break;
                    }
                case 63:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.p(i8, C(j3, abstractC0267v));
                        i5 += o3;
                        break;
                    }
                case 64:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.x(i8);
                        i5 += o3;
                        break;
                    }
                case 65:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.y(i8);
                        i5 += o3;
                        break;
                    }
                case 66:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.z(i8, C(j3, abstractC0267v));
                        i5 += o3;
                        break;
                    }
                case 67:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.A(D(j3, abstractC0267v), i8);
                        i5 += o3;
                        break;
                    }
                case 68:
                    if (!s(i8, i4, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.t(i8, (AbstractC0245a) unsafe.getObject(abstractC0267v, j3), n(i4));
                        i5 += o3;
                        break;
                    }
            }
            i4 += 3;
        }
    }

    public final int p(AbstractC0267v abstractC0267v) {
        int o3;
        Unsafe unsafe = f5009p;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f5010a;
            if (i3 >= iArr.length) {
                this.f5022m.getClass();
                return abstractC0267v.unknownFields.b() + i4;
            }
            int P3 = P(i3);
            int O3 = O(P3);
            int i5 = iArr[i3];
            long j3 = P3 & 1048575;
            if (O3 >= r.f5116e.a() && O3 <= r.f5117f.a()) {
                int i6 = iArr[i3 + 2];
            }
            switch (O3) {
                case 0:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.o(i5);
                        break;
                    }
                case 1:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.s(i5);
                        break;
                    }
                case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.w(s0.k(abstractC0267v, j3), i5);
                        break;
                    }
                case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.G(s0.k(abstractC0267v, j3), i5);
                        break;
                    }
                case k1.i.LONG_FIELD_NUMBER /* 4 */:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.u(i5, s0.j(abstractC0267v, j3));
                        break;
                    }
                case 5:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.r(i5);
                        break;
                    }
                case 6:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.q(i5);
                        break;
                    }
                case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.l(i5);
                        break;
                    }
                case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        Object l3 = s0.l(abstractC0267v, j3);
                        if (!(l3 instanceof C0253g)) {
                            o3 = C0258l.B((String) l3, i5);
                            break;
                        } else {
                            o3 = C0258l.m(i5, (C0253g) l3);
                            break;
                        }
                    }
                case AbstractC0856c.f8037c /* 9 */:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = AbstractC0246a0.o(i5, s0.l(abstractC0267v, j3), n(i3));
                        break;
                    }
                case AbstractC0856c.f8039e /* 10 */:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.m(i5, (C0253g) s0.l(abstractC0267v, j3));
                        break;
                    }
                case 11:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.E(i5, s0.j(abstractC0267v, j3));
                        break;
                    }
                case 12:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.p(i5, s0.j(abstractC0267v, j3));
                        break;
                    }
                case 13:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.x(i5);
                        break;
                    }
                case 14:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.y(i5);
                        break;
                    }
                case AbstractC0856c.f8041g /* 15 */:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.z(i5, s0.j(abstractC0267v, j3));
                        break;
                    }
                case 16:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.A(s0.k(abstractC0267v, j3), i5);
                        break;
                    }
                case 17:
                    if (!q(i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.t(i5, (AbstractC0245a) s0.l(abstractC0267v, j3), n(i3));
                        break;
                    }
                case 18:
                    o3 = AbstractC0246a0.h(i5, t(abstractC0267v, j3));
                    break;
                case 19:
                    o3 = AbstractC0246a0.f(i5, t(abstractC0267v, j3));
                    break;
                case 20:
                    o3 = AbstractC0246a0.m(i5, t(abstractC0267v, j3));
                    break;
                case 21:
                    o3 = AbstractC0246a0.x(i5, t(abstractC0267v, j3));
                    break;
                case 22:
                    o3 = AbstractC0246a0.k(i5, t(abstractC0267v, j3));
                    break;
                case 23:
                    o3 = AbstractC0246a0.h(i5, t(abstractC0267v, j3));
                    break;
                case 24:
                    o3 = AbstractC0246a0.f(i5, t(abstractC0267v, j3));
                    break;
                case 25:
                    o3 = AbstractC0246a0.a(i5, t(abstractC0267v, j3));
                    break;
                case 26:
                    o3 = AbstractC0246a0.u(i5, t(abstractC0267v, j3));
                    break;
                case 27:
                    o3 = AbstractC0246a0.p(i5, t(abstractC0267v, j3), n(i3));
                    break;
                case 28:
                    o3 = AbstractC0246a0.c(i5, t(abstractC0267v, j3));
                    break;
                case 29:
                    o3 = AbstractC0246a0.v(i5, t(abstractC0267v, j3));
                    break;
                case 30:
                    o3 = AbstractC0246a0.d(i5, t(abstractC0267v, j3));
                    break;
                case 31:
                    o3 = AbstractC0246a0.f(i5, t(abstractC0267v, j3));
                    break;
                case 32:
                    o3 = AbstractC0246a0.h(i5, t(abstractC0267v, j3));
                    break;
                case 33:
                    o3 = AbstractC0246a0.q(i5, t(abstractC0267v, j3));
                    break;
                case 34:
                    o3 = AbstractC0246a0.s(i5, t(abstractC0267v, j3));
                    break;
                case 35:
                    int i7 = AbstractC0246a0.i((List) unsafe.getObject(abstractC0267v, j3));
                    if (i7 > 0) {
                        i4 = A.k.b(i7, C0258l.D(i5), i7, i4);
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    int g3 = AbstractC0246a0.g((List) unsafe.getObject(abstractC0267v, j3));
                    if (g3 > 0) {
                        i4 = A.k.b(g3, C0258l.D(i5), g3, i4);
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    int n3 = AbstractC0246a0.n((List) unsafe.getObject(abstractC0267v, j3));
                    if (n3 > 0) {
                        i4 = A.k.b(n3, C0258l.D(i5), n3, i4);
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    int y3 = AbstractC0246a0.y((List) unsafe.getObject(abstractC0267v, j3));
                    if (y3 > 0) {
                        i4 = A.k.b(y3, C0258l.D(i5), y3, i4);
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    int l4 = AbstractC0246a0.l((List) unsafe.getObject(abstractC0267v, j3));
                    if (l4 > 0) {
                        i4 = A.k.b(l4, C0258l.D(i5), l4, i4);
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    int i8 = AbstractC0246a0.i((List) unsafe.getObject(abstractC0267v, j3));
                    if (i8 > 0) {
                        i4 = A.k.b(i8, C0258l.D(i5), i8, i4);
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    int g4 = AbstractC0246a0.g((List) unsafe.getObject(abstractC0267v, j3));
                    if (g4 > 0) {
                        i4 = A.k.b(g4, C0258l.D(i5), g4, i4);
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    int b3 = AbstractC0246a0.b((List) unsafe.getObject(abstractC0267v, j3));
                    if (b3 > 0) {
                        i4 = A.k.b(b3, C0258l.D(i5), b3, i4);
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    int w2 = AbstractC0246a0.w((List) unsafe.getObject(abstractC0267v, j3));
                    if (w2 > 0) {
                        i4 = A.k.b(w2, C0258l.D(i5), w2, i4);
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    int e3 = AbstractC0246a0.e((List) unsafe.getObject(abstractC0267v, j3));
                    if (e3 > 0) {
                        i4 = A.k.b(e3, C0258l.D(i5), e3, i4);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    int g5 = AbstractC0246a0.g((List) unsafe.getObject(abstractC0267v, j3));
                    if (g5 > 0) {
                        i4 = A.k.b(g5, C0258l.D(i5), g5, i4);
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    int i9 = AbstractC0246a0.i((List) unsafe.getObject(abstractC0267v, j3));
                    if (i9 > 0) {
                        i4 = A.k.b(i9, C0258l.D(i5), i9, i4);
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    int r3 = AbstractC0246a0.r((List) unsafe.getObject(abstractC0267v, j3));
                    if (r3 > 0) {
                        i4 = A.k.b(r3, C0258l.D(i5), r3, i4);
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    int t3 = AbstractC0246a0.t((List) unsafe.getObject(abstractC0267v, j3));
                    if (t3 > 0) {
                        i4 = A.k.b(t3, C0258l.D(i5), t3, i4);
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    o3 = AbstractC0246a0.j(i5, t(abstractC0267v, j3), n(i3));
                    break;
                case 50:
                    Object l5 = s0.l(abstractC0267v, j3);
                    Object m3 = m(i3);
                    this.f5023n.getClass();
                    o3 = L.a(l5, i5, m3);
                    break;
                case 51:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.o(i5);
                        break;
                    }
                case 52:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.s(i5);
                        break;
                    }
                case 53:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.w(D(j3, abstractC0267v), i5);
                        break;
                    }
                case 54:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.G(D(j3, abstractC0267v), i5);
                        break;
                    }
                case 55:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.u(i5, C(j3, abstractC0267v));
                        break;
                    }
                case 56:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.r(i5);
                        break;
                    }
                case 57:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.q(i5);
                        break;
                    }
                case 58:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.l(i5);
                        break;
                    }
                case 59:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        Object l6 = s0.l(abstractC0267v, j3);
                        if (!(l6 instanceof C0253g)) {
                            o3 = C0258l.B((String) l6, i5);
                            break;
                        } else {
                            o3 = C0258l.m(i5, (C0253g) l6);
                            break;
                        }
                    }
                case 60:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = AbstractC0246a0.o(i5, s0.l(abstractC0267v, j3), n(i3));
                        break;
                    }
                case 61:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.m(i5, (C0253g) s0.l(abstractC0267v, j3));
                        break;
                    }
                case 62:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.E(i5, C(j3, abstractC0267v));
                        break;
                    }
                case 63:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.p(i5, C(j3, abstractC0267v));
                        break;
                    }
                case 64:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.x(i5);
                        break;
                    }
                case 65:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.y(i5);
                        break;
                    }
                case 66:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.z(i5, C(j3, abstractC0267v));
                        break;
                    }
                case 67:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.A(D(j3, abstractC0267v), i5);
                        break;
                    }
                case 68:
                    if (!s(i5, i3, abstractC0267v)) {
                        break;
                    } else {
                        o3 = C0258l.t(i5, (AbstractC0245a) s0.l(abstractC0267v, j3), n(i3));
                        break;
                    }
            }
            i4 = o3 + i4;
            i3 += 3;
        }
    }

    public final boolean q(int i3, Object obj) {
        int i4 = this.f5010a[i3 + 2];
        long j3 = i4 & 1048575;
        if (j3 != 1048575) {
            return ((1 << (i4 >>> 20)) & s0.f5126c.g(j3, obj)) != 0;
        }
        int P3 = P(i3);
        long j4 = P3 & 1048575;
        switch (O(P3)) {
            case 0:
                return Double.doubleToRawLongBits(s0.f5126c.e(j4, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(s0.f5126c.f(j4, obj)) != 0;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return s0.f5126c.h(j4, obj) != 0;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                return s0.f5126c.h(j4, obj) != 0;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return s0.f5126c.g(j4, obj) != 0;
            case 5:
                return s0.f5126c.h(j4, obj) != 0;
            case 6:
                return s0.f5126c.g(j4, obj) != 0;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return s0.f5126c.c(j4, obj);
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                Object i5 = s0.f5126c.i(j4, obj);
                if (i5 instanceof String) {
                    return !((String) i5).isEmpty();
                }
                if (i5 instanceof C0253g) {
                    return !C0253g.f5064f.equals(i5);
                }
                throw new IllegalArgumentException();
            case AbstractC0856c.f8037c /* 9 */:
                return s0.f5126c.i(j4, obj) != null;
            case AbstractC0856c.f8039e /* 10 */:
                return !C0253g.f5064f.equals(s0.f5126c.i(j4, obj));
            case 11:
                return s0.f5126c.g(j4, obj) != 0;
            case 12:
                return s0.f5126c.g(j4, obj) != 0;
            case 13:
                return s0.f5126c.g(j4, obj) != 0;
            case 14:
                return s0.f5126c.h(j4, obj) != 0;
            case AbstractC0856c.f8041g /* 15 */:
                return s0.f5126c.g(j4, obj) != 0;
            case 16:
                return s0.f5126c.h(j4, obj) != 0;
            case 17:
                return s0.f5126c.i(j4, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(int i3, int i4, Object obj) {
        return s0.f5126c.g((long) (this.f5010a[i4 + 2] & 1048575), obj) == i3;
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
    public final void u(Object obj, int i3, Object obj2, C0260n c0260n, C0014o c0014o) {
        long P3 = P(i3) & 1048575;
        Object i4 = s0.f5126c.i(P3, obj);
        L l3 = this.f5023n;
        if (i4 == null) {
            l3.getClass();
            i4 = K.f5003e.b();
            s0.s(P3, obj, i4);
        } else {
            l3.getClass();
            if (!((K) i4).f5004d) {
                K b3 = K.f5003e.b();
                L.b(b3, i4);
                s0.s(P3, obj, b3);
                i4 = b3;
            }
        }
        l3.getClass();
        K k3 = (K) i4;
        I i5 = ((J) obj2).f5002a;
        c0014o.A(2);
        AbstractC0256j abstractC0256j = (AbstractC0256j) c0014o.f431e;
        int e3 = abstractC0256j.e(abstractC0256j.v());
        Object obj3 = "";
        k1.i iVar = i5.f5001c;
        Object obj4 = iVar;
        while (true) {
            try {
                int c2 = c0014o.c();
                if (c2 == Integer.MAX_VALUE || abstractC0256j.c()) {
                    break;
                }
                if (c2 == 1) {
                    obj3 = c0014o.m(i5.f4999a, null, null);
                } else if (c2 != 2) {
                    try {
                        if (!c0014o.B()) {
                            throw new C0271z("Unable to parse map entry.");
                        }
                    } catch (C0270y unused) {
                        if (!c0014o.B()) {
                            throw new C0271z("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj4 = c0014o.m(i5.f5000b, iVar.getClass(), c0260n);
                }
            } catch (Throwable th) {
                abstractC0256j.d(e3);
                throw th;
            }
        }
    }

    public final void v(Object obj, int i3, Object obj2) {
        if (q(i3, obj2)) {
            long P3 = P(i3) & 1048575;
            Unsafe unsafe = f5009p;
            Object object = unsafe.getObject(obj2, P3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5010a[i3] + " is present but null: " + obj2);
            }
            Z n3 = n(i3);
            if (!q(i3, obj)) {
                if (r(object)) {
                    AbstractC0267v g3 = n3.g();
                    n3.c(g3, object);
                    unsafe.putObject(obj, P3, g3);
                } else {
                    unsafe.putObject(obj, P3, object);
                }
                K(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, P3);
            if (!r(object2)) {
                AbstractC0267v g4 = n3.g();
                n3.c(g4, object2);
                unsafe.putObject(obj, P3, g4);
                object2 = g4;
            }
            n3.c(object2, object);
        }
    }

    public final void w(Object obj, int i3, Object obj2) {
        int[] iArr = this.f5010a;
        int i4 = iArr[i3];
        if (s(i4, i3, obj2)) {
            long P3 = P(i3) & 1048575;
            Unsafe unsafe = f5009p;
            Object object = unsafe.getObject(obj2, P3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2);
            }
            Z n3 = n(i3);
            if (!s(i4, i3, obj)) {
                if (r(object)) {
                    AbstractC0267v g3 = n3.g();
                    n3.c(g3, object);
                    unsafe.putObject(obj, P3, g3);
                } else {
                    unsafe.putObject(obj, P3, object);
                }
                L(i4, i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, P3);
            if (!r(object2)) {
                AbstractC0267v g4 = n3.g();
                n3.c(g4, object2);
                unsafe.putObject(obj, P3, g4);
                object2 = g4;
            }
            n3.c(object2, object);
        }
    }

    public final Object x(int i3, Object obj) {
        Z n3 = n(i3);
        long P3 = P(i3) & 1048575;
        if (!q(i3, obj)) {
            return n3.g();
        }
        Object object = f5009p.getObject(obj, P3);
        if (r(object)) {
            return object;
        }
        AbstractC0267v g3 = n3.g();
        if (object != null) {
            n3.c(g3, object);
        }
        return g3;
    }

    public final Object y(int i3, int i4, Object obj) {
        Z n3 = n(i4);
        if (!s(i3, i4, obj)) {
            return n3.g();
        }
        Object object = f5009p.getObject(obj, P(i4) & 1048575);
        if (r(object)) {
            return object;
        }
        AbstractC0267v g3 = n3.g();
        if (object != null) {
            n3.c(g3, object);
        }
        return g3;
    }
}
