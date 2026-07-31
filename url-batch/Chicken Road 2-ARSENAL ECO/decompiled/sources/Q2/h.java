package Q2;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {
    private final Context context;
    private final JSONObject fcmPayload;

    public h(Context context, JSONObject fcmPayload) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(fcmPayload, "fcmPayload");
        this.context = context;
        this.fcmPayload = fcmPayload;
    }

    public final boolean getShouldOpenApp() {
        return g.INSTANCE.getShouldOpenActivity(this.context) && getUri() == null;
    }

    public final Uri getUri() {
        g gVar = g.INSTANCE;
        if (!gVar.getShouldOpenActivity(this.context) || gVar.getSuppressLaunchURL(this.context)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.fcmPayload.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject.has("u")) {
            String optString = jSONObject.optString("u");
            if (!kotlin.jvm.internal.i.a(optString, "")) {
                kotlin.jvm.internal.i.b(optString);
                int length = optString.length() - 1;
                int i7 = 0;
                boolean z5 = false;
                while (i7 <= length) {
                    boolean z6 = kotlin.jvm.internal.i.g(optString.charAt(!z5 ? i7 : length), 32) <= 0;
                    if (z5) {
                        if (!z6) {
                            break;
                        }
                        length--;
                    } else if (z6) {
                        i7++;
                    } else {
                        z5 = true;
                    }
                }
                return Uri.parse(optString.subSequence(i7, length + 1).toString());
            }
        }
        return null;
    }
}
