package y;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: y.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3146a;

    public C0261e(DisplayCutout displayCutout) {
        this.f3146a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0261e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3146a, ((C0261e) obj).f3146a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f3146a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3146a + "}";
    }
}
