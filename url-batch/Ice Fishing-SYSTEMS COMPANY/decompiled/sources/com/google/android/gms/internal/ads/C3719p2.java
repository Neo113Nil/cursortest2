package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3719p2 {

    /* renamed from: A, reason: collision with root package name */
    public int f33264A;

    /* renamed from: B, reason: collision with root package name */
    public int f33265B;

    /* renamed from: C, reason: collision with root package name */
    public int f33266C;

    /* renamed from: D, reason: collision with root package name */
    public int f33267D;

    /* renamed from: E, reason: collision with root package name */
    public int f33268E;

    /* renamed from: F, reason: collision with root package name */
    public float f33269F;

    /* renamed from: G, reason: collision with root package name */
    public float f33270G;

    /* renamed from: H, reason: collision with root package name */
    public float f33271H;

    /* renamed from: I, reason: collision with root package name */
    public float f33272I;
    public float J;

    /* renamed from: K, reason: collision with root package name */
    public float f33273K;

    /* renamed from: L, reason: collision with root package name */
    public float f33274L;

    /* renamed from: M, reason: collision with root package name */
    public float f33275M;

    /* renamed from: N, reason: collision with root package name */
    public float f33276N;

    /* renamed from: O, reason: collision with root package name */
    public float f33277O;

    /* renamed from: P, reason: collision with root package name */
    public byte[] f33278P;

    /* renamed from: Q, reason: collision with root package name */
    public int f33279Q;

    /* renamed from: R, reason: collision with root package name */
    public int f33280R;

    /* renamed from: S, reason: collision with root package name */
    public int f33281S;

    /* renamed from: T, reason: collision with root package name */
    public int f33282T;

    /* renamed from: U, reason: collision with root package name */
    public long f33283U;

    /* renamed from: V, reason: collision with root package name */
    public long f33284V;

    /* renamed from: W, reason: collision with root package name */
    public C3502l1 f33285W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f33286X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f33287Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f33288a;

    /* renamed from: a0, reason: collision with root package name */
    public String f33289a0;

    /* renamed from: b, reason: collision with root package name */
    public String f33290b;

    /* renamed from: b0, reason: collision with root package name */
    public InterfaceC3448k1 f33291b0;

    /* renamed from: c, reason: collision with root package name */
    public String f33292c;

    /* renamed from: c0, reason: collision with root package name */
    public TP f33293c0;

    /* renamed from: d, reason: collision with root package name */
    public int f33294d;

    /* renamed from: d0, reason: collision with root package name */
    public int f33295d0;

    /* renamed from: e, reason: collision with root package name */
    public long f33296e;

    /* renamed from: f, reason: collision with root package name */
    public int f33297f;

    /* renamed from: g, reason: collision with root package name */
    public int f33298g;

    /* renamed from: h, reason: collision with root package name */
    public int f33299h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f33300j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f33301k;

    /* renamed from: l, reason: collision with root package name */
    public C3394j1 f33302l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f33303m;

    /* renamed from: n, reason: collision with root package name */
    public RO f33304n;

    /* renamed from: o, reason: collision with root package name */
    public int f33305o;

    /* renamed from: p, reason: collision with root package name */
    public int f33306p;

    /* renamed from: q, reason: collision with root package name */
    public int f33307q;

    /* renamed from: r, reason: collision with root package name */
    public int f33308r;

    /* renamed from: s, reason: collision with root package name */
    public int f33309s;

    /* renamed from: t, reason: collision with root package name */
    public int f33310t;

    /* renamed from: u, reason: collision with root package name */
    public int f33311u;

    /* renamed from: v, reason: collision with root package name */
    public float f33312v;

    /* renamed from: w, reason: collision with root package name */
    public float f33313w;

    /* renamed from: x, reason: collision with root package name */
    public float f33314x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f33315y;

    /* renamed from: z, reason: collision with root package name */
    public int f33316z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02ee, code lost:
    
        if (r3.d() == r4.getLeastSignificantBits()) goto L161;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x073d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r9v12, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i) {
        char c4;
        String str;
        int i4;
        int i9;
        int i10;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14;
        List list;
        List list2;
        String str3;
        int i15;
        int i16;
        int i17;
        int i18;
        String str4;
        ?? r9;
        Pair pair;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        C4065vP c4065vP;
        int i19;
        int i20;
        int i21;
        int i22;
        byte[] bArr;
        String str10;
        int i23;
        int i24;
        String str11;
        List list3;
        List list4;
        C3675oC c3675oC;
        String str12 = this.f33292c;
        switch (str12.hashCode()) {
            case -2095576542:
                if (str12.equals("V_MPEG4/ISO/AP")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case -2095575984:
                if (str12.equals("V_MPEG4/ISO/SP")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case -1985379776:
                if (str12.equals("A_MS/ACM")) {
                    c4 = 23;
                    break;
                }
                c4 = 65535;
                break;
            case -1784763192:
                if (str12.equals("A_TRUEHD")) {
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case -1730367663:
                if (str12.equals("A_VORBIS")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case -1482641358:
                if (str12.equals("A_MPEG/L2")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case -1482641357:
                if (str12.equals("A_MPEG/L3")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case -1373388978:
                if (str12.equals("V_MS/VFW/FOURCC")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case -933872740:
                if (str12.equals("S_DVBSUB")) {
                    c4 = '!';
                    break;
                }
                c4 = 65535;
                break;
            case -538363189:
                if (str12.equals("V_MPEG4/ISO/ASP")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case -538363109:
                if (str12.equals("V_MPEG4/ISO/AVC")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case -425012669:
                if (str12.equals("S_VOBSUB")) {
                    c4 = 31;
                    break;
                }
                c4 = 65535;
                break;
            case -356037306:
                if (str12.equals("A_DTS/LOSSLESS")) {
                    c4 = 21;
                    break;
                }
                c4 = 65535;
                break;
            case 62923557:
                if (str12.equals("A_AAC")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case 62923603:
                if (str12.equals("A_AC3")) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case 62927045:
                if (str12.equals("A_DTS")) {
                    c4 = 19;
                    break;
                }
                c4 = 65535;
                break;
            case 82318131:
                if (str12.equals("V_AV1")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 82338133:
                if (str12.equals("V_VP8")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 82338134:
                if (str12.equals("V_VP9")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 99146302:
                if (str12.equals("S_HDMV/PGS")) {
                    c4 = ' ';
                    break;
                }
                c4 = 65535;
                break;
            case 444813526:
                if (str12.equals("V_THEORA")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 542569478:
                if (str12.equals("A_DTS/EXPRESS")) {
                    c4 = 20;
                    break;
                }
                c4 = 65535;
                break;
            case 635596514:
                if (str12.equals("A_PCM/FLOAT/IEEE")) {
                    c4 = 26;
                    break;
                }
                c4 = 65535;
                break;
            case 725948237:
                if (str12.equals("A_PCM/INT/BIG")) {
                    c4 = 25;
                    break;
                }
                c4 = 65535;
                break;
            case 725957860:
                if (str12.equals("A_PCM/INT/LIT")) {
                    c4 = 24;
                    break;
                }
                c4 = 65535;
                break;
            case 738597099:
                if (str12.equals("S_TEXT/ASS")) {
                    c4 = 28;
                    break;
                }
                c4 = 65535;
                break;
            case 738614379:
                if (str12.equals("S_TEXT/SSA")) {
                    c4 = 29;
                    break;
                }
                c4 = 65535;
                break;
            case 855502857:
                if (str12.equals("V_MPEGH/ISO/HEVC")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 1045209816:
                if (str12.equals("S_TEXT/WEBVTT")) {
                    c4 = 30;
                    break;
                }
                c4 = 65535;
                break;
            case 1422270023:
                if (str12.equals("S_TEXT/UTF8")) {
                    c4 = 27;
                    break;
                }
                c4 = 65535;
                break;
            case 1809237540:
                if (str12.equals("V_MPEG2")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 1950749482:
                if (str12.equals("A_EAC3")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case 1950789798:
                if (str12.equals("A_FLAC")) {
                    c4 = 22;
                    break;
                }
                c4 = 65535;
                break;
            case 1951062397:
                if (str12.equals("A_OPUS")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        ?? r12 = com.anythink.basead.exoplayer.k.o.f8591P;
        String str13 = com.anythink.basead.exoplayer.k.o.f8589N;
        int i25 = 2;
        List list5 = null;
        switch (c4) {
            case 0:
                str = com.anythink.basead.exoplayer.k.o.f8609j;
                str13 = str;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                list5 = null;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                    str8 = str2;
                    GE a9 = GE.a(new Lr(this.f33278P));
                    if (a9 != null) {
                        str2 = a9.f25128b;
                        str13 = "video/dolby-vision";
                    }
                    str9 = str13;
                    boolean z8 = this.f33287Z;
                    List list6 = list5;
                    if (true != this.Y) {
                        i25 = 0;
                    }
                    int i26 = (z8 ? 1 : 0) | i25;
                    c4065vP = new C4065vP();
                    if (K4.a(str9)) {
                        c4065vP.f34765F = this.f33279Q;
                        c4065vP.f34766G = this.f33281S;
                        c4065vP.f34767H = this.f33282T;
                        c4065vP.f34768I = i14;
                    } else if (K4.b(str9)) {
                        if (this.f33310t == 0) {
                            int i27 = this.f33308r;
                            i19 = -1;
                            if (i27 == -1) {
                                i27 = this.f33305o;
                            }
                            this.f33308r = i27;
                            int i28 = this.f33309s;
                            if (i28 == -1) {
                                i28 = this.f33306p;
                            }
                            this.f33309s = i28;
                        } else {
                            i19 = -1;
                        }
                        float f6 = (this.f33308r == i19 || (i24 = this.f33309s) == i19) ? -1.0f : (this.f33306p * r1) / (this.f33305o * i24);
                        if (i10 == i19) {
                            if (i9 != i19) {
                                i20 = i19;
                                int i29 = i9;
                                int i30 = i13;
                                int i31 = (i11 == i19 || (i11 = this.f33307q) != i19) ? i11 : 8;
                                if (i4 != i19) {
                                    int i32 = this.f33307q;
                                    i21 = i32 == i19 ? 8 : i32;
                                } else {
                                    i21 = i4;
                                }
                                if (this.f33269F != -1.0f || this.f33270G == -1.0f || this.f33271H == -1.0f || this.f33272I == -1.0f || this.J == -1.0f || this.f33273K == -1.0f || this.f33274L == -1.0f || this.f33275M == -1.0f || this.f33276N == -1.0f || this.f33277O == -1.0f) {
                                    i22 = 0;
                                    bArr = null;
                                } else {
                                    byte[] bArr2 = new byte[25];
                                    ByteBuffer order = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    i22 = 0;
                                    order.put((byte) 0);
                                    order.putShort((short) ((this.f33269F * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33270G * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33271H * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33272I * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.J * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33273K * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33274L * 50000.0f) + 0.5f));
                                    order.putShort((short) ((this.f33275M * 50000.0f) + 0.5f));
                                    order.putShort((short) (this.f33276N + 0.5f));
                                    order.putShort((short) (this.f33277O + 0.5f));
                                    order.putShort((short) this.f33267D);
                                    order.putShort((short) this.f33268E);
                                    bArr = bArr2;
                                }
                                C2980bK c2980bK = new C2980bK(i20, i30, i29, bArr, i31, i21);
                                str10 = this.f33290b;
                                if (str10 != null) {
                                    Map map = C3773q2.f33569r0;
                                    if (map.containsKey(str10)) {
                                        i19 = ((Integer) map.get(this.f33290b)).intValue();
                                    }
                                }
                                if (this.f33311u == 0 && Float.compare(this.f33312v, 0.0f) == 0 && Float.compare(this.f33313w, 0.0f) == 0) {
                                    if (Float.compare(this.f33314x, 0.0f) != 0) {
                                        i23 = i22;
                                    } else if (Float.compare(this.f33314x, 90.0f) == 0) {
                                        i23 = 90;
                                    } else {
                                        i23 = 180;
                                        if (Float.compare(this.f33314x, -180.0f) != 0 && Float.compare(this.f33314x, 180.0f) != 0) {
                                            if (Float.compare(this.f33314x, -90.0f) == 0) {
                                                i23 = 270;
                                            }
                                        }
                                    }
                                    c4065vP.f34792u = this.f33305o;
                                    c4065vP.f34793v = this.f33306p;
                                    c4065vP.f34760A = f6;
                                    c4065vP.f34797z = i23;
                                    c4065vP.f34761B = this.f33315y;
                                    c4065vP.f34762C = this.f33316z;
                                    c4065vP.f34763D = c2980bK;
                                }
                                i23 = i19;
                                c4065vP.f34792u = this.f33305o;
                                c4065vP.f34793v = this.f33306p;
                                c4065vP.f34760A = f6;
                                c4065vP.f34797z = i23;
                                c4065vP.f34761B = this.f33315y;
                                c4065vP.f34762C = this.f33316z;
                                c4065vP.f34763D = c2980bK;
                            } else if (i13 == i19 || this.f33266C != i19) {
                                i10 = this.f33264A;
                                i9 = this.f33265B;
                                i13 = this.f33266C;
                            } else {
                                i10 = this.f33264A;
                                i9 = this.f33265B;
                            }
                        }
                        i20 = i10;
                        int i292 = i9;
                        int i302 = i13;
                        if (i11 == i19) {
                        }
                        if (i4 != i19) {
                        }
                        if (this.f33269F != -1.0f) {
                        }
                        i22 = 0;
                        bArr = null;
                        C2980bK c2980bK2 = new C2980bK(i20, i302, i292, bArr, i31, i21);
                        str10 = this.f33290b;
                        if (str10 != null) {
                        }
                        if (this.f33311u == 0) {
                            if (Float.compare(this.f33314x, 0.0f) != 0) {
                            }
                            c4065vP.f34792u = this.f33305o;
                            c4065vP.f34793v = this.f33306p;
                            c4065vP.f34760A = f6;
                            c4065vP.f34797z = i23;
                            c4065vP.f34761B = this.f33315y;
                            c4065vP.f34762C = this.f33316z;
                            c4065vP.f34763D = c2980bK2;
                        }
                        i23 = i19;
                        c4065vP.f34792u = this.f33305o;
                        c4065vP.f34793v = this.f33306p;
                        c4065vP.f34760A = f6;
                        c4065vP.f34797z = i23;
                        c4065vP.f34761B = this.f33315y;
                        c4065vP.f34762C = this.f33316z;
                        c4065vP.f34763D = c2980bK2;
                    } else if (!com.anythink.basead.exoplayer.k.o.Y.equals(str9) && !com.anythink.basead.exoplayer.k.o.f8591P.equals(str9) && !com.anythink.basead.exoplayer.k.o.f8590O.equals(str9) && !com.anythink.basead.exoplayer.k.o.ae.equals(str9) && !com.anythink.basead.exoplayer.k.o.af.equals(str9) && !com.anythink.basead.exoplayer.k.o.aj.equals(str9)) {
                        throw W4.a(null, "Unexpected MIME type.");
                    }
                    str11 = this.f33290b;
                    if (str11 != null && !C3773q2.f33569r0.containsKey(str11)) {
                        c4065vP.f34774b = this.f33290b;
                    }
                    c4065vP.c(i);
                    c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                    c4065vP.e(str9);
                    c4065vP.f34786o = i12;
                    c4065vP.f34776d = this.f33289a0;
                    c4065vP.f34777e = i26;
                    c4065vP.f34788q = list6;
                    c4065vP.f34781j = str8;
                    c4065vP.f34789r = this.f33304n;
                    this.f33293c0 = new TP(c4065vP);
                    return;
                }
                str8 = str2;
                str9 = str13;
                boolean z82 = this.f33287Z;
                List list62 = list5;
                if (true != this.Y) {
                }
                int i262 = (z82 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                    c4065vP.f34774b = this.f33290b;
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i262;
                c4065vP.f34788q = list62;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 1:
                byte[] bArr3 = this.f33303m;
                C3675oC j9 = bArr3 == null ? null : UB.j(bArr3);
                str = com.anythink.basead.exoplayer.k.o.f8610k;
                list = j9;
                list5 = list;
                str13 = str;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z822 = this.f33287Z;
                List list622 = list5;
                if (true != this.Y) {
                }
                int i2622 = (z822 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i2622;
                c4065vP.f34788q = list622;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 2:
                byte[] bArr4 = this.f33303m;
                str = "video/av01";
                if (bArr4 != null) {
                    C3675oC j10 = UB.j(bArr4);
                    B0 e6 = B0.e(this.f33303m);
                    list = j10;
                    if (e6 != null) {
                        String str14 = (String) e6.f23942y;
                        i4 = e6.f23938u;
                        int i33 = e6.f23940w;
                        i9 = e6.f23941x;
                        i10 = e6.f23939v;
                        str2 = str14;
                        i11 = i4;
                        str13 = "video/av01";
                        i12 = -1;
                        i13 = i33;
                        list3 = j10;
                        list5 = list3;
                        i14 = -1;
                        if (this.f33278P != null) {
                        }
                        str8 = str2;
                        str9 = str13;
                        boolean z8222 = this.f33287Z;
                        List list6222 = list5;
                        if (true != this.Y) {
                        }
                        int i26222 = (z8222 ? 1 : 0) | i25;
                        c4065vP = new C4065vP();
                        if (K4.a(str9)) {
                        }
                        str11 = this.f33290b;
                        if (str11 != null) {
                        }
                        c4065vP.c(i);
                        c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                        c4065vP.e(str9);
                        c4065vP.f34786o = i12;
                        c4065vP.f34776d = this.f33289a0;
                        c4065vP.f34777e = i26222;
                        c4065vP.f34788q = list6222;
                        c4065vP.f34781j = str8;
                        c4065vP.f34789r = this.f33304n;
                        this.f33293c0 = new TP(c4065vP);
                        return;
                    }
                    list5 = list;
                    str13 = str;
                    i14 = -1;
                    str2 = null;
                    i10 = -1;
                    i4 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33278P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z82222 = this.f33287Z;
                    List list62222 = list5;
                    if (true != this.Y) {
                    }
                    int i262222 = (z82222 ? 1 : 0) | i25;
                    c4065vP = new C4065vP();
                    if (K4.a(str9)) {
                    }
                    str11 = this.f33290b;
                    if (str11 != null) {
                    }
                    c4065vP.c(i);
                    c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                    c4065vP.e(str9);
                    c4065vP.f34786o = i12;
                    c4065vP.f34776d = this.f33289a0;
                    c4065vP.f34777e = i262222;
                    c4065vP.f34788q = list62222;
                    c4065vP.f34781j = str8;
                    c4065vP.f34789r = this.f33304n;
                    this.f33293c0 = new TP(c4065vP);
                    return;
                }
                str13 = str;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                list5 = null;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z822222 = this.f33287Z;
                List list622222 = list5;
                if (true != this.Y) {
                }
                int i2622222 = (z822222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i2622222;
                c4065vP.f34788q = list622222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 3:
                str = com.anythink.basead.exoplayer.k.o.f8613n;
                str13 = str;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                list5 = null;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z8222222 = this.f33287Z;
                List list6222222 = list5;
                if (true != this.Y) {
                }
                int i26222222 = (z8222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i26222222;
                c4065vP.f34788q = list6222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = this.f33303m;
                List singletonList = bArr5 == null ? null : Collections.singletonList(bArr5);
                str = com.anythink.basead.exoplayer.k.o.f8611l;
                list = singletonList;
                list5 = list;
                str13 = str;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z82222222 = this.f33287Z;
                List list62222222 = list5;
                if (true != this.Y) {
                }
                int i262222222 = (z82222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i262222222;
                c4065vP.f34788q = list62222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 7:
                C0 a10 = C0.a(new Lr(b(this.f33292c)));
                this.f33295d0 = a10.f24114b;
                list2 = a10.f24113a;
                str3 = a10.f24123l;
                i15 = a10.f24119g;
                i9 = a10.i;
                i16 = a10.f24120h;
                i17 = a10.f24117e;
                i18 = a10.f24118f;
                str4 = com.anythink.basead.exoplayer.k.o.f8608h;
                i11 = i17;
                str13 = str4;
                i12 = -1;
                i13 = i16;
                list5 = list2;
                str2 = str3;
                i10 = i15;
                i4 = i18;
                i14 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z822222222 = this.f33287Z;
                List list622222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222 = (z822222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i2622222222;
                c4065vP.f34788q = list622222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case '\b':
                Y0 a11 = Y0.a(new Lr(b(this.f33292c)), false, null);
                this.f33295d0 = a11.f28758b;
                list2 = a11.f28757a;
                str3 = a11.f28769n;
                i15 = a11.f28764h;
                i9 = a11.f28765j;
                i16 = a11.i;
                i17 = a11.f28762f;
                i18 = a11.f28763g;
                str4 = com.anythink.basead.exoplayer.k.o.i;
                i11 = i17;
                str13 = str4;
                i12 = -1;
                i13 = i16;
                list5 = list2;
                str2 = str3;
                i10 = i15;
                i4 = i18;
                i14 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z8222222222 = this.f33287Z;
                List list6222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222 = (z8222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i26222222222;
                c4065vP.f34788q = list6222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case '\t':
                Lr lr = new Lr(b(this.f33292c));
                try {
                    lr.G(16);
                    r9 = lr.a();
                    try {
                        if (r9 == 1482049860) {
                            pair = new Pair("video/divx", null);
                        } else {
                            if (r9 != 859189832) {
                                if (r9 == 826496599) {
                                    int i34 = lr.f26234b + 20;
                                    byte[] bArr6 = lr.f26233a;
                                    while (true) {
                                        int length = bArr6.length;
                                        if (i34 >= length - 4) {
                                            throw W4.a(null, "Failed to find FourCC VC1 initialization data");
                                        }
                                        int i35 = i34 + 1;
                                        if (bArr6[i34] == 0 && bArr6[i35] == 0) {
                                            i25 = 2;
                                            if (bArr6[i34 + 2] == 1) {
                                                if (bArr6[i34 + 3] == 15) {
                                                    pair = new Pair(com.anythink.basead.exoplayer.k.o.f8614o, Collections.singletonList(Arrays.copyOfRange(bArr6, i34, length)));
                                                    str5 = null;
                                                } else {
                                                    i34 = i35;
                                                }
                                            }
                                        }
                                        i34 = i35;
                                    }
                                } else {
                                    i25 = 2;
                                    AbstractC3217fl.I("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                    str5 = null;
                                    pair = new Pair(com.anythink.basead.exoplayer.k.o.f8615p, null);
                                }
                                str6 = (String) pair.first;
                                list5 = (List) pair.second;
                                str2 = str5;
                                str13 = str6;
                                i14 = -1;
                                i10 = -1;
                                i4 = -1;
                                i9 = -1;
                                i13 = -1;
                                i11 = -1;
                                i12 = -1;
                                if (this.f33278P != null) {
                                }
                                str8 = str2;
                                str9 = str13;
                                boolean z82222222222 = this.f33287Z;
                                List list62222222222 = list5;
                                if (true != this.Y) {
                                }
                                int i262222222222 = (z82222222222 ? 1 : 0) | i25;
                                c4065vP = new C4065vP();
                                if (K4.a(str9)) {
                                }
                                str11 = this.f33290b;
                                if (str11 != null) {
                                }
                                c4065vP.c(i);
                                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                                c4065vP.e(str9);
                                c4065vP.f34786o = i12;
                                c4065vP.f34776d = this.f33289a0;
                                c4065vP.f34777e = i262222222222;
                                c4065vP.f34788q = list62222222222;
                                c4065vP.f34781j = str8;
                                c4065vP.f34789r = this.f33304n;
                                this.f33293c0 = new TP(c4065vP);
                                return;
                            }
                            pair = new Pair(com.anythink.basead.exoplayer.k.o.f8607g, null);
                        }
                        str5 = null;
                        i25 = 2;
                        str6 = (String) pair.first;
                        list5 = (List) pair.second;
                        str2 = str5;
                        str13 = str6;
                        i14 = -1;
                        i10 = -1;
                        i4 = -1;
                        i9 = -1;
                        i13 = -1;
                        i11 = -1;
                        i12 = -1;
                        if (this.f33278P != null) {
                        }
                        str8 = str2;
                        str9 = str13;
                        boolean z822222222222 = this.f33287Z;
                        List list622222222222 = list5;
                        if (true != this.Y) {
                        }
                        int i2622222222222 = (z822222222222 ? 1 : 0) | i25;
                        c4065vP = new C4065vP();
                        if (K4.a(str9)) {
                        }
                        str11 = this.f33290b;
                        if (str11 != null) {
                        }
                        c4065vP.c(i);
                        c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                        c4065vP.e(str9);
                        c4065vP.f34786o = i12;
                        c4065vP.f34776d = this.f33289a0;
                        c4065vP.f34777e = i2622222222222;
                        c4065vP.f34788q = list622222222222;
                        c4065vP.f34781j = str8;
                        c4065vP.f34789r = this.f33304n;
                        this.f33293c0 = new TP(c4065vP);
                        return;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw W4.a(r9, "Error parsing FourCC private data");
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    r9 = 0;
                }
                break;
            case '\n':
                str13 = com.anythink.basead.exoplayer.k.o.f8615p;
                i14 = -1;
                str2 = null;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                list5 = null;
                i13 = -1;
                i11 = -1;
                i25 = 2;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z8222222222222 = this.f33287Z;
                List list6222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222 = (z8222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i26222222222222;
                c4065vP.f34788q = list6222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 11:
                byte[] b9 = b(str12);
                try {
                    try {
                        if (b9[0] != 2) {
                            throw W4.a(null, "Error parsing vorbis codec private");
                        }
                        int i36 = 0;
                        int i37 = 1;
                        while (true) {
                            int i38 = b9[i37];
                            i37++;
                            int i39 = i38 & com.anythink.basead.exoplayer.k.p.f8630b;
                            if (i39 == 255) {
                                i36 += com.anythink.basead.exoplayer.k.p.f8630b;
                            } else {
                                int i40 = i36 + i39;
                                int i41 = 0;
                                while (true) {
                                    try {
                                        int i42 = b9[i37];
                                        i37++;
                                        int i43 = i42 & com.anythink.basead.exoplayer.k.p.f8630b;
                                        if (i43 != 255) {
                                            int i44 = i41 + i43;
                                            if (b9[i37] != 1) {
                                                throw W4.a(null, "Error parsing vorbis codec private");
                                            }
                                            byte[] bArr7 = new byte[i40];
                                            System.arraycopy(b9, i37, bArr7, 0, i40);
                                            int i45 = i37 + i40;
                                            if (b9[i45] != 3) {
                                                throw W4.a(null, "Error parsing vorbis codec private");
                                            }
                                            int i46 = i45 + i44;
                                            if (b9[i46] != 5) {
                                                throw W4.a(null, "Error parsing vorbis codec private");
                                            }
                                            int length2 = b9.length - i46;
                                            byte[] bArr8 = new byte[length2];
                                            System.arraycopy(b9, i46, bArr8, 0, length2);
                                            ArrayList arrayList = new ArrayList(2);
                                            arrayList.add(bArr7);
                                            arrayList.add(bArr8);
                                            list5 = arrayList;
                                            str13 = com.anythink.basead.exoplayer.k.o.f8583G;
                                            i12 = 8192;
                                            i14 = -1;
                                            str2 = null;
                                            i10 = -1;
                                            i4 = -1;
                                            i9 = -1;
                                            i13 = -1;
                                            i11 = -1;
                                            i25 = 2;
                                            if (this.f33278P != null) {
                                            }
                                            str8 = str2;
                                            str9 = str13;
                                            boolean z82222222222222 = this.f33287Z;
                                            List list62222222222222 = list5;
                                            if (true != this.Y) {
                                            }
                                            int i262222222222222 = (z82222222222222 ? 1 : 0) | i25;
                                            c4065vP = new C4065vP();
                                            if (K4.a(str9)) {
                                            }
                                            str11 = this.f33290b;
                                            if (str11 != null) {
                                            }
                                            c4065vP.c(i);
                                            c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                                            c4065vP.e(str9);
                                            c4065vP.f34786o = i12;
                                            c4065vP.f34776d = this.f33289a0;
                                            c4065vP.f34777e = i262222222222222;
                                            c4065vP.f34788q = list62222222222222;
                                            c4065vP.f34781j = str8;
                                            c4065vP.f34789r = this.f33304n;
                                            this.f33293c0 = new TP(c4065vP);
                                            return;
                                        }
                                        i41 += com.anythink.basead.exoplayer.k.p.f8630b;
                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                        r12 = 0;
                                        throw W4.a(r12, "Error parsing vorbis codec private");
                                    }
                                }
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException unused4) {
                    }
                } catch (ArrayIndexOutOfBoundsException unused5) {
                    r12 = 0;
                }
                break;
            case '\f':
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(b(this.f33292c));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList2.add(allocate.order(byteOrder).putLong(this.f33283U).array());
                arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f33284V).array());
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f8584H;
                i12 = 5760;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                list3 = arrayList2;
                list5 = list3;
                i14 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z822222222222222 = this.f33287Z;
                List list622222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222 = (z822222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i2622222222222222;
                c4065vP.f34788q = list622222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case '\r':
                List singletonList2 = Collections.singletonList(b(str12));
                byte[] bArr9 = this.f33303m;
                C4202y0 m8 = AbstractC2720Pd.m(new Er(bArr9, bArr9.length), false);
                this.f33282T = m8.f35297b;
                this.f33279Q = m8.f35298c;
                str2 = m8.f35296a;
                str6 = com.anythink.basead.exoplayer.k.o.f8617r;
                list5 = singletonList2;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z8222222222222222 = this.f33287Z;
                List list6222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222 = (z8222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i26222222222222222;
                c4065vP.f34788q = list6222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 14:
                str7 = com.anythink.basead.exoplayer.k.o.f8621v;
                str2 = null;
                str13 = str7;
                i12 = 4096;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z82222222222222222 = this.f33287Z;
                List list62222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222 = (z82222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i262222222222222222;
                c4065vP.f34788q = list62222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 15:
                str7 = com.anythink.basead.exoplayer.k.o.f8619t;
                str2 = null;
                str13 = str7;
                i12 = 4096;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z822222222222222222 = this.f33287Z;
                List list622222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222 = (z822222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i2622222222222222222;
                c4065vP.f34788q = list622222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 16:
                str6 = com.anythink.basead.exoplayer.k.o.f8625z;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z8222222222222222222 = this.f33287Z;
                List list6222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222 = (z8222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i26222222222222222222;
                c4065vP.f34788q = list6222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 17:
                str6 = com.anythink.basead.exoplayer.k.o.f8577A;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z82222222222222222222 = this.f33287Z;
                List list62222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222222 = (z82222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i262222222222222222222;
                c4065vP.f34788q = list62222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 18:
                this.f33285W = new C3502l1();
                str6 = com.anythink.basead.exoplayer.k.o.f8579C;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z822222222222222222222 = this.f33287Z;
                List list622222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222222 = (z822222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i2622222222222222222222;
                c4065vP.f34788q = list622222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 19:
            case 20:
                this.f33286X = true;
                str6 = com.anythink.basead.exoplayer.k.o.f8580D;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z8222222222222222222222 = this.f33287Z;
                List list6222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222222 = (z8222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i26222222222222222222222;
                c4065vP.f34788q = list6222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 21:
                str6 = com.anythink.basead.exoplayer.k.o.f8581E;
                str2 = null;
                str13 = str6;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z82222222222222222222222 = this.f33287Z;
                List list62222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222222222 = (z82222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i262222222222222222222222;
                c4065vP.f34788q = list62222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 22:
                List singletonList3 = Collections.singletonList(b(str12));
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f8586K;
                list4 = singletonList3;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                list3 = list4;
                list5 = list3;
                i14 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z822222222222222222222222 = this.f33287Z;
                List list622222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222222222 = (z822222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i2622222222222222222222222;
                c4065vP.f34788q = list622222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 23:
                Lr lr2 = new Lr(b(this.f33292c));
                try {
                    int M8 = lr2.M();
                    if (M8 != 1) {
                        if (M8 == 65534) {
                            lr2.E(20);
                            int i47 = lr2.i();
                            if ((i47 >> 18) == 0 && (i47 == 0 || Integer.bitCount(i47) == this.f33279Q)) {
                                this.f33281S = i47 == 0 ? -1 : i47 << 2;
                            }
                            long d2 = lr2.d();
                            UUID uuid = C3773q2.f33568q0;
                            if (d2 == uuid.getMostSignificantBits()) {
                                break;
                            }
                        }
                        AbstractC3217fl.I("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        str2 = null;
                        i14 = -1;
                        i10 = -1;
                        i4 = -1;
                        i9 = -1;
                        i13 = -1;
                        i11 = -1;
                        i12 = -1;
                        if (this.f33278P != null) {
                        }
                        str8 = str2;
                        str9 = str13;
                        boolean z8222222222222222222222222 = this.f33287Z;
                        List list6222222222222222222222222 = list5;
                        if (true != this.Y) {
                        }
                        int i26222222222222222222222222 = (z8222222222222222222222222 ? 1 : 0) | i25;
                        c4065vP = new C4065vP();
                        if (K4.a(str9)) {
                        }
                        str11 = this.f33290b;
                        if (str11 != null) {
                        }
                        c4065vP.c(i);
                        c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                        c4065vP.e(str9);
                        c4065vP.f34786o = i12;
                        c4065vP.f34776d = this.f33289a0;
                        c4065vP.f34777e = i26222222222222222222222222;
                        c4065vP.f34788q = list6222222222222222222222222;
                        c4065vP.f34781j = str8;
                        c4065vP.f34789r = this.f33304n;
                        this.f33293c0 = new TP(c4065vP);
                        return;
                    }
                    i14 = AbstractC3548lu.b(this.f33280R, ByteOrder.LITTLE_ENDIAN);
                    if (i14 == 0) {
                        int i48 = this.f33280R;
                        StringBuilder sb = new StringBuilder(String.valueOf(i48).length() + 64);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i48);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        AbstractC3217fl.I("MatroskaExtractor", sb.toString());
                        str2 = null;
                        i14 = -1;
                        i10 = -1;
                        i4 = -1;
                        i9 = -1;
                        i13 = -1;
                        i11 = -1;
                        i12 = -1;
                        if (this.f33278P != null) {
                        }
                        str8 = str2;
                        str9 = str13;
                        boolean z82222222222222222222222222 = this.f33287Z;
                        List list62222222222222222222222222 = list5;
                        if (true != this.Y) {
                        }
                        int i262222222222222222222222222 = (z82222222222222222222222222 ? 1 : 0) | i25;
                        c4065vP = new C4065vP();
                        if (K4.a(str9)) {
                        }
                        str11 = this.f33290b;
                        if (str11 != null) {
                        }
                        c4065vP.c(i);
                        c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                        c4065vP.e(str9);
                        c4065vP.f34786o = i12;
                        c4065vP.f34776d = this.f33289a0;
                        c4065vP.f34777e = i262222222222222222222222222;
                        c4065vP.f34788q = list62222222222222222222222222;
                        c4065vP.f34781j = str8;
                        c4065vP.f34789r = this.f33304n;
                        this.f33293c0 = new TP(c4065vP);
                        return;
                    }
                    str2 = null;
                    str13 = com.anythink.basead.exoplayer.k.o.f8622w;
                    i10 = -1;
                    i4 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33278P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z822222222222222222222222222 = this.f33287Z;
                    List list622222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i2622222222222222222222222222 = (z822222222222222222222222222 ? 1 : 0) | i25;
                    c4065vP = new C4065vP();
                    if (K4.a(str9)) {
                    }
                    str11 = this.f33290b;
                    if (str11 != null) {
                    }
                    c4065vP.c(i);
                    c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                    c4065vP.e(str9);
                    c4065vP.f34786o = i12;
                    c4065vP.f34776d = this.f33289a0;
                    c4065vP.f34777e = i2622222222222222222222222222;
                    c4065vP.f34788q = list622222222222222222222222222;
                    c4065vP.f34781j = str8;
                    c4065vP.f34789r = this.f33304n;
                    this.f33293c0 = new TP(c4065vP);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused6) {
                    throw W4.a(null, "Error parsing MS/ACM codec private");
                }
            case 24:
                i14 = AbstractC3548lu.b(this.f33280R, ByteOrder.LITTLE_ENDIAN);
                if (i14 == 0) {
                    int i49 = this.f33280R;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i49).length() + 78);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i49);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    AbstractC3217fl.I("MatroskaExtractor", sb2.toString());
                    str2 = null;
                    i14 = -1;
                    i10 = -1;
                    i4 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33278P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z8222222222222222222222222222 = this.f33287Z;
                    List list6222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i26222222222222222222222222222 = (z8222222222222222222222222222 ? 1 : 0) | i25;
                    c4065vP = new C4065vP();
                    if (K4.a(str9)) {
                    }
                    str11 = this.f33290b;
                    if (str11 != null) {
                    }
                    c4065vP.c(i);
                    c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                    c4065vP.e(str9);
                    c4065vP.f34786o = i12;
                    c4065vP.f34776d = this.f33289a0;
                    c4065vP.f34777e = i26222222222222222222222222222;
                    c4065vP.f34788q = list6222222222222222222222222222;
                    c4065vP.f34781j = str8;
                    c4065vP.f34789r = this.f33304n;
                    this.f33293c0 = new TP(c4065vP);
                    return;
                }
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f8622w;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z82222222222222222222222222222 = this.f33287Z;
                List list62222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222222222222222 = (z82222222222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i262222222222222222222222222222;
                c4065vP.f34788q = list62222222222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 25:
                i14 = AbstractC3548lu.b(this.f33280R, ByteOrder.BIG_ENDIAN);
                if (i14 == 0) {
                    int i50 = this.f33280R;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i50).length() + 75);
                    sb3.append("Unsupported big endian PCM bit depth: ");
                    sb3.append(i50);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    AbstractC3217fl.I("MatroskaExtractor", sb3.toString());
                    str2 = null;
                    i14 = -1;
                    i10 = -1;
                    i4 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33278P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z822222222222222222222222222222 = this.f33287Z;
                    List list622222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i2622222222222222222222222222222 = (z822222222222222222222222222222 ? 1 : 0) | i25;
                    c4065vP = new C4065vP();
                    if (K4.a(str9)) {
                    }
                    str11 = this.f33290b;
                    if (str11 != null) {
                    }
                    c4065vP.c(i);
                    c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                    c4065vP.e(str9);
                    c4065vP.f34786o = i12;
                    c4065vP.f34776d = this.f33289a0;
                    c4065vP.f34777e = i2622222222222222222222222222222;
                    c4065vP.f34788q = list622222222222222222222222222222;
                    c4065vP.f34781j = str8;
                    c4065vP.f34789r = this.f33304n;
                    this.f33293c0 = new TP(c4065vP);
                    return;
                }
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f8622w;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z8222222222222222222222222222222 = this.f33287Z;
                List list6222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222222222222222 = (z8222222222222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i26222222222222222222222222222222;
                c4065vP.f34788q = list6222222222222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 26:
                i14 = AbstractC3548lu.c(this.f33280R, ByteOrder.LITTLE_ENDIAN);
                if (i14 == 0) {
                    int i51 = this.f33280R;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i51).length() + 79);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i51);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    AbstractC3217fl.I("MatroskaExtractor", sb4.toString());
                    str2 = null;
                    i14 = -1;
                    i10 = -1;
                    i4 = -1;
                    i9 = -1;
                    i13 = -1;
                    i11 = -1;
                    i12 = -1;
                    if (this.f33278P != null) {
                    }
                    str8 = str2;
                    str9 = str13;
                    boolean z82222222222222222222222222222222 = this.f33287Z;
                    List list62222222222222222222222222222222 = list5;
                    if (true != this.Y) {
                    }
                    int i262222222222222222222222222222222 = (z82222222222222222222222222222222 ? 1 : 0) | i25;
                    c4065vP = new C4065vP();
                    if (K4.a(str9)) {
                    }
                    str11 = this.f33290b;
                    if (str11 != null) {
                    }
                    c4065vP.c(i);
                    c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                    c4065vP.e(str9);
                    c4065vP.f34786o = i12;
                    c4065vP.f34776d = this.f33289a0;
                    c4065vP.f34777e = i262222222222222222222222222222222;
                    c4065vP.f34788q = list62222222222222222222222222222222;
                    c4065vP.f34781j = str8;
                    c4065vP.f34789r = this.f33304n;
                    this.f33293c0 = new TP(c4065vP);
                    return;
                }
                str2 = null;
                str13 = com.anythink.basead.exoplayer.k.o.f8622w;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z822222222222222222222222222222222 = this.f33287Z;
                List list622222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222222222222222222 = (z822222222222222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i2622222222222222222222222222222222;
                c4065vP.f34788q = list622222222222222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 27:
                str13 = com.anythink.basead.exoplayer.k.o.Y;
                str2 = null;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z8222222222222222222222222222222222 = this.f33287Z;
                List list6222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222222222222222222 = (z8222222222222222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i26222222222222222222222222222222222;
                c4065vP.f34788q = list6222222222222222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 28:
            case 29:
                byte[] bArr10 = C3773q2.m0;
                C3675oC k6 = UB.k(C3773q2.f33565n0, b(this.f33292c));
                str13 = com.anythink.basead.exoplayer.k.o.f8591P;
                c3675oC = k6;
                str2 = null;
                list4 = c3675oC;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                list3 = list4;
                list5 = list3;
                i14 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z82222222222222222222222222222222222 = this.f33287Z;
                List list62222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222222222222222222222 = (z82222222222222222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i262222222222222222222222222222222222;
                c4065vP.f34788q = list62222222222222222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 30:
                str13 = com.anythink.basead.exoplayer.k.o.f8590O;
                str2 = null;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z822222222222222222222222222222222222 = this.f33287Z;
                List list622222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222222222222222222222 = (z822222222222222222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i2622222222222222222222222222222222222;
                c4065vP.f34788q = list622222222222222222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case 31:
                C3675oC j11 = UB.j(b(str12));
                str13 = com.anythink.basead.exoplayer.k.o.ae;
                c3675oC = j11;
                str2 = null;
                list4 = c3675oC;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                list3 = list4;
                list5 = list3;
                i14 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z8222222222222222222222222222222222222 = this.f33287Z;
                List list6222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i26222222222222222222222222222222222222 = (z8222222222222222222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i26222222222222222222222222222222222222;
                c4065vP.f34788q = list6222222222222222222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case ' ':
                str13 = com.anythink.basead.exoplayer.k.o.af;
                str2 = null;
                i14 = -1;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z82222222222222222222222222222222222222 = this.f33287Z;
                List list62222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i262222222222222222222222222222222222222 = (z82222222222222222222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i262222222222222222222222222222222222222;
                c4065vP.f34788q = list62222222222222222222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            case '!':
                byte[] bArr11 = new byte[4];
                System.arraycopy(b(str12), 0, bArr11, 0, 4);
                C3675oC j12 = UB.j(bArr11);
                str13 = com.anythink.basead.exoplayer.k.o.aj;
                c3675oC = j12;
                str2 = null;
                list4 = c3675oC;
                i10 = -1;
                i4 = -1;
                i9 = -1;
                i13 = -1;
                i11 = -1;
                i12 = -1;
                list3 = list4;
                list5 = list3;
                i14 = -1;
                if (this.f33278P != null) {
                }
                str8 = str2;
                str9 = str13;
                boolean z822222222222222222222222222222222222222 = this.f33287Z;
                List list622222222222222222222222222222222222222 = list5;
                if (true != this.Y) {
                }
                int i2622222222222222222222222222222222222222 = (z822222222222222222222222222222222222222 ? 1 : 0) | i25;
                c4065vP = new C4065vP();
                if (K4.a(str9)) {
                }
                str11 = this.f33290b;
                if (str11 != null) {
                }
                c4065vP.c(i);
                c4065vP.d(true != this.f33288a ? "video/x-matroska" : com.anythink.basead.exoplayer.k.o.f8606f);
                c4065vP.e(str9);
                c4065vP.f34786o = i12;
                c4065vP.f34776d = this.f33289a0;
                c4065vP.f34777e = i2622222222222222222222222222222222222222;
                c4065vP.f34788q = list622222222222222222222222222222222222222;
                c4065vP.f34781j = str8;
                c4065vP.f34789r = this.f33304n;
                this.f33293c0 = new TP(c4065vP);
                return;
            default:
                throw W4.a(null, "Unrecognized codec identifier.");
        }
    }

    public final byte[] b(String str) {
        byte[] bArr = this.f33303m;
        if (bArr != null) {
            return bArr;
        }
        throw W4.a(null, "Missing CodecPrivate for codec ".concat(String.valueOf(str)));
    }
}
