package h0;

import E.AbstractC0005f;
import S0.w;
import T.AbstractC0088f;
import T.C0093k;
import T.C0094l;
import T.C0096n;
import T.C0097o;
import T.E;
import T.F;
import T.G;
import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import g0.u;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v2.I;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class r implements u0.p {

    /* renamed from: a, reason: collision with root package name */
    public final o f9238a;

    /* renamed from: b, reason: collision with root package name */
    public final l f9239b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f9201c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f9203d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f9205e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f9207f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f9209g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f9211h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f9213i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f9215j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f9217k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f9219l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f9221m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f9225p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f9227q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f9229r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f9231s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f9233t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f9234u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern v = a("CAN-SKIP-DATERANGES");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f9235w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f9236x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f9237y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern z = a("CAN-BLOCK-RELOAD");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f9168A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f9170B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f9172C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f9174D = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f9176E = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f9178F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f9180G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f9181H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f9182I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f9183J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f9184K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f9185M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* renamed from: N, reason: collision with root package name */
    public static final Pattern f9186N = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f9187O = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f9188P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: Q, reason: collision with root package name */
    public static final Pattern f9189Q = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: R, reason: collision with root package name */
    public static final Pattern f9190R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* renamed from: S, reason: collision with root package name */
    public static final Pattern f9191S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f9192T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* renamed from: U, reason: collision with root package name */
    public static final Pattern f9193U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* renamed from: V, reason: collision with root package name */
    public static final Pattern f9194V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: W, reason: collision with root package name */
    public static final Pattern f9195W = a("AUTOSELECT");

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f9196X = a("DEFAULT");

    /* renamed from: Y, reason: collision with root package name */
    public static final Pattern f9197Y = a("FORCED");

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f9198Z = a("INDEPENDENT");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f9199a0 = a("GAP");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f9200b0 = a("PRECISE");

    /* renamed from: c0, reason: collision with root package name */
    public static final Pattern f9202c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f9204d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f9206e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f9208f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f9210g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f9212h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f9214i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f9216j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f9218k0 = a("END-ON-NEXT");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f9220l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f9222m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f9223n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f9224o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f9226p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* renamed from: q0, reason: collision with root package name */
    public static final Pattern f9228q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* renamed from: r0, reason: collision with root package name */
    public static final Pattern f9230r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f9232s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* renamed from: A0, reason: collision with root package name */
    public static final Pattern f9169A0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* renamed from: B0, reason: collision with root package name */
    public static final Pattern f9171B0 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");

    /* renamed from: C0, reason: collision with root package name */
    public static final Pattern f9173C0 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");

    /* renamed from: D0, reason: collision with root package name */
    public static final Pattern f9175D0 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");

    /* renamed from: E0, reason: collision with root package name */
    public static final Pattern f9177E0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: F0, reason: collision with root package name */
    public static final Pattern f9179F0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public r(o oVar, l lVar) {
        this.f9238a = oVar;
        this.f9239b = lVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static C0094l b(String str, C0093k[] c0093kArr) {
        C0093k[] c0093kArr2 = new C0093k[c0093kArr.length];
        for (int i4 = 0; i4 < c0093kArr.length; i4++) {
            C0093k c0093k = c0093kArr[i4];
            c0093kArr2[i4] = new C0093k(c0093k.f2797b, c0093k.f2798c, c0093k.f2799d, null);
        }
        return new C0094l(str, true, c0093kArr2);
    }

    public static C0093k c(String str, HashMap hashMap, String str2) {
        String i4 = i(str, f9185M, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f9186N;
        if (equals) {
            String j4 = j(str, pattern, hashMap);
            return new C0093k(AbstractC0088f.f2782d, null, "video/mp4", Base64.decode(j4.substring(j4.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC0088f.f2782d;
            String str3 = J.f3263a;
            return new C0093k(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i4)) {
            return null;
        }
        String j5 = j(str, pattern, hashMap);
        byte[] decode = Base64.decode(j5.substring(j5.indexOf(44)), 0);
        UUID uuid2 = AbstractC0088f.f2783e;
        return new C0093k(uuid2, null, "video/mp4", w.a(uuid2, null, decode));
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x08ef, code lost:
    
        if (r7.equals(r14) != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x090b, code lost:
    
        if (r7.equals(r15) != false) goto L354;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:240:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0bb5  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0c48  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0c67  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0c89  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0d09  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0d87  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0de2  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0df8  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0e10  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0e2f  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0e4c  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0bb9  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0b0a  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0f10  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0f44  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0f29  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x10b0  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x10b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l d(o oVar, l lVar, B1.j jVar, String str) {
        HashMap hashMap;
        ArrayList arrayList;
        Iterator it;
        f fVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TreeMap treeMap;
        String str2;
        long j4;
        i iVar;
        int i4;
        int i5;
        long j5;
        String str3;
        LinkedHashMap linkedHashMap;
        long j6;
        int i6;
        int i7;
        C0094l c0094l;
        int i8;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str4;
        i iVar2;
        int i9;
        long j7;
        C0094l c0094l2;
        boolean z4;
        String str5;
        String i10;
        String str6;
        long j8;
        long j9;
        ArrayList arrayList6;
        Matcher matcher;
        String str7;
        String str8;
        String str9;
        Matcher matcher2;
        char c4;
        ArrayList arrayList7;
        String str10;
        String str11;
        String str12;
        d dVar;
        int i11;
        char c5;
        long j10;
        C0094l c0094l3;
        o oVar2 = oVar;
        l lVar2 = lVar;
        boolean z5 = oVar2.f9167c;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        k kVar = new k(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        String str13 = "";
        boolean z6 = z5;
        String str14 = "";
        long j11 = -9223372036854775807L;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = -1;
        g gVar = null;
        String str15 = null;
        C0094l c0094l4 = null;
        String str16 = null;
        C0094l c0094l5 = null;
        int i12 = 0;
        int i13 = 1;
        boolean z7 = false;
        boolean z8 = false;
        int i14 = 0;
        i iVar3 = null;
        int i15 = 0;
        String str17 = null;
        int i16 = 0;
        boolean z9 = false;
        int i17 = 0;
        long j20 = -9223372036854775807L;
        long j21 = -9223372036854775807L;
        long j22 = 0;
        boolean z10 = false;
        while (true) {
            k kVar2 = kVar;
            if (!jVar.s()) {
                g gVar2 = gVar;
                ArrayList arrayList12 = arrayList8;
                ArrayList arrayList13 = arrayList10;
                ArrayList arrayList14 = arrayList11;
                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                HashMap hashMap4 = new HashMap();
                int i18 = i16;
                while (i18 < arrayList13.size()) {
                    ArrayList arrayList15 = arrayList13;
                    h hVar = (h) arrayList15.get(i18);
                    long j23 = hVar.f9110b;
                    if (j23 == -1) {
                        j23 = (j22 + arrayList12.size()) - (arrayList9.isEmpty() ? 1L : 0L);
                    }
                    int i19 = hVar.f9111c;
                    if (i19 == -1 && j21 != -9223372036854775807L) {
                        i19 = (arrayList9.isEmpty() ? ((i) v2.r.j(arrayList12)).f9113m : arrayList9).size() - 1;
                    }
                    Uri uri = hVar.f9109a;
                    hashMap4.put(uri, new h(i19, j23, uri));
                    i18++;
                    arrayList13 = arrayList15;
                }
                if (gVar2 != null) {
                    arrayList9.add(gVar2);
                }
                ArrayList arrayList16 = new ArrayList();
                Iterator it2 = linkedHashMap3.values().iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    Uri uri2 = eVar.f9074d;
                    if ((uri2 == null && eVar.f9073c != null) || (uri2 != null && eVar.f9073c == null)) {
                        long j24 = eVar.f9075e;
                        if (j24 != -9223372036854775807L) {
                            String str18 = eVar.f9071a;
                            Uri uri3 = eVar.f9073c;
                            long j25 = eVar.f9076f;
                            long j26 = eVar.f9077g;
                            arrayList = arrayList12;
                            it = it2;
                            long j27 = eVar.f9078h;
                            ArrayList arrayList17 = eVar.f9079i;
                            hashMap = hashMap4;
                            boolean z11 = eVar.f9080j;
                            long j28 = eVar.f9081k;
                            long j29 = eVar.f9082l;
                            ArrayList arrayList18 = eVar.f9083m;
                            ArrayList arrayList19 = eVar.n;
                            ArrayList arrayList20 = new ArrayList(eVar.f9072b.values());
                            Boolean bool = eVar.o;
                            boolean z12 = bool == null || bool.booleanValue();
                            String str19 = eVar.f9084p;
                            String str20 = str19 != null ? str19 : "POINT";
                            String str21 = eVar.f9085q;
                            fVar = new f(str18, uri3, uri2, j24, j25, j26, j27, arrayList17, z11, j28, j29, arrayList18, arrayList19, arrayList20, z12, str20, str21 != null ? str21 : "HIGHLIGHT", eVar.f9086r, eVar.f9087s, eVar.f9088t);
                            if (fVar == null) {
                                arrayList16.add(fVar);
                            }
                            it2 = it;
                            hashMap4 = hashMap;
                            arrayList12 = arrayList;
                        }
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList12;
                    it = it2;
                    fVar = null;
                    if (fVar == null) {
                    }
                    it2 = it;
                    hashMap4 = hashMap;
                    arrayList12 = arrayList;
                }
                HashMap hashMap5 = hashMap4;
                ArrayList arrayList21 = arrayList12;
                long j30 = (j15 == 0 && lVar != null && lVar.f9140p) ? lVar.f9134h : j15;
                return new l(i12, str, arrayList14, j11, z10, j30, z8, i14, j22, i13, j20, j21, z6, z7, j30 != 0, c0094l4, arrayList21, arrayList9, kVar2, hashMap5, arrayList16);
            }
            String u4 = jVar.u();
            g gVar3 = gVar;
            if (u4.startsWith("#EXT")) {
                arrayList11.add(u4);
            }
            if (u4.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j31 = j(u4, f9233t, hashMap2);
                if ("VOD".equals(j31)) {
                    i12 = 1;
                } else if ("EVENT".equals(j31)) {
                    i12 = 2;
                }
            } else if (u4.equals("#EXT-X-I-FRAMES-ONLY")) {
                kVar = kVar2;
                gVar = gVar3;
                z9 = true;
            } else if (u4.startsWith("#EXT-X-START")) {
                long parseDouble = (long) (Double.parseDouble(j(u4, f9178F, Collections.EMPTY_MAP)) * 1000000.0d);
                z10 = f(u4, f9200b0);
                j11 = parseDouble;
            } else if (u4.startsWith("#EXT-X-SERVER-CONTROL")) {
                double g4 = g(u4, f9234u, -9.223372036854776E18d);
                long j32 = g4 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g4 * 1000000.0d);
                boolean f4 = f(u4, v);
                double g5 = g(u4, f9236x, -9.223372036854776E18d);
                long j33 = g5 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g5 * 1000000.0d);
                double g6 = g(u4, f9237y, -9.223372036854776E18d);
                gVar = gVar3;
                kVar = new k(j32, f4, j33, g6 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g6 * 1000000.0d), f(u4, z));
            } else if (u4.startsWith("#EXT-X-PART-INF")) {
                j21 = (long) (Double.parseDouble(j(u4, f9229r, Collections.EMPTY_MAP)) * 1000000.0d);
            } else {
                boolean startsWith = u4.startsWith("#EXT-X-MAP");
                Pattern pattern = f9181H;
                ArrayList arrayList22 = arrayList11;
                HashMap hashMap6 = hashMap3;
                Pattern pattern2 = f9186N;
                if (startsWith) {
                    String j34 = j(u4, pattern2, hashMap2);
                    String i20 = i(u4, pattern, null, hashMap2);
                    if (i20 != null) {
                        String str22 = J.f3263a;
                        String[] split = i20.split("@", -1);
                        j19 = Long.parseLong(split[i16]);
                        if (split.length > 1) {
                            j12 = Long.parseLong(split[1]);
                        }
                    }
                    long j35 = j19;
                    long j36 = j35 == -1 ? 0L : j12;
                    if (str17 != null && str16 == null) {
                        throw G.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                    }
                    i iVar4 = new i(j34, j36, j35, str17, str16);
                    String str23 = str16;
                    if (j35 != -1) {
                        j36 += j35;
                    }
                    j12 = j36;
                    iVar3 = iVar4;
                    j19 = -1;
                    kVar = kVar2;
                    gVar = gVar3;
                    arrayList11 = arrayList22;
                    hashMap3 = hashMap6;
                    str16 = str23;
                } else {
                    LinkedHashMap linkedHashMap4 = linkedHashMap2;
                    String str24 = str16;
                    if (u4.startsWith("#EXT-X-TARGETDURATION")) {
                        j20 = Integer.parseInt(j(u4, o, Collections.EMPTY_MAP)) * 1000000;
                    } else if (u4.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j14 = Long.parseLong(j(u4, f9168A, Collections.EMPTY_MAP));
                        j22 = j14;
                    } else if (u4.startsWith("#EXT-X-VERSION")) {
                        i13 = Integer.parseInt(j(u4, f9231s, Collections.EMPTY_MAP));
                    } else {
                        if (u4.startsWith("#EXT-X-DEFINE")) {
                            String i21 = i(u4, f9204d0, null, hashMap2);
                            if (i21 != null) {
                                String str25 = (String) oVar2.f9163j.get(i21);
                                if (str25 != null) {
                                    hashMap2.put(i21, str25);
                                }
                            } else {
                                hashMap2.put(j(u4, f9191S, hashMap2), j(u4, f9202c0, hashMap2));
                            }
                        } else if (u4.startsWith("#EXTINF")) {
                            j17 = new BigDecimal(j(u4, f9170B, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                            str14 = i(u4, f9172C, str13, hashMap2);
                        } else {
                            if (u4.startsWith("#EXT-X-SKIP")) {
                                int parseInt = Integer.parseInt(j(u4, f9235w, Collections.EMPTY_MAP));
                                AbstractC0124a.t((lVar2 == null || !arrayList8.isEmpty()) ? i16 : 1);
                                String str26 = J.f3263a;
                                long j37 = lVar2.f9137k;
                                I i22 = lVar2.f9142r;
                                int i23 = (int) (j22 - j37);
                                int i24 = parseInt + i23;
                                if (i23 >= 0 && i24 <= i22.size()) {
                                    long j38 = j16;
                                    str16 = str24;
                                    long j39 = j13;
                                    while (i23 < i24) {
                                        i iVar5 = (i) i22.get(i23);
                                        if (j22 != lVar2.f9137k) {
                                            int i25 = (lVar2.f9136j - i14) + iVar5.f9117d;
                                            I i26 = iVar5.f9113m;
                                            ArrayList arrayList23 = new ArrayList();
                                            long j40 = j39;
                                            int i27 = i16;
                                            while (i27 < i26.size()) {
                                                g gVar4 = (g) i26.get(i27);
                                                arrayList23.add(new g(gVar4.f9114a, gVar4.f9115b, gVar4.f9116c, i25, j40, gVar4.f9119f, gVar4.f9120g, gVar4.f9121h, gVar4.f9122i, gVar4.f9123j, gVar4.f9124k, gVar4.f9107l, gVar4.f9108m));
                                                j40 += gVar4.f9116c;
                                                i27++;
                                                i24 = i24;
                                            }
                                            i6 = i24;
                                            iVar5 = new i(iVar5.f9114a, iVar5.f9115b, iVar5.f9112l, iVar5.f9116c, i25, j39, iVar5.f9119f, iVar5.f9120g, iVar5.f9121h, iVar5.f9122i, iVar5.f9123j, iVar5.f9124k, arrayList23);
                                        } else {
                                            i6 = i24;
                                        }
                                        arrayList8.add(iVar5);
                                        long j41 = iVar5.f9116c;
                                        String str27 = iVar5.f9121h;
                                        long j42 = j39 + j41;
                                        long j43 = iVar5.f9123j;
                                        if (j43 != -1) {
                                            j12 = iVar5.f9122i + j43;
                                        }
                                        int i28 = iVar5.f9117d;
                                        i iVar6 = iVar5.f9115b;
                                        C0094l c0094l6 = iVar5.f9119f;
                                        String str28 = iVar5.f9120g;
                                        if (str27 == null || !str27.equals(Long.toHexString(j14))) {
                                            str16 = str27;
                                        }
                                        j14++;
                                        i23++;
                                        i15 = i28;
                                        iVar3 = iVar6;
                                        str17 = str28;
                                        c0094l5 = c0094l6;
                                        i24 = i6;
                                        j38 = j42;
                                        j39 = j38;
                                        lVar2 = lVar;
                                    }
                                    oVar2 = oVar;
                                    lVar2 = lVar;
                                    j13 = j39;
                                    gVar = gVar3;
                                    arrayList11 = arrayList22;
                                    hashMap3 = hashMap6;
                                    j16 = j38;
                                    kVar = kVar2;
                                }
                            } else if (u4.startsWith("#EXT-X-KEY")) {
                                String j44 = j(u4, f9184K, hashMap2);
                                String i29 = i(u4, L, "identity", hashMap2);
                                if ("NONE".equals(j44)) {
                                    treeMap2.clear();
                                    str16 = null;
                                } else {
                                    String i30 = i(u4, f9187O, null, hashMap2);
                                    if (!"identity".equals(i29)) {
                                        if (str15 == null) {
                                            str15 = ("SAMPLE-AES-CENC".equals(j44) || "SAMPLE-AES-CTR".equals(j44)) ? "cenc" : "cbcs";
                                        }
                                        C0093k c6 = c(u4, hashMap2, i29);
                                        if (c6 != null) {
                                            treeMap2.put(i29, c6);
                                            str16 = i30;
                                        }
                                    } else if ("AES-128".equals(j44)) {
                                        str17 = j(u4, pattern2, hashMap2);
                                        str16 = i30;
                                        oVar2 = oVar;
                                        lVar2 = lVar;
                                        kVar = kVar2;
                                        gVar = gVar3;
                                        arrayList11 = arrayList22;
                                        hashMap3 = hashMap6;
                                    }
                                    str16 = i30;
                                    str17 = null;
                                    oVar2 = oVar;
                                    lVar2 = lVar;
                                    kVar = kVar2;
                                    gVar = gVar3;
                                    arrayList11 = arrayList22;
                                    hashMap3 = hashMap6;
                                }
                                c0094l5 = null;
                                str17 = null;
                                oVar2 = oVar;
                                lVar2 = lVar;
                                kVar = kVar2;
                                gVar = gVar3;
                                arrayList11 = arrayList22;
                                hashMap3 = hashMap6;
                            } else {
                                if (u4.startsWith("#EXT-X-BYTERANGE")) {
                                    String j45 = j(u4, f9180G, hashMap2);
                                    String str29 = J.f3263a;
                                    String[] split2 = j45.split("@", -1);
                                    j19 = Long.parseLong(split2[i16]);
                                    if (split2.length > 1) {
                                        j12 = Long.parseLong(split2[1]);
                                    }
                                } else if (u4.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    i14 = Integer.parseInt(u4.substring(u4.indexOf(58) + 1));
                                    oVar2 = oVar;
                                    lVar2 = lVar;
                                    kVar = kVar2;
                                    gVar = gVar3;
                                    arrayList11 = arrayList22;
                                    hashMap3 = hashMap6;
                                    str16 = str24;
                                    linkedHashMap2 = linkedHashMap4;
                                    z8 = true;
                                } else if (u4.equals("#EXT-X-DISCONTINUITY")) {
                                    i15++;
                                } else if (u4.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                    if (j15 == 0) {
                                        j15 = J.M(J.P(u4.substring(u4.indexOf(58) + 1))) - j13;
                                    }
                                } else if (u4.equals("#EXT-X-GAP")) {
                                    oVar2 = oVar;
                                    lVar2 = lVar;
                                    kVar = kVar2;
                                    gVar = gVar3;
                                    arrayList11 = arrayList22;
                                    hashMap3 = hashMap6;
                                    str16 = str24;
                                    linkedHashMap2 = linkedHashMap4;
                                    i17 = 1;
                                } else if (u4.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                    oVar2 = oVar;
                                    lVar2 = lVar;
                                    kVar = kVar2;
                                    gVar = gVar3;
                                    arrayList11 = arrayList22;
                                    hashMap3 = hashMap6;
                                    str16 = str24;
                                    linkedHashMap2 = linkedHashMap4;
                                    z6 = true;
                                } else if (u4.equals("#EXT-X-ENDLIST")) {
                                    oVar2 = oVar;
                                    lVar2 = lVar;
                                    kVar = kVar2;
                                    gVar = gVar3;
                                    arrayList11 = arrayList22;
                                    hashMap3 = hashMap6;
                                    str16 = str24;
                                    linkedHashMap2 = linkedHashMap4;
                                    z7 = true;
                                } else if (u4.startsWith("#EXT-X-RENDITION-REPORT")) {
                                    long h2 = h(u4, f9174D);
                                    Matcher matcher3 = f9176E.matcher(u4);
                                    if (matcher3.find()) {
                                        String group = matcher3.group(1);
                                        group.getClass();
                                        i7 = Integer.parseInt(group);
                                    } else {
                                        i7 = -1;
                                    }
                                    arrayList10.add(new h(i7, h2, Uri.parse(AbstractC0108a.p(str, j(u4, pattern2, hashMap2)))));
                                } else if (u4.startsWith("#EXT-X-PRELOAD-HINT")) {
                                    if (gVar3 == null && "PART".equals(j(u4, f9189Q, hashMap2))) {
                                        String j46 = j(u4, pattern2, hashMap2);
                                        long h4 = h(u4, f9182I);
                                        long h5 = h(u4, f9183J);
                                        String hexString = str17 == null ? null : str24 != null ? str24 : Long.toHexString(j14);
                                        if (c0094l5 != null || treeMap2.isEmpty()) {
                                            c0094l = c0094l5;
                                        } else {
                                            C0093k[] c0093kArr = (C0093k[]) treeMap2.values().toArray(new C0093k[i16]);
                                            C0094l c0094l7 = new C0094l(str15, true, c0093kArr);
                                            if (c0094l4 == null) {
                                                c0094l4 = b(str15, c0093kArr);
                                            }
                                            c0094l = c0094l7;
                                        }
                                        gVar = (h4 == -1 || h5 != -1) ? new g(j46, iVar3, 0L, i15, j16, c0094l, str17, hexString, h4 != -1 ? h4 : 0L, h5, false, false, true) : gVar3;
                                        oVar2 = oVar;
                                        lVar2 = lVar;
                                        c0094l5 = c0094l;
                                        kVar = kVar2;
                                        arrayList11 = arrayList22;
                                        hashMap3 = hashMap6;
                                        str16 = str24;
                                        linkedHashMap2 = linkedHashMap4;
                                        i16 = 0;
                                    }
                                } else if (u4.startsWith("#EXT-X-PART")) {
                                    String hexString2 = str17 == null ? null : str24 != null ? str24 : Long.toHexString(j14);
                                    String j47 = j(u4, pattern2, hashMap2);
                                    long parseDouble2 = (long) (Double.parseDouble(j(u4, f9225p, Collections.EMPTY_MAP)) * 1000000.0d);
                                    boolean f5 = f(u4, f9198Z) | (z6 && arrayList9.isEmpty());
                                    boolean f6 = f(u4, f9199a0);
                                    String i31 = i(u4, pattern, null, hashMap2);
                                    if (i31 != null) {
                                        String str30 = J.f3263a;
                                        String[] split3 = i31.split("@", -1);
                                        long parseLong = Long.parseLong(split3[0]);
                                        if (split3.length > 1) {
                                            j18 = Long.parseLong(split3[1]);
                                        }
                                        j10 = parseLong;
                                    } else {
                                        j10 = -1;
                                    }
                                    long j48 = j10 == -1 ? 0L : j18;
                                    if (c0094l5 != null || treeMap2.isEmpty()) {
                                        c0094l3 = c0094l5;
                                    } else {
                                        C0093k[] c0093kArr2 = (C0093k[]) treeMap2.values().toArray(new C0093k[0]);
                                        C0094l c0094l8 = new C0094l(str15, true, c0093kArr2);
                                        if (c0094l4 == null) {
                                            c0094l4 = b(str15, c0093kArr2);
                                        }
                                        c0094l3 = c0094l8;
                                    }
                                    g gVar5 = new g(j47, iVar3, parseDouble2, i15, j16, c0094l3, str17, hexString2, j48, j10, f6, f5, false);
                                    i iVar7 = iVar3;
                                    int i32 = i15;
                                    arrayList9.add(gVar5);
                                    j16 += parseDouble2;
                                    if (j10 != -1) {
                                        j48 += j10;
                                    }
                                    j18 = j48;
                                    lVar2 = lVar;
                                    i15 = i32;
                                    iVar3 = iVar7;
                                    c0094l5 = c0094l3;
                                    kVar = kVar2;
                                    gVar = gVar3;
                                    arrayList11 = arrayList22;
                                    hashMap3 = hashMap6;
                                    str16 = str24;
                                    linkedHashMap2 = linkedHashMap4;
                                    i16 = 0;
                                    oVar2 = oVar;
                                } else {
                                    i iVar8 = iVar3;
                                    int i33 = i15;
                                    if (u4.startsWith("#EXT-X-DATERANGE") && i(u4, f9208f0, str13, hashMap2).equals("com.apple.hls.interstitial")) {
                                        String j49 = j(u4, f9206e0, hashMap2);
                                        String i34 = i(u4, f9220l0, null, hashMap2);
                                        Uri parse = i34 != null ? Uri.parse(i34) : null;
                                        String i35 = i(u4, f9222m0, null, hashMap2);
                                        Uri parse2 = i35 != null ? Uri.parse(i35) : null;
                                        String i36 = i(u4, f9210g0, null, hashMap2);
                                        long M4 = i36 != null ? J.M(J.P(i36)) : -9223372036854775807L;
                                        String i37 = i(u4, f9214i0, null, hashMap2);
                                        long M5 = i37 != null ? J.M(J.P(i37)) : -9223372036854775807L;
                                        ArrayList arrayList24 = new ArrayList();
                                        i8 = i33;
                                        String i38 = i(u4, f9212h0, null, hashMap2);
                                        if (i38 != null) {
                                            String str31 = J.f3263a;
                                            arrayList5 = arrayList9;
                                            String[] split4 = i38.split(StringUtils.COMMA, -1);
                                            int length = split4.length;
                                            int i39 = 0;
                                            while (i39 < length) {
                                                int i40 = i39;
                                                String trim = split4[i39].trim();
                                                trim.getClass();
                                                switch (trim.hashCode()) {
                                                    case 79491:
                                                        i11 = length;
                                                        if (trim.equals("PRE")) {
                                                            c5 = 0;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    case 2430593:
                                                        i11 = length;
                                                        if (trim.equals("ONCE")) {
                                                            c5 = 1;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    case 2461856:
                                                        i11 = length;
                                                        if (trim.equals("POST")) {
                                                            c5 = 2;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    default:
                                                        i11 = length;
                                                        c5 = 65535;
                                                        break;
                                                }
                                                switch (c5) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                        arrayList24.add(trim);
                                                        break;
                                                }
                                                i39 = i40 + 1;
                                                length = i11;
                                            }
                                        } else {
                                            arrayList5 = arrayList9;
                                        }
                                        iVar = iVar8;
                                        String str32 = str13;
                                        double g7 = g(u4, f9227q, -1.0d);
                                        long j50 = g7 >= 0.0d ? (long) (g7 * 1000000.0d) : -9223372036854775807L;
                                        double g8 = g(u4, f9216j0, -1.0d);
                                        long j51 = g8 >= 0.0d ? (long) (g8 * 1000000.0d) : -9223372036854775807L;
                                        boolean f7 = f(u4, f9218k0);
                                        str2 = str32;
                                        ArrayList arrayList25 = arrayList10;
                                        double g9 = g(u4, f9223n0, Double.MIN_VALUE);
                                        long j52 = g9 != Double.MIN_VALUE ? (long) (g9 * 1000000.0d) : -9223372036854775807L;
                                        ArrayList arrayList26 = arrayList25;
                                        double g10 = g(u4, f9224o0, -1.0d);
                                        long j53 = g10 >= 0.0d ? (long) (g10 * 1000000.0d) : -9223372036854775807L;
                                        ArrayList arrayList27 = new ArrayList();
                                        String i41 = i(u4, f9226p0, null, hashMap2);
                                        if (i41 != null) {
                                            String str33 = J.f3263a;
                                            String[] split5 = i41.split(StringUtils.COMMA, -1);
                                            int length2 = split5.length;
                                            z4 = f7;
                                            int i42 = 0;
                                            while (i42 < length2) {
                                                int i43 = i42;
                                                String trim2 = split5[i42].trim();
                                                trim2.getClass();
                                                ArrayList arrayList28 = arrayList26;
                                                if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                    arrayList27.add(trim2);
                                                }
                                                i42 = i43 + 1;
                                                arrayList26 = arrayList28;
                                            }
                                        } else {
                                            z4 = f7;
                                        }
                                        arrayList3 = arrayList26;
                                        ArrayList arrayList29 = new ArrayList();
                                        String i44 = i(u4, f9228q0, null, hashMap2);
                                        if (i44 != null) {
                                            String str34 = J.f3263a;
                                            String[] split6 = i44.split(StringUtils.COMMA, -1);
                                            int length3 = split6.length;
                                            int i45 = 0;
                                            while (i45 < length3) {
                                                String trim3 = split6[i45].trim();
                                                trim3.getClass();
                                                String[] strArr = split6;
                                                if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                    arrayList29.add(trim3);
                                                }
                                                i45++;
                                                split6 = strArr;
                                            }
                                        }
                                        Boolean valueOf = i(u4, f9230r0, null, hashMap2) != null ? Boolean.valueOf(!r4.equals("NO")) : null;
                                        String i46 = i(u4, f9232s0, null, hashMap2);
                                        if (i46 != null) {
                                            str5 = "RANGE";
                                            if (!i46.equals("RANGE")) {
                                                str5 = "POINT";
                                            }
                                            i10 = i(u4, f9169A0, null, hashMap2);
                                            if (i10 != null) {
                                                str6 = "PRIMARY";
                                                if (!i10.equals("PRIMARY")) {
                                                    str6 = "HIGHLIGHT";
                                                }
                                                treeMap = treeMap2;
                                                str4 = str15;
                                                double g11 = g(u4, f9171B0, -1.0d);
                                                j8 = g11 >= 0.0d ? (long) (g11 * 1000000.0d) : -9223372036854775807L;
                                                double g12 = g(u4, f9173C0, -1.0d);
                                                j9 = g12 >= 0.0d ? (long) (g12 * 1000000.0d) : -9223372036854775807L;
                                                String i47 = i(u4, f9175D0, null, hashMap2);
                                                arrayList6 = new ArrayList();
                                                String substring = u4.substring(17);
                                                matcher = f9179F0.matcher(substring);
                                                while (matcher.find()) {
                                                    String group2 = matcher.group();
                                                    group2.getClass();
                                                    switch (group2.hashCode()) {
                                                        case -2136701954:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-SNAP=")) {
                                                                c4 = 0;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case -1843050726:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-CONTENT-MAY-VARY=")) {
                                                                c4 = 1;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case -148960310:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                c4 = 2;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case -36345757:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-TIMELINE-STYLE=")) {
                                                                c4 = 3;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 397239341:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-ASSET-LIST=")) {
                                                                c4 = 4;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 850193465:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-TIMELINE-OCCUPIES=")) {
                                                                c4 = 5;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 1065650400:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-SKIP-CONTROL-DURATION=")) {
                                                                c4 = 6;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 1274498945:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-SKIP-CONTROL-OFFSET=")) {
                                                                c4 = 7;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 1472528844:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-RESTRICT=")) {
                                                                c4 = '\b';
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 1748487807:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-RESUME-OFFSET=")) {
                                                                c4 = '\t';
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 1814205923:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-ASSET-URI=")) {
                                                                c4 = '\n';
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        case 2080546752:
                                                            matcher2 = matcher;
                                                            if (group2.equals("X-SKIP-CONTROL-LABEL-ID=")) {
                                                                c4 = 11;
                                                                break;
                                                            }
                                                            c4 = 65535;
                                                            break;
                                                        default:
                                                            matcher2 = matcher;
                                                            c4 = 65535;
                                                            break;
                                                    }
                                                    switch (c4) {
                                                        case 0:
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case '\b':
                                                        case '\t':
                                                        case '\n':
                                                        case 11:
                                                            arrayList7 = arrayList8;
                                                            str10 = i47;
                                                            str11 = str5;
                                                            str12 = str6;
                                                            break;
                                                        default:
                                                            arrayList7 = arrayList8;
                                                            String substring2 = group2.substring(0, group2.length() - 1);
                                                            String z13 = AbstractC0005f.z(substring2, "=");
                                                            int length4 = z13.length() + substring.indexOf(z13);
                                                            str10 = i47;
                                                            String substring3 = substring.substring(length4, (substring.length() == length4 + 1 ? 1 : 2) + length4);
                                                            if (substring3.startsWith("\"")) {
                                                                dVar = new d(substring2, j(substring, Pattern.compile(substring2 + "=\"((?:.|\f)+?)\""), hashMap2), 0);
                                                                str11 = str5;
                                                                str12 = str6;
                                                            } else if (substring3.equals("0x") || substring3.equals("0X")) {
                                                                str11 = str5;
                                                                str12 = str6;
                                                                dVar = new d(substring2, j(substring, Pattern.compile(substring2 + "=(0[xX][A-F0-9]+)"), hashMap2), 1);
                                                            } else {
                                                                str11 = str5;
                                                                str12 = str6;
                                                                dVar = new d(substring2, Double.parseDouble(j(substring, Pattern.compile(substring2 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP)));
                                                            }
                                                            arrayList6.add(dVar);
                                                            break;
                                                    }
                                                    str5 = str11;
                                                    matcher = matcher2;
                                                    i47 = str10;
                                                    str6 = str12;
                                                    arrayList8 = arrayList7;
                                                }
                                                arrayList4 = arrayList8;
                                                str7 = i47;
                                                String str35 = str5;
                                                str8 = str6;
                                                linkedHashMap = linkedHashMap4;
                                                e eVar2 = linkedHashMap.containsKey(j49) ? (e) linkedHashMap.get(j49) : new e(j49);
                                                if (parse == null) {
                                                    eVar2.getClass();
                                                } else {
                                                    Uri uri4 = eVar2.f9073c;
                                                    if (uri4 != null) {
                                                        AbstractC0124a.l(uri4.equals(parse), "Can't change assetUri from %s to %s", eVar2.f9073c, parse);
                                                    }
                                                    eVar2.f9073c = parse;
                                                }
                                                if (parse2 != null) {
                                                    Uri uri5 = eVar2.f9074d;
                                                    if (uri5 != null) {
                                                        AbstractC0124a.l(uri5.equals(parse2), "Can't change assetListUri from %s to %s", eVar2.f9074d, parse2);
                                                    }
                                                    eVar2.f9074d = parse2;
                                                }
                                                if (M4 != -9223372036854775807L) {
                                                    long j54 = eVar2.f9075e;
                                                    if (j54 != -9223372036854775807L) {
                                                        AbstractC0124a.j(j54 == M4, "Can't change startDateUnixUs from %s to %s", j54, M4);
                                                    }
                                                    eVar2.f9075e = M4;
                                                }
                                                if (M5 != -9223372036854775807L) {
                                                    long j55 = eVar2.f9076f;
                                                    if (j55 != -9223372036854775807L) {
                                                        AbstractC0124a.j(j55 == M5, "Can't change endDateUnixUs from %s to %s", j55, M5);
                                                    }
                                                    eVar2.f9076f = M5;
                                                }
                                                if (j50 != -9223372036854775807L) {
                                                    long j56 = eVar2.f9077g;
                                                    if (j56 != -9223372036854775807L) {
                                                        AbstractC0124a.j(j56 == j50, "Can't change durationUs from %s to %s", j56, j50);
                                                    }
                                                    eVar2.f9077g = j50;
                                                }
                                                if (j51 != -9223372036854775807L) {
                                                    long j57 = eVar2.f9078h;
                                                    if (j57 != -9223372036854775807L) {
                                                        AbstractC0124a.j(j57 == j51, "Can't change plannedDurationUs from %s to %s", j57, j51);
                                                    }
                                                    eVar2.f9078h = j51;
                                                }
                                                if (arrayList24.isEmpty()) {
                                                    str9 = str35;
                                                } else {
                                                    if (eVar2.f9079i.isEmpty()) {
                                                        str9 = str35;
                                                    } else {
                                                        boolean equals = eVar2.f9079i.equals(arrayList24);
                                                        StringBuilder sb = new StringBuilder("Can't change cue from ");
                                                        ArrayList arrayList30 = eVar2.f9079i;
                                                        StringBuilder sb2 = new StringBuilder();
                                                        Iterator it3 = arrayList30.iterator();
                                                        if (it3.hasNext()) {
                                                            str9 = str35;
                                                            Object next = it3.next();
                                                            while (true) {
                                                                sb2.append((CharSequence) next);
                                                                if (it3.hasNext()) {
                                                                    sb2.append((CharSequence) ", ");
                                                                    next = it3.next();
                                                                }
                                                            }
                                                        } else {
                                                            str9 = str35;
                                                        }
                                                        sb.append(sb2.toString());
                                                        sb.append(" to ");
                                                        StringBuilder sb3 = new StringBuilder();
                                                        Iterator it4 = arrayList24.iterator();
                                                        if (it4.hasNext()) {
                                                            while (true) {
                                                                sb3.append((CharSequence) it4.next());
                                                                if (it4.hasNext()) {
                                                                    sb3.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb.append(sb3.toString());
                                                        AbstractC0124a.g(sb.toString(), equals);
                                                    }
                                                    eVar2.f9079i = arrayList24;
                                                }
                                                if (z4) {
                                                    eVar2.f9080j = true;
                                                }
                                                if (j52 != -9223372036854775807L) {
                                                    long j58 = eVar2.f9081k;
                                                    if (j58 != -9223372036854775807L) {
                                                        AbstractC0124a.j(j58 == j52, "Can't change resumeOffsetUs from %s to %s", j58, j52);
                                                    }
                                                    eVar2.f9081k = j52;
                                                }
                                                if (j53 != -9223372036854775807L) {
                                                    long j59 = eVar2.f9082l;
                                                    if (j59 != -9223372036854775807L) {
                                                        AbstractC0124a.j(j59 == j53, "Can't change playoutLimitUs from %s to %s", j59, j53);
                                                    }
                                                    eVar2.f9082l = j53;
                                                }
                                                if (!arrayList27.isEmpty()) {
                                                    if (!eVar2.f9083m.isEmpty()) {
                                                        boolean equals2 = eVar2.f9083m.equals(arrayList27);
                                                        StringBuilder sb4 = new StringBuilder("Can't change snapTypes from ");
                                                        ArrayList arrayList31 = eVar2.f9083m;
                                                        StringBuilder sb5 = new StringBuilder();
                                                        Iterator it5 = arrayList31.iterator();
                                                        if (it5.hasNext()) {
                                                            while (true) {
                                                                sb5.append((CharSequence) it5.next());
                                                                if (it5.hasNext()) {
                                                                    sb5.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb4.append(sb5.toString());
                                                        sb4.append(" to ");
                                                        StringBuilder sb6 = new StringBuilder();
                                                        Iterator it6 = arrayList27.iterator();
                                                        if (it6.hasNext()) {
                                                            while (true) {
                                                                sb6.append((CharSequence) it6.next());
                                                                if (it6.hasNext()) {
                                                                    sb6.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb4.append(sb6.toString());
                                                        AbstractC0124a.g(sb4.toString(), equals2);
                                                    }
                                                    eVar2.f9083m = arrayList27;
                                                }
                                                eVar2.getClass();
                                                if (!arrayList29.isEmpty()) {
                                                    if (!eVar2.n.isEmpty()) {
                                                        boolean equals3 = eVar2.n.equals(arrayList29);
                                                        StringBuilder sb7 = new StringBuilder("Can't change restrictions from ");
                                                        ArrayList arrayList32 = eVar2.n;
                                                        StringBuilder sb8 = new StringBuilder();
                                                        Iterator it7 = arrayList32.iterator();
                                                        if (it7.hasNext()) {
                                                            while (true) {
                                                                sb8.append((CharSequence) it7.next());
                                                                if (it7.hasNext()) {
                                                                    sb8.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb7.append(sb8.toString());
                                                        sb7.append(" to ");
                                                        StringBuilder sb9 = new StringBuilder();
                                                        Iterator it8 = arrayList29.iterator();
                                                        if (it8.hasNext()) {
                                                            while (true) {
                                                                sb9.append((CharSequence) it8.next());
                                                                if (it8.hasNext()) {
                                                                    sb9.append((CharSequence) ", ");
                                                                }
                                                            }
                                                        }
                                                        sb7.append(sb9.toString());
                                                        AbstractC0124a.g(sb7.toString(), equals3);
                                                    }
                                                    eVar2.n = arrayList29;
                                                }
                                                HashMap hashMap7 = eVar2.f9072b;
                                                if (!arrayList6.isEmpty()) {
                                                    for (int i48 = 0; i48 < arrayList6.size(); i48++) {
                                                        d dVar2 = (d) arrayList6.get(i48);
                                                        String str36 = dVar2.f9067a;
                                                        d dVar3 = (d) hashMap7.get(str36);
                                                        if (dVar3 != null) {
                                                            boolean equals4 = dVar3.equals(dVar2);
                                                            Object[] objArr = {str36, dVar3.f9070d, Double.valueOf(dVar3.f9069c), dVar2.f9070d, Double.valueOf(dVar2.f9069c)};
                                                            if (!equals4) {
                                                                throw new IllegalArgumentException(AbstractC0347t0.n("Can't change %s from %s %s to %s %s", objArr));
                                                            }
                                                        }
                                                        hashMap7.put(str36, dVar2);
                                                    }
                                                }
                                                if (valueOf != null) {
                                                    Boolean bool2 = eVar2.o;
                                                    if (bool2 != null) {
                                                        AbstractC0124a.l(bool2.equals(valueOf), "Can't change contentMayVary from %s to %s", eVar2.o, valueOf);
                                                    }
                                                    eVar2.o = valueOf;
                                                }
                                                if (str9 != null) {
                                                    String str37 = eVar2.f9084p;
                                                    String str38 = str9;
                                                    if (str37 != null) {
                                                        AbstractC0124a.l(str37.equals(str38), "Can't change timelineOccupies from %s to %s", eVar2.f9084p, str38);
                                                    }
                                                    eVar2.f9084p = str38;
                                                }
                                                if (str8 != null) {
                                                    String str39 = eVar2.f9085q;
                                                    if (str39 != null) {
                                                        AbstractC0124a.l(str39.equals(str8), "Can't change timelineStyle from %s to %s", eVar2.f9085q, str8);
                                                    }
                                                    eVar2.f9085q = str8;
                                                }
                                                if (j8 != -9223372036854775807L) {
                                                    long j60 = eVar2.f9086r;
                                                    if (j60 != -9223372036854775807L) {
                                                        AbstractC0124a.j(j60 == j8, "Can't change skipControlOffsetUs from %s to %s", j60, j8);
                                                    }
                                                    eVar2.f9086r = j8;
                                                }
                                                if (j9 != -9223372036854775807L) {
                                                    long j61 = eVar2.f9087s;
                                                    if (j61 != -9223372036854775807L) {
                                                        AbstractC0124a.j(j61 == j9, "Can't change skipControlDurationUs from %s to %s", j61, j9);
                                                    }
                                                    eVar2.f9087s = j9;
                                                }
                                                if (str7 != null) {
                                                    String str40 = eVar2.f9088t;
                                                    if (str40 != null) {
                                                        AbstractC0124a.l(str40.equals(str7), "Can't change skipControlLabelId from %s to %s", eVar2.f9088t, str7);
                                                    }
                                                    eVar2.f9088t = str7;
                                                }
                                                linkedHashMap.put(j49, eVar2);
                                            }
                                            str6 = null;
                                            treeMap = treeMap2;
                                            str4 = str15;
                                            double g112 = g(u4, f9171B0, -1.0d);
                                            if (g112 >= 0.0d) {
                                            }
                                            double g122 = g(u4, f9173C0, -1.0d);
                                            if (g122 >= 0.0d) {
                                            }
                                            String i472 = i(u4, f9175D0, null, hashMap2);
                                            arrayList6 = new ArrayList();
                                            String substring4 = u4.substring(17);
                                            matcher = f9179F0.matcher(substring4);
                                            while (matcher.find()) {
                                            }
                                            arrayList4 = arrayList8;
                                            str7 = i472;
                                            String str352 = str5;
                                            str8 = str6;
                                            linkedHashMap = linkedHashMap4;
                                            if (linkedHashMap.containsKey(j49)) {
                                            }
                                            if (parse == null) {
                                            }
                                            if (parse2 != null) {
                                            }
                                            if (M4 != -9223372036854775807L) {
                                            }
                                            if (M5 != -9223372036854775807L) {
                                            }
                                            if (j50 != -9223372036854775807L) {
                                            }
                                            if (j51 != -9223372036854775807L) {
                                            }
                                            if (arrayList24.isEmpty()) {
                                            }
                                            if (z4) {
                                            }
                                            if (j52 != -9223372036854775807L) {
                                            }
                                            if (j53 != -9223372036854775807L) {
                                            }
                                            if (!arrayList27.isEmpty()) {
                                            }
                                            eVar2.getClass();
                                            if (!arrayList29.isEmpty()) {
                                            }
                                            HashMap hashMap72 = eVar2.f9072b;
                                            if (!arrayList6.isEmpty()) {
                                            }
                                            if (valueOf != null) {
                                            }
                                            if (str9 != null) {
                                            }
                                            if (str8 != null) {
                                            }
                                            if (j8 != -9223372036854775807L) {
                                            }
                                            if (j9 != -9223372036854775807L) {
                                            }
                                            if (str7 != null) {
                                            }
                                            linkedHashMap.put(j49, eVar2);
                                        }
                                        str5 = null;
                                        i10 = i(u4, f9169A0, null, hashMap2);
                                        if (i10 != null) {
                                        }
                                        str6 = null;
                                        treeMap = treeMap2;
                                        str4 = str15;
                                        double g1122 = g(u4, f9171B0, -1.0d);
                                        if (g1122 >= 0.0d) {
                                        }
                                        double g1222 = g(u4, f9173C0, -1.0d);
                                        if (g1222 >= 0.0d) {
                                        }
                                        String i4722 = i(u4, f9175D0, null, hashMap2);
                                        arrayList6 = new ArrayList();
                                        String substring42 = u4.substring(17);
                                        matcher = f9179F0.matcher(substring42);
                                        while (matcher.find()) {
                                        }
                                        arrayList4 = arrayList8;
                                        str7 = i4722;
                                        String str3522 = str5;
                                        str8 = str6;
                                        linkedHashMap = linkedHashMap4;
                                        if (linkedHashMap.containsKey(j49)) {
                                        }
                                        if (parse == null) {
                                        }
                                        if (parse2 != null) {
                                        }
                                        if (M4 != -9223372036854775807L) {
                                        }
                                        if (M5 != -9223372036854775807L) {
                                        }
                                        if (j50 != -9223372036854775807L) {
                                        }
                                        if (j51 != -9223372036854775807L) {
                                        }
                                        if (arrayList24.isEmpty()) {
                                        }
                                        if (z4) {
                                        }
                                        if (j52 != -9223372036854775807L) {
                                        }
                                        if (j53 != -9223372036854775807L) {
                                        }
                                        if (!arrayList27.isEmpty()) {
                                        }
                                        eVar2.getClass();
                                        if (!arrayList29.isEmpty()) {
                                        }
                                        HashMap hashMap722 = eVar2.f9072b;
                                        if (!arrayList6.isEmpty()) {
                                        }
                                        if (valueOf != null) {
                                        }
                                        if (str9 != null) {
                                        }
                                        if (str8 != null) {
                                        }
                                        if (j8 != -9223372036854775807L) {
                                        }
                                        if (j9 != -9223372036854775807L) {
                                        }
                                        if (str7 != null) {
                                        }
                                        linkedHashMap.put(j49, eVar2);
                                    } else {
                                        i8 = i33;
                                        arrayList4 = arrayList8;
                                        arrayList5 = arrayList9;
                                        arrayList3 = arrayList10;
                                        treeMap = treeMap2;
                                        str4 = str15;
                                        iVar = iVar8;
                                        str2 = str13;
                                        linkedHashMap = linkedHashMap4;
                                        if (!u4.startsWith("#")) {
                                            String hexString3 = str17 == null ? null : str24 != null ? str24 : Long.toHexString(j14);
                                            long j62 = j14 + 1;
                                            String k4 = k(u4, hashMap2);
                                            hashMap3 = hashMap6;
                                            i iVar9 = (i) hashMap3.get(k4);
                                            if (j19 == -1) {
                                                iVar2 = iVar9;
                                                j12 = 0;
                                            } else if (z9 && iVar == null && iVar9 == null) {
                                                i iVar10 = new i(k4, 0L, j12, null, null);
                                                hashMap3.put(k4, iVar10);
                                                iVar2 = iVar10;
                                            } else {
                                                iVar2 = iVar9;
                                                j12 = j12;
                                            }
                                            if (c0094l5 != null || treeMap.isEmpty()) {
                                                str15 = str4;
                                                i9 = 0;
                                            } else {
                                                i9 = 0;
                                                C0093k[] c0093kArr3 = (C0093k[]) treeMap.values().toArray(new C0093k[0]);
                                                str15 = str4;
                                                C0094l c0094l9 = new C0094l(str15, true, c0093kArr3);
                                                if (c0094l4 == null) {
                                                    c0094l2 = b(str15, c0093kArr3);
                                                    c0094l5 = c0094l9;
                                                    j7 = j12;
                                                    long j63 = j13;
                                                    C0094l c0094l10 = c0094l5;
                                                    long j64 = j7;
                                                    long j65 = j17;
                                                    String str41 = hexString3;
                                                    String str42 = str17;
                                                    str17 = str42;
                                                    arrayList4.add(new i(k4, iVar == null ? iVar : iVar2, str14, j65, i8, j63, c0094l10, str42, str41, j64, j19, i17, arrayList5));
                                                    j16 = j63 + j65;
                                                    ArrayList arrayList33 = new ArrayList();
                                                    j12 = j19 == -1 ? j64 + j19 : j64;
                                                    j14 = j62;
                                                    c0094l4 = c0094l2;
                                                    i16 = i9;
                                                    i17 = i16;
                                                    arrayList9 = arrayList33;
                                                    i15 = i8;
                                                    c0094l5 = c0094l10;
                                                    j13 = j16;
                                                    iVar3 = iVar;
                                                    str13 = str2;
                                                    str14 = str13;
                                                    j17 = 0;
                                                    j19 = -1;
                                                    kVar = kVar2;
                                                    arrayList11 = arrayList22;
                                                    str16 = str24;
                                                    arrayList10 = arrayList3;
                                                    treeMap2 = treeMap;
                                                    oVar2 = oVar;
                                                    lVar2 = lVar;
                                                    linkedHashMap2 = linkedHashMap;
                                                    arrayList8 = arrayList4;
                                                    gVar = gVar3;
                                                } else {
                                                    c0094l5 = c0094l9;
                                                }
                                            }
                                            j7 = j12;
                                            c0094l2 = c0094l4;
                                            long j632 = j13;
                                            C0094l c0094l102 = c0094l5;
                                            long j642 = j7;
                                            long j652 = j17;
                                            String str412 = hexString3;
                                            String str422 = str17;
                                            str17 = str422;
                                            arrayList4.add(new i(k4, iVar == null ? iVar : iVar2, str14, j652, i8, j632, c0094l102, str422, str412, j642, j19, i17, arrayList5));
                                            j16 = j632 + j652;
                                            ArrayList arrayList332 = new ArrayList();
                                            if (j19 == -1) {
                                            }
                                            j14 = j62;
                                            c0094l4 = c0094l2;
                                            i16 = i9;
                                            i17 = i16;
                                            arrayList9 = arrayList332;
                                            i15 = i8;
                                            c0094l5 = c0094l102;
                                            j13 = j16;
                                            iVar3 = iVar;
                                            str13 = str2;
                                            str14 = str13;
                                            j17 = 0;
                                            j19 = -1;
                                            kVar = kVar2;
                                            arrayList11 = arrayList22;
                                            str16 = str24;
                                            arrayList10 = arrayList3;
                                            treeMap2 = treeMap;
                                            oVar2 = oVar;
                                            lVar2 = lVar;
                                            linkedHashMap2 = linkedHashMap;
                                            arrayList8 = arrayList4;
                                            gVar = gVar3;
                                        }
                                    }
                                    j6 = j12;
                                    i4 = i8;
                                    j4 = j13;
                                    arrayList9 = arrayList5;
                                    j5 = j17;
                                    str3 = str14;
                                    hashMap3 = hashMap6;
                                    str15 = str4;
                                    arrayList2 = arrayList4;
                                    i5 = 0;
                                    oVar2 = oVar;
                                    lVar2 = lVar;
                                    linkedHashMap2 = linkedHashMap;
                                    i16 = i5;
                                    str14 = str3;
                                    j17 = j5;
                                    j13 = j4;
                                    j12 = j6;
                                    iVar3 = iVar;
                                    str13 = str2;
                                    kVar = kVar2;
                                    arrayList11 = arrayList22;
                                    str16 = str24;
                                    arrayList10 = arrayList3;
                                    treeMap2 = treeMap;
                                    arrayList8 = arrayList2;
                                    i15 = i4;
                                    gVar = gVar3;
                                }
                                oVar2 = oVar;
                                lVar2 = lVar;
                            }
                            linkedHashMap2 = linkedHashMap4;
                        }
                        arrayList2 = arrayList8;
                        arrayList3 = arrayList10;
                        treeMap = treeMap2;
                        str2 = str13;
                        j4 = j13;
                        iVar = iVar3;
                        i4 = i15;
                        i5 = i16;
                        j5 = j17;
                        str3 = str14;
                        hashMap3 = hashMap6;
                        linkedHashMap = linkedHashMap4;
                        j6 = j12;
                        oVar2 = oVar;
                        lVar2 = lVar;
                        linkedHashMap2 = linkedHashMap;
                        i16 = i5;
                        str14 = str3;
                        j17 = j5;
                        j13 = j4;
                        j12 = j6;
                        iVar3 = iVar;
                        str13 = str2;
                        kVar = kVar2;
                        arrayList11 = arrayList22;
                        str16 = str24;
                        arrayList10 = arrayList3;
                        treeMap2 = treeMap;
                        arrayList8 = arrayList2;
                        i15 = i4;
                        gVar = gVar3;
                    }
                    kVar = kVar2;
                    gVar = gVar3;
                    arrayList11 = arrayList22;
                    hashMap3 = hashMap6;
                    str16 = str24;
                    linkedHashMap2 = linkedHashMap4;
                }
            }
            kVar = kVar2;
            gVar = gVar3;
        }
        throw new q();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0231, code lost:
    
        if (r3 > 0) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025f  */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o e(B1.j jVar, String str) {
        int i4;
        char c4;
        ArrayList arrayList;
        n nVar;
        String str2;
        ArrayList arrayList2;
        int parseInt;
        String str3;
        n nVar2;
        String str4;
        n nVar3;
        HashMap hashMap;
        ArrayList arrayList3;
        boolean z4;
        int i5;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i6;
        String str5;
        String str6;
        String v4;
        String i7;
        int i8;
        int i9;
        Uri q4;
        ArrayList arrayList8;
        String[] W4;
        String sb;
        String str7 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            boolean s4 = jVar.s();
            Pattern pattern = f9186N;
            ArrayList arrayList17 = arrayList13;
            boolean z7 = z5;
            Pattern pattern2 = f9191S;
            boolean z8 = z6;
            if (!s4) {
                ArrayList arrayList18 = arrayList14;
                ArrayList arrayList19 = arrayList10;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = arrayList12;
                ArrayList arrayList22 = arrayList16;
                ArrayList arrayList23 = arrayList15;
                ArrayList arrayList24 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i10 = 0;
                HashMap hashMap4 = hashMap2;
                while (i10 < arrayList9.size()) {
                    n nVar4 = (n) arrayList9.get(i10);
                    Uri uri = nVar4.f9150a;
                    C0097o c0097o = nVar4.f9151b;
                    if (hashSet.add(uri)) {
                        AbstractC0124a.t(c0097o.f2867l == null);
                        ArrayList arrayList25 = (ArrayList) hashMap4.get(nVar4.f9150a);
                        arrayList25.getClass();
                        hashMap = hashMap4;
                        E e4 = new E(new u(null, null, arrayList25));
                        C0096n a3 = c0097o.a();
                        a3.f2829k = e4;
                        arrayList24.add(new n(nVar4.f9150a, new C0097o(a3), nVar4.f9152c, nVar4.f9153d, nVar4.f9154e, nVar4.f9155f));
                    } else {
                        hashMap = hashMap4;
                    }
                    i10++;
                    hashMap4 = hashMap;
                }
                int i11 = 0;
                List list = null;
                C0097o c0097o2 = null;
                while (i11 < arrayList18.size()) {
                    ArrayList arrayList26 = arrayList18;
                    String str8 = (String) arrayList26.get(i11);
                    String j4 = j(str8, f9192T, hashMap3);
                    String j5 = j(str8, pattern2, hashMap3);
                    C0096n c0096n = new C0096n();
                    int i12 = i11;
                    c0096n.f2819a = AbstractC1514c.b(j4, StringUtils.PROCESS_POSTFIX_DELIMITER, j5);
                    c0096n.f2820b = j5;
                    c0096n.f2830l = F.n("application/x-mpegURL");
                    boolean f4 = f(str8, f9196X);
                    ?? r43 = f4;
                    if (f(str8, f9197Y)) {
                        r43 = (f4 ? 1 : 0) | 2;
                    }
                    c0096n.f2823e = f(str8, f9195W) ? r43 | 4 : r43;
                    ArrayList arrayList27 = arrayList24;
                    String i13 = i(str8, f9193U, null, hashMap3);
                    if (TextUtils.isEmpty(i13)) {
                        arrayList18 = arrayList26;
                        i4 = 0;
                    } else {
                        String str9 = J.f3263a;
                        String[] split = i13.split(StringUtils.COMMA, -1);
                        i4 = J.m(split, "public.accessibility.describes-video") ? 512 : 0;
                        arrayList18 = arrayList26;
                        if (J.m(split, "public.accessibility.transcribes-spoken-dialog")) {
                            i4 |= 4096;
                        }
                        if (J.m(split, "public.accessibility.describes-music-and-sound")) {
                            i4 |= 1024;
                        }
                        if (J.m(split, "public.easy-to-read")) {
                            i4 |= 8192;
                        }
                    }
                    c0096n.f2824f = i4;
                    c0096n.f2822d = i(str8, f9190R, null, hashMap3);
                    String i14 = i(str8, pattern, null, hashMap3);
                    Uri q5 = i14 == null ? null : AbstractC0108a.q(str7, i14);
                    E e5 = new E(new u(j4, j5, Collections.EMPTY_LIST));
                    String j6 = j(str8, f9188P, hashMap3);
                    switch (j6.hashCode()) {
                        case -959297733:
                            if (j6.equals("SUBTITLES")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -333210994:
                            if (j6.equals("CLOSED-CAPTIONS")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 62628790:
                            if (j6.equals("AUDIO")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 81665115:
                            if (j6.equals("VIDEO")) {
                                c4 = 3;
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
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList9.size()) {
                                    nVar = (n) arrayList9.get(i15);
                                    if (!j4.equals(nVar.f9154e)) {
                                        i15++;
                                    }
                                } else {
                                    nVar = null;
                                }
                            }
                            if (nVar != null) {
                                String v5 = J.v(3, nVar.f9151b.f2866k);
                                c0096n.f2828j = v5;
                                str2 = F.d(v5);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            c0096n.f2831m = F.n(str2);
                            c0096n.f2829k = e5;
                            if (q5 == null) {
                                arrayList = arrayList21;
                                AbstractC0108a.s("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                m mVar = new m(q5, new C0097o(c0096n), j5);
                                arrayList = arrayList21;
                                arrayList.add(mVar);
                                break;
                            }
                        case 1:
                            arrayList2 = arrayList20;
                            String j7 = j(str8, f9194V, hashMap3);
                            if (j7.startsWith("CC")) {
                                parseInt = Integer.parseInt(j7.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(j7.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (list == null) {
                                list = new ArrayList();
                            }
                            c0096n.f2831m = F.n(str3);
                            c0096n.f2815J = parseInt;
                            list.add(new C0097o(c0096n));
                            arrayList20 = arrayList2;
                            arrayList = arrayList21;
                            break;
                        case 2:
                            int i16 = 0;
                            while (true) {
                                if (i16 < arrayList9.size()) {
                                    nVar2 = (n) arrayList9.get(i16);
                                    int i17 = i16;
                                    if (!j4.equals(nVar2.f9153d)) {
                                        i16 = i17 + 1;
                                    }
                                } else {
                                    nVar2 = null;
                                }
                            }
                            if (nVar2 != null) {
                                String v6 = J.v(1, nVar2.f9151b.f2866k);
                                c0096n.f2828j = v6;
                                str4 = F.d(v6);
                            } else {
                                str4 = null;
                            }
                            n nVar5 = nVar2;
                            String i18 = i(str8, f9213i, null, hashMap3);
                            if (i18 != null) {
                                String str10 = J.f3263a;
                                c0096n.f2810E = Integer.parseInt(i18.split("/", 2)[0]);
                                if ("audio/eac3".equals(str4) && i18.endsWith("/JOC")) {
                                    c0096n.f2828j = "ec+3";
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            c0096n.f2831m = F.n(str4);
                            if (q5 != null) {
                                c0096n.f2829k = e5;
                                arrayList20.add(new m(q5, new C0097o(c0096n), j5));
                            } else {
                                arrayList2 = arrayList20;
                                if (nVar5 != null) {
                                    arrayList20 = arrayList2;
                                    c0097o2 = new C0097o(c0096n);
                                }
                                arrayList20 = arrayList2;
                            }
                            arrayList = arrayList21;
                            break;
                        case 3:
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList9.size()) {
                                    nVar3 = (n) arrayList9.get(i19);
                                    if (!j4.equals(nVar3.f9152c)) {
                                        i19++;
                                    }
                                } else {
                                    nVar3 = null;
                                }
                            }
                            if (nVar3 != null) {
                                C0097o c0097o3 = nVar3.f9151b;
                                String v7 = J.v(2, c0097o3.f2866k);
                                c0096n.f2828j = v7;
                                c0096n.f2831m = F.n(F.d(v7));
                                c0096n.f2836t = c0097o3.f2874u;
                                c0096n.f2837u = c0097o3.v;
                                c0096n.f2839x = c0097o3.f2877y;
                            }
                            if (q5 != null) {
                                c0096n.f2829k = e5;
                                arrayList19.add(new m(q5, new C0097o(c0096n), j5));
                            }
                            arrayList = arrayList21;
                            break;
                        default:
                            arrayList = arrayList21;
                            break;
                    }
                    arrayList24 = arrayList27;
                    arrayList21 = arrayList;
                    i11 = i12 + 1;
                    str7 = str;
                }
                ArrayList arrayList28 = arrayList24;
                ArrayList arrayList29 = arrayList21;
                if (z7) {
                    list = Collections.EMPTY_LIST;
                }
                return new o(str, arrayList22, arrayList28, arrayList19, arrayList20, arrayList29, arrayList17, c0097o2, list, z8, hashMap3, arrayList23);
            }
            String u4 = jVar.u();
            if (u4.startsWith("#EXT")) {
                arrayList16.add(u4);
            }
            boolean startsWith = u4.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList30 = arrayList16;
            if (u4.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(j(u4, pattern2, hashMap3), j(u4, f9202c0, hashMap3));
            } else if (u4.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                arrayList7 = arrayList14;
                arrayList6 = arrayList10;
                arrayList5 = arrayList11;
                arrayList4 = arrayList12;
                arrayList3 = arrayList15;
                z5 = z7;
                z6 = true;
                arrayList13 = arrayList17;
                arrayList16 = arrayList30;
                arrayList15 = arrayList3;
                arrayList12 = arrayList4;
                arrayList11 = arrayList5;
                arrayList10 = arrayList6;
                arrayList14 = arrayList7;
            } else if (u4.startsWith("#EXT-X-MEDIA")) {
                arrayList14.add(u4);
            } else if (u4.startsWith("#EXT-X-SESSION-KEY")) {
                C0093k c5 = c(u4, hashMap3, i(u4, L, "identity", hashMap3));
                if (c5 != null) {
                    String j8 = j(u4, f9184K, hashMap3);
                    arrayList15.add(new C0094l(("SAMPLE-AES-CENC".equals(j8) || "SAMPLE-AES-CTR".equals(j8)) ? "cenc" : "cbcs", true, c5));
                }
            } else if (u4.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                boolean contains = z7 | u4.contains("CLOSED-CAPTIONS=NONE");
                int i20 = startsWith ? 16384 : 0;
                z7 = contains;
                arrayList3 = arrayList15;
                int parseInt2 = Integer.parseInt(j(u4, f9211h, Collections.EMPTY_MAP));
                Matcher matcher = f9201c.matcher(u4);
                if (matcher.find()) {
                    z4 = startsWith;
                    String group = matcher.group(1);
                    group.getClass();
                    i5 = Integer.parseInt(group);
                } else {
                    z4 = startsWith;
                    i5 = -1;
                }
                arrayList4 = arrayList12;
                String i21 = i(u4, f9215j, null, hashMap3);
                arrayList5 = arrayList11;
                String i22 = i(u4, f9217k, null, hashMap3);
                arrayList6 = arrayList10;
                String i23 = i(u4, f9219l, null, hashMap3);
                if (i23 != null) {
                    String str11 = J.f3263a;
                    String[] split2 = i23.split(StringUtils.COMMA, 2)[0].split("/", -1);
                    str5 = split2[0];
                    if (split2.length > 1) {
                        str6 = split2[1];
                        arrayList7 = arrayList14;
                        i6 = 2;
                        v4 = J.v(i6, i22);
                        if (F.j(v4, str5) && (str5 == null || (i21 != null && str6 != null && ((!i21.equals("PQ") || str6.equals("db1p")) && ((!i21.equals("SDR") || str6.equals("db2g")) && (!i21.equals("HLG") || str6.startsWith("db4"))))))) {
                            if (str5 == null) {
                                str5 = v4;
                            }
                            W4 = J.W(i22);
                            if (W4.length != 0) {
                                StringBuilder sb2 = new StringBuilder();
                                int length = W4.length;
                                int i24 = 0;
                                while (i24 < length) {
                                    String str12 = W4[i24];
                                    String[] strArr = W4;
                                    int i25 = length;
                                    if (2 != F.h(F.d(str12))) {
                                        if (sb2.length() > 0) {
                                            sb2.append(StringUtils.COMMA);
                                        }
                                        sb2.append(str12);
                                    }
                                    i24++;
                                    length = i25;
                                    W4 = strArr;
                                }
                                if (sb2.length() > 0) {
                                    sb = sb2.toString();
                                    i22 = sb != null ? AbstractC1514c.b(str5, StringUtils.COMMA, sb) : str5;
                                }
                            }
                            sb = null;
                            if (sb != null) {
                            }
                        }
                        i7 = i(u4, f9221m, null, hashMap3);
                        if (i7 != null) {
                            String[] split3 = i7.split("x", -1);
                            i9 = Integer.parseInt(split3[0]);
                            i8 = Integer.parseInt(split3[1]);
                            if (i9 > 0) {
                            }
                        }
                        i8 = -1;
                        i9 = -1;
                        String i26 = i(u4, n, null, hashMap3);
                        float parseFloat = i26 == null ? Float.parseFloat(i26) : -1.0f;
                        String i27 = i(u4, f9203d, null, hashMap3);
                        String i28 = i(u4, f9205e, null, hashMap3);
                        String i29 = i(u4, f9207f, null, hashMap3);
                        String i30 = i(u4, f9209g, null, hashMap3);
                        if (!z4) {
                            q4 = AbstractC0108a.q(str7, j(u4, pattern, hashMap3));
                        } else {
                            if (!jVar.s()) {
                                throw G.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            q4 = AbstractC0108a.q(str7, k(jVar.u(), hashMap3));
                        }
                        Uri uri2 = q4;
                        C0096n c0096n2 = new C0096n();
                        c0096n2.f2819a = Integer.toString(arrayList9.size());
                        c0096n2.f2830l = F.n("application/x-mpegURL");
                        c0096n2.f2828j = i22;
                        c0096n2.f2826h = i5;
                        c0096n2.f2827i = parseInt2;
                        c0096n2.f2836t = i9;
                        c0096n2.f2837u = i8;
                        c0096n2.f2839x = parseFloat;
                        c0096n2.f2824f = i20;
                        arrayList9.add(new n(uri2, new C0097o(c0096n2), i27, i28, i29, i30));
                        arrayList8 = (ArrayList) hashMap2.get(uri2);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            hashMap2.put(uri2, arrayList8);
                        }
                        arrayList8.add(new g0.t(i5, parseInt2, i27, i28, i29, i30));
                        z5 = z7;
                        z6 = z8;
                        arrayList13 = arrayList17;
                        arrayList16 = arrayList30;
                        arrayList15 = arrayList3;
                        arrayList12 = arrayList4;
                        arrayList11 = arrayList5;
                        arrayList10 = arrayList6;
                        arrayList14 = arrayList7;
                    } else {
                        arrayList7 = arrayList14;
                        i6 = 2;
                    }
                } else {
                    arrayList7 = arrayList14;
                    i6 = 2;
                    str5 = null;
                }
                str6 = null;
                v4 = J.v(i6, i22);
                if (F.j(v4, str5)) {
                    if (str5 == null) {
                    }
                    W4 = J.W(i22);
                    if (W4.length != 0) {
                    }
                    sb = null;
                    if (sb != null) {
                    }
                }
                i7 = i(u4, f9221m, null, hashMap3);
                if (i7 != null) {
                }
                i8 = -1;
                i9 = -1;
                String i262 = i(u4, n, null, hashMap3);
                if (i262 == null) {
                }
                String i272 = i(u4, f9203d, null, hashMap3);
                String i282 = i(u4, f9205e, null, hashMap3);
                String i292 = i(u4, f9207f, null, hashMap3);
                String i302 = i(u4, f9209g, null, hashMap3);
                if (!z4) {
                }
                Uri uri22 = q4;
                C0096n c0096n22 = new C0096n();
                c0096n22.f2819a = Integer.toString(arrayList9.size());
                c0096n22.f2830l = F.n("application/x-mpegURL");
                c0096n22.f2828j = i22;
                c0096n22.f2826h = i5;
                c0096n22.f2827i = parseInt2;
                c0096n22.f2836t = i9;
                c0096n22.f2837u = i8;
                c0096n22.f2839x = parseFloat;
                c0096n22.f2824f = i20;
                arrayList9.add(new n(uri22, new C0097o(c0096n22), i272, i282, i292, i302));
                arrayList8 = (ArrayList) hashMap2.get(uri22);
                if (arrayList8 == null) {
                }
                arrayList8.add(new g0.t(i5, parseInt2, i272, i282, i292, i302));
                z5 = z7;
                z6 = z8;
                arrayList13 = arrayList17;
                arrayList16 = arrayList30;
                arrayList15 = arrayList3;
                arrayList12 = arrayList4;
                arrayList11 = arrayList5;
                arrayList10 = arrayList6;
                arrayList14 = arrayList7;
            }
            arrayList7 = arrayList14;
            arrayList6 = arrayList10;
            arrayList5 = arrayList11;
            arrayList4 = arrayList12;
            arrayList3 = arrayList15;
            z5 = z7;
            z6 = z8;
            arrayList13 = arrayList17;
            arrayList16 = arrayList30;
            arrayList15 = arrayList3;
            arrayList12 = arrayList4;
            arrayList11 = arrayList5;
            arrayList10 = arrayList6;
            arrayList14 = arrayList7;
        }
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d4) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d4;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : k(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i4 = i(str, pattern, null, map);
        if (i4 != null) {
            return i4;
        }
        throw G.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String k(String str, Map map) {
        Matcher matcher = f9177E0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0096, LOOP:0: B:13:0x0069->B:38:0x0069, LOOP_START, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:62:0x00ff, B:63:0x0105, B:67:0x0030, B:69:0x0036, B:74:0x003f, B:76:0x0048, B:81:0x0051, B:83:0x0057, B:85:0x005d, B:87:0x0062), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #0 {all -> 0x0096, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0098, B:22:0x00a0, B:24:0x00a8, B:26:0x00b0, B:28:0x00b8, B:30:0x00c0, B:32:0x00c8, B:34:0x00d0, B:36:0x00d9, B:41:0x00dd, B:62:0x00ff, B:63:0x0105, B:67:0x0030, B:69:0x0036, B:74:0x003f, B:76:0x0048, B:81:0x0051, B:83:0x0057, B:85:0x005d, B:87:0x0062), top: B:2:0x000f }] */
    @Override // u0.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(Uri uri, Y.j jVar) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            boolean z4 = false;
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                if (z4) {
                    throw G.b("Input does not start with the #EXTM3U header.", null);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        J.h(bufferedReader);
                        throw G.b("Failed to parse the playlist, could not identify any tags.", null);
                    }
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                            if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                break;
                            }
                            arrayDeque.add(trim);
                        } else {
                            arrayDeque.add(trim);
                            return e(new B1.j(arrayDeque, bufferedReader), uri.toString());
                        }
                    }
                }
                arrayDeque.add(trim);
                return d(this.f9238a, this.f9239b, new B1.j(arrayDeque, bufferedReader), uri.toString());
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i4 = 0;
            while (true) {
                if (i4 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !J.J(read)) {
                        read = bufferedReader.read();
                    }
                    z4 = J.J(read);
                } else {
                    if (read != "#EXTM3U".charAt(i4)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i4++;
                }
            }
            if (z4) {
            }
        } finally {
            J.h(bufferedReader);
        }
    }
}
