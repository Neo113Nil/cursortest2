package com.linecorp.linesdk.message.template;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class UriAction extends ClickActionForTemplateMessage {

    @NonNull
    private String label;

    @NonNull
    private String uri;

    public UriAction(@NonNull String str, @NonNull String str2) {
        this.type = "uri";
        this.uri = str2;
        this.label = str;
    }

    @Override // com.linecorp.linesdk.message.template.ClickActionForTemplateMessage, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("uri", this.uri);
        jsonObject.put("label", this.label);
        return jsonObject;
    }
}
