package D;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: D.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f288a;

    public C0092e(DisplayCutout displayCutout) {
        this.f288a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0092e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f288a, ((C0092e) obj).f288a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f288a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f288a + "}";
    }
}
