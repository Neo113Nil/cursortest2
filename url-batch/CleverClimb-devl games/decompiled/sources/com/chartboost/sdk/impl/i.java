package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3836a;

    /* renamed from: b, reason: collision with root package name */
    private final h f3837b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3838c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3839d;

    i(h hVar, boolean z, int i, int i2) {
        this.f3837b = hVar;
        this.f3836a = z;
        this.f3838c = i;
        this.f3839d = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f3837b.a(this.f3836a, this.f3838c, this.f3839d);
    }
}
