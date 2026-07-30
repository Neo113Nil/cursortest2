package com.baidu.platform.a.l;

import android.text.TextUtils;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.weather.WeatherDataType;
import com.baidu.mapapi.search.weather.WeatherSearchOption;
import com.baidu.mapapi.search.weather.WeatherServerType;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.base.g;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes2.dex */
public class c extends g {

    /* renamed from: e, reason: collision with root package name */
    WeatherSearchOption f8639e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8640a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8641b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f8642c;

        static {
            int[] iArr = new int[LanguageType.values().length];
            f8642c = iArr;
            try {
                iArr[LanguageType.LanguageTypeEnglish.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8642c[LanguageType.LanguageTypeChinese.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CoordType.values().length];
            f8641b = iArr2;
            try {
                iArr2[CoordType.BD09LL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8641b[CoordType.GCJ02.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[WeatherDataType.values().length];
            f8640a = iArr3;
            try {
                iArr3[WeatherDataType.WEATHER_DATA_TYPE_REAL_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8640a[WeatherDataType.WEATHER_DATA_TYPE_FORECASTS_FOR_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8640a[WeatherDataType.WEATHER_DATA_TYPE_FORECASTS_FOR_HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8640a[WeatherDataType.WEATHER_DATA_TYPE_LIFE_INDEX.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8640a[WeatherDataType.WEATHER_DATA_TYPE_ALERT.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8640a[WeatherDataType.WEATHER_DATA_TYPE_ALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public c(WeatherSearchOption weatherSearchOption) {
        this.f8639e = weatherSearchOption;
        a(weatherSearchOption);
    }

    private void a(WeatherSearchOption weatherSearchOption) {
        if (!TextUtils.isEmpty(weatherSearchOption.getDistrictID())) {
            this.f8720d.a("district_id", weatherSearchOption.getDistrictID());
        }
        if (weatherSearchOption.getLocation() != null) {
            LatLng latLng = new LatLng(weatherSearchOption.getLocation().latitude, weatherSearchOption.getLocation().longitude);
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng = CoordTrans.gcjToBaidu(latLng);
            }
            this.f8720d.a("location", latLng.longitude + SystemInfoUtil.COMMA + latLng.latitude);
            this.f8720d.a("coordtype", a(CoordType.BD09LL));
        }
        if (weatherSearchOption.getDataType() != null) {
            this.f8720d.a("data_type", a(weatherSearchOption.getDataType()));
        }
        if (weatherSearchOption.getLanguageType() != null) {
            this.f8720d.a("language", a(weatherSearchOption.getLanguageType()));
        }
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        WeatherSearchOption weatherSearchOption = this.f8639e;
        if (weatherSearchOption == null) {
            return "";
        }
        if (weatherSearchOption.getServerType() == WeatherServerType.LANGUAGE_SERVER_TYPE_ABROAD) {
            return cVar.x();
        }
        return cVar.r();
    }

    private String a(WeatherDataType weatherDataType) {
        switch (a.f8640a[weatherDataType.ordinal()]) {
            case 1:
                return "now";
            case 2:
                return "fc";
            case 3:
                return "fc_hour";
            case 4:
                return "index";
            case 5:
                return "alert";
            case 6:
                return TtmlNode.COMBINE_ALL;
            default:
                return "";
        }
    }

    private String a(CoordType coordType) {
        int i8 = a.f8641b[coordType.ordinal()];
        return i8 != 1 ? i8 != 2 ? "" : "gcj02" : "bd09ll";
    }

    private String a(LanguageType languageType) {
        int i8 = a.f8642c[languageType.ordinal()];
        return i8 != 1 ? i8 != 2 ? "" : "cn" : "en";
    }
}
