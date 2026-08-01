package bc;

import android.content.Context;
import com.onesignal.common.AndroidUtils;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {
    public static final f INSTANCE = new f();

    private f() {
    }

    public final boolean getShouldOpenActivity(Context context) {
        context.getClass();
        return !"DISABLE".equals(AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    public final boolean getSuppressLaunchURL(Context context) {
        context.getClass();
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.suppressLaunchURLs");
    }
}
