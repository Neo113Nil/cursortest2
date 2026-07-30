package com.baidu.mapapi.map;

import android.os.Bundle;
import android.util.Log;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.model.LatLng;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class PolylineOptions extends OverlayOptions {
    private int C;
    private int D;
    private boolean F;

    /* renamed from: b, reason: collision with root package name */
    private List<LatLng> f6196b;

    /* renamed from: c, reason: collision with root package name */
    private List<Integer> f6197c;

    /* renamed from: d, reason: collision with root package name */
    private List<Integer> f6198d;

    /* renamed from: f, reason: collision with root package name */
    private BitmapDescriptor f6200f;

    /* renamed from: g, reason: collision with root package name */
    private List<BitmapDescriptor> f6201g;

    /* renamed from: j, reason: collision with root package name */
    int f6204j;

    /* renamed from: n, reason: collision with root package name */
    Bundle f6208n;

    /* renamed from: a, reason: collision with root package name */
    private int f6195a = -16777216;

    /* renamed from: e, reason: collision with root package name */
    private float f6199e = 5.0f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6202h = true;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6203i = false;

    /* renamed from: k, reason: collision with root package name */
    boolean f6205k = true;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6206l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6207m = true;

    /* renamed from: o, reason: collision with root package name */
    private int f6209o = 0;

    /* renamed from: p, reason: collision with root package name */
    private LineJoinType f6210p = LineJoinType.LineJoinRound;

    /* renamed from: q, reason: collision with root package name */
    private LineCapType f6211q = LineCapType.LineCapButt;

    /* renamed from: r, reason: collision with root package name */
    private boolean f6212r = true;

    /* renamed from: s, reason: collision with root package name */
    private ThinAndSmoothAlgorithm f6213s = ThinAndSmoothAlgorithm.DOUGLAS_PEUCKER;

    /* renamed from: t, reason: collision with root package name */
    private float f6214t = 4.0f;

    /* renamed from: u, reason: collision with root package name */
    private ThinAndSmoothAlgorithm f6215u = ThinAndSmoothAlgorithm.BEZIER_SMOOTH;

    /* renamed from: v, reason: collision with root package name */
    private float f6216v = 16.0f;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6217w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f6218x = false;

    /* renamed from: y, reason: collision with root package name */
    private LineDirectionCross180 f6219y = LineDirectionCross180.NONE;

    /* renamed from: z, reason: collision with root package name */
    private LineBloomType f6220z = LineBloomType.NONE;
    private float A = 5.0f;
    private int B = 1;
    private LineBloomDirection E = LineBloomDirection.BloomAround;

    public enum LineBloomType {
        NONE,
        GradientA,
        BLUR
    }

    public enum LineCapType {
        LineCapButt,
        LineCapRound,
        LineCapSQUARE
    }

    public enum LineDirectionCross180 {
        NONE,
        FROM_EAST_TO_WEST,
        FROM_WEST_TO_EAST
    }

    public enum LineJoinType {
        LineJoinBevel,
        LineJoinMiter,
        LineJoinRound,
        LineJoinBerzier
    }

    private Polyline a(Polyline polyline) {
        polyline.f6120d = this.f6205k;
        polyline.R = this.f6219y;
        polyline.f6173h = this.f6196b;
        polyline.f6178m = this.f6199e;
        polyline.C = this.f6218x;
        List<Integer> list = this.f6198d;
        if (list == null || list.size() == 0) {
            throw new IllegalStateException("BDMapSDKException: colors array can not be null");
        }
        List<LatLng> list2 = this.f6196b;
        if (list2 == null || list2.size() == 0) {
            throw new IllegalStateException("BDMapSDKException: mPoints array can not be null");
        }
        int[] iArr = new int[this.f6198d.size()];
        Iterator<Integer> it = this.f6198d.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            iArr[i8] = it.next().intValue();
            i8++;
        }
        polyline.f6176k = iArr;
        return polyline;
    }

    public PolylineOptions bloomAlpha(int i8) {
        if (i8 > 255 || i8 < 0) {
            i8 = 255;
        }
        this.D = i8;
        return this;
    }

    public PolylineOptions bloomType(LineBloomType lineBloomType) {
        this.f6220z = lineBloomType;
        return this;
    }

    public PolylineOptions bloomWidth(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        this.C = i8;
        return this;
    }

    public PolylineOptions clickable(boolean z7) {
        this.f6207m = z7;
        return this;
    }

    public PolylineOptions color(int i8) {
        this.f6195a = i8;
        return this;
    }

    public PolylineOptions colorsValues(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: colors list can not be null");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: colors list can not contains null");
        }
        this.f6198d = list;
        return this;
    }

    public PolylineOptions customTexture(BitmapDescriptor bitmapDescriptor) {
        this.f6200f = bitmapDescriptor;
        return this;
    }

    public PolylineOptions customTextureList(List<BitmapDescriptor> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: customTexture list can not be null");
        }
        if (list.size() == 0) {
            Log.e("baidumapsdk", "custom texture list is empty,the texture will not work");
        }
        Iterator<BitmapDescriptor> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                Log.e("baidumapsdk", "the custom texture item is null,it will be discard");
            }
        }
        this.f6201g = list;
        return this;
    }

    public PolylineOptions dottedLine(boolean z7) {
        this.f6206l = z7;
        return this;
    }

    public PolylineOptions dottedLineType(PolylineDottedLineType polylineDottedLineType) {
        this.f6209o = polylineDottedLineType.ordinal();
        return this;
    }

    public PolylineOptions extraInfo(Bundle bundle) {
        this.f6208n = bundle;
        return this;
    }

    public PolylineOptions focus(boolean z7) {
        this.f6202h = z7;
        return this;
    }

    public int getColor() {
        return this.f6195a;
    }

    public BitmapDescriptor getCustomTexture() {
        return this.f6200f;
    }

    public List<BitmapDescriptor> getCustomTextureList() {
        return this.f6201g;
    }

    public Bundle getExtraInfo() {
        return this.f6208n;
    }

    public LineBloomDirection getLineBloomDirection() {
        return this.E;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        Polyline polyline = new Polyline();
        List<LatLng> list = this.f6196b;
        if (list == null || list.size() < 2) {
            throw new IllegalStateException("BDMapSDKException: when you add polyline, you must at least supply 2 points");
        }
        polyline.S = this.f6220z;
        polyline.I = this.E;
        polyline.D = this.C;
        polyline.E = this.D;
        polyline.F = this.A;
        polyline.G = this.B;
        boolean z7 = this.f6218x;
        if (z7) {
            polyline.type = com.baidu.mapsdkplatform.comapi.map.d.gradientLine;
            return a(polyline);
        }
        polyline.f6120d = this.f6205k;
        polyline.f6179n = this.f6206l;
        polyline.f6119c = this.f6204j;
        polyline.f6121e = this.f6208n;
        polyline.f6173h = this.f6196b;
        polyline.f6172g = this.f6195a;
        polyline.f6178m = this.f6199e;
        polyline.f6183r = this.f6200f;
        polyline.f6185t = this.f6201g;
        polyline.f6180o = this.f6202h;
        polyline.f6181p = this.f6203i;
        polyline.f6182q = this.f6207m;
        polyline.f6188w = this.f6212r;
        polyline.f6189x = this.f6213s;
        polyline.f6190y = this.f6214t;
        polyline.f6191z = this.f6215u;
        polyline.A = this.f6216v;
        polyline.B = this.f6217w;
        polyline.C = z7;
        polyline.f6187v = this.f6209o;
        polyline.Q = this.f6210p;
        polyline.P = this.f6211q;
        polyline.R = this.f6219y;
        List<Integer> list2 = this.f6197c;
        int i8 = 0;
        if (list2 != null && list2.size() > 0) {
            int[] iArr = new int[this.f6197c.size()];
            Iterator<Integer> it = this.f6197c.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                iArr[i9] = it.next().intValue();
                i9++;
            }
            polyline.f6174i = iArr;
        }
        List<Integer> list3 = this.f6198d;
        if (list3 != null && list3.size() > 0) {
            int[] iArr2 = new int[this.f6198d.size()];
            Iterator<Integer> it2 = this.f6198d.iterator();
            while (it2.hasNext()) {
                iArr2[i8] = it2.next().intValue();
                i8++;
            }
            polyline.f6176k = iArr2;
        }
        polyline.H = this.F;
        return polyline;
    }

    public List<LatLng> getPoints() {
        return this.f6196b;
    }

    public List<Integer> getTextureIndexs() {
        return this.f6197c;
    }

    public float getWidth() {
        return this.f6199e;
    }

    public int getZIndex() {
        return this.f6204j;
    }

    public boolean isDottedLine() {
        return this.f6206l;
    }

    public boolean isFocus() {
        return this.f6202h;
    }

    public PolylineOptions isGeodesic(boolean z7) {
        this.f6217w = z7;
        return this;
    }

    public PolylineOptions isGradient(boolean z7) {
        this.f6218x = z7;
        return this;
    }

    public PolylineOptions isThined(boolean z7) {
        this.f6212r = z7;
        return this;
    }

    public boolean isVisible() {
        return this.f6205k;
    }

    public PolylineOptions keepScale(boolean z7) {
        this.f6203i = z7;
        return this;
    }

    public PolylineOptions lineBloomDirection(LineBloomDirection lineBloomDirection) {
        this.E = lineBloomDirection;
        return this;
    }

    public PolylineOptions lineCapType(LineCapType lineCapType) {
        this.f6211q = lineCapType;
        return this;
    }

    public PolylineOptions lineDirectionCross180(LineDirectionCross180 lineDirectionCross180) {
        this.f6219y = lineDirectionCross180;
        return this;
    }

    public PolylineOptions lineJoinType(LineJoinType lineJoinType) {
        this.f6210p = lineJoinType;
        return this;
    }

    public PolylineOptions points(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() < 2) {
            throw new IllegalArgumentException("BDMapSDKException: points count can not less than 2");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not contains null");
        }
        this.f6196b = list;
        return this;
    }

    public PolylineOptions setBloomBlurTimes(int i8) {
        if (i8 < 1) {
            i8 = 1;
        }
        if (i8 > 10) {
            i8 = 10;
        }
        this.B = i8;
        return this;
    }

    public PolylineOptions setBloomGradientASpeed(float f8) {
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        if (f8 > 10.0f) {
            f8 = 10.0f;
        }
        this.A = f8;
        return this;
    }

    public PolylineOptions setHighPrecision(boolean z7) {
        this.F = z7;
        return this;
    }

    public PolylineOptions smoothAlgorithm(ThinAndSmoothAlgorithm thinAndSmoothAlgorithm) {
        this.f6215u = thinAndSmoothAlgorithm;
        return this;
    }

    public PolylineOptions smoothFactor(float f8) {
        if (f8 > 0.0f) {
            this.f6216v = f8;
        }
        return this;
    }

    public PolylineOptions textureIndex(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: indexs list can not be null");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: index list can not contains null");
        }
        this.f6197c = list;
        return this;
    }

    public PolylineOptions thinAlgorithm(ThinAndSmoothAlgorithm thinAndSmoothAlgorithm) {
        this.f6213s = thinAndSmoothAlgorithm;
        return this;
    }

    public PolylineOptions thinFactor(float f8) {
        if (f8 > 0.0f) {
            this.f6214t = f8;
        }
        return this;
    }

    public PolylineOptions visible(boolean z7) {
        this.f6205k = z7;
        return this;
    }

    public PolylineOptions width(int i8) {
        if (i8 > 0) {
            this.f6199e = i8;
        }
        return this;
    }

    public PolylineOptions zIndex(int i8) {
        this.f6204j = i8;
        return this;
    }

    public PolylineOptions width(float f8) {
        if (f8 > 0.0f) {
            this.f6199e = (f8 * 310.0f) / SysOSUtil.getDensityDpi();
        }
        return this;
    }
}
