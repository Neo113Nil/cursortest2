package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class NetChatSearchResultItem implements Parcelable {
    public static final Parcelable.Creator<NetChatSearchResultItem> CREATOR = new a();
    private final Delta delta;
    private final String id;
    private final String object;
    private final String status;
    private final NetChatUsageItem usage;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final NetChatSearchResultItem createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new NetChatSearchResultItem(Delta.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : NetChatUsageItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NetChatSearchResultItem[] newArray(int i8) {
            return new NetChatSearchResultItem[i8];
        }
    }

    public NetChatSearchResultItem(Delta delta, String id, String object, String str, NetChatUsageItem netChatUsageItem) {
        s.checkNotNullParameter(delta, "delta");
        s.checkNotNullParameter(id, "id");
        s.checkNotNullParameter(object, "object");
        this.delta = delta;
        this.id = id;
        this.object = object;
        this.status = str;
        this.usage = netChatUsageItem;
    }

    public static /* synthetic */ NetChatSearchResultItem copy$default(NetChatSearchResultItem netChatSearchResultItem, Delta delta, String str, String str2, String str3, NetChatUsageItem netChatUsageItem, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            delta = netChatSearchResultItem.delta;
        }
        if ((i8 & 2) != 0) {
            str = netChatSearchResultItem.id;
        }
        String str4 = str;
        if ((i8 & 4) != 0) {
            str2 = netChatSearchResultItem.object;
        }
        String str5 = str2;
        if ((i8 & 8) != 0) {
            str3 = netChatSearchResultItem.status;
        }
        String str6 = str3;
        if ((i8 & 16) != 0) {
            netChatUsageItem = netChatSearchResultItem.usage;
        }
        return netChatSearchResultItem.copy(delta, str4, str5, str6, netChatUsageItem);
    }

    public final Delta component1() {
        return this.delta;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.object;
    }

    public final String component4() {
        return this.status;
    }

    public final NetChatUsageItem component5() {
        return this.usage;
    }

    public final NetChatSearchResultItem copy(Delta delta, String id, String object, String str, NetChatUsageItem netChatUsageItem) {
        s.checkNotNullParameter(delta, "delta");
        s.checkNotNullParameter(id, "id");
        s.checkNotNullParameter(object, "object");
        return new NetChatSearchResultItem(delta, id, object, str, netChatUsageItem);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetChatSearchResultItem)) {
            return false;
        }
        NetChatSearchResultItem netChatSearchResultItem = (NetChatSearchResultItem) obj;
        return s.areEqual(this.delta, netChatSearchResultItem.delta) && s.areEqual(this.id, netChatSearchResultItem.id) && s.areEqual(this.object, netChatSearchResultItem.object) && s.areEqual(this.status, netChatSearchResultItem.status) && s.areEqual(this.usage, netChatSearchResultItem.usage);
    }

    public final Delta getDelta() {
        return this.delta;
    }

    public final String getId() {
        return this.id;
    }

    public final String getObject() {
        return this.object;
    }

    public final String getStatus() {
        return this.status;
    }

    public final NetChatUsageItem getUsage() {
        return this.usage;
    }

    public int hashCode() {
        int hashCode = ((((this.delta.hashCode() * 31) + this.id.hashCode()) * 31) + this.object.hashCode()) * 31;
        String str = this.status;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NetChatUsageItem netChatUsageItem = this.usage;
        return hashCode2 + (netChatUsageItem != null ? netChatUsageItem.hashCode() : 0);
    }

    public String toString() {
        return "NetChatSearchResultItem(delta=" + this.delta + ", id=" + this.id + ", object=" + this.object + ", status=" + this.status + ", usage=" + this.usage + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        this.delta.writeToParcel(out, i8);
        out.writeString(this.id);
        out.writeString(this.object);
        out.writeString(this.status);
        NetChatUsageItem netChatUsageItem = this.usage;
        if (netChatUsageItem == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            netChatUsageItem.writeToParcel(out, i8);
        }
    }

    public /* synthetic */ NetChatSearchResultItem(Delta delta, String str, String str2, String str3, NetChatUsageItem netChatUsageItem, int i8, o oVar) {
        this(delta, str, str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : netChatUsageItem);
    }
}
