package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class I8 {

    /* renamed from: a, reason: collision with root package name */
    public final Ec f888a;
    public final Ec b;

    public I8() {
        this(new W7(), new M9(), new C0057b());
    }

    public I8(W7 w7, M9 m9, C0057b c0057b) {
        Ec ec = new Ec(w7);
        this.f888a = ec;
        ec.a(J8.NONE, w7);
        ec.a(J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, m9);
        ec.a(J8.AES_VALUE_ENCRYPTION, c0057b);
        this.b = new Ec(w7);
    }
}
