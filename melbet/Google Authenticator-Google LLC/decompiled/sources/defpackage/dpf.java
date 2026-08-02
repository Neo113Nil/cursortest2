package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dpf implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        dpl.a.clear();
        dpl.b.clear();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
