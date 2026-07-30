package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public final class ArcOptions extends OverlayOptions {

    /* renamed from: d, reason: collision with root package name */
    private LatLng f5522d;

    /* renamed from: e, reason: collision with root package name */
    private LatLng f5523e;

    /* renamed from: f, reason: collision with root package name */
    private LatLng f5524f;

    /* renamed from: g, reason: collision with root package name */
    int f5525g;

    /* renamed from: i, reason: collision with root package name */
    Bundle f5527i;

    /* renamed from: a, reason: collision with root package name */
    private int f5519a = -16777216;

    /* renamed from: b, reason: collision with root package name */
    private int f5520b = 5;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5521c = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f5526h = true;

    public ArcOptions color(int i8) {
        this.f5519a = i8;
        return this;
    }

    public ArcOptions extraInfo(Bundle bundle) {
        this.f5527i = bundle;
        return this;
    }

    public int getColor() {
        return this.f5519a;
    }

    public LatLng getEndPoint() {
        return this.f5524f;
    }

    public Bundle getExtraInfo() {
        return this.f5527i;
    }

    public LatLng getMiddlePoint() {
        return this.f5523e;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        Arc arc = new Arc();
        arc.f6120d = this.f5526h;
        arc.f6119c = this.f5525g;
        arc.f6121e = this.f5527i;
        arc.f5505g = this.f5519a;
        arc.f5506h = this.f5520b;
        arc.f5507i = this.f5522d;
        arc.f5508j = this.f5523e;
        arc.f5509k = this.f5524f;
        arc.f5510l = this.f5521c;
        return arc;
    }

    public LatLng getStartPoint() {
        return this.f5522d;
    }

    public int getWidth() {
        return this.f5520b;
    }

    public int getZIndex() {
        return this.f5525g;
    }

    public boolean isVisible() {
        return this.f5526h;
    }

    public ArcOptions points(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng == null || latLng2 == null || latLng3 == null) {
            throw new IllegalArgumentException("BDMapSDKException: start and middle and end points can not be null");
        }
        if (latLng == latLng2 || latLng == latLng3 || latLng2 == latLng3) {
            throw new IllegalArgumentException("BDMapSDKException: start and middle and end points can not be same");
        }
        this.f5522d = latLng;
        this.f5523e = latLng2;
        this.f5524f = latLng3;
        return this;
    }

    public ArcOptions setClickable(boolean z7) {
        this.f5521c = z7;
        return this;
    }

    public ArcOptions visible(boolean z7) {
        this.f5526h = z7;
        return this;
    }

    public ArcOptions width(int i8) {
        if (i8 > 0) {
            this.f5520b = i8;
        }
        return this;
    }

    public ArcOptions zIndex(int i8) {
        this.f5525g = i8;
        return this;
    }
}
