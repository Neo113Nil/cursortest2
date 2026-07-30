package com.baidu.platform.a.d;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.district.DistrictResult;
import com.baidu.mapapi.search.district.OnGetDistricSearchResultListener;
import com.baidu.platform.base.f;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends f {

    /* renamed from: b, reason: collision with root package name */
    boolean f8591b = false;

    /* renamed from: c, reason: collision with root package name */
    String f8592c = null;

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(String str, DistrictResult districtResult) {
        List<List<LatLng>> decodeLocationList2D;
        if (str != null && !str.equals("") && districtResult != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("result");
                JSONObject optJSONObject2 = jSONObject.optJSONObject(FirebaseAnalytics.Param.CONTENT);
                if (optJSONObject == null || optJSONObject2 == null || optJSONObject.optInt("error") != 0) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                if (this.f8592c != null) {
                    try {
                        decodeLocationList2D = CoordUtil.decodeLocationList2D(optJSONObject2.optString(MapBundleKey.MapObjKey.OBJ_GEO));
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    if (decodeLocationList2D != null) {
                        for (List<LatLng> list : decodeLocationList2D) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<LatLng> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(it.next());
                            }
                            arrayList.add(arrayList2);
                        }
                    }
                    if (arrayList.size() > 0) {
                        districtResult.setPolylines(arrayList);
                    }
                    districtResult.setCityName(this.f8592c);
                    districtResult.error = SearchResult.ERRORNO.NO_ERROR;
                    this.f8592c = null;
                    return true;
                }
                decodeLocationList2D = null;
                if (decodeLocationList2D != null) {
                }
                if (arrayList.size() > 0) {
                }
                districtResult.setCityName(this.f8592c);
                districtResult.error = SearchResult.ERRORNO.NO_ERROR;
                this.f8592c = null;
                return true;
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
        return false;
    }

    public void a(boolean z7) {
        this.f8591b = z7;
    }

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        DistrictResult districtResult = new DistrictResult();
        if (str == null || str.equals("")) {
            districtResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return districtResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    districtResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return districtResult;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    if (optString.equals("NETWORK_ERROR")) {
                        districtResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        districtResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        districtResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return districtResult;
                }
            }
            if (!a(str, districtResult, false)) {
                if (this.f8591b) {
                    b(str, districtResult);
                } else if (!a(str, districtResult)) {
                    districtResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
            }
            return districtResult;
        } catch (Exception unused) {
            districtResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return districtResult;
        }
    }

    private boolean a(String str, DistrictResult districtResult) {
        JSONObject optJSONObject;
        if (str != null && !"".equals(str) && districtResult != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject2 = jSONObject.optJSONObject("result");
                JSONObject optJSONObject3 = jSONObject.optJSONObject("city_result");
                if (optJSONObject2 == null || optJSONObject3 == null || optJSONObject2.optInt("error") != 0 || (optJSONObject = optJSONObject3.optJSONObject(FirebaseAnalytics.Param.CONTENT)) == null) {
                    return false;
                }
                if (optJSONObject.optJSONObject("sgeo") != null) {
                    districtResult.setCenterPt(CoordUtil.decodeLocation(optJSONObject.optString(MapBundleKey.MapObjKey.OBJ_GEO)));
                    districtResult.setCityCode(optJSONObject.optInt("code"));
                    districtResult.setCityName(optJSONObject.optString("cname"));
                    districtResult.error = SearchResult.ERRORNO.NO_ERROR;
                }
                districtResult.setCityName(optJSONObject.optString("uid"));
                this.f8592c = optJSONObject.optString("cname");
                districtResult.setCenterPt(CoordUtil.decodeLocation(optJSONObject.optString(MapBundleKey.MapObjKey.OBJ_GEO)));
                districtResult.setCityCode(optJSONObject.optInt("code"));
                return false;
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetDistricSearchResultListener)) {
            return;
        }
        ((OnGetDistricSearchResultListener) obj).onGetDistrictResult((DistrictResult) searchResult);
    }
}
