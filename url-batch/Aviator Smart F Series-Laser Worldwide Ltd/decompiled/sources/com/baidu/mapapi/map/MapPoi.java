package com.baidu.mapapi.map;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.map.MapBundleKey;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class MapPoi {

    /* renamed from: a, reason: collision with root package name */
    String f5941a;

    /* renamed from: b, reason: collision with root package name */
    LatLng f5942b;

    /* renamed from: c, reason: collision with root package name */
    String f5943c;

    /* renamed from: d, reason: collision with root package name */
    TrafficUGCType f5944d = TrafficUGCType.NoTrafficUGC;

    public enum TrafficUGCType {
        NoTrafficUGC,
        TrafficConstruction,
        TrafficJam,
        TrafficBlocking,
        TrafficEmergency
    }

    void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString(MapBundleKey.MapObjKey.OBJ_TEXT);
        this.f5941a = optString;
        if (optString != null && !optString.equals("")) {
            this.f5941a = this.f5941a.replaceAll("\\\\", "").replaceAll("/?[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
        }
        this.f5942b = CoordUtil.decodeNodeLocation(jSONObject.optString(MapBundleKey.MapObjKey.OBJ_GEO));
        this.f5943c = jSONObject.optString("ud");
        int i8 = jSONObject.getInt(MapBundleKey.MapObjKey.OBJ_STATISTIC_VALUE);
        if (i8 == 0) {
            this.f5944d = TrafficUGCType.TrafficConstruction;
            return;
        }
        if (i8 == 2040) {
            this.f5944d = TrafficUGCType.TrafficJam;
            return;
        }
        if (i8 == 2041) {
            this.f5944d = TrafficUGCType.TrafficBlocking;
        } else if (i8 == 2042) {
            this.f5944d = TrafficUGCType.TrafficEmergency;
        } else {
            this.f5944d = TrafficUGCType.NoTrafficUGC;
        }
    }

    public String getName() {
        return this.f5941a;
    }

    public LatLng getPosition() {
        return this.f5942b;
    }

    public TrafficUGCType getTrafficUGCType() {
        return this.f5944d;
    }

    public String getUid() {
        return this.f5943c;
    }
}
