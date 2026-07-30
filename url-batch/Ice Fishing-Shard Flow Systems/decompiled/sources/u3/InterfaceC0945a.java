package u3;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import com.onesignal.notifications.internal.display.impl.b;
import org.json.JSONObject;
import s3.d;
import y.l;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0945a {
    void addNotificationActionButtons(JSONObject jSONObject, com.onesignal.notifications.internal.display.impl.a aVar, l lVar, int i2, String str);

    void addXiaomiSettings(b.a aVar, Notification notification);

    b.a getBaseOneSignalNotificationBuilder(d dVar);

    Bitmap getDefaultLargeIcon();

    int getDefaultSmallIconId();

    int getGroupAlertBehavior();

    Intent getNewBaseDismissIntent(int i2);

    PendingIntent getNewDismissActionPendingIntent(int i2, Intent intent);

    CharSequence getTitle(JSONObject jSONObject);

    void removeNotifyOptions(l lVar);
}
