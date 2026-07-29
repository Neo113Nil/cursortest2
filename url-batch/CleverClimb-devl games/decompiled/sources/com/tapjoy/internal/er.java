package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TJAdUnitJSBridge;
import com.tapjoy.Tapjoy;
import com.tapjoy.TapjoyCache;
import com.tapjoy.TapjoyCachedAssetData;
import com.tapjoy.TapjoyLog;
import com.tapjoy.TapjoyUtil;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class er {

    /* renamed from: b, reason: collision with root package name */
    public static String f8015b = "";

    /* renamed from: a, reason: collision with root package name */
    public TJAdUnitJSBridge f8016a;

    /* renamed from: d, reason: collision with root package name */
    private cr f8018d;
    private cs e;
    private dc g;
    private cx f = cx.a("Tapjoy", Tapjoy.getVersion());

    /* renamed from: c, reason: collision with root package name */
    public boolean f8017c = false;

    public er(TJAdUnitJSBridge tJAdUnitJSBridge) {
        this.f8016a = tJAdUnitJSBridge;
    }

    public final boolean a(JSONObject jSONObject) {
        if (this.f8016a.f7627b == null) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- WebView is null");
            return false;
        }
        if (this.f8016a.f7626a == null) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- TJAdUnit is null");
            return false;
        }
        if (this.f8016a.f7626a.getVideoView() == null) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- VideoView is null");
            return false;
        }
        if (jSONObject == null) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- json parameter is null");
            return false;
        }
        if (!jSONObject.has(TJAdUnitConstants.String.OM_JAVASCRIPT_URL)) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- unable to parse om javascript url from json");
            return false;
        }
        try {
            jSONObject.getJSONArray(TJAdUnitConstants.String.VENDORS);
            return true;
        } catch (JSONException unused) {
            TapjoyLog.d("TJOMViewabilityAgent", "Can not init -- unable to parse vendors from json");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List b(JSONArray jSONArray) {
        cy a2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString(TJAdUnitConstants.String.VENDOR_JS_URL, null);
                if (optString == null) {
                    TapjoyLog.d("TJOMViewabilityAgent", "Vendor JS URL not found. Skipping.");
                } else {
                    try {
                        URL url = new URL(optString);
                        String optString2 = jSONObject.optString(TJAdUnitConstants.String.VENDOR_NAME, null);
                        String optString3 = jSONObject.optString(TJAdUnitConstants.String.VENDOR_PARAMETERS, null);
                        if (optString3 == null || optString2 == null) {
                            a2 = cy.a(url);
                        } else {
                            a2 = cy.a(optString2, url, optString3);
                        }
                        arrayList.add(a2);
                    } catch (Exception unused) {
                        TapjoyLog.d("TJOMViewabilityAgent", "Malformed vendor JS URL. Skipping " + optString);
                    }
                }
            } catch (JSONException unused2) {
                TapjoyLog.d("TJOMViewabilityAgent", "Malformed vendor object. Skipping.");
            }
        }
        return arrayList;
    }

    public static void b(JSONObject jSONObject) {
        if (al.a(f8015b)) {
            String optString = jSONObject.optString(TJAdUnitConstants.String.OM_JAVASCRIPT_URL, null);
            if (optString == null) {
                TapjoyLog.d("TJOMViewabilityAgent", "Open Mediation JavaScript name not found in json.");
                return;
            }
            try {
                TapjoyCachedAssetData cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(optString);
                if (cachedDataForURL == null) {
                    TapjoyCache.getInstance().cacheAssetFromURL(optString, "", 30L).get();
                    cachedDataForURL = TapjoyCache.getInstance().getCachedDataForURL(optString);
                }
                f8015b = cachedDataForURL == null ? "" : TapjoyUtil.getFileContents(new File(cachedDataForURL.getLocalFilePath()));
            } catch (Exception unused) {
                TapjoyLog.d("TJOMViewabilityAgent", "Failed downloading Open Mediation JavaScript");
            }
        }
    }
}
