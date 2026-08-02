package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0938s2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f12712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f12713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0964t2 f12714c;

    public RunnableC0938s2(C0964t2 c0964t2, Context context, Intent intent) {
        this.f12714c = c0964t2;
        this.f12712a = context;
        this.f12713b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12714c.f12764a.consume(this.f12712a, this.f12713b);
    }
}
