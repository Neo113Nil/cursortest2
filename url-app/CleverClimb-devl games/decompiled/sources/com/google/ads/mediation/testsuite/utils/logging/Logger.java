package com.google.ads.mediation.testsuite.utils.logging;

import android.content.Context;
import android.net.Uri;
import com.android.volley.n;
import com.android.volley.s;
import com.android.volley.toolbox.m;
import com.android.volley.toolbox.n;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.proguard.d;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Logger {
    static final String GEN204URL = "https://pagead2.googlesyndication.com/pagead/gen_204";
    public static String kEventType = "event_type";

    public static void logEvent(LogEvent logEvent, Context context) {
        Map<String, String> standardParameters = getStandardParameters(context);
        if (logEvent.getParameters() != null) {
            standardParameters.putAll(logEvent.getParameters());
        }
        Uri.Builder buildUpon = Uri.parse(GEN204URL).buildUpon();
        for (String str : standardParameters.keySet()) {
            buildUpon.appendQueryParameter(str, standardParameters.get(str));
        }
        buildUpon.appendQueryParameter(kEventType, logEvent.getEventType());
        n.a(context).a(new m(0, buildUpon.build().toString(), new n.b<String>() { // from class: com.google.ads.mediation.testsuite.utils.logging.Logger.1
            @Override // com.android.volley.n.b
            public void onResponse(String str2) {
            }
        }, new n.a() { // from class: com.google.ads.mediation.testsuite.utils.logging.Logger.2
            @Override // com.android.volley.n.a
            public void onErrorResponse(s sVar) {
            }
        }));
    }

    private static Map<String, String> getStandardParameters(Context context) {
        HashMap hashMap = new HashMap();
        TestSuiteState sharedInstance = TestSuiteState.sharedInstance();
        hashMap.put("id", "gmob-apps");
        hashMap.put("application_id", sharedInstance.getApplicationPackageName(context));
        hashMap.put("admob_app_id", sharedInstance.getAdMobApplicationId());
        hashMap.put(TapjoyConstants.TJC_TIMESTAMP, new Long(new Date().getTime()).toString());
        if (TestSuiteState.sharedInstance().getCountryCode() != null) {
            hashMap.put(d.N, TestSuiteState.sharedInstance().getCountryCode());
        }
        hashMap.put("user_agent", TestSuiteState.sharedInstance().getUserAgent());
        return hashMap;
    }
}
