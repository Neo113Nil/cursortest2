package l0;

import android.view.KeyEvent;
import f2.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f6574a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return j.a(this.f6574a, ((b) obj).f6574a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6574a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f6574a + ')';
    }
}
