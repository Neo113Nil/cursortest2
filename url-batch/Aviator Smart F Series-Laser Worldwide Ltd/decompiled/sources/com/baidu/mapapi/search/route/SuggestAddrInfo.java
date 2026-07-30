package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.CityInfo;
import com.baidu.mapapi.search.core.PoiInfo;
import java.util.List;

/* loaded from: classes2.dex */
public class SuggestAddrInfo implements Parcelable {
    public static final Parcelable.Creator<SuggestAddrInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<PoiInfo> f7291a;

    /* renamed from: b, reason: collision with root package name */
    private List<PoiInfo> f7292b;

    /* renamed from: c, reason: collision with root package name */
    private List<List<PoiInfo>> f7293c;

    /* renamed from: d, reason: collision with root package name */
    private List<CityInfo> f7294d;

    /* renamed from: e, reason: collision with root package name */
    private List<CityInfo> f7295e;

    /* renamed from: f, reason: collision with root package name */
    private List<List<CityInfo>> f7296f;

    static class a implements Parcelable.Creator<SuggestAddrInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SuggestAddrInfo[] newArray(int i8) {
            return new SuggestAddrInfo[i8];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SuggestAddrInfo createFromParcel(Parcel parcel) {
            return new SuggestAddrInfo(parcel);
        }
    }

    public SuggestAddrInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<CityInfo> getSuggestEndCity() {
        return this.f7295e;
    }

    public List<PoiInfo> getSuggestEndNode() {
        return this.f7292b;
    }

    public List<CityInfo> getSuggestStartCity() {
        return this.f7294d;
    }

    public List<PoiInfo> getSuggestStartNode() {
        return this.f7291a;
    }

    public List<List<CityInfo>> getSuggestWpCity() {
        return this.f7296f;
    }

    public List<List<PoiInfo>> getSuggestWpNode() {
        return this.f7293c;
    }

    public void setSuggestEndCity(List<CityInfo> list) {
        this.f7295e = list;
    }

    public void setSuggestEndNode(List<PoiInfo> list) {
        this.f7292b = list;
    }

    public void setSuggestStartCity(List<CityInfo> list) {
        this.f7294d = list;
    }

    public void setSuggestStartNode(List<PoiInfo> list) {
        this.f7291a = list;
    }

    public void setSuggestWpCity(List<List<CityInfo>> list) {
        this.f7296f = list;
    }

    public void setSuggestWpNode(List<List<PoiInfo>> list) {
        this.f7293c = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeList(this.f7291a);
        parcel.writeList(this.f7292b);
        parcel.writeList(this.f7293c);
        parcel.writeList(this.f7294d);
        parcel.writeList(this.f7295e);
        parcel.writeList(this.f7296f);
    }

    SuggestAddrInfo(Parcel parcel) {
        this.f7291a = parcel.readArrayList(PoiInfo.class.getClassLoader());
        this.f7292b = parcel.readArrayList(PoiInfo.class.getClassLoader());
        this.f7293c = parcel.readArrayList(PoiInfo.class.getClassLoader());
        this.f7294d = parcel.readArrayList(CityInfo.class.getClassLoader());
        this.f7295e = parcel.readArrayList(CityInfo.class.getClassLoader());
        this.f7296f = parcel.readArrayList(CityInfo.class.getClassLoader());
    }
}
