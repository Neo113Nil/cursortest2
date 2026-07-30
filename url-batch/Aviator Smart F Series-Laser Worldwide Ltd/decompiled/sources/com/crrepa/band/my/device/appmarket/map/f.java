package com.crrepa.band.my.device.appmarket.map;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiDetailInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.poi.PoiResult;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPPoiInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.LocationBean;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class f {
    public static CRPPoiInfo build(PoiResult poiResult) {
        if (poiResult == null || poiResult.error != SearchResult.ERRORNO.NO_ERROR) {
            return new CRPPoiInfo(8, null);
        }
        CRPPoiInfo.Result result = new CRPPoiInfo.Result();
        result.setTotalPOINum(result.getTotalPOINum());
        result.setTotalPageNum(result.getTotalPageNum());
        result.setCurPOINum(poiResult.getCurrentPageNum());
        result.setCurPageIndex(poiResult.getCurrentPageCapacity());
        List<PoiInfo> allPoi = poiResult.getAllPoi();
        if (allPoi != null && !allPoi.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (PoiInfo poiInfo : allPoi) {
                CRPPoiInfo.PoiInfo poiInfo2 = new CRPPoiInfo.PoiInfo();
                poiInfo2.setName(poiInfo.getName());
                LatLng latLng = poiInfo.location;
                poiInfo2.setPt(new LocationBean(latLng.latitude, latLng.longitude));
                poiInfo2.setAddress(poiInfo.address);
                poiInfo2.setPhone(poiInfo.phoneNum);
                poiInfo2.setUID(poiInfo.uid);
                poiInfo2.setAdcode(String.valueOf(poiInfo.getAdCode()));
                poiInfo2.setProvince(poiInfo.province);
                poiInfo2.setCity(poiInfo.city);
                poiInfo2.setArea(poiInfo.area);
                poiInfo2.setStreetID(poiInfo.getStreetId());
                poiInfo2.setTag(poiInfo.getTag());
                poiInfo2.setHasDetailInfo(poiInfo.isHasCaterDetails());
                PoiDetailInfo poiDetailInfo = poiInfo.getPoiDetailInfo();
                if (poiDetailInfo != null) {
                    poiInfo2.setDetailInfo(getDetailInfo(poiDetailInfo));
                }
                arrayList.add(poiInfo2);
            }
            result.setPoiInfoList(arrayList);
        }
        return new CRPPoiInfo(0, result);
    }

    private static CRPPoiInfo.DetailInfo getDetailInfo(PoiDetailInfo poiDetailInfo) {
        CRPPoiInfo.DetailInfo detailInfo = new CRPPoiInfo.DetailInfo();
        detailInfo.setDistance(poiDetailInfo.distance);
        detailInfo.setType(detailInfo.getType());
        detailInfo.setTag(poiDetailInfo.tag);
        LatLng naviLocation = poiDetailInfo.getNaviLocation();
        if (naviLocation != null) {
            detailInfo.setNaviLocation(new LocationBean(naviLocation.latitude, naviLocation.longitude));
        }
        return detailInfo;
    }
}
