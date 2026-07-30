package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class re {
    public static final qe Companion = new qe();
    public final int PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final int lS5Rgt96tfkO;

    static {
        new re(0, 0, 0, 0);
    }

    public re(int i, int i2, int i3, int i4) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = i2;
        this.TSizfFm2Yiuu = i3;
        this.Y1f8riQaR6yg = i4;
        if (i > i3) {
            u9.e9gEMXR7LXtO(o0.rtx2ld2ELZv4(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        u9.e9gEMXR7LXtO(o0.rtx2ld2ELZv4(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!re.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        re reVar = (re) obj;
        return this.PxuCJdSBwIXG == reVar.PxuCJdSBwIXG && this.lS5Rgt96tfkO == reVar.lS5Rgt96tfkO && this.TSizfFm2Yiuu == reVar.TSizfFm2Yiuu && this.Y1f8riQaR6yg == reVar.Y1f8riQaR6yg;
    }

    public final int hashCode() {
        return (((((this.PxuCJdSBwIXG * 31) + this.lS5Rgt96tfkO) * 31) + this.TSizfFm2Yiuu) * 31) + this.Y1f8riQaR6yg;
    }

    public final String toString() {
        return re.class.getSimpleName() + " { [" + this.PxuCJdSBwIXG + ',' + this.lS5Rgt96tfkO + ',' + this.TSizfFm2Yiuu + ',' + this.Y1f8riQaR6yg + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public re(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
