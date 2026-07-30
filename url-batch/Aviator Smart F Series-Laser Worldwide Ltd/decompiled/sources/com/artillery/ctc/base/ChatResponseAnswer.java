package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class ChatResponseAnswer {
    private final String answer;
    private final int index;
    private final String part;

    public ChatResponseAnswer() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ ChatResponseAnswer copy$default(ChatResponseAnswer chatResponseAnswer, String str, String str2, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = chatResponseAnswer.answer;
        }
        if ((i9 & 2) != 0) {
            str2 = chatResponseAnswer.part;
        }
        if ((i9 & 4) != 0) {
            i8 = chatResponseAnswer.index;
        }
        return chatResponseAnswer.copy(str, str2, i8);
    }

    public final String component1() {
        return this.answer;
    }

    public final String component2() {
        return this.part;
    }

    public final int component3() {
        return this.index;
    }

    public final ChatResponseAnswer copy(String str, String part, int i8) {
        s.checkNotNullParameter(part, "part");
        return new ChatResponseAnswer(str, part, i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatResponseAnswer)) {
            return false;
        }
        ChatResponseAnswer chatResponseAnswer = (ChatResponseAnswer) obj;
        return s.areEqual(this.answer, chatResponseAnswer.answer) && s.areEqual(this.part, chatResponseAnswer.part) && this.index == chatResponseAnswer.index;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPart() {
        return this.part;
    }

    public int hashCode() {
        String str = this.answer;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.part.hashCode()) * 31) + this.index;
    }

    public String toString() {
        return "ChatResponseAnswer(answer=" + this.answer + ", part=" + this.part + ", index=" + this.index + ')';
    }

    public ChatResponseAnswer(String str, String part, int i8) {
        s.checkNotNullParameter(part, "part");
        this.answer = str;
        this.part = part;
        this.index = i8;
    }

    public /* synthetic */ ChatResponseAnswer(String str, String str2, int i8, int i9, o oVar) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? 0 : i8);
    }
}
