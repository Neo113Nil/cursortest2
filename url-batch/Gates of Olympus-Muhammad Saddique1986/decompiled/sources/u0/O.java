package u0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class O implements ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0.d f9238d;

    public O(y0.d dVar) {
        this.f9238d = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        y0.d dVar = this.f9238d;
        synchronized (dVar) {
            dVar.f10383a.a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        y0.d dVar = this.f9238d;
        synchronized (dVar) {
            dVar.f10383a.a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        y0.d dVar = this.f9238d;
        synchronized (dVar) {
            dVar.f10383a.a();
        }
    }
}
