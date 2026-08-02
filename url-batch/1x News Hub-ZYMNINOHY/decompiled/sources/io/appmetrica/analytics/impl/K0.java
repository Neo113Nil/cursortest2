package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final class K0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6222b;

    public K0(C0815s1 c0815s1, Intent intent) {
        this.f6222b = c0815s1;
        this.f6221a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G7 g7 = this.f6222b.d().f8160b;
        Intent intent = this.f6221a;
        g7.getClass();
        if (intent != null) {
            g7.a(intent.getDataString(), false);
        }
    }
}
