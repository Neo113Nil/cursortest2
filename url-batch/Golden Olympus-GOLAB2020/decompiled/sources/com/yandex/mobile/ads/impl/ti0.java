package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.qq1;
import com.yandex.mobile.ads.impl.vi0;

/* loaded from: classes3.dex */
final class ti0 implements qq1.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f32445a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ vi0 f32446b;

    ti0(vi0 vi0Var, String str) {
        this.f32446b = vi0Var;
        this.f32445a = str;
    }

    @Override // com.yandex.mobile.ads.impl.qq1.a
    public final void a(hi2 hi2Var) {
        Runnable runnable;
        Handler handler;
        vi0 vi0Var = this.f32446b;
        String str = this.f32445a;
        vi0.a aVar = (vi0.a) vi0Var.f33634c.remove(str);
        if (aVar != null) {
            aVar.f33640c = hi2Var;
            vi0Var.f33635d.put(str, aVar);
            runnable = vi0Var.f33637f;
            if (runnable == null) {
                ui0 ui0Var = new ui0(vi0Var);
                vi0Var.f33637f = ui0Var;
                handler = vi0Var.f33636e;
                handler.postDelayed(ui0Var, 100);
            }
        }
    }
}
