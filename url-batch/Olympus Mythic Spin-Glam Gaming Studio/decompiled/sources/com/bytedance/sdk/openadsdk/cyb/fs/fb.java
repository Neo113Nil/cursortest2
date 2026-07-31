package com.bytedance.sdk.openadsdk.cyb.fs;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.O6;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class fb {

    public static class zmn {
        public final JSONObject fs;
        public final String zmn;

        public zmn(String str, JSONObject jSONObject) {
            this.zmn = str;
            this.fs = jSONObject;
            JSONObject optJSONObject = jSONObject.optJSONObject(DeviceRequestsHelper.DEVICE_INFO_PARAM);
            if (optJSONObject != null) {
                try {
                    optJSONObject.put(O6.X0, com.bytedance.sdk.openadsdk.phc.zmn.fs.zmn.zmn().fs());
                    jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, optJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static zn zmn() {
        return btk.zmn();
    }
}
