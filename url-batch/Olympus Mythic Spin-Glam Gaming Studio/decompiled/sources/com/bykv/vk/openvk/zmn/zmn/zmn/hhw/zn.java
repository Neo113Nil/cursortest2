package com.bykv.vk.openvk.zmn.zmn.zmn.hhw;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class zn extends btk implements SurfaceHolder.Callback, fs {
    private static final ArrayList<hhw> zn = new ArrayList<>();
    private fs.zmn fb;
    private hhw fs;
    private WeakReference<zmn> zmn;

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs
    public View getView() {
        return this;
    }

    public zn(Context context) {
        super(context);
        zmn();
    }

    private void zmn() {
        hhw hhwVar = new hhw(this);
        this.fs = hhwVar;
        zn.add(hhwVar);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs
    public void zmn(zmn zmnVar) {
        this.zmn = new WeakReference<>(zmnVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<hhw> it = zn.iterator();
        while (it.hasNext()) {
            hhw next = it.next();
            if (next != null && next.zmn() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.fs);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs
    public void zmn(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<zmn> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().zmn(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference<zmn> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().zmn(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<zmn> weakReference = this.zmn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.zmn.get().fs(surfaceHolder);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(fs.zmn zmnVar) {
        this.fb = zmnVar;
    }
}
