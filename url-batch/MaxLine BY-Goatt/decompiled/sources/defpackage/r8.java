package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r8 implements ComponentCallbacks2 {
    public final /* synthetic */ n92 m;

    public r8(n92 n92Var) {
        this.m = n92Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.m.a();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.m.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.m.a();
    }
}
