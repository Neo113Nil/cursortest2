package S2;

import Q2.d;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import com.onesignal.notifications.internal.display.impl.b;
import org.json.JSONObject;
import t.p;

/* loaded from: classes.dex */
public interface a {
    void addNotificationActionButtons(JSONObject jSONObject, com.onesignal.notifications.internal.display.impl.a aVar, p pVar, int i7, String str);

    void addXiaomiSettings(b.a aVar, Notification notification);

    b.a getBaseOneSignalNotificationBuilder(d dVar);

    Bitmap getDefaultLargeIcon();

    int getDefaultSmallIconId();

    int getGroupAlertBehavior();

    Intent getNewBaseDismissIntent(int i7);

    PendingIntent getNewDismissActionPendingIntent(int i7, Intent intent);

    CharSequence getTitle(JSONObject jSONObject);

    void removeNotifyOptions(p pVar);
}
