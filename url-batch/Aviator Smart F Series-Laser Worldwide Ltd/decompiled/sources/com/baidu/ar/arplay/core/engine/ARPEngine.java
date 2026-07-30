package com.baidu.ar.arplay.core.engine;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.baidu.ar.arplay.core.engine.ARPContent;
import com.baidu.ar.arplay.core.engine.ARPDataInteraction;
import com.baidu.ar.arplay.core.engine.engine3d.AbstractARPEngine3D;
import com.baidu.ar.arplay.core.engine.engine3d.IARPEngine3D;
import com.baidu.ar.arplay.core.engine.engine3d.IARPScene;
import com.baidu.ar.arplay.core.engine3d.ARPEngine3D;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.arplay.core.renderer.ARPFilter;
import com.baidu.ar.arplay.core.renderer.ARPRenderer;
import com.baidu.ar.arplay.core.renderer.IARPRenderer;
import com.baidu.ar.arplay.util.LogUtil;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ARPEngine {
    private static final String ENGINE_3D_CLASS_NAME = "com.baidu.ar.arplay.core.engine3d.ARPEngine3D";
    private static final String LOWEST_VERSION_KEY = "compatible_version";
    private static final String TAG = "ARPEngine";
    private static ARPEngine self;
    private ARPDataInteraction mARPDataInteraction;
    private AbstractARPEngine3D mARPEngine3D;
    private ARPEngineParams mARPEngineParams;
    private a mListener;
    public boolean mScenePausedByUser;
    private boolean mIsInitNative = false;
    private volatile boolean mIsEngineCreated = false;
    private boolean mIsPaused = false;
    private ARPContent mARPContent = new ARPContent();
    private ARPFilter mARPFilter = new ARPFilter();
    private ARPRenderer mARPRenderer = new ARPRenderer();

    public interface a {
        void a();
    }

    private ARPEngine() {
        ARPDataInteraction aRPDataInteraction = new ARPDataInteraction();
        this.mARPDataInteraction = aRPDataInteraction;
        this.mARPContent.registerCaseLoadListener(aRPDataInteraction);
        initEngine3DInstance();
    }

    private boolean createApp(int i8, int i9, int i10, int i11, float f8, String str) {
        LogUtil.b(TAG, "createApp [width*height]: [" + i8 + "*" + i9 + "]");
        boolean nativeCreateApp = nativeCreateApp(i8, i9, i10, i11, f8, str);
        this.mIsEngineCreated = true;
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            aRPContent.setEngineCreated(this.mIsEngineCreated);
        }
        return nativeCreateApp;
    }

    public static synchronized ARPEngine getInstance() {
        ARPEngine aRPEngine;
        synchronized (ARPEngine.class) {
            try {
                if (self == null) {
                    self = new ARPEngine();
                    LogUtil.b(TAG, "create instance : " + self);
                }
                aRPEngine = self;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aRPEngine;
    }

    private void initEngine3DInstance() {
        try {
            Object newInstance = ARPEngine3D.class.newInstance();
            if (newInstance instanceof IARPEngine3D) {
                this.mARPEngine3D = (AbstractARPEngine3D) newInstance;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            e8.printStackTrace();
        }
    }

    public static synchronized boolean isEngineCreated() {
        boolean z7;
        synchronized (ARPEngine.class) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("isEngineCreated : ");
                sb.append(self);
                sb.append(" ：");
                ARPEngine aRPEngine = self;
                z7 = false;
                sb.append(aRPEngine != null && aRPEngine.mIsEngineCreated);
                LogUtil.b(TAG, sb.toString());
                ARPEngine aRPEngine2 = self;
                if (aRPEngine2 != null) {
                    if (aRPEngine2.mIsEngineCreated) {
                        z7 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    private native boolean nativeSetup(Object obj, String str);

    public static synchronized void releaseInstance() {
        synchronized (ARPEngine.class) {
            try {
                ARPEngine aRPEngine = self;
                if (aRPEngine != null) {
                    aRPEngine.destroy();
                }
                LogUtil.b(TAG, "release instance : " + self);
                self = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addAlgoType(int[] iArr, int i8) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.addAlgoType(iArr, i8);
        }
    }

    public String adjustFilterWithCasePathParam(String str) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter == null) {
            return null;
        }
        aRPFilter.adjustFilterWithCasePathParam(str);
        return null;
    }

    public void adjustFilterWithFloatArrayParam(String str, String str2, float[] fArr, long j8) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.adjustFilterWithFloatArrayParam(str, str2, fArr, j8);
        }
    }

    public void adjustFilterWithFloatParam(String str, String str2, float f8, long j8) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.adjustFilterWithFloatParam(str, str2, f8, j8);
        }
    }

    public void adjustFilterWithIntParam(String str, String str2, int i8, long j8) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.adjustFilterWithIntParam(str, str2, i8, j8);
        }
    }

    public String adjustFilterWithJsonPathParam(String str) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            return aRPFilter.adjustFilterWithJsonPathParam(str);
        }
        return null;
    }

    public void adjustFilterWithStringParam(String str, String str2, String str3, long j8) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.adjustFilterWithStringParam(str, str2, str3, j8);
        }
    }

    public void clearARMemory() {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.clearARMemory();
        }
    }

    public void clearAlgoCache() {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.clearAlgoCache();
        }
    }

    public boolean createEngine(ARPEngineParams aRPEngineParams) {
        synchronized (this) {
            boolean z7 = false;
            try {
                if (aRPEngineParams == null) {
                    return false;
                }
                this.mARPEngineParams = aRPEngineParams;
                if (!this.mIsInitNative) {
                    z7 = nativeSetup(new WeakReference(this), "6.4.0");
                    this.mIsInitNative = true;
                }
                if (!this.mIsEngineCreated) {
                    z7 = createApp(this.mARPEngineParams.getInputWidth(), this.mARPEngineParams.getInputHeight(), this.mARPEngineParams.getOutputWidth(), this.mARPEngineParams.getOutputHeight(), this.mARPEngineParams.getDensity(), this.mARPEngineParams.getShaderDBPath());
                    ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
                    if (aRPDataInteraction != null) {
                        aRPDataInteraction.setup();
                    }
                }
                AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
                if (abstractARPEngine3D != null) {
                    abstractARPEngine3D.setIsActiveByARPlayVersionCase(isDriverdByARPVersion());
                }
                this.mARPContent.setIsFrontCamera(this.mARPEngineParams.isIsFrontCamera());
                return z7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void destroy() {
        LogUtil.b(TAG, "destroy");
        ARPRenderer aRPRenderer = this.mARPRenderer;
        if (aRPRenderer != null) {
            aRPRenderer.destroy();
        }
    }

    public synchronized void destroyEngine() {
        try {
            LogUtil.b(TAG, "destroyEngine");
            this.mIsEngineCreated = false;
            ARPFilter aRPFilter = this.mARPFilter;
            if (aRPFilter != null) {
                aRPFilter.destroy();
            }
            ARPContent aRPContent = this.mARPContent;
            if (aRPContent != null) {
                aRPContent.setEngineCreated(this.mIsEngineCreated);
                this.mARPContent.destroy();
            }
            AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
            if (abstractARPEngine3D != null) {
                abstractARPEngine3D.destroy();
            }
            nativeSetEngineBlendState(0);
            ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
            if (aRPDataInteraction != null) {
                aRPDataInteraction.destroy();
            }
            ARPMessage.getInstance().receiveMsgFromEngine(7, 0, null, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void destroyMockAlgoHandle(long j8) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.destroyMockAlgoHandle(j8);
        }
    }

    public void disableCaseLutTexture() {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.disableCaseLutTexture();
        }
    }

    public void disableFilterByAuthCode(int i8) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.disableFilterByAuthCode(i8);
        }
    }

    public IARPRenderer getARPRenderer() {
        return this.mARPRenderer;
    }

    public IARPScene getCurrentScene() {
        AbstractARPEngine3D abstractARPEngine3D;
        if (isEngineCanAccess() && (abstractARPEngine3D = this.mARPEngine3D) != null) {
            return abstractARPEngine3D.getCurrentScene();
        }
        return null;
    }

    public float[] getPreviewSize() {
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            return aRPContent.getPreviewSize();
        }
        return null;
    }

    public float[] getWindowSize() {
        ARPContent aRPContent = this.mARPContent;
        return aRPContent != null ? aRPContent.getWindowSize() : new float[0];
    }

    public void initDataStore(SharedPreferences sharedPreferences) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.initDataStore(sharedPreferences);
        }
    }

    public void initWorldAxis() {
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.initWorldAxis();
        }
    }

    public boolean isAppControllerInterrupt() {
        return nativeIsAppControllerInterrupt();
    }

    public boolean isDriverdByARPVersion() {
        String str;
        Object sharedEnvironmentValue = ARPScriptEnvironment.getInstance().getSharedEnvironmentValue("caseinfo");
        if (sharedEnvironmentValue != null && (sharedEnvironmentValue instanceof HashMap)) {
            HashMap hashMap = (HashMap) sharedEnvironmentValue;
            return (hashMap.get(LOWEST_VERSION_KEY) instanceof String) && (str = (String) hashMap.get(LOWEST_VERSION_KEY)) != "" && str.compareTo("2.0.0") >= 0;
        }
        return false;
    }

    public boolean isEngineCanAccess() {
        return this.mIsEngineCreated && this.mARPContent.isCaseCreated();
    }

    public boolean isPaused() {
        return this.mIsPaused;
    }

    public synchronized int loadCaseWithResPath(String str) {
        ARPRenderer aRPRenderer;
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent == null || (aRPRenderer = this.mARPRenderer) == null) {
            return -1;
        }
        return aRPContent.loadCaseWithResPath(str, aRPRenderer.getCameraPreviewWidth(), this.mARPRenderer.getCameraPreviewHeight());
    }

    public long mockFaceAlgoHandle(long j8, float[] fArr) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            return aRPDataInteraction.mockFaceAlgoHandle(j8, fArr);
        }
        return -1L;
    }

    public native boolean nativeCreateApp(int i8, int i9, int i10, int i11, float f8, String str);

    public native void nativeDestroyEngine();

    public native boolean nativeIsAppControllerInterrupt();

    public native void nativeOnPause();

    public native void nativeOnResume();

    public native void nativeSetConfig(String str, String str2);

    public native void nativeSetEngineBlendState(int i8);

    public native void nativeSetLocalDeviceGrade(int i8);

    public synchronized void onCaseLoadCompleted(Map map) {
        if (map == null) {
            return;
        }
        try {
            AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
            if (abstractARPEngine3D != null) {
                abstractARPEngine3D.setIsActiveByARPlayVersionCase(isDriverdByARPVersion());
            }
            ARPContent aRPContent = this.mARPContent;
            if (aRPContent != null && aRPContent.checkValid(ARPContent.c.OnCaseLoaded)) {
                ARPRenderer aRPRenderer = this.mARPRenderer;
                if (aRPRenderer != null) {
                    aRPRenderer.clearAllAsyncRenderTask();
                }
                this.mARPContent.onCaseLoadCompleted(map);
                a aVar = this.mListener;
                if (aVar != null) {
                    aVar.a();
                }
            }
            if (this.mIsPaused) {
                nativeOnPause();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void onCaseUnloadCompleted() {
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            aRPContent.onCaseUnloadCompleted();
        }
    }

    public void onGestureUpdate(int i8, long j8, int i9, float f8, float f9, float f10, float f11, int i10, float f12, float f13, float f14, float f15, int i11, float f16) {
        ARPDataInteraction aRPDataInteraction;
        if (isEngineCanAccess() && (aRPDataInteraction = this.mARPDataInteraction) != null) {
            aRPDataInteraction.onGestureUpdate(i8, j8, i9, f8, f9, f10, f11, i10, f12, f13, f14, f15, i11, f16);
        }
    }

    public void onGestureUpdateWithScaleFinish(int i8, long j8, int i9, float f8, float f9, float f10, float f11, int i10, float f12, float f13, float f14, float f15, int i11, float f16, boolean z7) {
        ARPDataInteraction aRPDataInteraction;
        if (isEngineCanAccess() && (aRPDataInteraction = this.mARPDataInteraction) != null) {
            aRPDataInteraction.onGestureUpdateWithScaleFinish(i8, j8, i9, f8, f9, f10, f11, i10, f12, f13, f14, f15, i11, f16, z7);
        }
    }

    public void onTouchUpdate(int i8, float f8, float f9, float f10, float f11, long j8, int i9, float f12) {
        ARPDataInteraction aRPDataInteraction;
        if (isEngineCanAccess() && (aRPDataInteraction = this.mARPDataInteraction) != null) {
            aRPDataInteraction.onTouchUpdate(i8, f8, f9, f10, f11, j8, i9, f12);
        }
    }

    public synchronized void pause() {
        try {
            this.mIsPaused = true;
            if (isEngineCanAccess()) {
                nativeOnPause();
            }
            ARPRenderer aRPRenderer = this.mARPRenderer;
            if (aRPRenderer != null) {
                aRPRenderer.pause();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void pauseScene() {
        try {
            this.mIsPaused = true;
            if (isEngineCanAccess()) {
                nativeOnPause();
            }
            this.mScenePausedByUser = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void removeAlgoType(int[] iArr) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.removeAlgoType(iArr);
        }
    }

    public synchronized void resume() {
        try {
            if (!this.mScenePausedByUser) {
                resumeScene();
            }
            ARPRenderer aRPRenderer = this.mARPRenderer;
            if (aRPRenderer != null) {
                aRPRenderer.resume();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void resumeScene() {
        try {
            this.mIsPaused = false;
            if (isEngineCanAccess()) {
                nativeOnResume();
            }
            this.mScenePausedByUser = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void sceneRotateToCamera() {
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.sceneRotateToCamera();
        }
    }

    public void sceneWorldPositionToOrigin() {
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.sceneWorldPositionToOrigin();
        }
    }

    public synchronized void setAlgoDataHandle(long j8) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.setAlgoDataHandle(j8);
        }
    }

    public void setAuthPic(Bitmap bitmap, float[] fArr) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.setAuthPic(bitmap, fArr);
        }
    }

    public void setAvatarGestureConfig() {
        HashMap hashMap = new HashMap();
        hashMap.put("gesture_scroll", "interaction_rotate");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("continuous_mapping", hashMap);
        ARPScriptEnvironment.getInstance().setSharedEnvironmentKV("interactioninfo", hashMap2);
    }

    public void setBlendShape(HashMap<String, Double> hashMap) {
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.setBlendShape(hashMap);
        }
    }

    public void setCompletedListener(a aVar) {
        this.mListener = aVar;
    }

    public void setConfig(String str, String str2) {
        LogUtil.b(TAG, "syncServerConfig :" + str2);
        nativeSetConfig(str, str2);
    }

    public void setContext(SoftReference<Context> softReference) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.setContext(softReference);
        }
    }

    public void setEngineBlendState(int i8) {
        nativeSetEngineBlendState(i8);
    }

    public void setFaceLandMarkFrameAcheMode(int i8) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.setFaceLandMarkFrameAcheMode(i8);
        }
    }

    public synchronized void setHtmlUpdateCallback(ARPDataInteraction.a aVar) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.setHtmlUpdateCallback(aVar);
        }
    }

    public void setInteraction(ARPDataInteraction.b bVar) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.setInteraction(bVar);
        }
    }

    public void setIsFrontCamera(boolean z7) {
        this.mARPContent.setIsFrontCamera(z7);
    }

    public void setLocalDeviceGrade(int i8) {
        LogUtil.b(TAG, "setLocalDeviceGrade :" + i8);
        nativeSetLocalDeviceGrade(i8);
    }

    public void setPreviewSize(int i8, int i9) {
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            aRPContent.setPreviewSize(i8, i9);
        }
    }

    public void setSkeletionData(HashMap<String, List<Double>> hashMap) {
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.setSkeletionData(hashMap);
        }
    }

    public synchronized void setVideoUpdateCallback(ARPDataInteraction.c cVar) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.setVideoUpdateCallback(cVar);
        }
    }

    public void setWatermark(String str, Bitmap bitmap, float[] fArr) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.setWatermark(str, bitmap, fArr);
        }
    }

    public void setWindowSize(int i8, int i9) {
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            aRPContent.setWindowSize(i8, i9);
        }
    }

    public synchronized void unloadCase() {
        try {
            ARPContent aRPContent = this.mARPContent;
            if (aRPContent != null && aRPContent.checkValid(ARPContent.c.UnloadCase)) {
                ARPRenderer aRPRenderer = this.mARPRenderer;
                if (aRPRenderer != null) {
                    aRPRenderer.clearAllAsyncRenderTask();
                }
                this.mARPContent.unloadCase();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void updateAlgoDataToNode(int i8, int i9, byte[] bArr) {
        ARPDataInteraction aRPDataInteraction;
        LogUtil.a(TAG, "updateAlgoDataToNode");
        if (isEngineCanAccess() && (aRPDataInteraction = this.mARPDataInteraction) != null) {
            aRPDataInteraction.updateAlgoDataToNode(i8, i9, bArr);
        }
    }

    public void updateNodeUniform(String str, HashMap<String, Object> hashMap) {
        AbstractARPEngine3D abstractARPEngine3D;
        if (!isEngineCanAccess() || isAppControllerInterrupt() || (abstractARPEngine3D = this.mARPEngine3D) == null) {
            return;
        }
        abstractARPEngine3D.updateNodeUniform(str, hashMap);
    }
}
