package com.crrepa.band.my.device.appmarket.openharmony.bridge.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class AppInfo implements Parcelable {
    public static final Parcelable.Creator<AppInfo> CREATOR = new Parcelable.Creator<AppInfo>() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.AppInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppInfo createFromParcel(Parcel parcel) {
            return new AppInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppInfo[] newArray(int i8) {
            return new AppInfo[i8];
        }
    };
    private String name;
    private String packageName;
    private Integer status;
    private Integer versionCode;

    public AppInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getVersionCode() {
        return this.versionCode;
    }

    public void readFromParcel(Parcel parcel) {
        this.name = parcel.readString();
        this.packageName = parcel.readString();
        this.versionCode = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.status = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }

    public AppInfo setName(String str) {
        this.name = str;
        return this;
    }

    public AppInfo setPackageName(String str) {
        this.packageName = str;
        return this;
    }

    public AppInfo setStatus(Integer num) {
        this.status = num;
        return this;
    }

    public AppInfo setVersionCode(Integer num) {
        this.versionCode = num;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.name);
        parcel.writeString(this.packageName);
        parcel.writeValue(this.versionCode);
        parcel.writeValue(this.status);
    }

    protected AppInfo(Parcel parcel) {
        this.name = parcel.readString();
        this.packageName = parcel.readString();
        this.versionCode = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.status = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }
}
