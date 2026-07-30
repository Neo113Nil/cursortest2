package com.google.zxing.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.qrcode.decoder.Decoder;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import com.google.zxing.qrcode.detector.Detector;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class QRCodeReader implements Reader {
    private static final ResultPoint[] NO_POINTS = new ResultPoint[0];
    private final Decoder decoder = new Decoder();

    private static BitMatrix extractPureBits(BitMatrix bitMatrix) {
        int[] topLeftOnBit = bitMatrix.getTopLeftOnBit();
        int[] bottomRightOnBit = bitMatrix.getBottomRightOnBit();
        if (topLeftOnBit == null || bottomRightOnBit == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float moduleSize = moduleSize(topLeftOnBit, bitMatrix);
        int i8 = topLeftOnBit[1];
        int i9 = bottomRightOnBit[1];
        int i10 = topLeftOnBit[0];
        int i11 = bottomRightOnBit[0];
        if (i10 >= i11 || i8 >= i9) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i12 = i9 - i8;
        if (i12 != i11 - i10 && (i11 = i10 + i12) >= bitMatrix.getWidth()) {
            throw NotFoundException.getNotFoundInstance();
        }
        int round = Math.round(((i11 - i10) + 1) / moduleSize);
        int round2 = Math.round((i12 + 1) / moduleSize);
        if (round <= 0 || round2 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (round2 != round) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i13 = (int) (moduleSize / 2.0f);
        int i14 = i8 + i13;
        int i15 = i10 + i13;
        int i16 = (((int) ((round - 1) * moduleSize)) + i15) - i11;
        if (i16 > 0) {
            if (i16 > i13) {
                throw NotFoundException.getNotFoundInstance();
            }
            i15 -= i16;
        }
        int i17 = (((int) ((round2 - 1) * moduleSize)) + i14) - i9;
        if (i17 > 0) {
            if (i17 > i13) {
                throw NotFoundException.getNotFoundInstance();
            }
            i14 -= i17;
        }
        BitMatrix bitMatrix2 = new BitMatrix(round, round2);
        for (int i18 = 0; i18 < round2; i18++) {
            int i19 = ((int) (i18 * moduleSize)) + i14;
            for (int i20 = 0; i20 < round; i20++) {
                if (bitMatrix.get(((int) (i20 * moduleSize)) + i15, i19)) {
                    bitMatrix2.set(i20, i18);
                }
            }
        }
        return bitMatrix2;
    }

    private static float moduleSize(int[] iArr, BitMatrix bitMatrix) {
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        int i8 = iArr[0];
        boolean z7 = true;
        int i9 = iArr[1];
        int i10 = 0;
        while (i8 < width && i9 < height) {
            if (z7 != bitMatrix.get(i8, i9)) {
                i10++;
                if (i10 == 5) {
                    break;
                }
                z7 = !z7;
            }
            i8++;
            i9++;
        }
        if (i8 == width || i9 == height) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (i8 - iArr[0]) / 7.0f;
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) {
        return decode(binaryBitmap, null);
    }

    protected final Decoder getDecoder() {
        return this.decoder;
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public final Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) {
        ResultPoint[] points;
        DecoderResult decoderResult;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            DetectorResult detect = new Detector(binaryBitmap.getBlackMatrix()).detect(map);
            DecoderResult decode = this.decoder.decode(detect.getBits(), map);
            points = detect.getPoints();
            decoderResult = decode;
        } else {
            decoderResult = this.decoder.decode(extractPureBits(binaryBitmap.getBlackMatrix()), map);
            points = NO_POINTS;
        }
        if (decoderResult.getOther() instanceof QRCodeDecoderMetaData) {
            ((QRCodeDecoderMetaData) decoderResult.getOther()).applyMirroredCorrection(points);
        }
        Result result = new Result(decoderResult.getText(), decoderResult.getRawBytes(), points, BarcodeFormat.QR_CODE);
        List<byte[]> byteSegments = decoderResult.getByteSegments();
        if (byteSegments != null) {
            result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        String eCLevel = decoderResult.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        if (decoderResult.hasStructuredAppend()) {
            result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(decoderResult.getStructuredAppendSequenceNumber()));
            result.putMetadata(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(decoderResult.getStructuredAppendParity()));
        }
        return result;
    }
}
