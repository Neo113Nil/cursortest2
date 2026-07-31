package Q2;

import android.content.Context;
import com.onesignal.common.AndroidUtils;

/* loaded from: classes.dex */
public final class g {
    public static final g INSTANCE = new g();

    private g() {
    }

    public final boolean getShouldOpenActivity(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        return !"DISABLE".equals(AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    public final boolean getSuppressLaunchURL(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.suppressLaunchURLs");
    }
}
