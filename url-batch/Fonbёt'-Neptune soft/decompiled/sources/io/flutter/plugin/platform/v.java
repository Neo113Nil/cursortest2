package io.flutter.plugin.platform;

import android.os.Build;

/* loaded from: classes.dex */
public final class v implements io.flutter.view.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f2687a;

    public v(w wVar) {
        this.f2687a = wVar;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i2) {
        if (i2 != 80 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.f2687a.f2693f = true;
    }
}
