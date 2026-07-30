package com.baidu.mapapi.map;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public class PrismOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private float f6235a;

    /* renamed from: b, reason: collision with root package name */
    private List<LatLng> f6236b;

    /* renamed from: e, reason: collision with root package name */
    private BitmapDescriptor f6239e;

    /* renamed from: g, reason: collision with root package name */
    int f6241g;

    /* renamed from: h, reason: collision with root package name */
    int f6242h;

    /* renamed from: c, reason: collision with root package name */
    private int f6237c = -16777216;

    /* renamed from: d, reason: collision with root package name */
    private int f6238d = -16777216;

    /* renamed from: f, reason: collision with root package name */
    boolean f6240f = true;

    public PrismOptions customSideImage(BitmapDescriptor bitmapDescriptor) {
        this.f6239e = bitmapDescriptor;
        return this;
    }

    public BitmapDescriptor getCustomSideImage() {
        return this.f6239e;
    }

    public float getHeight() {
        return this.f6235a;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        Prism prism = new Prism();
        prism.f6120d = this.f6240f;
        prism.f6119c = this.f6241g;
        prism.f6232n = this.f6239e;
        prism.f6225g = this.f6235a;
        List<LatLng> list = this.f6236b;
        if (list == null || list.size() <= 3) {
            throw new IllegalStateException("BDMapSDKException: when you add prism, you must at least supply 4 points");
        }
        prism.f6228j = this.f6236b;
        prism.f6231m = this.f6238d;
        prism.f6230l = this.f6237c;
        return prism;
    }

    public List<LatLng> getPoints() {
        return this.f6236b;
    }

    public int getShowLevel() {
        return this.f6242h;
    }

    public int getSideFaceColor() {
        return this.f6238d;
    }

    public int getTopFaceColor() {
        return this.f6237c;
    }

    public int getZIndex() {
        return this.f6241g;
    }

    public boolean isVisible() {
        return this.f6240f;
    }

    public PrismOptions setHeight(float f8) {
        this.f6235a = f8;
        return this;
    }

    public PrismOptions setPoints(List<LatLng> list) {
        this.f6236b = list;
        return this;
    }

    public PrismOptions setShowLevel(int i8) {
        this.f6242h = i8;
        return this;
    }

    public PrismOptions setSideFaceColor(int i8) {
        this.f6238d = i8;
        return this;
    }

    public PrismOptions setTopFaceColor(int i8) {
        this.f6237c = i8;
        return this;
    }

    public PrismOptions visible(boolean z7) {
        this.f6240f = z7;
        return this;
    }

    public PrismOptions zIndex(int i8) {
        this.f6241g = i8;
        return this;
    }
}
