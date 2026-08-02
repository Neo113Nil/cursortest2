package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpm {
    private static final int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final Charset a = StandardCharsets.ISO_8859_1;

    public static int a(int i) {
        if (i < 96) {
            return b[i];
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jps b(String str, jph jphVar, Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        jpi jpiVar;
        jpi jpiVar2;
        jpk h;
        int a2;
        int i2;
        jpk jpkVar;
        jpa jpaVar;
        jpc b2;
        int i3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        jpg jpgVar;
        int i10;
        int i11 = 0;
        int i12 = 1;
        if (map != null) {
            joy joyVar = joy.p;
            if (map.containsKey(joyVar) && Boolean.parseBoolean(map.get(joyVar).toString())) {
                z = true;
                if (map != null) {
                    joy joyVar2 = joy.o;
                    if (map.containsKey(joyVar2) && Boolean.parseBoolean(map.get(joyVar2).toString())) {
                        z2 = true;
                        Charset charset = a;
                        z3 = map == null && map.containsKey(joy.b);
                        if (z3) {
                            try {
                                charset = Charset.forName(map.get(joy.b).toString());
                            } catch (UnsupportedCharsetException unused) {
                            }
                        }
                        char c = 4;
                        int i13 = -1;
                        if (z2) {
                            jpiVar2 = jpi.BYTE;
                            if (true == charset.equals(a)) {
                                charset = null;
                            }
                            bse bseVar = new bse(str, charset, z, jphVar);
                            jpk[] jpkVarArr = {bse.d(jpr.SMALL), bse.d(jpr.MEDIUM), bse.d(jpr.LARGE)};
                            jpq[] jpqVarArr = {bseVar.e(jpkVarArr[0]), bseVar.e(jpkVarArr[1]), bseVar.e(jpkVarArr[2])};
                            int i14 = 0;
                            int i15 = -1;
                            int i16 = Integer.MAX_VALUE;
                            for (int i17 = 3; i14 < i17; i17 = 3) {
                                jpq jpqVar = jpqVarArr[i14];
                                int a3 = jpqVar.a(jpqVar.b);
                                int i18 = i12;
                                if (f(a3, jpkVarArr[i14], (jph) bseVar.b) && a3 < i16) {
                                    i16 = a3;
                                    i15 = i14;
                                }
                                i14++;
                                i12 = i18;
                            }
                            i = i12;
                            if (i15 < 0) {
                                throw new joz("Data too big for any version");
                            }
                            jpq jpqVar2 = jpqVarArr[i15];
                            jpaVar = new jpa();
                            for (jpp jppVar : jpqVar2.a) {
                                jpi jpiVar3 = jppVar.a;
                                jpaVar.d(jpiVar3.k, 4);
                                int i19 = jppVar.d;
                                if (i19 > 0) {
                                    jpaVar.d(jppVar.a(), jpiVar3.a(jppVar.e.b));
                                }
                                if (jpiVar3 == jpi.ECI) {
                                    jpaVar.d(jpc.b(((jpd) jppVar.e.c.c).a[jppVar.c].charset()).a(), 8);
                                } else if (i19 > 0) {
                                    bse bseVar2 = jppVar.e.c;
                                    int i20 = jppVar.b;
                                    c(((String) bseVar2.d).substring(i20, i19 + i20), jpiVar3, jpaVar, ((jpd) bseVar2.c).b(jppVar.c));
                                }
                            }
                            jpkVar = jpqVar2.b;
                        } else {
                            i = 1;
                            Charset charset2 = jpe.a;
                            if (charset2 != null && charset2.equals(charset) && e(str)) {
                                jpiVar = jpi.KANJI;
                            } else {
                                boolean z5 = false;
                                boolean z6 = false;
                                int i21 = 0;
                                while (true) {
                                    if (i21 < str.length()) {
                                        char charAt = str.charAt(i21);
                                        if (charAt >= '0' && charAt <= '9') {
                                            z6 = true;
                                        } else {
                                            if (a(charAt) == -1) {
                                                jpiVar = jpi.BYTE;
                                                break;
                                            }
                                            z5 = true;
                                        }
                                        i21++;
                                    } else {
                                        jpiVar = z5 ? jpi.ALPHANUMERIC : z6 ? jpi.NUMERIC : jpi.BYTE;
                                    }
                                }
                            }
                            jpiVar2 = jpiVar;
                            jpa jpaVar2 = new jpa();
                            jpi jpiVar4 = jpi.BYTE;
                            if (jpiVar2 == jpiVar4 && z3 && (b2 = jpc.b(charset)) != null) {
                                jpaVar2.d(jpi.ECI.k, 4);
                                jpaVar2.d(b2.a(), 8);
                            }
                            if (z) {
                                d(jpi.FNC1_FIRST_POSITION, jpaVar2);
                            }
                            d(jpiVar2, jpaVar2);
                            jpa jpaVar3 = new jpa();
                            c(str, jpiVar2, jpaVar3, charset);
                            if (map != null) {
                                joy joyVar3 = joy.m;
                                if (map.containsKey(joyVar3)) {
                                    h = jpk.a(Integer.parseInt(map.get(joyVar3).toString()));
                                    if (!f(g(jpiVar2, jpaVar2, jpaVar3, h), h, jphVar)) {
                                        throw new joz("Data too big for requested version");
                                    }
                                    jpa jpaVar4 = new jpa();
                                    jpaVar4.c(jpaVar2);
                                    a2 = jpiVar2 != jpiVar4 ? jpaVar3.a() : str.length();
                                    int a4 = jpiVar2.a(h);
                                    i2 = 1 << a4;
                                    if (a2 < i2) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(a2);
                                        sb.append(" is bigger than ");
                                        sb.append(i2 - 1);
                                        throw new joz(sb.toString());
                                    }
                                    jpaVar4.d(a2, a4);
                                    jpaVar4.c(jpaVar3);
                                    jpkVar = h;
                                    jpaVar = jpaVar4;
                                }
                            }
                            h = h(g(jpiVar2, jpaVar2, jpaVar3, h(g(jpiVar2, jpaVar2, jpaVar3, jpk.a(1)), jphVar)), jphVar);
                            jpa jpaVar42 = new jpa();
                            jpaVar42.c(jpaVar2);
                            if (jpiVar2 != jpiVar4) {
                            }
                            int a42 = jpiVar2.a(h);
                            i2 = 1 << a42;
                            if (a2 < i2) {
                            }
                        }
                        bsh b3 = jpkVar.b(jphVar);
                        int e = b3.e();
                        int i22 = jpkVar.b;
                        int i23 = i22 - e;
                        i3 = i23 * 8;
                        i4 = jpaVar.b;
                        if (i4 > i3) {
                            throw new joz(a.af(i3, i4, "data bits cannot fit in the QR Code", " > "));
                        }
                        for (int i24 = 0; i24 < 4 && jpaVar.b < i3; i24++) {
                            jpaVar.b(false);
                        }
                        int i25 = jpaVar.b & 7;
                        if (i25 > 0) {
                            while (i25 < 8) {
                                jpaVar.b(false);
                                i25++;
                            }
                        }
                        int a5 = i23 - jpaVar.a();
                        int i26 = 0;
                        while (i26 < a5) {
                            char c2 = c;
                            jpaVar.d(i != (i26 & 1) ? 236 : 17, 8);
                            i26++;
                            c = c2;
                            i = 1;
                        }
                        if (jpaVar.b != i3) {
                            throw new joz("Bits size does not equal capacity");
                        }
                        int d = b3.d();
                        if (jpaVar.a() != i23) {
                            throw new joz("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(d);
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 0;
                        while (i27 < d) {
                            int i31 = i11;
                            int i32 = i13;
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[1];
                            if (i27 >= d) {
                                throw new joz("Block ID too large");
                            }
                            int i33 = i22 % d;
                            int i34 = d - i33;
                            int i35 = i22 / d;
                            int i36 = i23 / d;
                            int i37 = i36 + 1;
                            int i38 = i35 - i36;
                            int i39 = (i35 + 1) - i37;
                            if (i38 != i39) {
                                throw new joz("EC bytes mismatch");
                            }
                            if (d != i34 + i33) {
                                throw new joz("RS blocks mismatch");
                            }
                            if (i22 != ((i36 + i38) * i34) + ((i37 + i39) * i33)) {
                                throw new joz("Total bytes mismatch");
                            }
                            if (i27 < i34) {
                                iArr[i31] = i36;
                                iArr2[i31] = i38;
                            } else {
                                iArr[i31] = i37;
                                iArr2[i31] = i39;
                            }
                            int i40 = iArr[i31];
                            byte[] bArr = new byte[i40];
                            int i41 = i28 * 8;
                            int i42 = d;
                            int i43 = i31;
                            while (i43 < i40) {
                                int i44 = i43;
                                int i45 = i27;
                                int i46 = i31;
                                int i47 = i46;
                                while (i46 < 8) {
                                    if (jpaVar.e(i41)) {
                                        i47 = (1 << (7 - i46)) | i47;
                                    }
                                    i41++;
                                    i46++;
                                }
                                bArr[i44] = (byte) i47;
                                i43 = i44 + 1;
                                i27 = i45;
                            }
                            int i48 = i27;
                            int i49 = iArr2[i31];
                            int i50 = i40 + i49;
                            int[] iArr3 = new int[i50];
                            int i51 = i31;
                            while (i51 < i40) {
                                iArr3[i51] = bArr[i51] & 255;
                                i51++;
                                jpaVar = jpaVar;
                            }
                            jpa jpaVar5 = jpaVar;
                            jpf jpfVar = jpf.a;
                            ArrayList arrayList2 = new ArrayList();
                            jpk jpkVar2 = jpkVar;
                            arrayList2.add(new jpg(jpfVar, new int[]{1}));
                            if (i49 == 0) {
                                throw new IllegalArgumentException("No error correction bytes");
                            }
                            int i52 = i50 - i49;
                            if (i52 <= 0) {
                                throw new IllegalArgumentException("No data bytes provided");
                            }
                            jpi jpiVar5 = jpiVar2;
                            if (i49 >= arrayList2.size()) {
                                jpg jpgVar2 = (jpg) arrayList2.get(arrayList2.size() - 1);
                                int size = arrayList2.size();
                                while (size <= i49) {
                                    int i53 = size;
                                    int i54 = i22;
                                    int i55 = i23;
                                    jpg jpgVar3 = new jpg(jpfVar, new int[]{1, jpfVar.b[(i53 - 1) + jpfVar.f]});
                                    jpf jpfVar2 = jpgVar2.a;
                                    if (!jpfVar2.equals(jpgVar3.a)) {
                                        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                    }
                                    if (jpgVar2.e() || jpgVar3.e()) {
                                        i10 = i28;
                                        jpgVar2 = jpfVar2.d;
                                    } else {
                                        int[] iArr4 = jpgVar2.b;
                                        int length = iArr4.length;
                                        int[] iArr5 = jpgVar3.b;
                                        int length2 = iArr5.length;
                                        int[] iArr6 = new int[(length + length2) - 1];
                                        i10 = i28;
                                        int i56 = i31;
                                        while (i56 < length) {
                                            int i57 = length;
                                            int i58 = iArr4[i56];
                                            int i59 = i56;
                                            int i60 = i31;
                                            while (i60 < length2) {
                                                int i61 = i59 + i60;
                                                iArr6[i61] = iArr6[i61] ^ jpfVar2.a(i58, iArr5[i60]);
                                                i60++;
                                                length2 = length2;
                                            }
                                            i56 = i59 + 1;
                                            length = i57;
                                        }
                                        jpgVar2 = new jpg(jpfVar2, iArr6);
                                    }
                                    arrayList2.add(jpgVar2);
                                    size = i53 + 1;
                                    i23 = i55;
                                    i22 = i54;
                                    i28 = i10;
                                }
                            }
                            int i62 = i23;
                            int i63 = i22;
                            int i64 = i28;
                            jpg jpgVar4 = (jpg) arrayList2.get(i49);
                            int[] iArr7 = new int[i52];
                            System.arraycopy(iArr3, i31, iArr7, i31, i52);
                            jpg d2 = new jpg(jpfVar, iArr7).d(i49, 1);
                            jpf jpfVar3 = d2.a;
                            if (!jpfVar3.equals(jpgVar4.a)) {
                                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                            }
                            if (jpgVar4.e()) {
                                throw new IllegalArgumentException("Divide by 0");
                            }
                            jpg jpgVar5 = jpfVar3.d;
                            if (jpgVar4.a(jpgVar4.b()) == 0) {
                                throw new ArithmeticException();
                            }
                            int i65 = jpfVar3.b[(jpfVar3.e - jpfVar3.c[r7]) - 1];
                            jpg jpgVar6 = jpgVar5;
                            while (d2.b() >= jpgVar4.b() && !d2.e()) {
                                int b4 = d2.b() - jpgVar4.b();
                                int a6 = jpfVar3.a(d2.a(d2.b()), i65);
                                int i66 = i52;
                                jpg d3 = jpgVar4.d(b4, a6);
                                if (b4 < 0) {
                                    throw new IllegalArgumentException();
                                }
                                if (a6 == 0) {
                                    jpgVar = jpgVar5;
                                } else {
                                    int[] iArr8 = new int[b4 + 1];
                                    iArr8[0] = a6;
                                    jpgVar = new jpg(jpfVar3, iArr8);
                                }
                                jpgVar6 = jpgVar6.c(jpgVar);
                                d2 = d2.c(d3);
                                i52 = i66;
                            }
                            int i67 = i52;
                            int[] iArr9 = d2.b;
                            int length3 = i49 - iArr9.length;
                            for (int i68 = 0; i68 < length3; i68++) {
                                iArr3[i67 + i68] = 0;
                            }
                            System.arraycopy(iArr9, 0, iArr3, i67 + length3, iArr9.length);
                            byte[] bArr2 = new byte[i49];
                            for (int i69 = 0; i69 < i49; i69++) {
                                bArr2[i69] = (byte) iArr3[i40 + i69];
                            }
                            arrayList.add(new kuq(bArr, bArr2, (byte[]) null));
                            i29 = Math.max(i29, i40);
                            i30 = Math.max(i30, i49);
                            i28 = i64 + iArr[0];
                            i27 = i48 + 1;
                            i13 = i32;
                            d = i42;
                            jpaVar = jpaVar5;
                            jpiVar2 = jpiVar5;
                            jpkVar = jpkVar2;
                            i23 = i62;
                            i22 = i63;
                            i11 = 0;
                        }
                        jpk jpkVar3 = jpkVar;
                        jpi jpiVar6 = jpiVar2;
                        int i70 = i22;
                        int i71 = i13;
                        if (i23 != i28) {
                            throw new joz("Data bytes does not match offset");
                        }
                        jpa jpaVar6 = new jpa();
                        for (int i72 = 0; i72 < i29; i72++) {
                            int size2 = arrayList.size();
                            for (int i73 = 0; i73 < size2; i73++) {
                                byte[] bArr3 = (byte[]) ((kuq) arrayList.get(i73)).b;
                                if (i72 < bArr3.length) {
                                    jpaVar6.d(bArr3[i72], 8);
                                }
                            }
                        }
                        for (int i74 = 0; i74 < i30; i74++) {
                            int size3 = arrayList.size();
                            for (int i75 = 0; i75 < size3; i75++) {
                                byte[] bArr4 = (byte[]) ((kuq) arrayList.get(i75)).a;
                                if (i74 < bArr4.length) {
                                    jpaVar6.d(bArr4[i74], 8);
                                }
                            }
                        }
                        if (i70 != jpaVar6.a()) {
                            throw new joz("Interleaving error: " + i70 + " and " + jpaVar6.a() + " differ.");
                        }
                        jps jpsVar = new jps();
                        jpsVar.b = jphVar;
                        jpsVar.a = jpiVar6;
                        jpsVar.c = jpkVar3;
                        int i76 = (jpkVar3.a * 4) + 17;
                        jpl jplVar = new jpl(i76, i76);
                        if (map != null) {
                            joy joyVar4 = joy.n;
                            if (map.containsKey(joyVar4)) {
                                i5 = Integer.parseInt(map.get(joyVar4).toString());
                                z4 = true;
                                if (true == jps.a(i5)) {
                                    i6 = i71;
                                    if (i5 == i6) {
                                        int i77 = 0;
                                        int i78 = Integer.MAX_VALUE;
                                        int i79 = -1;
                                        while (i77 < 8) {
                                            jpn.b(jpaVar6, jphVar, jpkVar3, i77, jplVar);
                                            int i80 = 0;
                                            int a7 = imp.a(jplVar, z4) + imp.a(jplVar, false);
                                            byte[][] bArr5 = jplVar.a;
                                            int i81 = jplVar.b;
                                            int i82 = jplVar.c;
                                            int i83 = 0;
                                            int i84 = 0;
                                            while (i83 < i82 - 1) {
                                                int i85 = i83 + 1;
                                                byte[] bArr6 = bArr5[i83];
                                                int i86 = i84;
                                                int i87 = i80;
                                                while (i87 < i81 - 1) {
                                                    byte b5 = bArr6[i87];
                                                    int i88 = i87 + 1;
                                                    if (b5 == bArr6[i88]) {
                                                        byte[] bArr7 = bArr5[i85];
                                                        if (b5 == bArr7[i87] && b5 == bArr7[i88]) {
                                                            i86++;
                                                        }
                                                    }
                                                    i87 = i88;
                                                    i80 = 0;
                                                }
                                                i83 = i85;
                                                i84 = i86;
                                            }
                                            int i89 = a7 + (i84 * 3);
                                            int i90 = 0;
                                            int i91 = 0;
                                            while (i90 < i82) {
                                                int i92 = i91;
                                                int i93 = 0;
                                                while (true) {
                                                    i7 = i90 + 1;
                                                    if (i93 < i81) {
                                                        int i94 = i93 + 1;
                                                        int i95 = i77;
                                                        byte[] bArr8 = bArr5[i90];
                                                        int i96 = i89;
                                                        int i97 = i93 + 6;
                                                        if (i97 < i81) {
                                                            i8 = i92;
                                                            if (bArr8[i93] == 1 && bArr8[i94] == 0 && bArr8[i93 + 2] == 1 && bArr8[i93 + 3] == 1 && bArr8[i93 + 4] == 1 && bArr8[i93 + 5] == 0 && bArr8[i97] == 1 && (imp.b(bArr8, i93 - 4, i93) || imp.b(bArr8, i93 + 7, i93 + 11))) {
                                                                i92 = i8 + 1;
                                                                i9 = i90 + 6;
                                                                if (i9 < i82 && bArr5[i90][i93] == 1 && bArr5[i7][i93] == 0 && bArr5[i90 + 2][i93] == 1 && bArr5[i90 + 3][i93] == 1 && bArr5[i90 + 4][i93] == 1 && bArr5[i90 + 5][i93] == 0 && bArr5[i9][i93] == 1 && (imp.c(bArr5, i93, i90 - 4, i90) || imp.c(bArr5, i93, i90 + 7, i90 + 11))) {
                                                                    i92++;
                                                                }
                                                                i89 = i96;
                                                                i93 = i94;
                                                                i77 = i95;
                                                            }
                                                        } else {
                                                            i8 = i92;
                                                        }
                                                        i92 = i8;
                                                        i9 = i90 + 6;
                                                        if (i9 < i82) {
                                                            i92++;
                                                        }
                                                        i89 = i96;
                                                        i93 = i94;
                                                        i77 = i95;
                                                    }
                                                }
                                                i90 = i7;
                                                i91 = i92;
                                            }
                                            int i98 = i77;
                                            int i99 = i89 + (i91 * 40);
                                            int i100 = 0;
                                            for (int i101 = 0; i101 < i82; i101++) {
                                                byte[] bArr9 = bArr5[i101];
                                                for (int i102 = 0; i102 < i81; i102++) {
                                                    if (bArr9[i102] == 1) {
                                                        i100++;
                                                    }
                                                }
                                            }
                                            int i103 = i82 * i81;
                                            int abs = i99 + (((Math.abs((i100 + i100) - i103) * 10) / i103) * 10);
                                            if (abs < i78) {
                                                i79 = i98;
                                            }
                                            if (abs < i78) {
                                                i78 = abs;
                                            }
                                            i77 = i98 + 1;
                                            z4 = true;
                                        }
                                        i5 = i79;
                                    }
                                    jpsVar.d = i5;
                                    jpn.b(jpaVar6, jphVar, jpkVar3, i5, jplVar);
                                    jpsVar.e = jplVar;
                                    return jpsVar;
                                }
                                i5 = i71;
                                i6 = i5;
                                if (i5 == i6) {
                                }
                                jpsVar.d = i5;
                                jpn.b(jpaVar6, jphVar, jpkVar3, i5, jplVar);
                                jpsVar.e = jplVar;
                                return jpsVar;
                            }
                        }
                        z4 = true;
                        i5 = i71;
                        i6 = i5;
                        if (i5 == i6) {
                        }
                        jpsVar.d = i5;
                        jpn.b(jpaVar6, jphVar, jpkVar3, i5, jplVar);
                        jpsVar.e = jplVar;
                        return jpsVar;
                    }
                }
                z2 = false;
                Charset charset3 = a;
                if (map == null) {
                }
                if (z3) {
                }
                char c3 = 4;
                int i132 = -1;
                if (z2) {
                }
                bsh b32 = jpkVar.b(jphVar);
                int e2 = b32.e();
                int i222 = jpkVar.b;
                int i232 = i222 - e2;
                i3 = i232 * 8;
                i4 = jpaVar.b;
                if (i4 > i3) {
                }
            }
        }
        z = false;
        if (map != null) {
        }
        z2 = false;
        Charset charset32 = a;
        if (map == null) {
        }
        if (z3) {
        }
        char c32 = 4;
        int i1322 = -1;
        if (z2) {
        }
        bsh b322 = jpkVar.b(jphVar);
        int e22 = b322.e();
        int i2222 = jpkVar.b;
        int i2322 = i2222 - e22;
        i3 = i2322 * 8;
        i4 = jpaVar.b;
        if (i4 > i3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[LOOP:0: B:13:0x0024->B:21:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void c(String str, jpi jpiVar, jpa jpaVar, Charset charset) {
        int i;
        int i2;
        jpi jpiVar2 = jpi.TERMINATOR;
        int ordinal = jpiVar.ordinal();
        int i3 = 0;
        if (ordinal == 1) {
            int length = str.length();
            while (i3 < length) {
                int i4 = i3 + 1;
                int charAt = str.charAt(i3) - '0';
                int i5 = i3 + 2;
                if (i5 < length) {
                    jpaVar.d((charAt * 100) + ((str.charAt(i4) - '0') * 10) + (str.charAt(i5) - '0'), 10);
                    i3 += 3;
                } else if (i4 < length) {
                    jpaVar.d((charAt * 10) + (str.charAt(i4) - '0'), 7);
                    i3 = i5;
                } else {
                    jpaVar.d(charAt, 4);
                    i3 = i4;
                }
            }
            return;
        }
        if (ordinal == 2) {
            int length2 = str.length();
            while (i3 < length2) {
                int a2 = a(str.charAt(i3));
                if (a2 == -1) {
                    throw new joz();
                }
                int i6 = i3 + 1;
                if (i6 < length2) {
                    int a3 = a(str.charAt(i6));
                    if (a3 == -1) {
                        throw new joz();
                    }
                    jpaVar.d((a2 * 45) + a3, 11);
                    i3 += 2;
                } else {
                    jpaVar.d(a2, 6);
                    i3 = i6;
                }
            }
            return;
        }
        if (ordinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i3 < length3) {
                jpaVar.d(bytes[i3], 8);
                i3++;
            }
            return;
        }
        if (ordinal != 6) {
            throw new joz("Invalid mode: ".concat(String.valueOf(String.valueOf(jpiVar))));
        }
        Charset charset2 = jpe.a;
        if (charset2 == null) {
            throw new joz("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        int length4 = bytes2.length;
        if ((length4 & 1) != 0) {
            throw new joz("Kanji byte size not even");
        }
        int i7 = length4 - 1;
        while (i3 < i7) {
            int i8 = ((bytes2[i3] & 255) << 8) | (bytes2[i3 + 1] & 255);
            if (i8 >= 33088 && i8 <= 40956) {
                i2 = -33088;
            } else if (i8 < 57408 || i8 > 60351) {
                i = -1;
                if (i != -1) {
                    throw new joz("Invalid byte sequence");
                }
                jpaVar.d(((i >> 8) * 192) + (i & 255), 13);
                i3 += 2;
            } else {
                i2 = -49472;
            }
            i = i8 + i2;
            if (i != -1) {
            }
        }
    }

    static void d(jpi jpiVar, jpa jpaVar) {
        jpaVar.d(jpiVar.k, 4);
    }

    public static boolean e(String str) {
        byte[] bytes = str.getBytes(jpe.a);
        int length = bytes.length;
        if ((length & 1) != 0) {
            return false;
        }
        for (int i = 0; i < length; i += 2) {
            int i2 = bytes[i] & 255;
            if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                return false;
            }
        }
        return true;
    }

    static boolean f(int i, jpk jpkVar, jph jphVar) {
        return jpkVar.b - jpkVar.b(jphVar).e() >= (i + 7) / 8;
    }

    private static int g(jpi jpiVar, jpa jpaVar, jpa jpaVar2, jpk jpkVar) {
        return jpaVar.b + jpiVar.a(jpkVar) + jpaVar2.b;
    }

    private static jpk h(int i, jph jphVar) {
        for (int i2 = 1; i2 <= 40; i2++) {
            jpk a2 = jpk.a(i2);
            if (f(i, a2, jphVar)) {
                return a2;
            }
        }
        throw new joz("Data too big");
    }
}
