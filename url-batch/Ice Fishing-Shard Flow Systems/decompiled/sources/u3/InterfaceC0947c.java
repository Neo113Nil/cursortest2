package u3;

import android.app.Notification;
import com.onesignal.notifications.internal.display.impl.b;
import org.json.JSONObject;
import s3.d;
import y.l;

/* renamed from: u3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0947c {
    void createGenericPendingIntentsForGroup(l lVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i2);

    Object createGrouplessSummaryNotification(d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i2, int i5, V5.b bVar);

    Notification createSingleNotificationBeforeSummaryBuilder(d dVar, l lVar);

    Object createSummaryNotification(d dVar, b.a aVar, int i2, V5.b bVar);

    Object updateSummaryNotification(d dVar, V5.b bVar);
}
