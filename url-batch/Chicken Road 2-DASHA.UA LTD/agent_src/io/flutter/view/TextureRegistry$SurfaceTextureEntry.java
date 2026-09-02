package io.flutter.view;

import android.graphics.SurfaceTexture;

/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    default void setOnFrameConsumedListener(n nVar) {
    }

    default void setOnTrimMemoryListener(o oVar) {
    }

    SurfaceTexture surfaceTexture();
}
