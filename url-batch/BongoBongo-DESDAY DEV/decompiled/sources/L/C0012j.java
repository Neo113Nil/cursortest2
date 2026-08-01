package L;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: L.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f537a;

    public C0012j(DisplayCutout displayCutout) {
        this.f537a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0012j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f537a, ((C0012j) obj).f537a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f537a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f537a + "}";
    }
}
