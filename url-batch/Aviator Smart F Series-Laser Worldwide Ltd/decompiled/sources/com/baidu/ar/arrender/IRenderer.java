package com.baidu.ar.arrender;

import com.baidu.ar.DuMixOutput;
import com.baidu.ar.DuMixStateListener;
import com.baidu.ar.r1;

/* loaded from: classes.dex */
interface IRenderer {
    void addFrameRenderListener(FrameRenderListener frameRenderListener);

    void addOutputSurface(DuMixOutput duMixOutput);

    void cancelAysncRenderTask(Runnable runnable);

    void removeFrameRenderListener(FrameRenderListener frameRenderListener);

    void removeOutputSurface(DuMixOutput duMixOutput);

    void render();

    void runAsyncOnRenderContext(Runnable runnable);

    void runSyncOnRenderContext(Runnable runnable);

    void setCameraSwitchListener(r1 r1Var);

    void setDefaultPipeLine(String str);

    void setInputMatrix(float[] fArr);

    void setStateListener(DuMixStateListener duMixStateListener);
}
