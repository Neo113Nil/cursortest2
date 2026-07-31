package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.flex.container.FlexMessageContainer;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FlexMessage extends MessageData {

    @NonNull
    private String altText;

    @NonNull
    private FlexMessageContainer contents;

    public FlexMessage(@NonNull String str, @NonNull FlexMessageContainer flexMessageContainer) {
        this.altText = str;
        this.contents = flexMessageContainer;
    }

    @Override // com.linecorp.linesdk.message.MessageData
    @NonNull
    public Type getType() {
        return Type.FLEX;
    }

    @Override // com.linecorp.linesdk.message.MessageData, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("altText", this.altText);
        jsonObject.put("contents", this.contents.toJsonObject());
        return jsonObject;
    }
}
