package K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f457a;

    public C0014j(DisplayCutout displayCutout) {
        this.f457a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0014j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f457a, ((C0014j) obj).f457a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f457a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f457a + "}";
    }
}
