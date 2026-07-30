package com.baidu.platform.a.i;

import com.baidu.location.LocationConst;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.share.OnGetShareUrlResultListener;
import com.baidu.mapapi.search.share.ShareUrlResult;
import com.baidu.platform.base.SearchType;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends com.baidu.platform.base.f {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8624a;

        static {
            int[] iArr = new int[SearchType.values().length];
            f8624a = iArr;
            try {
                iArr[SearchType.POI_DETAIL_SHARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8624a[SearchType.LOCATION_SEARCH_SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        ShareUrlResult shareUrlResult = new ShareUrlResult();
        if (str == null || str.equals("")) {
            shareUrlResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return shareUrlResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("SDK_InnerError")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
                if (optJSONObject.has("PermissionCheckError")) {
                    shareUrlResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    return shareUrlResult;
                }
                if (optJSONObject.has("httpStateError")) {
                    String optString = optJSONObject.optString("httpStateError");
                    if (optString.equals("NETWORK_ERROR")) {
                        shareUrlResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                    } else if (optString.equals("REQUEST_ERROR")) {
                        shareUrlResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                    } else {
                        shareUrlResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                    }
                    return shareUrlResult;
                }
            }
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (jSONObject2.optString(LocationConst.HDYawConst.KEY_HD_YAW_STATE).equals(FirebaseAnalytics.Param.SUCCESS)) {
                    shareUrlResult.setUrl(jSONObject2.optString("url"));
                    shareUrlResult.setType(a().ordinal());
                    shareUrlResult.error = SearchResult.ERRORNO.NO_ERROR;
                } else {
                    shareUrlResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                }
            } catch (JSONException e8) {
                e8.printStackTrace();
                shareUrlResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            }
            return shareUrlResult;
        } catch (Exception unused) {
            shareUrlResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return shareUrlResult;
        }
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetShareUrlResultListener)) {
            return;
        }
        OnGetShareUrlResultListener onGetShareUrlResultListener = (OnGetShareUrlResultListener) obj;
        int i8 = a.f8624a[a().ordinal()];
        if (i8 == 1) {
            onGetShareUrlResultListener.onGetPoiDetailShareUrlResult((ShareUrlResult) searchResult);
        } else {
            if (i8 != 2) {
                return;
            }
            onGetShareUrlResultListener.onGetLocationShareUrlResult((ShareUrlResult) searchResult);
        }
    }
}
