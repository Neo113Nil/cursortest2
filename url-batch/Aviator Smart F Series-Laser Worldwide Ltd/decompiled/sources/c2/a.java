package c2;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.band.my.model.net.OpenWeatherForecastEntity;
import com.crrepa.band.my.model.net.WeatherEntity;
import com.crrepa.band.my.model.net.YahooWeatherEntity;
import com.crrepa.ble.conn.bean.CRPFutureWeatherInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class a {
    private static final String Q7_SMARTWATCH = "Q7 Smartwatch";

    private a() {
    }

    @NonNull
    private static CRPFutureWeatherInfo.FutureBean getFutureWeatherEntity(int i8, int i9, int i10) {
        return TextUtils.equals(com.crrepa.band.my.ble.band.utils.a.getInstance().getName(), Q7_SMARTWATCH) ? new CRPFutureWeatherInfo.FutureBean(i10, i8, i9) : new CRPFutureWeatherInfo.FutureBean(i10, i9, i8);
    }

    public static CRPFutureWeatherInfo getWeather(WeatherEntity weatherEntity) {
        CRPFutureWeatherInfo cRPFutureWeatherInfo = new CRPFutureWeatherInfo();
        ArrayList arrayList = new ArrayList();
        int tempSystem = BandTempSystemProvider.getTempSystem();
        List<WeatherEntity.WeatherBean.FutureBean> future = weatherEntity.getWeather().getFuture();
        if (future == null || future.size() <= 0) {
            return null;
        }
        for (int i8 = 0; i8 < future.size(); i8++) {
            WeatherEntity.WeatherBean.FutureBean futureBean = future.get(i8);
            Matcher matcher = Pattern.compile("-?\\d+").matcher(futureBean.getTemperature());
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (matcher.find()) {
                int parseInt = Integer.parseInt(matcher.group());
                if (i11 == 0) {
                    i9 = parseInt;
                    i10 = i9;
                } else {
                    if (i10 < parseInt) {
                        i10 = parseInt;
                    }
                    if (parseInt < i9) {
                        i9 = parseInt;
                    }
                }
                i11++;
            }
            arrayList.add(getFutureWeatherEntity((int) e.getWeatherTemp(i9, tempSystem), (int) e.getWeatherTemp(i10, tempSystem), e.getWeatherCode(futureBean.getWeather_id().getFa())));
        }
        cRPFutureWeatherInfo.setFuture(arrayList);
        return cRPFutureWeatherInfo;
    }

    public static CRPFutureWeatherInfo getWeatherOfOpenWeather(OpenWeatherForecastEntity openWeatherForecastEntity) {
        List<OpenWeatherForecastEntity.ListBean> list = openWeatherForecastEntity.getList();
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int tempSystem = BandTempSystemProvider.getTempSystem();
        for (OpenWeatherForecastEntity.ListBean listBean : list) {
            int round = Math.round(e.getWeatherTemp(Double.valueOf(listBean.getTemp().getMin()).floatValue(), tempSystem));
            int round2 = Math.round(e.getWeatherTemp(Double.valueOf(listBean.getTemp().getMax()).floatValue(), tempSystem));
            List<OpenWeatherForecastEntity.ListBean.WeatherBean> weather = listBean.getWeather();
            arrayList.add(getFutureWeatherEntity(round, round2, e.getWeatherCodeOfOpenWeather((weather == null || weather.isEmpty()) ? TypedValues.TransitionType.TYPE_DURATION : weather.get(0).getId())));
        }
        CRPFutureWeatherInfo cRPFutureWeatherInfo = new CRPFutureWeatherInfo();
        cRPFutureWeatherInfo.setFuture(arrayList);
        return cRPFutureWeatherInfo;
    }

    public static CRPFutureWeatherInfo getWeatherOfYahoo(YahooWeatherEntity yahooWeatherEntity) {
        YahooWeatherEntity.WeathersBean weathersBean = c.getWeathersBean(yahooWeatherEntity);
        CRPFutureWeatherInfo cRPFutureWeatherInfo = null;
        if (weathersBean == null) {
            return null;
        }
        List<YahooWeatherEntity.WeathersBean.ForecastsBean.DailyBean> daily = weathersBean.getForecasts().getDaily();
        if (daily != null && daily.size() > 0) {
            cRPFutureWeatherInfo = new CRPFutureWeatherInfo();
            ArrayList arrayList = new ArrayList();
            int tempSystem = BandTempSystemProvider.getTempSystem();
            for (YahooWeatherEntity.WeathersBean.ForecastsBean.DailyBean dailyBean : daily) {
                int low = dailyBean.getTemperature().getLow();
                int high = dailyBean.getTemperature().getHigh();
                if (high < low) {
                    high = low;
                    low = high;
                }
                arrayList.add(getFutureWeatherEntity(e.getWeatherTempOfYahoo(low, tempSystem), e.getWeatherTempOfYahoo(high, tempSystem), e.getWeatherCodeOfYahoo(dailyBean.getConditionCode())));
            }
            cRPFutureWeatherInfo.setFuture(arrayList);
        }
        return cRPFutureWeatherInfo;
    }
}
