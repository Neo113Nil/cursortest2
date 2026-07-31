package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.nk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0386nk {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f1400a;
    public final long b;

    public C0386nk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f1400a = systemTimeProvider;
        this.b = systemTimeProvider.currentTimeMillis();
    }
}
