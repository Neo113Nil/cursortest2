package io.flutter.plugins.videoplayer.platformview;

import E0.e;
import a0.C0130F;
import a0.InterfaceC0151q;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.plugin.platform.PlatformView;

/* loaded from: classes.dex */
public final class PlatformVideoView implements PlatformView {
    private final SurfaceView surfaceView;

    public PlatformVideoView(Context context, InterfaceC0151q interfaceC0151q) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.surfaceView = surfaceView;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 28) {
            setupSurfaceWithCallback(interfaceC0151q);
            return;
        }
        if (i4 <= 25) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        C0130F c0130f = (C0130F) interfaceC0151q;
        c0130f.L();
        SurfaceHolder holder = surfaceView.getHolder();
        c0130f.L();
        if (holder == null) {
            c0130f.L();
            c0130f.C();
            c0130f.E(null);
            c0130f.A(0, 0);
            return;
        }
        c0130f.C();
        c0130f.f3867W = true;
        c0130f.f3866V = holder;
        holder.addCallback(c0130f.f3900x);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            c0130f.E(null);
            c0130f.A(0, 0);
        } else {
            c0130f.E(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            c0130f.A(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private void setupSurfaceWithCallback(final InterfaceC0151q interfaceC0151q) {
        this.surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: io.flutter.plugins.videoplayer.platformview.PlatformVideoView.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                ((C0130F) interfaceC0151q).F(surfaceHolder.getSurface());
                e eVar = (e) interfaceC0151q;
                eVar.getClass();
                eVar.g(((C0130F) eVar).m(), 1L);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                ((C0130F) interfaceC0151q).F(null);
            }
        });
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        this.surfaceView.getHolder().getSurface().release();
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public View getView() {
        return this.surfaceView;
    }
}
