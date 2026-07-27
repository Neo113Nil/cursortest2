package com.onesignal.notifications.internal.lifecycle;

import android.app.Activity;
import k4.InterfaceC1218d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface INotificationLifecycleCallback {
    Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC1218d interfaceC1218d);

    Object canReceiveNotification(JSONObject jSONObject, InterfaceC1218d interfaceC1218d);
}
