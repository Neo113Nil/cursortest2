package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Ra implements HostRetryInfoProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C2834nf f38196a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC2704ie f38197b;

    public Ra(@NotNull C2834nf c2834nf, @NotNull EnumC2704ie enumC2704ie) {
        this.f38196a = c2834nf;
        this.f38197b = enumC2704ie;
    }

    @NotNull
    public final EnumC2704ie a() {
        return this.f38197b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f38196a.a(this.f38197b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f38196a.a(this.f38197b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j4) {
        this.f38196a.b(this.f38197b, j4).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i4) {
        this.f38196a.b(this.f38197b, i4).b();
    }
}
