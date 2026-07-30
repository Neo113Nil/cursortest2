package androidx.activity;

import O.B0;
import O.C0;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class t extends com.bumptech.glide.h {
    @Override // com.bumptech.glide.h
    public void A(I statusBarStyle, I navigationBarStyle, Window window, View view, boolean z8, boolean z9) {
        B0 c02;
        WindowInsetsController insetsController;
        kotlin.jvm.internal.h.e(statusBarStyle, "statusBarStyle");
        kotlin.jvm.internal.h.e(navigationBarStyle, "navigationBarStyle");
        kotlin.jvm.internal.h.e(window, "window");
        kotlin.jvm.internal.h.e(view, "view");
        com.bumptech.glide.g.R(window, false);
        window.setStatusBarColor(z8 ? statusBarStyle.f4547b : statusBarStyle.f4546a);
        window.setNavigationBarColor(z9 ? navigationBarStyle.f4547b : navigationBarStyle.f4546a);
        I0.j jVar = new I0.j(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            insetsController = window.getInsetsController();
            c02 = new B0(insetsController, jVar);
            c02.f2217b = window;
        } else {
            c02 = i >= 26 ? new C0(window, jVar) : new B0(window, jVar);
        }
        c02.n(!z8);
        c02.m(!z9);
    }
}
