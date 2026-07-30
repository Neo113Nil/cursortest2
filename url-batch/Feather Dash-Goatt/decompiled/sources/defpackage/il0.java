package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class il0 implements u61 {
    public static final int[] n = new int[0];
    public static final Unsafe o = ol1.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final d0 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final ep0 j;
    public final xh0 k;
    public final fl1 l;
    public final dk0 m;

    public il0(int[] iArr, Object[] objArr, int i, int i2, d0 d0Var, int[] iArr2, int i3, int i4, ep0 ep0Var, xh0 xh0Var, fl1 fl1Var, rw rwVar, dk0 dk0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = d0Var instanceof m40;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = ep0Var;
        this.k = xh0Var;
        this.l = fl1Var;
        this.e = d0Var;
        this.m = dk0Var;
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
        if (obj instanceof m40) {
            return ((m40) obj).g();
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
    public static il0 w(c11 c11Var, ep0 ep0Var, xh0 xh0Var, fl1 fl1Var, rw rwVar, dk0 dk0Var) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        Class<?> cls;
        int i19;
        int objectFieldOffset;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field F;
        char charAt10;
        int i25;
        int i26;
        Object obj;
        Field F2;
        Object obj2;
        Field F3;
        int i27;
        char charAt11;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        String str = c11Var.b;
        int length = str.length();
        int i31 = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i34 = charAt15 & 8191;
            int i35 = 13;
            while (true) {
                i30 = i33 + 1;
                charAt14 = str.charAt(i33);
                if (charAt14 < 55296) {
                    break;
                }
                i34 |= (charAt14 & 8191) << i35;
                i35 += 13;
                i33 = i30;
            }
            charAt15 = i34 | (charAt14 << i35);
            i33 = i30;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = n;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt16 = str.charAt(i33);
            if (charAt16 >= 55296) {
                int i37 = charAt16 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    charAt9 = str.charAt(i36);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i37 |= (charAt9 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                charAt16 = i37 | (charAt9 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int charAt17 = str.charAt(i36);
            if (charAt17 >= 55296) {
                int i40 = charAt17 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    charAt8 = str.charAt(i39);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i40 |= (charAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                charAt17 = i40 | (charAt8 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int charAt18 = str.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    charAt7 = str.charAt(i42);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i43 |= (charAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                charAt18 = i43 | (charAt7 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int charAt19 = str.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    charAt6 = str.charAt(i45);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i46 |= (charAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                charAt19 = i46 | (charAt6 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            charAt = str.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    charAt5 = str.charAt(i48);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i49 |= (charAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                charAt = i49 | (charAt5 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int charAt20 = str.charAt(i48);
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    charAt4 = str.charAt(i51);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i52 |= (charAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                charAt20 = i52 | (charAt4 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int charAt21 = str.charAt(i51);
            if (charAt21 >= 55296) {
                int i55 = charAt21 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    charAt3 = str.charAt(i54);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i55 |= (charAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                charAt21 = i55 | (charAt3 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int charAt22 = str.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    charAt2 = str.charAt(i57);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i58 |= (charAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                charAt22 = i58 | (charAt2 << i59);
                i57 = i8;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i60 = (charAt16 * 2) + charAt17;
            int i61 = charAt20;
            i2 = charAt18;
            i3 = i61;
            i4 = charAt16;
            i33 = i57;
            iArr = iArr2;
            i5 = charAt19;
            i6 = i60;
            i7 = charAt22;
        }
        Unsafe unsafe = o;
        Object[] objArr = c11Var.c;
        Class<?> cls2 = c11Var.a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i62 = i7 + i3;
        int i63 = i62;
        int i64 = i7;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int charAt23 = str.charAt(i33);
            if (charAt23 >= i31) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i29 = i69 + 1;
                    charAt13 = str.charAt(i69);
                    i16 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i68 |= (charAt13 & 8191) << i70;
                    i70 += 13;
                    i69 = i29;
                    length = i16;
                }
                charAt23 = i68 | (charAt13 << i70);
                i17 = i29;
            } else {
                i16 = length;
                i17 = i67;
            }
            int i71 = i17 + 1;
            int charAt24 = str.charAt(i17);
            Object[] objArr3 = objArr;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i72 = charAt24 & 8191;
                int i73 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt12 = str.charAt(i71);
                    if (charAt12 < c) {
                        break;
                    }
                    i72 |= (charAt12 & 8191) << i73;
                    i73 += 13;
                    i71 = i28;
                    c = 55296;
                }
                charAt24 = i72 | (charAt12 << i73);
                i71 = i28;
            }
            int i74 = charAt24 & 255;
            int i75 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int[] iArr4 = iArr3;
            if (i74 >= 51) {
                int i76 = i71 + 1;
                int charAt25 = str.charAt(i71);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i77 = charAt25 & 8191;
                    int i78 = 13;
                    while (true) {
                        i27 = i76 + 1;
                        charAt11 = str.charAt(i76);
                        if (charAt11 < c2) {
                            break;
                        }
                        i77 |= (charAt11 & 8191) << i78;
                        i78 += 13;
                        i76 = i27;
                        c2 = 55296;
                    }
                    charAt25 = i77 | (charAt11 << i78);
                    i76 = i27;
                }
                int i79 = i74 - 51;
                int i80 = i76;
                if (i79 == 9 || i79 == 17) {
                    i26 = i6 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = objArr3[i6];
                } else {
                    if (i79 == 12 && (qy0.a(c11Var.a(), 1) || (charAt24 & 2048) != 0)) {
                        i26 = i6 + 1;
                        objArr2[((i66 / 3) * 2) + 1] = objArr3[i6];
                    }
                    int i81 = charAt25 * 2;
                    obj = objArr3[i81];
                    if (obj instanceof Field) {
                        F2 = F(cls2, (String) obj);
                        objArr3[i81] = F2;
                    } else {
                        F2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F2);
                    int i82 = i81 + 1;
                    obj2 = objArr3[i82];
                    if (obj2 instanceof Field) {
                        F3 = F(cls2, (String) obj2);
                        objArr3[i82] = F3;
                    } else {
                        F3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F3);
                    int i83 = i4;
                    i20 = objectFieldOffset3;
                    i24 = objectFieldOffset2;
                    i18 = i83;
                    i23 = i6;
                    i21 = i80;
                    i22 = 0;
                    cls = cls2;
                }
                i6 = i26;
                int i812 = charAt25 * 2;
                obj = objArr3[i812];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(F2);
                int i822 = i812 + 1;
                obj2 = objArr3[i822];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(F3);
                int i832 = i4;
                i20 = objectFieldOffset32;
                i24 = objectFieldOffset22;
                i18 = i832;
                i23 = i6;
                i21 = i80;
                i22 = 0;
                cls = cls2;
            } else {
                int i84 = i6 + 1;
                Field F4 = F(cls2, (String) objArr3[i6]);
                if (i74 == 9 || i74 == 17) {
                    i18 = i4;
                    objArr2[((i66 / 3) * 2) + 1] = F4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        i18 = i4;
                        i25 = i6 + 2;
                        objArr2[((i66 / 3) * 2) + 1] = objArr3[i84];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        i18 = i4;
                        if (c11Var.a() == 1 || (charAt24 & 2048) != 0) {
                            i25 = i6 + 2;
                            objArr2[((i66 / 3) * 2) + 1] = objArr3[i84];
                        }
                    } else if (i74 == 50) {
                        int i85 = i64 + 1;
                        iArr[i64] = i66;
                        int i86 = (i66 / 3) * 2;
                        int i87 = i6 + 2;
                        objArr2[i86] = objArr3[i84];
                        if ((charAt24 & 2048) != 0) {
                            i19 = i6 + 3;
                            objArr2[i86 + 1] = objArr3[i87];
                            i18 = i4;
                            cls = cls2;
                            i64 = i85;
                        } else {
                            cls = cls2;
                            i19 = i87;
                            i64 = i85;
                            i18 = i4;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                        if ((charAt24 & 4096) != 0 || i74 > 17) {
                            i20 = 1048575;
                            i21 = i71;
                            i22 = 0;
                        } else {
                            int i88 = i71 + 1;
                            int charAt26 = str.charAt(i71);
                            if (charAt26 >= 55296) {
                                int i89 = charAt26 & 8191;
                                int i90 = 13;
                                while (true) {
                                    i21 = i88 + 1;
                                    charAt10 = str.charAt(i88);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i89 |= (charAt10 & 8191) << i90;
                                    i90 += 13;
                                    i88 = i21;
                                }
                                charAt26 = i89 | (charAt10 << i90);
                            } else {
                                i21 = i88;
                            }
                            int i91 = (charAt26 / 32) + (i18 * 2);
                            Object obj3 = objArr3[i91];
                            if (obj3 instanceof Field) {
                                F = (Field) obj3;
                            } else {
                                F = F(cls, (String) obj3);
                                objArr3[i91] = F;
                            }
                            i20 = (int) unsafe.objectFieldOffset(F);
                            i22 = charAt26 % 32;
                        }
                        if (i74 >= 18 || i74 > 49) {
                            i23 = i19;
                            i24 = objectFieldOffset;
                        } else {
                            iArr[i63] = objectFieldOffset;
                            i23 = i19;
                            i24 = objectFieldOffset;
                            i63++;
                        }
                    } else {
                        i18 = i4;
                    }
                    i19 = i25;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i20 = 1048575;
                    i21 = i71;
                    i22 = 0;
                    if (i74 >= 18) {
                    }
                    i23 = i19;
                    i24 = objectFieldOffset;
                }
                cls = cls2;
                i19 = i84;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                if ((charAt24 & 4096) != 0) {
                }
                i20 = 1048575;
                i21 = i71;
                i22 = 0;
                if (i74 >= 18) {
                }
                i23 = i19;
                i24 = objectFieldOffset;
            }
            int i92 = i66 + 1;
            iArr4[i66] = i75;
            int i93 = i66 + 2;
            String str2 = str;
            iArr4[i92] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20) | i24;
            i66 += 3;
            iArr4[i93] = (i22 << 20) | i20;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i16;
            i4 = i18;
            i33 = i21;
            i31 = 55296;
            i6 = i23;
            iArr3 = iArr4;
        }
        return new il0(iArr3, objArr2, i2, i5, c11Var.a, iArr, i7, i62, ep0Var, xh0Var, fl1Var, rwVar, dk0Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) ol1.c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) ol1.c.h(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void B(Object obj, long j, uh uhVar, u61 u61Var, qw qwVar) {
        int u;
        this.k.getClass();
        ha0 a = xh0.a(j, obj);
        th thVar = (th) uhVar.d;
        int i = uhVar.a;
        if ((i & 7) != 3) {
            throw sa0.b();
        }
        do {
            m40 i2 = u61Var.i();
            uhVar.d(i2, u61Var, qwVar);
            u61Var.c(i2);
            ((j01) a).add(i2);
            if (thVar.c() || uhVar.c != 0) {
                return;
            } else {
                u = thVar.u();
            }
        } while (u == i);
        uhVar.c = u;
    }

    public final void C(Object obj, int i, uh uhVar, u61 u61Var, qw qwVar) {
        int u;
        this.k.getClass();
        ha0 a = xh0.a(i & 1048575, obj);
        th thVar = (th) uhVar.d;
        int i2 = uhVar.a;
        if ((i2 & 7) != 2) {
            throw sa0.b();
        }
        do {
            m40 i3 = u61Var.i();
            uhVar.e(i3, u61Var, qwVar);
            u61Var.c(i3);
            ((j01) a).add(i3);
            if (thVar.c() || uhVar.c != 0) {
                return;
            } else {
                u = thVar.u();
            }
        } while (u == i2);
        uhVar.c = u;
    }

    public final void D(int i, uh uhVar, Object obj) {
        if ((536870912 & i) != 0) {
            uhVar.y(2);
            ol1.o(i & 1048575, obj, ((th) uhVar.d).t());
        } else if (!this.f) {
            ol1.o(i & 1048575, obj, uhVar.g());
        } else {
            uhVar.y(2);
            ol1.o(i & 1048575, obj, ((th) uhVar.d).s());
        }
    }

    public final void E(int i, uh uhVar, Object obj) {
        boolean z = (536870912 & i) != 0;
        xh0 xh0Var = this.k;
        if (z) {
            xh0Var.getClass();
            uhVar.u(xh0.a(i & 1048575, obj), true);
        } else {
            xh0Var.getClass();
            uhVar.u(xh0.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        ol1.m(obj, j, (1 << (i2 >>> 20)) | ol1.c.f(j, obj));
    }

    public final void H(int i, int i2, Object obj) {
        ol1.m(obj, this.a[i2 + 2] & 1048575, i);
    }

    public final void I(Object obj, int i, d0 d0Var) {
        o.putObject(obj, L(i) & 1048575, d0Var);
        G(i, obj);
    }

    public final void J(Object obj, int i, int i2, d0 d0Var) {
        o.putObject(obj, L(i2) & 1048575, d0Var);
        H(i, i2, obj);
    }

    public final int L(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(Object obj, s40 s40Var) {
        int i;
        int i2;
        s40 s40Var2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int j;
        int size;
        int i7;
        int a;
        int i8;
        int j2;
        int size2;
        int i9;
        il0 il0Var = this;
        s40 s40Var3 = s40Var;
        int[] iArr = il0Var.a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int L = il0Var.L(i12);
            int i14 = iArr[i12];
            int K = K(L);
            int i15 = 1;
            if (K <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i10;
                if (i17 != i11) {
                    i13 = i17 == i10 ? 0 : unsafe.getInt(obj, i17);
                    i11 = i17;
                }
                i = L;
                i2 = 1 << (i16 >>> 20);
            } else {
                i = L;
                i2 = 0;
            }
            long j3 = i & i10;
            switch (K) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        double d = ol1.c.d(j3, obj);
                        wh whVar = (wh) s40Var2.e;
                        whVar.getClass();
                        whVar.t(i14, Double.doubleToRawLongBits(d));
                    }
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 1:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        float e = ol1.c.e(j3, obj);
                        wh whVar2 = (wh) s40Var2.e;
                        whVar2.getClass();
                        whVar2.r(i14, Float.floatToRawIntBits(e));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 2:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).E(i14, unsafe.getLong(obj, j3));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 3:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).E(i14, unsafe.getLong(obj, j3));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 4:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).v(i14, unsafe.getInt(obj, j3));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case ry0.STRING_FIELD_NUMBER /* 5 */:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).t(i14, unsafe.getLong(obj, j3));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).r(i14, unsafe.getInt(obj, j3));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).o(i14, ol1.c.c(j3, obj));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case ry0.BYTES_FIELD_NUMBER /* 8 */:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((wh) s40Var2.e).z(i14, (String) object);
                        } else {
                            ((wh) s40Var2.e).p(i14, (ff) object);
                        }
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 9:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).y(i14, (d0) unsafe.getObject(obj, j3), il0Var.m(i12));
                    }
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).p(i14, (ff) unsafe.getObject(obj, j3));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case RequestError.STOP_TRACKING /* 11 */:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).C(i14, unsafe.getInt(obj, j3));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 12:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).v(i14, unsafe.getInt(obj, j3));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 13:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).r(i14, unsafe.getInt(obj, j3));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 14:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        ((wh) s40Var2.e).t(i14, unsafe.getLong(obj, j3));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 15:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        int i18 = unsafe.getInt(obj, j3);
                        ((wh) s40Var2.e).C(i14, (i18 >> 31) ^ (i18 << 1));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 16:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        long j4 = unsafe.getLong(obj, j3);
                        ((wh) s40Var2.e).E(i14, (j4 >> 63) ^ (j4 << 1));
                    }
                    il0Var = this;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 17:
                    s40Var2 = s40Var3;
                    if (il0Var.o(obj, i12, i11, i13, i2)) {
                        s40Var2.E(i14, unsafe.getObject(obj, j3), il0Var.m(i12));
                    }
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 18:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    x61.n(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 19:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    x61.r(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 20:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    x61.t(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 21:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    x61.z(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 22:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    x61.s(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 23:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    x61.q(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 24:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    x61.p(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 25:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    x61.m(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 26:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    int i19 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls = x61.a;
                    if (list != null && !list.isEmpty()) {
                        s40Var2.getClass();
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            ((wh) s40Var2.e).z(i19, (String) list.get(i20));
                        }
                    }
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                    break;
                case 27:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    int i21 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    u61 m = il0Var.m(i12);
                    Class cls2 = x61.a;
                    if (list2 != null && !list2.isEmpty()) {
                        s40Var2.getClass();
                        for (int i22 = 0; i22 < list2.size(); i22++) {
                            ((wh) s40Var2.e).y(i21, (d0) list2.get(i22), m);
                        }
                    }
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                    break;
                case 28:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    int i23 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = x61.a;
                    if (list3 != null && !list3.isEmpty()) {
                        s40Var2.getClass();
                        for (int i24 = 0; i24 < list3.size(); i24++) {
                            ((wh) s40Var2.e).p(i23, (ff) list3.get(i24));
                        }
                    }
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                    break;
                case 29:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    z = false;
                    x61.y(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 30:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    z = false;
                    x61.o(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 31:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    z = false;
                    x61.u(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 32:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    z = false;
                    x61.v(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 33:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    z = false;
                    x61.w(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 34:
                    i3 = i11;
                    i4 = i13;
                    s40Var2 = s40Var3;
                    z = false;
                    x61.x(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, false);
                    i11 = i3;
                    i13 = i4;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 35:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.n(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 36:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.r(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 37:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.t(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 38:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.z(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 39:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.s(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.q(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.p(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 42:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.m(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 43:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.y(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 44:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.o(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 45:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.u(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 46:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.v(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 47:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.w(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 48:
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var3;
                    x61.x(iArr[i12], (List) unsafe.getObject(obj, j3), s40Var2, true);
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 49:
                    i5 = i11;
                    i6 = i13;
                    int i25 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    u61 m2 = il0Var.m(i12);
                    Class cls4 = x61.a;
                    if (list4 != null && !list4.isEmpty()) {
                        s40Var.getClass();
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            s40Var.E(i25, list4.get(i26), m2);
                        }
                    }
                    s40Var2 = s40Var;
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j3);
                    if (object2 != null) {
                        int i27 = 2;
                        Object obj2 = il0Var.b[(i12 / 3) * 2];
                        il0Var.m.getClass();
                        i8 i8Var = ((bk0) obj2).a;
                        bq1 bq1Var = (bq1) i8Var.g;
                        bq1 bq1Var2 = (bq1) i8Var.e;
                        wh whVar3 = (wh) s40Var3.e;
                        whVar3.getClass();
                        Iterator it = ((ck0) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            whVar3.B(i14, i27);
                            int i28 = i27;
                            Object key = entry.getKey();
                            int i29 = i15;
                            Object value = entry.getValue();
                            int i30 = xx.c;
                            int h = wh.h(i29);
                            int i31 = i11;
                            yp1 yp1Var = bq1.h;
                            if (bq1Var2 == yp1Var) {
                                h *= 2;
                            }
                            int i32 = i13;
                            Iterator it2 = it;
                            switch (bq1Var2.ordinal()) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    ((Double) key).getClass();
                                    j = 8;
                                    int i33 = j + h;
                                    int h2 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                        h2 *= 2;
                                    }
                                    switch (bq1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            j2 = 8;
                                            whVar3.D(j2 + h2 + i33);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key2);
                                            xx.b(whVar3, bq1Var, i28, value2);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case 1:
                                            ((Float) value).getClass();
                                            j2 = 4;
                                            whVar3.D(j2 + h2 + i33);
                                            Object key22 = entry.getKey();
                                            Object value22 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key22);
                                            xx.b(whVar3, bq1Var, i28, value22);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case 2:
                                            j2 = wh.j(((Long) value).longValue());
                                            whVar3.D(j2 + h2 + i33);
                                            Object key222 = entry.getKey();
                                            Object value222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key222);
                                            xx.b(whVar3, bq1Var, i28, value222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case 3:
                                            j2 = wh.j(((Long) value).longValue());
                                            whVar3.D(j2 + h2 + i33);
                                            Object key2222 = entry.getKey();
                                            Object value2222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key2222);
                                            xx.b(whVar3, bq1Var, i28, value2222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case 4:
                                            j2 = wh.j(((Integer) value).intValue());
                                            whVar3.D(j2 + h2 + i33);
                                            Object key22222 = entry.getKey();
                                            Object value22222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key22222);
                                            xx.b(whVar3, bq1Var, i28, value22222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            j2 = 8;
                                            whVar3.D(j2 + h2 + i33);
                                            Object key222222 = entry.getKey();
                                            Object value222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key222222);
                                            xx.b(whVar3, bq1Var, i28, value222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            j2 = 4;
                                            whVar3.D(j2 + h2 + i33);
                                            Object key2222222 = entry.getKey();
                                            Object value2222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key2222222);
                                            xx.b(whVar3, bq1Var, i28, value2222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            j2 = i29;
                                            whVar3.D(j2 + h2 + i33);
                                            Object key22222222 = entry.getKey();
                                            Object value22222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key22222222);
                                            xx.b(whVar3, bq1Var, i28, value22222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case ry0.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof ff) {
                                                size2 = ((ff) value).size();
                                                i9 = wh.i(size2);
                                                j2 = size2 + i9;
                                                whVar3.D(j2 + h2 + i33);
                                                Object key222222222 = entry.getKey();
                                                Object value222222222 = entry.getValue();
                                                xx.b(whVar3, bq1Var2, i29, key222222222);
                                                xx.b(whVar3, bq1Var, i28, value222222222);
                                                i27 = i28;
                                                i11 = i31;
                                                i13 = i32;
                                                it = it2;
                                                i15 = 1;
                                            } else {
                                                j2 = wh.g((String) value);
                                                whVar3.D(j2 + h2 + i33);
                                                Object key2222222222 = entry.getKey();
                                                Object value2222222222 = entry.getValue();
                                                xx.b(whVar3, bq1Var2, i29, key2222222222);
                                                xx.b(whVar3, bq1Var, i28, value2222222222);
                                                i27 = i28;
                                                i11 = i31;
                                                i13 = i32;
                                                it = it2;
                                                i15 = 1;
                                            }
                                        case 9:
                                            j2 = ((m40) ((d0) value)).a(null);
                                            whVar3.D(j2 + h2 + i33);
                                            Object key22222222222 = entry.getKey();
                                            Object value22222222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key22222222222);
                                            xx.b(whVar3, bq1Var, i28, value22222222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case RequestError.EVENT_TIMEOUT /* 10 */:
                                            size2 = ((m40) ((d0) value)).a(null);
                                            i9 = wh.i(size2);
                                            j2 = size2 + i9;
                                            whVar3.D(j2 + h2 + i33);
                                            Object key222222222222 = entry.getKey();
                                            Object value222222222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key222222222222);
                                            xx.b(whVar3, bq1Var, i28, value222222222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof ff) {
                                                size2 = ((ff) value).size();
                                                i9 = wh.i(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                i9 = wh.i(size2);
                                            }
                                            j2 = size2 + i9;
                                            whVar3.D(j2 + h2 + i33);
                                            Object key2222222222222 = entry.getKey();
                                            Object value2222222222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key2222222222222);
                                            xx.b(whVar3, bq1Var, i28, value2222222222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case 12:
                                            j2 = wh.i(((Integer) value).intValue());
                                            whVar3.D(j2 + h2 + i33);
                                            Object key22222222222222 = entry.getKey();
                                            Object value22222222222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key22222222222222);
                                            xx.b(whVar3, bq1Var, i28, value22222222222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case 13:
                                            j2 = wh.j(((Integer) value).intValue());
                                            whVar3.D(j2 + h2 + i33);
                                            Object key222222222222222 = entry.getKey();
                                            Object value222222222222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key222222222222222);
                                            xx.b(whVar3, bq1Var, i28, value222222222222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case 14:
                                            ((Integer) value).getClass();
                                            j2 = 4;
                                            whVar3.D(j2 + h2 + i33);
                                            Object key2222222222222222 = entry.getKey();
                                            Object value2222222222222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key2222222222222222);
                                            xx.b(whVar3, bq1Var, i28, value2222222222222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case 15:
                                            ((Long) value).getClass();
                                            j2 = 8;
                                            whVar3.D(j2 + h2 + i33);
                                            Object key22222222222222222 = entry.getKey();
                                            Object value22222222222222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key22222222222222222);
                                            xx.b(whVar3, bq1Var, i28, value22222222222222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            j2 = wh.i((intValue >> 31) ^ (intValue << 1));
                                            whVar3.D(j2 + h2 + i33);
                                            Object key222222222222222222 = entry.getKey();
                                            Object value222222222222222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key222222222222222222);
                                            xx.b(whVar3, bq1Var, i28, value222222222222222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            j2 = wh.j((longValue << i29) ^ (longValue >> 63));
                                            whVar3.D(j2 + h2 + i33);
                                            Object key2222222222222222222 = entry.getKey();
                                            Object value2222222222222222222 = entry.getValue();
                                            xx.b(whVar3, bq1Var2, i29, key2222222222222222222);
                                            xx.b(whVar3, bq1Var, i28, value2222222222222222222);
                                            i27 = i28;
                                            i11 = i31;
                                            i13 = i32;
                                            it = it2;
                                            i15 = 1;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    ((Float) key).getClass();
                                    j = 4;
                                    int i332 = j + h;
                                    int h22 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 2:
                                    j = wh.j(((Long) key).longValue());
                                    int i3322 = j + h;
                                    int h222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 3:
                                    j = wh.j(((Long) key).longValue());
                                    int i33222 = j + h;
                                    int h2222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 4:
                                    j = wh.j(((Integer) key).intValue());
                                    int i332222 = j + h;
                                    int h22222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case ry0.STRING_FIELD_NUMBER /* 5 */:
                                    ((Long) key).getClass();
                                    j = 8;
                                    int i3322222 = j + h;
                                    int h222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                    ((Integer) key).getClass();
                                    j = 4;
                                    int i33222222 = j + h;
                                    int h2222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                                    ((Boolean) key).getClass();
                                    j = i29;
                                    int i332222222 = j + h;
                                    int h22222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case ry0.BYTES_FIELD_NUMBER /* 8 */:
                                    if (key instanceof ff) {
                                        size = ((ff) key).size();
                                        i7 = wh.i(size);
                                        j = size + i7;
                                        int i3322222222 = j + h;
                                        int h222222222 = wh.h(i28);
                                        if (bq1Var == yp1Var) {
                                        }
                                        switch (bq1Var.ordinal()) {
                                        }
                                    } else {
                                        j = wh.g((String) key);
                                        int i33222222222 = j + h;
                                        int h2222222222 = wh.h(i28);
                                        if (bq1Var == yp1Var) {
                                        }
                                        switch (bq1Var.ordinal()) {
                                        }
                                    }
                                case 9:
                                    a = ((m40) ((d0) key)).a(null);
                                    j = a;
                                    int i332222222222 = j + h;
                                    int h22222222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case RequestError.EVENT_TIMEOUT /* 10 */:
                                    int a2 = ((m40) ((d0) key)).a(null);
                                    a = a2 + wh.i(a2);
                                    j = a;
                                    int i3322222222222 = j + h;
                                    int h222222222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case RequestError.STOP_TRACKING /* 11 */:
                                    if (key instanceof ff) {
                                        size = ((ff) key).size();
                                        i7 = wh.i(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        i7 = wh.i(size);
                                    }
                                    j = size + i7;
                                    int i33222222222222 = j + h;
                                    int h2222222222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 12:
                                    j = wh.i(((Integer) key).intValue());
                                    int i332222222222222 = j + h;
                                    int h22222222222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 13:
                                    j = wh.j(((Integer) key).intValue());
                                    int i3322222222222222 = j + h;
                                    int h222222222222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    j = 4;
                                    int i33222222222222222 = j + h;
                                    int h2222222222222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    j = 8;
                                    int i332222222222222222 = j + h;
                                    int h22222222222222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    i8 = wh.i((intValue2 << 1) ^ (intValue2 >> 31));
                                    j = i8;
                                    int i3322222222222222222 = j + h;
                                    int h222222222222222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    i8 = wh.j((longValue2 << i29) ^ (longValue2 >> 63));
                                    j = i8;
                                    int i33222222222222222222 = j + h;
                                    int h2222222222222222222 = wh.h(i28);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i5 = i11;
                    i6 = i13;
                    s40Var2 = s40Var;
                    i11 = i5;
                    i13 = i6;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 51:
                    if (il0Var.q(i14, i12, obj)) {
                        double doubleValue = ((Double) ol1.c.h(j3, obj)).doubleValue();
                        wh whVar4 = (wh) s40Var3.e;
                        whVar4.getClass();
                        whVar4.t(i14, Double.doubleToRawLongBits(doubleValue));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 52:
                    if (il0Var.q(i14, i12, obj)) {
                        float floatValue = ((Float) ol1.c.h(j3, obj)).floatValue();
                        wh whVar5 = (wh) s40Var3.e;
                        whVar5.getClass();
                        whVar5.r(i14, Float.floatToRawIntBits(floatValue));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 53:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).E(i14, z(j3, obj));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 54:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).E(i14, z(j3, obj));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 55:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).v(i14, y(j3, obj));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 56:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).t(i14, z(j3, obj));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 57:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).r(i14, y(j3, obj));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 58:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).o(i14, ((Boolean) ol1.c.h(j3, obj)).booleanValue());
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 59:
                    if (il0Var.q(i14, i12, obj)) {
                        Object object3 = unsafe.getObject(obj, j3);
                        if (object3 instanceof String) {
                            ((wh) s40Var3.e).z(i14, (String) object3);
                        } else {
                            ((wh) s40Var3.e).p(i14, (ff) object3);
                        }
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 60:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).y(i14, (d0) unsafe.getObject(obj, j3), il0Var.m(i12));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 61:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).p(i14, (ff) unsafe.getObject(obj, j3));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 62:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).C(i14, y(j3, obj));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 63:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).v(i14, y(j3, obj));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 64:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).r(i14, y(j3, obj));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 65:
                    if (il0Var.q(i14, i12, obj)) {
                        ((wh) s40Var3.e).t(i14, z(j3, obj));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 66:
                    if (il0Var.q(i14, i12, obj)) {
                        int y = y(j3, obj);
                        ((wh) s40Var3.e).C(i14, (y >> 31) ^ (y << 1));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 67:
                    if (il0Var.q(i14, i12, obj)) {
                        long z2 = z(j3, obj);
                        ((wh) s40Var3.e).E(i14, (z2 << 1) ^ (z2 >> 63));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                case 68:
                    if (il0Var.q(i14, i12, obj)) {
                        s40Var3.E(i14, unsafe.getObject(obj, j3), il0Var.m(i12));
                    }
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
                default:
                    s40Var2 = s40Var3;
                    i12 += 3;
                    s40Var3 = s40Var2;
                    i10 = 1048575;
            }
        }
        il0Var.l.getClass();
        ((m40) obj).unknownFields.d(s40Var3);
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
    @Override // defpackage.u61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(m40 m40Var) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int L = L(i4);
            int i5 = iArr[i4];
            long j = 1048575 & L;
            int i6 = 1237;
            int i7 = 37;
            switch (K(L)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i = i3 * 53;
                    b = ia0.b(Double.doubleToLongBits(ol1.c.d(j, m40Var)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(ol1.c.e(j, m40Var));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = ia0.b(ol1.c.g(j, m40Var));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = ia0.b(ol1.c.g(j, m40Var));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = ol1.c.f(j, m40Var);
                    i3 = b + i;
                    break;
                case ry0.STRING_FIELD_NUMBER /* 5 */:
                    i = i3 * 53;
                    b = ia0.b(ol1.c.g(j, m40Var));
                    i3 = b + i;
                    break;
                case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                    i = i3 * 53;
                    b = ol1.c.f(j, m40Var);
                    i3 = b + i;
                    break;
                case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                    i2 = i3 * 53;
                    boolean c = ol1.c.c(j, m40Var);
                    Charset charset = ia0.a;
                    break;
                case ry0.BYTES_FIELD_NUMBER /* 8 */:
                    i = i3 * 53;
                    b = ((String) ol1.c.h(j, m40Var)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object h = ol1.c.h(j, m40Var);
                    if (h != null) {
                        i7 = h.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    i = i3 * 53;
                    b = ol1.c.h(j, m40Var).hashCode();
                    i3 = b + i;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    i = i3 * 53;
                    b = ol1.c.f(j, m40Var);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = ol1.c.f(j, m40Var);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = ol1.c.f(j, m40Var);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = ia0.b(ol1.c.g(j, m40Var));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = ol1.c.f(j, m40Var);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = ia0.b(ol1.c.g(j, m40Var));
                    i3 = b + i;
                    break;
                case 17:
                    Object h2 = ol1.c.h(j, m40Var);
                    if (h2 != null) {
                        i7 = h2.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
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
                    i = i3 * 53;
                    b = ol1.c.h(j, m40Var).hashCode();
                    i3 = b + i;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i = i3 * 53;
                    b = ol1.c.h(j, m40Var).hashCode();
                    i3 = b + i;
                    break;
                case 51:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = ia0.b(Double.doubleToLongBits(((Double) ol1.c.h(j, m40Var)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) ol1.c.h(j, m40Var)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = ia0.b(z(j, m40Var));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = ia0.b(z(j, m40Var));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = y(j, m40Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = ia0.b(z(j, m40Var));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = y(j, m40Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i5, i4, m40Var)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) ol1.c.h(j, m40Var)).booleanValue();
                        Charset charset2 = ia0.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = ((String) ol1.c.h(j, m40Var)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = ol1.c.h(j, m40Var).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = ol1.c.h(j, m40Var).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = y(j, m40Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = y(j, m40Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = y(j, m40Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = ia0.b(z(j, m40Var));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = y(j, m40Var);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = ia0.b(z(j, m40Var));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i5, i4, m40Var)) {
                        i = i3 * 53;
                        b = ol1.c.h(j, m40Var).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.l.getClass();
        return m40Var.unknownFields.hashCode() + (i3 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.u61
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            af.e(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                x61.k(this.l, obj, obj2);
                return;
            }
            int L = L(i);
            long j = 1048575 & L;
            int i2 = iArr[i];
            switch (K(L)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (n(i, obj2)) {
                        nl1 nl1Var = ol1.c;
                        obj3 = obj;
                        nl1Var.l(obj3, j, nl1Var.d(j, obj2));
                        G(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i, obj2)) {
                        nl1 nl1Var2 = ol1.c;
                        nl1Var2.m(obj, j, nl1Var2.e(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        ol1.n(obj, j, ol1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        ol1.n(obj, j, ol1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        ol1.m(obj, j, ol1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case ry0.STRING_FIELD_NUMBER /* 5 */:
                    if (n(i, obj2)) {
                        ol1.n(obj, j, ol1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(i, obj2)) {
                        ol1.m(obj, j, ol1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i, obj2)) {
                        nl1 nl1Var3 = ol1.c;
                        nl1Var3.j(obj, j, nl1Var3.c(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case ry0.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(i, obj2)) {
                        ol1.o(j, obj, ol1.c.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(obj, i, obj2);
                    obj3 = obj;
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (n(i, obj2)) {
                        ol1.o(j, obj, ol1.c.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (n(i, obj2)) {
                        ol1.m(obj, j, ol1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        ol1.m(obj, j, ol1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        ol1.m(obj, j, ol1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        ol1.n(obj, j, ol1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        ol1.m(obj, j, ol1.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        ol1.n(obj, j, ol1.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(obj, i, obj2);
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
                    this.k.getClass();
                    nl1 nl1Var4 = ol1.c;
                    ha0 ha0Var = (ha0) nl1Var4.h(j, obj);
                    ha0 ha0Var2 = (ha0) nl1Var4.h(j, obj2);
                    int i3 = ((j01) ha0Var).g;
                    int i4 = ((j01) ha0Var2).g;
                    if (i3 > 0 && i4 > 0) {
                        if (!((j01) ha0Var).d) {
                            ha0Var = ((j01) ha0Var).d(i4 + i3);
                        }
                        ((j01) ha0Var).addAll(ha0Var2);
                    }
                    if (i3 > 0) {
                        ha0Var2 = ha0Var;
                    }
                    ol1.o(j, obj, ha0Var2);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = x61.a;
                    nl1 nl1Var5 = ol1.c;
                    Object h = nl1Var5.h(j, obj);
                    Object h2 = nl1Var5.h(j, obj2);
                    this.m.getClass();
                    ol1.o(j, obj, dk0.a(h, h2));
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
                    if (q(i2, i, obj2)) {
                        ol1.o(j, obj, ol1.c.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, obj2)) {
                        ol1.o(j, obj, ol1.c.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(obj, i, obj2);
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

    @Override // defpackage.u61
    public final void c(Object obj) {
        if (p(obj)) {
            if (obj instanceof m40) {
                m40 m40Var = (m40) obj;
                m40Var.k(Integer.MAX_VALUE);
                m40Var.memoizedHashCode = 0;
                m40Var.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int L = L(i);
                long j = 1048575 & L;
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
                                this.k.getClass();
                                j01 j01Var = (j01) ((ha0) ol1.c.h(j, obj));
                                if (j01Var.d) {
                                    j01Var.d = false;
                                    break;
                                } else {
                                    break;
                                }
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((ck0) object).d = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).c(o.getObject(obj, j));
                    }
                }
                if (n(i, obj)) {
                    m(i).c(o.getObject(obj, j));
                }
            }
            this.l.getClass();
            el1 el1Var = ((m40) obj).unknownFields;
            if (el1Var.e) {
                el1Var.e = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032a A[SYNTHETIC] */
    @Override // defpackage.u61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(m40 m40Var) {
        int i;
        int h;
        int h2;
        int h3;
        int j;
        int h4;
        int j2;
        int h5;
        int h6;
        int f;
        int a;
        int i2;
        int c;
        int i3;
        int i4;
        int h7;
        int size;
        int i5;
        int h8;
        int h9;
        int size2;
        int h10;
        int i6;
        int i7;
        int i8;
        Iterator it;
        int j3;
        int size3;
        int i9;
        bq1 bq1Var;
        int j4;
        int size4;
        int i10;
        int h11;
        int h12;
        int j5;
        int h13;
        int j6;
        int i11;
        il0 il0Var = this;
        m40 m40Var2 = m40Var;
        Unsafe unsafe = o;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = il0Var.a;
            if (i14 >= iArr.length) {
                il0Var.l.getClass();
                return m40Var2.unknownFields.b() + i16;
            }
            int L = il0Var.L(i14);
            int K = K(L);
            int i17 = iArr[i14];
            int i18 = iArr[i14 + 2];
            int i19 = i18 & i12;
            int i20 = 1;
            if (K <= 17) {
                if (i19 != i13) {
                    i15 = i19 == i12 ? 0 : unsafe.getInt(m40Var2, i19);
                    i13 = i19;
                }
                i = 1 << (i18 >>> 20);
            } else {
                i = 0;
            }
            long j7 = L & i12;
            if (K >= yx.e.d) {
                int i21 = yx.g.d;
            }
            char c2 = '?';
            switch (K) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        h = wh.h(i17);
                        a = h + 8;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 1:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        h2 = wh.h(i17);
                        h6 = h2 + 4;
                        i16 += h6;
                    }
                    il0Var = this;
                    m40Var2 = m40Var;
                    i14 += 3;
                    i12 = 1048575;
                case 2:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        long j8 = unsafe.getLong(m40Var2, j7);
                        h3 = wh.h(i17);
                        j = wh.j(j8);
                        i16 += j + h3;
                    }
                    il0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                case 3:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        long j9 = unsafe.getLong(m40Var2, j7);
                        h3 = wh.h(i17);
                        j = wh.j(j9);
                        i16 += j + h3;
                    }
                    il0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                case 4:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        int i22 = unsafe.getInt(m40Var2, j7);
                        h4 = wh.h(i17);
                        j2 = wh.j(i22);
                        f = j2 + h4;
                        i16 += f;
                    }
                    il0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                case ry0.STRING_FIELD_NUMBER /* 5 */:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        h5 = wh.h(i17);
                        h6 = h5 + 8;
                        i16 += h6;
                    }
                    il0Var = this;
                    m40Var2 = m40Var;
                    i14 += 3;
                    i12 = 1048575;
                case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        h2 = wh.h(i17);
                        h6 = h2 + 4;
                        i16 += h6;
                    }
                    il0Var = this;
                    m40Var2 = m40Var;
                    i14 += 3;
                    i12 = 1048575;
                case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        h6 = wh.h(i17) + 1;
                        i16 += h6;
                    }
                    il0Var = this;
                    m40Var2 = m40Var;
                    i14 += 3;
                    i12 = 1048575;
                case ry0.BYTES_FIELD_NUMBER /* 8 */:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        Object object = unsafe.getObject(m40Var2, j7);
                        i16 = (object instanceof ff ? wh.f(i17, (ff) object) : wh.g((String) object) + wh.h(i17)) + i16;
                    }
                    il0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                case 9:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        Object object2 = unsafe.getObject(m40Var2, j7);
                        u61 m = il0Var.m(i14);
                        Class cls = x61.a;
                        int h14 = wh.h(i17);
                        int a2 = ((d0) object2).a(m);
                        i16 += wh.i(a2) + a2 + h14;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        f = wh.f(i17, (ff) unsafe.getObject(m40Var2, j7));
                        i16 += f;
                    }
                    il0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        int i23 = unsafe.getInt(m40Var2, j7);
                        h4 = wh.h(i17);
                        j2 = wh.i(i23);
                        f = j2 + h4;
                        i16 += f;
                    }
                    il0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                case 12:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        int i24 = unsafe.getInt(m40Var2, j7);
                        h4 = wh.h(i17);
                        j2 = wh.j(i24);
                        f = j2 + h4;
                        i16 += f;
                    }
                    il0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                case 13:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        h2 = wh.h(i17);
                        h6 = h2 + 4;
                        i16 += h6;
                    }
                    il0Var = this;
                    m40Var2 = m40Var;
                    i14 += 3;
                    i12 = 1048575;
                case 14:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        h5 = wh.h(i17);
                        h6 = h5 + 8;
                        i16 += h6;
                    }
                    il0Var = this;
                    m40Var2 = m40Var;
                    i14 += 3;
                    i12 = 1048575;
                case 15:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        int i25 = unsafe.getInt(m40Var2, j7);
                        h4 = wh.h(i17);
                        j2 = wh.i((i25 >> 31) ^ (i25 << 1));
                        f = j2 + h4;
                        i16 += f;
                    }
                    il0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                case 16:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        long j10 = unsafe.getLong(m40Var2, j7);
                        h3 = wh.h(i17);
                        j = wh.j((j10 >> 63) ^ (j10 << 1));
                        i16 += j + h3;
                    }
                    il0Var = this;
                    i14 += 3;
                    i12 = 1048575;
                case 17:
                    if (il0Var.o(m40Var2, i14, i13, i15, i)) {
                        a = ((d0) unsafe.getObject(m40Var2, j7)).a(il0Var.m(i14)) + (wh.h(i17) * 2);
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 18:
                    i2 = i13;
                    c = x61.c(i17, (List) unsafe.getObject(m40Var2, j7));
                    i16 += c;
                    i13 = i2;
                    i14 += 3;
                    i12 = 1048575;
                case 19:
                    i2 = i13;
                    c = x61.b(i17, (List) unsafe.getObject(m40Var2, j7));
                    i16 += c;
                    i13 = i2;
                    i14 += 3;
                    i12 = 1048575;
                case 20:
                    i3 = i13;
                    i4 = i15;
                    List list = (List) unsafe.getObject(m40Var2, j7);
                    Class cls2 = x61.a;
                    if (list.size() != 0) {
                        h7 = (wh.h(i17) * list.size()) + x61.e(list);
                        i16 += h7;
                        i13 = i3;
                        i15 = i4;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    h7 = 0;
                    i16 += h7;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 21:
                    i3 = i13;
                    i4 = i15;
                    List list2 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls3 = x61.a;
                    size = list2.size();
                    if (size != 0) {
                        i5 = x61.i(list2);
                        h8 = wh.h(i17);
                        h7 = (h8 * size) + i5;
                        i16 += h7;
                        i13 = i3;
                        i15 = i4;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    h7 = 0;
                    i16 += h7;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 22:
                    i3 = i13;
                    i4 = i15;
                    List list3 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls4 = x61.a;
                    size = list3.size();
                    if (size != 0) {
                        i5 = x61.d(list3);
                        h8 = wh.h(i17);
                        h7 = (h8 * size) + i5;
                        i16 += h7;
                        i13 = i3;
                        i15 = i4;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    h7 = 0;
                    i16 += h7;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 23:
                    i2 = i13;
                    c = x61.c(i17, (List) unsafe.getObject(m40Var2, j7));
                    i16 += c;
                    i13 = i2;
                    i14 += 3;
                    i12 = 1048575;
                case 24:
                    i2 = i13;
                    c = x61.b(i17, (List) unsafe.getObject(m40Var2, j7));
                    i16 += c;
                    i13 = i2;
                    i14 += 3;
                    i12 = 1048575;
                case 25:
                    i3 = i13;
                    i4 = i15;
                    List list4 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls5 = x61.a;
                    int size5 = list4.size();
                    i16 += size5 == 0 ? 0 : (wh.h(i17) + 1) * size5;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 26:
                    i3 = i13;
                    i4 = i15;
                    List list5 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls6 = x61.a;
                    int size6 = list5.size();
                    if (size6 != 0) {
                        h7 = wh.h(i17) * size6;
                        for (int i26 = 0; i26 < size6; i26++) {
                            Object obj = list5.get(i26);
                            if (obj instanceof ff) {
                                int size7 = ((ff) obj).size();
                                h7 = wh.i(size7) + size7 + h7;
                            } else {
                                h7 = wh.g((String) obj) + h7;
                            }
                        }
                        i16 += h7;
                        i13 = i3;
                        i15 = i4;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    h7 = 0;
                    i16 += h7;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 27:
                    i3 = i13;
                    i4 = i15;
                    List list6 = (List) unsafe.getObject(m40Var2, j7);
                    u61 m2 = il0Var.m(i14);
                    Class cls7 = x61.a;
                    int size8 = list6.size();
                    if (size8 == 0) {
                        h9 = 0;
                    } else {
                        h9 = wh.h(i17) * size8;
                        for (int i27 = 0; i27 < size8; i27++) {
                            int a3 = ((d0) list6.get(i27)).a(m2);
                            h9 += wh.i(a3) + a3;
                        }
                    }
                    i16 += h9;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 28:
                    i3 = i13;
                    i4 = i15;
                    List list7 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls8 = x61.a;
                    int size9 = list7.size();
                    if (size9 != 0) {
                        h7 = wh.h(i17) * size9;
                        for (int i28 = 0; i28 < list7.size(); i28++) {
                            int size10 = ((ff) list7.get(i28)).size();
                            h7 += wh.i(size10) + size10;
                        }
                        i16 += h7;
                        i13 = i3;
                        i15 = i4;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    h7 = 0;
                    i16 += h7;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 29:
                    i3 = i13;
                    i4 = i15;
                    List list8 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls9 = x61.a;
                    size = list8.size();
                    if (size != 0) {
                        i5 = x61.h(list8);
                        h8 = wh.h(i17);
                        h7 = (h8 * size) + i5;
                        i16 += h7;
                        i13 = i3;
                        i15 = i4;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    h7 = 0;
                    i16 += h7;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 30:
                    i3 = i13;
                    i4 = i15;
                    List list9 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls10 = x61.a;
                    size = list9.size();
                    if (size != 0) {
                        i5 = x61.a(list9);
                        h8 = wh.h(i17);
                        h7 = (h8 * size) + i5;
                        i16 += h7;
                        i13 = i3;
                        i15 = i4;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    h7 = 0;
                    i16 += h7;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 31:
                    i2 = i13;
                    c = x61.b(i17, (List) unsafe.getObject(m40Var2, j7));
                    i16 += c;
                    i13 = i2;
                    i14 += 3;
                    i12 = 1048575;
                case 32:
                    i2 = i13;
                    c = x61.c(i17, (List) unsafe.getObject(m40Var2, j7));
                    i16 += c;
                    i13 = i2;
                    i14 += 3;
                    i12 = 1048575;
                case 33:
                    i3 = i13;
                    i4 = i15;
                    List list10 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls11 = x61.a;
                    size = list10.size();
                    if (size != 0) {
                        i5 = x61.f(list10);
                        h8 = wh.h(i17);
                        h7 = (h8 * size) + i5;
                        i16 += h7;
                        i13 = i3;
                        i15 = i4;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    h7 = 0;
                    i16 += h7;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 34:
                    i3 = i13;
                    i4 = i15;
                    List list11 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls12 = x61.a;
                    size = list11.size();
                    if (size != 0) {
                        i5 = x61.g(list11);
                        h8 = wh.h(i17);
                        h7 = (h8 * size) + i5;
                        i16 += h7;
                        i13 = i3;
                        i15 = i4;
                        i14 += 3;
                        i12 = 1048575;
                    }
                    h7 = 0;
                    i16 += h7;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 35:
                    i3 = i13;
                    i4 = i15;
                    List list12 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls13 = x61.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 36:
                    i3 = i13;
                    i4 = i15;
                    List list13 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls14 = x61.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 37:
                    i3 = i13;
                    i4 = i15;
                    size2 = x61.e((List) unsafe.getObject(m40Var2, j7));
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 38:
                    i3 = i13;
                    i4 = i15;
                    size2 = x61.i((List) unsafe.getObject(m40Var2, j7));
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 39:
                    i3 = i13;
                    i4 = i15;
                    size2 = x61.d((List) unsafe.getObject(m40Var2, j7));
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    i3 = i13;
                    i4 = i15;
                    List list14 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls15 = x61.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i3 = i13;
                    i4 = i15;
                    List list15 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls16 = x61.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 42:
                    i3 = i13;
                    i4 = i15;
                    List list16 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls17 = x61.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 43:
                    i3 = i13;
                    i4 = i15;
                    size2 = x61.h((List) unsafe.getObject(m40Var2, j7));
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 44:
                    i3 = i13;
                    i4 = i15;
                    size2 = x61.a((List) unsafe.getObject(m40Var2, j7));
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 45:
                    i3 = i13;
                    i4 = i15;
                    List list17 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls18 = x61.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 46:
                    i3 = i13;
                    i4 = i15;
                    List list18 = (List) unsafe.getObject(m40Var2, j7);
                    Class cls19 = x61.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 47:
                    i3 = i13;
                    i4 = i15;
                    size2 = x61.f((List) unsafe.getObject(m40Var2, j7));
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 48:
                    i3 = i13;
                    i4 = i15;
                    size2 = x61.g((List) unsafe.getObject(m40Var2, j7));
                    if (size2 > 0) {
                        h10 = wh.h(i17);
                        i6 = wh.i(size2);
                        i16 += i6 + h10 + size2;
                    }
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 49:
                    i3 = i13;
                    i4 = i15;
                    List list19 = (List) unsafe.getObject(m40Var2, j7);
                    u61 m3 = il0Var.m(i14);
                    Class cls20 = x61.a;
                    int size11 = list19.size();
                    if (size11 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 0;
                        for (int i29 = 0; i29 < size11; i29++) {
                            i7 += ((d0) list19.get(i29)).a(m3) + (wh.h(i17) * 2);
                        }
                    }
                    i16 += i7;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(m40Var2, j7);
                    Object obj2 = il0Var.b[(i14 / 3) * 2];
                    il0Var.m.getClass();
                    ck0 ck0Var = (ck0) object3;
                    bk0 bk0Var = (bk0) obj2;
                    if (ck0Var.isEmpty()) {
                        i8 = 0;
                    } else {
                        Iterator it2 = ck0Var.entrySet().iterator();
                        i8 = 0;
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            bk0Var.getClass();
                            int h15 = wh.h(i17);
                            i8 i8Var = bk0Var.a;
                            char c3 = c2;
                            bq1 bq1Var2 = (bq1) i8Var.e;
                            int i30 = xx.c;
                            int h16 = wh.h(i20);
                            int i31 = i20;
                            yp1 yp1Var = bq1.h;
                            if (bq1Var2 == yp1Var) {
                                h16 *= 2;
                            }
                            int i32 = i13;
                            int i33 = i15;
                            switch (bq1Var2.ordinal()) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    it = it2;
                                    ((Double) key).getClass();
                                    j3 = 8;
                                    int i34 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h17 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                        h17 *= 2;
                                    }
                                    switch (bq1Var.ordinal()) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((Double) value).getClass();
                                            j4 = 8;
                                            int i35 = j4 + h17 + i34;
                                            i8 += wh.i(i35) + i35 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case 1:
                                            ((Float) value).getClass();
                                            j4 = 4;
                                            int i352 = j4 + h17 + i34;
                                            i8 += wh.i(i352) + i352 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case 2:
                                            j4 = wh.j(((Long) value).longValue());
                                            int i3522 = j4 + h17 + i34;
                                            i8 += wh.i(i3522) + i3522 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case 3:
                                            j4 = wh.j(((Long) value).longValue());
                                            int i35222 = j4 + h17 + i34;
                                            i8 += wh.i(i35222) + i35222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case 4:
                                            j4 = wh.j(((Integer) value).intValue());
                                            int i352222 = j4 + h17 + i34;
                                            i8 += wh.i(i352222) + i352222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case ry0.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            j4 = 8;
                                            int i3522222 = j4 + h17 + i34;
                                            i8 += wh.i(i3522222) + i3522222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            j4 = 4;
                                            int i35222222 = j4 + h17 + i34;
                                            i8 += wh.i(i35222222) + i35222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            j4 = i31;
                                            int i352222222 = j4 + h17 + i34;
                                            i8 += wh.i(i352222222) + i352222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case ry0.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof ff) {
                                                size4 = ((ff) value).size();
                                                i10 = wh.i(size4);
                                                j4 = size4 + i10;
                                                int i3522222222 = j4 + h17 + i34;
                                                i8 += wh.i(i3522222222) + i3522222222 + h15;
                                                it2 = it;
                                                c2 = c3;
                                                i20 = i31;
                                                i13 = i32;
                                                i15 = i33;
                                            } else {
                                                j4 = wh.g((String) value);
                                                int i35222222222 = j4 + h17 + i34;
                                                i8 += wh.i(i35222222222) + i35222222222 + h15;
                                                it2 = it;
                                                c2 = c3;
                                                i20 = i31;
                                                i13 = i32;
                                                i15 = i33;
                                            }
                                        case 9:
                                            j4 = ((m40) ((d0) value)).a(null);
                                            int i352222222222 = j4 + h17 + i34;
                                            i8 += wh.i(i352222222222) + i352222222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case RequestError.EVENT_TIMEOUT /* 10 */:
                                            size4 = ((m40) ((d0) value)).a(null);
                                            i10 = wh.i(size4);
                                            j4 = size4 + i10;
                                            int i3522222222222 = j4 + h17 + i34;
                                            i8 += wh.i(i3522222222222) + i3522222222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case RequestError.STOP_TRACKING /* 11 */:
                                            if (value instanceof ff) {
                                                size4 = ((ff) value).size();
                                                i10 = wh.i(size4);
                                            } else {
                                                size4 = ((byte[]) value).length;
                                                i10 = wh.i(size4);
                                            }
                                            j4 = size4 + i10;
                                            int i35222222222222 = j4 + h17 + i34;
                                            i8 += wh.i(i35222222222222) + i35222222222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case 12:
                                            j4 = wh.i(((Integer) value).intValue());
                                            int i352222222222222 = j4 + h17 + i34;
                                            i8 += wh.i(i352222222222222) + i352222222222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case 13:
                                            j4 = wh.j(((Integer) value).intValue());
                                            int i3522222222222222 = j4 + h17 + i34;
                                            i8 += wh.i(i3522222222222222) + i3522222222222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case 14:
                                            ((Integer) value).getClass();
                                            j4 = 4;
                                            int i35222222222222222 = j4 + h17 + i34;
                                            i8 += wh.i(i35222222222222222) + i35222222222222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case 15:
                                            ((Long) value).getClass();
                                            j4 = 8;
                                            int i352222222222222222 = j4 + h17 + i34;
                                            i8 += wh.i(i352222222222222222) + i352222222222222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            j4 = wh.i((intValue >> 31) ^ (intValue << 1));
                                            int i3522222222222222222 = j4 + h17 + i34;
                                            i8 += wh.i(i3522222222222222222) + i3522222222222222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            j4 = wh.j((longValue >> c3) ^ (longValue << i31));
                                            int i35222222222222222222 = j4 + h17 + i34;
                                            i8 += wh.i(i35222222222222222222) + i35222222222222222222 + h15;
                                            it2 = it;
                                            c2 = c3;
                                            i20 = i31;
                                            i13 = i32;
                                            i15 = i33;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    it = it2;
                                    ((Float) key).getClass();
                                    j3 = 4;
                                    int i342 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h172 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 2:
                                    it = it2;
                                    j3 = wh.j(((Long) key).longValue());
                                    int i3422 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h1722 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 3:
                                    it = it2;
                                    j3 = wh.j(((Long) key).longValue());
                                    int i34222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h17222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 4:
                                    it = it2;
                                    j3 = wh.j(((Integer) key).intValue());
                                    int i342222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h172222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case ry0.STRING_FIELD_NUMBER /* 5 */:
                                    it = it2;
                                    ((Long) key).getClass();
                                    j3 = 8;
                                    int i3422222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h1722222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                                    it = it2;
                                    ((Integer) key).getClass();
                                    j3 = 4;
                                    int i34222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h17222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                                    it = it2;
                                    ((Boolean) key).getClass();
                                    j3 = i31;
                                    int i342222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h172222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case ry0.BYTES_FIELD_NUMBER /* 8 */:
                                    it = it2;
                                    if (key instanceof ff) {
                                        size3 = ((ff) key).size();
                                        i9 = wh.i(size3);
                                        j3 = i9 + size3;
                                        int i3422222222 = j3 + h16;
                                        bq1Var = (bq1) i8Var.g;
                                        int h1722222222 = wh.h(2);
                                        if (bq1Var == yp1Var) {
                                        }
                                        switch (bq1Var.ordinal()) {
                                        }
                                    } else {
                                        j3 = wh.g((String) key);
                                        int i34222222222 = j3 + h16;
                                        bq1Var = (bq1) i8Var.g;
                                        int h17222222222 = wh.h(2);
                                        if (bq1Var == yp1Var) {
                                        }
                                        switch (bq1Var.ordinal()) {
                                        }
                                    }
                                case 9:
                                    it = it2;
                                    j3 = ((m40) ((d0) key)).a(null);
                                    int i342222222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h172222222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case RequestError.EVENT_TIMEOUT /* 10 */:
                                    it = it2;
                                    int a4 = ((m40) ((d0) key)).a(null);
                                    j3 = wh.i(a4) + a4;
                                    int i3422222222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h1722222222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case RequestError.STOP_TRACKING /* 11 */:
                                    it = it2;
                                    if (key instanceof ff) {
                                        size3 = ((ff) key).size();
                                        i9 = wh.i(size3);
                                    } else {
                                        size3 = ((byte[]) key).length;
                                        i9 = wh.i(size3);
                                    }
                                    j3 = i9 + size3;
                                    int i34222222222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h17222222222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 12:
                                    it = it2;
                                    j3 = wh.i(((Integer) key).intValue());
                                    int i342222222222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h172222222222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 13:
                                    it = it2;
                                    j3 = wh.j(((Integer) key).intValue());
                                    int i3422222222222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h1722222222222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    it = it2;
                                    j3 = 4;
                                    int i34222222222222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h17222222222222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    it = it2;
                                    j3 = 8;
                                    int i342222222222222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h172222222222222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    j3 = wh.i((intValue2 >> 31) ^ (intValue2 << 1));
                                    it = it2;
                                    int i3422222222222222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h1722222222222222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    j3 = wh.j((longValue2 << i31) ^ (longValue2 >> c3));
                                    it = it2;
                                    int i34222222222222222222 = j3 + h16;
                                    bq1Var = (bq1) i8Var.g;
                                    int h17222222222222222222 = wh.h(2);
                                    if (bq1Var == yp1Var) {
                                    }
                                    switch (bq1Var.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i3 = i13;
                    i4 = i15;
                    i16 += i8;
                    i13 = i3;
                    i15 = i4;
                    i14 += 3;
                    i12 = 1048575;
                case 51:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        h = wh.h(i17);
                        a = h + 8;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 52:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        h11 = wh.h(i17);
                        a = h11 + 4;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 53:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        long z = z(j7, m40Var2);
                        h12 = wh.h(i17);
                        j5 = wh.j(z);
                        i11 = j5 + h12;
                        i16 += i11;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 54:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        long z2 = z(j7, m40Var2);
                        h12 = wh.h(i17);
                        j5 = wh.j(z2);
                        i11 = j5 + h12;
                        i16 += i11;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 55:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        int y = y(j7, m40Var2);
                        h13 = wh.h(i17);
                        j6 = wh.j(y);
                        a = j6 + h13;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 56:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        h = wh.h(i17);
                        a = h + 8;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 57:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        h11 = wh.h(i17);
                        a = h11 + 4;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 58:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        a = wh.h(i17) + 1;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 59:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        Object object4 = unsafe.getObject(m40Var2, j7);
                        i16 = (object4 instanceof ff ? wh.f(i17, (ff) object4) : wh.g((String) object4) + wh.h(i17)) + i16;
                    }
                    i14 += 3;
                    i12 = 1048575;
                case 60:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        Object object5 = unsafe.getObject(m40Var2, j7);
                        u61 m4 = il0Var.m(i14);
                        Class cls21 = x61.a;
                        int h18 = wh.h(i17);
                        int a5 = ((d0) object5).a(m4);
                        i11 = wh.i(a5) + a5 + h18;
                        i16 += i11;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 61:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        a = wh.f(i17, (ff) unsafe.getObject(m40Var2, j7));
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 62:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        int y2 = y(j7, m40Var2);
                        h13 = wh.h(i17);
                        j6 = wh.i(y2);
                        a = j6 + h13;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 63:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        int y3 = y(j7, m40Var2);
                        h13 = wh.h(i17);
                        j6 = wh.j(y3);
                        a = j6 + h13;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 64:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        h11 = wh.h(i17);
                        a = h11 + 4;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 65:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        h = wh.h(i17);
                        a = h + 8;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 66:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        int y4 = y(j7, m40Var2);
                        h13 = wh.h(i17);
                        j6 = wh.i((y4 >> 31) ^ (y4 << 1));
                        a = j6 + h13;
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 67:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        long z3 = z(j7, m40Var2);
                        h12 = wh.h(i17);
                        j5 = wh.j((z3 << 1) ^ (z3 >> 63));
                        i11 = j5 + h12;
                        i16 += i11;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                case 68:
                    if (il0Var.q(i17, i14, m40Var2)) {
                        a = ((d0) unsafe.getObject(m40Var2, j7)).a(il0Var.m(i14)) + (wh.h(i17) * 2);
                        i16 += a;
                        i14 += 3;
                        i12 = 1048575;
                    } else {
                        i14 += 3;
                        i12 = 1048575;
                    }
                default:
                    i14 += 3;
                    i12 = 1048575;
            }
        }
    }

    @Override // defpackage.u61
    public final boolean e(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int L = L(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & L) == 0 || o(obj, i2, i, i3, i11)) {
                int K = K(L);
                if (K == 9 || K == 17) {
                    if (o(obj, i2, i, i3, i11)) {
                        if (!m(i2).e(ol1.c.h(L & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (K != 27) {
                        if (K == 60 || K == 68) {
                            if (q(i8, i2, obj)) {
                                if (!m(i2).e(ol1.c.h(L & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (K != 49) {
                            if (K != 50) {
                                continue;
                            } else {
                                Object h = ol1.c.h(L & 1048575, obj);
                                this.m.getClass();
                                ck0 ck0Var = (ck0) h;
                                if (ck0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((bq1) ((bk0) this.b[(i2 / 3) * 2]).a.g).d != cq1.m) {
                                        continue;
                                    } else {
                                        u61 u61Var = null;
                                        for (Object obj2 : ck0Var.values()) {
                                            if (u61Var == null) {
                                                u61Var = i01.c.a(obj2.getClass());
                                            }
                                            if (!u61Var.e(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) ol1.c.h(L & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        u61 m = m(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (m.e(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (defpackage.x61.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (defpackage.x61.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (defpackage.x61.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (defpackage.x61.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (defpackage.x61.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.u61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(m40 m40Var, m40 m40Var2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int L = L(i);
                long j = L & 1048575;
                switch (K(L)) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var2 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var3 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var4 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var5 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var6 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var7 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var8 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var9 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var10 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var11 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var12 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var13 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var14 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var15 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var16 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var17 = ol1.c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (j(m40Var, m40Var2, i)) {
                            nl1 nl1Var18 = ol1.c;
                            break;
                        }
                        z = false;
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
                        nl1 nl1Var19 = ol1.c;
                        z = x61.l(nl1Var19.h(j, m40Var), nl1Var19.h(j, m40Var2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        nl1 nl1Var20 = ol1.c;
                        z = x61.l(nl1Var20.h(j, m40Var), nl1Var20.h(j, m40Var2));
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
                        long j2 = iArr[i + 2] & 1048575;
                        nl1 nl1Var21 = ol1.c;
                        if (nl1Var21.f(j2, m40Var) == nl1Var21.f(j2, m40Var2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                this.l.getClass();
                if (m40Var.unknownFields.equals(m40Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.u61
    public final void g(Object obj, s40 s40Var) {
        s40Var.getClass();
        M(obj, s40Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.u61
    public final void h(java.lang.Object r19, defpackage.uh r20, defpackage.qw r21) {
        /*
            Method dump skipped, instructions count: 1922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il0.h(java.lang.Object, uh, qw):void");
    }

    @Override // defpackage.u61
    public final m40 i() {
        this.j.getClass();
        return ((m40) this.e).i();
    }

    public final boolean j(m40 m40Var, m40 m40Var2, int i) {
        return n(i, m40Var) == n(i, m40Var2);
    }

    public final void k(Object obj, int i, Object obj2) {
        int i2 = this.a[i];
        if (ol1.c.h(L(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[((i / 3) * 2) + 1] == null) {
            return;
        }
        af.c();
    }

    public final u61 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        u61 u61Var = (u61) objArr[i2];
        if (u61Var != null) {
            return u61Var;
        }
        u61 a = i01.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int L = L(i);
            long j2 = L & 1048575;
            switch (K(L)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (Double.doubleToRawLongBits(ol1.c.d(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(ol1.c.e(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (ol1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (ol1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (ol1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case ry0.STRING_FIELD_NUMBER /* 5 */:
                    if (ol1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (ol1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                    return ol1.c.c(j2, obj);
                case ry0.BYTES_FIELD_NUMBER /* 8 */:
                    Object h = ol1.c.h(j2, obj);
                    if (h instanceof String) {
                        return !((String) h).isEmpty();
                    }
                    if (h instanceof ff) {
                        return !ff.g.equals(h);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (ol1.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                case RequestError.EVENT_TIMEOUT /* 10 */:
                    return !ff.g.equals(ol1.c.h(j2, obj));
                case RequestError.STOP_TRACKING /* 11 */:
                    if (ol1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (ol1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (ol1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (ol1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (ol1.c.f(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (ol1.c.g(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (ol1.c.h(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & ol1.c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? n(i, obj) : (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return ol1.c.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r10.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i, Object obj2, qw qwVar, uh uhVar) {
        long L = L(i) & 1048575;
        Object h = ol1.c.h(L, obj);
        dk0 dk0Var = this.m;
        if (h == null) {
            dk0Var.getClass();
            h = ck0.e.b();
            ol1.o(L, obj, h);
        } else {
            dk0Var.getClass();
            if (!((ck0) h).d) {
                ck0 b = ck0.e.b();
                dk0.a(b, h);
                ol1.o(L, obj, b);
                h = b;
            }
        }
        dk0Var.getClass();
        ck0 ck0Var = (ck0) h;
        i8 i8Var = ((bk0) obj2).a;
        uhVar.y(2);
        th thVar = (th) uhVar.d;
        int e = thVar.e(thVar.v());
        Object obj3 = i8Var.h;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a = uhVar.a();
                if (a == Integer.MAX_VALUE || thVar.c()) {
                    break;
                }
                if (a == 1) {
                    obj4 = uhVar.k((bq1) i8Var.e, null, null);
                } else if (a != 2) {
                    try {
                        if (!uhVar.z()) {
                            throw new sa0("Unable to parse map entry.");
                        }
                    } catch (ra0 unused) {
                        if (!uhVar.z()) {
                            throw new sa0("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = uhVar.k((bq1) i8Var.g, obj3.getClass(), qwVar);
                }
            } catch (Throwable th) {
                thVar.d(e);
                throw th;
            }
        }
    }

    public final void s(Object obj, int i, Object obj2) {
        if (n(i, obj2)) {
            long L = L(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2);
            }
            u61 m = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    m40 i2 = m.i();
                    m.b(i2, object);
                    unsafe.putObject(obj, L, i2);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                m40 i3 = m.i();
                m.b(i3, object2);
                unsafe.putObject(obj, L, i3);
                object2 = i3;
            }
            m.b(object2, object);
        }
    }

    public final void t(Object obj, int i, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long L = L(i) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            u61 m = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    m40 i3 = m.i();
                    m.b(i3, object);
                    unsafe.putObject(obj, L, i3);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                m40 i4 = m.i();
                m.b(i4, object2);
                unsafe.putObject(obj, L, i4);
                object2 = i4;
            }
            m.b(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        u61 m = m(i);
        long L = L(i) & 1048575;
        if (!n(i, obj)) {
            return m.i();
        }
        Object object = o.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        m40 i2 = m.i();
        if (object != null) {
            m.b(i2, object);
        }
        return i2;
    }

    public final Object v(int i, int i2, Object obj) {
        u61 m = m(i2);
        if (!q(i, i2, obj)) {
            return m.i();
        }
        Object object = o.getObject(obj, L(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        m40 i3 = m.i();
        if (object != null) {
            m.b(i3, object);
        }
        return i3;
    }
}
