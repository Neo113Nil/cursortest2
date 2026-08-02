package org.apache.commons.imaging.palette;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public class PaletteFactory {
    public static final int COMPONENTS = 3;
    private static final Logger LOGGER = Logger.getLogger(PaletteFactory.class.getName());

    public static class DivisionCandidate {
        private final ColorSpaceSubset dst_a;
        private final ColorSpaceSubset dst_b;

        public DivisionCandidate(ColorSpaceSubset colorSpaceSubset, ColorSpaceSubset colorSpaceSubset2) {
            this.dst_a = colorSpaceSubset;
            this.dst_b = colorSpaceSubset2;
        }
    }

    private List<ColorSpaceSubset> divide(List<ColorSpaceSubset> list, int i, int[] iArr, int i2) {
        ArrayList arrayList = new ArrayList();
        do {
            int i3 = -1;
            ColorSpaceSubset colorSpaceSubset = null;
            for (ColorSpaceSubset colorSpaceSubset2 : list) {
                if (!arrayList.contains(colorSpaceSubset2)) {
                    int i4 = colorSpaceSubset2.total;
                    if (colorSpaceSubset == null || i4 > i3) {
                        colorSpaceSubset = colorSpaceSubset2;
                        i3 = i4;
                    }
                }
            }
            if (colorSpaceSubset == null) {
                break;
            }
            Logger logger = LOGGER;
            if (logger.isLoggable(Level.FINEST)) {
                logger.finest("\tarea: " + i3);
            }
            DivisionCandidate divideSubset2 = divideSubset2(iArr, colorSpaceSubset, i2);
            if (divideSubset2 != null) {
                list.remove(colorSpaceSubset);
                list.add(divideSubset2.dst_a);
                list.add(divideSubset2.dst_b);
            } else {
                arrayList.add(colorSpaceSubset);
            }
        } while (list.size() != i);
        return list;
    }

    private List<DivisionCandidate> divideSubset2(int[] iArr, ColorSpaceSubset colorSpaceSubset, int i, int i2) {
        if (LOGGER.isLoggable(Level.FINEST)) {
            colorSpaceSubset.dump(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "trying (", "): "));
        }
        int i3 = colorSpaceSubset.total;
        int[] iArr2 = colorSpaceSubset.mins;
        int[] iArr3 = new int[iArr2.length];
        int i4 = 0;
        System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        int[] iArr4 = colorSpaceSubset.maxs;
        int[] iArr5 = new int[iArr4.length];
        System.arraycopy(iArr4, 0, iArr5, 0, iArr4.length);
        int i5 = colorSpaceSubset.mins[i];
        int i6 = 0;
        while (i5 != colorSpaceSubset.maxs[i] + 1) {
            iArr3[i] = i5;
            iArr5[i] = i5;
            i6 = getFrequencyTotal(iArr, iArr3, iArr5, i2);
            i4 += i6;
            if (i4 >= i3 / 2) {
                break;
            }
            i5++;
        }
        int i7 = i4;
        DivisionCandidate finishDivision = finishDivision(colorSpaceSubset, i, i2, i7, i5);
        DivisionCandidate finishDivision2 = finishDivision(colorSpaceSubset, i, i2, i7 - i6, i5 - 1);
        ArrayList arrayList = new ArrayList();
        if (finishDivision != null) {
            arrayList.add(finishDivision);
        }
        if (finishDivision2 != null) {
            arrayList.add(finishDivision2);
        }
        return arrayList;
    }

    private DivisionCandidate finishDivision(ColorSpaceSubset colorSpaceSubset, int i, int i2, int i3, int i4) {
        int i5;
        Logger logger = LOGGER;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            colorSpaceSubset.dump(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "trying (", "): "));
        }
        int i6 = colorSpaceSubset.total;
        int[] iArr = colorSpaceSubset.mins;
        if (i4 < iArr[i] || i4 >= colorSpaceSubset.maxs[i] || i3 < 1 || i3 >= i6 || (i5 = i6 - i3) < 1 || i5 >= i6) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        int[] iArr3 = colorSpaceSubset.maxs;
        int[] iArr4 = new int[iArr3.length];
        System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
        iArr4[i] = i4;
        iArr2[i] = i4 + 1;
        if (logger.isLoggable(level)) {
            logger.finest("total: " + i6);
            logger.finest("first total: " + i3);
            logger.finest("second total: " + i5);
            logger.finest("slice: " + i4);
        }
        return new DivisionCandidate(new ColorSpaceSubset(i3, i2, colorSpaceSubset.mins, iArr4), new ColorSpaceSubset(i5, i2, iArr2, colorSpaceSubset.maxs));
    }

    private int getFrequencyTotal(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        int i2 = 0;
        for (int i3 = iArr2[2]; i3 <= iArr3[2]; i3++) {
            int i4 = i3 << (i * 2);
            for (int i5 = iArr2[1]; i5 <= iArr3[1]; i5++) {
                int i6 = i5 << i;
                for (int i7 = iArr2[0]; i7 <= iArr3[0]; i7++) {
                    i2 += iArr[i4 | i6 | i7];
                }
            }
        }
        return i2;
    }

    private int pixelToQuantizationTableIndex(int i, int i2) {
        int i3 = (1 << i2) - 1;
        int i4 = i;
        int i5 = 0;
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = i4 & 255;
            i4 >>= 8;
            i5 = (i5 << i2) | ((i7 >> (8 - i2)) & i3);
        }
        return i5;
    }

    public int countTransparentColors(BufferedImage bufferedImage) {
        if (!bufferedImage.getColorModel().hasAlpha()) {
            return 0;
        }
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int i = -1;
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int rgb = bufferedImage.getRGB(i3, i2);
                if (((rgb >> 24) & 255) < 255) {
                    if (i < 0) {
                        i = rgb;
                    } else if (rgb != i) {
                        return 2;
                    }
                }
            }
        }
        return i < 0 ? 0 : 1;
    }

    public int countTrasparentColors(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            if (((i2 >> 24) & 255) < 255) {
                if (i < 0) {
                    i = i2;
                } else if (i2 != i) {
                    return 2;
                }
            }
        }
        return i < 0 ? 0 : 1;
    }

    public boolean hasTransparency(BufferedImage bufferedImage, int i) {
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        if (!bufferedImage.getColorModel().hasAlpha()) {
            return false;
        }
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                if (((bufferedImage.getRGB(i3, i2) >> 24) & 255) < i) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isGrayscale(BufferedImage bufferedImage) {
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        if (6 == bufferedImage.getColorModel().getColorSpace().getType()) {
            return true;
        }
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                int rgb = bufferedImage.getRGB(i2, i);
                int i3 = (rgb >> 16) & 255;
                int i4 = (rgb >> 8) & 255;
                int i5 = rgb & 255;
                if (i3 != i4 || i3 != i5) {
                    return false;
                }
            }
        }
        return true;
    }

    public Palette makeExactRgbPaletteFancy(BufferedImage bufferedImage) {
        byte[] bArr = new byte[PKIFailureInfo.badSenderNonce];
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        for (int i = 0; i < height; i++) {
            for (int i2 = 0; i2 < width; i2++) {
                int rgb = bufferedImage.getRGB(i2, i);
                int i3 = 2097151 & rgb;
                bArr[i3] = (byte) ((1 << ((rgb >> 21) & 7)) | bArr[i3]);
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 2097152; i5++) {
            i4 += Integer.bitCount(bArr[i5] & 255);
        }
        Logger logger = LOGGER;
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("Used colors: " + i4);
        }
        int[] iArr = new int[i4];
        int i6 = 0;
        for (int i7 = 0; i7 < 2097152; i7++) {
            int i8 = bArr[i7] & 255;
            int i9 = 128;
            for (int i10 = 0; i10 < 8; i10++) {
                int i11 = i8 & i9;
                i9 >>>= 1;
                if (i11 > 0) {
                    iArr[i6] = ((7 - i10) << 21) | i7;
                    i6++;
                }
            }
        }
        Arrays.sort(iArr);
        return new SimplePalette(iArr);
    }

    public SimplePalette makeExactRgbPaletteSimple(BufferedImage bufferedImage, int i) {
        HashSet hashSet = new HashSet();
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        int i2 = 0;
        for (int i3 = 0; i3 < height; i3++) {
            for (int i4 = 0; i4 < width; i4++) {
                if (hashSet.add(Integer.valueOf(bufferedImage.getRGB(i4, i3) & 16777215)) && hashSet.size() > i) {
                    return null;
                }
            }
        }
        int[] iArr = new int[hashSet.size()];
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            iArr[i2] = ((Integer) it.next()).intValue();
            i2++;
        }
        Arrays.sort(iArr);
        return new SimplePalette(iArr);
    }

    public Palette makeQuantizedRgbPalette(BufferedImage bufferedImage, int i) {
        int[] iArr = new int[PKIFailureInfo.transactionIdInUse];
        int width = bufferedImage.getWidth();
        int height = bufferedImage.getHeight();
        ArrayList arrayList = new ArrayList();
        int i2 = width * height;
        ColorSpaceSubset colorSpaceSubset = new ColorSpaceSubset(i2, 6);
        arrayList.add(colorSpaceSubset);
        Logger logger = LOGGER;
        if (logger.isLoggable(Level.FINEST)) {
            logger.finest("pre total: " + getFrequencyTotal(iArr, colorSpaceSubset.mins, colorSpaceSubset.maxs, 6));
        }
        for (int i3 = 0; i3 < height; i3++) {
            for (int i4 = 0; i4 < width; i4++) {
                int pixelToQuantizationTableIndex = pixelToQuantizationTableIndex(bufferedImage.getRGB(i4, i3), 6);
                iArr[pixelToQuantizationTableIndex] = iArr[pixelToQuantizationTableIndex] + 1;
            }
        }
        Logger logger2 = LOGGER;
        Level level = Level.FINEST;
        if (logger2.isLoggable(level)) {
            logger2.finest("all total: " + getFrequencyTotal(iArr, colorSpaceSubset.mins, colorSpaceSubset.maxs, 6));
            logger2.finest("width * height: " + i2);
        }
        List<ColorSpaceSubset> divide = divide(arrayList, i, iArr, 6);
        if (logger2.isLoggable(level)) {
            logger2.finest("subsets: " + divide.size());
            logger2.finest("width*height: " + i2);
        }
        for (int i5 = 0; i5 < divide.size(); i5++) {
            ColorSpaceSubset colorSpaceSubset2 = divide.get(i5);
            colorSpaceSubset2.setAverageRGB(iArr);
            if (LOGGER.isLoggable(Level.FINEST)) {
                colorSpaceSubset2.dump(Boxes$$ExternalSyntheticOutline1.m(i5, ": "));
            }
        }
        Collections.sort(divide, ColorSpaceSubset.RGB_COMPARATOR);
        return new QuantizedPalette(divide, 6);
    }

    public Palette makeQuantizedRgbaPalette(BufferedImage bufferedImage, boolean z, int i) {
        return new MedianCutQuantizer(!z).process(bufferedImage, i, new LongestAxisMedianCut());
    }

    public boolean hasTransparency(BufferedImage bufferedImage) {
        return hasTransparency(bufferedImage, 255);
    }

    private DivisionCandidate divideSubset2(int[] iArr, ColorSpaceSubset colorSpaceSubset, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(divideSubset2(iArr, colorSpaceSubset, 0, i));
        arrayList.addAll(divideSubset2(iArr, colorSpaceSubset, 1, i));
        arrayList.addAll(divideSubset2(iArr, colorSpaceSubset, 2, i));
        Iterator it = arrayList.iterator();
        DivisionCandidate divisionCandidate = null;
        double d = Double.MAX_VALUE;
        while (it.hasNext()) {
            DivisionCandidate divisionCandidate2 = (DivisionCandidate) it.next();
            ColorSpaceSubset colorSpaceSubset2 = divisionCandidate2.dst_a;
            ColorSpaceSubset colorSpaceSubset3 = divisionCandidate2.dst_b;
            int i2 = colorSpaceSubset2.total;
            int i3 = colorSpaceSubset3.total;
            double abs = Math.abs(i2 - i3) / Math.max(i2, i3);
            if (divisionCandidate == null || abs < d) {
                divisionCandidate = divisionCandidate2;
                d = abs;
            }
        }
        return divisionCandidate;
    }
}
