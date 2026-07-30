package com.baidu.platform.a.g;

import android.util.Log;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RecommendStationStopInfo;
import com.baidu.mapapi.search.core.RecommendStopInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.recommendstop.OnGetRecommendStopResultListener;
import com.baidu.mapapi.search.recommendstop.RecommendStopResult;
import com.baidu.platform.base.f;
import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8619b = "c";

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        RecommendStopResult recommendStopResult = new RecommendStopResult();
        if (str == null || str.isEmpty()) {
            recommendStopResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return recommendStopResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                recommendStopResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return recommendStopResult;
            }
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject != null && optJSONObject.has("PermissionCheckError")) {
                    recommendStopResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return recommendStopResult;
                }
                if (optJSONObject != null && optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    optString.hashCode();
                    if (optString.equals("NETWORK_ERROR")) {
                        recommendStopResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        recommendStopResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        recommendStopResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return recommendStopResult;
                }
            }
            if (!a(str, recommendStopResult, true)) {
                a(str, recommendStopResult);
            }
            return recommendStopResult;
        } catch (JSONException e8) {
            Log.e(f8619b, "Parse RecommendStopResult result error", e8);
            recommendStopResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return recommendStopResult;
        }
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj instanceof OnGetRecommendStopResultListener) {
            ((OnGetRecommendStopResultListener) obj).onGetRecommendStopResult((RecommendStopResult) searchResult);
        }
    }

    private boolean a(String str, RecommendStopResult recommendStopResult) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                recommendStopResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return false;
            }
            int optInt = jSONObject.optInt("status");
            if (optInt == 0) {
                return a(jSONObject, recommendStopResult);
            }
            if (optInt == 1) {
                recommendStopResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
            } else if (optInt != 2) {
                recommendStopResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            } else {
                recommendStopResult.error = SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
            }
            return false;
        } catch (JSONException e8) {
            Log.e(f8619b, "Parse RecommendStop error", e8);
            recommendStopResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return false;
        }
    }

    private List<RecommendStopInfo> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject jSONObject = (JSONObject) jSONArray.opt(i8);
            if (jSONObject != null && jSONObject.length() != 0) {
                RecommendStopInfo recommendStopInfo = new RecommendStopInfo();
                recommendStopInfo.setName(jSONObject.optString("name"));
                recommendStopInfo.setDistance(jSONObject.optDouble("distance"));
                recommendStopInfo.setAddress(jSONObject.optString("address"));
                recommendStopInfo.setId(jSONObject.optString("id"));
                recommendStopInfo.setLocation(a(jSONObject));
                arrayList.add(recommendStopInfo);
            }
        }
        return arrayList;
    }

    private boolean a(JSONObject jSONObject, RecommendStopResult recommendStopResult) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return false;
        }
        recommendStopResult.error = SearchResult.ERRORNO.NO_ERROR;
        if (jSONObject.has("recommendStops")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("recommendStops");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                recommendStopResult.setRecommendStopInfoList(a(optJSONArray));
                return true;
            }
            recommendStopResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return false;
        }
        if (!jSONObject.has("station_info")) {
            return true;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("station_info");
        if (optJSONArray2 != null && optJSONArray2.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                JSONObject jSONObject2 = (JSONObject) optJSONArray2.opt(i8);
                if (jSONObject2 != null && jSONObject2.length() != 0) {
                    RecommendStationStopInfo recommendStationStopInfo = new RecommendStationStopInfo();
                    recommendStationStopInfo.setStationName(jSONObject2.optString("station_name"));
                    recommendStationStopInfo.setRecommendStopInfoList(a(jSONObject2.optJSONArray("recommendstops")));
                    arrayList.add(recommendStationStopInfo);
                }
            }
            recommendStopResult.setStationInfoList(arrayList);
            return true;
        }
        recommendStopResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        return false;
    }

    private LatLng a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double optDouble = jSONObject.optDouble("bd09ll_y");
        double optDouble2 = jSONObject.optDouble("bd09ll_x");
        double optDouble3 = jSONObject.optDouble("gcj02ll_y");
        double optDouble4 = jSONObject.optDouble("gcj02ll_x");
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            if (Double.compare(optDouble3, i.DOUBLE_EPSILON) == 0 && Double.compare(optDouble4, i.DOUBLE_EPSILON) == 0) {
                return null;
            }
            return new LatLng(optDouble3, optDouble4);
        }
        if (Double.compare(optDouble, i.DOUBLE_EPSILON) == 0 && Double.compare(optDouble2, i.DOUBLE_EPSILON) == 0) {
            return null;
        }
        return new LatLng(optDouble, optDouble2);
    }
}
