package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.artillery.ctc.base.ChatRequestBody;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class NetChatBody implements Parcelable {
    public static final Parcelable.Creator<NetChatBody> CREATOR = new a();
    public final ChatRequestBody.Oversea param;
    public final String requestId;
    public final int type;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final NetChatBody createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new NetChatBody(parcel.readString(), parcel.readInt(), ChatRequestBody.Oversea.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NetChatBody[] newArray(int i8) {
            return new NetChatBody[i8];
        }
    }

    public NetChatBody(String str, int i8, ChatRequestBody.Oversea param) {
        s.checkNotNullParameter(param, "param");
        this.requestId = str;
        this.type = i8;
        this.param = param;
    }

    public static /* synthetic */ NetChatBody copy$default(NetChatBody netChatBody, String str, int i8, ChatRequestBody.Oversea oversea, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = netChatBody.requestId;
        }
        if ((i9 & 2) != 0) {
            i8 = netChatBody.type;
        }
        if ((i9 & 4) != 0) {
            oversea = netChatBody.param;
        }
        return netChatBody.copy(str, i8, oversea);
    }

    public final String component1() {
        return this.requestId;
    }

    public final int component2() {
        return this.type;
    }

    public final ChatRequestBody.Oversea component3() {
        return this.param;
    }

    public final NetChatBody copy(String str, int i8, ChatRequestBody.Oversea param) {
        s.checkNotNullParameter(param, "param");
        return new NetChatBody(str, i8, param);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetChatBody)) {
            return false;
        }
        NetChatBody netChatBody = (NetChatBody) obj;
        return s.areEqual(this.requestId, netChatBody.requestId) && this.type == netChatBody.type && s.areEqual(this.param, netChatBody.param);
    }

    public int hashCode() {
        String str = this.requestId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.type) * 31) + this.param.hashCode();
    }

    public String toString() {
        return "NetChatBody(requestId=" + this.requestId + ", type=" + this.type + ", param=" + this.param + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.requestId);
        out.writeInt(this.type);
        this.param.writeToParcel(out, i8);
    }

    public /* synthetic */ NetChatBody(String str, int i8, ChatRequestBody.Oversea oversea, int i9, o oVar) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? 1 : i8, oversea);
    }
}
