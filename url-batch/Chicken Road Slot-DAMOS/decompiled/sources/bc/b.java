package bc;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.common.AndroidUtils;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
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

    public final a create(Context context, JSONObject jSONObject) {
        context.getClass();
        jSONObject.getClass();
        g gVar = new g(context, jSONObject);
        return new a(context, openBrowserIntent(gVar.getUri()), gVar.getShouldOpenApp());
    }
}
