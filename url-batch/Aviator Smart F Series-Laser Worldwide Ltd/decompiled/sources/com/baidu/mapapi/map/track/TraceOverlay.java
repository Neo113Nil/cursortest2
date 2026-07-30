package com.baidu.mapapi.map.track;

import com.baidu.mapapi.map.BM3DModelOptions;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.track.TraceOptions;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapsdkplatform.comapi.map.z.b;
import java.util.List;

/* loaded from: classes2.dex */
public class TraceOverlay {

    /* renamed from: c, reason: collision with root package name */
    List<LatLng> f6553c;

    /* renamed from: d, reason: collision with root package name */
    int[] f6554d;

    /* renamed from: g, reason: collision with root package name */
    boolean f6557g;

    /* renamed from: h, reason: collision with root package name */
    boolean f6558h;

    /* renamed from: i, reason: collision with root package name */
    int f6559i;

    /* renamed from: j, reason: collision with root package name */
    boolean f6560j;
    public b mListener;

    /* renamed from: o, reason: collision with root package name */
    BitmapDescriptor f6565o;

    /* renamed from: p, reason: collision with root package name */
    BM3DModelOptions f6566p;

    /* renamed from: a, reason: collision with root package name */
    int f6551a = -265058817;

    /* renamed from: b, reason: collision with root package name */
    int f6552b = 14;

    /* renamed from: e, reason: collision with root package name */
    int f6555e = 300;

    /* renamed from: f, reason: collision with root package name */
    int f6556f = 0;

    /* renamed from: k, reason: collision with root package name */
    boolean f6561k = true;

    /* renamed from: l, reason: collision with root package name */
    boolean f6562l = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f6563m = true;

    /* renamed from: n, reason: collision with root package name */
    boolean f6564n = true;

    /* renamed from: q, reason: collision with root package name */
    boolean f6567q = false;

    /* renamed from: r, reason: collision with root package name */
    float f6568r = 5.0f;

    /* renamed from: s, reason: collision with root package name */
    boolean f6569s = false;

    /* renamed from: t, reason: collision with root package name */
    boolean f6570t = false;

    TraceOverlay() {
    }

    public void clear() {
        this.mListener.c(this);
    }

    public int getAnimationDuration() {
        return this.f6556f;
    }

    public int getAnimationTime() {
        return this.f6555e;
    }

    public int getAnimationType() {
        return this.f6559i;
    }

    public float getBloomSpeed() {
        return this.f6568r;
    }

    public int getColor() {
        return this.f6551a;
    }

    public int[] getColors() {
        return this.f6554d;
    }

    public BitmapDescriptor getIcon() {
        return this.f6565o;
    }

    public BM3DModelOptions getIcon3D() {
        return this.f6566p;
    }

    public LatLngBounds getLatLngBounds() {
        List<LatLng> list = this.f6553c;
        if (list == null || list.size() == 0) {
            return null;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(this.f6553c);
        return builder.build();
    }

    public List<LatLng> getPoints() {
        return this.f6553c;
    }

    public int getWidth() {
        return this.f6552b;
    }

    public void icon(BitmapDescriptor bitmapDescriptor) {
        this.f6565o = bitmapDescriptor;
    }

    public void icon3D(BM3DModelOptions bM3DModelOptions) {
        this.f6566p = bM3DModelOptions;
    }

    public boolean isAnimate() {
        return this.f6558h;
    }

    public boolean isDataReduction() {
        return this.f6563m;
    }

    public boolean isDataSmooth() {
        return this.f6564n;
    }

    public boolean isOnPause() {
        return this.f6570t;
    }

    public boolean isPointMove() {
        return this.f6562l;
    }

    public boolean isRotateWhenTrack() {
        return this.f6561k;
    }

    public boolean isStatusChanged() {
        return this.f6569s;
    }

    public boolean isTrackBloom() {
        return this.f6567q;
    }

    public boolean isTrackMove() {
        return this.f6560j;
    }

    public boolean isUseColorArray() {
        return this.f6557g;
    }

    public void pause() {
        this.f6569s = true;
        this.f6570t = true;
        this.mListener.a(this);
    }

    public void remove() {
        this.mListener.b(this);
    }

    public void resume() {
        this.f6570t = false;
        this.f6569s = true;
        this.mListener.a(this);
        this.f6569s = false;
    }

    public void setAnimate(boolean z7) {
        this.f6558h = z7;
    }

    public void setAnimationDuration(int i8) {
        this.f6556f = i8;
    }

    public void setAnimationTime(int i8) {
        if (i8 < 300) {
            throw new IllegalArgumentException("BDMapSDKException: Not less than 300 milliseconds");
        }
        this.f6555e = i8;
    }

    public void setBloomSpeed(float f8) {
        this.f6568r = f8;
    }

    public void setColor(int i8) {
        this.f6551a = i8;
    }

    public void setDataReduction(boolean z7) {
        this.f6563m = z7;
    }

    public void setDataSmooth(boolean z7) {
        this.f6564n = z7;
    }

    public void setPointMove(boolean z7) {
        this.f6562l = z7;
    }

    public void setRotateWhenTrack(boolean z7) {
        this.f6561k = z7;
    }

    public void setTraceAnimationType(TraceOptions.TraceAnimateType traceAnimateType) {
        if (traceAnimateType == null) {
            traceAnimateType = TraceOptions.TraceAnimateType.TraceOverlayAnimationEasingCurveLinear;
        }
        this.f6559i = traceAnimateType.ordinal();
    }

    public void setTraceColors(int[] iArr) {
        this.f6554d = iArr;
    }

    public void setTracePoints(List<LatLng> list) {
        this.f6553c = list;
    }

    public void setTrackBloom(boolean z7) {
        this.f6567q = z7;
    }

    public void setTrackMove(boolean z7) {
        this.f6560j = z7;
    }

    public void setWidth(int i8) {
        this.f6552b = i8;
    }

    public void update() {
        this.mListener.a(this);
    }

    public void useColorArray(boolean z7) {
        this.f6557g = z7;
    }
}
