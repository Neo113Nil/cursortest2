package io.flutter.view;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    SurfaceTexture surfaceTexture();

    default void setOnFrameConsumedListener(o oVar) {
    }

    default void setOnTrimMemoryListener(p pVar) {
    }
}
