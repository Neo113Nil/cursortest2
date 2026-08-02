package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0477f implements InterfaceC0663m4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7292a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg f7293b;

    public AbstractC0477f(Context context, Gg gg) {
        this.f7292a = context.getApplicationContext();
        this.f7293b = gg;
        gg.a(this);
        C0876ua.k().n().b(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0663m4
    public final void a(W5 w5, C0922w4 c0922w4) {
        b(w5, c0922w4);
    }

    public final Gg b() {
        return this.f7293b;
    }

    public abstract void b(W5 w5, C0922w4 c0922w4);

    public final Context c() {
        return this.f7292a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0663m4
    public final void a() {
        this.f7293b.b(this);
        C0876ua.f8420H.m().a(this);
    }
}
