package com.ironsource;

/* renamed from: com.ironsource.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1603z2 extends gr {

    /* renamed from: h, reason: collision with root package name */
    private static String f20489h = "type";

    /* renamed from: i, reason: collision with root package name */
    private static String f20490i = "numOfAdUnits";

    /* renamed from: j, reason: collision with root package name */
    private static String f20491j = "firstCampaignCredits";

    /* renamed from: k, reason: collision with root package name */
    private static String f20492k = "totalNumberCredits";

    /* renamed from: l, reason: collision with root package name */
    private static String f20493l = "productType";

    /* renamed from: b, reason: collision with root package name */
    private String f20494b;

    /* renamed from: c, reason: collision with root package name */
    private String f20495c;

    /* renamed from: d, reason: collision with root package name */
    private String f20496d;

    /* renamed from: e, reason: collision with root package name */
    private String f20497e;

    /* renamed from: f, reason: collision with root package name */
    private String f20498f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20499g;

    public C1603z2(String str) {
        super(str);
        boolean z4;
        if (a(f20489h)) {
            k(d(f20489h));
        }
        if (a(f20490i)) {
            h(d(f20490i));
            z4 = true;
        } else {
            z4 = false;
        }
        a(z4);
        if (a(f20491j)) {
            g(d(f20491j));
        }
        if (a(f20492k)) {
            j(d(f20492k));
        }
        if (a(f20493l)) {
            i(d(f20493l));
        }
    }

    private void a(boolean z4) {
        this.f20499g = z4;
    }

    public String b() {
        return this.f20497e;
    }

    public String c() {
        return this.f20496d;
    }

    public String d() {
        return this.f20495c;
    }

    public String e() {
        return this.f20498f;
    }

    public String f() {
        return this.f20494b;
    }

    public void g(String str) {
        this.f20497e = str;
    }

    public void h(String str) {
        this.f20496d = str;
    }

    public void i(String str) {
        this.f20495c = str;
    }

    public void j(String str) {
        this.f20498f = str;
    }

    public void k(String str) {
        this.f20494b = str;
    }

    public boolean g() {
        return this.f20499g;
    }
}
