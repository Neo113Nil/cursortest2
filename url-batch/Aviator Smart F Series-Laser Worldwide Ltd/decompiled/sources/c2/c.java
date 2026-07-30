package c2;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import cn.hutool.core.text.l;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.band.my.model.net.OpenWeatherEntity;
import com.crrepa.band.my.model.net.WeatherEntity;
import com.crrepa.band.my.model.net.YahooWeatherEntity;
import com.crrepa.ble.conn.bean.CRPTodayWeatherInfo;
import com.moyoung.dafit.module.common.utils.n;
import com.orhanobut.logger.f;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class c {
    private static final String TIME_SEPARATOR = ":";

    private static String getGmtTimezone(int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append("GMT");
        if (i8 >= 0) {
            sb.append("+");
        }
        sb.append(i8 / 3600);
        sb.append(":");
        sb.append(n.format((i8 % 3600) / 60, n.TWO_INTEGERS_PATTERN));
        return sb.toString();
    }

    private static int[] getTimeArray(List<String> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            String str = list.get(0);
            if (!str.contains(":")) {
                return null;
            }
            String[] split = str.split(":");
            if (2 <= split.length) {
                return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])};
            }
            return null;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static CRPTodayWeatherInfo getWeather(WeatherEntity weatherEntity) {
        WeatherEntity.WeatherBean.SkBean sk = weatherEntity.getWeather().getSk();
        int weatherTemp = (int) e.getWeatherTemp(Integer.parseInt(sk.getTemp()), BandTempSystemProvider.getTempSystem());
        int weatherCode = e.getWeatherCode(sk.getWeather_id());
        String city = weatherEntity.getWeather().getToday().getCity();
        CRPTodayWeatherInfo cRPTodayWeatherInfo = new CRPTodayWeatherInfo();
        cRPTodayWeatherInfo.setCity(city);
        cRPTodayWeatherInfo.setPm25(sk.getPm25());
        cRPTodayWeatherInfo.setFestival(sk.getFestival());
        cRPTodayWeatherInfo.setLunar(sk.getLunar());
        cRPTodayWeatherInfo.setTemp(weatherTemp);
        cRPTodayWeatherInfo.setWeatherId(weatherCode);
        int[] timeArray = getTimeArray(weatherEntity.getWeather().getToday().getInfo().getDawn());
        if (timeArray != null) {
            cRPTodayWeatherInfo.setSunriseHour(timeArray[0]);
            cRPTodayWeatherInfo.setSunriseMinute(timeArray[1]);
        }
        int[] timeArray2 = getTimeArray(weatherEntity.getWeather().getToday().getInfo().getNight());
        if (timeArray2 != null) {
            cRPTodayWeatherInfo.setSunsetHour(timeArray2[0]);
            cRPTodayWeatherInfo.setSunsetMinute(timeArray2[1]);
        }
        return cRPTodayWeatherInfo;
    }

    public static CRPTodayWeatherInfo getWeatherOfOpenWeather(OpenWeatherEntity openWeatherEntity, String str) {
        CRPTodayWeatherInfo cRPTodayWeatherInfo = new CRPTodayWeatherInfo();
        cRPTodayWeatherInfo.setCity(str);
        cRPTodayWeatherInfo.setTemp(Math.round(e.getWeatherTemp(Double.valueOf(openWeatherEntity.getMain().getTemp()).floatValue(), BandTempSystemProvider.getTempSystem())));
        List<OpenWeatherEntity.WeatherBean> weather = openWeatherEntity.getWeather();
        cRPTodayWeatherInfo.setWeatherId(e.getWeatherCodeOfOpenWeather((weather == null || weather.isEmpty()) ? TypedValues.TransitionType.TYPE_DURATION : weather.get(0).getId()));
        cRPTodayWeatherInfo.setFestival(l.SPACE);
        cRPTodayWeatherInfo.setLunar(l.SPACE);
        if (openWeatherEntity.getSys() != null) {
            int sunrise = openWeatherEntity.getSys().getSunrise();
            int sunset = openWeatherEntity.getSys().getSunset();
            String gmtTimezone = getGmtTimezone(openWeatherEntity.getTimezone());
            f.d("gmtTimezone: " + gmtTimezone);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getTimeZone(gmtTimezone));
            calendar.setTimeInMillis(((long) sunrise) * 1000);
            cRPTodayWeatherInfo.setSunriseHour(calendar.get(11));
            cRPTodayWeatherInfo.setSunriseMinute(calendar.get(12));
            calendar.setTimeInMillis(sunset * 1000);
            cRPTodayWeatherInfo.setSunsetHour(calendar.get(11));
            cRPTodayWeatherInfo.setSunsetMinute(calendar.get(12));
        }
        return cRPTodayWeatherInfo;
    }

    public static CRPTodayWeatherInfo getWeatherOfYahoo(YahooWeatherEntity yahooWeatherEntity) {
        YahooWeatherEntity.WeathersBean weathersBean = getWeathersBean(yahooWeatherEntity);
        if (weathersBean == null) {
            return null;
        }
        String displayName = weathersBean.getLocation().getDisplayName();
        YahooWeatherEntity.WeathersBean.ObservationBean observation = weathersBean.getObservation();
        if (observation == null || TextUtils.isEmpty(observation.getConditionDescription())) {
            return null;
        }
        int weatherTempOfYahoo = e.getWeatherTempOfYahoo(observation.getTemperature().getNow(), BandTempSystemProvider.getTempSystem());
        int weatherCodeOfYahoo = e.getWeatherCodeOfYahoo(observation.getConditionCode());
        f.d("conditionCode: " + weatherCodeOfYahoo);
        CRPTodayWeatherInfo cRPTodayWeatherInfo = new CRPTodayWeatherInfo();
        cRPTodayWeatherInfo.setCity(displayName);
        cRPTodayWeatherInfo.setTemp(weatherTempOfYahoo);
        cRPTodayWeatherInfo.setWeatherId(weatherCodeOfYahoo);
        cRPTodayWeatherInfo.setFestival(l.SPACE);
        cRPTodayWeatherInfo.setLunar(l.SPACE);
        return cRPTodayWeatherInfo;
    }

    @Nullable
    public static YahooWeatherEntity.WeathersBean getWeathersBean(YahooWeatherEntity yahooWeatherEntity) {
        YahooWeatherEntity.WeathersBean weathersBean;
        List<YahooWeatherEntity.WeathersBean> weathers = yahooWeatherEntity.getWeathers();
        if (weathers == null || weathers.size() <= 0 || (weathersBean = weathers.get(0)) == null) {
            return null;
        }
        return weathersBean;
    }
}
