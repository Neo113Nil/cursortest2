package com.linecorp.linesdk.message;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.utils.JSONUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MessageSendRequest {
    private List<MessageData> messages;
    private String ott;
    private String targetUserId;
    private List<String> targetUserIds;

    private MessageSendRequest() {
    }

    public static MessageSendRequest createMultiUsersType(@NonNull List<String> list, @NonNull List<MessageData> list2) {
        return new MessageSendRequest().setTargetUserIds(list).setMessages(list2);
    }

    public static MessageSendRequest createOttType(@NonNull String str, @NonNull List<MessageData> list) {
        return new MessageSendRequest().setOtt(str).setMessages(list);
    }

    public static MessageSendRequest createSingleUserType(@NonNull String str, @NonNull List<MessageData> list) {
        return new MessageSendRequest().setTargetUserId(str).setMessages(list);
    }

    private MessageSendRequest setMessages(@NonNull List<MessageData> list) {
        this.messages = list;
        return this;
    }

    private MessageSendRequest setOtt(@NonNull String str) {
        this.ott = str;
        return this;
    }

    private MessageSendRequest setTargetUserId(@NonNull String str) {
        this.targetUserId = str;
        return this;
    }

    private MessageSendRequest setTargetUserIds(@NonNull List<String> list) {
        this.targetUserIds = list;
        return this;
    }

    @NonNull
    private JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        JSONUtils.put(jSONObject, "to", this.targetUserId);
        JSONUtils.putArray(jSONObject, "to", this.targetUserIds);
        JSONUtils.put(jSONObject, "token", this.ott);
        JSONUtils.putArray(jSONObject, "messages", this.messages);
        return jSONObject;
    }

    @NonNull
    public String toJsonString() {
        return toJsonObject().toString();
    }
}
