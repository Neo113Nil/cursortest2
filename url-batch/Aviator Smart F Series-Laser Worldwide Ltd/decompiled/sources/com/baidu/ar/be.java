package com.baidu.ar;

import android.content.Context;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;
import com.baidu.ar.arplay.core.pixel.PixelType;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.marker.IMarkerLocationTimeCallBack;
import com.baidu.ar.marker.IMarkerStateListener;
import com.baidu.ar.marker.MarkerFrameInfo;
import com.baidu.ar.marker.OnTrackerSessionCallback;
import com.baidu.ar.marker.TrackerType;
import com.baidu.ar.vps.marker.VisualManager;

/* loaded from: classes.dex */
public class be extends o4 {

    /* renamed from: i, reason: collision with root package name */
    public int f1851i;

    /* renamed from: j, reason: collision with root package name */
    public int f1852j;

    /* renamed from: k, reason: collision with root package name */
    public VisualManager f1853k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f1854l = new float[16];

    /* renamed from: m, reason: collision with root package name */
    public float[] f1855m = null;

    /* renamed from: n, reason: collision with root package name */
    public long f1856n;

    public be(Context context, int i8, int i9, IMarkerStateListener iMarkerStateListener, de deVar) {
        if (ARConfig.isQAMockOpen) {
            this.f1852j = ob.f2917b;
            this.f1851i = ob.f2916a;
        } else {
            this.f1851i = i8;
            this.f1852j = i9;
        }
        PixelReadParams pixelReadParams = new PixelReadParams(PixelType.NV21);
        this.f2878e = pixelReadParams;
        pixelReadParams.setOutputWidth(i8);
        this.f2878e.setOutputHeight(i9);
        VisualManager visualManager = new VisualManager(context, i8, i9, 1);
        this.f1853k = visualManager;
        visualManager.setMarkerStateListener(iMarkerStateListener);
        this.f1853k.setVisualLocatingServiceLocatingListener(deVar);
    }

    public void a(float f8, float f9, float f10) {
        if (this.f1853k == null) {
            return;
        }
        this.f1855m = new float[]{f8, f9, f10};
    }

    @Override // com.baidu.ar.o4
    public void e() {
        VisualManager visualManager = this.f1853k;
        if (visualManager != null) {
            visualManager.setMarkerStateListener(null);
            this.f1853k.release();
            this.f1853k = null;
        }
    }

    @Override // com.baidu.ar.o4
    public void f() {
    }

    public VisualManager g() {
        return this.f1853k;
    }

    @Override // com.baidu.ar.t5
    public String getName() {
        return "MarkerDetector";
    }

    public void h() {
        VisualManager visualManager = this.f1853k;
        if (visualManager == null) {
            return;
        }
        visualManager.onPause();
    }

    public void i() {
        VisualManager visualManager = this.f1853k;
        if (visualManager == null) {
            return;
        }
        visualManager.onResume();
    }

    public void a(k6 k6Var) {
        VisualManager visualManager = this.f1853k;
        if (visualManager != null) {
            visualManager.setiMarkerPositionCallback(k6Var);
        }
    }

    public void a(IMarkerLocationTimeCallBack iMarkerLocationTimeCallBack) {
        VisualManager visualManager = this.f1853k;
        if (visualManager != null) {
            visualManager.setMarkerLocationTimeCallBack(iMarkerLocationTimeCallBack);
        }
    }

    public void a(MarkerFrameInfo markerFrameInfo) {
        if (this.f1853k == null) {
            return;
        }
        this.f1854l = markerFrameInfo.getPoseMat();
        this.f1853k.setCameraParams(markerFrameInfo.getIntrinsics(), markerFrameInfo.getDistort(), markerFrameInfo.getTrackingState(), markerFrameInfo.getMagnet());
    }

    public void a(OnTrackerSessionCallback onTrackerSessionCallback) {
        VisualManager visualManager = this.f1853k;
        if (visualManager != null) {
            visualManager.setTrackerSessionCallback(onTrackerSessionCallback);
        }
    }

    public void a(TrackerType trackerType) {
        VisualManager visualManager = this.f1853k;
        if (visualManager != null) {
            visualManager.loadMarkerSO(trackerType);
        }
    }

    public void a(float[] fArr, float[] fArr2) {
        VisualManager visualManager = this.f1853k;
        if (visualManager == null) {
            return;
        }
        this.f1854l = fArr;
        if (fArr2 != null) {
            visualManager.updateGrative(fArr2);
        }
    }

    @Override // com.baidu.ar.o4
    public boolean a(FramePixels framePixels) {
        VisualManager visualManager = this.f1853k;
        if (visualManager != null && this.f1854l != null) {
            this.f1856n++;
            visualManager.setYUVFile(framePixels.getPixelData(), this.f1851i, this.f1852j, this.f1854l, this.f1855m);
        }
        return false;
    }
}
