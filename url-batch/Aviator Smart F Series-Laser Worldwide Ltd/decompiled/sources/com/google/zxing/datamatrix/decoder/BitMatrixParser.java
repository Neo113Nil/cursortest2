package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes4.dex */
final class BitMatrixParser {
    private final BitMatrix mappingBitMatrix;
    private final BitMatrix readMappingMatrix;
    private final Version version;

    BitMatrixParser(BitMatrix bitMatrix) {
        int height = bitMatrix.getHeight();
        if (height < 8 || height > 144 || (height & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.version = readVersion(bitMatrix);
        BitMatrix extractDataRegion = extractDataRegion(bitMatrix);
        this.mappingBitMatrix = extractDataRegion;
        this.readMappingMatrix = new BitMatrix(extractDataRegion.getWidth(), extractDataRegion.getHeight());
    }

    private BitMatrix extractDataRegion(BitMatrix bitMatrix) {
        int symbolSizeRows = this.version.getSymbolSizeRows();
        int symbolSizeColumns = this.version.getSymbolSizeColumns();
        if (bitMatrix.getHeight() != symbolSizeRows) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int dataRegionSizeRows = this.version.getDataRegionSizeRows();
        int dataRegionSizeColumns = this.version.getDataRegionSizeColumns();
        int i8 = symbolSizeRows / dataRegionSizeRows;
        int i9 = symbolSizeColumns / dataRegionSizeColumns;
        BitMatrix bitMatrix2 = new BitMatrix(i9 * dataRegionSizeColumns, i8 * dataRegionSizeRows);
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = i10 * dataRegionSizeRows;
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = i12 * dataRegionSizeColumns;
                for (int i14 = 0; i14 < dataRegionSizeRows; i14++) {
                    int i15 = ((dataRegionSizeRows + 2) * i10) + 1 + i14;
                    int i16 = i11 + i14;
                    for (int i17 = 0; i17 < dataRegionSizeColumns; i17++) {
                        if (bitMatrix.get(((dataRegionSizeColumns + 2) * i12) + 1 + i17, i15)) {
                            bitMatrix2.set(i13 + i17, i16);
                        }
                    }
                }
            }
        }
        return bitMatrix2;
    }

