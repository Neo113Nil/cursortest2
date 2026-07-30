package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m00 {
    public final String PxuCJdSBwIXG;
    public final int TSizfFm2Yiuu;
    public final int lS5Rgt96tfkO;

    public m00(int i, int i2, String str) {
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = i;
        this.TSizfFm2Yiuu = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m00)) {
            return false;
        }
        m00 m00Var = (m00) obj;
        return this.PxuCJdSBwIXG.equals(m00Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == m00Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu == m00Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.lS5Rgt96tfkO);
        Integer valueOf2 = Integer.valueOf(this.TSizfFm2Yiuu);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.PxuCJdSBwIXG, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        return "DisplayShapeCompat{ spec=" + Integer.valueOf(this.PxuCJdSBwIXG.hashCode()) + " displayWidth=" + this.lS5Rgt96tfkO + " displayHeight=" + this.TSizfFm2Yiuu + " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}";
    }
}
