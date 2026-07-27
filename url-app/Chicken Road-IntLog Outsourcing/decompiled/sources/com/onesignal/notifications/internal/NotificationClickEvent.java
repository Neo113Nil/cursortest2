package com.onesignal.notifications.internal;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.INotification;
import com.onesignal.notifications.INotificationClickEvent;
import com.onesignal.notifications.INotificationClickResult;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NotificationClickEvent implements INotificationClickEvent {
    private final Notification _notification;
    private final NotificationClickResult _result;

    public NotificationClickEvent(Notification _notification, NotificationClickResult _result) {
        i.e(_notification, "_notification");
        i.e(_result, "_result");
        this._notification = _notification;
        this._result = _result;
    }

    @Override // com.onesignal.notifications.INotificationClickEvent
    public INotification getNotification() {
        return this._notification;
    }

    @Override // com.onesignal.notifications.INotificationClickEvent
    public INotificationClickResult getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put(OneSignalDbContract.NotificationTable.TABLE_NAME, this._notification.toJSONObject()).put("action", this._result.toJSONObject());
        i.d(put, "put(...)");
        return put;
    }
}
