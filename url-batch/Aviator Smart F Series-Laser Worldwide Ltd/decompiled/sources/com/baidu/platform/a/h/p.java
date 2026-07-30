package com.baidu.platform.a.h;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import com.baidu.mapapi.search.route.WalkingRouteLine;
import com.baidu.mapapi.search.route.WalkingRouteResult;
import com.moyoung.dafit.module.common.utils.u;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class p extends m {
    private boolean a(String str, WalkingRouteResult walkingRouteResult) {
        JSONArray optJSONArray;
        if (str != null && !"".equals(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (walkingRouteResult == null) {
                    return false;
                }
                if (jSONObject.has("taxi")) {
                    walkingRouteResult.setTaxiInfo(c(jSONObject.optString("taxi")));
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject == null) {
                    return false;
                }
                int optInt = optJSONObject.optInt("error");
                if (optInt != 0) {
                    if (optInt != 4) {
                        return false;
                    }
                    walkingRouteResult.error = SearchResult.ERRORNO.ST_EN_TOO_NEAR;
                    return true;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("walk");
                if (optJSONObject2 == null) {
                    return false;
                }
                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("routes");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("option");
                if (optJSONObject3 == null || optJSONArray2 == null) {
                    return false;
                }
                RouteNode b8 = b(optJSONObject3.optJSONObject("start"));
                RouteNode a8 = a(optJSONObject3.optJSONArray("end"), (List<RouteNode>) null);
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                    JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i8);
                    if (optJSONObject4 != null && (optJSONArray = optJSONObject4.optJSONArray("legs")) != null && optJSONArray.length() > 0) {
                        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                            JSONObject optJSONObject5 = optJSONArray.optJSONObject(i8);
                            if (optJSONObject5 != null) {
                                WalkingRouteLine walkingRouteLine = new WalkingRouteLine();
                                walkingRouteLine.setStarting(b8);
                                walkingRouteLine.setTerminal(a8);
                                walkingRouteLine.setDistance(optJSONObject5.optInt("distance"));
                                walkingRouteLine.setDuration(optJSONObject5.optInt("duration"));
                                walkingRouteLine.setSteps(b(optJSONObject5.optJSONArray("steps")));
                                arrayList.add(walkingRouteLine);
                            }
                        }
                    }
                }
                walkingRouteResult.setRouteLines(arrayList);
                return true;
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    private TaxiInfo c(String str) {
        JSONObject jSONObject;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e8) {
            e8.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        TaxiInfo taxiInfo = new TaxiInfo();
        taxiInfo.setDesc(jSONObject.optString("remark"));
        taxiInfo.setDistance(jSONObject.optInt("distance"));
        taxiInfo.setDuration(jSONObject.optInt("duration"));
        taxiInfo.setTotalPrice((float) jSONObject.optDouble("total_price"));
        taxiInfo.setStartPrice((float) jSONObject.optDouble("start_price"));
        taxiInfo.setPerKMPrice((float) jSONObject.optDouble("km_price"));
        return taxiInfo;
    }

    public void b(String str, WalkingRouteResult walkingRouteResult) {
        if (str == null || str.equals("")) {
            walkingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    walkingRouteResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    if (optString.equals("NETWORK_ERROR")) {
                        walkingRouteResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                        return;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        walkingRouteResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                        return;
                    } else {
                        walkingRouteResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        return;
                    }
                }
            }
            if (a(str, walkingRouteResult, false) || a(str, walkingRouteResult)) {
                return;
            }
            walkingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        } catch (Exception unused) {
            walkingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        }
    }

    private RouteNode b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        RouteNode routeNode = new RouteNode();
        routeNode.setTitle(jSONObject.optString("wd"));
        routeNode.setUid(jSONObject.optString("uid"));
        routeNode.setLocation(CoordUtil.decodeLocation(jSONObject.optString(u.LANGUAGE_PT)));
        return routeNode;
    }

    private List<WalkingRouteLine.WalkingStep> b(JSONArray jSONArray) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                WalkingRouteLine.WalkingStep walkingStep = new WalkingRouteLine.WalkingStep();
                walkingStep.setDirection(optJSONObject.optInt("direction") * 30);
                walkingStep.setDistance(optJSONObject.optInt("distance"));
                walkingStep.setDuration(optJSONObject.optInt("duration"));
                walkingStep.setEntrance(RouteNode.location(CoordUtil.decodeLocation(optJSONObject.optString("start_location"))));
                walkingStep.setExit(RouteNode.location(CoordUtil.decodeLocation(optJSONObject.optString("end_location"))));
                String optString = optJSONObject.optString("instructions");
                if (optString != null && optString.length() >= 4) {
                    optString = optString.replaceAll("</?[a-z]>", "");
                }
                walkingStep.setInstructions(optString);
                walkingStep.setEntranceInstructions(optJSONObject.optString("start_instructions"));
                walkingStep.setExitInstructions(optJSONObject.optString("end_instructions"));
                walkingStep.setPathString(optJSONObject.optString("path"));
                arrayList.add(walkingStep);
            }
        }
        return arrayList;
    }

    private RouteNode a(JSONArray jSONArray, List<RouteNode> list) {
        int length;
        if (jSONArray != null && (length = jSONArray.length()) > 0) {
            for (int i8 = 0; i8 < length; i8++) {
                RouteNode b8 = b(jSONArray.optJSONObject(i8));
                if (i8 == length - 1) {
                    return b8;
                }
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(b8);
            }
        }
        return null;
    }
}
