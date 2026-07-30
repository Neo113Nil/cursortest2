package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class SmartRecognizeAsrResult implements Parcelable {
    public static final Parcelable.Creator<SmartRecognizeAsrResult> CREATOR = new a();
    private final int index;
    private final String language;
    private final String status;
    private final String text;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final SmartRecognizeAsrResult createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new SmartRecognizeAsrResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SmartRecognizeAsrResult[] newArray(int i8) {
            return new SmartRecognizeAsrResult[i8];
        }
    }

    public SmartRecognizeAsrResult(String text, String status, String language, int i8) {
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(status, "status");
        s.checkNotNullParameter(language, "language");
        this.text = text;
        this.status = status;
        this.language = language;
        this.index = i8;
    }

    public static /* synthetic */ SmartRecognizeAsrResult copy$default(SmartRecognizeAsrResult smartRecognizeAsrResult, String str, String str2, String str3, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = smartRecognizeAsrResult.text;
        }
        if ((i9 & 2) != 0) {
            str2 = smartRecognizeAsrResult.status;
        }
        if ((i9 & 4) != 0) {
            str3 = smartRecognizeAsrResult.language;
        }
        if ((i9 & 8) != 0) {
            i8 = smartRecognizeAsrResult.index;
        }
        return smartRecognizeAsrResult.copy(str, str2, str3, i8);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.status;
    }

    public final String component3() {
        return this.language;
    }

    public final int component4() {
        return this.index;
    }

    public final SmartRecognizeAsrResult copy(String text, String status, String language, int i8) {
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(status, "status");
        s.checkNotNullParameter(language, "language");
        return new SmartRecognizeAsrResult(text, status, language, i8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartRecognizeAsrResult)) {
            return false;
        }
        SmartRecognizeAsrResult smartRecognizeAsrResult = (SmartRecognizeAsrResult) obj;
        return s.areEqual(this.text, smartRecognizeAsrResult.text) && s.areEqual(this.status, smartRecognizeAsrResult.status) && s.areEqual(this.language, smartRecognizeAsrResult.language) && this.index == smartRecognizeAsrResult.index;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.status.hashCode()) * 31) + this.language.hashCode()) * 31) + this.index;
    }

    public String toString() {
        return "SmartRecognizeAsrResult(text=" + this.text + ", status=" + this.status + ", language=" + this.language + ", index=" + this.index + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.text);
        out.writeString(this.status);
        out.writeString(this.language);
        out.writeInt(this.index);
    }
}
