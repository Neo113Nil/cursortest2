package Q2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.common.AndroidUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    private b() {
    }

    private final Intent openBrowserIntent(Uri uri) {
        if (uri == null) {
            return null;
        }
        return AndroidUtils.INSTANCE.openURLInBrowserIntent(uri);
    }

    public final a create(Context context, JSONObject fcmPayload) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(fcmPayload, "fcmPayload");
        h hVar = new h(context, fcmPayload);
        return new a(context, openBrowserIntent(hVar.getUri()), hVar.getShouldOpenApp());
    }
}
