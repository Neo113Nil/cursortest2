package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class M8 {

    /* renamed from: a, reason: collision with root package name */
    public final Kc f6326a;

    /* renamed from: b, reason: collision with root package name */
    public final Kc f6327b;

    public M8() {
        this(new C0383b8(), new S9(), new C0374b());
    }

    public M8(C0383b8 c0383b8, S9 s9, C0374b c0374b) {
        Kc kc = new Kc(c0383b8);
        this.f6326a = kc;
        kc.a(N8.NONE, c0383b8);
        kc.a(N8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, s9);
        kc.a(N8.AES_VALUE_ENCRYPTION, c0374b);
        this.f6327b = new Kc(c0383b8);
    }
}
