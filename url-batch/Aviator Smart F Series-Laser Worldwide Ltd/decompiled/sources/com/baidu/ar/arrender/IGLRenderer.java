package com.baidu.ar.arrender;

import android.view.Surface;

/* loaded from: classes.dex */
public interface IGLRenderer extends IRenderer {
    void bindTargetSurface(Surface surface);

    Texture createTexture(int i8, int i9, int i10);

    void destroyTexture(Texture texture);

    @Override // com.baidu.ar.arrender.IRenderer
    /* synthetic */ void render();

    void runSyncOnIOContext(Runnable runnable);

    void setInputTexture(int i8, int i9, int i10, int i11);

    void swapBuffer();
}
