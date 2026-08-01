package fc;

import android.app.Activity;
import bc.d;
import org.json.JSONArray;
import org.json.JSONObject;
import qb.h;
import qb.j;
import qb.k;
import qb.m;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface b {
    void addExternalClickListener(h hVar);

    void addExternalForegroundLifecycleListener(j jVar);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, ld.a aVar);

    Object canReceiveNotification(JSONObject jSONObject, ld.a aVar);

    void externalNotificationWillShowInForeground(m mVar);

    void externalRemoteNotificationReceived(k kVar);

    Object notificationOpened(Activity activity, JSONArray jSONArray, ld.a aVar);

    Object notificationReceived(d dVar, ld.a aVar);

    void removeExternalClickListener(h hVar);

    void removeExternalForegroundLifecycleListener(j jVar);

    void setInternalNotificationLifecycleCallback(a aVar);
}
