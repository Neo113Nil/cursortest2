package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public final class DotOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f5778a;

    /* renamed from: d, reason: collision with root package name */
    int f5781d;

    /* renamed from: f, reason: collision with root package name */
    Bundle f5783f;

    /* renamed from: b, reason: collision with root package name */
    private int f5779b = -16777216;

    /* renamed from: c, reason: collision with root package name */
    private int f5780c = 5;

    /* renamed from: e, reason: collision with root package name */
    boolean f5782e = true;

    public DotOptions center(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: dot center can not be null");
        }
        this.f5778a = latLng;
        return this;
    }

    public DotOptions color(int i8) {
        this.f5779b = i8;
        return this;
    }

    public DotOptions extraInfo(Bundle bundle) {
        this.f5783f = bundle;
        return this;
    }

    public LatLng getCenter() {
        return this.f5778a;
    }

    public int getColor() {
        return this.f5779b;
    }

    public Bundle getExtraInfo() {
        return this.f5783f;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        Dot dot = new Dot();
        dot.f6120d = this.f5782e;
        dot.f6119c = this.f5781d;
        dot.f6121e = this.f5783f;
        dot.f5776h = this.f5779b;
        dot.f5775g = this.f5778a;
        dot.f5777i = this.f5780c;
        return dot;
    }

    public int getRadius() {
        return this.f5780c;
    }

    public int getZIndex() {
        return this.f5781d;
    }

    public boolean isVisible() {
        return this.f5782e;
    }

    public DotOptions radius(int i8) {
        if (i8 > 0) {
            this.f5780c = i8;
        }
        return this;
    }

    public DotOptions visible(boolean z7) {
        this.f5782e = z7;
        return this;
    }

    public DotOptions zIndex(int i8) {
        this.f5781d = i8;
        return this;
    }
}
