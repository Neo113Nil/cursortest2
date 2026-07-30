package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class NetChatBodyTokenResult implements Parcelable {
    public static final Parcelable.Creator<NetChatBodyTokenResult> CREATOR = new a();
    private final String access_token;
    private final Long expires_in;
    private final Long expires_on;
    private final Long ext_expires_in;
    private final Long not_before;
    private final String resource;
    private final String token_type;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final NetChatBodyTokenResult createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new NetChatBodyTokenResult(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NetChatBodyTokenResult[] newArray(int i8) {
            return new NetChatBodyTokenResult[i8];
        }
    }

    public NetChatBodyTokenResult() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ NetChatBodyTokenResult copy$default(NetChatBodyTokenResult netChatBodyTokenResult, String str, Long l8, Long l9, Long l10, Long l11, String str2, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = netChatBodyTokenResult.token_type;
        }
        if ((i8 & 2) != 0) {
            l8 = netChatBodyTokenResult.expires_in;
        }
        Long l12 = l8;
        if ((i8 & 4) != 0) {
            l9 = netChatBodyTokenResult.ext_expires_in;
        }
        Long l13 = l9;
        if ((i8 & 8) != 0) {
            l10 = netChatBodyTokenResult.expires_on;
        }
        Long l14 = l10;
        if ((i8 & 16) != 0) {
            l11 = netChatBodyTokenResult.not_before;
        }
        Long l15 = l11;
        if ((i8 & 32) != 0) {
            str2 = netChatBodyTokenResult.resource;
        }
        String str4 = str2;
        if ((i8 & 64) != 0) {
            str3 = netChatBodyTokenResult.access_token;
        }
        return netChatBodyTokenResult.copy(str, l12, l13, l14, l15, str4, str3);
    }

    public final String component1() {
        return this.token_type;
    }

    public final Long component2() {
        return this.expires_in;
    }

    public final Long component3() {
        return this.ext_expires_in;
    }

    public final Long component4() {
        return this.expires_on;
    }

    public final Long component5() {
        return this.not_before;
    }

    public final String component6() {
        return this.resource;
    }

    public final String component7() {
        return this.access_token;
    }

    public final NetChatBodyTokenResult copy(String str, Long l8, Long l9, Long l10, Long l11, String str2, String str3) {
        return new NetChatBodyTokenResult(str, l8, l9, l10, l11, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetChatBodyTokenResult)) {
            return false;
        }
        NetChatBodyTokenResult netChatBodyTokenResult = (NetChatBodyTokenResult) obj;
        return s.areEqual(this.token_type, netChatBodyTokenResult.token_type) && s.areEqual(this.expires_in, netChatBodyTokenResult.expires_in) && s.areEqual(this.ext_expires_in, netChatBodyTokenResult.ext_expires_in) && s.areEqual(this.expires_on, netChatBodyTokenResult.expires_on) && s.areEqual(this.not_before, netChatBodyTokenResult.not_before) && s.areEqual(this.resource, netChatBodyTokenResult.resource) && s.areEqual(this.access_token, netChatBodyTokenResult.access_token);
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final Long getExpires_in() {
        return this.expires_in;
    }

    public final Long getExpires_on() {
        return this.expires_on;
    }

    public final Long getExt_expires_in() {
        return this.ext_expires_in;
    }

    public final Long getNot_before() {
        return this.not_before;
    }

    public final String getResource() {
        return this.resource;
    }

    public final String getToken_type() {
        return this.token_type;
    }

    public int hashCode() {
        String str = this.token_type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l8 = this.expires_in;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l9 = this.ext_expires_in;
        int hashCode3 = (hashCode2 + (l9 == null ? 0 : l9.hashCode())) * 31;
        Long l10 = this.expires_on;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.not_before;
        int hashCode5 = (hashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.resource;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.access_token;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "NetChatBodyTokenResult(token_type=" + this.token_type + ", expires_in=" + this.expires_in + ", ext_expires_in=" + this.ext_expires_in + ", expires_on=" + this.expires_on + ", not_before=" + this.not_before + ", resource=" + this.resource + ", access_token=" + this.access_token + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.token_type);
        Long l8 = this.expires_in;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        Long l9 = this.ext_expires_in;
        if (l9 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l9.longValue());
        }
        Long l10 = this.expires_on;
        if (l10 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l10.longValue());
        }
        Long l11 = this.not_before;
        if (l11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l11.longValue());
        }
        out.writeString(this.resource);
        out.writeString(this.access_token);
    }

    public NetChatBodyTokenResult(String str, Long l8, Long l9, Long l10, Long l11, String str2, String str3) {
        this.token_type = str;
        this.expires_in = l8;
        this.ext_expires_in = l9;
        this.expires_on = l10;
        this.not_before = l11;
        this.resource = str2;
        this.access_token = str3;
    }

    public /* synthetic */ NetChatBodyTokenResult(String str, Long l8, Long l9, Long l10, Long l11, String str2, String str3, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : l8, (i8 & 4) != 0 ? null : l9, (i8 & 8) != 0 ? null : l10, (i8 & 16) != 0 ? null : l11, (i8 & 32) != 0 ? null : str2, (i8 & 64) != 0 ? null : str3);
    }
}
