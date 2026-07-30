package com.appsflyer.internal;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFe1mSDK {
    public final AFf1ySDK AFInAppEventParameterName;
    public final AFe1pSDK values;

    public AFe1mSDK() {
    }

    public static boolean AFInAppEventParameterName(Context context) {
        return context.getPackageManager().isInstantApp();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFe1mSDK(JSONObject jSONObject) {
        AFe1pSDK aFe1pSDK;
        AFf1ySDK aFf1ySDK = null;
        if (jSONObject.has("exc_mngr")) {
            try {
                JSONObject optJSONObject = ((JSONObject) Objects.requireNonNull(jSONObject.getJSONArray("exc_mngr").optJSONObject(0).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE))).optJSONObject("v1");
                aFe1pSDK = new AFe1pSDK(optJSONObject.getString("sdk_ver"), optJSONObject.optInt("min", -1), optJSONObject.optInt("expire", -1), optJSONObject.optLong("ttl", -1L));
            } catch (NullPointerException | JSONException unused) {
            }
            if (jSONObject.has("meta_data")) {
                try {
                    aFf1ySDK = new AFf1ySDK(((JSONObject) Objects.requireNonNull(jSONObject.getJSONArray("meta_data").optJSONObject(0).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE))).optJSONObject("v1").optDouble("send_rate", 1.0d));
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

    public final int hashCode() {
        AFe1pSDK aFe1pSDK = this.values;
        if (aFe1pSDK != null) {
            return aFe1pSDK.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        AFf1ySDK aFf1ySDK;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFe1mSDK aFe1mSDK = (AFe1mSDK) obj;
            AFe1pSDK aFe1pSDK = this.values;
            if (aFe1pSDK != null && aFe1pSDK.equals(aFe1mSDK.values) && (aFf1ySDK = this.AFInAppEventParameterName) != null && aFf1ySDK.equals(aFe1mSDK.AFInAppEventParameterName)) {
                return true;
            }
        }
        return false;
    }
}
