package com.bykv.vk.openvk.zmn.zmn.zmn.hhw;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs;

/* loaded from: classes15.dex */
public class fb extends TextureView implements TextureView.SurfaceTextureListener, fs {
    private fs.zmn fs;
    private zmn zmn;

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public fb(Context context) {
        this(context, null);
    }

    public fb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs
    public void zmn(zmn zmnVar) {
        this.zmn = zmnVar;
        setSurfaceTextureListener(this);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.hhw.fs
    public void zmn(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.zmn(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            return zmnVar.zmn(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            zmnVar.fs(surfaceTexture);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(fs.zmn zmnVar) {
        this.fs = zmnVar;
    }
}
