package o1;

import android.view.KeyEvent;
import x1.p;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends l implements c {

    /* renamed from: r, reason: collision with root package name */
    public p f5598r;

    @Override // o1.c
    public final boolean K(KeyEvent keyEvent) {
        p pVar = this.f5598r;
        if (pVar != null) {
            return ((Boolean) pVar.i(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // o1.c
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }
}
