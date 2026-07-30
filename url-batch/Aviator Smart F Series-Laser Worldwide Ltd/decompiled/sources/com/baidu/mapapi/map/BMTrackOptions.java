package com.baidu.mapapi.map;

import com.baidu.mapapi.map.track.TraceAnimationListener;
import com.baidu.mapapi.model.LatLng;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class BMTrackOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private List<LatLng> f5568a;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f5569b;

    /* renamed from: c, reason: collision with root package name */
    private int f5570c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f5571d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f5572e;

    /* renamed from: f, reason: collision with root package name */
    private BMTrackType f5573f = BMTrackType.Surface;

    /* renamed from: g, reason: collision with root package name */
    private int f5574g = 3000;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5575h = true;

    /* renamed from: i, reason: collision with root package name */
    private BMTrackAnimateType f5576i = BMTrackAnimateType.TraceOverlayAnimationEasingCurveLinear;

    /* renamed from: j, reason: collision with root package name */
    private BitmapDescriptor f5577j = BitmapDescriptorFactory.fromAsset("track_palette.png");

    /* renamed from: k, reason: collision with root package name */
    private BitmapDescriptor f5578k = BitmapDescriptorFactory.fromAsset("track_projection_palette.png");

    /* renamed from: l, reason: collision with root package name */
    private int f5579l = 5;

    /* renamed from: m, reason: collision with root package name */
    float f5580m = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    float f5581n = 0.3f;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5582o = false;

    /* renamed from: p, reason: collision with root package name */
    private TraceAnimationListener f5583p;

    public enum BMTrackAnimateType {
        TraceOverlayAnimationEasingCurveLinear,
        TraceOverlayAnimationEasingCurveEaseIn,
        TraceOverlayAnimationEasingCurveEaseOut,
        TraceOverlayAnimationEasingCurveEaseInOut
    }

    public BMTrackAnimateType getAnimateType() {
        return this.f5576i;
    }

    public int getAnimationTime() {
        return this.f5574g;
    }

    public int[] getColors() {
        return this.f5571d;
    }

    public int[] getHeights() {
        return this.f5572e;
    }

    public float getOpacity() {
        return this.f5580m;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        BMTrackType bMTrackType;
        int[] iArr;
        List<LatLng> list = this.f5568a;
        if (list == null || list.size() <= 1 || (((bMTrackType = this.f5573f) == BMTrackType.Default3D || bMTrackType == BMTrackType.Surface) && ((iArr = this.f5572e) == null || iArr.length != this.f5568a.size()))) {
            return null;
        }
        Track track = new Track();
        int[] iArr2 = this.f5572e;
        if (iArr2 == null || iArr2.length != this.f5568a.size()) {
            int[] iArr3 = new int[this.f5568a.size()];
            track.f6413o = iArr3;
            Arrays.fill(iArr3, 1);
        } else {
            track.f6413o = this.f5572e;
        }
        track.f6420v = this.f5570c;
        track.f6414p = this.f5571d;
        track.f6421w = this.f5580m;
        track.f6422x = this.f5581n;
        track.setTrackMove(this.f5582o);
        track.f6412n = this.f5568a;
        track.f6411m = this.f5569b;
        track.f6419u = this.f5579l;
        track.A = this.f5577j;
        track.B = this.f5578k;
        track.f6416r = this.f5574g;
        track.f6417s = this.f5576i.ordinal();
        track.f6415q = this.f5573f.getType();
        track.f6120d = this.f5575h;
        track.C = this.f5583p;
        return track;
    }

    public BitmapDescriptor getPalette() {
        return this.f5577j;
    }

    public float getPaletteOpacity() {
        return this.f5581n;
    }

    public List<LatLng> getPoints() {
        return this.f5568a;
    }

    public BitmapDescriptor getProjectionPaletteDescriptor() {
        return this.f5578k;
    }

    public BMTrackType getTrackType() {
        return this.f5573f;
    }

    public int getWidth() {
        return this.f5579l;
    }

    public boolean isVisible() {
        return this.f5575h;
    }

    public OverlayOptions setAnimateType(BMTrackAnimateType bMTrackAnimateType) {
        this.f5576i = bMTrackAnimateType;
        return this;
    }

    public OverlayOptions setAnimationTime(int i8) {
        this.f5574g = i8;
        return this;
    }

    public OverlayOptions setColor(int i8) {
        this.f5570c = i8;
        return this;
    }

    public OverlayOptions setColors(int[] iArr) {
        this.f5571d = iArr;
        return this;
    }

    public OverlayOptions setColorsArray(List<Integer> list) {
        this.f5569b = list;
        return this;
    }

    public OverlayOptions setHeights(int[] iArr) {
        this.f5572e = iArr;
        return this;
    }

    public void setOpacity(float f8) {
        this.f5580m = f8;
    }

    public OverlayOptions setPalette(BitmapDescriptor bitmapDescriptor) {
        this.f5577j = bitmapDescriptor;
        return this;
    }

    public void setPaletteOpacity(float f8) {
        this.f5581n = f8;
    }

    public OverlayOptions setPoints(List<LatLng> list) {
        this.f5568a = list;
        return this;
    }

    public OverlayOptions setProjectionPalette(BitmapDescriptor bitmapDescriptor) {
        this.f5578k = bitmapDescriptor;
        return this;
    }

    public OverlayOptions setTraceAnimationListener(TraceAnimationListener traceAnimationListener) {
        this.f5583p = traceAnimationListener;
        return this;
    }

    public void setTrackMove(boolean z7) {
        this.f5582o = z7;
    }

    public OverlayOptions setTrackType(BMTrackType bMTrackType) {
        this.f5573f = bMTrackType;
        return this;
    }

    public OverlayOptions setVisible(boolean z7) {
        this.f5575h = z7;
        return this;
    }

    public OverlayOptions setWidth(int i8) {
        this.f5579l = i8;
        return this;
    }
}
