package com.onesignal.inAppMessages.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements N2.b {
    private final a _message;
    private final c _result;

    public b(a msg, c actn) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(actn, "actn");
        this._message = msg;
        this._result = actn;
    }

    @Override // N2.b
    public N2.a getMessage() {
        return this._message;
    }

    @Override // N2.b
    public N2.d getResult() {
        return this._result;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("message", this._message.toJSONObject()).put("action", this._result.toJSONObject());
        Intrinsics.checkNotNullExpressionValue(put, "put(...)");
        return put;
    }
}
