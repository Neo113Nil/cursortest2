package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class uh {
    public boolean L;
    public lh O;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public String f12791a;

    /* renamed from: b, reason: collision with root package name */
    public int f12792b;

    /* renamed from: c, reason: collision with root package name */
    public int f12793c;

    /* renamed from: d, reason: collision with root package name */
    public int f12794d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12795e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f12796f;

    /* renamed from: g, reason: collision with root package name */
    public kh f12797g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f12798h;

    /* renamed from: i, reason: collision with root package name */
    public yg f12799i;

    /* renamed from: j, reason: collision with root package name */
    public int f12800j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f12801k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f12802l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f12803m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f12804n = 0;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f12805o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f12806p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12807q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f12808r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f12809s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f12810t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f12811u = 1000;

    /* renamed from: v, reason: collision with root package name */
    public int f12812v = 200;

    /* renamed from: w, reason: collision with root package name */
    public float f12813w = -1.0f;

    /* renamed from: x, reason: collision with root package name */
    public float f12814x = -1.0f;

    /* renamed from: y, reason: collision with root package name */
    public float f12815y = -1.0f;

    /* renamed from: z, reason: collision with root package name */
    public float f12816z = -1.0f;
    public float A = -1.0f;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public int G = 1;
    public int H = -1;
    public int I = 8000;
    public long J = 0;
    public long K = 0;
    public boolean M = true;
    private String N = "eng";

    private uh() {
    }

    /* synthetic */ uh(sh shVar) {
    }

    private static List<byte[]> c(rm rmVar) {
        try {
            rmVar.w(16);
            if (rmVar.k() != 826496599) {
                return null;
            }
            int c7 = rmVar.c() + 20;
            byte[] bArr = rmVar.f11225a;
            while (true) {
                int length = bArr.length;
                if (c7 >= length - 4) {
                    throw new af("Failed to find FourCC VC1 initialization data");
                }
                if (bArr[c7] == 0 && bArr[c7 + 1] == 0 && bArr[c7 + 2] == 1 && bArr[c7 + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, c7, length));
                }
                c7++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new af("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> d(byte[] bArr) {
        int i7;
        int i8;
        try {
            if (bArr[0] != 2) {
                throw new af("Error parsing vorbis codec private");
            }
            int i9 = 1;
            int i10 = 0;
            while (true) {
                i7 = bArr[i9];
                if (i7 != -1) {
                    break;
                }
                i10 += 255;
                i9++;
            }
            int i11 = i9 + 1;
            int i12 = i10 + i7;
            int i13 = 0;
            while (true) {
                i8 = bArr[i11];
                if (i8 != -1) {
                    break;
                }
                i13 += 255;
                i11++;
            }
            int i14 = i11 + 1;
            int i15 = i13 + i8;
            if (bArr[i14] != 1) {
                throw new af("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i14, bArr2, 0, i12);
            int i16 = i14 + i12;
            if (bArr[i16] != 3) {
                throw new af("Error parsing vorbis codec private");
            }
            int i17 = i16 + i15;
            if (bArr[i17] != 5) {
                throw new af("Error parsing vorbis codec private");
            }
            int length = bArr.length - i17;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i17, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new af("Error parsing vorbis codec private");
        }
    }

    private static boolean e(rm rmVar) {
        try {
            int f7 = rmVar.f();
            if (f7 == 1) {
                return true;
            }
            if (f7 == 65534) {
                rmVar.v(24);
                if (rmVar.l() == vh.f13352c0.getMostSignificantBits()) {
                    if (rmVar.l() == vh.f13352c0.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new af("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(dh dhVar, int i7) {
        char c7;
        List<byte[]> singletonList;
        List<byte[]> list;
        int i8;
        int i9;
        String str;
        int h7;
        int i10;
        StringBuilder sb;
        xe m7;
        int i11;
        cn cnVar;
        byte[] bArr;
        int i12;
        String str2 = this.f12791a;
        int i13 = 2;
        switch (str2.hashCode()) {
            case -2095576542:
                if (str2.equals("V_MPEG4/ISO/AP")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case -2095575984:
                if (str2.equals("V_MPEG4/ISO/SP")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -1985379776:
                if (str2.equals("A_MS/ACM")) {
                    c7 = 22;
                    break;
                }
                c7 = 65535;
                break;
            case -1784763192:
                if (str2.equals("A_TRUEHD")) {
                    c7 = 17;
                    break;
                }
                c7 = 65535;
                break;
            case -1730367663:
                if (str2.equals("A_VORBIS")) {
                    c7 = '\n';
                    break;
                }
                c7 = 65535;
                break;
            case -1482641358:
                if (str2.equals("A_MPEG/L2")) {
                    c7 = '\r';
                    break;
                }
                c7 = 65535;
                break;
            case -1482641357:
                if (str2.equals("A_MPEG/L3")) {
                    c7 = 14;
                    break;
                }
                c7 = 65535;
                break;
            case -1373388978:
                if (str2.equals("V_MS/VFW/FOURCC")) {
                    c7 = '\b';
                    break;
                }
                c7 = 65535;
                break;
            case -933872740:
                if (str2.equals("S_DVBSUB")) {
                    c7 = 27;
                    break;
                }
                c7 = 65535;
                break;
            case -538363189:
                if (str2.equals("V_MPEG4/ISO/ASP")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case -538363109:
                if (str2.equals("V_MPEG4/ISO/AVC")) {
                    c7 = 6;
                    break;
                }
                c7 = 65535;
                break;
            case -425012669:
                if (str2.equals("S_VOBSUB")) {
                    c7 = 25;
                    break;
                }
                c7 = 65535;
                break;
            case -356037306:
                if (str2.equals("A_DTS/LOSSLESS")) {
                    c7 = 20;
                    break;
                }
                c7 = 65535;
                break;
            case 62923557:
                if (str2.equals("A_AAC")) {
                    c7 = '\f';
                    break;
                }
                c7 = 65535;
                break;
            case 62923603:
                if (str2.equals("A_AC3")) {
                    c7 = 15;
                    break;
                }
                c7 = 65535;
                break;
            case 62927045:
                if (str2.equals("A_DTS")) {
                    c7 = 18;
                    break;
                }
                c7 = 65535;
                break;
            case 82338133:
                if (str2.equals("V_VP8")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 82338134:
                if (str2.equals("V_VP9")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 99146302:
                if (str2.equals("S_HDMV/PGS")) {
                    c7 = 26;
                    break;
                }
                c7 = 65535;
                break;
            case 444813526:
                if (str2.equals("V_THEORA")) {
                    c7 = '\t';
                    break;
                }
                c7 = 65535;
                break;
            case 542569478:
                if (str2.equals("A_DTS/EXPRESS")) {
                    c7 = 19;
                    break;
                }
                c7 = 65535;
                break;
            case 725957860:
                if (str2.equals("A_PCM/INT/LIT")) {
                    c7 = 23;
                    break;
                }
                c7 = 65535;
                break;
            case 855502857:
                if (str2.equals("V_MPEGH/ISO/HEVC")) {
                    c7 = 7;
                    break;
                }
                c7 = 65535;
                break;
            case 1422270023:
                if (str2.equals("S_TEXT/UTF8")) {
                    c7 = 24;
                    break;
                }
                c7 = 65535;
                break;
            case 1809237540:
                if (str2.equals("V_MPEG2")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 1950749482:
                if (str2.equals("A_EAC3")) {
                    c7 = 16;
                    break;
                }
                c7 = 65535;
                break;
            case 1950789798:
                if (str2.equals("A_FLAC")) {
                    c7 = 21;
                    break;
                }
                c7 = 65535;
                break;
            case 1951062397:
                if (str2.equals("A_OPUS")) {
                    c7 = 11;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        String str3 = "audio/raw";
        switch (c7) {
            case 0:
                str3 = "video/x-vnd.on2.vp8";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i14 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                    m7 = xe.l(Integer.toString(i7), str3, null, -1, i9, this.G, this.I, i8, -1, -1, singletonList, this.f12799i, i14, this.N, null);
                    i13 = 1;
                } else if (om.b(str3)) {
                    if (this.f12804n == 0) {
                        int i15 = this.f12802l;
                        i11 = -1;
                        if (i15 == -1) {
                            i15 = this.f12800j;
                        }
                        this.f12802l = i15;
                        int i16 = this.f12803m;
                        if (i16 == -1) {
                            i16 = this.f12801k;
                        }
                        this.f12803m = i16;
                    } else {
                        i11 = -1;
                    }
                    float f7 = (this.f12802l == i11 || (i12 = this.f12803m) == i11) ? -1.0f : (this.f12801k * r2) / (this.f12800j * i12);
                    if (this.f12807q) {
                        if (this.f12813w == -1.0f || this.f12814x == -1.0f || this.f12815y == -1.0f || this.f12816z == -1.0f || this.A == -1.0f || this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer wrap = ByteBuffer.wrap(bArr);
                            wrap.put((byte) 0);
                            wrap.putShort((short) ((this.f12813w * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.f12814x * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.f12815y * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.f12816z * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.A * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.B * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.C * 50000.0f) + 0.5f));
                            wrap.putShort((short) ((this.D * 50000.0f) + 0.5f));
                            wrap.putShort((short) (this.E + 0.5f));
                            wrap.putShort((short) (this.F + 0.5f));
                            wrap.putShort((short) this.f12811u);
                            wrap.putShort((short) this.f12812v);
                        }
                        cnVar = new cn(this.f12808r, this.f12810t, this.f12809s, bArr);
                    } else {
                        cnVar = null;
                    }
                    m7 = xe.p(Integer.toString(i7), str3, null, -1, i9, this.f12800j, this.f12801k, -1.0f, singletonList, -1, f7, this.f12805o, this.f12806p, cnVar, this.f12799i);
                } else {
                    if ("application/x-subrip".equals(str3)) {
                        m7 = xe.o(Integer.toString(i7), str3, null, -1, i14, this.N, -1, this.f12799i, Long.MAX_VALUE, Collections.emptyList());
                    } else {
                        if (!"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw new af("Unexpected MIME type.");
                        }
                        m7 = xe.m(Integer.toString(i7), str3, null, -1, singletonList, this.N, this.f12799i);
                    }
                    i13 = 3;
                }
                lh c8 = dhVar.c(this.f12792b, i13);
                this.O = c8;
                c8.b(m7);
                return;
            case 1:
                str3 = "video/x-vnd.on2.vp9";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i142 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c82 = dhVar.c(this.f12792b, i13);
                this.O = c82;
                c82.b(m7);
                return;
            case 2:
                str3 = "video/mpeg2";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i1422 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c822 = dhVar.c(this.f12792b, i13);
                this.O = c822;
                c822.b(m7);
                return;
            case 3:
            case 4:
            case 5:
                byte[] bArr2 = this.f12798h;
                singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str3 = "video/mp4v-es";
                i8 = -1;
                i9 = -1;
                int i14222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c8222 = dhVar.c(this.f12792b, i13);
                this.O = c8222;
                c8222.b(m7);
                return;
            case 6:
                an a7 = an.a(new rm(this.f12798h));
                list = a7.f2869a;
                this.P = a7.f2870b;
                str3 = "video/avc";
                singletonList = list;
                i8 = -1;
                i9 = -1;
                int i142222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c82222 = dhVar.c(this.f12792b, i13);
                this.O = c82222;
                c82222.b(m7);
                return;
            case c4.w0.f2149o /* 7 */:
                gn a8 = gn.a(new rm(this.f12798h));
                list = a8.f5689a;
                this.P = a8.f5690b;
                str3 = "video/hevc";
                singletonList = list;
                i8 = -1;
                i9 = -1;
                int i1422222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c822222 = dhVar.c(this.f12792b, i13);
                this.O = c822222;
                c822222.b(m7);
                return;
            case c4.w0.f2150p /* 8 */:
                singletonList = c(new rm(this.f12798h));
                if (singletonList != null) {
                    str3 = "video/wvc1";
                } else {
                    Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                    str3 = "video/x-unknown";
                }
                i8 = -1;
                i9 = -1;
                int i14222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c8222222 = dhVar.c(this.f12792b, i13);
                this.O = c8222222;
                c8222222.b(m7);
                return;
            case '\t':
                str3 = "video/x-unknown";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i142222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c82222222 = dhVar.c(this.f12792b, i13);
                this.O = c82222222;
                c82222222.b(m7);
                return;
            case '\n':
                singletonList = d(this.f12798h);
                str3 = "audio/vorbis";
                i8 = -1;
                i9 = 8192;
                int i1422222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c822222222 = dhVar.c(this.f12792b, i13);
                this.O = c822222222;
                c822222222.b(m7);
                return;
            case 11:
                singletonList = new ArrayList<>(3);
                singletonList.add(this.f12798h);
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.J).array());
                singletonList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.K).array());
                str3 = "audio/opus";
                i8 = -1;
                i9 = 5760;
                int i14222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c8222222222 = dhVar.c(this.f12792b, i13);
                this.O = c8222222222;
                c8222222222.b(m7);
                return;
            case '\f':
                singletonList = Collections.singletonList(this.f12798h);
                str3 = "audio/mp4a-latm";
                i8 = -1;
                i9 = -1;
                int i142222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c82222222222 = dhVar.c(this.f12792b, i13);
                this.O = c82222222222;
                c82222222222.b(m7);
                return;
            case '\r':
                str3 = "audio/mpeg-L2";
                singletonList = null;
                i8 = -1;
                i9 = 4096;
                int i1422222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c822222222222 = dhVar.c(this.f12792b, i13);
                this.O = c822222222222;
                c822222222222.b(m7);
                return;
            case 14:
                str3 = "audio/mpeg";
                singletonList = null;
                i8 = -1;
                i9 = 4096;
                int i14222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c8222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c8222222222222;
                c8222222222222.b(m7);
                return;
            case 15:
                str3 = "audio/ac3";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i142222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c82222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c82222222222222;
                c82222222222222.b(m7);
                return;
            case 16:
                str3 = "audio/eac3";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i1422222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c822222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c822222222222222;
                c822222222222222.b(m7);
                return;
            case 17:
                str3 = "audio/true-hd";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i14222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c8222222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c8222222222222222;
                c8222222222222222.b(m7);
                return;
            case 18:
            case 19:
                str3 = "audio/vnd.dts";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i142222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c82222222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c82222222222222222;
                c82222222222222222.b(m7);
                return;
            case 20:
                str3 = "audio/vnd.dts.hd";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i1422222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c822222222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c822222222222222222;
                c822222222222222222.b(m7);
                return;
            case 21:
                singletonList = Collections.singletonList(this.f12798h);
                str3 = "audio/x-flac";
                i8 = -1;
                i9 = -1;
                int i14222222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c8222222222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c8222222222222222222;
                c8222222222222222222.b(m7);
                return;
            case 22:
                if (!e(new rm(this.f12798h))) {
                    str = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                    Log.w("MatroskaExtractor", str);
                    str3 = "audio/x-unknown";
                    singletonList = null;
                    i8 = -1;
                    i9 = -1;
                    int i142222222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                    if (!om.a(str3)) {
                    }
                    lh c82222222222222222222 = dhVar.c(this.f12792b, i13);
                    this.O = c82222222222222222222;
                    c82222222222222222222.b(m7);
                    return;
                }
                h7 = zm.h(this.H);
                if (h7 == 0) {
                    i10 = this.H;
                    sb = new StringBuilder(75);
                    sb.append("Unsupported PCM bit depth: ");
                    sb.append(i10);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str = sb.toString();
                    Log.w("MatroskaExtractor", str);
                    str3 = "audio/x-unknown";
                    singletonList = null;
                    i8 = -1;
                    i9 = -1;
                    int i1422222222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                    if (!om.a(str3)) {
                    }
                    lh c822222222222222222222 = dhVar.c(this.f12792b, i13);
                    this.O = c822222222222222222222;
                    c822222222222222222222.b(m7);
                    return;
                }
                i8 = h7;
                singletonList = null;
                i9 = -1;
                int i14222222222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c8222222222222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c8222222222222222222222;
                c8222222222222222222222.b(m7);
                return;
            case 23:
                h7 = zm.h(this.H);
                if (h7 == 0) {
                    i10 = this.H;
                    sb = new StringBuilder(75);
                    sb.append("Unsupported PCM bit depth: ");
                    sb.append(i10);
                    sb.append(". Setting mimeType to audio/x-unknown");
                    str = sb.toString();
                    Log.w("MatroskaExtractor", str);
                    str3 = "audio/x-unknown";
                    singletonList = null;
                    i8 = -1;
                    i9 = -1;
                    int i142222222222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                    if (!om.a(str3)) {
                    }
                    lh c82222222222222222222222 = dhVar.c(this.f12792b, i13);
                    this.O = c82222222222222222222222;
                    c82222222222222222222222.b(m7);
                    return;
                }
                i8 = h7;
                singletonList = null;
                i9 = -1;
                int i1422222222222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c822222222222222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c822222222222222222222222;
                c822222222222222222222222.b(m7);
                return;
            case 24:
                str3 = "application/x-subrip";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i14222222222222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c8222222222222222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c8222222222222222222222222;
                c8222222222222222222222222.b(m7);
                return;
            case 25:
                singletonList = Collections.singletonList(this.f12798h);
                str3 = "application/vobsub";
                i8 = -1;
                i9 = -1;
                int i142222222222222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c82222222222222222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c82222222222222222222222222;
                c82222222222222222222222222.b(m7);
                return;
            case 26:
                str3 = "application/pgs";
                singletonList = null;
                i8 = -1;
                i9 = -1;
                int i1422222222222222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c822222222222222222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c822222222222222222222222222;
                c822222222222222222222222222.b(m7);
                return;
            case 27:
                byte[] bArr3 = this.f12798h;
                singletonList = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                str3 = "application/dvbsubs";
                i8 = -1;
                i9 = -1;
                int i14222222222222222222222222222 = (this.M ? 1 : 0) | (true == this.L ? 0 : 2);
                if (!om.a(str3)) {
                }
                lh c8222222222222222222222222222 = dhVar.c(this.f12792b, i13);
                this.O = c8222222222222222222222222222;
                c8222222222222222222222222222.b(m7);
                return;
            default:
                throw new af("Unrecognized codec identifier.");
        }
    }
}
