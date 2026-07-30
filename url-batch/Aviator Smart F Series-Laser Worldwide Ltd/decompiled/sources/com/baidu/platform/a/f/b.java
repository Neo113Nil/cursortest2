package com.baidu.platform.a.f;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener;
import com.baidu.mapapi.search.poi.PoiIndoorInfo;
import com.baidu.mapapi.search.poi.PoiIndoorResult;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.base.f {
    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        PoiIndoorResult poiIndoorResult = new PoiIndoorResult();
        if (str == null || str.equals("")) {
            poiIndoorResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return poiIndoorResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    poiIndoorResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return poiIndoorResult;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    if (optString.equals("NETWORK_ERROR")) {
                        poiIndoorResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        poiIndoorResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        poiIndoorResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return poiIndoorResult;
                }
            }
            if (!a(str, poiIndoorResult, false) && !a(str, poiIndoorResult)) {
                poiIndoorResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            }
            return poiIndoorResult;
        } catch (Exception unused) {
            poiIndoorResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return poiIndoorResult;
        }
    }

    private boolean a(String str, PoiIndoorResult poiIndoorResult) {
        if (str != null && !"".equals(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("errNo");
                if (optInt != 0) {
                    if (optInt == 1) {
                        String optString = jSONObject.optString("Msg");
                        if (optString.contains(MapBundleKey.MapObjKey.OBJ_BID)) {
                            poiIndoorResult.error = SearchResult.ERRORNO.POIINDOOR_BID_ERROR;
                            return true;
                        }
                        if (optString.contains("floor")) {
                            poiIndoorResult.error = SearchResult.ERRORNO.POIINDOOR_FLOOR_ERROR;
                            return true;
                        }
                    } else if (optInt != 5) {
                        poiIndoorResult.error = SearchResult.ERRORNO.POIINDOOR_SERVER_ERROR;
                        return true;
                    }
                    return false;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject == null) {
                    return false;
                }
                JSONArray optJSONArray = optJSONObject.optJSONArray("poi_list");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i8);
                        if (jSONObject2 != null) {
                            PoiIndoorInfo poiIndoorInfo = new PoiIndoorInfo();
                            poiIndoorInfo.address = jSONObject2.optString("address");
                            poiIndoorInfo.bid = jSONObject2.optString("bd_id");
                            poiIndoorInfo.cid = jSONObject2.optInt(CmcdConfiguration.KEY_CONTENT_ID);
                            poiIndoorInfo.discount = jSONObject2.optInt(FirebaseAnalytics.Param.DISCOUNT);
                            poiIndoorInfo.floor = jSONObject2.optString("floor");
                            poiIndoorInfo.name = jSONObject2.optString("name");
                            poiIndoorInfo.phone = jSONObject2.optString("phone");
                            poiIndoorInfo.price = jSONObject2.optInt(FirebaseAnalytics.Param.PRICE);
                            poiIndoorInfo.starLevel = jSONObject2.optInt("star_level");
                            poiIndoorInfo.tag = jSONObject2.optString("tag");
                            poiIndoorInfo.uid = jSONObject2.optString("uid");
                            poiIndoorInfo.groupNum = jSONObject2.optInt("tuan_nums");
                            int parseInt = Integer.parseInt(jSONObject2.optString("twp"));
                            if ((parseInt & 1) == 1) {
                                poiIndoorInfo.isGroup = true;
                            }
                            if ((parseInt & 2) == 1) {
                                poiIndoorInfo.isTakeOut = true;
                            }
                            if ((parseInt & 4) == 1) {
                                poiIndoorInfo.isWaited = true;
                            }
                            poiIndoorInfo.latLng = CoordUtil.mc2ll(new GeoPoint(jSONObject2.optDouble("pt_y"), jSONObject2.optDouble("pt_x")));
                            arrayList.add(poiIndoorInfo);
                        }
                    }
                    poiIndoorResult.error = SearchResult.ERRORNO.NO_ERROR;
                    poiIndoorResult.setmArrayPoiInfo(arrayList);
                } else {
                    poiIndoorResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
                poiIndoorResult.pageNum = optJSONObject.optInt("page_num");
                poiIndoorResult.poiNum = optJSONObject.optInt("poi_num");
                poiIndoorResult.error = SearchResult.ERRORNO.NO_ERROR;
                return true;
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetPoiSearchResultListener)) {
            return;
        }
        ((OnGetPoiSearchResultListener) obj).onGetPoiIndoorResult((PoiIndoorResult) searchResult);
    }
}
