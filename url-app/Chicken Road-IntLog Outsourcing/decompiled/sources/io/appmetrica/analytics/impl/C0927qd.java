package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0927qd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1030ud f9094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9096c;

    public C0927qd(C1030ud c1030ud, int i2, String str) {
        this.f9094a = c1030ud;
        this.f9095b = i2;
        this.f9096c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1030ud.a(this.f9094a).a(new M9(this.f9095b, this.f9096c));
    }
}
