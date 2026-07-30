package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class DirectChatBody implements Parcelable {
    public static final Parcelable.Creator<DirectChatBody> CREATOR = new a();
    private final String body;
    private final DirectChatHeader header;
    private final String url;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final DirectChatBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new DirectChatBody(parcel.readString(), parcel.readInt() == 0 ? null : DirectChatHeader.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DirectChatBody[] newArray(int i8) {
            return new DirectChatBody[i8];
        }
    }

    public DirectChatBody() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DirectChatBody copy$default(DirectChatBody directChatBody, String str, DirectChatHeader directChatHeader, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = directChatBody.body;
        }
        if ((i8 & 2) != 0) {
            directChatHeader = directChatBody.header;
        }
        if ((i8 & 4) != 0) {
            str2 = directChatBody.url;
        }
        return directChatBody.copy(str, directChatHeader, str2);
    }

    public final String component1() {
        return this.body;
    }

    public final DirectChatHeader component2() {
        return this.header;
    }

    public final String component3() {
        return this.url;
    }

    public final DirectChatBody copy(String str, DirectChatHeader directChatHeader, String str2) {
        return new DirectChatBody(str, directChatHeader, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectChatBody)) {
            return false;
        }
        DirectChatBody directChatBody = (DirectChatBody) obj;
        return s.areEqual(this.body, directChatBody.body) && s.areEqual(this.header, directChatBody.header) && s.areEqual(this.url, directChatBody.url);
    }

    public final String getBody() {
        return this.body;
    }

    public final DirectChatHeader getHeader() {
        return this.header;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.body;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DirectChatHeader directChatHeader = this.header;
        int hashCode2 = (hashCode + (directChatHeader == null ? 0 : directChatHeader.hashCode())) * 31;
        String str2 = this.url;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DirectChatBody(body=" + this.body + ", header=" + this.header + ", url=" + this.url + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.body);
        DirectChatHeader directChatHeader = this.header;
        if (directChatHeader == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            directChatHeader.writeToParcel(out, i8);
        }
        out.writeString(this.url);
    }

    public DirectChatBody(String str, DirectChatHeader directChatHeader, String str2) {
        this.body = str;
        this.header = directChatHeader;
        this.url = str2;
    }

    public /* synthetic */ DirectChatBody(String str, DirectChatHeader directChatHeader, String str2, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : directChatHeader, (i8 & 4) != 0 ? null : str2);
    }
}
