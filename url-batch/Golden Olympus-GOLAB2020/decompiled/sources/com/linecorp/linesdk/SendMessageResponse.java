package com.linecorp.linesdk;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SendMessageResponse {

    @NonNull
    private String receiverId;

    @NonNull
    private Status status;

    public enum Status {
        OK,
        DISCARDED
    }

    public SendMessageResponse(@NonNull String str, @NonNull Status status) {
        this.receiverId = str;
        this.status = status;
    }

    @NonNull
    public static SendMessageResponse fromJsonObject(@NonNull JSONObject jSONObject) {
        Object obj = jSONObject.get("status");
        Status status = Status.OK;
        if (!obj.equals(status.name().toLowerCase())) {
            status = Status.DISCARDED;
        }
        return new SendMessageResponse(jSONObject.getString("to"), status);
    }

    @NonNull
    public Status getStatus() {
        return this.status;
    }

    @NonNull
    public String getTargetUserId() {
        return this.receiverId;
    }

    public String toString() {
        return "SendMessageResponse{receiverId='" + this.receiverId + "', status='" + this.status + "'}";
    }
}
