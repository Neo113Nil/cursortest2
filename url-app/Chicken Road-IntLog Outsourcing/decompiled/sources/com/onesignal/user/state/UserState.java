package com.onesignal.user.state;

import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class UserState {
    private final String externalId;
    private final String onesignalId;

    public UserState(String onesignalId, String externalId) {
        i.e(onesignalId, "onesignalId");
        i.e(externalId, "externalId");
        this.onesignalId = onesignalId;
        this.externalId = externalId;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getOnesignalId() {
        return this.onesignalId;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("onesignalId", this.onesignalId).put("externalId", this.externalId);
        i.d(put, "put(...)");
        return put;
    }
}
