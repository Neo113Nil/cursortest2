package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class MessageData implements Jsonable {
    @NonNull
    public abstract Type getType();

    @Override // com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", getType().name().toLowerCase());
        return jSONObject;
    }
}
