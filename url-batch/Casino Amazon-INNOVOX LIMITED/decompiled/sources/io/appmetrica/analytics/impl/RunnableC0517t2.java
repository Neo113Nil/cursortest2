package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* renamed from: io.appmetrica.analytics.impl.t2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0517t2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1493a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ C0542u2 c;

    public RunnableC0517t2(C0542u2 c0542u2, Context context, Intent intent) {
        this.c = c0542u2;
        this.f1493a = context;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f1508a.consume(this.f1493a, this.b);
    }
}
