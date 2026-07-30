package defpackage;

import android.util.Log;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.MainActivity;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fh1 implements AppsFlyerRequestListener, AppsFlyerConversionListener {
    public final /* synthetic */ MainActivity m;

    public /* synthetic */ fh1(MainActivity mainActivity) {
        this.m = mainActivity;
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        Log.w("MADebug", "AF attribution failure: " + str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        Log.w("MADebug", "AF conversion fail: " + str);
        if (str == null) {
            str = "unknown";
        }
        MainActivity mainActivity = this.m;
        MainActivity.q(mainActivity, "appsflyer_error", BuildConfig.FLAVOR, "error", null, str, 8);
        MainActivity.j(mainActivity, "conversion_fail");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map map) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        String str2 = null;
        String obj7 = (map == null || (obj6 = map.get("deep_link_value")) == null) ? null : obj6.toString();
        String str3 = BuildConfig.FLAVOR;
        if (obj7 == null) {
            obj7 = BuildConfig.FLAVOR;
        }
        String obj8 = (map == null || (obj5 = map.get("campaign")) == null) ? null : obj5.toString();
        if (obj8 == null) {
            obj8 = BuildConfig.FLAVOR;
        }
        String obj9 = (map == null || (obj4 = map.get("media_source")) == null) ? null : obj4.toString();
        if (obj9 == null) {
            obj9 = BuildConfig.FLAVOR;
        }
        String obj10 = (map == null || (obj3 = map.get("af_adset")) == null) ? null : obj3.toString();
        if (obj10 == null) {
            obj10 = BuildConfig.FLAVOR;
        }
        String obj11 = (map == null || (obj2 = map.get("af_ad")) == null) ? null : obj2.toString();
        if (obj11 == null) {
            obj11 = BuildConfig.FLAVOR;
        }
        if (map != null && (obj = map.get("af_status")) != null) {
            str2 = obj.toString();
        }
        if (str2 != null) {
            str3 = str2;
        }
        if (str3.equalsIgnoreCase("Organic")) {
            str = "Organic";
        } else {
            if (obj7.length() <= 0) {
                if (obj8.length() > 0) {
                    str = obj8;
                } else if (obj9.length() > 0) {
                    str = obj9;
                } else {
                    obj7 = "non-organic";
                }
            }
            str = obj7;
        }
        Log.d("MADebug", "AF conversion camp=" + str + " af_status=" + str3);
        MainActivity mainActivity = this.m;
        MainActivity.q(mainActivity, "appsflyer_data", str, "success", null, null, 24);
        if (mainActivity.o()) {
            mainActivity.n(str, obj9, obj10, obj11);
        }
    }

    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
    public void onError(int i, String str) {
        str.getClass();
        Log.w("MADebug", "AppsFlyer start() error code=" + i + " message=" + str);
        MainActivity mainActivity = this.m;
        MainActivity.q(mainActivity, "appsflyer_start_error", BuildConfig.FLAVOR, "error", null, "code=" + i + ", message=" + str, 8);
        MainActivity.j(mainActivity, "start_error");
    }

    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
    public void onSuccess() {
        Log.d("MADebug", "AppsFlyer start() success");
        MainActivity.q(this.m, "appsflyer_start_result", BuildConfig.FLAVOR, "success", null, null, 24);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map map) {
    }
}
