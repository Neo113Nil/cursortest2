package com.baidu.platform.a.c;

import android.text.TextUtils;
import android.util.Log;
import com.arthenica.ffmpegkit.x;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.building.BuildingResult;
import com.baidu.mapapi.search.building.OnGetBuildingSearchResultListener;
import com.baidu.mapapi.search.core.BuildingInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.platform.base.f;
import com.github.mikephil.charting.utils.i;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8589b = "a";

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        BuildingResult buildingResult = new BuildingResult();
        if (str == null || str.isEmpty()) {
            buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return buildingResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return buildingResult;
            }
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject != null && optJSONObject.has("PermissionCheckError")) {
                    buildingResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return buildingResult;
                }
                if (optJSONObject != null && optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    optString.hashCode();
                    if (optString.equals("NETWORK_ERROR")) {
                        buildingResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        buildingResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        buildingResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return buildingResult;
                }
            }
            if (!a(str, buildingResult, true)) {
                a(str, buildingResult);
            }
            return buildingResult;
        } catch (JSONException e8) {
            Log.e(f8589b, "ParseBuidingResult: ", e8);
            buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return buildingResult;
        }
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj instanceof OnGetBuildingSearchResultListener) {
            ((OnGetBuildingSearchResultListener) obj).onGetBuildingResult((BuildingResult) searchResult);
        }
    }

    private boolean a(String str, BuildingResult buildingResult) {
        int i8 = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return false;
            }
            int optInt = jSONObject.optInt("status");
            if (optInt == 0) {
                if ("in".equals(jSONObject.optString("relation"))) {
                    i8 = 1;
                } else {
                    buildingResult.setDistance(jSONObject.optDouble("distance", i.DOUBLE_EPSILON));
                }
                buildingResult.setRelation(i8);
                return a(jSONObject, buildingResult);
            }
            if (optInt == 1) {
                buildingResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
            } else if (optInt != 2) {
                buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            } else {
                buildingResult.error = SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
            }
            return false;
        } catch (JSONException e8) {
            Log.e(f8589b, "ParseBuidingResult error: ", e8);
            buildingResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return false;
        }
    }

    private boolean a(JSONObject jSONObject, BuildingResult buildingResult) {
        JSONArray optJSONArray = jSONObject.optJSONArray("buildinginfo");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i8);
            if (jSONObject2 != null) {
                BuildingInfo buildingInfo = new BuildingInfo();
                float optLong = jSONObject2.optLong(x.KEY_HEIGHT);
                buildingInfo.b(jSONObject2.optString("label").equals("main") ? 1 : 0);
                buildingInfo.b(jSONObject2.optString("struct_id"));
                buildingInfo.setHeight(optLong);
                buildingInfo.a(jSONObject2.optInt("accuracy"));
                buildingInfo.a(jSONObject2.optString("geom"));
                buildingInfo.a(a(jSONObject2));
                arrayList.add(buildingInfo);
            }
        }
        buildingResult.setBuildingList(arrayList);
        return true;
    }

    private LatLng a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(TtmlNode.CENTER);
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        String[] split = optString.split(SystemInfoUtil.COMMA);
        if (split.length != 2) {
            return null;
        }
        return new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }
}
