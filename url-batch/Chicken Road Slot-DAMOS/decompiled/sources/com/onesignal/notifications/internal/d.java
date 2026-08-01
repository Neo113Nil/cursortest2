package com.onesignal.notifications.internal;

import org.json.JSONObject;
import qb.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements qb.g {
    private final c _notification;
    private final e _result;

    public d(c cVar, e eVar) {
        cVar.getClass();
        eVar.getClass();
        this._notification = cVar;
        this._result = eVar;
    }

    @Override // qb.g
    public qb.f getNotification() {
        return this._notification;
    }

    @Override // qb.g
    public i getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("notification", this._notification.toJSONObject()).put("action", this._result.toJSONObject());
        put.getClass();
        return put;
    }
}
