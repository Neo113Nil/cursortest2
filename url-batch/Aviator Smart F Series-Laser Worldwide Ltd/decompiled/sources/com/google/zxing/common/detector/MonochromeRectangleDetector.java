package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

@Deprecated
/* loaded from: classes4.dex */
public final class MonochromeRectangleDetector {
    private static final int MAX_MODULES = 32;
    private final BitMatrix image;

    public MonochromeRectangleDetector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068 A[EDGE_INSN: B:67:0x0068->B:47:0x0068 BREAK  A[LOOP:3: B:39:0x0053->B:61:0x0053], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0031 A[EDGE_INSN: B:81:0x0031->B:21:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:75:0x001c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int[] blackWhiteRange(int i8, int i9, int i10, int i11, boolean z7) {
        int i12;
        int i13;
        int i14 = (i10 + i11) / 2;
        int i15 = i14;
        while (i15 >= i10) {
            BitMatrix bitMatrix = this.image;
            if (z7) {
                if (!bitMatrix.get(i15, i8)) {
                    i13 = i15;
                    while (true) {
                        i13--;
                        if (i13 >= i10) {
                            break;
                        }
                        BitMatrix bitMatrix2 = this.image;
                        if (z7) {
                            if (bitMatrix2.get(i13, i8)) {
                                break;
                            }
                        } else if (bitMatrix2.get(i8, i13)) {
                            break;
                        }
                    }
                    int i16 = i15 - i13;
                    if (i13 >= i10 || i16 > i9) {
                        break;
                        break;
                    }
                    i15 = i13;
                } else {
                    i15--;
                }
            } else if (bitMatrix.get(i8, i15)) {
                i15--;
            } else {
                i13 = i15;
                while (true) {
                    i13--;
                    if (i13 >= i10) {
                    }
                }
                int i162 = i15 - i13;
                if (i13 >= i10) {
                    break;
                }
                i15 = i13;
            }
        }
        int i17 = i15 + 1;
        while (i14 < i11) {
            BitMatrix bitMatrix3 = this.image;
            if (z7) {
                if (!bitMatrix3.get(i14, i8)) {
                    i12 = i14;
                    while (true) {
                        i12++;
                        if (i12 < i11) {
                            break;
                        }
                        BitMatrix bitMatrix4 = this.image;
                        if (z7) {
                            if (bitMatrix4.get(i12, i8)) {
                                break;
                            }
                        } else if (bitMatrix4.get(i8, i12)) {
                            break;
                        }
                    }
                    int i18 = i12 - i14;
                    if (i12 < i11 || i18 > i9) {
                        break;
                        break;
                    }
                    i14 = i12;
                } else {
                    i14++;
                }
            } else if (bitMatrix3.get(i8, i14)) {
                i14++;
            } else {
                i12 = i14;
                while (true) {
                    i12++;
                    if (i12 < i11) {
                    }
                }
                int i182 = i12 - i14;
                if (i12 < i11) {
                    break;
                }
                i14 = i12;
            }
        }
        int i19 = i14 - 1;
        if (i19 > i17) {
            return new int[]{i17, i19};
        }
        return null;
    }

    private ResultPoint findCornerFromCenter(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int[] iArr = null;
        int i17 = i8;
        int i18 = i12;
        while (i18 < i15 && i18 >= i14 && i17 < i11 && i17 >= i10) {
            int[] blackWhiteRange = i9 == 0 ? blackWhiteRange(i18, i16, i10, i11, true) : blackWhiteRange(i17, i16, i14, i15, false);
            if (blackWhiteRange == null) {
                if (iArr == null) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (i9 == 0) {
                    int i19 = i18 - i13;
                    int i20 = iArr[0];
                    if (i20 >= i8) {
                        return new ResultPoint(iArr[1], i19);
                    }
                    if (iArr[1] > i8) {
                        return new ResultPoint(iArr[i13 <= 0 ? (char) 1 : (char) 0], i19);
                    }
                    return new ResultPoint(i20, i19);
                }
                int i21 = i17 - i9;
                int i22 = iArr[0];
                if (i22 >= i12) {
                    return new ResultPoint(i21, iArr[1]);
                }
                if (iArr[1] > i12) {
                    return new ResultPoint(i21, iArr[i9 >= 0 ? (char) 1 : (char) 0]);
                }
                return new ResultPoint(i21, i22);
            }
            i18 += i13;
            i17 += i9;
            iArr = blackWhiteRange;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public ResultPoint[] detect() {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i8 = height / 2;
        int i9 = width / 2;
        int max = Math.max(1, height / 256);
        int max2 = Math.max(1, width / 256);
        int i10 = -max;
        int i11 = i9 / 2;
        int y7 = ((int) findCornerFromCenter(i9, 0, 0, width, i8, i10, 0, height, i11).getY()) - 1;
        int i12 = i8 / 2;
        ResultPoint findCornerFromCenter = findCornerFromCenter(i9, -max2, 0, width, i8, 0, y7, height, i12);
        int x7 = ((int) findCornerFromCenter.getX()) - 1;
        ResultPoint findCornerFromCenter2 = findCornerFromCenter(i9, max2, x7, width, i8, 0, y7, height, i12);
        int x8 = ((int) findCornerFromCenter2.getX()) + 1;
        ResultPoint findCornerFromCenter3 = findCornerFromCenter(i9, 0, x7, x8, i8, max, y7, height, i11);
        return new ResultPoint[]{findCornerFromCenter(i9, 0, x7, x8, i8, i10, y7, ((int) findCornerFromCenter3.getY()) + 1, i9 / 4), findCornerFromCenter, findCornerFromCenter2, findCornerFromCenter3};
    }
}
