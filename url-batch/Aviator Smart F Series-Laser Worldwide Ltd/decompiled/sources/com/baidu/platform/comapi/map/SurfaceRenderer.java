package com.baidu.platform.comapi.map;

import android.view.SurfaceHolder;

/* loaded from: classes2.dex */
public interface SurfaceRenderer {
    void onDrawFrame(Object obj);

    void onSurfaceChanged(int i8, int i9);

    void onSurfaceCreated(SurfaceHolder surfaceHolder, int i8, int i9, int i10);

    void onSurfaceDestroyed(SurfaceHolder surfaceHolder);
}
