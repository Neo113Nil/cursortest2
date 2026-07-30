package w;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3061a;

    public C0259e(DisplayCutout displayCutout) {
        this.f3061a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0259e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3061a, ((C0259e) obj).f3061a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f3061a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3061a + "}";
    }
}
