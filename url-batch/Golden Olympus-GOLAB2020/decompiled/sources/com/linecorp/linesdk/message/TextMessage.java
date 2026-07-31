package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import com.ironsource.b9;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TextMessage extends MessageData {
    private final MessageSender sendBy;

    @NonNull
    private final String text;

    public TextMessage(@NonNull String str) {
        this.text = str;
        this.sendBy = null;
    }

    @Override // com.linecorp.linesdk.message.MessageData
    @NonNull
    public Type getType() {
        return Type.TEXT;
    }

    @Override // com.linecorp.linesdk.message.MessageData, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put(b9.h.f15450K0, this.text);
        MessageSender messageSender = this.sendBy;
        if (messageSender != null) {
            jsonObject.put("sentBy", messageSender.toJsonObject());
        }
        return jsonObject;
    }

    public TextMessage(@NonNull String str, MessageSender messageSender) {
        this.text = str;
        this.sendBy = messageSender;
    }
}
