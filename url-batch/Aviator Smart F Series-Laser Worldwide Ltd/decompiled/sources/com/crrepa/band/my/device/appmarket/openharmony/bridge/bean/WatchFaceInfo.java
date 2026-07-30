package com.crrepa.band.my.device.appmarket.openharmony.bridge.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class WatchFaceInfo implements Parcelable {
    public static final Parcelable.Creator<WatchFaceInfo> CREATOR = new Parcelable.Creator<WatchFaceInfo>() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.WatchFaceInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchFaceInfo createFromParcel(Parcel parcel) {
            return new WatchFaceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchFaceInfo[] newArray(int i8) {
            return new WatchFaceInfo[i8];
        }
    };
    private boolean isCurrentWatchFace;
    private boolean isInstalled;
    private String name;
    private String protocolVersion;
    private String uuid;
    private String watchfaceVersion;

    public WatchFaceInfo(String str, String str2, boolean z7, boolean z8, String str3, String str4) {
        this.uuid = str;
        this.name = str2;
        this.isInstalled = z7;
        this.isCurrentWatchFace = z8;
        this.protocolVersion = str3;
        this.watchfaceVersion = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getWatchfaceVersion() {
        return this.watchfaceVersion;
    }

    public boolean isCurrentWatchFace() {
        return this.isCurrentWatchFace;
    }

    public boolean isInstalled() {
        return this.isInstalled;
    }

    public void setCurrentWatchFace(boolean z7) {
        this.isCurrentWatchFace = z7;
    }

    public void setInstalled(boolean z7) {
        this.isInstalled = z7;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setProtocolVersion(String str) {
        this.protocolVersion = str;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setWatchfaceVersion(String str) {
        this.watchfaceVersion = str;
    }

    @NonNull
    public String toString() {
        return "WatchFaceInfo{uuid='" + this.uuid + "', name='" + this.name + "', isInstalled=" + this.isInstalled + ", isCurrentWatchFace=" + this.isCurrentWatchFace + ", protocolVersion='" + this.protocolVersion + "', watchfaceVersion='" + this.watchfaceVersion + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        parcel.writeString(this.uuid);
        parcel.writeString(this.name);
        parcel.writeByte(this.isInstalled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCurrentWatchFace ? (byte) 1 : (byte) 0);
        parcel.writeString(this.protocolVersion);
        parcel.writeString(this.watchfaceVersion);
    }

    protected WatchFaceInfo(Parcel parcel) {
        this.uuid = parcel.readString();
        this.name = parcel.readString();
        this.isInstalled = parcel.readByte() != 0;
        this.isCurrentWatchFace = parcel.readByte() != 0;
        this.protocolVersion = parcel.readString();
        this.watchfaceVersion = parcel.readString();
    }
}
