package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class NetChatBodyCreatThreadResult implements Parcelable {
    public static final Parcelable.Creator<NetChatBodyCreatThreadResult> CREATOR = new a();
    private final String id;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final NetChatBodyCreatThreadResult createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new NetChatBodyCreatThreadResult(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NetChatBodyCreatThreadResult[] newArray(int i8) {
            return new NetChatBodyCreatThreadResult[i8];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetChatBodyCreatThreadResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NetChatBodyCreatThreadResult copy$default(NetChatBodyCreatThreadResult netChatBodyCreatThreadResult, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = netChatBodyCreatThreadResult.id;
        }
        return netChatBodyCreatThreadResult.copy(str);
    }

    public final String component1() {
        return this.id;
    }

    public final NetChatBodyCreatThreadResult copy(String str) {
        return new NetChatBodyCreatThreadResult(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetChatBodyCreatThreadResult) && s.areEqual(this.id, ((NetChatBodyCreatThreadResult) obj).id);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "NetChatBodyCreatThreadResult(id=" + this.id + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeString(this.id);
    }

    public NetChatBodyCreatThreadResult(String str) {
        this.id = str;
    }

    public /* synthetic */ NetChatBodyCreatThreadResult(String str, int i8, o oVar) {
        this((i8 & 1) != 0 ? null : str);
    }
}
