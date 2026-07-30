package com.baidu.mapapi.search.weather;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.platform.a.l.d;

/* loaded from: classes2.dex */
public class WeatherSearch extends a {

    /* renamed from: a, reason: collision with root package name */
    com.baidu.platform.a.l.a f7462a = new d();

    public static WeatherSearch newInstance() {
        BMapManager.init();
        return new WeatherSearch();
    }

    public void destroy() {
        com.baidu.platform.a.l.a aVar = this.f7462a;
        if (aVar != null) {
            aVar.destroy();
        }
        BMapManager.destroy();
    }

    public boolean request(WeatherSearchOption weatherSearchOption) {
        com.baidu.platform.a.l.a aVar = this.f7462a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (weatherSearchOption != null) {
            return aVar.a(weatherSearchOption);
        }
        throw new IllegalArgumentException("BDMapSDKException: option can not be null");
    }

    public void setWeatherSearchResultListener(OnGetWeatherResultListener onGetWeatherResultListener) {
        com.baidu.platform.a.l.a aVar = this.f7462a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (onGetWeatherResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        aVar.a(onGetWeatherResultListener);
    }
}
