package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public class BusInfo extends TransitBaseInfo {
    public static final Parcelable.Creator<BusInfo> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private int f6758f;

    /* renamed from: g, reason: collision with root package name */
    private int f6759g;

    /* renamed from: h, reason: collision with root package name */
    private List<RouteNode> f6760h;

    /* renamed from: i, reason: collision with root package name */
    private String f6761i;

    /* renamed from: j, reason: collision with root package name */
    private String f6762j;

    /* renamed from: k, reason: collision with root package name */
    private String f6763k;

    /* renamed from: l, reason: collision with root package name */
    private String f6764l;

    static class a implements Parcelable.Creator<BusInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BusInfo createFromParcel(Parcel parcel) {
            return new BusInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BusInfo[] newArray(int i8) {
            return new BusInfo[i8];
        }
    }

    public BusInfo() {
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDirectText() {
        return this.f6764l;
    }

    public String getEndUid() {
        return this.f6762j;
    }

    public String getLineUid() {
        return this.f6763k;
    }

    public List<RouteNode> getPassStopInfoList() {
        return this.f6760h;
    }

    public String getStartUid() {
        return this.f6761i;
    }

    public int getStopNum() {
        return this.f6759g;
    }

    public int getType() {
        return this.f6758f;
    }

    public void setDirectText(String str) {
        this.f6764l = str;
    }

    public void setEndUid(String str) {
        this.f6762j = str;
    }

    public void setLineUid(String str) {
        this.f6763k = str;
    }

    public void setPassStopInfoList(List<RouteNode> list) {
        this.f6760h = list;
    }

    public void setStartUid(String str) {
        this.f6761i = str;
    }

    public void setStopNum(int i8) {
        this.f6759g = i8;
    }

    public void setType(int i8) {
        this.f6758f = i8;
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeInt(this.f6758f);
        parcel.writeInt(this.f6759g);
        parcel.writeTypedList(this.f6760h);
        parcel.writeString(this.f6761i);
        parcel.writeString(this.f6762j);
        parcel.writeString(this.f6763k);
        parcel.writeString(this.f6764l);
    }

    protected BusInfo(Parcel parcel) {
        super(parcel);
        this.f6758f = parcel.readInt();
        this.f6759g = parcel.readInt();
        this.f6760h = parcel.createTypedArrayList(RouteNode.CREATOR);
        this.f6761i = parcel.readString();
        this.f6762j = parcel.readString();
        this.f6763k = parcel.readString();
        this.f6764l = parcel.readString();
    }
}
