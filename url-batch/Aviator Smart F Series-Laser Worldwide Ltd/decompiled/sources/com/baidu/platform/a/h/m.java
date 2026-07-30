package com.baidu.platform.a.h;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.search.core.CityInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.route.DrivingRouteResult;
import com.baidu.mapapi.search.route.OnGetRoutePlanResultListener;
import com.baidu.mapapi.search.route.SuggestAddrInfo;
import com.baidu.mapapi.search.route.TransitRouteResult;
import com.baidu.mapapi.search.route.WalkingRouteResult;
import com.baidu.platform.base.SearchType;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class m extends com.baidu.platform.base.f {

    /* renamed from: b, reason: collision with root package name */
    SuggestAddrInfo f8621b = null;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f8622c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8623a;

        static {
            int[] iArr = new int[SearchType.values().length];
            f8623a = iArr;
            try {
                iArr[SearchType.TRANSIT_ROUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8623a[SearchType.DRIVE_ROUTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8623a[SearchType.WALK_ROUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private boolean b(String str) {
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                if (optJSONObject == null || optJSONObject.optInt("type") != 23 || optJSONObject.optInt("error") != 0) {
                    return false;
                }
                SuggestAddrInfo a8 = a(jSONObject);
                this.f8621b = a8;
                return a8 != null;
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        TransitRouteResult transitRouteResult;
        SearchType a8 = a();
        if (b(str)) {
            this.f8622c = true;
        } else {
            this.f8622c = false;
        }
        int i8 = a.f8623a[a8.ordinal()];
        if (i8 == 1) {
            TransitRouteResult transitRouteResult2 = new TransitRouteResult();
            if (this.f8622c) {
                transitRouteResult2.setSuggestAddrInfo(this.f8621b);
                transitRouteResult2.error = SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR;
                transitRouteResult = transitRouteResult2;
            } else {
                ((n) this).b(str, transitRouteResult2);
                transitRouteResult = transitRouteResult2;
            }
        } else if (i8 == 2) {
            DrivingRouteResult drivingRouteResult = new DrivingRouteResult();
            if (this.f8622c) {
                drivingRouteResult.setSuggestAddrInfo(this.f8621b);
                drivingRouteResult.error = SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR;
                transitRouteResult = drivingRouteResult;
            } else {
                ((c) this).a(str, drivingRouteResult);
                transitRouteResult = drivingRouteResult;
            }
        } else {
            if (i8 != 3) {
                return null;
            }
            WalkingRouteResult walkingRouteResult = new WalkingRouteResult();
            if (this.f8622c) {
                walkingRouteResult.setSuggestAddrInfo(this.f8621b);
                walkingRouteResult.error = SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR;
                transitRouteResult = walkingRouteResult;
            } else {
                ((p) this).b(str, walkingRouteResult);
                transitRouteResult = walkingRouteResult;
            }
        }
        return transitRouteResult;
    }

    private List<List<CityInfo>> b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return null;
        }
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            List<CityInfo> a8 = a((JSONArray) optJSONArray.opt(i8));
            if (a8 != null) {
                arrayList.add(a8);
            }
        }
        return arrayList;
    }

    private SuggestAddrInfo a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject jSONObject2;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("traffic_pois")) == null) {
            return null;
        }
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("option");
        JSONObject optJSONObject3 = optJSONObject.optJSONObject(FirebaseAnalytics.Param.CONTENT);
        if (optJSONObject2 != null && optJSONObject3 != null) {
            JSONObject optJSONObject4 = optJSONObject2.optJSONObject("start_city");
            String optString = optJSONObject4 != null ? optJSONObject4.optString("cname") : null;
            JSONArray optJSONArray = optJSONObject2.optJSONArray("end_city");
            String optString2 = (optJSONArray == null || (jSONObject2 = (JSONObject) optJSONArray.opt(0)) == null) ? null : jSONObject2.optString("cname");
            JSONArray optJSONArray2 = optJSONObject2.optJSONArray("city_list");
            JSONArray optJSONArray3 = optJSONObject2.optJSONArray("prio_flag");
            if (optJSONArray2 != null && optJSONArray3 != null) {
                int length = optJSONArray2.length();
                boolean[] zArr = new boolean[length];
                boolean[] zArr2 = new boolean[length];
                for (int i8 = 0; i8 < length; i8++) {
                    int parseInt = Integer.parseInt(optJSONArray2.optString(i8));
                    int parseInt2 = Integer.parseInt(optJSONArray3.optString(i8));
                    boolean z7 = true;
                    zArr[i8] = parseInt == 1;
                    if (parseInt2 != 1) {
                        z7 = false;
                    }
                    zArr2[i8] = z7;
                }
                SuggestAddrInfo suggestAddrInfo = new SuggestAddrInfo();
                for (int i9 = 0; i9 < length; i9++) {
                    if (!zArr2[i9]) {
                        if (zArr[i9]) {
                            if (i9 == 0) {
                                suggestAddrInfo.setSuggestStartCity(a(optJSONObject3.optJSONArray("start")));
                            } else if (i9 == length - 1 && i9 > 0) {
                                suggestAddrInfo.setSuggestEndCity(a(optJSONObject3.optJSONArray("end")));
                            } else {
                                suggestAddrInfo.setSuggestWpCity(b(optJSONObject3, "multi_waypoints"));
                            }
                        } else if (i9 == 0) {
                            suggestAddrInfo.setSuggestStartNode(a(optJSONObject3.optJSONArray("start"), optString));
                        } else if (i9 == length - 1 && i9 > 0) {
                            suggestAddrInfo.setSuggestEndNode(a(optJSONObject3.optJSONArray("end"), optString2));
                        } else {
                            suggestAddrInfo.setSuggestWpNode(a(optJSONObject3, "multi_waypoints"));
                        }
                    }
                }
                return suggestAddrInfo;
            }
        }
        return null;
    }

    private List<CityInfo> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject jSONObject = (JSONObject) jSONArray.opt(i8);
            if (jSONObject != null) {
                CityInfo cityInfo = new CityInfo();
                cityInfo.num = jSONObject.optInt("num");
                cityInfo.city = jSONObject.optString("name");
                arrayList.add(cityInfo);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    private List<PoiInfo> a(JSONArray jSONArray, String str) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            JSONObject jSONObject = (JSONObject) jSONArray.opt(i8);
            if (jSONObject != null) {
                PoiInfo poiInfo = new PoiInfo();
                poiInfo.address = jSONObject.optString("addr");
                poiInfo.uid = jSONObject.optString("uid");
                poiInfo.name = jSONObject.optString("name");
                poiInfo.location = CoordUtil.decodeLocation(jSONObject.optString(MapBundleKey.MapObjKey.OBJ_GEO));
                poiInfo.city = str;
                arrayList.add(poiInfo);
            }
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    private List<List<PoiInfo>> a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return null;
        }
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            List<PoiInfo> a8 = a(((JSONObject) optJSONArray.opt(i8)).optJSONArray("way_ponits"), "");
            if (a8 != null) {
                arrayList.add(a8);
            }
        }
        return arrayList;
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetRoutePlanResultListener)) {
            return;
        }
        OnGetRoutePlanResultListener onGetRoutePlanResultListener = (OnGetRoutePlanResultListener) obj;
        int i8 = a.f8623a[a().ordinal()];
        if (i8 == 1) {
            onGetRoutePlanResultListener.onGetTransitRouteResult((TransitRouteResult) searchResult);
        } else if (i8 == 2) {
            onGetRoutePlanResultListener.onGetDrivingRouteResult((DrivingRouteResult) searchResult);
        } else {
            if (i8 != 3) {
                return;
            }
            onGetRoutePlanResultListener.onGetWalkingRouteResult((WalkingRouteResult) searchResult);
        }
    }
}
