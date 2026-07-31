package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2994tk {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f39871a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39872b;

    public C2994tk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f39871a = systemTimeProvider;
        this.f39872b = systemTimeProvider.currentTimeMillis();
    }
}
