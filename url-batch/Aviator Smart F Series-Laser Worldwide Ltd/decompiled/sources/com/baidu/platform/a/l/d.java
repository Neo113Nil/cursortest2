package com.baidu.platform.a.l;

import com.baidu.mapapi.search.weather.OnGetWeatherResultListener;
import com.baidu.mapapi.search.weather.WeatherSearchOption;
import com.baidu.platform.base.SearchType;

/* loaded from: classes2.dex */
public class d extends com.baidu.platform.base.b implements a {

    /* renamed from: g, reason: collision with root package name */
    private OnGetWeatherResultListener f8643g;

    @Override // com.baidu.platform.a.l.a
    public boolean a(WeatherSearchOption weatherSearchOption) {
        b bVar = new b();
        bVar.a(SearchType.WEATHER_SEARCH);
        return a(new c(weatherSearchOption), this.f8643g, bVar);
    }

    @Override // com.baidu.platform.a.l.a
    public void destroy() {
        this.f8690c.lock();
        this.f8643g = null;
        this.f8690c.unlock();
    }

    @Override // com.baidu.platform.a.l.a
    public void a(OnGetWeatherResultListener onGetWeatherResultListener) {
        this.f8690c.lock();
        this.f8643g = onGetWeatherResultListener;
        this.f8690c.unlock();
    }
}
