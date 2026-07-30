package com.crrepa.band.my.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class BandFirmwareModel implements Parcelable {
    public static final Parcelable.Creator<BandFirmwareModel> CREATOR = new Parcelable.Creator<BandFirmwareModel>() { // from class: com.crrepa.band.my.model.BandFirmwareModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BandFirmwareModel createFromParcel(Parcel parcel) {
            return new BandFirmwareModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BandFirmwareModel[] newArray(int i8) {
            return new BandFirmwareModel[i8];
        }
    };
    private String changeNote;
    private int mcu;
    private boolean tpUpgrade;
    private int type;
    private String version;

    public BandFirmwareModel(int i8, String str, String str2, int i9, boolean z7) {
        this.type = i8;
        this.version = str;
        this.changeNote = str2;
        this.mcu = i9;
        this.tpUpgrade = z7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getChangeNote() {
        return this.changeNote;
    }

    public int getMcu() {
        return this.mcu;
    }

    public int getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isTpUpgrade() {
        return this.tpUpgrade;
    }

    public void setChangeNote(String str) {
        this.changeNote = str;
    }

    public void setMcu(int i8) {
        this.mcu = i8;
    }

    public void setTpUpgrade(boolean z7) {
        this.tpUpgrade = z7;
    }

    public void setType(int i8) {
        this.type = i8;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.type);
        parcel.writeString(this.version);
        parcel.writeString(this.changeNote);
        parcel.writeInt(this.mcu);
        parcel.writeByte(this.tpUpgrade ? (byte) 1 : (byte) 0);
    }

    protected BandFirmwareModel(Parcel parcel) {
        this.type = parcel.readInt();
        this.version = parcel.readString();
        this.changeNote = parcel.readString();
        this.mcu = parcel.readInt();
        this.tpUpgrade = parcel.readByte() != 0;
    }
}
