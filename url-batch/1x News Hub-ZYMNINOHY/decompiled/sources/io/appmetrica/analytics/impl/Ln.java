package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class Ln implements Li {

    /* renamed from: a, reason: collision with root package name */
    public final int f6303a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6304b;

    /* renamed from: c, reason: collision with root package name */
    public int f6305c = 0;

    public Ln(int i3, int i4) {
        this.f6303a = i3;
        this.f6304b = i4;
    }

    public final int a() {
        return this.f6304b;
    }

    public final boolean b() {
        int i3 = this.f6305c;
        this.f6305c = i3 + 1;
        return i3 < this.f6303a;
    }

    public final void c() {
        this.f6305c = 0;
    }
}
