package q3;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f6113a;

    public j(DisplayCutout displayCutout) {
        this.f6113a = displayCutout;
    }

    public final i3.c a() {
        return Build.VERSION.SDK_INT >= 30 ? i3.c.c(i.b(this.f6113a)) : i3.c.f3420e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f6113a, ((j) obj).f6113a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f6113a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f6113a + "}";
    }
}
