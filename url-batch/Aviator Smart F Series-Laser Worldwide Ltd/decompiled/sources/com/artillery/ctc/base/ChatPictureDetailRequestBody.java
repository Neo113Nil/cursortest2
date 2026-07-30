package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class ChatPictureDetailRequestBody implements Parcelable {
    public static final Parcelable.Creator<ChatPictureDetailRequestBody> CREATOR = new a();
    public String jobId;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final ChatPictureDetailRequestBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new ChatPictureDetailRequestBody(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChatPictureDetailRequestBody[] newArray(int i8) {
            return new ChatPictureDetailRequestBody[i8];
        }
    }

    public ChatPictureDetailRequestBody(String jobId) {
        s.checkNotNullParameter(jobId, "jobId");
        this.jobId = jobId;
    }

    public static /* synthetic */ ChatPictureDetailRequestBody copy$default(ChatPictureDetailRequestBody chatPictureDetailRequestBody, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = chatPictureDetailRequestBody.jobId;
        }
        return chatPictureDetailRequestBody.copy(str);
    }

    public final String component1() {
        return this.jobId;
    }

    public final ChatPictureDetailRequestBody copy(String jobId) {
        s.checkNotNullParameter(jobId, "jobId");
        return new ChatPictureDetailRequestBody(jobId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChatPictureDetailRequestBody) && s.areEqual(this.jobId, ((ChatPictureDetailRequestBody) obj).jobId);
    }

    public int hashCode() {
        return this.jobId.hashCode();
    }

    public String toString() {
        return "ChatPictureDetailRequestBody(jobId=" + this.jobId + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.jobId);
    }
}
