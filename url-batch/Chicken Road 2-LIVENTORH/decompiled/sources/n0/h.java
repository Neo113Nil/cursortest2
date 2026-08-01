package n0;

import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f2744a;

    public h(DisplayCutout displayCutout) {
        this.f2744a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f2744a, ((h) obj).f2744a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f2744a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f2744a + "}";
    }
}
