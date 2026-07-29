package com.ironsource.sdk.data;

/* compiled from: AdUnitsReady.java */
/* loaded from: classes2.dex */
public class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private static String f7142a = "type";

    /* renamed from: b, reason: collision with root package name */
    private static String f7143b = "numOfAdUnits";

    /* renamed from: c, reason: collision with root package name */
    private static String f7144c = "firstCampaignCredits";

    /* renamed from: d, reason: collision with root package name */
    private static String f7145d = "totalNumberCredits";
    private static String e = "productType";
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private boolean k;

    public a(String str) {
        super(str);
        if (f(f7142a)) {
            a(i(f7142a));
        }
        if (f(f7143b)) {
            b(i(f7143b));
            a(true);
        } else {
            a(false);
        }
        if (f(f7144c)) {
            c(i(f7144c));
        }
        if (f(f7145d)) {
            d(i(f7145d));
        }
        if (f(e)) {
            e(i(e));
        }
    }

    public void a(String str) {
        this.f = str;
    }

    public String a() {
        return this.h;
    }

    public void b(String str) {
        this.h = str;
    }

    public void c(String str) {
        this.i = str;
    }

    public void d(String str) {
        this.j = str;
    }

    private void a(boolean z) {
        this.k = z;
    }

    public boolean b() {
        return this.k;
    }

    public String c() {
        return this.g;
    }

    public void e(String str) {
        this.g = str;
    }
}
