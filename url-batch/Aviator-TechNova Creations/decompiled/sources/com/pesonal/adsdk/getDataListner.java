package com.pesonal.adsdk;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface getDataListner {
    void onRedirect(String str);

    void onUpdate(String str);

    void ongetExtradata(JSONObject jSONObject);

    void onsuccess();

    void reloadActivity();
}
