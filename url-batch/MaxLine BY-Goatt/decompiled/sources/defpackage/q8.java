package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q8 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration m;
    public final /* synthetic */ a11 n;

    public q8(Configuration configuration, a11 a11Var) {
        this.m = configuration;
        this.n = a11Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.m;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.n.a.entrySet().iterator();
        while (it.hasNext()) {
            y01 y01Var = (y01) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (y01Var == null || Configuration.needNewResources(updateFrom, y01Var.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.n.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.n.a.clear();
    }
}
