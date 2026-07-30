package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@Deprecated
/* loaded from: classes3.dex */
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_IMAGE_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    private final DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private boolean isLoading;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean retainBackBufferFromKeyframe;
    private int targetBufferBytes;
    private final int targetBufferBytesOverwrite;

    public static final class Builder {

        @Nullable
        private DefaultAllocator allocator;
        private boolean buildCalled;
        private int minBufferMs = 50000;
        private int maxBufferMs = 50000;
        private int bufferForPlaybackMs = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        private int bufferForPlaybackAfterRebufferMs = 5000;
        private int targetBufferBytes = -1;
        private boolean prioritizeTimeOverSizeThresholds = false;
        private int backBufferDurationMs = 0;
        private boolean retainBackBufferFromKeyframe = false;

        public DefaultLoadControl build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, 65536);
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.maxBufferMs, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.backBufferDurationMs, this.retainBackBufferFromKeyframe);
        }

        @CanIgnoreReturnValue
        public Builder setAllocator(DefaultAllocator defaultAllocator) {
            Assertions.checkState(!this.buildCalled);
            this.allocator = defaultAllocator;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBackBuffer(int i8, boolean z7) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i8, 0, "backBufferDurationMs", "0");
            this.backBufferDurationMs = i8;
            this.retainBackBufferFromKeyframe = z7;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setBufferDurationsMs(int i8, int i9, int i10, int i11) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i10, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i8, i10, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i8, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i9, i8, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i8;
            this.maxBufferMs = i9;
            this.bufferForPlaybackMs = i10;
            this.bufferForPlaybackAfterRebufferMs = i11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrioritizeTimeOverSizeThresholds(boolean z7) {
            Assertions.checkState(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z7;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTargetBufferBytes(int i8) {
            Assertions.checkState(!this.buildCalled);
            this.targetBufferBytes = i8;
            return this;
        }
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536), 50000, 50000, DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, false, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertGreaterOrEqual(int i8, int i9, String str, String str2) {
        Assertions.checkArgument(i8 >= i9, str + " cannot be less than " + str2);
    }

    private static int getDefaultBufferSize(int i8) {
        switch (i8) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void reset(boolean z7) {
        int i8 = this.targetBufferBytesOverwrite;
        if (i8 == -1) {
            i8 = 13107200;
        }
        this.targetBufferBytes = i8;
        this.isLoading = false;
        if (z7) {
            this.allocator.reset();
        }
    }

    protected int calculateTargetBufferBytes(Renderer[] rendererArr, ExoTrackSelection[] exoTrackSelectionArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < rendererArr.length; i9++) {
            if (exoTrackSelectionArr[i9] != null) {
                i8 += getDefaultBufferSize(rendererArr[i9].getTrackType());
            }
        }
        return Math.max(13107200, i8);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public Allocator getAllocator() {
        return this.allocator;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public long getBackBufferDurationUs() {
        return this.backBufferDurationUs;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onPrepared() {
        reset(false);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onReleased() {
        reset(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onStopped() {
        reset(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public /* synthetic */ void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        g2.b(this, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean retainBackBufferFromKeyframe() {
        return this.retainBackBufferFromKeyframe;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldContinueLoading(long j8, long j9, float f8) {
        boolean z7 = true;
        boolean z8 = this.allocator.getTotalBytesAllocated() >= this.targetBufferBytes;
        long j10 = this.minBufferUs;
        if (f8 > 1.0f) {
            j10 = Math.min(Util.getMediaDurationForPlayoutDuration(j10, f8), this.maxBufferUs);
        }
        if (j9 < Math.max(j10, 500000L)) {
            if (!this.prioritizeTimeOverSizeThresholds && z8) {
                z7 = false;
            }
            this.isLoading = z7;
            if (!z7 && j9 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= this.maxBufferUs || z8) {
            this.isLoading = false;
        }
        return this.isLoading;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public /* synthetic */ boolean shouldStartPlayback(long j8, float f8, boolean z7, long j9) {
        return g2.c(this, j8, f8, z7, j9);
    }

    protected DefaultLoadControl(DefaultAllocator defaultAllocator, int i8, int i9, int i10, int i11, int i12, boolean z7, int i13, boolean z8) {
        assertGreaterOrEqual(i10, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i11, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i8, i10, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i8, i11, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i9, i8, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i13, 0, "backBufferDurationMs", "0");
        this.allocator = defaultAllocator;
        this.minBufferUs = Util.msToUs(i8);
        this.maxBufferUs = Util.msToUs(i9);
        this.bufferForPlaybackUs = Util.msToUs(i10);
        this.bufferForPlaybackAfterRebufferUs = Util.msToUs(i11);
        this.targetBufferBytesOverwrite = i12;
        this.targetBufferBytes = i12 == -1 ? 13107200 : i12;
        this.prioritizeTimeOverSizeThresholds = z7;
        this.backBufferDurationUs = Util.msToUs(i13);
        this.retainBackBufferFromKeyframe = z8;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onTracksSelected(Timeline timeline, MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        int i8 = this.targetBufferBytesOverwrite;
        if (i8 == -1) {
            i8 = calculateTargetBufferBytes(rendererArr, exoTrackSelectionArr);
        }
        this.targetBufferBytes = i8;
        this.allocator.setTargetBufferSize(i8);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldStartPlayback(Timeline timeline, MediaPeriodId mediaPeriodId, long j8, float f8, boolean z7, long j9) {
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(j8, f8);
        long j10 = z7 ? this.bufferForPlaybackAfterRebufferUs : this.bufferForPlaybackUs;
        if (j9 != C.TIME_UNSET) {
            j10 = Math.min(j9 / 2, j10);
        }
        return j10 <= 0 || playoutDurationForMediaDuration >= j10 || (!this.prioritizeTimeOverSizeThresholds && this.allocator.getTotalBytesAllocated() >= this.targetBufferBytes);
    }
}
