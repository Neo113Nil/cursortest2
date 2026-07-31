package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes3.dex */
public final class J0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f37775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f37776b;

    public J0(C2872p1 c2872p1, Intent intent) {
        this.f37776b = c2872p1;
        this.f37775a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U7 u7 = this.f37776b.d().f37440b;
        Intent intent = this.f37775a;
        u7.getClass();
        if (intent != null) {
            u7.a(intent.getDataString(), false);
        }
    }
}
