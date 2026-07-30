package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Text2AudioSilkyData {
    private final String audio;
    private final String ced;
    private final int status;

    public Text2AudioSilkyData(int i8, String audio, String ced) {
        s.checkNotNullParameter(audio, "audio");
        s.checkNotNullParameter(ced, "ced");
        this.status = i8;
        this.audio = audio;
        this.ced = ced;
    }

    public static /* synthetic */ Text2AudioSilkyData copy$default(Text2AudioSilkyData text2AudioSilkyData, int i8, String str, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = text2AudioSilkyData.status;
        }
        if ((i9 & 2) != 0) {
            str = text2AudioSilkyData.audio;
        }
        if ((i9 & 4) != 0) {
            str2 = text2AudioSilkyData.ced;
        }
        return text2AudioSilkyData.copy(i8, str, str2);
    }

    public final int component1() {
        return this.status;
    }

    public final String component2() {
        return this.audio;
    }

    public final String component3() {
        return this.ced;
    }

    public final Text2AudioSilkyData copy(int i8, String audio, String ced) {
        s.checkNotNullParameter(audio, "audio");
        s.checkNotNullParameter(ced, "ced");
        return new Text2AudioSilkyData(i8, audio, ced);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2AudioSilkyData)) {
            return false;
        }
        Text2AudioSilkyData text2AudioSilkyData = (Text2AudioSilkyData) obj;
        return this.status == text2AudioSilkyData.status && s.areEqual(this.audio, text2AudioSilkyData.audio) && s.areEqual(this.ced, text2AudioSilkyData.ced);
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getCed() {
        return this.ced;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.status * 31) + this.audio.hashCode()) * 31) + this.ced.hashCode();
    }

    public String toString() {
        return "Text2AudioSilkyData(status=" + this.status + ", audio=" + this.audio + ", ced=" + this.ced + ')';
    }
}
