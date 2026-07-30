package com.baidu.ar.baidumap;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.baidu.ar.ARType;
import com.baidu.ar.DefaultParams;
import com.baidu.ar.DefinedLuaListener;
import com.baidu.ar.DuMixCallback;
import com.baidu.ar.DuMixController;
import com.baidu.ar.DuMixErrorType;
import com.baidu.ar.DuMixInput;
import com.baidu.ar.DuMixOutput;
import com.baidu.ar.ab;
import com.baidu.ar.ability.AbilityType;
import com.baidu.ar.arrender.FrameRenderListener;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.arrender.IGLRenderer;
import com.baidu.ar.baidumap.a;
import com.baidu.ar.baidumap.bean.CommandDate;
import com.baidu.ar.baidumap.bean.CommandType;
import com.baidu.ar.baidumap.bean.VpasResource;
import com.baidu.ar.bean.Watermark;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.h;
import com.baidu.ar.ib;
import com.baidu.ar.j4;
import com.baidu.ar.lua.LuaMsgListener;
import com.baidu.ar.m8;
import com.baidu.ar.marker.IMarker;
import com.baidu.ar.photo.PhotoCallback;
import com.baidu.ar.record.IRecord;
import com.baidu.ar.record.RecordCallback;
import com.baidu.ar.s9;
import com.baidu.ar.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class MapDuMix implements IMapDuMix, IRecord, LuaMsgListener, CaseDownloadListener {

    /* renamed from: m, reason: collision with root package name */
    public static volatile MapDuMix f1800m;

    /* renamed from: a, reason: collision with root package name */
    public Context f1801a;

    /* renamed from: b, reason: collision with root package name */
    public MapDuMixParams f1802b;

    /* renamed from: c, reason: collision with root package name */
    public MapDuMixCallback f1803c;

    /* renamed from: d, reason: collision with root package name */
    public ILocationService f1804d;

    /* renamed from: e, reason: collision with root package name */
    public com.baidu.ar.baidumap.a f1805e;

    /* renamed from: f, reason: collision with root package name */
    public CaseStateListener f1806f;

    /* renamed from: g, reason: collision with root package name */
    public DuMixController f1807g;

    /* renamed from: h, reason: collision with root package name */
    public m8 f1808h;

    /* renamed from: i, reason: collision with root package name */
    public String f1809i;

    /* renamed from: j, reason: collision with root package name */
    public d f1810j;

    /* renamed from: k, reason: collision with root package name */
    public VpasResource f1811k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1812l;

    public class a implements a.e {
        public a() {
        }

        @Override // com.baidu.ar.baidumap.a.e
        public void a(IARCaseInfo iARCaseInfo) {
            if (MapDuMix.this.f1810j != null) {
                MapDuMix.this.f1810j.onCaseQueryResult(iARCaseInfo);
            }
            if (iARCaseInfo == null || TextUtils.isEmpty(iARCaseInfo.getArCasePath()) || MapDuMix.this.f1807g == null) {
                return;
            }
            if (j4.h(new File(iARCaseInfo.getArCasePath()))) {
                MapDuMix.this.f1807g.loadCase(ARType.valueOf(iARCaseInfo.getARType()), iARCaseInfo.getArCasePath(), iARCaseInfo.getARKey());
            } else {
                MapDuMix.this.loadCase(iARCaseInfo.getARKey());
            }
        }
    }

    public class b implements s9 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnNavigationInfoCallback f1814a;

        public b(OnNavigationInfoCallback onNavigationInfoCallback) {
            this.f1814a = onNavigationInfoCallback;
        }

        @Override // com.baidu.ar.s9
        public void a(boolean z7, String str, VpasResource vpasResource) {
            OnNavigationInfoCallback onNavigationInfoCallback = this.f1814a;
            if (onNavigationInfoCallback != null) {
                onNavigationInfoCallback.onNavInfoResult(z7, str, vpasResource);
            }
            if (vpasResource == null || vpasResource.getNavigationRes() == null) {
                return;
            }
            MapDuMix.this.loadCase("10328131");
            MapDuMix.this.f1811k = vpasResource;
        }
    }

    public class c implements DuMixCallback {
        public c() {
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onCaseCreate(boolean z7, String str, String str2) {
            if (MapDuMix.this.f1806f != null) {
                MapDuMix.this.f1806f.onCaseCreated(z7, str2, str);
                if (z7 && MapDuMix.this.f1811k != null && MapDuMix.this.f1811k.getNavigationRes() != null && MapDuMix.this.f1811k.getNavigationRes().getNavigationContents() != null) {
                    MapDuMix mapDuMix = MapDuMix.this;
                    mapDuMix.a(mapDuMix.f1811k.getNavigationRes().getNavigationContents());
                }
            }
            if (z7) {
                ib.a(2);
            }
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onCaseDestroy() {
            if (MapDuMix.this.f1806f != null) {
                MapDuMix.this.f1806f.onCaseDestroy();
            }
            ib.a();
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onError(DuMixErrorType duMixErrorType, String str, String str2) {
            h.b("MapDuMix", "onError" + duMixErrorType + ", errorMessage:" + str);
            if ((duMixErrorType == DuMixErrorType.LibraryError || duMixErrorType == DuMixErrorType.LoadCaseError) && MapDuMix.this.f1803c != null) {
                MapDuMix.this.f1803c.onError();
            }
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onRelease() {
            if (MapDuMix.this.f1803c != null) {
                MapDuMix.this.f1803c.onRelease(true);
            }
        }

        @Override // com.baidu.ar.DuMixCallback
        public void onSetup(boolean z7, DuMixInput duMixInput, DuMixOutput duMixOutput) {
            if (MapDuMix.this.f1803c != null) {
                MapDuMix.this.f1803c.onSetup(z7, duMixInput, duMixOutput);
            }
        }
    }

    public interface d {
        void onCaseQueryResult(IARCaseInfo iARCaseInfo);
    }

    public MapDuMix(Context context, MapDuMixParams mapDuMixParams) {
        boolean a8 = a(context, "libdumixar.so");
        this.f1812l = a8;
        if (!a8) {
            h.b("MapDuMix", "MapDuMix create error!!! As libEglCore.so not exists!!!");
            return;
        }
        this.f1801a = context.getApplicationContext();
        a(mapDuMixParams);
        a(this.f1801a);
    }

    public static MapDuMix getInstance(Context context, MapDuMixParams mapDuMixParams) {
        if (f1800m == null) {
            synchronized (MapDuMix.class) {
                try {
                    if (f1800m == null) {
                        f1800m = new MapDuMix(context, mapDuMixParams);
                    }
                } finally {
                }
            }
        }
        return f1800m;
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void addFrameRenderListener(FrameRenderListener frameRenderListener) {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.addFrameRenderListener(frameRenderListener);
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public boolean addLuaMsgListener(LuaMsgListener luaMsgListener) {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null) {
            return false;
        }
        duMixController.addLuaMsgListener(luaMsgListener);
        this.f1807g.addLuaMsgListener(this);
        return false;
    }

    public final DuMixCallback b() {
        return new c();
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void cancelAll() {
        com.baidu.ar.baidumap.a aVar = this.f1805e;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void cancelCaseDownload(String str) {
        com.baidu.ar.baidumap.a aVar = this.f1805e;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void changeOutputObject(Object obj, int i8, int i9) {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.changeOutputObject(obj, i8, i9);
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void changeOutputSize(int i8, int i9) {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.changeOutputSize(i8, i9);
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void checkCaseUpdate(String str, x1 x1Var) {
        com.baidu.ar.baidumap.a aVar = this.f1805e;
        if (aVar != null) {
            aVar.a(str, x1Var);
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void clearCase() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.clearCase();
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void doCommand(CommandType commandType, CommandDate commandDate) {
        m8 m8Var = this.f1808h;
        if (m8Var != null) {
            m8Var.a(commandType, commandDate);
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void downloadCase(String str, CaseDownloadListener caseDownloadListener) {
        a(this.f1801a);
        com.baidu.ar.baidumap.a aVar = this.f1805e;
        if (aVar != null) {
            aVar.a(str, caseDownloadListener);
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public IARRenderer getARRenderer() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            return duMixController.getARRenderer();
        }
        return null;
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public IGLRenderer getGLRenderer() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            return duMixController.getGLRenderer();
        }
        return null;
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public IMarker getMarkerManager() {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null || duMixController.getARProxyManager() == null) {
            return null;
        }
        return this.f1807g.getARProxyManager().getMarkerAR();
    }

    @Override // com.baidu.ar.lua.LuaMsgListener
    public List<String> getMsgKeyListened() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_name");
        return arrayList;
    }

    public void getVpasResByBuildingId(Context context, String str, s9 s9Var) {
        m8 m8Var = this.f1808h;
        if (m8Var != null) {
            m8Var.a(context, str, s9Var);
        }
    }

    public void getVpsResBySessionId(String str, OnNavigationInfoCallback onNavigationInfoCallback) {
        m8 m8Var = this.f1808h;
        if (m8Var != null) {
            m8Var.a(str, new b(onNavigationInfoCallback));
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void loadCase(String str) {
        String str2;
        if ((ib.b() || (str2 = this.f1809i) == null || !str2.equals(str)) && this.f1805e != null) {
            if (!TextUtils.isEmpty(this.f1809i)) {
                this.f1805e.a(this.f1809i);
            }
            this.f1809i = str;
            this.f1805e.b(str);
            ib.a(1);
        }
    }

    @Override // com.baidu.ar.baidumap.CaseDownloadListener
    public void onDownloadFinish(boolean z7, String str, String str2, int i8, String str3) {
        if (z7 && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            a(str, "../../bar_" + str + "/ar");
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "__vpas_content_res_download_failed");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("arkey", str);
        hashMap.put("event_data", hashMap2);
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.sendMsg2Lua(hashMap);
        }
    }

    @Override // com.baidu.ar.baidumap.CaseDownloadListener
    public void onDownloadProgress(int i8, String str) {
        h.b("MapDuMix", "onDownloadProgress:" + i8);
    }

    @Override // com.baidu.ar.lua.LuaMsgListener
    public void onLuaMessage(HashMap<String, Object> hashMap) {
        if (hashMap == null || hashMap.keySet().size() < 1 || !hashMap.containsKey("event_name") || !"__vpas_content_prepare_res".equals((String) hashMap.get("event_name"))) {
            return;
        }
        float floatValue = ((Float) ((HashMap) hashMap.get("event_data")).get("arkey")).floatValue();
        com.baidu.ar.baidumap.a aVar = this.f1805e;
        if (aVar != null) {
            aVar.a(String.valueOf((int) floatValue), this);
        }
    }

    @Override // com.baidu.ar.baidumap.CaseDownloadListener
    public void onRefused() {
        h.a("MapDuMix", "onRefused");
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            return duMixController.onTouch(view, motionEvent);
        }
        return false;
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void pause() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.pause();
        }
    }

    @Override // com.baidu.ar.record.IRecord
    public void pauseRecord() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.pauseRecord();
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void pauseScene() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.pauseScene();
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void release() {
        com.baidu.ar.baidumap.a aVar = this.f1805e;
        if (aVar != null) {
            aVar.b();
            this.f1805e = null;
        }
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.release();
            this.f1807g = null;
        }
        m8 m8Var = this.f1808h;
        if (m8Var != null) {
            m8Var.a();
            this.f1808h = null;
        }
        this.f1801a = null;
        f1800m = null;
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void removeFrameRenderListener(FrameRenderListener frameRenderListener) {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.removeFrameRenderListener(frameRenderListener);
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public boolean removeLuaMsgListener(LuaMsgListener luaMsgListener) {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null) {
            return false;
        }
        duMixController.removeLuaMsgListener(luaMsgListener);
        return false;
    }

    public void render(long j8) {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null || duMixController.getARRenderer() == null) {
            return;
        }
        this.f1807g.getARRenderer().render(j8);
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void resume() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.resume();
        }
    }

    @Override // com.baidu.ar.record.IRecord
    public void resumeRecord() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.resumeRecord();
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void resumeScene() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.resumeScene();
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public boolean sendLuaScript2Engine(String str) {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null) {
            return false;
        }
        duMixController.sendLuaScript2Engine(str);
        return false;
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public boolean sendMsg2Lua(HashMap<String, Object> hashMap) {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null) {
            return false;
        }
        duMixController.sendMsg2Lua(hashMap);
        return false;
    }

    public void setCaseQueryResourcecallback(d dVar) {
        this.f1810j = dVar;
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void setCaseStateListener(CaseStateListener caseStateListener) {
        this.f1806f = caseStateListener;
        com.baidu.ar.baidumap.a aVar = this.f1805e;
        if (aVar != null) {
            aVar.a(caseStateListener);
        }
    }

    public void setDefinedLuaListener(DefinedLuaListener definedLuaListener) {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.setDefinedLuaListener(definedLuaListener);
        }
    }

    public void setDownloadComplete() {
        this.f1807g.setDownloadComplete();
    }

    public void setEulerAngle(float f8, float f9, float f10) {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null || duMixController.getARRenderer() == null) {
            return;
        }
        this.f1807g.getARRenderer().setRootNodeEulerAngle(f8, f9, f10);
    }

    public void setFieldOfView(float f8) {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null || duMixController.getARRenderer() == null) {
            return;
        }
        this.f1807g.getARRenderer().setFieldOfView(f8);
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void setLocationService(ILocationService iLocationService) {
        this.f1804d = iLocationService;
    }

    @Override // com.baidu.ar.record.IRecord
    public void setRecordWatermark(Watermark watermark) {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.setRecordWatermark(watermark);
        }
    }

    public void setRotation(float f8, float f9, float f10) {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null || duMixController.getARRenderer() == null) {
            return;
        }
        this.f1807g.getARRenderer().setRootNodeRotation(f8, f9, f10);
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void setup(DuMixInput duMixInput, DuMixOutput duMixOutput, MapDuMixCallback mapDuMixCallback) {
        this.f1803c = mapDuMixCallback;
        if (!this.f1812l) {
            mapDuMixCallback.onError();
            return;
        }
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.setup(duMixInput, duMixOutput, b());
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public boolean startAbility(AbilityType abilityType, HashMap<String, Object> hashMap) {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null || abilityType == null) {
            return false;
        }
        return duMixController.startAbility(abilityType, hashMap);
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void startMarker() {
        if (this.f1807g == null || this.f1802b == null) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.f1802b.getInitGPSInfo() != null) {
            hashMap.put("lat", Double.valueOf(this.f1802b.getInitGPSInfo()[0]));
            hashMap.put("lng", Double.valueOf(this.f1802b.getInitGPSInfo()[1]));
        }
        if (!TextUtils.isEmpty(this.f1802b.getBuildingId())) {
            hashMap.put("building_id", this.f1802b.getBuildingId());
        }
        MapDuMixParams mapDuMixParams = this.f1802b;
        if (mapDuMixParams != null && !TextUtils.isEmpty(mapDuMixParams.getCuid())) {
            hashMap.put("cuid", this.f1802b.getCuid());
        }
        hashMap.put("camera_input_width", Integer.valueOf(this.f1802b.getWidth()));
        hashMap.put("camera_input_height", Integer.valueOf(this.f1802b.getHeight()));
        this.f1807g.startAbility(AbilityType.VPAS_MARKER, hashMap);
    }

    @Override // com.baidu.ar.record.IRecord
    public void startRecord(String str, long j8, RecordCallback recordCallback) {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.startRecord(str, j8, recordCallback);
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public boolean stopAbility(AbilityType abilityType) {
        DuMixController duMixController = this.f1807g;
        if (duMixController == null || abilityType == null) {
            return false;
        }
        return duMixController.stopAbility(abilityType);
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void stopMarker() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.stopAbility(AbilityType.VPAS_MARKER);
        }
    }

    @Override // com.baidu.ar.record.IRecord
    public void stopRecord() {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.stopRecord();
        }
    }

    public void takePicture(String str, PhotoCallback photoCallback) {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.takePicture(str, photoCallback);
        }
    }

    public final a.e a() {
        return new a();
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void loadCase(String str, ARType aRType) {
        if (this.f1805e != null) {
            if (!TextUtils.isEmpty(this.f1809i)) {
                this.f1805e.a(this.f1809i);
            }
            this.f1809i = str;
            this.f1805e.b(str);
        }
    }

    @Override // com.baidu.ar.baidumap.IMapDuMix
    public void loadCase(String str, String str2) {
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.loadCase(str, str2);
        }
    }

    public final void a(Context context) {
        if (this.f1805e != null || context == null) {
            return;
        }
        com.baidu.ar.baidumap.a aVar = new com.baidu.ar.baidumap.a(context);
        this.f1805e = aVar;
        aVar.a(this.f1806f);
        this.f1805e.a(a());
    }

    public final void a(MapDuMixParams mapDuMixParams) {
        this.f1802b = mapDuMixParams;
        DefaultParams defaultParams = new DefaultParams();
        defaultParams.setRenderPipeline("filter_pipeline = function()\n\n    fm = ae.FilterManager:get_instance();\n\n    engine_filter = fm:create_filter(\"EngineFilter\", \"globalEngineFilter\", true);\n    fm:update_property_int(engine_filter, \"is_enable\", 1);\n    fm:reset_pipeline();\n\n    fm:connect_filter_to_camera(engine_filter);\n    fm:connect_filter_to_output(engine_filter);\n\nend\n\nfilter_pipeline()\n\n");
        defaultParams.setUseBeautyFilter(false);
        defaultParams.setUseFaceFilter(false);
        defaultParams.setUseMakeupFilter(false);
        defaultParams.setUseTextureIO(mapDuMixParams.isUseTextureIO());
        defaultParams.setShareContext(mapDuMixParams.getShareContext());
        defaultParams.setUseInputSizeInEngine(false);
        defaultParams.setRecordAutoCrop(true);
        defaultParams.setOBRConfig(mapDuMixParams.getOBRConfig());
        DuMixController duMixController = DuMixController.getInstance(this.f1801a, defaultParams);
        this.f1807g = duMixController;
        this.f1808h = new m8(duMixController, mapDuMixParams);
    }

    public final void a(String str, String str2) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "__vpas_content_res_ready");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("arkey", str);
        hashMap2.put("resource_path", str2);
        hashMap.put("event_data", hashMap2);
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.sendMsg2Lua(hashMap);
        }
    }

    public final void a(List<HashMap<String, Object>> list) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("event_name", "__update_vpas_content_map");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("content_map", list);
        hashMap.put("event_data", hashMap2);
        DuMixController duMixController = this.f1807g;
        if (duMixController != null) {
            duMixController.sendMsg2Lua(hashMap);
        }
    }

    public final boolean a(Context context, String str) {
        if (ab.a("com.baidu.ar.remoteres.RemoteResLoader", context.getClassLoader())) {
            return new File(DuMixController.getSoDownLoadDir(context), str).exists();
        }
        return true;
    }
}
