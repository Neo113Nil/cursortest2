package io.flutter.view;

import android.graphics.SurfaceTexture;

/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    default void setOnFrameConsumedListener(o oVar) {
    }

    default void setOnTrimMemoryListener(p pVar) {
    }

    SurfaceTexture surfaceTexture();
}
