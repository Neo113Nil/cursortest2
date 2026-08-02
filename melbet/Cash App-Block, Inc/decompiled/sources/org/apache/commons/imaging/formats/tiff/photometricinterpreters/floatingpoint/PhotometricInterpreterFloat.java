package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.imaging.common.ImageBuilder;
import org.apache.commons.imaging.formats.tiff.TiffElement$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter;

/* loaded from: classes9.dex */
public class PhotometricInterpreterFloat extends PhotometricInterpreter {
    float maxFound;
    float minFound;
    int nFound;
    ArrayList<PaletteEntry> rangePaletteEntries;
    ArrayList<PaletteEntry> singleValuePaletteEntries;
    double sumFound;
    int xMax;
    int xMin;
    int yMax;
    int yMin;

    public PhotometricInterpreterFloat(List<PaletteEntry> list) {
        super(1, new int[]{32}, 0, 32, 32);
        this.rangePaletteEntries = new ArrayList<>();
        this.singleValuePaletteEntries = new ArrayList<>();
        this.minFound = Float.POSITIVE_INFINITY;
        this.maxFound = Float.NEGATIVE_INFINITY;
        if (list == null || list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Palette entries list must be non-null and non-empty");
            throw null;
        }
        for (PaletteEntry paletteEntry : list) {
            if (paletteEntry.coversSingleEntry()) {
                this.singleValuePaletteEntries.add(paletteEntry);
            } else {
                this.rangePaletteEntries.add(paletteEntry);
            }
        }
        TiffElement$$ExternalSyntheticLambda0 tiffElement$$ExternalSyntheticLambda0 = new TiffElement$$ExternalSyntheticLambda0(1);
        Collections.sort(this.rangePaletteEntries, tiffElement$$ExternalSyntheticLambda0);
        Collections.sort(this.singleValuePaletteEntries, tiffElement$$ExternalSyntheticLambda0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(PaletteEntry paletteEntry, PaletteEntry paletteEntry2) {
        return paletteEntry.getLowerBound() == paletteEntry2.getLowerBound() ? Double.compare(paletteEntry.getUpperBound(), paletteEntry2.getUpperBound()) : Double.compare(paletteEntry.getLowerBound(), paletteEntry2.getLowerBound());
    }

    public float getMaxFound() {
        return this.maxFound;
    }

    public int[] getMaxXY() {
        return new int[]{this.xMax, this.yMax};
    }

    public float getMeanFound() {
        int i = this.nFound;
        return i == 0 ? RecyclerView.DECELERATION_RATE : (float) (this.sumFound / i);
    }

    public float getMinFound() {
        return this.minFound;
    }

    public int[] getMinXY() {
        return new int[]{this.xMin, this.yMin};
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter
    public void interpretPixel(ImageBuilder imageBuilder, int[] iArr, int i, int i2) {
        float intBitsToFloat = Float.intBitsToFloat(iArr[0]);
        Iterator<PaletteEntry> it = this.singleValuePaletteEntries.iterator();
        while (it.hasNext()) {
            PaletteEntry next = it.next();
            if (next.isCovered(intBitsToFloat)) {
                imageBuilder.setRGB(i, i2, next.getARGB(intBitsToFloat));
                return;
            }
        }
        if (Float.isNaN(intBitsToFloat)) {
            return;
        }
        if (intBitsToFloat < this.minFound) {
            this.minFound = intBitsToFloat;
            this.xMin = i;
            this.yMin = i2;
        }
        if (intBitsToFloat > this.maxFound) {
            this.maxFound = intBitsToFloat;
            this.xMax = i;
            this.yMax = i2;
        }
        this.nFound++;
        this.sumFound += intBitsToFloat;
        Iterator<PaletteEntry> it2 = this.singleValuePaletteEntries.iterator();
        while (it2.hasNext()) {
            PaletteEntry next2 = it2.next();
            if (next2.isCovered(intBitsToFloat)) {
                imageBuilder.setRGB(i, i2, next2.getARGB(intBitsToFloat));
                return;
            }
        }
        Iterator<PaletteEntry> it3 = this.rangePaletteEntries.iterator();
        while (it3.hasNext()) {
            PaletteEntry next3 = it3.next();
            if (next3.isCovered(intBitsToFloat)) {
                imageBuilder.setRGB(i, i2, next3.getARGB(intBitsToFloat));
                return;
            }
        }
    }

    public int mapValueToARGB(float f) {
        Iterator<PaletteEntry> it = this.singleValuePaletteEntries.iterator();
        while (it.hasNext()) {
            PaletteEntry next = it.next();
            if (next.isCovered(f)) {
                return next.getARGB(f);
            }
        }
        if (Float.isNaN(f)) {
            return 0;
        }
        Iterator<PaletteEntry> it2 = this.rangePaletteEntries.iterator();
        while (it2.hasNext()) {
            PaletteEntry next2 = it2.next();
            if (next2.isCovered(f)) {
                return next2.getARGB(f);
            }
        }
        return 0;
    }

    public PhotometricInterpreterFloat(float f, float f2) {
        super(1, new int[]{32}, 0, 32, 32);
        this.rangePaletteEntries = new ArrayList<>();
        this.singleValuePaletteEntries = new ArrayList<>();
        this.minFound = Float.POSITIVE_INFINITY;
        this.maxFound = Float.NEGATIVE_INFINITY;
        if (f2 > f) {
            this.rangePaletteEntries.add(new PaletteEntryForRange(f, f2, Color.black, Color.white));
        } else {
            this.rangePaletteEntries.add(new PaletteEntryForRange(f2, f, Color.white, Color.black));
        }
    }
}
