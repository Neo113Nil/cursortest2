package s1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m0 implements ComponentCallbacks2 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Configuration f8285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w1.c f8286g;

    public m0(Configuration configuration, w1.c cVar) {
        this.f8285f = configuration;
        this.f8286g = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f8285f;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f8286g.f9493a.entrySet().iterator();
        while (it.hasNext()) {
            w1.a aVar = (w1.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(updateFrom, aVar.f9490b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f8286g.f9493a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        this.f8286g.f9493a.clear();
    }
}
