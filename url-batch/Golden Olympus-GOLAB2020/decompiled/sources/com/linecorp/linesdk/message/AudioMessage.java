package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AudioMessage extends MessageData {

    @NonNull
    private final Long durationMillis;

    @NonNull
    private final String originalContentUrl;

    public AudioMessage(@NonNull String str, @NonNull Long l4) {
        this.originalContentUrl = str;
        this.durationMillis = l4;
    }

    @Override // com.linecorp.linesdk.message.MessageData
    @NonNull
    public Type getType() {
        return Type.AUDIO;
    }

    @Override // com.linecorp.linesdk.message.MessageData, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("originalContentUrl", this.originalContentUrl);
        jsonObject.put(IronSourceConstants.EVENTS_DURATION, this.durationMillis);
        return jsonObject;
    }
}
