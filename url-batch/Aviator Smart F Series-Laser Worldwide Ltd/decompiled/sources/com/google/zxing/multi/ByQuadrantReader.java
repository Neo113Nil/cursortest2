package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ByQuadrantReader implements Reader {
    private final Reader delegate;

    public ByQuadrantReader(Reader reader) {
        this.delegate = reader;
    }

    private static void makeAbsolute(ResultPoint[] resultPointArr, int i8, int i9) {
        if (resultPointArr != null) {
            for (int i10 = 0; i10 < resultPointArr.length; i10++) {
                ResultPoint resultPoint = resultPointArr[i10];
                resultPointArr[i10] = new ResultPoint(resultPoint.getX() + i8, resultPoint.getY() + i9);
            }
        }
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public void reset() {
        this.delegate.reset();
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) {
        int width = binaryBitmap.getWidth() / 2;
        int height = binaryBitmap.getHeight() / 2;
        try {
            try {
                try {
                    try {
                        return this.delegate.decode(binaryBitmap.crop(0, 0, width, height), map);
                    } catch (NotFoundException unused) {
                        int i8 = width / 2;
                        int i9 = height / 2;
                        Result decode = this.delegate.decode(binaryBitmap.crop(i8, i9, width, height), map);
                        makeAbsolute(decode.getResultPoints(), i8, i9);
                        return decode;
                    }
                } catch (NotFoundException unused2) {
                    Result decode2 = this.delegate.decode(binaryBitmap.crop(width, height, width, height), map);
                    makeAbsolute(decode2.getResultPoints(), width, height);
                    return decode2;
                }
            } catch (NotFoundException unused3) {
                Result decode3 = this.delegate.decode(binaryBitmap.crop(0, height, width, height), map);
                makeAbsolute(decode3.getResultPoints(), 0, height);
                return decode3;
            }
        } catch (NotFoundException unused4) {
            Result decode4 = this.delegate.decode(binaryBitmap.crop(width, 0, width, height), map);
            makeAbsolute(decode4.getResultPoints(), width, 0);
            return decode4;
        }
    }
}
