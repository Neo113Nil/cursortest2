package com.google.android.exoplayer2;

import com.google.android.exoplayer2.MediaItem;

@Deprecated
/* loaded from: classes3.dex */
public interface LivePlaybackSpeedControl {
    float getAdjustedPlaybackSpeed(long j8, long j9);

    long getTargetLiveOffsetUs();

    void notifyRebuffer();

    void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration);

    void setTargetLiveOffsetOverrideUs(long j8);
}
