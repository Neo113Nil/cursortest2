package com.ironsource.sdk.data;

/* compiled from: SSAFile.java */
/* loaded from: classes2.dex */
public class f extends g {

    /* renamed from: a, reason: collision with root package name */
    private String f7170a;

    /* renamed from: b, reason: collision with root package name */
    private String f7171b;

    /* renamed from: c, reason: collision with root package name */
    private String f7172c;

    /* renamed from: d, reason: collision with root package name */
    private String f7173d;
    private String e;
    private String f;
    private String g;

    public f(String str) {
        super(str);
        this.f7170a = "file";
        this.f7171b = "path";
        this.f7172c = "lastUpdateTime";
        if (f(this.f7170a)) {
            c(i(this.f7170a));
        }
        if (f(this.f7171b)) {
            d(i(this.f7171b));
        }
        if (f(this.f7172c)) {
            b(i(this.f7172c));
        }
    }

    public f(String str, String str2) {
        this.f7170a = "file";
        this.f7171b = "path";
        this.f7172c = "lastUpdateTime";
        c(str);
        d(str2);
    }

    public String a() {
        return this.f7173d;
    }

    private void c(String str) {
        this.f7173d = str;
    }

    private void d(String str) {
        this.e = str;
    }

    public String b() {
        return this.e;
    }

    public void a(String str) {
        this.f = str;
    }

    public String c() {
        return this.f;
    }

    public void b(String str) {
        this.g = str;
    }

    public String d() {
        return this.g;
    }
}
