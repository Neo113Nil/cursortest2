package u0;

import W.AbstractC0108a;
import W.D;
import Y.A;
import android.content.Context;
import b0.C0255a;
import com.startapp.simple.bloomfilter.codec.BaseNCodec;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import e0.t;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C0583e9;
import io.flutter.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import q0.C1353B;
import v2.I;
import v2.a0;
import v2.f0;

/* loaded from: classes.dex */
public final class g implements d, A {

    /* renamed from: p, reason: collision with root package name */
    public static final a0 f15448p = I.n(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: q, reason: collision with root package name */
    public static final a0 f15449q = I.n(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: r, reason: collision with root package name */
    public static final a0 f15450r = I.n(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: s, reason: collision with root package name */
    public static final a0 f15451s = I.n(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: t, reason: collision with root package name */
    public static final a0 f15452t = I.n(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: u, reason: collision with root package name */
    public static final a0 f15453u = I.n(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static g v;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15454a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f15455b;

    /* renamed from: c, reason: collision with root package name */
    public final t f15456c;

    /* renamed from: d, reason: collision with root package name */
    public final D f15457d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15458e;

    /* renamed from: f, reason: collision with root package name */
    public final s f15459f;

    /* renamed from: g, reason: collision with root package name */
    public int f15460g;

    /* renamed from: h, reason: collision with root package name */
    public long f15461h;

    /* renamed from: i, reason: collision with root package name */
    public long f15462i;

    /* renamed from: j, reason: collision with root package name */
    public long f15463j;

    /* renamed from: k, reason: collision with root package name */
    public long f15464k;

    /* renamed from: l, reason: collision with root package name */
    public long f15465l;

    /* renamed from: m, reason: collision with root package name */
    public long f15466m;
    public int n;
    public String o;

    public g(Context context, HashMap hashMap) {
        boolean z;
        D d4 = D.f3254a;
        this.f15454a = context == null ? null : context.getApplicationContext();
        this.f15455b = f0.a(hashMap);
        this.f15456c = new t(24);
        this.f15459f = new s();
        this.f15457d = d4;
        this.f15458e = true;
        if (context == null) {
            this.n = 0;
            this.f15465l = 1000000L;
            return;
        }
        W.s a3 = W.s.a(context);
        int b4 = a3.b();
        this.n = b4;
        this.f15465l = a(b4);
        f fVar = new f(this);
        Executor g4 = AbstractC0108a.g();
        CopyOnWriteArrayList copyOnWriteArrayList = a3.f3338b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            W.q qVar = (W.q) it.next();
            if (qVar.f3331a.get() == null) {
                copyOnWriteArrayList.remove(qVar);
            }
        }
        W.q qVar2 = new W.q(a3, fVar, g4);
        synchronized (a3.f3339c) {
            a3.f3338b.add(qVar2);
            z = a3.f3341e;
        }
        if (z) {
            qVar2.f3332b.execute(new R1.n(3, qVar2));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final long a(int i4) {
        int[] iArr;
        long longValue;
        Integer valueOf = Integer.valueOf(i4);
        f0 f0Var = this.f15455b;
        Long l4 = (Long) f0Var.get(valueOf);
        if (l4 == null) {
            l4 = (Long) f0Var.get(0);
        } else if (l4.longValue() == -9223372036854775807L) {
            String str = this.o;
            if (str == null) {
                str = "";
            }
            char c4 = 65535;
            switch (str.hashCode()) {
                case 2083:
                    if (str.equals("AD")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case 2084:
                    if (str.equals("AE")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case 2085:
                    if (str.equals("AF")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 2086:
                    if (str.equals("AG")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 2088:
                    if (str.equals("AI")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 2091:
                    if (str.equals("AL")) {
                        c4 = 5;
                        break;
                    }
                    break;
                case 2092:
                    if (str.equals("AM")) {
                        c4 = 6;
                        break;
                    }
                    break;
                case 2094:
                    if (str.equals("AO")) {
                        c4 = 7;
                        break;
                    }
                    break;
                case 2096:
                    if (str.equals("AQ")) {
                        c4 = '\b';
                        break;
                    }
                    break;
                case 2097:
                    if (str.equals("AR")) {
                        c4 = '\t';
                        break;
                    }
                    break;
                case 2098:
                    if (str.equals("AS")) {
                        c4 = '\n';
                        break;
                    }
                    break;
                case 2099:
                    if (str.equals("AT")) {
                        c4 = 11;
                        break;
                    }
                    break;
                case 2100:
                    if (str.equals("AU")) {
                        c4 = '\f';
                        break;
                    }
                    break;
                case 2102:
                    if (str.equals("AW")) {
                        c4 = '\r';
                        break;
                    }
                    break;
                case 2103:
                    if (str.equals("AX")) {
                        c4 = 14;
                        break;
                    }
                    break;
                case 2105:
                    if (str.equals("AZ")) {
                        c4 = 15;
                        break;
                    }
                    break;
                case 2111:
                    if (str.equals("BA")) {
                        c4 = 16;
                        break;
                    }
                    break;
                case 2112:
                    if (str.equals("BB")) {
                        c4 = 17;
                        break;
                    }
                    break;
                case 2114:
                    if (str.equals("BD")) {
                        c4 = 18;
                        break;
                    }
                    break;
                case 2115:
                    if (str.equals("BE")) {
                        c4 = 19;
                        break;
                    }
                    break;
                case 2116:
                    if (str.equals("BF")) {
                        c4 = 20;
                        break;
                    }
                    break;
                case 2117:
                    if (str.equals("BG")) {
                        c4 = 21;
                        break;
                    }
                    break;
                case 2118:
                    if (str.equals("BH")) {
                        c4 = 22;
                        break;
                    }
                    break;
                case 2119:
                    if (str.equals("BI")) {
                        c4 = 23;
                        break;
                    }
                    break;
                case 2120:
                    if (str.equals("BJ")) {
                        c4 = 24;
                        break;
                    }
                    break;
                case 2122:
                    if (str.equals("BL")) {
                        c4 = 25;
                        break;
                    }
                    break;
                case 2123:
                    if (str.equals("BM")) {
                        c4 = 26;
                        break;
                    }
                    break;
                case 2124:
                    if (str.equals("BN")) {
                        c4 = 27;
                        break;
                    }
                    break;
                case 2125:
                    if (str.equals("BO")) {
                        c4 = 28;
                        break;
                    }
                    break;
                case 2127:
                    if (str.equals("BQ")) {
                        c4 = 29;
                        break;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        c4 = 30;
                        break;
                    }
                    break;
                case 2129:
                    if (str.equals("BS")) {
                        c4 = 31;
                        break;
                    }
                    break;
                case 2130:
                    if (str.equals("BT")) {
                        c4 = ' ';
                        break;
                    }
                    break;
                case 2133:
                    if (str.equals("BW")) {
                        c4 = '!';
                        break;
                    }
                    break;
                case 2135:
                    if (str.equals("BY")) {
                        c4 = '\"';
                        break;
                    }
                    break;
                case 2136:
                    if (str.equals("BZ")) {
                        c4 = '#';
                        break;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        c4 = '$';
                        break;
                    }
                    break;
                case 2145:
                    if (str.equals("CD")) {
                        c4 = '%';
                        break;
                    }
                    break;
                case 2147:
                    if (str.equals("CF")) {
                        c4 = '&';
                        break;
                    }
                    break;
                case 2148:
                    if (str.equals("CG")) {
                        c4 = '\'';
                        break;
                    }
                    break;
                case 2149:
                    if (str.equals("CH")) {
                        c4 = '(';
                        break;
                    }
                    break;
                case 2150:
                    if (str.equals("CI")) {
                        c4 = ')';
                        break;
                    }
                    break;
                case 2152:
                    if (str.equals("CK")) {
                        c4 = '*';
                        break;
                    }
                    break;
                case 2153:
                    if (str.equals("CL")) {
                        c4 = '+';
                        break;
                    }
                    break;
                case 2154:
                    if (str.equals("CM")) {
                        c4 = ',';
                        break;
                    }
                    break;
                case 2155:
                    if (str.equals("CN")) {
                        c4 = '-';
                        break;
                    }
                    break;
                case 2156:
                    if (str.equals("CO")) {
                        c4 = '.';
                        break;
                    }
                    break;
                case 2159:
                    if (str.equals("CR")) {
                        c4 = IOUtils.DIR_SEPARATOR_UNIX;
                        break;
                    }
                    break;
                case 2162:
                    if (str.equals("CU")) {
                        c4 = '0';
                        break;
                    }
                    break;
                case 2163:
                    if (str.equals("CV")) {
                        c4 = '1';
                        break;
                    }
                    break;
                case 2164:
                    if (str.equals("CW")) {
                        c4 = '2';
                        break;
                    }
                    break;
                case 2165:
                    if (str.equals("CX")) {
                        c4 = '3';
                        break;
                    }
                    break;
                case 2166:
                    if (str.equals("CY")) {
                        c4 = '4';
                        break;
                    }
                    break;
                case 2167:
                    if (str.equals("CZ")) {
                        c4 = '5';
                        break;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        c4 = '6';
                        break;
                    }
                    break;
                case 2182:
                    if (str.equals("DJ")) {
                        c4 = '7';
                        break;
                    }
                    break;
                case 2183:
                    if (str.equals("DK")) {
                        c4 = '8';
                        break;
                    }
                    break;
                case 2185:
                    if (str.equals("DM")) {
                        c4 = '9';
                        break;
                    }
                    break;
                case 2187:
                    if (str.equals("DO")) {
                        c4 = ':';
                        break;
                    }
                    break;
                case 2198:
                    if (str.equals("DZ")) {
                        c4 = ';';
                        break;
                    }
                    break;
                case 2206:
                    if (str.equals("EC")) {
                        c4 = '<';
                        break;
                    }
                    break;
                case 2208:
                    if (str.equals("EE")) {
                        c4 = '=';
                        break;
                    }
                    break;
                case 2210:
                    if (str.equals("EG")) {
                        c4 = '>';
                        break;
                    }
                    break;
                case 2221:
                    if (str.equals("ER")) {
                        c4 = '?';
                        break;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        c4 = '@';
                        break;
                    }
                    break;
                case 2223:
                    if (str.equals("ET")) {
                        c4 = 'A';
                        break;
                    }
                    break;
                case 2243:
                    if (str.equals("FI")) {
                        c4 = 'B';
                        break;
                    }
                    break;
                case 2244:
                    if (str.equals("FJ")) {
                        c4 = 'C';
                        break;
                    }
                    break;
                case 2245:
                    if (str.equals("FK")) {
                        c4 = 'D';
                        break;
                    }
                    break;
                case 2247:
                    if (str.equals("FM")) {
                        c4 = 'E';
                        break;
                    }
                    break;
                case 2249:
                    if (str.equals("FO")) {
                        c4 = 'F';
                        break;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        c4 = 'G';
                        break;
                    }
                    break;
                case 2266:
                    if (str.equals("GA")) {
                        c4 = 'H';
                        break;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        c4 = 'I';
                        break;
                    }
                    break;
                case 2269:
                    if (str.equals("GD")) {
                        c4 = 'J';
                        break;
                    }
                    break;
                case 2270:
                    if (str.equals("GE")) {
                        c4 = 'K';
                        break;
                    }
                    break;
                case 2271:
                    if (str.equals("GF")) {
                        c4 = 'L';
                        break;
                    }
                    break;
                case 2272:
                    if (str.equals("GG")) {
                        c4 = 'M';
                        break;
                    }
                    break;
                case 2273:
                    if (str.equals("GH")) {
                        c4 = 'N';
                        break;
                    }
                    break;
                case 2274:
                    if (str.equals("GI")) {
                        c4 = 'O';
                        break;
                    }
                    break;
                case 2277:
                    if (str.equals("GL")) {
                        c4 = 'P';
                        break;
                    }
                    break;
                case 2278:
                    if (str.equals("GM")) {
                        c4 = 'Q';
                        break;
                    }
                    break;
                case 2279:
                    if (str.equals("GN")) {
                        c4 = 'R';
                        break;
                    }
                    break;
                case 2281:
                    if (str.equals("GP")) {
                        c4 = 'S';
                        break;
                    }
                    break;
                case 2282:
                    if (str.equals("GQ")) {
                        c4 = 'T';
                        break;
                    }
                    break;
                case 2283:
                    if (str.equals("GR")) {
                        c4 = 'U';
                        break;
                    }
                    break;
                case 2285:
                    if (str.equals("GT")) {
                        c4 = 'V';
                        break;
                    }
                    break;
                case 2286:
                    if (str.equals("GU")) {
                        c4 = 'W';
                        break;
                    }
                    break;
                case 2288:
                    if (str.equals("GW")) {
                        c4 = 'X';
                        break;
                    }
                    break;
                case 2290:
                    if (str.equals("GY")) {
                        c4 = 'Y';
                        break;
                    }
                    break;
                case 2307:
                    if (str.equals("HK")) {
                        c4 = 'Z';
                        break;
                    }
                    break;
                case 2314:
                    if (str.equals("HR")) {
                        c4 = '[';
                        break;
                    }
                    break;
                case 2316:
                    if (str.equals("HT")) {
                        c4 = IOUtils.DIR_SEPARATOR_WINDOWS;
                        break;
                    }
                    break;
                case 2317:
                    if (str.equals("HU")) {
                        c4 = ']';
                        break;
                    }
                    break;
                case 2331:
                    if (str.equals("ID")) {
                        c4 = '^';
                        break;
                    }
                    break;
                case 2332:
                    if (str.equals("IE")) {
                        c4 = '_';
                        break;
                    }
                    break;
                case 2339:
                    if (str.equals("IL")) {
                        c4 = '`';
                        break;
                    }
                    break;
                case 2340:
                    if (str.equals("IM")) {
                        c4 = 'a';
                        break;
                    }
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        c4 = 'b';
                        break;
                    }
                    break;
                case 2342:
                    if (str.equals("IO")) {
                        c4 = 'c';
                        break;
                    }
                    break;
                case 2344:
                    if (str.equals("IQ")) {
                        c4 = 'd';
                        break;
                    }
                    break;
                case 2345:
                    if (str.equals("IR")) {
                        c4 = 'e';
                        break;
                    }
                    break;
                case 2346:
                    if (str.equals("IS")) {
                        c4 = 'f';
                        break;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        c4 = 'g';
                        break;
                    }
                    break;
                case 2363:
                    if (str.equals("JE")) {
                        c4 = 'h';
                        break;
                    }
                    break;
                case 2371:
                    if (str.equals("JM")) {
                        c4 = 'i';
                        break;
                    }
                    break;
                case 2373:
                    if (str.equals("JO")) {
                        c4 = 'j';
                        break;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        c4 = 'k';
                        break;
                    }
                    break;
                case 2394:
                    if (str.equals("KE")) {
                        c4 = 'l';
                        break;
                    }
                    break;
                case 2396:
                    if (str.equals("KG")) {
                        c4 = 'm';
                        break;
                    }
                    break;
                case 2397:
                    if (str.equals("KH")) {
                        c4 = 'n';
                        break;
                    }
                    break;
                case 2398:
                    if (str.equals("KI")) {
                        c4 = 'o';
                        break;
                    }
                    break;
                case 2402:
                    if (str.equals("KM")) {
                        c4 = 'p';
                        break;
                    }
                    break;
                case 2403:
                    if (str.equals("KN")) {
                        c4 = 'q';
                        break;
                    }
                    break;
                case 2407:
                    if (str.equals("KR")) {
                        c4 = 'r';
                        break;
                    }
                    break;
                case 2412:
                    if (str.equals("KW")) {
                        c4 = 's';
                        break;
                    }
                    break;
                case 2414:
                    if (str.equals("KY")) {
                        c4 = 't';
                        break;
                    }
                    break;
                case 2415:
                    if (str.equals("KZ")) {
                        c4 = 'u';
                        break;
                    }
                    break;
                case 2421:
                    if (str.equals("LA")) {
                        c4 = 'v';
                        break;
                    }
                    break;
                case 2422:
                    if (str.equals("LB")) {
                        c4 = 'w';
                        break;
                    }
                    break;
                case 2423:
                    if (str.equals("LC")) {
                        c4 = 'x';
                        break;
                    }
                    break;
                case 2429:
                    if (str.equals("LI")) {
                        c4 = 'y';
                        break;
                    }
                    break;
                case 2431:
                    if (str.equals("LK")) {
                        c4 = 'z';
                        break;
                    }
                    break;
                case 2438:
                    if (str.equals("LR")) {
                        c4 = '{';
                        break;
                    }
                    break;
                case 2439:
                    if (str.equals("LS")) {
                        c4 = '|';
                        break;
                    }
                    break;
                case 2440:
                    if (str.equals("LT")) {
                        c4 = '}';
                        break;
                    }
                    break;
                case 2441:
                    if (str.equals("LU")) {
                        c4 = '~';
                        break;
                    }
                    break;
                case 2442:
                    if (str.equals("LV")) {
                        c4 = 127;
                        break;
                    }
                    break;
                case 2445:
                    if (str.equals("LY")) {
                        c4 = 128;
                        break;
                    }
                    break;
                case 2452:
                    if (str.equals("MA")) {
                        c4 = 129;
                        break;
                    }
                    break;
                case 2454:
                    if (str.equals("MC")) {
                        c4 = 130;
                        break;
                    }
                    break;
                case 2455:
                    if (str.equals("MD")) {
                        c4 = 131;
                        break;
                    }
                    break;
                case 2456:
                    if (str.equals("ME")) {
                        c4 = 132;
                        break;
                    }
                    break;
                case 2457:
                    if (str.equals("MF")) {
                        c4 = 133;
                        break;
                    }
                    break;
                case 2458:
                    if (str.equals("MG")) {
                        c4 = 134;
                        break;
                    }
                    break;
                case 2459:
                    if (str.equals("MH")) {
                        c4 = 135;
                        break;
                    }
                    break;
                case 2462:
                    if (str.equals("MK")) {
                        c4 = 136;
                        break;
                    }
                    break;
                case 2463:
                    if (str.equals("ML")) {
                        c4 = 137;
                        break;
                    }
                    break;
                case 2464:
                    if (str.equals("MM")) {
                        c4 = 138;
                        break;
                    }
                    break;
                case 2465:
                    if (str.equals("MN")) {
                        c4 = 139;
                        break;
                    }
                    break;
                case 2466:
                    if (str.equals("MO")) {
                        c4 = 140;
                        break;
                    }
                    break;
                case 2467:
                    if (str.equals("MP")) {
                        c4 = 141;
                        break;
                    }
                    break;
                case 2468:
                    if (str.equals("MQ")) {
                        c4 = 142;
                        break;
                    }
                    break;
                case 2469:
                    if (str.equals("MR")) {
                        c4 = 143;
                        break;
                    }
                    break;
                case 2470:
                    if (str.equals("MS")) {
                        c4 = 144;
                        break;
                    }
                    break;
                case 2471:
                    if (str.equals("MT")) {
                        c4 = 145;
                        break;
                    }
                    break;
                case 2472:
                    if (str.equals("MU")) {
                        c4 = 146;
                        break;
                    }
                    break;
                case 2473:
                    if (str.equals("MV")) {
                        c4 = 147;
                        break;
                    }
                    break;
                case 2474:
                    if (str.equals("MW")) {
                        c4 = 148;
                        break;
                    }
                    break;
                case 2475:
                    if (str.equals("MX")) {
                        c4 = 149;
                        break;
                    }
                    break;
                case 2476:
                    if (str.equals("MY")) {
                        c4 = 150;
                        break;
                    }
                    break;
                case 2477:
                    if (str.equals("MZ")) {
                        c4 = 151;
                        break;
                    }
                    break;
                case 2483:
                    if (str.equals("NA")) {
                        c4 = 152;
                        break;
                    }
                    break;
                case 2485:
                    if (str.equals("NC")) {
                        c4 = 153;
                        break;
                    }
                    break;
                case 2487:
                    if (str.equals("NE")) {
                        c4 = 154;
                        break;
                    }
                    break;
                case 2488:
                    if (str.equals("NF")) {
                        c4 = 155;
                        break;
                    }
                    break;
                case 2489:
                    if (str.equals("NG")) {
                        c4 = 156;
                        break;
                    }
                    break;
                case 2491:
                    if (str.equals("NI")) {
                        c4 = 157;
                        break;
                    }
                    break;
                case 2494:
                    if (str.equals("NL")) {
                        c4 = 158;
                        break;
                    }
                    break;
                case 2497:
                    if (str.equals("NO")) {
                        c4 = 159;
                        break;
                    }
                    break;
                case 2498:
                    if (str.equals("NP")) {
                        c4 = 160;
                        break;
                    }
                    break;
                case 2500:
                    if (str.equals("NR")) {
                        c4 = 161;
                        break;
                    }
                    break;
                case 2503:
                    if (str.equals("NU")) {
                        c4 = 162;
                        break;
                    }
                    break;
                case 2508:
                    if (str.equals("NZ")) {
                        c4 = 163;
                        break;
                    }
                    break;
                case 2526:
                    if (str.equals("OM")) {
                        c4 = 164;
                        break;
                    }
                    break;
                case 2545:
                    if (str.equals("PA")) {
                        c4 = 165;
                        break;
                    }
                    break;
                case 2549:
                    if (str.equals("PE")) {
                        c4 = 166;
                        break;
                    }
                    break;
                case 2550:
                    if (str.equals("PF")) {
                        c4 = 167;
                        break;
                    }
                    break;
                case 2551:
                    if (str.equals("PG")) {
                        c4 = 168;
                        break;
                    }
                    break;
                case 2552:
                    if (str.equals("PH")) {
                        c4 = 169;
                        break;
                    }
                    break;
                case 2555:
                    if (str.equals("PK")) {
                        c4 = 170;
                        break;
                    }
                    break;
                case 2556:
                    if (str.equals("PL")) {
                        c4 = 171;
                        break;
                    }
                    break;
                case 2557:
                    if (str.equals("PM")) {
                        c4 = 172;
                        break;
                    }
                    break;
                case 2562:
                    if (str.equals("PR")) {
                        c4 = 173;
                        break;
                    }
                    break;
                case 2563:
                    if (str.equals("PS")) {
                        c4 = 174;
                        break;
                    }
                    break;
                case 2564:
                    if (str.equals("PT")) {
                        c4 = 175;
                        break;
                    }
                    break;
                case 2567:
                    if (str.equals("PW")) {
                        c4 = 176;
                        break;
                    }
                    break;
                case 2569:
                    if (str.equals("PY")) {
                        c4 = 177;
                        break;
                    }
                    break;
                case 2576:
                    if (str.equals("QA")) {
                        c4 = 178;
                        break;
                    }
                    break;
                case 2611:
                    if (str.equals("RE")) {
                        c4 = 179;
                        break;
                    }
                    break;
                case 2621:
                    if (str.equals("RO")) {
                        c4 = 180;
                        break;
                    }
                    break;
                case 2625:
                    if (str.equals("RS")) {
                        c4 = 181;
                        break;
                    }
                    break;
                case 2627:
                    if (str.equals("RU")) {
                        c4 = 182;
                        break;
                    }
                    break;
                case 2629:
                    if (str.equals("RW")) {
                        c4 = 183;
                        break;
                    }
                    break;
                case 2638:
                    if (str.equals("SA")) {
                        c4 = 184;
                        break;
                    }
                    break;
                case 2639:
                    if (str.equals("SB")) {
                        c4 = 185;
                        break;
                    }
                    break;
                case 2640:
                    if (str.equals("SC")) {
                        c4 = 186;
                        break;
                    }
                    break;
                case 2641:
                    if (str.equals("SD")) {
                        c4 = 187;
                        break;
                    }
                    break;
                case 2642:
                    if (str.equals("SE")) {
                        c4 = 188;
                        break;
                    }
                    break;
                case 2644:
                    if (str.equals("SG")) {
                        c4 = 189;
                        break;
                    }
                    break;
                case 2645:
                    if (str.equals("SH")) {
                        c4 = 190;
                        break;
                    }
                    break;
                case 2646:
                    if (str.equals("SI")) {
                        c4 = 191;
                        break;
                    }
                    break;
                case 2647:
                    if (str.equals("SJ")) {
                        c4 = 192;
                        break;
                    }
                    break;
                case 2648:
                    if (str.equals("SK")) {
                        c4 = 193;
                        break;
                    }
                    break;
                case 2649:
                    if (str.equals("SL")) {
                        c4 = 194;
                        break;
                    }
                    break;
                case 2650:
                    if (str.equals("SM")) {
                        c4 = 195;
                        break;
                    }
                    break;
                case 2651:
                    if (str.equals("SN")) {
                        c4 = 196;
                        break;
                    }
                    break;
                case 2652:
                    if (str.equals("SO")) {
                        c4 = 197;
                        break;
                    }
                    break;
                case 2655:
                    if (str.equals("SR")) {
                        c4 = 198;
                        break;
                    }
                    break;
                case 2656:
                    if (str.equals("SS")) {
                        c4 = 199;
                        break;
                    }
                    break;
                case 2657:
                    if (str.equals("ST")) {
                        c4 = 200;
                        break;
                    }
                    break;
                case 2659:
                    if (str.equals("SV")) {
                        c4 = 201;
                        break;
                    }
                    break;
                case 2661:
                    if (str.equals("SX")) {
                        c4 = 202;
                        break;
                    }
                    break;
                case 2662:
                    if (str.equals("SY")) {
                        c4 = 203;
                        break;
                    }
                    break;
                case 2663:
                    if (str.equals("SZ")) {
                        c4 = 204;
                        break;
                    }
                    break;
                case 2671:
                    if (str.equals("TC")) {
                        c4 = 205;
                        break;
                    }
                    break;
                case 2672:
                    if (str.equals("TD")) {
                        c4 = 206;
                        break;
                    }
                    break;
                case 2675:
                    if (str.equals("TG")) {
                        c4 = 207;
                        break;
                    }
                    break;
                case 2676:
                    if (str.equals("TH")) {
                        c4 = 208;
                        break;
                    }
                    break;
                case 2678:
                    if (str.equals("TJ")) {
                        c4 = 209;
                        break;
                    }
                    break;
                case 2680:
                    if (str.equals("TL")) {
                        c4 = 210;
                        break;
                    }
                    break;
                case 2681:
                    if (str.equals("TM")) {
                        c4 = 211;
                        break;
                    }
                    break;
                case 2682:
                    if (str.equals("TN")) {
                        c4 = 212;
                        break;
                    }
                    break;
                case 2683:
                    if (str.equals("TO")) {
                        c4 = 213;
                        break;
                    }
                    break;
                case 2686:
                    if (str.equals("TR")) {
                        c4 = 214;
                        break;
                    }
                    break;
                case 2688:
                    if (str.equals("TT")) {
                        c4 = 215;
                        break;
                    }
                    break;
                case 2690:
                    if (str.equals("TV")) {
                        c4 = 216;
                        break;
                    }
                    break;
                case 2691:
                    if (str.equals("TW")) {
                        c4 = 217;
                        break;
                    }
                    break;
                case 2694:
                    if (str.equals("TZ")) {
                        c4 = 218;
                        break;
                    }
                    break;
                case 2700:
                    if (str.equals("UA")) {
                        c4 = 219;
                        break;
                    }
                    break;
                case 2706:
                    if (str.equals("UG")) {
                        c4 = 220;
                        break;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        c4 = 221;
                        break;
                    }
                    break;
                case 2724:
                    if (str.equals("UY")) {
                        c4 = 222;
                        break;
                    }
                    break;
                case 2725:
                    if (str.equals("UZ")) {
                        c4 = 223;
                        break;
                    }
                    break;
                case 2731:
                    if (str.equals("VA")) {
                        c4 = 224;
                        break;
                    }
                    break;
                case 2733:
                    if (str.equals("VC")) {
                        c4 = 225;
                        break;
                    }
                    break;
                case 2735:
                    if (str.equals("VE")) {
                        c4 = 226;
                        break;
                    }
                    break;
                case 2737:
                    if (str.equals("VG")) {
                        c4 = 227;
                        break;
                    }
                    break;
                case 2739:
                    if (str.equals("VI")) {
                        c4 = 228;
                        break;
                    }
                    break;
                case 2744:
                    if (str.equals("VN")) {
                        c4 = 229;
                        break;
                    }
                    break;
                case 2751:
                    if (str.equals("VU")) {
                        c4 = 230;
                        break;
                    }
                    break;
                case 2767:
                    if (str.equals("WF")) {
                        c4 = 231;
                        break;
                    }
                    break;
                case 2780:
                    if (str.equals("WS")) {
                        c4 = 232;
                        break;
                    }
                    break;
                case 2803:
                    if (str.equals("XK")) {
                        c4 = 233;
                        break;
                    }
                    break;
                case 2828:
                    if (str.equals("YE")) {
                        c4 = 234;
                        break;
                    }
                    break;
                case 2843:
                    if (str.equals("YT")) {
                        c4 = 235;
                        break;
                    }
                    break;
                case 2855:
                    if (str.equals("ZA")) {
                        c4 = 236;
                        break;
                    }
                    break;
                case 2867:
                    if (str.equals("ZM")) {
                        c4 = 237;
                        break;
                    }
                    break;
                case 2877:
                    if (str.equals("ZW")) {
                        c4 = 238;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                case 4:
                case 17:
                case 29:
                case '2':
                case '9':
                case 'q':
                case BuildConfig.API_LEVEL /* 116 */:
                case 202:
                case 225:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case 2:
                case 204:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 3:
                case ')':
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case 6:
                case 165:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case '\b':
                case '?':
                case 162:
                case 186:
                case 190:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case '\t':
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case '\n':
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case 11:
                case '=':
                case ']':
                case 'f':
                case 127:
                case 145:
                case 188:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case '\f':
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case '\r':
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case 14:
                case '3':
                case 'y':
                case 144:
                case 172:
                case 195:
                case 224:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case 15:
                case '7':
                case 128:
                case 194:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case 16:
                case 'j':
                case 214:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case C0583e9.f11743C /* 19 */:
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case C0583e9.f11744D /* 20 */:
                case 187:
                case 203:
                case 206:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case 21:
                case 175:
                case 191:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case Build.API_LEVELS.API_22 /* 22 */:
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case Build.API_LEVELS.API_23 /* 23 */:
                case 'T':
                case '\\':
                case 154:
                case 226:
                case 234:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case 24:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case 25:
                case 141:
                case 177:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case 26:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case 27:
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case Build.API_LEVELS.API_28 /* 28 */:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case Build.API_LEVELS.API_30 /* 30 */:
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case Build.API_LEVELS.API_31 /* 31 */:
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case Build.API_LEVELS.API_32 /* 32 */:
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case Build.API_LEVELS.API_33 /* 33 */:
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case Build.API_LEVELS.API_34 /* 34 */:
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case '#':
                case C0583e9.f11752M /* 42 */:
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case Build.API_LEVELS.API_36 /* 36 */:
                case 219:
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case '%':
                case 137:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case C0583e9.f11751K /* 38 */:
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case '\'':
                case '>':
                case 134:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case C0583e9.L /* 40 */:
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case '+':
                case 208:
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case ',':
                case 143:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case '-':
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case '.':
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case '/':
                case 157:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case '0':
                case 'o':
                case 161:
                case 210:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case '1':
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case '4':
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case '5':
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case '6':
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case '8':
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case ':':
                case '{':
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case ';':
                case 209:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case '<':
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case BaseNCodec.PEM_CHUNK_SIZE /* 64 */:
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case 'A':
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case 'B':
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case 'C':
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case 'D':
                case 155:
                case 192:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case 'E':
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case 'F':
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 'G':
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case 'H':
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case 'I':
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case 'J':
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case 'K':
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case 'M':
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case 'N':
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 'O':
                case 'a':
                case 'h':
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case 'P':
                case 130:
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case 'Q':
                case 199:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 'R':
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case 'S':
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case 'U':
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case 'V':
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case 'W':
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case 'X':
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case 'Y':
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case '[':
                case 's':
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case '^':
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case '_':
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case '`':
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 'b':
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case 'c':
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_LOWER_BOUND /* 100 */:
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case 'e':
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case 'g':
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case 'i':
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case 'k':
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case 'l':
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case 'm':
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case 'n':
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case 'p':
                case 230:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case 'r':
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case 'u':
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case 'v':
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case 'w':
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case 'x':
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case 'z':
                case 138:
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case '|':
                case 168:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case '}':
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case '~':
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case 129:
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case 131:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case 132:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case 133:
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case 135:
                case 211:
                case 216:
                case 231:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case 136:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case 139:
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case 140:
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case 142:
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case 147:
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case 150:
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case 151:
                case 232:
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case 152:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 153:
                case 235:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case 159:
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case 160:
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case 163:
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case 164:
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case 166:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case 170:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 171:
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case 173:
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case 174:
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case 176:
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case 178:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 179:
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case 180:
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case 181:
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case 182:
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case 183:
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case 184:
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case 185:
                case 238:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case 189:
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case 193:
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case 196:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 197:
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case 200:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case 201:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case 205:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case 207:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case 212:
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case 213:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case 215:
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case 217:
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case 218:
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case 220:
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case 221:
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case 222:
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case 223:
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case 227:
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case 228:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 229:
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case 233:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case 237:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i4 != 2) {
                if (i4 == 3) {
                    longValue = ((Long) f15449q.get(iArr[1])).longValue();
                } else if (i4 == 4) {
                    longValue = ((Long) f15450r.get(iArr[2])).longValue();
                } else if (i4 == 5) {
                    longValue = ((Long) f15451s.get(iArr[3])).longValue();
                } else if (i4 != 7) {
                    longValue = i4 != 9 ? i4 != 10 ? 1000000L : ((Long) f15452t.get(iArr[4])).longValue() : ((Long) f15453u.get(iArr[5])).longValue();
                }
                l4 = Long.valueOf(longValue);
            }
            longValue = ((Long) f15448p.get(iArr[0])).longValue();
            l4 = Long.valueOf(longValue);
        }
        if (l4 == null) {
            l4 = 1000000L;
        }
        return l4.longValue();
    }

    public final void b(int i4, long j4, long j5) {
        final int i5;
        final long j6;
        final long j7;
        if (i4 == 0 && j4 == 0 && j5 == this.f15466m) {
            return;
        }
        this.f15466m = j5;
        Iterator it = ((CopyOnWriteArrayList) this.f15456c.f8416a).iterator();
        while (it.hasNext()) {
            final c cVar = (c) it.next();
            if (cVar.f15440c) {
                i5 = i4;
                j6 = j4;
                j7 = j5;
            } else {
                i5 = i4;
                j6 = j4;
                j7 = j5;
                cVar.f15438a.post(new Runnable() { // from class: u0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.d dVar = c.this.f15439b;
                        L1.h hVar = dVar.f5272d;
                        C0255a i6 = dVar.i(((I) hVar.f1634b).isEmpty() ? null : (C1353B) v2.r.j((I) hVar.f1634b));
                        dVar.l(i6, 1006, new V0.m(i6, i5, j6, j7));
                    }
                });
            }
            i4 = i5;
            j4 = j6;
            j5 = j7;
        }
    }
}
