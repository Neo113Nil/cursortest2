package com.baidu.mapapi.map;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class ItemizedOverlay extends Overlay {

    /* renamed from: g, reason: collision with root package name */
    MapView f5922g;

    public ItemizedOverlay(Drawable drawable, MapView mapView) {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.marker;
        this.f5922g = mapView;
    }

    public void addItem(OverlayOptions overlayOptions) {
        if (overlayOptions != null) {
            this.f5922g.getMap().addOverlay(overlayOptions);
        }
    }

    public void reAddAll() {
    }

    public void removeAll() {
        this.f5922g.getMap().clear();
    }
}
