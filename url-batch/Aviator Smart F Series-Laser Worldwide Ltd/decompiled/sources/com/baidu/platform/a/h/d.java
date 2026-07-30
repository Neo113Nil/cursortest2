package com.baidu.platform.a.h;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.search.route.DrivingRoutePlanOption;
import com.baidu.mapapi.search.route.PlanNode;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends com.baidu.platform.base.g {
    d(DrivingRoutePlanOption drivingRoutePlanOption) {
        a(drivingRoutePlanOption);
    }

    private void a(DrivingRoutePlanOption drivingRoutePlanOption) {
        this.f8720d.a("qt", "cars");
        this.f8720d.a("sy", drivingRoutePlanOption.mPolicy.getInt() + "");
        this.f8720d.a("ie", "utf-8");
        this.f8720d.a("lrn", "20");
        this.f8720d.a("version", "6");
        this.f8720d.a("extinfo", "32");
        this.f8720d.a("mrs", "1");
        this.f8720d.a("rp_format", BodyData.TYPE_JSON);
        this.f8720d.a("rp_filter", "mobile");
        this.f8720d.a("route_traffic", drivingRoutePlanOption.mtrafficPolicy.getInt() + "");
        this.f8720d.a("sn", a(drivingRoutePlanOption.mFrom));
        this.f8720d.a("en", a(drivingRoutePlanOption.mTo));
        String str = drivingRoutePlanOption.mCityName;
        if (str != null) {
            this.f8720d.a("c", str);
        }
        PlanNode planNode = drivingRoutePlanOption.mFrom;
        if (planNode != null) {
            this.f8720d.a("sc", planNode.getCity());
        }
        PlanNode planNode2 = drivingRoutePlanOption.mTo;
        if (planNode2 != null) {
            this.f8720d.a("ec", planNode2.getCity());
        }
        List<PlanNode> list = drivingRoutePlanOption.mWayPoints;
        String str2 = new String();
        String str3 = new String();
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                PlanNode planNode3 = list.get(i8);
                if (planNode3 != null) {
                    str2 = str2 + a(planNode3);
                    str3 = str3 + planNode3.getCity();
                    if (i8 != list.size() - 1) {
                        String str4 = str2 + b5.b.VERTICAL;
                        str3 = str3 + b5.b.VERTICAL;
                        str2 = str4;
                    }
                }
            }
            this.f8720d.a("wp", str2);
            this.f8720d.a("wpc", str3);
        }
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.w();
    }
}
