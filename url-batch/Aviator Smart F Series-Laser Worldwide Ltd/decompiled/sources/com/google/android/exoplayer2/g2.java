package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class g2 {
    public static void a(LoadControl loadControl, Timeline timeline, MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        loadControl.onTracksSelected(rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    public static void b(LoadControl loadControl, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        loadControl.onTracksSelected(Timeline.EMPTY, LoadControl.EMPTY_MEDIA_PERIOD_ID, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    public static boolean c(LoadControl loadControl, long j8, float f8, boolean z7, long j9) {
        return loadControl.shouldStartPlayback(Timeline.EMPTY, LoadControl.EMPTY_MEDIA_PERIOD_ID, j8, f8, z7, j9);
    }

    public static boolean d(LoadControl loadControl, Timeline timeline, MediaPeriodId mediaPeriodId, long j8, float f8, boolean z7, long j9) {
        return loadControl.shouldStartPlayback(j8, f8, z7, j9);
    }
}
