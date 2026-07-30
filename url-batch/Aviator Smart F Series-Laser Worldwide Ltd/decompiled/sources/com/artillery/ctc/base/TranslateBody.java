package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class TranslateBody implements Parcelable, BaseCat {
    public static final Parcelable.Creator<TranslateBody> CREATOR = new a();
    public String from;
    public String text;
    private final String tid;
    public String to;
    public int type;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final TranslateBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new TranslateBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TranslateBody[] newArray(int i8) {
            return new TranslateBody[i8];
        }
    }

    public TranslateBody(String text, String str, String to, int i8, String tid) {
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(to, "to");
        s.checkNotNullParameter(tid, "tid");
        this.text = text;
        this.from = str;
        this.to = to;
        this.type = i8;
        this.tid = tid;
    }

    public static /* synthetic */ TranslateBody copy$default(TranslateBody translateBody, String str, String str2, String str3, int i8, String str4, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = translateBody.text;
        }
        if ((i9 & 2) != 0) {
            str2 = translateBody.from;
        }
        String str5 = str2;
        if ((i9 & 4) != 0) {
            str3 = translateBody.to;
        }
        String str6 = str3;
        if ((i9 & 8) != 0) {
            i8 = translateBody.type;
        }
        int i10 = i8;
        if ((i9 & 16) != 0) {
            str4 = translateBody.tid;
        }
        return translateBody.copy(str, str5, str6, i10, str4);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.from;
    }

    public final String component3() {
        return this.to;
    }

    public final int component4() {
        return this.type;
    }

    public final String component5() {
        return this.tid;
    }

    public final TranslateBody copy(String text, String str, String to, int i8, String tid) {
        s.checkNotNullParameter(text, "text");
        s.checkNotNullParameter(to, "to");
        s.checkNotNullParameter(tid, "tid");
        return new TranslateBody(text, str, to, i8, tid);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateBody)) {
            return false;
        }
        TranslateBody translateBody = (TranslateBody) obj;
        return s.areEqual(this.text, translateBody.text) && s.areEqual(this.from, translateBody.from) && s.areEqual(this.to, translateBody.to) && this.type == translateBody.type && s.areEqual(this.tid, translateBody.tid);
    }

    @Override // com.artillery.ctc.base.BaseCat
    public int getCatType() {
        return this.type;
    }

    public final String getTid() {
        return this.tid;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.from;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.to.hashCode()) * 31) + this.type) * 31) + this.tid.hashCode();
    }

    public String toString() {
        return "TranslateBody(text=" + this.text + ", from=" + this.from + ", to=" + this.to + ", type=" + this.type + ", tid=" + this.tid + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.text);
        out.writeString(this.from);
        out.writeString(this.to);
        out.writeInt(this.type);
        out.writeString(this.tid);
    }

    public /* synthetic */ TranslateBody(String str, String str2, String str3, int i8, String str4, int i9, o oVar) {
        this(str, str2, str3, (i9 & 8) != 0 ? 2 : i8, (i9 & 16) != 0 ? "" : str4);
    }
}
