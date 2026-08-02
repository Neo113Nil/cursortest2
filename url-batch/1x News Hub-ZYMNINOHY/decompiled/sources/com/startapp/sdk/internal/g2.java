package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class g2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f3849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f3850b;

    public g2(h2 h2Var, Bitmap bitmap) {
        this.f3850b = h2Var;
        this.f3849a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j2 j2Var = this.f3850b.f3925a;
        i2 i2Var = j2Var.f3993d;
        if (i2Var != null) {
            i2Var.a(this.f3849a, j2Var.f3994e);
        }
    }
}
