package com.openharmony.watch.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class Device implements Parcelable {
    public static final Parcelable.Creator<Device> CREATOR = new a();
    private Integer deviceType;
    private boolean isConnected;
    private String model;
    private String name;
    private Integer notifyCapability;
    private Integer p2pCapability;
    private Integer productType;
    private String reservedness;
    private Integer sensorCapability;
    private String softwareVersion;
    private String uuid;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public Device createFromParcel(Parcel parcel) {
            boolean readBoolean;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf = Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            readBoolean = parcel.readBoolean();
            return new Device(readString, readString2, readString3, valueOf, readString4, readString5, readBoolean, Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public Device[] newArray(int i8) {
            return new Device[i8];
        }
    }

    protected Device(Parcel parcel) {
        boolean readBoolean;
        this.model = parcel.readString();
        this.name = parcel.readString();
        this.uuid = parcel.readString();
        this.productType = Integer.valueOf(parcel.readInt());
        this.reservedness = parcel.readString();
        this.softwareVersion = parcel.readString();
        readBoolean = parcel.readBoolean();
        this.isConnected = readBoolean;
        this.p2pCapability = Integer.valueOf(parcel.readInt());
        this.notifyCapability = Integer.valueOf(parcel.readInt());
        this.sensorCapability = Integer.valueOf(parcel.readInt());
        this.deviceType = Integer.valueOf(parcel.readInt());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getDeviceType() {
        return this.deviceType;
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }

    public Integer getNotifyCapability() {
        return this.notifyCapability;
    }

    public Integer getP2pCapability() {
        return this.p2pCapability;
    }

    public Integer getProductType() {
        return this.productType;
    }

    public String getReservedness() {
        return this.reservedness;
    }

    public Integer getSensorCapability() {
        return this.sensorCapability;
    }

    public String getSoftwareVersion() {
        return this.softwareVersion;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean isConnected() {
        return this.isConnected;
    }

    public Device readFromParcel(Parcel parcel) {
        boolean readBoolean;
        this.model = parcel.readString();
        this.name = parcel.readString();
        this.uuid = parcel.readString();
        this.productType = Integer.valueOf(parcel.readInt());
        this.reservedness = parcel.readString();
        this.softwareVersion = parcel.readString();
        readBoolean = parcel.readBoolean();
        this.isConnected = readBoolean;
        this.p2pCapability = Integer.valueOf(parcel.readInt());
        this.notifyCapability = Integer.valueOf(parcel.readInt());
        this.sensorCapability = Integer.valueOf(parcel.readInt());
        this.deviceType = Integer.valueOf(parcel.readInt());
        return this;
    }

    @NonNull
    public String toString() {
        return "model:" + this.model + ",name:" + this.name + ",uuid:" + this.uuid + ",productType:" + this.productType + ",reservedness:" + this.reservedness + ",softwareVersion:" + this.softwareVersion + ",isConnected:" + this.isConnected + ",p2pCapability:" + this.p2pCapability + ",notifyCapability:" + this.notifyCapability + ",sensorCapability:" + this.sensorCapability + ",deviceType:" + this.deviceType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        parcel.writeString(this.model);
        parcel.writeString(this.name);
        parcel.writeString(this.uuid);
        parcel.writeInt(this.productType.intValue());
        parcel.writeString(this.reservedness);
        parcel.writeString(this.softwareVersion);
        parcel.writeBoolean(this.isConnected);
        parcel.writeInt(this.p2pCapability.intValue());
        parcel.writeInt(this.notifyCapability.intValue());
        parcel.writeInt(this.sensorCapability.intValue());
        parcel.writeInt(this.deviceType.intValue());
    }

    public Device(String str, String str2, String str3, Integer num, String str4, String str5, boolean z7, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.model = str;
        this.name = str2;
        this.uuid = str3;
        this.productType = num;
        this.reservedness = str4;
        this.softwareVersion = str5;
        this.isConnected = z7;
        this.p2pCapability = num2;
        this.notifyCapability = num3;
        this.sensorCapability = num4;
        this.deviceType = num5;
    }
}
