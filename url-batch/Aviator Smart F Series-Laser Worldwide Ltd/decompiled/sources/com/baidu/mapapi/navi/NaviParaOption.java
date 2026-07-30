package com.baidu.mapapi.navi;

import android.text.TextUtils;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NaviParaOption {

    /* renamed from: a, reason: collision with root package name */
    LatLng f6582a;

    /* renamed from: b, reason: collision with root package name */
    String f6583b;

    /* renamed from: c, reason: collision with root package name */
    String f6584c;

    /* renamed from: d, reason: collision with root package name */
    LatLng f6585d;

    /* renamed from: e, reason: collision with root package name */
    String f6586e;

    /* renamed from: f, reason: collision with root package name */
    String f6587f;

    /* renamed from: g, reason: collision with root package name */
    WayPoint f6588g;

    /* renamed from: h, reason: collision with root package name */
    NaviRoutePolicy f6589h = NaviRoutePolicy.DEFAULT;

    public enum NaviRoutePolicy {
        BLK,
        TIME,
        DIS,
        FEE,
        HIGHWAY,
        DEFAULT
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6591a;

        static {
            int[] iArr = new int[NaviRoutePolicy.values().length];
            f6591a = iArr;
            try {
                iArr[NaviRoutePolicy.BLK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6591a[NaviRoutePolicy.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6591a[NaviRoutePolicy.DIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6591a[NaviRoutePolicy.FEE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6591a[NaviRoutePolicy.HIGHWAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6591a[NaviRoutePolicy.DEFAULT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public NaviParaOption endName(String str) {
        this.f6586e = str;
        return this;
    }

    public NaviParaOption endPoint(LatLng latLng) {
        this.f6585d = latLng;
        return this;
    }

    public NaviParaOption endUid(String str) {
        this.f6587f = str;
        return this;
    }

    public String getEndName() {
        return this.f6586e;
    }

    public LatLng getEndPoint() {
        return this.f6585d;
    }

    public String getEndUid() {
        return this.f6587f;
    }

    public String getNaviRoutePolicy() {
        int i8 = a.f6591a[this.f6589h.ordinal()];
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? "DEFAULT" : "HIGHWAY" : "FEE" : "DIS" : "TIME" : "BLK";
    }

    public String getStartName() {
        return this.f6583b;
    }

    public LatLng getStartPoint() {
        return this.f6582a;
    }

    public String getStartUid() {
        return this.f6584c;
    }

    public JSONArray getWayPoint() {
        WayPoint wayPoint = this.f6588g;
        JSONArray jSONArray = null;
        if (wayPoint == null) {
            return null;
        }
        List<WayPointInfo> viaPoints = wayPoint.getViaPoints();
        if (viaPoints != null && viaPoints.size() != 0) {
            jSONArray = new JSONArray();
            for (int i8 = 0; i8 < viaPoints.size(); i8++) {
                JSONObject jSONObject = new JSONObject();
                WayPointInfo wayPointInfo = viaPoints.get(i8);
                if (wayPointInfo != null) {
                    try {
                        if (!TextUtils.isEmpty(wayPointInfo.getWayPointName())) {
                            jSONObject.put("name", wayPointInfo.getWayPointName());
                        }
                        LatLng latLng = wayPointInfo.getLatLng();
                        if (latLng != null) {
                            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                                latLng = CoordTrans.gcjToBaidu(latLng);
                            }
                            jSONObject.put("lng", latLng.longitude);
                            jSONObject.put("lat", latLng.latitude);
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
        return jSONArray;
    }

    public NaviParaOption setNaviRoutePolicy(NaviRoutePolicy naviRoutePolicy) {
        this.f6589h = naviRoutePolicy;
        return this;
    }

    public NaviParaOption setWayPoint(WayPoint wayPoint) {
        if (wayPoint == null) {
            return null;
        }
        this.f6588g = wayPoint;
        return this;
    }

    public NaviParaOption startName(String str) {
        this.f6583b = str;
        return this;
    }

    public NaviParaOption startPoint(LatLng latLng) {
        this.f6582a = latLng;
        return this;
    }

    public NaviParaOption startUid(String str) {
        this.f6584c = str;
        return this;
    }
}
