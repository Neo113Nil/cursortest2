package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes3.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f979a;
    public final /* synthetic */ C0541u1 b;

    public O0(C0541u1 c0541u1, Intent intent) {
        this.b = c0541u1;
        this.f979a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0672z7 c0672z7 = this.b.d().b;
        Intent intent = this.f979a;
        c0672z7.getClass();
        if (intent != null) {
            c0672z7.a(intent.getDataString(), false);
        }
    }
}
