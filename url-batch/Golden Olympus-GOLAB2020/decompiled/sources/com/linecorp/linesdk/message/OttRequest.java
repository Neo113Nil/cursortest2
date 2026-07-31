package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class OttRequest {

    @NonNull
    private List<String> targetUserIds;

    public OttRequest(@NonNull List<String> list) {
        this.targetUserIds = list;
    }

    @NonNull
    private JSONObject toJsonObject() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.targetUserIds.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return new JSONObject().put("userIds", jSONArray);
    }

    @NonNull
    public String toJsonString() {
        return toJsonObject().toString();
    }
}
