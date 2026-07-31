package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi
@RestrictTo
/* loaded from: classes3.dex */
public class NotificationApiHelperForM {
    static Parcelable[] getActiveNotifications(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
