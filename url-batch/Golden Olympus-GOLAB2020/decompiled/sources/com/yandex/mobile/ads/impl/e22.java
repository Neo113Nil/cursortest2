package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class e22 extends ac0 {

    /* renamed from: b, reason: collision with root package name */
    private final long f25067b;

    public e22(lz lzVar, long j4) {
        super(lzVar);
        C2253tf.a(lzVar.a() >= j4);
        this.f25067b = j4;
    }

    @Override // com.yandex.mobile.ads.impl.ac0, com.yandex.mobile.ads.impl.q70
    public final long a() {
        return super.a() - this.f25067b;
    }

    @Override // com.yandex.mobile.ads.impl.ac0, com.yandex.mobile.ads.impl.q70
    public final long b() {
        return super.b() - this.f25067b;
    }

    @Override // com.yandex.mobile.ads.impl.ac0, com.yandex.mobile.ads.impl.q70
    public final long d() {
        return super.d() - this.f25067b;
    }
}
