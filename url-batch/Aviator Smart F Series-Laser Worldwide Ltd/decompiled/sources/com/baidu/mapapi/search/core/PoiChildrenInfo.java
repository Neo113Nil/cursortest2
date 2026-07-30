package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class PoiChildrenInfo implements Parcelable {
    public static final Parcelable.Creator<PoiChildrenInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f6775a;

    /* renamed from: b, reason: collision with root package name */
    private String f6776b;

    /* renamed from: c, reason: collision with root package name */
    private String f6777c;

    /* renamed from: d, reason: collision with root package name */
    private String f6778d;

    /* renamed from: e, reason: collision with root package name */
    private LatLng f6779e;

    /* renamed from: f, reason: collision with root package name */
    private String f6780f;

    static class a implements Parcelable.Creator<PoiChildrenInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiChildrenInfo createFromParcel(Parcel parcel) {
            return new PoiChildrenInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PoiChildrenInfo[] newArray(int i8) {
            return new PoiChildrenInfo[i8];
        }
    }

    public PoiChildrenInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.f6780f;
    }

    public LatLng getLocation() {
        return this.f6779e;
    }

    public String getName() {
        return this.f6776b;
    }

    public String getShowName() {
        return this.f6777c;
    }

    public String getTag() {
        return this.f6778d;
    }

    public String getUid() {
        return this.f6775a;
    }

    public void setAddress(String str) {
        this.f6780f = str;
    }

    public void setLocation(LatLng latLng) {
        this.f6779e = latLng;
    }

    public void setName(String str) {
        this.f6776b = str;
    }

    public void setShowName(String str) {
        this.f6777c = str;
    }

    public void setTag(String str) {
        this.f6778d = str;
    }

    public void setUid(String str) {
        this.f6775a = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("PoiChildrenInfo: ");
        stringBuffer.append("uid = ");
        stringBuffer.append(this.f6775a);
        stringBuffer.append("; name = ");
        stringBuffer.append(this.f6776b);
        stringBuffer.append("; showName = ");
        stringBuffer.append(this.f6777c);
        stringBuffer.append("; tag = ");
        stringBuffer.append(this.f6778d);
        stringBuffer.append("; location = ");
        LatLng latLng = this.f6779e;
        if (latLng != null) {
            stringBuffer.append(latLng.toString());
        } else {
            stringBuffer.append("null");
        }
        stringBuffer.append("; address = ");
        stringBuffer.append(this.f6780f);
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f6775a);
        parcel.writeString(this.f6776b);
        parcel.writeString(this.f6777c);
        parcel.writeString(this.f6778d);
        parcel.writeParcelable(this.f6779e, i8);
        parcel.writeString(this.f6780f);
    }

    protected PoiChildrenInfo(Parcel parcel) {
        this.f6775a = parcel.readString();
        this.f6776b = parcel.readString();
        this.f6777c = parcel.readString();
        this.f6778d = parcel.readString();
        this.f6779e = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f6780f = parcel.readString();
    }
}
