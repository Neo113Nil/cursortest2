package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class WrapResult implements Parcelable {
    public static final Parcelable.Creator<WrapResult> CREATOR = new a();
    public final int code;
    public final String data;
    public final String message;
    public final Boolean success;
    public final long timestamp;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final WrapResult createFromParcel(Parcel parcel) {
            Boolean valueOf;
            s.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WrapResult(readInt, valueOf, parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final WrapResult[] newArray(int i8) {
            return new WrapResult[i8];
        }
    }

    public WrapResult(int i8, Boolean bool, String str, String str2, long j8) {
        this.code = i8;
        this.success = bool;
        this.data = str;
        this.message = str2;
        this.timestamp = j8;
    }

    public static /* synthetic */ WrapResult copy$default(WrapResult wrapResult, int i8, Boolean bool, String str, String str2, long j8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = wrapResult.code;
        }
        if ((i9 & 2) != 0) {
            bool = wrapResult.success;
        }
        Boolean bool2 = bool;
        if ((i9 & 4) != 0) {
            str = wrapResult.data;
        }
        String str3 = str;
        if ((i9 & 8) != 0) {
            str2 = wrapResult.message;
        }
        String str4 = str2;
        if ((i9 & 16) != 0) {
            j8 = wrapResult.timestamp;
        }
        return wrapResult.copy(i8, bool2, str3, str4, j8);
    }

    public final int component1() {
        return this.code;
    }

    public final Boolean component2() {
        return this.success;
    }

    public final String component3() {
        return this.data;
    }

    public final String component4() {
        return this.message;
    }

    public final long component5() {
        return this.timestamp;
    }

    public final WrapResult copy(int i8, Boolean bool, String str, String str2, long j8) {
        return new WrapResult(i8, bool, str, str2, j8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrapResult)) {
            return false;
        }
        WrapResult wrapResult = (WrapResult) obj;
        return this.code == wrapResult.code && s.areEqual(this.success, wrapResult.success) && s.areEqual(this.data, wrapResult.data) && s.areEqual(this.message, wrapResult.message) && this.timestamp == wrapResult.timestamp;
    }

    public int hashCode() {
        int i8 = this.code * 31;
        Boolean bool = this.success;
        int hashCode = (i8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.data;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + androidx.collection.a.a(this.timestamp);
    }

    public String toString() {
        return "WrapResult(code=" + this.code + ", success=" + this.success + ", data=" + this.data + ", message=" + this.message + ", timestamp=" + this.timestamp + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        int i9;
        s.checkNotNullParameter(out, "out");
        out.writeInt(this.code);
        Boolean bool = this.success;
        if (bool == null) {
            i9 = 0;
        } else {
            out.writeInt(1);
            i9 = bool.booleanValue();
        }
        out.writeInt(i9);
        out.writeString(this.data);
        out.writeString(this.message);
        out.writeLong(this.timestamp);
    }
}
