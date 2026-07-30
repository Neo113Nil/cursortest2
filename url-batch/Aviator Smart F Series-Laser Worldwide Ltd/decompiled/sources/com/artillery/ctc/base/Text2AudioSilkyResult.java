package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Text2AudioSilkyResult {
    private final int code;
    private final Text2AudioSilkyData data;
    private final String message;
    private final String sid;
    private final String tid;

    public Text2AudioSilkyResult(int i8, String sid, Text2AudioSilkyData text2AudioSilkyData, String message, String tid) {
        s.checkNotNullParameter(sid, "sid");
        s.checkNotNullParameter(message, "message");
        s.checkNotNullParameter(tid, "tid");
        this.code = i8;
        this.sid = sid;
        this.data = text2AudioSilkyData;
        this.message = message;
        this.tid = tid;
    }

    public static /* synthetic */ Text2AudioSilkyResult copy$default(Text2AudioSilkyResult text2AudioSilkyResult, int i8, String str, Text2AudioSilkyData text2AudioSilkyData, String str2, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = text2AudioSilkyResult.code;
        }
        if ((i9 & 2) != 0) {
            str = text2AudioSilkyResult.sid;
        }
        String str4 = str;
        if ((i9 & 4) != 0) {
            text2AudioSilkyData = text2AudioSilkyResult.data;
        }
        Text2AudioSilkyData text2AudioSilkyData2 = text2AudioSilkyData;
        if ((i9 & 8) != 0) {
            str2 = text2AudioSilkyResult.message;
        }
        String str5 = str2;
        if ((i9 & 16) != 0) {
            str3 = text2AudioSilkyResult.tid;
        }
        return text2AudioSilkyResult.copy(i8, str4, text2AudioSilkyData2, str5, str3);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.sid;
    }

    public final Text2AudioSilkyData component3() {
        return this.data;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.tid;
    }

    public final Text2AudioSilkyResult copy(int i8, String sid, Text2AudioSilkyData text2AudioSilkyData, String message, String tid) {
        s.checkNotNullParameter(sid, "sid");
        s.checkNotNullParameter(message, "message");
        s.checkNotNullParameter(tid, "tid");
        return new Text2AudioSilkyResult(i8, sid, text2AudioSilkyData, message, tid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2AudioSilkyResult)) {
            return false;
        }
        Text2AudioSilkyResult text2AudioSilkyResult = (Text2AudioSilkyResult) obj;
        return this.code == text2AudioSilkyResult.code && s.areEqual(this.sid, text2AudioSilkyResult.sid) && s.areEqual(this.data, text2AudioSilkyResult.data) && s.areEqual(this.message, text2AudioSilkyResult.message) && s.areEqual(this.tid, text2AudioSilkyResult.tid);
    }

    public final int getCode() {
        return this.code;
    }

    public final Text2AudioSilkyData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getTid() {
        return this.tid;
    }

    public int hashCode() {
        int hashCode = ((this.code * 31) + this.sid.hashCode()) * 31;
        Text2AudioSilkyData text2AudioSilkyData = this.data;
        return ((((hashCode + (text2AudioSilkyData == null ? 0 : text2AudioSilkyData.hashCode())) * 31) + this.message.hashCode()) * 31) + this.tid.hashCode();
    }

    public String toString() {
        return "Text2AudioSilkyResult(code=" + this.code + ", sid=" + this.sid + ", data=" + this.data + ", message=" + this.message + ", tid=" + this.tid + ')';
    }
}
