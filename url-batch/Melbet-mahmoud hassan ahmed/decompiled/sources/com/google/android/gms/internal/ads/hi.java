package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class hi {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6272a = zm.g("vide");

    /* renamed from: b, reason: collision with root package name */
    private static final int f6273b = zm.g("soun");

    /* renamed from: c, reason: collision with root package name */
    private static final int f6274c = zm.g("text");

    /* renamed from: d, reason: collision with root package name */
    private static final int f6275d = zm.g("sbtl");

    /* renamed from: e, reason: collision with root package name */
    private static final int f6276e = zm.g("subt");

    /* renamed from: f, reason: collision with root package name */
    private static final int f6277f = zm.g("clcp");

    /* renamed from: g, reason: collision with root package name */
    private static final int f6278g = zm.g("cenc");

    /* renamed from: h, reason: collision with root package name */
    private static final int f6279h = zm.g("meta");

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r8 == 0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0835 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static si a(yh yhVar, zh zhVar, long j7, yg ygVar, boolean z6) {
        long j8;
        int i7;
        zh zhVar2;
        long j9;
        int i8;
        int i9;
        int e7;
        int i10;
        di diVar;
        yh d7;
        si siVar;
        Pair create;
        int i11;
        zh e8;
        di diVar2;
        int i12;
        String str;
        int i13;
        Pair pair;
        gi giVar;
        int i14;
        rm rmVar;
        int i15;
        int i16;
        int i17;
        boolean z7;
        byte[] bArr;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        rm rmVar2;
        int i23;
        int i24;
        String str2;
        di diVar3;
        int c7;
        String str3;
        int i25;
        String str4;
        xe c8;
        String str5;
        List list;
        long j10;
        yg ygVar2 = ygVar;
        yh d8 = yhVar.d(ai.F);
        rm rmVar3 = d8.e(ai.T).P0;
        rmVar3.v(16);
        int e9 = rmVar3.e();
        int i26 = -1;
        int i27 = e9 == f6273b ? 1 : e9 == f6272a ? 2 : (e9 == f6274c || e9 == f6275d || e9 == f6276e || e9 == f6277f) ? 3 : e9 == f6279h ? 4 : -1;
        if (i27 == -1) {
            return null;
        }
        rm rmVar4 = yhVar.e(ai.P).P0;
        rmVar4.v(8);
        int b7 = ai.b(rmVar4.e());
        rmVar4.w(b7 == 0 ? 8 : 16);
        int e10 = rmVar4.e();
        rmVar4.w(4);
        int c9 = rmVar4.c();
        int i28 = b7 == 0 ? 4 : 8;
        int i29 = 0;
        while (true) {
            if (i29 >= i28) {
                rmVar4.w(i28);
                break;
            }
            if (rmVar4.f11225a[c9 + i29] != -1) {
                j8 = b7 == 0 ? rmVar4.m() : rmVar4.n();
            } else {
                i29++;
            }
        }
        j8 = -9223372036854775807L;
        rmVar4.w(16);
        int e11 = rmVar4.e();
        int e12 = rmVar4.e();
        rmVar4.w(4);
        int e13 = rmVar4.e();
        int e14 = rmVar4.e();
        int i30 = 65536;
        if (e11 == 0) {
            if (e12 != 65536) {
                e11 = 0;
            } else if (e13 != -65536) {
                e11 = 0;
                e12 = 65536;
            } else {
                if (e14 == 0) {
                    i7 = 90;
                    gi giVar2 = new gi(e10, j8, i7);
                    if (j7 == -9223372036854775807L) {
                        j10 = giVar2.f5649b;
                        j9 = j10;
                        zhVar2 = zhVar;
                    } else {
                        zhVar2 = zhVar;
                        j9 = j7;
                    }
                    rm rmVar5 = zhVar2.P0;
                    rmVar5.v(8);
                    rmVar5.w(ai.b(rmVar5.e()) == 0 ? 8 : 16);
                    long m7 = rmVar5.m();
                    long j11 = j9 == -9223372036854775807L ? -9223372036854775807L : zm.j(j9, 1000000L, m7);
                    yh d9 = d8.d(ai.G).d(ai.H);
                    rm rmVar6 = d8.e(ai.S).P0;
                    rmVar6.v(8);
                    int b8 = ai.b(rmVar6.e());
                    rmVar6.w(b8 == 0 ? 8 : 16);
                    long m8 = rmVar6.m();
                    rmVar6.w(b8 == 0 ? 4 : 8);
                    int j12 = rmVar6.j();
                    StringBuilder sb = new StringBuilder(3);
                    sb.append((char) (((j12 >> 10) & 31) + 96));
                    sb.append((char) (((j12 >> 5) & 31) + 96));
                    sb.append((char) ((j12 & 31) + 96));
                    Pair create2 = Pair.create(Long.valueOf(m8), sb.toString());
                    rm rmVar7 = d9.e(ai.U).P0;
                    i8 = giVar2.f5648a;
                    i9 = giVar2.f5650c;
                    String str6 = (String) create2.second;
                    rmVar7.v(12);
                    e7 = rmVar7.e();
                    di diVar4 = new di(e7);
                    i10 = 0;
                    while (i10 < e7) {
                        int c10 = rmVar7.c();
                        int e15 = rmVar7.e();
                        jm.d(e15 > 0, "childAtomSize should be positive");
                        int e16 = rmVar7.e();
                        if (e16 == ai.f2777c || e16 == ai.f2779d || e16 == ai.f2774a0 || e16 == ai.f2796l0 || e16 == ai.f2781e || e16 == ai.f2783f || e16 == ai.f2785g || e16 == ai.K0 || e16 == ai.L0) {
                            int i31 = i10;
                            diVar2 = diVar4;
                            i12 = e7;
                            str = str6;
                            rm rmVar8 = rmVar7;
                            i13 = i27;
                            pair = create2;
                            giVar = giVar2;
                            rmVar8.v(c10 + 16);
                            rmVar8.w(16);
                            int j13 = rmVar8.j();
                            int j14 = rmVar8.j();
                            rmVar8.w(50);
                            int c11 = rmVar8.c();
                            int i32 = e15;
                            if (e16 == ai.f2774a0) {
                                e16 = e(rmVar8, c10, i32, diVar2, i31);
                                rmVar8.v(c11);
                            }
                            String str7 = null;
                            boolean z8 = false;
                            List<byte[]> list2 = null;
                            float f7 = 1.0f;
                            byte[] bArr2 = null;
                            int i33 = -1;
                            while (c11 - c10 < i32) {
                                rmVar8.v(c11);
                                int c12 = rmVar8.c();
                                int e17 = rmVar8.e();
                                if (e17 == 0) {
                                    if (rmVar8.c() - c10 == i32) {
                                        break;
                                    }
                                    e17 = 0;
                                }
                                jm.d(e17 > 0, "childAtomSize should be positive");
                                int e18 = rmVar8.e();
                                int i34 = i32;
                                if (e18 == ai.I) {
                                    jm.e(str7 == null);
                                    rmVar8.v(c12 + 8);
                                    an a7 = an.a(rmVar8);
                                    list2 = a7.f2869a;
                                    diVar2.f4228c = a7.f2870b;
                                    if (!z8) {
                                        f7 = a7.f2871c;
                                    }
                                    str7 = "video/avc";
                                } else if (e18 == ai.J) {
                                    jm.e(str7 == null);
                                    rmVar8.v(c12 + 8);
                                    gn a8 = gn.a(rmVar8);
                                    list2 = a8.f5689a;
                                    diVar2.f4228c = a8.f5690b;
                                    str7 = "video/hevc";
                                } else if (e18 == ai.M0) {
                                    jm.e(str7 == null);
                                    str7 = e16 == ai.K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                } else if (e18 == ai.f2787h) {
                                    jm.e(str7 == null);
                                    str7 = "video/3gpp";
                                } else {
                                    if (e18 == ai.K) {
                                        jm.e(str7 == null);
                                        Pair<String, byte[]> f8 = f(rmVar8, c12);
                                        String str8 = (String) f8.first;
                                        list2 = Collections.singletonList((byte[]) f8.second);
                                        i17 = e16;
                                        str7 = str8;
                                    } else if (e18 == ai.f2792j0) {
                                        rmVar8.v(c12 + 8);
                                        f7 = rmVar8.i() / rmVar8.i();
                                        i17 = e16;
                                        z8 = true;
                                    } else if (e18 == ai.I0) {
                                        int i35 = c12 + 8;
                                        while (true) {
                                            if (i35 - c12 >= e17) {
                                                i17 = e16;
                                                z7 = z8;
                                                bArr = null;
                                                break;
                                            }
                                            rmVar8.v(i35);
                                            int e19 = rmVar8.e();
                                            i17 = e16;
                                            z7 = z8;
                                            if (rmVar8.e() == ai.J0) {
                                                bArr = Arrays.copyOfRange(rmVar8.f11225a, i35, e19 + i35);
                                                break;
                                            }
                                            i35 += e19;
                                            z8 = z7;
                                            e16 = i17;
                                        }
                                        z8 = z7;
                                        bArr2 = bArr;
                                    } else {
                                        i17 = e16;
                                        boolean z9 = z8;
                                        if (e18 == ai.H0) {
                                            int g7 = rmVar8.g();
                                            rmVar8.w(3);
                                            if (g7 == 0) {
                                                int g8 = rmVar8.g();
                                                if (g8 == 0) {
                                                    z8 = z9;
                                                    i33 = 0;
                                                } else if (g8 == 1) {
                                                    z8 = z9;
                                                    i33 = 1;
                                                } else if (g8 == 2) {
                                                    z8 = z9;
                                                    i33 = 2;
                                                } else if (g8 == 3) {
                                                    z8 = z9;
                                                    i33 = 3;
                                                }
                                                c11 += e17;
                                                e16 = i17;
                                                i32 = i34;
                                            }
                                        }
                                        z8 = z9;
                                        c11 += e17;
                                        e16 = i17;
                                        i32 = i34;
                                    }
                                    c11 += e17;
                                    e16 = i17;
                                    i32 = i34;
                                }
                                i17 = e16;
                                c11 += e17;
                                e16 = i17;
                                i32 = i34;
                            }
                            int i36 = i32;
                            if (str7 != null) {
                                i16 = i36;
                                i14 = i31;
                                rmVar = rmVar8;
                                i15 = c10;
                                diVar2.f4227b = xe.p(Integer.toString(i8), str7, null, -1, -1, j13, j14, -1.0f, list2, i9, f7, bArr2, i33, null, ygVar);
                            } else {
                                i14 = i31;
                                rmVar = rmVar8;
                                i15 = c10;
                                i16 = i36;
                            }
                        } else if (e16 == ai.f2791j || e16 == ai.f2776b0 || e16 == ai.f2801o || e16 == ai.f2805q || e16 == ai.f2809s || e16 == ai.f2815v || e16 == ai.f2811t || e16 == ai.f2813u || e16 == ai.f2822y0 || e16 == ai.f2824z0 || e16 == ai.f2797m || e16 == ai.f2799n || e16 == ai.f2793k || e16 == ai.O0) {
                            int i37 = i10;
                            di diVar5 = diVar4;
                            i12 = e7;
                            String str9 = str6;
                            rm rmVar9 = rmVar7;
                            i13 = i27;
                            Pair pair2 = create2;
                            int i38 = e15;
                            int i39 = c10;
                            rm rmVar10 = rmVar9;
                            rmVar10.v(i39 + 16);
                            if (z6) {
                                i18 = rmVar10.j();
                                rmVar10.w(6);
                            } else {
                                rmVar10.w(8);
                                i18 = 0;
                            }
                            if (i18 == 0 || i18 == 1) {
                                int j15 = rmVar10.j();
                                rmVar10.w(6);
                                int h7 = rmVar10.h();
                                if (i18 == 1) {
                                    rmVar10.w(16);
                                }
                                i19 = h7;
                                i20 = j15;
                            } else if (i18 == 2) {
                                rmVar10.w(16);
                                i19 = (int) Math.round(Double.longBitsToDouble(rmVar10.l()));
                                i20 = rmVar10.i();
                                rmVar10.w(20);
                            } else {
                                pair = pair2;
                                rmVar = rmVar10;
                                i15 = i39;
                                diVar2 = diVar5;
                                i16 = i38;
                                giVar = giVar2;
                                i14 = i37;
                                str = str9;
                            }
                            int c13 = rmVar10.c();
                            if (e16 == ai.f2776b0) {
                                i21 = i37;
                                e16 = e(rmVar10, i39, i38, diVar5, i21);
                                rmVar10.v(c13);
                            } else {
                                i21 = i37;
                            }
                            String str10 = e16 == ai.f2801o ? "audio/ac3" : e16 == ai.f2805q ? "audio/eac3" : e16 == ai.f2809s ? "audio/vnd.dts" : (e16 == ai.f2811t || e16 == ai.f2813u) ? "audio/vnd.dts.hd" : e16 == ai.f2815v ? "audio/vnd.dts.hd;profile=lbr" : e16 == ai.f2822y0 ? "audio/3gpp" : e16 == ai.f2824z0 ? "audio/amr-wb" : (e16 == ai.f2797m || e16 == ai.f2799n) ? "audio/raw" : e16 == ai.f2793k ? "audio/mpeg" : e16 == ai.O0 ? "audio/alac" : null;
                            int i40 = i20;
                            int i41 = i19;
                            byte[] bArr3 = null;
                            while (c13 - i39 < i38) {
                                rmVar10.v(c13);
                                int e20 = rmVar10.e();
                                jm.d(e20 > 0, "childAtomSize should be positive");
                                int e21 = rmVar10.e();
                                int i42 = ai.K;
                                if (e21 == i42 || (z6 && e21 == ai.f2795l)) {
                                    i22 = i21;
                                    String str11 = str10;
                                    rmVar2 = rmVar10;
                                    i23 = i39;
                                    i24 = i38;
                                    str2 = str9;
                                    diVar3 = diVar5;
                                    if (e21 != i42) {
                                        c7 = rmVar2.c();
                                        while (true) {
                                            if (c7 - c13 >= e20) {
                                                c7 = -1;
                                                break;
                                            }
                                            rmVar2.v(c7);
                                            int e22 = rmVar2.e();
                                            jm.d(e22 > 0, "childAtomSize should be positive");
                                            if (rmVar2.e() == ai.K) {
                                                break;
                                            }
                                            c7 += e22;
                                        }
                                    } else {
                                        c7 = c13;
                                    }
                                    if (c7 != -1) {
                                        Pair<String, byte[]> f9 = f(rmVar2, c7);
                                        String str12 = (String) f9.first;
                                        bArr3 = (byte[]) f9.second;
                                        if ("audio/mp4a-latm".equals(str12)) {
                                            Pair<Integer, Integer> a9 = km.a(bArr3);
                                            int intValue = ((Integer) a9.first).intValue();
                                            i40 = ((Integer) a9.second).intValue();
                                            str10 = str12;
                                            i41 = intValue;
                                        } else {
                                            str10 = str12;
                                        }
                                    } else {
                                        str10 = str11;
                                    }
                                } else {
                                    if (e21 == ai.f2803p) {
                                        rmVar10.v(c13 + 8);
                                        str3 = str9;
                                        c8 = jf.b(rmVar10, Integer.toString(i8), str3, ygVar2);
                                    } else {
                                        str3 = str9;
                                        if (e21 == ai.f2807r) {
                                            rmVar10.v(c13 + 8);
                                            c8 = jf.c(rmVar10, Integer.toString(i8), str3, ygVar2);
                                        } else {
                                            if (e21 == ai.f2817w) {
                                                i25 = c13;
                                                i22 = i21;
                                                str4 = str10;
                                                str2 = str3;
                                                rmVar2 = rmVar10;
                                                i23 = i39;
                                                i24 = i38;
                                                diVar3 = diVar5;
                                                diVar3.f4227b = xe.k(Integer.toString(i8), str10, null, -1, -1, i40, i41, null, ygVar, 0, str2);
                                                e20 = e20;
                                            } else {
                                                i25 = c13;
                                                i22 = i21;
                                                str4 = str10;
                                                str2 = str3;
                                                rmVar2 = rmVar10;
                                                i23 = i39;
                                                i24 = i38;
                                                diVar3 = diVar5;
                                                if (e21 == ai.O0) {
                                                    byte[] bArr4 = new byte[e20];
                                                    c13 = i25;
                                                    rmVar2.v(c13);
                                                    rmVar2.q(bArr4, 0, e20);
                                                    bArr3 = bArr4;
                                                    str10 = str4;
                                                }
                                            }
                                            c13 = i25;
                                            str10 = str4;
                                        }
                                    }
                                    diVar5.f4227b = c8;
                                    i22 = i21;
                                    str4 = str10;
                                    str2 = str3;
                                    rmVar2 = rmVar10;
                                    i23 = i39;
                                    i24 = i38;
                                    diVar3 = diVar5;
                                    str10 = str4;
                                }
                                c13 += e20;
                                diVar5 = diVar3;
                                rmVar10 = rmVar2;
                                str9 = str2;
                                i38 = i24;
                                i21 = i22;
                                i39 = i23;
                                ygVar2 = ygVar;
                            }
                            int i43 = i21;
                            String str13 = str10;
                            rm rmVar11 = rmVar10;
                            int i44 = i39;
                            i16 = i38;
                            str = str9;
                            di diVar6 = diVar5;
                            if (diVar6.f4227b != null || str13 == null) {
                                pair = pair2;
                                diVar2 = diVar6;
                                giVar = giVar2;
                                rmVar = rmVar11;
                                i14 = i43;
                                i15 = i44;
                            } else {
                                pair = pair2;
                                diVar2 = diVar6;
                                giVar = giVar2;
                                diVar2.f4227b = xe.l(Integer.toString(i8), str13, null, -1, -1, i40, i41, true != "audio/raw".equals(str13) ? -1 : 2, -1, -1, bArr3 == null ? null : Collections.singletonList(bArr3), ygVar, 0, str, null);
                                i14 = i43;
                                i15 = i44;
                                rmVar = rmVar11;
                            }
                        } else {
                            int i45 = ai.f2794k0;
                            if (e16 == i45 || e16 == ai.f2814u0 || e16 == ai.f2816v0 || e16 == ai.f2818w0 || e16 == ai.f2820x0) {
                                rmVar7.v(c10 + 16);
                                long j16 = Long.MAX_VALUE;
                                if (e16 == i45) {
                                    str5 = "application/ttml+xml";
                                    list = null;
                                } else if (e16 == ai.f2814u0) {
                                    int i46 = e15 - 16;
                                    byte[] bArr5 = new byte[i46];
                                    rmVar7.q(bArr5, 0, i46);
                                    List singletonList = Collections.singletonList(bArr5);
                                    str5 = "application/x-quicktime-tx3g";
                                    list = singletonList;
                                } else {
                                    if (e16 == ai.f2816v0) {
                                        str5 = "application/x-mp4-vtt";
                                        list = null;
                                    } else if (e16 == ai.f2818w0) {
                                        str5 = "application/ttml+xml";
                                        list = null;
                                        j16 = 0;
                                    } else {
                                        if (e16 != ai.f2820x0) {
                                            throw new IllegalStateException();
                                        }
                                        diVar4.f4229d = 1;
                                        str5 = "application/x-mp4-cea-608";
                                        list = null;
                                        di diVar7 = diVar4;
                                        i12 = e7;
                                        i13 = i27;
                                        diVar7.f4227b = xe.o(Integer.toString(i8), str5, null, -1, 0, str6, -1, ygVar, j16, list);
                                        pair = create2;
                                        diVar2 = diVar7;
                                        i16 = e15;
                                        giVar = giVar2;
                                        i14 = i10;
                                        i15 = c10;
                                        str = str6;
                                        rmVar = rmVar7;
                                    }
                                    di diVar72 = diVar4;
                                    i12 = e7;
                                    i13 = i27;
                                    diVar72.f4227b = xe.o(Integer.toString(i8), str5, null, -1, 0, str6, -1, ygVar, j16, list);
                                    pair = create2;
                                    diVar2 = diVar72;
                                    i16 = e15;
                                    giVar = giVar2;
                                    i14 = i10;
                                    i15 = c10;
                                    str = str6;
                                    rmVar = rmVar7;
                                }
                                di diVar722 = diVar4;
                                i12 = e7;
                                i13 = i27;
                                diVar722.f4227b = xe.o(Integer.toString(i8), str5, null, -1, 0, str6, -1, ygVar, j16, list);
                                pair = create2;
                                diVar2 = diVar722;
                                i16 = e15;
                                giVar = giVar2;
                                i14 = i10;
                                i15 = c10;
                                str = str6;
                                rmVar = rmVar7;
                            } else {
                                if (e16 == ai.N0) {
                                    diVar4.f4227b = xe.n(Integer.toString(i8), "application/x-camera-motion", null, i26, ygVar2);
                                }
                                i16 = e15;
                                i15 = c10;
                                i14 = i10;
                                diVar2 = diVar4;
                                i12 = e7;
                                str = str6;
                                rmVar = rmVar7;
                                i13 = i27;
                                pair = create2;
                                giVar = giVar2;
                            }
                        }
                        rm rmVar12 = rmVar;
                        rmVar12.v(i15 + i16);
                        i10 = i14 + 1;
                        ygVar2 = ygVar;
                        diVar4 = diVar2;
                        rmVar7 = rmVar12;
                        giVar2 = giVar;
                        i27 = i13;
                        e7 = i12;
                        str6 = str;
                        create2 = pair;
                        i26 = -1;
                    }
                    diVar = diVar4;
                    int i47 = i27;
                    Pair pair3 = create2;
                    gi giVar3 = giVar2;
                    d7 = yhVar.d(ai.Q);
                    if (d7 != null || (e8 = d7.e(ai.R)) == null) {
                        siVar = null;
                        create = Pair.create(null, null);
                    } else {
                        rm rmVar13 = e8.P0;
                        rmVar13.v(8);
                        int b9 = ai.b(rmVar13.e());
                        int i48 = rmVar13.i();
                        long[] jArr = new long[i48];
                        long[] jArr2 = new long[i48];
                        for (int i49 = 0; i49 < i48; i49++) {
                            jArr[i49] = b9 == 1 ? rmVar13.n() : rmVar13.m();
                            jArr2[i49] = b9 == 1 ? rmVar13.l() : rmVar13.e();
                            if (rmVar13.p() != 1) {
                                throw new IllegalArgumentException("Unsupported media rate.");
                            }
                            rmVar13.w(2);
                        }
                        create = Pair.create(jArr, jArr2);
                        siVar = null;
                    }
                    if (diVar.f4227b == null) {
                        return siVar;
                    }
                    i11 = giVar3.f5648a;
                    return new si(i11, i47, ((Long) pair3.first).longValue(), m7, j11, diVar.f4227b, diVar.f4229d, diVar.f4226a, diVar.f4228c, (long[]) create.first, (long[]) create.second);
                }
                e11 = 0;
                e12 = 65536;
                e13 = -65536;
            }
        }
        if (e11 != 0) {
            i30 = e13;
        } else if (e12 == -65536) {
            if (e13 != 65536) {
                i30 = e13;
            } else if (e14 == 0) {
                i7 = 270;
                gi giVar22 = new gi(e10, j8, i7);
                if (j7 == -9223372036854775807L) {
                }
                rm rmVar52 = zhVar2.P0;
                rmVar52.v(8);
                rmVar52.w(ai.b(rmVar52.e()) == 0 ? 8 : 16);
                long m72 = rmVar52.m();
                if (j9 == -9223372036854775807L) {
                }
                yh d92 = d8.d(ai.G).d(ai.H);
                rm rmVar62 = d8.e(ai.S).P0;
                rmVar62.v(8);
                int b82 = ai.b(rmVar62.e());
                rmVar62.w(b82 == 0 ? 8 : 16);
                long m82 = rmVar62.m();
                rmVar62.w(b82 == 0 ? 4 : 8);
                int j122 = rmVar62.j();
                StringBuilder sb2 = new StringBuilder(3);
                sb2.append((char) (((j122 >> 10) & 31) + 96));
                sb2.append((char) (((j122 >> 5) & 31) + 96));
                sb2.append((char) ((j122 & 31) + 96));
                Pair create22 = Pair.create(Long.valueOf(m82), sb2.toString());
                rm rmVar72 = d92.e(ai.U).P0;
                i8 = giVar22.f5648a;
                i9 = giVar22.f5650c;
                String str62 = (String) create22.second;
                rmVar72.v(12);
                e7 = rmVar72.e();
                di diVar42 = new di(e7);
                i10 = 0;
                while (i10 < e7) {
                }
                diVar = diVar42;
                int i472 = i27;
                Pair pair32 = create22;
                gi giVar32 = giVar22;
                d7 = yhVar.d(ai.Q);
                if (d7 != null) {
                }
                siVar = null;
                create = Pair.create(null, null);
                if (diVar.f4227b == null) {
                }
            }
            e11 = 0;
            e12 = -65536;
        } else {
            i30 = e13;
            e11 = 0;
        }
        i7 = (e11 == -65536 && e12 == 0 && i30 == 0 && e14 == -65536) ? 180 : 0;
        gi giVar222 = new gi(e10, j8, i7);
        if (j7 == -9223372036854775807L) {
        }
        rm rmVar522 = zhVar2.P0;
        rmVar522.v(8);
        rmVar522.w(ai.b(rmVar522.e()) == 0 ? 8 : 16);
        long m722 = rmVar522.m();
        if (j9 == -9223372036854775807L) {
        }
        yh d922 = d8.d(ai.G).d(ai.H);
        rm rmVar622 = d8.e(ai.S).P0;
        rmVar622.v(8);
        int b822 = ai.b(rmVar622.e());
        rmVar622.w(b822 == 0 ? 8 : 16);
        long m822 = rmVar622.m();
        rmVar622.w(b822 == 0 ? 4 : 8);
        int j1222 = rmVar622.j();
        StringBuilder sb22 = new StringBuilder(3);
        sb22.append((char) (((j1222 >> 10) & 31) + 96));
        sb22.append((char) (((j1222 >> 5) & 31) + 96));
        sb22.append((char) ((j1222 & 31) + 96));
        Pair create222 = Pair.create(Long.valueOf(m822), sb22.toString());
        rm rmVar722 = d922.e(ai.U).P0;
        i8 = giVar222.f5648a;
        i9 = giVar222.f5650c;
        String str622 = (String) create222.second;
        rmVar722.v(12);
        e7 = rmVar722.e();
        di diVar422 = new di(e7);
        i10 = 0;
        while (i10 < e7) {
        }
        diVar = diVar422;
        int i4722 = i27;
        Pair pair322 = create222;
        gi giVar322 = giVar222;
        d7 = yhVar.d(ai.Q);
        if (d7 != null) {
        }
        siVar = null;
        create = Pair.create(null, null);
        if (diVar.f4227b == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0174 A[ADDED_TO_REGION, LOOP:10: B:170:0x0174->B:171:0x0176, LOOP_START, PHI: r14 r15 r22 r25
      0x0174: PHI (r14v3 int) = (r14v1 int), (r14v10 int) binds: [B:169:0x0172, B:171:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r15v3 int) = (r15v1 int), (r15v9 int) binds: [B:169:0x0172, B:171:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r22v2 int) = (r22v1 int), (r22v5 int) binds: [B:169:0x0172, B:171:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:169:0x0172, B:171:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wi b(si siVar, yh yhVar, gh ghVar) {
        ci fiVar;
        boolean z6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j7;
        int i11;
        si siVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr2;
        ci ciVar;
        long[] jArr3;
        int i17;
        int i18;
        int[] iArr3;
        long[] jArr4;
        boolean z7;
        int[] iArr4;
        int i19;
        int[] iArr5;
        long[] jArr5;
        int length;
        zh e7 = yhVar.e(ai.f2806q0);
        if (e7 != null) {
            fiVar = new ei(e7);
        } else {
            zh e8 = yhVar.e(ai.f2808r0);
            if (e8 == null) {
                throw new af("Track has no sample table size information");
            }
            fiVar = new fi(e8);
        }
        int zza = fiVar.zza();
        if (zza == 0) {
            return new wi(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zh e9 = yhVar.e(ai.f2810s0);
        if (e9 == null) {
            e9 = yhVar.e(ai.f2812t0);
            z6 = true;
        } else {
            z6 = false;
        }
        rm rmVar = e9.P0;
        rm rmVar2 = yhVar.e(ai.f2804p0).P0;
        rm rmVar3 = yhVar.e(ai.f2798m0).P0;
        zh e10 = yhVar.e(ai.f2800n0);
        rm rmVar4 = e10 != null ? e10.P0 : null;
        zh e11 = yhVar.e(ai.f2802o0);
        rm rmVar5 = e11 != null ? e11.P0 : null;
        bi biVar = new bi(rmVar2, rmVar, z6);
        rmVar3.v(12);
        int i20 = rmVar3.i() - 1;
        int i21 = rmVar3.i();
        int i22 = rmVar3.i();
        if (rmVar5 != null) {
            rmVar5.v(12);
            i7 = rmVar5.i();
        } else {
            i7 = 0;
        }
        if (rmVar4 != null) {
            rmVar4.v(12);
            i8 = rmVar4.i();
            if (i8 > 0) {
                i9 = rmVar4.i() - 1;
                if (fiVar.c() && "audio/raw".equals(siVar.f11833f.f14165k) && i20 == 0) {
                    if (i7 != 0 && i8 == 0) {
                        int i23 = biVar.f3431a;
                        long[] jArr6 = new long[i23];
                        int[] iArr6 = new int[i23];
                        while (biVar.a()) {
                            int i24 = biVar.f3432b;
                            jArr6[i24] = biVar.f3434d;
                            iArr6[i24] = biVar.f3433c;
                        }
                        int a7 = fiVar.a();
                        long j8 = i22;
                        int i25 = 8192 / a7;
                        int i26 = 0;
                        for (int i27 = 0; i27 < i23; i27++) {
                            i26 += zm.d(iArr6[i27], i25);
                        }
                        jArr2 = new long[i26];
                        int[] iArr7 = new int[i26];
                        jArr = new long[i26];
                        int[] iArr8 = new int[i26];
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 0;
                        int i31 = 0;
                        while (i28 < i23) {
                            int i32 = iArr6[i28];
                            long j9 = jArr6[i28];
                            int i33 = i29;
                            int i34 = i30;
                            int i35 = i23;
                            int i36 = i34;
                            long[] jArr7 = jArr6;
                            int i37 = i32;
                            while (i37 > 0) {
                                int min = Math.min(i25, i37);
                                jArr2[i31] = j9;
                                int[] iArr9 = iArr6;
                                int i38 = a7 * min;
                                iArr7[i31] = i38;
                                int max = Math.max(i33, i38);
                                jArr[i31] = i36 * j8;
                                iArr8[i31] = 1;
                                j9 += iArr7[i31];
                                i36 += min;
                                i37 -= min;
                                i31++;
                                iArr6 = iArr9;
                                i33 = max;
                            }
                            i28++;
                            i29 = i33;
                            jArr6 = jArr7;
                            i30 = i36;
                            i23 = i35;
                        }
                        siVar2 = siVar;
                        iArr2 = iArr8;
                        iArr = iArr7;
                        i16 = i29;
                        j7 = 0;
                        if (siVar2.f11836i != null || ghVar.a()) {
                            zm.n(jArr, 1000000L, siVar2.f11830c);
                            return new wi(jArr2, iArr, i16, jArr, iArr2);
                        }
                        long[] jArr8 = siVar2.f11836i;
                        if (jArr8.length == 1 && siVar2.f11829b == 1 && (length = jArr.length) >= 2) {
                            long j10 = siVar2.f11837j[0];
                            long j11 = j10 + zm.j(jArr8[0], siVar2.f11830c, siVar2.f11831d);
                            long j12 = jArr[0];
                            if (j12 <= j10 && j10 < jArr[1] && jArr[length - 1] < j11 && j11 <= j7) {
                                long j13 = zm.j(j10 - j12, siVar2.f11833f.f14178x, siVar2.f11830c);
                                long j14 = zm.j(j7 - j11, siVar2.f11833f.f14178x, siVar2.f11830c);
                                if ((j13 != 0 || j14 != 0) && j13 <= 2147483647L && j14 <= 2147483647L) {
                                    ghVar.f5644a = (int) j13;
                                    ghVar.f5645b = (int) j14;
                                    zm.n(jArr, 1000000L, siVar2.f11830c);
                                    return new wi(jArr2, iArr, i16, jArr, iArr2);
                                }
                            }
                        }
                        long[] jArr9 = siVar2.f11836i;
                        if (jArr9.length == 1) {
                            char c7 = 0;
                            if (jArr9[0] == 0) {
                                int i39 = 0;
                                while (i39 < jArr.length) {
                                    jArr[i39] = zm.j(jArr[i39] - siVar2.f11837j[c7], 1000000L, siVar2.f11830c);
                                    i39++;
                                    c7 = 0;
                                }
                                return new wi(jArr2, iArr, i16, jArr, iArr2);
                            }
                        }
                        boolean z8 = siVar2.f11829b == 1;
                        int i40 = 0;
                        int i41 = 0;
                        boolean z9 = false;
                        int i42 = 0;
                        while (true) {
                            long[] jArr10 = siVar2.f11836i;
                            if (i42 >= jArr10.length) {
                                break;
                            }
                            int[] iArr10 = iArr;
                            int i43 = i16;
                            long j15 = siVar2.f11837j[i42];
                            if (j15 != -1) {
                                jArr5 = jArr2;
                                long j16 = zm.j(jArr10[i42], siVar2.f11830c, siVar2.f11831d);
                                int b7 = zm.b(jArr, j15, true, true);
                                int b8 = zm.b(jArr, j15 + j16, z8, false);
                                i40 += b8 - b7;
                                z9 = (i41 != b7) | z9;
                                i41 = b8;
                            } else {
                                jArr5 = jArr2;
                            }
                            i42++;
                            iArr = iArr10;
                            jArr2 = jArr5;
                            i16 = i43;
                        }
                        long[] jArr11 = jArr2;
                        int[] iArr11 = iArr;
                        int i44 = i16;
                        boolean z10 = (i40 != zza) | z9;
                        long[] jArr12 = z10 ? new long[i40] : jArr11;
                        int[] iArr12 = z10 ? new int[i40] : iArr11;
                        int i45 = true == z10 ? 0 : i44;
                        int[] iArr13 = z10 ? new int[i40] : iArr2;
                        long[] jArr13 = new long[i40];
                        int i46 = i45;
                        long j17 = 0;
                        int i47 = 0;
                        int i48 = 0;
                        while (true) {
                            long[] jArr14 = siVar2.f11836i;
                            if (i47 >= jArr14.length) {
                                break;
                            }
                            long j18 = j17;
                            long j19 = siVar2.f11837j[i47];
                            long j20 = jArr14[i47];
                            if (j19 != -1) {
                                int[] iArr14 = iArr13;
                                i19 = i47;
                                long j21 = zm.j(j20, siVar2.f11830c, siVar2.f11831d);
                                int b9 = zm.b(jArr, j19, true, true);
                                int b10 = zm.b(jArr, j21 + j19, z8, false);
                                if (z10) {
                                    int i49 = b10 - b9;
                                    System.arraycopy(jArr11, b9, jArr12, i48, i49);
                                    iArr3 = iArr11;
                                    System.arraycopy(iArr3, b9, iArr12, i48, i49);
                                    z7 = z8;
                                    iArr5 = iArr14;
                                    System.arraycopy(iArr2, b9, iArr5, i48, i49);
                                } else {
                                    iArr3 = iArr11;
                                    z7 = z8;
                                    iArr5 = iArr14;
                                }
                                int i50 = i46;
                                while (b9 < b10) {
                                    long[] jArr15 = jArr11;
                                    int[] iArr15 = iArr5;
                                    long j22 = j19;
                                    jArr13[i48] = zm.j(j18, 1000000L, siVar2.f11831d) + zm.j(jArr[b9] - j19, 1000000L, siVar2.f11830c);
                                    if (z10 && iArr12[i48] > i50) {
                                        i50 = iArr3[b9];
                                    }
                                    i48++;
                                    b9++;
                                    j19 = j22;
                                    iArr5 = iArr15;
                                    jArr11 = jArr15;
                                }
                                jArr4 = jArr11;
                                iArr4 = iArr5;
                                i46 = i50;
                            } else {
                                iArr3 = iArr11;
                                jArr4 = jArr11;
                                z7 = z8;
                                iArr4 = iArr13;
                                i19 = i47;
                            }
                            j17 = j18 + j20;
                            i47 = i19 + 1;
                            iArr11 = iArr3;
                            iArr13 = iArr4;
                            z8 = z7;
                            jArr11 = jArr4;
                        }
                        int[] iArr16 = iArr13;
                        int i51 = 0;
                        int i52 = 0;
                        while (true) {
                            if (i51 < iArr16.length) {
                                if (i52 != 0) {
                                    break;
                                }
                                i52 = iArr16[i51] & 1;
                                i51++;
                            } else if (i52 == 0) {
                                throw new af("The edited sample sequence does not contain a sync sample.");
                            }
                        }
                        return new wi(jArr12, iArr12, i46, jArr13, iArr16);
                    }
                    i20 = 0;
                }
                long[] jArr16 = new long[zza];
                int[] iArr17 = new int[zza];
                long[] jArr17 = new long[zza];
                i10 = i8;
                int[] iArr18 = new int[zza];
                long j23 = 0;
                j7 = 0;
                int i53 = 0;
                i11 = 0;
                int i54 = 0;
                int i55 = 0;
                int i56 = 0;
                while (i11 < zza) {
                    while (i55 == 0) {
                        jm.e(biVar.a());
                        j23 = biVar.f3434d;
                        i55 = biVar.f3433c;
                        i21 = i21;
                        i22 = i22;
                    }
                    int i57 = i21;
                    int i58 = i22;
                    if (rmVar5 != null) {
                        while (true) {
                            if (i54 != 0) {
                                break;
                            }
                            if (i7 <= 0) {
                                i54 = 0;
                                break;
                            }
                            i54 = rmVar5.i();
                            i56 = rmVar5.e();
                            i7--;
                        }
                        i54--;
                    }
                    int i59 = i56;
                    jArr16[i11] = j23;
                    int a8 = fiVar.a();
                    iArr17[i11] = a8;
                    if (a8 > i53) {
                        jArr3 = jArr16;
                        i53 = a8;
                        ciVar = fiVar;
                    } else {
                        ciVar = fiVar;
                        jArr3 = jArr16;
                    }
                    jArr17[i11] = j7 + i59;
                    iArr18[i11] = rmVar4 == null ? 1 : 0;
                    if (i11 == i9) {
                        iArr18[i11] = 1;
                        i10--;
                        if (i10 > 0) {
                            i9 = rmVar4.i() - 1;
                        }
                    }
                    int[] iArr19 = iArr18;
                    j7 += i58;
                    int i60 = i57 - 1;
                    if (i60 != 0) {
                        i17 = i58;
                        i18 = i60;
                    } else if (i20 > 0) {
                        i18 = rmVar3.i();
                        i17 = rmVar3.i();
                        i20--;
                    } else {
                        i17 = i58;
                        i18 = 0;
                    }
                    int i61 = i18;
                    int i62 = i17;
                    j23 += iArr17[i11];
                    i55--;
                    i11++;
                    fiVar = ciVar;
                    jArr16 = jArr3;
                    iArr18 = iArr19;
                    i22 = i62;
                    i56 = i59;
                    i21 = i61;
                }
                long[] jArr18 = jArr16;
                int[] iArr20 = iArr18;
                int i63 = i21;
                jm.c(i54 != 0);
                while (i7 > 0) {
                    jm.c(rmVar5.i() == 0);
                    rmVar5.e();
                    i7--;
                }
                if (i10 != 0) {
                    if (i63 != 0) {
                        siVar2 = siVar;
                        i12 = i53;
                        i14 = i55;
                        i15 = i63;
                    } else if (i55 != 0) {
                        i15 = 0;
                        siVar2 = siVar;
                        i12 = i53;
                        i14 = i55;
                    } else {
                        if (i20 == 0) {
                            siVar2 = siVar;
                            i12 = i53;
                            i16 = i12;
                            iArr = iArr17;
                            jArr = jArr17;
                            jArr2 = jArr18;
                            iArr2 = iArr20;
                            if (siVar2.f11836i != null) {
                            }
                            zm.n(jArr, 1000000L, siVar2.f11830c);
                            return new wi(jArr2, iArr, i16, jArr, iArr2);
                        }
                        i15 = 0;
                        i14 = 0;
                        siVar2 = siVar;
                        i12 = i53;
                    }
                    i13 = 0;
                } else {
                    siVar2 = siVar;
                    i12 = i53;
                    i13 = i10;
                    i14 = i55;
                    i15 = i63;
                }
                int i64 = siVar2.f11828a;
                StringBuilder sb = new StringBuilder(215);
                sb.append("Inconsistent stbl box for track ");
                sb.append(i64);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i13);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i15);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i14);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i20);
                Log.w("AtomParsers", sb.toString());
                i16 = i12;
                iArr = iArr17;
                jArr = jArr17;
                jArr2 = jArr18;
                iArr2 = iArr20;
                if (siVar2.f11836i != null) {
                }
                zm.n(jArr, 1000000L, siVar2.f11830c);
                return new wi(jArr2, iArr, i16, jArr, iArr2);
            }
            rmVar4 = null;
        } else {
            i8 = 0;
        }
        i9 = -1;
        if (fiVar.c()) {
            if (i7 != 0) {
            }
            i20 = 0;
        }
        long[] jArr162 = new long[zza];
        int[] iArr172 = new int[zza];
        long[] jArr172 = new long[zza];
        i10 = i8;
        int[] iArr182 = new int[zza];
        long j232 = 0;
        j7 = 0;
        int i532 = 0;
        i11 = 0;
        int i542 = 0;
        int i552 = 0;
        int i562 = 0;
        while (i11 < zza) {
        }
        long[] jArr182 = jArr162;
        int[] iArr202 = iArr182;
        int i632 = i21;
        jm.c(i542 != 0);
        while (i7 > 0) {
        }
        if (i10 != 0) {
        }
        int i642 = siVar2.f11828a;
        StringBuilder sb2 = new StringBuilder(215);
        sb2.append("Inconsistent stbl box for track ");
        sb2.append(i642);
        sb2.append(": remainingSynchronizationSamples ");
        sb2.append(i13);
        sb2.append(", remainingSamplesAtTimestampDelta ");
        sb2.append(i15);
        sb2.append(", remainingSamplesInChunk ");
        sb2.append(i14);
        sb2.append(", remainingTimestampDeltaChanges ");
        sb2.append(i20);
        Log.w("AtomParsers", sb2.toString());
        i16 = i12;
        iArr = iArr172;
        jArr = jArr172;
        jArr2 = jArr182;
        iArr2 = iArr202;
        if (siVar2.f11836i != null) {
        }
        zm.n(jArr, 1000000L, siVar2.f11830c);
        return new wi(jArr2, iArr, i16, jArr, iArr2);
    }

    public static mj c(zh zhVar, boolean z6) {
        if (z6) {
            return null;
        }
        rm rmVar = zhVar.P0;
        rmVar.v(8);
        while (rmVar.a() >= 8) {
            int c7 = rmVar.c();
            int e7 = rmVar.e();
            if (rmVar.e() == ai.B0) {
                rmVar.v(c7);
                int i7 = c7 + e7;
                rmVar.w(12);
                while (rmVar.c() < i7) {
                    int c8 = rmVar.c();
                    int e8 = rmVar.e();
                    if (rmVar.e() == ai.C0) {
                        rmVar.v(c8);
                        int i8 = c8 + e8;
                        rmVar.w(8);
                        ArrayList arrayList = new ArrayList();
                        while (rmVar.c() < i8) {
                            lj a7 = ni.a(rmVar);
                            if (a7 != null) {
                                arrayList.add(a7);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new mj(arrayList);
                    }
                    rmVar.w(e8 - 8);
                }
                return null;
            }
            rmVar.w(e7 - 8);
        }
        return null;
    }

    private static int d(rm rmVar) {
        int g7 = rmVar.g();
        int i7 = g7 & 127;
        while ((g7 & 128) == 128) {
            g7 = rmVar.g();
            i7 = (i7 << 7) | (g7 & 127);
        }
        return i7;
    }

    private static int e(rm rmVar, int i7, int i8, di diVar, int i9) {
        int c7 = rmVar.c();
        while (true) {
            if (c7 - i7 >= i8) {
                return 0;
            }
            rmVar.v(c7);
            int e7 = rmVar.e();
            jm.d(e7 > 0, "childAtomSize should be positive");
            if (rmVar.e() == ai.W) {
                int i10 = c7 + 8;
                Pair pair = null;
                Integer num = null;
                ti tiVar = null;
                boolean z6 = false;
                while (i10 - c7 < e7) {
                    rmVar.v(i10);
                    int e8 = rmVar.e();
                    int e9 = rmVar.e();
                    if (e9 == ai.f2778c0) {
                        num = Integer.valueOf(rmVar.e());
                    } else if (e9 == ai.X) {
                        rmVar.w(4);
                        z6 = rmVar.e() == f6278g;
                    } else if (e9 == ai.Y) {
                        int i11 = i10 + 8;
                        while (true) {
                            if (i11 - i10 >= e8) {
                                tiVar = null;
                                break;
                            }
                            rmVar.v(i11);
                            int e10 = rmVar.e();
                            if (rmVar.e() == ai.Z) {
                                rmVar.w(6);
                                boolean z7 = rmVar.g() == 1;
                                int g7 = rmVar.g();
                                byte[] bArr = new byte[16];
                                rmVar.q(bArr, 0, 16);
                                tiVar = new ti(z7, g7, bArr);
                            } else {
                                i11 += e10;
                            }
                        }
                    }
                    i10 += e8;
                }
                if (z6) {
                    jm.d(num != null, "frma atom is mandatory");
                    jm.d(tiVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, tiVar);
                }
                if (pair != null) {
                    diVar.f4226a[i9] = (ti) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            c7 += e7;
        }
    }

    private static Pair<String, byte[]> f(rm rmVar, int i7) {
        rmVar.v(i7 + 12);
        rmVar.w(1);
        d(rmVar);
        rmVar.w(2);
        int g7 = rmVar.g();
        if ((g7 & 128) != 0) {
            rmVar.w(2);
        }
        if ((g7 & 64) != 0) {
            rmVar.w(rmVar.j());
        }
        if ((g7 & 32) != 0) {
            rmVar.w(2);
        }
        rmVar.w(1);
        d(rmVar);
        int g8 = rmVar.g();
        String str = null;
        if (g8 == 32) {
            str = "video/mp4v-es";
        } else if (g8 == 33) {
            str = "video/avc";
        } else if (g8 != 35) {
            if (g8 != 64) {
                if (g8 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (g8 == 165) {
                    str = "audio/ac3";
                } else if (g8 != 166) {
                    switch (g8) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (g8) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        rmVar.w(12);
        rmVar.w(1);
        int d7 = d(rmVar);
        byte[] bArr = new byte[d7];
        rmVar.q(bArr, 0, d7);
        return Pair.create(str, bArr);
    }
}
