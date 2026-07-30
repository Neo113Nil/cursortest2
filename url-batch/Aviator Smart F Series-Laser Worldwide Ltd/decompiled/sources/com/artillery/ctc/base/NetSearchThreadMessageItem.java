package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class NetSearchThreadMessageItem implements Parcelable {
    public static final Parcelable.Creator<NetSearchThreadMessageItem> CREATOR = new a();
    private final List<Content> choice;
    private final int created_at;
    private final String id;
    private final String object;
    private final String status;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final NetSearchThreadMessageItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i8 = 0; i8 != readInt2; i8++) {
                    arrayList2.add(Content.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new NetSearchThreadMessageItem(readInt, readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NetSearchThreadMessageItem[] newArray(int i8) {
            return new NetSearchThreadMessageItem[i8];
        }
    }

    public NetSearchThreadMessageItem(int i8, String id, String object, String status, List<Content> list) {
        s.checkNotNullParameter(id, "id");
        s.checkNotNullParameter(object, "object");
        s.checkNotNullParameter(status, "status");
        this.created_at = i8;
        this.id = id;
        this.object = object;
        this.status = status;
        this.choice = list;
    }

    public static /* synthetic */ NetSearchThreadMessageItem copy$default(NetSearchThreadMessageItem netSearchThreadMessageItem, int i8, String str, String str2, String str3, List list, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = netSearchThreadMessageItem.created_at;
        }
        if ((i9 & 2) != 0) {
            str = netSearchThreadMessageItem.id;
        }
        String str4 = str;
        if ((i9 & 4) != 0) {
            str2 = netSearchThreadMessageItem.object;
        }
        String str5 = str2;
        if ((i9 & 8) != 0) {
            str3 = netSearchThreadMessageItem.status;
        }
        String str6 = str3;
        if ((i9 & 16) != 0) {
            list = netSearchThreadMessageItem.choice;
        }
        return netSearchThreadMessageItem.copy(i8, str4, str5, str6, list);
    }

    public final int component1() {
        return this.created_at;
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

    public final List<Content> component5() {
        return this.choice;
    }

    public final NetSearchThreadMessageItem copy(int i8, String id, String object, String status, List<Content> list) {
        s.checkNotNullParameter(id, "id");
        s.checkNotNullParameter(object, "object");
        s.checkNotNullParameter(status, "status");
        return new NetSearchThreadMessageItem(i8, id, object, status, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetSearchThreadMessageItem)) {
            return false;
        }
        NetSearchThreadMessageItem netSearchThreadMessageItem = (NetSearchThreadMessageItem) obj;
        return this.created_at == netSearchThreadMessageItem.created_at && s.areEqual(this.id, netSearchThreadMessageItem.id) && s.areEqual(this.object, netSearchThreadMessageItem.object) && s.areEqual(this.status, netSearchThreadMessageItem.status) && s.areEqual(this.choice, netSearchThreadMessageItem.choice);
    }

    public final List<Content> getChoice() {
        return this.choice;
    }

    public final int getCreated_at() {
        return this.created_at;
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

    public int hashCode() {
        int hashCode = ((((((this.created_at * 31) + this.id.hashCode()) * 31) + this.object.hashCode()) * 31) + this.status.hashCode()) * 31;
        List<Content> list = this.choice;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "NetSearchThreadMessageItem(created_at=" + this.created_at + ", id=" + this.id + ", object=" + this.object + ", status=" + this.status + ", choice=" + this.choice + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeInt(this.created_at);
        out.writeString(this.id);
        out.writeString(this.object);
        out.writeString(this.status);
        List<Content> list = this.choice;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        Iterator<Content> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i8);
        }
    }
}
