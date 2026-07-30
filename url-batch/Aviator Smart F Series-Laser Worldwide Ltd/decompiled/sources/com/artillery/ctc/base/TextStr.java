package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class TextStr implements Parcelable {
    public static final Parcelable.Creator<TextStr> CREATOR = new a();
    private final String value;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final TextStr createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new TextStr(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextStr[] newArray(int i8) {
            return new TextStr[i8];
        }
    }

    public TextStr(String value) {
        s.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public static /* synthetic */ TextStr copy$default(TextStr textStr, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = textStr.value;
        }
        return textStr.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final TextStr copy(String value) {
        s.checkNotNullParameter(value, "value");
        return new TextStr(value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextStr) && s.areEqual(this.value, ((TextStr) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "TextStr(value=" + this.value + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.value);
    }
}
