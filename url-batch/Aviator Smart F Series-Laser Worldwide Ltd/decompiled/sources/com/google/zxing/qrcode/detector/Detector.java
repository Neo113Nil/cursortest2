package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;

/* loaded from: classes4.dex */
public class Detector {
    private final BitMatrix image;
    private ResultPointCallback resultPointCallback;

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private float calculateModuleSizeOneWay(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float sizeOfBlackWhiteBlackRunBothWays = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float sizeOfBlackWhiteBlackRunBothWays2 = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        return Float.isNaN(sizeOfBlackWhiteBlackRunBothWays) ? sizeOfBlackWhiteBlackRunBothWays2 / 7.0f : Float.isNaN(sizeOfBlackWhiteBlackRunBothWays2) ? sizeOfBlackWhiteBlackRunBothWays / 7.0f : (sizeOfBlackWhiteBlackRunBothWays + sizeOfBlackWhiteBlackRunBothWays2) / 14.0f;
    }

    private static int computeDimension(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f8) {
        int round = (MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2) / f8) + MathUtils.round(ResultPoint.distance(resultPoint, resultPoint3) / f8)) / 2;
        int i8 = round + 7;
        int i9 = i8 & 3;
        if (i9 == 0) {
            return round + 8;
        }
        if (i9 == 2) {
            return round + 6;
        }
        if (i9 != 3) {
            return i8;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static PerspectiveTransform createTransform(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i8) {
        float x7;
        float y7;
        float f8;
        float f9 = i8 - 3.5f;
        if (resultPoint4 != null) {
            x7 = resultPoint4.getX();
            y7 = resultPoint4.getY();
            f8 = f9 - 3.0f;
        } else {
            x7 = (resultPoint2.getX() - resultPoint.getX()) + resultPoint3.getX();
            y7 = (resultPoint2.getY() - resultPoint.getY()) + resultPoint3.getY();
            f8 = f9;
        }
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f9, 3.5f, f8, f8, 3.5f, f9, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), x7, y7, resultPoint3.getX(), resultPoint3.getY());
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int i8) {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i8, i8, perspectiveTransform);
    }

    private float sizeOfBlackWhiteBlackRun(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Detector detector;
        boolean z7;
        boolean z8;
        int i17 = 1;
        boolean z9 = Math.abs(i11 - i9) > Math.abs(i10 - i8);
        if (z9) {
            i13 = i8;
            i12 = i9;
            i15 = i10;
            i14 = i11;
        } else {
            i12 = i8;
            i13 = i9;
            i14 = i10;
            i15 = i11;
        }
        int abs = Math.abs(i14 - i12);
        int abs2 = Math.abs(i15 - i13);
        int i18 = (-abs) / 2;
        int i19 = i12 < i14 ? 1 : -1;
        int i20 = i13 < i15 ? 1 : -1;
        int i21 = i14 + i19;
        int i22 = i12;
        int i23 = i13;
        int i24 = 0;
        while (true) {
            if (i22 == i21) {
                i16 = i21;
                break;
            }
            int i25 = z9 ? i23 : i22;
            int i26 = z9 ? i22 : i23;
            if (i24 == i17) {
                detector = this;
                z7 = z9;
                i16 = i21;
                z8 = true;
            } else {
                detector = this;
                z7 = z9;
                i16 = i21;
                z8 = false;
            }
            if (z8 == detector.image.get(i25, i26)) {
                if (i24 == 2) {
                    return MathUtils.distance(i22, i23, i12, i13);
                }
                i24++;
            }
            i18 += abs2;
            if (i18 > 0) {
                if (i23 == i15) {
                    break;
                }
                i23 += i20;
                i18 -= abs;
            }
            i22 += i19;
            i21 = i16;
            z9 = z7;
            i17 = 1;
        }
        if (i24 == 2) {
            return MathUtils.distance(i16, i15, i12, i13);
        }
        return Float.NaN;
    }

    private float sizeOfBlackWhiteBlackRunBothWays(int i8, int i9, int i10, int i11) {
        float f8;
        float f9;
        float sizeOfBlackWhiteBlackRun = sizeOfBlackWhiteBlackRun(i8, i9, i10, i11);
        int i12 = i8 - (i10 - i8);
        int i13 = 0;
        if (i12 < 0) {
            f8 = i8 / (i8 - i12);
            i12 = 0;
        } else if (i12 >= this.image.getWidth()) {
            f8 = ((this.image.getWidth() - 1) - i8) / (i12 - i8);
            i12 = this.image.getWidth() - 1;
        } else {
            f8 = 1.0f;
        }
        float f10 = i9;
        int i14 = (int) (f10 - ((i11 - i9) * f8));
        if (i14 < 0) {
            f9 = f10 / (i9 - i14);
        } else if (i14 >= this.image.getHeight()) {
            f9 = ((this.image.getHeight() - 1) - i9) / (i14 - i9);
            i13 = this.image.getHeight() - 1;
        } else {
            i13 = i14;
            f9 = 1.0f;
        }
        return (sizeOfBlackWhiteBlackRun + sizeOfBlackWhiteBlackRun(i8, i9, (int) (i8 + ((i12 - i8) * f9)), i13)) - 1.0f;
    }

    protected final float calculateModuleSize(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        return (calculateModuleSizeOneWay(resultPoint, resultPoint2) + calculateModuleSizeOneWay(resultPoint, resultPoint3)) / 2.0f;
    }

    public DetectorResult detect() {
        return detect(null);
    }

    protected final AlignmentPattern findAlignmentInRegion(float f8, int i8, int i9, float f9) {
        int i10 = (int) (f9 * f8);
        int max = Math.max(0, i8 - i10);
        int min = Math.min(this.image.getWidth() - 1, i8 + i10) - max;
        float f10 = 3.0f * f8;
        if (min < f10) {
            throw NotFoundException.getNotFoundInstance();
        }
        int max2 = Math.max(0, i9 - i10);
        int min2 = Math.min(this.image.getHeight() - 1, i9 + i10) - max2;
        if (min2 >= f10) {
            return new AlignmentPatternFinder(this.image, max, max2, min, min2, f8, this.resultPointCallback).find();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    protected final BitMatrix getImage() {
        return this.image;
    }

    protected final ResultPointCallback getResultPointCallback() {
        return this.resultPointCallback;
    }

    protected final DetectorResult processFinderPatternInfo(FinderPatternInfo finderPatternInfo) {
        AlignmentPattern alignmentPattern;
        FinderPattern topLeft = finderPatternInfo.getTopLeft();
        FinderPattern topRight = finderPatternInfo.getTopRight();
        FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float calculateModuleSize = calculateModuleSize(topLeft, topRight, bottomLeft);
        if (calculateModuleSize < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int computeDimension = computeDimension(topLeft, topRight, bottomLeft, calculateModuleSize);
        Version provisionalVersionForDimension = Version.getProvisionalVersionForDimension(computeDimension);
        int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion() - 7;
        if (provisionalVersionForDimension.getAlignmentPatternCenters().length > 0) {
            float x7 = (topRight.getX() - topLeft.getX()) + bottomLeft.getX();
            float y7 = (topRight.getY() - topLeft.getY()) + bottomLeft.getY();
            float f8 = 1.0f - (3.0f / dimensionForVersion);
            int x8 = (int) (topLeft.getX() + ((x7 - topLeft.getX()) * f8));
            int y8 = (int) (topLeft.getY() + (f8 * (y7 - topLeft.getY())));
            for (int i8 = 4; i8 <= 16; i8 <<= 1) {
                try {
                    alignmentPattern = findAlignmentInRegion(calculateModuleSize, x8, y8, i8);
                    break;
                } catch (NotFoundException unused) {
                }
            }
        }
        alignmentPattern = null;
        return new DetectorResult(sampleGrid(this.image, createTransform(topLeft, topRight, bottomLeft, alignmentPattern, computeDimension), computeDimension), alignmentPattern == null ? new ResultPoint[]{bottomLeft, topLeft, topRight} : new ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPattern});
    }

    public final DetectorResult detect(Map<DecodeHintType, ?> map) {
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        this.resultPointCallback = resultPointCallback;
        return processFinderPatternInfo(new FinderPatternFinder(this.image, resultPointCallback).find(map));
    }
}