    private int readCorner1(int i8, int i9) {
        int i10 = i8 - 1;
        int i11 = (readModule(i10, 0, i8, i9) ? 1 : 0) << 1;
        if (readModule(i10, 1, i8, i9)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (readModule(i10, 2, i8, i9)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (readModule(0, i9 - 2, i8, i9)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        int i15 = i9 - 1;
        if (readModule(0, i15, i8, i9)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        if (readModule(1, i15, i8, i9)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        if (readModule(2, i15, i8, i9)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        return readModule(3, i15, i8, i9) ? i18 | 1 : i18;
    }

    private int readCorner2(int i8, int i9) {
        int i10 = (readModule(i8 + (-3), 0, i8, i9) ? 1 : 0) << 1;
        if (readModule(i8 - 2, 0, i8, i9)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (readModule(i8 - 1, 0, i8, i9)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (readModule(0, i9 - 4, i8, i9)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (readModule(0, i9 - 3, i8, i9)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (readModule(0, i9 - 2, i8, i9)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i9 - 1;
        if (readModule(0, i16, i8, i9)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        return readModule(1, i16, i8, i9) ? i17 | 1 : i17;
    }

    private int readCorner3(int i8, int i9) {
        int i10 = i8 - 1;
        int i11 = (readModule(i10, 0, i8, i9) ? 1 : 0) << 1;
        int i12 = i9 - 1;
        if (readModule(i10, i12, i8, i9)) {
            i11 |= 1;
        }
        int i13 = i11 << 1;
        int i14 = i9 - 3;
        if (readModule(0, i14, i8, i9)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i9 - 2;
        if (readModule(0, i16, i8, i9)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (readModule(0, i12, i8, i9)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (readModule(1, i14, i8, i9)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (readModule(1, i16, i8, i9)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        return readModule(1, i12, i8, i9) ? i20 | 1 : i20;
    }

    private int readCorner4(int i8, int i9) {
        int i10 = (readModule(i8 + (-3), 0, i8, i9) ? 1 : 0) << 1;
        if (readModule(i8 - 2, 0, i8, i9)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (readModule(i8 - 1, 0, i8, i9)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (readModule(0, i9 - 2, i8, i9)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        int i14 = i9 - 1;
        if (readModule(0, i14, i8, i9)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        if (readModule(1, i14, i8, i9)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (readModule(2, i14, i8, i9)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        return readModule(3, i14, i8, i9) ? i17 | 1 : i17;
    }

    private boolean readModule(int i8, int i9, int i10, int i11) {
        if (i8 < 0) {
            i8 += i10;
            i9 += 4 - ((i10 + 4) & 7);
        }
        if (i9 < 0) {
            i9 += i11;
            i8 += 4 - ((i11 + 4) & 7);
        }
        this.readMappingMatrix.set(i9, i8);
        return this.mappingBitMatrix.get(i9, i8);
    }

    private int readUtah(int i8, int i9, int i10, int i11) {
        int i12 = i8 - 2;
        int i13 = i9 - 2;
        int i14 = (readModule(i12, i13, i10, i11) ? 1 : 0) << 1;
        int i15 = i9 - 1;
        if (readModule(i12, i15, i10, i11)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        int i17 = i8 - 1;
        if (readModule(i17, i13, i10, i11)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (readModule(i17, i15, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (readModule(i17, i9, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (readModule(i8, i13, i10, i11)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (readModule(i8, i15, i10, i11)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return readModule(i8, i9, i10, i11) ? i22 | 1 : i22;
    }

    private static Version readVersion(BitMatrix bitMatrix) {
        return Version.getVersionForDimensions(bitMatrix.getHeight(), bitMatrix.getWidth());
    }

    Version getVersion() {
        return this.version;
    }

    byte[] readCodewords() {
        byte[] bArr = new byte[this.version.getTotalCodewords()];
        int height = this.mappingBitMatrix.getHeight();
        int width = this.mappingBitMatrix.getWidth();
        int i8 = 0;
        boolean z7 = false;
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i10 = 4;
        while (true) {
            if (i10 == height && i8 == 0 && !z7) {
                bArr[i9] = (byte) readCorner1(height, width);
                i10 -= 2;
                i8 += 2;
                i9++;
                z7 = true;
            } else {
                int i11 = height - 2;
                if (i10 == i11 && i8 == 0 && (width & 3) != 0 && !z8) {
                    bArr[i9] = (byte) readCorner2(height, width);
                    i10 -= 2;
                    i8 += 2;
                    i9++;
                    z8 = true;
                } else if (i10 == height + 4 && i8 == 2 && (width & 7) == 0 && !z9) {
                    bArr[i9] = (byte) readCorner3(height, width);
                    i10 -= 2;
                    i8 += 2;
                    i9++;
                    z9 = true;
                } else if (i10 == i11 && i8 == 0 && (width & 7) == 4 && !z10) {
                    bArr[i9] = (byte) readCorner4(height, width);
                    i10 -= 2;
                    i8 += 2;
                    i9++;
                    z10 = true;
                } else {
                    while (true) {
                        if (i10 < height && i8 >= 0 && !this.readMappingMatrix.get(i8, i10)) {
                            bArr[i9] = (byte) readUtah(i10, i8, height, width);
                            i9++;
                        }
                        int i12 = i10 - 2;
                        int i13 = i8 + 2;
                        if (i12 < 0 || i13 >= width) {
                            break;
                        }
                        i10 = i12;
                        i8 = i13;
                    }
                    int i14 = i10 - 1;
                    int i15 = i8 + 5;
                    while (true) {
                        if (i14 >= 0 && i15 < width && !this.readMappingMatrix.get(i15, i14)) {
                            bArr[i9] = (byte) readUtah(i14, i15, height, width);
                            i9++;
                        }
                        int i16 = i14 + 2;
                        int i17 = i15 - 2;
                        if (i16 >= height || i17 < 0) {
                            break;
                        }
                        i14 = i16;
                        i15 = i17;
                    }
                    i10 = i14 + 5;
                    i8 = i15 - 1;
                }
            }
            if (i10 >= height && i8 >= width) {
                break;
            }
        }
        if (i9 == this.version.getTotalCodewords()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }
}
