package bc;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {
    private final Context context;
    private final JSONObject fcmPayload;

    public g(Context context, JSONObject jSONObject) {
        context.getClass();
        jSONObject.getClass();
        this.context = context;
        this.fcmPayload = jSONObject;
    }

    public final boolean getShouldOpenApp() {
        return f.INSTANCE.getShouldOpenActivity(this.context) && getUri() == null;
    }

    public final Uri getUri() {
        f fVar = f.INSTANCE;
        if (!fVar.getShouldOpenActivity(this.context) || fVar.getSuppressLaunchURL(this.context)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.fcmPayload.optString(c.PAYLOAD_OS_ROOT_CUSTOM));
        if (jSONObject.has("u")) {
            String optString = jSONObject.optString("u");
            if (!Intrinsics.a(optString, "")) {
                optString.getClass();
                int length = optString.length() - 1;
                int i3 = 0;
                boolean z10 = false;
                while (i3 <= length) {
                    boolean z11 = Intrinsics.b(optString.charAt(!z10 ? i3 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i3++;
                    } else {
                        z10 = true;
                    }
                }
                return Uri.parse(optString.subSequence(i3, length + 1).toString());
            }
        }
        return null;
    }
}
