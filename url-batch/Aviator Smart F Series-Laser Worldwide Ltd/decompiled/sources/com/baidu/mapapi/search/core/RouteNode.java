package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class RouteNode implements Parcelable {
    public static final Parcelable.Creator<RouteNode> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f6823a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f6824b;

    /* renamed from: c, reason: collision with root package name */
    private String f6825c;

    static class a implements Parcelable.Creator<RouteNode> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RouteNode createFromParcel(Parcel parcel) {
            return new RouteNode(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RouteNode[] newArray(int i8) {
            return new RouteNode[i8];
        }
    }

    public RouteNode() {
    }

    public static RouteNode location(LatLng latLng) {
        RouteNode routeNode = new RouteNode();
        routeNode.setLocation(latLng);
        return routeNode;
    }

    public static RouteNode titleAndLocation(String str, LatLng latLng) {
        RouteNode routeNode = new RouteNode();
        routeNode.setTitle(str);
        routeNode.setLocation(latLng);
        return routeNode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLng getLocation() {
        return this.f6824b;
    }

    public String getTitle() {
        return this.f6823a;
    }

    public String getUid() {
        return this.f6825c;
    }

    public void setLocation(LatLng latLng) {
        this.f6824b = latLng;
    }

    public void setTitle(String str) {
        this.f6823a = str;
    }

    public void setUid(String str) {
        this.f6825c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f6823a);
        parcel.writeValue(this.f6824b);
        parcel.writeString(this.f6825c);
    }

    protected RouteNode(Parcel parcel) {
        this.f6823a = parcel.readString();
        this.f6824b = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
        this.f6825c = parcel.readString();
    }
}
