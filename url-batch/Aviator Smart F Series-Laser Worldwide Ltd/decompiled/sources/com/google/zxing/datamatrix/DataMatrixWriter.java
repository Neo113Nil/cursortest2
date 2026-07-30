package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.Map;

/* loaded from: classes4.dex */
public final class DataMatrixWriter implements Writer {
    private static BitMatrix convertByteMatrixToBitMatrix(ByteMatrix byteMatrix, int i8, int i9) {
        BitMatrix bitMatrix;
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int max = Math.max(i8, width);
        int max2 = Math.max(i9, height);
        int min = Math.min(max / width, max2 / height);
        int i10 = (max - (width * min)) / 2;
        int i11 = (max2 - (height * min)) / 2;
        if (i9 < height || i8 < width) {
            bitMatrix = new BitMatrix(width, height);
            i10 = 0;
            i11 = 0;
        } else {
            bitMatrix = new BitMatrix(i8, i9);
        }
        bitMatrix.clear();
        int i12 = 0;
        while (i12 < height) {
            int i13 = i10;
            int i14 = 0;
            while (i14 < width) {
                if (byteMatrix.get(i14, i12) == 1) {
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

    private static BitMatrix encodeLowLevel(DefaultPlacement defaultPlacement, SymbolInfo symbolInfo, int i8, int i9) {
        int symbolDataWidth = symbolInfo.getSymbolDataWidth();
        int symbolDataHeight = symbolInfo.getSymbolDataHeight();
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfo.getSymbolWidth(), symbolInfo.getSymbolHeight());
        int i10 = 0;
        for (int i11 = 0; i11 < symbolDataHeight; i11++) {
            if (i11 % symbolInfo.matrixHeight == 0) {
                int i12 = 0;
                for (int i13 = 0; i13 < symbolInfo.getSymbolWidth(); i13++) {
                    byteMatrix.set(i12, i10, i13 % 2 == 0);
                    i12++;
                }
                i10++;
            }
            int i14 = 0;
            for (int i15 = 0; i15 < symbolDataWidth; i15++) {
                if (i15 % symbolInfo.matrixWidth == 0) {
                    byteMatrix.set(i14, i10, true);
                    i14++;
                }
                byteMatrix.set(i14, i10, defaultPlacement.getBit(i15, i11));
                int i16 = i14 + 1;
                int i17 = symbolInfo.matrixWidth;
                if (i15 % i17 == i17 - 1) {
                    byteMatrix.set(i16, i10, i11 % 2 == 0);
                    i14 += 2;
                } else {
                    i14 = i16;
                }
            }
            int i18 = i10 + 1;
            int i19 = symbolInfo.matrixHeight;
            if (i11 % i19 == i19 - 1) {
                int i20 = 0;
                for (int i21 = 0; i21 < symbolInfo.getSymbolWidth(); i21++) {
                    byteMatrix.set(i20, i18, true);
                    i20++;
                }
                i10 += 2;
            } else {
                i10 = i18;
            }
        }
        return convertByteMatrixToBitMatrix(byteMatrix, i8, i9);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9) {
        return encode(str, barcodeFormat, i8, i9, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Map<EncodeHintType, ?> map) {
        Dimension dimension;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i8 < 0 || i9 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i8 + 'x' + i9);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        Dimension dimension2 = null;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            Dimension dimension3 = (Dimension) map.get(EncodeHintType.MIN_SIZE);
            if (dimension3 == null) {
                dimension3 = null;
            }
            dimension = (Dimension) map.get(EncodeHintType.MAX_SIZE);
            if (dimension == null) {
                dimension = null;
            }
            dimension2 = dimension3;
        } else {
            dimension = null;
        }
        String encodeHighLevel = HighLevelEncoder.encodeHighLevel(str, symbolShapeHint, dimension2, dimension);
        SymbolInfo lookup = SymbolInfo.lookup(encodeHighLevel.length(), symbolShapeHint, dimension2, dimension, true);
        DefaultPlacement defaultPlacement = new DefaultPlacement(ErrorCorrection.encodeECC200(encodeHighLevel, lookup), lookup.getSymbolDataWidth(), lookup.getSymbolDataHeight());
        defaultPlacement.place();
        return encodeLowLevel(defaultPlacement, lookup, i8, i9);
    }
}
