package com.ironsource.sdk;

import android.app.Activity;
import com.ironsource.sdk.e.c;
import com.ironsource.sdk.e.d;
import com.ironsource.sdk.e.e;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: SSAPublisher.java */
/* loaded from: classes2.dex */
public interface b {
    void a(Activity activity);

    void a(String str, String str2, int i);

    void a(String str, String str2, d dVar);

    void a(String str, String str2, String str3, Map<String, String> map, c cVar);

    void a(String str, String str2, String str3, Map<String, String> map, e eVar);

    void a(String str, String str2, Map<String, String> map, d dVar);

    void a(Map<String, String> map);

    void a(JSONObject jSONObject);

    boolean a(String str);

    void b(Activity activity);

    void b(JSONObject jSONObject);

    void c(JSONObject jSONObject);

    void d(JSONObject jSONObject);
}
