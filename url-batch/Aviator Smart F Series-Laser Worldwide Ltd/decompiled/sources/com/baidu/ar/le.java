package com.baidu.ar;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.bean.Size;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public class le implements GLSurfaceView.Renderer {

    /* renamed from: a, reason: collision with root package name */
    public Texture f2739a;

    /* renamed from: b, reason: collision with root package name */
    public he f2740b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f2741c;

    /* renamed from: d, reason: collision with root package name */
    public float[] f2742d;

    /* renamed from: e, reason: collision with root package name */
    public he f2743e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f2744f;

    /* renamed from: g, reason: collision with root package name */
    public int f2745g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2746h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2747i = false;

    /* renamed from: j, reason: collision with root package name */
    public a f2748j;

    /* renamed from: k, reason: collision with root package name */
    public int f2749k;

    /* renamed from: l, reason: collision with root package name */
    public int f2750l;

    /* renamed from: m, reason: collision with root package name */
    public int f2751m;

    /* renamed from: n, reason: collision with root package name */
    public int f2752n;

    public interface a {
        void onDrawFrame();

        void onSurfaceChanged(int i8, int i9);

        void onSurfaceCreated(Texture texture);

        void onSurfaceCreated(Texture texture, SurfaceTexture surfaceTexture, int i8, int i9);
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
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glClear(16640);
        a aVar = this.f2748j;
        if (aVar != null) {
            aVar.onDrawFrame();
        }
        try {
            if (this.f2747i) {
                SurfaceTexture surfaceTexture = this.f2744f;
                if (surfaceTexture == null || this.f2745g <= -1) {
                    return;
                }
                surfaceTexture.updateTexImage();
                this.f2743e.a(null, null, this.f2745g, 0);
                return;
            }
            if (this.f2739a != null) {
                if (this.f2742d == null) {
                    float[] fArr = new float[16];
                    this.f2742d = fArr;
                    Matrix.setIdentityM(fArr, 0);
                    Matrix.scaleM(this.f2742d, 0, (((this.f2749k / a(this.f2750l, this.f2749k, this.f2751m, this.f2752n).getWidth()) - 1.0f) / 2.0f) + 1.0f, 1.0f, 1.0f);
                }
                if (this.f2741c == null) {
                    float[] fArr2 = new float[16];
                    this.f2741c = fArr2;
                    Matrix.setIdentityM(fArr2, 0);
                    Matrix.rotateM(this.f2741c, 0, 270.0f, 0.0f, 0.0f, 1.0f);
                    Matrix.translateM(this.f2741c, 0, -1.0f, 0.0f, 0.0f);
                }
                this.f2740b.a(this.f2742d, this.f2741c, this.f2739a.getId(), 0);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i8, int i9) {
        Log.d("VpasRenderer", "onSurfaceChanged() width * " + i8 + " * " + i9);
        GLES20.glViewport(0, 0, i8, i9);
        this.f2751m = i8;
        this.f2752n = i9;
        he heVar = this.f2740b;
        if (heVar != null) {
            heVar.a(i8, i9);
        }
        he heVar2 = this.f2743e;
        if (heVar2 != null) {
            heVar2.a(i8, i9);
        }
        a aVar = this.f2748j;
        if (aVar != null) {
            if (!this.f2746h) {
                aVar.onSurfaceChanged(i8, i9);
            } else {
                aVar.onSurfaceCreated(this.f2739a, this.f2744f, i8, i9);
                this.f2746h = false;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.d("VpasRenderer", "onSurfaceCreated()");
        this.f2739a = new Texture(a(36197), 36197);
        this.f2740b = new he(36197, 0);
        this.f2745g = a(36197);
        this.f2744f = new SurfaceTexture(this.f2745g);
        this.f2743e = new he(36197, 0);
        a aVar = this.f2748j;
        if (aVar != null) {
            aVar.onSurfaceCreated(this.f2739a);
        }
    }

    public final Size a(int i8, int i9, int i10, int i11) {
        Size size = new Size(i8, i9);
        if (i8 > 0 && i9 > 0 && i10 > 0 && i11 > 0) {
            float f8 = i8;
            float f9 = i9;
            float f10 = f8 / f9;
            float f11 = i10 / i11;
            if (f10 > f11) {
                size.setWidth((int) (f9 * f11));
                size.setHeight(i9);
            } else if (f10 < f11) {
                size.setWidth(i8);
                size.setHeight((int) (f8 / f11));
            }
        }
        return size;
    }

    public void a() {
        this.f2740b = null;
        this.f2743e = null;
        this.f2739a = null;
        SurfaceTexture surfaceTexture = this.f2744f;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f2744f = null;
        }
        this.f2741c = null;
        this.f2742d = null;
        this.f2748j = null;
    }

    public void a(int i8, int i9) {
        this.f2749k = i8;
        this.f2750l = i9;
    }

    public void a(a aVar) {
        this.f2748j = aVar;
    }

    public void a(boolean z7) {
        this.f2747i = z7;
    }
}
