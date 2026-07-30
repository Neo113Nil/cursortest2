package com.google.zxing.oned.rss.expanded.decoders;

import cn.hutool.core.io.file.c;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.ble.sifli.dfu.constants.SerialTrans;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitArray;

/* loaded from: classes4.dex */
final class GeneralAppIdDecoder {
    private final BitArray information;
    private final CurrentParsingState current = new CurrentParsingState();
    private final StringBuilder buffer = new StringBuilder();

    GeneralAppIdDecoder(BitArray bitArray) {
        this.information = bitArray;
    }

    private DecodedChar decodeAlphanumeric(int i8) {
        char c8;
        int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i8, 5);
        if (extractNumericValueFromBitArray == 15) {
            return new DecodedChar(i8 + 5, '$');
        }
        if (extractNumericValueFromBitArray >= 5 && extractNumericValueFromBitArray < 15) {
            return new DecodedChar(i8 + 5, (char) (extractNumericValueFromBitArray + 43));
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i8, 6);
        if (extractNumericValueFromBitArray2 >= 32 && extractNumericValueFromBitArray2 < 58) {
            return new DecodedChar(i8 + 6, (char) (extractNumericValueFromBitArray2 + 33));
        }
        switch (extractNumericValueFromBitArray2) {
            case 58:
                c8 = '*';
                break;
            case 59:
                c8 = ',';
                break;
            case 60:
                c8 = '-';
                break;
            case 61:
                c8 = '.';
                break;
            case 62:
                c8 = c.UNIX_SEPARATOR;
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(extractNumericValueFromBitArray2)));
        }
        return new DecodedChar(i8 + 6, c8);
    }

    private DecodedChar decodeIsoIec646(int i8) {
        int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i8, 5);
        if (extractNumericValueFromBitArray == 15) {
            return new DecodedChar(i8 + 5, '$');
        }
        char c8 = '+';
        if (extractNumericValueFromBitArray >= 5 && extractNumericValueFromBitArray < 15) {
            return new DecodedChar(i8 + 5, (char) (extractNumericValueFromBitArray + 43));
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i8, 7);
        if (extractNumericValueFromBitArray2 >= 64 && extractNumericValueFromBitArray2 < 90) {
            return new DecodedChar(i8 + 7, (char) (extractNumericValueFromBitArray2 + 1));
        }
        if (extractNumericValueFromBitArray2 >= 90 && extractNumericValueFromBitArray2 < 116) {
            return new DecodedChar(i8 + 7, (char) (extractNumericValueFromBitArray2 + 7));
        }
        switch (extractNumericValueFromBitArray(i8, 8)) {
            case 232:
                c8 = '!';
                break;
            case 233:
                c8 = '\"';
                break;
            case 234:
                c8 = '%';
                break;
            case 235:
                c8 = '&';
                break;
            case 236:
                c8 = '\'';
                break;
            case 237:
                c8 = '(';
                break;
            case 238:
                c8 = ')';
                break;
            case 239:
                c8 = '*';
                break;
            case 240:
                break;
            case GpsTrainingDaoProxy.GPS_TYPE /* 241 */:
                c8 = ',';
                break;
            case 242:
                c8 = '-';
                break;
            case 243:
                c8 = '.';
                break;
            case 244:
                c8 = c.UNIX_SEPARATOR;
                break;
            case 245:
                c8 = ':';
                break;
            case 246:
                c8 = ';';
                break;
            case SerialTrans.MTU_MAX /* 247 */:
                c8 = '<';
                break;
            case 248:
                c8 = '=';
                break;
            case 249:
                c8 = '>';
                break;
            case 250:
                c8 = '?';
                break;
            case 251:
                c8 = '_';
                break;
            case 252:
                c8 = ' ';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new DecodedChar(i8 + 8, c8);
    }

    private DecodedNumeric decodeNumeric(int i8) {
        int i9 = i8 + 7;
        if (i9 > this.information.getSize()) {
            int extractNumericValueFromBitArray = extractNumericValueFromBitArray(i8, 4);
            return extractNumericValueFromBitArray == 0 ? new DecodedNumeric(this.information.getSize(), 10, 10) : new DecodedNumeric(this.information.getSize(), extractNumericValueFromBitArray - 1, 10);
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i8, 7) - 8;
        return new DecodedNumeric(i9, extractNumericValueFromBitArray2 / 11, extractNumericValueFromBitArray2 % 11);
    }

    private boolean isAlphaOr646ToNumericLatch(int i8) {
        int i9 = i8 + 3;
        if (i9 > this.information.getSize()) {
            return false;
        }
        while (i8 < i9) {
            if (this.information.get(i8)) {
                return false;
            }
            i8++;
        }
        return true;
    }

    private boolean isAlphaTo646ToAlphaLatch(int i8) {
        int i9;
        if (i8 + 1 > this.information.getSize()) {
            return false;
        }
        for (int i10 = 0; i10 < 5 && (i9 = i10 + i8) < this.information.getSize(); i10++) {
            if (i10 == 2) {
                if (!this.information.get(i8 + 2)) {
                    return false;
                }
            } else if (this.information.get(i9)) {
                return false;
            }
        }
        return true;
    }

    private boolean isNumericToAlphaNumericLatch(int i8) {
        int i9;
        if (i8 + 1 > this.information.getSize()) {
            return false;
        }
        for (int i10 = 0; i10 < 4 && (i9 = i10 + i8) < this.information.getSize(); i10++) {
            if (this.information.get(i9)) {
                return false;
            }
        }
        return true;
    }

    private boolean isStillAlpha(int i8) {
        int extractNumericValueFromBitArray;
        if (i8 + 5 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i8, 5);
        if (extractNumericValueFromBitArray2 < 5 || extractNumericValueFromBitArray2 >= 16) {
            return i8 + 6 <= this.information.getSize() && (extractNumericValueFromBitArray = extractNumericValueFromBitArray(i8, 6)) >= 16 && extractNumericValueFromBitArray < 63;
        }
        return true;
    }

    private boolean isStillIsoIec646(int i8) {
        int extractNumericValueFromBitArray;
        if (i8 + 5 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray2 = extractNumericValueFromBitArray(i8, 5);
        if (extractNumericValueFromBitArray2 >= 5 && extractNumericValueFromBitArray2 < 16) {
            return true;
        }
        if (i8 + 7 > this.information.getSize()) {
            return false;
        }
        int extractNumericValueFromBitArray3 = extractNumericValueFromBitArray(i8, 7);
        if (extractNumericValueFromBitArray3 < 64 || extractNumericValueFromBitArray3 >= 116) {
            return i8 + 8 <= this.information.getSize() && (extractNumericValueFromBitArray = extractNumericValueFromBitArray(i8, 8)) >= 232 && extractNumericValueFromBitArray < 253;
        }
        return true;
    }

    private boolean isStillNumeric(int i8) {
        if (i8 + 7 > this.information.getSize()) {
            return i8 + 4 <= this.information.getSize();
        }
        int i9 = i8;
        while (true) {
            int i10 = i8 + 3;
            if (i9 >= i10) {
                return this.information.get(i10);
            }
            if (this.information.get(i9)) {
                return true;
            }
            i9++;
        }
    }

    private BlockParsedResult parseAlphaBlock() {
        while (isStillAlpha(this.current.getPosition())) {
            DecodedChar decodeAlphanumeric = decodeAlphanumeric(this.current.getPosition());
            this.current.setPosition(decodeAlphanumeric.getNewPosition());
            if (decodeAlphanumeric.isFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeAlphanumeric.getValue());
        }
        if (isAlphaOr646ToNumericLatch(this.current.getPosition())) {
            this.current.incrementPosition(3);
            this.current.setNumeric();
        } else if (isAlphaTo646ToAlphaLatch(this.current.getPosition())) {
            if (this.current.getPosition() + 5 < this.information.getSize()) {
                this.current.incrementPosition(5);
            } else {
                this.current.setPosition(this.information.getSize());
            }
            this.current.setIsoIec646();
        }
        return new BlockParsedResult(false);
    }

    private DecodedInformation parseBlocks() {
        BlockParsedResult parseNumericBlock;
        boolean isFinished;
        do {
            int position = this.current.getPosition();
            if (this.current.isAlpha()) {
                parseNumericBlock = parseAlphaBlock();
                isFinished = parseNumericBlock.isFinished();
            } else if (this.current.isIsoIec646()) {
                parseNumericBlock = parseIsoIec646Block();
                isFinished = parseNumericBlock.isFinished();
            } else {
                parseNumericBlock = parseNumericBlock();
                isFinished = parseNumericBlock.isFinished();
            }
            if (position == this.current.getPosition() && !isFinished) {
                break;
            }
        } while (!isFinished);
        return parseNumericBlock.getDecodedInformation();
    }

    private BlockParsedResult parseIsoIec646Block() {
        while (isStillIsoIec646(this.current.getPosition())) {
            DecodedChar decodeIsoIec646 = decodeIsoIec646(this.current.getPosition());
            this.current.setPosition(decodeIsoIec646.getNewPosition());
            if (decodeIsoIec646.isFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeIsoIec646.getValue());
        }
        if (isAlphaOr646ToNumericLatch(this.current.getPosition())) {
            this.current.incrementPosition(3);
            this.current.setNumeric();
        } else if (isAlphaTo646ToAlphaLatch(this.current.getPosition())) {
            if (this.current.getPosition() + 5 < this.information.getSize()) {
                this.current.incrementPosition(5);
            } else {
                this.current.setPosition(this.information.getSize());
            }
            this.current.setAlpha();
        }
        return new BlockParsedResult(false);
    }

    private BlockParsedResult parseNumericBlock() {
        while (isStillNumeric(this.current.getPosition())) {
            DecodedNumeric decodeNumeric = decodeNumeric(this.current.getPosition());
            this.current.setPosition(decodeNumeric.getNewPosition());
            if (decodeNumeric.isFirstDigitFNC1()) {
                return new BlockParsedResult(decodeNumeric.isSecondDigitFNC1() ? new DecodedInformation(this.current.getPosition(), this.buffer.toString()) : new DecodedInformation(this.current.getPosition(), this.buffer.toString(), decodeNumeric.getSecondDigit()), true);
            }
            this.buffer.append(decodeNumeric.getFirstDigit());
            if (decodeNumeric.isSecondDigitFNC1()) {
                return new BlockParsedResult(new DecodedInformation(this.current.getPosition(), this.buffer.toString()), true);
            }
            this.buffer.append(decodeNumeric.getSecondDigit());
        }
        if (isNumericToAlphaNumericLatch(this.current.getPosition())) {
            this.current.setAlpha();
            this.current.incrementPosition(4);
        }
        return new BlockParsedResult(false);
    }

    String decodeAllCodes(StringBuilder sb, int i8) {
        String str = null;
        while (true) {
            DecodedInformation decodeGeneralPurposeField = decodeGeneralPurposeField(i8, str);
            String parseFieldsInGeneralPurpose = FieldParser.parseFieldsInGeneralPurpose(decodeGeneralPurposeField.getNewString());
            if (parseFieldsInGeneralPurpose != null) {
                sb.append(parseFieldsInGeneralPurpose);
            }
            String valueOf = decodeGeneralPurposeField.isRemaining() ? String.valueOf(decodeGeneralPurposeField.getRemainingValue()) : null;
            if (i8 == decodeGeneralPurposeField.getNewPosition()) {
                return sb.toString();
            }
            i8 = decodeGeneralPurposeField.getNewPosition();
            str = valueOf;
        }
    }

    DecodedInformation decodeGeneralPurposeField(int i8, String str) {
        this.buffer.setLength(0);
        if (str != null) {
            this.buffer.append(str);
        }
        this.current.setPosition(i8);
        DecodedInformation parseBlocks = parseBlocks();
        return (parseBlocks == null || !parseBlocks.isRemaining()) ? new DecodedInformation(this.current.getPosition(), this.buffer.toString()) : new DecodedInformation(this.current.getPosition(), this.buffer.toString(), parseBlocks.getRemainingValue());
    }

    int extractNumericValueFromBitArray(int i8, int i9) {
        return extractNumericValueFromBitArray(this.information, i8, i9);
    }

    static int extractNumericValueFromBitArray(BitArray bitArray, int i8, int i9) {
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            if (bitArray.get(i8 + i11)) {
                i10 |= 1 << ((i9 - i11) - 1);
            }
        }
        return i10;
    }
}
