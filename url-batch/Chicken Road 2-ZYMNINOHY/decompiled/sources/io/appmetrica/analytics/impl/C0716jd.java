package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0716jd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0820nd f12129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12131c;

    public C0716jd(C0820nd c0820nd, int i4, String str) {
        this.f12129a = c0820nd;
        this.f12130b = i4;
        this.f12131c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0820nd.a(this.f12129a).a(new F9(this.f12130b, this.f12131c));
    }
}
