package com.baidu.mapapi.favorite;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.favrite.FavSyncPoi;
import com.baidu.platform.comapi.basestruct.Point;
import com.moyoung.dafit.module.common.utils.u;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class a {
    static FavSyncPoi a(FavoritePoiInfo favoritePoiInfo) {
        String str;
        if (favoritePoiInfo == null || favoritePoiInfo.f5443c == null || (str = favoritePoiInfo.f5442b) == null || str.equals("")) {
            return null;
        }
        FavSyncPoi favSyncPoi = new FavSyncPoi();
        favSyncPoi.f8018b = favoritePoiInfo.f5442b;
        LatLng latLng = favoritePoiInfo.f5443c;
        favSyncPoi.f8019c = new Point((int) (latLng.longitude * 1000000.0d), (int) (latLng.latitude * 1000000.0d));
        favSyncPoi.f8020d = favoritePoiInfo.f5444d;
        favSyncPoi.f8021e = favoritePoiInfo.f5445e;
        favSyncPoi.f8022f = favoritePoiInfo.f5446f;
        favSyncPoi.f8025i = false;
        return favSyncPoi;
    }

    static FavoritePoiInfo a(FavSyncPoi favSyncPoi) {
        if (favSyncPoi == null || favSyncPoi.f8019c == null || favSyncPoi.f8018b.equals("")) {
            return null;
        }
        FavoritePoiInfo favoritePoiInfo = new FavoritePoiInfo();
        favoritePoiInfo.f5441a = favSyncPoi.f8017a;
        favoritePoiInfo.f5442b = favSyncPoi.f8018b;
        Point point = favSyncPoi.f8019c;
        favoritePoiInfo.f5443c = new LatLng(point.f8790y / 1000000.0d, point.f8789x / 1000000.0d);
        favoritePoiInfo.f5445e = favSyncPoi.f8021e;
        favoritePoiInfo.f5446f = favSyncPoi.f8022f;
        favoritePoiInfo.f5444d = favSyncPoi.f8020d;
        favoritePoiInfo.f5447g = Long.parseLong(favSyncPoi.f8024h);
        return favoritePoiInfo;
    }

    static FavoritePoiInfo a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        FavoritePoiInfo favoritePoiInfo = new FavoritePoiInfo();
        if (jSONObject.optJSONObject(u.LANGUAGE_PT) != null) {
            favoritePoiInfo.f5443c = new LatLng(r1.optInt("y") / 1000000.0d, r1.optInt("x") / 1000000.0d);
        }
        favoritePoiInfo.f5442b = jSONObject.optString("uspoiname");
        favoritePoiInfo.f5447g = Long.parseLong(jSONObject.optString("addtimesec"));
        favoritePoiInfo.f5444d = jSONObject.optString("addr");
        favoritePoiInfo.f5446f = jSONObject.optString("uspoiuid");
        favoritePoiInfo.f5445e = jSONObject.optString("ncityid");
        favoritePoiInfo.f5441a = jSONObject.optString("key");
        return favoritePoiInfo;
    }
}
