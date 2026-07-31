package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d2 f176a;

    public b2(d2 d2Var) {
        this.f176a = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d2 d2Var = this.f176a;
        boolean z = d2Var.b;
        String str = d2Var.c;
        new Handler(Looper.getMainLooper()).post(new a2(this, z ? e2.a(d2Var.f209a, str) : e2.b(str)));
    }
}
