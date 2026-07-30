package s3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.common.AndroidUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891b {
    public static final C0891b INSTANCE = new C0891b();

    private C0891b() {
    }

    private final Intent openBrowserIntent(Uri uri) {
        if (uri == null) {
            return null;
        }
        return AndroidUtils.INSTANCE.openURLInBrowserIntent(uri);
    }

    public final C0890a create(Context context, JSONObject fcmPayload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fcmPayload, "fcmPayload");
        h hVar = new h(context, fcmPayload);
        return new C0890a(context, openBrowserIntent(hVar.getUri()), hVar.getShouldOpenApp());
    }
}
