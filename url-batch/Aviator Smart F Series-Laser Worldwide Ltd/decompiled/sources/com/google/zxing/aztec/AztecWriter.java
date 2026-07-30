package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.aztec.encoder.AztecCode;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.common.BitMatrix;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AztecWriter implements Writer {
    private static BitMatrix renderResult(AztecCode aztecCode, int i8, int i9) {
        BitMatrix matrix = aztecCode.getMatrix();
        if (matrix == null) {
            throw new IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int max = Math.max(i8, width);
        int max2 = Math.max(i9, height);
        int min = Math.min(max / width, max2 / height);
        int i10 = (max - (width * min)) / 2;
        int i11 = (max2 - (height * min)) / 2;
        BitMatrix bitMatrix = new BitMatrix(max, max2);
        int i12 = 0;
        while (i12 < height) {
            int i13 = i10;
            int i14 = 0;
            while (i14 < width) {
                if (matrix.get(i14, i12)) {
                    bitMatrix.setRegion(i13, i11, min, min);
                }
                i14++;
                i13 += min;
            }
            i12++;
            i11 += min;
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9) {
        return encode(str, barcodeFormat, i8, i9, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Map<EncodeHintType, ?> map) {
        Charset charset;
        int i10;
        int i11;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charset2 = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            int parseInt = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                charset = charset2;
                i10 = parseInt;
                i11 = Integer.parseInt(map.get(encodeHintType3).toString());
                return encode(str, barcodeFormat, i8, i9, charset, i10, i11);
            }
            charset = charset2;
            i10 = parseInt;
        } else {
            charset = charset2;
            i10 = 33;
        }
        i11 = 0;
        return encode(str, barcodeFormat, i8, i9, charset, i10, i11);
    }

    private static BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Charset charset, int i10, int i11) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return renderResult(Encoder.encode(str.getBytes(charset), i10, i11), i8, i9);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
