package com.bykv.vk.openvk.component.video.api.renderview;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* compiled from: WeakSurfaceCallback.java */
/* loaded from: classes.dex */
public class vG implements SurfaceHolder.Callback {
    private final WeakReference<SurfaceHolder.Callback> pvs;

    public vG(SurfaceHolder.Callback callback) {
        this.pvs = new WeakReference<>(callback);
    }

    public SurfaceHolder.Callback pvs() {
        return this.pvs.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.pvs.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.pvs.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.pvs.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
