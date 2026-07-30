package com.google.maps.android;

/* loaded from: classes4.dex */
class MathUtil {
    static final double EARTH_RADIUS = 6371009.0d;

    MathUtil() {
    }

    static double arcHav(double d8) {
        return Math.asin(Math.sqrt(d8)) * 2.0d;
    }

    static double clamp(double d8, double d9, double d10) {
        return d8 < d9 ? d9 : d8 > d10 ? d10 : d8;
    }

    static double hav(double d8) {
        double sin = Math.sin(d8 * 0.5d);
        return sin * sin;
    }

    static double havDistance(double d8, double d9, double d10) {
        return hav(d8 - d9) + (hav(d10) * Math.cos(d8) * Math.cos(d9));
    }

    static double havFromSin(double d8) {
        double d9 = d8 * d8;
        return (d9 / (Math.sqrt(1.0d - d9) + 1.0d)) * 0.5d;
    }

    static double inverseMercator(double d8) {
        return (Math.atan(Math.exp(d8)) * 2.0d) - 1.5707963267948966d;
    }

    static double mercator(double d8) {
        return Math.log(Math.tan((d8 * 0.5d) + 0.7853981633974483d));
    }

    static double mod(double d8, double d9) {
        return ((d8 % d9) + d9) % d9;
    }

    static double sinFromHav(double d8) {
        return Math.sqrt(d8 * (1.0d - d8)) * 2.0d;
    }

    static double sinSumFromHav(double d8, double d9) {
        double sqrt = Math.sqrt((1.0d - d8) * d8);
        double sqrt2 = Math.sqrt((1.0d - d9) * d9);
        return ((sqrt + sqrt2) - (((sqrt * d9) + (sqrt2 * d8)) * 2.0d)) * 2.0d;
    }

    static double wrap(double d8, double d9, double d10) {
        return (d8 < d9 || d8 >= d10) ? mod(d8 - d9, d10 - d9) + d9 : d8;
    }
}
