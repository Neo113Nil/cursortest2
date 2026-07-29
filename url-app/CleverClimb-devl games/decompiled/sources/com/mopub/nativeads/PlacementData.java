package com.mopub.nativeads;

import com.mopub.common.logging.MoPubLog;
import com.mopub.nativeads.MoPubNativeAdPositioning;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class PlacementData {
    private static final int MAX_ADS = 200;
    public static final int NOT_FOUND = -1;
    private int mDesiredCount;
    private final int[] mDesiredOriginalPositions = new int[200];
    private final int[] mDesiredInsertionPositions = new int[200];
    private final int[] mOriginalAdPositions = new int[200];
    private final int[] mAdjustedAdPositions = new int[200];
    private final NativeAd[] mNativeAds = new NativeAd[200];
    private int mPlacedCount = 0;

    private PlacementData(int[] iArr) {
        this.mDesiredCount = 0;
        this.mDesiredCount = Math.min(iArr.length, 200);
        System.arraycopy(iArr, 0, this.mDesiredInsertionPositions, 0, this.mDesiredCount);
        System.arraycopy(iArr, 0, this.mDesiredOriginalPositions, 0, this.mDesiredCount);
    }

    static PlacementData fromAdPositioning(MoPubNativeAdPositioning.MoPubClientPositioning moPubClientPositioning) {
        List<Integer> fixedPositions = moPubClientPositioning.getFixedPositions();
        int repeatingInterval = moPubClientPositioning.getRepeatingInterval();
        int size = repeatingInterval == Integer.MAX_VALUE ? fixedPositions.size() : 200;
        int[] iArr = new int[size];
        Iterator<Integer> it = fixedPositions.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2 = it.next().intValue() - i;
            iArr[i] = i2;
            i++;
        }
        while (i < size) {
            i2 = (i2 + repeatingInterval) - 1;
            iArr[i] = i2;
            i++;
        }
        return new PlacementData(iArr);
    }

    static PlacementData empty() {
        return new PlacementData(new int[0]);
    }

    boolean shouldPlaceAd(int i) {
        return binarySearch(this.mDesiredInsertionPositions, 0, this.mDesiredCount, i) >= 0;
    }

    int nextInsertionPosition(int i) {
        int binarySearchGreaterThan = binarySearchGreaterThan(this.mDesiredInsertionPositions, this.mDesiredCount, i);
        if (binarySearchGreaterThan == this.mDesiredCount) {
            return -1;
        }
        return this.mDesiredInsertionPositions[binarySearchGreaterThan];
    }

    int previousInsertionPosition(int i) {
        int binarySearchFirstEquals = binarySearchFirstEquals(this.mDesiredInsertionPositions, this.mDesiredCount, i);
        if (binarySearchFirstEquals == 0) {
            return -1;
        }
        return this.mDesiredInsertionPositions[binarySearchFirstEquals - 1];
    }

    void placeAd(int i, NativeAd nativeAd) {
        int binarySearchFirstEquals = binarySearchFirstEquals(this.mDesiredInsertionPositions, this.mDesiredCount, i);
        if (binarySearchFirstEquals == this.mDesiredCount || this.mDesiredInsertionPositions[binarySearchFirstEquals] != i) {
            MoPubLog.w("Attempted to insert an ad at an invalid position");
            return;
        }
        int i2 = this.mDesiredOriginalPositions[binarySearchFirstEquals];
        int binarySearchGreaterThan = binarySearchGreaterThan(this.mOriginalAdPositions, this.mPlacedCount, i2);
        if (binarySearchGreaterThan < this.mPlacedCount) {
            int i3 = this.mPlacedCount - binarySearchGreaterThan;
            int i4 = binarySearchGreaterThan + 1;
            System.arraycopy(this.mOriginalAdPositions, binarySearchGreaterThan, this.mOriginalAdPositions, i4, i3);
            System.arraycopy(this.mAdjustedAdPositions, binarySearchGreaterThan, this.mAdjustedAdPositions, i4, i3);
            System.arraycopy(this.mNativeAds, binarySearchGreaterThan, this.mNativeAds, i4, i3);
        }
        this.mOriginalAdPositions[binarySearchGreaterThan] = i2;
        this.mAdjustedAdPositions[binarySearchGreaterThan] = i;
        this.mNativeAds[binarySearchGreaterThan] = nativeAd;
        this.mPlacedCount++;
        int i5 = (this.mDesiredCount - binarySearchFirstEquals) - 1;
        int i6 = binarySearchFirstEquals + 1;
        System.arraycopy(this.mDesiredInsertionPositions, i6, this.mDesiredInsertionPositions, binarySearchFirstEquals, i5);
        System.arraycopy(this.mDesiredOriginalPositions, i6, this.mDesiredOriginalPositions, binarySearchFirstEquals, i5);
        this.mDesiredCount--;
        while (binarySearchFirstEquals < this.mDesiredCount) {
            int[] iArr = this.mDesiredInsertionPositions;
            iArr[binarySearchFirstEquals] = iArr[binarySearchFirstEquals] + 1;
            binarySearchFirstEquals++;
        }
        while (true) {
            binarySearchGreaterThan++;
            if (binarySearchGreaterThan >= this.mPlacedCount) {
                return;
            }
            int[] iArr2 = this.mAdjustedAdPositions;
            iArr2[binarySearchGreaterThan] = iArr2[binarySearchGreaterThan] + 1;
        }
    }

    boolean isPlacedAd(int i) {
        return binarySearch(this.mAdjustedAdPositions, 0, this.mPlacedCount, i) >= 0;
    }

    NativeAd getPlacedAd(int i) {
        int binarySearch = binarySearch(this.mAdjustedAdPositions, 0, this.mPlacedCount, i);
        if (binarySearch < 0) {
            return null;
        }
        return this.mNativeAds[binarySearch];
    }

    int[] getPlacedAdPositions() {
        int[] iArr = new int[this.mPlacedCount];
        System.arraycopy(this.mAdjustedAdPositions, 0, iArr, 0, this.mPlacedCount);
        return iArr;
    }

    int getOriginalPosition(int i) {
        int binarySearch = binarySearch(this.mAdjustedAdPositions, 0, this.mPlacedCount, i);
        if (binarySearch < 0) {
            return i - (binarySearch ^ (-1));
        }
        return -1;
    }

    int getAdjustedPosition(int i) {
        return i + binarySearchGreaterThan(this.mOriginalAdPositions, this.mPlacedCount, i);
    }

    int getOriginalCount(int i) {
        if (i == 0) {
            return 0;
        }
        int originalPosition = getOriginalPosition(i - 1);
        if (originalPosition == -1) {
            return -1;
        }
        return originalPosition + 1;
    }

    int getAdjustedCount(int i) {
        if (i == 0) {
            return 0;
        }
        return getAdjustedPosition(i - 1) + 1;
    }

    int clearAdsInRange(int i, int i2) {
        int[] iArr = new int[this.mPlacedCount];
        int[] iArr2 = new int[this.mPlacedCount];
        int i3 = 0;
        for (int i4 = 0; i4 < this.mPlacedCount; i4++) {
            int i5 = this.mOriginalAdPositions[i4];
            int i6 = this.mAdjustedAdPositions[i4];
            if (i <= i6 && i6 < i2) {
                iArr[i3] = i5;
                iArr2[i3] = i6 - i3;
                this.mNativeAds[i4].destroy();
                this.mNativeAds[i4] = null;
                i3++;
            } else if (i3 > 0) {
                int i7 = i4 - i3;
                this.mOriginalAdPositions[i7] = i5;
                this.mAdjustedAdPositions[i7] = i6 - i3;
                this.mNativeAds[i7] = this.mNativeAds[i4];
            }
        }
        if (i3 == 0) {
            return 0;
        }
        int binarySearchFirstEquals = binarySearchFirstEquals(this.mDesiredInsertionPositions, this.mDesiredCount, iArr2[0]);
        for (int i8 = this.mDesiredCount - 1; i8 >= binarySearchFirstEquals; i8--) {
            int i9 = i8 + i3;
            this.mDesiredOriginalPositions[i9] = this.mDesiredOriginalPositions[i8];
            this.mDesiredInsertionPositions[i9] = this.mDesiredInsertionPositions[i8] - i3;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = binarySearchFirstEquals + i10;
            this.mDesiredOriginalPositions[i11] = iArr[i10];
            this.mDesiredInsertionPositions[i11] = iArr2[i10];
        }
        this.mDesiredCount += i3;
        this.mPlacedCount -= i3;
        return i3;
    }

    void clearAds() {
        if (this.mPlacedCount == 0) {
            return;
        }
        clearAdsInRange(0, this.mAdjustedAdPositions[this.mPlacedCount - 1] + 1);
    }

    void insertItem(int i) {
        for (int binarySearchFirstEquals = binarySearchFirstEquals(this.mDesiredOriginalPositions, this.mDesiredCount, i); binarySearchFirstEquals < this.mDesiredCount; binarySearchFirstEquals++) {
            int[] iArr = this.mDesiredOriginalPositions;
            iArr[binarySearchFirstEquals] = iArr[binarySearchFirstEquals] + 1;
            int[] iArr2 = this.mDesiredInsertionPositions;
            iArr2[binarySearchFirstEquals] = iArr2[binarySearchFirstEquals] + 1;
        }
        for (int binarySearchFirstEquals2 = binarySearchFirstEquals(this.mOriginalAdPositions, this.mPlacedCount, i); binarySearchFirstEquals2 < this.mPlacedCount; binarySearchFirstEquals2++) {
            int[] iArr3 = this.mOriginalAdPositions;
            iArr3[binarySearchFirstEquals2] = iArr3[binarySearchFirstEquals2] + 1;
            int[] iArr4 = this.mAdjustedAdPositions;
            iArr4[binarySearchFirstEquals2] = iArr4[binarySearchFirstEquals2] + 1;
        }
    }

    void removeItem(int i) {
        for (int binarySearchGreaterThan = binarySearchGreaterThan(this.mDesiredOriginalPositions, this.mDesiredCount, i); binarySearchGreaterThan < this.mDesiredCount; binarySearchGreaterThan++) {
            this.mDesiredOriginalPositions[binarySearchGreaterThan] = r1[binarySearchGreaterThan] - 1;
            this.mDesiredInsertionPositions[binarySearchGreaterThan] = r1[binarySearchGreaterThan] - 1;
        }
        for (int binarySearchGreaterThan2 = binarySearchGreaterThan(this.mOriginalAdPositions, this.mPlacedCount, i); binarySearchGreaterThan2 < this.mPlacedCount; binarySearchGreaterThan2++) {
            this.mOriginalAdPositions[binarySearchGreaterThan2] = r0[binarySearchGreaterThan2] - 1;
            this.mAdjustedAdPositions[binarySearchGreaterThan2] = r0[binarySearchGreaterThan2] - 1;
        }
    }

    void moveItem(int i, int i2) {
        removeItem(i);
        insertItem(i2);
    }

    private static int binarySearchFirstEquals(int[] iArr, int i, int i2) {
        int binarySearch = binarySearch(iArr, 0, i, i2);
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        int i3 = iArr[binarySearch];
        while (binarySearch >= 0 && iArr[binarySearch] == i3) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    private static int binarySearchGreaterThan(int[] iArr, int i, int i2) {
        int binarySearch = binarySearch(iArr, 0, i, i2);
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        int i3 = iArr[binarySearch];
        while (binarySearch < i && iArr[binarySearch] == i3) {
            binarySearch++;
        }
        return binarySearch;
    }

    private static int binarySearch(int[] iArr, int i, int i2, int i3) {
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i3) {
                i = i5 + 1;
            } else {
                if (i6 <= i3) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return i ^ (-1);
    }
}
