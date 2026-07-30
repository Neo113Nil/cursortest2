package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class BuildingInfo implements Parcelable {
    public static final Parcelable.Creator<BuildingInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f6752a;

    /* renamed from: b, reason: collision with root package name */
    private int f6753b;

    /* renamed from: c, reason: collision with root package name */
    private float f6754c;

    /* renamed from: d, reason: collision with root package name */
    private int f6755d;

    /* renamed from: e, reason: collision with root package name */
    private String f6756e;

    /* renamed from: f, reason: collision with root package name */
    private LatLng f6757f;

    static class a implements Parcelable.Creator<BuildingInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BuildingInfo createFromParcel(Parcel parcel) {
            return new BuildingInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BuildingInfo[] newArray(int i8) {
            return new BuildingInfo[i8];
        }
    }

    public BuildingInfo() {
    }

    public void a(int i8) {
        this.f6755d = i8;
    }

    public void b(int i8) {
        this.f6753b = i8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAccuracy() {
        return this.f6755d;
    }

    public LatLng getCenter() {
        return this.f6757f;
    }

    public String getGeom() {
        return this.f6756e;
    }

    public float getHeight() {
        return this.f6754c;
    }

    public int getLabel() {
        return this.f6753b;
    }

    public String getStructID() {
        return this.f6752a;
    }

    public void setHeight(float f8) {
        this.f6754c = f8;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("BuidingInfo: \n");
        stringBuffer.append("; height = ");
        stringBuffer.append(this.f6754c);
        stringBuffer.append("; accuracy = ");
        stringBuffer.append(this.f6755d);
        stringBuffer.append("; geom = ");
        stringBuffer.append(this.f6756e);
        stringBuffer.append("; center = ");
        stringBuffer.append(this.f6757f);
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.f6754c);
        parcel.writeInt(this.f6755d);
        parcel.writeString(this.f6756e);
        parcel.writeValue(this.f6757f);
    }

    protected BuildingInfo(Parcel parcel) {
        this.f6754c = parcel.readFloat();
        this.f6755d = parcel.readInt();
        this.f6756e = parcel.readString();
        this.f6757f = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
    }

    public void a(LatLng latLng) {
        this.f6757f = latLng;
    }

    public void b(String str) {
        this.f6752a = str;
    }

    public void a(String str) {
        this.f6756e = str;
    }
}
