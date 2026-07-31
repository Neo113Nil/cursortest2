package com.ironsource;

/* loaded from: classes2.dex */
public class ug {

    /* renamed from: a, reason: collision with root package name */
    private int f19925a;

    /* renamed from: b, reason: collision with root package name */
    private int f19926b;

    /* renamed from: c, reason: collision with root package name */
    private String f19927c;

    public ug() {
        this.f19925a = 0;
        this.f19926b = 0;
        this.f19927c = "";
    }

    public int a() {
        return this.f19926b;
    }

    public String b() {
        return this.f19927c;
    }

    public int c() {
        return this.f19925a;
    }

    public boolean d() {
        return this.f19926b > 0 && this.f19925a > 0;
    }

    public boolean e() {
        return this.f19926b == 0 && this.f19925a == 0;
    }

    public String toString() {
        return this.f19927c;
    }

    public ug(int i4, int i5, String str) {
        this.f19925a = i4;
        this.f19926b = i5;
        this.f19927c = str;
    }
}
