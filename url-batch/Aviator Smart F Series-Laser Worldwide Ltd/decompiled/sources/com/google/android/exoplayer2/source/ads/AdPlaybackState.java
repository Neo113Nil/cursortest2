package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.pqc.math.linearalgebra.k;

@Deprecated
/* loaded from: classes3.dex */
public final class AdPlaybackState implements Bundleable {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public final int adGroupCount;
    private final AdGroup[] adGroups;
    public final long adResumePositionUs;

    @Nullable
    public final Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final AdPlaybackState NONE = new AdPlaybackState(null, new AdGroup[0], 0, C.TIME_UNSET, 0);
    private static final AdGroup REMOVED_AD_GROUP = new AdGroup(0).withAdCount(0);
    private static final String FIELD_AD_GROUPS = Util.intToStringMaxRadix(1);
    private static final String FIELD_AD_RESUME_POSITION_US = Util.intToStringMaxRadix(2);
    private static final String FIELD_CONTENT_DURATION_US = Util.intToStringMaxRadix(3);
    private static final String FIELD_REMOVED_AD_GROUP_COUNT = Util.intToStringMaxRadix(4);
    public static final Bundleable.Creator<AdPlaybackState> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.ads.a
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            AdPlaybackState fromBundle;
            fromBundle = AdPlaybackState.fromBundle(bundle);
            return fromBundle;
        }
    };

    public static final class AdGroup implements Bundleable {
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final boolean isServerSideInserted;
        public final int originalCount;
        public final int[] states;
        public final long timeUs;
        public final Uri[] uris;
        private static final String FIELD_TIME_US = Util.intToStringMaxRadix(0);
        private static final String FIELD_COUNT = Util.intToStringMaxRadix(1);
        private static final String FIELD_URIS = Util.intToStringMaxRadix(2);
        private static final String FIELD_STATES = Util.intToStringMaxRadix(3);
        private static final String FIELD_DURATIONS_US = Util.intToStringMaxRadix(4);
        private static final String FIELD_CONTENT_RESUME_OFFSET_US = Util.intToStringMaxRadix(5);
        private static final String FIELD_IS_SERVER_SIDE_INSERTED = Util.intToStringMaxRadix(6);
        private static final String FIELD_ORIGINAL_COUNT = Util.intToStringMaxRadix(7);
        public static final Bundleable.Creator<AdGroup> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.ads.b
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                AdPlaybackState.AdGroup fromBundle;
                fromBundle = AdPlaybackState.AdGroup.fromBundle(bundle);
                return fromBundle;
            }
        };

        @CheckResult
        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i8) {
            int length = jArr.length;
            int max = Math.max(i8, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, C.TIME_UNSET);
            return copyOf;
        }

        @CheckResult
        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i8) {
            int length = iArr.length;
            int max = Math.max(i8, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static AdGroup fromBundle(Bundle bundle) {
            long j8 = bundle.getLong(FIELD_TIME_US);
            int i8 = bundle.getInt(FIELD_COUNT);
            int i9 = bundle.getInt(FIELD_ORIGINAL_COUNT);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_URIS);
            int[] intArray = bundle.getIntArray(FIELD_STATES);
            long[] longArray = bundle.getLongArray(FIELD_DURATIONS_US);
            long j9 = bundle.getLong(FIELD_CONTENT_RESUME_OFFSET_US);
            boolean z7 = bundle.getBoolean(FIELD_IS_SERVER_SIDE_INSERTED);
            if (intArray == null) {
                intArray = new int[0];
            }
            return new AdGroup(j8, i8, i9, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j9, z7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isLivePostrollPlaceholder() {
            return this.isServerSideInserted && this.timeUs == Long.MIN_VALUE && this.count == -1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AdGroup.class != obj.getClass()) {
                return false;
            }
            AdGroup adGroup = (AdGroup) obj;
            return this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && Arrays.equals(this.uris, adGroup.uris) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getNextAdIndexToPlay(@IntRange(from = -1) int i8) {
            int i9;
            int i10 = i8 + 1;
            while (true) {
                int[] iArr = this.states;
                if (i10 >= iArr.length || this.isServerSideInserted || (i9 = iArr[i10]) == 0 || i9 == 1) {
                    break;
                }
                i10++;
            }
            return i10;
        }

        public boolean hasUnplayedAds() {
            if (this.count == -1) {
                return true;
            }
            for (int i8 = 0; i8 < this.count; i8++) {
                int i9 = this.states[i8];
                if (i9 == 0 || i9 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i8 = ((this.count * 31) + this.originalCount) * 31;
            long j8 = this.timeUs;
            int hashCode = (((((((i8 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + Arrays.hashCode(this.uris)) * 31) + Arrays.hashCode(this.states)) * 31) + Arrays.hashCode(this.durationsUs)) * 31;
            long j9 = this.contentResumeOffsetUs;
            return ((hashCode + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.isServerSideInserted ? 1 : 0);
        }

        public boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(FIELD_TIME_US, this.timeUs);
            bundle.putInt(FIELD_COUNT, this.count);
            bundle.putInt(FIELD_ORIGINAL_COUNT, this.originalCount);
            bundle.putParcelableArrayList(FIELD_URIS, new ArrayList<>(Arrays.asList(this.uris)));
            bundle.putIntArray(FIELD_STATES, this.states);
            bundle.putLongArray(FIELD_DURATIONS_US, this.durationsUs);
            bundle.putLong(FIELD_CONTENT_RESUME_OFFSET_US, this.contentResumeOffsetUs);
            bundle.putBoolean(FIELD_IS_SERVER_SIDE_INSERTED, this.isServerSideInserted);
            return bundle;
        }

        @CheckResult
        public AdGroup withAdCount(int i8) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i8);
            long[] copyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.durationsUs, i8);
            return new AdGroup(this.timeUs, i8, this.originalCount, copyStatesWithSpaceForAdCount, (Uri[]) Arrays.copyOf(this.uris, i8), copyDurationsUsWithSpaceForAdCount, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.uris;
            if (length < uriArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, uriArr.length);
            } else if (this.count != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.uris, jArr, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withAdState(int i8, @IntRange(from = 0) int i9) {
            int i10 = this.count;
            Assertions.checkArgument(i10 == -1 || i9 < i10);
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i9 + 1);
            int i11 = copyStatesWithSpaceForAdCount[i9];
            Assertions.checkArgument(i11 == 0 || i11 == 1 || i11 == i8);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            Uri[] uriArr = this.uris;
            if (uriArr.length != copyStatesWithSpaceForAdCount.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, copyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr2 = uriArr;
            copyStatesWithSpaceForAdCount[i9] = i8;
            return new AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, uriArr2, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withAdUri(Uri uri, @IntRange(from = 0) int i8) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i8 + 1);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.uris, copyStatesWithSpaceForAdCount.length);
            uriArr[i8] = uri;
            copyStatesWithSpaceForAdCount[i8] = 1;
            return new AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, uriArr, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withAllAdsReset() {
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = copyOf[i8];
                if (i9 == 3 || i9 == 2 || i9 == 4) {
                    copyOf[i8] = this.uris[i8] == null ? 0 : 1;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(this.timeUs, 0, this.originalCount, new int[0], new Uri[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i8 = 0; i8 < length; i8++) {
                int i9 = copyOf[i8];
                if (i9 == 1 || i9 == 0) {
                    copyOf[i8] = 2;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withContentResumeOffsetUs(long j8) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.uris, this.durationsUs, j8, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withIsServerSideInserted(boolean z7) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, z7);
        }

        public AdGroup withLastAdRemoved() {
            int[] iArr = this.states;
            int length = iArr.length - 1;
            int[] copyOf = Arrays.copyOf(iArr, length);
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.uris, length);
            long[] jArr = this.durationsUs;
            if (jArr.length > length) {
                jArr = Arrays.copyOf(jArr, length);
            }
            long[] jArr2 = jArr;
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, uriArr, jArr2, Util.sum(jArr2), this.isServerSideInserted);
        }

        public AdGroup withOriginalAdCount(int i8) {
            return new AdGroup(this.timeUs, this.count, i8, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withTimeUs(long j8) {
            return new AdGroup(j8, this.count, this.originalCount, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public AdGroup(long j8) {
            this(j8, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private AdGroup(long j8, int i8, int i9, int[] iArr, Uri[] uriArr, long[] jArr, long j9, boolean z7) {
            Assertions.checkArgument(iArr.length == uriArr.length);
            this.timeUs = j8;
            this.count = i8;
            this.originalCount = i9;
            this.states = iArr;
            this.uris = uriArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j9;
            this.isServerSideInserted = z7;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public AdPlaybackState(Object obj, long... jArr) {
        this(obj, createEmptyAdGroups(jArr), 0L, C.TIME_UNSET, 0);
    }

    private static AdGroup[] createEmptyAdGroups(long[] jArr) {
        int length = jArr.length;
        AdGroup[] adGroupArr = new AdGroup[length];
        for (int i8 = 0; i8 < length; i8++) {
            adGroupArr[i8] = new AdGroup(jArr[i8]);
        }
        return adGroupArr;
    }

    public static AdPlaybackState fromAdPlaybackState(Object obj, AdPlaybackState adPlaybackState) {
        int i8 = adPlaybackState.adGroupCount - adPlaybackState.removedAdGroupCount;
        AdGroup[] adGroupArr = new AdGroup[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            AdGroup adGroup = adPlaybackState.adGroups[i9];
            long j8 = adGroup.timeUs;
            int i10 = adGroup.count;
            int i11 = adGroup.originalCount;
            int[] iArr = adGroup.states;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            Uri[] uriArr = adGroup.uris;
            Uri[] uriArr2 = (Uri[]) Arrays.copyOf(uriArr, uriArr.length);
            long[] jArr = adGroup.durationsUs;
            adGroupArr[i9] = new AdGroup(j8, i10, i11, copyOf, uriArr2, Arrays.copyOf(jArr, jArr.length), adGroup.contentResumeOffsetUs, adGroup.isServerSideInserted);
        }
        return new AdPlaybackState(obj, adGroupArr, adPlaybackState.adResumePositionUs, adPlaybackState.contentDurationUs, adPlaybackState.removedAdGroupCount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AdPlaybackState fromBundle(Bundle bundle) {
        AdGroup[] adGroupArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_AD_GROUPS);
        if (parcelableArrayList == null) {
            adGroupArr = new AdGroup[0];
        } else {
            AdGroup[] adGroupArr2 = new AdGroup[parcelableArrayList.size()];
            for (int i8 = 0; i8 < parcelableArrayList.size(); i8++) {
                adGroupArr2[i8] = AdGroup.CREATOR.fromBundle((Bundle) parcelableArrayList.get(i8));
            }
            adGroupArr = adGroupArr2;
        }
        String str = FIELD_AD_RESUME_POSITION_US;
        AdPlaybackState adPlaybackState = NONE;
        return new AdPlaybackState(null, adGroupArr, bundle.getLong(str, adPlaybackState.adResumePositionUs), bundle.getLong(FIELD_CONTENT_DURATION_US, adPlaybackState.contentDurationUs), bundle.getInt(FIELD_REMOVED_AD_GROUP_COUNT, adPlaybackState.removedAdGroupCount));
    }

    private boolean isPositionBeforeAdGroup(long j8, long j9, int i8) {
        if (j8 == Long.MIN_VALUE) {
            return false;
        }
        AdGroup adGroup = getAdGroup(i8);
        long j10 = adGroup.timeUs;
        return j10 == Long.MIN_VALUE ? j9 == C.TIME_UNSET || (adGroup.isServerSideInserted && adGroup.count == -1) || j8 < j9 : j8 < j10;
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i8 = this.adGroupCount - 1;
        return i8 >= 0 && isLivePostrollPlaceholder(i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return Util.areEqual(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && Arrays.equals(this.adGroups, adPlaybackState.adGroups);
    }

    public AdGroup getAdGroup(@IntRange(from = 0) int i8) {
        int i9 = this.removedAdGroupCount;
        return i8 < i9 ? REMOVED_AD_GROUP : this.adGroups[i8 - i9];
    }

    public int getAdGroupIndexAfterPositionUs(long j8, long j9) {
        if (j8 == Long.MIN_VALUE) {
            return -1;
        }
        if (j9 != C.TIME_UNSET && j8 >= j9) {
            return -1;
        }
        int i8 = this.removedAdGroupCount;
        while (i8 < this.adGroupCount && ((getAdGroup(i8).timeUs != Long.MIN_VALUE && getAdGroup(i8).timeUs <= j8) || !getAdGroup(i8).shouldPlayAdGroup())) {
            i8++;
        }
        if (i8 < this.adGroupCount) {
            return i8;
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j8, long j9) {
        int i8 = this.adGroupCount - 1;
        int i9 = i8 - (isLivePostrollPlaceholder(i8) ? 1 : 0);
        while (i9 >= 0 && isPositionBeforeAdGroup(j8, j9, i9)) {
            i9--;
        }
        if (i9 < 0 || !getAdGroup(i9).hasUnplayedAds()) {
            return -1;
        }
        return i9;
    }

    public int hashCode() {
        int i8 = this.adGroupCount * 31;
        Object obj = this.adsId;
        return ((((((((i8 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31) + Arrays.hashCode(this.adGroups);
    }

    public boolean isAdInErrorState(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        AdGroup adGroup;
        int i10;
        return i8 < this.adGroupCount && (i10 = (adGroup = getAdGroup(i8)).count) != -1 && i9 < i10 && adGroup.states[i9] == 4;
    }

    public boolean isLivePostrollPlaceholder(int i8) {
        return i8 == this.adGroupCount - 1 && getAdGroup(i8).isLivePostrollPlaceholder();
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (AdGroup adGroup : this.adGroups) {
            arrayList.add(adGroup.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(FIELD_AD_GROUPS, arrayList);
        }
        long j8 = this.adResumePositionUs;
        AdPlaybackState adPlaybackState = NONE;
        if (j8 != adPlaybackState.adResumePositionUs) {
            bundle.putLong(FIELD_AD_RESUME_POSITION_US, j8);
        }
        long j9 = this.contentDurationUs;
        if (j9 != adPlaybackState.contentDurationUs) {
            bundle.putLong(FIELD_CONTENT_DURATION_US, j9);
        }
        int i8 = this.removedAdGroupCount;
        if (i8 != adPlaybackState.removedAdGroupCount) {
            bundle.putInt(FIELD_REMOVED_AD_GROUP_COUNT, i8);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.adsId);
        sb.append(", adResumePositionUs=");
        sb.append(this.adResumePositionUs);
        sb.append(", adGroups=[");
        for (int i8 = 0; i8 < this.adGroups.length; i8++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.adGroups[i8].timeUs);
            sb.append(", ads=[");
            for (int i9 = 0; i9 < this.adGroups[i8].states.length; i9++) {
                sb.append("ad(state=");
                int i10 = this.adGroups[i8].states[i9];
                if (i10 == 0) {
                    sb.append('_');
                } else if (i10 == 1) {
                    sb.append(k.MATRIX_TYPE_RANDOM_REGULAR);
                } else if (i10 == 2) {
                    sb.append('S');
                } else if (i10 == 3) {
                    sb.append('P');
                } else if (i10 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(this.adGroups[i8].durationsUs[i9]);
                sb.append(')');
                if (i9 < this.adGroups[i8].states.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i8 < this.adGroups.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    @CheckResult
    public AdPlaybackState withAdCount(@IntRange(from = 0) int i8, @IntRange(from = 1) int i9) {
        Assertions.checkArgument(i9 > 0);
        int i10 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i10].count == i9) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = this.adGroups[i10].withAdCount(i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdDurationsUs(long[][] jArr) {
        Assertions.checkState(this.removedAdGroupCount == 0);
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        for (int i8 = 0; i8 < this.adGroupCount; i8++) {
            adGroupArr2[i8] = adGroupArr2[i8].withAdDurationsUs(jArr[i8]);
        }
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdGroupTimeUs(@IntRange(from = 0) int i8, long j8) {
        int i9 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = this.adGroups[i9].withTimeUs(j8);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdLoadError(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        int i10 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(4, i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdResumePositionUs(long j8) {
        return this.adResumePositionUs == j8 ? this : new AdPlaybackState(this.adsId, this.adGroups, j8, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAvailableAd(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        return withAvailableAdUri(i8, i9, Uri.EMPTY);
    }

    @CheckResult
    public AdPlaybackState withAvailableAdUri(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9, Uri uri) {
        int i10 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        Assertions.checkState(!Uri.EMPTY.equals(uri) || adGroupArr2[i10].isServerSideInserted);
        adGroupArr2[i10] = adGroupArr2[i10].withAdUri(uri, i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withContentDurationUs(long j8) {
        return this.contentDurationUs == j8 ? this : new AdPlaybackState(this.adsId, this.adGroups, this.adResumePositionUs, j8, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withContentResumeOffsetUs(@IntRange(from = 0) int i8, long j8) {
        int i9 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i9].contentResumeOffsetUs == j8) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withContentResumeOffsetUs(j8);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withIsServerSideInserted(@IntRange(from = 0) int i8, boolean z7) {
        int i9 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i9].isServerSideInserted == z7) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withIsServerSideInserted(z7);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withLastAdRemoved(@IntRange(from = 0) int i8) {
        int i9 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withLastAdRemoved();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withLivePostrollPlaceholderAppended() {
        return withNewAdGroup(this.adGroupCount, Long.MIN_VALUE).withIsServerSideInserted(this.adGroupCount, true);
    }

    @CheckResult
    public AdPlaybackState withNewAdGroup(@IntRange(from = 0) int i8, long j8) {
        int i9 = i8 - this.removedAdGroupCount;
        AdGroup adGroup = new AdGroup(j8);
        AdGroup[] adGroupArr = (AdGroup[]) Util.nullSafeArrayAppend(this.adGroups, adGroup);
        System.arraycopy(adGroupArr, i9, adGroupArr, i9 + 1, this.adGroups.length - i9);
        adGroupArr[i9] = adGroup;
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withOriginalAdCount(@IntRange(from = 0) int i8, int i9) {
        int i10 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i10].originalCount == i9) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withOriginalAdCount(i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withPlayedAd(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        int i10 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(3, i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withRemovedAdGroupCount(@IntRange(from = 0) int i8) {
        int i9 = this.removedAdGroupCount;
        if (i9 == i8) {
            return this;
        }
        Assertions.checkArgument(i8 > i9);
        int i10 = this.adGroupCount - i8;
        AdGroup[] adGroupArr = new AdGroup[i10];
        System.arraycopy(this.adGroups, i8 - this.removedAdGroupCount, adGroupArr, 0, i10);
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i8);
    }

    @CheckResult
    public AdPlaybackState withResetAdGroup(@IntRange(from = 0) int i8) {
        int i9 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAllAdsReset();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withSkippedAd(@IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        int i10 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i10] = adGroupArr2[i10].withAdState(2, i9);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withSkippedAdGroup(@IntRange(from = 0) int i8) {
        int i9 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAllAdsSkipped();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    private AdPlaybackState(@Nullable Object obj, AdGroup[] adGroupArr, long j8, long j9, int i8) {
        this.adsId = obj;
        this.adResumePositionUs = j8;
        this.contentDurationUs = j9;
        this.adGroupCount = adGroupArr.length + i8;
        this.adGroups = adGroupArr;
        this.removedAdGroupCount = i8;
    }

    @CheckResult
    public AdPlaybackState withAdDurationsUs(@IntRange(from = 0) int i8, long... jArr) {
        int i9 = i8 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i9] = adGroupArr2[i9].withAdDurationsUs(jArr);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }
}
