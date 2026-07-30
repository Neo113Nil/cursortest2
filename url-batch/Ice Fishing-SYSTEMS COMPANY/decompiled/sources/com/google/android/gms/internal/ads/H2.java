package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public abstract class H2 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f25279a;

    static {
        String str = AbstractC3548lu.f32613a;
        f25279a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i) {
        return (i >> 24) & com.anythink.basead.exoplayer.k.p.f8630b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0124, code lost:
    
        if (r41 == 0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x1253  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x127f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x1041  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x11be  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x11c5  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:679:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d4  */
    /* JADX WARN: Type inference failed for: r70v1 */
    /* JADX WARN: Type inference failed for: r70v10 */
    /* JADX WARN: Type inference failed for: r70v11 */
    /* JADX WARN: Type inference failed for: r70v12 */
    /* JADX WARN: Type inference failed for: r70v16 */
    /* JADX WARN: Type inference failed for: r70v17 */
    /* JADX WARN: Type inference failed for: r70v18 */
    /* JADX WARN: Type inference failed for: r70v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList b(Ww ww, X0 x02, long j9, RO ro, boolean z8, boolean z9, XA xa) {
        long j10;
        long j11;
        int i;
        int i4;
        boolean z10;
        boolean z11;
        long j12;
        long j13;
        long w9;
        int a9;
        int i9;
        int i10;
        int i11;
        int i12;
        long j14;
        long j15;
        int i13;
        int i14;
        String str;
        C3443jx i15;
        int i16;
        String str2;
        ArrayList arrayList;
        byte b9;
        int i17;
        int i18;
        int i19;
        UC uc;
        UC uc2;
        TP tp;
        X2 x22;
        XA xa2;
        Ww j16;
        Pair h9;
        C3443jx i20;
        int i21;
        boolean z12;
        Lr lr;
        short s3;
        ArrayList arrayList2;
        Ww ww2;
        long j17;
        long j18;
        int i22;
        String str3;
        short s6;
        RO ro2;
        int i23;
        String str4;
        byte b10;
        int i24;
        int i25;
        String str5;
        ?? r70;
        String str6;
        String str7;
        int i26;
        String str8;
        F3.q qVar;
        int i27;
        int i28;
        boolean z13;
        String str9;
        String str10;
        int i29;
        int i30;
        F3.q qVar2;
        C2518Df c2518Df;
        int i31;
        int i32;
        String str11;
        boolean z14;
        int i33;
        int i34;
        char c4;
        C2518Df c2518Df2;
        int i35;
        boolean z15;
        String str12;
        int i36;
        boolean z16;
        boolean z17;
        boolean z18;
        RO ro3;
        RO a10;
        boolean z19;
        String str13;
        int i37;
        String str14;
        int i38;
        int i39;
        int i40;
        Lr lr2;
        String str15;
        String str16;
        long j19;
        C3675oC c3675oC;
        boolean z20;
        int i41;
        boolean z21;
        boolean z22;
        X2 x23;
        ArrayList arrayList3;
        Ww ww3 = ww;
        String str17 = com.anythink.basead.exoplayer.k.o.f8600Z;
        byte b11 = -1;
        int i42 = 10;
        int i43 = 16;
        int i44 = 4;
        int i45 = 8;
        ArrayList arrayList4 = new ArrayList();
        int i46 = 0;
        while (true) {
            ArrayList arrayList5 = ww3.f28535e;
            if (i46 >= arrayList5.size()) {
                return arrayList4;
            }
            Ww ww4 = (Ww) arrayList5.get(i46);
            if (ww4.f32624b != 1953653099) {
                arrayList3 = arrayList4;
                i16 = i46;
                b9 = b11;
                i = i42;
                i17 = i44;
                i18 = i45;
                str2 = str17;
            } else {
                C3443jx i47 = ww3.i(1836476516);
                i47.getClass();
                Ww j20 = ww4.j(1835297121);
                j20.getClass();
                C3443jx i48 = j20.i(1751411826);
                i48.getClass();
                Lr lr3 = i48.f32222c;
                lr3.E(i43);
                int b12 = lr3.b();
                byte b13 = b12 == 1936684398 ? (byte) 1 : b12 == 1986618469 ? (byte) 2 : (b12 == 1952807028 || b12 == 1935832172 || b12 == 1937072756 || b12 == 1668047728 || b12 == 1937072752) ? (byte) 3 : b12 == 1835365473 ? (byte) 5 : b11;
                if (b13 == b11) {
                    xa2 = xa;
                    arrayList = arrayList4;
                    i16 = i46;
                    b9 = b11;
                    i = i42;
                    i17 = i44;
                    i18 = i45;
                    str2 = str17;
                    x22 = null;
                } else {
                    C3443jx i49 = ww4.i(1953196132);
                    i49.getClass();
                    Lr lr4 = i49.f32222c;
                    lr4.E(i45);
                    int a11 = a(lr4.b());
                    if (a11 != 0) {
                        i45 = i43;
                    }
                    lr4.G(i45);
                    int b14 = lr4.b();
                    lr4.G(i44);
                    int i50 = lr4.f26234b;
                    int i51 = 0;
                    while (true) {
                        int i52 = a11 == 0 ? i44 : 8;
                        j10 = com.anythink.basead.exoplayer.b.f6539b;
                        if (i51 >= i52) {
                            lr4.G(i52);
                            break;
                        }
                        if (lr4.f26233a[i50 + i51] != b11) {
                            j11 = a11 == 0 ? lr4.P() : lr4.j();
                        } else {
                            i51++;
                        }
                    }
                    j11 = -9223372036854775807L;
                    lr4.G(i42);
                    int L8 = lr4.L();
                    lr4.G(i44);
                    int b15 = lr4.b();
                    int b16 = lr4.b();
                    lr4.G(i44);
                    i = i42;
                    int b17 = lr4.b();
                    int b18 = lr4.b();
                    if (b15 == 0) {
                        if (b16 == 65536) {
                            if (b17 != -65536) {
                                if (b17 == 65536) {
                                    z21 = b18 != 0;
                                    z22 = true;
                                    b17 = 65536;
                                }
                                b16 = 65536;
                            } else if (b18 == 0) {
                                z21 = false;
                                z22 = true;
                            } else {
                                z21 = true;
                                z22 = true;
                            }
                            if (z22 != z21) {
                                i4 = 90;
                                lr4.G(16);
                                short N8 = lr4.N();
                                lr4.G(2);
                                short N9 = lr4.N();
                                j12 = j9 == com.anythink.basead.exoplayer.b.f6539b ? j11 : j9;
                                long j21 = d(i47.f32222c).f28742c;
                                if (j12 == com.anythink.basead.exoplayer.b.f6539b) {
                                    j13 = j21;
                                    w9 = -9223372036854775807L;
                                } else {
                                    j13 = j21;
                                    w9 = AbstractC3548lu.w(j12, 1000000L, j13, RoundingMode.DOWN);
                                }
                                Ww j22 = j20.j(1835626086);
                                j22.getClass();
                                Ww j23 = j22.j(1937007212);
                                j23.getClass();
                                C3443jx i53 = j20.i(1835296868);
                                i53.getClass();
                                Lr lr5 = i53.f32222c;
                                lr5.E(8);
                                a9 = a(lr5.b());
                                lr5.G(a9 == 0 ? 8 : 16);
                                long P8 = lr5.P();
                                i9 = lr5.f26234b;
                                ArrayList arrayList6 = arrayList4;
                                i10 = 0;
                                while (true) {
                                    if (a9 == 0) {
                                        i11 = i9;
                                        i12 = 4;
                                    } else {
                                        i11 = i9;
                                        i12 = 8;
                                    }
                                    if (i10 >= i12) {
                                        j14 = P8;
                                        lr5.G(i12);
                                        break;
                                    }
                                    i41 = i10;
                                    if (lr5.f26233a[i11 + i10] != -1) {
                                        long P9 = a9 == 0 ? lr5.P() : lr5.j();
                                        if (P9 == 0) {
                                            j15 = -9223372036854775807L;
                                            j14 = P8;
                                        } else {
                                            j10 = AbstractC3548lu.w(P9, 1000000L, P8, RoundingMode.DOWN);
                                            j14 = P8;
                                        }
                                    } else {
                                        i10 = i41 + 1;
                                        i9 = i11;
                                    }
                                }
                                j15 = j10;
                                int L9 = lr5.L();
                                char[] cArr = {(char) (((L9 >> 10) & 31) + 96), (char) (((L9 >> 5) & 31) + 96), (char) ((L9 & 31) + 96)};
                                i14 = 0;
                                for (i13 = 3; i14 < i13; i13 = 3) {
                                    char c9 = cArr[i14];
                                    if (c9 < 'a' || c9 > 'z') {
                                        str = null;
                                        break;
                                    }
                                    i14++;
                                }
                                str = new String(cArr);
                                i15 = j23.i(1937011556);
                                String str18 = "BoxParsers";
                                if (i15 == null) {
                                    AbstractC3217fl.I("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                                    xa2 = xa;
                                    i16 = i46;
                                    str2 = str17;
                                    arrayList = arrayList6;
                                    b9 = -1;
                                    i17 = 4;
                                    x22 = null;
                                    i18 = 8;
                                } else {
                                    Lr lr6 = i15.f32222c;
                                    lr6.E(12);
                                    int b19 = lr6.b();
                                    boolean z23 = 12;
                                    F3.q qVar3 = new F3.q();
                                    i16 = i46;
                                    qVar3.f1061c = new Y2[b19];
                                    qVar3.f1060b = 0;
                                    int i54 = 0;
                                    while (i54 < b19) {
                                        int i55 = b19;
                                        int i56 = i54;
                                        int i57 = lr6.f26234b;
                                        Ww ww5 = ww4;
                                        int b20 = lr6.b();
                                        if (b20 > 0) {
                                            i21 = i57;
                                            z12 = true;
                                        } else {
                                            i21 = i57;
                                            z12 = false;
                                        }
                                        String str19 = "childAtomSize must be positive";
                                        AbstractC2720Pd.k("childAtomSize must be positive", z12);
                                        int b21 = lr6.b();
                                        long j24 = w9;
                                        if (b21 == 1635148593 || b21 == 1635148595 || b21 == 1701733238 || b21 == 1831958048 || b21 == 1836070006 || b21 == 1752589105 || b21 == 1751479857 || b21 == 1987470129 || b21 == 1987471665 || b21 == 1932670515 || b21 == 1211250227 || b21 == 1748121139 || b21 == 1987063864 || b21 == 1987063865 || b21 == 1635135537 || b21 == 1685479798 || b21 == 1685479729 || b21 == 1685481573 || b21 == 1685481521 || b21 == 1634760241 || b21 == 1684108849) {
                                            String str20 = str;
                                            lr = lr6;
                                            s3 = N9;
                                            String str21 = str18;
                                            int i58 = b14;
                                            arrayList2 = arrayList6;
                                            ww2 = ww5;
                                            int i59 = i21;
                                            int i60 = b20;
                                            j17 = j24;
                                            j18 = j13;
                                            lr.E(i59 + 16);
                                            lr.G(16);
                                            int L10 = lr.L();
                                            int L11 = lr.L();
                                            i22 = i56;
                                            lr.G(50);
                                            int i61 = lr.f26234b;
                                            str3 = str17;
                                            s6 = N8;
                                            int i62 = b21;
                                            int i63 = 1701733238;
                                            if (i62 == 1701733238) {
                                                Pair k6 = k(lr, i59, i60);
                                                if (k6 != null) {
                                                    i63 = ((Integer) k6.first).intValue();
                                                    if (ro == null) {
                                                        i21 = i59;
                                                        a10 = null;
                                                    } else {
                                                        i21 = i59;
                                                        a10 = ro.a(((Y2) k6.second).f28773b);
                                                    }
                                                    ro3 = a10;
                                                    ((Y2[]) qVar3.f1061c)[i22] = (Y2) k6.second;
                                                } else {
                                                    i21 = i59;
                                                    ro3 = ro;
                                                }
                                                int i64 = i63;
                                                lr.E(i61);
                                                i62 = i64;
                                                ro2 = ro3;
                                            } else {
                                                i21 = i59;
                                                ro2 = ro;
                                            }
                                            if (i62 == 1831958048) {
                                                i23 = i62;
                                                str4 = com.anythink.basead.exoplayer.k.o.f8612m;
                                            } else {
                                                i23 = 1211250227;
                                                if (i62 == 1211250227) {
                                                    str4 = com.anythink.basead.exoplayer.k.o.f8607g;
                                                } else {
                                                    i23 = i62;
                                                    str4 = null;
                                                }
                                            }
                                            int i65 = i4;
                                            RO ro4 = ro2;
                                            b10 = b13;
                                            i24 = L8;
                                            String str22 = str4;
                                            float f6 = 1.0f;
                                            List list = null;
                                            int i66 = -1;
                                            int i67 = -1;
                                            int i68 = 8;
                                            int i69 = -1;
                                            C2518Df c2518Df3 = null;
                                            int i70 = -1;
                                            int i71 = 8;
                                            boolean z24 = false;
                                            int i72 = -1;
                                            ByteBuffer byteBuffer = null;
                                            int i73 = -1;
                                            String str23 = null;
                                            int i74 = -1;
                                            int i75 = -1;
                                            GE ge = null;
                                            byte[] bArr = null;
                                            C3287h0 c3287h0 = null;
                                            E2 e22 = null;
                                            while (i61 - i21 < i60) {
                                                lr.E(i61);
                                                int i76 = lr.f26234b;
                                                int b22 = lr.b();
                                                int i77 = i61;
                                                if (b22 != 0) {
                                                    i27 = b22;
                                                } else {
                                                    if (lr.f26234b - i21 == i60) {
                                                        break;
                                                    }
                                                    i27 = 0;
                                                }
                                                if (i27 > 0) {
                                                    i28 = i60;
                                                    z13 = true;
                                                } else {
                                                    i28 = i60;
                                                    z13 = false;
                                                }
                                                AbstractC2720Pd.k(str19, z13);
                                                int b23 = lr.b();
                                                if (b23 == 1635148611) {
                                                    int i78 = i76 + 8;
                                                    AbstractC2720Pd.k(null, str22 == null);
                                                    lr.E(i78);
                                                    C0 a12 = C0.a(lr);
                                                    qVar3.f1059a = a12.f24114b;
                                                    if (z24) {
                                                        z18 = true;
                                                    } else {
                                                        f6 = a12.f24122k;
                                                        z18 = false;
                                                    }
                                                    ArrayList arrayList7 = a12.f24113a;
                                                    String str24 = a12.f24123l;
                                                    int i79 = a12.f24121j;
                                                    int i80 = a12.f24119g;
                                                    int i81 = a12.f24120h;
                                                    int i82 = a12.i;
                                                    int i83 = a12.f24117e;
                                                    i30 = a12.f24118f;
                                                    list = arrayList7;
                                                    str9 = str19;
                                                    str23 = str24;
                                                    i73 = i79;
                                                    qVar2 = qVar3;
                                                    i29 = i81;
                                                    i66 = i82;
                                                    i71 = i83;
                                                    i32 = i23;
                                                    str22 = com.anythink.basead.exoplayer.k.o.f8608h;
                                                    str11 = str21;
                                                    z24 = z18;
                                                    i70 = i80;
                                                } else if (b23 == 1752589123) {
                                                    int i84 = i76 + 8;
                                                    AbstractC2720Pd.k(null, str22 == null);
                                                    lr.E(i84);
                                                    Y0 a13 = Y0.a(lr, false, null);
                                                    qVar3.f1059a = a13.f28758b;
                                                    if (z24) {
                                                        z17 = true;
                                                    } else {
                                                        f6 = a13.f28767l;
                                                        z17 = false;
                                                    }
                                                    int i85 = a13.f28766k;
                                                    if (i85 != -1) {
                                                        i69 = i85;
                                                    }
                                                    List list2 = a13.f28757a;
                                                    int i86 = a13.f28768m;
                                                    int i87 = a13.f28759c;
                                                    String str25 = a13.f28769n;
                                                    int i88 = a13.f28760d;
                                                    int i89 = a13.f28761e;
                                                    int i90 = a13.f28764h;
                                                    int i91 = a13.i;
                                                    z24 = z17;
                                                    int i92 = a13.f28765j;
                                                    int i93 = a13.f28762f;
                                                    i30 = a13.f28763g;
                                                    list = list2;
                                                    str9 = str19;
                                                    qVar2 = qVar3;
                                                    i75 = i88;
                                                    i74 = i89;
                                                    i70 = i90;
                                                    i29 = i91;
                                                    i32 = i23;
                                                    i66 = i92;
                                                    i71 = i93;
                                                    str11 = str21;
                                                    c2518Df3 = a13.f28770o;
                                                    i73 = i86;
                                                    i72 = i87;
                                                    str22 = com.anythink.basead.exoplayer.k.o.i;
                                                    str23 = str25;
                                                } else {
                                                    if (b23 == 1818785347) {
                                                        int i94 = i76 + 8;
                                                        AbstractC2720Pd.k("lhvC must follow hvcC atom", com.anythink.basead.exoplayer.k.o.i.equals(str22));
                                                        if (c2518Df3 != null) {
                                                            z16 = ((UB) c2518Df3.f24453u).size() >= 2;
                                                        } else {
                                                            z16 = false;
                                                            c2518Df3 = null;
                                                        }
                                                        AbstractC2720Pd.k("must have at least two layers", z16);
                                                        lr.E(i94);
                                                        c2518Df3.getClass();
                                                        Y0 a14 = Y0.a(lr, true, c2518Df3);
                                                        AbstractC2720Pd.k("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", qVar3.f1059a == a14.f28758b);
                                                        int i95 = a14.f28764h;
                                                        if (i95 != -1) {
                                                            AbstractC2720Pd.k("colorSpace must be the same for both views", i70 == i95);
                                                        }
                                                        int i96 = a14.i;
                                                        if (i96 != -1) {
                                                            AbstractC2720Pd.k("colorRange must be the same for both views", i67 == i96);
                                                        }
                                                        int i97 = a14.f28765j;
                                                        if (i97 != -1) {
                                                            AbstractC2720Pd.k("colorTransfer must be the same for both views", i66 == i97);
                                                        }
                                                        AbstractC2720Pd.k("bitdepthLuma must be the same for both views", i71 == a14.f28762f);
                                                        AbstractC2720Pd.k("bitdepthChroma must be the same for both views", i68 == a14.f28763g);
                                                        if (list != null) {
                                                            SB sb = UB.f27942u;
                                                            RB rb = new RB(4);
                                                            rb.b(list);
                                                            rb.b(a14.f28757a);
                                                            list = rb.f();
                                                        } else {
                                                            AbstractC2720Pd.k("initializationData must be already set from hvcC atom", false);
                                                        }
                                                        String str26 = a14.f28769n;
                                                        str22 = "video/mv-hevc";
                                                        str23 = str26;
                                                        str9 = str19;
                                                        i29 = i67;
                                                        i30 = i68;
                                                        qVar2 = qVar3;
                                                        i32 = i23;
                                                        str11 = str21;
                                                    } else if (b23 == 1987470147) {
                                                        int i98 = i76 + 8;
                                                        AbstractC2720Pd.k(null, str22 == null);
                                                        lr.E(i98);
                                                        F3.q a15 = F3.q.a(lr);
                                                        qVar3.f1059a = a15.f1059a;
                                                        String str27 = (String) a15.f1062d;
                                                        C3675oC c3675oC2 = (C3675oC) a15.f1061c;
                                                        i71 = a15.f1060b;
                                                        i30 = i71;
                                                        str23 = str27;
                                                        str9 = str19;
                                                        list = c3675oC2;
                                                        i29 = i67;
                                                        str22 = "video/vvc";
                                                        qVar2 = qVar3;
                                                        i32 = i23;
                                                        str11 = str21;
                                                        i73 = 16;
                                                        i61 = i77 + i27;
                                                        str21 = str11;
                                                        i67 = i29;
                                                        i68 = i30;
                                                        i60 = i28;
                                                        str19 = str9;
                                                        i23 = i32;
                                                        qVar3 = qVar2;
                                                    } else {
                                                        if (b23 == 1986361461) {
                                                            lr.E(i76 + 8);
                                                            int i99 = lr.f26234b;
                                                            str10 = str22;
                                                            C3761pr c3761pr = null;
                                                            while (i99 - i76 < i27) {
                                                                lr.E(i99);
                                                                int b24 = lr.b();
                                                                if (b24 > 0) {
                                                                    i35 = i99;
                                                                    z15 = true;
                                                                } else {
                                                                    i35 = i99;
                                                                    z15 = false;
                                                                }
                                                                AbstractC2720Pd.k(str19, z15);
                                                                int i100 = i67;
                                                                if (lr.b() == 1702454643) {
                                                                    lr.E(i35 + 8);
                                                                    int i101 = lr.f26234b;
                                                                    while (true) {
                                                                        if (i101 - i35 >= b24) {
                                                                            str12 = str19;
                                                                            i36 = b24;
                                                                            c3761pr = null;
                                                                            break;
                                                                        }
                                                                        lr.E(i101);
                                                                        int b25 = lr.b();
                                                                        AbstractC2720Pd.k(str19, b25 > 0);
                                                                        int i102 = i101;
                                                                        if (lr.b() == 1937011305) {
                                                                            lr.G(4);
                                                                            int K8 = lr.K();
                                                                            int i103 = K8 & 1;
                                                                            boolean z25 = (K8 & 2) == 2;
                                                                            str12 = str19;
                                                                            boolean z26 = (K8 & 8) == 8;
                                                                            boolean z27 = 1 == i103;
                                                                            i36 = b24;
                                                                            G2 g22 = new G2();
                                                                            g22.f25091a = z27;
                                                                            g22.f25092b = z25;
                                                                            g22.f25093c = z26;
                                                                            c3761pr = new C3761pr(3, g22);
                                                                        } else {
                                                                            i101 = i102 + b25;
                                                                            str19 = str19;
                                                                        }
                                                                    }
                                                                } else {
                                                                    str12 = str19;
                                                                    i36 = b24;
                                                                }
                                                                i99 = i35 + i36;
                                                                i67 = i100;
                                                                str19 = str12;
                                                            }
                                                            str9 = str19;
                                                            i29 = i67;
                                                            Rx rx = c3761pr == null ? null : new Rx(3, c3761pr);
                                                            if (rx != null) {
                                                                C3761pr c3761pr2 = (C3761pr) rx.f27448u;
                                                                if (c2518Df3 == null) {
                                                                    c2518Df2 = null;
                                                                } else if (((UB) c2518Df3.f24453u).size() >= 2) {
                                                                    G2 g23 = (G2) c3761pr2.f33523u;
                                                                    AbstractC2720Pd.k("both eye views must be marked as available", g23.f25091a && g23.f25092b);
                                                                    AbstractC2720Pd.k("for MV-HEVC, eye_views_reversed must be set to false", !((G2) c3761pr2.f33523u).f25093c);
                                                                } else {
                                                                    c2518Df2 = c2518Df3;
                                                                }
                                                                if (i69 == -1) {
                                                                    c2518Df3 = c2518Df2;
                                                                    i30 = i68;
                                                                    qVar2 = qVar3;
                                                                    i32 = i23;
                                                                    if (true != ((G2) c3761pr2.f33523u).f25093c) {
                                                                        str11 = str21;
                                                                        str22 = str10;
                                                                        i69 = 4;
                                                                        i61 = i77 + i27;
                                                                        str21 = str11;
                                                                        i67 = i29;
                                                                        i68 = i30;
                                                                        i60 = i28;
                                                                        str19 = str9;
                                                                        i23 = i32;
                                                                        qVar3 = qVar2;
                                                                    } else {
                                                                        i69 = 5;
                                                                        str11 = str21;
                                                                        str22 = str10;
                                                                    }
                                                                } else {
                                                                    c2518Df3 = c2518Df2;
                                                                    i30 = i68;
                                                                    qVar2 = qVar3;
                                                                    i32 = i23;
                                                                    str11 = str21;
                                                                    str22 = str10;
                                                                    i61 = i77 + i27;
                                                                    str21 = str11;
                                                                    i67 = i29;
                                                                    i68 = i30;
                                                                    i60 = i28;
                                                                    str19 = str9;
                                                                    i23 = i32;
                                                                    qVar3 = qVar2;
                                                                }
                                                            }
                                                            i30 = i68;
                                                            qVar2 = qVar3;
                                                            c2518Df = c2518Df3;
                                                            i31 = i71;
                                                            i32 = i23;
                                                            str11 = str21;
                                                        } else {
                                                            str9 = str19;
                                                            str10 = str22;
                                                            i29 = i67;
                                                            if (b23 == 1685480259 || b23 == 1685485123 || b23 == 1685485379) {
                                                                i30 = i68;
                                                                qVar2 = qVar3;
                                                                c2518Df = c2518Df3;
                                                                i31 = i71;
                                                                i32 = i23;
                                                                str11 = str21;
                                                                ge = GE.a(lr);
                                                            } else {
                                                                if (b23 != 1987076931) {
                                                                    if (b23 == 1635135811) {
                                                                        int i104 = i27 - 8;
                                                                        byte[] bArr2 = new byte[i104];
                                                                        lr.H(bArr2, 0, i104);
                                                                        list = UB.j(bArr2);
                                                                        B0 e6 = B0.e(bArr2);
                                                                        if (e6 != null) {
                                                                            str23 = (String) e6.f23942y;
                                                                            i66 = e6.f23941x;
                                                                            i33 = e6.f23940w;
                                                                            i70 = e6.f23939v;
                                                                            i71 = e6.f23938u;
                                                                            i68 = i71;
                                                                        } else {
                                                                            i33 = i29;
                                                                        }
                                                                        str22 = "video/av01";
                                                                        i29 = i33;
                                                                        i30 = i68;
                                                                        qVar2 = qVar3;
                                                                        i32 = i23;
                                                                        str11 = str21;
                                                                    } else if (b23 == 1668050025) {
                                                                        if (byteBuffer == null) {
                                                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                        }
                                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                                        byteBuffer2.position(21);
                                                                        byteBuffer2.putShort(lr.N());
                                                                        byteBuffer2.putShort(lr.N());
                                                                        byteBuffer = byteBuffer2;
                                                                        i30 = i68;
                                                                        qVar2 = qVar3;
                                                                        i32 = i23;
                                                                        str11 = str21;
                                                                        str22 = str10;
                                                                    } else {
                                                                        if (b23 != 1835295606) {
                                                                            int i105 = 6;
                                                                            i30 = i68;
                                                                            qVar2 = qVar3;
                                                                            c2518Df = c2518Df3;
                                                                            i31 = i71;
                                                                            i32 = i23;
                                                                            if (b23 != 1681012275) {
                                                                                if (b23 == 1702061171) {
                                                                                    AbstractC2720Pd.k(null, str10 == null);
                                                                                    E2 j25 = j(i76, lr);
                                                                                    str22 = (String) j25.f24634v;
                                                                                    byte[] bArr3 = (byte[]) j25.f24635w;
                                                                                    if (bArr3 != null) {
                                                                                        list = UB.j(bArr3);
                                                                                    }
                                                                                    e22 = j25;
                                                                                    str11 = str21;
                                                                                } else {
                                                                                    if (b23 == 1651798644) {
                                                                                        lr.E(i76 + 8);
                                                                                        lr.G(4);
                                                                                        c3287h0 = new C3287h0(lr.P(), lr.P());
                                                                                    } else if (b23 == 1885434736) {
                                                                                        lr.E(i76 + 8);
                                                                                        f6 = lr.h() / lr.h();
                                                                                        str11 = str21;
                                                                                        str22 = str10;
                                                                                        c2518Df3 = c2518Df;
                                                                                        i71 = i31;
                                                                                        z24 = true;
                                                                                    } else if (b23 != 1937126244) {
                                                                                        if (b23 != 1936995172) {
                                                                                            if (b23 == 1634760259) {
                                                                                                int i106 = i27 - 12;
                                                                                                byte[] bArr4 = new byte[i106];
                                                                                                lr.E(i76 + 12);
                                                                                                lr.H(bArr4, 0, i106);
                                                                                                byte[] bArr5 = AbstractC4295zm.f35602a;
                                                                                                PA.E(i106, "Invalid APV CSD length: %s", i106 >= 17);
                                                                                                byte b26 = bArr4[0];
                                                                                                PA.E(b26, "Invalid APV CSD version: %s", b26 == 1);
                                                                                                int i107 = bArr4[5] & 255;
                                                                                                int i108 = bArr4[6] & 255;
                                                                                                int i109 = bArr4[7] & 255;
                                                                                                String str28 = AbstractC3548lu.f32613a;
                                                                                                Locale locale = Locale.US;
                                                                                                StringBuilder h10 = AbstractC5051n.h(i107, i108, "apv1.apvf", ".apvl", ".apvb");
                                                                                                h10.append(i109);
                                                                                                String sb2 = h10.toString();
                                                                                                C3675oC j26 = UB.j(bArr4);
                                                                                                Lr lr7 = new Lr(bArr4);
                                                                                                byte[] bArr6 = lr7.f26233a;
                                                                                                Er er = new Er(bArr6, bArr6.length);
                                                                                                int i110 = 8;
                                                                                                er.d(lr7.f26234b * 8);
                                                                                                int i111 = 1;
                                                                                                er.l(1);
                                                                                                int h11 = er.h(8);
                                                                                                int i112 = 0;
                                                                                                int i113 = -1;
                                                                                                int i114 = -1;
                                                                                                int i115 = -1;
                                                                                                int i116 = -1;
                                                                                                int i117 = -1;
                                                                                                while (i112 < h11) {
                                                                                                    er.l(i111);
                                                                                                    int h12 = er.h(i110);
                                                                                                    int i118 = 0;
                                                                                                    while (i118 < h12) {
                                                                                                        int i119 = i105;
                                                                                                        er.f(i119);
                                                                                                        boolean g9 = er.g();
                                                                                                        er.e();
                                                                                                        er.l(11);
                                                                                                        er.f(4);
                                                                                                        i117 = er.h(4) + 8;
                                                                                                        er.l(1);
                                                                                                        if (g9) {
                                                                                                            int h13 = er.h(i110);
                                                                                                            int h14 = er.h(i110);
                                                                                                            er.l(1);
                                                                                                            boolean g10 = er.g();
                                                                                                            i113 = C2980bK.b(h13);
                                                                                                            int i120 = true != g10 ? 2 : 1;
                                                                                                            i115 = C2980bK.c(h14);
                                                                                                            i114 = i120;
                                                                                                        }
                                                                                                        i118++;
                                                                                                        i105 = i119;
                                                                                                        i116 = i117;
                                                                                                        i110 = 8;
                                                                                                    }
                                                                                                    i112++;
                                                                                                    i111 = 1;
                                                                                                    i110 = 8;
                                                                                                }
                                                                                                C2980bK c2980bK = new C2980bK(i113, i114, i115, null, i116, i117);
                                                                                                int i121 = c2980bK.f29474e;
                                                                                                int i122 = c2980bK.f29475f;
                                                                                                int i123 = c2980bK.f29470a;
                                                                                                str23 = sb2;
                                                                                                list = j26;
                                                                                                i71 = i121;
                                                                                                i30 = i122;
                                                                                                i29 = c2980bK.f29471b;
                                                                                                str22 = "video/apv";
                                                                                                str11 = str21;
                                                                                                c2518Df3 = c2518Df;
                                                                                                i66 = c2980bK.f29472c;
                                                                                                i70 = i123;
                                                                                            } else if (b23 != 1668246642) {
                                                                                                str11 = str21;
                                                                                            } else if (i70 != -1) {
                                                                                                str11 = str21;
                                                                                            } else if (i66 == -1) {
                                                                                                int b27 = lr.b();
                                                                                                if (b27 == 1852009592 || b27 == 1852009571) {
                                                                                                    str11 = str21;
                                                                                                    int L12 = lr.L();
                                                                                                    int L13 = lr.L();
                                                                                                    lr.G(2);
                                                                                                    int i124 = 19;
                                                                                                    if (i27 != 19) {
                                                                                                        i124 = i27;
                                                                                                    } else if ((lr.K() & 128) != 0) {
                                                                                                        z14 = true;
                                                                                                        int b28 = C2980bK.b(L12);
                                                                                                        int i125 = true == z14 ? 2 : 1;
                                                                                                        i70 = b28;
                                                                                                        i66 = C2980bK.c(L13);
                                                                                                        i29 = i125;
                                                                                                        i27 = i124;
                                                                                                    }
                                                                                                    z14 = false;
                                                                                                    int b282 = C2980bK.b(L12);
                                                                                                    if (true == z14) {
                                                                                                    }
                                                                                                    i70 = b282;
                                                                                                    i66 = C2980bK.c(L13);
                                                                                                    i29 = i125;
                                                                                                    i27 = i124;
                                                                                                } else {
                                                                                                    str11 = str21;
                                                                                                    AbstractC3217fl.I(str11, "Unsupported color type: ".concat(AbstractC3551lx.g(b27)));
                                                                                                    i66 = -1;
                                                                                                    i70 = -1;
                                                                                                    str22 = str10;
                                                                                                    c2518Df3 = c2518Df;
                                                                                                    i71 = i31;
                                                                                                }
                                                                                            } else {
                                                                                                str11 = str21;
                                                                                                i70 = -1;
                                                                                            }
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        int K9 = lr.K();
                                                                                        lr.G(3);
                                                                                        if (K9 == 0) {
                                                                                            int K10 = lr.K();
                                                                                            if (K10 == 0) {
                                                                                                str11 = str21;
                                                                                                str22 = str10;
                                                                                                c2518Df3 = c2518Df;
                                                                                                i71 = i31;
                                                                                                i69 = 0;
                                                                                            } else if (K10 == 1) {
                                                                                                str11 = str21;
                                                                                                str22 = str10;
                                                                                                c2518Df3 = c2518Df;
                                                                                                i71 = i31;
                                                                                                i69 = 1;
                                                                                            } else if (K10 == 2) {
                                                                                                str11 = str21;
                                                                                                str22 = str10;
                                                                                                c2518Df3 = c2518Df;
                                                                                                i71 = i31;
                                                                                                i69 = 2;
                                                                                            } else if (K10 == 3) {
                                                                                                i69 = 3;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        str11 = str21;
                                                                                    } else {
                                                                                        int i126 = i76 + 8;
                                                                                        while (i126 - i76 < i27) {
                                                                                            lr.E(i126);
                                                                                            int b29 = lr.b() + i126;
                                                                                            if (lr.b() == 1886547818) {
                                                                                                bArr = Arrays.copyOfRange(lr.f26233a, i126, b29);
                                                                                            } else {
                                                                                                i126 = b29;
                                                                                            }
                                                                                        }
                                                                                        str11 = str21;
                                                                                        str22 = str10;
                                                                                        c2518Df3 = c2518Df;
                                                                                        i71 = i31;
                                                                                        bArr = null;
                                                                                    }
                                                                                    str11 = str21;
                                                                                    str22 = str10;
                                                                                }
                                                                                c2518Df3 = c2518Df;
                                                                                i71 = i31;
                                                                                break;
                                                                                break;
                                                                            }
                                                                            AbstractC2720Pd.k(null, str10 == null);
                                                                            str22 = com.anythink.basead.exoplayer.k.o.f8607g;
                                                                            str11 = str21;
                                                                        } else {
                                                                            if (byteBuffer == null) {
                                                                                byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                            }
                                                                            ByteBuffer byteBuffer3 = byteBuffer;
                                                                            short N10 = lr.N();
                                                                            short N11 = lr.N();
                                                                            short N12 = lr.N();
                                                                            short N13 = lr.N();
                                                                            i30 = i68;
                                                                            short N14 = lr.N();
                                                                            c2518Df = c2518Df3;
                                                                            short N15 = lr.N();
                                                                            i31 = i71;
                                                                            short N16 = lr.N();
                                                                            i32 = i23;
                                                                            short N17 = lr.N();
                                                                            long P10 = lr.P();
                                                                            long P11 = lr.P();
                                                                            qVar2 = qVar3;
                                                                            byteBuffer3.position(1);
                                                                            byteBuffer3.putShort(N14);
                                                                            byteBuffer3.putShort(N15);
                                                                            byteBuffer3.putShort(N10);
                                                                            byteBuffer3.putShort(N11);
                                                                            byteBuffer3.putShort(N12);
                                                                            byteBuffer3.putShort(N13);
                                                                            byteBuffer3.putShort(N16);
                                                                            byteBuffer3.putShort(N17);
                                                                            byteBuffer3.putShort((short) (P10 / 10000));
                                                                            byteBuffer3.putShort((short) (P11 / 10000));
                                                                            byteBuffer = byteBuffer3;
                                                                            str11 = str21;
                                                                            str22 = str10;
                                                                        }
                                                                        c2518Df3 = c2518Df;
                                                                        i71 = i31;
                                                                    }
                                                                    break;
                                                                    break;
                                                                }
                                                                int i127 = i76 + 12;
                                                                AbstractC2720Pd.k(null, str10 == null);
                                                                lr.E(i127);
                                                                byte K11 = (byte) lr.K();
                                                                byte K12 = (byte) lr.K();
                                                                int K13 = lr.K();
                                                                int i128 = K13 >> 4;
                                                                int i129 = K13 >> 1;
                                                                String str29 = i23 == 1987063864 ? com.anythink.basead.exoplayer.k.o.f8609j : com.anythink.basead.exoplayer.k.o.f8610k;
                                                                if (str29.equals(com.anythink.basead.exoplayer.k.o.f8610k)) {
                                                                    byte[] bArr7 = AbstractC4295zm.f35602a;
                                                                    byte[] bArr8 = new byte[12];
                                                                    i34 = 1;
                                                                    bArr8[0] = 1;
                                                                    bArr8[1] = 1;
                                                                    bArr8[2] = K11;
                                                                    bArr8[3] = 2;
                                                                    bArr8[4] = 1;
                                                                    bArr8[5] = K12;
                                                                    c4 = 6;
                                                                    bArr8[6] = 3;
                                                                    bArr8[7] = 1;
                                                                    bArr8[8] = (byte) i128;
                                                                    bArr8[9] = 4;
                                                                    bArr8[i] = 1;
                                                                    bArr8[11] = (byte) (i129 & 7);
                                                                    list = UB.j(bArr8);
                                                                } else {
                                                                    i34 = 1;
                                                                    c4 = 6;
                                                                }
                                                                int i130 = K13 & 1;
                                                                int K14 = lr.K();
                                                                int K15 = lr.K();
                                                                int b30 = C2980bK.b(K14);
                                                                int i131 = i34 != i130 ? 2 : 1;
                                                                int c10 = C2980bK.c(K15);
                                                                i29 = i131;
                                                                i71 = i128;
                                                                i30 = i71;
                                                                qVar2 = qVar3;
                                                                str22 = str29;
                                                                i32 = i23;
                                                                i70 = b30;
                                                                i66 = c10;
                                                                str11 = str21;
                                                                i61 = i77 + i27;
                                                                str21 = str11;
                                                                i67 = i29;
                                                                i68 = i30;
                                                                i60 = i28;
                                                                str19 = str9;
                                                                i23 = i32;
                                                                qVar3 = qVar2;
                                                            }
                                                        }
                                                        str22 = str10;
                                                        c2518Df3 = c2518Df;
                                                        i71 = i31;
                                                        i61 = i77 + i27;
                                                        str21 = str11;
                                                        i67 = i29;
                                                        i68 = i30;
                                                        i60 = i28;
                                                        str19 = str9;
                                                        i23 = i32;
                                                        qVar3 = qVar2;
                                                    }
                                                    i61 = i77 + i27;
                                                    str21 = str11;
                                                    i67 = i29;
                                                    i68 = i30;
                                                    i60 = i28;
                                                    str19 = str9;
                                                    i23 = i32;
                                                    qVar3 = qVar2;
                                                }
                                                i61 = i77 + i27;
                                                str21 = str11;
                                                i67 = i29;
                                                i68 = i30;
                                                i60 = i28;
                                                str19 = str9;
                                                i23 = i32;
                                                qVar3 = qVar2;
                                            }
                                            i25 = i60;
                                            String str30 = str22;
                                            int i132 = i67;
                                            int i133 = i68;
                                            F3.q qVar4 = qVar3;
                                            int i134 = i71;
                                            str5 = str21;
                                            r70 = 12;
                                            r70 = 12;
                                            if (ge != null) {
                                                str6 = ge.f25128b;
                                                str7 = "video/dolby-vision";
                                            } else {
                                                str6 = str23;
                                                str7 = str30;
                                            }
                                            if (str7 == null) {
                                                str8 = str20;
                                                i26 = i65;
                                                b14 = i58;
                                                qVar = qVar4;
                                            } else {
                                                C4065vP c4065vP = new C4065vP();
                                                b14 = i58;
                                                c4065vP.c(b14);
                                                c4065vP.e(str7);
                                                c4065vP.f34781j = str6;
                                                c4065vP.f34792u = L10;
                                                c4065vP.f34793v = L11;
                                                c4065vP.f34794w = i75;
                                                c4065vP.f34795x = i74;
                                                c4065vP.f34760A = f6;
                                                i26 = i65;
                                                c4065vP.f34797z = i26;
                                                c4065vP.f34761B = bArr;
                                                c4065vP.f34762C = i69;
                                                c4065vP.f34788q = list;
                                                c4065vP.f34787p = i73;
                                                c4065vP.f34764E = i72;
                                                c4065vP.f34789r = ro4;
                                                str8 = str20;
                                                c4065vP.f34776d = str8;
                                                c4065vP.f34763D = new C2980bK(i70, i132, i66, byteBuffer != null ? byteBuffer.array() : null, i134, i133);
                                                C3287h0 c3287h02 = c3287h0;
                                                if (c3287h02 != null) {
                                                    c4065vP.f34780h = AbstractC3194fG.o(c3287h02.f31130a);
                                                    c4065vP.i = AbstractC3194fG.o(c3287h02.f31131b);
                                                } else {
                                                    E2 e23 = e22;
                                                    if (e23 != null) {
                                                        c4065vP.f34780h = AbstractC3194fG.o(e23.f24632n);
                                                        c4065vP.i = AbstractC3194fG.o(e23.f24633u);
                                                    }
                                                }
                                                qVar = qVar4;
                                                qVar.f1062d = new TP(c4065vP);
                                            }
                                        } else {
                                            if (b21 == 1836069985 || b21 == 1701733217 || b21 == 1633889587 || b21 == 1700998451 || b21 == 1633889588 || b21 == 1835823201 || b21 == 1685353315 || b21 == 1685353317 || b21 == 1685353320 || b21 == 1685353324 || b21 == 1685353336 || b21 == 1935764850 || b21 == 1935767394 || b21 == 1819304813 || b21 == 1936684916 || b21 == 1953984371 || b21 == 778924082 || b21 == 778924083 || b21 == 1835557169 || b21 == 1835560241 || b21 == 1634492771 || b21 == 1634492791 || b21 == 1970037111 || b21 == 1332770163 || b21 == 1716281667 || b21 == 1767992678 || b21 == 1768973165) {
                                                z19 = z9;
                                                str13 = str;
                                                lr = lr6;
                                                i37 = b21;
                                                s3 = N9;
                                                str14 = str18;
                                                i38 = b14;
                                                arrayList2 = arrayList6;
                                                ww2 = ww5;
                                                i39 = i21;
                                                i40 = b20;
                                                j17 = j24;
                                                j18 = j13;
                                                i = 10;
                                            } else if (b21 == 1718641517) {
                                                z19 = z9;
                                                str13 = str;
                                                lr = lr6;
                                                i37 = b21;
                                                s3 = N9;
                                                str14 = str18;
                                                i38 = b14;
                                                arrayList2 = arrayList6;
                                                ww2 = ww5;
                                                i39 = i21;
                                                i40 = b20;
                                                j17 = j24;
                                                j18 = j13;
                                            } else {
                                                if (b21 != 1414810956 && b21 != 1954034535 && b21 != 2004251764 && b21 != 1937010800 && b21 != 1664495672 && b21 != 1836070003) {
                                                    if (b21 != 1952807028) {
                                                        if (b21 == 1835365492) {
                                                            lr6.E(i21 + 16);
                                                            lr6.m();
                                                            String m8 = lr6.m();
                                                            if (m8 != null) {
                                                                C4065vP c4065vP2 = new C4065vP();
                                                                c4065vP2.c(b14);
                                                                c4065vP2.e(m8);
                                                                qVar3.f1062d = new TP(c4065vP2);
                                                            }
                                                        } else if (b21 == 1667329389) {
                                                            C4065vP c4065vP3 = new C4065vP();
                                                            c4065vP3.c(b14);
                                                            c4065vP3.e(com.anythink.basead.exoplayer.k.o.ah);
                                                            qVar3.f1062d = new TP(c4065vP3);
                                                        }
                                                        s3 = N9;
                                                        str5 = str18;
                                                        qVar = qVar3;
                                                        i22 = i56;
                                                        i24 = L8;
                                                        str3 = str17;
                                                        r70 = z23;
                                                        arrayList2 = arrayList6;
                                                        ww2 = ww5;
                                                        i25 = b20;
                                                        j17 = j24;
                                                        j18 = j13;
                                                        i26 = i4;
                                                        str8 = str;
                                                        lr = lr6;
                                                        b10 = b13;
                                                        s6 = N8;
                                                    }
                                                }
                                                lr6.E(i21 + 16);
                                                if (b21 == 1414810956) {
                                                    lr2 = lr6;
                                                    str15 = str18;
                                                    str16 = str17;
                                                } else if (b21 == 1954034535) {
                                                    int i135 = b20 - 16;
                                                    byte[] bArr9 = new byte[i135];
                                                    lr6.H(bArr9, 0, i135);
                                                    c3675oC = UB.j(bArr9);
                                                    str16 = com.anythink.basead.exoplayer.k.o.aa;
                                                    lr2 = lr6;
                                                    str15 = str18;
                                                    j19 = Long.MAX_VALUE;
                                                    if (str16 != null) {
                                                        C4065vP c4065vP4 = new C4065vP();
                                                        c4065vP4.c(b14);
                                                        c4065vP4.e(str16);
                                                        c4065vP4.f34776d = str;
                                                        c4065vP4.f34790s = j19;
                                                        c4065vP4.f34788q = c3675oC;
                                                        qVar3.f1062d = new TP(c4065vP4);
                                                    }
                                                    s3 = N9;
                                                    qVar = qVar3;
                                                    i22 = i56;
                                                    i24 = L8;
                                                    str3 = str17;
                                                    r70 = z23;
                                                    arrayList2 = arrayList6;
                                                    ww2 = ww5;
                                                    i25 = b20;
                                                    j17 = j24;
                                                    j18 = j13;
                                                    str5 = str15;
                                                    i = 10;
                                                    i26 = i4;
                                                    str8 = str;
                                                    b10 = b13;
                                                    s6 = N8;
                                                    lr = lr2;
                                                } else {
                                                    if (b21 == 2004251764) {
                                                        lr2 = lr6;
                                                        str16 = com.anythink.basead.exoplayer.k.o.ab;
                                                    } else if (b21 == 1937010800) {
                                                        lr2 = lr6;
                                                        str15 = str18;
                                                        str16 = str17;
                                                        j19 = 0;
                                                        c3675oC = null;
                                                        if (str16 != null) {
                                                        }
                                                        s3 = N9;
                                                        qVar = qVar3;
                                                        i22 = i56;
                                                        i24 = L8;
                                                        str3 = str17;
                                                        r70 = z23;
                                                        arrayList2 = arrayList6;
                                                        ww2 = ww5;
                                                        i25 = b20;
                                                        j17 = j24;
                                                        j18 = j13;
                                                        str5 = str15;
                                                        i = 10;
                                                        i26 = i4;
                                                        str8 = str;
                                                        b10 = b13;
                                                        s6 = N8;
                                                        lr = lr2;
                                                    } else if (b21 == 1664495672) {
                                                        qVar3.f1060b = 1;
                                                        str16 = com.anythink.basead.exoplayer.k.o.ac;
                                                        lr2 = lr6;
                                                    } else {
                                                        if (b21 == 1836070003) {
                                                            int i136 = lr6.f26234b;
                                                            lr6.G(4);
                                                            if (lr6.b() == 1702061171) {
                                                                byte[] bArr10 = (byte[]) j(i136, lr6).f24635w;
                                                                if (bArr10 == null) {
                                                                    s3 = N9;
                                                                    str5 = str18;
                                                                    qVar = qVar3;
                                                                    i22 = i56;
                                                                    i24 = L8;
                                                                    str3 = str17;
                                                                    z20 = z23;
                                                                    arrayList2 = arrayList6;
                                                                    ww2 = ww5;
                                                                    i25 = b20;
                                                                    j17 = j24;
                                                                    j18 = j13;
                                                                } else if (bArr10.length == 64) {
                                                                    PA.T(bArr10.length == 64);
                                                                    ArrayList arrayList8 = new ArrayList(16);
                                                                    int i137 = 0;
                                                                    while (i137 < bArr10.length - 3) {
                                                                        Lr lr8 = lr6;
                                                                        byte[] bArr11 = bArr10;
                                                                        int i138 = i137;
                                                                        int w10 = AbstractC3194fG.w(bArr10[i137], bArr10[i137 + 1], bArr11[i137 + 2], bArr11[i137 + 3]);
                                                                        String str31 = AbstractC3548lu.f32613a;
                                                                        int i139 = ((w10 >> 8) & com.anythink.basead.exoplayer.k.p.f8630b) - 128;
                                                                        int i140 = (w10 >> 16) & com.anythink.basead.exoplayer.k.p.f8630b;
                                                                        int max = Math.max(0, Math.min(((i139 * 14075) / 10000) + i140, com.anythink.basead.exoplayer.k.p.f8630b)) << 16;
                                                                        int i141 = (w10 & com.anythink.basead.exoplayer.k.p.f8630b) - 128;
                                                                        arrayList8.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i141 * 17790) / 10000) + i140, com.anythink.basead.exoplayer.k.p.f8630b)) | max | (Math.max(0, Math.min((i140 - ((i141 * 3455) / 10000)) - ((i139 * 7169) / 10000), com.anythink.basead.exoplayer.k.p.f8630b)) << 8))));
                                                                        i137 = i138 + 4;
                                                                        lr6 = lr8;
                                                                        bArr10 = bArr11;
                                                                        str18 = str18;
                                                                    }
                                                                    lr2 = lr6;
                                                                    str15 = str18;
                                                                    Iterator it = arrayList8.iterator();
                                                                    StringBuilder sb3 = new StringBuilder();
                                                                    AbstractC2655Lg.t(sb3, it, ", ");
                                                                    String sb4 = sb3.toString();
                                                                    StringBuilder sb5 = new StringBuilder(AbstractC5051n.a(AbstractC5051n.a(String.valueOf((int) N8).length() + 7, i, String.valueOf((int) N9)), 1, sb4));
                                                                    sb5.append("size: ");
                                                                    sb5.append((int) N8);
                                                                    sb5.append("x");
                                                                    sb5.append((int) N9);
                                                                    String o9 = D.y.o(sb5, "\npalette: ", sb4, "\n");
                                                                    String str32 = AbstractC3548lu.f32613a;
                                                                    C3675oC j27 = UB.j(o9.getBytes(StandardCharsets.UTF_8));
                                                                    str16 = com.anythink.basead.exoplayer.k.o.ae;
                                                                    c3675oC = j27;
                                                                } else {
                                                                    s3 = N9;
                                                                    str5 = str18;
                                                                    qVar = qVar3;
                                                                    i22 = i56;
                                                                    i24 = L8;
                                                                    str3 = str17;
                                                                    z20 = z23;
                                                                    arrayList2 = arrayList6;
                                                                    ww2 = ww5;
                                                                    i25 = b20;
                                                                    j17 = j24;
                                                                    j18 = j13;
                                                                }
                                                                r70 = z20;
                                                                i26 = i4;
                                                                str8 = str;
                                                                lr = lr6;
                                                                b10 = b13;
                                                                s6 = N8;
                                                            } else {
                                                                lr2 = lr6;
                                                                str15 = str18;
                                                                c3675oC = null;
                                                                str16 = null;
                                                            }
                                                            j19 = Long.MAX_VALUE;
                                                        } else {
                                                            lr2 = lr6;
                                                            str15 = str18;
                                                            str16 = "text/x-unknown";
                                                            j19 = Long.MAX_VALUE;
                                                            c3675oC = null;
                                                        }
                                                        if (str16 != null) {
                                                        }
                                                        s3 = N9;
                                                        qVar = qVar3;
                                                        i22 = i56;
                                                        i24 = L8;
                                                        str3 = str17;
                                                        r70 = z23;
                                                        arrayList2 = arrayList6;
                                                        ww2 = ww5;
                                                        i25 = b20;
                                                        j17 = j24;
                                                        j18 = j13;
                                                        str5 = str15;
                                                        i = 10;
                                                        i26 = i4;
                                                        str8 = str;
                                                        b10 = b13;
                                                        s6 = N8;
                                                        lr = lr2;
                                                    }
                                                    str15 = str18;
                                                }
                                                j19 = Long.MAX_VALUE;
                                                c3675oC = null;
                                                if (str16 != null) {
                                                }
                                                s3 = N9;
                                                qVar = qVar3;
                                                i22 = i56;
                                                i24 = L8;
                                                str3 = str17;
                                                r70 = z23;
                                                arrayList2 = arrayList6;
                                                ww2 = ww5;
                                                i25 = b20;
                                                j17 = j24;
                                                j18 = j13;
                                                str5 = str15;
                                                i = 10;
                                                i26 = i4;
                                                str8 = str;
                                                b10 = b13;
                                                s6 = N8;
                                                lr = lr2;
                                            }
                                            i(lr, i37, i39, i40, i38, str13, z19, ro, qVar3, i56);
                                            i21 = i39;
                                            i25 = i40;
                                            b14 = i38;
                                            i22 = i56;
                                            b10 = b13;
                                            i24 = L8;
                                            str3 = str17;
                                            s6 = N8;
                                            str5 = str14;
                                            r70 = 12;
                                            i26 = i4;
                                            str8 = str13;
                                            qVar = qVar3;
                                        }
                                        lr.E(i21 + i25);
                                        i54 = i22 + 1;
                                        lr6 = lr;
                                        str18 = str5;
                                        qVar3 = qVar;
                                        N8 = s6;
                                        str17 = str3;
                                        b19 = i55;
                                        b13 = b10;
                                        L8 = i24;
                                        arrayList6 = arrayList2;
                                        ww4 = ww2;
                                        j13 = j18;
                                        w9 = j17;
                                        z23 = r70;
                                        str = str8;
                                        i4 = i26;
                                        N9 = s3;
                                    }
                                    long j28 = w9;
                                    F3.q qVar5 = qVar3;
                                    byte b31 = b13;
                                    int i142 = L8;
                                    str2 = str17;
                                    arrayList = arrayList6;
                                    long j29 = j13;
                                    b9 = -1;
                                    Ww j30 = ww4.j(1953654118);
                                    if (j30 == null || (i20 = j30.i(1667785072)) == null) {
                                        i17 = 4;
                                        i18 = 8;
                                    } else {
                                        Lr lr9 = i20.f32222c;
                                        i18 = 8;
                                        lr9.E(8);
                                        i17 = 4;
                                        if (lr9.B() >= 4) {
                                            i19 = lr9.b();
                                            if (!z8 || (j16 = ww4.j(1701082227)) == null || (h9 = h(j16)) == null) {
                                                uc = null;
                                                uc2 = null;
                                            } else {
                                                uc2 = (UC) h9.first;
                                                uc = (UC) h9.second;
                                            }
                                            tp = (TP) qVar5.f1062d;
                                            if (tp != null) {
                                                xa2 = xa;
                                                x22 = null;
                                            } else {
                                                if (i142 != 0) {
                                                    Hw hw = new Hw(i142);
                                                    C4065vP c4065vP5 = new C4065vP(tp);
                                                    R3 r32 = tp.f27773l;
                                                    c4065vP5.f34782k = r32 != null ? r32.c(hw) : new R3(hw);
                                                    tp = new TP(c4065vP5);
                                                }
                                                boolean z28 = !Objects.equals(tp.f27776o, "text/x-unknown");
                                                W2 w22 = new W2();
                                                w22.f28347a = b14;
                                                w22.f28348b = b31;
                                                w22.f28349c = j14;
                                                w22.f28350d = j29;
                                                w22.f28351e = j28;
                                                w22.f28352f = j15;
                                                w22.f28353g = tp;
                                                w22.f28354h = qVar5.f1060b;
                                                w22.i = (Y2[]) ((Y2[]) qVar5.f1061c).clone();
                                                w22.f28355j = qVar5.f1059a;
                                                w22.f28356k = uc2;
                                                w22.f28357l = uc;
                                                w22.f28358m = z28;
                                                w22.a(i19);
                                                w22.f28353g.getClass();
                                                x22 = new X2(w22);
                                                xa2 = xa;
                                            }
                                            x23 = (X2) xa2.apply(x22);
                                            if (x23 != null) {
                                                Ww j31 = ww4.j(1835297121);
                                                j31.getClass();
                                                Ww j32 = j31.j(1835626086);
                                                j32.getClass();
                                                Ww j33 = j32.j(1937007212);
                                                j33.getClass();
                                                C2908a3 g11 = g(x23, j33, x02);
                                                arrayList3 = arrayList;
                                                arrayList3.add(g11);
                                            } else {
                                                arrayList3 = arrayList;
                                            }
                                        }
                                    }
                                    i19 = -1;
                                    if (z8) {
                                    }
                                    uc = null;
                                    uc2 = null;
                                    tp = (TP) qVar5.f1062d;
                                    if (tp != null) {
                                    }
                                    x23 = (X2) xa2.apply(x22);
                                    if (x23 != null) {
                                    }
                                }
                            }
                            b16 = 65536;
                        }
                        b15 = 0;
                    }
                    if (b15 == 0) {
                        if (b16 == -65536) {
                            if (b17 != 65536) {
                                if (b17 == -65536) {
                                    z10 = b18 != 0;
                                    z11 = true;
                                    b17 = -65536;
                                }
                                b16 = -65536;
                            } else {
                                z10 = b18 != 0;
                                z11 = true;
                            }
                            if (z11 != z10) {
                                i4 = 270;
                                lr4.G(16);
                                short N82 = lr4.N();
                                lr4.G(2);
                                short N92 = lr4.N();
                                if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                                }
                                long j212 = d(i47.f32222c).f28742c;
                                if (j12 == com.anythink.basead.exoplayer.b.f6539b) {
                                }
                                Ww j222 = j20.j(1835626086);
                                j222.getClass();
                                Ww j232 = j222.j(1937007212);
                                j232.getClass();
                                C3443jx i532 = j20.i(1835296868);
                                i532.getClass();
                                Lr lr52 = i532.f32222c;
                                lr52.E(8);
                                a9 = a(lr52.b());
                                lr52.G(a9 == 0 ? 8 : 16);
                                long P82 = lr52.P();
                                i9 = lr52.f26234b;
                                ArrayList arrayList62 = arrayList4;
                                i10 = 0;
                                while (true) {
                                    if (a9 == 0) {
                                    }
                                    if (i10 >= i12) {
                                    }
                                    i10 = i41 + 1;
                                    i9 = i11;
                                }
                                j15 = j10;
                                int L92 = lr52.L();
                                char[] cArr2 = {(char) (((L92 >> 10) & 31) + 96), (char) (((L92 >> 5) & 31) + 96), (char) ((L92 & 31) + 96)};
                                i14 = 0;
                                while (i14 < i13) {
                                }
                                str = new String(cArr2);
                                i15 = j232.i(1937011556);
                                String str182 = "BoxParsers";
                                if (i15 == null) {
                                }
                            }
                            b16 = -65536;
                        }
                        b15 = 0;
                    }
                    i4 = ((b15 == -65536 || b15 == 65536) && b16 == 0 && b17 == 0 && b18 == -65536) ? 180 : 0;
                    lr4.G(16);
                    short N822 = lr4.N();
                    lr4.G(2);
                    short N922 = lr4.N();
                    if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                    }
                    long j2122 = d(i47.f32222c).f28742c;
                    if (j12 == com.anythink.basead.exoplayer.b.f6539b) {
                    }
                    Ww j2222 = j20.j(1835626086);
                    j2222.getClass();
                    Ww j2322 = j2222.j(1937007212);
                    j2322.getClass();
                    C3443jx i5322 = j20.i(1835296868);
                    i5322.getClass();
                    Lr lr522 = i5322.f32222c;
                    lr522.E(8);
                    a9 = a(lr522.b());
                    lr522.G(a9 == 0 ? 8 : 16);
                    long P822 = lr522.P();
                    i9 = lr522.f26234b;
                    ArrayList arrayList622 = arrayList4;
                    i10 = 0;
                    while (true) {
                        if (a9 == 0) {
                        }
                        if (i10 >= i12) {
                        }
                        i10 = i41 + 1;
                        i9 = i11;
                    }
                    j15 = j10;
                    int L922 = lr522.L();
                    char[] cArr22 = {(char) (((L922 >> 10) & 31) + 96), (char) (((L922 >> 5) & 31) + 96), (char) ((L922 & 31) + 96)};
                    i14 = 0;
                    while (i14 < i13) {
                    }
                    str = new String(cArr22);
                    i15 = j2322.i(1937011556);
                    String str1822 = "BoxParsers";
                    if (i15 == null) {
                    }
                }
                x23 = (X2) xa2.apply(x22);
                if (x23 != null) {
                }
            }
            ww3 = ww;
            b11 = b9;
            i45 = i18;
            str17 = str2;
            i42 = i;
            i43 = 16;
            i44 = i17;
            i46 = i16 + 1;
            arrayList4 = arrayList3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f0, code lost:
    
        if (r13 != 1684108385) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f2, code lost:
    
        r10 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f3, code lost:
    
        if (r13 != 1684108385) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f5, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f6, code lost:
    
        r1.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01fa, code lost:
    
        if (r2 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fc, code lost:
    
        if (r8 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0200, code lost:
    
        if (r9 != (-1)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0205, code lost:
    
        r1.E(r9);
        r1.G(16);
        r8 = new com.google.android.gms.internal.ads.C2907a2(r2, r8, r1.l(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0202, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02d5, code lost:
    
        r0 = com.google.android.gms.internal.ads.AbstractC3551lx.g(r8);
        r8 = new java.lang.StringBuilder(r0.length() + 32);
        r8.append("Skipped unknown metadata entry: ");
        r8.append(r0);
        com.google.android.gms.internal.ads.AbstractC3217fl.o("MetadataUtil", r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x007d, code lost:
    
        r2 = com.google.android.gms.internal.ads.Z1.a(com.google.android.gms.internal.ads.AbstractC3217fl.V(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0087, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0089, code lost:
    
        r8 = new com.google.android.gms.internal.ads.C3071d2("TCON", r13, com.google.android.gms.internal.ads.UB.j(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0097, code lost:
    
        com.google.android.gms.internal.ads.AbstractC3217fl.I("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x030f, code lost:
    
        r1.E(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0312, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x021b, code lost:
    
        r0 = r8 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0220, code lost:
    
        if (r0 != 6516084) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0222, code lost:
    
        r2 = r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x022c, code lost:
    
        if (r1.b() != 1684108385) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x022e, code lost:
    
        r1.G(8);
        r0 = r1.l(r2 - 16);
        r8 = new com.google.android.gms.internal.ads.W1(com.anythink.basead.exoplayer.b.ar, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0242, code lost:
    
        com.google.android.gms.internal.ads.AbstractC3217fl.I("MetadataUtil", "Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.AbstractC3551lx.g(r8)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0251, code lost:
    
        if (r0 == 7233901) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0256, code lost:
    
        if (r0 != 7631467) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x025d, code lost:
    
        if (r0 == 6516589) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0262, code lost:
    
        if (r0 != 7828084) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.E(r5);
        r1.G(r2);
        r5 = new java.util.ArrayList();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0269, code lost:
    
        if (r0 != 6578553) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026b, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(r8, "TDRC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0276, code lost:
    
        if (r0 != 4280916) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0278, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(r8, "TPE1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0283, code lost:
    
        if (r0 != 7630703) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0285, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(r8, "TSSE", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r8 = r1.f26234b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0290, code lost:
    
        if (r0 != 6384738) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0292, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(r8, "TALB", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x029c, code lost:
    
        if (r0 != 7108978) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x029e, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(r8, "USLT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02a8, code lost:
    
        if (r0 != 6776174) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02aa, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(r8, "TCON", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r8 >= r7) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02b2, code lost:
    
        if (r0 != 6779504) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02b4, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(r8, "TIT1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02be, code lost:
    
        if (r0 != 7173742) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c0, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(r8, "MVNM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ca, code lost:
    
        if (r0 != 7173737) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02cc, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.R(r8, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02f3, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(r8, "TCOM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02fa, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(r8, "TIT2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r14 = r1.b() + r8;
        r8 = r1.b();
        r15 = (r8 >> 24) & com.anythink.basead.exoplayer.k.p.f8630b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0317, code lost:
    
        if (r5.isEmpty() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x031b, code lost:
    
        r13 = new com.google.android.gms.internal.ads.R3(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r15 == 169) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r15 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r8 != 1735291493) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r8 != 1684632427) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.Z(1684632427, "TPOS", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0303, code lost:
    
        if (r8 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0305, code lost:
    
        r5.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0308, code lost:
    
        r0 = true;
        r4 = 0;
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        if (r8 != 1953655662) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.Z(1953655662, "TRCK", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        if (r8 != 1953329263) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.R(1953329263, "TBPM", r1, r0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        if (r8 != 1668311404) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.R(1668311404, "TCMP", r1, r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if (r8 != 1668249202) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        r8 = r1.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (r1.b() != 1684108385) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
    
        r9 = r1.b() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
    
        if (r9 != 13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        r11 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
    
        if (r11 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        r11 = new java.lang.StringBuilder(java.lang.String.valueOf(r9).length() + 30);
        r11.append("Unrecognized cover art flags: ");
        r11.append(r9);
        com.google.android.gms.internal.ads.AbstractC3217fl.I("MetadataUtil", r11.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
    
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        r1.G(4);
        r8 = r8 - 16;
        r2 = new byte[r8];
        r1.H(r2, r4, r8);
        r8 = new com.google.android.gms.internal.ads.S1(r11, r13, 3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        if (r9 != 14) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
    
        r11 = "image/png";
        r9 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fd, code lost:
    
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0131, code lost:
    
        com.google.android.gms.internal.ads.AbstractC3217fl.I("MetadataUtil", "Failed to parse cover art attribute");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
    
        if (r8 != 1631670868) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013d, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(1631670868, "TPE2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0148, code lost:
    
        if (r8 != 1936682605) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014a, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(1936682605, "TSOT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0155, code lost:
    
        if (r8 != 1936679276) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0157, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(1936679276, "TSOA", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0162, code lost:
    
        if (r8 != 1936679282) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0164, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(1936679282, "TSOP", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016f, code lost:
    
        if (r8 != 1936679265) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0171, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(1936679265, "TSO2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
    
        if (r8 != 1936679791) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017e, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(1936679791, "TSOC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0189, code lost:
    
        if (r8 != 1920233063) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.R(1920233063, "ITUNESADVISORY", r1, r4, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0196, code lost:
    
        if (r8 != 1885823344) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0198, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.R(1885823344, "ITUNESGAPLESS", r1, r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a3, code lost:
    
        if (r8 != 1936683886) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a5, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(1936683886, "TVSHOWSORT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b0, code lost:
    
        if (r8 != 1953919848) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b2, code lost:
    
        r8 = com.google.android.gms.internal.ads.AbstractC3217fl.L(1953919848, "TVSHOW", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bd, code lost:
    
        if (r8 != 757935405) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bf, code lost:
    
        r2 = r13;
        r8 = r2;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
    
        r12 = r1.f26234b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c6, code lost:
    
        if (r12 >= r14) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c8, code lost:
    
        r15 = r1.b();
        r13 = r1.b();
        r1.G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d7, code lost:
    
        if (r13 != 1835360622) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d9, code lost:
    
        r2 = r1.l(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e2, code lost:
    
        r0 = r15 - 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r13 != 1851878757) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r8 = r1.l(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b9  */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static R3 c(C3443jx c3443jx) {
        int i;
        boolean z8;
        R3 r32;
        boolean z9;
        R3 r33;
        ArrayList arrayList;
        R3 r34;
        Ax ax;
        InterfaceC4043v3[] interfaceC4043v3Arr;
        R3 r35;
        int i4;
        int i9;
        boolean z10 = true;
        Lr lr = c3443jx.f32222c;
        int i10 = 8;
        lr.E(8);
        boolean z11 = false;
        R3 r36 = new R3(new InterfaceC4043v3[0]);
        while (lr.B() >= i10) {
            int i11 = lr.f26234b;
            int b9 = lr.b() + i11;
            int b10 = lr.b();
            String str = null;
            if (b10 == 1835365473) {
                lr.E(i11);
                lr.G(i10);
                f(lr);
                boolean z12 = z11;
                while (true) {
                    int i12 = lr.f26234b;
                    if (i12 >= b9) {
                        break;
                    }
                    int b11 = lr.b() + i12;
                    if (lr.b() == 1768715124) {
                        break;
                    }
                    lr.E(b11);
                    z10 = true;
                    i10 = 8;
                    z12 = false;
                    str = null;
                }
                R3 r37 = null;
                r36 = r36.b(r37);
                i = 8;
            } else if (b10 == 1936553057) {
                lr.E(i11);
                lr.G(12);
                while (true) {
                    int i13 = lr.f26234b;
                    if (i13 >= b9) {
                        break;
                    }
                    int b12 = lr.b();
                    if (lr.b() != 1935766900) {
                        lr.E(i13 + b12);
                    } else if (b12 >= 16) {
                        lr.G(4);
                        int i14 = 0;
                        int i15 = 0;
                        int i16 = -1;
                        while (i14 < 2) {
                            int K8 = lr.K();
                            int K9 = lr.K();
                            if (K8 == 0) {
                                i16 = K9;
                                i9 = 1;
                            } else {
                                i9 = 1;
                                if (K8 == 1) {
                                    i15 = K9;
                                }
                            }
                            i14 += i9;
                        }
                        if (i16 == 12) {
                            i4 = 240;
                        } else if (i16 == 13) {
                            i4 = 120;
                        } else if (i16 != 21) {
                            i4 = -2147483647;
                        } else {
                            i = 8;
                            if (lr.B() >= 8 && lr.f26234b + 8 <= b9) {
                                int b13 = lr.b();
                                int b14 = lr.b();
                                if (b13 >= 12 && b14 == 1936877170) {
                                    i4 = lr.f();
                                    r35 = i4 != -2147483647 ? new R3(new C3343i2(i4, i15)) : null;
                                }
                            }
                            i4 = -2147483647;
                            if (i4 != -2147483647) {
                            }
                        }
                        i = 8;
                        if (i4 != -2147483647) {
                        }
                    }
                }
                i = 8;
                r36 = r36.b(r35);
            } else {
                i = 8;
                if (b10 == -1451722374) {
                    short N8 = lr.N();
                    lr.G(2);
                    String k6 = lr.k(N8, StandardCharsets.UTF_8);
                    int max = Math.max(k6.lastIndexOf(43), k6.lastIndexOf(45));
                    try {
                        try {
                            ax = new Ax(Float.parseFloat(k6.substring(0, max)), Float.parseFloat(k6.substring(max, k6.length() - 1)));
                            interfaceC4043v3Arr = new InterfaceC4043v3[1];
                            z8 = false;
                        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                            z8 = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                        z8 = false;
                    }
                    try {
                        interfaceC4043v3Arr[0] = ax;
                        r34 = new R3(interfaceC4043v3Arr);
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        r34 = null;
                        r36 = r36.b(r34);
                        z9 = true;
                        lr.E(b9);
                        i10 = i;
                        z10 = z9;
                        z11 = z8;
                    }
                    r36 = r36.b(r34);
                } else {
                    z8 = false;
                    if (b10 == 1667788908) {
                        try {
                            lr.G(5);
                            int b15 = lr.b();
                            arrayList = new ArrayList();
                            for (int i17 = 0; i17 < b15; i17++) {
                                long d2 = lr.d() / 10000;
                                if (d2 < 0) {
                                    d2 = com.anythink.basead.exoplayer.b.f6539b;
                                }
                                r32 = null;
                                try {
                                    arrayList.add(new M1(d2, com.anythink.basead.exoplayer.b.f6539b, false, new C3904sQ(null, lr.k(lr.K(), StandardCharsets.UTF_8))));
                                } catch (IndexOutOfBoundsException unused4) {
                                    z9 = true;
                                    r33 = r32;
                                    r36 = r36.b(r33);
                                    lr.E(b9);
                                    i10 = i;
                                    z10 = z9;
                                    z11 = z8;
                                }
                            }
                            r32 = null;
                            z9 = true;
                        } catch (IndexOutOfBoundsException unused5) {
                            r32 = null;
                        }
                        if (!arrayList.isEmpty()) {
                            r33 = new R3(arrayList);
                            r36 = r36.b(r33);
                            lr.E(b9);
                            i10 = i;
                            z10 = z9;
                            z11 = z8;
                        }
                        r33 = r32;
                        r36 = r36.b(r33);
                        lr.E(b9);
                        i10 = i;
                        z10 = z9;
                        z11 = z8;
                    }
                }
                z9 = true;
                lr.E(b9);
                i10 = i;
                z10 = z9;
                z11 = z8;
            }
            z9 = true;
            z8 = false;
            lr.E(b9);
            i10 = i;
            z10 = z9;
            z11 = z8;
        }
        return r36;
    }

    public static Xx d(Lr lr) {
        long d2;
        long d3;
        lr.E(8);
        if (a(lr.b()) == 0) {
            d2 = lr.P();
            d3 = lr.P();
        } else {
            d2 = lr.d();
            d3 = lr.d();
        }
        return new Xx(d2, d3, lr.P());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r8 = r12.b();
        r10 = r12.b();
        r9 = r9 - 16;
        r11 = new byte[r9];
        r12.H(r11, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        r9 = new com.google.android.gms.internal.ads.C4143ww(r11, r10, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
    
        com.anythink.basead.b.c.i.w(r6, "Failed to parse metadata entry with key: ", "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static R3 e(Ww ww) {
        C3443jx i = ww.i(1751411826);
        C3443jx i4 = ww.i(1801812339);
        C3443jx i9 = ww.i(1768715124);
        if (i != null && i4 != null && i9 != null) {
            Lr lr = i.f32222c;
            lr.E(16);
            if (lr.b() == 1835299937) {
                Lr lr2 = i4.f32222c;
                lr2.E(12);
                int b9 = lr2.b();
                String[] strArr = new String[b9];
                for (int i10 = 0; i10 < b9; i10++) {
                    int b10 = lr2.b();
                    lr2.G(4);
                    strArr[i10] = lr2.k(b10 - 8, StandardCharsets.UTF_8);
                }
                Lr lr3 = i9.f32222c;
                lr3.E(8);
                ArrayList arrayList = new ArrayList();
                while (lr3.B() > 8) {
                    int b11 = lr3.b() + lr3.f26234b;
                    int b12 = lr3.b() - 1;
                    if (b12 < 0 || b12 >= b9) {
                        com.anythink.basead.b.c.i.s(b12, "Skipped metadata with unknown key index: ", "BoxParsers", new StringBuilder(String.valueOf(b12).length() + 41));
                    } else {
                        String str = strArr[b12];
                        while (true) {
                            int i11 = lr3.f26234b;
                            if (i11 >= b11) {
                                break;
                            }
                            int b13 = lr3.b();
                            if (lr3.b() == 1684108385) {
                                break;
                            }
                            lr3.E(i11 + b13);
                        }
                        C4143ww c4143ww = null;
                        if (c4143ww != null) {
                            arrayList.add(c4143ww);
                        }
                    }
                    lr3.E(b11);
                }
                if (!arrayList.isEmpty()) {
                    return new R3(arrayList);
                }
            }
        }
        return null;
    }

    public static void f(Lr lr) {
        int i = lr.f26234b;
        lr.G(4);
        if (lr.b() != 1751411826) {
            i += 4;
        }
        lr.E(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:250:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04ad  */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2908a3 g(X2 x22, Ww ww, X0 x02) {
        B0 b02;
        boolean z8;
        int i;
        int i4;
        int i9;
        boolean z9;
        long j9;
        TP tp;
        X2 x23;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        long[] jArr2;
        boolean z10;
        long[] jArr3;
        boolean z11;
        long j10;
        int i10;
        int i11;
        X2 x24;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        int i15;
        int i16;
        int i17;
        long j11;
        int i18;
        long[] jArr4;
        int i19;
        long j12;
        X2 x25;
        UC uc;
        X2 x26;
        int i20;
        X2 x27;
        long[] jArr5;
        long[] jArr6;
        int i21;
        long[] jArr7;
        int i22;
        int i23;
        boolean z12;
        long j13;
        X2 x28 = x22;
        C3443jx i24 = ww.i(1937011578);
        TP tp2 = x28.f28593g;
        if (i24 != null) {
            C3826r2 c3826r2 = new C3826r2();
            Lr lr = i24.f32222c;
            c3826r2.f33938v = lr;
            lr.E(12);
            int h9 = lr.h();
            if (com.anythink.basead.exoplayer.k.o.f8622w.equals(tp2.f27776o)) {
                int f6 = AbstractC3548lu.f(tp2.J) * tp2.f27754G;
                if (h9 % f6 != 0) {
                    AbstractC3217fl.I("BoxParsers", D.y.n(new StringBuilder(String.valueOf(f6).length() + 66 + String.valueOf(h9).length()), "Audio sample size mismatch. stsd sample size: ", f6, ", stsz sample size: ", h9));
                    h9 = f6;
                }
            }
            if (h9 == 0) {
                h9 = -1;
            }
            c3826r2.f33936n = h9;
            c3826r2.f33937u = lr.h();
            b02 = c3826r2;
        } else {
            C3443jx i25 = ww.i(1937013298);
            if (i25 == null) {
                throw W4.a(null, "Track has no sample table size information");
            }
            b02 = new B0(i25);
        }
        int a9 = b02.a();
        if (a9 == 0) {
            return new C2908a3(x28, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (x28.f28588b == 2) {
            long j14 = x28.f28592f;
            if (j14 > 0) {
                tp2.getClass();
                C4065vP c4065vP = new C4065vP(tp2);
                float f9 = a9 / (j14 / 1000000.0f);
                PA.n(f9 == -1.0f || f9 > 0.0f);
                c4065vP.f34796y = f9;
                TP tp3 = new TP(c4065vP);
                W2 w22 = new W2(x28);
                w22.f28353g = tp3;
                x28 = new X2(w22);
            }
        }
        C3443jx i26 = ww.i(1937007471);
        if (i26 == null) {
            i26 = ww.i(1668232756);
            i26.getClass();
            z8 = true;
        } else {
            z8 = false;
        }
        C3443jx i27 = ww.i(1937011555);
        i27.getClass();
        C3443jx i28 = ww.i(1937011827);
        i28.getClass();
        C3443jx i29 = ww.i(1937011571);
        Lr lr2 = i29 != null ? i29.f32222c : null;
        C3443jx i30 = ww.i(1668576371);
        Lr lr3 = i30 != null ? i30.f32222c : null;
        D2 d2 = new D2(i27.f32222c, i26.f32222c, z8);
        Lr lr4 = i28.f32222c;
        lr4.E(12);
        int h10 = lr4.h() - 1;
        int h11 = lr4.h();
        int h12 = lr4.h();
        if (lr3 != null) {
            lr3.E(12);
            i = lr3.h();
        } else {
            i = 0;
        }
        if (lr2 != null) {
            lr2.E(12);
            i9 = lr2.h();
            if (i9 > 0) {
                i4 = lr2.h() - 1;
            } else {
                i4 = -1;
                lr2 = null;
            }
        } else {
            i4 = -1;
            i9 = 0;
        }
        int d3 = b02.d();
        Lr lr5 = lr3;
        TP tp4 = x28.f28593g;
        if (d3 != -1) {
            String str = tp4.f27776o;
            if ((com.anythink.basead.exoplayer.k.o.f8622w.equals(str) || com.anythink.basead.exoplayer.k.o.f8624y.equals(str) || com.anythink.basead.exoplayer.k.o.f8623x.equals(str)) && h10 == 0) {
                z9 = i == 0 && i9 == 0;
                h10 = 0;
                ArrayList arrayList2 = new ArrayList();
                ?? r32 = lr2 != null ? 1 : 0;
                if (z9) {
                    long[] jArr8 = new long[a9];
                    int[] iArr3 = new int[a9];
                    int i31 = i9;
                    long[] jArr9 = new long[a9];
                    int[] iArr4 = new int[a9];
                    int i32 = i31;
                    Lr lr6 = lr2;
                    B0 b03 = b02;
                    int i33 = h10;
                    int i34 = i4;
                    long j15 = 0;
                    long j16 = 0;
                    j9 = 0;
                    int i35 = i;
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 0;
                    int i40 = h11;
                    int i41 = 0;
                    while (true) {
                        if (i41 >= a9) {
                            tp = tp4;
                            x23 = x28;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            jArr = jArr8;
                            jArr2 = jArr9;
                            break;
                        }
                        long j17 = j15;
                        boolean z13 = true;
                        while (true) {
                            if (i38 != 0) {
                                tp = tp4;
                                i19 = i38;
                                break;
                            }
                            z13 = d2.a();
                            tp = tp4;
                            if (!z13) {
                                i19 = 0;
                                break;
                            }
                            j17 = d2.f24319d;
                            i38 = d2.f24318c;
                            x28 = x28;
                            tp4 = tp;
                        }
                        x23 = x28;
                        if (!z13) {
                            AbstractC3217fl.I("BoxParsers", "Unexpected end of chunk data");
                            jArr = Arrays.copyOf(jArr8, i41);
                            int[] copyOf = Arrays.copyOf(iArr3, i41);
                            long[] copyOf2 = Arrays.copyOf(jArr9, i41);
                            iArr = copyOf;
                            iArr2 = Arrays.copyOf(iArr4, i41);
                            a9 = i41;
                            jArr2 = copyOf2;
                            break;
                        }
                        if (lr5 != null) {
                            while (true) {
                                if (i39 != 0) {
                                    break;
                                }
                                if (i35 <= 0) {
                                    i39 = 0;
                                    break;
                                }
                                i35--;
                                i39 = lr5.h();
                                i36 = lr5.b();
                            }
                            i39--;
                        }
                        int i42 = b03.i();
                        long[] jArr10 = jArr8;
                        long[] jArr11 = jArr9;
                        long j18 = i42;
                        j9 += j18;
                        if (i42 > i37) {
                            i37 = i42;
                        }
                        jArr10[i41] = j17;
                        iArr3[i41] = i42;
                        int i43 = i19;
                        jArr11[i41] = j16 + i36;
                        iArr4[i41] = r32;
                        if (i41 == i34) {
                            iArr4[i41] = 1;
                            arrayList2.add(Integer.valueOf(i41));
                        }
                        if (lr6 != null && i41 == i34 && i32 - 1 > 0) {
                            i34 = lr6.h() - 1;
                        }
                        j16 += h12;
                        int i44 = i40 - 1;
                        if (i44 != 0) {
                            i40 = i44;
                        } else if (i33 > 0) {
                            i33--;
                            i40 = lr4.h();
                            h12 = lr4.b();
                        } else {
                            i40 = 0;
                        }
                        long j19 = j17 + j18;
                        i38 = i43 - 1;
                        i41++;
                        jArr8 = jArr10;
                        jArr9 = jArr11;
                        x28 = x23;
                        j15 = j19;
                        tp4 = tp;
                    }
                    long j20 = j16 + i36;
                    if (lr5 != null) {
                        while (i35 > 0) {
                            if (lr5.h() != 0) {
                                z10 = false;
                                break;
                            }
                            lr5.b();
                            i35--;
                        }
                    }
                    z10 = true;
                    if (i32 != 0) {
                        jArr3 = jArr;
                        z11 = z10;
                        j10 = j20;
                        i10 = i38;
                        i11 = i40;
                        x24 = x23;
                        i12 = i32;
                        i13 = i33;
                        i14 = i39;
                    } else if (i40 != 0) {
                        jArr3 = jArr;
                        z11 = z10;
                        j10 = j20;
                        i10 = i38;
                        i11 = i40;
                        x24 = x23;
                        i13 = i33;
                        i14 = i39;
                        i12 = 0;
                    } else if (i38 != 0) {
                        jArr3 = jArr;
                        z11 = z10;
                        j10 = j20;
                        i10 = i38;
                        x24 = x23;
                        i13 = i33;
                        i14 = i39;
                        i12 = 0;
                        i11 = 0;
                    } else if (i33 != 0) {
                        jArr3 = jArr;
                        z11 = z10;
                        j10 = j20;
                        x24 = x23;
                        i13 = i33;
                        i14 = i39;
                        i12 = 0;
                        i11 = 0;
                        i10 = 0;
                    } else if (i39 != 0) {
                        jArr3 = jArr;
                        z11 = z10;
                        j10 = j20;
                        x24 = x23;
                        i14 = i39;
                        i12 = 0;
                        i11 = 0;
                        i10 = 0;
                        i13 = 0;
                    } else if (z10) {
                        jArr3 = jArr;
                        j10 = j20;
                        arrayList = arrayList2;
                        i16 = i37;
                        x24 = x23;
                        i15 = a9;
                        i17 = i16;
                        j11 = j10;
                        i18 = i15;
                        jArr4 = jArr3;
                    } else {
                        jArr3 = jArr;
                        j10 = j20;
                        x24 = x23;
                        z11 = false;
                        i12 = 0;
                        i11 = 0;
                        i10 = 0;
                        i13 = 0;
                        i14 = 0;
                    }
                    int i45 = x24.f28587a;
                    int length = String.valueOf(i13).length() + String.valueOf(i10).length() + String.valueOf(i11).length() + String.valueOf(i12).length() + String.valueOf(i45).length() + 66 + 35 + 26 + 33 + 36;
                    int length2 = String.valueOf(i14).length();
                    arrayList = arrayList2;
                    String str2 = true != z11 ? ", ctts invalid" : "";
                    i15 = a9;
                    StringBuilder sb = new StringBuilder(str2.length() + length + length2);
                    i16 = i37;
                    AbstractC5051n.i(sb, "Inconsistent stbl box for track ", i45, ": remainingSynchronizationSamples ", i12);
                    AbstractC5051n.i(sb, ", remainingSamplesAtTimestampDelta ", i11, ", remainingSamplesInChunk ", i10);
                    AbstractC5051n.i(sb, ", remainingTimestampDeltaChanges ", i13, ", remainingSamplesAtTimestampOffset ", i14);
                    sb.append(str2);
                    AbstractC3217fl.I("BoxParsers", sb.toString());
                    i17 = i16;
                    j11 = j10;
                    i18 = i15;
                    jArr4 = jArr3;
                } else {
                    int i46 = d2.f24316a;
                    long[] jArr12 = new long[i46];
                    int[] iArr5 = new int[i46];
                    while (d2.a()) {
                        int i47 = d2.f24317b;
                        jArr12[i47] = d2.f24319d;
                        iArr5[i47] = d2.f24318c;
                    }
                    long j21 = h12;
                    int i48 = 8192 / d3;
                    int i49 = 0;
                    for (int i50 = 0; i50 < i46; i50++) {
                        int i51 = iArr5[i50];
                        String str3 = AbstractC3548lu.f32613a;
                        i49 += ((i51 + i48) - 1) / i48;
                    }
                    long[] jArr13 = new long[i49];
                    iArr = new int[i49];
                    jArr2 = new long[i49];
                    iArr2 = new int[i49];
                    int i52 = 0;
                    int i53 = 0;
                    int i54 = 0;
                    int i55 = 0;
                    int i56 = 0;
                    while (i52 < i46) {
                        int i57 = iArr5[i52];
                        long j22 = jArr12[i52];
                        int i58 = i56;
                        int i59 = i46;
                        int i60 = i55;
                        int i61 = i58;
                        int i62 = i52;
                        int i63 = i57;
                        while (i63 > 0) {
                            int min = Math.min(i48, i63);
                            jArr13[i61] = j22;
                            int i64 = i63;
                            int i65 = d3 * min;
                            iArr[i61] = i65;
                            i54 += i65;
                            int max = Math.max(i60, i65);
                            jArr2[i61] = i53 * j21;
                            iArr2[i61] = 1;
                            j22 += iArr[i61];
                            i53 += min;
                            i63 = i64 - min;
                            i61++;
                            i60 = max;
                        }
                        i52 = i62 + 1;
                        int i66 = i61;
                        i55 = i60;
                        i46 = i59;
                        i56 = i66;
                    }
                    tp = tp4;
                    j9 = i54;
                    arrayList = arrayList2;
                    j11 = j21 * i53;
                    jArr4 = jArr13;
                    i18 = i49;
                    i17 = i55;
                    x24 = x28;
                }
                int[] iArr6 = iArr;
                j12 = x24.f28592f;
                if (j12 > 0) {
                    long w9 = AbstractC3548lu.w(j9 * 8, 1000000L, j12, RoundingMode.HALF_DOWN);
                    if (w9 > 0 && w9 < 2147483647L) {
                        tp.getClass();
                        C4065vP c4065vP2 = new C4065vP(tp);
                        c4065vP2.f34780h = (int) w9;
                        TP tp5 = new TP(c4065vP2);
                        W2 w23 = new W2(x24);
                        w23.f28353g = tp5;
                        x25 = new X2(w23);
                        RoundingMode roundingMode = RoundingMode.DOWN;
                        long j23 = x25.f28589c;
                        long w10 = AbstractC3548lu.w(j11, 1000000L, j23, roundingMode);
                        int[] D8 = AbstractC3194fG.D(arrayList);
                        uc = x25.i;
                        if (uc == null) {
                            AbstractC3548lu.x(jArr2, j23);
                            return new C2908a3(x25, jArr4, iArr6, i17, jArr2, iArr2, D8, r32, w10, i18);
                        }
                        X2 x29 = x25;
                        int[] iArr7 = iArr2;
                        int i67 = x29.f28588b;
                        TP tp6 = x29.f28593g;
                        UC uc2 = x29.f28595j;
                        int i68 = uc.f27945u;
                        int i69 = 1;
                        if (i68 == 1 && i67 == 1) {
                            int length3 = jArr2.length;
                            if (length3 >= 2) {
                                uc2.getClass();
                                long a10 = uc2.a(0);
                                long a11 = uc.a(0);
                                long j24 = x29.f28590d;
                                long w11 = a10 + AbstractC3548lu.w(a11, j23, j24, roundingMode);
                                int i70 = length3 - 1;
                                int max2 = Math.max(0, Math.min(4, i70));
                                int max3 = Math.max(0, Math.min(length3 - 4, i70));
                                if (jArr2[0] > a10 || a10 >= jArr2[max2] || jArr2[max3] >= w11 || w11 > 2 + j11) {
                                    x26 = x29;
                                    j23 = j23;
                                } else {
                                    long max4 = Math.max(0L, j11 - w11);
                                    long j25 = a10 - jArr2[0];
                                    long j26 = tp6.f27756I;
                                    long w12 = AbstractC3548lu.w(j25, j26, j23, roundingMode);
                                    long w13 = AbstractC3548lu.w(max4, j26, j23, roundingMode);
                                    j23 = j23;
                                    if (w12 == 0) {
                                        if (w13 != 0) {
                                            j13 = 0;
                                        }
                                        x26 = x29;
                                    } else {
                                        j13 = w12;
                                    }
                                    if (j13 <= 2147483647L && w13 <= 2147483647L) {
                                        x02.f28581a = (int) j13;
                                        x02.f28582b = (int) w13;
                                        AbstractC3548lu.x(jArr2, j23);
                                        return new C2908a3(x29, jArr4, iArr6, i17, jArr2, iArr7, D8, r32, AbstractC3548lu.w(uc.a(0), 1000000L, j24, roundingMode), i18);
                                    }
                                    x26 = x29;
                                }
                                i20 = i68;
                            } else {
                                x26 = x29;
                                i20 = i68;
                            }
                            i69 = 1;
                        } else {
                            x26 = x29;
                            i20 = i68;
                        }
                        if (i20 == i69) {
                            if (uc.a(0) == 0) {
                                uc2.getClass();
                                long a12 = uc2.a(0);
                                for (int i71 = 0; i71 < jArr2.length; i71++) {
                                    jArr2[i71] = AbstractC3548lu.w(jArr2[i71] - a12, 1000000L, j23, RoundingMode.DOWN);
                                }
                                return new C2908a3(x26, jArr4, iArr6, i17, jArr2, iArr7, D8, r32, AbstractC3548lu.w(j11 - a12, 1000000L, j23, RoundingMode.DOWN), i18);
                            }
                            i69 = 1;
                        }
                        long j27 = j23;
                        X2 x210 = x26;
                        long[] jArr14 = jArr4;
                        int i72 = i18;
                        boolean z14 = i67 == i69;
                        int[] iArr8 = new int[i20];
                        int[] iArr9 = new int[i20];
                        uc2.getClass();
                        boolean z15 = z14;
                        int i73 = 0;
                        int i74 = 0;
                        int i75 = 0;
                        boolean z16 = false;
                        while (i74 < i20) {
                            int[] iArr10 = iArr8;
                            int[] iArr11 = iArr9;
                            long a13 = uc2.a(i74);
                            if (a13 != -1) {
                                boolean z17 = z16;
                                jArr7 = jArr14;
                                long j28 = j27;
                                j27 = j28;
                                long w14 = AbstractC3548lu.w(uc.a(i74), j28, x210.f28590d, RoundingMode.DOWN) + a13;
                                i21 = i74;
                                iArr10[i21] = AbstractC3548lu.s(jArr2, a13, true);
                                int binarySearch = Arrays.binarySearch(jArr2, w14);
                                if (binarySearch < 0) {
                                    binarySearch = ~binarySearch;
                                } else {
                                    while (true) {
                                        i22 = binarySearch + 1;
                                        if (i22 >= jArr2.length || jArr2[i22] != w14) {
                                            break;
                                        }
                                        binarySearch = i22;
                                    }
                                    if (!z15) {
                                        binarySearch = i22;
                                    }
                                }
                                int i76 = binarySearch - 1;
                                int i77 = 0;
                                while (binarySearch < jArr2.length) {
                                    if (jArr2[binarySearch] >= w14) {
                                        i77++;
                                        if (i77 > tp6.f27778q) {
                                            break;
                                        }
                                    } else {
                                        i76 = binarySearch;
                                    }
                                    binarySearch++;
                                }
                                iArr11[i21] = i76 + 1;
                                int i78 = iArr10[i21];
                                while (true) {
                                    i23 = iArr10[i21];
                                    if (i23 <= 0 || (iArr7[i23] & 1) != 0) {
                                        break;
                                    }
                                    iArr10[i21] = i23 - 1;
                                }
                                if (i23 == 0) {
                                    z12 = false;
                                    if ((iArr7[0] & 1) == 0) {
                                        iArr10[i21] = i78;
                                        while (true) {
                                            i23 = iArr10[i21];
                                            if (i23 >= iArr11[i21] || (iArr7[i23] & 1) != 0) {
                                                break;
                                            }
                                            iArr10[i21] = i23 + 1;
                                        }
                                    }
                                } else {
                                    z12 = false;
                                }
                                int i79 = iArr11[i21];
                                int i80 = (i79 - i23) + i75;
                                z16 = z17 | (i73 != i23 ? true : z12);
                                i73 = i79;
                                i75 = i80;
                            } else {
                                i21 = i74;
                                jArr7 = jArr14;
                            }
                            i74 = i21 + 1;
                            iArr8 = iArr10;
                            iArr9 = iArr11;
                            jArr14 = jArr7;
                        }
                        int[] iArr12 = iArr8;
                        int[] iArr13 = iArr9;
                        long[] jArr15 = jArr14;
                        boolean z18 = z16 | (i75 != i72);
                        long[] jArr16 = z18 ? new long[i75] : jArr15;
                        int[] iArr14 = z18 ? new int[i75] : iArr6;
                        if (true == z18) {
                            i17 = 0;
                        }
                        int[] iArr15 = z18 ? new int[i75] : iArr7;
                        ArrayList arrayList3 = z18 ? new ArrayList() : arrayList;
                        long[] jArr17 = new long[i75];
                        int i81 = 0;
                        boolean z19 = false;
                        int i82 = 0;
                        long j29 = 0;
                        while (i82 < i20) {
                            long a14 = uc2.a(i82);
                            long[] jArr18 = jArr17;
                            int i83 = iArr12[i82];
                            boolean z20 = z19;
                            int i84 = iArr13[i82];
                            int i85 = i20;
                            if (z18) {
                                int i86 = i84 - i83;
                                jArr5 = jArr2;
                                jArr6 = jArr15;
                                System.arraycopy(jArr6, i83, jArr16, i81, i86);
                                System.arraycopy(iArr6, i83, iArr14, i81, i86);
                                System.arraycopy(iArr7, i83, iArr15, i81, i86);
                            } else {
                                jArr5 = jArr2;
                                jArr6 = jArr15;
                            }
                            boolean z21 = z20;
                            int i87 = i81;
                            int i88 = i17;
                            while (i83 < i84) {
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                int[] iArr16 = iArr14;
                                int[] iArr17 = iArr15;
                                long w15 = AbstractC3548lu.w(j29, 1000000L, x210.f28590d, roundingMode2);
                                long w16 = AbstractC3548lu.w(jArr5[i83] - a14, 1000000L, j27, roundingMode2);
                                z21 = (!(w16 >= 0)) | z21;
                                jArr18[i87] = w15 + w16;
                                if (z18 && iArr16[i87] > i88) {
                                    i88 = iArr6[i83];
                                }
                                if (z18 && r32 == 0) {
                                    if ((iArr17[i87] & 1) != 0) {
                                        arrayList3.add(Integer.valueOf(i87));
                                    }
                                }
                                i83++;
                                i87++;
                                iArr14 = iArr16;
                                iArr15 = iArr17;
                            }
                            j29 = uc.a(i82) + j29;
                            i82++;
                            i17 = i88;
                            z19 = z21;
                            jArr15 = jArr6;
                            jArr2 = jArr5;
                            iArr14 = iArr14;
                            jArr17 = jArr18;
                            iArr15 = iArr15;
                            i20 = i85;
                            i81 = i87;
                        }
                        int[] iArr18 = iArr14;
                        int[] iArr19 = iArr15;
                        long[] jArr19 = jArr17;
                        boolean z22 = z19;
                        long w17 = AbstractC3548lu.w(j29, 1000000L, x210.f28590d, RoundingMode.DOWN);
                        if (z22) {
                            tp6.getClass();
                            C4065vP c4065vP3 = new C4065vP(tp6);
                            c4065vP3.f34791t = true;
                            TP tp7 = new TP(c4065vP3);
                            W2 w24 = new W2(x210);
                            w24.f28353g = tp7;
                            x27 = new X2(w24);
                        } else {
                            x27 = x210;
                        }
                        return new C2908a3(x27, jArr16, iArr18, i17, jArr19, iArr19, AbstractC3194fG.D(arrayList3), r32, w17, jArr16.length);
                    }
                }
                x25 = x24;
                RoundingMode roundingMode3 = RoundingMode.DOWN;
                long j232 = x25.f28589c;
                long w102 = AbstractC3548lu.w(j11, 1000000L, j232, roundingMode3);
                int[] D82 = AbstractC3194fG.D(arrayList);
                uc = x25.i;
                if (uc == null) {
                }
            }
        }
        z9 = false;
        ArrayList arrayList22 = new ArrayList();
        if (lr2 != null) {
        }
        if (z9) {
        }
        int[] iArr62 = iArr;
        j12 = x24.f28592f;
        if (j12 > 0) {
        }
        x25 = x24;
        RoundingMode roundingMode32 = RoundingMode.DOWN;
        long j2322 = x25.f28589c;
        long w1022 = AbstractC3548lu.w(j11, 1000000L, j2322, roundingMode32);
        int[] D822 = AbstractC3194fG.D(arrayList);
        uc = x25.i;
        if (uc == null) {
        }
    }

    public static Pair h(Ww ww) {
        C3443jx i = ww.i(1701606260);
        if (i == null) {
            return null;
        }
        Lr lr = i.f32222c;
        lr.E(8);
        int a9 = a(lr.b());
        int h9 = lr.h();
        long[] jArr = new long[h9];
        long[] jArr2 = new long[h9];
        int i4 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < h9; i10++) {
            long j9 = a9 == 1 ? lr.j() : lr.P();
            int i11 = i4 + 1;
            int length = jArr.length;
            if (i11 > length) {
                int i12 = length + (length >> 1) + 1;
                if (i12 < i11) {
                    int highestOneBit = Integer.highestOneBit(i4);
                    i12 = highestOneBit + highestOneBit;
                }
                if (i12 < 0) {
                    i12 = Integer.MAX_VALUE;
                }
                jArr = Arrays.copyOf(jArr, i12);
            }
            jArr[i4] = j9;
            i4++;
            long d2 = a9 == 1 ? lr.d() : lr.b();
            int i13 = i9 + 1;
            int length2 = jArr2.length;
            if (i13 > length2) {
                int i14 = length2 + (length2 >> 1) + 1;
                if (i14 < i13) {
                    int highestOneBit2 = Integer.highestOneBit(i9);
                    i14 = highestOneBit2 + highestOneBit2;
                }
                jArr2 = Arrays.copyOf(jArr2, i14 >= 0 ? i14 : Integer.MAX_VALUE);
            }
            jArr2[i9] = d2;
            i9++;
            if (lr.N() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            lr.G(2);
        }
        UC uc = UC.f27943v;
        UC uc2 = i4 == 0 ? uc : new UC(jArr, i4);
        if (i9 != 0) {
            uc = new UC(jArr2, i9);
        }
        return Pair.create(uc2, uc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:571:0x0162, code lost:
    
        if (r12 == (-1)) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x08ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(Lr lr, int i, int i4, int i9, int i10, String str, boolean z8, RO ro, F3.q qVar, int i11) {
        int i12;
        int i13;
        int L8;
        int b9;
        int i14;
        int i15;
        String str2;
        String str3;
        boolean z9;
        int i16;
        String str4;
        String str5;
        int i17;
        List list;
        int i18;
        int i19;
        Lr lr2;
        int i20;
        int i21;
        int i22;
        String str6;
        String str7;
        E2 e22;
        int i23;
        int i24;
        int i25;
        String str8;
        int i26;
        int i27;
        int i28;
        int h9;
        boolean z10;
        int i29;
        int i30;
        boolean z11;
        int i31;
        int i32;
        int i33;
        int i34;
        boolean z12;
        String str9;
        Lr lr3 = lr;
        int i35 = i;
        int i36 = i9;
        RO ro2 = ro;
        lr3.E(i4 + 16);
        if (z8) {
            int L9 = lr3.L();
            lr3.G(6);
            i12 = L9;
        } else {
            lr3.G(8);
            i12 = 0;
        }
        if (i12 == 0 || i12 == 1) {
            i13 = 2;
            L8 = lr3.L();
            lr3.G(6);
            int f6 = lr3.f();
            lr3.E(lr3.f26234b - 4);
            b9 = lr3.b();
            if (i12 == 1) {
                lr3.G(16);
            }
            i14 = f6;
            i15 = -1;
        } else {
            if (i12 != 2) {
                return;
            }
            lr3.G(16);
            int round = (int) Math.round(Double.longBitsToDouble(lr3.d()));
            int h10 = lr3.h();
            lr3.G(4);
            i13 = 2;
            int h11 = lr3.h();
            int h12 = lr3.h();
            int i37 = h12 & 1;
            int i38 = h12 & 2;
            i15 = i37 != 0 ? AbstractC3548lu.c(h11, i38 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN) : AbstractC3548lu.b(h11, i38 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            if (i15 == 0) {
                i15 = -1;
            }
            lr3.G(8);
            i14 = round;
            L8 = h10;
            b9 = 0;
        }
        int i39 = 8;
        if (i35 == 1767992678) {
            L8 = -1;
            i14 = -1;
        } else {
            if (i35 == 1935764850) {
                i14 = 8000;
            } else if (i35 == 1935767394) {
                i14 = 16000;
                i35 = 1935767394;
            }
            L8 = 1;
        }
        int i40 = lr3.f26234b;
        int i41 = 1701733217;
        if (i35 == 1701733217) {
            Pair k6 = k(lr3, i4, i36);
            if (k6 != null) {
                i41 = ((Integer) k6.first).intValue();
                ro2 = ro2 == null ? null : ro2.a(((Y2) k6.second).f28773b);
                ((Y2[]) qVar.f1061c)[i11] = (Y2) k6.second;
            }
            i35 = i41;
            lr3.E(i40);
        }
        String str10 = "audio/mhm1";
        String str11 = com.anythink.basead.exoplayer.k.o.f8625z;
        if (i35 == 1633889587) {
            str2 = com.anythink.basead.exoplayer.k.o.f8625z;
        } else if (i35 == 1700998451) {
            str2 = com.anythink.basead.exoplayer.k.o.f8577A;
        } else if (i35 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i35 == 1685353315) {
            str2 = com.anythink.basead.exoplayer.k.o.f8580D;
        } else if (i35 == 1685353320 || i35 == 1685353324) {
            str2 = com.anythink.basead.exoplayer.k.o.f8581E;
        } else if (i35 == 1685353317) {
            str2 = com.anythink.basead.exoplayer.k.o.f8582F;
        } else if (i35 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i35 == 1935764850) {
            str2 = com.anythink.basead.exoplayer.k.o.f8585I;
        } else if (i35 == 1935767394) {
            str2 = com.anythink.basead.exoplayer.k.o.J;
        } else {
            if (i35 != 1936684916) {
                if (i35 == 1953984371) {
                    i15 = 268435456;
                } else if (i35 != 1819304813) {
                    if (i35 == 778924082 || i35 == 778924083) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8619t;
                    } else if (i35 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i35 == 1835560241) {
                        str2 = "audio/mhm1";
                    } else if (i35 == 1634492771) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8587L;
                    } else if (i35 == 1634492791) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8623x;
                    } else if (i35 == 1970037111) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8624y;
                    } else if (i35 == 1332770163) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8584H;
                    } else if (i35 == 1716281667) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8586K;
                    } else if (i35 == 1835823201) {
                        str2 = com.anythink.basead.exoplayer.k.o.f8579C;
                    } else if (i35 == 1767992678) {
                        str2 = "audio/iamf";
                        i35 = 1767992678;
                    } else {
                        str2 = null;
                    }
                }
                str2 = com.anythink.basead.exoplayer.k.o.f8622w;
            }
            i15 = i13;
            str2 = com.anythink.basead.exoplayer.k.o.f8622w;
        }
        int i42 = i14;
        int i43 = i15;
        List list2 = null;
        String str12 = null;
        E2 e23 = null;
        C3287h0 c3287h0 = null;
        while (i40 - i4 < i36) {
            lr3.E(i40);
            int b10 = lr3.b();
            int i44 = L8;
            AbstractC2720Pd.k("childAtomSize must be positive", b10 > 0);
            int b11 = lr3.b();
            if (b11 == 1835557187) {
                lr3.E(i40 + 8);
                lr3.G(1);
                int K8 = lr3.K();
                lr3.G(1);
                String format = Objects.equals(str2, str10) ? String.format("mhm1.%02X", Integer.valueOf(K8)) : String.format("mha1.%02X", Integer.valueOf(K8));
                int L10 = lr3.L();
                byte[] bArr = new byte[L10];
                str3 = str10;
                z9 = false;
                lr3.H(bArr, 0, L10);
                list2 = list2 == null ? UB.j(bArr) : UB.k(bArr, (byte[]) list2.get(0));
                L8 = i44;
                i22 = i35;
                str4 = str11;
                str12 = format;
            } else {
                str3 = str10;
                z9 = false;
                if (b11 == 1835557200) {
                    lr3.E(i40 + 8);
                    int K9 = lr3.K();
                    if (K9 > 0) {
                        byte[] bArr2 = new byte[K9];
                        lr3.H(bArr2, 0, K9);
                        if (list2 == null) {
                            list2 = UB.j(bArr2);
                            L8 = i44;
                            i22 = i35;
                            str4 = str11;
                        } else {
                            list2 = UB.k((byte[]) list2.get(0), bArr2);
                            L8 = i44;
                            i22 = i35;
                            str4 = str11;
                            str7 = str2;
                            i17 = b10;
                            i18 = i40;
                            lr2 = lr3;
                        }
                    } else {
                        L8 = i44;
                        i22 = i35;
                        str4 = str11;
                        str5 = str2;
                        i17 = b10;
                        list = list2;
                        i18 = i40;
                        i19 = i42;
                        lr2 = lr3;
                        str7 = str5;
                        i42 = i19;
                        list2 = list;
                    }
                } else {
                    if (b11 == 1702061171) {
                        L8 = i44;
                        i16 = i35;
                        str4 = str11;
                        str5 = str2;
                        i17 = b10;
                        list = list2;
                        i18 = i40;
                        i19 = i42;
                        lr2 = lr3;
                        i20 = i18;
                        i21 = -1;
                    } else if (z8 && b11 == 2002876005) {
                        int i45 = lr3.f26234b;
                        AbstractC2720Pd.k(null, i45 >= i40);
                        while (true) {
                            if (i45 - i40 < b10) {
                                lr3.E(i45);
                                int b12 = lr3.b();
                                AbstractC2720Pd.k("childAtomSize must be positive", b12 > 0);
                                int i46 = i45;
                                if (lr3.b() != 1702061171) {
                                    i45 = i46 + b12;
                                } else {
                                    L8 = i44;
                                    i16 = i35;
                                    str4 = str11;
                                    str5 = str2;
                                    i17 = b10;
                                    list = list2;
                                    i18 = i40;
                                    i19 = i42;
                                    i21 = -1;
                                    lr2 = lr3;
                                    i20 = i46;
                                }
                            } else {
                                L8 = i44;
                                i16 = i35;
                                str4 = str11;
                                str5 = str2;
                                i17 = b10;
                                list = list2;
                                i18 = i40;
                                i19 = i42;
                                i21 = -1;
                                lr2 = lr3;
                                i20 = -1;
                            }
                        }
                    } else if (b11 == 1651798644) {
                        lr3.E(i40 + 8);
                        lr3.G(4);
                        i17 = b10;
                        L8 = i44;
                        i22 = i35;
                        str4 = str11;
                        str7 = str2;
                        c3287h0 = new C3287h0(lr3.P(), lr3.P());
                        i18 = i40;
                        lr2 = lr3;
                    } else {
                        i17 = b10;
                        int[] iArr = AbstractC2655Lg.f26187x;
                        int[] iArr2 = AbstractC2655Lg.f26185v;
                        if (b11 == 1684103987) {
                            lr3.E(i40 + 8);
                            String num = Integer.toString(i10);
                            Er er = new Er();
                            er.a(lr3);
                            int i47 = iArr2[er.h(i13)];
                            er.f(i39);
                            int i48 = iArr[er.h(3)];
                            if (er.h(1) != 0) {
                                i48++;
                            }
                            int i49 = AbstractC2655Lg.f26188y[er.h(5)] * 1000;
                            er.k();
                            lr3.E(er.c());
                            C4065vP c4065vP = new C4065vP();
                            c4065vP.f34773a = num;
                            c4065vP.e(str11);
                            c4065vP.f34765F = i48;
                            c4065vP.f34767H = i47;
                            c4065vP.f34789r = ro2;
                            c4065vP.f34776d = str;
                            c4065vP.f34780h = i49;
                            c4065vP.i = i49;
                            qVar.f1062d = new TP(c4065vP);
                            L8 = i44;
                            i22 = i35;
                            str4 = str11;
                            str5 = str2;
                            list = list2;
                            i18 = i40;
                        } else if (b11 == 1684366131) {
                            lr3.E(i40 + 8);
                            String num2 = Integer.toString(i10);
                            Er er2 = new Er();
                            er2.a(lr3);
                            int h13 = er2.h(13) * 1000;
                            str4 = str11;
                            er2.f(3);
                            int i50 = iArr2[er2.h(2)];
                            er2.f(10);
                            int i51 = iArr[er2.h(3)];
                            if (er2.h(1) != 0) {
                                i51++;
                            }
                            er2.f(3);
                            int h14 = er2.h(4);
                            er2.f(1);
                            int i52 = i51;
                            if (h14 > 0) {
                                er2.f(6);
                                i51 = er2.h(1) != 0 ? i52 + 2 : i52;
                                er2.f(1);
                            }
                            i18 = i40;
                            if (er2.b() > 7) {
                                er2.f(7);
                                if (er2.h(1) != 0) {
                                    str9 = com.anythink.basead.exoplayer.k.o.f8578B;
                                    er2.k();
                                    lr3.E(er2.c());
                                    C4065vP c4065vP2 = new C4065vP();
                                    c4065vP2.f34773a = num2;
                                    c4065vP2.e(str9);
                                    c4065vP2.f34765F = i51;
                                    c4065vP2.f34767H = i50;
                                    c4065vP2.f34789r = ro2;
                                    c4065vP2.f34776d = str;
                                    c4065vP2.i = h13;
                                    qVar.f1062d = new TP(c4065vP2);
                                    L8 = i44;
                                    i22 = i35;
                                    str5 = str2;
                                    list = list2;
                                }
                            }
                            str9 = com.anythink.basead.exoplayer.k.o.f8577A;
                            er2.k();
                            lr3.E(er2.c());
                            C4065vP c4065vP22 = new C4065vP();
                            c4065vP22.f34773a = num2;
                            c4065vP22.e(str9);
                            c4065vP22.f34765F = i51;
                            c4065vP22.f34767H = i50;
                            c4065vP22.f34789r = ro2;
                            c4065vP22.f34776d = str;
                            c4065vP22.i = h13;
                            qVar.f1062d = new TP(c4065vP22);
                            L8 = i44;
                            i22 = i35;
                            str5 = str2;
                            list = list2;
                        } else {
                            str4 = str11;
                            i18 = i40;
                            if (b11 == 1684103988) {
                                lr3.E(i18 + 8);
                                String num3 = Integer.toString(i10);
                                Er er3 = new Er();
                                er3.a(lr3);
                                int b13 = er3.b();
                                int h15 = er3.h(3);
                                if (h15 > 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(h15).length() + 30);
                                    sb.append("Unsupported AC-4 DSI version: ");
                                    sb.append(h15);
                                    throw W4.c(sb.toString());
                                }
                                int h16 = er3.h(7);
                                int i53 = true != er3.g() ? 44100 : 48000;
                                er3.f(4);
                                int h17 = er3.h(9);
                                int i54 = 1;
                                if (h16 > 1) {
                                    if (h15 == 0) {
                                        throw W4.c("Invalid AC-4 DSI version: 0");
                                    }
                                    if (er3.g()) {
                                        er3.f(16);
                                        if (er3.g()) {
                                            er3.f(128);
                                        }
                                    }
                                    i54 = 1;
                                }
                                if (h15 == i54) {
                                    i25 = h16;
                                    if (er3.b() < 66) {
                                        throw W4.c("Invalid AC-4 DSI bitrate.");
                                    }
                                    er3.f(66);
                                    er3.k();
                                } else {
                                    i25 = h16;
                                }
                                A0 a02 = new A0();
                                a02.f23791a = true;
                                a02.f23792b = -1;
                                a02.f23793c = -1;
                                a02.f23794d = true;
                                list = list2;
                                a02.f23795e = 2;
                                a02.f23796f = 1;
                                a02.f23797g = 0;
                                int i55 = 0;
                                while (i55 < h17) {
                                    if (h15 == 0) {
                                        boolean g9 = er3.g();
                                        int h18 = er3.h(5);
                                        str8 = str2;
                                        h9 = er3.h(5);
                                        i22 = i35;
                                        z10 = g9;
                                        i29 = h18;
                                        i30 = 0;
                                        z11 = false;
                                        i31 = 0;
                                    } else {
                                        int i56 = h17;
                                        int h19 = er3.h(8);
                                        str8 = str2;
                                        int h20 = er3.h(8);
                                        i22 = i35;
                                        int h21 = h20 == 255 ? er3.h(16) + com.anythink.basead.exoplayer.k.p.f8630b : h20;
                                        if (h19 > 2) {
                                            er3.f(h21 * 8);
                                            i55++;
                                            h17 = i56;
                                            str2 = str8;
                                            i35 = i22;
                                        } else {
                                            int b14 = (b13 - er3.b()) / 8;
                                            int i57 = h21;
                                            int h22 = er3.h(5);
                                            z11 = h22 == 31;
                                            i31 = b14;
                                            h9 = h19;
                                            i29 = h22;
                                            i30 = i57;
                                            z10 = false;
                                        }
                                    }
                                    a02.f23796f = h9;
                                    boolean z13 = z11;
                                    if (z10 || z13 || i29 != 6) {
                                        a02.f23797g = er3.h(3);
                                        if (er3.g()) {
                                            er3.f(5);
                                        }
                                        er3.f(2);
                                        int i58 = 1;
                                        if (h15 == 1) {
                                            if (h9 != 1) {
                                                if (h9 == 2) {
                                                    h9 = 2;
                                                }
                                            }
                                            er3.f(2);
                                        }
                                        er3.f(5);
                                        er3.f(10);
                                        if (h15 == 1) {
                                            if (h9 > 0) {
                                                a02.f23791a = er3.g();
                                            }
                                            if (a02.f23791a) {
                                                if (h9 != 1) {
                                                    i33 = 2;
                                                    if (h9 == 2) {
                                                        i32 = 2;
                                                    } else {
                                                        i32 = h9;
                                                        er3.f(24);
                                                        i58 = 1;
                                                    }
                                                } else {
                                                    i32 = 1;
                                                }
                                                int h23 = er3.h(5);
                                                if (h23 >= 0 && h23 <= 15) {
                                                    a02.f23792b = h23;
                                                }
                                                if (h23 < 11 || h23 > 14) {
                                                    i33 = 2;
                                                } else {
                                                    a02.f23794d = er3.g();
                                                    i33 = 2;
                                                    a02.f23795e = er3.h(2);
                                                }
                                                er3.f(24);
                                                i58 = 1;
                                            } else {
                                                i33 = 2;
                                                i32 = h9;
                                            }
                                            if (h9 == i58 || h9 == i33) {
                                                if (er3.g() && er3.g()) {
                                                    er3.f(i33);
                                                }
                                                if (er3.g()) {
                                                    er3.e();
                                                    int i59 = 8;
                                                    int h24 = er3.h(8);
                                                    int i60 = 0;
                                                    while (i60 < h24) {
                                                        er3.f(i59);
                                                        i60++;
                                                        i59 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            i32 = h9;
                                        }
                                        if (!z10 && !z13) {
                                            er3.e();
                                            if (i29 == 0 || i29 == 1 || i29 == 2) {
                                                if (i32 == 0) {
                                                    for (int i61 = 0; i61 < 2; i61++) {
                                                        AbstractC3217fl.N(er3, a02);
                                                    }
                                                    i32 = 0;
                                                    er3.e();
                                                    if (er3.g()) {
                                                    }
                                                    if (i32 > 0) {
                                                    }
                                                    i34 = 1;
                                                    er3.k();
                                                    if (h15 == i34) {
                                                    }
                                                    if (a02.f23791a) {
                                                    }
                                                    if (a02.f23791a) {
                                                    }
                                                    if (i26 > 0) {
                                                    }
                                                } else {
                                                    for (int i62 = 0; i62 < 2; i62++) {
                                                        AbstractC3217fl.S(er3, a02);
                                                    }
                                                    er3.e();
                                                    if (er3.g()) {
                                                    }
                                                    if (i32 > 0) {
                                                    }
                                                    i34 = 1;
                                                    er3.k();
                                                    if (h15 == i34) {
                                                    }
                                                    if (a02.f23791a) {
                                                    }
                                                    if (a02.f23791a) {
                                                    }
                                                    if (i26 > 0) {
                                                    }
                                                }
                                            } else if (i29 != 3 && i29 != 4) {
                                                if (i29 != 5) {
                                                    int h25 = er3.h(7);
                                                    for (int i63 = 0; i63 < h25; i63++) {
                                                        er3.f(8);
                                                    }
                                                } else if (i32 == 0) {
                                                    AbstractC3217fl.N(er3, a02);
                                                    i32 = 0;
                                                } else {
                                                    int h26 = er3.h(3);
                                                    for (int i64 = 0; i64 < h26 + 2; i64++) {
                                                        AbstractC3217fl.S(er3, a02);
                                                    }
                                                }
                                                er3.e();
                                                if (er3.g()) {
                                                }
                                                if (i32 > 0) {
                                                }
                                                i34 = 1;
                                                er3.k();
                                                if (h15 == i34) {
                                                }
                                                if (a02.f23791a) {
                                                }
                                                if (a02.f23791a) {
                                                }
                                                if (i26 > 0) {
                                                }
                                            } else if (i32 == 0) {
                                                for (int i65 = 0; i65 < 3; i65++) {
                                                    AbstractC3217fl.N(er3, a02);
                                                }
                                                i32 = 0;
                                                er3.e();
                                                if (er3.g()) {
                                                }
                                                if (i32 > 0) {
                                                }
                                                i34 = 1;
                                                er3.k();
                                                if (h15 == i34) {
                                                }
                                                if (a02.f23791a) {
                                                }
                                                if (a02.f23791a) {
                                                }
                                                if (i26 > 0) {
                                                }
                                            } else {
                                                for (int i66 = 0; i66 < 3; i66++) {
                                                    AbstractC3217fl.S(er3, a02);
                                                }
                                                er3.e();
                                                if (er3.g()) {
                                                }
                                                if (i32 > 0) {
                                                }
                                                i34 = 1;
                                                er3.k();
                                                if (h15 == i34) {
                                                }
                                                if (a02.f23791a) {
                                                }
                                                if (a02.f23791a) {
                                                }
                                                if (i26 > 0) {
                                                }
                                            }
                                        } else if (i32 == 0) {
                                            AbstractC3217fl.N(er3, a02);
                                            i32 = 0;
                                            er3.e();
                                            if (er3.g()) {
                                                h9 = i32;
                                            }
                                            if (i32 > 0) {
                                                if (er3.g()) {
                                                    if (er3.b() < 66) {
                                                        z12 = false;
                                                    } else {
                                                        er3.f(66);
                                                        z12 = true;
                                                    }
                                                    if (!z12) {
                                                        throw W4.c("Can't parse bitrate DSI.");
                                                    }
                                                }
                                                if (er3.g()) {
                                                    er3.k();
                                                    er3.l(er3.h(16));
                                                    int h27 = er3.h(5);
                                                    for (int i67 = 0; i67 < h27; i67++) {
                                                        er3.f(3);
                                                        er3.f(8);
                                                    }
                                                    i34 = 1;
                                                    er3.k();
                                                    if (h15 == i34) {
                                                        int b15 = ((b13 - er3.b()) / 8) - i31;
                                                        if (i30 < b15) {
                                                            throw W4.c("pres_bytes is smaller than presentation bytes read.");
                                                        }
                                                        er3.l(i30 - b15);
                                                    }
                                                    if (a02.f23791a && a02.f23792b == -1) {
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i55).length() + 45);
                                                        sb2.append("Can't determine channel mode of presentation ");
                                                        sb2.append(i55);
                                                        throw W4.c(sb2.toString());
                                                    }
                                                    if (a02.f23791a) {
                                                        int i68 = a02.f23793c;
                                                        if (i68 > 0) {
                                                            i26 = i68 + 1;
                                                            if (a02.f23797g == 4 && i26 == 17) {
                                                                i26 = 21;
                                                            }
                                                        } else {
                                                            int i69 = a02.f23797g;
                                                            if (i69 != 0) {
                                                                if (i69 == 1) {
                                                                    i26 = 6;
                                                                } else if (i69 == 2) {
                                                                    i26 = 8;
                                                                } else if (i69 == 3) {
                                                                    i26 = 10;
                                                                } else if (i69 != 4) {
                                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(i69).length() + 33);
                                                                    sb3.append("AC-4 level ");
                                                                    sb3.append(i69);
                                                                    sb3.append(" has not been defined.");
                                                                    AbstractC3217fl.I("Ac4Util", sb3.toString());
                                                                } else {
                                                                    i26 = 12;
                                                                }
                                                            }
                                                            i26 = 2;
                                                        }
                                                    } else {
                                                        int i70 = a02.f23792b;
                                                        boolean z14 = a02.f23794d;
                                                        int i71 = a02.f23795e;
                                                        switch (i70) {
                                                            case 0:
                                                                i27 = 11;
                                                                i28 = 1;
                                                                break;
                                                            case 1:
                                                                i27 = 11;
                                                                i28 = 2;
                                                                break;
                                                            case 2:
                                                                i27 = 11;
                                                                i28 = 3;
                                                                break;
                                                            case 3:
                                                                i27 = 11;
                                                                i28 = 5;
                                                                break;
                                                            case 4:
                                                                i27 = 11;
                                                                i28 = 6;
                                                                break;
                                                            case 5:
                                                            case 7:
                                                            case 9:
                                                                i27 = 11;
                                                                i28 = 7;
                                                                break;
                                                            case 6:
                                                            case 8:
                                                            case 10:
                                                                i27 = 11;
                                                                i28 = 8;
                                                                break;
                                                            case 11:
                                                                i27 = 11;
                                                                i28 = 11;
                                                                break;
                                                            case 12:
                                                                i27 = 11;
                                                                i28 = 12;
                                                                break;
                                                            case 13:
                                                                i27 = 11;
                                                                i28 = 13;
                                                                break;
                                                            case 14:
                                                                i27 = 11;
                                                                i28 = 14;
                                                                break;
                                                            case 15:
                                                                i27 = 11;
                                                                i28 = 24;
                                                                break;
                                                            default:
                                                                i27 = 11;
                                                                i28 = -1;
                                                                break;
                                                        }
                                                        if (i70 == i27 || i70 == 12 || i70 == 13 || i70 == 14) {
                                                            if (!z14) {
                                                                i28 -= 2;
                                                            }
                                                            if (i71 == 0) {
                                                                i26 = i28 - 4;
                                                            } else if (i71 == 1) {
                                                                i26 = i28 - 2;
                                                            }
                                                        }
                                                        i26 = i28;
                                                    }
                                                    if (i26 > 0) {
                                                        throw W4.c("Cannot determine channel count of presentation.");
                                                    }
                                                    Object[] objArr = {Integer.valueOf(i25), Integer.valueOf(a02.f23796f), Integer.valueOf(a02.f23797g)};
                                                    String str13 = AbstractC3548lu.f32613a;
                                                    String format2 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                                    C4065vP c4065vP3 = new C4065vP();
                                                    c4065vP3.f34773a = num3;
                                                    c4065vP3.e("audio/ac4");
                                                    c4065vP3.f34765F = i26;
                                                    c4065vP3.f34767H = i53;
                                                    c4065vP3.f34789r = ro2;
                                                    c4065vP3.f34776d = str;
                                                    c4065vP3.f34781j = format2;
                                                    qVar.f1062d = new TP(c4065vP3);
                                                    lr2 = lr;
                                                    L8 = i44;
                                                    i19 = i42;
                                                    str5 = str8;
                                                    i39 = 8;
                                                }
                                            }
                                            i34 = 1;
                                            er3.k();
                                            if (h15 == i34) {
                                            }
                                            if (a02.f23791a) {
                                                StringBuilder sb22 = new StringBuilder(String.valueOf(i55).length() + 45);
                                                sb22.append("Can't determine channel mode of presentation ");
                                                sb22.append(i55);
                                                throw W4.c(sb22.toString());
                                            }
                                            if (a02.f23791a) {
                                            }
                                            if (i26 > 0) {
                                            }
                                        } else {
                                            AbstractC3217fl.S(er3, a02);
                                            er3.e();
                                            if (er3.g()) {
                                            }
                                            if (i32 > 0) {
                                            }
                                            i34 = 1;
                                            er3.k();
                                            if (h15 == i34) {
                                            }
                                            if (a02.f23791a) {
                                            }
                                            if (a02.f23791a) {
                                            }
                                            if (i26 > 0) {
                                            }
                                        }
                                        str7 = str5;
                                        i42 = i19;
                                        list2 = list;
                                    }
                                    int h28 = er3.h(7);
                                    for (int i72 = 0; i72 < h28; i72++) {
                                        er3.f(15);
                                    }
                                    i32 = h9;
                                    if (i32 > 0) {
                                    }
                                    i34 = 1;
                                    er3.k();
                                    if (h15 == i34) {
                                    }
                                    if (a02.f23791a) {
                                    }
                                    if (a02.f23791a) {
                                    }
                                    if (i26 > 0) {
                                    }
                                }
                                i22 = i35;
                                str8 = str2;
                                if (a02.f23791a) {
                                }
                                if (i26 > 0) {
                                }
                            } else {
                                i22 = i35;
                                str7 = str2;
                                list = list2;
                                if (b11 == 1684892784) {
                                    if (b9 <= 0) {
                                        StringBuilder sb4 = new StringBuilder(String.valueOf(b9).length() + 49);
                                        sb4.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                        sb4.append(b9);
                                        throw W4.a(null, sb4.toString());
                                    }
                                    lr2 = lr;
                                    i42 = b9;
                                    list2 = list;
                                    L8 = 2;
                                    i39 = 8;
                                } else if (b11 == 1684305011 || b11 == 1969517683) {
                                    i39 = 8;
                                    lr2 = lr;
                                    i16 = i22;
                                    C4065vP c4065vP4 = new C4065vP();
                                    c4065vP4.c(i10);
                                    str5 = str7;
                                    c4065vP4.e(str5);
                                    L8 = i44;
                                    c4065vP4.f34765F = L8;
                                    i19 = i42;
                                    c4065vP4.f34767H = i19;
                                    c4065vP4.f34789r = ro2;
                                    c4065vP4.f34776d = str;
                                    qVar.f1062d = new TP(c4065vP4);
                                    i22 = i16;
                                    str7 = str5;
                                    i42 = i19;
                                    list2 = list;
                                } else {
                                    if (b11 == 1682927731) {
                                        i39 = 8;
                                        int i73 = i17 - 8;
                                        byte[] bArr3 = f25279a;
                                        int length = bArr3.length;
                                        byte[] copyOf = Arrays.copyOf(bArr3, length + i73);
                                        lr2 = lr;
                                        lr2.E(i18 + 8);
                                        lr2.H(copyOf, length, i73);
                                        list2 = AbstractC3035cL.h(copyOf);
                                    } else {
                                        i39 = 8;
                                        lr2 = lr;
                                        if (b11 == 1684425825) {
                                            byte[] bArr4 = new byte[i17 - 8];
                                            bArr4[0] = 102;
                                            bArr4[1] = 76;
                                            bArr4[2] = 97;
                                            bArr4[3] = 67;
                                            lr2.E(i18 + 12);
                                            lr2.H(bArr4, 4, i17 - 12);
                                            list2 = UB.j(bArr4);
                                        } else if (b11 == 1634492771) {
                                            int i74 = i17 - 12;
                                            byte[] bArr5 = new byte[i74];
                                            lr2.E(i18 + 12);
                                            lr2.H(bArr5, 0, i74);
                                            byte[] bArr6 = AbstractC4295zm.f35602a;
                                            Lr lr4 = new Lr(bArr5);
                                            lr4.E(5);
                                            int K10 = lr4.K();
                                            lr4.E(9);
                                            int K11 = lr4.K();
                                            lr4.E(20);
                                            int[] iArr3 = {lr4.h(), K11, K10};
                                            int i75 = iArr3[0];
                                            int i76 = iArr3[1];
                                            int b16 = AbstractC3548lu.b(K10, ByteOrder.LITTLE_ENDIAN);
                                            if (b16 == 0) {
                                                b16 = -1;
                                            }
                                            list2 = UB.j(bArr5);
                                            i43 = b16;
                                            i42 = i75;
                                            L8 = i76;
                                        } else if (b11 == 1767990114) {
                                            lr2.E(i18 + 9);
                                            int c4 = AbstractC3194fG.c(lr2.p());
                                            byte[] bArr7 = new byte[c4];
                                            lr2.H(bArr7, 0, c4);
                                            byte[] bArr8 = AbstractC4295zm.f35602a;
                                            Lr lr5 = new Lr(bArr7);
                                            String str14 = null;
                                            String str15 = null;
                                            while (lr5.B() > 0 && (str14 == null || str15 == null)) {
                                                int K12 = lr5.K();
                                                int i77 = K12 >> 3;
                                                int i78 = K12 & 2;
                                                int i79 = K12 & 1;
                                                int c9 = AbstractC3194fG.c(lr5.p());
                                                if (i77 > 4 && i77 < 24 && i78 != 0) {
                                                    do {
                                                    } while ((lr5.K() & 128) != 0);
                                                    for (i24 = 128; (lr5.K() & i24) != 0; i24 = 128) {
                                                    }
                                                }
                                                if (i79 != 0) {
                                                    lr5.G(AbstractC3194fG.c(lr5.p()));
                                                }
                                                int i80 = lr5.f26234b + c9;
                                                if (i77 == 31) {
                                                    lr5.G(4);
                                                    Object[] objArr2 = {Integer.valueOf(lr5.K()), Integer.valueOf(lr5.K())};
                                                    String str16 = AbstractC3548lu.f32613a;
                                                    str14 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                                } else if (i77 == 0) {
                                                    while ((lr5.K() & 128) != 0) {
                                                    }
                                                    str15 = lr5.k(4, StandardCharsets.UTF_8);
                                                    if (str15.equals("mp4a")) {
                                                        while ((lr5.K() & 128) != 0) {
                                                        }
                                                        lr5.G(2);
                                                        Er er4 = new Er();
                                                        er4.a(lr5);
                                                        int h29 = er4.h(5);
                                                        if (h29 == 31) {
                                                            h29 = er4.h(6) + 32;
                                                        }
                                                        StringBuilder sb5 = new StringBuilder(str15.length() + 4 + String.valueOf(h29).length());
                                                        sb5.append(str15);
                                                        sb5.append(".40.");
                                                        sb5.append(h29);
                                                        str15 = sb5.toString();
                                                        lr5.E(i80);
                                                    }
                                                }
                                                lr5.E(i80);
                                            }
                                            String o9 = (str14 == null || str15 == null) ? null : D.y.o(new StringBuilder(str14.length() + 1 + str15.length()), str14, com.anythink.core.common.d.j.f12535z, str15);
                                            L8 = i44;
                                            str12 = o9;
                                            list2 = UB.j(bArr7);
                                        } else if (b11 == 1885564227) {
                                            lr2.E(i18 + 12);
                                            ByteOrder byteOrder = (lr2.K() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int K13 = lr2.K();
                                            int b17 = i22 == 1768973165 ? AbstractC3548lu.b(K13, byteOrder) : i22 == 1718641517 ? AbstractC3548lu.c(K13, byteOrder) : i43;
                                            if (b17 == 0) {
                                                b17 = -1;
                                            }
                                            L8 = i44;
                                            i43 = b17;
                                            i22 = i22;
                                            if (b17 != -1) {
                                                str7 = com.anythink.basead.exoplayer.k.o.f8622w;
                                            }
                                            list2 = list;
                                        } else {
                                            L8 = i44;
                                            i19 = i42;
                                            str5 = str7;
                                            str7 = str5;
                                            i42 = i19;
                                            list2 = list;
                                        }
                                    }
                                    L8 = i44;
                                }
                            }
                        }
                        i19 = i42;
                        i39 = 8;
                        lr2 = lr3;
                        str7 = str5;
                        i42 = i19;
                        list2 = list;
                    }
                    if (i20 != i21) {
                        E2 j9 = j(i20, lr2);
                        str5 = (String) j9.f24634v;
                        byte[] bArr9 = (byte[]) j9.f24635w;
                        if (bArr9 == null) {
                            i22 = i16;
                            e23 = j9;
                            str7 = str5;
                            i42 = i19;
                            list2 = list;
                        } else if (com.anythink.basead.exoplayer.k.o.f8583G.equals(str5)) {
                            TC tc = AbstractC3556m1.f32640a;
                            Lr lr6 = new Lr(bArr9);
                            int i81 = 1;
                            lr6.G(1);
                            int i82 = 0;
                            while (true) {
                                e22 = j9;
                                if (lr6.B() > 0) {
                                    int I2 = lr6.I();
                                    i22 = i16;
                                    i23 = com.anythink.basead.exoplayer.k.p.f8630b;
                                    if (I2 == 255) {
                                        lr6.G(i81);
                                        i82 += com.anythink.basead.exoplayer.k.p.f8630b;
                                        j9 = e22;
                                        i16 = i22;
                                        i81 = 1;
                                    }
                                } else {
                                    i22 = i16;
                                    i23 = com.anythink.basead.exoplayer.k.p.f8630b;
                                }
                            }
                            int K14 = lr6.K() + i82;
                            int i83 = 0;
                            while (lr6.B() > 0 && lr6.I() == i23) {
                                lr6.G(1);
                                i83 += i23;
                            }
                            int K15 = lr6.K() + i83;
                            byte[] bArr10 = new byte[K14];
                            int i84 = lr6.f26234b;
                            System.arraycopy(bArr9, i84, bArr10, 0, K14);
                            int i85 = i84 + K14 + K15;
                            int length2 = bArr9.length - i85;
                            byte[] bArr11 = new byte[length2];
                            System.arraycopy(bArr9, i85, bArr11, 0, length2);
                            list2 = UB.k(bArr10, bArr11);
                            e23 = e22;
                            str7 = str5;
                            i42 = i19;
                        } else {
                            i22 = i16;
                            if (com.anythink.basead.exoplayer.k.o.f8617r.equals(str5)) {
                                C4202y0 m8 = AbstractC2720Pd.m(new Er(bArr9, bArr9.length), false);
                                i19 = m8.f35297b;
                                L8 = m8.f35298c;
                                str6 = m8.f35296a;
                            } else {
                                str6 = str12;
                            }
                            e23 = j9;
                            str7 = str5;
                            i42 = i19;
                            str12 = str6;
                            list2 = UB.j(bArr9);
                        }
                    }
                    i22 = i16;
                    str7 = str5;
                    i42 = i19;
                    list2 = list;
                }
                i40 = i18 + i17;
                i36 = i9;
                lr3 = lr2;
                str10 = str3;
                str11 = str4;
                str2 = str7;
                i35 = i22;
                i13 = 2;
            }
            str7 = str2;
            i17 = b10;
            i18 = i40;
            lr2 = lr3;
            i40 = i18 + i17;
            i36 = i9;
            lr3 = lr2;
            str10 = str3;
            str11 = str4;
            str2 = str7;
            i35 = i22;
            i13 = 2;
        }
        String str17 = str2;
        List list3 = list2;
        int i86 = i42;
        if (((TP) qVar.f1062d) != null || str17 == null) {
            return;
        }
        C4065vP c4065vP5 = new C4065vP();
        c4065vP5.c(i10);
        c4065vP5.e(str17);
        c4065vP5.f34781j = str12;
        c4065vP5.f34765F = L8;
        c4065vP5.f34767H = i86;
        c4065vP5.f34768I = i43;
        c4065vP5.f34788q = list3;
        c4065vP5.f34789r = ro2;
        c4065vP5.f34776d = str;
        E2 e24 = e23;
        if (e24 != null) {
            c4065vP5.f34780h = AbstractC3194fG.o(e24.f24632n);
            c4065vP5.i = AbstractC3194fG.o(e24.f24633u);
        } else {
            C3287h0 c3287h02 = c3287h0;
            if (c3287h02 != null) {
                c4065vP5.f34780h = AbstractC3194fG.o(c3287h02.f31130a);
                c4065vP5.i = AbstractC3194fG.o(c3287h02.f31131b);
            }
        }
        qVar.f1062d = new TP(c4065vP5);
    }

    public static E2 j(int i, Lr lr) {
        lr.E(i + 12);
        lr.G(1);
        l(lr);
        lr.G(2);
        int K8 = lr.K();
        if ((K8 & 128) != 0) {
            lr.G(2);
        }
        if ((K8 & 64) != 0) {
            lr.G(lr.K());
        }
        if ((K8 & 32) != 0) {
            lr.G(2);
        }
        lr.G(1);
        l(lr);
        String e6 = K4.e(lr.K());
        if (com.anythink.basead.exoplayer.k.o.f8619t.equals(e6) || com.anythink.basead.exoplayer.k.o.f8580D.equals(e6) || com.anythink.basead.exoplayer.k.o.f8581E.equals(e6)) {
            return new E2(e6, null, -1L, -1L);
        }
        lr.G(4);
        long P8 = lr.P();
        long P9 = lr.P();
        lr.G(1);
        int l9 = l(lr);
        long j9 = P9;
        byte[] bArr = new byte[l9];
        lr.H(bArr, 0, l9);
        if (j9 <= 0) {
            j9 = -1;
        }
        return new E2(e6, bArr, j9, P8 > 0 ? P8 : -1L);
    }

    public static Pair k(Lr lr, int i, int i4) {
        Integer num;
        Y2 y22;
        Pair create;
        int i9;
        int i10;
        Integer num2;
        boolean z8;
        int i11 = lr.f26234b;
        while (i11 - i < i4) {
            lr.E(i11);
            int b9 = lr.b();
            AbstractC2720Pd.k("childAtomSize must be positive", b9 > 0);
            if (lr.b() == 1936289382) {
                int i12 = i11 + 8;
                int i13 = 0;
                int i14 = -1;
                Integer num3 = null;
                String str = null;
                while (i12 - i11 < b9) {
                    lr.E(i12);
                    int b10 = lr.b();
                    int b11 = lr.b();
                    if (b11 == 1718775137) {
                        num3 = Integer.valueOf(lr.b());
                    } else if (b11 == 1935894637) {
                        lr.G(4);
                        str = lr.k(4, StandardCharsets.UTF_8);
                    } else if (b11 == 1935894633) {
                        i14 = i12;
                        i13 = b10;
                    }
                    i12 += b10;
                }
                byte[] bArr = null;
                if (com.anythink.basead.exoplayer.b.bd.equals(str) || com.anythink.basead.exoplayer.b.be.equals(str) || com.anythink.basead.exoplayer.b.bf.equals(str) || com.anythink.basead.exoplayer.b.bg.equals(str)) {
                    AbstractC2720Pd.k("frma atom is mandatory", num3 != null);
                    AbstractC2720Pd.k("schi atom is mandatory", i14 != -1);
                    int i15 = i14 + 8;
                    while (true) {
                        if (i15 - i14 >= i13) {
                            num = num3;
                            y22 = null;
                            break;
                        }
                        lr.E(i15);
                        int b12 = lr.b();
                        if (lr.b() == 1952804451) {
                            int a9 = a(lr.b());
                            lr.G(1);
                            if (a9 == 0) {
                                lr.G(1);
                                i10 = 0;
                                i9 = 0;
                            } else {
                                int K8 = lr.K();
                                i9 = K8 & 15;
                                i10 = (K8 & 240) >> 4;
                            }
                            if (lr.K() == 1) {
                                num2 = num3;
                                z8 = true;
                            } else {
                                num2 = num3;
                                z8 = false;
                            }
                            int K9 = lr.K();
                            byte[] bArr2 = new byte[16];
                            lr.H(bArr2, 0, 16);
                            if (z8 && K9 == 0) {
                                int K10 = lr.K();
                                byte[] bArr3 = new byte[K10];
                                lr.H(bArr3, 0, K10);
                                bArr = bArr3;
                            }
                            num = num2;
                            y22 = new Y2(z8, str, K9, bArr2, i10, i9, bArr);
                        } else {
                            i15 += b12;
                        }
                    }
                    AbstractC2720Pd.k("tenc atom is mandatory", y22 != null);
                    String str2 = AbstractC3548lu.f32613a;
                    create = Pair.create(num, y22);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i11 += b9;
        }
        return null;
    }

    public static int l(Lr lr) {
        int K8 = lr.K();
        int i = K8 & com.anythink.expressad.video.module.a.a.f21886R;
        while ((K8 & 128) == 128) {
            K8 = lr.K();
            i = (i << 7) | (K8 & com.anythink.expressad.video.module.a.a.f21886R);
        }
        return i;
    }
}
