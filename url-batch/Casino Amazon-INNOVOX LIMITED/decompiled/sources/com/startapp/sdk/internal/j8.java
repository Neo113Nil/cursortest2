package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class j8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f285a;
    public final /* synthetic */ k8 b;

    public j8(k8 k8Var, Bitmap bitmap) {
        this.b = k8Var;
        this.f285a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k8 k8Var;
        k8 k8Var2 = this.b;
        Bitmap bitmap = this.f285a;
        l8 l8Var = k8Var2.d;
        l8Var.g--;
        if (bitmap != null) {
            l8Var.d.put(k8Var2.b, bitmap);
            List3DActivity list3DActivity = k8Var2.d.f;
            if (list3DActivity != null) {
                list3DActivity.a(k8Var2.f301a);
            }
            l8 l8Var2 = k8Var2.d;
            if (l8Var2.h.isEmpty() || (k8Var = (k8) l8Var2.h.poll()) == null) {
                return;
            }
            ((Executor) l8Var2.f317a.a()).execute(k8Var);
        }
    }
}
