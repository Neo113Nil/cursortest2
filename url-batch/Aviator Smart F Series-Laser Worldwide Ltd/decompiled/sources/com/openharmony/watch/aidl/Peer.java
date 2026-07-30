package com.openharmony.watch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class Peer implements Parcelable {
    public static final Parcelable.Creator<Peer> CREATOR = new a();
    private Device device;
    private String dstPkgName;
    private String fingerPrint;
    private String srcPkgName;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Peer createFromParcel(Parcel parcel) {
            return new Peer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Peer[] newArray(int i8) {
            return new Peer[i8];
        }
    }

    protected Peer(Parcel parcel) {
        this.device = (Device) parcel.readParcelable(Device.class.getClassLoader());
        this.fingerPrint = parcel.readString();
        this.srcPkgName = parcel.readString();
        this.dstPkgName = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Device getDevice() {
        return this.device;
    }

    public String getDstPkgName() {
        return this.dstPkgName;
    }

    public String getFingerPrint() {
        return this.fingerPrint;
    }

    public String getSrcPkgName() {
        return this.srcPkgName;
    }

    public void setDstPkgName(String str) {
        this.dstPkgName = str;
    }

    public void setFingerPrint(String str) {
        this.fingerPrint = str;
    }

    public void setSrcPkgName(String str) {
        this.srcPkgName = str;
    }

    @NonNull
    public String toString() {
        return "device:" + this.device + ",fingerPrint:" + this.fingerPrint + ",srcPkgName:" + this.srcPkgName + ",dstPkgName:" + this.dstPkgName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        parcel.writeParcelable(this.device, i8);
        parcel.writeString(this.fingerPrint);
        parcel.writeString(this.srcPkgName);
        parcel.writeString(this.dstPkgName);
    }

    public Peer(Device device, String str, String str2, String str3) {
        this.device = device;
        this.fingerPrint = str;
        this.srcPkgName = str2;
        this.dstPkgName = str3;
    }
}
