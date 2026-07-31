package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f164a;
    public final /* synthetic */ b2 b;

    public a2(b2 b2Var, Bitmap bitmap) {
        this.b = b2Var;
        this.f164a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d2 d2Var = this.b.f176a;
        c2 c2Var = d2Var.d;
        if (c2Var != null) {
            c2Var.a(this.f164a, d2Var.e);
        }
    }
}
