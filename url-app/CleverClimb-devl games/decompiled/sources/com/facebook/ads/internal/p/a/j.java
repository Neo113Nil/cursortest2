package com.facebook.ads.internal.p.a;

/* loaded from: classes.dex */
public enum j {
    GET(true, false),
    POST(true, true);


    /* renamed from: c, reason: collision with root package name */
    private boolean f5298c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5299d;

    j(boolean z, boolean z2) {
        this.f5298c = z;
        this.f5299d = z2;
    }

    public boolean a() {
        return this.f5298c;
    }

    public boolean b() {
        return this.f5299d;
    }

    public String c() {
        return toString();
    }
}
