package U2;

import F2.h;
import F2.j;
import F2.k;
import F2.m;
import Q2.d;
import android.app.Activity;
import o5.InterfaceC0564d;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface b {
    void addExternalClickListener(h hVar);

    void addExternalForegroundLifecycleListener(j jVar);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC0564d interfaceC0564d);

    Object canReceiveNotification(JSONObject jSONObject, InterfaceC0564d interfaceC0564d);

    void externalNotificationWillShowInForeground(m mVar);

    void externalRemoteNotificationReceived(k kVar);

    Object notificationOpened(Activity activity, JSONArray jSONArray, InterfaceC0564d interfaceC0564d);

    Object notificationReceived(d dVar, InterfaceC0564d interfaceC0564d);

    void removeExternalClickListener(h hVar);

    void removeExternalForegroundLifecycleListener(j jVar);

    void setInternalNotificationLifecycleCallback(a aVar);
}
