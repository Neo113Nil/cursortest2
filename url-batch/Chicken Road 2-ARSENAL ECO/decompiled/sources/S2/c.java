package S2;

import Q2.d;
import android.app.Notification;
import com.onesignal.notifications.internal.display.impl.b;
import o5.InterfaceC0564d;
import org.json.JSONObject;
import t.p;

/* loaded from: classes.dex */
public interface c {
    void createGenericPendingIntentsForGroup(p pVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i7);

    Object createGrouplessSummaryNotification(d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i7, int i8, InterfaceC0564d interfaceC0564d);

    Notification createSingleNotificationBeforeSummaryBuilder(d dVar, p pVar);

    Object createSummaryNotification(d dVar, b.a aVar, int i7, InterfaceC0564d interfaceC0564d);

    Object updateSummaryNotification(d dVar, InterfaceC0564d interfaceC0564d);
}
