package com.baidu.platform.a.h;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.CityInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.route.BikingRouteLine;
import com.baidu.mapapi.search.route.BikingRouteResult;
import com.baidu.mapapi.search.route.OnGetRoutePlanResultListener;
import com.baidu.mapapi.search.route.SuggestAddrInfo;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends com.baidu.platform.base.f {
    private SuggestAddrInfo b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        SuggestAddrInfo suggestAddrInfo = new SuggestAddrInfo();
        JSONObject optJSONObject = jSONObject.optJSONObject("origin");
        JSONObject optJSONObject2 = jSONObject.optJSONObject(FirebaseAnalytics.Param.DESTINATION);
        if (optJSONObject != null) {
            int optInt = optJSONObject.optInt("listType");
            String optString = optJSONObject.optString("cityName");
            if (optInt == 1) {
                suggestAddrInfo.setSuggestStartCity(a(optJSONObject, FirebaseAnalytics.Param.CONTENT));
            } else if (optInt == 0) {
                suggestAddrInfo.setSuggestStartNode(a(optJSONObject, FirebaseAnalytics.Param.CONTENT, optString));
            }
        }
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt("listType");
            String optString2 = optJSONObject2.optString("cityName");
            if (optInt2 == 1) {
                suggestAddrInfo.setSuggestEndCity(a(optJSONObject2, FirebaseAnalytics.Param.CONTENT));
            } else if (optInt2 == 0) {
                suggestAddrInfo.setSuggestEndNode(a(optJSONObject2, FirebaseAnalytics.Param.CONTENT, optString2));
            }
        }
        return suggestAddrInfo;
    }

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        BikingRouteResult bikingRouteResult = new BikingRouteResult();
        if (str == null || str.equals("")) {
            bikingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return bikingRouteResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    bikingRouteResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return bikingRouteResult;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    if (optString.equals("NETWORK_ERROR")) {
                        bikingRouteResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        bikingRouteResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        bikingRouteResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return bikingRouteResult;
                }
            }
            if (!a(str, (SearchResult) bikingRouteResult, false) && !a(str, bikingRouteResult)) {
                bikingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            }
            return bikingRouteResult;
        } catch (Exception unused) {
            bikingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return bikingRouteResult;
        }
    }

    private RouteNode b(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject;
        if (jSONObject == null || str == null || "".equals(str) || (optJSONObject = jSONObject.optJSONObject(str)) == null) {
            return null;
        }
        RouteNode routeNode = new RouteNode();
        routeNode.setTitle(optJSONObject.optString("wd"));
        routeNode.setUid(optJSONObject.optString("uid"));
        JSONObject optJSONObject2 = optJSONObject.optJSONObject(str2);
        if (optJSONObject2 != null) {
            LatLng latLng = new LatLng(optJSONObject2.optDouble("lat"), optJSONObject2.optDouble("lng"));
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng = CoordTrans.baiduToGcj(latLng);
            }
            routeNode.setLocation(latLng);
        }
        return routeNode;
    }

    private boolean a(String str, BikingRouteResult bikingRouteResult) {
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("status_sdk");
                if (optInt != 0) {
                    if (optInt != 1) {
                        if (optInt == 2) {
                            bikingRouteResult.error = SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
                            bikingRouteResult.setMessage(jSONObject.optString("message"));
                        } else if (optInt != 2002) {
                            return false;
                        }
                        bikingRouteResult.error = SearchResult.ERRORNO.BIKE_ROUTE_DISTANCE_LIMIT;
                        bikingRouteResult.setMessage(jSONObject.optString("message"));
                        return true;
                    }
                    bikingRouteResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    return true;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("result");
                if (optJSONObject2 == null) {
                    return false;
                }
                int optInt2 = jSONObject.optInt("type");
                if (optInt2 == 1) {
                    bikingRouteResult.setSuggestAddrInfo(b(optJSONObject2));
                    bikingRouteResult.error = SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR;
                } else {
                    if (optInt2 != 2 || (optJSONArray = optJSONObject2.optJSONArray("routes")) == null || optJSONArray.length() <= 0) {
                        return false;
                    }
                    RouteNode b8 = b(optJSONObject2, "origin", "originPt");
                    RouteNode b9 = b(optJSONObject2, FirebaseAnalytics.Param.DESTINATION, "destinationPt");
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        BikingRouteLine bikingRouteLine = new BikingRouteLine();
                        try {
                            optJSONObject = optJSONArray.optJSONObject(i8);
                        } catch (Exception unused) {
                        }
                        if (optJSONObject == null) {
                            return false;
                        }
                        bikingRouteLine.setStarting(b8);
                        bikingRouteLine.setTerminal(b9);
                        bikingRouteLine.setDistance(optJSONObject.optInt("distance"));
                        bikingRouteLine.setDuration(optJSONObject.optInt("duration"));
                        bikingRouteLine.setSteps(a(optJSONObject.optJSONArray("steps")));
                        arrayList.add(bikingRouteLine);
                    }
                    bikingRouteResult.setRouteLines(arrayList);
                }
                return true;
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    private List<BikingRouteLine.BikingStep> a(JSONArray jSONArray) {
        boolean z7 = jSONArray == null;
        int length = jSONArray.length();
        if ((length <= 0) || z7) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < length; i8++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i8);
            if (optJSONObject != null) {
                BikingRouteLine.BikingStep bikingStep = new BikingRouteLine.BikingStep();
                bikingStep.setDirection(optJSONObject.optInt("direction") * 30);
                bikingStep.setDistance(optJSONObject.optInt("distance"));
                bikingStep.setDuration(optJSONObject.optInt("duration"));
                bikingStep.setName(optJSONObject.optString("name"));
                bikingStep.setTurnType(optJSONObject.optString("turn_type"));
                bikingStep.setRestrictionsInfo(optJSONObject.optString("restrictions_info"));
                bikingStep.setRestrictionsStatus(optJSONObject.optInt("restrictions_status"));
                bikingStep.setEntrance(RouteNode.location(a(optJSONObject.optJSONObject("stepOriginLocation"))));
                bikingStep.setExit(RouteNode.location(a(optJSONObject.optJSONObject("stepDestinationLocation"))));
                String optString = optJSONObject.optString("instructions");
                if (optString != null && optString.length() >= 4) {
                    optString = optString.replaceAll("</?[a-z]>", "");
                }
                bikingStep.setInstructions(optString);
                bikingStep.setEntranceInstructions(optJSONObject.optString("stepOriginInstruction"));
                bikingStep.setExitInstructions(optJSONObject.optString("stepDestinationInstruction"));
                bikingStep.setPathString(optJSONObject.optString("path"));
                arrayList.add(bikingStep);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    private LatLng a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LatLng latLng = new LatLng(jSONObject.optDouble("lat"), jSONObject.optDouble("lng"));
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(latLng) : latLng;
    }

    public List<CityInfo> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        if (jSONObject == null || str == null || str.equals("") || (optJSONArray = jSONObject.optJSONArray(str)) == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i8);
            if (jSONObject2 != null) {
                CityInfo cityInfo = new CityInfo();
                cityInfo.num = jSONObject2.optInt("number");
                cityInfo.city = jSONObject2.optString("name");
                arrayList.add(cityInfo);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    private List<PoiInfo> a(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && str != null && !"".equals(str) && (optJSONArray = jSONObject.optJSONArray(str)) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                JSONObject jSONObject2 = (JSONObject) optJSONArray.opt(i8);
                if (jSONObject2 != null) {
                    PoiInfo poiInfo = new PoiInfo();
                    if (jSONObject2.has("address")) {
                        poiInfo.address = jSONObject2.optString("address");
                    }
                    poiInfo.uid = jSONObject2.optString("uid");
                    poiInfo.name = jSONObject2.optString("name");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("location");
                    if (optJSONObject != null) {
                        poiInfo.location = new LatLng(optJSONObject.optDouble("lat"), optJSONObject.optDouble("lng"));
                        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                            poiInfo.location = CoordTrans.baiduToGcj(poiInfo.location);
                        }
                    }
                    poiInfo.city = str2;
                    arrayList.add(poiInfo);
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
        }
        return null;
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetRoutePlanResultListener)) {
            return;
        }
        ((OnGetRoutePlanResultListener) obj).onGetBikingRouteResult((BikingRouteResult) searchResult);
    }
}
