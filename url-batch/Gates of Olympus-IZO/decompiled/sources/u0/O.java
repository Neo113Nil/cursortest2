package u0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import x0.C1054d;

/* loaded from: classes.dex */
public final class O implements ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1054d f8219d;

    public O(C1054d c1054d) {
        this.f8219d = c1054d;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C1054d c1054d = this.f8219d;
        synchronized (c1054d) {
            c1054d.f8722a.a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C1054d c1054d = this.f8219d;
        synchronized (c1054d) {
            c1054d.f8722a.a();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        C1054d c1054d = this.f8219d;
        synchronized (c1054d) {
            c1054d.f8722a.a();
        }
    }
}
