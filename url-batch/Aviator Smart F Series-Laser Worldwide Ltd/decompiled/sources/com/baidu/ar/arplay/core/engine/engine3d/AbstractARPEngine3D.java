package com.baidu.ar.arplay.core.engine.engine3d;

/* loaded from: classes.dex */
public abstract class AbstractARPEngine3D implements IARPEngine3D {
    public boolean mIsActiveByARPlayVersionCase = false;

    public abstract /* synthetic */ void destroy();

    public abstract /* synthetic */ void pause();

    public abstract /* synthetic */ void resume();

    public void setIsActiveByARPlayVersionCase(boolean z7) {
        this.mIsActiveByARPlayVersionCase = z7;
    }
}
