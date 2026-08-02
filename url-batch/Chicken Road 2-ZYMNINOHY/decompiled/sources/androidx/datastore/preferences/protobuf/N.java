package androidx.datastore.preferences.protobuf;

import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class N implements W {
    public static final int[] n = new int[0];
    public static final Unsafe o = j0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f4573a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f4574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4575c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4576d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0168a f4577e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4578f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f4579g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4580h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4581i;

    /* renamed from: j, reason: collision with root package name */
    public final P f4582j;

    /* renamed from: k, reason: collision with root package name */
    public final C f4583k;

    /* renamed from: l, reason: collision with root package name */
    public final e0 f4584l;

    /* renamed from: m, reason: collision with root package name */
    public final J f4585m;

    public N(int[] iArr, Object[] objArr, int i4, int i5, AbstractC0168a abstractC0168a, int[] iArr2, int i6, int i7, P p2, C c4, e0 e0Var, C0183p c0183p, J j4) {
        this.f4573a = iArr;
        this.f4574b = objArr;
        this.f4575c = i4;
        this.f4576d = i5;
        this.f4578f = abstractC0168a instanceof AbstractC0189w;
        this.f4579g = iArr2;
        this.f4580h = i6;
        this.f4581i = i7;
        this.f4582j = p2;
        this.f4583k = c4;
        this.f4584l = e0Var;
        this.f4577e = abstractC0168a;
        this.f4585m = j4;
    }

    public static Field E(Class cls, String str) {
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

    public static int J(int i4) {
        return (i4 & 267386880) >>> 20;
    }

    public static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0189w) {
            return ((AbstractC0189w) obj).g();
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
    public static N v(V v, P p2, C c4, e0 e0Var, C0183p c0183p, J j4) {
        int i4;
        int charAt;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        char charAt2;
        int i12;
        char charAt3;
        int i13;
        char charAt4;
        int i14;
        char charAt5;
        int i15;
        char charAt6;
        int i16;
        char charAt7;
        int i17;
        char charAt8;
        int i18;
        char charAt9;
        int i19;
        int i20;
        int i21;
        Class<?> cls;
        int i22;
        int objectFieldOffset;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Field E4;
        char charAt10;
        int i28;
        int i29;
        Object obj;
        Field E5;
        Object obj2;
        Field E6;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        String str = v.f4598b;
        int length = str.length();
        int i34 = 55296;
        if (str.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i4 = i35 + 1;
                if (str.charAt(i35) < 55296) {
                    break;
                }
                i35 = i4;
            }
        } else {
            i4 = 1;
        }
        int i36 = i4 + 1;
        int charAt15 = str.charAt(i4);
        if (charAt15 >= 55296) {
            int i37 = charAt15 & 8191;
            int i38 = 13;
            while (true) {
                i33 = i36 + 1;
                charAt14 = str.charAt(i36);
                if (charAt14 < 55296) {
                    break;
                }
                i37 |= (charAt14 & 8191) << i38;
                i38 += 13;
                i36 = i33;
            }
            charAt15 = i37 | (charAt14 << i38);
            i36 = i33;
        }
        if (charAt15 == 0) {
            i6 = 0;
            i9 = 0;
            charAt = 0;
            i5 = 0;
            i8 = 0;
            i10 = 0;
            iArr = n;
            i7 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt16 = str.charAt(i36);
            if (charAt16 >= 55296) {
                int i40 = charAt16 & 8191;
                int i41 = 13;
                while (true) {
                    i18 = i39 + 1;
                    charAt9 = str.charAt(i39);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i40 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i39 = i18;
                }
                charAt16 = i40 | (charAt9 << i41);
                i39 = i18;
            }
            int i42 = i39 + 1;
            int charAt17 = str.charAt(i39);
            if (charAt17 >= 55296) {
                int i43 = charAt17 & 8191;
                int i44 = 13;
                while (true) {
                    i17 = i42 + 1;
                    charAt8 = str.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i17;
                }
                charAt17 = i43 | (charAt8 << i44);
                i42 = i17;
            }
            int i45 = i42 + 1;
            int charAt18 = str.charAt(i42);
            if (charAt18 >= 55296) {
                int i46 = charAt18 & 8191;
                int i47 = 13;
                while (true) {
                    i16 = i45 + 1;
                    charAt7 = str.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i16;
                }
                charAt18 = i46 | (charAt7 << i47);
                i45 = i16;
            }
            int i48 = i45 + 1;
            int charAt19 = str.charAt(i45);
            if (charAt19 >= 55296) {
                int i49 = charAt19 & 8191;
                int i50 = 13;
                while (true) {
                    i15 = i48 + 1;
                    charAt6 = str.charAt(i48);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i49 |= (charAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i15;
                }
                charAt19 = i49 | (charAt6 << i50);
                i48 = i15;
            }
            int i51 = i48 + 1;
            charAt = str.charAt(i48);
            if (charAt >= 55296) {
                int i52 = charAt & 8191;
                int i53 = 13;
                while (true) {
                    i14 = i51 + 1;
                    charAt5 = str.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i14;
                }
                charAt = i52 | (charAt5 << i53);
                i51 = i14;
            }
            int i54 = i51 + 1;
            int charAt20 = str.charAt(i51);
            if (charAt20 >= 55296) {
                int i55 = charAt20 & 8191;
                int i56 = 13;
                while (true) {
                    i13 = i54 + 1;
                    charAt4 = str.charAt(i54);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i13;
                }
                charAt20 = i55 | (charAt4 << i56);
                i54 = i13;
            }
            int i57 = i54 + 1;
            int charAt21 = str.charAt(i54);
            if (charAt21 >= 55296) {
                int i58 = charAt21 & 8191;
                int i59 = 13;
                while (true) {
                    i12 = i57 + 1;
                    charAt3 = str.charAt(i57);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i58 |= (charAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i12;
                }
                charAt21 = i58 | (charAt3 << i59);
                i57 = i12;
            }
            int i60 = i57 + 1;
            int charAt22 = str.charAt(i57);
            if (charAt22 >= 55296) {
                int i61 = charAt22 & 8191;
                int i62 = 13;
                while (true) {
                    i11 = i60 + 1;
                    charAt2 = str.charAt(i60);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i61 |= (charAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i11;
                }
                charAt22 = i61 | (charAt2 << i62);
                i60 = i11;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i63 = (charAt16 * 2) + charAt17;
            int i64 = charAt20;
            i5 = charAt18;
            i6 = i64;
            i7 = charAt16;
            i36 = i60;
            iArr = iArr2;
            i8 = charAt19;
            i9 = i63;
            i10 = charAt22;
        }
        Unsafe unsafe = o;
        Object[] objArr = v.f4599c;
        Class<?> cls2 = v.f4597a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i65 = i10 + i6;
        int i66 = i65;
        int i67 = i10;
        int i68 = 0;
        int i69 = 0;
        while (i36 < length) {
            int i70 = i36 + 1;
            int charAt23 = str.charAt(i36);
            if (charAt23 >= i34) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i32 = i72 + 1;
                    charAt13 = str.charAt(i72);
                    i19 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i32;
                    length = i19;
                }
                charAt23 = i71 | (charAt13 << i73);
                i20 = i32;
            } else {
                i19 = length;
                i20 = i70;
            }
            int i74 = i20 + 1;
            int charAt24 = str.charAt(i20);
            Object[] objArr3 = objArr;
            char c5 = 55296;
            if (charAt24 >= 55296) {
                int i75 = charAt24 & 8191;
                int i76 = 13;
                while (true) {
                    i31 = i74 + 1;
                    charAt12 = str.charAt(i74);
                    if (charAt12 < c5) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i76;
                    i76 += 13;
                    i74 = i31;
                    c5 = 55296;
                }
                charAt24 = i75 | (charAt12 << i76);
                i74 = i31;
            }
            int i77 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i78 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int[] iArr4 = iArr3;
            if (i77 >= 51) {
                int i79 = i74 + 1;
                int charAt25 = str.charAt(i74);
                char c6 = 55296;
                if (charAt25 >= 55296) {
                    int i80 = charAt25 & 8191;
                    int i81 = 13;
                    while (true) {
                        i30 = i79 + 1;
                        charAt11 = str.charAt(i79);
                        if (charAt11 < c6) {
                            break;
                        }
                        i80 |= (charAt11 & 8191) << i81;
                        i81 += 13;
                        i79 = i30;
                        c6 = 55296;
                    }
                    charAt25 = i80 | (charAt11 << i81);
                    i79 = i30;
                }
                int i82 = i77 - 51;
                int i83 = i79;
                if (i82 == 9 || i82 == 17) {
                    i29 = i9 + 1;
                    objArr2[((i69 / 3) * 2) + 1] = objArr3[i9];
                } else {
                    if (i82 == 12 && (M.j.a(v.a(), 1) || (charAt24 & 2048) != 0)) {
                        i29 = i9 + 1;
                        objArr2[((i69 / 3) * 2) + 1] = objArr3[i9];
                    }
                    int i84 = charAt25 * 2;
                    obj = objArr3[i84];
                    if (obj instanceof Field) {
                        E5 = E(cls2, (String) obj);
                        objArr3[i84] = E5;
                    } else {
                        E5 = (Field) obj;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(E5);
                    int i85 = i84 + 1;
                    obj2 = objArr3[i85];
                    if (obj2 instanceof Field) {
                        E6 = E(cls2, (String) obj2);
                        objArr3[i85] = E6;
                    } else {
                        E6 = (Field) obj2;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(E6);
                    int i86 = i7;
                    i23 = objectFieldOffset3;
                    i27 = objectFieldOffset2;
                    i21 = i86;
                    i26 = i9;
                    i24 = i83;
                    i25 = 0;
                    cls = cls2;
                }
                i9 = i29;
                int i842 = charAt25 * 2;
                obj = objArr3[i842];
                if (obj instanceof Field) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(E5);
                int i852 = i842 + 1;
                obj2 = objArr3[i852];
                if (obj2 instanceof Field) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(E6);
                int i862 = i7;
                i23 = objectFieldOffset32;
                i27 = objectFieldOffset22;
                i21 = i862;
                i26 = i9;
                i24 = i83;
                i25 = 0;
                cls = cls2;
            } else {
                int i87 = i9 + 1;
                Field E7 = E(cls2, (String) objArr3[i9]);
                if (i77 == 9 || i77 == 17) {
                    i21 = i7;
                    objArr2[((i69 / 3) * 2) + 1] = E7.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        i21 = i7;
                        i28 = i9 + 2;
                        objArr2[((i69 / 3) * 2) + 1] = objArr3[i87];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        i21 = i7;
                        if (v.a() == 1 || (charAt24 & 2048) != 0) {
                            i28 = i9 + 2;
                            objArr2[((i69 / 3) * 2) + 1] = objArr3[i87];
                        }
                    } else if (i77 == 50) {
                        int i88 = i67 + 1;
                        iArr[i67] = i69;
                        int i89 = (i69 / 3) * 2;
                        int i90 = i9 + 2;
                        objArr2[i89] = objArr3[i87];
                        if ((charAt24 & 2048) != 0) {
                            i22 = i9 + 3;
                            objArr2[i89 + 1] = objArr3[i90];
                            i21 = i7;
                            cls = cls2;
                            i67 = i88;
                        } else {
                            cls = cls2;
                            i22 = i90;
                            i67 = i88;
                            i21 = i7;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(E7);
                        if ((charAt24 & 4096) != 0 || i77 > 17) {
                            i23 = 1048575;
                            i24 = i74;
                            i25 = 0;
                        } else {
                            int i91 = i74 + 1;
                            int charAt26 = str.charAt(i74);
                            if (charAt26 >= 55296) {
                                int i92 = charAt26 & 8191;
                                int i93 = 13;
                                while (true) {
                                    i24 = i91 + 1;
                                    charAt10 = str.charAt(i91);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i92 |= (charAt10 & 8191) << i93;
                                    i93 += 13;
                                    i91 = i24;
                                }
                                charAt26 = i92 | (charAt10 << i93);
                            } else {
                                i24 = i91;
                            }
                            int i94 = (charAt26 / 32) + (i21 * 2);
                            Object obj3 = objArr3[i94];
                            if (obj3 instanceof Field) {
                                E4 = (Field) obj3;
                            } else {
                                E4 = E(cls, (String) obj3);
                                objArr3[i94] = E4;
                            }
                            i23 = (int) unsafe.objectFieldOffset(E4);
                            i25 = charAt26 % 32;
                        }
                        if (i77 >= 18 || i77 > 49) {
                            i26 = i22;
                            i27 = objectFieldOffset;
                        } else {
                            iArr[i66] = objectFieldOffset;
                            i26 = i22;
                            i27 = objectFieldOffset;
                            i66++;
                        }
                    } else {
                        i21 = i7;
                    }
                    i22 = i28;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(E7);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i23 = 1048575;
                    i24 = i74;
                    i25 = 0;
                    if (i77 >= 18) {
                    }
                    i26 = i22;
                    i27 = objectFieldOffset;
                }
                cls = cls2;
                i22 = i87;
                objectFieldOffset = (int) unsafe.objectFieldOffset(E7);
                if ((charAt24 & 4096) != 0) {
                }
                i23 = 1048575;
                i24 = i74;
                i25 = 0;
                if (i77 >= 18) {
                }
                i26 = i22;
                i27 = objectFieldOffset;
            }
            int i95 = i69 + 1;
            iArr4[i69] = i78;
            int i96 = i69 + 2;
            String str2 = str;
            iArr4[i95] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | i27;
            i69 += 3;
            iArr4[i96] = (i25 << 20) | i23;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i19;
            i7 = i21;
            i36 = i24;
            i34 = 55296;
            i9 = i26;
            iArr3 = iArr4;
        }
        return new N(iArr3, objArr2, i5, i8, v.f4597a, iArr, i10, i65, p2, c4, e0Var, c0183p, j4);
    }

    public static long w(int i4) {
        return i4 & 1048575;
    }

    public static int x(long j4, Object obj) {
        return ((Integer) j0.f4660c.h(j4, obj)).intValue();
    }

    public static long y(long j4, Object obj) {
        return ((Long) j0.f4660c.h(j4, obj)).longValue();
    }

    public final void A(Object obj, long j4, C0178k c0178k, W w4, C0182o c0182o) {
        int u4;
        this.f4583k.getClass();
        InterfaceC0190x a3 = C.a(j4, obj);
        AbstractC0177j abstractC0177j = (AbstractC0177j) c0178k.f4668d;
        int i4 = c0178k.f4665a;
        if ((i4 & 7) != 3) {
            throw A.b();
        }
        do {
            AbstractC0189w newInstance = w4.newInstance();
            c0178k.c(newInstance, w4, c0182o);
            w4.c(newInstance);
            ((U) a3).add(newInstance);
            if (abstractC0177j.c() || c0178k.f4667c != 0) {
                return;
            } else {
                u4 = abstractC0177j.u();
            }
        } while (u4 == i4);
        c0178k.f4667c = u4;
    }

    public final void B(Object obj, int i4, C0178k c0178k, W w4, C0182o c0182o) {
        int u4;
        this.f4583k.getClass();
        InterfaceC0190x a3 = C.a(i4 & 1048575, obj);
        AbstractC0177j abstractC0177j = (AbstractC0177j) c0178k.f4668d;
        int i5 = c0178k.f4665a;
        if ((i5 & 7) != 2) {
            throw A.b();
        }
        do {
            AbstractC0189w newInstance = w4.newInstance();
            c0178k.d(newInstance, w4, c0182o);
            w4.c(newInstance);
            ((U) a3).add(newInstance);
            if (abstractC0177j.c() || c0178k.f4667c != 0) {
                return;
            } else {
                u4 = abstractC0177j.u();
            }
        } while (u4 == i5);
        c0178k.f4667c = u4;
    }

    public final void C(int i4, C0178k c0178k, Object obj) {
        AbstractC0177j abstractC0177j = (AbstractC0177j) c0178k.f4668d;
        if ((536870912 & i4) != 0) {
            c0178k.x(2);
            j0.o(i4 & 1048575, obj, abstractC0177j.t());
        } else if (!this.f4578f) {
            j0.o(i4 & 1048575, obj, c0178k.f());
        } else {
            c0178k.x(2);
            j0.o(i4 & 1048575, obj, abstractC0177j.s());
        }
    }

    public final void D(int i4, C0178k c0178k, Object obj) {
        int i5 = 536870912 & i4;
        C c4 = this.f4583k;
        if (i5 != 0) {
            c4.getClass();
            c0178k.t(C.a(i4 & 1048575, obj), true);
        } else {
            c4.getClass();
            c0178k.t(C.a(i4 & 1048575, obj), false);
        }
    }

    public final void F(int i4, Object obj) {
        int i5 = this.f4573a[i4 + 2];
        long j4 = 1048575 & i5;
        if (j4 == 1048575) {
            return;
        }
        j0.m(j4, obj, (1 << (i5 >>> 20)) | j0.f4660c.f(j4, obj));
    }

    public final void G(int i4, int i5, Object obj) {
        j0.m(this.f4573a[i5 + 2] & 1048575, obj, i4);
    }

    public final void H(Object obj, int i4, AbstractC0168a abstractC0168a) {
        o.putObject(obj, K(i4) & 1048575, abstractC0168a);
        F(i4, obj);
    }

    public final void I(Object obj, int i4, int i5, AbstractC0168a abstractC0168a) {
        o.putObject(obj, K(i5) & 1048575, abstractC0168a);
        G(i4, i5, obj);
    }

    public final int K(int i4) {
        return this.f4573a[i4 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void L(Object obj, F f4) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        N n4 = this;
        int[] iArr = n4.f4573a;
        int length = iArr.length;
        Unsafe unsafe = o;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int K2 = n4.K(i10);
            int i12 = iArr[i10];
            int J4 = J(K2);
            if (J4 <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i11 = i14 == i8 ? 0 : unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i4 = K2;
                i5 = 1 << (i13 >>> 20);
            } else {
                i4 = K2;
                i5 = 0;
            }
            long j4 = i4 & i8;
            switch (J4) {
                case 0:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        double d4 = j0.f4660c.d(j4, obj);
                        C0180m c0180m = (C0180m) f4.f4562a;
                        c0180m.getClass();
                        c0180m.m0(i12, Double.doubleToRawLongBits(d4));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        float e4 = j0.f4660c.e(j4, obj);
                        C0180m c0180m2 = (C0180m) f4.f4562a;
                        c0180m2.getClass();
                        c0180m2.k0(i12, Float.floatToRawIntBits(e4));
                    }
                    n4 = this;
                    break;
                case 2:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).w0(i12, unsafe.getLong(obj, j4));
                    }
                    n4 = this;
                    break;
                case 3:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).w0(i12, unsafe.getLong(obj, j4));
                    }
                    n4 = this;
                    break;
                case 4:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).o0(i12, unsafe.getInt(obj, j4));
                    }
                    n4 = this;
                    break;
                case 5:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).m0(i12, unsafe.getLong(obj, j4));
                    }
                    n4 = this;
                    break;
                case 6:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).k0(i12, unsafe.getInt(obj, j4));
                    }
                    n4 = this;
                    break;
                case 7:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).h0(i12, j0.f4660c.c(j4, obj));
                    }
                    n4 = this;
                    break;
                case 8:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof String) {
                            ((C0180m) f4.f4562a).r0(i12, (String) object);
                        } else {
                            ((C0180m) f4.f4562a).i0(i12, (C0174g) object);
                        }
                    }
                    n4 = this;
                    break;
                case 9:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).q0(i12, (AbstractC0168a) unsafe.getObject(obj, j4), n4.l(i10));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).i0(i12, (C0174g) unsafe.getObject(obj, j4));
                    }
                    n4 = this;
                    break;
                case 11:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).u0(i12, unsafe.getInt(obj, j4));
                    }
                    n4 = this;
                    break;
                case 12:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).o0(i12, unsafe.getInt(obj, j4));
                    }
                    n4 = this;
                    break;
                case 13:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).k0(i12, unsafe.getInt(obj, j4));
                    }
                    n4 = this;
                    break;
                case 14:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        ((C0180m) f4.f4562a).m0(i12, unsafe.getLong(obj, j4));
                    }
                    n4 = this;
                    break;
                case 15:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        int i15 = unsafe.getInt(obj, j4);
                        ((C0180m) f4.f4562a).u0(i12, (i15 >> 31) ^ (i15 << 1));
                    }
                    n4 = this;
                    break;
                case 16:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        long j5 = unsafe.getLong(obj, j4);
                        ((C0180m) f4.f4562a).w0(i12, (j5 >> 63) ^ (j5 << 1));
                    }
                    n4 = this;
                    break;
                case 17:
                    if (n4.n(obj, i10, i9, i11, i5)) {
                        f4.a(i12, unsafe.getObject(obj, j4), n4.l(i10));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i6 = i9;
                    X.n(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case C0583e9.f11743C /* 19 */:
                    i6 = i9;
                    X.r(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case C0583e9.f11744D /* 20 */:
                    i6 = i9;
                    X.t(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case 21:
                    i6 = i9;
                    X.z(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case Build.API_LEVELS.API_22 /* 22 */:
                    i6 = i9;
                    X.s(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case Build.API_LEVELS.API_23 /* 23 */:
                    i6 = i9;
                    X.q(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case 24:
                    i6 = i9;
                    X.p(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case 25:
                    i6 = i9;
                    X.m(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case 26:
                    i7 = i9;
                    int i16 = iArr[i10];
                    List list = (List) unsafe.getObject(obj, j4);
                    Class cls = X.f4601a;
                    if (list != null && !list.isEmpty()) {
                        f4.getClass();
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            ((C0180m) f4.f4562a).r0(i16, (String) list.get(i17));
                        }
                    }
                    i9 = i7;
                    break;
                case 27:
                    i7 = i9;
                    int i18 = iArr[i10];
                    List list2 = (List) unsafe.getObject(obj, j4);
                    W l4 = n4.l(i10);
                    Class cls2 = X.f4601a;
                    if (list2 != null && !list2.isEmpty()) {
                        f4.getClass();
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            ((C0180m) f4.f4562a).q0(i18, (AbstractC0168a) list2.get(i19), l4);
                        }
                    }
                    i9 = i7;
                    break;
                case Build.API_LEVELS.API_28 /* 28 */:
                    i7 = i9;
                    int i20 = iArr[i10];
                    List list3 = (List) unsafe.getObject(obj, j4);
                    Class cls3 = X.f4601a;
                    if (list3 != null && !list3.isEmpty()) {
                        f4.getClass();
                        for (int i21 = 0; i21 < list3.size(); i21++) {
                            ((C0180m) f4.f4562a).i0(i20, (C0174g) list3.get(i21));
                        }
                    }
                    i9 = i7;
                    break;
                case 29:
                    i6 = i9;
                    z = false;
                    X.y(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case Build.API_LEVELS.API_30 /* 30 */:
                    i6 = i9;
                    z = false;
                    X.o(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case Build.API_LEVELS.API_31 /* 31 */:
                    i6 = i9;
                    z = false;
                    X.u(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case Build.API_LEVELS.API_32 /* 32 */:
                    i6 = i9;
                    z = false;
                    X.v(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case Build.API_LEVELS.API_33 /* 33 */:
                    i6 = i9;
                    z = false;
                    X.w(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case Build.API_LEVELS.API_34 /* 34 */:
                    i6 = i9;
                    z = false;
                    X.x(iArr[i10], (List) unsafe.getObject(obj, j4), f4, false);
                    i9 = i6;
                    break;
                case 35:
                    i7 = i9;
                    X.n(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case Build.API_LEVELS.API_36 /* 36 */:
                    i7 = i9;
                    X.r(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case 37:
                    i7 = i9;
                    X.t(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case C0583e9.f11751K /* 38 */:
                    i7 = i9;
                    X.z(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case 39:
                    i7 = i9;
                    X.s(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case C0583e9.L /* 40 */:
                    i7 = i9;
                    X.q(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case 41:
                    i7 = i9;
                    X.p(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case C0583e9.f11752M /* 42 */:
                    i7 = i9;
                    X.m(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case 43:
                    i7 = i9;
                    X.y(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case 44:
                    i7 = i9;
                    X.o(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case 45:
                    i7 = i9;
                    X.u(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case 46:
                    i7 = i9;
                    X.v(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case 47:
                    i7 = i9;
                    X.w(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case 48:
                    i7 = i9;
                    X.x(iArr[i10], (List) unsafe.getObject(obj, j4), f4, true);
                    i9 = i7;
                    break;
                case 49:
                    i7 = i9;
                    int i22 = iArr[i10];
                    List list4 = (List) unsafe.getObject(obj, j4);
                    W l5 = n4.l(i10);
                    Class cls4 = X.f4601a;
                    if (list4 != null && !list4.isEmpty()) {
                        f4.getClass();
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            f4.a(i22, list4.get(i23), l5);
                        }
                    }
                    i9 = i7;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j4);
                    if (object2 != null) {
                        int i24 = 2;
                        Object obj2 = n4.f4574b[(i10 / 3) * 2];
                        n4.f4585m.getClass();
                        G g4 = ((H) obj2).f4566a;
                        C0180m c0180m3 = (C0180m) f4.f4562a;
                        c0180m3.getClass();
                        for (Map.Entry entry : ((I) object2).entrySet()) {
                            c0180m3.t0(i12, i24);
                            c0180m3.v0(H.a(g4, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            r.b(c0180m3, g4.f4563a, 1, key);
                            i24 = 2;
                            r.b(c0180m3, g4.f4564b, 2, value);
                            i9 = i9;
                        }
                    }
                    i7 = i9;
                    i9 = i7;
                    break;
                case 51:
                    if (n4.p(i12, i10, obj)) {
                        double doubleValue = ((Double) j0.f4660c.h(j4, obj)).doubleValue();
                        C0180m c0180m4 = (C0180m) f4.f4562a;
                        c0180m4.getClass();
                        c0180m4.m0(i12, Double.doubleToRawLongBits(doubleValue));
                    }
                    break;
                case 52:
                    if (n4.p(i12, i10, obj)) {
                        float floatValue = ((Float) j0.f4660c.h(j4, obj)).floatValue();
                        C0180m c0180m5 = (C0180m) f4.f4562a;
                        c0180m5.getClass();
                        c0180m5.k0(i12, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).w0(i12, y(j4, obj));
                    }
                    break;
                case 54:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).w0(i12, y(j4, obj));
                    }
                    break;
                case 55:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).o0(i12, x(j4, obj));
                    }
                    break;
                case 56:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).m0(i12, y(j4, obj));
                    }
                    break;
                case 57:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).k0(i12, x(j4, obj));
                    }
                    break;
                case 58:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).h0(i12, ((Boolean) j0.f4660c.h(j4, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (n4.p(i12, i10, obj)) {
                        Object object3 = unsafe.getObject(obj, j4);
                        if (object3 instanceof String) {
                            ((C0180m) f4.f4562a).r0(i12, (String) object3);
                        } else {
                            ((C0180m) f4.f4562a).i0(i12, (C0174g) object3);
                        }
                    }
                    break;
                case 60:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).q0(i12, (AbstractC0168a) unsafe.getObject(obj, j4), n4.l(i10));
                    }
                    break;
                case 61:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).i0(i12, (C0174g) unsafe.getObject(obj, j4));
                    }
                    break;
                case 62:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).u0(i12, x(j4, obj));
                    }
                    break;
                case 63:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).o0(i12, x(j4, obj));
                    }
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).k0(i12, x(j4, obj));
                    }
                    break;
                case 65:
                    if (n4.p(i12, i10, obj)) {
                        ((C0180m) f4.f4562a).m0(i12, y(j4, obj));
                    }
                    break;
                case 66:
                    if (n4.p(i12, i10, obj)) {
                        int x4 = x(j4, obj);
                        ((C0180m) f4.f4562a).u0(i12, (x4 >> 31) ^ (x4 << 1));
                    }
                    break;
                case 67:
                    if (n4.p(i12, i10, obj)) {
                        long y4 = y(j4, obj);
                        ((C0180m) f4.f4562a).w0(i12, (y4 << 1) ^ (y4 >> 63));
                    }
                    break;
                case 68:
                    if (n4.p(i12, i10, obj)) {
                        f4.a(i12, unsafe.getObject(obj, j4), n4.l(i10));
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
        }
        n4.f4584l.getClass();
        ((AbstractC0189w) obj).unknownFields.d(f4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.W
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!o(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.f4573a;
            if (i4 >= iArr.length) {
                X.k(this.f4584l, obj, obj2);
                return;
            }
            int K2 = K(i4);
            long j4 = 1048575 & K2;
            int i5 = iArr[i4];
            switch (J(K2)) {
                case 0:
                    if (m(i4, obj2)) {
                        i0 i0Var = j0.f4660c;
                        obj3 = obj;
                        i0Var.l(obj3, j4, i0Var.d(j4, obj2));
                        F(i4, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (m(i4, obj2)) {
                        i0 i0Var2 = j0.f4660c;
                        i0Var2.m(obj, j4, i0Var2.e(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m(i4, obj2)) {
                        j0.n(obj, j4, j0.f4660c.g(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m(i4, obj2)) {
                        j0.n(obj, j4, j0.f4660c.g(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m(i4, obj2)) {
                        j0.m(j4, obj, j0.f4660c.f(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m(i4, obj2)) {
                        j0.n(obj, j4, j0.f4660c.g(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m(i4, obj2)) {
                        j0.m(j4, obj, j0.f4660c.f(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m(i4, obj2)) {
                        i0 i0Var3 = j0.f4660c;
                        i0Var3.j(obj, j4, i0Var3.c(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m(i4, obj2)) {
                        j0.o(j4, obj, j0.f4660c.h(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    r(obj, i4, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m(i4, obj2)) {
                        j0.o(j4, obj, j0.f4660c.h(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m(i4, obj2)) {
                        j0.m(j4, obj, j0.f4660c.f(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m(i4, obj2)) {
                        j0.m(j4, obj, j0.f4660c.f(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m(i4, obj2)) {
                        j0.m(j4, obj, j0.f4660c.f(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m(i4, obj2)) {
                        j0.n(obj, j4, j0.f4660c.g(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m(i4, obj2)) {
                        j0.m(j4, obj, j0.f4660c.f(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m(i4, obj2)) {
                        j0.n(obj, j4, j0.f4660c.g(j4, obj2));
                        F(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    r(obj, i4, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case C0583e9.f11743C /* 19 */:
                case C0583e9.f11744D /* 20 */:
                case 21:
                case Build.API_LEVELS.API_22 /* 22 */:
                case Build.API_LEVELS.API_23 /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case Build.API_LEVELS.API_28 /* 28 */:
                case 29:
                case Build.API_LEVELS.API_30 /* 30 */:
                case Build.API_LEVELS.API_31 /* 31 */:
                case Build.API_LEVELS.API_32 /* 32 */:
                case Build.API_LEVELS.API_33 /* 33 */:
                case Build.API_LEVELS.API_34 /* 34 */:
                case 35:
                case Build.API_LEVELS.API_36 /* 36 */:
                case 37:
                case C0583e9.f11751K /* 38 */:
                case 39:
                case C0583e9.L /* 40 */:
                case 41:
                case C0583e9.f11752M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f4583k.getClass();
                    i0 i0Var4 = j0.f4660c;
                    InterfaceC0190x interfaceC0190x = (InterfaceC0190x) i0Var4.h(j4, obj);
                    InterfaceC0190x interfaceC0190x2 = (InterfaceC0190x) i0Var4.h(j4, obj2);
                    U u4 = (U) interfaceC0190x;
                    int i6 = u4.f4596c;
                    int i7 = ((U) interfaceC0190x2).f4596c;
                    if (i6 > 0 && i7 > 0) {
                        if (!((AbstractC0169b) interfaceC0190x).f4617a) {
                            interfaceC0190x = u4.d(i7 + i6);
                        }
                        ((AbstractC0169b) interfaceC0190x).addAll(interfaceC0190x2);
                    }
                    if (i6 > 0) {
                        interfaceC0190x2 = interfaceC0190x;
                    }
                    j0.o(j4, obj, interfaceC0190x2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = X.f4601a;
                    i0 i0Var5 = j0.f4660c;
                    Object h2 = i0Var5.h(j4, obj);
                    Object h4 = i0Var5.h(j4, obj2);
                    this.f4585m.getClass();
                    j0.o(j4, obj, J.a(h2, h4));
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
                    if (p(i5, i4, obj2)) {
                        j0.o(j4, obj, j0.f4660c.h(j4, obj2));
                        G(i5, i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    s(obj, i4, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (p(i5, i4, obj2)) {
                        j0.o(j4, obj, j0.f4660c.h(j4, obj2));
                        G(i5, i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    s(obj, i4, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i4 += 3;
            obj = obj3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void b(Object obj, F f4) {
        f4.getClass();
        L(obj, f4);
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final void c(Object obj) {
        if (o(obj)) {
            if (obj instanceof AbstractC0189w) {
                AbstractC0189w abstractC0189w = (AbstractC0189w) obj;
                abstractC0189w.k(Integer.MAX_VALUE);
                abstractC0189w.memoizedHashCode = 0;
                abstractC0189w.h();
            }
            int[] iArr = this.f4573a;
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int K2 = K(i4);
                long j4 = 1048575 & K2;
                int J4 = J(K2);
                if (J4 != 9) {
                    if (J4 != 60 && J4 != 68) {
                        switch (J4) {
                            case 18:
                            case C0583e9.f11743C /* 19 */:
                            case C0583e9.f11744D /* 20 */:
                            case 21:
                            case Build.API_LEVELS.API_22 /* 22 */:
                            case Build.API_LEVELS.API_23 /* 23 */:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case Build.API_LEVELS.API_28 /* 28 */:
                            case 29:
                            case Build.API_LEVELS.API_30 /* 30 */:
                            case Build.API_LEVELS.API_31 /* 31 */:
                            case Build.API_LEVELS.API_32 /* 32 */:
                            case Build.API_LEVELS.API_33 /* 33 */:
                            case Build.API_LEVELS.API_34 /* 34 */:
                            case 35:
                            case Build.API_LEVELS.API_36 /* 36 */:
                            case 37:
                            case C0583e9.f11751K /* 38 */:
                            case 39:
                            case C0583e9.L /* 40 */:
                            case 41:
                            case C0583e9.f11752M /* 42 */:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f4583k.getClass();
                                AbstractC0169b abstractC0169b = (AbstractC0169b) ((InterfaceC0190x) j0.f4660c.h(j4, obj));
                                if (abstractC0169b.f4617a) {
                                    abstractC0169b.f4617a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = o;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    this.f4585m.getClass();
                                    ((I) object).f4569a = false;
                                    unsafe.putObject(obj, j4, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (p(iArr[i4], i4, obj)) {
                        l(i4).c(o.getObject(obj, j4));
                    }
                }
                if (m(i4, obj)) {
                    l(i4).c(o.getObject(obj, j4));
                }
            }
            this.f4584l.getClass();
            d0 d0Var = ((AbstractC0189w) obj).unknownFields;
            if (d0Var.f4631e) {
                d0Var.f4631e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final boolean d(Object obj) {
        int i4;
        int i5;
        int i6;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (i9 < this.f4580h) {
            int i10 = this.f4579g[i9];
            int[] iArr = this.f4573a;
            int i11 = iArr[i10];
            int K2 = K(i10);
            int i12 = iArr[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i7) {
                if (i13 != 1048575) {
                    i8 = o.getInt(obj, i13);
                }
                i5 = i10;
                i6 = i8;
                i4 = i13;
            } else {
                int i15 = i8;
                i4 = i7;
                i5 = i10;
                i6 = i15;
            }
            if ((268435456 & K2) == 0 || n(obj, i5, i4, i6, i14)) {
                int J4 = J(K2);
                if (J4 == 9 || J4 == 17) {
                    if (n(obj, i5, i4, i6, i14)) {
                        if (!l(i5).d(j0.f4660c.h(K2 & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i9++;
                    i7 = i4;
                    i8 = i6;
                } else {
                    if (J4 != 27) {
                        if (J4 == 60 || J4 == 68) {
                            if (p(i11, i5, obj)) {
                                if (!l(i5).d(j0.f4660c.h(K2 & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i9++;
                            i7 = i4;
                            i8 = i6;
                        } else if (J4 != 49) {
                            if (J4 != 50) {
                                continue;
                            } else {
                                Object h2 = j0.f4660c.h(K2 & 1048575, obj);
                                this.f4585m.getClass();
                                I i16 = (I) h2;
                                if (i16.isEmpty()) {
                                    continue;
                                } else {
                                    if (((H) this.f4574b[(i5 / 3) * 2]).f4566a.f4564b.f4690a != s0.MESSAGE) {
                                        continue;
                                    } else {
                                        W w4 = null;
                                        for (Object obj2 : i16.values()) {
                                            if (w4 == null) {
                                                w4 = T.f4591c.a(obj2.getClass());
                                            }
                                            if (!w4.d(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i9++;
                            i7 = i4;
                            i8 = i6;
                        }
                    }
                    List list = (List) j0.f4660c.h(K2 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        W l4 = l(i5);
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            if (l4.d(list.get(i17))) {
                            }
                        }
                    }
                    i9++;
                    i7 = i4;
                    i8 = i6;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final int e(AbstractC0189w abstractC0189w) {
        int i4;
        int a02;
        int a03;
        int a04;
        int c02;
        int a05;
        int c03;
        int a06;
        int a07;
        int Y2;
        int a08;
        int a3;
        int c4;
        int a09;
        int size;
        int i5;
        int a010;
        int a011;
        int size2;
        int a012;
        int b02;
        int i6;
        int i7;
        int a013;
        int b03;
        N n4 = this;
        AbstractC0189w abstractC0189w2 = abstractC0189w;
        Unsafe unsafe = o;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = n4.f4573a;
            if (i9 >= iArr.length) {
                n4.f4584l.getClass();
                return abstractC0189w2.unknownFields.b() + i11;
            }
            int K2 = n4.K(i9);
            int J4 = J(K2);
            int i12 = iArr[i9];
            int i13 = iArr[i9 + 2];
            int i14 = i13 & 1048575;
            if (J4 <= 17) {
                if (i14 != i8) {
                    i10 = i14 == 1048575 ? 0 : unsafe.getInt(abstractC0189w2, i14);
                    i8 = i14;
                }
                i4 = 1 << (i13 >>> 20);
            } else {
                i4 = 0;
            }
            long j4 = K2 & 1048575;
            if (J4 >= EnumC0185s.f4692b.f4696a) {
                int i15 = EnumC0185s.f4693c.f4696a;
            }
            switch (J4) {
                case 0:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        a02 = C0180m.a0(i12);
                        c4 = a02 + 8;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        a03 = C0180m.a0(i12);
                        a07 = a03 + 4;
                        i11 += a07;
                    }
                    n4 = this;
                    abstractC0189w2 = abstractC0189w;
                    break;
                case 2:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        long j5 = unsafe.getLong(abstractC0189w2, j4);
                        a04 = C0180m.a0(i12);
                        c02 = C0180m.c0(j5);
                        i11 += c02 + a04;
                    }
                    n4 = this;
                    break;
                case 3:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        long j6 = unsafe.getLong(abstractC0189w2, j4);
                        a04 = C0180m.a0(i12);
                        c02 = C0180m.c0(j6);
                        i11 += c02 + a04;
                    }
                    n4 = this;
                    break;
                case 4:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        int i16 = unsafe.getInt(abstractC0189w2, j4);
                        a05 = C0180m.a0(i12);
                        c03 = C0180m.c0(i16);
                        Y2 = c03 + a05;
                        i11 += Y2;
                    }
                    n4 = this;
                    break;
                case 5:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        a06 = C0180m.a0(i12);
                        a07 = a06 + 8;
                        i11 += a07;
                    }
                    n4 = this;
                    abstractC0189w2 = abstractC0189w;
                    break;
                case 6:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        a03 = C0180m.a0(i12);
                        a07 = a03 + 4;
                        i11 += a07;
                    }
                    n4 = this;
                    abstractC0189w2 = abstractC0189w;
                    break;
                case 7:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        a07 = C0180m.a0(i12) + 1;
                        i11 += a07;
                    }
                    n4 = this;
                    abstractC0189w2 = abstractC0189w;
                    break;
                case 8:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        Object object = unsafe.getObject(abstractC0189w2, j4);
                        i11 = (object instanceof C0174g ? C0180m.Y(i12, (C0174g) object) : C0180m.Z((String) object) + C0180m.a0(i12)) + i11;
                    }
                    n4 = this;
                    break;
                case 9:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        Object object2 = unsafe.getObject(abstractC0189w2, j4);
                        W l4 = n4.l(i9);
                        Class cls = X.f4601a;
                        int a014 = C0180m.a0(i12);
                        int a4 = ((AbstractC0168a) object2).a(l4);
                        i11 += C0180m.b0(a4) + a4 + a014;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        Y2 = C0180m.Y(i12, (C0174g) unsafe.getObject(abstractC0189w2, j4));
                        i11 += Y2;
                    }
                    n4 = this;
                    break;
                case 11:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        int i17 = unsafe.getInt(abstractC0189w2, j4);
                        a05 = C0180m.a0(i12);
                        c03 = C0180m.b0(i17);
                        Y2 = c03 + a05;
                        i11 += Y2;
                    }
                    n4 = this;
                    break;
                case 12:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        int i18 = unsafe.getInt(abstractC0189w2, j4);
                        a05 = C0180m.a0(i12);
                        c03 = C0180m.c0(i18);
                        Y2 = c03 + a05;
                        i11 += Y2;
                    }
                    n4 = this;
                    break;
                case 13:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        a03 = C0180m.a0(i12);
                        a07 = a03 + 4;
                        i11 += a07;
                    }
                    n4 = this;
                    abstractC0189w2 = abstractC0189w;
                    break;
                case 14:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        a06 = C0180m.a0(i12);
                        a07 = a06 + 8;
                        i11 += a07;
                    }
                    n4 = this;
                    abstractC0189w2 = abstractC0189w;
                    break;
                case 15:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        int i19 = unsafe.getInt(abstractC0189w2, j4);
                        a05 = C0180m.a0(i12);
                        c03 = C0180m.b0((i19 >> 31) ^ (i19 << 1));
                        Y2 = c03 + a05;
                        i11 += Y2;
                    }
                    n4 = this;
                    break;
                case 16:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        long j7 = unsafe.getLong(abstractC0189w2, j4);
                        a04 = C0180m.a0(i12);
                        c02 = C0180m.c0((j7 << 1) ^ (j7 >> 63));
                        i11 += c02 + a04;
                    }
                    n4 = this;
                    break;
                case 17:
                    if (n4.n(abstractC0189w2, i9, i8, i10, i4)) {
                        AbstractC0168a abstractC0168a = (AbstractC0168a) unsafe.getObject(abstractC0189w2, j4);
                        W l5 = n4.l(i9);
                        a08 = C0180m.a0(i12) * 2;
                        a3 = abstractC0168a.a(l5);
                        c4 = a3 + a08;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c4 = X.c(i12, (List) unsafe.getObject(abstractC0189w2, j4));
                    i11 += c4;
                    break;
                case C0583e9.f11743C /* 19 */:
                    c4 = X.b(i12, (List) unsafe.getObject(abstractC0189w2, j4));
                    i11 += c4;
                    break;
                case C0583e9.f11744D /* 20 */:
                    List list = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls2 = X.f4601a;
                    if (list.size() != 0) {
                        a09 = (C0180m.a0(i12) * list.size()) + X.e(list);
                        i11 += a09;
                        break;
                    }
                    a09 = 0;
                    i11 += a09;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls3 = X.f4601a;
                    size = list2.size();
                    if (size != 0) {
                        i5 = X.i(list2);
                        a010 = C0180m.a0(i12);
                        a09 = (a010 * size) + i5;
                        i11 += a09;
                        break;
                    }
                    a09 = 0;
                    i11 += a09;
                case Build.API_LEVELS.API_22 /* 22 */:
                    List list3 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls4 = X.f4601a;
                    size = list3.size();
                    if (size != 0) {
                        i5 = X.d(list3);
                        a010 = C0180m.a0(i12);
                        a09 = (a010 * size) + i5;
                        i11 += a09;
                        break;
                    }
                    a09 = 0;
                    i11 += a09;
                case Build.API_LEVELS.API_23 /* 23 */:
                    c4 = X.c(i12, (List) unsafe.getObject(abstractC0189w2, j4));
                    i11 += c4;
                    break;
                case 24:
                    c4 = X.b(i12, (List) unsafe.getObject(abstractC0189w2, j4));
                    i11 += c4;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls5 = X.f4601a;
                    int size3 = list4.size();
                    i11 += size3 == 0 ? 0 : (C0180m.a0(i12) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls6 = X.f4601a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        a09 = C0180m.a0(i12) * size4;
                        for (int i20 = 0; i20 < size4; i20++) {
                            Object obj = list5.get(i20);
                            if (obj instanceof C0174g) {
                                int size5 = ((C0174g) obj).size();
                                a09 = C0180m.b0(size5) + size5 + a09;
                            } else {
                                a09 = C0180m.Z((String) obj) + a09;
                            }
                        }
                        i11 += a09;
                        break;
                    }
                    a09 = 0;
                    i11 += a09;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC0189w2, j4);
                    W l6 = n4.l(i9);
                    Class cls7 = X.f4601a;
                    int size6 = list6.size();
                    if (size6 != 0) {
                        a011 = C0180m.a0(i12) * size6;
                        for (int i21 = 0; i21 < size6; i21++) {
                            int a5 = ((AbstractC0168a) list6.get(i21)).a(l6);
                            a011 += C0180m.b0(a5) + a5;
                        }
                        i11 += a011;
                        break;
                    }
                    a011 = 0;
                    i11 += a011;
                case Build.API_LEVELS.API_28 /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls8 = X.f4601a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        a09 = C0180m.a0(i12) * size7;
                        for (int i22 = 0; i22 < list7.size(); i22++) {
                            int size8 = ((C0174g) list7.get(i22)).size();
                            a09 += C0180m.b0(size8) + size8;
                        }
                        i11 += a09;
                        break;
                    }
                    a09 = 0;
                    i11 += a09;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls9 = X.f4601a;
                    size = list8.size();
                    if (size != 0) {
                        i5 = X.h(list8);
                        a010 = C0180m.a0(i12);
                        a09 = (a010 * size) + i5;
                        i11 += a09;
                        break;
                    }
                    a09 = 0;
                    i11 += a09;
                case Build.API_LEVELS.API_30 /* 30 */:
                    List list9 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls10 = X.f4601a;
                    size = list9.size();
                    if (size != 0) {
                        i5 = X.a(list9);
                        a010 = C0180m.a0(i12);
                        a09 = (a010 * size) + i5;
                        i11 += a09;
                        break;
                    }
                    a09 = 0;
                    i11 += a09;
                case Build.API_LEVELS.API_31 /* 31 */:
                    c4 = X.b(i12, (List) unsafe.getObject(abstractC0189w2, j4));
                    i11 += c4;
                    break;
                case Build.API_LEVELS.API_32 /* 32 */:
                    c4 = X.c(i12, (List) unsafe.getObject(abstractC0189w2, j4));
                    i11 += c4;
                    break;
                case Build.API_LEVELS.API_33 /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls11 = X.f4601a;
                    size = list10.size();
                    if (size != 0) {
                        i5 = X.f(list10);
                        a010 = C0180m.a0(i12);
                        a09 = (a010 * size) + i5;
                        i11 += a09;
                        break;
                    }
                    a09 = 0;
                    i11 += a09;
                case Build.API_LEVELS.API_34 /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls12 = X.f4601a;
                    size = list11.size();
                    if (size != 0) {
                        i5 = X.g(list11);
                        a010 = C0180m.a0(i12);
                        a09 = (a010 * size) + i5;
                        i11 += a09;
                        break;
                    }
                    a09 = 0;
                    i11 += a09;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls13 = X.f4601a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case Build.API_LEVELS.API_36 /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls14 = X.f4601a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = X.e((List) unsafe.getObject(abstractC0189w2, j4));
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case C0583e9.f11751K /* 38 */:
                    size2 = X.i((List) unsafe.getObject(abstractC0189w2, j4));
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = X.d((List) unsafe.getObject(abstractC0189w2, j4));
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case C0583e9.L /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls15 = X.f4601a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls16 = X.f4601a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case C0583e9.f11752M /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls17 = X.f4601a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = X.h((List) unsafe.getObject(abstractC0189w2, j4));
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = X.a((List) unsafe.getObject(abstractC0189w2, j4));
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls18 = X.f4601a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0189w2, j4);
                    Class cls19 = X.f4601a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = X.f((List) unsafe.getObject(abstractC0189w2, j4));
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = X.g((List) unsafe.getObject(abstractC0189w2, j4));
                    if (size2 > 0) {
                        a012 = C0180m.a0(i12);
                        b02 = C0180m.b0(size2);
                        i6 = b02 + a012;
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0189w2, j4);
                    W l7 = n4.l(i9);
                    Class cls20 = X.f4601a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 0;
                        for (int i23 = 0; i23 < size9; i23++) {
                            i7 += ((AbstractC0168a) list19.get(i23)).a(l7) + (C0180m.a0(i12) * 2);
                        }
                    }
                    i11 += i7;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC0189w2, j4);
                    Object obj2 = n4.f4574b[(i9 / 3) * 2];
                    n4.f4585m.getClass();
                    I i24 = (I) object3;
                    H h2 = (H) obj2;
                    if (!i24.isEmpty()) {
                        a011 = 0;
                        for (Map.Entry entry : i24.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            h2.getClass();
                            int a015 = C0180m.a0(i12);
                            int a6 = H.a(h2.f4566a, key, value);
                            a011 += C0180m.b0(a6) + a6 + a015;
                        }
                        i11 += a011;
                        break;
                    }
                    a011 = 0;
                    i11 += a011;
                case 51:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        a02 = C0180m.a0(i12);
                        c4 = a02 + 8;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        a013 = C0180m.a0(i12);
                        c4 = a013 + 4;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        long y4 = y(j4, abstractC0189w2);
                        size2 = C0180m.a0(i12);
                        i6 = C0180m.c0(y4);
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        long y5 = y(j4, abstractC0189w2);
                        size2 = C0180m.a0(i12);
                        i6 = C0180m.c0(y5);
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        int x4 = x(j4, abstractC0189w2);
                        a08 = C0180m.a0(i12);
                        a3 = C0180m.c0(x4);
                        c4 = a3 + a08;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        a02 = C0180m.a0(i12);
                        c4 = a02 + 8;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        a013 = C0180m.a0(i12);
                        c4 = a013 + 4;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        c4 = C0180m.a0(i12) + 1;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        Object object4 = unsafe.getObject(abstractC0189w2, j4);
                        i11 = (object4 instanceof C0174g ? C0180m.Y(i12, (C0174g) object4) : C0180m.Z((String) object4) + C0180m.a0(i12)) + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        Object object5 = unsafe.getObject(abstractC0189w2, j4);
                        W l8 = n4.l(i9);
                        Class cls21 = X.f4601a;
                        int a016 = C0180m.a0(i12);
                        int a7 = ((AbstractC0168a) object5).a(l8);
                        b03 = C0180m.b0(a7) + a7 + a016;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        c4 = C0180m.Y(i12, (C0174g) unsafe.getObject(abstractC0189w2, j4));
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        int x5 = x(j4, abstractC0189w2);
                        a08 = C0180m.a0(i12);
                        a3 = C0180m.b0(x5);
                        c4 = a3 + a08;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        int x6 = x(j4, abstractC0189w2);
                        a08 = C0180m.a0(i12);
                        a3 = C0180m.c0(x6);
                        c4 = a3 + a08;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        a013 = C0180m.a0(i12);
                        c4 = a013 + 4;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        a02 = C0180m.a0(i12);
                        c4 = a02 + 8;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        int x7 = x(j4, abstractC0189w2);
                        a08 = C0180m.a0(i12);
                        a3 = C0180m.b0((x7 >> 31) ^ (x7 << 1));
                        c4 = a3 + a08;
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        long y6 = y(j4, abstractC0189w2);
                        size2 = C0180m.a0(i12);
                        i6 = C0180m.c0((y6 << 1) ^ (y6 >> 63));
                        b03 = i6 + size2;
                        i11 += b03;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (n4.p(i12, i9, abstractC0189w2)) {
                        c4 = ((AbstractC0168a) unsafe.getObject(abstractC0189w2, j4)).a(n4.l(i9)) + (C0180m.a0(i12) * 2);
                        i11 += c4;
                        break;
                    } else {
                        break;
                    }
            }
            i9 += 3;
        }
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
    public final int f(AbstractC0189w abstractC0189w) {
        int i4;
        int b4;
        int i5;
        int[] iArr = this.f4573a;
        int length = iArr.length;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int K2 = K(i7);
            int i8 = iArr[i7];
            long j4 = 1048575 & K2;
            int i9 = 1237;
            int i10 = 37;
            switch (J(K2)) {
                case 0:
                    i4 = i6 * 53;
                    b4 = AbstractC0191y.b(Double.doubleToLongBits(j0.f4660c.d(j4, abstractC0189w)));
                    i6 = b4 + i4;
                    break;
                case 1:
                    i4 = i6 * 53;
                    b4 = Float.floatToIntBits(j0.f4660c.e(j4, abstractC0189w));
                    i6 = b4 + i4;
                    break;
                case 2:
                    i4 = i6 * 53;
                    b4 = AbstractC0191y.b(j0.f4660c.g(j4, abstractC0189w));
                    i6 = b4 + i4;
                    break;
                case 3:
                    i4 = i6 * 53;
                    b4 = AbstractC0191y.b(j0.f4660c.g(j4, abstractC0189w));
                    i6 = b4 + i4;
                    break;
                case 4:
                    i4 = i6 * 53;
                    b4 = j0.f4660c.f(j4, abstractC0189w);
                    i6 = b4 + i4;
                    break;
                case 5:
                    i4 = i6 * 53;
                    b4 = AbstractC0191y.b(j0.f4660c.g(j4, abstractC0189w));
                    i6 = b4 + i4;
                    break;
                case 6:
                    i4 = i6 * 53;
                    b4 = j0.f4660c.f(j4, abstractC0189w);
                    i6 = b4 + i4;
                    break;
                case 7:
                    i5 = i6 * 53;
                    boolean c4 = j0.f4660c.c(j4, abstractC0189w);
                    Charset charset = AbstractC0191y.f4712a;
                    break;
                case 8:
                    i4 = i6 * 53;
                    b4 = ((String) j0.f4660c.h(j4, abstractC0189w)).hashCode();
                    i6 = b4 + i4;
                    break;
                case 9:
                    Object h2 = j0.f4660c.h(j4, abstractC0189w);
                    if (h2 != null) {
                        i10 = h2.hashCode();
                    }
                    i6 = (i6 * 53) + i10;
                    break;
                case 10:
                    i4 = i6 * 53;
                    b4 = j0.f4660c.h(j4, abstractC0189w).hashCode();
                    i6 = b4 + i4;
                    break;
                case 11:
                    i4 = i6 * 53;
                    b4 = j0.f4660c.f(j4, abstractC0189w);
                    i6 = b4 + i4;
                    break;
                case 12:
                    i4 = i6 * 53;
                    b4 = j0.f4660c.f(j4, abstractC0189w);
                    i6 = b4 + i4;
                    break;
                case 13:
                    i4 = i6 * 53;
                    b4 = j0.f4660c.f(j4, abstractC0189w);
                    i6 = b4 + i4;
                    break;
                case 14:
                    i4 = i6 * 53;
                    b4 = AbstractC0191y.b(j0.f4660c.g(j4, abstractC0189w));
                    i6 = b4 + i4;
                    break;
                case 15:
                    i4 = i6 * 53;
                    b4 = j0.f4660c.f(j4, abstractC0189w);
                    i6 = b4 + i4;
                    break;
                case 16:
                    i4 = i6 * 53;
                    b4 = AbstractC0191y.b(j0.f4660c.g(j4, abstractC0189w));
                    i6 = b4 + i4;
                    break;
                case 17:
                    Object h4 = j0.f4660c.h(j4, abstractC0189w);
                    if (h4 != null) {
                        i10 = h4.hashCode();
                    }
                    i6 = (i6 * 53) + i10;
                    break;
                case 18:
                case C0583e9.f11743C /* 19 */:
                case C0583e9.f11744D /* 20 */:
                case 21:
                case Build.API_LEVELS.API_22 /* 22 */:
                case Build.API_LEVELS.API_23 /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case Build.API_LEVELS.API_28 /* 28 */:
                case 29:
                case Build.API_LEVELS.API_30 /* 30 */:
                case Build.API_LEVELS.API_31 /* 31 */:
                case Build.API_LEVELS.API_32 /* 32 */:
                case Build.API_LEVELS.API_33 /* 33 */:
                case Build.API_LEVELS.API_34 /* 34 */:
                case 35:
                case Build.API_LEVELS.API_36 /* 36 */:
                case 37:
                case C0583e9.f11751K /* 38 */:
                case 39:
                case C0583e9.L /* 40 */:
                case 41:
                case C0583e9.f11752M /* 42 */:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i6 * 53;
                    b4 = j0.f4660c.h(j4, abstractC0189w).hashCode();
                    i6 = b4 + i4;
                    break;
                case 50:
                    i4 = i6 * 53;
                    b4 = j0.f4660c.h(j4, abstractC0189w).hashCode();
                    i6 = b4 + i4;
                    break;
                case 51:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = AbstractC0191y.b(Double.doubleToLongBits(((Double) j0.f4660c.h(j4, abstractC0189w)).doubleValue()));
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = Float.floatToIntBits(((Float) j0.f4660c.h(j4, abstractC0189w)).floatValue());
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = AbstractC0191y.b(y(j4, abstractC0189w));
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = AbstractC0191y.b(y(j4, abstractC0189w));
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = x(j4, abstractC0189w);
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = AbstractC0191y.b(y(j4, abstractC0189w));
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = x(j4, abstractC0189w);
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (p(i8, i7, abstractC0189w)) {
                        i5 = i6 * 53;
                        boolean booleanValue = ((Boolean) j0.f4660c.h(j4, abstractC0189w)).booleanValue();
                        Charset charset2 = AbstractC0191y.f4712a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = ((String) j0.f4660c.h(j4, abstractC0189w)).hashCode();
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = j0.f4660c.h(j4, abstractC0189w).hashCode();
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = j0.f4660c.h(j4, abstractC0189w).hashCode();
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = x(j4, abstractC0189w);
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = x(j4, abstractC0189w);
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = x(j4, abstractC0189w);
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = AbstractC0191y.b(y(j4, abstractC0189w));
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = x(j4, abstractC0189w);
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = AbstractC0191y.b(y(j4, abstractC0189w));
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (p(i8, i7, abstractC0189w)) {
                        i4 = i6 * 53;
                        b4 = j0.f4660c.h(j4, abstractC0189w).hashCode();
                        i6 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f4584l.getClass();
        return abstractC0189w.unknownFields.hashCode() + (i6 * 53);
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
    public final boolean g(AbstractC0189w abstractC0189w, AbstractC0189w abstractC0189w2) {
        int[] iArr = this.f4573a;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i4 < length) {
                int K2 = K(i4);
                long j4 = K2 & 1048575;
                switch (J(K2)) {
                    case 0:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var2 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var3 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var4 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var5 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var6 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var7 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var8 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var9 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var10 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var11 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var12 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var13 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var14 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var15 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var16 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var17 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (i(abstractC0189w, abstractC0189w2, i4)) {
                            i0 i0Var18 = j0.f4660c;
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case C0583e9.f11743C /* 19 */:
                    case C0583e9.f11744D /* 20 */:
                    case 21:
                    case Build.API_LEVELS.API_22 /* 22 */:
                    case Build.API_LEVELS.API_23 /* 23 */:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case Build.API_LEVELS.API_28 /* 28 */:
                    case 29:
                    case Build.API_LEVELS.API_30 /* 30 */:
                    case Build.API_LEVELS.API_31 /* 31 */:
                    case Build.API_LEVELS.API_32 /* 32 */:
                    case Build.API_LEVELS.API_33 /* 33 */:
                    case Build.API_LEVELS.API_34 /* 34 */:
                    case 35:
                    case Build.API_LEVELS.API_36 /* 36 */:
                    case 37:
                    case C0583e9.f11751K /* 38 */:
                    case 39:
                    case C0583e9.L /* 40 */:
                    case 41:
                    case C0583e9.f11752M /* 42 */:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i0 i0Var19 = j0.f4660c;
                        z = X.l(i0Var19.h(j4, abstractC0189w), i0Var19.h(j4, abstractC0189w2));
                        break;
                    case 50:
                        i0 i0Var20 = j0.f4660c;
                        z = X.l(i0Var20.h(j4, abstractC0189w), i0Var20.h(j4, abstractC0189w2));
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
                    case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j5 = iArr[i4 + 2] & 1048575;
                        i0 i0Var21 = j0.f4660c;
                        if (i0Var21.f(j5, abstractC0189w) == i0Var21.f(j5, abstractC0189w2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i4 += 3;
                }
            } else {
                this.f4584l.getClass();
                if (abstractC0189w.unknownFields.equals(abstractC0189w2.unknownFields)) {
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
    public final void h(java.lang.Object r19, androidx.datastore.preferences.protobuf.C0178k r20, androidx.datastore.preferences.protobuf.C0182o r21) {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.N.h(java.lang.Object, androidx.datastore.preferences.protobuf.k, androidx.datastore.preferences.protobuf.o):void");
    }

    public final boolean i(AbstractC0189w abstractC0189w, AbstractC0189w abstractC0189w2, int i4) {
        return m(i4, abstractC0189w) == m(i4, abstractC0189w2);
    }

    public final void j(Object obj, int i4, Object obj2) {
        int i5 = this.f4573a[i4];
        if (j0.f4660c.h(K(i4) & 1048575, obj) == null) {
            return;
        }
        k(i4);
    }

    public final void k(int i4) {
        if (this.f4574b[((i4 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final W l(int i4) {
        int i5 = (i4 / 3) * 2;
        Object[] objArr = this.f4574b;
        W w4 = (W) objArr[i5];
        if (w4 != null) {
            return w4;
        }
        W a3 = T.f4591c.a((Class) objArr[i5 + 1]);
        objArr[i5] = a3;
        return a3;
    }

    public final boolean m(int i4, Object obj) {
        int i5 = this.f4573a[i4 + 2];
        long j4 = i5 & 1048575;
        if (j4 == 1048575) {
            int K2 = K(i4);
            long j5 = K2 & 1048575;
            switch (J(K2)) {
                case 0:
                    if (Double.doubleToRawLongBits(j0.f4660c.d(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(j0.f4660c.e(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (j0.f4660c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (j0.f4660c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (j0.f4660c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (j0.f4660c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (j0.f4660c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return j0.f4660c.c(j5, obj);
                case 8:
                    Object h2 = j0.f4660c.h(j5, obj);
                    if (h2 instanceof String) {
                        return !((String) h2).isEmpty();
                    }
                    if (h2 instanceof C0174g) {
                        return !C0174g.f4635c.equals(h2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (j0.f4660c.h(j5, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0174g.f4635c.equals(j0.f4660c.h(j5, obj));
                case 11:
                    if (j0.f4660c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (j0.f4660c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (j0.f4660c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (j0.f4660c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (j0.f4660c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (j0.f4660c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (j0.f4660c.h(j5, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & j0.f4660c.f(j4, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean n(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? m(i4, obj) : (i6 & i7) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.W
    public final AbstractC0189w newInstance() {
        this.f4582j.getClass();
        return ((AbstractC0189w) this.f4577e).i();
    }

    public final boolean p(int i4, int i5, Object obj) {
        return j0.f4660c.f((long) (this.f4573a[i5 + 2] & 1048575), obj) == i4;
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
    public final void q(Object obj, int i4, Object obj2, C0182o c0182o, C0178k c0178k) {
        long K2 = K(i4) & 1048575;
        Object h2 = j0.f4660c.h(K2, obj);
        J j4 = this.f4585m;
        if (h2 == null) {
            j4.getClass();
            h2 = I.f4568b.b();
            j0.o(K2, obj, h2);
        } else {
            j4.getClass();
            if (!((I) h2).f4569a) {
                I b4 = I.f4568b.b();
                J.a(b4, h2);
                j0.o(K2, obj, b4);
                h2 = b4;
            }
        }
        j4.getClass();
        I i5 = (I) h2;
        G g4 = ((H) obj2).f4566a;
        c0178k.x(2);
        AbstractC0177j abstractC0177j = (AbstractC0177j) c0178k.f4668d;
        int e4 = abstractC0177j.e(abstractC0177j.v());
        Object obj3 = g4.f4565c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int b5 = c0178k.b();
                if (b5 == Integer.MAX_VALUE || abstractC0177j.c()) {
                    break;
                }
                if (b5 == 1) {
                    obj4 = c0178k.j(g4.f4563a, null, null);
                } else if (b5 != 2) {
                    try {
                        if (!c0178k.y()) {
                            throw new A("Unable to parse map entry.");
                        }
                    } catch (C0192z unused) {
                        if (!c0178k.y()) {
                            throw new A("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = c0178k.j(g4.f4564b, obj3.getClass(), c0182o);
                }
            } catch (Throwable th) {
                abstractC0177j.d(e4);
                throw th;
            }
        }
    }

    public final void r(Object obj, int i4, Object obj2) {
        if (m(i4, obj2)) {
            long K2 = K(i4) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, K2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4573a[i4] + " is present but null: " + obj2);
            }
            W l4 = l(i4);
            if (!m(i4, obj)) {
                if (o(object)) {
                    AbstractC0189w newInstance = l4.newInstance();
                    l4.a(newInstance, object);
                    unsafe.putObject(obj, K2, newInstance);
                } else {
                    unsafe.putObject(obj, K2, object);
                }
                F(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, K2);
            if (!o(object2)) {
                AbstractC0189w newInstance2 = l4.newInstance();
                l4.a(newInstance2, object2);
                unsafe.putObject(obj, K2, newInstance2);
                object2 = newInstance2;
            }
            l4.a(object2, object);
        }
    }

    public final void s(Object obj, int i4, Object obj2) {
        int[] iArr = this.f4573a;
        int i5 = iArr[i4];
        if (p(i5, i4, obj2)) {
            long K2 = K(i4) & 1048575;
            Unsafe unsafe = o;
            Object object = unsafe.getObject(obj2, K2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2);
            }
            W l4 = l(i4);
            if (!p(i5, i4, obj)) {
                if (o(object)) {
                    AbstractC0189w newInstance = l4.newInstance();
                    l4.a(newInstance, object);
                    unsafe.putObject(obj, K2, newInstance);
                } else {
                    unsafe.putObject(obj, K2, object);
                }
                G(i5, i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, K2);
            if (!o(object2)) {
                AbstractC0189w newInstance2 = l4.newInstance();
                l4.a(newInstance2, object2);
                unsafe.putObject(obj, K2, newInstance2);
                object2 = newInstance2;
            }
            l4.a(object2, object);
        }
    }

    public final Object t(int i4, Object obj) {
        W l4 = l(i4);
        long K2 = K(i4) & 1048575;
        if (!m(i4, obj)) {
            return l4.newInstance();
        }
        Object object = o.getObject(obj, K2);
        if (o(object)) {
            return object;
        }
        AbstractC0189w newInstance = l4.newInstance();
        if (object != null) {
            l4.a(newInstance, object);
        }
        return newInstance;
    }

    public final Object u(int i4, int i5, Object obj) {
        W l4 = l(i5);
        if (!p(i4, i5, obj)) {
            return l4.newInstance();
        }
        Object object = o.getObject(obj, K(i5) & 1048575);
        if (o(object)) {
            return object;
        }
        AbstractC0189w newInstance = l4.newInstance();
        if (object != null) {
            l4.a(newInstance, object);
        }
        return newInstance;
    }

    public final int z(int i4) {
        if (i4 >= this.f4575c && i4 <= this.f4576d) {
            int[] iArr = this.f4573a;
            int length = (iArr.length / 3) - 1;
            int i5 = 0;
            while (i5 <= length) {
                int i6 = (length + i5) >>> 1;
                int i7 = i6 * 3;
                int i8 = iArr[i7];
                if (i4 == i8) {
                    return i7;
                }
                if (i4 < i8) {
                    length = i6 - 1;
                } else {
                    i5 = i6 + 1;
                }
            }
        }
        return -1;
    }
}
