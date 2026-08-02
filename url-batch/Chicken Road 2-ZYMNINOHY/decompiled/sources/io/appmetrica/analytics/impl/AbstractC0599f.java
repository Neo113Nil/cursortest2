package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0599f implements InterfaceC0604f4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11814a;

    /* renamed from: b, reason: collision with root package name */
    public final Bg f11815b;

    public AbstractC0599f(Context context, Bg bg) {
        this.f11814a = context.getApplicationContext();
        this.f11815b = bg;
        bg.a(this);
        C0817na.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0604f4
    public final void a(P5 p5, C0863p4 c0863p4) {
        b(p5, c0863p4);
    }

    public final Bg b() {
        return this.f11815b;
    }

    public abstract void b(P5 p5, C0863p4 c0863p4);

    public final Context c() {
        return this.f11814a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0604f4
    public final void a() {
        this.f11815b.b(this);
        C0817na.f12417I.m().a(this);
    }
}
