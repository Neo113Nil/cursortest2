package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public final class CircleOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f5750a;

    /* renamed from: c, reason: collision with root package name */
    private int f5752c;

    /* renamed from: d, reason: collision with root package name */
    private Stroke f5753d;

    /* renamed from: g, reason: collision with root package name */
    private List<HoleOptions> f5756g;

    /* renamed from: h, reason: collision with root package name */
    private HoleOptions f5757h;

    /* renamed from: k, reason: collision with root package name */
    private int f5760k;

    /* renamed from: l, reason: collision with root package name */
    private int f5761l;

    /* renamed from: r, reason: collision with root package name */
    private int f5767r;

    /* renamed from: s, reason: collision with root package name */
    private int f5768s;

    /* renamed from: u, reason: collision with root package name */
    int f5770u;

    /* renamed from: w, reason: collision with root package name */
    Bundle f5772w;

    /* renamed from: b, reason: collision with root package name */
    private int f5751b = -16777216;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5754e = false;

    /* renamed from: f, reason: collision with root package name */
    private int f5755f = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5758i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5759j = false;

    /* renamed from: m, reason: collision with root package name */
    private float f5762m = 0.5f;

    /* renamed from: n, reason: collision with root package name */
    private float f5763n = 0.2f;

    /* renamed from: o, reason: collision with root package name */
    private LineBloomType f5764o = LineBloomType.NONE;

    /* renamed from: p, reason: collision with root package name */
    private float f5765p = 5.0f;

    /* renamed from: q, reason: collision with root package name */
    private int f5766q = 1;

    /* renamed from: t, reason: collision with root package name */
    private LineBloomDirection f5769t = LineBloomDirection.BloomAround;

    /* renamed from: v, reason: collision with root package name */
    boolean f5771v = true;

    public CircleOptions addHoleOption(HoleOptions holeOptions) {
        this.f5757h = holeOptions;
        return this;
    }

    public CircleOptions addHoleOptions(List<HoleOptions> list) {
        this.f5756g = list;
        return this;
    }

    public CircleOptions bloomAlpha(int i8) {
        if (i8 > 255 || i8 < 0) {
            i8 = 255;
        }
        this.f5768s = i8;
        return this;
    }

    public CircleOptions bloomType(LineBloomType lineBloomType) {
        this.f5764o = lineBloomType;
        return this;
    }

    public CircleOptions bloomWidth(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        this.f5767r = i8;
        return this;
    }

    public CircleOptions center(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: circle center can not be null");
        }
        this.f5750a = latLng;
        return this;
    }

    public CircleOptions dottedStroke(boolean z7) {
        this.f5754e = z7;
        return this;
    }

    public CircleOptions dottedStrokeType(CircleDottedStrokeType circleDottedStrokeType) {
        this.f5755f = circleDottedStrokeType.ordinal();
        return this;
    }

    public CircleOptions extraInfo(Bundle bundle) {
        this.f5772w = bundle;
        return this;
    }

    public CircleOptions fillColor(int i8) {
        this.f5751b = i8;
        return this;
    }

    public LatLng getCenter() {
        return this.f5750a;
    }

    public int getCenterColor() {
        return this.f5760k;
    }

    public float getColorWeight() {
        return this.f5763n;
    }

    public Bundle getExtraInfo() {
        return this.f5772w;
    }

    public int getFillColor() {
        return this.f5751b;
    }

    public LineBloomDirection getLineBloomDirection() {
        return this.f5769t;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        Circle circle = new Circle();
        circle.f6120d = this.f5771v;
        circle.f6119c = this.f5770u;
        circle.f6121e = this.f5772w;
        circle.f5728h = this.f5751b;
        circle.f5727g = this.f5750a;
        circle.f5729i = this.f5752c;
        circle.f5730j = this.f5753d;
        circle.f5731k = this.f5754e;
        circle.f5739s = this.f5755f;
        circle.f5732l = this.f5756g;
        circle.f5733m = this.f5757h;
        circle.f5734n = this.f5758i;
        circle.f5741u = this.f5760k;
        circle.f5742v = this.f5761l;
        circle.f5743w = this.f5762m;
        circle.f5744x = this.f5763n;
        circle.f5735o = this.f5759j;
        circle.f5746z = this.f5764o;
        circle.A = this.f5769t;
        circle.C = this.f5767r;
        circle.B = this.f5768s;
        circle.E = this.f5765p;
        circle.D = this.f5766q;
        return circle;
    }

    public int getRadius() {
        return this.f5752c;
    }

    public float getRadiusWeight() {
        return this.f5762m;
    }

    public int getSideColor() {
        return this.f5761l;
    }

    public Stroke getStroke() {
        return this.f5753d;
    }

    public int getZIndex() {
        return this.f5770u;
    }

    public boolean isIsGradientCircle() {
        return this.f5758i;
    }

    public boolean isVisible() {
        return this.f5771v;
    }

    public CircleOptions lineBloomDirection(LineBloomDirection lineBloomDirection) {
        this.f5769t = lineBloomDirection;
        return this;
    }

    public CircleOptions radius(int i8) {
        this.f5752c = i8;
        return this;
    }

    public CircleOptions setBloomBlurTimes(int i8) {
        if (i8 < 1) {
            i8 = 1;
        }
        if (i8 > 10) {
            i8 = 10;
        }
        this.f5766q = i8;
        return this;
    }

    public CircleOptions setBloomGradientASpeed(float f8) {
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        if (f8 > 10.0f) {
            f8 = 10.0f;
        }
        this.f5765p = f8;
        return this;
    }

    public CircleOptions setCenterColor(int i8) {
        this.f5760k = i8;
        return this;
    }

    public CircleOptions setClickable(boolean z7) {
        this.f5759j = z7;
        return this;
    }

    public CircleOptions setColorWeight(float f8) {
        if (f8 > 0.0f && f8 < 1.0f) {
            this.f5763n = f8;
        }
        return this;
    }

    public CircleOptions setIsGradientCircle(boolean z7) {
        this.f5758i = z7;
        return this;
    }

    public CircleOptions setRadiusWeight(float f8) {
        if (f8 > 0.0f && f8 < 1.0f) {
            this.f5762m = f8;
        }
        return this;
    }

    public CircleOptions setSideColor(int i8) {
        this.f5761l = i8;
        return this;
    }

    public CircleOptions stroke(Stroke stroke) {
        this.f5753d = stroke;
        return this;
    }

    public CircleOptions visible(boolean z7) {
        this.f5771v = z7;
        return this;
    }

    public CircleOptions zIndex(int i8) {
        this.f5770u = i8;
        return this;
    }
}
