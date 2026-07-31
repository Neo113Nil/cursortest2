package com.linecorp.linesdk.message.flex.container;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.Jsonable;
import com.linecorp.linesdk.message.Stringable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class FlexMessageContainer implements Jsonable {
    protected final Type type;

    public enum Type implements Stringable {
        BUBBLE,
        CAROUSEL
    }

    public FlexMessageContainer(@NonNull Type type) {
        this.type = type;
    }

    @Override // com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.type.name().toLowerCase());
        return jSONObject;
    }
}
