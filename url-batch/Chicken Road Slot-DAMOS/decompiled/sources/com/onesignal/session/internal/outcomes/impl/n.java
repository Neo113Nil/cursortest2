package com.onesignal.session.internal.outcomes.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n {
    private JSONArray inAppMessagesIds;
    private JSONArray notificationIds;

    public /* synthetic */ n(JSONArray jSONArray, JSONArray jSONArray2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? new JSONArray() : jSONArray, (i3 & 2) != 0 ? new JSONArray() : jSONArray2);
    }

    public final JSONArray getInAppMessagesIds() {
        return this.inAppMessagesIds;
    }

    public final JSONArray getNotificationIds() {
        return this.notificationIds;
    }

    public final void setInAppMessagesIds(JSONArray jSONArray) {
        this.inAppMessagesIds = jSONArray;
    }

    public final void setNotificationIds(JSONArray jSONArray) {
        this.notificationIds = jSONArray;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put(pc.e.NOTIFICATIONS_IDS, this.notificationIds).put("in_app_message_ids", this.inAppMessagesIds);
        put.getClass();
        return put;
    }

    public String toString() {
        return "OutcomeSourceBody{notificationIds=" + this.notificationIds + ", inAppMessagesIds=" + this.inAppMessagesIds + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(JSONArray jSONArray) {
        this(jSONArray, null, 2, 0 == true ? 1 : 0);
    }

    public n(JSONArray jSONArray, JSONArray jSONArray2) {
        this.notificationIds = jSONArray;
        this.inAppMessagesIds = jSONArray2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
