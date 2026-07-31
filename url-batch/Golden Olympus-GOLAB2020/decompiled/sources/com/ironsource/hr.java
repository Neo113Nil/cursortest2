package com.ironsource;

import android.app.Activity;
import java.util.Map;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes2.dex */
public interface hr {
    void a(Activity activity);

    void a(String str, String str2, int i4);

    void a(String str, String str2, String str3, Map<String, String> map, mo moVar);

    void a(String str, String str2, String str3, Map<String, String> map, ro roVar);

    void a(JSONObject jSONObject);

    boolean a(String str);

    void b(JSONObject jSONObject);

    void c(JSONObject jSONObject);

    void onPause(Activity activity);

    void onResume(Activity activity);
}
