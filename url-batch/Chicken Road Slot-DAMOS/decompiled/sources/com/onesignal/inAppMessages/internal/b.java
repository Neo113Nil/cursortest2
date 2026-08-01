package com.onesignal.inAppMessages.internal;

import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements wa.b {
    private final a _message;
    private final c _result;

    public b(a aVar, c cVar) {
        aVar.getClass();
        cVar.getClass();
        this._message = aVar;
        this._result = cVar;
    }

    @Override // wa.b
    public wa.a getMessage() {
        return this._message;
    }

    @Override // wa.b
    public wa.d getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("message", this._message.toJSONObject()).put("action", this._result.toJSONObject());
        put.getClass();
        return put;
    }
}
