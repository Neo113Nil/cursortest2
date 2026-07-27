package androidx.datastore.preferences.protobuf;

import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.impl.C0793l9;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class M implements V {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f4372n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f4373o = i0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4374a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4375b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4376c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4377d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0206a f4378e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4379f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4380g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4381h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4382i;

    /* renamed from: j, reason: collision with root package name */
    public final O f4383j;

    /* renamed from: k, reason: collision with root package name */
    public final B f4384k;

    /* renamed from: l, reason: collision with root package name */
    public final d0 f4385l;

    /* renamed from: m, reason: collision with root package name */
    public final I f4386m;

    public M(int[] iArr, Object[] objArr, int i2, int i3, AbstractC0206a abstractC0206a, int[] iArr2, int i6, int i7, O o2, B b6, d0 d0Var, C0220o c0220o, I i8) {
        this.f4374a = iArr;
        this.f4375b = objArr;
        this.f4376c = i2;
        this.f4377d = i3;
        this.f4379f = abstractC0206a instanceof AbstractC0226v;
        this.f4380g = iArr2;
        this.f4381h = i6;
        this.f4382i = i7;
        this.f4383j = o2;
        this.f4384k = b6;
        this.f4385l = d0Var;
        this.f4378e = abstractC0206a;
        this.f4386m = i8;
    }

    public static long A(long j2, Object obj) {
        return ((Long) i0.f4457b.h(j2, obj)).longValue();
    }

    public static Field G(String str, Class cls) {
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
        if (obj instanceof AbstractC0226v) {
            return ((AbstractC0226v) obj).i();
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
    public static M x(U u5, O o2, B b6, d0 d0Var, C0220o c0220o, I i2) {
        int i3;
        int charAt;
        int charAt2;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char charAt3;
        int i12;
        char charAt4;
        int i13;
        char charAt5;
        int i14;
        char charAt6;
        int i15;
        char charAt7;
        int i16;
        char charAt8;
        int i17;
        char charAt9;
        int i18;
        char charAt10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Field G5;
        int i31;
        char charAt11;
        int i32;
        int i33;
        Object obj;
        Field G6;
        Object obj2;
        Field G7;
        int i34;
        char charAt12;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        int i37;
        char charAt15;
        String c2 = u5.c();
        int length = c2.length();
        char c6 = 55296;
        if (c2.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i3 = i38 + 1;
                if (c2.charAt(i38) < 55296) {
                    break;
                }
                i38 = i3;
            }
        } else {
            i3 = 1;
        }
        int i39 = i3 + 1;
        int charAt16 = c2.charAt(i3);
        if (charAt16 >= 55296) {
            int i40 = charAt16 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                charAt15 = c2.charAt(i39);
                if (charAt15 < 55296) {
                    break;
                }
                i40 |= (charAt15 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            charAt16 = i40 | (charAt15 << i41);
            i39 = i37;
        }
        if (charAt16 == 0) {
            i8 = 0;
            charAt = 0;
            charAt2 = 0;
            i7 = 0;
            i10 = 0;
            i9 = 0;
            iArr = f4372n;
            i6 = 0;
        } else {
            int i42 = i39 + 1;
            int charAt17 = c2.charAt(i39);
            if (charAt17 >= 55296) {
                int i43 = charAt17 & 8191;
                int i44 = 13;
                while (true) {
                    i18 = i42 + 1;
                    charAt10 = c2.charAt(i42);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i43 |= (charAt10 & 8191) << i44;
                    i44 += 13;
                    i42 = i18;
                }
                charAt17 = i43 | (charAt10 << i44);
                i42 = i18;
            }
            int i45 = i42 + 1;
            int charAt18 = c2.charAt(i42);
            if (charAt18 >= 55296) {
                int i46 = charAt18 & 8191;
                int i47 = 13;
                while (true) {
                    i17 = i45 + 1;
                    charAt9 = c2.charAt(i45);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i46 |= (charAt9 & 8191) << i47;
                    i47 += 13;
                    i45 = i17;
                }
                charAt18 = i46 | (charAt9 << i47);
                i45 = i17;
            }
            int i48 = i45 + 1;
            int charAt19 = c2.charAt(i45);
            if (charAt19 >= 55296) {
                int i49 = charAt19 & 8191;
                int i50 = 13;
                while (true) {
                    i16 = i48 + 1;
                    charAt8 = c2.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i16;
                }
                charAt19 = i49 | (charAt8 << i50);
                i48 = i16;
            }
            int i51 = i48 + 1;
            int charAt20 = c2.charAt(i48);
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i15 = i51 + 1;
                    charAt7 = c2.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i15;
                }
                charAt20 = i52 | (charAt7 << i53);
                i51 = i15;
            }
            int i54 = i51 + 1;
            charAt = c2.charAt(i51);
            if (charAt >= 55296) {
                int i55 = charAt & 8191;
                int i56 = 13;
                while (true) {
                    i14 = i54 + 1;
                    charAt6 = c2.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i14;
                }
                charAt = i55 | (charAt6 << i56);
                i54 = i14;
            }
            int i57 = i54 + 1;
            charAt2 = c2.charAt(i54);
            if (charAt2 >= 55296) {
                int i58 = charAt2 & 8191;
                int i59 = 13;
                while (true) {
                    i13 = i57 + 1;
                    charAt5 = c2.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i13;
                }
                charAt2 = i58 | (charAt5 << i59);
                i57 = i13;
            }
            int i60 = i57 + 1;
            int charAt21 = c2.charAt(i57);
            if (charAt21 >= 55296) {
                int i61 = charAt21 & 8191;
                int i62 = 13;
                while (true) {
                    i12 = i60 + 1;
                    charAt4 = c2.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i12;
                }
                charAt21 = i61 | (charAt4 << i62);
                i60 = i12;
            }
            int i63 = i60 + 1;
            int charAt22 = c2.charAt(i60);
            if (charAt22 >= 55296) {
                int i64 = charAt22 & 8191;
                int i65 = 13;
                while (true) {
                    i11 = i63 + 1;
                    charAt3 = c2.charAt(i63);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i11;
                }
                charAt22 = i64 | (charAt3 << i65);
                i63 = i11;
            }
            int i66 = (charAt17 * 2) + charAt18;
            i6 = charAt17;
            i39 = i63;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i7 = charAt19;
            i8 = i66;
            i9 = charAt22;
            i10 = charAt20;
        }
        Unsafe unsafe = f4373o;
        Object[] b7 = u5.b();
        Class<?> cls = u5.a().getClass();
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[charAt * 2];
        int i67 = i9 + charAt2;
        int i68 = i9;
        int i69 = i67;
        int i70 = 0;
        int i71 = 0;
        while (i39 < length) {
            int i72 = i39 + 1;
            int charAt23 = c2.charAt(i39);
            if (charAt23 >= c6) {
                int i73 = charAt23 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i36 = i74 + 1;
                    charAt14 = c2.charAt(i74);
                    if (charAt14 < c6) {
                        break;
                    }
                    i73 |= (charAt14 & 8191) << i75;
                    i75 += 13;
                    i74 = i36;
                }
                charAt23 = i73 | (charAt14 << i75);
                i19 = i36;
            } else {
                i19 = i72;
            }
            int i76 = i19 + 1;
            int charAt24 = c2.charAt(i19);
            if (charAt24 >= c6) {
                int i77 = charAt24 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i35 = i78 + 1;
                    charAt13 = c2.charAt(i78);
                    i20 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i77 |= (charAt13 & 8191) << i79;
                    i79 += 13;
                    i78 = i35;
                    length = i20;
                }
                charAt24 = i77 | (charAt13 << i79);
                i21 = i35;
            } else {
                i20 = length;
                i21 = i76;
            }
            int i80 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i81 = i9;
            if ((charAt24 & 1024) != 0) {
                iArr[i70] = i71;
                i70++;
            }
            if (i80 >= 51) {
                int i82 = i21 + 1;
                int charAt25 = c2.charAt(i21);
                i22 = i70;
                char c7 = 55296;
                if (charAt25 >= 55296) {
                    int i83 = charAt25 & 8191;
                    int i84 = 13;
                    while (true) {
                        i34 = i82 + 1;
                        charAt12 = c2.charAt(i82);
                        if (charAt12 < c7) {
                            break;
                        }
                        i83 |= (charAt12 & 8191) << i84;
                        i84 += 13;
                        i82 = i34;
                        c7 = 55296;
                    }
                    charAt25 = i83 | (charAt12 << i84);
                    i82 = i34;
                }
                int i85 = i80 - 51;
                int i86 = i82;
                if (i85 == 9 || i85 == 17) {
                    i33 = i8 + 1;
                    objArr[((i71 / 3) * 2) + 1] = b7[i8];
                } else {
                    if (i85 == 12 && (O.j.a(u5.d(), 1) || (charAt24 & 2048) != 0)) {
                        i33 = i8 + 1;
                        objArr[((i71 / 3) * 2) + 1] = b7[i8];
                    }
                    int i87 = charAt25 * 2;
                    obj = b7[i87];
                    if (obj instanceof Field) {
                        G6 = G((String) obj, cls);
                        b7[i87] = G6;
                    } else {
                        G6 = (Field) obj;
                    }
                    int i88 = i7;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(G6);
                    int i89 = i87 + 1;
                    obj2 = b7[i89];
                    int i90 = i8;
                    if (obj2 instanceof Field) {
                        G7 = G((String) obj2, cls);
                        b7[i89] = G7;
                    } else {
                        G7 = (Field) obj2;
                    }
                    i30 = (int) unsafe.objectFieldOffset(G7);
                    i29 = objectFieldOffset;
                    i27 = i86;
                    i28 = 0;
                    i23 = i10;
                    i24 = i88;
                    i25 = i90;
                }
                i8 = i33;
                int i872 = charAt25 * 2;
                obj = b7[i872];
                if (obj instanceof Field) {
                }
                int i882 = i7;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(G6);
                int i892 = i872 + 1;
                obj2 = b7[i892];
                int i902 = i8;
                if (obj2 instanceof Field) {
                }
                i30 = (int) unsafe.objectFieldOffset(G7);
                i29 = objectFieldOffset2;
                i27 = i86;
                i28 = 0;
                i23 = i10;
                i24 = i882;
                i25 = i902;
            } else {
                i22 = i70;
                int i91 = i7;
                int i92 = i8 + 1;
                Field G8 = G((String) b7[i8], cls);
                i23 = i10;
                if (i80 == 9 || i80 == 17) {
                    i24 = i91;
                    objArr[((i71 / 3) * 2) + 1] = G8.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        i24 = i91;
                        i32 = i8 + 2;
                        objArr[((i71 / 3) * 2) + 1] = b7[i92];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        i24 = i91;
                        if (u5.d() == 1 || (charAt24 & 2048) != 0) {
                            i32 = i8 + 2;
                            objArr[((i71 / 3) * 2) + 1] = b7[i92];
                        }
                    } else {
                        if (i80 == 50) {
                            int i93 = i68 + 1;
                            iArr[i68] = i71;
                            int i94 = (i71 / 3) * 2;
                            int i95 = i8 + 2;
                            objArr[i94] = b7[i92];
                            if ((charAt24 & 2048) != 0) {
                                i92 = i8 + 3;
                                objArr[i94 + 1] = b7[i95];
                                i68 = i93;
                            } else {
                                i68 = i93;
                                i92 = i95;
                            }
                        }
                        i24 = i91;
                    }
                    i92 = i32;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(G8);
                if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) == 0 || i80 > 17) {
                    i25 = i92;
                    i26 = 1048575;
                    i27 = i21;
                    i28 = 0;
                } else {
                    int i96 = i21 + 1;
                    int charAt26 = c2.charAt(i21);
                    if (charAt26 >= 55296) {
                        int i97 = charAt26 & 8191;
                        int i98 = 13;
                        while (true) {
                            i31 = i96 + 1;
                            charAt11 = c2.charAt(i96);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i97 |= (charAt11 & 8191) << i98;
                            i98 += 13;
                            i96 = i31;
                        }
                        charAt26 = i97 | (charAt11 << i98);
                        i96 = i31;
                    }
                    int i99 = (charAt26 / 32) + (i6 * 2);
                    Object obj3 = b7[i99];
                    if (obj3 instanceof Field) {
                        G5 = (Field) obj3;
                    } else {
                        G5 = G((String) obj3, cls);
                        b7[i99] = G5;
                    }
                    i25 = i92;
                    i27 = i96;
                    i26 = (int) unsafe.objectFieldOffset(G5);
                    i28 = charAt26 % 32;
                }
                if (i80 >= 18 && i80 <= 49) {
                    iArr[i69] = objectFieldOffset3;
                    i69++;
                }
                int i100 = i26;
                i29 = objectFieldOffset3;
                i30 = i100;
            }
            int i101 = i71 + 1;
            iArr2[i71] = charAt23;
            int i102 = i71 + 2;
            String str = c2;
            iArr2[i101] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20) | i29;
            i71 += 3;
            iArr2[i102] = (i28 << 20) | i30;
            i8 = i25;
            i9 = i81;
            i39 = i27;
            i70 = i22;
            length = i20;
            i7 = i24;
            c2 = str;
            i10 = i23;
            c6 = 55296;
        }
        return new M(iArr2, objArr, i7, i10, u5.a(), iArr, i9, i67, o2, b6, d0Var, c0220o, i2);
    }

    public static long y(int i2) {
        return i2 & 1048575;
    }

    public static int z(long j2, Object obj) {
        return ((Integer) i0.f4457b.h(j2, obj)).intValue();
    }

    public final int B(int i2) {
        if (i2 < this.f4376c || i2 > this.f4377d) {
            return -1;
        }
        int[] iArr = this.f4374a;
        int length = (iArr.length / 3) - 1;
        int i3 = 0;
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

    public final void C(Object obj, long j2, C0215j c0215j, V v4, C0219n c0219n) {
        int u5;
        this.f4384k.getClass();
        InterfaceC0227w b6 = B.b(j2, obj);
        int i2 = c0215j.f4462a;
        if ((i2 & 7) != 3) {
            throw C0230z.b();
        }
        do {
            AbstractC0226v i3 = v4.i();
            c0215j.b(i3, v4, c0219n);
            v4.d(i3);
            ((T) b6).add(i3);
            R4.c cVar = (R4.c) c0215j.f4465d;
            if (cVar.c() || c0215j.f4464c != 0) {
                return;
            } else {
                u5 = cVar.u();
            }
        } while (u5 == i2);
        c0215j.f4464c = u5;
    }

    public final void D(Object obj, int i2, C0215j c0215j, V v4, C0219n c0219n) {
        int u5;
        this.f4384k.getClass();
        InterfaceC0227w b6 = B.b(i2 & 1048575, obj);
        int i3 = c0215j.f4462a;
        if ((i3 & 7) != 2) {
            throw C0230z.b();
        }
        do {
            AbstractC0226v i6 = v4.i();
            c0215j.c(i6, v4, c0219n);
            v4.d(i6);
            ((T) b6).add(i6);
            R4.c cVar = (R4.c) c0215j.f4465d;
            if (cVar.c() || c0215j.f4464c != 0) {
                return;
            } else {
                u5 = cVar.u();
            }
        } while (u5 == i3);
        c0215j.f4464c = u5;
    }

    public final void E(int i2, C0215j c0215j, Object obj) {
        if ((536870912 & i2) != 0) {
            c0215j.x(2);
            i0.o(i2 & 1048575, obj, ((R4.c) c0215j.f4465d).t());
        } else if (!this.f4379f) {
            i0.o(i2 & 1048575, obj, c0215j.e());
        } else {
            c0215j.x(2);
            i0.o(i2 & 1048575, obj, ((R4.c) c0215j.f4465d).s());
        }
    }

    public final void F(int i2, C0215j c0215j, Object obj) {
        boolean z = (536870912 & i2) != 0;
        B b6 = this.f4384k;
        if (z) {
            b6.getClass();
            c0215j.t(B.b(i2 & 1048575, obj), true);
        } else {
            b6.getClass();
            c0215j.t(B.b(i2 & 1048575, obj), false);
        }
    }

    public final void H(int i2, Object obj) {
        int i3 = this.f4374a[i2 + 2];
        long j2 = 1048575 & i3;
        if (j2 == 1048575) {
            return;
        }
        i0.m(obj, j2, (1 << (i3 >>> 20)) | i0.f4457b.f(j2, obj));
    }

    public final void I(int i2, int i3, Object obj) {
        i0.m(obj, this.f4374a[i3 + 2] & 1048575, i2);
    }

    public final void J(Object obj, int i2, AbstractC0206a abstractC0206a) {
        f4373o.putObject(obj, M(i2) & 1048575, abstractC0206a);
        H(i2, obj);
    }

    public final void K(Object obj, int i2, int i3, AbstractC0206a abstractC0206a) {
        f4373o.putObject(obj, M(i3) & 1048575, abstractC0206a);
        I(i2, i3, obj);
    }

    public final int M(int i2) {
        return this.f4374a[i2 + 1];
    }

    public final void N(Object obj, E e3) {
        int i2;
        int i3;
        int i6;
        int i7;
        int[] iArr = this.f4374a;
        int length = iArr.length;
        Unsafe unsafe = f4373o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int M5 = M(i11);
            int i12 = iArr[i11];
            int L5 = L(M5);
            if (L5 <= 17) {
                int i13 = iArr[i11 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i10 = i14 == i8 ? 0 : unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i2 = i9;
                i3 = i10;
                i6 = 1 << (i13 >>> 20);
            } else {
                i2 = i9;
                i3 = i10;
                i6 = 0;
            }
            long j2 = M5 & i8;
            switch (L5) {
                case 0:
                    i7 = i2;
                    if (!o(obj, i11, i7, i3, i6)) {
                        break;
                    } else {
                        e3.c(i12, i0.f4457b.d(j2, obj));
                        continue;
                    }
                case 1:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.g(i12, i0.f4457b.e(j2, obj));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.j(i12, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.q(i12, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.i(i12, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.f(i12, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.e(i12, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.a(i12, i0.f4457b.c(j2, obj));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((C0217l) e3.f4362a).r0(i12, (String) object);
                            break;
                        } else {
                            e3.b(i12, (C0212g) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.k(i12, unsafe.getObject(obj, j2), m(i11));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.b(i12, (C0212g) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.p(i12, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.d(i12, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.l(i12, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.m(i12, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.n(i12, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i7 = i2;
                    if (o(obj, i11, i7, i3, i6)) {
                        e3.o(i12, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i7 = i2;
                    if (o(obj, i11, i2, i3, i6)) {
                        e3.h(i12, unsafe.getObject(obj, j2), m(i11));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    W.E(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case C0793l9.f8681C /* 19 */:
                    W.I(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case C0793l9.f8682D /* 20 */:
                    W.L(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case C0793l9.f8683E /* 21 */:
                    W.T(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case 22:
                    W.K(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case 23:
                    W.H(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case 24:
                    W.G(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case C0793l9.f8684F /* 25 */:
                    W.C(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case 26:
                    W.R(iArr[i11], (List) unsafe.getObject(obj, j2), e3);
                    break;
                case C0793l9.f8686H /* 27 */:
                    W.M(iArr[i11], (List) unsafe.getObject(obj, j2), e3, m(i11));
                    break;
                case 28:
                    W.D(iArr[i11], (List) unsafe.getObject(obj, j2), e3);
                    break;
                case C0793l9.f8687I /* 29 */:
                    W.S(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case 30:
                    W.F(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case 31:
                    W.N(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case 32:
                    W.O(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case 33:
                    W.P(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case 34:
                    W.Q(iArr[i11], (List) unsafe.getObject(obj, j2), e3, false);
                    break;
                case C0793l9.f8688J /* 35 */:
                    W.E(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 36:
                    W.I(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 37:
                    W.L(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case C0793l9.f8689K /* 38 */:
                    W.T(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 39:
                    W.K(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case C0793l9.f8690L /* 40 */:
                    W.H(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 41:
                    W.G(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case C0793l9.f8691M /* 42 */:
                    W.C(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 43:
                    W.S(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 44:
                    W.F(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 45:
                    W.N(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 46:
                    W.O(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 47:
                    W.P(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 48:
                    W.Q(iArr[i11], (List) unsafe.getObject(obj, j2), e3, true);
                    break;
                case 49:
                    W.J(iArr[i11], (List) unsafe.getObject(obj, j2), e3, m(i11));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        int i15 = 2;
                        Object obj2 = this.f4375b[(i11 / 3) * 2];
                        this.f4386m.getClass();
                        F f3 = ((G) obj2).f4366a;
                        C0217l c0217l = (C0217l) e3.f4362a;
                        c0217l.getClass();
                        for (Map.Entry entry : ((H) object2).entrySet()) {
                            c0217l.t0(i12, i15);
                            c0217l.v0(G.a(f3, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0222q.b(c0217l, f3.f4363a, 1, key);
                            C0222q.b(c0217l, f3.f4364b, 2, value);
                            i15 = 2;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (q(i12, i11, obj)) {
                        e3.c(i12, ((Double) i0.f4457b.h(j2, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (q(i12, i11, obj)) {
                        e3.g(i12, ((Float) i0.f4457b.h(j2, obj)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (q(i12, i11, obj)) {
                        e3.j(i12, A(j2, obj));
                        break;
                    }
                    break;
                case 54:
                    if (q(i12, i11, obj)) {
                        e3.q(i12, A(j2, obj));
                        break;
                    }
                    break;
                case 55:
                    if (q(i12, i11, obj)) {
                        e3.i(i12, z(j2, obj));
                        break;
                    }
                    break;
                case 56:
                    if (q(i12, i11, obj)) {
                        e3.f(i12, A(j2, obj));
                        break;
                    }
                    break;
                case 57:
                    if (q(i12, i11, obj)) {
                        e3.e(i12, z(j2, obj));
                        break;
                    }
                    break;
                case 58:
                    if (q(i12, i11, obj)) {
                        e3.a(i12, ((Boolean) i0.f4457b.h(j2, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (q(i12, i11, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            ((C0217l) e3.f4362a).r0(i12, (String) object3);
                            break;
                        } else {
                            e3.b(i12, (C0212g) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (q(i12, i11, obj)) {
                        e3.k(i12, unsafe.getObject(obj, j2), m(i11));
                        break;
                    }
                    break;
                case 61:
                    if (q(i12, i11, obj)) {
                        e3.b(i12, (C0212g) unsafe.getObject(obj, j2));
                        break;
                    }
                    break;
                case 62:
                    if (q(i12, i11, obj)) {
                        e3.p(i12, z(j2, obj));
                        break;
                    }
                    break;
                case 63:
                    if (q(i12, i11, obj)) {
                        e3.d(i12, z(j2, obj));
                        break;
                    }
                    break;
                case 64:
                    if (q(i12, i11, obj)) {
                        e3.l(i12, z(j2, obj));
                        break;
                    }
                    break;
                case 65:
                    if (q(i12, i11, obj)) {
                        e3.m(i12, A(j2, obj));
                        break;
                    }
                    break;
                case 66:
                    if (q(i12, i11, obj)) {
                        e3.n(i12, z(j2, obj));
                        break;
                    }
                    break;
                case 67:
                    if (q(i12, i11, obj)) {
                        e3.o(i12, A(j2, obj));
                        break;
                    }
                    break;
                case 68:
                    if (q(i12, i11, obj)) {
                        e3.h(i12, unsafe.getObject(obj, j2), m(i11));
                        break;
                    }
                    break;
            }
            i7 = i2;
            i11 += 3;
            i9 = i7;
            i10 = i3;
            i8 = 1048575;
        }
        this.f4385l.getClass();
        ((AbstractC0226v) obj).unknownFields.d(e3);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void a(Object obj, Object obj2) {
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f4374a;
            if (i2 >= iArr.length) {
                W.A(this.f4385l, obj, obj2);
                return;
            }
            int M5 = M(i2);
            long j2 = 1048575 & M5;
            int i3 = iArr[i2];
            switch (L(M5)) {
                case 0:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        h0 h0Var = i0.f4457b;
                        h0Var.l(obj, j2, h0Var.d(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 1:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        h0 h0Var2 = i0.f4457b;
                        h0Var2.m(obj, j2, h0Var2.e(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 2:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j2, i0.f4457b.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 3:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j2, i0.f4457b.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 4:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j2, i0.f4457b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 5:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j2, i0.f4457b.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 6:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j2, i0.f4457b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 7:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        h0 h0Var3 = i0.f4457b;
                        h0Var3.j(obj, j2, h0Var3.c(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 8:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.o(j2, obj, i0.f4457b.h(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 9:
                    t(obj, i2, obj2);
                    break;
                case 10:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.o(j2, obj, i0.f4457b.h(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 11:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j2, i0.f4457b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 12:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j2, i0.f4457b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 13:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j2, i0.f4457b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 14:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j2, i0.f4457b.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 15:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.m(obj, j2, i0.f4457b.f(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 16:
                    if (!n(i2, obj2)) {
                        break;
                    } else {
                        i0.n(obj, j2, i0.f4457b.g(j2, obj2));
                        H(i2, obj);
                        break;
                    }
                case 17:
                    t(obj, i2, obj2);
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
                    this.f4384k.getClass();
                    h0 h0Var4 = i0.f4457b;
                    InterfaceC0227w interfaceC0227w = (InterfaceC0227w) h0Var4.h(j2, obj);
                    InterfaceC0227w interfaceC0227w2 = (InterfaceC0227w) h0Var4.h(j2, obj2);
                    T t5 = (T) interfaceC0227w;
                    int i6 = t5.f4397c;
                    int i7 = ((T) interfaceC0227w2).f4397c;
                    if (i6 > 0 && i7 > 0) {
                        if (!((AbstractC0207b) interfaceC0227w).f4419a) {
                            interfaceC0227w = t5.d(i7 + i6);
                        }
                        ((AbstractC0207b) interfaceC0227w).addAll(interfaceC0227w2);
                    }
                    if (i6 > 0) {
                        interfaceC0227w2 = interfaceC0227w;
                    }
                    i0.o(j2, obj, interfaceC0227w2);
                    break;
                case 50:
                    Class cls = W.f4402a;
                    h0 h0Var5 = i0.f4457b;
                    Object h3 = h0Var5.h(j2, obj);
                    Object h6 = h0Var5.h(j2, obj2);
                    this.f4386m.getClass();
                    i0.o(j2, obj, I.b(h3, h6));
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
                    if (!q(i3, i2, obj2)) {
                        break;
                    } else {
                        i0.o(j2, obj, i0.f4457b.h(j2, obj2));
                        I(i3, i2, obj);
                        break;
                    }
                case 60:
                    u(obj, i2, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!q(i3, i2, obj2)) {
                        break;
                    } else {
                        i0.o(j2, obj, i0.f4457b.h(j2, obj2));
                        I(i3, i2, obj);
                        break;
                    }
                case 68:
                    u(obj, i2, obj2);
                    break;
            }
            i2 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, E e3) {
        e3.getClass();
        N(obj, e3);
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
    public final int c(AbstractC0226v abstractC0226v) {
        int i2;
        int b6;
        int i3;
        int[] iArr = this.f4374a;
        int length = iArr.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int M5 = M(i7);
            int i8 = iArr[i7];
            long j2 = 1048575 & M5;
            int i9 = 1237;
            int i10 = 37;
            switch (L(M5)) {
                case 0:
                    i2 = i6 * 53;
                    b6 = AbstractC0228x.b(Double.doubleToLongBits(i0.f4457b.d(j2, abstractC0226v)));
                    i6 = b6 + i2;
                    break;
                case 1:
                    i2 = i6 * 53;
                    b6 = Float.floatToIntBits(i0.f4457b.e(j2, abstractC0226v));
                    i6 = b6 + i2;
                    break;
                case 2:
                    i2 = i6 * 53;
                    b6 = AbstractC0228x.b(i0.f4457b.g(j2, abstractC0226v));
                    i6 = b6 + i2;
                    break;
                case 3:
                    i2 = i6 * 53;
                    b6 = AbstractC0228x.b(i0.f4457b.g(j2, abstractC0226v));
                    i6 = b6 + i2;
                    break;
                case 4:
                    i2 = i6 * 53;
                    b6 = i0.f4457b.f(j2, abstractC0226v);
                    i6 = b6 + i2;
                    break;
                case 5:
                    i2 = i6 * 53;
                    b6 = AbstractC0228x.b(i0.f4457b.g(j2, abstractC0226v));
                    i6 = b6 + i2;
                    break;
                case 6:
                    i2 = i6 * 53;
                    b6 = i0.f4457b.f(j2, abstractC0226v);
                    i6 = b6 + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean c2 = i0.f4457b.c(j2, abstractC0226v);
                    Charset charset = AbstractC0228x.f4508a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    b6 = ((String) i0.f4457b.h(j2, abstractC0226v)).hashCode();
                    i6 = b6 + i2;
                    break;
                case 9:
                    Object h3 = i0.f4457b.h(j2, abstractC0226v);
                    if (h3 != null) {
                        i10 = h3.hashCode();
                    }
                    i6 = (i6 * 53) + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    b6 = i0.f4457b.h(j2, abstractC0226v).hashCode();
                    i6 = b6 + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    b6 = i0.f4457b.f(j2, abstractC0226v);
                    i6 = b6 + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    b6 = i0.f4457b.f(j2, abstractC0226v);
                    i6 = b6 + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    b6 = i0.f4457b.f(j2, abstractC0226v);
                    i6 = b6 + i2;
                    break;
                case 14:
                    i2 = i6 * 53;
                    b6 = AbstractC0228x.b(i0.f4457b.g(j2, abstractC0226v));
                    i6 = b6 + i2;
                    break;
                case 15:
                    i2 = i6 * 53;
                    b6 = i0.f4457b.f(j2, abstractC0226v);
                    i6 = b6 + i2;
                    break;
                case 16:
                    i2 = i6 * 53;
                    b6 = AbstractC0228x.b(i0.f4457b.g(j2, abstractC0226v));
                    i6 = b6 + i2;
                    break;
                case 17:
                    Object h6 = i0.f4457b.h(j2, abstractC0226v);
                    if (h6 != null) {
                        i10 = h6.hashCode();
                    }
                    i6 = (i6 * 53) + i10;
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
                    i2 = i6 * 53;
                    b6 = i0.f4457b.h(j2, abstractC0226v).hashCode();
                    i6 = b6 + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    b6 = i0.f4457b.h(j2, abstractC0226v).hashCode();
                    i6 = b6 + i2;
                    break;
                case 51:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = AbstractC0228x.b(Double.doubleToLongBits(((Double) i0.f4457b.h(j2, abstractC0226v)).doubleValue()));
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = Float.floatToIntBits(((Float) i0.f4457b.h(j2, abstractC0226v)).floatValue());
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = AbstractC0228x.b(A(j2, abstractC0226v));
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = AbstractC0228x.b(A(j2, abstractC0226v));
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = z(j2, abstractC0226v);
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = AbstractC0228x.b(A(j2, abstractC0226v));
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = z(j2, abstractC0226v);
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i8, i7, abstractC0226v)) {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) i0.f4457b.h(j2, abstractC0226v)).booleanValue();
                        Charset charset2 = AbstractC0228x.f4508a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = ((String) i0.f4457b.h(j2, abstractC0226v)).hashCode();
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = i0.f4457b.h(j2, abstractC0226v).hashCode();
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = i0.f4457b.h(j2, abstractC0226v).hashCode();
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = z(j2, abstractC0226v);
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = z(j2, abstractC0226v);
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = z(j2, abstractC0226v);
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = AbstractC0228x.b(A(j2, abstractC0226v));
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = z(j2, abstractC0226v);
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = AbstractC0228x.b(A(j2, abstractC0226v));
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i8, i7, abstractC0226v)) {
                        i2 = i6 * 53;
                        b6 = i0.f4457b.h(j2, abstractC0226v).hashCode();
                        i6 = b6 + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f4385l.getClass();
        return abstractC0226v.unknownFields.hashCode() + (i6 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0226v) {
                AbstractC0226v abstractC0226v = (AbstractC0226v) obj;
                abstractC0226v.d();
                abstractC0226v.c();
                abstractC0226v.j();
            }
            int[] iArr = this.f4374a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int M5 = M(i2);
                long j2 = 1048575 & M5;
                int L5 = L(M5);
                if (L5 != 9) {
                    if (L5 != 60 && L5 != 68) {
                        switch (L5) {
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
                                this.f4384k.getClass();
                                B.a(j2, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f4373o;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    this.f4386m.getClass();
                                    I.c(object);
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i2], i2, obj)) {
                        m(i2).d(f4373o.getObject(obj, j2));
                    }
                }
                if (n(i2, obj)) {
                    m(i2).d(f4373o.getObject(obj, j2));
                }
            }
            this.f4385l.getClass();
            d0.b(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.W.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.W.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.W.B(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(AbstractC0226v abstractC0226v, Object obj) {
        int[] iArr = this.f4374a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= length) {
                this.f4385l.getClass();
                return abstractC0226v.unknownFields.equals(((AbstractC0226v) obj).unknownFields);
            }
            int M5 = M(i2);
            long j2 = M5 & 1048575;
            switch (L(M5)) {
                case 0:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 1:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var2 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 2:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var3 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 3:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var4 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 4:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var5 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 5:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var6 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 6:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var7 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var8 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 8:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var9 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 9:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var10 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 10:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var11 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 11:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var12 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 12:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var13 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 13:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var14 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 14:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var15 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 15:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var16 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 16:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var17 = i0.f4457b;
                        break;
                    }
                    z = false;
                    break;
                case 17:
                    if (j(abstractC0226v, obj, i2)) {
                        h0 h0Var18 = i0.f4457b;
                        break;
                    }
                    z = false;
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
                    h0 h0Var19 = i0.f4457b;
                    z = W.B(h0Var19.h(j2, abstractC0226v), h0Var19.h(j2, obj));
                    break;
                case 50:
                    h0 h0Var20 = i0.f4457b;
                    z = W.B(h0Var20.h(j2, abstractC0226v), h0Var20.h(j2, obj));
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
                    h0 h0Var21 = i0.f4457b;
                    if (h0Var21.f(j6, abstractC0226v) == h0Var21.f(j6, obj)) {
                        break;
                    }
                    z = false;
                    break;
            }
            if (!z) {
                return false;
            }
            i2 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean f(Object obj) {
        int i2;
        int i3;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f4381h) {
            int i9 = this.f4380g[i8];
            int[] iArr = this.f4374a;
            int i10 = iArr[i9];
            int M5 = M(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f4373o.getInt(obj, i12);
                }
                i3 = i7;
                i2 = i12;
            } else {
                i2 = i6;
                i3 = i7;
            }
            if ((268435456 & M5) != 0 && !o(obj, i9, i2, i3, i13)) {
                return false;
            }
            int L5 = L(M5);
            if (L5 != 9 && L5 != 17) {
                if (L5 != 27) {
                    if (L5 == 60 || L5 == 68) {
                        if (q(i10, i9, obj)) {
                            if (!m(i9).f(i0.f4457b.h(M5 & 1048575, obj))) {
                                return false;
                            }
                        } else {
                            continue;
                        }
                    } else if (L5 != 49) {
                        if (L5 != 50) {
                            continue;
                        } else {
                            Object h3 = i0.f4457b.h(M5 & 1048575, obj);
                            this.f4386m.getClass();
                            H h6 = (H) h3;
                            if (h6.isEmpty()) {
                                continue;
                            } else {
                                if (((G) this.f4375b[(i9 / 3) * 2]).f4366a.f4364b.f4487a != r0.MESSAGE) {
                                    continue;
                                } else {
                                    V v4 = null;
                                    for (Object obj2 : h6.values()) {
                                        if (v4 == null) {
                                            v4 = S.f4392c.a(obj2.getClass());
                                        }
                                        if (!v4.f(obj2)) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) i0.f4457b.h(M5 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    V m6 = m(i9);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!m6.f(list.get(i14))) {
                            return false;
                        }
                    }
                }
            } else if (o(obj, i9, i2, i3, i13)) {
                if (!m(i9).f(i0.f4457b.h(M5 & 1048575, obj))) {
                    return false;
                }
            } else {
                continue;
            }
            i8++;
            i6 = i2;
            i7 = i3;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void g(Object obj, C0215j c0215j, C0219n c0219n) {
        c0219n.getClass();
        if (p(obj)) {
            r(this.f4385l, obj, c0215j, c0219n);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0226v abstractC0226v) {
        int i2;
        int i3;
        int i6;
        int L5;
        int K5;
        int i7;
        int Z2;
        int b02;
        Unsafe unsafe = f4373o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f4374a;
            if (i11 >= iArr.length) {
                this.f4385l.getClass();
                return abstractC0226v.unknownFields.b() + i12;
            }
            int M5 = M(i11);
            int L6 = L(M5);
            int i13 = iArr[i11];
            int i14 = iArr[i11 + 2];
            int i15 = i14 & i8;
            if (L6 <= 17) {
                if (i15 != i9) {
                    i10 = i15 == i8 ? 0 : unsafe.getInt(abstractC0226v, i15);
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
            long j2 = M5 & i8;
            if (L6 >= r.f4489b.a()) {
                r.f4490c.a();
            }
            switch (L6) {
                case 0:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.L(i13);
                        i12 += L5;
                        break;
                    }
                case 1:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.P(i13);
                        i12 += L5;
                        break;
                    }
                case 2:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.S(i13, unsafe.getLong(abstractC0226v, j2));
                        i12 += L5;
                        break;
                    }
                case 3:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.c0(i13, unsafe.getLong(abstractC0226v, j2));
                        i12 += L5;
                        break;
                    }
                case 4:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.R(i13, unsafe.getInt(abstractC0226v, j2));
                        i12 += L5;
                        break;
                    }
                case 5:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.O(i13);
                        i12 += L5;
                        break;
                    }
                case 6:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.N(i13);
                        i12 += L5;
                        break;
                    }
                case 7:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.J(i13);
                        i12 += L5;
                        break;
                    }
                case 8:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC0226v, j2);
                        K5 = object instanceof C0212g ? C0217l.K(i13, (C0212g) object) : C0217l.X(i13, (String) object);
                        i12 = K5 + i12;
                        break;
                    }
                case 9:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = W.o(i13, unsafe.getObject(abstractC0226v, j2), m(i11));
                        i12 += L5;
                        break;
                    }
                case 10:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.K(i13, (C0212g) unsafe.getObject(abstractC0226v, j2));
                        i12 += L5;
                        break;
                    }
                case 11:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.a0(i13, unsafe.getInt(abstractC0226v, j2));
                        i12 += L5;
                        break;
                    }
                case 12:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.M(i13, unsafe.getInt(abstractC0226v, j2));
                        i12 += L5;
                        break;
                    }
                case 13:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.T(i13);
                        i12 += L5;
                        break;
                    }
                case 14:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.U(i13);
                        i12 += L5;
                        break;
                    }
                case 15:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.V(i13, unsafe.getInt(abstractC0226v, j2));
                        i12 += L5;
                        break;
                    }
                case 16:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.W(i13, unsafe.getLong(abstractC0226v, j2));
                        i12 += L5;
                        break;
                    }
                case 17:
                    if (!o(abstractC0226v, i11, i2, i3, i6)) {
                        break;
                    } else {
                        L5 = C0217l.Q(i13, (AbstractC0206a) unsafe.getObject(abstractC0226v, j2), m(i11));
                        i12 += L5;
                        break;
                    }
                case 18:
                    L5 = W.h(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case C0793l9.f8681C /* 19 */:
                    L5 = W.f(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case C0793l9.f8682D /* 20 */:
                    L5 = W.m(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case C0793l9.f8683E /* 21 */:
                    L5 = W.x(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case 22:
                    L5 = W.k(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case 23:
                    L5 = W.h(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case 24:
                    L5 = W.f(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case C0793l9.f8684F /* 25 */:
                    L5 = W.a(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case 26:
                    L5 = W.u(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case C0793l9.f8686H /* 27 */:
                    L5 = W.p(i13, (List) unsafe.getObject(abstractC0226v, j2), m(i11));
                    i12 += L5;
                    break;
                case 28:
                    L5 = W.c(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case C0793l9.f8687I /* 29 */:
                    L5 = W.v(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case 30:
                    L5 = W.d(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case 31:
                    L5 = W.f(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case 32:
                    L5 = W.h(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case 33:
                    L5 = W.q(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case 34:
                    L5 = W.s(i13, (List) unsafe.getObject(abstractC0226v, j2));
                    i12 += L5;
                    break;
                case C0793l9.f8688J /* 35 */:
                    i7 = W.i((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 36:
                    i7 = W.g((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 37:
                    i7 = W.n((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case C0793l9.f8689K /* 38 */:
                    i7 = W.y((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 39:
                    i7 = W.l((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case C0793l9.f8690L /* 40 */:
                    i7 = W.i((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 41:
                    i7 = W.g((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case C0793l9.f8691M /* 42 */:
                    i7 = W.b((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 43:
                    i7 = W.w((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 44:
                    i7 = W.e((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 45:
                    i7 = W.g((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 46:
                    i7 = W.i((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 47:
                    i7 = W.r((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 48:
                    i7 = W.t((List) unsafe.getObject(abstractC0226v, j2));
                    if (i7 <= 0) {
                        break;
                    } else {
                        Z2 = C0217l.Z(i13);
                        b02 = C0217l.b0(i7);
                        i12 += b02 + Z2 + i7;
                        break;
                    }
                case 49:
                    L5 = W.j(i13, (List) unsafe.getObject(abstractC0226v, j2), m(i11));
                    i12 += L5;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0226v, j2);
                    Object obj = this.f4375b[(i11 / 3) * 2];
                    this.f4386m.getClass();
                    L5 = I.a(object2, i13, obj);
                    i12 += L5;
                    break;
                case 51:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.L(i13);
                        i12 += L5;
                        break;
                    }
                case 52:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.P(i13);
                        i12 += L5;
                        break;
                    }
                case 53:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.S(i13, A(j2, abstractC0226v));
                        i12 += L5;
                        break;
                    }
                case 54:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.c0(i13, A(j2, abstractC0226v));
                        i12 += L5;
                        break;
                    }
                case 55:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.R(i13, z(j2, abstractC0226v));
                        i12 += L5;
                        break;
                    }
                case 56:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.O(i13);
                        i12 += L5;
                        break;
                    }
                case 57:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.N(i13);
                        i12 += L5;
                        break;
                    }
                case 58:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.J(i13);
                        i12 += L5;
                        break;
                    }
                case 59:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(abstractC0226v, j2);
                        K5 = object3 instanceof C0212g ? C0217l.K(i13, (C0212g) object3) : C0217l.X(i13, (String) object3);
                        i12 = K5 + i12;
                        break;
                    }
                case 60:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = W.o(i13, unsafe.getObject(abstractC0226v, j2), m(i11));
                        i12 += L5;
                        break;
                    }
                case 61:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.K(i13, (C0212g) unsafe.getObject(abstractC0226v, j2));
                        i12 += L5;
                        break;
                    }
                case 62:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.a0(i13, z(j2, abstractC0226v));
                        i12 += L5;
                        break;
                    }
                case 63:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.M(i13, z(j2, abstractC0226v));
                        i12 += L5;
                        break;
                    }
                case 64:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.T(i13);
                        i12 += L5;
                        break;
                    }
                case 65:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.U(i13);
                        i12 += L5;
                        break;
                    }
                case 66:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.V(i13, z(j2, abstractC0226v));
                        i12 += L5;
                        break;
                    }
                case 67:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.W(i13, A(j2, abstractC0226v));
                        i12 += L5;
                        break;
                    }
                case 68:
                    if (!q(i13, i11, abstractC0226v)) {
                        break;
                    } else {
                        L5 = C0217l.Q(i13, (AbstractC0206a) unsafe.getObject(abstractC0226v, j2), m(i11));
                        i12 += L5;
                        break;
                    }
            }
            i11 += 3;
            i9 = i2;
            i10 = i3;
            i8 = 1048575;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0226v i() {
        this.f4383j.getClass();
        return ((AbstractC0226v) this.f4378e).k();
    }

    public final boolean j(AbstractC0226v abstractC0226v, Object obj, int i2) {
        return n(i2, abstractC0226v) == n(i2, obj);
    }

    public final void k(Object obj, int i2, Object obj2) {
        int i3 = this.f4374a[i2];
        if (i0.f4457b.h(M(i2) & 1048575, obj) == null) {
            return;
        }
        l(i2);
    }

    public final void l(int i2) {
        if (this.f4375b[((i2 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final V m(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.f4375b;
        V v4 = (V) objArr[i3];
        if (v4 != null) {
            return v4;
        }
        V a6 = S.f4392c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a6;
        return a6;
    }

    public final boolean n(int i2, Object obj) {
        int i3 = this.f4374a[i2 + 2];
        long j2 = i3 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i3 >>> 20)) & i0.f4457b.f(j2, obj)) != 0;
        }
        int M5 = M(i2);
        long j6 = M5 & 1048575;
        switch (L(M5)) {
            case 0:
                return Double.doubleToRawLongBits(i0.f4457b.d(j6, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(i0.f4457b.e(j6, obj)) != 0;
            case 2:
                return i0.f4457b.g(j6, obj) != 0;
            case 3:
                return i0.f4457b.g(j6, obj) != 0;
            case 4:
                return i0.f4457b.f(j6, obj) != 0;
            case 5:
                return i0.f4457b.g(j6, obj) != 0;
            case 6:
                return i0.f4457b.f(j6, obj) != 0;
            case 7:
                return i0.f4457b.c(j6, obj);
            case 8:
                Object h3 = i0.f4457b.h(j6, obj);
                if (h3 instanceof String) {
                    return !((String) h3).isEmpty();
                }
                if (h3 instanceof C0212g) {
                    return !C0212g.f4436c.equals(h3);
                }
                throw new IllegalArgumentException();
            case 9:
                return i0.f4457b.h(j6, obj) != null;
            case 10:
                return !C0212g.f4436c.equals(i0.f4457b.h(j6, obj));
            case 11:
                return i0.f4457b.f(j6, obj) != 0;
            case 12:
                return i0.f4457b.f(j6, obj) != 0;
            case 13:
                return i0.f4457b.f(j6, obj) != 0;
            case 14:
                return i0.f4457b.g(j6, obj) != 0;
            case 15:
                return i0.f4457b.f(j6, obj) != 0;
            case 16:
                return i0.f4457b.g(j6, obj) != 0;
            case 17:
                return i0.f4457b.h(j6, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean o(Object obj, int i2, int i3, int i6, int i7) {
        return i3 == 1048575 ? n(i2, obj) : (i6 & i7) != 0;
    }

    public final boolean q(int i2, int i3, Object obj) {
        return i0.f4457b.f((long) (this.f4374a[i3 + 2] & 1048575), obj) == i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x064b A[Catch: all -> 0x025f, TryCatch #5 {all -> 0x025f, blocks: (B:54:0x0646, B:56:0x064b, B:57:0x0650, B:50:0x025a, B:78:0x0262, B:79:0x0275, B:80:0x0288, B:81:0x029b, B:82:0x02ae, B:83:0x02c7, B:84:0x02da, B:85:0x02ed, B:86:0x0300, B:87:0x0313, B:88:0x0326, B:89:0x0339, B:90:0x034c, B:91:0x035f, B:92:0x0372, B:93:0x0385, B:94:0x0398, B:95:0x03ab, B:96:0x03be, B:97:0x03d7, B:98:0x03ea, B:99:0x03fd, B:100:0x0411, B:101:0x0419, B:102:0x042c, B:103:0x043f, B:104:0x0452, B:105:0x0465, B:106:0x0478, B:107:0x048b, B:108:0x049e, B:109:0x04b1, B:110:0x04ca, B:111:0x04e0, B:112:0x04f6, B:113:0x050d, B:114:0x0524, B:115:0x053d, B:116:0x0553, B:117:0x0566, B:118:0x057f, B:119:0x058a, B:120:0x05a2, B:121:0x05b9, B:122:0x05d0, B:123:0x05e6, B:124:0x05fc, B:125:0x0611, B:126:0x0629), top: B:53:0x0646 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0656 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(d0 d0Var, Object obj, C0215j c0215j, C0219n c0219n) {
        int i2;
        int i3;
        int L5;
        R4.c cVar;
        B b6;
        int i6;
        Object obj2;
        int[] iArr = this.f4380g;
        int i7 = this.f4382i;
        int i8 = this.f4381h;
        c0 c0Var = null;
        while (true) {
            try {
                int a6 = c0215j.a();
                int B5 = B(a6);
                if (B5 >= 0) {
                    int M5 = M(B5);
                    try {
                        L5 = L(M5);
                        cVar = (R4.c) c0215j.f4465d;
                        b6 = this.f4384k;
                    } catch (C0229y unused) {
                        i2 = i8;
                        i3 = 0;
                    }
                    switch (L5) {
                        case 0:
                            i2 = i8;
                            long y5 = y(M5);
                            c0215j.x(1);
                            i0.f4457b.l(obj, y5, cVar.h());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 1:
                            i2 = i8;
                            long y6 = y(M5);
                            c0215j.x(5);
                            i0.f4457b.m(obj, y6, cVar.l());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 2:
                            i2 = i8;
                            long y7 = y(M5);
                            c0215j.x(0);
                            i0.n(obj, y7, cVar.n());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 3:
                            i2 = i8;
                            long y8 = y(M5);
                            c0215j.x(0);
                            i0.n(obj, y8, cVar.w());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 4:
                            i2 = i8;
                            long y9 = y(M5);
                            c0215j.x(0);
                            i0.m(obj, y9, cVar.m());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 5:
                            i2 = i8;
                            long y10 = y(M5);
                            c0215j.x(1);
                            i0.n(obj, y10, cVar.k());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 6:
                            i2 = i8;
                            long y11 = y(M5);
                            c0215j.x(5);
                            i0.m(obj, y11, cVar.j());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 7:
                            i2 = i8;
                            long y12 = y(M5);
                            c0215j.x(0);
                            i0.f4457b.j(obj, y12, cVar.f());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 8:
                            i2 = i8;
                            E(M5, c0215j, obj);
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 9:
                            i2 = i8;
                            AbstractC0206a abstractC0206a = (AbstractC0206a) v(B5, obj);
                            V m6 = m(B5);
                            c0215j.x(2);
                            c0215j.c(abstractC0206a, m6, c0219n);
                            J(obj, B5, abstractC0206a);
                            i8 = i2;
                            break;
                        case 10:
                            i2 = i8;
                            i0.o(y(M5), obj, c0215j.e());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 11:
                            i2 = i8;
                            long y13 = y(M5);
                            c0215j.x(0);
                            i0.m(obj, y13, cVar.v());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 12:
                            i2 = i8;
                            c0215j.x(0);
                            int i9 = cVar.i();
                            l(B5);
                            i0.m(obj, y(M5), i9);
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 13:
                            i2 = i8;
                            long y14 = y(M5);
                            c0215j.x(5);
                            i0.m(obj, y14, cVar.o());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 14:
                            i2 = i8;
                            long y15 = y(M5);
                            c0215j.x(1);
                            i0.n(obj, y15, cVar.p());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 15:
                            i2 = i8;
                            long y16 = y(M5);
                            c0215j.x(0);
                            i0.m(obj, y16, cVar.q());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 16:
                            i2 = i8;
                            long y17 = y(M5);
                            c0215j.x(0);
                            i0.n(obj, y17, cVar.r());
                            H(B5, obj);
                            i8 = i2;
                            break;
                        case 17:
                            i2 = i8;
                            AbstractC0206a abstractC0206a2 = (AbstractC0206a) v(B5, obj);
                            V m7 = m(B5);
                            c0215j.x(3);
                            c0215j.b(abstractC0206a2, m7, c0219n);
                            J(obj, B5, abstractC0206a2);
                            i8 = i2;
                            break;
                        case 18:
                            i2 = i8;
                            long y18 = y(M5);
                            b6.getClass();
                            c0215j.g(B.b(y18, obj));
                            i8 = i2;
                            break;
                        case C0793l9.f8681C /* 19 */:
                            i2 = i8;
                            long y19 = y(M5);
                            b6.getClass();
                            c0215j.l(B.b(y19, obj));
                            i8 = i2;
                            break;
                        case C0793l9.f8682D /* 20 */:
                            i2 = i8;
                            long y20 = y(M5);
                            b6.getClass();
                            c0215j.n(B.b(y20, obj));
                            i8 = i2;
                            break;
                        case C0793l9.f8683E /* 21 */:
                            i2 = i8;
                            long y21 = y(M5);
                            b6.getClass();
                            c0215j.v(B.b(y21, obj));
                            i8 = i2;
                            break;
                        case 22:
                            i2 = i8;
                            long y22 = y(M5);
                            b6.getClass();
                            c0215j.m(B.b(y22, obj));
                            i8 = i2;
                            break;
                        case 23:
                            i2 = i8;
                            long y23 = y(M5);
                            b6.getClass();
                            c0215j.k(B.b(y23, obj));
                            i8 = i2;
                            break;
                        case 24:
                            i2 = i8;
                            long y24 = y(M5);
                            b6.getClass();
                            c0215j.j(B.b(y24, obj));
                            i8 = i2;
                            break;
                        case C0793l9.f8684F /* 25 */:
                            i2 = i8;
                            long y25 = y(M5);
                            b6.getClass();
                            c0215j.d(B.b(y25, obj));
                            i8 = i2;
                            break;
                        case 26:
                            i2 = i8;
                            F(M5, c0215j, obj);
                            i8 = i2;
                            break;
                        case C0793l9.f8686H /* 27 */:
                            i2 = i8;
                            D(obj, M5, c0215j, m(B5), c0219n);
                            i8 = i2;
                            break;
                        case 28:
                            i2 = i8;
                            long y26 = y(M5);
                            b6.getClass();
                            c0215j.f(B.b(y26, obj));
                            i8 = i2;
                            break;
                        case C0793l9.f8687I /* 29 */:
                            i2 = i8;
                            long y27 = y(M5);
                            b6.getClass();
                            c0215j.u(B.b(y27, obj));
                            i8 = i2;
                            break;
                        case 30:
                            i2 = i8;
                            long y28 = y(M5);
                            b6.getClass();
                            InterfaceC0227w b7 = B.b(y28, obj);
                            c0215j.h(b7);
                            l(B5);
                            W.z(obj, a6, b7, c0Var, d0Var);
                            i8 = i2;
                            break;
                        case 31:
                            i2 = i8;
                            long y29 = y(M5);
                            b6.getClass();
                            c0215j.p(B.b(y29, obj));
                            i8 = i2;
                            break;
                        case 32:
                            i2 = i8;
                            long y30 = y(M5);
                            b6.getClass();
                            c0215j.q(B.b(y30, obj));
                            i8 = i2;
                            break;
                        case 33:
                            i2 = i8;
                            long y31 = y(M5);
                            b6.getClass();
                            c0215j.r(B.b(y31, obj));
                            i8 = i2;
                            break;
                        case 34:
                            i2 = i8;
                            long y32 = y(M5);
                            b6.getClass();
                            c0215j.s(B.b(y32, obj));
                            i8 = i2;
                            break;
                        case C0793l9.f8688J /* 35 */:
                            i2 = i8;
                            long y33 = y(M5);
                            b6.getClass();
                            c0215j.g(B.b(y33, obj));
                            i8 = i2;
                            break;
                        case 36:
                            i2 = i8;
                            long y34 = y(M5);
                            b6.getClass();
                            c0215j.l(B.b(y34, obj));
                            i8 = i2;
                            break;
                        case 37:
                            i2 = i8;
                            long y35 = y(M5);
                            b6.getClass();
                            c0215j.n(B.b(y35, obj));
                            i8 = i2;
                            break;
                        case C0793l9.f8689K /* 38 */:
                            i2 = i8;
                            long y36 = y(M5);
                            b6.getClass();
                            c0215j.v(B.b(y36, obj));
                            i8 = i2;
                            break;
                        case 39:
                            i2 = i8;
                            long y37 = y(M5);
                            b6.getClass();
                            c0215j.m(B.b(y37, obj));
                            i8 = i2;
                            break;
                        case C0793l9.f8690L /* 40 */:
                            i2 = i8;
                            long y38 = y(M5);
                            b6.getClass();
                            c0215j.k(B.b(y38, obj));
                            i8 = i2;
                            break;
                        case 41:
                            i2 = i8;
                            long y39 = y(M5);
                            b6.getClass();
                            c0215j.j(B.b(y39, obj));
                            i8 = i2;
                            break;
                        case C0793l9.f8691M /* 42 */:
                            i2 = i8;
                            long y40 = y(M5);
                            b6.getClass();
                            c0215j.d(B.b(y40, obj));
                            i8 = i2;
                            break;
                        case 43:
                            i2 = i8;
                            long y41 = y(M5);
                            b6.getClass();
                            c0215j.u(B.b(y41, obj));
                            i8 = i2;
                            break;
                        case 44:
                            i2 = i8;
                            long y42 = y(M5);
                            b6.getClass();
                            InterfaceC0227w b8 = B.b(y42, obj);
                            c0215j.h(b8);
                            l(B5);
                            W.z(obj, a6, b8, c0Var, d0Var);
                            i8 = i2;
                            break;
                        case 45:
                            i2 = i8;
                            long y43 = y(M5);
                            b6.getClass();
                            c0215j.p(B.b(y43, obj));
                            i8 = i2;
                            break;
                        case 46:
                            i2 = i8;
                            long y44 = y(M5);
                            b6.getClass();
                            c0215j.q(B.b(y44, obj));
                            i8 = i2;
                            break;
                        case 47:
                            i2 = i8;
                            long y45 = y(M5);
                            b6.getClass();
                            c0215j.r(B.b(y45, obj));
                            i8 = i2;
                            break;
                        case 48:
                            i2 = i8;
                            long y46 = y(M5);
                            b6.getClass();
                            c0215j.s(B.b(y46, obj));
                            i8 = i2;
                            break;
                        case 49:
                            i2 = i8;
                            i3 = 0;
                            try {
                                C(obj, y(M5), c0215j, m(B5), c0219n);
                            } catch (C0229y unused2) {
                                try {
                                    d0Var.getClass();
                                    if (c0Var == null) {
                                        c0Var = d0.a(obj);
                                    }
                                    if (!d0.c(i3, c0215j, c0Var)) {
                                        for (int i10 = i2; i10 < i7; i10++) {
                                            k(obj, iArr[i10], c0Var);
                                        }
                                        if (c0Var != null) {
                                            ((AbstractC0226v) obj).unknownFields = c0Var;
                                            return;
                                        }
                                        return;
                                    }
                                    i8 = i2;
                                } catch (Throwable th) {
                                    th = th;
                                    for (int i11 = i2; i11 < i7; i11++) {
                                        k(obj, iArr[i11], c0Var);
                                    }
                                    if (c0Var != null) {
                                        d0Var.getClass();
                                        ((AbstractC0226v) obj).unknownFields = c0Var;
                                    }
                                    throw th;
                                }
                            }
                            i8 = i2;
                        case 50:
                            try {
                                obj2 = this.f4375b[(B5 / 3) * 2];
                                i6 = 0;
                            } catch (C0229y unused3) {
                                i6 = 0;
                            }
                            try {
                                s(obj, B5, obj2, c0219n, c0215j);
                                i2 = i8;
                            } catch (C0229y unused4) {
                                i2 = i8;
                                i3 = i6;
                                d0Var.getClass();
                                if (c0Var == null) {
                                }
                                if (!d0.c(i3, c0215j, c0Var)) {
                                }
                                i8 = i2;
                            }
                            i8 = i2;
                            break;
                        case 51:
                            long y47 = y(M5);
                            c0215j.x(1);
                            i0.o(y47, obj, Double.valueOf(cVar.h()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 52:
                            long y48 = y(M5);
                            c0215j.x(5);
                            i0.o(y48, obj, Float.valueOf(cVar.l()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 53:
                            long y49 = y(M5);
                            c0215j.x(0);
                            i0.o(y49, obj, Long.valueOf(cVar.n()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 54:
                            long y50 = y(M5);
                            c0215j.x(0);
                            i0.o(y50, obj, Long.valueOf(cVar.w()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 55:
                            long y51 = y(M5);
                            c0215j.x(0);
                            i0.o(y51, obj, Integer.valueOf(cVar.m()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 56:
                            long y52 = y(M5);
                            c0215j.x(1);
                            i0.o(y52, obj, Long.valueOf(cVar.k()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 57:
                            long y53 = y(M5);
                            c0215j.x(5);
                            i0.o(y53, obj, Integer.valueOf(cVar.j()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 58:
                            long y54 = y(M5);
                            c0215j.x(0);
                            i0.o(y54, obj, Boolean.valueOf(cVar.f()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 59:
                            E(M5, c0215j, obj);
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 60:
                            AbstractC0206a abstractC0206a3 = (AbstractC0206a) w(a6, B5, obj);
                            V m8 = m(B5);
                            c0215j.x(2);
                            c0215j.c(abstractC0206a3, m8, c0219n);
                            K(obj, a6, B5, abstractC0206a3);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 61:
                            i0.o(y(M5), obj, c0215j.e());
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 62:
                            long y55 = y(M5);
                            c0215j.x(0);
                            i0.o(y55, obj, Integer.valueOf(cVar.v()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 63:
                            c0215j.x(0);
                            int i12 = cVar.i();
                            l(B5);
                            i0.o(y(M5), obj, Integer.valueOf(i12));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 64:
                            long y56 = y(M5);
                            c0215j.x(5);
                            i0.o(y56, obj, Integer.valueOf(cVar.o()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 65:
                            long y57 = y(M5);
                            c0215j.x(1);
                            i0.o(y57, obj, Long.valueOf(cVar.p()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 66:
                            long y58 = y(M5);
                            c0215j.x(0);
                            i0.o(y58, obj, Integer.valueOf(cVar.q()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 67:
                            long y59 = y(M5);
                            c0215j.x(0);
                            i0.o(y59, obj, Long.valueOf(cVar.r()));
                            I(a6, B5, obj);
                            i2 = i8;
                            i8 = i2;
                            break;
                        case 68:
                            AbstractC0206a abstractC0206a4 = (AbstractC0206a) w(a6, B5, obj);
                            V m9 = m(B5);
                            c0215j.x(3);
                            c0215j.b(abstractC0206a4, m9, c0219n);
                            K(obj, a6, B5, abstractC0206a4);
                            i2 = i8;
                            i8 = i2;
                            break;
                        default:
                            if (c0Var == null) {
                                d0Var.getClass();
                                c0Var = d0.a(obj);
                            }
                            d0Var.getClass();
                            if (!d0.c(0, c0215j, c0Var)) {
                                while (i8 < i7) {
                                    k(obj, iArr[i8], c0Var);
                                    i8++;
                                }
                                if (c0Var != null) {
                                    ((AbstractC0226v) obj).unknownFields = c0Var;
                                    return;
                                }
                                return;
                            }
                            i2 = i8;
                            i8 = i2;
                            break;
                    }
                } else {
                    if (a6 == Integer.MAX_VALUE) {
                        while (i8 < i7) {
                            k(obj, iArr[i8], c0Var);
                            i8++;
                        }
                        if (c0Var != null) {
                            d0Var.getClass();
                            ((AbstractC0226v) obj).unknownFields = c0Var;
                            return;
                        }
                        return;
                    }
                    d0Var.getClass();
                    if (c0Var == null) {
                        c0Var = d0.a(obj);
                    }
                    if (!d0.c(0, c0215j, c0Var)) {
                        while (i8 < i7) {
                            k(obj, iArr[i8], c0Var);
                            i8++;
                        }
                        if (c0Var != null) {
                            ((AbstractC0226v) obj).unknownFields = c0Var;
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i2 = i8;
            }
        }
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
    public final void s(Object obj, int i2, Object obj2, C0219n c0219n, C0215j c0215j) {
        long M5 = M(i2) & 1048575;
        Object h3 = i0.f4457b.h(M5, obj);
        I i3 = this.f4386m;
        if (h3 == null) {
            i3.getClass();
            h3 = H.f4367b.c();
            i0.o(M5, obj, h3);
        } else {
            i3.getClass();
            if (!((H) h3).f4368a) {
                H c2 = H.f4367b.c();
                I.b(c2, h3);
                i0.o(M5, obj, c2);
                h3 = c2;
            }
        }
        i3.getClass();
        H h6 = (H) h3;
        F f3 = ((G) obj2).f4366a;
        c0215j.x(2);
        R4.c cVar = (R4.c) c0215j.f4465d;
        int e3 = cVar.e(cVar.v());
        Object obj3 = "";
        O.k kVar = f3.f4365c;
        Object obj4 = kVar;
        while (true) {
            try {
                int a6 = c0215j.a();
                if (a6 == Integer.MAX_VALUE || cVar.c()) {
                    break;
                }
                if (a6 == 1) {
                    obj3 = c0215j.i(f3.f4363a, null, null);
                } else if (a6 != 2) {
                    try {
                        if (!c0215j.y()) {
                            throw new C0230z("Unable to parse map entry.");
                        }
                    } catch (C0229y unused) {
                        if (!c0215j.y()) {
                            throw new C0230z("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj4 = c0215j.i(f3.f4364b, kVar.getClass(), c0219n);
                }
            } catch (Throwable th) {
                cVar.d(e3);
                throw th;
            }
        }
    }

    public final void t(Object obj, int i2, Object obj2) {
        if (n(i2, obj2)) {
            long M5 = M(i2) & 1048575;
            Unsafe unsafe = f4373o;
            Object object = unsafe.getObject(obj2, M5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4374a[i2] + " is present but null: " + obj2);
            }
            V m6 = m(i2);
            if (!n(i2, obj)) {
                if (p(object)) {
                    AbstractC0226v i3 = m6.i();
                    m6.a(i3, object);
                    unsafe.putObject(obj, M5, i3);
                } else {
                    unsafe.putObject(obj, M5, object);
                }
                H(i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M5);
            if (!p(object2)) {
                AbstractC0226v i6 = m6.i();
                m6.a(i6, object2);
                unsafe.putObject(obj, M5, i6);
                object2 = i6;
            }
            m6.a(object2, object);
        }
    }

    public final void u(Object obj, int i2, Object obj2) {
        int[] iArr = this.f4374a;
        int i3 = iArr[i2];
        if (q(i3, i2, obj2)) {
            long M5 = M(i2) & 1048575;
            Unsafe unsafe = f4373o;
            Object object = unsafe.getObject(obj2, M5);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2);
            }
            V m6 = m(i2);
            if (!q(i3, i2, obj)) {
                if (p(object)) {
                    AbstractC0226v i6 = m6.i();
                    m6.a(i6, object);
                    unsafe.putObject(obj, M5, i6);
                } else {
                    unsafe.putObject(obj, M5, object);
                }
                I(i3, i2, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M5);
            if (!p(object2)) {
                AbstractC0226v i7 = m6.i();
                m6.a(i7, object2);
                unsafe.putObject(obj, M5, i7);
                object2 = i7;
            }
            m6.a(object2, object);
        }
    }

    public final Object v(int i2, Object obj) {
        V m6 = m(i2);
        long M5 = M(i2) & 1048575;
        if (!n(i2, obj)) {
            return m6.i();
        }
        Object object = f4373o.getObject(obj, M5);
        if (p(object)) {
            return object;
        }
        AbstractC0226v i3 = m6.i();
        if (object != null) {
            m6.a(i3, object);
        }
        return i3;
    }

    public final Object w(int i2, int i3, Object obj) {
        V m6 = m(i3);
        if (!q(i2, i3, obj)) {
            return m6.i();
        }
        Object object = f4373o.getObject(obj, M(i3) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0226v i6 = m6.i();
        if (object != null) {
            m6.a(i6, object);
        }
        return i6;
    }
}
