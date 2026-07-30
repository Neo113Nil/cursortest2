package com.baidu.mapapi.map;

import android.graphics.Point;
import android.os.Bundle;
import com.baidu.location.BDLocation;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class MarkerOptions extends OverlayOptions {
    int G;
    Bundle I;

    /* renamed from: a, reason: collision with root package name */
    private LatLng f6044a;

    /* renamed from: b, reason: collision with root package name */
    private BitmapDescriptor f6045b;

    /* renamed from: c, reason: collision with root package name */
    private BmBitmapResource f6046c;

    /* renamed from: i, reason: collision with root package name */
    private float f6052i;

    /* renamed from: j, reason: collision with root package name */
    private TitleOptions f6053j;

    /* renamed from: k, reason: collision with root package name */
    private String f6054k;

    /* renamed from: l, reason: collision with root package name */
    private int f6055l;

    /* renamed from: m, reason: collision with root package name */
    private int f6056m;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<BitmapDescriptor> f6058o;

    /* renamed from: x, reason: collision with root package name */
    private Point f6067x;

    /* renamed from: z, reason: collision with root package name */
    private InfoWindow f6069z;

    /* renamed from: d, reason: collision with root package name */
    private float f6047d = 0.5f;

    /* renamed from: e, reason: collision with root package name */
    private int f6048e = 2;

    /* renamed from: f, reason: collision with root package name */
    private float f6049f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6050g = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6051h = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6057n = false;

    /* renamed from: p, reason: collision with root package name */
    private int f6059p = 20;

    /* renamed from: q, reason: collision with root package name */
    private int f6060q = BDLocation.TypeCoarseLocation;

    /* renamed from: r, reason: collision with root package name */
    private float f6061r = 1.0f;

    /* renamed from: s, reason: collision with root package name */
    private float f6062s = 1.0f;

    /* renamed from: t, reason: collision with root package name */
    private float f6063t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    private int f6064u = 0;

    /* renamed from: v, reason: collision with root package name */
    private int f6065v = MarkerAnimateType.none.ordinal();

    /* renamed from: w, reason: collision with root package name */
    private boolean f6066w = false;

    /* renamed from: y, reason: collision with root package name */
    private boolean f6068y = true;
    private int A = Integer.MAX_VALUE;
    private boolean B = false;
    private int C = 4;
    private int D = 22;
    private boolean E = false;
    private boolean F = false;
    boolean H = true;

    public enum MarkerAnimateType {
        none,
        drop,
        grow,
        jump
    }

    public MarkerOptions alpha(float f8) {
        if (f8 < 0.0f || f8 > 1.0f) {
            this.f6063t = 1.0f;
            return this;
        }
        this.f6063t = f8;
        return this;
    }

    public MarkerOptions anchor(float f8, float f9) {
        if (f8 >= 0.0f && f8 <= 1.0f && f9 >= 0.0f && f9 <= 1.0f) {
            this.f6047d = f8;
            this.f6049f = f9;
        }
        return this;
    }

    public MarkerOptions animateType(MarkerAnimateType markerAnimateType) {
        if (markerAnimateType == null) {
            markerAnimateType = MarkerAnimateType.none;
        }
        this.f6065v = markerAnimateType.ordinal();
        return this;
    }

    public MarkerOptions bitmapResource(BmBitmapResource bmBitmapResource) {
        this.f6046c = bmBitmapResource;
        return this;
    }

    public MarkerOptions clickable(boolean z7) {
        this.f6068y = z7;
        return this;
    }

    public MarkerOptions draggable(boolean z7) {
        this.f6051h = z7;
        return this;
    }

    public MarkerOptions endLevel(int i8) {
        this.D = i8;
        return this;
    }

    public MarkerOptions extraInfo(Bundle bundle) {
        this.I = bundle;
        return this;
    }

    public MarkerOptions fixedScreenPosition(Point point) {
        this.f6067x = point;
        this.f6066w = true;
        return this;
    }

    public MarkerOptions flat(boolean z7) {
        this.f6057n = z7;
        return this;
    }

    public float getAlpha() {
        return this.f6063t;
    }

    public float getAnchorX() {
        return this.f6047d;
    }

    public float getAnchorY() {
        return this.f6049f;
    }

    public MarkerAnimateType getAnimateType() {
        int i8 = this.f6065v;
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? MarkerAnimateType.none : MarkerAnimateType.jump : MarkerAnimateType.grow : MarkerAnimateType.drop;
    }

    public int getEndLevel() {
        return this.D;
    }

    public Bundle getExtraInfo() {
        return this.I;
    }

    public boolean getForceDisPlay() {
        return this.B;
    }

    public int getHeight() {
        return this.f6064u;
    }

    public BitmapDescriptor getIcon() {
        return this.f6045b;
    }

    public ArrayList<BitmapDescriptor> getIcons() {
        return this.f6058o;
    }

    public int getInterval() {
        return this.f6060q;
    }

    public boolean getIsClickable() {
        return this.f6068y;
    }

    public boolean getJoinCollision() {
        return this.E;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    public Overlay getOverlay() {
        Marker marker = new Marker();
        marker.f6034q = this.f6054k;
        marker.f6120d = this.H;
        marker.f6119c = this.G;
        marker.f6121e = this.I;
        LatLng latLng = this.f6044a;
        if (latLng == null) {
            throw new IllegalStateException("BDMapSDKException: when you add marker, you must set the position");
        }
        marker.f6024g = latLng;
        BitmapDescriptor bitmapDescriptor = this.f6045b;
        if (bitmapDescriptor == null && this.f6058o == null && this.f6046c == null) {
            throw new IllegalStateException("BDMapSDKException: when you add marker, you must set the icon or icons");
        }
        marker.f6025h = bitmapDescriptor;
        marker.f6026i = this.f6046c;
        marker.f6029l = this.f6047d;
        marker.f6030m = this.f6049f;
        marker.f6028k = this.f6048e;
        marker.f6031n = this.f6050g;
        marker.f6032o = this.f6051h;
        marker.f6033p = this.f6052i;
        marker.f6035r = this.f6053j;
        marker.f6037t = this.f6055l;
        marker.f6038u = this.f6056m;
        marker.f6039v = this.f6057n;
        marker.G = this.f6058o;
        marker.J = this.f6059p;
        marker.F = this.f6060q;
        marker.f6041x = this.f6063t;
        marker.E = this.f6064u;
        marker.L = this.f6061r;
        marker.M = this.f6062s;
        marker.f6042y = this.f6065v;
        marker.f6043z = this.f6066w;
        marker.P = this.f6069z;
        marker.A = this.f6068y;
        marker.S = this.A;
        marker.D = this.B;
        marker.U = this.C;
        marker.V = this.D;
        marker.B = this.E;
        marker.C = this.F;
        Point point = this.f6067x;
        if (point != null) {
            marker.O = point;
        }
        return marker;
    }

    public int getPeriod() {
        return this.f6059p;
    }

    public LatLng getPosition() {
        return this.f6044a;
    }

    public int getPriority() {
        return this.A;
    }

    public float getRotate() {
        return this.f6052i;
    }

    public int getStartLevel() {
        return this.C;
    }

    @Deprecated
    public String getTitle() {
        return this.f6054k;
    }

    public TitleOptions getTitleOptions() {
        return this.f6053j;
    }

    public int getZIndex() {
        return this.G;
    }

    public MarkerOptions height(int i8) {
        if (i8 < 0) {
            this.f6064u = 0;
            return this;
        }
        this.f6064u = i8;
        return this;
    }

    public MarkerOptions icon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("BDMapSDKException: marker's icon can not be null");
        }
        this.f6045b = bitmapDescriptor;
        return this;
    }

    public MarkerOptions icons(ArrayList<BitmapDescriptor> arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("BDMapSDKException: marker's icons can not be null");
        }
        if (arrayList.isEmpty()) {
            return this;
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (arrayList.get(i8) == null || arrayList.get(i8).f5702a == null) {
                return this;
            }
        }
        this.f6058o = arrayList;
        return this;
    }

    public MarkerOptions infoWindow(InfoWindow infoWindow) {
        this.f6069z = infoWindow;
        return this;
    }

    public MarkerOptions interval(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("BDMapSDKException: marker's interval must be greater than zero ");
        }
        this.f6060q = i8;
        return this;
    }

    public boolean isDraggable() {
        return this.f6051h;
    }

    public boolean isFlat() {
        return this.f6057n;
    }

    public MarkerOptions isForceDisPlay(boolean z7) {
        this.B = z7;
        return this;
    }

    public MarkerOptions isJoinCollision(boolean z7) {
        this.E = z7;
        return this;
    }

    public boolean isPerspective() {
        return this.f6050g;
    }

    public boolean isPoiCollided() {
        return this.F;
    }

    public boolean isVisible() {
        return this.H;
    }

    public MarkerOptions period(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("BDMapSDKException: marker's period must be greater than zero ");
        }
        this.f6059p = i8;
        return this;
    }

    public MarkerOptions perspective(boolean z7) {
        this.f6050g = z7;
        return this;
    }

    public MarkerOptions poiCollided(boolean z7) {
        this.F = z7;
        return this;
    }

    public MarkerOptions position(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: marker's position can not be null");
        }
        this.f6044a = latLng;
        return this;
    }

    public MarkerOptions priority(int i8) {
        this.A = i8;
        return this;
    }

    public MarkerOptions rotate(float f8) {
        while (f8 < 0.0f) {
            f8 += 360.0f;
        }
        this.f6052i = f8 % 360.0f;
        return this;
    }

    public MarkerOptions scaleX(float f8) {
        if (f8 < 0.0f) {
            return this;
        }
        this.f6061r = f8;
        return this;
    }

    public MarkerOptions scaleY(float f8) {
        if (f8 < 0.0f) {
            return this;
        }
        this.f6062s = f8;
        return this;
    }

    public MarkerOptions startLevel(int i8) {
        this.C = i8;
        return this;
    }

    public MarkerOptions title(String str) {
        this.f6054k = str;
        return this;
    }

    public MarkerOptions titleOptions(TitleOptions titleOptions) {
        this.f6053j = titleOptions;
        return this;
    }

    public MarkerOptions visible(boolean z7) {
        this.H = z7;
        return this;
    }

    public MarkerOptions xOffset(int i8) {
        this.f6056m = i8;
        return this;
    }

    public MarkerOptions yOffset(int i8) {
        this.f6055l = i8;
        return this;
    }

    public MarkerOptions zIndex(int i8) {
        this.G = i8;
        return this;
    }
}
