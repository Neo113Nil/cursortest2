package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Text2MusicBody implements Parcelable {
    public static final Parcelable.Creator<Text2MusicBody> CREATOR = new a();
    public String prompt;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Text2MusicBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new Text2MusicBody(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Text2MusicBody[] newArray(int i8) {
            return new Text2MusicBody[i8];
        }
    }

    public Text2MusicBody(String prompt) {
        s.checkNotNullParameter(prompt, "prompt");
        this.prompt = prompt;
    }

    public static /* synthetic */ Text2MusicBody copy$default(Text2MusicBody text2MusicBody, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = text2MusicBody.prompt;
        }
        return text2MusicBody.copy(str);
    }

    public final String component1() {
        return this.prompt;
    }

    public final Text2MusicBody copy(String prompt) {
        s.checkNotNullParameter(prompt, "prompt");
        return new Text2MusicBody(prompt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Text2MusicBody) && s.areEqual(this.prompt, ((Text2MusicBody) obj).prompt);
    }

    public int hashCode() {
        return this.prompt.hashCode();
    }

    public String toString() {
        return "Text2MusicBody(prompt=" + this.prompt + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.prompt);
    }
}
