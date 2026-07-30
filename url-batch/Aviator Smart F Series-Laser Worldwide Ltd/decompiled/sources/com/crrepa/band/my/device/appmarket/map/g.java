package com.crrepa.band.my.device.appmarket.map;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiDetailInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPReverseGeoCodeInfo;
import com.crrepa.ble.spp.hisilicon.write.map.bean.LocationBean;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g {
    private g() {
    }

    public static CRPReverseGeoCodeInfo build(ReverseGeoCodeResult reverseGeoCodeResult) {
        if (reverseGeoCodeResult == null || reverseGeoCodeResult.error != SearchResult.ERRORNO.NO_ERROR) {
            return new CRPReverseGeoCodeInfo(8, null);
        }
        CRPReverseGeoCodeInfo.Result result = new CRPReverseGeoCodeInfo.Result();
        LatLng location = reverseGeoCodeResult.getLocation();
        if (location != null) {
            result.setLocation(new LocationBean(location.latitude, location.longitude));
        }
        result.setAddress(reverseGeoCodeResult.getAddress());
        result.setBusinessCircle(reverseGeoCodeResult.getBusinessCircle());
        CRPReverseGeoCodeInfo.AddressDetail addressDetail = new CRPReverseGeoCodeInfo.AddressDetail();
        addressDetail.setCountry(reverseGeoCodeResult.getAddressDetail().countryName);
        addressDetail.setProvince(reverseGeoCodeResult.getAddressDetail().province);
        addressDetail.setCity(reverseGeoCodeResult.getAddressDetail().city);
        addressDetail.setDistrict(reverseGeoCodeResult.getAddressDetail().district);
        addressDetail.setTown(reverseGeoCodeResult.getAddressDetail().town);
        addressDetail.setStreetName(reverseGeoCodeResult.getAddressDetail().street);
        addressDetail.setStreetNumber(reverseGeoCodeResult.getAddressDetail().streetNumber);
        addressDetail.setAdCode(String.valueOf(reverseGeoCodeResult.getAddressDetail().adcode));
        addressDetail.setCountryCode(String.valueOf(reverseGeoCodeResult.getAddressDetail().countryCode));
        addressDetail.setDirection(reverseGeoCodeResult.getAddressDetail().direction);
        addressDetail.setDistance(reverseGeoCodeResult.getAddressDetail().distance);
        result.setAddressDetail(addressDetail);
        ArrayList arrayList = new ArrayList();
        List<PoiInfo> poiList = reverseGeoCodeResult.getPoiList();
        if (poiList != null && !poiList.isEmpty()) {
            for (PoiInfo poiInfo : poiList) {
                CRPReverseGeoCodeInfo.POIBean pOIBean = new CRPReverseGeoCodeInfo.POIBean();
                pOIBean.setName(poiInfo.name);
                LatLng latLng = poiInfo.location;
                pOIBean.setPt(new LocationBean(latLng.latitude, latLng.longitude));
                pOIBean.setAddress(poiInfo.address);
                pOIBean.setPhone(poiInfo.phoneNum);
                pOIBean.setUID(poiInfo.uid);
                pOIBean.setAdcode(String.valueOf(poiInfo.getAdCode()));
                pOIBean.setProvince(poiInfo.province);
                pOIBean.setCity(poiInfo.city);
                pOIBean.setArea(poiInfo.area);
                pOIBean.setStreetID(poiInfo.street_id);
                pOIBean.setTag(poiInfo.tag);
                pOIBean.setHasDetailInfo(poiInfo.hasCaterDetails);
                PoiDetailInfo poiDetailInfo = poiInfo.getPoiDetailInfo();
                if (poiDetailInfo != null) {
                    int i8 = poiDetailInfo.distance;
                    String str = poiDetailInfo.type;
                    String str2 = poiDetailInfo.tag;
                    LatLng latLng2 = poiDetailInfo.naviLocation;
                    pOIBean.setDetailInfo(new CRPReverseGeoCodeInfo.DetailInfo(i8, str, str2, new LocationBean(latLng2.latitude, latLng2.longitude)));
                }
                arrayList.add(pOIBean);
            }
            result.setPoiList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        List<ReverseGeoCodeResult.PoiRegionsInfo> poiRegionsInfoList = reverseGeoCodeResult.getPoiRegionsInfoList();
        if (poiRegionsInfoList != null && !poiRegionsInfoList.isEmpty()) {
            for (ReverseGeoCodeResult.PoiRegionsInfo poiRegionsInfo : poiRegionsInfoList) {
                arrayList2.add(new CRPReverseGeoCodeInfo.PoiRegions(poiRegionsInfo.directionDesc, poiRegionsInfo.regionName, poiRegionsInfo.regionTag, String.valueOf(100)));
            }
            result.setPoiRegions(arrayList2);
        }
        result.setSematicDescription(reverseGeoCodeResult.getSematicDescription());
        result.setConfidence(20);
        return new CRPReverseGeoCodeInfo(0, result);
    }
}
