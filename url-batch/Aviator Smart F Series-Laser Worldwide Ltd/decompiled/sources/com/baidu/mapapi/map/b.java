package com.baidu.mapapi.map;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class b<T> extends BaseBackgroundDrawLayer {
    protected MapController mController;
    protected T mEntity;

    b(Context context) {
        super(context);
    }

    public final void toScreenLocation(LatLng latLng, Point point) {
        if (latLng == null) {
            return;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        toScreenLocation((int) ll2mc.getLongitude(), (int) ll2mc.getLatitude(), point);
    }

    public void updateEntity(T t7) {
        this.mEntity = t7;
    }

    public final void updateMapController(MapController mapController) {
        this.mController = mapController;
    }

    b(Context context, int i8) {
        super(context, i8);
    }

    public final void toScreenLocation(int i8, int i9, Point point) {
        if (point == null) {
            return;
        }
        MapController mapController = this.mController;
        if (mapController == null) {
            point.setTo(-1.0d, -1.0d);
            return;
        }
        AppBaseMap baseMap = mapController.getBaseMap();
        if (baseMap == null) {
            point.setTo(-1.0d, -1.0d);
            return;
        }
        String GeoPtToScrPoint = baseMap.GeoPtToScrPoint(i8, i9);
        if (TextUtils.isEmpty(GeoPtToScrPoint)) {
            point.setTo(-1.0d, -1.0d);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(GeoPtToScrPoint);
            point.setIntX(jSONObject.optInt("scrx", -1));
            point.setIntY(jSONObject.optInt("scry", -1));
        } catch (JSONException unused) {
            point.setTo(-1.0d, -1.0d);
        }
    }
}
