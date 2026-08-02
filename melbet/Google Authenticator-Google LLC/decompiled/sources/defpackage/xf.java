package defpackage;

import android.view.DisplayCutout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xf {
    public final DisplayCutout a;

    public xf(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final int a() {
        int safeInsetLeft;
        safeInsetLeft = this.a.getSafeInsetLeft();
        return safeInsetLeft;
    }

    public final int b() {
        int safeInsetRight;
        safeInsetRight = this.a.getSafeInsetRight();
        return safeInsetRight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((xf) obj).a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
