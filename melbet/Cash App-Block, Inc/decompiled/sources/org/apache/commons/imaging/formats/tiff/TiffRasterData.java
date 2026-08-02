package org.apache.commons.imaging.formats.tiff;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class TiffRasterData {
    private final float[] data;
    private final int height;
    private final int width;

    public TiffRasterData(int i, int i2, float[] fArr) {
        if (i <= 0 || i2 <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Raster dimensions less than or equal to zero are not supported");
            throw null;
        }
        if (fArr == null || fArr.length < i * i2) {
            a$$ExternalSyntheticBUOutline0.m$3("Specified data does not contain sufficient elements");
            throw null;
        }
        this.width = i;
        this.height = i2;
        this.data = fArr;
    }

    public float[] getData() {
        return this.data;
    }

    public int getHeight() {
        return this.height;
    }

    public TiffRasterStatistics getSimpleStatistics() {
        return new TiffRasterStatistics(this, Float.NaN);
    }

    public float getValue(int i, int i2) {
        int i3;
        if (i >= 0 && i < (i3 = this.width) && i2 >= 0 && i2 < this.height) {
            return this.data[(i2 * i3) + i];
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m(i, i2, "Coordinates out of range (", ", ", ")"));
        return RecyclerView.DECELERATION_RATE;
    }

    public int getWidth() {
        return this.width;
    }

    public void setValue(int i, int i2, float f) {
        int i3;
        if (i < 0 || i >= (i3 = this.width) || i2 < 0 || i2 >= this.height) {
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m(i, i2, "Coordinates out of range (", ", ", ")"));
        } else {
            this.data[(i2 * i3) + i] = f;
        }
    }

    public TiffRasterStatistics getSimpleStatistics(float f) {
        return new TiffRasterStatistics(this, f);
    }

    public TiffRasterData(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.data = new float[i * i2];
            this.width = i;
            this.height = i2;
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Raster dimensions less than or equal to zero are not supported");
        throw null;
    }
}
