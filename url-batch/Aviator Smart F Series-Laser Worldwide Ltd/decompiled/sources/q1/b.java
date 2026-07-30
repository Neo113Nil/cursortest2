package q1;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class b {
    private b() {
    }

    public static boolean isNotificationEnabled(Context context) {
        Iterator<String> it = NotificationManagerCompat.getEnabledListenerPackages(context).iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next(), context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public static void openNotificationAccess(Context context) {
        context.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
    }
}
