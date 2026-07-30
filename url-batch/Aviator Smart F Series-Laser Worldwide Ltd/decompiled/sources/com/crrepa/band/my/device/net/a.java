package com.crrepa.band.my.device.net;

import com.crrepa.band.my.device.watchface.model.BaseResponseBean;
import com.crrepa.band.my.model.net.BandConfigEntity;
import com.crrepa.band.my.model.net.BandLanguageEntity;
import com.crrepa.band.my.model.net.CitySearchEntity;
import com.crrepa.band.my.model.net.OpenWeatherEntity;
import com.crrepa.band.my.model.net.OpenWeatherForecastEntity;
import com.crrepa.band.my.model.net.WeatherEntity;
import io.reactivex.Observable;
import java.util.List;
import r7.f;
import r7.t;

/* loaded from: classes2.dex */
public interface a {
    public static final String BASE_ENCRYP_URL = "https://api.moyoung.com/";

    @f("v2/langs")
    Observable<BandLanguageEntity> getAllLanguage();

    @f("v2/init-settings")
    Observable<BandConfigEntity> getBandConfig(@t("v") int i8);

    @f("https://wr.moyoung.com/v2/wr")
    Observable<OpenWeatherEntity> getCurrentOpenWeather(@t("lat") double d8, @t("lon") double d9);

    @f("https://wr.moyoung.com/v1/wr")
    Observable<OpenWeatherEntity> getCurrentOpenWeather(@t("city") String str);

    @f("https://wr.moyoung.com/v2/wr-7")
    Observable<OpenWeatherForecastEntity> getForecastOpenWeather(@t("lat") double d8, @t("lon") double d9);

    @f("https://wr.moyoung.com/v1/wr-7")
    Observable<OpenWeatherForecastEntity> getForecastOpenWeather(@t("city") String str);

    @f("https://wr.moyoung.com/geo/cities")
    Observable<BaseResponseBean<List<CitySearchEntity>>> getSearchCityList(@t("city") String str);

    @f("weather-report")
    Observable<WeatherEntity> getWeatherInfo(@t("city") String str);
}
