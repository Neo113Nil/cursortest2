package com.google.android.exoplayer2.text;

import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public interface Subtitle {
    List<Cue> getCues(long j8);

    long getEventTime(int i8);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j8);
}
