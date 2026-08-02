package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.sd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827sd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0879ud f8306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f8308c;

    public C0827sd(C0879ud c0879ud, String str, byte[] bArr) {
        this.f8306a = c0879ud;
        this.f8307b = str;
        this.f8308c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0879ud.a(this.f8306a).setSessionExtra(this.f8307b, this.f8308c);
    }
}
