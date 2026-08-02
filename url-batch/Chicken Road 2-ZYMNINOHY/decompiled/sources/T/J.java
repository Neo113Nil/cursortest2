package T;

import a.AbstractC0124a;
import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final C0095m f2667a;

    static {
        new SparseBooleanArray();
        AbstractC0124a.t(!false);
        W.J.G(0);
    }

    public J(C0095m c0095m) {
        this.f2667a = c0095m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            return this.f2667a.equals(((J) obj).f2667a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2667a.f2805a.hashCode();
    }
}
