package io.flutter.view;

import android.view.Surface;
import b.InterfaceC0163a;

@InterfaceC0163a
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceProducer {
    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(p pVar);

    void setSize(int i2, int i3);
}
