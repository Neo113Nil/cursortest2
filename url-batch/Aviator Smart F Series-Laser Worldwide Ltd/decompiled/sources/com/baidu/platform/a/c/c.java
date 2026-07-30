package com.baidu.platform.a.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.building.BuildingSearchOption;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.base.g;

/* loaded from: classes2.dex */
public class c extends g {
    public c(BuildingSearchOption buildingSearchOption) {
        a(buildingSearchOption);
    }

    private void a(BuildingSearchOption buildingSearchOption) {
        if (buildingSearchOption == null) {
            return;
        }
        LatLng latLng = buildingSearchOption.getLatLng();
        if (latLng != null) {
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng = CoordTrans.gcjToBaidu(latLng);
            }
            this.f8720d.a(d2.c.XML_TAG_LATITUDE, latLng.latitude + "");
            this.f8720d.a(d2.c.XML_TAG_LONGITUDE, latLng.longitude + "");
        }
        this.f8720d.a("coord_type", "bd09ll");
        this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
        this.f8720d.a("output", BodyData.TYPE_JSON);
        this.f8720d.a("data_set", "building");
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.k();
    }
}
