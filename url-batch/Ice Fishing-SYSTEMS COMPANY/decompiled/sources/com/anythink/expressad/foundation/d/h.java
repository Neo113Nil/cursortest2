package com.anythink.expressad.foundation.d;

import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    private static final String f18893A = "template download error";

    /* renamed from: B, reason: collision with root package name */
    private static final String f18894B = "endcard template download error";

    /* renamed from: C, reason: collision with root package name */
    private static final String f18895C = "big template render error";

    /* renamed from: D, reason: collision with root package name */
    private static final String f18896D = "template render error";

    /* renamed from: E, reason: collision with root package name */
    private static final String f18897E = " isready false error";

    /* renamed from: F, reason: collision with root package name */
    private static final String f18898F = " load time out error";

    /* renamed from: G, reason: collision with root package name */
    private static final String f18899G = " no fill";

    /* renamed from: H, reason: collision with root package name */
    private static final String f18900H = "current unit is loading";

    /* renamed from: I, reason: collision with root package name */
    private static final String f18901I = "app already install";
    private static final String J = "adn no offer fill";

    /* renamed from: K, reason: collision with root package name */
    private static final String f18902K = "ad over cap ";

    /* renamed from: L, reason: collision with root package name */
    private static final String f18903L = " unknown error";

    /* renamed from: M, reason: collision with root package name */
    private static final String f18904M = "load exception";

    /* renamed from: a, reason: collision with root package name */
    public static final int f18905a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f18906b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f18907c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f18908d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f18909e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f18910f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f18911g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f18912h = 7;
    public static final int i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f18913j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final int f18914k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final int f18915l = 11;

    /* renamed from: m, reason: collision with root package name */
    public static final int f18916m = 15;

    /* renamed from: n, reason: collision with root package name */
    public static final int f18917n = 16;

    /* renamed from: o, reason: collision with root package name */
    public static final int f18918o = 18;

    /* renamed from: p, reason: collision with root package name */
    public static final int f18919p = 17;

    /* renamed from: q, reason: collision with root package name */
    public static final int f18920q = 19;

    /* renamed from: r, reason: collision with root package name */
    public static final int f18921r = 20;

    /* renamed from: s, reason: collision with root package name */
    public static final int f18922s = 21;

    /* renamed from: t, reason: collision with root package name */
    private static final String f18923t = "candidate failed";

    /* renamed from: u, reason: collision with root package name */
    private static final String f18924u = "v3 params invalid";

    /* renamed from: v, reason: collision with root package name */
    private static final String f18925v = "v3 request error";

    /* renamed from: w, reason: collision with root package name */
    private static final String f18926w = "v3 time out";

    /* renamed from: x, reason: collision with root package name */
    private static final String f18927x = "v3 response error";

    /* renamed from: y, reason: collision with root package name */
    private static final String f18928y = "video download error";

    /* renamed from: z, reason: collision with root package name */
    private static final String f18929z = "big template download error";

    /* renamed from: N, reason: collision with root package name */
    private String f18930N;

    /* renamed from: O, reason: collision with root package name */
    private int f18931O;

    /* renamed from: P, reason: collision with root package name */
    private String f18932P;

    /* renamed from: Q, reason: collision with root package name */
    private int f18933Q;

    /* renamed from: R, reason: collision with root package name */
    private Map<String, String> f18934R;

    /* renamed from: S, reason: collision with root package name */
    private String f18935S;

    /* renamed from: T, reason: collision with root package name */
    private int f18936T = -1;

    private h(int i4, String str, Map<String, String> map) {
        this.f18931O = i4;
        this.f18932P = str;
        this.f18934R = map;
        b();
    }

    private void a(String str) {
        this.f18935S = str;
    }

    private void b() {
        try {
            switch (this.f18931O) {
                case 0:
                    this.f18930N = f18924u;
                    break;
                case 1:
                    this.f18930N = f18925v;
                    break;
                case 2:
                    this.f18930N = f18926w;
                    break;
                case 3:
                    this.f18930N = f18927x;
                    break;
                case 4:
                    this.f18930N = f18928y;
                    break;
                case 5:
                    this.f18930N = f18929z;
                    break;
                case 6:
                    this.f18930N = f18893A;
                    break;
                case 7:
                    this.f18930N = f18894B;
                    break;
                case 8:
                    this.f18930N = f18895C;
                    break;
                case 9:
                    this.f18930N = f18896D;
                    break;
                case 10:
                    this.f18930N = f18898F;
                    break;
                case 11:
                    this.f18930N = f18899G;
                    break;
                case 15:
                    this.f18930N = f18897E;
                    break;
                case 16:
                    this.f18930N = f18900H;
                    break;
                case 17:
                    this.f18930N = J;
                    break;
                case 18:
                    this.f18930N = f18901I;
                    break;
                case 19:
                    this.f18930N = f18902K;
                    break;
                case 20:
                    this.f18930N = f18904M;
                    break;
                case 21:
                    this.f18930N = f18923t;
                    break;
            }
        } catch (Exception unused) {
            this.f18930N = f18903L;
        }
    }

    private String c() {
        return this.f18935S;
    }

    private int d() {
        return this.f18936T;
    }

    private int e() {
        return this.f18931O;
    }

    private int f() {
        return this.f18933Q;
    }

    private Map<String, String> g() {
        return this.f18934R;
    }

    private void a(int i4) {
        this.f18936T = i4;
    }

    private void c(int i4) {
        this.f18933Q = i4;
    }

    public final String a() {
        return this.f18932P;
    }

    private h(int i4, String str, boolean z8) {
        this.f18931O = 0;
        if (z8) {
            if (i4 == 200) {
                this.f18931O = 4;
            } else if (i4 == 201) {
                this.f18931O = 7;
            } else if (i4 == 203) {
                this.f18931O = 6;
            } else if (i4 == 205) {
                this.f18931O = 5;
            }
        }
        this.f18932P = str;
        b();
    }

    private h(int i4, String str) {
        this.f18931O = i4;
        this.f18932P = str;
        b();
    }

    private void b(int i4) {
        this.f18931O = i4;
    }

    private void b(String str) {
        this.f18932P = str;
    }
}
