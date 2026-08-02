package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public class Jn implements Gi {

    /* renamed from: a, reason: collision with root package name */
    public final int f10504a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10505b;

    /* renamed from: c, reason: collision with root package name */
    public int f10506c = 0;

    public Jn(int i4, int i5) {
        this.f10504a = i4;
        this.f10505b = i5;
    }

    public final int a() {
        return this.f10505b;
    }

    public final boolean b() {
        int i4 = this.f10506c;
        this.f10506c = i4 + 1;
        return i4 < this.f10504a;
    }

    public final void c() {
        this.f10506c = 0;
    }
}
