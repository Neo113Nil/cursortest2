package androidx.palette.graphics;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import androidx.palette.graphics.Palette;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
final class ColorCutQuantizer {
    static final int COMPONENT_BLUE = -1;
    static final int COMPONENT_GREEN = -2;
    static final int COMPONENT_RED = -3;
    private static final String LOG_TAG = "ColorCutQuantizer";
    private static final boolean LOG_TIMINGS = false;
    private static final int QUANTIZE_WORD_MASK = 31;
    private static final int QUANTIZE_WORD_WIDTH = 5;
    private static final Comparator<Vbox> VBOX_COMPARATOR_VOLUME = new Comparator<Vbox>() { // from class: androidx.palette.graphics.ColorCutQuantizer.1
        @Override // java.util.Comparator
        public int compare(Vbox vbox, Vbox vbox2) {
            return vbox2.getVolume() - vbox.getVolume();
        }
    };
    final int[] mColors;
    final Palette.Filter[] mFilters;
    final int[] mHistogram;
    final List<Palette.Swatch> mQuantizedColors;
    private final float[] mTempHsl = new float[3];

    @Nullable
    final TimingLogger mTimingLogger = null;

    private class Vbox {
        private int mLowerIndex;
        private int mMaxBlue;
        private int mMaxGreen;
        private int mMaxRed;
        private int mMinBlue;
        private int mMinGreen;
        private int mMinRed;
        private int mPopulation;
        private int mUpperIndex;

        Vbox(int i8, int i9) {
            this.mLowerIndex = i8;
            this.mUpperIndex = i9;
            fitBox();
        }

        final boolean canSplit() {
            return getColorCount() > 1;
        }

        final int findSplitPoint() {
            int longestColorDimension = getLongestColorDimension();
            ColorCutQuantizer colorCutQuantizer = ColorCutQuantizer.this;
            int[] iArr = colorCutQuantizer.mColors;
            int[] iArr2 = colorCutQuantizer.mHistogram;
            ColorCutQuantizer.modifySignificantOctet(iArr, longestColorDimension, this.mLowerIndex, this.mUpperIndex);
            Arrays.sort(iArr, this.mLowerIndex, this.mUpperIndex + 1);
            ColorCutQuantizer.modifySignificantOctet(iArr, longestColorDimension, this.mLowerIndex, this.mUpperIndex);
            int i8 = this.mPopulation / 2;
            int i9 = this.mLowerIndex;
            int i10 = 0;
            while (true) {
                int i11 = this.mUpperIndex;
                if (i9 > i11) {
                    return this.mLowerIndex;
                }
                i10 += iArr2[iArr[i9]];
                if (i10 >= i8) {
                    return Math.min(i11 - 1, i9);
                }
                i9++;
            }
        }

        final void fitBox() {
            ColorCutQuantizer colorCutQuantizer = ColorCutQuantizer.this;
            int[] iArr = colorCutQuantizer.mColors;
            int[] iArr2 = colorCutQuantizer.mHistogram;
            int i8 = Integer.MAX_VALUE;
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            for (int i15 = this.mLowerIndex; i15 <= this.mUpperIndex; i15++) {
                int i16 = iArr[i15];
                i14 += iArr2[i16];
                int quantizedRed = ColorCutQuantizer.quantizedRed(i16);
                int quantizedGreen = ColorCutQuantizer.quantizedGreen(i16);
                int quantizedBlue = ColorCutQuantizer.quantizedBlue(i16);
                if (quantizedRed > i11) {
                    i11 = quantizedRed;
                }
                if (quantizedRed < i8) {
                    i8 = quantizedRed;
                }
                if (quantizedGreen > i12) {
                    i12 = quantizedGreen;
                }
                if (quantizedGreen < i9) {
                    i9 = quantizedGreen;
                }
                if (quantizedBlue > i13) {
                    i13 = quantizedBlue;
                }
                if (quantizedBlue < i10) {
                    i10 = quantizedBlue;
                }
            }
            this.mMinRed = i8;
            this.mMaxRed = i11;
            this.mMinGreen = i9;
            this.mMaxGreen = i12;
            this.mMinBlue = i10;
            this.mMaxBlue = i13;
            this.mPopulation = i14;
        }

        final Palette.Swatch getAverageColor() {
            ColorCutQuantizer colorCutQuantizer = ColorCutQuantizer.this;
            int[] iArr = colorCutQuantizer.mColors;
            int[] iArr2 = colorCutQuantizer.mHistogram;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = this.mLowerIndex; i12 <= this.mUpperIndex; i12++) {
                int i13 = iArr[i12];
                int i14 = iArr2[i13];
                i9 += i14;
                i8 += ColorCutQuantizer.quantizedRed(i13) * i14;
                i10 += ColorCutQuantizer.quantizedGreen(i13) * i14;
                i11 += i14 * ColorCutQuantizer.quantizedBlue(i13);
            }
            float f8 = i9;
            return new Palette.Swatch(ColorCutQuantizer.approximateToRgb888(Math.round(i8 / f8), Math.round(i10 / f8), Math.round(i11 / f8)), i9);
        }

        final int getColorCount() {
            return (this.mUpperIndex + 1) - this.mLowerIndex;
        }

        final int getLongestColorDimension() {
            int i8 = this.mMaxRed - this.mMinRed;
            int i9 = this.mMaxGreen - this.mMinGreen;
            int i10 = this.mMaxBlue - this.mMinBlue;
            if (i8 < i9 || i8 < i10) {
                return (i9 < i8 || i9 < i10) ? -1 : -2;
            }
            return -3;
        }

