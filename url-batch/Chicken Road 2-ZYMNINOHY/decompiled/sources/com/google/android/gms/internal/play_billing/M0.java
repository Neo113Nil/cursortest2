package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import androidx.datastore.preferences.protobuf.C0179l;
import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class M0 implements S0 {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f5876j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f5877k = AbstractC0303b1.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5878a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5879b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5880c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5881d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0320h0 f5882e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f5883f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5884g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5885h;

    /* renamed from: i, reason: collision with root package name */
    public final C0349u0 f5886i;

    public M0(int[] iArr, Object[] objArr, int i4, int i5, AbstractC0320h0 abstractC0320h0, int[] iArr2, int i6, int i7, C0349u0 c0349u0, C0349u0 c0349u02) {
        this.f5878a = iArr;
        this.f5879b = objArr;
        this.f5880c = i4;
        this.f5881d = i5;
        this.f5883f = iArr2;
        this.f5884g = i6;
        this.f5885h = i7;
        this.f5886i = c0349u0;
        this.f5882e = abstractC0320h0;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e4) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e4);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0353w0) {
            return ((AbstractC0353w0) obj).m();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static M0 u(R0 r02, C0349u0 c0349u0, C0349u0 c0349u02) {
        int i4;
        int charAt;
        int i5;
        int[] iArr;
        int i6;
        int i7;
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
        Object[] objArr;
        int i21;
        Class<?> cls;
        int objectFieldOffset;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Field E4;
        char charAt10;
        int i28;
        int i29;
        int i30;
        int i31;
        Object obj;
        Field E5;
        Object obj2;
        Field E6;
        int i32;
        char charAt11;
        int i33;
        char charAt12;
        int i34;
        char charAt13;
        int i35;
        char charAt14;
        if (!(r02 instanceof R0)) {
            r02.getClass();
            throw new ClassCastException();
        }
        String str = r02.f5905b;
        int length = str.length();
        int i36 = 55296;
        if (str.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i4 = i37 + 1;
                if (str.charAt(i37) < 55296) {
                    break;
                }
                i37 = i4;
            }
        } else {
            i4 = 1;
        }
        int i38 = i4 + 1;
        int charAt15 = str.charAt(i4);
        if (charAt15 >= 55296) {
            int i39 = charAt15 & 8191;
            int i40 = 13;
            while (true) {
                i35 = i38 + 1;
                charAt14 = str.charAt(i38);
                if (charAt14 < 55296) {
                    break;
                }
                i39 |= (charAt14 & 8191) << i40;
                i40 += 13;
                i38 = i35;
            }
            charAt15 = i39 | (charAt14 << i40);
            i38 = i35;
        }
        if (charAt15 == 0) {
            i7 = 0;
            i9 = 0;
            charAt = 0;
            i6 = 0;
            i8 = 0;
            i10 = 0;
            iArr = f5876j;
            i5 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt16 = str.charAt(i38);
            if (charAt16 >= 55296) {
                int i42 = charAt16 & 8191;
                int i43 = 13;
                while (true) {
                    i18 = i41 + 1;
                    charAt9 = str.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i18;
                }
                charAt16 = i42 | (charAt9 << i43);
                i41 = i18;
            }
            int i44 = i41 + 1;
            int charAt17 = str.charAt(i41);
            if (charAt17 >= 55296) {
                int i45 = charAt17 & 8191;
                int i46 = 13;
                while (true) {
                    i17 = i44 + 1;
                    charAt8 = str.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i17;
                }
                charAt17 = i45 | (charAt8 << i46);
                i44 = i17;
            }
            int i47 = i44 + 1;
            int charAt18 = str.charAt(i44);
            if (charAt18 >= 55296) {
                int i48 = charAt18 & 8191;
                int i49 = 13;
                while (true) {
                    i16 = i47 + 1;
                    charAt7 = str.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i16;
                }
                charAt18 = i48 | (charAt7 << i49);
                i47 = i16;
            }
            int i50 = i47 + 1;
            int charAt19 = str.charAt(i47);
            if (charAt19 >= 55296) {
                int i51 = charAt19 & 8191;
                int i52 = 13;
                while (true) {
                    i15 = i50 + 1;
                    charAt6 = str.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i15;
                }
                charAt19 = i51 | (charAt6 << i52);
                i50 = i15;
            }
            int i53 = i50 + 1;
            charAt = str.charAt(i50);
            if (charAt >= 55296) {
                int i54 = charAt & 8191;
                int i55 = 13;
                while (true) {
                    i14 = i53 + 1;
                    charAt5 = str.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i14;
                }
                charAt = i54 | (charAt5 << i55);
                i53 = i14;
            }
            int i56 = i53 + 1;
            int charAt20 = str.charAt(i53);
            if (charAt20 >= 55296) {
                int i57 = charAt20 & 8191;
                int i58 = 13;
                while (true) {
                    i13 = i56 + 1;
                    charAt4 = str.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i13;
                }
                charAt20 = i57 | (charAt4 << i58);
                i56 = i13;
            }
            int i59 = i56 + 1;
            int charAt21 = str.charAt(i56);
            if (charAt21 >= 55296) {
                int i60 = charAt21 & 8191;
                int i61 = 13;
                while (true) {
                    i12 = i59 + 1;
                    charAt3 = str.charAt(i59);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i60 |= (charAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i12;
                }
                charAt21 = i60 | (charAt3 << i61);
                i59 = i12;
            }
            int i62 = i59 + 1;
            int charAt22 = str.charAt(i59);
            if (charAt22 >= 55296) {
                int i63 = charAt22 & 8191;
                int i64 = 13;
                while (true) {
                    i11 = i62 + 1;
                    charAt2 = str.charAt(i62);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i63 |= (charAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i11;
                }
                charAt22 = i63 | (charAt2 << i64);
                i62 = i11;
            }
            int i65 = charAt16 + charAt16 + charAt17;
            i5 = charAt16;
            i38 = i62;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i66 = charAt20;
            i6 = charAt18;
            i7 = i66;
            i8 = charAt19;
            i9 = i65;
            i10 = charAt22;
        }
        Unsafe unsafe = f5877k;
        Object[] objArr2 = r02.f5906c;
        Class<?> cls2 = r02.f5904a.getClass();
        int i67 = i10 + i7;
        int i68 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i68];
        int i69 = i67;
        int i70 = i10;
        int i71 = 0;
        int i72 = 0;
        while (i38 < length) {
            int i73 = i38 + 1;
            int charAt23 = str.charAt(i38);
            if (charAt23 >= i36) {
                int i74 = charAt23 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i34 = i75 + 1;
                    charAt13 = str.charAt(i75);
                    i19 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i74 |= (charAt13 & 8191) << i76;
                    i76 += 13;
                    i75 = i34;
                    length = i19;
                }
                charAt23 = i74 | (charAt13 << i76);
                i20 = i34;
            } else {
                i19 = length;
                i20 = i73;
            }
            int i77 = i20 + 1;
            int charAt24 = str.charAt(i20);
            Object[] objArr4 = objArr2;
            char c4 = 55296;
            if (charAt24 >= 55296) {
                int i78 = charAt24 & 8191;
                int i79 = 13;
                while (true) {
                    i33 = i77 + 1;
                    charAt12 = str.charAt(i77);
                    if (charAt12 < c4) {
                        break;
                    }
                    i78 |= (charAt12 & 8191) << i79;
                    i79 += 13;
                    i77 = i33;
                    c4 = 55296;
                }
                charAt24 = i78 | (charAt12 << i79);
                i77 = i33;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i80 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int i81 = charAt23;
            int i82 = charAt24 & 2048;
            if (i80 >= 51) {
                int i83 = i77 + 1;
                int charAt25 = str.charAt(i77);
                char c5 = 55296;
                if (charAt25 >= 55296) {
                    int i84 = charAt25 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i32 = i85 + 1;
                        charAt11 = str.charAt(i85);
                        if (charAt11 < c5) {
                            break;
                        }
                        i84 |= (charAt11 & 8191) << i86;
                        i86 += 13;
                        i85 = i32;
                        c5 = 55296;
                    }
                    charAt25 = i84 | (charAt11 << i86);
                    i29 = i32;
                } else {
                    i29 = i83;
                }
                int i87 = i29;
                int i88 = i80 - 51;
                int i89 = charAt25;
                if (i88 == 9 || i88 == 17) {
                    i30 = i9 + 1;
                    int i90 = i72 / 3;
                    objArr3[i90 + i90 + 1] = objArr4[i9];
                } else {
                    if (i88 == 12) {
                        if (r02.a() == 1 || i82 != 0) {
                            i30 = i9 + 1;
                            int i91 = i72 / 3;
                            objArr3[i91 + i91 + 1] = objArr4[i9];
                        } else {
                            i31 = 0;
                            int i92 = i89 + i89;
                            i82 = i31;
                            obj = objArr4[i92];
                            if (obj instanceof Field) {
                                E5 = (Field) obj;
                            } else {
                                E5 = E(cls2, (String) obj);
                                objArr4[i92] = E5;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(E5);
                            int i93 = i92 + 1;
                            obj2 = objArr4[i93];
                            if (obj2 instanceof Field) {
                                E6 = (Field) obj2;
                            } else {
                                E6 = E(cls2, (String) obj2);
                                objArr4[i93] = E6;
                            }
                            i24 = i87;
                            i27 = objectFieldOffset2;
                            i23 = 55296;
                            objArr = objArr3;
                            i21 = i5;
                            cls = cls2;
                            i26 = 0;
                            i22 = (int) unsafe.objectFieldOffset(E6);
                        }
                    }
                    i31 = i82;
                    int i922 = i89 + i89;
                    i82 = i31;
                    obj = objArr4[i922];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(E5);
                    int i932 = i922 + 1;
                    obj2 = objArr4[i932];
                    if (obj2 instanceof Field) {
                    }
                    i24 = i87;
                    i27 = objectFieldOffset22;
                    i23 = 55296;
                    objArr = objArr3;
                    i21 = i5;
                    cls = cls2;
                    i26 = 0;
                    i22 = (int) unsafe.objectFieldOffset(E6);
                }
                i9 = i30;
                i31 = i82;
                int i9222 = i89 + i89;
                i82 = i31;
                obj = objArr4[i9222];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(E5);
                int i9322 = i9222 + 1;
                obj2 = objArr4[i9322];
                if (obj2 instanceof Field) {
                }
                i24 = i87;
                i27 = objectFieldOffset222;
                i23 = 55296;
                objArr = objArr3;
                i21 = i5;
                cls = cls2;
                i26 = 0;
                i22 = (int) unsafe.objectFieldOffset(E6);
            } else {
                int i94 = i9 + 1;
                Field E7 = E(cls2, (String) objArr4[i9]);
                objArr = objArr3;
                if (i80 == 9 || i80 == 17) {
                    i21 = i5;
                    int i95 = i72 / 3;
                    objArr[i95 + i95 + 1] = E7.getType();
                } else {
                    if (i80 == 27) {
                        i21 = i5;
                        i28 = 1;
                        i9 += 2;
                    } else if (i80 == 49) {
                        i9 += 2;
                        i21 = i5;
                        i28 = 1;
                    } else {
                        if (i80 == 12 || i80 == 30 || i80 == 44) {
                            i21 = i5;
                            if (r02.a() == 1 || i82 != 0) {
                                i9 += 2;
                                int i96 = i72 / 3;
                                objArr[i96 + i96 + 1] = objArr4[i94];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i9 = i94;
                                i82 = 0;
                            }
                        } else if (i80 == 50) {
                            int i97 = i9 + 2;
                            int i98 = i70 + 1;
                            iArr[i70] = i72;
                            int i99 = i72 / 3;
                            int i100 = i99 + i99;
                            objArr[i100] = objArr4[i94];
                            if (i82 != 0) {
                                i9 += 3;
                                objArr[i100 + 1] = objArr4[i97];
                                cls = cls2;
                                i70 = i98;
                            } else {
                                i9 = i97;
                                cls = cls2;
                                i70 = i98;
                                i82 = 0;
                            }
                            i21 = i5;
                        } else {
                            i21 = i5;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(E7);
                        i22 = 1048575;
                        if ((charAt24 & 4096) != 0 || i80 > 17) {
                            i23 = 55296;
                            i24 = i77;
                            i25 = 0;
                        } else {
                            int i101 = i77 + 1;
                            int charAt26 = str.charAt(i77);
                            if (charAt26 >= 55296) {
                                int i102 = charAt26 & 8191;
                                int i103 = 13;
                                while (true) {
                                    i24 = i101 + 1;
                                    charAt10 = str.charAt(i101);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i102 |= (charAt10 & 8191) << i103;
                                    i103 += 13;
                                    i101 = i24;
                                }
                                charAt26 = i102 | (charAt10 << i103);
                            } else {
                                i24 = i101;
                            }
                            int i104 = (charAt26 / 32) + i21 + i21;
                            Object obj3 = objArr4[i104];
                            if (obj3 instanceof Field) {
                                E4 = (Field) obj3;
                            } else {
                                E4 = E(cls, (String) obj3);
                                objArr4[i104] = E4;
                            }
                            i25 = charAt26 % 32;
                            i22 = (int) unsafe.objectFieldOffset(E4);
                            i23 = 55296;
                        }
                        if (i80 >= 18 && i80 <= 49) {
                            iArr[i69] = objectFieldOffset;
                            i69++;
                        }
                        i26 = i25;
                        i27 = objectFieldOffset;
                    }
                    int i105 = i72 / 3;
                    objArr[i105 + i105 + i28] = objArr4[i94];
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(E7);
                    i22 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i23 = 55296;
                    i24 = i77;
                    i25 = 0;
                    if (i80 >= 18) {
                        iArr[i69] = objectFieldOffset;
                        i69++;
                    }
                    i26 = i25;
                    i27 = objectFieldOffset;
                }
                cls = cls2;
                i9 = i94;
                objectFieldOffset = (int) unsafe.objectFieldOffset(E7);
                i22 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i23 = 55296;
                i24 = i77;
                i25 = 0;
                if (i80 >= 18) {
                }
                i26 = i25;
                i27 = objectFieldOffset;
            }
            int i106 = i82;
            int i107 = i72 + 1;
            iArr2[i72] = i81;
            int i108 = i72 + 2;
            String str2 = str;
            iArr2[i107] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i106 != 0 ? Integer.MIN_VALUE : 0) | (i80 << 20) | i27;
            i72 += 3;
            iArr2[i108] = (i26 << 20) | i22;
            cls2 = cls;
            objArr2 = objArr4;
            i36 = i23;
            length = i19;
            objArr3 = objArr;
            i5 = i21;
            i38 = i24;
            str = str2;
        }
        return new M0(iArr2, objArr3, i6, i8, r02.f5904a, iArr, i10, i67, c0349u0, c0349u02);
    }

    public static int v(long j4, Object obj) {
        return ((Integer) AbstractC0303b1.h(j4, obj)).intValue();
    }

    public static int x(int i4) {
        return (i4 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static long z(long j4, Object obj) {
        return ((Long) AbstractC0303b1.h(j4, obj)).longValue();
    }

    public final InterfaceC0357y0 A(int i4) {
        int i5 = i4 / 3;
        return (InterfaceC0357y0) this.f5879b[i5 + i5 + 1];
    }

    public final S0 B(int i4) {
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        Object[] objArr = this.f5879b;
        S0 s02 = (S0) objArr[i6];
        if (s02 != null) {
            return s02;
        }
        S0 a3 = P0.f5897c.a((Class) objArr[i6 + 1]);
        objArr[i6] = a3;
        return a3;
    }

    public final Object C(int i4, Object obj) {
        S0 B4 = B(i4);
        int y4 = y(i4) & 1048575;
        if (!p(i4, obj)) {
            return B4.f();
        }
        Object object = f5877k.getObject(obj, y4);
        if (r(object)) {
            return object;
        }
        AbstractC0353w0 f4 = B4.f();
        if (object != null) {
            B4.d(f4, object);
        }
        return f4;
    }

    public final Object D(int i4, int i5, Object obj) {
        S0 B4 = B(i5);
        if (!s(i4, i5, obj)) {
            return B4.f();
        }
        Object object = f5877k.getObject(obj, y(i5) & 1048575);
        if (r(object)) {
            return object;
        }
        AbstractC0353w0 f4 = B4.f();
        if (object != null) {
            B4.d(f4, object);
        }
        return f4;
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void a(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof AbstractC0353w0) {
            AbstractC0353w0 abstractC0353w0 = (AbstractC0353w0) obj;
            abstractC0353w0.l();
            abstractC0353w0.zza = 0;
            abstractC0353w0.j();
        }
        int i4 = 0;
        while (true) {
            int[] iArr = this.f5878a;
            if (i4 >= iArr.length) {
                this.f5886i.getClass();
                W0 w02 = ((AbstractC0353w0) obj).zzc;
                if (w02.f5927e) {
                    w02.f5927e = false;
                    return;
                }
                return;
            }
            int y4 = y(i4);
            int i5 = 1048575 & y4;
            int x4 = x(y4);
            long j4 = i5;
            if (x4 != 9) {
                if (x4 != 60 && x4 != 68) {
                    switch (x4) {
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
                            AbstractC0323i0 abstractC0323i0 = (AbstractC0323i0) ((A0) AbstractC0303b1.h(j4, obj));
                            if (!abstractC0323i0.f5956a) {
                                break;
                            } else {
                                abstractC0323i0.f5956a = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = f5877k;
                            Object object = unsafe.getObject(obj, j4);
                            if (object == null) {
                                break;
                            } else {
                                ((I0) object).f5856a = false;
                                unsafe.putObject(obj, j4, object);
                                break;
                            }
                    }
                } else if (s(iArr[i4], i4, obj)) {
                    B(i4).a(f5877k.getObject(obj, j4));
                }
                i4 += 3;
            }
            if (p(i4, obj)) {
                B(i4).a(f5877k.getObject(obj, j4));
            }
            i4 += 3;
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
    @Override // com.google.android.gms.internal.play_billing.S0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(AbstractC0353w0 abstractC0353w0) {
        int i4;
        long doubleToLongBits;
        int i5;
        int floatToIntBits;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f5878a;
            if (i8 >= iArr.length) {
                return abstractC0353w0.zzc.hashCode() + (i9 * 53);
            }
            int y4 = y(i8);
            int i10 = 1048575 & y4;
            int x4 = x(y4);
            int i11 = iArr[i8];
            long j4 = i10;
            int i12 = 1237;
            int i13 = 37;
            switch (x4) {
                case 0:
                    i4 = i9 * 53;
                    doubleToLongBits = Double.doubleToLongBits(AbstractC0303b1.f5935c.a(j4, abstractC0353w0));
                    Charset charset = B0.f5803a;
                    i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i5 = i9 * 53;
                    floatToIntBits = Float.floatToIntBits(AbstractC0303b1.f5935c.b(j4, abstractC0353w0));
                    i9 = floatToIntBits + i5;
                    break;
                case 2:
                    i4 = i9 * 53;
                    doubleToLongBits = AbstractC0303b1.f(j4, abstractC0353w0);
                    Charset charset2 = B0.f5803a;
                    i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i4 = i9 * 53;
                    doubleToLongBits = AbstractC0303b1.f(j4, abstractC0353w0);
                    Charset charset3 = B0.f5803a;
                    i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i5 = i9 * 53;
                    floatToIntBits = AbstractC0303b1.e(j4, abstractC0353w0);
                    i9 = floatToIntBits + i5;
                    break;
                case 5:
                    i4 = i9 * 53;
                    doubleToLongBits = AbstractC0303b1.f(j4, abstractC0353w0);
                    Charset charset4 = B0.f5803a;
                    i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i5 = i9 * 53;
                    floatToIntBits = AbstractC0303b1.e(j4, abstractC0353w0);
                    i9 = floatToIntBits + i5;
                    break;
                case 7:
                    i6 = i9 * 53;
                    boolean g4 = AbstractC0303b1.f5935c.g(j4, abstractC0353w0);
                    Charset charset5 = B0.f5803a;
                    break;
                case 8:
                    i5 = i9 * 53;
                    floatToIntBits = ((String) AbstractC0303b1.h(j4, abstractC0353w0)).hashCode();
                    i9 = floatToIntBits + i5;
                    break;
                case 9:
                    i7 = i9 * 53;
                    Object h2 = AbstractC0303b1.h(j4, abstractC0353w0);
                    if (h2 != null) {
                        i13 = h2.hashCode();
                    }
                    i9 = i7 + i13;
                    break;
                case 10:
                    i5 = i9 * 53;
                    floatToIntBits = AbstractC0303b1.h(j4, abstractC0353w0).hashCode();
                    i9 = floatToIntBits + i5;
                    break;
                case 11:
                    i5 = i9 * 53;
                    floatToIntBits = AbstractC0303b1.e(j4, abstractC0353w0);
                    i9 = floatToIntBits + i5;
                    break;
                case 12:
                    i5 = i9 * 53;
                    floatToIntBits = AbstractC0303b1.e(j4, abstractC0353w0);
                    i9 = floatToIntBits + i5;
                    break;
                case 13:
                    i5 = i9 * 53;
                    floatToIntBits = AbstractC0303b1.e(j4, abstractC0353w0);
                    i9 = floatToIntBits + i5;
                    break;
                case 14:
                    i4 = i9 * 53;
                    doubleToLongBits = AbstractC0303b1.f(j4, abstractC0353w0);
                    Charset charset6 = B0.f5803a;
                    i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i5 = i9 * 53;
                    floatToIntBits = AbstractC0303b1.e(j4, abstractC0353w0);
                    i9 = floatToIntBits + i5;
                    break;
                case 16:
                    i4 = i9 * 53;
                    doubleToLongBits = AbstractC0303b1.f(j4, abstractC0353w0);
                    Charset charset7 = B0.f5803a;
                    i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i7 = i9 * 53;
                    Object h4 = AbstractC0303b1.h(j4, abstractC0353w0);
                    if (h4 != null) {
                        i13 = h4.hashCode();
                    }
                    i9 = i7 + i13;
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
                    i5 = i9 * 53;
                    floatToIntBits = AbstractC0303b1.h(j4, abstractC0353w0).hashCode();
                    i9 = floatToIntBits + i5;
                    break;
                case 50:
                    i5 = i9 * 53;
                    floatToIntBits = AbstractC0303b1.h(j4, abstractC0353w0).hashCode();
                    i9 = floatToIntBits + i5;
                    break;
                case 51:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i4 = i9 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) AbstractC0303b1.h(j4, abstractC0353w0)).doubleValue());
                        Charset charset8 = B0.f5803a;
                        i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) AbstractC0303b1.h(j4, abstractC0353w0)).floatValue());
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 53:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i4 = i9 * 53;
                        doubleToLongBits = z(j4, abstractC0353w0);
                        Charset charset9 = B0.f5803a;
                        i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i4 = i9 * 53;
                        doubleToLongBits = z(j4, abstractC0353w0);
                        Charset charset10 = B0.f5803a;
                        i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = v(j4, abstractC0353w0);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 56:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i4 = i9 * 53;
                        doubleToLongBits = z(j4, abstractC0353w0);
                        Charset charset11 = B0.f5803a;
                        i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = v(j4, abstractC0353w0);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 58:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i6 = i9 * 53;
                        boolean booleanValue = ((Boolean) AbstractC0303b1.h(j4, abstractC0353w0)).booleanValue();
                        Charset charset12 = B0.f5803a;
                        break;
                    }
                case 59:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = ((String) AbstractC0303b1.h(j4, abstractC0353w0)).hashCode();
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 60:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = AbstractC0303b1.h(j4, abstractC0353w0).hashCode();
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 61:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = AbstractC0303b1.h(j4, abstractC0353w0).hashCode();
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 62:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = v(j4, abstractC0353w0);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 63:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = v(j4, abstractC0353w0);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = v(j4, abstractC0353w0);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 65:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i4 = i9 * 53;
                        doubleToLongBits = z(j4, abstractC0353w0);
                        Charset charset13 = B0.f5803a;
                        i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = v(j4, abstractC0353w0);
                        i9 = floatToIntBits + i5;
                        break;
                    }
                case 67:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i4 = i9 * 53;
                        doubleToLongBits = z(j4, abstractC0353w0);
                        Charset charset14 = B0.f5803a;
                        i9 = i4 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!s(i11, i8, abstractC0353w0)) {
                        break;
                    } else {
                        i5 = i9 * 53;
                        floatToIntBits = AbstractC0303b1.h(j4, abstractC0353w0).hashCode();
                        i9 = floatToIntBits + i5;
                        break;
                    }
            }
            i8 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final boolean c(Object obj) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i8 < this.f5884g) {
            int i10 = this.f5883f[i8];
            int[] iArr = this.f5878a;
            int i11 = iArr[i10];
            int y4 = y(i10);
            int i12 = iArr[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i9) {
                if (i13 != 1048575) {
                    i7 = f5877k.getInt(obj, i13);
                }
                i5 = i10;
                i6 = i7;
                i4 = i13;
            } else {
                int i15 = i7;
                i4 = i9;
                i5 = i10;
                i6 = i15;
            }
            if ((268435456 & y4) == 0 || q(obj, i5, i4, i6, i14)) {
                int x4 = x(y4);
                if (x4 == 9 || x4 == 17) {
                    if (q(obj, i5, i4, i6, i14) && !B(i5).c(AbstractC0303b1.h(y4 & 1048575, obj))) {
                    }
                    i8++;
                    i9 = i4;
                    i7 = i6;
                } else {
                    if (x4 != 27) {
                        if (x4 == 60 || x4 == 68) {
                            if (s(i11, i5, obj) && !B(i5).c(AbstractC0303b1.h(y4 & 1048575, obj))) {
                            }
                        } else if (x4 != 49) {
                            if (x4 == 50 && !((I0) AbstractC0303b1.h(y4 & 1048575, obj)).isEmpty()) {
                                int i16 = i5 / 3;
                                this.f5879b[i16 + i16].getClass();
                                throw new ClassCastException();
                            }
                        }
                        i8++;
                        i9 = i4;
                        i7 = i6;
                    }
                    List list = (List) AbstractC0303b1.h(y4 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        S0 B4 = B(i5);
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            if (B4.c(list.get(i17))) {
                            }
                        }
                    }
                    i8++;
                    i9 = i4;
                    i7 = i6;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.S0
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.f5878a;
            if (i4 >= iArr.length) {
                T0.p(obj, obj2);
                return;
            }
            int y4 = y(i4);
            int i5 = y4 & 1048575;
            int x4 = x(y4);
            int i6 = iArr[i4];
            long j4 = i5;
            switch (x4) {
                case 0:
                    if (p(i4, obj2)) {
                        AbstractC0300a1 abstractC0300a1 = AbstractC0303b1.f5935c;
                        obj3 = obj;
                        abstractC0300a1.e(obj3, j4, abstractC0300a1.a(j4, obj2));
                        l(i4, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (p(i4, obj2)) {
                        AbstractC0300a1 abstractC0300a12 = AbstractC0303b1.f5935c;
                        abstractC0300a12.f(obj, j4, abstractC0300a12.b(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.k(obj, j4, AbstractC0303b1.f(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.k(obj, j4, AbstractC0303b1.f(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.j(j4, obj, AbstractC0303b1.e(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.k(obj, j4, AbstractC0303b1.f(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.j(j4, obj, AbstractC0303b1.e(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (p(i4, obj2)) {
                        AbstractC0300a1 abstractC0300a13 = AbstractC0303b1.f5935c;
                        abstractC0300a13.c(obj, j4, abstractC0300a13.g(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.l(j4, obj, AbstractC0303b1.h(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    j(obj, i4, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.l(j4, obj, AbstractC0303b1.h(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.j(j4, obj, AbstractC0303b1.e(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.j(j4, obj, AbstractC0303b1.e(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.j(j4, obj, AbstractC0303b1.e(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.k(obj, j4, AbstractC0303b1.f(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.j(j4, obj, AbstractC0303b1.e(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i4, obj2)) {
                        AbstractC0303b1.k(obj, j4, AbstractC0303b1.f(j4, obj2));
                        l(i4, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    j(obj, i4, obj2);
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
                    A0 a02 = (A0) AbstractC0303b1.h(j4, obj);
                    A0 a03 = (A0) AbstractC0303b1.h(j4, obj2);
                    int size = a02.size();
                    int size2 = a03.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC0323i0) a02).f5956a) {
                            a02 = a02.a(size2 + size);
                        }
                        a02.addAll(a03);
                    }
                    if (size > 0) {
                        a03 = a02;
                    }
                    AbstractC0303b1.l(j4, obj, a03);
                    obj3 = obj;
                    break;
                case 50:
                    C0349u0 c0349u0 = T0.f5912a;
                    AbstractC0303b1.l(j4, obj, C0349u0.c(AbstractC0303b1.h(j4, obj), AbstractC0303b1.h(j4, obj2)));
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
                    if (s(i6, i4, obj2)) {
                        AbstractC0303b1.l(j4, obj, AbstractC0303b1.h(j4, obj2));
                        AbstractC0303b1.j(iArr[i4 + 2] & 1048575, obj, i6);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    k(obj, i4, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (s(i6, i4, obj2)) {
                        AbstractC0303b1.l(j4, obj, AbstractC0303b1.h(j4, obj2));
                        AbstractC0303b1.j(iArr[i4 + 2] & 1048575, obj, i6);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    k(obj, i4, obj2);
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

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void e(Object obj, H0 h02) {
        int i4;
        int i5;
        M0 m02 = this;
        Unsafe unsafe = f5877k;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (true) {
            int[] iArr = m02.f5878a;
            if (i7 >= iArr.length) {
                ((AbstractC0353w0) obj).zzc.d(h02);
                return;
            }
            int y4 = m02.y(i7);
            int x4 = x(y4);
            int i10 = iArr[i7];
            if (x4 <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i6;
                if (i12 != i9) {
                    i8 = i12 == i6 ? 0 : unsafe.getInt(obj, i12);
                    i9 = i12;
                }
                i4 = 1 << (i11 >>> 20);
            } else {
                i4 = 0;
            }
            long j4 = y4 & i6;
            switch (x4) {
                case 0:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).c0(i10, Double.doubleToRawLongBits(AbstractC0303b1.f5935c.a(j4, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).a0(i10, Float.floatToRawIntBits(AbstractC0303b1.f5935c.b(j4, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).k0(i10, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).k0(i10, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).e0(i10, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).c0(i10, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).a0(i10, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        byte g4 = AbstractC0303b1.f5935c.g(j4, obj);
                        C0338o0 c0338o0 = (C0338o0) h02.f5850a;
                        c0338o0.j0(i10 << 3);
                        int i13 = c0338o0.f5993d;
                        try {
                            int i14 = i13 + 1;
                            try {
                                c0338o0.f5991b[i13] = g4;
                                c0338o0.f5993d = i14;
                                break;
                            } catch (IndexOutOfBoundsException e4) {
                                e = e4;
                                i13 = i14;
                                throw new C0179l(i13, c0338o0.f5992c, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e5) {
                            e = e5;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        Object object = unsafe.getObject(obj, j4);
                        if (object instanceof String) {
                            ((C0338o0) h02.f5850a).g0(i10, (String) object);
                            break;
                        } else {
                            ((C0338o0) h02.f5850a).Z(i10, (C0336n0) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        h02.d(i10, unsafe.getObject(obj, j4), m02.B(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).Z(i10, (C0336n0) unsafe.getObject(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).i0(i10, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).e0(i10, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).a0(i10, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        ((C0338o0) h02.f5850a).c0(i10, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        int i15 = unsafe.getInt(obj, j4);
                        ((C0338o0) h02.f5850a).i0(i10, (i15 >> 31) ^ (i15 + i15));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        long j5 = unsafe.getLong(obj, j4);
                        ((C0338o0) h02.f5850a).k0(i10, (j5 >> 63) ^ (j5 + j5));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m02.q(obj, i7, i9, i8, i4)) {
                        h02.c(i10, unsafe.getObject(obj, j4), m02.B(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    T0.r(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case C0583e9.f11743C /* 19 */:
                    T0.v(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case C0583e9.f11744D /* 20 */:
                    T0.x(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case 21:
                    T0.d(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case Build.API_LEVELS.API_22 /* 22 */:
                    T0.w(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case Build.API_LEVELS.API_23 /* 23 */:
                    T0.u(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case 24:
                    T0.t(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case 25:
                    T0.q(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case 26:
                    int i16 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j4);
                    C0349u0 c0349u0 = T0.f5912a;
                    if (list != null && !list.isEmpty()) {
                        h02.getClass();
                        for (int i17 = 0; i17 < list.size(); i17++) {
                            ((C0338o0) h02.f5850a).g0(i16, (String) list.get(i17));
                        }
                        break;
                    }
                    break;
                case 27:
                    int i18 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j4);
                    S0 B4 = m02.B(i7);
                    C0349u0 c0349u02 = T0.f5912a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            h02.d(i18, list2.get(i19), B4);
                        }
                        break;
                    }
                    break;
                case Build.API_LEVELS.API_28 /* 28 */:
                    int i20 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j4);
                    C0349u0 c0349u03 = T0.f5912a;
                    if (list3 != null && !list3.isEmpty()) {
                        h02.getClass();
                        for (int i21 = 0; i21 < list3.size(); i21++) {
                            ((C0338o0) h02.f5850a).Z(i20, (C0336n0) list3.get(i21));
                        }
                        break;
                    }
                    break;
                case 29:
                    T0.c(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case Build.API_LEVELS.API_30 /* 30 */:
                    T0.s(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case Build.API_LEVELS.API_31 /* 31 */:
                    T0.y(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case Build.API_LEVELS.API_32 /* 32 */:
                    T0.z(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case Build.API_LEVELS.API_33 /* 33 */:
                    T0.a(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case Build.API_LEVELS.API_34 /* 34 */:
                    T0.b(iArr[i7], (List) unsafe.getObject(obj, j4), h02, false);
                    break;
                case 35:
                    T0.r(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case Build.API_LEVELS.API_36 /* 36 */:
                    T0.v(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case 37:
                    T0.x(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case C0583e9.f11751K /* 38 */:
                    T0.d(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case 39:
                    T0.w(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case C0583e9.L /* 40 */:
                    T0.u(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case 41:
                    T0.t(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case C0583e9.f11752M /* 42 */:
                    T0.q(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case 43:
                    T0.c(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case 44:
                    T0.s(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case 45:
                    T0.y(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case 46:
                    T0.z(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case 47:
                    T0.a(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case 48:
                    T0.b(iArr[i7], (List) unsafe.getObject(obj, j4), h02, true);
                    break;
                case 49:
                    int i22 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j4);
                    S0 B5 = m02.B(i7);
                    C0349u0 c0349u04 = T0.f5912a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            h02.c(i22, list4.get(i23), B5);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j4) != null) {
                        int i24 = i7 / 3;
                        m02.f5879b[i24 + i24].getClass();
                        throw new ClassCastException();
                    }
                    break;
                case 51:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).c0(i10, Double.doubleToRawLongBits(((Double) AbstractC0303b1.h(j4, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).a0(i10, Float.floatToRawIntBits(((Float) AbstractC0303b1.h(j4, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).k0(i10, z(j4, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).k0(i10, z(j4, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).e0(i10, v(j4, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).c0(i10, z(j4, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).a0(i10, v(j4, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m02.s(i10, i7, obj)) {
                        byte booleanValue = ((Boolean) AbstractC0303b1.h(j4, obj)).booleanValue();
                        C0338o0 c0338o02 = (C0338o0) h02.f5850a;
                        c0338o02.j0(i10 << 3);
                        int i25 = c0338o02.f5993d;
                        try {
                            i5 = i25 + 1;
                        } catch (IndexOutOfBoundsException e6) {
                            e = e6;
                        }
                        try {
                            c0338o02.f5991b[i25] = booleanValue;
                            c0338o02.f5993d = i5;
                            break;
                        } catch (IndexOutOfBoundsException e7) {
                            e = e7;
                            i25 = i5;
                            throw new C0179l(i25, c0338o02.f5992c, 1, e);
                        }
                    } else {
                        continue;
                    }
                case 59:
                    if (m02.s(i10, i7, obj)) {
                        Object object2 = unsafe.getObject(obj, j4);
                        if (object2 instanceof String) {
                            ((C0338o0) h02.f5850a).g0(i10, (String) object2);
                            break;
                        } else {
                            ((C0338o0) h02.f5850a).Z(i10, (C0336n0) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (m02.s(i10, i7, obj)) {
                        h02.d(i10, unsafe.getObject(obj, j4), m02.B(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).Z(i10, (C0336n0) unsafe.getObject(obj, j4));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).i0(i10, v(j4, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).e0(i10, v(j4, obj));
                        break;
                    } else {
                        break;
                    }
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).a0(i10, v(j4, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m02.s(i10, i7, obj)) {
                        ((C0338o0) h02.f5850a).c0(i10, z(j4, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m02.s(i10, i7, obj)) {
                        int v = v(j4, obj);
                        ((C0338o0) h02.f5850a).i0(i10, (v >> 31) ^ (v + v));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m02.s(i10, i7, obj)) {
                        long z = z(j4, obj);
                        ((C0338o0) h02.f5850a).k0(i10, (z >> 63) ^ (z + z));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m02.s(i10, i7, obj)) {
                        h02.c(i10, unsafe.getObject(obj, j4), m02.B(i7));
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            i6 = 1048575;
            m02 = this;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final AbstractC0353w0 f() {
        return (AbstractC0353w0) ((AbstractC0353w0) this.f5882e).d(4);
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final int g(AbstractC0320h0 abstractC0320h0) {
        int i4;
        int W4;
        int X4;
        int i5;
        int i6;
        int b4;
        int W5;
        int size;
        int n;
        int W6;
        int W7;
        int W8;
        int i7;
        int W9;
        int X5;
        M0 m02 = this;
        AbstractC0320h0 abstractC0320h02 = abstractC0320h0;
        Unsafe unsafe = f5877k;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = m02.f5878a;
            if (i10 >= iArr.length) {
                return ((AbstractC0353w0) abstractC0320h0).zzc.a() + i12;
            }
            int y4 = m02.y(i10);
            int x4 = x(y4);
            int i13 = iArr[i10];
            int i14 = iArr[i10 + 2];
            int i15 = i14 & i8;
            if (x4 <= 17) {
                if (i15 != i9) {
                    i11 = i15 == i8 ? 0 : unsafe.getInt(abstractC0320h02, i15);
                    i9 = i15;
                }
                i4 = 1 << (i14 >>> 20);
            } else {
                i4 = 0;
            }
            int i16 = y4 & i8;
            if (x4 >= EnumC0345s0.f6004b.f6008a) {
                EnumC0345s0.f6005c.getClass();
            }
            long j4 = i16;
            switch (x4) {
                case 0:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        i12 = AbstractC0005f.d(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 1:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        i12 = AbstractC0005f.d(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 2:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        long j5 = unsafe.getLong(abstractC0320h02, j4);
                        W4 = C0338o0.W(i13 << 3);
                        X4 = C0338o0.X(j5);
                        i5 = X4 + W4;
                        i12 += i5;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case 3:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        long j6 = unsafe.getLong(abstractC0320h02, j4);
                        W4 = C0338o0.W(i13 << 3);
                        X4 = C0338o0.X(j6);
                        i5 = X4 + W4;
                        i12 += i5;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case 4:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        long j7 = unsafe.getInt(abstractC0320h02, j4);
                        W4 = C0338o0.W(i13 << 3);
                        X4 = C0338o0.X(j7);
                        i5 = X4 + W4;
                        i12 += i5;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case 5:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        i12 = AbstractC0005f.d(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 6:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        i12 = AbstractC0005f.d(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 7:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        i12 = AbstractC0005f.d(i13 << 3, 1, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 8:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        int i17 = i13 << 3;
                        Object object = unsafe.getObject(abstractC0320h02, j4);
                        if (object instanceof C0336n0) {
                            int W10 = C0338o0.W(i17);
                            int d4 = ((C0336n0) object).d();
                            i12 = AbstractC0005f.e(d4, d4, W10, i12);
                        } else {
                            W4 = C0338o0.W(i17);
                            X4 = C0338o0.V((String) object);
                            i5 = X4 + W4;
                            i12 += i5;
                        }
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 9:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        Object object2 = unsafe.getObject(abstractC0320h02, j4);
                        S0 B4 = m02.B(i10);
                        C0349u0 c0349u0 = T0.f5912a;
                        int W11 = C0338o0.W(i13 << 3);
                        int b5 = ((AbstractC0320h0) object2).b(B4);
                        i12 = AbstractC0005f.e(b5, b5, W11, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 10:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        C0336n0 c0336n0 = (C0336n0) unsafe.getObject(abstractC0320h02, j4);
                        int W12 = C0338o0.W(i13 << 3);
                        int d5 = c0336n0.d();
                        i12 = AbstractC0005f.e(d5, d5, W12, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 11:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        i12 = AbstractC0005f.d(unsafe.getInt(abstractC0320h02, j4), C0338o0.W(i13 << 3), i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 12:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        long j8 = unsafe.getInt(abstractC0320h02, j4);
                        W4 = C0338o0.W(i13 << 3);
                        X4 = C0338o0.X(j8);
                        i5 = X4 + W4;
                        i12 += i5;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case 13:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        i12 = AbstractC0005f.d(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 14:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        i12 = AbstractC0005f.d(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 15:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        int i18 = unsafe.getInt(abstractC0320h02, j4);
                        i12 = AbstractC0005f.d((i18 >> 31) ^ (i18 + i18), C0338o0.W(i13 << 3), i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 16:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        long j9 = unsafe.getLong(abstractC0320h02, j4);
                        W4 = C0338o0.W(i13 << 3);
                        X4 = C0338o0.X((j9 >> 63) ^ (j9 + j9));
                        i5 = X4 + W4;
                        i12 += i5;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case 17:
                    if (m02.q(abstractC0320h02, i10, i9, i11, i4)) {
                        AbstractC0320h0 abstractC0320h03 = (AbstractC0320h0) unsafe.getObject(abstractC0320h02, j4);
                        S0 B5 = m02.B(i10);
                        int W13 = C0338o0.W(i13 << 3);
                        i6 = W13 + W13;
                        b4 = abstractC0320h03.b(B5);
                        i5 = b4 + i6;
                        i12 += i5;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case 18:
                    i5 = T0.h(i13, (List) unsafe.getObject(abstractC0320h02, j4));
                    i12 += i5;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case C0583e9.f11743C /* 19 */:
                    i5 = T0.g(i13, (List) unsafe.getObject(abstractC0320h02, j4));
                    i12 += i5;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case C0583e9.f11744D /* 20 */:
                    List list = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u02 = T0.f5912a;
                    if (list.size() != 0) {
                        W5 = (C0338o0.W(i13 << 3) * list.size()) + T0.j(list);
                        i12 += W5;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                    W5 = 0;
                    i12 += W5;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u03 = T0.f5912a;
                    size = list2.size();
                    if (size != 0) {
                        n = T0.n(list2);
                        W6 = C0338o0.W(i13 << 3);
                        W7 = (W6 * size) + n;
                        i12 += W7;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                    W7 = 0;
                    i12 += W7;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case Build.API_LEVELS.API_22 /* 22 */:
                    List list3 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u04 = T0.f5912a;
                    size = list3.size();
                    if (size != 0) {
                        n = T0.i(list3);
                        W6 = C0338o0.W(i13 << 3);
                        W7 = (W6 * size) + n;
                        i12 += W7;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                    W7 = 0;
                    i12 += W7;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case Build.API_LEVELS.API_23 /* 23 */:
                    i5 = T0.h(i13, (List) unsafe.getObject(abstractC0320h02, j4));
                    i12 += i5;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 24:
                    i5 = T0.g(i13, (List) unsafe.getObject(abstractC0320h02, j4));
                    i12 += i5;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u05 = T0.f5912a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        W5 = (C0338o0.W(i13 << 3) + 1) * size2;
                        i12 += W5;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                    W5 = 0;
                    i12 += W5;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u06 = T0.f5912a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        W7 = C0338o0.W(i13 << 3) * size3;
                        for (int i19 = 0; i19 < size3; i19++) {
                            Object obj = list5.get(i19);
                            if (obj instanceof C0336n0) {
                                int d6 = ((C0336n0) obj).d();
                                W7 = AbstractC0005f.d(d6, d6, W7);
                            } else {
                                W7 = C0338o0.V((String) obj) + W7;
                            }
                        }
                        i12 += W7;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                    W7 = 0;
                    i12 += W7;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC0320h02, j4);
                    S0 B6 = m02.B(i10);
                    C0349u0 c0349u07 = T0.f5912a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        W8 = 0;
                    } else {
                        W8 = C0338o0.W(i13 << 3) * size4;
                        for (int i20 = 0; i20 < size4; i20++) {
                            int b6 = ((AbstractC0320h0) list6.get(i20)).b(B6);
                            W8 = AbstractC0005f.d(b6, b6, W8);
                        }
                    }
                    i12 += W8;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case Build.API_LEVELS.API_28 /* 28 */:
                    List list7 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u08 = T0.f5912a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        W7 = C0338o0.W(i13 << 3) * size5;
                        for (int i21 = 0; i21 < list7.size(); i21++) {
                            int d7 = ((C0336n0) list7.get(i21)).d();
                            W7 = AbstractC0005f.d(d7, d7, W7);
                        }
                        i12 += W7;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                    W7 = 0;
                    i12 += W7;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u09 = T0.f5912a;
                    size = list8.size();
                    if (size != 0) {
                        n = T0.m(list8);
                        W6 = C0338o0.W(i13 << 3);
                        W7 = (W6 * size) + n;
                        i12 += W7;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                    W7 = 0;
                    i12 += W7;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case Build.API_LEVELS.API_30 /* 30 */:
                    List list9 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u010 = T0.f5912a;
                    size = list9.size();
                    if (size != 0) {
                        n = T0.f(list9);
                        W6 = C0338o0.W(i13 << 3);
                        W7 = (W6 * size) + n;
                        i12 += W7;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                    W7 = 0;
                    i12 += W7;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case Build.API_LEVELS.API_31 /* 31 */:
                    i5 = T0.g(i13, (List) unsafe.getObject(abstractC0320h02, j4));
                    i12 += i5;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case Build.API_LEVELS.API_32 /* 32 */:
                    i5 = T0.h(i13, (List) unsafe.getObject(abstractC0320h02, j4));
                    i12 += i5;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case Build.API_LEVELS.API_33 /* 33 */:
                    List list10 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u011 = T0.f5912a;
                    size = list10.size();
                    if (size != 0) {
                        n = T0.k(list10);
                        W6 = C0338o0.W(i13 << 3);
                        W7 = (W6 * size) + n;
                        i12 += W7;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                    W7 = 0;
                    i12 += W7;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case Build.API_LEVELS.API_34 /* 34 */:
                    List list11 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u012 = T0.f5912a;
                    size = list11.size();
                    if (size != 0) {
                        n = T0.l(list11);
                        W6 = C0338o0.W(i13 << 3);
                        W7 = (W6 * size) + n;
                        i12 += W7;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                    W7 = 0;
                    i12 += W7;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u013 = T0.f5912a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i12 = AbstractC0005f.e(size6, C0338o0.W(i13 << 3), size6, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case Build.API_LEVELS.API_36 /* 36 */:
                    List list13 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u014 = T0.f5912a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i12 = AbstractC0005f.e(size7, C0338o0.W(i13 << 3), size7, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 37:
                    int j10 = T0.j((List) unsafe.getObject(abstractC0320h02, j4));
                    if (j10 > 0) {
                        i12 = AbstractC0005f.e(j10, C0338o0.W(i13 << 3), j10, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case C0583e9.f11751K /* 38 */:
                    int n4 = T0.n((List) unsafe.getObject(abstractC0320h02, j4));
                    if (n4 > 0) {
                        i12 = AbstractC0005f.e(n4, C0338o0.W(i13 << 3), n4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 39:
                    int i22 = T0.i((List) unsafe.getObject(abstractC0320h02, j4));
                    if (i22 > 0) {
                        i12 = AbstractC0005f.e(i22, C0338o0.W(i13 << 3), i22, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case C0583e9.L /* 40 */:
                    List list14 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u015 = T0.f5912a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i12 = AbstractC0005f.e(size8, C0338o0.W(i13 << 3), size8, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u016 = T0.f5912a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i12 = AbstractC0005f.e(size9, C0338o0.W(i13 << 3), size9, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case C0583e9.f11752M /* 42 */:
                    List list16 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u017 = T0.f5912a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i12 = AbstractC0005f.e(size10, C0338o0.W(i13 << 3), size10, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 43:
                    int m4 = T0.m((List) unsafe.getObject(abstractC0320h02, j4));
                    if (m4 > 0) {
                        i12 = AbstractC0005f.e(m4, C0338o0.W(i13 << 3), m4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 44:
                    int f4 = T0.f((List) unsafe.getObject(abstractC0320h02, j4));
                    if (f4 > 0) {
                        i12 = AbstractC0005f.e(f4, C0338o0.W(i13 << 3), f4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u018 = T0.f5912a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i12 = AbstractC0005f.e(size11, C0338o0.W(i13 << 3), size11, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC0320h02, j4);
                    C0349u0 c0349u019 = T0.f5912a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i12 = AbstractC0005f.e(size12, C0338o0.W(i13 << 3), size12, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 47:
                    int k4 = T0.k((List) unsafe.getObject(abstractC0320h02, j4));
                    if (k4 > 0) {
                        i12 = AbstractC0005f.e(k4, C0338o0.W(i13 << 3), k4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 48:
                    int l4 = T0.l((List) unsafe.getObject(abstractC0320h02, j4));
                    if (l4 > 0) {
                        i12 = AbstractC0005f.e(l4, C0338o0.W(i13 << 3), l4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC0320h02, j4);
                    S0 B7 = m02.B(i10);
                    C0349u0 c0349u020 = T0.f5912a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i7 = 0;
                    } else {
                        i7 = 0;
                        for (int i23 = 0; i23 < size13; i23++) {
                            AbstractC0320h0 abstractC0320h04 = (AbstractC0320h0) list19.get(i23);
                            int W14 = C0338o0.W(i13 << 3);
                            i7 += abstractC0320h04.b(B7) + W14 + W14;
                        }
                    }
                    i12 += i7;
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 50:
                    int i24 = i10 / 3;
                    I0 i02 = (I0) unsafe.getObject(abstractC0320h02, j4);
                    if (m02.f5879b[i24 + i24] != null) {
                        throw new ClassCastException();
                    }
                    if (i02.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = i02.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 51:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        i12 = AbstractC0005f.d(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 52:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        i12 = AbstractC0005f.d(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 53:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        long z = z(j4, abstractC0320h02);
                        W9 = C0338o0.W(i13 << 3);
                        X5 = C0338o0.X(z);
                        i12 += X5 + W9;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case 54:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        long z4 = z(j4, abstractC0320h02);
                        W9 = C0338o0.W(i13 << 3);
                        X5 = C0338o0.X(z4);
                        i12 += X5 + W9;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case 55:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        long v = v(j4, abstractC0320h02);
                        W9 = C0338o0.W(i13 << 3);
                        X5 = C0338o0.X(v);
                        i12 += X5 + W9;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case 56:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        i12 = AbstractC0005f.d(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 57:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        i12 = AbstractC0005f.d(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 58:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        i12 = AbstractC0005f.d(i13 << 3, 1, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 59:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        int i25 = i13 << 3;
                        Object object3 = unsafe.getObject(abstractC0320h02, j4);
                        if (object3 instanceof C0336n0) {
                            int W15 = C0338o0.W(i25);
                            int d8 = ((C0336n0) object3).d();
                            i12 = AbstractC0005f.e(d8, d8, W15, i12);
                        } else {
                            W9 = C0338o0.W(i25);
                            X5 = C0338o0.V((String) object3);
                            i12 += X5 + W9;
                        }
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 60:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        Object object4 = unsafe.getObject(abstractC0320h02, j4);
                        S0 B8 = m02.B(i10);
                        C0349u0 c0349u021 = T0.f5912a;
                        int W16 = C0338o0.W(i13 << 3);
                        int b7 = ((AbstractC0320h0) object4).b(B8);
                        i12 = AbstractC0005f.e(b7, b7, W16, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 61:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        C0336n0 c0336n02 = (C0336n0) unsafe.getObject(abstractC0320h02, j4);
                        int W17 = C0338o0.W(i13 << 3);
                        int d9 = c0336n02.d();
                        i12 = AbstractC0005f.e(d9, d9, W17, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 62:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        i12 = AbstractC0005f.d(v(j4, abstractC0320h02), C0338o0.W(i13 << 3), i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 63:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        long v4 = v(j4, abstractC0320h02);
                        W9 = C0338o0.W(i13 << 3);
                        X5 = C0338o0.X(v4);
                        i12 += X5 + W9;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        i12 = AbstractC0005f.d(i13 << 3, 4, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 65:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        i12 = AbstractC0005f.d(i13 << 3, 8, i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 66:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        int v5 = v(j4, abstractC0320h02);
                        i12 = AbstractC0005f.d((v5 >> 31) ^ (v5 + v5), C0338o0.W(i13 << 3), i12);
                    }
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
                case 67:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        long z5 = z(j4, abstractC0320h02);
                        W9 = C0338o0.W(i13 << 3);
                        X5 = C0338o0.X((z5 >> 63) ^ (z5 + z5));
                        i12 += X5 + W9;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                case 68:
                    if (m02.s(i13, i10, abstractC0320h02)) {
                        AbstractC0320h0 abstractC0320h05 = (AbstractC0320h0) unsafe.getObject(abstractC0320h02, j4);
                        S0 B9 = m02.B(i10);
                        int W18 = C0338o0.W(i13 << 3);
                        i6 = W18 + W18;
                        b4 = abstractC0320h05.b(B9);
                        i5 = b4 + i6;
                        i12 += i5;
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    } else {
                        i10 += 3;
                        m02 = this;
                        abstractC0320h02 = abstractC0320h0;
                        i8 = 1048575;
                    }
                default:
                    i10 += 3;
                    m02 = this;
                    abstractC0320h02 = abstractC0320h0;
                    i8 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final void h(Object obj, byte[] bArr, int i4, int i5, C0329k0 c0329k0) {
        t(obj, bArr, i4, i5, 0, c0329k0);
    }

    @Override // com.google.android.gms.internal.play_billing.S0
    public final boolean i(AbstractC0353w0 abstractC0353w0, AbstractC0353w0 abstractC0353w02) {
        boolean e4;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f5878a;
            if (i4 < iArr.length) {
                int y4 = y(i4);
                long j4 = y4 & 1048575;
                switch (x(y4)) {
                    case 0:
                        if (!o(abstractC0353w0, abstractC0353w02, i4)) {
                            break;
                        } else {
                            AbstractC0300a1 abstractC0300a1 = AbstractC0303b1.f5935c;
                            if (Double.doubleToLongBits(abstractC0300a1.a(j4, abstractC0353w0)) != Double.doubleToLongBits(abstractC0300a1.a(j4, abstractC0353w02))) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 1:
                        if (!o(abstractC0353w0, abstractC0353w02, i4)) {
                            break;
                        } else {
                            AbstractC0300a1 abstractC0300a12 = AbstractC0303b1.f5935c;
                            if (Float.floatToIntBits(abstractC0300a12.b(j4, abstractC0353w0)) != Float.floatToIntBits(abstractC0300a12.b(j4, abstractC0353w02))) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 2:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.f(j4, abstractC0353w0) == AbstractC0303b1.f(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 3:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.f(j4, abstractC0353w0) == AbstractC0303b1.f(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 4:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.e(j4, abstractC0353w0) == AbstractC0303b1.e(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 5:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.f(j4, abstractC0353w0) == AbstractC0303b1.f(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 6:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.e(j4, abstractC0353w0) == AbstractC0303b1.e(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 7:
                        if (!o(abstractC0353w0, abstractC0353w02, i4)) {
                            break;
                        } else {
                            AbstractC0300a1 abstractC0300a13 = AbstractC0303b1.f5935c;
                            if (abstractC0300a13.g(j4, abstractC0353w0) != abstractC0300a13.g(j4, abstractC0353w02)) {
                                break;
                            } else {
                                continue;
                                i4 += 3;
                            }
                        }
                    case 8:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && T0.e(AbstractC0303b1.h(j4, abstractC0353w0), AbstractC0303b1.h(j4, abstractC0353w02))) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 9:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && T0.e(AbstractC0303b1.h(j4, abstractC0353w0), AbstractC0303b1.h(j4, abstractC0353w02))) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 10:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && T0.e(AbstractC0303b1.h(j4, abstractC0353w0), AbstractC0303b1.h(j4, abstractC0353w02))) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 11:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.e(j4, abstractC0353w0) == AbstractC0303b1.e(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 12:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.e(j4, abstractC0353w0) == AbstractC0303b1.e(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 13:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.e(j4, abstractC0353w0) == AbstractC0303b1.e(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 14:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.f(j4, abstractC0353w0) == AbstractC0303b1.f(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 15:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.e(j4, abstractC0353w0) == AbstractC0303b1.e(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 16:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && AbstractC0303b1.f(j4, abstractC0353w0) == AbstractC0303b1.f(j4, abstractC0353w02)) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    case 17:
                        if (o(abstractC0353w0, abstractC0353w02, i4) && T0.e(AbstractC0303b1.h(j4, abstractC0353w0), AbstractC0303b1.h(j4, abstractC0353w02))) {
                            continue;
                            i4 += 3;
                        }
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
                        e4 = T0.e(AbstractC0303b1.h(j4, abstractC0353w0), AbstractC0303b1.h(j4, abstractC0353w02));
                        break;
                    case 50:
                        e4 = T0.e(AbstractC0303b1.h(j4, abstractC0353w0), AbstractC0303b1.h(j4, abstractC0353w02));
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
                        if (AbstractC0303b1.e(j5, abstractC0353w0) == AbstractC0303b1.e(j5, abstractC0353w02) && T0.e(AbstractC0303b1.h(j4, abstractC0353w0), AbstractC0303b1.h(j4, abstractC0353w02))) {
                            continue;
                            i4 += 3;
                        }
                        break;
                    default:
                        i4 += 3;
                }
                if (e4) {
                    i4 += 3;
                }
            } else if (abstractC0353w0.zzc.equals(abstractC0353w02.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final void j(Object obj, int i4, Object obj2) {
        if (p(i4, obj2)) {
            int y4 = y(i4) & 1048575;
            Unsafe unsafe = f5877k;
            long j4 = y4;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5878a[i4] + " is present but null: " + obj2.toString());
            }
            S0 B4 = B(i4);
            if (!p(i4, obj)) {
                if (r(object)) {
                    AbstractC0353w0 f4 = B4.f();
                    B4.d(f4, object);
                    unsafe.putObject(obj, j4, f4);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                l(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!r(object2)) {
                AbstractC0353w0 f5 = B4.f();
                B4.d(f5, object2);
                unsafe.putObject(obj, j4, f5);
                object2 = f5;
            }
            B4.d(object2, object);
        }
    }

    public final void k(Object obj, int i4, Object obj2) {
        int[] iArr = this.f5878a;
        int i5 = iArr[i4];
        if (s(i5, i4, obj2)) {
            int y4 = y(i4) & 1048575;
            Unsafe unsafe = f5877k;
            long j4 = y4;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2.toString());
            }
            S0 B4 = B(i4);
            if (!s(i5, i4, obj)) {
                if (r(object)) {
                    AbstractC0353w0 f4 = B4.f();
                    B4.d(f4, object);
                    unsafe.putObject(obj, j4, f4);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                AbstractC0303b1.j(iArr[i4 + 2] & 1048575, obj, i5);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!r(object2)) {
                AbstractC0353w0 f5 = B4.f();
                B4.d(f5, object2);
                unsafe.putObject(obj, j4, f5);
                object2 = f5;
            }
            B4.d(object2, object);
        }
    }

    public final void l(int i4, Object obj) {
        int i5 = this.f5878a[i4 + 2];
        long j4 = 1048575 & i5;
        if (j4 == 1048575) {
            return;
        }
        AbstractC0303b1.j(j4, obj, (1 << (i5 >>> 20)) | AbstractC0303b1.e(j4, obj));
    }

    public final void m(Object obj, int i4, Object obj2) {
        f5877k.putObject(obj, y(i4) & 1048575, obj2);
        l(i4, obj);
    }

    public final void n(Object obj, int i4, Object obj2, int i5) {
        f5877k.putObject(obj, y(i5) & 1048575, obj2);
        AbstractC0303b1.j(this.f5878a[i5 + 2] & 1048575, obj, i4);
    }

    public final boolean o(AbstractC0353w0 abstractC0353w0, AbstractC0353w0 abstractC0353w02, int i4) {
        return p(i4, abstractC0353w0) == p(i4, abstractC0353w02);
    }

    public final boolean p(int i4, Object obj) {
        int i5 = this.f5878a[i4 + 2];
        long j4 = i5 & 1048575;
        if (j4 == 1048575) {
            int y4 = y(i4);
            long j5 = y4 & 1048575;
            switch (x(y4)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC0303b1.f5935c.a(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC0303b1.f5935c.b(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC0303b1.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (AbstractC0303b1.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC0303b1.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC0303b1.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC0303b1.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC0303b1.f5935c.g(j5, obj);
                case 8:
                    Object h2 = AbstractC0303b1.h(j5, obj);
                    if (h2 instanceof String) {
                        if (((String) h2).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h2 instanceof C0336n0)) {
                            throw new IllegalArgumentException();
                        }
                        if (C0336n0.f5981c.equals(h2)) {
                            return false;
                        }
                    }
                    break;
                case 9:
                    if (AbstractC0303b1.h(j5, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (C0336n0.f5981c.equals(AbstractC0303b1.h(j5, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (AbstractC0303b1.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC0303b1.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC0303b1.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC0303b1.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC0303b1.e(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC0303b1.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (AbstractC0303b1.h(j5, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i5 >>> 20)) & AbstractC0303b1.e(j4, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? p(i4, obj) : (i6 & i7) != 0;
    }

    public final boolean s(int i4, int i5, Object obj) {
        return AbstractC0303b1.e((long) (this.f5878a[i5 + 2] & 1048575), obj) == i4;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int t(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, com.google.android.gms.internal.play_billing.C0329k0 r43) {
        /*
            Method dump skipped, instructions count: 3920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.M0.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.k0):int");
    }

    public final int w(int i4, int i5) {
        int[] iArr = this.f5878a;
        int length = (iArr.length / 3) - 1;
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
        return -1;
    }

    public final int y(int i4) {
        return this.f5878a[i4 + 1];
    }
}
