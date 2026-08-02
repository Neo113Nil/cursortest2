package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9228b;

    public /* synthetic */ A(int i3, Object obj) {
        this.f9227a = i3;
        this.f9228b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9227a) {
            case 0:
                B b3 = (B) this.f9228b;
                ((View) b3.f9230b).postDelayed((n) b3.f9231c, 128L);
                break;
            default:
                C c3 = (C) this.f9228b;
                c3.f9232a.getViewTreeObserver().removeOnDrawListener(c3);
                break;
        }
    }
}
