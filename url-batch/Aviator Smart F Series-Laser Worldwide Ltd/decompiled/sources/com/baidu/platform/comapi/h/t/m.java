package com.baidu.platform.comapi.h.t;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class m implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private static long f9294a;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f9294a > 300) {
            f9294a = currentTimeMillis;
            a(view);
        }
    }
}
