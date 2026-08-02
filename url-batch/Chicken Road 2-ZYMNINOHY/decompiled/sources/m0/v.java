package m0;

import E1.C0036l;
import T.C0089g;
import T.C0096n;
import T.C0097o;
import W.AbstractC0110c;
import W.J;
import a.AbstractC0124a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import v2.a0;
import v2.f0;
import y0.AbstractC1569a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final C1298k f14461a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f14462b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0462  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v(C1301n c1301n, C1289b c1289b, Uri uri) {
        char c4;
        String str;
        String str2;
        String str3;
        int i4;
        String str4;
        f0 f0Var;
        int i5;
        int i6;
        f0 a3;
        char c5;
        String str5;
        int i7;
        boolean z;
        boolean z4;
        boolean z5;
        Uri parse;
        f0 f0Var2 = c1289b.f14349i;
        AbstractC0124a.g("missing attribute control", f0Var2.containsKey("control"));
        C0096n c0096n = new C0096n();
        int i8 = c1289b.f14345e;
        C1288a c1288a = c1289b.f14350j;
        if (i8 > 0) {
            c0096n.f2826h = i8;
        }
        int i9 = c1288a.f14337a;
        String str6 = c1288a.f14338b;
        String E4 = U.i.E(str6);
        E4.getClass();
        switch (E4.hashCode()) {
            case -1922091719:
                if (E4.equals("MPEG4-GENERIC")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 2412:
                if (E4.equals("L8")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 64593:
                if (E4.equals("AC3")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 64934:
                if (E4.equals("AMR")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 74609:
                if (E4.equals("L16")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 85182:
                if (E4.equals("VP8")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 85183:
                if (E4.equals("VP9")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 2194728:
                if (E4.equals("H264")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 2194729:
                if (E4.equals("H265")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 2433087:
                if (E4.equals("OPUS")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 2450119:
                if (E4.equals("PCMA")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 2450139:
                if (E4.equals("PCMU")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 1061166827:
                if (E4.equals("MP4A-LATM")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 1934494802:
                if (E4.equals("AMR-WB")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case 1959269366:
                if (E4.equals("MP4V-ES")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case 2137188397:
                if (E4.equals("H263-1998")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case 2137209252:
                if (E4.equals("H263-2000")) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
            case '\f':
                str = "audio/mp4a-latm";
                str2 = str6;
                c0096n.f2831m = T.F.n(str);
                int i10 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                    str3 = str;
                    i4 = -1;
                } else {
                    int i11 = c1288a.f14340d;
                    if (i11 != -1) {
                        str3 = str;
                    } else {
                        str3 = str;
                        i11 = str3.equals("audio/ac3") ? 6 : 1;
                    }
                    c0096n.f2811F = i10;
                    c0096n.f2810E = i11;
                    i4 = i11;
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                    a3 = f0.f15629g;
                    f0Var = f0Var2;
                    i6 = i4;
                    i5 = i10;
                } else {
                    String str7 = J.f3263a;
                    f0Var = f0Var2;
                    i5 = i10;
                    String[] split = str4.split(" ", 2);
                    i6 = i4;
                    AbstractC0124a.g(str4, split.length == 2);
                    int i12 = 0;
                    String[] split2 = split[1].split(";\\s?", 0);
                    L3.h hVar = new L3.h(4);
                    int length = split2.length;
                    char c6 = 0;
                    while (i12 < length) {
                        String[] strArr = split2;
                        String[] split3 = strArr[i12].split("=", 2);
                        hVar.d(split3[c6], split3[1]);
                        i12++;
                        split2 = strArr;
                        length = length;
                        c6 = 0;
                    }
                    a3 = hVar.a(true);
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        if (str3.equals("video/3gpp")) {
                            c5 = 5;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1662541442:
                        if (str3.equals("video/hevc")) {
                            c5 = 7;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -1606874997:
                        if (str3.equals("audio/amr-wb")) {
                            c5 = 2;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case -53558318:
                        if (str3.equals("audio/mp4a-latm")) {
                            c5 = 0;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 187078296:
                        if (str3.equals("audio/ac3")) {
                            c5 = 11;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 187094639:
                        if (str3.equals("audio/raw")) {
                            c5 = '\n';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1187890754:
                        if (str3.equals("video/mp4v-es")) {
                            c5 = 4;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1331836730:
                        if (str3.equals("video/avc")) {
                            c5 = 6;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1503095341:
                        if (str3.equals("audio/3gpp")) {
                            c5 = 1;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1504891608:
                        if (str3.equals("audio/opus")) {
                            c5 = 3;
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1599127256:
                        if (str3.equals("video/x-vnd.on2.vp8")) {
                            c5 = '\b';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1599127257:
                        if (str3.equals("video/x-vnd.on2.vp9")) {
                            c5 = '\t';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1903231877:
                        if (str3.equals("audio/g711-alaw")) {
                            c5 = '\f';
                            break;
                        }
                        c5 = 65535;
                        break;
                    case 1903589369:
                        if (str3.equals("audio/g711-mlaw")) {
                            c5 = '\r';
                            break;
                        }
                        c5 = 65535;
                        break;
                    default:
                        c5 = 65535;
                        break;
                }
                switch (c5) {
                    case 0:
                        int i13 = i6;
                        str5 = str2;
                        i7 = i5;
                        AbstractC0124a.h(i13 != -1);
                        AbstractC0124a.g("missing attribute fmtp", !a3.isEmpty());
                        if (str5.equals("MP4A-LATM")) {
                            AbstractC0124a.g("Only supports cpresent=0 in AAC audio.", a3.containsKey("cpresent") && ((String) a3.get("cpresent")).equals(CommonUrlParts.Values.FALSE_INTEGER));
                            String str8 = (String) a3.get("config");
                            AbstractC0124a.o(str8, "AAC audio stream must include config fmtp parameter");
                            AbstractC0124a.k(str8.length() % 2 == 0, "Malformat MPEG4 config: %s", str8);
                            byte[] t4 = J.t(str8);
                            W.t tVar = new W.t(t4.length, t4);
                            z4 = true;
                            AbstractC0124a.g("Only supports audio mux version 0.", tVar.i(1) == 0);
                            AbstractC0124a.g("Only supports allStreamsSameTimeFraming.", tVar.i(1) == 1);
                            tVar.t(6);
                            AbstractC0124a.g("Only supports one program.", tVar.i(4) == 0);
                            AbstractC0124a.g("Only supports one numLayer.", tVar.i(3) == 0);
                            z = false;
                            try {
                                C0036l s4 = AbstractC1569a.s(tVar, false);
                                c0096n.f2811F = s4.f630a;
                                c0096n.f2810E = s4.f631b;
                                c0096n.f2828j = s4.f632c;
                            } catch (T.G e4) {
                                throw new IllegalArgumentException(e4);
                            }
                        } else {
                            z = false;
                            z4 = true;
                        }
                        String str9 = (String) a3.get("profile-level-id");
                        if (str9 == null && str5.equals("MP4A-LATM")) {
                            str9 = "30";
                        }
                        AbstractC0124a.g("missing profile-level-id param", (str9 == null || str9.isEmpty()) ? z : z4);
                        c0096n.f2828j = "mp4a.40." + str9;
                        c0096n.f2832p = v2.I.o(AbstractC1569a.a(i7, i13));
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str10 = (String) f0Var.get("control");
                        parse = Uri.parse(str10);
                        if (!parse.isAbsolute()) {
                            parse = !TextUtils.isEmpty(c1301n.b("Content-Base")) ? Uri.parse(c1301n.b("Content-Base")) : !TextUtils.isEmpty(c1301n.b("Content-Location")) ? Uri.parse(c1301n.b("Content-Location")) : uri;
                            if (!str10.equals("*")) {
                                parse = parse.buildUpon().appendEncodedPath(str10).build();
                            }
                        }
                        this.f14462b = parse;
                        return;
                    case 1:
                    case 2:
                        str5 = str2;
                        i7 = i5;
                        z4 = true;
                        AbstractC0124a.g("Multi channel AMR is not currently supported.", i6 == 1);
                        AbstractC0124a.g("fmtp parameters must include octet-align.", !a3.isEmpty());
                        AbstractC0124a.g("Only octet aligned mode is currently supported.", a3.containsKey("octet-align"));
                        AbstractC0124a.g("Interleaving mode is not currently supported.", !a3.containsKey("interleaving"));
                        z = false;
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str102 = (String) f0Var.get("control");
                        parse = Uri.parse(str102);
                        if (!parse.isAbsolute()) {
                        }
                        this.f14462b = parse;
                        return;
                    case 3:
                        str5 = str2;
                        AbstractC0124a.h(i6 != -1);
                        i7 = i5;
                        AbstractC0124a.g("Invalid OPUS clock rate.", i7 == 48000);
                        z = false;
                        z4 = true;
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str1022 = (String) f0Var.get("control");
                        parse = Uri.parse(str1022);
                        if (!parse.isAbsolute()) {
                        }
                        this.f14462b = parse;
                        return;
                    case 4:
                        str5 = str2;
                        AbstractC0124a.h(!a3.isEmpty());
                        String str11 = (String) a3.get("config");
                        if (str11 != null) {
                            byte[] t5 = J.t(str11);
                            c0096n.f2832p = v2.I.o(t5);
                            byte[] bArr = AbstractC0110c.f3295a;
                            W.u uVar = new W.u(t5);
                            int i14 = 0;
                            while (true) {
                                int i15 = i14 + 3;
                                if (i15 >= t5.length) {
                                    z5 = false;
                                } else if (uVar.C() == 1 && (t5[i15] & 240) == 32) {
                                    z5 = true;
                                } else {
                                    uVar.M(uVar.f3352b - 2);
                                    i14++;
                                }
                            }
                            AbstractC0124a.g("Invalid input: VOL not found.", z5);
                            W.t tVar2 = new W.t(t5.length, t5);
                            tVar2.t((i14 + 4) * 8);
                            tVar2.t(1);
                            tVar2.t(8);
                            if (tVar2.h()) {
                                tVar2.t(4);
                                tVar2.t(3);
                            }
                            if (tVar2.i(4) == 15) {
                                tVar2.t(8);
                                tVar2.t(8);
                            }
                            if (tVar2.h()) {
                                tVar2.t(2);
                                tVar2.t(1);
                                if (tVar2.h()) {
                                    tVar2.t(79);
                                }
                            }
                            AbstractC0124a.g("Only supports rectangular video object layer shape.", tVar2.i(2) == 0);
                            AbstractC0124a.h(tVar2.h());
                            int i16 = tVar2.i(16);
                            AbstractC0124a.h(tVar2.h());
                            if (tVar2.h()) {
                                AbstractC0124a.h(i16 > 0);
                                int i17 = 0;
                                for (int i18 = i16 - 1; i18 > 0; i18 >>= 1) {
                                    i17++;
                                }
                                tVar2.t(i17);
                            }
                            AbstractC0124a.h(tVar2.h());
                            int i19 = tVar2.i(13);
                            AbstractC0124a.h(tVar2.h());
                            int i20 = tVar2.i(13);
                            AbstractC0124a.h(tVar2.h());
                            tVar2.t(1);
                            Pair create = Pair.create(Integer.valueOf(i19), Integer.valueOf(i20));
                            c0096n.f2836t = ((Integer) create.first).intValue();
                            c0096n.f2837u = ((Integer) create.second).intValue();
                        } else {
                            c0096n.f2836t = 352;
                            c0096n.f2837u = 288;
                        }
                        String str12 = (String) a3.get("profile-level-id");
                        c0096n.f2828j = "mp4v.".concat(str12 == null ? "1" : str12);
                        i7 = i5;
                        z = false;
                        z4 = true;
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str10222 = (String) f0Var.get("control");
                        parse = Uri.parse(str10222);
                        if (!parse.isAbsolute()) {
                        }
                        this.f14462b = parse;
                        return;
                    case 5:
                        str5 = str2;
                        c0096n.f2836t = 352;
                        c0096n.f2837u = 288;
                        i7 = i5;
                        z = false;
                        z4 = true;
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str102222 = (String) f0Var.get("control");
                        parse = Uri.parse(str102222);
                        if (!parse.isAbsolute()) {
                        }
                        this.f14462b = parse;
                        return;
                    case 6:
                        str5 = str2;
                        AbstractC0124a.g("missing attribute fmtp", !a3.isEmpty());
                        AbstractC0124a.g("missing sprop parameter", a3.containsKey("sprop-parameter-sets"));
                        String str13 = (String) a3.get("sprop-parameter-sets");
                        str13.getClass();
                        String str14 = J.f3263a;
                        String[] split4 = str13.split(StringUtils.COMMA, -1);
                        AbstractC0124a.g("empty sprop value", split4.length == 2);
                        a0 p2 = v2.I.p(a(split4[0]), a(split4[1]));
                        c0096n.f2832p = p2;
                        byte[] bArr2 = (byte[]) p2.get(0);
                        X.o k4 = X.p.k(bArr2, 4, bArr2.length);
                        c0096n.z = k4.f3541g;
                        c0096n.f2837u = k4.f3540f;
                        c0096n.f2836t = k4.f3539e;
                        c0096n.f2808C = new C0089g(k4.f3548p, k4.f3549q, k4.f3550r, null, k4.f3542h + 8, k4.f3543i + 8);
                        String str15 = (String) a3.get("profile-level-id");
                        if (str15 != null) {
                            c0096n.f2828j = "avc1.".concat(str15);
                        } else {
                            c0096n.f2828j = AbstractC0110c.a(k4.f3535a, k4.f3536b, k4.f3537c);
                        }
                        i7 = i5;
                        z = false;
                        z4 = true;
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str1022222 = (String) f0Var.get("control");
                        parse = Uri.parse(str1022222);
                        if (!parse.isAbsolute()) {
                        }
                        this.f14462b = parse;
                        return;
                    case 7:
                        str5 = str2;
                        AbstractC0124a.g("missing attribute fmtp", !a3.isEmpty());
                        if (a3.containsKey("sprop-max-don-diff")) {
                            String str16 = (String) a3.get("sprop-max-don-diff");
                            str16.getClass();
                            int parseInt = Integer.parseInt(str16);
                            AbstractC0124a.f(parseInt, "non-zero sprop-max-don-diff %s is not supported", parseInt == 0);
                        }
                        AbstractC0124a.g("missing sprop-vps parameter", a3.containsKey("sprop-vps"));
                        String str17 = (String) a3.get("sprop-vps");
                        str17.getClass();
                        AbstractC0124a.g("missing sprop-sps parameter", a3.containsKey("sprop-sps"));
                        String str18 = (String) a3.get("sprop-sps");
                        str18.getClass();
                        AbstractC0124a.g("missing sprop-pps parameter", a3.containsKey("sprop-pps"));
                        String str19 = (String) a3.get("sprop-pps");
                        str19.getClass();
                        Object[] objArr = {a(str17), a(str18), a(str19)};
                        v2.r.b(3, objArr);
                        a0 i21 = v2.I.i(3, objArr);
                        c0096n.f2832p = i21;
                        byte[] bArr3 = (byte[]) i21.get(1);
                        X.l i22 = X.p.i(bArr3, 4, bArr3.length, null);
                        c0096n.z = i22.f3525i;
                        c0096n.f2837u = i22.f3522f;
                        c0096n.f2836t = i22.f3521e;
                        c0096n.f2808C = new C0089g(i22.f3527k, i22.f3528l, i22.f3529m, null, i22.f3519c + 8, i22.f3520d + 8);
                        X.i iVar = i22.f3518b;
                        if (iVar != null) {
                            c0096n.f2828j = AbstractC0110c.b(iVar.f3504a, iVar.f3505b, iVar.f3506c, iVar.f3507d, iVar.f3508e, iVar.f3509f);
                        }
                        i7 = i5;
                        z = false;
                        z4 = true;
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str10222222 = (String) f0Var.get("control");
                        parse = Uri.parse(str10222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.f14462b = parse;
                        return;
                    case '\b':
                        str5 = str2;
                        c0096n.f2836t = 320;
                        c0096n.f2837u = 240;
                        i7 = i5;
                        z = false;
                        z4 = true;
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str102222222 = (String) f0Var.get("control");
                        parse = Uri.parse(str102222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.f14462b = parse;
                        return;
                    case '\t':
                        str5 = str2;
                        c0096n.f2836t = 320;
                        c0096n.f2837u = 240;
                        i7 = i5;
                        z = false;
                        z4 = true;
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str1022222222 = (String) f0Var.get("control");
                        parse = Uri.parse(str1022222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.f14462b = parse;
                        return;
                    case '\n':
                        str5 = str2;
                        AbstractC0124a.h(str5.equals("L8") || str5.equals("L16"));
                        c0096n.f2812G = str5.equals("L8") ? 3 : 268435456;
                        i7 = i5;
                        z = false;
                        z4 = true;
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str10222222222 = (String) f0Var.get("control");
                        parse = Uri.parse(str10222222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.f14462b = parse;
                        return;
                    default:
                        str5 = str2;
                        i7 = i5;
                        z = false;
                        z4 = true;
                        AbstractC0124a.h(i7 > 0 ? z4 : z);
                        this.f14461a = new C1298k(new C0097o(c0096n), i9, i7, a3, str5);
                        String str102222222222 = (String) f0Var.get("control");
                        parse = Uri.parse(str102222222222);
                        if (!parse.isAbsolute()) {
                        }
                        this.f14462b = parse;
                        return;
                }
            case 1:
            case 4:
                str = "audio/raw";
                str2 = str6;
                c0096n.f2831m = T.F.n(str);
                int i102 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case 2:
                str2 = str6;
                str = "audio/ac3";
                c0096n.f2831m = T.F.n(str);
                int i1022 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case 3:
                str = "audio/3gpp";
                str2 = str6;
                c0096n.f2831m = T.F.n(str);
                int i10222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case 5:
                str = "video/x-vnd.on2.vp8";
                str2 = str6;
                c0096n.f2831m = T.F.n(str);
                int i102222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case 6:
                str = "video/x-vnd.on2.vp9";
                str2 = str6;
                c0096n.f2831m = T.F.n(str);
                int i1022222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case 7:
                str = "video/avc";
                str2 = str6;
                c0096n.f2831m = T.F.n(str);
                int i10222222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case '\b':
                str2 = str6;
                str = "video/hevc";
                c0096n.f2831m = T.F.n(str);
                int i102222222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case '\t':
                str = "audio/opus";
                str2 = str6;
                c0096n.f2831m = T.F.n(str);
                int i1022222222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case '\n':
                str2 = str6;
                str = "audio/g711-alaw";
                c0096n.f2831m = T.F.n(str);
                int i10222222222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case 11:
                str = "audio/g711-mlaw";
                str2 = str6;
                c0096n.f2831m = T.F.n(str);
                int i102222222222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case '\r':
                str2 = str6;
                str = "audio/amr-wb";
                c0096n.f2831m = T.F.n(str);
                int i1022222222222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case 14:
                str = "video/mp4v-es";
                str2 = str6;
                c0096n.f2831m = T.F.n(str);
                int i10222222222222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            case 15:
            case 16:
                str2 = str6;
                str = "video/3gpp";
                c0096n.f2831m = T.F.n(str);
                int i102222222222222 = c1288a.f14339c;
                if ("audio".equals(c1289b.f14341a)) {
                }
                str4 = (String) f0Var2.get("fmtp");
                if (str4 != null) {
                }
                switch (str3.hashCode()) {
                    case -1664118616:
                        break;
                    case -1662541442:
                        break;
                    case -1606874997:
                        break;
                    case -53558318:
                        break;
                    case 187078296:
                        break;
                    case 187094639:
                        break;
                    case 1187890754:
                        break;
                    case 1331836730:
                        break;
                    case 1503095341:
                        break;
                    case 1504891608:
                        break;
                    case 1599127256:
                        break;
                    case 1599127257:
                        break;
                    case 1903231877:
                        break;
                    case 1903589369:
                        break;
                }
                switch (c5) {
                }
            default:
                throw new IllegalArgumentException(str6);
        }
    }

    public static byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length + 4];
        System.arraycopy(X.p.f3552a, 0, bArr, 0, 4);
        System.arraycopy(decode, 0, bArr, 4, decode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f14461a.equals(vVar.f14461a) && this.f14462b.equals(vVar.f14462b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f14462b.hashCode() + ((this.f14461a.hashCode() + 217) * 31);
    }
}
