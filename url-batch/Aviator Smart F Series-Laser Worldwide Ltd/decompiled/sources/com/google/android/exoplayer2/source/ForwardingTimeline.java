package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Timeline;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ForwardingTimeline extends Timeline {
    protected final Timeline timeline;

    public ForwardingTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean z7) {
        return this.timeline.getFirstWindowIndex(z7);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return this.timeline.getIndexOfPeriod(obj);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean z7) {
        return this.timeline.getLastWindowIndex(z7);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int i8, int i9, boolean z7) {
        return this.timeline.getNextWindowIndex(i8, i9, z7);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i8, Timeline.Period period, boolean z7) {
        return this.timeline.getPeriod(i8, period, z7);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return this.timeline.getPeriodCount();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int i8, int i9, boolean z7) {
        return this.timeline.getPreviousWindowIndex(i8, i9, z7);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object getUidOfPeriod(int i8) {
        return this.timeline.getUidOfPeriod(i8);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Window getWindow(int i8, Timeline.Window window, long j8) {
        return this.timeline.getWindow(i8, window, j8);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return this.timeline.getWindowCount();
    }
}
