package com.baidu.platform.a.h;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.search.route.PlanNode;
import com.baidu.mapapi.search.route.WalkingRoutePlanOption;

/* loaded from: classes2.dex */
public class i extends com.baidu.platform.base.g {
    public i(WalkingRoutePlanOption walkingRoutePlanOption) {
        a(walkingRoutePlanOption);
    }

    private void a(WalkingRoutePlanOption walkingRoutePlanOption) {
        this.f8720d.a("qt", "walkplan");
        this.f8720d.a("sn", a(walkingRoutePlanOption.mFrom));
        this.f8720d.a("en", a(walkingRoutePlanOption.mTo));
        PlanNode planNode = walkingRoutePlanOption.mFrom;
        if (planNode != null) {
            this.f8720d.a("sc", planNode.getCity());
        }
        PlanNode planNode2 = walkingRoutePlanOption.mTo;
        if (planNode2 != null) {
            this.f8720d.a("ec", planNode2.getCity());
        }
        this.f8720d.a("ie", "utf-8");
        this.f8720d.a("lrn", "20");
        this.f8720d.a("version", "6");
        this.f8720d.a("rp_format", BodyData.TYPE_JSON);
        this.f8720d.a("rp_filter", "mobile");
        this.f8720d.a("spath_type", "1");
        this.f8720d.a("with_indoor_navi", "1");
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.y();
    }
}
