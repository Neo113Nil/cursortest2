package com.google.android.exoplayer2.analytics;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = merge(new PlaybackStats[0]);
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
            this.eventTime = eventTime;
            this.exception = exc;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.exception.hashCode();
        }
    }

    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;

        @Nullable
        public final Format format;

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, @Nullable Format format) {
            this.eventTime = eventTime;
            this.format = format;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndFormat.class != obj.getClass()) {
                return false;
            }
            EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
            if (!this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                return false;
            }
            Format format = this.format;
            Format format2 = eventTimeAndFormat.format;
            return format != null ? format.equals(format2) : format2 == null;
        }

        public int hashCode() {
            int hashCode = this.eventTime.hashCode() * 31;
            Format format = this.format;
            return hashCode + (format != null ? format.hashCode() : 0);
        }
    }

    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i8) {
            this.eventTime = eventTime;
            this.playbackState = i8;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }
    }

    PlaybackStats(int i8, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j8, int i9, int i10, int i11, int i12, long j9, int i13, int i14, int i15, int i16, int i17, long j10, int i18, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j11, long j12, long j13, long j14, long j15, long j16, int i19, int i20, int i21, long j17, int i22, long j18, long j19, long j20, long j21, long j22, int i23, int i24, int i25, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i8;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = Collections.unmodifiableList(list);
        this.mediaTimeHistory = Collections.unmodifiableList(list2);
        this.firstReportedTimeMs = j8;
        this.foregroundPlaybackCount = i9;
        this.abandonedBeforeReadyCount = i10;
        this.endedCount = i11;
        this.backgroundJoiningCount = i12;
        this.totalValidJoinTimeMs = j9;
        this.validJoinTimeCount = i13;
        this.totalPauseCount = i14;
        this.totalPauseBufferCount = i15;
        this.totalSeekCount = i16;
        this.totalRebufferCount = i17;
        this.maxRebufferTimeMs = j10;
        this.adPlaybackCount = i18;
        this.videoFormatHistory = Collections.unmodifiableList(list3);
        this.audioFormatHistory = Collections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j11;
        this.totalVideoFormatHeightTimeProduct = j12;
        this.totalVideoFormatBitrateTimeMs = j13;
        this.totalVideoFormatBitrateTimeProduct = j14;
        this.totalAudioFormatTimeMs = j15;
        this.totalAudioFormatBitrateTimeProduct = j16;
        this.initialVideoFormatHeightCount = i19;
        this.initialVideoFormatBitrateCount = i20;
        this.totalInitialVideoFormatHeight = i21;
        this.totalInitialVideoFormatBitrate = j17;
        this.initialAudioFormatBitrateCount = i22;
        this.totalInitialAudioFormatBitrate = j18;
        this.totalBandwidthTimeMs = j19;
        this.totalBandwidthBytes = j20;
        this.totalDroppedFrames = j21;
        this.totalAudioUnderruns = j22;
        this.fatalErrorPlaybackCount = i23;
        this.fatalErrorCount = i24;
        this.nonFatalErrorCount = i25;
        this.fatalErrorHistory = Collections.unmodifiableList(list5);
        this.nonFatalErrorHistory = Collections.unmodifiableList(list6);
    }

    public static PlaybackStats merge(PlaybackStats... playbackStatsArr) {
        int i8;
        int i9 = 16;
        long[] jArr = new long[16];
        int length = playbackStatsArr.length;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        long j18 = C.TIME_UNSET;
        long j19 = C.TIME_UNSET;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j20 = C.TIME_UNSET;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        long j21 = -1;
        int i25 = 0;
        long j22 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i10 < length) {
            PlaybackStats playbackStats = playbackStatsArr[i10];
            i11 += playbackStats.playbackCount;
            for (int i29 = 0; i29 < i9; i29++) {
                jArr[i29] = jArr[i29] + playbackStats.playbackStateDurationsMs[i29];
            }
            if (j19 == C.TIME_UNSET) {
                j19 = playbackStats.firstReportedTimeMs;
                i8 = length;
            } else {
                i8 = length;
                long j23 = playbackStats.firstReportedTimeMs;
                if (j23 != C.TIME_UNSET) {
                    j19 = Math.min(j19, j23);
                }
            }
            i13 += playbackStats.foregroundPlaybackCount;
            i14 += playbackStats.abandonedBeforeReadyCount;
            i15 += playbackStats.endedCount;
            i16 += playbackStats.backgroundJoiningCount;
            if (j20 == C.TIME_UNSET) {
                j20 = playbackStats.totalValidJoinTimeMs;
            } else {
                long j24 = playbackStats.totalValidJoinTimeMs;
                if (j24 != C.TIME_UNSET) {
                    j20 += j24;
                }
            }
            i17 += playbackStats.validJoinTimeCount;
            i18 += playbackStats.totalPauseCount;
            i19 += playbackStats.totalPauseBufferCount;
            i20 += playbackStats.totalSeekCount;
            i21 += playbackStats.totalRebufferCount;
            if (j18 == C.TIME_UNSET) {
                j18 = playbackStats.maxRebufferTimeMs;
            } else {
                long j25 = playbackStats.maxRebufferTimeMs;
                if (j25 != C.TIME_UNSET) {
                    j18 = Math.max(j18, j25);
                }
            }
            i22 += playbackStats.adPlaybackCount;
            j8 += playbackStats.totalVideoFormatHeightTimeMs;
            j9 += playbackStats.totalVideoFormatHeightTimeProduct;
            j10 += playbackStats.totalVideoFormatBitrateTimeMs;
            j11 += playbackStats.totalVideoFormatBitrateTimeProduct;
            j12 += playbackStats.totalAudioFormatTimeMs;
            j13 += playbackStats.totalAudioFormatBitrateTimeProduct;
            i23 += playbackStats.initialVideoFormatHeightCount;
            i24 += playbackStats.initialVideoFormatBitrateCount;
            if (i12 == -1) {
                i12 = playbackStats.totalInitialVideoFormatHeight;
            } else {
                int i30 = playbackStats.totalInitialVideoFormatHeight;
                if (i30 != -1) {
                    i12 += i30;
                }
            }
            if (j21 == -1) {
                j21 = playbackStats.totalInitialVideoFormatBitrate;
            } else {
                long j26 = playbackStats.totalInitialVideoFormatBitrate;
                if (j26 != -1) {
                    j21 += j26;
                }
            }
            i25 += playbackStats.initialAudioFormatBitrateCount;
            if (j22 == -1) {
                j22 = playbackStats.totalInitialAudioFormatBitrate;
            } else {
                long j27 = playbackStats.totalInitialAudioFormatBitrate;
                if (j27 != -1) {
                    j22 += j27;
                }
            }
            j14 += playbackStats.totalBandwidthTimeMs;
            j15 += playbackStats.totalBandwidthBytes;
            j16 += playbackStats.totalDroppedFrames;
            j17 += playbackStats.totalAudioUnderruns;
            i26 += playbackStats.fatalErrorPlaybackCount;
            i27 += playbackStats.fatalErrorCount;
            i28 += playbackStats.nonFatalErrorCount;
            i10++;
            length = i8;
            i9 = 16;
        }
        return new PlaybackStats(i11, jArr, Collections.emptyList(), Collections.emptyList(), j19, i13, i14, i15, i16, j20, i17, i18, i19, i20, i21, j18, i22, Collections.emptyList(), Collections.emptyList(), j8, j9, j10, j11, j12, j13, i23, i24, i12, j21, i25, j22, j14, j15, j16, j17, i26, i27, i28, Collections.emptyList(), Collections.emptyList());
    }

    public float getAbandonedBeforeReadyRatio() {
        int i8 = this.abandonedBeforeReadyCount;
        int i9 = this.playbackCount;
        int i10 = this.foregroundPlaybackCount;
        int i11 = i8 - (i9 - i10);
        if (i10 == 0) {
            return 0.0f;
        }
        return i11 / i10;
    }

    public float getAudioUnderrunRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalAudioUnderruns * 1000.0f) / totalPlayTimeMs;
    }

    public float getDroppedFramesRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalDroppedFrames * 1000.0f) / totalPlayTimeMs;
    }

    public float getEndedRatio() {
        int i8 = this.foregroundPlaybackCount;
        if (i8 == 0) {
            return 0.0f;
        }
        return this.endedCount / i8;
    }

    public float getFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.fatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getFatalErrorRatio() {
        int i8 = this.foregroundPlaybackCount;
        if (i8 == 0) {
            return 0.0f;
        }
        return this.fatalErrorPlaybackCount / i8;
    }

    public float getJoinTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalJoinTimeMs() / totalPlayAndWaitTimeMs;
    }

    public int getMeanAudioFormatBitrate() {
        long j8 = this.totalAudioFormatTimeMs;
        if (j8 == 0) {
            return -1;
        }
        return (int) (this.totalAudioFormatBitrateTimeProduct / j8);
    }

    public int getMeanBandwidth() {
        long j8 = this.totalBandwidthTimeMs;
        if (j8 == 0) {
            return -1;
        }
        return (int) ((this.totalBandwidthBytes * RtspMediaSource.DEFAULT_TIMEOUT_MS) / j8);
    }

    public long getMeanElapsedTimeMs() {
        return this.playbackCount == 0 ? C.TIME_UNSET : getTotalElapsedTimeMs() / this.playbackCount;
    }

    public int getMeanInitialAudioFormatBitrate() {
        int i8 = this.initialAudioFormatBitrateCount;
        if (i8 == 0) {
            return -1;
        }
        return (int) (this.totalInitialAudioFormatBitrate / i8);
    }

    public int getMeanInitialVideoFormatBitrate() {
        int i8 = this.initialVideoFormatBitrateCount;
        if (i8 == 0) {
            return -1;
        }
        return (int) (this.totalInitialVideoFormatBitrate / i8);
    }

    public int getMeanInitialVideoFormatHeight() {
        int i8 = this.initialVideoFormatHeightCount;
        if (i8 == 0) {
            return -1;
        }
        return this.totalInitialVideoFormatHeight / i8;
    }

    public long getMeanJoinTimeMs() {
        int i8 = this.validJoinTimeCount;
        return i8 == 0 ? C.TIME_UNSET : this.totalValidJoinTimeMs / i8;
    }

    public float getMeanNonFatalErrorCount() {
        int i8 = this.foregroundPlaybackCount;
        if (i8 == 0) {
            return 0.0f;
        }
        return this.nonFatalErrorCount / i8;
    }

    public float getMeanPauseBufferCount() {
        int i8 = this.foregroundPlaybackCount;
        if (i8 == 0) {
            return 0.0f;
        }
        return this.totalPauseBufferCount / i8;
    }

    public float getMeanPauseCount() {
        int i8 = this.foregroundPlaybackCount;
        if (i8 == 0) {
            return 0.0f;
        }
        return this.totalPauseCount / i8;
    }

    public long getMeanPausedTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPausedTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanPlayAndWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayAndWaitTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanPlayTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayTimeMs() / this.foregroundPlaybackCount;
    }

    public float getMeanRebufferCount() {
        int i8 = this.foregroundPlaybackCount;
        if (i8 == 0) {
            return 0.0f;
        }
        return this.totalRebufferCount / i8;
    }

    public long getMeanRebufferTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalRebufferTimeMs() / this.foregroundPlaybackCount;
    }

    public float getMeanSeekCount() {
        int i8 = this.foregroundPlaybackCount;
        if (i8 == 0) {
            return 0.0f;
        }
        return this.totalSeekCount / i8;
    }

    public long getMeanSeekTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanSingleRebufferTimeMs() {
        return this.totalRebufferCount == 0 ? C.TIME_UNSET : (getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(7)) / this.totalRebufferCount;
    }

    public long getMeanSingleSeekTimeMs() {
        return this.totalSeekCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / this.totalSeekCount;
    }

    public float getMeanTimeBetweenFatalErrors() {
        return 1.0f / getFatalErrorRate();
    }

    public float getMeanTimeBetweenNonFatalErrors() {
        return 1.0f / getNonFatalErrorRate();
    }

    public float getMeanTimeBetweenRebuffers() {
        return 1.0f / getRebufferRate();
    }

    public int getMeanVideoFormatBitrate() {
        long j8 = this.totalVideoFormatBitrateTimeMs;
        if (j8 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatBitrateTimeProduct / j8);
    }

    public int getMeanVideoFormatHeight() {
        long j8 = this.totalVideoFormatHeightTimeMs;
        if (j8 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatHeightTimeProduct / j8);
    }

    public long getMeanWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalWaitTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMediaTimeMsAtRealtimeMs(long j8) {
        if (this.mediaTimeHistory.isEmpty()) {
            return C.TIME_UNSET;
        }
        int i8 = 0;
        while (i8 < this.mediaTimeHistory.size() && this.mediaTimeHistory.get(i8)[0] <= j8) {
            i8++;
        }
        if (i8 == 0) {
            return this.mediaTimeHistory.get(0)[1];
        }
        if (i8 == this.mediaTimeHistory.size()) {
            List<long[]> list = this.mediaTimeHistory;
            return list.get(list.size() - 1)[1];
        }
        int i9 = i8 - 1;
        long j9 = this.mediaTimeHistory.get(i9)[0];
        long j10 = this.mediaTimeHistory.get(i9)[1];
        long j11 = this.mediaTimeHistory.get(i8)[0];
        long j12 = this.mediaTimeHistory.get(i8)[1];
        long j13 = j11 - j9;
        if (j13 == 0) {
            return j10;
        }
        return j10 + ((long) ((j12 - j10) * ((j8 - j9) / j13)));
    }

    public float getNonFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.nonFatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public int getPlaybackStateAtTime(long j8) {
        int i8 = 0;
        for (EventTimeAndPlaybackState eventTimeAndPlaybackState : this.playbackStateHistory) {
            if (eventTimeAndPlaybackState.eventTime.realtimeMs > j8) {
                break;
            }
            i8 = eventTimeAndPlaybackState.playbackState;
        }
        return i8;
    }

    public long getPlaybackStateDurationMs(int i8) {
        return this.playbackStateDurationsMs[i8];
    }

    public float getRebufferRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalRebufferCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalRebufferTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getSeekTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalSeekTimeMs() / totalPlayAndWaitTimeMs;
    }

    public long getTotalElapsedTimeMs() {
        long j8 = 0;
        for (int i8 = 0; i8 < 16; i8++) {
            j8 += this.playbackStateDurationsMs[i8];
        }
        return j8;
    }

    public long getTotalJoinTimeMs() {
        return getPlaybackStateDurationMs(2);
    }

    public long getTotalPausedTimeMs() {
        return getPlaybackStateDurationMs(4) + getPlaybackStateDurationMs(7);
    }

    public long getTotalPlayAndWaitTimeMs() {
        return getTotalPlayTimeMs() + getTotalWaitTimeMs();
    }

    public long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }

    public long getTotalSeekTimeMs() {
        return getPlaybackStateDurationMs(5);
    }

    public long getTotalWaitTimeMs() {
        return getPlaybackStateDurationMs(2) + getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(5);
    }

    public float getWaitTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalWaitTimeMs() / totalPlayAndWaitTimeMs;
    }
}
