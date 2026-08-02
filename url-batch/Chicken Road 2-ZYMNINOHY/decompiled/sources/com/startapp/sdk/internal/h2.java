package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class h2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j2 f7050a;

    public h2(j2 j2Var) {
        this.f7050a = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap b4;
        j2 j2Var = this.f7050a;
        if (j2Var.f7117b) {
            b4 = k2.a(j2Var.f7116a, j2Var.f7118c);
        } else {
            b4 = k2.b(j2Var.f7118c);
        }
        new Handler(Looper.getMainLooper()).post(new g2(this, b4));
    }
}
