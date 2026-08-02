package io.flutter.view;

import android.graphics.SurfaceTexture;
import b.InterfaceC0163a;

@InterfaceC0163a
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    void setOnFrameConsumedListener(n nVar);

    void setOnTrimMemoryListener(o oVar);

    SurfaceTexture surfaceTexture();
}
