package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class NetChatBodyAddMessageResult implements Parcelable {
    public static final Parcelable.Creator<NetChatBodyAddMessageResult> CREATOR = new a();
    private final String id;
    private final String thread_id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final NetChatBodyAddMessageResult createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new NetChatBodyAddMessageResult(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NetChatBodyAddMessageResult[] newArray(int i8) {
            return new NetChatBodyAddMessageResult[i8];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetChatBodyAddMessageResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NetChatBodyAddMessageResult copy$default(NetChatBodyAddMessageResult netChatBodyAddMessageResult, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = netChatBodyAddMessageResult.id;
        }
        if ((i8 & 2) != 0) {
            str2 = netChatBodyAddMessageResult.thread_id;
        }
        return netChatBodyAddMessageResult.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.thread_id;
    }

    public final NetChatBodyAddMessageResult copy(String str, String str2) {
        return new NetChatBodyAddMessageResult(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetChatBodyAddMessageResult)) {
            return false;
        }
        NetChatBodyAddMessageResult netChatBodyAddMessageResult = (NetChatBodyAddMessageResult) obj;
        return s.areEqual(this.id, netChatBodyAddMessageResult.id) && s.areEqual(this.thread_id, netChatBodyAddMessageResult.thread_id);
    }

    public final String getId() {
        return this.id;
    }

    public final String getThread_id() {
        return this.thread_id;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.thread_id;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "NetChatBodyAddMessageResult(id=" + this.id + ", thread_id=" + this.thread_id + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.id);
        out.writeString(this.thread_id);
    }

    public NetChatBodyAddMessageResult(String str, String str2) {
        this.id = str;
        this.thread_id = str2;
    }

    public /* synthetic */ NetChatBodyAddMessageResult(String str, String str2, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2);
    }
}
