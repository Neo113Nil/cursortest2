package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class GPTInternalBody implements Parcelable {
    public static final Parcelable.Creator<GPTInternalBody> CREATOR = new a();
    public AsrSilkyModel asr;
    public ChatRequestBody gptBody;
    public Text2AudioSilkyBody tts;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final GPTInternalBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new GPTInternalBody(ChatRequestBody.CREATOR.createFromParcel(parcel), AsrSilkyModel.CREATOR.createFromParcel(parcel), Text2AudioSilkyBody.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GPTInternalBody[] newArray(int i8) {
            return new GPTInternalBody[i8];
        }
    }

    public GPTInternalBody(ChatRequestBody gptBody, AsrSilkyModel asr, Text2AudioSilkyBody tts) {
        s.checkNotNullParameter(gptBody, "gptBody");
        s.checkNotNullParameter(asr, "asr");
        s.checkNotNullParameter(tts, "tts");
        this.gptBody = gptBody;
        this.asr = asr;
        this.tts = tts;
    }

    public static /* synthetic */ GPTInternalBody copy$default(GPTInternalBody gPTInternalBody, ChatRequestBody chatRequestBody, AsrSilkyModel asrSilkyModel, Text2AudioSilkyBody text2AudioSilkyBody, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            chatRequestBody = gPTInternalBody.gptBody;
        }
        if ((i8 & 2) != 0) {
            asrSilkyModel = gPTInternalBody.asr;
        }
        if ((i8 & 4) != 0) {
            text2AudioSilkyBody = gPTInternalBody.tts;
        }
        return gPTInternalBody.copy(chatRequestBody, asrSilkyModel, text2AudioSilkyBody);
    }

    public final ChatRequestBody component1() {
        return this.gptBody;
    }

    public final AsrSilkyModel component2() {
        return this.asr;
    }

    public final Text2AudioSilkyBody component3() {
        return this.tts;
    }

    public final GPTInternalBody copy(ChatRequestBody gptBody, AsrSilkyModel asr, Text2AudioSilkyBody tts) {
        s.checkNotNullParameter(gptBody, "gptBody");
        s.checkNotNullParameter(asr, "asr");
        s.checkNotNullParameter(tts, "tts");
        return new GPTInternalBody(gptBody, asr, tts);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GPTInternalBody)) {
            return false;
        }
        GPTInternalBody gPTInternalBody = (GPTInternalBody) obj;
        return s.areEqual(this.gptBody, gPTInternalBody.gptBody) && s.areEqual(this.asr, gPTInternalBody.asr) && s.areEqual(this.tts, gPTInternalBody.tts);
    }

    public int hashCode() {
        return (((this.gptBody.hashCode() * 31) + this.asr.hashCode()) * 31) + this.tts.hashCode();
    }

    public String toString() {
        return "GPTInternalBody(gptBody=" + this.gptBody + ", asr=" + this.asr + ", tts=" + this.tts + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        this.gptBody.writeToParcel(out, i8);
        this.asr.writeToParcel(out, i8);
        this.tts.writeToParcel(out, i8);
    }
}
