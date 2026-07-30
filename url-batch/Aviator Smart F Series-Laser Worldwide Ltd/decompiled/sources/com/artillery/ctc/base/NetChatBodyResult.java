package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class NetChatBodyResult implements Parcelable {
    public static final Parcelable.Creator<NetChatBodyResult> CREATOR = new a();
    private final Integer code;
    private final String data;
    private final String message;
    private final Boolean success;
    private final Long timestamp;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final NetChatBodyResult createFromParcel(Parcel parcel) {
            Boolean valueOf;
            s.checkNotNullParameter(parcel, "parcel");
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NetChatBodyResult(valueOf2, valueOf, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final NetChatBodyResult[] newArray(int i8) {
            return new NetChatBodyResult[i8];
        }
    }

    public NetChatBodyResult() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ NetChatBodyResult copy$default(NetChatBodyResult netChatBodyResult, Integer num, Boolean bool, String str, String str2, Long l8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            num = netChatBodyResult.code;
        }
        if ((i8 & 2) != 0) {
            bool = netChatBodyResult.success;
        }
        Boolean bool2 = bool;
        if ((i8 & 4) != 0) {
            str = netChatBodyResult.data;
        }
        String str3 = str;
        if ((i8 & 8) != 0) {
            str2 = netChatBodyResult.message;
        }
        String str4 = str2;
        if ((i8 & 16) != 0) {
            l8 = netChatBodyResult.timestamp;
        }
        return netChatBodyResult.copy(num, bool2, str3, str4, l8);
    }

    public final Integer component1() {
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

    public final Long component5() {
        return this.timestamp;
    }

    public final NetChatBodyResult copy(Integer num, Boolean bool, String str, String str2, Long l8) {
        return new NetChatBodyResult(num, bool, str, str2, l8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetChatBodyResult)) {
            return false;
        }
        NetChatBodyResult netChatBodyResult = (NetChatBodyResult) obj;
        return s.areEqual(this.code, netChatBodyResult.code) && s.areEqual(this.success, netChatBodyResult.success) && s.areEqual(this.data, netChatBodyResult.data) && s.areEqual(this.message, netChatBodyResult.message) && s.areEqual(this.timestamp, netChatBodyResult.timestamp);
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.success;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.data;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l8 = this.timestamp;
        return hashCode4 + (l8 != null ? l8.hashCode() : 0);
    }

    public String toString() {
        return "NetChatBodyResult(code=" + this.code + ", success=" + this.success + ", data=" + this.data + ", message=" + this.message + ", timestamp=" + this.timestamp + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        Integer num = this.code;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Boolean bool = this.success;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeString(this.data);
        out.writeString(this.message);
        Long l8 = this.timestamp;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
    }

    public NetChatBodyResult(Integer num, Boolean bool, String str, String str2, Long l8) {
        this.code = num;
        this.success = bool;
        this.data = str;
        this.message = str2;
        this.timestamp = l8;
    }

    public /* synthetic */ NetChatBodyResult(Integer num, Boolean bool, String str, String str2, Long l8, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : num, (i8 & 2) != 0 ? null : bool, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : l8);
    }
}
