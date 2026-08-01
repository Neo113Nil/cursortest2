package com.onesignal.notifications.internal.open.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    private JSONArray dataArray;
    private JSONObject jsonData;

    public a(JSONArray jSONArray, JSONObject jSONObject) {
        jSONArray.getClass();
        jSONObject.getClass();
        this.dataArray = jSONArray;
        this.jsonData = jSONObject;
    }

    public static /* synthetic */ a copy$default(a aVar, JSONArray jSONArray, JSONObject jSONObject, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            jSONArray = aVar.dataArray;
        }
        if ((i3 & 2) != 0) {
            jSONObject = aVar.jsonData;
        }
        return aVar.copy(jSONArray, jSONObject);
    }

    public final JSONArray component1() {
        return this.dataArray;
    }

    public final JSONObject component2() {
        return this.jsonData;
    }

    public final a copy(JSONArray jSONArray, JSONObject jSONObject) {
        jSONArray.getClass();
        jSONObject.getClass();
        return new a(jSONArray, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.dataArray, aVar.dataArray) && Intrinsics.a(this.jsonData, aVar.jsonData);
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
        jSONArray.getClass();
        this.dataArray = jSONArray;
    }

    public final void setJsonData(JSONObject jSONObject) {
        jSONObject.getClass();
        this.jsonData = jSONObject;
    }

    public String toString() {
        return "NotificationIntentExtras(dataArray=" + this.dataArray + ", jsonData=" + this.jsonData + ')';
    }
}
