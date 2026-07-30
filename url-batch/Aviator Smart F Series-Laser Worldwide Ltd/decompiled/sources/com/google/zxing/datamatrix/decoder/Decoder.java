package com.google.zxing.datamatrix.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* loaded from: classes4.dex */
public final class Decoder {
    private final ReedSolomonDecoder rsDecoder = new ReedSolomonDecoder(GenericGF.DATA_MATRIX_FIELD_256);

    private void correctErrors(byte[] bArr, int i8) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = bArr[i9] & 255;
        }
        try {
            this.rsDecoder.decode(iArr, bArr.length - i8);
            for (int i10 = 0; i10 < i8; i10++) {
                bArr[i10] = (byte) iArr[i10];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public DecoderResult decode(boolean[][] zArr) {
        return decode(BitMatrix.parse(zArr));
    }

    public DecoderResult decode(BitMatrix bitMatrix) {
        BitMatrixParser bitMatrixParser = new BitMatrixParser(bitMatrix);
        DataBlock[] dataBlocks = DataBlock.getDataBlocks(bitMatrixParser.readCodewords(), bitMatrixParser.getVersion());
        int i8 = 0;
        for (DataBlock dataBlock : dataBlocks) {
            i8 += dataBlock.getNumDataCodewords();
        }
        byte[] bArr = new byte[i8];
        int length = dataBlocks.length;
        for (int i9 = 0; i9 < length; i9++) {
            DataBlock dataBlock2 = dataBlocks[i9];
            byte[] codewords = dataBlock2.getCodewords();
            int numDataCodewords = dataBlock2.getNumDataCodewords();
            correctErrors(codewords, numDataCodewords);
            for (int i10 = 0; i10 < numDataCodewords; i10++) {
                bArr[(i10 * length) + i9] = codewords[i10];
            }
        }
        return DecodedBitStreamParser.decode(bArr);
    }
}
