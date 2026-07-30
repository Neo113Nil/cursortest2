package com.baidu.platform.a.h;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.route.BikingRoutePlanOption;
import com.baidu.mapapi.search.route.PlanNode;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.base.g {
    public b(BikingRoutePlanOption bikingRoutePlanOption) {
        a(bikingRoutePlanOption);
    }

    private void a(BikingRoutePlanOption bikingRoutePlanOption) {
        this.f8720d.a("mode", "riding");
        PlanNode planNode = bikingRoutePlanOption.mFrom;
        PlanNode planNode2 = bikingRoutePlanOption.mTo;
        if (planNode == null || planNode2 == null) {
            return;
        }
        LatLng location = planNode.getLocation();
        if (location != null) {
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                location = CoordTrans.gcjToBaidu(location);
            }
            if (location != null) {
                this.f8720d.a("origin", location.latitude + SystemInfoUtil.COMMA + location.longitude);
            }
        } else {
            this.f8720d.a("origin", planNode.getName());
            this.f8720d.a("origin_region", planNode.getCity());
        }
        if (planNode.getPoiId() != null && planNode.getPoiId().length() > 0) {
            this.f8720d.a("origin_uid", planNode.getPoiId());
        }
        LatLng location2 = planNode2.getLocation();
        if (location2 != null) {
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                location2 = CoordTrans.gcjToBaidu(location2);
            }
            if (location2 != null) {
                this.f8720d.a(FirebaseAnalytics.Param.DESTINATION, location2.latitude + SystemInfoUtil.COMMA + location2.longitude);
            }
        } else {
            this.f8720d.a(FirebaseAnalytics.Param.DESTINATION, planNode2.getName());
            this.f8720d.a("destination_region", planNode2.getCity());
        }
        if (planNode2.getPoiId() != null && planNode2.getPoiId().length() > 0) {
            this.f8720d.a("destination_uid", planNode2.getPoiId());
        }
        int i8 = bikingRoutePlanOption.mRidingType;
        if (i8 == 1) {
            this.f8720d.a("riding_type", String.valueOf(i8));
        }
        List<PlanNode> wayPoints = bikingRoutePlanOption.getWayPoints();
        if (wayPoints != null) {
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < wayPoints.size(); i9++) {
                PlanNode planNode3 = wayPoints.get(i9);
                if (i9 == 0) {
                    sb.append(a(planNode3, this.f8720d));
                } else {
                    sb.append(b5.b.VERTICAL);
                    sb.append(a(planNode3, this.f8720d));
                }
            }
            this.f8720d.a("waypoints", sb.toString());
        }
        this.f8720d.a("output", BodyData.TYPE_JSON);
        this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
        this.f8720d.a("road_prefer", bikingRoutePlanOption.mRoadPrefer);
    }

    private String a(PlanNode planNode, com.baidu.platform.util.a aVar) {
        if (planNode != null && aVar != null) {
            LatLng location = planNode.getLocation();
            String poiId = planNode.getPoiId() != null ? planNode.getPoiId() : "";
            if (location != null) {
                if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                    location = CoordTrans.gcjToBaidu(location);
                }
                if (location != null) {
                    return location.latitude + SystemInfoUtil.COMMA + location.longitude + ";" + poiId;
                }
            } else {
                String cityCode = planNode.getCityCode() != null ? planNode.getCityCode() : "";
                String cityName = planNode.getCityName() != null ? planNode.getCityName() : "";
                if (planNode.getName() != null && planNode.getName().length() > 0) {
                    return planNode.getName() + ";" + poiId + ";" + cityName + ";" + cityCode;
                }
            }
        }
        return "";
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.u();
    }
}
