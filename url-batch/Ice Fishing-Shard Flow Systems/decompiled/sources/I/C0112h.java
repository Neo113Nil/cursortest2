package I;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: I.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112h {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f1191a;

    public C0112h(DisplayCutout displayCutout) {
        this.f1191a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0112h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f1191a, ((C0112h) obj).f1191a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f1191a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1191a + "}";
    }
}
