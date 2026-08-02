package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class exl implements ComponentCallbacks2 {
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Set set = exk.a;
        fao.c();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Set set = exk.a;
        fao.c();
        exk.b = i;
        Iterator it = exk.a.iterator();
        while (it.hasNext()) {
            ((exj) it.next()).b(i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
