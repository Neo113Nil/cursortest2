package com.baidu.ar;

import com.baidu.ar.arplay.representation.Vector3f;
import com.baidu.ar.marker.IMakerAxisCallback;
import com.baidu.ar.marker.IMarker;
import com.baidu.ar.marker.IMarkerLocationTimeCallBack;
import com.baidu.ar.marker.IMarkerStateListener;
import com.baidu.ar.marker.MarkerFrameInfo;
import com.baidu.ar.marker.OnCoordinateBoundListener;
import com.baidu.ar.marker.OnEulerAngleCallback;
import com.baidu.ar.marker.OnTrackerSessionCallback;
import com.baidu.ar.marker.PositioningModuleAddListener;
import com.baidu.ar.marker.TrackerType;
import com.baidu.ar.marker.model.LocationMarkerData;
import com.baidu.ar.marker.model.Segments;
import com.baidu.ar.marker.model.TranslationPrior;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class o8 extends d0 implements IMarker {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<IMarker> f2898a;

    /* renamed from: b, reason: collision with root package name */
    public IMarkerStateListener f2899b;

    /* renamed from: c, reason: collision with root package name */
    public OnTrackerSessionCallback f2900c;

    /* renamed from: d, reason: collision with root package name */
    public IMakerAxisCallback f2901d;

    /* renamed from: e, reason: collision with root package name */
    public IMarkerLocationTimeCallBack f2902e;

    /* renamed from: f, reason: collision with root package name */
    public OnEulerAngleCallback f2903f;

    /* renamed from: g, reason: collision with root package name */
    public PositioningModuleAddListener f2904g;

    /* renamed from: h, reason: collision with root package name */
    public p8 f2905h;

    /* renamed from: i, reason: collision with root package name */
    public k6 f2906i;

    /* renamed from: j, reason: collision with root package name */
    public OnCoordinateBoundListener f2907j;

    /* renamed from: k, reason: collision with root package name */
    public int f2908k;

    @Override // com.baidu.ar.d0
    public void a() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.clear();
    }

    @Override // com.baidu.ar.marker.IMarker
    public boolean bindingCoordinate() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        return this.f2898a.get().bindingCoordinate();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void choiceOneCoordinate(LocationMarkerData locationMarkerData) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().choiceOneCoordinate(locationMarkerData);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void clearNavigationRoute() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().clearNavigationRoute();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void clearRoute() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().clearRoute();
    }

    @Override // com.baidu.ar.marker.IMarker
    public float[] convertLatLngFromPosition(float f8, float f9) {
        WeakReference<IMarker> weakReference = this.f2898a;
        return (weakReference == null || weakReference.get() == null) ? new float[2] : this.f2898a.get().convertLatLngFromPosition(f8, f9);
    }

    @Override // com.baidu.ar.marker.IMarker
    public float[] convertPositionFromLatlng(float[] fArr) {
        WeakReference<IMarker> weakReference = this.f2898a;
        return (weakReference == null || weakReference.get() == null) ? new float[2] : this.f2898a.get().convertPositionFromLatlng(fArr);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void createSession() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().createSession();
    }

    @Override // com.baidu.ar.marker.IMarker
    public float[] getGeolocationByTransform() {
        h.a("MarkerARProxy", "getGeolocationByTransform");
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference != null && weakReference.get() != null) {
            return this.f2898a.get().getGeolocationByTransform();
        }
        h.b("MarkerARProxy", "iMarkerWeakReferenceAR is null");
        return new float[2];
    }

    @Override // com.baidu.ar.marker.IMarker
    public void hideFinalPoint() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().hideFinalPoint();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void hideNavigationContent() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().hideNavigationContent();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void initMarkerByTrackerType(TrackerType trackerType) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().initMarkerByTrackerType(trackerType);
    }

    @Override // com.baidu.ar.marker.IMarker
    public float[] location2ScreenPoint(float[] fArr) {
        WeakReference<IMarker> weakReference = this.f2898a;
        return (weakReference == null || weakReference.get() == null) ? new float[0] : this.f2898a.get().location2ScreenPoint(fArr);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void openDataMock() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().openDataMock();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void openDataRecorde() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().openDataRecorde();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postARRoute(List<Vector3f> list) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().postARRoute(list);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postArrow(float f8, float f9, float f10, float f11, int i8) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().postArrow(f8, f9, f10, f11, i8);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postFinalArrow(String str, double[] dArr) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().postFinalArrow(str, dArr);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postLiftDown(double[] dArr, float f8) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().postLiftDown(dArr, f8);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postLiftUp(double[] dArr, float f8) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().postLiftUp(dArr, f8);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postNavigationRoute(List<Segments> list) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().postNavigationRoute(list);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postRoute(List<double[]> list) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().postRoute(list);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void releaseMarker() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().releaseMarker();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void removeAllArrow() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().removeAllArrow();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void removeArrowByArrowId(String str) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().removeArrowByArrowId(str);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void removeLiftDown() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().removeLiftDown();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void removeLiftUp() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().removeLiftUp();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void resetMarker() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().resetMarker();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void resetNavigationController() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().resetNavigationController();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void runAREngineWithNavigation(PositioningModuleAddListener positioningModuleAddListener) {
        this.f2908k = 1;
        this.f2904g = positioningModuleAddListener;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().runAREngineWithNavigation(positioningModuleAddListener);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void runImuWithNavigation(PositioningModuleAddListener positioningModuleAddListener) {
        this.f2908k = 3;
        this.f2904g = positioningModuleAddListener;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().runImuWithNavigation(positioningModuleAddListener);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void runPedometerWithNavigation(PositioningModuleAddListener positioningModuleAddListener) {
        this.f2908k = 4;
        this.f2904g = positioningModuleAddListener;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().runPedometerWithNavigation(positioningModuleAddListener);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void runVpasWithNavigation(PositioningModuleAddListener positioningModuleAddListener) {
        this.f2904g = positioningModuleAddListener;
        this.f2908k = 2;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().runVpasWithNavigation(positioningModuleAddListener);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setAvailableFrame(MarkerFrameInfo markerFrameInfo) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().setAvailableFrame(markerFrameInfo);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setAxisCallback(IMakerAxisCallback iMakerAxisCallback) {
        this.f2901d = iMakerAxisCallback;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().setAxisCallback(iMakerAxisCallback);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setCoordinateBoundListener(OnCoordinateBoundListener onCoordinateBoundListener) {
        this.f2907j = onCoordinateBoundListener;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().setCoordinateBoundListener(onCoordinateBoundListener);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setEulerAngleCallback(OnEulerAngleCallback onEulerAngleCallback) {
        this.f2903f = onEulerAngleCallback;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().setEulerAngleCallback(onEulerAngleCallback);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setLocationTimeCallBack(IMarkerLocationTimeCallBack iMarkerLocationTimeCallBack) {
        this.f2902e = iMarkerLocationTimeCallBack;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().setLocationTimeCallBack(this.f2902e);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setMarkerARSetupCallback(p8 p8Var) {
        this.f2905h = p8Var;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().setMarkerARSetupCallback(p8Var);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setMarkerStateListener(IMarkerStateListener iMarkerStateListener) {
        this.f2899b = iMarkerStateListener;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().setMarkerStateListener(iMarkerStateListener);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setPositionCallback(k6 k6Var) {
        this.f2906i = k6Var;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().setPositionCallback(k6Var);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void setTrackerSessionCallback(OnTrackerSessionCallback onTrackerSessionCallback) {
        this.f2900c = onTrackerSessionCallback;
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().setTrackerSessionCallback(onTrackerSessionCallback);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void showNavigationContent() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().showNavigationContent();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void test() {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().test();
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateHeading(float f8, float f9) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().updateHeading(f8, f9);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateImuData(float[] fArr) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().updateImuData(fArr);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateLocation(float[] fArr, int i8, boolean z7) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().updateLocation(fArr, i8, z7);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateMeters(float f8) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().updateMeters(f8);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateMockAccelerometer(float f8, float f9, float f10) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().updateMockAccelerometer(f8, f9, f10);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateTransformData(int i8, float[] fArr) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().updateTransformData(i8, fArr);
    }

    @Override // com.baidu.ar.marker.IMarker
    public void updateTranslationPrior(TranslationPrior translationPrior) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().updateTranslationPrior(translationPrior);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.ar.d0
    public void a(c0 c0Var) {
        WeakReference<IMarker> weakReference;
        if (c0Var instanceof IMarker) {
            WeakReference<IMarker> weakReference2 = new WeakReference<>((IMarker) c0Var);
            this.f2898a = weakReference2;
            if (this.f2899b != null) {
                weakReference2.get().setMarkerStateListener(this.f2899b);
            }
            if (this.f2900c != null) {
                this.f2898a.get().setTrackerSessionCallback(this.f2900c);
            }
            if (this.f2901d != null) {
                this.f2898a.get().setAxisCallback(this.f2901d);
            }
            if (this.f2902e != null) {
                this.f2898a.get().setLocationTimeCallBack(this.f2902e);
            }
            if (this.f2903f != null) {
                this.f2898a.get().setEulerAngleCallback(this.f2903f);
            }
            if (this.f2904g != null) {
                int i8 = this.f2908k;
                if (i8 == 1) {
                    this.f2898a.get().runAREngineWithNavigation(this.f2904g);
                } else if (i8 == 2) {
                    this.f2898a.get().runVpasWithNavigation(this.f2904g);
                } else if (i8 == 3) {
                    this.f2898a.get().runImuWithNavigation(this.f2904g);
                } else if (i8 == 4) {
                    this.f2898a.get().runPedometerWithNavigation(this.f2904g);
                }
            }
            if (this.f2905h != null) {
                this.f2898a.get().setMarkerARSetupCallback(this.f2905h);
            }
            if (this.f2906i != null) {
                this.f2898a.get().setPositionCallback(this.f2906i);
            }
            if (this.f2907j == null || (weakReference = this.f2898a) == null || weakReference.get() == null) {
                return;
            }
            this.f2898a.get().setCoordinateBoundListener(this.f2907j);
        }
    }

    @Override // com.baidu.ar.marker.IMarker
    public void postArrow(String str, int i8, double[] dArr, double[] dArr2, double[] dArr3, float f8, float f9) {
        WeakReference<IMarker> weakReference = this.f2898a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2898a.get().postArrow(str, i8, dArr, dArr2, dArr3, f8, f9);
    }
}
