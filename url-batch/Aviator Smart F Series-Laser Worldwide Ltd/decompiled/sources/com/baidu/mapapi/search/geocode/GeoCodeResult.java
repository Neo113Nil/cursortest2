package com.baidu.mapapi.search.geocode;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.core.SearchResult;

/* loaded from: classes2.dex */
public class GeoCodeResult extends SearchResult {
    public static final Parcelable.Creator<GeoCodeResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private LatLng f6858a;

    /* renamed from: b, reason: collision with root package name */
    private String f6859b;

    /* renamed from: c, reason: collision with root package name */
    private int f6860c;

    /* renamed from: d, reason: collision with root package name */
    private int f6861d;

    /* renamed from: e, reason: collision with root package name */
    private String f6862e;

    static class a implements Parcelable.Creator<GeoCodeResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GeoCodeResult createFromParcel(Parcel parcel) {
            return new GeoCodeResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GeoCodeResult[] newArray(int i8) {
            return new GeoCodeResult[i8];
        }
    }

    public GeoCodeResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public String getAddress() {
        return this.f6859b;
    }

    public int getConfidence() {
        return this.f6861d;
    }

    public String getLevel() {
        return this.f6862e;
    }

    public LatLng getLocation() {
        return this.f6858a;
    }

    public int getPrecise() {
        return this.f6860c;
    }

    @Deprecated
    public void setAddress(String str) {
        this.f6859b = str;
    }

    public void setConfidence(int i8) {
        this.f6861d = i8;
    }

    public void setLevel(String str) {
        this.f6862e = str;
    }

    public void setLocation(LatLng latLng) {
        this.f6858a = latLng;
    }

    public void setPrecise(int i8) {
        this.f6860c = i8;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("GeoCodeResult: \n");
        stringBuffer.append("location = ");
        stringBuffer.append(this.f6858a);
        stringBuffer.append("; precise = ");
        stringBuffer.append(this.f6860c);
        stringBuffer.append("; confidence = ");
        stringBuffer.append(this.f6861d);
        stringBuffer.append("; level = ");
        stringBuffer.append(this.f6862e);
        return stringBuffer.toString();
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeValue(this.f6858a);
        parcel.writeString(this.f6859b);
        parcel.writeInt(this.f6860c);
        parcel.writeInt(this.f6861d);
        parcel.writeString(this.f6862e);
    }

    protected GeoCodeResult(Parcel parcel) {
        this.f6858a = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.f6859b = parcel.readString();
        this.f6860c = parcel.readInt();
        this.f6861d = parcel.readInt();
        this.f6862e = parcel.readString();
    }
}
