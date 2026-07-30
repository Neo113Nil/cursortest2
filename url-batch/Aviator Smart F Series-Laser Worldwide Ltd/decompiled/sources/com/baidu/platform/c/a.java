package com.baidu.platform.c;

import android.text.TextUtils;
import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.http.wrapper.AsyncResponse;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.baidu.mapapi.http.wrapper.SignUtils;
import com.baidu.mapapi.search.route.v2.IRoutePlanSearch;
import com.baidu.mapapi.search.route.v2.RoutePlanResultCallback;
import com.baidu.mapapi.search.route.v2.bus.BusRoutePlanOption;
import com.baidu.mapapi.search.route.v2.bus.bean.BusRoutePlanParam;
import com.baidu.mapapi.search.route.v2.bus.bean.BusRoutePlanResponse;
import com.baidu.mapapi.search.route.v2.bus.bean.BusRoutePlanResult;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import com.baidu.platform.util.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a implements IRoutePlanSearch {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f8721a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f8722b = new HashMap();

    /* renamed from: com.baidu.platform.c.a$a, reason: collision with other inner class name */
    class C0097a implements AsyncResponse.Callback<BusRoutePlanResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RoutePlanResultCallback f8723a;

        C0097a(RoutePlanResultCallback routePlanResultCallback) {
            this.f8723a = routePlanResultCallback;
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BusRoutePlanResponse busRoutePlanResponse) {
            if (busRoutePlanResponse == null) {
                this.f8723a.failed(-4, "EMPTY_RESULT");
            } else if (busRoutePlanResponse.getStatus() == 0) {
                this.f8723a.success(busRoutePlanResponse.getResult());
            } else {
                this.f8723a.failed(busRoutePlanResponse.getStatus(), busRoutePlanResponse.getMessage());
            }
        }

        @Override // com.baidu.mapapi.http.wrapper.AsyncResponse.Callback
        public void onFailed(Throwable th) {
            this.f8723a.failed(-5, th.getMessage());
        }
    }

    private a() {
    }

    public static a a() {
        if (f8721a == null) {
            synchronized (a.class) {
                try {
                    if (f8721a == null) {
                        f8721a = new a();
                    }
                } finally {
                }
            }
        }
        return f8721a;
    }

    @Override // com.baidu.mapapi.search.route.v2.IRoutePlanSearch
    public void masstransitSearch(BusRoutePlanOption busRoutePlanOption, RoutePlanResultCallback<BusRoutePlanResult> routePlanResultCallback) {
        if (routePlanResultCallback == null) {
            return;
        }
        if (busRoutePlanOption == null || busRoutePlanOption.getOrigin() == null || busRoutePlanOption.getDestination() == null) {
            routePlanResultCallback.failed(-3, "MISS_PARAM");
            return;
        }
        BusRoutePlanParam busRoutePlanParam = new BusRoutePlanParam();
        busRoutePlanParam.apply(busRoutePlanOption);
        busRoutePlanParam.setTimestamp(Long.valueOf(System.currentTimeMillis() / 1000));
        String authToken = HttpClient.getAuthToken();
        Map<String, String> phoneInfoRaw = HttpClient.getPhoneInfoRaw();
        if (TextUtils.isEmpty(authToken)) {
            if (PermissionCheck.permissionCheck() != 0) {
                routePlanResultCallback.failed(-2, "EMPTY_TOKEN");
                return;
            }
            authToken = HttpClient.getAuthToken();
        }
        busRoutePlanParam.setToken(authToken);
        try {
            busRoutePlanParam.setSign(SignUtils.signParams(busRoutePlanParam, phoneInfoRaw, true));
            com.baidu.platform.c.b.a aVar = (com.baidu.platform.c.b.a) a(com.baidu.platform.c.b.a.class, 1);
            if (aVar == null) {
                routePlanResultCallback.failed(-6, "HOST_NOT_EXIST");
            } else {
                aVar.a(busRoutePlanParam, phoneInfoRaw).setCallback(new C0097a(routePlanResultCallback));
            }
        } catch (Exception e8) {
            routePlanResultCallback.failed(-1, e8.getMessage());
        }
    }

    private <T> T a(Class<T> cls, int i8) {
        if (cls == null) {
            return null;
        }
        if (this.f8722b.containsKey(cls)) {
            return (T) this.f8722b.get(cls);
        }
        HttpManager b8 = b.a().b(i8);
        if (b8 == null) {
            return null;
        }
        T t7 = (T) b8.getApiInstance(cls);
        this.f8722b.put(cls, t7);
        return t7;
    }
}
