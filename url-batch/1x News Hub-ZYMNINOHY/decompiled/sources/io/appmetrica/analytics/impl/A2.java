package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class A2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f5721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B2 f5722c;

    public A2(B2 b22, Context context, Intent intent) {
        this.f5722c = b22;
        this.f5720a = context;
        this.f5721b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5722c.f5800a.consume(this.f5720a, this.f5721b);
    }
}
