package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class N implements W {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1623n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f1624o = j0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1625a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1627c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1628d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0138a f1629e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1630f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1631g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1632h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1633i;

    /* renamed from: j, reason: collision with root package name */
    public final P f1634j;

    /* renamed from: k, reason: collision with root package name */
    public final C f1635k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f1636l;

    /* renamed from: m, reason: collision with root package name */
    public final J f1637m;

    public N(int[] iArr, Object[] objArr, int i2, int i3, AbstractC0138a abstractC0138a, int[] iArr2, int i4, int i5, P p2, C c2, e0 e0Var, C0153p c0153p, J j2) {
        this.f1625a = iArr;
        this.f1626b = objArr;
        this.f1627c = i2;
        this.f1628d = i3;
        this.f1630f = abstractC0138a instanceof AbstractC0159w;
        this.f1631g = iArr2;
        this.f1632h = i4;
        this.f1633i = i5;
        this.f1634j = p2;
        this.f1635k = c2;
        this.f1636l = e0Var;
        this.f1629e = abstractC0138a;
        this.f1637m = j2;
    }

    public static long A(long j2, Object obj) {
        return ((Long) j0.f1710c.h(j2, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
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

    public static int L(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0159w) {
            return ((AbstractC0159w) obj).i();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static N x(V v, P p2, C c2, e0 e0Var, C0153p c0153p, J j2) {
        int i2;
        int charAt;
        int charAt2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt3;
        int i9;
        char charAt4;
        int i10;
        char charAt5;
        int i11;
        char charAt6;
        int i12;
        char charAt7;
        int i13;
        char charAt8;
        int i14;
        char charAt9;
        int i15;
        char charAt10;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int objectFieldOffset;
        Object[] objArr;
        int i22;
        int i23;
        int i24;
        int i25;
        Field G2;
        int i26;
        char charAt11;
        int i27;
        int i28;
        Object obj;
        Field G3;
        Object obj2;
        Field G4;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        int i31;
        char charAt14;
        int i32;
        char charAt15;
        String c3 = v.c();
        int length = c3.length();
        char c4 = 55296;
        if (c3.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i2 = i33 + 1;
                if (c3.charAt(i33) < 55296) {
                    break;
                }
                i33 = i2;
            }
        } else {
            i2 = 1;
        }
        int i34 = i2 + 1;
        int charAt16 = c3.charAt(i2);
        if (charAt16 >= 55296) {
            int i35 = charAt16 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt15 = c3.charAt(i34);
                if (charAt15 < 55296) {
                    break;
                }
                i35 |= (charAt15 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            charAt16 = i35 | (charAt15 << i36);
            i34 = i32;
        }
        if (charAt16 == 0) {
            iArr = f1623n;
            i3 = 0;
            i5 = 0;
            charAt = 0;
            charAt2 = 0;
            i4 = 0;
            i7 = 0;
            i6 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt17 = c3.charAt(i34);
            if (charAt17 >= 55296) {
                int i38 = charAt17 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    charAt10 = c3.charAt(i37);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                charAt17 = i38 | (charAt10 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int charAt18 = c3.charAt(i37);
            if (charAt18 >= 55296) {
                int i41 = charAt18 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt9 = c3.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                charAt18 = i41 | (charAt9 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int charAt19 = c3.charAt(i40);
            if (charAt19 >= 55296) {
                int i44 = charAt19 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt8 = c3.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                charAt19 = i44 | (charAt8 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int charAt20 = c3.charAt(i43);
            if (charAt20 >= 55296) {
                int i47 = charAt20 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt7 = c3.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt20 = i47 | (charAt7 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            charAt = c3.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt6 = c3.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt = i50 | (charAt6 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            charAt2 = c3.charAt(i49);
            if (charAt2 >= 55296) {
                int i53 = charAt2 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt5 = c3.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                charAt2 = i53 | (charAt5 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int charAt21 = c3.charAt(i52);
            if (charAt21 >= 55296) {
                int i56 = charAt21 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    charAt4 = c3.charAt(i55);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i56 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                charAt21 = i56 | (charAt4 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int charAt22 = c3.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    charAt3 = c3.charAt(i58);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i59 |= (charAt3 & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                charAt22 = i59 | (charAt3 << i60);
                i58 = i8;
            }
            int i61 = (charAt17 * 2) + charAt18;
            i3 = charAt17;
            i34 = i58;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i4 = charAt19;
            i5 = i61;
            i6 = charAt22;
            i7 = charAt20;
        }
        Unsafe unsafe = f1624o;
        Object[] b2 = v.b();
        Class<?> cls = v.a().getClass();
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i62 = i6 + charAt2;
        int i63 = i6;
        int i64 = i62;
        int i65 = 0;
        int i66 = 0;
        while (i34 < length) {
            int i67 = i34 + 1;
            int charAt23 = c3.charAt(i34);
            if (charAt23 >= c4) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i31 = i69 + 1;
                    charAt14 = c3.charAt(i69);
                    if (charAt14 < c4) {
                        break;
                    }
                    i68 |= (charAt14 & 8191) << i70;
                    i70 += 13;
                    i69 = i31;
                }
                charAt23 = i68 | (charAt14 << i70);
                i16 = i31;
            } else {
                i16 = i67;
            }
            int i71 = i16 + 1;
            int charAt24 = c3.charAt(i16);
            if (charAt24 >= c4) {
                int i72 = charAt24 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i30 = i73 + 1;
                    charAt13 = c3.charAt(i73);
                    i17 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i72 |= (charAt13 & 8191) << i74;
                    i74 += 13;
                    i73 = i30;
                    length = i17;
                }
                charAt24 = i72 | (charAt13 << i74);
                i18 = i30;
            } else {
                i17 = length;
                i18 = i71;
            }
            int i75 = charAt24 & 255;
            int i76 = i6;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            if (i75 >= 51) {
                int i77 = i18 + 1;
                int charAt25 = c3.charAt(i18);
                i19 = i65;
                char c5 = 55296;
                if (charAt25 >= 55296) {
                    int i78 = charAt25 & 8191;
                    int i79 = 13;
                    while (true) {
                        i29 = i77 + 1;
                        charAt12 = c3.charAt(i77);
                        if (charAt12 < c5) {
                            break;
                        }
                        i78 |= (charAt12 & 8191) << i79;
                        i79 += 13;
                        i77 = i29;
                        c5 = 55296;
                    }
                    charAt25 = i78 | (charAt12 << i79);
                    i77 = i29;
                }
                int i80 = i75 - 51;
                int i81 = i77;
                if (i80 == 9 || i80 == 17) {
                    i28 = i5 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = b2[i5];
                } else {
                    if (i80 == 12 && (K.j.a(v.d(), 1) || (charAt24 & 2048) != 0)) {
                        i28 = i5 + 1;
                        objArr2[((i66 / 3) * 2) + 1] = b2[i5];
                    }
                    int i82 = charAt25 * 2;
                    obj = b2[i82];
                    if (obj instanceof Field) {
                        G3 = G(cls, (String) obj);
                        b2[i82] = G3;
                    } else {
                        G3 = (Field) obj;
                    }
                    int i83 = i4;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(G3);
                    int i84 = i82 + 1;
                    obj2 = b2[i84];
                    int i85 = i5;
                    if (obj2 instanceof Field) {
                        G4 = G(cls, (String) obj2);
                        b2[i84] = G4;
                    } else {
                        G4 = (Field) obj2;
                    }
                    objectFieldOffset = objectFieldOffset2;
                    i25 = (int) unsafe.objectFieldOffset(G4);
                    i22 = i85;
                    i23 = i81;
                    i24 = 0;
                    i20 = i7;
                    i21 = i83;
                    objArr = objArr2;
                }
                i5 = i28;
                int i822 = charAt25 * 2;
                obj = b2[i822];
                if (obj instanceof Field) {
                }
                int i832 = i4;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(G3);
                int i842 = i822 + 1;
                obj2 = b2[i842];
                int i852 = i5;
                if (obj2 instanceof Field) {
                }
                objectFieldOffset = objectFieldOffset22;
                i25 = (int) unsafe.objectFieldOffset(G4);
                i22 = i852;
                i23 = i81;
                i24 = 0;
                i20 = i7;
                i21 = i832;
                objArr = objArr2;
            } else {
                i19 = i65;
                int i86 = i4;
                int i87 = i5 + 1;
                Field G5 = G(cls, (String) b2[i5]);
                i20 = i7;
                if (i75 == 9 || i75 == 17) {
                    i21 = i86;
                    objArr2[((i66 / 3) * 2) + 1] = G5.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i21 = i86;
                        i27 = i5 + 2;
                        objArr2[((i66 / 3) * 2) + 1] = b2[i87];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i21 = i86;
                        if (v.d() == 1 || (charAt24 & 2048) != 0) {
                            i27 = i5 + 2;
                            objArr2[((i66 / 3) * 2) + 1] = b2[i87];
                        }
                    } else {
                        if (i75 == 50) {
                            int i88 = i63 + 1;
                            iArr[i63] = i66;
                            int i89 = (i66 / 3) * 2;
                            int i90 = i5 + 2;
                            objArr2[i89] = b2[i87];
                            if ((charAt24 & 2048) != 0) {
                                i87 = i5 + 3;
                                objArr2[i89 + 1] = b2[i90];
                                i63 = i88;
                            } else {
                                i63 = i88;
                                i87 = i90;
                            }
                        }
                        i21 = i86;
                    }
                    i87 = i27;
                }
                objectFieldOffset = (int) unsafe.objectFieldOffset(G5);
                if ((charAt24 & 4096) == 0 || i75 > 17) {
                    objArr = objArr2;
                    i22 = i87;
                    i23 = i18;
                    i24 = 0;
                    i25 = 1048575;
                } else {
                    i23 = i18 + 1;
                    int charAt26 = c3.charAt(i18);
                    if (charAt26 >= 55296) {
                        int i91 = charAt26 & 8191;
                        int i92 = 13;
                        while (true) {
                            i26 = i23 + 1;
                            charAt11 = c3.charAt(i23);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i91 |= (charAt11 & 8191) << i92;
                            i92 += 13;
                            i23 = i26;
                        }
                        charAt26 = i91 | (charAt11 << i92);
                        i23 = i26;
                    }
                    int i93 = (charAt26 / 32) + (i3 * 2);
                    Object obj3 = b2[i93];
                    if (obj3 instanceof Field) {
                        G2 = (Field) obj3;
                    } else {
                        G2 = G(cls, (String) obj3);
                        b2[i93] = G2;
                    }
                    objArr = objArr2;
                    i22 = i87;
                    i25 = (int) unsafe.objectFieldOffset(G2);
                    i24 = charAt26 % 32;
                }
                if (i75 >= 18 && i75 <= 49) {
                    iArr[i64] = objectFieldOffset;
                    i64++;
                }
            }
            int i94 = i66 + 1;
            iArr2[i66] = charAt23;
            int i95 = i66 + 2;
            String str = c3;
            iArr2[i94] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | objectFieldOffset;
            i66 += 3;
            iArr2[i95] = (i24 << 20) | i25;
            i34 = i23;
            objArr2 = objArr;
            i6 = i76;
            i5 = i22;
            i65 = i19;
            length = i17;
            i4 = i21;
            c3 = str;
            i7 = i20;
            c4 = 55296;
        }
        return new N(iArr2, objArr2, i4, i7, v.a(), iArr, i6, i62, p2, c2, e0Var, c0153p, j2);
    }

    public static long y(int i2) {
        return i2 & 1048575;
    }

    public static int z(long j2, Object obj) {
        return ((Integer) j0.f1710c.h(j2, obj)).intValue();
    }

    public final int B(int i2) {
        if (i2 < this.f1627c || i2 > this.f1628d) {
            return -1;
        }
        int[] iArr = this.f1625a;
        int length = (iArr.length / 3) - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    public final void C(Object obj, long j2, C0148k c0148k, W w2, C0152o c0152o) {
        int u2;
        this.f1635k.getClass();
        InterfaceC0160x b2 = C.b(j2, obj);
        int i2 = c0148k.f1716b;
        if ((i2 & 7) != 3) {
            throw A.b();
        }
        do {
            AbstractC0159w g2 = w2.g();
            c0148k.b(g2, w2, c0152o);
            w2.h(g2);
            ((U) b2).add(g2);
            AbstractC0147j abstractC0147j = c0148k.f1715a;
            if (abstractC0147j.c() || c0148k.f1718d != 0) {
                return;
            } else {
                u2 = abstractC0147j.u();
            }
        } while (u2 == i2);
        c0148k.f1718d = u2;
    }

    public final void D(Object obj, int i2, C0148k c0148k, W w2, C0152o c0152o) {
        int u2;
        this.f1635k.getClass();
        InterfaceC0160x b2 = C.b(i2 & 1048575, obj);
        int i3 = c0148k.f1716b;
        if ((i3 & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0159w g2 = w2.g();
            c0148k.c(g2, w2, c0152o);
            w2.h(g2);
            ((U) b2).add(g2);
            AbstractC0147j abstractC0147j = c0148k.f1715a;
            if (abstractC0147j.c() || c0148k.f1718d != 0) {
                return;
            } else {
                u2 = abstractC0147j.u();
            }
        } while (u2 == i3);
        c0148k.f1718d = u2;
    }

    public final void E(int i2, C0148k c0148k, Object obj) {
        if ((536870912 & i2) != 0) {
            c0148k.w(2);
            j0.o(obj, i2 & 1048575, c0148k.f1715a.t());
        } else if (!this.f1630f) {
            j0.o(obj, i2 & 1048575, c0148k.e());
        } else {
            c0148k.w(2);
            j0.o(obj, i2 & 1048575, c0148k.f1715a.s());
        }
    }

    public final void F(int i2, C0148k c0148k, Object obj) {
        boolean z2 = (536870912 & i2) != 0;
        C c2 = this.f1635k;
        if (z2) {
            c2.getClass();
            c0148k.s(C.b(i2 & 1048575, obj), true);
        } else {
            c2.getClass();
            c0148k.s(C.b(i2 & 1048575, obj), false);
        }
    }

    public final void H(int i2, Object obj) {
        int i3 = this.f1625a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        j0.m(obj, j2, (1 << (i3 >>> 20)) | j0.f1710c.f(j2, obj));
    }

    public final void I(Object obj, int i2, int i3) {
        j0.m(obj, this.f1625a[i3 + 2] & 1048575, i2);
    }

    public final void J(Object obj, int i2, AbstractC0138a abstractC0138a) {
        f1624o.putObject(obj, M(i2) & 1048575, abstractC0138a);
        H(i2, obj);
    }

    public final void K(Object obj, int i2, int i3, AbstractC0138a abstractC0138a) {
        f1624o.putObject(obj, M(i3) & 1048575, abstractC0138a);
        I(obj, i2, i3);
    }

    public final int M(int i2) {
        return this.f1625a[i2 + 1];
    }

    public final void N(Object obj, F f2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f1625a;
        int length = iArr.length;
        Unsafe unsafe = f1624o;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i9 < length) {
            int M2 = M(i9);
            int i10 = iArr[i9];
            int L2 = L(M2);
            if (L2 <= 17) {
                int i11 = iArr[i9 + 2];
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i8 = i12 == i6 ? 0 : unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                i2 = i7;
                i3 = i8;
                i4 = 1 << (i11 >>> 20);
            } else {
                i2 = i7;
                i3 = i8;
                i4 = 0;
            }
            long j2 = M2 & i6;
            switch (L2) {
                case 0:
                    i5 = i2;
                    if (!o(obj, i9, i5, i3, i4)) {
                        break;
                    } else {
                        f2.c(i10, j0.f1710c.d(j2, obj));
                        continue;
                    }
                case 1:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.g(i10, j0.f1710c.e(j2, obj));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.j(unsafe.getLong(obj, j2), i10);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.q(unsafe.getLong(obj, j2), i10);
                        break;
                    } else {
                        continue;
                    }
                case K.k.LONG_FIELD_NUMBER /* 4 */:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.i(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case K.k.STRING_FIELD_NUMBER /* 5 */:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.f(unsafe.getLong(obj, j2), i10);
                        break;
                    } else {
                        continue;
                    }
                case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.e(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.a(i10, j0.f1710c.c(j2, obj));
                        break;
                    } else {
                        continue;
                    }
                case K.k.BYTES_FIELD_NUMBER /* 8 */:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((C0150m) f2.f1613a).F0((String) object, i10);
                            break;
                        } else {
                            f2.b(i10, (C0144g) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.k(i10, unsafe.getObject(obj, j2), m(i9));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.b(i10, (C0144g) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.p(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.d(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.l(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.m(unsafe.getLong(obj, j2), i10);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.n(i10, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i5 = i2;
                    if (o(obj, i9, i5, i3, i4)) {
                        f2.o(unsafe.getLong(obj, j2), i10);
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i5 = i2;
                    if (o(obj, i9, i2, i3, i4)) {
                        f2.h(i10, unsafe.getObject(obj, j2), m(i9));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    X.E(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 19:
                    X.I(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 20:
                    X.L(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 21:
                    X.T(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 22:
                    X.K(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 23:
                    X.H(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 24:
                    X.G(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 25:
                    X.C(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 26:
                    X.R(iArr[i9], (List) unsafe.getObject(obj, j2), f2);
                    break;
                case 27:
                    X.M(iArr[i9], (List) unsafe.getObject(obj, j2), f2, m(i9));
                    break;
                case 28:
                    X.D(iArr[i9], (List) unsafe.getObject(obj, j2), f2);
                    break;
                case 29:
                    X.S(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 30:
                    X.F(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 31:
                    X.N(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 32:
                    X.O(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 33:
                    X.P(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 34:
                    X.Q(iArr[i9], (List) unsafe.getObject(obj, j2), f2, false);
                    break;
                case 35:
                    X.E(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 36:
                    X.I(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 37:
                    X.L(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 38:
                    X.T(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 39:
                    X.K(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 40:
                    X.H(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 41:
                    X.G(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 42:
                    X.C(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 43:
                    X.S(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 44:
                    X.F(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 45:
                    X.N(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 46:
                    X.O(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 47:
                    X.P(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 48:
                    X.Q(iArr[i9], (List) unsafe.getObject(obj, j2), f2, true);
                    break;
                case 49:
                    X.J(iArr[i9], (List) unsafe.getObject(obj, j2), f2, m(i9));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        int i13 = 2;
                        Object obj2 = this.f1626b[(i9 / 3) * 2];
                        this.f1637m.getClass();
                        G g2 = ((H) obj2).f1617a;
                        C0150m c0150m = (C0150m) f2.f1613a;
                        c0150m.getClass();
                        for (Map.Entry entry : ((I) object2).entrySet()) {
                            c0150m.H0(i10, i13);
                            c0150m.J0(H.a(g2, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            r.b(c0150m, g2.f1614a, 1, key);
                            r.b(c0150m, g2.f1615b, 2, value);
                            i13 = 2;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (q(obj, i10, i9)) {
                        f2.c(i10, ((Double) j0.f1710c.h(j2, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (q(obj, i10, i9)) {
                        f2.g(i10, ((Float) j0.f1710c.h(j2, obj)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (q(obj, i10, i9)) {
                        f2.j(A(j2, obj), i10);
                        break;
                    }
                    break;
                case 54:
                    if (q(obj, i10, i9)) {
                        f2.q(A(j2, obj), i10);
                        break;
                    }
                    break;
                case 55:
                    if (q(obj, i10, i9)) {
                        f2.i(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 56:
                    if (q(obj, i10, i9)) {
                        f2.f(A(j2, obj), i10);
                        break;
                    }
                    break;
                case 57:
                    if (q(obj, i10, i9)) {
                        f2.e(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 58:
                    if (q(obj, i10, i9)) {
                        f2.a(i10, ((Boolean) j0.f1710c.h(j2, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (q(obj, i10, i9)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            ((C0150m) f2.f1613a).F0((String) object3, i10);
                            break;
                        } else {
                            f2.b(i10, (C0144g) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (q(obj, i10, i9)) {
                        f2.k(i10, unsafe.getObject(obj, j2), m(i9));
                        break;
                    }
                    break;
                case 61:
                    if (q(obj, i10, i9)) {
                        f2.b(i10, (C0144g) unsafe.getObject(obj, j2));
                        break;
                    }
                    break;
                case 62:
                    if (q(obj, i10, i9)) {
                        f2.p(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 63:
                    if (q(obj, i10, i9)) {
                        f2.d(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 64:
                    if (q(obj, i10, i9)) {
                        f2.l(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 65:
                    if (q(obj, i10, i9)) {
                        f2.m(A(j2, obj), i10);
                        break;
                    }
                    break;
                case 66:
                    if (q(obj, i10, i9)) {
                        f2.n(i10, z(j2, obj));
                        break;
                    }
                    break;
                case 67:
                    if (q(obj, i10, i9)) {
                        f2.o(A(j2, obj), i10);
                        break;
                    }
                    break;
                case 68:
                    if (q(obj, i10, i9)) {
                        f2.h(i10, unsafe.getObject(obj, j2), m(i9));
                        break;
                    }
                    break;
            }
            i5 = i2;
            i9 += 3;
            i7 = i5;
            i8 = i3;
            i6 = 1048575;
        }
        this.f1636l.getClass();
        ((AbstractC0159w) obj).unknownFields.d(f2);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean a(Object obj) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f1632h) {
            int i7 = this.f1631g[i6];
            int[] iArr = this.f1625a;
            int i8 = iArr[i7];
            int M2 = M(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f1624o.getInt(obj, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if ((268435456 & M2) != 0 && !o(obj, i7, i2, i3, i11)) {
                return false;
            }
            int L2 = L(M2);
            if (L2 != 9 && L2 != 17) {
                if (L2 != 27) {
                    if (L2 == 60 || L2 == 68) {
                        if (q(obj, i8, i7)) {
                            if (!m(i7).a(j0.f1710c.h(M2 & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (L2 != 49) {
                        if (L2 != 50) {
                            continue;
                        } else {
                            Object h2 = j0.f1710c.h(M2 & 1048575, obj);
                            this.f1637m.getClass();
                            I i12 = (I) h2;
                            if (i12.isEmpty()) {
                                continue;
                            } else {
                                if (((H) this.f1626b[(i7 / 3) * 2]).f1617a.f1615b.f1740e != s0.MESSAGE) {
                                    continue;
                                } else {
                                    W w2 = null;
                                    for (Object obj2 : i12.values()) {
                                        if (w2 == null) {
                                            w2 = T.f1643c.a(obj2.getClass());
                                        }
                                        if (!w2.a(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) j0.f1710c.h(M2 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    W m2 = m(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!m2.a(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (o(obj, i7, i2, i3, i11)) {
                if (!m(i7).a(j0.f1710c.h(M2 & 1048575, obj))) {
                    return false;
                }
            } else {
                continue;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, C0148k c0148k, C0152o c0152o) {
        c0152o.getClass();
        if (p(obj)) {
            r(this.f1636l, obj, c0148k, c0152o);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(Object obj, Object obj2) {
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f1625a;
            if (i2 >= iArr.length) {
                X.A(this.f1636l, obj, obj2);
                return;
            }
            int M2 = M(i2);
            long j2 = 1048575 & M2;
            int i3 = iArr[i2];
            switch (L(M2)) {
                case 0:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0 i0Var = j0.f1710c;
                        i0Var.l(obj, j2, i0Var.d(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 1:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0 i0Var2 = j0.f1710c;
                        i0Var2.m(obj, j2, i0Var2.e(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 2:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.n(obj, j2, j0.f1710c.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 3:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.n(obj, j2, j0.f1710c.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case K.k.LONG_FIELD_NUMBER /* 4 */:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j2, j0.f1710c.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case K.k.STRING_FIELD_NUMBER /* 5 */:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.n(obj, j2, j0.f1710c.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j2, j0.f1710c.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0 i0Var3 = j0.f1710c;
                        i0Var3.j(obj, j2, i0Var3.c(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case K.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.o(obj, j2, j0.f1710c.h(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 9:
                    t(i2, obj, obj2);
                    break;
                case 10:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.o(obj, j2, j0.f1710c.h(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 11:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j2, j0.f1710c.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 12:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j2, j0.f1710c.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 13:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j2, j0.f1710c.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 14:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.n(obj, j2, j0.f1710c.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 15:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.m(obj, j2, j0.f1710c.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 16:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        j0.n(obj, j2, j0.f1710c.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 17:
                    t(i2, obj, obj2);
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
                    this.f1635k.getClass();
                    i0 i0Var4 = j0.f1710c;
                    InterfaceC0160x interfaceC0160x = (InterfaceC0160x) i0Var4.h(j2, obj);
                    InterfaceC0160x interfaceC0160x2 = (InterfaceC0160x) i0Var4.h(j2, obj2);
                    U u2 = (U) interfaceC0160x;
                    int i4 = u2.f1648g;
                    int i5 = ((U) interfaceC0160x2).f1648g;
                    if (i4 > 0 && i5 > 0) {
                        if (!((AbstractC0139b) interfaceC0160x).f1669e) {
                            interfaceC0160x = u2.c(i5 + i4);
                        }
                        ((AbstractC0139b) interfaceC0160x).addAll(interfaceC0160x2);
                    }
                    if (i4 > 0) {
                        interfaceC0160x2 = interfaceC0160x;
                    }
                    j0.o(obj, j2, interfaceC0160x2);
                    break;
                case 50:
                    Class cls = X.f1653a;
                    i0 i0Var5 = j0.f1710c;
                    Object h2 = i0Var5.h(j2, obj);
                    Object h3 = i0Var5.h(j2, obj2);
                    this.f1637m.getClass();
                    j0.o(obj, j2, J.b(h2, h3));
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
                    if (!q(obj2, i3, i2)) {
                        break;
                    } else {
                        j0.o(obj, j2, j0.f1710c.h(j2, obj2));
                        I(obj, i3, i2);
                        break;
                    }
                case 60:
                    u(i2, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!q(obj2, i3, i2)) {
                        break;
                    } else {
                        j0.o(obj, j2, j0.f1710c.h(j2, obj2));
                        I(obj, i3, i2);
                        break;
                    }
                case 68:
                    u(i2, obj, obj2);
                    break;
            }
            i2 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj, F f2) {
        f2.getClass();
        N(obj, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0217, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e3, code lost:
    
        r3 = r8 + r3;
     */
    @Override // androidx.datastore.preferences.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(AbstractC0159w abstractC0159w) {
        int i2;
        int b2;
        int i3;
        int[] iArr = this.f1625a;
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int M2 = M(i5);
            int i6 = iArr[i5];
            long j2 = 1048575 & M2;
            int i7 = 1237;
            int i8 = 37;
            switch (L(M2)) {
                case 0:
                    i2 = i4 * 53;
                    b2 = AbstractC0161y.b(Double.doubleToLongBits(j0.f1710c.d(j2, abstractC0159w)));
                    i4 = b2 + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    b2 = Float.floatToIntBits(j0.f1710c.e(j2, abstractC0159w));
                    i4 = b2 + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    b2 = AbstractC0161y.b(j0.f1710c.g(j2, abstractC0159w));
                    i4 = b2 + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    b2 = AbstractC0161y.b(j0.f1710c.g(j2, abstractC0159w));
                    i4 = b2 + i2;
                    break;
                case K.k.LONG_FIELD_NUMBER /* 4 */:
                    i2 = i4 * 53;
                    b2 = j0.f1710c.f(j2, abstractC0159w);
                    i4 = b2 + i2;
                    break;
                case K.k.STRING_FIELD_NUMBER /* 5 */:
                    i2 = i4 * 53;
                    b2 = AbstractC0161y.b(j0.f1710c.g(j2, abstractC0159w));
                    i4 = b2 + i2;
                    break;
                case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i2 = i4 * 53;
                    b2 = j0.f1710c.f(j2, abstractC0159w);
                    i4 = b2 + i2;
                    break;
                case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i3 = i4 * 53;
                    boolean c2 = j0.f1710c.c(j2, abstractC0159w);
                    Charset charset = AbstractC0161y.f1761a;
                    break;
                case K.k.BYTES_FIELD_NUMBER /* 8 */:
                    i2 = i4 * 53;
                    b2 = ((String) j0.f1710c.h(j2, abstractC0159w)).hashCode();
                    i4 = b2 + i2;
                    break;
                case 9:
                    Object h2 = j0.f1710c.h(j2, abstractC0159w);
                    if (h2 != null) {
                        i8 = h2.hashCode();
                    }
                    i4 = (i4 * 53) + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    b2 = j0.f1710c.h(j2, abstractC0159w).hashCode();
                    i4 = b2 + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    b2 = j0.f1710c.f(j2, abstractC0159w);
                    i4 = b2 + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    b2 = j0.f1710c.f(j2, abstractC0159w);
                    i4 = b2 + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    b2 = j0.f1710c.f(j2, abstractC0159w);
                    i4 = b2 + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    b2 = AbstractC0161y.b(j0.f1710c.g(j2, abstractC0159w));
                    i4 = b2 + i2;
                    break;
                case 15:
                    i2 = i4 * 53;
                    b2 = j0.f1710c.f(j2, abstractC0159w);
                    i4 = b2 + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    b2 = AbstractC0161y.b(j0.f1710c.g(j2, abstractC0159w));
                    i4 = b2 + i2;
                    break;
                case 17:
                    Object h3 = j0.f1710c.h(j2, abstractC0159w);
                    if (h3 != null) {
                        i8 = h3.hashCode();
                    }
                    i4 = (i4 * 53) + i8;
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
                    i2 = i4 * 53;
                    b2 = j0.f1710c.h(j2, abstractC0159w).hashCode();
                    i4 = b2 + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    b2 = j0.f1710c.h(j2, abstractC0159w).hashCode();
                    i4 = b2 + i2;
                    break;
                case 51:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0161y.b(Double.doubleToLongBits(((Double) j0.f1710c.h(j2, abstractC0159w)).doubleValue()));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = Float.floatToIntBits(((Float) j0.f1710c.h(j2, abstractC0159w)).floatValue());
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0161y.b(A(j2, abstractC0159w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0161y.b(A(j2, abstractC0159w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0159w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0161y.b(A(j2, abstractC0159w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0159w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(abstractC0159w, i6, i5)) {
                        i3 = i4 * 53;
                        boolean booleanValue = ((Boolean) j0.f1710c.h(j2, abstractC0159w)).booleanValue();
                        Charset charset2 = AbstractC0161y.f1761a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = ((String) j0.f1710c.h(j2, abstractC0159w)).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = j0.f1710c.h(j2, abstractC0159w).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = j0.f1710c.h(j2, abstractC0159w).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0159w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0159w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0159w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0161y.b(A(j2, abstractC0159w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = z(j2, abstractC0159w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0161y.b(A(j2, abstractC0159w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(abstractC0159w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = j0.f1710c.h(j2, abstractC0159w).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f1636l.getClass();
        return abstractC0159w.unknownFields.hashCode() + (i4 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int f(AbstractC0159w abstractC0159w) {
        int i2;
        int i3;
        int i4;
        int Z;
        int Y2;
        int i5;
        int n02;
        int p02;
        Unsafe unsafe = f1624o;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f1625a;
            if (i9 >= iArr.length) {
                this.f1636l.getClass();
                return abstractC0159w.unknownFields.b() + i10;
            }
            int M2 = M(i9);
            int L2 = L(M2);
            int i11 = iArr[i9];
            int i12 = iArr[i9 + 2];
            int i13 = i12 & i6;
            if (L2 <= 17) {
                if (i13 != i7) {
                    i8 = i13 == i6 ? 0 : unsafe.getInt(abstractC0159w, i13);
                    i7 = i13;
                }
                i2 = i7;
                i3 = i8;
                i4 = 1 << (i12 >>> 20);
            } else {
                i2 = i7;
                i3 = i8;
                i4 = 0;
            }
            long j2 = M2 & i6;
            if (L2 >= EnumC0155s.f1742f.a()) {
                EnumC0155s.f1743g.a();
            }
            switch (L2) {
                case 0:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.Z(i11);
                        i10 += Z;
                        break;
                    }
                case 1:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.d0(i11);
                        i10 += Z;
                        break;
                    }
                case 2:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.g0(unsafe.getLong(abstractC0159w, j2), i11);
                        i10 += Z;
                        break;
                    }
                case 3:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.q0(unsafe.getLong(abstractC0159w, j2), i11);
                        i10 += Z;
                        break;
                    }
                case K.k.LONG_FIELD_NUMBER /* 4 */:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.f0(i11, unsafe.getInt(abstractC0159w, j2));
                        i10 += Z;
                        break;
                    }
                case K.k.STRING_FIELD_NUMBER /* 5 */:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.c0(i11);
                        i10 += Z;
                        break;
                    }
                case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.b0(i11);
                        i10 += Z;
                        break;
                    }
                case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.X(i11);
                        i10 += Z;
                        break;
                    }
                case K.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0159w, j2);
                        Y2 = object instanceof C0144g ? C0150m.Y(i11, (C0144g) object) : C0150m.l0((String) object, i11);
                        i10 = Y2 + i10;
                        break;
                    }
                case 9:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = X.o(i11, unsafe.getObject(abstractC0159w, j2), m(i9));
                        i10 += Z;
                        break;
                    }
                case 10:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.Y(i11, (C0144g) unsafe.getObject(abstractC0159w, j2));
                        i10 += Z;
                        break;
                    }
                case 11:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.o0(i11, unsafe.getInt(abstractC0159w, j2));
                        i10 += Z;
                        break;
                    }
                case 12:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.a0(i11, unsafe.getInt(abstractC0159w, j2));
                        i10 += Z;
                        break;
                    }
                case 13:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.h0(i11);
                        i10 += Z;
                        break;
                    }
                case 14:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.i0(i11);
                        i10 += Z;
                        break;
                    }
                case 15:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.j0(i11, unsafe.getInt(abstractC0159w, j2));
                        i10 += Z;
                        break;
                    }
                case 16:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.k0(unsafe.getLong(abstractC0159w, j2), i11);
                        i10 += Z;
                        break;
                    }
                case 17:
                    if (!o(abstractC0159w, i9, i2, i3, i4)) {
                        break;
                    } else {
                        Z = C0150m.e0(i11, (AbstractC0138a) unsafe.getObject(abstractC0159w, j2), m(i9));
                        i10 += Z;
                        break;
                    }
                case 18:
                    Z = X.h(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 19:
                    Z = X.f(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 20:
                    Z = X.m(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 21:
                    Z = X.x(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 22:
                    Z = X.k(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 23:
                    Z = X.h(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 24:
                    Z = X.f(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 25:
                    Z = X.a(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 26:
                    Z = X.u(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 27:
                    Z = X.p(i11, (List) unsafe.getObject(abstractC0159w, j2), m(i9));
                    i10 += Z;
                    break;
                case 28:
                    Z = X.c(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 29:
                    Z = X.v(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 30:
                    Z = X.d(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 31:
                    Z = X.f(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 32:
                    Z = X.h(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 33:
                    Z = X.q(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 34:
                    Z = X.s(i11, (List) unsafe.getObject(abstractC0159w, j2));
                    i10 += Z;
                    break;
                case 35:
                    i5 = X.i((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 36:
                    i5 = X.g((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 37:
                    i5 = X.n((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 38:
                    i5 = X.y((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 39:
                    i5 = X.l((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 40:
                    i5 = X.i((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 41:
                    i5 = X.g((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 42:
                    i5 = X.b((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 43:
                    i5 = X.w((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 44:
                    i5 = X.e((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 45:
                    i5 = X.g((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 46:
                    i5 = X.i((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 47:
                    i5 = X.r((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 48:
                    i5 = X.t((List) unsafe.getObject(abstractC0159w, j2));
                    if (i5 <= 0) {
                        break;
                    } else {
                        n02 = C0150m.n0(i11);
                        p02 = C0150m.p0(i5);
                        i10 += p02 + n02 + i5;
                        break;
                    }
                case 49:
                    Z = X.j(i11, (List) unsafe.getObject(abstractC0159w, j2), m(i9));
                    i10 += Z;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0159w, j2);
                    Object obj = this.f1626b[(i9 / 3) * 2];
                    this.f1637m.getClass();
                    Z = J.a(i11, object2, obj);
                    i10 += Z;
                    break;
                case 51:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.Z(i11);
                        i10 += Z;
                        break;
                    }
                case 52:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.d0(i11);
                        i10 += Z;
                        break;
                    }
                case 53:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.g0(A(j2, abstractC0159w), i11);
                        i10 += Z;
                        break;
                    }
                case 54:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.q0(A(j2, abstractC0159w), i11);
                        i10 += Z;
                        break;
                    }
                case 55:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.f0(i11, z(j2, abstractC0159w));
                        i10 += Z;
                        break;
                    }
                case 56:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.c0(i11);
                        i10 += Z;
                        break;
                    }
                case 57:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.b0(i11);
                        i10 += Z;
                        break;
                    }
                case 58:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.X(i11);
                        i10 += Z;
                        break;
                    }
                case 59:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0159w, j2);
                        Y2 = object3 instanceof C0144g ? C0150m.Y(i11, (C0144g) object3) : C0150m.l0((String) object3, i11);
                        i10 = Y2 + i10;
                        break;
                    }
                case 60:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = X.o(i11, unsafe.getObject(abstractC0159w, j2), m(i9));
                        i10 += Z;
                        break;
                    }
                case 61:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.Y(i11, (C0144g) unsafe.getObject(abstractC0159w, j2));
                        i10 += Z;
                        break;
                    }
                case 62:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.o0(i11, z(j2, abstractC0159w));
                        i10 += Z;
                        break;
                    }
                case 63:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.a0(i11, z(j2, abstractC0159w));
                        i10 += Z;
                        break;
                    }
                case 64:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.h0(i11);
                        i10 += Z;
                        break;
                    }
                case 65:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.i0(i11);
                        i10 += Z;
                        break;
                    }
                case 66:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.j0(i11, z(j2, abstractC0159w));
                        i10 += Z;
                        break;
                    }
                case 67:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.k0(A(j2, abstractC0159w), i11);
                        i10 += Z;
                        break;
                    }
                case 68:
                    if (!q(abstractC0159w, i11, i9)) {
                        break;
                    } else {
                        Z = C0150m.e0(i11, (AbstractC0138a) unsafe.getObject(abstractC0159w, j2), m(i9));
                        i10 += Z;
                        break;
                    }
            }
            i9 += 3;
            i7 = i2;
            i8 = i3;
            i6 = 1048575;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0159w g() {
        this.f1634j.getClass();
        return ((AbstractC0159w) this.f1629e).k();
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void h(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0159w) {
                AbstractC0159w abstractC0159w = (AbstractC0159w) obj;
                abstractC0159w.d();
                abstractC0159w.c();
                abstractC0159w.j();
            }
            int[] iArr = this.f1625a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int M2 = M(i2);
                long j2 = 1048575 & M2;
                int L2 = L(M2);
                if (L2 != 9) {
                    if (L2 != 60 && L2 != 68) {
                        switch (L2) {
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
                                this.f1635k.getClass();
                                C.a(j2, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f1624o;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    this.f1637m.getClass();
                                    J.c(object);
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(obj, iArr[i2], i2)) {
                        m(i2).h(f1624o.getObject(obj, j2));
                    }
                }
                if (n(i2, obj)) {
                    m(i2).h(f1624o.getObject(obj, j2));
                }
            }
            this.f1636l.getClass();
            e0.b(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.X.B(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(AbstractC0159w abstractC0159w, Object obj) {
        int[] iArr = this.f1625a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                this.f1636l.getClass();
                return abstractC0159w.unknownFields.equals(((AbstractC0159w) obj).unknownFields);
            }
            int M2 = M(i2);
            long j2 = M2 & 1048575;
            switch (L(M2)) {
                case 0:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 1:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var2 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 2:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var3 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 3:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var4 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case K.k.LONG_FIELD_NUMBER /* 4 */:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var5 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case K.k.STRING_FIELD_NUMBER /* 5 */:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var6 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var7 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var8 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case K.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var9 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 9:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var10 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 10:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var11 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 11:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var12 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 12:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var13 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 13:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var14 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 14:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var15 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 15:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var16 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 16:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var17 = j0.f1710c;
                        break;
                    }
                    z2 = false;
                    break;
                case 17:
                    if (j(abstractC0159w, obj, i2)) {
                        i0 i0Var18 = j0.f1710c;
                        break;
                    }
                    z2 = false;
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
                    i0 i0Var19 = j0.f1710c;
                    z2 = X.B(i0Var19.h(j2, abstractC0159w), i0Var19.h(j2, obj));
                    break;
                case 50:
                    i0 i0Var20 = j0.f1710c;
                    z2 = X.B(i0Var20.h(j2, abstractC0159w), i0Var20.h(j2, obj));
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
                    long j3 = iArr[i2 + 2] & 1048575;
                    i0 i0Var21 = j0.f1710c;
                    if (i0Var21.f(j3, abstractC0159w) == i0Var21.f(j3, obj)) {
                        break;
                    }
                    z2 = false;
                    break;
            }
            if (!z2) {
                return false;
            }
            i2 += 3;
        }
    }

    public final boolean j(AbstractC0159w abstractC0159w, Object obj, int i2) {
        return n(i2, abstractC0159w) == n(i2, obj);
    }

    public final void k(int i2, Object obj, Object obj2) {
        int i3 = this.f1625a[i2];
        if (j0.f1710c.h(M(i2) & 1048575, obj) == null) {
            return;
        }
        l(i2);
    }

    public final void l(int i2) {
        if (this.f1626b[((i2 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final W m(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.f1626b;
        W w2 = (W) objArr[i3];
        if (w2 != null) {
            return w2;
        }
        W a2 = T.f1643c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a2;
        return a2;
    }

    public final boolean n(int i2, Object obj) {
        int i3 = this.f1625a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & j0.f1710c.f(j2, obj)) != 0;
        }
        int M2 = M(i2);
        long j3 = M2 & 1048575;
        switch (L(M2)) {
            case 0:
                return Double.doubleToRawLongBits(j0.f1710c.d(j3, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(j0.f1710c.e(j3, obj)) != 0;
            case 2:
                return j0.f1710c.g(j3, obj) != 0;
            case 3:
                return j0.f1710c.g(j3, obj) != 0;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                return j0.f1710c.f(j3, obj) != 0;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                return j0.f1710c.g(j3, obj) != 0;
            case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return j0.f1710c.f(j3, obj) != 0;
            case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return j0.f1710c.c(j3, obj);
            case K.k.BYTES_FIELD_NUMBER /* 8 */:
                Object h2 = j0.f1710c.h(j3, obj);
                if (h2 instanceof String) {
                    return !((String) h2).isEmpty();
                }
                if (h2 instanceof C0144g) {
                    return !C0144g.f1685g.equals(h2);
                }
                throw new IllegalArgumentException();
            case 9:
                return j0.f1710c.h(j3, obj) != null;
            case 10:
                return !C0144g.f1685g.equals(j0.f1710c.h(j3, obj));
            case 11:
                return j0.f1710c.f(j3, obj) != 0;
            case 12:
                return j0.f1710c.f(j3, obj) != 0;
            case 13:
                return j0.f1710c.f(j3, obj) != 0;
            case 14:
                return j0.f1710c.g(j3, obj) != 0;
            case 15:
                return j0.f1710c.f(j3, obj) != 0;
            case 16:
                return j0.f1710c.g(j3, obj) != 0;
            case 17:
                return j0.f1710c.h(j3, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean o(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? n(i2, obj) : (i4 & i5) != 0;
    }

    public final boolean q(Object obj, int i2, int i3) {
        return j0.f1710c.f((long) (this.f1625a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0646 A[Catch: all -> 0x025a, TryCatch #3 {all -> 0x025a, blocks: (B:50:0x0255, B:62:0x0641, B:64:0x0646, B:65:0x064b, B:76:0x025d, B:77:0x0270, B:78:0x0283, B:79:0x0296, B:80:0x02a9, B:81:0x02c2, B:82:0x02d5, B:83:0x02e8, B:84:0x02fb, B:85:0x030e, B:86:0x0321, B:87:0x0334, B:88:0x0347, B:89:0x035a, B:90:0x036d, B:91:0x0380, B:92:0x0393, B:93:0x03a6, B:94:0x03b9, B:95:0x03d2, B:96:0x03e5, B:97:0x03f8, B:98:0x040c, B:99:0x0414, B:100:0x0427, B:101:0x043a, B:102:0x044d, B:103:0x0460, B:104:0x0473, B:105:0x0486, B:106:0x0499, B:107:0x04ac, B:108:0x04c5, B:109:0x04db, B:110:0x04f1, B:111:0x0508, B:112:0x051f, B:113:0x0538, B:114:0x054e, B:115:0x0561, B:116:0x057a, B:117:0x0585, B:118:0x059d, B:119:0x05b4, B:120:0x05cb, B:121:0x05e1, B:122:0x05f7, B:123:0x060c, B:124:0x0624), top: B:49:0x0255 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0651 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(e0 e0Var, Object obj, C0148k c0148k, C0152o c0152o) {
        int i2;
        int i3;
        int L2;
        AbstractC0147j abstractC0147j;
        C c2;
        int[] iArr = this.f1631g;
        int i4 = this.f1633i;
        int i5 = this.f1632h;
        d0 d0Var = null;
        while (true) {
            try {
                int a2 = c0148k.a();
                int B2 = B(a2);
                if (B2 >= 0) {
                    int M2 = M(B2);
                    try {
                        L2 = L(M2);
                        abstractC0147j = c0148k.f1715a;
                        c2 = this.f1635k;
                    } catch (C0162z unused) {
                    }
                    switch (L2) {
                        case 0:
                            i2 = i5;
                            long y2 = y(M2);
                            c0148k.w(1);
                            j0.f1710c.l(obj, y2, abstractC0147j.h());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 1:
                            i2 = i5;
                            long y3 = y(M2);
                            c0148k.w(5);
                            j0.f1710c.m(obj, y3, abstractC0147j.l());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 2:
                            i2 = i5;
                            long y4 = y(M2);
                            c0148k.w(0);
                            j0.n(obj, y4, abstractC0147j.n());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 3:
                            i2 = i5;
                            long y5 = y(M2);
                            c0148k.w(0);
                            j0.n(obj, y5, abstractC0147j.w());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case K.k.LONG_FIELD_NUMBER /* 4 */:
                            i2 = i5;
                            long y6 = y(M2);
                            c0148k.w(0);
                            j0.m(obj, y6, abstractC0147j.m());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case K.k.STRING_FIELD_NUMBER /* 5 */:
                            i2 = i5;
                            long y7 = y(M2);
                            c0148k.w(1);
                            j0.n(obj, y7, abstractC0147j.k());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case K.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            i2 = i5;
                            long y8 = y(M2);
                            c0148k.w(5);
                            j0.m(obj, y8, abstractC0147j.j());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case K.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            i2 = i5;
                            long y9 = y(M2);
                            c0148k.w(0);
                            j0.f1710c.j(obj, y9, abstractC0147j.f());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case K.k.BYTES_FIELD_NUMBER /* 8 */:
                            i2 = i5;
                            E(M2, c0148k, obj);
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 9:
                            i2 = i5;
                            AbstractC0138a abstractC0138a = (AbstractC0138a) v(B2, obj);
                            W m2 = m(B2);
                            c0148k.w(2);
                            c0148k.c(abstractC0138a, m2, c0152o);
                            J(obj, B2, abstractC0138a);
                            i5 = i2;
                            break;
                        case 10:
                            i2 = i5;
                            j0.o(obj, y(M2), c0148k.e());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 11:
                            i2 = i5;
                            long y10 = y(M2);
                            c0148k.w(0);
                            j0.m(obj, y10, abstractC0147j.v());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 12:
                            i2 = i5;
                            c0148k.w(0);
                            int i6 = abstractC0147j.i();
                            l(B2);
                            j0.m(obj, y(M2), i6);
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 13:
                            i2 = i5;
                            long y11 = y(M2);
                            c0148k.w(5);
                            j0.m(obj, y11, abstractC0147j.o());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 14:
                            i2 = i5;
                            long y12 = y(M2);
                            c0148k.w(1);
                            j0.n(obj, y12, abstractC0147j.p());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 15:
                            i2 = i5;
                            long y13 = y(M2);
                            c0148k.w(0);
                            j0.m(obj, y13, abstractC0147j.q());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 16:
                            i2 = i5;
                            long y14 = y(M2);
                            c0148k.w(0);
                            j0.n(obj, y14, abstractC0147j.r());
                            H(B2, obj);
                            i5 = i2;
                            break;
                        case 17:
                            i2 = i5;
                            AbstractC0138a abstractC0138a2 = (AbstractC0138a) v(B2, obj);
                            W m3 = m(B2);
                            c0148k.w(3);
                            c0148k.b(abstractC0138a2, m3, c0152o);
                            J(obj, B2, abstractC0138a2);
                            i5 = i2;
                            break;
                        case 18:
                            i2 = i5;
                            long y15 = y(M2);
                            c2.getClass();
                            c0148k.g(C.b(y15, obj));
                            i5 = i2;
                            break;
                        case 19:
                            i2 = i5;
                            long y16 = y(M2);
                            c2.getClass();
                            c0148k.l(C.b(y16, obj));
                            i5 = i2;
                            break;
                        case 20:
                            i2 = i5;
                            long y17 = y(M2);
                            c2.getClass();
                            c0148k.n(C.b(y17, obj));
                            i5 = i2;
                            break;
                        case 21:
                            i2 = i5;
                            long y18 = y(M2);
                            c2.getClass();
                            c0148k.u(C.b(y18, obj));
                            i5 = i2;
                            break;
                        case 22:
                            i2 = i5;
                            long y19 = y(M2);
                            c2.getClass();
                            c0148k.m(C.b(y19, obj));
                            i5 = i2;
                            break;
                        case 23:
                            i2 = i5;
                            long y20 = y(M2);
                            c2.getClass();
                            c0148k.k(C.b(y20, obj));
                            i5 = i2;
                            break;
                        case 24:
                            i2 = i5;
                            long y21 = y(M2);
                            c2.getClass();
                            c0148k.j(C.b(y21, obj));
                            i5 = i2;
                            break;
                        case 25:
                            i2 = i5;
                            long y22 = y(M2);
                            c2.getClass();
                            c0148k.d(C.b(y22, obj));
                            i5 = i2;
                            break;
                        case 26:
                            i2 = i5;
                            F(M2, c0148k, obj);
                            i5 = i2;
                            break;
                        case 27:
                            i2 = i5;
                            D(obj, M2, c0148k, m(B2), c0152o);
                            i5 = i2;
                            break;
                        case 28:
                            i2 = i5;
                            long y23 = y(M2);
                            c2.getClass();
                            c0148k.f(C.b(y23, obj));
                            i5 = i2;
                            break;
                        case 29:
                            i2 = i5;
                            long y24 = y(M2);
                            c2.getClass();
                            c0148k.t(C.b(y24, obj));
                            i5 = i2;
                            break;
                        case 30:
                            i2 = i5;
                            long y25 = y(M2);
                            c2.getClass();
                            InterfaceC0160x b2 = C.b(y25, obj);
                            c0148k.h(b2);
                            l(B2);
                            X.z(obj, a2, b2, d0Var, e0Var);
                            i5 = i2;
                            break;
                        case 31:
                            i2 = i5;
                            long y26 = y(M2);
                            c2.getClass();
                            c0148k.o(C.b(y26, obj));
                            i5 = i2;
                            break;
                        case 32:
                            i2 = i5;
                            long y27 = y(M2);
                            c2.getClass();
                            c0148k.p(C.b(y27, obj));
                            i5 = i2;
                            break;
                        case 33:
                            i2 = i5;
                            long y28 = y(M2);
                            c2.getClass();
                            c0148k.q(C.b(y28, obj));
                            i5 = i2;
                            break;
                        case 34:
                            i2 = i5;
                            long y29 = y(M2);
                            c2.getClass();
                            c0148k.r(C.b(y29, obj));
                            i5 = i2;
                            break;
                        case 35:
                            i2 = i5;
                            long y30 = y(M2);
                            c2.getClass();
                            c0148k.g(C.b(y30, obj));
                            i5 = i2;
                            break;
                        case 36:
                            i2 = i5;
                            long y31 = y(M2);
                            c2.getClass();
                            c0148k.l(C.b(y31, obj));
                            i5 = i2;
                            break;
                        case 37:
                            i2 = i5;
                            long y32 = y(M2);
                            c2.getClass();
                            c0148k.n(C.b(y32, obj));
                            i5 = i2;
                            break;
                        case 38:
                            i2 = i5;
                            long y33 = y(M2);
                            c2.getClass();
                            c0148k.u(C.b(y33, obj));
                            i5 = i2;
                            break;
                        case 39:
                            i2 = i5;
                            long y34 = y(M2);
                            c2.getClass();
                            c0148k.m(C.b(y34, obj));
                            i5 = i2;
                            break;
                        case 40:
                            i2 = i5;
                            long y35 = y(M2);
                            c2.getClass();
                            c0148k.k(C.b(y35, obj));
                            i5 = i2;
                            break;
                        case 41:
                            i2 = i5;
                            long y36 = y(M2);
                            c2.getClass();
                            c0148k.j(C.b(y36, obj));
                            i5 = i2;
                            break;
                        case 42:
                            i2 = i5;
                            long y37 = y(M2);
                            c2.getClass();
                            c0148k.d(C.b(y37, obj));
                            i5 = i2;
                            break;
                        case 43:
                            i2 = i5;
                            long y38 = y(M2);
                            c2.getClass();
                            c0148k.t(C.b(y38, obj));
                            i5 = i2;
                            break;
                        case 44:
                            i2 = i5;
                            long y39 = y(M2);
                            c2.getClass();
                            InterfaceC0160x b3 = C.b(y39, obj);
                            c0148k.h(b3);
                            l(B2);
                            X.z(obj, a2, b3, d0Var, e0Var);
                            i5 = i2;
                            break;
                        case 45:
                            i2 = i5;
                            long y40 = y(M2);
                            c2.getClass();
                            c0148k.o(C.b(y40, obj));
                            i5 = i2;
                            break;
                        case 46:
                            i2 = i5;
                            long y41 = y(M2);
                            c2.getClass();
                            c0148k.p(C.b(y41, obj));
                            i5 = i2;
                            break;
                        case 47:
                            i2 = i5;
                            long y42 = y(M2);
                            c2.getClass();
                            c0148k.q(C.b(y42, obj));
                            i5 = i2;
                            break;
                        case 48:
                            i2 = i5;
                            long y43 = y(M2);
                            c2.getClass();
                            c0148k.r(C.b(y43, obj));
                            i5 = i2;
                            break;
                        case 49:
                            i2 = i5;
                            i3 = 0;
                            try {
                                try {
                                    C(obj, y(M2), c0148k, m(B2), c0152o);
                                } catch (Throwable th) {
                                    th = th;
                                    for (int i7 = i2; i7 < i4; i7++) {
                                        k(iArr[i7], obj, d0Var);
                                    }
                                    if (d0Var != null) {
                                        e0Var.getClass();
                                        ((AbstractC0159w) obj).unknownFields = d0Var;
                                    }
                                    throw th;
                                }
                            } catch (C0162z unused2) {
                                e0Var.getClass();
                                if (d0Var == null) {
                                }
                                if (!e0.c(i3, c0148k, d0Var)) {
                                }
                                i5 = i2;
                            }
                            i5 = i2;
                            break;
                        case 50:
                            try {
                                s(obj, B2, this.f1626b[(B2 / 3) * 2], c0152o, c0148k);
                                i2 = i5;
                            } catch (C0162z unused3) {
                                i2 = i5;
                                i3 = 0;
                                e0Var.getClass();
                                if (d0Var == null) {
                                    d0Var = e0.a(obj);
                                }
                                if (!e0.c(i3, c0148k, d0Var)) {
                                    for (int i8 = i2; i8 < i4; i8++) {
                                        k(iArr[i8], obj, d0Var);
                                    }
                                    if (d0Var != null) {
                                        ((AbstractC0159w) obj).unknownFields = d0Var;
                                        return;
                                    }
                                    return;
                                }
                                i5 = i2;
                            }
                            i5 = i2;
                        case 51:
                            long y44 = y(M2);
                            c0148k.w(1);
                            j0.o(obj, y44, Double.valueOf(abstractC0147j.h()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 52:
                            long y45 = y(M2);
                            c0148k.w(5);
                            j0.o(obj, y45, Float.valueOf(abstractC0147j.l()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 53:
                            long y46 = y(M2);
                            c0148k.w(0);
                            j0.o(obj, y46, Long.valueOf(abstractC0147j.n()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 54:
                            long y47 = y(M2);
                            c0148k.w(0);
                            j0.o(obj, y47, Long.valueOf(abstractC0147j.w()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 55:
                            long y48 = y(M2);
                            c0148k.w(0);
                            j0.o(obj, y48, Integer.valueOf(abstractC0147j.m()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 56:
                            long y49 = y(M2);
                            c0148k.w(1);
                            j0.o(obj, y49, Long.valueOf(abstractC0147j.k()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 57:
                            long y50 = y(M2);
                            c0148k.w(5);
                            j0.o(obj, y50, Integer.valueOf(abstractC0147j.j()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 58:
                            long y51 = y(M2);
                            c0148k.w(0);
                            j0.o(obj, y51, Boolean.valueOf(abstractC0147j.f()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 59:
                            E(M2, c0148k, obj);
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 60:
                            AbstractC0138a abstractC0138a3 = (AbstractC0138a) w(obj, a2, B2);
                            W m4 = m(B2);
                            c0148k.w(2);
                            c0148k.c(abstractC0138a3, m4, c0152o);
                            K(obj, a2, B2, abstractC0138a3);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 61:
                            j0.o(obj, y(M2), c0148k.e());
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 62:
                            long y52 = y(M2);
                            c0148k.w(0);
                            j0.o(obj, y52, Integer.valueOf(abstractC0147j.v()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 63:
                            c0148k.w(0);
                            int i9 = abstractC0147j.i();
                            l(B2);
                            j0.o(obj, y(M2), Integer.valueOf(i9));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 64:
                            long y53 = y(M2);
                            c0148k.w(5);
                            j0.o(obj, y53, Integer.valueOf(abstractC0147j.o()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 65:
                            long y54 = y(M2);
                            c0148k.w(1);
                            j0.o(obj, y54, Long.valueOf(abstractC0147j.p()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 66:
                            long y55 = y(M2);
                            c0148k.w(0);
                            j0.o(obj, y55, Integer.valueOf(abstractC0147j.q()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 67:
                            long y56 = y(M2);
                            c0148k.w(0);
                            j0.o(obj, y56, Long.valueOf(abstractC0147j.r()));
                            I(obj, a2, B2);
                            i2 = i5;
                            i5 = i2;
                            break;
                        case 68:
                            AbstractC0138a abstractC0138a4 = (AbstractC0138a) w(obj, a2, B2);
                            W m5 = m(B2);
                            c0148k.w(3);
                            c0148k.b(abstractC0138a4, m5, c0152o);
                            K(obj, a2, B2, abstractC0138a4);
                            i2 = i5;
                            i5 = i2;
                            break;
                        default:
                            if (d0Var == null) {
                                e0Var.getClass();
                                d0Var = e0.a(obj);
                            }
                            e0Var.getClass();
                            if (!e0.c(0, c0148k, d0Var)) {
                                while (i5 < i4) {
                                    k(iArr[i5], obj, d0Var);
                                    i5++;
                                }
                                if (d0Var != null) {
                                    ((AbstractC0159w) obj).unknownFields = d0Var;
                                    return;
                                }
                                return;
                            }
                            i2 = i5;
                            i5 = i2;
                            break;
                    }
                } else {
                    if (a2 == Integer.MAX_VALUE) {
                        while (i5 < i4) {
                            k(iArr[i5], obj, d0Var);
                            i5++;
                        }
                        if (d0Var != null) {
                            e0Var.getClass();
                            ((AbstractC0159w) obj).unknownFields = d0Var;
                            return;
                        }
                        return;
                    }
                    e0Var.getClass();
                    if (d0Var == null) {
                        d0Var = e0.a(obj);
                    }
                    if (!e0.c(0, c0148k, d0Var)) {
                        while (i5 < i4) {
                            k(iArr[i5], obj, d0Var);
                            i5++;
                        }
                        if (d0Var != null) {
                            ((AbstractC0159w) obj).unknownFields = d0Var;
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i2 = i5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(Object obj, int i2, Object obj2, C0152o c0152o, C0148k c0148k) {
        long M2 = M(i2) & 1048575;
        Object h2 = j0.f1710c.h(M2, obj);
        J j2 = this.f1637m;
        if (h2 == null) {
            j2.getClass();
            h2 = I.f1618f.b();
            j0.o(obj, M2, h2);
        } else {
            j2.getClass();
            if (!((I) h2).f1619e) {
                I b2 = I.f1618f.b();
                J.b(b2, h2);
                j0.o(obj, M2, b2);
                h2 = b2;
            }
        }
        j2.getClass();
        I i3 = (I) h2;
        G g2 = ((H) obj2).f1617a;
        c0148k.w(2);
        AbstractC0147j abstractC0147j = c0148k.f1715a;
        int e2 = abstractC0147j.e(abstractC0147j.v());
        Object obj3 = "";
        K.k kVar = g2.f1616c;
        Object obj4 = kVar;
        while (true) {
            try {
                int a2 = c0148k.a();
                if (a2 == Integer.MAX_VALUE || abstractC0147j.c()) {
                    break;
                }
                if (a2 == 1) {
                    obj3 = c0148k.i(g2.f1614a, null, null);
                } else if (a2 != 2) {
                    try {
                        if (!c0148k.x()) {
                            throw new A("Unable to parse map entry.");
                        }
                    } catch (C0162z unused) {
                        if (!c0148k.x()) {
                            throw new A("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj4 = c0148k.i(g2.f1615b, kVar.getClass(), c0152o);
                }
            } catch (Throwable th) {
                abstractC0147j.d(e2);
                throw th;
            }
        }
    }

    public final void t(int i2, Object obj, Object obj2) {
        if (n(i2, obj2)) {
            long M2 = M(i2) & 1048575;
            Unsafe unsafe = f1624o;
            Object object = unsafe.getObject(obj2, M2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1625a[i2] + " is present but null: " + obj2);
            }
            W m2 = m(i2);
            if (!n(i2, obj)) {
                if (p(object)) {
                    AbstractC0159w g2 = m2.g();
                    m2.c(g2, object);
                    unsafe.putObject(obj, M2, g2);
                } else {
                    unsafe.putObject(obj, M2, object);
                }
                H(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M2);
            if (!p(object2)) {
                AbstractC0159w g3 = m2.g();
                m2.c(g3, object2);
                unsafe.putObject(obj, M2, g3);
                object2 = g3;
            }
            m2.c(object2, object);
        }
    }

    public final void u(int i2, Object obj, Object obj2) {
        int[] iArr = this.f1625a;
        int i3 = iArr[i2];
        if (q(obj2, i3, i2)) {
            long M2 = M(i2) & 1048575;
            Unsafe unsafe = f1624o;
            Object object = unsafe.getObject(obj2, M2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2);
            }
            W m2 = m(i2);
            if (!q(obj, i3, i2)) {
                if (p(object)) {
                    AbstractC0159w g2 = m2.g();
                    m2.c(g2, object);
                    unsafe.putObject(obj, M2, g2);
                } else {
                    unsafe.putObject(obj, M2, object);
                }
                I(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, M2);
            if (!p(object2)) {
                AbstractC0159w g3 = m2.g();
                m2.c(g3, object2);
                unsafe.putObject(obj, M2, g3);
                object2 = g3;
            }
            m2.c(object2, object);
        }
    }

    public final Object v(int i2, Object obj) {
        W m2 = m(i2);
        long M2 = M(i2) & 1048575;
        if (!n(i2, obj)) {
            return m2.g();
        }
        Object object = f1624o.getObject(obj, M2);
        if (p(object)) {
            return object;
        }
        AbstractC0159w g2 = m2.g();
        if (object != null) {
            m2.c(g2, object);
        }
        return g2;
    }

    public final Object w(Object obj, int i2, int i3) {
        W m2 = m(i3);
        if (!q(obj, i2, i3)) {
            return m2.g();
        }
        Object object = f1624o.getObject(obj, M(i3) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0159w g2 = m2.g();
        if (object != null) {
            m2.c(g2, object);
        }
        return g2;
    }
}
