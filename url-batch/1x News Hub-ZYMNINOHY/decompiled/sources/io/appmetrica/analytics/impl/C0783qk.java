package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.qk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783qk {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f8179a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8180b;

    public C0783qk() {
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        this.f8179a = systemTimeProvider;
        this.f8180b = systemTimeProvider.currentTimeMillis();
    }
}
