package com.baidu.platform.a.g;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.recommendstop.RecommendStopSearchOption;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.base.g;

/* loaded from: classes2.dex */
public class d extends g {
    public d(RecommendStopSearchOption recommendStopSearchOption) {
        a(recommendStopSearchOption);
    }

    private void a(RecommendStopSearchOption recommendStopSearchOption) {
        if (recommendStopSearchOption != null && recommendStopSearchOption.mLocation != null) {
            LatLng latLng = new LatLng(recommendStopSearchOption.getLocation().latitude, recommendStopSearchOption.getLocation().longitude);
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng = CoordTrans.gcjToBaidu(latLng);
            }
            this.f8720d.a("location", latLng.longitude + SystemInfoUtil.COMMA + latLng.latitude);
            this.f8720d.a("station_info", recommendStopSearchOption.isNeedStationInfo() ? "1" : "0");
        }
        this.f8720d.a("coordtype", "bd09ll");
        this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
        this.f8720d.a("output", BodyData.TYPE_JSON);
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.e();
    }
}
