package com.baidu.ar.arrender;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.Matrix;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import com.baidu.ar.DuMixInput;
import com.baidu.ar.DuMixOutput;
import com.baidu.ar.DuMixStateListener;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arplay.core.renderer.OnRenderFinishedListener;
import com.baidu.ar.arplay.core.renderer.OnRenderStartedListener;
import com.baidu.ar.bean.RotationType;
import com.baidu.ar.bean.ScaleType;
import com.baidu.ar.bean.Size;
import com.baidu.ar.bean.StorageType;
import com.baidu.ar.bean.Watermark;
import com.baidu.ar.eb;
import com.baidu.ar.ec;
import com.baidu.ar.g0;
import com.baidu.ar.h;
import com.baidu.ar.j6;
import com.baidu.ar.k1;
import com.baidu.ar.l;
import com.baidu.ar.m4;
import com.baidu.ar.ob;
import com.baidu.ar.r1;
import com.baidu.ar.r3;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.tb;
import com.baidu.ar.w1;
import com.baidu.ar.y3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class b extends g0 implements IRenderer, View.OnTouchListener, OnRenderStartedListener, OnRenderFinishedListener {
    public com.baidu.ar.arplay.core.engine.a A;
    public boolean B;
    public tb C;
    public ec D;
    public w1 E;
    public ConcurrentHashMap<DuMixOutput, eb> F;
    public List<FrameRenderListener> G;
    public y3 H;
    public boolean I;
    public m4 J;
    public r1 K;
    public boolean L;
    public float[] M;
    public float[] N;
    public float[] O;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DuMixInput duMixInput = b.this.f2275b;
            if (duMixInput == null || duMixInput.getInputSurface() == null) {
                return;
            }
            b.this.f2275b.getInputSurface().updateTexImage();
        }
    }

    /* renamed from: com.baidu.ar.arrender.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C0031b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1745a;

        static {
            int[] iArr = new int[Watermark.CoordinateType.values().length];
            f1745a = iArr;
            try {
                iArr[Watermark.CoordinateType.LEFT_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1745a[Watermark.CoordinateType.LEFT_BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1745a[Watermark.CoordinateType.RIGHT_TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1745a[Watermark.CoordinateType.RIGHT_BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public b(Context context, Looper looper, r3 r3Var, EGLContext eGLContext, String str) {
        super(context, r3Var, eGLContext, str);
        this.B = false;
        this.G = Collections.synchronizedList(new ArrayList());
        this.I = false;
        this.L = false;
        this.M = new float[16];
        this.A = new com.baidu.ar.arplay.core.engine.a(Looper.getMainLooper());
        tb tbVar = new tb(context);
        this.C = tbVar;
        tbVar.a(this.f2281h);
        w1 w1Var = new w1();
        this.E = w1Var;
        w1Var.a(this.f2281h);
        ec ecVar = new ec(context);
        this.D = ecVar;
        ecVar.a(this.f2281h);
        this.F = new ConcurrentHashMap<>();
        boolean b8 = ob.b(this.f2274a);
        this.I = b8;
        this.A.b(b8);
        this.J = new m4(looper, r3Var.d(), this.f2283j.getARPRenderer());
        Matrix.setIdentityM(this.M, 0);
        this.f2283j.getARPRenderer().setOnRenderStartedListener(this);
        this.f2283j.getARPRenderer().setOnRenderFinishedListener(this);
    }

    public final void a(Watermark watermark) {
        if (watermark.getBitmap() == null && !TextUtils.isEmpty(watermark.getFilePath())) {
            watermark.setBitmap(watermark.getStorageType() == StorageType.SDCARD ? BitmapFactory.decodeFile(watermark.getFilePath()) : watermark.getStorageType() == StorageType.ASSETS ? k1.a(this.f2274a, watermark.getFilePath()) : null);
        }
        if (watermark.getBitmap() == null || watermark.getRotationType() == RotationType.ROTATE_0) {
            return;
        }
        watermark.setBitmap(k1.a(watermark.getBitmap(), watermark.getRotationType().getDegree()));
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void addFrameRenderListener(FrameRenderListener frameRenderListener) {
        List<FrameRenderListener> list;
        if (frameRenderListener == null || (list = this.G) == null) {
            return;
        }
        list.add(frameRenderListener);
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void addOutputSurface(DuMixOutput duMixOutput) {
        ARPEngine aRPEngine;
        if (duMixOutput == null || duMixOutput.getOutputSurface() == null || (aRPEngine = this.f2283j) == null || aRPEngine.getARPRenderer() == null || !(duMixOutput.getOutputSurface() instanceof Surface)) {
            h.b("ARRendererBase", "addOutputSurface duMixOutput is error!!!");
            return;
        }
        h.a("ARRendererBase", "addOutputSurface() surface = " + duMixOutput.getOutputSurface().hashCode() + " & width*height = " + duMixOutput.getOutputWidth() + "*" + duMixOutput.getOutputHeight() + " & rotation = " + duMixOutput.getRotationType() + " & mode = " + duMixOutput.getScaleType());
        String addOutputSurface = this.f2283j.getARPRenderer().addOutputSurface((Surface) duMixOutput.getOutputSurface(), duMixOutput.getOutputWidth(), duMixOutput.getOutputHeight(), l.a(duMixOutput.getRotationType(), duMixOutput.getMirriorType()), l.a(duMixOutput.getScaleType()));
        a(addOutputSurface, this.f2275b, duMixOutput);
        eb ebVar = new eb(duMixOutput);
        ebVar.a(addOutputSurface);
        ConcurrentHashMap<DuMixOutput, eb> concurrentHashMap = this.F;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(duMixOutput, ebVar);
        }
    }

    @Override // com.baidu.ar.g0
    public void b() {
        h.a("ARRendererBase", "destroyCase()");
        super.b();
        m4 m4Var = this.J;
        if (m4Var != null) {
            m4Var.d();
            this.J.a();
        }
        tb tbVar = this.C;
        if (tbVar != null) {
            tbVar.c();
        }
    }

    @Override // com.baidu.ar.g0
    public void c() {
        if (this.f2276c.getOutputFPS() > 0) {
            this.H = new y3(this.f2276c.getOutputFPS());
        }
        m4 m4Var = this.J;
        if (m4Var != null) {
            m4Var.b(this.f2276c.getOutputWidth(), this.f2276c.getOutputHeight());
        }
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void cancelAysncRenderTask(Runnable runnable) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null || runnable == null) {
            return;
        }
        this.f2283j.getARPRenderer().cancelAysncRenderTask(runnable);
    }

    @Override // com.baidu.ar.g0
    public void changeOutput(DuMixOutput duMixOutput) {
        super.changeOutput(duMixOutput);
        this.B = false;
    }

    @Override // com.baidu.ar.g0
    public void changeOutputSize(int i8, int i9) {
        super.changeOutputSize(i8, i9);
        this.B = false;
    }

    public void d(boolean z7) {
        r1 r1Var = this.K;
        if (r1Var != null) {
            r1Var.a(z7);
        }
    }

    public j6 getLuaApplicationState() {
        return this.E;
    }

    @Override // com.baidu.ar.g0
    public void l() {
        h.a("ARRendererBase", "startARPEngine()");
        super.l();
        com.baidu.ar.arplay.core.engine.a aVar = this.A;
        if (aVar != null) {
            aVar.a(true);
        }
    }

    public ec n() {
        return this.D;
    }

    public final void o() {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null && aRPEngine.getARPRenderer() != null) {
            this.f2283j.getARPRenderer().setIsRender(false);
        }
        for (int i8 = 0; i8 < 5; i8++) {
            ARPEngine aRPEngine2 = this.f2283j;
            if (aRPEngine2 != null && aRPEngine2.getARPRenderer() != null) {
                this.f2283j.getARPRenderer().render(System.currentTimeMillis());
            }
        }
        ARPEngine aRPEngine3 = this.f2283j;
        if (aRPEngine3 != null && aRPEngine3.getARPRenderer() != null) {
            this.f2283j.getARPRenderer().setIsRender(true);
        }
        ARPEngine aRPEngine4 = this.f2283j;
        if (aRPEngine4 == null || aRPEngine4.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().render(System.currentTimeMillis());
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null || this.f2297x) {
            return;
        }
        y3 y3Var = this.H;
        if (y3Var != null && !y3Var.a()) {
            this.f2283j.getARPRenderer().runSyncOnRenderContext(new a());
        } else if (this.f2298y) {
            StatisticApi.getPerformanceApi().onFrameIn();
            this.f2283j.getARPRenderer().render(surfaceTexture.getTimestamp());
            StatisticApi.getPerformanceApi().onFrameOut();
        }
    }

    public void onRenderFinished(long j8) {
        List<FrameRenderListener> list = this.G;
        if (list != null) {
            Iterator<FrameRenderListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRenderFinished(j8);
            }
        }
    }

    public void onRenderStarted(long j8) {
        ARPEngine aRPEngine;
        boolean z7;
        List<FrameRenderListener> list = this.G;
        if (list != null) {
            Iterator<FrameRenderListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onRenderStarted(j8);
            }
        }
        DuMixInput duMixInput = this.f2275b;
        if (duMixInput != null && duMixInput.getInputSurface() != null) {
            this.f2275b.getInputSurface().updateTexImage();
            this.f2275b.getInputSurface().getTransformMatrix(this.M);
        }
        DuMixInput duMixInput2 = this.f2275b;
        if (duMixInput2 == null || !duMixInput2.isCameraInput() || (aRPEngine = this.f2283j) == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        boolean z8 = true;
        if (this.N == null) {
            float[] fArr = new float[16];
            this.N = fArr;
            float[] fArr2 = this.M;
            System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
            this.L = this.f2275b.isFrontCamera();
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.O == null) {
            this.O = new float[16];
        }
        if (Arrays.equals(this.M, this.N)) {
            z8 = false;
        } else {
            this.L = !this.L;
            float[] fArr3 = this.M;
            System.arraycopy(fArr3, 0, this.N, 0, fArr3.length);
        }
        if (z7 || z8) {
            l.a(this.f2274a, this.O, this.L);
            this.f2283j.getARPRenderer().setInputMatrix(this.O);
            d(this.L);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.baidu.ar.arplay.core.engine.a aVar = this.A;
        if (aVar == null) {
            return false;
        }
        if (!this.B) {
            if (view != null) {
                aVar.a(view.getWidth(), view.getHeight());
            } else {
                DuMixOutput duMixOutput = this.f2276c;
                if (duMixOutput != null) {
                    aVar.a(duMixOutput.getOutputWidth(), this.f2276c.getOutputHeight());
                }
            }
            this.B = true;
        }
        try {
            this.A.i(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    @Override // com.baidu.ar.g0
    public void pause() {
        h.a("ARRendererBase", "pause()");
        com.baidu.ar.arplay.core.engine.a aVar = this.A;
        if (aVar != null) {
            aVar.d();
        }
        super.pause();
    }

    @Override // com.baidu.ar.g0
    public void release() {
        tb tbVar = this.C;
        if (tbVar != null) {
            tbVar.b();
            this.C = null;
        }
        ConcurrentHashMap<DuMixOutput, eb> concurrentHashMap = this.F;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
            this.F = null;
        }
        List<FrameRenderListener> list = this.G;
        if (list != null) {
            list.clear();
            this.G = null;
        }
        com.baidu.ar.arplay.core.engine.a aVar = this.A;
        if (aVar != null) {
            aVar.f();
            this.A = null;
        }
        m4 m4Var = this.J;
        if (m4Var != null) {
            m4Var.b();
            this.J = null;
        }
        w1 w1Var = this.E;
        if (w1Var != null) {
            w1Var.c();
            this.E = null;
        }
        ec ecVar = this.D;
        if (ecVar != null) {
            ecVar.b();
            this.D = null;
        }
        this.H = null;
        this.K = null;
        this.M = null;
        this.O = null;
        this.N = null;
        super.release();
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void removeFrameRenderListener(FrameRenderListener frameRenderListener) {
        List<FrameRenderListener> list;
        if (frameRenderListener == null || (list = this.G) == null) {
            return;
        }
        list.remove(frameRenderListener);
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void removeOutputSurface(DuMixOutput duMixOutput) {
        if (duMixOutput == null || duMixOutput.getOutputSurface() == null || !(duMixOutput.getOutputSurface() instanceof Surface)) {
            h.b("ARRendererBase", "removeOutputSurface duMixOutput is error!!!");
            return;
        }
        if (this.F != null) {
            h.a("ARRendererBase", "removeOutputSurface() surface = " + duMixOutput.getOutputSurface().hashCode());
            eb remove = this.F.remove(duMixOutput);
            ARPEngine aRPEngine = this.f2283j;
            if (aRPEngine == null || aRPEngine.getARPRenderer() == null || remove == null || TextUtils.isEmpty(remove.b())) {
                return;
            }
            this.f2283j.getARPRenderer().removeOutputTargetByAddr(remove.b());
        }
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void render() {
        DuMixInput duMixInput = this.f2275b;
        if (duMixInput != null && duMixInput.isSingleFrame()) {
            o();
        }
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().render(System.currentTimeMillis());
    }

    @Override // com.baidu.ar.g0
    public void resume() {
        h.a("ARRendererBase", "resume()");
        super.resume();
        com.baidu.ar.arplay.core.engine.a aVar = this.A;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void runAsyncOnRenderContext(Runnable runnable) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null || runnable == null) {
            return;
        }
        this.f2283j.getARPRenderer().runAsyncOnRenderContext(runnable);
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void runSyncOnRenderContext(Runnable runnable) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null || runnable == null) {
            return;
        }
        this.f2283j.getARPRenderer().runSyncOnRenderContext(runnable);
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void setCameraSwitchListener(r1 r1Var) {
        this.K = r1Var;
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void setDefaultPipeLine(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "filter_pipeline = function()\n\n    fm = ae.FilterManager:get_instance();\n\n    global_copy_filter = fm:create_filter(\"Tex2DFilter\", \"globalTex2DFilter\", true);\n    gl_makeup_filer = fm:create_filter(\"BeautyMakeupFilter\",\"globalBeautyMakeupFilter\",true);\n\n    skin_filter = fm:create_filter(\"SkinFilter\", \"globalSkinFilter\", true);\n    engine_filter = fm:create_filter(\"EngineFilter\", \"globalEngineFilter\", true);\n    fm:update_property_int(engine_filter, \"is_enable\", 0);\n    face_filter = fm:create_filter(\"FaceFilter\", \"globalFaceFilter\", true);\n    lut_filter = fm:create_filter(\"LUTFilter\", \"globalLutFilter\", true);\n    tune_color_filter = fm:create_filter(\"TuneColorFilter\", \"globalTuneColorFilter\", true);\n    fm:reset_pipeline();\n    fm:connect_filters_by_id(skin_filter, gl_makeup_filer);\n    fm:connect_filters_by_id(skin_filter, global_copy_filter);\n    fm:connect_filters_by_id(global_copy_filter, gl_makeup_filer);\n    fm:connect_filters_by_id(gl_makeup_filer, face_filter);\n    fm:connect_filters_by_id(face_filter, tune_color_filter);\n    fm:connect_filters_by_id(tune_color_filter, engine_filter);\n    fm:connect_filters_by_id(engine_filter, lut_filter);\n\n    fm:connect_filter_to_camera(skin_filter);\n    fm:connect_filter_to_output(lut_filter);\n\nend\nfilter_pipeline()\n\n";
        }
        this.f2282i = str;
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void setInputMatrix(float[] fArr) {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().setInputMatrix(fArr);
    }

    @Override // com.baidu.ar.arrender.IRenderer
    public void setStateListener(DuMixStateListener duMixStateListener) {
        this.f2294u = duMixStateListener;
    }

    @Override // com.baidu.ar.g0
    public void a(String str) {
        h.a("ARRendererBase", "createCase() casePath = " + str);
        super.a(str);
        w1 w1Var = this.E;
        if (w1Var != null) {
            w1Var.d();
        }
        ec ecVar = this.D;
        if (ecVar != null) {
            ecVar.a(str);
        }
    }

    public final void b(DuMixInput duMixInput, DuMixOutput duMixOutput) {
        int i8;
        Watermark watermark = duMixOutput.getWatermark();
        if (watermark.getRenderRect() != null || watermark.getStartPoint() == null) {
            return;
        }
        int outputWidth = duMixOutput.getOutputWidth();
        int outputHeight = duMixOutput.getOutputHeight();
        RotationType rotationType = duMixOutput.getRotationType();
        RotationType rotationType2 = RotationType.ROTATE_90;
        if (rotationType != rotationType2 && duMixOutput.getRotationType() != RotationType.ROTATE_270) {
            outputHeight = outputWidth;
            outputWidth = outputHeight;
        }
        int i9 = 0;
        if (duMixOutput.getScaleType() == ScaleType.CENTER_CROP && duMixInput != null) {
            int inputWidth = duMixInput.getInputWidth();
            int inputHeight = duMixInput.getInputHeight();
            if (duMixInput.getRotationType() == rotationType2 || duMixInput.getRotationType() == RotationType.ROTATE_270) {
                inputHeight = inputWidth;
                inputWidth = inputHeight;
            }
            new Size(outputHeight, outputWidth);
            Size b8 = l.b(inputWidth, inputHeight, outputHeight, outputWidth);
            if (b8.getWidth() != inputWidth) {
                i8 = (outputHeight - b8.getWidth()) / 2;
                watermark.setRenderRect(a(watermark, outputHeight, outputWidth, i8, i9));
            } else if (b8.getHeight() != inputHeight) {
                i9 = (outputWidth - b8.getHeight()) / 2;
            }
        }
        i8 = 0;
        watermark.setRenderRect(a(watermark, outputHeight, outputWidth, i8, i9));
    }

    public final void a(String str, DuMixInput duMixInput, DuMixOutput duMixOutput) {
        if (duMixOutput == null || duMixOutput.getWatermark() == null) {
            return;
        }
        a(duMixOutput.getWatermark());
        if (duMixOutput.getWatermark().getBitmap() == null) {
            h.b("ARRendererBase", "setWatermark error!!! As no watermark image!!!");
            return;
        }
        b(duMixInput, duMixOutput);
        if (this.f2283j == null || duMixOutput.getWatermark().getRenderRect() == null || duMixOutput.getWatermark().getRenderRect().length != 4) {
            return;
        }
        this.f2283j.setWatermark(str, duMixOutput.getWatermark().getBitmap(), duMixOutput.getWatermark().getRenderRect());
    }

    @Override // com.baidu.ar.g0
    public void b(Object obj, int i8, int i9) {
        super.b(obj, i8, i9);
        this.B = false;
    }

    public final float[] a(Watermark watermark, float f8, float f9, float f10, float f11) {
        float[] fArr = new float[4];
        Point startPoint = watermark.getStartPoint();
        float width = watermark.getBitmap().getWidth() * watermark.getScale();
        float height = watermark.getBitmap().getHeight() * watermark.getScale();
        int i8 = C0031b.f1745a[watermark.getCoordinateType().ordinal()];
        if (i8 == 1) {
            fArr[0] = (startPoint.x + f10) / f8;
            fArr[1] = (startPoint.y + f11) / f9;
        } else if (i8 == 2) {
            fArr[0] = (startPoint.x + f10) / f8;
            fArr[1] = (((f9 - f11) - startPoint.y) - height) / f9;
        } else if (i8 == 3) {
            fArr[0] = (((f8 - f10) - startPoint.x) - width) / f8;
            fArr[1] = (startPoint.y + f11) / f9;
        } else if (i8 == 4) {
            fArr[0] = (((f8 - f10) - startPoint.x) - width) / f8;
            fArr[1] = (((f9 - f11) - startPoint.y) - height) / f9;
        }
        fArr[2] = width / f8;
        fArr[3] = height / f9;
        return fArr;
    }
}
