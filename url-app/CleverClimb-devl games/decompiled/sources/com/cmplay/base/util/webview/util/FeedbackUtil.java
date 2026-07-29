package com.cmplay.base.util.webview.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.cmplay.base.util.i;
import com.cmplay.base.util.webview.ui.WebViewActivity;
import com.cmplay.base.util.x;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FeedbackUtil {
    public static final int CN = 1;
    public static final int OU = 2;
    public static final String URL_CN = "https://tuc.ijinshan.com/report";
    public static final String URL_OU = "https://tuc.ksmobile.net/report";

    public static String getFeedbackUrl(int i) {
        switch (i) {
            case 1:
                return URL_CN;
            case 2:
                return URL_OU;
            default:
                return URL_OU;
        }
    }

    public static void postFeedback(Context context, String str) {
        String str2;
        int i;
        JSONObject jSONObject;
        Context applicationContext = context.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str3 = "";
        String str4 = "";
        int i2 = 0;
        try {
            jSONObject = new JSONObject(str);
            str2 = jSONObject.optString("contact", "");
            try {
                i = jSONObject.optInt("feedback_id", 0);
            } catch (JSONException e) {
                str3 = str2;
                e = e;
            }
        } catch (JSONException e2) {
            e = e2;
        }
        try {
            str4 = jSONObject.optString("feedback_msg", "");
        } catch (JSONException e3) {
            str3 = str2;
            e = e3;
            i2 = i;
            e.printStackTrace();
            str2 = str3;
            i = i2;
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(TapjoyConstants.TJC_APP_ID, String.valueOf(WebViewActivity.mFeedbackAppId));
            hashMap.put("auto_category", String.valueOf(i));
            hashMap.put("chanel", "0");
            hashMap.put("type", "feedback");
            hashMap.put("model", Build.MODEL);
            hashMap.put("sysversion", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("uuid", x.c(applicationContext));
            hashMap.put("version", i.a(applicationContext));
            hashMap.put("contact", str2);
            hashMap.put("syslang", i.c(applicationContext));
            hashMap.put("content", str4 + "\n 包名：" + applicationContext.getPackageName());
            NetworkUtil.getInstance().post(getFeedbackUrl(WebViewActivity.mFeedbackProductId), hashMap);
        }
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put(TapjoyConstants.TJC_APP_ID, String.valueOf(WebViewActivity.mFeedbackAppId));
        hashMap2.put("auto_category", String.valueOf(i));
        hashMap2.put("chanel", "0");
        hashMap2.put("type", "feedback");
        hashMap2.put("model", Build.MODEL);
        hashMap2.put("sysversion", String.valueOf(Build.VERSION.SDK_INT));
        hashMap2.put("uuid", x.c(applicationContext));
        hashMap2.put("version", i.a(applicationContext));
        hashMap2.put("contact", str2);
        hashMap2.put("syslang", i.c(applicationContext));
        hashMap2.put("content", str4 + "\n 包名：" + applicationContext.getPackageName());
        NetworkUtil.getInstance().post(getFeedbackUrl(WebViewActivity.mFeedbackProductId), hashMap2);
    }
}
