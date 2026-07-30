package com.baidu.ar.camera;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public class DuMixRenderer implements GLSurfaceView.Renderer {

    /* renamed from: h, reason: collision with root package name */
    public static final String f1948h = "DuMixRenderer";

    /* renamed from: a, reason: collision with root package name */
    public SurfaceTexture f1949a;

    /* renamed from: c, reason: collision with root package name */
    public DuMixDrawer f1951c;

    /* renamed from: d, reason: collision with root package name */
    public SurfaceTexture f1952d;

    /* renamed from: f, reason: collision with root package name */
    public a f1954f;

    /* renamed from: b, reason: collision with root package name */
    public int f1950b = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f1953e = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1955g = true;

    public interface a {
        void a(SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2);

        void onSurfaceChanged(int i8, int i9);
    }

    public DuMixRenderer(a aVar) {
        this.f1954f = aVar;
    }

    public final int a(int i8) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i8, iArr[0]);
        GLES20.glTexParameterf(i8, 10241, 9729.0f);
        GLES20.glTexParameterf(i8, 10240, 9729.0f);
        GLES20.glTexParameteri(i8, 10242, 33071);
        GLES20.glTexParameteri(i8, 10243, 33071);
        return iArr[0];
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        a();
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glClear(16640);
        try {
            SurfaceTexture surfaceTexture = this.f1952d;
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
                float[] fArr = new float[16];
                this.f1952d.getTransformMatrix(fArr);
                this.f1951c.draw(fArr);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i8, int i9) {
        GLES20.glViewport(0, 0, i8, i9);
        a aVar = this.f1954f;
        if (aVar != null) {
            aVar.onSurfaceChanged(i8, i9);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f1950b = a(3553);
        this.f1949a = new SurfaceTexture(this.f1950b);
        this.f1953e = a(3553);
        this.f1952d = new SurfaceTexture(this.f1953e);
        this.f1951c = new DuMixDrawer(this.f1953e, 3553);
        a aVar = this.f1954f;
        if (aVar != null) {
            aVar.a(this.f1949a, this.f1952d);
        }
    }

    public void release() {
        this.f1951c = null;
        SurfaceTexture surfaceTexture = this.f1949a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f1949a = null;
        }
        SurfaceTexture surfaceTexture2 = this.f1952d;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f1952d = null;
        }
        this.f1954f = null;
    }

    public final void a() {
        if (this.f1955g) {
            try {
                this.f1952d.detachFromGLContext();
            } catch (Exception e8) {
                Log.e(f1948h, "onSurfaceChanged attachToGLContext error!!!");
                e8.printStackTrace();
            }
            try {
                this.f1949a.detachFromGLContext();
            } catch (Exception e9) {
                Log.e(f1948h, "onSurfaceChanged attachToGLContext error!!!");
                e9.printStackTrace();
            }
            try {
                this.f1952d.attachToGLContext(this.f1953e);
            } catch (Exception e10) {
                Log.e(f1948h, "onSurfaceChanged attachToGLContext error!!!");
                e10.printStackTrace();
            }
            this.f1955g = false;
        }
    }
}
