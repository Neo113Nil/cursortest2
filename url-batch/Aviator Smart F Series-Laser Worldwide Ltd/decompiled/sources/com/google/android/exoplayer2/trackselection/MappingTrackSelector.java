package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

@Deprecated
/* loaded from: classes3.dex */
public abstract class MappingTrackSelector extends TrackSelector {

    @Nullable
    private MappedTrackInfo currentMappedTrackInfo;

    private static int findRenderer(RendererCapabilities[] rendererCapabilitiesArr, TrackGroup trackGroup, int[] iArr, boolean z7) {
        int length = rendererCapabilitiesArr.length;
        int i8 = 0;
        boolean z8 = true;
        for (int i9 = 0; i9 < rendererCapabilitiesArr.length; i9++) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i9];
            int i10 = 0;
            for (int i11 = 0; i11 < trackGroup.length; i11++) {
                i10 = Math.max(i10, n3.h(rendererCapabilities.supportsFormat(trackGroup.getFormat(i11))));
            }
            boolean z9 = iArr[i9] == 0;
            if (i10 > i8 || (i10 == i8 && z7 && !z8 && z9)) {
                length = i9;
                z8 = z9;
                i8 = i10;
            }
        }
        return length;
    }

    private static int[] getFormatSupport(RendererCapabilities rendererCapabilities, TrackGroup trackGroup) {
        int[] iArr = new int[trackGroup.length];
        for (int i8 = 0; i8 < trackGroup.length; i8++) {
            iArr[i8] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i8));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(RendererCapabilities[] rendererCapabilitiesArr) {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = rendererCapabilitiesArr[i8].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    @Nullable
    public final MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final void onSelectionActivated(@Nullable Object obj) {
        this.currentMappedTrackInfo = (MappedTrackInfo) obj;
    }

    protected abstract Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = trackGroupArray.length;
            trackGroupArr[i8] = new TrackGroup[i9];
            iArr2[i8] = new int[i9][];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i10 = 0; i10 < trackGroupArray.length; i10++) {
            TrackGroup trackGroup = trackGroupArray.get(i10);
            int findRenderer = findRenderer(rendererCapabilitiesArr, trackGroup, iArr, trackGroup.type == 5);
            int[] formatSupport = findRenderer == rendererCapabilitiesArr.length ? new int[trackGroup.length] : getFormatSupport(rendererCapabilitiesArr[findRenderer], trackGroup);
            int i11 = iArr[findRenderer];
            trackGroupArr[findRenderer][i11] = trackGroup;
            iArr2[findRenderer][i11] = formatSupport;
            iArr[findRenderer] = i11 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i12 = 0; i12 < rendererCapabilitiesArr.length; i12++) {
            int i13 = iArr[i12];
            trackGroupArrayArr[i12] = new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[i12], i13));
            iArr2[i12] = (int[][]) Util.nullSafeArrayCopy(iArr2[i12], i13);
            strArr[i12] = rendererCapabilitiesArr[i12].getName();
            iArr3[i12] = rendererCapabilitiesArr[i12].getTrackType();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(strArr, iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports, mediaPeriodId, timeline);
        return new TrackSelectorResult((RendererConfiguration[]) selectTracks.first, (ExoTrackSelection[]) selectTracks.second, TrackSelectionUtil.buildTracks(mappedTrackInfo, (TrackSelection[]) selectTracks.second), mappedTrackInfo);
    }

    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final String[] rendererNames;
        private final TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final TrackGroupArray unmappedTrackGroups;

        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        @VisibleForTesting
        MappedTrackInfo(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.rendererNames = strArr;
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            this.rendererCount = iArr.length;
        }

        public int getAdaptiveSupport(int i8, int i9, boolean z7) {
            int i10 = this.rendererTrackGroups[i8].get(i9).length;
            int[] iArr = new int[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                int trackSupport = getTrackSupport(i8, i9, i12);
                if (trackSupport == 4 || (z7 && trackSupport == 3)) {
                    iArr[i11] = i12;
                    i11++;
                }
            }
            return getAdaptiveSupport(i8, i9, Arrays.copyOf(iArr, i11));
        }

        public int getCapabilities(int i8, int i9, int i10) {
            return this.rendererFormatSupports[i8][i9][i10];
        }

        public int getRendererCount() {
            return this.rendererCount;
        }

        public String getRendererName(int i8) {
            return this.rendererNames[i8];
        }

        public int getRendererSupport(int i8) {
            int i9 = 0;
            for (int[] iArr : this.rendererFormatSupports[i8]) {
                for (int i10 : iArr) {
                    int h8 = n3.h(i10);
                    int i11 = 1;
                    if (h8 != 0 && h8 != 1 && h8 != 2) {
                        if (h8 != 3) {
                            if (h8 == 4) {
                                return 3;
                            }
                            throw new IllegalStateException();
                        }
                        i11 = 2;
                    }
                    i9 = Math.max(i9, i11);
                }
            }
            return i9;
        }

        public int getRendererType(int i8) {
            return this.rendererTrackTypes[i8];
        }

        public TrackGroupArray getTrackGroups(int i8) {
            return this.rendererTrackGroups[i8];
        }

        public int getTrackSupport(int i8, int i9, int i10) {
            return n3.h(getCapabilities(i8, i9, i10));
        }

        public int getTypeSupport(int i8) {
            int i9 = 0;
            for (int i10 = 0; i10 < this.rendererCount; i10++) {
                if (this.rendererTrackTypes[i10] == i8) {
                    i9 = Math.max(i9, getRendererSupport(i10));
                }
            }
            return i9;
        }

        public TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }

        public int getAdaptiveSupport(int i8, int i9, int[] iArr) {
            int i10 = 0;
            String str = null;
            boolean z7 = false;
            int i11 = 0;
            int i12 = 16;
            while (i10 < iArr.length) {
                String str2 = this.rendererTrackGroups[i8].get(i9).getFormat(iArr[i10]).sampleMimeType;
                int i13 = i11 + 1;
                if (i11 == 0) {
                    str = str2;
                } else {
                    z7 |= !Util.areEqual(str, str2);
                }
                i12 = Math.min(i12, n3.f(this.rendererFormatSupports[i8][i9][i10]));
                i10++;
                i11 = i13;
            }
            return z7 ? Math.min(i12, this.rendererMixedMimeTypeAdaptiveSupports[i8]) : i12;
        }
    }
}
