package com.baidu.ar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import com.baidu.ar.arrender.FrameRenderListener;
import com.baidu.ar.arrender.IARRenderer;
import com.baidu.ar.baidumap.CaseDownloadListener;
import com.baidu.ar.baidumap.CaseStateListener;
import com.baidu.ar.baidumap.MapDuMix;
import com.baidu.ar.baidumap.MapDuMixCallback;
import com.baidu.ar.baidumap.MapDuMixParams;
import com.baidu.ar.base.MsgField;
import com.baidu.ar.base.RequestController;
import com.baidu.ar.bean.ARResource;
import com.baidu.ar.bean.BrowserBean;
import com.baidu.ar.bean.DuMixRes;
import com.baidu.ar.bean.Watermark;
import com.baidu.ar.content.IARCaseInfo;
import com.baidu.ar.lua.LuaMsgListener;
import com.baidu.ar.obr.OBRConfig;
import com.baidu.ar.record.RecordCallback;
import com.baidu.ar.recorder.MovieRecorderCallback;
import com.baidu.ar.resloader.ArCaseDownloadListener;
import com.baidu.ar.vps.IARInnerLocationTransService;
import com.baidu.location.LocationConst;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ARController implements MapDuMix.d {

    /* renamed from: a, reason: collision with root package name */
    public Context f1432a;

    /* renamed from: b, reason: collision with root package name */
    public DuMixSource f1433b;

    /* renamed from: c, reason: collision with root package name */
    public DuMixTarget f1434c;

    /* renamed from: d, reason: collision with root package name */
    public ARCallback f1435d;

    /* renamed from: e, reason: collision with root package name */
    public p9 f1436e;

    /* renamed from: f, reason: collision with root package name */
    public MapDuMix f1437f;

    /* renamed from: g, reason: collision with root package name */
    public AudioManager f1438g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1439h = false;

    /* renamed from: i, reason: collision with root package name */
    public RequestController f1440i;

    /* renamed from: j, reason: collision with root package name */
    public MapDuMixParams f1441j;

    public class a implements LuaMsgListener {
        public a() {
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public List<String> getMsgKeyListened() {
            return Arrays.asList("id", "event_id", "action_type", LocationConst.HDYawConst.KEY_HD_YAW_STATE, "event_name");
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public void onLuaMessage(HashMap<String, Object> hashMap) {
            ARController.this.a(hashMap);
            if (ARController.this.f1435d != null) {
                ARController.this.f1435d.onLuaMessage(hashMap);
            }
        }
    }

    public class b implements DefinedLuaListener {
        public b() {
        }

        @Override // com.baidu.ar.DefinedLuaListener
        public void onOpenUrl(String str, int i8, HashMap<String, Object> hashMap) {
            BrowserBean browserBean = new BrowserBean();
            browserBean.setBrowserType(i8);
            browserBean.setBrowserUrl(str);
            ARController.this.outputStateMessage(MsgField.MSG_OPEN_URL, browserBean);
        }

        @Override // com.baidu.ar.DefinedLuaListener
        public void onRequireSwitchCamera(int i8) {
        }
    }

    public class c implements MapDuMixCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DuMixSource f1444a;

        public c(DuMixSource duMixSource) {
            this.f1444a = duMixSource;
        }

        @Override // com.baidu.ar.baidumap.MapDuMixCallback
        public void onError() {
            ARController.this.outputStateMessage(MsgField.MSG_NO_NETWORK_FOR_DOWNLOAD_RES, "network error!!!");
            if (ARController.this.f1435d != null) {
                ARController.this.f1435d.onStateError(2303, "");
            }
        }

        @Override // com.baidu.ar.baidumap.MapDuMixCallback
        public void onRelease(boolean z7) {
            if (ARController.this.f1435d != null) {
                ARController.this.f1435d.onRelease(z7);
            }
        }

        @Override // com.baidu.ar.baidumap.MapDuMixCallback
        public void onSetup(boolean z7, DuMixInput duMixInput, DuMixOutput duMixOutput) {
            DuMixSource duMixSource;
            if (z7 && ARController.this.f1433b != null && !ARController.this.f1433b.isNeedDrawBackground() && ARController.this.f1437f != null) {
                ARController.this.f1437f.getARRenderer().setRenderBlendInput(false);
            }
            ARController.this.outputStateMessage(z7 ? 1201 : MsgField.IMSG_SO_LOAD_FAILED, "");
            if (!z7 || (duMixSource = this.f1444a) == null || TextUtils.isEmpty(duMixSource.getArKey())) {
                ARController.this.outputStateMessage(MsgField.MSG_NO_NETWORK_FOR_START_QUERY_RES, "");
            } else {
                ARController.this.outputStateMessage(9003, "");
                if (!m9.e(ARController.this.f1432a)) {
                    h.b("ARController", "No network");
                    ARController.this.outputStateMessage(MsgField.MSG_NO_NETWORK_FOR_START_QUERY_RES, "");
                    return;
                } else if (m9.f(ARController.this.f1432a) && ARController.this.f1437f != null) {
                    ARController.this.f1437f.loadCase(this.f1444a.getArKey(), ARType.valueOf(this.f1444a.getArType()));
                } else if (m9.d(ARController.this.f1432a)) {
                    ARController aRController = ARController.this;
                    aRController.outputStateMessage(MsgField.MSG_MOBILE_NETWORK_FOR_START_QUERY_RES, aRController.f1440i);
                }
            }
            if (ARController.this.f1435d != null) {
                ARController.this.f1435d.onSetup(z7);
            }
        }
    }

    public class d implements CaseStateListener {
        public d() {
        }

        @Override // com.baidu.ar.baidumap.CaseStateListener
        public void onCaseCreated(boolean z7, String str, String str2) {
            if (z7) {
                ARController.this.outputStateMessage(MsgField.IMSG_MODEL_LOADED, "");
            }
        }

        @Override // com.baidu.ar.baidumap.CaseStateListener
        public void onCaseDestroy() {
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onDownloadFinish(boolean z7, String str, String str2, int i8, String str3) {
            if (z7) {
                return;
            }
            ARController.this.outputStateMessage(MsgField.MSG_NO_NETWORK_FOR_DOWNLOAD_RES, "");
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onDownloadProgress(int i8, String str) {
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onRefused() {
            ARController.this.outputStateMessage(MsgField.IMSG_DEVICE_NOT_SUPPORT, "");
        }
    }

    public class e implements RecordCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MovieRecorderCallback f1447a;

        public e(ARController aRController, MovieRecorderCallback movieRecorderCallback) {
            this.f1447a = movieRecorderCallback;
        }

        @Override // com.baidu.ar.record.RecordCallback
        public void onRecorderComplete(boolean z7, String str) {
            this.f1447a.onRecorderComplete(z7, str);
        }

        @Override // com.baidu.ar.record.RecordCallback
        public void onRecorderProcess(int i8) {
            this.f1447a.onRecorderProcess(i8);
        }

        @Override // com.baidu.ar.record.RecordCallback
        public void onRecorderStart(boolean z7) {
            this.f1447a.onRecorderStart(z7);
        }
    }

    public class f implements CaseDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArCaseDownloadListener f1448a;

        public f(ArCaseDownloadListener arCaseDownloadListener) {
            this.f1448a = arCaseDownloadListener;
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onDownloadFinish(boolean z7, String str, String str2, int i8, String str3) {
            ArCaseDownloadListener arCaseDownloadListener = this.f1448a;
            if (arCaseDownloadListener != null) {
                arCaseDownloadListener.onFinish(str, z7, str3);
            }
            ARController.this.outputStateMessage(MsgField.MSG_STAT_DOWNLOAD_3D_RES_SUCCESS, "");
            if (z7) {
                return;
            }
            ARController.this.outputStateMessage(MsgField.IMSG_DEVICE_NOT_SUPPORT, "");
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onDownloadProgress(int i8, String str) {
            ArCaseDownloadListener arCaseDownloadListener = this.f1448a;
            if (arCaseDownloadListener != null) {
                arCaseDownloadListener.onProgress(str, i8);
            }
        }

        @Override // com.baidu.ar.baidumap.CaseDownloadListener
        public void onRefused() {
            ARController.this.outputStateMessage(MsgField.IMSG_DEVICE_NOT_SUPPORT, "");
        }
    }

    public class g implements x1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArCaseDownloadListener f1450a;

        public g(ARController aRController, ArCaseDownloadListener arCaseDownloadListener) {
            this.f1450a = arCaseDownloadListener;
        }

        @Override // com.baidu.ar.x1
        public void a(String str, boolean z7, float f8) {
            ArCaseDownloadListener arCaseDownloadListener = this.f1450a;
            if (arCaseDownloadListener != null) {
                arCaseDownloadListener.onCaseUpdate(z7, f8);
            }
        }
    }

    public ARController(Context context) {
        this.f1432a = context;
        MapDuMixParams mapDuMixParams = new MapDuMixParams();
        this.f1441j = mapDuMixParams;
        this.f1437f = MapDuMix.getInstance(context, mapDuMixParams);
    }

    public static boolean isContainMusic(String str) {
        DuMixRes a8;
        if (TextUtils.isEmpty(str) || !ProjectParams.isHuaweiProject() || (a8 = v9.a(a(str))) == null) {
            return false;
        }
        return a8.isContainMusic();
    }

    public static boolean isSupportFrontCamera(String str) {
        DuMixRes a8;
        if (TextUtils.isEmpty(str) || (a8 = v9.a(a(str))) == null) {
            return false;
        }
        return a8.isSupportFrontCamera();
    }

    public void addFrameRenderListener(FrameRenderListener frameRenderListener) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.addFrameRenderListener(frameRenderListener);
        }
    }

    public final DefinedLuaListener b() {
        return new b();
    }

    public void cancelDownloadCase(String str) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.cancelCaseDownload(str);
        }
    }

    public void changeCase(DuMixSource duMixSource) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.loadCase(duMixSource.getResFilePath(), duMixSource.getArKey());
        }
    }

    public void changeCloudArState(int i8) {
    }

    public void checkCaseUpdate(String str, ArCaseDownloadListener arCaseDownloadListener) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.checkCaseUpdate(str, new g(this, arCaseDownloadListener));
        }
    }

    public void closeVolume() {
        boolean isStreamMute;
        Context context;
        if (this.f1438g == null && (context = this.f1432a) != null) {
            this.f1438g = (AudioManager) context.getSystemService("audio");
        }
        AudioManager audioManager = this.f1438g;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                isStreamMute = audioManager.isStreamMute(3);
                this.f1439h = isStreamMute;
            }
            if (this.f1439h) {
                return;
            }
            this.f1438g.adjustStreamVolume(3, -100, 0);
        }
    }

    public void createSession(String str, boolean z7) {
        Log.i("ARController", "createSession");
    }

    public void deleteResourceByArKey(String str, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("ar key is null!");
        }
        String c8 = com.baidu.ar.f.c(this.f1432a, str);
        if (!z7) {
            j4.a(new File(c8), false);
            return;
        }
        ArrayList<File> i8 = j4.i(new File(c8));
        String b8 = b(str);
        for (File file : i8) {
            if (!file.getAbsolutePath().equals(b8)) {
                j4.d(file);
            }
        }
    }

    public void downloadCase(String str, ArCaseDownloadListener arCaseDownloadListener) {
        if (this.f1437f == null) {
            this.f1437f = MapDuMix.getInstance(this.f1432a, this.f1441j);
        }
        this.f1437f.downloadCase(str, new f(arCaseDownloadListener));
    }

    public IARRenderer getARRenderer() {
        return this.f1437f.getARRenderer();
    }

    public DuMixTarget getDuMixTarget() {
        return this.f1434c;
    }

    public MapDuMix getMapDuMix() {
        return this.f1437f;
    }

    public RequestController getRequestController() {
        return this.f1440i;
    }

    public String getResourcePathByArKey(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("ar key is null!");
        }
        return com.baidu.ar.f.b(this.f1432a, str).substring(0, r3.length() - 3);
    }

    public void loadLocalCase(String str, int i8) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.loadCase(str, "");
        }
    }

    public void onAppear() {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.resumeScene();
        }
    }

    public void onCameraPreviewFrame(byte[] bArr, int i8, int i9) {
        DuMixSource duMixSource;
        h.a("ARController", "onCameraPreviewFrame width * height = " + i8 + " * " + i9);
        if (this.f1437f == null || (duMixSource = this.f1433b) == null || duMixSource.getBusinessType() != BusinessType.NPC) {
            return;
        }
        this.f1437f.render(System.currentTimeMillis());
    }

    @Override // com.baidu.ar.baidumap.MapDuMix.d
    public void onCaseQueryResult(IARCaseInfo iARCaseInfo) {
        if (this.f1435d != null) {
            ARResource aRResource = new ARResource();
            aRResource.setRefused(iARCaseInfo.isRefused());
            aRResource.setCodeDownloadUrl(iARCaseInfo.getResourceUrl());
            aRResource.setType(iARCaseInfo.getARType());
            aRResource.setFunctionMap(iARCaseInfo.getFeatures());
            this.f1435d.onCaseCreated(aRResource);
        }
    }

    public void onClickCameraButton() {
        h.a("ARController", "onClickCameraButton");
    }

    public void onCover() {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.pauseScene();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            return mapDuMix.onTouch(null, motionEvent);
        }
        return false;
    }

    public void openVolume() {
        Context context;
        if (this.f1438g == null && (context = this.f1432a) != null) {
            this.f1438g = (AudioManager) context.getSystemService("audio");
        }
        AudioManager audioManager = this.f1438g;
        if (audioManager != null) {
            audioManager.adjustStreamVolume(3, 100, 0);
        }
    }

    public void orientationChange(int i8) {
        h.c("ARController", "orientationChange orientation = " + i8);
    }

    public void outputStateMessage(int i8, Object obj) {
        ARCallback aRCallback = this.f1435d;
        if (aRCallback != null) {
            aRCallback.onStateChange(i8, obj);
        }
    }

    public void pause() {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.pause();
        }
    }

    public void reSetup(SurfaceTexture surfaceTexture, int i8, int i9) {
        h.a("ARController", "reSetup width * height = " + i8 + " * " + i9);
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.changeOutputObject(surfaceTexture, i8, i9);
        }
    }

    public void release() {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.release();
            this.f1437f = null;
        }
        p9 p9Var = this.f1436e;
        if (p9Var != null) {
            p9Var.b();
            this.f1436e = null;
        }
        this.f1438g = null;
    }

    public void resume() {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.resume();
        }
    }

    public void sendMessage2Lua(String str) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.sendLuaScript2Engine(str);
        }
    }

    public void setDownloadComplete() {
        this.f1437f.setDownloadComplete();
    }

    public void setEulerAngle(float f8, float f9, float f10) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.setEulerAngle(f8, f9, f10);
        }
    }

    public void setFieldOfView(float f8) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.setFieldOfView(f8);
        }
    }

    public void setLocationTransService(IARInnerLocationTransService iARInnerLocationTransService) {
    }

    public void setRecgArRetry() {
    }

    public void setRecordMark(Bitmap bitmap, Point point) {
        setRecordMark(bitmap, point, 1.0f);
    }

    public void setRotation(float f8, float f9, float f10) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.setRotation(f8, f9, f10);
        }
    }

    public void setup(DuMixSource duMixSource, DuMixTarget duMixTarget, ARCallback aRCallback) {
        h.a("ARController", "setup start!!!");
        this.f1433b = duMixSource;
        this.f1434c = duMixTarget;
        this.f1435d = aRCallback;
        DuMixInput duMixInput = new DuMixInput();
        duMixInput.setInputSurface(duMixSource.getCameraSource());
        duMixInput.setInputWidth(duMixSource.getSourceWidth());
        duMixInput.setInputHeight(duMixSource.getSourceHeight());
        duMixInput.setCameraInput(true);
        duMixInput.setFrontCamera(duMixSource.isFrontCamera());
        DuMixOutput duMixOutput = new DuMixOutput();
        if (duMixTarget.getSurfaceHolder() != null) {
            duMixOutput.setOutputSurface(duMixTarget.getSurfaceHolder());
        } else {
            duMixOutput.setOutputSurface(duMixTarget.getDrawTarget());
        }
        duMixOutput.setOutputWidth(duMixTarget.getTargetWidth());
        duMixOutput.setOutputHeight(duMixTarget.getTargetHeight());
        if (this.f1440i == null) {
            this.f1440i = new RequestController(this.f1432a, this, duMixSource);
        }
        this.f1437f.setCaseStateListener(a());
        this.f1437f.setDefinedLuaListener(b());
        this.f1437f.addLuaMsgListener(new a());
        this.f1437f.setup(duMixInput, duMixOutput, a(duMixSource));
        this.f1437f.setCaseQueryResourcecallback(this);
    }

    public void startRecord(String str, long j8, MovieRecorderCallback movieRecorderCallback) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.startRecord(str, j8, new e(this, movieRecorderCallback));
        }
    }

    public void stopRecord() {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.stopRecord();
        }
    }

    public void switchCamera(boolean z7) {
        h.a("ARController", "switchCamera front = " + z7);
    }

    public void switchCase(String str, int i8) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            mapDuMix.loadCase(str, ARType.valueOf(i8));
        }
    }

    public void takePicture(TakePictureCallback2 takePictureCallback2) {
    }

    public void vpsGetCaseList() {
    }

    public void vpsGpsExceptionToast(String str) {
    }

    public ARController(Context context, OBRConfig oBRConfig) {
        this.f1432a = context;
        MapDuMixParams mapDuMixParams = new MapDuMixParams();
        this.f1441j = mapDuMixParams;
        mapDuMixParams.setOBRConfig(oBRConfig);
        this.f1437f = MapDuMix.getInstance(context, this.f1441j);
    }

    public final CaseStateListener a() {
        return new d();
    }

    public boolean sendMessage2Lua(HashMap<String, Object> hashMap) {
        MapDuMix mapDuMix = this.f1437f;
        if (mapDuMix != null) {
            return mapDuMix.sendMsg2Lua(hashMap);
        }
        return false;
    }

    public void setRecordMark(Bitmap bitmap, Point point, float f8) {
        if (this.f1437f != null) {
            Watermark watermark = new Watermark(bitmap, point);
            watermark.setScale(f8);
            this.f1437f.setRecordWatermark(watermark);
        }
    }

    public void takePicture(String str, TakePictureCallback takePictureCallback) {
    }

    public final MapDuMixCallback a(DuMixSource duMixSource) {
        return new c(duMixSource);
    }

    public final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("ar key is null!");
        }
        long j8 = 0;
        String str2 = "";
        for (File file : j4.i(new File(com.baidu.ar.f.c(this.f1432a, str)))) {
            if (j8 < file.lastModified()) {
                j8 = file.lastModified();
                str2 = file.getAbsolutePath();
            }
        }
        return str2;
    }

    public static String a(String str) {
        return j4.a(com.baidu.ar.f.a(str));
    }

    public final void a(Map<String, Object> map) {
        int i8;
        if (map == null) {
            return;
        }
        if (map.containsKey("event_name")) {
            if ("vps_recreate_session".equals(map.get("event_name"))) {
                i8 = MsgField.MSG_SESSION_INVALID;
            } else if ("vps_hide_sdk_btn".equals(map.get("event_name"))) {
                i8 = MsgField.MSG_HIDE_UI_BTN;
            }
            outputStateMessage(i8, "");
        }
        if (map.containsKey("id") && ((Integer) map.get("id")).intValue() == 10301) {
            outputStateMessage(1006, "");
        }
    }
}
