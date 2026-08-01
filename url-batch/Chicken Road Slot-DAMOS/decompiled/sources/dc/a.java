package dc;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import bc.d;
import com.onesignal.notifications.internal.display.impl.b;
import e3.g;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface a {
    void addNotificationActionButtons(JSONObject jSONObject, com.onesignal.notifications.internal.display.impl.a aVar, g gVar, int i3, String str);

    void addXiaomiSettings(b.a aVar, Notification notification);

    b.a getBaseOneSignalNotificationBuilder(d dVar);

    Bitmap getDefaultLargeIcon();

    int getDefaultSmallIconId();

    int getGroupAlertBehavior();

    Intent getNewBaseDismissIntent(int i3);

    PendingIntent getNewDismissActionPendingIntent(int i3, Intent intent);

    CharSequence getTitle(JSONObject jSONObject);

    void removeNotifyOptions(g gVar);
}
