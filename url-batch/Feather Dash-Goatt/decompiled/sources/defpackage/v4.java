package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v4 implements ComponentCallbacks2 {
    public final /* synthetic */ d31 d;

    public v4(d31 d31Var) {
        this.d = d31Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        d31 d31Var = this.d;
        synchronized (d31Var) {
            d31Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        d31 d31Var = this.d;
        synchronized (d31Var) {
            d31Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        d31 d31Var = this.d;
        synchronized (d31Var) {
            d31Var.a.c();
        }
    }
}
