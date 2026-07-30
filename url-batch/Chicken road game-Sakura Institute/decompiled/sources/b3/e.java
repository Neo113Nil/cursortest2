package b3;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f1318a;

    public e(DisplayCutout displayCutout) {
        this.f1318a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f1318a, ((e) obj).f1318a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f1318a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1318a + "}";
    }
}
