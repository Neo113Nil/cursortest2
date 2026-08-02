package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572dn implements Ln {

    /* renamed from: a, reason: collision with root package name */
    public final Ln f11706a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11707b;

    public C0572dn(Ln ln, Object obj) {
        this.f11706a = ln;
        this.f11707b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final Object a(Object obj) {
        return obj != this.f11706a.a(obj) ? this.f11707b : obj;
    }
}
