package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wb0 {
    public final DisplayCutout a;

    public wb0(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final z21 a() {
        return Build.VERSION.SDK_INT >= 30 ? z21.c(c2.e(this.a)) : z21.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wb0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((wb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
