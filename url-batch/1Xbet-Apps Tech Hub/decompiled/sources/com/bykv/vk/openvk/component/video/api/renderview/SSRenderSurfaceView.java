package com.bykv.vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.component.video.api.renderview.icD;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SSRenderSurfaceView extends SSSurfaceView implements SurfaceHolder.Callback, icD {
    private static final ArrayList<vG> vG = new ArrayList<>();
    private icD.pvs Jd;
    private vG icD;
    private WeakReference<pvs> pvs;

    @Override // com.bykv.vk.openvk.component.video.api.renderview.icD
    public View getView() {
        return this;
    }

    public SSRenderSurfaceView(Context context) {
        super(context);
        pvs();
    }

    private void pvs() {
        vG vGVar = new vG(this);
        this.icD = vGVar;
        vG.add(vGVar);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.icD
    public void pvs(pvs pvsVar) {
        this.pvs = new WeakReference<>(pvsVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<vG> it = vG.iterator();
        while (it.hasNext()) {
            vG next = it.next();
            if (next != null && next.pvs() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.icD);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.icD
    public void pvs(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<pvs> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().pvs(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference<pvs> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().pvs(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<pvs> weakReference = this.pvs;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.pvs.get().icD(surfaceHolder);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(icD.pvs pvsVar) {
        this.Jd = pvsVar;
    }
}
