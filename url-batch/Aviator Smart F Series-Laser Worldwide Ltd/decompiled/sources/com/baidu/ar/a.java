package com.baidu.ar;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.baidu.ar.arrender.FrameRenderListener;
import com.baidu.ar.arrender.IGLRenderer;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.i1;
import com.baidu.ar.marker.IMarker;
import com.baidu.ar.marker.MarkerFrameInfo;

/* loaded from: classes.dex */
public class a implements FrameRenderListener, SurfaceTexture.OnFrameAvailableListener, i1.a {

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f1619a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f1620b;

    /* renamed from: c, reason: collision with root package name */
    public IGLRenderer f1621c;

    /* renamed from: d, reason: collision with root package name */
    public IMarker f1622d;

    /* renamed from: e, reason: collision with root package name */
    public GLSurfaceView f1623e;

    /* renamed from: f, reason: collision with root package name */
    public OnFrmeTrackingStateCallback f1624f;

    /* renamed from: g, reason: collision with root package name */
    public i1 f1625g;

    /* renamed from: com.baidu.ar.a$a, reason: collision with other inner class name */
    public class HandlerC0028a extends Handler {
        public HandlerC0028a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1001) {
                return;
            }
            if (a.this.f1620b != null) {
                a.this.f1620b.removeMessages(1001);
                Message message2 = new Message();
                message2.what = 1001;
                a.this.f1620b.sendMessageDelayed(message2, 33L);
            }
            if (a.this.f1621c != null) {
                a.this.f1621c.render();
            }
            if (a.this.f1623e != null) {
                a.this.f1623e.requestRender();
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        GLSurfaceView gLSurfaceView = this.f1623e;
        if (gLSurfaceView != null) {
            gLSurfaceView.requestRender();
        }
    }

    @Override // com.baidu.ar.arrender.FrameRenderListener
    public void onRenderFinished(long j8) {
        Log.d("AREngineManager", "onRenderFinished timestamp = " + j8);
    }

    @Override // com.baidu.ar.arrender.FrameRenderListener
    public void onRenderStarted(long j8) {
        Log.d("AREngineManager", "onRenderStarted timestamp = " + j8);
        i1 i1Var = this.f1625g;
        if (i1Var != null) {
            i1Var.a();
        }
    }

    public void a() {
        Log.d("AREngineManager", "pause()!!!");
        i1 i1Var = this.f1625g;
        if (i1Var != null) {
            i1Var.b();
        }
        Handler handler = this.f1620b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void b() {
        Log.d("AREngineManager", "release()!!!");
        Handler handler = this.f1620b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f1620b = null;
        }
        HandlerThread handlerThread = this.f1619a;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f1619a = null;
        }
        i1 i1Var = this.f1625g;
        if (i1Var != null) {
            i1Var.c();
        }
        this.f1621c = null;
        this.f1623e = null;
    }

    public void c() {
        Log.d("AREngineManager", "resume()!!!");
        i1 i1Var = this.f1625g;
        if (i1Var != null) {
            i1Var.d();
        }
        if (this.f1620b != null) {
            Message message = new Message();
            message.what = 1001;
            this.f1620b.sendMessage(message);
        }
    }

    @Override // com.baidu.ar.i1.a
    public void a(int i8, float[] fArr, float f8, float[] fArr2, float[] fArr3) {
        if (this.f1622d == null) {
            return;
        }
        MarkerFrameInfo markerFrameInfo = new MarkerFrameInfo();
        markerFrameInfo.setFps(30);
        markerFrameInfo.setPoseMat(fArr2);
        markerFrameInfo.setOrignalTransform(fArr3);
        markerFrameInfo.setTrackingState(i8);
        markerFrameInfo.setIntrinsics(fArr);
        markerFrameInfo.setScaleY(f8);
        markerFrameInfo.setDistort(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        markerFrameInfo.setMagnet(new double[]{-1.0d, -1.0d, -1.0d});
        this.f1622d.setAvailableFrame(markerFrameInfo);
        OnFrmeTrackingStateCallback onFrmeTrackingStateCallback = this.f1624f;
        if (onFrmeTrackingStateCallback != null) {
            onFrmeTrackingStateCallback.onTrackingState(i8);
        }
    }

    public void a(Context context, int i8, int i9, NavigationType navigationType, boolean z7) {
        i1 dVar;
        h.a("AREngineManager", "setup width * height = " + i8 + " * " + i9);
        if (navigationType == NavigationType.AREngine) {
            dVar = new e((Activity) context);
        } else if (navigationType != NavigationType.ARCore) {
            return;
        } else {
            dVar = new d((Activity) context);
        }
        this.f1625g = dVar;
        this.f1625g.a(this);
        this.f1625g.a(z7);
        HandlerThread handlerThread = new HandlerThread("AREngineManager");
        this.f1619a = handlerThread;
        handlerThread.start();
        this.f1620b = new HandlerC0028a(this.f1619a.getLooper());
    }

    public void a(GLSurfaceView gLSurfaceView) {
        this.f1623e = gLSurfaceView;
    }

    public void a(OnFrmeTrackingStateCallback onFrmeTrackingStateCallback) {
        this.f1624f = onFrmeTrackingStateCallback;
    }

    public void a(IGLRenderer iGLRenderer) {
        this.f1621c = iGLRenderer;
    }

    public void a(Texture texture) {
        Log.d("AREngineManager", "setCameraTexture() texture.getId() = " + texture.getId());
        i1 i1Var = this.f1625g;
        if (i1Var != null) {
            i1Var.a(texture);
        }
    }

    public void a(IMarker iMarker) {
        this.f1622d = iMarker;
    }
}
