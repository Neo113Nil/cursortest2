package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class td extends jl {
    public final int TSizfFm2Yiuu;
    public final long lS5Rgt96tfkO;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public td(int i, long j) {
        super(r0);
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            s0.a92UlCVFR9N8();
            porterDuffColorFilter = s0.Y1f8riQaR6yg(mm2.ngxnMNrpiKat(j), cs0.J54yh1s3n4Aq(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(mm2.ngxnMNrpiKat(j), cs0.xfACYKDMU6Dj(i));
        }
        this.lS5Rgt96tfkO = j;
        this.TSizfFm2Yiuu = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return hl.TSizfFm2Yiuu(this.lS5Rgt96tfkO, tdVar.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == tdVar.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        gl glVar = hl.Companion;
        return Integer.hashCode(this.TSizfFm2Yiuu) + (Long.hashCode(this.lS5Rgt96tfkO) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        o0.S9EYkSpbGuxq(this.lS5Rgt96tfkO, sb, ", blendMode=");
        sb.append((Object) sd.PxuCJdSBwIXG(this.TSizfFm2Yiuu));
        sb.append(')');
        return sb.toString();
    }
}
