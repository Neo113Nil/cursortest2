package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class A2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f6495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B2 f6496c;

    public A2(B2 b22, Context context, Intent intent) {
        this.f6496c = b22;
        this.f6494a = context;
        this.f6495b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6496c.f6580a.consume(this.f6494a, this.f6495b);
    }
}
