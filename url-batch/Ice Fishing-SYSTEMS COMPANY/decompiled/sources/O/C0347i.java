package O;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: O.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2274a;

    public C0347i(DisplayCutout displayCutout) {
        this.f2274a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0347i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2274a, ((C0347i) obj).f2274a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f2274a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2274a + "}";
    }
}
