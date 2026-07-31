package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3134z4 {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f40302a;

    public C3134z4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f40302a.elapsedRealtime();
    }

    public C3134z4(SystemTimeProvider systemTimeProvider) {
        this.f40302a = systemTimeProvider;
    }
}
