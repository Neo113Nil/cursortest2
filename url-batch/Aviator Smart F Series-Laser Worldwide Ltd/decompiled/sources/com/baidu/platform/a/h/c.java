package com.baidu.platform.a.h;

import com.baidu.mapapi.common.Logger;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import com.baidu.mapapi.search.route.DrivingRouteLine;
import com.baidu.mapapi.search.route.DrivingRouteResult;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends m {
    private boolean b(String str, DrivingRouteResult drivingRouteResult) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        boolean z7 = false;
        if (str == null || "".equals(str)) {
            return false;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            JSONObject optJSONObject = jSONObject2.optJSONObject("result");
            if (optJSONObject == null) {
                return false;
            }
            int optInt = optJSONObject.optInt("error");
            if (optInt != 0) {
                if (optInt != 4) {
                    return false;
                }
                drivingRouteResult.error = SearchResult.ERRORNO.ST_EN_TOO_NEAR;
                return true;
            }
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("cars");
            if (optJSONObject2 == null) {
                return false;
            }
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("option");
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject(FirebaseAnalytics.Param.CONTENT);
            if (optJSONObject3 == null || optJSONObject4 == null) {
                return false;
            }
            RouteNode b8 = b(optJSONObject3.optJSONObject("start"));
            ArrayList arrayList = new ArrayList();
            RouteNode a8 = a(optJSONObject3.optJSONArray("end"), arrayList);
            List<DrivingRouteLine.DrivingStep> a9 = a(optJSONObject4.optJSONArray("steps"), optJSONObject4.optJSONArray("stepts"));
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray = optJSONObject4.optJSONArray("routes");
            if (optJSONArray == null) {
                return false;
            }
            int i8 = 0;
            while (i8 < optJSONArray.length()) {
                DrivingRouteLine drivingRouteLine = new DrivingRouteLine();
                JSONObject optJSONObject5 = optJSONArray.optJSONObject(i8);
                if (optJSONObject5 == null) {
                    jSONObject = optJSONObject4;
                    jSONArray = optJSONArray;
                } else {
                    JSONArray optJSONArray2 = optJSONObject5.optJSONArray("legs");
                    if (optJSONArray2 == null) {
                        return z7;
                    }
                    int length = optJSONArray2.length();
                    ArrayList arrayList3 = new ArrayList();
                    jSONObject = optJSONObject4;
                    jSONArray = optJSONArray;
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = length;
                        JSONObject optJSONObject6 = optJSONArray2.optJSONObject(i10);
                        JSONArray jSONArray2 = optJSONArray2;
                        if (optJSONObject6 != null) {
                            i9 += optJSONObject6.optInt("distance");
                            i11 += optJSONObject6.optInt("duration");
                            List<DrivingRouteLine.DrivingStep> b9 = b(optJSONObject6.optJSONArray("stepis"), a9);
                            if (b9 != null) {
                                arrayList3.addAll(b9);
                            }
                        }
                        i10++;
                        length = i12;
                        optJSONArray2 = jSONArray2;
                    }
                    drivingRouteLine.setStarting(b8);
                    drivingRouteLine.setTerminal(a8);
                    if (arrayList.size() == 0) {
                        drivingRouteLine.setWayPoints(null);
                    } else {
                        drivingRouteLine.setWayPoints(arrayList);
                    }
                    drivingRouteLine.setDistance(i9);
                    drivingRouteLine.setDuration(i11);
                    drivingRouteLine.setCongestionDistance(optJSONObject5.optInt("congestion_length"));
                    drivingRouteLine.setLightNum(optJSONObject5.optInt("light_num"));
                    drivingRouteLine.setToll(optJSONObject5.optInt("toll"));
                    if (arrayList3.size() == 0) {
                        drivingRouteLine.setSteps(null);
                    } else {
                        drivingRouteLine.setSteps(arrayList3);
                    }
                    arrayList2.add(drivingRouteLine);
                }
                i8++;
                optJSONArray = jSONArray;
                optJSONObject4 = jSONObject;
                z7 = false;
            }
            drivingRouteResult.setRouteLines(arrayList2);
            drivingRouteResult.setTaxiInfos(c(optJSONObject4.optString("taxis")));
            return true;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    private List<TaxiInfo> c(String str) {
        if (str != null && str.length() > 0) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i8);
                    if (jSONObject != null) {
                        TaxiInfo taxiInfo = new TaxiInfo();
                        String optString = jSONObject.optString("total_price");
                        if (optString != null && !optString.equals("")) {
                            taxiInfo.setTotalPrice(Float.parseFloat(optString));
                            arrayList.add(taxiInfo);
                        }
                        taxiInfo.setTotalPrice(0.0f);
                        arrayList.add(taxiInfo);
                    }
                }
                return arrayList;
            } catch (JSONException e8) {
                if (Logger.debugEnable()) {
                    e8.printStackTrace();
                }
            }
        }
        return null;
    }

    public void a(String str, DrivingRouteResult drivingRouteResult) {
        if (str == null || str.equals("")) {
            drivingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    drivingRouteResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    if (optString.equals("NETWORK_ERROR")) {
                        drivingRouteResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                        return;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        drivingRouteResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                        return;
                    } else {
                        drivingRouteResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        return;
                    }
                }
            }
            if (a(str, drivingRouteResult, false) || b(str, drivingRouteResult)) {
                return;
            }
            drivingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        } catch (Exception unused) {
            drivingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        }
    }

    private int[] c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("end");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("status");
        if (optJSONArray == null || optJSONArray2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        int length2 = optJSONArray2.length();
        int i8 = 0;
        while (i8 < length) {
            int optInt = optJSONArray.optInt(i8);
            int optInt2 = i8 < length2 ? optJSONArray2.optInt(i8) : 0;
            for (int i9 = 0; i9 < optInt; i9++) {
                arrayList.add(Integer.valueOf(optInt2));
            }
            i8++;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        return iArr;
    }

    private RouteNode a(JSONArray jSONArray, List<RouteNode> list) {
        int length;
        if (jSONArray != null && (length = jSONArray.length()) > 0) {
            for (int i8 = 0; i8 < length; i8++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i8);
                if (optJSONObject != null) {
                    RouteNode b8 = b(optJSONObject);
                    if (i8 == length - 1) {
                        return b8;
                    }
                    list.add(b8);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<DrivingRouteLine.DrivingStep> a(JSONArray jSONArray, JSONArray jSONArray2) {
        int length;
        int i8;
        boolean z7;
        int i9;
        int i10;
        if (jSONArray == null || (length = jSONArray.length()) <= 0) {
            return null;
        }
        if (jSONArray2 != null) {
            i8 = jSONArray2.length();
            if (i8 > 0) {
                z7 = true;
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                for (i9 = 0; i9 < length; i9++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                    if (optJSONObject != null) {
                        DrivingRouteLine.DrivingStep drivingStep = new DrivingRouteLine.DrivingStep();
                        drivingStep.setDistance(optJSONObject.optInt("distance"));
                        drivingStep.setDirection(optJSONObject.optInt("direction") * 30);
                        String optString = optJSONObject.optString("instructions");
                        if (optString != null && optString.length() >= 4) {
                            optString = optString.replaceAll("/?[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "").replaceAll("[(/>)<]", "");
                        }
                        drivingStep.setInstructions(optString);
                        String optString2 = optJSONObject.optString("start_instructions");
                        if (optString2 == null) {
                            int distance = drivingStep.getDistance();
                            if (distance < 1000) {
                                optString2 = " - " + distance + "米";
                                i10 = i8;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(" - ");
                                i10 = i8;
                                sb.append(distance / 1000.0d);
                                sb.append("公里");
                                optString2 = sb.toString();
                            }
                            if (i11 <= arrayList.size()) {
                                optString2 = ((DrivingRouteLine.DrivingStep) arrayList.get(i11 - 1)).getExitInstructions() + optString2;
                            }
                        } else {
                            i10 = i8;
                        }
                        drivingStep.setEntranceInstructions(optString2);
                        drivingStep.setExitInstructions(optJSONObject.optString("end_instructions"));
                        drivingStep.setNumTurns(optJSONObject.optInt("turn"));
                        drivingStep.setRoadLevel(optJSONObject.optInt("road_level"));
                        drivingStep.setRoadName(optJSONObject.optString("road_name"));
                        List<LatLng> b8 = b(optJSONObject.optJSONArray("spath"));
                        drivingStep.setPathList(b8);
                        if (b8 != null) {
                            RouteNode routeNode = new RouteNode();
                            routeNode.setLocation(b8.get(0));
                            drivingStep.setEntrance(routeNode);
                            RouteNode routeNode2 = new RouteNode();
                            routeNode2.setLocation(b8.get(b8.size() - 1));
                            drivingStep.setExit(routeNode2);
                        }
                        i8 = i10;
                        if (z7 && i9 < i8) {
                            drivingStep.setTrafficList(c(jSONArray2.optJSONObject(i9)));
                        }
                        i11++;
                        arrayList.add(drivingStep);
                    }
                }
                return arrayList;
            }
        } else {
            i8 = 0;
        }
        z7 = false;
        ArrayList arrayList2 = new ArrayList();
        int i112 = 0;
        while (i9 < length) {
        }
        return arrayList2;
    }

    private RouteNode b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        RouteNode routeNode = new RouteNode();
        routeNode.setTitle(jSONObject.optString("wd"));
        routeNode.setUid(jSONObject.optString("uid"));
        GeoPoint geoPoint = new GeoPoint(0, 0);
        if (jSONObject.optJSONArray("spt") != null) {
            geoPoint.setLongitudeE6(r5.optInt(0));
            geoPoint.setLatitudeE6(r5.optInt(1));
        }
        routeNode.setLocation(CoordUtil.mc2ll(geoPoint));
        return routeNode;
    }

    private List<LatLng> b(JSONArray jSONArray) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) < 6) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        double d9 = 0.0d;
        for (int i8 = 5; i8 < length; i8++) {
            if (i8 % 2 != 0) {
                d9 += jSONArray.optInt(i8);
            } else {
                d8 += jSONArray.optInt(i8);
                arrayList.add(CoordUtil.mc2ll(new GeoPoint(d8, d9)));
            }
        }
        return arrayList;
    }

    private List<DrivingRouteLine.DrivingStep> b(JSONArray jSONArray, List<DrivingRouteLine.DrivingStep> list) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) <= 0 || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("n");
                int optInt2 = optJSONObject.optInt("s");
                for (int i9 = 0; i9 < optInt; i9++) {
                    int i10 = optInt2 + i9;
                    if (i10 < list.size()) {
                        arrayList.add(list.get(i10));
                    }
                }
            }
        }
        return arrayList;
    }
}
