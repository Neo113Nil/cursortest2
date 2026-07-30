package com.baidu.platform.a.e;

import android.text.TextUtils;
import cn.hutool.core.util.g1;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeResult;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e extends com.baidu.platform.base.f {
    private LatLng b(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (jSONObject == null || str == null || "".equals(str) || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        LatLng latLng = new LatLng(optJSONObject.optDouble("y"), optJSONObject.optDouble("x"));
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(latLng) : latLng;
    }

    private ReverseGeoCodeResult.AddressComponent c(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (jSONObject == null || TextUtils.isEmpty(str) || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        ReverseGeoCodeResult.AddressComponent addressComponent = new ReverseGeoCodeResult.AddressComponent();
        addressComponent.city = optJSONObject.optString("city");
        addressComponent.setTown(optJSONObject.optString("town"));
        addressComponent.district = optJSONObject.optString("district");
        addressComponent.province = optJSONObject.optString("province");
        addressComponent.adcode = optJSONObject.optInt("adcode");
        addressComponent.street = optJSONObject.optString("street");
        addressComponent.streetNumber = optJSONObject.optString("street_number");
        addressComponent.countryName = optJSONObject.optString("country");
        addressComponent.countryCode = optJSONObject.optInt("country_code");
        addressComponent.setDirection(optJSONObject.optString("direction"));
        addressComponent.setDistance(optJSONObject.optString("distance"));
        addressComponent.countryCodeIso = optJSONObject.optString("country_code_iso");
        addressComponent.countryCodeIso2 = optJSONObject.optString("country_code_iso2");
        addressComponent.townCode = optJSONObject.optString("town_code");
        addressComponent.cityLevel = optJSONObject.optInt("cityLevel");
        return addressComponent;
    }

    private List<ReverseGeoCodeResult.PoiRegionsInfo> d(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        if (jSONObject == null || TextUtils.isEmpty(str) || (optJSONArray = jSONObject.optJSONArray(str)) == null || optJSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                ReverseGeoCodeResult.PoiRegionsInfo poiRegionsInfo = new ReverseGeoCodeResult.PoiRegionsInfo();
                poiRegionsInfo.setDirectionDesc(optJSONObject.optString("direction_desc"));
                poiRegionsInfo.setRegionName(optJSONObject.optString("name"));
                poiRegionsInfo.setRegionTag(optJSONObject.optString("tag"));
                arrayList.add(poiRegionsInfo);
            }
        }
        return arrayList;
    }

    private List<ReverseGeoCodeResult.RoadInfo> e(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        if (jSONObject == null || TextUtils.isEmpty(str) || (optJSONArray = jSONObject.optJSONArray(str)) == null || optJSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                ReverseGeoCodeResult.RoadInfo roadInfo = new ReverseGeoCodeResult.RoadInfo();
                roadInfo.name = optJSONObject.optString("name");
                roadInfo.distance = optJSONObject.optString("distance");
                arrayList.add(roadInfo);
            }
        }
        return arrayList;
    }

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        ReverseGeoCodeResult reverseGeoCodeResult = new ReverseGeoCodeResult();
        if (str == null || str.equals("")) {
            reverseGeoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return reverseGeoCodeResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    reverseGeoCodeResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return reverseGeoCodeResult;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    if (optString.equals("NETWORK_ERROR")) {
                        reverseGeoCodeResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        reverseGeoCodeResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        reverseGeoCodeResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return reverseGeoCodeResult;
                }
            }
            if (!a(str, (SearchResult) reverseGeoCodeResult, false)) {
                a(str, reverseGeoCodeResult);
            }
            return reverseGeoCodeResult;
        } catch (Exception unused) {
            reverseGeoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return reverseGeoCodeResult;
        }
    }

    private boolean a(String str, ReverseGeoCodeResult reverseGeoCodeResult) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("status");
                    if (optInt == 0) {
                        if (a(jSONObject, reverseGeoCodeResult)) {
                            return true;
                        }
                        reverseGeoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                        return false;
                    }
                    if (optInt == 1) {
                        reverseGeoCodeResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    } else if (optInt != 2) {
                        reverseGeoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                    } else {
                        reverseGeoCodeResult.error = SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
                    }
                    return false;
                }
            } catch (JSONException e8) {
                e8.printStackTrace();
                reverseGeoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return false;
            }
        }
        reverseGeoCodeResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
        return false;
    }

    private boolean a(JSONObject jSONObject, ReverseGeoCodeResult reverseGeoCodeResult) {
        JSONObject optJSONObject;
        String str;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("result")) == null) {
            return false;
        }
        reverseGeoCodeResult.setCityCode(optJSONObject.optInt("cityCode"));
        reverseGeoCodeResult.setAddress(optJSONObject.optString("formatted_address"));
        reverseGeoCodeResult.setBusinessCircle(optJSONObject.optString("business"));
        ReverseGeoCodeResult.AddressComponent c8 = c(optJSONObject, "addressComponent");
        reverseGeoCodeResult.setAddressDetail(c8);
        reverseGeoCodeResult.setLocation(a(optJSONObject, "location"));
        if (c8 != null) {
            str = c8.city;
            reverseGeoCodeResult.setAdcode(c8.adcode);
        } else {
            str = "";
        }
        reverseGeoCodeResult.setPoiList(a(optJSONObject, "pois", str));
        reverseGeoCodeResult.setSematicDescription(optJSONObject.optString("sematic_description"));
        reverseGeoCodeResult.setFormattedPoiAddress(optJSONObject.optString("formatted_address_poi"));
        reverseGeoCodeResult.setPoiRegionsInfoList(d(optJSONObject, "poiRegions"));
        reverseGeoCodeResult.setRoadInfoList(e(optJSONObject, "roads"));
        reverseGeoCodeResult.error = SearchResult.ERRORNO.NO_ERROR;
        return true;
    }

    private LatLng a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (jSONObject == null || str == null || "".equals(str) || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        LatLng latLng = new LatLng(optJSONObject.optDouble("lat"), optJSONObject.optDouble("lng"));
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(latLng) : latLng;
    }

    private List<PoiInfo> a(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject == null || str == null || "".equals(str) || (optJSONArray = jSONObject.optJSONArray(str)) == null || optJSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                PoiInfo poiInfo = new PoiInfo();
                poiInfo.setAddress(optJSONObject.optString("addr"));
                poiInfo.setPhoneNum(optJSONObject.optString("tel"));
                poiInfo.setUid(optJSONObject.optString("uid"));
                poiInfo.setPostCode(optJSONObject.optString(g1.URL_PROTOCOL_ZIP));
                poiInfo.setName(optJSONObject.optString("name"));
                poiInfo.setLocation(b(optJSONObject, "point"));
                poiInfo.setCity(str2);
                poiInfo.setDirection(optJSONObject.optString("direction"));
                poiInfo.setDistance(optJSONObject.optInt("distance"));
                poiInfo.setTag(optJSONObject.optString("tag"));
                poiInfo.setParentPoi(a(optJSONObject.optJSONObject("parent_poi")));
                arrayList.add(poiInfo);
            }
        }
        return arrayList;
    }

    private PoiInfo.ParentPoiInfo a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        PoiInfo.ParentPoiInfo parentPoiInfo = new PoiInfo.ParentPoiInfo();
        parentPoiInfo.setParentPoiAddress(jSONObject.optString("addr"));
        parentPoiInfo.setParentPoiDirection(jSONObject.optString("direction"));
        parentPoiInfo.setParentPoiDistance(jSONObject.optInt("distance"));
        parentPoiInfo.setParentPoiName(jSONObject.optString("name"));
        parentPoiInfo.setParentPoiTag(jSONObject.optString("tag"));
        parentPoiInfo.setParentPoiUid(jSONObject.optString("uid"));
        parentPoiInfo.setParentPoiLocation(b(jSONObject, "point"));
        return parentPoiInfo;
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetGeoCoderResultListener)) {
            return;
        }
        ((OnGetGeoCoderResultListener) obj).onGetReverseGeoCodeResult((ReverseGeoCodeResult) searchResult);
    }
}
