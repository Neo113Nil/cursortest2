package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class DrivingRouteResult extends SearchResult {
    public static final Parcelable.Creator<DrivingRouteResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<DrivingRouteLine> f7232a;

    /* renamed from: b, reason: collision with root package name */
    private List<TaxiInfo> f7233b;

    /* renamed from: c, reason: collision with root package name */
    private TaxiInfo f7234c;

    /* renamed from: d, reason: collision with root package name */
    private SuggestAddrInfo f7235d;

    static class a implements Parcelable.Creator<DrivingRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrivingRouteResult createFromParcel(Parcel parcel) {
            return new DrivingRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrivingRouteResult[] newArray(int i8) {
            return new DrivingRouteResult[i8];
        }
    }

    public DrivingRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DrivingRouteLine> getRouteLines() {
        return this.f7232a;
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
        return this.f7235d;
    }

    @Deprecated
    public TaxiInfo getTaxiInfo() {
        return this.f7234c;
    }

    public List<TaxiInfo> getTaxiInfos() {
        return this.f7233b;
    }

    public void setRouteLines(List<DrivingRouteLine> list) {
        this.f7232a = list;
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
        this.f7235d = suggestAddrInfo;
    }

    public void setTaxiInfos(List<TaxiInfo> list) {
        this.f7233b = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeTypedList(this.f7232a);
        parcel.writeTypedList(this.f7233b);
        parcel.writeParcelable(this.f7235d, 1);
    }

    protected DrivingRouteResult(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f7232a = arrayList;
        parcel.readTypedList(arrayList, DrivingRouteLine.CREATOR);
        ArrayList arrayList2 = new ArrayList();
        this.f7233b = arrayList2;
        parcel.readTypedList(arrayList2, TaxiInfo.CREATOR);
        this.f7235d = (SuggestAddrInfo) parcel.readParcelable(SuggestAddrInfo.class.getClassLoader());
    }
}
