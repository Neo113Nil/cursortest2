package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
        ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelection[] trackSelectionArr) {
        List[] listArr = new List[trackSelectionArr.length];
        for (int i8 = 0; i8 < trackSelectionArr.length; i8++) {
            TrackSelection trackSelection = trackSelectionArr[i8];
            listArr[i8] = trackSelection != null ? ImmutableList.of(trackSelection) : ImmutableList.of();
        }
        return buildTracks(mappedTrackInfo, (List<? extends TrackSelection>[]) listArr);
    }

    public static LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (exoTrackSelection.isTrackExcluded(i9, elapsedRealtime)) {
                i8++;
            }
        }
        return new LoadErrorHandlingPolicy.FallbackOptions(1, 0, length, i8);
    }

    public static ExoTrackSelection[] createTrackSelectionsForDefinitions(ExoTrackSelection.Definition[] definitionArr, AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        boolean z7 = false;
        for (int i8 = 0; i8 < definitionArr.length; i8++) {
            ExoTrackSelection.Definition definition = definitionArr[i8];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length <= 1 || z7) {
                    exoTrackSelectionArr[i8] = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                } else {
                    exoTrackSelectionArr[i8] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z7 = true;
                }
            }
        }
        return exoTrackSelectionArr;
    }

    public static DefaultTrackSelector.Parameters updateParametersWithOverride(DefaultTrackSelector.Parameters parameters, int i8, TrackGroupArray trackGroupArray, boolean z7, @Nullable DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.Parameters.Builder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i8).setRendererDisabled(i8, z7);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i8, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }

    public static Tracks buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, List<? extends TrackSelection>[] listArr) {
        boolean z7;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i8 = 0; i8 < mappedTrackInfo.getRendererCount(); i8++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i8);
            List<? extends TrackSelection> list = listArr[i8];
            for (int i9 = 0; i9 < trackGroups.length; i9++) {
                TrackGroup trackGroup = trackGroups.get(i9);
                boolean z8 = mappedTrackInfo.getAdaptiveSupport(i8, i9, false) != 0;
                int i10 = trackGroup.length;
                int[] iArr = new int[i10];
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 < trackGroup.length; i11++) {
                    iArr[i11] = mappedTrackInfo.getTrackSupport(i8, i9, i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            z7 = false;
                            break;
                        }
                        TrackSelection trackSelection = list.get(i12);
                        if (trackSelection.getTrackGroup().equals(trackGroup) && trackSelection.indexOf(i11) != -1) {
                            z7 = true;
                            break;
                        }
                        i12++;
                    }
                    zArr[i11] = z7;
                }
                builder.add((ImmutableList.Builder) new Tracks.Group(trackGroup, z8, iArr, zArr));
            }
        }
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i13 = 0; i13 < unmappedTrackGroups.length; i13++) {
            TrackGroup trackGroup2 = unmappedTrackGroups.get(i13);
            int[] iArr2 = new int[trackGroup2.length];
            Arrays.fill(iArr2, 0);
            builder.add((ImmutableList.Builder) new Tracks.Group(trackGroup2, false, iArr2, new boolean[trackGroup2.length]));
        }
        return new Tracks(builder.build());
    }
}
