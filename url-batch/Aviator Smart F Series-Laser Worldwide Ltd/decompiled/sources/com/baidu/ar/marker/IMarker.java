package com.baidu.ar.marker;

import com.baidu.ar.arplay.representation.Vector3f;
import com.baidu.ar.k6;
import com.baidu.ar.marker.model.LocationMarkerData;
import com.baidu.ar.marker.model.Segments;
import com.baidu.ar.marker.model.TranslationPrior;
import com.baidu.ar.p8;
import java.util.List;

/* loaded from: classes.dex */
public interface IMarker {
    boolean bindingCoordinate();

    void choiceOneCoordinate(LocationMarkerData locationMarkerData);

    void clearNavigationRoute();

    void clearRoute();

    float[] convertLatLngFromPosition(float f8, float f9);

    float[] convertPositionFromLatlng(float[] fArr);

    void createSession();

    float[] getGeolocationByTransform();

    void hideFinalPoint();

    void hideNavigationContent();

    void initMarkerByTrackerType(TrackerType trackerType);

    float[] location2ScreenPoint(float[] fArr);

    void openDataMock();

    void openDataRecorde();

    void postARRoute(List<Vector3f> list);

    void postArrow(float f8, float f9, float f10, float f11, int i8);

    void postArrow(String str, int i8, double[] dArr, double[] dArr2, double[] dArr3, float f8, float f9);

    void postFinalArrow(String str, double[] dArr);

    void postLiftDown(double[] dArr, float f8);

    void postLiftUp(double[] dArr, float f8);

    void postNavigationRoute(List<Segments> list);

    void postRoute(List<double[]> list);

    void releaseMarker();

    void removeAllArrow();

    void removeArrowByArrowId(String str);

    void removeLiftDown();

    void removeLiftUp();

    void resetMarker();

    void resetNavigationController();

    void runAREngineWithNavigation(PositioningModuleAddListener positioningModuleAddListener);

    void runImuWithNavigation(PositioningModuleAddListener positioningModuleAddListener);

    void runPedometerWithNavigation(PositioningModuleAddListener positioningModuleAddListener);

    void runVpasWithNavigation(PositioningModuleAddListener positioningModuleAddListener);

    void setAvailableFrame(MarkerFrameInfo markerFrameInfo);

    void setAxisCallback(IMakerAxisCallback iMakerAxisCallback);

    void setCoordinateBoundListener(OnCoordinateBoundListener onCoordinateBoundListener);

    void setEulerAngleCallback(OnEulerAngleCallback onEulerAngleCallback);

    void setLocationTimeCallBack(IMarkerLocationTimeCallBack iMarkerLocationTimeCallBack);

    void setMarkerARSetupCallback(p8 p8Var);

    void setMarkerStateListener(IMarkerStateListener iMarkerStateListener);

    void setPositionCallback(k6 k6Var);

    void setTrackerSessionCallback(OnTrackerSessionCallback onTrackerSessionCallback);

    void showNavigationContent();

    void test();

    void updateHeading(float f8, float f9);

    void updateImuData(float[] fArr);

    void updateLocation(float[] fArr, int i8, boolean z7);

    void updateMeters(float f8);

    void updateMockAccelerometer(float f8, float f9, float f10);

    void updateTransformData(int i8, float[] fArr);

    void updateTranslationPrior(TranslationPrior translationPrior);
}
