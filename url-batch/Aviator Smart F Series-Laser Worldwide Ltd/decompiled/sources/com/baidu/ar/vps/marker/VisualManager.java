package com.baidu.ar.vps.marker;

import android.content.Context;
import android.opengl.Matrix;
import android.text.TextUtils;
import android.util.Log;
import cn.hutool.core.text.l;
import com.baidu.ar.ARType;
import com.baidu.ar.ab;
import com.baidu.ar.arplay.representation.Vector4f;
import com.baidu.ar.callback.ICallback;
import com.baidu.ar.callback.ICallbackWith;
import com.baidu.ar.de;
import com.baidu.ar.h;
import com.baidu.ar.h3;
import com.baidu.ar.k6;
import com.baidu.ar.marker.IMarkerDataProvider;
import com.baidu.ar.marker.IMarkerLocationTimeCallBack;
import com.baidu.ar.marker.IMarkerStateListener;
import com.baidu.ar.marker.IMarkerTracker;
import com.baidu.ar.marker.MarkerARAlgoController;
import com.baidu.ar.marker.MarkerARAlgoJniClient;
import com.baidu.ar.marker.MarkerErrorCode;
import com.baidu.ar.marker.OnTrackerSessionCallback;
import com.baidu.ar.marker.TrackerType;
import com.baidu.ar.marker.model.LocationMarkerData;
import com.baidu.ar.marker.model.TranslationPrior;
import com.baidu.ar.mb;
import com.baidu.ar.o;
import com.baidu.ar.pe;
import com.baidu.ar.q8;
import com.baidu.ar.remoteres.IDuMixResLoadTask;
import com.baidu.ar.s2;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.baidu.ar.t8;
import com.baidu.ar.u5;
import com.github.mikephil.charting.utils.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class VisualManager implements t8.f {
    private static final int CAMERA_FPS_COUNT = 30;
    private static final String MANAGER_CLASS_NAME = "com.baidu.ar.remoteres.DuMixResManager";
    private static final String QA_TAG = "QA_DEBUG";
    private static final String TAG = "VisualManager";
    private IMarkerLocationTimeCallBack iMarkerLocationTimeCallBack;
    private k6 iMarkerPositionCallback;
    private IMarkerStateListener iMarkerStateListener;
    private IMarkerTracker iMarkerTracker;
    private boolean mAlgoIsCreate;
    private String mBuildingId;
    private Context mContext;
    private u5 mDuMixResManager;
    private int mExtractFrameIndex;
    private float[] mGrative;
    private boolean mIsTrackingResult;
    private double[] mLocationLocGpsData;
    private long mLocationSdkCreateTime;
    private long mLocationSingleSuccessTime;
    private double[] mMagnet;
    private e mMarkerAlgoDataTrans;
    private t8 mMarkerRequestController;
    private int mNavigationVersion;
    private OnTrackerSessionCallback mOnTrackerSessionCallback;
    private boolean mPreTrackingResult;
    private boolean mPreTrackingStatisticsIntercept;
    private int mPreviewHeight;
    private int mPreviewWidth;
    private String mSession;
    private TrackerType mTrackerType;
    private de mVisualLocatingServiceLocatingListener;
    private MarkerARAlgoJniClient.a onAlgoSoLoadedComplteCallback;
    private int mGetLocationResultCode = 0;
    private float[] mLocationTransforms = null;
    private int qaFrameCnt = 1;
    private StringBuffer mQATimeStr = new StringBuffer();
    private int mQACreateSessionCnt = 0;
    private int mQALocateFrameCnt = 0;

    public class a implements ICallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TrackerType f3535a;

        public a(TrackerType trackerType) {
            this.f3535a = trackerType;
        }

        @Override // com.baidu.ar.callback.ICallback
        public void run() {
            VisualManager.this.createSession(this.f3535a);
        }
    }

    public class b implements ICallbackWith<IDuMixResLoadTask> {
        public b() {
        }

        @Override // com.baidu.ar.callback.ICallbackWith
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void run(IDuMixResLoadTask iDuMixResLoadTask) {
            Log.e(VisualManager.TAG, "ErrorCallback:" + iDuMixResLoadTask.getError());
            if (VisualManager.this.iMarkerStateListener != null) {
                VisualManager.this.iMarkerStateListener.onError(MarkerErrorCode.ERROR_DOWNLOAD_SO, "download so error!!!");
            }
        }
    }

    public class c implements t8.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TrackerType f3538a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f3539b;

        public c(TrackerType trackerType, long j8) {
            this.f3538a = trackerType;
            this.f3539b = j8;
        }

        @Override // com.baidu.ar.t8.e
        public void a(boolean z7, String str, String str2, float[] fArr, String str3) {
            if (z7 && !TextUtils.isEmpty(str2)) {
                VisualManager.this.mSession = str2;
                pe.b();
                Log.d(VisualManager.QA_TAG, "start server session successfully at " + System.currentTimeMillis());
                if (VisualManager.this.iMarkerTracker == null) {
                    VisualManager visualManager = VisualManager.this;
                    visualManager.iMarkerTracker = new MarkerARAlgoController(visualManager.mPreviewWidth, VisualManager.this.mPreviewHeight, fArr, str3, 30, VisualManager.this.mContext.getFilesDir().getAbsolutePath());
                    VisualManager visualManager2 = VisualManager.this;
                    visualManager2.onAlgoSoLoadedComplteCallback = visualManager2.createSoLoadedCallback(this.f3538a);
                }
                VisualManager.this.iMarkerTracker.loadAlgoSo(VisualManager.this.onAlgoSoLoadedComplteCallback);
                if (VisualManager.this.mMarkerAlgoDataTrans == null) {
                    VisualManager visualManager3 = VisualManager.this;
                    visualManager3.mMarkerAlgoDataTrans = visualManager3.new e(visualManager3);
                }
                VisualManager.this.iMarkerTracker.setDataProvider(VisualManager.this.mMarkerAlgoDataTrans);
            }
            if (VisualManager.this.iMarkerPositionCallback != null && !z7) {
                VisualManager.this.iMarkerPositionCallback.onCreateSessionFail();
            }
            if (VisualManager.this.iMarkerStateListener != null) {
                VisualManager.this.iMarkerStateListener.onSessionCreated(z7, str);
                VisualManager.this.mQATimeStr.append("createsession " + VisualManager.this.mQACreateSessionCnt + " start " + this.f3539b);
                VisualManager.this.mQATimeStr.append("\n");
                StringBuffer stringBuffer = VisualManager.this.mQATimeStr;
                StringBuilder sb = new StringBuilder();
                sb.append("createsession ");
                sb.append(VisualManager.this.mQACreateSessionCnt);
                sb.append(l.SPACE);
                sb.append(z7 ? FirebaseAnalytics.Param.SUCCESS : "failed");
                sb.append(l.SPACE);
                sb.append(System.currentTimeMillis());
                stringBuffer.append(sb.toString());
                VisualManager.this.mQATimeStr.append("\n");
                Log.d(VisualManager.QA_TAG, "start client session successfully at " + System.currentTimeMillis());
            }
        }
    }

    public class d implements MarkerARAlgoJniClient.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TrackerType f3541a;

        public d(TrackerType trackerType) {
            this.f3541a = trackerType;
        }

        @Override // com.baidu.ar.marker.MarkerARAlgoJniClient.a
        public void a() {
            VisualManager.this.initMarkerByTrackerType(this.f3541a);
        }

        @Override // com.baidu.ar.marker.MarkerARAlgoJniClient.a
        public void b() {
            if (VisualManager.this.iMarkerPositionCallback != null) {
                VisualManager.this.iMarkerPositionCallback.onCreateVpasAlgoFail();
            }
        }
    }

    public class e implements IMarkerDataProvider {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<VisualManager> f3543a;

        public e(VisualManager visualManager) {
            this.f3543a = new WeakReference<>(visualManager);
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public float[] getGPS() {
            return new float[]{(float) VisualManager.this.mLocationLocGpsData[0], (float) VisualManager.this.mLocationLocGpsData[1], 0.0f};
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public float[] getGravityDirection() {
            return this.f3543a.get().getGrative();
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public String getSessionId() {
            return this.f3543a.get().getSession();
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public String getUserId() {
            String a8 = q8.a();
            if (TextUtils.isEmpty(a8)) {
                return new h3(VisualManager.this.mContext).a().toString();
            }
            q8.a(a8);
            return a8;
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public String getVersion() {
            return String.valueOf(o.b());
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public void queryFrameResult(int i8, String str) {
            if (VisualManager.this.iMarkerStateListener != null) {
                VisualManager.this.iMarkerStateListener.onError(i8, str);
            }
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public void setLocationData(boolean z7, Object obj) {
            if (VisualManager.this.iMarkerPositionCallback != null && z7) {
                VisualManager.this.iMarkerPositionCallback.onVpasLocationSuccess();
            }
            if (!VisualManager.this.mIsTrackingResult) {
                VisualManager.this.mQATimeStr.append("positionFromJNI " + VisualManager.this.mQALocateFrameCnt + l.SPACE + z7 + l.SPACE + System.currentTimeMillis());
                VisualManager.this.mQATimeStr.append("\n");
            }
            if (this.f3543a.get() != null && !VisualManager.this.mIsTrackingResult && z7) {
                List<LocationMarkerData> list = (List) obj;
                if (VisualManager.this.mVisualLocatingServiceLocatingListener != null) {
                    VisualManager.this.mVisualLocatingServiceLocatingListener.a(z7, VisualManager.this.mSession, list);
                }
                this.f3543a.get().setLocationData(z7, list);
                HashMap hashMap = new HashMap();
                hashMap.put(StatisticConstants.VPS_SERVICE_TYPE, String.valueOf(VisualManager.this.mNavigationVersion));
                hashMap.put("building_id", VisualManager.this.mBuildingId);
                hashMap.put(StatisticConstants.VPS_SUCCESS_NUM, String.valueOf(list.size()));
                StatisticApi.onEvent(StatisticConstants.VPS_INDOOR_SUCCESS_RESULT, hashMap);
                pe.d();
                h.b(VisualManager.TAG, "pre positioning success");
                if (VisualManager.this.iMarkerLocationTimeCallBack != null) {
                    VisualManager.this.iMarkerLocationTimeCallBack.onQaRecordTimeInfo(VisualManager.this.mQATimeStr);
                }
                VisualManager.this.mQATimeStr.setLength(0);
            }
            if (VisualManager.this.mIsTrackingResult || !z7) {
                return;
            }
            VisualManager.this.mIsTrackingResult = true;
            VisualManager.this.mPreTrackingResult = true;
            long currentTimeMillis = System.currentTimeMillis();
            VisualManager.this.mLocationSingleSuccessTime = currentTimeMillis;
            long abs = Math.abs(currentTimeMillis - VisualManager.this.mLocationSdkCreateTime);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(StatisticConstants.VPS_SERVICE_TYPE, String.valueOf(VisualManager.this.mNavigationVersion));
            double d8 = abs / 1000.0d;
            hashMap2.put(StatisticConstants.VPS_GET_LOC_DURATION, String.valueOf(d8));
            hashMap2.put(StatisticConstants.VPS_SESSION_ID, String.valueOf(VisualManager.this.mSession));
            hashMap2.put("building_id", VisualManager.this.mBuildingId);
            StatisticApi.onEvent(StatisticConstants.VPS_INDOOR_GET_LOC_DURATION, hashMap2);
            h.b(VisualManager.TAG, "pre positioning duration：" + d8);
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public void setLocationPoints(int i8, double[] dArr) {
            VisualManager.this.mGetLocationResultCode = i8;
            if (VisualManager.this.iMarkerPositionCallback != null) {
                VisualManager.this.iMarkerPositionCallback.onVpasTrackingState(i8);
            }
            if (VisualManager.this.mIsTrackingResult) {
                if (VisualManager.this.iMarkerStateListener != null) {
                    VisualManager.this.iMarkerStateListener.onCoordinateResult(i8, dArr);
                }
            } else if (VisualManager.this.extractCoordinate() && i8 == -86) {
                VisualManager.this.mLocationSdkCreateTime = System.currentTimeMillis();
                if (VisualManager.this.iMarkerTracker != null) {
                    VisualManager.this.iMarkerTracker.onTrackReset();
                }
            } else if (!VisualManager.this.mPreTrackingStatisticsIntercept) {
                h.b(VisualManager.TAG, "pre positioning");
                VisualManager.this.mPreTrackingStatisticsIntercept = true;
                VisualManager.this.mLocationSdkCreateTime = System.currentTimeMillis();
            }
            if (dArr == null) {
                return;
            }
            if (i8 == 0 && VisualManager.this.mVisualLocatingServiceLocatingListener != null) {
                s2 s2Var = new s2();
                s2Var.f3191a = (float) dArr[12];
                s2Var.f3192b = (float) dArr[13];
                VisualManager.this.mVisualLocatingServiceLocatingListener.a(VisualManager.this.mSession, s2Var);
            }
            float f8 = (float) dArr[9];
            float f9 = (float) dArr[10];
            float f10 = (float) dArr[11];
            float[] fArr = {(float) dArr[0], (float) dArr[1], (float) dArr[2], 0.0f, (float) dArr[3], (float) dArr[4], (float) dArr[5], 0.0f, (float) dArr[6], (float) dArr[7], (float) dArr[8], 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
            float[] fArr2 = new float[16];
            System.arraycopy(fArr, 0, fArr2, 0, 16);
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 0.0f, 1.0f);
            float[] fArr4 = new float[16];
            Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr3, 0);
            float[] fArr5 = new float[16];
            Matrix.setIdentityM(fArr5, 0);
            Matrix.scaleM(fArr5, 0, -1.0f, 1.0f, 1.0f);
            float[] fArr6 = new float[16];
            Matrix.multiplyMM(fArr6, 0, fArr4, 0, fArr5, 0);
            float[] fArr7 = new float[16];
            Matrix.setIdentityM(fArr7, 0);
            Matrix.scaleM(fArr7, 0, 1.0f, 1.0f, -1.0f);
            float[] fArr8 = new float[16];
            Matrix.multiplyMM(fArr8, 0, fArr6, 0, fArr7, 0);
            float[] fArr9 = {fArr8[0], fArr8[1], fArr8[2], 0.0f, fArr8[4], fArr8[5], fArr8[6], 0.0f, fArr8[8], fArr8[9], fArr8[10], 0.0f, f8, f9, f10, 1.0f};
            if (VisualManager.this.mVisualLocatingServiceLocatingListener != null) {
                VisualManager.this.mVisualLocatingServiceLocatingListener.a(VisualManager.this.mSession, VisualManager.this.getCompass(fArr2));
                VisualManager.this.mVisualLocatingServiceLocatingListener.c(fArr9);
                h.b("invertFloats", "" + Arrays.toString(fArr9));
            }
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public void setLocationTransforms(float[] fArr) {
            this.f3543a.get().setLocationTransforms(fArr);
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public void setVpasState(int i8, int i9, float f8) {
            if (VisualManager.this.iMarkerPositionCallback != null) {
                VisualManager.this.iMarkerPositionCallback.onVpasAlgoStatePrint(i8, i9, f8);
            }
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public void setVpsLocation(float f8, float f9) {
        }

        @Override // com.baidu.ar.marker.IMarkerDataProvider
        public void transDataFromJNI(byte[] bArr) {
            if (VisualManager.this.iMarkerPositionCallback != null) {
                VisualManager.this.iMarkerPositionCallback.onVpasSendFrame();
            }
            Log.d(VisualManager.QA_TAG, "start send frame " + VisualManager.this.qaFrameCnt + " to server");
            if (this.f3543a.get() == null || this.f3543a.get().mMarkerRequestController == null) {
                return;
            }
            if (VisualManager.this.mIsTrackingResult) {
                this.f3543a.get().mMarkerRequestController.b(bArr, this.f3543a.get());
                return;
            }
            VisualManager.access$1808(VisualManager.this);
            VisualManager.this.mQATimeStr.append("positionToServer " + VisualManager.this.mQALocateFrameCnt + " start " + System.currentTimeMillis());
            VisualManager.this.mQATimeStr.append("\n");
            this.f3543a.get().mMarkerRequestController.a(bArr, this.f3543a.get());
        }
    }

    public VisualManager(Context context, int i8, int i9, int i10) {
        this.mContext = context;
        this.mNavigationVersion = i10;
        this.mPreviewWidth = i8;
        this.mPreviewHeight = i9;
    }

    public static /* synthetic */ int access$1808(VisualManager visualManager) {
        int i8 = visualManager.mQALocateFrameCnt;
        visualManager.mQALocateFrameCnt = i8 + 1;
        return i8;
    }

    private void beMiddleEndTime() {
        if (this.mLocationSingleSuccessTime > 0) {
            long abs = Math.abs(System.currentTimeMillis() - this.mLocationSingleSuccessTime);
            HashMap hashMap = new HashMap();
            hashMap.put(StatisticConstants.VPS_SERVICE_TYPE, String.valueOf(this.mNavigationVersion));
            double d8 = abs / 1000.0d;
            hashMap.put(StatisticConstants.VPS_NAVIGATE_DURATION, String.valueOf(d8));
            hashMap.put(StatisticConstants.VPS_SESSION_ID, String.valueOf(this.mSession));
            hashMap.put("building_id", this.mBuildingId);
            StatisticApi.onEvent(StatisticConstants.VPS_INDOOR_NAVIGATE_DURATION, hashMap);
            this.mLocationSingleSuccessTime = 0L;
            h.b(TAG, "pre positioning ->tracking end：" + d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MarkerARAlgoJniClient.a createSoLoadedCallback(TrackerType trackerType) {
        return new d(trackerType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean extractCoordinate() {
        int i8 = this.mExtractFrameIndex + 1;
        this.mExtractFrameIndex = i8;
        if (i8 != 30) {
            return false;
        }
        this.mExtractFrameIndex = 0;
        return true;
    }

    private void fromBeginToEndTime() {
        if (this.mLocationSdkCreateTime <= 0 || !this.mPreTrackingResult) {
            return;
        }
        long abs = Math.abs(System.currentTimeMillis() - this.mLocationSdkCreateTime);
        HashMap hashMap = new HashMap();
        hashMap.put(StatisticConstants.VPS_SERVICE_TYPE, String.valueOf(this.mNavigationVersion));
        double d8 = abs / 1000.0d;
        hashMap.put(StatisticConstants.VPS_SUB_INDOOR_SERVICE_DURATION, String.valueOf(d8));
        hashMap.put(StatisticConstants.VPS_SESSION_ID, String.valueOf(this.mSession));
        hashMap.put("building_id", this.mBuildingId);
        StatisticApi.onEvent(StatisticConstants.VPS_INDOOR_SERVICE_DURATION, hashMap);
        h.b(TAG, "positioning end：" + d8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double getCompass(float[] fArr) {
        float[] locationTransforms;
        if (getLocationTransforms() == null || (locationTransforms = getLocationTransforms()) == null) {
            return i.DOUBLE_EPSILON;
        }
        float[] fArr2 = {locationTransforms[0], locationTransforms[1], locationTransforms[2], 0.0f, locationTransforms[3], locationTransforms[4], locationTransforms[5], 0.0f, locationTransforms[6], locationTransforms[7], locationTransforms[8], 0.0f, locationTransforms[9], locationTransforms[10], locationTransforms[11], 1.0f};
        Vector4f vector4f = new Vector4f(110.0f, 40.0f, 0.0f, 1.0f);
        Vector4f vector4f2 = new Vector4f(110.0f, 41.0f, 0.0f, 1.0f);
        Matrix.multiplyMV(new float[4], 0, fArr2, 0, vector4f.toArray(), 0);
        Matrix.multiplyMV(new float[4], 0, fArr2, 0, vector4f2.toArray(), 0);
        double a8 = i.DOUBLE_EPSILON - (mb.a(r0[1] - r9[1], r0[0] - r9[0]) - 180.0d);
        Matrix.multiplyMV(new float[4], 0, fArr, 0, new Vector4f(0.0f, -1.0f, 0.0f, 1.0f).toArray(), 0);
        double a9 = (mb.a(r7[0], r7[1]) - 180.0d) + a8;
        return a9 < i.DOUBLE_EPSILON ? a9 + 360.0d : a9 > 360.0d ? a9 - 360.0d : a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float[] getGrative() {
        return this.mGrative;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getSession() {
        return this.mSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationData(boolean z7, List<LocationMarkerData> list) {
        OnTrackerSessionCallback onTrackerSessionCallback;
        IMarkerStateListener iMarkerStateListener = this.iMarkerStateListener;
        if (iMarkerStateListener != null) {
            iMarkerStateListener.onLocationResult(z7, list);
        }
        if (z7 && list.size() == 1 && (onTrackerSessionCallback = this.mOnTrackerSessionCallback) != null) {
            onTrackerSessionCallback.onSessionCallback(list.get(0).session);
        }
        k6 k6Var = this.iMarkerPositionCallback;
        if (k6Var != null) {
            k6Var.onPositionSuccess(list.size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationTransforms(float[] fArr) {
        this.mLocationTransforms = fArr;
        float[] fArr2 = {fArr[0], fArr[1], fArr[2], 0.0f, fArr[3], fArr[4], fArr[5], 0.0f, fArr[6], fArr[7], fArr[8], 0.0f, fArr[9], fArr[10], fArr[11], 1.0f};
        de deVar = this.mVisualLocatingServiceLocatingListener;
        if (deVar != null) {
            deVar.a(fArr2);
        }
    }

    private void setSession(String str) {
        this.mSession = str;
    }

    public void algoClose() {
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker != null) {
            iMarkerTracker.onTrackPause();
        }
    }

    public boolean algoIsReady() {
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker == null) {
            return false;
        }
        return iMarkerTracker.getAlgoState();
    }

    public void algoOpen() {
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker != null) {
            iMarkerTracker.onTrackResume();
        }
    }

    public void choiceOneCoordinate(LocationMarkerData locationMarkerData) {
        if (this.iMarkerTracker == null || locationMarkerData == null) {
            return;
        }
        OnTrackerSessionCallback onTrackerSessionCallback = this.mOnTrackerSessionCallback;
        if (onTrackerSessionCallback != null) {
            onTrackerSessionCallback.onSessionCallback(locationMarkerData.session);
        }
        this.iMarkerTracker.chooseMap(locationMarkerData.position);
    }

    public void createSession(TrackerType trackerType) {
        pe.a();
        this.mQACreateSessionCnt++;
        if (this.mMarkerRequestController == null) {
            this.mMarkerRequestController = new t8();
        }
        long currentTimeMillis = System.currentTimeMillis();
        Log.d(QA_TAG, "create session at " + currentTimeMillis);
        this.mMarkerRequestController.a(this.mLocationLocGpsData, this.mBuildingId, this.mPreviewWidth, this.mPreviewHeight, new c(trackerType, currentTimeMillis));
    }

    public float[] getLocationTransforms() {
        return this.mLocationTransforms;
    }

    public void initMarkerByTrackerType(TrackerType trackerType) {
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker == null) {
            return;
        }
        try {
            this.mTrackerType = trackerType;
            boolean z7 = iMarkerTracker.init(trackerType) == 0;
            this.mAlgoIsCreate = z7;
            if (z7) {
                pe.c();
            }
            k6 k6Var = this.iMarkerPositionCallback;
            if (k6Var == null || this.mAlgoIsCreate) {
                return;
            }
            k6Var.onCreateVpasAlgoFail();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void loadMarkerSO(TrackerType trackerType) {
        if (this.mDuMixResManager == null) {
            this.mDuMixResManager = (u5) ab.a(MANAGER_CLASS_NAME, new Class[]{Context.class}, new Object[]{this.mContext});
        }
        u5 u5Var = this.mDuMixResManager;
        if (u5Var == null) {
            createSession(trackerType);
        } else {
            u5Var.downloadARRes(ARType.MARKER, new a(trackerType));
            this.mDuMixResManager.setErrorCallback(new b());
        }
    }

    public void onPause() {
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker != null) {
            iMarkerTracker.onTrackPause();
        }
        beMiddleEndTime();
    }

    public void onResume() {
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker != null) {
            iMarkerTracker.onTrackResume();
        }
    }

    @Override // com.baidu.ar.t8.f
    public void onUploadProtobufResult(byte[] bArr, boolean z7) {
        Log.d(QA_TAG, "get server frame " + this.qaFrameCnt + " to server");
        this.qaFrameCnt = this.qaFrameCnt + 1;
        if (this.mGetLocationResultCode == -86) {
            Log.e(TAG, "current result is invalid");
            return;
        }
        if (bArr == null || bArr.length <= 0) {
            IMarkerStateListener iMarkerStateListener = this.iMarkerStateListener;
            if (iMarkerStateListener != null) {
                iMarkerStateListener.onError(MarkerErrorCode.ERROR_UPLOAD_PROTOBUF, "Server Inner Algo Error !!!");
                return;
            }
            return;
        }
        boolean z8 = this.mIsTrackingResult;
        if (!z8 && !z8) {
            this.mQATimeStr.append("positionFromServer " + this.mQALocateFrameCnt + " end " + System.currentTimeMillis());
            this.mQATimeStr.append("\n");
        }
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker != null) {
            if (!z7 && !this.mPreTrackingResult) {
                iMarkerTracker.transProtoDataJNIFromServer(null);
                return;
            }
            if (!this.mIsTrackingResult) {
                this.mQATimeStr.append("positionToJNI " + this.mQALocateFrameCnt + " start " + System.currentTimeMillis());
                this.mQATimeStr.append("\n");
            }
            this.iMarkerTracker.transProtoDataJNIFromServer(bArr);
        }
    }

    public void release() {
        beMiddleEndTime();
        fromBeginToEndTime();
        this.mMarkerAlgoDataTrans = null;
        if (this.mIsTrackingResult) {
            this.mPreTrackingStatisticsIntercept = false;
        }
        this.mIsTrackingResult = false;
        this.mPreTrackingResult = false;
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker != null) {
            iMarkerTracker.onTrackRelease();
            this.iMarkerTracker = null;
        }
        t8 t8Var = this.mMarkerRequestController;
        if (t8Var != null) {
            t8Var.a();
            this.mMarkerRequestController = null;
        }
    }

    public void releaseAlgo() {
        release();
    }

    public void resetAlgo() {
        if (this.mIsTrackingResult) {
            this.mPreTrackingStatisticsIntercept = false;
        }
        this.mIsTrackingResult = false;
        this.mPreTrackingResult = false;
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker != null) {
            iMarkerTracker.onTrackReset();
        }
    }

    public void setBaiduMapCuid(String str) {
        q8.a(str);
    }

    public void setCameraParams(float[] fArr, float[] fArr2, int i8, double[] dArr) {
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker != null) {
            iMarkerTracker.setCameraParams(fArr, fArr2, i8, dArr);
        }
    }

    public void setMapIndoorParams(double[] dArr, String str) {
        if (dArr != null) {
            this.mLocationLocGpsData = new double[]{dArr[0], dArr[1]};
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mBuildingId = str;
    }

    public void setMarkerLocationTimeCallBack(IMarkerLocationTimeCallBack iMarkerLocationTimeCallBack) {
        this.iMarkerLocationTimeCallBack = iMarkerLocationTimeCallBack;
    }

    public void setMarkerStateListener(IMarkerStateListener iMarkerStateListener) {
        this.iMarkerStateListener = iMarkerStateListener;
    }

    public void setTrackerSessionCallback(OnTrackerSessionCallback onTrackerSessionCallback) {
        this.mOnTrackerSessionCallback = onTrackerSessionCallback;
    }

    public void setVisualLocatingServiceLocatingListener(de deVar) {
        this.mVisualLocatingServiceLocatingListener = deVar;
    }

    public void setYUVFile(byte[] bArr, int i8, int i9, float[] fArr, float[] fArr2) {
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker == null || fArr == null || !this.mAlgoIsCreate || bArr == null || i8 < 0 || bArr.length <= 0) {
            return;
        }
        iMarkerTracker.onTrack(bArr, i8, i9, fArr, fArr2);
    }

    public void setiMarkerPositionCallback(k6 k6Var) {
        this.iMarkerPositionCallback = k6Var;
    }

    public void updateGrative(float[] fArr) {
        this.mGrative = fArr;
    }

    public void updateTranslationPrior(TranslationPrior translationPrior) {
        IMarkerTracker iMarkerTracker = this.iMarkerTracker;
        if (iMarkerTracker != null) {
            iMarkerTracker.updateTranslationPrior(translationPrior);
        }
    }
}
