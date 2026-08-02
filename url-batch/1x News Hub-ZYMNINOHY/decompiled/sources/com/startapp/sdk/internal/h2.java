package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class h2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j2 f3925a;

    public h2(j2 j2Var) {
        this.f3925a = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap b3;
        j2 j2Var = this.f3925a;
        if (j2Var.f3991b) {
            b3 = k2.a(j2Var.f3990a, j2Var.f3992c);
        } else {
            b3 = k2.b(j2Var.f3992c);
        }
        new Handler(Looper.getMainLooper()).post(new g2(this, b3));
    }
}
