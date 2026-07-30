package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l00 {
    public final DisplayCutout PxuCJdSBwIXG;

    public l00(DisplayCutout displayCutout) {
        this.PxuCJdSBwIXG = displayCutout;
    }

    public final wp0 PxuCJdSBwIXG() {
        return Build.VERSION.SDK_INT >= 30 ? wp0.Y1f8riQaR6yg(hnJvRxDXo0hm.Y1f8riQaR6yg(this.PxuCJdSBwIXG)) : wp0.e9gEMXR7LXtO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l00.class != obj.getClass()) {
            return false;
        }
        return this.PxuCJdSBwIXG.equals(((l00) obj).PxuCJdSBwIXG);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.PxuCJdSBwIXG.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.PxuCJdSBwIXG + "}";
    }
}
