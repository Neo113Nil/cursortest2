package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class AiGcBody implements Parcelable {
    public static final Parcelable.Creator<AiGcBody> CREATOR = new a();
    public AsrSilkyModel asr;
    public ChatPictureRequestBody picture;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final AiGcBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new AiGcBody(ChatPictureRequestBody.CREATOR.createFromParcel(parcel), AsrSilkyModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AiGcBody[] newArray(int i8) {
            return new AiGcBody[i8];
        }
    }

    public AiGcBody(ChatPictureRequestBody picture, AsrSilkyModel asr) {
        s.checkNotNullParameter(picture, "picture");
        s.checkNotNullParameter(asr, "asr");
        this.picture = picture;
        this.asr = asr;
    }

    public static /* synthetic */ AiGcBody copy$default(AiGcBody aiGcBody, ChatPictureRequestBody chatPictureRequestBody, AsrSilkyModel asrSilkyModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            chatPictureRequestBody = aiGcBody.picture;
        }
        if ((i8 & 2) != 0) {
            asrSilkyModel = aiGcBody.asr;
        }
        return aiGcBody.copy(chatPictureRequestBody, asrSilkyModel);
    }

    public final ChatPictureRequestBody component1() {
        return this.picture;
    }

    public final AsrSilkyModel component2() {
        return this.asr;
    }

    public final AiGcBody copy(ChatPictureRequestBody picture, AsrSilkyModel asr) {
        s.checkNotNullParameter(picture, "picture");
        s.checkNotNullParameter(asr, "asr");
        return new AiGcBody(picture, asr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AiGcBody)) {
            return false;
        }
        AiGcBody aiGcBody = (AiGcBody) obj;
        return s.areEqual(this.picture, aiGcBody.picture) && s.areEqual(this.asr, aiGcBody.asr);
    }

    public int hashCode() {
        return (this.picture.hashCode() * 31) + this.asr.hashCode();
    }

    public String toString() {
        return "AiGcBody(picture=" + this.picture + ", asr=" + this.asr + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        this.picture.writeToParcel(out, i8);
        this.asr.writeToParcel(out, i8);
    }
}
