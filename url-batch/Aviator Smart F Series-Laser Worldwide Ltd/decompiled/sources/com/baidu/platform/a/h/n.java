package com.baidu.platform.a.h;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import com.baidu.mapapi.search.core.VehicleInfo;
import com.baidu.mapapi.search.route.TransitRouteLine;
import com.baidu.mapapi.search.route.TransitRouteResult;
import com.moyoung.dafit.module.common.utils.u;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n extends m {
    private boolean a(String str, TransitRouteResult transitRouteResult) {
        JSONArray jSONArray;
        RouteNode routeNode;
        JSONArray jSONArray2;
        RouteNode routeNode2;
        int i8 = 0;
        if (str == null || str.length() <= 0) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("result");
            if (optJSONObject == null) {
                return false;
            }
            int optInt = optJSONObject.optInt("error");
            if (optInt != 0) {
                if (optInt == 1) {
                    transitRouteResult.error = SearchResult.ERRORNO.ST_EN_TOO_NEAR;
                    return true;
                }
                if (optInt != 200) {
                    return false;
                }
                transitRouteResult.error = SearchResult.ERRORNO.NOT_SUPPORT_BUS_2CITY;
                return true;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("bus");
            if (optJSONObject2 == null) {
                return false;
            }
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("taxi");
            if (optJSONObject3 != null) {
                transitRouteResult.setTaxiInfo(b(optJSONObject3));
            }
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("option");
            if (optJSONObject4 == null) {
                return false;
            }
            RouteNode c8 = c(optJSONObject4, "start");
            RouteNode c9 = c(optJSONObject4, "end");
            JSONArray optJSONArray = optJSONObject2.optJSONArray("routes");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            int i9 = 0;
            while (i9 < optJSONArray.length()) {
                JSONObject jSONObject2 = (JSONObject) ((JSONObject) optJSONArray.opt(i9)).optJSONArray("legs").opt(i8);
                if (jSONObject2 != null) {
                    TransitRouteLine transitRouteLine = new TransitRouteLine();
                    transitRouteLine.setDistance(jSONObject2.optInt("distance"));
                    transitRouteLine.setDuration(jSONObject2.optInt("duration"));
                    transitRouteLine.setStarting(c8);
                    transitRouteLine.setTerminal(c9);
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("steps");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        int i10 = 0;
                        while (i10 < optJSONArray2.length()) {
                            JSONArray optJSONArray3 = optJSONArray2.optJSONObject(i10).optJSONArray("step");
                            if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                                jSONArray2 = optJSONArray;
                                routeNode2 = c9;
                            } else {
                                JSONObject optJSONObject5 = optJSONArray3.optJSONObject(i8);
                                TransitRouteLine.TransitStep transitStep = new TransitRouteLine.TransitStep();
                                transitStep.setEntrace(RouteNode.location(CoordUtil.decodeLocation(optJSONObject5.optString("start_location"))));
                                transitStep.setExit(RouteNode.location(CoordUtil.decodeLocation(optJSONObject5.optString("end_location"))));
                                jSONArray2 = optJSONArray;
                                routeNode2 = c9;
                                if (optJSONObject5.optInt("type") == 5) {
                                    transitStep.setStepType(TransitRouteLine.TransitStep.TransitRouteStepType.WAKLING);
                                } else {
                                    transitStep.setStepType(TransitRouteLine.TransitStep.TransitRouteStepType.BUSLINE);
                                }
                                transitStep.setInstructions(d(optJSONObject5.optString("instructions")));
                                transitStep.setDistance(optJSONObject5.optInt("distance"));
                                transitStep.setDuration(optJSONObject5.optInt("duration"));
                                transitStep.setPathString(optJSONObject5.optString("path"));
                                if (optJSONObject5.has("vehicle")) {
                                    transitStep.setVehicleInfo(c(optJSONObject5.optString("vehicle")));
                                    JSONObject optJSONObject6 = optJSONObject5.optJSONObject("vehicle");
                                    transitStep.getEntrance().setUid(optJSONObject6.optString("start_uid"));
                                    transitStep.getEntrance().setTitle(optJSONObject6.optString("start_name"));
                                    transitStep.getExit().setUid(optJSONObject6.optString("end_uid"));
                                    transitStep.getExit().setTitle(optJSONObject6.optString("end_name"));
                                    Integer valueOf = Integer.valueOf(optJSONObject6.optInt("type"));
                                    if (valueOf == null) {
                                        transitStep.setStepType(TransitRouteLine.TransitStep.TransitRouteStepType.BUSLINE);
                                    } else if (valueOf.intValue() == 1) {
                                        transitStep.setStepType(TransitRouteLine.TransitStep.TransitRouteStepType.SUBWAY);
                                    } else {
                                        transitStep.setStepType(TransitRouteLine.TransitStep.TransitRouteStepType.BUSLINE);
                                    }
                                }
                                arrayList2.add(transitStep);
                            }
                            i10++;
                            optJSONArray = jSONArray2;
                            c9 = routeNode2;
                            i8 = 0;
                        }
                        jSONArray = optJSONArray;
                        routeNode = c9;
                        transitRouteLine.setSteps(arrayList2);
                        arrayList.add(transitRouteLine);
                        i9++;
                        optJSONArray = jSONArray;
                        c9 = routeNode;
                        i8 = 0;
                    }
                }
                jSONArray = optJSONArray;
                routeNode = c9;
                i9++;
                optJSONArray = jSONArray;
                c9 = routeNode;
                i8 = 0;
            }
            transitRouteResult.setRoutelines(arrayList);
            return true;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    private RouteNode c(JSONObject jSONObject, String str) {
        if (jSONObject == null || str == null || "".equals(str)) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        RouteNode routeNode = new RouteNode();
        routeNode.setTitle(optJSONObject.optString("wd"));
        routeNode.setUid(optJSONObject.optString("uid"));
        routeNode.setLocation(CoordUtil.decodeLocation(optJSONObject.optString(u.LANGUAGE_PT)));
        return routeNode;
    }

    private String d(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z7 = false;
        for (char c8 : str.toCharArray()) {
            if (c8 == '<') {
                z7 = true;
            } else if (c8 == '>') {
                z7 = false;
            } else if (!z7) {
                sb.append(c8);
            }
        }
        return sb.toString();
    }

    public void b(String str, TransitRouteResult transitRouteResult) {
        if (str == null || str.equals("")) {
            transitRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    transitRouteResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    if (optString.equals("NETWORK_ERROR")) {
                        transitRouteResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                        return;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        transitRouteResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                        return;
                    } else {
                        transitRouteResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                        return;
                    }
                }
            }
            if (a(str, transitRouteResult, false) || a(str, transitRouteResult)) {
                return;
            }
            transitRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        } catch (Exception unused) {
            transitRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        }
    }

    private VehicleInfo c(String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e8) {
            e8.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        VehicleInfo vehicleInfo = new VehicleInfo();
        vehicleInfo.setZonePrice(jSONObject.optInt("zone_price"));
        vehicleInfo.setTotalPrice(jSONObject.optInt("total_price"));
        vehicleInfo.setTitle(jSONObject.optString("name"));
        vehicleInfo.setPassStationNum(jSONObject.optInt("stop_num"));
        vehicleInfo.setUid(jSONObject.optString("uid"));
        vehicleInfo.setStartTime(jSONObject.optString("start_time"));
        vehicleInfo.setEndTime(jSONObject.optString(com.arthenica.ffmpegkit.f.KEY_END_TIME));
        vehicleInfo.setHeadWay(jSONObject.optString("headway"));
        vehicleInfo.setDirectText(jSONObject.optString("direct_text"));
        return vehicleInfo;
    }

    private TaxiInfo b(JSONObject jSONObject) {
        float f8;
        float f9;
        float f10;
        if (jSONObject == null) {
            return null;
        }
        TaxiInfo taxiInfo = new TaxiInfo();
        JSONArray optJSONArray = jSONObject.optJSONArray("detail");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        int length = optJSONArray.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                f8 = 0.0f;
                f9 = 0.0f;
                f10 = 0.0f;
                break;
            }
            JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i8);
            if (jSONObject2 != null && jSONObject2.optString("desc").contains("白天")) {
                f8 = (float) jSONObject2.optDouble("km_price");
                f9 = (float) jSONObject2.optDouble("start_price");
                f10 = (float) jSONObject2.optDouble("total_price");
                break;
            }
            i8++;
        }
        taxiInfo.setDesc(jSONObject.optString("remark"));
        taxiInfo.setDistance(jSONObject.optInt("distance"));
        taxiInfo.setDuration(jSONObject.optInt("duration"));
        taxiInfo.setTotalPrice(f10);
        taxiInfo.setStartPrice(f9);
        taxiInfo.setPerKMPrice(f8);
        return taxiInfo;
    }
}
