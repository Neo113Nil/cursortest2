package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Content implements Parcelable {
    public static final Parcelable.Creator<Content> CREATOR = new a();
    private final int index;
    private final TextStr text;
    private final String type;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Content createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new Content(parcel.readInt(), TextStr.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Content[] newArray(int i8) {
            return new Content[i8];
        }
    }

    public Content(int i8, TextStr text, String type) {
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(type, "type");
        this.index = i8;
        this.text = text;
        this.type = type;
    }

    public static /* synthetic */ Content copy$default(Content content, int i8, TextStr textStr, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = content.index;
        }
        if ((i9 & 2) != 0) {
            textStr = content.text;
        }
        if ((i9 & 4) != 0) {
            str = content.type;
        }
        return content.copy(i8, textStr, str);
    }

    public final int component1() {
        return this.index;
    }

    public final TextStr component2() {
        return this.text;
    }

    public final String component3() {
        return this.type;
    }

    public final Content copy(int i8, TextStr text, String type) {
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(type, "type");
        return new Content(i8, text, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Content)) {
            return false;
        }
        Content content = (Content) obj;
        return this.index == content.index && s.areEqual(this.text, content.text) && s.areEqual(this.type, content.type);
    }

    public final int getIndex() {
        return this.index;
    }

    public final TextStr getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.index * 31) + this.text.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "Content(index=" + this.index + ", text=" + this.text + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeInt(this.index);
        this.text.writeToParcel(out, i8);
        out.writeString(this.type);
    }
}
