package j0;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f7136a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return Intrinsics.a(this.f7136a, ((b) obj).f7136a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7136a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f7136a + ')';
    }
}
