package com.ironsource;

import android.webkit.WebView;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface wh {

    public interface a {
        void a(String str);

        void b(String str);
    }

    void a(String str, String str2);

    void a(String str, String str2, String str3);

    void a(JSONObject jSONObject, String str, String str2);

    void b(JSONObject jSONObject, String str, String str2);

    void c(JSONObject jSONObject, String str, String str2);

    WebView getPresentingView();
}
