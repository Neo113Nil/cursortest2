package com.onesignal.inAppMessages.internal;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b implements K4.b {
    private final a _message;
    private final c _result;

    public b(a msg, c actn) {
        kotlin.jvm.internal.h.e(msg, "msg");
        kotlin.jvm.internal.h.e(actn, "actn");
        this._message = msg;
        this._result = actn;
    }

    @Override // K4.b
    public K4.a getMessage() {
        return this._message;
    }

    @Override // K4.b
    public K4.d getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("message", this._message.toJSONObject()).put(NativeAdvancedJsUtils.f18064p, this._result.toJSONObject());
        kotlin.jvm.internal.h.d(put, "put(...)");
        return put;
    }
}
