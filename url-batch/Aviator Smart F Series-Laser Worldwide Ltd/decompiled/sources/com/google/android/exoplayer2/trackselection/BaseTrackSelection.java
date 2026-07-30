package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {
    private final long[] excludeUntilTimes;
    private final Format[] formats;
    protected final TrackGroup group;
    private int hashCode;
    protected final int length;
    protected final int[] tracks;
    private final int type;

    public BaseTrackSelection(TrackGroup trackGroup, int... iArr) {
        this(trackGroup, iArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(Format format, Format format2) {
        return format2.bitrate - format.bitrate;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
        return this.group == baseTrackSelection.group && Arrays.equals(this.tracks, baseTrackSelection.tracks);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j8, List<? extends MediaChunk> list) {
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean excludeTrack(int i8, long j8) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isTrackExcluded = isTrackExcluded(i8, elapsedRealtime);
        int i9 = 0;
        while (i9 < this.length && !isTrackExcluded) {
            isTrackExcluded = (i9 == i8 || isTrackExcluded(i9, elapsedRealtime)) ? false : true;
            i9++;
        }
        if (!isTrackExcluded) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        jArr[i8] = Math.max(jArr[i8], Util.addWithOverflowDefault(elapsedRealtime, j8, Long.MAX_VALUE));
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final Format getFormat(int i8) {
        return this.formats[i8];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int i8) {
        return this.tracks[i8];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ long getLatestBitrateEstimate() {
        return v.a(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = (System.identityHashCode(this.group) * 31) + Arrays.hashCode(this.tracks);
        }
        return this.hashCode;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i8 = 0; i8 < this.length; i8++) {
            if (this.formats[i8] == format) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean isTrackExcluded(int i8, long j8) {
        return this.excludeUntilTimes[i8] > j8;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onDiscontinuity() {
        v.b(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z7) {
        v.c(this, z7);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f8) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onRebuffer() {
        v.d(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ boolean shouldCancelChunkLoad(long j8, Chunk chunk, List list) {
        return v.e(this, j8, chunk, list);
    }

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr, int i8) {
        int i9 = 0;
        Assertions.checkState(iArr.length > 0);
        this.type = i8;
        this.group = (TrackGroup) Assertions.checkNotNull(trackGroup);
        int length = iArr.length;
        this.length = length;
        this.formats = new Format[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.formats[i10] = trackGroup.getFormat(iArr[i10]);
        }
        Arrays.sort(this.formats, new Comparator() { // from class: com.google.android.exoplayer2.trackselection.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$new$0;
                lambda$new$0 = BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
                return lambda$new$0;
            }
        });
        this.tracks = new int[this.length];
        while (true) {
            int i11 = this.length;
            if (i9 >= i11) {
                this.excludeUntilTimes = new long[i11];
                return;
            } else {
                this.tracks[i9] = trackGroup.indexOf(this.formats[i9]);
                i9++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int i8) {
        for (int i9 = 0; i9 < this.length; i9++) {
            if (this.tracks[i9] == i8) {
                return i9;
            }
        }
        return -1;
    }
}
