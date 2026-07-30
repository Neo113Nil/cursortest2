package s3;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {
    private final Context context;
    private final JSONObject fcmPayload;

    public h(Context context, JSONObject fcmPayload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fcmPayload, "fcmPayload");
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
            if (!Intrinsics.a(optString, "")) {
                Intrinsics.b(optString);
                int length = optString.length() - 1;
                int i2 = 0;
                boolean z7 = false;
                while (i2 <= length) {
                    boolean z8 = Intrinsics.d(optString.charAt(!z7 ? i2 : length), 32) <= 0;
                    if (z7) {
                        if (!z8) {
                            break;
                        }
                        length--;
                    } else if (z8) {
                        i2++;
                    } else {
                        z7 = true;
                    }
                }
                return Uri.parse(optString.subSequence(i2, length + 1).toString());
            }
        }
        return null;
    }
}
