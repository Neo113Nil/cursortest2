package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.f4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0165f4 {

    /* renamed from: a, reason: collision with root package name */
    public final SystemTimeProvider f1249a;

    public C0165f4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.f1249a.elapsedRealtime();
    }

    public C0165f4(SystemTimeProvider systemTimeProvider) {
        this.f1249a = systemTimeProvider;
    }
}
