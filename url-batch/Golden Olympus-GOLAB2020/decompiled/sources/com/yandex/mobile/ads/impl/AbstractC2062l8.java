package com.yandex.mobile.ads.impl;

import android.view.View;

/* renamed from: com.yandex.mobile.ads.impl.l8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2062l8 {
    public static ln2 a(C2086m8 c2086m8, C2109n8 c2109n8) {
        if (me1.a()) {
            return new ln2(c2086m8, c2109n8);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void a();

    public abstract void a(View view);

    public abstract void a(View view, jc0 jc0Var, String str);

    public abstract void b();
}
