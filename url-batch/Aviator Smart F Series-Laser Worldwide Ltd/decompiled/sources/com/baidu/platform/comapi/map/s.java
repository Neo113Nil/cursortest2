package com.baidu.platform.comapi.map;

import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import com.baidu.platform.comapi.map.t;

/* loaded from: classes2.dex */
interface s extends SurfaceHolder.Callback2 {
    Bitmap captureImageFromSurface(int i8, int i9, int i10, int i11, Object obj, Bitmap.Config config);

    int getDebugFlags();

    int getFPS();

    int getRenderMode();

    t.a getViewType();

    void onAttachedToWindow();

    void onDetachedFromWindow();

    void onPause();

    void onResume();

    void queueEvent(Runnable runnable);

    void requestRender();

    void setDebugFlags(int i8);

    void setFPS(int i8);

    void setRenderMode(int i8);

    void setRenderer(SurfaceRenderer surfaceRenderer);
}
