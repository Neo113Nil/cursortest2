package w3;

import android.app.Activity;
import h3.h;
import h3.j;
import h3.k;
import h3.m;
import org.json.JSONArray;
import org.json.JSONObject;
import s3.d;

/* loaded from: classes.dex */
public interface b {
    void addExternalClickListener(h hVar);

    void addExternalForegroundLifecycleListener(j jVar);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, V5.b bVar);

    Object canReceiveNotification(JSONObject jSONObject, V5.b bVar);

    void externalNotificationWillShowInForeground(m mVar);

    void externalRemoteNotificationReceived(k kVar);

    Object notificationOpened(Activity activity, JSONArray jSONArray, V5.b bVar);

    Object notificationReceived(d dVar, V5.b bVar);

    void removeExternalClickListener(h hVar);

    void removeExternalForegroundLifecycleListener(j jVar);

    void setInternalNotificationLifecycleCallback(InterfaceC0991a interfaceC0991a);
}
