package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

import java.awt.Color;

/* loaded from: classes9.dex */
public interface PaletteEntry {
    boolean coversSingleEntry();

    int getARGB(float f);

    Color getColor(float f);

    float getLowerBound();

    float getUpperBound();

    boolean isCovered(float f);
}
