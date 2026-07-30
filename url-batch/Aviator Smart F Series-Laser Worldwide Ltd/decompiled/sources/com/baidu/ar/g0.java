package com.baidu.ar;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arplay.core.engine.ARPEngineParams;
import com.baidu.ar.arplay.core.pixel.PixelReadListener;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelRotation;
import com.baidu.ar.arplay.core.renderer.IARPRenderer;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.bean.RotationType;
import com.baidu.ar.bean.Size;
import com.baidu.ar.libloader.ILibLoader;
import java.io.File;
import java.lang.ref.SoftReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class g0 implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2274a;

    /* renamed from: b, reason: collision with root package name */
    public DuMixInput f2275b;

    /* renamed from: c, reason: collision with root package name */
    public DuMixOutput f2276c;

    /* renamed from: d, reason: collision with root package name */
    public eb f2277d;

    /* renamed from: h, reason: collision with root package name */
    public r3 f2281h;

    /* renamed from: j, reason: collision with root package name */
    public ARPEngine f2283j;

    /* renamed from: l, reason: collision with root package name */
    public i f2285l;

    /* renamed from: m, reason: collision with root package name */
    public p7 f2286m;

    /* renamed from: n, reason: collision with root package name */
    public t4 f2287n;

    /* renamed from: p, reason: collision with root package name */
    public String f2289p;

    /* renamed from: q, reason: collision with root package name */
    public String f2290q;

    /* renamed from: r, reason: collision with root package name */
    public int f2291r;

    /* renamed from: s, reason: collision with root package name */
    public Size f2292s;

    /* renamed from: t, reason: collision with root package name */
    public EGLContext f2293t;

    /* renamed from: u, reason: collision with root package name */
    public DuMixStateListener f2294u;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2278e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2279f = false;

    /* renamed from: g, reason: collision with root package name */
    public long f2280g = 0;

    /* renamed from: i, reason: collision with root package name */
    public String f2282i = "filter_pipeline = function()\n\n    fm = ae.FilterManager:get_instance();\n\n    global_copy_filter = fm:create_filter(\"Tex2DFilter\", \"globalTex2DFilter\", true);\n    gl_makeup_filer = fm:create_filter(\"BeautyMakeupFilter\",\"globalBeautyMakeupFilter\",true);\n\n    skin_filter = fm:create_filter(\"SkinFilter\", \"globalSkinFilter\", true);\n    engine_filter = fm:create_filter(\"EngineFilter\", \"globalEngineFilter\", true);\n    fm:update_property_int(engine_filter, \"is_enable\", 0);\n    face_filter = fm:create_filter(\"FaceFilter\", \"globalFaceFilter\", true);\n    lut_filter = fm:create_filter(\"LUTFilter\", \"globalLutFilter\", true);\n    tune_color_filter = fm:create_filter(\"TuneColorFilter\", \"globalTuneColorFilter\", true);\n    fm:reset_pipeline();\n    fm:connect_filters_by_id(skin_filter, gl_makeup_filer);\n    fm:connect_filters_by_id(skin_filter, global_copy_filter);\n    fm:connect_filters_by_id(global_copy_filter, gl_makeup_filer);\n    fm:connect_filters_by_id(gl_makeup_filer, face_filter);\n    fm:connect_filters_by_id(face_filter, tune_color_filter);\n    fm:connect_filters_by_id(tune_color_filter, engine_filter);\n    fm:connect_filters_by_id(engine_filter, lut_filter);\n\n    fm:connect_filter_to_camera(skin_filter);\n    fm:connect_filter_to_output(lut_filter);\n\nend\nfilter_pipeline()\n\n";

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f2284k = false;

    /* renamed from: o, reason: collision with root package name */
    public String f2288o = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2295v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2296w = false;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f2297x = false;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f2298y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2299z = false;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f2300a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2301b;

        public a(SurfaceTexture surfaceTexture, int i8) {
            this.f2300a = surfaceTexture;
            this.f2301b = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2300a.attachToGLContext(this.f2301b);
                g0.this.f2298y = true;
                this.f2300a.updateTexImage();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int createTexture = (int) g0.this.f2283j.getARPRenderer().createTexture(3553, g0.this.f2276c.getOutputWidth(), g0.this.f2276c.getOutputHeight());
            h.a("AbstractRenderer", "setup outputTextureId = " + createTexture);
            g0.this.f2276c.setOutputSurface(new SurfaceTexture(createTexture));
        }
    }

    public class c implements ILibLoader.c {
        public c() {
        }

        @Override // com.baidu.ar.libloader.ILibLoader.c
        public void onError() {
        }

        @Override // com.baidu.ar.libloader.ILibLoader.c
        public void onReady() {
            g0.this.f2295v = false;
            g0 g0Var = g0.this;
            if (g0Var.f2296w) {
                return;
            }
            g0Var.e();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                DuMixInput duMixInput = g0.this.f2275b;
                if (duMixInput == null || duMixInput.getInputSurface() == null) {
                    return;
                }
                g0.this.f2298y = false;
                g0.this.f2275b.getInputSurface().detachFromGLContext();
            } catch (Exception unused) {
                h.c("AbstractRenderer", "releaseInput() surfaceTexture.detachFromGLContext() fail!!!");
            }
        }
    }

    public g0(Context context, r3 r3Var, EGLContext eGLContext, String str) {
        this.f2289p = null;
        this.f2293t = null;
        h.a("AbstractRenderer", "create start!!!");
        this.f2274a = context;
        this.f2281h = r3Var;
        this.f2293t = eGLContext;
        this.f2286m = new p7(context);
        this.f2287n = t4.a();
        this.f2285l = new i(context);
        ac.a(this.f2281h);
        this.f2289p = str;
        ARPEngine aRPEngine = ARPEngine.getInstance();
        this.f2283j = aRPEngine;
        aRPEngine.setContext(new SoftReference<>(context));
        h.a("AbstractRenderer", "create end!!!");
    }

    public final Surface a(DuMixOutput duMixOutput, Object obj) {
        Surface surface;
        Object outputSurface = duMixOutput.getOutputSurface();
        if (obj == null) {
            obj = outputSurface;
        }
        if (obj == null) {
            a();
            obj = this.f2276c.getOutputSurface();
            this.f2279f = true;
        }
        if (obj instanceof SurfaceHolder) {
            SurfaceHolder surfaceHolder = (SurfaceHolder) obj;
            surface = surfaceHolder.getSurface();
            duMixOutput.setOutputSurface(surfaceHolder);
        } else if (obj instanceof SurfaceTexture) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            surfaceTexture.setDefaultBufferSize(duMixOutput.getOutputWidth(), duMixOutput.getOutputHeight());
            surface = new Surface(surfaceTexture);
            duMixOutput.setOutputSurface(surfaceTexture);
        } else if (obj instanceof Surface) {
            surface = (Surface) obj;
            duMixOutput.setOutputSurface(surface);
        } else {
            surface = null;
        }
        if (surface == null) {
            h.b("AbstractRenderer", "initOutputSurface outputSurface error!!!");
        }
        return surface;
    }

    public void b() {
        h.a("AbstractRenderer", "destroyCase()");
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.unloadCase();
        }
        j();
        ARPEngine aRPEngine2 = this.f2283j;
        if (aRPEngine2 != null && aRPEngine2.getARPRenderer() != null) {
            this.f2283j.getARPRenderer().purgeMemory();
        }
        this.f2288o = null;
        t4 t4Var = this.f2287n;
        if (t4Var != null) {
            t4Var.a((String) null);
        }
    }

    public abstract void c();

    public void c(DuMixInput duMixInput) {
        if (duMixInput.getInputTexture() == null) {
            if (duMixInput.getInputSurface() != null) {
                a(duMixInput.getInputSurface(), duMixInput.isCameraInput() ? 36197 : 3553, duMixInput.getInputWidth(), duMixInput.getInputHeight());
            }
        } else {
            if (duMixInput.getInputTexture().getId() == -1) {
                long createTexture = this.f2283j.getARPRenderer().createTexture(duMixInput.getInputTexture().getType(), duMixInput.getInputWidth(), duMixInput.getInputHeight());
                duMixInput.getInputTexture().setHandle(createTexture);
                duMixInput.getInputTexture().setId(this.f2283j.getARPRenderer().getTextureId(createTexture));
            }
            this.f2283j.getARPRenderer().setInputTexture(duMixInput.getInputTexture().getType(), duMixInput.getInputTexture().getId(), duMixInput.getInputWidth(), duMixInput.getInputHeight());
        }
    }

    public void changeOutput(DuMixOutput duMixOutput) {
        g();
        this.f2276c = duMixOutput;
        b(duMixOutput, (Object) null);
    }

    public void changeOutputSize(int i8, int i9) {
        DuMixOutput duMixOutput;
        eb ebVar;
        if (this.f2275b == null || (duMixOutput = this.f2276c) == null) {
            return;
        }
        if (duMixOutput.getOutputHeight() == i9 && this.f2276c.getOutputWidth() == i8) {
            return;
        }
        h.a("AbstractRenderer", "changeOutputSize() size = " + i8 + "x" + i9);
        Object outputSurface = this.f2276c.getOutputSurface();
        if (outputSurface instanceof SurfaceTexture) {
            ((SurfaceTexture) outputSurface).setDefaultBufferSize(i8, i9);
        }
        this.f2276c.setOutputWidth(i8);
        this.f2276c.setOutputHeight(i9);
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null && aRPEngine.getARPRenderer() != null && (ebVar = this.f2277d) != null && !TextUtils.isEmpty(ebVar.b())) {
            this.f2283j.getARPRenderer().addOutputSurface(this.f2277d.a(), i8, i9);
        }
        if (this.f2283j != null) {
            Size a8 = a(a(this.f2275b), this.f2276c);
            this.f2283j.setWindowSize(a8.getWidth(), a8.getHeight());
        }
        if (this.f2276c.isFitScreenAuto()) {
            k();
        }
    }

    public boolean d() {
        return this.f2295v;
    }

    public void e() {
        if (this.f2283j != null) {
            try {
                if (TextUtils.isEmpty(this.f2290q)) {
                    this.f2283j.setLocalDeviceGrade(this.f2291r);
                } else {
                    this.f2283j.setConfig("grading", this.f2290q);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        j();
        l();
    }

    public final void f() {
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null && aRPEngine.getARPRenderer() != null) {
            this.f2283j.getARPRenderer().runSyncOnRenderContext(new d());
        }
        DuMixInput duMixInput = this.f2275b;
        if (duMixInput != null && duMixInput.getInputSurface() != null) {
            this.f2275b.getInputSurface().setOnFrameAvailableListener(null);
            if (this.f2278e) {
                this.f2275b.getInputSurface().release();
            }
        }
        ARPEngine aRPEngine2 = this.f2283j;
        if (aRPEngine2 == null || aRPEngine2.getARPRenderer() == null || this.f2280g <= 0) {
            return;
        }
        this.f2283j.getARPRenderer().destroyTexture(this.f2280g);
    }

    public final void g() {
        DuMixOutput duMixOutput = this.f2276c;
        if (duMixOutput != null && duMixOutput.getOutputSurface() != null && this.f2279f) {
            if (this.f2276c.getOutputSurface() instanceof Surface) {
                ((Surface) this.f2276c.getOutputSurface()).release();
            } else if (this.f2276c.getOutputSurface() instanceof SurfaceTexture) {
                ((SurfaceTexture) this.f2276c.getOutputSurface()).release();
            }
        }
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null || this.f2277d == null) {
            return;
        }
        this.f2283j.getARPRenderer().removeOutputTargetByAddr(this.f2277d.b());
    }

    public final void h() {
        this.f2283j.getARPRenderer().connectCameraWithTarget();
    }

    public void i() {
        this.f2295v = true;
        com.baidu.ar.libloader.a.a("dumixar");
        com.baidu.ar.libloader.a.a("dumixar", new c());
    }

    public final void j() {
        this.f2283j.getARPRenderer().runLuaScriptStr(this.f2282i);
    }

    public final void k() {
        IARPRenderer aRPRenderer;
        String b8;
        PixelRotation pixelRotation;
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine == null || aRPEngine.getARPRenderer() == null || this.f2277d == null) {
            return;
        }
        if (ob.b(this.f2274a)) {
            aRPRenderer = this.f2283j.getARPRenderer();
            b8 = this.f2277d.b();
            pixelRotation = PixelRotation.RotateLeft;
        } else {
            aRPRenderer = this.f2283j.getARPRenderer();
            b8 = this.f2277d.b();
            pixelRotation = PixelRotation.NoRotation;
        }
        aRPRenderer.updateOutputSurfaceRotation(b8, pixelRotation);
    }

    public void l() {
        DuMixInput duMixInput;
        h.a("AbstractRenderer", "startARPEngine()");
        if (this.f2283j == null) {
            this.f2283j = ARPEngine.getInstance();
        }
        if (this.f2283j != null && (duMixInput = this.f2275b) != null && this.f2276c != null) {
            Size a8 = a(duMixInput);
            Size a9 = a(a8, this.f2276c);
            ARPEngineParams aRPEngineParams = new ARPEngineParams();
            aRPEngineParams.setInputWidth(a8.getWidth());
            aRPEngineParams.setInputHeight(a8.getHeight());
            aRPEngineParams.setOutputWidth(a9.getWidth());
            aRPEngineParams.setOutputHeight(a9.getHeight());
            aRPEngineParams.setDensity(ob.a(this.f2274a));
            if (this.f2275b.isCameraInput()) {
                aRPEngineParams.setIsFrontCamera(this.f2275b.isFrontCamera());
            }
            aRPEngineParams.setShaderDBPath(this.f2289p);
            this.f2283j.createEngine(aRPEngineParams);
        }
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.resume();
        }
        i iVar = this.f2285l;
        if (iVar != null) {
            iVar.a();
        }
        try {
            p7 p7Var = this.f2286m;
            if (p7Var != null) {
                p7Var.d();
            }
        } catch (RuntimeException e8) {
            e8.printStackTrace();
        }
    }

    public void m() {
        h.a("AbstractRenderer", "stopARPEngine()");
        if (this.f2283j == null || !this.f2284k) {
            r3 r3Var = this.f2281h;
            if (r3Var != null) {
                r3Var.handleMessage(7, 0, null);
            }
        } else {
            this.f2283j.destroyEngine();
            this.f2284k = false;
        }
        this.f2285l = null;
        p7 p7Var = this.f2286m;
        if (p7Var != null) {
            p7Var.c();
        }
    }

    public void pause() {
        h.a("AbstractRenderer", "pause()");
        p7 p7Var = this.f2286m;
        if (p7Var != null) {
            p7Var.c();
        }
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.pause();
        }
    }

    public void release() {
        h.a("AbstractRenderer", "release() start!!!");
        this.f2297x = true;
        pause();
        t4 t4Var = this.f2287n;
        if (t4Var != null) {
            t4Var.d();
            this.f2287n = null;
        }
        ac.b(this.f2281h);
        m();
        this.f2294u = null;
        f();
        this.f2275b = null;
        g();
        this.f2276c = null;
        this.f2277d = null;
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.destroy();
            this.f2283j = null;
        }
        ARPEngine.releaseInstance();
        this.f2274a = null;
        this.f2293t = null;
        h.a("AbstractRenderer", "release() end!!!");
    }

    public void resume() {
        h.a("AbstractRenderer", "resume()");
        try {
            this.f2286m.d();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.resume();
        }
    }

    public Size a(DuMixInput duMixInput) {
        if (duMixInput == null) {
            h.b("AbstractRenderer", "getEngineInputSize duMixInput is null!!!");
            return null;
        }
        Size size = this.f2292s;
        if (size != null && size.getWidth() != 0 && this.f2292s.getHeight() != 0) {
            return this.f2292s;
        }
        Size size2 = new Size(duMixInput.getInputHeight(), duMixInput.getInputWidth());
        if (!duMixInput.isCameraInput() && (duMixInput.getRotationType() == RotationType.ROTATE_0 || duMixInput.getRotationType() == RotationType.ROTATE_180)) {
            size2.setWidth(duMixInput.getInputWidth());
            size2.setHeight(duMixInput.getInputHeight());
        }
        return size2;
    }

    public void b(DuMixOutput duMixOutput, Object obj) {
        Surface a8;
        String addOutputSurface;
        if (duMixOutput.getOutputTexture() == null || duMixOutput.getOutputTexture().getId() == -1) {
            a8 = a(duMixOutput, obj);
            addOutputSurface = this.f2283j.getARPRenderer().addOutputSurface(a8, duMixOutput.getOutputWidth(), duMixOutput.getOutputHeight(), l.a(duMixOutput.getRotationType(), duMixOutput.getMirriorType()), l.a(duMixOutput.getScaleType()));
        } else {
            addOutputSurface = this.f2283j.getARPRenderer().addOutputTarget(duMixOutput.getOutputTexture().getType(), duMixOutput.getOutputTexture().getId(), duMixOutput.getOutputWidth(), duMixOutput.getOutputHeight(), l.a(this.f2276c.getRotationType(), this.f2276c.getMirriorType()));
            a8 = null;
        }
        eb ebVar = new eb(duMixOutput);
        this.f2277d = ebVar;
        ebVar.a(a8);
        this.f2277d.a(addOutputSurface);
        if (duMixOutput.isFitScreenAuto()) {
            k();
        }
        Size a9 = a(a(this.f2275b), this.f2276c);
        this.f2283j.setWindowSize(a9.getWidth(), a9.getHeight());
    }

    public void c(boolean z7) {
        DuMixInput duMixInput = this.f2275b;
        if (duMixInput == null) {
            return;
        }
        this.f2299z = z7;
        if (z7) {
            Size a8 = l.a(this.f2276c.getOutputWidth(), this.f2276c.getOutputHeight(), this.f2275b.getInputHeight(), this.f2275b.getInputWidth());
            this.f2292s = a8;
            this.f2283j.setPreviewSize(a8.getWidth(), this.f2292s.getHeight());
            this.f2283j.setWindowSize(this.f2276c.getOutputWidth(), this.f2276c.getOutputHeight());
            return;
        }
        this.f2292s = null;
        Size a9 = a(duMixInput);
        Size a10 = a(a9, this.f2276c);
        this.f2283j.setPreviewSize(a9.getWidth(), a9.getHeight());
        this.f2283j.setWindowSize(a10.getWidth(), a10.getHeight());
    }

    public Size a(Size size, DuMixOutput duMixOutput) {
        int width;
        int height;
        int outputWidth;
        int outputHeight;
        if (ob.b(this.f2274a)) {
            width = size.getWidth();
            height = size.getHeight();
            outputWidth = duMixOutput.getOutputHeight();
            outputHeight = duMixOutput.getOutputWidth();
        } else {
            width = size.getWidth();
            height = size.getHeight();
            outputWidth = duMixOutput.getOutputWidth();
            outputHeight = duMixOutput.getOutputHeight();
        }
        return l.b(width, height, outputWidth, outputHeight);
    }

    public void b(PixelReadParams pixelReadParams, PixelReadListener pixelReadListener) {
        ARPEngine aRPEngine;
        if (!this.f2284k || (aRPEngine = this.f2283j) == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2283j.getARPRenderer().destroyPixelReaderByPreFilterID(pixelReadParams, pixelReadListener);
    }

    public final void a() {
        this.f2283j.getARPRenderer().runSyncOnRenderContext(new b());
    }

    public void b(Object obj, int i8, int i9) {
        if (obj == null || i8 <= 0 || i9 <= 0 || this.f2276c == null || !this.f2284k) {
            h.b("AbstractRenderer", "changeOutputSurface error!!!");
            return;
        }
        g();
        if (obj instanceof SurfaceTexture) {
            this.f2276c.setOutputSurface((SurfaceTexture) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.f2276c.setOutputSurface((SurfaceHolder) obj);
        } else {
            if (!(obj instanceof Surface)) {
                h.b("AbstractRenderer", "changeOutputSurface error!!! As outputSurface is not a surface!!!");
                return;
            }
            this.f2276c.setOutputSurface((Surface) obj);
        }
        this.f2276c.setOutputWidth(i8);
        this.f2276c.setOutputHeight(i9);
        DuMixInput duMixInput = this.f2275b;
        if (duMixInput == null || duMixInput.getInputSurface() != null || this.f2275b.getInputTexture() != null) {
            b(this.f2276c, obj);
            return;
        }
        Surface surface = new Surface((SurfaceTexture) obj);
        String addOutputSurface = ARPEngine.getInstance().getARPRenderer().addOutputSurface(surface, i8, i9, ob.b(this.f2274a) ? PixelRotation.RotateLeft : PixelRotation.NoRotation);
        eb ebVar = new eb(this.f2276c);
        this.f2277d = ebVar;
        ebVar.a(surface);
        this.f2277d.a(addOutputSurface);
    }

    public void a(int i8) {
        this.f2291r = i8;
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            try {
                aRPEngine.setLocalDeviceGrade(i8);
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(String str) {
        t4 t4Var = this.f2287n;
        if (t4Var != null) {
            t4Var.a(str);
            File file = new File(str, "res/webview");
            if (file.exists()) {
                File file2 = new File(this.f2274a.getFilesDir(), "ar/res/webview");
                j4.e(file2);
                j4.a(file, file2, true);
            }
        }
    }

    public final void a(SurfaceTexture surfaceTexture, int i8, int i9, int i10) {
        int textureId = this.f2283j.getARPRenderer().getTextureId(this.f2283j.getARPRenderer().createTexture(i8, i9, i10));
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f2283j.getARPRenderer().setInputTexture(i8, textureId, i9, i10);
        try {
            surfaceTexture.detachFromGLContext();
        } catch (Exception unused) {
            h.e("AbstractRenderer", "attachInputSurface surfaceTexture.detachFromGLContext() fail!!!");
        }
        this.f2283j.getARPRenderer().runSyncOnRenderContext(new a(surfaceTexture, textureId));
        surfaceTexture.setDefaultBufferSize(i9, i10);
        DuMixStateListener duMixStateListener = this.f2294u;
        if (duMixStateListener != null) {
            duMixStateListener.onInputSurfaceTextureAttach(surfaceTexture);
        }
    }

    public void b(boolean z7) {
        this.f2296w = z7;
    }

    public void a(DuMixInput duMixInput, DuMixOutput duMixOutput) {
        ARPEngine aRPEngine;
        h.a("AbstractRenderer", "setup() start");
        if (duMixInput == null || duMixOutput == null || (aRPEngine = this.f2283j) == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        this.f2275b = duMixInput;
        this.f2276c = duMixOutput;
        com.baidu.ar.libloader.a.a("dumixar");
        c();
        if (b(duMixInput)) {
            c(duMixInput);
            b(duMixOutput, (Object) null);
            h();
            i();
            h.a("AbstractRenderer", "setup() end");
        }
    }

    public final boolean b(DuMixInput duMixInput) {
        try {
            this.f2283j.getARPRenderer().setUpEGLEnv(this.f2293t);
            if (duMixInput.getInputTexture() == null && duMixInput.getInputSurface() == null) {
                this.f2283j.getARPRenderer().createNoInputSource();
            } else {
                this.f2283j.getARPRenderer().setCameraFace(duMixInput.isFrontCamera());
                PixelRotation a8 = l.a(duMixInput.isFitCameraAuto(), duMixInput.getRotationType(), duMixInput.getMirriorType());
                com.baidu.ar.arplay.core.engine.b bVar = com.baidu.ar.arplay.core.engine.b.INTERNAL_OES_TEX;
                if ((duMixInput.getInputTexture() != null && duMixInput.getInputTexture().getType() == 3553) || (duMixInput.getInputSurface() != null && !duMixInput.isCameraInput())) {
                    bVar = com.baidu.ar.arplay.core.engine.b.INTERNAL_2D_TEX;
                }
                if (duMixInput.isSyncInputContent()) {
                    this.f2283j.getARPRenderer().createSyncInputSource(a8, bVar);
                } else {
                    this.f2283j.getARPRenderer().createInputSource(a8, bVar);
                }
            }
            Size a9 = a(this.f2275b);
            this.f2283j.setPreviewSize(a9.getWidth(), a9.getHeight());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(PixelReadParams pixelReadParams, PixelReadListener pixelReadListener) {
        ARPEngine aRPEngine;
        if (!this.f2284k || (aRPEngine = this.f2283j) == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        l.a(this.f2274a, this.f2275b.isFrontCamera(), pixelReadParams);
        this.f2283j.getARPRenderer().createPixelReaderByPreFilterID(pixelReadParams, pixelReadListener);
    }

    public void a(PixelReadParams pixelReadParams, PixelRotation pixelRotation) {
        ARPEngine aRPEngine;
        if (!this.f2284k || (aRPEngine = this.f2283j) == null || aRPEngine.getARPRenderer() == null) {
            return;
        }
        pixelReadParams.setPixelRotate(pixelRotation);
        l.a(this.f2274a, this.f2275b.isFrontCamera(), pixelReadParams);
        this.f2283j.getARPRenderer().setPixelReaderRotation(pixelReadParams, pixelReadParams.getPixelRotate());
    }

    public void a(Object obj, int i8, int i9) {
        if (this.f2275b == null || this.f2283j == null) {
            return;
        }
        f();
        this.f2275b.setInputWidth(i8);
        this.f2275b.setInputHeight(i9);
        if (obj instanceof SurfaceTexture) {
            this.f2275b.setInputSurface((SurfaceTexture) obj);
        } else if (obj instanceof Texture) {
            this.f2275b.setInputTexture((Texture) obj);
        }
        c(this.f2275b);
        c(this.f2299z);
    }

    public void a(String str) {
        h.a("AbstractRenderer", "createCase() casePath = " + str);
        i iVar = this.f2285l;
        if (iVar != null) {
            iVar.a();
        }
        ARPEngine aRPEngine = this.f2283j;
        if (aRPEngine != null) {
            aRPEngine.loadCaseWithResPath(str);
            DuMixOutput duMixOutput = this.f2276c;
            if (duMixOutput != null) {
                changeOutputSize(duMixOutput.getOutputWidth(), this.f2276c.getOutputHeight());
            }
        }
        this.f2288o = str;
        b(str);
    }

    public void a(JSONObject jSONObject) {
        if (this.f2283j == null || jSONObject == null) {
            return;
        }
        String jSONObject2 = jSONObject.toString();
        this.f2290q = jSONObject2;
        try {
            this.f2283j.setConfig("grading", jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public void a(boolean z7) {
        this.f2284k = z7;
    }
}
