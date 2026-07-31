package com.linecorp.linesdk.message.template;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.Jsonable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ClickActionForTemplateMessage implements Jsonable {
    protected String type;

    @Override // com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.type);
        return jSONObject;
    }
}
