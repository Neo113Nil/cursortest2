package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978sd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1030ud f9246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f9248c;

    public C0978sd(C1030ud c1030ud, String str, byte[] bArr) {
        this.f9246a = c1030ud;
        this.f9247b = str;
        this.f9248c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1030ud.a(this.f9246a).setSessionExtra(this.f9247b, this.f9248c);
    }
}
