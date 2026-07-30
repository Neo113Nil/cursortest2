package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;

/* loaded from: classes2.dex */
public final class GroundOverlayOptions extends OverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private BitmapDescriptor f5816a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f5817b;

    /* renamed from: c, reason: collision with root package name */
    private int f5818c;

    /* renamed from: d, reason: collision with root package name */
    private int f5819d;

    /* renamed from: g, reason: collision with root package name */
    private LatLngBounds f5822g;

    /* renamed from: j, reason: collision with root package name */
    int f5825j;

    /* renamed from: l, reason: collision with root package name */
    Bundle f5827l;

    /* renamed from: e, reason: collision with root package name */
    private float f5820e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    private float f5821f = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    private float f5823h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5824i = false;

    /* renamed from: k, reason: collision with root package name */
    boolean f5826k = true;

    public GroundOverlayOptions anchor(float f8, float f9) {
        if (f8 >= 0.0f && f8 <= 1.0f && f9 >= 0.0f && f9 <= 1.0f) {
            this.f5820e = f8;
            this.f5821f = f9;
        }
        return this;
    }

    public GroundOverlayOptions dimensions(int i8) {
        if (i8 <= 0) {
            this.f5818c = 0;
            this.f5819d = 0;
            return this;
        }
        this.f5818c = i8;
        this.f5819d = Integer.MAX_VALUE;
        return this;
    }

    public GroundOverlayOptions extraInfo(Bundle bundle) {
        this.f5827l = bundle;
        return this;
    }

    public float getAnchorX() {
        return this.f5820e;
    }

    public float getAnchorY() {
        return this.f5821f;
    }

    public LatLngBounds getBounds() {
        return this.f5822g;
    }

    public Bundle getExtraInfo() {
        return this.f5827l;
    }

    public int getHeight() {
        int i8 = this.f5819d;
        return i8 == Integer.MAX_VALUE ? (int) ((this.f5818c * this.f5816a.f5702a.getHeight()) / this.f5816a.f5702a.getWidth()) : i8;
    }

    public BitmapDescriptor getImage() {
        return this.f5816a;
    }

    @Override // com.baidu.mapapi.map.OverlayOptions
    Overlay getOverlay() {
        LatLng latLng;
        int i8;
        GroundOverlay groundOverlay = new GroundOverlay();
        groundOverlay.f6120d = this.f5826k;
        groundOverlay.f6119c = this.f5825j;
        groundOverlay.f6121e = this.f5827l;
        BitmapDescriptor bitmapDescriptor = this.f5816a;
        if (bitmapDescriptor == null) {
            throw new IllegalStateException("BDMapSDKException: when you add ground overlay, you must set the image");
        }
        groundOverlay.f5806h = bitmapDescriptor;
        LatLngBounds latLngBounds = this.f5822g;
        if (latLngBounds == null && (latLng = this.f5817b) != null) {
            int i9 = this.f5818c;
            if (i9 <= 0 || (i8 = this.f5819d) <= 0) {
                throw new IllegalArgumentException("BDMapSDKException: when you add ground overlay, the width and height must greater than 0");
            }
            groundOverlay.f5807i = latLng;
            groundOverlay.f5810l = this.f5820e;
            groundOverlay.f5811m = this.f5821f;
            groundOverlay.f5808j = i9;
            groundOverlay.f5809k = i8;
            groundOverlay.f5805g = 2;
        } else {
            if (this.f5817b != null || latLngBounds == null) {
                throw new IllegalStateException("BDMapSDKException: when you add ground overlay, you must set one of position or bounds");
            }
            groundOverlay.f5812n = latLngBounds;
            groundOverlay.f5805g = 1;
        }
        groundOverlay.f5813o = this.f5823h;
        groundOverlay.f5815q = this.f5824i;
        return groundOverlay;
    }

    public LatLng getPosition() {
        return this.f5817b;
    }

    public float getTransparency() {
        return this.f5823h;
    }

    public int getWidth() {
        return this.f5818c;
    }

    public int getZIndex() {
        return this.f5825j;
    }

    public GroundOverlayOptions image(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("BDMapSDKException: image can not be null");
        }
        this.f5816a = bitmapDescriptor;
        return this;
    }

    public boolean isVisible() {
        return this.f5826k;
    }

    public GroundOverlayOptions position(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: position can not be null");
        }
        this.f5817b = latLng;
        return this;
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            throw new IllegalArgumentException("BDMapSDKException: bounds can not be null");
        }
        this.f5822g = latLngBounds;
        return this;
    }

    public GroundOverlayOptions setClickable(boolean z7) {
        this.f5824i = z7;
        return this;
    }

    public GroundOverlayOptions transparency(float f8) {
        if (f8 <= 1.0f && f8 >= 0.0f) {
            this.f5823h = f8;
        }
        return this;
    }

    public GroundOverlayOptions visible(boolean z7) {
        this.f5826k = z7;
        return this;
    }

    public GroundOverlayOptions zIndex(int i8) {
        this.f5825j = i8;
        return this;
    }

    public GroundOverlayOptions dimensions(int i8, int i9) {
        if (i8 <= 0 || i9 <= 0) {
            this.f5818c = 0;
            this.f5819d = 0;
            return this;
        }
        this.f5818c = i8;
        this.f5819d = i9;
        return this;
    }
}
