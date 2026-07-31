package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class x0 {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f13978a = n13.w("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (r3 != 13) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<c91, c91> a(p0 p0Var) {
        dr2 dr2Var = p0Var.f9963b;
        dr2Var.f(8);
        c91 c91Var = null;
        c91 c91Var2 = null;
        while (dr2Var.i() >= 8) {
            int k7 = dr2Var.k();
            int m7 = dr2Var.m();
            int m8 = dr2Var.m();
            if (m8 == 1835365473) {
                dr2Var.f(k7);
                int i7 = k7 + m7;
                dr2Var.g(8);
                d(dr2Var);
                while (true) {
                    if (dr2Var.k() >= i7) {
                        break;
                    }
                    int k8 = dr2Var.k();
                    int m9 = dr2Var.m();
                    if (dr2Var.m() == 1768715124) {
                        dr2Var.f(k8);
                        int i8 = k8 + m9;
                        dr2Var.g(8);
                        ArrayList arrayList = new ArrayList();
                        while (dr2Var.k() < i8) {
                            b81 a7 = f1.a(dr2Var);
                            if (a7 != null) {
                                arrayList.add(a7);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c91Var = new c91(arrayList);
                        }
                    } else {
                        dr2Var.f(k8 + m9);
                    }
                }
                c91Var = null;
            } else if (m8 == 1936553057) {
                dr2Var.f(k7);
                int i9 = k7 + m7;
                dr2Var.g(12);
                while (true) {
                    if (dr2Var.k() >= i9) {
                        break;
                    }
                    int k9 = dr2Var.k();
                    int m10 = dr2Var.m();
                    if (dr2Var.m() != 1935766900) {
                        dr2Var.f(k9 + m10);
                    } else if (m10 >= 14) {
                        dr2Var.g(5);
                        int s7 = dr2Var.s();
                        float f7 = 120.0f;
                        if (s7 == 12) {
                            if (s7 == 12) {
                                f7 = 240.0f;
                            }
                        }
                        dr2Var.g(1);
                        c91Var2 = new c91(new p(f7, dr2Var.s()));
                    }
                }
                c91Var2 = null;
            }
            dr2Var.f(k7 + m7);
        }
        return Pair.create(c91Var, c91Var2);
    }

    public static c91 b(o0 o0Var) {
        j jVar;
        p0 d7 = o0Var.d(1751411826);
        p0 d8 = o0Var.d(1801812339);
        p0 d9 = o0Var.d(1768715124);
        if (d7 == null || d8 == null || d9 == null || g(d7.f9963b) != 1835299937) {
            return null;
        }
        dr2 dr2Var = d8.f9963b;
        dr2Var.f(12);
        int m7 = dr2Var.m();
        String[] strArr = new String[m7];
        for (int i7 = 0; i7 < m7; i7++) {
            int m8 = dr2Var.m();
            dr2Var.g(4);
            strArr[i7] = dr2Var.F(m8 - 8, c43.f3729c);
        }
        dr2 dr2Var2 = d9.f9963b;
        dr2Var2.f(8);
        ArrayList arrayList = new ArrayList();
        while (dr2Var2.i() > 8) {
            int k7 = dr2Var2.k();
            int m9 = dr2Var2.m();
            int m10 = dr2Var2.m() - 1;
            if (m10 < 0 || m10 >= m7) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(m10);
                Log.w("AtomParsers", sb.toString());
            } else {
                String str = strArr[m10];
                int i8 = k7 + m9;
                int i9 = f1.f4937b;
                while (true) {
                    int k8 = dr2Var2.k();
                    if (k8 >= i8) {
                        jVar = null;
                        break;
                    }
                    int m11 = dr2Var2.m();
                    if (dr2Var2.m() == 1684108385) {
                        int m12 = dr2Var2.m();
                        int m13 = dr2Var2.m();
                        int i10 = m11 - 16;
                        byte[] bArr = new byte[i10];
                        dr2Var2.b(bArr, 0, i10);
                        jVar = new j(str, bArr, m13, m12);
                        break;
                    }
                    dr2Var2.f(k8 + m11);
                }
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            dr2Var2.f(k7 + m9);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c91(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0c66  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0cc7 A[EDGE_INSN: B:128:0x0cc7->B:129:0x0cc7 BREAK  A[LOOP:6: B:107:0x0c5f->B:123:0x0cbc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0cd0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0ce7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0ced  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0ce9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0ce2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0cda  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0cd2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0c51  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0a65 A[ADDED_TO_REGION, LOOP:13: B:224:0x0a65->B:227:0x0a6f, LOOP_START, PHI: r20
      0x0a65: PHI (r20v8 int) = (r20v7 int), (r20v9 int) binds: [B:223:0x0a63, B:227:0x0a6f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0a59 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0da8  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0b43  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0c04  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<r1> c(o0 o0Var, fd4 fd4Var, long j7, u74 u74Var, boolean z6, boolean z7, e43<o1, o1> e43Var) {
        int i7;
        String str;
        long j8;
        int i8;
        long j9;
        int i9;
        int i10;
        int m7;
        int i11;
        ArrayList arrayList;
        String str2;
        t0 t0Var;
        o0 o0Var2;
        o0 c7;
        long[] jArr;
        long[] jArr2;
        o1 o1Var;
        int i12;
        e43<o1, o1> e43Var2;
        Pair create;
        String str3;
        int i13;
        Pair pair;
        o0 o0Var3;
        w0 w0Var;
        dr2 dr2Var;
        t0 t0Var2;
        u74 u74Var2;
        int i14;
        String str4;
        int i15;
        int i16;
        String str5;
        int i17;
        int i18;
        int i19;
        boolean z8;
        String str6;
        int i20;
        byte[] bArr;
        String str7;
        List<byte[]> list;
        String str8;
        String str9;
        String str10;
        int i21;
        Pair pair2;
        e73 e73Var;
        long j10;
        bf4 bf4Var;
        String str11;
        long j11;
        o1 apply;
        ArrayList arrayList2;
        s0 v0Var;
        p0 p0Var;
        boolean z9;
        int i22;
        int i23;
        int i24;
        int i25;
        int zza;
        long[] jArr3;
        int[] iArr;
        long[] jArr4;
        int i26;
        int i27;
        int i28;
        int i29;
        long j12;
        int i30;
        String str12;
        int i31;
        boolean z10;
        int i32;
        int i33;
        int i34;
        o1 o1Var2;
        int i35;
        int i36;
        long[] jArr5;
        long j13;
        int[] iArr2;
        int[] iArr3;
        long[] jArr6;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        long[] jArr7;
        int i42;
        r1 r1Var;
        r1 r1Var2;
        int length;
        int i43;
        long[] jArr8;
        int i44;
        int i45;
        int[] iArr4;
        int[] iArr5;
        int i46;
        long[] jArr9;
        int i47;
        int i48;
        int length2;
        o0 o0Var4 = o0Var;
        u74 u74Var3 = u74Var;
        ArrayList arrayList3 = new ArrayList();
        int i49 = 0;
        while (i49 < o0Var4.f9412d.size()) {
            o0 o0Var5 = o0Var4.f9412d.get(i49);
            if (o0Var5.f10494a != 1953653099) {
                arrayList2 = arrayList3;
                i7 = i49;
            } else {
                p0 d7 = o0Var4.d(1836476516);
                Objects.requireNonNull(d7);
                o0 c8 = o0Var5.c(1835297121);
                Objects.requireNonNull(c8);
                p0 d8 = c8.d(1751411826);
                Objects.requireNonNull(d8);
                int e7 = e(g(d8.f9963b));
                i7 = i49;
                if (e7 == -1) {
                    e43Var2 = e43Var;
                    str2 = "AtomParsers";
                    o0Var2 = o0Var5;
                    arrayList = arrayList3;
                } else {
                    p0 d9 = o0Var5.d(1953196132);
                    Objects.requireNonNull(d9);
                    dr2 dr2Var2 = d9.f9963b;
                    dr2Var2.f(8);
                    int a7 = q0.a(dr2Var2.m());
                    dr2Var2.g(a7 == 0 ? 8 : 16);
                    int m8 = dr2Var2.m();
                    dr2Var2.g(4);
                    int k7 = dr2Var2.k();
                    int i50 = a7 == 0 ? 4 : 8;
                    int i51 = 0;
                    while (true) {
                        if (i51 >= i50) {
                            dr2Var2.g(i50);
                            str = "AtomParsers";
                            break;
                        }
                        if (dr2Var2.h()[k7 + i51] != -1) {
                            long A = a7 == 0 ? dr2Var2.A() : dr2Var2.B();
                            str = "AtomParsers";
                            if (A != 0) {
                                j8 = A;
                            }
                        } else {
                            i51++;
                        }
                    }
                    j8 = -9223372036854775807L;
                    dr2Var2.g(16);
                    int m9 = dr2Var2.m();
                    int m10 = dr2Var2.m();
                    dr2Var2.g(4);
                    int m11 = dr2Var2.m();
                    int m12 = dr2Var2.m();
                    int i52 = 65536;
                    String str13 = str;
                    if (m9 == 0) {
                        if (m10 != 65536) {
                            m9 = 0;
                        } else if (m11 != -65536) {
                            m9 = 0;
                            m10 = 65536;
                        } else if (m12 == 0) {
                            i8 = 90;
                            w0 w0Var2 = new w0(m8, j8, i8);
                            if (j7 == -9223372036854775807L) {
                                j11 = w0Var2.f13654b;
                                j9 = j11;
                            } else {
                                j9 = j7;
                            }
                            dr2 dr2Var3 = d7.f9963b;
                            dr2Var3.f(8);
                            dr2Var3.g(q0.a(dr2Var3.m()) == 0 ? 8 : 16);
                            long A2 = dr2Var3.A();
                            long Z = j9 != -9223372036854775807L ? n13.Z(j9, 1000000L, A2) : -9223372036854775807L;
                            o0 c9 = c8.c(1835626086);
                            Objects.requireNonNull(c9);
                            o0 c10 = c9.c(1937007212);
                            Objects.requireNonNull(c10);
                            p0 d10 = c8.d(1835296868);
                            Objects.requireNonNull(d10);
                            dr2 dr2Var4 = d10.f9963b;
                            dr2Var4.f(8);
                            int a8 = q0.a(dr2Var4.m());
                            dr2Var4.g(a8 == 0 ? 8 : 16);
                            long A3 = dr2Var4.A();
                            dr2Var4.g(a8 == 0 ? 4 : 8);
                            int w6 = dr2Var4.w();
                            StringBuilder sb = new StringBuilder(3);
                            sb.append((char) (((w6 >> 10) & 31) + 96));
                            sb.append((char) (((w6 >> 5) & 31) + 96));
                            sb.append((char) ((w6 & 31) + 96));
                            Pair create2 = Pair.create(Long.valueOf(A3), sb.toString());
                            p0 d11 = c10.d(1937011556);
                            Objects.requireNonNull(d11);
                            dr2 dr2Var5 = d11.f9963b;
                            i9 = w0Var2.f13653a;
                            i10 = w0Var2.f13655c;
                            String str14 = (String) create2.second;
                            dr2Var5.f(12);
                            m7 = dr2Var5.m();
                            t0 t0Var3 = new t0(m7);
                            i11 = 0;
                            while (i11 < m7) {
                                int k8 = dr2Var5.k();
                                ArrayList arrayList4 = arrayList3;
                                int m13 = dr2Var5.m();
                                int i53 = m7;
                                sc4.b(m13 > 0, "childAtomSize must be positive");
                                int m14 = dr2Var5.m();
                                int i54 = i10;
                                if (m14 == 1635148593 || m14 == 1635148595 || m14 == 1701733238 || m14 == 1831958048 || m14 == 1836070006 || m14 == 1752589105 || m14 == 1751479857 || m14 == 1932670515 || m14 == 1211250227 || m14 == 1987063864 || m14 == 1987063865 || m14 == 1635135537 || m14 == 1685479798 || m14 == 1685479729 || m14 == 1685481573 || m14 == 1685481521) {
                                    t0 t0Var4 = t0Var3;
                                    str3 = str14;
                                    int i55 = i9;
                                    i13 = e7;
                                    pair = create2;
                                    o0Var3 = o0Var5;
                                    w0Var = w0Var2;
                                    String str15 = str13;
                                    dr2Var = dr2Var5;
                                    dr2Var.f(k8 + 16);
                                    dr2Var.g(16);
                                    int w7 = dr2Var.w();
                                    int w8 = dr2Var.w();
                                    dr2Var.g(50);
                                    int k9 = dr2Var.k();
                                    if (m14 == 1701733238) {
                                        Pair<Integer, p1> i56 = i(dr2Var, k8, m13);
                                        if (i56 != null) {
                                            int intValue = ((Integer) i56.first).intValue();
                                            if (u74Var3 == null) {
                                                t0Var2 = t0Var4;
                                                u74Var2 = null;
                                            } else {
                                                u74Var2 = u74Var3.a(((p1) i56.second).f9984b);
                                                t0Var2 = t0Var4;
                                            }
                                            t0Var2.f12021a[i11] = (p1) i56.second;
                                            m14 = intValue;
                                        } else {
                                            t0Var2 = t0Var4;
                                            u74Var2 = u74Var3;
                                            m14 = 1701733238;
                                        }
                                        dr2Var.f(k9);
                                    } else {
                                        t0Var2 = t0Var4;
                                        u74Var2 = u74Var3;
                                    }
                                    if (m14 == 1831958048) {
                                        i14 = m14;
                                        str4 = "video/mpeg";
                                    } else {
                                        i14 = 1211250227;
                                        if (m14 == 1211250227) {
                                            str4 = "video/3gpp";
                                        } else {
                                            i14 = m14;
                                            str4 = null;
                                        }
                                    }
                                    int i57 = k9;
                                    List<byte[]> list2 = null;
                                    int i58 = -1;
                                    String str16 = null;
                                    byte[] bArr2 = null;
                                    p14 p14Var = null;
                                    float f7 = 1.0f;
                                    String str17 = str4;
                                    boolean z11 = false;
                                    while (i57 - k8 < m13) {
                                        dr2Var.f(i57);
                                        int k10 = dr2Var.k();
                                        int m15 = dr2Var.m();
                                        if (m15 != 0) {
                                            i19 = m15;
                                        } else {
                                            if (dr2Var.k() - k8 == m13) {
                                                break;
                                            }
                                            i19 = 0;
                                        }
                                        int i59 = i11;
                                        int i60 = m13;
                                        sc4.b(i19 > 0, "childAtomSize must be positive");
                                        int m16 = dr2Var.m();
                                        if (m16 == 1635148611) {
                                            sc4.b(str17 == null, null);
                                            dr2Var.f(k10 + 8);
                                            xb4 a9 = xb4.a(dr2Var);
                                            list = a9.f14114a;
                                            t0Var2.f12023c = a9.f14115b;
                                            if (!z11) {
                                                f7 = a9.f14118e;
                                            }
                                            str8 = a9.f14119f;
                                            str9 = "video/avc";
                                        } else if (m16 == 1752589123) {
                                            sc4.b(str17 == null, null);
                                            dr2Var.f(k10 + 8);
                                            gd4 a10 = gd4.a(dr2Var);
                                            list = a10.f5562a;
                                            t0Var2.f12023c = a10.f5563b;
                                            if (!z11) {
                                                f7 = a10.f5564c;
                                            }
                                            str8 = a10.f5565d;
                                            str9 = "video/hevc";
                                        } else {
                                            if (m16 == 1685480259 || m16 == 1685485123) {
                                                z8 = z11;
                                                str6 = str15;
                                                i20 = i14;
                                                lc4 a11 = lc4.a(dr2Var);
                                                if (a11 != null) {
                                                    str17 = "video/dolby-vision";
                                                    str16 = a11.f7934a;
                                                }
                                            } else {
                                                if (m16 == 1987076931) {
                                                    sc4.b(str17 == null, null);
                                                    str7 = i14 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                } else if (m16 == 1635135811) {
                                                    sc4.b(str17 == null, null);
                                                    str7 = "video/av01";
                                                } else if (m16 == 1681012275) {
                                                    sc4.b(str17 == null, null);
                                                    str7 = "video/3gpp";
                                                } else if (m16 == 1702061171) {
                                                    sc4.b(str17 == null, null);
                                                    Pair<String, byte[]> h7 = h(dr2Var, k10);
                                                    String str18 = (String) h7.first;
                                                    byte[] bArr3 = (byte[]) h7.second;
                                                    if (bArr3 != null) {
                                                        list2 = e73.x(bArr3);
                                                    }
                                                    str17 = str18;
                                                    str6 = str15;
                                                    i20 = i14;
                                                    i57 += i19;
                                                    i11 = i59;
                                                    m13 = i60;
                                                    i14 = i20;
                                                    str15 = str6;
                                                } else {
                                                    if (m16 == 1885434736) {
                                                        dr2Var.f(k10 + 8);
                                                        f7 = dr2Var.v() / dr2Var.v();
                                                        str6 = str15;
                                                        z11 = true;
                                                    } else {
                                                        if (m16 == 1937126244) {
                                                            int i61 = k10 + 8;
                                                            while (true) {
                                                                if (i61 - k10 >= i19) {
                                                                    z8 = z11;
                                                                    bArr = null;
                                                                    break;
                                                                }
                                                                dr2Var.f(i61);
                                                                int m17 = dr2Var.m();
                                                                int i62 = k10;
                                                                z8 = z11;
                                                                if (dr2Var.m() == 1886547818) {
                                                                    bArr = Arrays.copyOfRange(dr2Var.h(), i61, m17 + i61);
                                                                    break;
                                                                }
                                                                i61 += m17;
                                                                k10 = i62;
                                                                z11 = z8;
                                                            }
                                                            bArr2 = bArr;
                                                        } else {
                                                            z8 = z11;
                                                            if (m16 == 1936995172) {
                                                                int s7 = dr2Var.s();
                                                                dr2Var.g(3);
                                                                if (s7 == 0) {
                                                                    int s8 = dr2Var.s();
                                                                    if (s8 == 0) {
                                                                        i58 = 0;
                                                                    } else if (s8 == 1) {
                                                                        i58 = 1;
                                                                    } else if (s8 == 2) {
                                                                        i58 = 2;
                                                                    } else if (s8 == 3) {
                                                                        i58 = 3;
                                                                    }
                                                                }
                                                            } else {
                                                                if (m16 == 1668246642) {
                                                                    int m18 = dr2Var.m();
                                                                    if (m18 == 1852009592 || m18 == 1852009571) {
                                                                        String str19 = str15;
                                                                        int w9 = dr2Var.w();
                                                                        int w10 = dr2Var.w();
                                                                        dr2Var.g(2);
                                                                        i20 = i14;
                                                                        str6 = str19;
                                                                        p14Var = new p14(p14.a(w9), true != (m18 == 1852009592 && (dr2Var.s() & 128) != 0) ? 2 : 1, p14.b(w10), null);
                                                                    } else {
                                                                        String b7 = q0.b(m18);
                                                                        String str20 = str15;
                                                                        Log.w(str20, b7.length() != 0 ? "Unsupported color type: ".concat(b7) : new String("Unsupported color type: "));
                                                                        str6 = str20;
                                                                    }
                                                                } else {
                                                                    str6 = str15;
                                                                }
                                                                i20 = i14;
                                                            }
                                                        }
                                                        str6 = str15;
                                                        z11 = z8;
                                                    }
                                                    i20 = i14;
                                                    i57 += i19;
                                                    i11 = i59;
                                                    m13 = i60;
                                                    i14 = i20;
                                                    str15 = str6;
                                                }
                                                str17 = str7;
                                                str6 = str15;
                                                i20 = i14;
                                                i57 += i19;
                                                i11 = i59;
                                                m13 = i60;
                                                i14 = i20;
                                                str15 = str6;
                                            }
                                            z11 = z8;
                                            i57 += i19;
                                            i11 = i59;
                                            m13 = i60;
                                            i14 = i20;
                                            str15 = str6;
                                        }
                                        str16 = str8;
                                        str17 = str9;
                                        str6 = str15;
                                        list2 = list;
                                        i20 = i14;
                                        i57 += i19;
                                        i11 = i59;
                                        m13 = i60;
                                        i14 = i20;
                                        str15 = str6;
                                    }
                                    i15 = i11;
                                    i16 = m13;
                                    str5 = str15;
                                    if (str17 != null) {
                                        bf4 bf4Var2 = new bf4();
                                        i18 = i55;
                                        bf4Var2.g(i18);
                                        bf4Var2.s(str17);
                                        bf4Var2.f0(str16);
                                        bf4Var2.x(w7);
                                        bf4Var2.f(w8);
                                        bf4Var2.p(f7);
                                        i17 = i54;
                                        bf4Var2.r(i17);
                                        bf4Var2.q(bArr2);
                                        bf4Var2.v(i58);
                                        bf4Var2.i(list2);
                                        bf4Var2.b(u74Var2);
                                        bf4Var2.g0(p14Var);
                                        t0Var2.f12022b = bf4Var2.y();
                                    } else {
                                        i17 = i54;
                                        i18 = i55;
                                    }
                                } else if (m14 == 1836069985 || m14 == 1701733217 || m14 == 1633889587 || m14 == 1700998451 || m14 == 1633889588 || m14 == 1685353315 || m14 == 1685353317 || m14 == 1685353320 || m14 == 1685353324 || m14 == 1685353336 || m14 == 1935764850 || m14 == 1935767394 || m14 == 1819304813 || m14 == 1936684916 || m14 == 1953984371 || m14 == 778924082 || m14 == 778924083 || m14 == 1835557169 || m14 == 1835560241 || m14 == 1634492771 || m14 == 1634492791 || m14 == 1970037111 || m14 == 1332770163 || m14 == 1716281667) {
                                    Pair pair3 = create2;
                                    t0 t0Var5 = t0Var3;
                                    str3 = str14;
                                    w0Var = w0Var2;
                                    dr2Var = dr2Var5;
                                    i13 = e7;
                                    pair = pair3;
                                    o0Var3 = o0Var5;
                                    j(dr2Var5, m14, k8, m13, i9, str3, z7, u74Var, t0Var5, i11);
                                    i16 = m13;
                                    t0Var2 = t0Var5;
                                    i17 = i54;
                                    i18 = i9;
                                    str5 = str13;
                                    i15 = i11;
                                } else {
                                    if (m14 == 1414810956 || m14 == 1954034535 || m14 == 2004251764 || m14 == 1937010800 || m14 == 1664495672) {
                                        dr2Var5.f(k8 + 16);
                                        if (m14 == 1414810956) {
                                            str10 = "application/ttml+xml";
                                        } else {
                                            if (m14 == 1954034535) {
                                                int i63 = m13 - 16;
                                                byte[] bArr4 = new byte[i63];
                                                dr2Var5.b(bArr4, 0, i63);
                                                pair2 = create2;
                                                e73Var = e73.x(bArr4);
                                                str10 = "application/x-quicktime-tx3g";
                                                i21 = e7;
                                                j10 = Long.MAX_VALUE;
                                            } else if (m14 == 2004251764) {
                                                str10 = "application/x-mp4-vtt";
                                            } else if (m14 == 1937010800) {
                                                str10 = "application/ttml+xml";
                                                i21 = e7;
                                                pair2 = create2;
                                                e73Var = null;
                                                j10 = 0;
                                            } else {
                                                t0Var3.f12024d = 1;
                                                str10 = "application/x-mp4-cea-608";
                                            }
                                            bf4 bf4Var3 = new bf4();
                                            bf4Var3.g(i9);
                                            bf4Var3.s(str10);
                                            bf4Var3.k(str14);
                                            bf4Var3.w(j10);
                                            bf4Var3.i(e73Var);
                                            t0Var3.f12022b = bf4Var3.y();
                                            i15 = i11;
                                            t0Var2 = t0Var3;
                                            str3 = str14;
                                            i18 = i9;
                                            o0Var3 = o0Var5;
                                            i16 = m13;
                                            w0Var = w0Var2;
                                            str5 = str13;
                                            i17 = i54;
                                            i13 = i21;
                                            pair = pair2;
                                        }
                                        pair2 = create2;
                                        e73Var = null;
                                        i21 = e7;
                                        j10 = Long.MAX_VALUE;
                                        bf4 bf4Var32 = new bf4();
                                        bf4Var32.g(i9);
                                        bf4Var32.s(str10);
                                        bf4Var32.k(str14);
                                        bf4Var32.w(j10);
                                        bf4Var32.i(e73Var);
                                        t0Var3.f12022b = bf4Var32.y();
                                        i15 = i11;
                                        t0Var2 = t0Var3;
                                        str3 = str14;
                                        i18 = i9;
                                        o0Var3 = o0Var5;
                                        i16 = m13;
                                        w0Var = w0Var2;
                                        str5 = str13;
                                        i17 = i54;
                                        i13 = i21;
                                        pair = pair2;
                                    } else if (m14 == 1835365492) {
                                        dr2Var5.f(k8 + 16);
                                        dr2Var5.D((char) 0);
                                        str11 = dr2Var5.D((char) 0);
                                        if (str11 != null) {
                                            bf4Var = new bf4();
                                            bf4Var.g(i9);
                                            bf4Var.s(str11);
                                            t0Var3.f12022b = bf4Var.y();
                                        }
                                        i15 = i11;
                                        str3 = str14;
                                        i18 = i9;
                                        i13 = e7;
                                        pair = create2;
                                        o0Var3 = o0Var5;
                                        i16 = m13;
                                        w0Var = w0Var2;
                                        str5 = str13;
                                        i17 = i54;
                                        t0Var2 = t0Var3;
                                    } else {
                                        if (m14 == 1667329389) {
                                            bf4Var = new bf4();
                                            bf4Var.g(i9);
                                            str11 = "application/x-camera-motion";
                                            bf4Var.s(str11);
                                            t0Var3.f12022b = bf4Var.y();
                                        }
                                        i15 = i11;
                                        str3 = str14;
                                        i18 = i9;
                                        i13 = e7;
                                        pair = create2;
                                        o0Var3 = o0Var5;
                                        i16 = m13;
                                        w0Var = w0Var2;
                                        str5 = str13;
                                        i17 = i54;
                                        t0Var2 = t0Var3;
                                    }
                                    dr2Var = dr2Var5;
                                }
                                dr2Var.f(k8 + i16);
                                i11 = i15 + 1;
                                u74Var3 = u74Var;
                                i9 = i18;
                                i10 = i17;
                                t0Var3 = t0Var2;
                                dr2Var5 = dr2Var;
                                w0Var2 = w0Var;
                                str14 = str3;
                                e7 = i13;
                                arrayList3 = arrayList4;
                                m7 = i53;
                                create2 = pair;
                                o0Var5 = o0Var3;
                                str13 = str5;
                            }
                            int i64 = e7;
                            Pair pair4 = create2;
                            arrayList = arrayList3;
                            w0 w0Var3 = w0Var2;
                            str2 = str13;
                            t0Var = t0Var3;
                            o0Var2 = o0Var5;
                            c7 = o0Var2.c(1701082227);
                            if (c7 != null) {
                                p0 d12 = c7.d(1701606260);
                                if (d12 == null) {
                                    create = null;
                                } else {
                                    dr2 dr2Var6 = d12.f9963b;
                                    dr2Var6.f(8);
                                    int a12 = q0.a(dr2Var6.m());
                                    int v6 = dr2Var6.v();
                                    long[] jArr10 = new long[v6];
                                    long[] jArr11 = new long[v6];
                                    for (int i65 = 0; i65 < v6; i65++) {
                                        jArr10[i65] = a12 == 1 ? dr2Var6.B() : dr2Var6.A();
                                        jArr11[i65] = a12 == 1 ? dr2Var6.z() : dr2Var6.m();
                                        if (dr2Var6.G() != 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        dr2Var6.g(2);
                                    }
                                    create = Pair.create(jArr10, jArr11);
                                }
                                if (create != null) {
                                    jArr = (long[]) create.first;
                                    jArr2 = (long[]) create.second;
                                    if (t0Var.f12022b != null) {
                                        e43Var2 = e43Var;
                                    } else {
                                        i12 = w0Var3.f13653a;
                                        o1Var = new o1(i12, i64, ((Long) pair4.first).longValue(), A2, Z, t0Var.f12022b, t0Var.f12024d, t0Var.f12021a, t0Var.f12023c, jArr, jArr2);
                                        e43Var2 = e43Var;
                                        apply = e43Var2.apply(o1Var);
                                        if (apply == null) {
                                            o0 c11 = o0Var2.c(1835297121);
                                            Objects.requireNonNull(c11);
                                            o0 c12 = c11.c(1835626086);
                                            Objects.requireNonNull(c12);
                                            o0 c13 = c12.c(1937007212);
                                            Objects.requireNonNull(c13);
                                            p0 d13 = c13.d(1937011578);
                                            if (d13 != null) {
                                                v0Var = new u0(d13, apply.f9430f);
                                            } else {
                                                p0 d14 = c13.d(1937013298);
                                                if (d14 == null) {
                                                    throw dz.a("Track has no sample table size information", null);
                                                }
                                                v0Var = new v0(d14);
                                            }
                                            int a13 = v0Var.a();
                                            if (a13 == 0) {
                                                r1Var2 = new r1(apply, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                            } else {
                                                p0 d15 = c13.d(1937007471);
                                                if (d15 == null) {
                                                    p0 d16 = c13.d(1668232756);
                                                    Objects.requireNonNull(d16);
                                                    p0Var = d16;
                                                    z9 = true;
                                                } else {
                                                    p0Var = d15;
                                                    z9 = false;
                                                }
                                                dr2 dr2Var7 = p0Var.f9963b;
                                                p0 d17 = c13.d(1937011555);
                                                Objects.requireNonNull(d17);
                                                dr2 dr2Var8 = d17.f9963b;
                                                p0 d18 = c13.d(1937011827);
                                                Objects.requireNonNull(d18);
                                                dr2 dr2Var9 = d18.f9963b;
                                                p0 d19 = c13.d(1937011571);
                                                dr2 dr2Var10 = d19 != null ? d19.f9963b : null;
                                                p0 d20 = c13.d(1668576371);
                                                dr2 dr2Var11 = d20 != null ? d20.f9963b : null;
                                                r0 r0Var = new r0(dr2Var8, dr2Var7, z9);
                                                dr2Var9.f(12);
                                                int v7 = dr2Var9.v() - 1;
                                                int v8 = dr2Var9.v();
                                                int v9 = dr2Var9.v();
                                                if (dr2Var11 != null) {
                                                    dr2Var11.f(12);
                                                    i22 = dr2Var11.v();
                                                } else {
                                                    i22 = 0;
                                                }
                                                if (dr2Var10 != null) {
                                                    dr2Var10.f(12);
                                                    i24 = dr2Var10.v();
                                                    if (i24 > 0) {
                                                        i23 = -1;
                                                        i25 = dr2Var10.v() - 1;
                                                        zza = v0Var.zza();
                                                        String str21 = apply.f9430f.f3660l;
                                                        if (zza != i23 && (("audio/raw".equals(str21) || "audio/g711-mlaw".equals(str21) || "audio/g711-alaw".equals(str21)) && v7 == 0)) {
                                                            if (i22 == 0 || i24 != 0) {
                                                                v7 = 0;
                                                            } else {
                                                                int i66 = r0Var.f10934a;
                                                                long[] jArr12 = new long[i66];
                                                                int[] iArr6 = new int[i66];
                                                                while (r0Var.a()) {
                                                                    int i67 = r0Var.f10935b;
                                                                    jArr12[i67] = r0Var.f10937d;
                                                                    iArr6[i67] = r0Var.f10936c;
                                                                }
                                                                long j14 = v9;
                                                                int i68 = 8192 / zza;
                                                                int i69 = 0;
                                                                for (int i70 = 0; i70 < i66; i70++) {
                                                                    i69 += n13.K(iArr6[i70], i68);
                                                                }
                                                                long[] jArr13 = new long[i69];
                                                                iArr3 = new int[i69];
                                                                long[] jArr14 = new long[i69];
                                                                int[] iArr7 = new int[i69];
                                                                int i71 = 0;
                                                                int i72 = 0;
                                                                i37 = 0;
                                                                int i73 = 0;
                                                                while (i71 < i66) {
                                                                    int i74 = iArr6[i71];
                                                                    long j15 = jArr12[i71];
                                                                    int i75 = i66;
                                                                    int i76 = i74;
                                                                    while (i76 > 0) {
                                                                        int min = Math.min(i68, i76);
                                                                        jArr13[i73] = j15;
                                                                        long[] jArr15 = jArr12;
                                                                        int i77 = zza * min;
                                                                        iArr3[i73] = i77;
                                                                        i37 = Math.max(i37, i77);
                                                                        jArr14[i73] = i72 * j14;
                                                                        iArr7[i73] = 1;
                                                                        j15 += iArr3[i73];
                                                                        i72 += min;
                                                                        i76 -= min;
                                                                        i73++;
                                                                        i68 = i68;
                                                                        jArr12 = jArr15;
                                                                        jArr13 = jArr13;
                                                                    }
                                                                    i71++;
                                                                    i66 = i75;
                                                                    jArr12 = jArr12;
                                                                }
                                                                j13 = j14 * i72;
                                                                iArr2 = iArr7;
                                                                jArr4 = jArr14;
                                                                jArr6 = jArr13;
                                                                o1Var2 = apply;
                                                                long Z2 = n13.Z(j13, 1000000L, o1Var2.f9427c);
                                                                jArr7 = o1Var2.f9432h;
                                                                if (jArr7 != null) {
                                                                    n13.n(jArr4, 1000000L, o1Var2.f9427c);
                                                                    r1Var2 = new r1(o1Var2, jArr6, iArr3, i37, jArr4, iArr2, Z2);
                                                                } else {
                                                                    if (jArr7.length == 1 && o1Var2.f9426b == 1 && (length2 = jArr4.length) >= 2) {
                                                                        long[] jArr16 = o1Var2.f9433i;
                                                                        Objects.requireNonNull(jArr16);
                                                                        long j16 = jArr16[0];
                                                                        int i78 = a13;
                                                                        long Z3 = j16 + n13.Z(jArr7[0], o1Var2.f9427c, o1Var2.f9428d);
                                                                        int i79 = length2 - 1;
                                                                        int L = n13.L(4, 0, i79);
                                                                        int L2 = n13.L(length2 - 4, 0, i79);
                                                                        if (jArr4[0] > j16 || j16 >= jArr4[L] || jArr4[L2] >= Z3 || Z3 > j13) {
                                                                            i42 = i78;
                                                                            long[] jArr17 = o1Var2.f9432h;
                                                                            length = jArr17.length;
                                                                            if (length == 1) {
                                                                                if (jArr17[0] == 0) {
                                                                                    long[] jArr18 = o1Var2.f9433i;
                                                                                    Objects.requireNonNull(jArr18);
                                                                                    long j17 = jArr18[0];
                                                                                    for (int i80 = 0; i80 < jArr4.length; i80++) {
                                                                                        jArr4[i80] = n13.Z(jArr4[i80] - j17, 1000000L, o1Var2.f9427c);
                                                                                    }
                                                                                    r1Var = new r1(o1Var2, jArr6, iArr3, i37, jArr4, iArr2, n13.Z(j13 - j17, 1000000L, o1Var2.f9427c));
                                                                                    r1Var2 = r1Var;
                                                                                } else {
                                                                                    length = 1;
                                                                                }
                                                                            }
                                                                            boolean z12 = o1Var2.f9426b != 1;
                                                                            int[] iArr8 = new int[length];
                                                                            int[] iArr9 = new int[length];
                                                                            long[] jArr19 = o1Var2.f9433i;
                                                                            Objects.requireNonNull(jArr19);
                                                                            i43 = 0;
                                                                            int i81 = 0;
                                                                            int i82 = 0;
                                                                            boolean z13 = false;
                                                                            while (true) {
                                                                                jArr8 = o1Var2.f9432h;
                                                                                i44 = i37;
                                                                                if (i43 < jArr8.length) {
                                                                                    break;
                                                                                }
                                                                                long[] jArr20 = jArr6;
                                                                                int[] iArr10 = iArr3;
                                                                                long j18 = jArr19[i43];
                                                                                if (j18 != -1) {
                                                                                    long j19 = jArr8[i43];
                                                                                    boolean z14 = z13;
                                                                                    jArr9 = jArr20;
                                                                                    i46 = i42;
                                                                                    int i83 = i81;
                                                                                    long Z4 = n13.Z(j19, o1Var2.f9427c, o1Var2.f9428d);
                                                                                    int i84 = 1;
                                                                                    iArr8[i43] = n13.J(jArr4, j18, true, true);
                                                                                    iArr9[i43] = n13.H(jArr4, j18 + Z4, z12, false);
                                                                                    while (true) {
                                                                                        i47 = iArr8[i43];
                                                                                        i48 = iArr9[i43];
                                                                                        if (i47 >= i48 || (iArr2[i47] & i84) != 0) {
                                                                                            break;
                                                                                        }
                                                                                        iArr8[i43] = i47 + 1;
                                                                                        i84 = 1;
                                                                                    }
                                                                                    int i85 = i83 + (i48 - i47);
                                                                                    z13 = z14 | (i82 != i47);
                                                                                    i82 = i48;
                                                                                    i81 = i85;
                                                                                } else {
                                                                                    i46 = i42;
                                                                                    jArr9 = jArr20;
                                                                                }
                                                                                i43++;
                                                                                i37 = i44;
                                                                                iArr3 = iArr10;
                                                                                jArr6 = jArr9;
                                                                                i42 = i46;
                                                                            }
                                                                            long[] jArr21 = jArr6;
                                                                            int[] iArr11 = iArr3;
                                                                            boolean z15 = z13 | (i81 == i42);
                                                                            long[] jArr22 = !z15 ? new long[i81] : jArr21;
                                                                            int[] iArr12 = !z15 ? new int[i81] : iArr11;
                                                                            int i86 = true != z15 ? 0 : i44;
                                                                            int[] iArr13 = !z15 ? new int[i81] : iArr2;
                                                                            long[] jArr23 = new long[i81];
                                                                            int i87 = i86;
                                                                            i45 = 0;
                                                                            int i88 = 0;
                                                                            long j20 = 0;
                                                                            while (i45 < o1Var2.f9432h.length) {
                                                                                long j21 = o1Var2.f9433i[i45];
                                                                                int i89 = iArr8[i45];
                                                                                int i90 = iArr9[i45];
                                                                                if (z15) {
                                                                                    int i91 = i90 - i89;
                                                                                    iArr4 = iArr8;
                                                                                    System.arraycopy(jArr21, i89, jArr22, i88, i91);
                                                                                    iArr5 = iArr11;
                                                                                    System.arraycopy(iArr5, i89, iArr12, i88, i91);
                                                                                    System.arraycopy(iArr2, i89, iArr13, i88, i91);
                                                                                } else {
                                                                                    iArr4 = iArr8;
                                                                                    iArr5 = iArr11;
                                                                                }
                                                                                while (i89 < i90) {
                                                                                    int[] iArr14 = iArr2;
                                                                                    int i92 = i90;
                                                                                    long[] jArr24 = jArr4;
                                                                                    int[] iArr15 = iArr5;
                                                                                    int[] iArr16 = iArr9;
                                                                                    jArr23[i88] = n13.Z(j20, 1000000L, o1Var2.f9428d) + n13.Z(Math.max(0L, jArr4[i89] - j21), 1000000L, o1Var2.f9427c);
                                                                                    if (z15 && iArr12[i88] > i87) {
                                                                                        i87 = iArr15[i89];
                                                                                    }
                                                                                    i88++;
                                                                                    i89++;
                                                                                    i90 = i92;
                                                                                    iArr9 = iArr16;
                                                                                    iArr5 = iArr15;
                                                                                    jArr4 = jArr24;
                                                                                    iArr2 = iArr14;
                                                                                }
                                                                                int[] iArr17 = iArr5;
                                                                                j20 += o1Var2.f9432h[i45];
                                                                                i45++;
                                                                                iArr8 = iArr4;
                                                                                iArr9 = iArr9;
                                                                                iArr11 = iArr17;
                                                                                iArr2 = iArr2;
                                                                            }
                                                                            r1Var2 = new r1(o1Var2, jArr22, iArr12, i87, jArr23, iArr13, n13.Z(j20, 1000000L, o1Var2.f9428d));
                                                                        } else {
                                                                            i42 = i78;
                                                                            long Z5 = n13.Z(j16 - jArr4[0], o1Var2.f9430f.f3674z, o1Var2.f9427c);
                                                                            long Z6 = n13.Z(j13 - Z3, o1Var2.f9430f.f3674z, o1Var2.f9427c);
                                                                            if ((Z5 != 0 || Z6 != 0) && Z5 <= 2147483647L && Z6 <= 2147483647L) {
                                                                                fd4Var.f5092a = (int) Z5;
                                                                                fd4Var.f5093b = (int) Z6;
                                                                                n13.n(jArr4, 1000000L, o1Var2.f9427c);
                                                                                r1Var = new r1(o1Var2, jArr6, iArr3, i37, jArr4, iArr2, n13.Z(o1Var2.f9432h[0], 1000000L, o1Var2.f9428d));
                                                                                r1Var2 = r1Var;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i42 = a13;
                                                                    }
                                                                    long[] jArr172 = o1Var2.f9432h;
                                                                    length = jArr172.length;
                                                                    if (length == 1) {
                                                                    }
                                                                    if (o1Var2.f9426b != 1) {
                                                                    }
                                                                    int[] iArr82 = new int[length];
                                                                    int[] iArr92 = new int[length];
                                                                    long[] jArr192 = o1Var2.f9433i;
                                                                    Objects.requireNonNull(jArr192);
                                                                    i43 = 0;
                                                                    int i812 = 0;
                                                                    int i822 = 0;
                                                                    boolean z132 = false;
                                                                    while (true) {
                                                                        jArr8 = o1Var2.f9432h;
                                                                        i44 = i37;
                                                                        if (i43 < jArr8.length) {
                                                                        }
                                                                        i43++;
                                                                        i37 = i44;
                                                                        iArr3 = iArr10;
                                                                        jArr6 = jArr9;
                                                                        i42 = i46;
                                                                    }
                                                                    long[] jArr212 = jArr6;
                                                                    int[] iArr112 = iArr3;
                                                                    boolean z152 = z132 | (i812 == i42);
                                                                    if (!z152) {
                                                                    }
                                                                    if (!z152) {
                                                                    }
                                                                    if (true != z152) {
                                                                    }
                                                                    if (!z152) {
                                                                    }
                                                                    long[] jArr232 = new long[i812];
                                                                    int i872 = i86;
                                                                    i45 = 0;
                                                                    int i882 = 0;
                                                                    long j202 = 0;
                                                                    while (i45 < o1Var2.f9432h.length) {
                                                                    }
                                                                    r1Var2 = new r1(o1Var2, jArr22, iArr12, i872, jArr232, iArr13, n13.Z(j202, 1000000L, o1Var2.f9428d));
                                                                }
                                                            }
                                                        }
                                                        jArr3 = new long[a13];
                                                        iArr = new int[a13];
                                                        jArr4 = new long[a13];
                                                        i26 = i24;
                                                        int[] iArr18 = new int[a13];
                                                        int i93 = v8;
                                                        int i94 = v9;
                                                        int i95 = i22;
                                                        i27 = i25;
                                                        int i96 = 0;
                                                        i28 = 0;
                                                        i29 = 0;
                                                        int i97 = 0;
                                                        j12 = 0;
                                                        long j22 = 0;
                                                        int i98 = v7;
                                                        i30 = 0;
                                                        while (true) {
                                                            if (i30 < a13) {
                                                                str12 = str2;
                                                                i31 = i28;
                                                                break;
                                                            }
                                                            boolean z16 = true;
                                                            while (true) {
                                                                if (i29 != 0) {
                                                                    i38 = a13;
                                                                    i39 = i28;
                                                                    i40 = i27;
                                                                    i41 = i29;
                                                                    break;
                                                                }
                                                                z16 = r0Var.a();
                                                                if (!z16) {
                                                                    i38 = a13;
                                                                    i39 = i28;
                                                                    i40 = i27;
                                                                    i41 = 0;
                                                                    break;
                                                                }
                                                                int i99 = i28;
                                                                long j23 = r0Var.f10937d;
                                                                i29 = r0Var.f10936c;
                                                                j12 = j23;
                                                                i28 = i99;
                                                                i27 = i27;
                                                                a13 = a13;
                                                            }
                                                            if (!z16) {
                                                                String str22 = str2;
                                                                Log.w(str22, "Unexpected end of chunk data");
                                                                jArr3 = Arrays.copyOf(jArr3, i30);
                                                                iArr = Arrays.copyOf(iArr, i30);
                                                                jArr4 = Arrays.copyOf(jArr4, i30);
                                                                iArr18 = Arrays.copyOf(iArr18, i30);
                                                                a13 = i30;
                                                                str12 = str22;
                                                                i31 = i39;
                                                                break;
                                                            }
                                                            String str23 = str2;
                                                            if (dr2Var11 != null) {
                                                                while (true) {
                                                                    if (i97 != 0) {
                                                                        break;
                                                                    }
                                                                    if (i95 <= 0) {
                                                                        i97 = 0;
                                                                        break;
                                                                    }
                                                                    i97 = dr2Var11.v();
                                                                    i39 = dr2Var11.m();
                                                                    i95--;
                                                                }
                                                                i97--;
                                                            }
                                                            int i100 = i39;
                                                            jArr3[i30] = j12;
                                                            long[] jArr25 = jArr3;
                                                            int c14 = v0Var.c();
                                                            iArr[i30] = c14;
                                                            if (c14 > i96) {
                                                                i96 = c14;
                                                            }
                                                            r0 r0Var2 = r0Var;
                                                            jArr4[i30] = j22 + i100;
                                                            iArr18[i30] = dr2Var10 == null ? 1 : 0;
                                                            int i101 = i40;
                                                            if (i30 == i101) {
                                                                iArr18[i30] = 1;
                                                                i26--;
                                                                if (i26 > 0) {
                                                                    Objects.requireNonNull(dr2Var10);
                                                                    i101 = dr2Var10.v() - 1;
                                                                }
                                                            }
                                                            dr2 dr2Var12 = dr2Var10;
                                                            int i102 = i101;
                                                            j22 += i94;
                                                            int i103 = i93 - 1;
                                                            if (i103 != 0) {
                                                                i93 = i103;
                                                            } else if (i98 > 0) {
                                                                i98--;
                                                                i93 = dr2Var9.v();
                                                                i94 = dr2Var9.m();
                                                            } else {
                                                                i93 = 0;
                                                            }
                                                            j12 += iArr[i30];
                                                            i30++;
                                                            r0Var = r0Var2;
                                                            dr2Var10 = dr2Var12;
                                                            i28 = i100;
                                                            i27 = i102;
                                                            jArr3 = jArr25;
                                                            str2 = str23;
                                                            i29 = i41 - 1;
                                                            a13 = i38;
                                                        }
                                                        long j24 = j22 + i31;
                                                        if (dr2Var11 != null) {
                                                            while (i95 > 0) {
                                                                if (dr2Var11.v() != 0) {
                                                                    z10 = false;
                                                                    break;
                                                                }
                                                                dr2Var11.m();
                                                                i95--;
                                                            }
                                                        }
                                                        z10 = true;
                                                        if (i26 == 0) {
                                                            i32 = i26;
                                                            i33 = i93;
                                                            i34 = i29;
                                                            o1Var2 = apply;
                                                            i35 = i97;
                                                        } else if (i93 != 0) {
                                                            i33 = i93;
                                                            i34 = i29;
                                                            o1Var2 = apply;
                                                            i35 = i97;
                                                            i32 = 0;
                                                        } else if (i29 != 0) {
                                                            i34 = i29;
                                                            o1Var2 = apply;
                                                            i35 = i97;
                                                            i32 = 0;
                                                            i33 = 0;
                                                        } else if (i98 == 0) {
                                                            if (i97 != 0) {
                                                                o1Var2 = apply;
                                                                i35 = i97;
                                                                i32 = 0;
                                                                i33 = 0;
                                                                i34 = 0;
                                                            } else if (z10) {
                                                                jArr5 = jArr3;
                                                                i36 = a13;
                                                                o1Var2 = apply;
                                                                j13 = j24;
                                                                iArr2 = iArr18;
                                                                iArr3 = iArr;
                                                                jArr6 = jArr5;
                                                                a13 = i36;
                                                                i37 = i96;
                                                                long Z22 = n13.Z(j13, 1000000L, o1Var2.f9427c);
                                                                jArr7 = o1Var2.f9432h;
                                                                if (jArr7 != null) {
                                                                }
                                                            } else {
                                                                o1Var2 = apply;
                                                                z10 = false;
                                                                i32 = 0;
                                                                i33 = 0;
                                                                i34 = 0;
                                                                i35 = 0;
                                                            }
                                                            i98 = 0;
                                                        } else {
                                                            o1Var2 = apply;
                                                            i35 = i97;
                                                            i32 = 0;
                                                            i33 = 0;
                                                            i34 = 0;
                                                        }
                                                        int i104 = o1Var2.f9425a;
                                                        jArr5 = jArr3;
                                                        String str24 = true == z10 ? ", ctts invalid" : "";
                                                        i36 = a13;
                                                        StringBuilder sb2 = new StringBuilder(str24.length() + 262);
                                                        sb2.append("Inconsistent stbl box for track ");
                                                        sb2.append(i104);
                                                        sb2.append(": remainingSynchronizationSamples ");
                                                        sb2.append(i32);
                                                        sb2.append(", remainingSamplesAtTimestampDelta ");
                                                        sb2.append(i33);
                                                        sb2.append(", remainingSamplesInChunk ");
                                                        sb2.append(i34);
                                                        sb2.append(", remainingTimestampDeltaChanges ");
                                                        sb2.append(i98);
                                                        sb2.append(", remainingSamplesAtTimestampOffset ");
                                                        sb2.append(i35);
                                                        sb2.append(str24);
                                                        Log.w(str12, sb2.toString());
                                                        j13 = j24;
                                                        iArr2 = iArr18;
                                                        iArr3 = iArr;
                                                        jArr6 = jArr5;
                                                        a13 = i36;
                                                        i37 = i96;
                                                        long Z222 = n13.Z(j13, 1000000L, o1Var2.f9427c);
                                                        jArr7 = o1Var2.f9432h;
                                                        if (jArr7 != null) {
                                                        }
                                                    } else {
                                                        i23 = -1;
                                                        dr2Var10 = null;
                                                    }
                                                } else {
                                                    i23 = -1;
                                                    i24 = 0;
                                                }
                                                i25 = -1;
                                                zza = v0Var.zza();
                                                String str212 = apply.f9430f.f3660l;
                                                if (zza != i23) {
                                                    if (i22 == 0) {
                                                    }
                                                    v7 = 0;
                                                }
                                                jArr3 = new long[a13];
                                                iArr = new int[a13];
                                                jArr4 = new long[a13];
                                                i26 = i24;
                                                int[] iArr182 = new int[a13];
                                                int i932 = v8;
                                                int i942 = v9;
                                                int i952 = i22;
                                                i27 = i25;
                                                int i962 = 0;
                                                i28 = 0;
                                                i29 = 0;
                                                int i972 = 0;
                                                j12 = 0;
                                                long j222 = 0;
                                                int i982 = v7;
                                                i30 = 0;
                                                while (true) {
                                                    if (i30 < a13) {
                                                    }
                                                    j12 += iArr[i30];
                                                    i30++;
                                                    r0Var = r0Var2;
                                                    dr2Var10 = dr2Var12;
                                                    i28 = i100;
                                                    i27 = i102;
                                                    jArr3 = jArr25;
                                                    str2 = str23;
                                                    i29 = i41 - 1;
                                                    a13 = i38;
                                                }
                                                long j242 = j222 + i31;
                                                if (dr2Var11 != null) {
                                                }
                                                z10 = true;
                                                if (i26 == 0) {
                                                }
                                                int i1042 = o1Var2.f9425a;
                                                jArr5 = jArr3;
                                                if (true == z10) {
                                                }
                                                i36 = a13;
                                                StringBuilder sb22 = new StringBuilder(str24.length() + 262);
                                                sb22.append("Inconsistent stbl box for track ");
                                                sb22.append(i1042);
                                                sb22.append(": remainingSynchronizationSamples ");
                                                sb22.append(i32);
                                                sb22.append(", remainingSamplesAtTimestampDelta ");
                                                sb22.append(i33);
                                                sb22.append(", remainingSamplesInChunk ");
                                                sb22.append(i34);
                                                sb22.append(", remainingTimestampDeltaChanges ");
                                                sb22.append(i982);
                                                sb22.append(", remainingSamplesAtTimestampOffset ");
                                                sb22.append(i35);
                                                sb22.append(str24);
                                                Log.w(str12, sb22.toString());
                                                j13 = j242;
                                                iArr2 = iArr182;
                                                iArr3 = iArr;
                                                jArr6 = jArr5;
                                                a13 = i36;
                                                i37 = i962;
                                                long Z2222 = n13.Z(j13, 1000000L, o1Var2.f9427c);
                                                jArr7 = o1Var2.f9432h;
                                                if (jArr7 != null) {
                                                }
                                            }
                                            arrayList2 = arrayList;
                                            arrayList2.add(r1Var2);
                                        } else {
                                            arrayList2 = arrayList;
                                        }
                                    }
                                }
                            }
                            jArr = null;
                            jArr2 = null;
                            if (t0Var.f12022b != null) {
                            }
                        } else {
                            m9 = 0;
                            m10 = 65536;
                            m11 = -65536;
                        }
                    }
                    if (m9 != 0) {
                        i52 = m11;
                    } else if (m10 == -65536) {
                        if (m11 != 65536) {
                            i52 = m11;
                        } else if (m12 == 0) {
                            i8 = 270;
                            w0 w0Var22 = new w0(m8, j8, i8);
                            if (j7 == -9223372036854775807L) {
                            }
                            dr2 dr2Var32 = d7.f9963b;
                            dr2Var32.f(8);
                            dr2Var32.g(q0.a(dr2Var32.m()) == 0 ? 8 : 16);
                            long A22 = dr2Var32.A();
                            if (j9 != -9223372036854775807L) {
                            }
                            o0 c92 = c8.c(1835626086);
                            Objects.requireNonNull(c92);
                            o0 c102 = c92.c(1937007212);
                            Objects.requireNonNull(c102);
                            p0 d102 = c8.d(1835296868);
                            Objects.requireNonNull(d102);
                            dr2 dr2Var42 = d102.f9963b;
                            dr2Var42.f(8);
                            int a82 = q0.a(dr2Var42.m());
                            dr2Var42.g(a82 == 0 ? 8 : 16);
                            long A32 = dr2Var42.A();
                            dr2Var42.g(a82 == 0 ? 4 : 8);
                            int w62 = dr2Var42.w();
                            StringBuilder sb3 = new StringBuilder(3);
                            sb3.append((char) (((w62 >> 10) & 31) + 96));
                            sb3.append((char) (((w62 >> 5) & 31) + 96));
                            sb3.append((char) ((w62 & 31) + 96));
                            Pair create22 = Pair.create(Long.valueOf(A32), sb3.toString());
                            p0 d112 = c102.d(1937011556);
                            Objects.requireNonNull(d112);
                            dr2 dr2Var52 = d112.f9963b;
                            i9 = w0Var22.f13653a;
                            i10 = w0Var22.f13655c;
                            String str142 = (String) create22.second;
                            dr2Var52.f(12);
                            m7 = dr2Var52.m();
                            t0 t0Var32 = new t0(m7);
                            i11 = 0;
                            while (i11 < m7) {
                            }
                            int i642 = e7;
                            Pair pair42 = create22;
                            arrayList = arrayList3;
                            w0 w0Var32 = w0Var22;
                            str2 = str13;
                            t0Var = t0Var32;
                            o0Var2 = o0Var5;
                            c7 = o0Var2.c(1701082227);
                            if (c7 != null) {
                            }
                            jArr = null;
                            jArr2 = null;
                            if (t0Var.f12022b != null) {
                            }
                        }
                        m9 = 0;
                        m10 = -65536;
                    } else {
                        i52 = m11;
                        m9 = 0;
                    }
                    i8 = (m9 == -65536 && m10 == 0 && i52 == 0 && m12 == -65536) ? 180 : 0;
                    w0 w0Var222 = new w0(m8, j8, i8);
                    if (j7 == -9223372036854775807L) {
                    }
                    dr2 dr2Var322 = d7.f9963b;
                    dr2Var322.f(8);
                    dr2Var322.g(q0.a(dr2Var322.m()) == 0 ? 8 : 16);
                    long A222 = dr2Var322.A();
                    if (j9 != -9223372036854775807L) {
                    }
                    o0 c922 = c8.c(1835626086);
                    Objects.requireNonNull(c922);
                    o0 c1022 = c922.c(1937007212);
                    Objects.requireNonNull(c1022);
                    p0 d1022 = c8.d(1835296868);
                    Objects.requireNonNull(d1022);
                    dr2 dr2Var422 = d1022.f9963b;
                    dr2Var422.f(8);
                    int a822 = q0.a(dr2Var422.m());
                    dr2Var422.g(a822 == 0 ? 8 : 16);
                    long A322 = dr2Var422.A();
                    dr2Var422.g(a822 == 0 ? 4 : 8);
                    int w622 = dr2Var422.w();
                    StringBuilder sb32 = new StringBuilder(3);
                    sb32.append((char) (((w622 >> 10) & 31) + 96));
                    sb32.append((char) (((w622 >> 5) & 31) + 96));
                    sb32.append((char) ((w622 & 31) + 96));
                    Pair create222 = Pair.create(Long.valueOf(A322), sb32.toString());
                    p0 d1122 = c1022.d(1937011556);
                    Objects.requireNonNull(d1122);
                    dr2 dr2Var522 = d1122.f9963b;
                    i9 = w0Var222.f13653a;
                    i10 = w0Var222.f13655c;
                    String str1422 = (String) create222.second;
                    dr2Var522.f(12);
                    m7 = dr2Var522.m();
                    t0 t0Var322 = new t0(m7);
                    i11 = 0;
                    while (i11 < m7) {
                    }
                    int i6422 = e7;
                    Pair pair422 = create222;
                    arrayList = arrayList3;
                    w0 w0Var322 = w0Var222;
                    str2 = str13;
                    t0Var = t0Var322;
                    o0Var2 = o0Var5;
                    c7 = o0Var2.c(1701082227);
                    if (c7 != null) {
                    }
                    jArr = null;
                    jArr2 = null;
                    if (t0Var.f12022b != null) {
                    }
                }
                o1Var = null;
                apply = e43Var2.apply(o1Var);
                if (apply == null) {
                }
            }
            i49 = i7 + 1;
            u74Var3 = u74Var;
            arrayList3 = arrayList2;
            o0Var4 = o0Var;
        }
        return arrayList3;
    }

    public static void d(dr2 dr2Var) {
        int k7 = dr2Var.k();
        dr2Var.g(4);
        if (dr2Var.m() != 1751411826) {
            k7 += 4;
        }
        dr2Var.f(k7);
    }

    private static int e(int i7) {
        if (i7 == 1936684398) {
            return 1;
        }
        if (i7 == 1986618469) {
            return 2;
        }
        if (i7 == 1952807028 || i7 == 1935832172 || i7 == 1937072756 || i7 == 1668047728) {
            return 3;
        }
        return i7 == 1835365473 ? 5 : -1;
    }

    private static int f(dr2 dr2Var) {
        int s7 = dr2Var.s();
        int i7 = s7 & 127;
        while ((s7 & 128) == 128) {
            s7 = dr2Var.s();
            i7 = (i7 << 7) | (s7 & 127);
        }
        return i7;
    }

    private static int g(dr2 dr2Var) {
        dr2Var.f(16);
        return dr2Var.m();
    }

    private static Pair<String, byte[]> h(dr2 dr2Var, int i7) {
        dr2Var.f(i7 + 12);
        dr2Var.g(1);
        f(dr2Var);
        dr2Var.g(2);
        int s7 = dr2Var.s();
        if ((s7 & 128) != 0) {
            dr2Var.g(2);
        }
        if ((s7 & 64) != 0) {
            dr2Var.g(dr2Var.w());
        }
        if ((s7 & 32) != 0) {
            dr2Var.g(2);
        }
        dr2Var.g(1);
        f(dr2Var);
        String d7 = dy.d(dr2Var.s());
        if ("audio/mpeg".equals(d7) || "audio/vnd.dts".equals(d7) || "audio/vnd.dts.hd".equals(d7)) {
            return Pair.create(d7, null);
        }
        dr2Var.g(12);
        dr2Var.g(1);
        int f7 = f(dr2Var);
        byte[] bArr = new byte[f7];
        dr2Var.b(bArr, 0, f7);
        return Pair.create(d7, bArr);
    }

    private static Pair<Integer, p1> i(dr2 dr2Var, int i7, int i8) {
        Integer num;
        p1 p1Var;
        Pair<Integer, p1> create;
        int i9;
        int i10;
        byte[] bArr;
        int k7 = dr2Var.k();
        while (k7 - i7 < i8) {
            dr2Var.f(k7);
            int m7 = dr2Var.m();
            sc4.b(m7 > 0, "childAtomSize must be positive");
            if (dr2Var.m() == 1936289382) {
                int i11 = k7 + 8;
                int i12 = -1;
                int i13 = 0;
                String str = null;
                Integer num2 = null;
                while (i11 - k7 < m7) {
                    dr2Var.f(i11);
                    int m8 = dr2Var.m();
                    int m9 = dr2Var.m();
                    if (m9 == 1718775137) {
                        num2 = Integer.valueOf(dr2Var.m());
                    } else if (m9 == 1935894637) {
                        dr2Var.g(4);
                        str = dr2Var.F(4, c43.f3729c);
                    } else if (m9 == 1935894633) {
                        i12 = i11;
                        i13 = m8;
                    }
                    i11 += m8;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    sc4.b(num2 != null, "frma atom is mandatory");
                    sc4.b(i12 != -1, "schi atom is mandatory");
                    int i14 = i12 + 8;
                    while (true) {
                        if (i14 - i12 >= i13) {
                            num = num2;
                            p1Var = null;
                            break;
                        }
                        dr2Var.f(i14);
                        int m10 = dr2Var.m();
                        if (dr2Var.m() == 1952804451) {
                            int m11 = dr2Var.m();
                            dr2Var.g(1);
                            if (q0.a(m11) == 0) {
                                dr2Var.g(1);
                                i9 = 0;
                                i10 = 0;
                            } else {
                                int s7 = dr2Var.s();
                                int i15 = (s7 & 240) >> 4;
                                i9 = s7 & 15;
                                i10 = i15;
                            }
                            boolean z6 = dr2Var.s() == 1;
                            int s8 = dr2Var.s();
                            byte[] bArr2 = new byte[16];
                            dr2Var.b(bArr2, 0, 16);
                            if (z6 && s8 == 0) {
                                int s9 = dr2Var.s();
                                byte[] bArr3 = new byte[s9];
                                dr2Var.b(bArr3, 0, s9);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            p1Var = new p1(z6, str, s8, bArr2, i10, i9, bArr);
                        } else {
                            i14 += m10;
                        }
                    }
                    sc4.b(p1Var != null, "tenc atom is mandatory");
                    int i16 = n13.f8865a;
                    create = Pair.create(num, p1Var);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            k7 += m7;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void j(dr2 dr2Var, int i7, int i8, int i9, int i10, String str, boolean z6, u74 u74Var, t0 t0Var, int i11) {
        int i12;
        int t6;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        c0 y6;
        int i18 = i8;
        int i19 = i9;
        u74 u74Var2 = u74Var;
        dr2Var.f(i18 + 16);
        if (z6) {
            i12 = dr2Var.w();
            dr2Var.g(6);
        } else {
            dr2Var.g(8);
            i12 = 0;
        }
        if (i12 == 0 || i12 == 1) {
            int w6 = dr2Var.w();
            dr2Var.g(6);
            t6 = dr2Var.t();
            if (i12 == 1) {
                dr2Var.g(16);
            }
            i13 = w6;
        } else {
            if (i12 != 2) {
                return;
            }
            dr2Var.g(16);
            t6 = (int) Math.round(Double.longBitsToDouble(dr2Var.z()));
            i13 = dr2Var.v();
            dr2Var.g(20);
        }
        int k7 = dr2Var.k();
        int i20 = 1701733217;
        if (i7 == 1701733217) {
            Pair<Integer, p1> i21 = i(dr2Var, i18, i19);
            if (i21 != null) {
                i20 = ((Integer) i21.first).intValue();
                u74Var2 = u74Var2 == null ? null : u74Var2.a(((p1) i21.second).f9984b);
                t0Var.f12021a[i11] = (p1) i21.second;
            }
            dr2Var.f(k7);
        } else {
            i20 = i7;
        }
        String str2 = "audio/raw";
        if (i20 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i20 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i20 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i20 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i20 == 1685353320 || i20 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i20 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i20 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i20 == 1935764850) {
            str2 = "audio/3gpp";
        } else {
            if (i20 != 1935767394) {
                if (i20 == 1819304813 || i20 == 1936684916) {
                    i14 = 2;
                } else if (i20 == 1953984371) {
                    i14 = 268435456;
                } else if (i20 == 778924082 || i20 == 778924083) {
                    str2 = "audio/mpeg";
                } else if (i20 == 1835557169) {
                    str2 = "audio/mha1";
                } else if (i20 == 1835560241) {
                    str2 = "audio/mhm1";
                } else if (i20 == 1634492771) {
                    str2 = "audio/alac";
                } else if (i20 == 1634492791) {
                    str2 = "audio/g711-alaw";
                } else if (i20 == 1970037111) {
                    str2 = "audio/g711-mlaw";
                } else if (i20 == 1332770163) {
                    str2 = "audio/opus";
                } else if (i20 == 1716281667) {
                    str2 = "audio/flac";
                } else {
                    i14 = -1;
                    str2 = null;
                }
                String str3 = str2;
                String str4 = null;
                List list = null;
                while (k7 - i18 < i19) {
                    dr2Var.f(k7);
                    int m7 = dr2Var.m();
                    String str5 = "childAtomSize must be positive";
                    sc4.b(m7 > 0, "childAtomSize must be positive");
                    int m8 = dr2Var.m();
                    if (m8 == 1835557187) {
                        int i22 = m7 - 13;
                        byte[] bArr = new byte[i22];
                        dr2Var.f(k7 + 13);
                        dr2Var.b(bArr, 0, i22);
                        list = e73.x(bArr);
                        i15 = i14;
                    } else {
                        if (m8 == 1702061171) {
                            i15 = i14;
                            i16 = k7;
                            i17 = -1;
                        } else if (z6 && m8 == 2002876005) {
                            i16 = dr2Var.k();
                            while (true) {
                                if (i16 - k7 >= m7) {
                                    i15 = i14;
                                    i17 = -1;
                                    i16 = -1;
                                    break;
                                }
                                dr2Var.f(i16);
                                int m9 = dr2Var.m();
                                i15 = i14;
                                sc4.b(m9 > 0, str5);
                                String str6 = str5;
                                if (dr2Var.m() == 1702061171) {
                                    i17 = -1;
                                    break;
                                } else {
                                    i16 += m9;
                                    i14 = i15;
                                    str5 = str6;
                                }
                            }
                        } else {
                            i15 = i14;
                            if (m8 == 1684103987) {
                                dr2Var.f(k7 + 8);
                                y6 = tb4.b(dr2Var, Integer.toString(i10), str, u74Var2);
                            } else if (m8 == 1684366131) {
                                dr2Var.f(k7 + 8);
                                y6 = tb4.c(dr2Var, Integer.toString(i10), str, u74Var2);
                            } else if (m8 == 1684103988) {
                                dr2Var.f(k7 + 8);
                                String num = Integer.toString(i10);
                                int i23 = wb4.f13789b;
                                dr2Var.g(1);
                                int i24 = 1 != ((dr2Var.s() & 32) >> 5) ? 44100 : 48000;
                                bf4 bf4Var = new bf4();
                                bf4Var.h(num);
                                bf4Var.s("audio/ac4");
                                bf4Var.e0(2);
                                bf4Var.t(i24);
                                bf4Var.b(u74Var2);
                                bf4Var.k(str);
                                y6 = bf4Var.y();
                            } else if (m8 == 1684305011) {
                                bf4 bf4Var2 = new bf4();
                                bf4Var2.g(i10);
                                bf4Var2.s(str3);
                                bf4Var2.e0(i13);
                                bf4Var2.t(t6);
                                bf4Var2.b(u74Var2);
                                bf4Var2.k(str);
                                y6 = bf4Var2.y();
                            } else if (m8 == 1682927731) {
                                int i25 = m7 - 8;
                                byte[] bArr2 = f13978a;
                                byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length + i25);
                                dr2Var.f(k7 + 8);
                                dr2Var.b(copyOf, bArr2.length, i25);
                                list = ld4.a(copyOf);
                            } else {
                                if (m8 == 1684425825) {
                                    int i26 = m7 - 12;
                                    byte[] bArr3 = new byte[i26 + 4];
                                    bArr3[0] = 102;
                                    bArr3[1] = 76;
                                    bArr3[2] = 97;
                                    bArr3[3] = 67;
                                    dr2Var.f(k7 + 12);
                                    dr2Var.b(bArr3, 4, i26);
                                    list = e73.x(bArr3);
                                } else if (m8 == 1634492771) {
                                    int i27 = m7 - 12;
                                    byte[] bArr4 = new byte[i27];
                                    dr2Var.f(k7 + 12);
                                    dr2Var.b(bArr4, 0, i27);
                                    dr2 dr2Var2 = new dr2(bArr4);
                                    dr2Var2.f(9);
                                    int s7 = dr2Var2.s();
                                    dr2Var2.f(20);
                                    Pair create = Pair.create(Integer.valueOf(dr2Var2.v()), Integer.valueOf(s7));
                                    int intValue = ((Integer) create.first).intValue();
                                    int intValue2 = ((Integer) create.second).intValue();
                                    list = e73.x(bArr4);
                                    t6 = intValue;
                                    i13 = intValue2;
                                    k7 += m7;
                                    i18 = i8;
                                    i19 = i9;
                                    i14 = i15;
                                }
                                k7 += m7;
                                i18 = i8;
                                i19 = i9;
                                i14 = i15;
                            }
                            t0Var.f12022b = y6;
                        }
                        if (i16 != i17) {
                            Pair<String, byte[]> h7 = h(dr2Var, i16);
                            str3 = (String) h7.first;
                            byte[] bArr5 = (byte[]) h7.second;
                            if (bArr5 != null) {
                                if ("audio/mp4a-latm".equals(str3)) {
                                    pb4 a7 = qb4.a(bArr5);
                                    t6 = a7.f10169a;
                                    i13 = a7.f10170b;
                                    str4 = a7.f10171c;
                                }
                                list = e73.x(bArr5);
                            }
                        }
                        k7 += m7;
                        i18 = i8;
                        i19 = i9;
                        i14 = i15;
                    }
                    k7 += m7;
                    i18 = i8;
                    i19 = i9;
                    i14 = i15;
                }
                int i28 = i14;
                if (t0Var.f12022b == null || str3 == null) {
                }
                bf4 bf4Var3 = new bf4();
                bf4Var3.g(i10);
                bf4Var3.s(str3);
                bf4Var3.f0(str4);
                bf4Var3.e0(i13);
                bf4Var3.t(t6);
                bf4Var3.n(i28);
                bf4Var3.i(list);
                bf4Var3.b(u74Var2);
                bf4Var3.k(str);
                t0Var.f12022b = bf4Var3.y();
                return;
            }
            str2 = "audio/amr-wb";
        }
        i14 = -1;
        String str32 = str2;
        String str42 = null;
        List list2 = null;
        while (k7 - i18 < i19) {
        }
        int i282 = i14;
        if (t0Var.f12022b == null) {
        }
    }
}
