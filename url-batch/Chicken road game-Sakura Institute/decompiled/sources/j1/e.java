package j1;

import android.view.KeyEvent;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends n implements d {

    /* renamed from: s, reason: collision with root package name */
    public q6.c f4990s;

    /* renamed from: t, reason: collision with root package name */
    public q6.c f4991t;

    @Override // j1.d
    public final boolean O(KeyEvent keyEvent) {
        q6.c cVar = this.f4990s;
        if (cVar != null) {
            return ((Boolean) cVar.f(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // j1.d
    public final boolean l(KeyEvent keyEvent) {
        q6.c cVar = this.f4991t;
        if (cVar != null) {
            return ((Boolean) cVar.f(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
