package com.onesignal.notifications.internal.common;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class OSNotificationOpenBehaviorFromPushPayload {
    private final Context context;
    private final JSONObject fcmPayload;

    public OSNotificationOpenBehaviorFromPushPayload(Context context, JSONObject fcmPayload) {
        i.e(context, "context");
        i.e(fcmPayload, "fcmPayload");
        this.context = context;
        this.fcmPayload = fcmPayload;
    }

    public final boolean getShouldOpenApp() {
        return OSNotificationOpenAppSettings.INSTANCE.getShouldOpenActivity(this.context) && getUri() == null;
    }

    public final Uri getUri() {
        OSNotificationOpenAppSettings oSNotificationOpenAppSettings = OSNotificationOpenAppSettings.INSTANCE;
        if (!oSNotificationOpenAppSettings.getShouldOpenActivity(this.context) || oSNotificationOpenAppSettings.getSuppressLaunchURL(this.context)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.fcmPayload.optString(NotificationFormatHelper.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject.has("u")) {
            String optString = jSONObject.optString("u");
            if (!i.a(optString, "")) {
                i.b(optString);
                int length = optString.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z5 = i.g(optString.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z5) {
                            break;
                        }
                        length--;
                    } else if (z5) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                return Uri.parse(optString.subSequence(i2, length + 1).toString());
            }
        }
        return null;
    }
}
