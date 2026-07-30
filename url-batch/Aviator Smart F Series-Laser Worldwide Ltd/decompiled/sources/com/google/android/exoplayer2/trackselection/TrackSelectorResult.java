package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.util.Util;

@Deprecated
/* loaded from: classes3.dex */
public final class TrackSelectorResult {

    @Nullable
    public final Object info;
    public final int length;
    public final RendererConfiguration[] rendererConfigurations;
    public final ExoTrackSelection[] selections;
    public final Tracks tracks;

    @Deprecated
    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, @Nullable Object obj) {
        this(rendererConfigurationArr, exoTrackSelectionArr, Tracks.EMPTY, obj);
    }

    public boolean isEquivalent(@Nullable TrackSelectorResult trackSelectorResult) {
        if (trackSelectorResult == null || trackSelectorResult.selections.length != this.selections.length) {
            return false;
        }
        for (int i8 = 0; i8 < this.selections.length; i8++) {
            if (!isEquivalent(trackSelectorResult, i8)) {
                return false;
            }
        }
        return true;
    }

    public boolean isRendererEnabled(int i8) {
        return this.rendererConfigurations[i8] != null;
    }

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Tracks tracks, @Nullable Object obj) {
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.tracks = tracks;
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    public boolean isEquivalent(@Nullable TrackSelectorResult trackSelectorResult, int i8) {
        return trackSelectorResult != null && Util.areEqual(this.rendererConfigurations[i8], trackSelectorResult.rendererConfigurations[i8]) && Util.areEqual(this.selections[i8], trackSelectorResult.selections[i8]);
    }
}
