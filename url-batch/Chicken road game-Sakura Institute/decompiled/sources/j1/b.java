package j1;

import android.view.KeyEvent;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f4986a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return k.a(this.f4986a, ((b) obj).f4986a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4986a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f4986a + ')';
    }
}
