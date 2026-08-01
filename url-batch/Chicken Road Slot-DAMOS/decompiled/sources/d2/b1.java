package d2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b1 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f3347d;

    public b1(c1 c1Var) {
        this.f3347d = c1Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f3347d.d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        c1 c1Var = this.f3347d;
        c1Var.f3358f.f4439a.clear();
        h2.d dVar = c1Var.g;
        synchronized (dVar) {
            dVar.f4440a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        c1 c1Var = this.f3347d;
        c1Var.f3358f.f4439a.clear();
        h2.d dVar = c1Var.g;
        synchronized (dVar) {
            dVar.f4440a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z10) {
        this.f3347d.f3369s.f3487a.setValue(Boolean.valueOf(z10));
    }
}
