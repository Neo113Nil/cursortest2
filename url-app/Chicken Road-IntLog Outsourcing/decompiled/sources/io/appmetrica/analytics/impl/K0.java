package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final class K0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f7024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7025b;

    public K0(C0966s1 c0966s1, Intent intent) {
        this.f7025b = c0966s1;
        this.f7024a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G7 g7 = this.f7025b.d().f9093b;
        Intent intent = this.f7024a;
        g7.getClass();
        if (intent != null) {
            g7.a(intent.getDataString(), false);
        }
    }
}
