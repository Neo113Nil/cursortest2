package io.flutter.plugin.platform;

import android.os.Build;

/* loaded from: classes.dex */
public final class B implements io.flutter.view.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f5668a;

    public B(C c7) {
        this.f5668a = c7;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i2) {
        if (i2 != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f5668a.f5674n = true;
    }
}
