package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AFLogger;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFe1mSDK {
    public final AFf1ySDK AFInAppEventParameterName;
    public final AFe1pSDK values;

    /* JADX WARN: Removed duplicated region for block: B:9:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFe1mSDK(JSONObject jSONObject) {
        AFe1pSDK aFe1pSDK;
        AFf1ySDK aFf1ySDK = null;
        if (jSONObject.has("exc_mngr")) {
            try {
                JSONObject optJSONObject = jSONObject.getJSONArray("exc_mngr").optJSONObject(0).optJSONObject("data");
                Objects.requireNonNull(optJSONObject);
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("v1");
                aFe1pSDK = new AFe1pSDK(optJSONObject2.getString("sdk_ver"), optJSONObject2.optInt("min", -1), optJSONObject2.optInt("expire", -1), optJSONObject2.optLong("ttl", -1L));
            } catch (NullPointerException | JSONException unused) {
            }
            if (jSONObject.has("meta_data")) {
                try {
                    JSONObject optJSONObject3 = jSONObject.getJSONArray("meta_data").optJSONObject(0).optJSONObject("data");
                    Objects.requireNonNull(optJSONObject3);
                    aFf1ySDK = new AFf1ySDK(optJSONObject3.optJSONObject("v1").optDouble("send_rate", 1.0d));
                } catch (NullPointerException | JSONException unused2) {
                }
            }
            this.values = aFe1pSDK;
            this.AFInAppEventParameterName = aFf1ySDK;
        }
        aFe1pSDK = null;
        if (jSONObject.has("meta_data")) {
        }
        this.values = aFe1pSDK;
        this.AFInAppEventParameterName = aFf1ySDK;
    }

    public static boolean AFInAppEventParameterName(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().isInstantApp();
        }
        try {
            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            return true;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstantAppsRuntime not found", e, true);
            return false;
        }
    }

    public final boolean equals(Object obj) {
        AFf1ySDK aFf1ySDK;
        if (this == obj) {
            return true;
        }
        if (obj != null && AFe1mSDK.class == obj.getClass()) {
            AFe1mSDK aFe1mSDK = (AFe1mSDK) obj;
            AFe1pSDK aFe1pSDK = this.values;
            if (aFe1pSDK != null && aFe1pSDK.equals(aFe1mSDK.values) && (aFf1ySDK = this.AFInAppEventParameterName) != null && aFf1ySDK.equals(aFe1mSDK.AFInAppEventParameterName)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        AFe1pSDK aFe1pSDK = this.values;
        if (aFe1pSDK != null) {
            return aFe1pSDK.hashCode();
        }
        return 0;
    }

    public AFe1mSDK() {
    }
}
