package com.baidu.ar;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.baidu.ar.ability.AbilityType;
import com.baidu.ar.arplay.core.engine.rotate.OrientationManager;
import com.baidu.ar.arplay.core.pixel.IPixelReader;
import com.baidu.ar.arplay.core.pixel.PixelReadListener;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelRotation;
import com.baidu.ar.arrender.ARRenderFpsCallback;
import com.baidu.ar.arrender.FrameRenderListener;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.arrender.IGLRenderer;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.auth.ARAuth;
import com.baidu.ar.auth.IAuthenticator;
import com.baidu.ar.auth.IDuMixAuthCallback;
import com.baidu.ar.auth.IOfflineAuthenticator;
import com.baidu.ar.bean.CaseModel;
import com.baidu.ar.bean.Watermark;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.content.IContentPlatform;
import com.baidu.ar.filter.FilterNode;
import com.baidu.ar.filter.FilterParam;
import com.baidu.ar.filter.FilterStateListener;
import com.baidu.ar.filter.IFilter;
import com.baidu.ar.libloader.ILibLoaderPlugin;
import com.baidu.ar.lua.LuaMsgListener;
import com.baidu.ar.photo.IPhoto;
import com.baidu.ar.photo.PhotoCallback;
import com.baidu.ar.record.IRecord;
import com.baidu.ar.record.RecordCallback;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.ar.steploading.IStepLoading;
import com.google.android.exoplayer2.C;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DuMixController implements IDuMix, IFilter, IRecord, IPhoto, IPixelReader {

    /* renamed from: u, reason: collision with root package name */
    public static volatile DuMixController f1474u;

    /* renamed from: v, reason: collision with root package name */
    public static volatile int f1475v;

    /* renamed from: w, reason: collision with root package name */
    public static volatile Object f1476w = new Object();

    /* renamed from: a, reason: collision with root package name */
    public Context f1477a;

    /* renamed from: b, reason: collision with root package name */
    public DefaultParams f1478b;

    /* renamed from: c, reason: collision with root package name */
    public DuMixInput f1479c;

    /* renamed from: d, reason: collision with root package name */
    public DuMixOutput f1480d;

    /* renamed from: e, reason: collision with root package name */
    public DuMixCallback f1481e;

    /* renamed from: f, reason: collision with root package name */
    public HandlerThread f1482f;

    /* renamed from: g, reason: collision with root package name */
    public Handler f1483g;

    /* renamed from: h, reason: collision with root package name */
    public Handler f1484h;

    /* renamed from: i, reason: collision with root package name */
    public DuMixCallback f1485i;

    /* renamed from: j, reason: collision with root package name */
    public r2 f1486j;

    /* renamed from: k, reason: collision with root package name */
    public r3 f1487k;

    /* renamed from: l, reason: collision with root package name */
    public j8 f1488l;

    /* renamed from: m, reason: collision with root package name */
    public com.baidu.ar.arrender.a f1489m;

    /* renamed from: n, reason: collision with root package name */
    public g f1490n;

    /* renamed from: o, reason: collision with root package name */
    public w f1491o;

    /* renamed from: p, reason: collision with root package name */
    public y f1492p;

    /* renamed from: q, reason: collision with root package name */
    public OrientationManager f1493q;

    /* renamed from: r, reason: collision with root package name */
    public k f1494r;

    /* renamed from: s, reason: collision with root package name */
    public IContentPlatform f1495s;

    /* renamed from: t, reason: collision with root package name */
    public p9 f1496t;

    public class a implements DuMixCallback {

        /* renamed from: com.baidu.ar.DuMixController$a$a, reason: collision with other inner class name */
        public class RunnableC0027a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f1498a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DuMixInput f1499b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DuMixOutput f1500c;

            public RunnableC0027a(boolean z7, DuMixInput duMixInput, DuMixOutput duMixOutput) {
                this.f1498a = z7;
                this.f1499b = duMixInput;
                this.f1500c = duMixOutput;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (DuMixController.this.f1481e != null) {
                    h.a("DuMixController", "mDuMixCallback.onSetup()");
                    DuMixController.this.f1481e.onSetup(this.f1498a, this.f1499b, this.f1500c);
                }
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f1502a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f1503b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f1504c;

            public b(boolean z7, String str, String str2) {
                this.f1502a = z7;
                this.f1503b = str;
                this.f1504c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                DuMixCallback duMixCallback = DuMixController.this.f1481e;
                if (duMixCallback != null) {
                    duMixCallback.onCaseCreate(this.f1502a, this.f1503b, this.f1504c);
                }
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                DuMixCallback duMixCallback = DuMixController.this.f1481e;
                if (duMixCallback != null) {
                    duMixCallback.onCaseDestroy();
                }
            }
        }

        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                DuMixCallback duMixCallback = DuMixController.this.f1481e;
                if (duMixCallback != null) {
                    duMixCallback.onRelease();
                    DuMixController.this.f1481e = null;
                }
            }
        }

        public class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ DuMixErrorType f1508a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f1509b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f1510c;

            public e(DuMixErrorType duMixErrorType, String str, String str2) {
                this.f1508a = duMixErrorType;
                this.f1509b = str;
                this.f1510c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                DuMixCallback duMixCallback = DuMixController.this.f1481e;
                if (duMixCallback != null) {
                    duMixCallback.onError(this.f1508a, this.f1509b, this.f1510c);
                }
            }
        }

        public a() {
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onCaseCreate(boolean z7, String str, String str2) {
            if (DuMixController.this.f1484h != null) {
                DuMixController.this.f1484h.post(new b(z7, str, str2));
            }
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onCaseDestroy() {
            if (DuMixController.this.f1484h != null) {
                DuMixController.this.f1484h.post(new c());
            }
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onError(DuMixErrorType duMixErrorType, String str, String str2) {
            if (DuMixController.this.f1484h != null) {
                DuMixController.this.f1484h.post(new e(duMixErrorType, str, str2));
            }
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onRelease() {
            h.a("DuMixController", "getDuMixCallbackProxy onRelease sState = " + DuMixController.f1475v);
            int unused = DuMixController.f1475v = 0;
            synchronized (DuMixController.f1476w) {
                try {
                    DuMixController.f1476w.notifyAll();
                } catch (Exception unused2) {
                    h.a("DuMixController", "onRelease normal!!!");
                }
            }
            if (DuMixController.this.f1484h != null) {
                DuMixController.this.f1484h.post(new d());
                DuMixController.this.f1484h = null;
            }
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onSetup(boolean z7, DuMixInput duMixInput, DuMixOutput duMixOutput) {
            h.a("DuMixController", "getDuMixCallbackProxy onSetup sState = " + DuMixController.f1475v);
            int unused = DuMixController.f1475v = z7 ? 2 : 0;
            if (DuMixController.this.f1486j != null) {
                DuMixController.this.f1486j.b();
            }
            if (DuMixController.this.f1484h != null) {
                DuMixController.this.f1484h.post(new RunnableC0027a(z7, duMixInput, duMixOutput));
            }
            synchronized (DuMixController.f1476w) {
                try {
                    DuMixController.f1476w.notifyAll();
                } catch (Exception unused2) {
                    h.a("DuMixController", "onSetup normal!!!");
                }
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 3000:
                    DuMixController.this.h();
                    break;
                case 3001:
                    DuMixController.this.e();
                    break;
                case 3002:
                    DuMixController.this.g();
                    break;
                case 3003:
                    DuMixController.this.f();
                    break;
                case 3004:
                    DuMixController.this.a((CaseModel) message.obj);
                    break;
                case AuthApiStatusCodes.AUTH_URL_RESOLUTION /* 3005 */:
                    DuMixController.this.d();
                    break;
                case AuthApiStatusCodes.AUTH_APP_CERT_ERROR /* 3006 */:
                    if (DuMixController.this.f1489m != null) {
                        DuMixController.this.f1489m.changeOutputSize(message.arg1, message.arg2);
                        break;
                    }
                    break;
                case 3007:
                    DuMixController.this.f1480d = (DuMixOutput) message.obj;
                    if (DuMixController.this.f1489m != null) {
                        DuMixController.this.f1489m.changeOutput(DuMixController.this.f1480d);
                        break;
                    }
                    break;
                case 3008:
                    if (DuMixController.this.f1489m != null) {
                        DuMixController.this.f1489m.pauseScene();
                        break;
                    }
                    break;
                case 3009:
                    if (DuMixController.this.f1489m != null) {
                        DuMixController.this.f1489m.resumeScene();
                        break;
                    }
                    break;
                case 3010:
                    if (DuMixController.this.f1489m != null) {
                        DuMixController.this.f1489m.a(message.obj, message.arg1, message.arg2);
                        break;
                    }
                    break;
                case 3011:
                    if (DuMixController.this.f1489m != null) {
                        DuMixController.this.f1489m.addOutputSurface((DuMixOutput) message.obj);
                        break;
                    }
                    break;
                case 3012:
                    if (DuMixController.this.f1489m != null) {
                        DuMixController.this.f1489m.removeOutputSurface((DuMixOutput) message.obj);
                        break;
                    }
                    break;
            }
        }
    }

    public DuMixController(Context context, DefaultParams defaultParams) {
        this.f1477a = context;
        if (defaultParams != null) {
            this.f1478b = defaultParams;
        } else {
            this.f1478b = new DefaultParams();
        }
        h.a("DuMixController", "create DuMixController sState = " + f1475v);
        if (f1475v == 3) {
            synchronized (f1476w) {
                try {
                    h.a("DuMixController", "create DuMixController wait for release!");
                    f1476w.wait(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                } catch (Exception unused) {
                    h.b("DuMixController", "create DuMixController wait error!!!");
                }
            }
        }
        HandlerThread handlerThread = new HandlerThread("DuMixController");
        this.f1482f = handlerThread;
        handlerThread.start();
        this.f1483g = new b(this.f1482f.getLooper());
        o0.a().a(this.f1482f.getLooper());
        a(this.f1477a, this.f1478b);
    }

    public static IAuthenticator getAsyncAuthenticator(String str, String str2, String str3) {
        return com.baidu.ar.b.a(str, str2, str3);
    }

    public static IAuthenticator getAuthenticator() {
        return com.baidu.ar.b.a();
    }

    public static DuMixController getInstance(Context context, DefaultParams defaultParams) {
        if (context == null) {
            h.b("DuMixController", "getInstance() context must be set!!!");
            return null;
        }
        if (f1474u == null) {
            synchronized (DuMixController.class) {
                try {
                    if (f1474u == null) {
                        f1474u = new DuMixController(context, defaultParams);
                    }
                } finally {
                }
            }
        }
        return f1474u;
    }

    public static IOfflineAuthenticator getOfflineAuthenticator() {
        return com.baidu.ar.b.b();
    }

    public static String getSoDownLoadDir(Context context) {
        return r2.a(context);
    }

    public static int getVersionCode() {
        return o.a();
    }

    public static String getVersionName() {
        return o.b();
    }

    public boolean addAbility(String str, String str2) {
        return addAbility(str, str2, null);
    }

    @Override // com.baidu.ar.IDuMix
    public void addFrameRenderListener(FrameRenderListener frameRenderListener) {
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.addFrameRenderListener(frameRenderListener);
        }
    }

    public boolean addLuaMsgListener(LuaMsgListener luaMsgListener) {
        r3 r3Var = this.f1487k;
        if (r3Var == null || r3Var.d() == null) {
            return false;
        }
        return this.f1487k.d().a(luaMsgListener);
    }

    @Override // com.baidu.ar.IDuMix
    public void addOutput(DuMixOutput duMixOutput) {
        Handler handler;
        if (duMixOutput == null || (handler = this.f1483g) == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(3011, duMixOutput));
    }

    public boolean adjustAbility(AbilityType abilityType, HashMap<String, Object> hashMap) {
        if (this.f1491o == null || abilityType == null || f1475v != 2) {
            return false;
        }
        return this.f1491o.b(abilityType.getTypeValue(), hashMap);
    }

    @Override // com.baidu.ar.IDuMix
    public void changeInputSize(int i8, int i9) {
        h.a("DuMixController", "changeInputSize width * height = " + i8 + " * " + i9);
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(3010, i8, i9, null));
        }
    }

    @Override // com.baidu.ar.IDuMix
    public void changeOutput(DuMixOutput duMixOutput) {
        Handler handler;
        if (duMixOutput == null || (handler = this.f1483g) == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(3007, duMixOutput));
    }

    @Override // com.baidu.ar.IDuMix
    public void changeOutputObject(Object obj, int i8, int i9) {
        com.baidu.ar.arrender.a aVar;
        if (obj == null || (aVar = this.f1489m) == null) {
            return;
        }
        aVar.b(obj, i8, i9);
    }

    @Override // com.baidu.ar.IDuMix
    public void changeOutputSize(int i8, int i9) {
        h.a("DuMixController", "changeOutputSize width * height = " + i8 + " * " + i9);
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(AuthApiStatusCodes.AUTH_APP_CERT_ERROR, i8, i9));
        }
    }

    @Deprecated
    public List<Integer> checkAuth(byte[] bArr, IDuMixAuthCallback iDuMixAuthCallback) {
        return ARAuth.checkAuth(this.f1477a, bArr, iDuMixAuthCallback);
    }

    @Override // com.baidu.ar.filter.IFilter
    public void clearAllFilter() {
        if (this.f1490n == null || f1475v != 2) {
            return;
        }
        this.f1490n.b();
    }

    @Override // com.baidu.ar.IDuMix
    public void clearCase() {
        h.a("DuMixController", "AR clearCase");
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(AuthApiStatusCodes.AUTH_URL_RESOLUTION));
        }
    }

    @Override // com.baidu.ar.arplay.core.pixel.IPixelReader
    public void createPixelReader(PixelReadParams pixelReadParams, PixelReadListener pixelReadListener) {
        r2 r2Var;
        com.baidu.ar.arrender.a aVar;
        if ((f1475v == 0 || f1475v == 1) && (r2Var = this.f1486j) != null) {
            r2Var.a(pixelReadParams, pixelReadListener);
        } else {
            if (f1475v != 2 || (aVar = this.f1489m) == null) {
                return;
            }
            aVar.a(pixelReadParams, pixelReadListener);
        }
    }

    public final void d() {
        if (this.f1486j == null || f1475v != 2) {
            h.b("DuMixController", "handleClearCase DuMix has not setup!!!!!!");
        } else {
            this.f1486j.a();
        }
    }

    @Override // com.baidu.ar.arplay.core.pixel.IPixelReader
    public void destroyPixelReader(PixelReadParams pixelReadParams, PixelReadListener pixelReadListener) {
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.b(pixelReadParams, pixelReadListener);
        }
    }

    public final void e() {
        if (f1475v != 2) {
            return;
        }
        w wVar = this.f1491o;
        if (wVar != null) {
            wVar.j();
        }
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.pause();
        }
        OrientationManager orientationManager = this.f1493q;
        if (orientationManager != null) {
            orientationManager.disable();
        }
        StatisticApi.pause();
        r2 r2Var = this.f1486j;
        if (r2Var != null) {
            r2Var.c("pause");
        }
        p9 p9Var = this.f1496t;
        if (p9Var != null) {
            p9Var.a();
        }
    }

    public final void f() {
        h.a("DuMixController", "handleRelease() sState = " + f1475v);
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f1483g = null;
        }
        this.f1495s = null;
        r2 r2Var = this.f1486j;
        if (r2Var != null) {
            r2Var.n();
        }
        j8 j8Var = this.f1488l;
        if (j8Var != null) {
            j8Var.b();
            this.f1488l = null;
        }
        g gVar = this.f1490n;
        if (gVar != null) {
            gVar.b();
            this.f1490n.e();
            this.f1490n = null;
        }
        w wVar = this.f1491o;
        if (wVar != null) {
            wVar.k();
            this.f1491o = null;
        }
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.release();
            this.f1489m = null;
        }
        OrientationManager orientationManager = this.f1493q;
        if (orientationManager != null) {
            orientationManager.destroy();
            this.f1493q = null;
        }
        y yVar = this.f1492p;
        if (yVar != null) {
            yVar.e();
            this.f1492p = null;
        }
        com.baidu.ar.libloader.a.c();
        ARAuth.release();
        StatisticApi.onEventEnd(StatisticConstants.EVENT_CASE_END);
        StatisticApi.onEventEnd(StatisticConstants.EVENT_SDK_END);
        StatisticApi.release();
        r3 r3Var = this.f1487k;
        if (r3Var != null) {
            r3Var.c();
            this.f1487k = null;
        }
        r2 r2Var2 = this.f1486j;
        if (r2Var2 != null) {
            r2Var2.m();
            this.f1486j = null;
        }
        p9 p9Var = this.f1496t;
        if (p9Var != null) {
            p9Var.b();
            this.f1496t = null;
        }
        this.f1479c = null;
        this.f1480d = null;
        this.f1478b = null;
        this.f1485i = null;
        this.f1477a = null;
        h.a("DuMixController", "handleRelease() end");
        HandlerThread handlerThread = this.f1482f;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f1482f = null;
        }
        p9 p9Var2 = this.f1496t;
        if (p9Var2 != null) {
            p9Var2.b();
        }
    }

    public ARProxyManager getARProxyManager() {
        w wVar = this.f1491o;
        if (wVar != null) {
            return wVar.d();
        }
        return null;
    }

    public IARRenderer getARRenderer() {
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    public List<String> getActiveAbilities() {
        if (this.f1491o == null || f1475v != 2) {
            return null;
        }
        return this.f1491o.e();
    }

    public IContentPlatform getContentPlatform() {
        if (this.f1495s == null) {
            this.f1495s = (IContentPlatform) ab.a("com.baidu.ar.content.ContentCloud", new Class[]{Context.class}, new Object[]{this.f1477a});
        }
        return this.f1495s;
    }

    public IGLRenderer getGLRenderer() {
        IARRenderer iARRenderer = this.f1489m;
        if (iARRenderer == null || !(iARRenderer instanceof IGLRenderer)) {
            return null;
        }
        return (IGLRenderer) iARRenderer;
    }

    public Map<String, Object> getGradingInfo() {
        y yVar = this.f1492p;
        if (yVar != null) {
            return yVar.c();
        }
        return null;
    }

    public IStepLoading getStepLoading() {
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            return aVar.n();
        }
        return null;
    }

    public List<String> getSupportedAbilities() {
        if (this.f1491o == null || f1475v != 2) {
            return null;
        }
        return this.f1491o.g();
    }

    public boolean isAbilityActive(AbilityType abilityType) {
        if (this.f1491o == null || abilityType == null || f1475v != 2) {
            return false;
        }
        return this.f1491o.d(abilityType.getTypeValue());
    }

    public boolean isAbilitySupported(String str) {
        if (this.f1491o == null || f1475v != 2) {
            return false;
        }
        return this.f1491o.e(str);
    }

    @Override // com.baidu.ar.IDuMix
    public void loadCase(ARType aRType, String str, String str2) {
        h.a("DuMixController", "AR loadCase");
        if (this.f1483g != null) {
            CaseModel caseModel = new CaseModel(aRType, str, str2);
            Handler handler = this.f1483g;
            handler.sendMessage(handler.obtainMessage(3004, caseModel));
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f1489m == null || f1475v != 2) {
            return false;
        }
        return this.f1489m.onTouch(view, motionEvent);
    }

    @Override // com.baidu.ar.IDuMix
    public void pause() {
        h.a("DuMixController", "AR pause");
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(3001));
        }
    }

    @Override // com.baidu.ar.record.IRecord
    public void pauseRecord() {
        if (this.f1494r == null || f1475v != 2) {
            return;
        }
        this.f1494r.pauseRecord();
    }

    @Override // com.baidu.ar.IDuMix
    public void pauseScene() {
        h.a("DuMixController", "AR pauseScene");
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(3008));
        }
    }

    @Override // com.baidu.ar.IDuMix
    public void release() {
        h.a("DuMixController", "release() sState = " + f1475v);
        b9.b().d();
        if (f1475v == 1) {
            com.baidu.ar.arrender.a aVar = this.f1489m;
            if (aVar == null || !aVar.d()) {
                synchronized (f1476w) {
                    try {
                        h.a("DuMixController", "release DuMixController wait for setup!");
                        f1476w.wait(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                    } catch (Exception unused) {
                        h.b("DuMixController", "release DuMixController wait error!!!");
                    }
                }
            } else {
                this.f1489m.b(true);
                Handler handler = this.f1483g;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    Handler handler2 = this.f1483g;
                    handler2.sendMessage(handler2.obtainMessage(3003));
                }
                f1475v = 0;
                f1474u = null;
            }
        }
        if (f1475v == 0) {
            f1474u = null;
            return;
        }
        if (f1475v == 3) {
            return;
        }
        if (f1475v != 2) {
            h.b("DuMixController", "release error!!!");
            return;
        }
        f1475v = 3;
        Handler handler3 = this.f1483g;
        if (handler3 != null) {
            handler3.removeCallbacksAndMessages(null);
            Handler handler4 = this.f1483g;
            handler4.sendMessage(handler4.obtainMessage(3003));
        }
        f1474u = null;
    }

    @Override // com.baidu.ar.IDuMix
    public void removeFrameRenderListener(FrameRenderListener frameRenderListener) {
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.removeFrameRenderListener(frameRenderListener);
        }
    }

    public boolean removeLuaMsgListener(LuaMsgListener luaMsgListener) {
        r3 r3Var = this.f1487k;
        if (r3Var == null || r3Var.d() == null) {
            return false;
        }
        return this.f1487k.d().b(luaMsgListener);
    }

    @Override // com.baidu.ar.IDuMix
    public void removeOutput(DuMixOutput duMixOutput) {
        Handler handler;
        if (duMixOutput == null || (handler = this.f1483g) == null) {
            return;
        }
        handler.sendMessage(handler.obtainMessage(3012, duMixOutput));
    }

    @Override // com.baidu.ar.filter.IFilter
    public void resetAllFilter() {
        if (this.f1490n == null || f1475v != 2) {
            return;
        }
        this.f1490n.f();
    }

    @Override // com.baidu.ar.IDuMix
    public void resume() {
        h.a("DuMixController", "AR resume");
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(3002));
        }
    }

    @Override // com.baidu.ar.record.IRecord
    public void resumeRecord() {
        if (this.f1494r == null || f1475v != 2) {
            return;
        }
        this.f1494r.resumeRecord();
    }

    @Override // com.baidu.ar.IDuMix
    public void resumeScene() {
        h.a("DuMixController", "AR resumeScene");
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(3009));
        }
    }

    public boolean sendLuaScript2Engine(String str) {
        if (this.f1487k == null || f1475v != 2) {
            return false;
        }
        this.f1487k.b(str);
        return true;
    }

    public boolean sendMsg2Lua(HashMap<String, Object> hashMap) {
        if (this.f1487k == null || f1475v != 2) {
            return false;
        }
        this.f1487k.a(1902, hashMap);
        return true;
    }

    public void setARRenderFpsCallback(ARRenderFpsCallback aRRenderFpsCallback) {
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.a(aRRenderFpsCallback);
        }
    }

    public void setAuthLicense(byte[] bArr, String str, String str2, String str3) {
        ARAuth.setAuthLicense(bArr, str, str2, str3);
    }

    public void setDefinedLuaListener(DefinedLuaListener definedLuaListener) {
        if (this.f1488l == null) {
            this.f1488l = new j8(this.f1487k);
        }
        this.f1488l.a(definedLuaListener);
    }

    public void setDownloadComplete() {
        this.f1496t.d();
    }

    @Override // com.baidu.ar.filter.IFilter
    public void setFilterStateListener(FilterStateListener filterStateListener) {
        g gVar = this.f1490n;
        if (gVar != null) {
            gVar.a(filterStateListener);
        }
    }

    public void setGLWebViewUseable(Context context, ViewGroup viewGroup) {
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.setGLWebViewUseable(context, viewGroup);
        }
    }

    public void setLibLoadPlugin(ILibLoaderPlugin iLibLoaderPlugin) {
        com.baidu.ar.libloader.a.a(iLibLoaderPlugin);
    }

    public void setMdlModelPath(String str) {
        w wVar = this.f1491o;
        if (wVar != null) {
            wVar.h(str);
        }
    }

    public void setNativeWebViewUseable(Context context, ViewGroup viewGroup) {
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.setNativeWebViewUseable(context, viewGroup);
        }
    }

    @Override // com.baidu.ar.record.IRecord
    public void setRecordWatermark(Watermark watermark) {
        if (f1475v == 2) {
            if (this.f1494r == null && this.f1489m != null) {
                this.f1494r = new k(this.f1477a, this.f1489m);
            }
            k kVar = this.f1494r;
            if (kVar != null) {
                kVar.setRecordWatermark(watermark);
            }
        }
    }

    @Override // com.baidu.ar.IDuMix
    public void setStateListener(DuMixStateListener duMixStateListener) {
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.setStateListener(duMixStateListener);
        }
    }

    @Override // com.baidu.ar.IDuMix
    public void setup(DuMixInput duMixInput, DuMixOutput duMixOutput, DuMixCallback duMixCallback) {
        b9 b8;
        int i8;
        h.a("DuMixController", "setup() sState = " + f1475v);
        if (duMixInput == null || duMixOutput == null) {
            h.b("DuMixController", "setup error!!! params maybe null!!!");
            if (duMixCallback != null) {
                duMixCallback.onSetup(false, duMixInput, duMixOutput);
                return;
            }
            return;
        }
        this.f1479c = duMixInput;
        this.f1480d = duMixOutput;
        this.f1481e = duMixCallback;
        DefaultParams defaultParams = this.f1478b;
        if (defaultParams == null || !defaultParams.isDigitalArEnable()) {
            b8 = b9.b();
            i8 = 2;
        } else {
            b8 = b9.b();
            i8 = 1;
        }
        b8.a(i8);
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(3000));
        }
    }

    public boolean startAbility(AbilityType abilityType, HashMap<String, Object> hashMap) {
        if (this.f1491o == null || abilityType == null || f1475v != 2) {
            return false;
        }
        return this.f1491o.a(abilityType.getTypeValue(), hashMap, true);
    }

    @Override // com.baidu.ar.record.IRecord
    public void startRecord(String str, long j8, RecordCallback recordCallback) {
        DefaultParams defaultParams;
        if (f1475v == 2) {
            if (this.f1494r == null && this.f1489m != null) {
                this.f1494r = new k(this.f1477a, this.f1489m);
            }
            r2 r2Var = this.f1486j;
            if (r2Var != null) {
                r2Var.b("start");
            }
            if (this.f1494r != null) {
                if (this.f1480d != null && (defaultParams = this.f1478b) != null && defaultParams.isRecordAutoCrop()) {
                    this.f1494r.a(this.f1480d.getOutputWidth(), this.f1480d.getOutputHeight());
                }
                this.f1494r.startRecord(str, j8, recordCallback);
            }
        }
    }

    public boolean stopAbility(AbilityType abilityType) {
        if (this.f1491o == null || abilityType == null || f1475v != 2) {
            return false;
        }
        return this.f1491o.a(abilityType.getTypeValue(), true);
    }

    @Override // com.baidu.ar.record.IRecord
    public void stopRecord() {
        if (f1475v == 2) {
            k kVar = this.f1494r;
            if (kVar != null) {
                kVar.stopRecord();
                this.f1494r = null;
            }
            r2 r2Var = this.f1486j;
            if (r2Var != null) {
                r2Var.b("stop");
            }
        }
    }

    @Override // com.baidu.ar.photo.IPhoto
    public void takePicture(String str, PhotoCallback photoCallback) {
        if (this.f1489m == null || f1475v != 2) {
            return;
        }
        new da().a(this.f1489m, str, photoCallback);
    }

    @Override // com.baidu.ar.filter.IFilter
    public void updateFaceFilterWithKneadJson(String str) {
        if (this.f1490n == null || TextUtils.isEmpty(str) || f1475v != 2) {
            return;
        }
        this.f1490n.a(FilterNode.faceFilter.getNodeName(), FilterParam.FaceFilter.kneadJsonStr.getParamName(), str);
    }

    @Override // com.baidu.ar.filter.IFilter
    public void updateFilter(FilterParam filterParam, float f8) {
        if (this.f1490n == null || f1475v != 2) {
            return;
        }
        this.f1490n.a(filterParam, Float.valueOf(f8));
    }

    @Override // com.baidu.ar.filter.IFilter
    public String updateFilterCase(String str) {
        if (this.f1490n == null || f1475v != 2) {
            return null;
        }
        return this.f1490n.d(str);
    }

    @Override // com.baidu.ar.arplay.core.pixel.IPixelReader
    public void updatePixelReader(PixelReadParams pixelReadParams, PixelRotation pixelRotation) {
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.a(pixelReadParams, pixelRotation);
        }
    }

    public boolean addAbility(String str, String str2, String str3) {
        w wVar = this.f1491o;
        if (wVar != null) {
            return wVar.a(str, Arrays.asList(str2), str3);
        }
        return false;
    }

    public boolean adjustAbility(String str, HashMap<String, Object> hashMap) {
        if (this.f1491o == null || TextUtils.isEmpty(str) || f1475v != 2) {
            return false;
        }
        return this.f1491o.b(str, hashMap);
    }

    public final DuMixCallback c() {
        return new a();
    }

    @Override // com.baidu.ar.IDuMix
    public void changeInputSize(SurfaceTexture surfaceTexture, int i8, int i9) {
        h.a("DuMixController", "changeInputSize width * height = " + i8 + " * " + i9 + " && texture = " + surfaceTexture);
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(3010, i8, i9, surfaceTexture));
        }
    }

    @Deprecated
    public List<Integer> checkAuth(byte[] bArr, ICallbackWith<List<Integer>> iCallbackWith, ICallbackWith<Integer> iCallbackWith2) {
        return ARAuth.checkAuth(this.f1477a, bArr, iCallbackWith, iCallbackWith2);
    }

    public final void g() {
        if (f1475v != 2) {
            return;
        }
        r2 r2Var = this.f1486j;
        if (r2Var != null) {
            r2Var.c("resume");
        }
        StatisticApi.resume();
        OrientationManager orientationManager = this.f1493q;
        if (orientationManager != null) {
            orientationManager.enable();
        }
        com.baidu.ar.arrender.a aVar = this.f1489m;
        if (aVar != null) {
            aVar.resume();
        }
        w wVar = this.f1491o;
        if (wVar != null) {
            wVar.m();
        }
        p9 p9Var = this.f1496t;
        if (p9Var != null) {
            p9Var.c();
        }
    }

    public final void h() {
        h.a("DuMixController", "handleSetup() sState = " + f1475v);
        if (f1475v != 0 || this.f1486j == null || this.f1489m == null || this.f1490n == null || this.f1491o == null || this.f1492p == null) {
            return;
        }
        f1475v = 1;
        this.f1485i = c();
        this.f1486j.a(this.f1489m, this.f1491o, this.f1490n, this.f1487k);
        this.f1486j.a(this.f1479c, this.f1480d, this.f1485i);
        StatisticApi.setPubParam(StatisticConstants.FRAME_DATA_FROM, this.f1479c.isCameraInput() ? PixelReadParams.DEFAULT_FILTER_ID : "video");
        StatisticApi.onEventStart(StatisticConstants.EVENT_SDK_START);
        this.f1493q.addOrientationListener(this.f1489m);
        this.f1493q.enable();
        this.f1490n.a((IARRenderer) this.f1489m);
        y yVar = this.f1492p;
        if (yVar != null) {
            JSONObject d8 = yVar.d();
            if (d8 != null) {
                this.f1489m.a(d8);
            } else {
                this.f1489m.a(this.f1492p.b());
            }
        }
        this.f1491o.a(this.f1487k, this.f1489m);
        this.f1489m.a(this.f1479c, this.f1480d);
        this.f1486j.a(this.f1492p);
        this.f1486j.c();
    }

    public boolean isAbilityActive(String str) {
        if (this.f1491o == null || TextUtils.isEmpty(str) || f1475v != 2) {
            return false;
        }
        return this.f1491o.d(str);
    }

    @Override // com.baidu.ar.IDuMix
    public void loadCase(String str, String str2) {
        loadCase(null, str, str2);
    }

    public boolean startAbility(String str, HashMap<String, Object> hashMap) {
        if (this.f1491o == null || TextUtils.isEmpty(str) || f1475v != 2) {
            return false;
        }
        return this.f1491o.a(str, hashMap, true);
    }

    public boolean stopAbility(String str) {
        if (this.f1491o == null || TextUtils.isEmpty(str) || f1475v != 2) {
            return false;
        }
        return this.f1491o.a(str, true);
    }

    @Override // com.baidu.ar.filter.IFilter
    public void updateFilter(FilterParam filterParam, int i8) {
        if (this.f1490n == null || f1475v != 2) {
            return;
        }
        this.f1490n.a(filterParam, Integer.valueOf(i8));
    }

    public boolean addAbility(String str, List<String> list) {
        w wVar = this.f1491o;
        if (wVar != null) {
            return wVar.a(str, list, (String) null);
        }
        return false;
    }

    @Override // com.baidu.ar.IDuMix
    public void changeInputSize(Texture texture, int i8, int i9) {
        h.a("DuMixController", "changeInputSize width * height = " + i8 + " * " + i9 + " && texture = " + texture);
        Handler handler = this.f1483g;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(3010, i8, i9, texture));
        }
    }

    @Override // com.baidu.ar.filter.IFilter
    public void updateFilter(FilterParam filterParam, String str) {
        if (this.f1490n == null || f1475v != 2) {
            return;
        }
        this.f1490n.a(filterParam, str);
    }

    @Override // com.baidu.ar.filter.IFilter
    public void updateFilter(FilterParam filterParam, List<Point> list) {
        if (list == null || f1475v != 2) {
            return;
        }
        float[] fArr = new float[list.size() * 2];
        for (int i8 = 0; i8 < list.size(); i8++) {
            int i9 = i8 * 2;
            fArr[i9] = list.get(i8).x;
            fArr[i9 + 1] = list.get(i8).y;
        }
        g gVar = this.f1490n;
        if (gVar == null || filterParam == null) {
            return;
        }
        gVar.a(filterParam.getFilterNode().getNodeName(), filterParam.getParamName(), Integer.valueOf(list.size()), "_count", false);
        this.f1490n.a(filterParam, fArr);
    }

    public final void a(Context context, DefaultParams defaultParams) {
        h.a("DuMixController", "createManagers start!!!");
        if (this.f1484h == null) {
            this.f1484h = new Handler(context.getMainLooper());
        }
        h.a(defaultParams.isLogEnable());
        f.b(context.getPackageName());
        if (this.f1493q == null) {
            this.f1493q = new OrientationManager(context);
        }
        StatisticApi.init(context);
        if (this.f1486j == null) {
            r2 r2Var = new r2(context, defaultParams, this.f1482f);
            this.f1486j = r2Var;
            r2Var.a(this);
        }
        if (this.f1492p == null) {
            y yVar = new y(context);
            this.f1492p = yVar;
            yVar.a(defaultParams.getGradingConfig());
        }
        if (this.f1490n == null) {
            this.f1490n = new g(defaultParams);
            this.f1491o = new w(context, this.f1482f.getLooper(), defaultParams, this.f1492p, this.f1490n);
        }
        if (this.f1487k == null) {
            r3 r3Var = new r3(context);
            this.f1487k = r3Var;
            r3Var.a(defaultParams.isUserPlayAudio());
        }
        if (defaultParams.getOBRConfig() != null && this.f1496t == null) {
            this.f1496t = new p9(this.f1477a, this.f1487k, defaultParams.getOBRConfig());
        }
        if (this.f1489m == null) {
            this.f1489m = defaultParams.isUseTextureIO() ? new m(context, this.f1482f.getLooper(), this.f1487k, defaultParams.getShareContext(), defaultParams.get3dShaderDBPath()) : new com.baidu.ar.arrender.a(context, this.f1482f.getLooper(), this.f1487k, defaultParams.get3dShaderDBPath());
            if (!TextUtils.isEmpty(defaultParams.getRenderPipeline())) {
                this.f1489m.setDefaultPipeLine(defaultParams.getRenderPipeline());
            }
        }
        h.a("DuMixController", "createManagers end!!!");
    }

    @Override // com.baidu.ar.filter.IFilter
    public void updateFilter(FilterParam filterParam, float[] fArr) {
        if (this.f1490n == null || f1475v != 2) {
            return;
        }
        this.f1490n.a(filterParam, fArr);
    }

    @Override // com.baidu.ar.filter.IFilter
    public void updateFilter(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.f1490n == null || f1475v != 2) {
            return;
        }
        this.f1490n.a(str, str2, obj);
    }

    public final void a(CaseModel caseModel) {
        com.baidu.ar.arrender.a aVar;
        DefaultParams defaultParams = this.f1478b;
        if (defaultParams != null && defaultParams.isDigitalArEnable() && (aVar = this.f1489m) != null) {
            aVar.setAvatarGestureConfig();
        }
        DefaultParams defaultParams2 = this.f1478b;
        if (defaultParams2 != null && defaultParams2.getOBRConfig() != null) {
            this.f1496t.e();
        }
        if (this.f1486j != null && f1475v == 2) {
            this.f1486j.c(caseModel.mCaseType, caseModel.mCasePath, caseModel.mCaseId);
            return;
        }
        h.b("DuMixController", "handleLoadCase DuMix has not setup!!!!!!");
        DuMixCallback duMixCallback = this.f1485i;
        if (duMixCallback != null) {
            duMixCallback.onCaseCreate(false, caseModel.mCasePath, caseModel.mCaseId);
        }
    }
}
