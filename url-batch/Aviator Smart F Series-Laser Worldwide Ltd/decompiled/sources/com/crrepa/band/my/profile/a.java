package com.crrepa.band.my.profile;

import com.crrepa.band.my.device.watchface.model.BaseResponseBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceDetailBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceListBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFacePreviewBean;
import com.crrepa.band.my.device.watchface.model.StoreWatchFaceTagBean;
import com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.model.ClockPointerResp;
import com.crrepa.band.my.model.net.BandDataReportEntity;
import com.crrepa.band.my.model.net.CitySearchEntity;
import com.crrepa.band.my.model.net.CustomerServiceStateEntity;
import com.crrepa.band.my.model.net.EcgAuxiliaryResultEntity;
import com.crrepa.band.my.model.net.KyAuthLoginEntity;
import com.crrepa.band.my.model.net.NewAppEntity;
import com.crrepa.band.my.model.net.OpenWeatherEntity;
import com.crrepa.band.my.model.net.OpenWeatherForecastEntity;
import com.crrepa.band.my.model.net.SifliWatchFaceEntity;
import com.crrepa.band.my.model.net.SupportWatchFaceEntity;
import com.crrepa.band.my.model.net.WechatSportQrCodeEntity;
import com.crrepa.band.my.model.net.YahooWeatherEntity;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import okhttp3.RequestBody;
import r7.c;
import r7.e;
import r7.f;
import r7.j;
import r7.k;
import r7.o;
import r7.s;
import r7.t;
import r7.u;

/* loaded from: classes2.dex */
public interface a {
    public static final String CRP_BASE_URL = "http://api.crrepa.com/";

    @f("https://app.moyoung.com/check-updates/android")
    Observable<NewAppEntity> checkAppVersion(@t("key") String str, @t("package") String str2, @t("version_code") String str3, @t("lang") String str4, @t("channel") String str5);

    @f("https://wr.moyoung.com/wr")
    Observable<OpenWeatherEntity> getCurrentOpenWeather(@t("city") String str);

    @f("https://pollux.moyoung.com/api/ticket/isBound")
    Observable<CustomerServiceStateEntity> getCustomServiceState(@t("device_id") String str, @t("firmware") String str2, @t("question_type") int i8, @t("app_name") String str3);

    @f("https://pollux.moyoung.com/api/ticket/unread")
    Observable<CustomerServiceStateEntity> getCustomServiceUnread(@t("device_id") String str, @t("firmware") String str2, @t("app_name") String str3);

    @o("http://www.kangyuanai.com/api/ecg_report/userEcgReportMoyoung")
    Observable<EcgAuxiliaryResultEntity> getEcgAuxiliaryResult(@j Map<String, String> map, @r7.a RequestBody requestBody);

    @f("https://wr.moyoung.com/wr-7")
    Observable<OpenWeatherForecastEntity> getForecastOpenWeather(@t("city") String str);

    @k({"Content-Type:application/json"})
    @o("http://www.kangyuanai.com/api/login/thirdLogin")
    Observable<KyAuthLoginEntity> getKyPublicKey(@r7.a RequestBody requestBody);

    @f("https://api-cdn.moyoung.com/faces/new/{id}")
    Observable<StoreWatchFacePreviewBean> getNewWatchFaceDetail(@s("id") int i8);

    @f("https://api-cdn.moyoung.com/faces/new/face-detail")
    Observable<BaseResponseBean<StoreWatchFaceDetailBean>> getNewWatchFaceDetail(@u Map<String, String> map);

    @k({"User-Agent: Mozilla/5.0 (Linux; Android 9.0; Z832 Build/MMB29M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Mobile Safari/537.36"})
    @f("https://www.yahoo.com/news/_tdnews/api/resource/WeatherSearch;text={city}?bkt=fp-US-en-US-def&device=desktop")
    Observable<List<CitySearchEntity>> getSearchCityList(@s("city") String str);

    @f("https://api-cdn.moyoung.com/sifli/faces/{id}")
    Observable<SifliWatchFaceEntity> getSifliWatchFace(@s("id") int i8);

    @f("https://api-cdn.moyoung.com/faces/sifli/{id}")
    Observable<BaseResponseBean<StoreWatchFaceDetailBean>> getSifliWatchFaceDetail(@s("id") int i8, @t("lang") String str);

    @f("https://api-cdn.moyoung.com/faces/new/face-list")
    Observable<BaseResponseBean<List<StoreWatchFaceBean>>> getStoreJieliWatchFaceListV3(@u Map<String, String> map);

