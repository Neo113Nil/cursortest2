package com.onesignal.notifications.internal;

import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements F2.g {
    private final c _notification;
    private final e _result;

    public d(c _notification, e _result) {
        i.e(_notification, "_notification");
        i.e(_result, "_result");
        this._notification = _notification;
        this._result = _result;
    }

    @Override // F2.g
    public F2.f getNotification() {
        return this._notification;
    }

    @Override // F2.g
    public F2.i getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("notification", this._notification.toJSONObject()).put("action", this._result.toJSONObject());
        i.d(put, "put(...)");
        return put;
    }
}
