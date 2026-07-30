package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Msg implements Parcelable {
    public static final Parcelable.Creator<Msg> CREATOR = new a();
    public String content;
    public String role;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Msg createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new Msg(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Msg[] newArray(int i8) {
            return new Msg[i8];
        }
    }

    public Msg(String role, String content) {
        s.checkNotNullParameter(role, "role");
        s.checkNotNullParameter(content, "content");
        this.role = role;
        this.content = content;
    }

    public static /* synthetic */ Msg copy$default(Msg msg, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = msg.role;
        }
        if ((i8 & 2) != 0) {
            str2 = msg.content;
        }
        return msg.copy(str, str2);
    }

    public final String component1() {
        return this.role;
    }

    public final String component2() {
        return this.content;
    }

    public final Msg copy(String role, String content) {
        s.checkNotNullParameter(role, "role");
        s.checkNotNullParameter(content, "content");
        return new Msg(role, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Msg)) {
            return false;
        }
        Msg msg = (Msg) obj;
        return s.areEqual(this.role, msg.role) && s.areEqual(this.content, msg.content);
    }

    public int hashCode() {
        return (this.role.hashCode() * 31) + this.content.hashCode();
    }

    public String toString() {
        return "Msg(role=" + this.role + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.role);
        out.writeString(this.content);
    }
}
