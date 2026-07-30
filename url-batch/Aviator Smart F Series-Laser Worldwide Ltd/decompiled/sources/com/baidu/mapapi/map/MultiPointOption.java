package com.baidu.mapapi.map;

import java.util.List;

/* loaded from: classes2.dex */
public final class MultiPointOption extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private List<MultiPointItem> f6081a;

    /* renamed from: b, reason: collision with root package name */
    private BitmapDescriptor f6082b;

    /* renamed from: c, reason: collision with root package name */
    private int f6083c;

    /* renamed from: d, reason: collision with root package name */
    private int f6084d;

    /* renamed from: e, reason: collision with root package name */
    private float f6085e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    private float f6086f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6087g = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6088h = true;

    public float getAnchorX() {
        return this.f6085e;
    }

    public float getAnchorY() {
        return this.f6086f;
    }

    public BitmapDescriptor getIcon() {
        return this.f6082b;
    }

    public List<MultiPointItem> getMultiPointItems() {
        return this.f6081a;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        MultiPoint multiPoint = new MultiPoint();
        multiPoint.f6072h = this.f6082b;
        List<MultiPointItem> list = this.f6081a;
        if (list == null) {
            throw new IllegalStateException("BDMapSDKException: when you add mMultiPointItems, you must set the mMultiPointItems");
        }
        multiPoint.f6071g = list;
        multiPoint.f6074j = this.f6084d;
        multiPoint.f6073i = this.f6083c;
        multiPoint.f6075k = this.f6085e;
        multiPoint.f6076l = this.f6086f;
        multiPoint.f6120d = this.f6087g;
        multiPoint.f6077m = this.f6088h;
        return multiPoint;
    }

    public int getPointSizeHeight() {
        return this.f6084d;
    }

    public int getPointSizeWidth() {
        return this.f6083c;
    }

    public boolean isVisible() {
        return this.f6087g;
    }

    public MultiPointOption setAnchor(float f8, float f9) {
        if (f8 >= 0.0f && f8 <= 1.0f && f9 >= 0.0f && f9 <= 1.0f) {
            this.f6085e = f8;
            this.f6086f = f9;
        }
        return this;
    }

    public MultiPointOption setClickable(boolean z7) {
        this.f6088h = z7;
        return this;
    }

    public MultiPointOption setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("BDMapSDKException: MultiPoint icon can not be null");
        }
        if (this.f6083c == 0) {
            this.f6083c = bitmapDescriptor.getBitmap().getWidth();
        }
        if (this.f6084d == 0) {
            this.f6084d = bitmapDescriptor.getBitmap().getHeight();
        }
        this.f6082b = bitmapDescriptor;
        return this;
    }

    public MultiPointOption setMultiPointItems(List<MultiPointItem> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: multiPointItems list can not be null");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: multiPointItems list can not contains null");
        }
        this.f6081a = list;
        return this;
    }

    public MultiPointOption setPointSize(int i8, int i9) {
        if (this.f6083c <= 0 || this.f6084d <= 0) {
            throw new IllegalArgumentException("BDMapSDKException: MultiPoint setPointSize can not be 0 Or can't less than 0");
        }
        this.f6083c = i8;
        this.f6084d = i9;
        return this;
    }

    public MultiPointOption visible(boolean z7) {
        this.f6087g = z7;
        return this;
    }
}
