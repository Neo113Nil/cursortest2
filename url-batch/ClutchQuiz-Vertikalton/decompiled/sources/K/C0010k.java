package K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0010k {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f412a;

    public C0010k(DisplayCutout displayCutout) {
        this.f412a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0010k.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f412a, ((C0010k) obj).f412a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f412a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f412a + "}";
    }
}
