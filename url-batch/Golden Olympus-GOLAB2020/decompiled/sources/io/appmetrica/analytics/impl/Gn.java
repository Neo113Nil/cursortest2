package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public class Gn implements Ti {

    /* renamed from: a, reason: collision with root package name */
    public final int f37590a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37591b;

    /* renamed from: c, reason: collision with root package name */
    public int f37592c = 0;

    public Gn(int i4, int i5) {
        this.f37590a = i4;
        this.f37591b = i5;
    }

    public final int a() {
        return this.f37591b;
    }

    public final boolean b() {
        int i4 = this.f37592c;
        this.f37592c = i4 + 1;
        return i4 < this.f37590a;
    }

    public final void c() {
        this.f37592c = 0;
    }
}
