package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes4.dex */
final class BoundingBox {
    private final ResultPoint bottomLeft;
    private final ResultPoint bottomRight;
    private final BitMatrix image;
    private final int maxX;
    private final int maxY;
    private final int minX;
    private final int minY;
    private final ResultPoint topLeft;
    private final ResultPoint topRight;

    BoundingBox(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        boolean z7 = resultPoint == null || resultPoint2 == null;
        boolean z8 = resultPoint3 == null || resultPoint4 == null;
        if (z7 && z8) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z7) {
            resultPoint = new ResultPoint(0.0f, resultPoint3.getY());
            resultPoint2 = new ResultPoint(0.0f, resultPoint4.getY());
        } else if (z8) {
            resultPoint3 = new ResultPoint(bitMatrix.getWidth() - 1, resultPoint.getY());
            resultPoint4 = new ResultPoint(bitMatrix.getWidth() - 1, resultPoint2.getY());
        }
        this.image = bitMatrix;
        this.topLeft = resultPoint;
        this.bottomLeft = resultPoint2;
        this.topRight = resultPoint3;
        this.bottomRight = resultPoint4;
        this.minX = (int) Math.min(resultPoint.getX(), resultPoint2.getX());
        this.maxX = (int) Math.max(resultPoint3.getX(), resultPoint4.getX());
        this.minY = (int) Math.min(resultPoint.getY(), resultPoint3.getY());
        this.maxY = (int) Math.max(resultPoint2.getY(), resultPoint4.getY());
    }

    static BoundingBox merge(BoundingBox boundingBox, BoundingBox boundingBox2) {
        return boundingBox == null ? boundingBox2 : boundingBox2 == null ? boundingBox : new BoundingBox(boundingBox.image, boundingBox.topLeft, boundingBox.bottomLeft, boundingBox2.topRight, boundingBox2.bottomRight);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    BoundingBox addMissingRows(int i8, int i9, boolean z7) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint resultPoint4;
        ResultPoint resultPoint5 = this.topLeft;
        ResultPoint resultPoint6 = this.bottomLeft;
        ResultPoint resultPoint7 = this.topRight;
        ResultPoint resultPoint8 = this.bottomRight;
        if (i8 > 0) {
            ResultPoint resultPoint9 = z7 ? resultPoint5 : resultPoint7;
            int y7 = ((int) resultPoint9.getY()) - i8;
            if (y7 < 0) {
                y7 = 0;
            }
            ResultPoint resultPoint10 = new ResultPoint(resultPoint9.getX(), y7);
            if (!z7) {
                resultPoint2 = resultPoint10;
                resultPoint = resultPoint5;
                if (i9 <= 0) {
                    ResultPoint resultPoint11 = z7 ? this.bottomLeft : this.bottomRight;
                    int y8 = ((int) resultPoint11.getY()) + i9;
                    if (y8 >= this.image.getHeight()) {
                        y8 = this.image.getHeight() - 1;
                    }
                    ResultPoint resultPoint12 = new ResultPoint(resultPoint11.getX(), y8);
                    if (!z7) {
                        resultPoint4 = resultPoint12;
                        resultPoint3 = resultPoint6;
                        return new BoundingBox(this.image, resultPoint, resultPoint3, resultPoint2, resultPoint4);
                    }
                    resultPoint3 = resultPoint12;
                } else {
                    resultPoint3 = resultPoint6;
                }
                resultPoint4 = resultPoint8;
                return new BoundingBox(this.image, resultPoint, resultPoint3, resultPoint2, resultPoint4);
            }
            resultPoint = resultPoint10;
        } else {
            resultPoint = resultPoint5;
        }
        resultPoint2 = resultPoint7;
        if (i9 <= 0) {
        }
        resultPoint4 = resultPoint8;
        return new BoundingBox(this.image, resultPoint, resultPoint3, resultPoint2, resultPoint4);
    }

    ResultPoint getBottomLeft() {
        return this.bottomLeft;
    }

    ResultPoint getBottomRight() {
        return this.bottomRight;
    }

    int getMaxX() {
        return this.maxX;
    }

    int getMaxY() {
        return this.maxY;
    }

    int getMinX() {
        return this.minX;
    }

    int getMinY() {
        return this.minY;
    }

    ResultPoint getTopLeft() {
        return this.topLeft;
    }

    ResultPoint getTopRight() {
        return this.topRight;
    }

    BoundingBox(BoundingBox boundingBox) {
        this.image = boundingBox.image;
        this.topLeft = boundingBox.getTopLeft();
        this.bottomLeft = boundingBox.getBottomLeft();
        this.topRight = boundingBox.getTopRight();
        this.bottomRight = boundingBox.getBottomRight();
        this.minX = boundingBox.getMinX();
        this.maxX = boundingBox.getMaxX();
        this.minY = boundingBox.getMinY();
        this.maxY = boundingBox.getMaxY();
    }
}
