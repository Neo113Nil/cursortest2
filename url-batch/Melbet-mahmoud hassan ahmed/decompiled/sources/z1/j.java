package z1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m4.t;
import n2.j0;
import o2.k0;
import o2.m0;
import o2.r;
import o2.v;
import r0.n2;
import r0.s1;
import v0.m;
import y1.q;
import z1.g;
import z1.h;

/* loaded from: classes.dex */
public final class j implements j0.a<i> {

    /* renamed from: a, reason: collision with root package name */
    private final h f23629a;

    /* renamed from: b, reason: collision with root package name */
    private final g f23630b;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f23605c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f23606d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f23607e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f23608f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f23609g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f23610h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f23611i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f23612j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f23613k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f23614l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f23615m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f23616n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f23617o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f23618p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q, reason: collision with root package name */
    private static final Pattern f23619q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f23620r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f23621s = c("CAN-SKIP-DATERANGES");

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f23622t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f23623u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f23624v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w, reason: collision with root package name */
    private static final Pattern f23625w = c("CAN-BLOCK-RELOAD");

    /* renamed from: x, reason: collision with root package name */
    private static final Pattern f23626x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y, reason: collision with root package name */
    private static final Pattern f23627y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    private static final Pattern f23628z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern T = c("AUTOSELECT");
    private static final Pattern U = c("DEFAULT");
    private static final Pattern V = c("FORCED");
    private static final Pattern W = c("INDEPENDENT");
    private static final Pattern X = c("GAP");
    private static final Pattern Y = c("PRECISE");
    private static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    private static final Pattern f23603a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    private static final Pattern f23604b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class a extends IOException {
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final BufferedReader f23631a;

        /* renamed from: b, reason: collision with root package name */
        private final Queue<String> f23632b;

        /* renamed from: c, reason: collision with root package name */
        private String f23633c;

        public b(Queue<String> queue, BufferedReader bufferedReader) {
            this.f23632b = queue;
            this.f23631a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.f23633c != null) {
                return true;
            }
            if (!this.f23632b.isEmpty()) {
                this.f23633c = (String) o2.a.e(this.f23632b.poll());
                return true;
            }
            do {
                String readLine = this.f23631a.readLine();
                this.f23633c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f23633c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f23633c;
            this.f23633c = null;
            return str;
        }
    }

    public j() {
        this(h.f23579n, null);
    }

    public j(h hVar, g gVar) {
        this.f23629a = hVar;
        this.f23630b = gVar;
    }

    private static long A(String str, Pattern pattern) {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String B(String str, Map<String, String> map) {
        Matcher matcher = f23604b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int C(BufferedReader bufferedReader, boolean z6, int i7) {
        while (i7 != -1 && Character.isWhitespace(i7) && (z6 || !m0.u0(i7))) {
            i7 = bufferedReader.read();
        }
        return i7;
    }

    private static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C2 = C(bufferedReader, true, read);
        for (int i7 = 0; i7 < 7; i7++) {
            if (C2 != "#EXTM3U".charAt(i7)) {
                return false;
            }
            C2 = bufferedReader.read();
        }
        return m0.u0(C(bufferedReader, false, C2));
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static m d(String str, m.b[] bVarArr) {
        m.b[] bVarArr2 = new m.b[bVarArr.length];
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            bVarArr2[i7] = bVarArr[i7].c(null);
        }
        return new m(str, bVarArr2);
    }

    private static String e(long j7, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j7);
    }

