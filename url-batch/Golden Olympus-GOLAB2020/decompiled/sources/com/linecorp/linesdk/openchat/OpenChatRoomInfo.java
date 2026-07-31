package com.linecorp.linesdk.openchat;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class OpenChatRoomInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OpenChatRoomInfo> CREATOR = new Creator();

    @NotNull
    private final String landingPageUrl;

    @NotNull
    private final String roomId;

    @Metadata
    public static final class Creator implements Parcelable.Creator<OpenChatRoomInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenChatRoomInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OpenChatRoomInfo(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OpenChatRoomInfo[] newArray(int i4) {
            return new OpenChatRoomInfo[i4];
        }
    }

    public OpenChatRoomInfo(@NotNull String roomId, @NotNull String landingPageUrl) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(landingPageUrl, "landingPageUrl");
        this.roomId = roomId;
        this.landingPageUrl = landingPageUrl;
    }

    public static /* synthetic */ OpenChatRoomInfo copy$default(OpenChatRoomInfo openChatRoomInfo, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = openChatRoomInfo.roomId;
        }
        if ((i4 & 2) != 0) {
            str2 = openChatRoomInfo.landingPageUrl;
        }
        return openChatRoomInfo.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.roomId;
    }

    @NotNull
    public final String component2() {
        return this.landingPageUrl;
    }

    @NotNull
    public final OpenChatRoomInfo copy(@NotNull String roomId, @NotNull String landingPageUrl) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(landingPageUrl, "landingPageUrl");
        return new OpenChatRoomInfo(roomId, landingPageUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenChatRoomInfo)) {
            return false;
        }
        OpenChatRoomInfo openChatRoomInfo = (OpenChatRoomInfo) obj;
        return Intrinsics.areEqual(this.roomId, openChatRoomInfo.roomId) && Intrinsics.areEqual(this.landingPageUrl, openChatRoomInfo.landingPageUrl);
    }

    @NotNull
    public final String getLandingPageUrl() {
        return this.landingPageUrl;
    }

    @NotNull
    public final String getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        return (this.roomId.hashCode() * 31) + this.landingPageUrl.hashCode();
    }

    @NotNull
    public String toString() {
        return "OpenChatRoomInfo(roomId=" + this.roomId + ", landingPageUrl=" + this.landingPageUrl + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i4) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.roomId);
        out.writeString(this.landingPageUrl);
    }
}
