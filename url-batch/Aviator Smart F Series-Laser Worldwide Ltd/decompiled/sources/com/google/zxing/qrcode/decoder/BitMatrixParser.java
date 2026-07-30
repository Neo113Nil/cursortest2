package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* loaded from: classes4.dex */
final class BitMatrixParser {
    private final BitMatrix bitMatrix;
    private boolean mirror;
    private FormatInformation parsedFormatInfo;
    private Version parsedVersion;

    BitMatrixParser(BitMatrix bitMatrix) {
        int height = bitMatrix.getHeight();
        if (height < 21 || (height & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.bitMatrix = bitMatrix;
    }

    private int copyBit(int i8, int i9, int i10) {
        return this.mirror ? this.bitMatrix.get(i9, i8) : this.bitMatrix.get(i8, i9) ? (i10 << 1) | 1 : i10 << 1;
    }

    void mirror() {
        int i8 = 0;
        while (i8 < this.bitMatrix.getWidth()) {
            int i9 = i8 + 1;
            for (int i10 = i9; i10 < this.bitMatrix.getHeight(); i10++) {
                if (this.bitMatrix.get(i8, i10) != this.bitMatrix.get(i10, i8)) {
                    this.bitMatrix.flip(i10, i8);
                    this.bitMatrix.flip(i8, i10);
                }
            }
            i8 = i9;
        }
    }

    byte[] readCodewords() {
        FormatInformation readFormatInformation = readFormatInformation();
        Version readVersion = readVersion();
        DataMask dataMask = DataMask.values()[readFormatInformation.getDataMask()];
        int height = this.bitMatrix.getHeight();
        dataMask.unmaskBitMatrix(this.bitMatrix, height);
        BitMatrix buildFunctionPattern = readVersion.buildFunctionPattern();
        byte[] bArr = new byte[readVersion.getTotalCodewords()];
        int i8 = height - 1;
        boolean z7 = true;
        int i9 = i8;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i9 > 0) {
            if (i9 == 6) {
                i9--;
            }
            for (int i13 = 0; i13 < height; i13++) {
                int i14 = z7 ? i8 - i13 : i13;
                for (int i15 = 0; i15 < 2; i15++) {
                    int i16 = i9 - i15;
                    if (!buildFunctionPattern.get(i16, i14)) {
                        i11++;
                        i12 <<= 1;
                        if (this.bitMatrix.get(i16, i14)) {
                            i12 |= 1;
                        }
                        if (i11 == 8) {
                            bArr[i10] = (byte) i12;
                            i10++;
                            i11 = 0;
                            i12 = 0;
                        }
                    }
                }
            }
            z7 = !z7;
            i9 -= 2;
        }
        if (i10 == readVersion.getTotalCodewords()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    FormatInformation readFormatInformation() {
        FormatInformation formatInformation = this.parsedFormatInfo;
        if (formatInformation != null) {
            return formatInformation;
        }
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            i9 = copyBit(i10, 8, i9);
        }
        int copyBit = copyBit(8, 7, copyBit(8, 8, copyBit(7, 8, i9)));
        for (int i11 = 5; i11 >= 0; i11--) {
            copyBit = copyBit(8, i11, copyBit);
        }
        int height = this.bitMatrix.getHeight();
        int i12 = height - 7;
        for (int i13 = height - 1; i13 >= i12; i13--) {
            i8 = copyBit(8, i13, i8);
        }
        for (int i14 = height - 8; i14 < height; i14++) {
            i8 = copyBit(i14, 8, i8);
        }
        FormatInformation decodeFormatInformation = FormatInformation.decodeFormatInformation(copyBit, i8);
        this.parsedFormatInfo = decodeFormatInformation;
        if (decodeFormatInformation != null) {
            return decodeFormatInformation;
        }
        throw FormatException.getFormatInstance();
    }

    Version readVersion() {
        Version version = this.parsedVersion;
        if (version != null) {
            return version;
        }
        int height = this.bitMatrix.getHeight();
        int i8 = (height - 17) / 4;
        if (i8 <= 6) {
            return Version.getVersionForNumber(i8);
        }
        int i9 = height - 11;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = height - 9; i13 >= i9; i13--) {
                i11 = copyBit(i13, i12, i11);
            }
        }
        Version decodeVersionInformation = Version.decodeVersionInformation(i11);
        if (decodeVersionInformation != null && decodeVersionInformation.getDimensionForVersion() == height) {
            this.parsedVersion = decodeVersionInformation;
            return decodeVersionInformation;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = height - 9; i15 >= i9; i15--) {
                i10 = copyBit(i14, i15, i10);
            }
        }
        Version decodeVersionInformation2 = Version.decodeVersionInformation(i10);
        if (decodeVersionInformation2 == null || decodeVersionInformation2.getDimensionForVersion() != height) {
            throw FormatException.getFormatInstance();
        }
        this.parsedVersion = decodeVersionInformation2;
        return decodeVersionInformation2;
    }

    void remask() {
        if (this.parsedFormatInfo == null) {
            return;
        }
        DataMask.values()[this.parsedFormatInfo.getDataMask()].unmaskBitMatrix(this.bitMatrix, this.bitMatrix.getHeight());
    }

    void setMirror(boolean z7) {
        this.parsedVersion = null;
        this.parsedFormatInfo = null;
        this.mirror = z7;
    }
}
