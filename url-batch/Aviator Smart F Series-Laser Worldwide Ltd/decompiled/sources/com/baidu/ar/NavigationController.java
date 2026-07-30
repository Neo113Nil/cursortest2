package com.baidu.ar;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLSurfaceView;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.ar.arplay.representation.Vector3f;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.baidumap.CaseStateListener;
import com.baidu.ar.baidumap.MapDuMix;
import com.baidu.ar.baidumap.MapDuMixCallback;
import com.baidu.ar.baidumap.MapDuMixParams;
import com.baidu.ar.baidumap.bean.CommandDate;
import com.baidu.ar.baidumap.bean.CommandType;
import com.baidu.ar.baidumap.bean.NavigationLuaField;
import com.baidu.ar.bean.ARCameraInputSize;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.bean.DuMixARConfig;
import com.baidu.ar.bean.NavigationNpc;
import com.baidu.ar.content.ARResourceManager;
import com.baidu.ar.i9;
import com.baidu.ar.le;
import com.baidu.ar.lua.LuaMsgListener;
import com.baidu.ar.marker.IMakerAxisCallback;
import com.baidu.ar.marker.IMarkerLocationTimeCallBack;
import com.baidu.ar.marker.IMarkerStateListener;
import com.baidu.ar.marker.OnCoordinateBoundListener;
import com.baidu.ar.marker.OnEulerAngleCallback;
import com.baidu.ar.marker.OnTrackerSessionCallback;
import com.baidu.ar.marker.PositioningModuleAddListener;
import com.baidu.ar.marker.model.Segments;
import com.baidu.ar.marker.model.TranslationPrior;
import com.baidu.ar.photo.PhotoCallback;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.ar.util.DeviceSupportAbility;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.ar.z2;
import com.baidu.baidumapsdk_api.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class NavigationController implements CaseStateListener, le.a, OnFrmeTrackingStateCallback, LuaMsgListener, k6 {

    /* renamed from: i0, reason: collision with root package name */
    public static Map<NavigationType, ARCameraInputSize> f1563i0;
    public OnReciveLuaListener A;
    public OnSetupComplete B;
    public OnCoordinateBoundListener C;
    public OnRecive2DMapPlaneListener D;
    public OnReciveShakeListener E;
    public float[] F;
    public int G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int N;
    public NavigationType O;
    public PositioningModuleAddListener P;
    public boolean R;
    public j9 S;
    public ImageView T;
    public TextView U;
    public boolean V;
    public long W;
    public boolean X;
    public long Y;
    public String Z;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1566b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1568c;

    /* renamed from: c0, reason: collision with root package name */
    public List<double[]> f1569c0;

    /* renamed from: d0, reason: collision with root package name */
    public i9 f1571d0;

    /* renamed from: e, reason: collision with root package name */
    public Context f1572e;

    /* renamed from: f, reason: collision with root package name */
    public com.baidu.ar.a f1574f;

    /* renamed from: g, reason: collision with root package name */
    public le f1576g;

    /* renamed from: g0, reason: collision with root package name */
    public TranslationPrior f1577g0;

    /* renamed from: h, reason: collision with root package name */
    public MapDuMix f1578h;

    /* renamed from: j, reason: collision with root package name */
    public OnEulerAngleCallback f1581j;

    /* renamed from: k, reason: collision with root package name */
    public GLSurfaceView f1582k;

    /* renamed from: l, reason: collision with root package name */
    public VpasManager f1583l;

    /* renamed from: m, reason: collision with root package name */
    public IMarkerLocationTimeCallBack f1584m;
    public IMakerAxisCallback mIMakerAxisZCallback;
    public IMarkerStateListener mIMarkerStateListener;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1588q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1589r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1590s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1591t;

    /* renamed from: v, reason: collision with root package name */
    public OnFrmeTrackingStateCallback f1593v;

    /* renamed from: w, reason: collision with root package name */
    public OnReciveLatLngFormLuaListener f1594w;

    /* renamed from: x, reason: collision with root package name */
    public OnReciveCrossStreetFormLuaListener f1595x;

    /* renamed from: y, reason: collision with root package name */
    public OnReciveTunnelFormLuaListener f1596y;

    /* renamed from: z, reason: collision with root package name */
    public OnReciveFootBridgeFormLuaListener f1597z;

    /* renamed from: a, reason: collision with root package name */
    public int f1564a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1570d = -1;

    /* renamed from: i, reason: collision with root package name */
    public MapDuMixParams f1580i = new MapDuMixParams();
    public boolean mMapDuMixSetuped = false;

    /* renamed from: n, reason: collision with root package name */
    public int f1585n = 1280;

    /* renamed from: o, reason: collision with root package name */
    public int f1586o = 720;

    /* renamed from: p, reason: collision with root package name */
    public int f1587p = 1;

    /* renamed from: u, reason: collision with root package name */
    public List<Segments> f1592u = new ArrayList();
    public int M = -1;
    public z2 Q = null;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1565a0 = true;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f1567b0 = true;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f1573e0 = false;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f1575f0 = false;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f1579h0 = true;

    public class a implements PositioningModuleAddListener {
        public a() {
        }

        @Override // com.baidu.ar.marker.PositioningModuleAddListener
        public void addPositioningResult(boolean z7) {
            NavigationController.this.X = z7;
            Log.e("DuMixController", "Run Vpas Callback Yes! And Result is:" + z7);
            NavigationController.this.c(true);
            if (NavigationController.this.S != null) {
                NavigationController.this.S.c(z7);
            }
            if (NavigationController.this.P != null) {
                NavigationController.this.P.addPositioningResult(z7);
            }
        }
    }

    public class b implements PositioningModuleAddListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavigationConfiguration f1599a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NavigationConfiguration f1600b;

        public b(NavigationConfiguration navigationConfiguration, NavigationConfiguration navigationConfiguration2) {
            this.f1599a = navigationConfiguration;
            this.f1600b = navigationConfiguration2;
        }

        @Override // com.baidu.ar.marker.PositioningModuleAddListener
        public void addPositioningResult(boolean z7) {
            MapDuMix mapDuMix;
            String navigation3DofARKey;
            MapDuMix mapDuMix2;
            String navigation3DofNpcARKey;
            NavigationController.this.c(z7);
            if (NavigationController.this.S != null) {
                NavigationController.this.S.c(z7);
            }
            if (this.f1599a == NavigationConfiguration.NPC_IMU) {
                NavigationController.this.f1570d = 6;
                if (NavigationController.this.f1575f0) {
                    NavigationController.this.f1578h.loadCase(NavigationController.this.getDirectory("3dof-npc"), "");
                } else {
                    if (TextUtils.isEmpty(NavigationController.this.Z)) {
                        mapDuMix2 = NavigationController.this.f1578h;
                        navigation3DofNpcARKey = ARConfig.getNavigation3DofNpcARKey();
                    } else {
                        mapDuMix2 = NavigationController.this.f1578h;
                        navigation3DofNpcARKey = NavigationController.this.Z;
                    }
                    mapDuMix2.loadCase(navigation3DofNpcARKey);
                }
            } else {
                NavigationController.this.f1570d = 3;
                if (NavigationController.this.f1578h != null) {
                    if (NavigationController.this.f1575f0) {
                        NavigationController.this.f1578h.loadCase(NavigationController.this.getDirectory("3dof"), "");
                    } else {
                        if (TextUtils.isEmpty(NavigationController.this.Z)) {
                            mapDuMix = NavigationController.this.f1578h;
                            navigation3DofARKey = ARConfig.getNavigation3DofARKey();
                        } else {
                            mapDuMix = NavigationController.this.f1578h;
                            navigation3DofARKey = NavigationController.this.Z;
                        }
                        mapDuMix.loadCase(navigation3DofARKey);
                    }
                    if (NavigationController.this.S != null) {
                        NavigationController.this.S.a(false, (NavigationNpc) null);
                    }
                }
            }
            if (z7) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", this.f1600b == NavigationConfiguration.IMU ? "3DOF" : "3DOF-NPC");
                hashMap.put("cuid", ARConfig.getCUID());
                StatisticApi.onEvent(StatisticConstants.NAVIGATION_START_SUCCESS, hashMap);
            }
        }
    }

    public class c implements PositioningModuleAddListener {
        public c() {
        }

        @Override // com.baidu.ar.marker.PositioningModuleAddListener
        public void addPositioningResult(boolean z7) {
            NavigationController.this.c(z7);
            if (z7 && !NavigationController.this.R) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "ARPEDOMETER");
                hashMap.put("cuid", ARConfig.getCUID());
                StatisticApi.onEvent(StatisticConstants.NAVIGATION_START_SUCCESS, hashMap);
            }
            if (NavigationController.this.S != null) {
                NavigationController.this.S.c(z7);
            }
        }
    }

    public class d implements z2.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnReverseTransformCalculationListener f1603a;

        public d(OnReverseTransformCalculationListener onReverseTransformCalculationListener) {
            this.f1603a = onReverseTransformCalculationListener;
        }

        @Override // com.baidu.ar.z2.a
        public void onTick() {
            if (NavigationController.this.f1578h == null || NavigationController.this.f1578h.getMarkerManager() == null) {
                return;
            }
            float[] geolocationByTransform = NavigationController.this.f1578h.getMarkerManager().getGeolocationByTransform();
            OnReverseTransformCalculationListener onReverseTransformCalculationListener = this.f1603a;
            if (onReverseTransformCalculationListener != null) {
                onReverseTransformCalculationListener.onCalculation(geolocationByTransform[0], geolocationByTransform[1]);
            }
        }
    }

    public class e implements i9.c {
        public e() {
        }

        @Override // com.baidu.ar.i9.c
        public void a(MapDuMix mapDuMix) {
            NavigationController.this.f1578h = mapDuMix;
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NavigationController.this.f1578h.resume();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NavigationController.this.f1578h == null || NavigationController.this.f1578h.getMarkerManager() == null) {
                return;
            }
            NavigationController.this.f1578h.getMarkerManager().createSession();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NavigationController.this.f1578h == null || NavigationController.this.f1578h.getMarkerManager() == null) {
                return;
            }
            NavigationController.this.f1578h.getMarkerManager().createSession();
        }
    }

    public class i implements l1 {
        public i(NavigationController navigationController) {
        }
    }

    public class j implements MapDuMixCallback {

        public class a implements p8 {
            public a() {
            }

            @Override // com.baidu.ar.p8
            public void a() {
                if (NavigationController.this.B != null) {
                    NavigationController.this.B.onSetup();
                }
                if (NavigationController.this.C != null) {
                    NavigationController.this.f1578h.getMarkerManager().setCoordinateBoundListener(NavigationController.this.C);
                }
                if (NavigationController.this.S == null || !NavigationController.this.S.j()) {
                    return;
                }
                NavigationController.this.f1578h.getMarkerManager().openDataRecorde();
            }
        }

        public class b implements OnTrackerSessionCallback {
            public b() {
            }

            @Override // com.baidu.ar.marker.OnTrackerSessionCallback
            public void onSessionCallback(String str) {
                NavigationController.this.f1578h.getVpsResBySessionId(str, null);
            }
        }

        public j() {
        }

        @Override // com.baidu.ar.baidumap.MapDuMixCallback
        public void onError() {
        }

        @Override // com.baidu.ar.baidumap.MapDuMixCallback
        public void onRelease(boolean z7) {
            NavigationController.this.i();
        }

        @Override // com.baidu.ar.baidumap.MapDuMixCallback
        public void onSetup(boolean z7, DuMixInput duMixInput, DuMixOutput duMixOutput) {
            com.baidu.ar.h.a("DuMixController", "MapDuMixCallback onSetup() result = " + z7);
            NavigationController.this.h();
            NavigationController navigationController = NavigationController.this;
            navigationController.mMapDuMixSetuped = true;
            if (navigationController.f1578h == null || duMixInput == null) {
                Log.e("DuMixController", "onSetup mMapDuMix = null");
                return;
            }
            NavigationController.this.f1578h.setCaseStateListener(NavigationController.this);
            NavigationController.this.f1578h.getMarkerManager().setMarkerARSetupCallback(new a());
            if (!NavigationController.this.R) {
                HashMap hashMap = new HashMap();
                hashMap.put("cuid", ARConfig.getCUID());
                StatisticApi.onEvent(StatisticConstants.VPS_INDOOR_SDK_RECALL_SUCCESS, hashMap);
            }
            if (NavigationController.this.S != null) {
                NavigationController.this.S.c(9);
                String str = "profile_sdk_init_time: " + (Math.abs(System.currentTimeMillis() - NavigationController.this.W) / 1000.0d);
                Log.e("DuMixController", str);
                NavigationController.this.S.a(str);
            }
            if (NavigationController.this.f1578h.getMarkerManager() != null) {
                NavigationController navigationController2 = NavigationController.this;
                if (navigationController2.mIMarkerStateListener != null) {
                    navigationController2.f1578h.getMarkerManager().setMarkerStateListener(NavigationController.this.mIMarkerStateListener);
                }
                if (NavigationController.this.f1584m != null) {
                    NavigationController.this.f1578h.getMarkerManager().setLocationTimeCallBack(NavigationController.this.f1584m);
                }
                NavigationController navigationController3 = NavigationController.this;
                if (navigationController3.mIMakerAxisZCallback != null) {
                    navigationController3.f1578h.getMarkerManager().setAxisCallback(NavigationController.this.mIMakerAxisZCallback);
                }
                NavigationController.this.f1578h.getMarkerManager().setPositionCallback(NavigationController.this);
                NavigationController.this.f1578h.getMarkerManager().setTrackerSessionCallback(new b());
            }
            if ((NavigationController.this.O == NavigationType.ARCore || NavigationController.this.O == NavigationType.AREngine) && NavigationController.this.f1574f != null) {
                NavigationController.this.f1574f.a(NavigationController.this.f1578h.getGLRenderer());
                NavigationController.this.f1578h.getMarkerManager().setEulerAngleCallback(NavigationController.this.f1581j);
                NavigationController.this.f1574f.a(NavigationController.this.f1578h.getMarkerManager());
            }
            NavigationController.this.d(true);
        }
    }

    public class k implements PositioningModuleAddListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavigationConfiguration f1612a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NavigationConfiguration f1613b;

        public k(NavigationConfiguration navigationConfiguration, NavigationConfiguration navigationConfiguration2) {
            this.f1612a = navigationConfiguration;
            this.f1613b = navigationConfiguration2;
        }

        @Override // com.baidu.ar.marker.PositioningModuleAddListener
        public void addPositioningResult(boolean z7) {
            MapDuMix mapDuMix;
            String navigation6DofARKey;
            MapDuMix mapDuMix2;
            String navigation6DofNpcARKey;
            if (NavigationController.this.P != null) {
                NavigationController.this.P.addPositioningResult(z7);
                Log.e("DuMixController", "Run VIO Callback Yes! And Result is:" + z7);
            }
            if (NavigationController.this.S != null) {
                NavigationController.this.S.c(z7);
            }
            if (this.f1612a == NavigationConfiguration.NPC_VIO) {
                if (NavigationController.this.f1578h != null) {
                    if (NavigationController.this.f1575f0) {
                        NavigationController.this.f1578h.loadCase(NavigationController.this.getDirectory("6dof-npc"), "");
                    } else {
                        if (TextUtils.isEmpty(NavigationController.this.Z)) {
                            mapDuMix2 = NavigationController.this.f1578h;
                            navigation6DofNpcARKey = ARConfig.getNavigation6DofNpcARKey();
                        } else {
                            mapDuMix2 = NavigationController.this.f1578h;
                            navigation6DofNpcARKey = NavigationController.this.Z;
                        }
                        mapDuMix2.loadCase(navigation6DofNpcARKey);
                    }
                }
            } else if (NavigationController.this.f1578h != null) {
                if (NavigationController.this.f1575f0) {
                    NavigationController.this.f1578h.loadCase(NavigationController.this.getDirectory("6dof"), "");
                } else {
                    if (TextUtils.isEmpty(NavigationController.this.Z)) {
                        mapDuMix = NavigationController.this.f1578h;
                        navigation6DofARKey = ARConfig.getNavigation6DofARKey();
                    } else {
                        mapDuMix = NavigationController.this.f1578h;
                        navigation6DofARKey = NavigationController.this.Z;
                    }
                    mapDuMix.loadCase(navigation6DofARKey);
                }
                if (NavigationController.this.S != null) {
                    NavigationController.this.S.a(false, (NavigationNpc) null);
                }
            }
            if (z7) {
                HashMap hashMap = new HashMap();
                hashMap.put("cuid", ARConfig.getCUID());
                hashMap.put("type", this.f1613b == NavigationConfiguration.VIO ? "6DOF" : "6DOF-NPC");
                StatisticApi.onEvent(StatisticConstants.NAVIGATION_START_SUCCESS, hashMap);
            }
        }
    }

    public interface l {
    }

    static {
        HashMap hashMap = new HashMap();
        f1563i0 = hashMap;
        hashMap.put(NavigationType.ARCore, new ARCameraInputSize(1280, 720));
        f1563i0.put(NavigationType.AREngine, new ARCameraInputSize(1440, 1080));
        f1563i0.put(NavigationType.ARIMU, new ARCameraInputSize(1280, 720));
        f1563i0.put(NavigationType.ARPedometer, new ARCameraInputSize(1280, 720));
        f1563i0.put(NavigationType.None, new ARCameraInputSize(1280, 720));
    }

    public void choseFloor() {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.a();
        }
    }

    public void clearCase() {
        IMarkerStateListener iMarkerStateListener;
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            this.f1566b = false;
            mapDuMix.clearCase();
            this.W = System.currentTimeMillis();
            this.V = false;
            if (this.f1570d != 4 || (iMarkerStateListener = this.mIMarkerStateListener) == null) {
                return;
            }
            iMarkerStateListener.onCoordinateResult(-1, null);
        }
    }

    public void clearNavigationRoute() {
        com.baidu.ar.h.b("DuMixController", "clearNavigationRoute");
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            mapDuMix.getMarkerManager().clearNavigationRoute();
        } else {
            Log.e("DuMixController", "clearNavigationRoute mMapDuMix = null");
        }
    }

    public float[] convertLatLngFromPosition(float f8, float f9) {
        return this.f1578h.getMarkerManager().convertLatLngFromPosition(f8, f9);
    }

    public float[] convertPositionFromLatlng(float[] fArr) {
        return this.f1578h.getMarkerManager().convertPositionFromLatlng(fArr);
    }

    public ViewGroup createGLSurfaceViewWithSize(Context context, NavigationType navigationType, boolean z7) {
        com.baidu.ar.h.b("DuMixController", "createGLSurfaceViewWithSize()");
        if (context == null) {
            Log.e("DuMixController", "createGLSurfaceViewWithContext error!!");
            return null;
        }
        pe.g();
        this.W = System.currentTimeMillis();
        this.R = z7;
        this.O = navigationType;
        if (f1563i0.containsKey(navigationType)) {
            this.f1585n = f1563i0.get(navigationType).getWidth();
            this.f1586o = f1563i0.get(navigationType).getHeight();
        }
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.bdar_vpas_ui, null);
        this.f1572e = context;
        this.f1582k = (GLSurfaceView) viewGroup.findViewById(R.id.bdar_surface);
        DuMixARConfig.setAppId("6");
        DuMixARConfig.setAPIKey("43fb0bbd611ce4bff83ab5688bb2e0d1");
        DuMixARConfig.setSecretKey("");
        this.f1582k.setEGLContextClientVersion(2);
        if (navigationType == NavigationType.ARCore || navigationType == NavigationType.AREngine) {
            le leVar = new le();
            this.f1576g = leVar;
            leVar.a(this);
            this.f1576g.a(this.f1585n, this.f1586o);
            this.f1582k.setRenderer(this.f1576g);
            this.f1582k.setRenderMode(0);
            com.baidu.ar.a aVar = new com.baidu.ar.a();
            this.f1574f = aVar;
            aVar.a(this.f1572e, this.f1585n, this.f1586o, navigationType, z7);
            this.f1574f.a(this.f1582k);
            this.f1574f.a(this);
            this.L = true;
        } else if (navigationType == NavigationType.ARIMU || navigationType == NavigationType.ARPedometer) {
            if (this.f1571d0 == null) {
                this.f1571d0 = new i9(this.f1572e, this.f1578h, this);
            }
            this.f1571d0.a(this.f1585n, this.f1586o);
            this.f1571d0.a(this.f1582k, this.f1580i, new e());
        }
        this.T = (ImageView) viewGroup.findViewById(R.id.bdar_image_close);
        TextView textView = (TextView) viewGroup.findViewById(R.id.bdar_txt_center);
        this.U = textView;
        textView.setOnClickListener(new f());
        if (this.S == null) {
            j9 a8 = j9.a(context, viewGroup, z7);
            this.S = a8;
            a8.b(new g());
            this.S.a(new h());
            this.S.a(new i(this));
        }
        return viewGroup;
    }

    public MapDuMixCallback createMapDuMixCallback() {
        return new j();
    }

    public void doCommand(CommandType commandType, CommandDate commandDate) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            mapDuMix.doCommand(commandType, commandDate);
        }
    }

    public final void f() {
        if (this.f1570d == 4 && this.f1578h != null && this.f1566b) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("event_name", NavigationLuaField.NAVI_LUA_NAVIGATION_VPAS_MSG);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(NavigationLuaField.NAVI_LUA_LAUNCH_NAVI_MODE_MSG, 1);
            hashMap.put("event_data", hashMap2);
            this.f1578h.sendMsg2Lua(hashMap);
        }
    }

    public void farwayElevator() {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.F();
            c();
        }
    }

    public String getDirectory(String str) {
        File externalFilesDir = this.f1572e.getExternalFilesDir(null);
        StringBuilder sb = new StringBuilder();
        sb.append(externalFilesDir.getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append(this.Z);
        return sb.toString();
    }

    public MapDuMix getMapDuMixInstance() {
        if (this.f1578h == null) {
            this.f1580i.setUseTextureIO(true);
            this.f1580i.setHeight(this.f1586o);
            this.f1580i.setWidth(this.f1585n);
            MapDuMix mapDuMix = MapDuMix.getInstance(this.f1572e, this.f1580i);
            this.f1578h = mapDuMix;
            mapDuMix.addLuaMsgListener(this);
        }
        return this.f1578h;
    }

    @Override // com.baidu.ar.lua.LuaMsgListener
    public List<String> getMsgKeyListened() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_name");
        return arrayList;
    }

    public VpasManager getVpasManager() {
        if (this.f1583l == null) {
            this.f1583l = new VpasManager(this);
        }
        return this.f1583l;
    }

    public final void h() {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            mapDuMix.startMarker();
        }
    }

    public void isDebug(boolean z7) {
        i9 i9Var = this.f1571d0;
        if (i9Var != null) {
            i9Var.a(z7);
        }
    }

    public void loadCase(String str) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            mapDuMix.loadCase(str, "vpas_debug_arkey");
        }
    }

    public void nearElevator() {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix == null || this.S == null) {
            return;
        }
        mapDuMix.getMarkerManager().clearRoute();
        this.S.b(true);
        this.f1578h.getMarkerManager().releaseMarker();
    }

    @Override // com.baidu.ar.baidumap.CaseStateListener
    public void onCaseCreated(boolean z7, String str, String str2) {
        this.f1566b = z7;
        if (z7) {
            pe.e();
        }
        String str3 = "profile_resource_load_time: " + (Math.abs(System.currentTimeMillis() - this.W) / 1000.0d);
        Log.e("DuMixController", str3);
        d();
        b(z7);
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.t();
            this.S.a(str3);
        }
        IMarkerStateListener iMarkerStateListener = this.mIMarkerStateListener;
        if (iMarkerStateListener != null) {
            iMarkerStateListener.onResuourceCreated();
        }
        int i8 = this.f1570d;
        if (i8 == 1) {
            Map<String, String> f8 = pe.f();
            f8.put("cuid", ARConfig.getCUID());
            f8.put("building_id", this.f1580i.getBuildingId());
            StatisticApi.onEvent(StatisticConstants.EVENT_AR_VPAS_INDOOR_KEYPOINTS, f8);
            if (!this.V || this.f1587p == 1) {
                clearCase();
            }
        } else if (i8 == 5 && this.f1568c) {
            g();
        }
        float[] fArr = this.F;
        if (fArr != null) {
            updateLocation(fArr, this.G, this.I);
        }
        if (this.f1569c0 != null) {
            j9 j9Var2 = this.S;
            if (j9Var2 != null) {
                j9Var2.a("ar inner cache post routes");
            }
            postRoute(this.f1569c0);
            this.f1569c0 = null;
        }
        a(this.f1567b0);
        f();
        updateMeters(this.N);
    }

    @Override // com.baidu.ar.baidumap.CaseStateListener
    public void onCaseDestroy() {
        IMarkerStateListener iMarkerStateListener;
        com.baidu.ar.h.a("DuMixController", "onCaseDestroy");
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null && mapDuMix.getMarkerManager() != null && !this.R) {
            this.f1578h.getMarkerManager().releaseMarker();
            j9 j9Var = this.S;
            if (j9Var != null) {
                if (!j9Var.n()) {
                    c();
                }
                this.S.o();
            }
        }
        if (this.R || (iMarkerStateListener = this.mIMarkerStateListener) == null) {
            return;
        }
        iMarkerStateListener.onResuourceCreated();
    }

    @Override // com.baidu.ar.k6
    public void onCreateSessionFail() {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.p();
        }
    }

    @Override // com.baidu.ar.k6
    public void onCreateVpasAlgoFail() {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.q();
        }
    }

    public void onDestroy() {
        String str;
        com.baidu.ar.h.b("DuMixController", "onDestroy()");
        if (this.H > 0) {
            long abs = (long) (Math.abs(r0 - System.currentTimeMillis()) / 1000.0f);
            HashMap hashMap = new HashMap();
            int i8 = this.f1570d;
            if (i8 == 3) {
                str = "3DOF";
            } else if (i8 == 5) {
                str = "6DOF-NPC";
            } else if (i8 == 6) {
                str = "3DOF-NPC";
            } else {
                if (i8 == 2) {
                    str = "6DOF";
                }
                hashMap.put("duration", String.valueOf(abs));
                hashMap.put("cuid", ARConfig.getCUID());
                StatisticApi.onEvent(StatisticConstants.NAVIGATION_DURATION, hashMap);
            }
            hashMap.put("type", str);
            hashMap.put("duration", String.valueOf(abs));
            hashMap.put("cuid", ARConfig.getCUID());
            StatisticApi.onEvent(StatisticConstants.NAVIGATION_DURATION, hashMap);
        }
        this.f1570d = -1;
        com.baidu.ar.a aVar = this.f1574f;
        if (aVar != null) {
            aVar.b();
            this.f1574f = null;
        }
        b();
        le leVar = this.f1576g;
        if (leVar != null) {
            leVar.a();
            this.f1576g = null;
        }
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.m();
            this.S = null;
        }
        i9 i9Var = this.f1571d0;
        if (i9Var != null) {
            i9Var.d();
        }
        this.f1572e = null;
        this.mIMakerAxisZCallback = null;
        this.mIMarkerStateListener = null;
        this.f1584m = null;
    }

    @Override // com.baidu.ar.baidumap.CaseDownloadListener
    public void onDownloadFinish(boolean z7, String str, String str2, int i8, String str3) {
    }

    @Override // com.baidu.ar.baidumap.CaseDownloadListener
    public void onDownloadProgress(int i8, String str) {
    }

    @Override // com.baidu.ar.le.a
    public void onDrawFrame() {
        le leVar;
        try {
            com.baidu.ar.a aVar = this.f1574f;
            if (aVar != null && (leVar = this.f1576g) != null) {
                if (this.mMapDuMixSetuped) {
                    int i8 = this.f1564a;
                    if (i8 < 5) {
                        aVar.onRenderStarted(System.currentTimeMillis());
                        this.f1574f.onFrameAvailable(null);
                        this.f1564a++;
                    } else if (i8 == 5) {
                        leVar.a(true);
                    }
                } else {
                    aVar.onRenderStarted(System.currentTimeMillis());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.baidu.ar.lua.LuaMsgListener
    public void onLuaMessage(HashMap<String, Object> hashMap) {
        HashMap hashMap2;
        HashMap<String, Object> hashMap3;
        OnReciveShakeListener onReciveShakeListener;
        HashMap<String, Object> hashMap4;
        HashMap hashMap5;
        String str;
        j9 j9Var;
        OnReciveCrossStreetFormLuaListener onReciveCrossStreetFormLuaListener;
        OnReciveCrossStreetFormLuaListener onReciveCrossStreetFormLuaListener2;
        OnReciveLuaListener onReciveLuaListener = this.A;
        if (onReciveLuaListener != null) {
            onReciveLuaListener.onReciveMsg(hashMap);
        }
        if (hashMap.containsKey("event_name")) {
            String str2 = (String) hashMap.get("event_name");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if ("__ar_navi_cross_street_show".equals(str2) && (onReciveCrossStreetFormLuaListener2 = this.f1595x) != null) {
                onReciveCrossStreetFormLuaListener2.onReciveCrossStreetShow(hashMap);
            }
            if ("__ar_navi_cross_street_hide".equals(str2) && (onReciveCrossStreetFormLuaListener = this.f1595x) != null) {
                onReciveCrossStreetFormLuaListener.onReciveCrossStreetHide(hashMap);
            }
            if ("__log_route_shape_point".equals(str2)) {
                HashMap<String, Object> hashMap6 = (HashMap) hashMap.get("event_data");
                OnReciveLatLngFormLuaListener onReciveLatLngFormLuaListener = this.f1594w;
                if (onReciveLatLngFormLuaListener != null) {
                    onReciveLatLngFormLuaListener.onReciveLatLngData(hashMap6);
                }
            }
            if ("__ar_navi_foot_bridge".equals(str2)) {
                HashMap<String, Object> hashMap7 = (HashMap) hashMap.get("event_data");
                OnReciveFootBridgeFormLuaListener onReciveFootBridgeFormLuaListener = this.f1597z;
                if (onReciveFootBridgeFormLuaListener != null) {
                    onReciveFootBridgeFormLuaListener.onReciveFootBridge(hashMap7);
                }
            }
            if ("__ar_navi_tunnel".equals(str2)) {
                HashMap<String, Object> hashMap8 = (HashMap) hashMap.get("event_data");
                OnReciveTunnelFormLuaListener onReciveTunnelFormLuaListener = this.f1596y;
                if (onReciveTunnelFormLuaListener != null) {
                    onReciveTunnelFormLuaListener.onReciveTunnel(hashMap8);
                }
            }
            if (NavigationLuaField.NAVI_LUA_NPC_UI_UPDATE_MSG.equals(str2) && (hashMap5 = (HashMap) hashMap.get("event_data")) != null && hashMap5.keySet().size() > 0) {
                String str3 = (String) hashMap5.get(NavigationLuaField.NAVI_LUA_NPC_BG_PATH_MSG);
                String str4 = (String) hashMap5.get(NavigationLuaField.NAVI_LUA_NPC_NPC_ICON_MSG);
                String str5 = (String) hashMap5.get(NavigationLuaField.NAVI_LUA_NPC_DIR_ICON_MSG);
                String str6 = (String) hashMap5.get(NavigationLuaField.NAVI_LUA_NPC_NPC_TXT_MSG);
                ARResourceManager aRResourceManager = new ARResourceManager(this.f1572e);
                if (this.f1575f0) {
                    str = getDirectory("6dof-npc");
                } else {
                    str = aRResourceManager.getCaseDirPath(this.Z) + File.separator;
                }
                NavigationNpc navigationNpc = new NavigationNpc();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str7 = File.separator;
                sb.append(str7);
                sb.append(str5);
                navigationNpc.setDirPath(sb.toString());
                navigationNpc.setBGPath(str + str7 + str3);
                navigationNpc.setIconPath(str + str7 + str4);
                navigationNpc.setTitleTxt(str6);
                int i8 = this.f1570d;
                if ((i8 == 5 || i8 == 6) && (j9Var = this.S) != null) {
                    j9Var.a(true, navigationNpc);
                }
            }
            if (NavigationLuaField.NAVI_LUA_NPC_2D_MAP_STATE_UPDATE_MSG.equals(str2) && (hashMap4 = (HashMap) hashMap.get("event_data")) != null && hashMap4.keySet().size() > 0) {
                if ("open".equals((String) hashMap4.get(NavigationLuaField.NAVI_LUA_NPC_NEW_STATE))) {
                    OnRecive2DMapPlaneListener onRecive2DMapPlaneListener = this.D;
                    if (onRecive2DMapPlaneListener != null) {
                        onRecive2DMapPlaneListener.on2DMapPlaneShow(hashMap4);
                    }
                } else {
                    OnRecive2DMapPlaneListener onRecive2DMapPlaneListener2 = this.D;
                    if (onRecive2DMapPlaneListener2 != null) {
                        onRecive2DMapPlaneListener2.on2DMapPlaneHide(hashMap4);
                    }
                }
            }
            if (NavigationLuaField.NAVI_LUA_NPC_MESSAGE_NATIVE_SHAKE_MSG.equals(str2) && (hashMap3 = (HashMap) hashMap.get("event_data")) != null && hashMap3.keySet().size() > 0 && NavigationLuaField.NAVI_LUA_NPC_SHAKE.equals((String) hashMap3.get("message")) && (onReciveShakeListener = this.E) != null) {
                onReciveShakeListener.onShake(hashMap3);
            }
            if (NavigationLuaField.NAVI_LUA_NPC_MESSAGE_DISTANCE_BY_USER.equals(str2) && (hashMap2 = (HashMap) hashMap.get("event_data")) != null && hashMap2.keySet().size() > 0) {
                float floatValue = ((Float) hashMap2.get("distance")).floatValue();
                j9 j9Var2 = this.S;
                if (j9Var2 != null) {
                    j9Var2.a(floatValue);
                }
            }
            if (NavigationLuaField.NAVI_LUA_NPC_DATA_POI_MSG.equals(str2)) {
                HashMap hashMap9 = (HashMap) hashMap.get("event_data");
                new ArrayList().clear();
                if (hashMap9 == null || hashMap9.keySet().size() <= 0) {
                    return;
                }
                b(hashMap9);
            }
        }
    }

    public void onPause() {
        this.K = true;
        com.baidu.ar.h.b("DuMixController", "onPause()");
        com.baidu.ar.a aVar = this.f1574f;
        if (aVar != null) {
            aVar.a();
        }
        this.f1567b0 = false;
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.r();
        }
        this.f1565a0 = true;
        i9 i9Var = this.f1571d0;
        if (i9Var != null) {
            i9Var.e();
        }
        e();
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            if (this.R) {
                mapDuMix.getMarkerManager().resetNavigationController();
                this.f1578h.cancelAll();
            }
            clearCase();
            this.M = 0;
            this.f1578h.pause();
        }
    }

    @Override // com.baidu.ar.k6
    public void onPositionSuccess(int i8) {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.a(i8);
        }
        this.V = true;
    }

    @Override // com.baidu.ar.baidumap.CaseDownloadListener
    public void onRefused() {
        com.baidu.ar.h.b("onRefused");
    }

    public void onResume() {
        j9 j9Var;
        NavigationConfiguration navigationConfiguration;
        if (this.K) {
            this.J = true;
        }
        com.baidu.ar.h.b("DuMixController", "nav onResume()");
        com.baidu.ar.a aVar = this.f1574f;
        if (aVar != null) {
            aVar.c();
        }
        i9 i9Var = this.f1571d0;
        if (i9Var != null) {
            i9Var.f();
        }
        j9 j9Var2 = this.S;
        if (j9Var2 != null) {
            j9Var2.s();
        }
        if (this.f1578h == null) {
            return;
        }
        pe.g();
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            mapDuMix.resume();
        }
        int i8 = this.f1570d;
        if (i8 == 2) {
            HashMap hashMap = new HashMap();
            hashMap.put("cuid", ARConfig.getCUID());
            hashMap.put("type", "6DOF");
            StatisticApi.onEvent(StatisticConstants.NAVIGATION_RESUME, hashMap);
            if (this.M != 0) {
                return;
            }
            this.M = 1;
            runWithInitConfiguration(NavigationConfiguration.VIO, this.P);
        } else {
            if (i8 == 5) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("cuid", ARConfig.getCUID());
                hashMap2.put("type", "6DOF-NPC");
                StatisticApi.onEvent(StatisticConstants.NAVIGATION_RESUME, hashMap2);
                if (this.M != 0) {
                    return;
                }
                this.M = 1;
                navigationConfiguration = NavigationConfiguration.NPC_VIO;
            } else {
                if (i8 != 6) {
                    if (i8 == 3) {
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("type", "3DOF");
                        hashMap3.put("cuid", ARConfig.getCUID());
                        StatisticApi.onEvent(StatisticConstants.NAVIGATION_RESUME, hashMap3);
                        runWithInitConfiguration(NavigationConfiguration.IMU, this.P);
                        return;
                    }
                    if ((i8 != 1 && i8 != 4) || (j9Var = this.S) == null || j9Var.n()) {
                        return;
                    }
                    this.f1578h.getMarkerManager().createSession();
                    return;
                }
                HashMap hashMap4 = new HashMap();
                hashMap4.put("cuid", ARConfig.getCUID());
                hashMap4.put("type", "3DOF-NPC");
                StatisticApi.onEvent(StatisticConstants.NAVIGATION_RESUME, hashMap4);
                if (this.M != 0) {
                    return;
                }
                this.M = 1;
                navigationConfiguration = NavigationConfiguration.NPC_IMU;
            }
            runWithInitConfiguration(navigationConfiguration, this.P, this.Z);
        }
        this.M = -1;
    }

    @Override // com.baidu.ar.le.a
    public void onSurfaceChanged(int i8, int i9) {
        Log.d("DuMixController", "onSurfaceChanged width * height = " + i8 + " * " + i9);
        getMapDuMixInstance().changeOutputSize(i8, i9);
    }

    @Override // com.baidu.ar.le.a
    public void onSurfaceCreated(Texture texture) {
        Log.d("DuMixController", "surfaceCreated cameraTexture.getId() = " + texture.getId());
        com.baidu.ar.a aVar = this.f1574f;
        if (aVar != null) {
            aVar.a(texture);
        }
    }

    public boolean onTouch(MotionEvent motionEvent) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            return mapDuMix.onTouch(null, motionEvent);
        }
        return false;
    }

    @Override // com.baidu.ar.OnFrmeTrackingStateCallback
    public void onTrackingState(int i8) {
        OnFrmeTrackingStateCallback onFrmeTrackingStateCallback = this.f1593v;
        if (onFrmeTrackingStateCallback != null) {
            onFrmeTrackingStateCallback.onTrackingState(i8);
        }
        updateTrackingState(i8);
    }

    @Override // com.baidu.ar.k6
    public void onVpasAlgoStatePrint(int i8, int i9, float f8) {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.a(i8, i9, f8);
        }
    }

    @Override // com.baidu.ar.k6
    public void onVpasLocationSuccess() {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.v();
        }
    }

    @Override // com.baidu.ar.k6
    public void onVpasSendFrame() {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.w();
        }
    }

    @Override // com.baidu.ar.k6
    public void onVpasTrackingState(int i8) {
        j9 j9Var = this.S;
        if (j9Var != null) {
            int i9 = this.f1570d;
            if (i9 == 2 || i9 == 5) {
                j9Var.b(i8);
            }
        }
    }

    public void postNavigationRoute(List<Segments> list) {
        String str;
        if (this.f1578h == null) {
            Log.e("DuMixController", "loadCase mMapDuMix = null");
            return;
        }
        if (list != null && list.size() > 0) {
            this.f1592u.clear();
            this.f1592u.addAll(list);
        }
        this.f1578h.getMarkerManager().postNavigationRoute(list);
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.d(true);
        }
        if (this.f1573e0) {
            int i8 = this.f1570d;
            if (i8 == 3 || i8 == 2 || i8 == 5 || i8 == 6) {
                this.f1573e0 = false;
                HashMap hashMap = new HashMap();
                hashMap.put("duration", String.valueOf(Math.abs(System.currentTimeMillis() - this.Y) / 1000.0d));
                int i9 = this.f1570d;
                if (i9 == 5) {
                    str = "6DOF-NPC";
                } else if (i9 == 6) {
                    str = "3DOF-NPC";
                } else {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            str = "3DOF";
                        }
                        StatisticApi.onEvent(StatisticConstants.EVENT_AR_VPAS_NAVI_INIT_SUCCESS, hashMap);
                    }
                    str = "6DOF";
                }
                hashMap.put("type", str);
                StatisticApi.onEvent(StatisticConstants.EVENT_AR_VPAS_NAVI_INIT_SUCCESS, hashMap);
            }
        }
    }

    public boolean postRoute(List<double[]> list) {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.d(true);
            this.S.a("BaiduMap invoke Post Route!");
        }
        if (this.f1578h != null && this.f1566b && getVpasManager() != null) {
            getVpasManager().postRouteByList(list);
            return true;
        }
        com.baidu.ar.h.a("DuMixController", "postRoute: isCaseCreated is false need to cache!!");
        this.f1569c0 = list;
        return false;
    }

    public void reLocationByResourceUnLoad() {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            mapDuMix.getMarkerManager().releaseMarker();
            c();
            j9 j9Var = this.S;
            if (j9Var != null) {
                j9Var.a();
            }
        }
    }

    public boolean resourceIsCreate() {
        return this.f1566b;
    }

    public void runWithInitConfiguration(NavigationConfiguration navigationConfiguration, PositioningModuleAddListener positioningModuleAddListener) {
        runWithInitConfiguration(navigationConfiguration, positioningModuleAddListener, null);
    }

    public void senMessageToAR(Map<String, Object> map) {
        List list;
        String str;
        Map map2;
        String str2 = "type";
        if (map != null) {
            try {
                if (map.keySet().size() > 0) {
                    String str3 = (String) map.get("message_name");
                    if (TextUtils.isEmpty(str3)) {
                        return;
                    }
                    char c8 = 0;
                    char c9 = 1;
                    if ("update_presenttime".equals(str3)) {
                        String str4 = (String) map.get("message_value");
                        if (!TextUtils.isEmpty(str4)) {
                            if (NavigationLuaField.NAVI_LUA_NPC_LAUNCH_NIGHT.equals(str4)) {
                                this.f1568c = true;
                                g();
                            } else {
                                this.f1568c = false;
                                com.baidu.ar.h.b("DuMixController", "night model");
                            }
                        }
                    }
                    if ("right_button_position".equals(str3) && (map2 = (Map) map.get("message_value")) != null && map2.keySet().size() > 0) {
                        int intValue = ((Integer) map2.get("screen_width")).intValue();
                        int intValue2 = ((Integer) map2.get("screen_height")).intValue();
                        int intValue3 = ((Integer) map2.get("button_x")).intValue();
                        int intValue4 = ((Integer) map2.get("button_y")).intValue();
                        j9 j9Var = this.S;
                        if (j9Var != null) {
                            j9Var.a(intValue, intValue2, intValue3, intValue4);
                        }
                    }
                    if ("poi_list".equals(str3)) {
                        List list2 = (List) map.get("message_value");
                        HashMap<String, Object> hashMap = new HashMap<>();
                        hashMap.put("event_name", "npc_poi_list");
                        HashMap hashMap2 = new HashMap();
                        ArrayList arrayList = new ArrayList();
                        arrayList.clear();
                        int i8 = 0;
                        while (i8 < list2.size()) {
                            Map map3 = (Map) list2.get(i8);
                            if (map3 == null || map3.keySet().size() <= 0) {
                                list = list2;
                                str = str2;
                            } else {
                                HashMap hashMap3 = new HashMap();
                                float parseFloat = Float.parseFloat((String) map3.get(d2.c.XML_TAG_LONGITUDE));
                                float parseFloat2 = Float.parseFloat((String) map3.get(d2.c.XML_TAG_LATITUDE));
                                float[] fArr = new float[2];
                                fArr[c8] = parseFloat;
                                fArr[c9] = parseFloat2;
                                float[] convertPositionFromLatlng = convertPositionFromLatlng(fArr);
                                String str5 = (String) map3.get(str2);
                                String str6 = (String) map3.get("model_name");
                                hashMap3.put(str2, str5);
                                hashMap3.put("name", str6);
                                list = list2;
                                str = str2;
                                hashMap3.put("position", new Vector3f(convertPositionFromLatlng[c8], convertPositionFromLatlng[1], 0.0f));
                                arrayList.add(hashMap3);
                                Log.e("DuMixController", "lua position = (" + convertPositionFromLatlng[0] + SystemInfoUtil.COMMA + convertPositionFromLatlng[1] + ") type = " + str5 + " name = " + str6);
                            }
                            i8++;
                            list2 = list;
                            str2 = str;
                            c8 = 0;
                            c9 = 1;
                        }
                        hashMap2.put("poi_list", arrayList);
                        hashMap.put("event_data", hashMap2);
                        this.f1578h.sendMsg2Lua(hashMap);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                com.baidu.ar.h.b("DuMixController", th.getMessage());
            }
        }
    }

    public void setARRenderFpsCallback(l lVar) {
    }

    public void setBlueToothOpen(boolean z7) {
        this.f1579h0 = z7;
    }

    public void setEulerAngleCalback(OnEulerAngleCallback onEulerAngleCallback) {
        this.f1581j = onEulerAngleCallback;
    }

    public void setFrameAvailableListener(IMockFrameAvailable iMockFrameAvailable) {
        i9 i9Var = this.f1571d0;
        if (i9Var != null) {
            i9Var.a(iMockFrameAvailable);
        }
    }

    public void setIMUSourceTypeIsLocal() {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.e(false);
        }
    }

    public void setLoadLocalCase(boolean z7) {
        this.f1575f0 = z7;
    }

    public void setLocationTimeCallBack(IMarkerLocationTimeCallBack iMarkerLocationTimeCallBack) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null && mapDuMix.getMarkerManager() != null) {
            this.f1578h.getMarkerManager().setLocationTimeCallBack(iMarkerLocationTimeCallBack);
        }
        this.f1584m = iMarkerLocationTimeCallBack;
    }

    public void setMapIndoorParams(double[] dArr, String str, String str2) {
        this.f1580i.setInitGPSInfo(dArr);
        this.f1580i.setBuildingId(str);
        this.f1580i.setCuid(str2);
    }

    public void setMarkerAxisCallback(IMakerAxisCallback iMakerAxisCallback) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix == null || mapDuMix.getMarkerManager() == null) {
            this.mIMakerAxisZCallback = iMakerAxisCallback;
        } else {
            this.f1578h.getMarkerManager().setAxisCallback(iMakerAxisCallback);
        }
    }

    public void setMarkerStateListener(IMarkerStateListener iMarkerStateListener) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null && mapDuMix.getMarkerManager() != null) {
            this.f1578h.getMarkerManager().setMarkerStateListener(iMarkerStateListener);
        }
        this.mIMarkerStateListener = iMarkerStateListener;
        if (this.R || iMarkerStateListener == null) {
            return;
        }
        iMarkerStateListener.onResuourceCreated();
    }

    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.T.setOnClickListener(onClickListener);
    }

    public void setOnRecive2DMapPlaneListener(OnRecive2DMapPlaneListener onRecive2DMapPlaneListener) {
        this.D = onRecive2DMapPlaneListener;
    }

    public void setOnReciveCrossStreetFormLuaListener(OnReciveCrossStreetFormLuaListener onReciveCrossStreetFormLuaListener) {
        this.f1595x = onReciveCrossStreetFormLuaListener;
    }

    public void setOnReciveFootBridgeFormLuaListener(OnReciveFootBridgeFormLuaListener onReciveFootBridgeFormLuaListener) {
        this.f1597z = onReciveFootBridgeFormLuaListener;
    }

    public void setOnReciveLatLngFormLuaListener(OnReciveLatLngFormLuaListener onReciveLatLngFormLuaListener) {
        this.f1594w = onReciveLatLngFormLuaListener;
    }

    public void setOnReciveLuaListener(OnReciveLuaListener onReciveLuaListener) {
        this.A = onReciveLuaListener;
    }

    public void setOnReciveShakeListener(OnReciveShakeListener onReciveShakeListener) {
        this.E = onReciveShakeListener;
    }

    public void setOnReciveTunnelFormLuaListener(OnReciveTunnelFormLuaListener onReciveTunnelFormLuaListener) {
        this.f1596y = onReciveTunnelFormLuaListener;
    }

    public void setOnSetupComplete(OnSetupComplete onSetupComplete) {
        this.B = onSetupComplete;
    }

    public void setTrackingStateCallback(OnFrmeTrackingStateCallback onFrmeTrackingStateCallback) {
        this.f1593v = onFrmeTrackingStateCallback;
    }

    public void startReverseTransformCalculation(int i8, OnReverseTransformCalculationListener onReverseTransformCalculationListener, OnCoordinateBoundListener onCoordinateBoundListener) {
        this.C = onCoordinateBoundListener;
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null && mapDuMix.getMarkerManager() != null) {
            this.f1578h.getMarkerManager().setCoordinateBoundListener(this.C);
        }
        z2 z2Var = this.Q;
        if (z2Var != null) {
            z2Var.a();
            this.Q = null;
        }
        z2 z2Var2 = new z2(i8);
        this.Q = z2Var2;
        z2Var2.a(new d(onReverseTransformCalculationListener));
        this.Q.b();
    }

    public void stopReverseTransformCalculation() {
        z2 z2Var = this.Q;
        if (z2Var != null) {
            z2Var.a();
            this.Q = null;
        }
    }

    public void takePicture(String str, PhotoCallback photoCallback) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            mapDuMix.takePicture(str, photoCallback);
        }
    }

    public void test() {
        this.f1578h.getMarkerManager().test();
    }

    public void testResetButtonPixel(int i8, int i9, int i10, int i11) {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.a(i8, i9, i10, i11);
        }
    }

    public boolean tryBindingCoordinate() {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix == null || mapDuMix.getMarkerManager() == null) {
            return false;
        }
        return this.f1578h.getMarkerManager().bindingCoordinate();
    }

    public void updateAccelerometer(float[] fArr) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix == null || mapDuMix.getMarkerManager() == null || fArr == null || fArr.length <= 0) {
            return;
        }
        this.f1578h.getMarkerManager().updateMockAccelerometer(fArr[0], fArr[1], fArr[2]);
    }

    public void updateAuxiliaryLPositions(TranslationPrior translationPrior) {
        com.baidu.ar.h.a("DuMixController", "postRoute");
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix == null || mapDuMix.getMarkerManager() == null || translationPrior == null) {
            return;
        }
        translationPrior.setTime(System.currentTimeMillis());
        translationPrior.setConfidence(1.0f);
        this.f1577g0 = translationPrior;
        translationPrior.setType(this.f1579h0 ? 4 : 0);
        this.f1578h.getMarkerManager().updateTranslationPrior(this.f1577g0);
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.a(this.f1577g0);
        }
    }

    public void updateHeading(float f8, float f9) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix == null || mapDuMix.getMarkerManager() == null) {
            return;
        }
        this.f1578h.getMarkerManager().updateHeading(f8, f9);
    }

    public void updateImuMatrix(float[] fArr) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix == null || mapDuMix.getMarkerManager() == null) {
            return;
        }
        this.f1578h.getMarkerManager().updateImuData(fArr);
    }

    public void updateLocation(float[] fArr, int i8, boolean z7) {
        com.baidu.ar.h.b("DuMixController", "updateLocation");
        if (fArr != null) {
            this.F = new float[]{fArr[0], fArr[1]};
            this.G = i8;
            this.I = z7;
        }
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null && mapDuMix.getMarkerManager() != null) {
            this.f1578h.getMarkerManager().updateLocation(fArr, i8, z7);
        }
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.H();
        }
    }

    public void updateMeters(int i8) {
        com.baidu.ar.h.b("DuMixController", "updateMeters");
        this.N = i8;
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix == null || i8 <= 0) {
            return;
        }
        mapDuMix.getMarkerManager().updateMeters(i8);
    }

    public void updateTrackingState(int i8) {
        j9 j9Var;
        j9 j9Var2 = this.S;
        if (j9Var2 != null) {
            j9Var2.f(i8 == 0);
        }
        int i9 = this.f1587p;
        if (i9 != i8) {
            if (i9 == 0 && i8 == 1 && (j9Var = this.S) != null && this.f1570d == 5) {
                j9Var.a(false, (NavigationNpc) null);
            }
            if (this.f1587p == 1 && i8 == 0) {
                int i10 = this.f1570d;
                if (i10 == 2 || i10 == 5) {
                    if (!this.J && !this.K && !this.L && tryBindingCoordinate()) {
                        d();
                    }
                    this.J = false;
                    this.K = false;
                    this.L = false;
                }
            } else {
                clearNavigationRoute();
            }
            this.f1587p = i8;
        }
    }

    public void updateTrans() {
        TranslationPrior translationPrior = new TranslationPrior();
        translationPrior.setBuildingId("1");
        translationPrior.setFloorID("B2");
        translationPrior.setType(4);
        translationPrior.setConfidence(1.0f);
        translationPrior.setPrecision(1.0f);
        float[] fArr = new float[12];
        fArr[0] = 116.326324f;
        fArr[1] = 39.7882f;
        translationPrior.setCoordinate(fArr);
        updateAuxiliaryLPositions(translationPrior);
    }

    public void updateTransformData(int i8, float[] fArr) {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix == null || mapDuMix.getMarkerManager() == null) {
            return;
        }
        this.f1578h.getMarkerManager().updateTransformData(i8, fArr);
    }

    public void updateUIByClearRoute() {
        j9 j9Var = this.S;
        if (j9Var == null || !this.X) {
            return;
        }
        j9Var.b();
    }

    public final void b() {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            mapDuMix.release();
            this.f1578h = null;
        }
    }

    public final void c() {
        j9 j9Var = this.S;
        if (j9Var != null) {
            j9Var.C();
        }
        this.f1578h.getMarkerManager().createSession();
    }

    public final void d() {
        MapDuMix mapDuMix;
        if (!this.mMapDuMixSetuped || this.f1592u.size() <= 0 || (mapDuMix = this.f1578h) == null || !this.R) {
            return;
        }
        mapDuMix.getMarkerManager().postNavigationRoute(this.f1592u);
    }

    public final void e() {
        this.f1591t = false;
        this.f1590s = false;
    }

    public final void g() {
        if (this.f1578h == null || !this.f1566b) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", NavigationLuaField.NAVI_LUA_NPC_RUNTIME_STATE_UPDATE_MSG);
        hashMap.put("event_data", NavigationLuaField.NAVI_LUA_NPC_LAUNCH_TIME);
        this.f1578h.sendMsg2Lua(hashMap);
    }

    public final void i() {
        MapDuMix mapDuMix = this.f1578h;
        if (mapDuMix != null) {
            mapDuMix.stopMarker();
        }
    }

    @Override // com.baidu.ar.le.a
    public void onSurfaceCreated(Texture texture, SurfaceTexture surfaceTexture, int i8, int i9) {
        Log.d("DuMixController", "surfaceCreated cameraTexture.getId() = " + texture.getId());
        a(texture, surfaceTexture, i8, i9);
        Log.d("DuMixController", " setupMapDuMix width:" + i8 + ", height:" + i9);
    }

    public void runWithInitConfiguration(NavigationConfiguration navigationConfiguration, PositioningModuleAddListener positioningModuleAddListener, String str) {
        MapDuMix mapDuMix;
        MapDuMix mapDuMix2;
        String navigation3DofARKey;
        j9 j9Var;
        MapDuMix mapDuMix3;
        String navigation3DofNpcARKey;
        String str2;
        MapDuMix mapDuMix4;
        String navigation6DofARKey;
        MapDuMix mapDuMix5;
        MapDuMix mapDuMix6;
        this.f1573e0 = true;
        NavigationType selectedNavigationType = DeviceSupportAbility.getSelectedNavigationType();
        NavigationConfiguration navigationConfiguration2 = NavigationConfiguration.VPAS;
        if (navigationConfiguration == navigationConfiguration2 && selectedNavigationType == NavigationType.ARPedometer) {
            navigationConfiguration = NavigationConfiguration.ARPedometer;
        }
        if ((navigationConfiguration == null || (mapDuMix6 = this.f1578h) == null || mapDuMix6.getMarkerManager() == null) && positioningModuleAddListener != null) {
            positioningModuleAddListener.addPositioningResult(false);
            return;
        }
        this.Z = str;
        this.P = positioningModuleAddListener;
        this.H = System.currentTimeMillis();
        if (this.F != null && (mapDuMix5 = this.f1578h) != null) {
            mapDuMix5.getMarkerManager().updateLocation(this.F, this.G, this.I);
        }
        if (this.f1565a0) {
            this.f1565a0 = false;
            NavigationConfiguration navigationConfiguration3 = NavigationConfiguration.VIO;
            if (navigationConfiguration == navigationConfiguration3 || navigationConfiguration == NavigationConfiguration.NPC_VIO) {
                long currentTimeMillis = System.currentTimeMillis();
                this.W = currentTimeMillis;
                this.Y = currentTimeMillis;
                HashMap hashMap = new HashMap();
                hashMap.put("type", navigationConfiguration == navigationConfiguration3 ? "6DOF" : "6DOF-NPC");
                hashMap.put("cuid", ARConfig.getCUID());
                StatisticApi.onEvent(StatisticConstants.NAVIGATION_START, hashMap);
                this.f1570d = 2;
                if (navigationConfiguration == NavigationConfiguration.NPC_VIO) {
                    this.f1570d = 5;
                }
                MapDuMix mapDuMix7 = this.f1578h;
                if (mapDuMix7 != null) {
                    mapDuMix7.getMarkerManager().runAREngineWithNavigation(new k(navigationConfiguration, navigationConfiguration));
                    return;
                }
                return;
            }
            if (navigationConfiguration == navigationConfiguration2) {
                this.f1570d = 1;
                this.W = System.currentTimeMillis();
                this.f1578h.getMarkerManager().runVpasWithNavigation(new a());
                return;
            }
            NavigationConfiguration navigationConfiguration4 = NavigationConfiguration.IMU;
            if (navigationConfiguration == navigationConfiguration4 || navigationConfiguration == NavigationConfiguration.NPC_IMU) {
                long currentTimeMillis2 = System.currentTimeMillis();
                this.W = currentTimeMillis2;
                this.Y = currentTimeMillis2;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", navigationConfiguration == navigationConfiguration4 ? "3DOF" : "3DOF-NPC");
                hashMap2.put("cuid", ARConfig.getCUID());
                StatisticApi.onEvent(StatisticConstants.NAVIGATION_START, hashMap2);
                this.P = positioningModuleAddListener;
                this.f1578h.getMarkerManager().runImuWithNavigation(new b(navigationConfiguration, navigationConfiguration));
                return;
            }
            if (navigationConfiguration == NavigationConfiguration.ARPedometer) {
                this.W = System.currentTimeMillis();
                if (!this.R) {
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("type", "ARPEDOMETER");
                    hashMap3.put("cuid", ARConfig.getCUID());
                    StatisticApi.onEvent(StatisticConstants.NAVIGATION_START, hashMap3);
                }
                this.f1570d = 4;
                this.P = positioningModuleAddListener;
                j9 j9Var2 = this.S;
                if (j9Var2 != null) {
                    j9Var2.E();
                }
                PositioningModuleAddListener positioningModuleAddListener2 = this.P;
                if (positioningModuleAddListener2 != null) {
                    positioningModuleAddListener2.addPositioningResult(true);
                }
                this.f1578h.getMarkerManager().runPedometerWithNavigation(new c());
                return;
            }
            return;
        }
        if (!this.R || (mapDuMix = this.f1578h) == null) {
            return;
        }
        if (navigationConfiguration != NavigationConfiguration.NPC_VIO) {
            if (navigationConfiguration == NavigationConfiguration.VIO) {
                this.f1570d = 2;
                if (this.f1575f0) {
                    mapDuMix.loadCase(getDirectory("6dof"), "");
                } else {
                    if (TextUtils.isEmpty(this.Z)) {
                        mapDuMix4 = this.f1578h;
                        navigation6DofARKey = ARConfig.getNavigation6DofARKey();
                    } else {
                        mapDuMix4 = this.f1578h;
                        navigation6DofARKey = this.Z;
                    }
                    mapDuMix4.loadCase(navigation6DofARKey);
                }
                j9Var = this.S;
                if (j9Var == null) {
                    return;
                }
            } else if (navigationConfiguration == NavigationConfiguration.NPC_IMU) {
                this.f1570d = 6;
                if (this.f1575f0) {
                    str2 = "3dof-npc";
                    mapDuMix.loadCase(getDirectory(str2), "");
                    return;
                } else {
                    if (TextUtils.isEmpty(this.Z)) {
                        mapDuMix3 = this.f1578h;
                        navigation3DofNpcARKey = ARConfig.getNavigation3DofNpcARKey();
                    }
                    mapDuMix3 = this.f1578h;
                    navigation3DofNpcARKey = this.Z;
                }
            } else {
                if (navigationConfiguration != NavigationConfiguration.IMU) {
                    return;
                }
                this.f1570d = 3;
                if (this.f1575f0) {
                    mapDuMix.loadCase(getDirectory("3dof"), "");
                } else {
                    if (TextUtils.isEmpty(this.Z)) {
                        mapDuMix2 = this.f1578h;
                        navigation3DofARKey = ARConfig.getNavigation3DofARKey();
                    } else {
                        mapDuMix2 = this.f1578h;
                        navigation3DofARKey = this.Z;
                    }
                    mapDuMix2.loadCase(navigation3DofARKey);
                }
                j9Var = this.S;
                if (j9Var == null) {
                    return;
                }
            }
            j9Var.a(false, (NavigationNpc) null);
            return;
        }
        this.f1570d = 5;
        if (this.f1575f0) {
            str2 = "6dof-npc";
            mapDuMix.loadCase(getDirectory(str2), "");
            return;
        } else {
            if (TextUtils.isEmpty(this.Z)) {
                mapDuMix3 = this.f1578h;
                navigation3DofNpcARKey = ARConfig.getNavigation6DofNpcARKey();
            }
            mapDuMix3 = this.f1578h;
            navigation3DofNpcARKey = this.Z;
        }
        mapDuMix3.loadCase(navigation3DofNpcARKey);
    }

    public final void b(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        hashMap2.put("message_name", "poi_list");
        hashMap2.put("message_value", a(hashMap));
        senMessageToAR(hashMap2);
    }

    public final void d(boolean z7) {
        this.f1589r = z7;
        a();
    }

    public final ArrayList<Map<String, Object>> a(HashMap hashMap) {
        ArrayList<Map<String, Object>> arrayList = new ArrayList<>();
        arrayList.clear();
        for (Map.Entry entry : hashMap.entrySet()) {
            HashMap hashMap2 = (HashMap) entry.getValue();
            String str = (String) hashMap2.get("type");
            String str2 = (String) hashMap2.get("model_name");
            String str3 = (String) hashMap2.get("desc");
            arrayList.add(hashMap2);
            Log.e("DuMixController", "Key: " + ((String) entry.getKey()) + " type = " + str + " model = " + str2 + " name = " + str3);
        }
        return arrayList;
    }

    public final void b(boolean z7) {
        this.f1588q = z7;
        a();
    }

    public final void c(boolean z7) {
        this.f1590s = z7;
        a();
    }

    public final void a() {
        PositioningModuleAddListener positioningModuleAddListener = this.P;
        if (positioningModuleAddListener == null || this.f1591t || !this.R) {
            return;
        }
        boolean z7 = this.f1588q && this.f1589r && this.f1590s;
        this.f1591t = z7;
        if (z7) {
            positioningModuleAddListener.addPositioningResult(z7);
        }
    }

    public final void a(Texture texture, SurfaceTexture surfaceTexture, int i8, int i9) {
        this.f1580i.setShareContext(EGL14.eglGetCurrentContext());
        this.f1580i.setUseTextureIO(true);
        DuMixInput duMixInput = new DuMixInput(texture, this.f1585n, this.f1586o);
        duMixInput.setCameraInput(true);
        duMixInput.setFrontCamera(false);
        surfaceTexture.setOnFrameAvailableListener(this.f1574f);
        DuMixOutput duMixOutput = new DuMixOutput(surfaceTexture, i8, i9);
        getMapDuMixInstance();
        this.f1578h.addFrameRenderListener(this.f1574f);
        this.f1578h.setup(duMixInput, duMixOutput, createMapDuMixCallback());
        this.f1578h.addLuaMsgListener(this);
    }

    public final void a(boolean z7) {
        if (this.f1578h == null || !this.f1566b) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", NavigationLuaField.NAVI_LUA_NPC_LAUNCH_STATE_UPDATE_MSG);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(NavigationLuaField.NAVI_LUA_NPC_LAUNCH_STATE, z7 ? NavigationLuaField.NAVI_LUA_NPC_FIRST_LAUNCH : NavigationLuaField.NAVI_LUA_NPC_RE_LAUNCH);
        hashMap.put("event_data", hashMap2);
        this.f1578h.sendMsg2Lua(hashMap);
    }
}
