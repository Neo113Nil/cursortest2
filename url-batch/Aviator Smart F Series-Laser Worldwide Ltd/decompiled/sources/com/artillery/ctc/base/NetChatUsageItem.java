package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class NetChatUsageItem implements Parcelable {
    public static final Parcelable.Creator<NetChatUsageItem> CREATOR = new a();
    private final long completion_tokens;
    private final long prompt_tokens;
    private final long total_tokens;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final NetChatUsageItem createFromParcel(Parcel parcel) {
            s.checkNotNullParameter(parcel, "parcel");
            return new NetChatUsageItem(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final NetChatUsageItem[] newArray(int i8) {
            return new NetChatUsageItem[i8];
        }
    }

    public NetChatUsageItem(long j8, long j9, long j10) {
        this.completion_tokens = j8;
        this.prompt_tokens = j9;
        this.total_tokens = j10;
    }

    public static /* synthetic */ NetChatUsageItem copy$default(NetChatUsageItem netChatUsageItem, long j8, long j9, long j10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = netChatUsageItem.completion_tokens;
        }
        long j11 = j8;
        if ((i8 & 2) != 0) {
            j9 = netChatUsageItem.prompt_tokens;
        }
        long j12 = j9;
        if ((i8 & 4) != 0) {
            j10 = netChatUsageItem.total_tokens;
        }
        return netChatUsageItem.copy(j11, j12, j10);
    }

    public final long component1() {
        return this.completion_tokens;
    }

    public final long component2() {
        return this.prompt_tokens;
    }

    public final long component3() {
        return this.total_tokens;
    }

    public final NetChatUsageItem copy(long j8, long j9, long j10) {
        return new NetChatUsageItem(j8, j9, j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetChatUsageItem)) {
            return false;
        }
        NetChatUsageItem netChatUsageItem = (NetChatUsageItem) obj;
        return this.completion_tokens == netChatUsageItem.completion_tokens && this.prompt_tokens == netChatUsageItem.prompt_tokens && this.total_tokens == netChatUsageItem.total_tokens;
    }

    public final long getCompletion_tokens() {
        return this.completion_tokens;
    }

    public final long getPrompt_tokens() {
        return this.prompt_tokens;
    }

    public final long getTotal_tokens() {
        return this.total_tokens;
    }

    public int hashCode() {
        return (((androidx.collection.a.a(this.completion_tokens) * 31) + androidx.collection.a.a(this.prompt_tokens)) * 31) + androidx.collection.a.a(this.total_tokens);
    }

    public String toString() {
        return "NetChatUsageItem(completion_tokens=" + this.completion_tokens + ", prompt_tokens=" + this.prompt_tokens + ", total_tokens=" + this.total_tokens + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        s.checkNotNullParameter(out, "out");
        out.writeLong(this.completion_tokens);
        out.writeLong(this.prompt_tokens);
        out.writeLong(this.total_tokens);
    }
}
