package org.apache.commons.imaging.color;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public final class ColorHunterLab {
    public final double L;
    public final double a;
    public final double b;
    public static final ColorHunterLab BLACK = new ColorHunterLab(0.0d, 0.0d, 0.0d);
    public static final ColorHunterLab WHITE = new ColorHunterLab(100.0d, -5.336d, 5.433d);
    public static final ColorHunterLab RED = new ColorHunterLab(46.109d, 78.962d, 29.794d);
    public static final ColorHunterLab GREEN = new ColorHunterLab(84.569d, -72.518d, 50.842d);
    public static final ColorHunterLab BLUE = new ColorHunterLab(26.87d, 72.885d, -190.923d);

    public ColorHunterLab(double d, double d2, double d3) {
        this.L = d;
        this.a = d2;
        this.b = d3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorHunterLab.class != obj.getClass()) {
            return false;
        }
        ColorHunterLab colorHunterLab = (ColorHunterLab) obj;
        return Double.compare(colorHunterLab.L, this.L) == 0 && Double.compare(colorHunterLab.a, this.a) == 0 && Double.compare(colorHunterLab.b, this.b) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.L);
        long doubleToLongBits2 = Double.doubleToLongBits(this.a);
        int i = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.b);
        return (i * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{L: ");
        sb.append(this.L);
        sb.append(", a: ");
        sb.append(this.a);
        sb.append(", b: ");
        return NavAction$$ExternalSyntheticOutline0.m(sb, this.b, "}");
    }
}
