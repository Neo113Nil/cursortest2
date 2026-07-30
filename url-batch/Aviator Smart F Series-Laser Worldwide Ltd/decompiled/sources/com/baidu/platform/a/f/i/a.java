package com.baidu.platform.a.f.i;

import android.text.TextUtils;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.AsyncResponse;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.baidu.mapapi.http.wrapper.SignUtils;
import com.baidu.mapapi.search.poi.v3.AroundOption;
import com.baidu.mapapi.search.poi.v3.DetailOption;
import com.baidu.mapapi.search.poi.v3.IPoiPlaceSearch;
import com.baidu.mapapi.search.poi.v3.PoiPlaceResultCallback;
import com.baidu.mapapi.search.poi.v3.PolygonOption;
import com.baidu.mapapi.search.poi.v3.RegionOption;
import com.baidu.mapapi.search.poi.v3.SuggestionOption;
import com.baidu.mapapi.search.poi.v3.bean.AroundRequestParams;
import com.baidu.mapapi.search.poi.v3.bean.DetailRequestParams;
import com.baidu.mapapi.search.poi.v3.bean.PoiResponse;
import com.baidu.mapapi.search.poi.v3.bean.PolygonRequestParams;
import com.baidu.mapapi.search.poi.v3.bean.RegionRequestParams;
import com.baidu.mapapi.search.poi.v3.bean.SugResponse;
import com.baidu.mapapi.search.poi.v3.bean.SuggestionRequestParams;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a implements IPoiPlaceSearch {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Object> f8606a = new HashMap();

    /* renamed from: com.baidu.platform.a.f.i.a$a, reason: collision with other inner class name */
    class C0092a implements AsyncResponse.Callback<PoiResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PoiPlaceResultCallback f8607a;

        C0092a(PoiPlaceResultCallback poiPlaceResultCallback) {
            this.f8607a = poiPlaceResultCallback;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(PoiResponse poiResponse) {
            this.f8607a.success(poiResponse);
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f8607a.failed(-5, th.getMessage());
        }
    }

    class b implements AsyncResponse.Callback<PoiResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PoiPlaceResultCallback f8609a;

        b(PoiPlaceResultCallback poiPlaceResultCallback) {
            this.f8609a = poiPlaceResultCallback;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(PoiResponse poiResponse) {
            this.f8609a.success(poiResponse);
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f8609a.failed(-5, th.getMessage());
        }
    }

    class c implements AsyncResponse.Callback<PoiResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PoiPlaceResultCallback f8611a;

        c(PoiPlaceResultCallback poiPlaceResultCallback) {
            this.f8611a = poiPlaceResultCallback;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(PoiResponse poiResponse) {
            this.f8611a.success(poiResponse);
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f8611a.failed(-5, th.getMessage());
        }
    }

    class d implements AsyncResponse.Callback<PoiResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PoiPlaceResultCallback f8613a;

        d(PoiPlaceResultCallback poiPlaceResultCallback) {
            this.f8613a = poiPlaceResultCallback;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(PoiResponse poiResponse) {
            this.f8613a.success(poiResponse);
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f8613a.failed(-5, th.getMessage());
        }
    }

    class e implements AsyncResponse.Callback<SugResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PoiPlaceResultCallback f8615a;

        e(PoiPlaceResultCallback poiPlaceResultCallback) {
            this.f8615a = poiPlaceResultCallback;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(SugResponse sugResponse) {
            this.f8615a.success(sugResponse);
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f8615a.failed(-5, th.getMessage());
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        static final a f8617a = new a();
    }

    public static a a() {
        return f.f8617a;
    }

    @Override // com.baidu.mapapi.search.poi.v3.IPoiPlaceSearch
    public void searchPlaceAround(AroundOption aroundOption, PoiPlaceResultCallback<PoiResponse> poiPlaceResultCallback) {
        if (poiPlaceResultCallback == null) {
            return;
        }
        if (aroundOption == null || TextUtils.isEmpty(aroundOption.getQuery()) || aroundOption.getLocation() == null) {
            poiPlaceResultCallback.failed(-3, "MISS_PARAM");
            return;
        }
        AroundRequestParams aroundRequestParams = new AroundRequestParams();
        aroundRequestParams.apply(aroundOption);
        aroundRequestParams.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                poiPlaceResultCallback.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        aroundRequestParams.setToken(authToken);
        try {
            aroundRequestParams.setSign(SignUtils.signParams(aroundRequestParams, phoneInfoRaw, true));
            com.baidu.platform.a.f.i.b bVar = (com.baidu.platform.a.f.i.b) a(com.baidu.platform.a.f.i.b.class, 1);
            if (bVar == null) {
                poiPlaceResultCallback.failed(-6, "HOST_NOT_EXIST");
            } else {
                bVar.a(aroundRequestParams, phoneInfoRaw).setCallback(new b(poiPlaceResultCallback));
            }
        } catch (Exception e8) {
            poiPlaceResultCallback.failed(-1, e8.getMessage());
        }
    }

    @Override // com.baidu.mapapi.search.poi.v3.IPoiPlaceSearch
    public void searchPlaceDetail(DetailOption detailOption, PoiPlaceResultCallback<PoiResponse> poiPlaceResultCallback) {
        if (poiPlaceResultCallback == null) {
            return;
        }
        if (detailOption == null || (TextUtils.isEmpty(detailOption.getUid()) && TextUtils.isEmpty(detailOption.getUids()))) {
            poiPlaceResultCallback.failed(-3, "MISS_PARAM");
            return;
        }
        DetailRequestParams detailRequestParams = new DetailRequestParams();
        detailRequestParams.apply(detailOption);
        detailRequestParams.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                poiPlaceResultCallback.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        detailRequestParams.setToken(authToken);
        try {
            detailRequestParams.setSign(SignUtils.signParams(detailRequestParams, phoneInfoRaw, true));
            com.baidu.platform.a.f.i.b bVar = (com.baidu.platform.a.f.i.b) a(com.baidu.platform.a.f.i.b.class, 1);
            if (bVar == null) {
                poiPlaceResultCallback.failed(-6, "HOST_NOT_EXIST");
            } else {
                bVar.a(detailRequestParams, phoneInfoRaw).setCallback(new d(poiPlaceResultCallback));
            }
        } catch (Exception e8) {
            poiPlaceResultCallback.failed(-1, e8.getMessage());
        }
    }

    @Override // com.baidu.mapapi.search.poi.v3.IPoiPlaceSearch
    public void searchPlacePolygon(PolygonOption polygonOption, PoiPlaceResultCallback<PoiResponse> poiPlaceResultCallback) {
        if (poiPlaceResultCallback == null) {
            return;
        }
        if (polygonOption == null || TextUtils.isEmpty(polygonOption.getQuery()) || polygonOption.getBounds() == null || polygonOption.getBounds().isEmpty()) {
            poiPlaceResultCallback.failed(-3, "MISS_PARAM");
            return;
        }
        PolygonRequestParams polygonRequestParams = new PolygonRequestParams();
        polygonRequestParams.apply(polygonOption);
        polygonRequestParams.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                poiPlaceResultCallback.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        polygonRequestParams.setToken(authToken);
        try {
            polygonRequestParams.setSign(SignUtils.signParams(polygonRequestParams, phoneInfoRaw, true));
            com.baidu.platform.a.f.i.b bVar = (com.baidu.platform.a.f.i.b) a(com.baidu.platform.a.f.i.b.class, 1);
            if (bVar == null) {
                poiPlaceResultCallback.failed(-6, "HOST_NOT_EXIST");
            } else {
                bVar.a(polygonRequestParams, phoneInfoRaw).setCallback(new c(poiPlaceResultCallback));
            }
        } catch (Exception e8) {
            poiPlaceResultCallback.failed(-1, e8.getMessage());
        }
    }

    @Override // com.baidu.mapapi.search.poi.v3.IPoiPlaceSearch
    public void searchPlaceRegion(RegionOption regionOption, PoiPlaceResultCallback<PoiResponse> poiPlaceResultCallback) {
        if (poiPlaceResultCallback == null) {
            return;
        }
        if (regionOption == null || TextUtils.isEmpty(regionOption.getQuery()) || TextUtils.isEmpty(regionOption.getRegion())) {
            poiPlaceResultCallback.failed(-3, "MISS_PARAM");
            return;
        }
        RegionRequestParams regionRequestParams = new RegionRequestParams();
        regionRequestParams.apply(regionOption);
        regionRequestParams.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                poiPlaceResultCallback.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        regionRequestParams.setToken(authToken);
        try {
            regionRequestParams.setSign(SignUtils.signParams(regionRequestParams, phoneInfoRaw, true));
            com.baidu.platform.a.f.i.b bVar = (com.baidu.platform.a.f.i.b) a(com.baidu.platform.a.f.i.b.class, 1);
            if (bVar == null) {
                poiPlaceResultCallback.failed(-6, "HOST_NOT_EXIST");
            } else {
                bVar.a(regionRequestParams, phoneInfoRaw).setCallback(new C0092a(poiPlaceResultCallback));
            }
        } catch (Exception e8) {
            poiPlaceResultCallback.failed(-1, e8.getMessage());
        }
    }

    @Override // com.baidu.mapapi.search.poi.v3.IPoiPlaceSearch
    public void searchPlaceSuggestion(SuggestionOption suggestionOption, PoiPlaceResultCallback<SugResponse> poiPlaceResultCallback) {
        if (poiPlaceResultCallback == null) {
            return;
        }
        if (suggestionOption == null || TextUtils.isEmpty(suggestionOption.getQuery()) || TextUtils.isEmpty(suggestionOption.getRegion())) {
            poiPlaceResultCallback.failed(-3, "MISS_PARAM");
            return;
        }
        SuggestionRequestParams suggestionRequestParams = new SuggestionRequestParams();
        suggestionRequestParams.apply(suggestionOption);
        suggestionRequestParams.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                poiPlaceResultCallback.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        suggestionRequestParams.setToken(authToken);
        try {
            suggestionRequestParams.setSign(SignUtils.signParams(suggestionRequestParams, phoneInfoRaw, true));
            com.baidu.platform.a.f.i.b bVar = (com.baidu.platform.a.f.i.b) a(com.baidu.platform.a.f.i.b.class, 1);
            if (bVar == null) {
                poiPlaceResultCallback.failed(-6, "HOST_NOT_EXIST");
            } else {
                bVar.a(suggestionRequestParams, phoneInfoRaw).setCallback(new e(poiPlaceResultCallback));
            }
        } catch (Exception e8) {
            poiPlaceResultCallback.failed(-1, e8.getMessage());
        }
    }

    private <T> T a(Class<T> cls, int i8) {
        if (cls == null) {
            return null;
        }
        if (this.f8606a.containsKey(cls)) {
            return (T) this.f8606a.get(cls);
        }
        HttpManager b8 = com.baidu.platform.util.b.a().b(i8);
        if (b8 == null) {
            return null;
        }
        T t7 = (T) b8.getApiInstance(cls);
        this.f8606a.put(cls, t7);
        return t7;
    }
}
