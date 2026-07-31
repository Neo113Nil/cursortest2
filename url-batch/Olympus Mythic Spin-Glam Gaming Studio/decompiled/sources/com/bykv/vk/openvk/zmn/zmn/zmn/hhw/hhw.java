package com.bykv.vk.openvk.zmn.zmn.zmn.hhw;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class hhw implements SurfaceHolder.Callback {
    private final WeakReference<SurfaceHolder.Callback> zmn;

    public hhw(SurfaceHolder.Callback callback) {
        this.zmn = new WeakReference<>(callback);
    }

    public SurfaceHolder.Callback zmn() {
        return this.zmn.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.zmn.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.zmn.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.zmn.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
