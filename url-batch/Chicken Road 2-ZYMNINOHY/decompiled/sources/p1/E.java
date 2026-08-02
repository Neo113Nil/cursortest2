package p1;

import android.view.ViewGroup;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f14739a;

    public E(ViewGroup viewGroup) {
        this.f14739a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof E) && ((E) obj).f14739a.equals(this.f14739a);
    }

    public final int hashCode() {
        return this.f14739a.hashCode();
    }
}
