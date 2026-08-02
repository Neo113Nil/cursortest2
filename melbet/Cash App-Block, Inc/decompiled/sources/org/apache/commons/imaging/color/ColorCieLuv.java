package org.apache.commons.imaging.color;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class ColorCieLuv {
    public final double L;
    public final double u;
    public final double v;
    public static final ColorCieLuv BLACK = new ColorCieLuv(0.0d, 0.0d, 0.0d);
    public static final ColorCieLuv WHITE = new ColorCieLuv(100.0d, 0.0d, -0.017d);
    public static final ColorCieLuv RED = new ColorCieLuv(53.233d, 175.053d, 37.751d);
    public static final ColorCieLuv GREEN = new ColorCieLuv(87.737d, -83.08d, 107.401d);
    public static final ColorCieLuv BLUE = new ColorCieLuv(32.303d, -9.4d, -130.358d);

    public ColorCieLuv(double d, double d2, double d3) {
        this.L = d;
        this.u = d2;
        this.v = d3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorCieLuv.class != obj.getClass()) {
            return false;
        }
        ColorCieLuv colorCieLuv = (ColorCieLuv) obj;
        return Double.compare(colorCieLuv.L, this.L) == 0 && Double.compare(colorCieLuv.u, this.u) == 0 && Double.compare(colorCieLuv.v, this.v) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.L);
        long doubleToLongBits2 = Double.doubleToLongBits(this.u);
        int i = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.v);
        return (i * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{L: ");
        sb.append(this.L);
        sb.append(", u: ");
        sb.append(this.u);
        sb.append(", v: ");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.v, "}");
    }
}
