package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1500l implements wv {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f16972a;

    public C1500l(Activity activity) {
        this.f16972a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.wv
    public void a() {
        WindowInsetsController windowInsetsController;
        int statusBars;
        Activity activity = this.f16972a.get();
        if (activity == null) {
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
        Window window = activity.getWindow();
        if (i4 < 30) {
            window.setFlags(1024, 1024);
            return;
        }
        windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            statusBars = WindowInsets.Type.statusBars();
            windowInsetsController.hide(statusBars);
        }
    }
}
