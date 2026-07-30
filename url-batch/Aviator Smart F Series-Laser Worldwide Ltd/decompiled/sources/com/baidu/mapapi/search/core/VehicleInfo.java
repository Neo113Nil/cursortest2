package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class VehicleInfo implements Parcelable {
    public static final Parcelable.Creator<VehicleInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f6847a;

    /* renamed from: b, reason: collision with root package name */
    private int f6848b;

    /* renamed from: c, reason: collision with root package name */
    private String f6849c;

    /* renamed from: d, reason: collision with root package name */
    private int f6850d;

    /* renamed from: e, reason: collision with root package name */
    private int f6851e;

    /* renamed from: f, reason: collision with root package name */
    private String f6852f;

    /* renamed from: g, reason: collision with root package name */
    private String f6853g;

    /* renamed from: h, reason: collision with root package name */
    private String f6854h;

    /* renamed from: i, reason: collision with root package name */
    private String f6855i;

    static class a implements Parcelable.Creator<VehicleInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VehicleInfo createFromParcel(Parcel parcel) {
            return new VehicleInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VehicleInfo[] newArray(int i8) {
            return new VehicleInfo[i8];
        }
    }

    public VehicleInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDirectText() {
        return this.f6855i;
    }

    public String getEndTime() {
        return this.f6853g;
    }

    public String getHeadWay() {
        return this.f6854h;
    }

    public int getPassStationNum() {
        return this.f6848b;
    }

    public String getStartTime() {
        return this.f6852f;
    }

    public String getTitle() {
        return this.f6849c;
    }

    public int getTotalPrice() {
        return this.f6851e;
    }

    public String getUid() {
        return this.f6847a;
    }

    public int getZonePrice() {
        return this.f6850d;
    }

    public void setDirectText(String str) {
        this.f6855i = str;
    }

    public void setEndTime(String str) {
        this.f6853g = str;
    }

    public void setHeadWay(String str) {
        this.f6854h = str;
    }

    public void setPassStationNum(int i8) {
        this.f6848b = i8;
    }

    public void setStartTime(String str) {
        this.f6852f = str;
    }

    public void setTitle(String str) {
        this.f6849c = str;
    }

    public void setTotalPrice(int i8) {
        this.f6851e = i8;
    }

    public void setUid(String str) {
        this.f6847a = str;
    }

    public void setZonePrice(int i8) {
        this.f6850d = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f6847a);
        parcel.writeInt(this.f6848b);
        parcel.writeString(this.f6849c);
        parcel.writeInt(this.f6850d);
        parcel.writeInt(this.f6851e);
        parcel.writeString(this.f6852f);
        parcel.writeString(this.f6853g);
        parcel.writeString(this.f6854h);
        parcel.writeString(this.f6855i);
    }

    protected VehicleInfo(Parcel parcel) {
        this.f6847a = parcel.readString();
        this.f6848b = parcel.readInt();
        this.f6849c = parcel.readString();
        this.f6850d = parcel.readInt();
        this.f6851e = parcel.readInt();
        this.f6852f = parcel.readString();
        this.f6853g = parcel.readString();
        this.f6854h = parcel.readString();
        this.f6855i = parcel.readString();
    }
}
