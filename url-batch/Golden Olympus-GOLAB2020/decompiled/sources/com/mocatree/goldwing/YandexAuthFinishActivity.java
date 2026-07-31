package com.mocatree.goldwing;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.unity3d.player.UnityPlayer;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class YandexAuthFinishActivity extends Activity {
    private Map a(Uri uri) {
        HashMap hashMap = new HashMap();
        if (uri != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery != null) {
                c(hashMap, encodedQuery);
            }
            String encodedFragment = uri.getEncodedFragment();
            if (encodedFragment != null) {
                c(hashMap, encodedFragment);
            }
        }
        return hashMap;
    }

    private void b(Intent intent) {
        Uri data = intent != null ? intent.getData() : null;
        Log.d("YandexAuthFinish", "finish callback received uri=" + e(data));
        int i4 = 0;
        try {
            Map a4 = a(data);
            String str = (String) a4.get("access_token");
            String str2 = (String) a4.get("error");
            String str3 = (String) a4.get("error_description");
            if (str == null || str.length() <= 0) {
                if (str3 != null && str3.length() > 0) {
                    str2 = str3;
                } else if (str2 == null || str2.length() <= 0) {
                    str2 = "Yandex finish callback without token";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ok", false);
                jSONObject.put("error", str2);
                f(jSONObject.toString(), false);
                Log.w("YandexAuthFinish", "direct finish failed: " + str2);
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ok", true);
                jSONObject2.put("token", str);
                f(jSONObject2.toString(), true);
                Log.d("YandexAuthFinish", "direct finish success tokenLen=" + str.length());
                i4 = -1;
            }
        } catch (Throwable th) {
            Log.e("YandexAuthFinish", "direct finish parse failed", th);
            f("{\"ok\":false,\"error\":\"Yandex finish parse failed\"}", false);
        }
        d(i4);
    }

    private void c(Map map, String str) {
        for (String str2 : str.split("&")) {
            if (str2 != null && str2.length() != 0) {
                int indexOf = str2.indexOf(61);
                map.put(g(indexOf >= 0 ? str2.substring(0, indexOf) : str2), g(indexOf >= 0 ? str2.substring(indexOf + 1) : ""));
            }
        }
    }

    private void d(int i4) {
        Intent launchIntentForPackage;
        try {
            Activity activity = UnityPlayer.currentActivity;
            if (activity != null) {
                launchIntentForPackage = new Intent(getApplicationContext(), activity.getClass());
                launchIntentForPackage.addFlags(537001984);
            } else {
                launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(872546304);
                }
            }
            if (launchIntentForPackage != null) {
                startActivity(launchIntentForPackage);
            }
        } catch (Throwable th) {
            Log.e("YandexAuthFinish", "Failed to return to Unity", th);
        }
        finishAffinity();
        overridePendingTransition(0, 0);
    }

    private String e(Uri uri) {
        if (uri == null) {
            return "null";
        }
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("access_token=");
        if (indexOf < 0) {
            return uri2;
        }
        return uri2.substring(0, indexOf) + "access_token=<redacted>";
    }

    private void f(String str, boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor putLong = getSharedPreferences("yandex_auth", 0).edit().putString("result_json", str).putLong("result_ts", currentTimeMillis);
        if (z4) {
            putLong.putLong("direct_success_ts", currentTimeMillis);
        }
        putLong.apply();
        try {
            UnityPlayer.UnitySendMessage("YandexLoginHelper", "OnRedirect", str);
            Log.d("YandexAuthFinish", "UnitySendMessage delivered jsonLen=" + str.length());
        } catch (Throwable th) {
            Log.w("YandexAuthFinish", "UnitySendMessage failed; prefs backup saved", th);
        }
    }

    private String g(String str) {
        return URLDecoder.decode(str, "UTF-8");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b(getIntent());
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        b(intent);
    }
}
