package com.linecorp.linesdk.message.template;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.Jsonable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class LayoutTemplate implements Jsonable {

    @NonNull
    private final Type type;

    public LayoutTemplate(@NonNull Type type) {
        this.type = type;
    }

    @Override // com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.type.getServerKey());
        return jSONObject;
    }
}
