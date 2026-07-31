package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.yandex.mobile.ads.impl.ff1;
import com.yandex.mobile.ads.impl.i52;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public final class f12 extends GLSurfaceView {

    /* renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f25557a;

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f25558b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f25559c;

    /* renamed from: d, reason: collision with root package name */
    private final ff1 f25560d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f25561e;

    /* renamed from: f, reason: collision with root package name */
    private final ht1 f25562f;

    /* renamed from: g, reason: collision with root package name */
    private SurfaceTexture f25563g;

    /* renamed from: h, reason: collision with root package name */
    private Surface f25564h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f25565i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f25566j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25567k;

    public interface b {
        void a(Surface surface);

        void b();
    }

    public f12(Context context) {
        this(context, null);
    }

    private void d() {
        boolean z4 = this.f25565i && this.f25566j;
        Sensor sensor = this.f25559c;
        if (sensor == null || z4 == this.f25567k) {
            return;
        }
        if (z4) {
            this.f25558b.registerListener(this.f25560d, sensor, 0);
        } else {
            this.f25558b.unregisterListener(this.f25560d);
        }
        this.f25567k = z4;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25561e.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.F2
            @Override // java.lang.Runnable
            public final void run() {
                f12.this.c();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f25566j = false;
        d();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f25566j = true;
        d();
    }

    public void setDefaultStereoMode(int i4) {
        this.f25562f.a(i4);
    }

    public void setUseSensorRotation(boolean z4) {
        this.f25565i = z4;
        d();
    }

    public f12(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25557a = new CopyOnWriteArrayList<>();
        this.f25561e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C2253tf.a(context.getSystemService("sensor"));
        this.f25558b = sensorManager;
        Sensor defaultSensor = u82.f32873a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f25559c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        ht1 ht1Var = new ht1();
        this.f25562f = ht1Var;
        a aVar = new a(ht1Var);
        View.OnTouchListener i52Var = new i52(context, aVar);
        this.f25560d = new ff1(((WindowManager) C2253tf.a((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), i52Var, aVar);
        this.f25565i = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(i52Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Surface surface = this.f25564h;
        if (surface != null) {
            Iterator<b> it = this.f25557a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
        SurfaceTexture surfaceTexture = this.f25563g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.f25563g = null;
        this.f25564h = null;
    }

    public final fn a() {
        return this.f25562f;
    }

    public final he2 b() {
        return this.f25562f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f25563g;
        Surface surface = this.f25564h;
        Surface surface2 = new Surface(surfaceTexture);
        this.f25563g = surfaceTexture;
        this.f25564h = surface2;
        Iterator<b> it = this.f25557a.iterator();
        while (it.hasNext()) {
            it.next().a(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final SurfaceTexture surfaceTexture) {
        this.f25561e.post(new Runnable() { // from class: com.yandex.mobile.ads.impl.G2
            @Override // java.lang.Runnable
            public final void run() {
                f12.this.a(surfaceTexture);
            }
        });
    }

    final class a implements GLSurfaceView.Renderer, i52.a, ff1.a {

        /* renamed from: a, reason: collision with root package name */
        private final ht1 f25568a;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f25571d;

        /* renamed from: e, reason: collision with root package name */
        private final float[] f25572e;

        /* renamed from: f, reason: collision with root package name */
        private final float[] f25573f;

        /* renamed from: g, reason: collision with root package name */
        private float f25574g;

        /* renamed from: h, reason: collision with root package name */
        private float f25575h;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f25569b = new float[16];

        /* renamed from: c, reason: collision with root package name */
        private final float[] f25570c = new float[16];

        /* renamed from: i, reason: collision with root package name */
        private final float[] f25576i = new float[16];

        /* renamed from: j, reason: collision with root package name */
        private final float[] f25577j = new float[16];

        public a(ht1 ht1Var) {
            float[] fArr = new float[16];
            this.f25571d = fArr;
            float[] fArr2 = new float[16];
            this.f25572e = fArr2;
            float[] fArr3 = new float[16];
            this.f25573f = fArr3;
            this.f25568a = ht1Var;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f25575h = 3.1415927f;
        }

        @Override // com.yandex.mobile.ads.impl.ff1.a
        public final synchronized void a(float[] fArr, float f4) {
            float[] fArr2 = this.f25571d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f5 = -f4;
            this.f25575h = f5;
            Matrix.setRotateM(this.f25572e, 0, -this.f25574g, (float) Math.cos(f5), (float) Math.sin(this.f25575h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f25577j, 0, this.f25571d, 0, this.f25573f, 0);
                Matrix.multiplyMM(this.f25576i, 0, this.f25572e, 0, this.f25577j, 0);
            }
            Matrix.multiplyMM(this.f25570c, 0, this.f25569b, 0, this.f25576i, 0);
            this.f25568a.a(this.f25570c);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i4, int i5) {
            GLES20.glViewport(0, 0, i4, i5);
            float f4 = i4 / i5;
            Matrix.perspectiveM(this.f25569b, 0, f4 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f4)) * 2.0d) : 90.0f, f4, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            f12.this.b(this.f25568a.a());
        }

        public final synchronized void a(PointF pointF) {
            float f4 = pointF.y;
            this.f25574g = f4;
            Matrix.setRotateM(this.f25572e, 0, -f4, (float) Math.cos(this.f25575h), (float) Math.sin(this.f25575h), 0.0f);
            Matrix.setRotateM(this.f25573f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public final boolean a(MotionEvent motionEvent) {
            return f12.this.performClick();
        }
    }
}
