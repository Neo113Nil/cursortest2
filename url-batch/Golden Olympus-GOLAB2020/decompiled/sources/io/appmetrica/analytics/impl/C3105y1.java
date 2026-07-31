package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3105y1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f40243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f40244b;

    public C3105y1(I1 i12, Configuration configuration) {
        this.f40244b = i12;
        this.f40243a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f40244b.f37689b.onConfigurationChanged(this.f40243a);
    }
}
