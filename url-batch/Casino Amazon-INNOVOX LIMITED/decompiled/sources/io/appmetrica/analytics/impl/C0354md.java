package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.md, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0354md extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0404od f1376a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte[] c;

    public C0354md(C0404od c0404od, String str, byte[] bArr) {
        this.f1376a = c0404od;
        this.b = str;
        this.c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0404od.a(this.f1376a).setSessionExtra(this.b, this.c);
    }
}
