package com.google.zxing.oned;

import com.crrepa.band.my.device.customkey.util.c;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class OneDReader implements Reader {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r3 = r22.getBlackRow(r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e0, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078 A[Catch: ReaderException -> 0x00c6, TryCatch #2 {ReaderException -> 0x00c6, blocks: (B:35:0x0072, B:37:0x0078, B:39:0x0089), top: B:34:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Result doDecode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) {
        int i8;
        int i9;
        int i10;
        OneDReader oneDReader;
        Map<DecodeHintType, ?> map2;
        int i11;
        Map<DecodeHintType, ?> map3 = map;
        int width = binaryBitmap.getWidth();
        int height = binaryBitmap.getHeight();
        BitArray bitArray = new BitArray(width);
        char c8 = 0;
        int i12 = 1;
        boolean z7 = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int max = Math.max(1, height >> (z7 ? 8 : 5));
        int i13 = z7 ? height : 15;
        int i14 = height / 2;
        int i15 = 0;
        while (i15 < i13) {
            i8 = i15 + 1;
            int i16 = i8 / 2;
            if ((i15 & 1) != 0) {
                i16 = -i16;
            }
            i9 = (i16 * max) + i14;
            if (i9 < 0 || i9 >= height) {
                break;
            }
            i15 = i8;
            width = width;
            c8 = 0;
            i12 = 1;
        }
        throw NotFoundException.getNotFoundInstance();
        while (i10 < 2) {
            try {
                if (i10 == i12) {
                    bitArray.reverse();
                    if (map3 != null) {
                        DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
                        if (map3.containsKey(decodeHintType)) {
                            EnumMap enumMap = new EnumMap(DecodeHintType.class);
                            enumMap.putAll(map3);
                            enumMap.remove(decodeHintType);
                            oneDReader = this;
                            map3 = enumMap;
                            Result decodeRow = oneDReader.decodeRow(i9, bitArray, map3);
                            if (i10 != i12) {
                                decodeRow.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(c.MAX_GOAL_TIME));
                                ResultPoint[] resultPoints = decodeRow.getResultPoints();
                                if (resultPoints != null) {
                                    map2 = map3;
                                    float f8 = width;
                                    try {
                                        i11 = width;
                                    } catch (ReaderException unused) {
                                        i11 = width;
                                        i10++;
                                        map3 = map2;
                                        width = i11;
                                        c8 = 0;
                                        i12 = 1;
                                    }
                                    try {
                                        resultPoints[0] = new ResultPoint((f8 - resultPoints[c8].getX()) - 1.0f, resultPoints[c8].getY());
                                    } catch (ReaderException unused2) {
                                        i10++;
                                        map3 = map2;
                                        width = i11;
                                        c8 = 0;
                                        i12 = 1;
                                    }
                                    try {
                                        resultPoints[1] = new ResultPoint((f8 - resultPoints[1].getX()) - 1.0f, resultPoints[1].getY());
                                    } catch (ReaderException unused3) {
                                        continue;
                                        i10++;
                                        map3 = map2;
                                        width = i11;
                                        c8 = 0;
                                        i12 = 1;
                                    }
                                }
                            }
                            return decodeRow;
                        }
                    }
                }
                Result decodeRow2 = oneDReader.decodeRow(i9, bitArray, map3);
                if (i10 != i12) {
                }
                return decodeRow2;
            } catch (ReaderException unused4) {
                map2 = map3;
            }
            oneDReader = this;
        }
        continue;
        i15 = i8;
        width = width;
        c8 = 0;
        i12 = 1;
    }

    protected static float patternMatchVariance(int[] iArr, int[] iArr2, float f8) {
        int length = iArr.length;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            i8 += iArr[i10];
            i9 += iArr2[i10];
        }
        if (i8 < i9) {
            return Float.POSITIVE_INFINITY;
        }
        float f9 = i8;
        float f10 = f9 / i9;
        float f11 = f8 * f10;
        float f12 = 0.0f;
        for (int i11 = 0; i11 < length; i11++) {
            float f13 = iArr2[i11] * f10;
            float f14 = iArr[i11];
            float f15 = f14 > f13 ? f14 - f13 : f13 - f14;
            if (f15 > f11) {
                return Float.POSITIVE_INFINITY;
            }
            f12 += f15;
        }
        return f12 / f9;
    }

    protected static void recordPattern(BitArray bitArray, int i8, int[] iArr) {
        int length = iArr.length;
        int i9 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int size = bitArray.getSize();
        if (i8 >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z7 = !bitArray.get(i8);
        while (i8 < size) {
            if (bitArray.get(i8) == z7) {
                i9++;
                if (i9 == length) {
                    break;
                }
                iArr[i9] = 1;
                z7 = !z7;
            } else {
                iArr[i9] = iArr[i9] + 1;
            }
            i8++;
        }
        if (i9 != length) {
            if (i9 != length - 1 || i8 != size) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    protected static void recordPatternInReverse(BitArray bitArray, int i8, int[] iArr) {
        int length = iArr.length;
        boolean z7 = bitArray.get(i8);
        while (i8 > 0 && length >= 0) {
            i8--;
            if (bitArray.get(i8) != z7) {
                length--;
                z7 = !z7;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        recordPattern(bitArray, i8 + 1, iArr);
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) {
        return decode(binaryBitmap, null);
    }

    public abstract Result decodeRow(int i8, BitArray bitArray, Map<DecodeHintType, ?> map);

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) {
        try {
            return doDecode(binaryBitmap, map);
        } catch (NotFoundException e8) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !binaryBitmap.isRotateSupported()) {
                throw e8;
            }
            BinaryBitmap rotateCounterClockwise = binaryBitmap.rotateCounterClockwise();
            Result doDecode = doDecode(rotateCounterClockwise, map);
            Map<ResultMetadataType, Object> resultMetadata = doDecode.getResultMetadata();
            int i8 = 270;
            if (resultMetadata != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (resultMetadata.containsKey(resultMetadataType)) {
                    i8 = (((Integer) resultMetadata.get(resultMetadataType)).intValue() + 270) % 360;
                }
            }
            doDecode.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(i8));
            ResultPoint[] resultPoints = doDecode.getResultPoints();
            if (resultPoints != null) {
                int height = rotateCounterClockwise.getHeight();
                for (int i9 = 0; i9 < resultPoints.length; i9++) {
                    resultPoints[i9] = new ResultPoint((height - resultPoints[i9].getY()) - 1.0f, resultPoints[i9].getX());
                }
            }
            return doDecode;
        }
    }
}
