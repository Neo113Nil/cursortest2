package org.apache.commons.imaging.palette;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Comparator;
import java.util.logging.Logger;

/* loaded from: classes9.dex */
class ColorSpaceSubset {
    private static final Logger LOGGER = Logger.getLogger(ColorSpaceSubset.class.getName());
    public static final RgbComparator RGB_COMPARATOR = new RgbComparator();
    private int index;
    final int[] maxs;
    final int[] mins;
    final int precision;
    final int precisionMask;
    int rgb;
    final int total;

    public ColorSpaceSubset(int i, int i2) {
        this.total = i;
        this.precision = i2;
        this.precisionMask = (1 << i2) - 1;
        this.mins = new int[3];
        this.maxs = new int[3];
        for (int i3 = 0; i3 < 3; i3++) {
            this.mins[i3] = 0;
            this.maxs[i3] = this.precisionMask;
        }
        this.rgb = -1;
    }

    public final boolean contains(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.precision;
        int i7 = i >> (8 - i6);
        int[] iArr = this.mins;
        if (iArr[0] > i7) {
            return false;
        }
        int[] iArr2 = this.maxs;
        return iArr2[0] >= i7 && iArr[1] <= (i4 = i2 >> (8 - i6)) && iArr2[1] >= i4 && iArr[2] <= (i5 = i3 >> (8 - i6)) && iArr2[2] >= i5;
    }

    public void dump(String str) {
        int[] iArr = this.maxs;
        int i = iArr[0];
        int[] iArr2 = this.mins;
        int i2 = (i - iArr2[0]) + 1;
        int i3 = (iArr[1] - iArr2[1]) + 1;
        int i4 = (iArr[2] - iArr2[2]) + 1;
        Logger logger = LOGGER;
        StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ": [");
        NavAction$$ExternalSyntheticOutline0.m(this.rgb, "] total : ", m108m);
        m108m.append(this.total);
        logger.fine(m108m.toString());
        StringBuilder sb = new StringBuilder("\trgb: ");
        NavAction$$ExternalSyntheticOutline0.m(this.rgb, ", red: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.mins[0] << (8 - this.precision), ", ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.maxs[0] << (8 - this.precision), ", green: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.mins[1] << (8 - this.precision), ", ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.maxs[1] << (8 - this.precision), ", blue: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.mins[2] << (8 - this.precision), ", ", sb);
        sb.append(Integer.toHexString(this.maxs[2] << (8 - this.precision)));
        logger.fine(sb.toString());
        logger.fine("\tred: " + this.mins[0] + ", " + this.maxs[0] + ", green: " + this.mins[1] + ", " + this.maxs[1] + ", blue: " + this.mins[2] + ", " + this.maxs[2]);
        StringBuilder sb2 = new StringBuilder("\trdiff: ");
        sb2.append(i2);
        Fragment$5$$ExternalSyntheticOutline0.m(i3, i4, ", gdiff: ", ", bdiff: ", sb2);
        sb2.append(", colorArea: ");
        sb2.append(i2 * i3 * i4);
        logger.fine(sb2.toString());
    }

    public void dumpJustRGB(String str) {
        Logger logger = LOGGER;
        StringBuilder sb = new StringBuilder("\trgb: ");
        NavAction$$ExternalSyntheticOutline0.m(this.rgb, ", red: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.mins[0] << (8 - this.precision), ", ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.maxs[0] << (8 - this.precision), ", green: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.mins[1] << (8 - this.precision), ", ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.maxs[1] << (8 - this.precision), ", blue: ", sb);
        NavAction$$ExternalSyntheticOutline0.m(this.mins[2] << (8 - this.precision), ", ", sb);
        sb.append(Integer.toHexString(this.maxs[2] << (8 - this.precision)));
        logger.fine(sb.toString());
    }

    public int getArea() {
        int[] iArr = this.maxs;
        int i = iArr[0];
        int[] iArr2 = this.mins;
        return ((i - iArr2[0]) + 1) * ((iArr[1] - iArr2[1]) + 1) * ((iArr[2] - iArr2[2]) + 1);
    }

    public final int getIndex() {
        return this.index;
    }

    public void setAverageRGB(int[] iArr) {
        int i = this.mins[0];
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (char c = 0; i <= this.maxs[c]; c = 0) {
            int i2 = this.mins[1];
            for (char c2 = 1; i2 <= this.maxs[c2]; c2 = 1) {
                for (int i3 = this.mins[2]; i3 <= this.maxs[2]; i3++) {
                    int i4 = this.precision;
                    int i5 = iArr[(i3 << (i4 * 2)) | (i2 << i4) | i];
                    j += i5 * (i << (8 - i4));
                    j2 += (i2 << (8 - i4)) * i5;
                    j3 += i5 * (i3 << (8 - i4));
                }
                i2++;
            }
            i++;
        }
        int i6 = this.total;
        this.rgb = (int) ((255 & (j3 / i6)) | (((j / i6) & 255) << 16) | (((j2 / i6) & 255) << 8));
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public static class RgbComparator implements Comparator<ColorSpaceSubset>, Serializable {
        private static final long serialVersionUID = 509214838111679029L;

        @Override // java.util.Comparator
        public int compare(ColorSpaceSubset colorSpaceSubset, ColorSpaceSubset colorSpaceSubset2) {
            return colorSpaceSubset.rgb - colorSpaceSubset2.rgb;
        }
    }

    public ColorSpaceSubset(int i, int i2, int[] iArr, int[] iArr2) {
        this.total = i;
        this.precision = i2;
        this.mins = iArr;
        this.maxs = iArr2;
        this.precisionMask = (1 << i2) - 1;
        this.rgb = -1;
    }
}
