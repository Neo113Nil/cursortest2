package com.baidu.platform.a.h;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.LegLinked;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.route.IndoorRouteLine;
import com.baidu.mapapi.search.route.IntegralRouteResult;
import com.baidu.mapapi.search.route.OnGetRoutePlanResultListener;
import com.baidu.mapapi.search.route.WalkingRouteLine;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h extends com.baidu.platform.base.f {
    private RouteNode b(JSONArray jSONArray) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) <= 0) {
            return null;
        }
        return a(jSONArray.optJSONObject(length - 1));
    }

    private List<WalkingRouteLine.WalkingStep> c(JSONArray jSONArray) {
        int length;
        if (jSONArray == null || (length = jSONArray.length()) <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                WalkingRouteLine.WalkingStep walkingStep = new WalkingRouteLine.WalkingStep();
                walkingStep.setDirection(optJSONObject.optInt("direction"));
                walkingStep.setDistance(optJSONObject.optInt("distance"));
                walkingStep.setDuration(optJSONObject.optInt("duration"));
                walkingStep.setEntrance(RouteNode.location(a(optJSONObject, "sstart_location")));
                walkingStep.setExit(RouteNode.location(a(optJSONObject, "send_location")));
                String optString = optJSONObject.optString("instructions");
                if (optString.length() >= 4) {
                    optString = optString.replaceAll("</?[a-z]>", "");
                }
                walkingStep.setInstructions(optString);
                JSONArray optJSONArray = optJSONObject.optJSONArray("spath");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = (optJSONArray.length() - 5) >> 1;
                    int i9 = 0;
                    int i10 = 0;
                    for (int i11 = 0; i11 < length2; i11++) {
                        int i12 = i11 << 1;
                        i10 += optJSONArray.optInt(i12 + 6);
                        i9 += optJSONArray.optInt(i12 + 5);
                        arrayList2.add(CoordUtil.mc2ll(new GeoPoint(i10, i9)));
                    }
                    walkingStep.setWayPoints(arrayList2);
                }
                arrayList.add(walkingStep);
            }
        }
        return arrayList;
    }

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        IntegralRouteResult integralRouteResult = new IntegralRouteResult();
        if (str == null || str.equals("")) {
            integralRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return integralRouteResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    integralRouteResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return integralRouteResult;
                }
                if (optJSONObject.has("NO_ADVANCED_PERMISSION")) {
                    integralRouteResult.error = SearchResult.ERRORNO.NO_ADVANCED_PERMISSION;
                    return integralRouteResult;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    if (optString.equals("NETWORK_ERROR")) {
                        integralRouteResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        integralRouteResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        integralRouteResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return integralRouteResult;
                }
            }
            if (!a(str, integralRouteResult)) {
                integralRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            }
            return integralRouteResult;
        } catch (Exception unused) {
            integralRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return integralRouteResult;
        }
    }

    private LatLng b(JSONObject jSONObject, String str) {
        if (jSONObject.optJSONArray(str) == null) {
            return null;
        }
        GeoPoint geoPoint = new GeoPoint(0, 0);
        geoPoint.setLatitudeE6((int) r4.optDouble(1));
        geoPoint.setLongitudeE6((int) r4.optDouble(0));
        return CoordUtil.mc2ll(geoPoint);
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj instanceof OnGetRoutePlanResultListener) {
            ((OnGetRoutePlanResultListener) obj).onGetIntegralRouteResult((IntegralRouteResult) searchResult);
        }
    }

    private boolean a(String str, IntegralRouteResult integralRouteResult) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        JSONObject optJSONObject2;
        JSONArray optJSONArray2;
        JSONArray optJSONArray3;
        JSONArray jSONArray;
        RouteNode routeNode;
        if (str == null || "".equals(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (integralRouteResult == null || (optJSONObject = jSONObject.optJSONObject("result")) == null) {
                return false;
            }
            int optInt = optJSONObject.optInt("error");
            if (optInt != 0) {
                if (optInt != 4) {
                    return false;
                }
                integralRouteResult.error = SearchResult.ERRORNO.ST_EN_TOO_NEAR;
                return true;
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("walk_plan");
            if (optJSONObject3 == null) {
                return false;
            }
            JSONArray optJSONArray4 = optJSONObject3.optJSONArray("routes");
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("option");
            JSONArray optJSONArray5 = optJSONObject3.optJSONArray("indoor_navis");
            if (optJSONObject4 == null) {
                return false;
            }
            if (optJSONArray4 == null && optJSONArray5 == null) {
                return false;
            }
            if (optJSONArray5 != null && optJSONArray5.length() > 1 && optJSONArray4 != null) {
                integralRouteResult.error = SearchResult.ERRORNO.INTEGRAL_ROUTE_NOT_SUPPORT_MULTIPLE_INDOOR;
                return true;
            }
            if (optJSONArray4 != null) {
                RouteNode a8 = a(optJSONObject4.optJSONObject("start"));
                RouteNode b8 = b(optJSONObject4.optJSONArray("end"));
                ArrayList arrayList = new ArrayList();
                JSONObject optJSONObject5 = optJSONArray4.optJSONObject(0);
                if (optJSONObject5 != null && (optJSONArray3 = optJSONObject5.optJSONArray("legs")) != null && optJSONArray3.length() > 0) {
                    int i8 = 0;
                    while (i8 < optJSONArray3.length()) {
                        JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i8);
                        if (optJSONObject6 == null) {
                            jSONArray = optJSONArray3;
                            routeNode = b8;
                        } else {
                            WalkingRouteLine walkingRouteLine = new WalkingRouteLine();
                            walkingRouteLine.setStarting(a8);
                            walkingRouteLine.setTerminal(b8);
                            walkingRouteLine.setDistance(optJSONObject6.optInt("distance"));
                            walkingRouteLine.setDuration(optJSONObject6.optInt("duration"));
                            walkingRouteLine.setSteps(c(optJSONObject6.optJSONArray("steps")));
                            JSONObject optJSONObject7 = optJSONObject6.optJSONObject("leg_linked");
                            if (optJSONObject7 != null) {
                                LegLinked legLinked = new LegLinked();
                                jSONArray = optJSONArray3;
                                routeNode = b8;
                                legLinked.a(optJSONObject7.optInt("next", -1));
                                legLinked.b(optJSONObject7.optInt("priv", -1));
                                if (legLinked.a() != -1 || legLinked.b() != -1) {
                                    walkingRouteLine.setLegLinked(legLinked);
                                }
                            } else {
                                jSONArray = optJSONArray3;
                                routeNode = b8;
                            }
                            arrayList.add(walkingRouteLine);
                        }
                        i8++;
                        optJSONArray3 = jSONArray;
                        b8 = routeNode;
                    }
                }
                integralRouteResult.setRouteLines(arrayList);
            }
            if (optJSONArray5 == null) {
                return true;
            }
            ArrayList arrayList2 = new ArrayList();
            JSONObject optJSONObject8 = optJSONArray5.optJSONObject(0);
            if (optJSONObject8 != null && (optJSONArray = optJSONObject8.optJSONArray("routes")) != null && (optJSONObject2 = optJSONArray.optJSONObject(0)) != null && (optJSONArray2 = optJSONObject2.optJSONArray("legs")) != null) {
                for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                    IndoorRouteLine indoorRouteLine = new IndoorRouteLine();
                    JSONObject optJSONObject9 = optJSONArray2.optJSONObject(i9);
                    if (optJSONObject9 != null) {
                        indoorRouteLine.setDistance(optJSONObject9.optInt("distance"));
                        indoorRouteLine.setDuration(optJSONObject9.optInt("duration"));
                        indoorRouteLine.setStarting(RouteNode.location(b(optJSONObject9, "sstart_location")));
                        indoorRouteLine.setTerminal(RouteNode.location(b(optJSONObject9, "send_location")));
                        indoorRouteLine.setSteps(a(optJSONObject9.optJSONArray("steps")));
                        arrayList2.add(indoorRouteLine);
                    }
                }
            }
            if (arrayList2.size() <= 0) {
                return true;
            }
            integralRouteResult.setIndoorRouteLines(arrayList2);
            return true;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    private List<IndoorRouteLine.IndoorRouteStep> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        while (i9 < jSONArray.length()) {
            IndoorRouteLine.IndoorRouteStep indoorRouteStep = new IndoorRouteLine.IndoorRouteStep();
            JSONObject optJSONObject = jSONArray.optJSONObject(i9);
            if (optJSONObject != null) {
                indoorRouteStep.setDistance(optJSONObject.optInt("distance"));
                indoorRouteStep.setDuration(optJSONObject.optInt("duration"));
                indoorRouteStep.setBuildingId(optJSONObject.optString("buildingid"));
                indoorRouteStep.setFloorId(optJSONObject.optString("floorid"));
                indoorRouteStep.setEntrace(RouteNode.location(b(optJSONObject, "sstart_location")));
                indoorRouteStep.setExit(RouteNode.location(b(optJSONObject, "send_location")));
                JSONArray optJSONArray = optJSONObject.optJSONArray("spath");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int length = (optJSONArray.length() - 5) >> 1;
                    double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
                    double d9 = 0.0d;
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = i10 << 1;
                        double optDouble = d9 + optJSONArray.optDouble(i11 + 6);
                        d8 += optJSONArray.optDouble(i11 + 5);
                        GeoPoint geoPoint = new GeoPoint(i8, i8);
                        geoPoint.setLatitudeE6((int) optDouble);
                        geoPoint.setLongitudeE6((int) d8);
                        LatLng mc2ll = CoordUtil.mc2ll(geoPoint);
                        arrayList2.add(Double.valueOf(mc2ll.latitude));
                        arrayList2.add(Double.valueOf(mc2ll.longitude));
                        i10++;
                        d9 = optDouble;
                        i8 = 0;
                    }
                    indoorRouteStep.setPath(arrayList2);
                    indoorRouteStep.setInstructions(optJSONObject.optString("instructions"));
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("pois");
                    if (optJSONArray2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i12);
                            if (optJSONObject2 != null) {
                                IndoorRouteLine.IndoorRouteStep.IndoorStepNode indoorStepNode = new IndoorRouteLine.IndoorRouteStep.IndoorStepNode();
                                indoorStepNode.setDetail(optJSONObject2.optString("detail"));
                                indoorStepNode.setName(optJSONObject2.optString("name"));
                                indoorStepNode.setType(optJSONObject2.optInt("type"));
                                indoorStepNode.setLocation(b(optJSONObject2, "location"));
                                arrayList3.add(indoorStepNode);
                            }
                        }
                        indoorRouteStep.setStepNodes(arrayList3);
                    }
                    arrayList.add(indoorRouteStep);
                }
            }
            i9++;
            i8 = 0;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private RouteNode a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        RouteNode routeNode = new RouteNode();
        routeNode.setTitle(jSONObject.optString("wd"));
        routeNode.setUid(jSONObject.optString("uid"));
        JSONArray optJSONArray = jSONObject.optJSONArray("spt");
        if (optJSONArray != null) {
            routeNode.setLocation(CoordUtil.mc2ll(new GeoPoint(optJSONArray.optInt(1), optJSONArray.optInt(0))));
        }
        return routeNode;
    }

    private LatLng a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        return a(new LatLng(optJSONArray.optDouble(1) / 100000.0d, optJSONArray.optDouble(0) / 100000.0d));
    }

    private LatLng a(LatLng latLng) {
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? latLng : CoordTrans.gcjToBaidu(latLng);
    }
}
