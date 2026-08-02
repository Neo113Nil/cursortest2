package S0;

import E.AbstractC0005f;
import T.C0089g;
import T.C0094l;
import T.C0096n;
import T.C0097o;
import T.D;
import T.E;
import T.F;
import T.G;
import W.AbstractC0108a;
import W.AbstractC0110c;
import W.J;
import a.AbstractC0124a;
import android.util.Pair;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinVersion;
import v2.I;
import v2.a0;
import y0.AbstractC1569a;
import y0.C1572d;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2428a;

    static {
        String str = J.f3263a;
        f2428a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(W.u uVar) {
        int i4 = uVar.f3352b;
        uVar.N(4);
        if (uVar.m() != 1751411826) {
            i4 += 4;
        }
        uVar.M(i4);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static void b(W.u r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, T.C0094l r56, S0.g r57, int r58) {
        /*
            Method dump skipped, instructions count: 3208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.j.b(W.u, int, int, int, int, java.lang.String, boolean, T.l, S0.g, int):void");
    }

    public static d c(int i4, W.u uVar) {
        uVar.M(i4 + 12);
        uVar.N(1);
        d(uVar);
        uVar.N(2);
        int z = uVar.z();
        if ((z & 128) != 0) {
            uVar.N(2);
        }
        if ((z & 64) != 0) {
            uVar.N(uVar.z());
        }
        if ((z & 32) != 0) {
            uVar.N(2);
        }
        uVar.N(1);
        d(uVar);
        String e4 = F.e(uVar.z());
        if ("audio/mpeg".equals(e4) || "audio/vnd.dts".equals(e4) || "audio/vnd.dts.hd".equals(e4)) {
            return new d(-1L, e4, -1L, null);
        }
        uVar.N(4);
        long B4 = uVar.B();
        long B5 = uVar.B();
        uVar.N(1);
        int d4 = d(uVar);
        byte[] bArr = new byte[d4];
        uVar.k(bArr, 0, d4);
        if (B5 <= 0) {
            B5 = -1;
        }
        return new d(B5, e4, B4 > 0 ? B4 : -1L, bArr);
    }

    public static int d(W.u uVar) {
        int z = uVar.z();
        int i4 = z & 127;
        while ((z & 128) == 128) {
            z = uVar.z();
            i4 = (i4 << 7) | (z & 127);
        }
        return i4;
    }

    public static int e(int i4) {
        return (i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static E f(X.c cVar) {
        X.a aVar;
        X.d i4 = cVar.i(1751411826);
        X.d i5 = cVar.i(1801812339);
        X.d i6 = cVar.i(1768715124);
        if (i4 != null && i5 != null && i6 != null) {
            W.u uVar = i4.f3494c;
            uVar.M(16);
            if (uVar.m() == 1835299937) {
                W.u uVar2 = i5.f3494c;
                uVar2.M(12);
                int m4 = uVar2.m();
                String[] strArr = new String[m4];
                for (int i7 = 0; i7 < m4; i7++) {
                    int m5 = uVar2.m();
                    uVar2.N(4);
                    strArr[i7] = uVar2.x(m5 - 8, StandardCharsets.UTF_8);
                }
                W.u uVar3 = i6.f3494c;
                uVar3.M(8);
                ArrayList arrayList = new ArrayList();
                while (uVar3.a() > 8) {
                    int i8 = uVar3.f3352b;
                    int m6 = uVar3.m();
                    int m7 = uVar3.m() - 1;
                    if (m7 < 0 || m7 >= m4) {
                        AbstractC0005f.u(m7, "Skipped metadata with unknown key index: ", "BoxParsers");
                    } else {
                        String str = strArr[m7];
                        int i9 = i8 + m6;
                        while (true) {
                            int i10 = uVar3.f3352b;
                            if (i10 >= i9) {
                                aVar = null;
                                break;
                            }
                            int m8 = uVar3.m();
                            if (uVar3.m() == 1684108385) {
                                int m9 = uVar3.m();
                                int m10 = uVar3.m();
                                int i11 = m8 - 16;
                                byte[] bArr = new byte[i11];
                                uVar3.k(bArr, 0, i11);
                                aVar = new X.a(str, bArr, m10, m9);
                                break;
                            }
                            uVar3.M(i10 + m8);
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    uVar3.M(i8 + m6);
                }
                if (!arrayList.isEmpty()) {
                    return new E(arrayList);
                }
            }
        }
        return null;
    }

    public static X.g g(W.u uVar) {
        long t4;
        long t5;
        uVar.M(8);
        if (e(uVar.m()) == 0) {
            t4 = uVar.B();
            t5 = uVar.B();
        } else {
            t4 = uVar.t();
            t5 = uVar.t();
        }
        return new X.g(t4, t5, uVar.B());
    }

    public static Pair h(W.u uVar, int i4, int i5) {
        Integer num;
        y yVar;
        Pair create;
        int i6;
        int i7;
        Integer num2;
        boolean z;
        int i8 = uVar.f3352b;
        while (i8 - i4 < i5) {
            uVar.M(i8);
            int m4 = uVar.m();
            AbstractC1569a.e("childAtomSize must be positive", m4 > 0);
            if (uVar.m() == 1936289382) {
                int i9 = i8 + 8;
                int i10 = 0;
                int i11 = -1;
                Integer num3 = null;
                String str = null;
                while (i9 - i8 < m4) {
                    uVar.M(i9);
                    int m5 = uVar.m();
                    int m6 = uVar.m();
                    if (m6 == 1718775137) {
                        num3 = Integer.valueOf(uVar.m());
                    } else if (m6 == 1935894637) {
                        uVar.N(4);
                        str = uVar.x(4, StandardCharsets.UTF_8);
                    } else if (m6 == 1935894633) {
                        i11 = i9;
                        i10 = m5;
                    }
                    i9 += m5;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    AbstractC1569a.e("frma atom is mandatory", num3 != null);
                    AbstractC1569a.e("schi atom is mandatory", i11 != -1);
                    int i12 = i11 + 8;
                    while (true) {
                        if (i12 - i11 >= i10) {
                            num = num3;
                            yVar = null;
                            break;
                        }
                        uVar.M(i12);
                        int m7 = uVar.m();
                        if (uVar.m() == 1952804451) {
                            int e4 = e(uVar.m());
                            uVar.N(1);
                            if (e4 == 0) {
                                uVar.N(1);
                                i7 = 0;
                                i6 = 0;
                            } else {
                                int z4 = uVar.z();
                                i6 = z4 & 15;
                                i7 = (z4 & 240) >> 4;
                            }
                            if (uVar.z() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int z5 = uVar.z();
                            byte[] bArr2 = new byte[16];
                            uVar.k(bArr2, 0, 16);
                            if (z && z5 == 0) {
                                int z6 = uVar.z();
                                byte[] bArr3 = new byte[z6];
                                uVar.k(bArr3, 0, z6);
                                bArr = bArr3;
                            }
                            num = num2;
                            yVar = new y(z, str, z5, bArr2, i7, i6, bArr);
                        } else {
                            i12 += m7;
                        }
                    }
                    AbstractC1569a.e("tenc atom is mandatory", yVar != null);
                    String str2 = J.f3263a;
                    create = Pair.create(num, yVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i8 += m4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x081c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g i(W.u uVar, i iVar, String str, C0094l c0094l, boolean z) {
        int i4;
        int i5;
        C0094l c0094l2;
        int i6;
        int i7;
        int i8;
        boolean z4;
        char c4;
        String str2;
        int i9;
        String str3;
        String str4;
        g gVar;
        int i10;
        G1.c cVar;
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        int i14;
        int i15;
        int i16;
        char c5;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        C0089g c0089g;
        C0089g c0089g2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        t1.h hVar;
        C0094l c0094l3;
        int i28;
        String str5;
        a0 a0Var;
        long j4;
        W.u uVar2 = uVar;
        i iVar2 = iVar;
        String str6 = str;
        int i29 = iVar2.f2423a;
        uVar2.M(12);
        int m4 = uVar2.m();
        g gVar2 = new g();
        gVar2.f2416c = new y[m4];
        boolean z5 = false;
        gVar2.f2415b = 0;
        int i30 = 0;
        while (i30 < m4) {
            int i31 = uVar2.f3352b;
            int m5 = uVar2.m();
            String str7 = "childAtomSize must be positive";
            AbstractC1569a.e("childAtomSize must be positive", m5 > 0 ? true : z5);
            int m6 = uVar2.m();
            byte b4 = 3;
            int i32 = 8;
            if (m6 == 1635148593 || m6 == 1635148595 || m6 == 1701733238 || m6 == 1831958048 || m6 == 1836070006 || m6 == 1752589105 || m6 == 1751479857 || m6 == 1932670515 || m6 == 1211250227 || m6 == 1748121139 || m6 == 1987063864 || m6 == 1987063865 || m6 == 1635135537 || m6 == 1685479798 || m6 == 1685479729 || m6 == 1685481573 || m6 == 1685481521 || m6 == 1634760241) {
                int i33 = iVar2.f2425c;
                uVar2.M(i31 + 16);
                uVar2.N(16);
                int G4 = uVar2.G();
                int G5 = uVar2.G();
                uVar2.N(50);
                int i34 = uVar2.f3352b;
                i4 = i30;
                if (m6 == 1701733238) {
                    Pair h2 = h(uVar2, i31, m5);
                    if (h2 != null) {
                        m6 = ((Integer) h2.first).intValue();
                        if (c0094l == null) {
                            i5 = i31;
                            c0094l3 = null;
                        } else {
                            i5 = i31;
                            c0094l3 = c0094l.a(((y) h2.second).f2550b);
                        }
                        ((y[]) gVar2.f2416c)[i4] = (y) h2.second;
                    } else {
                        i5 = i31;
                        c0094l3 = c0094l;
                    }
                    uVar2.M(i34);
                    c0094l2 = c0094l3;
                } else {
                    i5 = i31;
                    c0094l2 = c0094l;
                }
                C0094l c0094l4 = c0094l2;
                i6 = i29;
                i7 = m4;
                int i35 = 8;
                int i36 = 8;
                String str8 = m6 == 1831958048 ? "video/mpeg" : m6 == 1211250227 ? "video/3gpp" : null;
                float f4 = 1.0f;
                int i37 = -1;
                int i38 = -1;
                int i39 = -1;
                List list = null;
                G1.c cVar2 = null;
                ByteBuffer byteBuffer = null;
                String str9 = null;
                boolean z6 = false;
                int i40 = -1;
                int i41 = -1;
                byte[] bArr2 = null;
                int i42 = -1;
                int i43 = -1;
                C3.v vVar = null;
                b bVar = null;
                d dVar = null;
                int i44 = i34;
                int i45 = -1;
                while (i44 - i5 < m5) {
                    uVar2.M(i44);
                    int i46 = uVar2.f3352b;
                    int i47 = i44;
                    int m7 = uVar2.m();
                    if (m7 == 0 && uVar2.f3352b - i5 == m5) {
                        break;
                    }
                    AbstractC1569a.e(str7, m7 > 0);
                    int m8 = uVar2.m();
                    int i48 = m5;
                    if (m8 == 1635148611) {
                        AbstractC1569a.e(null, str8 == null);
                        uVar2.M(i46 + 8);
                        C1572d a3 = C1572d.a(uVar2);
                        list = a3.f16130a;
                        gVar2.f2414a = a3.f16131b;
                        float f5 = !z6 ? a3.f16140k : f4;
                        String str10 = a3.f16141l;
                        int i49 = a3.f16139j;
                        i39 = a3.f16136g;
                        int i50 = a3.f16137h;
                        i45 = a3.f16138i;
                        int i51 = a3.f16134e;
                        i35 = a3.f16135f;
                        i41 = i49;
                        i9 = m6;
                        i12 = i37;
                        str3 = str7;
                        gVar = gVar2;
                        f4 = f5;
                        cVar = cVar2;
                        i11 = i32;
                        str4 = "video/avc";
                        str9 = str10;
                        i38 = i50;
                        i36 = i51;
                    } else {
                        i9 = m6;
                        if (m8 == 1752589123) {
                            AbstractC1569a.e(null, str8 == null);
                            uVar2.M(i46 + 8);
                            y0.u a4 = y0.u.a(uVar2, false, null);
                            list = a4.f16199a;
                            gVar2.f2414a = a4.f16200b;
                            float f6 = !z6 ? a4.f16210l : f4;
                            int i52 = a4.f16211m;
                            int i53 = a4.f16201c;
                            String str11 = a4.n;
                            int i54 = a4.f16209k;
                            if (i54 != -1) {
                                i37 = i54;
                            }
                            int i55 = a4.f16202d;
                            int i56 = a4.f16203e;
                            i39 = a4.f16206h;
                            int i57 = a4.f16207i;
                            int i58 = a4.f16208j;
                            int i59 = a4.f16204f;
                            int i60 = a4.f16205g;
                            cVar = a4.o;
                            i35 = i60;
                            str4 = "video/hevc";
                            str3 = str7;
                            gVar = gVar2;
                            f4 = f6;
                            i43 = i55;
                            i42 = i56;
                            i38 = i57;
                            i11 = i32;
                            i45 = i58;
                            i36 = i59;
                            i40 = i53;
                            i12 = i37;
                            i41 = i52;
                            str9 = str11;
                        } else {
                            int i61 = i37;
                            if (m8 == 1818785347) {
                                AbstractC1569a.e("lhvC must follow hvcC atom", "video/hevc".equals(str8));
                                AbstractC1569a.e("must have at least two layers", cVar2 != null && ((I) cVar2.f835b).size() >= 2);
                                uVar2.M(i46 + 8);
                                cVar2.getClass();
                                y0.u a5 = y0.u.a(uVar2, true, cVar2);
                                AbstractC1569a.e("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", gVar2.f2414a == a5.f16200b);
                                int i62 = a5.f16206h;
                                if (i62 != -1) {
                                    AbstractC1569a.e("colorSpace must be the same for both views", i39 == i62);
                                }
                                int i63 = a5.f16207i;
                                if (i63 != -1) {
                                    AbstractC1569a.e("colorRange must be the same for both views", i38 == i63);
                                }
                                int i64 = a5.f16208j;
                                if (i64 != -1) {
                                    AbstractC1569a.e("colorTransfer must be the same for both views", i45 == i64);
                                }
                                AbstractC1569a.e("bitdepthLuma must be the same for both views", i36 == a5.f16204f);
                                AbstractC1569a.e("bitdepthChroma must be the same for both views", i35 == a5.f16205g);
                                if (list != null) {
                                    v2.F j5 = I.j();
                                    j5.c(list);
                                    j5.c(a5.f16199a);
                                    list = j5.f();
                                } else {
                                    AbstractC1569a.e("initializationData must be already set from hvcC atom", false);
                                }
                                str9 = a5.n;
                                str4 = "video/mv-hevc";
                                gVar = gVar2;
                                cVar = cVar2;
                                i11 = i32;
                                i12 = i61;
                                str3 = str7;
                            } else {
                                if (m8 == 1986361461) {
                                    uVar2.M(i46 + 8);
                                    int i65 = uVar2.f3352b;
                                    t1.h hVar2 = null;
                                    while (i65 - i46 < m7) {
                                        uVar2.M(i65);
                                        int m9 = uVar2.m();
                                        AbstractC1569a.e(str7, m9 > 0);
                                        int i66 = i35;
                                        if (uVar2.m() == 1702454643) {
                                            uVar2.M(i65 + 8);
                                            int i67 = uVar2.f3352b;
                                            while (true) {
                                                if (i67 - i65 >= m9) {
                                                    i25 = i36;
                                                    i26 = i65;
                                                    i27 = m9;
                                                    hVar = null;
                                                    break;
                                                }
                                                uVar2.M(i67);
                                                int m10 = uVar2.m();
                                                AbstractC1569a.e(str7, m10 > 0);
                                                int i68 = i67;
                                                if (uVar2.m() == 1937011305) {
                                                    uVar2.N(4);
                                                    int z7 = uVar2.z();
                                                    i25 = i36;
                                                    boolean z8 = (z7 & 1) == 1;
                                                    i26 = i65;
                                                    boolean z9 = (z7 & 2) == 2;
                                                    i27 = m9;
                                                    boolean z10 = (z7 & 8) == i32;
                                                    f fVar = new f();
                                                    fVar.f2411a = z8;
                                                    fVar.f2412b = z9;
                                                    fVar.f2413c = z10;
                                                    hVar = new t1.h(18, fVar);
                                                } else {
                                                    i67 = i68 + m10;
                                                    i32 = 8;
                                                }
                                            }
                                            hVar2 = hVar;
                                        } else {
                                            i25 = i36;
                                            i26 = i65;
                                            i27 = m9;
                                        }
                                        i65 = i26 + i27;
                                        i35 = i66;
                                        i36 = i25;
                                        i32 = 8;
                                    }
                                    int i69 = i35;
                                    int i70 = i36;
                                    t1.h hVar3 = hVar2 == null ? null : new t1.h(19, hVar2);
                                    if (hVar3 != null) {
                                        f fVar2 = (f) ((t1.h) hVar3.f15398b).f15398b;
                                        boolean z11 = fVar2.f2413c;
                                        if (cVar2 == null || ((I) cVar2.f835b).size() < 2) {
                                            i23 = i61;
                                            if (i23 == -1) {
                                                i24 = z11 ? 5 : 4;
                                                i12 = i24;
                                                str3 = str7;
                                                str4 = str8;
                                                gVar = gVar2;
                                                cVar = cVar2;
                                                i35 = i69;
                                                i36 = i70;
                                            }
                                            i24 = i23;
                                            i12 = i24;
                                            str3 = str7;
                                            str4 = str8;
                                            gVar = gVar2;
                                            cVar = cVar2;
                                            i35 = i69;
                                            i36 = i70;
                                        } else {
                                            AbstractC1569a.e("both eye views must be marked as available", fVar2.f2411a && fVar2.f2412b);
                                            AbstractC1569a.e("for MV-HEVC, eye_views_reversed must be set to false", !z11);
                                        }
                                    }
                                    i23 = i61;
                                    i24 = i23;
                                    i12 = i24;
                                    str3 = str7;
                                    str4 = str8;
                                    gVar = gVar2;
                                    cVar = cVar2;
                                    i35 = i69;
                                    i36 = i70;
                                } else {
                                    int i71 = i35;
                                    int i72 = i36;
                                    int i73 = i61;
                                    if (m8 == 1685480259 || m8 == 1685485123 || m8 == 1685485379) {
                                        str3 = str7;
                                        str4 = str8;
                                        gVar = gVar2;
                                        i10 = i38;
                                        cVar = cVar2;
                                        i11 = 8;
                                        i12 = i73;
                                        vVar = C3.v.d(uVar2);
                                    } else {
                                        int i74 = 6;
                                        if (m8 == 1987076931) {
                                            AbstractC1569a.e(null, str8 == null);
                                            String str12 = i9 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            uVar2.M(i46 + 12);
                                            byte z12 = (byte) uVar2.z();
                                            byte z13 = (byte) uVar2.z();
                                            int z14 = uVar2.z();
                                            int i75 = z14 >> 4;
                                            byte b5 = (byte) ((z14 >> 1) & 7);
                                            if (str12.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr3 = AbstractC0110c.f3295a;
                                                byte[] bArr4 = new byte[12];
                                                bArr4[0] = 1;
                                                bArr4[1] = 1;
                                                bArr4[2] = z12;
                                                bArr4[b4] = 2;
                                                bArr4[4] = 1;
                                                bArr4[5] = z13;
                                                bArr4[6] = b4;
                                                bArr4[7] = 1;
                                                bArr4[8] = (byte) i75;
                                                bArr4[9] = 4;
                                                bArr4[10] = 1;
                                                bArr4[11] = b5;
                                                list = I.o(bArr4);
                                            }
                                            boolean z15 = (z14 & 1) != 0;
                                            int z16 = uVar2.z();
                                            int z17 = uVar2.z();
                                            i39 = C0089g.f(z16);
                                            int i76 = z15 ? 1 : 2;
                                            i45 = C0089g.g(z17);
                                            i12 = i73;
                                            str3 = str7;
                                            i9 = i9;
                                            gVar = gVar2;
                                            i35 = i75;
                                            i36 = i35;
                                            str4 = str12;
                                            cVar = cVar2;
                                            i38 = i76;
                                        } else {
                                            int i77 = 7;
                                            int i78 = 11;
                                            if (m8 == 1635135811) {
                                                int i79 = m7 - 8;
                                                byte[] bArr5 = new byte[i79];
                                                uVar2.k(bArr5, 0, i79);
                                                list = I.o(bArr5);
                                                uVar2.M(i46 + 8);
                                                byte[] bArr6 = uVar2.f3351a;
                                                W.t tVar = new W.t(bArr6.length, bArr6);
                                                tVar.q(uVar2.f3352b * 8);
                                                tVar.u(1);
                                                int i80 = tVar.i(b4);
                                                tVar.t(6);
                                                boolean h4 = tVar.h();
                                                boolean h5 = tVar.h();
                                                int i81 = -1;
                                                if (i80 == 2 && h4) {
                                                    int i82 = h5 ? 12 : 10;
                                                    i15 = h5 ? 12 : 10;
                                                    i13 = i82;
                                                } else if (i80 <= 2) {
                                                    int i83 = h4 ? 10 : 8;
                                                    i15 = h4 ? 10 : 8;
                                                    i13 = i83;
                                                } else {
                                                    i13 = -1;
                                                    i14 = -1;
                                                    tVar.t(13);
                                                    tVar.s();
                                                    i16 = tVar.i(4);
                                                    if (i16 == 1) {
                                                        AbstractC0108a.j("BoxParsers", "Unsupported obu_type: " + i16);
                                                        c0089g2 = new C0089g(-1, -1, -1, null, i13, i14);
                                                    } else if (tVar.h()) {
                                                        AbstractC0108a.j("BoxParsers", "Unsupported obu_extension_flag");
                                                        c0089g2 = new C0089g(-1, -1, -1, null, i13, i14);
                                                    } else {
                                                        boolean h6 = tVar.h();
                                                        tVar.s();
                                                        if (!h6 || tVar.i(8) <= 127) {
                                                            int i84 = tVar.i(3);
                                                            tVar.s();
                                                            if (tVar.h()) {
                                                                AbstractC0108a.j("BoxParsers", "Unsupported reduced_still_picture_header");
                                                                c0089g2 = new C0089g(-1, -1, -1, null, i13, i14);
                                                            } else if (tVar.h()) {
                                                                AbstractC0108a.j("BoxParsers", "Unsupported timing_info_present_flag");
                                                                c0089g2 = new C0089g(-1, -1, -1, null, i13, i14);
                                                            } else if (tVar.h()) {
                                                                AbstractC0108a.j("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                c0089g2 = new C0089g(-1, -1, -1, null, i13, i14);
                                                            } else {
                                                                int i85 = 5;
                                                                int i86 = tVar.i(5);
                                                                int i87 = 0;
                                                                while (i87 <= i86) {
                                                                    tVar.t(12);
                                                                    if (tVar.i(i85) > i77) {
                                                                        tVar.s();
                                                                    }
                                                                    i87++;
                                                                    i85 = 5;
                                                                    i77 = 7;
                                                                }
                                                                c5 = '\f';
                                                                int i88 = tVar.i(4);
                                                                int i89 = tVar.i(4);
                                                                tVar.t(i88 + 1);
                                                                tVar.t(i89 + 1);
                                                                if (tVar.h()) {
                                                                    i17 = 7;
                                                                    tVar.t(7);
                                                                } else {
                                                                    i17 = 7;
                                                                }
                                                                tVar.t(i17);
                                                                boolean h7 = tVar.h();
                                                                if (h7) {
                                                                    tVar.t(2);
                                                                }
                                                                if (tVar.h()) {
                                                                    i18 = 1;
                                                                    i19 = 2;
                                                                } else {
                                                                    i18 = 1;
                                                                    i19 = tVar.i(1);
                                                                }
                                                                if (i19 > 0 && !tVar.h()) {
                                                                    tVar.t(i18);
                                                                }
                                                                if (h7) {
                                                                    tVar.t(3);
                                                                }
                                                                tVar.t(3);
                                                                boolean h8 = tVar.h();
                                                                if (i84 == 2 && h8) {
                                                                    tVar.s();
                                                                }
                                                                boolean z18 = i84 != 1 && tVar.h();
                                                                if (tVar.h()) {
                                                                    int i90 = tVar.i(8);
                                                                    int i91 = tVar.i(8);
                                                                    int i92 = (!z18 && i90 == 1 && i91 == 13 && tVar.i(8) == 0) ? 1 : tVar.i(1);
                                                                    int f7 = C0089g.f(i90);
                                                                    int i93 = i92 == 1 ? 1 : 2;
                                                                    i20 = f7;
                                                                    i21 = i13;
                                                                    i22 = C0089g.g(i91);
                                                                    i81 = i93;
                                                                } else {
                                                                    i20 = -1;
                                                                    i21 = i13;
                                                                    i22 = -1;
                                                                }
                                                                c0089g = new C0089g(i20, i81, i22, null, i21, i14);
                                                                int i94 = c0089g.f2789e;
                                                                int i95 = c0089g.f2790f;
                                                                i39 = c0089g.f2785a;
                                                                i38 = c0089g.f2786b;
                                                                i45 = c0089g.f2787c;
                                                                str4 = "video/av01";
                                                                i36 = i94;
                                                                str3 = str7;
                                                                gVar = gVar2;
                                                                cVar = cVar2;
                                                                i11 = 8;
                                                                i12 = i73;
                                                                i35 = i95;
                                                            }
                                                        } else {
                                                            AbstractC0108a.j("BoxParsers", "Excessive obu_size");
                                                            c0089g2 = new C0089g(-1, -1, -1, null, i13, i14);
                                                        }
                                                    }
                                                    c0089g = c0089g2;
                                                    c5 = '\f';
                                                    int i942 = c0089g.f2789e;
                                                    int i952 = c0089g.f2790f;
                                                    i39 = c0089g.f2785a;
                                                    i38 = c0089g.f2786b;
                                                    i45 = c0089g.f2787c;
                                                    str4 = "video/av01";
                                                    i36 = i942;
                                                    str3 = str7;
                                                    gVar = gVar2;
                                                    cVar = cVar2;
                                                    i11 = 8;
                                                    i12 = i73;
                                                    i35 = i952;
                                                }
                                                i14 = i15;
                                                tVar.t(13);
                                                tVar.s();
                                                i16 = tVar.i(4);
                                                if (i16 == 1) {
                                                }
                                                c0089g = c0089g2;
                                                c5 = '\f';
                                                int i9422 = c0089g.f2789e;
                                                int i9522 = c0089g.f2790f;
                                                i39 = c0089g.f2785a;
                                                i38 = c0089g.f2786b;
                                                i45 = c0089g.f2787c;
                                                str4 = "video/av01";
                                                i36 = i9422;
                                                str3 = str7;
                                                gVar = gVar2;
                                                cVar = cVar2;
                                                i11 = 8;
                                                i12 = i73;
                                                i35 = i9522;
                                            } else {
                                                if (m8 == 1668050025) {
                                                    if (byteBuffer == null) {
                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                    byteBuffer2.position(21);
                                                    byteBuffer2.putShort(uVar2.w());
                                                    byteBuffer2.putShort(uVar2.w());
                                                    i12 = i73;
                                                    byteBuffer = byteBuffer2;
                                                    str3 = str7;
                                                    str4 = str8;
                                                    gVar = gVar2;
                                                    cVar = cVar2;
                                                    i35 = i71;
                                                    i36 = i72;
                                                } else if (m8 == 1835295606) {
                                                    if (byteBuffer == null) {
                                                        byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                    }
                                                    ByteBuffer byteBuffer3 = byteBuffer;
                                                    short w4 = uVar2.w();
                                                    short w5 = uVar2.w();
                                                    short w6 = uVar2.w();
                                                    short w7 = uVar2.w();
                                                    str3 = str7;
                                                    short w8 = uVar2.w();
                                                    str4 = str8;
                                                    short w9 = uVar2.w();
                                                    int i96 = i38;
                                                    short w10 = uVar2.w();
                                                    cVar = cVar2;
                                                    short w11 = uVar2.w();
                                                    long B4 = uVar2.B();
                                                    long B5 = uVar2.B();
                                                    gVar = gVar2;
                                                    byteBuffer3.position(1);
                                                    byteBuffer3.putShort(w8);
                                                    byteBuffer3.putShort(w9);
                                                    byteBuffer3.putShort(w4);
                                                    byteBuffer3.putShort(w5);
                                                    byteBuffer3.putShort(w6);
                                                    byteBuffer3.putShort(w7);
                                                    byteBuffer3.putShort(w10);
                                                    byteBuffer3.putShort(w11);
                                                    byteBuffer3.putShort((short) (B4 / 10000));
                                                    byteBuffer3.putShort((short) (B5 / 10000));
                                                    i12 = i73;
                                                    byteBuffer = byteBuffer3;
                                                    i35 = i71;
                                                    i36 = i72;
                                                    i38 = i96;
                                                } else {
                                                    str3 = str7;
                                                    str4 = str8;
                                                    gVar = gVar2;
                                                    i10 = i38;
                                                    cVar = cVar2;
                                                    if (m8 == 1681012275) {
                                                        AbstractC1569a.e(null, str4 == null);
                                                        i12 = i73;
                                                        str4 = "video/3gpp";
                                                        i35 = i71;
                                                        i36 = i72;
                                                        i38 = i10;
                                                    } else if (m8 == 1702061171) {
                                                        AbstractC1569a.e(null, str4 == null);
                                                        d c6 = c(i46, uVar2);
                                                        String str13 = (String) c6.f2409c;
                                                        byte[] bArr7 = (byte[]) c6.f2410d;
                                                        if (bArr7 != null) {
                                                            list = I.o(bArr7);
                                                        }
                                                        dVar = c6;
                                                        str4 = str13;
                                                        i36 = i72;
                                                        i38 = i10;
                                                        i11 = 8;
                                                        i12 = i73;
                                                        i35 = i71;
                                                    } else {
                                                        if (m8 == 1651798644) {
                                                            uVar2.M(i46 + 8);
                                                            uVar2.N(4);
                                                            i12 = i73;
                                                            bVar = new b(uVar2.B(), uVar2.B());
                                                        } else if (m8 == 1885434736) {
                                                            uVar2.M(i46 + 8);
                                                            i12 = i73;
                                                            f4 = uVar2.D() / uVar2.D();
                                                            i35 = i71;
                                                            i36 = i72;
                                                            i38 = i10;
                                                            i11 = 8;
                                                            z6 = true;
                                                        } else if (m8 == 1937126244) {
                                                            int i97 = i46 + 8;
                                                            while (true) {
                                                                if (i97 - i46 >= m7) {
                                                                    bArr = null;
                                                                    break;
                                                                }
                                                                uVar2.M(i97);
                                                                int m11 = uVar2.m();
                                                                if (uVar2.m() == 1886547818) {
                                                                    bArr = Arrays.copyOfRange(uVar2.f3351a, i97, m11 + i97);
                                                                    break;
                                                                }
                                                                i97 += m11;
                                                            }
                                                            i12 = i73;
                                                            bArr2 = bArr;
                                                        } else if (m8 == 1936995172) {
                                                            int z19 = uVar2.z();
                                                            uVar2.N(3);
                                                            if (z19 == 0) {
                                                                int z20 = uVar2.z();
                                                                if (z20 == 0) {
                                                                    i73 = 0;
                                                                } else if (z20 == 1) {
                                                                    i73 = 1;
                                                                } else if (z20 == 2) {
                                                                    i73 = 2;
                                                                } else if (z20 == 3) {
                                                                    i73 = 3;
                                                                }
                                                            }
                                                            i12 = i73;
                                                        } else if (m8 == 1634760259) {
                                                            int i98 = m7 - 12;
                                                            byte[] bArr8 = new byte[i98];
                                                            uVar2.M(i46 + 12);
                                                            uVar2.k(bArr8, 0, i98);
                                                            byte[] bArr9 = AbstractC0110c.f3295a;
                                                            AbstractC0124a.f(i98, "Invalid APV CSD length: %s", i98 >= 17);
                                                            byte b6 = bArr8[0];
                                                            AbstractC0124a.f(b6, "Invalid APV CSD version: %s", b6 == 1);
                                                            byte b7 = bArr8[5];
                                                            byte b8 = bArr8[6];
                                                            byte b9 = bArr8[7];
                                                            String str14 = J.f3263a;
                                                            Locale locale = Locale.US;
                                                            str9 = "apv1.apvf" + ((int) b7) + ".apvl" + ((int) b8) + ".apvb" + ((int) b9);
                                                            list = I.o(bArr8);
                                                            W.u uVar3 = new W.u(bArr8);
                                                            W.t tVar2 = new W.t(i98, bArr8);
                                                            i11 = 8;
                                                            tVar2.q(uVar3.f3352b * 8);
                                                            tVar2.u(1);
                                                            int i99 = tVar2.i(8);
                                                            int i100 = 0;
                                                            int i101 = -1;
                                                            int i102 = -1;
                                                            int i103 = -1;
                                                            int i104 = -1;
                                                            int i105 = -1;
                                                            while (i100 < i99) {
                                                                tVar2.u(1);
                                                                int i106 = tVar2.i(8);
                                                                int i107 = i105;
                                                                int i108 = i104;
                                                                int i109 = i103;
                                                                int i110 = i102;
                                                                int i111 = i101;
                                                                int i112 = 0;
                                                                while (i112 < i106) {
                                                                    tVar2.t(i74);
                                                                    boolean h9 = tVar2.h();
                                                                    tVar2.s();
                                                                    tVar2.u(i78);
                                                                    tVar2.t(4);
                                                                    i110 = tVar2.i(4) + 8;
                                                                    tVar2.u(1);
                                                                    if (h9) {
                                                                        int i113 = tVar2.i(8);
                                                                        int i114 = tVar2.i(8);
                                                                        tVar2.u(1);
                                                                        boolean h10 = tVar2.h();
                                                                        int f8 = C0089g.f(i113);
                                                                        int i115 = h10 ? 1 : 2;
                                                                        i107 = C0089g.g(i114);
                                                                        i109 = i115;
                                                                        i108 = f8;
                                                                    }
                                                                    i112++;
                                                                    i111 = i110;
                                                                    i74 = 6;
                                                                    i78 = 11;
                                                                }
                                                                i100++;
                                                                i101 = i111;
                                                                i102 = i110;
                                                                i103 = i109;
                                                                i104 = i108;
                                                                i105 = i107;
                                                                i74 = 6;
                                                                i78 = 11;
                                                            }
                                                            str4 = "video/apv";
                                                            i36 = i102;
                                                            i38 = i103;
                                                            i39 = i104;
                                                            i45 = i105;
                                                            i12 = i73;
                                                            i35 = i101;
                                                        } else {
                                                            i11 = 8;
                                                            if (m8 == 1668246642 && i39 == -1 && i45 == -1) {
                                                                int m12 = uVar2.m();
                                                                if (m12 == 1852009592 || m12 == 1852009571) {
                                                                    int G6 = uVar2.G();
                                                                    int G7 = uVar2.G();
                                                                    uVar2.N(2);
                                                                    boolean z21 = m7 == 19 && (uVar2.z() & 128) != 0;
                                                                    i39 = C0089g.f(G6);
                                                                    i38 = z21 ? 1 : 2;
                                                                    i45 = C0089g.g(G7);
                                                                    i12 = i73;
                                                                    i35 = i71;
                                                                    i36 = i72;
                                                                } else {
                                                                    AbstractC0108a.s("BoxParsers", "Unsupported color type: " + X.e.d(m12));
                                                                }
                                                            }
                                                            i12 = i73;
                                                        }
                                                        i35 = i71;
                                                        i36 = i72;
                                                        i38 = i10;
                                                    }
                                                    i11 = 8;
                                                }
                                                i11 = 8;
                                            }
                                        }
                                    }
                                    i35 = i71;
                                    i36 = i72;
                                    i38 = i10;
                                }
                                i11 = 8;
                            }
                            i44 = i47 + m7;
                            i37 = i12;
                            i32 = i11;
                            m5 = i48;
                            m6 = i9;
                            str7 = str3;
                            str8 = str4;
                            cVar2 = cVar;
                            gVar2 = gVar;
                            b4 = 3;
                        }
                    }
                    i44 = i47 + m7;
                    i37 = i12;
                    i32 = i11;
                    m5 = i48;
                    m6 = i9;
                    str7 = str3;
                    str8 = str4;
                    cVar2 = cVar;
                    gVar2 = gVar;
                    b4 = 3;
                }
                int i116 = i35;
                int i117 = i36;
                i8 = m5;
                int i118 = i37;
                String str15 = str8;
                g gVar3 = gVar2;
                int i119 = i38;
                z4 = false;
                c4 = '\f';
                if (vVar != null) {
                    str2 = vVar.f321b;
                    str15 = "video/dolby-vision";
                } else {
                    str2 = str9;
                }
                if (str15 == null) {
                    str6 = str;
                    gVar2 = gVar3;
                } else {
                    C0096n c0096n = new C0096n();
                    c0096n.f2819a = Integer.toString(i6);
                    c0096n.f2831m = F.n(str15);
                    c0096n.f2828j = str2;
                    c0096n.f2836t = G4;
                    c0096n.f2837u = G5;
                    c0096n.v = i43;
                    c0096n.f2838w = i42;
                    c0096n.z = f4;
                    c0096n.f2840y = i33;
                    c0096n.f2806A = bArr2;
                    c0096n.f2807B = i118;
                    c0096n.f2832p = list;
                    c0096n.o = i41;
                    c0096n.f2809D = i40;
                    c0096n.f2833q = c0094l4;
                    str6 = str;
                    c0096n.f2822d = str6;
                    c0096n.f2808C = new C0089g(i39, i119, i45, byteBuffer != null ? byteBuffer.array() : null, i117, i116);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        c0096n.f2826h = O3.d.z(bVar2.f2396a);
                        c0096n.f2827i = O3.d.z(bVar2.f2397b);
                    } else {
                        d dVar2 = dVar;
                        if (dVar2 != null) {
                            c0096n.f2826h = O3.d.z(dVar2.f2407a);
                            c0096n.f2827i = O3.d.z(dVar2.f2408b);
                        }
                    }
                    gVar2 = gVar3;
                    gVar2.f2417d = new C0097o(c0096n);
                }
            } else {
                if (m6 == 1836069985 || m6 == 1701733217 || m6 == 1633889587 || m6 == 1700998451 || m6 == 1633889588 || m6 == 1835823201 || m6 == 1685353315 || m6 == 1685353317 || m6 == 1685353320 || m6 == 1685353324 || m6 == 1685353336 || m6 == 1935764850 || m6 == 1935767394 || m6 == 1819304813 || m6 == 1936684916 || m6 == 1953984371 || m6 == 778924082 || m6 == 778924083 || m6 == 1835557169 || m6 == 1835560241 || m6 == 1634492771 || m6 == 1634492791 || m6 == 1970037111 || m6 == 1332770163 || m6 == 1716281667 || m6 == 1767992678 || m6 == 1768973165 || m6 == 1718641517) {
                    uVar2 = uVar;
                    i31 = i31;
                    b(uVar2, m6, i31, m5, iVar2.f2423a, str6, z, c0094l, gVar2, i30);
                    str6 = str;
                } else if (m6 == 1414810956 || m6 == 1954034535 || m6 == 2004251764 || m6 == 1937010800 || m6 == 1664495672 || m6 == 1836070003) {
                    uVar2.M(i31 + 16);
                    String str16 = "application/ttml+xml";
                    long j6 = Long.MAX_VALUE;
                    if (m6 != 1414810956) {
                        if (m6 == 1954034535) {
                            int i120 = m5 - 16;
                            byte[] bArr10 = new byte[i120];
                            uVar2.k(bArr10, 0, i120);
                            a0Var = I.o(bArr10);
                            str16 = "application/x-quicktime-tx3g";
                            i28 = i31;
                        } else if (m6 == 2004251764) {
                            str16 = "application/x-mp4-vtt";
                        } else if (m6 == 1937010800) {
                            j6 = 0;
                        } else if (m6 == 1664495672) {
                            gVar2.f2415b = 1;
                            str16 = "application/x-mp4-cea-608";
                        } else {
                            if (m6 != 1836070003) {
                                throw new IllegalStateException();
                            }
                            int i121 = uVar2.f3352b;
                            uVar2.N(4);
                            if (uVar2.m() == 1702061171) {
                                byte[] bArr11 = (byte[]) c(i121, uVar2).f2410d;
                                if (bArr11 == null || bArr11.length != 64) {
                                    i28 = i31;
                                    z4 = false;
                                    c4 = '\f';
                                    uVar2 = uVar;
                                    i8 = m5;
                                    i4 = i30;
                                    i6 = i29;
                                    i7 = m4;
                                    i5 = i28;
                                } else {
                                    int i122 = iVar2.f2426d;
                                    int i123 = iVar2.f2427e;
                                    AbstractC0124a.t(bArr11.length == 64);
                                    ArrayList arrayList = new ArrayList(16);
                                    int i124 = 0;
                                    while (i124 < bArr11.length - 3) {
                                        byte[] bArr12 = bArr11;
                                        int n = O3.d.n(bArr11[i124], bArr11[i124 + 1], bArr11[i124 + 2], bArr12[i124 + 3]);
                                        int i125 = (n >> 16) & KotlinVersion.MAX_COMPONENT_VALUE;
                                        int i126 = ((n >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - 128;
                                        int i127 = (n & KotlinVersion.MAX_COMPONENT_VALUE) - 128;
                                        arrayList.add(String.format("%06x", Integer.valueOf(J.j(((i127 * 17790) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND) + i125, 0, KotlinVersion.MAX_COMPONENT_VALUE) | (J.j((i125 - ((i127 * 3455) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND)) - ((i126 * 7169) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (J.j(((i126 * 14075) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND) + i125, 0, KotlinVersion.MAX_COMPONENT_VALUE) << 16))));
                                        i124 += 4;
                                        bArr11 = bArr12;
                                        i31 = i31;
                                    }
                                    i28 = i31;
                                    String str17 = "size: " + i122 + "x" + i123 + "\npalette: " + new C3.v(", ").c(arrayList) + IOUtils.LINE_SEPARATOR_UNIX;
                                    String str18 = J.f3263a;
                                    a0Var = I.o(str17.getBytes(StandardCharsets.UTF_8));
                                    str5 = "application/vobsub";
                                }
                            } else {
                                i28 = i31;
                                str5 = null;
                                a0Var = null;
                            }
                            str16 = str5;
                        }
                        j4 = Long.MAX_VALUE;
                        if (str16 != null) {
                            C0096n c0096n2 = new C0096n();
                            c0096n2.f2819a = Integer.toString(i29);
                            c0096n2.f2831m = F.n(str16);
                            c0096n2.f2822d = str6;
                            c0096n2.f2834r = j4;
                            c0096n2.f2832p = a0Var;
                            gVar2.f2417d = new C0097o(c0096n2);
                        }
                        z4 = false;
                        c4 = '\f';
                        uVar2 = uVar;
                        i8 = m5;
                        i4 = i30;
                        i6 = i29;
                        i7 = m4;
                        i5 = i28;
                    }
                    i28 = i31;
                    j4 = j6;
                    a0Var = null;
                    if (str16 != null) {
                    }
                    z4 = false;
                    c4 = '\f';
                    uVar2 = uVar;
                    i8 = m5;
                    i4 = i30;
                    i6 = i29;
                    i7 = m4;
                    i5 = i28;
                } else if (m6 == 1835365492) {
                    uVar2.M(i31 + 16);
                    if (m6 == 1835365492) {
                        uVar2.u();
                        String u4 = uVar2.u();
                        if (u4 != null) {
                            C0096n c0096n3 = new C0096n();
                            c0096n3.f2819a = Integer.toString(i29);
                            c0096n3.f2831m = F.n(u4);
                            gVar2.f2417d = new C0097o(c0096n3);
                        }
                    }
                } else if (m6 == 1667329389) {
                    C0096n c0096n4 = new C0096n();
                    c0096n4.f2819a = Integer.toString(i29);
                    c0096n4.f2831m = F.n("application/x-camera-motion");
                    gVar2.f2417d = new C0097o(c0096n4);
                }
                i5 = i31;
                i8 = m5;
                i4 = i30;
                i6 = i29;
                i7 = m4;
                z4 = false;
                c4 = '\f';
            }
            uVar2.M(i5 + i8);
            i30 = i4 + 1;
            iVar2 = iVar;
            z5 = z4;
            i29 = i6;
            m4 = i7;
        }
        return gVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:392:0x00e5, code lost:
    
        if (r23 == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x09a5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x070d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList j(X.c cVar, y0.t tVar, long j4, C0094l c0094l, boolean z, boolean z4, u2.d dVar, boolean z5) {
        int i4;
        long j5;
        long j6;
        long j7;
        ArrayList arrayList;
        int i5;
        long j8;
        long j9;
        long U4;
        int i6;
        int i7;
        int i8;
        String str;
        X.d i9;
        long[] jArr;
        long[] jArr2;
        C0097o c0097o;
        C0097o c0097o2;
        u2.d dVar2;
        x xVar;
        X.c h2;
        Pair create;
        e eVar;
        boolean z6;
        int i10;
        int i11;
        int i12;
        boolean z7;
        ArrayList arrayList2;
        int i13;
        long[] jArr3;
        int[] iArr;
        int[] iArr2;
        int i14;
        int i15;
        long j10;
        boolean z8;
        int i16;
        long[] jArr4;
        int i17;
        long j11;
        int i18;
        long[] jArr5;
        long j12;
        long[] jArr6;
        ArrayList arrayList3;
        long j13;
        long j14;
        long[] jArr7;
        int i19;
        boolean z9;
        int i20;
        boolean z10;
        A a3;
        ArrayList arrayList4;
        boolean z11;
        int[] iArr3;
        long[] jArr8;
        int i21;
        A a4;
        long U5;
        X.c cVar2 = cVar;
        ArrayList arrayList5 = new ArrayList();
        int i22 = 0;
        for (ArrayList arrayList6 = cVar2.f3493e; i22 < arrayList6.size(); arrayList6 = arrayList) {
            X.c cVar3 = (X.c) arrayList6.get(i22);
            if (cVar3.f3496b != 1953653099) {
                arrayList = arrayList6;
                arrayList4 = arrayList5;
                i4 = i22;
            } else {
                X.d i23 = cVar2.i(1836476516);
                i23.getClass();
                X.c h4 = cVar3.h(1835297121);
                h4.getClass();
                X.d i24 = h4.i(1751411826);
                i24.getClass();
                W.u uVar = i24.f3494c;
                uVar.M(16);
                int m4 = uVar.m();
                int i25 = m4 == 1936684398 ? 1 : m4 == 1986618469 ? 2 : (m4 == 1952807028 || m4 == 1935832172 || m4 == 1937072756 || m4 == 1668047728 || m4 == 1937072752) ? 3 : m4 == 1835365473 ? 5 : -1;
                int i26 = 1;
                i4 = i22;
                if (i25 == -1) {
                    arrayList = arrayList6;
                    xVar = null;
                    j5 = 0;
                    dVar2 = dVar;
                } else {
                    j5 = 0;
                    X.d i27 = cVar3.i(1953196132);
                    i27.getClass();
                    W.u uVar2 = i27.f3494c;
                    uVar2.M(8);
                    int e4 = e(uVar2.m());
                    uVar2.N(e4 != 0 ? 16 : 8);
                    int m5 = uVar2.m();
                    uVar2.N(4);
                    int i28 = uVar2.f3352b;
                    int i29 = e4 == 0 ? 4 : 8;
                    int i30 = 0;
                    while (true) {
                        j6 = -9223372036854775807L;
                        if (i30 >= i29) {
                            uVar2.N(i29);
                            break;
                        }
                        if (uVar2.f3351a[i28 + i30] != -1) {
                            j7 = e4 == 0 ? uVar2.B() : uVar2.F();
                        } else {
                            i30++;
                        }
                    }
                    j7 = -9223372036854775807L;
                    uVar2.N(10);
                    int G4 = uVar2.G();
                    uVar2.N(4);
                    int m6 = uVar2.m();
                    int m7 = uVar2.m();
                    uVar2.N(4);
                    int m8 = uVar2.m();
                    int m9 = uVar2.m();
                    if (m6 == 0 && m7 == 65536) {
                        arrayList = arrayList6;
                        if ((m8 == -65536 || m8 == 65536) && m9 == 0) {
                            i5 = 90;
                            uVar2.N(16);
                            short w4 = uVar2.w();
                            uVar2.N(2);
                            short w5 = uVar2.w();
                            i iVar = new i();
                            iVar.f2423a = m5;
                            iVar.f2424b = G4;
                            iVar.f2425c = i5;
                            iVar.f2426d = w4;
                            iVar.f2427e = w5;
                            j8 = j4 != -9223372036854775807L ? j7 : j4;
                            long j15 = g(i23.f3494c).f3501c;
                            if (j8 != -9223372036854775807L) {
                                j9 = j15;
                                U4 = -9223372036854775807L;
                            } else {
                                String str2 = J.f3263a;
                                j9 = j15;
                                U4 = J.U(j8, 1000000L, j9, RoundingMode.DOWN);
                            }
                            X.c h5 = h4.h(1835626086);
                            h5.getClass();
                            X.c h6 = h5.h(1937007212);
                            h6.getClass();
                            X.d i31 = h4.i(1835296868);
                            i31.getClass();
                            W.u uVar3 = i31.f3494c;
                            uVar3.M(8);
                            int e5 = e(uVar3.m());
                            uVar3.N(e5 != 0 ? 8 : 16);
                            long B4 = uVar3.B();
                            int i32 = uVar3.f3352b;
                            i6 = e5 != 0 ? 4 : 8;
                            i7 = 0;
                            while (true) {
                                if (i7 < i6) {
                                    uVar3.N(i6);
                                    break;
                                }
                                if (uVar3.f3351a[i32 + i7] != -1) {
                                    long B5 = e5 == 0 ? uVar3.B() : uVar3.F();
                                    if (B5 != 0) {
                                        String str3 = J.f3263a;
                                        j6 = J.U(B5, 1000000L, B4, RoundingMode.DOWN);
                                    }
                                } else {
                                    i7++;
                                }
                            }
                            long j16 = j6;
                            int G5 = uVar3.G();
                            char[] cArr = {(char) (((G5 >> 10) & 31) + 96), (char) (((G5 >> 5) & 31) + 96), (char) ((G5 & 31) + 96)};
                            for (i8 = 0; i8 < 3; i8++) {
                                char c4 = cArr[i8];
                                if (c4 < 'a' || c4 > 'z') {
                                    str = null;
                                    break;
                                }
                            }
                            str = new String(cArr);
                            i9 = h6.i(1937011556);
                            if (i9 != null) {
                                AbstractC0108a.s("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                            } else {
                                g i33 = i(i9.f3494c, iVar, str, c0094l, z4);
                                if (!z && (h2 = cVar3.h(1701082227)) != null) {
                                    X.d i34 = h2.i(1701606260);
                                    if (i34 == null) {
                                        create = null;
                                    } else {
                                        W.u uVar4 = i34.f3494c;
                                        uVar4.M(8);
                                        int e6 = e(uVar4.m());
                                        int D3 = uVar4.D();
                                        long[] jArr9 = new long[D3];
                                        long[] jArr10 = new long[D3];
                                        int i35 = 0;
                                        while (i35 < D3) {
                                            int i36 = i26;
                                            jArr9[i35] = e6 == i36 ? uVar4.F() : uVar4.B();
                                            jArr10[i35] = e6 == i36 ? uVar4.t() : uVar4.m();
                                            if (uVar4.w() != 1) {
                                                throw new IllegalArgumentException("Unsupported media rate.");
                                            }
                                            uVar4.N(2);
                                            i35++;
                                            i26 = 1;
                                        }
                                        create = Pair.create(jArr9, jArr10);
                                    }
                                    if (create != null) {
                                        long[] jArr11 = (long[]) create.first;
                                        jArr2 = (long[]) create.second;
                                        jArr = jArr11;
                                        c0097o = (C0097o) i33.f2417d;
                                        if (c0097o != null) {
                                            int i37 = iVar.f2424b;
                                            if (i37 != 0) {
                                                X.b bVar = new X.b(i37);
                                                C0096n a5 = c0097o.a();
                                                E e7 = ((C0097o) i33.f2417d).f2867l;
                                                a5.f2829k = e7 != null ? e7.a(bVar) : new E(bVar);
                                                c0097o2 = new C0097o(a5);
                                            } else {
                                                c0097o2 = c0097o;
                                            }
                                            dVar2 = dVar;
                                            xVar = new x(iVar.f2423a, i25, B4, j9, U4, j16, c0097o2, i33.f2415b, (y[]) i33.f2416c, i33.f2414a, jArr, jArr2);
                                        }
                                    }
                                }
                                jArr = null;
                                jArr2 = null;
                                c0097o = (C0097o) i33.f2417d;
                                if (c0097o != null) {
                                }
                            }
                            dVar2 = dVar;
                            xVar = null;
                        }
                    } else {
                        arrayList = arrayList6;
                    }
                    i5 = (m6 == 0 && m7 == -65536 && (m8 == 65536 || m8 == -65536) && m9 == 0) ? 270 : ((m6 == -65536 || m6 == 65536) && m7 == 0 && m8 == 0 && m9 == -65536) ? 180 : 0;
                    uVar2.N(16);
                    short w42 = uVar2.w();
                    uVar2.N(2);
                    short w52 = uVar2.w();
                    i iVar2 = new i();
                    iVar2.f2423a = m5;
                    iVar2.f2424b = G4;
                    iVar2.f2425c = i5;
                    iVar2.f2426d = w42;
                    iVar2.f2427e = w52;
                    if (j4 != -9223372036854775807L) {
                    }
                    long j152 = g(i23.f3494c).f3501c;
                    if (j8 != -9223372036854775807L) {
                    }
                    X.c h52 = h4.h(1835626086);
                    h52.getClass();
                    X.c h62 = h52.h(1937007212);
                    h62.getClass();
                    X.d i312 = h4.i(1835296868);
                    i312.getClass();
                    W.u uVar32 = i312.f3494c;
                    uVar32.M(8);
                    int e52 = e(uVar32.m());
                    uVar32.N(e52 != 0 ? 8 : 16);
                    long B42 = uVar32.B();
                    int i322 = uVar32.f3352b;
                    if (e52 != 0) {
                    }
                    i7 = 0;
                    while (true) {
                        if (i7 < i6) {
                        }
                        i7++;
                    }
                    long j162 = j6;
                    int G52 = uVar32.G();
                    char[] cArr2 = {(char) (((G52 >> 10) & 31) + 96), (char) (((G52 >> 5) & 31) + 96), (char) ((G52 & 31) + 96)};
                    while (i8 < 3) {
                    }
                    str = new String(cArr2);
                    i9 = h62.i(1937011556);
                    if (i9 != null) {
                    }
                    dVar2 = dVar;
                    xVar = null;
                }
                x xVar2 = (x) dVar2.apply(xVar);
                if (xVar2 == null) {
                    arrayList4 = arrayList5;
                } else {
                    C0097o c0097o3 = xVar2.f2543g;
                    X.c h7 = cVar3.h(1835297121);
                    h7.getClass();
                    X.c h8 = h7.h(1835626086);
                    h8.getClass();
                    X.c h9 = h8.h(1937007212);
                    h9.getClass();
                    X.d i38 = h9.i(1937011578);
                    if (i38 != null) {
                        eVar = new N3.A(i38, c0097o3);
                    } else {
                        X.d i39 = h9.i(1937013298);
                        if (i39 == null) {
                            throw G.a(null, "Track has no sample table size information");
                        }
                        h hVar = new h();
                        W.u uVar5 = i39.f3494c;
                        hVar.f2422e = uVar5;
                        uVar5.M(12);
                        hVar.f2419b = uVar5.D() & KotlinVersion.MAX_COMPONENT_VALUE;
                        hVar.f2418a = uVar5.D();
                        eVar = hVar;
                    }
                    int b4 = eVar.b();
                    if (b4 == 0) {
                        arrayList4 = arrayList5;
                        a3 = new A(xVar2, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (xVar2.f2538b == 2) {
                            long j17 = xVar2.f2542f;
                            if (j17 > j5) {
                                C0096n a6 = c0097o3.a();
                                a6.f2839x = b4 / (j17 / 1000000.0f);
                                xVar2 = xVar2.a(new C0097o(a6));
                            }
                        }
                        C0097o c0097o4 = xVar2.f2543g;
                        X.d i40 = h9.i(1937007471);
                        if (i40 == null) {
                            i40 = h9.i(1668232756);
                            i40.getClass();
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        W.u uVar6 = i40.f3494c;
                        X.d i41 = h9.i(1937011555);
                        i41.getClass();
                        W.u uVar7 = i41.f3494c;
                        X.d i42 = h9.i(1937011827);
                        i42.getClass();
                        W.u uVar8 = i42.f3494c;
                        X.d i43 = h9.i(1937011571);
                        W.u uVar9 = i43 != null ? i43.f3494c : null;
                        X.d i44 = h9.i(1668576371);
                        W.u uVar10 = i44 != null ? i44.f3494c : null;
                        c cVar4 = new c(uVar7, uVar6, z6);
                        uVar8.M(12);
                        int D4 = uVar8.D() - 1;
                        int D5 = uVar8.D();
                        int D6 = uVar8.D();
                        if (uVar10 != null) {
                            uVar10.M(12);
                            i10 = uVar10.D();
                        } else {
                            i10 = 0;
                        }
                        if (uVar9 != null) {
                            uVar9.M(12);
                            i11 = uVar9.D();
                            if (i11 > 0) {
                                i12 = uVar9.D() - 1;
                                int a7 = eVar.a();
                                W.u uVar11 = uVar10;
                                String str4 = c0097o4.n;
                                z7 = a7 == -1 && ("audio/raw".equals(str4) || "audio/g711-mlaw".equals(str4) || "audio/g711-alaw".equals(str4)) && D4 == 0 && i10 == 0 && i11 == 0;
                                ArrayList arrayList7 = new ArrayList();
                                boolean z12 = uVar9 != null;
                                if (z7) {
                                    long[] jArr12 = z5 ? new long[0] : new long[b4];
                                    int i45 = i11;
                                    int[] iArr4 = z5 ? new int[0] : new int[b4];
                                    e eVar2 = eVar;
                                    long[] jArr13 = z5 ? new long[0] : new long[b4];
                                    int[] iArr5 = z5 ? new int[0] : new int[b4];
                                    arrayList2 = arrayList5;
                                    int i46 = i10;
                                    int i47 = i45;
                                    int i48 = D4;
                                    long j18 = j5;
                                    long j19 = j18;
                                    long j20 = j19;
                                    int i49 = 0;
                                    int i50 = 0;
                                    int i51 = 0;
                                    int i52 = 0;
                                    int i53 = D6;
                                    int i54 = D5;
                                    int i55 = i12;
                                    W.u uVar12 = uVar9;
                                    int i56 = 0;
                                    while (true) {
                                        if (i56 >= b4) {
                                            i13 = i47;
                                            jArr3 = jArr13;
                                            iArr = iArr5;
                                            iArr2 = iArr4;
                                            i14 = i50;
                                            i15 = i51;
                                            break;
                                        }
                                        boolean z13 = true;
                                        while (i51 == 0) {
                                            z13 = cVar4.a();
                                            if (!z13) {
                                                break;
                                            }
                                            j20 = cVar4.f2401d;
                                            i51 = cVar4.f2400c;
                                            i47 = i47;
                                            i50 = i50;
                                        }
                                        int i57 = i50;
                                        i13 = i47;
                                        if (z13) {
                                            i50 = i57;
                                            if (uVar11 != null) {
                                                while (i52 == 0 && i46 > 0) {
                                                    i52 = uVar11.D();
                                                    i50 = uVar11.m();
                                                    i46--;
                                                }
                                                i52--;
                                            }
                                            int c5 = eVar2.c();
                                            int i58 = b4;
                                            int[] iArr6 = iArr4;
                                            long j21 = c5;
                                            j19 += j21;
                                            if (c5 > i49) {
                                                i49 = c5;
                                            }
                                            if (z5) {
                                                i18 = i49;
                                                jArr5 = jArr12;
                                            } else {
                                                jArr12[i56] = j20;
                                                iArr6[i56] = c5;
                                                i18 = i49;
                                                jArr5 = jArr12;
                                                jArr13[i56] = j18 + i50;
                                                iArr5[i56] = uVar12 == null ? 1 : 0;
                                                if (i56 == i55) {
                                                    iArr5[i56] = 1;
                                                    arrayList7.add(Integer.valueOf(i56));
                                                }
                                            }
                                            if (uVar12 != null && i56 == i55) {
                                                int i59 = i13 - 1;
                                                if (i59 > 0) {
                                                    i13 = i59;
                                                    i55 = uVar12.D() - 1;
                                                } else {
                                                    i13 = i59;
                                                }
                                            }
                                            j18 += i53;
                                            i54--;
                                            if (i54 == 0 && i48 > 0) {
                                                i48--;
                                                i54 = uVar8.D();
                                                i53 = uVar8.m();
                                            }
                                            j20 += j21;
                                            i51--;
                                            i56++;
                                            jArr12 = jArr5;
                                            b4 = i58;
                                            i47 = i13;
                                            i49 = i18;
                                            iArr4 = iArr6;
                                        } else {
                                            AbstractC0108a.s("BoxParsers", "Unexpected end of chunk data");
                                            if (z5) {
                                                iArr2 = iArr4;
                                                iArr = iArr5;
                                                b4 = i56;
                                                i15 = i51;
                                                i14 = i57;
                                                jArr3 = jArr13;
                                            } else {
                                                jArr12 = Arrays.copyOf(jArr12, i56);
                                                int[] copyOf = Arrays.copyOf(iArr4, i56);
                                                long[] copyOf2 = Arrays.copyOf(jArr13, i56);
                                                iArr2 = copyOf;
                                                iArr = Arrays.copyOf(iArr5, i56);
                                                b4 = i56;
                                                i15 = i51;
                                                jArr3 = copyOf2;
                                                i14 = i57;
                                            }
                                        }
                                    }
                                    j10 = j18 + i14;
                                    if (uVar11 != null) {
                                        while (i46 > 0) {
                                            if (uVar11.D() != 0) {
                                                z8 = false;
                                                break;
                                            }
                                            uVar11.m();
                                            i46--;
                                        }
                                    }
                                    z8 = true;
                                    if (i13 != 0 || i54 != 0 || i15 != 0 || i48 != 0 || i52 != 0 || !z8) {
                                        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                        sb.append(xVar2.f2537a);
                                        sb.append(": remainingSynchronizationSamples ");
                                        sb.append(i13);
                                        sb.append(", remainingSamplesAtTimestampDelta ");
                                        sb.append(i54);
                                        sb.append(", remainingSamplesInChunk ");
                                        sb.append(i15);
                                        sb.append(", remainingTimestampDeltaChanges ");
                                        sb.append(i48);
                                        sb.append(", remainingSamplesAtTimestampOffset ");
                                        sb.append(i52);
                                        sb.append(!z8 ? ", ctts invalid" : "");
                                        AbstractC0108a.s("BoxParsers", sb.toString());
                                    }
                                    i16 = i49;
                                    jArr4 = jArr12;
                                    i17 = b4;
                                    j11 = j19;
                                } else {
                                    int i60 = cVar4.f2398a;
                                    long[] jArr14 = new long[i60];
                                    int[] iArr7 = new int[i60];
                                    while (cVar4.a()) {
                                        int i61 = cVar4.f2399b;
                                        jArr14[i61] = cVar4.f2401d;
                                        iArr7[i61] = cVar4.f2400c;
                                    }
                                    long j22 = D6;
                                    int i62 = 8192 / a7;
                                    int i63 = 0;
                                    for (int i64 = 0; i64 < i60; i64++) {
                                        i63 += J.g(iArr7[i64], i62);
                                    }
                                    long[] jArr15 = new long[i63];
                                    iArr2 = new int[i63];
                                    jArr3 = new long[i63];
                                    iArr = new int[i63];
                                    int i65 = 0;
                                    int i66 = 0;
                                    int i67 = 0;
                                    int i68 = 0;
                                    int i69 = 0;
                                    while (i65 < i60) {
                                        int i70 = iArr7[i65];
                                        long j23 = jArr14[i65];
                                        int i71 = i69;
                                        int i72 = i65;
                                        int i73 = i68;
                                        int i74 = i71;
                                        int i75 = i60;
                                        int i76 = i70;
                                        while (i76 > 0) {
                                            int min = Math.min(i62, i76);
                                            jArr15[i74] = j23;
                                            int i77 = i76;
                                            int i78 = a7 * min;
                                            iArr2[i74] = i78;
                                            i73 = Math.max(i73, i78);
                                            long j24 = j22;
                                            jArr3[i74] = j24 * i66;
                                            iArr[i74] = 1;
                                            j23 += iArr2[i74];
                                            i66 += min;
                                            i74++;
                                            i67 += i78;
                                            i76 = i77 - min;
                                            j22 = j24;
                                        }
                                        int i79 = i72 + 1;
                                        i69 = i74;
                                        i68 = i73;
                                        i65 = i79;
                                        i60 = i75;
                                    }
                                    j10 = i66 * j22;
                                    j11 = i67;
                                    if (z5) {
                                        jArr15 = new long[0];
                                    }
                                    if (z5) {
                                        iArr2 = new int[0];
                                    }
                                    if (z5) {
                                        jArr3 = new long[0];
                                    }
                                    if (z5) {
                                        iArr = new int[0];
                                    }
                                    arrayList2 = arrayList5;
                                    jArr4 = jArr15;
                                    i17 = i63;
                                    i16 = i68;
                                }
                                int[] iArr8 = iArr2;
                                long[] jArr16 = jArr3;
                                int[] iArr9 = iArr;
                                j12 = xVar2.f2542f;
                                if (j12 > j5) {
                                    long U6 = J.U(j11 * 8, 1000000L, j12, RoundingMode.HALF_DOWN);
                                    if (U6 > j5 && U6 < 2147483647L) {
                                        C0096n a8 = c0097o4.a();
                                        a8.f2826h = (int) U6;
                                        xVar2 = xVar2.a(new C0097o(a8));
                                    }
                                }
                                int i80 = xVar2.f2538b;
                                long j25 = xVar2.f2539c;
                                C0097o c0097o5 = xVar2.f2543g;
                                long[] jArr17 = xVar2.f2546j;
                                jArr6 = xVar2.f2545i;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                long U7 = J.U(j10, 1000000L, j25, roundingMode);
                                int[] F4 = O3.d.F(arrayList7);
                                if (jArr6 != null) {
                                    if (!z5) {
                                        J.T(jArr16, j25);
                                    }
                                    a4 = new A(xVar2, jArr4, iArr8, i16, jArr16, iArr9, F4, z12, U7, i17);
                                } else if (z5) {
                                    jArr17.getClass();
                                    if (jArr6.length == 1 && jArr6[0] == j5) {
                                        U5 = J.U(j10 - jArr17[0], 1000000L, xVar2.f2539c, roundingMode);
                                    } else {
                                        long j26 = j5;
                                        for (int i81 = 0; i81 < jArr6.length; i81++) {
                                            if (jArr17[i81] != -1) {
                                                j26 += jArr6[i81];
                                            }
                                        }
                                        U5 = J.U(j26, 1000000L, xVar2.f2540d, RoundingMode.DOWN);
                                    }
                                    a4 = new A(xVar2, jArr4, iArr8, i16, jArr16, iArr9, F4, z12, U5, i17);
                                } else {
                                    if (jArr6.length == 1 && i80 == 1 && jArr16.length >= 2) {
                                        jArr17.getClass();
                                        long j27 = jArr17[0];
                                        j14 = -1;
                                        arrayList3 = arrayList7;
                                        long U8 = j27 + J.U(jArr6[0], xVar2.f2539c, xVar2.f2540d, roundingMode);
                                        int length = jArr16.length - 1;
                                        if (jArr16[0] <= j27 && j27 < jArr16[J.j(4, 0, length)] && jArr16[J.j(jArr16.length + (-4), 0, length)] < U8 && U8 <= 2 + j10) {
                                            long max = Math.max(j5, j10 - U8);
                                            long U9 = J.U(j27 - jArr16[0], c0097o5.f2847G, xVar2.f2539c, roundingMode);
                                            j13 = j10;
                                            jArr7 = jArr17;
                                            long U10 = J.U(max, c0097o5.f2847G, xVar2.f2539c, roundingMode);
                                            if (!(U9 == j5 && U10 == j5) && U9 <= 2147483647L && U10 <= 2147483647L) {
                                                tVar.f16197a = (int) U9;
                                                tVar.f16198b = (int) U10;
                                                J.T(jArr16, j25);
                                                a4 = new A(xVar2, jArr4, iArr8, i16, jArr16, iArr9, F4, z12, J.U(jArr6[0], 1000000L, xVar2.f2540d, roundingMode), i17);
                                            } else if (jArr6.length == 1 || jArr6[0] != 0) {
                                                long[] jArr18 = jArr4;
                                                int i82 = i17;
                                                boolean z14 = i80 != 1;
                                                int[] iArr10 = new int[jArr6.length];
                                                int[] iArr11 = new int[jArr6.length];
                                                jArr7.getClass();
                                                ArrayList arrayList8 = arrayList3;
                                                int i83 = 0;
                                                int i84 = 0;
                                                i19 = 0;
                                                boolean z15 = false;
                                                while (i19 < jArr6.length) {
                                                    int[] iArr12 = iArr11;
                                                    int i85 = i19;
                                                    long j28 = jArr7[i85];
                                                    if (j28 != j14) {
                                                        jArr8 = jArr7;
                                                        boolean z16 = z15;
                                                        long U11 = J.U(jArr6[i85], xVar2.f2539c, xVar2.f2540d, RoundingMode.DOWN) + j28;
                                                        iArr3 = iArr12;
                                                        iArr10[i85] = J.f(jArr16, j28, true);
                                                        int b5 = J.b(jArr16, U11, z14);
                                                        z11 = z14;
                                                        int i86 = b5 - 1;
                                                        int i87 = 0;
                                                        for (int i88 = b5; i88 < jArr16.length; i88++) {
                                                            if (jArr16[i88] >= U11) {
                                                                i87++;
                                                                if (i87 > c0097o5.f2869p) {
                                                                    break;
                                                                }
                                                            } else {
                                                                i86 = i88;
                                                            }
                                                        }
                                                        iArr3[i85] = i86 + 1;
                                                        int i89 = iArr10[i85];
                                                        while (true) {
                                                            i21 = iArr10[i85];
                                                            if (i21 <= 0 || (iArr9[i21] & 1) != 0) {
                                                                break;
                                                            }
                                                            iArr10[i85] = i21 - 1;
                                                        }
                                                        if (i21 == 0 && (iArr9[0] & 1) == 0) {
                                                            iArr10[i85] = i89;
                                                            while (true) {
                                                                int i90 = iArr10[i85];
                                                                if (i90 >= iArr3[i85] || (iArr9[i90] & 1) != 0) {
                                                                    break;
                                                                }
                                                                iArr10[i85] = i90 + 1;
                                                            }
                                                        }
                                                        int i91 = iArr3[i85];
                                                        int i92 = iArr10[i85];
                                                        int i93 = (i91 - i92) + i83;
                                                        z15 = z16 | (i84 != i92);
                                                        i84 = i91;
                                                        i83 = i93;
                                                    } else {
                                                        z11 = z14;
                                                        iArr3 = iArr12;
                                                        jArr8 = jArr7;
                                                    }
                                                    i19 = i85 + 1;
                                                    jArr7 = jArr8;
                                                    iArr11 = iArr3;
                                                    z14 = z11;
                                                }
                                                int[] iArr13 = iArr11;
                                                long[] jArr19 = jArr7;
                                                z9 = z15 | (i83 == i82);
                                                long[] jArr20 = !z9 ? new long[i83] : jArr18;
                                                int[] iArr14 = !z9 ? new int[i83] : iArr8;
                                                if (z9) {
                                                    i16 = 0;
                                                }
                                                int[] iArr15 = !z9 ? new int[i83] : iArr9;
                                                ArrayList arrayList9 = !z9 ? new ArrayList() : arrayList8;
                                                long[] jArr21 = new long[i83];
                                                i20 = 0;
                                                z10 = false;
                                                int i94 = 0;
                                                long j29 = 0;
                                                while (i20 < jArr6.length) {
                                                    long j30 = jArr19[i20];
                                                    int i95 = iArr10[i20];
                                                    boolean z17 = z9;
                                                    int i96 = iArr13[i20];
                                                    C0097o c0097o6 = c0097o5;
                                                    if (z17) {
                                                        int i97 = i96 - i95;
                                                        System.arraycopy(jArr18, i95, jArr20, i94, i97);
                                                        System.arraycopy(iArr8, i95, iArr14, i94, i97);
                                                        System.arraycopy(iArr9, i95, iArr15, i94, i97);
                                                    }
                                                    int i98 = i16;
                                                    while (i95 < i96) {
                                                        int i99 = i95;
                                                        int i100 = i96;
                                                        long j31 = xVar2.f2540d;
                                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                        long U12 = J.U(j29, 1000000L, j31, roundingMode2);
                                                        long U13 = J.U(jArr16[i99] - j30, 1000000L, xVar2.f2539c, roundingMode2);
                                                        if (U13 < 0) {
                                                            z10 = true;
                                                        }
                                                        jArr21[i94] = U12 + U13;
                                                        if (z17 && iArr14[i94] > i98) {
                                                            i98 = iArr8[i99];
                                                        }
                                                        if (z17 && !z12 && (iArr15[i94] & 1) != 0) {
                                                            arrayList9.add(Integer.valueOf(i94));
                                                        }
                                                        i94++;
                                                        i95 = i99 + 1;
                                                        i96 = i100;
                                                    }
                                                    j29 += jArr6[i20];
                                                    i20++;
                                                    i16 = i98;
                                                    z9 = z17;
                                                    c0097o5 = c0097o6;
                                                }
                                                C0097o c0097o7 = c0097o5;
                                                long U14 = J.U(j29, 1000000L, xVar2.f2540d, RoundingMode.DOWN);
                                                if (z10) {
                                                    C0096n a9 = c0097o7.a();
                                                    a9.f2835s = true;
                                                    xVar2 = xVar2.a(new C0097o(a9));
                                                }
                                                a3 = new A(xVar2, jArr20, iArr14, i16, jArr21, iArr15, O3.d.F(arrayList9), z12, U14, jArr20.length);
                                                arrayList4 = arrayList2;
                                                arrayList4.add(a3);
                                            } else {
                                                jArr7.getClass();
                                                long j32 = jArr7[0];
                                                for (int i101 = 0; i101 < jArr16.length; i101++) {
                                                    jArr16[i101] = J.U(jArr16[i101] - j32, 1000000L, xVar2.f2539c, RoundingMode.DOWN);
                                                }
                                                a4 = new A(xVar2, jArr4, iArr8, i16, jArr16, iArr9, F4, z12, J.U(j13 - j32, 1000000L, xVar2.f2539c, RoundingMode.DOWN), i17);
                                            }
                                        } else {
                                            j13 = j10;
                                        }
                                    } else {
                                        arrayList3 = arrayList7;
                                        j13 = j10;
                                        j14 = -1;
                                    }
                                    jArr7 = jArr17;
                                    if (jArr6.length == 1) {
                                    }
                                    long[] jArr182 = jArr4;
                                    int i822 = i17;
                                    if (i80 != 1) {
                                    }
                                    int[] iArr102 = new int[jArr6.length];
                                    int[] iArr112 = new int[jArr6.length];
                                    jArr7.getClass();
                                    ArrayList arrayList82 = arrayList3;
                                    int i832 = 0;
                                    int i842 = 0;
                                    i19 = 0;
                                    boolean z152 = false;
                                    while (i19 < jArr6.length) {
                                    }
                                    int[] iArr132 = iArr112;
                                    long[] jArr192 = jArr7;
                                    z9 = z152 | (i832 == i822);
                                    if (!z9) {
                                    }
                                    if (!z9) {
                                    }
                                    if (z9) {
                                    }
                                    if (!z9) {
                                    }
                                    if (!z9) {
                                    }
                                    long[] jArr212 = new long[i832];
                                    i20 = 0;
                                    z10 = false;
                                    int i942 = 0;
                                    long j292 = 0;
                                    while (i20 < jArr6.length) {
                                    }
                                    C0097o c0097o72 = c0097o5;
                                    long U142 = J.U(j292, 1000000L, xVar2.f2540d, RoundingMode.DOWN);
                                    if (z10) {
                                    }
                                    a3 = new A(xVar2, jArr20, iArr14, i16, jArr212, iArr15, O3.d.F(arrayList9), z12, U142, jArr20.length);
                                    arrayList4 = arrayList2;
                                    arrayList4.add(a3);
                                }
                                a3 = a4;
                                arrayList4 = arrayList2;
                            } else {
                                uVar9 = null;
                            }
                        } else {
                            i11 = 0;
                        }
                        i12 = -1;
                        int a72 = eVar.a();
                        W.u uVar112 = uVar10;
                        String str42 = c0097o4.n;
                        if (a72 == -1) {
                        }
                        ArrayList arrayList72 = new ArrayList();
                        if (uVar9 != null) {
                        }
                        if (z7) {
                        }
                        int[] iArr82 = iArr2;
                        long[] jArr162 = jArr3;
                        int[] iArr92 = iArr;
                        j12 = xVar2.f2542f;
                        if (j12 > j5) {
                        }
                        int i802 = xVar2.f2538b;
                        long j252 = xVar2.f2539c;
                        C0097o c0097o52 = xVar2.f2543g;
                        long[] jArr172 = xVar2.f2546j;
                        jArr6 = xVar2.f2545i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        long U72 = J.U(j10, 1000000L, j252, roundingMode3);
                        int[] F42 = O3.d.F(arrayList72);
                        if (jArr6 != null) {
                        }
                        a3 = a4;
                        arrayList4 = arrayList2;
                    }
                    arrayList4.add(a3);
                }
            }
            i22 = i4 + 1;
            cVar2 = cVar;
            arrayList5 = arrayList4;
        }
        return arrayList5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019a, code lost:
    
        r1.M(r9);
        r1.N(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ad, code lost:
    
        r9 = new M0.k(r0, r8, r1.v(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024c, code lost:
    
        W.AbstractC0108a.d("MetadataUtil", "Skipped unknown metadata entry: " + X.e.d(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025f, code lost:
    
        r1.M(r15);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0077, code lost:
    
        r0 = M0.j.a(S0.w.g(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0080, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0082, code lost:
    
        r9 = new M0.n("TCON", r12, v2.I.o(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x008c, code lost:
    
        W.AbstractC0108a.s("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0091, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027f, code lost:
    
        r1.M(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0282, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b9, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c0, code lost:
    
        if (r0 != 6516084) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c2, code lost:
    
        r9 = S0.w.d(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ca, code lost:
    
        if (r0 == 7233901) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01cf, code lost:
    
        if (r0 != 7631467) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d6, code lost:
    
        if (r0 == 6516589) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01db, code lost:
    
        if (r0 != 7828084) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01e2, code lost:
    
        if (r0 != 6578553) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01e4, code lost:
    
        r9 = S0.w.j(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ee, code lost:
    
        if (r0 != 4280916) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f0, code lost:
    
        r9 = S0.w.j(r13, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01fa, code lost:
    
        if (r0 != 7630703) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.M(r7);
        r7 = r7 + r13;
        r1.N(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01fc, code lost:
    
        r9 = S0.w.j(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0206, code lost:
    
        if (r0 != 6384738) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0208, code lost:
    
        r9 = S0.w.j(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0212, code lost:
    
        if (r0 != 7108978) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0214, code lost:
    
        r9 = S0.w.j(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x021e, code lost:
    
        if (r0 != 6776174) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0220, code lost:
    
        r9 = S0.w.j(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.f3352b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0228, code lost:
    
        if (r0 != 6779504) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x022a, code lost:
    
        r9 = S0.w.j(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0234, code lost:
    
        if (r0 != 7173742) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0236, code lost:
    
        r9 = S0.w.j(r13, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0241, code lost:
    
        if (r0 != 7173737) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0243, code lost:
    
        r9 = S0.w.h(r13, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0264, code lost:
    
        r9 = S0.w.j(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x026c, code lost:
    
        r9 = S0.w.j(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0287, code lost:
    
        if (r6.isEmpty() == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x028b, code lost:
    
        r12 = new T.E(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r15 = r1.m() + r13;
        r13 = r1.m();
        r0 = (r13 >> 24) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r0 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r13 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r13 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r9 = S0.w.f(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        r1.M(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0274, code lost:
    
        if (r9 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0276, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0279, code lost:
    
        r3 = false;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        r9 = S0.w.f(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r9 = S0.w.h(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r9 = S0.w.h(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        r9 = S0.w.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        r9 = S0.w.j(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        r9 = S0.w.j(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        r9 = S0.w.j(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r9 = S0.w.j(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        r9 = S0.w.j(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
    
        r9 = S0.w.j(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        r9 = S0.w.h(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        r9 = S0.w.h(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        r9 = S0.w.j(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0148, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
    
        r9 = S0.w.j(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
    
        if (r13 != 757935405) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0157, code lost:
    
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        r13 = r1.f3352b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
    
        if (r13 >= r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015f, code lost:
    
        r14 = r1.m();
        r12 = r1.m();
        r1.N(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016e, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0170, code lost:
    
        r0 = r1.v(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017a, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017c, code lost:
    
        r8 = r1.v(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0186, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0188, code lost:
    
        r9 = r13;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018a, code lost:
    
        r1.N(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0192, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:
    
        if (r8 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0197, code lost:
    
        if (r9 != (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b0, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b1, code lost:
    
        r1.M(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static E k(X.d dVar) {
        int i4;
        boolean z;
        E e4;
        E e5;
        int i5;
        W.u uVar = dVar.f3494c;
        int i6 = 8;
        uVar.M(8);
        boolean z4 = false;
        E e6 = new E(new D[0]);
        while (uVar.a() >= i6) {
            int i7 = uVar.f3352b;
            int m4 = uVar.m();
            int m5 = uVar.m();
            String str = null;
            if (m5 == 1835365473) {
                uVar.M(i7);
                int i8 = i7 + m4;
                uVar.N(i6);
                a(uVar);
                while (true) {
                    int i9 = uVar.f3352b;
                    if (i9 >= i8) {
                        break;
                    }
                    int m6 = uVar.m();
                    if (uVar.m() == 1768715124) {
                        break;
                    }
                    uVar.M(i9 + m6);
                    i6 = 8;
                    z4 = false;
                    str = null;
                }
                E e7 = null;
                e6 = e6.b(e7);
                i4 = 8;
            } else if (m5 == 1936553057) {
                uVar.M(i7);
                int i10 = i7 + m4;
                uVar.N(12);
                while (true) {
                    int i11 = uVar.f3352b;
                    if (i11 >= i10) {
                        i4 = 8;
                        break;
                    }
                    int m7 = uVar.m();
                    if (uVar.m() != 1935766900) {
                        uVar.M(i11 + m7);
                    } else if (m7 < 16) {
                        e5 = null;
                        i4 = 8;
                    } else {
                        uVar.N(4);
                        int i12 = -1;
                        int i13 = 0;
                        for (int i14 = 0; i14 < 2; i14++) {
                            int z5 = uVar.z();
                            int z6 = uVar.z();
                            if (z5 == 0) {
                                i12 = z6;
                            } else if (z5 == 1) {
                                i13 = z6;
                            }
                        }
                        if (i12 == 12) {
                            i5 = 240;
                        } else if (i12 == 13) {
                            i5 = 120;
                        } else if (i12 != 21) {
                            i5 = -2147483647;
                        } else {
                            i4 = 8;
                            if (uVar.a() >= 8 && uVar.f3352b + 8 <= i10) {
                                int m8 = uVar.m();
                                int m9 = uVar.m();
                                if (m8 >= 12 && m9 == 1936877170) {
                                    i5 = uVar.A();
                                    if (i5 != -2147483647) {
                                        e5 = new E(new N0.c(i5, i13));
                                    }
                                }
                            }
                            i5 = -2147483647;
                            if (i5 != -2147483647) {
                            }
                        }
                        i4 = 8;
                        if (i5 != -2147483647) {
                        }
                    }
                }
                e5 = null;
                e6 = e6.b(e5);
            } else {
                i4 = 8;
                if (m5 == -1451722374) {
                    short w4 = uVar.w();
                    uVar.N(2);
                    String x4 = uVar.x(w4, StandardCharsets.UTF_8);
                    int max = Math.max(x4.lastIndexOf(43), x4.lastIndexOf(45));
                    try {
                        try {
                            X.f fVar = new X.f(Float.parseFloat(x4.substring(0, max)), Float.parseFloat(x4.substring(max, x4.length() - 1)));
                            D[] dArr = new D[1];
                            z = false;
                            try {
                                dArr[0] = fVar;
                                e4 = new E(dArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                e4 = null;
                                e6 = e6.b(e4);
                                uVar.M(i7 + m4);
                                i6 = i4;
                                z4 = z;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z = false;
                    }
                    e6 = e6.b(e4);
                    uVar.M(i7 + m4);
                    i6 = i4;
                    z4 = z;
                }
            }
            z = false;
            uVar.M(i7 + m4);
            i6 = i4;
            z4 = z;
        }
        return e6;
    }
}
