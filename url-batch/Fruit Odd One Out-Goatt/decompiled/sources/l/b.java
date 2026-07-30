package l;

import android.view.DisplayCutout;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f735a;

    public b(DisplayCutout displayCutout) {
        this.f735a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f735a.equals(((b) obj).f735a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f735a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f735a + "}";
    }
}
