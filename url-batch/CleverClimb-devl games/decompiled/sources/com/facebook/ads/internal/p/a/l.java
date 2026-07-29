package com.facebook.ads.internal.p.a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    protected String f5300a;

    /* renamed from: b, reason: collision with root package name */
    protected j f5301b;

    /* renamed from: c, reason: collision with root package name */
    protected String f5302c;

    /* renamed from: d, reason: collision with root package name */
    protected byte[] f5303d;

    public l(String str, p pVar) {
        this.f5300a = "";
        if (str != null) {
            this.f5300a = str;
        }
        if (pVar != null) {
            this.f5300a += "?" + pVar.a();
        }
    }

    public String a() {
        return this.f5300a;
    }

    public j b() {
        return this.f5301b;
    }

    public String c() {
        return this.f5302c;
    }

    public byte[] d() {
        return this.f5303d;
    }
}
