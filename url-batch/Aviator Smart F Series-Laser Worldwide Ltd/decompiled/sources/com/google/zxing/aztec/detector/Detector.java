package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* loaded from: classes4.dex */
public final class Detector {
    private static final int[] EXPECTED_CORNER_BITS = {3808, 476, 2107, 1799};
    private boolean compact;
    private final BitMatrix image;
    private int nbCenterLayers;
    private int nbDataBlocks;
    private int nbLayers;
    private int shift;

    static final class Point {

        /* renamed from: x, reason: collision with root package name */
        private final int f15126x;

        /* renamed from: y, reason: collision with root package name */
        private final int f15127y;

        Point(int i8, int i9) {
            this.f15126x = i8;
            this.f15127y = i9;
        }

        int getX() {
            return this.f15126x;
        }

        int getY() {
            return this.f15127y;
        }

        ResultPoint toResultPoint() {
            return new ResultPoint(getX(), getY());
        }

        public String toString() {
            return "<" + this.f15126x + ' ' + this.f15127y + '>';
        }
    }

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private static float distance(Point point, Point point2) {
        return MathUtils.distance(point.getX(), point.getY(), point2.getX(), point2.getY());
    }

    private static ResultPoint[] expandSquare(ResultPoint[] resultPointArr, int i8, int i9) {
        float f8 = i9 / (i8 * 2.0f);
        float x7 = resultPointArr[0].getX() - resultPointArr[2].getX();
        float y7 = resultPointArr[0].getY() - resultPointArr[2].getY();
        float x8 = (resultPointArr[0].getX() + resultPointArr[2].getX()) / 2.0f;
        float y8 = (resultPointArr[0].getY() + resultPointArr[2].getY()) / 2.0f;
        float f9 = x7 * f8;
        float f10 = y7 * f8;
        ResultPoint resultPoint = new ResultPoint(x8 + f9, y8 + f10);
        ResultPoint resultPoint2 = new ResultPoint(x8 - f9, y8 - f10);
        float x9 = resultPointArr[1].getX() - resultPointArr[3].getX();
        float y9 = resultPointArr[1].getY() - resultPointArr[3].getY();
        float x10 = (resultPointArr[1].getX() + resultPointArr[3].getX()) / 2.0f;
        float y10 = (resultPointArr[1].getY() + resultPointArr[3].getY()) / 2.0f;
        float f11 = x9 * f8;
        float f12 = f8 * y9;
        return new ResultPoint[]{resultPoint, new ResultPoint(x10 + f11, y10 + f12), resultPoint2, new ResultPoint(x10 - f11, y10 - f12)};
    }

