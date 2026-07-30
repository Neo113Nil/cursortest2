package com.baidu.platform.a.f;

import android.text.TextUtils;
import android.util.Log;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiChildrenInfo;
import com.baidu.mapapi.search.core.PoiDetailInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener;
import com.baidu.mapapi.search.poi.PoiResult;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.base.SearchType;
import com.github.mikephil.charting.utils.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g extends com.baidu.platform.base.f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8601b = "g";

    /* renamed from: c, reason: collision with root package name */
    private int f8602c;

    /* renamed from: d, reason: collision with root package name */
    private int f8603d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8604a;

        static {
            int[] iArr = new int[SearchType.values().length];
            f8604a = iArr;
            try {
                iArr[SearchType.POI_NEAR_BY_SEARCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8604a[SearchType.POI_IN_CITY_SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8604a[SearchType.POI_IN_BOUND_SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    g(int i8, int i9) {
        this.f8602c = i8;
        this.f8603d = i9;
    }

    private PoiDetailInfo b(String str) {
        PoiDetailInfo poiDetailInfo = new PoiDetailInfo();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                return null;
            }
            poiDetailInfo.setDistance(jSONObject.optInt("distance", 0));
            poiDetailInfo.setTag(jSONObject.optString("tag"));
            poiDetailInfo.setDetailUrl(jSONObject.optString("detail_url"));
            poiDetailInfo.setType(jSONObject.optString("type"));
            poiDetailInfo.setPrice(jSONObject.optDouble(FirebaseAnalytics.Param.PRICE, i.DOUBLE_EPSILON));
            poiDetailInfo.setOverallRating(jSONObject.optDouble("overall_rating", i.DOUBLE_EPSILON));
            poiDetailInfo.setTasteRating(jSONObject.optDouble("taste_rating", i.DOUBLE_EPSILON));
            poiDetailInfo.setServiceRating(jSONObject.optDouble("service_rating", i.DOUBLE_EPSILON));
            poiDetailInfo.setEnvironmentRating(jSONObject.optDouble("environment_rating", i.DOUBLE_EPSILON));
            poiDetailInfo.setFacilityRating(jSONObject.optDouble("facility_rating", i.DOUBLE_EPSILON));
            poiDetailInfo.setHygieneRating(jSONObject.optDouble("hygiene_rating", i.DOUBLE_EPSILON));
            poiDetailInfo.setTechnologyRating(jSONObject.optDouble("technology_rating", i.DOUBLE_EPSILON));
            poiDetailInfo.setImage(jSONObject.optString("image"));
            poiDetailInfo.setImageNum(jSONObject.optInt("image_num"));
            poiDetailInfo.setGrouponNum(jSONObject.optInt("groupon_num"));
            poiDetailInfo.setCommentNum(jSONObject.optInt("comment_num"));
            poiDetailInfo.setDiscountNum(jSONObject.optInt("discount_num"));
            poiDetailInfo.setFavoriteNum(jSONObject.optInt("favorite_num"));
            poiDetailInfo.setCheckinNum(jSONObject.optInt("checkin_num"));
            poiDetailInfo.setBrand(jSONObject.optString("brand"));
            poiDetailInfo.setShopHours(jSONObject.optString("shop_hours"));
            poiDetailInfo.setIsDefaultImage(jSONObject.optBoolean("is_default_image"));
            poiDetailInfo.setLabel(jSONObject.optString("label"));
            JSONArray optJSONArray = jSONObject.optJSONArray("photos");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                    if (!TextUtils.isEmpty(optJSONArray.optString(i8))) {
                        arrayList.add(optJSONArray.optString(i8));
                    }
                }
                poiDetailInfo.setPhotos(arrayList);
            }
            poiDetailInfo.naviLocation = a(jSONObject.optJSONObject("navi_location"));
            SearchType a8 = a();
            if (SearchType.POI_IN_CITY_SEARCH == a8 || SearchType.POI_NEAR_BY_SEARCH == a8) {
                poiDetailInfo.setPoiChildrenInfoList(b(jSONObject));
            }
            return poiDetailInfo;
        } catch (JSONException e8) {
            Log.e(f8601b, "Parse poi search detail info failed", e8);
            return null;
        }
    }

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        PoiResult poiResult = new PoiResult();
        if (str == null || str.equals("") || str.isEmpty()) {
            poiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return poiResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    poiResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return poiResult;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    optString.hashCode();
                    if (optString.equals("NETWORK_ERROR")) {
                        poiResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        poiResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        poiResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return poiResult;
                }
            }
            if (a(str, poiResult, false)) {
                return poiResult;
            }
            poiResult.error = a(str, poiResult) ? SearchResult.ERRORNO.NO_ERROR : SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return poiResult;
        } catch (JSONException e8) {
            Log.e(f8601b, "Parse poi search error", e8);
            poiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return poiResult;
        }
    }

    private boolean a(String str, PoiResult poiResult) {
        if (str != null && !str.equals("") && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("status");
                if (optInt == 0) {
                    return a(jSONObject, poiResult);
                }
                if (optInt == 1) {
                    poiResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                } else if (optInt != 2) {
                    poiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                } else {
                    poiResult.error = SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
                }
                return false;
            } catch (JSONException e8) {
                Log.e(f8601b, "Parse poi search failed", e8);
                poiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            }
        }
        return false;
    }

    private boolean a(JSONObject jSONObject, PoiResult poiResult) {
        if (jSONObject != null && jSONObject.length() != 0) {
            poiResult.error = SearchResult.ERRORNO.NO_ERROR;
            JSONArray optJSONArray = jSONObject.optJSONArray("results");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                String optString = jSONObject.optString("result_type");
                if (!TextUtils.isEmpty(optString)) {
                    poiResult.setResultType(optString);
                }
                String optString2 = jSONObject.optString("query_type");
                if (!TextUtils.isEmpty(optString2)) {
                    poiResult.setQueryType(optString2);
                }
                int optInt = jSONObject.optInt(FileDownloadModel.TOTAL);
                poiResult.setTotalPoiNum(optInt);
                int length = optJSONArray.length();
                poiResult.setCurrentPageCapacity(length);
                poiResult.setCurrentPageNum(this.f8602c);
                if (length != 0) {
                    int i8 = this.f8603d;
                    poiResult.setTotalPageNum((optInt / i8) + (optInt % i8 > 0 ? 1 : 0));
                }
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                    JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i9);
                    if (jSONObject2 != null && jSONObject2.length() != 0) {
                        PoiInfo poiInfo = new PoiInfo();
                        poiInfo.setName(jSONObject2.optString("name"));
                        poiInfo.setAddress(jSONObject2.optString("address"));
                        poiInfo.setProvince(jSONObject2.optString("province"));
                        poiInfo.setCity(jSONObject2.optString("city"));
                        poiInfo.setArea(jSONObject2.optString("area"));
                        poiInfo.setStreetId(jSONObject2.optString("street_id"));
                        poiInfo.setUid(jSONObject2.optString("uid"));
                        poiInfo.setPhoneNum(jSONObject2.optString("telephone"));
                        poiInfo.setDetail(jSONObject2.optInt("detail"));
                        poiInfo.setAdCode(jSONObject2.optInt("adcode"));
                        poiInfo.setNameCh(jSONObject2.optString("name_ch"));
                        poiInfo.setCityId(jSONObject2.optInt("city_id"));
                        poiInfo.setProvinceId(jSONObject2.optInt("province_id"));
                        poiInfo.setStatus(jSONObject2.optString("status"));
                        poiInfo.setLocation(a(jSONObject2.optJSONObject("location")));
                        String optString3 = jSONObject2.optString("detail_info");
                        if (optString3 != null && optString3.length() != 0) {
                            poiInfo.setPoiDetailInfo(b(optString3));
                        }
                        arrayList.add(poiInfo);
                    }
                }
                poiResult.setPoiInfo(arrayList);
                return true;
            }
            poiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        }
        return false;
    }

    private List<PoiChildrenInfo> b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
            if (optJSONObject != null && optJSONObject.length() != 0) {
                PoiChildrenInfo poiChildrenInfo = new PoiChildrenInfo();
                poiChildrenInfo.setUid(optJSONObject.optString("uid"));
                poiChildrenInfo.setName(optJSONObject.optString("name"));
                poiChildrenInfo.setShowName(optJSONObject.optString("show_name"));
                poiChildrenInfo.setTag(optJSONObject.optString("tag"));
                poiChildrenInfo.setLocation(a(optJSONObject.optJSONObject("location")));
                poiChildrenInfo.setAddress(optJSONObject.optString("address"));
                arrayList.add(poiChildrenInfo);
            }
        }
        return arrayList;
    }

    private LatLng a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double optDouble = jSONObject.optDouble("lat");
        double optDouble2 = jSONObject.optDouble("lng");
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            return CoordTrans.baiduToGcj(new LatLng(optDouble, optDouble2));
        }
        return new LatLng(optDouble, optDouble2);
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetPoiSearchResultListener)) {
            return;
        }
        int i8 = a.f8604a[a().ordinal()];
        if (i8 == 1 || i8 == 2 || i8 == 3) {
            ((OnGetPoiSearchResultListener) obj).onGetPoiResult((PoiResult) searchResult);
        }
    }
}
