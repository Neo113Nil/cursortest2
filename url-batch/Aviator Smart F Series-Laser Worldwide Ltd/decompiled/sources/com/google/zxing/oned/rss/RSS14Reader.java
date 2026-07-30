package com.google.zxing.oned.rss;

import com.crrepa.f.t;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class RSS14Reader extends AbstractRSSReader {
    private final List<Pair> possibleLeftPairs = new ArrayList();
    private final List<Pair> possibleRightPairs = new ArrayList();
    private static final int[] OUTSIDE_EVEN_TOTAL_SUBSET = {1, 10, 34, 70, 126};
    private static final int[] INSIDE_ODD_TOTAL_SUBSET = {4, 20, 48, 81};
    private static final int[] OUTSIDE_GSUM = {0, 161, 961, t.f12751a, 2715};
    private static final int[] INSIDE_GSUM = {0, 336, 1036, 1516};
    private static final int[] OUTSIDE_ODD_WIDEST = {8, 6, 4, 3, 1};
    private static final int[] INSIDE_ODD_WIDEST = {2, 4, 6, 8};
    private static final int[][] FINDER_PATTERNS = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    private static void addOrTally(Collection<Pair> collection, Pair pair) {
        if (pair == null) {
            return;
        }
        for (Pair pair2 : collection) {
            if (pair2.getValue() == pair.getValue()) {
                pair2.incrementCount();
                return;
            }
        }
        collection.add(pair);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0028, code lost:
    
        if (r1 < 4) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x002a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x002b, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x002d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0043, code lost:
    
        if (r1 < 4) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void adjustOddEvenCounts(boolean z7, int i8) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int sum = MathUtils.sum(getOddCounts());
        int sum2 = MathUtils.sum(getEvenCounts());
        boolean z12 = true;
        if (z7) {
            if (sum > 12) {
                z8 = false;
                z9 = true;
            } else {
                z8 = sum < 4;
                z9 = false;
            }
            if (sum2 <= 12) {
            }
            z10 = false;
            z11 = true;
        } else {
            if (sum > 11) {
                z8 = false;
                z9 = true;
            } else {
                z8 = sum < 5;
                z9 = false;
            }
            if (sum2 <= 10) {
            }
            z10 = false;
            z11 = true;
        }
        int i9 = (sum + sum2) - i8;
        boolean z13 = (sum & 1) == z7;
        boolean z14 = (sum2 & 1) == 1;
        if (i9 == 1) {
            if (z13) {
                if (z14) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z12 = z8;
                z9 = true;
            } else {
                if (!z14) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z12 = z8;
                z11 = true;
            }
        } else if (i9 == -1) {
            if (z13) {
                if (z14) {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else {
                if (!z14) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z12 = z8;
                z10 = true;
            }
        } else {
            if (i9 != 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (z13) {
                if (!z14) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sum >= sum2) {
                    z12 = z8;
                    z10 = true;
                    z9 = true;
                }
                z11 = true;
            } else {
                if (z14) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z12 = z8;
            }
        }
        if (z12) {
            if (z9) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
        }
        if (z9) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z10) {
            if (z11) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
        }
        if (z11) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }

    private static boolean checkChecksum(Pair pair, Pair pair2) {
        int checksumPortion = (pair.getChecksumPortion() + (pair2.getChecksumPortion() * 16)) % 79;
        int value = (pair.getFinderPattern().getValue() * 9) + pair2.getFinderPattern().getValue();
        if (value > 72) {
            value--;
        }
        if (value > 8) {
            value--;
        }
        return checksumPortion == value;
    }

    private static Result constructResult(Pair pair, Pair pair2) {
        String valueOf = String.valueOf((pair.getValue() * 4537077) + pair2.getValue());
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i8 = 0;
        for (int i9 = 0; i9 < 13; i9++) {
            int charAt = sb.charAt(i9) - '0';
            if ((i9 & 1) == 0) {
                charAt *= 3;
            }
            i8 += charAt;
        }
        int i10 = 10 - (i8 % 10);
        if (i10 == 10) {
            i10 = 0;
        }
        sb.append(i10);
        ResultPoint[] resultPoints = pair.getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = pair2.getFinderPattern().getResultPoints();
        return new Result(sb.toString(), null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_14);
    }

    private DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z7) {
        int[] dataCharacterCounters = getDataCharacterCounters();
        for (int i8 = 0; i8 < dataCharacterCounters.length; i8++) {
            dataCharacterCounters[i8] = 0;
        }
        if (z7) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1] + 1, dataCharacterCounters);
            int i9 = 0;
            for (int length = dataCharacterCounters.length - 1; i9 < length; length--) {
                int i10 = dataCharacterCounters[i9];
                dataCharacterCounters[i9] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i10;
                i9++;
            }
        }
        int i11 = z7 ? 16 : 15;
        float sum = MathUtils.sum(dataCharacterCounters) / i11;
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i12 = 0; i12 < dataCharacterCounters.length; i12++) {
            float f8 = dataCharacterCounters[i12] / sum;
            int i13 = (int) (0.5f + f8);
            if (i13 <= 0) {
                i13 = 1;
            } else if (i13 > 8) {
                i13 = 8;
            }
            int i14 = i12 / 2;
            if ((i12 & 1) == 0) {
                oddCounts[i14] = i13;
                oddRoundingErrors[i14] = f8 - i13;
            } else {
                evenCounts[i14] = i13;
                evenRoundingErrors[i14] = f8 - i13;
            }
        }
        adjustOddEvenCounts(z7, i11);
        int i15 = 0;
        int i16 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            int i17 = oddCounts[length2];
            i15 = (i15 * 9) + i17;
            i16 += i17;
        }
        int i18 = 0;
        int i19 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            int i20 = evenCounts[length3];
            i18 = (i18 * 9) + i20;
            i19 += i20;
        }
        int i21 = i15 + (i18 * 3);
        if (!z7) {
            if ((i19 & 1) != 0 || i19 > 10 || i19 < 4) {
                throw NotFoundException.getNotFoundInstance();
            }
            int i22 = (10 - i19) / 2;
            int i23 = INSIDE_ODD_WIDEST[i22];
            return new DataCharacter((RSSUtils.getRSSvalue(evenCounts, 9 - i23, false) * INSIDE_ODD_TOTAL_SUBSET[i22]) + RSSUtils.getRSSvalue(oddCounts, i23, true) + INSIDE_GSUM[i22], i21);
        }
        if ((i16 & 1) != 0 || i16 > 12 || i16 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i24 = (12 - i16) / 2;
        int i25 = OUTSIDE_ODD_WIDEST[i24];
        return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i25, false) * OUTSIDE_EVEN_TOTAL_SUBSET[i24]) + RSSUtils.getRSSvalue(evenCounts, 9 - i25, true) + OUTSIDE_GSUM[i24], i21);
    }

    private Pair decodePair(BitArray bitArray, boolean z7, int i8, Map<DecodeHintType, ?> map) {
        try {
            FinderPattern parseFoundFinderPattern = parseFoundFinderPattern(bitArray, i8, z7, findFinderPattern(bitArray, z7));
            ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (resultPointCallback != null) {
                float f8 = (r1[0] + r1[1]) / 2.0f;
                if (z7) {
                    f8 = (bitArray.getSize() - 1) - f8;
                }
                resultPointCallback.foundPossibleResultPoint(new ResultPoint(f8, i8));
            }
            DataCharacter decodeDataCharacter = decodeDataCharacter(bitArray, parseFoundFinderPattern, true);
            DataCharacter decodeDataCharacter2 = decodeDataCharacter(bitArray, parseFoundFinderPattern, false);
            return new Pair((decodeDataCharacter.getValue() * 1597) + decodeDataCharacter2.getValue(), decodeDataCharacter.getChecksumPortion() + (decodeDataCharacter2.getChecksumPortion() * 4), parseFoundFinderPattern);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private int[] findFinderPattern(BitArray bitArray, boolean z7) {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        int i8 = 0;
        boolean z8 = false;
        while (i8 < size) {
            z8 = !bitArray.get(i8);
            if (z7 == z8) {
                break;
            }
            i8++;
        }
        int i9 = i8;
        int i10 = 0;
        while (i8 < size) {
            if (bitArray.get(i8) != z8) {
                decodeFinderCounters[i10] = decodeFinderCounters[i10] + 1;
            } else {
                if (i10 != 3) {
                    i10++;
                } else {
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        return new int[]{i9, i8};
                    }
                    i9 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i10--;
                }
                decodeFinderCounters[i10] = 1;
                z8 = !z8;
            }
            i8++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i8, boolean z7, int[] iArr) {
        int i9;
        int i10;
        boolean z8 = bitArray.get(iArr[0]);
        int i11 = iArr[0] - 1;
        while (i11 >= 0 && z8 != bitArray.get(i11)) {
            i11--;
        }
        int i12 = i11 + 1;
        int i13 = iArr[0] - i12;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i13;
        int parseFinderValue = AbstractRSSReader.parseFinderValue(decodeFinderCounters, FINDER_PATTERNS);
        int i14 = iArr[1];
        if (z7) {
            int size = (bitArray.getSize() - 1) - i12;
            i9 = (bitArray.getSize() - 1) - i14;
            i10 = size;
        } else {
            i9 = i14;
            i10 = i12;
        }
        return new FinderPattern(parseFinderValue, new int[]{i12, iArr[1]}, i10, i9, i8);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i8, BitArray bitArray, Map<DecodeHintType, ?> map) {
        addOrTally(this.possibleLeftPairs, decodePair(bitArray, false, i8, map));
        bitArray.reverse();
        addOrTally(this.possibleRightPairs, decodePair(bitArray, true, i8, map));
        bitArray.reverse();
        for (Pair pair : this.possibleLeftPairs) {
            if (pair.getCount() > 1) {
                for (Pair pair2 : this.possibleRightPairs) {
                    if (pair2.getCount() > 1 && checkChecksum(pair, pair2)) {
                        return constructResult(pair, pair2);
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.possibleLeftPairs.clear();
        this.possibleRightPairs.clear();
    }
}
