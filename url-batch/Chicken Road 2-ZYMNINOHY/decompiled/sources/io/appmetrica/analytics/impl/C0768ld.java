package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768ld extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0820nd f12289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12290b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f12291c;

    public C0768ld(C0820nd c0820nd, String str, byte[] bArr) {
        this.f12289a = c0820nd;
        this.f12290b = str;
        this.f12291c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0820nd.a(this.f12289a).setSessionExtra(this.f12290b, this.f12291c);
    }
}
