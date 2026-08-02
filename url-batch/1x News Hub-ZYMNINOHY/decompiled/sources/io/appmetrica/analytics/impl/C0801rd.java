package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0801rd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0879ud f8231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8232b;

    public C0801rd(C0879ud c0879ud, boolean z) {
        this.f8231a = c0879ud;
        this.f8232b = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0879ud.a(this.f8231a).a(this.f8232b, false);
    }
}
