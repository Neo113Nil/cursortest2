package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
final class y {
    public byte[] N;
    public z T;
    public boolean U;
    public td4 X;
    public int Y;

    /* renamed from: a, reason: collision with root package name */
    public String f14446a;

    /* renamed from: b, reason: collision with root package name */
    public String f14447b;

    /* renamed from: c, reason: collision with root package name */
    public int f14448c;

    /* renamed from: d, reason: collision with root package name */
    public int f14449d;

    /* renamed from: e, reason: collision with root package name */
    public int f14450e;

    /* renamed from: f, reason: collision with root package name */
    public int f14451f;

    /* renamed from: g, reason: collision with root package name */
    private int f14452g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14453h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f14454i;

    /* renamed from: j, reason: collision with root package name */
    public sd4 f14455j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f14456k;

    /* renamed from: l, reason: collision with root package name */
    public u74 f14457l;

    /* renamed from: m, reason: collision with root package name */
    public int f14458m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f14459n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f14460o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f14461p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f14462q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f14463r = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f14464s = 0.0f;

    /* renamed from: t, reason: collision with root package name */
    public float f14465t = 0.0f;

    /* renamed from: u, reason: collision with root package name */
    public float f14466u = 0.0f;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f14467v = null;

    /* renamed from: w, reason: collision with root package name */
    public int f14468w = -1;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14469x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f14470y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f14471z = -1;
    public int A = -1;
    public int B = 1000;
    public int C = 200;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public int O = 1;
    public int P = -1;
    public int Q = 8000;
    public long R = 0;
    public long S = 0;
    public boolean V = true;
    private String W = "eng";

    private y() {
    }

    /* synthetic */ y(x xVar) {
    }

    static /* synthetic */ void d(y yVar) {
        Objects.requireNonNull(yVar.X);
    }

