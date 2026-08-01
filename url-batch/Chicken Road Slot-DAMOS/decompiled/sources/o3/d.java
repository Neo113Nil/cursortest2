package o3;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f7384a;

    public d(DisplayCutout displayCutout) {
        this.f7384a = displayCutout;
    }

    public final h3.b a() {
        return Build.VERSION.SDK_INT >= 30 ? h3.b.c(f2.b.d(this.f7384a)) : h3.b.f4442e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f7384a.equals(((d) obj).f7384a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f7384a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f7384a + "}";
    }
}
