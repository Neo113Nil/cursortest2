package com.baidu.mapapi.map;

import android.os.Bundle;
import android.util.Log;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.platform.comapi.basestruct.GeoPoint;

/* loaded from: classes2.dex */
public final class TileOverlayOptions {

    /* renamed from: a, reason: collision with root package name */
    private static Bundle f6386a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final String f6387b = "TileOverlayOptions";

    /* renamed from: d, reason: collision with root package name */
    private TileProvider f6389d;
    public int datasource;
    public String urlString;

    /* renamed from: c, reason: collision with root package name */
    private int f6388c = 209715200;

    /* renamed from: e, reason: collision with root package name */
    private int f6390e = 20;

    /* renamed from: f, reason: collision with root package name */
    private int f6391f = 3;

    /* renamed from: g, reason: collision with root package name */
    private int f6392g = 15786414;

    /* renamed from: h, reason: collision with root package name */
    private int f6393h = -20037726;

    /* renamed from: i, reason: collision with root package name */
    private int f6394i = -15786414;

    /* renamed from: j, reason: collision with root package name */
    private int f6395j = 20037726;

    public TileOverlayOptions() {
        Bundle bundle = new Bundle();
        f6386a = bundle;
        bundle.putInt("rectr", this.f6392g);
        f6386a.putInt("rectb", this.f6393h);
        f6386a.putInt("rectl", this.f6394i);
        f6386a.putInt("rectt", this.f6395j);
    }

    private TileOverlayOptions a(int i8, int i9) {
        this.f6390e = i8;
        this.f6391f = i9;
        return this;
    }

    public TileOverlayOptions setMaxTileTmp(int i8) {
        this.f6388c = i8;
        return this;
    }

    public TileOverlayOptions setPositionFromBounds(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            throw new IllegalArgumentException("BDMapSDKException: bound can not be null");
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLngBounds.northeast);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(latLngBounds.southwest);
        double latitudeE6 = ll2mc.getLatitudeE6();
        double longitudeE6 = ll2mc2.getLongitudeE6();
        double latitudeE62 = ll2mc2.getLatitudeE6();
        double longitudeE62 = ll2mc.getLongitudeE6();
        if (latitudeE6 <= latitudeE62 || longitudeE62 <= longitudeE6) {
            Log.e(f6387b, "BDMapSDKException: bounds is illegal, use default bounds");
        } else {
            f6386a.putInt("rectr", (int) longitudeE62);
            f6386a.putInt("rectb", (int) latitudeE62);
            f6386a.putInt("rectl", (int) longitudeE6);
            f6386a.putInt("rectt", (int) latitudeE6);
        }
        return this;
    }

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        if (tileProvider == null) {
            return null;
        }
        if (tileProvider instanceof UrlTileProvider) {
            this.datasource = 1;
            String tileUrl = ((UrlTileProvider) tileProvider).getTileUrl();
            if (tileUrl == null || "".equals(tileUrl) || !tileUrl.contains("{x}") || !tileUrl.contains("{y}") || !tileUrl.contains("{z}")) {
                Log.e(f6387b, "tile url template is illegal, must contains {x}、{y}、{z}");
                return null;
            }
            this.urlString = tileUrl;
        } else {
            if (!(tileProvider instanceof FileTileProvider)) {
                Log.e(f6387b, "tileProvider must be UrlTileProvider or FileTileProvider");
                return null;
            }
            this.datasource = 0;
        }
        this.f6389d = tileProvider;
        int maxDisLevel = tileProvider.getMaxDisLevel();
        int minDisLevel = tileProvider.getMinDisLevel();
        if (maxDisLevel > 21 || minDisLevel < 3) {
            Log.e(f6387b, "display level is illegal");
        } else {
            a(maxDisLevel, minDisLevel);
        }
        return this;
    }

    TileOverlay a(BaiduMap baiduMap) {
        return new TileOverlay(baiduMap, this.f6389d);
    }

    Bundle a() {
        f6386a.putString("url", this.urlString);
        f6386a.putInt("datasource", this.datasource);
        f6386a.putInt("maxDisplay", this.f6390e);
        f6386a.putInt("minDisplay", this.f6391f);
        f6386a.putInt("sdktiletmpmax", this.f6388c);
        return f6386a;
    }
}
