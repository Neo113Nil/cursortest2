package com.onesignal.inAppMessages.internal;

import l2.InterfaceC0491a;
import l2.InterfaceC0492b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements InterfaceC0492b {
    private final a _message;
    private final c _result;

    public b(a msg, c actn) {
        kotlin.jvm.internal.i.e(msg, "msg");
        kotlin.jvm.internal.i.e(actn, "actn");
        this._message = msg;
        this._result = actn;
    }

    @Override // l2.InterfaceC0492b
    public InterfaceC0491a getMessage() {
        return this._message;
    }

    @Override // l2.InterfaceC0492b
    public l2.d getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("message", this._message.toJSONObject()).put("action", this._result.toJSONObject());
        kotlin.jvm.internal.i.d(put, "put(...)");
        return put;
    }
}
