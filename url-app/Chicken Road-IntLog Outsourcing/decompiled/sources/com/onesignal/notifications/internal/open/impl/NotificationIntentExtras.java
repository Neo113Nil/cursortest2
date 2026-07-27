package com.onesignal.notifications.internal.open.impl;

import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NotificationIntentExtras {
    private JSONArray dataArray;
    private JSONObject jsonData;

    public NotificationIntentExtras(JSONArray dataArray, JSONObject jsonData) {
        i.e(dataArray, "dataArray");
        i.e(jsonData, "jsonData");
        this.dataArray = dataArray;
        this.jsonData = jsonData;
    }

    public static /* synthetic */ NotificationIntentExtras copy$default(NotificationIntentExtras notificationIntentExtras, JSONArray jSONArray, JSONObject jSONObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jSONArray = notificationIntentExtras.dataArray;
        }
        if ((i2 & 2) != 0) {
            jSONObject = notificationIntentExtras.jsonData;
        }
        return notificationIntentExtras.copy(jSONArray, jSONObject);
    }

    public final JSONArray component1() {
        return this.dataArray;
    }

    public final JSONObject component2() {
        return this.jsonData;
    }

    public final NotificationIntentExtras copy(JSONArray dataArray, JSONObject jsonData) {
        i.e(dataArray, "dataArray");
        i.e(jsonData, "jsonData");
        return new NotificationIntentExtras(dataArray, jsonData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationIntentExtras)) {
            return false;
        }
        NotificationIntentExtras notificationIntentExtras = (NotificationIntentExtras) obj;
        return i.a(this.dataArray, notificationIntentExtras.dataArray) && i.a(this.jsonData, notificationIntentExtras.jsonData);
    }

    public final JSONArray getDataArray() {
        return this.dataArray;
    }

    public final JSONObject getJsonData() {
        return this.jsonData;
    }

    public int hashCode() {
        return this.jsonData.hashCode() + (this.dataArray.hashCode() * 31);
    }

    public final void setDataArray(JSONArray jSONArray) {
        i.e(jSONArray, "<set-?>");
        this.dataArray = jSONArray;
    }

    public final void setJsonData(JSONObject jSONObject) {
        i.e(jSONObject, "<set-?>");
        this.jsonData = jSONObject;
    }

    public String toString() {
        return "NotificationIntentExtras(dataArray=" + this.dataArray + ", jsonData=" + this.jsonData + ')';
    }
}
