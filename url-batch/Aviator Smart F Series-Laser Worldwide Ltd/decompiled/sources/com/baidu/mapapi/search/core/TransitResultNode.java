package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class TransitResultNode implements Parcelable {
    public static final Parcelable.Creator<TransitResultNode> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f6843a;

    /* renamed from: b, reason: collision with root package name */
    private String f6844b;

    /* renamed from: c, reason: collision with root package name */
    private LatLng f6845c;

    /* renamed from: d, reason: collision with root package name */
    private String f6846d;

    static class a implements Parcelable.Creator<TransitResultNode> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransitResultNode createFromParcel(Parcel parcel) {
            return new TransitResultNode(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TransitResultNode[] newArray(int i8) {
            return new TransitResultNode[i8];
        }
    }

    public TransitResultNode(int i8, String str, LatLng latLng, String str2) {
        this.f6843a = i8;
        this.f6844b = str;
        this.f6845c = latLng;
        this.f6846d = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCityId() {
        return this.f6843a;
    }

    public String getCityName() {
        return this.f6844b;
    }

    public LatLng getLocation() {
        return this.f6845c;
    }

    public String getSearchWord() {
        return this.f6846d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f6843a);
        parcel.writeString(this.f6844b);
        parcel.writeValue(this.f6845c);
        parcel.writeString(this.f6846d);
    }

    protected TransitResultNode(Parcel parcel) {
        this.f6844b = null;
        this.f6845c = null;
        this.f6846d = null;
        this.f6843a = parcel.readInt();
        this.f6844b = parcel.readString();
        this.f6845c = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.f6846d = parcel.readString();
    }
}
