package K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f397a;

    public C0009j(DisplayCutout displayCutout) {
        this.f397a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0009j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f397a, ((C0009j) obj).f397a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f397a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f397a + "}";
    }
}
