package com.onesignal.notifications.internal;

import org.json.JSONObject;
import qb.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements i {
    private final String actionId;
    private final String url;

    public e(String str, String str2) {
        this.actionId = str;
        this.url = str2;
    }

    @Override // qb.i
    public String getActionId() {
        return this.actionId;
    }

    @Override // qb.i
    public String getUrl() {
        return this.url;
    }

    public final JSONObject toJSONObject() {
        return com.onesignal.common.e.putSafe(com.onesignal.common.e.putSafe(new JSONObject(), "actionId", getActionId()), "url", getUrl());
    }
}
