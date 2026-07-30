package com.crrepa.band.my.device.weather;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.home.training.model.HomeWeatherEvent;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandWeatherProvider;
import com.crrepa.band.my.model.db.LocationCity;
import com.crrepa.band.my.model.db.Weather;
import com.crrepa.band.my.model.db.proxy.LocationCityProxy;
import com.crrepa.band.my.model.db.proxy.WeatherDaoProxy;
import com.crrepa.band.my.model.net.OpenWeatherEntity;
import com.crrepa.band.my.model.net.OpenWeatherForecastEntity;
import com.crrepa.band.my.model.net.WeatherEntity;
import com.crrepa.band.my.training.model.LocationCityInfo;
import com.crrepa.band.my.training.utils.h;
import com.crrepa.ble.conn.bean.CRPFutureWeatherInfo;
import com.crrepa.ble.conn.bean.CRPTodayWeatherInfo;
import com.github.mikephil.charting.utils.i;
import com.moyoung.dafit.module.common.utils.s;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Date;

/* loaded from: classes2.dex */
public class b {
    private final WeatherDaoProxy weatherDaoProxy = new WeatherDaoProxy();

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(LocationCityInfo locationCityInfo) {
            if (locationCityInfo != null) {
                b.this.sendSelectedCityWeather(locationCityInfo);
                b.this.sendLocalLocation(locationCityInfo);
            }
        }
    }

    /* renamed from: com.crrepa.band.my.device.weather.b$b, reason: collision with other inner class name */
    class C0195b implements Consumer {
        C0195b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(WeatherEntity weatherEntity) {
            if (weatherEntity == null || weatherEntity.getCode() != 0) {
                return;
            }
            b.this.sendWeather(weatherEntity);
        }
    }

    class d implements Consumer {
        final /* synthetic */ String val$city;
        final /* synthetic */ Weather val$weather;

        d(String str, Weather weather) {
            this.val$city = str;
            this.val$weather = weather;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(OpenWeatherEntity openWeatherEntity) {
            if (openWeatherEntity.getCod() == 200) {
                b.this.sendTodayWeatherInfo(c2.c.getWeatherOfOpenWeather(openWeatherEntity, this.val$city));
                b.this.saveWeather(openWeatherEntity, this.val$weather, this.val$city);
            }
        }
    }

    class e implements Consumer {
        e() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    class f implements Consumer {
        final /* synthetic */ String val$city;
        final /* synthetic */ Weather val$forecastWeather;

        f(Weather weather, String str) {
            this.val$forecastWeather = weather;
            this.val$city = str;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(OpenWeatherForecastEntity openWeatherForecastEntity) {
            if (Integer.parseInt(openWeatherForecastEntity.getCod()) == 200) {
                b.this.sendFutureWeather(c2.a.getWeatherOfOpenWeather(openWeatherForecastEntity));
                b.this.saveForecastWeather(openWeatherForecastEntity, this.val$forecastWeather, this.val$city);
            }
        }
    }

    class g implements Consumer {
        g() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            th.printStackTrace();
        }
    }

    @SuppressLint({"CheckResult"})
    private void getCurrentWeatherOfOpenWeather(String str, double d8, double d9) {
        Weather weather = this.weatherDaoProxy.get(str, false);
        if (weather != null && !this.weatherDaoProxy.isStale(weather.getDate(), false)) {
            com.orhanobut.logger.f.d("weather: " + weather.getWeather());
            OpenWeatherEntity openWeatherEntity = (OpenWeatherEntity) s.json2Bean(weather.getWeather(), OpenWeatherEntity.class);
            if (openWeatherEntity != null) {
                sendTodayWeatherInfo(c2.c.getWeatherOfOpenWeather(openWeatherEntity, str));
                return;
            }
        }
        com.crrepa.band.my.device.net.a apiStores = com.crrepa.band.my.device.net.b.getInstance().getApiStores();
        ((d8 == d9 && d8 == i.DOUBLE_EPSILON) ? apiStores.getCurrentOpenWeather(str) : apiStores.getCurrentOpenWeather(d8, d9)).subscribeOn(Schedulers.io()).subscribe(new d(str, weather), new e());
    }

    @SuppressLint({"CheckResult"})
    private void getForecastWeatherOfOpenWeather(String str, double d8, double d9) {
        Weather weather = this.weatherDaoProxy.get(str, true);
        if (weather != null && !this.weatherDaoProxy.isStale(weather.getDate(), true)) {
            com.orhanobut.logger.f.d("forecastWeather: " + weather.getWeather());
            OpenWeatherForecastEntity openWeatherForecastEntity = (OpenWeatherForecastEntity) s.json2Bean(weather.getWeather(), OpenWeatherForecastEntity.class);
            if (openWeatherForecastEntity != null) {
                sendFutureWeather(c2.a.getWeatherOfOpenWeather(openWeatherForecastEntity));
                return;
            }
        }
        com.crrepa.band.my.device.net.a apiStores = com.crrepa.band.my.device.net.b.getInstance().getApiStores();
        ((d8 == d9 && d8 == i.DOUBLE_EPSILON) ? apiStores.getForecastOpenWeather(str) : apiStores.getForecastOpenWeather(d8, d9)).subscribeOn(Schedulers.io()).subscribe(new f(weather, str), new g());
    }

    @Nullable
    public static LocationCityInfo getLocationInfo() {
        LocationCity locationCity = new LocationCityProxy().get();
        if (locationCity == null || TextUtils.isEmpty(locationCity.getCity())) {
            return null;
        }
        LocationCityInfo locationCityInfo = new LocationCityInfo(locationCity.getType().intValue());
        com.orhanobut.logger.f.d("city: " + locationCity.getCity());
        locationCityInfo.setCity(locationCity.getCity());
        String country = locationCity.getCountry();
        com.orhanobut.logger.f.d("country: " + country);
        if (!TextUtils.isEmpty(country)) {
            locationCityInfo.setCountry(country);
        }
        Double latitude = locationCity.getLatitude();
        if (latitude != null) {
            locationCityInfo.setLatitude(latitude.doubleValue());
        }
        Double longitude = locationCity.getLongitude();
        if (longitude != null) {
            locationCityInfo.setLongitude(longitude.doubleValue());
        }
        Integer woeid = locationCity.getWoeid();
        if (woeid == null) {
            return locationCityInfo;
        }
        locationCityInfo.setWoeid(woeid.intValue());
        return locationCityInfo;
    }

    @SuppressLint({"CheckResult"})
    private void getWeatherInfo(String str) {
        com.crrepa.band.my.device.net.b.getInstance().getApiStores().getWeatherInfo(str).subscribeOn(Schedulers.io()).subscribe(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveForecastWeather(OpenWeatherForecastEntity openWeatherForecastEntity, Weather weather, String str) {
        if (openWeatherForecastEntity == null) {
            return;
        }
        if (weather == null) {
            weather = new Weather();
            weather.setCity(str);
        }
        weather.setDate(new Date());
        weather.setWeather(s.bean2Json(openWeatherForecastEntity));
        weather.setForecast(Boolean.TRUE);
        this.weatherDaoProxy.insert(weather);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveWeather(OpenWeatherEntity openWeatherEntity, Weather weather, String str) {
        if (openWeatherEntity == null) {
            return;
        }
        if (weather == null) {
            weather = new Weather();
            weather.setCity(str);
        }
        weather.setDate(new Date());
        weather.setWeather(s.bean2Json(openWeatherEntity));
        weather.setForecast(Boolean.FALSE);
        com.orhanobut.logger.f.d("saveWeather: " + weather.getWeather());
        this.weatherDaoProxy.insert(weather);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFutureWeather(CRPFutureWeatherInfo cRPFutureWeatherInfo) {
        if (cRPFutureWeatherInfo != null) {
            i4.getInstance().sendFutureWeather(cRPFutureWeatherInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLocalLocation(LocationCityInfo locationCityInfo) {
        i4.getInstance().sendLocalLocation(locationCityInfo.getLatitude(), locationCityInfo.getLongitude());
    }

    @SuppressLint({"CheckResult"})
    private void sendLocalWeather(Context context) {
        if (h.isGooglePlayServices(context)) {
            h.getLocationAddress(context).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new a(), new C0195b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSelectedCityWeather(LocationCityInfo locationCityInfo) {
        com.orhanobut.logger.f.d("location type: " + locationCityInfo.getLocationType());
        String city = locationCityInfo.getCity();
        if (TextUtils.isEmpty(city)) {
            return;
        }
        if (locationCityInfo.getLocationType() != 2) {
            getWeatherInfo(city);
            return;
        }
        double latitude = locationCityInfo.getLatitude();
        double longitude = locationCityInfo.getLongitude();
        com.orhanobut.logger.f.d("lat: " + latitude + ", lon: " + longitude);
        String lowerCase = city.toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append("cityName: ");
        sb.append(city);
        com.orhanobut.logger.f.d(sb.toString());
        getCurrentWeatherOfOpenWeather(lowerCase, latitude, longitude);
        getForecastWeatherOfOpenWeather(lowerCase, latitude, longitude);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendTodayWeatherInfo(CRPTodayWeatherInfo cRPTodayWeatherInfo) {
        if (cRPTodayWeatherInfo != null) {
            i4.getInstance().sendTodayWeather(cRPTodayWeatherInfo);
            String locationCity = BandWeatherProvider.getLocationCity();
            if (TextUtils.isEmpty(locationCity)) {
                locationCity = cRPTodayWeatherInfo.getCity();
            }
            i4.getInstance().sendLocalCity(locationCity);
            org.greenrobot.eventbus.c.getDefault().post(new HomeWeatherEvent(cRPTodayWeatherInfo.getTemp(), cRPTodayWeatherInfo.getWeatherId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendWeather(WeatherEntity weatherEntity) {
        sendTodayWeatherInfo(c2.c.getWeather(weatherEntity));
        sendFutureWeather(c2.a.getWeather(weatherEntity));
    }

    public void sendWeatherInfo(Context context) {
        BaseBandModel connectBand;
        if (BandWeatherProvider.getWeatherState() && (connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand()) != null && connectBand.hasWeather()) {
            LocationCityInfo locationInfo = getLocationInfo();
            if (locationInfo == null) {
                sendLocalWeather(context);
            } else {
                sendSelectedCityWeather(locationInfo);
            }
        }
    }

    public void sendWeatherInfoForTraining(Context context) {
        LocationCityInfo locationInfo = getLocationInfo();
        if (locationInfo == null) {
            sendLocalWeather(context);
        } else {
            sendSelectedCityWeather(locationInfo);
        }
    }
}
