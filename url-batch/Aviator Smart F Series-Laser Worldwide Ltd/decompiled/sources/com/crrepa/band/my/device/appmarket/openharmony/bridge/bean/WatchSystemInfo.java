package com.crrepa.band.my.device.appmarket.openharmony.bridge.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class WatchSystemInfo implements Parcelable {
    public static final Parcelable.Creator<WatchSystemInfo> CREATOR = new Parcelable.Creator<WatchSystemInfo>() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.WatchSystemInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchSystemInfo createFromParcel(Parcel parcel) {
            return new WatchSystemInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchSystemInfo[] newArray(int i8) {
            return new WatchSystemInfo[i8];
        }
    };
    private String chipModel;
    private String chipPlatform;
    private String os;
    private String osVersion;
    private String resolution;
    private String sdkVersion;
    private List<String> watchFaceProtocolVersion;

    public WatchSystemInfo(String str, String str2, String str3, String str4, String str5, List<String> list, String str6) {
        new ArrayList();
        this.chipPlatform = str;
        this.chipModel = str2;
        this.os = str3;
        this.osVersion = str4;
        this.sdkVersion = str5;
        this.watchFaceProtocolVersion = list;
        this.resolution = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getChipModel() {
        return this.chipModel;
    }

    public String getChipPlatform() {
        return this.chipPlatform;
    }

    public String getOs() {
        return this.os;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public List<String> getWatchFaceProtocolVersion() {
        return this.watchFaceProtocolVersion;
    }

    public void setChipModel(String str) {
        this.chipModel = str;
    }

    public void setChipPlatform(String str) {
        this.chipPlatform = str;
    }

    public void setOs(String str) {
        this.os = str;
    }

    public void setOsVersion(String str) {
        this.osVersion = str;
    }

    public void setResolution(String str) {
        this.resolution = str;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public void setWatchFaceProtocolVersion(List<String> list) {
        this.watchFaceProtocolVersion = list;
    }

    @NonNull
    public String toString() {
        return "WatchSystemInfo{chipPlatform='" + this.chipPlatform + "', chipModel='" + this.chipModel + "', os='" + this.os + "', osVersion='" + this.osVersion + "', sdkVersion='" + this.sdkVersion + "', watchFaceProtocolVersion='" + this.watchFaceProtocolVersion.toString() + "', resolution='" + this.resolution + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        parcel.writeString(this.chipPlatform);
        parcel.writeString(this.chipModel);
        parcel.writeString(this.os);
        parcel.writeString(this.osVersion);
        parcel.writeString(this.sdkVersion);
        parcel.writeList(this.watchFaceProtocolVersion);
        parcel.writeString(this.resolution);
    }

    protected WatchSystemInfo(Parcel parcel) {
        this.watchFaceProtocolVersion = new ArrayList();
        this.chipPlatform = parcel.readString();
        this.chipModel = parcel.readString();
        this.os = parcel.readString();
        this.osVersion = parcel.readString();
        this.sdkVersion = parcel.readString();
        parcel.readList(this.watchFaceProtocolVersion, String.class.getClassLoader());
        this.resolution = parcel.readString();
    }
}
