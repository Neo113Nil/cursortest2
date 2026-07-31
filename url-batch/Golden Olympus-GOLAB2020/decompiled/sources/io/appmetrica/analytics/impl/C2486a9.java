package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2486a9 {

    /* renamed from: a, reason: collision with root package name */
    public final Yc f38667a;

    /* renamed from: b, reason: collision with root package name */
    public final Yc f38668b;

    public C2486a9() {
        this(new C2879p8(), new C2648ga(), new C2503b());
    }

    public C2486a9(C2879p8 c2879p8, C2648ga c2648ga, C2503b c2503b) {
        Yc yc = new Yc(c2879p8);
        this.f38667a = yc;
        yc.a(EnumC2513b9.NONE, c2879p8);
        yc.a(EnumC2513b9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, c2648ga);
        yc.a(EnumC2513b9.AES_VALUE_ENCRYPTION, c2503b);
        this.f38668b = new Yc(c2879p8);
    }
}
