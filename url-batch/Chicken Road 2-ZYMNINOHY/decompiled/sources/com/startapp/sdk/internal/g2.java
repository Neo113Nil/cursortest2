package com.startapp.sdk.internal;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class g2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f6968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f6969b;

    public g2(h2 h2Var, Bitmap bitmap) {
        this.f6969b = h2Var;
        this.f6968a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j2 j2Var = this.f6969b.f7050a;
        i2 i2Var = j2Var.f7119d;
        if (i2Var != null) {
            i2Var.a(this.f6968a, j2Var.f7120e);
        }
    }
}
