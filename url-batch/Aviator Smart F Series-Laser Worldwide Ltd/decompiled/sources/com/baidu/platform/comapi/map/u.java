package com.baidu.platform.comapi.map;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.baidu.platform.comapi.map.t;

/* loaded from: classes2.dex */
class u extends SurfaceView implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    protected s f9791a;

    public u(Context context) {
        super(context);
        a(context, t.a.OPENGL_ES, true);
    }

    protected void a(Context context, t.a aVar, boolean z7) {
        if (this.f9791a != null) {
            return;
        }
        this.f9791a = a(aVar, z7, context);
        getHolder().addCallback(this);
    }

    public Bitmap captureImageFromSurface(int i8, int i9, int i10, int i11, Object obj, Bitmap.Config config) {
        return this.f9791a.captureImageFromSurface(i8, i9, i10, i11, obj, config);
    }

    public int getDebugFlags() {
        return this.f9791a.getDebugFlags();
    }

    public s getRenderControl() {
        return this.f9791a;
    }

    public int getRenderMode() {
        return this.f9791a.getRenderMode();
    }

    public t.a getViewType() {
        s sVar = this.f9791a;
        return sVar != null ? sVar.getViewType() : t.a.AUTO;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9791a.onAttachedToWindow();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        this.f9791a.onDetachedFromWindow();
        super.onDetachedFromWindow();
    }

    public void onPause() {
        this.f9791a.onPause();
    }

    public void onResume() {
        this.f9791a.onResume();
    }

    public void queueEvent(Runnable runnable) {
        this.f9791a.queueEvent(runnable);
    }

    public void requestRender() {
        this.f9791a.requestRender();
    }

    public void setDebugFlags(int i8) {
        this.f9791a.setDebugFlags(i8);
    }

    public void setRenderMode(int i8) {
        this.f9791a.setRenderMode(i8);
    }

    public void setRenderer(SurfaceRenderer surfaceRenderer) {
        this.f9791a.setRenderer(surfaceRenderer);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        this.f9791a.surfaceChanged(surfaceHolder, i8, i9, i10);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f9791a.surfaceCreated(surfaceHolder);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f9791a.surfaceDestroyed(surfaceHolder);
    }

    @Deprecated
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @TargetApi(26)
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        this.f9791a.surfaceRedrawNeededAsync(surfaceHolder, runnable);
    }

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, t.a.OPENGL_ES, true);
    }

    protected s a(t.a aVar, boolean z7, Context context) {
        return t.a(this, aVar, z7, context);
    }

    public u(Context context, t.a aVar) {
        super(context);
        a(context, aVar, true);
    }

    public u(Context context, t.a aVar, boolean z7) {
        super(context);
        a(context, aVar, z7);
    }

    public u(Context context, boolean z7) {
        super(context);
        a(context, t.a.OPENGL_ES, z7);
    }
}
