package u0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import y0.C1231a;

/* loaded from: classes.dex */
public final class N implements ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Configuration f9236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0.c f9237e;

    public N(Configuration configuration, y0.c cVar) {
        this.f9236d = configuration;
        this.f9237e = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f9236d;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f9237e.f10382a.entrySet().iterator();
        while (it.hasNext()) {
            C1231a c1231a = (C1231a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (c1231a == null || Configuration.needNewResources(updateFrom, c1231a.f10379b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f9237e.f10382a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        this.f9237e.f10382a.clear();
    }
}
