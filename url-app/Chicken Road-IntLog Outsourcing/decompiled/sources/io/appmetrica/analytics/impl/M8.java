package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class M8 {

    /* renamed from: a, reason: collision with root package name */
    public final Kc f7135a;

    /* renamed from: b, reason: collision with root package name */
    public final Kc f7136b;

    public M8() {
        this(new C0534b8(), new S9(), new C0525b());
    }

    public M8(C0534b8 c0534b8, S9 s9, C0525b c0525b) {
        Kc kc = new Kc(c0534b8);
        this.f7135a = kc;
        kc.a(N8.NONE, c0534b8);
        kc.a(N8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, s9);
        kc.a(N8.AES_VALUE_ENCRYPTION, c0525b);
        this.f7136b = new Kc(c0534b8);
    }
}
