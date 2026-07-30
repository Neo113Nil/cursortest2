package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackParameters;

@Deprecated
/* loaded from: classes3.dex */
public interface AudioProcessorChain {
    PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

    boolean applySkipSilenceEnabled(boolean z7);

    AudioProcessor[] getAudioProcessors();

    long getMediaDuration(long j8);

    long getSkippedOutputFrameCount();
}
