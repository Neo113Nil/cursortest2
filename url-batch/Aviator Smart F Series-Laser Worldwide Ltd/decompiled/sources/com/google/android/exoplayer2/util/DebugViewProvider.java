package com.google.android.exoplayer2.util;

import android.view.SurfaceView;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes3.dex */
public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new DebugViewProvider() { // from class: com.google.android.exoplayer2.util.c
        @Override // com.google.android.exoplayer2.util.DebugViewProvider
        public final SurfaceView getDebugPreviewSurfaceView(int i8, int i9) {
            return d.a(i8, i9);
        }
    };

    @Nullable
    SurfaceView getDebugPreviewSurfaceView(int i8, int i9);
}
