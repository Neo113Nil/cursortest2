package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.utils.JSONUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ImageMessage extends MessageData {
    private Boolean animated = Boolean.FALSE;
    private String extension;
    private Long fileSize;

    @NonNull
    private final String originalContentUrl;

    @NonNull
    private final String previewImageUrl;
    private MessageSender sentBy;

    public ImageMessage(@NonNull String str, @NonNull String str2) {
        this.originalContentUrl = str;
        this.previewImageUrl = str2;
    }

    @Override // com.linecorp.linesdk.message.MessageData
    @NonNull
    public Type getType() {
        return Type.IMAGE;
    }

    public void setAnimated(Boolean bool) {
        this.animated = bool;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setFileSize(Long l4) {
        this.fileSize = l4;
    }

    public void setSentBy(MessageSender messageSender) {
        this.sentBy = messageSender;
    }

    @Override // com.linecorp.linesdk.message.MessageData, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("originalContentUrl", this.originalContentUrl);
        jsonObject.put("previewImageUrl", this.previewImageUrl);
        jsonObject.put("animated", this.animated);
        jsonObject.put("extension", this.extension);
        jsonObject.put("fileSize", this.fileSize);
        JSONUtils.put(jsonObject, "sentBy", this.sentBy);
        return jsonObject;
    }
}
