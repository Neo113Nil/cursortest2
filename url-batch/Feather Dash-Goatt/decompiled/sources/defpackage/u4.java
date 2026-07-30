package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class u4 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration d;
    public final /* synthetic */ h70 e;

    public u4(Configuration configuration, h70 h70Var) {
        this.d = configuration;
        this.e = h70Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.d;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.e.a.entrySet().iterator();
        while (it.hasNext()) {
            f70 f70Var = (f70) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (f70Var == null || Configuration.needNewResources(updateFrom, f70Var.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.e.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.e.a.clear();
    }
}
