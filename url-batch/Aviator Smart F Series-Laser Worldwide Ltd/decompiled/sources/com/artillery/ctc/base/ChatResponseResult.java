package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class ChatResponseResult {
    private final ChatResponseAnswer data;
    private final int ended;
    private final String path;
    private final String qid;
    private final String type;

    public ChatResponseResult() {
        this(null, null, null, null, 0, 31, null);
    }

    public static /* synthetic */ ChatResponseResult copy$default(ChatResponseResult chatResponseResult, String str, String str2, String str3, ChatResponseAnswer chatResponseAnswer, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = chatResponseResult.type;
        }
        if ((i9 & 2) != 0) {
            str2 = chatResponseResult.path;
        }
        String str4 = str2;
        if ((i9 & 4) != 0) {
            str3 = chatResponseResult.qid;
        }
        String str5 = str3;
        if ((i9 & 8) != 0) {
            chatResponseAnswer = chatResponseResult.data;
        }
        ChatResponseAnswer chatResponseAnswer2 = chatResponseAnswer;
        if ((i9 & 16) != 0) {
            i8 = chatResponseResult.ended;
        }
        return chatResponseResult.copy(str, str4, str5, chatResponseAnswer2, i8);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.path;
    }

    public final String component3() {
        return this.qid;
    }

    public final ChatResponseAnswer component4() {
        return this.data;
    }

    public final int component5() {
        return this.ended;
    }

    public final ChatResponseResult copy(String type, String path, String qid, ChatResponseAnswer chatResponseAnswer, int i8) {
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(path, "path");
        s.checkNotNullParameter(qid, "qid");
        return new ChatResponseResult(type, path, qid, chatResponseAnswer, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatResponseResult)) {
            return false;
        }
        ChatResponseResult chatResponseResult = (ChatResponseResult) obj;
        return s.areEqual(this.type, chatResponseResult.type) && s.areEqual(this.path, chatResponseResult.path) && s.areEqual(this.qid, chatResponseResult.qid) && s.areEqual(this.data, chatResponseResult.data) && this.ended == chatResponseResult.ended;
    }

    public final ChatResponseAnswer getData() {
        return this.data;
    }

    public final int getEnded() {
        return this.ended;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getQid() {
        return this.qid;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.type.hashCode() * 31) + this.path.hashCode()) * 31) + this.qid.hashCode()) * 31;
        ChatResponseAnswer chatResponseAnswer = this.data;
        return ((hashCode + (chatResponseAnswer == null ? 0 : chatResponseAnswer.hashCode())) * 31) + this.ended;
    }

    public String toString() {
        return "ChatResponseResult(type=" + this.type + ", path=" + this.path + ", qid=" + this.qid + ", data=" + this.data + ", ended=" + this.ended + ')';
    }

    public ChatResponseResult(String type, String path, String qid, ChatResponseAnswer chatResponseAnswer, int i8) {
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(path, "path");
        s.checkNotNullParameter(qid, "qid");
        this.type = type;
        this.path = path;
        this.qid = qid;
        this.data = chatResponseAnswer;
        this.ended = i8;
    }

    public /* synthetic */ ChatResponseResult(String str, String str2, String str3, ChatResponseAnswer chatResponseAnswer, int i8, int i9, o oVar) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) == 0 ? str3 : "", (i9 & 8) != 0 ? new ChatResponseAnswer(null, null, 0, 7, null) : chatResponseAnswer, (i9 & 16) != 0 ? 0 : i8);
    }
}
