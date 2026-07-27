package E;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: E.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031f {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f614a;

    public C0031f(DisplayCutout displayCutout) {
        this.f614a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0031f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f614a, ((C0031f) obj).f614a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f614a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f614a + "}";
    }
}
