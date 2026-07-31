package u0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import x0.C1051a;
import x0.C1053c;

/* loaded from: classes.dex */
public final class N implements ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Configuration f8216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1053c f8217e;

    public N(Configuration configuration, C1053c c1053c) {
        this.f8216d = configuration;
        this.f8217e = c1053c;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f8216d;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f8217e.f8721a.entrySet().iterator();
        while (it.hasNext()) {
            C1051a c1051a = (C1051a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (c1051a == null || Configuration.needNewResources(updateFrom, c1051a.f8718b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f8217e.f8721a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        this.f8217e.f8721a.clear();
    }
}
