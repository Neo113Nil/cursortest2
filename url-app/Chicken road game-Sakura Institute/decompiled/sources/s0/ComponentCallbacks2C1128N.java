package s0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import w0.C1289d;

/* renamed from: s0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1128N implements ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1289d f10100d;

    public ComponentCallbacks2C1128N(C1289d c1289d) {
        this.f10100d = c1289d;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f10100d.a();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f10100d.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        this.f10100d.a();
    }
}
