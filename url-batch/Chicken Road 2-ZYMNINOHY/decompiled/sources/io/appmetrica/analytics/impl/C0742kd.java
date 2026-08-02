package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0742kd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0820nd f12219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12220b;

    public C0742kd(C0820nd c0820nd, boolean z) {
        this.f12219a = c0820nd;
        this.f12220b = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0820nd.a(this.f12219a).a(this.f12220b, false);
    }
}
