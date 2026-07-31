package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class B1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f37203a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37205c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I1 f37206d;

    public B1(I1 i12, Intent intent, int i4, int i5) {
        this.f37206d = i12;
        this.f37203a = intent;
        this.f37204b = i4;
        this.f37205c = i5;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f37206d.f37689b.a(this.f37203a, this.f37204b, this.f37205c);
    }
}
