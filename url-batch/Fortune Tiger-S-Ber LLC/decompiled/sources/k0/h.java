package k0;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2741a;

    public h(DisplayCutout displayCutout) {
        this.f2741a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2741a, ((h) obj).f2741a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f2741a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2741a + "}";
    }
}
