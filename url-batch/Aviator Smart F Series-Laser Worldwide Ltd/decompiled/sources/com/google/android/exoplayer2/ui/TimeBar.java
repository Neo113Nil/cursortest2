package com.google.android.exoplayer2.ui;

import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public interface TimeBar {

    public interface OnScrubListener {
        void onScrubMove(TimeBar timeBar, long j8);

        void onScrubStart(TimeBar timeBar, long j8);

        void onScrubStop(TimeBar timeBar, long j8, boolean z7);
    }

    void addListener(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void removeListener(OnScrubListener onScrubListener);

    void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i8);

    void setBufferedPosition(long j8);

    void setDuration(long j8);

    void setEnabled(boolean z7);

    void setKeyCountIncrement(int i8);

    void setKeyTimeIncrement(long j8);

    void setPosition(long j8);
}
