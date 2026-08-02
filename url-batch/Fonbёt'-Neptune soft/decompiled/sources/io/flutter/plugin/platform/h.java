package io.flutter.plugin.platform;

import android.view.Surface;

/* loaded from: classes.dex */
public interface h {
    long a();

    void b(int i2, int i3);

    int getHeight();

    Surface getSurface();

    int getWidth();

    void release();

    void scheduleFrame();
}
