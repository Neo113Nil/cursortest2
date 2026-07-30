package com.onesignal.notifications.internal;

import h3.InterfaceC0479f;
import h3.i;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements h3.g {
    private final c _notification;
    private final e _result;

    public d(c _notification, e _result) {
        Intrinsics.checkNotNullParameter(_notification, "_notification");
        Intrinsics.checkNotNullParameter(_result, "_result");
        this._notification = _notification;
        this._result = _result;
    }

    @Override // h3.g
    public InterfaceC0479f getNotification() {
        return this._notification;
    }

    @Override // h3.g
    public i getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("notification", this._notification.toJSONObject()).put("action", this._result.toJSONObject());
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }
}
