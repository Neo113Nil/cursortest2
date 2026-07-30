package com.baidu.platform.a.a;

import android.util.Log;
import com.baidu.mapapi.search.aoi.AoiResult;
import com.baidu.mapapi.search.aoi.OnGetAoiSearchResultListener;
import com.baidu.mapapi.search.core.AoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.platform.base.f;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8585b = "a";

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        AoiResult aoiResult = new AoiResult();
        if (str == null || str.isEmpty()) {
            aoiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return aoiResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                aoiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return aoiResult;
            }
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject != null && optJSONObject.has("PermissionCheckError")) {
                    aoiResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return aoiResult;
                }
                if (optJSONObject != null && optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    optString.hashCode();
                    if (optString.equals("NETWORK_ERROR")) {
                        aoiResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        aoiResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        aoiResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return aoiResult;
                }
            }
            if (!a(str, aoiResult, true)) {
                a(str, aoiResult);
            }
            return aoiResult;
        } catch (JSONException e8) {
            Log.e(f8585b, "ParseAoiResult: ", e8);
            aoiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return aoiResult;
        }
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj instanceof OnGetAoiSearchResultListener) {
            ((OnGetAoiSearchResultListener) obj).onGetAoiResult((AoiResult) searchResult);
        }
    }

    private boolean a(String str, AoiResult aoiResult) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                aoiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return false;
            }
            int optInt = jSONObject.optInt("status");
            if (optInt == 0) {
                return a(jSONObject, aoiResult);
            }
            if (optInt == 1) {
                aoiResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
            } else if (optInt != 2) {
                aoiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            } else {
                aoiResult.error = SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
            }
            return false;
        } catch (JSONException e8) {
            Log.e(f8585b, "ParseAoiResult error: ", e8);
            aoiResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return false;
        }
    }

    private boolean a(JSONObject jSONObject, AoiResult aoiResult) {
        JSONArray optJSONArray = jSONObject.optJSONArray("aoi_array");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i8);
            if (jSONObject2 != null) {
                AoiInfo aoiInfo = new AoiInfo();
                aoiInfo.setUid(jSONObject2.optString("uid"));
                aoiInfo.setPolygon(jSONObject2.optString("polygon"));
                aoiInfo.setAoiName(jSONObject2.optString("name"));
                aoiInfo.setAoiType(AoiInfo.AoiType.valueOf(jSONObject2.optInt("aoi_type")));
                aoiInfo.setOrder(jSONObject2.optInt("point_order"));
                aoiInfo.setNearestDistance(jSONObject2.optInt("distance"));
                aoiInfo.setRelation(jSONObject2.optInt("relation"));
                arrayList.add(aoiInfo);
            }
        }
        aoiResult.setAoiList(arrayList);
        return true;
    }
}
