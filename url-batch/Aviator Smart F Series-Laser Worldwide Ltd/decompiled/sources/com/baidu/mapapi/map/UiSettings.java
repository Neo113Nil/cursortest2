package com.baidu.mapapi.map;

import android.graphics.Point;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public final class UiSettings {

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.map.b f6428a;

    UiSettings(com.baidu.mapsdkplatform.comapi.map.b bVar) {
        this.f6428a = bVar;
    }

    public boolean isCompassEnabled() {
        return this.f6428a.k();
    }

    public boolean isOverlookingGesturesEnabled() {
        return this.f6428a.N();
    }

    public boolean isRotateGesturesEnabled() {
        return this.f6428a.O();
    }

    public boolean isScrollGesturesEnabled() {
        return this.f6428a.Q();
    }

    public boolean isZoomGesturesEnabled() {
        return this.f6428a.S();
    }

    public void setAllGesturesEnabled(boolean z7) {
        setRotateGesturesEnabled(z7);
        setScrollGesturesEnabled(z7);
        setOverlookingGesturesEnabled(z7);
        setZoomGesturesEnabled(z7);
        setDoubleClickZoomEnabled(z7);
        setTwoTouchClickZoomEnabled(z7);
        setDoubleClickMoveZoomEnable(z7);
    }

    public void setCompassEnabled(boolean z7) {
        this.f6428a.f(z7);
    }

    public void setDoubleClickGesturesCenter(boolean z7) {
        this.f6428a.i(z7);
    }

    public void setDoubleClickMoveZoomEnable(boolean z7) {
        this.f6428a.j(z7);
    }

    public void setDoubleClickZoomEnabled(boolean z7) {
        this.f6428a.k(z7);
    }

    public void setEnlargeCenterWithDoubleClickEnable(boolean z7) {
        this.f6428a.l(z7);
    }

    public void setFlingEnable(boolean z7) {
        this.f6428a.m(z7);
    }

    public void setInertialAnimation(boolean z7) {
        this.f6428a.p(z7);
    }

    public void setLatLngGesturesCenter(LatLng latLng) {
        this.f6428a.a(latLng);
    }

    public void setOverlookingGesturesEnabled(boolean z7) {
        this.f6428a.u(z7);
    }

    public void setPointGesturesCenter(Point point) {
        this.f6428a.b(point);
    }

    public void setRotateGesturesEnabled(boolean z7) {
        this.f6428a.v(z7);
    }

    public void setScrollGesturesEnabled(boolean z7) {
        this.f6428a.y(z7);
    }

    public void setTwoTouchClickZoomEnabled(boolean z7) {
        this.f6428a.A(z7);
    }

    public void setZoomGesturesEnabled(boolean z7) {
        this.f6428a.B(z7);
    }
}