    @f("https://api-cdn.moyoung.com/faces/new/tag-face-list")
    Observable<BaseResponseBean<List<StoreWatchFaceTagBean>>> getStoreNewWatchFaceTagListV3(@u Map<String, String> map);

    @f("https://api-cdn.moyoung.com/faces/sifli")
    Observable<BaseResponseBean<List<StoreWatchFaceBean>>> getStoreSifliWatchFaceList(@t("tpls") String str, @t("key") String str2, @t("tested") String str3, @t("tag_id") int i8, @t("fv") String str4, @t("per_page") int i9, @t("p") int i10, @t("max_size") int i11, @t("ver") String str5, @t("lang") String str6);

    @f("https://api-cdn.moyoung.com/faces/sifli/tag-list")
    Observable<BaseResponseBean<List<StoreWatchFaceTagBean>>> getStoreSifliWatchFaceTagListV3(@t("lang") String str, @t("tpls") String str2, @t("fv") String str3, @t("per_page") int i8, @t("p") int i9, @t("tested") String str4, @t("max_size") int i10);

    @f("https://api-cdn.moyoung.com/faces/v3/face-detail")
    Observable<BaseResponseBean<StoreWatchFaceDetailBean>> getStoreWatchFaceDetailV3(@t("id") int i8, @t("lang") String str, @t("fv") String str2, @t("ver") String str3, @t("max_size") int i9);

    @f("https://api-cdn.moyoung.com/faces/v3/list")
    Observable<BaseResponseBean<StoreWatchFaceListBean>> getStoreWatchFaceListV3(@t("tpls") String str, @t("tag_id") int i8, @t("tested") String str2, @t("fv") String str3, @t("per_page") int i9, @t("p") int i10, @t("max_size") int i11, @t("ver") String str4, @t("lang") String str5);

    @f("https://api-cdn.moyoung.com/faces/v3/tag-list")
    Observable<BaseResponseBean<List<StoreWatchFaceTagBean>>> getStoreWatchFaceTagListV3(@t("lang") String str, @t("tpls") String str2, @t("fv") String str3, @t("per_page") int i8, @t("p") int i9, @t("tested") String str4, @t("ver") String str5, @t("max_size") int i10);

    @f("https://api-cdn.moyoung.com/face-detail")
    Observable<SupportWatchFaceEntity> getWatchFace(@t("id") int i8);

    @f("iot/authorize")
    Observable<WechatSportQrCodeEntity> getWechatSportQrCode(@t("pid") int i8, @t("mac") String str);

    @k({"User-Agent: Mozilla/5.0 (Linux; Android 9.0; Z832 Build/MMB29M) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.102 Mobile Safari/537.36"})
    @f("https://www.yahoo.com/news/_td/api/resource/WeatherService;woeids=[{woeid}]")
    Observable<YahooWeatherEntity> getYahooWeather(@s("woeid") int i8);

    @f("https://query.yahooapis.com/v1/public/yql")
    Observable<YahooWeatherEntity> getYahooWeather(@t("q") String str, @t("format") String str2, @t("env") String str3);

    @e
    @o("https://api-cdn.moyoung.com/faces/v3/face-download")
    Observable<String> pushDownloadsV3(@c("id") int i8, @c("fv") String str);

    @e
    @o("https://api-cdn.moyoung.com/faces/new/face-download")
    Observable<String> pushNewDownloadsV3(@c("id") int i8, @c("fv") String str);

    @e
    @o("https://api-cdn.moyoung.com/faces/sifli/face-download")
    Observable<String> pushSifliDownloadsV3(@c("id") int i8, @c("fv") String str);

    @f("https://api-cdn.moyoung.com/faces/pointer/list")
    Observable<BaseResponseBean<ClockPointerResp>> requestClockPointerList(@t("tpls") String str, @t("fv") String str2, @t("p") String str3, @t("per_page") String str4);

    @f("https://api.moyoung.com/log/spo2")
    Observable<BandDataReportEntity> uploadBandBloodOxygen(@u Map<String, String> map);

    @f("https://api.moyoung.com/log/bp")
    Observable<BandDataReportEntity> uploadBandBloodPressure(@u Map<String, String> map);

    @f("https://api.moyoung.com/log/hr")
    Observable<BandDataReportEntity> uploadBandHeartRate(@u Map<String, String> map);

    @f("https://api.moyoung.com/log/sleep")
    Observable<BandDataReportEntity> uploadBandSleep(@u Map<String, String> map);

    @f("https://api.moyoung.com/log/steps")
    Observable<BandDataReportEntity> uploadBandSteps(@u Map<String, String> map);
}
