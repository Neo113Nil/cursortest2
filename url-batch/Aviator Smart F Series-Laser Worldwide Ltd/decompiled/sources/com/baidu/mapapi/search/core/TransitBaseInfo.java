package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class TransitBaseInfo implements Parcelable {
    public static final Parcelable.Creator<TransitBaseInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f6838a;

    /* renamed from: b, reason: collision with root package name */
    private String f6839b;

    /* renamed from: c, reason: collision with root package name */
    private String f6840c;

    /* renamed from: d, reason: collision with root package name */
    private String f6841d;

    /* renamed from: e, reason: collision with root package name */
    private String f6842e;

    static class a implements Parcelable.Creator<TransitBaseInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransitBaseInfo createFromParcel(Parcel parcel) {
            return new TransitBaseInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransitBaseInfo[] newArray(int i8) {
            return new TransitBaseInfo[i8];
        }
    }

    public TransitBaseInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getArriveStation() {
        return this.f6840c;
    }

    public String getArriveTime() {
        return this.f6842e;
    }

    public String getDepartureStation() {
        return this.f6839b;
    }

    public String getDepartureTime() {
        return this.f6841d;
    }

    public String getName() {
        return this.f6838a;
    }

    public void setArriveStation(String str) {
        this.f6840c = str;
    }

    public void setArriveTime(String str) {
        this.f6842e = str;
    }

    public void setDepartureStation(String str) {
        this.f6839b = str;
    }

    public void setDepartureTime(String str) {
        this.f6841d = str;
    }

    public void setName(String str) {
        this.f6838a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f6838a);
        parcel.writeString(this.f6839b);
        parcel.writeString(this.f6840c);
        parcel.writeString(this.f6841d);
        parcel.writeString(this.f6842e);
    }

    protected TransitBaseInfo(Parcel parcel) {
        this.f6838a = parcel.readString();
        this.f6839b = parcel.readString();
        this.f6840c = parcel.readString();
        this.f6841d = parcel.readString();
        this.f6842e = parcel.readString();
    }
}
