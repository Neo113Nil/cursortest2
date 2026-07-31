package n2;

import android.content.Context;
import android.os.Handler;
import c4.w0;
import java.util.HashMap;
import java.util.Map;
import n2.f;
import o2.y;

/* loaded from: classes.dex */
public final class s implements f, p0 {

    /* renamed from: p, reason: collision with root package name */
    public static final m4.q<Long> f19534p = m4.q.B(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: q, reason: collision with root package name */
    public static final m4.q<Long> f19535q = m4.q.B(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: r, reason: collision with root package name */
    public static final m4.q<Long> f19536r = m4.q.B(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: s, reason: collision with root package name */
    public static final m4.q<Long> f19537s = m4.q.B(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: t, reason: collision with root package name */
    public static final m4.q<Long> f19538t = m4.q.B(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: u, reason: collision with root package name */
    public static final m4.q<Long> f19539u = m4.q.B(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: v, reason: collision with root package name */
    private static s f19540v;

    /* renamed from: a, reason: collision with root package name */
    private final m4.r<Integer, Long> f19541a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a.C0112a f19542b;

    /* renamed from: c, reason: collision with root package name */
    private final n0 f19543c;

    /* renamed from: d, reason: collision with root package name */
    private final o2.d f19544d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f19545e;

    /* renamed from: f, reason: collision with root package name */
    private int f19546f;

    /* renamed from: g, reason: collision with root package name */
    private long f19547g;

    /* renamed from: h, reason: collision with root package name */
    private long f19548h;

    /* renamed from: i, reason: collision with root package name */
    private int f19549i;

    /* renamed from: j, reason: collision with root package name */
    private long f19550j;

    /* renamed from: k, reason: collision with root package name */
    private long f19551k;

    /* renamed from: l, reason: collision with root package name */
    private long f19552l;

    /* renamed from: m, reason: collision with root package name */
    private long f19553m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19554n;

    /* renamed from: o, reason: collision with root package name */
    private int f19555o;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f19556a;

        /* renamed from: b, reason: collision with root package name */
        private Map<Integer, Long> f19557b;

        /* renamed from: c, reason: collision with root package name */
        private int f19558c;

        /* renamed from: d, reason: collision with root package name */
        private o2.d f19559d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f19560e;

        public b(Context context) {
            this.f19556a = context == null ? null : context.getApplicationContext();
            this.f19557b = b(o2.m0.N(context));
            this.f19558c = 2000;
            this.f19559d = o2.d.f19699a;
            this.f19560e = true;
        }

        private static Map<Integer, Long> b(String str) {
            int[] l7 = s.l(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            m4.q<Long> qVar = s.f19534p;
            hashMap.put(2, qVar.get(l7[0]));
            hashMap.put(3, s.f19535q.get(l7[1]));
            hashMap.put(4, s.f19536r.get(l7[2]));
            hashMap.put(5, s.f19537s.get(l7[3]));
            hashMap.put(10, s.f19538t.get(l7[4]));
            hashMap.put(9, s.f19539u.get(l7[5]));
            hashMap.put(7, qVar.get(l7[0]));
            return hashMap;
        }

        public s a() {
            return new s(this.f19556a, this.f19557b, this.f19558c, this.f19559d, this.f19560e);
        }
    }

    private s(Context context, Map<Integer, Long> map, int i7, o2.d dVar, boolean z6) {
        this.f19541a = m4.r.c(map);
        this.f19542b = new f.a.C0112a();
        this.f19543c = new n0(i7);
        this.f19544d = dVar;
        this.f19545e = z6;
        if (context == null) {
            this.f19549i = 0;
            this.f19552l = m(0);
            return;
        }
        o2.y d7 = o2.y.d(context);
        int f7 = d7.f();
        this.f19549i = f7;
        this.f19552l = m(f7);
        d7.i(new y.c() { // from class: n2.r
            @Override // o2.y.c
            public final void a(int i8) {
                s.this.q(i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] l(String str) {
        str.hashCode();
        char c7 = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c7 = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c7 = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c7 = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c7 = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c7 = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c7 = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c7 = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c7 = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c7 = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c7 = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c7 = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c7 = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c7 = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c7 = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c7 = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c7 = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c7 = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c7 = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c7 = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c7 = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c7 = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c7 = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c7 = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c7 = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c7 = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c7 = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c7 = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c7 = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c7 = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c7 = 29;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c7 = 30;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c7 = 31;
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c7 = ' ';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c7 = '!';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c7 = '\"';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c7 = '#';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c7 = '$';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c7 = '%';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c7 = '&';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c7 = '\'';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c7 = '(';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c7 = ')';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c7 = '*';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c7 = '+';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c7 = ',';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c7 = '-';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c7 = '.';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c7 = '/';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c7 = '0';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c7 = '1';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c7 = '2';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c7 = '3';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c7 = '4';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c7 = '5';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c7 = '6';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c7 = '7';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c7 = '8';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c7 = '9';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c7 = ':';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c7 = ';';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c7 = '<';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c7 = '=';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c7 = '>';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c7 = '?';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c7 = '@';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c7 = 'A';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c7 = 'B';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c7 = 'C';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c7 = 'D';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c7 = 'E';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c7 = 'F';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c7 = 'G';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c7 = 'H';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c7 = 'I';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c7 = 'J';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c7 = 'K';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c7 = 'L';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c7 = 'M';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c7 = 'N';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c7 = 'O';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c7 = 'P';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c7 = 'Q';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c7 = 'R';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c7 = 'S';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c7 = 'T';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c7 = 'U';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c7 = 'V';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c7 = 'W';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c7 = 'X';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c7 = 'Y';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c7 = 'Z';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c7 = '[';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c7 = '\\';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c7 = ']';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c7 = '^';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c7 = '_';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c7 = '`';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c7 = 'a';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c7 = 'b';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c7 = 'c';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c7 = 'd';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c7 = 'e';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c7 = 'f';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c7 = 'g';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c7 = 'h';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c7 = 'i';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c7 = 'j';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c7 = 'k';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c7 = 'l';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c7 = 'm';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c7 = 'n';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c7 = 'o';
                    break;
                }
                break;
            case 2403:
                if (str.equals("KN")) {
                    c7 = 'p';
                    break;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    c7 = 'q';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c7 = 'r';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c7 = 's';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c7 = 't';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c7 = 'u';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c7 = 'v';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c7 = 'w';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c7 = 'x';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c7 = 'y';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c7 = 'z';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c7 = '{';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c7 = '|';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c7 = '}';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c7 = '~';
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c7 = 127;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c7 = 128;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c7 = 129;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c7 = 130;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c7 = 131;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c7 = 132;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c7 = 133;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c7 = 134;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c7 = 135;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c7 = 136;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c7 = 137;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c7 = 138;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c7 = 139;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c7 = 140;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c7 = 141;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c7 = 142;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c7 = 143;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c7 = 144;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c7 = 145;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c7 = 146;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c7 = 147;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c7 = 148;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c7 = 149;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c7 = 150;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c7 = 151;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c7 = 152;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c7 = 153;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c7 = 154;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c7 = 155;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c7 = 156;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c7 = 157;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c7 = 158;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c7 = 159;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c7 = 160;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c7 = 161;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c7 = 162;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c7 = 163;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c7 = 164;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c7 = 165;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c7 = 166;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c7 = 167;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c7 = 168;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c7 = 169;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c7 = 170;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c7 = 171;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c7 = 172;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c7 = 173;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c7 = 174;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c7 = 175;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c7 = 176;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c7 = 177;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c7 = 178;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c7 = 179;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c7 = 180;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c7 = 181;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c7 = 182;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c7 = 183;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c7 = 184;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c7 = 185;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c7 = 186;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c7 = 187;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c7 = 188;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c7 = 189;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c7 = 190;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c7 = 191;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c7 = 192;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c7 = 193;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c7 = 194;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c7 = 195;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c7 = 196;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c7 = 197;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c7 = 198;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c7 = 199;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c7 = 200;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c7 = 201;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c7 = 202;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c7 = 203;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c7 = 204;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c7 = 205;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c7 = 206;
                    break;
                }
                break;
            case 2679:
                if (str.equals("TK")) {
                    c7 = 207;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c7 = 208;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c7 = 209;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c7 = 210;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c7 = 211;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c7 = 212;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c7 = 213;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c7 = 214;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c7 = 215;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c7 = 216;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c7 = 217;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c7 = 218;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c7 = 219;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c7 = 220;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c7 = 221;
                    break;
                }
                break;
            case 2731:
                if (str.equals("VA")) {
                    c7 = 222;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c7 = 223;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c7 = 224;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c7 = 225;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c7 = 226;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c7 = 227;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c7 = 228;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c7 = 229;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c7 = 230;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c7 = 231;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c7 = 232;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c7 = 233;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c7 = 234;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c7 = 235;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c7 = 236;
                    break;
                }
                break;
        }
        int[] iArr = {1, 2, 0, 0, 2, 2};
        switch (c7) {
            case 0:
            case 26:
            case 29:
            case 'I':
            case 'O':
            case 'p':
            case 't':
            case 'x':
            case 223:
                break;
            case 1:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 0;
                break;
            case 2:
            case 'P':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 3:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 4:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 5:
            case 231:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 6:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case w0.f2149o /* 7 */:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case w0.f2150p /* 8 */:
            case '>':
            case 188:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '\t':
            case 'l':
            case 210:
            case 220:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '\n':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 11:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 0;
                break;
            case '\f':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 0;
                break;
            case '\r':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 14:
            case 'y':
            case 144:
            case 171:
            case 192:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 15:
            case 'K':
            case 128:
            case 169:
            case 194:
            case 211:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 16:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 17:
            case '8':
            case 'E':
            case 'N':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 18:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 19:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case 20:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 21:
            case 145:
            case 190:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 22:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 23:
            case '[':
            case 'o':
            case 134:
            case 154:
            case 185:
            case 203:
            case 224:
            case 232:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 24:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 25:
            case '2':
            case 222:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 27:
            case '1':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 28:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 30:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 31:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case ' ':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '!':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '\"':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '#':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case '$':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '%':
            case 'n':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '&':
            case '=':
            case 'W':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '\'':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case '(':
            case ':':
            case '{':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case ')':
            case 166:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '*':
            case '_':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case '+':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case ',':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case '-':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '.':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '/':
            case '6':
            case 200:
            case 206:
            case 208:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '0':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '3':
            case 's':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case '4':
            case 158:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case '5':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 3;
                break;
            case '7':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case '9':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case ';':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '<':
            case 'e':
            case 127:
            case 174:
            case 186:
            case 215:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case '?':
            case '^':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '@':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'A':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 3;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case 'B':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'C':
            case 'k':
            case 'q':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'D':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'F':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 0;
                iArr[5] = 2;
                break;
            case 'G':
            case 204:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'H':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 1;
                break;
            case 'J':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'L':
            case 226:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'M':
            case 152:
            case 228:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'Q':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'R':
            case 142:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'S':
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'T':
            case 'Z':
            case 189:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 'U':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'V':
            case 165:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 'X':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'Y':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 0;
                break;
            case '\\':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case ']':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case '`':
            case 217:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'a':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 3;
                break;
            case 'b':
            case 135:
            case 214:
            case 229:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'c':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'd':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 4;
                iArr[5] = 1;
                break;
            case 'f':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 'g':
            case 233:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'h':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'i':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'j':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 4;
                break;
            case 'm':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'r':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 4;
                break;
            case 'u':
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'v':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'w':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 'z':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case '|':
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '}':
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case '~':
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 1;
                iArr[5] = 4;
                break;
            case 129:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 130:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 131:
            case 179:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 132:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 133:
            case 177:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 136:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case 137:
            case 167:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 138:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 139:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 140:
            case 141:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 143:
            case 236:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 146:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 147:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 148:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 149:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 150:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 3;
                iArr[5] = 2;
                break;
            case 151:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 153:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 155:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 156:
            case 164:
            case 198:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 157:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 0;
                iArr[5] = 3;
                break;
            case 159:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 160:
            case 161:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 162:
            case 170:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 163:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 3;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 168:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 0;
                break;
            case 172:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 1;
                break;
            case 173:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 175:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 176:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 4;
                iArr[4] = 4;
                iArr[5] = 2;
                break;
            case 178:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 0;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 180:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 4;
                iArr[5] = 3;
                break;
            case 181:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 2;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 182:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 183:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 184:
            case 209:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 187:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 1;
                break;
            case 191:
            case 218:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 193:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 4;
                iArr[2] = 4;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 195:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 196:
                // fill-array-data instruction
                iArr[0] = 4;
                iArr[1] = 3;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 197:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 199:
            case 202:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 201:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 205:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 3;
                iArr[5] = 4;
                break;
            case 207:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 212:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 1;
                iArr[2] = 0;
                iArr[3] = 0;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 213:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 4;
                iArr[2] = 1;
                iArr[3] = 3;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 216:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 4;
                iArr[2] = 3;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 219:
                // fill-array-data instruction
                iArr[0] = 1;
                iArr[1] = 0;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 3;
                iArr[5] = 1;
                break;
            case 221:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 225:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 1;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 227:
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 3;
                iArr[2] = 3;
                iArr[3] = 4;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 230:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 1;
                iArr[2] = 3;
                iArr[3] = 1;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            case 234:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 1;
                iArr[4] = 1;
                iArr[5] = 2;
                break;
            case 235:
                // fill-array-data instruction
                iArr[0] = 3;
                iArr[1] = 3;
                iArr[2] = 4;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
            default:
                // fill-array-data instruction
                iArr[0] = 2;
                iArr[1] = 2;
                iArr[2] = 2;
                iArr[3] = 2;
                iArr[4] = 2;
                iArr[5] = 2;
                break;
        }
        return iArr;
    }

    private long m(int i7) {
        Long l7 = this.f19541a.get(Integer.valueOf(i7));
        if (l7 == null) {
            l7 = this.f19541a.get(0);
        }
        if (l7 == null) {
            l7 = 1000000L;
        }
        return l7.longValue();
    }

    public static synchronized s n(Context context) {
        s sVar;
        synchronized (s.class) {
            if (f19540v == null) {
                f19540v = new b(context).a();
            }
            sVar = f19540v;
        }
        return sVar;
    }

    private static boolean o(p pVar, boolean z6) {
        return z6 && !pVar.d(8);
    }

    private void p(int i7, long j7, long j8) {
        if (i7 == 0 && j7 == 0 && j8 == this.f19553m) {
            return;
        }
        this.f19553m = j8;
        this.f19542b.c(i7, j7, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(int i7) {
        int i8 = this.f19549i;
        if (i8 == 0 || this.f19545e) {
            if (this.f19554n) {
                i7 = this.f19555o;
            }
            if (i8 == i7) {
                return;
            }
            this.f19549i = i7;
            if (i7 != 1 && i7 != 0 && i7 != 8) {
                this.f19552l = m(i7);
                long a7 = this.f19544d.a();
                p(this.f19546f > 0 ? (int) (a7 - this.f19547g) : 0, this.f19548h, this.f19552l);
                this.f19547g = a7;
                this.f19548h = 0L;
                this.f19551k = 0L;
                this.f19550j = 0L;
                this.f19543c.i();
            }
        }
    }

    @Override // n2.p0
    public synchronized void a(l lVar, p pVar, boolean z6) {
        if (o(pVar, z6)) {
            if (this.f19546f == 0) {
                this.f19547g = this.f19544d.a();
            }
            this.f19546f++;
        }
    }

    @Override // n2.f
    public void b(Handler handler, f.a aVar) {
        o2.a.e(handler);
        o2.a.e(aVar);
        this.f19542b.b(handler, aVar);
    }

    @Override // n2.f
    public p0 c() {
        return this;
    }

    @Override // n2.p0
    public synchronized void d(l lVar, p pVar, boolean z6) {
        if (o(pVar, z6)) {
            o2.a.f(this.f19546f > 0);
            long a7 = this.f19544d.a();
            int i7 = (int) (a7 - this.f19547g);
            this.f19550j += i7;
            long j7 = this.f19551k;
            long j8 = this.f19548h;
            this.f19551k = j7 + j8;
            if (i7 > 0) {
                this.f19543c.c((int) Math.sqrt(j8), (j8 * 8000.0f) / i7);
                if (this.f19550j >= 2000 || this.f19551k >= 524288) {
                    this.f19552l = (long) this.f19543c.f(0.5f);
                }
                p(i7, this.f19548h, this.f19552l);
                this.f19547g = a7;
                this.f19548h = 0L;
            }
            this.f19546f--;
        }
    }

    @Override // n2.f
    public /* synthetic */ long e() {
        return d.a(this);
    }

    @Override // n2.f
    public synchronized long f() {
        return this.f19552l;
    }

    @Override // n2.p0
    public synchronized void g(l lVar, p pVar, boolean z6, int i7) {
        if (o(pVar, z6)) {
            this.f19548h += i7;
        }
    }

    @Override // n2.p0
    public void h(l lVar, p pVar, boolean z6) {
    }

    @Override // n2.f
    public void i(f.a aVar) {
        this.f19542b.e(aVar);
    }
}
