package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637l4 {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f7752a;

    public C0637l4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f7752a.elapsedRealtime();
    }

    public C0637l4(SystemTimeProvider systemTimeProvider) {
        this.f7752a = systemTimeProvider;
    }
}
