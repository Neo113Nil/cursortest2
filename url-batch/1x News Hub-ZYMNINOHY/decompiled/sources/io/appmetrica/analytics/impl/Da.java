package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* loaded from: classes.dex */
public final class Da implements HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0467ef f5895a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC0363ae f5896b;

    public Da(C0467ef c0467ef, EnumC0363ae enumC0363ae) {
        this.f5895a = c0467ef;
        this.f5896b = enumC0363ae;
    }

    public final EnumC0363ae a() {
        return this.f5896b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f5895a.a(this.f5896b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f5895a.a(this.f5896b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j3) {
        this.f5895a.b(this.f5896b, j3).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i3) {
        this.f5895a.b(this.f5896b, i3).b();
    }
}
