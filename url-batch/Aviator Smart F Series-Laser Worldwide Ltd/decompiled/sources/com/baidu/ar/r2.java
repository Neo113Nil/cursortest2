package com.baidu.ar;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertification.utils.Constant;
import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.baidu.ar.arplay.core.pixel.PixelReadListener;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.auth.ARAuth;
import com.baidu.ar.auth.IAuthCallback;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.bean.CaseModel;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.libloader.ILibLoader;
import com.baidu.ar.libloader.c;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r2 {

    /* renamed from: a, reason: collision with root package name */
    public Context f2996a;

    /* renamed from: b, reason: collision with root package name */
    public DefaultParams f2997b;

    /* renamed from: c, reason: collision with root package name */
    public DuMixInput f2998c;

    /* renamed from: d, reason: collision with root package name */
    public DuMixOutput f2999d;

    /* renamed from: e, reason: collision with root package name */
    public DuMixCallback f3000e;

    /* renamed from: f, reason: collision with root package name */
    public r3 f3001f;

    /* renamed from: g, reason: collision with root package name */
    public List<Integer> f3002g;

    /* renamed from: h, reason: collision with root package name */
    public s3 f3003h;

    /* renamed from: i, reason: collision with root package name */
    public com.baidu.ar.arrender.a f3004i;

    /* renamed from: j, reason: collision with root package name */
    public com.baidu.ar.g f3005j;

    /* renamed from: k, reason: collision with root package name */
    public w f3006k;

    /* renamed from: o, reason: collision with root package name */
    public CaseModel f3010o;

    /* renamed from: p, reason: collision with root package name */
    public String f3011p;

    /* renamed from: q, reason: collision with root package name */
    public String f3012q;

    /* renamed from: s, reason: collision with root package name */
    public CaseModel f3014s;

    /* renamed from: z, reason: collision with root package name */
    public i f3021z;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3007l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3008m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3009n = false;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f3013r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3015t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3016u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3017v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3018w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3019x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3020y = true;
    public ConcurrentHashMap<PixelReadParams, PixelReadListener> A = new ConcurrentHashMap<>();

    public class a implements ILibLoader.a {
        public a() {
        }

        @Override // com.baidu.ar.libloader.ILibLoader.a
        public void a(ARType aRType, String str, String str2) {
            r2.this.a(aRType, str, str2);
        }

        @Override // com.baidu.ar.libloader.ILibLoader.a
        public void a(DuMixErrorType duMixErrorType, String str) {
            DuMixCallback duMixCallback = r2.this.f3000e;
            if (duMixCallback != null) {
                duMixCallback.onError(duMixErrorType, str, "");
            }
        }
    }

    public class b implements c.a {
        public b() {
        }

        @Override // com.baidu.ar.libloader.c.a
        public void a(String str, String str2) {
            DuMixCallback duMixCallback = r2.this.f3000e;
            if (duMixCallback != null) {
                duMixCallback.onError(DuMixErrorType.LibraryError, str2, str);
            }
        }
    }

    public class c implements s3 {
        public c() {
        }

        @Override // com.baidu.ar.s3
        public List<Integer> a() {
            return r2.this.f3002g;
        }

        @Override // com.baidu.ar.s3
        public void a(int i8, int i9, HashMap<String, Object> hashMap) {
            i iVar;
            i iVar2;
            int i10;
            Message message;
            com.baidu.ar.h.c("ControllerHelper", "DigitalTime onEngineMessage msgType = " + i8 + " && msgId = " + i9);
            com.baidu.ar.h.a("ControllerHelper", "onEngineMessage msgType = " + i8 + " && msgId = " + i9);
            if (i8 != 12) {
                if (i8 == 50) {
                    if (r2.this.f3021z != null) {
                        iVar = r2.this.f3021z;
                        message = r2.this.f3021z.obtainMessage(4004, hashMap);
                        iVar.sendMessage(message);
                    }
                    return;
                }
                switch (i8) {
                    case 6:
                        if (r2.this.f3021z != null) {
                            iVar = r2.this.f3021z;
                            iVar2 = r2.this.f3021z;
                            i10 = 4005;
                            break;
                        } else {
                            return;
                        }
                    case 7:
                        if (r2.this.f3021z != null) {
                            iVar = r2.this.f3021z;
                            iVar2 = r2.this.f3021z;
                            i10 = Constant.RESULT_CODE_4006;
                            break;
                        } else {
                            return;
                        }
                    case 8:
                        r2.this.f3004i.updateDeviceOrientation();
                        if (r2.this.f3021z != null) {
                            iVar = r2.this.f3021z;
                            iVar2 = r2.this.f3021z;
                            i10 = Constant.RESULT_CODE_4007;
                            break;
                        } else {
                            return;
                        }
                    case 9:
                        if (r2.this.f3021z != null) {
                            iVar = r2.this.f3021z;
                            iVar2 = r2.this.f3021z;
                            i10 = 4008;
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            } else {
                if (r2.this.f3021z == null) {
                    return;
                }
                iVar = r2.this.f3021z;
                iVar2 = r2.this.f3021z;
                i10 = 4003;
            }
            message = iVar2.obtainMessage(i10);
            iVar.sendMessage(message);
        }
    }

    public class d implements ILibLoader.b {
        public d() {
        }

        @Override // com.baidu.ar.libloader.ILibLoader.b
        public void a(DuMixErrorType duMixErrorType, Exception exc) {
            r2 r2Var = r2.this;
            DuMixCallback duMixCallback = r2Var.f3000e;
            if (duMixCallback != null) {
                duMixCallback.onSetup(false, r2Var.f2998c, r2.this.f2999d);
                if (exc != null) {
                    r2.this.f3000e.onError(duMixErrorType, exc.getMessage(), "");
                }
            }
        }

        @Override // com.baidu.ar.libloader.ILibLoader.b
        public void onSuccess() {
        }
    }

    public class e implements ICallbackWith<String> {
        public e() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(String str) {
            DuMixCallback duMixCallback = r2.this.f3000e;
            if (duMixCallback != null) {
                duMixCallback.onError(DuMixErrorType.AbilitySchemeFetchFail, str, null);
            }
        }
    }

    public class f implements ICallbackWith<JSONObject> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f3027a;

        public f(y yVar) {
            this.f3027a = yVar;
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(JSONObject jSONObject) {
            if (r2.this.f3004i != null) {
                if (jSONObject != null) {
                    r2.this.f3004i.a(jSONObject);
                } else if (this.f3027a != null) {
                    r2.this.f3004i.a(this.f3027a.b());
                }
            }
        }
    }

    public class g implements IAuthCallback {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3029a = false;

        public g() {
        }

        @Override // com.baidu.ar.auth.IAuthCallback
        public void onError(String str, int i8) {
            com.baidu.ar.h.b("ControllerHelper", String.format("auth fail feature: %d msg: %s", Integer.valueOf(i8), str));
            if (i8 == 0) {
                r2.this.f3013r = true;
                if (r2.this.f3021z != null) {
                    r2.this.f3021z.sendMessage(r2.this.f3021z.obtainMessage(4002));
                }
            }
            if (this.f3029a || !ARAuth.isShowAuthTip()) {
                return;
            }
            this.f3029a = true;
            r2.this.s();
        }

        @Override // com.baidu.ar.auth.IAuthCallback
        public void onSuccess() {
            com.baidu.ar.h.a("ControllerHelper", "auth success");
        }
    }

    public static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3031a;

        static {
            int[] iArr = new int[ARType.values().length];
            f3031a = iArr;
            try {
                iArr[ARType.IMU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3031a[ARType.TRACK_2D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3031a[ARType.CLOUD_IR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3031a[ARType.ON_DEVICE_IR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3031a[ARType.VO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class i extends Handler {
        public i(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 4001:
                    com.baidu.ar.h.a("ControllerHelper", "CaseHandler MSG_CREATE_CASE");
                    CaseModel caseModel = (CaseModel) message.obj;
                    r2.this.b(caseModel.mCaseType, caseModel.mCasePath, caseModel.mCaseId);
                    break;
                case 4002:
                    com.baidu.ar.h.a("ControllerHelper", "CaseHandler MSG_DESTROY_CASE");
                    r2.this.d();
                    break;
                case 4003:
                    com.baidu.ar.h.a("ControllerHelper", "CaseHandler MSG_ON_FILTER_CREATE");
                    r2.this.i();
                    break;
                case 4004:
                    com.baidu.ar.h.a("ControllerHelper", "CaseHandler MSG_ON_FILTER_CHANGE");
                    r2.this.a((List<String>) ((HashMap) message.obj).get("filter_name_list"));
                    break;
                case 4005:
                    com.baidu.ar.h.a("ControllerHelper", "CaseHandler MSG_ON_ENGINE_CREATE");
                    r2.this.g();
                    break;
                case Constant.RESULT_CODE_4006 /* 4006 */:
                    com.baidu.ar.h.a("ControllerHelper", "CaseHandler MSG_ON_ENGINE_DESTROY");
                    r2.this.h();
                    break;
                case Constant.RESULT_CODE_4007 /* 4007 */:
                    com.baidu.ar.h.a("ControllerHelper", "CaseHandler MSG_ON_CASE_CREATE");
                    r2.this.e();
                    break;
                case 4008:
                    com.baidu.ar.h.a("ControllerHelper", "CaseHandler MSG_ON_CASE_DESTROY");
                    r2.this.f();
                    break;
            }
        }
    }

    public r2(Context context, DefaultParams defaultParams, HandlerThread handlerThread) {
        this.f2996a = context;
        this.f2997b = defaultParams;
        this.f3021z = new i(handlerThread.getLooper());
    }

    public static String a(Context context) {
        if (context == null) {
            com.baidu.ar.h.b("ControllerHelper", "get so download dir error");
            return null;
        }
        File file = new File(context.getFilesDir(), "arlibs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public void b() {
        ConcurrentHashMap<PixelReadParams, PixelReadListener> concurrentHashMap = this.A;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry<PixelReadParams, PixelReadListener> entry : this.A.entrySet()) {
            this.f3004i.a(entry.getKey(), entry.getValue());
        }
        this.A.clear();
    }

    public void c() {
        if (b1.a(this.f2996a.getPackageName())) {
            ARAuth.loadWhiteAuthInfo(this.f2996a);
        } else {
            ARAuth.doAuth(this.f2996a, new g());
        }
    }

    public final void d() {
        o();
        com.baidu.ar.arrender.a aVar = this.f3004i;
        if (aVar != null) {
            aVar.b();
        }
        StatisticApi.onEventEnd(StatisticConstants.EVENT_CASE_END);
        com.baidu.ar.g gVar = this.f3005j;
        if (gVar != null) {
            gVar.c();
        }
    }

    public final void e() {
        i iVar;
        this.f3015t = true;
        this.f3018w = false;
        w wVar = this.f3006k;
        if (wVar != null) {
            wVar.g(this.f3011p + File.separator + com.moyoung.dafit.module.common.utils.u.LANGUAGE_AR);
        }
        if ((this.f3017v || this.f3019x) && (iVar = this.f3021z) != null) {
            iVar.removeMessages(4002);
            i iVar2 = this.f3021z;
            iVar2.sendMessage(iVar2.obtainMessage(4002));
        } else {
            this.f3016u = true;
        }
        DuMixCallback duMixCallback = this.f3000e;
        if (duMixCallback != null) {
            duMixCallback.onCaseCreate(true, this.f3011p, this.f3012q);
        }
    }

    public final void f() {
        CaseModel caseModel;
        this.f3015t = false;
        o();
        w wVar = this.f3006k;
        if (wVar != null) {
            wVar.i();
        }
        if (!this.f3017v || (caseModel = this.f3014s) == null || this.f3021z == null) {
            this.f3016u = true;
            this.f3011p = null;
            this.f3012q = null;
            com.baidu.ar.g gVar = this.f3005j;
            if (gVar != null) {
                gVar.c(null);
            }
        } else {
            this.f3018w = true;
            CaseModel caseModel2 = new CaseModel(caseModel.mCaseType, caseModel.mCasePath, caseModel.mCaseId);
            this.f3021z.removeMessages(4001);
            i iVar = this.f3021z;
            iVar.sendMessageDelayed(iVar.obtainMessage(4001, caseModel2), 100L);
        }
        this.f3014s = null;
        this.f3017v = false;
        this.f3019x = false;
        DuMixCallback duMixCallback = this.f3000e;
        if (duMixCallback != null) {
            duMixCallback.onCaseDestroy();
        }
    }

    public final void k() {
        com.baidu.ar.libloader.a.a(this.f2996a, new d());
    }

    public final void l() {
        ARAuth.loadAuthInfo(this.f2996a);
    }

    public void m() {
        ConcurrentHashMap<PixelReadParams, PixelReadListener> concurrentHashMap = this.A;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
            this.A = null;
        }
        this.f3004i = null;
        this.f3006k = null;
        this.f3005j = null;
        this.f2998c = null;
        this.f2999d = null;
        this.f2996a = null;
        this.f2997b = null;
        this.f3002g = null;
        this.f3003h = null;
        this.f3001f = null;
        this.f3021z = null;
    }

    public void n() {
        i iVar = this.f3021z;
        if (iVar != null) {
            iVar.removeCallbacksAndMessages(null);
        }
    }

    public final void o() {
        if (this.f3006k == null) {
            return;
        }
        if (this.f3017v && this.f3014s != null && j()) {
            this.f3006k.c();
        } else {
            this.f3006k.l();
        }
    }

    public final void p() {
        this.f3002g = Arrays.asList(12, 50, 6, 7, 8, 9);
        c cVar = new c();
        this.f3003h = cVar;
        r3 r3Var = this.f3001f;
        if (r3Var != null) {
            r3Var.a(cVar);
        }
    }

    public final void q() {
        HashMap hashMap = new HashMap();
        hashMap.put("continuous_mapping", a("interaction_plane_move"));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("limit_radius", 1);
        hashMap2.put("radius_min", Float.valueOf(0.0f));
        hashMap2.put("radius_max", Float.valueOf(3000.0f));
        hashMap2.put("limit_step_length", 1);
        hashMap2.put("step_length", Float.valueOf(80.0f));
        hashMap2.put("limit_far_frustum", 1);
        hashMap2.put("move_leave_callback", 1);
        hashMap.put("plane_move_config", hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("limit_world_axis", 1);
        hashMap3.put("world_axis", "y");
        hashMap.put("rotate_config", hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("limit_distance_factor", 1);
        hashMap.put("scale_config", hashMap4);
        ARPScriptEnvironment.getInstance().setSharedEnvironmentKV("interactioninfo", hashMap);
    }

    public final void r() {
        DuMixCallback duMixCallback;
        if (!this.f3007l || !this.f3008m || this.f3009n || (duMixCallback = this.f3000e) == null) {
            return;
        }
        this.f3009n = true;
        duMixCallback.onSetup(true, this.f2998c, this.f2999d);
    }

    public final void s() {
        Bitmap createTipBitmap;
        if (this.f3004i == null || this.f2999d == null || (createTipBitmap = ARAuth.createTipBitmap(this.f2996a)) == null) {
            return;
        }
        float outputWidth = ((this.f2999d.getOutputWidth() * createTipBitmap.getHeight()) * 0.78125f) / (this.f2999d.getOutputHeight() * createTipBitmap.getWidth());
        this.f3004i.a(createTipBitmap, 0.109375f, (0.25f - outputWidth) / 2.0f, 0.78125f, outputWidth);
    }

    public final HashMap<String, Object> a(String str) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("gesture_scroll", str);
        hashMap.put("gesture_two_finger_scroll", "interaction_rotate");
        hashMap.put("gesture_two_finger_pinch", "interaction_scale_down");
        hashMap.put("gesture_two_finger_unpinch", "interaction_scale_up");
        return hashMap;
    }

    public final void b(ARType aRType, String str, String str2) {
        w wVar;
        if (this.f3013r) {
            com.baidu.ar.h.b("ControllerHelper", "handleCreateCase ignored; auth rejected");
            return;
        }
        if (aRType != null) {
            ARConfig.setARType(aRType.getTypeValue());
            a(aRType);
        }
        ARConfig.setARKey(str2);
        boolean z7 = false;
        if (this.f3020y) {
            this.f3020y = false;
            StatisticApi.onEvent(StatisticConstants.EVENT_CASE_FIRST);
        }
        StatisticApi.onEventStart(StatisticConstants.EVENT_CASE_START);
        if (this.f3004i != null && !TextUtils.isEmpty(str)) {
            String substring = str.substring(0, str.lastIndexOf(File.separator + com.moyoung.dafit.module.common.utils.u.LANGUAGE_AR));
            this.f3011p = substring;
            this.f3012q = str2;
            com.baidu.ar.g gVar = this.f3005j;
            if (gVar != null) {
                gVar.c(substring);
            }
            com.baidu.ar.arrender.a aVar = this.f3004i;
            if (!this.f2997b.isUseInputSizeInEngine() && aRType != ARType.FACE && aRType != ARType.VPAS) {
                z7 = true;
            }
            aVar.c(z7);
            this.f3004i.a(str);
        }
        if (aRType == null || (wVar = this.f3006k) == null) {
            return;
        }
        wVar.a(aRType);
    }

    public void c(ARType aRType, String str, String str2) {
        if (this.f3013r) {
            com.baidu.ar.h.b("ControllerHelper", "auth rejected");
            return;
        }
        CaseModel caseModel = new CaseModel(aRType, str, str2);
        CaseModel caseModel2 = this.f3010o;
        if (caseModel2 == null || !caseModel.equals(caseModel2)) {
            this.f3010o = caseModel;
            com.baidu.ar.libloader.a.a(aRType, str, str2, new a());
            return;
        }
        com.baidu.ar.h.c("ControllerHelper", "DigitalTime loadCase() case has loaded!!!:" + str);
        com.baidu.ar.h.a("ControllerHelper", "loadCase() case has loaded!!!");
        DuMixCallback duMixCallback = this.f3000e;
        if (duMixCallback != null) {
            duMixCallback.onCaseCreate(true, str, str2);
        }
    }

    public final void g() {
        w wVar = this.f3006k;
        if (wVar != null) {
            wVar.p();
        }
        com.baidu.ar.arrender.a aVar = this.f3004i;
        if (aVar != null) {
            aVar.a(true);
        }
        this.f3008m = true;
        r();
    }

    public final void h() {
        DuMixCallback duMixCallback = this.f3000e;
        if (duMixCallback != null) {
            duMixCallback.onRelease();
            this.f3000e = null;
        }
    }

    public final void i() {
        this.f3007l = true;
        com.baidu.ar.g gVar = this.f3005j;
        if (gVar != null && !this.f3018w) {
            gVar.d();
        }
        r();
    }

    public final boolean j() {
        ARType aRType = this.f3014s.mCaseType;
        return (aRType == null || aRType == ARType.FACE) ? false : true;
    }

    public void a() {
        com.baidu.ar.h.c("ControllerHelper", "DigitalTime clearCase mLoadCaseEnable = " + this.f3016u + " && mCaseLoaded = " + this.f3015t);
        com.baidu.ar.h.a("ControllerHelper", "clearCase mLoadCaseEnable = " + this.f3016u + " && mCaseLoaded = " + this.f3015t);
        if (this.f3016u && this.f3015t) {
            this.f3016u = false;
            i iVar = this.f3021z;
            if (iVar != null) {
                iVar.sendMessage(iVar.obtainMessage(4002));
            }
        } else {
            this.f3014s = null;
            this.f3019x = true;
        }
        this.f3010o = null;
    }

    public void c(String str) {
        a("dumix_system_message", "system_message", str);
    }

    public final void a(int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("continuous_mapping", a("interaction_space_move"));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("limit_radius_invariant", Integer.valueOf(i8));
        hashMap.put("space_move_config", hashMap2);
        ARPScriptEnvironment.getInstance().setSharedEnvironmentKV("interactioninfo", hashMap);
    }

    public void b(String str) {
        a("recorder_video", NotificationCompat.CATEGORY_MESSAGE, str);
    }

    public final void a(ARType aRType) {
        int i8 = h.f3031a[aRType.ordinal()];
        if (i8 == 1) {
            a(1);
            return;
        }
        if (i8 == 2 || i8 == 3 || i8 == 4) {
            a(0);
        } else {
            if (i8 != 5) {
                return;
            }
            q();
        }
    }

    public final void a(ARType aRType, String str, String str2) {
        i iVar;
        Message obtainMessage;
        com.baidu.ar.h.a("ControllerHelper", "executeLoadCase arType = " + aRType + " && casePath = " + str + "&& mLoadCaseEnable = " + this.f3016u + " && mCaseSwitched = " + this.f3017v);
        if (!ARType.ON_DEVICE_IR.equals(aRType) && !ARType.CLOUD_IR.equals(aRType) && TextUtils.isEmpty(str)) {
            com.baidu.ar.h.b("ControllerHelper", "casePath is empty!!!");
            DuMixCallback duMixCallback = this.f3000e;
            if (duMixCallback != null) {
                duMixCallback.onCaseCreate(false, str, str2);
                return;
            }
            return;
        }
        if (this.f3013r) {
            com.baidu.ar.h.b("ControllerHelper", "auth rejected");
            return;
        }
        CaseModel caseModel = new CaseModel(aRType, str + File.separator + com.moyoung.dafit.module.common.utils.u.LANGUAGE_AR, str2);
        if (this.f3016u) {
            this.f3016u = false;
            com.baidu.ar.h.a("ControllerHelper", "executeLoadCase mCaseLoaded = " + this.f3015t);
            if (this.f3015t) {
                this.f3014s = caseModel;
                this.f3017v = true;
                iVar = this.f3021z;
                obtainMessage = iVar.obtainMessage(4002);
            } else {
                iVar = this.f3021z;
                obtainMessage = iVar.obtainMessage(4001, caseModel);
            }
            iVar.sendMessage(obtainMessage);
        } else {
            this.f3014s = caseModel;
            this.f3017v = true;
        }
        this.f3019x = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [com.baidu.ar.libloader.ILibLoader] */
    public void a(DuMixController duMixController) {
        com.baidu.ar.libloader.c cVar;
        String a8 = a(this.f2996a);
        Object a9 = ab.a("com.baidu.ar.remoteres.RemoteResLoader", new Class[]{DuMixController.class, String.class}, new Object[]{duMixController, a8});
        if (a9 != null) {
            cVar = (ILibLoader) a9;
        } else if (TextUtils.isEmpty(a8) || com.baidu.ar.libloader.a.b()) {
            com.baidu.ar.libloader.a.d();
            return;
        } else {
            com.baidu.ar.libloader.c cVar2 = new com.baidu.ar.libloader.c(a8);
            cVar2.a(new b());
            cVar = cVar2;
        }
        com.baidu.ar.libloader.a.a(cVar);
    }

    public void a(DuMixInput duMixInput, DuMixOutput duMixOutput, DuMixCallback duMixCallback) {
        this.f2998c = duMixInput;
        this.f2999d = duMixOutput;
        this.f3000e = duMixCallback;
        p();
        l();
        k();
    }

    public void a(PixelReadParams pixelReadParams, PixelReadListener pixelReadListener) {
        ConcurrentHashMap<PixelReadParams, PixelReadListener> concurrentHashMap = this.A;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(pixelReadParams, pixelReadListener);
        }
    }

    public void a(com.baidu.ar.arrender.a aVar, w wVar, com.baidu.ar.g gVar, r3 r3Var) {
        this.f3004i = aVar;
        this.f3006k = wVar;
        this.f3005j = gVar;
        this.f3001f = r3Var;
    }

    public void a(y yVar) {
        if (yVar != null) {
            yVar.a(new e());
            yVar.b(new f(yVar));
        }
    }

    public final void a(String str, String str2, String str3) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(str2, str3);
        hashMap.put("event_data", hashMap2);
        r3 r3Var = this.f3001f;
        if (r3Var != null) {
            r3Var.a(1902, hashMap);
        }
    }

    public final void a(List<String> list) {
        com.baidu.ar.g gVar = this.f3005j;
        if (gVar != null) {
            gVar.a(list);
        }
    }
}
