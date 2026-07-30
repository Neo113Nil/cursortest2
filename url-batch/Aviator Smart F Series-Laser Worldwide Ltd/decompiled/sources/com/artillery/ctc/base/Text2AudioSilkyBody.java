package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Text2AudioSilkyBody implements Parcelable {
    public static final Parcelable.Creator<Text2AudioSilkyBody> CREATOR = new a();
    public Text2AudioSilkyConfig config;
    public String text;
    public final String tid;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Text2AudioSilkyBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new Text2AudioSilkyBody(parcel.readString(), parcel.readInt() == 0 ? null : Text2AudioSilkyConfig.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Text2AudioSilkyBody[] newArray(int i8) {
            return new Text2AudioSilkyBody[i8];
        }
    }

    public Text2AudioSilkyBody() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Text2AudioSilkyBody copy$default(Text2AudioSilkyBody text2AudioSilkyBody, String str, Text2AudioSilkyConfig text2AudioSilkyConfig, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = text2AudioSilkyBody.text;
        }
        if ((i8 & 2) != 0) {
            text2AudioSilkyConfig = text2AudioSilkyBody.config;
        }
        if ((i8 & 4) != 0) {
            str2 = text2AudioSilkyBody.tid;
        }
        return text2AudioSilkyBody.copy(str, text2AudioSilkyConfig, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final Text2AudioSilkyConfig component2() {
        return this.config;
    }

    public final String component3() {
        return this.tid;
    }

    public final Text2AudioSilkyBody copy(String text, Text2AudioSilkyConfig text2AudioSilkyConfig, String tid) {
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(tid, "tid");
        return new Text2AudioSilkyBody(text, text2AudioSilkyConfig, tid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2AudioSilkyBody)) {
            return false;
        }
        Text2AudioSilkyBody text2AudioSilkyBody = (Text2AudioSilkyBody) obj;
        return s.areEqual(this.text, text2AudioSilkyBody.text) && s.areEqual(this.config, text2AudioSilkyBody.config) && s.areEqual(this.tid, text2AudioSilkyBody.tid);
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Text2AudioSilkyConfig text2AudioSilkyConfig = this.config;
        return ((hashCode + (text2AudioSilkyConfig == null ? 0 : text2AudioSilkyConfig.hashCode())) * 31) + this.tid.hashCode();
    }

    public String toString() {
        return "Text2AudioSilkyBody(text=" + this.text + ", config=" + this.config + ", tid=" + this.tid + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.text);
        Text2AudioSilkyConfig text2AudioSilkyConfig = this.config;
        if (text2AudioSilkyConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            text2AudioSilkyConfig.writeToParcel(out, i8);
        }
        out.writeString(this.tid);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyBody(String text) {
        this(text, null, null, 6, null);
        s.checkNotNullParameter(text, "text");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Text2AudioSilkyBody(String text, Text2AudioSilkyConfig text2AudioSilkyConfig) {
        this(text, text2AudioSilkyConfig, null, 4, null);
        s.checkNotNullParameter(text, "text");
    }

    public Text2AudioSilkyBody(String text, Text2AudioSilkyConfig text2AudioSilkyConfig, String tid) {
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(tid, "tid");
        this.text = text;
        this.config = text2AudioSilkyConfig;
        this.tid = tid;
    }

    public /* synthetic */ Text2AudioSilkyBody(String str, Text2AudioSilkyConfig text2AudioSilkyConfig, String str2, int i8, o oVar) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? null : text2AudioSilkyConfig, (i8 & 4) != 0 ? "" : str2);
    }
}
