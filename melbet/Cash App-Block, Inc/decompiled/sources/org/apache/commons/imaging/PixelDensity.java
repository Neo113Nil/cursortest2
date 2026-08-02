package org.apache.commons.imaging;

/* loaded from: classes9.dex */
public final class PixelDensity {
    private static final int PIXEL_NO_UNIT = 0;
    private static final int PIXEL_PER_CENTIMETRE = 100;
    private static final int PIXEL_PER_INCH = 254;
    private static final int PIXEL_PER_METRE = 10000;
    private final double horizontalDensity;
    private final int unitLength;
    private final double verticalDensity;

    private PixelDensity(double d, double d2, int i) {
        this.horizontalDensity = d;
        this.verticalDensity = d2;
        this.unitLength = i;
    }

    public static PixelDensity createFromPixelsPerCentimetre(double d, double d2) {
        return new PixelDensity(d, d2, 100);
    }

    public static PixelDensity createFromPixelsPerInch(double d, double d2) {
        return new PixelDensity(d, d2, 254);
    }

    public static PixelDensity createFromPixelsPerMetre(double d, double d2) {
        return new PixelDensity(d, d2, 10000);
    }

    public static PixelDensity createUnitless(double d, double d2) {
        return new PixelDensity(d, d2, 0);
    }

    public double getRawHorizontalDensity() {
        return this.horizontalDensity;
    }

    public double getRawVerticalDensity() {
        return this.verticalDensity;
    }

    public double horizontalDensityCentimetres() {
        boolean isInCentimetres = isInCentimetres();
        double d = this.horizontalDensity;
        return isInCentimetres ? d : (d * 100.0d) / this.unitLength;
    }

    public double horizontalDensityInches() {
        boolean isInInches = isInInches();
        double d = this.horizontalDensity;
        return isInInches ? d : (d * 254.0d) / this.unitLength;
    }

    public double horizontalDensityMetres() {
        boolean isInMetres = isInMetres();
        double d = this.horizontalDensity;
        return isInMetres ? d : (d * 10000.0d) / this.unitLength;
    }

    public boolean isInCentimetres() {
        return this.unitLength == 100;
    }

    public boolean isInInches() {
        return this.unitLength == 254;
    }

    public boolean isInMetres() {
        return this.unitLength == 10000;
    }

    public boolean isUnitless() {
        return this.unitLength == 0;
    }

    public double verticalDensityCentimetres() {
        boolean isInCentimetres = isInCentimetres();
        double d = this.verticalDensity;
        return isInCentimetres ? d : (d * 100.0d) / this.unitLength;
    }

    public double verticalDensityInches() {
        boolean isInInches = isInInches();
        double d = this.verticalDensity;
        return isInInches ? d : (d * 254.0d) / this.unitLength;
    }

    public double verticalDensityMetres() {
        boolean isInMetres = isInMetres();
        double d = this.verticalDensity;
        return isInMetres ? d : (d * 10000.0d) / this.unitLength;
    }
}
