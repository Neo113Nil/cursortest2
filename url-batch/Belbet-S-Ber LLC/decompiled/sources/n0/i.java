package n0;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2784a;

    public i(DisplayCutout displayCutout) {
        this.f2784a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2784a, ((i) obj).f2784a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f2784a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2784a + "}";
    }
}
