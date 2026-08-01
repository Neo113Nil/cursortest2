package K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f424a;

    public C0010j(DisplayCutout displayCutout) {
        this.f424a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0010j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f424a, ((C0010j) obj).f424a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f424a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f424a + "}";
    }
}
