package androidx.datastore.preferences.protobuf;

import com.android.installreferrer.api.InstallReferrerClient;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p0 implements y0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f873o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f874p = r1.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f875a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f876b;

    /* renamed from: c, reason: collision with root package name */
    public final int f877c;

    /* renamed from: d, reason: collision with root package name */
    public final int f878d;

    /* renamed from: e, reason: collision with root package name */
    public final a f879e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f880f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f881g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f882h;

    /* renamed from: i, reason: collision with root package name */
    public final int f883i;

    /* renamed from: j, reason: collision with root package name */
    public final int f884j;

    /* renamed from: k, reason: collision with root package name */
    public final r0 f885k;

    /* renamed from: l, reason: collision with root package name */
    public final f0 f886l;

    /* renamed from: m, reason: collision with root package name */
    public final j1 f887m;

    /* renamed from: n, reason: collision with root package name */
    public final l0 f888n;

    public p0(int[] iArr, Object[] objArr, int i7, int i8, a aVar, boolean z8, int[] iArr2, int i9, int i10, r0 r0Var, f0 f0Var, j1 j1Var, o oVar, l0 l0Var) {
        this.f875a = iArr;
        this.f876b = objArr;
        this.f877c = i7;
        this.f878d = i8;
        this.f880f = aVar instanceof v;
        this.f881g = z8;
        this.f882h = iArr2;
        this.f883i = i9;
        this.f884j = i10;
        this.f885k = r0Var;
        this.f886l = f0Var;
        this.f887m = j1Var;
        this.f879e = aVar;
        this.f888n = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p0 A(x0 x0Var, r0 r0Var, f0 f0Var, j1 j1Var, o oVar, l0 l0Var) {
        int i7;
        int charAt;
        int charAt2;
        int charAt3;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
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
        char charAt11;
        int i20;
        int i21;
        int i22;
        int objectFieldOffset;
        int i23;
        int i24;
        int i25;
        Field I;
        char charAt12;
        int i26;
        Object obj;
        Field I2;
        Object obj2;
        Field I3;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        int i30;
        char charAt15;
        int i31;
        char charAt16;
        boolean z8 = (x0Var.f927d & 1) != 1;
        String str = x0Var.f925b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i7 = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i7;
            }
        } else {
            i7 = 1;
        }
        int i33 = i7 + 1;
        int charAt17 = str.charAt(i7);
        if (charAt17 >= 55296) {
            int i34 = charAt17 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                charAt16 = str.charAt(i33);
                if (charAt16 < 55296) {
                    break;
                }
                i34 |= (charAt16 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            charAt17 = i34 | (charAt16 << i35);
            i33 = i31;
        }
        if (charAt17 == 0) {
            i11 = 0;
            charAt = 0;
            charAt2 = 0;
            i8 = 0;
            charAt3 = 0;
            iArr = f873o;
            i9 = 0;
            i10 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt18 = str.charAt(i33);
            if (charAt18 >= 55296) {
                int i37 = charAt18 & 8191;
                int i38 = 13;
                while (true) {
                    i19 = i36 + 1;
                    charAt11 = str.charAt(i36);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i37 |= (charAt11 & 8191) << i38;
                    i38 += 13;
                    i36 = i19;
                }
                charAt18 = i37 | (charAt11 << i38);
                i36 = i19;
            }
            int i39 = i36 + 1;
            int charAt19 = str.charAt(i36);
            if (charAt19 >= 55296) {
                int i40 = charAt19 & 8191;
                int i41 = 13;
                while (true) {
                    i18 = i39 + 1;
                    charAt10 = str.charAt(i39);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i40 |= (charAt10 & 8191) << i41;
                    i41 += 13;
                    i39 = i18;
                }
                charAt19 = i40 | (charAt10 << i41);
                i39 = i18;
            }
            int i42 = i39 + 1;
            int charAt20 = str.charAt(i39);
            if (charAt20 >= 55296) {
                int i43 = charAt20 & 8191;
                int i44 = 13;
                while (true) {
                    i17 = i42 + 1;
                    charAt9 = str.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i17;
                }
                charAt20 = i43 | (charAt9 << i44);
                i42 = i17;
            }
            int i45 = i42 + 1;
            int charAt21 = str.charAt(i42);
            if (charAt21 >= 55296) {
                int i46 = charAt21 & 8191;
                int i47 = 13;
                while (true) {
                    i16 = i45 + 1;
                    charAt8 = str.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i16;
                }
                charAt21 = i46 | (charAt8 << i47);
                i45 = i16;
            }
            int i48 = i45 + 1;
            charAt = str.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i15 = i48 + 1;
                    charAt7 = str.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i15;
                }
                charAt = i49 | (charAt7 << i50);
                i48 = i15;
            }
            int i51 = i48 + 1;
            charAt2 = str.charAt(i48);
            if (charAt2 >= 55296) {
                int i52 = charAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i14 = i51 + 1;
                    charAt6 = str.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i14;
                }
                charAt2 = i52 | (charAt6 << i53);
                i51 = i14;
            }
            int i54 = i51 + 1;
            int charAt22 = str.charAt(i51);
            if (charAt22 >= 55296) {
                int i55 = charAt22 & 8191;
                int i56 = 13;
                while (true) {
                    i13 = i54 + 1;
                    charAt5 = str.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i13;
                }
                charAt22 = i55 | (charAt5 << i56);
                i54 = i13;
            }
            int i57 = i54 + 1;
            charAt3 = str.charAt(i54);
            if (charAt3 >= 55296) {
                int i58 = charAt3 & 8191;
                int i59 = i57;
                int i60 = 13;
                while (true) {
                    i12 = i59 + 1;
                    charAt4 = str.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i60;
                    i60 += 13;
                    i59 = i12;
                }
                charAt3 = i58 | (charAt4 << i60);
                i57 = i12;
            }
            int[] iArr2 = new int[charAt3 + charAt2 + charAt22];
            i8 = (charAt18 * 2) + charAt19;
            i9 = charAt20;
            i10 = charAt21;
            iArr = iArr2;
            i11 = charAt18;
            i33 = i57;
        }
        Unsafe unsafe = f874p;
        Object[] objArr = x0Var.f926c;
        Class<?> cls = x0Var.f924a.getClass();
        int i61 = i11;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i62 = charAt2 + charAt3;
        int i63 = i62;
        int i64 = charAt3;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int charAt23 = str.charAt(i33);
            int[] iArr4 = iArr3;
            if (charAt23 >= 55296) {
                int i68 = charAt23 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    charAt15 = str.charAt(i69);
                    i20 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i68 |= (charAt15 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                    length = i20;
                }
                charAt23 = i68 | (charAt15 << i70);
                i21 = i30;
            } else {
                i20 = length;
                i21 = i67;
            }
            int i71 = i21 + 1;
            int charAt24 = str.charAt(i21);
            if (charAt24 >= 55296) {
                int i72 = charAt24 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i28 = i73 + 1;
                    charAt14 = str.charAt(i73);
                    i29 = i72;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i72 = i29 | ((charAt14 & 8191) << i74);
                    i74 += 13;
                    i73 = i28;
                }
                charAt24 = i29 | (charAt14 << i74);
                i22 = i28;
            } else {
                i22 = i71;
            }
            int i75 = charAt23;
            int i76 = charAt24 & 255;
            int i77 = i9;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int i78 = i10;
            if (i76 >= 51) {
                int i79 = i22 + 1;
                int charAt25 = str.charAt(i22);
                char c4 = 55296;
                if (charAt25 >= 55296) {
                    int i80 = charAt25 & 8191;
                    int i81 = 13;
                    while (true) {
                        i27 = i79 + 1;
                        charAt13 = str.charAt(i79);
                        if (charAt13 < c4) {
                            break;
                        }
                        i80 |= (charAt13 & 8191) << i81;
                        i81 += 13;
                        i79 = i27;
                        c4 = 55296;
                    }
                    charAt25 = i80 | (charAt13 << i81);
                    i79 = i27;
                }
                int i82 = i76 - 51;
                int i83 = charAt25;
                if (i82 == 9 || i82 == 17) {
                    i26 = i8 + 1;
                    objArr2[((i66 / 3) * 2) + 1] = objArr[i8];
                } else {
                    if (i82 == 12 && !z8) {
                        i26 = i8 + 1;
                        objArr2[((i66 / 3) * 2) + 1] = objArr[i8];
                    }
                    int i84 = i83 * 2;
                    obj = objArr[i84];
                    if (obj instanceof Field) {
                        I2 = I(cls, (String) obj);
                        objArr[i84] = I2;
                    } else {
                        I2 = (Field) obj;
                    }
                    int i85 = i79;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(I2);
                    int i86 = i84 + 1;
                    obj2 = objArr[i86];
                    if (obj2 instanceof Field) {
                        I3 = I(cls, (String) obj2);
                        objArr[i86] = I3;
                    } else {
                        I3 = (Field) obj2;
                    }
                    i24 = i85;
                    objectFieldOffset = objectFieldOffset2;
                    i23 = (int) unsafe.objectFieldOffset(I3);
                    i25 = 0;
                }
                i8 = i26;
                int i842 = i83 * 2;
                obj = objArr[i842];
                if (obj instanceof Field) {
                }
                int i852 = i79;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(I2);
                int i862 = i842 + 1;
                obj2 = objArr[i862];
                if (obj2 instanceof Field) {
                }
                i24 = i852;
                objectFieldOffset = objectFieldOffset22;
                i23 = (int) unsafe.objectFieldOffset(I3);
                i25 = 0;
            } else {
                int i87 = i8 + 1;
                Field I4 = I(cls, (String) objArr[i8]);
                if (i76 == 9 || i76 == 17) {
                    objArr2[((i66 / 3) * 2) + 1] = I4.getType();
                } else {
                    if (i76 == 27 || i76 == 49) {
                        i8 += 2;
                        objArr2[((i66 / 3) * 2) + 1] = objArr[i87];
                    } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                        if (!z8) {
                            i8 += 2;
                            objArr2[((i66 / 3) * 2) + 1] = objArr[i87];
                        }
                    } else if (i76 == 50) {
                        int i88 = i64 + 1;
                        iArr[i64] = i66;
                        int i89 = (i66 / 3) * 2;
                        int i90 = i8 + 2;
                        objArr2[i89] = objArr[i87];
                        if ((charAt24 & 2048) != 0) {
                            objArr2[i89 + 1] = objArr[i90];
                            i8 += 3;
                        } else {
                            i8 = i90;
                        }
                        i64 = i88;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(I4);
                    if ((charAt24 & 4096) == 4096 || i76 > 17) {
                        i23 = 1048575;
                        i24 = i22;
                        i25 = 0;
                    } else {
                        int i91 = i22 + 1;
                        int charAt26 = str.charAt(i22);
                        if (charAt26 >= 55296) {
                            int i92 = charAt26 & 8191;
                            int i93 = 13;
                            while (true) {
                                i24 = i91 + 1;
                                charAt12 = str.charAt(i91);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i92 |= (charAt12 & 8191) << i93;
                                i93 += 13;
                                i91 = i24;
                            }
                            charAt26 = i92 | (charAt12 << i93);
                        } else {
                            i24 = i91;
                        }
                        int i94 = (charAt26 / 32) + (i61 * 2);
                        Object obj3 = objArr[i94];
                        if (obj3 instanceof Field) {
                            I = (Field) obj3;
                        } else {
                            I = I(cls, (String) obj3);
                            objArr[i94] = I;
                        }
                        i23 = (int) unsafe.objectFieldOffset(I);
                        i25 = charAt26 % 32;
                    }
                    if (i76 >= 18 && i76 <= 49) {
                        iArr[i63] = objectFieldOffset;
                        i63++;
                    }
                }
                i8 = i87;
                objectFieldOffset = (int) unsafe.objectFieldOffset(I4);
                if ((charAt24 & 4096) == 4096) {
                }
                i23 = 1048575;
                i24 = i22;
                i25 = 0;
                if (i76 >= 18) {
                    iArr[i63] = objectFieldOffset;
                    i63++;
                }
            }
            int i95 = i66 + 1;
            iArr4[i66] = i75;
            int i96 = i66 + 2;
            String str2 = str;
            iArr4[i95] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i76 << 20) | objectFieldOffset;
            i66 += 3;
            iArr4[i96] = (i25 << 20) | i23;
            str = str2;
            iArr3 = iArr4;
            i9 = i77;
            length = i20;
            i33 = i24;
            i10 = i78;
        }
        return new p0(iArr3, objArr2, i9, i10, x0Var.f924a, z8, iArr, charAt3, i62, r0Var, f0Var, j1Var, oVar, l0Var);
    }

    public static long B(int i7) {
        return i7 & 1048575;
    }

    public static int C(long j8, Object obj) {
        return ((Integer) r1.f903c.i(j8, obj)).intValue();
    }

    public static long D(long j8, Object obj) {
        return ((Long) r1.f903c.i(j8, obj)).longValue();
    }

    public static Field I(Class cls, String str) {
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

    public static int N(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void R(int i7, Object obj, h0 h0Var) {
        if (!(obj instanceof String)) {
            h0Var.a(i7, (g) obj);
        } else {
            ((l) h0Var.f831a).J((String) obj, i7);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof v) {
            return ((v) obj).g();
        }
        return true;
    }

    public static List t(v vVar, long j8) {
        return (List) r1.f903c.i(j8, vVar);
    }

    public static p0 z(x0 x0Var, r0 r0Var, f0 f0Var, j1 j1Var, o oVar, l0 l0Var) {
        if (x0Var instanceof x0) {
            return A(x0Var, r0Var, f0Var, j1Var, oVar, l0Var);
        }
        x0Var.getClass();
        throw new ClassCastException();
    }

    public final void E(Object obj, long j8, a0.p pVar, y0 y0Var, n nVar) {
        int u8;
        List c4 = this.f886l.c(j8, obj);
        j jVar = (j) pVar.f121e;
        int i7 = pVar.f118b;
        if ((i7 & 7) != 3) {
            throw z.b();
        }
        do {
            v i8 = y0Var.i();
            pVar.f(i8, y0Var, nVar);
            y0Var.e(i8);
            c4.add(i8);
            if (jVar.c() || pVar.f120d != 0) {
                return;
            } else {
                u8 = jVar.u();
            }
        } while (u8 == i7);
        pVar.f120d = u8;
    }

    public final void F(Object obj, int i7, a0.p pVar, y0 y0Var, n nVar) {
        int u8;
        List c4 = this.f886l.c(i7 & 1048575, obj);
        j jVar = (j) pVar.f121e;
        int i8 = pVar.f118b;
        if ((i8 & 7) != 2) {
            throw z.b();
        }
        do {
            v i9 = y0Var.i();
            pVar.g(i9, y0Var, nVar);
            y0Var.e(i9);
            c4.add(i9);
            if (jVar.c() || pVar.f120d != 0) {
                return;
            } else {
                u8 = jVar.u();
            }
        } while (u8 == i8);
        pVar.f120d = u8;
    }

    public final void G(Object obj, int i7, a0.p pVar) {
        if ((536870912 & i7) != 0) {
            pVar.A(2);
            r1.p(i7 & 1048575, obj, ((j) pVar.f121e).t());
        } else if (!this.f880f) {
            r1.p(i7 & 1048575, obj, pVar.i());
        } else {
            pVar.A(2);
            r1.p(i7 & 1048575, obj, ((j) pVar.f121e).s());
        }
    }

    public final void H(Object obj, int i7, a0.p pVar) {
        int i8 = 536870912 & i7;
        f0 f0Var = this.f886l;
        if (i8 != 0) {
            pVar.w(f0Var.c(i7 & 1048575, obj), true);
        } else {
            pVar.w(f0Var.c(i7 & 1048575, obj), false);
        }
    }

    public final void J(int i7, Object obj) {
        int i8 = this.f875a[i7 + 2];
        long j8 = 1048575 & i8;
        if (j8 == 1048575) {
            return;
        }
        r1.n((1 << (i8 >>> 20)) | r1.f903c.g(j8, obj), j8, obj);
    }

    public final void K(int i7, int i8, Object obj) {
        r1.n(i7, this.f875a[i8 + 2] & 1048575, obj);
    }

    public final void L(Object obj, int i7, a aVar) {
        f874p.putObject(obj, O(i7) & 1048575, aVar);
        J(i7, obj);
    }

    public final void M(Object obj, int i7, int i8, a aVar) {
        f874p.putObject(obj, O(i8) & 1048575, aVar);
        K(i7, i8, obj);
    }

    public final int O(int i7) {
        return this.f875a[i7 + 1];
    }

    public final void P(Object obj, h0 h0Var) {
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f875a;
        int length = iArr.length;
        Unsafe unsafe = f874p;
        int i10 = 1048575;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 = i9 + 3) {
            int O = O(i12);
            int i13 = iArr[i12];
            int N = N(O);
            if (N <= 17) {
                int i14 = iArr[i12 + 2];
                i7 = 1048575;
                int i15 = i14 & 1048575;
                if (i15 != i10) {
                    i11 = unsafe.getInt(obj, i15);
                    i10 = i15;
                }
                i8 = 1 << (i14 >>> 20);
            } else {
                i7 = 1048575;
                i8 = 0;
            }
            int i16 = i12;
            long j8 = O & i7;
            switch (N) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i9 = i16;
                    if ((i8 & i11) == 0) {
                        break;
                    } else {
                        double e9 = r1.f903c.e(j8, obj);
                        l lVar = (l) h0Var.f831a;
                        lVar.getClass();
                        lVar.E(Double.doubleToRawLongBits(e9), i13);
                        continue;
                    }
                case 1:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        float f9 = r1.f903c.f(j8, obj);
                        l lVar2 = (l) h0Var.f831a;
                        lVar2.getClass();
                        lVar2.C(i13, Float.floatToRawIntBits(f9));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).O(unsafe.getLong(obj, j8), i13);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).O(unsafe.getLong(obj, j8), i13);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).G(i13, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).E(unsafe.getLong(obj, j8), i13);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).C(i13, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).z(i13, r1.f903c.c(j8, obj));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        R(i13, unsafe.getObject(obj, j8), h0Var);
                        break;
                    } else {
                        continue;
                    }
                case q.c.f7259c /* 9 */:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).I(i13, (a) unsafe.getObject(obj, j8), n(i9));
                        break;
                    } else {
                        continue;
                    }
                case q.c.f7261e /* 10 */:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        h0Var.a(i13, (g) unsafe.getObject(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).M(i13, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).G(i13, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).C(i13, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        ((l) h0Var.f831a).E(unsafe.getLong(obj, j8), i13);
                        break;
                    } else {
                        continue;
                    }
                case q.c.f7263g /* 15 */:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        int i17 = unsafe.getInt(obj, j8);
                        ((l) h0Var.f831a).M(i13, (i17 >> 31) ^ (i17 << 1));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        long j9 = unsafe.getLong(obj, j8);
                        ((l) h0Var.f831a).O((j9 << 1) ^ (j9 >> 63), i13);
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    i9 = i16;
                    if ((i8 & i11) != 0) {
                        h0Var.b(i13, unsafe.getObject(obj, j8), n(i9));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i9 = i16;
                    z0.B(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 19:
                    i9 = i16;
                    z0.F(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 20:
                    i9 = i16;
                    z0.I(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 21:
                    i9 = i16;
                    z0.Q(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 22:
                    i9 = i16;
                    z0.H(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 23:
                    i9 = i16;
                    z0.E(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 24:
                    i9 = i16;
                    z0.D(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 25:
                    i9 = i16;
                    z0.z(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 26:
                    i9 = i16;
                    z0.O(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var);
                    break;
                case 27:
                    i9 = i16;
                    z0.J(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, n(i9));
                    break;
                case 28:
                    i9 = i16;
                    z0.A(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var);
                    break;
                case 29:
                    i9 = i16;
                    z0.P(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    break;
                case 30:
                    i9 = i16;
                    z0.C(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 31:
                    i9 = i16;
                    z0.K(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 32:
                    i9 = i16;
                    z0.L(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 33:
                    i9 = i16;
                    z0.M(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 34:
                    i9 = i16;
                    z0.N(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, false);
                    continue;
                case 35:
                    i9 = i16;
                    z0.B(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 36:
                    i9 = i16;
                    z0.F(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 37:
                    i9 = i16;
                    z0.I(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 38:
                    i9 = i16;
                    z0.Q(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 39:
                    i9 = i16;
                    z0.H(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 40:
                    i9 = i16;
                    z0.E(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 41:
                    i9 = i16;
                    z0.D(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 42:
                    i9 = i16;
                    z0.z(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 43:
                    i9 = i16;
                    z0.P(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 44:
                    i9 = i16;
                    z0.C(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 45:
                    i9 = i16;
                    z0.K(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 46:
                    i9 = i16;
                    z0.L(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 47:
                    i9 = i16;
                    z0.M(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case q.c.f7264h /* 48 */:
                    i9 = i16;
                    z0.N(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, true);
                    break;
                case 49:
                    i9 = i16;
                    z0.G(iArr[i9], (List) unsafe.getObject(obj, j8), h0Var, n(i9));
                    break;
                case 50:
                    i9 = i16;
                    Q(h0Var, i13, unsafe.getObject(obj, j8), i9);
                    break;
                case 51:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        double doubleValue = ((Double) r1.f903c.i(j8, obj)).doubleValue();
                        l lVar3 = (l) h0Var.f831a;
                        lVar3.getClass();
                        lVar3.E(Double.doubleToRawLongBits(doubleValue), i13);
                        break;
                    }
                    break;
                case 52:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        float floatValue = ((Float) r1.f903c.i(j8, obj)).floatValue();
                        l lVar4 = (l) h0Var.f831a;
                        lVar4.getClass();
                        lVar4.C(i13, Float.floatToRawIntBits(floatValue));
                        break;
                    }
                    break;
                case 53:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).O(D(j8, obj), i13);
                        break;
                    }
                    break;
                case 54:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).O(D(j8, obj), i13);
                        break;
                    }
                    break;
                case 55:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).G(i13, C(j8, obj));
                        break;
                    }
                    break;
                case 56:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).E(D(j8, obj), i13);
                        break;
                    }
                    break;
                case 57:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).C(i13, C(j8, obj));
                        break;
                    }
                    break;
                case 58:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).z(i13, ((Boolean) r1.f903c.i(j8, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        R(i13, unsafe.getObject(obj, j8), h0Var);
                        break;
                    }
                    break;
                case 60:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).I(i13, (a) unsafe.getObject(obj, j8), n(i9));
                        break;
                    }
                    break;
                case 61:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        h0Var.a(i13, (g) unsafe.getObject(obj, j8));
                        break;
                    }
                    break;
                case 62:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).M(i13, C(j8, obj));
                        break;
                    }
                    break;
                case 63:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).G(i13, C(j8, obj));
                        break;
                    }
                    break;
                case 64:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).C(i13, C(j8, obj));
                        break;
                    }
                    break;
                case 65:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        ((l) h0Var.f831a).E(D(j8, obj), i13);
                        break;
                    }
                    break;
                case 66:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        int C = C(j8, obj);
                        ((l) h0Var.f831a).M(i13, (C >> 31) ^ (C << 1));
                        break;
                    }
                    break;
                case 67:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        long D = D(j8, obj);
                        ((l) h0Var.f831a).O((D << 1) ^ (D >> 63), i13);
                        break;
                    }
                    break;
                case 68:
                    i9 = i16;
                    if (s(i13, i9, obj)) {
                        h0Var.b(i13, unsafe.getObject(obj, j8), n(i9));
                        break;
                    }
                    break;
                default:
                    i9 = i16;
                    break;
            }
        }
        this.f887m.getClass();
        ((v) obj).unknownFields.d(h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(h0 h0Var, int i7, Object obj, int i8) {
        int u8;
        int size;
        int t2;
        int size2;
        int t8;
        if (obj != null) {
            Object m8 = m(i8);
            this.f888n.getClass();
            i0 i0Var = ((j0) m8).f851a;
            z1 z1Var = i0Var.f841b;
            z1 z1Var2 = i0Var.f840a;
            l lVar = (l) h0Var.f831a;
            lVar.getClass();
            for (Map.Entry entry : ((k0) obj).entrySet()) {
                lVar.L(i7, 2);
                Object key = entry.getKey();
                Object value = entry.getValue();
                int i9 = q.f889c;
                int s5 = l.s(1);
                w1 w1Var = z1.f934i;
                if (z1Var2 == w1Var) {
                    s5 *= 2;
                }
                int i10 = 8;
                switch (z1Var2.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((Double) key).getClass();
                        u8 = 8;
                        int i11 = u8 + s5;
                        int s8 = l.s(2);
                        if (z1Var == w1Var) {
                            s8 *= 2;
                        }
                        switch (z1Var.ordinal()) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                ((Double) value).getClass();
                                lVar.N(i10 + s8 + i11);
                                Object key2 = entry.getKey();
                                Object value2 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key2);
                                q.b(lVar, z1Var, 2, value2);
                            case 1:
                                ((Float) value).getClass();
                                i10 = 4;
                                lVar.N(i10 + s8 + i11);
                                Object key22 = entry.getKey();
                                Object value22 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key22);
                                q.b(lVar, z1Var, 2, value22);
                            case 2:
                                i10 = l.u(((Long) value).longValue());
                                lVar.N(i10 + s8 + i11);
                                Object key222 = entry.getKey();
                                Object value222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key222);
                                q.b(lVar, z1Var, 2, value222);
                            case 3:
                                i10 = l.u(((Long) value).longValue());
                                lVar.N(i10 + s8 + i11);
                                Object key2222 = entry.getKey();
                                Object value2222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key2222);
                                q.b(lVar, z1Var, 2, value2222);
                            case 4:
                                i10 = l.q(((Integer) value).intValue());
                                lVar.N(i10 + s8 + i11);
                                Object key22222 = entry.getKey();
                                Object value22222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key22222);
                                q.b(lVar, z1Var, 2, value22222);
                            case 5:
                                ((Long) value).getClass();
                                lVar.N(i10 + s8 + i11);
                                Object key222222 = entry.getKey();
                                Object value222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key222222);
                                q.b(lVar, z1Var, 2, value222222);
                            case 6:
                                ((Integer) value).getClass();
                                i10 = 4;
                                lVar.N(i10 + s8 + i11);
                                Object key2222222 = entry.getKey();
                                Object value2222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key2222222);
                                q.b(lVar, z1Var, 2, value2222222);
                            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                ((Boolean) value).getClass();
                                i10 = 1;
                                lVar.N(i10 + s8 + i11);
                                Object key22222222 = entry.getKey();
                                Object value22222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key22222222);
                                q.b(lVar, z1Var, 2, value22222222);
                            case 8:
                                if (value instanceof g) {
                                    size2 = ((g) value).size();
                                    t8 = l.t(size2);
                                    i10 = t8 + size2;
                                    lVar.N(i10 + s8 + i11);
                                    Object key222222222 = entry.getKey();
                                    Object value222222222 = entry.getValue();
                                    q.b(lVar, z1Var2, 1, key222222222);
                                    q.b(lVar, z1Var, 2, value222222222);
                                } else {
                                    i10 = l.r((String) value);
                                    lVar.N(i10 + s8 + i11);
                                    Object key2222222222 = entry.getKey();
                                    Object value2222222222 = entry.getValue();
                                    q.b(lVar, z1Var2, 1, key2222222222);
                                    q.b(lVar, z1Var, 2, value2222222222);
                                }
                            case q.c.f7259c /* 9 */:
                                i10 = ((v) ((a) value)).a(null);
                                lVar.N(i10 + s8 + i11);
                                Object key22222222222 = entry.getKey();
                                Object value22222222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key22222222222);
                                q.b(lVar, z1Var, 2, value22222222222);
                            case q.c.f7261e /* 10 */:
                                size2 = ((v) ((a) value)).a(null);
                                t8 = l.t(size2);
                                i10 = t8 + size2;
                                lVar.N(i10 + s8 + i11);
                                Object key222222222222 = entry.getKey();
                                Object value222222222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key222222222222);
                                q.b(lVar, z1Var, 2, value222222222222);
                            case 11:
                                if (value instanceof g) {
                                    size2 = ((g) value).size();
                                    t8 = l.t(size2);
                                } else {
                                    size2 = ((byte[]) value).length;
                                    t8 = l.t(size2);
                                }
                                i10 = t8 + size2;
                                lVar.N(i10 + s8 + i11);
                                Object key2222222222222 = entry.getKey();
                                Object value2222222222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key2222222222222);
                                q.b(lVar, z1Var, 2, value2222222222222);
                            case 12:
                                i10 = l.t(((Integer) value).intValue());
                                lVar.N(i10 + s8 + i11);
                                Object key22222222222222 = entry.getKey();
                                Object value22222222222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key22222222222222);
                                q.b(lVar, z1Var, 2, value22222222222222);
                            case 13:
                                i10 = l.q(((Integer) value).intValue());
                                lVar.N(i10 + s8 + i11);
                                Object key222222222222222 = entry.getKey();
                                Object value222222222222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key222222222222222);
                                q.b(lVar, z1Var, 2, value222222222222222);
                            case 14:
                                ((Integer) value).getClass();
                                i10 = 4;
                                lVar.N(i10 + s8 + i11);
                                Object key2222222222222222 = entry.getKey();
                                Object value2222222222222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key2222222222222222);
                                q.b(lVar, z1Var, 2, value2222222222222222);
                            case q.c.f7263g /* 15 */:
                                ((Long) value).getClass();
                                lVar.N(i10 + s8 + i11);
                                Object key22222222222222222 = entry.getKey();
                                Object value22222222222222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key22222222222222222);
                                q.b(lVar, z1Var, 2, value22222222222222222);
                            case 16:
                                int intValue = ((Integer) value).intValue();
                                i10 = l.t((intValue >> 31) ^ (intValue << 1));
                                lVar.N(i10 + s8 + i11);
                                Object key222222222222222222 = entry.getKey();
                                Object value222222222222222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key222222222222222222);
                                q.b(lVar, z1Var, 2, value222222222222222222);
                            case 17:
                                long longValue = ((Long) value).longValue();
                                i10 = l.u((longValue >> 63) ^ (longValue << 1));
                                lVar.N(i10 + s8 + i11);
                                Object key2222222222222222222 = entry.getKey();
                                Object value2222222222222222222 = entry.getValue();
                                q.b(lVar, z1Var2, 1, key2222222222222222222);
                                q.b(lVar, z1Var, 2, value2222222222222222222);
                            default:
                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                        }
                    case 1:
                        ((Float) key).getClass();
                        u8 = 4;
                        int i112 = u8 + s5;
                        int s82 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 2:
                        u8 = l.u(((Long) key).longValue());
                        int i1122 = u8 + s5;
                        int s822 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 3:
                        u8 = l.u(((Long) key).longValue());
                        int i11222 = u8 + s5;
                        int s8222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 4:
                        u8 = l.q(((Integer) key).intValue());
                        int i112222 = u8 + s5;
                        int s82222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 5:
                        ((Long) key).getClass();
                        u8 = 8;
                        int i1122222 = u8 + s5;
                        int s822222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 6:
                        ((Integer) key).getClass();
                        u8 = 4;
                        int i11222222 = u8 + s5;
                        int s8222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        ((Boolean) key).getClass();
                        u8 = 1;
                        int i112222222 = u8 + s5;
                        int s82222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 8:
                        if (key instanceof g) {
                            size = ((g) key).size();
                            t2 = l.t(size);
                            u8 = size + t2;
                            int i1122222222 = u8 + s5;
                            int s822222222 = l.s(2);
                            if (z1Var == w1Var) {
                            }
                            switch (z1Var.ordinal()) {
                            }
                        } else {
                            u8 = l.r((String) key);
                            int i11222222222 = u8 + s5;
                            int s8222222222 = l.s(2);
                            if (z1Var == w1Var) {
                            }
                            switch (z1Var.ordinal()) {
                            }
                        }
                    case q.c.f7259c /* 9 */:
                        u8 = ((v) ((a) key)).a(null);
                        int i112222222222 = u8 + s5;
                        int s82222222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case q.c.f7261e /* 10 */:
                        size = ((v) ((a) key)).a(null);
                        t2 = l.t(size);
                        u8 = size + t2;
                        int i1122222222222 = u8 + s5;
                        int s822222222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 11:
                        if (key instanceof g) {
                            size = ((g) key).size();
                            t2 = l.t(size);
                        } else {
                            size = ((byte[]) key).length;
                            t2 = l.t(size);
                        }
                        u8 = size + t2;
                        int i11222222222222 = u8 + s5;
                        int s8222222222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 12:
                        u8 = l.t(((Integer) key).intValue());
                        int i112222222222222 = u8 + s5;
                        int s82222222222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 13:
                        u8 = l.q(((Integer) key).intValue());
                        int i1122222222222222 = u8 + s5;
                        int s822222222222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 14:
                        ((Integer) key).getClass();
                        u8 = 4;
                        int i11222222222222222 = u8 + s5;
                        int s8222222222222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case q.c.f7263g /* 15 */:
                        ((Long) key).getClass();
                        u8 = 8;
                        int i112222222222222222 = u8 + s5;
                        int s82222222222222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 16:
                        int intValue2 = ((Integer) key).intValue();
                        u8 = l.t((intValue2 >> 31) ^ (intValue2 << 1));
                        int i1122222222222222222 = u8 + s5;
                        int s822222222222222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    case 17:
                        long longValue2 = ((Long) key).longValue();
                        u8 = l.u((longValue2 << 1) ^ (longValue2 >> 63));
                        int i11222222222222222222 = u8 + s5;
                        int s8222222222222222222 = l.s(2);
                        if (z1Var == w1Var) {
                        }
                        switch (z1Var.ordinal()) {
                        }
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.y0
    public final void a(java.lang.Object r19, a0.p r20, androidx.datastore.preferences.protobuf.n r21) {
        /*
            Method dump skipped, instructions count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.p0.a(java.lang.Object, a0.p, androidx.datastore.preferences.protobuf.n):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.y0
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f875a;
            if (i7 >= iArr.length) {
                z0.x(this.f887m, obj, obj2);
                return;
            }
            int O = O(i7);
            long j8 = 1048575 & O;
            int i8 = iArr[i7];
            switch (N(O)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (q(i7, obj2)) {
                        q1 q1Var = r1.f903c;
                        obj3 = obj;
                        q1Var.m(obj3, j8, q1Var.e(j8, obj2));
                        J(i7, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (q(i7, obj2)) {
                        q1 q1Var2 = r1.f903c;
                        q1Var2.n(obj, j8, q1Var2.f(j8, obj2));
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (q(i7, obj2)) {
                        r1.o(obj, j8, r1.f903c.h(j8, obj2));
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (q(i7, obj2)) {
                        r1.o(obj, j8, r1.f903c.h(j8, obj2));
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (q(i7, obj2)) {
                        r1.n(r1.f903c.g(j8, obj2), j8, obj);
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (q(i7, obj2)) {
                        r1.o(obj, j8, r1.f903c.h(j8, obj2));
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (q(i7, obj2)) {
                        r1.n(r1.f903c.g(j8, obj2), j8, obj);
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (q(i7, obj2)) {
                        q1 q1Var3 = r1.f903c;
                        q1Var3.k(obj, j8, q1Var3.c(j8, obj2));
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (q(i7, obj2)) {
                        r1.p(j8, obj, r1.f903c.i(j8, obj2));
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case q.c.f7259c /* 9 */:
                    v(obj, i7, obj2);
                    obj3 = obj;
                    break;
                case q.c.f7261e /* 10 */:
                    if (q(i7, obj2)) {
                        r1.p(j8, obj, r1.f903c.i(j8, obj2));
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (q(i7, obj2)) {
                        r1.n(r1.f903c.g(j8, obj2), j8, obj);
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (q(i7, obj2)) {
                        r1.n(r1.f903c.g(j8, obj2), j8, obj);
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (q(i7, obj2)) {
                        r1.n(r1.f903c.g(j8, obj2), j8, obj);
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (q(i7, obj2)) {
                        r1.o(obj, j8, r1.f903c.h(j8, obj2));
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case q.c.f7263g /* 15 */:
                    if (q(i7, obj2)) {
                        r1.n(r1.f903c.g(j8, obj2), j8, obj);
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (q(i7, obj2)) {
                        r1.o(obj, j8, r1.f903c.h(j8, obj2));
                        J(i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    v(obj, i7, obj2);
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
                case q.c.f7264h /* 48 */:
                case 49:
                    this.f886l.b(j8, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = z0.f929a;
                    q1 q1Var4 = r1.f903c;
                    Object i9 = q1Var4.i(j8, obj);
                    Object i10 = q1Var4.i(j8, obj2);
                    this.f888n.getClass();
                    r1.p(j8, obj, l0.b(i9, i10));
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
                    if (s(i8, i7, obj2)) {
                        r1.p(j8, obj, r1.f903c.i(j8, obj2));
                        K(i8, i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    w(obj, i7, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(i8, i7, obj2)) {
                        r1.p(j8, obj, r1.f903c.i(j8, obj2));
                        K(i8, i7, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    w(obj, i7, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i7 += 3;
            obj = obj3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final void c(Object obj, h0 h0Var) {
        h0Var.getClass();
        l lVar = (l) h0Var.f831a;
        if (!this.f881g) {
            P(obj, h0Var);
            return;
        }
        int[] iArr = this.f875a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int O = O(i7);
            int i8 = iArr[i7];
            switch (N(O)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (q(i7, obj)) {
                        double e9 = r1.f903c.e(O & 1048575, obj);
                        lVar.getClass();
                        lVar.E(Double.doubleToRawLongBits(e9), i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i7, obj)) {
                        float f9 = r1.f903c.f(O & 1048575, obj);
                        lVar.getClass();
                        lVar.C(i8, Float.floatToRawIntBits(f9));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i7, obj)) {
                        lVar.O(r1.f903c.h(O & 1048575, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i7, obj)) {
                        lVar.O(r1.f903c.h(O & 1048575, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i7, obj)) {
                        lVar.G(i8, r1.f903c.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i7, obj)) {
                        lVar.E(r1.f903c.h(O & 1048575, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i7, obj)) {
                        lVar.C(i8, r1.f903c.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (q(i7, obj)) {
                        lVar.z(i8, r1.f903c.c(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i7, obj)) {
                        R(i8, r1.f903c.i(O & 1048575, obj), h0Var);
                        break;
                    } else {
                        break;
                    }
                case q.c.f7259c /* 9 */:
                    if (q(i7, obj)) {
                        lVar.I(i8, (a) r1.f903c.i(O & 1048575, obj), n(i7));
                        break;
                    } else {
                        break;
                    }
                case q.c.f7261e /* 10 */:
                    if (q(i7, obj)) {
                        h0Var.a(i8, (g) r1.f903c.i(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i7, obj)) {
                        lVar.M(i8, r1.f903c.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i7, obj)) {
                        lVar.G(i8, r1.f903c.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i7, obj)) {
                        lVar.C(i8, r1.f903c.g(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i7, obj)) {
                        lVar.E(r1.f903c.h(O & 1048575, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case q.c.f7263g /* 15 */:
                    if (q(i7, obj)) {
                        int g9 = r1.f903c.g(O & 1048575, obj);
                        lVar.M(i8, (g9 >> 31) ^ (g9 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i7, obj)) {
                        long h3 = r1.f903c.h(O & 1048575, obj);
                        lVar.O((h3 >> 63) ^ (h3 << 1), i8);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i7, obj)) {
                        h0Var.b(i8, r1.f903c.i(O & 1048575, obj), n(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    z0.B(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 19:
                    z0.F(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 20:
                    z0.I(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 21:
                    z0.Q(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 22:
                    z0.H(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 23:
                    z0.E(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 24:
                    z0.D(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 25:
                    z0.z(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 26:
                    z0.O(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var);
                    break;
                case 27:
                    z0.J(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, n(i7));
                    break;
                case 28:
                    z0.A(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var);
                    break;
                case 29:
                    z0.P(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 30:
                    z0.C(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 31:
                    z0.K(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 32:
                    z0.L(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 33:
                    z0.M(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 34:
                    z0.N(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, false);
                    break;
                case 35:
                    z0.B(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 36:
                    z0.F(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 37:
                    z0.I(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 38:
                    z0.Q(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 39:
                    z0.H(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 40:
                    z0.E(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 41:
                    z0.D(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 42:
                    z0.z(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 43:
                    z0.P(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 44:
                    z0.C(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 45:
                    z0.K(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 46:
                    z0.L(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 47:
                    z0.M(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case q.c.f7264h /* 48 */:
                    z0.N(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, true);
                    break;
                case 49:
                    z0.G(iArr[i7], (List) r1.f903c.i(O & 1048575, obj), h0Var, n(i7));
                    break;
                case 50:
                    Q(h0Var, i8, r1.f903c.i(O & 1048575, obj), i7);
                    break;
                case 51:
                    if (s(i8, i7, obj)) {
                        double doubleValue = ((Double) r1.f903c.i(O & 1048575, obj)).doubleValue();
                        lVar.getClass();
                        lVar.E(Double.doubleToRawLongBits(doubleValue), i8);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i8, i7, obj)) {
                        float floatValue = ((Float) r1.f903c.i(O & 1048575, obj)).floatValue();
                        lVar.getClass();
                        lVar.C(i8, Float.floatToRawIntBits(floatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i8, i7, obj)) {
                        lVar.O(D(O & 1048575, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i8, i7, obj)) {
                        lVar.O(D(O & 1048575, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i8, i7, obj)) {
                        lVar.G(i8, C(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i8, i7, obj)) {
                        lVar.E(D(O & 1048575, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i8, i7, obj)) {
                        lVar.C(i8, C(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i8, i7, obj)) {
                        lVar.z(i8, ((Boolean) r1.f903c.i(O & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i8, i7, obj)) {
                        R(i8, r1.f903c.i(O & 1048575, obj), h0Var);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(i8, i7, obj)) {
                        lVar.I(i8, (a) r1.f903c.i(O & 1048575, obj), n(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i8, i7, obj)) {
                        h0Var.a(i8, (g) r1.f903c.i(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i8, i7, obj)) {
                        lVar.M(i8, C(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i8, i7, obj)) {
                        lVar.G(i8, C(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i8, i7, obj)) {
                        lVar.C(i8, C(O & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i8, i7, obj)) {
                        lVar.E(D(O & 1048575, obj), i8);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i8, i7, obj)) {
                        int C = C(O & 1048575, obj);
                        lVar.M(i8, (C >> 31) ^ (C << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i8, i7, obj)) {
                        long D = D(O & 1048575, obj);
                        lVar.O((D >> 63) ^ (D << 1), i8);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i8, i7, obj)) {
                        h0Var.b(i8, r1.f903c.i(O & 1048575, obj), n(i7));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f887m.getClass();
        ((v) obj).unknownFields.d(h0Var);
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
    @Override // androidx.datastore.preferences.protobuf.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(v vVar) {
        int i7;
        int b9;
        int i8;
        int[] iArr = this.f875a;
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int O = O(i10);
            int i11 = iArr[i10];
            long j8 = 1048575 & O;
            int i12 = 1237;
            int i13 = 37;
            switch (N(O)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    i7 = i9 * 53;
                    b9 = x.b(Double.doubleToLongBits(r1.f903c.e(j8, vVar)));
                    i9 = b9 + i7;
                    break;
                case 1:
                    i7 = i9 * 53;
                    b9 = Float.floatToIntBits(r1.f903c.f(j8, vVar));
                    i9 = b9 + i7;
                    break;
                case 2:
                    i7 = i9 * 53;
                    b9 = x.b(r1.f903c.h(j8, vVar));
                    i9 = b9 + i7;
                    break;
                case 3:
                    i7 = i9 * 53;
                    b9 = x.b(r1.f903c.h(j8, vVar));
                    i9 = b9 + i7;
                    break;
                case 4:
                    i7 = i9 * 53;
                    b9 = r1.f903c.g(j8, vVar);
                    i9 = b9 + i7;
                    break;
                case 5:
                    i7 = i9 * 53;
                    b9 = x.b(r1.f903c.h(j8, vVar));
                    i9 = b9 + i7;
                    break;
                case 6:
                    i7 = i9 * 53;
                    b9 = r1.f903c.g(j8, vVar);
                    i9 = b9 + i7;
                    break;
                case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    i8 = i9 * 53;
                    boolean c4 = r1.f903c.c(j8, vVar);
                    Charset charset = x.f922a;
                    break;
                case 8:
                    i7 = i9 * 53;
                    b9 = ((String) r1.f903c.i(j8, vVar)).hashCode();
                    i9 = b9 + i7;
                    break;
                case q.c.f7259c /* 9 */:
                    Object i14 = r1.f903c.i(j8, vVar);
                    if (i14 != null) {
                        i13 = i14.hashCode();
                    }
                    i9 = (i9 * 53) + i13;
                    break;
                case q.c.f7261e /* 10 */:
                    i7 = i9 * 53;
                    b9 = r1.f903c.i(j8, vVar).hashCode();
                    i9 = b9 + i7;
                    break;
                case 11:
                    i7 = i9 * 53;
                    b9 = r1.f903c.g(j8, vVar);
                    i9 = b9 + i7;
                    break;
                case 12:
                    i7 = i9 * 53;
                    b9 = r1.f903c.g(j8, vVar);
                    i9 = b9 + i7;
                    break;
                case 13:
                    i7 = i9 * 53;
                    b9 = r1.f903c.g(j8, vVar);
                    i9 = b9 + i7;
                    break;
                case 14:
                    i7 = i9 * 53;
                    b9 = x.b(r1.f903c.h(j8, vVar));
                    i9 = b9 + i7;
                    break;
                case q.c.f7263g /* 15 */:
                    i7 = i9 * 53;
                    b9 = r1.f903c.g(j8, vVar);
                    i9 = b9 + i7;
                    break;
                case 16:
                    i7 = i9 * 53;
                    b9 = x.b(r1.f903c.h(j8, vVar));
                    i9 = b9 + i7;
                    break;
                case 17:
                    Object i15 = r1.f903c.i(j8, vVar);
                    if (i15 != null) {
                        i13 = i15.hashCode();
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
                case q.c.f7264h /* 48 */:
                case 49:
                    i7 = i9 * 53;
                    b9 = r1.f903c.i(j8, vVar).hashCode();
                    i9 = b9 + i7;
                    break;
                case 50:
                    i7 = i9 * 53;
                    b9 = r1.f903c.i(j8, vVar).hashCode();
                    i9 = b9 + i7;
                    break;
                case 51:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = x.b(Double.doubleToLongBits(((Double) r1.f903c.i(j8, vVar)).doubleValue()));
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = Float.floatToIntBits(((Float) r1.f903c.i(j8, vVar)).floatValue());
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = x.b(D(j8, vVar));
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = x.b(D(j8, vVar));
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = C(j8, vVar);
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = x.b(D(j8, vVar));
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = C(j8, vVar);
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i11, i10, vVar)) {
                        i8 = i9 * 53;
                        boolean booleanValue = ((Boolean) r1.f903c.i(j8, vVar)).booleanValue();
                        Charset charset2 = x.f922a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = ((String) r1.f903c.i(j8, vVar)).hashCode();
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = r1.f903c.i(j8, vVar).hashCode();
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = r1.f903c.i(j8, vVar).hashCode();
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = C(j8, vVar);
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = C(j8, vVar);
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = C(j8, vVar);
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = x.b(D(j8, vVar));
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = C(j8, vVar);
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = x.b(D(j8, vVar));
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i11, i10, vVar)) {
                        i7 = i9 * 53;
                        b9 = r1.f903c.i(j8, vVar).hashCode();
                        i9 = b9 + i7;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f887m.getClass();
        return vVar.unknownFields.hashCode() + (i9 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final void e(Object obj) {
        if (r(obj)) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                vVar.k(Integer.MAX_VALUE);
                vVar.memoizedHashCode = 0;
                vVar.h();
            }
            int[] iArr = this.f875a;
            int length = iArr.length;
            for (int i7 = 0; i7 < length; i7 += 3) {
                int O = O(i7);
                long j8 = 1048575 & O;
                int N = N(O);
                if (N != 9) {
                    if (N != 60 && N != 68) {
                        switch (N) {
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
                            case q.c.f7264h /* 48 */:
                            case 49:
                                this.f886l.a(j8, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f874p;
                                Object object = unsafe.getObject(obj, j8);
                                if (object != null) {
                                    this.f888n.getClass();
                                    ((k0) object).f853f = false;
                                    unsafe.putObject(obj, j8, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (s(iArr[i7], i7, obj)) {
                        n(i7).e(f874p.getObject(obj, j8));
                    }
                }
                if (q(i7, obj)) {
                    n(i7).e(f874p.getObject(obj, j8));
                }
            }
            this.f887m.getClass();
            ((v) obj).unknownFields.f848e = false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final boolean f(Object obj) {
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        loop0: while (true) {
            boolean z8 = true;
            if (i8 >= this.f883i) {
                return true;
            }
            int i10 = this.f882h[i8];
            int[] iArr = this.f875a;
            int i11 = iArr[i10];
            int O = O(i10);
            int i12 = iArr[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i7) {
                if (i13 != 1048575) {
                    i9 = f874p.getInt(obj, i13);
                }
                i7 = i13;
            }
            if ((268435456 & O) != 0) {
                if (!(i7 == 1048575 ? q(i10, obj) : (i9 & i14) != 0)) {
                    break;
                }
            }
            int N = N(O);
            if (N == 9 || N == 17) {
                if (i7 == 1048575) {
                    z8 = q(i10, obj);
                } else if ((i14 & i9) == 0) {
                    z8 = false;
                }
                if (z8) {
                    if (!n(i10).f(r1.f903c.i(O & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i8++;
            } else {
                if (N != 27) {
                    if (N == 60 || N == 68) {
                        if (s(i11, i10, obj)) {
                            if (!n(i10).f(r1.f903c.i(O & 1048575, obj))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                        i8++;
                    } else if (N != 49) {
                        if (N == 50) {
                            Object i15 = r1.f903c.i(O & 1048575, obj);
                            this.f888n.getClass();
                            k0 k0Var = (k0) i15;
                            if (!k0Var.isEmpty() && ((j0) m(i10)).f851a.f841b.f937f == a2.f792n) {
                                y0 y0Var = null;
                                for (Object obj2 : k0Var.values()) {
                                    if (y0Var == null) {
                                        y0Var = v0.f916c.a(obj2.getClass());
                                    }
                                    if (!y0Var.f(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        i8++;
                    }
                }
                List list = (List) r1.f903c.i(O & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    y0 n8 = n(i10);
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        if (!n8.f(list.get(i16))) {
                            break loop0;
                        }
                    }
                }
                i8++;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.z0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.z0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.z0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.z0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.z0.y(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(v vVar, v vVar2) {
        int[] iArr = this.f875a;
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            boolean z8 = true;
            if (i7 < length) {
                int O = O(i7);
                long j8 = O & 1048575;
                switch (N(O)) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 1:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var2 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 2:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var3 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 3:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var4 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 4:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var5 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 5:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var6 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 6:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var7 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var8 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 8:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var9 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case q.c.f7259c /* 9 */:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var10 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case q.c.f7261e /* 10 */:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var11 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 11:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var12 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 12:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var13 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 13:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var14 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 14:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var15 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case q.c.f7263g /* 15 */:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var16 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 16:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var17 = r1.f903c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 17:
                        if (j(vVar, vVar2, i7)) {
                            q1 q1Var18 = r1.f903c;
                            break;
                        }
                        z8 = false;
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
                    case q.c.f7264h /* 48 */:
                    case 49:
                        q1 q1Var19 = r1.f903c;
                        z8 = z0.y(q1Var19.i(j8, vVar), q1Var19.i(j8, vVar2));
                        break;
                    case 50:
                        q1 q1Var20 = r1.f903c;
                        z8 = z0.y(q1Var20.i(j8, vVar), q1Var20.i(j8, vVar2));
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
                        long j9 = iArr[i7 + 2] & 1048575;
                        q1 q1Var21 = r1.f903c;
                        if (q1Var21.g(j9, vVar) == q1Var21.g(j9, vVar2)) {
                            break;
                        }
                        z8 = false;
                        break;
                }
                if (z8) {
                    i7 += 3;
                }
            } else {
                this.f887m.getClass();
                if (vVar.unknownFields.equals(vVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final int h(v vVar) {
        return this.f881g ? p(vVar) : o(vVar);
    }

    @Override // androidx.datastore.preferences.protobuf.y0
    public final v i() {
        this.f885k.getClass();
        return ((v) this.f879e).i();
    }

    public final boolean j(v vVar, v vVar2, int i7) {
        return q(i7, vVar) == q(i7, vVar2);
    }

    public final void k(Object obj, int i7, Object obj2) {
        int i8 = this.f875a[i7];
        if (r1.f903c.i(O(i7) & 1048575, obj) == null) {
            return;
        }
        l(i7);
    }

    public final void l(int i7) {
        if (this.f876b[((i7 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object m(int i7) {
        return this.f876b[(i7 / 3) * 2];
    }

    public final y0 n(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f876b;
        y0 y0Var = (y0) objArr[i8];
        if (y0Var != null) {
            return y0Var;
        }
        y0 a3 = v0.f916c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a3;
        return a3;
    }

    public final int o(v vVar) {
        int i7;
        int s5;
        int u8;
        int s8;
        int q8;
        int o2;
        int s9;
        int r8;
        int c4;
        int i8;
        Unsafe unsafe = f874p;
        int i9 = 1048575;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f875a;
            if (i11 >= iArr.length) {
                this.f887m.getClass();
                return vVar.unknownFields.b() + i12;
            }
            int O = O(i11);
            int i14 = iArr[i11];
            int N = N(O);
            if (N <= 17) {
                int i15 = iArr[i11 + 2];
                int i16 = i15 & i9;
                i7 = 1 << (i15 >>> 20);
                if (i16 != i10) {
                    i13 = unsafe.getInt(vVar, i16);
                    i10 = i16;
                }
            } else {
                i7 = 0;
            }
            long j8 = O & i9;
            switch (N) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if ((i13 & i7) != 0) {
                        i12 = a0.m.b(i14, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i13 & i7) != 0) {
                        i12 = a0.m.b(i14, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i7 & i13) != 0) {
                        long j9 = unsafe.getLong(vVar, j8);
                        s5 = l.s(i14);
                        u8 = l.u(j9);
                        o2 = u8 + s5;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i7 & i13) != 0) {
                        long j10 = unsafe.getLong(vVar, j8);
                        s5 = l.s(i14);
                        u8 = l.u(j10);
                        o2 = u8 + s5;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i7 & i13) != 0) {
                        int i17 = unsafe.getInt(vVar, j8);
                        s8 = l.s(i14);
                        q8 = l.q(i17);
                        o2 = q8 + s8;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i13 & i7) != 0) {
                        o2 = l.o(i14);
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i13 & i7) != 0) {
                        o2 = l.n(i14);
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i13 & i7) != 0) {
                        i12 = a0.m.b(i14, 1, i12);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i7 & i13) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(vVar, j8);
                        if (object instanceof g) {
                            int s10 = l.s(i14);
                            int size = ((g) object).size();
                            c4 = a0.m.c(size, size, s10, i12);
                            i12 = c4;
                            break;
                        } else {
                            s9 = l.s(i14);
                            r8 = l.r((String) object);
                            c4 = r8 + s9 + i12;
                            i12 = c4;
                        }
                    }
                case q.c.f7259c /* 9 */:
                    if ((i7 & i13) != 0) {
                        Object object2 = unsafe.getObject(vVar, j8);
                        y0 n8 = n(i11);
                        Class cls = z0.f929a;
                        int s11 = l.s(i14);
                        int a3 = ((a) object2).a(n8);
                        i12 = a0.m.c(a3, a3, s11, i12);
                        break;
                    } else {
                        break;
                    }
                case q.c.f7261e /* 10 */:
                    if ((i7 & i13) != 0) {
                        o2 = l.l(i14, (g) unsafe.getObject(vVar, j8));
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i7 & i13) != 0) {
                        int i18 = unsafe.getInt(vVar, j8);
                        s8 = l.s(i14);
                        q8 = l.t(i18);
                        o2 = q8 + s8;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i7 & i13) != 0) {
                        int i19 = unsafe.getInt(vVar, j8);
                        s8 = l.s(i14);
                        q8 = l.q(i19);
                        o2 = q8 + s8;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i13 & i7) != 0) {
                        i12 = a0.m.b(i14, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i13 & i7) != 0) {
                        i12 = a0.m.b(i14, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case q.c.f7263g /* 15 */:
                    if ((i7 & i13) != 0) {
                        int i20 = unsafe.getInt(vVar, j8);
                        s8 = l.s(i14);
                        q8 = l.t((i20 >> 31) ^ (i20 << 1));
                        o2 = q8 + s8;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i7 & i13) != 0) {
                        long j11 = unsafe.getLong(vVar, j8);
                        s5 = l.s(i14);
                        u8 = l.u((j11 >> 63) ^ (j11 << 1));
                        o2 = u8 + s5;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i7 & i13) != 0) {
                        o2 = l.p(i14, (a) unsafe.getObject(vVar, j8), n(i11));
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    o2 = z0.f(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 19:
                    o2 = z0.d(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 20:
                    o2 = z0.j(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 21:
                    o2 = z0.t(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 22:
                    o2 = z0.h(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 23:
                    o2 = z0.f(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 24:
                    o2 = z0.d(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(vVar, j8);
                    Class cls2 = z0.f929a;
                    int size2 = list.size();
                    i12 += size2 == 0 ? 0 : (l.s(i14) + 1) * size2;
                    break;
                case 26:
                    o2 = z0.q(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 27:
                    o2 = z0.l(i14, (List) unsafe.getObject(vVar, j8), n(i11));
                    i12 += o2;
                    break;
                case 28:
                    o2 = z0.a(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 29:
                    o2 = z0.r(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 30:
                    o2 = z0.b(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 31:
                    o2 = z0.d(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 32:
                    o2 = z0.f(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 33:
                    o2 = z0.m(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 34:
                    o2 = z0.o(i14, (List) unsafe.getObject(vVar, j8));
                    i12 += o2;
                    break;
                case 35:
                    int g9 = z0.g((List) unsafe.getObject(vVar, j8));
                    if (g9 > 0) {
                        i12 = a0.m.c(g9, l.s(i14), g9, i12);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e9 = z0.e((List) unsafe.getObject(vVar, j8));
                    if (e9 > 0) {
                        i12 = a0.m.c(e9, l.s(i14), e9, i12);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k8 = z0.k((List) unsafe.getObject(vVar, j8));
                    if (k8 > 0) {
                        i12 = a0.m.c(k8, l.s(i14), k8, i12);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u9 = z0.u((List) unsafe.getObject(vVar, j8));
                    if (u9 > 0) {
                        i12 = a0.m.c(u9, l.s(i14), u9, i12);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i21 = z0.i((List) unsafe.getObject(vVar, j8));
                    if (i21 > 0) {
                        i12 = a0.m.c(i21, l.s(i14), i21, i12);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g10 = z0.g((List) unsafe.getObject(vVar, j8));
                    if (g10 > 0) {
                        i12 = a0.m.c(g10, l.s(i14), g10, i12);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e10 = z0.e((List) unsafe.getObject(vVar, j8));
                    if (e10 > 0) {
                        i12 = a0.m.c(e10, l.s(i14), e10, i12);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(vVar, j8);
                    Class cls3 = z0.f929a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        i12 = a0.m.c(size3, l.s(i14), size3, i12);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int s12 = z0.s((List) unsafe.getObject(vVar, j8));
                    if (s12 > 0) {
                        i12 = a0.m.c(s12, l.s(i14), s12, i12);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int c6 = z0.c((List) unsafe.getObject(vVar, j8));
                    if (c6 > 0) {
                        i12 = a0.m.c(c6, l.s(i14), c6, i12);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int e11 = z0.e((List) unsafe.getObject(vVar, j8));
                    if (e11 > 0) {
                        i12 = a0.m.c(e11, l.s(i14), e11, i12);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int g11 = z0.g((List) unsafe.getObject(vVar, j8));
                    if (g11 > 0) {
                        i12 = a0.m.c(g11, l.s(i14), g11, i12);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int n9 = z0.n((List) unsafe.getObject(vVar, j8));
                    if (n9 > 0) {
                        i12 = a0.m.c(n9, l.s(i14), n9, i12);
                        break;
                    } else {
                        break;
                    }
                case q.c.f7264h /* 48 */:
                    int p6 = z0.p((List) unsafe.getObject(vVar, j8));
                    if (p6 > 0) {
                        i12 = a0.m.c(p6, l.s(i14), p6, i12);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list3 = (List) unsafe.getObject(vVar, j8);
                    y0 n10 = n(i11);
                    Class cls4 = z0.f929a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        i8 = 0;
                    } else {
                        i8 = 0;
                        for (int i22 = 0; i22 < size4; i22++) {
                            i8 += l.p(i14, (a) list3.get(i22), n10);
                        }
                    }
                    i12 += i8;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(vVar, j8);
                    Object m8 = m(i11);
                    this.f888n.getClass();
                    o2 = l0.a(object3, i14, m8);
                    i12 += o2;
                    break;
                case 51:
                    if (s(i14, i11, vVar)) {
                        i12 = a0.m.b(i14, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i14, i11, vVar)) {
                        i12 = a0.m.b(i14, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i14, i11, vVar)) {
                        long D = D(j8, vVar);
                        s5 = l.s(i14);
                        u8 = l.u(D);
                        o2 = u8 + s5;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i14, i11, vVar)) {
                        long D2 = D(j8, vVar);
                        s5 = l.s(i14);
                        u8 = l.u(D2);
                        o2 = u8 + s5;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i14, i11, vVar)) {
                        int C = C(j8, vVar);
                        s8 = l.s(i14);
                        q8 = l.q(C);
                        o2 = q8 + s8;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i14, i11, vVar)) {
                        o2 = l.o(i14);
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i14, i11, vVar)) {
                        o2 = l.n(i14);
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i14, i11, vVar)) {
                        i12 = a0.m.b(i14, 1, i12);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!s(i14, i11, vVar)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(vVar, j8);
                        if (object4 instanceof g) {
                            int s13 = l.s(i14);
                            int size5 = ((g) object4).size();
                            c4 = a0.m.c(size5, size5, s13, i12);
                            i12 = c4;
                            break;
                        } else {
                            s9 = l.s(i14);
                            r8 = l.r((String) object4);
                            c4 = r8 + s9 + i12;
                            i12 = c4;
                        }
                    }
                case 60:
                    if (s(i14, i11, vVar)) {
                        Object object5 = unsafe.getObject(vVar, j8);
                        y0 n11 = n(i11);
                        Class cls5 = z0.f929a;
                        int s14 = l.s(i14);
                        int a9 = ((a) object5).a(n11);
                        i12 = a0.m.c(a9, a9, s14, i12);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i14, i11, vVar)) {
                        o2 = l.l(i14, (g) unsafe.getObject(vVar, j8));
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i14, i11, vVar)) {
                        int C2 = C(j8, vVar);
                        s8 = l.s(i14);
                        q8 = l.t(C2);
                        o2 = q8 + s8;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i14, i11, vVar)) {
                        int C3 = C(j8, vVar);
                        s8 = l.s(i14);
                        q8 = l.q(C3);
                        o2 = q8 + s8;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i14, i11, vVar)) {
                        i12 = a0.m.b(i14, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i14, i11, vVar)) {
                        i12 = a0.m.b(i14, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i14, i11, vVar)) {
                        int C4 = C(j8, vVar);
                        s8 = l.s(i14);
                        q8 = l.t((C4 >> 31) ^ (C4 << 1));
                        o2 = q8 + s8;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i14, i11, vVar)) {
                        long D3 = D(j8, vVar);
                        s5 = l.s(i14);
                        u8 = l.u((D3 >> 63) ^ (D3 << 1));
                        o2 = u8 + s5;
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i14, i11, vVar)) {
                        o2 = l.p(i14, (a) unsafe.getObject(vVar, j8), n(i11));
                        i12 += o2;
                        break;
                    } else {
                        break;
                    }
            }
            i11 += 3;
            i9 = 1048575;
        }
    }

    public final int p(v vVar) {
        int s5;
        int u8;
        int s8;
        int q8;
        int o2;
        int s9;
        int r8;
        int s10;
        int u9;
        int i7;
        Unsafe unsafe = f874p;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f875a;
            if (i8 >= iArr.length) {
                this.f887m.getClass();
                return vVar.unknownFields.b() + i9;
            }
            int O = O(i8);
            int N = N(O);
            int i10 = iArr[i8];
            long j8 = O & 1048575;
            if (N >= r.f896g.f900f && N <= r.f897h.f900f) {
                int i11 = iArr[i8 + 2];
            }
            switch (N) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (q(i8, vVar)) {
                        i9 = a0.m.b(i10, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (q(i8, vVar)) {
                        i9 = a0.m.b(i10, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (q(i8, vVar)) {
                        long h3 = r1.f903c.h(j8, vVar);
                        s5 = l.s(i10);
                        u8 = l.u(h3);
                        o2 = u8 + s5;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (q(i8, vVar)) {
                        long h8 = r1.f903c.h(j8, vVar);
                        s5 = l.s(i10);
                        u8 = l.u(h8);
                        o2 = u8 + s5;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (q(i8, vVar)) {
                        int g9 = r1.f903c.g(j8, vVar);
                        s8 = l.s(i10);
                        q8 = l.q(g9);
                        o2 = q8 + s8;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (q(i8, vVar)) {
                        o2 = l.o(i10);
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (q(i8, vVar)) {
                        o2 = l.n(i10);
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (q(i8, vVar)) {
                        i9 = a0.m.b(i10, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (q(i8, vVar)) {
                        Object i12 = r1.f903c.i(j8, vVar);
                        if (i12 instanceof g) {
                            int s11 = l.s(i10);
                            int size = ((g) i12).size();
                            i9 = a0.m.c(size, size, s11, i9);
                            break;
                        } else {
                            s9 = l.s(i10);
                            r8 = l.r((String) i12);
                            i9 = r8 + s9 + i9;
                            break;
                        }
                    } else {
                        break;
                    }
                case q.c.f7259c /* 9 */:
                    if (q(i8, vVar)) {
                        Object i13 = r1.f903c.i(j8, vVar);
                        y0 n8 = n(i8);
                        Class cls = z0.f929a;
                        int s12 = l.s(i10);
                        int a3 = ((a) i13).a(n8);
                        i9 = a0.m.c(a3, a3, s12, i9);
                        break;
                    } else {
                        break;
                    }
                case q.c.f7261e /* 10 */:
                    if (q(i8, vVar)) {
                        o2 = l.l(i10, (g) r1.f903c.i(j8, vVar));
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (q(i8, vVar)) {
                        int g10 = r1.f903c.g(j8, vVar);
                        s8 = l.s(i10);
                        q8 = l.t(g10);
                        o2 = q8 + s8;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (q(i8, vVar)) {
                        int g11 = r1.f903c.g(j8, vVar);
                        s8 = l.s(i10);
                        q8 = l.q(g11);
                        o2 = q8 + s8;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (q(i8, vVar)) {
                        i9 = a0.m.b(i10, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (q(i8, vVar)) {
                        i9 = a0.m.b(i10, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case q.c.f7263g /* 15 */:
                    if (q(i8, vVar)) {
                        int g12 = r1.f903c.g(j8, vVar);
                        s8 = l.s(i10);
                        q8 = l.t((g12 >> 31) ^ (g12 << 1));
                        o2 = q8 + s8;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (q(i8, vVar)) {
                        long h9 = r1.f903c.h(j8, vVar);
                        s10 = l.s(i10);
                        u9 = l.u((h9 >> 63) ^ (h9 << 1));
                        o2 = u9 + s10;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (q(i8, vVar)) {
                        o2 = l.p(i10, (a) r1.f903c.i(j8, vVar), n(i8));
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    o2 = z0.f(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 19:
                    o2 = z0.d(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 20:
                    o2 = z0.j(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 21:
                    o2 = z0.t(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 22:
                    o2 = z0.h(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 23:
                    o2 = z0.f(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 24:
                    o2 = z0.d(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 25:
                    List t2 = t(vVar, j8);
                    Class cls2 = z0.f929a;
                    int size2 = t2.size();
                    i9 += size2 == 0 ? 0 : (l.s(i10) + 1) * size2;
                    break;
                case 26:
                    o2 = z0.q(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 27:
                    o2 = z0.l(i10, t(vVar, j8), n(i8));
                    i9 += o2;
                    break;
                case 28:
                    o2 = z0.a(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 29:
                    o2 = z0.r(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 30:
                    o2 = z0.b(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 31:
                    o2 = z0.d(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 32:
                    o2 = z0.f(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 33:
                    o2 = z0.m(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 34:
                    o2 = z0.o(i10, t(vVar, j8));
                    i9 += o2;
                    break;
                case 35:
                    int g13 = z0.g((List) unsafe.getObject(vVar, j8));
                    if (g13 > 0) {
                        i9 = a0.m.c(g13, l.s(i10), g13, i9);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e9 = z0.e((List) unsafe.getObject(vVar, j8));
                    if (e9 > 0) {
                        i9 = a0.m.c(e9, l.s(i10), e9, i9);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k8 = z0.k((List) unsafe.getObject(vVar, j8));
                    if (k8 > 0) {
                        i9 = a0.m.c(k8, l.s(i10), k8, i9);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int u10 = z0.u((List) unsafe.getObject(vVar, j8));
                    if (u10 > 0) {
                        i9 = a0.m.c(u10, l.s(i10), u10, i9);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i14 = z0.i((List) unsafe.getObject(vVar, j8));
                    if (i14 > 0) {
                        i9 = a0.m.c(i14, l.s(i10), i14, i9);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g14 = z0.g((List) unsafe.getObject(vVar, j8));
                    if (g14 > 0) {
                        i9 = a0.m.c(g14, l.s(i10), g14, i9);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e10 = z0.e((List) unsafe.getObject(vVar, j8));
                    if (e10 > 0) {
                        i9 = a0.m.c(e10, l.s(i10), e10, i9);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(vVar, j8);
                    Class cls3 = z0.f929a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        i9 = a0.m.c(size3, l.s(i10), size3, i9);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int s13 = z0.s((List) unsafe.getObject(vVar, j8));
                    if (s13 > 0) {
                        i9 = a0.m.c(s13, l.s(i10), s13, i9);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int c4 = z0.c((List) unsafe.getObject(vVar, j8));
                    if (c4 > 0) {
                        i9 = a0.m.c(c4, l.s(i10), c4, i9);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int e11 = z0.e((List) unsafe.getObject(vVar, j8));
                    if (e11 > 0) {
                        i9 = a0.m.c(e11, l.s(i10), e11, i9);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int g15 = z0.g((List) unsafe.getObject(vVar, j8));
                    if (g15 > 0) {
                        i9 = a0.m.c(g15, l.s(i10), g15, i9);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int n9 = z0.n((List) unsafe.getObject(vVar, j8));
                    if (n9 > 0) {
                        i9 = a0.m.c(n9, l.s(i10), n9, i9);
                        break;
                    } else {
                        break;
                    }
                case q.c.f7264h /* 48 */:
                    int p6 = z0.p((List) unsafe.getObject(vVar, j8));
                    if (p6 > 0) {
                        i9 = a0.m.c(p6, l.s(i10), p6, i9);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List t8 = t(vVar, j8);
                    y0 n10 = n(i8);
                    Class cls4 = z0.f929a;
                    int size4 = t8.size();
                    if (size4 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 0;
                        for (int i15 = 0; i15 < size4; i15++) {
                            i7 += l.p(i10, (a) t8.get(i15), n10);
                        }
                    }
                    i9 += i7;
                    break;
                case 50:
                    Object i16 = r1.f903c.i(j8, vVar);
                    Object m8 = m(i8);
                    this.f888n.getClass();
                    o2 = l0.a(i16, i10, m8);
                    i9 += o2;
                    break;
                case 51:
                    if (s(i10, i8, vVar)) {
                        i9 = a0.m.b(i10, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (s(i10, i8, vVar)) {
                        i9 = a0.m.b(i10, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (s(i10, i8, vVar)) {
                        long D = D(j8, vVar);
                        s5 = l.s(i10);
                        u8 = l.u(D);
                        o2 = u8 + s5;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (s(i10, i8, vVar)) {
                        long D2 = D(j8, vVar);
                        s5 = l.s(i10);
                        u8 = l.u(D2);
                        o2 = u8 + s5;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (s(i10, i8, vVar)) {
                        int C = C(j8, vVar);
                        s8 = l.s(i10);
                        q8 = l.q(C);
                        o2 = q8 + s8;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (s(i10, i8, vVar)) {
                        o2 = l.o(i10);
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (s(i10, i8, vVar)) {
                        o2 = l.n(i10);
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (s(i10, i8, vVar)) {
                        i9 = a0.m.b(i10, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (s(i10, i8, vVar)) {
                        Object i17 = r1.f903c.i(j8, vVar);
                        if (i17 instanceof g) {
                            int s14 = l.s(i10);
                            int size5 = ((g) i17).size();
                            i9 = a0.m.c(size5, size5, s14, i9);
                            break;
                        } else {
                            s9 = l.s(i10);
                            r8 = l.r((String) i17);
                            i9 = r8 + s9 + i9;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (s(i10, i8, vVar)) {
                        Object i18 = r1.f903c.i(j8, vVar);
                        y0 n11 = n(i8);
                        Class cls5 = z0.f929a;
                        int s15 = l.s(i10);
                        int a9 = ((a) i18).a(n11);
                        i9 = a0.m.c(a9, a9, s15, i9);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (s(i10, i8, vVar)) {
                        o2 = l.l(i10, (g) r1.f903c.i(j8, vVar));
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (s(i10, i8, vVar)) {
                        int C2 = C(j8, vVar);
                        s8 = l.s(i10);
                        q8 = l.t(C2);
                        o2 = q8 + s8;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (s(i10, i8, vVar)) {
                        int C3 = C(j8, vVar);
                        s8 = l.s(i10);
                        q8 = l.q(C3);
                        o2 = q8 + s8;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (s(i10, i8, vVar)) {
                        i9 = a0.m.b(i10, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (s(i10, i8, vVar)) {
                        i9 = a0.m.b(i10, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (s(i10, i8, vVar)) {
                        int C4 = C(j8, vVar);
                        s8 = l.s(i10);
                        q8 = l.t((C4 >> 31) ^ (C4 << 1));
                        o2 = q8 + s8;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (s(i10, i8, vVar)) {
                        long D3 = D(j8, vVar);
                        s10 = l.s(i10);
                        u9 = l.u((D3 >> 63) ^ (D3 << 1));
                        o2 = u9 + s10;
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (s(i10, i8, vVar)) {
                        o2 = l.p(i10, (a) r1.f903c.i(j8, vVar), n(i8));
                        i9 += o2;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
        }
    }

    public final boolean q(int i7, Object obj) {
        int i8 = this.f875a[i7 + 2];
        long j8 = i8 & 1048575;
        if (j8 == 1048575) {
            int O = O(i7);
            long j9 = O & 1048575;
            switch (N(O)) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    if (Double.doubleToRawLongBits(r1.f903c.e(j9, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(r1.f903c.f(j9, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (r1.f903c.h(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (r1.f903c.h(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (r1.f903c.g(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (r1.f903c.h(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (r1.f903c.g(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    return r1.f903c.c(j9, obj);
                case 8:
                    Object i9 = r1.f903c.i(j9, obj);
                    if (i9 instanceof String) {
                        return !((String) i9).isEmpty();
                    }
                    if (i9 instanceof g) {
                        return !g.f816h.equals(i9);
                    }
                    throw new IllegalArgumentException();
                case q.c.f7259c /* 9 */:
                    if (r1.f903c.i(j9, obj) == null) {
                        return false;
                    }
                    break;
                case q.c.f7261e /* 10 */:
                    return !g.f816h.equals(r1.f903c.i(j9, obj));
                case 11:
                    if (r1.f903c.g(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (r1.f903c.g(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (r1.f903c.g(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (r1.f903c.h(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case q.c.f7263g /* 15 */:
                    if (r1.f903c.g(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (r1.f903c.h(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (r1.f903c.i(j9, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i8 >>> 20)) & r1.f903c.g(j8, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean s(int i7, int i8, Object obj) {
        return r1.f903c.g((long) (this.f875a[i8 + 2] & 1048575), obj) == i7;
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
    public final void u(Object obj, int i7, Object obj2, n nVar, a0.p pVar) {
        long O = O(i7) & 1048575;
        Object i8 = r1.f903c.i(O, obj);
        l0 l0Var = this.f888n;
        if (i8 == null) {
            l0Var.getClass();
            i8 = k0.f852g.b();
            r1.p(O, obj, i8);
        } else {
            l0Var.getClass();
            if (!((k0) i8).f853f) {
                k0 b9 = k0.f852g.b();
                l0.b(b9, i8);
                r1.p(O, obj, b9);
                i8 = b9;
            }
        }
        l0Var.getClass();
        k0 k0Var = (k0) i8;
        i0 i0Var = ((j0) obj2).f851a;
        pVar.A(2);
        j jVar = (j) pVar.f121e;
        int e9 = jVar.e(jVar.v());
        Object obj3 = i0Var.f842c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int c4 = pVar.c();
                if (c4 == Integer.MAX_VALUE || jVar.c()) {
                    break;
                }
                if (c4 == 1) {
                    obj4 = pVar.m(i0Var.f840a, null, null);
                } else if (c4 != 2) {
                    try {
                        if (!pVar.B()) {
                            throw new z("Unable to parse map entry.");
                        }
                    } catch (y unused) {
                        if (!pVar.B()) {
                            throw new z("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = pVar.m(i0Var.f841b, obj3.getClass(), nVar);
                }
            } catch (Throwable th) {
                jVar.d(e9);
                throw th;
            }
        }
    }

    public final void v(Object obj, int i7, Object obj2) {
        if (q(i7, obj2)) {
            long O = O(i7) & 1048575;
            Unsafe unsafe = f874p;
            Object object = unsafe.getObject(obj2, O);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f875a[i7] + " is present but null: " + obj2);
            }
            y0 n8 = n(i7);
            if (!q(i7, obj)) {
                if (r(object)) {
                    v i8 = n8.i();
                    n8.b(i8, object);
                    unsafe.putObject(obj, O, i8);
                } else {
                    unsafe.putObject(obj, O, object);
                }
                J(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, O);
            if (!r(object2)) {
                v i9 = n8.i();
                n8.b(i9, object2);
                unsafe.putObject(obj, O, i9);
                object2 = i9;
            }
            n8.b(object2, object);
        }
    }

    public final void w(Object obj, int i7, Object obj2) {
        int[] iArr = this.f875a;
        int i8 = iArr[i7];
        if (s(i8, i7, obj2)) {
            long O = O(i7) & 1048575;
            Unsafe unsafe = f874p;
            Object object = unsafe.getObject(obj2, O);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
            }
            y0 n8 = n(i7);
            if (!s(i8, i7, obj)) {
                if (r(object)) {
                    v i9 = n8.i();
                    n8.b(i9, object);
                    unsafe.putObject(obj, O, i9);
                } else {
                    unsafe.putObject(obj, O, object);
                }
                K(i8, i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, O);
            if (!r(object2)) {
                v i10 = n8.i();
                n8.b(i10, object2);
                unsafe.putObject(obj, O, i10);
                object2 = i10;
            }
            n8.b(object2, object);
        }
    }

    public final Object x(int i7, Object obj) {
        y0 n8 = n(i7);
        long O = O(i7) & 1048575;
        if (!q(i7, obj)) {
            return n8.i();
        }
        Object object = f874p.getObject(obj, O);
        if (r(object)) {
            return object;
        }
        v i8 = n8.i();
        if (object != null) {
            n8.b(i8, object);
        }
        return i8;
    }

    public final Object y(int i7, int i8, Object obj) {
        y0 n8 = n(i8);
        if (!s(i7, i8, obj)) {
            return n8.i();
        }
        Object object = f874p.getObject(obj, O(i8) & 1048575);
        if (r(object)) {
            return object;
        }
        v i9 = n8.i();
        if (object != null) {
            n8.b(i9, object);
        }
        return i9;
    }
}
