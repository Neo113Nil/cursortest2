package com.baidu.platform.a.h;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.route.MassTransitRoutePlanOption;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes2.dex */
public class k extends com.baidu.platform.base.g {
    public k(MassTransitRoutePlanOption massTransitRoutePlanOption) {
        a(massTransitRoutePlanOption);
    }

    private void a(MassTransitRoutePlanOption massTransitRoutePlanOption) {
        LatLng location = massTransitRoutePlanOption.mFrom.getLocation();
        if (location != null) {
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                location = CoordTrans.gcjToBaidu(location);
            }
            this.f8720d.a("origin", location.latitude + SystemInfoUtil.COMMA + location.longitude);
        } else {
            this.f8720d.a("origin", massTransitRoutePlanOption.mFrom.getName());
        }
        if (massTransitRoutePlanOption.mFrom.getCity() != null) {
            this.f8720d.a("origin_region", massTransitRoutePlanOption.mFrom.getCity());
        }
        if (!TextUtils.isEmpty(massTransitRoutePlanOption.mFrom.getPoiId())) {
            this.f8720d.a("origin_uid", massTransitRoutePlanOption.mFrom.getPoiId());
        }
        LatLng location2 = massTransitRoutePlanOption.mTo.getLocation();
        if (location2 != null) {
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                location2 = CoordTrans.gcjToBaidu(location2);
            }
            this.f8720d.a(FirebaseAnalytics.Param.DESTINATION, location2.latitude + SystemInfoUtil.COMMA + location2.longitude);
        } else {
            this.f8720d.a(FirebaseAnalytics.Param.DESTINATION, massTransitRoutePlanOption.mTo.getName());
        }
        if (massTransitRoutePlanOption.mTo.getCity() != null) {
            this.f8720d.a("destination_region", massTransitRoutePlanOption.mTo.getCity());
        }
        if (!TextUtils.isEmpty(massTransitRoutePlanOption.mTo.getPoiId())) {
            this.f8720d.a("destination_uid", massTransitRoutePlanOption.mTo.getPoiId());
        }
        this.f8720d.a("tactics_incity", massTransitRoutePlanOption.mTacticsIncity.getInt() + "");
        this.f8720d.a("tactics_intercity", massTransitRoutePlanOption.mTacticsIntercity.getInt() + "");
        this.f8720d.a("trans_type_intercity", massTransitRoutePlanOption.mTransTypeIntercity.getInt() + "");
        this.f8720d.a("page_index", massTransitRoutePlanOption.mPageIndex + "");
        this.f8720d.a("page_size", massTransitRoutePlanOption.mPageSize + "");
        this.f8720d.a("coord_type", massTransitRoutePlanOption.mCoordType);
        this.f8720d.a("output", BodyData.TYPE_JSON);
        this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
        this.f8720d.a("sub_version", "151100");
        if (massTransitRoutePlanOption.mLanguageType == LanguageType.LanguageTypeEnglish) {
            this.f8720d.a("language", "en");
        }
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.h();
    }
}
