package com.baidu.platform.a.e;

import android.text.TextUtils;
import android.util.Log;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.geocode.GeoCodeResult;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.base.f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8595b = "b";

    /* renamed from: c, reason: collision with root package name */
    private String f8596c;

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        GeoCodeResult geoCodeResult = new GeoCodeResult();
        if (str == null || str.equals("")) {
            geoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return geoCodeResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("SDK_InnerError")) {
                if (!a(str, geoCodeResult, false) && !a(str, geoCodeResult)) {
                    geoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
                return geoCodeResult;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
            if (optJSONObject.has("PermissionCheckError")) {
                geoCodeResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                return geoCodeResult;
            }
            if (!optJSONObject.has("httpStateError")) {
                geoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return geoCodeResult;
            }
            String optString = optJSONObject.optString("httpStateError");
            optString.hashCode();
            if (optString.equals("NETWORK_ERROR")) {
                geoCodeResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
            } else if (optString.equals("REQUEST_ERROR")) {
                geoCodeResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
            } else {
                geoCodeResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
            }
            return geoCodeResult;
        } catch (JSONException e8) {
            Log.e(f8595b, "JSONException caught", e8);
            geoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return geoCodeResult;
        }
    }

    public void b(String str) {
        this.f8596c = str;
    }

    private boolean a(String str, GeoCodeResult geoCodeResult) {
        if (TextUtils.isEmpty(str) || geoCodeResult == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("status");
            if (optInt != 0) {
                if (optInt == 1) {
                    geoCodeResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                } else if (optInt != 2) {
                    geoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                } else {
                    geoCodeResult.error = SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
                }
                return false;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("result");
            if (optJSONObject == null) {
                geoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return false;
            }
            geoCodeResult.setLocation(a(optJSONObject.optJSONObject("location")));
            geoCodeResult.setAddress(this.f8596c);
            geoCodeResult.setPrecise(optJSONObject.optInt("precise"));
            geoCodeResult.setConfidence(optJSONObject.optInt("confidence"));
            geoCodeResult.setLevel(optJSONObject.optString("level"));
            geoCodeResult.error = SearchResult.ERRORNO.NO_ERROR;
            return true;
        } catch (JSONException e8) {
            geoCodeResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            Log.e(f8595b, "Parse GeoCodeResult catch JSONException", e8);
            return true;
        }
    }

    private LatLng a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        double optDouble = jSONObject.optDouble("lat");
        double optDouble2 = jSONObject.optDouble("lng");
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            return CoordTrans.baiduToGcj(new LatLng(optDouble, optDouble2));
        }
        return new LatLng(optDouble, optDouble2);
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetGeoCoderResultListener)) {
            return;
        }
        ((OnGetGeoCoderResultListener) obj).onGetGeoCodeResult((GeoCodeResult) searchResult);
    }
}
