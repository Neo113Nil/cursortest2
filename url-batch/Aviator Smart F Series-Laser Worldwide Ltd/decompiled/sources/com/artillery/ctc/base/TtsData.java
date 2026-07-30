package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class TtsData {
    private final String logid;
    private final String text;
    private final String tts_optional;

    public TtsData(String logid, String text, String tts_optional) {
        s.checkNotNullParameter(logid, "logid");
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(tts_optional, "tts_optional");
        this.logid = logid;
        this.text = text;
        this.tts_optional = tts_optional;
    }

    public static /* synthetic */ TtsData copy$default(TtsData ttsData, String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = ttsData.logid;
        }
        if ((i8 & 2) != 0) {
            str2 = ttsData.text;
        }
        if ((i8 & 4) != 0) {
            str3 = ttsData.tts_optional;
        }
        return ttsData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.logid;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.tts_optional;
    }

    public final TtsData copy(String logid, String text, String tts_optional) {
        s.checkNotNullParameter(logid, "logid");
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(tts_optional, "tts_optional");
        return new TtsData(logid, text, tts_optional);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsData)) {
            return false;
        }
        TtsData ttsData = (TtsData) obj;
        return s.areEqual(this.logid, ttsData.logid) && s.areEqual(this.text, ttsData.text) && s.areEqual(this.tts_optional, ttsData.tts_optional);
    }

    public final String getLogid() {
        return this.logid;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTts_optional() {
        return this.tts_optional;
    }

    public int hashCode() {
        return (((this.logid.hashCode() * 31) + this.text.hashCode()) * 31) + this.tts_optional.hashCode();
    }

    public String toString() {
        return "TtsData(logid=" + this.logid + ", text=" + this.text + ", tts_optional=" + this.tts_optional + ')';
    }
}