    private static h.b f(ArrayList<h.b> arrayList, String str) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            h.b bVar = arrayList.get(i7);
            if (str.equals(bVar.f23597d)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b g(ArrayList<h.b> arrayList, String str) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            h.b bVar = arrayList.get(i7);
            if (str.equals(bVar.f23598e)) {
                return bVar;
            }
        }
        return null;
    }

    private static h.b h(ArrayList<h.b> arrayList, String str) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            h.b bVar = arrayList.get(i7);
            if (str.equals(bVar.f23596c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    private static m.b k(String str, String str2, Map<String, String> map) {
        String u6 = u(str, J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z6 = z(str, K, map);
            return new m.b(r0.j.f20686d, "video/mp4", Base64.decode(z6.substring(z6.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new m.b(r0.j.f20686d, "hls", m0.m0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(u6)) {
            return null;
        }
        String z7 = z(str, K, map);
        byte[] decode = Base64.decode(z7.substring(z7.indexOf(44)), 0);
        UUID uuid = r0.j.f20687e;
        return new m.b(uuid, "video/mp4", e1.l.a(uuid, decode));
    }

    private static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    private static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x01dc, code lost:
    
        if (r12 != null) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static g o(h hVar, g gVar, b bVar, String str) {
        ArrayList arrayList;
        String z6;
        int i7;
        ArrayList arrayList2;
        String str2;
        String str3;
        long j7;
        g.b bVar2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j8;
        long j9;
        m mVar;
        long j10;
        String str4;
        h hVar2 = hVar;
        g gVar2 = gVar;
        boolean z7 = hVar2.f23602c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        g.f fVar = new g.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z8 = false;
        boolean z9 = z7;
        g.f fVar2 = fVar;
        String str6 = "";
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        int i8 = 0;
        long j19 = -9223372036854775807L;
        boolean z10 = false;
        boolean z11 = false;
        int i9 = 0;
        int i10 = 1;
        long j20 = -9223372036854775807L;
        long j21 = -9223372036854775807L;
        boolean z12 = false;
        m mVar2 = null;
        m mVar3 = null;
        boolean z13 = false;
        String str7 = null;
        long j22 = -1;
        String str8 = null;
        String str9 = null;
        int i11 = 0;
        boolean z14 = false;
        g.d dVar = null;
        ArrayList arrayList10 = arrayList7;
        g.b bVar3 = null;
        while (bVar.a()) {
            String b7 = bVar.b();
            if (b7.startsWith("#EXT")) {
                arrayList9.add(b7);
            }
            if (b7.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z15 = z(b7, f23619q, hashMap);
                if ("VOD".equals(z15)) {
                    i8 = 1;
                } else if ("EVENT".equals(z15)) {
                    i8 = 2;
                }
            } else if (b7.equals("#EXT-X-I-FRAMES-ONLY")) {
                z14 = true;
            } else {
                if (b7.startsWith("#EXT-X-START")) {
                    arrayList = arrayList6;
                    long j23 = (long) (j(b7, C) * 1000000.0d);
                    z10 = q(b7, Y, z8);
                    j19 = j23;
                } else {
                    arrayList = arrayList6;
                    if (b7.startsWith("#EXT-X-SERVER-CONTROL")) {
                        fVar2 = y(b7);
                    } else if (b7.startsWith("#EXT-X-PART-INF")) {
                        j21 = (long) (j(b7, f23617o) * 1000000.0d);
                    } else if (b7.startsWith("#EXT-X-MAP")) {
                        String z16 = z(b7, K, hashMap);
                        String v6 = v(b7, E, hashMap);
                        if (v6 != null) {
                            String[] Q0 = m0.Q0(v6, "@");
                            j22 = Long.parseLong(Q0[z8 ? 1 : 0]);
                            if (Q0.length > 1) {
                                j13 = Long.parseLong(Q0[1]);
                            }
                        }
                        if (j22 == -1) {
                            j13 = 0;
                        }
                        String str10 = str7;
                        String str11 = str8;
                        if (str10 != null && str11 == null) {
                            throw n2.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        dVar = new g.d(z16, j13, j22, str10, str11);
                        if (j22 != -1) {
                            j13 += j22;
                        }
                        str8 = str11;
                        str7 = str10;
                        arrayList6 = arrayList;
                        j22 = -1;
                    } else {
                        String str12 = str7;
                        String str13 = str8;
                        if (b7.startsWith("#EXT-X-TARGETDURATION")) {
                            j20 = 1000000 * m(b7, f23615m);
                        } else if (b7.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j16 = n(b7, f23626x);
                            str8 = str13;
                            str7 = str12;
                            j12 = j16;
                            arrayList6 = arrayList;
                            z8 = false;
                        } else if (b7.startsWith("#EXT-X-VERSION")) {
                            i10 = m(b7, f23618p);
                        } else {
                            if (b7.startsWith("#EXT-X-DEFINE")) {
                                String v7 = v(b7, f23603a0, hashMap);
                                if (v7 != null) {
                                    z6 = hVar2.f23588l.get(v7);
                                } else {
                                    v7 = z(b7, P, hashMap);
                                    z6 = z(b7, Z, hashMap);
                                }
                                hashMap.put(v7, z6);
                                i7 = i8;
                                arrayList2 = arrayList8;
                                str2 = str5;
                                str3 = str9;
                                j7 = j16;
                                bVar2 = bVar3;
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList;
                            } else if (b7.startsWith("#EXTINF")) {
                                j17 = A(b7, f23627y);
                                str6 = u(b7, f23628z, str5, hashMap);
                            } else if (b7.startsWith("#EXT-X-SKIP")) {
                                int m7 = m(b7, f23622t);
                                o2.a.f(gVar2 != null && arrayList.isEmpty());
                                int i12 = (int) (j12 - ((g) m0.j(gVar)).f23544k);
                                int i13 = m7 + i12;
                                if (i12 < 0 || i13 > gVar2.f23551r.size()) {
                                    throw new a();
                                }
                                String str14 = str5;
                                str8 = str13;
                                long j24 = j15;
                                while (i12 < i13) {
                                    g.d dVar2 = gVar2.f23551r.get(i12);
                                    int i14 = i13;
                                    String str15 = str14;
                                    if (j12 != gVar2.f23544k) {
                                        dVar2 = dVar2.d(j24, (gVar2.f23543j - i9) + dVar2.f23566i);
                                    }
                                    ArrayList arrayList11 = arrayList;
                                    arrayList11.add(dVar2);
                                    long j25 = j24 + dVar2.f23565h;
                                    long j26 = dVar2.f23572o;
                                    if (j26 != -1) {
                                        j13 = dVar2.f23571n + j26;
                                    }
                                    int i15 = dVar2.f23566i;
                                    g.d dVar3 = dVar2.f23564g;
                                    m mVar4 = dVar2.f23568k;
                                    String str16 = dVar2.f23569l;
                                    String str17 = dVar2.f23570m;
                                    if (str17 == null || !str17.equals(Long.toHexString(j16))) {
                                        str8 = dVar2.f23570m;
                                    }
                                    j16++;
                                    i12++;
                                    dVar = dVar3;
                                    str12 = str16;
                                    arrayList = arrayList11;
                                    i11 = i15;
                                    i13 = i14;
                                    j14 = j25;
                                    str14 = str15;
                                    gVar2 = gVar;
                                    mVar3 = mVar4;
                                    j24 = j14;
                                }
                                hVar2 = hVar;
                                gVar2 = gVar;
                                j15 = j24;
                                str5 = str14;
                                str7 = str12;
                                arrayList6 = arrayList;
                                z8 = false;
                            } else {
                                str2 = str5;
                                if (b7.startsWith("#EXT-X-KEY")) {
                                    String z17 = z(b7, H, hashMap);
                                    String u6 = u(b7, I, "identity", hashMap);
                                    if ("NONE".equals(z17)) {
                                        treeMap.clear();
                                        str4 = null;
                                        mVar3 = null;
                                        str8 = null;
                                    } else {
                                        String v8 = v(b7, L, hashMap);
                                        if ("identity".equals(u6)) {
                                            if ("AES-128".equals(z17)) {
                                                str4 = z(b7, K, hashMap);
                                                str8 = v8;
                                            }
                                            str8 = v8;
                                            str4 = null;
                                        } else {
                                            String str18 = str9;
                                            str9 = str18 == null ? l(z17) : str18;
                                            m.b k7 = k(b7, u6, hashMap);
                                            if (k7 != null) {
                                                treeMap.put(u6, k7);
                                                str8 = v8;
                                                str4 = null;
                                                mVar3 = null;
                                            }
                                            str8 = v8;
                                            str4 = null;
                                        }
                                    }
                                    gVar2 = gVar;
                                    str7 = str4;
                                    arrayList6 = arrayList;
                                    str5 = str2;
                                    z8 = false;
                                    hVar2 = hVar;
                                } else {
                                    str3 = str9;
                                    if (b7.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] Q02 = m0.Q0(z(b7, D, hashMap), "@");
                                        j22 = Long.parseLong(Q02[0]);
                                        if (Q02.length > 1) {
                                            j13 = Long.parseLong(Q02[1]);
                                        }
                                    } else {
                                        if (b7.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i9 = Integer.parseInt(b7.substring(b7.indexOf(58) + 1));
                                            hVar2 = hVar;
                                            gVar2 = gVar;
                                            str9 = str3;
                                            str8 = str13;
                                            str7 = str12;
                                            str5 = str2;
                                            z11 = true;
                                        } else if (b7.equals("#EXT-X-DISCONTINUITY")) {
                                            i11++;
                                        } else {
                                            if (b7.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (j11 == 0) {
                                                    j11 = m0.B0(m0.I0(b7.substring(b7.indexOf(58) + 1))) - j15;
                                                } else {
                                                    i7 = i8;
                                                    arrayList2 = arrayList8;
                                                    arrayList3 = arrayList9;
                                                    arrayList4 = arrayList;
                                                    j7 = j16;
                                                }
                                            } else if (b7.equals("#EXT-X-GAP")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str9 = str3;
                                                str8 = str13;
                                                str7 = str12;
                                                str5 = str2;
                                                z13 = true;
                                            } else if (b7.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str9 = str3;
                                                str8 = str13;
                                                str7 = str12;
                                                str5 = str2;
                                                z9 = true;
                                            } else if (b7.equals("#EXT-X-ENDLIST")) {
                                                hVar2 = hVar;
                                                gVar2 = gVar;
                                                str9 = str3;
                                                str8 = str13;
                                                str7 = str12;
                                                str5 = str2;
                                                z12 = true;
                                            } else {
                                                if (b7.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    i7 = i8;
                                                    arrayList5 = arrayList;
                                                    arrayList8.add(new g.c(Uri.parse(k0.d(str, z(b7, K, hashMap))), t(b7, A, -1L), s(b7, B, -1)));
                                                } else {
                                                    i7 = i8;
                                                    arrayList5 = arrayList;
                                                    if (!b7.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                        j7 = j16;
                                                        if (b7.startsWith("#EXT-X-PART")) {
                                                            String e7 = e(j7, str12, str13);
                                                            String z18 = z(b7, K, hashMap);
                                                            g.b bVar4 = bVar3;
                                                            ArrayList arrayList12 = arrayList8;
                                                            long j27 = (long) (j(b7, f23616n) * 1000000.0d);
                                                            ArrayList arrayList13 = arrayList9;
                                                            boolean q7 = q(b7, W, false) | (z9 && arrayList10.isEmpty());
                                                            boolean q8 = q(b7, X, false);
                                                            String v9 = v(b7, E, hashMap);
                                                            if (v9 != null) {
                                                                String[] Q03 = m0.Q0(v9, "@");
                                                                j10 = Long.parseLong(Q03[0]);
                                                                if (Q03.length > 1) {
                                                                    j18 = Long.parseLong(Q03[1]);
                                                                }
                                                            } else {
                                                                j10 = -1;
                                                            }
                                                            if (j10 == -1) {
                                                                j18 = 0;
                                                            }
                                                            if (mVar3 == null && !treeMap.isEmpty()) {
                                                                m.b[] bVarArr = (m.b[]) treeMap.values().toArray(new m.b[0]);
                                                                m mVar5 = new m(str3, bVarArr);
                                                                if (mVar2 == null) {
                                                                    mVar2 = d(str3, bVarArr);
                                                                }
                                                                mVar3 = mVar5;
                                                            }
                                                            arrayList10.add(new g.b(z18, dVar, j27, i11, j14, mVar3, str12, e7, j18, j10, q8, q7, false));
                                                            j14 += j27;
                                                            if (j10 != -1) {
                                                                j18 += j10;
                                                            }
                                                            arrayList8 = arrayList12;
                                                            str7 = str12;
                                                            i8 = i7;
                                                            arrayList9 = arrayList13;
                                                            bVar3 = bVar4;
                                                            arrayList6 = arrayList5;
                                                            z8 = false;
                                                            j16 = j7;
                                                            str9 = str3;
                                                            str8 = str13;
                                                            str5 = str2;
                                                            hVar2 = hVar;
                                                            gVar2 = gVar;
                                                        } else {
                                                            bVar2 = bVar3;
                                                            arrayList2 = arrayList8;
                                                            arrayList3 = arrayList9;
                                                            if (b7.startsWith("#")) {
                                                                arrayList4 = arrayList5;
                                                            } else {
                                                                String e8 = e(j7, str12, str13);
                                                                long j28 = j7 + 1;
                                                                String B2 = B(b7, hashMap);
                                                                g.d dVar4 = (g.d) hashMap2.get(B2);
                                                                if (j22 == -1) {
                                                                    j9 = 0;
                                                                } else {
                                                                    if (z14 && dVar == null && dVar4 == null) {
                                                                        dVar4 = new g.d(B2, 0L, j13, null, null);
                                                                        hashMap2.put(B2, dVar4);
                                                                    }
                                                                    j9 = j13;
                                                                }
                                                                if (mVar3 != null || treeMap.isEmpty()) {
                                                                    mVar = mVar3;
                                                                } else {
                                                                    m.b[] bVarArr2 = (m.b[]) treeMap.values().toArray(new m.b[0]);
                                                                    mVar = new m(str3, bVarArr2);
                                                                    if (mVar2 == null) {
                                                                        mVar2 = d(str3, bVarArr2);
                                                                    }
                                                                }
                                                                arrayList5.add(new g.d(B2, dVar != null ? dVar : dVar4, str6, j17, i11, j15, mVar, str12, e8, j9, j22, z13, arrayList10));
                                                                j14 = j15 + j17;
                                                                arrayList10 = new ArrayList();
                                                                if (j22 != -1) {
                                                                    j9 += j22;
                                                                }
                                                                j13 = j9;
                                                                arrayList8 = arrayList2;
                                                                mVar3 = mVar;
                                                                str7 = str12;
                                                                j17 = 0;
                                                                j15 = j14;
                                                                i8 = i7;
                                                                bVar3 = bVar2;
                                                                str6 = str2;
                                                                z8 = false;
                                                                z13 = false;
                                                                j22 = -1;
                                                                j16 = j28;
                                                                arrayList6 = arrayList5;
                                                                str8 = str13;
                                                                arrayList9 = arrayList3;
                                                                hVar2 = hVar;
                                                                gVar2 = gVar;
                                                                str9 = str3;
                                                                str5 = str6;
                                                            }
                                                        }
                                                    } else if (bVar3 == null && "PART".equals(z(b7, N, hashMap))) {
                                                        String z19 = z(b7, K, hashMap);
                                                        long t6 = t(b7, F, -1L);
                                                        long t7 = t(b7, G, -1L);
                                                        long j29 = j16;
                                                        String e9 = e(j29, str12, str13);
                                                        if (mVar3 != null || treeMap.isEmpty()) {
                                                            j8 = j29;
                                                        } else {
                                                            j8 = j29;
                                                            m.b[] bVarArr3 = (m.b[]) treeMap.values().toArray(new m.b[0]);
                                                            m mVar6 = new m(str3, bVarArr3);
                                                            if (mVar2 == null) {
                                                                mVar2 = d(str3, bVarArr3);
                                                            }
                                                            mVar3 = mVar6;
                                                        }
                                                        if (t6 == -1 || t7 != -1) {
                                                            bVar3 = new g.b(z19, dVar, 0L, i11, j14, mVar3, str12, e9, t6 != -1 ? t6 : 0L, t7, false, false, true);
                                                        }
                                                        hVar2 = hVar;
                                                        gVar2 = gVar;
                                                        str9 = str3;
                                                        str7 = str12;
                                                        j16 = j8;
                                                        i8 = i7;
                                                        arrayList6 = arrayList5;
                                                        str5 = str2;
                                                        z8 = false;
                                                        str8 = str13;
                                                    }
                                                }
                                                arrayList2 = arrayList8;
                                                arrayList3 = arrayList9;
                                                j7 = j16;
                                                arrayList4 = arrayList5;
                                            }
                                            bVar2 = bVar3;
                                        }
                                        arrayList6 = arrayList;
                                        z8 = false;
                                    }
                                    hVar2 = hVar;
                                    gVar2 = gVar;
                                    str9 = str3;
                                    str8 = str13;
                                    str7 = str12;
                                    str5 = str2;
                                    arrayList6 = arrayList;
                                    z8 = false;
                                }
                            }
                            arrayList8 = arrayList2;
                            str7 = str12;
                            i8 = i7;
                            bVar3 = bVar2;
                            z8 = false;
                            j16 = j7;
                            arrayList6 = arrayList4;
                            str8 = str13;
                            arrayList9 = arrayList3;
                            hVar2 = hVar;
                            gVar2 = gVar;
                            str9 = str3;
                            str5 = str2;
                        }
                        str8 = str13;
                        str7 = str12;
                        arrayList6 = arrayList;
                        z8 = false;
                    }
                }
                arrayList6 = arrayList;
            }
        }
        int i16 = i8;
        g.b bVar5 = bVar3;
        ArrayList arrayList14 = arrayList8;
        ArrayList arrayList15 = arrayList9;
        ArrayList arrayList16 = arrayList6;
        HashMap hashMap3 = new HashMap();
        for (int i17 = 0; i17 < arrayList14.size(); i17++) {
            g.c cVar = (g.c) arrayList14.get(i17);
            long j30 = cVar.f23559b;
            if (j30 == -1) {
                j30 = (j12 + arrayList16.size()) - (arrayList10.isEmpty() ? 1L : 0L);
            }
            int i18 = cVar.f23560c;
            if (i18 == -1 && j21 != -9223372036854775807L) {
                i18 = (arrayList10.isEmpty() ? ((g.d) t.c(arrayList16)).f23562r : arrayList10).size() - 1;
            }
            Uri uri = cVar.f23558a;
            hashMap3.put(uri, new g.c(uri, j30, i18));
        }
        if (bVar5 != null) {
            arrayList10.add(bVar5);
        }
        return new g(i16, str, arrayList15, j19, z10, j11, z11, i9, j12, i10, j20, j21, z9, z12, j11 != 0, mVar2, arrayList16, arrayList10, fVar2, hashMap3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    private static h p(b bVar, String str) {
        char c7;
        s1 s1Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        String str4;
        boolean z6;
        int i7;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i8;
        int i9;
        ArrayList arrayList8;
        ArrayList arrayList9;
        float f7;
        ArrayList arrayList10;
        String B2;
        HashMap hashMap;
        int i10;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z7 = false;
        boolean z8 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (!bVar.a()) {
                HashMap hashMap4 = hashMap2;
                ArrayList arrayList19 = arrayList16;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = arrayList13;
                ArrayList arrayList22 = arrayList14;
                ArrayList arrayList23 = arrayList15;
                ArrayList arrayList24 = arrayList18;
                boolean z9 = z7;
                ArrayList arrayList25 = arrayList17;
                ArrayList arrayList26 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < arrayList11.size(); i11++) {
                    h.b bVar2 = (h.b) arrayList11.get(i11);
                    if (hashSet.add(bVar2.f23594a)) {
                        o2.a.f(bVar2.f23595b.f20954o == null);
                        arrayList26.add(bVar2.a(bVar2.f23595b.b().X(new j1.a(new q(null, null, (List) o2.a.e((ArrayList) hashMap4.get(bVar2.f23594a))))).E()));
                    }
                }
                Uri uri = null;
                ArrayList arrayList27 = null;
                s1 s1Var2 = null;
                int i12 = 0;
                while (i12 < arrayList19.size()) {
                    ArrayList arrayList28 = arrayList19;
                    String str7 = (String) arrayList28.get(i12);
                    String z10 = z(str7, Q, hashMap3);
                    String z11 = z(str7, P, hashMap3);
                    s1.b V2 = new s1.b().S(z10 + ":" + z11).U(z11).K(str6).g0(x(str7)).c0(w(str7, hashMap3)).V(v(str7, O, hashMap3));
                    String v6 = v(str7, K, hashMap3);
                    Uri e7 = v6 == null ? uri : k0.e(str, v6);
                    arrayList19 = arrayList28;
                    String str8 = str6;
                    j1.a aVar = new j1.a(new q(z10, z11, Collections.emptyList()));
                    String z12 = z(str7, M, hashMap3);
                    z12.hashCode();
                    switch (z12.hashCode()) {
                        case -959297733:
                            if (z12.equals("SUBTITLES")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -333210994:
                            if (z12.equals("CLOSED-CAPTIONS")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 62628790:
                            if (z12.equals("AUDIO")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 81665115:
                            if (z12.equals("VIDEO")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    switch (c7) {
                        case 0:
                            s1Var = s1Var2;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            h.b g7 = g(arrayList11, z10);
                            if (g7 != null) {
                                String L2 = m0.L(g7.f23595b.f20953n, 3);
                                V2.I(L2);
                                str2 = v.g(L2);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            V2.e0(str2).X(aVar);
                            if (e7 != null) {
                                h.a aVar2 = new h.a(e7, V2.E(), z10, z11);
                                arrayList3 = arrayList22;
                                arrayList3.add(aVar2);
                                break;
                            } else {
                                arrayList3 = arrayList22;
                                r.i("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                        case 1:
                            s1Var = s1Var2;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            String z13 = z(str7, S, hashMap3);
                            if (z13.startsWith("CC")) {
                                parseInt = Integer.parseInt(z13.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(z13.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList27 == null) {
                                arrayList27 = new ArrayList();
                            }
                            V2.e0(str3).F(parseInt);
                            arrayList27.add(V2.E());
                            arrayList3 = arrayList22;
                            break;
                        case 2:
                            arrayList2 = arrayList20;
                            h.b f8 = f(arrayList11, z10);
                            if (f8 != null) {
                                s1Var = s1Var2;
                                String L3 = m0.L(f8.f23595b.f20953n, 1);
                                V2.I(L3);
                                str4 = v.g(L3);
                            } else {
                                s1Var = s1Var2;
                                str4 = null;
                            }
                            String v7 = v(str7, f23611i, hashMap3);
                            if (v7 != null) {
                                V2.H(Integer.parseInt(m0.R0(v7, "/")[0]));
                                if ("audio/eac3".equals(str4) && v7.endsWith("/JOC")) {
                                    V2.I("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            V2.e0(str4);
                            if (e7 != null) {
                                V2.X(aVar);
                                arrayList = arrayList21;
                                arrayList.add(new h.a(e7, V2.E(), z10, z11));
                            } else {
                                arrayList = arrayList21;
                                if (f8 != null) {
                                    s1Var = V2.E();
                                }
                            }
                            arrayList3 = arrayList22;
                            break;
                        case 3:
                            h.b h7 = h(arrayList11, z10);
                            if (h7 != null) {
                                s1 s1Var3 = h7.f23595b;
                                String L4 = m0.L(s1Var3.f20953n, 2);
                                V2.I(L4).e0(v.g(L4)).j0(s1Var3.f20961v).Q(s1Var3.f20962w).P(s1Var3.f20963x);
                            }
                            if (e7 != null) {
                                V2.X(aVar);
                                arrayList2 = arrayList20;
                                arrayList2.add(new h.a(e7, V2.E(), z10, z11));
                                s1Var = s1Var2;
                                arrayList3 = arrayList22;
                                arrayList = arrayList21;
                                break;
                            }
                        default:
                            s1Var = s1Var2;
                            arrayList3 = arrayList22;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            break;
                    }
                    i12++;
                    arrayList22 = arrayList3;
                    arrayList21 = arrayList;
                    arrayList20 = arrayList2;
                    str6 = str8;
                    s1Var2 = s1Var;
                    uri = null;
                }
                return new h(str, arrayList24, arrayList26, arrayList20, arrayList21, arrayList22, arrayList23, s1Var2, z8 ? Collections.emptyList() : arrayList27, z9, hashMap3, arrayList25);
            }
            String b7 = bVar.b();
            if (b7.startsWith("#EXT")) {
                arrayList18.add(b7);
            }
            boolean startsWith = b7.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            boolean z14 = z7;
            if (b7.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(z(b7, P, hashMap3), z(b7, Z, hashMap3));
            } else {
                if (b7.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    hashMap = hashMap2;
                    arrayList10 = arrayList16;
                    arrayList9 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList7 = arrayList14;
                    arrayList5 = arrayList15;
                    arrayList6 = arrayList18;
                    arrayList4 = arrayList17;
                    z7 = true;
                } else if (b7.startsWith("#EXT-X-MEDIA")) {
                    arrayList16.add(b7);
                } else if (b7.startsWith("#EXT-X-SESSION-KEY")) {
                    m.b k7 = k(b7, u(b7, I, "identity", hashMap3), hashMap3);
                    if (k7 != null) {
                        arrayList17.add(new m(l(z(b7, H, hashMap3)), k7));
                    }
                } else if (b7.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = z8 | b7.contains("CLOSED-CAPTIONS=NONE");
                    if (startsWith) {
                        i7 = 16384;
                        z6 = contains;
                    } else {
                        z6 = contains;
                        i7 = 0;
                    }
                    int m7 = m(b7, f23610h);
                    arrayList4 = arrayList17;
                    arrayList5 = arrayList15;
                    int s7 = s(b7, f23605c, -1);
                    String v8 = v(b7, f23612j, hashMap3);
                    arrayList6 = arrayList18;
                    String v9 = v(b7, f23613k, hashMap3);
                    arrayList7 = arrayList14;
                    if (v9 != null) {
                        String[] Q0 = m0.Q0(v9, "x");
                        int parseInt2 = Integer.parseInt(Q0[0]);
                        int parseInt3 = Integer.parseInt(Q0[1]);
                        if (parseInt2 <= 0 || parseInt3 <= 0) {
                            parseInt3 = -1;
                            i10 = -1;
                        } else {
                            i10 = parseInt2;
                        }
                        i9 = parseInt3;
                        i8 = i10;
                    } else {
                        i8 = -1;
                        i9 = -1;
                    }
                    arrayList8 = arrayList13;
                    String v10 = v(b7, f23614l, hashMap3);
                    if (v10 != null) {
                        arrayList9 = arrayList12;
                        f7 = Float.parseFloat(v10);
                    } else {
                        arrayList9 = arrayList12;
                        f7 = -1.0f;
                    }
                    String v11 = v(b7, f23606d, hashMap3);
                    arrayList10 = arrayList16;
                    String v12 = v(b7, f23607e, hashMap3);
                    HashMap hashMap5 = hashMap2;
                    String v13 = v(b7, f23608f, hashMap3);
                    String v14 = v(b7, f23609g, hashMap3);
                    if (startsWith) {
                        B2 = z(b7, K, hashMap3);
                    } else {
                        if (!bVar.a()) {
                            throw n2.c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        B2 = B(bVar.b(), hashMap3);
                    }
                    Uri e8 = k0.e(str5, B2);
                    arrayList11.add(new h.b(e8, new s1.b().R(arrayList11.size()).K("application/x-mpegURL").I(v8).G(s7).Z(m7).j0(i8).Q(i9).P(f7).c0(i7).E(), v11, v12, v13, v14));
                    hashMap = hashMap5;
                    ArrayList arrayList29 = (ArrayList) hashMap.get(e8);
                    if (arrayList29 == null) {
                        arrayList29 = new ArrayList();
                        hashMap.put(e8, arrayList29);
                    }
                    arrayList29.add(new q.b(s7, m7, v11, v12, v13, v14));
                    z7 = z14;
                    z8 = z6;
                }
                hashMap2 = hashMap;
                arrayList17 = arrayList4;
                arrayList15 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                str5 = str;
            }
            hashMap = hashMap2;
            arrayList10 = arrayList16;
            arrayList9 = arrayList12;
            arrayList8 = arrayList13;
            arrayList7 = arrayList14;
            arrayList5 = arrayList15;
            arrayList6 = arrayList18;
            arrayList4 = arrayList17;
            z7 = z14;
            hashMap2 = hashMap;
            arrayList17 = arrayList4;
            arrayList15 = arrayList5;
            arrayList18 = arrayList6;
            arrayList14 = arrayList7;
            arrayList13 = arrayList8;
            arrayList12 = arrayList9;
            arrayList16 = arrayList10;
            str5 = str;
        }
    }

    private static boolean q(String str, Pattern pattern, boolean z6) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z6;
    }

    private static double r(String str, Pattern pattern, double d7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) o2.a.e(matcher.group(1))) : d7;
    }

    private static int s(String str, Pattern pattern, int i7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) o2.a.e(matcher.group(1))) : i7;
    }

    private static long t(String str, Pattern pattern, long j7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) o2.a.e(matcher.group(1))) : j7;
    }

    private static String u(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) o2.a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : B(str2, map);
    }

    private static String v(String str, Pattern pattern, Map<String, String> map) {
        return u(str, pattern, null, map);
    }

    private static int w(String str, Map<String, String> map) {
        String v6 = v(str, R, map);
        if (TextUtils.isEmpty(v6)) {
            return 0;
        }
        String[] Q0 = m0.Q0(v6, ",");
        int i7 = m0.s(Q0, "public.accessibility.describes-video") ? 512 : 0;
        if (m0.s(Q0, "public.accessibility.transcribes-spoken-dialog")) {
            i7 |= 4096;
        }
        if (m0.s(Q0, "public.accessibility.describes-music-and-sound")) {
            i7 |= 1024;
        }
        return m0.s(Q0, "public.easy-to-read") ? i7 | 8192 : i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int x(String str) {
        boolean q7 = q(str, U, false);
        ?? r02 = q7;
        if (q(str, V, false)) {
            r02 = (q7 ? 1 : 0) | 2;
        }
        return q(str, T, false) ? r02 | 4 : r02;
    }

    private static g.f y(String str) {
        double r7 = r(str, f23620r, -9.223372036854776E18d);
        long j7 = r7 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r7 * 1000000.0d);
        boolean q7 = q(str, f23621s, false);
        double r8 = r(str, f23623u, -9.223372036854776E18d);
        long j8 = r8 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r8 * 1000000.0d);
        double r9 = r(str, f23624v, -9.223372036854776E18d);
        return new g.f(j7, q7, j8, r9 != -9.223372036854776E18d ? (long) (r9 * 1000000.0d) : -9223372036854775807L, q(str, f23625w, false));
    }

    private static String z(String str, Pattern pattern, Map<String, String> map) {
        String v6 = v(str, pattern, map);
        if (v6 != null) {
            return v6;
        }
        throw n2.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // n2.j0.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public i a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw n2.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    m0.n(bufferedReader);
                    throw n2.c("Failed to parse the playlist, could not identify any tags.", null);
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
                        return p(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return o(this.f23629a, this.f23630b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            m0.n(bufferedReader);
        }
    }
}
