package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class DashManifest implements FilterableManifest<DashManifest> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;

    @Nullable
    public final Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final List<Period> periods;

    @Nullable
    public final ProgramInformation programInformation;
    public final long publishTimeMs;

    @Nullable
    public final ServiceDescriptionElement serviceDescription;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;

    @Nullable
    public final UtcTimingElement utcTiming;

    public DashManifest(long j8, long j9, long j10, boolean z7, long j11, long j12, long j13, long j14, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable ServiceDescriptionElement serviceDescriptionElement, @Nullable Uri uri, List<Period> list) {
        this.availabilityStartTimeMs = j8;
        this.durationMs = j9;
        this.minBufferTimeMs = j10;
        this.dynamic = z7;
        this.minUpdatePeriodMs = j11;
        this.timeShiftBufferDepthMs = j12;
        this.suggestedPresentationDelayMs = j13;
        this.publishTimeMs = j14;
        this.programInformation = programInformation;
        this.utcTiming = utcTimingElement;
        this.location = uri;
        this.serviceDescription = serviceDescriptionElement;
        this.periods = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<AdaptationSet> copyAdaptationSets(List<AdaptationSet> list, LinkedList<StreamKey> linkedList) {
        StreamKey poll = linkedList.poll();
        int i8 = poll.periodIndex;
        ArrayList<AdaptationSet> arrayList = new ArrayList<>();
        do {
            int i9 = poll.groupIndex;
            AdaptationSet adaptationSet = list.get(i9);
            List<Representation> list2 = adaptationSet.representations;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.streamIndex));
                poll = linkedList.poll();
                if (poll.periodIndex != i8) {
                    break;
                }
            } while (poll.groupIndex == i9);
            arrayList.add(new AdaptationSet(adaptationSet.id, adaptationSet.type, arrayList2, adaptationSet.accessibilityDescriptors, adaptationSet.essentialProperties, adaptationSet.supplementalProperties));
        } while (poll.periodIndex == i8);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public /* bridge */ /* synthetic */ DashManifest copy(List list) {
        return copy((List<StreamKey>) list);
    }

    public final Period getPeriod(int i8) {
        return this.periods.get(i8);
    }

    public final int getPeriodCount() {
        return this.periods.size();
    }

    public final long getPeriodDurationMs(int i8) {
        long j8;
        long j9;
        if (i8 == this.periods.size() - 1) {
            j8 = this.durationMs;
            if (j8 == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            j9 = this.periods.get(i8).startMs;
        } else {
            j8 = this.periods.get(i8 + 1).startMs;
            j9 = this.periods.get(i8).startMs;
        }
        return j8 - j9;
    }

    public final long getPeriodDurationUs(int i8) {
        return Util.msToUs(getPeriodDurationMs(i8));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public final DashManifest copy(List<StreamKey> list) {
        long j8;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        int i8 = 0;
        while (true) {
            int periodCount = getPeriodCount();
            j8 = C.TIME_UNSET;
            if (i8 >= periodCount) {
                break;
            }
            if (((StreamKey) linkedList.peek()).periodIndex != i8) {
                long periodDurationMs = getPeriodDurationMs(i8);
                if (periodDurationMs != C.TIME_UNSET) {
                    j9 += periodDurationMs;
                }
            } else {
                Period period = getPeriod(i8);
                arrayList.add(new Period(period.id, period.startMs - j9, copyAdaptationSets(period.adaptationSets, linkedList), period.eventStreams));
            }
            i8++;
        }
        long j10 = this.durationMs;
        if (j10 != C.TIME_UNSET) {
            j8 = j10 - j9;
        }
        return new DashManifest(this.availabilityStartTimeMs, j8, this.minBufferTimeMs, this.dynamic, this.minUpdatePeriodMs, this.timeShiftBufferDepthMs, this.suggestedPresentationDelayMs, this.publishTimeMs, this.programInformation, this.utcTiming, this.serviceDescription, this.location, arrayList);
    }
}
