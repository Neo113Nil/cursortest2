package com.baidu.mapapi.map;

import com.baidu.mapsdkplatform.comapi.map.r;
import com.baidu.platform.comapi.map.MapSurfaceView;
import com.baidu.platform.comapi.map.MapTextureView;

/* loaded from: classes2.dex */
public final class NaviMapExpand {

    /* renamed from: a, reason: collision with root package name */
    private final com.baidu.mapsdkplatform.comapi.map.b f6111a;

    /* renamed from: b, reason: collision with root package name */
    private final r f6112b;

    /* renamed from: c, reason: collision with root package name */
    private final MapView f6113c;

    /* renamed from: d, reason: collision with root package name */
    private final MapSurfaceView f6114d;

    /* renamed from: e, reason: collision with root package name */
    private final TextureMapView f6115e;

    /* renamed from: f, reason: collision with root package name */
    private final MapTextureView f6116f;

    public NaviMapExpand(com.baidu.mapsdkplatform.comapi.map.b bVar, r rVar, MapView mapView, MapSurfaceView mapSurfaceView, TextureMapView textureMapView, MapTextureView mapTextureView) {
        this.f6111a = bVar;
        this.f6112b = rVar;
        this.f6113c = mapView;
        this.f6114d = mapSurfaceView;
        this.f6115e = textureMapView;
        this.f6116f = mapTextureView;
    }

    public void setMapLanguage(MapLanguage mapLanguage, boolean z7) {
        TextureMapView textureMapView;
        MapTextureView mapTextureView;
        MapView mapView;
        MapSurfaceView mapSurfaceView;
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f6111a;
        if (bVar != null) {
            bVar.a(mapLanguage.ordinal(), z7);
            com.baidu.mapsdkplatform.comapi.map.b bVar2 = this.f6111a;
            MapLanguage mapLanguage2 = MapLanguage.ENGLISH;
            bVar2.G(mapLanguage != mapLanguage2);
            r rVar = this.f6112b;
            if (rVar == r.GLSurfaceView && (mapView = this.f6113c) != null && (mapSurfaceView = this.f6114d) != null) {
                mapView.updateScaleUI(mapSurfaceView.getZoomLevel());
            } else if (rVar == r.TextureView && (textureMapView = this.f6115e) != null && (mapTextureView = this.f6116f) != null) {
                textureMapView.updateScaleUI(mapTextureView.getZoomLevel());
            }
            if (mapLanguage == mapLanguage2 || this.f6111a.v()) {
                return;
            }
            this.f6111a.r(false);
        }
    }
}
