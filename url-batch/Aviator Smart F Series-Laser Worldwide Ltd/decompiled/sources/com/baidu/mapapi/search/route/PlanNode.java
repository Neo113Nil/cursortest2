package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class PlanNode implements Parcelable {
    public static final Parcelable.Creator<PlanNode> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private LatLng f7281a;

    /* renamed from: b, reason: collision with root package name */
    private String f7282b;

    /* renamed from: c, reason: collision with root package name */
    private String f7283c;

    /* renamed from: d, reason: collision with root package name */
    private String f7284d;

    /* renamed from: e, reason: collision with root package name */
    private String f7285e;

    /* renamed from: f, reason: collision with root package name */
    private String f7286f;

    /* renamed from: g, reason: collision with root package name */
    private String f7287g;

    /* renamed from: h, reason: collision with root package name */
    private String f7288h;

    static class a implements Parcelable.Creator<PlanNode> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlanNode createFromParcel(Parcel parcel) {
            return new PlanNode(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlanNode[] newArray(int i8) {
            return new PlanNode[i8];
        }
    }

    PlanNode(LatLng latLng, String str, String str2, String str3) {
        this.f7282b = null;
        this.f7285e = null;
        this.f7286f = null;
        this.f7287g = null;
        this.f7288h = null;
        this.f7281a = latLng;
        this.f7284d = str;
        this.f7283c = str2;
        if (str2 != null) {
            this.f7282b = str2;
        }
        if (str != null) {
            this.f7282b = str;
        }
        this.f7285e = str3;
    }

    public static PlanNode withCityCodeAndLocation(String str, LatLng latLng) {
        return new PlanNode(latLng, null, str, null);
    }

    public static PlanNode withCityCodeAndPlaceName(int i8, String str) {
        return new PlanNode(null, null, String.valueOf(i8), str);
    }

    public static PlanNode withCityCodeAndPlaceNameAndPoiId(int i8, String str, String str2) {
        return new PlanNode(null, null, String.valueOf(i8), str, str2);
    }

    public static PlanNode withCityNameAndPlaceName(String str, String str2) {
        return new PlanNode(null, str, null, str2);
    }

    public static PlanNode withCityNameAndPlaceNameAndPoiId(String str, String str2, String str3) {
        return new PlanNode(null, str, null, str2, str3);
    }

    public static PlanNode withLocation(LatLng latLng) {
        return new PlanNode(latLng, null, null, null);
    }

    public static PlanNode withLocationAndFloorAndBid(LatLng latLng, String str, String str2) {
        return new PlanNode(latLng, null, null, null, str, str2);
    }

    public static PlanNode withLocationAndPoiId(LatLng latLng, String str) {
        return new PlanNode(latLng, null, null, null, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBid() {
        return this.f7287g;
    }

    public String getCity() {
        return this.f7282b;
    }

    public String getCityCode() {
        return this.f7283c;
    }

    public String getCityName() {
        return this.f7284d;
    }

    public String getFloor() {
        return this.f7288h;
    }

    public LatLng getLocation() {
        return this.f7281a;
    }

    public String getName() {
        return this.f7285e;
    }

    public String getPoiId() {
        return this.f7286f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeValue(this.f7281a);
        parcel.writeString(this.f7282b);
        parcel.writeString(this.f7285e);
    }

    PlanNode(LatLng latLng, String str, String str2, String str3, String str4, String str5) {
        this.f7282b = null;
        this.f7285e = null;
        this.f7286f = null;
        this.f7287g = null;
        this.f7288h = null;
        this.f7281a = latLng;
        this.f7284d = str;
        this.f7283c = str2;
        if (str2 != null) {
            this.f7282b = str2;
        }
        if (str != null) {
            this.f7282b = str;
        }
        this.f7285e = str3;
        this.f7288h = str4;
        this.f7287g = str5;
    }

    PlanNode(LatLng latLng, String str, String str2, String str3, String str4) {
        this.f7282b = null;
        this.f7285e = null;
        this.f7286f = null;
        this.f7287g = null;
        this.f7288h = null;
        this.f7281a = latLng;
        this.f7284d = str;
        this.f7283c = str2;
        if (str2 != null) {
            this.f7282b = str2;
        }
        if (str != null) {
            this.f7282b = str;
        }
        this.f7285e = str3;
        this.f7286f = str4;
    }

    protected PlanNode(Parcel parcel) {
        this.f7281a = null;
        this.f7282b = null;
        this.f7283c = null;
        this.f7284d = null;
        this.f7285e = null;
        this.f7286f = null;
        this.f7287g = null;
        this.f7288h = null;
        this.f7281a = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.f7282b = parcel.readString();
        this.f7285e = parcel.readString();
    }
}
