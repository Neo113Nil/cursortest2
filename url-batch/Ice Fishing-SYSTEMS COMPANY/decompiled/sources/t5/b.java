package t5;

import android.app.Activity;
import e5.h;
import e5.j;
import e5.k;
import e5.m;
import org.json.JSONArray;
import org.json.JSONObject;
import p5.d;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public interface b {
    void addExternalClickListener(h hVar);

    void addExternalForegroundLifecycleListener(j jVar);

    Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC5133d interfaceC5133d);

    Object canReceiveNotification(JSONObject jSONObject, InterfaceC5133d interfaceC5133d);

    void externalNotificationWillShowInForeground(m mVar);

    void externalRemoteNotificationReceived(k kVar);

    Object notificationOpened(Activity activity, JSONArray jSONArray, InterfaceC5133d interfaceC5133d);

    Object notificationReceived(d dVar, InterfaceC5133d interfaceC5133d);

    void removeExternalClickListener(h hVar);

    void removeExternalForegroundLifecycleListener(j jVar);

    void setInternalNotificationLifecycleCallback(InterfaceC5081a interfaceC5081a);
}
