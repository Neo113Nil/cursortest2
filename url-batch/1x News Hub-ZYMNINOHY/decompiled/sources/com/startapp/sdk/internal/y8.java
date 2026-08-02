package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class y8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f4809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z8 f4810b;

    public y8(z8 z8Var, Bitmap bitmap) {
        this.f4810b = z8Var;
        this.f4809a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z8 z8Var;
        z8 z8Var2 = this.f4810b;
        Bitmap bitmap = this.f4809a;
        a9 a9Var = z8Var2.f4871d;
        a9Var.f3556g--;
        if (bitmap != null) {
            a9Var.f3554d.put(z8Var2.f4869b, bitmap);
            List3DActivity list3DActivity = z8Var2.f4871d.f;
            if (list3DActivity != null) {
                list3DActivity.a(z8Var2.f4868a);
            }
            a9 a9Var2 = z8Var2.f4871d;
            if (a9Var2.f3557h.isEmpty() || (z8Var = (z8) a9Var2.f3557h.poll()) == null) {
                return;
            }
            ((Executor) a9Var2.f3551a.a()).execute(z8Var);
        }
    }
}
