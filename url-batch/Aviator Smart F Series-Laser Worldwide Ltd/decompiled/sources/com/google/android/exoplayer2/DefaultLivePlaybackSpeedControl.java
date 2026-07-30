package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Deprecated
/* loaded from: classes3.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;
    private float adjustedPlaybackSpeed;
    private long currentTargetLiveOffsetUs;
    private final float fallbackMaxPlaybackSpeed;
    private final float fallbackMinPlaybackSpeed;
    private long idealTargetLiveOffsetUs;
    private long lastPlaybackSpeedUpdateMs;
    private final long maxLiveOffsetErrorUsForUnitSpeed;
    private float maxPlaybackSpeed;
    private long maxTargetLiveOffsetUs;
    private long mediaConfigurationTargetLiveOffsetUs;
    private float minPlaybackSpeed;
    private final float minPossibleLiveOffsetSmoothingFactor;
    private long minTargetLiveOffsetUs;
    private final long minUpdateIntervalMs;
    private final float proportionalControlFactor;
    private long smoothedMinPossibleLiveOffsetDeviationUs;
    private long smoothedMinPossibleLiveOffsetUs;
    private long targetLiveOffsetOverrideUs;
    private final long targetLiveOffsetRebufferDeltaUs;

    public static final class Builder {
        private float fallbackMinPlaybackSpeed = 0.97f;
        private float fallbackMaxPlaybackSpeed = 1.03f;
        private long minUpdateIntervalMs = 1000;
        private float proportionalControlFactorUs = 1.0E-7f;
        private long maxLiveOffsetErrorUsForUnitSpeed = Util.msToUs(20);
        private long targetLiveOffsetIncrementOnRebufferUs = Util.msToUs(500);
        private float minPossibleLiveOffsetSmoothingFactor = 0.999f;

        public DefaultLivePlaybackSpeedControl build() {
            return new DefaultLivePlaybackSpeedControl(this.fallbackMinPlaybackSpeed, this.fallbackMaxPlaybackSpeed, this.minUpdateIntervalMs, this.proportionalControlFactorUs, this.maxLiveOffsetErrorUsForUnitSpeed, this.targetLiveOffsetIncrementOnRebufferUs, this.minPossibleLiveOffsetSmoothingFactor);
        }

        @CanIgnoreReturnValue
        public Builder setFallbackMaxPlaybackSpeed(float f8) {
            Assertions.checkArgument(f8 >= 1.0f);
            this.fallbackMaxPlaybackSpeed = f8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFallbackMinPlaybackSpeed(float f8) {
            Assertions.checkArgument(0.0f < f8 && f8 <= 1.0f);
            this.fallbackMinPlaybackSpeed = f8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMaxLiveOffsetErrorMsForUnitSpeed(long j8) {
            Assertions.checkArgument(j8 > 0);
            this.maxLiveOffsetErrorUsForUnitSpeed = Util.msToUs(j8);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinPossibleLiveOffsetSmoothingFactor(float f8) {
            Assertions.checkArgument(f8 >= 0.0f && f8 < 1.0f);
            this.minPossibleLiveOffsetSmoothingFactor = f8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setMinUpdateIntervalMs(long j8) {
            Assertions.checkArgument(j8 > 0);
            this.minUpdateIntervalMs = j8;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setProportionalControlFactor(float f8) {
            Assertions.checkArgument(f8 > 0.0f);
            this.proportionalControlFactorUs = f8 / 1000000.0f;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTargetLiveOffsetIncrementOnRebufferMs(long j8) {
            Assertions.checkArgument(j8 >= 0);
            this.targetLiveOffsetIncrementOnRebufferUs = Util.msToUs(j8);
            return this;
        }
    }

    private void adjustTargetLiveOffsetUs(long j8) {
        long j9 = this.smoothedMinPossibleLiveOffsetUs + (this.smoothedMinPossibleLiveOffsetDeviationUs * 3);
        if (this.currentTargetLiveOffsetUs > j9) {
            float msToUs = Util.msToUs(this.minUpdateIntervalMs);
            this.currentTargetLiveOffsetUs = Longs.max(j9, this.idealTargetLiveOffsetUs, this.currentTargetLiveOffsetUs - (((long) ((this.adjustedPlaybackSpeed - 1.0f) * msToUs)) + ((long) ((this.maxPlaybackSpeed - 1.0f) * msToUs))));
            return;
        }
        long constrainValue = Util.constrainValue(j8 - ((long) (Math.max(0.0f, this.adjustedPlaybackSpeed - 1.0f) / this.proportionalControlFactor)), this.currentTargetLiveOffsetUs, j9);
        this.currentTargetLiveOffsetUs = constrainValue;
        long j10 = this.maxTargetLiveOffsetUs;
        if (j10 == C.TIME_UNSET || constrainValue <= j10) {
            return;
        }
        this.currentTargetLiveOffsetUs = j10;
    }

    private void maybeResetTargetLiveOffsetUs() {
        long j8 = this.mediaConfigurationTargetLiveOffsetUs;
        if (j8 != C.TIME_UNSET) {
            long j9 = this.targetLiveOffsetOverrideUs;
            if (j9 != C.TIME_UNSET) {
                j8 = j9;
            }
            long j10 = this.minTargetLiveOffsetUs;
            if (j10 != C.TIME_UNSET && j8 < j10) {
                j8 = j10;
            }
            long j11 = this.maxTargetLiveOffsetUs;
            if (j11 != C.TIME_UNSET && j8 > j11) {
                j8 = j11;
            }
        } else {
            j8 = -9223372036854775807L;
        }
        if (this.idealTargetLiveOffsetUs == j8) {
            return;
        }
        this.idealTargetLiveOffsetUs = j8;
        this.currentTargetLiveOffsetUs = j8;
        this.smoothedMinPossibleLiveOffsetUs = C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = C.TIME_UNSET;
        this.lastPlaybackSpeedUpdateMs = C.TIME_UNSET;
    }

    private static long smooth(long j8, long j9, float f8) {
        return (long) ((j8 * f8) + ((1.0f - f8) * j9));
    }

    private void updateSmoothedMinPossibleLiveOffsetUs(long j8, long j9) {
        long j10 = j8 - j9;
        long j11 = this.smoothedMinPossibleLiveOffsetUs;
        if (j11 == C.TIME_UNSET) {
            this.smoothedMinPossibleLiveOffsetUs = j10;
            this.smoothedMinPossibleLiveOffsetDeviationUs = 0L;
        } else {
            long max = Math.max(j10, smooth(j11, j10, this.minPossibleLiveOffsetSmoothingFactor));
            this.smoothedMinPossibleLiveOffsetUs = max;
            this.smoothedMinPossibleLiveOffsetDeviationUs = smooth(this.smoothedMinPossibleLiveOffsetDeviationUs, Math.abs(j10 - max), this.minPossibleLiveOffsetSmoothingFactor);
        }
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long j8, long j9) {
        if (this.mediaConfigurationTargetLiveOffsetUs == C.TIME_UNSET) {
            return 1.0f;
        }
        updateSmoothedMinPossibleLiveOffsetUs(j8, j9);
        if (this.lastPlaybackSpeedUpdateMs != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.lastPlaybackSpeedUpdateMs < this.minUpdateIntervalMs) {
            return this.adjustedPlaybackSpeed;
        }
        this.lastPlaybackSpeedUpdateMs = SystemClock.elapsedRealtime();
        adjustTargetLiveOffsetUs(j8);
        long j10 = j8 - this.currentTargetLiveOffsetUs;
        if (Math.abs(j10) < this.maxLiveOffsetErrorUsForUnitSpeed) {
            this.adjustedPlaybackSpeed = 1.0f;
        } else {
            this.adjustedPlaybackSpeed = Util.constrainValue((this.proportionalControlFactor * j10) + 1.0f, this.minPlaybackSpeed, this.maxPlaybackSpeed);
        }
        return this.adjustedPlaybackSpeed;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
        return this.currentTargetLiveOffsetUs;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void notifyRebuffer() {
        long j8 = this.currentTargetLiveOffsetUs;
        if (j8 == C.TIME_UNSET) {
            return;
        }
        long j9 = j8 + this.targetLiveOffsetRebufferDeltaUs;
        this.currentTargetLiveOffsetUs = j9;
        long j10 = this.maxTargetLiveOffsetUs;
        if (j10 != C.TIME_UNSET && j9 > j10) {
            this.currentTargetLiveOffsetUs = j10;
        }
        this.lastPlaybackSpeedUpdateMs = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
        this.mediaConfigurationTargetLiveOffsetUs = Util.msToUs(liveConfiguration.targetOffsetMs);
        this.minTargetLiveOffsetUs = Util.msToUs(liveConfiguration.minOffsetMs);
        this.maxTargetLiveOffsetUs = Util.msToUs(liveConfiguration.maxOffsetMs);
        float f8 = liveConfiguration.minPlaybackSpeed;
        if (f8 == -3.4028235E38f) {
            f8 = this.fallbackMinPlaybackSpeed;
        }
        this.minPlaybackSpeed = f8;
        float f9 = liveConfiguration.maxPlaybackSpeed;
        if (f9 == -3.4028235E38f) {
            f9 = this.fallbackMaxPlaybackSpeed;
        }
        this.maxPlaybackSpeed = f9;
        if (f8 == 1.0f && f9 == 1.0f) {
            this.mediaConfigurationTargetLiveOffsetUs = C.TIME_UNSET;
        }
        maybeResetTargetLiveOffsetUs();
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long j8) {
        this.targetLiveOffsetOverrideUs = j8;
        maybeResetTargetLiveOffsetUs();
    }

    private DefaultLivePlaybackSpeedControl(float f8, float f9, long j8, float f10, long j9, long j10, float f11) {
        this.fallbackMinPlaybackSpeed = f8;
        this.fallbackMaxPlaybackSpeed = f9;
        this.minUpdateIntervalMs = j8;
        this.proportionalControlFactor = f10;
        this.maxLiveOffsetErrorUsForUnitSpeed = j9;
        this.targetLiveOffsetRebufferDeltaUs = j10;
        this.minPossibleLiveOffsetSmoothingFactor = f11;
        this.mediaConfigurationTargetLiveOffsetUs = C.TIME_UNSET;
        this.targetLiveOffsetOverrideUs = C.TIME_UNSET;
        this.minTargetLiveOffsetUs = C.TIME_UNSET;
        this.maxTargetLiveOffsetUs = C.TIME_UNSET;
        this.minPlaybackSpeed = f8;
        this.maxPlaybackSpeed = f9;
        this.adjustedPlaybackSpeed = 1.0f;
        this.lastPlaybackSpeedUpdateMs = C.TIME_UNSET;
        this.idealTargetLiveOffsetUs = C.TIME_UNSET;
        this.currentTargetLiveOffsetUs = C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetUs = C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = C.TIME_UNSET;
    }
}
