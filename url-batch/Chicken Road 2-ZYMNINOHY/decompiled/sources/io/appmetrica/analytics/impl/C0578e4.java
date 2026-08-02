package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578e4 {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f11724a;

    public C0578e4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f11724a.elapsedRealtime();
    }

    public C0578e4(SystemTimeProvider systemTimeProvider) {
        this.f11724a = systemTimeProvider;
    }
}
