package K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f486a;

    public C0012j(DisplayCutout displayCutout) {
        this.f486a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0012j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f486a, ((C0012j) obj).f486a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f486a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f486a + "}";
    }
}
