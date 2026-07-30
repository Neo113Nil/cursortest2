package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class WalkingRouteResult extends SearchResult {
    public static final Parcelable.Creator<WalkingRouteResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<WalkingRouteLine> f7316a;

    /* renamed from: b, reason: collision with root package name */
    private TaxiInfo f7317b;

    /* renamed from: c, reason: collision with root package name */
    private SuggestAddrInfo f7318c;

    static class a implements Parcelable.Creator<WalkingRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WalkingRouteResult createFromParcel(Parcel parcel) {
            return new WalkingRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WalkingRouteResult[] newArray(int i8) {
            return new WalkingRouteResult[i8];
        }
    }

    public WalkingRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<WalkingRouteLine> getRouteLines() {
        return this.f7316a;
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
        return this.f7318c;
    }

    public TaxiInfo getTaxiInfo() {
        return this.f7317b;
    }

    public void setRouteLines(List<WalkingRouteLine> list) {
        this.f7316a = list;
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
        this.f7318c = suggestAddrInfo;
    }

    public void setTaxiInfo(TaxiInfo taxiInfo) {
        this.f7317b = taxiInfo;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeList(this.f7316a);
        parcel.writeParcelable(this.f7317b, 1);
        parcel.writeParcelable(this.f7318c, 1);
    }

    protected WalkingRouteResult(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f7316a = arrayList;
        parcel.readList(arrayList, WalkingRouteLine.class.getClassLoader());
        this.f7317b = (TaxiInfo) parcel.readParcelable(TaxiInfo.class.getClassLoader());
        this.f7318c = (SuggestAddrInfo) parcel.readParcelable(SuggestAddrInfo.class.getClassLoader());
    }
}
