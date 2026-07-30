package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes4.dex */
public final class WhiteRectangleDetector {
    private static final int CORR = 1;
    private static final int INIT_SIZE = 10;
    private final int downInit;
    private final int height;
    private final BitMatrix image;
    private final int leftInit;
    private final int rightInit;
    private final int upInit;
    private final int width;

    public WhiteRectangleDetector(BitMatrix bitMatrix) {
        this(bitMatrix, 10, bitMatrix.getWidth() / 2, bitMatrix.getHeight() / 2);
    }

    private ResultPoint[] centerEdges(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) {
        float x7 = resultPoint.getX();
        float y7 = resultPoint.getY();
        float x8 = resultPoint2.getX();
        float y8 = resultPoint2.getY();
        float x9 = resultPoint3.getX();
        float y9 = resultPoint3.getY();
        float x10 = resultPoint4.getX();
        float y10 = resultPoint4.getY();
        return x7 < ((float) this.width) / 2.0f ? new ResultPoint[]{new ResultPoint(x10 - 1.0f, y10 + 1.0f), new ResultPoint(x8 + 1.0f, y8 + 1.0f), new ResultPoint(x9 - 1.0f, y9 - 1.0f), new ResultPoint(x7 + 1.0f, y7 - 1.0f)} : new ResultPoint[]{new ResultPoint(x10 + 1.0f, y10 + 1.0f), new ResultPoint(x8 + 1.0f, y8 - 1.0f), new ResultPoint(x9 - 1.0f, y9 + 1.0f), new ResultPoint(x7 - 1.0f, y7 - 1.0f)};
    }

    private boolean containsBlackPoint(int i8, int i9, int i10, boolean z7) {
        if (z7) {
            while (i8 <= i9) {
                if (this.image.get(i8, i10)) {
                    return true;
                }
                i8++;
            }
            return false;
        }
        while (i8 <= i9) {
            if (this.image.get(i10, i8)) {
                return true;
            }
            i8++;
        }
        return false;
    }

    private ResultPoint getBlackPointOnSegment(float f8, float f9, float f10, float f11) {
        int round = MathUtils.round(MathUtils.distance(f8, f9, f10, f11));
        float f12 = round;
        float f13 = (f10 - f8) / f12;
        float f14 = (f11 - f9) / f12;
        for (int i8 = 0; i8 < round; i8++) {
            float f15 = i8;
            int round2 = MathUtils.round((f15 * f13) + f8);
            int round3 = MathUtils.round((f15 * f14) + f9);
            if (this.image.get(round2, round3)) {
                return new ResultPoint(round2, round3);
            }
        }
        return null;
    }

    public ResultPoint[] detect() {
        int i8 = this.leftInit;
        int i9 = this.rightInit;
        int i10 = this.upInit;
        int i11 = this.downInit;
        boolean z7 = false;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (z8) {
            boolean z14 = true;
            boolean z15 = false;
            while (true) {
                if ((z14 || !z9) && i9 < this.width) {
                    z14 = containsBlackPoint(i10, i11, i9, false);
                    if (z14) {
                        i9++;
                        z9 = true;
                        z15 = true;
                    } else if (!z9) {
                        i9++;
                    }
                }
            }
            if (i9 < this.width) {
                boolean z16 = true;
                while (true) {
                    if ((z16 || !z10) && i11 < this.height) {
                        z16 = containsBlackPoint(i8, i9, i11, true);
                        if (z16) {
                            i11++;
                            z10 = true;
                            z15 = true;
                        } else if (!z10) {
                            i11++;
                        }
                    }
                }
                if (i11 < this.height) {
                    boolean z17 = true;
                    while (true) {
                        if ((z17 || !z11) && i8 >= 0) {
                            z17 = containsBlackPoint(i10, i11, i8, false);
                            if (z17) {
                                i8--;
                                z11 = true;
                                z15 = true;
                            } else if (!z11) {
                                i8--;
                            }
                        }
                    }
                    if (i8 >= 0) {
                        z8 = z15;
                        boolean z18 = true;
                        while (true) {
                            if ((z18 || !z13) && i10 >= 0) {
                                z18 = containsBlackPoint(i8, i9, i10, true);
                                if (z18) {
                                    i10--;
                                    z8 = true;
                                    z13 = true;
                                } else if (!z13) {
                                    i10--;
                                }
                            }
                        }
                        if (i10 >= 0) {
                            if (z8) {
                                z12 = true;
                            }
                        }
                    }
                }
            }
            z7 = true;
            break;
        }
        if (z7 || !z12) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i12 = i9 - i8;
        ResultPoint resultPoint = null;
        ResultPoint resultPoint2 = null;
        for (int i13 = 1; resultPoint2 == null && i13 < i12; i13++) {
            resultPoint2 = getBlackPointOnSegment(i8, i11 - i13, i8 + i13, i11);
        }
        if (resultPoint2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint resultPoint3 = null;
        for (int i14 = 1; resultPoint3 == null && i14 < i12; i14++) {
            resultPoint3 = getBlackPointOnSegment(i8, i10 + i14, i8 + i14, i10);
        }
        if (resultPoint3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint resultPoint4 = null;
        for (int i15 = 1; resultPoint4 == null && i15 < i12; i15++) {
            resultPoint4 = getBlackPointOnSegment(i9, i10 + i15, i9 - i15, i10);
        }
        if (resultPoint4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i16 = 1; resultPoint == null && i16 < i12; i16++) {
            resultPoint = getBlackPointOnSegment(i9, i11 - i16, i9 - i16, i11);
        }
        if (resultPoint != null) {
            return centerEdges(resultPoint, resultPoint2, resultPoint4, resultPoint3);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix, int i8, int i9, int i10) {
        this.image = bitMatrix;
        int height = bitMatrix.getHeight();
        this.height = height;
        int width = bitMatrix.getWidth();
        this.width = width;
        int i11 = i8 / 2;
        int i12 = i9 - i11;
        this.leftInit = i12;
        int i13 = i9 + i11;
        this.rightInit = i13;
        int i14 = i10 - i11;
        this.upInit = i14;
        int i15 = i10 + i11;
        this.downInit = i15;
        if (i14 < 0 || i12 < 0 || i15 >= height || i13 >= width) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
