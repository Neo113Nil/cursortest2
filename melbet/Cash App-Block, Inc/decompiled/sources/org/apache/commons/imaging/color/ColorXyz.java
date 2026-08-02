package org.apache.commons.imaging.color;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class ColorXyz {
    public final double X;
    public final double Y;
    public final double Z;
    public static final ColorXyz BLACK = new ColorXyz(0.0d, 0.0d, 0.0d);
    public static final ColorXyz WHITE = new ColorXyz(95.05d, 100.0d, 108.9d);
    public static final ColorXyz RED = new ColorXyz(41.24d, 21.26d, 1.93d);
    public static final ColorXyz GREEN = new ColorXyz(35.76d, 71.52d, 11.92d);
    public static final ColorXyz BLUE = new ColorXyz(18.05d, 7.22d, 95.05d);

    public ColorXyz(double d, double d2, double d3) {
        this.X = d;
        this.Y = d2;
        this.Z = d3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorXyz.class != obj.getClass()) {
            return false;
        }
        ColorXyz colorXyz = (ColorXyz) obj;
        return Double.compare(colorXyz.X, this.X) == 0 && Double.compare(colorXyz.Y, this.Y) == 0 && Double.compare(colorXyz.Z, this.Z) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.X);
        long doubleToLongBits2 = Double.doubleToLongBits(this.Y);
        int i = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.Z);
        return (i * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{X: ");
        sb.append(this.X);
        sb.append(", Y: ");
        sb.append(this.Y);
        sb.append(", Z: ");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.Z, "}");
    }
}
