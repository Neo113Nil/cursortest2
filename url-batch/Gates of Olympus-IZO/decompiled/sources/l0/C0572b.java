package l0;

import Z1.i;
import android.view.KeyEvent;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f5541a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0572b) {
            return i.a(this.f5541a, ((C0572b) obj).f5541a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5541a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f5541a + ')';
    }
}
