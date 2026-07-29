package com.tapjoy.internal;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class cs {
    public abstract void a();

    public abstract void a(View view);

    public abstract void b();

    public static cs a(ct ctVar, cu cuVar) {
        if (!ck.b()) {
            throw new IllegalStateException("Method called before OMID activation");
        }
        dp.a(ctVar, "AdSessionConfiguration is null");
        dp.a(cuVar, "AdSessionContext is null");
        return new cz(ctVar, cuVar);
    }
}
