package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class H8 {

    /* renamed from: a, reason: collision with root package name */
    public final Dc f10361a;

    /* renamed from: b, reason: collision with root package name */
    public final Dc f10362b;

    public H8() {
        this(new V7(), new L9(), new C0496b());
    }

    public H8(V7 v7, L9 l9, C0496b c0496b) {
        Dc dc = new Dc(v7);
        this.f10361a = dc;
        dc.a(I8.NONE, v7);
        dc.a(I8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, l9);
        dc.a(I8.AES_VALUE_ENCRYPTION, c0496b);
        this.f10362b = new Dc(v7);
    }
}
