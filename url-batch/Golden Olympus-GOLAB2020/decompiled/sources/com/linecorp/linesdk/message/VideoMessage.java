package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class VideoMessage extends MessageData {

    @NonNull
    private final String originalContentUrl;

    @NonNull
    private final String previewImageUrl;

    public VideoMessage(@NonNull String str, @NonNull String str2) {
        this.originalContentUrl = str;
        this.previewImageUrl = str2;
    }

    @Override // com.linecorp.linesdk.message.MessageData
    @NonNull
    public Type getType() {
        return Type.VIDEO;
    }

    @Override // com.linecorp.linesdk.message.MessageData, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("originalContentUrl", this.originalContentUrl);
        jsonObject.put("previewImageUrl", this.previewImageUrl);
        return jsonObject;
    }
}
