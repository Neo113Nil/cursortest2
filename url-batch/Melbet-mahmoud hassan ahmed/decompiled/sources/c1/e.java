package c1;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import c4.w0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import o2.a0;
import o2.m0;
import o2.s;
import o2.v;
import o2.w;
import r0.j;
import r0.n2;
import r0.s1;
import t0.a;
import v0.m;
import w0.b0;
import w0.e0;
import w0.f0;
import w0.l;
import w0.m;
import w0.n;
import w0.q;
import w0.r;

/* loaded from: classes.dex */
public class e implements l {

    /* renamed from: c0, reason: collision with root package name */
    public static final r f1753c0 = new r() { // from class: c1.d
        @Override // w0.r
        public final l[] a() {
            l[] B;
            B = e.B();
            return B;
        }

        @Override // w0.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: d0, reason: collision with root package name */
    private static final byte[] f1754d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e0, reason: collision with root package name */
    private static final byte[] f1755e0 = m0.m0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0, reason: collision with root package name */
    private static final byte[] f1756f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0, reason: collision with root package name */
    private static final byte[] f1757g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: h0, reason: collision with root package name */
    private static final UUID f1758h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: i0, reason: collision with root package name */
    private static final Map<String, Integer> f1759i0;
    private long A;
    private long B;
    private s C;
    private s D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private int Y;
    private byte Z;

    /* renamed from: a, reason: collision with root package name */
    private final c1.c f1760a;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f1761a0;

    /* renamed from: b, reason: collision with root package name */
    private final g f1762b;

    /* renamed from: b0, reason: collision with root package name */
    private n f1763b0;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<c> f1764c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1765d;

    /* renamed from: e, reason: collision with root package name */
    private final a0 f1766e;

    /* renamed from: f, reason: collision with root package name */
    private final a0 f1767f;

    /* renamed from: g, reason: collision with root package name */
    private final a0 f1768g;

    /* renamed from: h, reason: collision with root package name */
    private final a0 f1769h;

    /* renamed from: i, reason: collision with root package name */
    private final a0 f1770i;

    /* renamed from: j, reason: collision with root package name */
    private final a0 f1771j;

    /* renamed from: k, reason: collision with root package name */
    private final a0 f1772k;

    /* renamed from: l, reason: collision with root package name */
    private final a0 f1773l;

    /* renamed from: m, reason: collision with root package name */
    private final a0 f1774m;

    /* renamed from: n, reason: collision with root package name */
    private final a0 f1775n;

    /* renamed from: o, reason: collision with root package name */
    private ByteBuffer f1776o;

    /* renamed from: p, reason: collision with root package name */
    private long f1777p;

    /* renamed from: q, reason: collision with root package name */
    private long f1778q;

    /* renamed from: r, reason: collision with root package name */
    private long f1779r;

    /* renamed from: s, reason: collision with root package name */
    private long f1780s;

    /* renamed from: t, reason: collision with root package name */
    private long f1781t;

    /* renamed from: u, reason: collision with root package name */
    private c f1782u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1783v;

    /* renamed from: w, reason: collision with root package name */
    private int f1784w;

    /* renamed from: x, reason: collision with root package name */
    private long f1785x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1786y;

    /* renamed from: z, reason: collision with root package name */
    private long f1787z;

    private final class b implements c1.b {
        private b() {
        }

        @Override // c1.b
        public void a(int i7) {
            e.this.p(i7);
        }

        @Override // c1.b
        public int b(int i7) {
            return e.this.v(i7);
        }

        @Override // c1.b
        public void c(int i7, double d7) {
            e.this.s(i7, d7);
        }

        @Override // c1.b
        public boolean d(int i7) {
            return e.this.A(i7);
        }

        @Override // c1.b
        public void e(int i7, int i8, m mVar) {
            e.this.m(i7, i8, mVar);
        }

        @Override // c1.b
        public void f(int i7, String str) {
            e.this.I(i7, str);
        }

        @Override // c1.b
        public void g(int i7, long j7, long j8) {
            e.this.H(i7, j7, j8);
        }

        @Override // c1.b
        public void h(int i7, long j7) {
            e.this.y(i7, j7);
        }
    }

    protected static final class c {
        public byte[] N;
        public f0 T;
        public boolean U;
        public e0 X;
        public int Y;

        /* renamed from: a, reason: collision with root package name */
        public String f1789a;

        /* renamed from: b, reason: collision with root package name */
        public String f1790b;

        /* renamed from: c, reason: collision with root package name */
        public int f1791c;

        /* renamed from: d, reason: collision with root package name */
        public int f1792d;

        /* renamed from: e, reason: collision with root package name */
        public int f1793e;

        /* renamed from: f, reason: collision with root package name */
        public int f1794f;

        /* renamed from: g, reason: collision with root package name */
        private int f1795g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f1796h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f1797i;

        /* renamed from: j, reason: collision with root package name */
        public e0.a f1798j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f1799k;

        /* renamed from: l, reason: collision with root package name */
        public v0.m f1800l;

        /* renamed from: m, reason: collision with root package name */
        public int f1801m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f1802n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f1803o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f1804p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f1805q = 0;

        /* renamed from: r, reason: collision with root package name */
        public int f1806r = -1;

        /* renamed from: s, reason: collision with root package name */
        public float f1807s = 0.0f;

        /* renamed from: t, reason: collision with root package name */
        public float f1808t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f1809u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f1810v = null;

        /* renamed from: w, reason: collision with root package name */
        public int f1811w = -1;

        /* renamed from: x, reason: collision with root package name */
        public boolean f1812x = false;

        /* renamed from: y, reason: collision with root package name */
        public int f1813y = -1;

        /* renamed from: z, reason: collision with root package name */
        public int f1814z = -1;
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

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            o2.a.e(this.X);
        }

        private byte[] g(String str) {
            byte[] bArr = this.f1799k;
            if (bArr != null) {
                return bArr;
            }
            throw n2.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
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
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(a0 a0Var) {
            try {
                a0Var.P(16);
                long s7 = a0Var.s();
                if (s7 == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (s7 == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (s7 != 826496599) {
                    o2.r.i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] d7 = a0Var.d();
                for (int e7 = a0Var.e() + 20; e7 < d7.length - 4; e7++) {
                    if (d7[e7] == 0 && d7[e7 + 1] == 0 && d7[e7 + 2] == 1 && d7[e7 + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d7, e7, d7.length)));
                    }
                }
                throw n2.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw n2.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(a0 a0Var) {
            try {
                int u6 = a0Var.u();
                if (u6 == 1) {
                    return true;
                }
                if (u6 != 65534) {
                    return false;
                }
                a0Var.O(24);
                if (a0Var.v() == e.f1758h0.getMostSignificantBits()) {
                    if (a0Var.v() == e.f1758h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw n2.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> m(byte[] bArr) {
            try {
                if (bArr[0] != 2) {
                    throw n2.a("Error parsing vorbis codec private", null);
                }
                int i7 = 1;
                int i8 = 0;
                while ((bArr[i7] & 255) == 255) {
                    i8 += 255;
                    i7++;
                }
                int i9 = i7 + 1;
                int i10 = i8 + (bArr[i7] & 255);
                int i11 = 0;
                while ((bArr[i9] & 255) == 255) {
                    i11 += 255;
                    i9++;
                }
                int i12 = i9 + 1;
                int i13 = i11 + (bArr[i9] & 255);
                if (bArr[i12] != 1) {
                    throw n2.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, i12, bArr2, 0, i10);
                int i14 = i12 + i10;
                if (bArr[i14] != 3) {
                    throw n2.a("Error parsing vorbis codec private", null);
                }
                int i15 = i14 + i13;
                if (bArr[i15] != 5) {
                    throw n2.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i15];
                System.arraycopy(bArr, i15, bArr3, 0, bArr.length - i15);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw n2.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z6) {
            return "A_OPUS".equals(this.f1790b) ? z6 : this.f1794f > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:12:0x03da  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x03f3  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0402  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x051f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0414  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x03f5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void i(n nVar, int i7) {
            char c7;
            List<byte[]> singletonList;
            StringBuilder sb;
            int b02;
            String str;
            String str2;
            int i8;
            int i9;
            List<byte[]> list;
            String str3;
            byte[] bArr;
            String str4;
            s1.b bVar;
            int i10;
            int i11;
            int i12;
            p2.d a7;
            String str5 = this.f1790b;
            str5.hashCode();
            switch (str5.hashCode()) {
                case -2095576542:
                    if (str5.equals("V_MPEG4/ISO/AP")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -2095575984:
                    if (str5.equals("V_MPEG4/ISO/SP")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1985379776:
                    if (str5.equals("A_MS/ACM")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1784763192:
                    if (str5.equals("A_TRUEHD")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1730367663:
                    if (str5.equals("A_VORBIS")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1482641358:
                    if (str5.equals("A_MPEG/L2")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1482641357:
                    if (str5.equals("A_MPEG/L3")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1373388978:
                    if (str5.equals("V_MS/VFW/FOURCC")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -933872740:
                    if (str5.equals("S_DVBSUB")) {
                        c7 = '\b';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -538363189:
                    if (str5.equals("V_MPEG4/ISO/ASP")) {
                        c7 = '\t';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -538363109:
                    if (str5.equals("V_MPEG4/ISO/AVC")) {
                        c7 = '\n';
                        break;
                    }
                    c7 = 65535;
                    break;
                case -425012669:
                    if (str5.equals("S_VOBSUB")) {
                        c7 = 11;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -356037306:
                    if (str5.equals("A_DTS/LOSSLESS")) {
                        c7 = '\f';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 62923557:
                    if (str5.equals("A_AAC")) {
                        c7 = '\r';
                        break;
                    }
                    c7 = 65535;
                    break;
                case 62923603:
                    if (str5.equals("A_AC3")) {
                        c7 = 14;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 62927045:
                    if (str5.equals("A_DTS")) {
                        c7 = 15;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 82318131:
                    if (str5.equals("V_AV1")) {
                        c7 = 16;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 82338133:
                    if (str5.equals("V_VP8")) {
                        c7 = 17;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 82338134:
                    if (str5.equals("V_VP9")) {
                        c7 = 18;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 99146302:
                    if (str5.equals("S_HDMV/PGS")) {
                        c7 = 19;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 444813526:
                    if (str5.equals("V_THEORA")) {
                        c7 = 20;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 542569478:
                    if (str5.equals("A_DTS/EXPRESS")) {
                        c7 = 21;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 635596514:
                    if (str5.equals("A_PCM/FLOAT/IEEE")) {
                        c7 = 22;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 725948237:
                    if (str5.equals("A_PCM/INT/BIG")) {
                        c7 = 23;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 725957860:
                    if (str5.equals("A_PCM/INT/LIT")) {
                        c7 = 24;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 738597099:
                    if (str5.equals("S_TEXT/ASS")) {
                        c7 = 25;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 855502857:
                    if (str5.equals("V_MPEGH/ISO/HEVC")) {
                        c7 = 26;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1045209816:
                    if (str5.equals("S_TEXT/WEBVTT")) {
                        c7 = 27;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1422270023:
                    if (str5.equals("S_TEXT/UTF8")) {
                        c7 = 28;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1809237540:
                    if (str5.equals("V_MPEG2")) {
                        c7 = 29;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1950749482:
                    if (str5.equals("A_EAC3")) {
                        c7 = 30;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1950789798:
                    if (str5.equals("A_FLAC")) {
                        c7 = 31;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1951062397:
                    if (str5.equals("A_OPUS")) {
                        c7 = ' ';
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            String str6 = "audio/raw";
            switch (c7) {
                case 0:
                case 1:
                case '\t':
                    byte[] bArr2 = this.f1799k;
                    singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                    str6 = "video/mp4v-es";
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null && (a7 = p2.d.a(new a0(bArr))) != null) {
                        str2 = a7.f19987c;
                        str6 = "video/dolby-vision";
                    }
                    str4 = str6;
                    int i13 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                        bVar.H(this.O).f0(this.Q).Y(i8);
                        i10 = 1;
                    } else if (v.s(str4)) {
                        if (this.f1805q == 0) {
                            int i14 = this.f1803o;
                            i11 = -1;
                            if (i14 == -1) {
                                i14 = this.f1801m;
                            }
                            this.f1803o = i14;
                            int i15 = this.f1804p;
                            if (i15 == -1) {
                                i15 = this.f1802n;
                            }
                            this.f1804p = i15;
                        } else {
                            i11 = -1;
                        }
                        float f7 = -1.0f;
                        if (this.f1803o != i11 && (i12 = this.f1804p) != i11) {
                            f7 = (this.f1802n * r5) / (this.f1801m * i12);
                        }
                        p2.c cVar = this.f1812x ? new p2.c(this.f1813y, this.A, this.f1814z, h()) : null;
                        if (this.f1789a != null && e.f1759i0.containsKey(this.f1789a)) {
                            i11 = ((Integer) e.f1759i0.get(this.f1789a)).intValue();
                        }
                        if (this.f1806r == 0 && Float.compare(this.f1807s, 0.0f) == 0 && Float.compare(this.f1808t, 0.0f) == 0) {
                            if (Float.compare(this.f1809u, 0.0f) == 0) {
                                i11 = 0;
                            } else if (Float.compare(this.f1808t, 90.0f) == 0) {
                                i11 = 90;
                            } else if (Float.compare(this.f1808t, -180.0f) == 0 || Float.compare(this.f1808t, 180.0f) == 0) {
                                i11 = 180;
                            } else if (Float.compare(this.f1808t, -90.0f) == 0) {
                                i11 = 270;
                            }
                        }
                        bVar.j0(this.f1801m).Q(this.f1802n).a0(f7).d0(i11).b0(this.f1810v).h0(this.f1811w).J(cVar);
                        i10 = 2;
                    } else {
                        if (!"application/x-subrip".equals(str4) && !"text/x-ssa".equals(str4) && !"text/vtt".equals(str4) && !"application/vobsub".equals(str4) && !"application/pgs".equals(str4) && !"application/dvbsubs".equals(str4)) {
                            throw n2.a("Unexpected MIME type.", null);
                        }
                        i10 = 3;
                    }
                    if (this.f1789a != null && !e.f1759i0.containsKey(this.f1789a)) {
                        bVar.U(this.f1789a);
                    }
                    s1 E = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d7 = nVar.d(this.f1791c, i10);
                    this.X = d7;
                    d7.e(E);
                    return;
                case 2:
                    if (!l(new a0(g(this.f1790b)))) {
                        sb = new StringBuilder();
                        sb.append("Non-PCM MS/ACM is unsupported. Setting mimeType to ");
                        sb.append("audio/x-unknown");
                        o2.r.i("MatroskaExtractor", sb.toString());
                        singletonList = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i8 = -1;
                        i9 = -1;
                        bArr = this.N;
                        if (bArr != null) {
                        }
                        str4 = str6;
                        int i132 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                        bVar = new s1.b();
                        if (!v.o(str4)) {
                        }
                        if (this.f1789a != null) {
                        }
                        s1 E2 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132).T(singletonList).I(str2).M(this.f1800l).E();
                        e0 d72 = nVar.d(this.f1791c, i10);
                        this.X = d72;
                        d72.e(E2);
                        return;
                    }
                    b02 = m0.b0(this.P);
                    if (b02 == 0) {
                        sb = new StringBuilder();
                        str = "Unsupported PCM bit depth: ";
                        sb.append(str);
                        sb.append(this.P);
                        sb.append(". Setting mimeType to ");
                        sb.append("audio/x-unknown");
                        o2.r.i("MatroskaExtractor", sb.toString());
                        singletonList = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i8 = -1;
                        i9 = -1;
                        bArr = this.N;
                        if (bArr != null) {
                            str2 = a7.f19987c;
                            str6 = "video/dolby-vision";
                            break;
                        }
                        str4 = str6;
                        int i1322 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                        bVar = new s1.b();
                        if (!v.o(str4)) {
                        }
                        if (this.f1789a != null) {
                            bVar.U(this.f1789a);
                            break;
                        }
                        s1 E22 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322).T(singletonList).I(str2).M(this.f1800l).E();
                        e0 d722 = nVar.d(this.f1791c, i10);
                        this.X = d722;
                        d722.e(E22);
                        return;
                    }
                    i8 = b02;
                    singletonList = null;
                    str2 = null;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i13222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d7222 = nVar.d(this.f1791c, i10);
                    this.X = d7222;
                    d7222.e(E222);
                    return;
                case 3:
                    this.T = new f0();
                    str6 = "audio/true-hd";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i132222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E2222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d72222 = nVar.d(this.f1791c, i10);
                    this.X = d72222;
                    d72222.e(E2222);
                    return;
                case 4:
                    singletonList = m(g(this.f1790b));
                    str6 = "audio/vorbis";
                    str2 = null;
                    i8 = -1;
                    i9 = 8192;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i1322222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E22222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d722222 = nVar.d(this.f1791c, i10);
                    this.X = d722222;
                    d722222.e(E22222);
                    return;
                case 5:
                    str6 = "audio/mpeg-L2";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = 4096;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i13222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d7222222 = nVar.d(this.f1791c, i10);
                    this.X = d7222222;
                    d7222222.e(E222222);
                    return;
                case 6:
                    str6 = "audio/mpeg";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = 4096;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i132222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E2222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d72222222 = nVar.d(this.f1791c, i10);
                    this.X = d72222222;
                    d72222222.e(E2222222);
                    return;
                case w0.f2149o /* 7 */:
                    Pair<String, List<byte[]>> k7 = k(new a0(g(this.f1790b)));
                    str6 = (String) k7.first;
                    singletonList = (List) k7.second;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i1322222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E22222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d722222222 = nVar.d(this.f1791c, i10);
                    this.X = d722222222;
                    d722222222.e(E22222222);
                    return;
                case w0.f2150p /* 8 */:
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(g(this.f1790b), 0, bArr3, 0, 4);
                    singletonList = m4.q.y(bArr3);
                    str6 = "application/dvbsubs";
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i13222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d7222222222 = nVar.d(this.f1791c, i10);
                    this.X = d7222222222;
                    d7222222222.e(E222222222);
                    return;
                case '\n':
                    p2.a b7 = p2.a.b(new a0(g(this.f1790b)));
                    list = b7.f19972a;
                    this.Y = b7.f19973b;
                    str3 = b7.f19977f;
                    str6 = "video/avc";
                    i8 = -1;
                    i9 = -1;
                    List<byte[]> list2 = list;
                    str2 = str3;
                    singletonList = list2;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i132222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E2222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d72222222222 = nVar.d(this.f1791c, i10);
                    this.X = d72222222222;
                    d72222222222.e(E2222222222);
                    return;
                case 11:
                    singletonList = m4.q.y(g(this.f1790b));
                    str2 = null;
                    str6 = "application/vobsub";
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i1322222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E22222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d722222222222 = nVar.d(this.f1791c, i10);
                    this.X = d722222222222;
                    d722222222222.e(E22222222222);
                    return;
                case '\f':
                    str6 = "audio/vnd.dts.hd";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i13222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d7222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d7222222222222;
                    d7222222222222.e(E222222222222);
                    return;
                case '\r':
                    singletonList = Collections.singletonList(g(this.f1790b));
                    a.b f8 = t0.a.f(this.f1799k);
                    this.Q = f8.f21667a;
                    this.O = f8.f21668b;
                    str2 = f8.f21669c;
                    str6 = "audio/mp4a-latm";
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i132222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E2222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d72222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d72222222222222;
                    d72222222222222.e(E2222222222222);
                    return;
                case 14:
                    str6 = "audio/ac3";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i1322222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E22222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d722222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d722222222222222;
                    d722222222222222.e(E22222222222222);
                    return;
                case 15:
                case 21:
                    str6 = "audio/vnd.dts";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i13222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d7222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d7222222222222222;
                    d7222222222222222.e(E222222222222222);
                    return;
                case 16:
                    str6 = "video/av01";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i132222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E2222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d72222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d72222222222222222;
                    d72222222222222222.e(E2222222222222222);
                    return;
                case 17:
                    str6 = "video/x-vnd.on2.vp8";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i1322222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E22222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d722222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d722222222222222222;
                    d722222222222222222.e(E22222222222222222);
                    return;
                case 18:
                    str6 = "video/x-vnd.on2.vp9";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i13222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d7222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d7222222222222222222;
                    d7222222222222222222.e(E222222222222222222);
                    return;
                case 19:
                    singletonList = null;
                    str2 = null;
                    str6 = "application/pgs";
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i132222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E2222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d72222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d72222222222222222222;
                    d72222222222222222222.e(E2222222222222222222);
                    return;
                case 20:
                    str6 = "video/x-unknown";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i1322222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E22222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d722222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d722222222222222222222;
                    d722222222222222222222.e(E22222222222222222222);
                    return;
                case 22:
                    if (this.P == 32) {
                        singletonList = null;
                        str2 = null;
                        i8 = 4;
                        i9 = -1;
                        bArr = this.N;
                        if (bArr != null) {
                        }
                        str4 = str6;
                        int i13222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                        bVar = new s1.b();
                        if (!v.o(str4)) {
                        }
                        if (this.f1789a != null) {
                        }
                        s1 E222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                        e0 d7222222222222222222222 = nVar.d(this.f1791c, i10);
                        this.X = d7222222222222222222222;
                        d7222222222222222222222.e(E222222222222222222222);
                        return;
                    }
                    sb = new StringBuilder();
                    str = "Unsupported floating point PCM bit depth: ";
                    sb.append(str);
                    sb.append(this.P);
                    sb.append(". Setting mimeType to ");
                    sb.append("audio/x-unknown");
                    o2.r.i("MatroskaExtractor", sb.toString());
                    singletonList = null;
                    str2 = null;
                    str6 = "audio/x-unknown";
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i132222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E2222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d72222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d72222222222222222222222;
                    d72222222222222222222222.e(E2222222222222222222222);
                    return;
                case 23:
                    int i16 = this.P;
                    if (i16 == 8) {
                        singletonList = null;
                        str2 = null;
                        i8 = 3;
                    } else if (i16 == 16) {
                        singletonList = null;
                        str2 = null;
                        i8 = 268435456;
                    } else {
                        sb = new StringBuilder();
                        str = "Unsupported big endian PCM bit depth: ";
                        sb.append(str);
                        sb.append(this.P);
                        sb.append(". Setting mimeType to ");
                        sb.append("audio/x-unknown");
                        o2.r.i("MatroskaExtractor", sb.toString());
                        singletonList = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i8 = -1;
                    }
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i1322222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E22222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d722222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d722222222222222222222222;
                    d722222222222222222222222.e(E22222222222222222222222);
                    return;
                case 24:
                    b02 = m0.b0(this.P);
                    if (b02 == 0) {
                        sb = new StringBuilder();
                        str = "Unsupported little endian PCM bit depth: ";
                        sb.append(str);
                        sb.append(this.P);
                        sb.append(". Setting mimeType to ");
                        sb.append("audio/x-unknown");
                        o2.r.i("MatroskaExtractor", sb.toString());
                        singletonList = null;
                        str2 = null;
                        str6 = "audio/x-unknown";
                        i8 = -1;
                        i9 = -1;
                        bArr = this.N;
                        if (bArr != null) {
                        }
                        str4 = str6;
                        int i13222222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                        bVar = new s1.b();
                        if (!v.o(str4)) {
                        }
                        if (this.f1789a != null) {
                        }
                        s1 E222222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                        e0 d7222222222222222222222222 = nVar.d(this.f1791c, i10);
                        this.X = d7222222222222222222222222;
                        d7222222222222222222222222.e(E222222222222222222222222);
                        return;
                    }
                    i8 = b02;
                    singletonList = null;
                    str2 = null;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i132222222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E2222222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132222222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d72222222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d72222222222222222222222222;
                    d72222222222222222222222222.e(E2222222222222222222222222);
                    return;
                case 25:
                    singletonList = m4.q.z(e.f1755e0, g(this.f1790b));
                    str2 = null;
                    str6 = "text/x-ssa";
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i1322222222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E22222222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322222222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d722222222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d722222222222222222222222222;
                    d722222222222222222222222222.e(E22222222222222222222222222);
                    return;
                case 26:
                    p2.f a8 = p2.f.a(new a0(g(this.f1790b)));
                    list = a8.f20002a;
                    this.Y = a8.f20003b;
                    str3 = a8.f20007f;
                    str6 = "video/hevc";
                    i8 = -1;
                    i9 = -1;
                    List<byte[]> list22 = list;
                    str2 = str3;
                    singletonList = list22;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i13222222222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E222222222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222222222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d7222222222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d7222222222222222222222222222;
                    d7222222222222222222222222222.e(E222222222222222222222222222);
                    return;
                case 27:
                    singletonList = null;
                    str2 = null;
                    str6 = "text/vtt";
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i132222222222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E2222222222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132222222222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d72222222222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d72222222222222222222222222222;
                    d72222222222222222222222222222.e(E2222222222222222222222222222);
                    return;
                case 28:
                    str6 = "application/x-subrip";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i1322222222222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E22222222222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322222222222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d722222222222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d722222222222222222222222222222;
                    d722222222222222222222222222222.e(E22222222222222222222222222222);
                    return;
                case 29:
                    str6 = "video/mpeg2";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i13222222222222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E222222222222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222222222222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d7222222222222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d7222222222222222222222222222222;
                    d7222222222222222222222222222222.e(E222222222222222222222222222222);
                    return;
                case 30:
                    str6 = "audio/eac3";
                    singletonList = null;
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i132222222222222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E2222222222222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i132222222222222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d72222222222222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d72222222222222222222222222222222;
                    d72222222222222222222222222222222.e(E2222222222222222222222222222222);
                    return;
                case 31:
                    singletonList = Collections.singletonList(g(this.f1790b));
                    str6 = "audio/flac";
                    str2 = null;
                    i8 = -1;
                    i9 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i1322222222222222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E22222222222222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i1322222222222222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d722222222222222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d722222222222222222222222222222222;
                    d722222222222222222222222222222222.e(E22222222222222222222222222222222);
                    return;
                case ' ':
                    singletonList = new ArrayList<>(3);
                    singletonList.add(g(this.f1790b));
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    singletonList.add(allocate.order(byteOrder).putLong(this.R).array());
                    singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str6 = "audio/opus";
                    str2 = null;
                    i8 = -1;
                    i9 = 5760;
                    bArr = this.N;
                    if (bArr != null) {
                    }
                    str4 = str6;
                    int i13222222222222222222222222222222222 = (!this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
                    bVar = new s1.b();
                    if (!v.o(str4)) {
                    }
                    if (this.f1789a != null) {
                    }
                    s1 E222222222222222222222222222222222 = bVar.R(i7).e0(str4).W(i9).V(this.W).g0(i13222222222222222222222222222222222).T(singletonList).I(str2).M(this.f1800l).E();
                    e0 d7222222222222222222222222222222222 = nVar.d(this.f1791c, i10);
                    this.X = d7222222222222222222222222222222222;
                    d7222222222222222222222222222222222.e(E222222222222222222222222222222222);
                    return;
                default:
                    throw n2.a("Unrecognized codec identifier.", null);
            }
        }

        public void j() {
            f0 f0Var = this.T;
            if (f0Var != null) {
                f0Var.a(this.X, this.f1798j);
            }
        }

        public void n() {
            f0 f0Var = this.T;
            if (f0Var != null) {
                f0Var.b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f1759i0 = Collections.unmodifiableMap(hashMap);
    }

    public e() {
        this(0);
    }

    public e(int i7) {
        this(new c1.a(), i7);
    }

    e(c1.c cVar, int i7) {
        this.f1778q = -1L;
        this.f1779r = -9223372036854775807L;
        this.f1780s = -9223372036854775807L;
        this.f1781t = -9223372036854775807L;
        this.f1787z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f1760a = cVar;
        cVar.c(new b());
        this.f1765d = (i7 & 1) == 0;
        this.f1762b = new g();
        this.f1764c = new SparseArray<>();
        this.f1768g = new a0(4);
        this.f1769h = new a0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f1770i = new a0(4);
        this.f1766e = new a0(w.f19796a);
        this.f1767f = new a0(4);
        this.f1771j = new a0();
        this.f1772k = new a0();
        this.f1773l = new a0(8);
        this.f1774m = new a0();
        this.f1775n = new a0();
        this.L = new int[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] B() {
        return new l[]{new e()};
    }

    private boolean C(w0.a0 a0Var, long j7) {
        if (this.f1786y) {
            this.A = j7;
            a0Var.f22873a = this.f1787z;
            this.f1786y = false;
            return true;
        }
        if (this.f1783v) {
            long j8 = this.A;
            if (j8 != -1) {
                a0Var.f22873a = j8;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    private void D(m mVar, int i7) {
        if (this.f1768g.f() >= i7) {
            return;
        }
        if (this.f1768g.b() < i7) {
            a0 a0Var = this.f1768g;
            a0Var.c(Math.max(a0Var.b() * 2, i7));
        }
        mVar.readFully(this.f1768g.d(), this.f1768g.f(), i7 - this.f1768g.f());
        this.f1768g.N(i7);
    }

    private void E() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f1761a0 = false;
        this.f1771j.K(0);
    }

    private long F(long j7) {
        long j8 = this.f1779r;
        if (j8 != -9223372036854775807L) {
            return m0.N0(j7, j8, 1000L);
        }
        throw n2.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void G(String str, long j7, byte[] bArr) {
        byte[] t6;
        int i7;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                t6 = t(j7, "%01d:%02d:%02d:%02d", 10000L);
                i7 = 21;
                break;
            case "S_TEXT/WEBVTT":
                t6 = t(j7, "%02d:%02d:%02d.%03d", 1000L);
                i7 = 25;
                break;
            case "S_TEXT/UTF8":
                t6 = t(j7, "%02d:%02d:%02d,%03d", 1000L);
                i7 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(t6, 0, bArr, i7, t6.length);
    }

    private int J(m mVar, c cVar, int i7, boolean z6) {
        int i8;
        if ("S_TEXT/UTF8".equals(cVar.f1790b)) {
            K(mVar, f1754d0, i7);
        } else if ("S_TEXT/ASS".equals(cVar.f1790b)) {
            K(mVar, f1756f0, i7);
        } else {
            if (!"S_TEXT/WEBVTT".equals(cVar.f1790b)) {
                e0 e0Var = cVar.X;
                if (!this.V) {
                    if (cVar.f1796h) {
                        this.O &= -1073741825;
                        if (!this.W) {
                            mVar.readFully(this.f1768g.d(), 0, 1);
                            this.S++;
                            if ((this.f1768g.d()[0] & 128) == 128) {
                                throw n2.a("Extension bit is set in signal byte", null);
                            }
                            this.Z = this.f1768g.d()[0];
                            this.W = true;
                        }
                        byte b7 = this.Z;
                        if ((b7 & 1) == 1) {
                            boolean z7 = (b7 & 2) == 2;
                            this.O |= 1073741824;
                            if (!this.f1761a0) {
                                mVar.readFully(this.f1773l.d(), 0, 8);
                                this.S += 8;
                                this.f1761a0 = true;
                                this.f1768g.d()[0] = (byte) ((z7 ? 128 : 0) | 8);
                                this.f1768g.O(0);
                                e0Var.c(this.f1768g, 1, 1);
                                this.T++;
                                this.f1773l.O(0);
                                e0Var.c(this.f1773l, 8, 1);
                                this.T += 8;
                            }
                            if (z7) {
                                if (!this.X) {
                                    mVar.readFully(this.f1768g.d(), 0, 1);
                                    this.S++;
                                    this.f1768g.O(0);
                                    this.Y = this.f1768g.C();
                                    this.X = true;
                                }
                                int i9 = this.Y * 4;
                                this.f1768g.K(i9);
                                mVar.readFully(this.f1768g.d(), 0, i9);
                                this.S += i9;
                                short s7 = (short) ((this.Y / 2) + 1);
                                int i10 = (s7 * 6) + 2;
                                ByteBuffer byteBuffer = this.f1776o;
                                if (byteBuffer == null || byteBuffer.capacity() < i10) {
                                    this.f1776o = ByteBuffer.allocate(i10);
                                }
                                this.f1776o.position(0);
                                this.f1776o.putShort(s7);
                                int i11 = 0;
                                int i12 = 0;
                                while (true) {
                                    i8 = this.Y;
                                    if (i11 >= i8) {
                                        break;
                                    }
                                    int G = this.f1768g.G();
                                    if (i11 % 2 == 0) {
                                        this.f1776o.putShort((short) (G - i12));
                                    } else {
                                        this.f1776o.putInt(G - i12);
                                    }
                                    i11++;
                                    i12 = G;
                                }
                                int i13 = (i7 - this.S) - i12;
                                int i14 = i8 % 2;
                                ByteBuffer byteBuffer2 = this.f1776o;
                                if (i14 == 1) {
                                    byteBuffer2.putInt(i13);
                                } else {
                                    byteBuffer2.putShort((short) i13);
                                    this.f1776o.putInt(0);
                                }
                                this.f1774m.M(this.f1776o.array(), i10);
                                e0Var.c(this.f1774m, i10, 1);
                                this.T += i10;
                            }
                        }
                    } else {
                        byte[] bArr = cVar.f1797i;
                        if (bArr != null) {
                            this.f1771j.M(bArr, bArr.length);
                        }
                    }
                    if (cVar.o(z6)) {
                        this.O |= 268435456;
                        this.f1775n.K(0);
                        int f7 = (this.f1771j.f() + i7) - this.S;
                        this.f1768g.K(4);
                        this.f1768g.d()[0] = (byte) ((f7 >> 24) & 255);
                        this.f1768g.d()[1] = (byte) ((f7 >> 16) & 255);
                        this.f1768g.d()[2] = (byte) ((f7 >> 8) & 255);
                        this.f1768g.d()[3] = (byte) (f7 & 255);
                        e0Var.c(this.f1768g, 4, 2);
                        this.T += 4;
                    }
                    this.V = true;
                }
                int f8 = i7 + this.f1771j.f();
                if (!"V_MPEG4/ISO/AVC".equals(cVar.f1790b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f1790b)) {
                    if (cVar.T != null) {
                        o2.a.f(this.f1771j.f() == 0);
                        cVar.T.d(mVar);
                    }
                    while (true) {
                        int i15 = this.S;
                        if (i15 >= f8) {
                            break;
                        }
                        int L = L(mVar, e0Var, f8 - i15);
                        this.S += L;
                        this.T += L;
                    }
                } else {
                    byte[] d7 = this.f1767f.d();
                    d7[0] = 0;
                    d7[1] = 0;
                    d7[2] = 0;
                    int i16 = cVar.Y;
                    int i17 = 4 - i16;
                    while (this.S < f8) {
                        int i18 = this.U;
                        if (i18 == 0) {
                            M(mVar, d7, i17, i16);
                            this.S += i16;
                            this.f1767f.O(0);
                            this.U = this.f1767f.G();
                            this.f1766e.O(0);
                            e0Var.d(this.f1766e, 4);
                            this.T += 4;
                        } else {
                            int L2 = L(mVar, e0Var, i18);
                            this.S += L2;
                            this.T += L2;
                            this.U -= L2;
                        }
                    }
                }
                if ("A_VORBIS".equals(cVar.f1790b)) {
                    this.f1769h.O(0);
                    e0Var.d(this.f1769h, 4);
                    this.T += 4;
                }
                return r();
            }
            K(mVar, f1757g0, i7);
        }
        return r();
    }

    private void K(m mVar, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        if (this.f1772k.b() < length) {
            this.f1772k.L(Arrays.copyOf(bArr, length + i7));
        } else {
            System.arraycopy(bArr, 0, this.f1772k.d(), 0, bArr.length);
        }
        mVar.readFully(this.f1772k.d(), bArr.length, i7);
        this.f1772k.O(0);
        this.f1772k.N(length);
    }

    private int L(m mVar, e0 e0Var, int i7) {
        int a7 = this.f1771j.a();
        if (a7 <= 0) {
            return e0Var.a(mVar, i7, false);
        }
        int min = Math.min(i7, a7);
        e0Var.d(this.f1771j, min);
        return min;
    }

    private void M(m mVar, byte[] bArr, int i7, int i8) {
        int min = Math.min(i8, this.f1771j.a());
        mVar.readFully(bArr, i7 + min, i8 - min);
        if (min > 0) {
            this.f1771j.j(bArr, i7, min);
        }
    }

    private void j(int i7) {
        if (this.C == null || this.D == null) {
            throw n2.a("Element " + i7 + " must be in a Cues", null);
        }
    }

    private void k(int i7) {
        if (this.f1782u != null) {
            return;
        }
        throw n2.a("Element " + i7 + " must be in a TrackEntry", null);
    }

    private void l() {
        o2.a.h(this.f1763b0);
    }

    private b0 n(s sVar, s sVar2) {
        int i7;
        if (this.f1778q == -1 || this.f1781t == -9223372036854775807L || sVar == null || sVar.c() == 0 || sVar2 == null || sVar2.c() != sVar.c()) {
            return new b0.b(this.f1781t);
        }
        int c7 = sVar.c();
        int[] iArr = new int[c7];
        long[] jArr = new long[c7];
        long[] jArr2 = new long[c7];
        long[] jArr3 = new long[c7];
        int i8 = 0;
        for (int i9 = 0; i9 < c7; i9++) {
            jArr3[i9] = sVar.b(i9);
            jArr[i9] = this.f1778q + sVar2.b(i9);
        }
        while (true) {
            i7 = c7 - 1;
            if (i8 >= i7) {
                break;
            }
            int i10 = i8 + 1;
            iArr[i8] = (int) (jArr[i10] - jArr[i8]);
            jArr2[i8] = jArr3[i10] - jArr3[i8];
            i8 = i10;
        }
        iArr[i7] = (int) ((this.f1778q + this.f1777p) - jArr[i7]);
        jArr2[i7] = this.f1781t - jArr3[i7];
        long j7 = jArr2[i7];
        if (j7 <= 0) {
            o2.r.i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j7);
            iArr = Arrays.copyOf(iArr, i7);
            jArr = Arrays.copyOf(jArr, i7);
            jArr2 = Arrays.copyOf(jArr2, i7);
            jArr3 = Arrays.copyOf(jArr3, i7);
        }
        return new w0.d(iArr, jArr, jArr2, jArr3);
    }

    private void o(c cVar, long j7, int i7, int i8, int i9) {
        String str;
        f0 f0Var = cVar.T;
        if (f0Var != null) {
            f0Var.c(cVar.X, j7, i7, i8, i9, cVar.f1798j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f1790b) || "S_TEXT/ASS".equals(cVar.f1790b) || "S_TEXT/WEBVTT".equals(cVar.f1790b)) {
                if (this.K > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j8 = this.I;
                    if (j8 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        G(cVar.f1790b, j8, this.f1772k.d());
                        int e7 = this.f1772k.e();
                        while (true) {
                            if (e7 >= this.f1772k.f()) {
                                break;
                            }
                            if (this.f1772k.d()[e7] == 0) {
                                this.f1772k.N(e7);
                                break;
                            }
                            e7++;
                        }
                        e0 e0Var = cVar.X;
                        a0 a0Var = this.f1772k;
                        e0Var.d(a0Var, a0Var.f());
                        i8 += this.f1772k.f();
                    }
                }
                o2.r.i("MatroskaExtractor", str);
            }
            if ((268435456 & i7) != 0) {
                if (this.K > 1) {
                    this.f1775n.K(0);
                } else {
                    int f7 = this.f1775n.f();
                    cVar.X.c(this.f1775n, f7, 2);
                    i8 += f7;
                }
            }
            cVar.X.b(j7, i7, i8, i9, cVar.f1798j);
        }
        this.F = true;
    }

    private static int[] q(int[] iArr, int i7) {
        return iArr == null ? new int[i7] : iArr.length >= i7 ? iArr : new int[Math.max(iArr.length * 2, i7)];
    }

    private int r() {
        int i7 = this.T;
        E();
        return i7;
    }

    private static byte[] t(long j7, String str, long j8) {
        o2.a.a(j7 != -9223372036854775807L);
        int i7 = (int) (j7 / 3600000000L);
        long j9 = j7 - ((i7 * 3600) * 1000000);
        int i8 = (int) (j9 / 60000000);
        long j10 = j9 - ((i8 * 60) * 1000000);
        int i9 = (int) (j10 / 1000000);
        return m0.m0(String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf((int) ((j10 - (i9 * 1000000)) / j8))));
    }

    private static boolean z(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    protected boolean A(int i7) {
        return i7 == 357149030 || i7 == 524531317 || i7 == 475249515 || i7 == 374648427;
    }

    protected void H(int i7, long j7, long j8) {
        l();
        if (i7 == 160) {
            this.Q = false;
            this.R = 0L;
            return;
        }
        if (i7 == 174) {
            this.f1782u = new c();
            return;
        }
        if (i7 == 187) {
            this.E = false;
            return;
        }
        if (i7 == 19899) {
            this.f1784w = -1;
            this.f1785x = -1L;
            return;
        }
        if (i7 == 20533) {
            u(i7).f1796h = true;
            return;
        }
        if (i7 == 21968) {
            u(i7).f1812x = true;
            return;
        }
        if (i7 == 408125543) {
            long j9 = this.f1778q;
            if (j9 != -1 && j9 != j7) {
                throw n2.a("Multiple Segment elements not supported", null);
            }
            this.f1778q = j7;
            this.f1777p = j8;
            return;
        }
        if (i7 == 475249515) {
            this.C = new s();
            this.D = new s();
        } else if (i7 == 524531317 && !this.f1783v) {
            if (this.f1765d && this.f1787z != -1) {
                this.f1786y = true;
            } else {
                this.f1763b0.i(new b0.b(this.f1781t));
                this.f1783v = true;
            }
        }
    }

    protected void I(int i7, String str) {
        if (i7 == 134) {
            u(i7).f1790b = str;
            return;
        }
        if (i7 != 17026) {
            if (i7 == 21358) {
                u(i7).f1789a = str;
                return;
            } else {
                if (i7 != 2274716) {
                    return;
                }
                u(i7).W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw n2.a("DocType " + str + " not supported", null);
    }

    @Override // w0.l
    public final void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f1760a.a();
        this.f1762b.e();
        E();
        for (int i7 = 0; i7 < this.f1764c.size(); i7++) {
            this.f1764c.valueAt(i7).n();
        }
    }

    @Override // w0.l
    public final void d(n nVar) {
        this.f1763b0 = nVar;
    }

    @Override // w0.l
    public final int e(m mVar, w0.a0 a0Var) {
        this.F = false;
        boolean z6 = true;
        while (z6 && !this.F) {
            z6 = this.f1760a.b(mVar);
            if (z6 && C(a0Var, mVar.p())) {
                return 1;
            }
        }
        if (z6) {
            return 0;
        }
        for (int i7 = 0; i7 < this.f1764c.size(); i7++) {
            c valueAt = this.f1764c.valueAt(i7);
            valueAt.f();
            valueAt.j();
        }
        return -1;
    }

    @Override // w0.l
    public final boolean h(m mVar) {
        return new f().b(mVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x023b, code lost:
    
        throw r0.n2.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void m(int i7, int i8, m mVar) {
        long j7;
        long j8;
        int i9;
        int i10;
        int[] iArr;
        int i11 = 0;
        int i12 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (this.G != 2) {
                    return;
                }
                x(this.f1764c.get(this.M), this.P, mVar, i8);
                return;
            }
            if (i7 == 16877) {
                w(u(i7), mVar, i8);
                return;
            }
            if (i7 == 16981) {
                k(i7);
                byte[] bArr = new byte[i8];
                this.f1782u.f1797i = bArr;
                mVar.readFully(bArr, 0, i8);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr2 = new byte[i8];
                mVar.readFully(bArr2, 0, i8);
                u(i7).f1798j = new e0.a(1, bArr2, 0, 0);
                return;
            }
            if (i7 == 21419) {
                Arrays.fill(this.f1770i.d(), (byte) 0);
                mVar.readFully(this.f1770i.d(), 4 - i8, i8);
                this.f1770i.O(0);
                this.f1784w = (int) this.f1770i.E();
                return;
            }
            if (i7 == 25506) {
                k(i7);
                byte[] bArr3 = new byte[i8];
                this.f1782u.f1799k = bArr3;
                mVar.readFully(bArr3, 0, i8);
                return;
            }
            if (i7 != 30322) {
                throw n2.a("Unexpected id: " + i7, null);
            }
            k(i7);
            byte[] bArr4 = new byte[i8];
            this.f1782u.f1810v = bArr4;
            mVar.readFully(bArr4, 0, i8);
            return;
        }
        if (this.G == 0) {
            this.M = (int) this.f1762b.d(mVar, false, true, 8);
            this.N = this.f1762b.b();
            this.I = -9223372036854775807L;
            this.G = 1;
            this.f1768g.K(0);
        }
        c cVar = this.f1764c.get(this.M);
        if (cVar == null) {
            mVar.i(i8 - this.N);
            this.G = 0;
            return;
        }
        cVar.f();
        if (this.G == 1) {
            D(mVar, 3);
            int i13 = (this.f1768g.d()[2] & 6) >> 1;
            byte b7 = 255;
            if (i13 == 0) {
                this.K = 1;
                int[] q7 = q(this.L, 1);
                this.L = q7;
                q7[0] = (i8 - this.N) - 3;
            } else {
                int i14 = 4;
                D(mVar, 4);
                int i15 = (this.f1768g.d()[3] & 255) + 1;
                this.K = i15;
                int[] q8 = q(this.L, i15);
                this.L = q8;
                if (i13 == 2) {
                    int i16 = (i8 - this.N) - 4;
                    int i17 = this.K;
                    Arrays.fill(q8, 0, i17, i16 / i17);
                } else if (i13 == 1) {
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        i9 = this.K;
                        if (i18 >= i9 - 1) {
                            break;
                        }
                        this.L[i18] = 0;
                        do {
                            i14++;
                            D(mVar, i14);
                            i10 = this.f1768g.d()[i14 - 1] & 255;
                            iArr = this.L;
                            iArr[i18] = iArr[i18] + i10;
                        } while (i10 == 255);
                        i19 += iArr[i18];
                        i18++;
                    }
                    this.L[i9 - 1] = ((i8 - this.N) - i14) - i19;
                } else {
                    if (i13 != 3) {
                        throw n2.a("Unexpected lacing value: " + i13, null);
                    }
                    int i20 = 0;
                    int i21 = 0;
                    while (true) {
                        int i22 = this.K;
                        if (i20 >= i22 - 1) {
                            this.L[i22 - 1] = ((i8 - this.N) - i14) - i21;
                            break;
                        }
                        this.L[i20] = i11;
                        i14++;
                        D(mVar, i14);
                        int i23 = i14 - 1;
                        if (this.f1768g.d()[i23] == 0) {
                            throw n2.a("No valid varint length mask found", null);
                        }
                        int i24 = 0;
                        while (true) {
                            if (i24 >= 8) {
                                j7 = 0;
                                break;
                            }
                            int i25 = i12 << (7 - i24);
                            if ((this.f1768g.d()[i23] & i25) != 0) {
                                int i26 = i14 + i24;
                                D(mVar, i26);
                                long j9 = this.f1768g.d()[i23] & b7 & (i25 ^ (-1));
                                int i27 = i23 + 1;
                                while (true) {
                                    j8 = j9;
                                    if (i27 >= i26) {
                                        break;
                                    }
                                    j9 = (j8 << 8) | (this.f1768g.d()[i27] & b7);
                                    i27++;
                                    i26 = i26;
                                    b7 = 255;
                                }
                                int i28 = i26;
                                if (i20 > 0) {
                                    j8 -= (1 << ((i24 * 7) + 6)) - 1;
                                }
                                j7 = j8;
                                i14 = i28;
                            } else {
                                i24++;
                                i12 = 1;
                                b7 = 255;
                            }
                        }
                        if (j7 < -2147483648L || j7 > 2147483647L) {
                            break;
                        }
                        int i29 = (int) j7;
                        int[] iArr2 = this.L;
                        if (i20 != 0) {
                            i29 += iArr2[i20 - 1];
                        }
                        iArr2[i20] = i29;
                        i21 += iArr2[i20];
                        i20++;
                        i11 = 0;
                        i12 = 1;
                        b7 = 255;
                    }
                }
            }
            this.H = this.B + F((this.f1768g.d()[0] << 8) | (this.f1768g.d()[1] & 255));
            this.O = (cVar.f1792d == 2 || (i7 == 163 && (this.f1768g.d()[2] & 128) == 128)) ? 1 : 0;
            this.G = 2;
            this.J = 0;
        }
        if (i7 == 163) {
            while (true) {
                int i30 = this.J;
                if (i30 >= this.K) {
                    this.G = 0;
                    return;
                } else {
                    o(cVar, ((this.J * cVar.f1793e) / 1000) + this.H, this.O, J(mVar, cVar, this.L[i30], false), 0);
                    this.J++;
                }
            }
        } else {
            while (true) {
                int i31 = this.J;
                if (i31 >= this.K) {
                    return;
                }
                int[] iArr3 = this.L;
                iArr3[i31] = J(mVar, cVar, iArr3[i31], true);
                this.J++;
            }
        }
    }

    protected void p(int i7) {
        l();
        if (i7 == 160) {
            if (this.G != 2) {
                return;
            }
            c cVar = this.f1764c.get(this.M);
            cVar.f();
            if (this.R > 0 && "A_OPUS".equals(cVar.f1790b)) {
                this.f1775n.L(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
            }
            int i8 = 0;
            for (int i9 = 0; i9 < this.K; i9++) {
                i8 += this.L[i9];
            }
            int i10 = 0;
            while (i10 < this.K) {
                long j7 = ((cVar.f1793e * i10) / 1000) + this.H;
                int i11 = this.O;
                if (i10 == 0 && !this.Q) {
                    i11 |= 1;
                }
                int i12 = this.L[i10];
                int i13 = i8 - i12;
                o(cVar, j7, i11, i12, i13);
                i10++;
                i8 = i13;
            }
            this.G = 0;
            return;
        }
        if (i7 == 174) {
            c cVar2 = (c) o2.a.h(this.f1782u);
            String str = cVar2.f1790b;
            if (str == null) {
                throw n2.a("CodecId is missing in TrackEntry element", null);
            }
            if (z(str)) {
                cVar2.i(this.f1763b0, cVar2.f1791c);
                this.f1764c.put(cVar2.f1791c, cVar2);
            }
            this.f1782u = null;
            return;
        }
        if (i7 == 19899) {
            int i14 = this.f1784w;
            if (i14 != -1) {
                long j8 = this.f1785x;
                if (j8 != -1) {
                    if (i14 == 475249515) {
                        this.f1787z = j8;
                        return;
                    }
                    return;
                }
            }
            throw n2.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i7 == 25152) {
            k(i7);
            c cVar3 = this.f1782u;
            if (cVar3.f1796h) {
                if (cVar3.f1798j == null) {
                    throw n2.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f1800l = new v0.m(new m.b(j.f20683a, "video/webm", this.f1782u.f1798j.f22895b));
                return;
            }
            return;
        }
        if (i7 == 28032) {
            k(i7);
            c cVar4 = this.f1782u;
            if (cVar4.f1796h && cVar4.f1797i != null) {
                throw n2.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i7 == 357149030) {
            if (this.f1779r == -9223372036854775807L) {
                this.f1779r = 1000000L;
            }
            long j9 = this.f1780s;
            if (j9 != -9223372036854775807L) {
                this.f1781t = F(j9);
                return;
            }
            return;
        }
        if (i7 == 374648427) {
            if (this.f1764c.size() == 0) {
                throw n2.a("No valid tracks were found", null);
            }
            this.f1763b0.j();
        } else {
            if (i7 != 475249515) {
                return;
            }
            if (!this.f1783v) {
                this.f1763b0.i(n(this.C, this.D));
                this.f1783v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    protected void s(int i7, double d7) {
        if (i7 == 181) {
            u(i7).Q = (int) d7;
        }
        if (i7 == 17545) {
            this.f1780s = (long) d7;
            return;
        }
        switch (i7) {
            case 21969:
                u(i7).D = (float) d7;
                break;
            case 21970:
                u(i7).E = (float) d7;
                break;
            case 21971:
                u(i7).F = (float) d7;
                break;
            case 21972:
                u(i7).G = (float) d7;
                break;
            case 21973:
                u(i7).H = (float) d7;
                break;
            case 21974:
                u(i7).I = (float) d7;
                break;
            case 21975:
                u(i7).J = (float) d7;
                break;
            case 21976:
                u(i7).K = (float) d7;
                break;
            case 21977:
                u(i7).L = (float) d7;
                break;
            case 21978:
                u(i7).M = (float) d7;
                break;
            default:
                switch (i7) {
                    case 30323:
                        u(i7).f1807s = (float) d7;
                        break;
                    case 30324:
                        u(i7).f1808t = (float) d7;
                        break;
                    case 30325:
                        u(i7).f1809u = (float) d7;
                        break;
                }
        }
    }

    protected c u(int i7) {
        k(i7);
        return this.f1782u;
    }

    protected int v(int i7) {
        switch (i7) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void w(c cVar, w0.m mVar, int i7) {
        if (cVar.f1795g != 1685485123 && cVar.f1795g != 1685480259) {
            mVar.i(i7);
            return;
        }
        byte[] bArr = new byte[i7];
        cVar.N = bArr;
        mVar.readFully(bArr, 0, i7);
    }

    protected void x(c cVar, int i7, w0.m mVar, int i8) {
        if (i7 != 4 || !"V_VP9".equals(cVar.f1790b)) {
            mVar.i(i8);
        } else {
            this.f1775n.K(i8);
            mVar.readFully(this.f1775n.d(), 0, i8);
        }
    }

    protected void y(int i7, long j7) {
        if (i7 == 20529) {
            if (j7 == 0) {
                return;
            }
            throw n2.a("ContentEncodingOrder " + j7 + " not supported", null);
        }
        if (i7 == 20530) {
            if (j7 == 1) {
                return;
            }
            throw n2.a("ContentEncodingScope " + j7 + " not supported", null);
        }
        switch (i7) {
            case 131:
                u(i7).f1792d = (int) j7;
                return;
            case 136:
                u(i7).V = j7 == 1;
                return;
            case 155:
                this.I = F(j7);
                return;
            case 159:
                u(i7).O = (int) j7;
                return;
            case 176:
                u(i7).f1801m = (int) j7;
                return;
            case 179:
                j(i7);
                this.C.a(F(j7));
                return;
            case 186:
                u(i7).f1802n = (int) j7;
                return;
            case 215:
                u(i7).f1791c = (int) j7;
                return;
            case 231:
                this.B = F(j7);
                return;
            case 238:
                this.P = (int) j7;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                j(i7);
                this.D.a(j7);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                u(i7).f1795g = (int) j7;
                return;
            case 16980:
                if (j7 == 3) {
                    return;
                }
                throw n2.a("ContentCompAlgo " + j7 + " not supported", null);
            case 17029:
                if (j7 < 1 || j7 > 2) {
                    throw n2.a("DocTypeReadVersion " + j7 + " not supported", null);
                }
                return;
            case 17143:
                if (j7 == 1) {
                    return;
                }
                throw n2.a("EBMLReadVersion " + j7 + " not supported", null);
            case 18401:
                if (j7 == 5) {
                    return;
                }
                throw n2.a("ContentEncAlgo " + j7 + " not supported", null);
            case 18408:
                if (j7 == 1) {
                    return;
                }
                throw n2.a("AESSettingsCipherMode " + j7 + " not supported", null);
            case 21420:
                this.f1785x = j7 + this.f1778q;
                return;
            case 21432:
                int i8 = (int) j7;
                k(i7);
                if (i8 == 0) {
                    this.f1782u.f1811w = 0;
                    return;
                }
                if (i8 == 1) {
                    this.f1782u.f1811w = 2;
                    return;
                } else if (i8 == 3) {
                    this.f1782u.f1811w = 1;
                    return;
                } else {
                    if (i8 != 15) {
                        return;
                    }
                    this.f1782u.f1811w = 3;
                    return;
                }
            case 21680:
                u(i7).f1803o = (int) j7;
                return;
            case 21682:
                u(i7).f1805q = (int) j7;
                return;
            case 21690:
                u(i7).f1804p = (int) j7;
                return;
            case 21930:
                u(i7).U = j7 == 1;
                return;
            case 21998:
                u(i7).f1794f = (int) j7;
                return;
            case 22186:
                u(i7).R = j7;
                return;
            case 22203:
                u(i7).S = j7;
                return;
            case 25188:
                u(i7).P = (int) j7;
                return;
            case 30114:
                this.R = j7;
                return;
            case 30321:
                k(i7);
                int i9 = (int) j7;
                if (i9 == 0) {
                    this.f1782u.f1806r = 0;
                    return;
                }
                if (i9 == 1) {
                    this.f1782u.f1806r = 1;
                    return;
                } else if (i9 == 2) {
                    this.f1782u.f1806r = 2;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    this.f1782u.f1806r = 3;
                    return;
                }
            case 2352003:
                u(i7).f1793e = (int) j7;
                return;
            case 2807729:
                this.f1779r = j7;
                return;
            default:
                switch (i7) {
                    case 21945:
                        k(i7);
                        int i10 = (int) j7;
                        if (i10 == 1) {
                            this.f1782u.A = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            this.f1782u.A = 1;
                            return;
                        }
                    case 21946:
                        k(i7);
                        int c7 = p2.c.c((int) j7);
                        if (c7 != -1) {
                            this.f1782u.f1814z = c7;
                            return;
                        }
                        return;
                    case 21947:
                        k(i7);
                        this.f1782u.f1812x = true;
                        int b7 = p2.c.b((int) j7);
                        if (b7 != -1) {
                            this.f1782u.f1813y = b7;
                            return;
                        }
                        return;
                    case 21948:
                        u(i7).B = (int) j7;
                        return;
                    case 21949:
                        u(i7).C = (int) j7;
                        return;
                    default:
                        return;
                }
        }
    }
}
