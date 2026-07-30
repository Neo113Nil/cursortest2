package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class RouteStep implements Parcelable {
    public static final Parcelable.Creator<RouteStep> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    int f6826a;

    /* renamed from: b, reason: collision with root package name */
    int f6827b;

    /* renamed from: c, reason: collision with root package name */
    String f6828c;

    /* renamed from: d, reason: collision with root package name */
    int f6829d;
    protected List<LatLng> mWayPoints;

    static class a implements Parcelable.Creator<RouteStep> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RouteStep createFromParcel(Parcel parcel) {
            return new RouteStep(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RouteStep[] newArray(int i8) {
            return new RouteStep[i8];
        }
    }

    protected RouteStep() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDistance() {
        return this.f6826a;
    }

    public int getDuration() {
        return this.f6827b;
    }

    public String getName() {
        return this.f6828c;
    }

    public int getTransType() {
        return this.f6829d;
    }

    public List<LatLng> getWayPoints() {
        return this.mWayPoints;
    }

    public void setDistance(int i8) {
        this.f6826a = i8;
    }

    public void setDuration(int i8) {
        this.f6827b = i8;
    }

    public void setName(String str) {
        this.f6828c = str;
    }

    public void setTransType(int i8) {
        this.f6829d = i8;
    }

    public void setWayPoints(List<LatLng> list) {
        this.mWayPoints = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f6826a);
        parcel.writeInt(this.f6827b);
        parcel.writeInt(this.f6829d);
        parcel.writeString(this.f6828c);
        parcel.writeList(this.mWayPoints);
    }

    protected RouteStep(Parcel parcel) {
        this.f6826a = parcel.readInt();
        this.f6827b = parcel.readInt();
        this.f6829d = parcel.readInt();
        this.f6828c = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.mWayPoints = arrayList;
        parcel.readList(arrayList, LatLng.class.getClassLoader());
        if (this.mWayPoints.size() == 0) {
            this.mWayPoints = null;
        }
    }
}
