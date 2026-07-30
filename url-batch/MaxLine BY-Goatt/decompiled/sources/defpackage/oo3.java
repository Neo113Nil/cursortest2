package defpackage;

import com.appsflyer.attribution.RequestError;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oo3 implements yo3 {
    public static final int[] j = new int[0];
    public static final Unsafe k = sp3.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zl3 e;
    public final int[] f;
    public final int g;
    public final int h;
    public final gg3 i;

    public oo3(int[] iArr, Object[] objArr, int i, int i2, zl3 zl3Var, int[] iArr2, int i3, int i4, gg3 gg3Var, gg3 gg3Var2) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = gg3Var;
        this.e = zl3Var;
    }

    public static int E(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof in3) {
            return ((in3) obj).e();
        }
        return true;
    }

    public static int j(long j2, Object obj) {
        return ((Integer) sp3.j(j2, obj)).intValue();
    }

    public static long k(long j2, Object obj) {
        return ((Long) sp3.j(j2, obj)).longValue();
    }

    public static final int r(byte[] bArr, int i, int i2, yp3 yp3Var, Class cls, tn0 tn0Var) {
        yp3 yp3Var2 = yp3.o;
        switch (yp3Var.ordinal()) {
            case 0:
                int i3 = i + 8;
                tn0Var.d = Double.valueOf(Double.longBitsToDouble(mh2.x(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                tn0Var.d = Float.valueOf(Float.intBitsToFloat(mh2.w(i, bArr)));
                return i4;
            case 2:
            case 3:
                int v = mh2.v(bArr, i, tn0Var);
                tn0Var.d = Long.valueOf(tn0Var.b);
                return v;
            case 4:
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                int t = mh2.t(bArr, i, tn0Var);
                tn0Var.d = Integer.valueOf(tn0Var.a);
                return t;
            case 5:
            case 15:
                int i5 = i + 8;
                tn0Var.d = Long.valueOf(mh2.x(i, bArr));
                return i5;
            case 6:
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                int i6 = i + 4;
                tn0Var.d = Integer.valueOf(mh2.w(i, bArr));
                return i6;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                int v2 = mh2.v(bArr, i, tn0Var);
                tn0Var.d = Boolean.valueOf(tn0Var.b != 0);
                return v2;
            case 8:
                return mh2.y(bArr, i, tn0Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                yo3 a = uo3.c.a(cls);
                in3 zza = a.zza();
                int A = mh2.A(zza, a, bArr, i, i2, tn0Var);
                a.a(zza);
                tn0Var.d = zza;
                return A;
            case 11:
                return mh2.z(bArr, i, tn0Var);
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                int t2 = mh2.t(bArr, i, tn0Var);
                tn0Var.d = Integer.valueOf(ph2.m(tn0Var.a));
                return t2;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                int v3 = mh2.v(bArr, i, tn0Var);
                tn0Var.d = Long.valueOf(ph2.n(tn0Var.b));
                return v3;
        }
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
    public static oo3 t(wo3 wo3Var, gg3 gg3Var, gg3 gg3Var2) {
        int i;
        int charAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
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
        Object[] objArr;
        int i18;
        Class<?> cls;
        int objectFieldOffset;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field u;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field u2;
        Object obj2;
        Field u3;
        int i29;
        char charAt11;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        if (!(wo3Var instanceof wo3)) {
            b71.o();
            return null;
        }
        String str = wo3Var.b;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i36 = charAt15 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                charAt14 = str.charAt(i35);
                if (charAt14 < 55296) {
                    break;
                }
                i36 |= (charAt14 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            charAt15 = i36 | (charAt14 << i37);
            i35 = i32;
        }
        if (charAt15 == 0) {
            i4 = 0;
            i6 = 0;
            charAt = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            iArr = j;
            i2 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt16 = str.charAt(i35);
            if (charAt16 >= 55296) {
                int i39 = charAt16 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    charAt9 = str.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i39 |= (charAt9 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                charAt16 = i39 | (charAt9 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int charAt17 = str.charAt(i38);
            if (charAt17 >= 55296) {
                int i42 = charAt17 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt8 = str.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt17 = i42 | (charAt8 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt18 = str.charAt(i41);
            if (charAt18 >= 55296) {
                int i45 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt7 = str.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt18 = i45 | (charAt7 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int charAt19 = str.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt6 = str.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt19 = i48 | (charAt6 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            charAt = str.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt5 = str.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt = i51 | (charAt5 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt20 = str.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt4 = str.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt20 = i54 | (charAt4 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int charAt21 = str.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt3 = str.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt21 = i57 | (charAt3 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt22 = str.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    charAt2 = str.charAt(i59);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i60 |= (charAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                charAt22 = i60 | (charAt2 << i61);
                i59 = i8;
            }
            int i62 = charAt16 + charAt16 + charAt17;
            i2 = charAt16;
            i35 = i59;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i63 = charAt20;
            i3 = charAt18;
            i4 = i63;
            i5 = charAt19;
            i6 = i62;
            i7 = charAt22;
        }
        Unsafe unsafe = k;
        Object[] objArr2 = wo3Var.c;
        Class<?> cls2 = wo3Var.a.getClass();
        int i64 = i7 + i4;
        int i65 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i65];
        int i66 = i64;
        int i67 = i7;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int charAt23 = str.charAt(i35);
            if (charAt23 >= i33) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i31 = i72 + 1;
                    charAt13 = str.charAt(i72);
                    i16 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i31;
                    length = i16;
                }
                charAt23 = i71 | (charAt13 << i73);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i70;
            }
            int i74 = i17 + 1;
            int charAt24 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i75 = charAt24 & 8191;
                int i76 = 13;
                while (true) {
                    i30 = i74 + 1;
                    charAt12 = str.charAt(i74);
                    if (charAt12 < c) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i76;
                    i76 += 13;
                    i74 = i30;
                    c = 55296;
                }
                charAt24 = i75 | (charAt12 << i76);
                i74 = i30;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i77 = charAt24 & 255;
            int i78 = charAt23;
            int i79 = charAt24 & 2048;
            if (i77 >= 51) {
                int i80 = i74 + 1;
                int charAt25 = str.charAt(i74);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i29 = i82 + 1;
                        charAt11 = str.charAt(i82);
                        if (charAt11 < c2) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i83;
                        i83 += 13;
                        i82 = i29;
                        c2 = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i83);
                    i26 = i29;
                } else {
                    i26 = i80;
                }
                int i84 = i26;
                int i85 = i77 - 51;
                int i86 = charAt25;
                if (i85 == 9 || i85 == 17) {
                    i27 = i6 + 1;
                    int i87 = i69 / 3;
                    objArr3[i87 + i87 + 1] = objArr4[i6];
                } else {
                    if (i85 == 12) {
                        if (wo3Var.a() == 1 || i79 != 0) {
                            i27 = i6 + 1;
                            int i88 = i69 / 3;
                            objArr3[i88 + i88 + 1] = objArr4[i6];
                        } else {
                            i28 = 0;
                            int i89 = i86 + i86;
                            i79 = i28;
                            obj = objArr4[i89];
                            if (obj instanceof Field) {
                                u2 = (Field) obj;
                            } else {
                                u2 = u(cls2, (String) obj);
                                objArr4[i89] = u2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(u2);
                            int i90 = i89 + 1;
                            obj2 = objArr4[i90];
                            if (obj2 instanceof Field) {
                                u3 = (Field) obj2;
                            } else {
                                u3 = u(cls2, (String) obj2);
                                objArr4[i90] = u3;
                            }
                            i21 = i84;
                            i24 = objectFieldOffset2;
                            i20 = 55296;
                            objArr = objArr3;
                            i18 = i2;
                            cls = cls2;
                            i23 = 0;
                            i19 = (int) unsafe.objectFieldOffset(u3);
                        }
                    }
                    i28 = i79;
                    int i892 = i86 + i86;
                    i79 = i28;
                    obj = objArr4[i892];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(u2);
                    int i902 = i892 + 1;
                    obj2 = objArr4[i902];
                    if (obj2 instanceof Field) {
                    }
                    i21 = i84;
                    i24 = objectFieldOffset22;
                    i20 = 55296;
                    objArr = objArr3;
                    i18 = i2;
                    cls = cls2;
                    i23 = 0;
                    i19 = (int) unsafe.objectFieldOffset(u3);
                }
                i6 = i27;
                i28 = i79;
                int i8922 = i86 + i86;
                i79 = i28;
                obj = objArr4[i8922];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(u2);
                int i9022 = i8922 + 1;
                obj2 = objArr4[i9022];
                if (obj2 instanceof Field) {
                }
                i21 = i84;
                i24 = objectFieldOffset222;
                i20 = 55296;
                objArr = objArr3;
                i18 = i2;
                cls = cls2;
                i23 = 0;
                i19 = (int) unsafe.objectFieldOffset(u3);
            } else {
                int i91 = i6 + 1;
                Field u4 = u(cls2, (String) objArr4[i6]);
                objArr = objArr3;
                if (i77 == 9 || i77 == 17) {
                    i18 = i2;
                    int i92 = i69 / 3;
                    objArr[i92 + i92 + 1] = u4.getType();
                } else {
                    if (i77 == 27) {
                        i18 = i2;
                        i25 = 1;
                        i6 += 2;
                    } else if (i77 == 49) {
                        i6 += 2;
                        i18 = i2;
                        i25 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            i18 = i2;
                            if (wo3Var.a() == 1 || i79 != 0) {
                                i6 += 2;
                                int i93 = i69 / 3;
                                objArr[i93 + i93 + 1] = objArr4[i91];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i6 = i91;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i94 = i6 + 2;
                            int i95 = i67 + 1;
                            iArr[i67] = i69;
                            int i96 = i69 / 3;
                            int i97 = i96 + i96;
                            objArr[i97] = objArr4[i91];
                            if (i79 != 0) {
                                i6 += 3;
                                objArr[i97 + 1] = objArr4[i94];
                                cls = cls2;
                                i67 = i95;
                            } else {
                                i6 = i94;
                                cls = cls2;
                                i67 = i95;
                                i79 = 0;
                            }
                            i18 = i2;
                        } else {
                            i18 = i2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(u4);
                        i19 = 1048575;
                        if ((charAt24 & 4096) != 0 || i77 > 17) {
                            i20 = 55296;
                            i21 = i74;
                            i22 = 0;
                        } else {
                            int i98 = i74 + 1;
                            int charAt26 = str.charAt(i74);
                            if (charAt26 >= 55296) {
                                int i99 = charAt26 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i21 = i98 + 1;
                                    charAt10 = str.charAt(i98);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i99 |= (charAt10 & 8191) << i100;
                                    i100 += 13;
                                    i98 = i21;
                                }
                                charAt26 = i99 | (charAt10 << i100);
                            } else {
                                i21 = i98;
                            }
                            int i101 = (charAt26 / 32) + i18 + i18;
                            Object obj3 = objArr4[i101];
                            if (obj3 instanceof Field) {
                                u = (Field) obj3;
                            } else {
                                u = u(cls, (String) obj3);
                                objArr4[i101] = u;
                            }
                            i22 = charAt26 % 32;
                            i19 = (int) unsafe.objectFieldOffset(u);
                            i20 = 55296;
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = objectFieldOffset;
                            i66++;
                        }
                        i23 = i22;
                        i24 = objectFieldOffset;
                    }
                    int i102 = i69 / 3;
                    objArr[i102 + i102 + i25] = objArr4[i91];
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(u4);
                    i19 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i20 = 55296;
                    i21 = i74;
                    i22 = 0;
                    if (i77 >= 18) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i23 = i22;
                    i24 = objectFieldOffset;
                }
                cls = cls2;
                i6 = i91;
                objectFieldOffset = (int) unsafe.objectFieldOffset(u4);
                i19 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i20 = 55296;
                i21 = i74;
                i22 = 0;
                if (i77 >= 18) {
                }
                i23 = i22;
                i24 = objectFieldOffset;
            }
            int i103 = i79;
            int i104 = i69 + 1;
            iArr2[i69] = i78;
            int i105 = i69 + 2;
            String str2 = str;
            iArr2[i104] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i103 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | i24;
            i69 += 3;
            iArr2[i105] = (i23 << 20) | i19;
            cls2 = cls;
            objArr2 = objArr4;
            i33 = i20;
            length = i16;
            objArr3 = objArr;
            i2 = i18;
            i35 = i21;
            str = str2;
        }
        return new oo3(iArr2, objArr3, i3, i5, wo3Var.a, iArr, i7, i64, gg3Var, gg3Var2);
    }

    public static Field u(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(q40.p(sb, " not found. Known fields are ", arrays), e);
        }
    }

    public final void A(int i, Object obj, Object obj2) {
        k.putObject(obj, D(i) & 1048575, obj2);
        o(i, obj);
    }

    public final Object B(int i, int i2, Object obj) {
        yo3 x = x(i2);
        if (!p(i, i2, obj)) {
            return x.zza();
        }
        Object object = k.getObject(obj, D(i2) & 1048575);
        if (i(object)) {
            return object;
        }
        in3 zza = x.zza();
        if (object != null) {
            x.e(zza, object);
        }
        return zza;
    }

    public final void C(int i, int i2, Object obj, Object obj2) {
        k.putObject(obj, D(i2) & 1048575, obj2);
        sp3.g(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int D(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.yo3
    public final void a(Object obj) {
        if (!i(obj)) {
            return;
        }
        if (obj instanceof in3) {
            in3 in3Var = (in3) obj;
            in3Var.j();
            in3Var.zza = 0;
            in3Var.f();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.i.getClass();
                jp3 jp3Var = ((in3) obj).zzc;
                if (jp3Var.e) {
                    jp3Var.e = false;
                    return;
                }
                return;
            }
            int D = D(i);
            int i2 = 1048575 & D;
            int E = E(D);
            long j2 = i2;
            if (E != 9) {
                if (E != 60 && E != 68) {
                    switch (E) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case Constants.MAX_TREE_DEPTH /* 25 */:
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
                            bm3 bm3Var = (bm3) ((rn3) sp3.j(j2, obj));
                            if (!bm3Var.m) {
                                break;
                            } else {
                                bm3Var.m = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = k;
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((go3) object).m = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (p(iArr[i], i, obj)) {
                    x(i).a(k.getObject(obj, j2));
                }
                i += 3;
            }
            if (n(i, obj)) {
                x(i).a(k.getObject(obj, j2));
            }
            i += 3;
        }
    }

    @Override // defpackage.yo3
    public final void b(Object obj, ot2 ot2Var) {
        int i;
        oo3 oo3Var = this;
        Unsafe unsafe = k;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (true) {
            int[] iArr = oo3Var.a;
            if (i3 >= iArr.length) {
                ((in3) obj).zzc.b(ot2Var);
                return;
            }
            int D = oo3Var.D(i3);
            int E = E(D);
            int i6 = iArr[i3];
            if (E <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j2 = D & i2;
            switch (E) {
                case 0:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).h(Double.doubleToRawLongBits(sp3.c.u(j2, obj)), i6);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).f(i6, Float.floatToRawIntBits(sp3.c.s(j2, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).g(unsafe.getLong(obj, j2), i6);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).g(unsafe.getLong(obj, j2), i6);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).d(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).h(unsafe.getLong(obj, j2), i6);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).f(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        boolean q = sp3.c.q(j2, obj);
                        lm3 lm3Var = (lm3) ot2Var.n;
                        lm3Var.l(i6 << 3);
                        lm3Var.j(q ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            lm3 lm3Var2 = (lm3) ot2Var.n;
                            lm3Var2.l((i6 << 3) | 2);
                            lm3Var2.q((String) object);
                            break;
                        } else {
                            lm3 lm3Var3 = (lm3) ot2Var.n;
                            lm3Var3.l((i6 << 3) | 2);
                            lm3Var3.i((im3) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ot2Var.x(i6, unsafe.getObject(obj, j2), oo3Var.x(i3));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        im3 im3Var = (im3) unsafe.getObject(obj, j2);
                        lm3 lm3Var4 = (lm3) ot2Var.n;
                        lm3Var4.l((i6 << 3) | 2);
                        lm3Var4.i(im3Var);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).e(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).d(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).f(i6, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ((lm3) ot2Var.n).h(unsafe.getLong(obj, j2), i6);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        int i9 = unsafe.getInt(obj, j2);
                        ((lm3) ot2Var.n).e(i6, (i9 >> 31) ^ (i9 + i9));
                        break;
                    } else {
                        break;
                    }
                case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        ((lm3) ot2Var.n).g((j3 >> 63) ^ (j3 + j3), i6);
                        break;
                    } else {
                        break;
                    }
                case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                    if (oo3Var.m(obj, i3, i5, i4, i)) {
                        ot2Var.y(i6, unsafe.getObject(obj, j2), oo3Var.x(i3));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    ap3.c(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 19:
                    ap3.d(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 20:
                    ap3.e(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 21:
                    ap3.f(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 22:
                    ap3.j(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 23:
                    ap3.h(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 24:
                    ap3.m(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case Constants.MAX_TREE_DEPTH /* 25 */:
                    ap3.p(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 26:
                    int i10 = iArr[i3];
                    List list = (List) unsafe.getObject(obj, j2);
                    gg3 gg3Var = ap3.a;
                    if (list != null && !list.isEmpty()) {
                        ot2Var.getClass();
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            lm3 lm3Var5 = (lm3) ot2Var.n;
                            String str = (String) list.get(i11);
                            lm3Var5.l((i10 << 3) | 2);
                            lm3Var5.q(str);
                        }
                        break;
                    }
                    break;
                case 27:
                    int i12 = iArr[i3];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    yo3 x = oo3Var.x(i3);
                    gg3 gg3Var2 = ap3.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ot2Var.x(i12, list2.get(i13), x);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i14 = iArr[i3];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    gg3 gg3Var3 = ap3.a;
                    if (list3 != null && !list3.isEmpty()) {
                        ot2Var.getClass();
                        for (int i15 = 0; i15 < list3.size(); i15++) {
                            lm3 lm3Var6 = (lm3) ot2Var.n;
                            im3 im3Var2 = (im3) list3.get(i15);
                            lm3Var6.l((i14 << 3) | 2);
                            lm3Var6.i(im3Var2);
                        }
                        break;
                    }
                    break;
                case 29:
                    ap3.k(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 30:
                    ap3.o(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 31:
                    ap3.n(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 32:
                    ap3.i(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 33:
                    ap3.l(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 34:
                    ap3.g(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, false);
                    break;
                case 35:
                    ap3.c(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 36:
                    ap3.d(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 37:
                    ap3.e(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 38:
                    ap3.f(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 39:
                    ap3.j(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case RequestError.NETWORK_FAILURE /* 40 */:
                    ap3.h(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case RequestError.NO_DEV_KEY /* 41 */:
                    ap3.m(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 42:
                    ap3.p(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 43:
                    ap3.k(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 44:
                    ap3.o(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 45:
                    ap3.n(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 46:
                    ap3.i(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 47:
                    ap3.l(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 48:
                    ap3.g(iArr[i3], (List) unsafe.getObject(obj, j2), ot2Var, true);
                    break;
                case 49:
                    int i16 = iArr[i3];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    yo3 x2 = oo3Var.x(i3);
                    gg3 gg3Var4 = ap3.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i17 = 0; i17 < list4.size(); i17++) {
                            ot2Var.y(i16, list4.get(i17), x2);
                        }
                        break;
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j2);
                    if (object2 != null) {
                        int i18 = i3 / 3;
                        tt1 tt1Var = ((fo3) oo3Var.b[i18 + i18]).a;
                        ot2Var.getClass();
                        for (Map.Entry entry : ((go3) object2).entrySet()) {
                            lm3 lm3Var7 = (lm3) ot2Var.n;
                            lm3Var7.c(i6, 2);
                            lm3Var7.l(fo3.b(tt1Var, entry.getKey(), entry.getValue()));
                            fo3.a(lm3Var7, tt1Var, entry.getKey(), entry.getValue());
                        }
                        break;
                    } else {
                        break;
                    }
                case 51:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).h(Double.doubleToRawLongBits(((Double) sp3.j(j2, obj)).doubleValue()), i6);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).f(i6, Float.floatToRawIntBits(((Float) sp3.j(j2, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).g(k(j2, obj), i6);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).g(k(j2, obj), i6);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).d(i6, j(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).h(k(j2, obj), i6);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).f(i6, j(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (oo3Var.p(i6, i3, obj)) {
                        boolean booleanValue = ((Boolean) sp3.j(j2, obj)).booleanValue();
                        lm3 lm3Var8 = (lm3) ot2Var.n;
                        lm3Var8.l(i6 << 3);
                        lm3Var8.j(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (oo3Var.p(i6, i3, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            lm3 lm3Var9 = (lm3) ot2Var.n;
                            lm3Var9.l((i6 << 3) | 2);
                            lm3Var9.q((String) object3);
                            break;
                        } else {
                            lm3 lm3Var10 = (lm3) ot2Var.n;
                            lm3Var10.l((i6 << 3) | 2);
                            lm3Var10.i((im3) object3);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (oo3Var.p(i6, i3, obj)) {
                        ot2Var.x(i6, unsafe.getObject(obj, j2), oo3Var.x(i3));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (oo3Var.p(i6, i3, obj)) {
                        im3 im3Var3 = (im3) unsafe.getObject(obj, j2);
                        lm3 lm3Var11 = (lm3) ot2Var.n;
                        lm3Var11.l((i6 << 3) | 2);
                        lm3Var11.i(im3Var3);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).e(i6, j(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).d(i6, j(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).f(i6, j(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (oo3Var.p(i6, i3, obj)) {
                        ((lm3) ot2Var.n).h(k(j2, obj), i6);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (oo3Var.p(i6, i3, obj)) {
                        int j4 = j(j2, obj);
                        ((lm3) ot2Var.n).e(i6, (j4 >> 31) ^ (j4 + j4));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (oo3Var.p(i6, i3, obj)) {
                        long k2 = k(j2, obj);
                        ((lm3) ot2Var.n).g((k2 >> 63) ^ (k2 + k2), i6);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (oo3Var.p(i6, i3, obj)) {
                        ot2Var.y(i6, unsafe.getObject(obj, j2), oo3Var.x(i3));
                        break;
                    } else {
                        break;
                    }
            }
            i3 += 3;
            i2 = 1048575;
            oo3Var = this;
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
    @Override // defpackage.yo3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(in3 in3Var) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                return in3Var.zzc.hashCode() + (i6 * 53);
            }
            int D = D(i5);
            int i7 = 1048575 & D;
            int E = E(D);
            int i8 = iArr[i5];
            long j2 = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (E) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(sp3.c.u(j2, in3Var));
                    Charset charset = sn3.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(sp3.c.s(j2, in3Var));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = sp3.h(j2, in3Var);
                    Charset charset2 = sn3.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = sp3.h(j2, in3Var);
                    Charset charset3 = sn3.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = sp3.f(j2, in3Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = sp3.h(j2, in3Var);
                    Charset charset4 = sn3.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = sp3.f(j2, in3Var);
                    i6 = floatToIntBits + i2;
                    break;
                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                    i3 = i6 * 53;
                    boolean q = sp3.c.q(j2, in3Var);
                    Charset charset5 = sn3.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) sp3.j(j2, in3Var)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object j3 = sp3.j(j2, in3Var);
                    if (j3 != null) {
                        i10 = j3.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = sp3.j(j2, in3Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = sp3.f(j2, in3Var);
                    i6 = floatToIntBits + i2;
                    break;
                case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                    i2 = i6 * 53;
                    floatToIntBits = sp3.f(j2, in3Var);
                    i6 = floatToIntBits + i2;
                    break;
                case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                    i2 = i6 * 53;
                    floatToIntBits = sp3.f(j2, in3Var);
                    i6 = floatToIntBits + i2;
                    break;
                case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                    i = i6 * 53;
                    doubleToLongBits = sp3.h(j2, in3Var);
                    Charset charset6 = sn3.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = sp3.f(j2, in3Var);
                    i6 = floatToIntBits + i2;
                    break;
                case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                    i = i6 * 53;
                    doubleToLongBits = sp3.h(j2, in3Var);
                    Charset charset7 = sn3.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                    i4 = i6 * 53;
                    Object j4 = sp3.j(j2, in3Var);
                    if (j4 != null) {
                        i10 = j4.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case Constants.MAX_TREE_DEPTH /* 25 */:
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
                    i2 = i6 * 53;
                    floatToIntBits = sp3.j(j2, in3Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = sp3.j(j2, in3Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 51:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) sp3.j(j2, in3Var)).doubleValue());
                        Charset charset8 = sn3.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) sp3.j(j2, in3Var)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = k(j2, in3Var);
                        Charset charset9 = sn3.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = k(j2, in3Var);
                        Charset charset10 = sn3.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 55:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j2, in3Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = k(j2, in3Var);
                        Charset charset11 = sn3.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 57:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j2, in3Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 58:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) sp3.j(j2, in3Var)).booleanValue();
                        Charset charset12 = sn3.a;
                        break;
                    }
                case 59:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) sp3.j(j2, in3Var)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = sp3.j(j2, in3Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = sp3.j(j2, in3Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j2, in3Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 63:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j2, in3Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j2, in3Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = k(j2, in3Var);
                        Charset charset13 = sn3.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j2, in3Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 67:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = k(j2, in3Var);
                        Charset charset14 = sn3.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 68:
                    if (!p(i8, i5, in3Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = sp3.j(j2, in3Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    @Override // defpackage.yo3
    public final int d(zl3 zl3Var) {
        int i;
        int r;
        int a;
        int r2;
        int c;
        int r3;
        int b;
        int i2;
        int r4;
        int i3;
        int i4;
        int b2;
        int r5;
        int size;
        int r6;
        int r7;
        int r8;
        int r9;
        int size2;
        int r10;
        int i5;
        int r11;
        int a2;
        int r12;
        int c2;
        int j2;
        int r13;
        oo3 oo3Var = this;
        zl3 zl3Var2 = zl3Var;
        Unsafe unsafe = k;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = oo3Var.a;
            if (i8 >= iArr.length) {
                return ((in3) zl3Var).zzc.c() + i10;
            }
            int D = oo3Var.D(i8);
            int E = E(D);
            int i11 = iArr[i8];
            int i12 = iArr[i8 + 2];
            int i13 = i12 & i6;
            if (E <= 17) {
                if (i13 != i7) {
                    i9 = i13 == i6 ? 0 : unsafe.getInt(zl3Var2, i13);
                    i7 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            int i14 = D & i6;
            if (E >= ym3.n.m) {
                ym3.o.getClass();
            }
            long j3 = i14;
            switch (E) {
                case 0:
                    if (!oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 8, i10);
                    break;
                case 1:
                    if (!oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 4, i10);
                    break;
                case 2:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        long j4 = unsafe.getLong(zl3Var2, j3);
                        r = lm3.r(i11 << 3);
                        a = lm3.a(j4);
                        i3 = a + r;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        long j5 = unsafe.getLong(zl3Var2, j3);
                        r = lm3.r(i11 << 3);
                        a = lm3.a(j5);
                        i3 = a + r;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        long j6 = unsafe.getInt(zl3Var2, j3);
                        r = lm3.r(i11 << 3);
                        a = lm3.a(j6);
                        i3 = a + r;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (!oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 8, i10);
                    break;
                case 6:
                    if (!oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 4, i10);
                    break;
                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        i10 = in1.f(i11 << 3, 1, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        int i15 = i11 << 3;
                        Object object = unsafe.getObject(zl3Var2, j3);
                        if (object instanceof im3) {
                            r2 = lm3.r(i15);
                            c = ((im3) object).c();
                            i10 = in1.g(c, c, r2, i10);
                            break;
                        } else {
                            r = lm3.r(i15);
                            a = lm3.b((String) object);
                            i3 = a + r;
                            i10 += i3;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        Object object2 = unsafe.getObject(zl3Var2, j3);
                        yo3 x = oo3Var.x(i8);
                        gg3 gg3Var = ap3.a;
                        r3 = lm3.r(i11 << 3);
                        b = ((zl3) object2).b(x);
                        i10 = in1.g(b, b, r3, i10);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        im3 im3Var = (im3) unsafe.getObject(zl3Var2, j3);
                        r2 = lm3.r(i11 << 3);
                        c = im3Var.c();
                        i10 = in1.g(c, c, r2, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        i2 = unsafe.getInt(zl3Var2, j3);
                        r4 = lm3.r(i11 << 3);
                        i10 = in1.f(i2, r4, i10);
                        break;
                    } else {
                        break;
                    }
                case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        long j7 = unsafe.getInt(zl3Var2, j3);
                        r = lm3.r(i11 << 3);
                        a = lm3.a(j7);
                        i3 = a + r;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                    if (!oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 4, i10);
                    break;
                case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                    if (!oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 8, i10);
                    break;
                case 15:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        int i16 = unsafe.getInt(zl3Var2, j3);
                        r4 = lm3.r(i11 << 3);
                        i2 = (i16 >> 31) ^ (i16 + i16);
                        i10 = in1.f(i2, r4, i10);
                        break;
                    } else {
                        break;
                    }
                case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        long j8 = unsafe.getLong(zl3Var2, j3);
                        r = lm3.r(i11 << 3);
                        a = lm3.a((j8 >> 63) ^ (j8 + j8));
                        i3 = a + r;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                    if (oo3Var.m(zl3Var2, i8, i7, i9, i)) {
                        zl3 zl3Var3 = (zl3) unsafe.getObject(zl3Var2, j3);
                        yo3 x2 = oo3Var.x(i8);
                        int r14 = lm3.r(i11 << 3);
                        i4 = r14 + r14;
                        b2 = zl3Var3.b(x2);
                        i3 = b2 + i4;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i3 = ap3.y(i11, (List) unsafe.getObject(zl3Var2, j3));
                    i10 += i3;
                    break;
                case 19:
                    i3 = ap3.x(i11, (List) unsafe.getObject(zl3Var2, j3));
                    i10 += i3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var2 = ap3.a;
                    if (list.size() != 0) {
                        r5 = (lm3.r(i11 << 3) * list.size()) + ap3.q(list);
                        i10 += r5;
                        break;
                    }
                    r5 = 0;
                    i10 += r5;
                case 21:
                    List list2 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var3 = ap3.a;
                    size = list2.size();
                    if (size != 0) {
                        r6 = ap3.r(list2);
                        r7 = lm3.r(i11 << 3);
                        r8 = (r7 * size) + r6;
                        i10 += r8;
                        break;
                    }
                    r8 = 0;
                    i10 += r8;
                case 22:
                    List list3 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var4 = ap3.a;
                    size = list3.size();
                    if (size != 0) {
                        r6 = ap3.u(list3);
                        r7 = lm3.r(i11 << 3);
                        r8 = (r7 * size) + r6;
                        i10 += r8;
                        break;
                    }
                    r8 = 0;
                    i10 += r8;
                case 23:
                    i3 = ap3.y(i11, (List) unsafe.getObject(zl3Var2, j3));
                    i10 += i3;
                    break;
                case 24:
                    i3 = ap3.x(i11, (List) unsafe.getObject(zl3Var2, j3));
                    i10 += i3;
                    break;
                case Constants.MAX_TREE_DEPTH /* 25 */:
                    List list4 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var5 = ap3.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        r5 = (lm3.r(i11 << 3) + 1) * size3;
                        i10 += r5;
                        break;
                    }
                    r5 = 0;
                    i10 += r5;
                case 26:
                    List list5 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var6 = ap3.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        r8 = lm3.r(i11 << 3) * size4;
                        for (int i17 = 0; i17 < size4; i17++) {
                            Object obj = list5.get(i17);
                            if (obj instanceof im3) {
                                int c3 = ((im3) obj).c();
                                r8 = in1.f(c3, c3, r8);
                            } else {
                                r8 = lm3.b((String) obj) + r8;
                            }
                        }
                        i10 += r8;
                        break;
                    }
                    r8 = 0;
                    i10 += r8;
                case 27:
                    List list6 = (List) unsafe.getObject(zl3Var2, j3);
                    yo3 x3 = oo3Var.x(i8);
                    gg3 gg3Var7 = ap3.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        r9 = 0;
                    } else {
                        r9 = lm3.r(i11 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int b3 = ((zl3) list6.get(i18)).b(x3);
                            r9 = in1.f(b3, b3, r9);
                        }
                    }
                    i10 += r9;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var8 = ap3.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        r8 = lm3.r(i11 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int c4 = ((im3) list7.get(i19)).c();
                            r8 = in1.f(c4, c4, r8);
                        }
                        i10 += r8;
                        break;
                    }
                    r8 = 0;
                    i10 += r8;
                case 29:
                    List list8 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var9 = ap3.a;
                    size = list8.size();
                    if (size != 0) {
                        r6 = ap3.v(list8);
                        r7 = lm3.r(i11 << 3);
                        r8 = (r7 * size) + r6;
                        i10 += r8;
                        break;
                    }
                    r8 = 0;
                    i10 += r8;
                case 30:
                    List list9 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var10 = ap3.a;
                    size = list9.size();
                    if (size != 0) {
                        r6 = ap3.t(list9);
                        r7 = lm3.r(i11 << 3);
                        r8 = (r7 * size) + r6;
                        i10 += r8;
                        break;
                    }
                    r8 = 0;
                    i10 += r8;
                case 31:
                    i3 = ap3.x(i11, (List) unsafe.getObject(zl3Var2, j3));
                    i10 += i3;
                    break;
                case 32:
                    i3 = ap3.y(i11, (List) unsafe.getObject(zl3Var2, j3));
                    i10 += i3;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var11 = ap3.a;
                    size = list10.size();
                    if (size != 0) {
                        r6 = ap3.w(list10);
                        r7 = lm3.r(i11 << 3);
                        r8 = (r7 * size) + r6;
                        i10 += r8;
                        break;
                    }
                    r8 = 0;
                    i10 += r8;
                case 34:
                    List list11 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var12 = ap3.a;
                    size = list11.size();
                    if (size != 0) {
                        r6 = ap3.s(list11);
                        r7 = lm3.r(i11 << 3);
                        r8 = (r7 * size) + r6;
                        i10 += r8;
                        break;
                    }
                    r8 = 0;
                    i10 += r8;
                case 35:
                    List list12 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var13 = ap3.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var14 = ap3.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = ap3.q((List) unsafe.getObject(zl3Var2, j3));
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = ap3.r((List) unsafe.getObject(zl3Var2, j3));
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = ap3.u((List) unsafe.getObject(zl3Var2, j3));
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case RequestError.NETWORK_FAILURE /* 40 */:
                    List list14 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var15 = ap3.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case RequestError.NO_DEV_KEY /* 41 */:
                    List list15 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var16 = ap3.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var17 = ap3.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = ap3.v((List) unsafe.getObject(zl3Var2, j3));
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = ap3.t((List) unsafe.getObject(zl3Var2, j3));
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var18 = ap3.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(zl3Var2, j3);
                    gg3 gg3Var19 = ap3.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = ap3.w((List) unsafe.getObject(zl3Var2, j3));
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = ap3.s((List) unsafe.getObject(zl3Var2, j3));
                    if (size2 > 0) {
                        r10 = lm3.r(i11 << 3);
                        i10 = in1.g(size2, r10, size2, i10);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(zl3Var2, j3);
                    yo3 x4 = oo3Var.x(i8);
                    gg3 gg3Var20 = ap3.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            zl3 zl3Var4 = (zl3) list19.get(i20);
                            int r15 = lm3.r(i11 << 3);
                            i5 += zl3Var4.b(x4) + r15 + r15;
                        }
                    }
                    i10 += i5;
                    break;
                case 50:
                    int i21 = i8 / 3;
                    go3 go3Var = (go3) unsafe.getObject(zl3Var2, j3);
                    fo3 fo3Var = (fo3) oo3Var.b[i21 + i21];
                    if (!go3Var.isEmpty()) {
                        r8 = 0;
                        for (Map.Entry entry : go3Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            tt1 tt1Var = fo3Var.a;
                            int r16 = lm3.r(i11 << 3);
                            int b4 = fo3.b(tt1Var, key, value);
                            r8 = in1.g(b4, b4, r16, r8);
                        }
                        i10 += r8;
                        break;
                    }
                    r8 = 0;
                    i10 += r8;
                case 51:
                    if (!oo3Var.p(i11, i8, zl3Var2)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 8, i10);
                    break;
                case 52:
                    if (!oo3Var.p(i11, i8, zl3Var2)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 4, i10);
                    break;
                case 53:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        long k2 = k(j3, zl3Var2);
                        r11 = lm3.r(i11 << 3);
                        a2 = lm3.a(k2);
                        i10 += a2 + r11;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        long k3 = k(j3, zl3Var2);
                        r11 = lm3.r(i11 << 3);
                        a2 = lm3.a(k3);
                        i10 += a2 + r11;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        long j9 = j(j3, zl3Var2);
                        r11 = lm3.r(i11 << 3);
                        a2 = lm3.a(j9);
                        i10 += a2 + r11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (!oo3Var.p(i11, i8, zl3Var2)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 8, i10);
                    break;
                case 57:
                    if (!oo3Var.p(i11, i8, zl3Var2)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 4, i10);
                    break;
                case 58:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        i10 = in1.f(i11 << 3, 1, i10);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        int i22 = i11 << 3;
                        Object object3 = unsafe.getObject(zl3Var2, j3);
                        if (object3 instanceof im3) {
                            r12 = lm3.r(i22);
                            c2 = ((im3) object3).c();
                            i10 = in1.g(c2, c2, r12, i10);
                            break;
                        } else {
                            r11 = lm3.r(i22);
                            a2 = lm3.b((String) object3);
                            i10 += a2 + r11;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        Object object4 = unsafe.getObject(zl3Var2, j3);
                        yo3 x5 = oo3Var.x(i8);
                        gg3 gg3Var21 = ap3.a;
                        r3 = lm3.r(i11 << 3);
                        b = ((zl3) object4).b(x5);
                        i10 = in1.g(b, b, r3, i10);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        im3 im3Var2 = (im3) unsafe.getObject(zl3Var2, j3);
                        r12 = lm3.r(i11 << 3);
                        c2 = im3Var2.c();
                        i10 = in1.g(c2, c2, r12, i10);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        j2 = j(j3, zl3Var2);
                        r13 = lm3.r(i11 << 3);
                        i10 = in1.f(j2, r13, i10);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        long j10 = j(j3, zl3Var2);
                        r11 = lm3.r(i11 << 3);
                        a2 = lm3.a(j10);
                        i10 += a2 + r11;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (!oo3Var.p(i11, i8, zl3Var2)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 4, i10);
                    break;
                case 65:
                    if (!oo3Var.p(i11, i8, zl3Var2)) {
                        break;
                    }
                    i10 = in1.f(i11 << 3, 8, i10);
                    break;
                case 66:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        int j11 = j(j3, zl3Var2);
                        r13 = lm3.r(i11 << 3);
                        j2 = (j11 >> 31) ^ (j11 + j11);
                        i10 = in1.f(j2, r13, i10);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        long k4 = k(j3, zl3Var2);
                        r11 = lm3.r(i11 << 3);
                        a2 = lm3.a((k4 >> 63) ^ (k4 + k4));
                        i10 += a2 + r11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (oo3Var.p(i11, i8, zl3Var2)) {
                        zl3 zl3Var5 = (zl3) unsafe.getObject(zl3Var2, j3);
                        yo3 x6 = oo3Var.x(i8);
                        int r17 = lm3.r(i11 << 3);
                        i4 = r17 + r17;
                        b2 = zl3Var5.b(x6);
                        i3 = b2 + i4;
                        i10 += i3;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            oo3Var = this;
            zl3Var2 = zl3Var;
            i6 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.yo3
    public final void e(Object obj, Object obj2) {
        Object obj3;
        if (!i(obj)) {
            lh.e("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                ap3.b(obj, obj2);
                return;
            }
            int D = D(i);
            int i2 = D & 1048575;
            int E = E(D);
            int i3 = iArr[i];
            long j2 = i2;
            switch (E) {
                case 0:
                    if (n(i, obj2)) {
                        rp3 rp3Var = sp3.c;
                        obj3 = obj;
                        rp3Var.w(obj3, j2, rp3Var.u(j2, obj2));
                        o(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i, obj2)) {
                        rp3 rp3Var2 = sp3.c;
                        rp3Var2.t(obj, j2, rp3Var2.s(j2, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        sp3.i(obj, j2, sp3.h(j2, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        sp3.i(obj, j2, sp3.h(j2, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        sp3.g(sp3.f(j2, obj2), j2, obj);
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        sp3.i(obj, j2, sp3.h(j2, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        sp3.g(sp3.f(j2, obj2), j2, obj);
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i, obj2)) {
                        rp3 rp3Var3 = sp3.c;
                        rp3Var3.r(obj, j2, rp3Var3.q(j2, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        sp3.k(j2, obj, sp3.j(j2, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    v(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        sp3.k(j2, obj, sp3.j(j2, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        sp3.g(sp3.f(j2, obj2), j2, obj);
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                    if (n(i, obj2)) {
                        sp3.g(sp3.f(j2, obj2), j2, obj);
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                    if (n(i, obj2)) {
                        sp3.g(sp3.f(j2, obj2), j2, obj);
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                    if (n(i, obj2)) {
                        sp3.i(obj, j2, sp3.h(j2, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        sp3.g(sp3.f(j2, obj2), j2, obj);
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                    if (n(i, obj2)) {
                        sp3.i(obj, j2, sp3.h(j2, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                    v(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case Constants.MAX_TREE_DEPTH /* 25 */:
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
                    rn3 rn3Var = (rn3) sp3.j(j2, obj);
                    rn3 rn3Var2 = (rn3) sp3.j(j2, obj2);
                    int size = rn3Var.size();
                    int size2 = rn3Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((bm3) rn3Var).m) {
                            rn3Var = rn3Var.h(size2 + size);
                        }
                        rn3Var.addAll(rn3Var2);
                    }
                    if (size > 0) {
                        rn3Var2 = rn3Var;
                    }
                    sp3.k(j2, obj, rn3Var2);
                    obj3 = obj;
                    break;
                case 50:
                    gg3 gg3Var = ap3.a;
                    sp3.k(j2, obj, gg3.b(sp3.j(j2, obj), sp3.j(j2, obj2)));
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
                    if (p(i3, i, obj2)) {
                        sp3.k(j2, obj, sp3.j(j2, obj2));
                        sp3.g(i3, iArr[i + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(i3, i, obj2)) {
                        sp3.k(j2, obj, sp3.j(j2, obj2));
                        sp3.g(i3, iArr[i + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    w(i, obj, obj2);
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

    @Override // defpackage.yo3
    public final boolean f(in3 in3Var, in3 in3Var2) {
        boolean a;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int D = D(i);
                long j2 = D & 1048575;
                switch (E(D)) {
                    case 0:
                        if (!l(in3Var, in3Var2, i)) {
                            break;
                        } else {
                            rp3 rp3Var = sp3.c;
                            if (Double.doubleToLongBits(rp3Var.u(j2, in3Var)) != Double.doubleToLongBits(rp3Var.u(j2, in3Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!l(in3Var, in3Var2, i)) {
                            break;
                        } else {
                            rp3 rp3Var2 = sp3.c;
                            if (Float.floatToIntBits(rp3Var2.s(j2, in3Var)) != Float.floatToIntBits(rp3Var2.s(j2, in3Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (l(in3Var, in3Var2, i) && sp3.h(j2, in3Var) == sp3.h(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (l(in3Var, in3Var2, i) && sp3.h(j2, in3Var) == sp3.h(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (l(in3Var, in3Var2, i) && sp3.f(j2, in3Var) == sp3.f(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (l(in3Var, in3Var2, i) && sp3.h(j2, in3Var) == sp3.h(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (l(in3Var, in3Var2, i) && sp3.f(j2, in3Var) == sp3.f(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!l(in3Var, in3Var2, i)) {
                            break;
                        } else {
                            rp3 rp3Var3 = sp3.c;
                            if (rp3Var3.q(j2, in3Var) != rp3Var3.q(j2, in3Var2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (l(in3Var, in3Var2, i) && ap3.a(sp3.j(j2, in3Var), sp3.j(j2, in3Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (l(in3Var, in3Var2, i) && ap3.a(sp3.j(j2, in3Var), sp3.j(j2, in3Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (l(in3Var, in3Var2, i) && ap3.a(sp3.j(j2, in3Var), sp3.j(j2, in3Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (l(in3Var, in3Var2, i) && sp3.f(j2, in3Var) == sp3.f(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                        if (l(in3Var, in3Var2, i) && sp3.f(j2, in3Var) == sp3.f(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                        if (l(in3Var, in3Var2, i) && sp3.f(j2, in3Var) == sp3.f(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                        if (l(in3Var, in3Var2, i) && sp3.h(j2, in3Var) == sp3.h(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (l(in3Var, in3Var2, i) && sp3.f(j2, in3Var) == sp3.f(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                        if (l(in3Var, in3Var2, i) && sp3.h(j2, in3Var) == sp3.h(j2, in3Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                        if (l(in3Var, in3Var2, i) && ap3.a(sp3.j(j2, in3Var), sp3.j(j2, in3Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case Constants.MAX_TREE_DEPTH /* 25 */:
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
                        a = ap3.a(sp3.j(j2, in3Var), sp3.j(j2, in3Var2));
                        break;
                    case 50:
                        a = ap3.a(sp3.j(j2, in3Var), sp3.j(j2, in3Var2));
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
                        long j3 = iArr[i + 2] & 1048575;
                        if (sp3.f(j3, in3Var) == sp3.f(j3, in3Var2) && ap3.a(sp3.j(j2, in3Var), sp3.j(j2, in3Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (a) {
                    i += 3;
                }
            } else if (in3Var.zzc.equals(in3Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yo3
    public final boolean g(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.g) {
            int i7 = this.f[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int D = D(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = k.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & D) == 0 || m(obj, i2, i, i3, i11)) {
                int E = E(D);
                if (E == 9 || E == 17) {
                    if (m(obj, i2, i, i3, i11) && !x(i2).g(sp3.j(D & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (E != 27) {
                        if (E == 60 || E == 68) {
                            if (p(i8, i2, obj) && !x(i2).g(sp3.j(D & 1048575, obj))) {
                            }
                            i5++;
                            i6 = i;
                            i4 = i3;
                        } else if (E != 49) {
                            if (E != 50) {
                                continue;
                            } else {
                                go3 go3Var = (go3) sp3.j(D & 1048575, obj);
                                if (go3Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i13 = i2 / 3;
                                    if (((yp3) ((fo3) this.b[i13 + i13]).a.o).m == aq3.u) {
                                        yo3 yo3Var = null;
                                        for (Object obj2 : go3Var.values()) {
                                            if (yo3Var == null) {
                                                yo3Var = uo3.c.a(obj2.getClass());
                                            }
                                            if (!yo3Var.g(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i5++;
                            i6 = i;
                            i4 = i3;
                        }
                    }
                    List list = (List) sp3.j(D & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        yo3 x = x(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (x.g(list.get(i14))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.yo3
    public final void h(Object obj, byte[] bArr, int i, int i2, tn0 tn0Var) {
        s(obj, bArr, i, i2, 0, tn0Var);
    }

    public final boolean l(in3 in3Var, in3 in3Var2, int i) {
        return n(i, in3Var) == n(i, in3Var2);
    }

    public final boolean m(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? n(i, obj) : (i3 & i4) != 0;
    }

    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            return ((1 << (i2 >>> 20)) & sp3.f(j2, obj)) != 0;
        }
        int D = D(i);
        long j3 = D & 1048575;
        switch (E(D)) {
            case 0:
                if (Double.doubleToRawLongBits(sp3.c.u(j3, obj)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(sp3.c.s(j3, obj)) != 0) {
                }
                break;
            case 2:
                if (sp3.h(j3, obj) != 0) {
                }
                break;
            case 3:
                if (sp3.h(j3, obj) != 0) {
                }
                break;
            case 4:
                if (sp3.f(j3, obj) != 0) {
                }
                break;
            case 5:
                if (sp3.h(j3, obj) != 0) {
                }
                break;
            case 6:
                if (sp3.f(j3, obj) != 0) {
                }
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case 8:
                Object j4 = sp3.j(j3, obj);
                if (!(j4 instanceof String)) {
                    if (!(j4 instanceof im3)) {
                        b71.t();
                        break;
                    } else if (!im3.o.equals(j4)) {
                    }
                } else if (!((String) j4).isEmpty()) {
                }
                break;
            case 9:
                if (sp3.j(j3, obj) != null) {
                }
                break;
            case 10:
                if (!im3.o.equals(sp3.j(j3, obj))) {
                }
                break;
            case 11:
                if (sp3.f(j3, obj) != 0) {
                }
                break;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                if (sp3.f(j3, obj) != 0) {
                }
                break;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                if (sp3.f(j3, obj) != 0) {
                }
                break;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                if (sp3.h(j3, obj) != 0) {
                }
                break;
            case 15:
                if (sp3.f(j3, obj) != 0) {
                }
                break;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                if (sp3.h(j3, obj) != 0) {
                }
                break;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                if (sp3.j(j3, obj) != null) {
                }
                break;
            default:
                b71.t();
                break;
        }
        return false;
    }

    public final void o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        sp3.g((1 << (i2 >>> 20)) | sp3.f(j2, obj), j2, obj);
    }

    public final boolean p(int i, int i2, Object obj) {
        return sp3.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final int q(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int s(java.lang.Object r42, byte[] r43, int r44, int r45, int r46, defpackage.tn0 r47) {
        /*
            Method dump skipped, instructions count: 3920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo3.s(java.lang.Object, byte[], int, int, int, tn0):int");
    }

    public final void v(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            int D = D(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = D;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i2 = this.a[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            yo3 x = x(i);
            if (!n(i, obj)) {
                if (i(object)) {
                    in3 zza = x.zza();
                    x.e(zza, object);
                    unsafe.putObject(obj, j2, zza);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                o(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!i(object2)) {
                in3 zza2 = x.zza();
                x.e(zza2, object2);
                unsafe.putObject(obj, j2, zza2);
                object2 = zza2;
            }
            x.e(object2, object);
        }
    }

    public final void w(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (p(i2, i, obj2)) {
            int D = D(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = D;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            yo3 x = x(i);
            if (!p(i2, i, obj)) {
                if (i(object)) {
                    in3 zza = x.zza();
                    x.e(zza, object);
                    unsafe.putObject(obj, j2, zza);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                sp3.g(i2, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!i(object2)) {
                in3 zza2 = x.zza();
                x.e(zza2, object2);
                unsafe.putObject(obj, j2, zza2);
                object2 = zza2;
            }
            x.e(object2, object);
        }
    }

    public final yo3 x(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        yo3 yo3Var = (yo3) objArr[i3];
        if (yo3Var != null) {
            return yo3Var;
        }
        yo3 a = uo3.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final mg3 y(int i) {
        int i2 = i / 3;
        return (mg3) this.b[i2 + i2 + 1];
    }

    public final Object z(int i, Object obj) {
        yo3 x = x(i);
        int D = D(i) & 1048575;
        if (!n(i, obj)) {
            return x.zza();
        }
        Object object = k.getObject(obj, D);
        if (i(object)) {
            return object;
        }
        in3 zza = x.zza();
        if (object != null) {
            x.e(zza, object);
        }
        return zza;
    }

    @Override // defpackage.yo3
    public final in3 zza() {
        return (in3) ((in3) this.e).o(4);
    }
}
