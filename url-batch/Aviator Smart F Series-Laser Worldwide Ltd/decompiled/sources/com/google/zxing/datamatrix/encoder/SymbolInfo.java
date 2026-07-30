package com.google.zxing.datamatrix.encoder;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.zxing.Dimension;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.DfuException;

/* loaded from: classes4.dex */
public class SymbolInfo {
    static final SymbolInfo[] PROD_SYMBOLS;
    private static SymbolInfo[] symbols;
    private final int dataCapacity;
    private final int dataRegions;
    private final int errorCodewords;
    public final int matrixHeight;
    public final int matrixWidth;
    private final boolean rectangular;
    private final int rsBlockData;
    private final int rsBlockError;

    static {
        SymbolInfo[] symbolInfoArr = {new SymbolInfo(false, 3, 5, 8, 8, 1), new SymbolInfo(false, 5, 7, 10, 10, 1), new SymbolInfo(true, 5, 7, 16, 6, 1), new SymbolInfo(false, 8, 10, 12, 12, 1), new SymbolInfo(true, 10, 11, 14, 6, 2), new SymbolInfo(false, 12, 12, 14, 14, 1), new SymbolInfo(true, 16, 14, 24, 10, 1), new SymbolInfo(false, 18, 14, 16, 16, 1), new SymbolInfo(false, 22, 18, 18, 18, 1), new SymbolInfo(true, 22, 18, 16, 10, 2), new SymbolInfo(false, 30, 20, 20, 20, 1), new SymbolInfo(true, 32, 24, 16, 14, 2), new SymbolInfo(false, 36, 24, 22, 22, 1), new SymbolInfo(false, 44, 28, 24, 24, 1), new SymbolInfo(true, 49, 28, 22, 14, 2), new SymbolInfo(false, 62, 36, 14, 14, 4), new SymbolInfo(false, 86, 42, 16, 16, 4), new SymbolInfo(false, 114, 48, 18, 18, 4), new SymbolInfo(false, GattError.GATT_DUP_REG, 56, 20, 20, 4), new SymbolInfo(false, 174, 68, 22, 22, 4), new SymbolInfo(false, 204, 84, 24, 24, 4, 102, 42), new SymbolInfo(false, DfuException.ERROR_ENTER_OTA_MODE_FAILED, 112, 14, 14, 16, 140, 56), new SymbolInfo(false, 368, GattError.GATT_DUP_REG, 16, 16, 16, 92, 36), new SymbolInfo(false, 456, PsExtractor.AUDIO_STREAM, 18, 18, 16, 114, 48), new SymbolInfo(false, 576, 224, 20, 20, 16, GattError.GATT_DUP_REG, 56), new SymbolInfo(false, 696, DfuException.ERROR_READ_PATCH_INFO_ERROR, 22, 22, 16, 174, 68), new SymbolInfo(false, 816, 336, 24, 24, 16, GattError.GATT_PENDING, 56), new SymbolInfo(false, 1050, 408, 18, 18, 36, 175, 68), new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62), new DataMatrixSymbolInfo144()};
        PROD_SYMBOLS = symbolInfoArr;
        symbols = symbolInfoArr;
    }

    public SymbolInfo(boolean z7, int i8, int i9, int i10, int i11, int i12) {
        this(z7, i8, i9, i10, i11, i12, i8, i9);
    }

    private int getHorizontalDataRegions() {
        int i8 = this.dataRegions;
        int i9 = 1;
        if (i8 != 1) {
            i9 = 2;
            if (i8 != 2 && i8 != 4) {
                if (i8 == 16) {
                    return 4;
                }
                if (i8 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i9;
    }

    private int getVerticalDataRegions() {
        int i8 = this.dataRegions;
        if (i8 == 1 || i8 == 2) {
            return 1;
        }
        if (i8 == 4) {
            return 2;
        }
        if (i8 == 16) {
            return 4;
        }
        if (i8 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static SymbolInfo lookup(int i8) {
        return lookup(i8, SymbolShapeHint.FORCE_NONE, true);
    }

    public static void overrideSymbolSet(SymbolInfo[] symbolInfoArr) {
        symbols = symbolInfoArr;
    }

    public int getCodewordCount() {
        return this.dataCapacity + this.errorCodewords;
    }

    public final int getDataCapacity() {
        return this.dataCapacity;
    }

    public int getDataLengthForInterleavedBlock(int i8) {
        return this.rsBlockData;
    }

    public final int getErrorCodewords() {
        return this.errorCodewords;
    }

    public final int getErrorLengthForInterleavedBlock(int i8) {
        return this.rsBlockError;
    }

    public int getInterleavedBlockCount() {
        return this.dataCapacity / this.rsBlockData;
    }

    public final int getSymbolDataHeight() {
        return getVerticalDataRegions() * this.matrixHeight;
    }

    public final int getSymbolDataWidth() {
        return getHorizontalDataRegions() * this.matrixWidth;
    }

    public final int getSymbolHeight() {
        return getSymbolDataHeight() + (getVerticalDataRegions() << 1);
    }

    public final int getSymbolWidth() {
        return getSymbolDataWidth() + (getHorizontalDataRegions() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.rectangular ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.matrixWidth);
        sb.append('x');
        sb.append(this.matrixHeight);
        sb.append(", symbol size ");
        sb.append(getSymbolWidth());
        sb.append('x');
        sb.append(getSymbolHeight());
        sb.append(", symbol data size ");
        sb.append(getSymbolDataWidth());
        sb.append('x');
        sb.append(getSymbolDataHeight());
        sb.append(", codewords ");
        sb.append(this.dataCapacity);
        sb.append('+');
        sb.append(this.errorCodewords);
        return sb.toString();
    }

    SymbolInfo(boolean z7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.rectangular = z7;
        this.dataCapacity = i8;
        this.errorCodewords = i9;
        this.matrixWidth = i10;
        this.matrixHeight = i11;
        this.dataRegions = i12;
        this.rsBlockData = i13;
        this.rsBlockError = i14;
    }

    public static SymbolInfo lookup(int i8, SymbolShapeHint symbolShapeHint) {
        return lookup(i8, symbolShapeHint, true);
    }

    public static SymbolInfo lookup(int i8, boolean z7, boolean z8) {
        return lookup(i8, z7 ? SymbolShapeHint.FORCE_NONE : SymbolShapeHint.FORCE_SQUARE, z8);
    }

    private static SymbolInfo lookup(int i8, SymbolShapeHint symbolShapeHint, boolean z7) {
        return lookup(i8, symbolShapeHint, null, null, z7);
    }

    public static SymbolInfo lookup(int i8, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2, boolean z7) {
        for (SymbolInfo symbolInfo : symbols) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && symbolInfo.rectangular) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || symbolInfo.rectangular) && ((dimension == null || (symbolInfo.getSymbolWidth() >= dimension.getWidth() && symbolInfo.getSymbolHeight() >= dimension.getHeight())) && ((dimension2 == null || (symbolInfo.getSymbolWidth() <= dimension2.getWidth() && symbolInfo.getSymbolHeight() <= dimension2.getHeight())) && i8 <= symbolInfo.dataCapacity)))) {
                return symbolInfo;
            }
        }
        if (z7) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i8)));
        }
        return null;
    }
}
