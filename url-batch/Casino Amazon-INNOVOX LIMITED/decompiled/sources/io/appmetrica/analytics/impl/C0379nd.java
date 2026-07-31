package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0379nd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1394a;

    public C0379nd(String str) {
        this.f1394a = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0665z0 c0665z0 = C0088c4.l().p;
        String str = this.f1394a;
        c0665z0.getClass();
        C0640y0.c().a(str);
    }
}
