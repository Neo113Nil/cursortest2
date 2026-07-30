package com.crrepa.band.my.model.db;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes2.dex */
public class WorldClock implements Parcelable {
    public static final Parcelable.Creator<WorldClock> CREATOR = new Parcelable.Creator<WorldClock>() { // from class: com.crrepa.band.my.model.db.WorldClock.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorldClock createFromParcel(Parcel parcel) {
            return new WorldClock(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorldClock[] newArray(int i8) {
            return new WorldClock[i8];
        }
    };
    private String cityKey;
    private Integer clockId;
    private Long id;
    private Integer jetLag;
    private Double latitude;
    private Double longitude;
    private Integer timeZone;
    private String timeZoneIdentifier;

    protected WorldClock(Parcel parcel) {
        this.id = (Long) parcel.readValue(Long.class.getClassLoader());
        this.clockId = Integer.valueOf(parcel.readInt());
        this.timeZone = Integer.valueOf(parcel.readInt());
        this.cityKey = parcel.readString();
        this.longitude = Double.valueOf(parcel.readDouble());
        this.latitude = Double.valueOf(parcel.readDouble());
        this.jetLag = Integer.valueOf(parcel.readInt());
        this.timeZoneIdentifier = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorldClock worldClock = (WorldClock) obj;
        return this.timeZone.equals(worldClock.timeZone) && this.longitude.equals(worldClock.longitude) && this.latitude.equals(worldClock.latitude) && this.cityKey.equals(worldClock.cityKey) && this.jetLag.equals(worldClock.jetLag) && this.timeZoneIdentifier.equals(worldClock.timeZoneIdentifier);
    }

    public String getCityKey() {
        return this.cityKey;
    }

    public Integer getClockId() {
        return this.clockId;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getJetLag() {
        return this.jetLag;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Integer getTimeZone() {
        return this.timeZone;
    }

    public String getTimeZoneIdentifier() {
        return this.timeZoneIdentifier;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.clockId, this.timeZone, this.longitude, this.latitude, this.jetLag, this.cityKey);
    }

    public void setCityKey(String str) {
        this.cityKey = str;
    }

    public void setClockId(Integer num) {
        this.clockId = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setJetLag(Integer num) {
        this.jetLag = num;
    }

    public void setLatitude(Double d8) {
        this.latitude = d8;
    }

    public void setLongitude(Double d8) {
        this.longitude = d8;
    }

    public void setTimeZone(Integer num) {
        this.timeZone = num;
    }

    public void setTimeZoneIdentifier(String str) {
        this.timeZoneIdentifier = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeValue(this.id);
        parcel.writeInt(this.clockId.intValue());
        parcel.writeInt(this.timeZone.intValue());
        parcel.writeString(this.cityKey);
        parcel.writeDouble(this.longitude.doubleValue());
        parcel.writeDouble(this.latitude.doubleValue());
        parcel.writeInt(this.jetLag.intValue());
        parcel.writeString(this.timeZoneIdentifier);
    }

    public WorldClock(Long l8, Integer num, Integer num2, Double d8, Double d9, Integer num3, String str, String str2) {
        this.id = l8;
        this.clockId = num;
        this.timeZone = num2;
        this.longitude = d8;
        this.latitude = d9;
        this.jetLag = num3;
        this.cityKey = str;
        this.timeZoneIdentifier = str2;
    }

    public WorldClock() {
    }
}
