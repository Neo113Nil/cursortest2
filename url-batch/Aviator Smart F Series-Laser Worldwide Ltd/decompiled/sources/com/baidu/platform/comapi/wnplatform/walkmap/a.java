package com.baidu.platform.comapi.wnplatform.walkmap;

import android.graphics.Point;
import android.os.Bundle;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapView;
import com.baidu.platform.comapi.h.t.f;
import java.lang.ref.SoftReference;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    SoftReference<MapView> f10544a = null;

    /* renamed from: b, reason: collision with root package name */
    private BaiduMap f10545b;

    /* renamed from: c, reason: collision with root package name */
    private WNaviBaiduMap f10546c;

    /* renamed from: d, reason: collision with root package name */
    private e f10547d;

    /* renamed from: com.baidu.platform.comapi.wnplatform.walkmap.a$a, reason: collision with other inner class name */
    class C0141a implements BaiduMap.OnMapStatusChangeListener {
        C0141a() {
        }

        @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
        public void onMapStatusChange(MapStatus mapStatus) {
        }

        @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
        public void onMapStatusChangeFinish(MapStatus mapStatus) {
            if (a.this.f10547d == null) {
                return;
            }
            a.this.f10547d.a();
        }

        @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
        public void onMapStatusChangeStart(MapStatus mapStatus) {
        }

        @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
        public void onMapStatusChangeStart(MapStatus mapStatus, int i8) {
        }
    }

    public a(MapView mapView) {
        a(mapView);
    }

    public void a() {
        this.f10544a = null;
    }

    public MapStatus b() {
        return this.f10545b.getMapStatus();
    }

    public float c() {
        return 0.0f;
    }

    public void d() {
    }

    public void e() {
        this.f10544a = null;
    }

    public void a(MapView mapView) {
        SoftReference<MapView> softReference = new SoftReference<>(mapView);
        this.f10544a = softReference;
        this.f10545b = softReference.get().getMap();
        this.f10546c = WNaviBaiduMap.getInstance();
    }

    public void a(MapStatusUpdate mapStatusUpdate) {
        this.f10545b.setMapStatus(mapStatusUpdate);
    }

    public void a(e eVar) {
        this.f10547d = eVar;
        this.f10545b.setOnMapStatusChangeListener(new C0141a());
    }

    public void a(MapStatus mapStatus, int i8) {
        this.f10545b.animateMapStatus(f.a(mapStatus), i8);
    }

    public void a(int i8, int i9) {
        this.f10545b.setCompassPosition(new Point(i8, i9));
    }

    public float a(Bundle bundle, int i8, int i9) {
        return this.f10546c.getZoomToBound(bundle, i8, i9);
    }

    public void a(boolean z7) {
        WNaviBaiduMap.showMapPoi(z7);
    }
}
