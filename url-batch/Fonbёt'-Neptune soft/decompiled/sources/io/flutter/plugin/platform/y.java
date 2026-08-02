package io.flutter.plugin.platform;

import android.view.View;
import d0.ViewOnAttachStateChangeListenerC0180h;

/* loaded from: classes.dex */
public final class y implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2695f;

    public /* synthetic */ y(int i2, Object obj) {
        this.f2694e = i2;
        this.f2695f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2694e) {
            case 0:
                ViewOnAttachStateChangeListenerC0180h viewOnAttachStateChangeListenerC0180h = (ViewOnAttachStateChangeListenerC0180h) this.f2695f;
                ((View) viewOnAttachStateChangeListenerC0180h.f2046b).postDelayed((m) viewOnAttachStateChangeListenerC0180h.f2047c, 128L);
                break;
            default:
                z zVar = (z) this.f2695f;
                zVar.f2696a.getViewTreeObserver().removeOnDrawListener(zVar);
                break;
        }
    }
}