    private static Pair<String, List<byte[]>> f(dr2 dr2Var) {
        try {
            dr2Var.g(16);
            long y6 = dr2Var.y();
            if (y6 == 1482049860) {
                return new Pair<>("video/divx", null);
            }
            if (y6 == 859189832) {
                return new Pair<>("video/3gpp", null);
            }
            if (y6 != 826496599) {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            }
            int k7 = dr2Var.k() + 20;
            byte[] h7 = dr2Var.h();
            while (true) {
                int length = h7.length;
                if (k7 >= length - 4) {
                    throw dz.a("Failed to find FourCC VC1 initialization data", null);
                }
                if (h7[k7] == 0 && h7[k7 + 1] == 0 && h7[k7 + 2] == 1 && h7[k7 + 3] == 15) {
                    return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(h7, k7, length)));
                }
                k7++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw dz.a("Error parsing FourCC private data", null);
        }
    }

    private static List<byte[]> g(byte[] bArr) {
        int i7;
        int i8;
        try {
            if (bArr[0] != 2) {
                throw dz.a("Error parsing vorbis codec private", null);
            }
            int i9 = 1;
            int i10 = 0;
            while (true) {
                i7 = bArr[i9] & 255;
                if (i7 != 255) {
                    break;
                }
                i10 += 255;
                i9++;
            }
            int i11 = i9 + 1;
            int i12 = i10 + i7;
            int i13 = 0;
            while (true) {
                i8 = bArr[i11] & 255;
                if (i8 != 255) {
                    break;
                }
                i13 += 255;
                i11++;
            }
            int i14 = i11 + 1;
            int i15 = i13 + i8;
            if (bArr[i14] != 1) {
                throw dz.a("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i14, bArr2, 0, i12);
            int i16 = i14 + i12;
            if (bArr[i16] != 3) {
                throw dz.a("Error parsing vorbis codec private", null);
            }
            int i17 = i16 + i15;
            if (bArr[i17] != 5) {
                throw dz.a("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i17;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i17, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw dz.a("Error parsing vorbis codec private", null);
        }
    }

    private static boolean h(dr2 dr2Var) {
        UUID uuid;
        UUID uuid2;
        try {
            int q7 = dr2Var.q();
            if (q7 == 1) {
                return true;
            }
            if (q7 == 65534) {
                dr2Var.f(24);
                long z6 = dr2Var.z();
                uuid = a0.f2515f0;
                if (z6 == uuid.getMostSignificantBits()) {
                    long z7 = dr2Var.z();
                    uuid2 = a0.f2515f0;
                    if (z7 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw dz.a("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] i(String str) {
        byte[] bArr = this.f14456k;
        if (bArr != null) {
            return bArr;
        }
        String valueOf = String.valueOf(str);
        throw dz.a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(rc4 rc4Var, int i7) {
        char c7;
        List<byte[]> singletonList;
        List<byte[]> list;
        String str;
        int i8;
        String str2;
        String str3;
        int R;
        int i9;
        StringBuilder sb;
        String str4;
        byte[] bArr;
        byte[] bArr2;
        String str5;
        int i10;
        p14 p14Var;
        Map map;
        Map map2;
        byte[] bArr3;
        int i11;
        Map map3;
        lc4 a7;
        String str6 = this.f14447b;
        int i12 = 1;
        int i13 = 0;
        int i14 = 3;
        switch (str6.hashCode()) {
            case -2095576542:
                if (str6.equals("V_MPEG4/ISO/AP")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case -2095575984:
                if (str6.equals("V_MPEG4/ISO/SP")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case -1985379776:
                if (str6.equals("A_MS/ACM")) {
                    c7 = 23;
                    break;
                }
                c7 = 65535;
                break;
            case -1784763192:
                if (str6.equals("A_TRUEHD")) {
                    c7 = 18;
                    break;
                }
                c7 = 65535;
                break;
            case -1730367663:
                if (str6.equals("A_VORBIS")) {
                    c7 = 11;
                    break;
                }
                c7 = 65535;
                break;
            case -1482641358:
                if (str6.equals("A_MPEG/L2")) {
                    c7 = 14;
                    break;
                }
                c7 = 65535;
                break;
            case -1482641357:
                if (str6.equals("A_MPEG/L3")) {
                    c7 = 15;
                    break;
                }
                c7 = 65535;
                break;
            case -1373388978:
                if (str6.equals("V_MS/VFW/FOURCC")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case -933872740:
                if (str6.equals("S_DVBSUB")) {
                    c7 = 31;
                    break;
                }
                c7 = 65535;
                break;
            case -538363189:
                if (str6.equals("V_MPEG4/ISO/ASP")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case -538363109:
                if (str6.equals("V_MPEG4/ISO/AVC")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case -425012669:
                if (str6.equals("S_VOBSUB")) {
                    c7 = 29;
                    break;
                }
                c7 = 65535;
                break;
            case -356037306:
                if (str6.equals("A_DTS/LOSSLESS")) {
                    c7 = 21;
                    break;
                }
                c7 = 65535;
                break;
            case 62923557:
                if (str6.equals("A_AAC")) {
                    c7 = '\r';
                    break;
                }
                c7 = 65535;
                break;
            case 62923603:
                if (str6.equals("A_AC3")) {
                    c7 = 16;
                    break;
                }
                c7 = 65535;
                break;
            case 62927045:
                if (str6.equals("A_DTS")) {
                    c7 = 19;
                    break;
                }
                c7 = 65535;
                break;
            case 82318131:
                if (str6.equals("V_AV1")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 82338133:
                if (str6.equals("V_VP8")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 82338134:
                if (str6.equals("V_VP9")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 99146302:
                if (str6.equals("S_HDMV/PGS")) {
                    c7 = 30;
                    break;
                }
                c7 = 65535;
                break;
            case 444813526:
                if (str6.equals("V_THEORA")) {
                    c7 = '\n';
                    break;
                }
                c7 = 65535;
                break;
            case 542569478:
                if (str6.equals("A_DTS/EXPRESS")) {
                    c7 = 20;
                    break;
                }
                c7 = 65535;
                break;
            case 635596514:
                if (str6.equals("A_PCM/FLOAT/IEEE")) {
                    c7 = 26;
                    break;
                }
                c7 = 65535;
                break;
            case 725948237:
                if (str6.equals("A_PCM/INT/BIG")) {
                    c7 = 25;
                    break;
                }
                c7 = 65535;
                break;
            case 725957860:
                if (str6.equals("A_PCM/INT/LIT")) {
                    c7 = 24;
                    break;
                }
                c7 = 65535;
                break;
            case 738597099:
                if (str6.equals("S_TEXT/ASS")) {
                    c7 = 28;
                    break;
                }
                c7 = 65535;
                break;
            case 855502857:
                if (str6.equals("V_MPEGH/ISO/HEVC")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case 1422270023:
                if (str6.equals("S_TEXT/UTF8")) {
                    c7 = 27;
                    break;
                }
                c7 = 65535;
                break;
            case 1809237540:
                if (str6.equals("V_MPEG2")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 1950749482:
                if (str6.equals("A_EAC3")) {
                    c7 = 17;
                    break;
                }
                c7 = 65535;
                break;
            case 1950789798:
                if (str6.equals("A_FLAC")) {
                    c7 = 22;
                    break;
                }
                c7 = 65535;
                break;
            case 1951062397:
                if (str6.equals("A_OPUS")) {
                    c7 = '\f';
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        String str7 = "audio/raw";
        switch (c7) {
            case 0:
                str7 = "video/x-vnd.on2.vp8";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null && (a7 = lc4.a(new dr2(bArr2))) != null) {
                    str2 = a7.f7934a;
                    str7 = "video/dolby-vision";
                }
                str5 = str7;
                int i15 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var = new bf4();
                if (dy.g(str5)) {
                    bf4Var.e0(this.O);
                    bf4Var.t(this.Q);
                    bf4Var.n(i14);
                } else if (dy.h(str5)) {
                    if (this.f14462q == 0) {
                        int i16 = this.f14460o;
                        i10 = -1;
                        if (i16 == -1) {
                            i16 = this.f14458m;
                        }
                        this.f14460o = i16;
                        int i17 = this.f14461p;
                        if (i17 == -1) {
                            i17 = this.f14459n;
                        }
                        this.f14461p = i17;
                    } else {
                        i10 = -1;
                    }
                    float f7 = (this.f14460o == i10 || (i11 = this.f14461p) == i10) ? -1.0f : (this.f14459n * r4) / (this.f14458m * i11);
                    if (this.f14469x) {
                        if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                            bArr3 = null;
                        } else {
                            byte[] bArr4 = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr4).order(ByteOrder.LITTLE_ENDIAN);
                            order.put((byte) 0);
                            order.putShort((short) ((this.D * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.E * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
                            order.putShort((short) (this.L + 0.5f));
                            order.putShort((short) (this.M + 0.5f));
                            order.putShort((short) this.B);
                            order.putShort((short) this.C);
                            bArr3 = bArr4;
                        }
                        p14Var = new p14(this.f14470y, this.A, this.f14471z, bArr3);
                    } else {
                        p14Var = null;
                    }
                    if (this.f14446a != null) {
                        map = a0.f2516g0;
                        if (map.containsKey(this.f14446a)) {
                            map2 = a0.f2516g0;
                            i10 = ((Integer) map2.get(this.f14446a)).intValue();
                        }
                    }
                    if (this.f14463r == 0 && Float.compare(this.f14464s, 0.0f) == 0 && Float.compare(this.f14465t, 0.0f) == 0) {
                        if (Float.compare(this.f14466u, 0.0f) != 0) {
                            if (Float.compare(this.f14465t, 90.0f) == 0) {
                                i13 = 90;
                            } else if (Float.compare(this.f14465t, -180.0f) == 0 || Float.compare(this.f14465t, 180.0f) == 0) {
                                i13 = 180;
                            } else if (Float.compare(this.f14465t, -90.0f) == 0) {
                                i13 = 270;
                            }
                        }
                        bf4Var.x(this.f14458m);
                        bf4Var.f(this.f14459n);
                        bf4Var.p(f7);
                        bf4Var.r(i13);
                        bf4Var.q(this.f14467v);
                        bf4Var.v(this.f14468w);
                        bf4Var.g0(p14Var);
                        i12 = 2;
                    }
                    i13 = i10;
                    bf4Var.x(this.f14458m);
                    bf4Var.f(this.f14459n);
                    bf4Var.p(f7);
                    bf4Var.r(i13);
                    bf4Var.q(this.f14467v);
                    bf4Var.v(this.f14468w);
                    bf4Var.g0(p14Var);
                    i12 = 2;
                } else {
                    if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
                        throw dz.a("Unexpected MIME type.", null);
                    }
                    i12 = 3;
                }
                if (this.f14446a != null) {
                    map3 = a0.f2516g0;
                    if (!map3.containsKey(this.f14446a)) {
                        bf4Var.j(this.f14446a);
                    }
                }
                bf4Var.g(i7);
                bf4Var.s(str5);
                bf4Var.l(i8);
                bf4Var.k(this.W);
                bf4Var.u(i15);
                bf4Var.i(singletonList);
                bf4Var.f0(str2);
                bf4Var.b(this.f14457l);
                c0 y6 = bf4Var.y();
                td4 r7 = rc4Var.r(this.f14448c, i12);
                this.X = r7;
                r7.b(y6);
                return;
            case 1:
                str7 = "video/x-vnd.on2.vp9";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                    str2 = a7.f7934a;
                    str7 = "video/dolby-vision";
                    break;
                }
                str5 = str7;
                int i152 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var2 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var2.g(i7);
                bf4Var2.s(str5);
                bf4Var2.l(i8);
                bf4Var2.k(this.W);
                bf4Var2.u(i152);
                bf4Var2.i(singletonList);
                bf4Var2.f0(str2);
                bf4Var2.b(this.f14457l);
                c0 y62 = bf4Var2.y();
                td4 r72 = rc4Var.r(this.f14448c, i12);
                this.X = r72;
                r72.b(y62);
                return;
            case 2:
                str7 = "video/av01";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i1522 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var22 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var22.g(i7);
                bf4Var22.s(str5);
                bf4Var22.l(i8);
                bf4Var22.k(this.W);
                bf4Var22.u(i1522);
                bf4Var22.i(singletonList);
                bf4Var22.f0(str2);
                bf4Var22.b(this.f14457l);
                c0 y622 = bf4Var22.y();
                td4 r722 = rc4Var.r(this.f14448c, i12);
                this.X = r722;
                r722.b(y622);
                return;
            case 3:
                str7 = "video/mpeg2";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i15222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var222.g(i7);
                bf4Var222.s(str5);
                bf4Var222.l(i8);
                bf4Var222.k(this.W);
                bf4Var222.u(i15222);
                bf4Var222.i(singletonList);
                bf4Var222.f0(str2);
                bf4Var222.b(this.f14457l);
                c0 y6222 = bf4Var222.y();
                td4 r7222 = rc4Var.r(this.f14448c, i12);
                this.X = r7222;
                r7222.b(y6222);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.f14456k;
                singletonList = bArr5 == null ? null : Collections.singletonList(bArr5);
                str7 = "video/mp4v-es";
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i152222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var2222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var2222.g(i7);
                bf4Var2222.s(str5);
                bf4Var2222.l(i8);
                bf4Var2222.k(this.W);
                bf4Var2222.u(i152222);
                bf4Var2222.i(singletonList);
                bf4Var2222.f0(str2);
                bf4Var2222.b(this.f14457l);
                c0 y62222 = bf4Var2222.y();
                td4 r72222 = rc4Var.r(this.f14448c, i12);
                this.X = r72222;
                r72222.b(y62222);
                return;
            case c4.w0.f2149o /* 7 */:
                xb4 a8 = xb4.a(new dr2(i(str6)));
                list = a8.f14114a;
                this.Y = a8.f14115b;
                str = a8.f14119f;
                str7 = "video/avc";
                i8 = -1;
                i14 = -1;
                List<byte[]> list2 = list;
                str2 = str;
                singletonList = list2;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i1522222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var22222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var22222.g(i7);
                bf4Var22222.s(str5);
                bf4Var22222.l(i8);
                bf4Var22222.k(this.W);
                bf4Var22222.u(i1522222);
                bf4Var22222.i(singletonList);
                bf4Var22222.f0(str2);
                bf4Var22222.b(this.f14457l);
                c0 y622222 = bf4Var22222.y();
                td4 r722222 = rc4Var.r(this.f14448c, i12);
                this.X = r722222;
                r722222.b(y622222);
                return;
            case c4.w0.f2150p /* 8 */:
                gd4 a9 = gd4.a(new dr2(i(str6)));
                list = a9.f5562a;
                this.Y = a9.f5563b;
                str = a9.f5565d;
                str7 = "video/hevc";
                i8 = -1;
                i14 = -1;
                List<byte[]> list22 = list;
                str2 = str;
                singletonList = list22;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i15222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var222222.g(i7);
                bf4Var222222.s(str5);
                bf4Var222222.l(i8);
                bf4Var222222.k(this.W);
                bf4Var222222.u(i15222222);
                bf4Var222222.i(singletonList);
                bf4Var222222.f0(str2);
                bf4Var222222.b(this.f14457l);
                c0 y6222222 = bf4Var222222.y();
                td4 r7222222 = rc4Var.r(this.f14448c, i12);
                this.X = r7222222;
                r7222222.b(y6222222);
                return;
            case '\t':
                Pair<String, List<byte[]>> f8 = f(new dr2(i(str6)));
                str7 = (String) f8.first;
                singletonList = (List) f8.second;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i152222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var2222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var2222222.g(i7);
                bf4Var2222222.s(str5);
                bf4Var2222222.l(i8);
                bf4Var2222222.k(this.W);
                bf4Var2222222.u(i152222222);
                bf4Var2222222.i(singletonList);
                bf4Var2222222.f0(str2);
                bf4Var2222222.b(this.f14457l);
                c0 y62222222 = bf4Var2222222.y();
                td4 r72222222 = rc4Var.r(this.f14448c, i12);
                this.X = r72222222;
                r72222222.b(y62222222);
                return;
            case '\n':
                str7 = "video/x-unknown";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i1522222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var22222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var22222222.g(i7);
                bf4Var22222222.s(str5);
                bf4Var22222222.l(i8);
                bf4Var22222222.k(this.W);
                bf4Var22222222.u(i1522222222);
                bf4Var22222222.i(singletonList);
                bf4Var22222222.f0(str2);
                bf4Var22222222.b(this.f14457l);
                c0 y622222222 = bf4Var22222222.y();
                td4 r722222222 = rc4Var.r(this.f14448c, i12);
                this.X = r722222222;
                r722222222.b(y622222222);
                return;
            case 11:
                singletonList = g(i(str6));
                str7 = "audio/vorbis";
                str2 = null;
                i8 = 8192;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i15222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var222222222.g(i7);
                bf4Var222222222.s(str5);
                bf4Var222222222.l(i8);
                bf4Var222222222.k(this.W);
                bf4Var222222222.u(i15222222222);
                bf4Var222222222.i(singletonList);
                bf4Var222222222.f0(str2);
                bf4Var222222222.b(this.f14457l);
                c0 y6222222222 = bf4Var222222222.y();
                td4 r7222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r7222222222;
                r7222222222.b(y6222222222);
                return;
            case '\f':
                singletonList = new ArrayList<>(3);
                singletonList.add(i(this.f14447b));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                singletonList.add(allocate.order(byteOrder).putLong(this.R).array());
                singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                str7 = "audio/opus";
                str2 = null;
                i8 = 5760;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i152222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var2222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var2222222222.g(i7);
                bf4Var2222222222.s(str5);
                bf4Var2222222222.l(i8);
                bf4Var2222222222.k(this.W);
                bf4Var2222222222.u(i152222222222);
                bf4Var2222222222.i(singletonList);
                bf4Var2222222222.f0(str2);
                bf4Var2222222222.b(this.f14457l);
                c0 y62222222222 = bf4Var2222222222.y();
                td4 r72222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r72222222222;
                r72222222222.b(y62222222222);
                return;
            case '\r':
                singletonList = Collections.singletonList(i(str6));
                pb4 a10 = qb4.a(this.f14456k);
                this.Q = a10.f10169a;
                this.O = a10.f10170b;
                str2 = a10.f10171c;
                str7 = "audio/mp4a-latm";
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i1522222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var22222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var22222222222.g(i7);
                bf4Var22222222222.s(str5);
                bf4Var22222222222.l(i8);
                bf4Var22222222222.k(this.W);
                bf4Var22222222222.u(i1522222222222);
                bf4Var22222222222.i(singletonList);
                bf4Var22222222222.f0(str2);
                bf4Var22222222222.b(this.f14457l);
                c0 y622222222222 = bf4Var22222222222.y();
                td4 r722222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r722222222222;
                r722222222222.b(y622222222222);
                return;
            case 14:
                str7 = "audio/mpeg-L2";
                singletonList = null;
                str2 = null;
                i8 = 4096;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i15222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var222222222222.g(i7);
                bf4Var222222222222.s(str5);
                bf4Var222222222222.l(i8);
                bf4Var222222222222.k(this.W);
                bf4Var222222222222.u(i15222222222222);
                bf4Var222222222222.i(singletonList);
                bf4Var222222222222.f0(str2);
                bf4Var222222222222.b(this.f14457l);
                c0 y6222222222222 = bf4Var222222222222.y();
                td4 r7222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r7222222222222;
                r7222222222222.b(y6222222222222);
                return;
            case 15:
                str7 = "audio/mpeg";
                singletonList = null;
                str2 = null;
                i8 = 4096;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i152222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var2222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var2222222222222.g(i7);
                bf4Var2222222222222.s(str5);
                bf4Var2222222222222.l(i8);
                bf4Var2222222222222.k(this.W);
                bf4Var2222222222222.u(i152222222222222);
                bf4Var2222222222222.i(singletonList);
                bf4Var2222222222222.f0(str2);
                bf4Var2222222222222.b(this.f14457l);
                c0 y62222222222222 = bf4Var2222222222222.y();
                td4 r72222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r72222222222222;
                r72222222222222.b(y62222222222222);
                return;
            case 16:
                str7 = "audio/ac3";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i1522222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var22222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var22222222222222.g(i7);
                bf4Var22222222222222.s(str5);
                bf4Var22222222222222.l(i8);
                bf4Var22222222222222.k(this.W);
                bf4Var22222222222222.u(i1522222222222222);
                bf4Var22222222222222.i(singletonList);
                bf4Var22222222222222.f0(str2);
                bf4Var22222222222222.b(this.f14457l);
                c0 y622222222222222 = bf4Var22222222222222.y();
                td4 r722222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r722222222222222;
                r722222222222222.b(y622222222222222);
                return;
            case 17:
                str7 = "audio/eac3";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i15222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var222222222222222.g(i7);
                bf4Var222222222222222.s(str5);
                bf4Var222222222222222.l(i8);
                bf4Var222222222222222.k(this.W);
                bf4Var222222222222222.u(i15222222222222222);
                bf4Var222222222222222.i(singletonList);
                bf4Var222222222222222.f0(str2);
                bf4Var222222222222222.b(this.f14457l);
                c0 y6222222222222222 = bf4Var222222222222222.y();
                td4 r7222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r7222222222222222;
                r7222222222222222.b(y6222222222222222);
                return;
            case 18:
                this.T = new z();
                str7 = "audio/true-hd";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i152222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var2222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var2222222222222222.g(i7);
                bf4Var2222222222222222.s(str5);
                bf4Var2222222222222222.l(i8);
                bf4Var2222222222222222.k(this.W);
                bf4Var2222222222222222.u(i152222222222222222);
                bf4Var2222222222222222.i(singletonList);
                bf4Var2222222222222222.f0(str2);
                bf4Var2222222222222222.b(this.f14457l);
                c0 y62222222222222222 = bf4Var2222222222222222.y();
                td4 r72222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r72222222222222222;
                r72222222222222222.b(y62222222222222222);
                return;
            case 19:
            case 20:
                str7 = "audio/vnd.dts";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i1522222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var22222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var22222222222222222.g(i7);
                bf4Var22222222222222222.s(str5);
                bf4Var22222222222222222.l(i8);
                bf4Var22222222222222222.k(this.W);
                bf4Var22222222222222222.u(i1522222222222222222);
                bf4Var22222222222222222.i(singletonList);
                bf4Var22222222222222222.f0(str2);
                bf4Var22222222222222222.b(this.f14457l);
                c0 y622222222222222222 = bf4Var22222222222222222.y();
                td4 r722222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r722222222222222222;
                r722222222222222222.b(y622222222222222222);
                return;
            case 21:
                str7 = "audio/vnd.dts.hd";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i15222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var222222222222222222.g(i7);
                bf4Var222222222222222222.s(str5);
                bf4Var222222222222222222.l(i8);
                bf4Var222222222222222222.k(this.W);
                bf4Var222222222222222222.u(i15222222222222222222);
                bf4Var222222222222222222.i(singletonList);
                bf4Var222222222222222222.f0(str2);
                bf4Var222222222222222222.b(this.f14457l);
                c0 y6222222222222222222 = bf4Var222222222222222222.y();
                td4 r7222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r7222222222222222222;
                r7222222222222222222.b(y6222222222222222222);
                return;
            case 22:
                singletonList = Collections.singletonList(i(str6));
                str7 = "audio/flac";
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i152222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var2222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var2222222222222222222.g(i7);
                bf4Var2222222222222222222.s(str5);
                bf4Var2222222222222222222.l(i8);
                bf4Var2222222222222222222.k(this.W);
                bf4Var2222222222222222222.u(i152222222222222222222);
                bf4Var2222222222222222222.i(singletonList);
                bf4Var2222222222222222222.f0(str2);
                bf4Var2222222222222222222.b(this.f14457l);
                c0 y62222222222222222222 = bf4Var2222222222222222222.y();
                td4 r72222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r72222222222222222222;
                r72222222222222222222.b(y62222222222222222222);
                return;
            case 23:
                if (!h(new dr2(i(str6)))) {
                    str3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                    Log.w("MatroskaExtractor", str3);
                    str7 = "audio/x-unknown";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i14 = -1;
                    bArr2 = this.N;
                    if (bArr2 != null) {
                    }
                    str5 = str7;
                    int i1522222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                    bf4 bf4Var22222222222222222222 = new bf4();
                    if (dy.g(str5)) {
                    }
                    if (this.f14446a != null) {
                    }
                    bf4Var22222222222222222222.g(i7);
                    bf4Var22222222222222222222.s(str5);
                    bf4Var22222222222222222222.l(i8);
                    bf4Var22222222222222222222.k(this.W);
                    bf4Var22222222222222222222.u(i1522222222222222222222);
                    bf4Var22222222222222222222.i(singletonList);
                    bf4Var22222222222222222222.f0(str2);
                    bf4Var22222222222222222222.b(this.f14457l);
                    c0 y622222222222222222222 = bf4Var22222222222222222222.y();
                    td4 r722222222222222222222 = rc4Var.r(this.f14448c, i12);
                    this.X = r722222222222222222222;
                    r722222222222222222222.b(y622222222222222222222);
                    return;
                }
                R = n13.R(this.P);
                if (R == 0) {
                    i9 = this.P;
                    sb = new StringBuilder(75);
                    str4 = "Unsupported PCM bit depth: ";
                    sb.append(str4);
                    sb.append(i9);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str3 = sb.toString();
                    Log.w("MatroskaExtractor", str3);
                    str7 = "audio/x-unknown";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i14 = -1;
                    bArr2 = this.N;
                    if (bArr2 != null) {
                    }
                    str5 = str7;
                    int i15222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                    bf4 bf4Var222222222222222222222 = new bf4();
                    if (dy.g(str5)) {
                    }
                    if (this.f14446a != null) {
                    }
                    bf4Var222222222222222222222.g(i7);
                    bf4Var222222222222222222222.s(str5);
                    bf4Var222222222222222222222.l(i8);
                    bf4Var222222222222222222222.k(this.W);
                    bf4Var222222222222222222222.u(i15222222222222222222222);
                    bf4Var222222222222222222222.i(singletonList);
                    bf4Var222222222222222222222.f0(str2);
                    bf4Var222222222222222222222.b(this.f14457l);
                    c0 y6222222222222222222222 = bf4Var222222222222222222222.y();
                    td4 r7222222222222222222222 = rc4Var.r(this.f14448c, i12);
                    this.X = r7222222222222222222222;
                    r7222222222222222222222.b(y6222222222222222222222);
                    return;
                }
                i14 = R;
                singletonList = null;
                str2 = null;
                i8 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i152222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var2222222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var2222222222222222222222.g(i7);
                bf4Var2222222222222222222222.s(str5);
                bf4Var2222222222222222222222.l(i8);
                bf4Var2222222222222222222222.k(this.W);
                bf4Var2222222222222222222222.u(i152222222222222222222222);
                bf4Var2222222222222222222222.i(singletonList);
                bf4Var2222222222222222222222.f0(str2);
                bf4Var2222222222222222222222.b(this.f14457l);
                c0 y62222222222222222222222 = bf4Var2222222222222222222222.y();
                td4 r72222222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r72222222222222222222222;
                r72222222222222222222222.b(y62222222222222222222222);
                return;
            case 24:
                R = n13.R(this.P);
                if (R == 0) {
                    i9 = this.P;
                    sb = new StringBuilder(89);
                    str4 = "Unsupported little endian PCM bit depth: ";
                    sb.append(str4);
                    sb.append(i9);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str3 = sb.toString();
                    Log.w("MatroskaExtractor", str3);
                    str7 = "audio/x-unknown";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i14 = -1;
                    bArr2 = this.N;
                    if (bArr2 != null) {
                    }
                    str5 = str7;
                    int i1522222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                    bf4 bf4Var22222222222222222222222 = new bf4();
                    if (dy.g(str5)) {
                    }
                    if (this.f14446a != null) {
                    }
                    bf4Var22222222222222222222222.g(i7);
                    bf4Var22222222222222222222222.s(str5);
                    bf4Var22222222222222222222222.l(i8);
                    bf4Var22222222222222222222222.k(this.W);
                    bf4Var22222222222222222222222.u(i1522222222222222222222222);
                    bf4Var22222222222222222222222.i(singletonList);
                    bf4Var22222222222222222222222.f0(str2);
                    bf4Var22222222222222222222222.b(this.f14457l);
                    c0 y622222222222222222222222 = bf4Var22222222222222222222222.y();
                    td4 r722222222222222222222222 = rc4Var.r(this.f14448c, i12);
                    this.X = r722222222222222222222222;
                    r722222222222222222222222.b(y622222222222222222222222);
                    return;
                }
                i14 = R;
                singletonList = null;
                str2 = null;
                i8 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i15222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var222222222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var222222222222222222222222.g(i7);
                bf4Var222222222222222222222222.s(str5);
                bf4Var222222222222222222222222.l(i8);
                bf4Var222222222222222222222222.k(this.W);
                bf4Var222222222222222222222222.u(i15222222222222222222222222);
                bf4Var222222222222222222222222.i(singletonList);
                bf4Var222222222222222222222222.f0(str2);
                bf4Var222222222222222222222222.b(this.f14457l);
                c0 y6222222222222222222222222 = bf4Var222222222222222222222222.y();
                td4 r7222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r7222222222222222222222222;
                r7222222222222222222222222.b(y6222222222222222222222222);
                return;
            case 25:
                i9 = this.P;
                if (i9 != 8) {
                    if (i9 == 16) {
                        singletonList = null;
                        str2 = null;
                        i8 = -1;
                        i14 = 268435456;
                        bArr2 = this.N;
                        if (bArr2 != null) {
                        }
                        str5 = str7;
                        int i152222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                        bf4 bf4Var2222222222222222222222222 = new bf4();
                        if (dy.g(str5)) {
                        }
                        if (this.f14446a != null) {
                        }
                        bf4Var2222222222222222222222222.g(i7);
                        bf4Var2222222222222222222222222.s(str5);
                        bf4Var2222222222222222222222222.l(i8);
                        bf4Var2222222222222222222222222.k(this.W);
                        bf4Var2222222222222222222222222.u(i152222222222222222222222222);
                        bf4Var2222222222222222222222222.i(singletonList);
                        bf4Var2222222222222222222222222.f0(str2);
                        bf4Var2222222222222222222222222.b(this.f14457l);
                        c0 y62222222222222222222222222 = bf4Var2222222222222222222222222.y();
                        td4 r72222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                        this.X = r72222222222222222222222222;
                        r72222222222222222222222222.b(y62222222222222222222222222);
                        return;
                    }
                    sb = new StringBuilder(86);
                    str4 = "Unsupported big endian PCM bit depth: ";
                    sb.append(str4);
                    sb.append(i9);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str3 = sb.toString();
                    Log.w("MatroskaExtractor", str3);
                    str7 = "audio/x-unknown";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i14 = -1;
                    bArr2 = this.N;
                    if (bArr2 != null) {
                    }
                    str5 = str7;
                    int i1522222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                    bf4 bf4Var22222222222222222222222222 = new bf4();
                    if (dy.g(str5)) {
                    }
                    if (this.f14446a != null) {
                    }
                    bf4Var22222222222222222222222222.g(i7);
                    bf4Var22222222222222222222222222.s(str5);
                    bf4Var22222222222222222222222222.l(i8);
                    bf4Var22222222222222222222222222.k(this.W);
                    bf4Var22222222222222222222222222.u(i1522222222222222222222222222);
                    bf4Var22222222222222222222222222.i(singletonList);
                    bf4Var22222222222222222222222222.f0(str2);
                    bf4Var22222222222222222222222222.b(this.f14457l);
                    c0 y622222222222222222222222222 = bf4Var22222222222222222222222222.y();
                    td4 r722222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                    this.X = r722222222222222222222222222;
                    r722222222222222222222222222.b(y622222222222222222222222222);
                    return;
                }
                singletonList = null;
                str2 = null;
                i8 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i15222222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var222222222222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var222222222222222222222222222.g(i7);
                bf4Var222222222222222222222222222.s(str5);
                bf4Var222222222222222222222222222.l(i8);
                bf4Var222222222222222222222222222.k(this.W);
                bf4Var222222222222222222222222222.u(i15222222222222222222222222222);
                bf4Var222222222222222222222222222.i(singletonList);
                bf4Var222222222222222222222222222.f0(str2);
                bf4Var222222222222222222222222222.b(this.f14457l);
                c0 y6222222222222222222222222222 = bf4Var222222222222222222222222222.y();
                td4 r7222222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r7222222222222222222222222222;
                r7222222222222222222222222222.b(y6222222222222222222222222222);
                return;
            case 26:
                i9 = this.P;
                if (i9 == 32) {
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i14 = 4;
                    bArr2 = this.N;
                    if (bArr2 != null) {
                    }
                    str5 = str7;
                    int i152222222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                    bf4 bf4Var2222222222222222222222222222 = new bf4();
                    if (dy.g(str5)) {
                    }
                    if (this.f14446a != null) {
                    }
                    bf4Var2222222222222222222222222222.g(i7);
                    bf4Var2222222222222222222222222222.s(str5);
                    bf4Var2222222222222222222222222222.l(i8);
                    bf4Var2222222222222222222222222222.k(this.W);
                    bf4Var2222222222222222222222222222.u(i152222222222222222222222222222);
                    bf4Var2222222222222222222222222222.i(singletonList);
                    bf4Var2222222222222222222222222222.f0(str2);
                    bf4Var2222222222222222222222222222.b(this.f14457l);
                    c0 y62222222222222222222222222222 = bf4Var2222222222222222222222222222.y();
                    td4 r72222222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                    this.X = r72222222222222222222222222222;
                    r72222222222222222222222222222.b(y62222222222222222222222222222);
                    return;
                }
                sb = new StringBuilder(90);
                str4 = "Unsupported floating point PCM bit depth: ";
                sb.append(str4);
                sb.append(i9);
                sb.append(". Setting mimeType to audio/x-unknown");
                str3 = sb.toString();
                Log.w("MatroskaExtractor", str3);
                str7 = "audio/x-unknown";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i1522222222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var22222222222222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var22222222222222222222222222222.g(i7);
                bf4Var22222222222222222222222222222.s(str5);
                bf4Var22222222222222222222222222222.l(i8);
                bf4Var22222222222222222222222222222.k(this.W);
                bf4Var22222222222222222222222222222.u(i1522222222222222222222222222222);
                bf4Var22222222222222222222222222222.i(singletonList);
                bf4Var22222222222222222222222222222.f0(str2);
                bf4Var22222222222222222222222222222.b(this.f14457l);
                c0 y622222222222222222222222222222 = bf4Var22222222222222222222222222222.y();
                td4 r722222222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r722222222222222222222222222222;
                r722222222222222222222222222222.b(y622222222222222222222222222222);
                return;
            case 27:
                str7 = "application/x-subrip";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i15222222222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var222222222222222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var222222222222222222222222222222.g(i7);
                bf4Var222222222222222222222222222222.s(str5);
                bf4Var222222222222222222222222222222.l(i8);
                bf4Var222222222222222222222222222222.k(this.W);
                bf4Var222222222222222222222222222222.u(i15222222222222222222222222222222);
                bf4Var222222222222222222222222222222.i(singletonList);
                bf4Var222222222222222222222222222222.f0(str2);
                bf4Var222222222222222222222222222222.b(this.f14457l);
                c0 y6222222222222222222222222222222 = bf4Var222222222222222222222222222222.y();
                td4 r7222222222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r7222222222222222222222222222222;
                r7222222222222222222222222222222.b(y6222222222222222222222222222222);
                return;
            case 28:
                bArr = a0.f2513d0;
                singletonList = e73.y(bArr, i(this.f14447b));
                str7 = "text/x-ssa";
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i152222222222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var2222222222222222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var2222222222222222222222222222222.g(i7);
                bf4Var2222222222222222222222222222222.s(str5);
                bf4Var2222222222222222222222222222222.l(i8);
                bf4Var2222222222222222222222222222222.k(this.W);
                bf4Var2222222222222222222222222222222.u(i152222222222222222222222222222222);
                bf4Var2222222222222222222222222222222.i(singletonList);
                bf4Var2222222222222222222222222222222.f0(str2);
                bf4Var2222222222222222222222222222222.b(this.f14457l);
                c0 y62222222222222222222222222222222 = bf4Var2222222222222222222222222222222.y();
                td4 r72222222222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r72222222222222222222222222222222;
                r72222222222222222222222222222222.b(y62222222222222222222222222222222);
                return;
            case 29:
                singletonList = e73.x(i(str6));
                str7 = "application/vobsub";
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i1522222222222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var22222222222222222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var22222222222222222222222222222222.g(i7);
                bf4Var22222222222222222222222222222222.s(str5);
                bf4Var22222222222222222222222222222222.l(i8);
                bf4Var22222222222222222222222222222222.k(this.W);
                bf4Var22222222222222222222222222222222.u(i1522222222222222222222222222222222);
                bf4Var22222222222222222222222222222222.i(singletonList);
                bf4Var22222222222222222222222222222222.f0(str2);
                bf4Var22222222222222222222222222222222.b(this.f14457l);
                c0 y622222222222222222222222222222222 = bf4Var22222222222222222222222222222222.y();
                td4 r722222222222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r722222222222222222222222222222222;
                r722222222222222222222222222222222.b(y622222222222222222222222222222222);
                return;
            case 30:
                str7 = "application/pgs";
                singletonList = null;
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i15222222222222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var222222222222222222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var222222222222222222222222222222222.g(i7);
                bf4Var222222222222222222222222222222222.s(str5);
                bf4Var222222222222222222222222222222222.l(i8);
                bf4Var222222222222222222222222222222222.k(this.W);
                bf4Var222222222222222222222222222222222.u(i15222222222222222222222222222222222);
                bf4Var222222222222222222222222222222222.i(singletonList);
                bf4Var222222222222222222222222222222222.f0(str2);
                bf4Var222222222222222222222222222222222.b(this.f14457l);
                c0 y6222222222222222222222222222222222 = bf4Var222222222222222222222222222222222.y();
                td4 r7222222222222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r7222222222222222222222222222222222;
                r7222222222222222222222222222222222.b(y6222222222222222222222222222222222);
                return;
            case 31:
                byte[] bArr6 = new byte[4];
                System.arraycopy(i(str6), 0, bArr6, 0, 4);
                singletonList = e73.x(bArr6);
                str7 = "application/dvbsubs";
                str2 = null;
                i8 = -1;
                i14 = -1;
                bArr2 = this.N;
                if (bArr2 != null) {
                }
                str5 = str7;
                int i152222222222222222222222222222222222 = (this.V ? 1 : 0) | (true != this.U ? 0 : 2);
                bf4 bf4Var2222222222222222222222222222222222 = new bf4();
                if (dy.g(str5)) {
                }
                if (this.f14446a != null) {
                }
                bf4Var2222222222222222222222222222222222.g(i7);
                bf4Var2222222222222222222222222222222222.s(str5);
                bf4Var2222222222222222222222222222222222.l(i8);
                bf4Var2222222222222222222222222222222222.k(this.W);
                bf4Var2222222222222222222222222222222222.u(i152222222222222222222222222222222222);
                bf4Var2222222222222222222222222222222222.i(singletonList);
                bf4Var2222222222222222222222222222222222.f0(str2);
                bf4Var2222222222222222222222222222222222.b(this.f14457l);
                c0 y62222222222222222222222222222222222 = bf4Var2222222222222222222222222222222222.y();
                td4 r72222222222222222222222222222222222 = rc4Var.r(this.f14448c, i12);
                this.X = r72222222222222222222222222222222222;
                r72222222222222222222222222222222222.b(y62222222222222222222222222222222222);
                return;
            default:
                throw dz.a("Unrecognized codec identifier.", null);
        }
    }
}
