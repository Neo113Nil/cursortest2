package A;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: A.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005f {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f41a;

    public C0005f(DisplayCutout displayCutout) {
        this.f41a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0005f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f41a, ((C0005f) obj).f41a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f41a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f41a + "}";
    }
}