        final int getVolume() {
            return ((this.mMaxRed - this.mMinRed) + 1) * ((this.mMaxGreen - this.mMinGreen) + 1) * ((this.mMaxBlue - this.mMinBlue) + 1);
        }

        final Vbox splitBox() {
            if (!canSplit()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int findSplitPoint = findSplitPoint();
            Vbox vbox = ColorCutQuantizer.this.new Vbox(findSplitPoint + 1, this.mUpperIndex);
            this.mUpperIndex = findSplitPoint;
            fitBox();
            return vbox;
        }
    }

    ColorCutQuantizer(int[] iArr, int i8, Palette.Filter[] filterArr) {
        this.mFilters = filterArr;
        int[] iArr2 = new int[32768];
        this.mHistogram = iArr2;
        for (int i9 = 0; i9 < iArr.length; i9++) {
            int quantizeFromRgb888 = quantizeFromRgb888(iArr[i9]);
            iArr[i9] = quantizeFromRgb888;
            iArr2[quantizeFromRgb888] = iArr2[quantizeFromRgb888] + 1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 32768; i11++) {
            if (iArr2[i11] > 0 && shouldIgnoreColor(i11)) {
                iArr2[i11] = 0;
            }
            if (iArr2[i11] > 0) {
                i10++;
            }
        }
        int[] iArr3 = new int[i10];
        this.mColors = iArr3;
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0) {
                iArr3[i12] = i13;
                i12++;
            }
        }
        if (i10 > i8) {
            this.mQuantizedColors = quantizePixels(i8);
            return;
        }
        this.mQuantizedColors = new ArrayList();
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = iArr3[i14];
            this.mQuantizedColors.add(new Palette.Swatch(approximateToRgb888(i15), iArr2[i15]));
        }
    }

    static int approximateToRgb888(int i8, int i9, int i10) {
        return Color.rgb(modifyWordWidth(i8, 5, 8), modifyWordWidth(i9, 5, 8), modifyWordWidth(i10, 5, 8));
    }

    private List<Palette.Swatch> generateAverageColors(Collection<Vbox> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<Vbox> it = collection.iterator();
        while (it.hasNext()) {
            Palette.Swatch averageColor = it.next().getAverageColor();
            if (!shouldIgnoreColor(averageColor)) {
                arrayList.add(averageColor);
            }
        }
        return arrayList;
    }

    static void modifySignificantOctet(int[] iArr, int i8, int i9, int i10) {
        if (i8 == -2) {
            while (i9 <= i10) {
                int i11 = iArr[i9];
                iArr[i9] = quantizedBlue(i11) | (quantizedGreen(i11) << 10) | (quantizedRed(i11) << 5);
                i9++;
            }
            return;
        }
        if (i8 != -1) {
            return;
        }
        while (i9 <= i10) {
            int i12 = iArr[i9];
            iArr[i9] = quantizedRed(i12) | (quantizedBlue(i12) << 10) | (quantizedGreen(i12) << 5);
            i9++;
        }
    }

    private static int modifyWordWidth(int i8, int i9, int i10) {
        return (i10 > i9 ? i8 << (i10 - i9) : i8 >> (i9 - i10)) & ((1 << i10) - 1);
    }

    private static int quantizeFromRgb888(int i8) {
        return modifyWordWidth(Color.blue(i8), 8, 5) | (modifyWordWidth(Color.red(i8), 8, 5) << 10) | (modifyWordWidth(Color.green(i8), 8, 5) << 5);
    }

    private List<Palette.Swatch> quantizePixels(int i8) {
        PriorityQueue<Vbox> priorityQueue = new PriorityQueue<>(i8, VBOX_COMPARATOR_VOLUME);
        priorityQueue.offer(new Vbox(0, this.mColors.length - 1));
        splitBoxes(priorityQueue, i8);
        return generateAverageColors(priorityQueue);
    }

    static int quantizedBlue(int i8) {
        return i8 & 31;
    }

    static int quantizedGreen(int i8) {
        return (i8 >> 5) & 31;
    }

    static int quantizedRed(int i8) {
        return (i8 >> 10) & 31;
    }

    private boolean shouldIgnoreColor(int i8) {
        int approximateToRgb888 = approximateToRgb888(i8);
        ColorUtils.colorToHSL(approximateToRgb888, this.mTempHsl);
        return shouldIgnoreColor(approximateToRgb888, this.mTempHsl);
    }

    private void splitBoxes(PriorityQueue<Vbox> priorityQueue, int i8) {
        Vbox poll;
        while (priorityQueue.size() < i8 && (poll = priorityQueue.poll()) != null && poll.canSplit()) {
            priorityQueue.offer(poll.splitBox());
            priorityQueue.offer(poll);
        }
    }

    List<Palette.Swatch> getQuantizedColors() {
        return this.mQuantizedColors;
    }

    private boolean shouldIgnoreColor(Palette.Swatch swatch) {
        return shouldIgnoreColor(swatch.getRgb(), swatch.getHsl());
    }

    private static int approximateToRgb888(int i8) {
        return approximateToRgb888(quantizedRed(i8), quantizedGreen(i8), quantizedBlue(i8));
    }

    private boolean shouldIgnoreColor(int i8, float[] fArr) {
        Palette.Filter[] filterArr = this.mFilters;
        if (filterArr != null && filterArr.length > 0) {
            int length = filterArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                if (!this.mFilters[i9].isAllowed(i8, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
