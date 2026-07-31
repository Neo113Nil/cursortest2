package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class E2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f37397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F2 f37398c;

    public E2(F2 f22, Context context, Intent intent) {
        this.f37398c = f22;
        this.f37396a = context;
        this.f37397b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37398c.f37495a.consume(this.f37396a, this.f37397b);
    }
}
