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
    public static final int[] f1463n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f1464o = j0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1465a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1466b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1467c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1468d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0089a f1469e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1470f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1471g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1472h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1473i;

    /* renamed from: j, reason: collision with root package name */
    public final P f1474j;

    /* renamed from: k, reason: collision with root package name */
    public final C f1475k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f1476l;

    /* renamed from: m, reason: collision with root package name */
    public final J f1477m;

    public N(int[] iArr, Object[] objArr, int i2, int i3, AbstractC0089a abstractC0089a, int[] iArr2, int i4, int i5, P p2, C c2, e0 e0Var, C0104p c0104p, J j2) {
        this.f1465a = iArr;
        this.f1466b = objArr;
        this.f1467c = i2;
        this.f1468d = i3;
        this.f1470f = abstractC0089a instanceof AbstractC0110w;
        this.f1471g = iArr2;
        this.f1472h = i4;
        this.f1473i = i5;
        this.f1474j = p2;
        this.f1475k = c2;
        this.f1476l = e0Var;
        this.f1469e = abstractC0089a;
        this.f1477m = j2;
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
        if (obj instanceof AbstractC0110w) {
            return ((AbstractC0110w) obj).g();
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
    public static N w(V v2, P p2, C c2, e0 e0Var, C0104p c0104p, J j2) {
        int i2;
        int charAt;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        char charAt2;
        int i10;
        char charAt3;
        int i11;
        char charAt4;
        int i12;
        char charAt5;
        int i13;
        char charAt6;
        int i14;
        char charAt7;
        int i15;
        char charAt8;
        int i16;
        char charAt9;
        int i17;
        int i18;
        int i19;
        Class<?> cls;
        int i20;
        int objectFieldOffset;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Field F2;
        char charAt10;
        int i26;
        int i27;
        Object obj;
        Field F3;
        Object obj2;
        Field F4;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        char charAt13;
        int i31;
        char charAt14;
        String str = v2.f1490b;
        int length = str.length();
        int i32 = 55296;
        if (str.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i2 = i33 + 1;
                if (str.charAt(i33) < 55296) {
                    break;
                }
                i33 = i2;
            }
        } else {
            i2 = 1;
        }
        int i34 = i2 + 1;
        int charAt15 = str.charAt(i2);
        if (charAt15 >= 55296) {
            int i35 = charAt15 & 8191;
            int i36 = 13;
            while (true) {
                i31 = i34 + 1;
                charAt14 = str.charAt(i34);
                if (charAt14 < 55296) {
                    break;
                }
                i35 |= (charAt14 & 8191) << i36;
                i36 += 13;
                i34 = i31;
            }
            charAt15 = i35 | (charAt14 << i36);
            i34 = i31;
        }
        if (charAt15 == 0) {
            i4 = 0;
            i7 = 0;
            charAt = 0;
            i3 = 0;
            i6 = 0;
            i8 = 0;
            iArr = f1463n;
            i5 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt16 = str.charAt(i34);
            if (charAt16 >= 55296) {
                int i38 = charAt16 & 8191;
                int i39 = 13;
                while (true) {
                    i16 = i37 + 1;
                    charAt9 = str.charAt(i37);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i38 |= (charAt9 & 8191) << i39;
                    i39 += 13;
                    i37 = i16;
                }
                charAt16 = i38 | (charAt9 << i39);
                i37 = i16;
            }
            int i40 = i37 + 1;
            int charAt17 = str.charAt(i37);
            if (charAt17 >= 55296) {
                int i41 = charAt17 & 8191;
                int i42 = 13;
                while (true) {
                    i15 = i40 + 1;
                    charAt8 = str.charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i41 |= (charAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i15;
                }
                charAt17 = i41 | (charAt8 << i42);
                i40 = i15;
            }
            int i43 = i40 + 1;
            int charAt18 = str.charAt(i40);
            if (charAt18 >= 55296) {
                int i44 = charAt18 & 8191;
                int i45 = 13;
                while (true) {
                    i14 = i43 + 1;
                    charAt7 = str.charAt(i43);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i44 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i14;
                }
                charAt18 = i44 | (charAt7 << i45);
                i43 = i14;
            }
            int i46 = i43 + 1;
            int charAt19 = str.charAt(i43);
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i13 = i46 + 1;
                    charAt6 = str.charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i47 |= (charAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i13;
                }
                charAt19 = i47 | (charAt6 << i48);
                i46 = i13;
            }
            int i49 = i46 + 1;
            charAt = str.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i12 = i49 + 1;
                    charAt5 = str.charAt(i49);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i50 |= (charAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i12;
                }
                charAt = i50 | (charAt5 << i51);
                i49 = i12;
            }
            int i52 = i49 + 1;
            int charAt20 = str.charAt(i49);
            if (charAt20 >= 55296) {
                int i53 = charAt20 & 8191;
                int i54 = 13;
                while (true) {
                    i11 = i52 + 1;
                    charAt4 = str.charAt(i52);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i53 |= (charAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i11;
                }
                charAt20 = i53 | (charAt4 << i54);
                i52 = i11;
            }
            int i55 = i52 + 1;
            int charAt21 = str.charAt(i52);
            if (charAt21 >= 55296) {
                int i56 = charAt21 & 8191;
                int i57 = 13;
                while (true) {
                    i10 = i55 + 1;
                    charAt3 = str.charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i10;
                }
                charAt21 = i56 | (charAt3 << i57);
                i55 = i10;
            }
            int i58 = i55 + 1;
            int charAt22 = str.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i9 = i58 + 1;
                    charAt2 = str.charAt(i58);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i59 |= (charAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i9;
                }
                charAt22 = i59 | (charAt2 << i60);
                i58 = i9;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i61 = (charAt16 * 2) + charAt17;
            int i62 = charAt20;
            i3 = charAt18;
            i4 = i62;
            i5 = charAt16;
            i34 = i58;
            iArr = iArr2;
            i6 = charAt19;
            i7 = i61;
            i8 = charAt22;
        }
        Unsafe unsafe = f1464o;
        Object[] objArr = v2.f1491c;
        Class<?> cls2 = v2.f1489a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i63 = i8 + i4;
        int i64 = i63;
        int i65 = i8;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int charAt23 = str.charAt(i34);
            if (charAt23 >= i32) {
                int i69 = charAt23 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    charAt13 = str.charAt(i70);
                    i17 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i69 |= (charAt13 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                    length = i17;
                }
                charAt23 = i69 | (charAt13 << i71);
                i18 = i30;
            } else {
                i17 = length;
                i18 = i68;
            }
            int i72 = i18 + 1;
            int charAt24 = str.charAt(i18);
            Object[] objArr3 = objArr;
            char c3 = 55296;
            if (charAt24 >= 55296) {
                int i73 = charAt24 & 8191;
                int i74 = 13;
                while (true) {
                    i29 = i72 + 1;
                    charAt12 = str.charAt(i72);
                    if (charAt12 < c3) {
                        break;
                    }
                    i73 |= (charAt12 & 8191) << i74;
                    i74 += 13;
                    i72 = i29;
                    c3 = 55296;
                }
                charAt24 = i73 | (charAt12 << i74);
                i72 = i29;
            }
            int i75 = charAt24 & 255;
            int i76 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int[] iArr4 = iArr3;
            if (i75 >= 51) {
                int i77 = i72 + 1;
                int charAt25 = str.charAt(i72);
                char c4 = 55296;
                if (charAt25 >= 55296) {
                    int i78 = charAt25 & 8191;
                    int i79 = 13;
                    while (true) {
                        i28 = i77 + 1;
                        charAt11 = str.charAt(i77);
                        if (charAt11 < c4) {
                            break;
                        }
                        i78 |= (charAt11 & 8191) << i79;
                        i79 += 13;
                        i77 = i28;
                        c4 = 55296;
                    }
                    charAt25 = i78 | (charAt11 << i79);
                    i77 = i28;
                }
                int i80 = i75 - 51;
                int i81 = i77;
                if (i80 == 9 || i80 == 17) {
                    i27 = i7 + 1;
                    objArr2[((i67 / 3) * 2) + 1] = objArr3[i7];
                } else {
                    if (i80 == 12) {
                        int a2 = v2.a();
                        if (a2 == 0) {
                            throw null;
                        }
                        if ((a2 == 1) || (charAt24 & 2048) != 0) {
                            i27 = i7 + 1;
                            objArr2[((i67 / 3) * 2) + 1] = objArr3[i7];
                        }
                    }
                    int i82 = charAt25 * 2;
                    obj = objArr3[i82];
                    if (obj instanceof Field) {
                        F3 = F(cls2, (String) obj);
                        objArr3[i82] = F3;
                    } else {
                        F3 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F3);
                    int i83 = i82 + 1;
                    obj2 = objArr3[i83];
                    if (obj2 instanceof Field) {
                        F4 = F(cls2, (String) obj2);
                        objArr3[i83] = F4;
                    } else {
                        F4 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F4);
                    int i84 = i5;
                    i21 = objectFieldOffset3;
                    i25 = objectFieldOffset2;
                    i19 = i84;
                    i24 = i7;
                    i22 = i81;
                    i23 = 0;
                    cls = cls2;
                }
                i7 = i27;
                int i822 = charAt25 * 2;
                obj = objArr3[i822];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(F3);
                int i832 = i822 + 1;
                obj2 = objArr3[i832];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(F4);
                int i842 = i5;
                i21 = objectFieldOffset32;
                i25 = objectFieldOffset22;
                i19 = i842;
                i24 = i7;
                i22 = i81;
                i23 = 0;
                cls = cls2;
            } else {
                int i85 = i7 + 1;
                Field F5 = F(cls2, (String) objArr3[i7]);
                if (i75 == 9 || i75 == 17) {
                    i19 = i5;
                    objArr2[((i67 / 3) * 2) + 1] = F5.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i19 = i5;
                        i26 = i7 + 2;
                        objArr2[((i67 / 3) * 2) + 1] = objArr3[i85];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        i19 = i5;
                        if (v2.a() == 1 || (charAt24 & 2048) != 0) {
                            i26 = i7 + 2;
                            objArr2[((i67 / 3) * 2) + 1] = objArr3[i85];
                        }
                    } else if (i75 == 50) {
                        int i86 = i65 + 1;
                        iArr[i65] = i67;
                        int i87 = (i67 / 3) * 2;
                        int i88 = i7 + 2;
                        objArr2[i87] = objArr3[i85];
                        if ((charAt24 & 2048) != 0) {
                            i20 = i7 + 3;
                            objArr2[i87 + 1] = objArr3[i88];
                            i19 = i5;
                            cls = cls2;
                            i65 = i86;
                        } else {
                            cls = cls2;
                            i20 = i88;
                            i65 = i86;
                            i19 = i5;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F5);
                        if ((charAt24 & 4096) != 0 || i75 > 17) {
                            i21 = 1048575;
                            i22 = i72;
                            i23 = 0;
                        } else {
                            int i89 = i72 + 1;
                            int charAt26 = str.charAt(i72);
                            if (charAt26 >= 55296) {
                                int i90 = charAt26 & 8191;
                                int i91 = 13;
                                while (true) {
                                    i22 = i89 + 1;
                                    charAt10 = str.charAt(i89);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i90 |= (charAt10 & 8191) << i91;
                                    i91 += 13;
                                    i89 = i22;
                                }
                                charAt26 = i90 | (charAt10 << i91);
                            } else {
                                i22 = i89;
                            }
                            int i92 = (charAt26 / 32) + (i19 * 2);
                            Object obj3 = objArr3[i92];
                            if (obj3 instanceof Field) {
                                F2 = (Field) obj3;
                            } else {
                                F2 = F(cls, (String) obj3);
                                objArr3[i92] = F2;
                            }
                            i21 = (int) unsafe.objectFieldOffset(F2);
                            i23 = charAt26 % 32;
                        }
                        if (i75 >= 18 || i75 > 49) {
                            i24 = i20;
                            i25 = objectFieldOffset;
                        } else {
                            iArr[i64] = objectFieldOffset;
                            i24 = i20;
                            i25 = objectFieldOffset;
                            i64++;
                        }
                    } else {
                        i19 = i5;
                    }
                    i20 = i26;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F5);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i21 = 1048575;
                    i22 = i72;
                    i23 = 0;
                    if (i75 >= 18) {
                    }
                    i24 = i20;
                    i25 = objectFieldOffset;
                }
                cls = cls2;
                i20 = i85;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F5);
                if ((charAt24 & 4096) != 0) {
                }
                i21 = 1048575;
                i22 = i72;
                i23 = 0;
                if (i75 >= 18) {
                }
                i24 = i20;
                i25 = objectFieldOffset;
            }
            int i93 = i67 + 1;
            iArr4[i67] = i76;
            int i94 = i67 + 2;
            String str2 = str;
            iArr4[i93] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | i25;
            i67 += 3;
            iArr4[i94] = (i23 << 20) | i21;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i17;
            i5 = i19;
            i34 = i22;
            i32 = 55296;
            i7 = i24;
            iArr3 = iArr4;
        }
        return new N(iArr3, objArr2, i3, i6, v2.f1489a, iArr, i8, i63, p2, c2, e0Var, c0104p, j2);
    }

    public static long x(int i2) {
        return i2 & 1048575;
    }

    public static int y(long j2, Object obj) {
        return ((Integer) j0.f1550c.h(j2, obj)).intValue();
    }

    public static long z(long j2, Object obj) {
        return ((Long) j0.f1550c.h(j2, obj)).longValue();
    }

    public final int A(int i2) {
        if (i2 >= this.f1467c && i2 <= this.f1468d) {
            int[] iArr = this.f1465a;
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
        }
        return -1;
    }

    public final void B(Object obj, long j2, C0099k c0099k, W w2, C0103o c0103o) {
        int u2;
        this.f1475k.getClass();
        InterfaceC0111x a2 = C.a(j2, obj);
        AbstractC0098j abstractC0098j = c0099k.f1555a;
        int i2 = c0099k.f1556b;
        if ((i2 & 7) != 3) {
            throw A.b();
        }
        do {
            AbstractC0110w i3 = w2.i();
            c0099k.b(i3, w2, c0103o);
            w2.d(i3);
            ((U) a2).add(i3);
            if (abstractC0098j.c() || c0099k.f1558d != 0) {
                return;
            } else {
                u2 = abstractC0098j.u();
            }
        } while (u2 == i2);
        c0099k.f1558d = u2;
    }

    public final void C(Object obj, int i2, C0099k c0099k, W w2, C0103o c0103o) {
        int u2;
        this.f1475k.getClass();
        InterfaceC0111x a2 = C.a(i2 & 1048575, obj);
        AbstractC0098j abstractC0098j = c0099k.f1555a;
        int i3 = c0099k.f1556b;
        if ((i3 & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0110w i4 = w2.i();
            c0099k.c(i4, w2, c0103o);
            w2.d(i4);
            ((U) a2).add(i4);
            if (abstractC0098j.c() || c0099k.f1558d != 0) {
                return;
            } else {
                u2 = abstractC0098j.u();
            }
        } while (u2 == i3);
        c0099k.f1558d = u2;
    }

    public final void D(int i2, C0099k c0099k, Object obj) {
        AbstractC0098j abstractC0098j = c0099k.f1555a;
        if ((536870912 & i2) != 0) {
            c0099k.w(2);
            j0.o(obj, i2 & 1048575, abstractC0098j.t());
        } else if (!this.f1470f) {
            j0.o(obj, i2 & 1048575, c0099k.e());
        } else {
            c0099k.w(2);
            j0.o(obj, i2 & 1048575, abstractC0098j.s());
        }
    }

    public final void E(int i2, C0099k c0099k, Object obj) {
        int i3 = 536870912 & i2;
        C c2 = this.f1475k;
        if (i3 != 0) {
            c2.getClass();
            c0099k.s(C.a(i2 & 1048575, obj), true);
        } else {
            c2.getClass();
            c0099k.s(C.a(i2 & 1048575, obj), false);
        }
    }

    public final void G(int i2, Object obj) {
        int i3 = this.f1465a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        j0.m(obj, j2, (1 << (i3 >>> 20)) | j0.f1550c.f(j2, obj));
    }

    public final void H(Object obj, int i2, int i3) {
        j0.m(obj, this.f1465a[i3 + 2] & 1048575, i2);
    }

    public final void I(Object obj, int i2, AbstractC0089a abstractC0089a) {
        f1464o.putObject(obj, L(i2) & 1048575, abstractC0089a);
        G(i2, obj);
    }

    public final void J(Object obj, int i2, int i3, AbstractC0089a abstractC0089a) {
        f1464o.putObject(obj, L(i3) & 1048575, abstractC0089a);
        H(obj, i2, i3);
    }

    public final int L(int i2) {
        return this.f1465a[i2 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, F f2) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        N n2 = this;
        int[] iArr = n2.f1465a;
        int length = iArr.length;
        Unsafe unsafe = f1464o;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int L2 = n2.L(i8);
            int i10 = iArr[i8];
            int K2 = K(L2);
            if (K2 <= 17) {
                int i11 = iArr[i8 + 2];
                int i12 = i11 & i6;
                if (i12 != i7) {
                    i9 = i12 == i6 ? 0 : unsafe.getInt(obj, i12);
                    i7 = i12;
                }
                i2 = L2;
                i3 = 1 << (i11 >>> 20);
            } else {
                i2 = L2;
                i3 = 0;
            }
            long j2 = i2 & i6;
            switch (K2) {
                case 0:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        double d2 = j0.f1550c.d(j2, obj);
                        C0101m c0101m = (C0101m) f2.f1452a;
                        c0101m.getClass();
                        c0101m.h0(Double.doubleToRawLongBits(d2), i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        float e2 = j0.f1550c.e(j2, obj);
                        C0101m c0101m2 = (C0101m) f2.f1452a;
                        c0101m2.getClass();
                        c0101m2.f0(i10, Float.floatToRawIntBits(e2));
                    }
                    n2 = this;
                    break;
                case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).r0(unsafe.getLong(obj, j2), i10);
                    }
                    n2 = this;
                    break;
                case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).r0(unsafe.getLong(obj, j2), i10);
                    }
                    n2 = this;
                    break;
                case H.k.LONG_FIELD_NUMBER /* 4 */:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).j0(i10, unsafe.getInt(obj, j2));
                    }
                    n2 = this;
                    break;
                case H.k.STRING_FIELD_NUMBER /* 5 */:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).h0(unsafe.getLong(obj, j2), i10);
                    }
                    n2 = this;
                    break;
                case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).f0(i10, unsafe.getInt(obj, j2));
                    }
                    n2 = this;
                    break;
                case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).c0(i10, j0.f1550c.c(j2, obj));
                    }
                    n2 = this;
                    break;
                case H.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((C0101m) f2.f1452a).m0((String) object, i10);
                        } else {
                            ((C0101m) f2.f1452a).d0(i10, (C0095g) object);
                        }
                    }
                    n2 = this;
                    break;
                case 9:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).l0(i10, (AbstractC0089a) unsafe.getObject(obj, j2), n2.m(i8));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).d0(i10, (C0095g) unsafe.getObject(obj, j2));
                    }
                    n2 = this;
                    break;
                case 11:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).p0(i10, unsafe.getInt(obj, j2));
                    }
                    n2 = this;
                    break;
                case 12:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).j0(i10, unsafe.getInt(obj, j2));
                    }
                    n2 = this;
                    break;
                case 13:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).f0(i10, unsafe.getInt(obj, j2));
                    }
                    n2 = this;
                    break;
                case 14:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        ((C0101m) f2.f1452a).h0(unsafe.getLong(obj, j2), i10);
                    }
                    n2 = this;
                    break;
                case 15:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        int i13 = unsafe.getInt(obj, j2);
                        ((C0101m) f2.f1452a).p0(i10, (i13 >> 31) ^ (i13 << 1));
                    }
                    n2 = this;
                    break;
                case 16:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        long j3 = unsafe.getLong(obj, j2);
                        ((C0101m) f2.f1452a).r0((j3 >> 63) ^ (j3 << 1), i10);
                    }
                    n2 = this;
                    break;
                case 17:
                    if (n2.o(obj, i8, i7, i9, i3)) {
                        f2.a(i10, unsafe.getObject(obj, j2), n2.m(i8));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i4 = i7;
                    X.n(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 19:
                    i4 = i7;
                    X.r(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 20:
                    i4 = i7;
                    X.t(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 21:
                    i4 = i7;
                    X.z(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 22:
                    i4 = i7;
                    X.s(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 23:
                    i4 = i7;
                    X.q(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 24:
                    i4 = i7;
                    X.p(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 25:
                    i4 = i7;
                    X.m(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 26:
                    i5 = i7;
                    int i14 = iArr[i8];
                    List list = (List) unsafe.getObject(obj, j2);
                    Class cls = X.f1493a;
                    if (list != null && !list.isEmpty()) {
                        f2.getClass();
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            ((C0101m) f2.f1452a).m0((String) list.get(i15), i14);
                        }
                    }
                    i7 = i5;
                    break;
                case 27:
                    i5 = i7;
                    int i16 = iArr[i8];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    W m2 = n2.m(i8);
                    Class cls2 = X.f1493a;
                    if (list2 != null && !list2.isEmpty()) {
                        f2.getClass();
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            ((C0101m) f2.f1452a).l0(i16, (AbstractC0089a) list2.get(i17), m2);
                        }
                    }
                    i7 = i5;
                    break;
                case 28:
                    i5 = i7;
                    int i18 = iArr[i8];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    Class cls3 = X.f1493a;
                    if (list3 != null && !list3.isEmpty()) {
                        f2.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((C0101m) f2.f1452a).d0(i18, (C0095g) list3.get(i19));
                        }
                    }
                    i7 = i5;
                    break;
                case 29:
                    i4 = i7;
                    z2 = false;
                    X.y(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 30:
                    i4 = i7;
                    z2 = false;
                    X.o(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 31:
                    i4 = i7;
                    z2 = false;
                    X.u(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 32:
                    i4 = i7;
                    z2 = false;
                    X.v(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 33:
                    i4 = i7;
                    z2 = false;
                    X.w(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 34:
                    i4 = i7;
                    z2 = false;
                    X.x(iArr[i8], (List) unsafe.getObject(obj, j2), f2, false);
                    i7 = i4;
                    break;
                case 35:
                    i5 = i7;
                    X.n(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 36:
                    i5 = i7;
                    X.r(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 37:
                    i5 = i7;
                    X.t(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 38:
                    i5 = i7;
                    X.z(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 39:
                    i5 = i7;
                    X.s(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 40:
                    i5 = i7;
                    X.q(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 41:
                    i5 = i7;
                    X.p(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 42:
                    i5 = i7;
                    X.m(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 43:
                    i5 = i7;
                    X.y(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 44:
                    i5 = i7;
                    X.o(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 45:
                    i5 = i7;
                    X.u(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 46:
                    i5 = i7;
                    X.v(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 47:
                    i5 = i7;
                    X.w(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 48:
                    i5 = i7;
                    X.x(iArr[i8], (List) unsafe.getObject(obj, j2), f2, true);
                    i7 = i5;
                    break;
                case 49:
                    i5 = i7;
                    int i20 = iArr[i8];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    W m3 = n2.m(i8);
                    Class cls4 = X.f1493a;
                    if (list4 != null && !list4.isEmpty()) {
                        f2.getClass();
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            f2.a(i20, list4.get(i21), m3);
                        }
                    }
                    i7 = i5;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        int i22 = 2;
                        Object obj2 = n2.f1466b[(i8 / 3) * 2];
                        n2.f1477m.getClass();
                        G g2 = ((H) obj2).f1456a;
                        C0101m c0101m3 = (C0101m) f2.f1452a;
                        c0101m3.getClass();
                        for (Map.Entry entry : ((I) object2).entrySet()) {
                            c0101m3.o0(i10, i22);
                            c0101m3.q0(H.a(g2, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            r.b(c0101m3, g2.f1453a, 1, key);
                            i22 = 2;
                            r.b(c0101m3, g2.f1454b, 2, value);
                            i7 = i7;
                        }
                    }
                    i5 = i7;
                    i7 = i5;
                    break;
                case 51:
                    if (n2.q(obj, i10, i8)) {
                        double doubleValue = ((Double) j0.f1550c.h(j2, obj)).doubleValue();
                        C0101m c0101m4 = (C0101m) f2.f1452a;
                        c0101m4.getClass();
                        c0101m4.h0(Double.doubleToRawLongBits(doubleValue), i10);
                    }
                    break;
                case 52:
                    if (n2.q(obj, i10, i8)) {
                        float floatValue = ((Float) j0.f1550c.h(j2, obj)).floatValue();
                        C0101m c0101m5 = (C0101m) f2.f1452a;
                        c0101m5.getClass();
                        c0101m5.f0(i10, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).r0(z(j2, obj), i10);
                    }
                    break;
                case 54:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).r0(z(j2, obj), i10);
                    }
                    break;
                case 55:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).j0(i10, y(j2, obj));
                    }
                    break;
                case 56:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).h0(z(j2, obj), i10);
                    }
                    break;
                case 57:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).f0(i10, y(j2, obj));
                    }
                    break;
                case 58:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).c0(i10, ((Boolean) j0.f1550c.h(j2, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (n2.q(obj, i10, i8)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            ((C0101m) f2.f1452a).m0((String) object3, i10);
                        } else {
                            ((C0101m) f2.f1452a).d0(i10, (C0095g) object3);
                        }
                    }
                    break;
                case 60:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).l0(i10, (AbstractC0089a) unsafe.getObject(obj, j2), n2.m(i8));
                    }
                    break;
                case 61:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).d0(i10, (C0095g) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).p0(i10, y(j2, obj));
                    }
                    break;
                case 63:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).j0(i10, y(j2, obj));
                    }
                    break;
                case 64:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).f0(i10, y(j2, obj));
                    }
                    break;
                case 65:
                    if (n2.q(obj, i10, i8)) {
                        ((C0101m) f2.f1452a).h0(z(j2, obj), i10);
                    }
                    break;
                case 66:
                    if (n2.q(obj, i10, i8)) {
                        int y2 = y(j2, obj);
                        ((C0101m) f2.f1452a).p0(i10, (y2 >> 31) ^ (y2 << 1));
                    }
                    break;
                case 67:
                    if (n2.q(obj, i10, i8)) {
                        long z3 = z(j2, obj);
                        ((C0101m) f2.f1452a).r0((z3 << 1) ^ (z3 >> 63), i10);
                    }
                    break;
                case 68:
                    if (n2.q(obj, i10, i8)) {
                        f2.a(i10, unsafe.getObject(obj, j2), n2.m(i8));
                    }
                    break;
            }
            i8 += 3;
            i6 = 1048575;
        }
        n2.f1476l.getClass();
        ((AbstractC0110w) obj).unknownFields.d(f2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f1465a;
            if (i2 >= iArr.length) {
                X.k(this.f1476l, obj, obj2);
                return;
            }
            int L2 = L(i2);
            long j2 = 1048575 & L2;
            int i3 = iArr[i2];
            switch (K(L2)) {
                case 0:
                    if (n(i2, obj2)) {
                        i0 i0Var = j0.f1550c;
                        obj3 = obj;
                        i0Var.l(obj3, j2, i0Var.d(j2, obj2));
                        G(i2, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i2, obj2)) {
                        i0 i0Var2 = j0.f1550c;
                        i0Var2.m(obj, j2, i0Var2.e(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (n(i2, obj2)) {
                        j0.n(obj, j2, j0.f1550c.g(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (n(i2, obj2)) {
                        j0.n(obj, j2, j0.f1550c.g(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case H.k.LONG_FIELD_NUMBER /* 4 */:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1550c.f(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case H.k.STRING_FIELD_NUMBER /* 5 */:
                    if (n(i2, obj2)) {
                        j0.n(obj, j2, j0.f1550c.g(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1550c.f(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i2, obj2)) {
                        i0 i0Var3 = j0.f1550c;
                        i0Var3.j(obj, j2, i0Var3.c(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case H.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(i2, obj2)) {
                        j0.o(obj, j2, j0.f1550c.h(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i2, obj2)) {
                        j0.o(obj, j2, j0.f1550c.h(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1550c.f(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1550c.f(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1550c.f(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i2, obj2)) {
                        j0.n(obj, j2, j0.f1550c.g(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i2, obj2)) {
                        j0.m(obj, j2, j0.f1550c.f(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i2, obj2)) {
                        j0.n(obj, j2, j0.f1550c.g(j2, obj2));
                        G(i2, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i2, obj, obj2);
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
                    this.f1475k.getClass();
                    i0 i0Var4 = j0.f1550c;
                    InterfaceC0111x interfaceC0111x = (InterfaceC0111x) i0Var4.h(j2, obj);
                    InterfaceC0111x interfaceC0111x2 = (InterfaceC0111x) i0Var4.h(j2, obj2);
                    U u2 = (U) interfaceC0111x;
                    int i4 = u2.f1488g;
                    int i5 = ((U) interfaceC0111x2).f1488g;
                    if (i4 > 0 && i5 > 0) {
                        if (!((AbstractC0090b) interfaceC0111x).f1509e) {
                            interfaceC0111x = u2.c(i5 + i4);
                        }
                        ((AbstractC0090b) interfaceC0111x).addAll(interfaceC0111x2);
                    }
                    if (i4 > 0) {
                        interfaceC0111x2 = interfaceC0111x;
                    }
                    j0.o(obj, j2, interfaceC0111x2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = X.f1493a;
                    i0 i0Var5 = j0.f1550c;
                    Object h2 = i0Var5.h(j2, obj);
                    Object h3 = i0Var5.h(j2, obj2);
                    this.f1477m.getClass();
                    j0.o(obj, j2, J.a(h2, h3));
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
                    if (q(obj2, i3, i2)) {
                        j0.o(obj, j2, j0.f1550c.h(j2, obj2));
                        H(obj, i3, i2);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i2, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(obj2, i3, i2)) {
                        j0.o(obj, j2, j0.f1550c.h(j2, obj2));
                        H(obj, i3, i2);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i2, obj, obj2);
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

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, F f2) {
        f2.getClass();
        M(obj, f2);
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
    @Override // androidx.datastore.preferences.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(AbstractC0110w abstractC0110w) {
        int i2;
        int b2;
        int i3;
        int[] iArr = this.f1465a;
        int length = iArr.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int L2 = L(i5);
            int i6 = iArr[i5];
            long j2 = 1048575 & L2;
            int i7 = 1237;
            int i8 = 37;
            switch (K(L2)) {
                case 0:
                    i2 = i4 * 53;
                    b2 = AbstractC0112y.b(Double.doubleToLongBits(j0.f1550c.d(j2, abstractC0110w)));
                    i4 = b2 + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    b2 = Float.floatToIntBits(j0.f1550c.e(j2, abstractC0110w));
                    i4 = b2 + i2;
                    break;
                case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                    i2 = i4 * 53;
                    b2 = AbstractC0112y.b(j0.f1550c.g(j2, abstractC0110w));
                    i4 = b2 + i2;
                    break;
                case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                    i2 = i4 * 53;
                    b2 = AbstractC0112y.b(j0.f1550c.g(j2, abstractC0110w));
                    i4 = b2 + i2;
                    break;
                case H.k.LONG_FIELD_NUMBER /* 4 */:
                    i2 = i4 * 53;
                    b2 = j0.f1550c.f(j2, abstractC0110w);
                    i4 = b2 + i2;
                    break;
                case H.k.STRING_FIELD_NUMBER /* 5 */:
                    i2 = i4 * 53;
                    b2 = AbstractC0112y.b(j0.f1550c.g(j2, abstractC0110w));
                    i4 = b2 + i2;
                    break;
                case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i2 = i4 * 53;
                    b2 = j0.f1550c.f(j2, abstractC0110w);
                    i4 = b2 + i2;
                    break;
                case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i3 = i4 * 53;
                    boolean c2 = j0.f1550c.c(j2, abstractC0110w);
                    Charset charset = AbstractC0112y.f1602a;
                    break;
                case H.k.BYTES_FIELD_NUMBER /* 8 */:
                    i2 = i4 * 53;
                    b2 = ((String) j0.f1550c.h(j2, abstractC0110w)).hashCode();
                    i4 = b2 + i2;
                    break;
                case 9:
                    Object h2 = j0.f1550c.h(j2, abstractC0110w);
                    if (h2 != null) {
                        i8 = h2.hashCode();
                    }
                    i4 = (i4 * 53) + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    b2 = j0.f1550c.h(j2, abstractC0110w).hashCode();
                    i4 = b2 + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    b2 = j0.f1550c.f(j2, abstractC0110w);
                    i4 = b2 + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    b2 = j0.f1550c.f(j2, abstractC0110w);
                    i4 = b2 + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    b2 = j0.f1550c.f(j2, abstractC0110w);
                    i4 = b2 + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    b2 = AbstractC0112y.b(j0.f1550c.g(j2, abstractC0110w));
                    i4 = b2 + i2;
                    break;
                case 15:
                    i2 = i4 * 53;
                    b2 = j0.f1550c.f(j2, abstractC0110w);
                    i4 = b2 + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    b2 = AbstractC0112y.b(j0.f1550c.g(j2, abstractC0110w));
                    i4 = b2 + i2;
                    break;
                case 17:
                    Object h3 = j0.f1550c.h(j2, abstractC0110w);
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
                    b2 = j0.f1550c.h(j2, abstractC0110w).hashCode();
                    i4 = b2 + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    b2 = j0.f1550c.h(j2, abstractC0110w).hashCode();
                    i4 = b2 + i2;
                    break;
                case 51:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0112y.b(Double.doubleToLongBits(((Double) j0.f1550c.h(j2, abstractC0110w)).doubleValue()));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = Float.floatToIntBits(((Float) j0.f1550c.h(j2, abstractC0110w)).floatValue());
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0112y.b(z(j2, abstractC0110w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0112y.b(z(j2, abstractC0110w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = y(j2, abstractC0110w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0112y.b(z(j2, abstractC0110w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = y(j2, abstractC0110w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(abstractC0110w, i6, i5)) {
                        i3 = i4 * 53;
                        boolean booleanValue = ((Boolean) j0.f1550c.h(j2, abstractC0110w)).booleanValue();
                        Charset charset2 = AbstractC0112y.f1602a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = ((String) j0.f1550c.h(j2, abstractC0110w)).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = j0.f1550c.h(j2, abstractC0110w).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = j0.f1550c.h(j2, abstractC0110w).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = y(j2, abstractC0110w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = y(j2, abstractC0110w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = y(j2, abstractC0110w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0112y.b(z(j2, abstractC0110w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = y(j2, abstractC0110w);
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = AbstractC0112y.b(z(j2, abstractC0110w));
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(abstractC0110w, i6, i5)) {
                        i2 = i4 * 53;
                        b2 = j0.f1550c.h(j2, abstractC0110w).hashCode();
                        i4 = b2 + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f1476l.getClass();
        return abstractC0110w.unknownFields.hashCode() + (i4 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void d(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0110w) {
                AbstractC0110w abstractC0110w = (AbstractC0110w) obj;
                abstractC0110w.k(Integer.MAX_VALUE);
                abstractC0110w.memoizedHashCode = 0;
                abstractC0110w.h();
            }
            int[] iArr = this.f1465a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int L2 = L(i2);
                long j2 = 1048575 & L2;
                int K2 = K(L2);
                if (K2 != 9) {
                    if (K2 != 60 && K2 != 68) {
                        switch (K2) {
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
                                this.f1475k.getClass();
                                AbstractC0090b abstractC0090b = (AbstractC0090b) ((InterfaceC0111x) j0.f1550c.h(j2, obj));
                                if (abstractC0090b.f1509e) {
                                    abstractC0090b.f1509e = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = f1464o;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    this.f1477m.getClass();
                                    ((I) object).f1459e = false;
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(obj, iArr[i2], i2)) {
                        m(i2).d(f1464o.getObject(obj, j2));
                    }
                }
                if (n(i2, obj)) {
                    m(i2).d(f1464o.getObject(obj, j2));
                }
            }
            this.f1476l.getClass();
            d0 d0Var = ((AbstractC0110w) obj).unknownFields;
            if (d0Var.f1521e) {
                d0Var.f1521e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean e(Object obj) {
        int i2;
        int i3;
        int i4;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.f1472h) {
            int i8 = this.f1471g[i7];
            int[] iArr = this.f1465a;
            int i9 = iArr[i8];
            int L2 = L(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i6 = f1464o.getInt(obj, i11);
                }
                i3 = i8;
                i4 = i6;
                i2 = i11;
            } else {
                int i13 = i6;
                i2 = i5;
                i3 = i8;
                i4 = i13;
            }
            if ((268435456 & L2) == 0 || o(obj, i3, i2, i4, i12)) {
                int K2 = K(L2);
                if (K2 == 9 || K2 == 17) {
                    if (o(obj, i3, i2, i4, i12)) {
                        if (!m(i3).e(j0.f1550c.h(L2 & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i7++;
                    i5 = i2;
                    i6 = i4;
                } else {
                    if (K2 != 27) {
                        if (K2 == 60 || K2 == 68) {
                            if (q(obj, i9, i3)) {
                                if (!m(i3).e(j0.f1550c.h(L2 & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i7++;
                            i5 = i2;
                            i6 = i4;
                        } else if (K2 != 49) {
                            if (K2 != 50) {
                                continue;
                            } else {
                                Object h2 = j0.f1550c.h(L2 & 1048575, obj);
                                this.f1477m.getClass();
                                I i14 = (I) h2;
                                if (i14.isEmpty()) {
                                    continue;
                                } else {
                                    if (((H) this.f1466b[(i3 / 3) * 2]).f1456a.f1454b.f1585e != t0.MESSAGE) {
                                        continue;
                                    } else {
                                        W w2 = null;
                                        for (Object obj2 : i14.values()) {
                                            if (w2 == null) {
                                                w2 = T.f1483c.a(obj2.getClass());
                                            }
                                            if (!w2.e(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i7++;
                            i5 = i2;
                            i6 = i4;
                        }
                    }
                    List list = (List) j0.f1550c.h(L2 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        W m2 = m(i3);
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            if (m2.e(list.get(i15))) {
                            }
                        }
                    }
                    i7++;
                    i5 = i2;
                    i6 = i4;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.X.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.X.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.X.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(AbstractC0110w abstractC0110w, AbstractC0110w abstractC0110w2) {
        int[] iArr = this.f1465a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 < length) {
                int L2 = L(i2);
                long j2 = L2 & 1048575;
                switch (K(L2)) {
                    case 0:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case 1:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var2 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var3 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var4 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case H.k.LONG_FIELD_NUMBER /* 4 */:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var5 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case H.k.STRING_FIELD_NUMBER /* 5 */:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var6 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var7 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var8 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case H.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var9 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case 9:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var10 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case 10:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var11 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case 11:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var12 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case 12:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var13 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case 13:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var14 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case 14:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var15 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case 15:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var16 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case 16:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var17 = j0.f1550c;
                            break;
                        }
                        z2 = false;
                        break;
                    case 17:
                        if (j(abstractC0110w, abstractC0110w2, i2)) {
                            i0 i0Var18 = j0.f1550c;
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
                        i0 i0Var19 = j0.f1550c;
                        z2 = X.l(i0Var19.h(j2, abstractC0110w), i0Var19.h(j2, abstractC0110w2));
                        break;
                    case 50:
                        i0 i0Var20 = j0.f1550c;
                        z2 = X.l(i0Var20.h(j2, abstractC0110w), i0Var20.h(j2, abstractC0110w2));
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
                        i0 i0Var21 = j0.f1550c;
                        if (i0Var21.f(j3, abstractC0110w) == i0Var21.f(j3, abstractC0110w2)) {
                            break;
                        }
                        z2 = false;
                        break;
                }
                if (z2) {
                    i2 += 3;
                }
            } else {
                this.f1476l.getClass();
                if (abstractC0110w.unknownFields.equals(abstractC0110w2.unknownFields)) {
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
    @Override // androidx.datastore.preferences.protobuf.W
    public final void g(java.lang.Object r19, androidx.datastore.preferences.protobuf.C0099k r20, androidx.datastore.preferences.protobuf.C0103o r21) {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.g(java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.o):void");
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int h(AbstractC0110w abstractC0110w) {
        int i2;
        int V;
        int V2;
        int V3;
        int X2;
        int V4;
        int X3;
        int V5;
        int V6;
        int T2;
        int V7;
        int a2;
        int c2;
        int V8;
        int size;
        int i3;
        int V9;
        int V10;
        int size2;
        int V11;
        int W2;
        int i4;
        int i5;
        int V12;
        int W3;
        N n2 = this;
        AbstractC0110w abstractC0110w2 = abstractC0110w;
        Unsafe unsafe = f1464o;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = n2.f1465a;
            if (i7 >= iArr.length) {
                n2.f1476l.getClass();
                return abstractC0110w2.unknownFields.b() + i9;
            }
            int L2 = n2.L(i7);
            int K2 = K(L2);
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & 1048575;
            if (K2 <= 17) {
                if (i12 != i6) {
                    i8 = i12 == 1048575 ? 0 : unsafe.getInt(abstractC0110w2, i12);
                    i6 = i12;
                }
                i2 = 1 << (i11 >>> 20);
            } else {
                i2 = 0;
            }
            long j2 = L2 & 1048575;
            if (K2 >= EnumC0106s.f1576f.f1580e) {
                int i13 = EnumC0106s.f1577g.f1580e;
            }
            switch (K2) {
                case 0:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        V = C0101m.V(i10);
                        c2 = V + 8;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        V2 = C0101m.V(i10);
                        V6 = V2 + 4;
                        i9 += V6;
                    }
                    n2 = this;
                    abstractC0110w2 = abstractC0110w;
                    break;
                case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        long j3 = unsafe.getLong(abstractC0110w2, j2);
                        V3 = C0101m.V(i10);
                        X2 = C0101m.X(j3);
                        i9 += X2 + V3;
                    }
                    n2 = this;
                    break;
                case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        long j4 = unsafe.getLong(abstractC0110w2, j2);
                        V3 = C0101m.V(i10);
                        X2 = C0101m.X(j4);
                        i9 += X2 + V3;
                    }
                    n2 = this;
                    break;
                case H.k.LONG_FIELD_NUMBER /* 4 */:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        int i14 = unsafe.getInt(abstractC0110w2, j2);
                        V4 = C0101m.V(i10);
                        X3 = C0101m.X(i14);
                        T2 = X3 + V4;
                        i9 += T2;
                    }
                    n2 = this;
                    break;
                case H.k.STRING_FIELD_NUMBER /* 5 */:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        V5 = C0101m.V(i10);
                        V6 = V5 + 8;
                        i9 += V6;
                    }
                    n2 = this;
                    abstractC0110w2 = abstractC0110w;
                    break;
                case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        V2 = C0101m.V(i10);
                        V6 = V2 + 4;
                        i9 += V6;
                    }
                    n2 = this;
                    abstractC0110w2 = abstractC0110w;
                    break;
                case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        V6 = C0101m.V(i10) + 1;
                        i9 += V6;
                    }
                    n2 = this;
                    abstractC0110w2 = abstractC0110w;
                    break;
                case H.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        Object object = unsafe.getObject(abstractC0110w2, j2);
                        i9 = (object instanceof C0095g ? C0101m.T(i10, (C0095g) object) : C0101m.U((String) object) + C0101m.V(i10)) + i9;
                    }
                    n2 = this;
                    break;
                case 9:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        Object object2 = unsafe.getObject(abstractC0110w2, j2);
                        W m2 = n2.m(i7);
                        Class cls = X.f1493a;
                        int V13 = C0101m.V(i10);
                        int a3 = ((AbstractC0089a) object2).a(m2);
                        i9 += C0101m.W(a3) + a3 + V13;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        T2 = C0101m.T(i10, (C0095g) unsafe.getObject(abstractC0110w2, j2));
                        i9 += T2;
                    }
                    n2 = this;
                    break;
                case 11:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        int i15 = unsafe.getInt(abstractC0110w2, j2);
                        V4 = C0101m.V(i10);
                        X3 = C0101m.W(i15);
                        T2 = X3 + V4;
                        i9 += T2;
                    }
                    n2 = this;
                    break;
                case 12:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        int i16 = unsafe.getInt(abstractC0110w2, j2);
                        V4 = C0101m.V(i10);
                        X3 = C0101m.X(i16);
                        T2 = X3 + V4;
                        i9 += T2;
                    }
                    n2 = this;
                    break;
                case 13:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        V2 = C0101m.V(i10);
                        V6 = V2 + 4;
                        i9 += V6;
                    }
                    n2 = this;
                    abstractC0110w2 = abstractC0110w;
                    break;
                case 14:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        V5 = C0101m.V(i10);
                        V6 = V5 + 8;
                        i9 += V6;
                    }
                    n2 = this;
                    abstractC0110w2 = abstractC0110w;
                    break;
                case 15:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        int i17 = unsafe.getInt(abstractC0110w2, j2);
                        V4 = C0101m.V(i10);
                        X3 = C0101m.W((i17 >> 31) ^ (i17 << 1));
                        T2 = X3 + V4;
                        i9 += T2;
                    }
                    n2 = this;
                    break;
                case 16:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        long j5 = unsafe.getLong(abstractC0110w2, j2);
                        V3 = C0101m.V(i10);
                        X2 = C0101m.X((j5 << 1) ^ (j5 >> 63));
                        i9 += X2 + V3;
                    }
                    n2 = this;
                    break;
                case 17:
                    if (n2.o(abstractC0110w2, i7, i6, i8, i2)) {
                        AbstractC0089a abstractC0089a = (AbstractC0089a) unsafe.getObject(abstractC0110w2, j2);
                        W m3 = n2.m(i7);
                        V7 = C0101m.V(i10) * 2;
                        a2 = abstractC0089a.a(m3);
                        c2 = a2 + V7;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c2 = X.c(i10, (List) unsafe.getObject(abstractC0110w2, j2));
                    i9 += c2;
                    break;
                case 19:
                    c2 = X.b(i10, (List) unsafe.getObject(abstractC0110w2, j2));
                    i9 += c2;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls2 = X.f1493a;
                    if (list.size() != 0) {
                        V8 = (C0101m.V(i10) * list.size()) + X.e(list);
                        i9 += V8;
                        break;
                    }
                    V8 = 0;
                    i9 += V8;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls3 = X.f1493a;
                    size = list2.size();
                    if (size != 0) {
                        i3 = X.i(list2);
                        V9 = C0101m.V(i10);
                        V8 = (V9 * size) + i3;
                        i9 += V8;
                        break;
                    }
                    V8 = 0;
                    i9 += V8;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls4 = X.f1493a;
                    size = list3.size();
                    if (size != 0) {
                        i3 = X.d(list3);
                        V9 = C0101m.V(i10);
                        V8 = (V9 * size) + i3;
                        i9 += V8;
                        break;
                    }
                    V8 = 0;
                    i9 += V8;
                case 23:
                    c2 = X.c(i10, (List) unsafe.getObject(abstractC0110w2, j2));
                    i9 += c2;
                    break;
                case 24:
                    c2 = X.b(i10, (List) unsafe.getObject(abstractC0110w2, j2));
                    i9 += c2;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls5 = X.f1493a;
                    int size3 = list4.size();
                    i9 += size3 == 0 ? 0 : (C0101m.V(i10) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls6 = X.f1493a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        V8 = C0101m.V(i10) * size4;
                        for (int i18 = 0; i18 < size4; i18++) {
                            Object obj = list5.get(i18);
                            if (obj instanceof C0095g) {
                                int size5 = ((C0095g) obj).size();
                                V8 = C0101m.W(size5) + size5 + V8;
                            } else {
                                V8 = C0101m.U((String) obj) + V8;
                            }
                        }
                        i9 += V8;
                        break;
                    }
                    V8 = 0;
                    i9 += V8;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC0110w2, j2);
                    W m4 = n2.m(i7);
                    Class cls7 = X.f1493a;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        V10 = C0101m.V(i10) * size6;
                        for (int i19 = 0; i19 < size6; i19++) {
                            int a4 = ((AbstractC0089a) list6.get(i19)).a(m4);
                            V10 += C0101m.W(a4) + a4;
                        }
                        i9 += V10;
                        break;
                    }
                    V10 = 0;
                    i9 += V10;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls8 = X.f1493a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        V8 = C0101m.V(i10) * size7;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            int size8 = ((C0095g) list7.get(i20)).size();
                            V8 += C0101m.W(size8) + size8;
                        }
                        i9 += V8;
                        break;
                    }
                    V8 = 0;
                    i9 += V8;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls9 = X.f1493a;
                    size = list8.size();
                    if (size != 0) {
                        i3 = X.h(list8);
                        V9 = C0101m.V(i10);
                        V8 = (V9 * size) + i3;
                        i9 += V8;
                        break;
                    }
                    V8 = 0;
                    i9 += V8;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls10 = X.f1493a;
                    size = list9.size();
                    if (size != 0) {
                        i3 = X.a(list9);
                        V9 = C0101m.V(i10);
                        V8 = (V9 * size) + i3;
                        i9 += V8;
                        break;
                    }
                    V8 = 0;
                    i9 += V8;
                case 31:
                    c2 = X.b(i10, (List) unsafe.getObject(abstractC0110w2, j2));
                    i9 += c2;
                    break;
                case 32:
                    c2 = X.c(i10, (List) unsafe.getObject(abstractC0110w2, j2));
                    i9 += c2;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls11 = X.f1493a;
                    size = list10.size();
                    if (size != 0) {
                        i3 = X.f(list10);
                        V9 = C0101m.V(i10);
                        V8 = (V9 * size) + i3;
                        i9 += V8;
                        break;
                    }
                    V8 = 0;
                    i9 += V8;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls12 = X.f1493a;
                    size = list11.size();
                    if (size != 0) {
                        i3 = X.g(list11);
                        V9 = C0101m.V(i10);
                        V8 = (V9 * size) + i3;
                        i9 += V8;
                        break;
                    }
                    V8 = 0;
                    i9 += V8;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls13 = X.f1493a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls14 = X.f1493a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = X.e((List) unsafe.getObject(abstractC0110w2, j2));
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = X.i((List) unsafe.getObject(abstractC0110w2, j2));
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = X.d((List) unsafe.getObject(abstractC0110w2, j2));
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls15 = X.f1493a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls16 = X.f1493a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls17 = X.f1493a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = X.h((List) unsafe.getObject(abstractC0110w2, j2));
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = X.a((List) unsafe.getObject(abstractC0110w2, j2));
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls18 = X.f1493a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0110w2, j2);
                    Class cls19 = X.f1493a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = X.f((List) unsafe.getObject(abstractC0110w2, j2));
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = X.g((List) unsafe.getObject(abstractC0110w2, j2));
                    if (size2 > 0) {
                        V11 = C0101m.V(i10);
                        W2 = C0101m.W(size2);
                        i4 = W2 + V11;
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0110w2, j2);
                    W m5 = n2.m(i7);
                    Class cls20 = X.f1493a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i21 = 0; i21 < size9; i21++) {
                            i5 += ((AbstractC0089a) list19.get(i21)).a(m5) + (C0101m.V(i10) * 2);
                        }
                    }
                    i9 += i5;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0110w2, j2);
                    Object obj2 = n2.f1466b[(i7 / 3) * 2];
                    n2.f1477m.getClass();
                    I i22 = (I) object3;
                    H h2 = (H) obj2;
                    if (!i22.isEmpty()) {
                        V10 = 0;
                        for (Map.Entry entry : i22.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            h2.getClass();
                            int V14 = C0101m.V(i10);
                            int a5 = H.a(h2.f1456a, key, value);
                            V10 += C0101m.W(a5) + a5 + V14;
                        }
                        i9 += V10;
                        break;
                    }
                    V10 = 0;
                    i9 += V10;
                case 51:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        V = C0101m.V(i10);
                        c2 = V + 8;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        V12 = C0101m.V(i10);
                        c2 = V12 + 4;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        long z2 = z(j2, abstractC0110w2);
                        size2 = C0101m.V(i10);
                        i4 = C0101m.X(z2);
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        long z3 = z(j2, abstractC0110w2);
                        size2 = C0101m.V(i10);
                        i4 = C0101m.X(z3);
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        int y2 = y(j2, abstractC0110w2);
                        V7 = C0101m.V(i10);
                        a2 = C0101m.X(y2);
                        c2 = a2 + V7;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        V = C0101m.V(i10);
                        c2 = V + 8;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        V12 = C0101m.V(i10);
                        c2 = V12 + 4;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        c2 = C0101m.V(i10) + 1;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        Object object4 = unsafe.getObject(abstractC0110w2, j2);
                        i9 = (object4 instanceof C0095g ? C0101m.T(i10, (C0095g) object4) : C0101m.U((String) object4) + C0101m.V(i10)) + i9;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        Object object5 = unsafe.getObject(abstractC0110w2, j2);
                        W m6 = n2.m(i7);
                        Class cls21 = X.f1493a;
                        int V15 = C0101m.V(i10);
                        int a6 = ((AbstractC0089a) object5).a(m6);
                        W3 = C0101m.W(a6) + a6 + V15;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        c2 = C0101m.T(i10, (C0095g) unsafe.getObject(abstractC0110w2, j2));
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        int y3 = y(j2, abstractC0110w2);
                        V7 = C0101m.V(i10);
                        a2 = C0101m.W(y3);
                        c2 = a2 + V7;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        int y4 = y(j2, abstractC0110w2);
                        V7 = C0101m.V(i10);
                        a2 = C0101m.X(y4);
                        c2 = a2 + V7;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        V12 = C0101m.V(i10);
                        c2 = V12 + 4;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        V = C0101m.V(i10);
                        c2 = V + 8;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        int y5 = y(j2, abstractC0110w2);
                        V7 = C0101m.V(i10);
                        a2 = C0101m.W((y5 >> 31) ^ (y5 << 1));
                        c2 = a2 + V7;
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        long z4 = z(j2, abstractC0110w2);
                        size2 = C0101m.V(i10);
                        i4 = C0101m.X((z4 << 1) ^ (z4 >> 63));
                        W3 = i4 + size2;
                        i9 += W3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (n2.q(abstractC0110w2, i10, i7)) {
                        c2 = ((AbstractC0089a) unsafe.getObject(abstractC0110w2, j2)).a(n2.m(i7)) + (C0101m.V(i10) * 2);
                        i9 += c2;
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0110w i() {
        this.f1474j.getClass();
        return ((AbstractC0110w) this.f1469e).i();
    }

    public final boolean j(AbstractC0110w abstractC0110w, AbstractC0110w abstractC0110w2, int i2) {
        return n(i2, abstractC0110w) == n(i2, abstractC0110w2);
    }

    public final void k(int i2, Object obj, Object obj2) {
        int i3 = this.f1465a[i2];
        if (j0.f1550c.h(L(i2) & 1048575, obj) == null) {
            return;
        }
        l(i2);
    }

    public final void l(int i2) {
        if (this.f1466b[((i2 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final W m(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.f1466b;
        W w2 = (W) objArr[i3];
        if (w2 != null) {
            return w2;
        }
        W a2 = T.f1483c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a2;
        return a2;
    }

    public final boolean n(int i2, Object obj) {
        int i3 = this.f1465a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 == 1048575) {
            int L2 = L(i2);
            long j3 = L2 & 1048575;
            switch (K(L2)) {
                case 0:
                    if (Double.doubleToRawLongBits(j0.f1550c.d(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(j0.f1550c.e(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (j0.f1550c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (j0.f1550c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case H.k.LONG_FIELD_NUMBER /* 4 */:
                    if (j0.f1550c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case H.k.STRING_FIELD_NUMBER /* 5 */:
                    if (j0.f1550c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case H.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (j0.f1550c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case H.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return j0.f1550c.c(j3, obj);
                case H.k.BYTES_FIELD_NUMBER /* 8 */:
                    Object h2 = j0.f1550c.h(j3, obj);
                    if (h2 instanceof String) {
                        return !((String) h2).isEmpty();
                    }
                    if (h2 instanceof C0095g) {
                        return !C0095g.f1525g.equals(h2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (j0.f1550c.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0095g.f1525g.equals(j0.f1550c.h(j3, obj));
                case 11:
                    if (j0.f1550c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (j0.f1550c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (j0.f1550c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (j0.f1550c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (j0.f1550c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (j0.f1550c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (j0.f1550c.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i3 >>> 20)) & j0.f1550c.f(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? n(i2, obj) : (i4 & i5) != 0;
    }

    public final boolean q(Object obj, int i2, int i3) {
        return j0.f1550c.f((long) (this.f1465a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        r10.put(r3, r4);
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
    public final void r(Object obj, int i2, Object obj2, C0103o c0103o, C0099k c0099k) {
        long L2 = L(i2) & 1048575;
        Object h2 = j0.f1550c.h(L2, obj);
        J j2 = this.f1477m;
        if (h2 == null) {
            j2.getClass();
            h2 = I.f1458f.b();
            j0.o(obj, L2, h2);
        } else {
            j2.getClass();
            if (!((I) h2).f1459e) {
                I b2 = I.f1458f.b();
                J.a(b2, h2);
                j0.o(obj, L2, b2);
                h2 = b2;
            }
        }
        j2.getClass();
        I i3 = (I) h2;
        G g2 = ((H) obj2).f1456a;
        c0099k.w(2);
        AbstractC0098j abstractC0098j = c0099k.f1555a;
        int e2 = abstractC0098j.e(abstractC0098j.v());
        Object obj3 = g2.f1455c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a2 = c0099k.a();
                if (a2 == Integer.MAX_VALUE || abstractC0098j.c()) {
                    break;
                }
                if (a2 == 1) {
                    obj4 = c0099k.i(g2.f1453a, null, null);
                } else if (a2 != 2) {
                    try {
                        if (!c0099k.x()) {
                            throw new A("Unable to parse map entry.");
                        }
                    } catch (C0113z unused) {
                        if (!c0099k.x()) {
                            throw new A("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = c0099k.i(g2.f1454b, obj3.getClass(), c0103o);
                }
            } catch (Throwable th) {
                abstractC0098j.d(e2);
                throw th;
            }
        }
    }

    public final void s(int i2, Object obj, Object obj2) {
        if (n(i2, obj2)) {
            long L2 = L(i2) & 1048575;
            Unsafe unsafe = f1464o;
            Object object = unsafe.getObject(obj2, L2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f1465a[i2] + " is present but null: " + obj2);
            }
            W m2 = m(i2);
            if (!n(i2, obj)) {
                if (p(object)) {
                    AbstractC0110w i3 = m2.i();
                    m2.a(i3, object);
                    unsafe.putObject(obj, L2, i3);
                } else {
                    unsafe.putObject(obj, L2, object);
                }
                G(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L2);
            if (!p(object2)) {
                AbstractC0110w i4 = m2.i();
                m2.a(i4, object2);
                unsafe.putObject(obj, L2, i4);
                object2 = i4;
            }
            m2.a(object2, object);
        }
    }

    public final void t(int i2, Object obj, Object obj2) {
        int[] iArr = this.f1465a;
        int i3 = iArr[i2];
        if (q(obj2, i3, i2)) {
            long L2 = L(i2) & 1048575;
            Unsafe unsafe = f1464o;
            Object object = unsafe.getObject(obj2, L2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2);
            }
            W m2 = m(i2);
            if (!q(obj, i3, i2)) {
                if (p(object)) {
                    AbstractC0110w i4 = m2.i();
                    m2.a(i4, object);
                    unsafe.putObject(obj, L2, i4);
                } else {
                    unsafe.putObject(obj, L2, object);
                }
                H(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, L2);
            if (!p(object2)) {
                AbstractC0110w i5 = m2.i();
                m2.a(i5, object2);
                unsafe.putObject(obj, L2, i5);
                object2 = i5;
            }
            m2.a(object2, object);
        }
    }

    public final Object u(int i2, Object obj) {
        W m2 = m(i2);
        long L2 = L(i2) & 1048575;
        if (!n(i2, obj)) {
            return m2.i();
        }
        Object object = f1464o.getObject(obj, L2);
        if (p(object)) {
            return object;
        }
        AbstractC0110w i3 = m2.i();
        if (object != null) {
            m2.a(i3, object);
        }
        return i3;
    }

    public final Object v(Object obj, int i2, int i3) {
        W m2 = m(i3);
        if (!q(obj, i2, i3)) {
            return m2.i();
        }
        Object object = f1464o.getObject(obj, L(i3) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0110w i4 = m2.i();
        if (object != null) {
            m2.a(i4, object);
        }
        return i4;
    }
}
