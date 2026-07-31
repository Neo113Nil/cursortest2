package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import com.yandex.mobile.ads.impl.qq1;
import com.yandex.mobile.ads.impl.vi0;

/* loaded from: classes3.dex */
final class si0 implements qq1.b<Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f31759a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ vi0 f31760b;

    si0(vi0 vi0Var, String str) {
        this.f31760b = vi0Var;
        this.f31759a = str;
    }

    @Override // com.yandex.mobile.ads.impl.qq1.b
    public final void a(Bitmap bitmap) {
        vi0.b bVar;
        Runnable runnable;
        Handler handler;
        Bitmap bitmap2 = bitmap;
        vi0 vi0Var = this.f31760b;
        String str = this.f31759a;
        bVar = vi0Var.f33633b;
        bVar.a(str, bitmap2);
        vi0.a aVar = (vi0.a) vi0Var.f33634c.remove(str);
        if (aVar != null) {
            aVar.f33639b = bitmap2;
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
