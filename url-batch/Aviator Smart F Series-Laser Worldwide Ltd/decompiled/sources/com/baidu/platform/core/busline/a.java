package com.baidu.platform.core.busline;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.busline.BusLineResult;
import com.baidu.mapapi.search.busline.OnGetBusLineSearchResultListener;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.platform.base.f;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a extends f {
    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        BusLineResult busLineResult = new BusLineResult();
        if (str == null || str.equals("")) {
            busLineResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return busLineResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    busLineResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return busLineResult;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    if (optString.equals("NETWORK_ERROR")) {
                        busLineResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        busLineResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        busLineResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return busLineResult;
                }
            }
            if (!a(str, busLineResult, true) && !a(str, busLineResult)) {
                busLineResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            }
            return busLineResult;
        } catch (Exception unused) {
            busLineResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return busLineResult;
        }
    }

    public boolean a(String str, BusLineResult busLineResult) {
        JSONObject optJSONObject;
        if (str == null || "".equals(str)) {
            return false;
        }
        try {
            JSONObject optJSONObject2 = new JSONObject(str).optJSONObject("result");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("line_detail")) == null) {
                return false;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
            try {
                busLineResult.setStartTime(simpleDateFormat.parse(optJSONObject.optString("start_time")));
                busLineResult.setEndTime(simpleDateFormat.parse(optJSONObject.optString(com.arthenica.ffmpegkit.f.KEY_END_TIME)));
            } catch (ParseException e8) {
                e8.printStackTrace();
            }
            busLineResult.setBusLineName(optJSONObject.optString("name"));
            busLineResult.setMonthTicket(optJSONObject.optInt("is_mon_ticket") == 1);
            busLineResult.setUid(optJSONObject.optString("uid"));
            busLineResult.setBusCompany(optJSONObject.optString("company"));
            busLineResult.setRawName(optJSONObject.optString("raw_name"));
            busLineResult.setBasePrice(optJSONObject.optInt("ticket_price") / 100.0f);
            busLineResult.setLineDirection(optJSONObject.optString("line_direction"));
            busLineResult.setMaxPrice(optJSONObject.optInt("max_price") / 100.0f);
            busLineResult.setLineType(optJSONObject.optInt("line_type"));
            busLineResult.setTimeTable(optJSONObject.optString("time_table"));
            busLineResult.setCityId(optJSONObject.optInt("city_id"));
            busLineResult.setKindType(optJSONObject.optInt("kind_type"));
            ArrayList arrayList = new ArrayList();
            List<List<LatLng>> decodeLocationList2D = CoordUtil.decodeLocationList2D(optJSONObject.optString(MapBundleKey.MapObjKey.OBJ_GEO));
            if (decodeLocationList2D != null) {
                for (List<LatLng> list : decodeLocationList2D) {
                    BusLineResult.BusStep busStep = new BusLineResult.BusStep();
                    busStep.setWayPoints(list);
                    arrayList.add(busStep);
                }
            }
            if (arrayList.size() > 0) {
                busLineResult.setSteps(arrayList);
            }
            JSONArray optJSONArray = optJSONObject.optJSONArray("stations");
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i8);
                    if (optJSONObject3 != null) {
                        BusLineResult.BusStation busStation = new BusLineResult.BusStation();
                        busStation.setTitle(optJSONObject3.optString("name"));
                        busStation.setLocation(CoordUtil.decodeLocation(optJSONObject3.optString(MapBundleKey.MapObjKey.OBJ_GEO)));
                        busStation.setUid(optJSONObject3.optString("uid"));
                        arrayList2.add(busStation);
                        JSONArray optJSONArray2 = optJSONObject3.optJSONArray("subways");
                        if (optJSONArray2 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                                JSONObject optJSONObject4 = optJSONArray2.optJSONObject(i9);
                                if (optJSONObject4 != null) {
                                    BusLineResult.BusStation.BusSubway busSubway = new BusLineResult.BusStation.BusSubway();
                                    busSubway.setName(optJSONObject4.optString("name"));
                                    busSubway.setBackgroundColor(optJSONObject4.optString("background_color"));
                                    arrayList3.add(busSubway);
                                }
                            }
                            busStation.setSubways(arrayList3);
                        }
                        JSONArray optJSONArray3 = optJSONObject3.optJSONArray("transfer");
                        if (optJSONArray3 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i10 = 0; i10 < optJSONArray3.length(); i10++) {
                                JSONObject optJSONObject5 = optJSONArray3.optJSONObject(i10);
                                if (optJSONObject5 != null) {
                                    BusLineResult.BusStation.BusTransfer busTransfer = new BusLineResult.BusStation.BusTransfer();
                                    busTransfer.setUid(optJSONObject5.optString("uid"));
                                    busTransfer.setName(optJSONObject5.optString("name"));
                                    arrayList4.add(busTransfer);
                                }
                            }
                            busStation.setTransfers(arrayList4);
                        }
                    }
                }
                if (arrayList2.size() > 0) {
                    busLineResult.setStations(arrayList2);
                }
            }
            busLineResult.error = SearchResult.ERRORNO.NO_ERROR;
            return true;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return false;
        }
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetBusLineSearchResultListener)) {
            return;
        }
        ((OnGetBusLineSearchResultListener) obj).onGetBusLineResult((BusLineResult) searchResult);
    }
}
