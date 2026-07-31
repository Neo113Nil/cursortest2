package com.linecorp.linesdk.message.flex.action;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.Jsonable;
import com.linecorp.linesdk.message.Stringable;
import com.linecorp.linesdk.utils.JSONUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class Action implements Jsonable {
    protected String label;

    @NonNull
    protected final Type type;

    public enum Type implements Stringable {
        POSTBACK,
        MESSAGE,
        URI,
        DATETIMEPICKER,
        CAMERA,
        CAMERAROLL,
        LOCATION
    }

    public Action(@NonNull Type type, String str) {
        this.type = type;
        this.label = str;
    }

    @Override // com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.type.name().toLowerCase());
        JSONUtils.put(jSONObject, "label", this.label);
        return jSONObject;
    }

    public Action(@NonNull Type type) {
        this(type, null);
    }
}
