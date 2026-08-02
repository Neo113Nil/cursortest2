package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gnd implements ComponentCallbacks2 {
    final /* synthetic */ gnh a;

    public gnd(gnh gnhVar) {
        this.a = gnhVar;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        fao.c();
        gnh gnhVar = this.a;
        if (gnhVar.a == null) {
            return;
        }
        if (i == 60 || i == 80) {
            gnhVar.a.j();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
