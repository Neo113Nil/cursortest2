package a1;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3550a;

    public C0167e(DisplayCutout displayCutout) {
        this.f3550a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0167e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3550a, ((C0167e) obj).f3550a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f3550a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3550a + "}";
    }
}
