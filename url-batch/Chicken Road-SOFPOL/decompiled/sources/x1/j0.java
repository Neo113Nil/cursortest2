package x1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j0 implements ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2.b f8464d;

    public j0(b2.b bVar) {
        this.f8464d = bVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        b2.b bVar = this.f8464d;
        synchronized (bVar) {
            bVar.f1062a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        b2.b bVar = this.f8464d;
        synchronized (bVar) {
            bVar.f1062a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        b2.b bVar = this.f8464d;
        synchronized (bVar) {
            bVar.f1062a.c();
        }
    }
}
