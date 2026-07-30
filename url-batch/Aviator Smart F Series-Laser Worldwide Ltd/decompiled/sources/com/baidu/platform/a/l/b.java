package com.baidu.platform.a.l;

import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.weather.OnGetWeatherResultListener;
import com.baidu.mapapi.search.weather.WeatherLifeIndexes;
import com.baidu.mapapi.search.weather.WeatherResult;
import com.baidu.mapapi.search.weather.WeatherSearchAlerts;
import com.baidu.mapapi.search.weather.WeatherSearchForecastForHours;
import com.baidu.mapapi.search.weather.WeatherSearchForecasts;
import com.baidu.mapapi.search.weather.WeatherSearchLocation;
import com.baidu.mapapi.search.weather.WeatherSearchRealTime;
import com.baidu.platform.base.f;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends f {
    private boolean b(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONArray optJSONArray;
        if (jSONObject == null || weatherResult == null || (optJSONArray = jSONObject.optJSONArray("forecast_hours")) == null) {
            return false;
        }
        if (weatherResult.getForecastHours() == null) {
            weatherResult.setForecastHours(new ArrayList());
        }
        JSONObject jSONObject2 = null;
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            try {
                jSONObject2 = (JSONObject) optJSONArray.get(i8);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            if (jSONObject2 != null) {
                WeatherSearchForecastForHours weatherSearchForecastForHours = new WeatherSearchForecastForHours();
                weatherSearchForecastForHours.setClouds(jSONObject2.optInt("clouds"));
                weatherSearchForecastForHours.setDataTime(jSONObject2.optString("data_time"));
                weatherSearchForecastForHours.setHourlyPrecipitation(jSONObject2.optInt("prec_1h"));
                weatherSearchForecastForHours.setRelativeHumidity(jSONObject2.optInt("rh"));
                weatherSearchForecastForHours.setTemperature(jSONObject2.optInt("temp_fc"));
                weatherSearchForecastForHours.setPhenomenon(jSONObject2.optString("text"));
                weatherSearchForecastForHours.setWindDirection(jSONObject2.optString("wind_dir"));
                weatherSearchForecastForHours.setWindPower(jSONObject2.optString("wind_class"));
                weatherResult.getForecastHours().add(weatherSearchForecastForHours);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean c(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONArray optJSONArray;
        JSONObject jSONObject2;
        JSONException e8;
        if (jSONObject == null || weatherResult == null || (optJSONArray = jSONObject.optJSONArray("forecasts")) == null) {
            return false;
        }
        if (weatherResult.getForecasts() == null) {
            weatherResult.setForecasts(new ArrayList());
        }
        JSONObject jSONObject3 = null;
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            try {
                jSONObject2 = (JSONObject) optJSONArray.get(i8);
                try {
                    new WeatherSearchForecasts();
                } catch (JSONException e9) {
                    e8 = e9;
                    e8.printStackTrace();
                    jSONObject3 = jSONObject2;
                    if (jSONObject3 == null) {
                    }
                }
            } catch (JSONException e10) {
                jSONObject2 = jSONObject3;
                e8 = e10;
            }
            jSONObject3 = jSONObject2;
            if (jSONObject3 == null) {
                WeatherSearchForecasts weatherSearchForecasts = new WeatherSearchForecasts();
                weatherSearchForecasts.setDate(jSONObject3.optString("date"));
                weatherSearchForecasts.setHighestTemp(jSONObject3.optInt("high"));
                weatherSearchForecasts.setLowestTemp(jSONObject3.optInt("low"));
                weatherSearchForecasts.setPhenomenonDay(jSONObject3.optString("text_day"));
                weatherSearchForecasts.setPhenomenonNight(jSONObject3.optString("text_night"));
                weatherSearchForecasts.setWeek(jSONObject3.optString("week"));
                weatherSearchForecasts.setWindDirectionDay(jSONObject3.optString("wd_day"));
                weatherSearchForecasts.setWindPowerDay(jSONObject3.optString("wc_day"));
                weatherSearchForecasts.setWindDirectionNight(jSONObject3.optString("wd_night"));
                weatherSearchForecasts.setWindPowerNight(jSONObject3.optString("wc_night"));
                weatherSearchForecasts.setAirQualityIndex(jSONObject3.optInt("aqi"));
                weatherResult.getForecasts().add(weatherSearchForecasts);
            }
        }
        return true;
    }

    private boolean d(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONArray optJSONArray;
        if (jSONObject == null || weatherResult == null || (optJSONArray = jSONObject.optJSONArray("indexes")) == null) {
            return false;
        }
        if (weatherResult.getLifeIndexes() == null) {
            weatherResult.setLifeIndexes(new ArrayList());
        }
        JSONObject jSONObject2 = null;
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            try {
                jSONObject2 = (JSONObject) optJSONArray.get(i8);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            if (jSONObject2 != null) {
                WeatherLifeIndexes weatherLifeIndexes = new WeatherLifeIndexes();
                weatherLifeIndexes.setBrief(jSONObject2.optString("brief"));
                weatherLifeIndexes.setDetail(jSONObject2.optString("detail"));
                weatherLifeIndexes.setName(jSONObject2.optString("name"));
                weatherResult.getLifeIndexes().add(weatherLifeIndexes);
            }
        }
        return true;
    }

    private boolean e(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONObject optJSONObject;
        if (jSONObject == null || weatherResult == null || (optJSONObject = jSONObject.optJSONObject("location")) == null) {
            return false;
        }
        if (weatherResult.getLocation() != null) {
            a(weatherResult.getLocation(), optJSONObject);
            return true;
        }
        WeatherSearchLocation weatherSearchLocation = new WeatherSearchLocation();
        a(weatherSearchLocation, optJSONObject);
        weatherResult.setLocation(weatherSearchLocation);
        return true;
    }

    private boolean f(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONObject optJSONObject;
        if (jSONObject == null || weatherResult == null || (optJSONObject = jSONObject.optJSONObject("now")) == null) {
            return false;
        }
        if (weatherResult.getRealTimeWeather() != null) {
            a(weatherResult.getRealTimeWeather(), optJSONObject);
            return true;
        }
        WeatherSearchRealTime weatherSearchRealTime = new WeatherSearchRealTime();
        a(weatherSearchRealTime, optJSONObject);
        weatherResult.setRealTimeWeather(weatherSearchRealTime);
        return true;
    }

    private boolean g(JSONObject jSONObject, WeatherResult weatherResult) {
        weatherResult.status = jSONObject.optInt("status");
        JSONObject optJSONObject = jSONObject.optJSONObject("result");
        if (optJSONObject == null) {
            return false;
        }
        e(optJSONObject, weatherResult);
        f(optJSONObject, weatherResult);
        a(optJSONObject, weatherResult);
        b(optJSONObject, weatherResult);
        c(optJSONObject, weatherResult);
        d(optJSONObject, weatherResult);
        return true;
    }

    @Override // com.baidu.platform.base.f
    public SearchResult a(String str) {
        JSONObject jSONObject;
        WeatherResult weatherResult = new WeatherResult();
        if (str == null) {
            weatherResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return weatherResult;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e8) {
            e8.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            weatherResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return weatherResult;
        }
        if (jSONObject.has("SDK_InnerError")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("SDK_InnerError");
            if (optJSONObject.has("PermissionCheckError")) {
                weatherResult.error = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                return weatherResult;
            }
            if (optJSONObject.has("httpStateError")) {
                String optString = optJSONObject.optString("httpStateError");
                optString.hashCode();
                if (optString.equals("NETWORK_ERROR")) {
                    weatherResult.error = SearchResult.ERRORNO.NETWORK_ERROR;
                } else if (optString.equals("REQUEST_ERROR")) {
                    weatherResult.error = SearchResult.ERRORNO.REQUEST_ERROR;
                } else {
                    weatherResult.error = SearchResult.ERRORNO.SEARCH_SERVER_INTERNAL_ERROR;
                }
                return weatherResult;
            }
        }
        if (!a(str, weatherResult, true)) {
            g(jSONObject, weatherResult);
        }
        return weatherResult;
    }

    private void a(WeatherSearchLocation weatherSearchLocation, JSONObject jSONObject) {
        weatherSearchLocation.setCountry(jSONObject.optString("country"));
        weatherSearchLocation.setProvince(jSONObject.optString("province"));
        weatherSearchLocation.setCity(jSONObject.optString("city"));
        weatherSearchLocation.setDistrictName(jSONObject.optString("name"));
        weatherSearchLocation.setDistrictID(jSONObject.optString("id"));
    }

    private void a(WeatherSearchRealTime weatherSearchRealTime, JSONObject jSONObject) {
        weatherSearchRealTime.setPhenomenon(jSONObject.optString("text"));
        weatherSearchRealTime.setTemperature(jSONObject.optInt("temp"));
        weatherSearchRealTime.setSensoryTemp(jSONObject.optInt("feels_like"));
        weatherSearchRealTime.setRelativeHumidity(jSONObject.optInt("rh"));
        weatherSearchRealTime.setWindPower(jSONObject.optString("wind_class"));
        weatherSearchRealTime.setWindDirection(jSONObject.optString("wind_dir"));
        weatherSearchRealTime.setUpdateTime(jSONObject.optString("uptime"));
        weatherSearchRealTime.setCO((float) jSONObject.optDouble("co"));
        weatherSearchRealTime.setNO2(jSONObject.optInt("no2"));
        weatherSearchRealTime.setPM10(jSONObject.optInt("pm10"));
        weatherSearchRealTime.setPM2_5(jSONObject.optInt("pm25"));
        weatherSearchRealTime.setClouds(jSONObject.optInt("clouds"));
        weatherSearchRealTime.setAirQualityIndex(jSONObject.optInt("aqi"));
        weatherSearchRealTime.setSO2(jSONObject.optInt("so2"));
        weatherSearchRealTime.setVisibility(jSONObject.optInt("vis"));
        weatherSearchRealTime.setO3(jSONObject.optInt("o3"));
        weatherSearchRealTime.setHourlyPrecipitation(jSONObject.optInt("prec_1h"));
    }

    private boolean a(JSONObject jSONObject, WeatherResult weatherResult) {
        JSONArray optJSONArray;
        if (jSONObject == null || weatherResult == null || (optJSONArray = jSONObject.optJSONArray("alerts")) == null) {
            return false;
        }
        if (weatherResult.getWeatherAlerts() == null) {
            weatherResult.setWeatherAlerts(new ArrayList());
        }
        JSONObject jSONObject2 = null;
        for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
            try {
                jSONObject2 = (JSONObject) optJSONArray.get(i8);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            if (jSONObject2 != null) {
                WeatherSearchAlerts weatherSearchAlerts = new WeatherSearchAlerts();
                weatherSearchAlerts.setDesc(jSONObject2.optString("desc"));
                weatherSearchAlerts.setLevel(jSONObject2.optString("level"));
                weatherSearchAlerts.setTitle(jSONObject2.optString("title"));
                weatherSearchAlerts.setType(jSONObject2.optString("type"));
                weatherResult.getWeatherAlerts().add(weatherSearchAlerts);
            }
        }
        return true;
    }

    @Override // com.baidu.platform.base.f
    public void a(SearchResult searchResult, Object obj) {
        if (obj == null || !(obj instanceof OnGetWeatherResultListener)) {
            return;
        }
        ((OnGetWeatherResultListener) obj).onGetWeatherResultListener((WeatherResult) searchResult);
    }
}
