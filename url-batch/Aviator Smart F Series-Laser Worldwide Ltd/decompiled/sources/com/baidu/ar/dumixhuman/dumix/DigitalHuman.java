package com.baidu.ar.dumixhuman.dumix;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.baidu.ar.DefaultParams;
import com.baidu.ar.DuMixCallback;
import com.baidu.ar.DuMixController;
import com.baidu.ar.DuMixErrorType;
import com.baidu.ar.DuMixInput;
import com.baidu.ar.DuMixOutput;
import com.baidu.ar.digital.IDigital;
import com.baidu.ar.dumixhuman.callback.DumixState;
import com.baidu.ar.dumixhuman.callback.IDigitalStateCallback;
import com.baidu.ar.dumixhuman.callback.IMessageLuaCallback;
import com.baidu.ar.dumixhuman.callback.IMessageSubtitleCallback;
import com.baidu.ar.dumixhuman.callback.IMessageWidgetCallback;
import com.baidu.ar.dumixhuman.callback.ISurfaceTouchCallback;
import com.baidu.ar.h;
import com.baidu.ar.l0;
import com.baidu.ar.libloader.ILibLoader;
import com.baidu.ar.q3;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.ar.u1;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class DigitalHuman implements q3 {
    public static final String TAG = "DigitalHuman";

    /* renamed from: c, reason: collision with root package name */
    public Context f2080c;

    /* renamed from: d, reason: collision with root package name */
    public ISurfaceTouchCallback f2081d;

    /* renamed from: e, reason: collision with root package name */
    public IDigitalStateCallback f2082e;

    /* renamed from: g, reason: collision with root package name */
    public final String f2084g;

    /* renamed from: h, reason: collision with root package name */
    public String f2085h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2086i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2087j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2088k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2089l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2090m;

    /* renamed from: n, reason: collision with root package name */
    public File f2091n;

    /* renamed from: o, reason: collision with root package name */
    public TextureView f2092o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2093p;

    /* renamed from: q, reason: collision with root package name */
    public DuMixInput f2094q;

    /* renamed from: r, reason: collision with root package name */
    public DuMixOutput f2095r;

    /* renamed from: s, reason: collision with root package name */
    public DuMixController f2096s;

    /* renamed from: t, reason: collision with root package name */
    public IDigital f2097t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2098u;

    /* renamed from: a, reason: collision with root package name */
    public long f2078a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f2079b = 0;

    /* renamed from: f, reason: collision with root package name */
    public Set<IMessageLuaCallback> f2083f = new HashSet();

    public class a implements ILibLoader.c {
        public a() {
        }

        @Override // com.baidu.ar.libloader.ILibLoader.c
        public void onError() {
            h.c(DigitalHuman.TAG, "onError: load dumixar error");
        }

        @Override // com.baidu.ar.libloader.ILibLoader.c
        public void onReady() {
            h.c(DigitalHuman.TAG, "onReady: load dumixar success");
            com.baidu.ar.libloader.a.c();
            DigitalHuman digitalHuman = DigitalHuman.this;
            digitalHuman.a(digitalHuman.f2080c, DigitalHuman.this.f2084g);
            DigitalHuman digitalHuman2 = DigitalHuman.this;
            digitalHuman2.a(digitalHuman2.f2086i, DigitalHuman.this.f2087j);
            StatisticApi.init(DigitalHuman.this.f2080c);
            StatisticApi.onEvent(StatisticConstants.EVENT_AR_DIGIT_START);
            h.c(DigitalHuman.TAG, "SDK Version : 1.3.7.2 mDigitalStateCallback:" + DigitalHuman.this.f2082e);
            DigitalHuman.this.f2078a = System.currentTimeMillis();
        }
    }

    public class b implements TextureView.SurfaceTextureListener {
        public b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
            DigitalHuman digitalHuman = DigitalHuman.this;
            digitalHuman.a(digitalHuman.f2092o);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (DigitalHuman.this.f2092o == null) {
                return false;
            }
            DigitalHuman digitalHuman = DigitalHuman.this;
            digitalHuman.removeOutputView(digitalHuman.f2092o);
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
            DigitalHuman digitalHuman = DigitalHuman.this;
            digitalHuman.a(digitalHuman.f2092o);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (DigitalHuman.this.f2096s != null) {
                return DigitalHuman.this.f2096s.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    public class d implements DuMixCallback {
        public d() {
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onCaseCreate(boolean z7, String str, String str2) {
            h.c(DigitalHuman.TAG, "DuMixCallback  onCaseCreate  result： " + z7 + " casePath:" + str);
            DigitalHuman.this.f2090m = true;
            StringBuilder sb = new StringBuilder();
            sb.append("DigitalTime case load completed Time = ");
            sb.append(((float) (System.currentTimeMillis() - DigitalHuman.this.f2079b)) / 1000.0f);
            h.c(DigitalHuman.TAG, sb.toString());
            if (DigitalHuman.this.f2082e == null || !z7) {
                return;
            }
            DigitalHuman.this.f2082e.onState(DumixState.CASE_LOAD_FINISH, null);
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onCaseDestroy() {
            h.c(DigitalHuman.TAG, "DigitalTime onCaseDestroy");
            h.c(DigitalHuman.TAG, "DuMixCallback  onCaseDestroy  ");
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onError(DuMixErrorType duMixErrorType, String str, String str2) {
            h.c(DigitalHuman.TAG, "DigitalTime onError  errorType : " + duMixErrorType + "  errorMessage : " + str + " extra :" + str2);
            StringBuilder sb = new StringBuilder();
            sb.append("DuMixCallback  onError  errorMessage : ");
            sb.append(str);
            h.c(DigitalHuman.TAG, sb.toString());
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onRelease() {
            h.c(DigitalHuman.TAG, "DigitalTime onRelease");
            h.c(DigitalHuman.TAG, "DuMixCallback  onRelease  ");
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onSetup(boolean z7, DuMixInput duMixInput, DuMixOutput duMixOutput) {
            DigitalHuman.this.f2098u = z7;
            h.c(DigitalHuman.TAG, "DigitalTime setup callback result :" + z7);
            h.c(DigitalHuman.TAG, "DigitalTime setup completed Time = " + (((float) (System.currentTimeMillis() - DigitalHuman.this.f2078a)) / 1000.0f));
            if (DigitalHuman.this.f2082e != null) {
                DigitalHuman.this.f2082e.onState(DumixState.ENGINE_SETUP, "");
            }
            if (z7) {
                DigitalHuman digitalHuman = DigitalHuman.this;
                digitalHuman.loadCaseWithResPath(digitalHuman.f2085h);
            }
        }
    }

    public DigitalHuman(Context context, IMessageSubtitleCallback iMessageSubtitleCallback, IMessageWidgetCallback iMessageWidgetCallback, ISurfaceTouchCallback iSurfaceTouchCallback, IDigitalStateCallback iDigitalStateCallback, String str, String str2, int i8, int i9, boolean z7, boolean z8) {
        new Handler();
        this.f2089l = true;
        this.f2098u = false;
        this.f2080c = context;
        this.f2081d = iSurfaceTouchCallback;
        this.f2082e = iDigitalStateCallback;
        this.f2084g = str;
        this.f2085h = str2;
        this.f2086i = i8;
        this.f2087j = i9;
        a();
    }

    public void addMessageLuaCallback(IMessageLuaCallback iMessageLuaCallback) {
        this.f2083f.add(iMessageLuaCallback);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void addOutputView(TextureView textureView, boolean z7) {
        h.c(TAG, "addOutputView: " + this.f2088k + " mCaseLoadFinish:" + this.f2090m + " textureView:" + textureView);
        if (this.f2088k || textureView == null) {
            return;
        }
        this.f2092o = textureView;
        this.f2093p = z7;
        if (textureView.isAvailable()) {
            a(this.f2092o);
        }
        this.f2092o.setSurfaceTextureListener(new b());
        if (this.f2093p) {
            this.f2092o.setOnTouchListener(new c());
        }
    }

    public void changeAnimation(String str) {
        changeRenderParameter(new l0().a(1).b(1).b("play").a(str).a());
    }

    public void changeRenderParameter(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            h.c(TAG, "changeRenderParameter Thread: params: " + hashMap.toString());
            DuMixController duMixController = this.f2096s;
            if (duMixController != null) {
                duMixController.sendMsg2Lua(hashMap);
            }
        }
    }

    public void destroy() {
        this.f2098u = false;
        h.c(TAG, "destroy");
        TextureView textureView = this.f2092o;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(null);
        }
        destroySDK();
        DuMixController duMixController = this.f2096s;
        if (duMixController != null) {
            duMixController.release();
        }
        if (this.f2091n != null) {
            this.f2091n = null;
            com.baidu.ar.libloader.a.c();
        }
        if (this.f2080c != null) {
            this.f2080c = null;
        }
    }

    public void destroySDK() {
        h.c(TAG, "destroySDK mDigitalStateCallback:" + this.f2082e);
        this.f2082e = null;
        u1.a().b();
    }

    public void finishRecordAudio() {
        IDigital iDigital = this.f2097t;
        if (iDigital != null) {
            iDigital.stopRecord();
        }
    }

    public Context getContext() {
        return this.f2080c;
    }

    public void interruptReading() {
        IDigital iDigital = this.f2097t;
        if (iDigital != null) {
            iDigital.stop();
        }
    }

    public void loadCaseWithResPath(String str) {
        h.c(TAG, "DigitalTime mSetupSuccess :" + this.f2098u);
        h.c(TAG, "DigitalTime begin loadCase  path :" + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f2085h = str;
        h.c(TAG, "loadCaseWithResPath path:" + str);
        String replace = str.replace("/ar", "");
        this.f2079b = System.currentTimeMillis();
        IDigitalStateCallback iDigitalStateCallback = this.f2082e;
        if (iDigitalStateCallback != null) {
            iDigitalStateCallback.onState(DumixState.CASE_LOAD_START, "");
        }
        if (this.f2096s == null || !this.f2098u) {
            return;
        }
        h.c(TAG, "DigitalTime mDuMixController loadCase path :" + replace);
        this.f2096s.loadCase(replace, "");
    }

    @Override // com.baidu.ar.q3
    public void onEngineCreate(int i8) {
        if (i8 == 1 || this.f2082e == null) {
            return;
        }
        h.c(TAG, "onEngineCreate : " + i8 + " Thread:" + Thread.currentThread().getName());
        this.f2082e.onState(DumixState.MULT_ENGINE_SETUP, Integer.valueOf(i8));
    }

    public void pause() {
        h.c(TAG, "pause");
        if (this.f2089l) {
            return;
        }
        this.f2089l = true;
        DuMixController duMixController = this.f2096s;
        if (duMixController != null) {
            duMixController.pause();
        }
    }

    public void removeOutputView(TextureView textureView) {
        h.c(TAG, "removeOutputView");
        if (textureView != null) {
            h.c(TAG, "removeOutputView textureView hashcode:" + textureView.hashCode());
            DuMixController duMixController = this.f2096s;
            if (duMixController != null) {
                this.f2098u = false;
                duMixController.removeOutput(this.f2095r);
            }
        } else {
            h.c(TAG, "removeOutputView textureView is null");
        }
        this.f2088k = false;
    }

    public void resume() {
        h.c(TAG, "resume");
        if (this.f2090m && this.f2089l) {
            this.f2089l = false;
            DuMixController duMixController = this.f2096s;
            if (duMixController != null) {
                duMixController.resume();
            }
        }
    }

    public void sendChatMessage(String str) {
        h.c(TAG, "sendChatMessage textMsg:" + str);
        IDigital iDigital = this.f2097t;
        if (iDigital != null) {
            iDigital.sendChatMessage(str);
        }
    }

    public void sendReadingMessage(String str) {
        h.c(TAG, "sendReadingMessage textMsg:" + str);
        IDigital iDigital = this.f2097t;
        if (iDigital != null) {
            iDigital.sendReadingMessage(str);
        }
    }

    public void setOutputViewStatus(boolean z7) {
        this.f2088k = z7;
    }

    public void startRecordAudio() {
        IDigital iDigital = this.f2097t;
        if (iDigital != null) {
            iDigital.startRecord();
        }
    }

    public void unloadCase() {
        this.f2090m = false;
        h.c(TAG, "unloadCase");
        DuMixController duMixController = this.f2096s;
        if (duMixController != null) {
            duMixController.clearCase();
        }
    }

    public final void a() {
        File file = new File(DuMixController.getSoDownLoadDir(this.f2080c));
        this.f2091n = file;
        com.baidu.ar.libloader.a.a(new com.baidu.ar.libloader.c(file.getAbsolutePath()));
        com.baidu.ar.libloader.a.a("dumixar");
        com.baidu.ar.libloader.a.a("dumixar", new a());
    }

    public final void a(int i8, int i9) {
        this.f2094q = new DuMixInput(i9, i8);
        this.f2095r = new DuMixOutput(i8, i9);
        h.c(TAG, "DigitalTime begin setup!!");
        this.f2096s.setup(this.f2094q, this.f2095r, new d());
    }

    public final void a(Context context, String str) {
        DefaultParams defaultParams = new DefaultParams();
        defaultParams.setDigitalArEnable(true);
        defaultParams.setDigitalSocketEnable(false);
        defaultParams.setDigitalSocketUrl(str);
        defaultParams.setDigitalUnitAppId("i-kgqiz7g0gv22a");
        defaultParams.setDigitalUnitAppKey("2p78v82ihj8cg04edt17");
        defaultParams.setUseBeautyFilter(false);
        defaultParams.setUseFaceFilter(false);
        defaultParams.setUseMakeupFilter(false);
        defaultParams.setRenderPipeline("filter_pipeline = function()\n\n    fm = ae.FilterManager:get_instance();\n\n\n    engine_filter = fm:create_filter(\"EngineFilter\", \"globalEngineFilter\", true);\n    fm:reset_pipeline();\n\n\n    fm:connect_filter_to_camera(engine_filter);\n    fm:connect_filter_to_output(engine_filter);\n\nend\n\nfilter_pipeline()\n\n");
        DuMixController duMixController = DuMixController.getInstance(context, defaultParams);
        this.f2096s = duMixController;
        this.f2097t = duMixController.getARProxyManager().getDigitalAR();
    }

    public final void a(TextureView textureView) {
        DuMixOutput duMixOutput;
        if (this.f2096s == null || (duMixOutput = this.f2095r) == null || textureView == null) {
            return;
        }
        duMixOutput.setOutputWidth(this.f2092o.getWidth());
        this.f2095r.setOutputHeight(this.f2092o.getHeight());
        if (this.f2088k) {
            this.f2096s.changeOutput(this.f2095r);
            return;
        }
        this.f2095r.setOutputSurface(new Surface(textureView.getSurfaceTexture()));
        this.f2088k = true;
        this.f2096s.addOutput(this.f2095r);
    }
}
