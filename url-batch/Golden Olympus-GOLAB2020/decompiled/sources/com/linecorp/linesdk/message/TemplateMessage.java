package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.template.LayoutTemplate;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TemplateMessage extends MessageData {

    @NonNull
    private String altText;

    @NonNull
    private LayoutTemplate template;

    public TemplateMessage(@NonNull String str, @NonNull LayoutTemplate layoutTemplate) {
        this.altText = str;
        this.template = layoutTemplate;
    }

    @Override // com.linecorp.linesdk.message.MessageData
    @NonNull
    public Type getType() {
        return Type.TEMPLATE;
    }

    @Override // com.linecorp.linesdk.message.MessageData, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("altText", this.altText);
        jsonObject.put("template", this.template.toJsonObject());
        return jsonObject;
    }
}
