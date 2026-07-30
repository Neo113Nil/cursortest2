package com.baidu.mapapi.map;

import android.view.View;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class InfoWindow {

    /* renamed from: a, reason: collision with root package name */
    String f5907a;

    /* renamed from: b, reason: collision with root package name */
    BitmapDescriptor f5908b;

    /* renamed from: c, reason: collision with root package name */
    View f5909c;

    /* renamed from: d, reason: collision with root package name */
    LatLng f5910d;

    /* renamed from: e, reason: collision with root package name */
    boolean f5911e;

    /* renamed from: f, reason: collision with root package name */
    int f5912f;

    /* renamed from: g, reason: collision with root package name */
    int f5913g;

    /* renamed from: h, reason: collision with root package name */
    OnInfoWindowClickListener f5914h;

    /* renamed from: i, reason: collision with root package name */
    a f5915i;

    /* renamed from: j, reason: collision with root package name */
    int f5916j;

    /* renamed from: k, reason: collision with root package name */
    boolean f5917k;

    /* renamed from: l, reason: collision with root package name */
    int f5918l;

    /* renamed from: m, reason: collision with root package name */
    boolean f5919m;

    /* renamed from: n, reason: collision with root package name */
    boolean f5920n;

    /* renamed from: o, reason: collision with root package name */
    boolean f5921o;

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick();
    }

    interface a {
        void a(InfoWindow infoWindow);

        void b(InfoWindow infoWindow);
    }

    public InfoWindow(View view, LatLng latLng, int i8) {
        this.f5907a = "";
        this.f5911e = false;
        this.f5917k = false;
        this.f5918l = SysOSUtil.getDensityDpi();
        this.f5919m = false;
        this.f5920n = false;
        this.f5921o = false;
        if (view == null || latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: view and position can not be null");
        }
        this.f5909c = view;
        this.f5910d = latLng;
        this.f5916j = i8;
        this.f5920n = true;
    }

    public BitmapDescriptor getBitmapDescriptor() {
        return this.f5908b;
    }

    public LatLng getPosition() {
        return this.f5910d;
    }

    public String getTag() {
        return this.f5907a;
    }

    public View getView() {
        return this.f5909c;
    }

    public int getYOffset() {
        return this.f5916j;
    }

    public void setBitmapDescriptor(BitmapDescriptor bitmapDescriptor) {
        a aVar;
        if (bitmapDescriptor == null || (aVar = this.f5915i) == null) {
            return;
        }
        this.f5908b = bitmapDescriptor;
        aVar.b(this);
    }

    public void setPosition(LatLng latLng) {
        a aVar;
        if (latLng == null || (aVar = this.f5915i) == null) {
            return;
        }
        this.f5910d = latLng;
        aVar.b(this);
    }

    public void setScreenPosition(int i8, int i9) {
        this.f5911e = true;
        this.f5912f = i8;
        this.f5913g = i9;
    }

    public void setTag(String str) {
        this.f5907a = str;
    }

    public void setView(View view) {
        a aVar;
        if (view == null || (aVar = this.f5915i) == null) {
            return;
        }
        this.f5909c = view;
        aVar.b(this);
    }

    public void setYOffset(int i8) {
        a aVar = this.f5915i;
        if (aVar == null) {
            return;
        }
        this.f5916j = i8;
        aVar.b(this);
    }

    public InfoWindow(BitmapDescriptor bitmapDescriptor, LatLng latLng, int i8, OnInfoWindowClickListener onInfoWindowClickListener) {
        this.f5907a = "";
        this.f5911e = false;
        this.f5917k = false;
        this.f5918l = SysOSUtil.getDensityDpi();
        this.f5919m = false;
        this.f5920n = false;
        this.f5921o = false;
        if (bitmapDescriptor == null || latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: bitmapDescriptor and position can not be null");
        }
        this.f5908b = bitmapDescriptor;
        this.f5910d = latLng;
        this.f5914h = onInfoWindowClickListener;
        this.f5916j = i8;
        this.f5921o = true;
    }

    public InfoWindow(View view, LatLng latLng, int i8, boolean z7, int i9) {
        this.f5907a = "";
        this.f5911e = false;
        this.f5917k = false;
        this.f5918l = SysOSUtil.getDensityDpi();
        this.f5919m = false;
        this.f5920n = false;
        this.f5921o = false;
        if (view == null || latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: view and position can not be null");
        }
        this.f5909c = view;
        this.f5910d = latLng;
        this.f5916j = i8;
        this.f5917k = z7;
        this.f5918l = i9;
        this.f5920n = true;
    }
}
