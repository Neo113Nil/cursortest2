package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* renamed from: io.appmetrica.analytics.impl.wa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050wa implements HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Ze f12934a;

    /* renamed from: b, reason: collision with root package name */
    public final Td f12935b;

    public C1050wa(Ze ze, Td td) {
        this.f12934a = ze;
        this.f12935b = td;
    }

    public final Td a() {
        return this.f12935b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f12934a.a(this.f12935b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f12934a.a(this.f12935b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j4) {
        this.f12934a.b(this.f12935b, j4).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i4) {
        this.f12934a.b(this.f12935b, i4).b();
    }
}
