package com.crrepa.band.my.device.appmarket.openharmony.bridge.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class NativeCommonDataBean implements Parcelable {
    public static final Parcelable.Creator<NativeCommonDataBean> CREATOR = new Parcelable.Creator<NativeCommonDataBean>() { // from class: com.crrepa.band.my.device.appmarket.openharmony.bridge.bean.NativeCommonDataBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NativeCommonDataBean createFromParcel(Parcel parcel) {
            return new NativeCommonDataBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NativeCommonDataBean[] newArray(int i8) {
            return new NativeCommonDataBean[i8];
        }
    };
    private String appId;
    private String bridgeVersion;
    private String channel;
    private String deviceModel;
    private String manufacturer;
    private String netWorkType;
    private String os;
    private String pid;
    private String sysVersion;
    private String version;
    private String versionCode;

    public NativeCommonDataBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getBridgeVersion() {
        return this.bridgeVersion;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getNetWorkType() {
        return this.netWorkType;
    }

    public String getOs() {
        return this.os;
    }

    public String getPid() {
        return this.pid;
    }

    public String getSysVersion() {
        return this.sysVersion;
    }

    public String getVersion() {
        return this.version;
    }

    public String getVersionCode() {
        return this.versionCode;
    }

    public void readFromParcel(Parcel parcel) {
        this.os = parcel.readString();
        this.sysVersion = parcel.readString();
        this.pid = parcel.readString();
        this.deviceModel = parcel.readString();
        this.version = parcel.readString();
        this.versionCode = parcel.readString();
        this.bridgeVersion = parcel.readString();
        this.manufacturer = parcel.readString();
        this.channel = parcel.readString();
        this.netWorkType = parcel.readString();
        this.appId = parcel.readString();
    }

    public NativeCommonDataBean setAppId(String str) {
        this.appId = str;
        return this;
    }

    public NativeCommonDataBean setBridgeVersion(String str) {
        this.bridgeVersion = str;
        return this;
    }

    public NativeCommonDataBean setChannel(String str) {
        this.channel = str;
        return this;
    }

    public NativeCommonDataBean setDeviceModel(String str) {
        this.deviceModel = str;
        return this;
    }

    public NativeCommonDataBean setManufacturer(String str) {
        this.manufacturer = str;
        return this;
    }

    public NativeCommonDataBean setNetWorkType(String str) {
        this.netWorkType = str;
        return this;
    }

    public NativeCommonDataBean setOs(String str) {
        this.os = str;
        return this;
    }

    public NativeCommonDataBean setPid(String str) {
        this.pid = str;
        return this;
    }

    public NativeCommonDataBean setSysVersion(String str) {
        this.sysVersion = str;
        return this;
    }

    public NativeCommonDataBean setVersion(String str) {
        this.version = str;
        return this;
    }

    public NativeCommonDataBean setVersionCode(String str) {
        this.versionCode = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.os);
        parcel.writeString(this.sysVersion);
        parcel.writeString(this.pid);
        parcel.writeString(this.deviceModel);
        parcel.writeString(this.version);
        parcel.writeString(this.versionCode);
        parcel.writeString(this.bridgeVersion);
        parcel.writeString(this.manufacturer);
        parcel.writeString(this.channel);
        parcel.writeString(this.netWorkType);
        parcel.writeString(this.appId);
    }

    protected NativeCommonDataBean(Parcel parcel) {
        this.os = parcel.readString();
        this.sysVersion = parcel.readString();
        this.pid = parcel.readString();
        this.deviceModel = parcel.readString();
        this.version = parcel.readString();
        this.versionCode = parcel.readString();
        this.bridgeVersion = parcel.readString();
        this.manufacturer = parcel.readString();
        this.channel = parcel.readString();
        this.netWorkType = parcel.readString();
        this.appId = parcel.readString();
    }
}
