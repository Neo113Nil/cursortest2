package com.baidu.platform.a.f;

import android.text.TextUtils;
import android.util.Log;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.PoiDetailInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener;
import com.baidu.mapapi.search.poi.PoiDetailResult;
import com.baidu.mapapi.search.poi.PoiDetailSearchResult;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.github.mikephil.charting.utils.i;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d extends com.baidu.platform.base.f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8597b = "d";

    /* renamed from: c, reason: collision with root package name */
    private boolean f8598c = false;

    void a(boolean z7) {
        this.f8598c = z7;
    }

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        SearchResult poiDetailSearchResult = this.f8598c ? new PoiDetailSearchResult() : new PoiDetailResult();
        if (str == null || str.isEmpty()) {
            poiDetailSearchResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return poiDetailSearchResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                poiDetailSearchResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return poiDetailSearchResult;
            }
            if (!jSONObject.has("SDK_InnerError")) {
                if (!a(str, poiDetailSearchResult)) {
                    poiDetailSearchResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
                return poiDetailSearchResult;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
            if (optJSONObject == null || optJSONObject.length() == 0) {
                poiDetailSearchResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return poiDetailSearchResult;
            }
            if (optJSONObject.has("PermissionCheckError")) {
                poiDetailSearchResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                return poiDetailSearchResult;
            }
            if (optJSONObject.has("httpStateError")) {
                String optString = optJSONObject.optString("httpStateError");
                optString.hashCode();
                if (optString.equals("NETWORK_ERROR")) {
                    poiDetailSearchResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                } else if (optString.equals("REQUEST_ERROR")) {
                    poiDetailSearchResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                } else {
                    poiDetailSearchResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                }
            }
            return poiDetailSearchResult;
        } catch (JSONException e8) {
            Log.e(f8597b, "Parse detail search result failed", e8);
            poiDetailSearchResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return poiDetailSearchResult;
        }
    }

    private boolean a(String str, SearchResult searchResult) {
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0 || jSONObject.optInt("status") != 0 || (optJSONArray = jSONObject.optJSONArray("result")) == null || optJSONArray.length() == 0) {
                return false;
            }
            if (this.f8598c) {
                return a(optJSONArray, (PoiDetailSearchResult) searchResult);
            }
            return a(optJSONArray, (PoiDetailResult) searchResult);
        } catch (JSONException e8) {
            Log.e(f8597b, "Parse detail search result error", e8);
            return false;
        }
    }

    private boolean a(JSONArray jSONArray, PoiDetailSearchResult poiDetailSearchResult) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject jSONObject = (JSONObject) jSONArray.opt(i8);
            if (jSONObject != null && jSONObject.length() != 0) {
                PoiDetailInfo poiDetailInfo = new PoiDetailInfo();
                poiDetailInfo.setName(jSONObject.optString("name"));
                poiDetailInfo.setLocation(a(jSONObject.optJSONObject("location")));
                poiDetailInfo.setAddress(jSONObject.optString("address"));
                poiDetailInfo.setStatus(jSONObject.optString("status"));
                poiDetailInfo.setAdCode(jSONObject.optInt("adcode"));
                poiDetailInfo.setProvince(jSONObject.optString("province"));
                poiDetailInfo.setCity(jSONObject.optString("city"));
                poiDetailInfo.setArea(jSONObject.optString("area"));
                poiDetailInfo.setTelephone(jSONObject.optString("telephone"));
                poiDetailInfo.setUid(jSONObject.optString("uid"));
                poiDetailInfo.setStreetId(jSONObject.optString("setStreetId"));
                poiDetailInfo.setDetail(jSONObject.optString("detail"));
                JSONObject optJSONObject = jSONObject.optJSONObject("detail_info");
                if (optJSONObject != null && optJSONObject.length() != 0) {
                    poiDetailInfo.setDistance(optJSONObject.optInt("distance", 0));
                    poiDetailInfo.setType(optJSONObject.optString("type"));
                    poiDetailInfo.setTag(optJSONObject.optString("tag"));
                    poiDetailInfo.setDetailUrl(optJSONObject.optString("detail_url"));
                    poiDetailInfo.setPrice(optJSONObject.optDouble(FirebaseAnalytics.Param.PRICE, i.DOUBLE_EPSILON));
                    poiDetailInfo.setShopHours(optJSONObject.optString("shop_hours"));
                    poiDetailInfo.setOverallRating(optJSONObject.optDouble("overall_rating", i.DOUBLE_EPSILON));
                    poiDetailInfo.setTasteRating(optJSONObject.optDouble("taste_rating", i.DOUBLE_EPSILON));
                    poiDetailInfo.setServiceRating(optJSONObject.optDouble("service_rating", i.DOUBLE_EPSILON));
                    poiDetailInfo.setEnvironmentRating(optJSONObject.optDouble("environment_rating", i.DOUBLE_EPSILON));
                    poiDetailInfo.setFacilityRating(optJSONObject.optDouble("facility_rating", i.DOUBLE_EPSILON));
                    poiDetailInfo.setHygieneRating(optJSONObject.optDouble("hygiene_rating", i.DOUBLE_EPSILON));
                    poiDetailInfo.setTechnologyRating(optJSONObject.optDouble("technology_rating", i.DOUBLE_EPSILON));
                    poiDetailInfo.setImageNum(optJSONObject.optInt("image_num"));
                    poiDetailInfo.setBrand(optJSONObject.optString("brand"));
                    poiDetailInfo.setLabel(optJSONObject.optString("label"));
                    poiDetailInfo.setGrouponNum(optJSONObject.optInt("groupon_num", 0));
                    poiDetailInfo.setCommentNum(optJSONObject.optInt("comment_num", 0));
                    poiDetailInfo.setDiscountNum(optJSONObject.optInt("discount_num", 0));
                    poiDetailInfo.setFavoriteNum(optJSONObject.optInt("favorite_num", 0));
                    poiDetailInfo.setCheckinNum(optJSONObject.optInt("checkin_num", 0));
                    poiDetailInfo.setIsDefaultImage(optJSONObject.optBoolean("is_default_image"));
                    poiDetailInfo.setContentTag(optJSONObject.optString("content_tag"));
                    poiDetailInfo.setImage(optJSONObject.optString("image"));
                    JSONArray optJSONArray = optJSONObject.optJSONArray("photos");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                            if (!TextUtils.isEmpty(optJSONArray.optString(i9))) {
                                arrayList2.add(optJSONArray.optString(i9));
                            }
                        }
                        poiDetailInfo.setPhotos(arrayList2);
                    }
                }
                arrayList.add(poiDetailInfo);
            }
        }
        poiDetailSearchResult.setPoiDetailInfoList(arrayList);
        poiDetailSearchResult.error = SearchResult.ERRORNO.NO_ERROR;
        return true;
    }

    private boolean a(JSONArray jSONArray, PoiDetailResult poiDetailResult) {
        JSONObject jSONObject = (JSONObject) jSONArray.opt(0);
        if (jSONObject == null || jSONObject.length() == 0) {
            return false;
        }
        poiDetailResult.setName(jSONObject.optString("name"));
        poiDetailResult.setLocation(a(jSONObject.optJSONObject("location")));
        poiDetailResult.setAddress(jSONObject.optString("address"));
        poiDetailResult.setTelephone(jSONObject.optString("telephone"));
        poiDetailResult.setUid(jSONObject.optString("uid"));
        JSONObject optJSONObject = jSONObject.optJSONObject("detail_info");
        if (optJSONObject != null && optJSONObject.length() != 0) {
            poiDetailResult.setTag(optJSONObject.optString("tag"));
            poiDetailResult.setDetailUrl(optJSONObject.optString("detail_url"));
            poiDetailResult.setType(optJSONObject.optString("type"));
            poiDetailResult.setPrice(optJSONObject.optDouble(FirebaseAnalytics.Param.PRICE, i.DOUBLE_EPSILON));
            poiDetailResult.setOverallRating(optJSONObject.optDouble("overall_rating", i.DOUBLE_EPSILON));
            poiDetailResult.setTasteRating(optJSONObject.optDouble("taste_rating", i.DOUBLE_EPSILON));
            poiDetailResult.setServiceRating(optJSONObject.optDouble("service_rating", i.DOUBLE_EPSILON));
            poiDetailResult.setEnvironmentRating(optJSONObject.optDouble("environment_rating", i.DOUBLE_EPSILON));
            poiDetailResult.setFacilityRating(optJSONObject.optDouble("facility_rating", i.DOUBLE_EPSILON));
            poiDetailResult.setHygieneRating(optJSONObject.optDouble("hygiene_rating", i.DOUBLE_EPSILON));
            poiDetailResult.setTechnologyRating(optJSONObject.optDouble("technology_rating", i.DOUBLE_EPSILON));
            poiDetailResult.setImageNum(optJSONObject.optInt("image_num"));
            poiDetailResult.setGrouponNum(optJSONObject.optInt("groupon_num", 0));
            poiDetailResult.setCommentNum(optJSONObject.optInt("comment_num", 0));
            poiDetailResult.setDiscountNum(optJSONObject.optInt("discount_num", 0));
            poiDetailResult.setFavoriteNum(optJSONObject.optInt("favorite_num", 0));
            poiDetailResult.setCheckinNum(optJSONObject.optInt("checkin_num", 0));
            poiDetailResult.setShopHours(optJSONObject.optString("shop_hours"));
        }
        poiDetailResult.error = SearchResult.ERRORNO.NO_ERROR;
        return true;
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
        if (this.f8598c) {
            ((OnGetPoiSearchResultListener) obj).onGetPoiDetailResult((PoiDetailSearchResult) searchResult);
        } else {
            ((OnGetPoiSearchResultListener) obj).onGetPoiDetailResult((PoiDetailResult) searchResult);
        }
    }
}
