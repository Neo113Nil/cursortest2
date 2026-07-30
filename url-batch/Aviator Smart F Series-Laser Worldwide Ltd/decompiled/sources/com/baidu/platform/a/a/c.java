package com.baidu.platform.a.a;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.aoi.AoiSearchOption;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.base.g;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class c extends g {
    public c(AoiSearchOption aoiSearchOption) {
        a(aoiSearchOption);
    }

    private void a(AoiSearchOption aoiSearchOption) {
        if (aoiSearchOption == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<LatLng> latLngList = aoiSearchOption.getLatLngList();
        if (latLngList != null && latLngList.size() > 0) {
            for (int i8 = 0; i8 < latLngList.size(); i8++) {
                LatLng latLng = latLngList.get(i8);
                if (latLng != null) {
                    if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                        latLng = CoordTrans.gcjToBaidu(latLng);
                    }
                    sb.append(latLng.longitude);
                    sb.append(SystemInfoUtil.COMMA);
                    sb.append(latLng.latitude);
                    if (latLngList.size() - 1 == i8) {
                        break;
                    } else {
                        sb.append(";");
                    }
                }
            }
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return;
        }
        this.f8720d.a("locations", sb2);
        this.f8720d.a("coordtype", "bd09ll");
        this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
        this.f8720d.a("output", BodyData.TYPE_JSON);
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.f();
    }
}
