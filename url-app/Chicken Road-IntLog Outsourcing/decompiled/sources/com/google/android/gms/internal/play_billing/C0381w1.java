package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.impl.C0793l9;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381w1 implements D1 {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f5275j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f5276k = M1.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5277a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5278b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5279c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5280d;

    /* renamed from: e, reason: collision with root package name */
    public final S0 f5281e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f5282f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5283g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5284h;

    /* renamed from: i, reason: collision with root package name */
    public final C0328e1 f5285i;

    public C0381w1(int[] iArr, Object[] objArr, int i2, int i3, S0 s02, int[] iArr2, int i6, int i7, C0328e1 c0328e1, C0328e1 c0328e12) {
        this.f5277a = iArr;
        this.f5278b = objArr;
        this.f5279c = i2;
        this.f5280d = i3;
        this.f5282f = iArr2;
        this.f5283g = i6;
        this.f5284h = i7;
        this.f5285i = c0328e1;
        this.f5281e = s02;
    }

    public static Field E(String str, Class cls) {
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

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0334g1) {
            return ((AbstractC0334g1) obj).c();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0381w1 u(C1 c12, C0328e1 c0328e1, C0328e1 c0328e12) {
        int i2;
        int charAt;
        int charAt2;
        int i3;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr;
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
        char charAt10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        String str;
        int i25;
        int i26;
        int i27;
        Field E5;
        int i28;
        char charAt11;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field E6;
        Object obj2;
        Field E7;
        int i33;
        char charAt12;
        int i34;
        char charAt13;
        int i35;
        char charAt14;
        int i36;
        char charAt15;
        if (!(c12 instanceof C1)) {
            AbstractC0279e.m(c12);
            throw null;
        }
        String c2 = c12.c();
        int length = c2.length();
        char c6 = 55296;
        if (c2.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i2 = i37 + 1;
                if (c2.charAt(i37) < 55296) {
                    break;
                }
                i37 = i2;
            }
        } else {
            i2 = 1;
        }
        int i38 = i2 + 1;
        int charAt16 = c2.charAt(i2);
        if (charAt16 >= 55296) {
            int i39 = charAt16 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                charAt15 = c2.charAt(i38);
                if (charAt15 < 55296) {
                    break;
                }
                i39 |= (charAt15 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            charAt16 = i39 | (charAt15 << i40);
            i38 = i36;
        }
        if (charAt16 == 0) {
            i6 = 0;
            charAt = 0;
            charAt2 = 0;
            i3 = 0;
            i8 = 0;
            i7 = 0;
            iArr = f5275j;
            i9 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt17 = c2.charAt(i38);
            if (charAt17 >= 55296) {
                int i42 = charAt17 & 8191;
                int i43 = 13;
                while (true) {
                    i17 = i41 + 1;
                    charAt10 = c2.charAt(i41);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i42 |= (charAt10 & 8191) << i43;
                    i43 += 13;
                    i41 = i17;
                }
                charAt17 = i42 | (charAt10 << i43);
                i41 = i17;
            }
            int i44 = i41 + 1;
            int charAt18 = c2.charAt(i41);
            if (charAt18 >= 55296) {
                int i45 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i16 = i44 + 1;
                    charAt9 = c2.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i16;
                }
                charAt18 = i45 | (charAt9 << i46);
                i44 = i16;
            }
            int i47 = i44 + 1;
            int charAt19 = c2.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i15 = i47 + 1;
                    charAt8 = c2.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i15;
                }
                charAt19 = i48 | (charAt8 << i49);
                i47 = i15;
            }
            int i50 = i47 + 1;
            int charAt20 = c2.charAt(i47);
            if (charAt20 >= 55296) {
                int i51 = charAt20 & 8191;
                int i52 = 13;
                while (true) {
                    i14 = i50 + 1;
                    charAt7 = c2.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i14;
                }
                charAt20 = i51 | (charAt7 << i52);
                i50 = i14;
            }
            int i53 = i50 + 1;
            charAt = c2.charAt(i50);
            if (charAt >= 55296) {
                int i54 = charAt & 8191;
                int i55 = 13;
                while (true) {
                    i13 = i53 + 1;
                    charAt6 = c2.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i13;
                }
                charAt = i54 | (charAt6 << i55);
                i53 = i13;
            }
            int i56 = i53 + 1;
            charAt2 = c2.charAt(i53);
            if (charAt2 >= 55296) {
                int i57 = charAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i12 = i56 + 1;
                    charAt5 = c2.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i12;
                }
                charAt2 = i57 | (charAt5 << i58);
                i56 = i12;
            }
            int i59 = i56 + 1;
            int charAt21 = c2.charAt(i56);
            if (charAt21 >= 55296) {
                int i60 = charAt21 & 8191;
                int i61 = 13;
                while (true) {
                    i11 = i59 + 1;
                    charAt4 = c2.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i11;
                }
                charAt21 = i60 | (charAt4 << i61);
                i59 = i11;
            }
            int i62 = i59 + 1;
            int charAt22 = c2.charAt(i59);
            if (charAt22 >= 55296) {
                int i63 = charAt22 & 8191;
                int i64 = 13;
                while (true) {
                    i10 = i62 + 1;
                    charAt3 = c2.charAt(i62);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i10;
                }
                charAt22 = i63 | (charAt3 << i64);
                i62 = i10;
            }
            int i65 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[charAt22 + charAt2 + charAt21];
            i3 = charAt19;
            i6 = i65;
            i7 = charAt22;
            i8 = charAt20;
            i9 = charAt17;
            i38 = i62;
            iArr = iArr2;
        }
        Unsafe unsafe = f5276k;
        Object[] d6 = c12.d();
        Class<?> cls = c12.a().getClass();
        int i66 = i7 + charAt2;
        int i67 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i67];
        int i68 = i7;
        int i69 = i66;
        int i70 = 0;
        int i71 = 0;
        while (i38 < length) {
            int i72 = i38 + 1;
            int charAt23 = c2.charAt(i38);
            if (charAt23 >= c6) {
                int i73 = charAt23 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i35 = i74 + 1;
                    charAt14 = c2.charAt(i74);
                    if (charAt14 < c6) {
                        break;
                    }
                    i73 |= (charAt14 & 8191) << i75;
                    i75 += 13;
                    i74 = i35;
                }
                charAt23 = i73 | (charAt14 << i75);
                i18 = i35;
            } else {
                i18 = i72;
            }
            int i76 = i18 + 1;
            int charAt24 = c2.charAt(i18);
            if (charAt24 >= c6) {
                int i77 = charAt24 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i34 = i78 + 1;
                    charAt13 = c2.charAt(i78);
                    if (charAt13 < c6) {
                        break;
                    }
                    i77 |= (charAt13 & 8191) << i79;
                    i79 += 13;
                    i78 = i34;
                }
                charAt24 = i77 | (charAt13 << i79);
                i19 = i34;
            } else {
                i19 = i76;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i70] = i71;
                i70++;
            }
            int i80 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i81 = charAt24 & 2048;
            int i82 = length;
            if (i80 >= 51) {
                int i83 = i19 + 1;
                int charAt25 = c2.charAt(i19);
                char c7 = 55296;
                if (charAt25 >= 55296) {
                    int i84 = 13;
                    int i85 = charAt25 & 8191;
                    int i86 = i83;
                    while (true) {
                        i33 = i86 + 1;
                        charAt12 = c2.charAt(i86);
                        if (charAt12 < c7) {
                            break;
                        }
                        i85 |= (charAt12 & 8191) << i84;
                        i84 += 13;
                        i86 = i33;
                        c7 = 55296;
                    }
                    charAt25 = i85 | (charAt12 << i84);
                    i31 = i33;
                } else {
                    i31 = i83;
                }
                int i87 = i31;
                int i88 = i80 - 51;
                i21 = i8;
                if (i88 == 9 || i88 == 17) {
                    i32 = i6 + 1;
                    int i89 = i71 / 3;
                    objArr[i89 + i89 + 1] = d6[i6];
                } else {
                    if (i88 == 12) {
                        if (c12.b() == 1 || i81 != 0) {
                            i32 = i6 + 1;
                            int i90 = i71 / 3;
                            objArr[i90 + i90 + 1] = d6[i6];
                        } else {
                            i81 = 0;
                        }
                    }
                    int i91 = charAt25 + charAt25;
                    obj = d6[i91];
                    if (obj instanceof Field) {
                        E6 = E((String) obj, cls);
                        d6[i91] = E6;
                    } else {
                        E6 = (Field) obj;
                    }
                    i20 = i3;
                    i27 = (int) unsafe.objectFieldOffset(E6);
                    int i92 = i91 + 1;
                    obj2 = d6[i92];
                    if (obj2 instanceof Field) {
                        E7 = E((String) obj2, cls);
                        d6[i92] = E7;
                    } else {
                        E7 = (Field) obj2;
                    }
                    i24 = i81;
                    str = c2;
                    i22 = charAt23;
                    i23 = (int) unsafe.objectFieldOffset(E7);
                    i38 = i87;
                    i26 = 0;
                }
                i6 = i32;
                int i912 = charAt25 + charAt25;
                obj = d6[i912];
                if (obj instanceof Field) {
                }
                i20 = i3;
                i27 = (int) unsafe.objectFieldOffset(E6);
                int i922 = i912 + 1;
                obj2 = d6[i922];
                if (obj2 instanceof Field) {
                }
                i24 = i81;
                str = c2;
                i22 = charAt23;
                i23 = (int) unsafe.objectFieldOffset(E7);
                i38 = i87;
                i26 = 0;
            } else {
                i20 = i3;
                i21 = i8;
                int i93 = i6 + 1;
                Field E8 = E((String) d6[i6], cls);
                if (i80 == 9 || i80 == 17) {
                    i22 = charAt23;
                    int i94 = i71 / 3;
                    objArr[i94 + i94 + 1] = E8.getType();
                } else {
                    if (i80 == 27) {
                        i22 = charAt23;
                        i29 = 1;
                        i30 = i6 + 2;
                    } else if (i80 == 49) {
                        i30 = i6 + 2;
                        i22 = charAt23;
                        i29 = 1;
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        i22 = charAt23;
                        if (c12.b() == 1 || i81 != 0) {
                            i30 = i6 + 2;
                            int i95 = i71 / 3;
                            objArr[i95 + i95 + 1] = d6[i93];
                            i93 = i30;
                        } else {
                            i81 = 0;
                        }
                    } else {
                        if (i80 == 50) {
                            int i96 = i6 + 2;
                            int i97 = i68 + 1;
                            iArr[i68] = i71;
                            int i98 = i71 / 3;
                            int i99 = i98 + i98;
                            objArr[i99] = d6[i93];
                            if (i81 != 0) {
                                i93 = i6 + 3;
                                objArr[i99 + 1] = d6[i96];
                                i68 = i97;
                            } else {
                                i93 = i96;
                                i68 = i97;
                                i81 = 0;
                            }
                        }
                        i22 = charAt23;
                    }
                    int i100 = i71 / 3;
                    objArr[i100 + i100 + i29] = d6[i93];
                    i93 = i30;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(E8);
                i23 = 1048575;
                if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) == 0 || i80 > 17) {
                    i24 = i81;
                    str = c2;
                    i25 = i19;
                    i26 = 0;
                } else {
                    i25 = i19 + 1;
                    int charAt26 = c2.charAt(i19);
                    if (charAt26 >= 55296) {
                        int i101 = charAt26 & 8191;
                        int i102 = 13;
                        while (true) {
                            i28 = i25 + 1;
                            charAt11 = c2.charAt(i25);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i101 |= (charAt11 & 8191) << i102;
                            i102 += 13;
                            i25 = i28;
                        }
                        charAt26 = i101 | (charAt11 << i102);
                        i25 = i28;
                    }
                    int i103 = (charAt26 / 32) + i9 + i9;
                    Object obj3 = d6[i103];
                    if (obj3 instanceof Field) {
                        E5 = (Field) obj3;
                    } else {
                        E5 = E((String) obj3, cls);
                        d6[i103] = E5;
                    }
                    i24 = i81;
                    str = c2;
                    i26 = charAt26 % 32;
                    i23 = (int) unsafe.objectFieldOffset(E5);
                }
                if (i80 >= 18 && i80 <= 49) {
                    iArr[i69] = objectFieldOffset;
                    i69++;
                }
                i38 = i25;
                i6 = i93;
                i27 = objectFieldOffset;
            }
            int i104 = i71 + 1;
            iArr3[i71] = i22;
            int i105 = i71 + 2;
            iArr3[i104] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i24 != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20) | i27;
            i71 += 3;
            iArr3[i105] = (i26 << 20) | i23;
            c2 = str;
            length = i82;
            i8 = i21;
            i3 = i20;
            c6 = 55296;
        }
        return new C0381w1(iArr3, objArr, i3, i8, c12.a(), iArr, i7, i66, c0328e1, c0328e12);
    }

    public static int v(long j2, Object obj) {
        return ((Integer) M1.i(j2, obj)).intValue();
    }

    public static int x(int i2) {
        return (i2 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long z(long j2, Object obj) {
        return ((Long) M1.i(j2, obj)).longValue();
    }

    public final InterfaceC0340i1 A(int i2) {
        int i3 = i2 / 3;
        return (InterfaceC0340i1) this.f5278b[i3 + i3 + 1];
    }

    public final D1 B(int i2) {
        int i3 = i2 / 3;
        int i6 = i3 + i3;
        Object[] objArr = this.f5278b;
        D1 d12 = (D1) objArr[i6];
        if (d12 != null) {
            return d12;
        }
        D1 a6 = A1.f5019c.a((Class) objArr[i6 + 1]);
        objArr[i6] = a6;
        return a6;
    }

    public final Object C(int i2, Object obj) {
        D1 B5 = B(i2);
        int y5 = y(i2) & 1048575;
        if (!p(i2, obj)) {
            return B5.f();
        }
        Object object = f5276k.getObject(obj, y5);
        if (r(object)) {
            return object;
        }
        AbstractC0334g1 f3 = B5.f();
        if (object != null) {
            B5.d(f3, object);
        }
        return f3;
    }

    public final Object D(int i2, int i3, Object obj) {
        D1 B5 = B(i3);
        if (!s(i2, i3, obj)) {
            return B5.f();
        }
        Object object = f5276k.getObject(obj, y(i3) & 1048575);
        if (r(object)) {
            return object;
        }
        AbstractC0334g1 f3 = B5.f();
        if (object != null) {
            B5.d(f3, object);
        }
        return f3;
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void a(Object obj) {
        if (!r(obj)) {
            return;
        }
        int i2 = 0;
        if (obj instanceof AbstractC0334g1) {
            AbstractC0334g1 abstractC0334g1 = (AbstractC0334g1) obj;
            abstractC0334g1.l();
            abstractC0334g1.zza = 0;
            abstractC0334g1.j();
        }
        while (true) {
            int[] iArr = this.f5277a;
            if (i2 >= iArr.length) {
                this.f5285i.getClass();
                C0328e1.d(obj);
                return;
            }
            int y5 = y(i2);
            int i3 = 1048575 & y5;
            int x5 = x(y5);
            long j2 = i3;
            if (x5 != 9) {
                if (x5 != 60 && x5 != 68) {
                    switch (x5) {
                        case 18:
                        case C0793l9.f8681C /* 19 */:
                        case C0793l9.f8682D /* 20 */:
                        case C0793l9.f8683E /* 21 */:
                        case 22:
                        case 23:
                        case 24:
                        case C0793l9.f8684F /* 25 */:
                        case 26:
                        case C0793l9.f8686H /* 27 */:
                        case 28:
                        case C0793l9.f8687I /* 29 */:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case C0793l9.f8688J /* 35 */:
                        case 36:
                        case 37:
                        case C0793l9.f8689K /* 38 */:
                        case 39:
                        case C0793l9.f8690L /* 40 */:
                        case 41:
                        case C0793l9.f8691M /* 42 */:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            ((T0) ((InterfaceC0346k1) M1.i(j2, obj))).c();
                            break;
                        case 50:
                            Unsafe unsafe = f5276k;
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((C0369s1) object).d();
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (s(iArr[i2], i2, obj)) {
                    B(i2).a(f5276k.getObject(obj, j2));
                }
                i2 += 3;
            }
            if (p(i2, obj)) {
                B(i2).a(f5276k.getObject(obj, j2));
            }
            i2 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void b(Object obj, byte[] bArr, int i2, int i3, V0 v02) {
        t(obj, bArr, i2, i3, 0, v02);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final int c(AbstractC0334g1 abstractC0334g1) {
        int i2;
        int i3;
        int i6;
        int n02;
        int V5;
        int n03;
        int d6;
        int n04;
        int m6;
        int n05;
        int size;
        int q5;
        int n06;
        int n07;
        int n08;
        int i7;
        Unsafe unsafe = f5276k;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f5277a;
            if (i11 >= iArr.length) {
                return abstractC0334g1.zzc.a() + i12;
            }
            int y5 = y(i11);
            int x5 = x(y5);
            int i13 = iArr[i11];
            int i14 = iArr[i11 + 2];
            int i15 = i14 & i8;
            if (x5 <= 17) {
                if (i15 != i9) {
                    i10 = i15 == i8 ? 0 : unsafe.getInt(abstractC0334g1, i15);
                    i9 = i15;
                }
                i2 = i9;
                i3 = i10;
                i6 = 1 << (i14 >>> 20);
            } else {
                i2 = i9;
                i3 = i10;
                i6 = 0;
            }
            int i16 = y5 & i8;
            if (x5 >= EnumC0322c1.f5158b.a()) {
                EnumC0322c1.f5159c.getClass();
            }
            long j2 = i16;
            switch (x5) {
                case 0:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        i12 = AbstractC0279e.c(i13 << 3, 8, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 1:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        i12 = AbstractC0279e.c(i13 << 3, 4, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 2:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        long j6 = unsafe.getLong(abstractC0334g1, j2);
                        n02 = Z0.n0(i13 << 3);
                        V5 = Z0.V(j6);
                        i12 += V5 + n02;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 3:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        long j7 = unsafe.getLong(abstractC0334g1, j2);
                        n02 = Z0.n0(i13 << 3);
                        V5 = Z0.V(j7);
                        i12 += V5 + n02;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 4:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        long j8 = unsafe.getInt(abstractC0334g1, j2);
                        n02 = Z0.n0(i13 << 3);
                        V5 = Z0.V(j8);
                        i12 += V5 + n02;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 5:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        i12 = AbstractC0279e.c(i13 << 3, 8, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 6:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        i12 = AbstractC0279e.c(i13 << 3, 4, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 7:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        i12 = AbstractC0279e.c(i13 << 3, 1, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 8:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        int i17 = i13 << 3;
                        Object object = unsafe.getObject(abstractC0334g1, j2);
                        if (object instanceof Y0) {
                            n03 = Z0.n0(i17);
                            d6 = ((Y0) object).d();
                            n04 = Z0.n0(d6);
                            i12 += n04 + d6 + n03;
                            i11 += 3;
                            i9 = i2;
                            i10 = i3;
                            i8 = 1048575;
                        } else {
                            n02 = Z0.n0(i17);
                            V5 = Z0.m0((String) object);
                            i12 += V5 + n02;
                            i11 += 3;
                            i9 = i2;
                            i10 = i3;
                            i8 = 1048575;
                        }
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 9:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        m6 = E1.m(i13, unsafe.getObject(abstractC0334g1, j2), B(i11));
                        i12 += m6;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 10:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        Y0 y02 = (Y0) unsafe.getObject(abstractC0334g1, j2);
                        n03 = Z0.n0(i13 << 3);
                        d6 = y02.d();
                        n04 = Z0.n0(d6);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 11:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        i12 = AbstractC0279e.c(unsafe.getInt(abstractC0334g1, j2), Z0.n0(i13 << 3), i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 12:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        long j9 = unsafe.getInt(abstractC0334g1, j2);
                        n02 = Z0.n0(i13 << 3);
                        V5 = Z0.V(j9);
                        i12 += V5 + n02;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 13:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        i12 = AbstractC0279e.c(i13 << 3, 4, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 14:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        i12 = AbstractC0279e.c(i13 << 3, 8, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 15:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        int i18 = unsafe.getInt(abstractC0334g1, j2);
                        i12 = AbstractC0279e.c((i18 >> 31) ^ (i18 + i18), Z0.n0(i13 << 3), i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 16:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        long j10 = unsafe.getLong(abstractC0334g1, j2);
                        n02 = Z0.n0(i13 << 3);
                        V5 = Z0.V((j10 >> 63) ^ (j10 + j10));
                        i12 += V5 + n02;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 17:
                    if (q(abstractC0334g1, i11, i2, i3, i6)) {
                        m6 = Z0.k0(i13, (S0) unsafe.getObject(abstractC0334g1, j2), B(i11));
                        i12 += m6;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 18:
                    m6 = E1.i(i13, (List) unsafe.getObject(abstractC0334g1, j2));
                    i12 += m6;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case C0793l9.f8681C /* 19 */:
                    m6 = E1.g(i13, (List) unsafe.getObject(abstractC0334g1, j2));
                    i12 += m6;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case C0793l9.f8682D /* 20 */:
                    List list = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e1 = E1.f5043a;
                    if (list.size() != 0) {
                        n05 = (Z0.n0(i13 << 3) * list.size()) + E1.l(list);
                        i12 += n05;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                    n05 = 0;
                    i12 += n05;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case C0793l9.f8683E /* 21 */:
                    List list2 = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e12 = E1.f5043a;
                    size = list2.size();
                    if (size != 0) {
                        q5 = E1.q(list2);
                        n06 = Z0.n0(i13 << 3);
                        n07 = (n06 * size) + q5;
                        i12 += n07;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                    n07 = 0;
                    i12 += n07;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e13 = E1.f5043a;
                    size = list3.size();
                    if (size != 0) {
                        q5 = E1.k(list3);
                        n06 = Z0.n0(i13 << 3);
                        n07 = (n06 * size) + q5;
                        i12 += n07;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                    n07 = 0;
                    i12 += n07;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 23:
                    m6 = E1.i(i13, (List) unsafe.getObject(abstractC0334g1, j2));
                    i12 += m6;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 24:
                    m6 = E1.g(i13, (List) unsafe.getObject(abstractC0334g1, j2));
                    i12 += m6;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case C0793l9.f8684F /* 25 */:
                    List list4 = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e14 = E1.f5043a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        n05 = (Z0.n0(i13 << 3) + 1) * size2;
                        i12 += n05;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                    n05 = 0;
                    i12 += n05;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e15 = E1.f5043a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        n07 = Z0.n0(i13 << 3) * size3;
                        for (int i19 = 0; i19 < size3; i19++) {
                            Object obj = list5.get(i19);
                            if (obj instanceof Y0) {
                                int d7 = ((Y0) obj).d();
                                n07 = AbstractC0279e.c(d7, d7, n07);
                            } else {
                                n07 = Z0.m0((String) obj) + n07;
                            }
                        }
                        i12 += n07;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                    n07 = 0;
                    i12 += n07;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case C0793l9.f8686H /* 27 */:
                    List list6 = (List) unsafe.getObject(abstractC0334g1, j2);
                    D1 B5 = B(i11);
                    C0328e1 c0328e16 = E1.f5043a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        n08 = 0;
                    } else {
                        n08 = Z0.n0(i13 << 3) * size4;
                        for (int i20 = 0; i20 < size4; i20++) {
                            n08 += Z0.l0((S0) list6.get(i20), B5);
                        }
                    }
                    i12 += n08;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e17 = E1.f5043a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        n07 = Z0.n0(i13 << 3) * size5;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int d8 = ((Y0) list7.get(i21)).d();
                            n07 = AbstractC0279e.c(d8, d8, n07);
                        }
                        i12 += n07;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                    n07 = 0;
                    i12 += n07;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case C0793l9.f8687I /* 29 */:
                    List list8 = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e18 = E1.f5043a;
                    size = list8.size();
                    if (size != 0) {
                        q5 = E1.p(list8);
                        n06 = Z0.n0(i13 << 3);
                        n07 = (n06 * size) + q5;
                        i12 += n07;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                    n07 = 0;
                    i12 += n07;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e19 = E1.f5043a;
                    size = list9.size();
                    if (size != 0) {
                        q5 = E1.f(list9);
                        n06 = Z0.n0(i13 << 3);
                        n07 = (n06 * size) + q5;
                        i12 += n07;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                    n07 = 0;
                    i12 += n07;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 31:
                    m6 = E1.g(i13, (List) unsafe.getObject(abstractC0334g1, j2));
                    i12 += m6;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 32:
                    m6 = E1.i(i13, (List) unsafe.getObject(abstractC0334g1, j2));
                    i12 += m6;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e110 = E1.f5043a;
                    size = list10.size();
                    if (size != 0) {
                        q5 = E1.n(list10);
                        n06 = Z0.n0(i13 << 3);
                        n07 = (n06 * size) + q5;
                        i12 += n07;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                    n07 = 0;
                    i12 += n07;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e111 = E1.f5043a;
                    size = list11.size();
                    if (size != 0) {
                        q5 = E1.o(list11);
                        n06 = Z0.n0(i13 << 3);
                        n07 = (n06 * size) + q5;
                        i12 += n07;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                    n07 = 0;
                    i12 += n07;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case C0793l9.f8688J /* 35 */:
                    n03 = E1.j((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 36:
                    n03 = E1.h((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 37:
                    n03 = E1.l((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case C0793l9.f8689K /* 38 */:
                    n03 = E1.q((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 39:
                    n03 = E1.k((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case C0793l9.f8690L /* 40 */:
                    n03 = E1.j((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 41:
                    n03 = E1.h((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case C0793l9.f8691M /* 42 */:
                    List list12 = (List) unsafe.getObject(abstractC0334g1, j2);
                    C0328e1 c0328e112 = E1.f5043a;
                    n03 = list12.size();
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 43:
                    n03 = E1.p((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 44:
                    n03 = E1.f((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 45:
                    n03 = E1.h((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 46:
                    n03 = E1.j((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 47:
                    n03 = E1.n((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 48:
                    n03 = E1.o((List) unsafe.getObject(abstractC0334g1, j2));
                    if (n03 > 0) {
                        d6 = Z0.n0(i13 << 3);
                        n04 = Z0.n0(n03);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(abstractC0334g1, j2);
                    D1 B6 = B(i11);
                    C0328e1 c0328e113 = E1.f5043a;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 0;
                        for (int i22 = 0; i22 < size6; i22++) {
                            i7 += Z0.k0(i13, (S0) list13.get(i22), B6);
                        }
                    }
                    i12 += i7;
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 50:
                    int i23 = i11 / 3;
                    C0369s1 c0369s1 = (C0369s1) unsafe.getObject(abstractC0334g1, j2);
                    AbstractC0279e.o(this.f5278b[i23 + i23]);
                    if (c0369s1.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = c0369s1.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 51:
                    if (s(i13, i11, abstractC0334g1)) {
                        i12 = AbstractC0279e.c(i13 << 3, 8, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 52:
                    if (s(i13, i11, abstractC0334g1)) {
                        i12 = AbstractC0279e.c(i13 << 3, 4, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 53:
                    if (s(i13, i11, abstractC0334g1)) {
                        long z = z(j2, abstractC0334g1);
                        n02 = Z0.n0(i13 << 3);
                        V5 = Z0.V(z);
                        i12 += V5 + n02;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 54:
                    if (s(i13, i11, abstractC0334g1)) {
                        long z5 = z(j2, abstractC0334g1);
                        n02 = Z0.n0(i13 << 3);
                        V5 = Z0.V(z5);
                        i12 += V5 + n02;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 55:
                    if (s(i13, i11, abstractC0334g1)) {
                        long v4 = v(j2, abstractC0334g1);
                        n02 = Z0.n0(i13 << 3);
                        V5 = Z0.V(v4);
                        i12 += V5 + n02;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 56:
                    if (s(i13, i11, abstractC0334g1)) {
                        i12 = AbstractC0279e.c(i13 << 3, 8, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 57:
                    if (s(i13, i11, abstractC0334g1)) {
                        i12 = AbstractC0279e.c(i13 << 3, 4, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 58:
                    if (s(i13, i11, abstractC0334g1)) {
                        i12 = AbstractC0279e.c(i13 << 3, 1, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 59:
                    if (s(i13, i11, abstractC0334g1)) {
                        int i24 = i13 << 3;
                        Object object2 = unsafe.getObject(abstractC0334g1, j2);
                        if (object2 instanceof Y0) {
                            n03 = Z0.n0(i24);
                            d6 = ((Y0) object2).d();
                            n04 = Z0.n0(d6);
                            i12 += n04 + d6 + n03;
                            i11 += 3;
                            i9 = i2;
                            i10 = i3;
                            i8 = 1048575;
                        } else {
                            n02 = Z0.n0(i24);
                            V5 = Z0.m0((String) object2);
                            i12 += V5 + n02;
                            i11 += 3;
                            i9 = i2;
                            i10 = i3;
                            i8 = 1048575;
                        }
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 60:
                    if (s(i13, i11, abstractC0334g1)) {
                        m6 = E1.m(i13, unsafe.getObject(abstractC0334g1, j2), B(i11));
                        i12 += m6;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 61:
                    if (s(i13, i11, abstractC0334g1)) {
                        Y0 y03 = (Y0) unsafe.getObject(abstractC0334g1, j2);
                        n03 = Z0.n0(i13 << 3);
                        d6 = y03.d();
                        n04 = Z0.n0(d6);
                        i12 += n04 + d6 + n03;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 62:
                    if (s(i13, i11, abstractC0334g1)) {
                        i12 = AbstractC0279e.c(v(j2, abstractC0334g1), Z0.n0(i13 << 3), i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 63:
                    if (s(i13, i11, abstractC0334g1)) {
                        long v5 = v(j2, abstractC0334g1);
                        n02 = Z0.n0(i13 << 3);
                        V5 = Z0.V(v5);
                        i12 += V5 + n02;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 64:
                    if (s(i13, i11, abstractC0334g1)) {
                        i12 = AbstractC0279e.c(i13 << 3, 4, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 65:
                    if (s(i13, i11, abstractC0334g1)) {
                        i12 = AbstractC0279e.c(i13 << 3, 8, i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 66:
                    if (s(i13, i11, abstractC0334g1)) {
                        int v6 = v(j2, abstractC0334g1);
                        i12 = AbstractC0279e.c((v6 >> 31) ^ (v6 + v6), Z0.n0(i13 << 3), i12);
                    }
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
                case 67:
                    if (s(i13, i11, abstractC0334g1)) {
                        long z6 = z(j2, abstractC0334g1);
                        n02 = Z0.n0(i13 << 3);
                        V5 = Z0.V((z6 >> 63) ^ (z6 + z6));
                        i12 += V5 + n02;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                case 68:
                    if (s(i13, i11, abstractC0334g1)) {
                        m6 = Z0.k0(i13, (S0) unsafe.getObject(abstractC0334g1, j2), B(i11));
                        i12 += m6;
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    } else {
                        i11 += 3;
                        i9 = i2;
                        i10 = i3;
                        i8 = 1048575;
                    }
                default:
                    i11 += 3;
                    i9 = i2;
                    i10 = i3;
                    i8 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final void d(Object obj, Object obj2) {
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f5277a;
            if (i2 >= iArr.length) {
                E1.s(obj, obj2);
                return;
            }
            int y5 = y(i2);
            int i3 = y5 & 1048575;
            int x5 = x(y5);
            int i6 = iArr[i2];
            long j2 = i3;
            switch (x5) {
                case 0:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.l(obj, j2, M1.f5081c.a(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 1:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.m(obj, j2, M1.f5081c.b(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 2:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.o(obj, j2, M1.g(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 3:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.o(obj, j2, M1.g(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 4:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.n(obj, j2, M1.f(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 5:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.o(obj, j2, M1.g(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 6:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.n(obj, j2, M1.f(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 7:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.k(obj, j2, M1.f5081c.g(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 8:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.p(j2, obj, M1.i(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 9:
                    j(obj, i2, obj2);
                    break;
                case 10:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.p(j2, obj, M1.i(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 11:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.n(obj, j2, M1.f(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 12:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.n(obj, j2, M1.f(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 13:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.n(obj, j2, M1.f(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 14:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.o(obj, j2, M1.g(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 15:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.n(obj, j2, M1.f(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 16:
                    if (!p(i2, obj2)) {
                        break;
                    } else {
                        M1.o(obj, j2, M1.g(j2, obj2));
                        l(i2, obj);
                        break;
                    }
                case 17:
                    j(obj, i2, obj2);
                    break;
                case 18:
                case C0793l9.f8681C /* 19 */:
                case C0793l9.f8682D /* 20 */:
                case C0793l9.f8683E /* 21 */:
                case 22:
                case 23:
                case 24:
                case C0793l9.f8684F /* 25 */:
                case 26:
                case C0793l9.f8686H /* 27 */:
                case 28:
                case C0793l9.f8687I /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case C0793l9.f8688J /* 35 */:
                case 36:
                case 37:
                case C0793l9.f8689K /* 38 */:
                case 39:
                case C0793l9.f8690L /* 40 */:
                case 41:
                case C0793l9.f8691M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    InterfaceC0346k1 interfaceC0346k1 = (InterfaceC0346k1) M1.i(j2, obj);
                    InterfaceC0346k1 interfaceC0346k12 = (InterfaceC0346k1) M1.i(j2, obj2);
                    int size = interfaceC0346k1.size();
                    int size2 = interfaceC0346k12.size();
                    if (size > 0 && size2 > 0) {
                        if (!((T0) interfaceC0346k1).f5104a) {
                            interfaceC0346k1 = interfaceC0346k1.a(size2 + size);
                        }
                        interfaceC0346k1.addAll(interfaceC0346k12);
                    }
                    if (size > 0) {
                        interfaceC0346k12 = interfaceC0346k1;
                    }
                    M1.p(j2, obj, interfaceC0346k12);
                    break;
                case 50:
                    C0328e1 c0328e1 = E1.f5043a;
                    M1.p(j2, obj, C0328e1.c(M1.i(j2, obj), M1.i(j2, obj2)));
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
                    if (!s(i6, i2, obj2)) {
                        break;
                    } else {
                        M1.p(j2, obj, M1.i(j2, obj2));
                        M1.n(obj, iArr[i2 + 2] & 1048575, i6);
                        break;
                    }
                case 60:
                    k(obj, i2, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!s(i6, i2, obj2)) {
                        break;
                    } else {
                        M1.p(j2, obj, M1.i(j2, obj2));
                        M1.n(obj, iArr[i2 + 2] & 1048575, i6);
                        break;
                    }
                case 68:
                    k(obj, i2, obj2);
                    break;
            }
            i2 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    @Override // com.google.android.gms.internal.play_billing.D1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(AbstractC0334g1 abstractC0334g1) {
        int i2;
        long doubleToLongBits;
        int i3;
        int floatToIntBits;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f5277a;
            if (i8 >= iArr.length) {
                return abstractC0334g1.zzc.hashCode() + (i9 * 53);
            }
            int y5 = y(i8);
            int i10 = 1048575 & y5;
            int x5 = x(y5);
            int i11 = iArr[i8];
            long j2 = i10;
            int i12 = 1237;
            int i13 = 37;
            switch (x5) {
                case 0:
                    i2 = i9 * 53;
                    doubleToLongBits = Double.doubleToLongBits(M1.f5081c.a(j2, abstractC0334g1));
                    Charset charset = AbstractC0349l1.f5205a;
                    i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i3 = i9 * 53;
                    floatToIntBits = Float.floatToIntBits(M1.f5081c.b(j2, abstractC0334g1));
                    i9 = floatToIntBits + i3;
                    break;
                case 2:
                    i2 = i9 * 53;
                    doubleToLongBits = M1.g(j2, abstractC0334g1);
                    Charset charset2 = AbstractC0349l1.f5205a;
                    i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i2 = i9 * 53;
                    doubleToLongBits = M1.g(j2, abstractC0334g1);
                    Charset charset3 = AbstractC0349l1.f5205a;
                    i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i3 = i9 * 53;
                    floatToIntBits = M1.f(j2, abstractC0334g1);
                    i9 = floatToIntBits + i3;
                    break;
                case 5:
                    i2 = i9 * 53;
                    doubleToLongBits = M1.g(j2, abstractC0334g1);
                    Charset charset4 = AbstractC0349l1.f5205a;
                    i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i3 = i9 * 53;
                    floatToIntBits = M1.f(j2, abstractC0334g1);
                    i9 = floatToIntBits + i3;
                    break;
                case 7:
                    i6 = i9 * 53;
                    boolean g6 = M1.f5081c.g(j2, abstractC0334g1);
                    Charset charset5 = AbstractC0349l1.f5205a;
                    break;
                case 8:
                    i3 = i9 * 53;
                    floatToIntBits = ((String) M1.i(j2, abstractC0334g1)).hashCode();
                    i9 = floatToIntBits + i3;
                    break;
                case 9:
                    i7 = i9 * 53;
                    Object i14 = M1.i(j2, abstractC0334g1);
                    if (i14 != null) {
                        i13 = i14.hashCode();
                    }
                    i9 = i7 + i13;
                    break;
                case 10:
                    i3 = i9 * 53;
                    floatToIntBits = M1.i(j2, abstractC0334g1).hashCode();
                    i9 = floatToIntBits + i3;
                    break;
                case 11:
                    i3 = i9 * 53;
                    floatToIntBits = M1.f(j2, abstractC0334g1);
                    i9 = floatToIntBits + i3;
                    break;
                case 12:
                    i3 = i9 * 53;
                    floatToIntBits = M1.f(j2, abstractC0334g1);
                    i9 = floatToIntBits + i3;
                    break;
                case 13:
                    i3 = i9 * 53;
                    floatToIntBits = M1.f(j2, abstractC0334g1);
                    i9 = floatToIntBits + i3;
                    break;
                case 14:
                    i2 = i9 * 53;
                    doubleToLongBits = M1.g(j2, abstractC0334g1);
                    Charset charset6 = AbstractC0349l1.f5205a;
                    i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i3 = i9 * 53;
                    floatToIntBits = M1.f(j2, abstractC0334g1);
                    i9 = floatToIntBits + i3;
                    break;
                case 16:
                    i2 = i9 * 53;
                    doubleToLongBits = M1.g(j2, abstractC0334g1);
                    Charset charset7 = AbstractC0349l1.f5205a;
                    i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i7 = i9 * 53;
                    Object i15 = M1.i(j2, abstractC0334g1);
                    if (i15 != null) {
                        i13 = i15.hashCode();
                    }
                    i9 = i7 + i13;
                    break;
                case 18:
                case C0793l9.f8681C /* 19 */:
                case C0793l9.f8682D /* 20 */:
                case C0793l9.f8683E /* 21 */:
                case 22:
                case 23:
                case 24:
                case C0793l9.f8684F /* 25 */:
                case 26:
                case C0793l9.f8686H /* 27 */:
                case 28:
                case C0793l9.f8687I /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case C0793l9.f8688J /* 35 */:
                case 36:
                case 37:
                case C0793l9.f8689K /* 38 */:
                case 39:
                case C0793l9.f8690L /* 40 */:
                case 41:
                case C0793l9.f8691M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i3 = i9 * 53;
                    floatToIntBits = M1.i(j2, abstractC0334g1).hashCode();
                    i9 = floatToIntBits + i3;
                    break;
                case 50:
                    i3 = i9 * 53;
                    floatToIntBits = M1.i(j2, abstractC0334g1).hashCode();
                    i9 = floatToIntBits + i3;
                    break;
                case 51:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i2 = i9 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) M1.i(j2, abstractC0334g1)).doubleValue());
                        Charset charset8 = AbstractC0349l1.f5205a;
                        i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) M1.i(j2, abstractC0334g1)).floatValue());
                        i9 = floatToIntBits + i3;
                        break;
                    }
                case 53:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i2 = i9 * 53;
                        doubleToLongBits = z(j2, abstractC0334g1);
                        Charset charset9 = AbstractC0349l1.f5205a;
                        i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i2 = i9 * 53;
                        doubleToLongBits = z(j2, abstractC0334g1);
                        Charset charset10 = AbstractC0349l1.f5205a;
                        i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = v(j2, abstractC0334g1);
                        i9 = floatToIntBits + i3;
                        break;
                    }
                case 56:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i2 = i9 * 53;
                        doubleToLongBits = z(j2, abstractC0334g1);
                        Charset charset11 = AbstractC0349l1.f5205a;
                        i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = v(j2, abstractC0334g1);
                        i9 = floatToIntBits + i3;
                        break;
                    }
                case 58:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        boolean booleanValue = ((Boolean) M1.i(j2, abstractC0334g1)).booleanValue();
                        Charset charset12 = AbstractC0349l1.f5205a;
                        break;
                    }
                case 59:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = ((String) M1.i(j2, abstractC0334g1)).hashCode();
                        i9 = floatToIntBits + i3;
                        break;
                    }
                case 60:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = M1.i(j2, abstractC0334g1).hashCode();
                        i9 = floatToIntBits + i3;
                        break;
                    }
                case 61:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = M1.i(j2, abstractC0334g1).hashCode();
                        i9 = floatToIntBits + i3;
                        break;
                    }
                case 62:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = v(j2, abstractC0334g1);
                        i9 = floatToIntBits + i3;
                        break;
                    }
                case 63:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = v(j2, abstractC0334g1);
                        i9 = floatToIntBits + i3;
                        break;
                    }
                case 64:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = v(j2, abstractC0334g1);
                        i9 = floatToIntBits + i3;
                        break;
                    }
                case 65:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i2 = i9 * 53;
                        doubleToLongBits = z(j2, abstractC0334g1);
                        Charset charset13 = AbstractC0349l1.f5205a;
                        i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = v(j2, abstractC0334g1);
                        i9 = floatToIntBits + i3;
                        break;
                    }
                case 67:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i2 = i9 * 53;
                        doubleToLongBits = z(j2, abstractC0334g1);
                        Charset charset14 = AbstractC0349l1.f5205a;
                        i9 = i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!s(i11, i8, abstractC0334g1)) {
                        break;
                    } else {
                        i3 = i9 * 53;
                        floatToIntBits = M1.i(j2, abstractC0334g1).hashCode();
                        i9 = floatToIntBits + i3;
                        break;
                    }
            }
            i8 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final AbstractC0334g1 f() {
        return (AbstractC0334g1) ((AbstractC0334g1) this.f5281e).d(4);
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final boolean g(AbstractC0334g1 abstractC0334g1, Object obj) {
        boolean e3;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f5277a;
            if (i2 >= iArr.length) {
                return abstractC0334g1.zzc.equals(((AbstractC0334g1) obj).zzc);
            }
            int y5 = y(i2);
            long j2 = y5 & 1048575;
            switch (x(y5)) {
                case 0:
                    if (!o(abstractC0334g1, obj, i2)) {
                        break;
                    } else {
                        L1 l12 = M1.f5081c;
                        if (Double.doubleToLongBits(l12.a(j2, abstractC0334g1)) != Double.doubleToLongBits(l12.a(j2, obj))) {
                            break;
                        } else {
                            continue;
                            i2 += 3;
                        }
                    }
                case 1:
                    if (!o(abstractC0334g1, obj, i2)) {
                        break;
                    } else {
                        L1 l13 = M1.f5081c;
                        if (Float.floatToIntBits(l13.b(j2, abstractC0334g1)) != Float.floatToIntBits(l13.b(j2, obj))) {
                            break;
                        } else {
                            continue;
                            i2 += 3;
                        }
                    }
                case 2:
                    if (o(abstractC0334g1, obj, i2) && M1.g(j2, abstractC0334g1) == M1.g(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 3:
                    if (o(abstractC0334g1, obj, i2) && M1.g(j2, abstractC0334g1) == M1.g(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 4:
                    if (o(abstractC0334g1, obj, i2) && M1.f(j2, abstractC0334g1) == M1.f(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 5:
                    if (o(abstractC0334g1, obj, i2) && M1.g(j2, abstractC0334g1) == M1.g(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 6:
                    if (o(abstractC0334g1, obj, i2) && M1.f(j2, abstractC0334g1) == M1.f(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 7:
                    if (!o(abstractC0334g1, obj, i2)) {
                        break;
                    } else {
                        L1 l14 = M1.f5081c;
                        if (l14.g(j2, abstractC0334g1) != l14.g(j2, obj)) {
                            break;
                        } else {
                            continue;
                            i2 += 3;
                        }
                    }
                case 8:
                    if (o(abstractC0334g1, obj, i2) && E1.e(M1.i(j2, abstractC0334g1), M1.i(j2, obj))) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 9:
                    if (o(abstractC0334g1, obj, i2) && E1.e(M1.i(j2, abstractC0334g1), M1.i(j2, obj))) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 10:
                    if (o(abstractC0334g1, obj, i2) && E1.e(M1.i(j2, abstractC0334g1), M1.i(j2, obj))) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 11:
                    if (o(abstractC0334g1, obj, i2) && M1.f(j2, abstractC0334g1) == M1.f(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 12:
                    if (o(abstractC0334g1, obj, i2) && M1.f(j2, abstractC0334g1) == M1.f(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 13:
                    if (o(abstractC0334g1, obj, i2) && M1.f(j2, abstractC0334g1) == M1.f(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 14:
                    if (o(abstractC0334g1, obj, i2) && M1.g(j2, abstractC0334g1) == M1.g(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 15:
                    if (o(abstractC0334g1, obj, i2) && M1.f(j2, abstractC0334g1) == M1.f(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 16:
                    if (o(abstractC0334g1, obj, i2) && M1.g(j2, abstractC0334g1) == M1.g(j2, obj)) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 17:
                    if (o(abstractC0334g1, obj, i2) && E1.e(M1.i(j2, abstractC0334g1), M1.i(j2, obj))) {
                        continue;
                        i2 += 3;
                    }
                    break;
                case 18:
                case C0793l9.f8681C /* 19 */:
                case C0793l9.f8682D /* 20 */:
                case C0793l9.f8683E /* 21 */:
                case 22:
                case 23:
                case 24:
                case C0793l9.f8684F /* 25 */:
                case 26:
                case C0793l9.f8686H /* 27 */:
                case 28:
                case C0793l9.f8687I /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case C0793l9.f8688J /* 35 */:
                case 36:
                case 37:
                case C0793l9.f8689K /* 38 */:
                case 39:
                case C0793l9.f8690L /* 40 */:
                case 41:
                case C0793l9.f8691M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    e3 = E1.e(M1.i(j2, abstractC0334g1), M1.i(j2, obj));
                    break;
                case 50:
                    e3 = E1.e(M1.i(j2, abstractC0334g1), M1.i(j2, obj));
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
                    long j6 = iArr[i2 + 2] & 1048575;
                    if (M1.f(j6, abstractC0334g1) == M1.f(j6, obj) && E1.e(M1.i(j2, abstractC0334g1), M1.i(j2, obj))) {
                        continue;
                        i2 += 3;
                    }
                    break;
                default:
                    i2 += 3;
            }
            if (e3) {
                i2 += 3;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.D1
    public final void h(Object obj, C0366r1 c0366r1) {
        int i2;
        int i3;
        int i6;
        Unsafe unsafe = f5276k;
        int i7 = 1048575;
        boolean z = 0;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f5277a;
            if (i10 >= iArr.length) {
                ((AbstractC0334g1) obj).zzc.d(c0366r1);
                return;
            }
            int y5 = y(i10);
            int x5 = x(y5);
            int i11 = iArr[i10];
            if (x5 <= 17) {
                int i12 = iArr[i10 + 2];
                int i13 = i12 & i7;
                if (i13 != i8) {
                    i9 = i13 == i7 ? z : unsafe.getInt(obj, i13);
                    i8 = i13;
                }
                i6 = 1 << (i12 >>> 20);
                i2 = i8;
                i3 = i9;
            } else {
                i2 = i8;
                i3 = i9;
                i6 = z;
            }
            long j2 = y5 & i7;
            switch (x5) {
                case 0:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.k(i11, M1.d(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.o(i11, M1.e(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.r(i11, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.g(i11, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.q(i11, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.n(i11, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.m(i11, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.h(i11, M1.t(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(obj, i10, i2, i3, i6)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((Z0) c0366r1.f5242a).e0(i11, (String) object);
                            break;
                        } else {
                            c0366r1.i(i11, (Y0) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.s(i11, unsafe.getObject(obj, j2), B(i10));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.i(i11, (Y0) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.f(i11, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.l(i11, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.t(i11, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.u(i11, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.c(i11, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.d(i11, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(obj, i10, i2, i3, i6)) {
                        c0366r1.p(i11, unsafe.getObject(obj, j2), B(i10));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    E1.u(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case C0793l9.f8681C /* 19 */:
                    E1.y(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case C0793l9.f8682D /* 20 */:
                    E1.A(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case C0793l9.f8683E /* 21 */:
                    E1.d(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case 22:
                    E1.z(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case 23:
                    E1.x(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case 24:
                    E1.w(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case C0793l9.f8684F /* 25 */:
                    E1.t(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case 26:
                    int i14 = iArr[i10];
                    List list = (List) unsafe.getObject(obj, j2);
                    C0328e1 c0328e1 = E1.f5043a;
                    if (list != null && !list.isEmpty()) {
                        c0366r1.e(i14, list);
                        break;
                    }
                    break;
                case C0793l9.f8686H /* 27 */:
                    int i15 = iArr[i10];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    D1 B5 = B(i10);
                    C0328e1 c0328e12 = E1.f5043a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = z; i16 < list2.size(); i16++) {
                            c0366r1.s(i15, list2.get(i16), B5);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i17 = iArr[i10];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    C0328e1 c0328e13 = E1.f5043a;
                    if (list3 != null && !list3.isEmpty()) {
                        c0366r1.j(i17, list3);
                        break;
                    }
                    break;
                case C0793l9.f8687I /* 29 */:
                    E1.c(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case 30:
                    E1.v(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case 31:
                    E1.B(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case 32:
                    E1.C(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case 33:
                    E1.a(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case 34:
                    E1.b(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, z);
                    break;
                case C0793l9.f8688J /* 35 */:
                    E1.u(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 36:
                    E1.y(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 37:
                    E1.A(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case C0793l9.f8689K /* 38 */:
                    E1.d(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 39:
                    E1.z(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case C0793l9.f8690L /* 40 */:
                    E1.x(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 41:
                    E1.w(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case C0793l9.f8691M /* 42 */:
                    E1.t(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 43:
                    E1.c(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 44:
                    E1.v(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 45:
                    E1.B(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 46:
                    E1.C(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 47:
                    E1.a(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 48:
                    E1.b(iArr[i10], (List) unsafe.getObject(obj, j2), c0366r1, true);
                    break;
                case 49:
                    int i18 = iArr[i10];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    D1 B6 = B(i10);
                    C0328e1 c0328e14 = E1.f5043a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = z; i19 < list4.size(); i19++) {
                            c0366r1.p(i18, list4.get(i19), B6);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        int i20 = i10 / 3;
                        AbstractC0279e.o(this.f5278b[i20 + i20]);
                        throw null;
                    }
                    break;
                case 51:
                    if (s(i11, i10, obj)) {
                        c0366r1.k(i11, ((Double) M1.i(j2, obj)).doubleValue());
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i11, i10, obj)) {
                        c0366r1.o(i11, ((Float) M1.i(j2, obj)).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i11, i10, obj)) {
                        c0366r1.r(i11, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i11, i10, obj)) {
                        c0366r1.g(i11, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i11, i10, obj)) {
                        c0366r1.q(i11, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i11, i10, obj)) {
                        c0366r1.n(i11, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i11, i10, obj)) {
                        c0366r1.m(i11, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i11, i10, obj)) {
                        c0366r1.h(i11, ((Boolean) M1.i(j2, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i11, i10, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof String) {
                            ((Z0) c0366r1.f5242a).e0(i11, (String) object2);
                            break;
                        } else {
                            c0366r1.i(i11, (Y0) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (s(i11, i10, obj)) {
                        c0366r1.s(i11, unsafe.getObject(obj, j2), B(i10));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i11, i10, obj)) {
                        c0366r1.i(i11, (Y0) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i11, i10, obj)) {
                        c0366r1.f(i11, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i11, i10, obj)) {
                        c0366r1.l(i11, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i11, i10, obj)) {
                        c0366r1.t(i11, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i11, i10, obj)) {
                        c0366r1.u(i11, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i11, i10, obj)) {
                        c0366r1.c(i11, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i11, i10, obj)) {
                        c0366r1.d(i11, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i11, i10, obj)) {
                        c0366r1.p(i11, unsafe.getObject(obj, j2), B(i10));
                        break;
                    } else {
                        break;
                    }
            }
            i10 += 3;
            i8 = i2;
            i9 = i3;
            i7 = 1048575;
            z = 0;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.D1
    public final boolean i(Object obj) {
        int i2;
        int i3;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i7 < this.f5283g) {
            int i9 = this.f5282f[i7];
            int[] iArr = this.f5277a;
            int i10 = iArr[i9];
            int y5 = y(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i8) {
                if (i12 != 1048575) {
                    i6 = f5276k.getInt(obj, i12);
                }
                i3 = i6;
                i2 = i12;
            } else {
                i2 = i8;
                i3 = i6;
            }
            if ((268435456 & y5) != 0 && !q(obj, i9, i2, i3, i13)) {
                return false;
            }
            int x5 = x(y5);
            if (x5 != 9 && x5 != 17) {
                if (x5 != 27) {
                    if (x5 == 60 || x5 == 68) {
                        if (s(i10, i9, obj) && !B(i9).i(M1.i(y5 & 1048575, obj))) {
                            return false;
                        }
                    } else if (x5 != 49) {
                        if (x5 == 50 && !((C0369s1) M1.i(y5 & 1048575, obj)).isEmpty()) {
                            int i14 = i9 / 3;
                            AbstractC0279e.o(this.f5278b[i14 + i14]);
                            throw null;
                        }
                    }
                }
                List list = (List) M1.i(y5 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    D1 B5 = B(i9);
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        if (!B5.i(list.get(i15))) {
                            return false;
                        }
                    }
                }
            } else if (q(obj, i9, i2, i3, i13) && !B(i9).i(M1.i(y5 & 1048575, obj))) {
                return false;
            }
            i7++;
            i8 = i2;
            i6 = i3;
        }
        return true;
    }

    public final void j(Object obj, int i2, Object obj2) {
        if (p(i2, obj2)) {
            int y5 = y(i2) & 1048575;
            Unsafe unsafe = f5276k;
            long j2 = y5;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5277a[i2] + " is present but null: " + obj2.toString());
            }
            D1 B5 = B(i2);
            if (!p(i2, obj)) {
                if (r(object)) {
                    AbstractC0334g1 f3 = B5.f();
                    B5.d(f3, object);
                    unsafe.putObject(obj, j2, f3);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                l(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                AbstractC0334g1 f6 = B5.f();
                B5.d(f6, object2);
                unsafe.putObject(obj, j2, f6);
                object2 = f6;
            }
            B5.d(object2, object);
        }
    }

    public final void k(Object obj, int i2, Object obj2) {
        int[] iArr = this.f5277a;
        int i3 = iArr[i2];
        if (s(i3, i2, obj2)) {
            int y5 = y(i2) & 1048575;
            Unsafe unsafe = f5276k;
            long j2 = y5;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2.toString());
            }
            D1 B5 = B(i2);
            if (!s(i3, i2, obj)) {
                if (r(object)) {
                    AbstractC0334g1 f3 = B5.f();
                    B5.d(f3, object);
                    unsafe.putObject(obj, j2, f3);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                M1.n(obj, iArr[i2 + 2] & 1048575, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                AbstractC0334g1 f6 = B5.f();
                B5.d(f6, object2);
                unsafe.putObject(obj, j2, f6);
                object2 = f6;
            }
            B5.d(object2, object);
        }
    }

    public final void l(int i2, Object obj) {
        int i3 = this.f5277a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        M1.n(obj, j2, (1 << (i3 >>> 20)) | M1.f(j2, obj));
    }

    public final void m(Object obj, int i2, Object obj2) {
        f5276k.putObject(obj, y(i2) & 1048575, obj2);
        l(i2, obj);
    }

    public final void n(int i2, int i3, Object obj, Object obj2) {
        f5276k.putObject(obj, y(i3) & 1048575, obj2);
        M1.n(obj, this.f5277a[i3 + 2] & 1048575, i2);
    }

    public final boolean o(AbstractC0334g1 abstractC0334g1, Object obj, int i2) {
        return p(i2, abstractC0334g1) == p(i2, obj);
    }

    public final boolean p(int i2, Object obj) {
        int i3 = this.f5277a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & M1.f(j2, obj)) != 0;
        }
        int y5 = y(i2);
        long j6 = y5 & 1048575;
        switch (x(y5)) {
            case 0:
                return Double.doubleToRawLongBits(M1.f5081c.a(j6, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(M1.f5081c.b(j6, obj)) != 0;
            case 2:
                return M1.g(j6, obj) != 0;
            case 3:
                return M1.g(j6, obj) != 0;
            case 4:
                return M1.f(j6, obj) != 0;
            case 5:
                return M1.g(j6, obj) != 0;
            case 6:
                return M1.f(j6, obj) != 0;
            case 7:
                return M1.f5081c.g(j6, obj);
            case 8:
                Object i6 = M1.i(j6, obj);
                if (i6 instanceof String) {
                    return !((String) i6).isEmpty();
                }
                if (i6 instanceof Y0) {
                    return !Y0.f5142c.equals(i6);
                }
                throw new IllegalArgumentException();
            case 9:
                return M1.i(j6, obj) != null;
            case 10:
                return !Y0.f5142c.equals(M1.i(j6, obj));
            case 11:
                return M1.f(j6, obj) != 0;
            case 12:
                return M1.f(j6, obj) != 0;
            case 13:
                return M1.f(j6, obj) != 0;
            case 14:
                return M1.g(j6, obj) != 0;
            case 15:
                return M1.f(j6, obj) != 0;
            case 16:
                return M1.g(j6, obj) != 0;
            case 17:
                return M1.i(j6, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean q(Object obj, int i2, int i3, int i6, int i7) {
        return i3 == 1048575 ? p(i2, obj) : (i6 & i7) != 0;
    }

    public final boolean s(int i2, int i3, Object obj) {
        return M1.f((long) (this.f5277a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:330:0x08e4, code lost:
    
        r41 = r52;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0f15, code lost:
    
        if (r1 == 1048575) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0f17, code lost:
    
        r38.putInt(r7, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0f1d, code lost:
    
        r1 = r49.f5283g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0f21, code lost:
    
        if (r1 >= r49.f5284h) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0f23, code lost:
    
        r2 = r49.f5282f[r1];
        r5 = r20[r2];
        r5 = com.google.android.gms.internal.play_billing.M1.i(y(r2) & 1048575, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0f33, code lost:
    
        if (r5 != null) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0f3a, code lost:
    
        if (A(r2) != null) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0f3e, code lost:
    
        r5 = (com.google.android.gms.internal.play_billing.C0369s1) r5;
        r2 = r2 / 3;
        b2.AbstractC0279e.o(r23[r2 + r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0f48, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0f3c, code lost:
    
        r1 = r1 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f4b, code lost:
    
        if (r11 != 0) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0f4d, code lost:
    
        if (r8 != r14) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0f55, code lost:
    
        throw new com.google.android.gms.internal.play_billing.C0355n1("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0f5a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0f56, code lost:
    
        if (r8 > r14) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0f58, code lost:
    
        if (r3 != r11) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0f60, code lost:
    
        throw new com.google.android.gms.internal.play_billing.C0355n1("Failed to parse the message.");
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0b42 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0b54 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0eac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0ebd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(Object obj, byte[] bArr, int i2, int i3, int i6, V0 v02) {
        int[] iArr;
        Object[] objArr;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        H1 h12;
        int i15;
        int i16;
        V0 v03;
        int i17;
        long j2;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe2;
        H1 h13;
        int i21;
        int i22;
        boolean z;
        int i23;
        V0 v04;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        V0 v05;
        H1 h14;
        int i34;
        int i35;
        int i36;
        long j6;
        InterfaceC0346k1 interfaceC0346k1;
        int i37;
        int i38;
        V0 v06;
        H1 h15;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int O5;
        int i44;
        Object obj2;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int Q5;
        int i51;
        int i52;
        int O6;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        H1 h16;
        int i59;
        int i60;
        int i61;
        int O7;
        Object obj3 = obj;
        int i62 = i3;
        int i63 = i6;
        V0 v07 = v02;
        int i64 = 3;
        int i65 = 1;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        Unsafe unsafe3 = f5276k;
        int i66 = i2;
        int i67 = -1;
        int i68 = 0;
        int i69 = 1048575;
        int i70 = 0;
        int i71 = 0;
        while (true) {
            int[] iArr2 = this.f5277a;
            Object[] objArr2 = this.f5278b;
            if (i66 < i62) {
                int i72 = i66 + 1;
                int i73 = bArr[i66];
                if (i73 < 0) {
                    i72 = AbstractC0325d1.P(i73, bArr, i72, v07);
                    i73 = v07.f5111a;
                }
                int i74 = (i73 == true ? 1 : 0) >>> 3;
                int i75 = this.f5280d;
                int i76 = this.f5279c;
                if (i74 > i67) {
                    i14 = (i74 < i76 || i74 > i75) ? -1 : w(i74, i68 / i64);
                    i13 = 0;
                } else if (i74 < i76 || i74 > i75) {
                    i13 = 0;
                    i14 = -1;
                } else {
                    i13 = 0;
                    i14 = w(i74, 0);
                }
                H1 h17 = H1.f5055f;
                if (i14 != -1) {
                    int i77 = (i73 == true ? 1 : 0) & 7;
                    int i78 = iArr2[i14 + 1];
                    int x5 = x(i78);
                    long j7 = i78 & 1048575;
                    int i79 = i73 == true ? 1 : 0;
                    String str = "Protocol message had invalid UTF-8.";
                    if (x5 > 17) {
                        iArr = iArr2;
                        int i80 = i69;
                        Unsafe unsafe4 = unsafe3;
                        V0 v08 = v07;
                        int i81 = i79;
                        int i82 = i14;
                        if (x5 != 27) {
                            i15 = i80;
                            int i83 = i74;
                            if (x5 > 49) {
                                unsafe = unsafe4;
                                v05 = v08;
                                h14 = h17;
                                i34 = i83;
                                objArr = objArr2;
                                int i84 = i72;
                                i35 = i81;
                                i36 = i84;
                                if (x5 != 50) {
                                    H1 h18 = h14;
                                    Unsafe unsafe5 = f5276k;
                                    long j8 = iArr[i82 + 2] & 1048575;
                                    switch (x5) {
                                        case 51:
                                            i53 = i35;
                                            i54 = i82;
                                            h12 = h18;
                                            i7 = 1;
                                            i16 = 3;
                                            obj3 = obj;
                                            v03 = v02;
                                            i55 = i36;
                                            i17 = i34;
                                            if (i77 == 1) {
                                                i56 = i55 + 8;
                                                unsafe5.putObject(obj3, j7, Double.valueOf(Double.longBitsToDouble(AbstractC0325d1.U(i55, bArr))));
                                                unsafe5.putInt(obj3, j8, i17);
                                                i66 = i56;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                    i9 = i6;
                                                    i72 = i66;
                                                    i73 = i53;
                                                    break;
                                                } else {
                                                    i62 = i3;
                                                    i63 = i6;
                                                    i65 = i7;
                                                    i64 = i16;
                                                    i69 = i15;
                                                    i71 = i53;
                                                    i67 = i17;
                                                    v07 = v03;
                                                    unsafe3 = unsafe;
                                                }
                                            }
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                        case 52:
                                            i53 = i35;
                                            i54 = i82;
                                            h12 = h18;
                                            i7 = 1;
                                            i16 = 3;
                                            obj3 = obj;
                                            v03 = v02;
                                            i55 = i36;
                                            i17 = i34;
                                            if (i77 == 5) {
                                                i56 = i55 + 4;
                                                unsafe5.putObject(obj3, j7, Float.valueOf(Float.intBitsToFloat(AbstractC0325d1.q(i55, bArr))));
                                                unsafe5.putInt(obj3, j8, i17);
                                                i66 = i56;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i53 = i35;
                                            i54 = i82;
                                            h12 = h18;
                                            i7 = 1;
                                            i16 = 3;
                                            obj3 = obj;
                                            v03 = v02;
                                            i55 = i36;
                                            i17 = i34;
                                            if (i77 == 0) {
                                                i66 = AbstractC0325d1.R(bArr, i55, v03);
                                                unsafe5.putObject(obj3, j7, Long.valueOf(v03.f5112b));
                                                unsafe5.putInt(obj3, j8, i17);
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i53 = i35;
                                            i54 = i82;
                                            h12 = h18;
                                            i7 = 1;
                                            i16 = 3;
                                            obj3 = obj;
                                            v03 = v02;
                                            i55 = i36;
                                            i17 = i34;
                                            if (i77 == 0) {
                                                i56 = AbstractC0325d1.O(bArr, i55, v03);
                                                unsafe5.putObject(obj3, j7, Integer.valueOf(v03.f5111a));
                                                unsafe5.putInt(obj3, j8, i17);
                                                i66 = i56;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i53 = i35;
                                            i54 = i82;
                                            h12 = h18;
                                            i7 = 1;
                                            i16 = 3;
                                            obj3 = obj;
                                            v03 = v02;
                                            i55 = i36;
                                            i17 = i34;
                                            if (i77 == 1) {
                                                i56 = i55 + 8;
                                                unsafe5.putObject(obj3, j7, Long.valueOf(AbstractC0325d1.U(i55, bArr)));
                                                unsafe5.putInt(obj3, j8, i17);
                                                i66 = i56;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i53 = i35;
                                            i54 = i82;
                                            h12 = h18;
                                            i16 = 3;
                                            obj3 = obj;
                                            v03 = v02;
                                            i55 = i36;
                                            i17 = i34;
                                            if (i77 == 5) {
                                                i57 = i55 + 4;
                                                unsafe5.putObject(obj3, j7, Integer.valueOf(AbstractC0325d1.q(i55, bArr)));
                                                unsafe5.putInt(obj3, j8, i17);
                                                i66 = i57;
                                                i7 = 1;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            i7 = 1;
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                            break;
                                        case 58:
                                            i53 = i35;
                                            i54 = i82;
                                            h12 = h18;
                                            i16 = 3;
                                            obj3 = obj;
                                            v03 = v02;
                                            i55 = i36;
                                            i17 = i34;
                                            if (i77 == 0) {
                                                i57 = AbstractC0325d1.R(bArr, i55, v03);
                                                unsafe5.putObject(obj3, j7, Boolean.valueOf(v03.f5112b != 0));
                                                unsafe5.putInt(obj3, j8, i17);
                                                i66 = i57;
                                                i7 = 1;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            i7 = 1;
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                            break;
                                        case 59:
                                            i53 = i35;
                                            i54 = i82;
                                            h12 = h18;
                                            i16 = 3;
                                            obj3 = obj;
                                            v03 = v02;
                                            i55 = i36;
                                            i17 = i34;
                                            if (i77 == 2) {
                                                i57 = AbstractC0325d1.O(bArr, i55, v03);
                                                int i85 = v03.f5111a;
                                                if (i85 == 0) {
                                                    unsafe5.putObject(obj3, j7, "");
                                                } else {
                                                    int i86 = i78 & 536870912;
                                                    int i87 = i57 + i85;
                                                    if (i86 != 0 && !O1.d(bArr, i57, i87)) {
                                                        throw new C0355n1(str);
                                                    }
                                                    unsafe5.putObject(obj3, j7, new String(bArr, i57, i85, AbstractC0349l1.f5205a));
                                                    i57 = i87;
                                                }
                                                unsafe5.putInt(obj3, j8, i17);
                                                i66 = i57;
                                                i7 = 1;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            i7 = 1;
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                            break;
                                        case 60:
                                            obj3 = obj;
                                            i58 = i34;
                                            v03 = v02;
                                            if (i77 == 2) {
                                                Object D5 = D(i58, i82, obj3);
                                                i55 = i36;
                                                i53 = i35;
                                                h12 = h18;
                                                i16 = 3;
                                                int T2 = AbstractC0325d1.T(D5, B(i82), bArr, i55, i3, v02);
                                                n(i58, i82, obj3, D5);
                                                i66 = T2;
                                                i17 = i58;
                                                i54 = i82;
                                                i7 = 1;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            } else {
                                                i53 = i35;
                                                h12 = h18;
                                                i16 = 3;
                                                i54 = i82;
                                                i7 = 1;
                                                i55 = i36;
                                                i17 = i58;
                                                i66 = i55;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            i58 = i34;
                                            h16 = h18;
                                            obj3 = obj;
                                            i59 = i35;
                                            v03 = v02;
                                            if (i77 == 2) {
                                                int d6 = AbstractC0325d1.d(bArr, i36, v03);
                                                unsafe5.putObject(obj3, j7, v03.f5113c);
                                                unsafe5.putInt(obj3, j8, i58);
                                                i54 = i82;
                                                i66 = d6;
                                                i53 = i59;
                                                h12 = h16;
                                                i7 = 1;
                                                i16 = 3;
                                                i55 = i36;
                                                i17 = i58;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            } else {
                                                i54 = i82;
                                                i53 = i59;
                                                h12 = h16;
                                                i7 = 1;
                                                i16 = 3;
                                                i55 = i36;
                                                i17 = i58;
                                                i66 = i55;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            break;
                                        case 63:
                                            i60 = i35;
                                            i61 = i82;
                                            i58 = i34;
                                            obj3 = obj;
                                            v03 = v02;
                                            if (i77 == 0) {
                                                int O8 = AbstractC0325d1.O(bArr, i36, v03);
                                                int i88 = v03.f5111a;
                                                InterfaceC0340i1 A5 = A(i61);
                                                if (A5 == null || A5.a(i88)) {
                                                    h16 = h18;
                                                    i59 = i60;
                                                    unsafe5.putObject(obj3, j7, Integer.valueOf(i88));
                                                    unsafe5.putInt(obj3, j8, i58);
                                                } else {
                                                    AbstractC0334g1 abstractC0334g1 = (AbstractC0334g1) obj3;
                                                    H1 h19 = abstractC0334g1.zzc;
                                                    h16 = h18;
                                                    if (h19 == h16) {
                                                        h19 = H1.b();
                                                        abstractC0334g1.zzc = h19;
                                                    }
                                                    i59 = i60;
                                                    h19.c(i59, Long.valueOf(i88));
                                                }
                                                i66 = O8;
                                                i54 = i61;
                                                i53 = i59;
                                                h12 = h16;
                                                i7 = 1;
                                                i16 = 3;
                                                i55 = i36;
                                                i17 = i58;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            i54 = i61;
                                            h12 = h18;
                                            i53 = i60;
                                            i7 = 1;
                                            i16 = 3;
                                            i55 = i36;
                                            i17 = i58;
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                            break;
                                        case 66:
                                            i60 = i35;
                                            i61 = i82;
                                            i58 = i34;
                                            obj3 = obj;
                                            v03 = v02;
                                            if (i77 == 0) {
                                                O7 = AbstractC0325d1.O(bArr, i36, v03);
                                                unsafe5.putObject(obj3, j7, Integer.valueOf(AbstractC0325d1.p(v03.f5111a)));
                                                unsafe5.putInt(obj3, j8, i58);
                                                i66 = O7;
                                                i54 = i61;
                                                h12 = h18;
                                                i53 = i60;
                                                i7 = 1;
                                                i16 = 3;
                                                i55 = i36;
                                                i17 = i58;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            i54 = i61;
                                            h12 = h18;
                                            i53 = i60;
                                            i7 = 1;
                                            i16 = 3;
                                            i55 = i36;
                                            i17 = i58;
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                            break;
                                        case 67:
                                            i60 = i35;
                                            i61 = i82;
                                            i58 = i34;
                                            obj3 = obj;
                                            v03 = v02;
                                            if (i77 == 0) {
                                                O7 = AbstractC0325d1.R(bArr, i36, v03);
                                                h18 = h18;
                                                unsafe5.putObject(obj3, j7, Long.valueOf(AbstractC0325d1.x(v03.f5112b)));
                                                unsafe5.putInt(obj3, j8, i58);
                                                i66 = O7;
                                                i54 = i61;
                                                h12 = h18;
                                                i53 = i60;
                                                i7 = 1;
                                                i16 = 3;
                                                i55 = i36;
                                                i17 = i58;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            } else {
                                                i54 = i61;
                                                h12 = h18;
                                                i53 = i60;
                                                i7 = 1;
                                                i16 = 3;
                                                i55 = i36;
                                                i17 = i58;
                                                i66 = i55;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i77 == 3) {
                                                obj3 = obj;
                                                Object D6 = D(i34, i82, obj3);
                                                i60 = i35;
                                                i58 = i34;
                                                i66 = AbstractC0325d1.S(D6, B(i82), bArr, i36, i3, (i35 & (-8)) | 4, v02);
                                                n(i58, i82, obj3, D6);
                                                i54 = i82;
                                                v03 = v02;
                                                h12 = h18;
                                                i53 = i60;
                                                i7 = 1;
                                                i16 = 3;
                                                i55 = i36;
                                                i17 = i58;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            } else {
                                                obj3 = obj;
                                                i55 = i36;
                                                i16 = 3;
                                                i54 = i82;
                                                i17 = i34;
                                                h12 = h18;
                                                i53 = i35;
                                                i7 = 1;
                                                v03 = v02;
                                                i66 = i55;
                                                i68 = i54;
                                                if (i66 == i55) {
                                                }
                                            }
                                            break;
                                        default:
                                            obj3 = obj;
                                            i53 = i35;
                                            i54 = i82;
                                            h12 = h18;
                                            i7 = 1;
                                            i16 = 3;
                                            v03 = v02;
                                            i55 = i36;
                                            i17 = i34;
                                            i66 = i55;
                                            i68 = i54;
                                            if (i66 == i55) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i77 == 2) {
                                        Unsafe unsafe6 = f5276k;
                                        int i89 = i82 / 3;
                                        Object obj4 = objArr[i89 + i89];
                                        Object object = unsafe6.getObject(obj3, j7);
                                        if (!((C0369s1) object).e()) {
                                            C0369s1 c2 = C0369s1.a().c();
                                            C0328e1.c(c2, object);
                                            unsafe6.putObject(obj3, j7, c2);
                                        }
                                        AbstractC0279e.o(obj4);
                                        throw null;
                                    }
                                    i33 = i82;
                                    i32 = 3;
                                    i16 = i32;
                                    i73 = i35;
                                    h12 = h14;
                                    i7 = 1;
                                    i9 = i6;
                                    i72 = i36;
                                    i17 = i34;
                                    int i90 = i33;
                                    v03 = v05;
                                    i68 = i90;
                                }
                            } else {
                                long j9 = i78;
                                Unsafe unsafe7 = f5276k;
                                T0 t02 = (T0) ((InterfaceC0346k1) unsafe7.getObject(obj3, j7));
                                if (t02.d()) {
                                    j6 = j9;
                                    interfaceC0346k1 = t02;
                                } else {
                                    int size = t02.size();
                                    j6 = j9;
                                    InterfaceC0346k1 a6 = t02.a(size + size);
                                    unsafe7.putObject(obj3, j7, a6);
                                    interfaceC0346k1 = a6;
                                }
                                InterfaceC0346k1 interfaceC0346k12 = interfaceC0346k1;
                                switch (x5) {
                                    case 18:
                                    case C0793l9.f8688J /* 35 */:
                                        i37 = i3;
                                        i38 = i82;
                                        v06 = v08;
                                        h15 = h17;
                                        unsafe = unsafe4;
                                        i39 = i83;
                                        i40 = 3;
                                        objArr = objArr2;
                                        int i91 = i72;
                                        i41 = i81;
                                        i42 = i91;
                                        if (i77 != 2) {
                                            i43 = 1;
                                            if (i77 == 1) {
                                                AbstractC0279e.l(interfaceC0346k12);
                                                Double.longBitsToDouble(AbstractC0325d1.U(i42, bArr));
                                                throw null;
                                            }
                                            O5 = i42;
                                            if (O5 != i42) {
                                                i73 = i41;
                                                i16 = i40;
                                                v03 = v06;
                                                h12 = h15;
                                                i17 = i39;
                                                i68 = i38;
                                                i9 = i6;
                                                i7 = i43;
                                                i72 = O5;
                                                break;
                                            } else {
                                                i63 = i6;
                                                i71 = i41;
                                                i62 = i37;
                                                v07 = v06;
                                                i69 = i15;
                                                unsafe3 = unsafe;
                                                i68 = i38;
                                                i66 = O5;
                                                i64 = i40;
                                                i67 = i39;
                                                i65 = i43;
                                            }
                                        } else {
                                            AbstractC0279e.l(interfaceC0346k12);
                                            if (AbstractC0325d1.O(bArr, i42, v06) + v06.f5111a > bArr.length) {
                                                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            throw null;
                                        }
                                    case C0793l9.f8681C /* 19 */:
                                    case 36:
                                        i37 = i3;
                                        i38 = i82;
                                        v06 = v08;
                                        h15 = h17;
                                        unsafe = unsafe4;
                                        i39 = i83;
                                        i40 = 3;
                                        objArr = objArr2;
                                        int i92 = i72;
                                        i41 = i81;
                                        i42 = i92;
                                        if (i77 == 2) {
                                            AbstractC0279e.l(interfaceC0346k12);
                                            if (AbstractC0325d1.O(bArr, i42, v06) + v06.f5111a > bArr.length) {
                                                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            throw null;
                                        }
                                        if (i77 == 5) {
                                            AbstractC0279e.l(interfaceC0346k12);
                                            Float.intBitsToFloat(AbstractC0325d1.q(i42, bArr));
                                            throw null;
                                        }
                                        i43 = 1;
                                        O5 = i42;
                                        if (O5 != i42) {
                                        }
                                        break;
                                    case C0793l9.f8682D /* 20 */:
                                    case C0793l9.f8683E /* 21 */:
                                    case 37:
                                    case C0793l9.f8689K /* 38 */:
                                        i37 = i3;
                                        int i93 = i72;
                                        i38 = i82;
                                        v06 = v08;
                                        h15 = h17;
                                        unsafe = unsafe4;
                                        i39 = i83;
                                        i40 = 3;
                                        objArr = objArr2;
                                        i41 = i81;
                                        if (i77 == 2) {
                                            AbstractC0279e.l(interfaceC0346k12);
                                            i42 = i93;
                                            O5 = AbstractC0325d1.O(bArr, i42, v06);
                                            int i94 = v06.f5111a + O5;
                                            if (O5 < i94) {
                                                AbstractC0325d1.R(bArr, O5, v06);
                                                throw null;
                                            }
                                            if (O5 != i94) {
                                                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i43 = 1;
                                            if (O5 != i42) {
                                            }
                                        } else {
                                            i42 = i93;
                                            if (i77 == 0) {
                                                AbstractC0279e.l(interfaceC0346k12);
                                                AbstractC0325d1.R(bArr, i42, v06);
                                                throw null;
                                            }
                                            i43 = 1;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        break;
                                    case 22:
                                    case C0793l9.f8687I /* 29 */:
                                    case 39:
                                    case 43:
                                        i37 = i3;
                                        v06 = v08;
                                        h15 = h17;
                                        unsafe = unsafe4;
                                        i39 = i83;
                                        objArr = objArr2;
                                        i40 = 3;
                                        if (i77 == 2) {
                                            i38 = i82;
                                            O5 = AbstractC0325d1.J(bArr, i72, interfaceC0346k12, v06);
                                            i43 = 1;
                                            int i95 = i72;
                                            i41 = i81;
                                            i42 = i95;
                                            if (O5 != i42) {
                                            }
                                        } else if (i77 == 0) {
                                            int i96 = i72;
                                            i38 = i82;
                                            O5 = AbstractC0325d1.Q(i81, bArr, i72, i3, interfaceC0346k12, v02);
                                            i41 = i81;
                                            i42 = i96;
                                            i43 = 1;
                                            if (O5 != i42) {
                                            }
                                        } else {
                                            i38 = i82;
                                            i43 = 1;
                                            int i97 = i72;
                                            i41 = i81;
                                            i42 = i97;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case C0793l9.f8690L /* 40 */:
                                    case 46:
                                        i37 = i3;
                                        v06 = v08;
                                        h15 = h17;
                                        unsafe = unsafe4;
                                        i39 = i83;
                                        objArr = objArr2;
                                        i40 = 3;
                                        if (i77 == 2) {
                                            AbstractC0279e.l(interfaceC0346k12);
                                            if (AbstractC0325d1.O(bArr, i72, v06) + v06.f5111a > bArr.length) {
                                                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            throw null;
                                        }
                                        if (i77 == 1) {
                                            AbstractC0279e.l(interfaceC0346k12);
                                            AbstractC0325d1.U(i72, bArr);
                                            throw null;
                                        }
                                        i38 = i82;
                                        i43 = 1;
                                        int i972 = i72;
                                        i41 = i81;
                                        i42 = i972;
                                        O5 = i42;
                                        if (O5 != i42) {
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i37 = i3;
                                        v06 = v08;
                                        h15 = h17;
                                        unsafe = unsafe4;
                                        i39 = i83;
                                        objArr = objArr2;
                                        i44 = i82;
                                        i40 = 3;
                                        if (i77 == 2) {
                                            C0337h1 c0337h1 = (C0337h1) interfaceC0346k12;
                                            O5 = AbstractC0325d1.O(bArr, i72, v06);
                                            int i98 = v06.f5111a;
                                            int i99 = O5 + i98;
                                            if (i99 > bArr.length) {
                                                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            c0337h1.g((i98 / 4) + c0337h1.size());
                                            while (O5 < i99) {
                                                c0337h1.f(AbstractC0325d1.q(O5, bArr));
                                                O5 += 4;
                                            }
                                            if (O5 != i99) {
                                                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i38 = i44;
                                            i43 = 1;
                                            int i952 = i72;
                                            i41 = i81;
                                            i42 = i952;
                                            if (O5 != i42) {
                                            }
                                        } else {
                                            if (i77 == 5) {
                                                int i100 = i72 + 4;
                                                C0337h1 c0337h12 = (C0337h1) interfaceC0346k12;
                                                c0337h12.f(AbstractC0325d1.q(i72, bArr));
                                                while (i100 < i37) {
                                                    int O9 = AbstractC0325d1.O(bArr, i100, v06);
                                                    if (i81 == v06.f5111a) {
                                                        c0337h12.f(AbstractC0325d1.q(O9, bArr));
                                                        i100 = O9 + 4;
                                                    } else {
                                                        i38 = i44;
                                                        O5 = i100;
                                                        i43 = 1;
                                                        int i9522 = i72;
                                                        i41 = i81;
                                                        i42 = i9522;
                                                        if (O5 != i42) {
                                                        }
                                                    }
                                                }
                                                i38 = i44;
                                                O5 = i100;
                                                i43 = 1;
                                                int i95222 = i72;
                                                i41 = i81;
                                                i42 = i95222;
                                                if (O5 != i42) {
                                                }
                                            }
                                            i38 = i44;
                                            i43 = 1;
                                            int i9722 = i72;
                                            i41 = i81;
                                            i42 = i9722;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        break;
                                    case C0793l9.f8684F /* 25 */:
                                    case C0793l9.f8691M /* 42 */:
                                        i37 = i3;
                                        v06 = v08;
                                        h15 = h17;
                                        unsafe = unsafe4;
                                        i39 = i83;
                                        objArr = objArr2;
                                        i44 = i82;
                                        i40 = 3;
                                        if (i77 == 2) {
                                            AbstractC0279e.l(interfaceC0346k12);
                                            O5 = AbstractC0325d1.O(bArr, i72, v06);
                                            int i101 = v06.f5111a + O5;
                                            if (O5 < i101) {
                                                AbstractC0325d1.R(bArr, O5, v06);
                                                throw null;
                                            }
                                            if (O5 != i101) {
                                                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i38 = i44;
                                            i43 = 1;
                                            int i952222 = i72;
                                            i41 = i81;
                                            i42 = i952222;
                                            if (O5 != i42) {
                                            }
                                        } else {
                                            if (i77 == 0) {
                                                AbstractC0279e.l(interfaceC0346k12);
                                                AbstractC0325d1.R(bArr, i72, v06);
                                                throw null;
                                            }
                                            i38 = i44;
                                            i43 = 1;
                                            int i97222 = i72;
                                            i41 = i81;
                                            i42 = i97222;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        break;
                                    case 26:
                                        int i102 = i81;
                                        int i103 = i82;
                                        h15 = h17;
                                        unsafe = unsafe4;
                                        i39 = i83;
                                        objArr = objArr2;
                                        if (i77 == 2) {
                                            if ((j6 & 536870912) == 0) {
                                                v06 = v02;
                                                int O10 = AbstractC0325d1.O(bArr, i72, v06);
                                                int i104 = v06.f5111a;
                                                if (i104 < 0) {
                                                    throw new C0355n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i104 == 0) {
                                                    Object obj5 = "";
                                                    interfaceC0346k12.add(obj5);
                                                    obj2 = obj5;
                                                } else {
                                                    obj2 = "";
                                                    interfaceC0346k12.add(new String(bArr, O10, i104, AbstractC0349l1.f5205a));
                                                    O10 += i104;
                                                }
                                                i37 = i3;
                                                while (true) {
                                                    if (O10 >= i37) {
                                                        i45 = i103;
                                                        i81 = i102;
                                                        break;
                                                    } else {
                                                        int O11 = AbstractC0325d1.O(bArr, O10, v06);
                                                        i81 = i102;
                                                        if (i81 != v06.f5111a) {
                                                            i45 = i103;
                                                            break;
                                                        } else {
                                                            O10 = AbstractC0325d1.O(bArr, O11, v06);
                                                            int i105 = v06.f5111a;
                                                            if (i105 < 0) {
                                                                throw new C0355n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i105 == 0) {
                                                                interfaceC0346k12.add(obj2);
                                                            } else {
                                                                interfaceC0346k12.add(new String(bArr, O10, i105, AbstractC0349l1.f5205a));
                                                                O10 += i105;
                                                                i103 = i103;
                                                            }
                                                            i102 = i81;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i37 = i3;
                                                v06 = v02;
                                                i81 = i102;
                                                int O12 = AbstractC0325d1.O(bArr, i72, v06);
                                                int i106 = v06.f5111a;
                                                if (i106 < 0) {
                                                    throw new C0355n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i106 == 0) {
                                                    interfaceC0346k12.add("");
                                                } else {
                                                    int i107 = O12 + i106;
                                                    if (!O1.d(bArr, O12, i107)) {
                                                        throw new C0355n1(str);
                                                    }
                                                    interfaceC0346k12.add(new String(bArr, O12, i106, AbstractC0349l1.f5205a));
                                                    O12 = i107;
                                                }
                                                while (O12 < i37) {
                                                    int O13 = AbstractC0325d1.O(bArr, O12, v06);
                                                    if (i81 == v06.f5111a) {
                                                        O12 = AbstractC0325d1.O(bArr, O13, v06);
                                                        int i108 = v06.f5111a;
                                                        if (i108 < 0) {
                                                            throw new C0355n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i108 == 0) {
                                                            interfaceC0346k12.add("");
                                                        } else {
                                                            int i109 = O12 + i108;
                                                            if (!O1.d(bArr, O12, i109)) {
                                                                throw new C0355n1(str);
                                                            }
                                                            interfaceC0346k12.add(new String(bArr, O12, i108, AbstractC0349l1.f5205a));
                                                            O12 = i109;
                                                        }
                                                    } else {
                                                        i38 = i103;
                                                        O5 = O12;
                                                    }
                                                }
                                                i38 = i103;
                                                O5 = O12;
                                            }
                                            i43 = 1;
                                            i40 = 3;
                                            int i9522222 = i72;
                                            i41 = i81;
                                            i42 = i9522222;
                                            if (O5 != i42) {
                                            }
                                        } else {
                                            i37 = i3;
                                            v06 = v02;
                                            i40 = 3;
                                            i38 = i103;
                                            i42 = i72;
                                            i41 = i102;
                                            i43 = 1;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        break;
                                    case C0793l9.f8686H /* 27 */:
                                        int i110 = i72;
                                        if (i77 == 2) {
                                            objArr = objArr2;
                                            unsafe = unsafe4;
                                            int E5 = AbstractC0325d1.E(B(i82), i81, bArr, i110, i3, interfaceC0346k12, v02);
                                            v06 = v02;
                                            i40 = 3;
                                            i38 = i82;
                                            i42 = i110;
                                            i39 = i83;
                                            h15 = h17;
                                            O5 = E5;
                                            i41 = i81;
                                            i43 = 1;
                                            i37 = i3;
                                            if (O5 != i42) {
                                            }
                                        } else {
                                            unsafe = unsafe4;
                                            objArr = objArr2;
                                            h15 = h17;
                                            i42 = i110;
                                            i38 = i82;
                                            i39 = i83;
                                            i41 = i81;
                                            i40 = 3;
                                            i37 = i3;
                                            v06 = v02;
                                            i43 = 1;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        break;
                                    case 28:
                                        int i111 = i72;
                                        i46 = i83;
                                        i47 = 1;
                                        if (i77 == 2) {
                                            O5 = AbstractC0325d1.O(bArr, i111, v08);
                                            int i112 = v08.f5111a;
                                            if (i112 < 0) {
                                                throw new C0355n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i112 > bArr.length - O5) {
                                                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i112 == 0) {
                                                interfaceC0346k12.add(Y0.f5142c);
                                            } else {
                                                interfaceC0346k12.add(Y0.f(bArr, O5, i112));
                                                O5 += i112;
                                            }
                                            while (O5 < i3) {
                                                int O14 = AbstractC0325d1.O(bArr, O5, v08);
                                                if (i81 == v08.f5111a) {
                                                    O5 = AbstractC0325d1.O(bArr, O14, v08);
                                                    int i113 = v08.f5111a;
                                                    if (i113 < 0) {
                                                        throw new C0355n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i113 > bArr.length - O5) {
                                                        throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i113 == 0) {
                                                        interfaceC0346k12.add(Y0.f5142c);
                                                    } else {
                                                        interfaceC0346k12.add(Y0.f(bArr, O5, i113));
                                                        O5 += i113;
                                                    }
                                                } else {
                                                    i42 = i111;
                                                    i38 = i82;
                                                    i37 = i3;
                                                    i41 = i81;
                                                    h15 = h17;
                                                    unsafe = unsafe4;
                                                    i43 = i47;
                                                    i40 = 3;
                                                    objArr = objArr2;
                                                    i39 = i46;
                                                    v06 = v08;
                                                    if (O5 != i42) {
                                                    }
                                                }
                                            }
                                            i42 = i111;
                                            i38 = i82;
                                            i37 = i3;
                                            i41 = i81;
                                            h15 = h17;
                                            unsafe = unsafe4;
                                            i43 = i47;
                                            i40 = 3;
                                            objArr = objArr2;
                                            i39 = i46;
                                            v06 = v08;
                                            if (O5 != i42) {
                                            }
                                        } else {
                                            i42 = i111;
                                            i38 = i82;
                                            i37 = i3;
                                            i41 = i81;
                                            h15 = h17;
                                            unsafe = unsafe4;
                                            i43 = 1;
                                            i40 = 3;
                                            objArr = objArr2;
                                            i39 = i46;
                                            v06 = v08;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i48 = i3;
                                        i49 = i81;
                                        i50 = i72;
                                        if (i77 == 2) {
                                            Q5 = AbstractC0325d1.J(bArr, i50, interfaceC0346k12, v08);
                                        } else {
                                            if (i77 == 0) {
                                                Q5 = AbstractC0325d1.Q(i49, bArr, i50, i3, interfaceC0346k12, v02);
                                            }
                                            i42 = i50;
                                            i38 = i82;
                                            i37 = i48;
                                            i41 = i49;
                                            v06 = v08;
                                            h15 = h17;
                                            unsafe = unsafe4;
                                            i39 = i83;
                                            i43 = 1;
                                            i40 = 3;
                                            objArr = objArr2;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        InterfaceC0340i1 A6 = A(i82);
                                        C0328e1 c0328e1 = E1.f5043a;
                                        if (A6 != null) {
                                            int size2 = interfaceC0346k12.size();
                                            Object obj6 = null;
                                            int i114 = 0;
                                            int i115 = 0;
                                            while (i114 < size2) {
                                                Integer num = (Integer) interfaceC0346k12.get(i114);
                                                int i116 = Q5;
                                                int intValue = num.intValue();
                                                if (A6.a(intValue)) {
                                                    if (i114 != i115) {
                                                        interfaceC0346k12.set(i115, num);
                                                    }
                                                    i115++;
                                                    i52 = i83;
                                                } else {
                                                    i52 = i83;
                                                    obj6 = E1.r(i52, intValue, obj3, obj6);
                                                }
                                                i114++;
                                                i83 = i52;
                                                Q5 = i116;
                                            }
                                            i51 = Q5;
                                            i46 = i83;
                                            i47 = 1;
                                            if (i115 != size2) {
                                                interfaceC0346k12.subList(i115, size2).clear();
                                            }
                                        } else {
                                            i51 = Q5;
                                            i46 = i83;
                                            i47 = 1;
                                        }
                                        i42 = i50;
                                        i38 = i82;
                                        i37 = i48;
                                        i41 = i49;
                                        O5 = i51;
                                        h15 = h17;
                                        unsafe = unsafe4;
                                        i43 = i47;
                                        i40 = 3;
                                        objArr = objArr2;
                                        i39 = i46;
                                        v06 = v08;
                                        if (O5 != i42) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i48 = i3;
                                        i49 = i81;
                                        i50 = i72;
                                        if (i77 == 2) {
                                            C0337h1 c0337h13 = (C0337h1) interfaceC0346k12;
                                            O5 = AbstractC0325d1.O(bArr, i50, v08);
                                            int i117 = v08.f5111a + O5;
                                            while (O5 < i117) {
                                                O5 = AbstractC0325d1.O(bArr, O5, v08);
                                                c0337h13.f(AbstractC0325d1.p(v08.f5111a));
                                            }
                                            if (O5 != i117) {
                                                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i42 = i50;
                                            i38 = i82;
                                            i37 = i48;
                                            i41 = i49;
                                            v06 = v08;
                                            h15 = h17;
                                            unsafe = unsafe4;
                                            i39 = i83;
                                            i43 = 1;
                                            i40 = 3;
                                            objArr = objArr2;
                                            if (O5 != i42) {
                                            }
                                        } else {
                                            if (i77 == 0) {
                                                C0337h1 c0337h14 = (C0337h1) interfaceC0346k12;
                                                O6 = AbstractC0325d1.O(bArr, i50, v08);
                                                c0337h14.f(AbstractC0325d1.p(v08.f5111a));
                                                while (O6 < i48) {
                                                    int O15 = AbstractC0325d1.O(bArr, O6, v08);
                                                    if (i49 == v08.f5111a) {
                                                        O6 = AbstractC0325d1.O(bArr, O15, v08);
                                                        c0337h14.f(AbstractC0325d1.p(v08.f5111a));
                                                    } else {
                                                        O5 = O6;
                                                        i42 = i50;
                                                        i38 = i82;
                                                        i37 = i48;
                                                        i41 = i49;
                                                        v06 = v08;
                                                        h15 = h17;
                                                        unsafe = unsafe4;
                                                        i39 = i83;
                                                        i43 = 1;
                                                        i40 = 3;
                                                        objArr = objArr2;
                                                        if (O5 != i42) {
                                                        }
                                                    }
                                                }
                                                O5 = O6;
                                                i42 = i50;
                                                i38 = i82;
                                                i37 = i48;
                                                i41 = i49;
                                                v06 = v08;
                                                h15 = h17;
                                                unsafe = unsafe4;
                                                i39 = i83;
                                                i43 = 1;
                                                i40 = 3;
                                                objArr = objArr2;
                                                if (O5 != i42) {
                                                }
                                            }
                                            i42 = i50;
                                            i38 = i82;
                                            i37 = i48;
                                            i41 = i49;
                                            v06 = v08;
                                            h15 = h17;
                                            unsafe = unsafe4;
                                            i39 = i83;
                                            i43 = 1;
                                            i40 = 3;
                                            objArr = objArr2;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i48 = i3;
                                        i49 = i81;
                                        i50 = i72;
                                        if (i77 == 2) {
                                            AbstractC0279e.l(interfaceC0346k12);
                                            O5 = AbstractC0325d1.O(bArr, i50, v08);
                                            int i118 = v08.f5111a + O5;
                                            if (O5 < i118) {
                                                AbstractC0325d1.R(bArr, O5, v08);
                                                throw null;
                                            }
                                            if (O5 != i118) {
                                                throw new C0355n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i42 = i50;
                                            i38 = i82;
                                            i37 = i48;
                                            i41 = i49;
                                            v06 = v08;
                                            h15 = h17;
                                            unsafe = unsafe4;
                                            i39 = i83;
                                            i43 = 1;
                                            i40 = 3;
                                            objArr = objArr2;
                                            if (O5 != i42) {
                                            }
                                        } else {
                                            if (i77 == 0) {
                                                AbstractC0279e.l(interfaceC0346k12);
                                                AbstractC0325d1.R(bArr, i50, v08);
                                                throw null;
                                            }
                                            i42 = i50;
                                            i38 = i82;
                                            i37 = i48;
                                            i41 = i49;
                                            v06 = v08;
                                            h15 = h17;
                                            unsafe = unsafe4;
                                            i39 = i83;
                                            i43 = 1;
                                            i40 = 3;
                                            objArr = objArr2;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        break;
                                    default:
                                        if (i77 == 3) {
                                            int i119 = (i81 & (-8)) | 4;
                                            D1 B5 = B(i82);
                                            i49 = i81;
                                            i50 = i72;
                                            O6 = AbstractC0325d1.w(B5, bArr, i72, i3, i119, v02);
                                            interfaceC0346k12.add(v08.f5113c);
                                            int i120 = i3;
                                            while (O6 < i120) {
                                                int O16 = AbstractC0325d1.O(bArr, O6, v08);
                                                if (i49 == v08.f5111a) {
                                                    O6 = AbstractC0325d1.w(B5, bArr, O16, i3, i119, v02);
                                                    interfaceC0346k12.add(v08.f5113c);
                                                    i120 = i120;
                                                    B5 = B5;
                                                } else {
                                                    i48 = i120;
                                                    O5 = O6;
                                                    i42 = i50;
                                                    i38 = i82;
                                                    i37 = i48;
                                                    i41 = i49;
                                                    v06 = v08;
                                                    h15 = h17;
                                                    unsafe = unsafe4;
                                                    i39 = i83;
                                                    i43 = 1;
                                                    i40 = 3;
                                                    objArr = objArr2;
                                                    if (O5 != i42) {
                                                    }
                                                }
                                            }
                                            i48 = i120;
                                            O5 = O6;
                                            i42 = i50;
                                            i38 = i82;
                                            i37 = i48;
                                            i41 = i49;
                                            v06 = v08;
                                            h15 = h17;
                                            unsafe = unsafe4;
                                            i39 = i83;
                                            i43 = 1;
                                            i40 = 3;
                                            objArr = objArr2;
                                            if (O5 != i42) {
                                            }
                                        } else {
                                            i37 = i3;
                                            i38 = i82;
                                            v06 = v08;
                                            h15 = h17;
                                            unsafe = unsafe4;
                                            i39 = i83;
                                            i43 = 1;
                                            i40 = 3;
                                            objArr = objArr2;
                                            int i972222 = i72;
                                            i41 = i81;
                                            i42 = i972222;
                                            O5 = i42;
                                            if (O5 != i42) {
                                            }
                                        }
                                        break;
                                }
                            }
                        } else if (i77 == 2) {
                            T0 t03 = (T0) ((InterfaceC0346k1) unsafe4.getObject(obj3, j7));
                            boolean d7 = t03.d();
                            InterfaceC0346k1 interfaceC0346k13 = t03;
                            if (!d7) {
                                int size3 = t03.size();
                                InterfaceC0346k1 a7 = t03.a(size3 == 0 ? 10 : size3 + size3);
                                unsafe4.putObject(obj3, j7, a7);
                                interfaceC0346k13 = a7;
                            }
                            i66 = AbstractC0325d1.E(B(i82), i81, bArr, i72, i3, interfaceC0346k13, v02);
                            unsafe3 = unsafe4;
                            i71 = i81;
                            v07 = v08;
                            i64 = 3;
                            i68 = i82;
                            i69 = i80;
                            i67 = i74;
                            i65 = 1;
                            i62 = i3;
                            i63 = i6;
                        } else {
                            i15 = i80;
                            i32 = 3;
                            unsafe = unsafe4;
                            i33 = i82;
                            v05 = v08;
                            h14 = h17;
                            i34 = i74;
                            objArr = objArr2;
                            int i121 = i72;
                            i35 = i81;
                            i36 = i121;
                            i16 = i32;
                            i73 = i35;
                            h12 = h14;
                            i7 = 1;
                            i9 = i6;
                            i72 = i36;
                            i17 = i34;
                            int i902 = i33;
                            v03 = v05;
                            i68 = i902;
                        }
                    } else {
                        int i122 = iArr2[i14 + 2];
                        int i123 = 1 << (i122 >>> 20);
                        iArr = iArr2;
                        int i124 = i122 & 1048575;
                        int i125 = i69;
                        if (i124 != i125) {
                            if (i125 != 1048575) {
                                unsafe3.putInt(obj3, i125, i70);
                                i31 = 1048575;
                            } else {
                                i31 = 1048575;
                            }
                            if (i124 == i31) {
                                j2 = j7;
                                i18 = 0;
                            } else {
                                j2 = j7;
                                i18 = unsafe3.getInt(obj3, i124);
                            }
                            i19 = i124;
                        } else {
                            j2 = j7;
                            i18 = i70;
                            i19 = i125;
                        }
                        switch (x5) {
                            case 0:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                i21 = i79;
                                long j10 = j2;
                                i22 = 3;
                                z = false;
                                i23 = i74;
                                v04 = v07;
                                h13 = h17;
                                if (i77 != 1) {
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    i66 = i72 + 8;
                                    i25 = i18 | i123;
                                    M1.l(obj3, j10, Double.longBitsToDouble(AbstractC0325d1.U(i72, bArr)));
                                    i63 = i6;
                                    unsafe3 = unsafe2;
                                    i68 = i20;
                                    i64 = i22;
                                    v07 = v04;
                                    i69 = i19;
                                    i67 = i23;
                                    i71 = i21;
                                    i65 = 1;
                                    i70 = i25;
                                    i62 = i3;
                                }
                            case 1:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                h13 = h17;
                                i21 = i79;
                                long j11 = j2;
                                i22 = 3;
                                z = false;
                                i23 = i74;
                                v04 = v07;
                                if (i77 != 5) {
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    i66 = i72 + 4;
                                    int i126 = i18 | i123;
                                    M1.m(obj3, j11, Float.intBitsToFloat(AbstractC0325d1.q(i72, bArr)));
                                    i62 = i3;
                                    i63 = i6;
                                    unsafe3 = unsafe2;
                                    i68 = i20;
                                    i64 = 3;
                                    i69 = i19;
                                    i67 = i23;
                                    i71 = i21;
                                    i70 = i126;
                                    v07 = v04;
                                    i65 = 1;
                                }
                            case 2:
                            case 3:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                h13 = h17;
                                i21 = i79;
                                i22 = 3;
                                z = false;
                                i23 = i74;
                                v04 = v07;
                                long j12 = j2;
                                if (i77 != 0) {
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    int i127 = i18 | i123;
                                    int R5 = AbstractC0325d1.R(bArr, i72, v04);
                                    unsafe2.putLong(obj, j12, v04.f5112b);
                                    i62 = i3;
                                    i63 = i6;
                                    unsafe3 = unsafe2;
                                    i64 = 3;
                                    v07 = v04;
                                    i69 = i19;
                                    i67 = i23;
                                    i71 = i21;
                                    i65 = 1;
                                    i70 = i127;
                                    i66 = R5;
                                    i68 = i20;
                                }
                            case 4:
                            case 11:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                h13 = h17;
                                i21 = i79;
                                i22 = 3;
                                z = false;
                                i23 = i74;
                                v04 = v07;
                                long j13 = j2;
                                if (i77 != 0) {
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    i24 = i18 | i123;
                                    i66 = AbstractC0325d1.O(bArr, i72, v04);
                                    unsafe2.putInt(obj3, j13, v04.f5111a);
                                    i62 = i3;
                                    i63 = i6;
                                    unsafe3 = unsafe2;
                                    i68 = i20;
                                    i64 = i22;
                                    v07 = v04;
                                    i69 = i19;
                                    i67 = i23;
                                    i71 = i21;
                                    i65 = 1;
                                    i70 = i24;
                                }
                            case 5:
                            case 14:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                h13 = h17;
                                i21 = i79;
                                i22 = 3;
                                z = false;
                                i23 = i74;
                                v04 = v07;
                                long j14 = j2;
                                if (i77 != 1) {
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    i66 = i72 + 8;
                                    int i128 = i18 | i123;
                                    unsafe2.putLong(obj, j14, AbstractC0325d1.U(i72, bArr));
                                    i62 = i3;
                                    i63 = i6;
                                    unsafe3 = unsafe2;
                                    i64 = 3;
                                    v07 = v04;
                                    i69 = i19;
                                    i67 = i23;
                                    i71 = i21;
                                    i65 = 1;
                                    i70 = i128;
                                    i68 = i20;
                                }
                            case 6:
                            case 13:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                h13 = h17;
                                i21 = i79;
                                i22 = 3;
                                z = false;
                                i23 = i74;
                                v04 = v07;
                                long j15 = j2;
                                if (i77 != 5) {
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    i66 = i72 + 4;
                                    i24 = i18 | i123;
                                    unsafe2.putInt(obj3, j15, AbstractC0325d1.q(i72, bArr));
                                    i62 = i3;
                                    i63 = i6;
                                    unsafe3 = unsafe2;
                                    i68 = i20;
                                    i64 = i22;
                                    v07 = v04;
                                    i69 = i19;
                                    i67 = i23;
                                    i71 = i21;
                                    i65 = 1;
                                    i70 = i24;
                                }
                            case 7:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                h13 = h17;
                                i21 = i79;
                                i22 = 3;
                                z = false;
                                i23 = i74;
                                v04 = v07;
                                long j16 = j2;
                                if (i77 != 0) {
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    i24 = i18 | i123;
                                    i66 = AbstractC0325d1.R(bArr, i72, v04);
                                    M1.k(obj3, j16, v04.f5112b != 0);
                                    i62 = i3;
                                    i63 = i6;
                                    unsafe3 = unsafe2;
                                    i68 = i20;
                                    i64 = i22;
                                    v07 = v04;
                                    i69 = i19;
                                    i67 = i23;
                                    i71 = i21;
                                    i65 = 1;
                                    i70 = i24;
                                }
                            case 8:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                int i129 = i74;
                                h13 = h17;
                                int i130 = i79;
                                v04 = v07;
                                long j17 = j2;
                                if (i77 != 2) {
                                    i21 = i130;
                                    i23 = i129;
                                    i22 = 3;
                                    z = false;
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    if ((i78 & 536870912) != 0) {
                                        int i131 = i18 | i123;
                                        int O17 = AbstractC0325d1.O(bArr, i72, v04);
                                        int i132 = v04.f5111a;
                                        if (i132 < 0) {
                                            throw new C0355n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i132 == 0) {
                                            v04.f5113c = "";
                                            i26 = i131;
                                            i21 = i130;
                                            i23 = i129;
                                            i22 = 3;
                                        } else {
                                            int i133 = O1.f5087a;
                                            int length = bArr.length;
                                            if ((O17 | i132 | ((length - O17) - i132)) < 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(O17), Integer.valueOf(i132)));
                                            }
                                            int i134 = O17 + i132;
                                            char[] cArr = new char[i132];
                                            int i135 = 0;
                                            while (O17 < i134) {
                                                byte b6 = bArr[O17];
                                                if (AbstractC0325d1.C(b6)) {
                                                    O17++;
                                                    cArr[i135] = (char) b6;
                                                    i135++;
                                                    i129 = i129;
                                                } else {
                                                    i23 = i129;
                                                    while (O17 < i134) {
                                                        int i136 = O17 + 1;
                                                        byte b7 = bArr[O17];
                                                        if (AbstractC0325d1.C(b7)) {
                                                            cArr[i135] = (char) b7;
                                                            i135++;
                                                            O17 = i136;
                                                            while (O17 < i134) {
                                                                byte b8 = bArr[O17];
                                                                if (AbstractC0325d1.C(b8)) {
                                                                    O17++;
                                                                    cArr[i135] = (char) b8;
                                                                    i135++;
                                                                }
                                                            }
                                                        } else {
                                                            int i137 = i131;
                                                            if (b7 >= -32) {
                                                                int i138 = i130;
                                                                String str2 = str;
                                                                if (b7 < -16) {
                                                                    if (i136 >= i134 - 1) {
                                                                        throw new C0355n1(str2);
                                                                    }
                                                                    int i139 = O17 + 2;
                                                                    O17 += 3;
                                                                    AbstractC0325d1.t(b7, bArr[i136], bArr[i139], cArr, i135);
                                                                    str = str2;
                                                                    i135++;
                                                                } else {
                                                                    if (i136 >= i134 - 2) {
                                                                        throw new C0355n1(str2);
                                                                    }
                                                                    byte b9 = bArr[i136];
                                                                    int i140 = O17 + 3;
                                                                    byte b10 = bArr[O17 + 2];
                                                                    O17 += 4;
                                                                    AbstractC0325d1.h(b7, b9, b10, bArr[i140], cArr, i135);
                                                                    i135 += 2;
                                                                    str = str2;
                                                                }
                                                                i130 = i138;
                                                            } else {
                                                                if (i136 >= i134) {
                                                                    throw new C0355n1(str);
                                                                }
                                                                O17 += 2;
                                                                AbstractC0325d1.y(b7, bArr[i136], cArr, i135);
                                                                i135++;
                                                            }
                                                            i131 = i137;
                                                        }
                                                    }
                                                    i26 = i131;
                                                    i21 = i130;
                                                    i22 = 3;
                                                    v04.f5113c = new String(cArr, 0, i135);
                                                    O17 = i134;
                                                }
                                            }
                                            i23 = i129;
                                            while (O17 < i134) {
                                            }
                                            i26 = i131;
                                            i21 = i130;
                                            i22 = 3;
                                            v04.f5113c = new String(cArr, 0, i135);
                                            O17 = i134;
                                        }
                                        i25 = i26;
                                        i66 = O17;
                                    } else {
                                        i21 = i130;
                                        i23 = i129;
                                        i22 = 3;
                                        int O18 = AbstractC0325d1.O(bArr, i72, v04);
                                        int i141 = v04.f5111a;
                                        if (i141 < 0) {
                                            throw new C0355n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        i25 = i18 | i123;
                                        if (i141 == 0) {
                                            v04.f5113c = "";
                                        } else {
                                            v04.f5113c = new String(bArr, O18, i141, AbstractC0349l1.f5205a);
                                            O18 += i141;
                                        }
                                        i66 = O18;
                                    }
                                    unsafe2.putObject(obj3, j17, v04.f5113c);
                                    i63 = i6;
                                    unsafe3 = unsafe2;
                                    i68 = i20;
                                    i64 = i22;
                                    v07 = v04;
                                    i69 = i19;
                                    i67 = i23;
                                    i71 = i21;
                                    i65 = 1;
                                    i70 = i25;
                                    i62 = i3;
                                }
                            case 9:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                i27 = i74;
                                h13 = h17;
                                i28 = i79;
                                i29 = 3;
                                v04 = v07;
                                if (i77 != 2) {
                                    i21 = i28;
                                    i22 = i29;
                                    i23 = i27;
                                    z = false;
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    int i142 = i18 | i123;
                                    Object C2 = C(i20, obj3);
                                    i62 = i3;
                                    int T5 = AbstractC0325d1.T(C2, B(i20), bArr, i72, i62, v02);
                                    m(obj3, i20, C2);
                                    i63 = i6;
                                    i71 = i28;
                                    i68 = i20;
                                    v07 = v04;
                                    i64 = 3;
                                    i65 = 1;
                                    i66 = T5;
                                    unsafe3 = unsafe2;
                                    i67 = i27;
                                    int i143 = i19;
                                    i70 = i142;
                                    i69 = i143;
                                }
                            case 10:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                i27 = i74;
                                h13 = h17;
                                i28 = i79;
                                i29 = 3;
                                v04 = v07;
                                long j18 = j2;
                                if (i77 != 2) {
                                    i21 = i28;
                                    i22 = i29;
                                    i23 = i27;
                                    z = false;
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    int i144 = i18 | i123;
                                    int d8 = AbstractC0325d1.d(bArr, i72, v04);
                                    unsafe2.putObject(obj3, j18, v04.f5113c);
                                    i62 = i3;
                                    i63 = i6;
                                    i71 = i28;
                                    i64 = 3;
                                    i68 = i20;
                                    v07 = v04;
                                    i69 = i19;
                                    i65 = 1;
                                    i70 = i144;
                                    i66 = d8;
                                    int i145 = i27;
                                    unsafe3 = unsafe2;
                                    i67 = i145;
                                }
                            case 12:
                                i20 = i14;
                                unsafe2 = unsafe3;
                                i27 = i74;
                                i21 = i79;
                                i30 = 3;
                                v04 = v07;
                                long j19 = j2;
                                if (i77 != 0) {
                                    i22 = i30;
                                    i23 = i27;
                                    h13 = h17;
                                    z = false;
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    i66 = AbstractC0325d1.O(bArr, i72, v04);
                                    int i146 = v04.f5111a;
                                    InterfaceC0340i1 A7 = A(i20);
                                    if ((i78 & Integer.MIN_VALUE) == 0 || A7 == null || A7.a(i146)) {
                                        int i147 = i18 | i123;
                                        unsafe2.putInt(obj3, j19, i146);
                                        i63 = i6;
                                        i71 = i21;
                                        i64 = 3;
                                        i68 = i20;
                                        v07 = v04;
                                        i69 = i19;
                                        i65 = 1;
                                        i70 = i147;
                                        i62 = i3;
                                    } else {
                                        AbstractC0334g1 abstractC0334g12 = (AbstractC0334g1) obj3;
                                        H1 h110 = abstractC0334g12.zzc;
                                        if (h110 == h17) {
                                            h110 = H1.b();
                                            abstractC0334g12.zzc = h110;
                                        }
                                        h110.c(i21, Long.valueOf(i146));
                                        i62 = i3;
                                        i71 = i21;
                                        i64 = 3;
                                        i68 = i20;
                                        v07 = v04;
                                        i69 = i19;
                                        i65 = 1;
                                        i70 = i18;
                                        i63 = i6;
                                    }
                                    int i1452 = i27;
                                    unsafe3 = unsafe2;
                                    i67 = i1452;
                                }
                            case 15:
                                i20 = i14;
                                Unsafe unsafe8 = unsafe3;
                                i27 = i74;
                                i21 = i79;
                                i30 = 3;
                                v04 = v07;
                                if (i77 != 0) {
                                    unsafe2 = unsafe8;
                                    i22 = i30;
                                    i23 = i27;
                                    h13 = h17;
                                    z = false;
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    int i148 = i18 | i123;
                                    i66 = AbstractC0325d1.O(bArr, i72, v04);
                                    unsafe2 = unsafe8;
                                    unsafe2.putInt(obj3, j2, AbstractC0325d1.p(v04.f5111a));
                                    i62 = i3;
                                    i63 = i6;
                                    i64 = 3;
                                    i68 = i20;
                                    v07 = v04;
                                    i69 = i19;
                                    i71 = i21;
                                    i65 = 1;
                                    i70 = i148;
                                    int i14522 = i27;
                                    unsafe3 = unsafe2;
                                    i67 = i14522;
                                }
                            case 16:
                                int i149 = i14;
                                Unsafe unsafe9 = unsafe3;
                                i21 = i79;
                                if (i77 != 0) {
                                    i20 = i149;
                                    v04 = v07;
                                    i22 = 3;
                                    i23 = i74;
                                    unsafe2 = unsafe9;
                                    h13 = h17;
                                    z = false;
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    int i150 = i18 | i123;
                                    int R6 = AbstractC0325d1.R(bArr, i72, v07);
                                    unsafe9.putLong(obj, j2, AbstractC0325d1.x(v07.f5112b));
                                    i62 = i3;
                                    i63 = i6;
                                    i64 = 3;
                                    i68 = i149;
                                    v07 = v07;
                                    i69 = i19;
                                    i71 = i21;
                                    i65 = 1;
                                    i70 = i150;
                                    i66 = R6;
                                    i67 = i74;
                                    unsafe3 = unsafe9;
                                }
                            default:
                                if (i77 != 3) {
                                    i20 = i14;
                                    unsafe2 = unsafe3;
                                    h13 = h17;
                                    i21 = i79;
                                    i22 = 3;
                                    i23 = i74;
                                    z = false;
                                    v04 = v07;
                                    unsafe = unsafe2;
                                    i68 = i20;
                                    i16 = i22;
                                    v03 = v04;
                                    i15 = i19;
                                    h12 = h13;
                                    i17 = i23;
                                    i73 = i21;
                                    i7 = 1;
                                    objArr = objArr2;
                                    i9 = i6;
                                    i70 = i18;
                                    break;
                                } else {
                                    i24 = i18 | i123;
                                    Object C5 = C(i14, obj3);
                                    int i151 = i14;
                                    i66 = AbstractC0325d1.S(C5, B(i14), bArr, i72, i3, (i74 << 3) | 4, v02);
                                    m(obj3, i151, C5);
                                    i62 = i3;
                                    i68 = i151;
                                    i67 = i74;
                                    i69 = i19;
                                    unsafe3 = unsafe3;
                                    i71 = i79;
                                    i64 = 3;
                                    i65 = 1;
                                    i63 = i6;
                                    i70 = i24;
                                }
                        }
                    }
                } else {
                    iArr = iArr2;
                    h12 = h17;
                    objArr = objArr2;
                    unsafe = unsafe3;
                    i15 = i69;
                    i7 = 1;
                    i16 = i64;
                    v03 = v07;
                    i68 = i13;
                    i9 = i63;
                    i17 = i74;
                }
                if (i73 != i9 || i9 == 0) {
                    AbstractC0334g1 abstractC0334g13 = (AbstractC0334g1) obj3;
                    H1 h111 = abstractC0334g13.zzc;
                    if (h111 == h12) {
                        h111 = H1.b();
                        abstractC0334g13.zzc = h111;
                    }
                    int i152 = i17;
                    int M5 = AbstractC0325d1.M(i73, bArr, i72, i3, h111, v02);
                    i71 = i73;
                    i63 = i9;
                    v07 = v03;
                    i62 = i3;
                    i64 = i16;
                    i69 = i15;
                    unsafe3 = unsafe;
                    i66 = M5;
                    i65 = i7;
                    i67 = i152;
                } else {
                    i8 = i3;
                    i11 = i73;
                    i10 = i70;
                    i12 = i15;
                    i66 = i72;
                }
            } else {
                iArr = iArr2;
                objArr = objArr2;
                unsafe = unsafe3;
                i7 = i65;
                i8 = i62;
                i9 = i63;
                i10 = i70;
                i11 = i71;
                i12 = i69;
            }
        }
    }

    public final int w(int i2, int i3) {
        int[] iArr = this.f5277a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i6 = (length + i3) >>> 1;
            int i7 = i6 * 3;
            int i8 = iArr[i7];
            if (i2 == i8) {
                return i7;
            }
            if (i2 < i8) {
                length = i6 - 1;
            } else {
                i3 = i6 + 1;
            }
        }
        return -1;
    }

    public final int y(int i2) {
        return this.f5277a[i2 + 1];
    }
}
