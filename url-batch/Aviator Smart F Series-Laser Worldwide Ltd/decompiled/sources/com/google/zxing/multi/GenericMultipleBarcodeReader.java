package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {
    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final Reader delegate;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.delegate = reader;
    }

    private void doDecodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, List<Result> list, int i8, int i9, int i10) {
        float f8;
        float f9;
        float f10;
        int i11;
        if (i10 > 4) {
            return;
        }
        try {
            Result decode = this.delegate.decode(binaryBitmap, map);
            Iterator<Result> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().getText().equals(decode.getText())) {
                        break;
                    }
                } else {
                    list.add(translateResultPoints(decode, i8, i9));
                    break;
                }
            }
            ResultPoint[] resultPoints = decode.getResultPoints();
            if (resultPoints == null || resultPoints.length == 0) {
                return;
            }
            int width = binaryBitmap.getWidth();
            int height = binaryBitmap.getHeight();
            float f11 = width;
            float f12 = 0.0f;
            float f13 = height;
            float f14 = 0.0f;
            for (ResultPoint resultPoint : resultPoints) {
                if (resultPoint != null) {
                    float x7 = resultPoint.getX();
                    float y7 = resultPoint.getY();
                    if (x7 < f11) {
                        f11 = x7;
                    }
                    if (y7 < f13) {
                        f13 = y7;
                    }
                    if (x7 > f12) {
                        f12 = x7;
                    }
                    if (y7 > f14) {
                        f14 = y7;
                    }
                }
            }
            if (f11 > 100.0f) {
                f8 = f14;
                f9 = f12;
                f10 = f13;
                i11 = 0;
                doDecodeMultiple(binaryBitmap.crop(0, 0, (int) f11, height), map, list, i8, i9, i10 + 1);
            } else {
                f8 = f14;
                f9 = f12;
                f10 = f13;
                i11 = 0;
            }
            if (f10 > 100.0f) {
                doDecodeMultiple(binaryBitmap.crop(i11, i11, width, (int) f10), map, list, i8, i9, i10 + 1);
            }
            if (f9 < width - 100) {
                int i12 = (int) f9;
                doDecodeMultiple(binaryBitmap.crop(i12, i11, width - i12, height), map, list, i8 + i12, i9, i10 + 1);
            }
            if (f8 < height - 100) {
                int i13 = (int) f8;
                doDecodeMultiple(binaryBitmap.crop(i11, i13, width, height - i13), map, list, i8, i9 + i13, i10 + 1);
            }
        } catch (ReaderException unused) {
        }
    }

    private static Result translateResultPoints(Result result, int i8, int i9) {
        ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
        for (int i10 = 0; i10 < resultPoints.length; i10++) {
            ResultPoint resultPoint = resultPoints[i10];
            if (resultPoint != null) {
                resultPointArr[i10] = new ResultPoint(resultPoint.getX() + i8, resultPoint.getY() + i9);
            }
        }
        Result result2 = new Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) {
        ArrayList arrayList = new ArrayList();
        doDecodeMultiple(binaryBitmap, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
    }
}