    private void extractParameters(ResultPoint[] resultPointArr) {
        long j8;
        long j9;
        if (!isValid(resultPointArr[0]) || !isValid(resultPointArr[1]) || !isValid(resultPointArr[2]) || !isValid(resultPointArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i8 = this.nbCenterLayers * 2;
        int[] iArr = {sampleLine(resultPointArr[0], resultPointArr[1], i8), sampleLine(resultPointArr[1], resultPointArr[2], i8), sampleLine(resultPointArr[2], resultPointArr[3], i8), sampleLine(resultPointArr[3], resultPointArr[0], i8)};
        this.shift = getRotation(iArr, i8);
        long j10 = 0;
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = iArr[(this.shift + i9) % 4];
            if (this.compact) {
                j8 = j10 << 7;
                j9 = (i10 >> 1) & 127;
            } else {
                j8 = j10 << 10;
                j9 = ((i10 >> 2) & 992) + ((i10 >> 1) & 31);
            }
            j10 = j8 + j9;
        }
        int correctedParameterData = getCorrectedParameterData(j10, this.compact);
        if (this.compact) {
            this.nbLayers = (correctedParameterData >> 6) + 1;
            this.nbDataBlocks = (correctedParameterData & 63) + 1;
        } else {
            this.nbLayers = (correctedParameterData >> 11) + 1;
            this.nbDataBlocks = (correctedParameterData & 2047) + 1;
        }
    }

    private ResultPoint[] getBullsEyeCorners(Point point) {
        this.nbCenterLayers = 1;
        Point point2 = point;
        Point point3 = point2;
        Point point4 = point3;
        Point point5 = point4;
        boolean z7 = true;
        while (this.nbCenterLayers < 9) {
            Point firstDifferent = getFirstDifferent(point2, z7, 1, -1);
            Point firstDifferent2 = getFirstDifferent(point3, z7, 1, 1);
            Point firstDifferent3 = getFirstDifferent(point4, z7, -1, 1);
            Point firstDifferent4 = getFirstDifferent(point5, z7, -1, -1);
            if (this.nbCenterLayers > 2) {
                double distance = (distance(firstDifferent4, firstDifferent) * this.nbCenterLayers) / (distance(point5, point2) * (this.nbCenterLayers + 2));
                if (distance < 0.75d || distance > 1.25d || !isWhiteOrBlackRectangle(firstDifferent, firstDifferent2, firstDifferent3, firstDifferent4)) {
                    break;
                }
            }
            z7 = !z7;
            this.nbCenterLayers++;
            point5 = firstDifferent4;
            point2 = firstDifferent;
            point3 = firstDifferent2;
            point4 = firstDifferent3;
        }
        int i8 = this.nbCenterLayers;
        if (i8 != 5 && i8 != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.compact = i8 == 5;
        ResultPoint[] resultPointArr = {new ResultPoint(point2.getX() + 0.5f, point2.getY() - 0.5f), new ResultPoint(point3.getX() + 0.5f, point3.getY() + 0.5f), new ResultPoint(point4.getX() - 0.5f, point4.getY() + 0.5f), new ResultPoint(point5.getX() - 0.5f, point5.getY() - 0.5f)};
        int i9 = this.nbCenterLayers;
        return expandSquare(resultPointArr, (i9 * 2) - 3, i9 * 2);
    }

    private int getColor(Point point, Point point2) {
        float distance = distance(point, point2);
        float x7 = (point2.getX() - point.getX()) / distance;
        float y7 = (point2.getY() - point.getY()) / distance;
        float x8 = point.getX();
        float y8 = point.getY();
        boolean z7 = this.image.get(point.getX(), point.getY());
        int ceil = (int) Math.ceil(distance);
        int i8 = 0;
        for (int i9 = 0; i9 < ceil; i9++) {
            x8 += x7;
            y8 += y7;
            if (this.image.get(MathUtils.round(x8), MathUtils.round(y8)) != z7) {
                i8++;
            }
        }
        float f8 = i8 / distance;
        if (f8 <= 0.1f || f8 >= 0.9f) {
            return (f8 <= 0.1f) == z7 ? 1 : -1;
        }
        return 0;
    }

    private static int getCorrectedParameterData(long j8, boolean z7) {
        int i8;
        int i9;
        if (z7) {
            i8 = 7;
            i9 = 2;
        } else {
            i8 = 10;
            i9 = 4;
        }
        int i10 = i8 - i9;
        int[] iArr = new int[i8];
        for (int i11 = i8 - 1; i11 >= 0; i11--) {
            iArr[i11] = ((int) j8) & 15;
            j8 >>= 4;
        }
        try {
            new ReedSolomonDecoder(GenericGF.AZTEC_PARAM).decode(iArr, i10);
            int i12 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                i12 = (i12 << 4) + iArr[i13];
            }
            return i12;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private int getDimension() {
        if (this.compact) {
            return (this.nbLayers * 4) + 11;
        }
        int i8 = this.nbLayers;
        return i8 <= 4 ? (i8 * 4) + 15 : (i8 * 4) + ((((i8 - 4) / 8) + 1) * 2) + 15;
    }

    private Point getFirstDifferent(Point point, boolean z7, int i8, int i9) {
        int x7 = point.getX() + i8;
        int y7 = point.getY();
        while (true) {
            y7 += i9;
            if (!isValid(x7, y7) || this.image.get(x7, y7) != z7) {
                break;
            }
            x7 += i8;
        }
        int i10 = x7 - i8;
        int i11 = y7 - i9;
        while (isValid(i10, i11) && this.image.get(i10, i11) == z7) {
            i10 += i8;
        }
        int i12 = i10 - i8;
        while (isValid(i12, i11) && this.image.get(i12, i11) == z7) {
            i11 += i9;
        }
        return new Point(i12, i11 - i9);
    }

    private Point getMatrixCenter() {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint resultPoint4;
        ResultPoint resultPoint5;
        ResultPoint resultPoint6;
        ResultPoint resultPoint7;
        ResultPoint resultPoint8;
        try {
            ResultPoint[] detect = new WhiteRectangleDetector(this.image).detect();
            resultPoint3 = detect[0];
            resultPoint4 = detect[1];
            resultPoint2 = detect[2];
            resultPoint = detect[3];
        } catch (NotFoundException unused) {
            int width = this.image.getWidth() / 2;
            int height = this.image.getHeight() / 2;
            int i8 = width + 7;
            int i9 = height - 7;
            ResultPoint resultPoint9 = getFirstDifferent(new Point(i8, i9), false, 1, -1).toResultPoint();
            int i10 = height + 7;
            ResultPoint resultPoint10 = getFirstDifferent(new Point(i8, i10), false, 1, 1).toResultPoint();
            int i11 = width - 7;
            ResultPoint resultPoint11 = getFirstDifferent(new Point(i11, i10), false, -1, 1).toResultPoint();
            resultPoint = getFirstDifferent(new Point(i11, i9), false, -1, -1).toResultPoint();
            resultPoint2 = resultPoint11;
            resultPoint3 = resultPoint9;
            resultPoint4 = resultPoint10;
        }
        int round = MathUtils.round((((resultPoint3.getX() + resultPoint.getX()) + resultPoint4.getX()) + resultPoint2.getX()) / 4.0f);
        int round2 = MathUtils.round((((resultPoint3.getY() + resultPoint.getY()) + resultPoint4.getY()) + resultPoint2.getY()) / 4.0f);
        try {
            ResultPoint[] detect2 = new WhiteRectangleDetector(this.image, 15, round, round2).detect();
            resultPoint5 = detect2[0];
            resultPoint6 = detect2[1];
            resultPoint7 = detect2[2];
            resultPoint8 = detect2[3];
        } catch (NotFoundException unused2) {
            int i12 = round + 7;
            int i13 = round2 - 7;
            resultPoint5 = getFirstDifferent(new Point(i12, i13), false, 1, -1).toResultPoint();
            int i14 = round2 + 7;
            resultPoint6 = getFirstDifferent(new Point(i12, i14), false, 1, 1).toResultPoint();
            int i15 = round - 7;
            resultPoint7 = getFirstDifferent(new Point(i15, i14), false, -1, 1).toResultPoint();
            resultPoint8 = getFirstDifferent(new Point(i15, i13), false, -1, -1).toResultPoint();
        }
        return new Point(MathUtils.round((((resultPoint5.getX() + resultPoint8.getX()) + resultPoint6.getX()) + resultPoint7.getX()) / 4.0f), MathUtils.round((((resultPoint5.getY() + resultPoint8.getY()) + resultPoint6.getY()) + resultPoint7.getY()) / 4.0f));
    }

    private ResultPoint[] getMatrixCornerPoints(ResultPoint[] resultPointArr) {
        return expandSquare(resultPointArr, this.nbCenterLayers * 2, getDimension());
    }

    private static int getRotation(int[] iArr, int i8) {
        int i9 = 0;
        for (int i10 : iArr) {
            i9 = (i9 << 3) + ((i10 >> (i8 - 2)) << 1) + (i10 & 1);
        }
        int i11 = ((i9 & 1) << 11) + (i9 >> 1);
        for (int i12 = 0; i12 < 4; i12++) {
            if (Integer.bitCount(EXPECTED_CORNER_BITS[i12] ^ i11) <= 2) {
                return i12;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private boolean isValid(int i8, int i9) {
        return i8 >= 0 && i8 < this.image.getWidth() && i9 > 0 && i9 < this.image.getHeight();
    }

    private boolean isWhiteOrBlackRectangle(Point point, Point point2, Point point3, Point point4) {
        Point point5 = new Point(point.getX() - 3, point.getY() + 3);
        Point point6 = new Point(point2.getX() - 3, point2.getY() - 3);
        Point point7 = new Point(point3.getX() + 3, point3.getY() - 3);
        Point point8 = new Point(point4.getX() + 3, point4.getY() + 3);
        int color = getColor(point8, point5);
        return color != 0 && getColor(point5, point6) == color && getColor(point6, point7) == color && getColor(point7, point8) == color;
    }

    private BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        GridSampler gridSampler = GridSampler.getInstance();
        int dimension = getDimension();
        float f8 = dimension / 2.0f;
        int i8 = this.nbCenterLayers;
        float f9 = f8 - i8;
        float f10 = f8 + i8;
        return gridSampler.sampleGrid(bitMatrix, dimension, dimension, f9, f9, f10, f9, f10, f10, f9, f10, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint4.getX(), resultPoint4.getY());
    }

    private int sampleLine(ResultPoint resultPoint, ResultPoint resultPoint2, int i8) {
        float distance = distance(resultPoint, resultPoint2);
        float f8 = distance / i8;
        float x7 = resultPoint.getX();
        float y7 = resultPoint.getY();
        float x8 = ((resultPoint2.getX() - resultPoint.getX()) * f8) / distance;
        float y8 = (f8 * (resultPoint2.getY() - resultPoint.getY())) / distance;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            float f9 = i10;
            if (this.image.get(MathUtils.round((f9 * x8) + x7), MathUtils.round((f9 * y8) + y7))) {
                i9 |= 1 << ((i8 - i10) - 1);
            }
        }
        return i9;
    }

    public AztecDetectorResult detect() {
        return detect(false);
    }

    private static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private boolean isValid(ResultPoint resultPoint) {
        return isValid(MathUtils.round(resultPoint.getX()), MathUtils.round(resultPoint.getY()));
    }

    public AztecDetectorResult detect(boolean z7) {
        ResultPoint[] bullsEyeCorners = getBullsEyeCorners(getMatrixCenter());
        if (z7) {
            ResultPoint resultPoint = bullsEyeCorners[0];
            bullsEyeCorners[0] = bullsEyeCorners[2];
            bullsEyeCorners[2] = resultPoint;
        }
        extractParameters(bullsEyeCorners);
        BitMatrix bitMatrix = this.image;
        int i8 = this.shift;
        return new AztecDetectorResult(sampleGrid(bitMatrix, bullsEyeCorners[i8 % 4], bullsEyeCorners[(i8 + 1) % 4], bullsEyeCorners[(i8 + 2) % 4], bullsEyeCorners[(i8 + 3) % 4]), getMatrixCornerPoints(bullsEyeCorners), this.compact, this.nbDataBlocks, this.nbLayers);
    }
}
