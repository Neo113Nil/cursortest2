package s1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n0 implements ComponentCallbacks2 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w1.d f8291f;

    public n0(w1.d dVar) {
        this.f8291f = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        w1.d dVar = this.f8291f;
        synchronized (dVar) {
            dVar.f9494a.a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        w1.d dVar = this.f8291f;
        synchronized (dVar) {
            dVar.f9494a.a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        w1.d dVar = this.f8291f;
        synchronized (dVar) {
            dVar.f9494a.a();
        }
    }
}
