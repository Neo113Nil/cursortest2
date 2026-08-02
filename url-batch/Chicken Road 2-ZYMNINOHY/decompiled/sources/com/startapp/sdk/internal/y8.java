package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class y8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f7957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z8 f7958b;

    public y8(z8 z8Var, Bitmap bitmap) {
        this.f7958b = z8Var;
        this.f7957a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z8 z8Var;
        z8 z8Var2 = this.f7958b;
        Bitmap bitmap = this.f7957a;
        a9 a9Var = z8Var2.f8021d;
        a9Var.f6658g--;
        if (bitmap != null) {
            a9Var.f6655d.put(z8Var2.f8019b, bitmap);
            List3DActivity list3DActivity = z8Var2.f8021d.f6657f;
            if (list3DActivity != null) {
                list3DActivity.a(z8Var2.f8018a);
            }
            a9 a9Var2 = z8Var2.f8021d;
            if (a9Var2.f6659h.isEmpty() || (z8Var = (z8) a9Var2.f6659h.poll()) == null) {
                return;
            }
            ((Executor) a9Var2.f6652a.a()).execute(z8Var);
        }
    }
}
