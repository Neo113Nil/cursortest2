package c1;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: c1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f5597a;

    public C0381e(DisplayCutout displayCutout) {
        this.f5597a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0381e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f5597a, ((C0381e) obj).f5597a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f5597a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5597a + "}";
    }
}
