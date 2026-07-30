package com.google.zxing.oned.rss.expanded;

import com.baidu.ar.face.algo.FAUEnum;
import com.baidu.ar.face.algo.FaceFrame;
import com.baidu.location.BDLocation;
import com.crrepa.band.my.device.customkey.util.c;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final int MAX_PAIRS = 11;
    private final List<ExpandedPair> pairs = new ArrayList(11);
    private final List<ExpandedRow> rows = new ArrayList();
    private final int[] startEnd = new int[2];
    private boolean startFromEven;
    private static final int[] SYMBOL_WIDEST = {7, 5, 4, 3, 1};
    private static final int[] EVEN_TOTAL_SUBSET = {4, 20, 52, 104, 204};
    private static final int[] GSUM = {0, 348, 1388, 2948, 3988};
    private static final int[][] FINDER_PATTERNS = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] WEIGHTS = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, c.MAX_GOAL_TIME, 118, GattError.GATT_CONGESTED, 7, 21, 63}, new int[]{PsExtractor.PRIVATE_STREAM_1, GattError.GATT_ALREADY_OPEN, 13, 39, 117, 140, FAUEnum.PR_TIMEOUT, 205}, new int[]{193, 157, 49, GattError.GATT_CONNECTION_TIMEOUT, 19, 57, 171, 91}, new int[]{62, 186, GattError.GATT_PENDING, 197, 169, 85, 44, 132}, new int[]{185, 133, TsExtractor.TS_PACKET_SIZE, GattError.GATT_NOT_ENCRYPTED, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, TsExtractor.TS_STREAM_TYPE_DTS, 203, 187, GattError.GATT_INVALID_CFG, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, DfuAdapter.ConnectState.REQUEST_MTU, 106, 107, 110, 119, GattError.GATT_CANCEL}, new int[]{16, 48, GattError.GATT_DUP_REG, 10, 30, 90, 59, 177}, new int[]{109, 116, GattError.GATT_AUTH_FAIL, 200, 178, 112, 125, 164}, new int[]{70, 210, FAUEnum.PR_ANIMATE_FAILED, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, FaceFrame.FACE_LANDMARKS_COUNT}, new int[]{148, 22, 66, 198, TsExtractor.TS_STREAM_TYPE_AC4, 94, 71, 2}, new int[]{6, 18, 54, BDLocation.TypeServerDecryptError, 64, PsExtractor.AUDIO_STREAM, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, BDLocation.TypeServerError}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, BDLocation.TypeCoarseLocation, 58, 174, 100, 89}};
    private static final int[][] FINDER_PATTERN_SEQUENCES = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    private void adjustOddEvenCounts(int i8) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int sum = MathUtils.sum(getOddCounts());
        int sum2 = MathUtils.sum(getEvenCounts());
        boolean z11 = true;
        if (sum > 13) {
            z7 = false;
            z8 = true;
        } else {
            z7 = sum < 4;
            z8 = false;
        }
        if (sum2 > 13) {
            z9 = false;
            z10 = true;
        } else {
            z9 = sum2 < 4;
            z10 = false;
        }
        int i9 = (sum + sum2) - i8;
        boolean z12 = (sum & 1) == 1;
        boolean z13 = (sum2 & 1) == 0;
        if (i9 == 1) {
            if (z12) {
                if (z13) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z11 = z7;
                z8 = true;
            } else {
                if (!z13) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z11 = z7;
                z10 = true;
            }
        } else if (i9 == -1) {
            if (z12) {
                if (z13) {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else {
                if (!z13) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z11 = z7;
                z9 = true;
            }
        } else {
            if (i9 != 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (z12) {
                if (!z13) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sum >= sum2) {
                    z11 = z7;
                    z9 = true;
                    z8 = true;
                }
                z10 = true;
            } else {
                if (z13) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z11 = z7;
            }
        }
        if (z11) {
            if (z8) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
        }
        if (z8) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z9) {
            if (z10) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
        }
        if (z10) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }

    private boolean checkChecksum() {
        ExpandedPair expandedPair = this.pairs.get(0);
        DataCharacter leftChar = expandedPair.getLeftChar();
        DataCharacter rightChar = expandedPair.getRightChar();
        if (rightChar == null) {
            return false;
        }
        int checksumPortion = rightChar.getChecksumPortion();
        int i8 = 2;
        for (int i9 = 1; i9 < this.pairs.size(); i9++) {
            ExpandedPair expandedPair2 = this.pairs.get(i9);
            checksumPortion += expandedPair2.getLeftChar().getChecksumPortion();
            int i10 = i8 + 1;
            DataCharacter rightChar2 = expandedPair2.getRightChar();
            if (rightChar2 != null) {
                checksumPortion += rightChar2.getChecksumPortion();
                i8 += 2;
            } else {
                i8 = i10;
            }
        }
        return ((i8 + (-4)) * 211) + (checksumPortion % 211) == leftChar.getValue();
    }

    private List<ExpandedPair> checkRows(boolean z7) {
        List<ExpandedPair> list = null;
        if (this.rows.size() > 25) {
            this.rows.clear();
            return null;
        }
        this.pairs.clear();
        if (z7) {
            Collections.reverse(this.rows);
        }
        try {
            list = checkRows(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z7) {
            Collections.reverse(this.rows);
        }
        return list;
    }

    static Result constructResult(List<ExpandedPair> list) {
        String parseInformation = AbstractExpandedDecoder.createDecoder(BitArrayBuilder.buildBitArray(list)).parseInformation();
        ResultPoint[] resultPoints = list.get(0).getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = list.get(list.size() - 1).getFinderPattern().getResultPoints();
        return new Result(parseInformation, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    private void findNextPair(BitArray bitArray, List<ExpandedPair> list, int i8) {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        if (i8 < 0) {
            i8 = list.isEmpty() ? 0 : list.get(list.size() - 1).getFinderPattern().getStartEnd()[1];
        }
        boolean z7 = list.size() % 2 != 0;
        if (this.startFromEven) {
            z7 = !z7;
        }
        boolean z8 = false;
        while (i8 < size) {
            z8 = !bitArray.get(i8);
            if (!z8) {
                break;
            } else {
                i8++;
            }
        }
        boolean z9 = z8;
        int i9 = 0;
        int i10 = i8;
        while (i8 < size) {
            if (bitArray.get(i8) != z9) {
                decodeFinderCounters[i9] = decodeFinderCounters[i9] + 1;
            } else {
                if (i9 == 3) {
                    if (z7) {
                        reverseCounters(decodeFinderCounters);
                    }
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        int[] iArr = this.startEnd;
                        iArr[0] = i10;
                        iArr[1] = i8;
                        return;
                    }
                    if (z7) {
                        reverseCounters(decodeFinderCounters);
                    }
                    i10 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i9--;
                } else {
                    i9++;
                }
                decodeFinderCounters[i9] = 1;
                z9 = !z9;
            }
            i8++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int getNextSecondBar(BitArray bitArray, int i8) {
        return bitArray.get(i8) ? bitArray.getNextSet(bitArray.getNextUnset(i8)) : bitArray.getNextUnset(bitArray.getNextSet(i8));
    }

    private static boolean isNotA1left(FinderPattern finderPattern, boolean z7, boolean z8) {
        return (finderPattern.getValue() == 0 && z7 && z8) ? false : true;
    }

    private static boolean isPartialRow(Iterable<ExpandedPair> iterable, Iterable<ExpandedRow> iterable2) {
        for (ExpandedRow expandedRow : iterable2) {
            for (ExpandedPair expandedPair : iterable) {
                Iterator<ExpandedPair> it = expandedRow.getPairs().iterator();
                while (it.hasNext()) {
                    if (expandedPair.equals(it.next())) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static boolean isValidSequence(List<ExpandedPair> list) {
        for (int[] iArr : FINDER_PATTERN_SEQUENCES) {
            if (list.size() <= iArr.length) {
                for (int i8 = 0; i8 < list.size(); i8++) {
                    if (list.get(i8).getFinderPattern().getValue() != iArr[i8]) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i8, boolean z7) {
        int i9;
        int i10;
        int i11;
        if (z7) {
            int i12 = this.startEnd[0] - 1;
            while (i12 >= 0 && !bitArray.get(i12)) {
                i12--;
            }
            int i13 = i12 + 1;
            int[] iArr = this.startEnd;
            i11 = iArr[0] - i13;
            i9 = iArr[1];
            i10 = i13;
        } else {
            int[] iArr2 = this.startEnd;
            int i14 = iArr2[0];
            int nextUnset = bitArray.getNextUnset(iArr2[1] + 1);
            i9 = nextUnset;
            i10 = i14;
            i11 = nextUnset - this.startEnd[1];
        }
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i11;
        try {
            return new FinderPattern(AbstractRSSReader.parseFinderValue(decodeFinderCounters, FINDER_PATTERNS), new int[]{i10, i9}, i10, i9, i8);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static void removePartialRows(List<ExpandedPair> list, List<ExpandedRow> list2) {
        Iterator<ExpandedRow> it = list2.iterator();
        while (it.hasNext()) {
            ExpandedRow next = it.next();
            if (next.getPairs().size() != list.size()) {
                Iterator<ExpandedPair> it2 = next.getPairs().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    }
                    ExpandedPair next2 = it2.next();
                    Iterator<ExpandedPair> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (next2.equals(it3.next())) {
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void reverseCounters(int[] iArr) {
        int length = iArr.length;
        for (int i8 = 0; i8 < length / 2; i8++) {
            int i9 = iArr[i8];
            int i10 = (length - i8) - 1;
            iArr[i8] = iArr[i10];
            iArr[i10] = i9;
        }
    }

    private void storeRow(int i8, boolean z7) {
        int i9 = 0;
        boolean z8 = false;
        while (true) {
            if (i9 >= this.rows.size()) {
                break;
            }
            ExpandedRow expandedRow = this.rows.get(i9);
            if (expandedRow.getRowNumber() <= i8) {
                z8 = expandedRow.isEquivalent(this.pairs);
                i9++;
            } else if (expandedRow.isEquivalent(this.pairs)) {
                return;
            }
        }
        if (z8 || isPartialRow(this.pairs, this.rows)) {
            return;
        }
        this.rows.add(i9, new ExpandedRow(this.pairs, i8, z7));
        removePartialRows(this.pairs, this.rows);
    }

    DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z7, boolean z8) {
        int[] dataCharacterCounters = getDataCharacterCounters();
        for (int i8 = 0; i8 < dataCharacterCounters.length; i8++) {
            dataCharacterCounters[i8] = 0;
        }
        if (z8) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1], dataCharacterCounters);
            int i9 = 0;
            for (int length = dataCharacterCounters.length - 1; i9 < length; length--) {
                int i10 = dataCharacterCounters[i9];
                dataCharacterCounters[i9] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i10;
                i9++;
            }
        }
        float sum = MathUtils.sum(dataCharacterCounters) / 17.0f;
        float f8 = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / 15.0f;
        if (Math.abs(sum - f8) / f8 > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i11 = 0; i11 < dataCharacterCounters.length; i11++) {
            float f9 = (dataCharacterCounters[i11] * 1.0f) / sum;
            int i12 = (int) (0.5f + f9);
            if (i12 <= 0) {
                if (f9 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i12 = 1;
            } else if (i12 > 8) {
                if (f9 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i12 = 8;
            }
            int i13 = i11 / 2;
            if ((i11 & 1) == 0) {
                oddCounts[i13] = i12;
                oddRoundingErrors[i13] = f9 - i12;
            } else {
                evenCounts[i13] = i12;
                evenRoundingErrors[i13] = f9 - i12;
            }
        }
        adjustOddEvenCounts(17);
        int value = (((finderPattern.getValue() * 4) + (z7 ? 0 : 2)) + (!z8 ? 1 : 0)) - 1;
        int i14 = 0;
        int i15 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            if (isNotA1left(finderPattern, z7, z8)) {
                i14 += oddCounts[length2] * WEIGHTS[value][length2 * 2];
            }
            i15 += oddCounts[length2];
        }
        int i16 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            if (isNotA1left(finderPattern, z7, z8)) {
                i16 += evenCounts[length3] * WEIGHTS[value][(length3 * 2) + 1];
            }
        }
        int i17 = i14 + i16;
        if ((i15 & 1) != 0 || i15 > 13 || i15 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i18 = (13 - i15) / 2;
        int i19 = SYMBOL_WIDEST[i18];
        return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i19, true) * EVEN_TOTAL_SUBSET[i18]) + RSSUtils.getRSSvalue(evenCounts, 9 - i19, false) + GSUM[i18], i17);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i8, BitArray bitArray, Map<DecodeHintType, ?> map) {
        this.pairs.clear();
        this.startFromEven = false;
        try {
            return constructResult(decodeRow2pairs(i8, bitArray));
        } catch (NotFoundException unused) {
            this.pairs.clear();
            this.startFromEven = true;
            return constructResult(decodeRow2pairs(i8, bitArray));
        }
    }

    List<ExpandedPair> decodeRow2pairs(int i8, BitArray bitArray) {
        boolean z7 = false;
        while (!z7) {
            try {
                List<ExpandedPair> list = this.pairs;
                list.add(retrieveNextPair(bitArray, list, i8));
            } catch (NotFoundException e8) {
                if (this.pairs.isEmpty()) {
                    throw e8;
                }
                z7 = true;
            }
        }
        if (checkChecksum()) {
            return this.pairs;
        }
        boolean z8 = !this.rows.isEmpty();
        storeRow(i8, false);
        if (z8) {
            List<ExpandedPair> checkRows = checkRows(false);
            if (checkRows != null) {
                return checkRows;
            }
            List<ExpandedPair> checkRows2 = checkRows(true);
            if (checkRows2 != null) {
                return checkRows2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    List<ExpandedRow> getRows() {
        return this.rows;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.pairs.clear();
        this.rows.clear();
    }

    ExpandedPair retrieveNextPair(BitArray bitArray, List<ExpandedPair> list, int i8) {
        FinderPattern parseFoundFinderPattern;
        DataCharacter dataCharacter;
        boolean z7 = list.size() % 2 == 0;
        if (this.startFromEven) {
            z7 = !z7;
        }
        int i9 = -1;
        boolean z8 = true;
        do {
            findNextPair(bitArray, list, i9);
            parseFoundFinderPattern = parseFoundFinderPattern(bitArray, i8, z7);
            if (parseFoundFinderPattern == null) {
                i9 = getNextSecondBar(bitArray, this.startEnd[0]);
            } else {
                z8 = false;
            }
        } while (z8);
        DataCharacter decodeDataCharacter = decodeDataCharacter(bitArray, parseFoundFinderPattern, z7, true);
        if (!list.isEmpty() && list.get(list.size() - 1).mustBeLast()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            dataCharacter = decodeDataCharacter(bitArray, parseFoundFinderPattern, z7, false);
        } catch (NotFoundException unused) {
            dataCharacter = null;
        }
        return new ExpandedPair(decodeDataCharacter, dataCharacter, parseFoundFinderPattern, true);
    }

    private List<ExpandedPair> checkRows(List<ExpandedRow> list, int i8) {
        while (i8 < this.rows.size()) {
            ExpandedRow expandedRow = this.rows.get(i8);
            this.pairs.clear();
            Iterator<ExpandedRow> it = list.iterator();
            while (it.hasNext()) {
                this.pairs.addAll(it.next().getPairs());
            }
            this.pairs.addAll(expandedRow.getPairs());
            if (isValidSequence(this.pairs)) {
                if (checkChecksum()) {
                    return this.pairs;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(expandedRow);
                try {
                    return checkRows(arrayList, i8 + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i8++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
