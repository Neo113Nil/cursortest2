package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentMap;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlt {
    public static final jlt a = new jlt();
    private final ConcurrentMap b = new ConcurrentHashMap();

    private jlt() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private jlz c(Class cls) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt3;
        int i9;
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
        jlz jloVar;
        int i16;
        int i17;
        Object[] objArr;
        jll jllVar;
        int[] iArr2;
        int i18;
        int objectFieldOffset;
        int i19;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field f;
        int i24;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field f2;
        Object obj2;
        Field f3;
        int i29;
        char charAt11;
        int i30;
        int i31;
        char charAt12;
        int i32;
        int i33;
        char charAt13;
        int i34;
        int i35;
        char charAt14;
        if (!jkp.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            jlj jljVar = (jlj) jkp.n(cls.asSubclass(jkp.class)).a(3, null);
            if (jljVar.b()) {
                jloVar = new jlp(jma.a, jljVar.a());
            } else {
                jmj jmjVar = jma.a;
                ils ilsVar = jljVar.c() + (-1) != 1 ? jke.a : null;
                Unsafe unsafe = jlo.b;
                if (unsafe == null) {
                    throw new RuntimeException("Lite gencode is primarily intended for Android use and uses sun.misc.Unsafe which is not available in the current environment. To run in this environment, you may need to switch to standard gencode.");
                }
                if (!(jljVar instanceof jlv)) {
                    throw null;
                }
                jlv jlvVar = (jlv) jljVar;
                String str2 = jlvVar.b;
                int length = str2.length();
                int i36 = 0;
                if (str2.charAt(0) >= 55296) {
                    int i37 = 1;
                    while (true) {
                        i = i37 + 1;
                        if (str2.charAt(i37) < 55296) {
                            break;
                        }
                        i37 = i;
                    }
                } else {
                    i = 1;
                }
                int i38 = i + 1;
                int charAt15 = str2.charAt(i);
                if (charAt15 >= 55296) {
                    int i39 = charAt15 & 8191;
                    int i40 = 13;
                    while (true) {
                        i35 = i38 + 1;
                        charAt14 = str2.charAt(i38);
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
                    i6 = 0;
                    charAt = 0;
                    charAt2 = 0;
                    i4 = 0;
                    iArr = jlo.a;
                    i5 = 0;
                } else {
                    int i41 = i38 + 1;
                    int charAt16 = str2.charAt(i38);
                    if (charAt16 >= 55296) {
                        int i42 = charAt16 & 8191;
                        int i43 = 13;
                        while (true) {
                            i15 = i41 + 1;
                            charAt9 = str2.charAt(i41);
                            if (charAt9 < 55296) {
                                break;
                            }
                            i42 |= (charAt9 & 8191) << i43;
                            i43 += 13;
                            i41 = i15;
                        }
                        charAt16 = i42 | (charAt9 << i43);
                        i41 = i15;
                    }
                    int i44 = i41 + 1;
                    int charAt17 = str2.charAt(i41);
                    if (charAt17 >= 55296) {
                        int i45 = charAt17 & 8191;
                        int i46 = 13;
                        while (true) {
                            i14 = i44 + 1;
                            charAt8 = str2.charAt(i44);
                            if (charAt8 < 55296) {
                                break;
                            }
                            i45 |= (charAt8 & 8191) << i46;
                            i46 += 13;
                            i44 = i14;
                        }
                        charAt17 = i45 | (charAt8 << i46);
                        i44 = i14;
                    }
                    int i47 = i44 + 1;
                    int charAt18 = str2.charAt(i44);
                    if (charAt18 >= 55296) {
                        int i48 = charAt18 & 8191;
                        int i49 = 13;
                        while (true) {
                            i13 = i47 + 1;
                            charAt7 = str2.charAt(i47);
                            if (charAt7 < 55296) {
                                break;
                            }
                            i48 |= (charAt7 & 8191) << i49;
                            i49 += 13;
                            i47 = i13;
                        }
                        charAt18 = i48 | (charAt7 << i49);
                        i47 = i13;
                    }
                    int i50 = i47 + 1;
                    charAt = str2.charAt(i47);
                    if (charAt >= 55296) {
                        int i51 = charAt & 8191;
                        int i52 = 13;
                        while (true) {
                            i12 = i50 + 1;
                            charAt6 = str2.charAt(i50);
                            if (charAt6 < 55296) {
                                break;
                            }
                            i51 |= (charAt6 & 8191) << i52;
                            i52 += 13;
                            i50 = i12;
                        }
                        charAt = i51 | (charAt6 << i52);
                        i50 = i12;
                    }
                    int i53 = i50 + 1;
                    charAt2 = str2.charAt(i50);
                    if (charAt2 >= 55296) {
                        int i54 = charAt2 & 8191;
                        int i55 = i53;
                        int i56 = 13;
                        while (true) {
                            i11 = i55 + 1;
                            charAt5 = str2.charAt(i55);
                            if (charAt5 < 55296) {
                                break;
                            }
                            i54 |= (charAt5 & 8191) << i56;
                            i56 += 13;
                            i55 = i11;
                        }
                        charAt2 = i54 | (charAt5 << i56);
                        i2 = i11;
                    } else {
                        i2 = i53;
                    }
                    int i57 = i2 + 1;
                    i36 = str2.charAt(i2);
                    if (i36 >= 55296) {
                        int i58 = i36 & 8191;
                        int i59 = i57;
                        int i60 = 13;
                        while (true) {
                            i10 = i59 + 1;
                            charAt4 = str2.charAt(i59);
                            if (charAt4 < 55296) {
                                break;
                            }
                            i58 |= (charAt4 & 8191) << i60;
                            i60 += 13;
                            i59 = i10;
                        }
                        i36 = i58 | (charAt4 << i60);
                        i3 = i10;
                    } else {
                        i3 = i57;
                    }
                    int i61 = i3 + 1;
                    if (str2.charAt(i3) >= 55296) {
                        do {
                            i9 = i61;
                            i61 = i9 + 1;
                        } while (str2.charAt(i9) >= 55296);
                    }
                    int i62 = i61;
                    int i63 = i62 + 1;
                    int charAt19 = str2.charAt(i62);
                    if (charAt19 >= 55296) {
                        int i64 = charAt19 & 8191;
                        int i65 = i63;
                        int i66 = 13;
                        while (true) {
                            i8 = i65 + 1;
                            charAt3 = str2.charAt(i65);
                            if (charAt3 < 55296) {
                                break;
                            }
                            i64 |= (charAt3 & 8191) << i66;
                            i66 += 13;
                            i65 = i8;
                        }
                        charAt19 = i64 | (charAt3 << i66);
                        i63 = i8;
                    }
                    i4 = charAt16 + charAt16 + charAt17;
                    int i67 = charAt19;
                    iArr = new int[charAt19 + i36 + charAt16];
                    i5 = charAt18;
                    i6 = i67;
                    i7 = charAt16;
                    i38 = i63;
                }
                Object[] objArr2 = jlvVar.c;
                int i68 = i38;
                int i69 = i5;
                jll jllVar2 = jlvVar.a;
                Class<?> cls2 = jllVar2.getClass();
                int i70 = i7;
                int i71 = i36 + i6;
                int[] iArr3 = new int[charAt2 * 3];
                Object[] objArr3 = new Object[charAt2 + charAt2];
                int i72 = i71;
                int i73 = i6;
                int i74 = i68;
                int i75 = 0;
                int i76 = 0;
                while (i74 < length) {
                    int i77 = i74 + 1;
                    int charAt20 = str2.charAt(i74);
                    int i78 = length;
                    if (charAt20 >= 55296) {
                        int i79 = charAt20 & 8191;
                        int i80 = i77;
                        int i81 = 13;
                        while (true) {
                            i33 = i80 + 1;
                            charAt13 = str2.charAt(i80);
                            i34 = i79;
                            if (charAt13 < 55296) {
                                break;
                            }
                            i79 = i34 | ((charAt13 & 8191) << i81);
                            i81 += 13;
                            i80 = i33;
                        }
                        charAt20 = i34 | (charAt13 << i81);
                        i16 = i33;
                    } else {
                        i16 = i77;
                    }
                    int i82 = i16 + 1;
                    int charAt21 = str2.charAt(i16);
                    int i83 = charAt20;
                    if (charAt21 >= 55296) {
                        int i84 = charAt21 & 8191;
                        int i85 = i82;
                        int i86 = 13;
                        while (true) {
                            i31 = i85 + 1;
                            charAt12 = str2.charAt(i85);
                            i32 = i84;
                            if (charAt12 < 55296) {
                                break;
                            }
                            i84 = i32 | ((charAt12 & 8191) << i86);
                            i86 += 13;
                            i85 = i31;
                        }
                        charAt21 = i32 | (charAt12 << i86);
                        i17 = i31;
                    } else {
                        i17 = i82;
                    }
                    int i87 = i71;
                    if ((charAt21 & 1024) != 0) {
                        iArr[i75] = i76;
                        i75++;
                    }
                    int i88 = charAt21 & 255;
                    int i89 = i69;
                    int i90 = charAt21 & 2048;
                    if (i88 >= 51) {
                        int i91 = i17 + 1;
                        int charAt22 = str2.charAt(i17);
                        if (charAt22 >= 55296) {
                            int i92 = charAt22 & 8191;
                            int i93 = i91;
                            int i94 = 13;
                            while (true) {
                                i29 = i93 + 1;
                                charAt11 = str2.charAt(i93);
                                i30 = i92;
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i92 = i30 | ((charAt11 & 8191) << i94);
                                i94 += 13;
                                i93 = i29;
                            }
                            charAt22 = i30 | (charAt11 << i94);
                            i26 = i29;
                        } else {
                            i26 = i91;
                        }
                        int i95 = charAt22;
                        int i96 = i88 - 51;
                        i21 = i26;
                        if (i96 == 9 || i96 == 17) {
                            i27 = i4 + 1;
                            int i97 = i76 / 3;
                            objArr3[i97 + i97 + 1] = objArr2[i4];
                        } else {
                            if (i96 == 12) {
                                if (jlvVar.c() == 1 || i90 != 0) {
                                    i27 = i4 + 1;
                                    int i98 = i76 / 3;
                                    objArr3[i98 + i98 + 1] = objArr2[i4];
                                } else {
                                    i28 = 0;
                                    int i99 = i95 + i95;
                                    obj = objArr2[i99];
                                    int i100 = i28;
                                    if (obj instanceof Field) {
                                        f2 = (Field) obj;
                                    } else {
                                        f2 = jlo.f(cls2, (String) obj);
                                        objArr2[i99] = f2;
                                        iArr[i72] = i76;
                                        i72++;
                                    }
                                    objArr = objArr2;
                                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(f2);
                                    int i101 = i99 + 1;
                                    obj2 = objArr[i101];
                                    if (obj2 instanceof Field) {
                                        f3 = (Field) obj2;
                                    } else {
                                        f3 = jlo.f(cls2, (String) obj2);
                                        objArr[i101] = f3;
                                    }
                                    str = str2;
                                    i20 = i88;
                                    jllVar = jllVar2;
                                    iArr2 = iArr;
                                    i18 = i100;
                                    i23 = 0;
                                    i19 = (int) unsafe.objectFieldOffset(f3);
                                    i22 = objectFieldOffset2;
                                }
                            }
                            i28 = i90;
                            int i992 = i95 + i95;
                            obj = objArr2[i992];
                            int i1002 = i28;
                            if (obj instanceof Field) {
                            }
                            objArr = objArr2;
                            int objectFieldOffset22 = (int) unsafe.objectFieldOffset(f2);
                            int i1012 = i992 + 1;
                            obj2 = objArr[i1012];
                            if (obj2 instanceof Field) {
                            }
                            str = str2;
                            i20 = i88;
                            jllVar = jllVar2;
                            iArr2 = iArr;
                            i18 = i1002;
                            i23 = 0;
                            i19 = (int) unsafe.objectFieldOffset(f3);
                            i22 = objectFieldOffset22;
                        }
                        i4 = i27;
                        i28 = i90;
                        int i9922 = i95 + i95;
                        obj = objArr2[i9922];
                        int i10022 = i28;
                        if (obj instanceof Field) {
                        }
                        objArr = objArr2;
                        int objectFieldOffset222 = (int) unsafe.objectFieldOffset(f2);
                        int i10122 = i9922 + 1;
                        obj2 = objArr[i10122];
                        if (obj2 instanceof Field) {
                        }
                        str = str2;
                        i20 = i88;
                        jllVar = jllVar2;
                        iArr2 = iArr;
                        i18 = i10022;
                        i23 = 0;
                        i19 = (int) unsafe.objectFieldOffset(f3);
                        i22 = objectFieldOffset222;
                    } else {
                        objArr = objArr2;
                        int i102 = i4 + 1;
                        Field f4 = jlo.f(cls2, (String) objArr[i4]);
                        if (i88 == 9 || i88 == 17) {
                            jllVar = jllVar2;
                            int i103 = i76 / 3;
                            objArr3[i103 + i103 + 1] = f4.getType();
                        } else {
                            if (i88 == 27) {
                                jllVar = jllVar2;
                                i25 = 1;
                                i4 += 2;
                            } else if (i88 == 49) {
                                i4 += 2;
                                jllVar = jllVar2;
                                i25 = 1;
                            } else {
                                if (i88 == 12 || i88 == 30 || i88 == 44) {
                                    jllVar = jllVar2;
                                    if (jlvVar.c() == 1 || i90 != 0) {
                                        i4 += 2;
                                        int i104 = i76 / 3;
                                        objArr3[i104 + i104 + 1] = objArr[i102];
                                        iArr2 = iArr;
                                        i18 = i90;
                                    } else {
                                        iArr2 = iArr;
                                        i4 = i102;
                                        i18 = 0;
                                    }
                                } else if (i88 == 50) {
                                    int i105 = i4 + 2;
                                    int i106 = i73 + 1;
                                    iArr[i73] = i76;
                                    int i107 = i76 / 3;
                                    int i108 = i107 + i107;
                                    objArr3[i108] = objArr[i102];
                                    if (i90 != 0) {
                                        i4 += 3;
                                        objArr3[i108 + 1] = objArr[i105];
                                        iArr2 = iArr;
                                        i18 = i90;
                                        i73 = i106;
                                    } else {
                                        i4 = i105;
                                        iArr2 = iArr;
                                        i73 = i106;
                                        i18 = 0;
                                    }
                                    jllVar = jllVar2;
                                } else {
                                    jllVar = jllVar2;
                                }
                                objectFieldOffset = (int) unsafe.objectFieldOffset(f4);
                                i19 = 1048575;
                                if ((charAt21 & 4096) != 0 || i88 > 17) {
                                    str = str2;
                                    i20 = i88;
                                    i21 = i17;
                                    i22 = objectFieldOffset;
                                    i23 = 0;
                                } else {
                                    int i109 = i17 + 1;
                                    int charAt23 = str2.charAt(i17);
                                    if (charAt23 >= 55296) {
                                        int i110 = charAt23 & 8191;
                                        int i111 = 13;
                                        while (true) {
                                            i24 = i109 + 1;
                                            charAt10 = str2.charAt(i109);
                                            if (charAt10 < 55296) {
                                                break;
                                            }
                                            i110 |= (charAt10 & 8191) << i111;
                                            i111 += 13;
                                            i109 = i24;
                                        }
                                        charAt23 = i110 | (charAt10 << i111);
                                        i109 = i24;
                                    }
                                    int i112 = i70 + i70 + (charAt23 / 32);
                                    Object obj3 = objArr[i112];
                                    str = str2;
                                    if (obj3 instanceof Field) {
                                        f = (Field) obj3;
                                    } else {
                                        f = jlo.f(cls2, (String) obj3);
                                        objArr[i112] = f;
                                    }
                                    i20 = i88;
                                    i19 = (int) unsafe.objectFieldOffset(f);
                                    i21 = i109;
                                    i18 = i18;
                                    i23 = charAt23 % 32;
                                    i22 = objectFieldOffset;
                                }
                            }
                            int i113 = i76 / 3;
                            objArr3[i113 + i113 + i25] = objArr[i102];
                            iArr2 = iArr;
                            i18 = i90;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(f4);
                            i19 = 1048575;
                            if ((charAt21 & 4096) != 0) {
                            }
                            str = str2;
                            i20 = i88;
                            i21 = i17;
                            i22 = objectFieldOffset;
                            i23 = 0;
                        }
                        iArr2 = iArr;
                        i18 = i90;
                        i4 = i102;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(f4);
                        i19 = 1048575;
                        if ((charAt21 & 4096) != 0) {
                        }
                        str = str2;
                        i20 = i88;
                        i21 = i17;
                        i22 = objectFieldOffset;
                        i23 = 0;
                    }
                    int i114 = i76 + 1;
                    iArr3[i76] = i83;
                    int i115 = i76 + 2;
                    Class<?> cls3 = cls2;
                    iArr3[i114] = ((charAt21 & 512) != 0 ? 536870912 : 0) | ((charAt21 & 256) != 0 ? 268435456 : 0) | (i18 != 0 ? Integer.MIN_VALUE : 0) | (i20 << 20) | i22;
                    i76 += 3;
                    iArr3[i115] = (i23 << 20) | i19;
                    cls2 = cls3;
                    iArr = iArr2;
                    i71 = i87;
                    length = i78;
                    i69 = i89;
                    jllVar2 = jllVar;
                    str2 = str;
                    i74 = i21;
                    objArr2 = objArr;
                }
                jloVar = new jlo(iArr3, objArr3, i69, charAt, jllVar2, iArr, i6, i71, jmjVar, ilsVar);
            }
            jlz jlzVar = (jlz) this.b.putIfAbsent(cls, jloVar);
            return jlzVar != null ? jlzVar : jloVar;
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    final jlz a(jkp jkpVar) {
        return b(jkpVar.getClass());
    }

    public final jlz b(Class cls) {
        Object obj = this.b.get(cls);
        return obj == null ? c(cls) : (jlz) obj;
    }
}
