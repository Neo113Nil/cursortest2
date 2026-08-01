package androidx.datastore.preferences.protobuf;

import com.appsflyer.attribution.RequestError;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n0 implements w0 {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f588n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f589o = j1.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f590a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f591b;

    /* renamed from: c, reason: collision with root package name */
    public final int f592c;

    /* renamed from: d, reason: collision with root package name */
    public final int f593d;

    /* renamed from: e, reason: collision with root package name */
    public final a f594e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f595f;
    public final int[] g;

    /* renamed from: h, reason: collision with root package name */
    public final int f596h;

    /* renamed from: i, reason: collision with root package name */
    public final int f597i;
    public final p0 j;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f598k;

    /* renamed from: l, reason: collision with root package name */
    public final e1 f599l;

    /* renamed from: m, reason: collision with root package name */
    public final j0 f600m;

    public n0(int[] iArr, Object[] objArr, int i3, int i10, a aVar, int[] iArr2, int i11, int i12, p0 p0Var, c0 c0Var, e1 e1Var, o oVar, j0 j0Var) {
        this.f590a = iArr;
        this.f591b = objArr;
        this.f592c = i3;
        this.f593d = i10;
        this.f595f = aVar instanceof v;
        this.g = iArr2;
        this.f596h = i11;
        this.f597i = i12;
        this.j = p0Var;
        this.f598k = c0Var;
        this.f599l = e1Var;
        this.f594e = aVar;
        this.f600m = j0Var;
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
            StringBuilder q3 = v4.a.q("Field ", str, " for ");
            q3.append(cls.getName());
            q3.append(" not found. Known fields are ");
            q3.append(Arrays.toString(declaredFields));
            throw new RuntimeException(q3.toString());
        }
    }

    public static int K(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof v) {
            return ((v) obj).g();
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
    public static n0 w(v0 v0Var, p0 p0Var, c0 c0Var, e1 e1Var, o oVar, j0 j0Var) {
        int i3;
        int charAt;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char charAt2;
        int i17;
        char charAt3;
        int i18;
        char charAt4;
        int i19;
        char charAt5;
        int i20;
        char charAt6;
        int i21;
        char charAt7;
        int i22;
        char charAt8;
        int i23;
        char charAt9;
        int i24;
        int i25;
        int i26;
        Class<?> cls;
        int i27;
        int objectFieldOffset;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Field F;
        char charAt10;
        int i33;
        int i34;
        Object obj;
        Field F2;
        Object obj2;
        Field F3;
        int i35;
        char charAt11;
        int i36;
        char charAt12;
        int i37;
        char charAt13;
        int i38;
        char charAt14;
        String str = v0Var.f644b;
        int length = str.length();
        int i39 = 55296;
        if (str.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i3 = i40 + 1;
                if (str.charAt(i40) < 55296) {
                    break;
                }
                i40 = i3;
            }
        } else {
            i3 = 1;
        }
        int i41 = i3 + 1;
        int charAt15 = str.charAt(i3);
        if (charAt15 >= 55296) {
            int i42 = charAt15 & 8191;
            int i43 = 13;
            while (true) {
                i38 = i41 + 1;
                charAt14 = str.charAt(i41);
                if (charAt14 < 55296) {
                    break;
                }
                i42 |= (charAt14 & 8191) << i43;
                i43 += 13;
                i41 = i38;
            }
            charAt15 = i42 | (charAt14 << i43);
            i41 = i38;
        }
        if (charAt15 == 0) {
            i11 = 0;
            i14 = 0;
            charAt = 0;
            i10 = 0;
            i13 = 0;
            i15 = 0;
            iArr = f588n;
            i12 = 0;
        } else {
            int i44 = i41 + 1;
            int charAt16 = str.charAt(i41);
            if (charAt16 >= 55296) {
                int i45 = charAt16 & 8191;
                int i46 = 13;
                while (true) {
                    i23 = i44 + 1;
                    charAt9 = str.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i23;
                }
                charAt16 = i45 | (charAt9 << i46);
                i44 = i23;
            }
            int i47 = i44 + 1;
            int charAt17 = str.charAt(i44);
            if (charAt17 >= 55296) {
                int i48 = charAt17 & 8191;
                int i49 = 13;
                while (true) {
                    i22 = i47 + 1;
                    charAt8 = str.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i22;
                }
                charAt17 = i48 | (charAt8 << i49);
                i47 = i22;
            }
            int i50 = i47 + 1;
            int charAt18 = str.charAt(i47);
            if (charAt18 >= 55296) {
                int i51 = charAt18 & 8191;
                int i52 = 13;
                while (true) {
                    i21 = i50 + 1;
                    charAt7 = str.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i21;
                }
                charAt18 = i51 | (charAt7 << i52);
                i50 = i21;
            }
            int i53 = i50 + 1;
            int charAt19 = str.charAt(i50);
            if (charAt19 >= 55296) {
                int i54 = charAt19 & 8191;
                int i55 = 13;
                while (true) {
                    i20 = i53 + 1;
                    charAt6 = str.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i20;
                }
                charAt19 = i54 | (charAt6 << i55);
                i53 = i20;
            }
            int i56 = i53 + 1;
            charAt = str.charAt(i53);
            if (charAt >= 55296) {
                int i57 = charAt & 8191;
                int i58 = 13;
                while (true) {
                    i19 = i56 + 1;
                    charAt5 = str.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i19;
                }
                charAt = i57 | (charAt5 << i58);
                i56 = i19;
            }
            int i59 = i56 + 1;
            int charAt20 = str.charAt(i56);
            if (charAt20 >= 55296) {
                int i60 = charAt20 & 8191;
                int i61 = 13;
                while (true) {
                    i18 = i59 + 1;
                    charAt4 = str.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i18;
                }
                charAt20 = i60 | (charAt4 << i61);
                i59 = i18;
            }
            int i62 = i59 + 1;
            int charAt21 = str.charAt(i59);
            if (charAt21 >= 55296) {
                int i63 = charAt21 & 8191;
                int i64 = 13;
                while (true) {
                    i17 = i62 + 1;
                    charAt3 = str.charAt(i62);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i17;
                }
                charAt21 = i63 | (charAt3 << i64);
                i62 = i17;
            }
            int i65 = i62 + 1;
            int charAt22 = str.charAt(i62);
            if (charAt22 >= 55296) {
                int i66 = charAt22 & 8191;
                int i67 = 13;
                while (true) {
                    i16 = i65 + 1;
                    charAt2 = str.charAt(i65);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i66 |= (charAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i16;
                }
                charAt22 = i66 | (charAt2 << i67);
                i65 = i16;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i68 = (charAt16 * 2) + charAt17;
            int i69 = charAt20;
            i10 = charAt18;
            i11 = i69;
            i12 = charAt16;
            i41 = i65;
            iArr = iArr2;
            i13 = charAt19;
            i14 = i68;
            i15 = charAt22;
        }
        Unsafe unsafe = f589o;
        Object[] objArr = v0Var.f645c;
        Class<?> cls2 = v0Var.f643a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i70 = i15 + i11;
        int i71 = i70;
        int i72 = i15;
        int i73 = 0;
        int i74 = 0;
        while (i41 < length) {
            int i75 = i41 + 1;
            int charAt23 = str.charAt(i41);
            if (charAt23 >= i39) {
                int i76 = charAt23 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i37 = i77 + 1;
                    charAt13 = str.charAt(i77);
                    i24 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i76 |= (charAt13 & 8191) << i78;
                    i78 += 13;
                    i77 = i37;
                    length = i24;
                }
                charAt23 = i76 | (charAt13 << i78);
                i25 = i37;
            } else {
                i24 = length;
                i25 = i75;
            }
            int i79 = i25 + 1;
            int charAt24 = str.charAt(i25);
            Object[] objArr3 = objArr;
            char c10 = 55296;
            if (charAt24 >= 55296) {
                int i80 = charAt24 & 8191;
                int i81 = 13;
                while (true) {
                    i36 = i79 + 1;
                    charAt12 = str.charAt(i79);
                    if (charAt12 < c10) {
                        break;
                    }
                    i80 |= (charAt12 & 8191) << i81;
                    i81 += 13;
                    i79 = i36;
                    c10 = 55296;
                }
                charAt24 = i80 | (charAt12 << i81);
                i79 = i36;
            }
            int i82 = charAt24 & 255;
            int i83 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i73] = i74;
                i73++;
            }
            int[] iArr4 = iArr3;
            if (i82 >= 51) {
                int i84 = i79 + 1;
                int charAt25 = str.charAt(i79);
                char c11 = 55296;
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = 13;
                    while (true) {
                        i35 = i84 + 1;
                        charAt11 = str.charAt(i84);
                        if (charAt11 < c11) {
                            break;
                        }
                        i85 |= (charAt11 & 8191) << i86;
                        i86 += 13;
                        i84 = i35;
                        c11 = 55296;
                    }
                    charAt25 = i85 | (charAt11 << i86);
                    i84 = i35;
                }
                int i87 = i82 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i34 = i14 + 1;
                    objArr2[((i74 / 3) * 2) + 1] = objArr3[i14];
                } else {
                    if (i87 == 12 && (a4.i.a(v0Var.a(), 1) || (charAt24 & 2048) != 0)) {
                        i34 = i14 + 1;
                        objArr2[((i74 / 3) * 2) + 1] = objArr3[i14];
                    }
                    int i89 = charAt25 * 2;
                    obj = objArr3[i89];
                    if (obj instanceof Field) {
                        F2 = F(cls2, (String) obj);
                        objArr3[i89] = F2;
                    } else {
                        F2 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F2);
                    int i90 = i89 + 1;
                    obj2 = objArr3[i90];
                    if (obj2 instanceof Field) {
                        F3 = F(cls2, (String) obj2);
                        objArr3[i90] = F3;
                    } else {
                        F3 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F3);
                    int i91 = i12;
                    i28 = objectFieldOffset3;
                    i32 = objectFieldOffset2;
                    i26 = i91;
                    i31 = i14;
                    i29 = i88;
                    i30 = 0;
                    cls = cls2;
                }
                i14 = i34;
                int i892 = charAt25 * 2;
                obj = objArr3[i892];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(F2);
                int i902 = i892 + 1;
                obj2 = objArr3[i902];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(F3);
                int i912 = i12;
                i28 = objectFieldOffset32;
                i32 = objectFieldOffset22;
                i26 = i912;
                i31 = i14;
                i29 = i88;
                i30 = 0;
                cls = cls2;
            } else {
                int i92 = i14 + 1;
                Field F4 = F(cls2, (String) objArr3[i14]);
                if (i82 == 9 || i82 == 17) {
                    i26 = i12;
                    objArr2[((i74 / 3) * 2) + 1] = F4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i26 = i12;
                        i33 = i14 + 2;
                        objArr2[((i74 / 3) * 2) + 1] = objArr3[i92];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i26 = i12;
                        if (v0Var.a() == 1 || (charAt24 & 2048) != 0) {
                            i33 = i14 + 2;
                            objArr2[((i74 / 3) * 2) + 1] = objArr3[i92];
                        }
                    } else if (i82 == 50) {
                        int i93 = i72 + 1;
                        iArr[i72] = i74;
                        int i94 = (i74 / 3) * 2;
                        int i95 = i14 + 2;
                        objArr2[i94] = objArr3[i92];
                        if ((charAt24 & 2048) != 0) {
                            i27 = i14 + 3;
                            objArr2[i94 + 1] = objArr3[i95];
                            i26 = i12;
                            cls = cls2;
                            i72 = i93;
                        } else {
                            cls = cls2;
                            i27 = i95;
                            i72 = i93;
                            i26 = i12;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                        if ((charAt24 & 4096) != 0 || i82 > 17) {
                            i28 = 1048575;
                            i29 = i79;
                            i30 = 0;
                        } else {
                            int i96 = i79 + 1;
                            int charAt26 = str.charAt(i79);
                            if (charAt26 >= 55296) {
                                int i97 = charAt26 & 8191;
                                int i98 = 13;
                                while (true) {
                                    i29 = i96 + 1;
                                    charAt10 = str.charAt(i96);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i97 |= (charAt10 & 8191) << i98;
                                    i98 += 13;
                                    i96 = i29;
                                }
                                charAt26 = i97 | (charAt10 << i98);
                            } else {
                                i29 = i96;
                            }
                            int i99 = (charAt26 / 32) + (i26 * 2);
                            Object obj3 = objArr3[i99];
                            if (obj3 instanceof Field) {
                                F = (Field) obj3;
                            } else {
                                F = F(cls, (String) obj3);
                                objArr3[i99] = F;
                            }
                            i28 = (int) unsafe.objectFieldOffset(F);
                            i30 = charAt26 % 32;
                        }
                        if (i82 >= 18 || i82 > 49) {
                            i31 = i27;
                            i32 = objectFieldOffset;
                        } else {
                            iArr[i71] = objectFieldOffset;
                            i31 = i27;
                            i32 = objectFieldOffset;
                            i71++;
                        }
                    } else {
                        i26 = i12;
                    }
                    i27 = i33;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i28 = 1048575;
                    i29 = i79;
                    i30 = 0;
                    if (i82 >= 18) {
                    }
                    i31 = i27;
                    i32 = objectFieldOffset;
                }
                cls = cls2;
                i27 = i92;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                if ((charAt24 & 4096) != 0) {
                }
                i28 = 1048575;
                i29 = i79;
                i30 = 0;
                if (i82 >= 18) {
                }
                i31 = i27;
                i32 = objectFieldOffset;
            }
            int i100 = i74 + 1;
            iArr4[i74] = i83;
            int i101 = i74 + 2;
            String str2 = str;
            iArr4[i100] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | i32;
            i74 += 3;
            iArr4[i101] = (i30 << 20) | i28;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i24;
            i12 = i26;
            i41 = i29;
            i39 = 55296;
            i14 = i31;
            iArr3 = iArr4;
        }
        return new n0(iArr3, objArr2, i10, i13, v0Var.f643a, iArr, i15, i70, p0Var, c0Var, e1Var, oVar, j0Var);
    }

    public static long x(int i3) {
        return i3 & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) j1.f570c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) j1.f570c.h(j, obj)).longValue();
    }

    public final int A(int i3) {
        if (i3 < this.f592c || i3 > this.f593d) {
            return -1;
        }
        int[] iArr = this.f590a;
        int length = (iArr.length / 3) - 1;
        int i10 = 0;
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

    public final void B(Object obj, long j, j jVar, w0 w0Var, n nVar) {
        int z10;
        this.f598k.getClass();
        w a9 = c0.a(j, obj);
        i iVar = (i) jVar.f567d;
        int i3 = jVar.f564a;
        if ((i3 & 7) != 3) {
            throw z.b();
        }
        do {
            v i10 = w0Var.i();
            jVar.d(i10, w0Var, nVar);
            w0Var.d(i10);
            ((u0) a9).add(i10);
            if (iVar.d() || jVar.f566c != 0) {
                return;
            } else {
                z10 = iVar.z();
            }
        } while (z10 == i3);
        jVar.f566c = z10;
    }

    public final void C(Object obj, int i3, j jVar, w0 w0Var, n nVar) {
        int z10;
        this.f598k.getClass();
        w a9 = c0.a(i3 & 1048575, obj);
        i iVar = (i) jVar.f567d;
        int i10 = jVar.f564a;
        if ((i10 & 7) != 2) {
            throw z.b();
        }
        do {
            v i11 = w0Var.i();
            jVar.e(i11, w0Var, nVar);
            w0Var.d(i11);
            ((u0) a9).add(i11);
            if (iVar.d() || jVar.f566c != 0) {
                return;
            } else {
                z10 = iVar.z();
            }
        } while (z10 == i10);
        jVar.f566c = z10;
    }

    public final void D(int i3, j jVar, Object obj) {
        if ((536870912 & i3) != 0) {
            jVar.y(2);
            j1.o(i3 & 1048575, obj, ((i) jVar.f567d).y());
        } else if (!this.f595f) {
            j1.o(i3 & 1048575, obj, jVar.g());
        } else {
            jVar.y(2);
            j1.o(i3 & 1048575, obj, ((i) jVar.f567d).x());
        }
    }

    public final void E(int i3, j jVar, Object obj) {
        boolean z10 = (536870912 & i3) != 0;
        c0 c0Var = this.f598k;
        if (z10) {
            c0Var.getClass();
            jVar.u(c0.a(i3 & 1048575, obj), true);
        } else {
            c0Var.getClass();
            jVar.u(c0.a(i3 & 1048575, obj), false);
        }
    }

    public final void G(int i3, Object obj) {
        int i10 = this.f590a[i3 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        j1.m(obj, j, (1 << (i10 >>> 20)) | j1.f570c.f(j, obj));
    }

    public final void H(int i3, int i10, Object obj) {
        j1.m(obj, this.f590a[i10 + 2] & 1048575, i3);
    }

    public final void I(Object obj, int i3, a aVar) {
        f589o.putObject(obj, L(i3) & 1048575, aVar);
        G(i3, obj);
    }

    public final void J(Object obj, int i3, int i10, a aVar) {
        f589o.putObject(obj, L(i10) & 1048575, aVar);
        H(i3, i10, obj);
    }

    public final int L(int i3) {
        return this.f590a[i3 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, f0 f0Var) {
        int i3;
        int i10;
        int i11;
        int i12;
        boolean z10;
        n0 n0Var = this;
        int[] iArr = n0Var.f590a;
        int length = iArr.length;
        Unsafe unsafe = f589o;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int L = n0Var.L(i15);
            int i17 = iArr[i15];
            int K = K(L);
            if (K <= 17) {
                int i18 = iArr[i15 + 2];
                int i19 = i18 & i13;
                if (i19 != i14) {
                    i16 = i19 == i13 ? 0 : unsafe.getInt(obj, i19);
                    i14 = i19;
                }
                i3 = L;
                i10 = 1 << (i18 >>> 20);
            } else {
                i3 = L;
                i10 = 0;
            }
            long j = i3 & i13;
            switch (K) {
                case 0:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        double d10 = j1.f570c.d(j, obj);
                        l lVar = (l) f0Var.f538a;
                        lVar.getClass();
                        lVar.t(i17, Double.doubleToRawLongBits(d10));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        float e2 = j1.f570c.e(j, obj);
                        l lVar2 = (l) f0Var.f538a;
                        lVar2.getClass();
                        lVar2.r(i17, Float.floatToRawIntBits(e2));
                    }
                    n0Var = this;
                    break;
                case 2:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).E(i17, unsafe.getLong(obj, j));
                    }
                    n0Var = this;
                    break;
                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).E(i17, unsafe.getLong(obj, j));
                    }
                    n0Var = this;
                    break;
                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).v(i17, unsafe.getInt(obj, j));
                    }
                    n0Var = this;
                    break;
                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).t(i17, unsafe.getLong(obj, j));
                    }
                    n0Var = this;
                    break;
                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).r(i17, unsafe.getInt(obj, j));
                    }
                    n0Var = this;
                    break;
                case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).o(i17, j1.f570c.c(j, obj));
                    }
                    n0Var = this;
                    break;
                case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((l) f0Var.f538a).z(i17, (String) object);
                        } else {
                            ((l) f0Var.f538a).p(i17, (f) object);
                        }
                    }
                    n0Var = this;
                    break;
                case 9:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).y(i17, (a) unsafe.getObject(obj, j), n0Var.m(i15));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).p(i17, (f) unsafe.getObject(obj, j));
                    }
                    n0Var = this;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).C(i17, unsafe.getInt(obj, j));
                    }
                    n0Var = this;
                    break;
                case 12:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).v(i17, unsafe.getInt(obj, j));
                    }
                    n0Var = this;
                    break;
                case 13:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).r(i17, unsafe.getInt(obj, j));
                    }
                    n0Var = this;
                    break;
                case 14:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        ((l) f0Var.f538a).t(i17, unsafe.getLong(obj, j));
                    }
                    n0Var = this;
                    break;
                case 15:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        int i20 = unsafe.getInt(obj, j);
                        ((l) f0Var.f538a).C(i17, (i20 >> 31) ^ (i20 << 1));
                    }
                    n0Var = this;
                    break;
                case 16:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        long j3 = unsafe.getLong(obj, j);
                        ((l) f0Var.f538a).E(i17, (j3 >> 63) ^ (j3 << 1));
                    }
                    n0Var = this;
                    break;
                case 17:
                    if (n0Var.o(obj, i15, i14, i16, i10)) {
                        f0Var.a(i17, unsafe.getObject(obj, j), n0Var.m(i15));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i11 = i14;
                    x0.n(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 19:
                    i11 = i14;
                    x0.r(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 20:
                    i11 = i14;
                    x0.t(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 21:
                    i11 = i14;
                    x0.z(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 22:
                    i11 = i14;
                    x0.s(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 23:
                    i11 = i14;
                    x0.q(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 24:
                    i11 = i14;
                    x0.p(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 25:
                    i11 = i14;
                    x0.m(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 26:
                    i12 = i14;
                    int i21 = iArr[i15];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = x0.f649a;
                    if (list != null && !list.isEmpty()) {
                        f0Var.getClass();
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            ((l) f0Var.f538a).z(i21, (String) list.get(i22));
                        }
                    }
                    i14 = i12;
                    break;
                case 27:
                    i12 = i14;
                    int i23 = iArr[i15];
                    List list2 = (List) unsafe.getObject(obj, j);
                    w0 m10 = n0Var.m(i15);
                    Class cls2 = x0.f649a;
                    if (list2 != null && !list2.isEmpty()) {
                        f0Var.getClass();
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            ((l) f0Var.f538a).y(i23, (a) list2.get(i24), m10);
                        }
                    }
                    i14 = i12;
                    break;
                case 28:
                    i12 = i14;
                    int i25 = iArr[i15];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = x0.f649a;
                    if (list3 != null && !list3.isEmpty()) {
                        f0Var.getClass();
                        for (int i26 = 0; i26 < list3.size(); i26++) {
                            ((l) f0Var.f538a).p(i25, (f) list3.get(i26));
                        }
                    }
                    i14 = i12;
                    break;
                case 29:
                    i11 = i14;
                    z10 = false;
                    x0.y(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 30:
                    i11 = i14;
                    z10 = false;
                    x0.o(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 31:
                    i11 = i14;
                    z10 = false;
                    x0.u(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 32:
                    i11 = i14;
                    z10 = false;
                    x0.v(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 33:
                    i11 = i14;
                    z10 = false;
                    x0.w(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 34:
                    i11 = i14;
                    z10 = false;
                    x0.x(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, false);
                    i14 = i11;
                    break;
                case 35:
                    i12 = i14;
                    x0.n(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 36:
                    i12 = i14;
                    x0.r(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 37:
                    i12 = i14;
                    x0.t(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 38:
                    i12 = i14;
                    x0.z(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 39:
                    i12 = i14;
                    x0.s(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    i12 = i14;
                    x0.q(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    i12 = i14;
                    x0.p(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 42:
                    i12 = i14;
                    x0.m(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 43:
                    i12 = i14;
                    x0.y(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 44:
                    i12 = i14;
                    x0.o(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 45:
                    i12 = i14;
                    x0.u(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 46:
                    i12 = i14;
                    x0.v(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 47:
                    i12 = i14;
                    x0.w(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 48:
                    i12 = i14;
                    x0.x(iArr[i15], (List) unsafe.getObject(obj, j), f0Var, true);
                    i14 = i12;
                    break;
                case 49:
                    i12 = i14;
                    int i27 = iArr[i15];
                    List list4 = (List) unsafe.getObject(obj, j);
                    w0 m11 = n0Var.m(i15);
                    Class cls4 = x0.f649a;
                    if (list4 != null && !list4.isEmpty()) {
                        f0Var.getClass();
                        for (int i28 = 0; i28 < list4.size(); i28++) {
                            f0Var.a(i27, list4.get(i28), m11);
                        }
                    }
                    i14 = i12;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i29 = 2;
                        Object obj2 = n0Var.f591b[(i15 / 3) * 2];
                        n0Var.f600m.getClass();
                        g0 g0Var = ((h0) obj2).f558a;
                        l lVar3 = (l) f0Var.f538a;
                        lVar3.getClass();
                        for (Map.Entry entry : ((i0) object2).entrySet()) {
                            lVar3.B(i17, i29);
                            lVar3.D(h0.a(g0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            q.b(lVar3, g0Var.f546a, 1, key);
                            i29 = 2;
                            q.b(lVar3, g0Var.f547b, 2, value);
                            i14 = i14;
                        }
                    }
                    i12 = i14;
                    i14 = i12;
                    break;
                case 51:
                    if (n0Var.q(i17, i15, obj)) {
                        double doubleValue = ((Double) j1.f570c.h(j, obj)).doubleValue();
                        l lVar4 = (l) f0Var.f538a;
                        lVar4.getClass();
                        lVar4.t(i17, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case 52:
                    if (n0Var.q(i17, i15, obj)) {
                        float floatValue = ((Float) j1.f570c.h(j, obj)).floatValue();
                        l lVar5 = (l) f0Var.f538a;
                        lVar5.getClass();
                        lVar5.r(i17, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).E(i17, z(j, obj));
                    }
                    break;
                case 54:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).E(i17, z(j, obj));
                    }
                    break;
                case 55:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).v(i17, y(j, obj));
                    }
                    break;
                case 56:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).t(i17, z(j, obj));
                    }
                    break;
                case 57:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).r(i17, y(j, obj));
                    }
                    break;
                case 58:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).o(i17, ((Boolean) j1.f570c.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (n0Var.q(i17, i15, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((l) f0Var.f538a).z(i17, (String) object3);
                        } else {
                            ((l) f0Var.f538a).p(i17, (f) object3);
                        }
                    }
                    break;
                case 60:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).y(i17, (a) unsafe.getObject(obj, j), n0Var.m(i15));
                    }
                    break;
                case 61:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).p(i17, (f) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).C(i17, y(j, obj));
                    }
                    break;
                case 63:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).v(i17, y(j, obj));
                    }
                    break;
                case 64:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).r(i17, y(j, obj));
                    }
                    break;
                case 65:
                    if (n0Var.q(i17, i15, obj)) {
                        ((l) f0Var.f538a).t(i17, z(j, obj));
                    }
                    break;
                case 66:
                    if (n0Var.q(i17, i15, obj)) {
                        int y3 = y(j, obj);
                        ((l) f0Var.f538a).C(i17, (y3 >> 31) ^ (y3 << 1));
                    }
                    break;
                case 67:
                    if (n0Var.q(i17, i15, obj)) {
                        long z11 = z(j, obj);
                        ((l) f0Var.f538a).E(i17, (z11 << 1) ^ (z11 >> 63));
                    }
                    break;
                case 68:
                    if (n0Var.q(i17, i15, obj)) {
                        f0Var.a(i17, unsafe.getObject(obj, j), n0Var.m(i15));
                    }
                    break;
            }
            i15 += 3;
            i13 = 1048575;
        }
        n0Var.f599l.getClass();
        ((v) obj).unknownFields.d(f0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.w0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            te.a1.d(obj, "Mutating immutable message: ");
            return;
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f590a;
            if (i3 >= iArr.length) {
                x0.k(this.f599l, obj, obj2);
                return;
            }
            int L = L(i3);
            long j = 1048575 & L;
            int i10 = iArr[i3];
            switch (K(L)) {
                case 0:
                    if (n(i3, obj2)) {
                        i1 i1Var = j1.f570c;
                        obj3 = obj;
                        i1Var.l(obj3, j, i1Var.d(j, obj2));
                        G(i3, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i3, obj2)) {
                        i1 i1Var2 = j1.f570c;
                        i1Var2.m(obj, j, i1Var2.e(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i3, obj2)) {
                        j1.n(obj, j, j1.f570c.g(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (n(i3, obj2)) {
                        j1.n(obj, j, j1.f570c.g(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                    if (n(i3, obj2)) {
                        j1.m(obj, j, j1.f570c.f(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (n(i3, obj2)) {
                        j1.n(obj, j, j1.f570c.g(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(i3, obj2)) {
                        j1.m(obj, j, j1.f570c.f(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i3, obj2)) {
                        i1 i1Var3 = j1.f570c;
                        i1Var3.j(obj, j, i1Var3.c(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(i3, obj2)) {
                        j1.o(j, obj, j1.f570c.h(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i3, obj2)) {
                        j1.o(j, obj, j1.f570c.h(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (n(i3, obj2)) {
                        j1.m(obj, j, j1.f570c.f(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i3, obj2)) {
                        j1.m(obj, j, j1.f570c.f(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i3, obj2)) {
                        j1.m(obj, j, j1.f570c.f(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i3, obj2)) {
                        j1.n(obj, j, j1.f570c.g(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i3, obj2)) {
                        j1.m(obj, j, j1.f570c.f(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i3, obj2)) {
                        j1.n(obj, j, j1.f570c.g(j, obj2));
                        G(i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i3, obj, obj2);
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
                    this.f598k.getClass();
                    i1 i1Var4 = j1.f570c;
                    w wVar = (w) i1Var4.h(j, obj);
                    w wVar2 = (w) i1Var4.h(j, obj2);
                    u0 u0Var = (u0) wVar;
                    int i11 = u0Var.f642i;
                    int i12 = ((u0) wVar2).f642i;
                    if (i11 > 0 && i12 > 0) {
                        if (!((u0) wVar).f640d) {
                            wVar = u0Var.e(i12 + i11);
                        }
                        ((u0) wVar).addAll(wVar2);
                    }
                    if (i11 > 0) {
                        wVar2 = wVar;
                    }
                    j1.o(j, obj, wVar2);
                    obj3 = obj;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Class cls = x0.f649a;
                    i1 i1Var5 = j1.f570c;
                    Object h10 = i1Var5.h(j, obj);
                    Object h11 = i1Var5.h(j, obj2);
                    this.f600m.getClass();
                    j1.o(j, obj, j0.a(h10, h11));
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
                    if (q(i10, i3, obj2)) {
                        j1.o(j, obj, j1.f570c.h(j, obj2));
                        H(i10, i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i3, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i10, i3, obj2)) {
                        j1.o(j, obj, j1.f570c.h(j, obj2));
                        H(i10, i3, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i3, obj, obj2);
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

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void b(Object obj, f0 f0Var) {
        f0Var.getClass();
        M(obj, f0Var);
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
    @Override // androidx.datastore.preferences.protobuf.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(v vVar) {
        int i3;
        int b10;
        int i10;
        int[] iArr = this.f590a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int L = L(i12);
            int i13 = iArr[i12];
            long j = 1048575 & L;
            int i14 = 1237;
            int i15 = 37;
            switch (K(L)) {
                case 0:
                    i3 = i11 * 53;
                    b10 = x.b(Double.doubleToLongBits(j1.f570c.d(j, vVar)));
                    i11 = b10 + i3;
                    break;
                case 1:
                    i3 = i11 * 53;
                    b10 = Float.floatToIntBits(j1.f570c.e(j, vVar));
                    i11 = b10 + i3;
                    break;
                case 2:
                    i3 = i11 * 53;
                    b10 = x.b(j1.f570c.g(j, vVar));
                    i11 = b10 + i3;
                    break;
                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    i3 = i11 * 53;
                    b10 = x.b(j1.f570c.g(j, vVar));
                    i11 = b10 + i3;
                    break;
                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                    i3 = i11 * 53;
                    b10 = j1.f570c.f(j, vVar);
                    i11 = b10 + i3;
                    break;
                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                    i3 = i11 * 53;
                    b10 = x.b(j1.f570c.g(j, vVar));
                    i11 = b10 + i3;
                    break;
                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    i3 = i11 * 53;
                    b10 = j1.f570c.f(j, vVar);
                    i11 = b10 + i3;
                    break;
                case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    i10 = i11 * 53;
                    boolean c10 = j1.f570c.c(j, vVar);
                    Charset charset = x.f647a;
                    break;
                case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                    i3 = i11 * 53;
                    b10 = ((String) j1.f570c.h(j, vVar)).hashCode();
                    i11 = b10 + i3;
                    break;
                case 9:
                    Object h10 = j1.f570c.h(j, vVar);
                    if (h10 != null) {
                        i15 = h10.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
                    break;
                case 10:
                    i3 = i11 * 53;
                    b10 = j1.f570c.h(j, vVar).hashCode();
                    i11 = b10 + i3;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    i3 = i11 * 53;
                    b10 = j1.f570c.f(j, vVar);
                    i11 = b10 + i3;
                    break;
                case 12:
                    i3 = i11 * 53;
                    b10 = j1.f570c.f(j, vVar);
                    i11 = b10 + i3;
                    break;
                case 13:
                    i3 = i11 * 53;
                    b10 = j1.f570c.f(j, vVar);
                    i11 = b10 + i3;
                    break;
                case 14:
                    i3 = i11 * 53;
                    b10 = x.b(j1.f570c.g(j, vVar));
                    i11 = b10 + i3;
                    break;
                case 15:
                    i3 = i11 * 53;
                    b10 = j1.f570c.f(j, vVar);
                    i11 = b10 + i3;
                    break;
                case 16:
                    i3 = i11 * 53;
                    b10 = x.b(j1.f570c.g(j, vVar));
                    i11 = b10 + i3;
                    break;
                case 17:
                    Object h11 = j1.f570c.h(j, vVar);
                    if (h11 != null) {
                        i15 = h11.hashCode();
                    }
                    i11 = (i11 * 53) + i15;
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
                    i3 = i11 * 53;
                    b10 = j1.f570c.h(j, vVar).hashCode();
                    i11 = b10 + i3;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    i3 = i11 * 53;
                    b10 = j1.f570c.h(j, vVar).hashCode();
                    i11 = b10 + i3;
                    break;
                case 51:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = x.b(Double.doubleToLongBits(((Double) j1.f570c.h(j, vVar)).doubleValue()));
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = Float.floatToIntBits(((Float) j1.f570c.h(j, vVar)).floatValue());
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = x.b(z(j, vVar));
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = x.b(z(j, vVar));
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = y(j, vVar);
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = x.b(z(j, vVar));
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = y(j, vVar);
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i13, i12, vVar)) {
                        i10 = i11 * 53;
                        boolean booleanValue = ((Boolean) j1.f570c.h(j, vVar)).booleanValue();
                        Charset charset2 = x.f647a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = ((String) j1.f570c.h(j, vVar)).hashCode();
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = j1.f570c.h(j, vVar).hashCode();
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = j1.f570c.h(j, vVar).hashCode();
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = y(j, vVar);
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = y(j, vVar);
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = y(j, vVar);
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = x.b(z(j, vVar));
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = y(j, vVar);
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = x.b(z(j, vVar));
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i13, i12, vVar)) {
                        i3 = i11 * 53;
                        b10 = j1.f570c.h(j, vVar).hashCode();
                        i11 = b10 + i3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f599l.getClass();
        return vVar.unknownFields.hashCode() + (i11 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final void d(Object obj) {
        if (p(obj)) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                vVar.k(Integer.MAX_VALUE);
                vVar.memoizedHashCode = 0;
                vVar.h();
            }
            int[] iArr = this.f590a;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int L = L(i3);
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
                                this.f598k.getClass();
                                u0 u0Var = (u0) ((w) j1.f570c.h(j, obj));
                                if (u0Var.f640d) {
                                    u0Var.f640d = false;
                                    break;
                                } else {
                                    break;
                                }
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                Unsafe unsafe = f589o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f600m.getClass();
                                    ((i0) object).f562d = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i3], i3, obj)) {
                        m(i3).d(f589o.getObject(obj, j));
                    }
                }
                if (n(i3, obj)) {
                    m(i3).d(f589o.getObject(obj, j));
                }
            }
            this.f599l.getClass();
            d1 d1Var = ((v) obj).unknownFields;
            if (d1Var.f529e) {
                d1Var.f529e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final boolean e(Object obj) {
        int i3;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f596h) {
            int i15 = this.g[i14];
            int[] iArr = this.f590a;
            int i16 = iArr[i15];
            int L = L(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f589o.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i13;
                i3 = i18;
            } else {
                int i20 = i13;
                i3 = i12;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & L) == 0 || o(obj, i10, i3, i11, i19)) {
                int K = K(L);
                if (K == 9 || K == 17) {
                    if (o(obj, i10, i3, i11, i19)) {
                        if (!m(i10).e(j1.f570c.h(L & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i3;
                    i13 = i11;
                } else {
                    if (K != 27) {
                        if (K == 60 || K == 68) {
                            if (q(i16, i10, obj)) {
                                if (!m(i10).e(j1.f570c.h(L & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i3;
                            i13 = i11;
                        } else if (K != 49) {
                            if (K != 50) {
                                continue;
                            } else {
                                Object h10 = j1.f570c.h(L & 1048575, obj);
                                this.f600m.getClass();
                                i0 i0Var = (i0) h10;
                                if (i0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((h0) this.f591b[(i10 / 3) * 2]).f558a.f547b.f620d != s1.f632w) {
                                        continue;
                                    } else {
                                        w0 w0Var = null;
                                        for (Object obj2 : i0Var.values()) {
                                            if (w0Var == null) {
                                                w0Var = t0.f636c.a(obj2.getClass());
                                            }
                                            if (!w0Var.e(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i14++;
                            i12 = i3;
                            i13 = i11;
                        }
                    }
                    List list = (List) j1.f570c.h(L & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        w0 m10 = m(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (m10.e(list.get(i21))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i3;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.x0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.x0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.x0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.x0.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
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
    
        if (androidx.datastore.preferences.protobuf.x0.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // androidx.datastore.preferences.protobuf.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(v vVar, v vVar2) {
        int[] iArr = this.f590a;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            boolean z10 = true;
            if (i3 < length) {
                int L = L(i3);
                long j = L & 1048575;
                switch (K(L)) {
                    case 0:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var2 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var3 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var4 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var5 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var6 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var7 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var8 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var9 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 9:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var10 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 10:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var11 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case RequestError.STOP_TRACKING /* 11 */:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var12 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var13 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var14 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var15 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var16 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var17 = j1.f570c;
                            break;
                        }
                        z10 = false;
                        break;
                    case 17:
                        if (j(vVar, vVar2, i3)) {
                            i1 i1Var18 = j1.f570c;
                            break;
                        }
                        z10 = false;
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
                        i1 i1Var19 = j1.f570c;
                        z10 = x0.l(i1Var19.h(j, vVar), i1Var19.h(j, vVar2));
                        break;
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        i1 i1Var20 = j1.f570c;
                        z10 = x0.l(i1Var20.h(j, vVar), i1Var20.h(j, vVar2));
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
                        i1 i1Var21 = j1.f570c;
                        if (i1Var21.f(j3, vVar) == i1Var21.f(j3, vVar2)) {
                            break;
                        }
                        z10 = false;
                        break;
                }
                if (z10) {
                    i3 += 3;
                }
            } else {
                this.f599l.getClass();
                if (vVar.unknownFields.equals(vVar2.unknownFields)) {
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
    @Override // androidx.datastore.preferences.protobuf.w0
    public final void g(java.lang.Object r19, androidx.datastore.preferences.protobuf.j r20, androidx.datastore.preferences.protobuf.n r21) {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n0.g(java.lang.Object, androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.n):void");
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final int h(v vVar) {
        int i3;
        int h10;
        int h11;
        int h12;
        int j;
        int h13;
        int j3;
        int h14;
        int h15;
        int f3;
        int h16;
        int a9;
        int c10;
        int h17;
        int size;
        int i10;
        int h18;
        int h19;
        int size2;
        int h20;
        int i11;
        int i12;
        int i13;
        int h21;
        int i14;
        n0 n0Var = this;
        v vVar2 = vVar;
        Unsafe unsafe = f589o;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = n0Var.f590a;
            if (i16 >= iArr.length) {
                n0Var.f599l.getClass();
                return vVar2.unknownFields.b() + i18;
            }
            int L = n0Var.L(i16);
            int K = K(L);
            int i19 = iArr[i16];
            int i20 = iArr[i16 + 2];
            int i21 = i20 & 1048575;
            if (K <= 17) {
                if (i21 != i15) {
                    i17 = i21 == 1048575 ? 0 : unsafe.getInt(vVar2, i21);
                    i15 = i21;
                }
                i3 = 1 << (i20 >>> 20);
            } else {
                i3 = 0;
            }
            long j10 = L & 1048575;
            if (K >= r.f611e.f615d) {
                int i22 = r.f612i.f615d;
            }
            switch (K) {
                case 0:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        h10 = l.h(i19);
                        c10 = h10 + 8;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        h11 = l.h(i19);
                        h15 = h11 + 4;
                        i18 += h15;
                    }
                    n0Var = this;
                    vVar2 = vVar;
                    break;
                case 2:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        long j11 = unsafe.getLong(vVar2, j10);
                        h12 = l.h(i19);
                        j = l.j(j11);
                        i18 += j + h12;
                    }
                    n0Var = this;
                    break;
                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        long j12 = unsafe.getLong(vVar2, j10);
                        h12 = l.h(i19);
                        j = l.j(j12);
                        i18 += j + h12;
                    }
                    n0Var = this;
                    break;
                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        int i23 = unsafe.getInt(vVar2, j10);
                        h13 = l.h(i19);
                        j3 = l.j(i23);
                        f3 = j3 + h13;
                        i18 += f3;
                    }
                    n0Var = this;
                    break;
                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        h14 = l.h(i19);
                        h15 = h14 + 8;
                        i18 += h15;
                    }
                    n0Var = this;
                    vVar2 = vVar;
                    break;
                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        h11 = l.h(i19);
                        h15 = h11 + 4;
                        i18 += h15;
                    }
                    n0Var = this;
                    vVar2 = vVar;
                    break;
                case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        h15 = l.h(i19) + 1;
                        i18 += h15;
                    }
                    n0Var = this;
                    vVar2 = vVar;
                    break;
                case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        Object object = unsafe.getObject(vVar2, j10);
                        i18 = (object instanceof f ? l.f(i19, (f) object) : l.g((String) object) + l.h(i19)) + i18;
                    }
                    n0Var = this;
                    break;
                case 9:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        Object object2 = unsafe.getObject(vVar2, j10);
                        w0 m10 = n0Var.m(i16);
                        Class cls = x0.f649a;
                        int h22 = l.h(i19);
                        int a10 = ((a) object2).a(m10);
                        i18 += l.i(a10) + a10 + h22;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        f3 = l.f(i19, (f) unsafe.getObject(vVar2, j10));
                        i18 += f3;
                    }
                    n0Var = this;
                    break;
                case RequestError.STOP_TRACKING /* 11 */:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        int i24 = unsafe.getInt(vVar2, j10);
                        h13 = l.h(i19);
                        j3 = l.i(i24);
                        f3 = j3 + h13;
                        i18 += f3;
                    }
                    n0Var = this;
                    break;
                case 12:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        int i25 = unsafe.getInt(vVar2, j10);
                        h13 = l.h(i19);
                        j3 = l.j(i25);
                        f3 = j3 + h13;
                        i18 += f3;
                    }
                    n0Var = this;
                    break;
                case 13:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        h11 = l.h(i19);
                        h15 = h11 + 4;
                        i18 += h15;
                    }
                    n0Var = this;
                    vVar2 = vVar;
                    break;
                case 14:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        h14 = l.h(i19);
                        h15 = h14 + 8;
                        i18 += h15;
                    }
                    n0Var = this;
                    vVar2 = vVar;
                    break;
                case 15:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        int i26 = unsafe.getInt(vVar2, j10);
                        h13 = l.h(i19);
                        j3 = l.i((i26 >> 31) ^ (i26 << 1));
                        f3 = j3 + h13;
                        i18 += f3;
                    }
                    n0Var = this;
                    break;
                case 16:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        long j13 = unsafe.getLong(vVar2, j10);
                        h12 = l.h(i19);
                        j = l.j((j13 << 1) ^ (j13 >> 63));
                        i18 += j + h12;
                    }
                    n0Var = this;
                    break;
                case 17:
                    if (n0Var.o(vVar2, i16, i15, i17, i3)) {
                        a aVar = (a) unsafe.getObject(vVar2, j10);
                        w0 m11 = n0Var.m(i16);
                        h16 = l.h(i19) * 2;
                        a9 = aVar.a(m11);
                        c10 = a9 + h16;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c10 = x0.c(i19, (List) unsafe.getObject(vVar2, j10));
                    i18 += c10;
                    break;
                case 19:
                    c10 = x0.b(i19, (List) unsafe.getObject(vVar2, j10));
                    i18 += c10;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(vVar2, j10);
                    Class cls2 = x0.f649a;
                    if (list.size() != 0) {
                        h17 = (l.h(i19) * list.size()) + x0.e(list);
                        i18 += h17;
                        break;
                    }
                    h17 = 0;
                    i18 += h17;
                case 21:
                    List list2 = (List) unsafe.getObject(vVar2, j10);
                    Class cls3 = x0.f649a;
                    size = list2.size();
                    if (size != 0) {
                        i10 = x0.i(list2);
                        h18 = l.h(i19);
                        h17 = (h18 * size) + i10;
                        i18 += h17;
                        break;
                    }
                    h17 = 0;
                    i18 += h17;
                case 22:
                    List list3 = (List) unsafe.getObject(vVar2, j10);
                    Class cls4 = x0.f649a;
                    size = list3.size();
                    if (size != 0) {
                        i10 = x0.d(list3);
                        h18 = l.h(i19);
                        h17 = (h18 * size) + i10;
                        i18 += h17;
                        break;
                    }
                    h17 = 0;
                    i18 += h17;
                case 23:
                    c10 = x0.c(i19, (List) unsafe.getObject(vVar2, j10));
                    i18 += c10;
                    break;
                case 24:
                    c10 = x0.b(i19, (List) unsafe.getObject(vVar2, j10));
                    i18 += c10;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(vVar2, j10);
                    Class cls5 = x0.f649a;
                    int size3 = list4.size();
                    i18 += size3 == 0 ? 0 : (l.h(i19) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(vVar2, j10);
                    Class cls6 = x0.f649a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        h17 = l.h(i19) * size4;
                        for (int i27 = 0; i27 < size4; i27++) {
                            Object obj = list5.get(i27);
                            if (obj instanceof f) {
                                int size5 = ((f) obj).size();
                                h17 = l.i(size5) + size5 + h17;
                            } else {
                                h17 = l.g((String) obj) + h17;
                            }
                        }
                        i18 += h17;
                        break;
                    }
                    h17 = 0;
                    i18 += h17;
                case 27:
                    List list6 = (List) unsafe.getObject(vVar2, j10);
                    w0 m12 = n0Var.m(i16);
                    Class cls7 = x0.f649a;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        h19 = l.h(i19) * size6;
                        for (int i28 = 0; i28 < size6; i28++) {
                            int a11 = ((a) list6.get(i28)).a(m12);
                            h19 += l.i(a11) + a11;
                        }
                        i18 += h19;
                        break;
                    }
                    h19 = 0;
                    i18 += h19;
                case 28:
                    List list7 = (List) unsafe.getObject(vVar2, j10);
                    Class cls8 = x0.f649a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        h17 = l.h(i19) * size7;
                        for (int i29 = 0; i29 < list7.size(); i29++) {
                            int size8 = ((f) list7.get(i29)).size();
                            h17 += l.i(size8) + size8;
                        }
                        i18 += h17;
                        break;
                    }
                    h17 = 0;
                    i18 += h17;
                case 29:
                    List list8 = (List) unsafe.getObject(vVar2, j10);
                    Class cls9 = x0.f649a;
                    size = list8.size();
                    if (size != 0) {
                        i10 = x0.h(list8);
                        h18 = l.h(i19);
                        h17 = (h18 * size) + i10;
                        i18 += h17;
                        break;
                    }
                    h17 = 0;
                    i18 += h17;
                case 30:
                    List list9 = (List) unsafe.getObject(vVar2, j10);
                    Class cls10 = x0.f649a;
                    size = list9.size();
                    if (size != 0) {
                        i10 = x0.a(list9);
                        h18 = l.h(i19);
                        h17 = (h18 * size) + i10;
                        i18 += h17;
                        break;
                    }
                    h17 = 0;
                    i18 += h17;
                case 31:
                    c10 = x0.b(i19, (List) unsafe.getObject(vVar2, j10));
                    i18 += c10;
                    break;
                case 32:
                    c10 = x0.c(i19, (List) unsafe.getObject(vVar2, j10));
                    i18 += c10;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(vVar2, j10);
                    Class cls11 = x0.f649a;
                    size = list10.size();
                    if (size != 0) {
                        i10 = x0.f(list10);
                        h18 = l.h(i19);
                        h17 = (h18 * size) + i10;
                        i18 += h17;
                        break;
                    }
                    h17 = 0;
                    i18 += h17;
                case 34:
                    List list11 = (List) unsafe.getObject(vVar2, j10);
                    Class cls12 = x0.f649a;
                    size = list11.size();
                    if (size != 0) {
                        i10 = x0.g(list11);
                        h18 = l.h(i19);
                        h17 = (h18 * size) + i10;
                        i18 += h17;
                        break;
                    }
                    h17 = 0;
                    i18 += h17;
                case 35:
                    List list12 = (List) unsafe.getObject(vVar2, j10);
                    Class cls13 = x0.f649a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(vVar2, j10);
                    Class cls14 = x0.f649a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = x0.e((List) unsafe.getObject(vVar2, j10));
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = x0.i((List) unsafe.getObject(vVar2, j10));
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = x0.d((List) unsafe.getObject(vVar2, j10));
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NETWORK_FAILURE /* 40 */:
                    List list14 = (List) unsafe.getObject(vVar2, j10);
                    Class cls15 = x0.f649a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    List list15 = (List) unsafe.getObject(vVar2, j10);
                    Class cls16 = x0.f649a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(vVar2, j10);
                    Class cls17 = x0.f649a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = x0.h((List) unsafe.getObject(vVar2, j10));
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = x0.a((List) unsafe.getObject(vVar2, j10));
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(vVar2, j10);
                    Class cls18 = x0.f649a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(vVar2, j10);
                    Class cls19 = x0.f649a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = x0.f((List) unsafe.getObject(vVar2, j10));
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = x0.g((List) unsafe.getObject(vVar2, j10));
                    if (size2 > 0) {
                        h20 = l.h(i19);
                        i11 = l.i(size2);
                        i12 = i11 + h20;
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(vVar2, j10);
                    w0 m13 = n0Var.m(i16);
                    Class cls20 = x0.f649a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i13 = 0;
                    } else {
                        i13 = 0;
                        for (int i30 = 0; i30 < size9; i30++) {
                            i13 += ((a) list19.get(i30)).a(m13) + (l.h(i19) * 2);
                        }
                    }
                    i18 += i13;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    Object object3 = unsafe.getObject(vVar2, j10);
                    Object obj2 = n0Var.f591b[(i16 / 3) * 2];
                    n0Var.f600m.getClass();
                    i0 i0Var = (i0) object3;
                    h0 h0Var = (h0) obj2;
                    if (!i0Var.isEmpty()) {
                        h19 = 0;
                        for (Map.Entry entry : i0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            h0Var.getClass();
                            int h23 = l.h(i19);
                            int a12 = h0.a(h0Var.f558a, key, value);
                            h19 += l.i(a12) + a12 + h23;
                        }
                        i18 += h19;
                        break;
                    }
                    h19 = 0;
                    i18 += h19;
                case 51:
                    if (n0Var.q(i19, i16, vVar2)) {
                        h10 = l.h(i19);
                        c10 = h10 + 8;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (n0Var.q(i19, i16, vVar2)) {
                        h21 = l.h(i19);
                        c10 = h21 + 4;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (n0Var.q(i19, i16, vVar2)) {
                        long z10 = z(j10, vVar2);
                        size2 = l.h(i19);
                        i12 = l.j(z10);
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (n0Var.q(i19, i16, vVar2)) {
                        long z11 = z(j10, vVar2);
                        size2 = l.h(i19);
                        i12 = l.j(z11);
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (n0Var.q(i19, i16, vVar2)) {
                        int y3 = y(j10, vVar2);
                        h16 = l.h(i19);
                        a9 = l.j(y3);
                        c10 = a9 + h16;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (n0Var.q(i19, i16, vVar2)) {
                        h10 = l.h(i19);
                        c10 = h10 + 8;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (n0Var.q(i19, i16, vVar2)) {
                        h21 = l.h(i19);
                        c10 = h21 + 4;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (n0Var.q(i19, i16, vVar2)) {
                        c10 = l.h(i19) + 1;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (n0Var.q(i19, i16, vVar2)) {
                        Object object4 = unsafe.getObject(vVar2, j10);
                        i18 = (object4 instanceof f ? l.f(i19, (f) object4) : l.g((String) object4) + l.h(i19)) + i18;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (n0Var.q(i19, i16, vVar2)) {
                        Object object5 = unsafe.getObject(vVar2, j10);
                        w0 m14 = n0Var.m(i16);
                        Class cls21 = x0.f649a;
                        int h24 = l.h(i19);
                        int a13 = ((a) object5).a(m14);
                        i14 = l.i(a13) + a13 + h24;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (n0Var.q(i19, i16, vVar2)) {
                        c10 = l.f(i19, (f) unsafe.getObject(vVar2, j10));
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (n0Var.q(i19, i16, vVar2)) {
                        int y10 = y(j10, vVar2);
                        h16 = l.h(i19);
                        a9 = l.i(y10);
                        c10 = a9 + h16;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (n0Var.q(i19, i16, vVar2)) {
                        int y11 = y(j10, vVar2);
                        h16 = l.h(i19);
                        a9 = l.j(y11);
                        c10 = a9 + h16;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (n0Var.q(i19, i16, vVar2)) {
                        h21 = l.h(i19);
                        c10 = h21 + 4;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (n0Var.q(i19, i16, vVar2)) {
                        h10 = l.h(i19);
                        c10 = h10 + 8;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (n0Var.q(i19, i16, vVar2)) {
                        int y12 = y(j10, vVar2);
                        h16 = l.h(i19);
                        a9 = l.i((y12 >> 31) ^ (y12 << 1));
                        c10 = a9 + h16;
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (n0Var.q(i19, i16, vVar2)) {
                        long z12 = z(j10, vVar2);
                        size2 = l.h(i19);
                        i12 = l.j((z12 << 1) ^ (z12 >> 63));
                        i14 = i12 + size2;
                        i18 += i14;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (n0Var.q(i19, i16, vVar2)) {
                        c10 = ((a) unsafe.getObject(vVar2, j10)).a(n0Var.m(i16)) + (l.h(i19) * 2);
                        i18 += c10;
                        break;
                    } else {
                        break;
                    }
            }
            i16 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.w0
    public final v i() {
        this.j.getClass();
        return ((v) this.f594e).i();
    }

    public final boolean j(v vVar, v vVar2, int i3) {
        return n(i3, vVar) == n(i3, vVar2);
    }

    public final void k(int i3, Object obj, Object obj2) {
        int i10 = this.f590a[i3];
        if (j1.f570c.h(L(i3) & 1048575, obj) == null) {
            return;
        }
        l(i3);
    }

    public final void l(int i3) {
        if (this.f591b[((i3 / 3) * 2) + 1] == null) {
            return;
        }
        kotlin.collections.i0.j();
    }

    public final w0 m(int i3) {
        int i10 = (i3 / 3) * 2;
        Object[] objArr = this.f591b;
        w0 w0Var = (w0) objArr[i10];
        if (w0Var != null) {
            return w0Var;
        }
        w0 a9 = t0.f636c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a9;
        return a9;
    }

    public final boolean n(int i3, Object obj) {
        int i10 = this.f590a[i3 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int L = L(i3);
            long j3 = L & 1048575;
            switch (K(L)) {
                case 0:
                    if (Double.doubleToRawLongBits(j1.f570c.d(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(j1.f570c.e(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (j1.f570c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (j1.f570c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.j.LONG_FIELD_NUMBER /* 4 */:
                    if (j1.f570c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.j.STRING_FIELD_NUMBER /* 5 */:
                    if (j1.f570c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (j1.f570c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    return j1.f570c.c(j3, obj);
                case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                    Object h10 = j1.f570c.h(j3, obj);
                    if (h10 instanceof String) {
                        return !((String) h10).isEmpty();
                    }
                    if (h10 instanceof f) {
                        return !f.f533i.equals(h10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (j1.f570c.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !f.f533i.equals(j1.f570c.h(j3, obj));
                case RequestError.STOP_TRACKING /* 11 */:
                    if (j1.f570c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (j1.f570c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (j1.f570c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (j1.f570c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (j1.f570c.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (j1.f570c.g(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (j1.f570c.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & j1.f570c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i3, int i10, int i11, int i12) {
        return i10 == 1048575 ? n(i3, obj) : (i11 & i12) != 0;
    }

    public final boolean q(int i3, int i10, Object obj) {
        return j1.f570c.f((long) (this.f590a[i10 + 2] & 1048575), obj) == i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.i(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i3, Object obj2, n nVar, j jVar) {
        long L = L(i3) & 1048575;
        Object h10 = j1.f570c.h(L, obj);
        j0 j0Var = this.f600m;
        if (h10 == null) {
            j0Var.getClass();
            h10 = i0.f561e.b();
            j1.o(L, obj, h10);
        } else {
            j0Var.getClass();
            if (!((i0) h10).f562d) {
                i0 b10 = i0.f561e.b();
                j0.a(b10, h10);
                j1.o(L, obj, b10);
                h10 = b10;
            }
        }
        j0Var.getClass();
        i0 i0Var = (i0) h10;
        g0 g0Var = ((h0) obj2).f558a;
        jVar.y(2);
        i iVar = (i) jVar.f567d;
        int j = iVar.j(iVar.A());
        Object obj3 = g0Var.f548c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a9 = jVar.a();
                if (a9 == Integer.MAX_VALUE || iVar.d()) {
                    break;
                }
                if (a9 == 1) {
                    obj4 = jVar.k(g0Var.f546a, null, null);
                } else if (a9 != 2) {
                    try {
                        if (!jVar.z()) {
                            throw new z("Unable to parse map entry.");
                        }
                    } catch (y unused) {
                        if (!jVar.z()) {
                            throw new z("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = jVar.k(g0Var.f547b, obj3.getClass(), nVar);
                }
            } catch (Throwable th) {
                iVar.i(j);
                throw th;
            }
        }
    }

    public final void s(int i3, Object obj, Object obj2) {
        if (n(i3, obj2)) {
            long L = L(i3) & 1048575;
            Unsafe unsafe = f589o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f590a[i3] + " is present but null: " + obj2);
            }
            w0 m10 = m(i3);
            if (!n(i3, obj)) {
                if (p(object)) {
                    v i10 = m10.i();
                    m10.a(i10, object);
                    unsafe.putObject(obj, L, i10);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                G(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                v i11 = m10.i();
                m10.a(i11, object2);
                unsafe.putObject(obj, L, i11);
                object2 = i11;
            }
            m10.a(object2, object);
        }
    }

    public final void t(int i3, Object obj, Object obj2) {
        int[] iArr = this.f590a;
        int i10 = iArr[i3];
        if (q(i10, i3, obj2)) {
            long L = L(i3) & 1048575;
            Unsafe unsafe = f589o;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2);
            }
            w0 m10 = m(i3);
            if (!q(i10, i3, obj)) {
                if (p(object)) {
                    v i11 = m10.i();
                    m10.a(i11, object);
                    unsafe.putObject(obj, L, i11);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                H(i10, i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                v i12 = m10.i();
                m10.a(i12, object2);
                unsafe.putObject(obj, L, i12);
                object2 = i12;
            }
            m10.a(object2, object);
        }
    }

    public final Object u(int i3, Object obj) {
        w0 m10 = m(i3);
        long L = L(i3) & 1048575;
        if (!n(i3, obj)) {
            return m10.i();
        }
        Object object = f589o.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        v i10 = m10.i();
        if (object != null) {
            m10.a(i10, object);
        }
        return i10;
    }

    public final Object v(int i3, int i10, Object obj) {
        w0 m10 = m(i10);
        if (!q(i3, i10, obj)) {
            return m10.i();
        }
        Object object = f589o.getObject(obj, L(i10) & 1048575);
        if (p(object)) {
            return object;
        }
        v i11 = m10.i();
        if (object != null) {
            m10.a(i11, object);
        }
        return i11;
    }
}
