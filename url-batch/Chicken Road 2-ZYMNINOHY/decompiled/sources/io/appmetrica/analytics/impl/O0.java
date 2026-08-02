package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f10732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f10733b;

    public O0(C0963t1 c0963t1, Intent intent) {
        this.f10733b = c0963t1;
        this.f10732a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1099y7 c1099y7 = this.f10733b.d().f12128b;
        Intent intent = this.f10732a;
        c1099y7.getClass();
        if (intent != null) {
            c1099y7.a(intent.getDataString(), false);
        }
    }
}
