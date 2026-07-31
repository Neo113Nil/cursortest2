package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j94 implements a94, vt1 {

    /* renamed from: s, reason: collision with root package name */
    public static final g73<String, Integer> f7036s;

    /* renamed from: t, reason: collision with root package name */
    public static final e73<Long> f7037t;

    /* renamed from: u, reason: collision with root package name */
    public static final e73<Long> f7038u;

    /* renamed from: v, reason: collision with root package name */
    public static final e73<Long> f7039v;

    /* renamed from: w, reason: collision with root package name */
    public static final e73<Long> f7040w;

    /* renamed from: x, reason: collision with root package name */
    public static final e73<Long> f7041x;

    /* renamed from: y, reason: collision with root package name */
    public static final e73<Long> f7042y;

    /* renamed from: z, reason: collision with root package name */
    private static j94 f7043z;

    /* renamed from: f, reason: collision with root package name */
    private final i73<Integer, Long> f7044f;

    /* renamed from: i, reason: collision with root package name */
    private final xv1 f7047i;

    /* renamed from: k, reason: collision with root package name */
    private int f7049k;

    /* renamed from: l, reason: collision with root package name */
    private long f7050l;

    /* renamed from: m, reason: collision with root package name */
    private long f7051m;

    /* renamed from: n, reason: collision with root package name */
    private int f7052n;

    /* renamed from: o, reason: collision with root package name */
    private long f7053o;

    /* renamed from: p, reason: collision with root package name */
    private long f7054p;

    /* renamed from: q, reason: collision with root package name */
    private long f7055q;

    /* renamed from: r, reason: collision with root package name */
    private long f7056r;

    /* renamed from: g, reason: collision with root package name */
    private final y84 f7045g = new y84();

    /* renamed from: h, reason: collision with root package name */
    private final ha4 f7046h = new ha4(2000);

    /* renamed from: j, reason: collision with root package name */
    private final boolean f7048j = true;

    static {
        f73 f73Var = new f73();
        f73Var.a("AD", 1, 2, 0, 0, 2, 2);
        f73Var.a("AE", 1, 4, 4, 4, 3, 2);
        f73Var.a("AF", 4, 4, 4, 4, 2, 2);
        f73Var.a("AG", 2, 3, 1, 2, 2, 2);
        f73Var.a("AI", 1, 2, 2, 2, 2, 2);
        f73Var.a("AL", 1, 2, 0, 1, 2, 2);
        f73Var.a("AM", 2, 3, 2, 4, 2, 2);
        f73Var.a("AO", 3, 4, 3, 2, 2, 2);
        f73Var.a("AQ", 4, 2, 2, 2, 2, 2);
        f73Var.a("AR", 2, 4, 1, 1, 2, 2);
        f73Var.a("AS", 2, 2, 2, 3, 2, 2);
        f73Var.a("AT", 0, 0, 0, 0, 0, 2);
        f73Var.a("AU", 0, 1, 0, 1, 2, 2);
        f73Var.a("AW", 1, 2, 4, 4, 2, 2);
        f73Var.a("AX", 0, 2, 2, 2, 2, 2);
        f73Var.a("AZ", 3, 2, 4, 4, 2, 2);
        f73Var.a("BA", 1, 2, 0, 1, 2, 2);
        f73Var.a("BB", 0, 2, 0, 0, 2, 2);
        f73Var.a("BD", 2, 1, 3, 3, 2, 2);
        f73Var.a("BE", 0, 0, 3, 3, 2, 2);
        f73Var.a("BF", 4, 3, 4, 3, 2, 2);
        f73Var.a("BG", 0, 0, 0, 0, 1, 2);
        f73Var.a("BH", 1, 2, 2, 4, 4, 2);
        f73Var.a("BI", 4, 3, 4, 4, 2, 2);
        f73Var.a("BJ", 4, 4, 3, 4, 2, 2);
        f73Var.a("BL", 1, 2, 2, 2, 2, 2);
        f73Var.a("BM", 1, 2, 0, 0, 2, 2);
        f73Var.a("BN", 3, 2, 1, 1, 2, 2);
        f73Var.a("BO", 1, 3, 3, 2, 2, 2);
        f73Var.a("BQ", 1, 2, 2, 0, 2, 2);
        f73Var.a("BR", 2, 3, 2, 2, 2, 2);
        f73Var.a("BS", 4, 2, 2, 3, 2, 2);
        f73Var.a("BT", 3, 1, 3, 2, 2, 2);
        f73Var.a("BW", 3, 4, 1, 0, 2, 2);
        f73Var.a("BY", 0, 1, 1, 3, 2, 2);
        f73Var.a("BZ", 2, 4, 2, 2, 2, 2);
        f73Var.a("CA", 0, 2, 1, 2, 4, 1);
        f73Var.a("CD", 4, 2, 3, 1, 2, 2);
        f73Var.a("CF", 4, 2, 3, 2, 2, 2);
        f73Var.a("CG", 2, 4, 3, 4, 2, 2);
        f73Var.a("CH", 0, 0, 0, 0, 0, 2);
        f73Var.a("CI", 3, 3, 3, 4, 2, 2);
        f73Var.a("CK", 2, 2, 2, 1, 2, 2);
        f73Var.a("CL", 1, 1, 2, 2, 3, 2);
        f73Var.a("CM", 3, 4, 3, 2, 2, 2);
        f73Var.a("CN", 2, 0, 2, 2, 3, 1);
        f73Var.a("CO", 2, 2, 4, 2, 2, 2);
        f73Var.a("CR", 2, 2, 4, 4, 2, 2);
        f73Var.a("CU", 4, 4, 3, 2, 2, 2);
        f73Var.a("CV", 2, 3, 1, 0, 2, 2);
        f73Var.a("CW", 2, 2, 0, 0, 2, 2);
        f73Var.a("CX", 1, 2, 2, 2, 2, 2);
        f73Var.a("CY", 1, 0, 0, 0, 1, 2);
        f73Var.a("CZ", 0, 0, 0, 0, 1, 2);
        f73Var.a("DE", 0, 0, 2, 2, 1, 2);
        f73Var.a("DJ", 4, 1, 4, 4, 2, 2);
        f73Var.a("DK", 0, 0, 1, 0, 0, 2);
        f73Var.a("DM", 1, 2, 2, 2, 2, 2);
        f73Var.a("DO", 3, 4, 4, 4, 2, 2);
        f73Var.a("DZ", 4, 3, 4, 4, 2, 2);
        f73Var.a("EC", 2, 4, 2, 1, 2, 2);
        f73Var.a("EE", 0, 0, 0, 0, 2, 2);
        f73Var.a("EG", 3, 4, 2, 3, 2, 2);
        f73Var.a("EH", 2, 2, 2, 2, 2, 2);
        f73Var.a("ER", 4, 2, 2, 2, 2, 2);
        f73Var.a("ES", 0, 1, 1, 1, 2, 2);
        f73Var.a("ET", 4, 4, 3, 1, 2, 2);
        f73Var.a("FI", 0, 0, 0, 1, 0, 2);
        f73Var.a("FJ", 3, 1, 3, 3, 2, 2);
        f73Var.a("FK", 3, 2, 2, 2, 2, 2);
        f73Var.a("FM", 3, 2, 4, 2, 2, 2);
        f73Var.a("FO", 0, 2, 0, 0, 2, 2);
        f73Var.a("FR", 1, 1, 2, 1, 1, 1);
        f73Var.a("GA", 2, 3, 1, 1, 2, 2);
        f73Var.a("GB", 0, 0, 1, 1, 2, 3);
        f73Var.a("GD", 1, 2, 2, 2, 2, 2);
        f73Var.a("GE", 1, 1, 1, 3, 2, 2);
        f73Var.a("GF", 2, 1, 2, 3, 2, 2);
        f73Var.a("GG", 0, 2, 0, 0, 2, 2);
        f73Var.a("GH", 3, 2, 3, 2, 2, 2);
        f73Var.a("GI", 0, 2, 2, 2, 2, 2);
        f73Var.a("GL", 1, 2, 0, 0, 2, 2);
        f73Var.a("GM", 4, 2, 2, 4, 2, 2);
        f73Var.a("GN", 4, 3, 4, 2, 2, 2);
        f73Var.a("GP", 2, 1, 2, 3, 2, 2);
        f73Var.a("GQ", 4, 2, 3, 4, 2, 2);
        f73Var.a("GR", 1, 0, 0, 0, 2, 2);
        f73Var.a("GT", 2, 3, 2, 1, 2, 2);
        f73Var.a("GU", 1, 2, 4, 4, 2, 2);
        f73Var.a("GW", 3, 4, 3, 3, 2, 2);
        f73Var.a("GY", 3, 4, 1, 0, 2, 2);
        f73Var.a("HK", 0, 1, 2, 3, 2, 0);
        f73Var.a("HN", 3, 2, 3, 3, 2, 2);
        f73Var.a("HR", 1, 0, 0, 0, 2, 2);
        f73Var.a("HT", 4, 4, 4, 4, 2, 2);
        f73Var.a("HU", 0, 0, 0, 1, 3, 2);
        f73Var.a("ID", 3, 2, 3, 3, 3, 2);
        f73Var.a("IE", 0, 1, 1, 1, 2, 2);
        f73Var.a("IL", 1, 1, 2, 3, 4, 2);
        f73Var.a("IM", 0, 2, 0, 1, 2, 2);
        f73Var.a("IN", 1, 1, 3, 2, 4, 3);
        f73Var.a("IO", 4, 2, 2, 2, 2, 2);
        f73Var.a("IQ", 3, 3, 3, 3, 2, 2);
        f73Var.a("IR", 3, 0, 1, 1, 3, 0);
        f73Var.a("IS", 0, 0, 0, 0, 0, 2);
        f73Var.a("IT", 0, 1, 0, 1, 1, 2);
        f73Var.a("JE", 3, 2, 1, 2, 2, 2);
        f73Var.a("JM", 3, 4, 4, 4, 2, 2);
        f73Var.a("JO", 1, 0, 0, 1, 2, 2);
        f73Var.a("JP", 0, 1, 0, 1, 1, 1);
        f73Var.a("KE", 3, 3, 2, 2, 2, 2);
        f73Var.a("KG", 2, 1, 1, 1, 2, 2);
        f73Var.a("KH", 1, 1, 4, 2, 2, 2);
        f73Var.a("KI", 4, 2, 4, 3, 2, 2);
        f73Var.a("KM", 4, 2, 4, 3, 2, 2);
        f73Var.a("KN", 2, 2, 2, 2, 2, 2);
        f73Var.a("KP", 3, 2, 2, 2, 2, 2);
        f73Var.a("KR", 0, 0, 1, 3, 4, 4);
        f73Var.a("KW", 1, 1, 0, 0, 0, 2);
        f73Var.a("KY", 1, 2, 0, 1, 2, 2);
        f73Var.a("KZ", 1, 1, 2, 2, 2, 2);
        f73Var.a("LA", 2, 2, 1, 2, 2, 2);
        f73Var.a("LB", 3, 2, 1, 4, 2, 2);
        f73Var.a("LC", 1, 2, 0, 0, 2, 2);
        f73Var.a("LI", 0, 2, 2, 2, 2, 2);
        f73Var.a("LK", 3, 1, 3, 4, 4, 2);
        f73Var.a("LR", 3, 4, 4, 3, 2, 2);
        f73Var.a("LS", 3, 3, 4, 3, 2, 2);
        f73Var.a("LT", 0, 0, 0, 0, 2, 2);
        f73Var.a("LU", 1, 0, 2, 2, 2, 2);
        f73Var.a("LV", 0, 0, 0, 0, 2, 2);
        f73Var.a("LY", 4, 2, 4, 3, 2, 2);
        f73Var.a("MA", 3, 2, 2, 2, 2, 2);
        f73Var.a("MC", 0, 2, 2, 0, 2, 2);
        f73Var.a("MD", 1, 0, 0, 0, 2, 2);
        f73Var.a("ME", 1, 0, 0, 1, 2, 2);
        f73Var.a("MF", 1, 2, 1, 0, 2, 2);
        f73Var.a("MG", 3, 4, 2, 2, 2, 2);
        f73Var.a("MH", 3, 2, 2, 4, 2, 2);
        f73Var.a("MK", 1, 0, 0, 0, 2, 2);
        f73Var.a("ML", 4, 3, 3, 1, 2, 2);
        f73Var.a("MM", 2, 4, 3, 3, 2, 2);
        f73Var.a("MN", 2, 0, 1, 2, 2, 2);
        f73Var.a("MO", 0, 2, 4, 4, 2, 2);
        f73Var.a("MP", 0, 2, 2, 2, 2, 2);
        f73Var.a("MQ", 2, 1, 2, 3, 2, 2);
        f73Var.a("MR", 4, 1, 3, 4, 2, 2);
        f73Var.a("MS", 1, 2, 2, 2, 2, 2);
        f73Var.a("MT", 0, 0, 0, 0, 2, 2);
        f73Var.a("MU", 3, 1, 1, 2, 2, 2);
        f73Var.a("MV", 3, 4, 1, 4, 2, 2);
        f73Var.a("MW", 4, 2, 1, 0, 2, 2);
        f73Var.a("MX", 2, 4, 3, 4, 2, 2);
        f73Var.a("MY", 2, 1, 3, 3, 2, 2);
        f73Var.a("MZ", 3, 2, 2, 2, 2, 2);
        f73Var.a("NA", 4, 3, 2, 2, 2, 2);
        f73Var.a("NC", 3, 2, 4, 4, 2, 2);
        f73Var.a("NE", 4, 4, 4, 4, 2, 2);
        f73Var.a("NF", 2, 2, 2, 2, 2, 2);
        f73Var.a("NG", 3, 4, 1, 1, 2, 2);
        f73Var.a("NI", 2, 3, 4, 3, 2, 2);
        f73Var.a("NL", 0, 0, 3, 2, 0, 4);
        f73Var.a("NO", 0, 0, 2, 0, 0, 2);
        f73Var.a("NP", 2, 1, 4, 3, 2, 2);
        f73Var.a("NR", 3, 2, 2, 0, 2, 2);
        f73Var.a("NU", 4, 2, 2, 2, 2, 2);
        f73Var.a("NZ", 1, 0, 1, 2, 4, 2);
        f73Var.a("OM", 2, 3, 1, 3, 4, 2);
        f73Var.a("PA", 1, 3, 3, 3, 2, 2);
        f73Var.a("PE", 2, 3, 4, 4, 4, 2);
        f73Var.a("PF", 2, 3, 3, 1, 2, 2);
        f73Var.a("PG", 4, 4, 3, 2, 2, 2);
        f73Var.a("PH", 2, 2, 3, 3, 3, 2);
        f73Var.a("PK", 3, 2, 3, 3, 2, 2);
        f73Var.a("PL", 1, 1, 2, 2, 3, 2);
        f73Var.a("PM", 0, 2, 2, 2, 2, 2);
        f73Var.a("PR", 2, 3, 2, 2, 3, 3);
        f73Var.a("PS", 3, 4, 1, 2, 2, 2);
        f73Var.a("PT", 0, 1, 0, 0, 2, 2);
        f73Var.a("PW", 2, 2, 4, 1, 2, 2);
        f73Var.a("PY", 2, 2, 3, 2, 2, 2);
        f73Var.a("QA", 2, 4, 2, 4, 4, 2);
        f73Var.a("RE", 1, 1, 1, 2, 2, 2);
        f73Var.a("RO", 0, 0, 1, 1, 1, 2);
        f73Var.a("RS", 1, 0, 0, 0, 2, 2);
        f73Var.a("RU", 0, 0, 0, 1, 2, 2);
        f73Var.a("RW", 3, 4, 3, 0, 2, 2);
        f73Var.a("SA", 2, 2, 1, 1, 2, 2);
        f73Var.a("SB", 4, 2, 4, 3, 2, 2);
        f73Var.a("SC", 4, 3, 0, 2, 2, 2);
        f73Var.a("SD", 4, 4, 4, 4, 2, 2);
        f73Var.a("SE", 0, 0, 0, 0, 0, 2);
        f73Var.a("SG", 1, 1, 2, 3, 1, 4);
        f73Var.a("SH", 4, 2, 2, 2, 2, 2);
        f73Var.a("SI", 0, 0, 0, 0, 1, 2);
        f73Var.a("SJ", 0, 2, 2, 2, 2, 2);
        f73Var.a("SK", 0, 0, 0, 0, 0, 2);
        f73Var.a("SL", 4, 3, 4, 1, 2, 2);
        f73Var.a("SM", 0, 2, 2, 2, 2, 2);
        f73Var.a("SN", 4, 4, 4, 4, 2, 2);
        f73Var.a("SO", 3, 2, 3, 3, 2, 2);
        f73Var.a("SR", 2, 3, 2, 2, 2, 2);
        f73Var.a("SS", 4, 2, 2, 2, 2, 2);
        f73Var.a("ST", 3, 2, 2, 2, 2, 2);
        f73Var.a("SV", 2, 2, 3, 3, 2, 2);
        f73Var.a("SX", 2, 2, 1, 0, 2, 2);
        f73Var.a("SY", 4, 3, 4, 4, 2, 2);
        f73Var.a("SZ", 4, 3, 2, 4, 2, 2);
        f73Var.a("TC", 2, 2, 1, 0, 2, 2);
        f73Var.a("TD", 4, 4, 4, 4, 2, 2);
        f73Var.a("TG", 3, 3, 2, 0, 2, 2);
        f73Var.a("TH", 0, 3, 2, 3, 3, 0);
        f73Var.a("TJ", 4, 2, 4, 4, 2, 2);
        f73Var.a("TL", 4, 3, 4, 4, 2, 2);
        f73Var.a("TM", 4, 2, 4, 2, 2, 2);
        f73Var.a("TN", 2, 2, 1, 1, 2, 2);
        f73Var.a("TO", 4, 2, 3, 3, 2, 2);
        f73Var.a("TR", 1, 1, 0, 1, 2, 2);
        f73Var.a("TT", 1, 4, 1, 1, 2, 2);
        f73Var.a("TV", 4, 2, 2, 2, 2, 2);
        f73Var.a("TW", 0, 0, 0, 0, 0, 0);
        f73Var.a("TZ", 3, 4, 3, 3, 2, 2);
        f73Var.a("UA", 0, 3, 1, 1, 2, 2);
        f73Var.a("UG", 3, 3, 3, 3, 2, 2);
        f73Var.a("US", 1, 1, 2, 2, 3, 2);
        f73Var.a("UY", 2, 2, 1, 2, 2, 2);
        f73Var.a("UZ", 2, 2, 3, 4, 2, 2);
        f73Var.a("VC", 1, 2, 2, 2, 2, 2);
        f73Var.a("VE", 4, 4, 4, 4, 2, 2);
        f73Var.a("VG", 2, 2, 1, 1, 2, 2);
        f73Var.a("VI", 1, 2, 1, 3, 2, 2);
        f73Var.a("VN", 0, 3, 3, 4, 2, 2);
        f73Var.a("VU", 4, 2, 2, 1, 2, 2);
        f73Var.a("WF", 4, 2, 2, 4, 2, 2);
        f73Var.a("WS", 3, 1, 2, 1, 2, 2);
        f73Var.a("XK", 1, 1, 1, 1, 2, 2);
        f73Var.a("YE", 4, 4, 4, 4, 2, 2);
        f73Var.a("YT", 4, 1, 1, 1, 2, 2);
        f73Var.a("ZA", 3, 3, 1, 1, 1, 2);
        f73Var.a("ZM", 3, 3, 4, 2, 2, 2);
        f73Var.a("ZW", 3, 2, 4, 3, 2, 2);
        f7036s = f73Var.b();
        f7037t = e73.B(5400000L, 3300000L, 2000000L, 1300000L, 760000L);
        f7038u = e73.B(1700000L, 820000L, 450000L, 180000L, 130000L);
        f7039v = e73.B(2300000L, 1300000L, 1000000L, 820000L, 570000L);
        f7040w = e73.B(3400000L, 2000000L, 1400000L, 1000000L, 620000L);
        f7041x = e73.B(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);
        f7042y = e73.B(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);
    }

    /* synthetic */ j94(Context context, Map map, int i7, xv1 xv1Var, boolean z6, i94 i94Var) {
        this.f7044f = i73.c(map);
        this.f7047i = xv1Var;
        if (context == null) {
            this.f7052n = 0;
            this.f7055q = g(0);
            return;
        }
        bp2 b7 = bp2.b(context);
        int a7 = b7.a();
        this.f7052n = a7;
        this.f7055q = g(a7);
        b7.d(new h94(this));
    }

    public static synchronized j94 d(Context context) {
        j94 j94Var;
        synchronized (j94.class) {
            if (f7043z == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                e73<Integer> i7 = f7036s.i(n13.g(context));
                if (i7.isEmpty()) {
                    i7 = e73.C(2, 2, 2, 2, 2, 2);
                }
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                e73<Long> e73Var = f7037t;
                hashMap.put(2, e73Var.get(i7.get(0).intValue()));
                hashMap.put(3, f7038u.get(i7.get(1).intValue()));
                hashMap.put(4, f7039v.get(i7.get(2).intValue()));
                hashMap.put(5, f7040w.get(i7.get(3).intValue()));
                hashMap.put(10, f7041x.get(i7.get(4).intValue()));
                hashMap.put(9, f7042y.get(i7.get(5).intValue()));
                hashMap.put(7, e73Var.get(i7.get(0).intValue()));
                f7043z = new j94(applicationContext, hashMap, 2000, xv1.f14362a, true, null);
            }
            j94Var = f7043z;
        }
        return j94Var;
    }

    private final long g(int i7) {
        Long l7 = this.f7044f.get(Integer.valueOf(i7));
        if (l7 == null) {
            l7 = this.f7044f.get(0);
        }
        if (l7 == null) {
            l7 = 1000000L;
        }
        return l7.longValue();
    }

    private final void h(int i7, long j7, long j8) {
        int i8;
        if (i7 != 0) {
            i8 = i7;
        } else if (j7 == 0 && j8 == this.f7056r) {
            return;
        } else {
            i8 = 0;
        }
        this.f7056r = j8;
        this.f7045g.b(i8, j7, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void j(int i7) {
        int i8 = this.f7052n;
        if (i8 == 0 || this.f7048j) {
            if (i8 == i7) {
                return;
            }
            this.f7052n = i7;
            if (i7 != 1 && i7 != 0 && i7 != 8) {
                this.f7055q = g(i7);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                h(this.f7049k > 0 ? (int) (elapsedRealtime - this.f7050l) : 0, this.f7051m, this.f7055q);
                this.f7050l = elapsedRealtime;
                this.f7051m = 0L;
                this.f7054p = 0L;
                this.f7053o = 0L;
                this.f7046h.c();
            }
        }
    }

    private static boolean k(li1 li1Var, boolean z6) {
        return z6 && !li1Var.b(8);
    }

    @Override // com.google.android.gms.internal.ads.vt1
    public final void a(he1 he1Var, li1 li1Var, boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.a94
    public final void b(Handler handler, z84 z84Var) {
        this.f7045g.a(handler, z84Var);
    }

    @Override // com.google.android.gms.internal.ads.a94
    public final void c(z84 z84Var) {
        this.f7045g.c(z84Var);
    }

    @Override // com.google.android.gms.internal.ads.vt1
    public final synchronized void e(he1 he1Var, li1 li1Var, boolean z6, int i7) {
        if (k(li1Var, z6)) {
            this.f7051m += i7;
        }
    }

    @Override // com.google.android.gms.internal.ads.vt1
    public final synchronized void i(he1 he1Var, li1 li1Var, boolean z6) {
        if (k(li1Var, z6)) {
            wu1.f(this.f7049k > 0);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i7 = (int) (elapsedRealtime - this.f7050l);
            this.f7053o += i7;
            long j7 = this.f7054p;
            long j8 = this.f7051m;
            this.f7054p = j7 + j8;
            if (i7 > 0) {
                this.f7046h.b((int) Math.sqrt(j8), (j8 * 8000.0f) / i7);
                if (this.f7053o >= 2000 || this.f7054p >= 524288) {
                    this.f7055q = (long) this.f7046h.a(0.5f);
                }
                h(i7, this.f7051m, this.f7055q);
                this.f7050l = elapsedRealtime;
                this.f7051m = 0L;
            }
            this.f7049k--;
        }
    }

    @Override // com.google.android.gms.internal.ads.vt1
    public final synchronized void v(he1 he1Var, li1 li1Var, boolean z6) {
        if (k(li1Var, z6)) {
            if (this.f7049k == 0) {
                this.f7050l = SystemClock.elapsedRealtime();
            }
            this.f7049k++;
        }
    }
}
