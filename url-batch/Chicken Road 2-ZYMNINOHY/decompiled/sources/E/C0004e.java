package E;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: E.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f414a;

    public C0004e(DisplayCutout displayCutout) {
        this.f414a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0004e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f414a, ((C0004e) obj).f414a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f414a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f414a + "}";
    }
}
