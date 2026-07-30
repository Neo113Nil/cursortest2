package com.google.android.exoplayer2.source.ads;

import androidx.annotation.CheckResult;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
public final class ServerSideAdInsertionUtil {
    private ServerSideAdInsertionUtil() {
    }

    @CheckResult
    public static AdPlaybackState addAdGroupToAdPlaybackState(AdPlaybackState adPlaybackState, long j8, long j9, long... jArr) {
        long mediaPeriodPositionUsForContent = getMediaPeriodPositionUsForContent(j8, -1, adPlaybackState);
        int i8 = adPlaybackState.removedAdGroupCount;
        while (i8 < adPlaybackState.adGroupCount && adPlaybackState.getAdGroup(i8).timeUs != Long.MIN_VALUE && adPlaybackState.getAdGroup(i8).timeUs <= mediaPeriodPositionUsForContent) {
            i8++;
        }
        AdPlaybackState withContentResumeOffsetUs = adPlaybackState.withNewAdGroup(i8, mediaPeriodPositionUsForContent).withIsServerSideInserted(i8, true).withAdCount(i8, jArr.length).withAdDurationsUs(i8, jArr).withContentResumeOffsetUs(i8, j9);
        AdPlaybackState adPlaybackState2 = withContentResumeOffsetUs;
        for (int i9 = 0; i9 < jArr.length && jArr[i9] == 0; i9++) {
            adPlaybackState2 = adPlaybackState2.withSkippedAd(i8, i9);
        }
        return correctFollowingAdGroupTimes(adPlaybackState2, i8, Util.sum(jArr), j9);
    }

    private static AdPlaybackState correctFollowingAdGroupTimes(AdPlaybackState adPlaybackState, int i8, long j8, long j9) {
        long j10 = (-j8) + j9;
        while (true) {
            i8++;
            if (i8 >= adPlaybackState.adGroupCount) {
                return adPlaybackState;
            }
            long j11 = adPlaybackState.getAdGroup(i8).timeUs;
            if (j11 != Long.MIN_VALUE) {
                adPlaybackState = adPlaybackState.withAdGroupTimeUs(i8, j11 + j10);
            }
        }
    }

    public static int getAdCountInGroup(AdPlaybackState adPlaybackState, int i8) {
        int i9 = adPlaybackState.getAdGroup(i8).count;
        if (i9 == -1) {
            return 0;
        }
        return i9;
    }

    public static long getMediaPeriodPositionUs(long j8, MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        return mediaPeriodId.isAd() ? getMediaPeriodPositionUsForAd(j8, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState) : getMediaPeriodPositionUsForContent(j8, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }

    public static long getMediaPeriodPositionUsForAd(long j8, int i8, int i9, AdPlaybackState adPlaybackState) {
        int i10;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i8);
        long j9 = j8 - adGroup.timeUs;
        int i11 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i10 = 0;
            if (i11 >= i8) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i11);
            while (i10 < getAdCountInGroup(adPlaybackState, i11)) {
                j9 -= adGroup2.durationsUs[i10];
                i10++;
            }
            j9 += adGroup2.contentResumeOffsetUs;
            i11++;
        }
        if (i9 < getAdCountInGroup(adPlaybackState, i8)) {
            while (i10 < i9) {
                j9 -= adGroup.durationsUs[i10];
                i10++;
            }
        }
        return j9;
    }

    public static long getMediaPeriodPositionUsForContent(long j8, int i8, AdPlaybackState adPlaybackState) {
        if (i8 == -1) {
            i8 = adPlaybackState.adGroupCount;
        }
        long j9 = 0;
        for (int i9 = adPlaybackState.removedAdGroupCount; i9 < i8; i9++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i9);
            long j10 = adGroup.timeUs;
            if (j10 == Long.MIN_VALUE || j10 > j8 - j9) {
                break;
            }
            for (int i10 = 0; i10 < getAdCountInGroup(adPlaybackState, i9); i10++) {
                j9 += adGroup.durationsUs[i10];
            }
            long j11 = adGroup.contentResumeOffsetUs;
            j9 -= j11;
            long j12 = adGroup.timeUs;
            long j13 = j8 - j9;
            if (j11 + j12 > j13) {
                return Math.max(j12, j13);
            }
        }
        return j8 - j9;
    }

    public static long getStreamPositionUs(Player player, AdPlaybackState adPlaybackState) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return C.TIME_UNSET;
        }
        Timeline.Period period = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), new Timeline.Period());
        if (!Util.areEqual(period.getAdsId(), adPlaybackState.adsId)) {
            return C.TIME_UNSET;
        }
        if (!player.isPlayingAd()) {
            return getStreamPositionUsForContent(Util.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs(), -1, adPlaybackState);
        }
        return getStreamPositionUsForAd(Util.msToUs(player.getCurrentPosition()), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adPlaybackState);
    }

    public static long getStreamPositionUsForAd(long j8, int i8, int i9, AdPlaybackState adPlaybackState) {
        int i10;
        AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i8);
        long j9 = j8 + adGroup.timeUs;
        int i11 = adPlaybackState.removedAdGroupCount;
        while (true) {
            i10 = 0;
            if (i11 >= i8) {
                break;
            }
            AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(i11);
            while (i10 < getAdCountInGroup(adPlaybackState, i11)) {
                j9 += adGroup2.durationsUs[i10];
                i10++;
            }
            j9 -= adGroup2.contentResumeOffsetUs;
            i11++;
        }
        if (i9 < getAdCountInGroup(adPlaybackState, i8)) {
            while (i10 < i9) {
                j9 += adGroup.durationsUs[i10];
                i10++;
            }
        }
        return j9;
    }

    public static long getStreamPositionUsForContent(long j8, int i8, AdPlaybackState adPlaybackState) {
        if (i8 == -1) {
            i8 = adPlaybackState.adGroupCount;
        }
        long j9 = 0;
        for (int i9 = adPlaybackState.removedAdGroupCount; i9 < i8; i9++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i9);
            long j10 = adGroup.timeUs;
            if (j10 == Long.MIN_VALUE || j10 > j8) {
                break;
            }
            long j11 = j10 + j9;
            for (int i10 = 0; i10 < getAdCountInGroup(adPlaybackState, i9); i10++) {
                j9 += adGroup.durationsUs[i10];
            }
            long j12 = adGroup.contentResumeOffsetUs;
            j9 -= j12;
            if (adGroup.timeUs + j12 > j8) {
                return Math.max(j11, j8 + j9);
            }
        }
        return j8 + j9;
    }

    public static long getStreamPositionUs(long j8, MediaPeriodId mediaPeriodId, AdPlaybackState adPlaybackState) {
        if (mediaPeriodId.isAd()) {
            return getStreamPositionUsForAd(j8, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        }
        return getStreamPositionUsForContent(j8, mediaPeriodId.nextAdGroupIndex, adPlaybackState);
    }
}
