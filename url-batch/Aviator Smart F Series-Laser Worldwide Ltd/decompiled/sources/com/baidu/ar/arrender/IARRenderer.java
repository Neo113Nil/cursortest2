package com.baidu.ar.arrender;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import com.baidu.ar.DuMixOutput;
import com.baidu.ar.arplay.core.engine.ARPDataInteraction;
import com.baidu.ar.arplay.core.renderer.OnNeedCacheFrameListener;
import com.baidu.ar.arplay.core.renderer.TakePictureCallback;
import com.baidu.ar.arplay.representation.Matrixf4x4;
import com.baidu.ar.bb;
import com.baidu.ar.db;
import com.baidu.ar.j6;
import com.baidu.ar.k4;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public interface IARRenderer extends IRenderer {
    void addAlgoCache(int i8, boolean z7);

    @Override // com.baidu.ar.arrender.IRenderer
    /* synthetic */ void addFrameRenderListener(FrameRenderListener frameRenderListener);

    @Override // com.baidu.ar.arrender.IRenderer
    /* synthetic */ void addOutputSurface(DuMixOutput duMixOutput);

    void calibrationTouchAngle();

    void clearAlgoCache();

    void clearCaseLutFilter();

    void convertAlgo2ScreenPoint(PointF pointF, boolean z7);

    void enableSyncFaceLandmark(boolean z7);

    void enableSyncRender(boolean z7);

    String getCurrentCasePath();

    Matrixf4x4 getInitialTransform();

    j6 getLuaApplicationState();

    void getSnapShot(TakePictureCallback takePictureCallback);

    void initWorldAxis();

    boolean isDriverdByARPVersion();

    float[] location2ScreenPoint(float[] fArr);

    void pauseScene();

    void removeAlgoCache(int i8);

    @Override // com.baidu.ar.arrender.IRenderer
    /* synthetic */ void removeFrameRenderListener(FrameRenderListener frameRenderListener);

    @Override // com.baidu.ar.arrender.IRenderer
    /* synthetic */ void removeOutputSurface(DuMixOutput duMixOutput);

    void render(long j8);

    void resumeScene();

    void sceneRelocate();

    void sceneRotateToCamera();

    void sceneWorldPositionToOrigin();

    boolean set3DModelVisible(boolean z7);

    void setAlgoHandleData(long j8, String str);

    void setAvatarGestureConfig();

    void setBlendShape(HashMap<String, Double> hashMap);

    void setCacheFrameListener(OnNeedCacheFrameListener onNeedCacheFrameListener);

    void setEnabledAbilities(List<String> list);

    void setEnvironmentDataPipKV(String str, Object obj);

    void setFieldOfView(float f8);

    void setGLWebViewUseable(Context context, ViewGroup viewGroup);

    void setImuType(com.baidu.ar.imu.a aVar);

    void setInteractionCallback(ARPDataInteraction.b bVar);

    void setNativeWebViewUseable(Context context, ViewGroup viewGroup);

    void setOffScreenGuideWork(boolean z7);

    void setRenderBlendInput(boolean z7);

    void setRootNodeEulerAngle(float f8, float f9, float f10);

    void setRootNodeRotation(float f8, float f9, float f10);

    void setSkeletonData(HashMap<String, List<Double>> hashMap);

    void setSyncFrameTimestamp(long j8);

    void setTouchEnable(boolean z7);

    void updateDeviceOrientation();

    String updateFilterCase(String str);

    void updateFilterData(c cVar);

    void updateFilterNodeData(k4 k4Var);

    void updateRenderCameraData(bb bbVar);

    void updateRenderNodeData(db dbVar, boolean z7);

    void updateTransforms(Matrixf4x4 matrixf4x4);
}
