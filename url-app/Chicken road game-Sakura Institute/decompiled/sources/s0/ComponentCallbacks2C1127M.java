package s0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import w0.C1286a;
import w0.C1288c;

/* renamed from: s0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1127M implements ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Configuration f10098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1288c f10099e;

    public ComponentCallbacks2C1127M(Configuration configuration, C1288c c1288c) {
        this.f10098d = configuration;
        this.f10099e = c1288c;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f10098d;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f10099e.f11376a.entrySet().iterator();
        while (it.hasNext()) {
            C1286a c1286a = (C1286a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (c1286a == null || Configuration.needNewResources(updateFrom, c1286a.f11373b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f10099e.f11376a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        this.f10099e.f11376a.clear();
    }
}
