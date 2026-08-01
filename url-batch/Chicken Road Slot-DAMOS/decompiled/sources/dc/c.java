package dc;

import android.app.Notification;
import bc.d;
import com.onesignal.notifications.internal.display.impl.b;
import e3.g;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface c {
    void createGenericPendingIntentsForGroup(g gVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i3);

    Object createGrouplessSummaryNotification(d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i3, int i10, ld.a aVar2);

    Notification createSingleNotificationBeforeSummaryBuilder(d dVar, g gVar);

    Object createSummaryNotification(d dVar, b.a aVar, int i3, ld.a aVar2);

    Object updateSummaryNotification(d dVar, ld.a aVar);
}
