package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class DirectChatHeader implements Parcelable {
    public static final Parcelable.Creator<DirectChatHeader> CREATOR = new a();

    /* renamed from: api-key, reason: not valid java name */
    private final String f0apikey;

    /* renamed from: content-type, reason: not valid java name */
    private final String f1contenttype;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final DirectChatHeader createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new DirectChatHeader(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DirectChatHeader[] newArray(int i8) {
            return new DirectChatHeader[i8];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DirectChatHeader() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DirectChatHeader copy$default(DirectChatHeader directChatHeader, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = directChatHeader.f0apikey;
        }
        if ((i8 & 2) != 0) {
            str2 = directChatHeader.f1contenttype;
        }
        return directChatHeader.copy(str, str2);
    }

    public final String component1() {
        return this.f0apikey;
    }

    public final String component2() {
        return this.f1contenttype;
    }

    public final DirectChatHeader copy(String str, String str2) {
        return new DirectChatHeader(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectChatHeader)) {
            return false;
        }
        DirectChatHeader directChatHeader = (DirectChatHeader) obj;
        return s.areEqual(this.f0apikey, directChatHeader.f0apikey) && s.areEqual(this.f1contenttype, directChatHeader.f1contenttype);
    }

    /* renamed from: getApi-key, reason: not valid java name */
    public final String m88getApikey() {
        return this.f0apikey;
    }

    /* renamed from: getContent-type, reason: not valid java name */
    public final String m89getContenttype() {
        return this.f1contenttype;
    }

    public int hashCode() {
        String str = this.f0apikey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1contenttype;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DirectChatHeader(api-key=" + this.f0apikey + ", content-type=" + this.f1contenttype + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.f0apikey);
        out.writeString(this.f1contenttype);
    }

    public DirectChatHeader(String str, String str2) {
        this.f0apikey = str;
        this.f1contenttype = str2;
    }

    public /* synthetic */ DirectChatHeader(String str, String str2, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2);
    }
}
