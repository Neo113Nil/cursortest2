package K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f624a;

    public C0013i(DisplayCutout displayCutout) {
        this.f624a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0013i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f624a, ((C0013i) obj).f624a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f624a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f624a + "}";
    }
}
