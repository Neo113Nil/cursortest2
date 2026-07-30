package com.baidu.mapapi.map.track;

import com.baidu.mapapi.map.BM3DModelOptions;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public class TraceOptions {

    /* renamed from: c, reason: collision with root package name */
    private List<LatLng> f6534c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f6535d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6538g;

    /* renamed from: h, reason: collision with root package name */
    private int f6539h;

    /* renamed from: m, reason: collision with root package name */
    private BitmapDescriptor f6544m;

    /* renamed from: p, reason: collision with root package name */
    private BM3DModelOptions f6547p;

    /* renamed from: a, reason: collision with root package name */
    private int f6532a = -15794282;

    /* renamed from: b, reason: collision with root package name */
    private int f6533b = 14;

    /* renamed from: e, reason: collision with root package name */
    private int f6536e = 300;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6537f = false;

    /* renamed from: i, reason: collision with root package name */
    private int f6540i = TraceAnimateType.TraceOverlayAnimationEasingCurveLinear.ordinal();

    /* renamed from: j, reason: collision with root package name */
    private boolean f6541j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6542k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6543l = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6545n = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6546o = true;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6548q = false;

    /* renamed from: r, reason: collision with root package name */
    private float f6549r = 5.0f;

    public enum TraceAnimateType {
        TraceOverlayAnimationEasingCurveLinear,
        TraceOverlayAnimationEasingCurveEaseIn,
        TraceOverlayAnimationEasingCurveEaseOut,
        TraceOverlayAnimationEasingCurveEaseInOut
    }

    public TraceOptions animate(boolean z7) {
        this.f6537f = z7;
        return this;
    }

    public TraceOptions animationDuration(int i8) {
        this.f6539h = i8;
        return this;
    }

    public TraceOptions animationTime(int i8) {
        if (i8 < 300) {
            throw new IllegalArgumentException("BDMapSDKException: Not less than 300 milliseconds");
        }
        this.f6536e = i8;
        return this;
    }

    public TraceOptions animationType(TraceAnimateType traceAnimateType) {
        if (traceAnimateType == null) {
            traceAnimateType = TraceAnimateType.TraceOverlayAnimationEasingCurveLinear;
        }
        this.f6540i = traceAnimateType.ordinal();
        return this;
    }

    public TraceOptions color(int i8) {
        this.f6532a = i8;
        return this;
    }

    public TraceOptions colors(int[] iArr) {
        this.f6535d = iArr;
        return this;
    }

    public TraceAnimateType getAnimateType() {
        int i8 = this.f6540i;
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? TraceAnimateType.TraceOverlayAnimationEasingCurveLinear : TraceAnimateType.TraceOverlayAnimationEasingCurveEaseInOut : TraceAnimateType.TraceOverlayAnimationEasingCurveEaseOut : TraceAnimateType.TraceOverlayAnimationEasingCurveEaseIn;
    }

    public int getAnimationDuration() {
        return this.f6539h;
    }

    public int getAnimationTime() {
        return this.f6536e;
    }

    public float getBloomSpeed() {
        return this.f6549r;
    }

    public int getColor() {
        return this.f6532a;
    }

    public int[] getColors() {
        return this.f6535d;
    }

    public BitmapDescriptor getIcon() {
        return this.f6544m;
    }

    public TraceOverlay getOverlay() {
        TraceOverlay traceOverlay = new TraceOverlay();
        traceOverlay.f6551a = this.f6532a;
        traceOverlay.f6552b = this.f6533b;
        traceOverlay.f6553c = this.f6534c;
        traceOverlay.f6555e = this.f6536e;
        traceOverlay.f6558h = this.f6537f;
        boolean z7 = this.f6538g;
        traceOverlay.f6557g = z7;
        if (z7) {
            traceOverlay.f6554d = this.f6535d;
        }
        traceOverlay.f6556f = this.f6539h;
        traceOverlay.f6559i = this.f6540i;
        traceOverlay.f6560j = this.f6541j;
        traceOverlay.f6561k = this.f6542k;
        traceOverlay.f6562l = this.f6543l;
        traceOverlay.f6565o = this.f6544m;
        traceOverlay.f6563m = this.f6545n;
        traceOverlay.f6564n = this.f6546o;
        traceOverlay.f6566p = this.f6547p;
        boolean z8 = this.f6548q;
        traceOverlay.f6567q = z8;
        if (z8) {
            traceOverlay.f6568r = this.f6549r;
        }
        return traceOverlay;
    }

    public List<LatLng> getPoints() {
        return this.f6534c;
    }

    public int getWidth() {
        return this.f6533b;
    }

    public TraceOptions icon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("BDMapSDKException: trace's icon can not be null");
        }
        this.f6544m = bitmapDescriptor;
        return this;
    }

    public TraceOptions icon3D(BM3DModelOptions bM3DModelOptions) {
        this.f6547p = bM3DModelOptions;
        return this;
    }

    public boolean isAnimation() {
        return this.f6537f;
    }

    public boolean isPointMove() {
        return this.f6543l;
    }

    public boolean isRotateWhenTrack() {
        return this.f6542k;
    }

    public boolean isTrackMove() {
        return this.f6541j;
    }

    public boolean isUseColorarray() {
        return this.f6538g;
    }

    public TraceOptions points(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() < 2) {
            throw new IllegalArgumentException("BDMapSDKException: points count can not less than 2");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not contains null");
        }
        this.f6534c = list;
        return this;
    }

    public TraceOptions setBloomSpeed(float f8) {
        this.f6549r = f8;
        return this;
    }

    public TraceOptions setDataReduction(boolean z7) {
        this.f6545n = z7;
        return this;
    }

    public TraceOptions setDataSmooth(boolean z7) {
        this.f6546o = z7;
        return this;
    }

    public TraceOptions setPointMove(boolean z7) {
        this.f6543l = z7;
        return this;
    }

    public TraceOptions setRotateWhenTrack(boolean z7) {
        this.f6542k = z7;
        return this;
    }

    public TraceOptions setTrackBloom(boolean z7) {
        this.f6548q = z7;
        return this;
    }

    public TraceOptions setTrackMove(boolean z7) {
        this.f6541j = z7;
        return this;
    }

    public TraceOptions useColorArray(boolean z7) {
        this.f6538g = z7;
        return this;
    }

    public TraceOptions width(int i8) {
        this.f6533b = i8;
        return this;
    }
}
