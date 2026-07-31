package o1;

import android.view.KeyEvent;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f5597a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return i.a(this.f5597a, ((b) obj).f5597a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5597a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f5597a + ')';
    }
}
