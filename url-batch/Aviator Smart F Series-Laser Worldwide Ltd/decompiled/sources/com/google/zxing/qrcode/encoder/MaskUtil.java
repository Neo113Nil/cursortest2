package com.google.zxing.qrcode.encoder;

/* loaded from: classes4.dex */
final class MaskUtil {
    private static final int N1 = 3;
    private static final int N2 = 3;
    private static final int N3 = 40;
    private static final int N4 = 10;

    private MaskUtil() {
    }

    static int applyMaskPenaltyRule1(ByteMatrix byteMatrix) {
        return applyMaskPenaltyRule1Internal(byteMatrix, true) + applyMaskPenaltyRule1Internal(byteMatrix, false);
    }

    private static int applyMaskPenaltyRule1Internal(ByteMatrix byteMatrix, boolean z7) {
        int height = z7 ? byteMatrix.getHeight() : byteMatrix.getWidth();
        int width = z7 ? byteMatrix.getWidth() : byteMatrix.getHeight();
        byte[][] array = byteMatrix.getArray();
        int i8 = 0;
        for (int i9 = 0; i9 < height; i9++) {
            byte b8 = -1;
            int i10 = 0;
            for (int i11 = 0; i11 < width; i11++) {
                byte b9 = z7 ? array[i9][i11] : array[i11][i9];
                if (b9 == b8) {
                    i10++;
                } else {
                    if (i10 >= 5) {
                        i8 += i10 - 2;
                    }
                    b8 = b9;
                    i10 = 1;
                }
            }
            if (i10 >= 5) {
                i8 += i10 - 2;
            }
        }
        return i8;
    }

    static int applyMaskPenaltyRule2(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i8 = 0;
        for (int i9 = 0; i9 < height - 1; i9++) {
            byte[] bArr = array[i9];
            int i10 = 0;
            while (i10 < width - 1) {
                byte b8 = bArr[i10];
                int i11 = i10 + 1;
                if (b8 == bArr[i11]) {
                    byte[] bArr2 = array[i9 + 1];
                    if (b8 == bArr2[i10] && b8 == bArr2[i11]) {
                        i8++;
                    }
                }
                i10 = i11;
            }
        }
        return i8 * 3;
    }

    static int applyMaskPenaltyRule3(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i8 = 0;
        for (int i9 = 0; i9 < height; i9++) {
            for (int i10 = 0; i10 < width; i10++) {
                byte[] bArr = array[i9];
                int i11 = i10 + 6;
                if (i11 < width && bArr[i10] == 1 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 1 && bArr[i10 + 3] == 1 && bArr[i10 + 4] == 1 && bArr[i10 + 5] == 0 && bArr[i11] == 1 && (isWhiteHorizontal(bArr, i10 - 4, i10) || isWhiteHorizontal(bArr, i10 + 7, i10 + 11))) {
                    i8++;
                }
                int i12 = i9 + 6;
                if (i12 < height && array[i9][i10] == 1 && array[i9 + 1][i10] == 0 && array[i9 + 2][i10] == 1 && array[i9 + 3][i10] == 1 && array[i9 + 4][i10] == 1 && array[i9 + 5][i10] == 0 && array[i12][i10] == 1 && (isWhiteVertical(array, i10, i9 - 4, i9) || isWhiteVertical(array, i10, i9 + 7, i9 + 11))) {
                    i8++;
                }
            }
        }
        return i8 * 40;
    }

    static int applyMaskPenaltyRule4(ByteMatrix byteMatrix) {
        byte[][] array = byteMatrix.getArray();
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int i8 = 0;
        for (int i9 = 0; i9 < height; i9++) {
            byte[] bArr = array[i9];
            for (int i10 = 0; i10 < width; i10++) {
                if (bArr[i10] == 1) {
                    i8++;
                }
            }
        }
        int height2 = byteMatrix.getHeight() * byteMatrix.getWidth();
        return ((Math.abs((i8 << 1) - height2) * 10) / height2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean getDataMaskBit(int i8, int i9, int i10) {
        int i11;
        int i12;
        switch (i8) {
            case 0:
                i10 += i9;
                i11 = i10 & 1;
                return i11 != 0;
            case 1:
                i11 = i10 & 1;
                if (i11 != 0) {
                }
                break;
            case 2:
                i11 = i9 % 3;
                if (i11 != 0) {
                }
                break;
            case 3:
                i11 = (i10 + i9) % 3;
                if (i11 != 0) {
                }
                break;
            case 4:
                i10 /= 2;
                i9 /= 3;
                i10 += i9;
                i11 = i10 & 1;
                if (i11 != 0) {
                }
                break;
            case 5:
                int i13 = i10 * i9;
                i11 = (i13 & 1) + (i13 % 3);
                if (i11 != 0) {
                }
                break;
            case 6:
                int i14 = i10 * i9;
                i12 = (i14 & 1) + (i14 % 3);
                i11 = i12 & 1;
                if (i11 != 0) {
                }
                break;
            case 7:
                i12 = ((i10 * i9) % 3) + ((i10 + i9) & 1);
                i11 = i12 & 1;
                if (i11 != 0) {
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i8)));
        }
    }

    private static boolean isWhiteHorizontal(byte[] bArr, int i8, int i9) {
        int min = Math.min(i9, bArr.length);
        for (int max = Math.max(i8, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean isWhiteVertical(byte[][] bArr, int i8, int i9, int i10) {
        int min = Math.min(i10, bArr.length);
        for (int max = Math.max(i9, 0); max < min; max++) {
            if (bArr[max][i8] == 1) {
                return false;
            }
        }
        return true;
    }
}
