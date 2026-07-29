package com.ijinshan.cloudconfig.deepcloudconfig;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ConfigInfo implements Parcelable, Serializable, Comparable<ConfigInfo> {
    public static final Parcelable.Creator<ConfigInfo> CREATOR = new Parcelable.Creator<ConfigInfo>() { // from class: com.ijinshan.cloudconfig.deepcloudconfig.ConfigInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfigInfo createFromParcel(Parcel parcel) {
            return new ConfigInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConfigInfo[] newArray(int i) {
            return new ConfigInfo[i];
        }
    };
    private String data;
    private int func_type;
    private int priority;
    private String section;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setFunc_type(int i) {
        this.func_type = i;
    }

    public void setSection(String str) {
        this.section = str;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String str) {
        this.data = str;
    }

    public String toString() {
        return "ConfigInfo [func_type=" + this.func_type + ", section=" + this.section + ", priority=" + this.priority + ", data=" + this.data + "]";
    }

    @Override // java.lang.Comparable
    public int compareTo(ConfigInfo configInfo) {
        return this.priority - configInfo.priority;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.func_type);
        parcel.writeString(this.section);
        parcel.writeInt(this.priority);
        parcel.writeString(this.data);
    }

    public ConfigInfo() {
    }

    public ConfigInfo(Parcel parcel) {
        this.func_type = parcel.readInt();
        this.section = parcel.readString();
        this.priority = parcel.readInt();
        this.data = parcel.readString();
    }
}
