package com.baidu.platform.a.k;

import android.util.Log;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.svg.OnGetSVGTileBatchSearchResultListener;
import com.baidu.mapapi.search.svg.OnGetSVGTileSearchResultListener;
import com.baidu.mapapi.search.svg.SVGTileResult;
import com.baidu.platform.base.SearchType;
import com.baidu.platform.base.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends f {

    /* renamed from: b, reason: collision with root package name */
    private static final String f8632b = "c";

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        SVGTileResult sVGTileResult = new SVGTileResult();
        if (str == null || str.isEmpty()) {
            sVGTileResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return sVGTileResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                sVGTileResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return sVGTileResult;
            }
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject != null && optJSONObject.has("PermissionCheckError")) {
                    sVGTileResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return sVGTileResult;
                }
                if (optJSONObject != null && optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    optString.hashCode();
                    if (optString.equals("NETWORK_ERROR")) {
                        sVGTileResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        sVGTileResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        sVGTileResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return sVGTileResult;
                }
            }
            if (!a(str, sVGTileResult, true)) {
                a(str, sVGTileResult);
            }
            return sVGTileResult;
        } catch (JSONException e8) {
            Log.e(f8632b, "ParseSVGTileResult: ", e8);
            sVGTileResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return sVGTileResult;
        }
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj instanceof OnGetSVGTileSearchResultListener) {
            ((OnGetSVGTileSearchResultListener) obj).onGetSVGTileResult((SVGTileResult) searchResult);
        } else if (obj instanceof OnGetSVGTileBatchSearchResultListener) {
            ((OnGetSVGTileBatchSearchResultListener) obj).onGetBatchSVGTilesResult((SVGTileResult) searchResult);
        }
    }

    private boolean a(String str, SVGTileResult sVGTileResult) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.length() == 0) {
                sVGTileResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                return false;
            }
            int optInt = jSONObject.optInt("status");
            if (optInt == 0) {
                return a(jSONObject, sVGTileResult);
            }
            if (optInt == 1) {
                sVGTileResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
            } else if (optInt != 2) {
                sVGTileResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            } else {
                sVGTileResult.error = SearchResult.ERRORNO.SEARCH_OPTION_ERROR;
            }
            return false;
        } catch (JSONException e8) {
            Log.e(f8632b, "ParseSVGTileResult error: ", e8);
            sVGTileResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return false;
        }
    }

    private boolean a(JSONObject jSONObject, SVGTileResult sVGTileResult) {
        SearchType searchType = this.f8716a;
        if (searchType == SearchType.SVG_TILE_SEARCH) {
            sVGTileResult.setTilePath(jSONObject.optString("path"));
            return true;
        }
        if (searchType != SearchType.SVG_TILE_BATCH_SEARCH) {
            return true;
        }
        sVGTileResult.setTileZipPath(jSONObject.optString("path"));
        return true;
    }
}
