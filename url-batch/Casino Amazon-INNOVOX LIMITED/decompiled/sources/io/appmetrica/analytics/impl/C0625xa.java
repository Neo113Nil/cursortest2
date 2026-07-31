package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0625xa implements HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0047af f1564a;
    public final Ud b;

    public C0625xa(C0047af c0047af, Ud ud) {
        this.f1564a = c0047af;
        this.b = ud;
    }

    public final Ud a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f1564a.a(this.b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f1564a.a(this.b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j) {
        this.f1564a.b(this.b, j).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i) {
        this.f1564a.b(this.b, i).b();
    }
}
