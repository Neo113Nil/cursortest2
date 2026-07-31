package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.mediationsdk.demandOnly.e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.InterfaceC1881di;
import com.yandex.mobile.ads.impl.sc1;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.impl.C3139z9;
import io.jsonwebtoken.JwtParser;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class yy implements InterfaceC1881di, s62 {

    /* renamed from: n, reason: collision with root package name */
    public static final sj0<Long> f35365n = sj0.a(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: o, reason: collision with root package name */
    public static final sj0<Long> f35366o = sj0.a(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: p, reason: collision with root package name */
    public static final sj0<Long> f35367p = sj0.a(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: q, reason: collision with root package name */
    public static final sj0<Long> f35368q = sj0.a(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: r, reason: collision with root package name */
    public static final sj0<Long> f35369r = sj0.a(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: s, reason: collision with root package name */
    public static final sj0<Long> f35370s = sj0.a(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: t, reason: collision with root package name */
    private static yy f35371t;

    /* renamed from: a, reason: collision with root package name */
    private final tj0<Integer, Long> f35372a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1881di.a.C0184a f35373b = new InterfaceC1881di.a.C0184a();

    /* renamed from: c, reason: collision with root package name */
    private final vz1 f35374c;

    /* renamed from: d, reason: collision with root package name */
    private final wo f35375d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f35376e;

    /* renamed from: f, reason: collision with root package name */
    private int f35377f;

    /* renamed from: g, reason: collision with root package name */
    private long f35378g;

    /* renamed from: h, reason: collision with root package name */
    private long f35379h;

    /* renamed from: i, reason: collision with root package name */
    private int f35380i;

    /* renamed from: j, reason: collision with root package name */
    private long f35381j;

    /* renamed from: k, reason: collision with root package name */
    private long f35382k;

    /* renamed from: l, reason: collision with root package name */
    private long f35383l;

    /* renamed from: m, reason: collision with root package name */
    private long f35384m;

    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static HashMap a(String str) {
            int[] a4 = yy.a(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            sj0<Long> sj0Var = yy.f35365n;
            hashMap.put(2, sj0Var.get(a4[0]));
            hashMap.put(3, yy.f35366o.get(a4[1]));
            hashMap.put(4, yy.f35367p.get(a4[2]));
            hashMap.put(5, yy.f35368q.get(a4[3]));
            hashMap.put(10, yy.f35369r.get(a4[4]));
            hashMap.put(9, yy.f35370s.get(a4[5]));
            hashMap.put(7, sj0Var.get(a4[0]));
            return hashMap;
        }
    }

    private yy(Context context, HashMap hashMap, int i4, n32 n32Var, boolean z4) {
        this.f35372a = tj0.a(hashMap);
        this.f35374c = new vz1(i4);
        this.f35375d = n32Var;
        this.f35376e = z4;
        if (context == null) {
            this.f35380i = 0;
            this.f35383l = a(0);
            return;
        }
        sc1 a4 = sc1.a(context);
        int a5 = a4.a();
        this.f35380i = a5;
        this.f35383l = a(a5);
        a4.b(new sc1.b() { // from class: com.yandex.mobile.ads.impl.Cm
            @Override // com.yandex.mobile.ads.impl.sc1.b
            public final void a(int i5) {
                yy.this.b(i5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(int i4) {
        int i5 = this.f35380i;
        if (i5 == 0 || this.f35376e) {
            if (i5 == i4) {
                return;
            }
            this.f35380i = i4;
            if (i4 != 1 && i4 != 0 && i4 != 8) {
                this.f35383l = a(i4);
                long b4 = this.f35375d.b();
                int i6 = this.f35377f > 0 ? (int) (b4 - this.f35378g) : 0;
                long j4 = this.f35379h;
                long j5 = this.f35383l;
                if (i6 != 0 || j4 != 0 || j5 != this.f35384m) {
                    this.f35384m = j5;
                    this.f35373b.a(i6, j4, j5);
                }
                this.f35378g = b4;
                this.f35379h = 0L;
                this.f35382k = 0L;
                this.f35381j = 0L;
                this.f35374c.b();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1881di
    public final yy a() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1881di
    public final void a(Handler handler, InterfaceC2296vc interfaceC2296vc) {
        interfaceC2296vc.getClass();
        this.f35373b.a(handler, interfaceC2296vc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1019:0x0ceb, code lost:
    
        if (r8.equals("AD") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] a(String str) {
        char c4 = 0;
        str.getClass();
        switch (str.hashCode()) {
            case 2083:
                break;
            case 2084:
                if (str.equals("AE")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 2085:
                if (str.equals("AF")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 2086:
                if (str.equals("AG")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 2088:
                if (str.equals("AI")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 2091:
                if (str.equals("AL")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 2092:
                if (str.equals("AM")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 2094:
                if (str.equals("AO")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 2097:
                if (str.equals("AR")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 2098:
                if (str.equals("AS")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 2099:
                if (str.equals("AT")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 2100:
                if (str.equals("AU")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case IronSourceConstants.IS_CHECK_READY_FALSE /* 2102 */:
                if (str.equals("AW")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            case IronSourceConstants.IS_CHECK_CAPPED_TRUE /* 2103 */:
                if (str.equals("AX")) {
                    c4 = 14;
                    break;
                }
                c4 = 65535;
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c4 = 15;
                    break;
                }
                c4 = 65535;
                break;
            case IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR /* 2111 */:
                if (str.equals("BA")) {
                    c4 = 16;
                    break;
                }
                c4 = 65535;
                break;
            case IronSourceConstants.IS_CALLBACK_AD_DISPLAYED /* 2112 */:
                if (str.equals("BB")) {
                    c4 = 17;
                    break;
                }
                c4 = 65535;
                break;
            case IronSourceConstants.IS_CALLBACK_AD_CLICKED /* 2114 */:
                if (str.equals("BD")) {
                    c4 = 18;
                    break;
                }
                c4 = 65535;
                break;
            case IronSourceConstants.IS_CALLBACK_AD_INFO_CHANGED /* 2115 */:
                if (str.equals("BE")) {
                    c4 = 19;
                    break;
                }
                c4 = 65535;
                break;
            case 2116:
                if (str.equals("BF")) {
                    c4 = 20;
                    break;
                }
                c4 = 65535;
                break;
            case 2117:
                if (str.equals("BG")) {
                    c4 = 21;
                    break;
                }
                c4 = 65535;
                break;
            case 2118:
                if (str.equals("BH")) {
                    c4 = 22;
                    break;
                }
                c4 = 65535;
                break;
            case 2119:
                if (str.equals("BI")) {
                    c4 = 23;
                    break;
                }
                c4 = 65535;
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c4 = 24;
                    break;
                }
                c4 = 65535;
                break;
            case 2122:
                if (str.equals("BL")) {
                    c4 = 25;
                    break;
                }
                c4 = 65535;
                break;
            case 2123:
                if (str.equals("BM")) {
                    c4 = 26;
                    break;
                }
                c4 = 65535;
                break;
            case 2124:
                if (str.equals("BN")) {
                    c4 = 27;
                    break;
                }
                c4 = 65535;
                break;
            case 2125:
                if (str.equals("BO")) {
                    c4 = 28;
                    break;
                }
                c4 = 65535;
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c4 = 29;
                    break;
                }
                c4 = 65535;
                break;
            case 2129:
                if (str.equals("BS")) {
                    c4 = 30;
                    break;
                }
                c4 = 65535;
                break;
            case 2130:
                if (str.equals("BT")) {
                    c4 = 31;
                    break;
                }
                c4 = 65535;
                break;
            case 2133:
                if (str.equals("BW")) {
                    c4 = ' ';
                    break;
                }
                c4 = 65535;
                break;
            case 2135:
                if (str.equals("BY")) {
                    c4 = '!';
                    break;
                }
                c4 = 65535;
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c4 = '\"';
                    break;
                }
                c4 = 65535;
                break;
            case 2142:
                if (str.equals("CA")) {
                    c4 = '#';
                    break;
                }
                c4 = 65535;
                break;
            case 2145:
                if (str.equals("CD")) {
                    c4 = '$';
                    break;
                }
                c4 = 65535;
                break;
            case 2147:
                if (str.equals("CF")) {
                    c4 = '%';
                    break;
                }
                c4 = 65535;
                break;
            case 2148:
                if (str.equals("CG")) {
                    c4 = '&';
                    break;
                }
                c4 = 65535;
                break;
            case 2149:
                if (str.equals("CH")) {
                    c4 = '\'';
                    break;
                }
                c4 = 65535;
                break;
            case 2150:
                if (str.equals("CI")) {
                    c4 = '(';
                    break;
                }
                c4 = 65535;
                break;
            case 2152:
                if (str.equals("CK")) {
                    c4 = ')';
                    break;
                }
                c4 = 65535;
                break;
            case 2153:
                if (str.equals("CL")) {
                    c4 = '*';
                    break;
                }
                c4 = 65535;
                break;
            case 2154:
                if (str.equals("CM")) {
                    c4 = '+';
                    break;
                }
                c4 = 65535;
                break;
            case 2155:
                if (str.equals("CN")) {
                    c4 = ',';
                    break;
                }
                c4 = 65535;
                break;
            case 2156:
                if (str.equals("CO")) {
                    c4 = '-';
                    break;
                }
                c4 = 65535;
                break;
            case 2159:
                if (str.equals("CR")) {
                    c4 = JwtParser.SEPARATOR_CHAR;
                    break;
                }
                c4 = 65535;
                break;
            case 2162:
                if (str.equals("CU")) {
                    c4 = '/';
                    break;
                }
                c4 = 65535;
                break;
            case 2163:
                if (str.equals("CV")) {
                    c4 = '0';
                    break;
                }
                c4 = 65535;
                break;
            case 2164:
                if (str.equals("CW")) {
                    c4 = '1';
                    break;
                }
                c4 = 65535;
                break;
            case 2165:
                if (str.equals("CX")) {
                    c4 = '2';
                    break;
                }
                c4 = 65535;
                break;
            case 2166:
                if (str.equals("CY")) {
                    c4 = '3';
                    break;
                }
                c4 = 65535;
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c4 = '4';
                    break;
                }
                c4 = 65535;
                break;
            case 2177:
                if (str.equals("DE")) {
                    c4 = '5';
                    break;
                }
                c4 = 65535;
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c4 = '6';
                    break;
                }
                c4 = 65535;
                break;
            case 2183:
                if (str.equals("DK")) {
                    c4 = '7';
                    break;
                }
                c4 = 65535;
                break;
            case 2185:
                if (str.equals("DM")) {
                    c4 = '8';
                    break;
                }
                c4 = 65535;
                break;
            case 2187:
                if (str.equals("DO")) {
                    c4 = '9';
                    break;
                }
                c4 = 65535;
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c4 = ':';
                    break;
                }
                c4 = 65535;
                break;
            case IronSourceConstants.IS_INSTANCE_INIT_FAILED /* 2206 */:
                if (str.equals("EC")) {
                    c4 = ';';
                    break;
                }
                c4 = 65535;
                break;
            case 2208:
                if (str.equals("EE")) {
                    c4 = '<';
                    break;
                }
                c4 = 65535;
                break;
            case 2210:
                if (str.equals("EG")) {
                    c4 = com.ironsource.cc.f15727T;
                    break;
                }
                c4 = 65535;
                break;
            case 2221:
                if (str.equals("ER")) {
                    c4 = '>';
                    break;
                }
                c4 = 65535;
                break;
            case 2222:
                if (str.equals("ES")) {
                    c4 = '?';
                    break;
                }
                c4 = 65535;
                break;
            case 2223:
                if (str.equals("ET")) {
                    c4 = '@';
                    break;
                }
                c4 = 65535;
                break;
            case 2243:
                if (str.equals("FI")) {
                    c4 = 'A';
                    break;
                }
                c4 = 65535;
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c4 = 'B';
                    break;
                }
                c4 = 65535;
                break;
            case 2245:
                if (str.equals("FK")) {
                    c4 = 'C';
                    break;
                }
                c4 = 65535;
                break;
            case 2247:
                if (str.equals("FM")) {
                    c4 = 'D';
                    break;
                }
                c4 = 65535;
                break;
            case 2249:
                if (str.equals("FO")) {
                    c4 = 'E';
                    break;
                }
                c4 = 65535;
                break;
            case 2252:
                if (str.equals("FR")) {
                    c4 = 'F';
                    break;
                }
                c4 = 65535;
                break;
            case 2266:
                if (str.equals("GA")) {
                    c4 = 'G';
                    break;
                }
                c4 = 65535;
                break;
            case 2267:
                if (str.equals("GB")) {
                    c4 = 'H';
                    break;
                }
                c4 = 65535;
                break;
            case 2269:
                if (str.equals("GD")) {
                    c4 = 'I';
                    break;
                }
                c4 = 65535;
                break;
            case 2270:
                if (str.equals("GE")) {
                    c4 = 'J';
                    break;
                }
                c4 = 65535;
                break;
            case 2271:
                if (str.equals("GF")) {
                    c4 = 'K';
                    break;
                }
                c4 = 65535;
                break;
            case 2272:
                if (str.equals("GG")) {
                    c4 = 'L';
                    break;
                }
                c4 = 65535;
                break;
            case 2273:
                if (str.equals("GH")) {
                    c4 = 'M';
                    break;
                }
                c4 = 65535;
                break;
            case 2274:
                if (str.equals("GI")) {
                    c4 = 'N';
                    break;
                }
                c4 = 65535;
                break;
            case 2277:
                if (str.equals("GL")) {
                    c4 = 'O';
                    break;
                }
                c4 = 65535;
                break;
            case 2278:
                if (str.equals("GM")) {
                    c4 = 'P';
                    break;
                }
                c4 = 65535;
                break;
            case 2279:
                if (str.equals("GN")) {
                    c4 = 'Q';
                    break;
                }
                c4 = 65535;
                break;
            case 2281:
                if (str.equals("GP")) {
                    c4 = 'R';
                    break;
                }
                c4 = 65535;
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c4 = 'S';
                    break;
                }
                c4 = 65535;
                break;
            case 2283:
                if (str.equals("GR")) {
                    c4 = 'T';
                    break;
                }
                c4 = 65535;
                break;
            case 2285:
                if (str.equals("GT")) {
                    c4 = 'U';
                    break;
                }
                c4 = 65535;
                break;
            case 2286:
                if (str.equals("GU")) {
                    c4 = 'V';
                    break;
                }
                c4 = 65535;
                break;
            case 2288:
                if (str.equals("GW")) {
                    c4 = 'W';
                    break;
                }
                c4 = 65535;
                break;
            case 2290:
                if (str.equals("GY")) {
                    c4 = 'X';
                    break;
                }
                c4 = 65535;
                break;
            case 2307:
                if (str.equals("HK")) {
                    c4 = 'Y';
                    break;
                }
                c4 = 65535;
                break;
            case 2314:
                if (str.equals("HR")) {
                    c4 = 'Z';
                    break;
                }
                c4 = 65535;
                break;
            case 2316:
                if (str.equals("HT")) {
                    c4 = '[';
                    break;
                }
                c4 = 65535;
                break;
            case 2317:
                if (str.equals("HU")) {
                    c4 = '\\';
                    break;
                }
                c4 = 65535;
                break;
            case 2331:
                if (str.equals("ID")) {
                    c4 = ']';
                    break;
                }
                c4 = 65535;
                break;
            case 2332:
                if (str.equals("IE")) {
                    c4 = '^';
                    break;
                }
                c4 = 65535;
                break;
            case 2339:
                if (str.equals("IL")) {
                    c4 = '_';
                    break;
                }
                c4 = 65535;
                break;
            case 2340:
                if (str.equals("IM")) {
                    c4 = '`';
                    break;
                }
                c4 = 65535;
                break;
            case 2341:
                if (str.equals("IN")) {
                    c4 = 'a';
                    break;
                }
                c4 = 65535;
                break;
            case 2342:
                if (str.equals("IO")) {
                    c4 = 'b';
                    break;
                }
                c4 = 65535;
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c4 = 'c';
                    break;
                }
                c4 = 65535;
                break;
            case 2345:
                if (str.equals("IR")) {
                    c4 = 'd';
                    break;
                }
                c4 = 65535;
                break;
            case 2346:
                if (str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                    c4 = 'e';
                    break;
                }
                c4 = 65535;
                break;
            case 2347:
                if (str.equals("IT")) {
                    c4 = 'f';
                    break;
                }
                c4 = 65535;
                break;
            case 2363:
                if (str.equals("JE")) {
                    c4 = 'g';
                    break;
                }
                c4 = 65535;
                break;
            case 2371:
                if (str.equals("JM")) {
                    c4 = 'h';
                    break;
                }
                c4 = 65535;
                break;
            case 2373:
                if (str.equals("JO")) {
                    c4 = 'i';
                    break;
                }
                c4 = 65535;
                break;
            case 2374:
                if (str.equals("JP")) {
                    c4 = 'j';
                    break;
                }
                c4 = 65535;
                break;
            case 2394:
                if (str.equals("KE")) {
                    c4 = 'k';
                    break;
                }
                c4 = 65535;
                break;
            case 2396:
                if (str.equals("KG")) {
                    c4 = 'l';
                    break;
                }
                c4 = 65535;
                break;
            case 2397:
                if (str.equals("KH")) {
                    c4 = 'm';
                    break;
                }
                c4 = 65535;
                break;
            case 2398:
                if (str.equals("KI")) {
                    c4 = 'n';
                    break;
                }
                c4 = 65535;
                break;
            case 2402:
                if (str.equals("KM")) {
                    c4 = 'o';
                    break;
                }
                c4 = 65535;
                break;
            case 2403:
                if (str.equals("KN")) {
                    c4 = 'p';
                    break;
                }
                c4 = 65535;
                break;
            case 2405:
                if (str.equals("KP")) {
                    c4 = 'q';
                    break;
                }
                c4 = 65535;
                break;
            case 2407:
                if (str.equals("KR")) {
                    c4 = 'r';
                    break;
                }
                c4 = 65535;
                break;
            case 2412:
                if (str.equals("KW")) {
                    c4 = 's';
                    break;
                }
                c4 = 65535;
                break;
            case 2414:
                if (str.equals("KY")) {
                    c4 = 't';
                    break;
                }
                c4 = 65535;
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c4 = 'u';
                    break;
                }
                c4 = 65535;
                break;
            case 2421:
                if (str.equals("LA")) {
                    c4 = 'v';
                    break;
                }
                c4 = 65535;
                break;
            case 2422:
                if (str.equals("LB")) {
                    c4 = 'w';
                    break;
                }
                c4 = 65535;
                break;
            case 2423:
                if (str.equals("LC")) {
                    c4 = 'x';
                    break;
                }
                c4 = 65535;
                break;
            case 2429:
                if (str.equals("LI")) {
                    c4 = 'y';
                    break;
                }
                c4 = 65535;
                break;
            case 2431:
                if (str.equals("LK")) {
                    c4 = 'z';
                    break;
                }
                c4 = 65535;
                break;
            case 2438:
                if (str.equals("LR")) {
                    c4 = '{';
                    break;
                }
                c4 = 65535;
                break;
            case 2439:
                if (str.equals("LS")) {
                    c4 = '|';
                    break;
                }
                c4 = 65535;
                break;
            case 2440:
                if (str.equals("LT")) {
                    c4 = '}';
                    break;
                }
                c4 = 65535;
                break;
            case 2441:
                if (str.equals("LU")) {
                    c4 = '~';
                    break;
                }
                c4 = 65535;
                break;
            case 2442:
                if (str.equals("LV")) {
                    c4 = 127;
                    break;
                }
                c4 = 65535;
                break;
            case 2445:
                if (str.equals("LY")) {
                    c4 = 128;
                    break;
                }
                c4 = 65535;
                break;
            case 2452:
                if (str.equals("MA")) {
                    c4 = 129;
                    break;
                }
                c4 = 65535;
                break;
            case 2454:
                if (str.equals("MC")) {
                    c4 = 130;
                    break;
                }
                c4 = 65535;
                break;
            case 2455:
                if (str.equals("MD")) {
                    c4 = 131;
                    break;
                }
                c4 = 65535;
                break;
            case 2456:
                if (str.equals("ME")) {
                    c4 = 132;
                    break;
                }
                c4 = 65535;
                break;
            case 2457:
                if (str.equals("MF")) {
                    c4 = 133;
                    break;
                }
                c4 = 65535;
                break;
            case 2458:
                if (str.equals("MG")) {
                    c4 = 134;
                    break;
                }
                c4 = 65535;
                break;
            case 2459:
                if (str.equals("MH")) {
                    c4 = 135;
                    break;
                }
                c4 = 65535;
                break;
            case 2462:
                if (str.equals("MK")) {
                    c4 = 136;
                    break;
                }
                c4 = 65535;
                break;
            case 2463:
                if (str.equals("ML")) {
                    c4 = 137;
                    break;
                }
                c4 = 65535;
                break;
            case 2464:
                if (str.equals("MM")) {
                    c4 = 138;
                    break;
                }
                c4 = 65535;
                break;
            case 2465:
                if (str.equals("MN")) {
                    c4 = 139;
                    break;
                }
                c4 = 65535;
                break;
            case 2466:
                if (str.equals("MO")) {
                    c4 = 140;
                    break;
                }
                c4 = 65535;
                break;
            case 2467:
                if (str.equals("MP")) {
                    c4 = 141;
                    break;
                }
                c4 = 65535;
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c4 = 142;
                    break;
                }
                c4 = 65535;
                break;
            case 2469:
                if (str.equals("MR")) {
                    c4 = 143;
                    break;
                }
                c4 = 65535;
                break;
            case 2470:
                if (str.equals("MS")) {
                    c4 = 144;
                    break;
                }
                c4 = 65535;
                break;
            case 2471:
                if (str.equals("MT")) {
                    c4 = 145;
                    break;
                }
                c4 = 65535;
                break;
            case 2472:
                if (str.equals("MU")) {
                    c4 = 146;
                    break;
                }
                c4 = 65535;
                break;
            case 2473:
                if (str.equals("MV")) {
                    c4 = 147;
                    break;
                }
                c4 = 65535;
                break;
            case 2474:
                if (str.equals("MW")) {
                    c4 = 148;
                    break;
                }
                c4 = 65535;
                break;
            case 2475:
                if (str.equals("MX")) {
                    c4 = 149;
                    break;
                }
                c4 = 65535;
                break;
            case 2476:
                if (str.equals("MY")) {
                    c4 = 150;
                    break;
                }
                c4 = 65535;
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c4 = 151;
                    break;
                }
                c4 = 65535;
                break;
            case 2483:
                if (str.equals("NA")) {
                    c4 = 152;
                    break;
                }
                c4 = 65535;
                break;
            case 2485:
                if (str.equals("NC")) {
                    c4 = 153;
                    break;
                }
                c4 = 65535;
                break;
            case 2487:
                if (str.equals("NE")) {
                    c4 = 154;
                    break;
                }
                c4 = 65535;
                break;
            case 2489:
                if (str.equals("NG")) {
                    c4 = 155;
                    break;
                }
                c4 = 65535;
                break;
            case 2491:
                if (str.equals("NI")) {
                    c4 = 156;
                    break;
                }
                c4 = 65535;
                break;
            case 2494:
                if (str.equals("NL")) {
                    c4 = 157;
                    break;
                }
                c4 = 65535;
                break;
            case 2497:
                if (str.equals("NO")) {
                    c4 = 158;
                    break;
                }
                c4 = 65535;
                break;
            case 2498:
                if (str.equals("NP")) {
                    c4 = 159;
                    break;
                }
                c4 = 65535;
                break;
            case e.b.f17432p /* 2500 */:
                if (str.equals("NR")) {
                    c4 = 160;
                    break;
                }
                c4 = 65535;
                break;
            case 2503:
                if (str.equals("NU")) {
                    c4 = 161;
                    break;
                }
                c4 = 65535;
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c4 = 162;
                    break;
                }
                c4 = 65535;
                break;
            case 2526:
                if (str.equals("OM")) {
                    c4 = 163;
                    break;
                }
                c4 = 65535;
                break;
            case 2545:
                if (str.equals("PA")) {
                    c4 = 164;
                    break;
                }
                c4 = 65535;
                break;
            case 2549:
                if (str.equals("PE")) {
                    c4 = 165;
                    break;
                }
                c4 = 65535;
                break;
            case 2550:
                if (str.equals("PF")) {
                    c4 = 166;
                    break;
                }
                c4 = 65535;
                break;
            case 2551:
                if (str.equals("PG")) {
                    c4 = 167;
                    break;
                }
                c4 = 65535;
                break;
            case 2552:
                if (str.equals("PH")) {
                    c4 = 168;
                    break;
                }
                c4 = 65535;
                break;
            case 2555:
                if (str.equals("PK")) {
                    c4 = 169;
                    break;
                }
                c4 = 65535;
                break;
            case 2556:
                if (str.equals("PL")) {
                    c4 = 170;
                    break;
                }
                c4 = 65535;
                break;
            case 2557:
                if (str.equals("PM")) {
                    c4 = 171;
                    break;
                }
                c4 = 65535;
                break;
            case 2562:
                if (str.equals("PR")) {
                    c4 = 172;
                    break;
                }
                c4 = 65535;
                break;
            case 2563:
                if (str.equals("PS")) {
                    c4 = 173;
                    break;
                }
                c4 = 65535;
                break;
            case 2564:
                if (str.equals("PT")) {
                    c4 = 174;
                    break;
                }
                c4 = 65535;
                break;
            case 2567:
                if (str.equals("PW")) {
                    c4 = 175;
                    break;
                }
                c4 = 65535;
                break;
            case 2576:
                if (str.equals("QA")) {
                    c4 = 176;
                    break;
                }
                c4 = 65535;
                break;
            case 2611:
                if (str.equals("RE")) {
                    c4 = 177;
                    break;
                }
                c4 = 65535;
                break;
            case 2621:
                if (str.equals("RO")) {
                    c4 = 178;
                    break;
                }
                c4 = 65535;
                break;
            case 2625:
                if (str.equals("RS")) {
                    c4 = 179;
                    break;
                }
                c4 = 65535;
                break;
            case 2627:
                if (str.equals("RU")) {
                    c4 = 180;
                    break;
                }
                c4 = 65535;
                break;
            case 2629:
                if (str.equals("RW")) {
                    c4 = 181;
                    break;
                }
                c4 = 65535;
                break;
            case 2638:
                if (str.equals("SA")) {
                    c4 = 182;
                    break;
                }
                c4 = 65535;
                break;
            case 2639:
                if (str.equals("SB")) {
                    c4 = 183;
                    break;
                }
                c4 = 65535;
                break;
            case 2640:
                if (str.equals("SC")) {
                    c4 = 184;
                    break;
                }
                c4 = 65535;
                break;
            case 2641:
                if (str.equals("SD")) {
                    c4 = 185;
                    break;
                }
                c4 = 65535;
                break;
            case 2642:
                if (str.equals("SE")) {
                    c4 = 186;
                    break;
                }
                c4 = 65535;
                break;
            case 2644:
                if (str.equals("SG")) {
                    c4 = 187;
                    break;
                }
                c4 = 65535;
                break;
            case 2645:
                if (str.equals("SH")) {
                    c4 = 188;
                    break;
                }
                c4 = 65535;
                break;
            case 2646:
                if (str.equals("SI")) {
                    c4 = 189;
                    break;
                }
                c4 = 65535;
                break;
            case 2648:
                if (str.equals("SK")) {
                    c4 = 190;
                    break;
                }
                c4 = 65535;
                break;
            case 2649:
                if (str.equals("SL")) {
                    c4 = 191;
                    break;
                }
                c4 = 65535;
                break;
            case 2650:
                if (str.equals("SM")) {
                    c4 = 192;
                    break;
                }
                c4 = 65535;
                break;
            case 2651:
                if (str.equals("SN")) {
                    c4 = 193;
                    break;
                }
                c4 = 65535;
                break;
            case 2652:
                if (str.equals("SO")) {
                    c4 = 194;
                    break;
                }
                c4 = 65535;
                break;
            case 2655:
                if (str.equals("SR")) {
                    c4 = 195;
                    break;
                }
                c4 = 65535;
                break;
            case 2656:
                if (str.equals("SS")) {
                    c4 = 196;
                    break;
                }
                c4 = 65535;
                break;
            case 2657:
                if (str.equals("ST")) {
                    c4 = 197;
                    break;
                }
                c4 = 65535;
                break;
            case 2659:
                if (str.equals("SV")) {
                    c4 = 198;
                    break;
                }
                c4 = 65535;
                break;
            case 2661:
                if (str.equals("SX")) {
                    c4 = 199;
                    break;
                }
                c4 = 65535;
                break;
            case 2662:
                if (str.equals("SY")) {
                    c4 = 200;
                    break;
                }
                c4 = 65535;
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c4 = 201;
                    break;
                }
                c4 = 65535;
                break;
            case 2671:
                if (str.equals("TC")) {
                    c4 = 202;
                    break;
                }
                c4 = 65535;
                break;
            case 2672:
                if (str.equals("TD")) {
                    c4 = 203;
                    break;
                }
                c4 = 65535;
                break;
            case 2675:
                if (str.equals("TG")) {
                    c4 = 204;
                    break;
                }
                c4 = 65535;
                break;
            case 2676:
                if (str.equals("TH")) {
                    c4 = 205;
                    break;
                }
                c4 = 65535;
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c4 = 206;
                    break;
                }
                c4 = 65535;
                break;
            case 2679:
                if (str.equals("TK")) {
                    c4 = 207;
                    break;
                }
                c4 = 65535;
                break;
            case 2680:
                if (str.equals("TL")) {
                    c4 = 208;
                    break;
                }
                c4 = 65535;
                break;
            case 2681:
                if (str.equals("TM")) {
                    c4 = 209;
                    break;
                }
                c4 = 65535;
                break;
            case 2682:
                if (str.equals("TN")) {
                    c4 = 210;
                    break;
                }
                c4 = 65535;
                break;
            case 2683:
                if (str.equals("TO")) {
                    c4 = 211;
                    break;
                }
                c4 = 65535;
                break;
            case 2686:
                if (str.equals("TR")) {
                    c4 = 212;
                    break;
                }
                c4 = 65535;
                break;
            case 2688:
                if (str.equals("TT")) {
                    c4 = 213;
                    break;
                }
                c4 = 65535;
                break;
            case 2690:
                if (str.equals("TV")) {
                    c4 = 214;
                    break;
                }
                c4 = 65535;
                break;
            case 2691:
                if (str.equals("TW")) {
                    c4 = 215;
                    break;
                }
                c4 = 65535;
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c4 = 216;
                    break;
                }
                c4 = 65535;
                break;
            case 2700:
                if (str.equals("UA")) {
                    c4 = 217;
                    break;
                }
                c4 = 65535;
                break;
            case 2706:
                if (str.equals("UG")) {
                    c4 = 218;
                    break;
                }
                c4 = 65535;
                break;
            case 2718:
                if (str.equals("US")) {
                    c4 = 219;
                    break;
                }
                c4 = 65535;
                break;
            case 2724:
                if (str.equals("UY")) {
                    c4 = 220;
                    break;
                }
                c4 = 65535;
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c4 = 221;
                    break;
                }
                c4 = 65535;
                break;
            case 2731:
                if (str.equals("VA")) {
                    c4 = 222;
                    break;
                }
                c4 = 65535;
                break;
            case 2733:
                if (str.equals("VC")) {
                    c4 = 223;
                    break;
                }
                c4 = 65535;
                break;
            case 2735:
                if (str.equals("VE")) {
                    c4 = 224;
                    break;
                }
                c4 = 65535;
                break;
            case 2737:
                if (str.equals("VG")) {
                    c4 = 225;
                    break;
                }
                c4 = 65535;
                break;
            case 2739:
                if (str.equals("VI")) {
                    c4 = 226;
                    break;
                }
                c4 = 65535;
                break;
            case 2744:
                if (str.equals("VN")) {
                    c4 = 227;
                    break;
                }
                c4 = 65535;
                break;
            case 2751:
                if (str.equals("VU")) {
                    c4 = 228;
                    break;
                }
                c4 = 65535;
                break;
            case 2767:
                if (str.equals("WF")) {
                    c4 = 229;
                    break;
                }
                c4 = 65535;
                break;
            case 2780:
                if (str.equals("WS")) {
                    c4 = 230;
                    break;
                }
                c4 = 65535;
                break;
            case 2803:
                if (str.equals("XK")) {
                    c4 = 231;
                    break;
                }
                c4 = 65535;
                break;
            case 2828:
                if (str.equals("YE")) {
                    c4 = 232;
                    break;
                }
                c4 = 65535;
                break;
            case 2843:
                if (str.equals("YT")) {
                    c4 = 233;
                    break;
                }
                c4 = 65535;
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c4 = 234;
                    break;
                }
                c4 = 65535;
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c4 = 235;
                    break;
                }
                c4 = 65535;
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c4 = 236;
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
            case 26:
            case 29:
            case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY /* 73 */:
            case 'O':
            case InterfaceC1490j3.d.b.f16818j /* 112 */:
            case 't':
            case 'x':
            case 223:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 4, 0};
            case 2:
            case 'P':
                return new int[]{4, 3, 3, 4, 2, 2};
            case 3:
                return new int[]{2, 4, 1, 2, 2, 2};
            case 4:
                return new int[]{0, 2, 0, 3, 2, 2};
            case 5:
            case 231:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 3, 2, 2, 2};
            case '\b':
            case IronSourceConstants.RETRY_LIMIT /* 62 */:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
            case 'l':
            case 210:
            case 220:
                return new int[]{2, 1, 1, 1, 2, 2};
            case '\n':
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
                return new int[]{1, 0, 1, 1, 0, 0};
            case '\f':
                return new int[]{0, 1, 1, 1, 2, 0};
            case '\r':
                return new int[]{1, 3, 4, 4, 2, 2};
            case 14:
            case 'y':
            case 144:
            case 171:
            case 192:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 'K':
            case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
            case 169:
            case 194:
            case 211:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 16:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 17:
            case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
            case 'E':
            case 'N':
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 145:
            case 190:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 1, 3, 4, 2};
            case ConnectionResult.API_DISABLED /* 23 */:
            case '[':
            case InterfaceC1490j3.d.b.f16817i /* 111 */:
            case 134:
            case 154:
            case 185:
            case InterfaceC1490j3.c.b.f16803d /* 203 */:
            case 224:
            case 232:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 25:
            case '2':
            case 222:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 27:
            case '1':
                return new int[]{2, 2, 0, 0, 2, 2};
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new int[]{1, 2, 3, 2, 2, 2};
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new int[]{4, 4, 2, 2, 2, 2};
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new int[]{3, 1, 3, 2, 2, 2};
            case ' ':
                return new int[]{3, 2, 1, 0, 2, 2};
            case '!':
                return new int[]{0, 1, 2, 3, 2, 2};
            case '\"':
                return new int[]{2, 4, 2, 1, 2, 2};
            case C3139z9.f40333J /* 35 */:
                return new int[]{0, 2, 2, 2, 3, 2};
            case '$':
                return new int[]{4, 2, 3, 2, 2, 2};
            case '%':
            case InterfaceC1490j3.d.b.f16816h /* 110 */:
                return new int[]{4, 2, 4, 2, 2, 2};
            case C3139z9.f40334K /* 38 */:
            case '=':
            case 'W':
                return new int[]{3, 4, 3, 3, 2, 2};
            case '\'':
                return new int[]{0, 0, 0, 1, 0, 2};
            case '(':
            case ':':
            case '{':
                return new int[]{3, 4, 4, 4, 2, 2};
            case ')':
            case 166:
                return new int[]{2, 2, 2, 1, 2, 2};
            case '*':
            case '_':
                return new int[]{1, 2, 2, 2, 3, 2};
            case '+':
                return new int[]{3, 3, 3, 3, 2, 2};
            case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                return new int[]{2, 0, 1, 1, 3, 2};
            case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                return new int[]{2, 3, 4, 3, 2, 2};
            case '.':
                return new int[]{2, 3, 4, 4, 2, 2};
            case '/':
            case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
            case 200:
            case InterfaceC1490j3.c.b.f16806g /* 206 */:
            case 208:
                return new int[]{4, 3, 4, 4, 2, 2};
            case '0':
                return new int[]{2, 1, 0, 0, 2, 2};
            case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
            case BuildConfig.API_LEVEL /* 115 */:
                return new int[]{1, 0, 0, 0, 0, 2};
            case IronSourceConstants.SET_USER_ID /* 52 */:
            case 158:
                return new int[]{0, 0, 2, 0, 1, 2};
            case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                return new int[]{0, 1, 2, 2, 2, 3};
            case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                return new int[]{0, 0, 3, 2, 0, 2};
            case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                return new int[]{3, 4, 4, 4, 4, 2};
            case ';':
                return new int[]{2, 3, 2, 1, 2, 2};
            case '<':
            case InterfaceC1490j3.d.b.f16810b /* 101 */:
            case 127:
            case 174:
            case 186:
            case 215:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '?':
            case '^':
                return new int[]{0, 1, 1, 1, 2, 2};
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                return new int[]{4, 3, 3, 1, 2, 2};
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                return new int[]{0, 0, 0, 3, 0, 2};
            case 'B':
                return new int[]{3, 1, 2, 2, 2, 2};
            case 'C':
            case 'k':
            case 'q':
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'D':
                return new int[]{4, 2, 4, 1, 2, 2};
            case IronSourceConstants.TEST_SUITE_LAUNCH_TS /* 70 */:
                return new int[]{1, 2, 3, 1, 0, 2};
            case IronSourceConstants.TEST_SUITE_OPENED_SUCCESSFULLY /* 71 */:
            case InterfaceC1490j3.c.b.f16804e /* 204 */:
                return new int[]{3, 4, 1, 0, 2, 2};
            case IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN /* 72 */:
                return new int[]{0, 0, 1, 1, 1, 1};
            case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD /* 74 */:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 'L':
            case 226:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'M':
            case 152:
            case 228:
                return new int[]{3, 3, 3, 2, 2, 2};
            case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT /* 81 */:
                return new int[]{4, 3, 4, 2, 2, 2};
            case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT /* 82 */:
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT /* 83 */:
                return new int[]{4, 2, 1, 4, 2, 2};
            case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST /* 84 */:
            case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
            case 189:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 'U':
                return new int[]{2, 3, 2, 2, 2, 2};
            case 'V':
            case 165:
                return new int[]{1, 2, 4, 4, 4, 2};
            case 'X':
                return new int[]{3, 2, 2, 1, 2, 2};
            case 'Y':
                return new int[]{0, 1, 2, 3, 2, 0};
            case '\\':
                return new int[]{0, 0, 0, 1, 3, 2};
            case ']':
                return new int[]{3, 1, 2, 2, 3, 2};
            case '`':
            case 217:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 'a':
                return new int[]{1, 1, 3, 2, 3, 3};
            case 'b':
            case 135:
            case 214:
            case 229:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 'c':
                return new int[]{3, 2, 2, 3, 2, 2};
            case 'd':
                return new int[]{3, 0, 1, 1, 4, 1};
            case 'f':
                return new int[]{0, 0, 0, 1, 1, 2};
            case InterfaceC1490j3.d.b.f16812d /* 103 */:
            case 233:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 'h':
                return new int[]{2, 4, 3, 2, 2, 2};
            case 'i':
                return new int[]{2, 1, 1, 2, 2, 2};
            case 'j':
                return new int[]{0, 1, 1, 2, 2, 4};
            case InterfaceC1490j3.d.b.f16815g /* 109 */:
                return new int[]{2, 1, 4, 2, 2, 2};
            case IronSourceConstants.FIRST_INSTANCE_RESULT /* 114 */:
                return new int[]{0, 1, 1, 3, 4, 4};
            case 'u':
                return new int[]{2, 1, 2, 2, 2, 2};
            case 'v':
                return new int[]{1, 2, 1, 3, 2, 2};
            case 'w':
                return new int[]{3, 3, 2, 4, 2, 2};
            case 'z':
                return new int[]{3, 1, 3, 3, 4, 2};
            case '|':
                return new int[]{3, 3, 2, 2, 2, 2};
            case '}':
                return new int[]{0, 0, 0, 0, 2, 2};
            case '~':
                return new int[]{1, 0, 3, 2, 1, 4};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 130:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 131:
            case 179:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 2, 2};
            case 133:
            case 177:
                return new int[]{1, 2, 1, 2, 2, 2};
            case 136:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 137:
            case 167:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 138:
                return new int[]{2, 4, 2, 3, 2, 2};
            case 139:
                return new int[]{2, 0, 1, 2, 2, 2};
            case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT /* 140 */:
            case ModuleDescriptor.MODULE_VERSION /* 141 */:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 143:
            case 236:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 146:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 147:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 148:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 149:
                return new int[]{2, 4, 3, 4, 2, 2};
            case IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED /* 150 */:
                return new int[]{1, 0, 3, 1, 3, 2};
            case 151:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 153:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 155:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 156:
            case 164:
            case 198:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 157:
                return new int[]{0, 2, 2, 3, 0, 3};
            case 159:
                return new int[]{2, 2, 4, 3, 2, 2};
            case 160:
            case 161:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 162:
            case 170:
                return new int[]{1, 1, 2, 2, 4, 2};
            case 163:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 168:
                return new int[]{2, 1, 3, 3, 3, 0};
            case 172:
                return new int[]{2, 0, 2, 1, 2, 1};
            case 173:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 176:
                return new int[]{2, 4, 4, 4, 4, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case 180:
                return new int[]{1, 0, 0, 0, 4, 3};
            case 181:
                return new int[]{3, 4, 2, 0, 2, 2};
            case 182:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 183:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 184:
            case 209:
                return new int[]{4, 2, 1, 1, 2, 2};
            case 187:
                return new int[]{1, 1, 2, 2, 2, 1};
            case 191:
            case 218:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 193:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 195:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 196:
                return new int[]{4, 3, 2, 3, 2, 2};
            case 197:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 199:
            case InterfaceC1490j3.c.b.f16802c /* 202 */:
                return new int[]{1, 2, 1, 0, 2, 2};
            case InterfaceC1490j3.c.b.f16801b /* 201 */:
                return new int[]{3, 3, 3, 4, 2, 2};
            case InterfaceC1490j3.c.b.f16805f /* 205 */:
                return new int[]{0, 2, 2, 3, 3, 4};
            case InterfaceC1490j3.c.b.f16807h /* 207 */:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 212:
                return new int[]{1, 1, 0, 0, 2, 2};
            case 213:
                return new int[]{1, 4, 1, 3, 2, 2};
            case 216:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 219:
                return new int[]{1, 0, 2, 2, 3, 1};
            case 221:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 225:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 227:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 230:
                return new int[]{3, 1, 3, 1, 2, 2};
            case 234:
                return new int[]{3, 2, 2, 1, 1, 2};
            case 235:
                return new int[]{3, 3, 4, 2, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    @Override // com.yandex.mobile.ads.impl.s62
    public final synchronized void b(mv mvVar, boolean z4) {
        if (z4) {
            try {
                if ((mvVar.f29247i & 8) != 8) {
                    if (this.f35377f == 0) {
                        this.f35378g = this.f35375d.b();
                    }
                    this.f35377f++;
                }
            } finally {
            }
        }
    }

    private long a(int i4) {
        Long l4 = this.f35372a.get(Integer.valueOf(i4));
        if (l4 == null) {
            l4 = this.f35372a.get(0);
        }
        if (l4 == null) {
            l4 = 1000000L;
        }
        return l4.longValue();
    }

    @Override // com.yandex.mobile.ads.impl.s62
    public final synchronized void a(mv mvVar, boolean z4, int i4) {
        if (z4) {
            if ((mvVar.f29247i & 8) != 8) {
                this.f35379h += i4;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.s62
    public final synchronized void a(mv mvVar, boolean z4) {
        long j4;
        long j5;
        if (z4) {
            try {
                if ((mvVar.f29247i & 8) != 8) {
                    if (this.f35377f > 0) {
                        long b4 = this.f35375d.b();
                        int i4 = (int) (b4 - this.f35378g);
                        this.f35381j += i4;
                        long j6 = this.f35382k;
                        long j7 = this.f35379h;
                        this.f35382k = j6 + j7;
                        if (i4 > 0) {
                            this.f35374c.a((int) Math.sqrt(j7), (j7 * 8000.0f) / i4);
                            if (this.f35381j < 2000) {
                                if (this.f35382k >= 524288) {
                                }
                                j4 = this.f35379h;
                                j5 = this.f35383l;
                                if (i4 == 0 || j4 != 0 || j5 != this.f35384m) {
                                    this.f35384m = j5;
                                    this.f35373b.a(i4, j4, j5);
                                }
                                this.f35378g = b4;
                                this.f35379h = 0L;
                            }
                            this.f35383l = (long) this.f35374c.a();
                            j4 = this.f35379h;
                            j5 = this.f35383l;
                            if (i4 == 0) {
                            }
                            this.f35384m = j5;
                            this.f35373b.a(i4, j4, j5);
                            this.f35378g = b4;
                            this.f35379h = 0L;
                        }
                        this.f35377f--;
                        return;
                    }
                    throw new IllegalStateException();
                }
            } finally {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1881di
    public final void a(InterfaceC2296vc interfaceC2296vc) {
        this.f35373b.a(interfaceC2296vc);
    }

    public static synchronized yy a(Context context) {
        yy yyVar;
        synchronized (yy.class) {
            try {
                if (f35371t == null) {
                    f35371t = new yy(context == null ? null : context.getApplicationContext(), a.a(u82.b(context)), 2000, wo.f34156a, true);
                }
                yyVar = f35371t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yyVar;
    }
}
