package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class E implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5676e;

    public /* synthetic */ E(int i2, Object obj) {
        this.f5675d = i2;
        this.f5676e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5675d) {
            case 0:
                D0.k kVar = (D0.k) this.f5676e;
                ((View) kVar.f334e).postDelayed((p) kVar.f335i, 128L);
                break;
            default:
                F f7 = (F) this.f5676e;
                f7.f5677d.getViewTreeObserver().removeOnDrawListener(f7);
                break;
        }
    }
}
