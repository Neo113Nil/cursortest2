package com.ironsource.b.e;

/* compiled from: Placement.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private int f6803a;

    /* renamed from: b, reason: collision with root package name */
    private String f6804b;

    /* renamed from: c, reason: collision with root package name */
    private String f6805c;

    /* renamed from: d, reason: collision with root package name */
    private int f6806d;
    private l e;

    public k(int i, String str, String str2, int i2, l lVar) {
        this.f6803a = i;
        this.f6804b = str;
        this.f6805c = str2;
        this.f6806d = i2;
        this.e = lVar;
    }

    public int a() {
        return this.f6803a;
    }

    public String b() {
        return this.f6804b;
    }

    public String c() {
        return this.f6805c;
    }

    public int d() {
        return this.f6806d;
    }

    public String toString() {
        return "placement name: " + this.f6804b + ", reward name: " + this.f6805c + " , amount:" + this.f6806d;
    }

    public l e() {
        return this.e;
    }
}
