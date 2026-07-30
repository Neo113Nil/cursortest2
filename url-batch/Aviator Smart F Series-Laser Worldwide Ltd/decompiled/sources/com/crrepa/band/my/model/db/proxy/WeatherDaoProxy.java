package com.crrepa.band.my.model.db.proxy;

import android.text.format.DateUtils;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Weather;
import com.crrepa.band.my.model.db.greendao.WeatherDao;
import com.orhanobut.logger.f;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class WeatherDaoProxy {
    private static final long WEATHER_CACHE_TIME = 3600000;
    private static final long WEATHER_FORECAST_CACHE_TIME = 7080000;
    private WeatherDao dao = c.getInstance().getDaoSession().getWeatherDao();

    public Weather get(String str, boolean z7) {
        List<Object> list = this.dao.queryBuilder().where(WeatherDao.Properties.City.eq(str), WeatherDao.Properties.Forecast.eq(Boolean.valueOf(z7))).limit(1).build().list();
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (Weather) list.get(0);
    }

    public void insert(Weather weather) {
        this.dao.insertOrReplace(weather);
    }

    public boolean isStale(Date date, boolean z7) {
        long j8 = z7 ? WEATHER_FORECAST_CACHE_TIME : WEATHER_CACHE_TIME;
        f.d("weather time: " + date.getTime());
        f.d("cache time: " + j8);
        return !DateUtils.isToday(date.getTime()) || j8 < System.currentTimeMillis() - date.getTime();
    }
}
