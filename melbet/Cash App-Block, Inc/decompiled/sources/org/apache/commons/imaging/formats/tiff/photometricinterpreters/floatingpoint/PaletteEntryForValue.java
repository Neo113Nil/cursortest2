package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.awt.Color;

/* loaded from: classes9.dex */
public class PaletteEntryForValue implements PaletteEntry {
    private final Color color;
    private final int iColor;
    private boolean isNull;
    private final float value;

    public PaletteEntryForValue(float f, Color color) {
        if (color == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Null colors not allowed");
            throw null;
        }
        this.value = f;
        this.color = color;
        this.iColor = color.getRGB();
        this.isNull = Float.isNaN(f);
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public boolean coversSingleEntry() {
        return true;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public int getARGB(float f) {
        if ((this.isNull && Float.isNaN(f)) || f == this.value) {
            return this.iColor;
        }
        return 0;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public Color getColor(float f) {
        if ((this.isNull && Float.isNaN(f)) || f == this.value) {
            return this.color;
        }
        return null;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public float getLowerBound() {
        return this.value;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public float getUpperBound() {
        return this.value;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public boolean isCovered(float f) {
        return this.isNull ? Float.isNaN(f) : f == this.value;
    }

    public String toString() {
        return "PaletteEntry for single value" + this.value;
    }
}
