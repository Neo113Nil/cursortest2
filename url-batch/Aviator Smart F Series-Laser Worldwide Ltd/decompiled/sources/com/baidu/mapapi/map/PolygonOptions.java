package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public final class PolygonOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private Stroke f6150a;

    /* renamed from: c, reason: collision with root package name */
    private List<LatLng> f6152c;

    /* renamed from: d, reason: collision with root package name */
    private List<HoleOptions> f6153d;

    /* renamed from: e, reason: collision with root package name */
    private HoleOptions f6154e;

    /* renamed from: g, reason: collision with root package name */
    private String f6156g;

    /* renamed from: h, reason: collision with root package name */
    private EncodePointType f6157h;

    /* renamed from: n, reason: collision with root package name */
    private int f6163n;

    /* renamed from: o, reason: collision with root package name */
    private int f6164o;

    /* renamed from: t, reason: collision with root package name */
    int f6169t;

    /* renamed from: v, reason: collision with root package name */
    Bundle f6171v;

    /* renamed from: b, reason: collision with root package name */
    private int f6151b = -16777216;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6155f = false;

    /* renamed from: i, reason: collision with root package name */
    private int f6158i = 0;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6159j = false;

    /* renamed from: k, reason: collision with root package name */
    private LineBloomType f6160k = LineBloomType.NONE;

    /* renamed from: l, reason: collision with root package name */
    private float f6161l = 5.0f;

    /* renamed from: m, reason: collision with root package name */
    private int f6162m = 1;

    /* renamed from: p, reason: collision with root package name */
    private LineBloomDirection f6165p = LineBloomDirection.BloomAround;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6166q = true;

    /* renamed from: r, reason: collision with root package name */
    private ThinAndSmoothAlgorithm f6167r = ThinAndSmoothAlgorithm.DOUGLAS_PEUCKER;

    /* renamed from: s, reason: collision with root package name */
    private float f6168s = 4.0f;

    /* renamed from: u, reason: collision with root package name */
    boolean f6170u = true;

    public PolygonOptions addHoleOption(HoleOptions holeOptions) {
        this.f6154e = holeOptions;
        return this;
    }

    public PolygonOptions addHoleOptions(List<HoleOptions> list) {
        this.f6153d = list;
        return this;
    }

    public PolygonOptions bloomAlpha(int i8) {
        if (i8 > 255 || i8 < 0) {
            i8 = 255;
        }
        this.f6164o = i8;
        return this;
    }

    public PolygonOptions bloomType(LineBloomType lineBloomType) {
        this.f6160k = lineBloomType;
        return this;
    }

    public PolygonOptions bloomWidth(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        this.f6163n = i8;
        return this;
    }

    public PolygonOptions dottedStroke(boolean z7) {
        this.f6155f = z7;
        return this;
    }

    public PolygonOptions dottedStrokeType(PolylineDottedLineType polylineDottedLineType) {
        this.f6158i = polylineDottedLineType.ordinal();
        return this;
    }

    public PolygonOptions extraInfo(Bundle bundle) {
        this.f6171v = bundle;
        return this;
    }

    public PolygonOptions fillColor(int i8) {
        this.f6151b = i8;
        return this;
    }

    public Bundle getExtraInfo() {
        return this.f6171v;
    }

    public int getFillColor() {
        return this.f6151b;
    }

    public LineBloomDirection getLineBloomDirection() {
        return this.f6165p;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        Polygon polygon = new Polygon();
        polygon.f6120d = this.f6170u;
        polygon.f6119c = this.f6169t;
        polygon.f6121e = this.f6171v;
        List<LatLng> list = this.f6152c;
        if (list == null || list.size() < 2) {
            String str = this.f6156g;
            if (str == null || str.length() <= 0) {
                throw new IllegalStateException("BDMapSDKException: when you add polyline, you must at least supply 2 points");
            }
            polygon.f6132j = this.f6156g;
            polygon.f6118b = this.f6157h;
        }
        polygon.f6139q = this.f6152c;
        polygon.f6138p = this.f6151b;
        polygon.f6129g = this.f6150a;
        polygon.f6140r = this.f6153d;
        polygon.f6141s = this.f6154e;
        polygon.f6142t = this.f6155f;
        polygon.f6135m = this.f6158i;
        polygon.f6143u = this.f6159j;
        polygon.B = this.f6160k;
        polygon.C = this.f6165p;
        polygon.E = this.f6163n;
        polygon.D = this.f6164o;
        polygon.G = this.f6161l;
        polygon.F = this.f6162m;
        polygon.f6146x = this.f6166q;
        polygon.f6147y = this.f6167r;
        polygon.f6148z = this.f6168s;
        return polygon;
    }

    public List<LatLng> getPoints() {
        return this.f6152c;
    }

    public Stroke getStroke() {
        return this.f6150a;
    }

    public int getZIndex() {
        return this.f6169t;
    }

    public PolygonOptions isThined(boolean z7) {
        this.f6166q = z7;
        return this;
    }

    public boolean isVisible() {
        return this.f6170u;
    }

    public PolygonOptions lineBloomDirection(LineBloomDirection lineBloomDirection) {
        this.f6165p = lineBloomDirection;
        return this;
    }

    public PolygonOptions points(String str, EncodePointType encodePointType) {
        this.f6156g = str;
        this.f6157h = encodePointType;
        return this;
    }

    public PolygonOptions setBloomBlurTimes(int i8) {
        if (i8 < 1) {
            i8 = 1;
        }
        if (i8 > 10) {
            i8 = 10;
        }
        this.f6162m = i8;
        return this;
    }

    public PolygonOptions setBloomGradientASpeed(float f8) {
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        if (f8 > 10.0f) {
            f8 = 10.0f;
        }
        this.f6161l = f8;
        return this;
    }

    public PolygonOptions setClickable(boolean z7) {
        this.f6159j = z7;
        return this;
    }

    public PolygonOptions stroke(Stroke stroke) {
        this.f6150a = stroke;
        return this;
    }

    public PolygonOptions thinAlgorithm(ThinAndSmoothAlgorithm thinAndSmoothAlgorithm) {
        this.f6167r = thinAndSmoothAlgorithm;
        return this;
    }

    public PolygonOptions thinFactor(float f8) {
        if (f8 > 0.0f) {
            this.f6168s = f8;
        }
        return this;
    }

    public PolygonOptions visible(boolean z7) {
        this.f6170u = z7;
        return this;
    }

    public PolygonOptions zIndex(int i8) {
        this.f6169t = i8;
        return this;
    }

    public PolygonOptions points(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() <= 2) {
            throw new IllegalArgumentException("BDMapSDKException: points count can not less than three");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not contains null");
        }
        int i8 = 0;
        while (i8 < list.size()) {
            int i9 = i8 + 1;
            for (int i10 = i9; i10 < list.size(); i10++) {
                if (list.get(i8) == list.get(i10)) {
                    throw new IllegalArgumentException("BDMapSDKException: points list can not has same points");
                }
            }
            i8 = i9;
        }
        this.f6152c = list;
        return this;
    }
}
