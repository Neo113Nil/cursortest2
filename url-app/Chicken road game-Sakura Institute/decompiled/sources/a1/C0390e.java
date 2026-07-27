package a1;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f4879a;

    public C0390e(DisplayCutout displayCutout) {
        this.f4879a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0390e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f4879a, ((C0390e) obj).f4879a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f4879a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f4879a + "}";
    }
}
