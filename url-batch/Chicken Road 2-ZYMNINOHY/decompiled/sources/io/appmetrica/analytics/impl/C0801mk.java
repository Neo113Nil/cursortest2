package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801mk {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f12375a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12376b;

    public C0801mk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f12375a = systemTimeProvider;
        this.f12376b = systemTimeProvider.currentTimeMillis();
    }
}
