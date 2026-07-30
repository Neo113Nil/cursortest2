package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes3.dex */
public abstract class Timeline implements Bundleable {
    public static final Timeline EMPTY = new Timeline() { // from class: com.google.android.exoplayer2.Timeline.1
        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int i8, Period period, boolean z7) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i8) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int i8, Window window, long j8) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 0;
        }
    };
    private static final String FIELD_WINDOWS = Util.intToStringMaxRadix(0);
    private static final String FIELD_PERIODS = Util.intToStringMaxRadix(1);
    private static final String FIELD_SHUFFLED_WINDOW_INDICES = Util.intToStringMaxRadix(2);
    public static final Bundleable.Creator<Timeline> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.g6
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            Timeline fromBundle;
            fromBundle = Timeline.fromBundle(bundle);
            return fromBundle;
        }
    };

    public static final class Period implements Bundleable {
        private AdPlaybackState adPlaybackState = AdPlaybackState.NONE;
        public long durationUs;

        @Nullable
        public Object id;
        public boolean isPlaceholder;
        public long positionInWindowUs;

        @Nullable
        public Object uid;
        public int windowIndex;
        private static final String FIELD_WINDOW_INDEX = Util.intToStringMaxRadix(0);
        private static final String FIELD_DURATION_US = Util.intToStringMaxRadix(1);
        private static final String FIELD_POSITION_IN_WINDOW_US = Util.intToStringMaxRadix(2);
        private static final String FIELD_PLACEHOLDER = Util.intToStringMaxRadix(3);
        private static final String FIELD_AD_PLAYBACK_STATE = Util.intToStringMaxRadix(4);
        public static final Bundleable.Creator<Period> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.h6
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                Timeline.Period fromBundle;
                fromBundle = Timeline.Period.fromBundle(bundle);
                return fromBundle;
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public static Period fromBundle(Bundle bundle) {
            int i8 = bundle.getInt(FIELD_WINDOW_INDEX, 0);
            long j8 = bundle.getLong(FIELD_DURATION_US, C.TIME_UNSET);
            long j9 = bundle.getLong(FIELD_POSITION_IN_WINDOW_US, 0L);
            boolean z7 = bundle.getBoolean(FIELD_PLACEHOLDER, false);
            Bundle bundle2 = bundle.getBundle(FIELD_AD_PLAYBACK_STATE);
            AdPlaybackState fromBundle = bundle2 != null ? AdPlaybackState.CREATOR.fromBundle(bundle2) : AdPlaybackState.NONE;
            Period period = new Period();
            period.set(null, null, i8, j8, j9, fromBundle, z7);
            return period;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            return Util.areEqual(this.id, period.id) && Util.areEqual(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && this.isPlaceholder == period.isPlaceholder && Util.areEqual(this.adPlaybackState, period.adPlaybackState);
        }

        public int getAdCountInAdGroup(int i8) {
            return this.adPlaybackState.getAdGroup(i8).count;
        }

        public long getAdDurationUs(int i8, int i9) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i8);
            return adGroup.count != -1 ? adGroup.durationsUs[i9] : C.TIME_UNSET;
        }

        public int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public int getAdGroupIndexAfterPositionUs(long j8) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j8, this.durationUs);
        }

        public int getAdGroupIndexForPositionUs(long j8) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j8, this.durationUs);
        }

        public long getAdGroupTimeUs(int i8) {
            return this.adPlaybackState.getAdGroup(i8).timeUs;
        }

        public long getAdResumePositionUs() {
            return this.adPlaybackState.adResumePositionUs;
        }

        public int getAdState(int i8, int i9) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.getAdGroup(i8);
            if (adGroup.count != -1) {
                return adGroup.states[i9];
            }
            return 0;
        }

        @Nullable
        public Object getAdsId() {
            return this.adPlaybackState.adsId;
        }

        public long getContentResumeOffsetUs(int i8) {
            return this.adPlaybackState.getAdGroup(i8).contentResumeOffsetUs;
        }

        public long getDurationMs() {
            return Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public int getFirstAdIndexToPlay(int i8) {
            return this.adPlaybackState.getAdGroup(i8).getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i8, int i9) {
            return this.adPlaybackState.getAdGroup(i8).getNextAdIndexToPlay(i9);
        }

        public long getPositionInWindowMs() {
            return Util.usToMs(this.positionInWindowUs);
        }

        public long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public int getRemovedAdGroupCount() {
            return this.adPlaybackState.removedAdGroupCount;
        }

        public boolean hasPlayedAdGroup(int i8) {
            return !this.adPlaybackState.getAdGroup(i8).hasUnplayedAds();
        }

        public int hashCode() {
            Object obj = this.id;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.uid;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.windowIndex) * 31;
            long j8 = this.durationUs;
            int i8 = (hashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j9 = this.positionInWindowUs;
            return ((((i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.adPlaybackState.hashCode();
        }

        public boolean isLivePostrollPlaceholder(int i8) {
            return i8 == getAdGroupCount() - 1 && this.adPlaybackState.isLivePostrollPlaceholder(i8);
        }

        public boolean isServerSideInsertedAdGroup(int i8) {
            return this.adPlaybackState.getAdGroup(i8).isServerSideInserted;
        }

        @CanIgnoreReturnValue
        public Period set(@Nullable Object obj, @Nullable Object obj2, int i8, long j8, long j9, AdPlaybackState adPlaybackState, boolean z7) {
            this.id = obj;
            this.uid = obj2;
            this.windowIndex = i8;
            this.durationUs = j8;
            this.positionInWindowUs = j9;
            this.adPlaybackState = adPlaybackState;
            this.isPlaceholder = z7;
            return this;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i8 = this.windowIndex;
            if (i8 != 0) {
                bundle.putInt(FIELD_WINDOW_INDEX, i8);
            }
            long j8 = this.durationUs;
            if (j8 != C.TIME_UNSET) {
                bundle.putLong(FIELD_DURATION_US, j8);
            }
            long j9 = this.positionInWindowUs;
            if (j9 != 0) {
                bundle.putLong(FIELD_POSITION_IN_WINDOW_US, j9);
            }
            boolean z7 = this.isPlaceholder;
            if (z7) {
                bundle.putBoolean(FIELD_PLACEHOLDER, z7);
            }
            if (!this.adPlaybackState.equals(AdPlaybackState.NONE)) {
                bundle.putBundle(FIELD_AD_PLAYBACK_STATE, this.adPlaybackState.toBundle());
            }
            return bundle;
        }

        @CanIgnoreReturnValue
        public Period set(@Nullable Object obj, @Nullable Object obj2, int i8, long j8, long j9) {
            return set(obj, obj2, i8, j8, j9, AdPlaybackState.NONE, false);
        }
    }

    public static final class RemotableTimeline extends Timeline {
        private final ImmutableList<Period> periods;
        private final int[] shuffledWindowIndices;
        private final int[] windowIndicesInShuffled;
        private final ImmutableList<Window> windows;

        public RemotableTimeline(ImmutableList<Window> immutableList, ImmutableList<Period> immutableList2, int[] iArr) {
            Assertions.checkArgument(immutableList.size() == iArr.length);
            this.windows = immutableList;
            this.periods = immutableList2;
            this.shuffledWindowIndices = iArr;
            this.windowIndicesInShuffled = new int[iArr.length];
            for (int i8 = 0; i8 < iArr.length; i8++) {
                this.windowIndicesInShuffled[iArr[i8]] = i8;
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getFirstWindowIndex(boolean z7) {
            if (isEmpty()) {
                return -1;
            }
            if (z7) {
                return this.shuffledWindowIndices[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getLastWindowIndex(boolean z7) {
            if (isEmpty()) {
                return -1;
            }
            return z7 ? this.shuffledWindowIndices[getWindowCount() - 1] : getWindowCount() - 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int i8, int i9, boolean z7) {
            if (i9 == 1) {
                return i8;
            }
            if (i8 != getLastWindowIndex(z7)) {
                return z7 ? this.shuffledWindowIndices[this.windowIndicesInShuffled[i8] + 1] : i8 + 1;
            }
            if (i9 == 2) {
                return getFirstWindowIndex(z7);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int i8, Period period, boolean z7) {
            Period period2 = this.periods.get(i8);
            period.set(period2.id, period2.uid, period2.windowIndex, period2.durationUs, period2.positionInWindowUs, period2.adPlaybackState, period2.isPlaceholder);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.periods.size();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int i8, int i9, boolean z7) {
            if (i9 == 1) {
                return i8;
            }
            if (i8 != getFirstWindowIndex(z7)) {
                return z7 ? this.shuffledWindowIndices[this.windowIndicesInShuffled[i8] - 1] : i8 - 1;
            }
            if (i9 == 2) {
                return getLastWindowIndex(z7);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int i8, Window window, long j8) {
            Window window2 = this.windows.get(i8);
            window.set(window2.uid, window2.mediaItem, window2.manifest, window2.presentationStartTimeMs, window2.windowStartTimeMs, window2.elapsedRealtimeEpochOffsetMs, window2.isSeekable, window2.isDynamic, window2.liveConfiguration, window2.defaultPositionUs, window2.durationUs, window2.firstPeriodIndex, window2.lastPeriodIndex, window2.positionInFirstPeriodUs);
            window.isPlaceholder = window2.isPlaceholder;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.windows.size();
        }
    }

    public static final class Window implements Bundleable {
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;

        @Deprecated
        public boolean isLive;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;

        @Nullable
        public MediaItem.LiveConfiguration liveConfiguration;

        @Nullable
        public Object manifest;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;

        @Nullable
        @Deprecated
        public Object tag;
        public long windowStartTimeMs;
        public static final Object SINGLE_WINDOW_UID = new Object();
        private static final Object FAKE_WINDOW_UID = new Object();
        private static final MediaItem PLACEHOLDER_MEDIA_ITEM = new MediaItem.Builder().setMediaId("com.google.android.exoplayer2.Timeline").setUri(Uri.EMPTY).build();
        private static final String FIELD_MEDIA_ITEM = Util.intToStringMaxRadix(1);
        private static final String FIELD_PRESENTATION_START_TIME_MS = Util.intToStringMaxRadix(2);
        private static final String FIELD_WINDOW_START_TIME_MS = Util.intToStringMaxRadix(3);
        private static final String FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS = Util.intToStringMaxRadix(4);
        private static final String FIELD_IS_SEEKABLE = Util.intToStringMaxRadix(5);
        private static final String FIELD_IS_DYNAMIC = Util.intToStringMaxRadix(6);
        private static final String FIELD_LIVE_CONFIGURATION = Util.intToStringMaxRadix(7);
        private static final String FIELD_IS_PLACEHOLDER = Util.intToStringMaxRadix(8);
        private static final String FIELD_DEFAULT_POSITION_US = Util.intToStringMaxRadix(9);
        private static final String FIELD_DURATION_US = Util.intToStringMaxRadix(10);
        private static final String FIELD_FIRST_PERIOD_INDEX = Util.intToStringMaxRadix(11);
        private static final String FIELD_LAST_PERIOD_INDEX = Util.intToStringMaxRadix(12);
        private static final String FIELD_POSITION_IN_FIRST_PERIOD_US = Util.intToStringMaxRadix(13);
        public static final Bundleable.Creator<Window> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.i6
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                Timeline.Window fromBundle;
                fromBundle = Timeline.Window.fromBundle(bundle);
                return fromBundle;
            }
        };
        public Object uid = SINGLE_WINDOW_UID;
        public MediaItem mediaItem = PLACEHOLDER_MEDIA_ITEM;

        /* JADX INFO: Access modifiers changed from: private */
        public static Window fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(FIELD_MEDIA_ITEM);
            MediaItem fromBundle = bundle2 != null ? MediaItem.CREATOR.fromBundle(bundle2) : MediaItem.EMPTY;
            long j8 = bundle.getLong(FIELD_PRESENTATION_START_TIME_MS, C.TIME_UNSET);
            long j9 = bundle.getLong(FIELD_WINDOW_START_TIME_MS, C.TIME_UNSET);
            long j10 = bundle.getLong(FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS, C.TIME_UNSET);
            boolean z7 = bundle.getBoolean(FIELD_IS_SEEKABLE, false);
            boolean z8 = bundle.getBoolean(FIELD_IS_DYNAMIC, false);
            Bundle bundle3 = bundle.getBundle(FIELD_LIVE_CONFIGURATION);
            MediaItem.LiveConfiguration fromBundle2 = bundle3 != null ? MediaItem.LiveConfiguration.CREATOR.fromBundle(bundle3) : null;
            boolean z9 = bundle.getBoolean(FIELD_IS_PLACEHOLDER, false);
            long j11 = bundle.getLong(FIELD_DEFAULT_POSITION_US, 0L);
            long j12 = bundle.getLong(FIELD_DURATION_US, C.TIME_UNSET);
            int i8 = bundle.getInt(FIELD_FIRST_PERIOD_INDEX, 0);
            int i9 = bundle.getInt(FIELD_LAST_PERIOD_INDEX, 0);
            long j13 = bundle.getLong(FIELD_POSITION_IN_FIRST_PERIOD_US, 0L);
            Window window = new Window();
            window.set(FAKE_WINDOW_UID, fromBundle, null, j8, j9, j10, z7, z8, fromBundle2, j11, j12, i8, i9, j13);
            window.isPlaceholder = z9;
            return window;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Util.areEqual(this.uid, window.uid) && Util.areEqual(this.mediaItem, window.mediaItem) && Util.areEqual(this.manifest, window.manifest) && Util.areEqual(this.liveConfiguration, window.liveConfiguration) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == window.elapsedRealtimeEpochOffsetMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isPlaceholder == window.isPlaceholder && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs;
        }

        public long getCurrentUnixTimeMs() {
            return Util.getNowUnixTimeMs(this.elapsedRealtimeEpochOffsetMs);
        }

        public long getDefaultPositionMs() {
            return Util.usToMs(this.defaultPositionUs);
        }

        public long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public long getDurationMs() {
            return Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInFirstPeriodMs() {
            return Util.usToMs(this.positionInFirstPeriodUs);
        }

        public long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public int hashCode() {
            int hashCode = (((217 + this.uid.hashCode()) * 31) + this.mediaItem.hashCode()) * 31;
            Object obj = this.manifest;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int hashCode3 = (hashCode2 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j8 = this.presentationStartTimeMs;
            int i8 = (hashCode3 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j9 = this.windowStartTimeMs;
            int i9 = (i8 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.elapsedRealtimeEpochOffsetMs;
            int i10 = (((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31) + (this.isPlaceholder ? 1 : 0)) * 31;
            long j11 = this.defaultPositionUs;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.durationUs;
            int i12 = (((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.firstPeriodIndex) * 31) + this.lastPeriodIndex) * 31;
            long j13 = this.positionInFirstPeriodUs;
            return i12 + ((int) (j13 ^ (j13 >>> 32)));
        }

        public boolean isLive() {
            Assertions.checkState(this.isLive == (this.liveConfiguration != null));
            return this.liveConfiguration != null;
        }

        @CanIgnoreReturnValue
        public Window set(Object obj, @Nullable MediaItem mediaItem, @Nullable Object obj2, long j8, long j9, long j10, boolean z7, boolean z8, @Nullable MediaItem.LiveConfiguration liveConfiguration, long j11, long j12, int i8, int i9, long j13) {
            MediaItem.LocalConfiguration localConfiguration;
            this.uid = obj;
            this.mediaItem = mediaItem != null ? mediaItem : PLACEHOLDER_MEDIA_ITEM;
            this.tag = (mediaItem == null || (localConfiguration = mediaItem.localConfiguration) == null) ? null : localConfiguration.tag;
            this.manifest = obj2;
            this.presentationStartTimeMs = j8;
            this.windowStartTimeMs = j9;
            this.elapsedRealtimeEpochOffsetMs = j10;
            this.isSeekable = z7;
            this.isDynamic = z8;
            this.isLive = liveConfiguration != null;
            this.liveConfiguration = liveConfiguration;
            this.defaultPositionUs = j11;
            this.durationUs = j12;
            this.firstPeriodIndex = i8;
            this.lastPeriodIndex = i9;
            this.positionInFirstPeriodUs = j13;
            this.isPlaceholder = false;
            return this;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!MediaItem.EMPTY.equals(this.mediaItem)) {
                bundle.putBundle(FIELD_MEDIA_ITEM, this.mediaItem.toBundle());
            }
            long j8 = this.presentationStartTimeMs;
            if (j8 != C.TIME_UNSET) {
                bundle.putLong(FIELD_PRESENTATION_START_TIME_MS, j8);
            }
            long j9 = this.windowStartTimeMs;
            if (j9 != C.TIME_UNSET) {
                bundle.putLong(FIELD_WINDOW_START_TIME_MS, j9);
            }
            long j10 = this.elapsedRealtimeEpochOffsetMs;
            if (j10 != C.TIME_UNSET) {
                bundle.putLong(FIELD_ELAPSED_REALTIME_EPOCH_OFFSET_MS, j10);
            }
            boolean z7 = this.isSeekable;
            if (z7) {
                bundle.putBoolean(FIELD_IS_SEEKABLE, z7);
            }
            boolean z8 = this.isDynamic;
            if (z8) {
                bundle.putBoolean(FIELD_IS_DYNAMIC, z8);
            }
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            if (liveConfiguration != null) {
                bundle.putBundle(FIELD_LIVE_CONFIGURATION, liveConfiguration.toBundle());
            }
            boolean z9 = this.isPlaceholder;
            if (z9) {
                bundle.putBoolean(FIELD_IS_PLACEHOLDER, z9);
            }
            long j11 = this.defaultPositionUs;
            if (j11 != 0) {
                bundle.putLong(FIELD_DEFAULT_POSITION_US, j11);
            }
            long j12 = this.durationUs;
            if (j12 != C.TIME_UNSET) {
                bundle.putLong(FIELD_DURATION_US, j12);
            }
            int i8 = this.firstPeriodIndex;
            if (i8 != 0) {
                bundle.putInt(FIELD_FIRST_PERIOD_INDEX, i8);
            }
            int i9 = this.lastPeriodIndex;
            if (i9 != 0) {
                bundle.putInt(FIELD_LAST_PERIOD_INDEX, i9);
            }
            long j13 = this.positionInFirstPeriodUs;
            if (j13 != 0) {
                bundle.putLong(FIELD_POSITION_IN_FIRST_PERIOD_US, j13);
            }
            return bundle;
        }
    }

    protected Timeline() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Timeline fromBundle(Bundle bundle) {
        ImmutableList fromBundleListRetriever = fromBundleListRetriever(Window.CREATOR, BundleUtil.getBinder(bundle, FIELD_WINDOWS));
        ImmutableList fromBundleListRetriever2 = fromBundleListRetriever(Period.CREATOR, BundleUtil.getBinder(bundle, FIELD_PERIODS));
        int[] intArray = bundle.getIntArray(FIELD_SHUFFLED_WINDOW_INDICES);
        if (intArray == null) {
            intArray = generateUnshuffledIndices(fromBundleListRetriever.size());
        }
        return new RemotableTimeline(fromBundleListRetriever, fromBundleListRetriever2, intArray);
    }

    private static <T extends Bundleable> ImmutableList<T> fromBundleListRetriever(Bundleable.Creator<T> creator, @Nullable IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<Bundle> list = BundleListRetriever.getList(iBinder);
        for (int i8 = 0; i8 < list.size(); i8++) {
            builder.add((ImmutableList.Builder) creator.fromBundle(list.get(i8)));
        }
        return builder.build();
    }

    private static int[] generateUnshuffledIndices(int i8) {
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = i9;
        }
        return iArr;
    }

    public boolean equals(@Nullable Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.getWindowCount() != getWindowCount() || timeline.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        Window window = new Window();
        Period period = new Period();
        Window window2 = new Window();
        Period period2 = new Period();
        for (int i8 = 0; i8 < getWindowCount(); i8++) {
            if (!getWindow(i8, window).equals(timeline.getWindow(i8, window2))) {
                return false;
            }
        }
        for (int i9 = 0; i9 < getPeriodCount(); i9++) {
            if (!getPeriod(i9, period, true).equals(timeline.getPeriod(i9, period2, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != timeline.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != timeline.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != timeline.getNextWindowIndex(firstWindowIndex, 0, true)) {
                return false;
            }
            firstWindowIndex = nextWindowIndex;
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z7) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z7) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i8, Period period, Window window, int i9, boolean z7) {
        int i10 = getPeriod(i8, period).windowIndex;
        if (getWindow(i10, window).lastPeriodIndex != i8) {
            return i8 + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i10, i9, z7);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, window).firstPeriodIndex;
    }

    public int getNextWindowIndex(int i8, int i9, boolean z7) {
        if (i9 == 0) {
            if (i8 == getLastWindowIndex(z7)) {
                return -1;
            }
            return i8 + 1;
        }
        if (i9 == 1) {
            return i8;
        }
        if (i9 == 2) {
            return i8 == getLastWindowIndex(z7) ? getFirstWindowIndex(z7) : i8 + 1;
        }
        throw new IllegalStateException();
    }

    public final Period getPeriod(int i8, Period period) {
        return getPeriod(i8, period, false);
    }

    public abstract Period getPeriod(int i8, Period period, boolean z7);

    public Period getPeriodByUid(Object obj, Period period) {
        return getPeriod(getIndexOfPeriod(obj), period, true);
    }

    public abstract int getPeriodCount();

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i8, long j8) {
        return getPeriodPositionUs(window, period, i8, j8);
    }

    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i8, long j8) {
        return (Pair) Assertions.checkNotNull(getPeriodPositionUs(window, period, i8, j8, 0L));
    }

    public int getPreviousWindowIndex(int i8, int i9, boolean z7) {
        if (i9 == 0) {
            if (i8 == getFirstWindowIndex(z7)) {
                return -1;
            }
            return i8 - 1;
        }
        if (i9 == 1) {
            return i8;
        }
        if (i9 == 2) {
            return i8 == getFirstWindowIndex(z7) ? getLastWindowIndex(z7) : i8 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object getUidOfPeriod(int i8);

    public final Window getWindow(int i8, Window window) {
        return getWindow(i8, window, 0L);
    }

    public abstract Window getWindow(int i8, Window window, long j8);

    public abstract int getWindowCount();

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int windowCount = 217 + getWindowCount();
        for (int i8 = 0; i8 < getWindowCount(); i8++) {
            windowCount = (windowCount * 31) + getWindow(i8, window).hashCode();
        }
        int periodCount = (windowCount * 31) + getPeriodCount();
        for (int i9 = 0; i9 < getPeriodCount(); i9++) {
            periodCount = (periodCount * 31) + getPeriod(i9, period, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i8, Period period, Window window, int i9, boolean z7) {
        return getNextPeriodIndex(i8, period, window, i9, z7) == -1;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        Window window = new Window();
        for (int i8 = 0; i8 < windowCount; i8++) {
            arrayList.add(getWindow(i8, window, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        Period period = new Period();
        for (int i9 = 0; i9 < periodCount; i9++) {
            arrayList2.add(getPeriod(i9, period, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i10 = 1; i10 < windowCount; i10++) {
            iArr[i10] = getNextWindowIndex(iArr[i10 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        BundleUtil.putBinder(bundle, FIELD_WINDOWS, new BundleListRetriever(arrayList));
        BundleUtil.putBinder(bundle, FIELD_PERIODS, new BundleListRetriever(arrayList2));
        bundle.putIntArray(FIELD_SHUFFLED_WINDOW_INDICES, iArr);
        return bundle;
    }

    public final Bundle toBundleWithOneWindowOnly(int i8) {
        Window window = getWindow(i8, new Window(), 0L);
        ArrayList arrayList = new ArrayList();
        Period period = new Period();
        int i9 = window.firstPeriodIndex;
        while (true) {
            int i10 = window.lastPeriodIndex;
            if (i9 > i10) {
                window.lastPeriodIndex = i10 - window.firstPeriodIndex;
                window.firstPeriodIndex = 0;
                Bundle bundle = window.toBundle();
                Bundle bundle2 = new Bundle();
                BundleUtil.putBinder(bundle2, FIELD_WINDOWS, new BundleListRetriever(ImmutableList.of(bundle)));
                BundleUtil.putBinder(bundle2, FIELD_PERIODS, new BundleListRetriever(arrayList));
                bundle2.putIntArray(FIELD_SHUFFLED_WINDOW_INDICES, new int[]{0});
                return bundle2;
            }
            getPeriod(i9, period, false);
            period.windowIndex = 0;
            arrayList.add(period.toBundle());
            i9++;
        }
    }

    @Nullable
    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i8, long j8, long j9) {
        return getPeriodPositionUs(window, period, i8, j8, j9);
    }

    @Nullable
    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i8, long j8, long j9) {
        Assertions.checkIndex(i8, 0, getWindowCount());
        getWindow(i8, window, j9);
        if (j8 == C.TIME_UNSET) {
            j8 = window.getDefaultPositionUs();
            if (j8 == C.TIME_UNSET) {
                return null;
            }
        }
        int i9 = window.firstPeriodIndex;
        getPeriod(i9, period);
        while (i9 < window.lastPeriodIndex && period.positionInWindowUs != j8) {
            int i10 = i9 + 1;
            if (getPeriod(i10, period).positionInWindowUs > j8) {
                break;
            }
            i9 = i10;
        }
        getPeriod(i9, period, true);
        long j10 = j8 - period.positionInWindowUs;
        long j11 = period.durationUs;
        if (j11 != C.TIME_UNSET) {
            j10 = Math.min(j10, j11 - 1);
        }
        return Pair.create(Assertions.checkNotNull(period.uid), Long.valueOf(Math.max(0L, j10)));
    }
}
