package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class Period {
    public final List<AdaptationSet> adaptationSets;

    @Nullable
    public final Descriptor assetIdentifier;
    public final List<EventStream> eventStreams;

    @Nullable
    public final String id;
    public final long startMs;

    public Period(@Nullable String str, long j8, List<AdaptationSet> list) {
        this(str, j8, list, Collections.emptyList(), null);
    }

    public int getAdaptationSetIndex(int i8) {
        int size = this.adaptationSets.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (this.adaptationSets.get(i9).type == i8) {
                return i9;
            }
        }
        return -1;
    }

    public Period(@Nullable String str, long j8, List<AdaptationSet> list, List<EventStream> list2) {
        this(str, j8, list, list2, null);
    }

    public Period(@Nullable String str, long j8, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        this.id = str;
        this.startMs = j8;
        this.adaptationSets = Collections.unmodifiableList(list);
        this.eventStreams = Collections.unmodifiableList(list2);
        this.assetIdentifier = descriptor;
    }
}
